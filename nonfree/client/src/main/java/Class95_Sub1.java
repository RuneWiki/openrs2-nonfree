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

@OriginalClass("client!ee")
public abstract class Class95_Sub1 extends Class95 {

	@OriginalMember(owner = "client!ee", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!ee", name = "sb", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!ee", name = "cc", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable11;

	@OriginalMember(owner = "client!ee", name = "pc", descriptor = "Lclient!gaa;")
	protected Class123 aClass123_8;

	@OriginalMember(owner = "client!ee", name = "Lc", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!ee", name = "de", descriptor = "I")
	protected int anInt10016;

	@OriginalMember(owner = "client!ee", name = "ge", descriptor = "I")
	public int anInt10019;

	@OriginalMember(owner = "client!ee", name = "he", descriptor = "I")
	public int anInt10020;

	@OriginalMember(owner = "client!ee", name = "ue", descriptor = "[Lclient!fea;")
	protected Class112[] aClass112Array5;

	@OriginalMember(owner = "client!ee", name = "Be", descriptor = "I")
	protected int anInt10030;

	@OriginalMember(owner = "client!ee", name = "Ce", descriptor = "I")
	private int anInt10031;

	@OriginalMember(owner = "client!ee", name = "De", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!ee", name = "Ee", descriptor = "I")
	private int anInt10032;

	@OriginalMember(owner = "client!ee", name = "Je", descriptor = "F")
	private float aFloat190;

	@OriginalMember(owner = "client!ee", name = "Ke", descriptor = "[Lclient!b;")
	private Interface1[] anInterface1Array3;

	@OriginalMember(owner = "client!ee", name = "Pe", descriptor = "[Lclient!vba;")
	protected Class366[] aClass366Array3;

	@OriginalMember(owner = "client!ee", name = "Ye", descriptor = "Lclient!b;")
	public Interface1 anInterface1_3;

	@OriginalMember(owner = "client!ee", name = "af", descriptor = "I")
	protected int anInt10039;

	@OriginalMember(owner = "client!ee", name = "bf", descriptor = "F")
	private float bf;

	@OriginalMember(owner = "client!ee", name = "ef", descriptor = "Lclient!vw;")
	private Class379 aClass379_3;

	@OriginalMember(owner = "client!ee", name = "gf", descriptor = "I")
	public int anInt10040;

	@OriginalMember(owner = "client!ee", name = "kf", descriptor = "Lclient!ev;")
	private Class4 aClass4_3;

	@OriginalMember(owner = "client!ee", name = "mf", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!ee", name = "qf", descriptor = "F")
	public float aFloat195;

	@OriginalMember(owner = "client!ee", name = "tf", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!ee", name = "vf", descriptor = "[Lclient!uaa;")
	protected Class3_Sub13[] aClass3_Sub13Array6;

	@OriginalMember(owner = "client!ee", name = "xf", descriptor = "I")
	protected int anInt10046;

	@OriginalMember(owner = "client!ee", name = "Af", descriptor = "[Lclient!od;")
	protected Class17_Sub2[] aClass17_Sub2Array3;

	@OriginalMember(owner = "client!ee", name = "Bf", descriptor = "Lclient!kga;")
	private Class57_Sub1 aClass57_Sub1_3;

	@OriginalMember(owner = "client!ee", name = "Ef", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!ee", name = "Gf", descriptor = "I")
	protected int anInt10051;

	@OriginalMember(owner = "client!ee", name = "Mf", descriptor = "Z")
	public boolean aBoolean693;

	@OriginalMember(owner = "client!ee", name = "Of", descriptor = "Z")
	protected boolean aBoolean694;

	@OriginalMember(owner = "client!ee", name = "Qf", descriptor = "[Lclient!fea;")
	protected Class112[] aClass112Array6;

	@OriginalMember(owner = "client!ee", name = "Rf", descriptor = "Z")
	protected boolean aBoolean695;

	@OriginalMember(owner = "client!ee", name = "Vf", descriptor = "F")
	public float aFloat201;

	@OriginalMember(owner = "client!ee", name = "cg", descriptor = "I")
	public int anInt10059;

	@OriginalMember(owner = "client!ee", name = "eg", descriptor = "Z")
	public boolean aBoolean697;

	@OriginalMember(owner = "client!ee", name = "fg", descriptor = "I")
	public int anInt10061;

	@OriginalMember(owner = "client!ee", name = "gg", descriptor = "Z")
	public boolean aBoolean698;

	@OriginalMember(owner = "client!ee", name = "kg", descriptor = "I")
	public int anInt10064;

	@OriginalMember(owner = "client!ee", name = "qg", descriptor = "Lclient!hm;")
	public Class149_Sub1 aClass149_Sub1_21;

	@OriginalMember(owner = "client!ee", name = "rg", descriptor = "Lclient!hm;")
	public Class149_Sub1 aClass149_Sub1_22;

	@OriginalMember(owner = "client!ee", name = "sg", descriptor = "Lclient!km;")
	private Interface15 anInterface15_14;

	@OriginalMember(owner = "client!ee", name = "ug", descriptor = "Lclient!eda;")
	private Class94 aClass94_16;

	@OriginalMember(owner = "client!ee", name = "vg", descriptor = "Lclient!eda;")
	public Class94 aClass94_17;

	@OriginalMember(owner = "client!ee", name = "wg", descriptor = "Lclient!eda;")
	private Class94 aClass94_18;

	@OriginalMember(owner = "client!ee", name = "xg", descriptor = "Lclient!hm;")
	public Class149_Sub1 aClass149_Sub1_23;

	@OriginalMember(owner = "client!ee", name = "yg", descriptor = "Lclient!eda;")
	public Class94 aClass94_19;

	@OriginalMember(owner = "client!ee", name = "zg", descriptor = "Lclient!hm;")
	public Class149_Sub1 aClass149_Sub1_24;

	@OriginalMember(owner = "client!ee", name = "Ag", descriptor = "Lclient!hm;")
	public Class149_Sub1 aClass149_Sub1_25;

	@OriginalMember(owner = "client!ee", name = "Bg", descriptor = "Lclient!ra;")
	private Interface22 anInterface22_7;

	@OriginalMember(owner = "client!ee", name = "Cg", descriptor = "Lclient!km;")
	private Interface15 anInterface15_15;

	@OriginalMember(owner = "client!ee", name = "Dg", descriptor = "Lclient!eda;")
	public Class94 aClass94_20;

	@OriginalMember(owner = "client!ee", name = "Eg", descriptor = "Lclient!eda;")
	public Class94 aClass94_21;

	@OriginalMember(owner = "client!ee", name = "Fg", descriptor = "Lclient!hm;")
	public Class149_Sub1 aClass149_Sub1_26;

	@OriginalMember(owner = "client!ee", name = "Gg", descriptor = "Lclient!eda;")
	private Class94 aClass94_22;

	@OriginalMember(owner = "client!ee", name = "Hg", descriptor = "Lclient!hm;")
	public Class149_Sub1 aClass149_Sub1_27;

	@OriginalMember(owner = "client!ee", name = "Ig", descriptor = "Lclient!hm;")
	public Class149_Sub1 aClass149_Sub1_28;

	@OriginalMember(owner = "client!ee", name = "Jg", descriptor = "Lclient!hm;")
	public Class149_Sub1 aClass149_Sub1_29;

	@OriginalMember(owner = "client!ee", name = "Kg", descriptor = "Lclient!hm;")
	public Class149_Sub1 aClass149_Sub1_30;

	@OriginalMember(owner = "client!ee", name = "Lg", descriptor = "Lclient!km;")
	private Interface15 anInterface15_16;

	@OriginalMember(owner = "client!ee", name = "Mg", descriptor = "Z")
	protected boolean aBoolean703;

	@OriginalMember(owner = "client!ee", name = "Ng", descriptor = "I")
	private int anInt10065;

	@OriginalMember(owner = "client!ee", name = "rd", descriptor = "Lclient!qw;")
	private final Class302 aClass302_70 = new Class302();

	@OriginalMember(owner = "client!ee", name = "ce", descriptor = "Z")
	protected boolean aBoolean682 = true;

	@OriginalMember(owner = "client!ee", name = "me", descriptor = "Lclient!od;")
	protected final Class17_Sub2 aClass17_Sub2_15 = new Class17_Sub2();

	@OriginalMember(owner = "client!ee", name = "ne", descriptor = "Lclient!od;")
	public Class17_Sub2 aClass17_Sub2_16 = new Class17_Sub2();

	@OriginalMember(owner = "client!ee", name = "oe", descriptor = "Lclient!od;")
	public final Class17_Sub2 aClass17_Sub2_17 = new Class17_Sub2();

	@OriginalMember(owner = "client!ee", name = "pe", descriptor = "Lclient!od;")
	protected final Class17_Sub2 aClass17_Sub2_18 = new Class17_Sub2();

	@OriginalMember(owner = "client!ee", name = "qe", descriptor = "Lclient!od;")
	private final Class17_Sub2 aClass17_Sub2_19 = new Class17_Sub2();

	@OriginalMember(owner = "client!ee", name = "re", descriptor = "Lclient!od;")
	private final Class17_Sub2 aClass17_Sub2_20 = new Class17_Sub2();

	@OriginalMember(owner = "client!ee", name = "ve", descriptor = "I")
	protected final int anInt10027 = 0;

	@OriginalMember(owner = "client!ee", name = "se", descriptor = "I")
	public int anInt10025 = 0;

	@OriginalMember(owner = "client!ee", name = "ye", descriptor = "F")
	public float aFloat188 = 3584.0F;

	@OriginalMember(owner = "client!ee", name = "ze", descriptor = "Z")
	private boolean aBoolean683 = false;

	@OriginalMember(owner = "client!ee", name = "Ge", descriptor = "Z")
	protected boolean aBoolean685 = true;

	@OriginalMember(owner = "client!ee", name = "te", descriptor = "I")
	protected int anInt10026 = 0;

	@OriginalMember(owner = "client!ee", name = "Me", descriptor = "Z")
	private boolean aBoolean686 = false;

	@OriginalMember(owner = "client!ee", name = "Re", descriptor = "F")
	public float aFloat192 = 1.0F;

	@OriginalMember(owner = "client!ee", name = "Oe", descriptor = "F")
	public float aFloat191 = -1.0F;

	@OriginalMember(owner = "client!ee", name = "xe", descriptor = "I")
	protected int anInt10028 = 0;

	@OriginalMember(owner = "client!ee", name = "Te", descriptor = "Z")
	protected boolean aBoolean688 = false;

	@OriginalMember(owner = "client!ee", name = "He", descriptor = "I")
	protected int anInt10033 = 0;

	@OriginalMember(owner = "client!ee", name = "cf", descriptor = "Z")
	protected boolean aBoolean690 = true;

	@OriginalMember(owner = "client!ee", name = "lf", descriptor = "I")
	public int anInt10042 = 128;

	@OriginalMember(owner = "client!ee", name = "Ue", descriptor = "Z")
	protected boolean aBoolean689 = true;

	@OriginalMember(owner = "client!ee", name = "uf", descriptor = "I")
	private int anInt10045 = 16777215;

	@OriginalMember(owner = "client!ee", name = "Cf", descriptor = "I")
	public int anInt10048 = 8;

	@OriginalMember(owner = "client!ee", name = "jf", descriptor = "Z")
	protected boolean aBoolean691 = false;

	@OriginalMember(owner = "client!ee", name = "rf", descriptor = "I")
	public int anInt10044 = 512;

	@OriginalMember(owner = "client!ee", name = "Qe", descriptor = "Z")
	protected boolean aBoolean687 = false;

	@OriginalMember(owner = "client!ee", name = "we", descriptor = "[F")
	private final float[] aFloatArray59 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ee", name = "ff", descriptor = "[F")
	private final float[] aFloatArray61 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ee", name = "hf", descriptor = "I")
	public int anInt10041 = 0;

	@OriginalMember(owner = "client!ee", name = "nf", descriptor = "[F")
	private final float[] aFloatArray62 = new float[16];

	@OriginalMember(owner = "client!ee", name = "sf", descriptor = "[F")
	public final float[] aFloatArray64 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ee", name = "Se", descriptor = "I")
	protected int anInt10035 = 3584;

	@OriginalMember(owner = "client!ee", name = "df", descriptor = "[Lclient!ev;")
	private final Class4[] aClass4Array3 = new Class4[10];

	@OriginalMember(owner = "client!ee", name = "Fe", descriptor = "Z")
	protected boolean aBoolean684 = true;

	@OriginalMember(owner = "client!ee", name = "Hf", descriptor = "I")
	public int anInt10052 = 512;

	@OriginalMember(owner = "client!ee", name = "Ae", descriptor = "I")
	public int anInt10029 = -1;

	@OriginalMember(owner = "client!ee", name = "Uf", descriptor = "I")
	private int anInt10056 = -1;

	@OriginalMember(owner = "client!ee", name = "Lf", descriptor = "I")
	public int anInt10055 = 3;

	@OriginalMember(owner = "client!ee", name = "Df", descriptor = "I")
	public int anInt10049 = -1;

	@OriginalMember(owner = "client!ee", name = "Jf", descriptor = "I")
	private int anInt10054 = -1;

	@OriginalMember(owner = "client!ee", name = "We", descriptor = "I")
	private int anInt10037 = 0;

	@OriginalMember(owner = "client!ee", name = "of", descriptor = "[F")
	protected float[] aFloatArray63 = this.aFloatArray59;

	@OriginalMember(owner = "client!ee", name = "Xe", descriptor = "I")
	private int anInt10038 = 0;

	@OriginalMember(owner = "client!ee", name = "pf", descriptor = "I")
	private int anInt10043 = 0;

	@OriginalMember(owner = "client!ee", name = "Ff", descriptor = "I")
	public int anInt10050 = 50;

	@OriginalMember(owner = "client!ee", name = "Pf", descriptor = "F")
	public float aFloat200 = 1.0F;

	@OriginalMember(owner = "client!ee", name = "zf", descriptor = "I")
	private int anInt10047 = 1;

	@OriginalMember(owner = "client!ee", name = "Ve", descriptor = "I")
	protected final int anInt10036 = 0;

	@OriginalMember(owner = "client!ee", name = "ag", descriptor = "[F")
	private final float[] aFloatArray67 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!ee", name = "Yf", descriptor = "Z")
	protected boolean aBoolean696 = true;

	@OriginalMember(owner = "client!ee", name = "wf", descriptor = "F")
	public float aFloat197 = 3584.0F;

	@OriginalMember(owner = "client!ee", name = "Kf", descriptor = "Z")
	private boolean aBoolean692 = false;

	@OriginalMember(owner = "client!ee", name = "Wf", descriptor = "F")
	private float aFloat202 = 1.0F;

	@OriginalMember(owner = "client!ee", name = "Xf", descriptor = "Lclient!hja;")
	protected Class147 aClass147_7 = Static343.aClass147_4;

	@OriginalMember(owner = "client!ee", name = "Ie", descriptor = "[F")
	private final float[] aFloatArray60 = new float[16];

	@OriginalMember(owner = "client!ee", name = "Nf", descriptor = "F")
	public float aFloat199 = 1.0F;

	@OriginalMember(owner = "client!ee", name = "yf", descriptor = "[F")
	public final float[] aFloatArray65 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!ee", name = "dg", descriptor = "I")
	private int anInt10060 = 0;

	@OriginalMember(owner = "client!ee", name = "hg", descriptor = "I")
	protected int anInt10062 = 0;

	@OriginalMember(owner = "client!ee", name = "Ze", descriptor = "F")
	public float aFloat193 = 1.0F;

	@OriginalMember(owner = "client!ee", name = "If", descriptor = "I")
	protected int anInt10053 = 0;

	@OriginalMember(owner = "client!ee", name = "Sf", descriptor = "[F")
	private final float[] aFloatArray66 = new float[16];

	@OriginalMember(owner = "client!ee", name = "ig", descriptor = "I")
	public int anInt10063 = 0;

	@OriginalMember(owner = "client!ee", name = "bg", descriptor = "I")
	private int anInt10058 = -1;

	@OriginalMember(owner = "client!ee", name = "lg", descriptor = "Z")
	private boolean aBoolean700 = false;

	@OriginalMember(owner = "client!ee", name = "jg", descriptor = "Z")
	protected boolean aBoolean699 = false;

	@OriginalMember(owner = "client!ee", name = "ng", descriptor = "Lclient!wv;")
	protected Class393 aClass393_11 = Static598.aClass393_10;

	@OriginalMember(owner = "client!ee", name = "mg", descriptor = "Z")
	private boolean aBoolean701 = false;

	@OriginalMember(owner = "client!ee", name = "og", descriptor = "Z")
	private boolean aBoolean702 = false;

	@OriginalMember(owner = "client!ee", name = "pg", descriptor = "F")
	public float aFloat203 = -1.0F;

	@OriginalMember(owner = "client!ee", name = "Tf", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!ee", name = "tg", descriptor = "Lclient!od;")
	private final Class17_Sub2 aClass17_Sub2_21 = new Class17_Sub2();

	@OriginalMember(owner = "client!ee", name = "Le", descriptor = "I")
	protected final int anInt10034;

	@OriginalMember(owner = "client!ee", name = "Xc", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas13;

	@OriginalMember(owner = "client!ee", name = "Gb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!ee", name = "Jd", descriptor = "Lclient!uq;")
	protected final Class362 aClass362_142;

	@OriginalMember(owner = "client!ee", name = "kb", descriptor = "Ljava/lang/Object;")
	protected final Object anObject19;

	@OriginalMember(owner = "client!ee", name = "yd", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
	private int anInt9849;

	@OriginalMember(owner = "client!ee", name = "dd", descriptor = "I")
	public int anInt9970;

	@OriginalMember(owner = "client!ee", name = "Zf", descriptor = "I")
	public final int anInt10057;

	@OriginalMember(owner = "client!ee", name = "Yb", descriptor = "I")
	private int anInt9919;

	@OriginalMember(owner = "client!ee", name = "Gd", descriptor = "I")
	public int anInt9996;

	@OriginalMember(owner = "client!ee", name = "Bc", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!ee", name = "Ne", descriptor = "Lclient!pea;")
	private final Class278 aClass278_3;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!uq;II)V")
	protected Class95_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) Class362 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		try {
			this.anInt10034 = arg4;
			this.aCanvas12 = this.aCanvas13 = arg0;
			this.aClass362_142 = arg3;
			this.anObject20 = this.anObject19 = arg1;
			@Pc(307) Dimension local307 = arg0.getSize();
			this.anInt9970 = this.anInt9849 = local307.height;
			this.anInt10057 = arg5;
			this.anInt9996 = this.anInt9919 = local307.width;
			Static253.method3817(true, false);
			if (super.anInterface2_12 == null) {
				this.aNativeInterface3 = new NativeInterface(0, this.anInt10057);
				this.aClass278_3 = null;
			} else {
				this.aClass278_3 = new Class278(this, super.anInterface2_12);
				this.aNativeInterface3 = new NativeInterface(super.anInterface2_12.method8325(), this.anInt10057);
				for (@Pc(364) int local364 = 0; local364 < super.anInterface2_12.method8325(); local364++) {
					@Pc(372) Class250 local372 = super.anInterface2_12.method8330(local364);
					if (local372 != null) {
						this.aNativeInterface3.initTextureMetrics(local364, local372.aByte96, local372.aByte94);
					}
				}
			}
		} catch (@Pc(391) Throwable local391) {
			local391.printStackTrace();
			this.method8007();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "()Lclient!al;")
	@Override
	public final Class17 method8013() {
		return this.aClass17_Sub2_21;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZII)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method8074(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		return this.aNativeHeap4.a(arg1, arg0);
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
	private void method8075() {
		this.method8117();
		if (this.aClass4_3 != null) {
			this.aClass4_3.method8492();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([IIIIIZ)Lclient!hh;")
	@Override
	public final Class6 method8005(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class6_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
	public final void method8076() {
		this.method8116();
		this.method8075();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZ)Lclient!hh;")
	@Override
	public final Class6 method8025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class6_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!mq;ZI)V")
	protected abstract void method8077(@OriginalArg(1) Class235 arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[Lclient!uaa;)V")
	@Override
	public final void method8018(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub13[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass3_Sub13Array6[local3] = arg1[local3];
		}
		this.anInt10030 = arg0;
		if (this.aClass393_11.method9020()) {
			this.method8111();
		}
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(II)V")
	public final void method8078(@OriginalArg(0) int arg0) {
		if (this.anInt10046 != arg0) {
			this.anInt10046 = arg0;
			this.method8207();
		}
	}

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "(I)I")
	public final int method8079() {
		return this.anInt10054;
	}

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "(I)V")
	private void method8080() {
		this.aBoolean701 = false;
		this.method8160();
		if (Static106.aClass393_3 == this.aClass393_11) {
			this.method8075();
		}
	}

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "()V")
	@Override
	public final void method8027() {
		if (this.aClass278_3 != null) {
			this.aClass278_3.method6135();
		}
	}

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "(I)Lclient!od;")
	public final Class17_Sub2 method8081() {
		if (!this.aBoolean683) {
			this.aClass17_Sub2_20.method5835(this.aClass17_Sub2_18, this.aClass17_Sub2_15);
			this.aBoolean683 = true;
		}
		return this.aClass17_Sub2_20;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIIZZI)V")
	private void method8082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) boolean local4 = arg2 & this.method8002();
		if (!local4 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			arg0 = 2;
			arg4 = 1;
			arg1 = 0;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt10043 != arg0) {
			if (this.anInt10043 != 0) {
				this.aClass4Array3[this.anInt10043 & Integer.MAX_VALUE].method8494();
			}
			if (arg0 == 0) {
				this.aClass4_3 = null;
			} else {
				this.aClass4_3 = this.aClass4Array3[Integer.MAX_VALUE & arg0];
				this.aClass4_3.method8481(arg3);
				this.aClass4_3.method8482(arg3);
				this.aClass4_3.method8483(arg4, arg1);
			}
			this.anInt10043 = arg0;
			this.anInt10060 = arg1;
			this.anInt10037 = arg4;
		} else if (this.anInt10043 != 0) {
			this.aClass4Array3[this.anInt10043 & Integer.MAX_VALUE].method8482(arg3);
			if (arg1 != this.anInt10060 || this.anInt10037 != arg4) {
				this.aClass4Array3[Integer.MAX_VALUE & this.anInt10043].method8483(arg4, arg1);
				this.anInt10037 = arg4;
				this.anInt10060 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8024(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IF)V")
	public final void method8083(@OriginalArg(1) float arg0) {
		if (this.aFloat202 != arg0) {
			this.aFloat202 = arg0;
			this.method8173();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!wj;IBILclient!g;)Lclient!fk;")
	public abstract Interface8 method8084(@OriginalArg(0) Class389 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class122 arg3);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZI[FIIILclient!g;)Lclient!fk;")
	protected abstract Interface8 method8085(@OriginalArg(1) boolean arg0, @OriginalArg(3) float[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class122 arg4);

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt10016 + this.anInt10020 + this.anInt10019;
	}

	@OriginalMember(owner = "client!ee", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean698 = false;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method8036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) float local11 = (float) arg2 - (float) arg0;
		@Pc(17) float local17 = (float) arg3 - (float) arg1;
		@Pc(42) float local42;
		if (local11 == 0.0F && local17 == 0.0F) {
			local11 = 1.0F;
		} else {
			local42 = (float) (1.0D / Math.sqrt((double) (local11 * local11 + local17 * local17)));
			local11 *= local42;
			local17 *= local42;
		}
		this.method8178();
		this.method8078(arg4);
		this.method8108(0, Static576.aClass235_3);
		this.method8122(Static576.aClass235_3, 0);
		this.method8162(1);
		this.method8144();
		this.method8169(false);
		@Pc(84) int local84 = arg7 % (arg6 + arg5);
		local42 = (float) arg5 * local11;
		@Pc(94) float local94 = local17 * (float) arg5;
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = local42;
		@Pc(102) float local102 = local94;
		if (local84 <= arg5) {
			local102 = (float) (arg5 - local84) * local17;
			local100 = (float) (arg5 - local84) * local11;
		} else {
			local98 = (float) (arg6 + arg5 - local84) * local17;
			local96 = local11 * (float) (arg6 + arg5 - local84);
		}
		@Pc(147) float local147 = (float) arg0 + local96;
		@Pc(152) float local152 = local98 + (float) arg1;
		@Pc(157) float local157 = (float) arg6 * local11;
		@Pc(162) float local162 = (float) arg6 * local17;
		while (true) {
			if (arg2 <= arg0) {
				if (local147 < (float) arg2) {
					break;
				}
				if (local147 + local100 < (float) arg2) {
					local100 = (float) arg2 - local147;
				}
			} else {
				if ((float) arg2 < local147) {
					break;
				}
				if (local100 + local147 > (float) arg2) {
					local100 = (float) arg2 - local147;
				}
			}
			if (arg1 < arg3) {
				if (local152 > (float) arg3) {
					break;
				}
				if (local152 + local102 > (float) arg3) {
					local102 = (float) arg3 - local152;
				}
			} else {
				if ((float) arg3 > local152) {
					break;
				}
				if (local102 + local152 < (float) arg3) {
					local102 = (float) arg3 - local152;
				}
			}
			if (!this.method8177(0.0F, local147, local100 + local147, local152, local152 + local102, 0.0F)) {
				return;
			}
			this.method8183();
			local147 += local157 + local100;
			local152 += local162 + local102;
			local102 = local94;
			local100 = local42;
		}
		this.method8169(true);
		this.method8122(Static665.aClass235_4, 0);
		this.method8108(0, Static665.aClass235_4);
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)V")
	@Override
	public final void method8060(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "(I)V")
	public final void method8086() {
		if (this.anInt10032 == 8) {
			return;
		}
		this.method8137();
		this.method8099(true);
		this.method8154(true);
		this.method8095(true);
		this.method8162(1);
		this.anInt10032 = 8;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)I")
	@Override
	public final int method8012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BZ)V")
	public final void method8087(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean685) {
			this.aBoolean685 = arg0;
			this.method8175();
		}
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(Z)V")
	private void method8088() {
		if (Static21.aClass393_8 == this.aClass393_11) {
			@Pc(7) float local7 = this.method8128();
			this.aClass17_Sub2_15.method5856(local7, 0.0F, local7);
		}
		this.aBoolean683 = false;
		this.method8203();
		if (this.aClass4_3 != null) {
			this.aClass4_3.method8489();
		}
	}

	@OriginalMember(owner = "client!ee", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass17_Sub2_16.aFloat134 * (float) arg2 + this.aClass17_Sub2_16.aFloat129 * (float) arg1 + this.aClass17_Sub2_16.aFloat132 * (float) arg0 + this.aClass17_Sub2_16.aFloat131;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg5 * this.aClass17_Sub2_16.aFloat134 + (float) arg3 * this.aClass17_Sub2_16.aFloat132 + this.aClass17_Sub2_16.aFloat129 * (float) arg4 + this.aClass17_Sub2_16.aFloat131;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt10050 > local32 && local63 < (float) this.anInt10050) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt10035 && (float) this.anInt10035 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt10052 * ((float) arg2 * this.aClass17_Sub2_16.aFloat126 + (float) arg0 * this.aClass17_Sub2_16.aFloat137 + (float) arg1 * this.aClass17_Sub2_16.aFloat128 + this.aClass17_Sub2_16.aFloat136) / local32);
		@Pc(167) int local167 = (int) ((this.aClass17_Sub2_16.aFloat136 + (float) arg3 * this.aClass17_Sub2_16.aFloat137 + (float) arg4 * this.aClass17_Sub2_16.aFloat128 + (float) arg5 * this.aClass17_Sub2_16.aFloat126) * (float) this.anInt10052 / local63);
		if ((float) local135 < this.aFloat194 && (float) local167 < this.aFloat194) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat196 && (float) local167 > this.aFloat196) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt10044 * ((float) arg2 * this.aClass17_Sub2_16.aFloat135 + (float) arg0 * this.aClass17_Sub2_16.aFloat133 + this.aClass17_Sub2_16.aFloat130 * (float) arg1 + this.aClass17_Sub2_16.aFloat127) / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt10044 * (this.aClass17_Sub2_16.aFloat127 + (float) arg4 * this.aClass17_Sub2_16.aFloat130 + (float) arg3 * this.aClass17_Sub2_16.aFloat133 + this.aClass17_Sub2_16.aFloat135 * (float) arg5) / local63);
		if (this.aFloat201 > (float) local233 && (float) local265 < this.aFloat201) {
			local7 |= 0x4;
		} else if (this.aFloat198 < (float) local233 && this.aFloat198 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8073(@OriginalArg(0) Canvas arg0) {
		this.anObject20 = null;
		this.aCanvas12 = null;
		if (arg0 == null || arg0 == this.aCanvas13) {
			this.aCanvas12 = this.aCanvas13;
			this.anObject20 = this.anObject19;
		} else if (this.aHashtable11.containsKey(arg0)) {
			this.anObject20 = this.aHashtable11.get(arg0);
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.anObject20 == null) {
			throw new RuntimeException();
		}
		this.method8094(this.aCanvas12, this.anObject20);
		this.method8134();
	}

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "(I)V")
	protected abstract void method8089();

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
	@Override
	public final void method8053(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass278_3 != null) {
			this.aClass278_3.method6135();
		}
		this.anInt10042 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat199 != arg0) {
			this.aFloat199 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method8164();
			this.method8126();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)Lclient!km;")
	public abstract Interface15 method8090(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "()Z")
	@Override
	public final boolean method8017() {
		return this.aBoolean694;
	}

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "(I)V")
	private void method8091() {
		this.aFloatArray62[10] = this.bf;
		this.aFloatArray62[14] = this.aFloat190;
		this.aFloat197 = ((float) -this.anInt10035 + this.aFloatArray62[14]) / this.aFloatArray62[10];
	}

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "(I)I")
	public final int method8092() {
		return this.anInt10026;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
	protected abstract void method8093();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method8094(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(BZ)V")
	public final void method8095(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean687 != arg0) {
			this.aBoolean687 = arg0;
			this.method8093();
			this.anInt10032 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "(I)I")
	public final int method8096() {
		return this.anInt10056;
	}

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "()Lclient!al;")
	@Override
	public final Class17 method8063() {
		return new Class17_Sub2();
	}

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "(I)V")
	private void method8097() {
		this.aFloat188 = (float) this.anInt10035;
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(Z)V")
	public final void method8098() {
		this.aBoolean682 = false;
		this.method8088();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)V")
	public final void method8099(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean695 != arg0) {
			this.aBoolean695 = arg0;
			this.method8175();
			this.anInt10032 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method8031(@OriginalArg(0) Class3_Sub51 arg0) {
		this.aNativeHeap4 = ((Class3_Sub51_Sub2) arg0).aNativeHeap6;
		this.aNativeHeapBuffer8 = this.aNativeHeap4.a(32768, false);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method8034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static391.method5475(arg2, arg0, arg3, this, arg1);
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V")
	private void method8100() {
		this.anInterface15_14 = this.method8090(false);
		this.anInterface15_14.method5530(140, 28);
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			@Pc(34) Buffer local34 = this.anInterface15_14.method5529();
			if (local34 != null) {
				@Pc(41) Stream local41 = this.method8157(local34);
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
				local41.a();
				if (this.anInterface15_14.method5528()) {
					break;
				}
			}
		}
		this.aClass94_18 = this.method8185(new Class306[] { new Class306(new Class356[] { Static610.aClass356_1, Static610.aClass356_5, Static610.aClass356_5 }) });
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZLclient!mq;ZI)V")
	public abstract void method8101(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class235 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "(I)Lclient!od;")
	public final Class17_Sub2 method8102() {
		return this.aClass17_Sub2Array3[this.anInt10026];
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIZ)Lclient!hh;")
	@Override
	public final Class6 method7998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class6_Sub2 local11 = new Class6_Sub2(this, arg2, arg3, arg4);
		local11.method5122(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!ee", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass17_Sub2_16.method5857((float) arg0, (float) arg1, (float) arg2);
		if ((float) this.anInt10050 > local14 || local14 > (float) this.anInt10035) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt10052 * this.aClass17_Sub2_16.method5855((float) arg2, (float) arg0, (float) arg1) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt10044 * this.aClass17_Sub2_16.method5836((float) arg1, (float) arg2, (float) arg0) / (float) arg3);
		arg4[2] = (int) local14;
		arg4[0] = (int) ((float) local58 - this.aFloat194);
		arg4[1] = (int) ((float) local77 - this.aFloat201);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZII[IZ)Lclient!fk;")
	public final Interface8 method8103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		return this.method8167(arg3, 0, arg0, arg1, arg2, 0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!od;I)V")
	public final void method8104(@OriginalArg(0) Class17_Sub2 arg0) {
		this.aClass17_Sub2_15.method6233(arg0);
		this.aBoolean682 = false;
		this.method8088();
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)V")
	protected abstract void method8105();

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "(I)V")
	private void method8106() {
		this.aFloat196 = (float) (this.anInt10062 - this.anInt10025);
		this.aFloat198 = (float) (this.anInt10053 - this.anInt10063);
		this.aFloat194 = (float) (this.anInt10033 - this.anInt10025);
		this.aFloat201 = (float) (this.anInt10028 - this.anInt10063);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	protected abstract void method8107(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!mq;)V")
	public final void method8108(@OriginalArg(1) int arg0, @OriginalArg(2) Class235 arg1) {
		this.method8101(arg0, false, arg1, false);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIILclient!fga;ILclient!ra;)V")
	public abstract void method8109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class115 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface22 arg5);

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "(I)V")
	private void method8110() {
		this.anInterface15_15 = this.method8090(false);
		this.anInterface15_15.method5530(3096, 12);
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			@Pc(36) Buffer local36 = this.anInterface15_15.method5529();
			if (local36 != null) {
				@Pc(43) Stream local43 = this.method8157(local36);
				local43.a(0.0F);
				local43.a(0.0F);
				local43.a(0.0F);
				for (@Pc(54) int local54 = 0; local54 <= 256; local54++) {
					@Pc(65) double local65 = (double) (local54 * 2) * 3.141592653589793D / 256.0D;
					@Pc(69) float local69 = (float) Math.cos(local65);
					@Pc(73) float local73 = (float) Math.sin(local65);
					if (Stream.b()) {
						local43.a(local73);
						local43.a(local69);
						local43.a(0.0F);
					} else {
						local43.b(local73);
						local43.b(local69);
						local43.b(0.0F);
					}
				}
				local43.a();
				if (this.anInterface15_15.method5528()) {
					break;
				}
			}
		}
		this.aClass94_22 = this.method8185(new Class306[] { new Class306(Static610.aClass356_1) });
	}

	@OriginalMember(owner = "client!ee", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass17_Sub2_16.method5857((float) arg0, (float) arg1, (float) arg2);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt10052 * this.aClass17_Sub2_16.method5855((float) arg2, (float) arg0, (float) arg1) / local14);
			local58 = (int) ((float) this.anInt10044 * this.aClass17_Sub2_16.method5836((float) arg1, (float) arg2, (float) arg0) / local14);
		} else {
			local40 = this.anInt10025;
			local58 = this.anInt10063;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat194);
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local58 - this.aFloat201);
	}

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "(I)V")
	protected void method8111() {
		this.anInt10051 = this.anInt10030;
		this.anInt10030 = 0;
	}

	@OriginalMember(owner = "client!ee", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt10025, this.anInt10063, this.anInt10052, this.anInt10044 };
	}

