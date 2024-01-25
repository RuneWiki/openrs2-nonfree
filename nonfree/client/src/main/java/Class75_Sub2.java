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

@OriginalClass("client!gk")
public final class Class75_Sub2 extends Class75 {

	@OriginalMember(owner = "client!gk", name = "hb", descriptor = "I")
	private int anInt2930;

	@OriginalMember(owner = "client!gk", name = "Ec", descriptor = "I")
	private int anInt3001;

	@OriginalMember(owner = "client!gk", name = "kd", descriptor = "I")
	public int anInt3032;

	@OriginalMember(owner = "client!gk", name = "ce", descriptor = "I")
	public int anInt3074;

	@OriginalMember(owner = "client!gk", name = "pe", descriptor = "I")
	public int anInt3079;

	@OriginalMember(owner = "client!gk", name = "te", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!gk", name = "ve", descriptor = "Lclient!ie;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!gk", name = "Ae", descriptor = "Lclient!ie;")
	private Interface6 anInterface6_2;

	@OriginalMember(owner = "client!gk", name = "Ce", descriptor = "I")
	public int anInt3084;

	@OriginalMember(owner = "client!gk", name = "De", descriptor = "I")
	public int anInt3085;

	@OriginalMember(owner = "client!gk", name = "Ee", descriptor = "I")
	private int anInt3086;

	@OriginalMember(owner = "client!gk", name = "Me", descriptor = "Lclient!du;")
	public Class31_Sub1 aClass31_Sub1_1;

	@OriginalMember(owner = "client!gk", name = "Ne", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!gk", name = "Oe", descriptor = "Lclient!jh;")
	public Class122 aClass122_1;

	@OriginalMember(owner = "client!gk", name = "Pe", descriptor = "Lclient!hh;")
	private Interface5 anInterface5_3;

	@OriginalMember(owner = "client!gk", name = "Qe", descriptor = "Z")
	public boolean aBoolean218;

	@OriginalMember(owner = "client!gk", name = "Re", descriptor = "Z")
	public boolean aBoolean219;

	@OriginalMember(owner = "client!gk", name = "Ue", descriptor = "Lclient!du;")
	public Class31_Sub1 aClass31_Sub1_2;

	@OriginalMember(owner = "client!gk", name = "Ze", descriptor = "Z")
	public boolean aBoolean221;

	@OriginalMember(owner = "client!gk", name = "af", descriptor = "[Lclient!rh;")
	private Class42[] aClass42Array1;

	@OriginalMember(owner = "client!gk", name = "df", descriptor = "Lclient!du;")
	public Class31_Sub1 aClass31_Sub1_3;

	@OriginalMember(owner = "client!gk", name = "ef", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!gk", name = "ff", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!gk", name = "gf", descriptor = "Z")
	private boolean aBoolean222;

	@OriginalMember(owner = "client!gk", name = "jf", descriptor = "F")
	private float aFloat32;

	@OriginalMember(owner = "client!gk", name = "kf", descriptor = "Z")
	private boolean aBoolean223;

	@OriginalMember(owner = "client!gk", name = "lf", descriptor = "Lclient!du;")
	public Class31_Sub1 aClass31_Sub1_4;

	@OriginalMember(owner = "client!gk", name = "mf", descriptor = "Z")
	private boolean aBoolean224;

	@OriginalMember(owner = "client!gk", name = "nf", descriptor = "Lclient!du;")
	public Class31_Sub1 aClass31_Sub1_5;

	@OriginalMember(owner = "client!gk", name = "rf", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!gk", name = "sf", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!gk", name = "tf", descriptor = "Z")
	private boolean aBoolean225;

	@OriginalMember(owner = "client!gk", name = "uf", descriptor = "Lclient!sr;")
	public Class42_Sub1 aClass42_Sub1_1;

	@OriginalMember(owner = "client!gk", name = "vf", descriptor = "Lclient!du;")
	public Class31_Sub1 aClass31_Sub1_6;

	@OriginalMember(owner = "client!gk", name = "wf", descriptor = "F")
	private float aFloat36;

	@OriginalMember(owner = "client!gk", name = "xf", descriptor = "I")
	private int anInt3094;

	@OriginalMember(owner = "client!gk", name = "zf", descriptor = "I")
	private int anInt3095;

	@OriginalMember(owner = "client!gk", name = "Df", descriptor = "Lclient!cw;")
	private Class42_Sub1_Sub1 aClass42_Sub1_Sub1_3;

	@OriginalMember(owner = "client!gk", name = "Gf", descriptor = "I")
	public int anInt3098;

	@OriginalMember(owner = "client!gk", name = "Hf", descriptor = "Z")
	public boolean aBoolean228;

	@OriginalMember(owner = "client!gk", name = "If", descriptor = "F")
	private float aFloat38;

	@OriginalMember(owner = "client!gk", name = "Jf", descriptor = "Lclient!jh;")
	public Class122 aClass122_2;

	@OriginalMember(owner = "client!gk", name = "Lf", descriptor = "Z")
	private boolean aBoolean229;

	@OriginalMember(owner = "client!gk", name = "Mf", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!gk", name = "Pf", descriptor = "I")
	private int anInt3101;

	@OriginalMember(owner = "client!gk", name = "Rf", descriptor = "Z")
	private boolean aBoolean230;

	@OriginalMember(owner = "client!gk", name = "Sf", descriptor = "Lclient!tp;")
	public Class225 aClass225_9;

	@OriginalMember(owner = "client!gk", name = "Uf", descriptor = "Z")
	public boolean aBoolean231;

	@OriginalMember(owner = "client!gk", name = "Vf", descriptor = "Z")
	public boolean aBoolean232;

	@OriginalMember(owner = "client!gk", name = "Wf", descriptor = "I")
	private int anInt3103;

	@OriginalMember(owner = "client!gk", name = "Xf", descriptor = "I")
	private int anInt3104;

	@OriginalMember(owner = "client!gk", name = "ag", descriptor = "Lclient!hh;")
	private Interface5 anInterface5_4;

	@OriginalMember(owner = "client!gk", name = "bg", descriptor = "I")
	public int anInt3105;

	@OriginalMember(owner = "client!gk", name = "eg", descriptor = "I")
	private int anInt3106;

	@OriginalMember(owner = "client!gk", name = "gg", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!gk", name = "hg", descriptor = "Z")
	private boolean aBoolean233;

	@OriginalMember(owner = "client!gk", name = "ig", descriptor = "Lclient!du;")
	public Class31_Sub1 aClass31_Sub1_7;

	@OriginalMember(owner = "client!gk", name = "jg", descriptor = "I")
	private int anInt3108;

	@OriginalMember(owner = "client!gk", name = "kg", descriptor = "Lclient!du;")
	public Class31_Sub1 aClass31_Sub1_8;

	@OriginalMember(owner = "client!gk", name = "lg", descriptor = "Lclient!du;")
	public Class31_Sub1 aClass31_Sub1_9;

	@OriginalMember(owner = "client!gk", name = "ng", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!gk", name = "og", descriptor = "Lclient!sr;")
	public Class42_Sub1 aClass42_Sub1_2;

	@OriginalMember(owner = "client!gk", name = "rg", descriptor = "I")
	private int anInt3111;

	@OriginalMember(owner = "client!gk", name = "sg", descriptor = "I")
	private int anInt3112;

	@OriginalMember(owner = "client!gk", name = "tg", descriptor = "Lclient!gl;")
	private Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!gk", name = "ug", descriptor = "I")
	public int anInt3113;

	@OriginalMember(owner = "client!gk", name = "wg", descriptor = "Lclient!sf;")
	public Class106_Sub2 aClass106_Sub2_3;

	@OriginalMember(owner = "client!gk", name = "xg", descriptor = "I")
	private int anInt3114;

	@OriginalMember(owner = "client!gk", name = "yg", descriptor = "Z")
	public boolean aBoolean234;

	@OriginalMember(owner = "client!gk", name = "Cg", descriptor = "Lclient!du;")
	public Class31_Sub1 aClass31_Sub1_10;

	@OriginalMember(owner = "client!gk", name = "Dg", descriptor = "Lclient!sf;")
	public Class106_Sub2 aClass106_Sub2_4;

	@OriginalMember(owner = "client!gk", name = "Fg", descriptor = "Z")
	private boolean aBoolean236;

	@OriginalMember(owner = "client!gk", name = "Hg", descriptor = "I")
	public int anInt3118;

	@OriginalMember(owner = "client!gk", name = "Ig", descriptor = "Lclient!cm;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!gk", name = "Kg", descriptor = "Z")
	private boolean aBoolean238;

	@OriginalMember(owner = "client!gk", name = "Lg", descriptor = "I")
	private int anInt3119;

	@OriginalMember(owner = "client!gk", name = "Ng", descriptor = "Z")
	public boolean aBoolean239;

	@OriginalMember(owner = "client!gk", name = "Pg", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!gk", name = "Qg", descriptor = "Z")
	private boolean aBoolean240;

	@OriginalMember(owner = "client!gk", name = "Sg", descriptor = "Lclient!sr;")
	public Class42_Sub1 aClass42_Sub1_3;

	@OriginalMember(owner = "client!gk", name = "Ug", descriptor = "Lclient!tp;")
	public Class225 aClass225_10;

	@OriginalMember(owner = "client!gk", name = "Vg", descriptor = "Z")
	public boolean aBoolean242;

	@OriginalMember(owner = "client!gk", name = "Wg", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!gk", name = "bh", descriptor = "I")
	private int anInt3123;

	@OriginalMember(owner = "client!gk", name = "ch", descriptor = "I")
	private int anInt3124;

	@OriginalMember(owner = "client!gk", name = "eb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!gk", name = "ge", descriptor = "I")
	public int anInt3076 = 128;

	@OriginalMember(owner = "client!gk", name = "he", descriptor = "Lclient!ic;")
	private final Class107 aClass107_1 = new Class107();

	@OriginalMember(owner = "client!gk", name = "le", descriptor = "Lclient!sf;")
	private final Class106_Sub2 aClass106_Sub2_1 = new Class106_Sub2();

	@OriginalMember(owner = "client!gk", name = "me", descriptor = "Lclient!sf;")
	public final Class106_Sub2 aClass106_Sub2_2 = new Class106_Sub2();

	@OriginalMember(owner = "client!gk", name = "oe", descriptor = "I")
	public int anInt3078 = 3;

	@OriginalMember(owner = "client!gk", name = "ne", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!gk", name = "se", descriptor = "I")
	public int anInt3080 = 8;

	@OriginalMember(owner = "client!gk", name = "re", descriptor = "Lclient!tu;")
	private final Class229 aClass229_15 = new Class229();

	@OriginalMember(owner = "client!gk", name = "we", descriptor = "[Lclient!ie;")
	private final Interface6[] anInterface6Array1 = new Interface6[4];

	@OriginalMember(owner = "client!gk", name = "xe", descriptor = "I")
	private int anInt3082 = -1;

	@OriginalMember(owner = "client!gk", name = "ue", descriptor = "I")
	private int anInt3081 = -1;

	@OriginalMember(owner = "client!gk", name = "ye", descriptor = "[Lclient!ie;")
	private final Interface6[] anInterface6Array2 = new Interface6[4];

	@OriginalMember(owner = "client!gk", name = "ze", descriptor = "I")
	private int anInt3083 = -1;

	@OriginalMember(owner = "client!gk", name = "Be", descriptor = "[Lclient!ie;")
	private final Interface6[] anInterface6Array3 = new Interface6[4];

	@OriginalMember(owner = "client!gk", name = "Fe", descriptor = "Lclient!tu;")
	private final Class229 aClass229_16;

	@OriginalMember(owner = "client!gk", name = "Ge", descriptor = "Lclient!tu;")
	private final Class229 aClass229_17;

	@OriginalMember(owner = "client!gk", name = "He", descriptor = "Lclient!tu;")
	private final Class229 aClass229_18;

	@OriginalMember(owner = "client!gk", name = "Ie", descriptor = "Lclient!tu;")
	private final Class229 aClass229_19;

	@OriginalMember(owner = "client!gk", name = "Je", descriptor = "Lclient!tu;")
	private final Class229 aClass229_20;

	@OriginalMember(owner = "client!gk", name = "Ke", descriptor = "Lclient!tu;")
	private final Class229 aClass229_21;

	@OriginalMember(owner = "client!gk", name = "Le", descriptor = "Lclient!tu;")
	private final Class229 aClass229_22;

	@OriginalMember(owner = "client!gk", name = "hf", descriptor = "I")
	private int anInt3091;

	@OriginalMember(owner = "client!gk", name = "Te", descriptor = "I")
	public int anInt3087;

	@OriginalMember(owner = "client!gk", name = "cf", descriptor = "I")
	public int anInt3090;

	@OriginalMember(owner = "client!gk", name = "Cf", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!gk", name = "Ef", descriptor = "I")
	public int anInt3097;

	@OriginalMember(owner = "client!gk", name = "yf", descriptor = "[F")
	public final float[] aFloatArray23;

	@OriginalMember(owner = "client!gk", name = "pf", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!gk", name = "of", descriptor = "I")
	public int anInt3092;

	@OriginalMember(owner = "client!gk", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!gk", name = "Yf", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!gk", name = "Of", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!gk", name = "Tf", descriptor = "F")
	private float aFloat40;

	@OriginalMember(owner = "client!gk", name = "fg", descriptor = "I")
	private int anInt3107;

	@OriginalMember(owner = "client!gk", name = "Ye", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!gk", name = "Qf", descriptor = "I")
	public int anInt3102;

	@OriginalMember(owner = "client!gk", name = "Bf", descriptor = "I")
	private int anInt3096;

	@OriginalMember(owner = "client!gk", name = "qg", descriptor = "[F")
	private final float[] aFloatArray25;

	@OriginalMember(owner = "client!gk", name = "Xe", descriptor = "I")
	public int anInt3089;

	@OriginalMember(owner = "client!gk", name = "vg", descriptor = "[F")
	private final float[] aFloatArray26;

	@OriginalMember(owner = "client!gk", name = "mg", descriptor = "I")
	private int anInt3109;

	@OriginalMember(owner = "client!gk", name = "Ag", descriptor = "I")
	private int anInt3115;

	@OriginalMember(owner = "client!gk", name = "Mg", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!gk", name = "Og", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!gk", name = "qf", descriptor = "I")
	public int anInt3093;

	@OriginalMember(owner = "client!gk", name = "Kf", descriptor = "I")
	private int anInt3099;

	@OriginalMember(owner = "client!gk", name = "Ve", descriptor = "F")
	private float aFloat28;

	@OriginalMember(owner = "client!gk", name = "Tg", descriptor = "I")
	private int anInt3120;

	@OriginalMember(owner = "client!gk", name = "cg", descriptor = "[F")
	private final float[] aFloatArray24;

	@OriginalMember(owner = "client!gk", name = "zg", descriptor = "[F")
	private final float[] aFloatArray27;

	@OriginalMember(owner = "client!gk", name = "Zf", descriptor = "F")
	private float aFloat42;

	@OriginalMember(owner = "client!gk", name = "dg", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!gk", name = "Nf", descriptor = "I")
	public int anInt3100;

	@OriginalMember(owner = "client!gk", name = "Rg", descriptor = "Z")
	private boolean aBoolean241;

	@OriginalMember(owner = "client!gk", name = "Eg", descriptor = "I")
	public int anInt3116;

	@OriginalMember(owner = "client!gk", name = "Xg", descriptor = "[Lclient!ve;")
	private final Class3_Sub23[] aClass3_Sub23Array1;

	@OriginalMember(owner = "client!gk", name = "Zg", descriptor = "I")
	private int anInt3121;

	@OriginalMember(owner = "client!gk", name = "Gg", descriptor = "I")
	public int anInt3117;

	@OriginalMember(owner = "client!gk", name = "ah", descriptor = "I")
	public int anInt3122;

	@OriginalMember(owner = "client!gk", name = "We", descriptor = "I")
	private int anInt3088;

	@OriginalMember(owner = "client!gk", name = "Tc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas4;

	@OriginalMember(owner = "client!gk", name = "P", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!gk", name = "je", descriptor = "I")
	public final int anInt3077;

	@OriginalMember(owner = "client!gk", name = "cc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!gk", name = "gb", descriptor = "J")
	private final long aLong84;

	@OriginalMember(owner = "client!gk", name = "qb", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!gk", name = "pg", descriptor = "I")
	public final int anInt3110;

	@OriginalMember(owner = "client!gk", name = "Af", descriptor = "Z")
	public boolean aBoolean226;

	@OriginalMember(owner = "client!gk", name = "Ff", descriptor = "Z")
	private boolean aBoolean227;

	@OriginalMember(owner = "client!gk", name = "Bg", descriptor = "Z")
	public boolean aBoolean235;

	@OriginalMember(owner = "client!gk", name = "dh", descriptor = "Z")
	public boolean aBoolean244;

	@OriginalMember(owner = "client!gk", name = "Yg", descriptor = "Z")
	private boolean aBoolean243;

	@OriginalMember(owner = "client!gk", name = "Se", descriptor = "Z")
	public boolean aBoolean220;

	@OriginalMember(owner = "client!gk", name = "Jg", descriptor = "Z")
	private final boolean aBoolean237;

	@OriginalMember(owner = "client!gk", name = "ie", descriptor = "Lclient!ch;")
	public final Class35 aClass35_1;

	@OriginalMember(owner = "client!gk", name = "qe", descriptor = "Lclient!dm;")
	public final Class55 aClass55_1;

	@OriginalMember(owner = "client!gk", name = "ke", descriptor = "Lclient!jf;")
	private final Class121 aClass121_1;

	@OriginalMember(owner = "client!gk", name = "ee", descriptor = "Lclient!rj;")
	private Class3_Sub17_Sub1 aClass3_Sub17_Sub1_1;

	@OriginalMember(owner = "client!gk", name = "fe", descriptor = "Lclient!me;")
	private final Class153 aClass153_1;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;ILclient!hs;)V")
	public Class75_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class103 arg4) {
		super(arg0, arg2);
		new Class248();
		new Class127(16);
		this.aClass229_16 = new Class229();
		this.aClass229_17 = new Class229();
		this.aClass229_18 = new Class229();
		this.aClass229_19 = new Class229();
		this.aClass229_20 = new Class229();
		this.aClass229_21 = new Class229();
		this.aClass229_22 = new Class229();
		this.anInt3091 = 0;
		this.anInt3087 = -1;
		this.anInt3090 = 3584;
		this.aFloat37 = 1.0F;
		this.anInt3097 = 0;
		this.aFloatArray23 = new float[4];
		this.aFloat33 = 3584.0F;
		this.anInt3092 = 512;
		this.bf = -1;
		this.aFloat41 = 3584.0F;
		this.aFloat39 = -1.0F;
		this.aFloat40 = 1.0F;
		this.anInt3107 = 0;
		this.aFloat29 = -1.0F;
		this.anInt3102 = 0;
		this.anInt3096 = -1;
		this.aFloatArray25 = new float[16];
		this.anInt3089 = 0;
		this.aFloatArray26 = new float[4];
		this.anInt3109 = 8448;
		this.anInt3115 = 8448;
		this.aFloat46 = 3000.0F;
		this.aFloat47 = 1.0F;
		this.anInt3093 = -1;
		this.anInt3099 = 0;
		this.aFloat28 = 1.0F;
		this.anInt3120 = 0;
		this.aFloatArray24 = new float[4];
		this.aFloatArray27 = new float[4];
		this.aFloat42 = 0.0F;
		this.aFloat43 = 1.0F;
		this.anInt3100 = 512;
		this.aBoolean241 = true;
		this.anInt3116 = 0;
		this.aClass3_Sub23Array1 = new Class3_Sub23[Static71.anInt1613];
		this.anInt3121 = 0;
		this.anInt3117 = -1;
		this.anInt3122 = 50;
		this.anInt3088 = 0;
		this.aCanvas3 = this.aCanvas4 = arg1;
		this.anInt3077 = arg3;
		try {
			if (Static13.aBoolean17 == null || !Static13.aBoolean17) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static13.aBoolean17 = Boolean.TRUE;
				} else {
					@Pc(251) String local251 = System.getProperty("os.name").toLowerCase();
					if (!local251.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local251.startsWith("linux") || local251.startsWith("sunos")) {
						System.load(arg4.method2821("libjaggl.so").toString());
					} else if (local251.startsWith("mac")) {
						System.load(arg4.method2821("libjaggl.jnilib").toString());
					} else if (local251.startsWith("win")) {
						System.load(arg4.method2821("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static13.aBoolean17 = Boolean.TRUE;
				}
			}
			if (Static13.aBoolean17 == null || !Static13.aBoolean17) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong85 = this.aLong84 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt3077);
			if (this.aLong84 == 0L) {
				throw new RuntimeException("");
			}
			this.method2439();
			@Pc(348) int local348 = this.method2472();
			if (local348 != 0) {
				throw new RuntimeException("");
			}
			this.anInt3110 = this.aBoolean228 ? 33639 : 5121;
			@Pc(375) int local375;
			if (this.aString29.indexOf("radeon") != -1) {
				local375 = 0;
				@Pc(377) boolean local377 = false;
				@Pc(379) boolean local379 = false;
				@Pc(388) String[] local388 = Static365.method5139(' ', this.aString29.replace('/', ' '));
				for (@Pc(390) int local390 = 0; local390 < local388.length; local390++) {
					@Pc(395) String local395 = local388[local390];
					try {
						if (local395.length() > 0) {
							if (local395.charAt(0) == 'x' && local395.length() >= 3 && Static179.method3046(local395.substring(1, 3))) {
								local395 = local395.substring(1);
								local379 = true;
							}
							if (local395.equals("hd")) {
								local377 = true;
							} else {
								if (local395.startsWith("hd")) {
									local395 = local395.substring(2);
									local377 = true;
								}
								if (local395.length() >= 4 && Static179.method3046(local395.substring(0, 4))) {
									local375 = Static110.method1873(local395.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(459) Exception local459) {
					}
				}
				if (!local379 && !local377) {
					if (local375 >= 7000 && local375 <= 9250) {
						this.aBoolean226 = false;
					}
					if (local375 >= 7000 && local375 <= 7999) {
						this.aBoolean227 = false;
					}
				}
				if (!local377 || local375 < 4000) {
					this.aBoolean235 = false;
				}
				this.aBoolean244 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean243 = this.aBoolean227;
			}
			if (this.aString28.indexOf("intel") != -1) {
				this.aBoolean220 = false;
			}
			this.aBoolean237 = !this.aString28.equals("s3 graphics");
			if (this.aBoolean227) {
				try {
					@Pc(541) int[] local541 = new int[1];
					OpenGL.glGenBuffersARB(1, local541, 0);
				} catch (@Pc(547) Throwable local547) {
					throw new RuntimeException("");
				}
			}
			Static58.method1177(true);
			this.aBoolean217 = true;
			this.aClass35_1 = new Class35(this, super.anInterface7_6);
			this.method2414();
			this.aClass55_1 = new Class55(this);
			this.aClass121_1 = new Class121(this);
			if (this.aClass121_1.method3129()) {
				this.aClass3_Sub17_Sub1_1 = new Class3_Sub17_Sub1(this);
				if (!this.aClass3_Sub17_Sub1_1.method4953()) {
					this.aClass3_Sub17_Sub1_1.method4937();
					this.aClass3_Sub17_Sub1_1 = null;
				}
			}
			this.aClass153_1 = new Class153(this);
			this.method2449();
			this.method2415();
			OpenGL.glClear(16640);
			local375 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(626) Exception local626) {
					if (local375++ > 5) {
						throw new RuntimeException("");
					}
					Static135.method2458(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(643) Throwable local643) {
			local643.printStackTrace();
			this.method2620();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
	private void method2402() {
		this.aFloat30 = this.anInt3088 - this.anInt3097;
		this.aFloat35 = this.anInt3099 - this.anInt3102;
		this.aFloat31 = this.anInt3121 - this.anInt3097;
		this.aFloat44 = this.anInt3091 - this.anInt3102;
	}

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "(I)V")
	private void method2403() {
		if (this.aBoolean225 && this.anInt3117 >= 0 | this.aBoolean232) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)I")
	@Override
	public int method2610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "(I)V")
	private void method2404() {
		Static101.aFloatArray16[1] = this.aFloat39 * this.aFloat47;
		Static101.aFloatArray16[0] = this.aFloat39 * this.aFloat43;
		Static101.aFloatArray16[2] = this.aFloat37 * this.aFloat39;
		Static101.aFloatArray16[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static101.aFloatArray16, 0);
		Static101.aFloatArray16[2] = -this.aFloat29 * this.aFloat37;
		Static101.aFloatArray16[0] = this.aFloat43 * -this.aFloat29;
		Static101.aFloatArray16[1] = -this.aFloat29 * this.aFloat47;
		Static101.aFloatArray16[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static101.aFloatArray16, 0);
	}

	@OriginalMember(owner = "client!gk", name = "NA", descriptor = "(IIIIII)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method2412();
		this.method2445(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean230) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean230) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!gk", name = "ia", descriptor = "(III[I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass106_Sub2_4.aFloat76 + this.aClass106_Sub2_4.aFloat80 * (float) arg2 + this.aClass106_Sub2_4.aFloat77 * (float) arg1 + (float) arg0 * this.aClass106_Sub2_4.aFloat81;
		if ((float) this.anInt3122 > local28 || local28 > (float) this.anInt3090) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) (((float) arg2 * this.aClass106_Sub2_4.aFloat79 + this.aClass106_Sub2_4.aFloat78 * (float) arg0 + this.aClass106_Sub2_4.aFloat82 * (float) arg1 + this.aClass106_Sub2_4.aFloat83) * (float) this.anInt3092 / local28);
		@Pc(117) int local117 = (int) (((float) arg1 * this.aClass106_Sub2_4.aFloat85 + this.aClass106_Sub2_4.aFloat87 * (float) arg0 + (float) arg2 * this.aClass106_Sub2_4.aFloat84 + this.aClass106_Sub2_4.aFloat86) * (float) this.anInt3100 / local28);
		if (this.aFloat31 <= (float) local85 && this.aFloat30 >= (float) local85 && (float) local117 >= this.aFloat44 && (float) local117 <= this.aFloat35) {
			arg3[1] = (int) ((float) local117 - this.aFloat44);
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat31);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(II)V")
	public void method2405(@OriginalArg(1) int arg0) {
		Static101.aFloatArray16[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static101.aFloatArray16[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static101.aFloatArray16[3] = (float) (arg0 >>> 24) / 255.0F;
		Static101.aFloatArray16[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static101.aFloatArray16, 0);
	}

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "(I)V")
	private void method2406() {
		if (this.aBoolean223) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean223 = false;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!ie;)V")
	public void method2407(@OriginalArg(1) Interface6 arg0) {
		if (this.anInt3081 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3081 >= 0) {
			this.anInterface6Array1[this.anInt3081].method3162();
		}
		this.anInterface6_1 = this.anInterface6Array1[++this.anInt3081] = arg0;
		this.anInterface6_1.method3157();
	}

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "(FF)V")
	@Override
	public void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat46 == arg0 && arg1 == this.aFloat34) {
			return;
		}
		this.aFloat34 = arg1;
		this.aFloat46 = arg0;
		this.method2475();
		if (this.anInt3108 == 3) {
			this.method2484();
		} else if (this.anInt3108 == 2) {
			this.method2447();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	public void method2408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3107 = arg0;
		this.anInt3120 = arg1;
		this.method2470();
		this.method2464();
	}

	@OriginalMember(owner = "client!gk", name = "la", descriptor = "()F")
	@Override
	public float la() {
		return this.aFloat46;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLclient!ie;)V")
	public void method2409(@OriginalArg(1) Interface6 arg0) {
		if (this.anInt3083 < 0 || arg0 != this.anInterface6Array3[this.anInt3083]) {
			throw new RuntimeException();
		}
		this.anInterface6Array3[this.anInt3083--] = null;
		arg0.method3161();
		if (this.anInt3083 < 0) {
			this.anInterface6_2 = null;
		} else {
			this.anInterface6_2 = this.anInterface6Array3[this.anInt3083];
			this.anInterface6_2.method3158();
		}
	}

	@OriginalMember(owner = "client!gk", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2412();
		this.method2445(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!cm;B)V")
	public void method2410(@OriginalArg(0) Interface1 arg0) {
		if (this.anInterface1_2 != arg0) {
			if (this.aBoolean227) {
				OpenGL.glBindBufferARB(34963, arg0.method5472());
			}
			this.anInterface1_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "(Lclient!ia;)V")
	@Override
	public void m(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub2_4 = (Class106_Sub2) arg0;
		this.aClass106_Sub2_3.method5109(this.aClass106_Sub2_4);
		if (this.anInt3108 != 1) {
			this.method2448();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[Lclient!ve;)V")
	@Override
	public void method2628(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub23[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass3_Sub23Array1[local3] = arg1[local3];
		}
		this.anInt3095 = arg0;
		if (this.anInt3108 != 1) {
			this.method2434();
		}
	}

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "(I)V")
	public void method2411() {
		if (this.anInt3104 == 16) {
			return;
		}
		this.method2476();
		this.method2451(true);
		this.method2485(true);
		this.method2467(true);
		this.method2445(1);
		this.method2424(0);
		this.anInt3104 = 16;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V")
	private void method2412() {
		if (this.anInt3104 == 1) {
			return;
		}
		this.method2428();
		this.method2451(false);
		this.method2482(false);
		this.method2485(false);
		this.method2467(false);
		this.method2456(null);
		this.method2440(-2);
		this.method2424(1);
		this.anInt3104 = 1;
	}

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "(I)V")
	public void method2413() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray23, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray27, 0);
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(Z)V")
	@Override
	public void method2592(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!uu;IIII)Lclient!c;")
	@Override
	public Class31 method2616(@OriginalArg(0) Class242 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class31_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "()V")
	@Override
	protected void method2620() {
		for (@Pc(4) Class3 local4 = this.aClass229_15.method5328(); local4 != null; local4 = this.aClass229_15.method5325()) {
			((Class3_Sub27_Sub1) local4).method4973();
		}
		if (this.aClass121_1 != null) {
			this.aClass121_1.method3131();
		}
		if (this.anOpenGL1 != null) {
			this.method2444();
			@Pc(37) Enumeration local37 = this.aHashtable1.keys();
			while (local37.hasMoreElements()) {
				@Pc(42) Canvas local42 = (Canvas) local37.nextElement();
				@Pc(48) Long local48 = (Long) this.aHashtable1.get(local42);
				this.anOpenGL1.releaseSurface(local42, local48);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean217) {
			Static153.method2715(true);
			this.aBoolean217 = false;
		}
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "()I")
	@Override
	public int method2584() {
		return 4;
	}

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "()V")
	@Override
	public void method2633() {
		this.aClass121_1.method3133();
	}

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "()F")
	@Override
	public float w() {
		return this.aFloat34;
	}

	@OriginalMember(owner = "client!gk", name = "Z", descriptor = "(IIII)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3091 < arg1) {
			this.anInt3091 = arg1;
		}
		if (this.anInt3099 > arg3) {
			this.anInt3099 = arg3;
		}
		if (this.anInt3088 > arg2) {
			this.anInt3088 = arg2;
		}
		if (arg0 > this.anInt3121) {
			this.anInt3121 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method2402();
		this.method2464();
	}

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "(I)V")
	private void method2414() {
		this.aClass106_Sub2_4 = new Class106_Sub2();
		this.aClass106_Sub2_3 = new Class106_Sub2();
		this.aClass42Array1 = new Class42[this.anInt3105];
		this.aClass42_Sub1_1 = new Class42_Sub1(this, 3553, 6408, 1, 1);
		this.aClass42_Sub1_2 = new Class42_Sub1(this, 3553, 6408, 1, 1);
		this.aClass42_Sub1_3 = new Class42_Sub1(this, 3553, 6408, 1, 1);
		this.aClass31_Sub1_1 = new Class31_Sub1(this);
		this.aClass31_Sub1_7 = new Class31_Sub1(this);
		this.aClass31_Sub1_3 = new Class31_Sub1(this);
		this.aClass31_Sub1_10 = new Class31_Sub1(this);
		this.aClass31_Sub1_2 = new Class31_Sub1(this);
		this.aClass31_Sub1_5 = new Class31_Sub1(this);
		this.aClass31_Sub1_4 = new Class31_Sub1(this);
		this.aClass31_Sub1_8 = new Class31_Sub1(this);
		this.aClass31_Sub1_9 = new Class31_Sub1(this);
		this.aClass31_Sub1_6 = new Class31_Sub1(this);
		if (this.aBoolean220) {
			this.aClass122_2 = new Class122(this);
			this.aClass122_1 = new Class122(this);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2591(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas4) {
			local5 = this.aLong84;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable1.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas3 == arg0) {
			this.method2415();
		}
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)V")
	private void method2415() {
		if (this.aCanvas3 == null) {
			this.anInt3001 = this.anInt2930 = 0;
		} else {
			@Pc(17) Dimension local17 = this.aCanvas3.getSize();
			this.anInt3001 = local17.width;
			this.anInt2930 = local17.height;
		}
		if (this.anInterface6_2 == null) {
			this.anInt3074 = this.anInt2930;
			this.anInt3032 = this.anInt3001;
			this.method2470();
		}
		this.method2461();
		this.va();
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "()V")
	@Override
	public void method2583() {
		if (this.aClass3_Sub17_Sub1_1 != null && this.aClass3_Sub17_Sub1_1.method4942()) {
			this.aClass121_1.method3125(this.aClass3_Sub17_Sub1_1);
			this.aClass35_1.method1063();
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)V")
	public synchronized void method2416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub25 local15 = new Class3_Sub25(arg0);
		local15.aLong227 = arg1;
		this.aClass229_17.method5321(local15);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class22 method2627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class22_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(Z)V")
	private void method2417() {
		if (this.anInt3108 != 2) {
			this.anInt3108 = 2;
			this.method2447();
			this.method2448();
			this.anInt3104 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(Z)V")
	private void method2418() {
		@Pc(6) float[] local6 = this.aFloatArray25;
		@Pc(18) float local18 = (float) (this.anInt3122 * -this.anInt3097) / (float) this.anInt3092;
		@Pc(33) float local33 = (float) (this.anInt3122 * (this.anInt3032 - this.anInt3097)) / (float) this.anInt3092;
		@Pc(44) float local44 = (float) (this.anInt3122 * this.anInt3102) / (float) this.anInt3100;
		@Pc(59) float local59 = (float) ((this.anInt3102 - this.anInt3074) * this.anInt3122) / (float) this.anInt3100;
		if (local33 == local18 || local44 == local59) {
			local6[5] = 1.0F;
			local6[6] = 0.0F;
			local6[15] = 1.0F;
			local6[7] = 0.0F;
			local6[3] = 0.0F;
			local6[11] = 0.0F;
			local6[0] = 1.0F;
			local6[1] = 0.0F;
			local6[13] = 0.0F;
			local6[8] = 0.0F;
			local6[2] = 0.0F;
			local6[14] = 0.0F;
			local6[9] = 0.0F;
			local6[4] = 0.0F;
			local6[12] = 0.0F;
			local6[10] = 1.0F;
		} else {
			@Pc(139) float local139 = (float) this.anInt3122 * 2.0F;
			local6[4] = 0.0F;
			local6[1] = 0.0F;
			local6[14] = this.aFloat36 = -(local139 * (float) this.anInt3090) / (float) (this.anInt3090 - this.anInt3122);
			local6[5] = local139 / (local44 - local59);
			local6[12] = 0.0F;
			local6[10] = this.aFloat38 = (float) -(this.anInt3122 + this.anInt3090) / (float) (this.anInt3090 - this.anInt3122);
			local6[7] = 0.0F;
			local6[0] = local139 / (local33 - local18);
			local6[8] = (local33 + local18) / (-local18 + local33);
			local6[3] = 0.0F;
			local6[2] = 0.0F;
			local6[15] = 0.0F;
			local6[9] = (local44 + local59) / (-local59 + local44);
			local6[11] = -1.0F;
			local6[6] = 0.0F;
			local6[13] = 0.0F;
		}
		this.method2475();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(FIF)V")
	public void method2419(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat42 = arg0;
		this.aFloat28 = arg1;
		if (!this.aBoolean232) {
			this.method2453();
		}
	}

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "(I)V")
	private void method2420() {
		OpenGL.glDepthMask(this.aBoolean238 && this.aBoolean241);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!aq;I)V")
	@Override
	public void method2605(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) Class13_Sub1[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method5704(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "(I)V")
	private void method2421() {
		Static101.aFloatArray16[3] = 1.0F;
		Static101.aFloatArray16[2] = this.aFloat45 * this.aFloat37;
		Static101.aFloatArray16[0] = this.aFloat43 * this.aFloat45;
		Static101.aFloatArray16[1] = this.aFloat45 * this.aFloat47;
		OpenGL.glLightModelfv(2899, Static101.aFloatArray16, 0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!vh;Lclient!vh;FLclient!vh;)Lclient!vh;")
	@Override
	public Class7 method2598(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class7 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean234 && this.aBoolean220 && this.aBoolean218) {
			@Pc(18) Class7_Sub1_Sub1 local18 = null;
			@Pc(21) Class7_Sub1 local21 = (Class7_Sub1) arg0;
			@Pc(24) Class7_Sub1 local24 = (Class7_Sub1) arg1;
			@Pc(28) Class42_Sub3 local28 = local21.method1775();
			@Pc(32) Class42_Sub3 local32 = local24.method1775();
			if (local28 != null && local32 != null) {
				@Pc(47) int local47 = local32.anInt4538 >= local28.anInt4538 ? local32.anInt4538 : local28.anInt4538;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class7_Sub1_Sub1) {
					@Pc(59) Class7_Sub1_Sub1 local59 = (Class7_Sub1_Sub1) arg3;
					if (local59.method163() == local47) {
						local18 = local59;
					}
				}
				if (local18 == null) {
					local18 = new Class7_Sub1_Sub1(this, local47);
				}
				if (local18.method159(arg2, local32, local28)) {
					return local18;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(II)V")
	public synchronized void method2422(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub25 local14 = new Class3_Sub25(arg0);
		this.aClass229_19.method5321(local14);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method2576(@OriginalArg(0) Class3_Sub27 arg0) {
		this.aNativeHeap1 = ((Class3_Sub27_Sub1) arg0).aNativeHeap2;
		if (this.anInterface5_4 != null) {
			return;
		}
		@Pc(16) Class3_Sub2_Sub1 local16 = new Class3_Sub2_Sub1(80);
		if (this.aBoolean228) {
			local16.method400(-1.0F);
			local16.method400(-1.0F);
			local16.method400(0.0F);
			local16.method400(0.0F);
			local16.method400(1.0F);
			local16.method400(1.0F);
			local16.method400(-1.0F);
			local16.method400(0.0F);
			local16.method400(1.0F);
			local16.method400(1.0F);
			local16.method400(1.0F);
			local16.method400(1.0F);
			local16.method400(0.0F);
			local16.method400(1.0F);
			local16.method400(0.0F);
			local16.method400(-1.0F);
			local16.method400(1.0F);
			local16.method400(0.0F);
			local16.method400(0.0F);
			local16.method400(0.0F);
		} else {
			local16.method395(-1.0F);
			local16.method395(-1.0F);
			local16.method395(0.0F);
			local16.method395(0.0F);
			local16.method395(1.0F);
			local16.method395(1.0F);
			local16.method395(-1.0F);
			local16.method395(0.0F);
			local16.method395(1.0F);
			local16.method395(1.0F);
			local16.method395(1.0F);
			local16.method395(1.0F);
			local16.method395(0.0F);
			local16.method395(1.0F);
			local16.method395(0.0F);
			local16.method395(-1.0F);
			local16.method395(1.0F);
			local16.method395(0.0F);
			local16.method395(0.0F);
			local16.method395(0.0F);
		}
		this.anInterface5_4 = this.method2435(local16.anInt7620, local16.aByteArray95, false, 20);
		this.aClass225_9 = new Class225(this, this.anInterface5_4, 5126, 3, 0);
		this.aClass225_10 = new Class225(this, this.anInterface5_4, 5126, 2, 12);
		this.aClass107_1.method2915(this);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZ)V")
	public void method2423(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		this.method2477(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "()Z")
	@Override
	public boolean method2578() {
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2580() {
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method2603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class32 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class32_Sub2 local6 = (Class32_Sub2) arg5;
		@Pc(9) Class42_Sub1_Sub1 local9 = local6.aClass42_Sub1_Sub1_4;
		this.method2465();
		this.method2456(local6.aClass42_Sub1_Sub1_4);
		this.method2445(1);
		this.method2479(7681, 8448);
		this.method2466(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat17 / (float) local9.anInt1542;
		@Pc(46) float local46 = local9.aFloat18 / (float) local9.anInt1543;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method2466(5890, 0, 768);
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(II)V")
	public void method2424(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method2479(7681, 7681);
		} else if (arg0 == 0) {
			this.method2479(8448, 8448);
		} else if (arg0 == 2) {
			this.method2479(34165, 7681);
		} else if (arg0 == 3) {
			this.method2479(260, 8448);
		} else if (arg0 == 4) {
			this.method2479(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ie;B)V")
	public void method2425(@OriginalArg(0) Interface6 arg0) {
		if (this.anInt3083 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3083 >= 0) {
			this.anInterface6Array3[this.anInt3083].method3161();
		}
		this.anInterface6_2 = this.anInterface6Array3[++this.anInt3083] = arg0;
		this.anInterface6_2.method3158();
	}

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "()Z")
	@Override
	public boolean method2612() {
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)I")
	@Override
	public int method2614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "()Lclient!ia;")
	@Override
	public Class106 method2636() {
		return new Class106_Sub2();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2595(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static371.aFloat89 = arg0;
		Static359.aFloat75 = arg1;
		Static265.aFloat65 = arg2;
	}

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "()Z")
	@Override
	public boolean method2623() {
		return false;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)V")
	public void method2426(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt3101) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt3101 = arg0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		this.method2445(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2607(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas4 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "(II)I")
	public int method2427(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "()V")
	@Override
	public void method2570() {
		this.method2467(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "(I)V")
	private void method2428() {
		if (this.anInt3108 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt3032 > 0 && this.anInt3074 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt3032, (double) this.anInt3074, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt3108 = 1;
		this.anInt3104 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!sf;)V")
	public void method2429(@OriginalArg(1) Class106_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method5114(), 0);
	}

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "()Z")
	@Override
	public boolean method2626() {
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BZ)V")
	public void method2430(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean222) {
			this.aBoolean222 = arg0;
			this.method2463();
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(IIII)V")
	public void method2431(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ie;I)V")
	public void method2432(@OriginalArg(0) Interface6 arg0) {
		if (this.aBoolean218) {
			this.method2407(arg0);
			this.method2425(arg0);
		} else if (this.anInt3082 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt3082 >= 0) {
				this.anInterface6Array2[this.anInt3082].method3160();
			}
			this.anInterface6_1 = this.anInterface6_2 = this.anInterface6Array2[++this.anInt3082] = arg0;
			this.anInterface6_1.method3159();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZF)V")
	public void method2433(@OriginalArg(1) float arg0) {
		if (this.aFloat40 != arg0) {
			this.aFloat40 = arg0;
			if (this.anInt3108 == 3) {
				this.method2484();
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)V")
	@Override
	public void method2630(@OriginalArg(0) int arg0) {
		this.method2444();
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(B)V")
	private void method2434() {
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.anInt3095; local5++) {
			@Pc(11) Class3_Sub23 local11 = this.aClass3_Sub23Array1[local5];
			@Pc(15) int local15 = local5 + 16386;
			Static224.aFloatArray31[0] = local11.method3679();
			Static224.aFloatArray31[1] = local11.method3675();
			Static224.aFloatArray31[2] = local11.method3678();
			Static224.aFloatArray31[3] = 1.0F;
			OpenGL.glLightfv(local15, 4611, Static224.aFloatArray31, 0);
			@Pc(49) int local49 = local11.method3674();
			@Pc(55) float local55 = local11.method3677() / 255.0F;
			Static224.aFloatArray31[2] = (float) (local49 & 0xFF) * local55;
			Static224.aFloatArray31[0] = local55 * (float) (local49 >> 16 & 0xFF);
			Static224.aFloatArray31[1] = (float) (local49 >> 8 & 0xFF) * local55;
			OpenGL.glLightfv(local15, 4609, Static224.aFloatArray31, 0);
			OpenGL.glLightf(local15, 4617, 1.0F / (float) (local11.method3670() * local11.method3670()));
			OpenGL.glEnable(local15);
		}
		while (this.anInt3103 > local5) {
			OpenGL.glDisable(local5 + 16386);
			local5++;
		}
		this.anInt3103 = this.anInt3095;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt3122;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[BZII)Lclient!hh;")
	public Interface5 method2435(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		return (Interface5) (this.aBoolean227 && (!arg2 || this.aBoolean243) ? new Class170_Sub1(this, arg3, arg1, arg0, arg2) : new Class85_Sub2(this, arg3, arg1, arg0));
	}

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "(I)V")
	public void method2436() {
		if (this.anInt3104 == 4) {
			return;
		}
		this.method2428();
		this.method2451(false);
		this.method2482(false);
		this.method2485(false);
		this.method2467(false);
		this.method2440(-2);
		this.method2445(1);
		this.method2424(0);
		this.anInt3104 = 4;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ov;[Lclient!ne;Z)Lclient!oa;")
	@Override
	public Class65 method2601(@OriginalArg(0) Class179 arg0, @OriginalArg(1) Class166[] arg1) {
		return new Class65_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!gk", name = "JA", descriptor = "(II)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3122 == arg0 && arg1 == this.anInt3090) {
			return;
		}
		this.anInt3090 = arg1;
		this.anInt3122 = arg0;
		this.method2418();
		this.method2453();
		if (this.anInt3108 == 3) {
			this.method2484();
		} else if (this.anInt3108 == 2) {
			this.method2447();
		}
	}

	@OriginalMember(owner = "client!gk", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.bf = arg1;
		this.aBoolean232 = true;
		this.anInt3098 = arg0;
		this.anInt3093 = arg2;
		this.anInt3116 = arg3;
		this.aClass153_1.method3789(false, false, 3);
		this.aClass153_1.aClass51_Sub1_1.method1337();
		this.method2453();
		this.method2403();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([BIIZI)Lclient!cm;")
	public Interface1 method2437(@OriginalArg(0) byte[] arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		return (Interface1) (this.aBoolean227 && (!arg1 || this.aBoolean243) ? new Class170_Sub2(this, 5123, arg0, arg2, arg1) : new Class85_Sub1(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ne;Z)Lclient!f;")
	@Override
	public Class22 method2590(@OriginalArg(0) Class166 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt4969 * arg0.anInt4973];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray56 == null) {
			for (local21 = 0; local21 < arg0.anInt4969; local21++) {
				for (local25 = 0; local25 < arg0.anInt4973; local25++) {
					@Pc(87) int local87 = arg0.anIntArray385[arg0.aByteArray57[local14++] & 0xFF];
					local12[local16++] = local87 == 0 ? 0 : local87 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt4969; local21++) {
				for (local25 = 0; local25 < arg0.anInt4973; local25++) {
					local12[local16++] = arg0.anIntArray385[arg0.aByteArray57[local14] & 0xFF] | arg0.aByteArray56[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(126) Class22 local126 = this.method2640(local12, arg0.anInt4973, arg0.anInt4973, arg0.anInt4969);
		local126.ka(arg0.anInt4971, arg0.anInt4970, arg0.anInt4974, arg0.anInt4972);
		return local126;
	}

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "()Z")
	@Override
	public boolean method2624() {
		return this.aClass153_1.method3791();
	}

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "()Z")
	@Override
	public boolean method2613() {
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZLclient!jaggl/memory/NativeBuffer;ZI)Lclient!hh;")
	public Interface5 method2438(@OriginalArg(0) int arg0, @OriginalArg(2) NativeBuffer arg1, @OriginalArg(4) int arg2) {
		return (Interface5) (this.aBoolean227 ? new Class170_Sub1(this, arg0, arg1, arg2, false) : new Class85_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!gk", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean232) {
			throw new RuntimeException("");
		}
		this.anInt3098 = arg0;
		this.bf = arg1;
		this.anInt3093 = arg2;
		this.anInt3116 = arg3;
		this.aClass153_1.aClass51_Sub1_1.method1337();
		this.method2453();
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2638(@OriginalArg(0) Canvas arg0) {
		this.aCanvas3 = null;
		this.aLong85 = 0L;
		if (arg0 == null || this.aCanvas4 == arg0) {
			this.aLong85 = this.aLong84;
			this.aCanvas3 = this.aCanvas4;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable1.get(arg0);
			this.aLong85 = local36;
			this.aCanvas3 = arg0;
		}
		if (this.aCanvas3 == null || this.aLong85 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong85);
		this.method2415();
	}

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "(I)V")
	private void method2439() {
		@Pc(5) int local5 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local5++ > 5) {
				throw new RuntimeException("");
			}
			Static135.method2458(1000L);
		}
	}

	@OriginalMember(owner = "client!gk", name = "SA", descriptor = "(IIIIII)Z")
	@Override
	public boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass106_Sub2_4.aFloat80 * (float) arg2 + this.aClass106_Sub2_4.aFloat77 * (float) arg1 + this.aClass106_Sub2_4.aFloat81 * (float) arg0 + this.aClass106_Sub2_4.aFloat76;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass106_Sub2_4.aFloat76 + this.aClass106_Sub2_4.aFloat77 * (float) arg4 + this.aClass106_Sub2_4.aFloat81 * (float) arg3 + (float) arg5 * this.aClass106_Sub2_4.aFloat80;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt3122 && (float) this.anInt3122 > local59 || !(!(local28 > (float) this.anInt3090) || !((float) this.anInt3090 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt3092 * ((float) arg0 * this.aClass106_Sub2_4.aFloat78 + (float) arg1 * this.aClass106_Sub2_4.aFloat82 + (float) arg2 * this.aClass106_Sub2_4.aFloat79 + this.aClass106_Sub2_4.aFloat83) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt3092 * (this.aClass106_Sub2_4.aFloat83 + this.aClass106_Sub2_4.aFloat78 * (float) arg3 + (float) arg4 * this.aClass106_Sub2_4.aFloat82 + this.aClass106_Sub2_4.aFloat79 * (float) arg5) / local59);
		if ((float) local123 < this.aFloat31 && (float) local155 < this.aFloat31 || this.aFloat30 < (float) local123 && this.aFloat30 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) (((float) arg2 * this.aClass106_Sub2_4.aFloat84 + this.aClass106_Sub2_4.aFloat87 * (float) arg0 + this.aClass106_Sub2_4.aFloat85 * (float) arg1 + this.aClass106_Sub2_4.aFloat86) * (float) this.anInt3100 / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt3100 * (this.aClass106_Sub2_4.aFloat85 * (float) arg4 + (float) arg3 * this.aClass106_Sub2_4.aFloat87 + this.aClass106_Sub2_4.aFloat84 * (float) arg5 + this.aClass106_Sub2_4.aFloat86) / local59);
			return (!((float) local213 < this.aFloat44) || !(this.aFloat44 > (float) local245)) && (!((float) local213 > this.aFloat35) || !(this.aFloat35 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZ)V")
	public void method2440(@OriginalArg(0) int arg0) {
		this.method2423(arg0, true);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class64 method2631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class64_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "()Z")
	@Override
	public boolean method2617() {
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(III)V")
	public synchronized void method2441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class3_Sub25 local14 = new Class3_Sub25(arg0);
		local14.aLong227 = arg1;
		this.aClass229_18.method5321(local14);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Lclient!ie;I)V")
	public void method2442(@OriginalArg(0) Interface6 arg0) {
		if (this.anInt3081 < 0 || this.anInterface6Array1[this.anInt3081] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface6Array1[this.anInt3081--] = null;
		arg0.method3162();
		if (this.anInt3081 < 0) {
			this.anInterface6_1 = null;
		} else {
			this.anInterface6_1 = this.anInterface6Array1[this.anInt3081];
			this.anInterface6_1.method3157();
		}
	}

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "([I)V")
	@Override
	public void u(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3121;
		arg0[2] = this.anInt3088;
		arg0[3] = this.anInt3099;
		arg0[1] = this.anInt3091;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZLclient!hh;)V")
	public void method2443(@OriginalArg(1) Interface5 arg0) {
		if (this.anInterface5_3 != arg0) {
			if (this.aBoolean227) {
				OpenGL.glBindBufferARB(34962, arg0.method4786());
			}
			this.anInterface5_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!iv;)V")
	@Override
	public void method2581(@OriginalArg(0) Class116 arg0) {
		this.aClass107_1.method2922(this, arg0);
	}

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "()Z")
	@Override
	public boolean method2609() {
		return this.aClass3_Sub17_Sub1_1 != null && this.aClass3_Sub17_Sub1_1.method4942();
	}

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "(I)V")
	private void method2444() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "(II)V")
	public void method2445(@OriginalArg(0) int arg0) {
		if (this.anInt3112 == arg0) {
			return;
		}
		@Pc(10) boolean local10;
		@Pc(12) byte local12;
		if (arg0 == 1) {
			local10 = true;
			local12 = 1;
		} else if (arg0 == 2) {
			local10 = false;
			local12 = 2;
		} else if (arg0 == 128) {
			local12 = 3;
			local10 = true;
		} else {
			local10 = false;
			local12 = 0;
		}
		if (!this.aBoolean236) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean236 = true;
		}
		if (local10 != this.aBoolean229) {
			if (local10) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean229 = local10;
		}
		if (local12 != this.anInt3111) {
			if (local12 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local12 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local12 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt3111 = local12;
		}
		this.anInt3112 = arg0;
		this.anInt3104 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	@Override
	public void method2572(@OriginalArg(0) boolean arg0) {
		this.aBoolean241 = arg0;
		this.method2420();
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2621(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas4) {
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

	@OriginalMember(owner = "client!gk", name = "da", descriptor = "(IIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2412();
		this.method2445(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "(I)V")
	public void method2446() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!vh;)V")
	@Override
	public void method2599(@OriginalArg(0) Class7 arg0) {
		this.aClass7_Sub1_1 = (Class7_Sub1) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "(I)V")
	private void method2447() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray25, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(B)V")
	private void method2448() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass106_Sub2_4.method5114(), 0);
		if (this.aBoolean232) {
			this.aClass153_1.aClass51_Sub1_1.method1337();
		}
		this.method2413();
		this.method2434();
	}

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "()Z")
	@Override
	public boolean method2615() {
		return this.aBoolean230 && (!this.method2609() || this.aBoolean233);
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "(B)V")
	private void method2449() {
		this.method2440(-2);
		for (@Pc(20) int local20 = this.anInt3105 - 1; local20 >= 0; local20--) {
			this.method2426(local20);
			this.method2456(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method2479(8448, 8448);
		this.method2466(34168, 2, 770);
		this.method2406();
		this.anInt3112 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt3111 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean229 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean236 = true;
		this.method2451(true);
		this.method2482(true);
		this.method2485(true);
		this.method2467(true);
		this.method2461();
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
		@Pc(131) float[] local131 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(133) int local133 = 0; local133 < 8; local133++) {
			@Pc(139) int local139 = local133 + 16384;
			OpenGL.glLightfv(local139, 4608, local131, 0);
			OpenGL.glLightf(local139, 4615, 0.0F);
			OpenGL.glLightf(local139, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt3096 = this.anInt3087 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!gk", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		this.anInt3078 = 0;
		while (arg0 > 1) {
			this.anInt3078++;
			arg0 >>= 0x1;
		}
		this.anInt3080 = 0x1 << this.anInt3078;
	}

	@OriginalMember(owner = "client!gk", name = "C", descriptor = "()Z")
	@Override
	public boolean method2642() {
		if (this.aClass3_Sub17_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub17_Sub1_1.method4942()) {
			if (!this.aClass121_1.method3128(this.aClass3_Sub17_Sub1_1)) {
				return false;
			}
			this.aClass35_1.method1063();
		}
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(III)V")
	public synchronized void method2450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub25 local8 = new Class3_Sub25(arg0);
		local8.aLong227 = arg1;
		this.aClass229_20.method5321(local8);
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "()V")
	@Override
	public void method2579() {
		if (!this.aBoolean237 || this.anInt3032 <= 0 || this.anInt3074 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt3121;
		@Pc(25) int local25 = this.anInt3088;
		@Pc(28) int local28 = this.anInt3091;
		@Pc(31) int local31 = this.anInt3099;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method2461();
		this.method2451(false);
		this.method2482(false);
		this.method2485(false);
		this.method2467(false);
		this.method2456(null);
		this.method2440(-2);
		this.method2424(1);
		this.method2445(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt3032, this.anInt3074, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.pa(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(IZ)V")
	public void method2451(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean225 != arg0) {
			this.aBoolean225 = arg0;
			this.method2403();
			this.anInt3104 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "(II)I")
	public int method2452(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "()V")
	@Override
	public void method2619() {
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!c;Lclient!iv;Lclient!ia;Lclient!aq;I)V")
	@Override
	public void method2571(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) Class13_Sub1 arg3) {
		arg0.method5704(arg2, arg3, 0);
		this.method2581(arg1);
	}

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "()V")
	@Override
	public void method2594() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!gk", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3097 = arg0;
		this.anInt3102 = arg1;
		this.anInt3092 = arg2;
		this.anInt3100 = arg3;
		this.method2418();
		this.method2402();
		if (this.anInt3108 == 3) {
			this.method2484();
		} else if (this.anInt3108 == 2) {
			this.method2447();
		}
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "()I")
	@Override
	public int g() {
		@Pc(6) int local6 = this.anInt3119;
		this.anInt3119 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "(B)V")
	private void method2453() {
		@Pc(51) int local51;
		if (this.aBoolean232) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local51 = this.bf;
		} else {
			this.aFloat32 = (float) (this.anInt3090 - this.anInt3089) - this.aFloat42;
			this.aFloat48 = this.aFloat32 - this.aFloat28 * (float) this.anInt3117;
			if ((float) this.anInt3122 > this.aFloat48) {
				this.aFloat48 = this.anInt3122;
			}
			OpenGL.glFogf(2915, this.aFloat48);
			OpenGL.glFogf(2916, this.aFloat32);
			local51 = this.anInt3087;
		}
		Static101.aFloatArray16[1] = (float) (local51 & 0xFF00) / 65280.0F;
		Static101.aFloatArray16[2] = (float) (local51 & 0xFF) / 255.0F;
		Static101.aFloatArray16[0] = (float) (local51 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static101.aFloatArray16, 0);
		if (this.aBoolean232) {
			this.aClass153_1.aClass51_Sub1_1.method1342();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!cm;III)V")
	public void method2454(@OriginalArg(0) int arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(4) int arg2) {
		@Pc(14) int local14 = arg1.method5471();
		@Pc(21) int local21 = arg0 * this.method2427(local14);
		this.method2410(arg1);
		OpenGL.glDrawElements(4, arg2, local14, (long) local21 + arg1.method5469());
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ie;Z)V")
	public void method2455(@OriginalArg(0) Interface6 arg0) {
		if (this.aBoolean218) {
			this.method2442(arg0);
			this.method2409(arg0);
		} else if (this.anInt3082 >= 0 && arg0 == this.anInterface6Array2[this.anInt3082]) {
			this.anInterface6Array2[this.anInt3082--] = null;
			arg0.method3160();
			if (this.anInt3082 < 0) {
				this.anInterface6_1 = this.anInterface6_2 = null;
			} else {
				this.anInterface6_1 = this.anInterface6_2 = this.anInterface6Array2[this.anInt3082];
				this.anInterface6_1.method3159();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!rh;I)V")
	public void method2456(@OriginalArg(0) Class42 arg0) {
		@Pc(16) Class42 local16 = this.aClass42Array1[this.anInt3101];
		if (local16 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local16.anInt6241);
			} else {
				if (local16 == null) {
					OpenGL.glEnable(arg0.anInt6241);
				} else if (local16.anInt6241 != arg0.anInt6241) {
					OpenGL.glDisable(local16.anInt6241);
					OpenGL.glEnable(arg0.anInt6241);
				}
				OpenGL.glBindTexture(arg0.anInt6241, arg0.method4914());
			}
			this.aClass42Array1[this.anInt3101] = arg0;
		}
		this.anInt3104 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!gk", name = "ua", descriptor = "(F)V")
	@Override
	public void ua(@OriginalArg(0) float arg0) {
		if (this.aFloat45 != arg0) {
			this.aFloat45 = arg0;
			this.method2421();
		}
	}

	@OriginalMember(owner = "client!gk", name = "XA", descriptor = "(IFFFFF)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt3096;
		if (local11 || arg1 != this.aFloat39 || this.aFloat29 != arg2) {
			this.aFloat29 = arg2;
			this.aFloat39 = arg1;
			this.anInt3096 = arg0;
			if (local11) {
				this.aFloat37 = (float) (this.anInt3096 & 0xFF) / 255.0F;
				this.aFloat47 = (float) (this.anInt3096 & 0xFF00) / 65280.0F;
				this.aFloat43 = (float) (this.anInt3096 & 0xFF0000) / 1.671168E7F;
				this.method2421();
			}
			this.method2404();
		}
		if (this.aFloatArray24[0] == arg3 && arg4 == this.aFloatArray24[1] && this.aFloatArray24[2] == arg5) {
			return;
		}
		this.aFloatArray24[2] = arg5;
		this.aFloatArray24[1] = arg4;
		this.aFloatArray24[0] = arg3;
		this.aFloatArray26[0] = -arg3;
		this.aFloatArray26[2] = -arg5;
		this.aFloatArray26[1] = -arg4;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray23[1] = local138 * arg4;
		this.aFloatArray23[0] = local138 * arg3;
		this.aFloatArray23[2] = local138 * arg5;
		this.aFloatArray27[1] = -this.aFloatArray23[1];
		this.aFloatArray27[2] = -this.aFloatArray23[2];
		this.aFloatArray27[0] = -this.aFloatArray23[0];
		this.method2413();
		this.anInt3113 = (int) (arg3 * 256.0F / arg4);
		this.anInt3118 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass121_1.method3124(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method2637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method2412();
		this.method2445(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean230) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean230) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(IIII)V")
	public void method2460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "(B)V")
	public void method2461() {
		if (this.anInt3108 != 0) {
			this.anInt3104 &= 0xFFFFFFE0;
			this.anInt3108 = 0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method2618(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(FFFB)V")
	private void method2462(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean223) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg1, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean223 = true;
	}

	@OriginalMember(owner = "client!gk", name = "W", descriptor = "()I")
	@Override
	public int W() {
		return this.anInt3090;
	}

	@OriginalMember(owner = "client!gk", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt3088 = this.anInt3032;
		this.anInt3099 = this.anInt3074;
		this.anInt3091 = 0;
		this.anInt3121 = 0;
		OpenGL.glDisable(3089);
		this.method2402();
	}

	@OriginalMember(owner = "client!gk", name = "S", descriptor = "()V")
	@Override
	public void S() {
		this.aBoolean232 = false;
		this.aClass153_1.method3789(false, false, 0);
		this.method2453();
		this.method2403();
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(Z)V")
	private void method2463() {
		if (this.aBoolean240 && !this.aBoolean222) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!gk", name = "FA", descriptor = "()I")
	@Override
	public int FA() {
		return this.anInt3086 + this.anInt3084 + this.anInt3085;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2566(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method2594();
	}

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "(B)V")
	private void method2464() {
		if (this.anInt3121 <= this.anInt3088 && this.anInt3099 >= this.anInt3091) {
			OpenGL.glScissor(this.anInt3121 + this.anInt3107, this.anInt3120 - (-this.anInt3074 + this.anInt3099), this.anInt3088 - this.anInt3121, this.anInt3099 - this.anInt3091);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([Lclient!c;Lclient!iv;Lclient!ia;[Lclient!aq;I)V")
	@Override
	public void method2602(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) Class13_Sub1[] arg3, @OriginalArg(4) int arg4) {
		this.method2605(arg0, arg2, arg3, arg4);
		this.method2581(arg1);
	}

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "(I)V")
	public void method2465() {
		if (this.anInt3104 == 2) {
			return;
		}
		this.method2428();
		this.method2451(false);
		this.method2482(false);
		this.method2485(false);
		this.method2467(false);
		this.method2440(-2);
		this.anInt3104 = 2;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(IIII)V")
	public void method2466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "(ILclient!ea;II)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class32_Sub2 local6 = (Class32_Sub2) arg1;
		@Pc(9) Class42_Sub1_Sub1 local9 = local6.aClass42_Sub1_Sub1_4;
		this.method2465();
		this.method2456(local6.aClass42_Sub1_Sub1_4);
		this.method2445(1);
		this.method2479(7681, 8448);
		this.method2466(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat17 / (float) local9.anInt1542;
		@Pc(46) float local46 = local9.aFloat18 / (float) local9.anInt1543;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt3121 - arg2) * local39, (float) (this.anInt3091 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3121, this.anInt3091);
		OpenGL.glTexCoord2f((float) (this.anInt3121 - arg2) * local39, local46 * (float) (this.anInt3099 - arg3));
		OpenGL.glVertex2i(this.anInt3121, this.anInt3099);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3088 - arg2), local46 * (float) (this.anInt3099 - arg3));
		OpenGL.glVertex2i(this.anInt3088, this.anInt3099);
		OpenGL.glTexCoord2f((float) (this.anInt3088 - arg2) * local39, local46 * (float) (this.anInt3091 - arg3));
		OpenGL.glVertex2i(this.anInt3088, this.anInt3091);
		OpenGL.glEnd();
		this.method2466(5890, 0, 768);
	}

	@OriginalMember(owner = "client!gk", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt3087 && this.anInt3117 == arg1 && this.anInt3089 == arg2) {
			return;
		}
		this.anInt3117 = arg1;
		this.anInt3087 = arg0;
		this.anInt3089 = arg2;
		if (this.aBoolean232) {
			return;
		}
		this.method2453();
		this.method2403();
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(IZ)V")
	public void method2467(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean238 != arg0) {
			this.aBoolean238 = arg0;
			this.method2420();
			this.anInt3104 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "(II)I")
	public int method2469(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "(I)V")
	private void method2470() {
		OpenGL.glViewport(this.anInt3107, this.anInt3120, this.anInt3032, this.anInt3074);
	}

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "()Z")
	@Override
	public boolean method2593() {
		return this.aClass3_Sub17_Sub1_1 != null && (this.anInt3077 <= 1 || this.aBoolean233);
	}

	@OriginalMember(owner = "client!gk", name = "pa", descriptor = "(IIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > this.anInt3032) {
			arg2 = this.anInt3032;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt3074 < arg3) {
			arg3 = this.anInt3074;
		}
		this.anInt3099 = arg3;
		this.anInt3121 = arg0;
		this.anInt3088 = arg2;
		this.anInt3091 = arg1;
		OpenGL.glEnable(3089);
		this.method2402();
		this.method2464();
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method2618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2412();
		this.method2445(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gk", name = "A", descriptor = "(I)Lclient!lm;")
	public Class42_Sub3 method2471() {
		return this.aClass7_Sub1_1 == null ? null : this.aClass7_Sub1_1.method1775();
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "(Z)I")
	private int method2472() {
		this.aString28 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString29 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString28.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString28.indexOf("brian paul") != -1 || this.aString28.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static365.method5139(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(65) int local65 = Static110.method1873(local53[0]);
				@Pc(71) int local71 = Static110.method1873(local53[1]);
				this.anInt3094 = local71 + local65 * 10;
			} catch (@Pc(80) NumberFormatException local80) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt3094 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(118) int[] local118 = new int[1];
		OpenGL.glGetIntegerv(34018, local118, 0);
		this.anInt3105 = local118[0];
		OpenGL.glGetIntegerv(34929, local118, 0);
		this.anInt3123 = local118[0];
		OpenGL.glGetIntegerv(34930, local118, 0);
		this.anInt3124 = local118[0];
		if (this.anInt3105 < 2 || this.anInt3123 < 2 || this.anInt3124 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean228 = NativeStream.a();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean227 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean230 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean231 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean221 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean219 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean226 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean244 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean234 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean235 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean239 = false;
		this.aBoolean220 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean218 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean242 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean233 = this.aBoolean218 & this.aBoolean242;
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!gk", name = "IA", descriptor = "(IIII)[I")
	@Override
	public int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt3074 - arg1 - local12, arg2, 1, 32993, this.anInt3110, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class22 method2640(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class22_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V")
	@Override
	public void method2586(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gk", name = "O", descriptor = "(IIIII)V")
	@Override
	protected void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "(I)V")
	@Override
	public void method2634(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIII)Lclient!vh;")
	@Override
	public Class7 method2597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean234 ? new Class7_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "()Z")
	@Override
	public boolean method2635() {
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		@Pc(6) int local6 = this.anInt3106;
		this.anInt3106 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V")
	@Override
	public void method2606(@OriginalArg(0) int arg0) {
		this.method2439();
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
	@Override
	public void method2569(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt3076 = arg0;
		this.aClass35_1.method1063();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!tp;Lclient!tp;Lclient!tp;BLclient!tp;)V")
	public void method2473(@OriginalArg(0) Class225 arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Class225 arg2, @OriginalArg(4) Class225 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method2443(arg1.anInterface5_7);
			OpenGL.glVertexPointer(arg1.aByte95, arg1.aShort199, this.anInterface5_3.method4783(), this.anInterface5_3.method4785() + (long) arg1.aByte96);
			OpenGL.glEnableClientState(32884);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method2443(arg0.anInterface5_7);
			OpenGL.glNormalPointer(arg0.aShort199, this.anInterface5_3.method4783(), this.anInterface5_3.method4785() + (long) arg0.aByte96);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method2443(arg2.anInterface5_7);
			OpenGL.glColorPointer(arg2.aByte95, arg2.aShort199, this.anInterface5_3.method4783(), this.anInterface5_3.method4785() + (long) arg2.aByte96);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method2443(arg3.anInterface5_7);
			OpenGL.glTexCoordPointer(arg3.aByte95, arg3.aShort199, this.anInterface5_3.method4783(), this.anInterface5_3.method4785() + (long) arg3.aByte96);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IJ)V")
	public synchronized void method2474(@OriginalArg(1) long arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong227 = arg0;
		this.aClass229_22.method5321(local7);
	}

	@OriginalMember(owner = "client!gk", name = "B", descriptor = "(I)V")
	private void method2475() {
		if (this.aFloat34 == 0.0F) {
			this.aFloatArray25[10] = this.aFloat38;
			this.aFloatArray25[14] = this.aFloat36;
		} else {
			@Pc(17) float local17 = this.aFloat46 / (this.aFloat34 + this.aFloat46);
			@Pc(21) float local21 = local17 * local17;
			@Pc(37) float local37 = -this.aFloat36 * (1.0F - local17) * (1.0F - local17) / this.aFloat34;
			this.aFloatArray25[10] = this.aFloat38 + local37;
			this.aFloatArray25[14] = this.aFloat36 * local21;
		}
		this.aFloat41 = ((float) -this.anInt3090 + this.aFloatArray25[14]) / this.aFloatArray25[10];
		this.aFloat33 = (float) this.anInt3090 - this.aFloat34;
	}

	@OriginalMember(owner = "client!gk", name = "C", descriptor = "(I)V")
	private void method2476() {
		if (this.anInt3108 != 3) {
			this.anInt3108 = 3;
			this.method2484();
			this.method2448();
			this.anInt3104 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZIZ)V")
	public void method2477(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt3114 != arg1) {
			if (arg1 < 0) {
				this.method2406();
				this.method2456(null);
				this.method2424(0);
				if (!this.aBoolean232) {
					this.aClass153_1.method3789(arg0, arg2, 0);
				}
			} else {
				@Pc(23) Class42_Sub1 local23 = this.aClass35_1.method1065(arg1);
				@Pc(31) Class62 local31 = super.anInterface7_6.method2131(arg1);
				if (local31.aByte22 == 0 && local31.aByte26 == 0) {
					this.method2406();
				} else {
					@Pc(54) int local54 = local31.aBoolean142 ? 64 : 128;
					@Pc(58) int local58 = local54 * 50;
					this.method2462(0.0F, (float) (this.anInt3079 % local58 * local31.aByte26) / (float) local58, (float) (this.anInt3079 % local58 * local31.aByte22) / (float) local58);
				}
				if (this.aBoolean232) {
					this.aClass153_1.method3789(arg0, arg2, 3);
					this.method2456(local23);
					this.method2424(local31.anInt1810);
				} else {
					this.aClass153_1.method3789(arg0, arg2, local31.aByte28);
					this.aClass153_1.method3786(local31.aByte23, local31.anInt1812);
					if (!this.aClass153_1.method3787(local23, local31.anInt1810)) {
						this.method2456(local23);
						this.method2424(local31.anInt1810);
					}
				}
			}
			this.anInt3114 = arg1;
		}
		this.anInt3104 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "(B)V")
	public void method2478() {
		if (this.anInt3104 == 8) {
			return;
		}
		this.method2417();
		this.method2451(true);
		this.method2485(true);
		this.method2467(true);
		this.method2445(1);
		this.method2424(0);
		this.anInt3104 = 8;
	}

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "()Z")
	@Override
	public boolean method2589() {
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "aa", descriptor = "(IIIIII[BII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(45) float local45;
		if (this.aClass42_Sub1_Sub1_3 == null || this.aClass42_Sub1_Sub1_3.anInt1533 < arg2 || arg3 > this.aClass42_Sub1_Sub1_3.anInt1539) {
			this.aClass42_Sub1_Sub1_3 = Static144.method2562(arg6, arg3, this, arg2);
			this.aClass42_Sub1_Sub1_3.method1269(false, false);
			local41 = this.aClass42_Sub1_Sub1_3.aFloat18;
			local45 = this.aClass42_Sub1_Sub1_3.aFloat17;
		} else {
			this.aClass42_Sub1_Sub1_3.method1266(arg3, arg2, 6406, arg6, false);
			local45 = this.aClass42_Sub1_Sub1_3.aFloat17 * (float) arg2 / (float) this.aClass42_Sub1_Sub1_3.anInt1533;
			local41 = this.aClass42_Sub1_Sub1_3.aFloat18 * (float) arg3 / (float) this.aClass42_Sub1_Sub1_3.anInt1539;
		}
		this.method2465();
		this.method2456(this.aClass42_Sub1_Sub1_3);
		this.method2445(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2405(arg5);
		this.method2479(34165, 34165);
		this.method2466(34166, 0, 768);
		this.method2466(5890, 2, 770);
		this.method2460(34166, 0);
		this.method2460(5890, 2);
		@Pc(146) float local146 = (float) arg0;
		@Pc(149) float local149 = (float) arg1;
		@Pc(154) float local154 = local146 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(161) float local161 = local149 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local146, local149);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local146, local161);
		OpenGL.glTexCoord2f(local41, local45);
		OpenGL.glVertex2f(local154, local161);
		OpenGL.glTexCoord2f(local41, 0.0F);
		OpenGL.glVertex2f(local154, local149);
		OpenGL.glEnd();
		this.method2466(5890, 0, 768);
		this.method2466(34166, 2, 770);
		this.method2460(5890, 0);
		this.method2460(34166, 2);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(IIZ)V")
	public void method2479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3101 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg0 != this.anInt3109) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt3109 = arg0;
			local11 = true;
		}
		if (arg1 != this.anInt3115) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local11 = true;
			this.anInt3115 = arg1;
		}
		if (local11) {
			this.anInt3104 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!gk", name = "D", descriptor = "(I)V")
	public void method2480() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLclient!sf;)V")
	public void method2481(@OriginalArg(1) Class106_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method5114(), 0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZB)V")
	public void method2482(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean240 != arg0) {
			this.aBoolean240 = arg0;
			this.method2463();
			this.anInt3104 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "(II)V")
	public synchronized void method2483(@OriginalArg(1) int arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong227 = arg0;
		this.aClass229_21.method5321(local7);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class32 method2622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static91.method1562(arg1, this, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)Lclient!l;")
	@Override
	public Class3_Sub27 method2588() {
		@Pc(8) Class3_Sub27_Sub1 local8 = new Class3_Sub27_Sub1(78643200);
		this.aClass229_15.method5321(local8);
		return local8;
	}

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "()Lclient!ia;")
	@Override
	public Class106 method2587() {
		return this.aClass106_Sub2_1;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method2567(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub25 local19;
		while (!this.aClass229_17.method5317()) {
			local19 = (Class3_Sub25) this.aClass229_17.method5331();
			Static239.anIntArray355[local11++] = (int) local19.aLong227;
			this.anInt3084 -= local19.anInt4134;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static239.anIntArray355, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static239.anIntArray355, 0);
			local11 = 0;
		}
		while (!this.aClass229_18.method5317()) {
			local19 = (Class3_Sub25) this.aClass229_18.method5331();
			Static239.anIntArray355[local11++] = (int) local19.aLong227;
			this.anInt3085 -= local19.anInt4134;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static239.anIntArray355, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static239.anIntArray355, 0);
			local11 = 0;
		}
		while (!this.aClass229_19.method5317()) {
			local19 = (Class3_Sub25) this.aClass229_19.method5331();
			Static239.anIntArray355[local11++] = local19.anInt4134;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static239.anIntArray355, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static239.anIntArray355, 0);
			local11 = 0;
		}
		while (!this.aClass229_20.method5317()) {
			local19 = (Class3_Sub25) this.aClass229_20.method5331();
			Static239.anIntArray355[local11++] = (int) local19.aLong227;
			this.anInt3086 -= local19.anInt4134;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static239.anIntArray355, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static239.anIntArray355, 0);
		}
		while (!this.aClass229_16.method5317()) {
			local19 = (Class3_Sub25) this.aClass229_16.method5331();
			OpenGL.glDeleteLists((int) local19.aLong227, local19.anInt4134);
		}
		@Pc(213) Class3 local213;
		while (!this.aClass229_21.method5317()) {
			local213 = this.aClass229_21.method5331();
			OpenGL.glDeleteProgramARB((int) local213.aLong227);
		}
		while (!this.aClass229_22.method5317()) {
			local213 = this.aClass229_22.method5331();
			OpenGL.glDeleteObjectARB(local213.aLong227);
		}
		while (!this.aClass229_16.method5317()) {
			local19 = (Class3_Sub25) this.aClass229_16.method5331();
			OpenGL.glDeleteLists((int) local19.aLong227, local19.anInt4134);
		}
		this.aClass35_1.method1066();
		if (this.FA() > 100663296 && Static150.method2672() > this.aLong87 + 60000L) {
			System.gc();
			this.aLong87 = Static150.method2672();
		}
		this.anInt3079 = local9;
	}

	@OriginalMember(owner = "client!gk", name = "E", descriptor = "(I)V")
	private void method2484() {
		@Pc(15) float local15 = this.aFloat40 * (float) -this.anInt3097 / (float) this.anInt3092;
		@Pc(27) float local27 = (float) -this.anInt3102 * this.aFloat40 / (float) this.anInt3100;
		@Pc(42) float local42 = this.aFloat40 * (float) (this.anInt3032 - this.anInt3097) / (float) this.anInt3092;
		@Pc(57) float local57 = (float) (this.anInt3074 - this.anInt3102) * this.aFloat40 / (float) this.anInt3100;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local42 && local27 != local57) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) ((float) this.anInt3122 - this.aFloat34), (double) ((float) this.anInt3090 - this.aFloat34));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(IZ)V")
	public void method2485(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean224 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt3104 &= 0xFFFFFFE0;
		this.aBoolean224 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIF)Lclient!ve;")
	@Override
	public Class3_Sub23 method2604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub23_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gk", name = "B", descriptor = "()Z")
	@Override
	public boolean method2641() {
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IFFFF)V")
	public void method2486(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static101.aFloatArray16[1] = arg2;
		Static101.aFloatArray16[2] = arg1;
		Static101.aFloatArray16[0] = arg3;
		Static101.aFloatArray16[3] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static101.aFloatArray16, 0);
	}

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "()Z")
	@Override
	public boolean method2585() {
		return false;
	}
}
