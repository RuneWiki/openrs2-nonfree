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

@OriginalClass("client!ht")
public final class Class109_Sub1 extends Class109 {

	@OriginalMember(owner = "client!ht", name = "T", descriptor = "I")
	public int anInt2808;

	@OriginalMember(owner = "client!ht", name = "Ob", descriptor = "I")
	private int anInt2853;

	@OriginalMember(owner = "client!ht", name = "Rb", descriptor = "I")
	public int anInt2856;

	@OriginalMember(owner = "client!ht", name = "ae", descriptor = "I")
	private int anInt2965;

	@OriginalMember(owner = "client!ht", name = "te", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!ht", name = "ue", descriptor = "I")
	public int anInt2974;

	@OriginalMember(owner = "client!ht", name = "Be", descriptor = "Lclient!ts;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!ht", name = "Ee", descriptor = "Lclient!ts;")
	private Interface11 anInterface11_2;

	@OriginalMember(owner = "client!ht", name = "Ge", descriptor = "I")
	private int anInt2980;

	@OriginalMember(owner = "client!ht", name = "He", descriptor = "I")
	public int anInt2981;

	@OriginalMember(owner = "client!ht", name = "Je", descriptor = "I")
	public int anInt2982;

	@OriginalMember(owner = "client!ht", name = "Qe", descriptor = "I")
	public int anInt2983;

	@OriginalMember(owner = "client!ht", name = "Re", descriptor = "Lclient!or;")
	public Class37_Sub2 aClass37_Sub2_1;

	@OriginalMember(owner = "client!ht", name = "Se", descriptor = "I")
	private int anInt2984;

	@OriginalMember(owner = "client!ht", name = "We", descriptor = "Z")
	private boolean aBoolean152;

	@OriginalMember(owner = "client!ht", name = "Ye", descriptor = "J")
	private long aLong92;

	@OriginalMember(owner = "client!ht", name = "Ze", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!ht", name = "af", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!ht", name = "df", descriptor = "Z")
	public boolean aBoolean154;

	@OriginalMember(owner = "client!ht", name = "ff", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!ht", name = "gf", descriptor = "Z")
	public boolean aBoolean155;

	@OriginalMember(owner = "client!ht", name = "hf", descriptor = "I")
	private int anInt2987;

	@OriginalMember(owner = "client!ht", name = "nf", descriptor = "Z")
	public boolean aBoolean157;

	@OriginalMember(owner = "client!ht", name = "rf", descriptor = "I")
	private int anInt2991;

	@OriginalMember(owner = "client!ht", name = "uf", descriptor = "Z")
	private boolean aBoolean159;

	@OriginalMember(owner = "client!ht", name = "vf", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!ht", name = "wf", descriptor = "I")
	private int anInt2993;

	@OriginalMember(owner = "client!ht", name = "xf", descriptor = "Lclient!aw;")
	public Class18_Sub1 aClass18_Sub1_3;

	@OriginalMember(owner = "client!ht", name = "yf", descriptor = "Z")
	public boolean aBoolean160;

	@OriginalMember(owner = "client!ht", name = "Bf", descriptor = "I")
	private int anInt2994;

	@OriginalMember(owner = "client!ht", name = "Df", descriptor = "F")
	private float aFloat52;

	@OriginalMember(owner = "client!ht", name = "Ef", descriptor = "Lclient!or;")
	public Class37_Sub2 aClass37_Sub2_2;

	@OriginalMember(owner = "client!ht", name = "Ff", descriptor = "F")
	private float aFloat53;

	@OriginalMember(owner = "client!ht", name = "Gf", descriptor = "Lclient!or;")
	public Class37_Sub2 aClass37_Sub2_3;

	@OriginalMember(owner = "client!ht", name = "If", descriptor = "Lclient!qv;")
	public Class13_Sub1 aClass13_Sub1_4;

	@OriginalMember(owner = "client!ht", name = "Jf", descriptor = "Ljava/lang/String;")
	private String aString19;

	@OriginalMember(owner = "client!ht", name = "Kf", descriptor = "Z")
	private boolean aBoolean162;

	@OriginalMember(owner = "client!ht", name = "Lf", descriptor = "Z")
	public boolean aBoolean163;

	@OriginalMember(owner = "client!ht", name = "Mf", descriptor = "I")
	private int anInt2995;

	@OriginalMember(owner = "client!ht", name = "Nf", descriptor = "Z")
	public boolean aBoolean164;

	@OriginalMember(owner = "client!ht", name = "Of", descriptor = "[Lclient!ao;")
	private Class13[] aClass13Array1;

	@OriginalMember(owner = "client!ht", name = "Pf", descriptor = "Z")
	private boolean aBoolean165;

	@OriginalMember(owner = "client!ht", name = "Rf", descriptor = "I")
	public int anInt2997;

	@OriginalMember(owner = "client!ht", name = "Tf", descriptor = "Z")
	private boolean aBoolean166;

	@OriginalMember(owner = "client!ht", name = "Wf", descriptor = "I")
	private int anInt3000;

	@OriginalMember(owner = "client!ht", name = "Xf", descriptor = "Lclient!or;")
	public Class37_Sub2 aClass37_Sub2_4;

	@OriginalMember(owner = "client!ht", name = "Zf", descriptor = "I")
	public int anInt3002;

	@OriginalMember(owner = "client!ht", name = "ag", descriptor = "Z")
	private boolean aBoolean167;

	@OriginalMember(owner = "client!ht", name = "bg", descriptor = "Lclient!or;")
	public Class37_Sub2 aClass37_Sub2_5;

	@OriginalMember(owner = "client!ht", name = "eg", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!ht", name = "gg", descriptor = "I")
	private int anInt3004;

	@OriginalMember(owner = "client!ht", name = "jg", descriptor = "I")
	private int anInt3006;

	@OriginalMember(owner = "client!ht", name = "kg", descriptor = "Z")
	public boolean aBoolean168;

	@OriginalMember(owner = "client!ht", name = "mg", descriptor = "Lclient!lr;")
	public Class150 aClass150_6;

	@OriginalMember(owner = "client!ht", name = "og", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!ht", name = "qg", descriptor = "I")
	public int anInt3009;

	@OriginalMember(owner = "client!ht", name = "sg", descriptor = "Lclient!bm;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ht", name = "ug", descriptor = "Lclient!qv;")
	public Class13_Sub1 aClass13_Sub1_5;

	@OriginalMember(owner = "client!ht", name = "vg", descriptor = "Lclient!mg;")
	private Class78_Sub1 aClass78_Sub1_1;

	@OriginalMember(owner = "client!ht", name = "wg", descriptor = "Lclient!nk;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!ht", name = "yg", descriptor = "I")
	private int anInt3011;

	@OriginalMember(owner = "client!ht", name = "zg", descriptor = "Lclient!bm;")
	private Interface1 anInterface1_3;

	@OriginalMember(owner = "client!ht", name = "Ag", descriptor = "I")
	private int anInt3012;

	@OriginalMember(owner = "client!ht", name = "Bg", descriptor = "Lclient!or;")
	public Class37_Sub2 aClass37_Sub2_6;

	@OriginalMember(owner = "client!ht", name = "Dg", descriptor = "Lclient!or;")
	public Class37_Sub2 aClass37_Sub2_7;

	@OriginalMember(owner = "client!ht", name = "Eg", descriptor = "Lclient!ds;")
	public Class58 aClass58_1;

	@OriginalMember(owner = "client!ht", name = "Fg", descriptor = "I")
	private int anInt3014;

	@OriginalMember(owner = "client!ht", name = "Gg", descriptor = "Z")
	private boolean aBoolean169;

	@OriginalMember(owner = "client!ht", name = "Hg", descriptor = "Z")
	private boolean aBoolean170;

	@OriginalMember(owner = "client!ht", name = "Ig", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!ht", name = "Kg", descriptor = "Lclient!qv;")
	public Class13_Sub1 aClass13_Sub1_6;

	@OriginalMember(owner = "client!ht", name = "Lg", descriptor = "F")
	private float aFloat59;

	@OriginalMember(owner = "client!ht", name = "Ng", descriptor = "Lclient!lr;")
	public Class150 aClass150_7;

	@OriginalMember(owner = "client!ht", name = "Rg", descriptor = "Lclient!cq;")
	private Class13_Sub1_Sub1 aClass13_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ht", name = "Sg", descriptor = "Lclient!aw;")
	public Class18_Sub1 aClass18_Sub1_4;

	@OriginalMember(owner = "client!ht", name = "Tg", descriptor = "Z")
	public boolean aBoolean172;

	@OriginalMember(owner = "client!ht", name = "Ug", descriptor = "Z")
	private boolean aBoolean173;

	@OriginalMember(owner = "client!ht", name = "Vg", descriptor = "Lclient!or;")
	public Class37_Sub2 aClass37_Sub2_8;

	@OriginalMember(owner = "client!ht", name = "Wg", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!ht", name = "ah", descriptor = "Z")
	public boolean aBoolean174;

	@OriginalMember(owner = "client!ht", name = "ch", descriptor = "Lclient!or;")
	public Class37_Sub2 aClass37_Sub2_9;

	@OriginalMember(owner = "client!ht", name = "dh", descriptor = "Z")
	private boolean aBoolean176;

	@OriginalMember(owner = "client!ht", name = "eh", descriptor = "I")
	private int anInt3020;

	@OriginalMember(owner = "client!ht", name = "fh", descriptor = "Lclient!ds;")
	public Class58 aClass58_2;

	@OriginalMember(owner = "client!ht", name = "gh", descriptor = "Lclient!or;")
	public Class37_Sub2 aClass37_Sub2_10;

	@OriginalMember(owner = "client!ht", name = "fd", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!ht", name = "le", descriptor = "I")
	public int anInt2972 = 128;

	@OriginalMember(owner = "client!ht", name = "ge", descriptor = "Lclient!rh;")
	private final Class200 aClass200_1 = new Class200();

	@OriginalMember(owner = "client!ht", name = "pe", descriptor = "Lclient!aw;")
	private final Class18_Sub1 aClass18_Sub1_1 = new Class18_Sub1();

	@OriginalMember(owner = "client!ht", name = "qe", descriptor = "Lclient!aw;")
	public final Class18_Sub1 aClass18_Sub1_2 = new Class18_Sub1();

	@OriginalMember(owner = "client!ht", name = "we", descriptor = "I")
	public int anInt2975 = 8;

	@OriginalMember(owner = "client!ht", name = "ve", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!ht", name = "xe", descriptor = "I")
	public int anInt2976 = 3;

	@OriginalMember(owner = "client!ht", name = "re", descriptor = "Lclient!wo;")
	private final Class266 aClass266_20 = new Class266();

	@OriginalMember(owner = "client!ht", name = "ze", descriptor = "I")
	private int anInt2977 = -1;

	@OriginalMember(owner = "client!ht", name = "Ae", descriptor = "[Lclient!ts;")
	private final Interface11[] anInterface11Array2 = new Interface11[4];

	@OriginalMember(owner = "client!ht", name = "ye", descriptor = "[Lclient!ts;")
	private final Interface11[] anInterface11Array1 = new Interface11[4];

	@OriginalMember(owner = "client!ht", name = "Ce", descriptor = "I")
	private int anInt2978 = -1;

	@OriginalMember(owner = "client!ht", name = "De", descriptor = "I")
	private int anInt2979 = -1;

	@OriginalMember(owner = "client!ht", name = "Fe", descriptor = "[Lclient!ts;")
	private final Interface11[] anInterface11Array3 = new Interface11[4];

	@OriginalMember(owner = "client!ht", name = "Ie", descriptor = "Lclient!wo;")
	private final Class266 aClass266_21;

	@OriginalMember(owner = "client!ht", name = "Ke", descriptor = "Lclient!wo;")
	private final Class266 aClass266_22;

	@OriginalMember(owner = "client!ht", name = "Le", descriptor = "Lclient!wo;")
	private final Class266 aClass266_23;

	@OriginalMember(owner = "client!ht", name = "Me", descriptor = "Lclient!wo;")
	private final Class266 aClass266_24;

	@OriginalMember(owner = "client!ht", name = "Ne", descriptor = "Lclient!wo;")
	private final Class266 aClass266_25;

	@OriginalMember(owner = "client!ht", name = "Oe", descriptor = "Lclient!wo;")
	private final Class266 aClass266_26;

	@OriginalMember(owner = "client!ht", name = "Pe", descriptor = "Lclient!wo;")
	private final Class266 aClass266_27;

	@OriginalMember(owner = "client!ht", name = "kf", descriptor = "[F")
	private final float[] aFloatArray19;

	@OriginalMember(owner = "client!ht", name = "mf", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!ht", name = "tf", descriptor = "I")
	public int anInt2992;

	@OriginalMember(owner = "client!ht", name = "zf", descriptor = "F")
	private float aFloat49;

	@OriginalMember(owner = "client!ht", name = "pf", descriptor = "I")
	public int anInt2989;

	@OriginalMember(owner = "client!ht", name = "of", descriptor = "[F")
	private final float[] aFloatArray20;

	@OriginalMember(owner = "client!ht", name = "qf", descriptor = "I")
	private int anInt2990;

	@OriginalMember(owner = "client!ht", name = "Ve", descriptor = "I")
	private int anInt2985;

	@OriginalMember(owner = "client!ht", name = "fg", descriptor = "I")
	private int anInt3003;

	@OriginalMember(owner = "client!ht", name = "Uf", descriptor = "[F")
	public final float[] aFloatArray21;

	@OriginalMember(owner = "client!ht", name = "Qf", descriptor = "I")
	private int anInt2996;

	@OriginalMember(owner = "client!ht", name = "cg", descriptor = "[F")
	private final float[] aFloatArray22;

	@OriginalMember(owner = "client!ht", name = "bf", descriptor = "I")
	public int bf;

	@OriginalMember(owner = "client!ht", name = "pg", descriptor = "I")
	public int anInt3008;

	@OriginalMember(owner = "client!ht", name = "tg", descriptor = "F")
	private float aFloat57;

	@OriginalMember(owner = "client!ht", name = "Af", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!ht", name = "hg", descriptor = "I")
	public int anInt3005;

	@OriginalMember(owner = "client!ht", name = "Xe", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!ht", name = "dg", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!ht", name = "Jg", descriptor = "I")
	public int anInt3015;

	@OriginalMember(owner = "client!ht", name = "Yf", descriptor = "I")
	private int anInt3001;

	@OriginalMember(owner = "client!ht", name = "Vf", descriptor = "I")
	private int anInt2999;

	@OriginalMember(owner = "client!ht", name = "ng", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!ht", name = "Qg", descriptor = "I")
	private int anInt3018;

	@OriginalMember(owner = "client!ht", name = "Mg", descriptor = "I")
	public int anInt3016;

	@OriginalMember(owner = "client!ht", name = "Zg", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!ht", name = "Yg", descriptor = "F")
	private float aFloat61;

	@OriginalMember(owner = "client!ht", name = "Cf", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!ht", name = "Cg", descriptor = "I")
	public int anInt3013;

	@OriginalMember(owner = "client!ht", name = "ig", descriptor = "[Lclient!pe;")
	private final Class1_Sub5[] aClass1_Sub5Array3;

	@OriginalMember(owner = "client!ht", name = "Sf", descriptor = "I")
	private int anInt2998;

	@OriginalMember(owner = "client!ht", name = "xg", descriptor = "[F")
	private final float[] aFloatArray23;

	@OriginalMember(owner = "client!ht", name = "Xg", descriptor = "I")
	private int anInt3019;

	@OriginalMember(owner = "client!ht", name = "lg", descriptor = "I")
	public int anInt3007;

	@OriginalMember(owner = "client!ht", name = "Ue", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!ht", name = "ef", descriptor = "I")
	public int anInt2986;

	@OriginalMember(owner = "client!ht", name = "jf", descriptor = "I")
	public int anInt2988;

	@OriginalMember(owner = "client!ht", name = "Te", descriptor = "Z")
	private boolean aBoolean151;

	@OriginalMember(owner = "client!ht", name = "Pg", descriptor = "I")
	private int anInt3017;

	@OriginalMember(owner = "client!ht", name = "ee", descriptor = "I")
	public final int anInt2969;

	@OriginalMember(owner = "client!ht", name = "X", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas3;

	@OriginalMember(owner = "client!ht", name = "Md", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!ht", name = "Ub", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ht", name = "G", descriptor = "J")
	private final long aLong91;

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!ht", name = "rg", descriptor = "I")
	public final int anInt3010;

	@OriginalMember(owner = "client!ht", name = "sf", descriptor = "Z")
	public boolean aBoolean158;

	@OriginalMember(owner = "client!ht", name = "Hf", descriptor = "Z")
	private boolean aBoolean161;

	@OriginalMember(owner = "client!ht", name = "hh", descriptor = "Z")
	public boolean aBoolean177;

	@OriginalMember(owner = "client!ht", name = "lf", descriptor = "Z")
	public boolean aBoolean156;

	@OriginalMember(owner = "client!ht", name = "bh", descriptor = "Z")
	private boolean aBoolean175;

	@OriginalMember(owner = "client!ht", name = "cf", descriptor = "Z")
	public boolean aBoolean153;

	@OriginalMember(owner = "client!ht", name = "Og", descriptor = "Z")
	private final boolean aBoolean171;

	@OriginalMember(owner = "client!ht", name = "ne", descriptor = "Lclient!eh;")
	public final Class67 aClass67_1;

	@OriginalMember(owner = "client!ht", name = "se", descriptor = "Lclient!fl;")
	public final Class86 aClass86_1;

	@OriginalMember(owner = "client!ht", name = "ke", descriptor = "Lclient!er;")
	private final Class75 aClass75_1;

	@OriginalMember(owner = "client!ht", name = "je", descriptor = "Lclient!he;")
	private Class1_Sub10_Sub1 aClass1_Sub10_Sub1_1;

	@OriginalMember(owner = "client!ht", name = "oe", descriptor = "Lclient!dv;")
	private final Class60 aClass60_1;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;ILclient!kj;)V")
	public Class109_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class138 arg4) {
		super(arg0, arg2);
		new Class42();
		new Class27(16);
		this.aClass266_21 = new Class266();
		this.aClass266_22 = new Class266();
		this.aClass266_23 = new Class266();
		this.aClass266_24 = new Class266();
		this.aClass266_25 = new Class266();
		this.aClass266_26 = new Class266();
		this.aClass266_27 = new Class266();
		this.aFloatArray19 = new float[4];
		this.aFloat47 = 1.0F;
		this.anInt2992 = 512;
		this.aFloat49 = 1.0F;
		this.anInt2989 = 50;
		this.aFloatArray20 = new float[16];
		this.anInt2990 = -1;
		this.anInt2985 = 8448;
		this.anInt3003 = 0;
		this.aFloatArray21 = new float[4];
		this.anInt2996 = 0;
		this.aFloatArray22 = new float[4];
		this.bf = 3584;
		this.anInt3008 = -1;
		this.aFloat57 = 0.0F;
		this.aFloat50 = -1.0F;
		this.anInt3005 = -1;
		this.aFloat43 = -1.0F;
		this.aFloat54 = 3000.0F;
		this.anInt3015 = 0;
		this.anInt3001 = 8448;
		this.anInt2999 = 0;
		this.aFloat55 = 1.0F;
		this.anInt3018 = -1;
		this.anInt3016 = 0;
		this.aFloat62 = 1.0F;
		this.aFloat61 = 1.0F;
		this.aFloat51 = 3584.0F;
		this.anInt3013 = -1;
		this.aClass1_Sub5Array3 = new Class1_Sub5[Static247.anInt3929];
		this.anInt2998 = 0;
		this.aFloatArray23 = new float[4];
		this.anInt3019 = 0;
		this.anInt3007 = 0;
		this.aFloat42 = 3584.0F;
		this.anInt2986 = 512;
		this.anInt2988 = 0;
		this.aBoolean151 = true;
		this.anInt3017 = 0;
		this.anInt2969 = arg3;
		this.aCanvas4 = this.aCanvas3 = arg1;
		try {
			if (Static124.aBoolean121 == null || !Static124.aBoolean121) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static124.aBoolean121 = Boolean.TRUE;
				} else {
					@Pc(246) String local246 = System.getProperty("os.name").toLowerCase();
					if (!local246.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local246.startsWith("linux") || local246.startsWith("sunos")) {
						System.load(arg4.method3213("libjaggl.so").toString());
					} else if (local246.startsWith("mac")) {
						System.load(arg4.method3213("libjaggl.jnilib").toString());
					} else if (local246.startsWith("win")) {
						System.load(arg4.method3213("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static124.aBoolean121 = Boolean.TRUE;
				}
			}
			if (Static124.aBoolean121 == null || !Static124.aBoolean121) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong90 = this.aLong91 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt2969);
			if (this.aLong91 == 0L) {
				throw new RuntimeException("");
			}
			this.method2560();
			@Pc(355) int local355 = this.method2563();
			if (local355 != 0) {
				throw new RuntimeException("");
			}
			this.anInt3010 = this.aBoolean163 ? 33639 : 5121;
			@Pc(381) int local381;
			if (this.aString20.indexOf("radeon") != -1) {
				local381 = 0;
				@Pc(383) boolean local383 = false;
				@Pc(385) boolean local385 = false;
				@Pc(394) String[] local394 = Static326.method4592(this.aString20.replace('/', ' '), ' ');
				for (@Pc(396) int local396 = 0; local396 < local394.length; local396++) {
					@Pc(402) String local402 = local394[local396];
					try {
						if (local402.length() > 0) {
							if (local402.charAt(0) == 'x' && local402.length() >= 3 && Static99.method1539(local402.substring(1, 3))) {
								local402 = local402.substring(1);
								local385 = true;
							}
							if (local402.equals("hd")) {
								local383 = true;
							} else {
								if (local402.startsWith("hd")) {
									local383 = true;
									local402 = local402.substring(2);
								}
								if (local402.length() >= 4 && Static99.method1539(local402.substring(0, 4))) {
									local381 = Static438.method5871(local402.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(468) Exception local468) {
					}
				}
				if (!local385 && !local383) {
					if (local381 >= 7000 && local381 <= 9250) {
						this.aBoolean158 = false;
					}
					if (local381 >= 7000 && local381 <= 7999) {
						this.aBoolean161 = false;
					}
				}
				if (!local383 || local381 < 4000) {
					this.aBoolean177 = false;
				}
				this.aBoolean156 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean175 = this.aBoolean161;
			}
			if (this.aString19.indexOf("intel") != -1) {
				this.aBoolean153 = false;
			}
			this.aBoolean171 = !this.aString19.equals("s3 graphics");
			if (this.aBoolean161) {
				try {
					@Pc(548) int[] local548 = new int[1];
					OpenGL.glGenBuffersARB(1, local548, 0);
				} catch (@Pc(554) Throwable local554) {
					throw new RuntimeException("");
				}
			}
			Static286.method4044(true);
			this.aBoolean150 = true;
			this.aClass67_1 = new Class67(this, super.anInterface7_9);
			this.method2587();
			this.aClass86_1 = new Class86(this);
			this.aClass75_1 = new Class75(this);
			if (this.aClass75_1.method1533()) {
				this.aClass1_Sub10_Sub1_1 = new Class1_Sub10_Sub1(this);
				if (!this.aClass1_Sub10_Sub1_1.method2217()) {
					this.aClass1_Sub10_Sub1_1.method2215();
					this.aClass1_Sub10_Sub1_1 = null;
				}
			}
			this.aClass60_1 = new Class60(this);
			this.method2538();
			this.method2530();
			OpenGL.glClear(16640);
			local381 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(633) Exception local633) {
					if (local381++ > 5) {
						throw new RuntimeException("");
					}
					Static67.method1189(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(651) Throwable local651) {
			local651.printStackTrace();
			this.method4694();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "()Z")
	@Override
	public boolean method4734() {
		return true;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BI)V")
	public void method2522(@OriginalArg(1) int arg0) {
		if (this.anInt2984 == arg0) {
			return;
		}
		@Pc(30) boolean local30;
		@Pc(34) byte local34;
		if (arg0 == 1) {
			local34 = 1;
			local30 = true;
		} else if (arg0 == 2) {
			local30 = false;
			local34 = 2;
		} else if (arg0 == 128) {
			local30 = true;
			local34 = 3;
		} else {
			local30 = false;
			local34 = 0;
		}
		if (!this.aBoolean167) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean167 = true;
		}
		if (local30 != this.aBoolean176) {
			if (local30) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean176 = local30;
		}
		if (local34 != this.anInt3004) {
			if (local34 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local34 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local34 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt3004 = local34;
		}
		this.anInt2984 = arg0;
		this.anInt2994 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZZ)V")
	public void method2524(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean162) {
			this.aBoolean162 = arg0;
			this.method2598();
		}
	}

	@OriginalMember(owner = "client!ht", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean154) {
			throw new RuntimeException("");
		}
		this.anInt3013 = arg2;
		this.anInt3007 = arg3;
		this.anInt2990 = arg1;
		this.anInt3009 = arg0;
		this.aClass60_1.aClass56_Sub8_1.method4909();
		this.method2576();
	}

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "(I)V")
	private void method2526() {
		if (this.anInt2994 == 1) {
			return;
		}
		this.method2566();
		this.method2561(false);
		this.method2599(false);
		this.method2577(false);
		this.method2597(false);
		this.method2578(null);
		this.method2532(-2);
		this.method2531(1);
		this.anInt2994 = 1;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	@Override
	public void method4679(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt2972 = arg0;
		this.aClass67_1.method1469();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZZZ)V")
	public void method2527(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (this.anInt3012 != arg0) {
			if (arg0 < 0) {
				this.method2547();
				this.method2578(null);
				this.method2531(0);
				if (!this.aBoolean154) {
					this.aClass60_1.method1384(0, arg1, arg2);
				}
			} else {
				@Pc(13) Class13_Sub1 local13 = this.aClass67_1.method1466(arg0);
				@Pc(19) Class151 local19 = super.anInterface7_9.method4836(arg0);
				if (local19.aByte55 == 0 && local19.aByte50 == 0) {
					this.method2547();
				} else {
					@Pc(40) int local40 = local19.aBoolean295 ? 64 : 128;
					@Pc(44) int local44 = local40 * 50;
					this.method2584((float) (this.anInt2974 % local44 * local19.aByte50) / (float) local44, (float) (local19.aByte55 * (this.anInt2974 % local44)) / (float) local44, 0.0F);
				}
				if (this.aBoolean154) {
					this.aClass60_1.method1384(3, arg1, arg2);
					this.method2578(local13);
					this.method2531(local19.anInt4297);
				} else {
					this.aClass60_1.method1384(local19.aByte52, arg1, arg2);
					this.aClass60_1.method1385(local19.aByte56, local19.anInt4299);
					if (!this.aClass60_1.method1383(local13, local19.anInt4297)) {
						this.method2578(local13);
						this.method2531(local19.anInt4297);
					}
				}
			}
			this.anInt3012 = arg0;
		}
		this.anInt2994 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBII)V")
	public void method2528(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "(I)V")
	private void method2529() {
		OpenGL.glViewport(this.anInt2999, this.anInt2998, this.anInt2856, this.anInt2808);
	}

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "(I)V")
	private void method2530() {
		if (this.aCanvas4 == null) {
			this.anInt2965 = this.anInt2853 = 0;
		} else {
			@Pc(21) Dimension local21 = this.aCanvas4.getSize();
			this.anInt2853 = local21.height;
			this.anInt2965 = local21.width;
		}
		if (this.anInterface11_2 == null) {
			this.anInt2856 = this.anInt2965;
			this.anInt2808 = this.anInt2853;
			this.method2529();
		}
		this.method2570();
		this.va();
	}

	@OriginalMember(owner = "client!ht", name = "aa", descriptor = "(IIIIII[BII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(41) float local41;
		if (this.aClass13_Sub1_Sub1_1 == null || arg2 > this.aClass13_Sub1_Sub1_1.anInt1238 || this.aClass13_Sub1_Sub1_1.anInt1239 < arg3) {
			this.aClass13_Sub1_Sub1_1 = Static96.method1521(arg3, arg6, this, arg2);
			this.aClass13_Sub1_Sub1_1.method1055(false, false);
			local41 = this.aClass13_Sub1_Sub1_1.aFloat28;
			local45 = this.aClass13_Sub1_Sub1_1.aFloat27;
		} else {
			this.aClass13_Sub1_Sub1_1.method1050(arg6, 6406, arg3, false, arg2);
			local41 = (float) arg2 * this.aClass13_Sub1_Sub1_1.aFloat28 / (float) this.aClass13_Sub1_Sub1_1.anInt1238;
			local45 = (float) arg3 * this.aClass13_Sub1_Sub1_1.aFloat27 / (float) this.aClass13_Sub1_Sub1_1.anInt1239;
		}
		this.method2589();
		this.method2578(this.aClass13_Sub1_Sub1_1);
		this.method2522(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2574(arg5);
		this.method2549(34165, 34165);
		this.method2528(34166, 768, 0);
		this.method2528(5890, 770, 2);
		this.method2545(34166, 0);
		this.method2545(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = (float) arg3 + local150;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local45, local41);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method2528(5890, 768, 0);
		this.method2528(34166, 770, 2);
		this.method2545(5890, 0);
		this.method2545(34166, 2);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method4680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class62 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class62_Sub2 local6 = (Class62_Sub2) arg5;
		@Pc(9) Class13_Sub1_Sub1 local9 = local6.aClass13_Sub1_Sub1_5;
		this.method2589();
		this.method2578(local6.aClass13_Sub1_Sub1_5);
		this.method2522(1);
		this.method2549(7681, 8448);
		this.method2528(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat28 / (float) local9.anInt1249;
		@Pc(46) float local46 = local9.aFloat27 / (float) local9.anInt1252;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method2528(5890, 768, 0);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI)V")
	public void method2531(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method2549(7681, 7681);
		} else if (arg0 == 0) {
			this.method2549(8448, 8448);
		} else if (arg0 == 2) {
			this.method2549(34165, 7681);
		} else if (arg0 == 3) {
			this.method2549(260, 8448);
		} else if (arg0 == 4) {
			this.method2549(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!ht", name = "O", descriptor = "(IIIII)V")
	@Override
	protected void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!ht", name = "r", descriptor = "()Z")
	@Override
	public boolean method4724() {
		return true;
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(II)V")
	public void method2532(@OriginalArg(0) int arg0) {
		this.method2583(arg0, true);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLclient!ts;)V")
	public void method2533(@OriginalArg(1) Interface11 arg0) {
		if (this.anInt2979 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2979 >= 0) {
			this.anInterface11Array2[this.anInt2979].method3511();
		}
		this.anInterface11_1 = this.anInterface11Array2[++this.anInt2979] = arg0;
		this.anInterface11_1.method3512();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZIILclient!jaggl/memory/NativeBuffer;I)Lclient!bm;")
	public Interface1 method2534(@OriginalArg(1) int arg0, @OriginalArg(3) NativeBuffer arg1, @OriginalArg(4) int arg2) {
		return (Interface1) (this.aBoolean161 ? new Class141_Sub1(this, arg0, arg1, arg2, false) : new Class59_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(Z)V")
	private void method2535() {
		if (this.anInt3011 != 2) {
			this.anInt3011 = 2;
			this.method2571();
			this.method2553();
			this.anInt2994 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "(I)Lclient!il;")
	public Class13_Sub4 method2536() {
		return this.aClass78_Sub1_1 == null ? null : this.aClass78_Sub1_1.method3277();
	}

	@OriginalMember(owner = "client!ht", name = "da", descriptor = "(IIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2526();
		this.method2522(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ht", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3009 = arg0;
		this.aBoolean154 = true;
		this.anInt3013 = arg2;
		this.anInt3007 = arg3;
		this.anInt2990 = arg1;
		this.aClass60_1.method1384(3, false, false);
		this.aClass60_1.aClass56_Sub8_1.method4909();
		this.method2576();
		this.method2592();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(FI)V")
	public void method2537(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat49) {
			this.aFloat49 = arg0;
			if (this.anInt3011 == 3) {
				this.method2582();
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)V")
	private void method2538() {
		this.method2532(-2);
		for (@Pc(14) int local14 = this.anInt2983 - 1; local14 >= 0; local14--) {
			this.method2564(local14);
			this.method2578(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method2549(8448, 8448);
		this.method2528(34168, 770, 2);
		this.method2547();
		this.anInt2984 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt3004 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean176 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean167 = true;
		this.method2561(true);
		this.method2599(true);
		this.method2577(true);
		this.method2597(true);
		this.method2570();
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
		@Pc(123) float[] local123 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(125) int local125 = 0; local125 < 8; local125++) {
			@Pc(131) int local131 = local125 + 16384;
			OpenGL.glLightfv(local131, 4608, local123, 0);
			OpenGL.glLightf(local131, 4615, 0.0F);
			OpenGL.glLightf(local131, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt3018 = this.anInt3008 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)V")
	public synchronized void method2539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg0);
		local8.aLong227 = arg1;
		this.aClass266_23.method5998(local8);
	}

	@OriginalMember(owner = "client!ht", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		this.anInt2976 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt2976++;
		}
		this.anInt2975 = 0x1 << this.anInt2976;
	}

	@OriginalMember(owner = "client!ht", name = "FA", descriptor = "()I")
	@Override
	public int FA() {
		return this.anInt2982 + this.anInt2981 + this.anInt2980;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(FFFFI)V")
	public void method2540(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static184.aFloatArray24[1] = arg1;
		Static184.aFloatArray24[0] = arg3;
		Static184.aFloatArray24[2] = arg2;
		Static184.aFloatArray24[3] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static184.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!ht", name = "q", descriptor = "()V")
	@Override
	public void method4722() {
		if (this.aClass1_Sub10_Sub1_1 != null && this.aClass1_Sub10_Sub1_1.method2209()) {
			this.aClass75_1.method1535(this.aClass1_Sub10_Sub1_1);
			this.aClass67_1.method1469();
		}
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(B)V")
	public void method2541() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ht", name = "y", descriptor = "()Z")
	@Override
	public boolean method4744() {
		return this.aClass1_Sub10_Sub1_1 != null && (this.anInt2969 <= 1 || this.aBoolean170);
	}

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "()Z")
	@Override
	public boolean method4729() {
		if (this.aClass1_Sub10_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass1_Sub10_Sub1_1.method2209()) {
			if (!this.aClass75_1.method1537(this.aClass1_Sub10_Sub1_1)) {
				return false;
			}
			this.aClass67_1.method1469();
		}
		return true;
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(II)V")
	public synchronized void method2542(@OriginalArg(1) int arg0) {
		@Pc(15) Class1 local15 = new Class1();
		local15.aLong227 = arg0;
		this.aClass266_26.method5998(local15);
	}

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "(I)V")
	private void method2543() {
		if (this.aFloat60 == 0.0F) {
			this.aFloatArray20[10] = this.aFloat59;
			this.aFloatArray20[14] = this.aFloat52;
		} else {
			@Pc(27) float local27 = this.aFloat54 / (this.aFloat60 + this.aFloat54);
			@Pc(31) float local31 = local27 * local27;
			@Pc(47) float local47 = (1.0F - local27) * -this.aFloat52 * (1.0F - local27) / this.aFloat60;
			this.aFloatArray20[10] = this.aFloat59 + local47;
			this.aFloatArray20[14] = local31 * this.aFloat52;
		}
		this.aFloat42 = ((float) -this.bf + this.aFloatArray20[14]) / this.aFloatArray20[10];
		this.aFloat51 = (float) this.bf - this.aFloat60;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!aw;I)V")
	public void method2544(@OriginalArg(0) Class18_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method425(), 0);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!qb;)V")
	@Override
	public void method4702(@OriginalArg(0) Class185 arg0) {
		this.aClass200_1.method4809(arg0, this);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!gv;[Lclient!mp;Z)Lclient!oa;")
	@Override
	public Class129 method4719(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class159[] arg1) {
		return new Class129_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ht", name = "SA", descriptor = "(IIIIII)Z")
	@Override
	public boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass18_Sub1_3.aFloat8 + this.aClass18_Sub1_3.aFloat11 * (float) arg2 + (float) arg0 * this.aClass18_Sub1_3.aFloat9 + (float) arg1 * this.aClass18_Sub1_3.aFloat7;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass18_Sub1_3.aFloat8 + this.aClass18_Sub1_3.aFloat7 * (float) arg4 + (float) arg3 * this.aClass18_Sub1_3.aFloat9 + (float) arg5 * this.aClass18_Sub1_3.aFloat11;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt2989 > local28 && (float) this.anInt2989 > local59 || !(!(local28 > (float) this.bf) || !(local59 > (float) this.bf))) {
			return false;
		}
		@Pc(123) int local123 = (int) (((float) arg1 * this.aClass18_Sub1_3.aFloat15 + (float) arg0 * this.aClass18_Sub1_3.aFloat5 + this.aClass18_Sub1_3.aFloat10 * (float) arg2 + this.aClass18_Sub1_3.aFloat4) * (float) this.anInt2986 / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt2986 * ((float) arg5 * this.aClass18_Sub1_3.aFloat10 + (float) arg4 * this.aClass18_Sub1_3.aFloat15 + this.aClass18_Sub1_3.aFloat5 * (float) arg3 + this.aClass18_Sub1_3.aFloat4) / local59);
		if ((float) local123 < this.aFloat44 && (float) local155 < this.aFloat44 || (float) local123 > this.aFloat48 && this.aFloat48 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt2992 * (this.aClass18_Sub1_3.aFloat6 + this.aClass18_Sub1_3.aFloat13 * (float) arg1 + this.aClass18_Sub1_3.aFloat12 * (float) arg0 + (float) arg2 * this.aClass18_Sub1_3.aFloat14) / local28);
			@Pc(245) int local245 = (int) ((this.aClass18_Sub1_3.aFloat14 * (float) arg5 + this.aClass18_Sub1_3.aFloat13 * (float) arg4 + this.aClass18_Sub1_3.aFloat12 * (float) arg3 + this.aClass18_Sub1_3.aFloat6) * (float) this.anInt2992 / local59);
			return (!((float) local213 < this.aFloat58) || !((float) local245 < this.aFloat58)) && (!(this.aFloat45 < (float) local213) || !(this.aFloat45 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!ht", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		@Pc(6) int local6 = this.anInt3000;
		this.anInt3000 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "()Z")
	@Override
	public boolean method4703() {
		return true;
	}

	@OriginalMember(owner = "client!ht", name = "S", descriptor = "()V")
	@Override
	public void S() {
		this.aBoolean154 = false;
		this.aClass60_1.method1384(0, false, false);
		this.method2576();
		this.method2592();
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(IBII)V")
	public void method2545(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(B)V")
	private void method2546() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "()V")
	@Override
	public void method4696() {
		this.method2597(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ht", name = "JA", descriptor = "(II)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2989 == arg0 && this.bf == arg1) {
			return;
		}
		this.bf = arg1;
		this.anInt2989 = arg0;
		this.method2580();
		this.method2576();
		if (this.anInt3011 == 3) {
			this.method2582();
		} else if (this.anInt3011 == 2) {
			this.method2571();
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4707(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas3 == arg0) {
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

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "(Z)V")
	private void method2547() {
		if (this.aBoolean169) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean169 = false;
		}
	}

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "()V")
	@Override
	public void method4740() {
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BII)V")
	public synchronized void method2548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg0);
		local8.aLong227 = arg1;
		this.aClass266_25.method5998(local8);
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(III)V")
	public void method2549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2995 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(26) boolean local26 = false;
		if (this.anInt3001 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local26 = true;
			this.anInt3001 = arg0;
		}
		if (arg1 != this.anInt2985) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt2985 = arg1;
			local26 = true;
		}
		if (local26) {
			this.anInt2994 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
	@Override
	public void method4682(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ht", name = "o", descriptor = "(FF)V")
	@Override
	public void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat54 == arg0 && arg1 == this.aFloat60) {
			return;
		}
		this.aFloat54 = arg0;
		this.aFloat60 = arg1;
		this.method2543();
		if (this.anInt3011 == 3) {
			this.method2582();
		} else if (this.anInt3011 == 2) {
			this.method2571();
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZI)V")
	public synchronized void method2550(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg1);
		local8.aLong227 = arg0;
		this.aClass266_22.method5998(local8);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!bm;)V")
	public void method2551(@OriginalArg(1) Interface1 arg0) {
		if (this.anInterface1_3 != arg0) {
			if (this.aBoolean161) {
				OpenGL.glBindBufferARB(34962, arg0.method3255());
			}
			this.anInterface1_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "()Z")
	@Override
	public boolean method4706() {
		return true;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class80 method4714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class80_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "()I")
	@Override
	public int g() {
		@Pc(6) int local6 = this.anInt2987;
		this.anInt2987 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "()Z")
	@Override
	public boolean method4721() {
		return this.aClass60_1.method1382();
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)V")
	@Override
	public void method4725(@OriginalArg(0) int arg0) {
		this.method2560();
	}

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "(II)I")
	public int method2552(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ht", name = "o", descriptor = "()Z")
	@Override
	public boolean method4716() {
		return true;
	}

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "()Z")
	@Override
	public boolean method4712() {
		return true;
	}

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "(I)V")
	private void method2553() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass18_Sub1_3.method425(), 0);
		if (this.aBoolean154) {
			this.aClass60_1.aClass56_Sub8_1.method4909();
		}
		this.method2603();
		this.method2556();
	}

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "(I)V")
	public void method2554() {
		if (this.anInt2994 == 8) {
			return;
		}
		this.method2535();
		this.method2561(true);
		this.method2577(true);
		this.method2597(true);
		this.method2522(1);
		this.method2531(0);
		this.anInt2994 = 8;
	}

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "(ILclient!ea;II)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class62_Sub2 local6 = (Class62_Sub2) arg1;
		@Pc(9) Class13_Sub1_Sub1 local9 = local6.aClass13_Sub1_Sub1_5;
		this.method2589();
		this.method2578(local6.aClass13_Sub1_Sub1_5);
		this.method2522(1);
		this.method2549(7681, 8448);
		this.method2528(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat28 / (float) local9.anInt1249;
		@Pc(46) float local46 = local9.aFloat27 / (float) local9.anInt1252;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt3019 - arg2) * local39, local46 * (float) (this.anInt3017 - arg3));
		OpenGL.glVertex2i(this.anInt3019, this.anInt3017);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3019 - arg2), (float) (this.anInt2996 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3019, this.anInt2996);
		OpenGL.glTexCoord2f((float) (this.anInt3003 - arg2) * local39, local46 * (float) (this.anInt2996 - arg3));
		OpenGL.glVertex2i(this.anInt3003, this.anInt2996);
		OpenGL.glTexCoord2f((float) (this.anInt3003 - arg2) * local39, local46 * (float) (this.anInt3017 - arg3));
		OpenGL.glVertex2i(this.anInt3003, this.anInt3017);
		OpenGL.glEnd();
		this.method2528(5890, 768, 0);
	}

	@OriginalMember(owner = "client!ht", name = "w", descriptor = "()F")
	@Override
	public float w() {
		return this.aFloat60;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI[BII)Lclient!bm;")
	public Interface1 method2555(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		return (Interface1) (this.aBoolean161 && (!arg0 || this.aBoolean175) ? new Class141_Sub1(this, arg1, arg2, arg3, arg0) : new Class59_Sub1(this, arg1, arg2, arg3));
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "()Z")
	@Override
	public boolean method4686() {
		return false;
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(B)V")
	private void method2556() {
		@Pc(15) int local15;
		for (local15 = 0; local15 < this.anInt3014; local15++) {
			@Pc(22) Class1_Sub5 local22 = this.aClass1_Sub5Array3[local15];
			@Pc(27) int local27 = local15 + 16386;
			Static424.aFloatArray38[0] = local22.method3333();
			Static424.aFloatArray38[1] = local22.method3326();
			Static424.aFloatArray38[2] = local22.method3325();
			Static424.aFloatArray38[3] = 1.0F;
			OpenGL.glLightfv(local27, 4611, Static424.aFloatArray38, 0);
			@Pc(61) int local61 = local22.method3331();
			@Pc(67) float local67 = local22.method3328() / 255.0F;
			Static424.aFloatArray38[2] = (float) (local61 & 0xFF) * local67;
			Static424.aFloatArray38[1] = (float) (local61 >> 8 & 0xFF) * local67;
			Static424.aFloatArray38[0] = local67 * (float) (local61 >> 16 & 0xFF);
			OpenGL.glLightfv(local27, 4609, Static424.aFloatArray38, 0);
			OpenGL.glLightf(local27, 4617, 1.0F / (float) (local22.method3327() * local22.method3327()));
			OpenGL.glEnable(local27);
		}
		while (this.anInt3020 > local15) {
			OpenGL.glDisable(local15 + 16386);
			local15++;
		}
		this.anInt3020 = this.anInt3014;
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt2989;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4747() {
	}

	@OriginalMember(owner = "client!ht", name = "la", descriptor = "()F")
	@Override
	public float la() {
		return this.aFloat54;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "([Lclient!c;Lclient!qb;Lclient!ia;[Lclient!nh;I)V")
	@Override
	public void method4688(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) Class39_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method4718(arg0, arg2, arg3, arg4);
		this.method4702(arg1);
	}

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "(B)V")
	private void method2557() {
		OpenGL.glDepthMask(this.aBoolean166 && this.aBoolean151);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIIF)Lclient!pe;")
	@Override
	public Class1_Sub5 method4692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub5_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "()V")
	@Override
	protected void method4694() {
		for (@Pc(6) Class1 local6 = this.aClass266_20.method6000(); local6 != null; local6 = this.aClass266_20.method5994()) {
			((Class1_Sub23_Sub1) local6).method5418();
		}
		if (this.aClass75_1 != null) {
			this.aClass75_1.method1529();
		}
		if (this.anOpenGL1 != null) {
			this.method2546();
			@Pc(40) Enumeration local40 = this.aHashtable1.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable1.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean150) {
			Static304.method4357(true);
			this.aBoolean150 = false;
		}
	}

	@OriginalMember(owner = "client!ht", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3008 == arg0 && this.anInt3005 == arg1 && arg2 == this.anInt2988) {
			return;
		}
		this.anInt3005 = arg1;
		this.anInt2988 = arg2;
		this.anInt3008 = arg0;
		if (this.aBoolean154) {
			return;
		}
		this.method2576();
		this.method2592();
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)I")
	@Override
	public int method4710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "(I)V")
	public void method2559() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ht", name = "q", descriptor = "(I)V")
	private void method2560() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static67.method1189(1000L);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZ)V")
	public void method2561(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean159) {
			this.aBoolean159 = arg0;
			this.method2592();
			this.anInt2994 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "(II)V")
	public synchronized void method2562(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub13 local17 = new Class1_Sub13(arg0);
		this.aClass266_24.method5998(local17);
	}

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "(B)I")
	private int method2563() {
		this.aString19 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString20 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString19.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString19.indexOf("brian paul") != -1 || this.aString19.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(47) String local47 = OpenGL.glGetString(7938);
		@Pc(55) String[] local55 = Static326.method4592(local47.replace('.', ' '), ' ');
		if (local55.length >= 2) {
			try {
				@Pc(65) int local65 = Static438.method5871(local55[0]);
				@Pc(71) int local71 = Static438.method5871(local55[1]);
				this.anInt2991 = local71 + local65 * 10;
			} catch (@Pc(80) NumberFormatException local80) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt2991 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(121) int[] local121 = new int[1];
		OpenGL.glGetIntegerv(34018, local121, 0);
		this.anInt2983 = local121[0];
		OpenGL.glGetIntegerv(34929, local121, 0);
		this.anInt2993 = local121[0];
		OpenGL.glGetIntegerv(34930, local121, 0);
		this.anInt3006 = local121[0];
		if (this.anInt2983 < 2 || this.anInt2993 < 2 || this.anInt3006 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean163 = NativeStream.b();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean161 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean165 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean174 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean157 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean160 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean158 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean156 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean164 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean177 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean172 = false;
		this.aBoolean153 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean155 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean168 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean170 = this.aBoolean168 & this.aBoolean155;
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IB)V")
	public void method2564(@OriginalArg(0) int arg0) {
		if (this.anInt2995 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt2995 = arg0;
		}
	}

	@OriginalMember(owner = "client!ht", name = "B", descriptor = "()Z")
	@Override
	public boolean method4754() {
		return true;
	}

	@OriginalMember(owner = "client!ht", name = "r", descriptor = "(I)V")
	private void method2565() {
		if (this.anInt3011 != 3) {
			this.anInt3011 = 3;
			this.method2582();
			this.method2553();
			this.anInt2994 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "()Z")
	@Override
	public boolean method4748() {
		return false;
	}

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "(I)V")
	private void method2566() {
		if (this.anInt3011 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt2856 > 0 && this.anInt2808 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt2856, (double) this.anInt2808, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt2994 &= 0xFFFFFFE7;
		this.anInt3011 = 1;
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4731(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas3 == arg0) {
			local5 = this.aLong91;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable1.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas4) {
			this.method2530();
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIB)V")
	public void method2567(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II[BZI)Lclient!nk;")
	public Interface8 method2568(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2) {
		return (Interface8) (this.aBoolean161 && (!arg2 || this.aBoolean175) ? new Class141_Sub2(this, 5123, arg1, arg0, arg2) : new Class59_Sub2(this, 5123, arg1, arg0));
	}

	@OriginalMember(owner = "client!ht", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt3019 = 0;
		this.anInt3003 = this.anInt2856;
		this.anInt3017 = 0;
		this.anInt2996 = this.anInt2808;
		OpenGL.glDisable(3089);
		this.method2573();
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "()Z")
	@Override
	public boolean method4687() {
		return this.aClass1_Sub10_Sub1_1 != null && this.aClass1_Sub10_Sub1_1.method2209();
	}

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "()Lclient!ia;")
	@Override
	public Class18 method4715() {
		return new Class18_Sub1();
	}

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "(I)V")
	public void method2569() {
		if (this.anInt2994 == 16) {
			return;
		}
		this.method2565();
		this.method2561(true);
		this.method2577(true);
		this.method2597(true);
		this.method2522(1);
		this.method2531(0);
		this.anInt2994 = 16;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)I")
	@Override
	public int method4699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "(I)V")
	public void method2570() {
		if (this.anInt3011 != 0) {
			this.anInt2994 &= 0xFFFFFFE0;
			this.anInt3011 = 0;
		}
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
	@Override
	public void method4708(@OriginalArg(0) int arg0) {
		this.method2546();
	}

	@OriginalMember(owner = "client!ht", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		this.method2522(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4691(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static204.aFloat67 = arg0;
		Static231.aFloat76 = arg2;
		Static283.aFloat79 = arg1;
	}

	@OriginalMember(owner = "client!ht", name = "v", descriptor = "(I)V")
	private void method2571() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray20, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V")
	@Override
	public void method4717(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class136 method4750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class136_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "(B)V")
	public void method2572() {
		if (this.anInt2994 == 4) {
			return;
		}
		this.method2566();
		this.method2561(false);
		this.method2599(false);
		this.method2577(false);
		this.method2597(false);
		this.method2532(-2);
		this.method2522(1);
		this.method2531(0);
		this.anInt2994 = 4;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!mp;Z)Lclient!f;")
	@Override
	public Class80 method4684(@OriginalArg(0) Class159 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt4573 * arg0.anInt4569];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray57 == null) {
			for (local21 = 0; local21 < arg0.anInt4569; local21++) {
				for (local25 = 0; local25 < arg0.anInt4573; local25++) {
					@Pc(83) int local83 = arg0.anIntArray369[arg0.aByteArray58[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt4569; local21++) {
				for (local25 = 0; local25 < arg0.anInt4573; local25++) {
					local12[local16++] = arg0.anIntArray369[arg0.aByteArray58[local14] & 0xFF] | arg0.aByteArray57[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(123) Class80 local123 = this.method4739(local12, arg0.anInt4573, arg0.anInt4573, arg0.anInt4569);
		local123.ka(arg0.anInt4568, arg0.anInt4572, arg0.anInt4570, arg0.anInt4571);
		return local123;
	}

	@OriginalMember(owner = "client!ht", name = "Z", descriptor = "(IIII)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < this.anInt3003) {
			this.anInt3003 = arg2;
		}
		if (arg3 < this.anInt2996) {
			this.anInt2996 = arg3;
		}
		if (this.anInt3017 < arg1) {
			this.anInt3017 = arg1;
		}
		if (arg0 > this.anInt3019) {
			this.anInt3019 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method2573();
		this.method2594();
	}

	@OriginalMember(owner = "client!ht", name = "w", descriptor = "(I)V")
	private void method2573() {
		this.aFloat44 = this.anInt3019 - this.anInt3015;
		this.aFloat45 = this.anInt2996 - this.anInt3016;
		this.aFloat48 = this.anInt3003 - this.anInt3015;
		this.aFloat58 = this.anInt3017 - this.anInt3016;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!pv;Lclient!pv;FLclient!pv;)Lclient!pv;")
	@Override
	public Class78 method4735(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class78 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean164 && this.aBoolean153 && this.aBoolean155) {
			@Pc(18) Class78_Sub1_Sub2 local18 = null;
			@Pc(21) Class78_Sub1 local21 = (Class78_Sub1) arg0;
			@Pc(24) Class78_Sub1 local24 = (Class78_Sub1) arg1;
			@Pc(28) Class13_Sub4 local28 = local21.method3277();
			@Pc(32) Class13_Sub4 local32 = local24.method3277();
			if (local28 != null && local32 != null) {
				@Pc(51) int local51 = local28.anInt3214 <= local32.anInt3214 ? local32.anInt3214 : local28.anInt3214;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class78_Sub1_Sub2) {
					@Pc(63) Class78_Sub1_Sub2 local63 = (Class78_Sub1_Sub2) arg3;
					if (local63.method3279() == local51) {
						local18 = local63;
					}
				}
				if (local18 == null) {
					local18 = new Class78_Sub1_Sub2(this, local51);
				}
				if (local18.method3278(arg2, local32, local28)) {
					return local18;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(IB)V")
	public void method2574(@OriginalArg(0) int arg0) {
		Static184.aFloatArray24[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static184.aFloatArray24[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static184.aFloatArray24[3] = (float) (arg0 >>> 24) / 255.0F;
		Static184.aFloatArray24[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static184.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!c;Lclient!qb;Lclient!ia;Lclient!nh;I)V")
	@Override
	public void method4736(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) Class39_Sub7 arg3) {
		arg0.method4230(arg2, arg3, 0);
		this.method4702(arg1);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass75_1.method1532(arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!ts;)V")
	public void method2575(@OriginalArg(1) Interface11 arg0) {
		if (this.anInt2979 < 0 || arg0 != this.anInterface11Array2[this.anInt2979]) {
			throw new RuntimeException();
		}
		this.anInterface11Array2[this.anInt2979--] = null;
		arg0.method3511();
		if (this.anInt2979 >= 0) {
			this.anInterface11_1 = this.anInterface11Array2[this.anInt2979];
			this.anInterface11_1.method3512();
		} else {
			this.anInterface11_1 = null;
		}
	}

	@OriginalMember(owner = "client!ht", name = "NA", descriptor = "(IIIIII)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method2526();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method2522(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean165) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean165) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "(I)V")
	private void method2576() {
		@Pc(52) int local52;
		if (this.aBoolean154) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local52 = this.anInt2990;
		} else {
			this.aFloat53 = (float) (this.bf - this.anInt2988) - this.aFloat57;
			this.aFloat46 = this.aFloat53 - (float) this.anInt3005 * this.aFloat61;
			if (this.aFloat46 < (float) this.anInt2989) {
				this.aFloat46 = this.anInt2989;
			}
			OpenGL.glFogf(2915, this.aFloat46);
			OpenGL.glFogf(2916, this.aFloat53);
			local52 = this.anInt3008;
		}
		Static184.aFloatArray24[0] = (float) (local52 & 0xFF0000) / 1.671168E7F;
		Static184.aFloatArray24[2] = (float) (local52 & 0xFF) / 255.0F;
		Static184.aFloatArray24[1] = (float) (local52 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static184.aFloatArray24, 0);
		if (this.aBoolean154) {
			this.aClass60_1.aClass56_Sub8_1.method4908();
		}
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4752(@OriginalArg(0) Canvas arg0) {
		this.aCanvas4 = null;
		this.aLong90 = 0L;
		if (arg0 == null || arg0 == this.aCanvas3) {
			this.aCanvas4 = this.aCanvas3;
			this.aLong90 = this.aLong91;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable1.get(arg0);
			this.aLong90 = local26;
			this.aCanvas4 = arg0;
		}
		if (this.aCanvas4 == null || this.aLong90 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong90);
		this.method2530();
	}

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "()Lclient!ia;")
	@Override
	public Class18 method4709() {
		return this.aClass18_Sub1_1;
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(IZ)V")
	public void method2577(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean152 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt2994 &= 0xFFFFFFE0;
		this.aBoolean152 = arg0;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLclient!ao;)V")
	public void method2578(@OriginalArg(1) Class13 arg0) {
		@Pc(20) Class13 local20 = this.aClass13Array1[this.anInt2995];
		if (arg0 != local20) {
			if (arg0 == null) {
				OpenGL.glDisable(local20.anInt3207);
			} else {
				if (local20 == null) {
					OpenGL.glEnable(arg0.anInt3207);
				} else if (arg0.anInt3207 != local20.anInt3207) {
					OpenGL.glDisable(local20.anInt3207);
					OpenGL.glEnable(arg0.anInt3207);
				}
				OpenGL.glBindTexture(arg0.anInt3207, arg0.method2746());
			}
			this.aClass13Array1[this.anInt2995] = arg0;
		}
		this.anInt2994 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ht", name = "y", descriptor = "(I)V")
	private void method2579() {
		Static184.aFloatArray24[2] = this.aFloat62 * this.aFloat56;
		Static184.aFloatArray24[0] = this.aFloat55 * this.aFloat56;
		Static184.aFloatArray24[3] = 1.0F;
		Static184.aFloatArray24[1] = this.aFloat47 * this.aFloat56;
		OpenGL.glLightModelfv(2899, Static184.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4681(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4704();
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method4705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2526();
		this.method2522(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "(Z)V")
	private void method2580() {
		@Pc(12) float[] local12 = this.aFloatArray20;
		@Pc(24) float local24 = (float) (this.anInt2989 * -this.anInt3015) / (float) this.anInt2986;
		@Pc(39) float local39 = (float) (this.anInt2989 * (this.anInt2856 - this.anInt3015)) / (float) this.anInt2986;
		@Pc(50) float local50 = (float) (this.anInt2989 * this.anInt3016) / (float) this.anInt2992;
		@Pc(65) float local65 = (float) (this.anInt2989 * (this.anInt3016 - this.anInt2808)) / (float) this.anInt2992;
		if (local24 == local39 || local50 == local65) {
			local12[2] = 0.0F;
			local12[15] = 1.0F;
			local12[13] = 0.0F;
			local12[0] = 1.0F;
			local12[5] = 1.0F;
			local12[9] = 0.0F;
			local12[10] = 1.0F;
			local12[11] = 0.0F;
			local12[3] = 0.0F;
			local12[7] = 0.0F;
			local12[1] = 0.0F;
			local12[4] = 0.0F;
			local12[6] = 0.0F;
			local12[12] = 0.0F;
			local12[8] = 0.0F;
			local12[14] = 0.0F;
		} else {
			@Pc(79) float local79 = (float) this.anInt2989 * 2.0F;
			local12[1] = 0.0F;
			local12[13] = 0.0F;
			local12[3] = 0.0F;
			local12[0] = local79 / (local39 - local24);
			local12[15] = 0.0F;
			local12[6] = 0.0F;
			local12[5] = local79 / (local50 - local65);
			local12[12] = 0.0F;
			local12[11] = -1.0F;
			local12[14] = this.aFloat52 = -(local79 * (float) this.bf) / (float) (this.bf - this.anInt2989);
			local12[4] = 0.0F;
			local12[8] = (local39 + local24) / (-local24 + local39);
			local12[7] = 0.0F;
			local12[10] = this.aFloat59 = (float) -(this.anInt2989 + this.bf) / (float) (this.bf - this.anInt2989);
			local12[2] = 0.0F;
			local12[9] = (local50 + local65) / (local50 - local65);
		}
		this.method2543();
	}

	@OriginalMember(owner = "client!ht", name = "pa", descriptor = "(IIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2808 < arg3) {
			arg3 = this.anInt2808;
		}
		if (arg2 > this.anInt2856) {
			arg2 = this.anInt2856;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt2996 = arg3;
		this.anInt3019 = arg0;
		this.anInt3017 = arg1;
		this.anInt3003 = arg2;
		OpenGL.glEnable(3089);
		this.method2573();
		this.method2594();
	}

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "()V")
	@Override
	public void method4704() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(BLclient!ts;)V")
	public void method2581(@OriginalArg(1) Interface11 arg0) {
		if (this.anInt2977 < 0 || arg0 != this.anInterface11Array3[this.anInt2977]) {
			throw new RuntimeException();
		}
		this.anInterface11Array3[this.anInt2977--] = null;
		arg0.method3515();
		if (this.anInt2977 >= 0) {
			this.anInterface11_2 = this.anInterface11Array3[this.anInt2977];
			this.anInterface11_2.method3514();
		} else {
			this.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "(I)V")
	private void method2582() {
		@Pc(15) float local15 = this.aFloat49 * (float) -this.anInt3015 / (float) this.anInt2986;
		@Pc(27) float local27 = this.aFloat49 * (float) -this.anInt3016 / (float) this.anInt2992;
		@Pc(42) float local42 = this.aFloat49 * (float) (this.anInt2856 - this.anInt3015) / (float) this.anInt2986;
		@Pc(57) float local57 = this.aFloat49 * (float) (this.anInt2808 - this.anInt3016) / (float) this.anInt2992;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local57 != local27) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) ((float) this.anInt2989 - this.aFloat60), (double) ((float) this.bf - this.aFloat60));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class62 method4746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static163.method2621(arg0, this, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method4738(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class1_Sub13 local19;
		while (!this.aClass266_22.method5996()) {
			local19 = (Class1_Sub13) this.aClass266_22.method5999();
			Static62.anIntArray85[local7++] = (int) local19.aLong227;
			this.anInt2981 -= local19.anInt2277;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static62.anIntArray85, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static62.anIntArray85, 0);
			local7 = 0;
		}
		while (!this.aClass266_23.method5996()) {
			local19 = (Class1_Sub13) this.aClass266_23.method5999();
			Static62.anIntArray85[local7++] = (int) local19.aLong227;
			this.anInt2982 -= local19.anInt2277;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static62.anIntArray85, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static62.anIntArray85, 0);
			local7 = 0;
		}
		while (!this.aClass266_24.method5996()) {
			local19 = (Class1_Sub13) this.aClass266_24.method5999();
			Static62.anIntArray85[local7++] = local19.anInt2277;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static62.anIntArray85, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static62.anIntArray85, 0);
			local7 = 0;
		}
		while (!this.aClass266_25.method5996()) {
			local19 = (Class1_Sub13) this.aClass266_25.method5999();
			Static62.anIntArray85[local7++] = (int) local19.aLong227;
			this.anInt2980 -= local19.anInt2277;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static62.anIntArray85, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static62.anIntArray85, 0);
		}
		while (!this.aClass266_21.method5996()) {
			local19 = (Class1_Sub13) this.aClass266_21.method5999();
			OpenGL.glDeleteLists((int) local19.aLong227, local19.anInt2277);
		}
		@Pc(212) Class1 local212;
		while (!this.aClass266_26.method5996()) {
			local212 = this.aClass266_26.method5999();
			OpenGL.glDeleteProgramARB((int) local212.aLong227);
		}
		while (!this.aClass266_27.method5996()) {
			local212 = this.aClass266_27.method5999();
			OpenGL.glDeleteObjectARB(local212.aLong227);
		}
		while (!this.aClass266_21.method5996()) {
			local19 = (Class1_Sub13) this.aClass266_21.method5999();
			OpenGL.glDeleteLists((int) local19.aLong227, local19.anInt2277);
		}
		this.aClass67_1.method1468();
		if (this.FA() > 100663296 && this.aLong92 + 60000L < Static101.method1557()) {
			System.gc();
			this.aLong92 = Static101.method1557();
		}
		this.anInt2974 = local11;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIZ)V")
	public void method2583(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		this.method2527(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(FBFF)V")
	private void method2584(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean169) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg0, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean169 = true;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!wk;IIII)Lclient!c;")
	@Override
	public Class37 method4697(@OriginalArg(0) Class264 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class37_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method4705(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "(II)I")
	public int method2585(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "(Lclient!ia;)V")
	@Override
	public void m(@OriginalArg(0) Class18 arg0) {
		this.aClass18_Sub1_3 = (Class18_Sub1) arg0;
		this.aClass18_Sub1_4.method427(this.aClass18_Sub1_3);
		if (this.anInt3011 != 1) {
			this.method2553();
		}
	}

	@OriginalMember(owner = "client!ht", name = "ua", descriptor = "(F)V")
	@Override
	public void ua(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat56) {
			this.aFloat56 = arg0;
			this.method2579();
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIILclient!nk;I)V")
	public void method2586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface8 arg2) {
		@Pc(7) int local7 = arg2.method5610();
		@Pc(14) int local14 = arg0 * this.method2552(local7);
		this.method2604(arg2);
		OpenGL.glDrawElements(4, arg1, local7, arg2.method5607() + (long) local14);
	}

	@OriginalMember(owner = "client!ht", name = "A", descriptor = "(I)V")
	private void method2587() {
		this.aClass18_Sub1_3 = new Class18_Sub1();
		this.aClass18_Sub1_4 = new Class18_Sub1();
		this.aClass13Array1 = new Class13[this.anInt2983];
		this.aClass13_Sub1_4 = new Class13_Sub1(this, 3553, 6408, 1, 1);
		this.aClass13_Sub1_6 = new Class13_Sub1(this, 3553, 6408, 1, 1);
		this.aClass13_Sub1_5 = new Class13_Sub1(this, 3553, 6408, 1, 1);
		this.aClass37_Sub2_1 = new Class37_Sub2(this);
		this.aClass37_Sub2_9 = new Class37_Sub2(this);
		this.aClass37_Sub2_8 = new Class37_Sub2(this);
		this.aClass37_Sub2_6 = new Class37_Sub2(this);
		this.aClass37_Sub2_4 = new Class37_Sub2(this);
		this.aClass37_Sub2_10 = new Class37_Sub2(this);
		this.aClass37_Sub2_7 = new Class37_Sub2(this);
		this.aClass37_Sub2_2 = new Class37_Sub2(this);
		this.aClass37_Sub2_5 = new Class37_Sub2(this);
		this.aClass37_Sub2_3 = new Class37_Sub2(this);
		if (this.aBoolean153) {
			this.aClass150_6 = new Class150(this);
			this.aClass150_7 = new Class150(this);
		}
	}

	@OriginalMember(owner = "client!ht", name = "v", descriptor = "()V")
	@Override
	public void method4737() {
		if (!this.aBoolean171 || this.anInt2856 <= 0 || this.anInt2808 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt3019;
		@Pc(25) int local25 = this.anInt3003;
		@Pc(28) int local28 = this.anInt3017;
		@Pc(31) int local31 = this.anInt2996;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method2570();
		this.method2561(false);
		this.method2599(false);
		this.method2577(false);
		this.method2597(false);
		this.method2578(null);
		this.method2532(-2);
		this.method2531(1);
		this.method2522(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt2856, this.anInt2808, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.pa(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(IIIIII)Lclient!pv;")
	@Override
	public Class78 method4695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean164 ? new Class78_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZLclient!ts;)V")
	public void method2588(@OriginalArg(1) Interface11 arg0) {
		if (this.anInt2977 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2977 >= 0) {
			this.anInterface11Array3[this.anInt2977].method3515();
		}
		this.anInterface11_2 = this.anInterface11Array3[++this.anInt2977] = arg0;
		this.anInterface11_2.method3514();
	}

	@OriginalMember(owner = "client!ht", name = "C", descriptor = "()I")
	@Override
	public int method4755() {
		return 4;
	}

	@OriginalMember(owner = "client!ht", name = "B", descriptor = "(I)V")
	public void method2589() {
		if (this.anInt2994 == 2) {
			return;
		}
		this.method2566();
		this.method2561(false);
		this.method2599(false);
		this.method2577(false);
		this.method2597(false);
		this.method2532(-2);
		this.anInt2994 = 2;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IFF)V")
	public void method2590(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat57 = arg0;
		this.aFloat61 = arg1;
		if (!this.aBoolean154) {
			this.method2576();
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!ts;I)V")
	public void method2591(@OriginalArg(0) Interface11 arg0) {
		if (this.aBoolean155) {
			this.method2575(arg0);
			this.method2581(arg0);
		} else if (this.anInt2978 >= 0 && arg0 == this.anInterface11Array1[this.anInt2978]) {
			this.anInterface11Array1[this.anInt2978--] = null;
			arg0.method3510();
			if (this.anInt2978 < 0) {
				this.anInterface11_1 = this.anInterface11_2 = null;
			} else {
				this.anInterface11_1 = this.anInterface11_2 = this.anInterface11Array1[this.anInt2978];
				this.anInterface11_1.method3513();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)Lclient!l;")
	@Override
	public Class1_Sub23 method4690() {
		@Pc(8) Class1_Sub23_Sub1 local8 = new Class1_Sub23_Sub1(78643200);
		this.aClass266_20.method5998(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "()Z")
	@Override
	public boolean method4732() {
		return true;
	}

	@OriginalMember(owner = "client!ht", name = "W", descriptor = "()I")
	@Override
	public int W() {
		return this.bf;
	}

	@OriginalMember(owner = "client!ht", name = "C", descriptor = "(I)V")
	private void method2592() {
		if (this.aBoolean159 && this.anInt3005 >= 0 | this.aBoolean154) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4728(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas3) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "(II)I")
	public int method2593(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ht", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3015 = arg0;
		this.anInt2992 = arg3;
		this.anInt3016 = arg1;
		this.anInt2986 = arg2;
		this.method2580();
		this.method2573();
		if (this.anInt3011 == 3) {
			this.method2582();
		} else if (this.anInt3011 == 2) {
			this.method2571();
		}
	}

	@OriginalMember(owner = "client!ht", name = "D", descriptor = "(I)V")
	private void method2594() {
		if (this.anInt3003 >= this.anInt3019 && this.anInt2996 >= this.anInt3017) {
			OpenGL.glScissor(this.anInt2999 + this.anInt3019, this.anInt2808 + this.anInt2998 + -this.anInt2996, this.anInt3003 - this.anInt3019, this.anInt2996 - this.anInt3017);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ht", name = "XA", descriptor = "(IFFFFF)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt3018 != arg0;
		if (local11 || this.aFloat43 != arg1 || arg2 != this.aFloat50) {
			this.aFloat43 = arg1;
			this.anInt3018 = arg0;
			this.aFloat50 = arg2;
			if (local11) {
				this.aFloat47 = (float) (this.anInt3018 & 0xFF00) / 65280.0F;
				this.aFloat55 = (float) (this.anInt3018 & 0xFF0000) / 1.671168E7F;
				this.aFloat62 = (float) (this.anInt3018 & 0xFF) / 255.0F;
				this.method2579();
			}
			this.method2601();
		}
		if (this.aFloatArray19[0] == arg3 && this.aFloatArray19[1] == arg4 && arg5 == this.aFloatArray19[2]) {
			return;
		}
		this.aFloatArray19[1] = arg4;
		this.aFloatArray19[0] = arg3;
		this.aFloatArray19[2] = arg5;
		this.aFloatArray23[0] = -arg3;
		this.aFloatArray23[1] = -arg4;
		this.aFloatArray23[2] = -arg5;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray21[1] = arg4 * local138;
		this.aFloatArray21[0] = local138 * arg3;
		this.aFloatArray21[2] = arg5 * local138;
		this.aFloatArray22[1] = -this.aFloatArray21[1];
		this.aFloatArray22[0] = -this.aFloatArray21[0];
		this.aFloatArray22[2] = -this.aFloatArray21[2];
		this.method2603();
		this.anInt2997 = (int) (arg5 * 256.0F / arg4);
		this.anInt3002 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I[Lclient!pe;)V")
	@Override
	public void method4726(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass1_Sub5Array3[local3] = arg1[local3];
		}
		this.anInt3014 = arg0;
		if (this.anInt3011 != 1) {
			this.method2556();
		}
	}

	@OriginalMember(owner = "client!ht", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2526();
		this.method2522(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!nh;I)V")
	@Override
	public void method4718(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) Class39_Sub7[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method4230(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBI)V")
	public void method2595(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2998 = arg1;
		this.anInt2999 = arg0;
		this.method2529();
		this.method2594();
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "()V")
	@Override
	public void method4693() {
		this.aClass75_1.method1531();
	}

	@OriginalMember(owner = "client!ht", name = "IA", descriptor = "(IIII)[I")
	@Override
	public int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt2808 - local12 - arg1, arg2, 1, 32993, this.anInt3010, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(ZI)V")
	public void method2597(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean166 != arg0) {
			this.aBoolean166 = arg0;
			this.method2557();
			this.anInt2994 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ht", name = "E", descriptor = "(I)V")
	private void method2598() {
		if (this.aBoolean173 && !this.aBoolean162) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZB)V")
	public void method2599(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean173) {
			this.aBoolean173 = arg0;
			this.method2598();
			this.anInt2994 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(ILclient!ts;)V")
	public void method2600(@OriginalArg(1) Interface11 arg0) {
		if (this.aBoolean155) {
			this.method2533(arg0);
			this.method2588(arg0);
		} else if (this.anInt2978 < 3) {
			if (this.anInt2978 >= 0) {
				this.anInterface11Array1[this.anInt2978].method3510();
			}
			this.anInterface11_1 = this.anInterface11_2 = this.anInterface11Array1[++this.anInt2978] = arg0;
			this.anInterface11_1.method3513();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ht", name = "F", descriptor = "(I)V")
	private void method2601() {
		Static184.aFloatArray24[1] = this.aFloat47 * this.aFloat43;
		Static184.aFloatArray24[0] = this.aFloat43 * this.aFloat55;
		Static184.aFloatArray24[2] = this.aFloat62 * this.aFloat43;
		Static184.aFloatArray24[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static184.aFloatArray24, 0);
		Static184.aFloatArray24[3] = 1.0F;
		Static184.aFloatArray24[1] = -this.aFloat50 * this.aFloat47;
		Static184.aFloatArray24[0] = -this.aFloat50 * this.aFloat55;
		Static184.aFloatArray24[2] = this.aFloat62 * -this.aFloat50;
		OpenGL.glLightfv(16385, 4609, Static184.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(Z)V")
	@Override
	public void method4733(@OriginalArg(0) boolean arg0) {
		this.aBoolean151 = arg0;
		this.method2557();
	}

	@OriginalMember(owner = "client!ht", name = "ia", descriptor = "(III[I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg1 * this.aClass18_Sub1_3.aFloat7 + (float) arg0 * this.aClass18_Sub1_3.aFloat9 + this.aClass18_Sub1_3.aFloat11 * (float) arg2 + this.aClass18_Sub1_3.aFloat8;
		if ((float) this.anInt2989 > local28 || (float) this.bf < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt2986 * (this.aClass18_Sub1_3.aFloat4 + this.aClass18_Sub1_3.aFloat10 * (float) arg2 + (float) arg1 * this.aClass18_Sub1_3.aFloat15 + this.aClass18_Sub1_3.aFloat5 * (float) arg0) / local28);
		@Pc(117) int local117 = (int) ((this.aClass18_Sub1_3.aFloat6 + this.aClass18_Sub1_3.aFloat14 * (float) arg2 + this.aClass18_Sub1_3.aFloat13 * (float) arg1 + (float) arg0 * this.aClass18_Sub1_3.aFloat12) * (float) this.anInt2992 / local28);
		if ((float) local85 >= this.aFloat44 && (float) local85 <= this.aFloat48 && (float) local117 >= this.aFloat58 && this.aFloat45 >= (float) local117) {
			arg3[1] = (int) ((float) local117 - this.aFloat58);
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat44);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class80 method4739(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class80_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BJ)V")
	public synchronized void method2602(@OriginalArg(1) long arg0) {
		@Pc(13) Class1 local13 = new Class1();
		local13.aLong227 = arg0;
		this.aClass266_27.method5998(local13);
	}

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "([I)V")
	@Override
	public void u(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt2996;
		arg0[2] = this.anInt3003;
		arg0[0] = this.anInt3019;
		arg0[1] = this.anInt3017;
	}

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "(B)V")
	public void method2603() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray21, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!pv;)V")
	@Override
	public void method4711(@OriginalArg(0) Class78 arg0) {
		this.aClass78_Sub1_1 = (Class78_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!nk;)V")
	public void method2604(@OriginalArg(1) Interface8 arg0) {
		if (arg0 != this.anInterface8_1) {
			if (this.aBoolean161) {
				OpenGL.glBindBufferARB(34963, arg0.method5608());
			}
			this.anInterface8_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "()Z")
	@Override
	public boolean method4701() {
		return this.aBoolean165 && (!this.method4687() || this.aBoolean170);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!ds;BLclient!ds;Lclient!ds;Lclient!ds;)V")
	public void method2605(@OriginalArg(0) Class58 arg0, @OriginalArg(2) Class58 arg1, @OriginalArg(3) Class58 arg2, @OriginalArg(4) Class58 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method2551(arg1.anInterface1_1);
			OpenGL.glVertexPointer(arg1.aByte10, arg1.aShort22, this.anInterface1_3.method3254(), this.anInterface1_3.method3253() + (long) arg1.aByte11);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method2551(arg3.anInterface1_1);
			OpenGL.glNormalPointer(arg3.aShort22, this.anInterface1_3.method3254(), this.anInterface1_3.method3253() + (long) arg3.aByte11);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method2551(arg2.anInterface1_1);
			OpenGL.glColorPointer(arg2.aByte10, arg2.aShort22, this.anInterface1_3.method3254(), this.anInterface1_3.method3253() + (long) arg2.aByte11);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method2551(arg0.anInterface1_1);
			OpenGL.glTexCoordPointer(arg0.aByte10, arg0.aShort22, this.anInterface1_3.method3254(), this.anInterface1_3.method3253() + (long) arg0.aByte11);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method4730(@OriginalArg(0) Class1_Sub23 arg0) {
		this.aNativeHeap1 = ((Class1_Sub23_Sub1) arg0).aNativeHeap2;
		if (this.anInterface1_2 != null) {
			return;
		}
		@Pc(16) Class1_Sub1_Sub2 local16 = new Class1_Sub1_Sub2(80);
		if (this.aBoolean163) {
			local16.method4149(-1.0F);
			local16.method4149(-1.0F);
			local16.method4149(0.0F);
			local16.method4149(0.0F);
			local16.method4149(1.0F);
			local16.method4149(1.0F);
			local16.method4149(-1.0F);
			local16.method4149(0.0F);
			local16.method4149(1.0F);
			local16.method4149(1.0F);
			local16.method4149(1.0F);
			local16.method4149(1.0F);
			local16.method4149(0.0F);
			local16.method4149(1.0F);
			local16.method4149(0.0F);
			local16.method4149(-1.0F);
			local16.method4149(1.0F);
			local16.method4149(0.0F);
			local16.method4149(0.0F);
			local16.method4149(0.0F);
		} else {
			local16.method4148(-1.0F);
			local16.method4148(-1.0F);
			local16.method4148(0.0F);
			local16.method4148(0.0F);
			local16.method4148(1.0F);
			local16.method4148(1.0F);
			local16.method4148(-1.0F);
			local16.method4148(0.0F);
			local16.method4148(1.0F);
			local16.method4148(1.0F);
			local16.method4148(1.0F);
			local16.method4148(1.0F);
			local16.method4148(0.0F);
			local16.method4148(1.0F);
			local16.method4148(0.0F);
			local16.method4148(-1.0F);
			local16.method4148(1.0F);
			local16.method4148(0.0F);
			local16.method4148(0.0F);
			local16.method4148(0.0F);
		}
		this.anInterface1_2 = this.method2555(false, 20, local16.aByteArray66, local16.anInt5056);
		this.aClass58_1 = new Class58(this, this.anInterface1_2, 5126, 3, 0);
		this.aClass58_2 = new Class58(this, this.anInterface1_2, 5126, 2, 12);
		this.aClass200_1.method4815(this);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!aw;)V")
	public void method2606(@OriginalArg(1) Class18_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method425(), 0);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method2526();
		this.method2522(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean165) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean165) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(Z)V")
	@Override
	public void method4698(@OriginalArg(0) boolean arg0) {
	}
}
