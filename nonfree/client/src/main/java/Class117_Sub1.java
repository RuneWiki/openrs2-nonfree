import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeHeap;
import jaggl.memory.NativeStream;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class117_Sub1 extends Class117 {

	@OriginalMember(owner = "client!ih", name = "Mb", descriptor = "I")
	private int anInt2973;

	@OriginalMember(owner = "client!ih", name = "Ub", descriptor = "I")
	private int anInt2981;

	@OriginalMember(owner = "client!ih", name = "od", descriptor = "I")
	public int anInt3049;

	@OriginalMember(owner = "client!ih", name = "sd", descriptor = "I")
	public int anInt3052;

	@OriginalMember(owner = "client!ih", name = "te", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!ih", name = "ue", descriptor = "I")
	public int anInt3092;

	@OriginalMember(owner = "client!ih", name = "ye", descriptor = "Lclient!ub;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!ih", name = "De", descriptor = "Lclient!ub;")
	private Interface11 anInterface11_2;

	@OriginalMember(owner = "client!ih", name = "He", descriptor = "I")
	public int anInt3097;

	@OriginalMember(owner = "client!ih", name = "Ie", descriptor = "I")
	public int anInt3098;

	@OriginalMember(owner = "client!ih", name = "Je", descriptor = "I")
	private int anInt3099;

	@OriginalMember(owner = "client!ih", name = "Qe", descriptor = "Lclient!rr;")
	public Class8_Sub2 aClass8_Sub2_1;

	@OriginalMember(owner = "client!ih", name = "Te", descriptor = "Z")
	private boolean aBoolean289;

	@OriginalMember(owner = "client!ih", name = "Ve", descriptor = "Z")
	public boolean aBoolean291;

	@OriginalMember(owner = "client!ih", name = "Ye", descriptor = "I")
	private int anInt3102;

	@OriginalMember(owner = "client!ih", name = "Ze", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!ih", name = "af", descriptor = "I")
	private int anInt3103;

	@OriginalMember(owner = "client!ih", name = "bf", descriptor = "Z")
	public boolean bf;

	@OriginalMember(owner = "client!ih", name = "cf", descriptor = "Lclient!tg;")
	private Interface9 anInterface9_3;

	@OriginalMember(owner = "client!ih", name = "ef", descriptor = "I")
	public int anInt3105;

	@OriginalMember(owner = "client!ih", name = "gf", descriptor = "Z")
	public boolean aBoolean292;

	@OriginalMember(owner = "client!ih", name = "hf", descriptor = "Lclient!ff;")
	public Class80 aClass80_4;

	@OriginalMember(owner = "client!ih", name = "kf", descriptor = "I")
	public int anInt3107;

	@OriginalMember(owner = "client!ih", name = "mf", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!ih", name = "nf", descriptor = "I")
	private int anInt3109;

	@OriginalMember(owner = "client!ih", name = "of", descriptor = "I")
	private int anInt3110;

	@OriginalMember(owner = "client!ih", name = "qf", descriptor = "Lclient!hf;")
	public Class34_Sub2 aClass34_Sub2_3;

	@OriginalMember(owner = "client!ih", name = "sf", descriptor = "Lclient!rr;")
	public Class8_Sub2 aClass8_Sub2_2;

	@OriginalMember(owner = "client!ih", name = "tf", descriptor = "Z")
	public boolean aBoolean294;

	@OriginalMember(owner = "client!ih", name = "uf", descriptor = "Lclient!ik;")
	private Interface3 anInterface3_3;

	@OriginalMember(owner = "client!ih", name = "vf", descriptor = "Z")
	private boolean aBoolean295;

	@OriginalMember(owner = "client!ih", name = "wf", descriptor = "Z")
	public boolean aBoolean296;

	@OriginalMember(owner = "client!ih", name = "xf", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!ih", name = "yf", descriptor = "Z")
	private boolean aBoolean297;

	@OriginalMember(owner = "client!ih", name = "Af", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!ih", name = "Cf", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!ih", name = "Df", descriptor = "Lclient!tg;")
	private Interface9 anInterface9_4;

	@OriginalMember(owner = "client!ih", name = "Hf", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!ih", name = "Kf", descriptor = "Z")
	private boolean aBoolean298;

	@OriginalMember(owner = "client!ih", name = "Lf", descriptor = "Lclient!gb;")
	public Class90 aClass90_4;

	@OriginalMember(owner = "client!ih", name = "Nf", descriptor = "Z")
	private boolean aBoolean299;

	@OriginalMember(owner = "client!ih", name = "Of", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!ih", name = "Pf", descriptor = "Z")
	public boolean aBoolean300;

	@OriginalMember(owner = "client!ih", name = "Qf", descriptor = "Lclient!ff;")
	public Class80 aClass80_5;

	@OriginalMember(owner = "client!ih", name = "Rf", descriptor = "Z")
	private boolean aBoolean301;

	@OriginalMember(owner = "client!ih", name = "Tf", descriptor = "Z")
	private boolean aBoolean302;

	@OriginalMember(owner = "client!ih", name = "Uf", descriptor = "Lclient!hf;")
	public Class34_Sub2 aClass34_Sub2_4;

	@OriginalMember(owner = "client!ih", name = "Vf", descriptor = "Lclient!dp;")
	private Class59_Sub1 aClass59_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "Yf", descriptor = "I")
	private int anInt3115;

	@OriginalMember(owner = "client!ih", name = "bg", descriptor = "Lclient!rr;")
	public Class8_Sub2 aClass8_Sub2_3;

	@OriginalMember(owner = "client!ih", name = "cg", descriptor = "I")
	public int anInt3117;

	@OriginalMember(owner = "client!ih", name = "dg", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!ih", name = "fg", descriptor = "Z")
	private boolean aBoolean304;

	@OriginalMember(owner = "client!ih", name = "ig", descriptor = "[Lclient!sv;")
	private Class23[] aClass23Array1;

	@OriginalMember(owner = "client!ih", name = "jg", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!ih", name = "kg", descriptor = "Lclient!rr;")
	public Class8_Sub2 aClass8_Sub2_4;

	@OriginalMember(owner = "client!ih", name = "mg", descriptor = "Z")
	public boolean aBoolean305;

	@OriginalMember(owner = "client!ih", name = "ng", descriptor = "I")
	public int anInt3122;

	@OriginalMember(owner = "client!ih", name = "qg", descriptor = "I")
	private int anInt3124;

	@OriginalMember(owner = "client!ih", name = "rg", descriptor = "I")
	private int anInt3125;

	@OriginalMember(owner = "client!ih", name = "ug", descriptor = "Lclient!gu;")
	public Class23_Sub3 aClass23_Sub3_3;

	@OriginalMember(owner = "client!ih", name = "vg", descriptor = "F")
	private float aFloat46;

	@OriginalMember(owner = "client!ih", name = "wg", descriptor = "Lclient!rr;")
	public Class8_Sub2 aClass8_Sub2_5;

	@OriginalMember(owner = "client!ih", name = "Ag", descriptor = "Lclient!rr;")
	public Class8_Sub2 aClass8_Sub2_6;

	@OriginalMember(owner = "client!ih", name = "Dg", descriptor = "Lclient!rr;")
	public Class8_Sub2 aClass8_Sub2_7;

	@OriginalMember(owner = "client!ih", name = "Eg", descriptor = "Z")
	private boolean aBoolean308;

	@OriginalMember(owner = "client!ih", name = "Fg", descriptor = "I")
	private int anInt3129;

	@OriginalMember(owner = "client!ih", name = "Hg", descriptor = "I")
	private int anInt3130;

	@OriginalMember(owner = "client!ih", name = "Ig", descriptor = "Lclient!wh;")
	private Class23_Sub3_Sub1 aClass23_Sub3_Sub1_2;

	@OriginalMember(owner = "client!ih", name = "Jg", descriptor = "Lclient!rr;")
	public Class8_Sub2 aClass8_Sub2_8;

	@OriginalMember(owner = "client!ih", name = "Ng", descriptor = "I")
	private int anInt3132;

	@OriginalMember(owner = "client!ih", name = "Og", descriptor = "Z")
	public boolean aBoolean312;

	@OriginalMember(owner = "client!ih", name = "Qg", descriptor = "Z")
	public boolean aBoolean313;

	@OriginalMember(owner = "client!ih", name = "Rg", descriptor = "Z")
	private boolean aBoolean314;

	@OriginalMember(owner = "client!ih", name = "Vg", descriptor = "F")
	private float aFloat48;

	@OriginalMember(owner = "client!ih", name = "Wg", descriptor = "F")
	private float aFloat49;

	@OriginalMember(owner = "client!ih", name = "Yg", descriptor = "I")
	private int anInt3136;

	@OriginalMember(owner = "client!ih", name = "Zg", descriptor = "Lclient!rr;")
	public Class8_Sub2 aClass8_Sub2_9;

	@OriginalMember(owner = "client!ih", name = "bh", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!ih", name = "eh", descriptor = "Lclient!rr;")
	public Class8_Sub2 aClass8_Sub2_10;

	@OriginalMember(owner = "client!ih", name = "gh", descriptor = "I")
	private int anInt3137;

	@OriginalMember(owner = "client!ih", name = "hh", descriptor = "I")
	private int anInt3138;

	@OriginalMember(owner = "client!ih", name = "db", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!ih", name = "ce", descriptor = "I")
	public int anInt3085 = 128;

	@OriginalMember(owner = "client!ih", name = "ie", descriptor = "Lclient!lo;")
	private final Class150 aClass150_1 = new Class150();

	@OriginalMember(owner = "client!ih", name = "ne", descriptor = "Lclient!hf;")
	private final Class34_Sub2 aClass34_Sub2_1 = new Class34_Sub2();

	@OriginalMember(owner = "client!ih", name = "oe", descriptor = "Lclient!hf;")
	public final Class34_Sub2 aClass34_Sub2_2 = new Class34_Sub2();

	@OriginalMember(owner = "client!ih", name = "se", descriptor = "I")
	public int anInt3091 = 3;

	@OriginalMember(owner = "client!ih", name = "xe", descriptor = "Z")
	private boolean aBoolean287 = false;

	@OriginalMember(owner = "client!ih", name = "ve", descriptor = "I")
	public int anInt3093 = 8;

	@OriginalMember(owner = "client!ih", name = "re", descriptor = "Lclient!am;")
	private final Class14 aClass14_13 = new Class14();

	@OriginalMember(owner = "client!ih", name = "Be", descriptor = "I")
	private int anInt3095 = -1;

	@OriginalMember(owner = "client!ih", name = "ze", descriptor = "I")
	private int anInt3094 = -1;

	@OriginalMember(owner = "client!ih", name = "Ee", descriptor = "[Lclient!ub;")
	private final Interface11[] anInterface11Array2 = new Interface11[4];

	@OriginalMember(owner = "client!ih", name = "Ce", descriptor = "I")
	private int anInt3096 = -1;

	@OriginalMember(owner = "client!ih", name = "Ae", descriptor = "[Lclient!ub;")
	private final Interface11[] anInterface11Array1 = new Interface11[4];

	@OriginalMember(owner = "client!ih", name = "Fe", descriptor = "[Lclient!ub;")
	private final Interface11[] anInterface11Array3 = new Interface11[4];

	@OriginalMember(owner = "client!ih", name = "Ge", descriptor = "Lclient!am;")
	private final Class14 aClass14_14;

	@OriginalMember(owner = "client!ih", name = "Ke", descriptor = "Lclient!am;")
	private final Class14 aClass14_15;

	@OriginalMember(owner = "client!ih", name = "Le", descriptor = "Lclient!am;")
	private final Class14 aClass14_16;

	@OriginalMember(owner = "client!ih", name = "Me", descriptor = "Lclient!am;")
	private final Class14 aClass14_17;

	@OriginalMember(owner = "client!ih", name = "Ne", descriptor = "Lclient!am;")
	private final Class14 aClass14_18;

	@OriginalMember(owner = "client!ih", name = "Oe", descriptor = "Lclient!am;")
	private final Class14 aClass14_19;

	@OriginalMember(owner = "client!ih", name = "Pe", descriptor = "Lclient!am;")
	private final Class14 aClass14_20;

	@OriginalMember(owner = "client!ih", name = "df", descriptor = "I")
	private int anInt3104;

	@OriginalMember(owner = "client!ih", name = "zf", descriptor = "I")
	public int anInt3112;

	@OriginalMember(owner = "client!ih", name = "Bf", descriptor = "[F")
	private final float[] aFloatArray11;

	@OriginalMember(owner = "client!ih", name = "pf", descriptor = "I")
	public int anInt3111;

	@OriginalMember(owner = "client!ih", name = "Ff", descriptor = "[Lclient!ls;")
	private final Class1_Sub29[] aClass1_Sub29Array1;

	@OriginalMember(owner = "client!ih", name = "jf", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!ih", name = "Gf", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!ih", name = "ag", descriptor = "I")
	public int anInt3116;

	@OriginalMember(owner = "client!ih", name = "ff", descriptor = "I")
	private int anInt3106;

	@OriginalMember(owner = "client!ih", name = "Sf", descriptor = "I")
	private int anInt3114;

	@OriginalMember(owner = "client!ih", name = "Wf", descriptor = "F")
	private float aFloat40;

	@OriginalMember(owner = "client!ih", name = "lg", descriptor = "I")
	private int anInt3121;

	@OriginalMember(owner = "client!ih", name = "eg", descriptor = "I")
	public int anInt3118;

	@OriginalMember(owner = "client!ih", name = "Mf", descriptor = "I")
	public int anInt3113;

	@OriginalMember(owner = "client!ih", name = "og", descriptor = "I")
	public int anInt3123;

	@OriginalMember(owner = "client!ih", name = "Xe", descriptor = "I")
	private int anInt3101;

	@OriginalMember(owner = "client!ih", name = "gg", descriptor = "I")
	private int anInt3119;

	@OriginalMember(owner = "client!ih", name = "lf", descriptor = "I")
	public int anInt3108;

	@OriginalMember(owner = "client!ih", name = "hg", descriptor = "I")
	public int anInt3120;

	@OriginalMember(owner = "client!ih", name = "xg", descriptor = "I")
	private int anInt3126;

	@OriginalMember(owner = "client!ih", name = "If", descriptor = "F")
	private float aFloat38;

	@OriginalMember(owner = "client!ih", name = "zg", descriptor = "I")
	public int anInt3127;

	@OriginalMember(owner = "client!ih", name = "tg", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!ih", name = "Mg", descriptor = "I")
	public int anInt3131;

	@OriginalMember(owner = "client!ih", name = "Bg", descriptor = "I")
	private int anInt3128;

	@OriginalMember(owner = "client!ih", name = "Re", descriptor = "I")
	private int anInt3100;

	@OriginalMember(owner = "client!ih", name = "Tg", descriptor = "[F")
	private final float[] aFloatArray14;

	@OriginalMember(owner = "client!ih", name = "Pg", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!ih", name = "yg", descriptor = "[F")
	private final float[] aFloatArray13;

	@OriginalMember(owner = "client!ih", name = "Zf", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!ih", name = "We", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!ih", name = "Ef", descriptor = "[F")
	public final float[] aFloatArray12;

	@OriginalMember(owner = "client!ih", name = "ah", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!ih", name = "Xg", descriptor = "I")
	public int anInt3135;

	@OriginalMember(owner = "client!ih", name = "Jf", descriptor = "F")
	private float aFloat39;

	@OriginalMember(owner = "client!ih", name = "sg", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!ih", name = "pg", descriptor = "Z")
	private boolean aBoolean306;

	@OriginalMember(owner = "client!ih", name = "Sg", descriptor = "I")
	private int anInt3133;

	@OriginalMember(owner = "client!ih", name = "ch", descriptor = "[F")
	private final float[] aFloatArray15;

	@OriginalMember(owner = "client!ih", name = "dh", descriptor = "Lclient!hi;")
	public Class1_Sub19_Sub1 aClass1_Sub19_Sub1_2;

	@OriginalMember(owner = "client!ih", name = "fh", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!ih", name = "jh", descriptor = "[B")
	public final byte[] aByteArray33;

	@OriginalMember(owner = "client!ih", name = "ih", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!ih", name = "kh", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!ih", name = "Zd", descriptor = "I")
	public final int anInt3083;

	@OriginalMember(owner = "client!ih", name = "qd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas5;

	@OriginalMember(owner = "client!ih", name = "Lc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!ih", name = "fd", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ih", name = "ab", descriptor = "J")
	private final long aLong105;

	@OriginalMember(owner = "client!ih", name = "Gd", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!ih", name = "Ug", descriptor = "I")
	public final int anInt3134;

	@OriginalMember(owner = "client!ih", name = "Se", descriptor = "Z")
	public boolean aBoolean288;

	@OriginalMember(owner = "client!ih", name = "Xf", descriptor = "Z")
	public boolean aBoolean303;

	@OriginalMember(owner = "client!ih", name = "Ue", descriptor = "Z")
	private boolean aBoolean290;

	@OriginalMember(owner = "client!ih", name = "Gg", descriptor = "Z")
	public boolean aBoolean309;

	@OriginalMember(owner = "client!ih", name = "Lg", descriptor = "Z")
	private boolean aBoolean311;

	@OriginalMember(owner = "client!ih", name = "rf", descriptor = "Z")
	public boolean aBoolean293;

	@OriginalMember(owner = "client!ih", name = "Kg", descriptor = "Z")
	public boolean aBoolean310;

	@OriginalMember(owner = "client!ih", name = "Cg", descriptor = "Z")
	private final boolean aBoolean307;

	@OriginalMember(owner = "client!ih", name = "Yd", descriptor = "Lclient!kj;")
	public final Class141 aClass141_1;

	@OriginalMember(owner = "client!ih", name = "we", descriptor = "Lclient!gp;")
	public final Class98 aClass98_1;

	@OriginalMember(owner = "client!ih", name = "ke", descriptor = "Lclient!aa;")
	private final Class2 aClass2_1;

	@OriginalMember(owner = "client!ih", name = "fe", descriptor = "Lclient!jc;")
	private Class1_Sub23_Sub1 aClass1_Sub23_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "de", descriptor = "Lclient!rh;")
	private final Class220 aClass220_1;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;ILclient!nt;)V")
	public Class117_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class177 arg4) {
		super(arg0, arg2);
		new Class163();
		new Class208(16);
		this.aClass14_14 = new Class14();
		this.aClass14_15 = new Class14();
		this.aClass14_16 = new Class14();
		this.aClass14_17 = new Class14();
		this.aClass14_18 = new Class14();
		this.aClass14_19 = new Class14();
		this.aClass14_20 = new Class14();
		this.anInt3104 = 0;
		this.anInt3112 = -1;
		this.aFloatArray11 = new float[16];
		this.anInt3111 = 0;
		this.aClass1_Sub29Array1 = new Class1_Sub29[Static92.anInt4212];
		this.aFloat32 = 3584.0F;
		this.aFloat36 = 3584.0F;
		this.anInt3116 = 0;
		this.anInt3106 = -1;
		this.anInt3114 = 8448;
		this.aFloat40 = 1.0F;
		this.anInt3121 = 8448;
		this.anInt3118 = 512;
		this.anInt3113 = 0;
		this.anInt3123 = 512;
		this.anInt3101 = 0;
		this.anInt3119 = 0;
		this.anInt3108 = 3584;
		this.anInt3120 = -1;
		this.anInt3126 = 0;
		this.aFloat38 = 1.0F;
		this.anInt3127 = 0;
		this.aFloat45 = 1.0F;
		this.anInt3131 = 50;
		this.anInt3128 = 0;
		this.anInt3100 = -1;
		this.aFloatArray14 = new float[4];
		this.aFloat47 = 1.0F;
		this.aFloatArray13 = new float[4];
		this.aFloat41 = 3000.0F;
		this.aFloat30 = 1.0F;
		this.aFloatArray12 = new float[4];
		this.aFloat50 = -1.0F;
		this.anInt3135 = -1;
		this.aFloat39 = 0.0F;
		this.aFloat44 = -1.0F;
		this.aBoolean306 = true;
		this.anInt3133 = 0;
		this.aFloatArray15 = new float[4];
		this.aClass1_Sub19_Sub1_2 = new Class1_Sub19_Sub1(8192);
		this.anIntArray230 = new int[1];
		this.aByteArray33 = new byte[16384];
		this.anIntArray231 = new int[1];
		this.anIntArray232 = new int[1];
		this.anInt3083 = arg3;
		this.aCanvas4 = this.aCanvas5 = arg1;
		try {
			if (Static30.aBoolean70 == null || !Static30.aBoolean70) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static30.aBoolean70 = Boolean.TRUE;
				} else {
					@Pc(268) String local268 = System.getProperty("os.name").toLowerCase();
					if (!local268.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local268.startsWith("linux") || local268.startsWith("sunos")) {
						System.load(arg4.method3854("libjaggl.so").toString());
					} else if (local268.startsWith("mac")) {
						System.load(arg4.method3854("libjaggl.jnilib").toString());
					} else if (local268.startsWith("win")) {
						System.load(arg4.method3854("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static30.aBoolean70 = Boolean.TRUE;
				}
			}
			if (Static30.aBoolean70 == null || !Static30.aBoolean70) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong106 = this.aLong105 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt3083);
			if (this.aLong105 == 0L) {
				throw new RuntimeException("");
			}
			this.method2525();
			@Pc(377) int local377 = this.method2523();
			if (local377 != 0) {
				throw new RuntimeException("");
			}
			this.anInt3134 = this.aBoolean291 ? 33639 : 5121;
			@Pc(401) int local401;
			if (this.aString29.indexOf("radeon") != -1) {
				local401 = 0;
				@Pc(403) boolean local403 = false;
				@Pc(405) boolean local405 = false;
				@Pc(414) String[] local414 = Static354.method4612(' ', this.aString29.replace('/', ' '));
				for (@Pc(416) int local416 = 0; local416 < local414.length; local416++) {
					@Pc(422) String local422 = local414[local416];
					try {
						if (local422.length() > 0) {
							if (local422.charAt(0) == 'x' && local422.length() >= 3 && Static279.method3754(local422.substring(1, 3))) {
								local422 = local422.substring(1);
								local405 = true;
							}
							if (local422.equals("hd")) {
								local403 = true;
							} else {
								if (local422.startsWith("hd")) {
									local422 = local422.substring(2);
									local403 = true;
								}
								if (local422.length() >= 4 && Static279.method3754(local422.substring(0, 4))) {
									local401 = Static252.method3564(local422.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(490) Exception local490) {
					}
				}
				if (!local403 || local401 < 4000) {
					this.aBoolean288 = false;
				}
				if (!local405 && !local403) {
					if (local401 >= 7000 && local401 <= 9250) {
						this.aBoolean303 = false;
					}
					if (local401 >= 7000 && local401 <= 7999) {
						this.aBoolean290 = false;
					}
				}
				this.aBoolean309 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean311 = this.aBoolean290;
				this.aBoolean293 = true;
			}
			if (this.aString30.indexOf("intel") != -1) {
				this.aBoolean310 = false;
			}
			this.aBoolean307 = !this.aString30.equals("s3 graphics");
			if (this.aBoolean290) {
				try {
					@Pc(571) int[] local571 = new int[1];
					OpenGL.glGenBuffersARB(1, local571, 0);
				} catch (@Pc(577) Throwable local577) {
					throw new RuntimeException("");
				}
			}
			Static171.method2270(true, false);
			this.aBoolean287 = true;
			this.aClass141_1 = new Class141(this, super.anInterface4_10);
			this.method2520();
			this.aClass98_1 = new Class98(this);
			this.aClass2_1 = new Class2(this);
			if (this.aClass2_1.method18()) {
				this.aClass1_Sub23_Sub1_1 = new Class1_Sub23_Sub1(this);
				if (!this.aClass1_Sub23_Sub1_1.method2732()) {
					this.aClass1_Sub23_Sub1_1.method2729();
					this.aClass1_Sub23_Sub1_1 = null;
				}
			}
			this.aClass220_1 = new Class220(this);
			this.method2477();
			this.method2499();
			OpenGL.glClear(16640);
			local401 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(656) Exception local656) {
					if (local401++ > 5) {
						throw new RuntimeException("");
					}
					Static331.method4343(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(674) Throwable local674) {
			local674.printStackTrace();
			this.method5663();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "()Z")
	@Override
	public boolean method5655() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIII)V")
	public void method2452(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)V")
	public synchronized void method2453(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub18 local8 = new Class1_Sub18(arg0);
		this.aClass14_17.method205(local8);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!e;Lclient!sj;Lclient!c;Lclient!wp;I)V")
	@Override
	public void method5659(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class111_Sub8 arg3) {
		arg0.method5987(arg2, arg3, 0);
		this.method5699(arg1);
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "()V")
	@Override
	public void method5672() {
		if (!this.aBoolean307 || this.anInt3049 <= 0 || this.anInt3052 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt3126;
		@Pc(25) int local25 = this.anInt3128;
		@Pc(28) int local28 = this.anInt3133;
		@Pc(31) int local31 = this.anInt3104;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method2481();
		this.method2513(false);
		this.method2498(false);
		this.method2462(false);
		this.method2469(false);
		this.method2504(null);
		this.method2531(-2);
		this.method2535(1);
		this.method2503(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt3049, this.anInt3052, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ba(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!ih", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass34_Sub2_3.aFloat26 + this.aClass34_Sub2_3.aFloat22 * (float) arg0 + this.aClass34_Sub2_3.aFloat16 * (float) arg1 + (float) arg2 * this.aClass34_Sub2_3.aFloat19;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass34_Sub2_3.aFloat26 + this.aClass34_Sub2_3.aFloat16 * (float) arg4 + this.aClass34_Sub2_3.aFloat22 * (float) arg3 + this.aClass34_Sub2_3.aFloat19 * (float) arg5;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt3131 && (float) this.anInt3131 > local59 || !(!(local28 > (float) this.anInt3108) || !((float) this.anInt3108 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt3123 * ((float) arg2 * this.aClass34_Sub2_3.aFloat24 + this.aClass34_Sub2_3.aFloat17 * (float) arg0 + this.aClass34_Sub2_3.aFloat18 * (float) arg1 + this.aClass34_Sub2_3.aFloat15) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt3123 * (this.aClass34_Sub2_3.aFloat15 + (float) arg4 * this.aClass34_Sub2_3.aFloat18 + this.aClass34_Sub2_3.aFloat17 * (float) arg3 + (float) arg5 * this.aClass34_Sub2_3.aFloat24) / local59);
		if ((float) local123 < this.aFloat33 && (float) local155 < this.aFloat33 || this.aFloat37 < (float) local123 && (float) local155 > this.aFloat37) {
			return false;
		} else {
			@Pc(213) int local213 = (int) (((float) arg1 * this.aClass34_Sub2_3.aFloat21 + this.aClass34_Sub2_3.aFloat23 * (float) arg0 + (float) arg2 * this.aClass34_Sub2_3.aFloat25 + this.aClass34_Sub2_3.aFloat20) * (float) this.anInt3118 / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt3118 * ((float) arg5 * this.aClass34_Sub2_3.aFloat25 + this.aClass34_Sub2_3.aFloat21 * (float) arg4 + (float) arg3 * this.aClass34_Sub2_3.aFloat23 + this.aClass34_Sub2_3.aFloat20) / local59);
			return (!((float) local213 < this.aFloat42) || !((float) local245 < this.aFloat42)) && (!((float) local213 > this.aFloat34) || !(this.aFloat34 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
	private void method2454() {
		if (this.anInt3102 != 3) {
			this.anInt3102 = 3;
			this.method2516();
			this.method2488();
			this.anInt3129 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt3108;
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "(I)V")
	public void method2455() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ih", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt3133 = 0;
		this.anInt3104 = this.anInt3052;
		this.anInt3128 = this.anInt3049;
		this.anInt3126 = 0;
		OpenGL.glDisable(3089);
		this.method2500();
	}

	@OriginalMember(owner = "client!ih", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.anInt3099 + this.anInt3097 + this.anInt3098;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class85 method5709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class85_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
	private void method2456() {
		if (this.aBoolean301 && !this.aBoolean302) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)V")
	public synchronized void method2457(@OriginalArg(1) int arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong236 = arg0;
		this.aClass14_19.method205(local7);
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(II)I")
	public int method2458(@OriginalArg(0) int arg0) {
		if (arg0 == 6406 || arg0 == 6409) {
			return 1;
		} else if (arg0 == 6410 || arg0 == 34846 || arg0 == 34844) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408 || arg0 == 34847) {
			return 4;
		} else if (arg0 == 34843) {
			return 6;
		} else if (arg0 == 34842) {
			return 8;
		} else if (arg0 == 6402) {
			return 3;
		} else if (arg0 == 6401) {
			return 1;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZII[B)Lclient!tg;")
	public Interface9 method2459(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface9) (this.aBoolean290 && (!arg1 || this.aBoolean311) ? new Class68_Sub1(this, arg0, arg3, arg2, arg1) : new Class72_Sub2(this, arg0, arg3, arg2));
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZB)V")
	public void method2460(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method2484(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
	private void method2461() {
		OpenGL.glViewport(this.anInt3101, this.anInt3119, this.anInt3049, this.anInt3052);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZB)V")
	public void method2462(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean308 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt3129 &= 0xFFFFFFE0;
		this.aBoolean308 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V")
	private void method2463() {
		@Pc(6) float[] local6 = this.aFloatArray11;
		@Pc(18) float local18 = (float) (-this.anInt3116 * this.anInt3131) / (float) this.anInt3123;
		@Pc(36) float local36 = (float) ((this.anInt3049 - this.anInt3116) * this.anInt3131) / (float) this.anInt3123;
		@Pc(47) float local47 = (float) (this.anInt3111 * this.anInt3131) / (float) this.anInt3118;
		@Pc(61) float local61 = (float) (this.anInt3131 * (this.anInt3111 - this.anInt3052)) / (float) this.anInt3118;
		if (local18 == local36 || local61 == local47) {
			local6[3] = 0.0F;
			local6[12] = 0.0F;
			local6[0] = 1.0F;
			local6[6] = 0.0F;
			local6[5] = 1.0F;
			local6[9] = 0.0F;
			local6[11] = 0.0F;
			local6[4] = 0.0F;
			local6[10] = 1.0F;
			local6[1] = 0.0F;
			local6[13] = 0.0F;
			local6[15] = 1.0F;
			local6[2] = 0.0F;
			local6[8] = 0.0F;
			local6[7] = 0.0F;
			local6[14] = 0.0F;
		} else {
			@Pc(75) float local75 = (float) this.anInt3131 * 2.0F;
			local6[13] = 0.0F;
			local6[0] = local75 / (local36 - local18);
			local6[10] = this.aFloat48 = (float) -(this.anInt3131 + this.anInt3108) / (float) (this.anInt3108 - this.anInt3131);
			local6[9] = (local47 + local61) / (local47 - local61);
			local6[7] = 0.0F;
			local6[8] = (local18 + local36) / (-local18 + local36);
			local6[12] = 0.0F;
			local6[1] = 0.0F;
			local6[3] = 0.0F;
			local6[2] = 0.0F;
			local6[5] = local75 / (local47 - local61);
			local6[4] = 0.0F;
			local6[14] = this.aFloat46 = -((float) this.anInt3108 * local75) / (float) (this.anInt3108 - this.anInt3131);
			local6[11] = -1.0F;
			local6[15] = 0.0F;
			local6[6] = 0.0F;
		}
		this.method2487();
	}

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "()V")
	@Override
	public void method5698() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ub;B)V")
	public void method2464(@OriginalArg(0) Interface11 arg0) {
		if (this.aBoolean294) {
			this.method2506(arg0);
			this.method2502(arg0);
		} else if (this.anInt3096 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt3096 >= 0) {
				this.anInterface11Array3[this.anInt3096].method1640();
			}
			this.anInterface11_1 = this.anInterface11_2 = this.anInterface11Array3[++this.anInt3096] = arg0;
			this.anInterface11_1.method1641();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IF)V")
	public void method2465(@OriginalArg(1) float arg0) {
		if (arg0 == this.aFloat38) {
			return;
		}
		this.aFloat38 = arg0;
		if (this.anInt3102 == 3) {
			this.method2516();
			return;
		}
	}

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "()I")
	@Override
	public int method5710() {
		return 4;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class85 method5700(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class85_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ih", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt3049 < arg2) {
			arg2 = this.anInt3049;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt3052) {
			arg3 = this.anInt3052;
		}
		this.anInt3104 = arg3;
		this.anInt3128 = arg2;
		this.anInt3133 = arg1;
		this.anInt3126 = arg0;
		OpenGL.glEnable(3089);
		this.method2500();
		this.method2485();
	}

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.aBoolean313 = false;
		this.aClass220_1.method4615(false, false, 0, 0, 0);
		this.method2532();
		this.method2495();
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(B)V")
	public void method2466() {
		if (this.anInt3129 == 2) {
			return;
		}
		this.method2528();
		this.method2513(false);
		this.method2498(false);
		this.method2462(false);
		this.method2469(false);
		this.method2531(-2);
		this.anInt3129 = 2;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class139 method5657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class139_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "()Z")
	@Override
	public boolean method5689() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "()Z")
	@Override
	public boolean method5697() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(6) int local6 = this.anInt3138;
		this.anInt3138 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ih", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt3131;
	}

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "()Z")
	@Override
	public boolean method5711() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt3104;
		arg0[0] = this.anInt3126;
		arg0[2] = this.anInt3128;
		arg0[1] = this.anInt3133;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLclient!ub;)V")
	public void method2467(@OriginalArg(1) Interface11 arg0) {
		if (this.aBoolean294) {
			this.method2514(arg0);
			this.method2472(arg0);
		} else if (this.anInt3096 >= 0 && arg0 == this.anInterface11Array3[this.anInt3096]) {
			this.anInterface11Array3[this.anInt3096--] = null;
			arg0.method1640();
			if (this.anInt3096 >= 0) {
				this.anInterface11_1 = this.anInterface11_2 = this.anInterface11Array3[this.anInt3096];
				this.anInterface11_1.method1641();
			} else {
				this.anInterface11_1 = this.anInterface11_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBI)V")
	public synchronized void method2468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub18 local12 = new Class1_Sub18(arg1);
		local12.aLong236 = arg0;
		this.aClass14_16.method205(local12);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZ)V")
	public void method2469(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean298) {
			this.aBoolean298 = arg0;
			this.method2510();
			this.anInt3129 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	@Override
	public void method5684(@OriginalArg(0) int arg0) {
		this.method2479();
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt3131 && arg1 == this.anInt3108) {
			return;
		}
		this.anInt3131 = arg0;
		this.anInt3108 = arg1;
		this.method2463();
		this.method2532();
		if (this.anInt3102 == 3) {
			this.method2516();
			return;
		}
		if (this.anInt3102 != 2) {
			return;
		}
		this.method2494();
	}

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "()Z")
	@Override
	public boolean method5728() {
		return this.aBoolean299 && (!this.method5713() || this.aBoolean314);
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(II)I")
	public int method2470(@OriginalArg(1) int arg0) {
		if (arg0 == 5121 || arg0 == 5120) {
			return 1;
		} else if (arg0 == 5123 || arg0 == 5122) {
			return 2;
		} else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BII)V")
	public void method2471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3115 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg1 != this.anInt3121) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt3121 = arg1;
			local11 = true;
		}
		if (this.anInt3114 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local11 = true;
			this.anInt3114 = arg0;
		}
		if (local11) {
			this.anInt3129 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class73 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class73_Sub1 local6 = (Class73_Sub1) arg5;
		@Pc(9) Class23_Sub3_Sub1 local9 = local6.aClass23_Sub3_Sub1_1;
		this.method2466();
		this.method2504(local6.aClass23_Sub3_Sub1_1);
		this.method2503(1);
		this.method2471(8448, 7681);
		this.method2505(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat89 / (float) local9.anInt7184;
		@Pc(46) float local46 = local9.aFloat88 / (float) local9.anInt7183;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method2505(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(Lclient!ub;B)V")
	public void method2472(@OriginalArg(0) Interface11 arg0) {
		if (this.anInt3094 < 0 || arg0 != this.anInterface11Array2[this.anInt3094]) {
			throw new RuntimeException();
		}
		this.anInterface11Array2[this.anInt3094--] = null;
		arg0.method1639();
		if (this.anInt3094 >= 0) {
			this.anInterface11_2 = this.anInterface11Array2[this.anInt3094];
			this.anInterface11_2.method1643();
		} else {
			this.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ik;Z)V")
	public void method2473(@OriginalArg(0) Interface3 arg0) {
		if (this.anInterface3_3 != arg0) {
			if (this.aBoolean290) {
				OpenGL.glBindBufferARB(34963, arg0.method5207());
			}
			this.anInterface3_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "()Z")
	@Override
	public boolean method5721() {
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "()Z")
	@Override
	public boolean method5692() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "(I)V")
	public void method2474() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ff;Lclient!ff;ILclient!ff;Lclient!ff;)V")
	public void method2475(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(3) Class80 arg2, @OriginalArg(4) Class80 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method2497(arg3.anInterface9_2);
			OpenGL.glVertexPointer(arg3.aByte34, arg3.aShort41, this.anInterface9_3.method3690(), this.anInterface9_3.method3688() + (long) arg3.aByte35);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method2497(arg1.anInterface9_2);
			OpenGL.glNormalPointer(arg1.aShort41, this.anInterface9_3.method3690(), this.anInterface9_3.method3688() + (long) arg1.aByte35);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method2497(arg2.anInterface9_2);
			OpenGL.glColorPointer(arg2.aByte34, arg2.aShort41, this.anInterface9_3.method3690(), this.anInterface9_3.method3688() + (long) arg2.aByte35);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method2497(arg0.anInterface9_2);
			OpenGL.glTexCoordPointer(arg0.aByte34, arg0.aShort41, this.anInterface9_3.method3690(), this.anInterface9_3.method3688() + (long) arg0.aByte35);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)V")
	public void method2476(@OriginalArg(0) int arg0) {
		if (this.anInt3115 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt3115 = arg0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "(I)V")
	private void method2477() {
		this.method2531(-2);
		for (@Pc(14) int local14 = this.anInt3107 - 1; local14 >= 0; local14--) {
			this.method2476(local14);
			this.method2504(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method2471(8448, 8448);
		this.method2505(2, 34168, 770);
		this.method2527();
		this.anInt3130 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt3132 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean297 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean289 = true;
		this.method2513(true);
		this.method2498(true);
		this.method2462(true);
		this.method2469(true);
		this.method2481();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(132) float[] local132 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(134) int local134 = 0; local134 < 8; local134++) {
			@Pc(140) int local140 = local134 + 16384;
			OpenGL.glLightfv(local140, 4608, local132, 0);
			OpenGL.glLightf(local140, 4615, 0.0F);
			OpenGL.glLightf(local140, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt3100 = this.anInt3112 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IBI)V")
	public void method2478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3101 = arg0;
		this.anInt3119 = arg1;
		this.method2461();
		this.method2485();
	}

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "(I)V")
	private void method2479() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[Lclient!ls;)V")
	@Override
	public void method5693(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub29[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass1_Sub29Array1[local7] = arg1[local7];
		}
		this.anInt3110 = arg0;
		if (this.anInt3102 != 1) {
			this.method2507();
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method2480();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method2503(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean299) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean299) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "(I)V")
	private void method2480() {
		if (this.anInt3129 == 1) {
			return;
		}
		this.method2528();
		this.method2513(false);
		this.method2498(false);
		this.method2462(false);
		this.method2469(false);
		this.method2504(null);
		this.method2531(-2);
		this.method2535(1);
		this.anInt3129 = 1;
	}

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "(I)V")
	public void method2481() {
		if (this.anInt3102 != 0) {
			this.anInt3129 &= 0xFFFFFFE0;
			this.anInt3102 = 0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2480();
		this.method2503(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.method2503(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZJ)V")
	public synchronized void method2482(@OriginalArg(1) long arg0) {
		@Pc(12) Class1 local12 = new Class1();
		local12.aLong236 = arg0;
		this.aClass14_20.method205(local12);
	}

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg1 * this.aClass34_Sub2_3.aFloat16 + (float) arg0 * this.aClass34_Sub2_3.aFloat22 + this.aClass34_Sub2_3.aFloat19 * (float) arg2 + this.aClass34_Sub2_3.aFloat26;
		if (local28 < (float) this.anInt3131 || local28 > (float) this.anInt3108) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt3123 * (this.aClass34_Sub2_3.aFloat15 + (float) arg0 * this.aClass34_Sub2_3.aFloat17 + (float) arg1 * this.aClass34_Sub2_3.aFloat18 + (float) arg2 * this.aClass34_Sub2_3.aFloat24) / local28);
		@Pc(117) int local117 = (int) ((this.aClass34_Sub2_3.aFloat20 + this.aClass34_Sub2_3.aFloat23 * (float) arg0 + this.aClass34_Sub2_3.aFloat21 * (float) arg1 + this.aClass34_Sub2_3.aFloat25 * (float) arg2) * (float) this.anInt3118 / local28);
		if (this.aFloat33 <= (float) local85 && (float) local85 <= this.aFloat37 && this.aFloat42 <= (float) local117 && this.aFloat34 >= (float) local117) {
			arg3[0] = (int) ((float) local85 - this.aFloat33);
			arg3[1] = (int) ((float) local117 - this.aFloat42);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!wp;I)V")
	@Override
	public void method5723(@OriginalArg(0) Class8[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class111_Sub8[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method5987(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(III)V")
	public synchronized void method2483(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub18 local14 = new Class1_Sub18(arg1);
		local14.aLong236 = arg0;
		this.aClass14_15.method205(local14);
	}

	@OriginalMember(owner = "client!ih", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class73_Sub1 local6 = (Class73_Sub1) arg1;
		@Pc(9) Class23_Sub3_Sub1 local9 = local6.aClass23_Sub3_Sub1_1;
		this.method2466();
		this.method2504(local6.aClass23_Sub3_Sub1_1);
		this.method2503(1);
		this.method2471(8448, 7681);
		this.method2505(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat89 / (float) local9.anInt7184;
		@Pc(46) float local46 = local9.aFloat88 / (float) local9.anInt7183;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt3126 - arg2) * local39, local46 * (float) (this.anInt3133 - arg3));
		OpenGL.glVertex2i(this.anInt3126, this.anInt3133);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3126 - arg2), local46 * (float) (this.anInt3104 - arg3));
		OpenGL.glVertex2i(this.anInt3126, this.anInt3104);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3128 - arg2), (float) (this.anInt3104 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3128, this.anInt3104);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3128 - arg2), local46 * (float) (this.anInt3133 - arg3));
		OpenGL.glVertex2i(this.anInt3128, this.anInt3133);
		OpenGL.glEnd();
		this.method2505(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "()V")
	@Override
	public void method5730() {
		this.aClass2_1.method15();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZIZ)V")
	public void method2484(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt3125) {
			if (arg1 < 0) {
				this.method2527();
				this.method2504(null);
				this.method2535(0);
				if (!this.aBoolean313) {
					this.aClass220_1.method4615(arg0, arg2, 0, 0, 0);
				}
			} else {
				@Pc(26) Class23_Sub3 local26 = this.aClass141_1.method3098(arg1);
				@Pc(32) Class25 local32 = super.anInterface4_10.method5090(arg1);
				if (local32.aByte8 == 0 && local32.aByte13 == 0) {
					this.method2527();
				} else {
					@Pc(56) int local56 = local32.aBoolean54 ? 64 : 128;
					@Pc(60) int local60 = local56 * 50;
					this.method2496((float) (local32.aByte13 * (this.anInt3092 % local60)) / (float) local60, (float) (this.anInt3092 % local60 * local32.aByte8) / (float) local60, 0.0F);
				}
				if (this.aBoolean313) {
					this.method2504(local26);
					this.method2535(local32.anInt355);
				} else {
					this.aClass220_1.method4615(arg0, arg2, local32.aByte10, local32.aByte11, local32.anInt356);
					if (!this.aClass220_1.method4613(local32.anInt355, local26)) {
						this.method2504(local26);
						this.method2535(local32.anInt355);
					}
				}
			}
			this.anInt3125 = arg1;
		}
		this.anInt3129 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(57) float local57;
		if (this.aClass23_Sub3_Sub1_2 == null || this.aClass23_Sub3_Sub1_2.anInt7172 < arg2 || this.aClass23_Sub3_Sub1_2.anInt7176 < arg3) {
			this.aClass23_Sub3_Sub1_2 = Static165.method2163(this, arg2, arg3, arg6);
			this.aClass23_Sub3_Sub1_2.method5808(false, false);
			local45 = this.aClass23_Sub3_Sub1_2.aFloat88;
			local57 = this.aClass23_Sub3_Sub1_2.aFloat89;
		} else {
			this.aClass23_Sub3_Sub1_2.method5811(arg3, false, arg6, 6406, arg2);
			local45 = this.aClass23_Sub3_Sub1_2.aFloat88 * (float) arg3 / (float) this.aClass23_Sub3_Sub1_2.anInt7176;
			local57 = (float) arg2 * this.aClass23_Sub3_Sub1_2.aFloat89 / (float) this.aClass23_Sub3_Sub1_2.anInt7172;
		}
		this.method2466();
		this.method2504(this.aClass23_Sub3_Sub1_2);
		this.method2503(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2533(arg5);
		this.method2471(34165, 34165);
		this.method2505(0, 34166, 768);
		this.method2505(2, 5890, 770);
		this.method2492(34166, 0);
		this.method2492(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = local147 + (float) arg2;
		@Pc(160) float local160 = local150 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local57);
		OpenGL.glVertex2f(local147, local160);
		OpenGL.glTexCoord2f(local45, local57);
		OpenGL.glVertex2f(local155, local160);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method2505(0, 5890, 768);
		this.method2505(2, 34166, 770);
		this.method2492(5890, 0);
		this.method2492(34166, 2);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V")
	@Override
	public void method5677(@OriginalArg(0) boolean arg0) {
		this.aBoolean306 = arg0;
		this.method2510();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([Lclient!e;Lclient!sj;Lclient!c;[Lclient!wp;I)V")
	@Override
	public void method5673(@OriginalArg(0) Class8[] arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class111_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method5723(arg0, arg2, arg3, arg4);
		this.method5699(arg1);
	}

	@OriginalMember(owner = "client!ih", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3112 == arg0 && arg1 == this.anInt3135 && arg2 == this.anInt3127) {
			return;
		}
		this.anInt3127 = arg2;
		this.anInt3135 = arg1;
		this.anInt3112 = arg0;
		if (!this.aBoolean313) {
			this.method2532();
			this.method2495();
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(Z)V")
	private void method2485() {
		if (this.anInt3126 <= this.anInt3128 && this.anInt3104 >= this.anInt3133) {
			OpenGL.glScissor(this.anInt3101 + this.anInt3126, this.anInt3119 - -this.anInt3052 + -this.anInt3104, this.anInt3128 - this.anInt3126, this.anInt3104 + -this.anInt3133);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)V")
	public void method2486(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean302) {
			this.aBoolean302 = arg0;
			this.method2456();
		}
	}

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "(I)V")
	private void method2487() {
		if (this.aFloat35 == 0.0F) {
			this.aFloatArray11[14] = this.aFloat46;
			this.aFloatArray11[10] = this.aFloat48;
		} else {
			@Pc(13) float local13 = this.aFloat41 / (this.aFloat35 + this.aFloat41);
			@Pc(17) float local17 = local13 * local13;
			@Pc(33) float local33 = (1.0F - local13) * -this.aFloat46 * (1.0F - local13) / this.aFloat35;
			this.aFloatArray11[14] = this.aFloat46 * local17;
			this.aFloatArray11[10] = this.aFloat48 + local33;
		}
		this.aFloat32 = ((float) -this.anInt3108 + this.aFloatArray11[14]) / this.aFloatArray11[10];
		this.aFloat36 = (float) this.anInt3108 - this.aFloat35;
	}

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "(I)V")
	private void method2488() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass34_Sub2_3.method1908(), 0);
		if (this.aBoolean313) {
			this.aClass220_1.aClass69_Sub6_1.method4377();
		}
		this.method2517();
		this.method2507();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!hf;B)V")
	public void method2489(@OriginalArg(0) Class34_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method1908(), 0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I")
	@Override
	public int method5696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ud;)V")
	@Override
	public void method5661(@OriginalArg(0) Class59 arg0) {
		this.aClass59_Sub1_1 = (Class59_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!dd;Z)Lclient!o;")
	@Override
	public Class85 method5707(@OriginalArg(0) Class52 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt1015 * arg0.anInt1019];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray14 == null) {
			for (local21 = 0; local21 < arg0.anInt1015; local21++) {
				for (local25 = 0; local25 < arg0.anInt1019; local25++) {
					@Pc(38) int local38 = arg0.anIntArray114[arg0.aByteArray13[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt1015; local21++) {
				for (local25 = 0; local25 < arg0.anInt1019; local25++) {
					local12[local16++] = arg0.aByteArray14[local14] << 24 | arg0.anIntArray114[arg0.aByteArray13[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(119) Class85 local119 = this.method5700(local12, arg0.anInt1019, arg0.anInt1019, arg0.anInt1015);
		local119.ha(arg0.anInt1020, arg0.anInt1017, arg0.anInt1016, arg0.anInt1018);
		return local119;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFFFI)V")
	public void method2490(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static456.aFloatArray17[3] = arg2;
		Static456.aFloatArray17[0] = arg0;
		Static456.aFloatArray17[2] = arg3;
		Static456.aFloatArray17[1] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static456.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!ih", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < this.anInt3104) {
			this.anInt3104 = arg3;
		}
		if (this.anInt3128 > arg2) {
			this.anInt3128 = arg2;
		}
		if (arg1 > this.anInt3133) {
			this.anInt3133 = arg1;
		}
		if (arg0 > this.anInt3126) {
			this.anInt3126 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method2500();
		this.method2485();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIF)Lclient!ls;")
	@Override
	public Class1_Sub29 method5719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub29_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "(I)V")
	public void method2491() {
		if (this.anInt3129 == 16) {
			return;
		}
		this.method2454();
		this.method2513(true);
		this.method2462(true);
		this.method2469(true);
		this.method2503(1);
		this.method2535(0);
		this.anInt3129 = 16;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIB)V")
	public void method2492(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "(I)V")
	private void method2493() {
		if (this.anInt3102 != 2) {
			this.anInt3102 = 2;
			this.method2494();
			this.method2488();
			this.anInt3129 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "(I)V")
	private void method2494() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray11, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat41;
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
	@Override
	public void method5718(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(Z)V")
	private void method2495() {
		if (this.aBoolean304 && this.aBoolean313 | this.anInt3135 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "()Z")
	@Override
	public boolean method5667() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IFFF)V")
	private void method2496(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean295) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg0, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean295 = true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!tg;Z)V")
	public void method2497(@OriginalArg(0) Interface9 arg0) {
		if (arg0 != this.anInterface9_3) {
			if (this.aBoolean290) {
				OpenGL.glBindBufferARB(34962, arg0.method3687());
			}
			this.anInterface9_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IZ)V")
	public void method2498(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean301) {
			this.aBoolean301 = arg0;
			this.method2456();
			this.anInt3129 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "(I)V")
	private void method2499() {
		if (this.aCanvas4 == null) {
			this.anInt2973 = this.anInt2981 = 0;
		} else {
			@Pc(15) Dimension local15 = this.aCanvas4.getSize();
			this.anInt2973 = local15.width;
			this.anInt2981 = local15.height;
		}
		if (this.anInterface11_2 == null) {
			this.anInt3052 = this.anInt2981;
			this.anInt3049 = this.anInt2973;
			this.method2461();
		}
		this.method2481();
		this.va();
	}

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "()V")
	@Override
	public void method5731() {
	}

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "(I)V")
	private void method2500() {
		this.aFloat34 = this.anInt3104 - this.anInt3111;
		this.aFloat42 = this.anInt3133 - this.anInt3111;
		this.aFloat37 = this.anInt3128 - this.anInt3116;
		this.aFloat33 = this.anInt3126 - this.anInt3116;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!ub;)V")
	public void method2502(@OriginalArg(1) Interface11 arg0) {
		if (this.anInt3094 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3094 >= 0) {
			this.anInterface11Array2[this.anInt3094].method1639();
		}
		this.anInterface11_2 = this.anInterface11Array2[++this.anInt3094] = arg0;
		this.anInterface11_2.method1643();
	}

	@OriginalMember(owner = "client!ih", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat31) {
			this.aFloat31 = arg0;
			this.method2526();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5694(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5698();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5683(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas5) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass2_1.method12(arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!ih", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3116 = arg0;
		this.anInt3111 = arg1;
		this.anInt3118 = arg3;
		this.anInt3123 = arg2;
		this.method2463();
		this.method2500();
		if (this.anInt3102 == 3) {
			this.method2516();
		} else if (this.anInt3102 == 2) {
			this.method2494();
		}
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(II)V")
	public void method2503(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt3130) {
			return;
		}
		@Pc(28) boolean local28;
		@Pc(32) byte local32;
		if (arg0 == 1) {
			local28 = true;
			local32 = 1;
		} else if (arg0 == 2) {
			local28 = false;
			local32 = 2;
		} else if (arg0 == 128) {
			local28 = true;
			local32 = 3;
		} else {
			local32 = 0;
			local28 = false;
		}
		if (!this.aBoolean289) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean289 = true;
		}
		if (this.aBoolean297 != local28) {
			if (local28) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean297 = local28;
		}
		if (local32 != this.anInt3132) {
			if (local32 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local32 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local32 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt3132 = local32;
		}
		this.anInt3129 &= 0xFFFFFFE3;
		this.anInt3130 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class73 method5716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static391.method5081(arg2, arg3, arg1, this, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!sv;I)V")
	public void method2504(@OriginalArg(0) Class23 arg0) {
		@Pc(15) Class23 local15 = this.aClass23Array1[this.anInt3115];
		if (local15 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local15.anInt7163);
			} else {
				if (local15 == null) {
					OpenGL.glEnable(arg0.anInt7163);
				} else if (arg0.anInt7163 != local15.anInt7163) {
					OpenGL.glDisable(local15.anInt7163);
					OpenGL.glEnable(arg0.anInt7163);
				}
				OpenGL.glBindTexture(arg0.anInt7163, arg0.method5803());
			}
			this.aClass23Array1[this.anInt3115] = arg0;
		}
		this.anInt3129 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(IIII)V")
	public void method2505(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(ILclient!ub;)V")
	public void method2506(@OriginalArg(1) Interface11 arg0) {
		if (this.anInt3095 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3095 >= 0) {
			this.anInterface11Array1[this.anInt3095].method1638();
		}
		this.anInterface11_1 = this.anInterface11Array1[++this.anInt3095] = arg0;
		this.anInterface11_1.method1642();
	}

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "(I)V")
	private void method2507() {
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.anInt3110; local13++) {
			@Pc(20) Class1_Sub29 local20 = this.aClass1_Sub29Array1[local13];
			@Pc(25) int local25 = local13 + 16386;
			Static159.aFloatArray9[0] = local20.method5837();
			Static159.aFloatArray9[1] = local20.method5834();
			Static159.aFloatArray9[2] = local20.method5838();
			Static159.aFloatArray9[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static159.aFloatArray9, 0);
			@Pc(59) int local59 = local20.method5836();
			@Pc(65) float local65 = local20.method5841() / 255.0F;
			Static159.aFloatArray9[0] = (float) (local59 >> 16 & 0xFF) * local65;
			Static159.aFloatArray9[1] = (float) (local59 >> 8 & 0xFF) * local65;
			Static159.aFloatArray9[2] = local65 * (float) (local59 & 0xFF);
			OpenGL.glLightfv(local25, 4609, Static159.aFloatArray9, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local20.method5840() * local20.method5840()));
			OpenGL.glEnable(local25);
		}
		while (local13 < this.anInt3124) {
			OpenGL.glDisable(local13 + 16386);
			local13++;
		}
		this.anInt3124 = this.anInt3110;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(III)V")
	public synchronized void method2508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub18 local8 = new Class1_Sub18(arg0);
		local8.aLong236 = arg1;
		this.aClass14_18.method205(local8);
	}

	@OriginalMember(owner = "client!ih", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
		this.anInt3091 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt3091++;
		}
		this.anInt3093 = 0x1 << this.anInt3091;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!hf;)V")
	public void method2509(@OriginalArg(1) Class34_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method1908(), 0);
	}

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "(I)V")
	private void method2510() {
		OpenGL.glDepthMask(this.aBoolean298 && this.aBoolean306);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([BZIII)Lclient!ik;")
	public Interface3 method2511(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) int arg2) {
		return (Interface3) (this.aBoolean290 && (!arg1 || this.aBoolean311) ? new Class68_Sub2(this, 5123, arg0, arg2, arg1) : new Class72_Sub1(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5671(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static17.aFloat56 = arg1;
		Static461.aFloat92 = arg0;
		Static297.aFloat70 = arg2;
	}

	@OriginalMember(owner = "client!ih", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean313 = true;
		this.anInt3106 = arg1;
		this.anInt3120 = arg2;
		this.anInt3122 = arg0;
		this.anInt3113 = arg3;
		this.aClass220_1.method4615(false, false, 0, 3, 0);
		this.aClass220_1.aClass69_Sub6_1.method4377();
		this.method2532();
		this.method2495();
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(IZ)V")
	public void method2513(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean304 != arg0) {
			this.aBoolean304 = arg0;
			this.method2495();
			this.anInt3129 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(ZLclient!ub;)V")
	public void method2514(@OriginalArg(1) Interface11 arg0) {
		if (this.anInt3095 < 0 || arg0 != this.anInterface11Array1[this.anInt3095]) {
			throw new RuntimeException();
		}
		this.anInterface11Array1[this.anInt3095--] = null;
		arg0.method1638();
		if (this.anInt3095 < 0) {
			this.anInterface11_1 = null;
		} else {
			this.anInterface11_1 = this.anInterface11Array1[this.anInt3095];
			this.anInterface11_1.method1642();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5727() {
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "()V")
	@Override
	protected void method5663() {
		for (@Pc(10) Class1 local10 = this.aClass14_13.method203(); local10 != null; local10 = this.aClass14_13.method208()) {
			((Class1_Sub4_Sub1) local10).method408();
		}
		if (this.aClass2_1 != null) {
			this.aClass2_1.method21();
		}
		if (this.anOpenGL1 != null) {
			this.method2479();
			@Pc(40) Enumeration local40 = this.aHashtable1.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable1.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean287) {
			Static309.method4101(true, false);
			this.aBoolean287 = false;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ud;Lclient!ud;FLclient!ud;)Lclient!ud;")
	@Override
	public Class59 method5720(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class59 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean305 && this.aBoolean310) {
			@Pc(15) Class59_Sub1_Sub1 local15 = null;
			@Pc(18) Class59_Sub1 local18 = (Class59_Sub1) arg0;
			@Pc(21) Class59_Sub1 local21 = (Class59_Sub1) arg1;
			@Pc(25) Class23_Sub1 local25 = local18.method3888();
			@Pc(29) Class23_Sub1 local29 = local21.method3888();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local29.anInt333 >= local25.anInt333 ? local29.anInt333 : local25.anInt333;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class59_Sub1_Sub1) {
					@Pc(60) Class59_Sub1_Sub1 local60 = (Class59_Sub1_Sub1) arg3;
					if (local48 == local60.method2778()) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class59_Sub1_Sub1(this, local48);
				}
				if (local15.method2776(local25, local29, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "(I)V")
	public void method2515() {
		if (this.anInt3129 == 4) {
			return;
		}
		this.method2528();
		this.method2513(false);
		this.method2498(false);
		this.method2462(false);
		this.method2469(false);
		this.method2531(-2);
		this.method2503(1);
		this.method2535(0);
		this.anInt3129 = 4;
	}

	@OriginalMember(owner = "client!ih", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2480();
		this.method2503(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ih", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt3052 - arg1 - local12, arg2, 1, 32993, this.anInt3134, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(Z)V")
	private void method2516() {
		@Pc(15) float local15 = this.aFloat38 * (float) -this.anInt3116 / (float) this.anInt3123;
		@Pc(27) float local27 = (float) -this.anInt3111 * this.aFloat38 / (float) this.anInt3118;
		@Pc(46) float local46 = this.aFloat38 * (float) (this.anInt3049 - this.anInt3116) / (float) this.anInt3123;
		@Pc(61) float local61 = (float) (this.anInt3052 - this.anInt3111) * this.aFloat38 / (float) this.anInt3118;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local46 && local61 != local27) {
			OpenGL.glOrtho((double) local15, (double) local46, (double) -local61, (double) -local27, (double) ((float) this.anInt3131 - this.aFloat35), (double) ((float) this.anInt3108 - this.aFloat35));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5685() {
		return this.aClass34_Sub2_1;
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(Z)V")
	public void method2517() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray12, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray15, 0);
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(Z)V")
	@Override
	public void method5702(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(B)Lclient!aw;")
	public Class23_Sub1 method2518() {
		return this.aClass59_Sub1_1 == null ? null : this.aClass59_Sub1_1.method3888();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ul;[Lclient!dd;Z)Lclient!la;")
	@Override
	public Class137 method5680(@OriginalArg(0) Class252 arg0, @OriginalArg(1) Class52[] arg1) {
		return new Class137_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)Lclient!n;")
	@Override
	public Class1_Sub4 method5726(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub4_Sub1 local8 = new Class1_Sub4_Sub1(arg0);
		this.aClass14_13.method205(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "(I)V")
	private void method2519() {
		Static456.aFloatArray17[1] = this.aFloat45 * this.aFloat50;
		Static456.aFloatArray17[0] = this.aFloat47 * this.aFloat50;
		Static456.aFloatArray17[2] = this.aFloat30 * this.aFloat50;
		Static456.aFloatArray17[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static456.aFloatArray17, 0);
		Static456.aFloatArray17[1] = this.aFloat45 * -this.aFloat44;
		Static456.aFloatArray17[0] = this.aFloat47 * -this.aFloat44;
		Static456.aFloatArray17[3] = 1.0F;
		Static456.aFloatArray17[2] = -this.aFloat44 * this.aFloat30;
		OpenGL.glLightfv(16385, 4609, Static456.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(B)V")
	private void method2520() {
		this.aClass34_Sub2_3 = new Class34_Sub2();
		this.aClass34_Sub2_4 = new Class34_Sub2();
		this.aClass23Array1 = new Class23[this.anInt3107];
		this.aClass23_Sub3_3 = new Class23_Sub3(this, 3553, 6408, 1, 1);
		new Class23_Sub3(this, 3553, 6408, 1, 1);
		new Class23_Sub3(this, 3553, 6408, 1, 1);
		this.aClass8_Sub2_6 = new Class8_Sub2(this);
		this.aClass8_Sub2_8 = new Class8_Sub2(this);
		this.aClass8_Sub2_5 = new Class8_Sub2(this);
		this.aClass8_Sub2_2 = new Class8_Sub2(this);
		this.aClass8_Sub2_1 = new Class8_Sub2(this);
		this.aClass8_Sub2_3 = new Class8_Sub2(this);
		this.aClass8_Sub2_10 = new Class8_Sub2(this);
		this.aClass8_Sub2_9 = new Class8_Sub2(this);
		this.aClass8_Sub2_4 = new Class8_Sub2(this);
		this.aClass8_Sub2_7 = new Class8_Sub2(this);
		if (this.aBoolean310) {
			this.aClass90_4 = new Class90(this);
			new Class90(this);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!jaggl/memory/NativeBuffer;IZII)Lclient!tg;")
	public Interface9 method2521(@OriginalArg(0) NativeBuffer arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return (Interface9) (this.aBoolean290 ? new Class68_Sub1(this, arg1, arg0, arg2, false) : new Class72_Sub2(this, arg1, arg0));
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5686(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas5 == arg0) {
			local5 = this.aLong105;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable1.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas4) {
			this.method2499();
		}
	}

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "()Z")
	@Override
	public boolean method5691() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "()Z")
	@Override
	public boolean method5712() {
		if (this.aClass1_Sub23_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass1_Sub23_Sub1_1.method2730()) {
			if (!this.aClass2_1.method19(this.aClass1_Sub23_Sub1_1)) {
				return false;
			}
			this.aClass141_1.method3097();
		}
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5717() {
		return new Class34_Sub2();
	}

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt3100;
		if (local15 || this.aFloat50 != arg1 || this.aFloat44 != arg2) {
			this.anInt3100 = arg0;
			this.aFloat44 = arg2;
			this.aFloat50 = arg1;
			if (local15) {
				this.aFloat47 = (float) (this.anInt3100 & 0xFF0000) / 1.671168E7F;
				this.aFloat45 = (float) (this.anInt3100 & 0xFF00) / 65280.0F;
				this.aFloat30 = (float) (this.anInt3100 & 0xFF) / 255.0F;
				this.method2526();
			}
			this.method2519();
		}
		if (this.aFloatArray14[0] == arg3 && arg4 == this.aFloatArray14[1] && this.aFloatArray14[2] == arg5) {
			return;
		}
		this.aFloatArray14[2] = arg5;
		this.aFloatArray14[0] = arg3;
		this.aFloatArray14[1] = arg4;
		this.aFloatArray13[2] = -arg5;
		this.aFloatArray13[1] = -arg4;
		this.aFloatArray13[0] = -arg3;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray12[0] = arg3 * local142;
		this.aFloatArray12[2] = local142 * arg5;
		this.aFloatArray12[1] = arg4 * local142;
		this.aFloatArray15[0] = -this.aFloatArray12[0];
		this.aFloatArray15[2] = -this.aFloatArray12[2];
		this.aFloatArray15[1] = -this.aFloatArray12[1];
		this.method2517();
		this.anInt3105 = (int) (arg5 * 256.0F / arg4);
		this.anInt3117 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "()V")
	@Override
	public void method5665() {
		this.method2469(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
	@Override
	public void method5674(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "(I)V")
	public void method2522() {
		if (this.anInt3129 == 8) {
			return;
		}
		this.method2493();
		this.method2513(true);
		this.method2462(true);
		this.method2469(true);
		this.method2503(1);
		this.method2535(0);
		this.anInt3129 = 8;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5703(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas5 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable1.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) long local53 = this.anOpenGL1.prepareSurface(arg0);
			if (local53 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable1.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!ih", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class34 arg0) {
		this.aClass34_Sub2_3 = (Class34_Sub2) arg0;
		this.aClass34_Sub2_4.method1916(this.aClass34_Sub2_3);
		if (this.anInt3102 != 1) {
			this.method2488();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean313) {
			throw new RuntimeException("");
		}
		this.anInt3120 = arg2;
		this.anInt3106 = arg1;
		this.anInt3113 = arg3;
		this.anInt3122 = arg0;
		this.aClass220_1.aClass69_Sub6_1.method4377();
		this.method2532();
	}

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "(I)I")
	private int method2523() {
		this.aString30 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString29 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString30.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString30.indexOf("brian paul") != -1 || this.aString30.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static354.method4612(' ', local45.replace('.', ' '));
		if (local53.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(69) int local69 = Static252.method3564(local53[0]);
				@Pc(77) int local77 = Static252.method3564(local53[1]);
				this.anInt3109 = local77 + local69 * 10;
			} catch (@Pc(86) NumberFormatException local86) {
				local10 |= 0x4;
			}
		}
		if (this.anInt3109 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(120) int[] local120 = new int[1];
		OpenGL.glGetIntegerv(34018, local120, 0);
		this.anInt3107 = local120[0];
		OpenGL.glGetIntegerv(34929, local120, 0);
		this.anInt3136 = local120[0];
		OpenGL.glGetIntegerv(34930, local120, 0);
		this.anInt3103 = local120[0];
		if (this.anInt3107 < 2 || this.anInt3136 < 2 || this.anInt3103 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean291 = NativeStream.c();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean290 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean299 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean292 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean296 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.bf = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean303 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean309 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean305 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean288 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean312 = false;
		this.aBoolean310 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean294 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean300 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean314 = this.aBoolean300 & this.aBoolean294;
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!sj;)V")
	@Override
	public void method5699(@OriginalArg(0) Class232 arg0) {
		this.aClass150_1.method3465(arg0, this);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BFF)V")
	public void method2524(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat40 = arg1;
		this.aFloat39 = arg0;
		if (!this.aBoolean313) {
			this.method2532();
		}
	}

	@OriginalMember(owner = "client!ih", name = "C", descriptor = "(I)V")
	private void method2525() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static331.method4343(1000L);
		}
	}

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "()Z")
	@Override
	public boolean method5706() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "(B)V")
	private void method2526() {
		Static456.aFloatArray17[0] = this.aFloat31 * this.aFloat47;
		Static456.aFloatArray17[2] = this.aFloat30 * this.aFloat31;
		Static456.aFloatArray17[1] = this.aFloat31 * this.aFloat45;
		Static456.aFloatArray17[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static456.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "()Z")
	@Override
	public boolean method5725() {
		return this.aClass220_1.method4614();
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIIIII)Lclient!ud;")
	@Override
	public Class59 method5724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean305 ? new Class59_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "(I)V")
	private void method2527() {
		if (this.aBoolean295) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean295 = false;
		}
	}

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "()Z")
	@Override
	public boolean method5713() {
		return this.aClass1_Sub23_Sub1_1 != null && this.aClass1_Sub23_Sub1_1.method2730();
	}

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "(I)V")
	private void method2528() {
		if (this.anInt3102 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt3049 > 0 && this.anInt3052 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt3049, (double) this.anInt3052, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt3102 = 1;
		this.anInt3129 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ih", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(6) int local6 = this.anInt3137;
		this.anInt3137 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "()V")
	@Override
	public void method5679() {
		if (this.aClass1_Sub23_Sub1_1 != null && this.aClass1_Sub23_Sub1_1.method2730()) {
			this.aClass2_1.method13(this.aClass1_Sub23_Sub1_1);
			this.aClass141_1.method3097();
		}
	}

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method2480();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method2503(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean299) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean299) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2480();
		this.method2503(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5688(@OriginalArg(0) Canvas arg0) {
		this.aCanvas4 = null;
		this.aLong106 = 0L;
		if (arg0 == null || this.aCanvas5 == arg0) {
			this.aLong106 = this.aLong105;
			this.aCanvas4 = this.aCanvas5;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable1.get(arg0);
			this.aLong106 = local36;
			this.aCanvas4 = arg0;
		}
		if (this.aCanvas4 == null || this.aLong106 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong106);
		this.method2499();
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(BI)I")
	public int method2530(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5660(@OriginalArg(0) Class1_Sub4 arg0) {
		this.aNativeHeap2 = ((Class1_Sub4_Sub1) arg0).aNativeHeap1;
		if (this.anInterface9_4 != null) {
			return;
		}
		@Pc(16) Class1_Sub19_Sub1 local16 = new Class1_Sub19_Sub1(80);
		if (this.aBoolean291) {
			local16.method2067(-1.0F);
			local16.method2067(-1.0F);
			local16.method2067(0.0F);
			local16.method2067(0.0F);
			local16.method2067(1.0F);
			local16.method2067(1.0F);
			local16.method2067(-1.0F);
			local16.method2067(0.0F);
			local16.method2067(1.0F);
			local16.method2067(1.0F);
			local16.method2067(1.0F);
			local16.method2067(1.0F);
			local16.method2067(0.0F);
			local16.method2067(1.0F);
			local16.method2067(0.0F);
			local16.method2067(-1.0F);
			local16.method2067(1.0F);
			local16.method2067(0.0F);
			local16.method2067(0.0F);
			local16.method2067(0.0F);
		} else {
			local16.method2063(-1.0F);
			local16.method2063(-1.0F);
			local16.method2063(0.0F);
			local16.method2063(0.0F);
			local16.method2063(1.0F);
			local16.method2063(1.0F);
			local16.method2063(-1.0F);
			local16.method2063(0.0F);
			local16.method2063(1.0F);
			local16.method2063(1.0F);
			local16.method2063(1.0F);
			local16.method2063(1.0F);
			local16.method2063(0.0F);
			local16.method2063(1.0F);
			local16.method2063(0.0F);
			local16.method2063(-1.0F);
			local16.method2063(1.0F);
			local16.method2063(0.0F);
			local16.method2063(0.0F);
			local16.method2063(0.0F);
		}
		this.anInterface9_4 = this.method2459(20, false, local16.anInt3698, local16.aByteArray38);
		this.aClass80_5 = new Class80(this.anInterface9_4, 5126, 3, 0);
		this.aClass80_4 = new Class80(this.anInterface9_4, 5126, 2, 12);
		this.aClass150_1.method3461(this);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IB)V")
	public void method2531(@OriginalArg(0) int arg0) {
		this.method2460(arg0, true);
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt3085 = arg0;
		this.aClass141_1.method3097();
	}

	@OriginalMember(owner = "client!ih", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat35;
	}

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "(I)V")
	private void method2532() {
		@Pc(58) int local58;
		if (this.aBoolean313) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local58 = this.anInt3106;
		} else {
			this.aFloat49 = (float) (this.anInt3108 - this.anInt3127) - this.aFloat39;
			this.aFloat43 = this.aFloat49 - (float) this.anInt3135 * this.aFloat40;
			if (this.aFloat43 < (float) this.anInt3131) {
				this.aFloat43 = this.anInt3131;
			}
			OpenGL.glFogf(2915, this.aFloat43);
			OpenGL.glFogf(2916, this.aFloat49);
			local58 = this.anInt3112;
		}
		Static456.aFloatArray17[2] = (float) (local58 & 0xFF) / 255.0F;
		Static456.aFloatArray17[1] = (float) (local58 & 0xFF00) / 65280.0F;
		Static456.aFloatArray17[0] = (float) (local58 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static456.aFloatArray17, 0);
		if (this.aBoolean313) {
			this.aClass220_1.aClass69_Sub6_1.method4376();
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(IB)V")
	public void method2533(@OriginalArg(0) int arg0) {
		Static456.aFloatArray17[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static456.aFloatArray17[3] = (float) (arg0 >>> 24) / 255.0F;
		Static456.aFloatArray17[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static456.aFloatArray17[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static456.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5729(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "()Z")
	@Override
	public boolean method5714() {
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)I")
	@Override
	public int method5732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5670(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class1_Sub18 local19;
		while (!this.aClass14_15.method209()) {
			local19 = (Class1_Sub18) this.aClass14_15.method202();
			Static248.anIntArray329[local7++] = (int) local19.aLong236;
			this.anInt3098 -= local19.anInt2354;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static248.anIntArray329, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static248.anIntArray329, 0);
			local7 = 0;
		}
		while (!this.aClass14_16.method209()) {
			local19 = (Class1_Sub18) this.aClass14_16.method202();
			Static248.anIntArray329[local7++] = (int) local19.aLong236;
			this.anInt3097 -= local19.anInt2354;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static248.anIntArray329, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static248.anIntArray329, 0);
			local7 = 0;
		}
		while (!this.aClass14_17.method209()) {
			local19 = (Class1_Sub18) this.aClass14_17.method202();
			Static248.anIntArray329[local7++] = local19.anInt2354;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static248.anIntArray329, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static248.anIntArray329, 0);
			local7 = 0;
		}
		while (!this.aClass14_18.method209()) {
			local19 = (Class1_Sub18) this.aClass14_18.method202();
			Static248.anIntArray329[local7++] = (int) local19.aLong236;
			this.anInt3099 -= local19.anInt2354;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static248.anIntArray329, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static248.anIntArray329, 0);
		}
		while (!this.aClass14_14.method209()) {
			local19 = (Class1_Sub18) this.aClass14_14.method202();
			OpenGL.glDeleteLists((int) local19.aLong236, local19.anInt2354);
		}
		@Pc(216) Class1 local216;
		while (!this.aClass14_19.method209()) {
			local216 = this.aClass14_19.method202();
			OpenGL.glDeleteProgramARB((int) local216.aLong236);
		}
		while (!this.aClass14_20.method209()) {
			local216 = this.aClass14_20.method202();
			OpenGL.glDeleteObjectARB(local216.aLong236);
		}
		while (!this.aClass14_14.method209()) {
			local19 = (Class1_Sub18) this.aClass14_14.method202();
			OpenGL.glDeleteLists((int) local19.aLong236, local19.anInt2354);
		}
		this.aClass141_1.method3096();
		if (this.pa() > 100663296 && Static183.method2674() > this.aLong107 + 60000L) {
			System.gc();
			this.aLong107 = Static183.method2674();
		}
		this.anInt3092 = local11;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ld;IIII)Lclient!e;")
	@Override
	public Class8 method5678(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class8_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "()Z")
	@Override
	public boolean method5662() {
		return this.aClass1_Sub23_Sub1_1 != null && (this.anInt3083 <= 1 || this.aBoolean314);
	}

	@OriginalMember(owner = "client!ih", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat41 == arg0 && arg1 == this.aFloat35) {
			return;
		}
		this.aFloat41 = arg0;
		this.aFloat35 = arg1;
		this.method2487();
		if (this.anInt3102 == 3) {
			this.method2516();
			return;
		}
		if (this.anInt3102 != 2) {
			return;
		}
		this.method2494();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILclient!ik;II)V")
	public void method2534(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg1.method5206();
		@Pc(14) int local14 = arg0 * this.method2470(local7);
		this.method2473(arg1);
		OpenGL.glDrawElements(4, arg2, local7, arg1.method5208() + (long) local14);
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V")
	@Override
	public void method5722(@OriginalArg(0) int arg0) {
		this.method2525();
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "(II)V")
	public void method2535(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method2471(7681, 7681);
		} else if (arg0 == 0) {
			this.method2471(8448, 8448);
		} else if (arg0 == 2) {
			this.method2471(7681, 34165);
		} else if (arg0 == 3) {
			this.method2471(8448, 260);
		} else if (arg0 == 4) {
			this.method2471(34023, 34023);
			return;
		}
	}
}
