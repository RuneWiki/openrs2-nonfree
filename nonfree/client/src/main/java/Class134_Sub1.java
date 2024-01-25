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

@OriginalClass("client!hea")
public abstract class Class134_Sub1 extends Class134 {

	@OriginalMember(owner = "client!hea", name = "w", descriptor = "Lclient!uk;")
	protected Class331 aClass331_8;

	@OriginalMember(owner = "client!hea", name = "vb", descriptor = "Ljava/util/Hashtable;")
	private Hashtable aHashtable7;

	@OriginalMember(owner = "client!hea", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!hea", name = "Jb", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!hea", name = "sd", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!hea", name = "Ld", descriptor = "I")
	protected int anInt8420;

	@OriginalMember(owner = "client!hea", name = "Qd", descriptor = "I")
	public int anInt8423;

	@OriginalMember(owner = "client!hea", name = "Sd", descriptor = "I")
	public int anInt8425;

	@OriginalMember(owner = "client!hea", name = "de", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!hea", name = "fe", descriptor = "I")
	public int anInt8428;

	@OriginalMember(owner = "client!hea", name = "ge", descriptor = "Lclient!vca;")
	private Class34 aClass34_3;

	@OriginalMember(owner = "client!hea", name = "he", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!hea", name = "ie", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!hea", name = "le", descriptor = "Z")
	protected boolean aBoolean634;

	@OriginalMember(owner = "client!hea", name = "pe", descriptor = "Lclient!rea;")
	private Class285 aClass285_3;

	@OriginalMember(owner = "client!hea", name = "qe", descriptor = "Z")
	public boolean aBoolean635;

	@OriginalMember(owner = "client!hea", name = "re", descriptor = "Lclient!uda;")
	private Class83_Sub1 aClass83_Sub1_3;

	@OriginalMember(owner = "client!hea", name = "Ee", descriptor = "F")
	private float aFloat192;

	@OriginalMember(owner = "client!hea", name = "Qe", descriptor = "[Lclient!qo;")
	protected Class113_Sub3[] aClass113_Sub3Array3;

	@OriginalMember(owner = "client!hea", name = "Ue", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!hea", name = "We", descriptor = "[Lclient!eca;")
	protected Class82[] aClass82Array5;

	@OriginalMember(owner = "client!hea", name = "Ze", descriptor = "I")
	public int anInt8444;

	@OriginalMember(owner = "client!hea", name = "af", descriptor = "I")
	public int anInt8445;

	@OriginalMember(owner = "client!hea", name = "df", descriptor = "I")
	private int anInt8446;

	@OriginalMember(owner = "client!hea", name = "ff", descriptor = "Z")
	protected boolean aBoolean644;

	@OriginalMember(owner = "client!hea", name = "jf", descriptor = "I")
	private int anInt8450;

	@OriginalMember(owner = "client!hea", name = "lf", descriptor = "I")
	protected int anInt8451;

	@OriginalMember(owner = "client!hea", name = "nf", descriptor = "Z")
	public boolean aBoolean647;

	@OriginalMember(owner = "client!hea", name = "rf", descriptor = "I")
	protected int anInt8453;

	@OriginalMember(owner = "client!hea", name = "sf", descriptor = "Lclient!bb;")
	public Interface3 anInterface3_3;

	@OriginalMember(owner = "client!hea", name = "uf", descriptor = "[Lclient!eca;")
	protected Class82[] aClass82Array6;

	@OriginalMember(owner = "client!hea", name = "vf", descriptor = "I")
	public int anInt8455;

	@OriginalMember(owner = "client!hea", name = "wf", descriptor = "I")
	protected int anInt8456;

	@OriginalMember(owner = "client!hea", name = "xf", descriptor = "I")
	protected int anInt8457;

	@OriginalMember(owner = "client!hea", name = "zf", descriptor = "Z")
	public boolean aBoolean648;

	@OriginalMember(owner = "client!hea", name = "Af", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!hea", name = "Cf", descriptor = "[Lclient!bb;")
	private Interface3[] anInterface3Array3;

	@OriginalMember(owner = "client!hea", name = "Lf", descriptor = "[Lclient!so;")
	protected Class309[] aClass309Array3;

	@OriginalMember(owner = "client!hea", name = "Mf", descriptor = "[Lclient!rc;")
	protected Class1_Sub18[] aClass1_Sub18Array6;

	@OriginalMember(owner = "client!hea", name = "Rf", descriptor = "F")
	private float aFloat199;

	@OriginalMember(owner = "client!hea", name = "Vf", descriptor = "F")
	public float aFloat201;

	@OriginalMember(owner = "client!hea", name = "Wf", descriptor = "Lclient!rd;")
	public Class284 aClass284_15;

	@OriginalMember(owner = "client!hea", name = "Xf", descriptor = "Lclient!dm;")
	public Class63_Sub1 aClass63_Sub1_21;

	@OriginalMember(owner = "client!hea", name = "Yf", descriptor = "Lclient!rd;")
	private Class284 aClass284_16;

	@OriginalMember(owner = "client!hea", name = "Zf", descriptor = "Lclient!dm;")
	public Class63_Sub1 aClass63_Sub1_22;

	@OriginalMember(owner = "client!hea", name = "ag", descriptor = "Lclient!rd;")
	public Class284 aClass284_17;

	@OriginalMember(owner = "client!hea", name = "bg", descriptor = "Lclient!dm;")
	public Class63_Sub1 aClass63_Sub1_23;

	@OriginalMember(owner = "client!hea", name = "cg", descriptor = "Lclient!rd;")
	private Class284 aClass284_18;

	@OriginalMember(owner = "client!hea", name = "dg", descriptor = "Lclient!rd;")
	public Class284 aClass284_19;

	@OriginalMember(owner = "client!hea", name = "eg", descriptor = "Lclient!rd;")
	public Class284 aClass284_20;

	@OriginalMember(owner = "client!hea", name = "fg", descriptor = "Lclient!rn;")
	private Interface20 anInterface20_8;

	@OriginalMember(owner = "client!hea", name = "gg", descriptor = "Lclient!dm;")
	public Class63_Sub1 aClass63_Sub1_24;

	@OriginalMember(owner = "client!hea", name = "hg", descriptor = "Lclient!dm;")
	public Class63_Sub1 aClass63_Sub1_25;

	@OriginalMember(owner = "client!hea", name = "ig", descriptor = "Lclient!dm;")
	public Class63_Sub1 aClass63_Sub1_26;

	@OriginalMember(owner = "client!hea", name = "jg", descriptor = "Lclient!dm;")
	public Class63_Sub1 aClass63_Sub1_27;

	@OriginalMember(owner = "client!hea", name = "kg", descriptor = "Lclient!bca;")
	private Interface4 anInterface4_14;

	@OriginalMember(owner = "client!hea", name = "lg", descriptor = "Lclient!dm;")
	public Class63_Sub1 aClass63_Sub1_28;

	@OriginalMember(owner = "client!hea", name = "mg", descriptor = "Lclient!dm;")
	public Class63_Sub1 aClass63_Sub1_29;

	@OriginalMember(owner = "client!hea", name = "ng", descriptor = "Lclient!bca;")
	private Interface4 anInterface4_15;

	@OriginalMember(owner = "client!hea", name = "pg", descriptor = "Lclient!dm;")
	public Class63_Sub1 aClass63_Sub1_30;

	@OriginalMember(owner = "client!hea", name = "qg", descriptor = "I")
	private int anInt8466;

	@OriginalMember(owner = "client!hea", name = "rg", descriptor = "Z")
	protected boolean aBoolean652;

	@OriginalMember(owner = "client!hea", name = "Qb", descriptor = "Lclient!wba;")
	private final Class353 aClass353_58 = new Class353();

	@OriginalMember(owner = "client!hea", name = "Md", descriptor = "Z")
	protected boolean aBoolean631 = true;

	@OriginalMember(owner = "client!hea", name = "Od", descriptor = "Lclient!qo;")
	protected final Class113_Sub3 aClass113_Sub3_15 = new Class113_Sub3();

	@OriginalMember(owner = "client!hea", name = "Td", descriptor = "Lclient!qo;")
	public Class113_Sub3 aClass113_Sub3_16 = new Class113_Sub3();

	@OriginalMember(owner = "client!hea", name = "Ud", descriptor = "Lclient!qo;")
	public final Class113_Sub3 aClass113_Sub3_17 = new Class113_Sub3();

	@OriginalMember(owner = "client!hea", name = "Vd", descriptor = "Lclient!qo;")
	protected final Class113_Sub3 aClass113_Sub3_18 = new Class113_Sub3();

	@OriginalMember(owner = "client!hea", name = "Wd", descriptor = "Lclient!qo;")
	private final Class113_Sub3 aClass113_Sub3_19 = new Class113_Sub3();

	@OriginalMember(owner = "client!hea", name = "Xd", descriptor = "Lclient!qo;")
	private final Class113_Sub3 aClass113_Sub3_20 = new Class113_Sub3();

	@OriginalMember(owner = "client!hea", name = "me", descriptor = "I")
	protected final int anInt8429 = 0;

	@OriginalMember(owner = "client!hea", name = "Ce", descriptor = "[F")
	private final float[] aFloatArray49 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!hea", name = "Yd", descriptor = "[F")
	public final float[] aFloatArray47 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!hea", name = "ue", descriptor = "Z")
	protected boolean aBoolean636 = false;

	@OriginalMember(owner = "client!hea", name = "ve", descriptor = "F")
	public float aFloat190 = -1.0F;

	@OriginalMember(owner = "client!hea", name = "Se", descriptor = "Z")
	private boolean aBoolean643 = false;

	@OriginalMember(owner = "client!hea", name = "oe", descriptor = "I")
	public int anInt8430 = -1;

	@OriginalMember(owner = "client!hea", name = "Ae", descriptor = "Z")
	protected boolean aBoolean637 = true;

	@OriginalMember(owner = "client!hea", name = "Be", descriptor = "Z")
	private boolean aBoolean638 = false;

	@OriginalMember(owner = "client!hea", name = "Me", descriptor = "[Lclient!vca;")
	private final Class34[] aClass34Array3 = new Class34[10];

	@OriginalMember(owner = "client!hea", name = "Fe", descriptor = "I")
	public int anInt8436 = 128;

	@OriginalMember(owner = "client!hea", name = "se", descriptor = "I")
	public int anInt8431 = 8;

	@OriginalMember(owner = "client!hea", name = "Ye", descriptor = "[F")
	public final float[] aFloatArray52 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

	@OriginalMember(owner = "client!hea", name = "ef", descriptor = "I")
	protected int anInt8447 = 0;

	@OriginalMember(owner = "client!hea", name = "Xe", descriptor = "I")
	public int anInt8443 = 0;

	@OriginalMember(owner = "client!hea", name = "cf", descriptor = "[F")
	private final float[] aFloatArray53 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!hea", name = "Re", descriptor = "I")
	protected int anInt8440 = 3584;

	@OriginalMember(owner = "client!hea", name = "Le", descriptor = "Z")
	private boolean aBoolean641 = false;

	@OriginalMember(owner = "client!hea", name = "ye", descriptor = "I")
	protected int anInt8433 = 0;

	@OriginalMember(owner = "client!hea", name = "ze", descriptor = "I")
	protected int anInt8434 = 0;

	@OriginalMember(owner = "client!hea", name = "tf", descriptor = "I")
	private int anInt8454 = -1;

	@OriginalMember(owner = "client!hea", name = "Te", descriptor = "I")
	public int anInt8441 = 3;

	@OriginalMember(owner = "client!hea", name = "mf", descriptor = "Z")
	protected boolean aBoolean646 = true;

	@OriginalMember(owner = "client!hea", name = "Ie", descriptor = "Z")
	protected boolean aBoolean640 = true;

	@OriginalMember(owner = "client!hea", name = "je", descriptor = "Lclient!no;")
	protected Class240 aClass240_7 = Static498.aClass240_8;

	@OriginalMember(owner = "client!hea", name = "we", descriptor = "I")
	protected int anInt8432 = 0;

	@OriginalMember(owner = "client!hea", name = "qf", descriptor = "[F")
	private final float[] aFloatArray55 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

	@OriginalMember(owner = "client!hea", name = "ce", descriptor = "Z")
	protected boolean aBoolean632 = true;

	@OriginalMember(owner = "client!hea", name = "De", descriptor = "I")
	private int anInt8435 = -1;

	@OriginalMember(owner = "client!hea", name = "pf", descriptor = "[F")
	private final float[] aFloatArray54 = new float[16];

	@OriginalMember(owner = "client!hea", name = "Ne", descriptor = "I")
	private int anInt8439 = 0;

	@OriginalMember(owner = "client!hea", name = "kf", descriptor = "Z")
	private boolean aBoolean645 = false;

	@OriginalMember(owner = "client!hea", name = "Ge", descriptor = "Z")
	protected boolean aBoolean639 = false;

	@OriginalMember(owner = "client!hea", name = "Bf", descriptor = "I")
	private int anInt8459 = 0;

	@OriginalMember(owner = "client!hea", name = "hf", descriptor = "I")
	protected final int anInt8449 = 0;

	@OriginalMember(owner = "client!hea", name = "ee", descriptor = "Z")
	private boolean aBoolean633 = false;

	@OriginalMember(owner = "client!hea", name = "yf", descriptor = "I")
	private int anInt8458 = 1;

	@OriginalMember(owner = "client!hea", name = "Ke", descriptor = "[F")
	private final float[] aFloatArray50 = new float[16];

	@OriginalMember(owner = "client!hea", name = "He", descriptor = "I")
	public int anInt8437 = 0;

	@OriginalMember(owner = "client!hea", name = "ae", descriptor = "[F")
	protected float[] aFloatArray48 = this.aFloatArray53;

	@OriginalMember(owner = "client!hea", name = "Ef", descriptor = "I")
	public int anInt8460 = -1;

	@OriginalMember(owner = "client!hea", name = "be", descriptor = "I")
	public int anInt8427 = 512;

	@OriginalMember(owner = "client!hea", name = "Df", descriptor = "F")
	public float aFloat195 = 1.0F;

	@OriginalMember(owner = "client!hea", name = "If", descriptor = "I")
	protected int anInt8461 = 0;

	@OriginalMember(owner = "client!hea", name = "ne", descriptor = "F")
	public float aFloat189 = 1.0F;

	@OriginalMember(owner = "client!hea", name = "Pe", descriptor = "[F")
	private final float[] aFloatArray51 = new float[16];

	@OriginalMember(owner = "client!hea", name = "Oe", descriptor = "Z")
	protected boolean aBoolean642 = true;

	@OriginalMember(owner = "client!hea", name = "bf", descriptor = "F")
	public float bf = 1.0F;

	@OriginalMember(owner = "client!hea", name = "Jf", descriptor = "I")
	private int anInt8462 = 0;

	@OriginalMember(owner = "client!hea", name = "gf", descriptor = "I")
	private int anInt8448 = 0;

	@OriginalMember(owner = "client!hea", name = "Pf", descriptor = "F")
	public float aFloat198 = -1.0F;

	@OriginalMember(owner = "client!hea", name = "Of", descriptor = "Z")
	private boolean aBoolean650 = false;

	@OriginalMember(owner = "client!hea", name = "Ff", descriptor = "F")
	public float aFloat196 = 1.0F;

	@OriginalMember(owner = "client!hea", name = "Nf", descriptor = "F")
	public float aFloat197 = 3584.0F;

	@OriginalMember(owner = "client!hea", name = "Hf", descriptor = "Z")
	protected boolean aBoolean649 = false;

	@OriginalMember(owner = "client!hea", name = "of", descriptor = "I")
	private int anInt8452 = -1;

	@OriginalMember(owner = "client!hea", name = "Kf", descriptor = "I")
	public int anInt8463 = 50;

	@OriginalMember(owner = "client!hea", name = "Uf", descriptor = "I")
	public int anInt8465 = 512;

	@OriginalMember(owner = "client!hea", name = "Sf", descriptor = "F")
	public float aFloat200 = 3584.0F;

	@OriginalMember(owner = "client!hea", name = "Ve", descriptor = "I")
	public int anInt8442 = 0;

	@OriginalMember(owner = "client!hea", name = "Qf", descriptor = "Z")
	protected boolean aBoolean651 = false;

	@OriginalMember(owner = "client!hea", name = "Tf", descriptor = "I")
	private int anInt8464 = 16777215;

	@OriginalMember(owner = "client!hea", name = "Gf", descriptor = "Lclient!nba;")
	protected Class231 aClass231_7 = Static451.aClass231_6;

	@OriginalMember(owner = "client!hea", name = "xe", descriptor = "F")
	private float aFloat191 = 1.0F;

	@OriginalMember(owner = "client!hea", name = "ke", descriptor = "Lclient!jaclib/memory/Stream;")
	private final Stream aStream7 = new Stream();

	@OriginalMember(owner = "client!hea", name = "og", descriptor = "Lclient!qo;")
	private final Class113_Sub3 aClass113_Sub3_21 = new Class113_Sub3();

	@OriginalMember(owner = "client!hea", name = "xb", descriptor = "Ljava/awt/Canvas;")
	protected final Canvas aCanvas15;

	@OriginalMember(owner = "client!hea", name = "G", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas14;

	@OriginalMember(owner = "client!hea", name = "Lb", descriptor = "Ljava/lang/Object;")
	protected final Object anObject21;

	@OriginalMember(owner = "client!hea", name = "R", descriptor = "Ljava/lang/Object;")
	private Object anObject20;

	@OriginalMember(owner = "client!hea", name = "Ec", descriptor = "Lclient!pu;")
	protected final Class270 aClass270_101;

	@OriginalMember(owner = "client!hea", name = "Zd", descriptor = "I")
	protected final int anInt8426;

	@OriginalMember(owner = "client!hea", name = "Gd", descriptor = "I")
	private int anInt8415;

	@OriginalMember(owner = "client!hea", name = "wc", descriptor = "I")
	public int anInt8356;

	@OriginalMember(owner = "client!hea", name = "oc", descriptor = "I")
	private int anInt8348;

	@OriginalMember(owner = "client!hea", name = "pd", descriptor = "I")
	public int anInt8399;

	@OriginalMember(owner = "client!hea", name = "Je", descriptor = "I")
	public final int anInt8438;

	@OriginalMember(owner = "client!hea", name = "te", descriptor = "Lclient!bw;")
	private final Class42 aClass42_3;

	@OriginalMember(owner = "client!hea", name = "Yc", descriptor = "Lclient!jagex3/graphics2/hw/NativeInterface;")
	public final NativeInterface aNativeInterface3;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lclient!fa;Lclient!pu;II)V")
	protected Class134_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class270 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg2);
		this.aCanvas14 = this.aCanvas15 = arg0;
		this.anObject20 = this.anObject21 = arg1;
		this.aClass270_101 = arg3;
		this.anInt8426 = arg4;
		@Pc(307) Dimension local307 = arg0.getSize();
		this.anInt8356 = this.anInt8415 = local307.height;
		this.anInt8399 = this.anInt8348 = local307.width;
		this.anInt8438 = arg5;
		Static209.method3312(false, true);
		if (super.anInterface7_10 == null) {
			this.aNativeInterface3 = new NativeInterface(0, this.anInt8438);
			this.aClass42_3 = null;
		} else {
			this.aClass42_3 = new Class42(this, super.anInterface7_10);
			this.aNativeInterface3 = new NativeInterface(super.anInterface7_10.method3870(), this.anInt8438);
			for (@Pc(352) int local352 = 0; super.anInterface7_10.method3870() > local352; local352++) {
				@Pc(360) Class3 local360 = super.anInterface7_10.method3874(local352);
				if (local360 != null) {
					this.aNativeInterface3.initTextureMetrics(local352, local360.aByte2, local360.aByte5);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I[Lclient!rc;)V")
	@Override
	public final void method6953(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass1_Sub18Array6[local3] = arg1[local3];
		}
		this.anInt8456 = arg0;
		if (this.aClass240_7.method4883()) {
			this.method6795();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!kda;II)V")
	public abstract void method6723(@OriginalArg(1) Class185 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(II)V")
	public final void method6724(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method6770(Static447.aClass82_5, Static447.aClass82_5);
		} else if (arg0 == 0) {
			this.method6770(Static292.aClass82_4, Static292.aClass82_4);
		} else if (arg0 == 2) {
			this.method6770(Static116.aClass82_3, Static447.aClass82_5);
		} else if (arg0 == 3) {
			this.method6770(Static59.aClass82_2, Static292.aClass82_4);
		} else if (arg0 == 4) {
			this.method6770(Static58.aClass82_1, Static58.aClass82_1);
		}
	}

	@OriginalMember(owner = "client!hea", name = "h", descriptor = "(I)[F")
	public final float[] method6725() {
		return this.aFloatArray53;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)V")
	public final void method6726() {
		if (this.anInt8450 == 16) {
			return;
		}
		this.method6850();
		this.method6782(true);
		this.method6731(true);
		this.method6827(true);
		this.method6746(1);
		this.anInt8450 = 16;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
	@Override
	public void method6925(@OriginalArg(0) int arg0) {
		if (this.aClass42_3 != null) {
			this.aClass42_3.method752();
		}
		this.anInt8444 = Integer.MAX_VALUE & arg0;
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)V")
	public final void method6727() {
		this.method6814(Static567.aClass185_6, 2);
	}

	@OriginalMember(owner = "client!hea", name = "i", descriptor = "(I)V")
	private void method6728() {
		this.method6739();
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7018();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method6919(@OriginalArg(0) Class113 arg0) {
		this.aClass113_Sub3_16 = (Class113_Sub3) arg0;
		this.aClass113_Sub3_18.M(this.aClass113_Sub3_16);
		this.aClass113_Sub3_18.method6073();
		this.aClass113_Sub3_19.method6059(this.aClass113_Sub3_18);
		this.aClass113_Sub3_17.method6059(this.aClass113_Sub3_16);
		if (this.aClass240_7.method4883()) {
			this.method6831();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)I")
	@Override
	public final int method6915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!uq;[Lclient!fg;Z)Lclient!la;")
	@Override
	public final Class64 method6899(@OriginalArg(0) Class334 arg0, @OriginalArg(1) Class102[] arg1) {
		return new Class64_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIII)Lclient!jba;")
	@Override
	public final Class83 method6911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return new Class83_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "()Z")
	@Override
	public final boolean method6905() {
		return true;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZB)V")
	public final void method6729(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean642 != arg0) {
			this.aBoolean642 = arg0;
			this.method6848();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(FFFFFFB)Z")
	private boolean method6730(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(9) Buffer local9 = this.anInterface4_15.method2465();
		if (local9 == null) {
			return false;
		}
		@Pc(18) Stream local18 = this.method6846(local9);
		if (Stream.c()) {
			local18.a(arg5);
			local18.a(arg2);
			local18.a(arg3);
			local18.a(arg0);
			local18.a(arg4);
			local18.a(arg1);
		} else {
			local18.b(arg5);
			local18.b(arg2);
			local18.b(arg3);
			local18.b(arg0);
			local18.b(arg4);
			local18.b(arg1);
		}
		local18.a();
		return this.anInterface4_15.method2466();
	}

	@OriginalMember(owner = "client!hea", name = "z", descriptor = "()Lclient!q;")
	@Override
	public final Class113 method6963() {
		return this.aClass113_Sub3_21;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZ)V")
	public final void method6731(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean651) {
			this.aBoolean651 = arg0;
			this.method6762();
			this.anInt8450 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!hea", name = "q", descriptor = "()Z")
	@Override
	public final boolean method6936() {
		return true;
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(B)V")
	private void method6732() {
		this.anInterface4_15 = this.method6805(true);
		this.anInterface4_15.method2468(24, 12);
		this.aClass284_16 = this.method6855(new Class7[] { new Class7(Static282.aClass198_1) });
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(II)I")
	@Override
	public final int method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZ[BILclient!lca;IZI)Lclient!oi;")
	protected abstract Interface14 method6733(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class203 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean arg4);

	@OriginalMember(owner = "client!hea", name = "j", descriptor = "(I)I")
	public final int method6734() {
		return this.anInt8435;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(BZ)V")
	public final void method6735(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean649 != arg0) {
			this.aBoolean649 = arg0;
			this.method6807();
			this.anInt8450 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!hea", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
	}

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(Z)V")
	protected final void method6736() {
		@Pc(9) Hashtable local9 = new Hashtable();
		if (this.aHashtable7 != null && !this.aHashtable7.isEmpty()) {
			@Pc(20) Enumeration local20 = this.aHashtable7.keys();
			while (local20.hasMoreElements()) {
				@Pc(26) Canvas local26 = (Canvas) local20.nextElement();
				local9.put(local26, this.method6751(local26));
			}
		}
		this.aHashtable7 = local9;
		this.method6851();
		this.method6732();
		this.aClass285_3.method6187(this);
	}

	@OriginalMember(owner = "client!hea", name = "k", descriptor = "(I)V")
	private void method6737() {
		this.aFloatArray50[10] = this.aFloat199;
		this.aFloatArray50[14] = this.aFloat192;
		this.aFloat200 = ((float) -this.anInt8440 + this.aFloatArray50[14]) / this.aFloatArray50[10];
	}

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(II)V")
	public final void method6738(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt8451) {
			this.anInt8451 = arg0;
			this.method6841();
		}
	}

	@OriginalMember(owner = "client!hea", name = "l", descriptor = "(I)V")
	protected abstract void method6739();

	@OriginalMember(owner = "client!hea", name = "m", descriptor = "(I)V")
	private void method6740() {
		if (this.aBoolean645) {
			return;
		}
		@Pc(9) float[] local9 = this.aFloatArray51;
		if (this.anInt8399 == 0 || this.anInt8356 == 0) {
			local9[2] = 0.0F;
			local9[10] = 1.0F;
			local9[9] = 0.0F;
			local9[12] = 0.0F;
			local9[11] = 0.0F;
			local9[6] = 0.0F;
			local9[14] = 0.0F;
			local9[4] = 0.0F;
			local9[5] = 1.0F;
			local9[8] = 0.0F;
			local9[0] = 1.0F;
			local9[15] = 1.0F;
			local9[1] = 0.0F;
			local9[3] = 0.0F;
			local9[13] = 0.0F;
			local9[7] = 0.0F;
		} else {
			local9[11] = 0.0F;
			local9[2] = 0.0F;
			local9[5] = -2.0F / (float) this.anInt8356;
			local9[15] = 1.0F;
			local9[9] = 0.0F;
			local9[6] = 0.0F;
			local9[4] = 0.0F;
			local9[10] = 0.5F;
			local9[7] = 0.0F;
			local9[14] = 0.5F;
			local9[3] = 0.0F;
			local9[0] = 2.0F / (float) this.anInt8399;
			local9[8] = 0.0F;
			local9[12] = -1.0F;
			local9[13] = 1.0F;
			local9[1] = 0.0F;
		}
		this.aBoolean645 = true;
	}

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(B)V")
	public final void method6741() {
		this.aClass82Array6 = new Class82[this.anInt8455];
		this.aClass113_Sub3Array3 = new Class113_Sub3[this.anInt8455];
		this.aClass309Array3 = new Class309[this.anInt8455];
		this.anInterface3Array3 = new Interface3[this.anInt8455];
		this.aClass82Array5 = new Class82[this.anInt8455];
		for (@Pc(32) int local32 = 0; local32 < this.anInt8455; local32++) {
			this.aClass82Array6[local32] = Static292.aClass82_4;
			this.aClass82Array5[local32] = Static292.aClass82_4;
			this.aClass309Array3[local32] = Static428.aClass309_6;
			this.aClass113_Sub3Array3[local32] = new Class113_Sub3();
		}
		this.aClass1_Sub18Array6 = new Class1_Sub18[this.anInt8453 - 2];
		this.anInterface3_3 = this.method6818(1, Static215.aClass155_10, Static129.aClass203_5, 1);
		this.method6916(new Class1_Sub5_Sub1(262144));
		this.aClass284_19 = this.method6855(new Class7[] { new Class7(new Class198[] { Static282.aClass198_1, Static282.aClass198_5 }) });
		this.aClass284_15 = this.method6855(new Class7[] { new Class7(new Class198[] { Static282.aClass198_1, Static282.aClass198_3 }) });
		this.aClass284_17 = this.method6855(new Class7[] { new Class7(Static282.aClass198_1), new Class7(Static282.aClass198_3), new Class7(Static282.aClass198_5), new Class7(Static282.aClass198_2) });
		this.aClass284_20 = this.method6855(new Class7[] { new Class7(Static282.aClass198_1), new Class7(Static282.aClass198_3), new Class7(Static282.aClass198_5) });
		this.aClass63_Sub1_25 = new Class63_Sub1(this, 0, 0, false, false);
		this.aClass63_Sub1_27 = new Class63_Sub1(this, 0, 0, true, true);
		this.aClass63_Sub1_24 = new Class63_Sub1(this, 0, 0, false, false);
		this.aClass63_Sub1_22 = new Class63_Sub1(this, 0, 0, true, true);
		this.aClass63_Sub1_21 = new Class63_Sub1(this, 0, 0, false, false);
		this.aClass63_Sub1_26 = new Class63_Sub1(this, 0, 0, true, true);
		this.aClass63_Sub1_29 = new Class63_Sub1(this, 0, 0, false, false);
		this.aClass63_Sub1_28 = new Class63_Sub1(this, 0, 0, true, true);
		this.aClass63_Sub1_23 = new Class63_Sub1(this, 0, 0, false, false);
		this.aClass63_Sub1_30 = new Class63_Sub1(this, 0, 0, true, true);
		this.aClass285_3 = new Class285(this);
		this.anInterface20_8 = this.method6804(true);
		this.method6736();
		this.aClass331_8 = new Class331(this);
		this.aClass34Array3[1] = this.method6800(1);
		this.aClass34Array3[2] = this.method6800(2);
		this.aClass34Array3[4] = this.method6800(4);
		this.aClass34Array3[5] = this.method6800(5);
		this.aClass34Array3[6] = this.method6800(6);
		this.aClass34Array3[7] = this.method6800(7);
		this.aClass34Array3[3] = this.method6800(3);
		this.aClass34Array3[8] = this.method6800(8);
		this.aClass34Array3[9] = this.method6800(9);
		if (!this.aClass34Array3[2].method7017()) {
			this.aClass34Array3[2] = this.method6800(0);
		}
		if (!this.aClass34Array3[4].method7017()) {
			this.aClass34Array3[4] = this.aClass34Array3[2];
		}
		if (!this.aClass34Array3[8].method7017()) {
			this.aClass34Array3[8] = this.aClass34Array3[4];
		}
		if (!this.aClass34Array3[9].method7017()) {
			this.aClass34Array3[9] = this.aClass34Array3[8];
		}
		this.method6790();
		this.JA();
		this.method6969();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!kj;I)V")
	public final void method6742(@OriginalArg(0) int arg0, @OriginalArg(1) Class192 arg1) {
		this.method6791(false, arg1, arg0, false);
	}

	@OriginalMember(owner = "client!hea", name = "BA", descriptor = "()I")
	@Override
	public final int BA() {
		return this.anInt8463;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!rd;)V")
	public abstract void method6743(@OriginalArg(1) Class284 arg0);

	@OriginalMember(owner = "client!hea", name = "n", descriptor = "(I)V")
	protected abstract void method6745();

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZI)V")
	public final void method6746(@OriginalArg(1) int arg0) {
		if (this.anInt8458 == arg0) {
			return;
		}
		@Pc(18) Class231 local18;
		@Pc(20) boolean local20;
		@Pc(16) boolean local16;
		if (arg0 == 1) {
			local16 = true;
			local18 = Static451.aClass231_6;
			local20 = true;
		} else if (arg0 == 2) {
			local16 = false;
			local20 = true;
			local18 = Static433.aClass231_5;
		} else if (arg0 == 128) {
			local16 = true;
			local20 = true;
			local18 = Static212.aClass231_3;
		} else {
			local18 = Static404.aClass231_4;
			local16 = false;
			local20 = false;
		}
		if (this.aBoolean640 != local16) {
			this.aBoolean640 = local16;
			this.method6801();
		}
		if (local20 != this.aBoolean637) {
			this.aBoolean637 = local20;
			this.method6796();
		}
		if (this.aClass231_7 != local18) {
			this.aClass231_7 = local18;
			this.method6844();
		}
		this.anInt8450 &= 0xFFFFFFE3;
		this.anInt8458 = arg0;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "()Z")
	@Override
	public final boolean method6897() {
		return this.aBoolean644;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!vi;)V")
	@Override
	public final void method6940(@OriginalArg(0) Class343 arg0) {
		this.aClass285_3.method6185(-1, arg0, this);
	}

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "(Z)V")
	protected abstract void method6747();

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "(I)Lclient!e;")
	@Override
	public final Class1_Sub5 method6964(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub5_Sub1 local8 = new Class1_Sub5_Sub1(arg0);
		this.aClass353_58.method7679(local8);
		return local8;
	}

	@OriginalMember(owner = "client!hea", name = "da", descriptor = "(IIII)V")
	@Override
	public final void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= 0 && arg2 >= this.anInt8399 - 1 && arg1 <= 0 && this.anInt8356 - 1 <= arg3) {
			this.JA();
			return;
		}
		this.anInt8432 = arg2 > this.anInt8399 ? 0 : arg2;
		this.anInt8461 = arg3 > this.anInt8399 ? 0 : arg3;
		this.anInt8447 = arg1 >= 0 ? arg1 : 0;
		this.anInt8434 = arg0 < 0 ? 0 : arg0;
		if (!this.aBoolean652) {
			this.aBoolean652 = true;
			this.method6767();
		}
		this.method6811();
		this.method6854();
	}

	@OriginalMember(owner = "client!hea", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt8440;
	}

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "(Z)Lclient!qo;")
	public final Class113_Sub3 method6748() {
		return this.aClass113_Sub3Array3[this.anInt8433];
	}

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "()Z")
	@Override
	public final boolean method6900() {
		return true;
	}

	@OriginalMember(owner = "client!hea", name = "V", descriptor = "(IIII)V")
	@Override
	public final void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) boolean local5 = false;
		if (arg0 > this.anInt8434) {
			this.anInt8434 = arg0;
			local5 = true;
		}
		if (arg2 < this.anInt8432) {
			local5 = true;
			this.anInt8432 = arg2;
		}
		if (arg1 > this.anInt8447) {
			local5 = true;
			this.anInt8447 = arg1;
		}
		if (this.anInt8461 > arg3) {
			local5 = true;
			this.anInt8461 = arg3;
		}
		if (!local5) {
			return;
		}
		if (!this.aBoolean652) {
			this.aBoolean652 = true;
			this.method6767();
		}
		this.method6811();
		this.method6854();
	}

	@OriginalMember(owner = "client!hea", name = "o", descriptor = "(I)V")
	public final void method6749() {
		this.method6849();
		this.method6785();
	}

	@OriginalMember(owner = "client!hea", name = "g", descriptor = "(I)V")
	@Override
	public final void method6966(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
	protected abstract void method6750(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!hea", name = "CA", descriptor = "(IIII)V")
	@Override
	public final void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8435 = arg1;
		this.anInt8446 = arg0;
		this.aBoolean635 = true;
		this.anInt8459 = arg3;
		this.anInt8454 = arg2;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
	protected abstract Object method6751(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!lca;I[FBIZ)Lclient!oi;")
	public final Interface14 method6752(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method6759(arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZLclient!lca;II[BI)Lclient!oi;")
	public final Interface14 method6753(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		return this.method6733(arg3, arg2, arg1, arg4, arg0);
	}

	@OriginalMember(owner = "client!hea", name = "A", descriptor = "()Z")
	@Override
	public final boolean method6968() {
		return this.aClass34Array3[3].method7017();
	}

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "(B)I")
	public final int method6754() {
		return this.anInt8433;
	}

	@OriginalMember(owner = "client!hea", name = "p", descriptor = "(I)V")
	public abstract void method6755();

	@OriginalMember(owner = "client!hea", name = "q", descriptor = "(I)V")
	private void method6756() {
		if (this.anInt8450 == 1) {
			return;
		}
		this.method6832();
		this.method6782(false);
		this.method6735(false);
		this.method6731(false);
		this.method6827(false);
		this.method6857(false, false, -2);
		this.method6724(1);
		this.method6766(this.anInterface3_3);
		this.anInt8450 = 1;
	}

	@OriginalMember(owner = "client!hea", name = "n", descriptor = "()Lclient!q;")
	@Override
	public final Class113 method6924() {
		return new Class113_Sub3();
	}

	@OriginalMember(owner = "client!hea", name = "r", descriptor = "(I)V")
	protected abstract void method6757();

	@OriginalMember(owner = "client!hea", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public final void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class204_Sub3 local6 = (Class204_Sub3) arg1;
		@Pc(9) Interface14 local9 = local6.anInterface14_4;
		this.method6853();
		this.method6766(local9);
		this.method6746(1);
		this.method6770(Static447.aClass82_5, Static447.aClass82_5);
		this.method6742(0, Static308.aClass192_1);
		this.method6738(arg0);
		this.aClass113_Sub3_15.method6054(0.0F, (float) this.anInt8356, (float) this.anInt8399);
		this.method6773();
		this.aClass113_Sub3Array3[0].method6054(1.0F, local9.method2133((float) this.anInt8356), local9.method2128((float) this.anInt8399));
		this.aClass113_Sub3Array3[0].method6070(local9.method2133((float) -arg3), 0.0F, local9.method2128((float) -arg2));
		this.aClass309Array3[0] = Static117.aClass309_2;
		this.method6728();
		this.method6727();
		this.method6813();
		this.method6742(0, Static430.aClass192_2);
	}

	@OriginalMember(owner = "client!hea", name = "o", descriptor = "()Z")
	@Override
	public final boolean method6931() {
		return true;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IBZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public final NativeHeapBuffer method6758(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return this.aNativeHeap6.a(arg0, arg1);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public final Class22 method6970(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class22_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "([FILclient!lca;IIZII)Lclient!oi;")
	protected abstract Interface14 method6759(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(FI)V")
	public final void method6760(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat191) {
			this.aFloat191 = arg0;
			this.method6817();
		}
	}

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "(I)V")
	@Override
	public final void method6965(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		if (this.aClass42_3 != null) {
			this.aClass42_3.method755();
		}
		this.anInt8436 = arg0;
	}

	@OriginalMember(owner = "client!hea", name = "g", descriptor = "(Z)I")
	public final int method6761() {
		return this.anInt8459;
	}

	@OriginalMember(owner = "client!hea", name = "s", descriptor = "(I)V")
	protected abstract void method6762();

	@OriginalMember(owner = "client!hea", name = "h", descriptor = "(Z)V")
	protected abstract void method6763();

	@OriginalMember(owner = "client!hea", name = "t", descriptor = "()Z")
	@Override
	public final boolean method6952() {
		return false;
	}

	@OriginalMember(owner = "client!hea", name = "i", descriptor = "(Z)Lclient!qo;")
	public final Class113_Sub3 method6764() {
		return this.aClass113_Sub3_15;
	}

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "()V")
	@Override
	public final void method6904() {
		if (this.aClass42_3 != null) {
			this.aClass42_3.method755();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!kda;IIZLclient!rn;II)V")
	public abstract void method6765(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface20 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!hea", name = "x", descriptor = "()Z")
	@Override
	public final boolean method6956() {
		return true;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZLclient!bb;)V")
	public final void method6766(@OriginalArg(1) Interface3 arg0) {
		if (this.anInterface3Array3[this.anInt8433] == arg0) {
			return;
		}
		this.anInterface3Array3[this.anInt8433] = arg0;
		if (arg0 == null) {
			this.method6747();
		} else {
			arg0.method5454();
		}
		this.anInt8450 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!hea", name = "s", descriptor = "()Z")
	@Override
	public final boolean method6951() {
		return true;
	}

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "(B)V")
	protected abstract void method6767();

	@OriginalMember(owner = "client!hea", name = "g", descriptor = "(B)V")
	private void method6768() {
		this.aBoolean633 = false;
		this.method6833();
		if (Static116.aClass240_1 == this.aClass240_7) {
			this.method6785();
		}
	}

	@OriginalMember(owner = "client!hea", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public final void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt8464;
		if (local15 || this.aFloat198 != arg1 || arg2 != this.aFloat190) {
			this.anInt8464 = arg0;
			this.aFloat198 = arg1;
			this.aFloat190 = arg2;
			if (local15) {
				this.aFloat189 = (float) (this.anInt8464 & 0xFF0000) / 1.671168E7F;
				this.aFloat195 = (float) (this.anInt8464 & 0xFF) / 255.0F;
				this.bf = (float) (this.anInt8464 & 0xFF00) / 65280.0F;
				this.method6745();
			}
			this.aNativeInterface3.setSunColour(this.aFloat189, this.bf, this.aFloat195, arg1, arg2);
			this.method6757();
		}
		if (arg3 != this.aFloatArray55[0] || this.aFloatArray55[1] != arg4 || this.aFloatArray55[2] != arg5) {
			this.aFloatArray55[2] = arg5;
			this.aFloatArray55[0] = arg3;
			this.aFloatArray55[1] = arg4;
			this.aFloatArray49[1] = -arg4;
			this.aFloatArray49[2] = -arg5;
			this.aFloatArray49[0] = -arg3;
			@Pc(153) float local153 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
			this.aFloatArray47[1] = local153 * arg4;
			this.aFloatArray47[0] = local153 * arg3;
			this.aFloatArray47[2] = arg5 * local153;
			this.aFloatArray52[1] = -this.aFloatArray47[1];
			this.aFloatArray52[0] = -this.aFloatArray47[0];
			this.aFloatArray52[2] = -this.aFloatArray47[2];
			this.aNativeInterface3.setSunDirection(this.aFloatArray47[0], this.aFloatArray47[1], this.aFloatArray47[2]);
			this.method6755();
			this.anInt8428 = (int) (arg3 * 256.0F / arg4);
			this.anInt8445 = (int) (arg5 * 256.0F / arg4);
		}
		this.method6793();
	}

	@OriginalMember(owner = "client!hea", name = "t", descriptor = "(I)V")
	protected abstract void method6769();

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!eca;ILclient!eca;)V")
	public final void method6770(@OriginalArg(0) Class82 arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(5) boolean local5 = false;
		if (arg0 != this.aClass82Array5[this.anInt8433]) {
			this.aClass82Array5[this.anInt8433] = arg0;
			local5 = true;
			this.method6797();
		}
		if (this.aClass82Array6[this.anInt8433] != arg1) {
			this.aClass82Array6[this.anInt8433] = arg1;
			local5 = true;
			this.method6798();
		}
		if (local5) {
			this.anInt8450 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!hea", name = "m", descriptor = "()V")
	@Override
	protected void method6923() {
		if (this.aBoolean650) {
			return;
		}
		for (@Pc(13) Class1 local13 = this.aClass353_58.method7677(); local13 != null; local13 = this.aClass353_58.method7687()) {
			((Class1_Sub5_Sub1) local13).method185();
		}
		@Pc(30) Enumeration local30 = this.aHashtable7.keys();
		while (local30.hasMoreElements()) {
			@Pc(36) Canvas local36 = (Canvas) local30.nextElement();
			this.method6794(local36, this.aHashtable7.get(local36));
		}
		Static13.method128(false, true);
		this.aNativeInterface3.release();
		this.aBoolean650 = true;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "([[IZIB)Lclient!gp;")
	public abstract Interface8 method6771(@OriginalArg(0) int[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hea", name = "L", descriptor = "()V")
	@Override
	public final void L() {
		this.aBoolean635 = false;
	}

	@OriginalMember(owner = "client!hea", name = "u", descriptor = "(I)V")
	protected abstract void method6772();

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6909(@OriginalArg(0) Canvas arg0) {
		@Pc(5) Object local5 = null;
		if (arg0 == null || this.aCanvas15 == arg0) {
			local5 = this.anObject20;
		} else if (this.aHashtable7.containsKey(arg0)) {
			local5 = this.aHashtable7.get(arg0);
		}
		if (local5 == null) {
			throw new RuntimeException();
		}
		this.method6774(arg0, local5);
		if (this.aCanvas14 == arg0) {
			this.method6806();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public final Class204 method6945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static77.method1314(arg0, this, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIF)Lclient!rc;")
	@Override
	public final Class1_Sub18 method6928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub18_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!hea", name = "va", descriptor = "(I)V")
	@Override
	public final void va(@OriginalArg(0) int arg0) {
		this.anInt8441 = 0;
		while (arg0 > 1) {
			this.anInt8441++;
			arg0 >>= 0x1;
		}
		this.anInt8431 = 0x1 << this.anInt8441;
	}

	@OriginalMember(owner = "client!hea", name = "YA", descriptor = "(IIII)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean635) {
			throw new RuntimeException("");
		}
		this.anInt8446 = arg0;
		this.anInt8459 = arg3;
		this.anInt8454 = arg2;
		this.anInt8435 = arg1;
		if (this.aBoolean641) {
			this.aClass34Array3[3].method7010();
			this.aClass34Array3[3].method7019();
		}
	}

	@OriginalMember(owner = "client!hea", name = "T", descriptor = "()I")
	@Override
	public final int T() {
		return this.anInt8466;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method6949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6946(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas15 == arg0) {
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
			@Pc(53) Object local53 = this.method6751(arg0);
			if (local53 == null) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, local53);
		}
	}

	@OriginalMember(owner = "client!hea", name = "j", descriptor = "(Z)V")
	public final void method6773() {
		this.aBoolean631 = false;
		this.method6834();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method6774(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!hea", name = "v", descriptor = "(I)V")
	public final void method6775() {
		if (this.anInt8450 == 8) {
			return;
		}
		this.method6819();
		this.method6782(true);
		this.method6731(true);
		this.method6827(true);
		this.method6746(1);
		this.anInt8450 = 8;
	}

	@OriginalMember(owner = "client!hea", name = "ZA", descriptor = "(Z)V")
	@Override
	public final void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean646 = arg0;
		this.method6772();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!lca;Lclient!ig;Z)Z")
	public abstract boolean method6777(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class155 arg1);

	@OriginalMember(owner = "client!hea", name = "w", descriptor = "(I)V")
	private void method6778() {
		this.aFloat197 = this.anInt8440;
	}

	@OriginalMember(owner = "client!hea", name = "h", descriptor = "(B)V")
	protected abstract void method6779();

	@OriginalMember(owner = "client!hea", name = "u", descriptor = "()Z")
	@Override
	public final boolean method6954() {
		return false;
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(ZI)V")
	public abstract void method6780(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(IZ)V")
	public final void method6781(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean632) {
			this.aBoolean632 = arg0;
			this.method6792();
		}
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(ZI)V")
	public final void method6782(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean634 != arg0) {
			this.aBoolean634 = arg0;
			this.method6792();
			this.anInt8450 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!hea", name = "AA", descriptor = "(III[I)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass113_Sub3_16.method6065((float) arg2, (float) arg1, (float) arg0);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt8427 * this.aClass113_Sub3_16.method6061((float) arg1, (float) arg0, (float) arg2) / local14);
			local58 = (int) ((float) this.anInt8465 * this.aClass113_Sub3_16.method6064((float) arg1, (float) arg2, (float) arg0) / local14);
		} else {
			local40 = this.anInt8442;
			local58 = this.anInt8443;
		}
		arg3[2] = (int) local14;
		arg3[1] = (int) ((float) local58 - this.aFloat194);
		arg3[0] = (int) ((float) local40 - this.aFloat186);
	}

	@OriginalMember(owner = "client!hea", name = "ra", descriptor = "(F)V")
	@Override
	public final void ra(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat196) {
			this.aFloat196 = arg0;
			this.aNativeInterface3.setAmbient(arg0);
			this.method6745();
			this.method6793();
		}
	}

	@OriginalMember(owner = "client!hea", name = "x", descriptor = "(I)V")
	private void method6783() {
		this.method6745();
		this.method6757();
		this.method6807();
		this.method6795();
		this.method6755();
		this.method6793();
		this.method6848();
		this.method6762();
		this.method6772();
		this.method6792();
		this.method6763();
		this.method6796();
		this.method6844();
		this.method6801();
		for (@Pc(56) int local56 = this.anInt8455 - 1; local56 >= 0; local56--) {
			this.method6788(local56);
			this.method6797();
			this.method6798();
			this.method6813();
		}
		this.method6841();
		this.method6769();
		this.method6799();
		this.method6779();
		this.method6815();
	}

	@OriginalMember(owner = "client!hea", name = "y", descriptor = "(I)I")
	public final int method6784() {
		return this.anInt8446;
	}

	@OriginalMember(owner = "client!hea", name = "z", descriptor = "(I)V")
	private void method6785() {
		this.method6799();
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7015();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!jba;)V")
	@Override
	public final void method6913(@OriginalArg(0) Class83 arg0) {
		this.aClass83_Sub1_3 = (Class83_Sub1) arg0;
	}

	@OriginalMember(owner = "client!hea", name = "i", descriptor = "()Z")
	@Override
	public final boolean method6908() {
		return false;
	}

	@OriginalMember(owner = "client!hea", name = "A", descriptor = "(I)Lclient!qo;")
	public final Class113_Sub3 method6786() {
		if (!this.aBoolean638) {
			this.aClass113_Sub3_20.method6062(this.aClass113_Sub3_18, this.aClass113_Sub3_15);
			this.aBoolean638 = true;
		}
		return this.aClass113_Sub3_20;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public final void method6932() {
	}

	@OriginalMember(owner = "client!hea", name = "JA", descriptor = "()V")
	@Override
	public final void JA() {
		this.anInt8434 = 0;
		this.anInt8447 = 0;
		this.anInt8432 = this.anInt8399;
		this.anInt8461 = this.anInt8356;
		if (this.aBoolean652) {
			this.aBoolean652 = false;
			this.method6767();
		}
		this.method6854();
	}

	@OriginalMember(owner = "client!hea", name = "i", descriptor = "(B)Lclient!qo;")
	public final Class113_Sub3 method6787() {
		return this.aClass113_Sub3Array3[this.anInt8433];
	}

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "(II)V")
	public final void method6788(@OriginalArg(1) int arg0) {
		if (this.anInt8433 != arg0) {
			this.anInt8433 = arg0;
			this.method6840();
		}
	}

	@OriginalMember(owner = "client!hea", name = "B", descriptor = "(I)V")
	private void method6789() {
		this.aBoolean645 = false;
		if (Static179.aClass240_10 == this.aClass240_7) {
			this.method6740();
			this.method6785();
		}
	}

	@OriginalMember(owner = "client!hea", name = "la", descriptor = "(IIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8427 = arg2;
		this.anInt8443 = arg1;
		this.anInt8442 = arg0;
		this.anInt8465 = arg3;
		this.method6817();
		this.method6768();
		this.method6849();
		this.method6854();
	}

	@OriginalMember(owner = "client!hea", name = "j", descriptor = "()Z")
	@Override
	public final boolean method6912() {
		return true;
	}

	@OriginalMember(owner = "client!hea", name = "w", descriptor = "()I")
	@Override
	public final int method6955() {
		return this.anInt8453 - 2;
	}

	@OriginalMember(owner = "client!hea", name = "j", descriptor = "(B)V")
	protected void method6790() {
		this.method6783();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZLclient!kj;IIZ)V")
	public abstract void method6791(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!hea", name = "k", descriptor = "(Z)V")
	protected abstract void method6792();

	@OriginalMember(owner = "client!hea", name = "C", descriptor = "(I)V")
	protected abstract void method6793();

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
	protected abstract void method6794(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Object arg1);

	@OriginalMember(owner = "client!hea", name = "l", descriptor = "(Z)V")
	protected void method6795() {
		this.anInt8457 = this.anInt8456;
		this.anInt8456 = 0;
	}

	@OriginalMember(owner = "client!hea", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public final boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) float local14 = this.aClass113_Sub3_16.method6065((float) arg2, (float) arg1, (float) arg0);
		if (local14 < 1.0F) {
			local14 = 1.0F;
		}
		@Pc(31) float local31 = this.aClass113_Sub3_16.method6065((float) arg5, (float) arg4, (float) arg3);
		if (local31 < 1.0F) {
			local31 = 1.0F;
		}
		if (local14 < (float) this.anInt8463 && (float) this.anInt8463 > local31 || !(!(local14 > (float) this.anInt8440) || !(local31 > (float) this.anInt8440))) {
			return false;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt8427 * this.aClass113_Sub3_16.method6061((float) arg1, (float) arg0, (float) arg2) / local14);
		@Pc(99) int local99 = (int) ((float) this.anInt8427 * this.aClass113_Sub3_16.method6061((float) arg4, (float) arg3, (float) arg5) / local31);
		if ((float) local81 < this.aFloat186 && (float) local99 < this.aFloat186 || this.aFloat188 < (float) local81 && (float) local99 > this.aFloat188) {
			return false;
		} else {
			@Pc(143) int local143 = (int) ((float) this.anInt8465 * this.aClass113_Sub3_16.method6064((float) arg1, (float) arg2, (float) arg0) / local14);
			@Pc(161) int local161 = (int) ((float) this.anInt8465 * this.aClass113_Sub3_16.method6064((float) arg4, (float) arg5, (float) arg3) / local31);
			return (!((float) local143 < this.aFloat194) || !((float) local161 < this.aFloat194)) && (!((float) local143 > this.aFloat193) || !(this.aFloat193 < (float) local161));
		}
	}

	@OriginalMember(owner = "client!hea", name = "k", descriptor = "(B)V")
	protected abstract void method6796();

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!fg;Z)Lclient!f;")
	@Override
	public final Class22 method6896(@OriginalArg(0) Class102 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(23) Class22 local23;
		if (arg0.anInt2624 == 0 || arg0.anInt2626 == 0) {
			local23 = this.method6970(new int[1], 1, 1, 1);
		} else {
			@Pc(32) int[] local32 = new int[arg0.anInt2624 * arg0.anInt2626];
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			@Pc(41) int local41;
			@Pc(45) int local45;
			if (arg0.aByteArray31 == null) {
				for (local41 = 0; local41 < arg0.anInt2626; local41++) {
					for (local45 = 0; local45 < arg0.anInt2624; local45++) {
						@Pc(103) int local103 = arg0.anIntArray224[arg0.aByteArray32[local34++] & 0xFF];
						local32[local36++] = local103 == 0 ? 0 : local103 | 0xFF000000;
					}
				}
			} else {
				for (local41 = 0; local41 < arg0.anInt2626; local41++) {
					for (local45 = 0; local45 < arg0.anInt2624; local45++) {
						local32[local36++] = arg0.anIntArray224[arg0.aByteArray32[local34] & 0xFF] | arg0.aByteArray31[local34] << 24;
						local34++;
					}
				}
			}
			local23 = this.method6970(local32, arg0.anInt2624, arg0.anInt2624, arg0.anInt2626);
		}
		local23.Q(arg0.anInt2622, arg0.anInt2625, arg0.anInt2623, arg0.anInt2621);
		return local23;
	}

	@OriginalMember(owner = "client!hea", name = "m", descriptor = "(Z)V")
	protected abstract void method6797();

	@OriginalMember(owner = "client!hea", name = "MA", descriptor = "(III[I)V")
	@Override
	public final void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(14) float local14 = this.aClass113_Sub3_16.method6065((float) arg2, (float) arg1, (float) arg0);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (local14 < -0.0078125F || local14 > 0.0078125F) {
			local40 = (int) ((float) this.anInt8427 * this.aClass113_Sub3_16.method6061((float) arg1, (float) arg0, (float) arg2) / local14);
			local58 = (int) ((float) this.anInt8465 * this.aClass113_Sub3_16.method6064((float) arg1, (float) arg2, (float) arg0) / local14);
		} else {
			local58 = this.anInt8443;
			local40 = this.anInt8442;
		}
		arg3[2] = (int) local14;
		arg3[0] = (int) ((float) local40 - this.aFloat186);
		arg3[1] = (int) ((float) local58 - this.aFloat194);
	}

	@OriginalMember(owner = "client!hea", name = "l", descriptor = "(B)V")
	protected abstract void method6798();

	@OriginalMember(owner = "client!hea", name = "m", descriptor = "(B)V")
	protected abstract void method6799();

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "(II)Lclient!vca;")
	protected Class34 method6800(@OriginalArg(1) int arg0) {
		if (arg0 == 6) {
			return new Class34_Sub9(this);
		} else if (arg0 == 1) {
			return new Class34_Sub1(this);
		} else if (arg0 == 2) {
			return new Class34_Sub4(this, this.aClass331_8);
		} else if (arg0 == 7) {
			return new Class34_Sub5(this);
		} else {
			return new Class34_Sub3(this);
		}
	}

	@OriginalMember(owner = "client!hea", name = "n", descriptor = "(B)V")
	protected abstract void method6801();

	@OriginalMember(owner = "client!hea", name = "D", descriptor = "(I)Lclient!gp;")
	public final Interface8 method6802() {
		return this.aClass83_Sub1_3 == null ? null : this.aClass83_Sub1_3.method1737();
	}

	@OriginalMember(owner = "client!hea", name = "E", descriptor = "(I)Lclient!qo;")
	public final Class113_Sub3 method6803() {
		return this.aClass113_Sub3_19;
	}

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method6958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) float local7 = this.method6810();
		this.method6756();
		this.method6738(arg4);
		this.method6742(0, Static308.aClass192_1);
		this.method6816(0, Static308.aClass192_1);
		this.method6746(arg5);
		this.aClass113_Sub3_15.method6054(1.0F, (float) (arg3 - 1), (float) (arg2 - 1));
		this.aClass113_Sub3_15.method6070((float) arg1 - local7, 0.0F, (float) arg0 - local7);
		this.method6773();
		this.method6780(false);
		this.method6814(Static62.aClass185_2, 4);
		this.method6780(true);
		this.method6816(0, Static430.aClass192_2);
		this.method6742(0, Static430.aClass192_2);
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(BZ)Lclient!rn;")
	public abstract Interface20 method6804(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(IZ)Lclient!bca;")
	public abstract Interface4 method6805(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!hea", name = "F", descriptor = "(I)V")
	private void method6806() {
		if (this.aCanvas14 == null) {
			this.anInt8348 = this.anInt8415 = 1;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas14.getSize();
			this.anInt8348 = local18.width;
			this.anInt8415 = local18.height;
		}
		this.anInt8399 = this.anInt8348;
		this.anInt8356 = this.anInt8415;
		this.method6789();
		this.method6768();
		this.method6817();
		this.method6769();
		this.method6854();
		this.method6849();
		this.JA();
	}

	@OriginalMember(owner = "client!hea", name = "o", descriptor = "(B)V")
	protected abstract void method6807();

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!so;)V")
	public final void method6808(@OriginalArg(1) Class309 arg0) {
		this.aClass309Array3[this.anInt8433] = arg0;
		this.method6728();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIZ[IIII)Lclient!oi;")
	public abstract Interface14 method6809(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!hea", name = "G", descriptor = "(I)F")
	protected abstract float method6810();

	@OriginalMember(owner = "client!hea", name = "l", descriptor = "()Lclient!q;")
	@Override
	public final Class113 method6920() {
		return this.aClass113_Sub3_16;
	}

	@OriginalMember(owner = "client!hea", name = "n", descriptor = "(Z)V")
	protected abstract void method6811();

	@OriginalMember(owner = "client!hea", name = "GA", descriptor = "(II)V")
	@Override
	public final void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt8463 == arg0 && arg1 == this.anInt8440) {
			return;
		}
		this.anInt8440 = arg1;
		this.anInt8463 = arg0;
		this.method6768();
		this.method6817();
		this.method6856();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public final Class22 method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(11) Class22_Sub1 local11 = new Class22_Sub1(this, arg2, arg3, arg4);
		local11.da(0, 0, arg2, arg3, arg0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!hea", name = "H", descriptor = "(I)V")
	protected final void method6812() {
		@Pc(9) Enumeration local9 = this.aHashtable7.keys();
		while (local9.hasMoreElements()) {
			@Pc(15) Canvas local15 = (Canvas) local9.nextElement();
			this.method6794(local15, this.aHashtable7.get(local15));
		}
		this.anInterface4_14.method7384();
		this.anInterface4_15.method7384();
		this.aClass63_Sub1_27.method1578();
		this.aClass63_Sub1_22.method1578();
		this.aClass63_Sub1_26.method1578();
		this.aClass63_Sub1_28.method1578();
		this.aClass63_Sub1_30.method1578();
		this.aClass285_3.method6188();
		this.anInterface20_8.method7384();
	}

	@OriginalMember(owner = "client!hea", name = "I", descriptor = "(I)V")
	public final void method6813() {
		if (Static428.aClass309_6 != this.aClass309Array3[this.anInt8433]) {
			this.aClass309Array3[this.anInt8433] = Static428.aClass309_6;
			this.aClass113_Sub3Array3[this.anInt8433].Y();
			this.method6728();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!kda;II)V")
	private void method6814(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1) {
		this.method6829(0, this.anInterface4_14);
		this.method6743(this.aClass284_18);
		this.method6723(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!hea", name = "p", descriptor = "(B)V")
	protected abstract void method6815();

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(ILclient!kj;I)V")
	public final void method6816(@OriginalArg(0) int arg0, @OriginalArg(1) Class192 arg1) {
		this.method6845(arg1, arg0);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public final Class22 method6950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class22_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!hea", name = "J", descriptor = "(I)V")
	private void method6817() {
		this.aBoolean643 = false;
		this.method6823();
		if (this.aClass240_7 == Static386.aClass240_6) {
			this.method6785();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!ig;Lclient!lca;IB)Lclient!oi;")
	public abstract Interface14 method6818(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!hea", name = "K", descriptor = "(I)V")
	private void method6819() {
		if (Static116.aClass240_1 == this.aClass240_7) {
			return;
		}
		@Pc(12) Class240 local12 = this.aClass240_7;
		this.aClass240_7 = Static116.aClass240_1;
		if (!local12.method4883()) {
			this.method6831();
		}
		this.method6833();
		this.aFloatArray48 = this.aFloatArray50;
		this.method6785();
		this.anInt8450 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = (float) arg2 - (float) arg0;
		@Pc(15) float local15 = (float) arg3 - (float) arg1;
		if (local9 == 0.0F && local15 == 0.0F) {
			local9 = 1.0F;
		} else {
			@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local9 * local9 + local15 * local15)));
			local9 *= local36;
			local15 *= local36;
		}
		if (!this.method6730((float) arg2 + local9, 0.0F, (float) arg1, 0.0F, (float) arg3 + local15, (float) arg0)) {
			return;
		}
		this.method6756();
		this.method6738(arg4);
		this.method6742(0, Static308.aClass192_1);
		this.method6816(0, Static308.aClass192_1);
		this.method6746(arg5);
		this.method6839();
		this.method6780(false);
		this.method6822();
		this.method6780(true);
		this.method6816(0, Static430.aClass192_2);
		this.method6742(0, Static430.aClass192_2);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!ig;ZLclient!lca;)Z")
	public abstract boolean method6820(@OriginalArg(0) Class155 arg0, @OriginalArg(2) Class203 arg1);

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIZ[II)Lclient!oi;")
	public final Interface14 method6821(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		return this.method6809(0, arg1, arg2, arg0, arg3, 0);
	}

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "(IIIII)V")
	@Override
	protected final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!hea", name = "q", descriptor = "(B)V")
	private void method6822() {
		this.method6829(0, this.anInterface4_15);
		this.method6743(this.aClass284_16);
		this.method6723(Static288.aClass185_3, 0, 1);
	}

	@OriginalMember(owner = "client!hea", name = "L", descriptor = "(I)V")
	private void method6823() {
		if (this.aBoolean643) {
			return;
		}
		@Pc(17) float[] local17 = this.aFloatArray54;
		@Pc(21) float local21 = (float) this.anInt8463;
		@Pc(25) float local25 = (float) this.anInt8440;
		@Pc(37) float local37 = this.aFloat191 * (float) -this.anInt8443 / (float) this.anInt8465;
		@Pc(49) float local49 = this.aFloat191 * (float) -this.anInt8442 / (float) this.anInt8427;
		@Pc(63) float local63 = (float) (this.anInt8399 - this.anInt8442) * this.aFloat191 / (float) this.anInt8427;
		@Pc(78) float local78 = this.aFloat191 * (float) (this.anInt8356 - this.anInt8443) / (float) this.anInt8465;
		if (local63 == local49 || local78 == local37) {
			local17[7] = 0.0F;
			local17[4] = 0.0F;
			local17[12] = 0.0F;
			local17[11] = 0.0F;
			local17[8] = 0.0F;
			local17[5] = 1.0F;
			local17[10] = 1.0F;
			local17[14] = 0.0F;
			local17[0] = 1.0F;
			local17[13] = 0.0F;
			local17[3] = 0.0F;
			local17[9] = 0.0F;
			local17[1] = 0.0F;
			local17[6] = 0.0F;
			local17[15] = 1.0F;
			local17[2] = 0.0F;
		} else {
			local17[13] = (local37 + local78) / (local78 - local37);
			local17[14] = local21 / (local21 - local25);
			local17[10] = 1.0F / (local21 - local25);
			local17[2] = 0.0F;
			local17[0] = 2.0F / (local63 - local49);
			local17[7] = 0.0F;
			local17[3] = 0.0F;
			local17[11] = 0.0F;
			local17[4] = 0.0F;
			local17[12] = (local63 + local49) / (-local63 + local49);
			local17[6] = 0.0F;
			local17[15] = 1.0F;
			local17[1] = 0.0F;
			local17[8] = 0.0F;
			local17[9] = 0.0F;
			local17[5] = 2.0F / (local78 - local37);
		}
		this.method6778();
		this.aBoolean643 = true;
	}

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(ZI)V")
	public final void method6824(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean636) {
			this.aBoolean636 = arg0;
			this.method6807();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(B[F)[F")
	public final float[] method6825(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloatArray48[0];
		arg0[4] = this.aFloatArray48[1];
		arg0[12] = this.aFloatArray48[3];
		arg0[8] = this.aFloatArray48[2];
		arg0[9] = this.aFloatArray48[6];
		arg0[2] = this.aFloatArray48[8];
		arg0[13] = this.aFloatArray48[7];
		arg0[1] = this.aFloatArray48[4];
		arg0[5] = this.aFloatArray48[5];
		arg0[14] = this.aFloatArray48[11];
		arg0[7] = this.aFloatArray48[13];
		arg0[10] = this.aFloatArray48[10];
		arg0[6] = this.aFloatArray48[9];
		arg0[3] = this.aFloatArray48[12];
		arg0[11] = this.aFloatArray48[14];
		arg0[15] = this.aFloatArray48[15];
		return arg0;
	}

	@OriginalMember(owner = "client!hea", name = "M", descriptor = "(I)V")
	public final void method6826() {
		if (this.anInt8450 == 4) {
			return;
		}
		this.method6832();
		this.method6782(false);
		this.method6735(false);
		this.method6731(false);
		this.method6827(false);
		this.method6857(false, false, -2);
		this.method6746(1);
		this.method6724(0);
		this.anInt8450 = 4;
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(BZ)V")
	public final void method6827(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean639) {
			this.aBoolean639 = arg0;
			this.method6772();
			this.anInt8450 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!hea", name = "g", descriptor = "(II)Lclient!rn;")
	public final Interface20 method6828(@OriginalArg(0) int arg0) {
		if (this.anInterface20_8.method7374() < arg0 * 2) {
			this.anInterface20_8.method7376(arg0);
		}
		return this.anInterface20_8;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILclient!bca;)V")
	public abstract void method6829(@OriginalArg(0) int arg0, @OriginalArg(2) Interface4 arg1);

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!qo;Z)V")
	public final void method6830(@OriginalArg(0) Class113_Sub3 arg0) {
		this.aClass113_Sub3_15.M(arg0);
		this.aBoolean631 = false;
		this.method6834();
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt8420 + this.anInt8425 + this.anInt8423;
	}

	@OriginalMember(owner = "client!hea", name = "o", descriptor = "(Z)V")
	private void method6831() {
		this.aBoolean638 = false;
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7004();
		}
		this.method6815();
	}

	@OriginalMember(owner = "client!hea", name = "p", descriptor = "(Z)V")
	private void method6832() {
		if (Static179.aClass240_10 == this.aClass240_7) {
			return;
		}
		@Pc(6) Class240 local6 = this.aClass240_7;
		this.aClass240_7 = Static179.aClass240_10;
		if (local6.method4883()) {
			this.method6831();
		}
		this.method6740();
		this.aFloatArray48 = this.aFloatArray51;
		this.method6785();
		this.anInt8450 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!hea", name = "r", descriptor = "(B)V")
	private void method6833() {
		if (this.aBoolean633) {
			return;
		}
		@Pc(5) float[] local5 = this.aFloatArray50;
		@Pc(17) float local17 = (float) (-this.anInt8442 * this.anInt8463) / (float) this.anInt8427;
		@Pc(32) float local32 = (float) ((this.anInt8399 - this.anInt8442) * this.anInt8463) / (float) this.anInt8427;
		@Pc(43) float local43 = (float) (this.anInt8463 * this.anInt8443) / (float) this.anInt8465;
		@Pc(57) float local57 = (float) (this.anInt8463 * (this.anInt8443 - this.anInt8356)) / (float) this.anInt8465;
		if (local17 == local32 || local43 == local57) {
			local5[3] = 0.0F;
			local5[2] = 0.0F;
			local5[13] = 0.0F;
			local5[4] = 0.0F;
			local5[12] = 0.0F;
			local5[15] = 1.0F;
			local5[14] = 0.0F;
			local5[10] = 1.0F;
			local5[11] = 0.0F;
			local5[8] = 0.0F;
			local5[1] = 0.0F;
			local5[7] = 0.0F;
			local5[6] = 0.0F;
			local5[0] = 1.0F;
			local5[9] = 0.0F;
			local5[5] = 1.0F;
		} else {
			@Pc(71) float local71 = (float) this.anInt8463 * 2.0F;
			local5[4] = 0.0F;
			local5[5] = local71 / (local43 - local57);
			local5[15] = 0.0F;
			local5[0] = local71 / (local32 - local17);
			local5[3] = 0.0F;
			local5[7] = 0.0F;
			local5[9] = (local43 + local57) / (local43 - local57);
			local5[13] = 0.0F;
			local5[1] = 0.0F;
			local5[2] = 0.0F;
			local5[11] = -1.0F;
			local5[8] = (local17 + local32) / (-local17 + local32);
			local5[14] = this.aFloat192 = (float) (this.anInt8463 * this.anInt8440) / (float) (this.anInt8463 - this.anInt8440);
			local5[10] = this.aFloat199 = (float) this.anInt8440 / (float) (this.anInt8463 - this.anInt8440);
			local5[12] = 0.0F;
			local5[6] = 0.0F;
		}
		this.method6737();
		this.aBoolean633 = true;
	}

	@OriginalMember(owner = "client!hea", name = "N", descriptor = "(I)V")
	private void method6834() {
		if (Static179.aClass240_10 == this.aClass240_7) {
			@Pc(13) float local13 = this.method6810();
			this.aClass113_Sub3_15.method6070(local13, 0.0F, local13);
		}
		this.aBoolean638 = false;
		this.method6779();
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7008();
		}
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)V")
	@Override
	public final void method6943(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZIIZBI)V")
	private void method6835(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) boolean local4 = arg0 & this.method6968();
		if (!local4 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			arg2 = 2;
			arg1 = 1;
			arg4 = 0;
		}
		if (arg2 != 0 && arg3) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt8462 != arg2) {
			if (this.anInt8462 != 0) {
				this.aClass34Array3[Integer.MAX_VALUE & this.anInt8462].method7006();
			}
			if (arg2 == 0) {
				this.aClass34_3 = null;
			} else {
				this.aClass34_3 = this.aClass34Array3[arg2 & Integer.MAX_VALUE];
				this.aClass34_3.method7009(arg3);
				this.aClass34_3.method7016(arg3);
				this.aClass34_3.method7020(arg1, arg4);
			}
			this.anInt8439 = arg1;
			this.anInt8462 = arg2;
			this.anInt8448 = arg4;
		} else if (this.anInt8462 != 0) {
			this.aClass34Array3[this.anInt8462 & Integer.MAX_VALUE].method7016(arg3);
			if (this.anInt8448 != arg4 || this.anInt8439 != arg1) {
				this.aClass34Array3[this.anInt8462 & Integer.MAX_VALUE].method7020(arg1, arg4);
				this.anInt8448 = arg4;
				this.anInt8439 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!qs;)V")
	public abstract void method6836(@OriginalArg(1) Class278 arg0);

	@OriginalMember(owner = "client!hea", name = "O", descriptor = "(I)I")
	public final int method6837() {
		return this.anInt8454;
	}

	@OriginalMember(owner = "client!hea", name = "oa", descriptor = "([I)V")
	@Override
	public final void oa(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt8432;
		arg0[3] = this.anInt8461;
		arg0[0] = this.anInt8434;
		arg0[1] = this.anInt8447;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6901(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas15 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.method6794(arg0, this.aHashtable7.get(arg0));
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!hea", name = "P", descriptor = "(I)V")
	public final void method6839() {
		this.aClass113_Sub3_15.Y();
		this.aBoolean631 = true;
		this.method6834();
	}

	@OriginalMember(owner = "client!hea", name = "s", descriptor = "(B)V")
	protected abstract void method6840();

	@OriginalMember(owner = "client!hea", name = "t", descriptor = "(B)V")
	protected abstract void method6841();

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public final void method6916(@OriginalArg(0) Class1_Sub5 arg0) {
		this.aNativeHeap6 = ((Class1_Sub5_Sub1) arg0).aNativeHeap1;
		this.aNativeHeapBuffer7 = this.aNativeHeap6.a(32768, false);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I[BIIILclient!lca;)Lclient!jb;")
	public abstract Interface11 method6842(@OriginalArg(1) byte[] arg0, @OriginalArg(5) Class203 arg1);

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(BZ)V")
	public final void method6843(@OriginalArg(0) byte arg0) {
		this.method6738(arg0 << 24 | arg0 << 16 | arg0 << 8 | arg0);
	}

	@OriginalMember(owner = "client!hea", name = "Q", descriptor = "(I)V")
	protected abstract void method6844();

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!kj;IIZ)V")
	protected abstract void method6845(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;)Lclient!jaclib/memory/Stream;")
	public final Stream method6846(@OriginalArg(1) Buffer arg0) {
		this.aStream7.a(arg0);
		return this.aStream7;
	}

	@OriginalMember(owner = "client!hea", name = "J", descriptor = "(IIIIII)V")
	@Override
	public final void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6756();
		this.method6738(arg4);
		this.method6742(0, Static308.aClass192_1);
		this.method6816(0, Static308.aClass192_1);
		this.method6746(arg5);
		this.aClass113_Sub3_15.method6054(1.0F, (float) arg3, (float) arg2);
		this.aClass113_Sub3_15.U(arg0, arg1, 0);
		this.method6773();
		this.method6780(false);
		this.method6727();
		this.method6780(true);
		this.method6816(0, Static430.aClass192_2);
		this.method6742(0, Static430.aClass192_2);
	}

	@OriginalMember(owner = "client!hea", name = "R", descriptor = "(I)Lclient!qo;")
	public final Class113_Sub3 method6847() {
		return this.aClass113_Sub3_18;
	}

	@OriginalMember(owner = "client!hea", name = "S", descriptor = "(I)V")
	protected abstract void method6848();

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(I)V")
	@Override
	public final void method6961(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!hea", name = "T", descriptor = "(I)V")
	public final void method6849() {
		if (this.aClass240_7 == Static498.aClass240_8) {
			return;
		}
		@Pc(6) Class240 local6 = this.aClass240_7;
		this.aClass240_7 = Static498.aClass240_8;
		if (local6.method4883()) {
			this.method6831();
		}
		this.anInt8450 &= 0xFFFFFFE0;
		this.aFloatArray48 = this.aFloatArray53;
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(Z)V")
	@Override
	public final void method6942(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!lm;IIII)Lclient!da;")
	@Override
	public final Class63 method6910(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class63_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6937(@OriginalArg(0) Canvas arg0) {
		this.anObject20 = null;
		this.aCanvas14 = null;
		if (arg0 == null || arg0 == this.aCanvas15) {
			this.aCanvas14 = this.aCanvas15;
			this.anObject20 = this.anObject21;
		} else if (this.aHashtable7.containsKey(arg0)) {
			this.anObject20 = this.aHashtable7.get(arg0);
			this.aCanvas14 = arg0;
		}
		if (this.aCanvas14 == null || this.anObject20 == null) {
			throw new RuntimeException();
		}
		this.method6750(this.aCanvas14, this.anObject20);
		this.method6806();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public final Class47 method6902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class47_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!vi;I)V")
	@Override
	public final void method6947(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) {
		this.aClass285_3.method6185(arg1, arg0, this);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public final void method6921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class204 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "([I)V")
	@Override
	public final void method6922(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8399;
		arg0[1] = this.anInt8356;
	}

	@OriginalMember(owner = "client!hea", name = "U", descriptor = "(I)V")
	private void method6850() {
		if (Static386.aClass240_6 == this.aClass240_7) {
			return;
		}
		@Pc(16) Class240 local16 = this.aClass240_7;
		this.aClass240_7 = Static386.aClass240_6;
		if (!local16.method4883()) {
			this.method6831();
		}
		this.method6823();
		this.aFloatArray48 = this.aFloatArray54;
		this.method6785();
		this.anInt8450 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!hea", name = "V", descriptor = "(I)V")
	private void method6851() {
		this.anInterface4_14 = this.method6805(false);
		this.anInterface4_14.method2468(140, 28);
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			@Pc(28) Buffer local28 = this.anInterface4_14.method2465();
			if (local28 != null) {
				@Pc(35) Stream local35 = this.method6846(local28);
				if (Stream.c()) {
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
				} else {
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
				}
				local35.a();
				if (this.anInterface4_14.method2466()) {
					break;
				}
			}
		}
		this.aClass284_18 = this.method6855(new Class7[] { new Class7(new Class198[] { Static282.aClass198_1, Static282.aClass198_5, Static282.aClass198_5 }) });
	}

	@OriginalMember(owner = "client!hea", name = "h", descriptor = "(II)V")
	public abstract void method6852(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hea", name = "u", descriptor = "(B)V")
	public final void method6853() {
		if (this.anInt8450 == 2) {
			return;
		}
		this.method6832();
		this.method6782(false);
		this.method6735(false);
		this.method6731(false);
		this.method6827(false);
		this.method6857(false, false, -2);
		this.anInt8450 = 2;
	}

	@OriginalMember(owner = "client!hea", name = "v", descriptor = "(B)V")
	private void method6854() {
		this.aFloat194 = this.anInt8447 - this.anInt8443;
		this.aFloat188 = this.anInt8432 - this.anInt8442;
		this.aFloat193 = this.anInt8461 - this.anInt8443;
		this.aFloat186 = this.anInt8434 - this.anInt8442;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I[Lclient!af;)Lclient!rd;")
	public abstract Class284 method6855(@OriginalArg(1) Class7[] arg0);

	@OriginalMember(owner = "client!hea", name = "m", descriptor = "(IIIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6959(arg0, arg1, arg0, arg2 + arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!hea", name = "pa", descriptor = "(III)V")
	@Override
	public final void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8460 == arg0 && arg1 == this.anInt8430 && arg2 == this.anInt8437) {
			return;
		}
		this.anInt8437 = arg2;
		this.anInt8430 = arg1;
		this.anInt8460 = arg0;
		this.method6856();
		this.method6792();
	}

	@OriginalMember(owner = "client!hea", name = "XA", descriptor = "(IIIII)V")
	@Override
	public final void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6959(arg0, arg1, arg2 + arg0, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!hea", name = "w", descriptor = "(B)V")
	private void method6856() {
		if (this.aClass34_3 != null) {
			this.aClass34_3.method7019();
		}
		this.method6763();
	}

	@OriginalMember(owner = "client!hea", name = "v", descriptor = "()[I")
	@Override
	public final int[] v() {
		return new int[] { this.anInt8442, this.anInt8443, this.anInt8427, this.anInt8465 };
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZZIZ)V")
	public final void method6857(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 != this.anInt8452 || this.aBoolean635 != this.aBoolean641) {
			@Pc(16) Interface14 local16 = null;
			@Pc(18) int local18 = 0;
			@Pc(20) byte local20 = 0;
			@Pc(22) int local22 = 0;
			@Pc(29) int local29 = this.aBoolean635 ? 3 : 0;
			if (arg2 < 0) {
				this.method6813();
			} else {
				local16 = this.aClass42_3.method754(arg2);
				@Pc(51) Class3 local51 = super.anInterface7_10.method3874(arg2);
				if (local51.aByte6 == 0 && local51.aByte3 == 0) {
					this.method6813();
				} else {
					@Pc(70) int local70 = local51.aBoolean13 ? 64 : 128;
					@Pc(74) int local74 = local70 * 50;
					@Pc(78) Class113_Sub3 local78 = this.method6748();
					local78.method6075(0.0F, (float) (this.anInt8444 % local74 * local51.aByte6) / (float) local74, (float) (local51.aByte3 * (this.anInt8444 % local74)) / (float) local74);
					this.method6808(Static117.aClass309_2);
				}
				if (!this.aBoolean635) {
					local29 = local51.aByte7;
					local22 = local51.anInt55;
					local20 = local51.aByte1;
				}
				local18 = local51.anInt54;
			}
			this.method6835(arg1, local22, local29, arg0, local20);
			if (this.aClass34_3 == null) {
				this.method6766(local16);
				this.method6724(local18);
			} else {
				this.aClass34_3.method7011(local16, local18);
			}
			this.anInt8452 = arg2;
			this.aBoolean641 = this.aBoolean635;
		}
		this.anInt8450 &= 0xFFFFFFF8;
	}
}
