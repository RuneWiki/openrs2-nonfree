import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public abstract class Class100_Sub1 extends Class100 {

	@OriginalMember(owner = "client!wu", name = "le", descriptor = "[Lclient!eia;")
	public static final Class81[] aClass81Array3 = new Class81[5];

	@OriginalMember(owner = "client!wu", name = "oe", descriptor = "[I")
	public static final int[] anIntArray429;

	@OriginalMember(owner = "client!wu", name = "ne", descriptor = "[I")
	public static final int[] anIntArray428;

	@OriginalMember(owner = "client!wu", name = "D", descriptor = "Lclient!pba;")
	protected Class249 aClass249_7;

	@OriginalMember(owner = "client!wu", name = "T", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable5;

	@OriginalMember(owner = "client!wu", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!wu", name = "Rc", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!wu", name = "Id", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!wu", name = "Xd", descriptor = "I")
	public int anInt7119;

	@OriginalMember(owner = "client!wu", name = "ce", descriptor = "I")
	protected int anInt7122;

	@OriginalMember(owner = "client!wu", name = "de", descriptor = "I")
	public int anInt7123;

	@OriginalMember(owner = "client!wu", name = "re", descriptor = "I")
	public int anInt7125;

	@OriginalMember(owner = "client!wu", name = "se", descriptor = "I")
	protected int anInt7126;

	@OriginalMember(owner = "client!wu", name = "ue", descriptor = "[Lclient!pha;")
	protected Class256[] aClass256Array5;

	@OriginalMember(owner = "client!wu", name = "Ce", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!wu", name = "Fe", descriptor = "[Lclient!raa;")
	protected Class6_Sub1[] aClass6_Sub1Array3;

	@OriginalMember(owner = "client!wu", name = "Je", descriptor = "Z")
	public boolean aBoolean465;

	@OriginalMember(owner = "client!wu", name = "Ne", descriptor = "I")
	private int anInt7135;

	@OriginalMember(owner = "client!wu", name = "Qe", descriptor = "I")
	protected int anInt7136;

	@OriginalMember(owner = "client!wu", name = "Ve", descriptor = "F")
	private float aFloat128;

	@OriginalMember(owner = "client!wu", name = "We", descriptor = "Lclient!bca;")
	public Interface1 anInterface1_3;

	@OriginalMember(owner = "client!wu", name = "cf", descriptor = "[Lclient!wl;")
	protected Class377[] aClass377Array3;

	@OriginalMember(owner = "client!wu", name = "df", descriptor = "[Lclient!bca;")
	private Interface1[] anInterface1Array3;

	@OriginalMember(owner = "client!wu", name = "pf", descriptor = "I")
	protected int anInt7143;

	@OriginalMember(owner = "client!wu", name = "tf", descriptor = "Z")
	public boolean aBoolean474;

	@OriginalMember(owner = "client!wu", name = "vf", descriptor = "Z")
	protected boolean aBoolean476;

	@OriginalMember(owner = "client!wu", name = "yf", descriptor = "Z")
	protected boolean aBoolean478;

	@OriginalMember(owner = "client!wu", name = "zf", descriptor = "I")
	public int anInt7145;

	@OriginalMember(owner = "client!wu", name = "Df", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!wu", name = "Ef", descriptor = "Z")
	public boolean aBoolean479;

	@OriginalMember(owner = "client!wu", name = "Gf", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!wu", name = "Pf", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!wu", name = "Qf", descriptor = "I")
	public int anInt7153;

	@OriginalMember(owner = "client!wu", name = "Tf", descriptor = "Lclient!nia;")
	private Class7 aClass7_3;

	@OriginalMember(owner = "client!wu", name = "Uf", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!wu", name = "Vf", descriptor = "[Lclient!pha;")
	protected Class256[] aClass256Array6;

	@OriginalMember(owner = "client!wu", name = "Xf", descriptor = "I")
	public int anInt7157;

	@OriginalMember(owner = "client!wu", name = "Yf", descriptor = "[Lclient!jc;")
	protected Class154_Sub2[] aClass154_Sub2Array3;

	@OriginalMember(owner = "client!wu", name = "ag", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!wu", name = "hg", descriptor = "Lclient!kea;")
	private Class57_Sub2 aClass57_Sub2_3;

	@OriginalMember(owner = "client!wu", name = "ig", descriptor = "F")
	private float aFloat140;

	@OriginalMember(owner = "client!wu", name = "jg", descriptor = "I")
	private int anInt7160;

	@OriginalMember(owner = "client!wu", name = "lg", descriptor = "I")
	protected int anInt7162;

	@OriginalMember(owner = "client!wu", name = "ng", descriptor = "Lclient!bv;")
	private Class43 aClass43_3;

	@OriginalMember(owner = "client!wu", name = "pg", descriptor = "Lclient!ic;")
	public Class24_Sub2 aClass24_Sub2_21;

	@OriginalMember(owner = "client!wu", name = "qg", descriptor = "Lclient!sr;")
	public Class293 aClass293_16;

	@OriginalMember(owner = "client!wu", name = "rg", descriptor = "Lclient!ic;")
	public Class24_Sub2 aClass24_Sub2_22;

	@OriginalMember(owner = "client!wu", name = "sg", descriptor = "Lclient!ic;")
	public Class24_Sub2 aClass24_Sub2_23;

	@OriginalMember(owner = "client!wu", name = "tg", descriptor = "Lclient!ll;")
	private Interface17 anInterface17_14;

	@OriginalMember(owner = "client!wu", name = "ug", descriptor = "Lclient!jf;")
	private Interface11 anInterface11_7;

	@OriginalMember(owner = "client!wu", name = "vg", descriptor = "Lclient!ic;")
	public Class24_Sub2 aClass24_Sub2_24;

	@OriginalMember(owner = "client!wu", name = "wg", descriptor = "Lclient!sr;")
	public Class293 aClass293_17;

	@OriginalMember(owner = "client!wu", name = "xg", descriptor = "Lclient!sr;")
	public Class293 aClass293_18;

	@OriginalMember(owner = "client!wu", name = "yg", descriptor = "Lclient!ll;")
	private Interface17 anInterface17_15;

	@OriginalMember(owner = "client!wu", name = "zg", descriptor = "Lclient!ic;")
	public Class24_Sub2 aClass24_Sub2_25;

	@OriginalMember(owner = "client!wu", name = "Ag", descriptor = "Lclient!ic;")
	public Class24_Sub2 aClass24_Sub2_26;

	@OriginalMember(owner = "client!wu", name = "Bg", descriptor = "Lclient!ll;")
	private Interface17 anInterface17_16;

	@OriginalMember(owner = "client!wu", name = "Cg", descriptor = "Lclient!sr;")
	public Class293 aClass293_19;

	@OriginalMember(owner = "client!wu", name = "Dg", descriptor = "Lclient!ic;")
	public Class24_Sub2 aClass24_Sub2_27;

	@OriginalMember(owner = "client!wu", name = "Eg", descriptor = "Lclient!ic;")
	public Class24_Sub2 aClass24_Sub2_28;

	@OriginalMember(owner = "client!wu", name = "Fg", descriptor = "Lclient!sr;")
	private Class293 aClass293_20;

	@OriginalMember(owner = "client!wu", name = "Gg", descriptor = "Lclient!ic;")
	public Class24_Sub2 aClass24_Sub2_29;

	@OriginalMember(owner = "client!wu", name = "Hg", descriptor = "Lclient!sr;")
	private Class293 aClass293_21;

	@OriginalMember(owner = "client!wu", name = "Jg", descriptor = "Lclient!ic;")
	public Class24_Sub2 aClass24_Sub2_30;

	@OriginalMember(owner = "client!wu", name = "Kg", descriptor = "Lclient!sr;")
	private Class293 aClass293_22;

	@OriginalMember(owner = "client!wu", name = "Lg", descriptor = "I")
	private int anInt7163;

	@OriginalMember(owner = "client!wu", name = "Mg", descriptor = "Z")
	protected boolean aBoolean483;

	@OriginalMember(owner = "client!wu", name = "ad", descriptor = "Lclient!ada;")
	private final Class8 aClass8_41 = new Class8();

	@OriginalMember(owner = "client!wu", name = "ee", descriptor = "Z")
	protected boolean aBoolean462 = true;

	@OriginalMember(owner = "client!wu", name = "be", descriptor = "Lclient!jc;")
	protected final Class154_Sub2 aClass154_Sub2_15 = new Class154_Sub2();

	@OriginalMember(owner = "client!wu", name = "he", descriptor = "Lclient!jc;")
	public Class154_Sub2 aClass154_Sub2_16 = new Class154_Sub2();

	@OriginalMember(owner = "client!wu", name = "ie", descriptor = "Lclient!jc;")
	public final Class154_Sub2 aClass154_Sub2_17 = new Class154_Sub2();

	@OriginalMember(owner = "client!wu", name = "ke", descriptor = "Lclient!jc;")
	protected final Class154_Sub2 aClass154_Sub2_18 = new Class154_Sub2();

	@OriginalMember(owner = "client!wu", name = "me", descriptor = "Lclient!jc;")
	private final Class154_Sub2 aClass154_Sub2_19 = new Class154_Sub2();

	@OriginalMember(owner = "client!wu", name = "pe", descriptor = "Lclient!jc;")
	private final Class154_Sub2 aClass154_Sub2_20 = new Class154_Sub2();

	@OriginalMember(owner = "client!wu", name = "qe", descriptor = "I")
	public int anInt7124 = 3;

	@OriginalMember(owner = "client!wu", name = "Ge", descriptor = "I")
	public int anInt7131 = 128;

	@OriginalMember(owner = "client!wu", name = "ze", descriptor = "F")
	public float aFloat124 = 3584.0F;

	@OriginalMember(owner = "client!wu", name = "He", descriptor = "Z")
	protected boolean aBoolean463 = false;

	@OriginalMember(owner = "client!wu", name = "Pe", descriptor = "F")
	public float aFloat127 = 1.0F;

	@OriginalMember(owner = "client!wu", name = "Se", descriptor = "[Lclient!nia;")
	private final Class7[] aClass7Array3 = new Class7[10];

	@OriginalMember(owner = "client!wu", name = "Oe", descriptor = "F")
	public float aFloat126 = 1.0F;

	@OriginalMember(owner = "client!wu", name = "Ae", descriptor = "I")
	public int anInt7129 = 512;

	@OriginalMember(owner = "client!wu", name = "we", descriptor = "Lclient!jg;")
	protected Class160 aClass160_7 = Static287.aClass160_8;

	@OriginalMember(owner = "client!wu", name = "Ke", descriptor = "I")
	public int anInt7132 = 512;

	@OriginalMember(owner = "client!wu", name = "Ue", descriptor = "Z")
	private boolean aBoolean467 = false;

	@OriginalMember(owner = "client!wu", name = "Ze", descriptor = "Z")
	private boolean aBoolean469 = false;

	@OriginalMember(owner = "client!wu", name = "ve", descriptor = "[F")
	private final float[] aFloatArray56 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!wu", name = "Re", descriptor = "Z")
	protected boolean aBoolean466 = false;

	@OriginalMember(owner = "client!wu", name = "kf", descriptor = "I")
	protected int anInt7140 = 3584;

	@OriginalMember(owner = "client!wu", name = "hf", descriptor = "Z")
	protected boolean aBoolean470 = false;

	@OriginalMember(owner = "client!wu", name = "xe", descriptor = "I")
	protected int anInt7127 = 0;

	@OriginalMember(owner = "client!wu", name = "ff", descriptor = "[F")
	private final float[] aFloatArray58 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wu", name = "of", descriptor = "I")
	public int anInt7142 = 50;

	@OriginalMember(owner = "client!wu", name = "Ie", descriptor = "Z")
	protected boolean aBoolean464 = false;

	@OriginalMember(owner = "client!wu", name = "mf", descriptor = "[F")
	public final float[] aFloatArray59 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!wu", name = "uf", descriptor = "Z")
	protected boolean aBoolean475 = true;

	@OriginalMember(owner = "client!wu", name = "qf", descriptor = "F")
	public float aFloat130 = 1.0F;

	@OriginalMember(owner = "client!wu", name = "ye", descriptor = "I")
	private int anInt7128 = 0;

	@OriginalMember(owner = "client!wu", name = "wf", descriptor = "Z")
	protected boolean aBoolean477 = true;

	@OriginalMember(owner = "client!wu", name = "Xe", descriptor = "I")
	private int anInt7138 = 16777215;

	@OriginalMember(owner = "client!wu", name = "Le", descriptor = "I")
	public int anInt7133 = 0;

	@OriginalMember(owner = "client!wu", name = "Be", descriptor = "I")
	private int anInt7130 = 0;

	@OriginalMember(owner = "client!wu", name = "af", descriptor = "F")
	private float aFloat129 = 1.0F;

	@OriginalMember(owner = "client!wu", name = "Me", descriptor = "I")
	private int anInt7134 = -1;

	@OriginalMember(owner = "client!wu", name = "Jf", descriptor = "I")
	protected final int anInt7149 = 0;

	@OriginalMember(owner = "client!wu", name = "xf", descriptor = "I")
	private int anInt7144 = -1;

	@OriginalMember(owner = "client!wu", name = "rf", descriptor = "Z")
	protected boolean aBoolean473 = true;

	@OriginalMember(owner = "client!wu", name = "Te", descriptor = "I")
	protected int anInt7137 = 0;

	@OriginalMember(owner = "client!wu", name = "Bf", descriptor = "I")
	protected final int anInt7146 = 0;

	@OriginalMember(owner = "client!wu", name = "Sf", descriptor = "I")
	protected int anInt7155 = 0;

	@OriginalMember(owner = "client!wu", name = "lf", descriptor = "I")
	public int anInt7141 = 8;

	@OriginalMember(owner = "client!wu", name = "nf", descriptor = "Z")
	private boolean aBoolean472 = false;

	@OriginalMember(owner = "client!wu", name = "If", descriptor = "I")
	public int anInt7148 = -1;

	@OriginalMember(owner = "client!wu", name = "Af", descriptor = "F")
	public float aFloat132 = -1.0F;

	@OriginalMember(owner = "client!wu", name = "Zf", descriptor = "I")
	public int anInt7158 = -1;

	@OriginalMember(owner = "client!wu", name = "gf", descriptor = "Lclient!wq;")
	protected Class381 aClass381_9 = Static475.aClass381_11;

	@OriginalMember(owner = "client!wu", name = "Lf", descriptor = "I")
	private int anInt7151 = 1;

	@OriginalMember(owner = "client!wu", name = "bf", descriptor = "I")
	public int bf = 0;

	@OriginalMember(owner = "client!wu", name = "Ye", descriptor = "Z")
	private boolean aBoolean468 = false;

	@OriginalMember(owner = "client!wu", name = "Ee", descriptor = "[F")
	private final float[] aFloatArray57 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wu", name = "bg", descriptor = "F")
	public float aFloat138 = 1.0F;

	@OriginalMember(owner = "client!wu", name = "Kf", descriptor = "I")
	private int anInt7150 = -1;

	@OriginalMember(owner = "client!wu", name = "Ff", descriptor = "[F")
	public final float[] aFloatArray60 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!wu", name = "jf", descriptor = "Z")
	protected boolean aBoolean471 = true;

	@OriginalMember(owner = "client!wu", name = "Nf", descriptor = "[F")
	private final float[] aFloatArray62 = new float[16];

	@OriginalMember(owner = "client!wu", name = "Of", descriptor = "I")
	public int anInt7152 = 0;

	@OriginalMember(owner = "client!wu", name = "Wf", descriptor = "I")
	private int anInt7156 = 0;

	@OriginalMember(owner = "client!wu", name = "sf", descriptor = "F")
	public float aFloat131 = 3584.0F;

	@OriginalMember(owner = "client!wu", name = "ef", descriptor = "I")
	private int anInt7139 = 0;

	@OriginalMember(owner = "client!wu", name = "dg", descriptor = "[F")
	private final float[] aFloatArray63 = new float[16];

	@OriginalMember(owner = "client!wu", name = "Mf", descriptor = "Z")
	private boolean aBoolean480 = false;

	@OriginalMember(owner = "client!wu", name = "gg", descriptor = "F")
	public float aFloat139 = -1.0F;

	@OriginalMember(owner = "client!wu", name = "cg", descriptor = "Z")
	private boolean aBoolean481 = false;

	@OriginalMember(owner = "client!wu", name = "Hf", descriptor = "[F")
	private final float[] aFloatArray61 = new float[16];

	@OriginalMember(owner = "client!wu", name = "fg", descriptor = "[F")
	protected float[] aFloatArray64 = this.aFloatArray56;

	@OriginalMember(owner = "client!wu", name = "eg", descriptor = "I")
	protected int anInt7159 = 0;

	@OriginalMember(owner = "client!wu", name = "Cf", descriptor = "I")
	protected int anInt7147 = 0;

	@OriginalMember(owner = "client!wu", name = "mg", descriptor = "Z")
	protected boolean aBoolean482 = true;

	@OriginalMember(owner = "client!wu", name = "De", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream4 = new Stream();

	@OriginalMember(owner = "client!wu", name = "Ig", descriptor = "Lclient!jc;")
	private final Class154_Sub2 aClass154_Sub2_21 = new Class154_Sub2();

	@OriginalMember(owner = "client!wu", name = "Tc", descriptor = "Ljava/lang/Object;")
	protected final Object anObject15;

	@OriginalMember(owner = "client!wu", name = "Kd", descriptor = "Ljava/lang/Object;")
	private Object anObject16;

	@OriginalMember(owner = "client!wu", name = "I", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas7;

	@OriginalMember(owner = "client!wu", name = "ld", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!wu", name = "kg", descriptor = "I")
	protected final int anInt7161;

	@OriginalMember(owner = "client!wu", name = "hb", descriptor = "Lclient!vd;")
	protected final Class353 aClass353_62;

	@OriginalMember(owner = "client!wu", name = "ab", descriptor = "I")
	private int anInt6974;

	@OriginalMember(owner = "client!wu", name = "td", descriptor = "I")
	public int anInt7091;

	@OriginalMember(owner = "client!wu", name = "Rf", descriptor = "I")
	public final int anInt7154;

	@OriginalMember(owner = "client!wu", name = "G", descriptor = "I")
	private int anInt6956;

	@OriginalMember(owner = "client!wu", name = "Cb", descriptor = "I")
	public int anInt7000;

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!wu", name = "te", descriptor = "Lclient!eo;")
	private final Class84 aClass84_3;

	static {
		for (@Pc(23) int local23 = 0; local23 < aClass81Array3.length; local23++) {
			aClass81Array3[local23] = new Class81();
		}
		anIntArray429 = new int[16384];
		anIntArray428 = new int[16384];
		@Pc(47) double local47 = 3.834951969714103E-4D;
		for (@Pc(49) int local49 = 0; local49 < 16384; local49++) {
			anIntArray428[local49] = (int) (Math.sin(local47 * (double) local49) * 16384.0D);
			anIntArray429[local49] = (int) (Math.cos((double) local49 * local47) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!vd;II)V")
	protected Class100_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class353 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anObject16 = this.anObject15 = arg1;
			this.aCanvas8 = this.aCanvas7 = arg0;
			this.anInt7161 = arg4;
			this.aClass353_62 = arg3;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt7091 = this.anInt6974 = local307.height;
			this.anInt7154 = arg5;
			this.anInt7000 = this.anInt6956 = local307.width;
			Static125.method9040(false, true);
			if (super.anInterface4_12 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt7154);
				this.aClass84_3 = null;
			} else {
				this.aClass84_3 = new Class84(this, super.anInterface4_12);
				this.aNativeInterface3 = new NativeInterface(super.anInterface4_12.method896(), this.anInt7154);
				for (@Pc(364) int local364 = 0; local364 < super.anInterface4_12.method896(); local364++) {
					@Pc(372) Class325 local372 = super.anInterface4_12.method895(local364);
					if (local372 != null) {
						this.aNativeInterface3.initTextureMetrics(local364, local372.aByte113, local372.aByte117);
					}
				}
			}
		} catch (@Pc(391) Throwable local391) {
			local391.printStackTrace();
			this.method8789();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)[F")
	public final float[] method6029() {
		return this.aFloatArray56;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!wl;I)V")
	public final void method6030(@OriginalArg(0) Class377 arg0) {
		this.aClass377Array3[this.anInt7127] = arg0;
		this.method6074();
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)V")
	protected abstract void method6031();

	@OriginalMember(owner = "client!wu", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface3 local9 = local6.anInterface3_6;
		this.method6045();
		this.method6033(local9);
		this.method6144(1);
		this.method6039(Static436.aClass256_4, Static436.aClass256_4);
		this.method6068(0, Static456.aClass187_2);
		this.method6154(arg0);
		this.aClass154_Sub2_15.method4517((float) this.anInt7000, 0.0F, (float) this.anInt7091);
		this.method6145();
		this.aClass154_Sub2Array3[0].method4517(local9.method7846((float) this.anInt7000), 1.0F, local9.method7845((float) this.anInt7091));
		this.aClass154_Sub2Array3[0].method4522(local9.method7846((float) -arg2), local9.method7845((float) -arg3), 0.0F);
		this.aClass377Array3[0] = Static104.aClass377_2;
		this.method6074();
		this.method6161();
		this.method6149();
		this.method6068(0, Static622.aClass187_4);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(FI)V")
	public final void method6032(@OriginalArg(0) float arg0) {
		if (this.aFloat129 != arg0) {
			this.aFloat129 = arg0;
			this.method6140();
		}
	}

	@OriginalMember(owner = "client!wu", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt7163;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!bca;I)V")
	public final void method6033(@OriginalArg(0) Interface1 arg0) {
		if (arg0 == this.anInterface1Array3[this.anInt7127]) {
			return;
		}
		this.anInterface1Array3[this.anInt7127] = arg0;
		if (arg0 == null) {
			this.method6120();
		} else {
			arg0.method7826();
		}
		this.anInt7160 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
	protected abstract void method6034(@OriginalArg(1) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "(I)V")
	private void method6035() {
		this.aBoolean472 = false;
		if (Static148.aClass160_1 == this.aClass160_7) {
			this.method6046();
			this.method6139();
		}
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(B)V")
	protected void method6036() {
		this.anInt7143 = this.anInt7126;
		this.anInt7126 = 0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BZ)V")
	public final void method6037(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean463) {
			this.aBoolean463 = arg0;
			this.method6160();
			this.anInt7160 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "(I)Lclient!jc;")
	public final Class154_Sub2 method6038() {
		return this.aClass154_Sub2Array3[this.anInt7127];
	}

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt7142;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!pha;Lclient!pha;I)V")
	public final void method6039(@OriginalArg(0) Class256 arg0, @OriginalArg(1) Class256 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg1 != this.aClass256Array5[this.anInt7127]) {
			this.aClass256Array5[this.anInt7127] = arg1;
			local5 = true;
			this.method6059();
		}
		if (this.aClass256Array6[this.anInt7127] != arg0) {
			this.aClass256Array6[this.anInt7127] = arg0;
			this.method6136();
			local5 = true;
		}
		if (local5) {
			this.anInt7160 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "(I)V")
	protected abstract void method6040();

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([Lclient!bq;I)Lclient!sr;")
	public abstract Class293 method6041(@OriginalArg(0) Class41[] arg0);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!om;)V")
	@Override
	public final void method8783(@OriginalArg(0) Class57 arg0) {
		this.aClass57_Sub2_3 = (Class57_Sub2) arg0;
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(B)Lclient!pf;")
	public final Interface19 method6042() {
		return this.aClass57_Sub2_3 == null ? null : this.aClass57_Sub2_3.method5436();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIZ)Lclient!pga;")
	@Override
	public final Class32 method8823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class32_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "()I")
	@Override
	public final int method8780() {
		return this.anInt7136 - 2;
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(B)V")
	private void method6044() {
		this.aFloat136 = (float) (this.anInt7159 - this.anInt7133);
		this.aFloat134 = (float) (this.anInt7155 - this.anInt7133);
		this.aFloat125 = (float) (this.anInt7137 - this.bf);
		this.aFloat133 = (float) (this.anInt7147 - this.bf);
	}

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "(I)V")
	public final void method6045() {
		if (this.anInt7160 == 2) {
			return;
		}
		this.method6088();
		this.method6141(false);
		this.method6075(false);
		this.method6037(false);
		this.method6133(false);
		this.method6137(false, false, -2);
		this.anInt7160 = 2;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
	@Override
	public final void method8803() {
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method8842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static476.method8758(arg3, arg1, arg2, this, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(Z)V")
	private void method6046() {
		if (this.aBoolean472) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray63;
		this.aBoolean472 = true;
		if (this.anInt7000 != 0 && this.anInt7091 != 0) {
			local9[1] = 0.0F;
			local9[6] = 0.0F;
			local9[2] = 0.0F;
			local9[8] = 0.0F;
			local9[11] = 0.0F;
			local9[9] = 0.0F;
			local9[14] = 0.5F;
			local9[7] = 0.0F;
			local9[0] = 2.0F / (float) this.anInt7000;
			local9[3] = 0.0F;
			local9[4] = 0.0F;
			local9[12] = -1.0F;
			local9[15] = 1.0F;
			local9[13] = 1.0F;
			local9[5] = -2.0F / (float) this.anInt7091;
			local9[10] = 0.5F;
			return;
		}
		local9[4] = 0.0F;
		local9[10] = 1.0F;
		local9[14] = 0.0F;
		local9[12] = 0.0F;
		local9[3] = 0.0F;
		local9[9] = 0.0F;
		local9[13] = 0.0F;
		local9[7] = 0.0F;
		local9[5] = 1.0F;
		local9[6] = 0.0F;
		local9[15] = 1.0F;
		local9[2] = 0.0F;
		local9[1] = 0.0F;
		local9[11] = 0.0F;
		local9[8] = 0.0F;
		local9[0] = 1.0F;
	}

	@OriginalMember(owner = "client!wu", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8781(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZI)V")
	public final void method6047(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean466 != arg0) {
			this.aBoolean466 = arg0;
			this.method6126();
		}
	}

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "(I)V")
	protected final void method6048() {
		@Pc(9) Enumeration local9 = this.aHashtable5.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method6065(local15, this.aHashtable5.get(local15));
		}
		this.anInterface17_15.method8431();
		this.anInterface17_16.method8431();
		this.anInterface17_14.method8431();
		this.aClass24_Sub2_22.method3949();
		this.aClass24_Sub2_30.method3949();
		this.aClass24_Sub2_24.method3949();
		this.aClass24_Sub2_25.method3949();
		this.aClass24_Sub2_28.method3949();
		this.aClass43_3.method1056();
		this.anInterface11_7.method8431();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([I)V")
	@Override
	public final void method8812(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt7091;
		arg0[0] = this.anInt7000;
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(II)I")
	@Override
	public final int method8821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZIIII[BLclient!pd;I)Lclient!ch;")
	protected abstract Interface3 method6049(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) Class250 arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLclient!ok;Lclient!pd;)Z")
	public abstract boolean method6050(@OriginalArg(1) Class242 arg0, @OriginalArg(2) Class250 arg1);

	@OriginalMember(owner = "client!wu", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean465) {
			throw new RuntimeException("");
		}
		this.anInt7144 = arg2;
		this.anInt7135 = arg0;
		this.anInt7150 = arg1;
		this.anInt7130 = arg3;
		if (this.aBoolean468) {
			this.aClass7Array3[3].method7188();
			this.aClass7Array3[3].method7190();
		}
	}

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "(B)V")
	public final void method6051() {
		if (this.anInt7160 == 4) {
			return;
		}
		this.method6088();
		this.method6141(false);
		this.method6075(false);
		this.method6037(false);
		this.method6133(false);
		this.method6137(false, false, -2);
		this.method6144(1);
		this.method6092(0);
		this.anInt7160 = 4;
	}

	@OriginalMember(owner = "client!wu", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8781(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "()Z")
	@Override
	public final boolean method8795() {
		return true;
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(Z)V")
	private void method6052() {
		this.method6116();
		this.method6159();
		this.method6126();
		this.method6036();
		this.method6109();
		this.method6080();
		this.method6040();
		this.method6160();
		this.method6108();
		this.method6113();
		this.method6061();
		this.method6153();
		this.method6090();
		this.method6129();
		for (@Pc(52) int local52 = this.anInt7157 - 1; local52 >= 0; local52--) {
			this.method6114(local52);
			this.method6059();
			this.method6136();
			this.method6149();
		}
		this.method6162();
		this.method6095();
		this.method6152();
		this.method6031();
		this.method6104();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([BIIZILclient!pd;)Lclient!kj;")
	public abstract Interface15 method6053(@OriginalArg(0) byte[] arg0, @OriginalArg(5) Class250 arg1);

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "(I)V")
	protected abstract void method6054();

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(IIIIII)Lclient!om;")
	@Override
	public final Class57 method8829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class57_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wu", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt7133, this.bf, this.anInt7132, this.anInt7129 };
	}

	@OriginalMember(owner = "client!wu", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass154_Sub2_16.method4514((float) arg2, (float) arg0, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt7132 * this.aClass154_Sub2_16.method4529((float) arg2, (float) arg0, (float) arg1) / local14);
			local58 = (int) ((float) this.anInt7129 * this.aClass154_Sub2_16.method4527((float) arg2, (float) arg1, (float) arg0) / local14);
		} else {
			local40 = this.anInt7133;
			local58 = this.bf;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat136);
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local58 - this.aFloat125);
	}

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(B)V")
	private void method6055() {
		if (this.aBoolean469) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray61;
		@Pc(17) float local17 = (float) (this.anInt7142 * -this.anInt7133) / (float) this.anInt7132;
		@Pc(32) float local32 = (float) ((this.anInt7000 - this.anInt7133) * this.anInt7142) / (float) this.anInt7132;
		@Pc(43) float local43 = (float) (this.bf * this.anInt7142) / (float) this.anInt7129;
		@Pc(58) float local58 = (float) (this.anInt7142 * (this.bf - this.anInt7091)) / (float) this.anInt7129;
		if (local32 == local17 || local58 == local43) {
			local5[10] = 1.0F;
			local5[11] = 0.0F;
			local5[0] = 1.0F;
			local5[5] = 1.0F;
			local5[9] = 0.0F;
			local5[7] = 0.0F;
			local5[8] = 0.0F;
			local5[12] = 0.0F;
			local5[1] = 0.0F;
			local5[6] = 0.0F;
			local5[2] = 0.0F;
			local5[13] = 0.0F;
			local5[3] = 0.0F;
			local5[15] = 1.0F;
			local5[14] = 0.0F;
			local5[4] = 0.0F;
		} else {
			@Pc(72) float local72 = (float) this.anInt7142 * 2.0F;
			local5[1] = 0.0F;
			local5[6] = 0.0F;
			local5[12] = 0.0F;
			local5[13] = 0.0F;
			local5[5] = local72 / (local43 - local58);
			local5[10] = this.aFloat140 = (float) this.anInt7140 / (float) (this.anInt7142 - this.anInt7140);
			local5[0] = local72 / (local32 - local17);
			local5[14] = this.aFloat128 = (float) (this.anInt7142 * this.anInt7140) / (float) (this.anInt7142 - this.anInt7140);
			local5[15] = 0.0F;
			local5[4] = 0.0F;
			local5[8] = (local32 + local17) / (local32 - local17);
			local5[7] = 0.0F;
			local5[9] = (local58 + local43) / (local43 - local58);
			local5[11] = -1.0F;
			local5[3] = 0.0F;
			local5[2] = 0.0F;
		}
		this.method6135();
		this.aBoolean469 = true;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZZ)V")
	public final void method6056(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean473) {
			this.aBoolean473 = arg0;
			this.method6040();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!of;I)V")
	@Override
	public final void method8831(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1) {
		this.aClass43_3.method1060(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!lf;IZZ)V")
	protected abstract void method6057(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "(I)V")
	protected abstract void method6058();

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "(I)V")
	protected abstract void method6059();

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "(I)Lclient!jc;")
	public final Class154_Sub2 method6060() {
		return this.aClass154_Sub2_19;
	}

	@OriginalMember(owner = "client!wu", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt7122 + this.anInt7123 + this.anInt7119;
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(II)I")
	@Override
	public final int method8820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!wu", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6099();
		this.method6154(arg3);
		this.method6068(0, Static456.aClass187_2);
		this.method6146(0, Static456.aClass187_2);
		this.method6144(arg4);
		this.aClass154_Sub2_15.method4517((float) arg2, 1.0F, (float) arg2);
		this.aClass154_Sub2_15.method6570(arg0, arg1, 0);
		this.method6145();
		this.method6071(false);
		this.method6128(0, this.anInterface17_14);
		this.method6107(this.aClass293_22);
		this.method6147(Static364.aClass77_3, 0, 256);
		this.method6071(true);
		this.method6146(0, Static622.aClass187_4);
		this.method6068(0, Static622.aClass187_4);
	}

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "(I)V")
	protected abstract void method6061();

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method8835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		@Pc(17) float local17 = 0.0F;
		@Pc(19) float local19 = 1.0F;
		if (local9 != 0.0F || local15 != 0.0F) {
			local19 = (float) Math.sqrt((double) (local9 * local9 + local15 * local15));
			local17 = (float) Math.atan2((double) local15, (double) local9);
		}
		this.method6099();
		this.method6154(arg4);
		this.method6068(0, Static456.aClass187_2);
		this.method6146(0, Static456.aClass187_2);
		this.method6144(0);
		this.aClass154_Sub2_15.method4517(local19, 1.0F, (float) arg5);
		this.aClass154_Sub2_15.method6570(0, -arg5 / 2, 0);
		this.aClass154_Sub2_15.method6572((int) ((double) local17 * 2607.5945876176133D) & 0x3FFF);
		this.aClass154_Sub2_15.method6570(arg0, arg1, 0);
		this.method6145();
		this.method6071(false);
		this.method6161();
		this.method6071(true);
		this.method6146(0, Static622.aClass187_4);
		this.method6068(0, Static622.aClass187_4);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!ql;)V")
	@Override
	public final void method8850(@OriginalArg(0) Class154 arg0) {
		this.aClass154_Sub2_16 = (Class154_Sub2) arg0;
		this.aClass154_Sub2_18.method6563(this.aClass154_Sub2_16);
		this.aClass154_Sub2_18.method4535();
		this.aClass154_Sub2_19.method4521(this.aClass154_Sub2_18);
		this.aClass154_Sub2_17.method4521(this.aClass154_Sub2_16);
		if (this.aClass160_7.method4615()) {
			this.method6106();
		}
	}

	@OriginalMember(owner = "client!wu", name = "t", descriptor = "(I)V")
	private void method6062() {
		this.aFloat124 = (float) this.anInt7140;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method8792() {
	}

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "(I)V")
	protected abstract void method6063();

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!of;)V")
	@Override
	public final void method8844(@OriginalArg(0) Class236 arg0) {
		this.aClass43_3.method1060(this, -1, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIILclient!jf;ILclient!ef;)V")
	public abstract void method6064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface11 arg4, @OriginalArg(6) Class77 arg5);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	protected abstract void method6065(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt7142 && this.anInt7140 == arg1) {
			return;
		}
		this.anInt7142 = arg0;
		this.anInt7140 = arg1;
		this.method6119();
		this.method6140();
		this.method6164();
	}

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "(B)V")
	public final void method6066() {
		if (Static287.aClass160_8 == this.aClass160_7) {
			return;
		}
		@Pc(10) Class160 local10 = this.aClass160_7;
		this.aClass160_7 = Static287.aClass160_8;
		if (local10.method4615()) {
			this.method6106();
		}
		this.aFloatArray64 = this.aFloatArray56;
		this.anInt7160 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLclient!jc;)V")
	public final void method6067(@OriginalArg(1) Class154_Sub2 arg0) {
		this.aClass154_Sub2_15.method6563(arg0);
		this.aBoolean462 = false;
		this.method6083();
	}

	@OriginalMember(owner = "client!wu", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat126 != arg0) {
			this.aFloat126 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method6116();
			this.method6080();
		}
	}

	@OriginalMember(owner = "client!wu", name = "A", descriptor = "()Z")
	@Override
	public final boolean method8856() {
		return true;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IBLclient!lf;)V")
	public final void method6068(@OriginalArg(0) int arg0, @OriginalArg(2) Class187 arg1) {
		this.method6079(arg1, false, arg0, false);
	}

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "(I)V")
	public final void method6069() {
		this.aClass377Array3 = new Class377[this.anInt7157];
		this.aClass256Array6 = new Class256[this.anInt7157];
		this.aClass154_Sub2Array3 = new Class154_Sub2[this.anInt7157];
		this.anInterface1Array3 = new Interface1[this.anInt7157];
		this.aClass256Array5 = new Class256[this.anInt7157];
		for (@Pc(32) int local32 = 0; local32 < this.anInt7157; local32++) {
			this.aClass256Array6[local32] = Static266.aClass256_3;
			this.aClass256Array5[local32] = Static266.aClass256_3;
			this.aClass377Array3[local32] = Static477.aClass377_11;
			this.aClass154_Sub2Array3[local32] = new Class154_Sub2();
		}
		this.aClass6_Sub1Array3 = new Class6_Sub1[this.anInt7136 - 2];
		this.anInterface1_3 = this.method6082(Static409.aClass242_13, 1, Static203.aClass250_7, 1);
		this.method8787(new Class6_Sub8_Sub2(262144));
		this.aClass293_16 = this.method6041(new Class41[] { new Class41(new Class362[] { Static610.aClass362_1, Static610.aClass362_5 }) });
		this.aClass293_18 = this.method6041(new Class41[] { new Class41(new Class362[] { Static610.aClass362_1, Static610.aClass362_3 }) });
		this.aClass293_17 = this.method6041(new Class41[] { new Class41(Static610.aClass362_1), new Class41(Static610.aClass362_3), new Class41(Static610.aClass362_5), new Class41(Static610.aClass362_2) });
		this.aClass293_19 = this.method6041(new Class41[] { new Class41(Static610.aClass362_1), new Class41(Static610.aClass362_3), new Class41(Static610.aClass362_5) });
		this.aClass24_Sub2_23 = new Class24_Sub2(this, 0, 0, false, false);
		this.aClass24_Sub2_22 = new Class24_Sub2(this, 0, 0, true, true);
		this.aClass24_Sub2_27 = new Class24_Sub2(this, 0, 0, false, false);
		this.aClass24_Sub2_30 = new Class24_Sub2(this, 0, 0, true, true);
		this.aClass24_Sub2_29 = new Class24_Sub2(this, 0, 0, false, false);
		this.aClass24_Sub2_24 = new Class24_Sub2(this, 0, 0, true, true);
		this.aClass24_Sub2_26 = new Class24_Sub2(this, 0, 0, false, false);
		this.aClass24_Sub2_25 = new Class24_Sub2(this, 0, 0, true, true);
		this.aClass24_Sub2_21 = new Class24_Sub2(this, 0, 0, false, false);
		this.aClass24_Sub2_28 = new Class24_Sub2(this, 0, 0, true, true);
		this.aClass43_3 = new Class43(this);
		this.anInterface11_7 = this.method6101(true);
		this.method6102();
		this.aClass249_7 = new Class249(this);
		this.aClass7Array3[1] = this.method6098(1);
		this.aClass7Array3[2] = this.method6098(2);
		this.aClass7Array3[4] = this.method6098(4);
		this.aClass7Array3[5] = this.method6098(5);
		this.aClass7Array3[6] = this.method6098(6);
		this.aClass7Array3[7] = this.method6098(7);
		this.aClass7Array3[3] = this.method6098(3);
		this.aClass7Array3[8] = this.method6098(8);
		this.aClass7Array3[9] = this.method6098(9);
		if (!this.aClass7Array3[2].method7194()) {
			this.aClass7Array3[2] = this.method6098(0);
		}
		if (!this.aClass7Array3[4].method7194()) {
			this.aClass7Array3[4] = this.aClass7Array3[2];
		}
		if (!this.aClass7Array3[8].method7194()) {
			this.aClass7Array3[8] = this.aClass7Array3[4];
		}
		if (!this.aClass7Array3[9].method7194()) {
			this.aClass7Array3[9] = this.aClass7Array3[8];
		}
		this.method6151();
		this.la();
		this.method8806();
	}

	@OriginalMember(owner = "client!wu", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean477 = arg0;
		this.method6108();
	}

	@OriginalMember(owner = "client!wu", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass154_Sub2_16.aFloat97 * (float) arg1 + (float) arg0 * this.aClass154_Sub2_16.aFloat105 + (float) arg2 * this.aClass154_Sub2_16.aFloat102 + this.aClass154_Sub2_16.aFloat94;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass154_Sub2_16.aFloat94 + (float) arg3 * this.aClass154_Sub2_16.aFloat105 + this.aClass154_Sub2_16.aFloat97 * (float) arg4 + (float) arg5 * this.aClass154_Sub2_16.aFloat102;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt7142 > local32 && (float) this.anInt7142 > local63) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt7140 && (float) this.anInt7140 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass154_Sub2_16.aFloat104 + (float) arg2 * this.aClass154_Sub2_16.aFloat99 + this.aClass154_Sub2_16.aFloat95 * (float) arg1 + this.aClass154_Sub2_16.aFloat98 * (float) arg0) * (float) this.anInt7132 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt7132 * (this.aClass154_Sub2_16.aFloat98 * (float) arg3 + (float) arg4 * this.aClass154_Sub2_16.aFloat95 + (float) arg5 * this.aClass154_Sub2_16.aFloat99 + this.aClass154_Sub2_16.aFloat104) / local63);
		if ((float) local135 < this.aFloat136 && (float) local167 < this.aFloat136) {
			local7 |= 0x1;
		} else if (this.aFloat134 < (float) local135 && (float) local167 > this.aFloat134) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt7129 * ((float) arg2 * this.aClass154_Sub2_16.aFloat103 + this.aClass154_Sub2_16.aFloat100 * (float) arg1 + (float) arg0 * this.aClass154_Sub2_16.aFloat101 + this.aClass154_Sub2_16.aFloat96) / local32);
		@Pc(265) int local265 = (int) ((this.aClass154_Sub2_16.aFloat96 + this.aClass154_Sub2_16.aFloat103 * (float) arg5 + (float) arg3 * this.aClass154_Sub2_16.aFloat101 + this.aClass154_Sub2_16.aFloat100 * (float) arg4) * (float) this.anInt7129 / local63);
		if (this.aFloat125 > (float) local233 && this.aFloat125 > (float) local265) {
			local7 |= 0x4;
		} else if (this.aFloat133 < (float) local233 && (float) local265 > this.aFloat133) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "(II)V")
	public abstract void method6070(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZB)V")
	public abstract void method6071(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "()Z")
	@Override
	public final boolean method8836() {
		return false;
	}

	@OriginalMember(owner = "client!wu", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt7124 = 0;
		while (arg0 > 1) {
			this.anInt7124++;
			arg0 >>= 0x1;
		}
		this.anInt7141 = 0x1 << this.anInt7124;
	}

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "(I)I")
	public final int method6072() {
		return this.anInt7150;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIF)Lclient!raa;")
	@Override
	public final Class6_Sub1 method8786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub1_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wu", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.bf = arg1;
		this.anInt7133 = arg0;
		this.anInt7132 = arg2;
		this.anInt7129 = arg3;
		this.method6140();
		this.method6119();
		this.method6066();
		this.method6044();
	}

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "(B)Lclient!jc;")
	public final Class154_Sub2 method6073() {
		return this.aClass154_Sub2_15;
	}

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "(B)V")
	private void method6074() {
		this.method6063();
		if (this.aClass7_3 != null) {
			this.aClass7_3.method7196();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZ)V")
	public final void method6075(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean470) {
			this.aBoolean470 = arg0;
			this.method6126();
			this.anInt7160 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!wu", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt7140;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method8774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)V")
	@Override
	public final void method8813(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "(I)V")
	@Override
	public final void method8817(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "(Z)V")
	private void method6076() {
		this.anInterface17_14 = this.method6123(false);
		this.anInterface17_14.method8440(12, 3096);
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			@Pc(35) Buffer local35 = this.anInterface17_14.method8438();
			if (local35 != null) {
				@Pc(42) Stream local42 = this.method6131(local35);
				local42.a(0.0F);
				local42.a(0.0F);
				local42.a(0.0F);
				for (@Pc(53) int local53 = 0; local53 <= 256; local53++) {
					@Pc(64) double local64 = (double) (local53 * 2) * 3.141592653589793D / 256.0D;
					@Pc(68) float local68 = (float) Math.cos(local64);
					@Pc(72) float local72 = (float) Math.sin(local64);
					if (Stream.b()) {
						local42.a(local72);
						local42.a(local68);
						local42.a(0.0F);
					} else {
						local42.b(local72);
						local42.b(local68);
						local42.b(0.0F);
					}
				}
				local42.c();
				if (this.anInterface17_14.method8439()) {
					break;
				}
			}
		}
		this.aClass293_22 = this.method6041(new Class41[] { new Class41(Static610.aClass362_1) });
	}

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "(I)Lclient!jc;")
	public final Class154_Sub2 method6077() {
		if (!this.aBoolean481) {
			this.aClass154_Sub2_20.method4516(this.aClass154_Sub2_18, this.aClass154_Sub2_15);
			this.aBoolean481 = true;
		}
		return this.aClass154_Sub2_20;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!dh;IIII)Lclient!ka;")
	@Override
	public final Class24 method8770(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class24_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!lf;ZIZZ)V")
	public abstract void method6079(@OriginalArg(0) Class187 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "(I)V")
	protected abstract void method6080();

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(IIZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method6081(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap4.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!ok;ILclient!pd;ZI)Lclient!ch;")
	public abstract Interface3 method6082(@OriginalArg(0) Class242 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "(I)V")
	private void method6083() {
		if (this.aClass160_7 == Static148.aClass160_1) {
			@Pc(11) float local11 = this.method6115();
			this.aClass154_Sub2_15.method4522(local11, local11, 0.0F);
		}
		this.aBoolean481 = false;
		this.method6031();
		if (this.aClass7_3 != null) {
			this.aClass7_3.method7185();
		}
	}

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "()Z")
	@Override
	public final boolean method8848() {
		return true;
	}

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "()Z")
	@Override
	public final boolean method8853() {
		return true;
	}

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "()Lclient!ql;")
	@Override
	public final Class154 method8830() {
		return this.aClass154_Sub2_16;
	}

	@OriginalMember(owner = "client!wu", name = "A", descriptor = "(I)V")
	private void method6084() {
		this.method6128(0, this.anInterface17_16);
		this.method6107(this.aClass293_20);
		this.method6147(Static507.aClass77_4, 0, 1);
	}

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "()V")
	@Override
	public final void method8849() {
		if (this.aClass84_3 != null) {
			this.aClass84_3.method2187();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!ok;Lclient!pd;)Z")
	public abstract boolean method6085(@OriginalArg(1) Class242 arg0, @OriginalArg(2) Class250 arg1);

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "(B)Lclient!jc;")
	public final Class154_Sub2 method6086() {
		return this.aClass154_Sub2_18;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLclient!de;)V")
	public abstract void method6087(@OriginalArg(1) Class61 arg0);

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "(I)V")
	private void method6088() {
		if (Static148.aClass160_1 == this.aClass160_7) {
			return;
		}
		@Pc(17) Class160 local17 = this.aClass160_7;
		this.aClass160_7 = Static148.aClass160_1;
		if (local17.method4615()) {
			this.method6106();
		}
		this.method6046();
		this.aFloatArray64 = this.aFloatArray63;
		this.method6139();
		this.anInt7160 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "(B)Lclient!jc;")
	public final Class154_Sub2 method6089() {
		return this.aClass154_Sub2Array3[this.anInt7127];
	}

	@OriginalMember(owner = "client!wu", name = "C", descriptor = "(I)V")
	protected abstract void method6090();

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z[FIILclient!pd;III)Lclient!ch;")
	protected abstract Interface3 method6091(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class250 arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!wu", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIZ)Lclient!pga;")
	@Override
	public final Class32 method8804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class32_Sub1 local11 = new Class32_Sub1(this, arg2, arg3, arg4);
		local11.method5091(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method8843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(18) float local18 = (float) -arg1 + (float) arg3;
		@Pc(39) float local39;
		if (local11 == 0.0F && local18 == 0.0F) {
			local11 = 1.0F;
		} else {
			local39 = (float) (1.0D / Math.sqrt((double) (local18 * local18 + local11 * local11)));
			local11 *= local39;
			local18 *= local39;
		}
		this.method6099();
		this.method6154(arg4);
		this.method6068(0, Static456.aClass187_2);
		this.method6146(0, Static456.aClass187_2);
		this.method6144(1);
		this.method6096();
		@Pc(81) int local81 = arg7 % (arg5 + arg6);
		this.method6071(false);
		local39 = (float) arg5 * local11;
		@Pc(95) float local95 = (float) arg5 * local18;
		@Pc(97) float local97 = 0.0F;
		@Pc(99) float local99 = 0.0F;
		@Pc(101) float local101 = local39;
		@Pc(103) float local103 = local95;
		if (arg5 < local81) {
			local99 = (float) (arg6 + arg5 - local81) * local18;
			local97 = (float) (arg6 + arg5 - local81) * local11;
		} else {
			local101 = (float) (arg5 - local81) * local11;
			local103 = local18 * (float) (arg5 - local81);
		}
		@Pc(148) float local148 = (float) arg0 + local97;
		@Pc(153) float local153 = local99 + (float) arg1;
		@Pc(158) float local158 = local11 * (float) arg6;
		@Pc(163) float local163 = (float) arg6 * local18;
		while (true) {
			if (arg0 >= arg2) {
				if ((float) arg2 > local148) {
					break;
				}
				if ((float) arg2 > local148 + local101) {
					local101 = (float) arg2 - local148;
				}
			} else {
				if (local148 > (float) arg2) {
					break;
				}
				if ((float) arg2 < local148 + local101) {
					local101 = (float) arg2 - local148;
				}
			}
			if (arg1 < arg3) {
				if (local153 > (float) arg3) {
					break;
				}
				if (local153 + local103 > (float) arg3) {
					local103 = (float) arg3 - local153;
				}
			} else {
				if (local153 < (float) arg3) {
					break;
				}
				if (local103 + local153 < (float) arg3) {
					local103 = (float) arg3 - local153;
				}
			}
			if (!this.method6157(local153, local148 + local101, 0.0F, local148, local103 + local153, 0.0F)) {
				return;
			}
			local148 += local101 + local158;
			this.method6084();
			local153 += local103 + local163;
			local101 = local39;
			local103 = local95;
		}
		this.method6071(true);
		this.method6146(0, Static622.aClass187_4);
		this.method6068(0, Static622.aClass187_4);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)V")
	public final void method6092(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method6039(Static436.aClass256_4, Static436.aClass256_4);
		} else if (arg0 == 0) {
			this.method6039(Static266.aClass256_3, Static266.aClass256_3);
		} else if (arg0 == 2) {
			this.method6039(Static436.aClass256_4, Static190.aClass256_2);
		} else if (arg0 == 3) {
			this.method6039(Static266.aClass256_3, Static114.aClass256_1);
		} else if (arg0 == 4) {
			this.method6039(Static574.aClass256_5, Static574.aClass256_5);
			return;
		}
	}

	@OriginalMember(owner = "client!wu", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (this.anInt7159 < arg0) {
			local5 = true;
			this.anInt7159 = arg0;
		}
		if (this.anInt7155 > arg2) {
			local5 = true;
			this.anInt7155 = arg2;
		}
		if (arg1 > this.anInt7137) {
			this.anInt7137 = arg1;
			local5 = true;
		}
		if (this.anInt7147 > arg3) {
			this.anInt7147 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean483) {
			this.aBoolean483 = true;
			this.method6112();
		}
		this.method6054();
		this.method6044();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V")
	protected abstract void method6093(@OriginalArg(0) Object arg0, @OriginalArg(2) Canvas arg1);

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "(B)V")
	private void method6094() {
		this.anInterface17_15 = this.method6123(false);
		this.anInterface17_15.method8440(28, 140);
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			@Pc(32) Buffer local32 = this.anInterface17_15.method8438();
			if (local32 != null) {
				@Pc(41) Stream local41 = this.method6131(local32);
				if (Stream.b()) {
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(1.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
					local41.a(0.0F);
				} else {
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(1.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
					local41.b(0.0F);
				}
				local41.c();
				if (this.anInterface17_15.method8439()) {
					break;
				}
			}
		}
		this.aClass293_21 = this.method6041(new Class41[] { new Class41(new Class362[] { Static610.aClass362_1, Static610.aClass362_5, Static610.aClass362_5 }) });
	}

	@OriginalMember(owner = "client!wu", name = "D", descriptor = "(I)V")
	protected abstract void method6095();

	@OriginalMember(owner = "client!wu", name = "E", descriptor = "(I)V")
	public final void method6096() {
		this.aClass154_Sub2_15.method6564();
		this.aBoolean462 = true;
		this.method6083();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZI[II)Lclient!ch;")
	public final Interface3 method6097(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		return this.method6156(0, arg0, arg1, arg3, arg2, 0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[Lclient!raa;)V")
	@Override
	public final void method8828(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass6_Sub1Array3[local7] = arg1[local7];
		}
		this.anInt7126 = arg0;
		if (this.aClass160_7.method4615()) {
			this.method6036();
		}
	}

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "(II)Lclient!nia;")
	protected Class7 method6098(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class7_Sub3(this);
		} else if (arg0 == 1) {
			return new Class7_Sub10(this);
		} else if (arg0 == 2) {
			return new Class7_Sub1(this, this.aClass249_7);
		} else if (arg0 == 7) {
			return new Class7_Sub2(this);
		} else {
			return new Class7_Sub4(this);
		}
	}

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "(B)V")
	private void method6099() {
		if (this.anInt7160 == 1) {
			return;
		}
		this.method6088();
		this.method6141(false);
		this.method6075(false);
		this.method6037(false);
		this.method6133(false);
		this.method6137(false, false, -2);
		this.method6092(1);
		this.method6033(this.anInterface1_3);
		this.anInt7160 = 1;
	}

	@OriginalMember(owner = "client!wu", name = "F", descriptor = "(I)I")
	public final int method6100() {
		return this.anInt7144;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(IZ)Lclient!jf;")
	public abstract Interface11 method6101(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!wu", name = "G", descriptor = "(I)V")
	protected final void method6102() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable5 != null && !this.aHashtable5.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable5.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method6117(local26));
			}
		}
		this.aHashtable5 = local9;
		this.method6094();
		this.method6103();
		this.method6076();
		this.aClass43_3.method1051(this);
	}

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "(Z)V")
	private void method6103() {
		this.anInterface17_16 = this.method6123(true);
		this.anInterface17_16.method8440(12, 24);
		this.aClass293_20 = this.method6041(new Class41[] { new Class41(Static610.aClass362_1) });
	}

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "(B)V")
	protected abstract void method6104();

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method8787(@OriginalArg(0) Class6_Sub8 arg0) {
		this.aNativeHeap4 = ((Class6_Sub8_Sub2) arg0).aNativeHeap5;
		this.aNativeHeapBuffer6 = this.aNativeHeap4.a(32768, false);
	}

	@OriginalMember(owner = "client!wu", name = "H", descriptor = "(I)V")
	private void method6105() {
		if (this.aCanvas8 == null) {
			this.anInt6956 = this.anInt6974 = 1;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas8.getSize();
			this.anInt6974 = local6.height;
			this.anInt6956 = local6.width;
		}
		this.anInt7000 = this.anInt6956;
		this.anInt7091 = this.anInt6974;
		this.method6035();
		this.method6119();
		this.method6140();
		this.method6095();
		this.method6044();
		this.method6066();
		this.la();
	}

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "(B)V")
	private void method6106() {
		this.aBoolean481 = false;
		if (this.aClass7_3 != null) {
			this.aClass7_3.method7184();
		}
		this.method6104();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([IIIIIZ)Lclient!pga;")
	@Override
	public final Class32 method8777(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class32_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!sr;B)V")
	public abstract void method6107(@OriginalArg(0) Class293 arg0);

	@OriginalMember(owner = "client!wu", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7150 = arg1;
		this.anInt7144 = arg2;
		this.anInt7130 = arg3;
		this.aBoolean465 = true;
		this.anInt7135 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)V")
	@Override
	public final void method8805(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "(B)V")
	protected abstract void method6108();

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "(B)V")
	public abstract void method6109();

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "()Lclient!ql;")
	@Override
	public final Class154 method8785() {
		return this.aClass154_Sub2_21;
	}

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "()Z")
	@Override
	public final boolean method8816() {
		return this.aClass7Array3[3].method7194();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BB)V")
	public final void method6110(@OriginalArg(0) byte arg0) {
		this.method6154(arg0 << 8 | arg0 << 16 | arg0 << 24 | arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([FB)[F")
	public final float[] method6111(@OriginalArg(0) float[] arg0) {
		arg0[12] = this.aFloatArray64[3];
		arg0[4] = this.aFloatArray64[1];
		arg0[8] = this.aFloatArray64[2];
		arg0[0] = this.aFloatArray64[0];
		arg0[2] = this.aFloatArray64[8];
		arg0[13] = this.aFloatArray64[7];
		arg0[1] = this.aFloatArray64[4];
		arg0[5] = this.aFloatArray64[5];
		arg0[9] = this.aFloatArray64[6];
		arg0[6] = this.aFloatArray64[9];
		arg0[14] = this.aFloatArray64[11];
		arg0[3] = this.aFloatArray64[12];
		arg0[7] = this.aFloatArray64[13];
		arg0[10] = this.aFloatArray64[10];
		arg0[11] = this.aFloatArray64[14];
		arg0[15] = this.aFloatArray64[15];
		return arg0;
	}

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "(Z)V")
	protected abstract void method6112();

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "(B)V")
	protected abstract void method6113();

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(BI)V")
	public final void method6114(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt7127) {
			this.anInt7127 = arg0;
			this.method6058();
		}
	}

	@OriginalMember(owner = "client!wu", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass154_Sub2_16.method4514((float) arg2, (float) arg0, (float) arg1);
		if (local14 < (float) this.anInt7142 || local14 > (float) this.anInt7140) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt7132 * this.aClass154_Sub2_16.method4529((float) arg2, (float) arg0, (float) arg1) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt7129 * this.aClass154_Sub2_16.method4527((float) arg2, (float) arg1, (float) arg0) / (float) arg3);
		arg4[0] = (int) ((float) local58 - this.aFloat136);
		arg4[1] = (int) ((float) local77 - this.aFloat125);
		arg4[2] = (int) local14;
	}

	@OriginalMember(owner = "client!wu", name = "t", descriptor = "(B)F")
	protected abstract float method6115();

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "(B)V")
	protected abstract void method6116();

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method6117(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8769(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas7) {
			local5 = this.anObject16;
		} else if (this.aHashtable5.containsKey(arg0)) {
			local5 = this.aHashtable5.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method6093(local5, arg0);
		if (arg0 == this.aCanvas8) {
			this.method6105();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!ef;I)V")
	private void method6118(@OriginalArg(1) Class77 arg0, @OriginalArg(2) int arg1) {
		this.method6128(0, this.anInterface17_15);
		this.method6107(this.aClass293_21);
		this.method6147(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!wu", name = "I", descriptor = "(I)V")
	private void method6119() {
		this.aBoolean469 = false;
		this.method6055();
		if (this.aClass160_7 == Static200.aClass160_4) {
			this.method6139();
		}
	}

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "(B)V")
	protected abstract void method6120();

	@OriginalMember(owner = "client!wu", name = "J", descriptor = "(I)V")
	public final void method6121() {
		if (this.anInt7160 == 16) {
			return;
		}
		this.method6130();
		this.method6141(true);
		this.method6037(true);
		this.method6133(true);
		this.method6144(1);
		this.anInt7160 = 16;
	}

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "(Z)V")
	private void method6122() {
		if (this.aBoolean480) {
			return;
		}
		@Pc(10) float[] local10 = this.aFloatArray62;
		@Pc(14) float local14 = (float) this.anInt7142;
		@Pc(18) float local18 = (float) this.anInt7140;
		@Pc(30) float local30 = this.aFloat129 * (float) -this.bf / (float) this.anInt7129;
		@Pc(42) float local42 = (float) -this.anInt7133 * this.aFloat129 / (float) this.anInt7132;
		@Pc(57) float local57 = (float) (this.anInt7000 - this.anInt7133) * this.aFloat129 / (float) this.anInt7132;
		@Pc(72) float local72 = (float) (this.anInt7091 - this.bf) * this.aFloat129 / (float) this.anInt7129;
		if (local57 == local42 || local30 == local72) {
			local10[3] = 0.0F;
			local10[7] = 0.0F;
			local10[5] = 1.0F;
			local10[1] = 0.0F;
			local10[15] = 1.0F;
			local10[8] = 0.0F;
			local10[11] = 0.0F;
			local10[13] = 0.0F;
			local10[14] = 0.0F;
			local10[2] = 0.0F;
			local10[9] = 0.0F;
			local10[0] = 1.0F;
			local10[4] = 0.0F;
			local10[6] = 0.0F;
			local10[12] = 0.0F;
			local10[10] = 1.0F;
		} else {
			local10[11] = 0.0F;
			local10[10] = 1.0F / (local14 - local18);
			local10[4] = 0.0F;
			local10[14] = local14 / (local14 - local18);
			local10[3] = 0.0F;
			local10[1] = 0.0F;
			local10[12] = (local42 + local57) / (-local57 + local42);
			local10[8] = 0.0F;
			local10[9] = 0.0F;
			local10[7] = 0.0F;
			local10[5] = 2.0F / (local72 - local30);
			local10[2] = 0.0F;
			local10[0] = 2.0F / (local57 - local42);
			local10[13] = (local72 + local30) / (-local30 + local72);
			local10[6] = 0.0F;
			local10[15] = 1.0F;
		}
		this.method6062();
		this.aBoolean480 = true;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(ZI)Lclient!ll;")
	public abstract Interface17 method6123(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[FZZILclient!pd;)Lclient!ch;")
	public final Interface3 method6124(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class250 arg4) {
		return this.method6091(arg2, arg1, arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IBZ[BLclient!pd;I)Lclient!ch;")
	public final Interface3 method6125(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class250 arg3, @OriginalArg(5) int arg4) {
		return this.method6049(arg1, arg4, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public final Class6_Sub8 method8841(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub8_Sub2 local8 = new Class6_Sub8_Sub2(arg0);
		this.aClass8_41.method157(local8);
		return local8;
	}

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "(I)V")
	@Override
	public final void method8824(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass84_3 != null) {
			this.aClass84_3.method2187();
		}
		this.anInt7131 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "(B)V")
	protected abstract void method6126();

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method8791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(IZ)V")
	public final void method6127(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean475 != arg0) {
			this.aBoolean475 = arg0;
			this.method6113();
		}
	}

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "()Z")
	@Override
	public final boolean method8825() {
		return false;
	}

	@OriginalMember(owner = "client!wu", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass154_Sub2_16.aFloat94 + (float) arg2 * this.aClass154_Sub2_16.aFloat102 + (float) arg1 * this.aClass154_Sub2_16.aFloat97 + this.aClass154_Sub2_16.aFloat105 * (float) arg0;
		@Pc(57) float local57 = this.aClass154_Sub2_16.aFloat94 + this.aClass154_Sub2_16.aFloat97 * (float) arg4 + this.aClass154_Sub2_16.aFloat105 * (float) arg3 + this.aClass154_Sub2_16.aFloat102 * (float) arg5;
		if ((float) this.anInt7142 > local32 && (float) this.anInt7142 > local57) {
			local7 |= 0x10;
		} else if ((float) this.anInt7140 < local32 && local57 > (float) this.anInt7140) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt7132 * (this.aClass154_Sub2_16.aFloat104 + this.aClass154_Sub2_16.aFloat99 * (float) arg2 + (float) arg1 * this.aClass154_Sub2_16.aFloat95 + (float) arg0 * this.aClass154_Sub2_16.aFloat98) / (float) arg6);
		@Pc(157) int local157 = (int) (((float) arg3 * this.aClass154_Sub2_16.aFloat98 + (float) arg4 * this.aClass154_Sub2_16.aFloat95 + this.aClass154_Sub2_16.aFloat99 * (float) arg5 + this.aClass154_Sub2_16.aFloat104) * (float) this.anInt7132 / (float) arg6);
		if (this.aFloat136 > (float) local124 && (float) local157 < this.aFloat136) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat134 && this.aFloat134 < (float) local157) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt7129 * ((float) arg1 * this.aClass154_Sub2_16.aFloat100 + this.aClass154_Sub2_16.aFloat101 * (float) arg0 + this.aClass154_Sub2_16.aFloat103 * (float) arg2 + this.aClass154_Sub2_16.aFloat96) / (float) arg6);
		@Pc(257) int local257 = (int) (((float) arg3 * this.aClass154_Sub2_16.aFloat101 + this.aClass154_Sub2_16.aFloat100 * (float) arg4 + this.aClass154_Sub2_16.aFloat103 * (float) arg5 + this.aClass154_Sub2_16.aFloat96) * (float) this.anInt7129 / (float) arg6);
		if ((float) local224 < this.aFloat125 && (float) local257 < this.aFloat125) {
			local7 |= 0x4;
		} else if (this.aFloat133 < (float) local224 && (float) local257 > this.aFloat133) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IBLclient!ll;)V")
	public abstract void method6128(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1);

	@OriginalMember(owner = "client!wu", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6099();
		this.method6154(arg4);
		this.method6068(0, Static456.aClass187_2);
		this.method6146(0, Static456.aClass187_2);
		this.method6144(arg5);
		this.aClass154_Sub2_15.method4517((float) arg2, 1.0F, (float) arg3);
		this.aClass154_Sub2_15.method6570(arg0, arg1, 0);
		this.method6145();
		this.method6071(false);
		this.method6161();
		this.method6071(true);
		this.method6146(0, Static622.aClass187_4);
		this.method6068(0, Static622.aClass187_4);
	}

	@OriginalMember(owner = "client!wu", name = "K", descriptor = "(I)V")
	protected abstract void method6129();

	@OriginalMember(owner = "client!wu", name = "L", descriptor = "(I)V")
	private void method6130() {
		if (this.aClass160_7 == Static368.aClass160_6) {
			return;
		}
		@Pc(17) Class160 local17 = this.aClass160_7;
		this.aClass160_7 = Static368.aClass160_6;
		if (!local17.method4615()) {
			this.method6106();
		}
		this.method6122();
		this.aFloatArray64 = this.aFloatArray62;
		this.method6139();
		this.anInt7160 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method8781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		if (local9 == 0.0F && local15 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(40) float local40 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local15 * local15)));
			local15 *= local40;
			local9 *= local40;
		}
		if (!this.method6157((float) arg1, local9 + (float) arg2, 0.0F, (float) arg0, local15 + (float) arg3, 0.0F)) {
			return;
		}
		this.method6099();
		this.method6154(arg4);
		this.method6068(0, Static456.aClass187_2);
		this.method6146(0, Static456.aClass187_2);
		this.method6144(arg5);
		this.method6096();
		this.method6071(false);
		this.method6084();
		this.method6071(true);
		this.method6146(0, Static622.aClass187_4);
		this.method6068(0, Static622.aClass187_4);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;I)Lclient!jaclib/memory/Stream;")
	public final Stream method6131(@OriginalArg(0) Buffer arg0) {
		this.aStream4.a(arg0);
		return this.aStream4;
	}

	@OriginalMember(owner = "client!wu", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt7138 != arg0;
		if (local11 || arg1 != this.aFloat132 || arg2 != this.aFloat139) {
			this.anInt7138 = arg0;
			this.aFloat132 = arg1;
			this.aFloat139 = arg2;
			if (local11) {
				this.aFloat127 = (float) (this.anInt7138 & 0xFF) / 255.0F;
				this.aFloat130 = (float) (this.anInt7138 & 0xFF0000) / 1.671168E7F;
				this.aFloat138 = (float) (this.anInt7138 & 0xFF00) / 65280.0F;
				this.method6116();
			}
			this.aNativeInterface3.setSunColour(this.aFloat130, this.aFloat138, this.aFloat127, arg1, arg2);
			this.method6159();
		}
		if (this.aFloatArray57[0] != arg3 || this.aFloatArray57[1] != arg4 || this.aFloatArray57[2] != arg5) {
			this.aFloatArray57[1] = arg4;
			this.aFloatArray57[2] = arg5;
			this.aFloatArray57[0] = arg3;
			this.aFloatArray58[2] = -arg5;
			this.aFloatArray58[0] = -arg3;
			this.aFloatArray58[1] = -arg4;
			@Pc(149) float local149 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray60[2] = arg5 * local149;
			this.aFloatArray60[0] = local149 * arg3;
			this.aFloatArray60[1] = local149 * arg4;
			this.aFloatArray59[1] = -this.aFloatArray60[1];
			this.aFloatArray59[2] = -this.aFloatArray60[2];
			this.aFloatArray59[0] = -this.aFloatArray60[0];
			this.aNativeInterface3.setSunDirection(this.aFloatArray60[0], this.aFloatArray60[1], this.aFloatArray60[2]);
			this.method6109();
			this.anInt7145 = (int) (arg5 * 256.0F / arg4);
			this.anInt7153 = (int) (arg3 * 256.0F / arg4);
		}
		this.method6080();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!fg;Z)Lclient!pga;")
	@Override
	public final Class32 method8773(@OriginalArg(0) Class98 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(27) Class32 local27;
		if (arg0.anInt2796 == 0 || arg0.anInt2799 == 0) {
			local27 = this.method8847(1, 1, new int[1], 1);
		} else {
			@Pc(36) int[] local36 = new int[arg0.anInt2796 * arg0.anInt2799];
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			@Pc(45) int local45;
			@Pc(49) int local49;
			if (arg0.aByteArray44 == null) {
				for (local45 = 0; local45 < arg0.anInt2799; local45++) {
					for (local49 = 0; local49 < arg0.anInt2796; local49++) {
						@Pc(62) int local62 = arg0.anIntArray184[arg0.aByteArray45[local38++] & 0xFF];
						local36[local40++] = local62 == 0 ? 0 : local62 | 0xFF000000;
					}
				}
			} else {
				for (local45 = 0; local45 < arg0.anInt2799; local45++) {
					for (local49 = 0; local49 < arg0.anInt2796; local49++) {
						local36[local40++] = arg0.anIntArray184[arg0.aByteArray45[local38] & 0xFF] | arg0.aByteArray44[local38] << 24;
						local38++;
					}
				}
			}
			local27 = this.method8847(arg0.anInt2799, arg0.anInt2796, local36, arg0.anInt2796);
		}
		local27.method5073(arg0.anInt2797, arg0.anInt2798, arg0.anInt2794, arg0.anInt2795);
		return local27;
	}

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "(B)I")
	public final int method6132() {
		return this.anInt7135;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(ZB)V")
	public final void method6133(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean464 != arg0) {
			this.aBoolean464 = arg0;
			this.method6108();
			this.anInt7160 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wu", name = "M", descriptor = "(I)V")
	public final void method6134() {
		this.method6066();
		this.method6139();
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Z)V")
	@Override
	public final void method8802(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "(Z)V")
	private void method6135() {
		this.aFloatArray61[14] = this.aFloat128;
		this.aFloatArray61[10] = this.aFloat140;
		this.aFloat131 = (this.aFloatArray61[14] - (float) this.anInt7140) / this.aFloatArray61[10];
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8788(@OriginalArg(0) Canvas arg0) {
		this.anObject16 = null;
		this.aCanvas8 = null;
		if (arg0 == null || arg0 == this.aCanvas7) {
			this.anObject16 = this.anObject15;
			this.aCanvas8 = this.aCanvas7;
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.anObject16 = this.aHashtable5.get(arg0);
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.anObject16 == null) {
			throw new RuntimeException();
		}
		this.method6034(this.anObject16, this.aCanvas8);
		this.method6105();
	}

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "(B)V")
	protected abstract void method6136();

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!hia;[Lclient!fg;Z)Lclient!da;")
	@Override
	public final Class50 method8808(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class98[] arg1) {
		return new Class50_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZZZI)V")
	public final void method6137(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt7134 != arg2 || this.aBoolean468 != this.aBoolean465) {
			@Pc(20) Interface3 local20 = null;
			@Pc(22) int local22 = 0;
			@Pc(24) byte local24 = 0;
			@Pc(26) int local26 = 0;
			@Pc(33) int local33 = this.aBoolean465 ? 3 : 0;
			if (arg2 < 0) {
				this.method6149();
			} else {
				local20 = this.aClass84_3.method2190(arg2);
				@Pc(55) Class325 local55 = super.anInterface4_12.method895(arg2);
				if (local55.aByte116 == 0 && local55.aByte111 == 0) {
					this.method6149();
				} else {
					@Pc(68) int local68 = local55.aBoolean633 ? 64 : 128;
					@Pc(72) int local72 = local68 * 50;
					@Pc(76) Class154_Sub2 local76 = this.method6038();
					local76.method4518(0.0F, (float) (local55.aByte111 * (this.anInt7125 % local72)) / (float) local72, (float) (local55.aByte116 * (this.anInt7125 % local72)) / (float) local72);
					this.method6030(Static104.aClass377_2);
				}
				local22 = local55.anInt9370;
				if (!this.aBoolean465) {
					local26 = local55.anInt9368;
					local33 = local55.aByte115;
					local24 = local55.aByte112;
				}
			}
			this.method6148(arg0, local24, local26, arg1, local33);
			if (this.aClass7_3 == null) {
				this.method6033(local20);
				this.method6092(local22);
			} else {
				this.aClass7_3.method7186(local20, local22);
			}
			this.aBoolean468 = this.aBoolean465;
			this.anInt7134 = arg2;
		}
		this.anInt7160 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "()V")
	@Override
	protected void method8826() {
		if (this.aBoolean467) {
			return;
		}
		for (@Pc(9) Class6 local9 = this.aClass8_41.method149(); local9 != null; local9 = this.aClass8_41.method155()) {
			((Class6_Sub8_Sub2) local9).method7071();
		}
		@Pc(26) Enumeration local26 = this.aHashtable5.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method6065(local32, this.aHashtable5.get(local32));
		}
		Static252.method4536(false, true);
		this.aNativeInterface3.release();
		this.aBoolean467 = true;
	}

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "(Z)V")
	private void method6139() {
		this.method6152();
		if (this.aClass7_3 != null) {
			this.aClass7_3.method7182();
		}
	}

	@OriginalMember(owner = "client!wu", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass154_Sub2_16.method4514((float) arg2, (float) arg0, (float) arg1);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt7132 * this.aClass154_Sub2_16.method4529((float) arg2, (float) arg0, (float) arg1) / local14);
			local58 = (int) ((float) this.anInt7129 * this.aClass154_Sub2_16.method4527((float) arg2, (float) arg1, (float) arg0) / local14);
		} else {
			local58 = this.bf;
			local40 = this.anInt7133;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat136);
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local58 - this.aFloat125);
	}

	@OriginalMember(owner = "client!wu", name = "N", descriptor = "(I)V")
	private void method6140() {
		this.aBoolean480 = false;
		this.method6122();
		if (this.aClass160_7 == Static368.aClass160_6) {
			this.method6139();
		}
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(ZB)V")
	public final void method6141(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean476) {
			this.aBoolean476 = arg0;
			this.method6113();
			this.anInt7160 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wu", name = "O", descriptor = "(I)V")
	private void method6142() {
		if (Static200.aClass160_4 == this.aClass160_7) {
			return;
		}
		@Pc(6) Class160 local6 = this.aClass160_7;
		this.aClass160_7 = Static200.aClass160_4;
		if (!local6.method4615()) {
			this.method6106();
		}
		this.method6055();
		this.aFloatArray64 = this.aFloatArray61;
		this.method6139();
		this.anInt7160 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(BI)Lclient!jf;")
	public final Interface11 method6143(@OriginalArg(1) int arg0) {
		if (this.anInterface11_7.method8428() < arg0 * 2) {
			this.anInterface11_7.method8437(arg0);
		}
		return this.anInterface11_7;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8834(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas7 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			this.method6065(arg0, this.aHashtable5.get(arg0));
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "(II)V")
	public final void method6144(@OriginalArg(0) int arg0) {
		if (this.anInt7151 == arg0) {
			return;
		}
		@Pc(26) Class381 local26;
		@Pc(28) boolean local28;
		@Pc(30) boolean local30;
		if (arg0 == 1) {
			local26 = Static475.aClass381_11;
			local28 = true;
			local30 = true;
		} else if (arg0 == 2) {
			local26 = Static39.aClass381_1;
			local30 = false;
			local28 = true;
		} else if (arg0 == 128) {
			local30 = true;
			local26 = Static287.aClass381_12;
			local28 = true;
		} else {
			local30 = false;
			local26 = Static109.aClass381_10;
			local28 = false;
		}
		if (local30 != this.aBoolean471) {
			this.aBoolean471 = local30;
			this.method6129();
		}
		if (this.aBoolean482 != local28) {
			this.aBoolean482 = local28;
			this.method6153();
		}
		if (local26 != this.aClass381_9) {
			this.aClass381_9 = local26;
			this.method6090();
		}
		this.anInt7151 = arg0;
		this.anInt7160 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "()Z")
	@Override
	public final boolean method8799() {
		return false;
	}

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "(Z)V")
	public final void method6145() {
		this.aBoolean462 = false;
		this.method6083();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!lf;I)V")
	public final void method6146(@OriginalArg(0) int arg0, @OriginalArg(1) Class187 arg1) {
		this.method6057(arg1, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "()Z")
	@Override
	public final boolean method8798() {
		return true;
	}

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "()Lclient!ql;")
	@Override
	public final Class154 method8838() {
		return new Class154_Sub2();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!ef;BII)V")
	public abstract void method6147(@OriginalArg(0) Class77 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZIIBZI)V")
	private void method6148(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) boolean local4 = arg0 & this.method8816();
		if (!local4 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			arg4 = 2;
			arg2 = 1;
			arg1 = 0;
		}
		if (arg4 != 0 && arg3) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (arg4 != this.anInt7156) {
			if (this.anInt7156 != 0) {
				this.aClass7Array3[Integer.MAX_VALUE & this.anInt7156].method7197();
			}
			if (arg4 == 0) {
				this.aClass7_3 = null;
			} else {
				this.aClass7_3 = this.aClass7Array3[arg4 & Integer.MAX_VALUE];
				this.aClass7_3.method7195(arg3);
				this.aClass7_3.method7187(arg3);
				this.aClass7_3.method7192(arg1, arg2);
			}
			this.anInt7156 = arg4;
			this.anInt7139 = arg2;
			this.anInt7128 = arg1;
		} else if (this.anInt7156 != 0) {
			this.aClass7Array3[this.anInt7156 & Integer.MAX_VALUE].method7187(arg3);
			if (arg1 != this.anInt7128 || arg2 != this.anInt7139) {
				this.aClass7Array3[this.anInt7156 & Integer.MAX_VALUE].method7192(arg1, arg2);
				this.anInt7128 = arg1;
				this.anInt7139 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "P", descriptor = "(I)V")
	public final void method6149() {
		if (Static477.aClass377_11 != this.aClass377Array3[this.anInt7127]) {
			this.aClass377Array3[this.anInt7127] = Static477.aClass377_11;
			this.aClass154_Sub2Array3[this.anInt7127].method6564();
			this.method6074();
		}
	}

	@OriginalMember(owner = "client!wu", name = "Q", descriptor = "(I)V")
	public final void method6150() {
		if (this.anInt7160 == 8) {
			return;
		}
		this.method6142();
		this.method6141(true);
		this.method6037(true);
		this.method6133(true);
		this.method6144(1);
		this.anInt7160 = 8;
	}

	@OriginalMember(owner = "client!wu", name = "R", descriptor = "(I)V")
	protected void method6151() {
		this.method6052();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class199 method8810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class199_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "(Z)V")
	protected abstract void method6152();

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "(Z)V")
	protected abstract void method6153();

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(I)V")
	@Override
	public void method8818(@OriginalArg(0) int arg0) {
		if (this.aClass84_3 != null) {
			this.aClass84_3.method2188();
		}
		this.anInt7125 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "(II)V")
	public final void method6154(@OriginalArg(0) int arg0) {
		if (this.anInt7162 != arg0) {
			this.anInt7162 = arg0;
			this.method6162();
		}
	}

	@OriginalMember(owner = "client!wu", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7159;
		arg0[1] = this.anInt7137;
		arg0[3] = this.anInt7147;
		arg0[2] = this.anInt7155;
	}

	@OriginalMember(owner = "client!wu", name = "S", descriptor = "(I)I")
	public final int method6155() {
		return this.anInt7130;
	}

	@OriginalMember(owner = "client!wu", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt7000 - 1 <= arg2 && arg1 <= 0 && this.anInt7091 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt7137 = arg1 < 0 ? 0 : arg1;
		this.anInt7147 = this.anInt7000 >= arg3 ? arg3 : 0;
		this.anInt7159 = arg0 >= 0 ? arg0 : 0;
		this.anInt7155 = this.anInt7000 < arg2 ? 0 : arg2;
		if (!this.aBoolean483) {
			this.aBoolean483 = true;
			this.method6112();
		}
		this.method6054();
		this.method6044();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZII[III)Lclient!ch;")
	public abstract Interface3 method6156(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(FFFIFFF)Z")
	private boolean method6157(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface17_16.method8438();
		if (local9 == null) {
			return false;
		}
		@Pc(24) Stream local24 = this.method6131(local9);
		if (Stream.b()) {
			local24.a(arg3);
			local24.a(arg0);
			local24.a(arg5);
			local24.a(arg1);
			local24.a(arg4);
			local24.a(arg2);
		} else {
			local24.b(arg3);
			local24.b(arg0);
			local24.b(arg5);
			local24.b(arg1);
			local24.b(arg4);
			local24.b(arg2);
		}
		local24.c();
		return this.anInterface17_16.method8439();
	}

	@OriginalMember(owner = "client!wu", name = "T", descriptor = "(I)I")
	public final int method6158() {
		return this.anInt7127;
	}

	@OriginalMember(owner = "client!wu", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt7155 = this.anInt7000;
		this.anInt7159 = 0;
		this.anInt7147 = this.anInt7091;
		this.anInt7137 = 0;
		if (this.aBoolean483) {
			this.aBoolean483 = false;
			this.method6112();
		}
		this.method6044();
	}

	@OriginalMember(owner = "client!wu", name = "U", descriptor = "(I)V")
	protected abstract void method6159();

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "(B)V")
	protected abstract void method6160();

	@OriginalMember(owner = "client!wu", name = "V", descriptor = "(I)V")
	public final void method6161() {
		this.method6118(Static364.aClass77_3, 2);
	}

	@OriginalMember(owner = "client!wu", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt7158 && arg1 == this.anInt7148 && arg2 == this.anInt7152) {
			return;
		}
		this.anInt7158 = arg0;
		this.anInt7148 = arg1;
		this.anInt7152 = arg2;
		this.method6164();
		this.method6113();
	}

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "()Z")
	@Override
	public final boolean method8809() {
		return true;
	}

	@OriginalMember(owner = "client!wu", name = "A", descriptor = "(B)V")
	protected abstract void method6162();

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8797(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas7) {
			throw new RuntimeException();
		} else if (!this.aHashtable5.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) Object local53 = this.method6117(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([[IIZZ)Lclient!pf;")
	public abstract Interface19 method6163(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!wu", name = "t", descriptor = "()Z")
	@Override
	public final boolean method8840() {
		return this.aBoolean478;
	}

	@OriginalMember(owner = "client!wu", name = "W", descriptor = "(I)V")
	private void method6164() {
		if (this.aClass7_3 != null) {
			this.aClass7_3.method7190();
		}
		this.method6061();
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method8845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method6115();
		this.method6099();
		this.method6154(arg4);
		this.method6068(0, Static456.aClass187_2);
		this.method6146(0, Static456.aClass187_2);
		this.method6144(arg5);
		this.aClass154_Sub2_15.method4517((float) (arg2 - 1), 1.0F, (float) (arg3 - 1));
		this.aClass154_Sub2_15.method4522((float) arg0 - local7, -local7 + (float) arg1, 0.0F);
		this.method6145();
		this.method6071(false);
		this.method6118(Static101.aClass77_1, 4);
		this.method6071(true);
		this.method6146(0, Static622.aClass187_4);
		this.method6068(0, Static622.aClass187_4);
	}
}