	@OriginalMember(owner = "client!ee", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt9996 - 1 <= arg2 && arg1 <= 0 && this.anInt9970 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt10053 = this.anInt9996 < arg3 ? 0 : arg3;
		this.anInt10062 = arg2 > this.anInt9996 ? 0 : arg2;
		this.anInt10033 = arg0 >= 0 ? arg0 : 0;
		this.anInt10028 = arg1 >= 0 ? arg1 : 0;
		if (!this.aBoolean703) {
			this.aBoolean703 = true;
			this.method8152();
		}
		this.method8114();
		this.method8106();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZI[BLclient!g;)Lclient!fk;")
	public final Interface8 method8112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class122 arg4) {
		return this.method8171(arg1, arg4, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(II)I")
	@Override
	public final int method8047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "(I)V")
	protected abstract void method8113();

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(Z)V")
	protected abstract void method8114();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZB)Lclient!ra;")
	public abstract Interface22 method8115(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7999() {
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(B)V")
	public final void method8116() {
		if (this.aClass393_11 == Static598.aClass393_10) {
			return;
		}
		@Pc(6) Class393 local6 = this.aClass393_11;
		this.aClass393_11 = Static598.aClass393_10;
		if (local6.method9020()) {
			this.method8140();
		}
		this.anInt10032 &= 0xFFFFFFE0;
		this.aFloatArray63 = this.aFloatArray59;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!tv;I)V")
	@Override
	public final void method8051(@OriginalArg(0) Class347 arg0, @OriginalArg(1) int arg1) {
		this.aClass379_3.method8733(arg1, this, arg0);
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(B)V")
	protected abstract void method8117();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZIIZ)V")
	public final void method8118(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt10058 || this.aBoolean698 != this.aBoolean692) {
			@Pc(30) Interface8 local30 = null;
			@Pc(32) int local32 = 0;
			@Pc(34) byte local34 = 0;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = this.aBoolean698 ? 3 : 0;
			if (arg1 < 0) {
				this.method8142();
			} else {
				local30 = this.aClass278_3.method6136(arg1);
				@Pc(65) Class250 local65 = super.anInterface2_12.method8330(arg1);
				if (local65.aByte95 == 0 && local65.aByte92 == 0) {
					this.method8142();
				} else {
					@Pc(86) int local86 = local65.aBoolean462 ? 64 : 128;
					@Pc(90) int local90 = local86 * 50;
					@Pc(94) Class17_Sub2 local94 = this.method8141();
					local94.method5846(0.0F, (float) (this.anInt10064 % local90 * local65.aByte95) / (float) local90, (float) (this.anInt10064 % local90 * local65.aByte92) / (float) local90);
					this.method8148(Static345.aClass366_6);
				}
				local32 = local65.anInt6669;
				if (!this.aBoolean698) {
					local43 = local65.aByte93;
					local34 = local65.aByte97;
					local36 = local65.anInt6670;
				}
			}
			this.method8082(local43, local34, arg0, arg2, local36);
			if (this.aClass4_3 == null) {
				this.method8147(local30);
				this.method8129(local32);
			} else {
				this.aClass4_3.method8484(local30, local32);
			}
			this.anInt10058 = arg1;
			this.aBoolean692 = this.aBoolean698;
		}
		this.anInt10032 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(B)Lclient!od;")
	public final Class17_Sub2 method8119() {
		return this.aClass17_Sub2_15;
	}

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "(I)Lclient!faa;")
	public final Interface7 method8120() {
		return this.aClass57_Sub1_3 == null ? null : this.aClass57_Sub1_3.method4537();
	}

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "(B)V")
	private void method8121() {
		if (Static21.aClass393_8 == this.aClass393_11) {
			return;
		}
		@Pc(10) Class393 local10 = this.aClass393_11;
		this.aClass393_11 = Static21.aClass393_8;
		if (local10.method9020()) {
			this.method8140();
		}
		this.method8180();
		this.aFloatArray63 = this.aFloatArray66;
		this.method8075();
		this.anInt10032 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ee", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean698) {
			throw new RuntimeException("");
		}
		this.anInt10056 = arg1;
		this.anInt10054 = arg2;
		this.anInt10031 = arg0;
		this.anInt10038 = arg3;
		if (this.aBoolean692) {
			this.aClass4Array3[3].method8490();
			this.aClass4Array3[3].method8486();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!mq;I)V")
	public final void method8122(@OriginalArg(1) Class235 arg0, @OriginalArg(2) int arg1) {
		this.method8077(arg0, arg1);
	}

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "(B)V")
	protected abstract void method8123();

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "()Z")
	@Override
	public final boolean method8061() {
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "(I)Lclient!od;")
	public final Class17_Sub2 method8124() {
		return this.aClass17_Sub2_18;
	}

	@OriginalMember(owner = "client!ee", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt10035;
	}

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "(I)V")
	private void method8125() {
		this.aBoolean700 = false;
		if (this.aClass393_11 == Static21.aClass393_8) {
			this.method8180();
			this.method8075();
		}
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(Z)V")
	protected abstract void method8126();

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "(I)F")
	protected abstract float method8128();

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(II)V")
	public final void method8129(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method8195(Static134.aClass112_9, Static134.aClass112_9);
		} else if (arg0 == 0) {
			this.method8195(Static617.aClass112_28, Static617.aClass112_28);
		} else if (arg0 == 2) {
			this.method8195(Static134.aClass112_9, Static315.aClass112_22);
		} else if (arg0 == 3) {
			this.method8195(Static617.aClass112_28, Static461.aClass112_52);
			return;
		} else if (arg0 == 4) {
			this.method8195(Static214.aClass112_46, Static214.aClass112_46);
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "(B)V")
	protected abstract void method8130();

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8067(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas13) {
			local5 = this.anObject20;
		} else if (this.aHashtable11.containsKey(arg0)) {
			local5 = this.aHashtable11.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method8189(arg0, local5);
		if (arg0 == this.aCanvas12) {
			this.method8134();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([I)V")
	@Override
	public final void method7994(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9996;
		arg0[1] = this.anInt9970;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(ZI)V")
	public final void method8131(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean688 != arg0) {
			this.aBoolean688 = arg0;
			this.method8188();
		}
	}

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "(Z)V")
	protected abstract void method8132();

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass17_Sub2_16.aFloat131 + (float) arg2 * this.aClass17_Sub2_16.aFloat134 + (float) arg1 * this.aClass17_Sub2_16.aFloat129 + this.aClass17_Sub2_16.aFloat132 * (float) arg0;
		@Pc(57) float local57 = this.aClass17_Sub2_16.aFloat129 * (float) arg4 + this.aClass17_Sub2_16.aFloat132 * (float) arg3 + (float) arg5 * this.aClass17_Sub2_16.aFloat134 + this.aClass17_Sub2_16.aFloat131;
		if ((float) this.anInt10050 > local32 && local57 < (float) this.anInt10050) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt10035 && local57 > (float) this.anInt10035) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass17_Sub2_16.aFloat136 + this.aClass17_Sub2_16.aFloat137 * (float) arg0 + (float) arg1 * this.aClass17_Sub2_16.aFloat128 + (float) arg2 * this.aClass17_Sub2_16.aFloat126) * (float) this.anInt10052 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt10052 * (this.aClass17_Sub2_16.aFloat137 * (float) arg3 + (float) arg4 * this.aClass17_Sub2_16.aFloat128 + this.aClass17_Sub2_16.aFloat126 * (float) arg5 + this.aClass17_Sub2_16.aFloat136) / (float) arg6);
		if ((float) local124 < this.aFloat194 && (float) local157 < this.aFloat194) {
			local7 |= 0x1;
		} else if ((float) local124 > this.aFloat196 && this.aFloat196 < (float) local157) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt10044 * ((float) arg1 * this.aClass17_Sub2_16.aFloat130 + this.aClass17_Sub2_16.aFloat133 * (float) arg0 + (float) arg2 * this.aClass17_Sub2_16.aFloat135 + this.aClass17_Sub2_16.aFloat127) / (float) arg6);
		@Pc(257) int local257 = (int) (((float) arg5 * this.aClass17_Sub2_16.aFloat135 + this.aClass17_Sub2_16.aFloat133 * (float) arg3 + (float) arg4 * this.aClass17_Sub2_16.aFloat130 + this.aClass17_Sub2_16.aFloat127) * (float) this.anInt10044 / (float) arg6);
		if ((float) local224 < this.aFloat201 && this.aFloat201 > (float) local257) {
			local7 |= 0x4;
		} else if (this.aFloat198 < (float) local224 && this.aFloat198 < (float) local257) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!km;I)V")
	public abstract void method8133(@OriginalArg(1) Interface15 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "(B)V")
	private void method8134() {
		if (this.aCanvas12 == null) {
			this.anInt9919 = this.anInt9849 = 1;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas12.getSize();
			this.anInt9919 = local14.width;
			this.anInt9849 = local14.height;
		}
		this.anInt9970 = this.anInt9849;
		this.anInt9996 = this.anInt9919;
		this.method8125();
		this.method8080();
		this.method8173();
		this.method8138();
		this.method8106();
		this.method8116();
		this.la();
	}

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "(I)V")
	public final void method8135() {
		this.anInterface1Array3 = new Interface1[this.anInt10040];
		this.aClass112Array5 = new Class112[this.anInt10040];
		this.aClass366Array3 = new Class366[this.anInt10040];
		this.aClass112Array6 = new Class112[this.anInt10040];
		this.aClass17_Sub2Array3 = new Class17_Sub2[this.anInt10040];
		for (@Pc(32) int local32 = 0; local32 < this.anInt10040; local32++) {
			this.aClass112Array5[local32] = Static617.aClass112_28;
			this.aClass112Array6[local32] = Static617.aClass112_28;
			this.aClass366Array3[local32] = Static70.aClass366_1;
			this.aClass17_Sub2Array3[local32] = new Class17_Sub2();
		}
		this.aClass3_Sub13Array6 = new Class3_Sub13[this.anInt10039 - 2];
		this.anInterface1_3 = this.method8084(Static666.aClass389_16, 1, 1, Static21.aClass122_14);
		this.method8031(new Class3_Sub51_Sub2(262144));
		this.aClass94_21 = this.method8185(new Class306[] { new Class306(new Class356[] { Static610.aClass356_1, Static610.aClass356_5 }) });
		this.aClass94_17 = this.method8185(new Class306[] { new Class306(new Class356[] { Static610.aClass356_1, Static610.aClass356_3 }) });
		this.aClass94_19 = this.method8185(new Class306[] { new Class306(Static610.aClass356_1), new Class306(Static610.aClass356_3), new Class306(Static610.aClass356_5), new Class306(Static610.aClass356_2) });
		this.aClass94_20 = this.method8185(new Class306[] { new Class306(Static610.aClass356_1), new Class306(Static610.aClass356_3), new Class306(Static610.aClass356_5) });
		this.aClass149_Sub1_22 = new Class149_Sub1(this, 0, 0, false, false);
		this.aClass149_Sub1_26 = new Class149_Sub1(this, 0, 0, true, true);
		this.aClass149_Sub1_24 = new Class149_Sub1(this, 0, 0, false, false);
		this.aClass149_Sub1_21 = new Class149_Sub1(this, 0, 0, true, true);
		this.aClass149_Sub1_28 = new Class149_Sub1(this, 0, 0, false, false);
		this.aClass149_Sub1_27 = new Class149_Sub1(this, 0, 0, true, true);
		this.aClass149_Sub1_23 = new Class149_Sub1(this, 0, 0, false, false);
		this.aClass149_Sub1_25 = new Class149_Sub1(this, 0, 0, true, true);
		this.aClass149_Sub1_30 = new Class149_Sub1(this, 0, 0, false, false);
		this.aClass149_Sub1_29 = new Class149_Sub1(this, 0, 0, true, true);
		this.aClass379_3 = new Class379(this);
		this.anInterface22_7 = this.method8115(true);
		this.method8170();
		this.aClass123_8 = new Class123(this);
		this.aClass4Array3[1] = this.method8209(1);
		this.aClass4Array3[2] = this.method8209(2);
		this.aClass4Array3[4] = this.method8209(4);
		this.aClass4Array3[5] = this.method8209(5);
		this.aClass4Array3[6] = this.method8209(6);
		this.aClass4Array3[7] = this.method8209(7);
		this.aClass4Array3[3] = this.method8209(3);
		this.aClass4Array3[8] = this.method8209(8);
		this.aClass4Array3[9] = this.method8209(9);
		if (!this.aClass4Array3[2].method8493()) {
			this.aClass4Array3[2] = this.method8209(0);
		}
		if (!this.aClass4Array3[4].method8493()) {
			this.aClass4Array3[4] = this.aClass4Array3[2];
		}
		if (!this.aClass4Array3[8].method8493()) {
			this.aClass4Array3[8] = this.aClass4Array3[4];
		}
		if (!this.aClass4Array3[9].method8493()) {
			this.aClass4Array3[9] = this.aClass4Array3[8];
		}
		this.method8156();
		this.la();
		this.method8019();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!g;III[B)Lclient!or;")
	public abstract Interface20 method8136(@OriginalArg(1) Class122 arg0, @OriginalArg(5) byte[] arg1);

	@OriginalMember(owner = "client!ee", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10052 = arg2;
		this.anInt10044 = arg3;
		this.anInt10063 = arg1;
		this.anInt10025 = arg0;
		this.method8173();
		this.method8080();
		this.method8116();
		this.method8106();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method8040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Interface8 local9 = local6.anInterface8_6;
		this.method8174();
		this.method8147(local9);
		this.method8162(1);
		this.method8195(Static134.aClass112_9, Static134.aClass112_9);
		this.method8108(0, Static576.aClass235_3);
		this.method8078(arg0);
		this.aClass17_Sub2_15.method5843((float) this.anInt9970, (float) this.anInt9996, 0.0F);
		this.method8098();
		this.aClass17_Sub2Array3[0].method5843(local9.method7065((float) this.anInt9970), local9.method7067((float) this.anInt9996), 1.0F);
		this.aClass17_Sub2Array3[0].method5856(local9.method7067((float) -arg2), 0.0F, local9.method7065((float) -arg3));
		this.aClass366Array3[0] = Static345.aClass366_6;
		this.method8201();
		this.method8176();
		this.method8142();
		this.method8108(0, Static665.aClass235_4);
	}

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "(I)V")
	private void method8137() {
		if (this.aClass393_11 == Static106.aClass393_3) {
			return;
		}
		@Pc(10) Class393 local10 = this.aClass393_11;
		this.aClass393_11 = Static106.aClass393_3;
		if (!local10.method9020()) {
			this.method8140();
		}
		this.method8160();
		this.aFloatArray63 = this.aFloatArray62;
		this.method8075();
		this.anInt10032 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ee", name = "D", descriptor = "(I)V")
	protected abstract void method8138();

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "()Z")
	@Override
	public final boolean method8059() {
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "(Z)V")
	protected abstract void method8139();

	@OriginalMember(owner = "client!ee", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt10053 = this.anInt9970;
		this.anInt10033 = 0;
		this.anInt10028 = 0;
		this.anInt10062 = this.anInt9996;
		if (this.aBoolean703) {
			this.aBoolean703 = false;
			this.method8152();
		}
		this.method8106();
	}

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "(I)V")
	private void method8140() {
		this.aBoolean683 = false;
		if (this.aClass4_3 != null) {
			this.aClass4_3.method8480();
		}
		this.method8165();
	}

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "(I)Lclient!od;")
	public final Class17_Sub2 method8141() {
		return this.aClass17_Sub2Array3[this.anInt10026];
	}

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "(B)V")
	public final void method8142() {
		if (Static70.aClass366_1 != this.aClass366Array3[this.anInt10026]) {
			this.aClass366Array3[this.anInt10026] = Static70.aClass366_1;
			this.aClass17_Sub2Array3[this.anInt10026].method6239();
			this.method8201();
		}
	}

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "(I)V")
	protected final void method8143() {
		@Pc(9) Enumeration local9 = this.aHashtable11.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method8107(local15, this.aHashtable11.get(local15));
		}
		this.anInterface15_14.method7409();
		this.anInterface15_16.method7409();
		this.anInterface15_15.method7409();
		this.aClass149_Sub1_26.method3479();
		this.aClass149_Sub1_21.method3479();
		this.aClass149_Sub1_27.method3479();
		this.aClass149_Sub1_25.method3479();
		this.aClass149_Sub1_29.method3479();
		this.aClass379_3.method8735();
		this.anInterface22_7.method7409();
	}

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "()Z")
	@Override
	public final boolean method8033() {
		return false;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method8028(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas13) {
			throw new RuntimeException();
		} else if (!this.aHashtable11.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) Object local53 = this.method8208(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable11.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!ee", name = "H", descriptor = "(I)V")
	public final void method8144() {
		this.aClass17_Sub2_15.method6239();
		this.aBoolean682 = true;
		this.method8088();
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "()Z")
	@Override
	public final boolean method8001() {
		return false;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!fga;)V")
	private void method8145(@OriginalArg(0) int arg0, @OriginalArg(2) Class115 arg1) {
		this.method8133(this.anInterface15_14, 0);
		this.method8166(this.aClass94_18);
		this.method8182(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "(II)V")
	public abstract void method8146(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!b;)V")
	public final void method8147(@OriginalArg(1) Interface1 arg0) {
		if (arg0 == this.anInterface1Array3[this.anInt10026]) {
			return;
		}
		this.anInterface1Array3[this.anInt10026] = arg0;
		if (arg0 == null) {
			this.method8123();
		} else {
			arg0.method7463();
		}
		this.anInt10032 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!vba;)V")
	public final void method8148(@OriginalArg(1) Class366 arg0) {
		this.aClass366Array3[this.anInt10026] = arg0;
		this.method8201();
	}

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "(I)V")
	private void method8149() {
		if (this.aClass4_3 != null) {
			this.aClass4_3.method8486();
		}
		this.method8132();
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(ZB)V")
	public final void method8150(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean690) {
			this.aBoolean690 = arg0;
			this.method8105();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!wj;Lclient!g;)Z")
	public abstract boolean method8151(@OriginalArg(1) Class389 arg0, @OriginalArg(2) Class122 arg1);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "()Lclient!al;")
	@Override
	public final Class17 method7992() {
		return this.aClass17_Sub2_16;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	@Override
	public final void method8009(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "(B)V")
	protected abstract void method8152();

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "(II)V")
	public final void method8153(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt10026) {
			this.anInt10026 = arg0;
			this.method8089();
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "()Z")
	@Override
	public final boolean method7995() {
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!al;)V")
	@Override
	public final void method8037(@OriginalArg(0) Class17 arg0) {
		this.aClass17_Sub2_16 = (Class17_Sub2) arg0;
		this.aClass17_Sub2_18.method6233(this.aClass17_Sub2_16);
		this.aClass17_Sub2_18.method5845();
		this.aClass17_Sub2_19.method5838(this.aClass17_Sub2_18);
		this.aClass17_Sub2_17.method5838(this.aClass17_Sub2_16);
		if (this.aClass393_11.method9020()) {
			this.method8140();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZ)V")
	public final void method8154(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean691 != arg0) {
			this.aBoolean691 = arg0;
			this.method8204();
			this.anInt10032 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt10065;
	}

	@OriginalMember(owner = "client!ee", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method8178();
		this.method8078(arg4);
		this.method8108(0, Static576.aClass235_3);
		this.method8122(Static576.aClass235_3, 0);
		this.method8162(arg5);
		this.aClass17_Sub2_15.method5843((float) arg3, (float) arg2, 1.0F);
		this.aClass17_Sub2_15.method6235(arg0, arg1, 0);
		this.method8098();
		this.method8169(false);
		this.method8176();
		this.method8169(true);
		this.method8122(Static665.aClass235_4, 0);
		this.method8108(0, Static665.aClass235_4);
	}

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "(I)V")
	public final void method8155() {
		if (this.anInt10032 == 4) {
			return;
		}
		this.method8121();
		this.method8099(false);
		this.method8163(false);
		this.method8154(false);
		this.method8095(false);
		this.method8118(false, -2, false);
		this.method8162(1);
		this.method8129(0);
		this.anInt10032 = 4;
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
	@Override
	public void method8056(@OriginalArg(0) int arg0) {
		if (this.aClass278_3 != null) {
			this.aClass278_3.method6138();
		}
		this.anInt10064 = arg0 & Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "(I)V")
	protected void method8156() {
		this.method8202();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method8157(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "(I)I")
	public final int method8158() {
		return this.anInt10038;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class35 method8044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class35_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "(B)V")
	public abstract void method8159();

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method8062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method8128();
		this.method8178();
		this.method8078(arg4);
		this.method8108(0, Static576.aClass235_3);
		this.method8122(Static576.aClass235_3, 0);
		this.method8162(arg5);
		this.aClass17_Sub2_15.method5843((float) (arg3 - 1), (float) (arg2 - 1), 1.0F);
		this.aClass17_Sub2_15.method5856((float) arg0 - local7, 0.0F, (float) arg1 - local7);
		this.method8098();
		this.method8169(false);
		this.method8145(4, Static506.aClass115_4);
		this.method8169(true);
		this.method8122(Static665.aClass235_4, 0);
		this.method8108(0, Static665.aClass235_4);
	}

	@OriginalMember(owner = "client!ee", name = "N", descriptor = "(I)V")
	private void method8160() {
		if (this.aBoolean701) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray62;
		@Pc(21) float local21 = (float) (-this.anInt10025 * this.anInt10050) / (float) this.anInt10052;
		@Pc(36) float local36 = (float) (this.anInt10050 * (this.anInt9996 - this.anInt10025)) / (float) this.anInt10052;
		@Pc(47) float local47 = (float) (this.anInt10050 * this.anInt10063) / (float) this.anInt10044;
		@Pc(62) float local62 = (float) (this.anInt10050 * (this.anInt10063 - this.anInt9970)) / (float) this.anInt10044;
		if (local21 == local36 || local47 == local62) {
			local9[5] = 1.0F;
			local9[3] = 0.0F;
			local9[11] = 0.0F;
			local9[13] = 0.0F;
			local9[15] = 1.0F;
			local9[8] = 0.0F;
			local9[4] = 0.0F;
			local9[14] = 0.0F;
			local9[6] = 0.0F;
			local9[1] = 0.0F;
			local9[0] = 1.0F;
			local9[9] = 0.0F;
			local9[7] = 0.0F;
			local9[12] = 0.0F;
			local9[10] = 1.0F;
			local9[2] = 0.0F;
		} else {
			@Pc(76) float local76 = (float) this.anInt10050 * 2.0F;
			local9[8] = (local36 + local21) / (local36 - local21);
			local9[7] = 0.0F;
			local9[3] = 0.0F;
			local9[14] = this.aFloat190 = (float) (this.anInt10050 * this.anInt10035) / (float) (this.anInt10050 - this.anInt10035);
			local9[11] = -1.0F;
			local9[4] = 0.0F;
			local9[9] = (local62 + local47) / (local47 - local62);
			local9[10] = this.bf = (float) this.anInt10035 / (float) (this.anInt10050 - this.anInt10035);
			local9[12] = 0.0F;
			local9[0] = local76 / (local36 - local21);
			local9[15] = 0.0F;
			local9[2] = 0.0F;
			local9[1] = 0.0F;
			local9[6] = 0.0F;
			local9[5] = local76 / (local47 - local62);
			local9[13] = 0.0F;
		}
		this.method8091();
		this.aBoolean701 = true;
	}

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "()Z")
	@Override
	public final boolean method8016() {
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "(II)Lclient!ra;")
	public final Interface22 method8161(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface22_7.method7404()) {
			this.anInterface22_7.method7408(arg0);
		}
		return this.anInterface22_7;
	}

	@OriginalMember(owner = "client!ee", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt10055 = 0;
		while (arg0 > 1) {
			this.anInt10055++;
			arg0 >>= 0x1;
		}
		this.anInt10048 = 0x1 << this.anInt10055;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!eb;[Lclient!vf;Z)Lclient!da;")
	@Override
	public final Class67 method8032(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class370[] arg1) {
		return new Class67_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	@Override
	public final void method8035(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "(II)V")
	public final void method8162(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt10047) {
			return;
		}
		@Pc(33) Class147 local33;
		@Pc(29) boolean local29;
		@Pc(31) boolean local31;
		if (arg0 == 1) {
			local33 = Static343.aClass147_4;
			local29 = true;
			local31 = true;
		} else if (arg0 == 2) {
			local29 = true;
			local31 = false;
			local33 = Static159.aClass147_2;
		} else if (arg0 == 128) {
			local31 = true;
			local33 = Static554.aClass147_6;
			local29 = true;
		} else {
			local29 = false;
			local31 = false;
			local33 = Static194.aClass147_3;
		}
		if (this.aBoolean689 != local31) {
			this.aBoolean689 = local31;
			this.method8191();
		}
		if (this.aBoolean684 != local29) {
			this.aBoolean684 = local29;
			this.method8197();
		}
		if (local33 != this.aClass147_7) {
			this.aClass147_7 = local33;
			this.method8113();
		}
		this.anInt10032 &= 0xFFFFFFE3;
		this.anInt10047 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IZ)V")
	public final void method8163(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean699) {
			this.aBoolean699 = arg0;
			this.method8188();
			this.anInt10032 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ee", name = "O", descriptor = "(I)V")
	protected abstract void method8164();

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "()I")
	@Override
	public final int method8026() {
		return this.anInt10039 - 2;
	}

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "(B)V")
	protected abstract void method8165();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	@Override
	public final void method7991() {
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!tv;)V")
	@Override
	public final void method8057(@OriginalArg(0) Class347 arg0) {
		this.aClass379_3.method8733(-1, this, arg0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!eda;)V")
	public abstract void method8166(@OriginalArg(1) Class94 arg0);

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
	@Override
	public final void method8029(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZIII[III)Lclient!fk;")
	public abstract Interface8 method8167(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(BZ)V")
	public abstract void method8169(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ee", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10056 = arg1;
		this.anInt10038 = arg3;
		this.anInt10031 = arg0;
		this.anInt10054 = arg2;
		this.aBoolean698 = true;
	}

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "(B)V")
	protected final void method8170() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable11 != null && !this.aHashtable11.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable11.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method8208(local26));
			}
		}
		this.aHashtable11 = local9;
		this.method8100();
		this.method8196();
		this.method8110();
		this.aClass379_3.method8734(this);
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "()Z")
	@Override
	public final boolean method8003() {
		return false;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!g;[BIIIIZ)Lclient!fk;")
	protected abstract Interface8 method8171(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(7) boolean arg4);

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "(I)Lclient!od;")
	public final Class17_Sub2 method8172() {
		return this.aClass17_Sub2_19;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!gl;IIII)Lclient!ka;")
	@Override
	public final Class149 method8021(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class149_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ee", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8178();
		this.method8078(arg3);
		this.method8108(0, Static576.aClass235_3);
		this.method8122(Static576.aClass235_3, 0);
		this.method8162(arg4);
		this.aClass17_Sub2_15.method5843((float) arg2, (float) arg2, 1.0F);
		this.aClass17_Sub2_15.method6235(arg0, arg1, 0);
		this.method8098();
		this.method8169(false);
		this.method8133(this.anInterface15_15, 0);
		this.method8166(this.aClass94_22);
		this.method8182(0, 256, Static163.aClass115_2);
		this.method8169(true);
		this.method8122(Static665.aClass235_4, 0);
		this.method8108(0, Static665.aClass235_4);
	}

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "(I)V")
	private void method8173() {
		this.aBoolean702 = false;
		this.method8200();
		if (this.aClass393_11 == Static85.aClass393_2) {
			this.method8075();
		}
	}

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "(I)V")
	public final void method8174() {
		if (this.anInt10032 == 2) {
			return;
		}
		this.method8121();
		this.method8099(false);
		this.method8163(false);
		this.method8154(false);
		this.method8095(false);
		this.method8118(false, -2, false);
		this.anInt10032 = 2;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)Lclient!za;")
	@Override
	public final Class3_Sub51 method8015(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub51_Sub2 local8 = new Class3_Sub51_Sub2(arg0);
		this.aClass302_70.method6613(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ee", name = "S", descriptor = "(I)V")
	protected abstract void method8175();

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt10050;
	}

	@OriginalMember(owner = "client!ee", name = "T", descriptor = "(I)V")
	public final void method8176() {
		this.method8145(2, Static163.aClass115_2);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(FFIFFFF)Z")
	private boolean method8177(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface15_16.method5529();
		if (local9 == null) {
			return false;
		}
		@Pc(18) Stream local18 = this.method8157(local9);
		if (Stream.b()) {
			local18.a(arg1);
			local18.a(arg3);
			local18.a(arg5);
			local18.a(arg2);
			local18.a(arg4);
			local18.a(arg0);
		} else {
			local18.b(arg1);
			local18.b(arg3);
			local18.b(arg5);
			local18.b(arg2);
			local18.b(arg4);
			local18.b(arg0);
		}
		local18.a();
		return this.anInterface15_16.method5528();
	}

	@OriginalMember(owner = "client!ee", name = "U", descriptor = "(I)V")
	private void method8178() {
		if (this.anInt10032 == 1) {
			return;
		}
		this.method8121();
		this.method8099(false);
		this.method8163(false);
		this.method8154(false);
		this.method8095(false);
		this.method8118(false, -2, false);
		this.method8129(1);
		this.method8147(this.anInterface1_3);
		this.anInt10032 = 1;
	}

	@OriginalMember(owner = "client!ee", name = "V", descriptor = "(I)V")
	protected abstract void method8179();

	@OriginalMember(owner = "client!ee", name = "W", descriptor = "(I)V")
	private void method8180() {
		if (this.aBoolean700) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray66;
		if (this.anInt9996 == 0 || this.anInt9970 == 0) {
			local5[14] = 0.0F;
			local5[11] = 0.0F;
			local5[2] = 0.0F;
			local5[6] = 0.0F;
			local5[7] = 0.0F;
			local5[4] = 0.0F;
			local5[15] = 1.0F;
			local5[13] = 0.0F;
			local5[12] = 0.0F;
			local5[9] = 0.0F;
			local5[0] = 1.0F;
			local5[3] = 0.0F;
			local5[5] = 1.0F;
			local5[10] = 1.0F;
			local5[1] = 0.0F;
			local5[8] = 0.0F;
		} else {
			local5[1] = 0.0F;
			local5[0] = 2.0F / (float) this.anInt9996;
			local5[4] = 0.0F;
			local5[13] = 1.0F;
			local5[10] = 0.5F;
			local5[6] = 0.0F;
			local5[12] = -1.0F;
			local5[11] = 0.0F;
			local5[2] = 0.0F;
			local5[9] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt9970;
			local5[14] = 0.5F;
			local5[8] = 0.0F;
			local5[7] = 0.0F;
			local5[15] = 1.0F;
			local5[3] = 0.0F;
		}
		this.aBoolean700 = true;
	}

	@OriginalMember(owner = "client!ee", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8024(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIF)Lclient!uaa;")
	@Override
	public final Class3_Sub13 method8070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub13_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ee", name = "Y", descriptor = "(I)V")
	public final void method8181() {
		if (this.anInt10032 == 16) {
			return;
		}
		this.method8184();
		this.method8099(true);
		this.method8154(true);
		this.method8095(true);
		this.method8162(1);
		this.anInt10032 = 16;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIILclient!fga;)V")
	public abstract void method8182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class115 arg2);

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "(I)V")
	private void method8183() {
		this.method8133(this.anInterface15_16, 0);
		this.method8166(this.aClass94_16);
		this.method8182(0, 1, Static285.aClass115_3);
	}

	@OriginalMember(owner = "client!ee", name = "ab", descriptor = "(I)V")
	private void method8184() {
		if (this.aClass393_11 == Static85.aClass393_2) {
			return;
		}
		@Pc(14) Class393 local14 = this.aClass393_11;
		this.aClass393_11 = Static85.aClass393_2;
		if (!local14.method9020()) {
			this.method8140();
		}
		this.method8200();
		this.aFloatArray63 = this.aFloatArray60;
		this.method8075();
		this.anInt10032 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([Lclient!rf;Z)Lclient!eda;")
	public abstract Class94 method8185(@OriginalArg(0) Class306[] arg0);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method8041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) float local10 = (float) -arg0 + (float) arg2;
		@Pc(17) float local17 = (float) -arg1 + (float) arg3;
		@Pc(19) float local19 = 0.0F;
		@Pc(21) float local21 = 1.0F;
		if (local10 != 0.0F || local17 != 0.0F) {
			local21 = (float) Math.sqrt((double) (local10 * local10 + local17 * local17));
			local19 = (float) Math.atan2((double) local17, (double) local10);
		}
		this.method8178();
		this.method8078(arg4);
		this.method8108(0, Static576.aClass235_3);
		this.method8122(Static576.aClass235_3, 0);
		this.method8162(0);
		this.aClass17_Sub2_15.method5843((float) arg5, local21, 1.0F);
		this.aClass17_Sub2_15.method6235(0, -arg5 / 2, 0);
		this.aClass17_Sub2_15.method6241((int) ((double) local19 * 2607.5945876176133D) & 0x3FFF);
		this.aClass17_Sub2_15.method6235(arg0, arg1, 0);
		this.method8098();
		this.method8169(false);
		this.method8176();
		this.method8169(true);
		this.method8122(Static665.aClass235_4, 0);
		this.method8108(0, Static665.aClass235_4);
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "()Z")
	@Override
	public final boolean method7996() {
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "bb", descriptor = "(I)I")
	public final int method8187() {
		return this.anInt10031;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method8024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		if (local9 == 0.0F && local15 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(40) float local40 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local15 * local15)));
			local15 *= local40;
			local9 *= local40;
		}
		if (!this.method8177(0.0F, (float) arg0, local9 + (float) arg2, (float) arg1, local15 + (float) arg3, 0.0F)) {
			return;
		}
		this.method8178();
		this.method8078(arg4);
		this.method8108(0, Static576.aClass235_3);
		this.method8122(Static576.aClass235_3, 0);
		this.method8162(arg5);
		this.method8144();
		this.method8169(false);
		this.method8183();
		this.method8169(true);
		this.method8122(Static665.aClass235_4, 0);
		this.method8108(0, Static665.aClass235_4);
	}

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "(B)V")
	protected abstract void method8188();

	@OriginalMember(owner = "client!ee", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt10033) {
			this.anInt10033 = arg0;
			local5 = true;
		}
		if (this.anInt10062 > arg2) {
			local5 = true;
			this.anInt10062 = arg2;
		}
		if (arg1 > this.anInt10028) {
			local5 = true;
			this.anInt10028 = arg1;
		}
		if (this.anInt10053 > arg3) {
			this.anInt10053 = arg3;
			local5 = true;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean703) {
			this.aBoolean703 = true;
			this.method8152();
		}
		this.method8114();
		this.method8106();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
	protected abstract void method8189(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIIIII)Lclient!cj;")
	@Override
	public final Class57 method8043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class57_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!cj;)V")
	@Override
	public final void method7989(@OriginalArg(0) Class57 arg0) {
		this.aClass57_Sub1_3 = (Class57_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "(B)[F")
	public final float[] method8190() {
		return this.aFloatArray59;
	}

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "(B)V")
	protected abstract void method8191();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!vf;Z)Lclient!hh;")
	@Override
	public final Class6 method8008(@OriginalArg(0) Class370 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(136) Class6 local136;
		if (arg0.anInt10491 == 0 || arg0.anInt10490 == 0) {
			local136 = this.method7993(new int[1], 1, 1, 1);
		} else {
			@Pc(21) int[] local21 = new int[arg0.anInt10491 * arg0.anInt10490];
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(30) int local30;
			@Pc(34) int local34;
			if (arg0.aByteArray97 == null) {
				for (local30 = 0; local30 < arg0.anInt10490; local30++) {
					for (local34 = 0; local34 < arg0.anInt10491; local34++) {
						@Pc(47) int local47 = arg0.anIntArray556[arg0.aByteArray96[local23++] & 0xFF];
						local21[local25++] = local47 == 0 ? 0 : local47 | 0xFF000000;
					}
				}
			} else {
				for (local30 = 0; local30 < arg0.anInt10490; local30++) {
					for (local34 = 0; local34 < arg0.anInt10491; local34++) {
						local21[local25++] = arg0.anIntArray556[arg0.aByteArray96[local23] & 0xFF] | arg0.aByteArray97[local23] << 24;
						local23++;
					}
				}
			}
			local136 = this.method7993(local21, arg0.anInt10491, arg0.anInt10490, arg0.anInt10491);
		}
		local136.method5123(arg0.anInt10493, arg0.anInt10494, arg0.anInt10492, arg0.anInt10495);
		return local136;
	}

	@OriginalMember(owner = "client!ee", name = "cb", descriptor = "(I)V")
	protected abstract void method8192();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B[F)[F")
	public final float[] method8193(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloatArray63[1];
		arg0[8] = this.aFloatArray63[2];
		arg0[0] = this.aFloatArray63[0];
		arg0[12] = this.aFloatArray63[3];
		arg0[2] = this.aFloatArray63[8];
		arg0[9] = this.aFloatArray63[6];
		arg0[13] = this.aFloatArray63[7];
		arg0[1] = this.aFloatArray63[4];
		arg0[5] = this.aFloatArray63[5];
		arg0[14] = this.aFloatArray63[11];
		arg0[3] = this.aFloatArray63[12];
		arg0[7] = this.aFloatArray63[13];
		arg0[6] = this.aFloatArray63[9];
		arg0[10] = this.aFloatArray63[10];
		arg0[15] = this.aFloatArray63[15];
		arg0[11] = this.aFloatArray63[14];
		return arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[[IZB)Lclient!faa;")
	public abstract Interface7 method8194(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!fea;Lclient!fea;)V")
	public final void method8195(@OriginalArg(1) Class112 arg0, @OriginalArg(2) Class112 arg1) {
		@Pc(11) boolean local11 = false;
		if (arg1 != this.aClass112Array6[this.anInt10026]) {
			this.aClass112Array6[this.anInt10026] = arg1;
			this.method8179();
			local11 = true;
		}
		if (this.aClass112Array5[this.anInt10026] != arg0) {
			this.aClass112Array5[this.anInt10026] = arg0;
			local11 = true;
			this.method8139();
		}
		if (local11) {
			this.anInt10032 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ee", name = "db", descriptor = "(I)V")
	private void method8196() {
		this.anInterface15_16 = this.method8090(true);
		this.anInterface15_16.method5530(24, 12);
		this.aClass94_16 = this.method8185(new Class306[] { new Class306(Static610.aClass356_1) });
	}

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "(B)V")
	protected abstract void method8197();

	@OriginalMember(owner = "client!ee", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass17_Sub2_16.method5857((float) arg0, (float) arg1, (float) arg2);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt10052 * this.aClass17_Sub2_16.method5855((float) arg2, (float) arg0, (float) arg1) / local14);
			local58 = (int) ((float) this.anInt10044 * this.aClass17_Sub2_16.method5836((float) arg1, (float) arg2, (float) arg0) / local14);
		} else {
			local58 = this.anInt10063;
			local40 = this.anInt10025;
		}
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local58 - this.aFloat201);
		arg3[0] = (int) ((float) local40 - this.aFloat194);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IB)V")
	public final void method8198(@OriginalArg(1) byte arg0) {
		this.method8078(arg0 << 8 | arg0 << 16 | arg0 << 24 | arg0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!sia;)V")
	public abstract void method8199(@OriginalArg(1) Class323 arg0);

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt10050 && arg1 == this.anInt10035) {
			return;
		}
		this.anInt10035 = arg1;
		this.anInt10050 = arg0;
		this.method8080();
		this.method8173();
		this.method8149();
	}

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt10029 && this.anInt10049 == arg1 && arg2 == this.anInt10041) {
			return;
		}
		this.anInt10029 = arg0;
		this.anInt10049 = arg1;
		this.anInt10041 = arg2;
		this.method8149();
		this.method8175();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method8065(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable11.containsKey(arg0)) {
			this.method8107(arg0, this.aHashtable11.get(arg0));
			this.aHashtable11.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "(B)V")
	private void method8200() {
		if (this.aBoolean702) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray60;
		@Pc(13) float local13 = (float) this.anInt10050;
		@Pc(17) float local17 = (float) this.anInt10035;
		@Pc(29) float local29 = this.aFloat202 * (float) -this.anInt10063 / (float) this.anInt10044;
		@Pc(41) float local41 = (float) -this.anInt10025 * this.aFloat202 / (float) this.anInt10052;
		@Pc(56) float local56 = (float) (this.anInt9996 - this.anInt10025) * this.aFloat202 / (float) this.anInt10052;
		@Pc(70) float local70 = this.aFloat202 * (float) (this.anInt9970 - this.anInt10063) / (float) this.anInt10044;
		if (local56 == local41 || local70 == local29) {
			local9[4] = 0.0F;
			local9[9] = 0.0F;
			local9[5] = 1.0F;
			local9[6] = 0.0F;
			local9[3] = 0.0F;
			local9[13] = 0.0F;
			local9[11] = 0.0F;
			local9[12] = 0.0F;
			local9[15] = 1.0F;
			local9[1] = 0.0F;
			local9[14] = 0.0F;
			local9[0] = 1.0F;
			local9[8] = 0.0F;
			local9[10] = 1.0F;
			local9[7] = 0.0F;
			local9[2] = 0.0F;
		} else {
			local9[10] = 1.0F / (local13 - local17);
			local9[12] = (local41 + local56) / (-local56 + local41);
			local9[7] = 0.0F;
			local9[5] = 2.0F / (local70 - local29);
			local9[0] = 2.0F / (local56 - local41);
			local9[9] = 0.0F;
			local9[15] = 1.0F;
			local9[2] = 0.0F;
			local9[1] = 0.0F;
			local9[6] = 0.0F;
			local9[4] = 0.0F;
			local9[11] = 0.0F;
			local9[13] = (local70 + local29) / (local70 - local29);
			local9[8] = 0.0F;
			local9[3] = 0.0F;
			local9[14] = local13 / (local13 - local17);
		}
		this.method8097();
		this.aBoolean702 = true;
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "()Z")
	@Override
	public final boolean method8002() {
		return this.aClass4Array3[3].method8493();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method7990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "(B)V")
	private void method8201() {
		this.method8192();
		if (this.aClass4_3 != null) {
			this.aClass4_3.method8485();
		}
	}

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "(Z)V")
	private void method8202() {
		this.method8164();
		this.method8130();
		this.method8188();
		this.method8111();
		this.method8159();
		this.method8126();
		this.method8105();
		this.method8204();
		this.method8093();
		this.method8175();
		this.method8132();
		this.method8197();
		this.method8113();
		this.method8191();
		for (@Pc(52) int local52 = this.anInt10040 - 1; local52 >= 0; local52--) {
			this.method8153(local52);
			this.method8179();
			this.method8139();
			this.method8142();
		}
		this.method8207();
		this.method8138();
		this.method8117();
		this.method8203();
		this.method8165();
	}

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "(B)V")
	protected abstract void method8203();

	@OriginalMember(owner = "client!ee", name = "eb", descriptor = "(I)V")
	protected abstract void method8204();

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean696 = arg0;
		this.method8093();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZILclient!g;I[F)Lclient!fk;")
	public final Interface8 method8205(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4) {
		return this.method8085(arg1, arg4, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt10053;
		arg0[2] = this.anInt10062;
		arg0[0] = this.anInt10033;
		arg0[1] = this.anInt10028;
	}

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "()V")
	@Override
	protected void method8014() {
		if (this.aBoolean686) {
			return;
		}
		for (@Pc(9) Class3 local9 = this.aClass302_70.method6603(); local9 != null; local9 = this.aClass302_70.method6605()) {
			((Class3_Sub51_Sub2) local9).method8985();
		}
		@Pc(26) Enumeration local26 = this.aHashtable11.keys();
		while (local26.hasMoreElements()) {
			@Pc(32) Canvas local32 = (Canvas) local26.nextElement();
			this.method8107(local32, this.aHashtable11.get(local32));
		}
		Static84.method1335(false, true);
		this.aNativeInterface3.release();
		this.aBoolean686 = true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!g;Lclient!wj;)Z")
	public abstract boolean method8206(@OriginalArg(1) Class122 arg0, @OriginalArg(2) Class389 arg1);

	@OriginalMember(owner = "client!ee", name = "fb", descriptor = "(I)V")
	protected abstract void method8207();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method8006() {
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method8208(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "(II)Lclient!ev;")
	protected Class4 method8209(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class4_Sub4(this);
		} else if (arg0 == 1) {
			return new Class4_Sub7(this);
		} else if (arg0 == 2) {
			return new Class4_Sub5(this, this.aClass123_8);
		} else if (arg0 == 7) {
			return new Class4_Sub11(this);
		} else {
			return new Class4_Sub6(this);
		}
	}

	@OriginalMember(owner = "client!ee", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt10045;
		if (local15 || this.aFloat203 != arg1 || arg2 != this.aFloat191) {
			this.aFloat203 = arg1;
			this.anInt10045 = arg0;
			this.aFloat191 = arg2;
			if (local15) {
				this.aFloat192 = (float) (this.anInt10045 & 0xFF) / 255.0F;
				this.aFloat193 = (float) (this.anInt10045 & 0xFF0000) / 1.671168E7F;
				this.aFloat200 = (float) (this.anInt10045 & 0xFF00) / 65280.0F;
				this.method8164();
			}
			this.aNativeInterface3.setSunColour(this.aFloat193, this.aFloat200, this.aFloat192, arg1, arg2);
			this.method8130();
		}
		if (arg3 != this.aFloatArray61[0] || this.aFloatArray61[1] != arg4 || this.aFloatArray61[2] != arg5) {
			this.aFloatArray61[1] = arg4;
			this.aFloatArray61[0] = arg3;
			this.aFloatArray61[2] = arg5;
			this.aFloatArray67[1] = -arg4;
			this.aFloatArray67[2] = -arg5;
			this.aFloatArray67[0] = -arg3;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
			this.aFloatArray64[0] = arg3 * local153;
			this.aFloatArray64[2] = arg5 * local153;
			this.aFloatArray64[1] = local153 * arg4;
			this.aFloatArray65[0] = -this.aFloatArray64[0];
			this.aFloatArray65[1] = -this.aFloatArray64[1];
			this.aFloatArray65[2] = -this.aFloatArray64[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray64[0], this.aFloatArray64[1], this.aFloatArray64[2]);
			this.method8159();
			this.anInt10061 = (int) (arg5 * 256.0F / arg4);
			this.anInt10059 = (int) (arg3 * 256.0F / arg4);
		}
		this.method8126();
	}
}
