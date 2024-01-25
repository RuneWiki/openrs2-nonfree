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

@OriginalClass("client!pga")
public abstract class Class95_Sub3 extends Class95 {

	@OriginalMember(owner = "client!pga", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!pga", name = "Ec", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!pga", name = "jd", descriptor = "Lclient!jo;")
	protected Class174 aClass174_7;

	@OriginalMember(owner = "client!pga", name = "zd", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!pga", name = "be", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7;

	@OriginalMember(owner = "client!pga", name = "de", descriptor = "I")
	public int anInt8342;

	@OriginalMember(owner = "client!pga", name = "ee", descriptor = "I")
	public int anInt8343;

	@OriginalMember(owner = "client!pga", name = "fe", descriptor = "I")
	protected int anInt8344;

	@OriginalMember(owner = "client!pga", name = "te", descriptor = "I")
	public int anInt8347;

	@OriginalMember(owner = "client!pga", name = "ue", descriptor = "[Lclient!lo;")
	private Interface17[] anInterface17Array3;

	@OriginalMember(owner = "client!pga", name = "ve", descriptor = "I")
	protected int anInt8348;

	@OriginalMember(owner = "client!pga", name = "xe", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!pga", name = "Be", descriptor = "I")
	private int anInt8352;

	@OriginalMember(owner = "client!pga", name = "He", descriptor = "[Lclient!kb;")
	protected Class2_Sub24[] aClass2_Sub24Array34;

	@OriginalMember(owner = "client!pga", name = "Oe", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!pga", name = "Qe", descriptor = "Z")
	protected boolean aBoolean615;

	@OriginalMember(owner = "client!pga", name = "Ve", descriptor = "Lclient!qia;")
	private Class287 aClass287_3;

	@OriginalMember(owner = "client!pga", name = "af", descriptor = "Z")
	protected boolean aBoolean618;

	@OriginalMember(owner = "client!pga", name = "of", descriptor = "[Lclient!efa;")
	protected Class85[] aClass85Array3;

	@OriginalMember(owner = "client!pga", name = "tf", descriptor = "I")
	public int anInt8370;

	@OriginalMember(owner = "client!pga", name = "uf", descriptor = "I")
	public int anInt8371;

	@OriginalMember(owner = "client!pga", name = "vf", descriptor = "F")
	public float aFloat179;

	@OriginalMember(owner = "client!pga", name = "wf", descriptor = "Z")
	public boolean aBoolean623;

	@OriginalMember(owner = "client!pga", name = "Af", descriptor = "[Lclient!js;")
	protected Class177_Sub1[] aClass177_Sub1Array3;

	@OriginalMember(owner = "client!pga", name = "Bf", descriptor = "Lclient!lo;")
	public Interface17 anInterface17_3;

	@OriginalMember(owner = "client!pga", name = "Ef", descriptor = "I")
	private int anInt8374;

	@OriginalMember(owner = "client!pga", name = "Ff", descriptor = "Lclient!ni;")
	private Class7 aClass7_3;

	@OriginalMember(owner = "client!pga", name = "If", descriptor = "I")
	protected int anInt8376;

	@OriginalMember(owner = "client!pga", name = "Kf", descriptor = "I")
	protected int anInt8378;

	@OriginalMember(owner = "client!pga", name = "Lf", descriptor = "[Lclient!hd;")
	protected Class136[] aClass136Array5;

	@OriginalMember(owner = "client!pga", name = "Qf", descriptor = "Lclient!bv;")
	private Class12_Sub1 aClass12_Sub1_3;

	@OriginalMember(owner = "client!pga", name = "Tf", descriptor = "I")
	protected int anInt8381;

	@OriginalMember(owner = "client!pga", name = "Wf", descriptor = "F")
	private float aFloat182;

	@OriginalMember(owner = "client!pga", name = "bg", descriptor = "Z")
	public boolean aBoolean629;

	@OriginalMember(owner = "client!pga", name = "cg", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!pga", name = "dg", descriptor = "Z")
	public boolean aBoolean630;

	@OriginalMember(owner = "client!pga", name = "eg", descriptor = "[Lclient!hd;")
	protected Class136[] aClass136Array6;

	@OriginalMember(owner = "client!pga", name = "hg", descriptor = "I")
	public int anInt8384;

	@OriginalMember(owner = "client!pga", name = "jg", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!pga", name = "ng", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!pga", name = "og", descriptor = "F")
	private float aFloat187;

	@OriginalMember(owner = "client!pga", name = "qg", descriptor = "Lclient!qd;")
	public Class182_Sub3 aClass182_Sub3_21;

	@OriginalMember(owner = "client!pga", name = "sg", descriptor = "Lclient!dha;")
	private Class72 aClass72_16;

	@OriginalMember(owner = "client!pga", name = "tg", descriptor = "Lclient!qd;")
	public Class182_Sub3 aClass182_Sub3_22;

	@OriginalMember(owner = "client!pga", name = "ug", descriptor = "Lclient!qd;")
	public Class182_Sub3 aClass182_Sub3_23;

	@OriginalMember(owner = "client!pga", name = "vg", descriptor = "Lclient!lk;")
	private Interface16 anInterface16_13;

	@OriginalMember(owner = "client!pga", name = "wg", descriptor = "Lclient!qd;")
	public Class182_Sub3 aClass182_Sub3_24;

	@OriginalMember(owner = "client!pga", name = "xg", descriptor = "Lclient!qd;")
	public Class182_Sub3 aClass182_Sub3_25;

	@OriginalMember(owner = "client!pga", name = "yg", descriptor = "Lclient!qd;")
	public Class182_Sub3 aClass182_Sub3_26;

	@OriginalMember(owner = "client!pga", name = "zg", descriptor = "Lclient!dha;")
	public Class72 aClass72_17;

	@OriginalMember(owner = "client!pga", name = "Ag", descriptor = "Lclient!lk;")
	private Interface16 anInterface16_14;

	@OriginalMember(owner = "client!pga", name = "Bg", descriptor = "Lclient!ho;")
	private Interface10 anInterface10_8;

	@OriginalMember(owner = "client!pga", name = "Cg", descriptor = "Lclient!dha;")
	private Class72 aClass72_18;

	@OriginalMember(owner = "client!pga", name = "Dg", descriptor = "Lclient!qd;")
	public Class182_Sub3 aClass182_Sub3_27;

	@OriginalMember(owner = "client!pga", name = "Eg", descriptor = "Lclient!dha;")
	public Class72 aClass72_19;

	@OriginalMember(owner = "client!pga", name = "Fg", descriptor = "Lclient!qd;")
	public Class182_Sub3 aClass182_Sub3_28;

	@OriginalMember(owner = "client!pga", name = "Gg", descriptor = "Lclient!qd;")
	public Class182_Sub3 aClass182_Sub3_29;

	@OriginalMember(owner = "client!pga", name = "Hg", descriptor = "Lclient!dha;")
	private Class72 aClass72_20;

	@OriginalMember(owner = "client!pga", name = "Ig", descriptor = "Lclient!dha;")
	public Class72 aClass72_21;

	@OriginalMember(owner = "client!pga", name = "Jg", descriptor = "Lclient!dha;")
	public Class72 aClass72_22;

	@OriginalMember(owner = "client!pga", name = "Kg", descriptor = "Lclient!lk;")
	private Interface16 anInterface16_15;

	@OriginalMember(owner = "client!pga", name = "Lg", descriptor = "Lclient!qd;")
	public Class182_Sub3 aClass182_Sub3_30;

	@OriginalMember(owner = "client!pga", name = "Mg", descriptor = "Z")
	protected boolean aBoolean633;

	@OriginalMember(owner = "client!pga", name = "Ng", descriptor = "I")
	private int anInt8387;

	@OriginalMember(owner = "client!pga", name = "Nd", descriptor = "Lclient!fha;")
	private final Class109 aClass109_52 = new Class109();

	@OriginalMember(owner = "client!pga", name = "ge", descriptor = "Z")
	protected boolean aBoolean613 = true;

	@OriginalMember(owner = "client!pga", name = "ce", descriptor = "Lclient!js;")
	protected final Class177_Sub1 aClass177_Sub1_15 = new Class177_Sub1();

	@OriginalMember(owner = "client!pga", name = "je", descriptor = "Lclient!js;")
	public Class177_Sub1 aClass177_Sub1_16 = new Class177_Sub1();

	@OriginalMember(owner = "client!pga", name = "ne", descriptor = "Lclient!js;")
	public final Class177_Sub1 aClass177_Sub1_17 = new Class177_Sub1();

	@OriginalMember(owner = "client!pga", name = "pe", descriptor = "Lclient!js;")
	protected final Class177_Sub1 aClass177_Sub1_18 = new Class177_Sub1();

	@OriginalMember(owner = "client!pga", name = "qe", descriptor = "Lclient!js;")
	private final Class177_Sub1 aClass177_Sub1_19 = new Class177_Sub1();

	@OriginalMember(owner = "client!pga", name = "re", descriptor = "Lclient!js;")
	private final Class177_Sub1 aClass177_Sub1_20 = new Class177_Sub1();

	@OriginalMember(owner = "client!pga", name = "se", descriptor = "F")
	public float aFloat172 = 1.0F;

	@OriginalMember(owner = "client!pga", name = "Fe", descriptor = "I")
	public int anInt8355 = 8;

	@OriginalMember(owner = "client!pga", name = "Le", descriptor = "I")
	public int anInt8358 = 0;

	@OriginalMember(owner = "client!pga", name = "We", descriptor = "Z")
	private boolean aBoolean616 = false;

	@OriginalMember(owner = "client!pga", name = "ye", descriptor = "I")
	private int anInt8349 = 16777215;

	@OriginalMember(owner = "client!pga", name = "bf", descriptor = "Z")
	private boolean bf = false;

	@OriginalMember(owner = "client!pga", name = "ff", descriptor = "I")
	protected int anInt8365 = 0;

	@OriginalMember(owner = "client!pga", name = "Ne", descriptor = "I")
	private int anInt8360 = 0;

	@OriginalMember(owner = "client!pga", name = "gf", descriptor = "F")
	public float aFloat178 = 1.0F;

	@OriginalMember(owner = "client!pga", name = "Ue", descriptor = "I")
	protected int anInt8362 = 0;

	@OriginalMember(owner = "client!pga", name = "lf", descriptor = "[F")
	private final float[] aFloatArray71 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!pga", name = "ze", descriptor = "I")
	private int anInt8350 = 0;

	@OriginalMember(owner = "client!pga", name = "rf", descriptor = "I")
	protected int anInt8369 = 0;

	@OriginalMember(owner = "client!pga", name = "Ze", descriptor = "I")
	private int anInt8364 = 1;

	@OriginalMember(owner = "client!pga", name = "qf", descriptor = "Z")
	protected boolean aBoolean622 = true;

	@OriginalMember(owner = "client!pga", name = "Ie", descriptor = "F")
	public float aFloat174 = -1.0F;

	@OriginalMember(owner = "client!pga", name = "De", descriptor = "I")
	public int anInt8354 = 512;

	@OriginalMember(owner = "client!pga", name = "Me", descriptor = "I")
	public int anInt8359 = -1;

	@OriginalMember(owner = "client!pga", name = "Te", descriptor = "I")
	public int anInt8361 = 128;

	@OriginalMember(owner = "client!pga", name = "Xe", descriptor = "Z")
	protected boolean aBoolean617 = false;

	@OriginalMember(owner = "client!pga", name = "nf", descriptor = "Z")
	protected boolean aBoolean620 = true;

	@OriginalMember(owner = "client!pga", name = "Ce", descriptor = "I")
	protected final int anInt8353 = 0;

	@OriginalMember(owner = "client!pga", name = "Pe", descriptor = "F")
	private float aFloat176 = 1.0F;

	@OriginalMember(owner = "client!pga", name = "Cf", descriptor = "Z")
	private boolean aBoolean624 = false;

	@OriginalMember(owner = "client!pga", name = "hf", descriptor = "[F")
	private final float[] aFloatArray70 = new float[16];

	@OriginalMember(owner = "client!pga", name = "Gf", descriptor = "I")
	protected int anInt8375 = 3584;

	@OriginalMember(owner = "client!pga", name = "Mf", descriptor = "F")
	public float aFloat181 = 1.0F;

	@OriginalMember(owner = "client!pga", name = "Ye", descriptor = "I")
	protected int anInt8363 = 0;

	@OriginalMember(owner = "client!pga", name = "jf", descriptor = "I")
	public int anInt8366 = 0;

	@OriginalMember(owner = "client!pga", name = "Hf", descriptor = "Z")
	protected boolean aBoolean625 = true;

	@OriginalMember(owner = "client!pga", name = "ag", descriptor = "Z")
	protected boolean aBoolean628 = false;

	@OriginalMember(owner = "client!pga", name = "zf", descriptor = "I")
	private int anInt8372 = 0;

	@OriginalMember(owner = "client!pga", name = "yf", descriptor = "[F")
	private final float[] aFloatArray73 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!pga", name = "Df", descriptor = "I")
	private int anInt8373 = -1;

	@OriginalMember(owner = "client!pga", name = "Vf", descriptor = "Z")
	protected boolean aBoolean626 = false;

	@OriginalMember(owner = "client!pga", name = "kf", descriptor = "I")
	private int anInt8367 = 0;

	@OriginalMember(owner = "client!pga", name = "sf", descriptor = "[F")
	public final float[] aFloatArray72 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!pga", name = "Je", descriptor = "[F")
	private final float[] aFloatArray66 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!pga", name = "ef", descriptor = "F")
	public float aFloat177 = 3584.0F;

	@OriginalMember(owner = "client!pga", name = "Zf", descriptor = "Z")
	private boolean aBoolean627 = false;

	@OriginalMember(owner = "client!pga", name = "xf", descriptor = "F")
	public float aFloat180 = 3584.0F;

	@OriginalMember(owner = "client!pga", name = "Sf", descriptor = "Lclient!maa;")
	protected Class215 aClass215_8 = Static469.aClass215_2;

	@OriginalMember(owner = "client!pga", name = "Se", descriptor = "[F")
	protected float[] aFloatArray68 = this.aFloatArray73;

	@OriginalMember(owner = "client!pga", name = "Uf", descriptor = "I")
	public int anInt8382 = -1;

	@OriginalMember(owner = "client!pga", name = "pf", descriptor = "Z")
	private boolean aBoolean621 = false;

	@OriginalMember(owner = "client!pga", name = "df", descriptor = "[F")
	public final float[] aFloatArray69 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!pga", name = "Jf", descriptor = "I")
	public int anInt8377 = 50;

	@OriginalMember(owner = "client!pga", name = "Of", descriptor = "Lclient!gha;")
	protected Class125 aClass125_7 = Static305.aClass125_4;

	@OriginalMember(owner = "client!pga", name = "gg", descriptor = "I")
	private int anInt8383 = -1;

	@OriginalMember(owner = "client!pga", name = "Pf", descriptor = "[F")
	private final float[] aFloatArray74 = new float[16];

	@OriginalMember(owner = "client!pga", name = "Ae", descriptor = "I")
	public int anInt8351 = 3;

	@OriginalMember(owner = "client!pga", name = "mg", descriptor = "Z")
	private boolean aBoolean632 = false;

	@OriginalMember(owner = "client!pga", name = "fg", descriptor = "Z")
	protected boolean aBoolean631 = false;

	@OriginalMember(owner = "client!pga", name = "Yf", descriptor = "F")
	public float aFloat183 = 1.0F;

	@OriginalMember(owner = "client!pga", name = "Nf", descriptor = "I")
	public int anInt8379 = 512;

	@OriginalMember(owner = "client!pga", name = "kg", descriptor = "I")
	public int anInt8386 = 0;

	@OriginalMember(owner = "client!pga", name = "we", descriptor = "Z")
	protected boolean aBoolean614 = true;

	@OriginalMember(owner = "client!pga", name = "lg", descriptor = "[Lclient!ni;")
	private final Class7[] aClass7Array3 = new Class7[10];

	@OriginalMember(owner = "client!pga", name = "Re", descriptor = "[F")
	private final float[] aFloatArray67 = new float[16];

	@OriginalMember(owner = "client!pga", name = "cf", descriptor = "Z")
	protected boolean aBoolean619 = true;

	@OriginalMember(owner = "client!pga", name = "Ke", descriptor = "I")
	private int anInt8357 = -1;

	@OriginalMember(owner = "client!pga", name = "pg", descriptor = "F")
	public float aFloat188 = -1.0F;

	@OriginalMember(owner = "client!pga", name = "ig", descriptor = "I")
	protected int anInt8385 = 0;

	@OriginalMember(owner = "client!pga", name = "Ge", descriptor = "I")
	protected final int anInt8356 = 0;

	@OriginalMember(owner = "client!pga", name = "Ee", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream6 = new Stream();

	@OriginalMember(owner = "client!pga", name = "rg", descriptor = "Lclient!js;")
	private final Class177_Sub1 aClass177_Sub1_21 = new Class177_Sub1();

	@OriginalMember(owner = "client!pga", name = "Lb", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas12;

	@OriginalMember(owner = "client!pga", name = "Cc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!pga", name = "mf", descriptor = "I")
	protected final int anInt8368;

	@OriginalMember(owner = "client!pga", name = "gd", descriptor = "Ljava/lang/Object;")
	protected final Object anObject21;

	@OriginalMember(owner = "client!pga", name = "Lc", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!pga", name = "ed", descriptor = "Lclient!wu;")
	protected final Class380 aClass380_114;

	@OriginalMember(owner = "client!pga", name = "Rf", descriptor = "I")
	public final int anInt8380;

	@OriginalMember(owner = "client!pga", name = "Y", descriptor = "I")
	private int anInt8195;

	@OriginalMember(owner = "client!pga", name = "Sc", descriptor = "I")
	public int anInt8288;

	@OriginalMember(owner = "client!pga", name = "gb", descriptor = "I")
	private int anInt8203;

	@OriginalMember(owner = "client!pga", name = "Qc", descriptor = "I")
	public int anInt8286;

	@OriginalMember(owner = "client!pga", name = "Xf", descriptor = "Lclient!mf;")
	private final Class219 aClass219_3;

	@OriginalMember(owner = "client!pga", name = "bd", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!d;Lclient!wu;II)V")
	protected Class95_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface6 arg2, @OriginalArg(3) Class380 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.aCanvas13 = this.aCanvas12 = arg0;
		this.anInt8368 = arg4;
		this.anObject20 = this.anObject21 = arg1;
		this.aClass380_114 = arg3;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt8380 = arg5;
		this.anInt8288 = this.anInt8195 = local307.width;
		this.anInt8286 = this.anInt8203 = local307.height;
		Static171.method2575(false, true);
		if (super.anInterface6_27 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt8380);
			this.aClass219_3 = null;
		} else {
			this.aClass219_3 = new Class219(this, super.anInterface6_27);
			this.aNativeInterface3 = new NativeInterface(super.anInterface6_27.method1491(), this.anInt8380);
			for (@Pc(352) int local352 = 0; super.anInterface6_27.method1491() > local352; local352++) {
				@Pc(360) Class175 local360 = super.anInterface6_27.method1492(local352);
				if (local360 != null) {
					this.aNativeInterface3.initTextureMetrics(local352, local360.aByte51, local360.aByte57);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZ)V")
	public final void method7013(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean628 != arg0) {
			this.aBoolean628 = arg0;
			this.method7104();
			this.anInt8352 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "(I)V")
	private void method7014() {
		this.anInterface16_14 = this.method7122(true);
		this.anInterface16_14.method7457(24, 12);
		this.aClass72_18 = this.method7056(new Class258[] { new Class258(Static312.aClass202_1) });
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V")
	protected abstract void method7016();

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(B)Lclient!js;")
	public final Class177_Sub1 method7017() {
		return this.aClass177_Sub1Array3[this.anInt8362];
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILclient!js;)V")
	public final void method7018(@OriginalArg(1) Class177_Sub1 arg0) {
		this.aClass177_Sub1_15.method7879(arg0);
		this.aBoolean613 = false;
		this.method7032();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(16) float local16 = (float) -arg1 + (float) arg3;
		if (local9 == 0.0F && local16 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(37) float local37 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local9 * local9)));
			local9 *= local37;
			local16 *= local37;
		}
		if (!this.method7124((float) arg1, 0.0F, (float) arg2 + local9, 0.0F, (float) arg0, local16 + (float) arg3)) {
			return;
		}
		this.method7019();
		this.method7079(arg4);
		this.method7139(0, Static185.aClass291_3);
		this.method7095(0, Static185.aClass291_3);
		this.method7137(arg5);
		this.method7034();
		this.method7126(false);
		this.method7121();
		this.method7126(true);
		this.method7095(0, Static634.aClass291_4);
		this.method7139(0, Static634.aClass291_4);
	}

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(B)V")
	private void method7019() {
		if (this.anInt8352 == 1) {
			return;
		}
		this.method7087();
		this.method7065(false);
		this.method7076(false);
		this.method7013(false);
		this.method7033(false);
		this.method7148(false, false, -2);
		this.method7026(1);
		this.method7112(this.anInterface17_3);
		this.anInt8352 = 1;
	}

	@OriginalMember(owner = "client!pga", name = "Y", descriptor = "()[I")
	@Override
	public final int[] Y() {
		return new int[] { this.anInt8358, this.anInt8386, this.anInt8354, this.anInt8379 };
	}

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "(I)V")
	public final void method7020() {
		if (this.anInt8352 == 4) {
			return;
		}
		this.method7087();
		this.method7065(false);
		this.method7076(false);
		this.method7013(false);
		this.method7033(false);
		this.method7148(false, false, -2);
		this.method7137(1);
		this.method7026(0);
		this.anInt8352 = 4;
	}

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "(B)V")
	private void method7021() {
		this.aBoolean627 = false;
		this.method7071();
		if (this.aClass125_7 == Static289.aClass125_3) {
			this.method7106();
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIZ)Lclient!cw;")
	@Override
	public final Class61 method6952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class61_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pga", name = "e", descriptor = "(B)V")
	public final void method7022() {
		this.aClass136Array6 = new Class136[this.anInt8371];
		this.anInterface17Array3 = new Interface17[this.anInt8371];
		this.aClass177_Sub1Array3 = new Class177_Sub1[this.anInt8371];
		this.aClass136Array5 = new Class136[this.anInt8371];
		this.aClass85Array3 = new Class85[this.anInt8371];
		for (@Pc(32) int local32 = 0; local32 < this.anInt8371; local32++) {
			this.aClass136Array5[local32] = Static483.aClass136_6;
			this.aClass136Array6[local32] = Static483.aClass136_6;
			this.aClass85Array3[local32] = Static624.aClass85_5;
			this.aClass177_Sub1Array3[local32] = new Class177_Sub1();
		}
		this.aClass2_Sub24Array34 = new Class2_Sub24[this.anInt8376 - 2];
		this.anInterface17_3 = this.method7147(1, 1, Static290.aClass189_11, Static393.aClass188_12);
		this.method6987(new Class2_Sub31_Sub1(262144));
		this.aClass72_19 = this.method7056(new Class258[] { new Class258(new Class202[] { Static312.aClass202_1, Static312.aClass202_5 }) });
		this.aClass72_21 = this.method7056(new Class258[] { new Class258(new Class202[] { Static312.aClass202_1, Static312.aClass202_3 }) });
		this.aClass72_17 = this.method7056(new Class258[] { new Class258(Static312.aClass202_1), new Class258(Static312.aClass202_3), new Class258(Static312.aClass202_5), new Class258(Static312.aClass202_2) });
		this.aClass72_22 = this.method7056(new Class258[] { new Class258(Static312.aClass202_1), new Class258(Static312.aClass202_3), new Class258(Static312.aClass202_5) });
		this.aClass182_Sub3_23 = new Class182_Sub3(this, 0, 0, false, false);
		this.aClass182_Sub3_21 = new Class182_Sub3(this, 0, 0, true, true);
		this.aClass182_Sub3_27 = new Class182_Sub3(this, 0, 0, false, false);
		this.aClass182_Sub3_24 = new Class182_Sub3(this, 0, 0, true, true);
		this.aClass182_Sub3_28 = new Class182_Sub3(this, 0, 0, false, false);
		this.aClass182_Sub3_26 = new Class182_Sub3(this, 0, 0, true, true);
		this.aClass182_Sub3_30 = new Class182_Sub3(this, 0, 0, false, false);
		this.aClass182_Sub3_25 = new Class182_Sub3(this, 0, 0, true, true);
		this.aClass182_Sub3_29 = new Class182_Sub3(this, 0, 0, false, false);
		this.aClass182_Sub3_22 = new Class182_Sub3(this, 0, 0, true, true);
		this.aClass287_3 = new Class287(this);
		this.anInterface10_8 = this.method7119(true);
		this.method7093();
		this.aClass174_7 = new Class174(this);
		this.aClass7Array3[1] = this.method7050(1);
		this.aClass7Array3[2] = this.method7050(2);
		this.aClass7Array3[4] = this.method7050(4);
		this.aClass7Array3[5] = this.method7050(5);
		this.aClass7Array3[6] = this.method7050(6);
		this.aClass7Array3[7] = this.method7050(7);
		this.aClass7Array3[3] = this.method7050(3);
		this.aClass7Array3[8] = this.method7050(8);
		this.aClass7Array3[9] = this.method7050(9);
		if (!this.aClass7Array3[2].method8135()) {
			this.aClass7Array3[2] = this.method7050(0);
		}
		if (!this.aClass7Array3[4].method8135()) {
			this.aClass7Array3[4] = this.aClass7Array3[2];
		}
		if (!this.aClass7Array3[8].method8135()) {
			this.aClass7Array3[8] = this.aClass7Array3[4];
		}
		if (!this.aClass7Array3[9].method8135()) {
			this.aClass7Array3[9] = this.aClass7Array3[8];
		}
		this.method7102();
		this.la();
		this.method6986();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!hd;ILclient!hd;)V")
	public final void method7023(@OriginalArg(0) Class136 arg0, @OriginalArg(2) Class136 arg1) {
		@Pc(11) boolean local11 = false;
		if (arg1 != this.aClass136Array6[this.anInt8362]) {
			this.aClass136Array6[this.anInt8362] = arg1;
			this.method7118();
			local11 = true;
		}
		if (this.aClass136Array5[this.anInt8362] != arg0) {
			this.aClass136Array5[this.anInt8362] = arg0;
			local11 = true;
			this.method7036();
		}
		if (local11) {
			this.anInt8352 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!pga", name = "da", descriptor = "(III[I)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass177_Sub1_16.method3837((float) arg0, (float) arg1, (float) arg2);
		@Pc(28) int local28;
		@Pc(25) int local25;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local28 = (int) ((float) this.anInt8354 * this.aClass177_Sub1_16.method3838((float) arg0, (float) arg2, (float) arg1) / local14);
			local25 = (int) ((float) this.anInt8379 * this.aClass177_Sub1_16.method3843((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local25 = this.anInt8386;
			local28 = this.anInt8358;
		}
		arg3[0] = (int) ((float) local28 - this.aFloat185);
		arg3[1] = (int) ((float) local25 - this.aFloat186);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "(B)V")
	public final void method7024() {
		this.method7069(Static482.aClass30_5, 2);
	}

	@OriginalMember(owner = "client!pga", name = "m", descriptor = "(I)I")
	public final int method7025() {
		return this.anInt8373;
	}

	@OriginalMember(owner = "client!pga", name = "g", descriptor = "(II)V")
	public final void method7026(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method7023(Static225.aClass136_3, Static225.aClass136_3);
		} else if (arg0 == 0) {
			this.method7023(Static483.aClass136_6, Static483.aClass136_6);
		} else if (arg0 == 2) {
			this.method7023(Static225.aClass136_3, Static504.aClass136_8);
		} else if (arg0 == 3) {
			this.method7023(Static483.aClass136_6, Static248.aClass136_4);
		} else if (arg0 == 4) {
			this.method7023(Static579.aClass136_7, Static579.aClass136_7);
		}
	}

	@OriginalMember(owner = "client!pga", name = "g", descriptor = "(B)V")
	protected abstract void method7027();

	@OriginalMember(owner = "client!pga", name = "p", descriptor = "()Lclient!uha;")
	@Override
	public final Class177 method6979() {
		return this.aClass177_Sub1_16;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IBZLclient!qs;Z)V")
	public abstract void method7028(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class291 arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6950(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || arg0 == this.aCanvas12) {
			local5 = this.anObject20;
		} else if (this.aHashtable7.containsKey(arg0)) {
			local5 = this.aHashtable7.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method7073(arg0, local5);
		if (arg0 == this.aCanvas13) {
			this.method7044();
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BZ)V")
	public final void method7029(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean631 != arg0) {
			this.aBoolean631 = arg0;
			this.method7130();
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIF)Lclient!kb;")
	@Override
	public final Class2_Sub24 method6929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub24_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI)V")
	public abstract void method7030(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pga", name = "K", descriptor = "([I)V")
	@Override
	public final void K(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt8363;
		arg0[0] = this.anInt8369;
		arg0[2] = this.anInt8365;
		arg0[1] = this.anInt8385;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZIIB[BLclient!kea;)Lclient!oia;")
	public final Interface19 method7031(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class188 arg4) {
		return this.method7141(arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pga", name = "M", descriptor = "()I")
	@Override
	public final int M() {
		return this.anInt8387;
	}

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method7058();
		this.method7019();
		this.method7079(arg4);
		this.method7139(0, Static185.aClass291_3);
		this.method7095(0, Static185.aClass291_3);
		this.method7137(arg5);
		this.aClass177_Sub1_15.method3840((float) (arg3 - 1), 1.0F, (float) (arg2 - 1));
		this.aClass177_Sub1_15.method3842((float) arg1 - local7, 0.0F, (float) arg0 - local7);
		this.method7062();
		this.method7126(false);
		this.method7069(Static439.aClass30_4, 4);
		this.method7126(true);
		this.method7095(0, Static634.aClass291_4);
		this.method7139(0, Static634.aClass291_4);
	}

	@OriginalMember(owner = "client!pga", name = "e", descriptor = "(II)I")
	@Override
	public final int method7005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!pga", name = "n", descriptor = "(I)V")
	private void method7032() {
		if (this.aClass125_7 == Static269.aClass125_2) {
			@Pc(11) float local11 = this.method7058();
			this.aClass177_Sub1_15.method3842(local11, 0.0F, local11);
		}
		this.aBoolean616 = false;
		this.method7127();
		if (this.aClass7_3 != null) {
			this.aClass7_3.method8134();
		}
	}

	@OriginalMember(owner = "client!pga", name = "s", descriptor = "()Z")
	@Override
	public final boolean method6992() {
		return true;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(ZI)V")
	public final void method7033(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean617) {
			this.aBoolean617 = arg0;
			this.method7081();
			this.anInt8352 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pga", name = "o", descriptor = "(I)V")
	public final void method7034() {
		this.aClass177_Sub1_15.method7876();
		this.aBoolean613 = true;
		this.method7032();
	}

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "(B)V")
	public final void method7035() {
		this.method7088();
		this.method7106();
	}

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "()Z")
	@Override
	public final boolean method6964() {
		return this.aClass7Array3[3].method8135();
	}

	@OriginalMember(owner = "client!pga", name = "i", descriptor = "(B)V")
	protected abstract void method7036();

	@OriginalMember(owner = "client!pga", name = "L", descriptor = "(III)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt8359 && arg1 == this.anInt8382 && arg2 == this.anInt8366) {
			return;
		}
		this.anInt8366 = arg2;
		this.anInt8359 = arg0;
		this.anInt8382 = arg1;
		this.method7133();
		this.method7082();
	}

	@OriginalMember(owner = "client!pga", name = "p", descriptor = "(I)V")
	protected abstract void method7037();

	@OriginalMember(owner = "client!pga", name = "H", descriptor = "(III[I)V")
	@Override
	public final void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass177_Sub1_16.method3837((float) arg0, (float) arg1, (float) arg2);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt8354 * this.aClass177_Sub1_16.method3838((float) arg0, (float) arg2, (float) arg1) / local14);
			local58 = (int) ((float) this.anInt8379 * this.aClass177_Sub1_16.method3843((float) arg1, (float) arg0, (float) arg2) / local14);
		} else {
			local40 = this.anInt8358;
			local58 = this.anInt8386;
		}
		arg3[0] = (int) ((float) local40 - this.aFloat185);
		arg3[1] = (int) ((float) local58 - this.aFloat186);
		arg3[2] = (int) local14;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7006(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z[F)[F")
	public final float[] method7038(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloatArray68[0];
		arg0[8] = this.aFloatArray68[2];
		arg0[12] = this.aFloatArray68[3];
		arg0[4] = this.aFloatArray68[1];
		arg0[1] = this.aFloatArray68[4];
		arg0[13] = this.aFloatArray68[7];
		arg0[2] = this.aFloatArray68[8];
		arg0[5] = this.aFloatArray68[5];
		arg0[9] = this.aFloatArray68[6];
		arg0[3] = this.aFloatArray68[12];
		arg0[14] = this.aFloatArray68[11];
		arg0[10] = this.aFloatArray68[10];
		arg0[6] = this.aFloatArray68[9];
		arg0[7] = this.aFloatArray68[13];
		arg0[11] = this.aFloatArray68[14];
		arg0[15] = this.aFloatArray68[15];
		return arg0;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public final void method6942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) float local12 = (float) -arg0 + (float) arg2;
		@Pc(18) float local18 = (float) arg3 - (float) arg1;
		@Pc(43) float local43;
		if (local12 == 0.0F && local18 == 0.0F) {
			local12 = 1.0F;
		} else {
			local43 = (float) (1.0D / Math.sqrt((double) (local12 * local12 + local18 * local18)));
			local18 *= local43;
			local12 *= local43;
		}
		this.method7019();
		this.method7079(arg4);
		this.method7139(0, Static185.aClass291_3);
		this.method7095(0, Static185.aClass291_3);
		this.method7137(1);
		this.method7034();
		this.method7126(false);
		@Pc(86) int local86 = arg7 % (arg6 + arg5);
		local43 = local12 * (float) arg5;
		@Pc(96) float local96 = (float) arg5 * local18;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = 0.0F;
		@Pc(102) float local102 = local43;
		@Pc(104) float local104 = local96;
		if (arg5 < local86) {
			local98 = local12 * (float) (arg6 + arg5 - local86);
			local100 = local18 * (float) (arg6 + arg5 - local86);
		} else {
			local104 = (float) (arg5 - local86) * local18;
			local102 = local12 * (float) (arg5 - local86);
		}
		@Pc(154) float local154 = local98 + (float) arg0;
		@Pc(159) float local159 = (float) arg1 + local100;
		@Pc(164) float local164 = local12 * (float) arg6;
		@Pc(169) float local169 = local18 * (float) arg6;
		while (true) {
			if (arg0 < arg2) {
				if (local154 > (float) arg2) {
					break;
				}
				if (local154 + local102 > (float) arg2) {
					local102 = (float) arg2 - local154;
				}
			} else {
				if (local154 < (float) arg2) {
					break;
				}
				if (local154 + local102 < (float) arg2) {
					local102 = (float) arg2 - local154;
				}
			}
			if (arg3 > arg1) {
				if (local159 > (float) arg3) {
					break;
				}
				if (local104 + local159 > (float) arg3) {
					local104 = (float) arg3 - local159;
				}
			} else {
				if (local159 < (float) arg3) {
					break;
				}
				if (local159 + local104 < (float) arg3) {
					local104 = (float) arg3 - local159;
				}
			}
			if (!this.method7124(local159, 0.0F, local154 + local102, 0.0F, local154, local159 + local104)) {
				return;
			}
			local154 += local102 + local164;
			this.method7121();
			local159 += local169 + local104;
			local102 = local43;
			local104 = local96;
		}
		this.method7126(true);
		this.method7095(0, Static634.aClass291_4);
		this.method7139(0, Static634.aClass291_4);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIZZI)V")
	private void method7039(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) boolean local4 = arg2 & this.method6964();
		if (!local4 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			arg1 = 2;
			arg4 = 1;
			arg0 = 0;
		}
		if (arg1 != 0 && arg3) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt8350) {
			if (this.anInt8350 != 0) {
				this.aClass7Array3[Integer.MAX_VALUE & this.anInt8350].method8127();
			}
			if (arg1 == 0) {
				this.aClass7_3 = null;
			} else {
				this.aClass7_3 = this.aClass7Array3[Integer.MAX_VALUE & arg1];
				this.aClass7_3.method8120(arg3);
				this.aClass7_3.method8125(arg3);
				this.aClass7_3.method8128(arg0, arg4);
			}
			this.anInt8360 = arg4;
			this.anInt8372 = arg0;
			this.anInt8350 = arg1;
		} else if (this.anInt8350 != 0) {
			this.aClass7Array3[Integer.MAX_VALUE & this.anInt8350].method8125(arg3);
			if (this.anInt8372 != arg0 || this.anInt8360 != arg4) {
				this.aClass7Array3[this.anInt8350 & Integer.MAX_VALUE].method8128(arg0, arg4);
				this.anInt8372 = arg0;
				this.anInt8360 = arg4;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pga", name = "q", descriptor = "(I)V")
	protected final void method7040() {
		@Pc(9) Enumeration local9 = this.aHashtable7.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method7140(this.aHashtable7.get(local15), local15);
		}
		this.anInterface16_13.method7459();
		this.anInterface16_14.method7459();
		this.anInterface16_15.method7459();
		this.aClass182_Sub3_21.method6228();
		this.aClass182_Sub3_24.method6228();
		this.aClass182_Sub3_26.method6228();
		this.aClass182_Sub3_25.method6228();
		this.aClass182_Sub3_22.method6228();
		this.aClass287_3.method6291();
		this.anInterface10_8.method7459();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!tba;Z)Lclient!cw;")
	@Override
	public final Class61 method6980(@OriginalArg(0) Class329 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(27) Class61 local27;
		if (arg0.anInt8813 == 0 || arg0.anInt8812 == 0) {
			local27 = this.method6953(new int[1], 1, 1, 1);
		} else {
			@Pc(36) int[] local36 = new int[arg0.anInt8812 * arg0.anInt8813];
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			@Pc(45) int local45;
			@Pc(49) int local49;
			if (arg0.aByteArray100 == null) {
				for (local45 = 0; local45 < arg0.anInt8812; local45++) {
					for (local49 = 0; local49 < arg0.anInt8813; local49++) {
						@Pc(62) int local62 = arg0.anIntArray597[arg0.aByteArray101[local38++] & 0xFF];
						local36[local40++] = local62 == 0 ? 0 : local62 | 0xFF000000;
					}
				}
			} else {
				for (local45 = 0; local45 < arg0.anInt8812; local45++) {
					for (local49 = 0; local49 < arg0.anInt8813; local49++) {
						local36[local40++] = arg0.anIntArray597[arg0.aByteArray101[local38] & 0xFF] | arg0.aByteArray100[local38] << 24;
						local38++;
					}
				}
			}
			local27 = this.method6953(local36, arg0.anInt8813, arg0.anInt8813, arg0.anInt8812);
		}
		local27.method6436(arg0.anInt8816, arg0.anInt8814, arg0.anInt8815, arg0.anInt8811);
		return local27;
	}

	@OriginalMember(owner = "client!pga", name = "r", descriptor = "(I)Lclient!js;")
	public final Class177_Sub1 method7041() {
		return this.aClass177_Sub1_15;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZIBI[FLclient!kea;)Lclient!oia;")
	public final Interface19 method7042(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) Class188 arg4) {
		return this.method7132(arg3, arg0, arg2, arg4, arg1);
	}

	@OriginalMember(owner = "client!pga", name = "u", descriptor = "()I")
	@Override
	public final int method6994() {
		return this.anInt8376 - 2;
	}

	@OriginalMember(owner = "client!pga", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public final int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass177_Sub1_16.aFloat73 + this.aClass177_Sub1_16.aFloat74 * (float) arg2 + (float) arg0 * this.aClass177_Sub1_16.aFloat75 + (float) arg1 * this.aClass177_Sub1_16.aFloat77;
		@Pc(57) float local57 = this.aClass177_Sub1_16.aFloat74 * (float) arg5 + (float) arg3 * this.aClass177_Sub1_16.aFloat75 + this.aClass177_Sub1_16.aFloat77 * (float) arg4 + this.aClass177_Sub1_16.aFloat73;
		if (local32 < (float) this.anInt8377 && (float) this.anInt8377 > local57) {
			local7 |= 0x10;
		} else if ((float) this.anInt8375 < local32 && local57 > (float) this.anInt8375) {
			local7 |= 0x20;
		}
		@Pc(124) int local124 = (int) (((float) arg2 * this.aClass177_Sub1_16.aFloat82 + (float) arg0 * this.aClass177_Sub1_16.aFloat83 + (float) arg1 * this.aClass177_Sub1_16.aFloat80 + this.aClass177_Sub1_16.aFloat79) * (float) this.anInt8354 / (float) arg6);
		@Pc(157) int local157 = (int) (((float) arg5 * this.aClass177_Sub1_16.aFloat82 + (float) arg4 * this.aClass177_Sub1_16.aFloat80 + (float) arg3 * this.aClass177_Sub1_16.aFloat83 + this.aClass177_Sub1_16.aFloat79) * (float) this.anInt8354 / (float) arg6);
		if (this.aFloat185 > (float) local124 && (float) local157 < this.aFloat185) {
			local7 |= 0x1;
		} else if (this.aFloat173 < (float) local124 && this.aFloat173 < (float) local157) {
			local7 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass177_Sub1_16.aFloat78 + (float) arg0 * this.aClass177_Sub1_16.aFloat84 + (float) arg1 * this.aClass177_Sub1_16.aFloat81 + this.aClass177_Sub1_16.aFloat76 * (float) arg2) * (float) this.anInt8379 / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt8379 * ((float) arg4 * this.aClass177_Sub1_16.aFloat81 + (float) arg3 * this.aClass177_Sub1_16.aFloat84 + this.aClass177_Sub1_16.aFloat76 * (float) arg5 + this.aClass177_Sub1_16.aFloat78) / (float) arg6);
		if (this.aFloat186 > (float) local224 && (float) local257 < this.aFloat186) {
			local7 |= 0x4;
		} else if (this.aFloat184 < (float) local224 && this.aFloat184 < (float) local257) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public final void method6927() {
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I[[IIZ)Lclient!uia;")
	public abstract Interface23 method7043(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!pga", name = "DA", descriptor = "(IIII)V")
	@Override
	public final void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8379 = arg3;
		this.anInt8354 = arg2;
		this.anInt8386 = arg1;
		this.anInt8358 = arg0;
		this.method7021();
		this.method7107();
		this.method7088();
		this.method7143();
	}

	@OriginalMember(owner = "client!pga", name = "s", descriptor = "(I)V")
	private void method7044() {
		if (this.aCanvas13 == null) {
			this.anInt8195 = this.anInt8203 = 1;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas13.getSize();
			this.anInt8195 = local10.width;
			this.anInt8203 = local10.height;
		}
		this.anInt8286 = this.anInt8203;
		this.anInt8288 = this.anInt8195;
		this.method7080();
		this.method7107();
		this.method7021();
		this.method7052();
		this.method7143();
		this.method7088();
		this.la();
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(BI)V")
	public final void method7045(@OriginalArg(0) byte arg0) {
		this.method7079(arg0 | arg0 << 8 | arg0 << 16 | arg0 << 24);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!pf;B)V")
	public abstract void method7046(@OriginalArg(0) Class266 arg0);

	@OriginalMember(owner = "client!pga", name = "j", descriptor = "(B)V")
	public abstract void method7047();

	@OriginalMember(owner = "client!pga", name = "k", descriptor = "(B)V")
	protected abstract void method7048();

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "()Z")
	@Override
	public final boolean method6944() {
		return false;
	}

	@OriginalMember(owner = "client!pga", name = "X", descriptor = "(I)V")
	@Override
	public final void X(@OriginalArg(0) int arg0) {
		this.anInt8351 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt8351++;
		}
		this.anInt8355 = 0x1 << this.anInt8351;
	}

	@OriginalMember(owner = "client!pga", name = "n", descriptor = "()Lclient!uha;")
	@Override
	public final Class177 method6967() {
		return this.aClass177_Sub1_21;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "([IIIIIZ)Lclient!cw;")
	@Override
	public final Class61 method7012(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class61_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!pga", name = "i", descriptor = "(I)V")
	@Override
	public final void method6982(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(Z)I")
	public final int method7049() {
		return this.anInt8374;
	}

	@OriginalMember(owner = "client!pga", name = "P", descriptor = "(IIIII)V")
	@Override
	public final void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6937(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!pga", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public final void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(14) float local14 = this.aClass177_Sub1_16.method3837((float) arg0, (float) arg1, (float) arg2);
		if ((float) this.anInt8377 > local14 || (float) this.anInt8375 < local14) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(58) int local58 = (int) ((float) this.anInt8354 * this.aClass177_Sub1_16.method3838((float) arg0, (float) arg2, (float) arg1) / (float) arg3);
		@Pc(77) int local77 = (int) ((float) this.anInt8379 * this.aClass177_Sub1_16.method3843((float) arg1, (float) arg0, (float) arg2) / (float) arg3);
		arg4[0] = (int) ((float) local58 - this.aFloat185);
		arg4[1] = (int) ((float) local77 - this.aFloat186);
		arg4[2] = (int) local14;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public final void method6961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IB)Lclient!ni;")
	protected Class7 method7050(@OriginalArg(0) int arg0) {
		if (arg0 == 6) {
			return new Class7_Sub8(this);
		} else if (arg0 == 1) {
			return new Class7_Sub10(this);
		} else if (arg0 == 2) {
			return new Class7_Sub6(this, this.aClass174_7);
		} else if (arg0 == 7) {
			return new Class7_Sub4(this);
		} else {
			return new Class7_Sub3(this);
		}
	}

	@OriginalMember(owner = "client!pga", name = "t", descriptor = "(I)V")
	private void method7051() {
		if (this.aBoolean632) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray67;
		this.aBoolean632 = true;
		if (this.anInt8288 != 0 && this.anInt8286 != 0) {
			local5[13] = 1.0F;
			local5[9] = 0.0F;
			local5[6] = 0.0F;
			local5[1] = 0.0F;
			local5[4] = 0.0F;
			local5[11] = 0.0F;
			local5[12] = -1.0F;
			local5[3] = 0.0F;
			local5[10] = 0.5F;
			local5[14] = 0.5F;
			local5[7] = 0.0F;
			local5[2] = 0.0F;
			local5[8] = 0.0F;
			local5[5] = -2.0F / (float) this.anInt8286;
			local5[0] = 2.0F / (float) this.anInt8288;
			local5[15] = 1.0F;
			return;
		}
		local5[3] = 0.0F;
		local5[2] = 0.0F;
		local5[0] = 1.0F;
		local5[13] = 0.0F;
		local5[1] = 0.0F;
		local5[11] = 0.0F;
		local5[12] = 0.0F;
		local5[7] = 0.0F;
		local5[9] = 0.0F;
		local5[8] = 0.0F;
		local5[5] = 1.0F;
		local5[4] = 0.0F;
		local5[10] = 1.0F;
		local5[15] = 1.0F;
		local5[6] = 0.0F;
		local5[14] = 0.0F;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIZ)Lclient!cw;")
	@Override
	public final Class61 method6972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class61_Sub2 local11 = new Class61_Sub2(this, arg2, arg3, arg4);
		local11.method6448(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!pga", name = "u", descriptor = "(I)V")
	protected abstract void method7052();

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "(B)Lclient!js;")
	public final Class177_Sub1 method7053() {
		return this.aClass177_Sub1Array3[this.anInt8362];
	}

	@OriginalMember(owner = "client!pga", name = "j", descriptor = "(I)Lclient!za;")
	@Override
	public final Class2_Sub31 method6985(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub31_Sub1 local8 = new Class2_Sub31_Sub1(arg0);
		this.aClass109_52.method2323(local8);
		return local8;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public final void method6987(@OriginalArg(0) Class2_Sub31 arg0) {
		this.aNativeHeap5 = ((Class2_Sub31_Sub1) arg0).aNativeHeap2;
		this.aNativeHeapBuffer6 = this.aNativeHeap5.a(32768, false);
	}

	@OriginalMember(owner = "client!pga", name = "la", descriptor = "()V")
	@Override
	public final void la() {
		this.anInt8385 = 0;
		this.anInt8369 = 0;
		this.anInt8363 = this.anInt8286;
		this.anInt8365 = this.anInt8288;
		if (this.aBoolean633) {
			this.aBoolean633 = false;
			this.method7072();
		}
		this.method7143();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILclient!lk;Z)V")
	public abstract void method7054(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1);

	@OriginalMember(owner = "client!pga", name = "m", descriptor = "(B)Lclient!uia;")
	public final Interface23 method7055() {
		return this.aClass12_Sub1_3 == null ? null : this.aClass12_Sub1_3.method262();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I[Lclient!ot;)Lclient!dha;")
	public abstract Class72 method7056(@OriginalArg(1) Class258[] arg0);

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(ZI)V")
	public final void method7057(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean614 != arg0) {
			this.aBoolean614 = arg0;
			this.method7082();
		}
	}

	@OriginalMember(owner = "client!pga", name = "v", descriptor = "(I)F")
	protected abstract float method7058();

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZLclient!dha;)V")
	public abstract void method7059(@OriginalArg(1) Class72 arg0);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!bfa;IIZILclient!ho;I)V")
	public abstract void method7060(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface10 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!pga", name = "w", descriptor = "(I)[F")
	public final float[] method7061() {
		return this.aFloatArray73;
	}

	@OriginalMember(owner = "client!pga", name = "ra", descriptor = "(IIII)V")
	@Override
	public final void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8367 = arg3;
		this.aBoolean630 = true;
		this.anInt8374 = arg0;
		this.anInt8373 = arg1;
		this.anInt8357 = arg2;
	}

	@OriginalMember(owner = "client!pga", name = "n", descriptor = "(B)V")
	public final void method7062() {
		this.aBoolean613 = false;
		this.method7032();
	}

	@OriginalMember(owner = "client!pga", name = "za", descriptor = "(IIIII)V")
	@Override
	protected final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7019();
		this.method7079(arg3);
		this.method7139(0, Static185.aClass291_3);
		this.method7095(0, Static185.aClass291_3);
		this.method7137(arg4);
		this.aClass177_Sub1_15.method3840((float) arg2, 1.0F, (float) arg2);
		this.aClass177_Sub1_15.method7872(arg0, arg1, 0);
		this.method7062();
		this.method7126(false);
		this.method7054(0, this.anInterface16_15);
		this.method7059(this.aClass72_16);
		this.method7114(0, 256, Static482.aClass30_5);
		this.method7126(true);
		this.method7095(0, Static634.aClass291_4);
		this.method7139(0, Static634.aClass291_4);
	}

	@OriginalMember(owner = "client!pga", name = "x", descriptor = "(I)V")
	protected abstract void method7063();

	@OriginalMember(owner = "client!pga", name = "o", descriptor = "(B)V")
	public final void method7064() {
		if (this.anInt8352 == 2) {
			return;
		}
		this.method7087();
		this.method7065(false);
		this.method7076(false);
		this.method7013(false);
		this.method7033(false);
		this.method7148(false, false, -2);
		this.anInt8352 = 2;
	}

	@OriginalMember(owner = "client!pga", name = "E", descriptor = "()I")
	@Override
	public final int E() {
		return this.anInt8344 + this.anInt8342 + this.anInt8343;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(BZ)V")
	public final void method7065(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean618) {
			this.aBoolean618 = arg0;
			this.method7082();
			this.anInt8352 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "(Z)V")
	private void method7066() {
		if (this.aClass125_7 == Static192.aClass125_1) {
			return;
		}
		@Pc(6) Class125 local6 = this.aClass125_7;
		this.aClass125_7 = Static192.aClass125_1;
		if (!local6.method2683()) {
			this.method7128();
		}
		this.method7100();
		this.aFloatArray68 = this.aFloatArray70;
		this.method7106();
		this.anInt8352 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pga", name = "y", descriptor = "(I)V")
	private void method7067() {
		this.anInterface16_13 = this.method7122(false);
		this.anInterface16_13.method7457(140, 28);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface16_13.method7456();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method7086(local28);
				if (Stream.a()) {
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(1.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(1.0F);
					local35.b(0.0F);
					local35.b(1.0F);
					local35.b(1.0F);
					local35.b(1.0F);
					local35.b(0.0F);
					local35.b(1.0F);
					local35.b(1.0F);
					local35.b(1.0F);
					local35.b(1.0F);
					local35.b(1.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(1.0F);
					local35.b(0.0F);
					local35.b(1.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
					local35.b(0.0F);
				} else {
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(1.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(1.0F);
					local35.a(0.0F);
					local35.a(1.0F);
					local35.a(1.0F);
					local35.a(1.0F);
					local35.a(0.0F);
					local35.a(1.0F);
					local35.a(1.0F);
					local35.a(1.0F);
					local35.a(1.0F);
					local35.a(1.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(1.0F);
					local35.a(0.0F);
					local35.a(1.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
					local35.a(0.0F);
				}
				local35.c();
				if (this.anInterface16_13.method7458()) {
					break;
				}
			}
		}
		this.aClass72_20 = this.method7056(new Class258[] { new Class258(new Class202[] { Static312.aClass202_1, Static312.aClass202_5, Static312.aClass202_5 }) });
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public final void method6984(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas12) {
			throw new RuntimeException();
		} else if (!this.aHashtable7.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) Object local53 = this.method7138(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z[BILclient!kea;II)Lclient!co;")
	public abstract Interface5 method7068(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class188 arg1);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!bfa;II)V")
	private void method7069(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1) {
		this.method7054(0, this.anInterface16_13);
		this.method7059(this.aClass72_20);
		this.method7114(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!pga", name = "p", descriptor = "(B)V")
	private void method7071() {
		if (this.aBoolean627) {
			return;
		}
		@Pc(13) float[] local13 = this.aFloatArray74;
		@Pc(17) float local17 = (float) this.anInt8377;
		@Pc(21) float local21 = (float) this.anInt8375;
		@Pc(33) float local33 = (float) -this.anInt8386 * this.aFloat176 / (float) this.anInt8379;
		@Pc(45) float local45 = this.aFloat176 * (float) -this.anInt8358 / (float) this.anInt8354;
		@Pc(59) float local59 = (float) (this.anInt8288 - this.anInt8358) * this.aFloat176 / (float) this.anInt8354;
		@Pc(74) float local74 = this.aFloat176 * (float) (this.anInt8286 - this.anInt8386) / (float) this.anInt8379;
		if (local45 == local59 || local74 == local33) {
			local13[12] = 0.0F;
			local13[15] = 1.0F;
			local13[9] = 0.0F;
			local13[2] = 0.0F;
			local13[4] = 0.0F;
			local13[0] = 1.0F;
			local13[14] = 0.0F;
			local13[13] = 0.0F;
			local13[11] = 0.0F;
			local13[10] = 1.0F;
			local13[1] = 0.0F;
			local13[8] = 0.0F;
			local13[3] = 0.0F;
			local13[5] = 1.0F;
			local13[6] = 0.0F;
			local13[7] = 0.0F;
		} else {
			local13[5] = 2.0F / (local74 - local33);
			local13[10] = 1.0F / (local17 - local21);
			local13[7] = 0.0F;
			local13[8] = 0.0F;
			local13[12] = (local59 + local45) / (-local59 + local45);
			local13[11] = 0.0F;
			local13[13] = (local33 + local74) / (local74 - local33);
			local13[6] = 0.0F;
			local13[3] = 0.0F;
			local13[2] = 0.0F;
			local13[15] = 1.0F;
			local13[9] = 0.0F;
			local13[1] = 0.0F;
			local13[4] = 0.0F;
			local13[0] = 2.0F / (local59 - local45);
			local13[14] = local17 / (local17 - local21);
		}
		this.method7144();
		this.aBoolean627 = true;
	}

	@OriginalMember(owner = "client!pga", name = "z", descriptor = "(I)V")
	protected abstract void method7072();

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "()Z")
	@Override
	public final boolean method6932() {
		return true;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method7073(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!oq;[Lclient!tba;Z)Lclient!da;")
	@Override
	public final Class62 method6956(@OriginalArg(0) Class256 arg0, @OriginalArg(1) Class329[] arg1) {
		return new Class62_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!pga", name = "A", descriptor = "(I)V")
	protected void method7074() {
		this.anInt8378 = this.anInt8381;
		this.anInt8381 = 0;
	}

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "(ZI)Lclient!ho;")
	public final Interface10 method7075(@OriginalArg(1) int arg0) {
		if (arg0 * 2 > this.anInterface10_8.method7455()) {
			this.anInterface10_8.method7382(arg0);
		}
		return this.anInterface10_8;
	}

	@OriginalMember(owner = "client!pga", name = "i", descriptor = "()I")
	@Override
	public final int i() {
		return this.anInt8377;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZB)V")
	public final void method7076(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean626 != arg0) {
			this.aBoolean626 = arg0;
			this.method7130();
			this.anInt8352 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pga", name = "q", descriptor = "(B)V")
	private void method7077() {
		this.method7142();
		this.method7078();
		this.method7130();
		this.method7074();
		this.method7047();
		this.method7136();
		this.method7027();
		this.method7104();
		this.method7081();
		this.method7082();
		this.method7016();
		this.method7063();
		this.method7048();
		this.method7096();
		for (@Pc(62) int local62 = this.anInt8371 - 1; local62 >= 0; local62--) {
			this.method7145(local62);
			this.method7118();
			this.method7036();
			this.method7105();
		}
		this.method7109();
		this.method7052();
		this.method7090();
		this.method7127();
		this.method7110();
	}

	@OriginalMember(owner = "client!pga", name = "B", descriptor = "(I)V")
	protected abstract void method7078();

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "(I)V")
	@Override
	public final void method6971(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public final void method6998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
	}

	@OriginalMember(owner = "client!pga", name = "xa", descriptor = "(F)V")
	@Override
	public final void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat178) {
			this.aFloat178 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method7142();
			this.method7136();
		}
	}

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(BI)V")
	public final void method7079(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt8348) {
			this.anInt8348 = arg0;
			this.method7109();
		}
	}

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)V")
	@Override
	public final void method6935() {
	}

	@OriginalMember(owner = "client!pga", name = "C", descriptor = "(I)V")
	private void method7080() {
		this.aBoolean632 = false;
		if (this.aClass125_7 == Static269.aClass125_2) {
			this.method7051();
			this.method7106();
		}
	}

	@OriginalMember(owner = "client!pga", name = "e", descriptor = "(Z)V")
	protected abstract void method7081();

	@OriginalMember(owner = "client!pga", name = "D", descriptor = "(I)V")
	protected abstract void method7082();

	@OriginalMember(owner = "client!pga", name = "E", descriptor = "(I)V")
	public final void method7083() {
		if (this.anInt8352 == 8) {
			return;
		}
		this.method7066();
		this.method7065(true);
		this.method7013(true);
		this.method7033(true);
		this.method7137(1);
		this.anInt8352 = 8;
	}

	@OriginalMember(owner = "client!pga", name = "m", descriptor = "()V")
	@Override
	protected void method6966() {
		if (this.aBoolean621) {
			return;
		}
		for (@Pc(13) Class2 local13 = this.aClass109_52.method2325(); local13 != null; local13 = this.aClass109_52.method2318()) {
			((Class2_Sub31_Sub1) local13).method4951();
		}
		@Pc(30) Enumeration local30 = this.aHashtable7.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method7140(this.aHashtable7.get(local36), local36);
		}
		Static621.method8309(true, false);
		this.aNativeInterface3.release();
		this.aBoolean621 = true;
	}

	@OriginalMember(owner = "client!pga", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public final void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Interface19 local9 = local6.anInterface19_6;
		this.method7064();
		this.method7112(local9);
		this.method7137(1);
		this.method7023(Static225.aClass136_3, Static225.aClass136_3);
		this.method7139(0, Static185.aClass291_3);
		this.method7079(arg0);
		this.aClass177_Sub1_15.method3840((float) this.anInt8286, 0.0F, (float) this.anInt8288);
		this.method7062();
		this.aClass177_Sub1Array3[0].method3840(local9.method3137((float) this.anInt8286), 1.0F, local9.method3136((float) this.anInt8288));
		this.aClass177_Sub1Array3[0].method3842(local9.method3137((float) -arg3), 0.0F, local9.method3136((float) -arg2));
		this.aClass85Array3[0] = Static409.aClass85_3;
		this.method7123();
		this.method7024();
		this.method7105();
		this.method7139(0, Static634.aClass291_4);
	}

	@OriginalMember(owner = "client!pga", name = "U", descriptor = "(IIIII)V")
	@Override
	public final void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6937(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!pga", name = "v", descriptor = "()Z")
	@Override
	public final boolean method6995() {
		return this.aBoolean615;
	}

	@OriginalMember(owner = "client!pga", name = "F", descriptor = "(I)Lclient!js;")
	public final Class177_Sub1 method7084() {
		return this.aClass177_Sub1_18;
	}

	@OriginalMember(owner = "client!pga", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(IIIIII)Lclient!cd;")
	@Override
	public final Class12 method6954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class12_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;Z)Lclient!jaclib/memory/Stream;")
	public final Stream method7086(@OriginalArg(0) Buffer arg0) {
		this.aStream6.a(arg0);
		return this.aStream6;
	}

	@OriginalMember(owner = "client!pga", name = "H", descriptor = "(I)V")
	private void method7087() {
		if (this.aClass125_7 == Static269.aClass125_2) {
			return;
		}
		@Pc(17) Class125 local17 = this.aClass125_7;
		this.aClass125_7 = Static269.aClass125_2;
		if (local17.method2683()) {
			this.method7128();
		}
		this.method7051();
		this.aFloatArray68 = this.aFloatArray67;
		this.method7106();
		this.anInt8352 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!pga", name = "y", descriptor = "()Z")
	@Override
	public final boolean method7003() {
		return false;
	}

	@OriginalMember(owner = "client!pga", name = "I", descriptor = "(I)V")
	public final void method7088() {
		if (this.aClass125_7 == Static305.aClass125_4) {
			return;
		}
		@Pc(6) Class125 local6 = this.aClass125_7;
		this.aClass125_7 = Static305.aClass125_4;
		if (local6.method2683()) {
			this.method7128();
		}
		this.aFloatArray68 = this.aFloatArray73;
		this.anInt8352 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIZ[I)Lclient!oia;")
	public abstract Interface19 method7089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int[] arg5);

	@OriginalMember(owner = "client!pga", name = "J", descriptor = "(I)V")
	protected abstract void method7090();

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "()V")
	@Override
	public final void method6933() {
		if (this.aClass219_3 != null) {
			this.aClass219_3.method4627();
		}
	}

	@OriginalMember(owner = "client!pga", name = "K", descriptor = "(I)V")
	private void method7091() {
		this.aFloatArray70[14] = this.aFloat182;
		this.aFloatArray70[10] = this.aFloat187;
		this.aFloat180 = (this.aFloatArray70[14] - (float) this.anInt8375) / this.aFloatArray70[10];
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!uha;)V")
	@Override
	public final void method6941(@OriginalArg(0) Class177 arg0) {
		this.aClass177_Sub1_16 = (Class177_Sub1) arg0;
		this.aClass177_Sub1_18.method7879(this.aClass177_Sub1_16);
		this.aClass177_Sub1_18.method3844();
		this.aClass177_Sub1_19.method3834(this.aClass177_Sub1_18);
		this.aClass177_Sub1_17.method3834(this.aClass177_Sub1_16);
		if (this.aClass125_7.method2683()) {
			this.method7128();
		}
	}

	@OriginalMember(owner = "client!pga", name = "L", descriptor = "(I)V")
	protected abstract void method7092();

	@OriginalMember(owner = "client!pga", name = "r", descriptor = "(B)V")
	protected final void method7093() {
		@Pc(17) Hashtable local17 = new Hashtable();
		if (this.aHashtable7 != null && !this.aHashtable7.isEmpty()) {
			@Pc(28) Enumeration local28 = this.aHashtable7.keys();
			while (local28.hasMoreElements()) {
				@Pc(34) Canvas local34 = (Canvas) local28.nextElement();
				local17.put(local34, this.method7138(local34));
			}
		}
		this.aHashtable7 = local17;
		this.method7067();
		this.method7014();
		this.method7117();
		this.aClass287_3.method6292(this);
	}

	@OriginalMember(owner = "client!pga", name = "s", descriptor = "(B)V")
	private void method7094() {
		if (Static289.aClass125_3 == this.aClass125_7) {
			return;
		}
		@Pc(18) Class125 local18 = this.aClass125_7;
		this.aClass125_7 = Static289.aClass125_3;
		if (!local18.method2683()) {
			this.method7128();
		}
		this.method7071();
		this.aFloatArray68 = this.aFloatArray74;
		this.method7106();
		this.anInt8352 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IILclient!qs;)V")
	public final void method7095(@OriginalArg(1) int arg0, @OriginalArg(2) Class291 arg1) {
		this.method7134(arg1, arg0);
	}

	@OriginalMember(owner = "client!pga", name = "M", descriptor = "(I)V")
	protected abstract void method7096();

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BIZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method7097(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap5.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!pga", name = "N", descriptor = "(I)V")
	protected abstract void method7098();

	@OriginalMember(owner = "client!pga", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public final void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt8349;
		if (local15 || this.aFloat174 != arg1 || arg2 != this.aFloat188) {
			this.aFloat174 = arg1;
			this.anInt8349 = arg0;
			this.aFloat188 = arg2;
			if (local15) {
				this.aFloat172 = (float) (this.anInt8349 & 0xFF00) / 65280.0F;
				this.aFloat183 = (float) (this.anInt8349 & 0xFF0000) / 1.671168E7F;
				this.aFloat181 = (float) (this.anInt8349 & 0xFF) / 255.0F;
				this.method7142();
			}
			this.aNativeInterface3.setSunColour(this.aFloat183, this.aFloat172, this.aFloat181, arg1, arg2);
			this.method7078();
		}
		if (arg3 != this.aFloatArray66[0] || arg4 != this.aFloatArray66[1] || arg5 != this.aFloatArray66[2]) {
			this.aFloatArray66[2] = arg5;
			this.aFloatArray66[0] = arg3;
			this.aFloatArray66[1] = arg4;
			this.aFloatArray71[0] = -arg3;
			this.aFloatArray71[2] = -arg5;
			this.aFloatArray71[1] = -arg4;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
			this.aFloatArray72[1] = local153 * arg4;
			this.aFloatArray72[2] = arg5 * local153;
			this.aFloatArray72[0] = local153 * arg3;
			this.aFloatArray69[2] = -this.aFloatArray72[2];
			this.aFloatArray69[0] = -this.aFloatArray72[0];
			this.aFloatArray69[1] = -this.aFloatArray72[1];
			this.aNativeInterface3.setSunDirection(this.aFloatArray72[0], this.aFloatArray72[1], this.aFloatArray72[2]);
			this.method7047();
			this.anInt8384 = (int) (arg3 * 256.0F / arg4);
			this.anInt8370 = (int) (arg5 * 256.0F / arg4);
		}
		this.method7136();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!efa;B)V")
	public final void method7099(@OriginalArg(0) Class85 arg0) {
		this.aClass85Array3[this.anInt8362] = arg0;
		this.method7123();
	}

	@OriginalMember(owner = "client!pga", name = "O", descriptor = "(I)V")
	private void method7100() {
		if (this.aBoolean624) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray70;
		@Pc(17) float local17 = (float) (this.anInt8377 * -this.anInt8358) / (float) this.anInt8354;
		@Pc(32) float local32 = (float) ((this.anInt8288 - this.anInt8358) * this.anInt8377) / (float) this.anInt8354;
		@Pc(43) float local43 = (float) (this.anInt8386 * this.anInt8377) / (float) this.anInt8379;
		@Pc(57) float local57 = (float) ((this.anInt8386 - this.anInt8286) * this.anInt8377) / (float) this.anInt8379;
		if (local32 == local17 || local43 == local57) {
			local5[0] = 1.0F;
			local5[8] = 0.0F;
			local5[1] = 0.0F;
			local5[13] = 0.0F;
			local5[7] = 0.0F;
			local5[11] = 0.0F;
			local5[15] = 1.0F;
			local5[4] = 0.0F;
			local5[9] = 0.0F;
			local5[12] = 0.0F;
			local5[10] = 1.0F;
			local5[6] = 0.0F;
			local5[14] = 0.0F;
			local5[2] = 0.0F;
			local5[5] = 1.0F;
			local5[3] = 0.0F;
		} else {
			@Pc(71) float local71 = (float) this.anInt8377 * 2.0F;
			local5[15] = 0.0F;
			local5[2] = 0.0F;
			local5[7] = 0.0F;
			local5[9] = (local43 + local57) / (-local57 + local43);
			local5[11] = -1.0F;
			local5[3] = 0.0F;
			local5[14] = this.aFloat182 = (float) (this.anInt8375 * this.anInt8377) / (float) (this.anInt8377 - this.anInt8375);
			local5[6] = 0.0F;
			local5[12] = 0.0F;
			local5[10] = this.aFloat187 = (float) this.anInt8375 / (float) (this.anInt8377 - this.anInt8375);
			local5[13] = 0.0F;
			local5[0] = local71 / (local32 - local17);
			local5[4] = 0.0F;
			local5[1] = 0.0F;
			local5[8] = (local17 + local32) / (local32 - local17);
			local5[5] = local71 / (local43 - local57);
		}
		this.method7091();
		this.aBoolean624 = true;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!cd;)V")
	@Override
	public final void method6939(@OriginalArg(0) Class12 arg0) {
		this.aClass12_Sub1_3 = (Class12_Sub1) arg0;
	}

	@OriginalMember(owner = "client!pga", name = "t", descriptor = "(B)Lclient!js;")
	public final Class177_Sub1 method7101() {
		return this.aClass177_Sub1_19;
	}

	@OriginalMember(owner = "client!pga", name = "P", descriptor = "(I)V")
	protected void method7102() {
		this.method7077();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!kea;Lclient!kf;B)Z")
	public abstract boolean method7103(@OriginalArg(0) Class188 arg0, @OriginalArg(1) Class189 arg1);

	@OriginalMember(owner = "client!pga", name = "u", descriptor = "(B)V")
	protected abstract void method7104();

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "(Z)V")
	public final void method7105() {
		if (this.aClass85Array3[this.anInt8362] != Static624.aClass85_5) {
			this.aClass85Array3[this.anInt8362] = Static624.aClass85_5;
			this.aClass177_Sub1Array3[this.anInt8362].method7876();
			this.method7123();
		}
	}

	@OriginalMember(owner = "client!pga", name = "k", descriptor = "()Z")
	@Override
	public final boolean method6962() {
		return true;
	}

	@OriginalMember(owner = "client!pga", name = "v", descriptor = "(B)V")
	private void method7106() {
		this.method7090();
		if (this.aClass7_3 != null) {
			this.aClass7_3.method8129();
		}
	}

	@OriginalMember(owner = "client!pga", name = "Q", descriptor = "(I)V")
	private void method7107() {
		this.aBoolean624 = false;
		this.method7100();
		if (this.aClass125_7 == Static192.aClass125_1) {
			this.method7106();
		}
	}

	@OriginalMember(owner = "client!pga", name = "R", descriptor = "(I)I")
	public final int method7108() {
		return this.anInt8367;
	}

	@OriginalMember(owner = "client!pga", name = "g", descriptor = "(Z)V")
	protected abstract void method7109();

	@OriginalMember(owner = "client!pga", name = "XA", descriptor = "()I")
	@Override
	public final int XA() {
		return this.anInt8375;
	}

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "(II)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt8377 == arg0 && arg1 == this.anInt8375) {
			return;
		}
		this.anInt8377 = arg0;
		this.anInt8375 = arg1;
		this.method7107();
		this.method7021();
		this.method7133();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!ev;I)V")
	@Override
	public final void method6977(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1) {
		this.aClass287_3.method6287(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "()Z")
	@Override
	public final boolean method6926() {
		return true;
	}

	@OriginalMember(owner = "client!pga", name = "w", descriptor = "(B)V")
	protected abstract void method7110();

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public final Class76 method6934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class76_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(FI)V")
	public final void method7111(@OriginalArg(0) float arg0) {
		if (this.aFloat176 != arg0) {
			this.aFloat176 = arg0;
			this.method7021();
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLclient!lo;)V")
	public final void method7112(@OriginalArg(1) Interface17 arg0) {
		if (this.anInterface17Array3[this.anInt8362] == arg0) {
			return;
		}
		this.anInterface17Array3[this.anInt8362] = arg0;
		if (arg0 == null) {
			this.method7092();
		} else {
			arg0.method7839();
		}
		this.anInt8352 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!pga", name = "S", descriptor = "(I)Lclient!js;")
	public final Class177_Sub1 method7113() {
		if (!this.aBoolean616) {
			this.aClass177_Sub1_20.method3846(this.aClass177_Sub1_18, this.aClass177_Sub1_15);
			this.aBoolean616 = true;
		}
		return this.aClass177_Sub1_20;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIILclient!bfa;)V")
	public abstract void method7114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2);

	@OriginalMember(owner = "client!pga", name = "T", descriptor = "(I)I")
	public final int method7115() {
		return this.anInt8357;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7002(@OriginalArg(0) Canvas arg0) {
		this.anObject20 = null;
		this.aCanvas13 = null;
		if (arg0 == null || this.aCanvas12 == arg0) {
			this.anObject20 = this.anObject21;
			this.aCanvas13 = this.aCanvas12;
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.anObject20 = this.aHashtable7.get(arg0);
			this.aCanvas13 = arg0;
		}
		if (this.aCanvas13 == null || this.anObject20 == null) {
			throw new RuntimeException();
		}
		this.method7120(this.anObject20, this.aCanvas13);
		this.method7044();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!ev;)V")
	@Override
	public final void method6960(@OriginalArg(0) Class98 arg0) {
		this.aClass287_3.method6287(this, arg0, -1);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZII[IB)Lclient!oia;")
	public final Interface19 method7116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		return this.method7089(0, arg1, 0, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!pga", name = "U", descriptor = "(I)V")
	private void method7117() {
		this.anInterface16_15 = this.method7122(false);
		this.anInterface16_15.method7457(3096, 12);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface16_15.method7456();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method7086(local28);
				local35.b(0.0F);
				local35.b(0.0F);
				local35.b(0.0F);
				for (@Pc(46) int local46 = 0; local46 <= 256; local46++) {
					@Pc(57) double local57 = (double) (local46 * 2) * 3.141592653589793D / 256.0D;
					@Pc(61) float local61 = (float) Math.cos(local57);
					@Pc(65) float local65 = (float) Math.sin(local57);
					if (Stream.a()) {
						local35.b(local65);
						local35.b(local61);
						local35.b(0.0F);
					} else {
						local35.a(local65);
						local35.a(local61);
						local35.a(0.0F);
					}
				}
				local35.c();
				if (this.anInterface16_15.method7458()) {
					break;
				}
			}
		}
		this.aClass72_16 = this.method7056(new Class258[] { new Class258(Static312.aClass202_1) });
	}

	@OriginalMember(owner = "client!pga", name = "T", descriptor = "(IIII)V")
	@Override
	public final void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt8369) {
			this.anInt8369 = arg0;
			local5 = true;
		}
		if (this.anInt8365 > arg2) {
			this.anInt8365 = arg2;
			local5 = true;
		}
		if (arg1 > this.anInt8385) {
			local5 = true;
			this.anInt8385 = arg1;
		}
		if (this.anInt8363 > arg3) {
			local5 = true;
			this.anInt8363 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean633) {
			this.aBoolean633 = true;
			this.method7072();
		}
		this.method7037();
		this.method7143();
	}

	@OriginalMember(owner = "client!pga", name = "pa", descriptor = "()V")
	@Override
	public final void pa() {
		this.aBoolean630 = false;
	}

	@OriginalMember(owner = "client!pga", name = "V", descriptor = "(I)V")
	protected abstract void method7118();

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZZ)Lclient!ho;")
	public abstract Interface10 method7119(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method7120(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "(Z)V")
	private void method7121() {
		this.method7054(0, this.anInterface16_14);
		this.method7059(this.aClass72_18);
		this.method7114(0, 1, Static176.aClass30_1);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6978(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas12) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.method7140(this.aHashtable7.get(arg0), arg0);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(BZ)Lclient!lk;")
	public abstract Interface16 method7122(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!pga", name = "x", descriptor = "(B)V")
	private void method7123() {
		this.method7129();
		if (this.aClass7_3 != null) {
			this.aClass7_3.method8131();
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(FFFIFFF)Z")
	private boolean method7124(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface16_14.method7456();
		if (local9 == null) {
			return false;
		}
		@Pc(18) Stream local18 = this.method7086(local9);
		if (Stream.a()) {
			local18.b(arg4);
			local18.b(arg0);
			local18.b(arg1);
			local18.b(arg2);
			local18.b(arg5);
			local18.b(arg3);
		} else {
			local18.a(arg4);
			local18.a(arg0);
			local18.a(arg1);
			local18.a(arg2);
			local18.a(arg5);
			local18.a(arg3);
		}
		local18.c();
		return this.anInterface16_14.method7458();
	}

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "(BZ)V")
	public abstract void method7126(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!pga", name = "W", descriptor = "(I)V")
	protected abstract void method7127();

	@OriginalMember(owner = "client!pga", name = "Y", descriptor = "(I)V")
	private void method7128() {
		this.aBoolean616 = false;
		if (this.aClass7_3 != null) {
			this.aClass7_3.method8133();
		}
		this.method7110();
	}

	@OriginalMember(owner = "client!pga", name = "Z", descriptor = "(I)V")
	protected abstract void method7129();

	@OriginalMember(owner = "client!pga", name = "ab", descriptor = "(I)V")
	protected abstract void method7130();

	@OriginalMember(owner = "client!pga", name = "C", descriptor = "(Z)V")
	@Override
	public final void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean625 = arg0;
		this.method7081();
	}

	@OriginalMember(owner = "client!pga", name = "x", descriptor = "()Lclient!uha;")
	@Override
	public final Class177 method7001() {
		return new Class177_Sub1();
	}

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "(I)V")
	@Override
	public final void method6981(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)I")
	@Override
	public final int method6963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(IZ)V")
	public final void method7131(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean620) {
			this.aBoolean620 = arg0;
			this.method7027();
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public final Class1 method6970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static519.method7254(arg2, arg0, arg1, arg3, this);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(II[FIZILclient!kea;I)Lclient!oia;")
	protected abstract Interface19 method7132(@OriginalArg(2) float[] arg0, @OriginalArg(4) boolean arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class188 arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!pga", name = "i", descriptor = "(Z)V")
	private void method7133() {
		if (this.aClass7_3 != null) {
			this.aClass7_3.method8130();
		}
		this.method7016();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLclient!qs;ZI)V")
	protected abstract void method7134(@OriginalArg(1) Class291 arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!kf;Lclient!kea;I)Z")
	public abstract boolean method7135(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class188 arg1);

	@OriginalMember(owner = "client!pga", name = "y", descriptor = "(B)V")
	protected abstract void method7136();

	@OriginalMember(owner = "client!pga", name = "i", descriptor = "(II)V")
	public final void method7137(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt8364) {
			return;
		}
		@Pc(14) Class215 local14;
		@Pc(18) boolean local18;
		@Pc(16) boolean local16;
		if (arg0 == 1) {
			local14 = Static469.aClass215_2;
			local16 = true;
			local18 = true;
		} else if (arg0 == 2) {
			local18 = true;
			local14 = Static365.aClass215_5;
			local16 = false;
		} else if (arg0 == 128) {
			local14 = Static528.aClass215_9;
			local18 = true;
			local16 = true;
		} else {
			local18 = false;
			local14 = Static406.aClass215_4;
			local16 = false;
		}
		if (this.aBoolean622 != local16) {
			this.aBoolean622 = local16;
			this.method7096();
		}
		if (local18 != this.aBoolean619) {
			this.aBoolean619 = local18;
			this.method7063();
		}
		if (local14 != this.aClass215_8) {
			this.aClass215_8 = local14;
			this.method7048();
		}
		this.anInt8352 &= 0xFFFFFFE3;
		this.anInt8364 = arg0;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "([I)V")
	@Override
	public final void method6969(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8288;
		arg0[1] = this.anInt8286;
	}

	@OriginalMember(owner = "client!pga", name = "e", descriptor = "()Z")
	@Override
	public final boolean method6945() {
		return false;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
	protected abstract Object method7138(@OriginalArg(1) Canvas arg0);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILclient!qs;B)V")
	public final void method7139(@OriginalArg(0) int arg0, @OriginalArg(1) Class291 arg1) {
		this.method7028(arg0, false, arg1, false);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I[Lclient!kb;)V")
	@Override
	public final void method7004(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub24[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub24Array34[local7] = arg1[local7];
		}
		this.anInt8381 = arg0;
		if (this.aClass125_7.method2683()) {
			this.method7074();
		}
	}

	@OriginalMember(owner = "client!pga", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public final int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass177_Sub1_16.aFloat74 * (float) arg2 + (float) arg1 * this.aClass177_Sub1_16.aFloat77 + (float) arg0 * this.aClass177_Sub1_16.aFloat75 + this.aClass177_Sub1_16.aFloat73;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass177_Sub1_16.aFloat74 * (float) arg5 + this.aClass177_Sub1_16.aFloat75 * (float) arg3 + (float) arg4 * this.aClass177_Sub1_16.aFloat77 + this.aClass177_Sub1_16.aFloat73;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt8377 && (float) this.anInt8377 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt8375 < local32 && (float) this.anInt8375 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt8354 * (this.aClass177_Sub1_16.aFloat83 * (float) arg0 + (float) arg1 * this.aClass177_Sub1_16.aFloat80 + (float) arg2 * this.aClass177_Sub1_16.aFloat82 + this.aClass177_Sub1_16.aFloat79) / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt8354 * ((float) arg5 * this.aClass177_Sub1_16.aFloat82 + this.aClass177_Sub1_16.aFloat80 * (float) arg4 + (float) arg3 * this.aClass177_Sub1_16.aFloat83 + this.aClass177_Sub1_16.aFloat79) / local63);
		if (this.aFloat185 > (float) local135 && (float) local167 < this.aFloat185) {
			local7 |= 0x1;
		} else if (this.aFloat173 < (float) local135 && (float) local167 > this.aFloat173) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt8379 * (this.aClass177_Sub1_16.aFloat78 + (float) arg0 * this.aClass177_Sub1_16.aFloat84 + (float) arg1 * this.aClass177_Sub1_16.aFloat81 + this.aClass177_Sub1_16.aFloat76 * (float) arg2) / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt8379 * ((float) arg5 * this.aClass177_Sub1_16.aFloat76 + this.aClass177_Sub1_16.aFloat84 * (float) arg3 + this.aClass177_Sub1_16.aFloat81 * (float) arg4 + this.aClass177_Sub1_16.aFloat78) / local63);
		if (this.aFloat186 > (float) local233 && (float) local265 < this.aFloat186) {
			local7 |= 0x4;
		} else if (this.aFloat184 < (float) local233 && this.aFloat184 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
	protected abstract void method7140(@OriginalArg(0) Object arg0, @OriginalArg(1) Canvas arg1);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZ[BLclient!kea;IZII)Lclient!oia;")
	protected abstract Interface19 method7141(@OriginalArg(2) byte[] arg0, @OriginalArg(3) Class188 arg1, @OriginalArg(5) boolean arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4);

	@OriginalMember(owner = "client!pga", name = "z", descriptor = "(B)V")
	protected abstract void method7142();

	@OriginalMember(owner = "client!pga", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean630) {
			throw new RuntimeException("");
		}
		this.anInt8367 = arg3;
		this.anInt8357 = arg2;
		this.anInt8373 = arg1;
		this.anInt8374 = arg0;
		if (this.bf) {
			this.aClass7Array3[3].method8136();
			this.aClass7Array3[3].method8130();
		}
	}

	@OriginalMember(owner = "client!pga", name = "bb", descriptor = "(I)V")
	private void method7143() {
		this.aFloat185 = this.anInt8369 - this.anInt8358;
		this.aFloat173 = this.anInt8365 - this.anInt8358;
		this.aFloat186 = this.anInt8385 - this.anInt8386;
		this.aFloat184 = this.anInt8363 - this.anInt8386;
	}

	@OriginalMember(owner = "client!pga", name = "A", descriptor = "(B)V")
	private void method7144() {
		this.aFloat177 = this.anInt8375;
	}

	@OriginalMember(owner = "client!pga", name = "t", descriptor = "()Z")
	@Override
	public final boolean method6993() {
		return true;
	}

	@OriginalMember(owner = "client!pga", name = "j", descriptor = "(II)V")
	public final void method7145(@OriginalArg(0) int arg0) {
		if (this.anInt8362 != arg0) {
			this.anInt8362 = arg0;
			this.method7098();
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V")
	@Override
	public void method6925(@OriginalArg(0) int arg0) {
		if (this.aClass219_3 != null) {
			this.aClass219_3.method4626();
		}
		this.anInt8347 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!pga", name = "j", descriptor = "(Z)I")
	public final int method7146() {
		return this.anInt8362;
	}

	@OriginalMember(owner = "client!pga", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && this.anInt8288 - 1 <= arg2 && arg1 <= 0 && this.anInt8286 - 1 <= arg3) {
			this.la();
			return;
		}
		this.anInt8369 = arg0 < 0 ? 0 : arg0;
		this.anInt8365 = arg2 <= this.anInt8288 ? arg2 : 0;
		this.anInt8385 = arg1 < 0 ? 0 : arg1;
		this.anInt8363 = arg3 > this.anInt8288 ? 0 : arg3;
		if (!this.aBoolean633) {
			this.aBoolean633 = true;
			this.method7072();
		}
		this.method7037();
		this.method7143();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IILclient!kf;Lclient!kea;I)Lclient!oia;")
	public abstract Interface19 method7147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) Class188 arg3);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZZZI)V")
	public final void method7148(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt8383 != arg2 || this.bf != this.aBoolean630) {
			@Pc(26) Interface19 local26 = null;
			@Pc(28) int local28 = 0;
			@Pc(30) byte local30 = 0;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39 = this.aBoolean630 ? 3 : 0;
			if (arg2 < 0) {
				this.method7105();
			} else {
				local26 = this.aClass219_3.method4622(arg2);
				@Pc(61) Class175 local61 = super.anInterface6_27.method1492(arg2);
				if (local61.aByte53 == 0 && local61.aByte54 == 0) {
					this.method7105();
				} else {
					@Pc(82) int local82 = local61.aBoolean309 ? 64 : 128;
					@Pc(86) int local86 = local82 * 50;
					@Pc(90) Class177_Sub1 local90 = this.method7017();
					local90.method3830((float) (this.anInt8347 % local86 * local61.aByte54) / (float) local86, 0.0F, (float) (this.anInt8347 % local86 * local61.aByte53) / (float) local86);
					this.method7099(Static409.aClass85_3);
				}
				if (!this.aBoolean630) {
					local39 = local61.aByte52;
					local32 = local61.anInt4383;
					local30 = local61.aByte56;
				}
				local28 = local61.anInt4382;
			}
			this.method7039(local30, local39, arg1, arg0, local32);
			if (this.aClass7_3 == null) {
				this.method7112(local26);
				this.method7026(local28);
			} else {
				this.aClass7_3.method8126(local28, local26);
			}
			this.anInt8383 = arg2;
			this.bf = this.aBoolean630;
		}
		this.anInt8352 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pga", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public final void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7019();
		this.method7079(arg4);
		this.method7139(0, Static185.aClass291_3);
		this.method7095(0, Static185.aClass291_3);
		this.method7137(arg5);
		this.aClass177_Sub1_15.method3840((float) arg3, 1.0F, (float) arg2);
		this.aClass177_Sub1_15.method7872(arg0, arg1, 0);
		this.method7062();
		this.method7126(false);
		this.method7024();
		this.method7126(true);
		this.method7095(0, Static634.aClass291_4);
		this.method7139(0, Static634.aClass291_4);
	}

	@OriginalMember(owner = "client!pga", name = "cb", descriptor = "(I)V")
	public final void method7149() {
		if (this.anInt8352 == 16) {
			return;
		}
		this.method7094();
		this.method7065(true);
		this.method7013(true);
		this.method7033(true);
		this.method7137(1);
		this.anInt8352 = 16;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!kda;IIII)Lclient!ka;")
	@Override
	public final Class182 method6938(@OriginalArg(0) Class186 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class182_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!pga", name = "j", descriptor = "()Z")
	@Override
	public final boolean method6958() {
		return true;
	}

	@OriginalMember(owner = "client!pga", name = "e", descriptor = "(I)V")
	@Override
	public final void method6949(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass219_3 != null) {
			this.aClass219_3.method4627();
		}
		this.anInt8361 = arg0;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}
}
