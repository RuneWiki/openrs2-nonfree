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

@OriginalClass("client!rl")
public final class Class66_Sub2 extends Class66 {

	@OriginalMember(owner = "client!rl", name = "Ub", descriptor = "I")
	public int anInt6028;

	@OriginalMember(owner = "client!rl", name = "hc", descriptor = "I")
	public int anInt6041;

	@OriginalMember(owner = "client!rl", name = "td", descriptor = "I")
	private int anInt6103;

	@OriginalMember(owner = "client!rl", name = "Vd", descriptor = "I")
	private int anInt6129;

	@OriginalMember(owner = "client!rl", name = "pe", descriptor = "I")
	public int anInt6140;

	@OriginalMember(owner = "client!rl", name = "re", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!rl", name = "we", descriptor = "Lclient!ht;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!rl", name = "De", descriptor = "Lclient!ht;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!rl", name = "Ee", descriptor = "I")
	private int anInt6146;

	@OriginalMember(owner = "client!rl", name = "Fe", descriptor = "I")
	public int anInt6147;

	@OriginalMember(owner = "client!rl", name = "He", descriptor = "I")
	public int anInt6148;

	@OriginalMember(owner = "client!rl", name = "Oe", descriptor = "Z")
	private boolean aBoolean371;

	@OriginalMember(owner = "client!rl", name = "Te", descriptor = "Lclient!pr;")
	public Class200 aClass200_6;

	@OriginalMember(owner = "client!rl", name = "Ue", descriptor = "Lclient!ud;")
	public Class19_Sub4 aClass19_Sub4_5;

	@OriginalMember(owner = "client!rl", name = "We", descriptor = "Lclient!ud;")
	public Class19_Sub4 aClass19_Sub4_6;

	@OriginalMember(owner = "client!rl", name = "Xe", descriptor = "Z")
	public boolean aBoolean373;

	@OriginalMember(owner = "client!rl", name = "Ze", descriptor = "Lclient!ms;")
	private Interface5 anInterface5_4;

	@OriginalMember(owner = "client!rl", name = "cf", descriptor = "Lclient!bh;")
	public Class23 aClass23_9;

	@OriginalMember(owner = "client!rl", name = "df", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!rl", name = "ff", descriptor = "Lclient!ud;")
	public Class19_Sub4 aClass19_Sub4_7;

	@OriginalMember(owner = "client!rl", name = "gf", descriptor = "I")
	public int anInt6153;

	@OriginalMember(owner = "client!rl", name = "hf", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!rl", name = "jf", descriptor = "Lclient!uc;")
	public Class224_Sub2 aClass224_Sub2_1;

	@OriginalMember(owner = "client!rl", name = "lf", descriptor = "I")
	private int anInt6154;

	@OriginalMember(owner = "client!rl", name = "of", descriptor = "Z")
	public boolean aBoolean375;

	@OriginalMember(owner = "client!rl", name = "pf", descriptor = "I")
	private int anInt6157;

	@OriginalMember(owner = "client!rl", name = "rf", descriptor = "F")
	private float aFloat70;

	@OriginalMember(owner = "client!rl", name = "sf", descriptor = "[Lclient!tu;")
	private Class19[] aClass19Array1;

	@OriginalMember(owner = "client!rl", name = "tf", descriptor = "Z")
	public boolean aBoolean376;

	@OriginalMember(owner = "client!rl", name = "uf", descriptor = "I")
	private int anInt6159;

	@OriginalMember(owner = "client!rl", name = "wf", descriptor = "Lclient!oc;")
	private Class19_Sub4_Sub1 aClass19_Sub4_Sub1_5;

	@OriginalMember(owner = "client!rl", name = "yf", descriptor = "Z")
	private boolean aBoolean377;

	@OriginalMember(owner = "client!rl", name = "zf", descriptor = "Lclient!uc;")
	public Class224_Sub2 aClass224_Sub2_2;

	@OriginalMember(owner = "client!rl", name = "Af", descriptor = "Lclient!lp;")
	private Interface4 anInterface4_3;

	@OriginalMember(owner = "client!rl", name = "Bf", descriptor = "Lclient!uc;")
	public Class224_Sub2 aClass224_Sub2_3;

	@OriginalMember(owner = "client!rl", name = "Cf", descriptor = "Lclient!ms;")
	private Interface5 anInterface5_5;

	@OriginalMember(owner = "client!rl", name = "Ef", descriptor = "I")
	private int anInt6161;

	@OriginalMember(owner = "client!rl", name = "Ff", descriptor = "Z")
	public boolean aBoolean378;

	@OriginalMember(owner = "client!rl", name = "Gf", descriptor = "Lclient!uc;")
	public Class224_Sub2 aClass224_Sub2_4;

	@OriginalMember(owner = "client!rl", name = "Jf", descriptor = "I")
	public int anInt6164;

	@OriginalMember(owner = "client!rl", name = "Kf", descriptor = "Z")
	private boolean aBoolean379;

	@OriginalMember(owner = "client!rl", name = "Lf", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!rl", name = "Nf", descriptor = "Lclient!ml;")
	public Class5_Sub2 aClass5_Sub2_3;

	@OriginalMember(owner = "client!rl", name = "Of", descriptor = "Lclient!uc;")
	public Class224_Sub2 aClass224_Sub2_5;

	@OriginalMember(owner = "client!rl", name = "Pf", descriptor = "I")
	private int anInt6166;

	@OriginalMember(owner = "client!rl", name = "Rf", descriptor = "I")
	private int anInt6167;

	@OriginalMember(owner = "client!rl", name = "Wf", descriptor = "I")
	private int anInt6169;

	@OriginalMember(owner = "client!rl", name = "Xf", descriptor = "Z")
	public boolean aBoolean380;

	@OriginalMember(owner = "client!rl", name = "ag", descriptor = "I")
	private int anInt6172;

	@OriginalMember(owner = "client!rl", name = "bg", descriptor = "Lclient!fr;")
	private Class82_Sub1 aClass82_Sub1_1;

	@OriginalMember(owner = "client!rl", name = "eg", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!rl", name = "gg", descriptor = "Z")
	public boolean aBoolean384;

	@OriginalMember(owner = "client!rl", name = "kg", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!rl", name = "mg", descriptor = "Lclient!uc;")
	public Class224_Sub2 aClass224_Sub2_6;

	@OriginalMember(owner = "client!rl", name = "og", descriptor = "I")
	private int anInt6176;

	@OriginalMember(owner = "client!rl", name = "pg", descriptor = "Ljava/lang/String;")
	private String aString49;

	@OriginalMember(owner = "client!rl", name = "qg", descriptor = "F")
	private float aFloat79;

	@OriginalMember(owner = "client!rl", name = "rg", descriptor = "F")
	private float aFloat80;

	@OriginalMember(owner = "client!rl", name = "sg", descriptor = "I")
	public int anInt6177;

	@OriginalMember(owner = "client!rl", name = "tg", descriptor = "Z")
	private boolean aBoolean385;

	@OriginalMember(owner = "client!rl", name = "vg", descriptor = "Z")
	private boolean aBoolean386;

	@OriginalMember(owner = "client!rl", name = "wg", descriptor = "Lclient!uc;")
	public Class224_Sub2 aClass224_Sub2_7;

	@OriginalMember(owner = "client!rl", name = "xg", descriptor = "Z")
	private boolean aBoolean387;

	@OriginalMember(owner = "client!rl", name = "yg", descriptor = "Lclient!pr;")
	public Class200 aClass200_7;

	@OriginalMember(owner = "client!rl", name = "zg", descriptor = "Ljava/lang/String;")
	private String aString50;

	@OriginalMember(owner = "client!rl", name = "Bg", descriptor = "Z")
	private boolean aBoolean388;

	@OriginalMember(owner = "client!rl", name = "Dg", descriptor = "Z")
	private boolean aBoolean389;

	@OriginalMember(owner = "client!rl", name = "Eg", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!rl", name = "Fg", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!rl", name = "Jg", descriptor = "I")
	private int anInt6180;

	@OriginalMember(owner = "client!rl", name = "Kg", descriptor = "I")
	private int anInt6181;

	@OriginalMember(owner = "client!rl", name = "Mg", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!rl", name = "Ng", descriptor = "Lclient!uc;")
	public Class224_Sub2 aClass224_Sub2_8;

	@OriginalMember(owner = "client!rl", name = "Og", descriptor = "I")
	public int anInt6183;

	@OriginalMember(owner = "client!rl", name = "Pg", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!rl", name = "Qg", descriptor = "Lclient!uc;")
	public Class224_Sub2 aClass224_Sub2_9;

	@OriginalMember(owner = "client!rl", name = "Rg", descriptor = "Z")
	public boolean aBoolean391;

	@OriginalMember(owner = "client!rl", name = "Vg", descriptor = "I")
	private int anInt6186;

	@OriginalMember(owner = "client!rl", name = "Wg", descriptor = "Lclient!ml;")
	public Class5_Sub2 aClass5_Sub2_4;

	@OriginalMember(owner = "client!rl", name = "Xg", descriptor = "Z")
	public boolean aBoolean392;

	@OriginalMember(owner = "client!rl", name = "Yg", descriptor = "Z")
	public boolean aBoolean393;

	@OriginalMember(owner = "client!rl", name = "Zg", descriptor = "I")
	private int anInt6187;

	@OriginalMember(owner = "client!rl", name = "bh", descriptor = "Z")
	private boolean aBoolean395;

	@OriginalMember(owner = "client!rl", name = "ch", descriptor = "Lclient!bh;")
	public Class23 aClass23_10;

	@OriginalMember(owner = "client!rl", name = "fh", descriptor = "Lclient!uc;")
	public Class224_Sub2 aClass224_Sub2_10;

	@OriginalMember(owner = "client!rl", name = "ee", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!rl", name = "je", descriptor = "I")
	public int anInt6139 = 128;

	@OriginalMember(owner = "client!rl", name = "ge", descriptor = "Lclient!bl;")
	private final Class26 aClass26_1 = new Class26();

	@OriginalMember(owner = "client!rl", name = "ne", descriptor = "Lclient!ml;")
	private final Class5_Sub2 aClass5_Sub2_1 = new Class5_Sub2();

	@OriginalMember(owner = "client!rl", name = "oe", descriptor = "Lclient!ml;")
	public final Class5_Sub2 aClass5_Sub2_2 = new Class5_Sub2();

	@OriginalMember(owner = "client!rl", name = "se", descriptor = "I")
	public int anInt6141 = 3;

	@OriginalMember(owner = "client!rl", name = "qe", descriptor = "Z")
	private boolean aBoolean370 = false;

	@OriginalMember(owner = "client!rl", name = "ve", descriptor = "I")
	public int anInt6142 = 8;

	@OriginalMember(owner = "client!rl", name = "ue", descriptor = "Lclient!um;")
	private final Class244 aClass244_29 = new Class244();

	@OriginalMember(owner = "client!rl", name = "ye", descriptor = "I")
	private int anInt6143 = -1;

	@OriginalMember(owner = "client!rl", name = "Be", descriptor = "I")
	private int anInt6144 = -1;

	@OriginalMember(owner = "client!rl", name = "xe", descriptor = "[Lclient!ht;")
	private final Interface2[] anInterface2Array1 = new Interface2[4];

	@OriginalMember(owner = "client!rl", name = "Ae", descriptor = "[Lclient!ht;")
	private final Interface2[] anInterface2Array3 = new Interface2[4];

	@OriginalMember(owner = "client!rl", name = "Ce", descriptor = "I")
	private int anInt6145 = -1;

	@OriginalMember(owner = "client!rl", name = "ze", descriptor = "[Lclient!ht;")
	private final Interface2[] anInterface2Array2 = new Interface2[4];

	@OriginalMember(owner = "client!rl", name = "Ge", descriptor = "Lclient!um;")
	private final Class244 aClass244_30;

	@OriginalMember(owner = "client!rl", name = "Ie", descriptor = "Lclient!um;")
	private final Class244 aClass244_31;

	@OriginalMember(owner = "client!rl", name = "Je", descriptor = "Lclient!um;")
	private final Class244 aClass244_32;

	@OriginalMember(owner = "client!rl", name = "Ke", descriptor = "Lclient!um;")
	private final Class244 aClass244_33;

	@OriginalMember(owner = "client!rl", name = "Le", descriptor = "Lclient!um;")
	private final Class244 aClass244_34;

	@OriginalMember(owner = "client!rl", name = "Me", descriptor = "Lclient!um;")
	private final Class244 aClass244_35;

	@OriginalMember(owner = "client!rl", name = "Ne", descriptor = "Lclient!um;")
	private final Class244 aClass244_36;

	@OriginalMember(owner = "client!rl", name = "Re", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!rl", name = "bf", descriptor = "Z")
	private boolean bf;

	@OriginalMember(owner = "client!rl", name = "xf", descriptor = "I")
	public int anInt6160;

	@OriginalMember(owner = "client!rl", name = "If", descriptor = "I")
	public int anInt6163;

	@OriginalMember(owner = "client!rl", name = "Se", descriptor = "I")
	public int anInt6151;

	@OriginalMember(owner = "client!rl", name = "Ye", descriptor = "I")
	private int anInt6152;

	@OriginalMember(owner = "client!rl", name = "qf", descriptor = "I")
	private int anInt6158;

	@OriginalMember(owner = "client!rl", name = "ef", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!rl", name = "Tf", descriptor = "I")
	private int anInt6168;

	@OriginalMember(owner = "client!rl", name = "af", descriptor = "[Lclient!dq;")
	private final Class6_Sub11[] aClass6_Sub11Array2;

	@OriginalMember(owner = "client!rl", name = "Uf", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!rl", name = "hg", descriptor = "I")
	public int anInt6173;

	@OriginalMember(owner = "client!rl", name = "lg", descriptor = "F")
	private float aFloat78;

	@OriginalMember(owner = "client!rl", name = "ug", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!rl", name = "ig", descriptor = "I")
	private int anInt6174;

	@OriginalMember(owner = "client!rl", name = "Sf", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!rl", name = "fg", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!rl", name = "mf", descriptor = "I")
	private int anInt6155;

	@OriginalMember(owner = "client!rl", name = "Hf", descriptor = "I")
	private int anInt6162;

	@OriginalMember(owner = "client!rl", name = "Mf", descriptor = "I")
	public int anInt6165;

	@OriginalMember(owner = "client!rl", name = "vf", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!rl", name = "Ig", descriptor = "I")
	public int anInt6179;

	@OriginalMember(owner = "client!rl", name = "ng", descriptor = "[F")
	private final float[] aFloatArray23;

	@OriginalMember(owner = "client!rl", name = "Lg", descriptor = "I")
	public int anInt6182;

	@OriginalMember(owner = "client!rl", name = "Df", descriptor = "F")
	private float aFloat72;

	@OriginalMember(owner = "client!rl", name = "Qe", descriptor = "I")
	private int anInt6150;

	@OriginalMember(owner = "client!rl", name = "Vf", descriptor = "[F")
	private final float[] aFloatArray22;

	@OriginalMember(owner = "client!rl", name = "Ag", descriptor = "I")
	public int anInt6178;

	@OriginalMember(owner = "client!rl", name = "Tg", descriptor = "I")
	public int anInt6185;

	@OriginalMember(owner = "client!rl", name = "Yf", descriptor = "I")
	public int anInt6170;

	@OriginalMember(owner = "client!rl", name = "jg", descriptor = "I")
	private int anInt6175;

	@OriginalMember(owner = "client!rl", name = "Ug", descriptor = "[F")
	private final float[] aFloatArray25;

	@OriginalMember(owner = "client!rl", name = "Pe", descriptor = "I")
	public int anInt6149;

	@OriginalMember(owner = "client!rl", name = "Cg", descriptor = "[F")
	private final float[] aFloatArray24;

	@OriginalMember(owner = "client!rl", name = "nf", descriptor = "I")
	private int anInt6156;

	@OriginalMember(owner = "client!rl", name = "Gg", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!rl", name = "Sg", descriptor = "I")
	private int anInt6184;

	@OriginalMember(owner = "client!rl", name = "Qf", descriptor = "[F")
	public final float[] aFloatArray21;

	@OriginalMember(owner = "client!rl", name = "eh", descriptor = "F")
	private float aFloat86;

	@OriginalMember(owner = "client!rl", name = "Jb", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas5;

	@OriginalMember(owner = "client!rl", name = "nc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!rl", name = "he", descriptor = "I")
	public final int anInt6138;

	@OriginalMember(owner = "client!rl", name = "xb", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!rl", name = "Kd", descriptor = "J")
	private final long aLong175;

	@OriginalMember(owner = "client!rl", name = "de", descriptor = "J")
	private long aLong176;

	@OriginalMember(owner = "client!rl", name = "Zf", descriptor = "I")
	public final int anInt6171;

	@OriginalMember(owner = "client!rl", name = "kf", descriptor = "Z")
	public boolean aBoolean374;

	@OriginalMember(owner = "client!rl", name = "ah", descriptor = "Z")
	public boolean aBoolean394;

	@OriginalMember(owner = "client!rl", name = "dg", descriptor = "Z")
	private boolean aBoolean382;

	@OriginalMember(owner = "client!rl", name = "dh", descriptor = "Z")
	public boolean aBoolean396;

	@OriginalMember(owner = "client!rl", name = "Hg", descriptor = "Z")
	private boolean aBoolean390;

	@OriginalMember(owner = "client!rl", name = "Ve", descriptor = "Z")
	public boolean aBoolean372;

	@OriginalMember(owner = "client!rl", name = "cg", descriptor = "Z")
	private final boolean aBoolean381;

	@OriginalMember(owner = "client!rl", name = "ke", descriptor = "Lclient!eu;")
	public final Class69 aClass69_1;

	@OriginalMember(owner = "client!rl", name = "te", descriptor = "Lclient!wa;")
	public final Class258 aClass258_1;

	@OriginalMember(owner = "client!rl", name = "me", descriptor = "Lclient!ji;")
	private final Class130 aClass130_1;

	@OriginalMember(owner = "client!rl", name = "le", descriptor = "Lclient!qq;")
	private Class6_Sub16_Sub1 aClass6_Sub16_Sub1_1;

	@OriginalMember(owner = "client!rl", name = "ie", descriptor = "Lclient!mj;")
	private final Class165 aClass165_1;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ps;ILclient!qn;)V")
	public Class66_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class209 arg4) {
		super(arg0, arg2);
		new Class170();
		new Class74(16);
		this.aClass244_30 = new Class244();
		this.aClass244_31 = new Class244();
		this.aClass244_32 = new Class244();
		this.aClass244_33 = new Class244();
		this.aClass244_34 = new Class244();
		this.aClass244_35 = new Class244();
		this.aClass244_36 = new Class244();
		this.aFloat66 = 3584.0F;
		this.bf = true;
		this.anInt6160 = 0;
		this.anInt6163 = 512;
		this.anInt6151 = 0;
		this.anInt6152 = -1;
		this.anInt6158 = 0;
		this.aFloat68 = 3584.0F;
		this.anInt6168 = 0;
		this.aClass6_Sub11Array2 = new Class6_Sub11[Static17.anInt520];
		this.aFloat75 = -1.0F;
		this.anInt6173 = 0;
		this.aFloat78 = 1.0F;
		this.aFloat81 = -1.0F;
		this.anInt6174 = 8448;
		this.aFloat74 = 1.0F;
		this.aFloat76 = 1.0F;
		this.anInt6155 = 8448;
		this.anInt6162 = 0;
		this.anInt6165 = -1;
		this.aFloat71 = 3000.0F;
		this.anInt6179 = -1;
		this.aFloatArray23 = new float[4];
		this.anInt6182 = -1;
		this.aFloat72 = 0.0F;
		this.anInt6150 = 0;
		this.aFloatArray22 = new float[4];
		this.anInt6178 = 50;
		this.anInt6185 = 3584;
		this.anInt6170 = 0;
		this.anInt6175 = -1;
		this.aFloatArray25 = new float[4];
		this.anInt6149 = 512;
		this.aFloatArray24 = new float[16];
		this.anInt6156 = 0;
		this.aFloat84 = 1.0F;
		this.anInt6184 = 0;
		this.aFloatArray21 = new float[4];
		this.aFloat86 = 1.0F;
		this.aCanvas6 = this.aCanvas5 = arg1;
		this.anInt6138 = arg3;
		try {
			if (Static24.aBoolean36 == null || !Static24.aBoolean36) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static24.aBoolean36 = Boolean.TRUE;
				} else {
					@Pc(254) String local254 = System.getProperty("os.name").toLowerCase();
					if (!local254.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local254.startsWith("linux") || local254.startsWith("sunos")) {
						System.load(arg4.method4700("libjaggl.so").toString());
					} else if (local254.startsWith("mac")) {
						System.load(arg4.method4700("libjaggl.jnilib").toString());
					} else if (local254.startsWith("win")) {
						System.load(arg4.method4700("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static24.aBoolean36 = Boolean.TRUE;
				}
			}
			if (Static24.aBoolean36 == null || !Static24.aBoolean36) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong176 = this.aLong175 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt6138);
			if (this.aLong175 == 0L) {
				throw new RuntimeException("");
			}
			this.method5129();
			@Pc(355) int local355 = this.method5083();
			if (local355 != 0) {
				throw new RuntimeException("");
			}
			this.anInt6171 = this.aBoolean373 ? 33639 : 5121;
			@Pc(379) int local379;
			if (this.aString49.indexOf("radeon") != -1) {
				local379 = 0;
				@Pc(381) boolean local381 = false;
				@Pc(383) boolean local383 = false;
				@Pc(392) String[] local392 = Static142.method2449(this.aString49.replace('/', ' '), ' ');
				for (@Pc(394) int local394 = 0; local394 < local392.length; local394++) {
					@Pc(400) String local400 = local392[local394];
					try {
						if (local400.length() > 0) {
							if (local400.charAt(0) == 'x' && local400.length() >= 3 && Static57.method1273(local400.substring(1, 3))) {
								local400 = local400.substring(1);
								local383 = true;
							}
							if (local400.equals("hd")) {
								local381 = true;
							} else {
								if (local400.startsWith("hd")) {
									local400 = local400.substring(2);
									local381 = true;
								}
								if (local400.length() >= 4 && Static57.method1273(local400.substring(0, 4))) {
									local379 = Static221.method3333(local400.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(465) Exception local465) {
					}
				}
				if (!local381 || local379 < 4000) {
					this.aBoolean374 = false;
				}
				if (!local383 && !local381) {
					if (local379 >= 7000 && local379 <= 9250) {
						this.aBoolean394 = false;
					}
					if (local379 >= 7000 && local379 <= 7999) {
						this.aBoolean382 = false;
					}
				}
				this.aBoolean396 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean390 = this.aBoolean382;
			}
			if (this.aString50.indexOf("intel") != -1) {
				this.aBoolean372 = false;
			}
			this.aBoolean381 = !this.aString50.equals("s3 graphics");
			if (this.aBoolean382) {
				try {
					@Pc(544) int[] local544 = new int[1];
					OpenGL.glGenBuffersARB(1, local544, 0);
				} catch (@Pc(550) Throwable local550) {
					throw new RuntimeException("");
				}
			}
			Static138.method3845(true);
			this.aBoolean370 = true;
			this.aClass69_1 = new Class69(this, super.anInterface8_5);
			this.method5107();
			this.aClass258_1 = new Class258(this);
			this.aClass130_1 = new Class130(this);
			if (this.aClass130_1.method3023()) {
				this.aClass6_Sub16_Sub1_1 = new Class6_Sub16_Sub1(this);
				if (!this.aClass6_Sub16_Sub1_1.method4755()) {
					this.aClass6_Sub16_Sub1_1.method4745();
					this.aClass6_Sub16_Sub1_1 = null;
				}
			}
			this.aClass165_1 = new Class165(this);
			this.method5156();
			this.method5123();
			OpenGL.glClear(16640);
			local379 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(629) Exception local629) {
					if (local379++ > 5) {
						throw new RuntimeException("");
					}
					Static88.method4161(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(649) Throwable local649) {
			local649.printStackTrace();
			this.method5041();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)[I")
	@Override
	public int[] method4992() {
		@Pc(10) int[] local10 = new int[1152];
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			OpenGL.glReadPixelsi(0, this.anInt6028 - local12, 36, 1, 32993, this.anInt6171, local10, local12 * 36);
		}
		return local10;
	}

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "()Z")
	@Override
	public boolean method4999() {
		if (this.aClass6_Sub16_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass6_Sub16_Sub1_1.method4747()) {
			if (!this.aClass130_1.method3024(this.aClass6_Sub16_Sub1_1)) {
				return false;
			}
			this.aClass69_1.method1820();
		}
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)V")
	public void method5075(@OriginalArg(0) int arg0) {
		if (this.anInt6159 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt6159 = arg0;
		}
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void method5059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FI)V")
	public void method5076(@OriginalArg(0) float arg0) {
		if (this.aFloat86 != arg0) {
			this.aFloat86 = arg0;
			if (this.anInt6176 == 3) {
				this.method5152();
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(IIII)V")
	@Override
	public void method5044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > this.anInt6041) {
			arg2 = this.anInt6041;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt6028) {
			arg3 = this.anInt6028;
		}
		this.anInt6158 = arg0;
		this.anInt6156 = arg2;
		this.anInt6184 = arg3;
		this.anInt6150 = arg1;
		OpenGL.glEnable(3089);
		this.method5082();
		this.method5157();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZII)V")
	public synchronized void method5077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub39 local8 = new Class6_Sub39(arg0);
		local8.aLong229 = arg1;
		this.aClass244_31.method5966(local8);
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(II)V")
	public void method5078(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt6186) {
			return;
		}
		@Pc(20) boolean local20;
		@Pc(22) byte local22;
		if (arg0 == 1) {
			local20 = true;
			local22 = 1;
		} else if (arg0 == 2) {
			local20 = false;
			local22 = 2;
		} else if (arg0 == 128) {
			local20 = true;
			local22 = 3;
		} else {
			local22 = 0;
			local20 = false;
		}
		if (!this.aBoolean395) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean395 = true;
		}
		if (this.aBoolean388 != local20) {
			if (local20) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean388 = local20;
		}
		if (local22 != this.anInt6154) {
			if (local22 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local22 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local22 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt6154 = local22;
		}
		this.anInt6157 &= 0xFFFFFFE3;
		this.anInt6186 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFIFF)V")
	public void method5079(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static86.aFloatArray4[2] = arg0;
		Static86.aFloatArray4[1] = arg1;
		Static86.aFloatArray4[3] = arg2;
		Static86.aFloatArray4[0] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static86.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method5137();
		this.method5078(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean379) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean379) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "()V")
	@Override
	protected void method5041() {
		for (@Pc(10) Class6 local10 = this.aClass244_29.method5976(); local10 != null; local10 = this.aClass244_29.method5964()) {
			((Class6_Sub15_Sub1) local10).method1914();
		}
		if (this.aClass130_1 != null) {
			this.aClass130_1.method3019();
		}
		if (this.anOpenGL1 != null) {
			this.method5114();
			@Pc(40) Enumeration local40 = this.aHashtable2.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable2.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean370) {
			Static163.method2685(true);
			this.aBoolean370 = false;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method5033(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt6152 != arg0;
		if (local15 || this.aFloat81 != arg1 || this.aFloat75 != arg2) {
			this.aFloat75 = arg2;
			this.aFloat81 = arg1;
			this.anInt6152 = arg0;
			if (local15) {
				this.aFloat84 = (float) (this.anInt6152 & 0xFF) / 255.0F;
				this.aFloat76 = (float) (this.anInt6152 & 0xFF00) / 65280.0F;
				this.aFloat74 = (float) (this.anInt6152 & 0xFF0000) / 1.671168E7F;
				this.method5095();
			}
			this.method5108();
		}
		if (arg3 == this.aFloatArray22[0] && arg4 == this.aFloatArray22[1] && this.aFloatArray22[2] == arg5) {
			return;
		}
		this.aFloatArray22[0] = arg3;
		this.aFloatArray22[2] = arg5;
		this.aFloatArray22[1] = arg4;
		this.aFloatArray25[1] = -arg4;
		this.aFloatArray25[2] = -arg5;
		this.aFloatArray25[0] = -arg3;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray21[0] = local142 * arg3;
		this.aFloatArray21[2] = local142 * arg5;
		this.aFloatArray21[1] = arg4 * local142;
		this.aFloatArray23[0] = -this.aFloatArray21[0];
		this.aFloatArray23[1] = -this.aFloatArray21[1];
		this.aFloatArray23[2] = -this.aFloatArray21[2];
		this.method5097();
		this.anInt6153 = (int) (arg5 * 256.0F / arg4);
		this.anInt6183 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!rl", name = "A", descriptor = "()Z")
	@Override
	public boolean method5056() {
		return this.aClass6_Sub16_Sub1_1 != null && this.aClass6_Sub16_Sub1_1.method4747();
	}

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "(I)V")
	private void method5080() {
		if (this.aBoolean389 && this.aBoolean376 | this.anInt6182 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBII)V")
	public void method5081(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
	private void method5082() {
		this.aFloat73 = this.anInt6158 - this.anInt6170;
		this.aFloat67 = this.anInt6150 - this.anInt6160;
		this.aFloat85 = this.anInt6156 - this.anInt6170;
		this.aFloat83 = this.anInt6184 - this.anInt6160;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4968(@OriginalArg(0) Canvas arg0) {
		this.aCanvas6 = null;
		this.aLong176 = 0L;
		if (arg0 == null || arg0 == this.aCanvas5) {
			this.aLong176 = this.aLong175;
			this.aCanvas6 = this.aCanvas5;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable2.get(arg0);
			this.aLong176 = local36;
			this.aCanvas6 = arg0;
		}
		if (this.aCanvas6 == null || this.aLong176 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong176);
		this.method5123();
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)I")
	private int method5083() {
		this.aString50 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString49 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString50.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString50.indexOf("brian paul") != -1 || this.aString50.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(52) String[] local52 = Static142.method2449(local44.replace('.', ' '), ' ');
		if (local52.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(68) int local68 = Static221.method3333(local52[0]);
				@Pc(74) int local74 = Static221.method3333(local52[1]);
				this.anInt6161 = local74 + local68 * 10;
			} catch (@Pc(83) NumberFormatException local83) {
				local10 |= 0x4;
			}
		}
		if (this.anInt6161 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(119) int[] local119 = new int[1];
		OpenGL.glGetIntegerv(34018, local119, 0);
		this.anInt6164 = local119[0];
		OpenGL.glGetIntegerv(34929, local119, 0);
		this.anInt6172 = local119[0];
		OpenGL.glGetIntegerv(34930, local119, 0);
		this.anInt6181 = local119[0];
		if (this.anInt6164 < 2 || this.anInt6172 < 2 || this.anInt6181 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean373 = NativeStream.a();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean382 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean379 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean391 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean378 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean375 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean394 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean396 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean392 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean374 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean393 = false;
		this.aBoolean372 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean384 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean380 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean377 = this.aBoolean380 & this.aBoolean384;
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIF)Lclient!dq;")
	@Override
	public Class6_Sub11 method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub11_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(IIII)V")
	@Override
	public void method5042() {
		this.anInt6173 = 127;
		this.anInt6175 = 1583160;
		this.anInt6177 = -1;
		this.anInt6179 = 40;
		this.aBoolean376 = true;
		this.aClass165_1.method3828(false, false, 3);
		this.aClass165_1.aClass12_Sub5_1.method3698();
		this.method5139();
		this.method5080();
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5052(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas5) {
			local5 = this.aLong175;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable2.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas6) {
			this.method5123();
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V")
	@Override
	public void method4996(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!fl;IIII)Lclient!va;")
	@Override
	public Class224 method4971(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class224_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FIF)V")
	public void method5084(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat78 = arg1;
		this.aFloat72 = arg0;
		if (!this.aBoolean376) {
			this.method5139();
		}
	}

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "(I)V")
	public void method5085() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([IIIII)Lclient!qg;")
	@Override
	public Class87 method5018(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class87_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "(I)V")
	private void method5086() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass5_Sub2_3.method3852(), 0);
		if (this.aBoolean376) {
			this.aClass165_1.aClass12_Sub5_1.method3698();
		}
		this.method5097();
		this.method5147();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!bh;ILclient!bh;Lclient!bh;Lclient!bh;)V")
	public void method5087(@OriginalArg(0) Class23 arg0, @OriginalArg(2) Class23 arg1, @OriginalArg(3) Class23 arg2, @OriginalArg(4) Class23 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5119(arg1.anInterface5_1);
			OpenGL.glVertexPointer(arg1.aByte3, arg1.aShort3, this.anInterface5_4.method6168(), this.anInterface5_4.method6165() + (long) arg1.aByte4);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5119(arg2.anInterface5_1);
			OpenGL.glNormalPointer(arg2.aShort3, this.anInterface5_4.method6168(), this.anInterface5_4.method6165() + (long) arg2.aByte4);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5119(arg0.anInterface5_1);
			OpenGL.glColorPointer(arg0.aByte3, arg0.aShort3, this.anInterface5_4.method6168(), this.anInterface5_4.method6165() + (long) arg0.aByte4);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5119(arg3.anInterface5_1);
			OpenGL.glTexCoordPointer(arg3.aByte3, arg3.aShort3, this.anInterface5_4.method6168(), this.anInterface5_4.method6165() + (long) arg3.aByte4);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6170 = arg0;
		this.anInt6160 = arg1;
		this.anInt6163 = arg3;
		this.anInt6149 = arg2;
		this.method5149();
		this.method5082();
		if (this.anInt6176 == 3) {
			this.method5152();
		} else if (this.anInt6176 == 2) {
			this.method5089();
			return;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZILclient!jaggl/memory/NativeBuffer;I)Lclient!ms;")
	public Interface5 method5088(@OriginalArg(0) int arg0, @OriginalArg(3) NativeBuffer arg1, @OriginalArg(4) int arg2) {
		return (Interface5) (this.aBoolean382 ? new Class112_Sub2(this, arg2, arg1, arg0, false) : new Class90_Sub1(this, arg2, arg1));
	}

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "(I)V")
	private void method5089() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray24, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method5137();
		this.method5078(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean379) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean379) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(II)I")
	@Override
	public int method5062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(IIIII)V")
	@Override
	public void method5027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5137();
		this.method5078(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZZ)V")
	public void method5090(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean383) {
			this.aBoolean383 = arg0;
			this.method5144();
		}
	}

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "()Z")
	@Override
	public boolean method4985() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "()Z")
	@Override
	public boolean method5049() {
		return this.aClass6_Sub16_Sub1_1 != null && (this.anInt6138 <= 1 || this.aBoolean377);
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(II)V")
	public void method5091(@OriginalArg(0) int arg0) {
		Static86.aFloatArray4[3] = (float) (arg0 >>> 24) / 255.0F;
		Static86.aFloatArray4[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static86.aFloatArray4[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static86.aFloatArray4[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static86.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "()F")
	@Override
	public float method5015() {
		return this.aFloat82;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V")
	public void method5092() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!rl", name = "E", descriptor = "()V")
	@Override
	public void method5066() {
		if (!this.aBoolean381 || this.anInt6041 <= 0 || this.anInt6028 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt6158;
		@Pc(22) int local22 = this.anInt6156;
		@Pc(25) int local25 = this.anInt6150;
		@Pc(28) int local28 = this.anInt6184;
		this.method5070();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5127();
		this.method5106(false);
		this.method5110(false);
		this.method5094(false);
		this.method5134(false);
		this.method5109(null);
		this.method5093(-2);
		this.method5140(1);
		this.method5078(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt6041, this.anInt6028, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method5044(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(II)V")
	public void method5093(@OriginalArg(1) int arg0) {
		this.method5146(arg0, true);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V")
	public void method5094(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean371) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean371 = arg0;
		this.anInt6157 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!gs;)V")
	@Override
	public void method5071(@OriginalArg(0) Class5 arg0) {
		this.aClass5_Sub2_3 = (Class5_Sub2) arg0;
		this.aClass5_Sub2_4.method3850(this.aClass5_Sub2_3);
		if (this.anInt6176 != 1) {
			this.method5086();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
	@Override
	public void method5009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6165 == arg0 && this.anInt6182 == arg1 && this.anInt6151 == arg2) {
			return;
		}
		this.anInt6182 = arg1;
		this.anInt6165 = arg0;
		this.anInt6151 = arg2;
		if (this.aBoolean376) {
			return;
		}
		this.method5139();
		this.method5080();
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V")
	private void method5095() {
		Static86.aFloatArray4[3] = 1.0F;
		Static86.aFloatArray4[2] = this.aFloat84 * this.aFloat77;
		Static86.aFloatArray4[1] = this.aFloat77 * this.aFloat76;
		Static86.aFloatArray4[0] = this.aFloat77 * this.aFloat74;
		OpenGL.glLightModelfv(2899, Static86.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZJ)V")
	public synchronized void method5096(@OriginalArg(1) long arg0) {
		@Pc(11) Class6 local11 = new Class6();
		local11.aLong229 = arg0;
		this.aClass244_36.method5966(local11);
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(B)V")
	public void method5097() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray21, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!ht;)V")
	public void method5098(@OriginalArg(1) Interface2 arg0) {
		if (this.aBoolean384) {
			this.method5133(arg0);
			this.method5115(arg0);
		} else if (this.anInt6145 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt6145 >= 0) {
				this.anInterface2Array2[this.anInt6145].method4538();
			}
			this.anInterface2_2 = this.anInterface2_1 = this.anInterface2Array2[++this.anInt6145] = arg0;
			this.anInterface2_2.method4535();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4994(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4977();
	}

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "()Z")
	@Override
	public boolean method5031() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "B", descriptor = "()Lclient!gs;")
	@Override
	public Class5 method5057() {
		return new Class5_Sub2();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(41) float local41;
		if (this.aClass19_Sub4_Sub1_5 == null || arg2 > this.aClass19_Sub4_Sub1_5.anInt5083 || arg3 > this.aClass19_Sub4_Sub1_5.anInt5081) {
			this.aClass19_Sub4_Sub1_5 = Static203.method3130(this, arg6, arg3, arg2);
			this.aClass19_Sub4_Sub1_5.method4257(false, false);
			local41 = this.aClass19_Sub4_Sub1_5.aFloat54;
			local45 = this.aClass19_Sub4_Sub1_5.aFloat55;
		} else {
			this.aClass19_Sub4_Sub1_5.method4256(false, arg3, arg2, 6406, arg6);
			local45 = (float) arg3 * this.aClass19_Sub4_Sub1_5.aFloat55 / (float) this.aClass19_Sub4_Sub1_5.anInt5081;
			local41 = this.aClass19_Sub4_Sub1_5.aFloat54 * (float) arg2 / (float) this.aClass19_Sub4_Sub1_5.anInt5083;
		}
		this.method5151();
		this.method5109(this.aClass19_Sub4_Sub1_5);
		this.method5078(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5091(arg5);
		this.method5145(34165, 34165);
		this.method5081(0, 34166, 768);
		this.method5081(2, 5890, 770);
		this.method5102(0, 34166);
		this.method5102(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = local150 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local45, local41);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method5081(0, 5890, 768);
		this.method5081(2, 34166, 770);
		this.method5102(0, 5890);
		this.method5102(2, 34166);
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(IIII)V")
	@Override
	public void method5023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6156 > arg2) {
			this.anInt6156 = arg2;
		}
		if (arg0 > this.anInt6158) {
			this.anInt6158 = arg0;
		}
		if (this.anInt6150 < arg1) {
			this.anInt6150 = arg1;
		}
		if (arg3 < this.anInt6184) {
			this.anInt6184 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method5082();
		this.method5157();
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "()Z")
	@Override
	public boolean method4978() {
		return this.aClass165_1.method3827();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZZI)V")
	public void method5099(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt6180) {
			if (arg0 < 0) {
				this.method5116();
				this.method5109(null);
				this.method5140(0);
				if (!this.aBoolean376) {
					this.aClass165_1.method3828(arg2, arg1, 0);
				}
			} else {
				@Pc(17) Class19_Sub4 local17 = this.aClass69_1.method1819(arg0);
				@Pc(23) Class184 local23 = super.anInterface8_5.method5566(arg0);
				if (local23.aByte70 == 0 && local23.aByte68 == 0) {
					this.method5116();
				} else {
					@Pc(44) int local44 = local23.aBoolean325 ? 64 : 128;
					@Pc(48) int local48 = local44 * 50;
					this.method5112((float) (this.anInt6140 % local48 * local23.aByte70) / (float) local48, 0.0F, (float) (local23.aByte68 * (this.anInt6140 % local48)) / (float) local48);
				}
				if (this.aBoolean376) {
					this.aClass165_1.method3828(arg2, arg1, 3);
					this.method5109(local17);
					this.method5140(local23.anInt5196);
				} else {
					this.aClass165_1.method3828(arg2, arg1, local23.aByte72);
					this.aClass165_1.method3830(local23.anInt5200, local23.aByte69);
					if (!this.aClass165_1.method3832(local23.anInt5196, local17)) {
						this.method5109(local17);
						this.method5140(local23.anInt5196);
					}
				}
			}
			this.anInt6180 = arg0;
		}
		this.anInt6157 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "()V")
	@Override
	public void method4973() {
	}

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "(II)V")
	public synchronized void method5100(@OriginalArg(1) int arg0) {
		@Pc(13) Class6 local13 = new Class6();
		local13.aLong229 = arg0;
		this.aClass244_35.method5966(local13);
	}

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "()F")
	@Override
	public float method5024() {
		return this.aFloat71;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!lp;I)V")
	public void method5101(@OriginalArg(0) Interface4 arg0) {
		if (this.anInterface4_3 != arg0) {
			if (this.aBoolean382) {
				OpenGL.glBindBufferARB(34963, arg0.method4588());
			}
			this.anInterface4_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!rl", name = "z", descriptor = "()Z")
	@Override
	public boolean method5050() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "G", descriptor = "()I")
	@Override
	public int method5072() {
		@Pc(6) int local6 = this.anInt6167;
		this.anInt6167 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "(IIII)V")
	public void method5102(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "()Z")
	@Override
	public boolean method4983() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "()I")
	@Override
	public int method5022() {
		@Pc(6) int local6 = this.anInt6169;
		this.anInt6169 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "(II)I")
	public int method5103(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ht;I)V")
	public void method5104(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt6144 < 0 || this.anInterface2Array3[this.anInt6144] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface2Array3[this.anInt6144--] = null;
		arg0.method4539();
		if (this.anInt6144 < 0) {
			this.anInterface2_1 = null;
		} else {
			this.anInterface2_1 = this.anInterface2Array3[this.anInt6144];
			this.anInterface2_1.method4534();
		}
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(B)V")
	public void method5105() {
		if (this.anInt6157 == 4) {
			return;
		}
		this.method5130();
		this.method5106(false);
		this.method5110(false);
		this.method5094(false);
		this.method5134(false);
		this.method5093(-2);
		this.method5078(1);
		this.method5140(0);
		this.anInt6157 = 4;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(ZI)V")
	public void method5106(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean389 != arg0) {
			this.aBoolean389 = arg0;
			this.method5080();
			this.anInt6157 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FF)V")
	@Override
	public void method5055(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat71 && arg1 == this.aFloat82) {
			return;
		}
		this.aFloat71 = arg0;
		this.aFloat82 = arg1;
		this.method5154();
		if (this.anInt6176 == 3) {
			this.method5152();
		} else if (this.anInt6176 == 2) {
			this.method5089();
			return;
		}
	}

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "(I)V")
	private void method5107() {
		this.aClass5_Sub2_3 = new Class5_Sub2();
		this.aClass5_Sub2_4 = new Class5_Sub2();
		this.aClass19Array1 = new Class19[this.anInt6164];
		this.aClass19_Sub4_5 = new Class19_Sub4(this, 3553, 6408, 1, 1);
		this.aClass19_Sub4_6 = new Class19_Sub4(this, 3553, 6408, 1, 1);
		this.aClass19_Sub4_7 = new Class19_Sub4(this, 3553, 6408, 1, 1);
		this.aClass224_Sub2_3 = new Class224_Sub2(this);
		this.aClass224_Sub2_4 = new Class224_Sub2(this);
		this.aClass224_Sub2_6 = new Class224_Sub2(this);
		this.aClass224_Sub2_9 = new Class224_Sub2(this);
		this.aClass224_Sub2_1 = new Class224_Sub2(this);
		this.aClass224_Sub2_10 = new Class224_Sub2(this);
		this.aClass224_Sub2_2 = new Class224_Sub2(this);
		this.aClass224_Sub2_5 = new Class224_Sub2(this);
		this.aClass224_Sub2_8 = new Class224_Sub2(this);
		this.aClass224_Sub2_7 = new Class224_Sub2(this);
		if (this.aBoolean372) {
			this.aClass200_7 = new Class200(this);
			this.aClass200_6 = new Class200(this);
		}
	}

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "()V")
	@Override
	public void method5010() {
		this.aClass130_1.method3022();
	}

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "(B)V")
	private void method5108() {
		Static86.aFloatArray4[1] = this.aFloat81 * this.aFloat76;
		Static86.aFloatArray4[2] = this.aFloat81 * this.aFloat84;
		Static86.aFloatArray4[0] = this.aFloat74 * this.aFloat81;
		Static86.aFloatArray4[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static86.aFloatArray4, 0);
		Static86.aFloatArray4[3] = 1.0F;
		Static86.aFloatArray4[2] = this.aFloat84 * -this.aFloat75;
		Static86.aFloatArray4[1] = -this.aFloat75 * this.aFloat76;
		Static86.aFloatArray4[0] = -this.aFloat75 * this.aFloat74;
		OpenGL.glLightfv(16385, 4609, Static86.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!tu;I)V")
	public void method5109(@OriginalArg(0) Class19 arg0) {
		@Pc(11) Class19 local11 = this.aClass19Array1[this.anInt6159];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt5060);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt5060);
				} else if (local11.anInt5060 != arg0.anInt5060) {
					OpenGL.glDisable(local11.anInt5060);
					OpenGL.glEnable(arg0.anInt5060);
				}
				OpenGL.glBindTexture(arg0.anInt5060, arg0.method4243());
			}
			this.aClass19Array1[this.anInt6159] = arg0;
		}
		this.anInt6157 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZB)V")
	public void method5110(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean386) {
			this.aBoolean386 = arg0;
			this.method5144();
			this.anInt6157 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "(I)Lclient!gh;")
	public Class19_Sub3 method5111() {
		return this.aClass82_Sub1_1 == null ? null : this.aClass82_Sub1_1.method5702();
	}

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "(I)V")
	@Override
	public void method5073(@OriginalArg(0) int arg0) {
		this.method5114();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FBFF)V")
	private void method5112(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean385) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean385 = true;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ml;I)V")
	public void method5113(@OriginalArg(0) Class5_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method3852(), 0);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIZ)Lclient!qg;")
	@Override
	public Class87 method5014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class87_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rl", name = "F", descriptor = "()V")
	@Override
	public void method5070() {
		this.anInt6150 = 0;
		this.anInt6156 = this.anInt6041;
		this.anInt6158 = 0;
		this.anInt6184 = this.anInt6028;
		OpenGL.glDisable(3089);
		this.method5082();
	}

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "(B)V")
	private void method5114() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Lclient!ht;I)V")
	public void method5115(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt6144 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6144 >= 0) {
			this.anInterface2Array3[this.anInt6144].method4539();
		}
		this.anInterface2_1 = this.anInterface2Array3[++this.anInt6144] = arg0;
		this.anInterface2_1.method4534();
	}

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "(B)V")
	private void method5116() {
		if (this.aBoolean385) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean385 = false;
		}
	}

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "(I)V")
	public void method5117() {
		if (this.anInt6157 == 8) {
			return;
		}
		this.method5121();
		this.method5106(true);
		this.method5094(true);
		this.method5134(true);
		this.method5078(1);
		this.method5140(0);
		this.anInt6157 = 8;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(F)V")
	@Override
	public void method5025(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat77) {
			this.aFloat77 = arg0;
			this.method5095();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[I[I)Lclient!fs;")
	@Override
	public Class22 method4997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static348.method5209(arg0, arg2, this, arg1, arg3);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "()Z")
	@Override
	public boolean method4970() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)V")
	public synchronized void method5118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub39 local8 = new Class6_Sub39(arg1);
		local8.aLong229 = arg0;
		this.aClass244_32.method5966(local8);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!bv;)V")
	@Override
	public void method5034(@OriginalArg(0) Class32 arg0) {
		this.aClass26_1.method754(this, arg0);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLclient!ms;)V")
	public void method5119(@OriginalArg(1) Interface5 arg0) {
		if (this.anInterface5_4 != arg0) {
			if (this.aBoolean382) {
				OpenGL.glBindBufferARB(34962, arg0.method6166());
			}
			this.anInterface5_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(Lclient!ht;I)V")
	public void method5120(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt6143 < 0 || this.anInterface2Array1[this.anInt6143] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface2Array1[this.anInt6143--] = null;
		arg0.method4536();
		if (this.anInt6143 < 0) {
			this.anInterface2_2 = null;
		} else {
			this.anInterface2_2 = this.anInterface2Array1[this.anInt6143];
			this.anInterface2_2.method4537();
		}
	}

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "(I)V")
	private void method5121() {
		if (this.anInt6176 != 2) {
			this.anInt6176 = 2;
			this.method5089();
			this.method5086();
			this.anInt6157 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "(I)V")
	private void method5122() {
		if (this.anInt6176 != 3) {
			this.anInt6176 = 3;
			this.method5152();
			this.method5086();
			this.anInt6157 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "(I)V")
	private void method5123() {
		if (this.aCanvas6 == null) {
			this.anInt6103 = this.anInt6129 = 0;
		} else {
			@Pc(22) Dimension local22 = this.aCanvas6.getSize();
			this.anInt6103 = local22.width;
			this.anInt6129 = local22.height;
		}
		if (this.anInterface2_1 == null) {
			this.anInt6028 = this.anInt6129;
			this.anInt6041 = this.anInt6103;
			this.method5142();
		}
		this.method5127();
		this.method5070();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!oi;)V")
	@Override
	public void method5017(@OriginalArg(0) Class82 arg0) {
		this.aClass82_Sub1_1 = (Class82_Sub1) arg0;
	}

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "(I)V")
	@Override
	public synchronized void method5067(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class6_Sub39 local19;
		while (!this.aClass244_31.method5970()) {
			local19 = (Class6_Sub39) this.aClass244_31.method5973();
			Static229.anIntArray299[local7++] = (int) local19.aLong229;
			this.anInt6147 -= local19.anInt6429;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static229.anIntArray299, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static229.anIntArray299, 0);
			local7 = 0;
		}
		while (!this.aClass244_32.method5970()) {
			local19 = (Class6_Sub39) this.aClass244_32.method5973();
			Static229.anIntArray299[local7++] = (int) local19.aLong229;
			this.anInt6148 -= local19.anInt6429;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static229.anIntArray299, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static229.anIntArray299, 0);
			local7 = 0;
		}
		while (!this.aClass244_33.method5970()) {
			local19 = (Class6_Sub39) this.aClass244_33.method5973();
			Static229.anIntArray299[local7++] = local19.anInt6429;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static229.anIntArray299, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static229.anIntArray299, 0);
			local7 = 0;
		}
		while (!this.aClass244_34.method5970()) {
			local19 = (Class6_Sub39) this.aClass244_34.method5973();
			Static229.anIntArray299[local7++] = (int) local19.aLong229;
			this.anInt6146 -= local19.anInt6429;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static229.anIntArray299, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static229.anIntArray299, 0);
		}
		while (!this.aClass244_30.method5970()) {
			local19 = (Class6_Sub39) this.aClass244_30.method5973();
			OpenGL.glDeleteLists((int) local19.aLong229, local19.anInt6429);
		}
		@Pc(216) Class6 local216;
		while (!this.aClass244_35.method5970()) {
			local216 = this.aClass244_35.method5973();
			OpenGL.glDeleteProgramARB((int) local216.aLong229);
		}
		while (!this.aClass244_36.method5970()) {
			local216 = this.aClass244_36.method5973();
			OpenGL.glDeleteObjectARB(local216.aLong229);
		}
		while (!this.aClass244_30.method5970()) {
			local19 = (Class6_Sub39) this.aClass244_30.method5973();
			OpenGL.glDeleteLists((int) local19.aLong229, local19.anInt6429);
		}
		this.aClass69_1.method1822();
		if (this.method4984() > 100663296 && this.aLong177 + 60000L < Static449.method6552()) {
			System.gc();
			this.aLong177 = Static449.method6552();
		}
		this.anInt6140 = local11;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(IBII)V")
	public void method5124(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!rl", name = "C", descriptor = "()Lclient!gs;")
	@Override
	public Class5 method5064() {
		return this.aClass5_Sub2_1;
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(IIIIII)Z")
	@Override
	public boolean method5054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass5_Sub2_3.aFloat40 + (float) arg1 * this.aClass5_Sub2_3.aFloat42 + this.aClass5_Sub2_3.aFloat49 * (float) arg0 + (float) arg2 * this.aClass5_Sub2_3.aFloat48;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass5_Sub2_3.aFloat40 + this.aClass5_Sub2_3.aFloat48 * (float) arg5 + (float) arg4 * this.aClass5_Sub2_3.aFloat42 + (float) arg3 * this.aClass5_Sub2_3.aFloat49;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt6178 && local59 < (float) this.anInt6178 || !(!((float) this.anInt6185 < local28) || !((float) this.anInt6185 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass5_Sub2_3.aFloat47 + this.aClass5_Sub2_3.aFloat44 * (float) arg1 + this.aClass5_Sub2_3.aFloat38 * (float) arg0 + (float) arg2 * this.aClass5_Sub2_3.aFloat39) * (float) this.anInt6149 / local28);
		@Pc(155) int local155 = (int) ((this.aClass5_Sub2_3.aFloat47 + this.aClass5_Sub2_3.aFloat38 * (float) arg3 + (float) arg4 * this.aClass5_Sub2_3.aFloat44 + (float) arg5 * this.aClass5_Sub2_3.aFloat39) * (float) this.anInt6149 / local59);
		if (this.aFloat73 > (float) local123 && (float) local155 < this.aFloat73 || this.aFloat85 < (float) local123 && this.aFloat85 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt6163 * ((float) arg2 * this.aClass5_Sub2_3.aFloat45 + this.aClass5_Sub2_3.aFloat46 * (float) arg1 + this.aClass5_Sub2_3.aFloat43 * (float) arg0 + this.aClass5_Sub2_3.aFloat41) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt6163 * ((float) arg5 * this.aClass5_Sub2_3.aFloat45 + (float) arg4 * this.aClass5_Sub2_3.aFloat46 + (float) arg3 * this.aClass5_Sub2_3.aFloat43 + this.aClass5_Sub2_3.aFloat41) / local59);
			return (!(this.aFloat67 > (float) local213) || !((float) local245 < this.aFloat67)) && (!(this.aFloat83 < (float) local213) || !(this.aFloat83 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([Lclient!va;Lclient!gs;[Lclient!la;I)V")
	@Override
	public void method5046(@OriginalArg(0) Class224[] arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class57_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method5798(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5137();
		this.method5078(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rl", name = "D", descriptor = "()Z")
	@Override
	public boolean method5065() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBZI[B)Lclient!ms;")
	public Interface5 method5126(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface5) (this.aBoolean382 && (!arg1 || this.aBoolean390) ? new Class112_Sub2(this, arg0, arg3, arg2, arg1) : new Class90_Sub1(this, arg0, arg3, arg2));
	}

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "(I)V")
	public void method5127() {
		if (this.anInt6176 != 0) {
			this.anInt6157 &= 0xFFFFFFE0;
			this.anInt6176 = 0;
		}
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
	@Override
	public void method5020(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "(II)V")
	public synchronized void method5128(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub39 local8 = new Class6_Sub39(arg0);
		this.aClass244_33.method5966(local8);
	}

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "(I)V")
	private void method5129() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static88.method4161(1000L);
		}
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)V")
	@Override
	public void method5032(@OriginalArg(0) int arg0) {
		this.anInt6141 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt6141++;
		}
		this.anInt6142 = 0x1 << this.anInt6141;
	}

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "(I)V")
	private void method5130() {
		if (this.anInt6176 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt6041 > 0 && this.anInt6028 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt6041, (double) this.anInt6028, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt6176 = 1;
		this.anInt6157 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "(II)I")
	public int method5131(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
	@Override
	public void method5026(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt6139 = arg0;
		this.aClass69_1.method1820();
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "()V")
	@Override
	public void method4977() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(III)V")
	public void method5132(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6168 = arg1;
		this.anInt6162 = arg0;
		this.method5142();
		this.method5157();
	}

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "()Z")
	@Override
	public boolean method5029() {
		return false;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!qd;)V")
	@Override
	public void method5028(@OriginalArg(0) Class6_Sub15 arg0) {
		this.aNativeHeap2 = ((Class6_Sub15_Sub1) arg0).aNativeHeap1;
		if (this.anInterface5_5 != null) {
			return;
		}
		@Pc(16) Class6_Sub1_Sub2 local16 = new Class6_Sub1_Sub2(80);
		if (this.aBoolean373) {
			local16.method6493(-1.0F);
			local16.method6493(-1.0F);
			local16.method6493(0.0F);
			local16.method6493(0.0F);
			local16.method6493(1.0F);
			local16.method6493(1.0F);
			local16.method6493(-1.0F);
			local16.method6493(0.0F);
			local16.method6493(1.0F);
			local16.method6493(1.0F);
			local16.method6493(1.0F);
			local16.method6493(1.0F);
			local16.method6493(0.0F);
			local16.method6493(1.0F);
			local16.method6493(0.0F);
			local16.method6493(-1.0F);
			local16.method6493(1.0F);
			local16.method6493(0.0F);
			local16.method6493(0.0F);
			local16.method6493(0.0F);
		} else {
			local16.method6494(-1.0F);
			local16.method6494(-1.0F);
			local16.method6494(0.0F);
			local16.method6494(0.0F);
			local16.method6494(1.0F);
			local16.method6494(1.0F);
			local16.method6494(-1.0F);
			local16.method6494(0.0F);
			local16.method6494(1.0F);
			local16.method6494(1.0F);
			local16.method6494(1.0F);
			local16.method6494(1.0F);
			local16.method6494(0.0F);
			local16.method6494(1.0F);
			local16.method6494(0.0F);
			local16.method6494(-1.0F);
			local16.method6494(1.0F);
			local16.method6494(0.0F);
			local16.method6494(0.0F);
			local16.method6494(0.0F);
		}
		this.anInterface5_5 = this.method5126(20, false, local16.anInt7898, local16.aByteArray96);
		this.aClass23_9 = new Class23(this, this.anInterface5_5, 5126, 3, 0);
		this.aClass23_10 = new Class23(this, this.anInterface5_5, 5126, 2, 12);
		this.aClass26_1.method755(this);
	}

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "()V")
	@Override
	public void method4990() {
		this.method5134(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(ILclient!ht;)V")
	public void method5133(@OriginalArg(1) Interface2 arg0) {
		if (this.anInt6143 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6143 >= 0) {
			this.anInterface2Array1[this.anInt6143].method4536();
		}
		this.anInterface2_2 = this.anInterface2Array1[++this.anInt6143] = arg0;
		this.anInterface2_2.method4537();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([Lclient!va;Lclient!bv;Lclient!gs;[Lclient!la;I)V")
	@Override
	public void method4979(@OriginalArg(0) Class224[] arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) Class57_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method5046(arg0, arg2, arg3, arg4);
		this.method5034(arg1);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!mo;[Lclient!pi;Z)Lclient!hr;")
	@Override
	public Class29 method5036(@OriginalArg(0) Class166 arg0, @OriginalArg(1) Class194[] arg1) {
		return new Class29_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!pi;Z)Lclient!qg;")
	@Override
	public Class87 method5038(@OriginalArg(0) Class194 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt5383 * arg0.anInt5386];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray70 == null) {
			for (local21 = 0; local21 < arg0.anInt5386; local21++) {
				for (local25 = 0; local25 < arg0.anInt5383; local25++) {
					@Pc(79) int local79 = arg0.anIntArray361[arg0.aByteArray69[local14++] & 0xFF];
					local12[local16++] = local79 == 0 ? 0 : local79 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt5386; local21++) {
				for (local25 = 0; local25 < arg0.anInt5383; local25++) {
					local12[local16++] = arg0.anIntArray361[arg0.aByteArray69[local14] & 0xFF] | arg0.aByteArray70[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(115) Class87 local115 = this.method5018(local12, arg0.anInt5383, arg0.anInt5383, arg0.anInt5386);
		local115.method6556(arg0.anInt5385, arg0.anInt5388, arg0.anInt5384, arg0.anInt5387);
		return local115;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(ZB)V")
	public void method5134(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean387 != arg0) {
			this.aBoolean387 = arg0;
			this.method5150();
			this.anInt6157 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass5_Sub2_3.aFloat49 * (float) arg0 + this.aClass5_Sub2_3.aFloat42 * (float) arg1 + this.aClass5_Sub2_3.aFloat48 * (float) arg2 + this.aClass5_Sub2_3.aFloat40;
		if ((float) this.anInt6178 > local28 || local28 > (float) this.anInt6185) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass5_Sub2_3.aFloat47 + this.aClass5_Sub2_3.aFloat39 * (float) arg2 + (float) arg0 * this.aClass5_Sub2_3.aFloat38 + this.aClass5_Sub2_3.aFloat44 * (float) arg1) * (float) this.anInt6149 / local28);
		@Pc(117) int local117 = (int) ((this.aClass5_Sub2_3.aFloat41 + (float) arg0 * this.aClass5_Sub2_3.aFloat43 + this.aClass5_Sub2_3.aFloat46 * (float) arg1 + this.aClass5_Sub2_3.aFloat45 * (float) arg2) * (float) this.anInt6163 / local28);
		if (this.aFloat73 <= (float) local85 && (float) local85 <= this.aFloat85 && this.aFloat67 <= (float) local117 && (float) local117 <= this.aFloat83) {
			arg3[1] = (int) ((float) local117 - this.aFloat67);
			arg3[0] = (int) ((float) local85 - this.aFloat73);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ[BII)Lclient!lp;")
	public Interface4 method5136(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		return (Interface4) (this.aBoolean382 && (!arg0 || this.aBoolean390) ? new Class112_Sub1(this, 5123, arg1, arg2, arg0) : new Class90_Sub2(this, 5123, arg1, arg2));
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(Z)V")
	private void method5137() {
		if (this.anInt6157 == 1) {
			return;
		}
		this.method5130();
		this.method5106(false);
		this.method5110(false);
		this.method5094(false);
		this.method5134(false);
		this.method5109(null);
		this.method5093(-2);
		this.method5140(1);
		this.anInt6157 = 1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Lclient!qd;")
	@Override
	public Class6_Sub15 method4969() {
		@Pc(8) Class6_Sub15_Sub1 local8 = new Class6_Sub15_Sub1(78643200);
		this.aClass244_29.method5966(local8);
		return local8;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4998(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static274.aFloat53 = arg2;
		Static115.aFloat22 = arg1;
		Static183.aFloat50 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(Z)V")
	@Override
	public void method5007(@OriginalArg(0) boolean arg0) {
		this.bf = arg0;
		this.method5150();
	}

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "(B)V")
	public void method5138() {
		if (this.anInt6157 == 16) {
			return;
		}
		this.method5122();
		this.method5106(true);
		this.method5094(true);
		this.method5134(true);
		this.method5078(1);
		this.method5140(0);
		this.anInt6157 = 16;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)I")
	@Override
	public int method5053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[[I[[IIII)Lclient!og;")
	@Override
	public Class86 method4987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class86_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "(B)V")
	private void method5139() {
		@Pc(60) int local60;
		if (this.aBoolean376) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local60 = this.anInt6175;
		} else {
			this.aFloat70 = (float) (this.anInt6185 - this.anInt6151) - this.aFloat72;
			this.aFloat69 = this.aFloat70 - (float) this.anInt6182 * this.aFloat78;
			if ((float) this.anInt6178 > this.aFloat69) {
				this.aFloat69 = this.anInt6178;
			}
			OpenGL.glFogf(2915, this.aFloat69);
			OpenGL.glFogf(2916, this.aFloat70);
			local60 = this.anInt6165;
		}
		Static86.aFloatArray4[0] = (float) (local60 & 0xFF0000) / 1.671168E7F;
		Static86.aFloatArray4[2] = (float) (local60 & 0xFF) / 255.0F;
		Static86.aFloatArray4[1] = (float) (local60 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static86.aFloatArray4, 0);
		if (this.aBoolean376) {
			this.aClass165_1.aClass12_Sub5_1.method3700();
		}
	}

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "()I")
	@Override
	public int method4991() {
		return this.anInt6178;
	}

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "(IIII)V")
	@Override
	public void method5060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean376) {
			throw new RuntimeException("");
		}
		this.anInt6175 = arg1;
		this.anInt6179 = arg2;
		this.anInt6173 = arg3;
		this.anInt6177 = arg0;
		this.aClass165_1.aClass12_Sub5_1.method3698();
		this.method5139();
	}

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "(II)V")
	public void method5140(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method5145(7681, 7681);
		} else if (arg0 == 0) {
			this.method5145(8448, 8448);
		} else if (arg0 == 2) {
			this.method5145(7681, 34165);
		} else if (arg0 == 3) {
			this.method5145(8448, 260);
		} else if (arg0 == 4) {
			this.method5145(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(III)V")
	public synchronized void method5141(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class6_Sub39 local16 = new Class6_Sub39(arg1);
		local16.aLong229 = arg0;
		this.aClass244_34.method5966(local16);
	}

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "()V")
	@Override
	public void method5002() {
		this.aBoolean376 = false;
		this.aClass165_1.method3828(false, false, 0);
		this.method5139();
		this.method5080();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5037(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "(B)V")
	private void method5142() {
		OpenGL.glViewport(this.anInt6168, this.anInt6162, this.anInt6041, this.anInt6028);
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)V")
	@Override
	public void method5045(@OriginalArg(0) int arg0) {
		this.method5078(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!ml;)V")
	public void method5143(@OriginalArg(1) Class5_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method3852(), 0);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "()V")
	@Override
	public void method4966() {
		if (this.aClass6_Sub16_Sub1_1 != null && this.aClass6_Sub16_Sub1_1.method4747()) {
			this.aClass130_1.method3018(this.aClass6_Sub16_Sub1_1);
			this.aClass69_1.method1820();
		}
	}

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "(I)V")
	private void method5144() {
		if (this.aBoolean386 && !this.aBoolean383) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZ)V")
	public void method5145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6159 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (arg1 != this.anInt6155) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt6155 = arg1;
			local4 = true;
		}
		if (arg0 != this.anInt6174) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local4 = true;
			this.anInt6174 = arg0;
		}
		if (local4) {
			this.anInt6157 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([I)V")
	@Override
	public void method5019(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt6156;
		arg0[1] = this.anInt6150;
		arg0[3] = this.anInt6184;
		arg0[0] = this.anInt6158;
	}

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "()Z")
	@Override
	public boolean method4995() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!oi;Lclient!oi;FLclient!oi;)Lclient!oi;")
	@Override
	public Class82 method5051(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class82 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean392 && this.aBoolean372 && this.aBoolean384) {
			@Pc(18) Class82_Sub1_Sub2 local18 = null;
			@Pc(21) Class82_Sub1 local21 = (Class82_Sub1) arg0;
			@Pc(24) Class82_Sub1 local24 = (Class82_Sub1) arg1;
			@Pc(28) Class19_Sub3 local28 = local21.method5702();
			@Pc(32) Class19_Sub3 local32 = local24.method5702();
			if (local28 != null && local32 != null) {
				@Pc(51) int local51 = local28.anInt2768 <= local32.anInt2768 ? local32.anInt2768 : local28.anInt2768;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class82_Sub1_Sub2) {
					@Pc(63) Class82_Sub1_Sub2 local63 = (Class82_Sub1_Sub2) arg3;
					if (local51 == local63.method5706()) {
						local18 = local63;
					}
				}
				if (local18 == null) {
					local18 = new Class82_Sub1_Sub2(this, local51);
				}
				if (local18.method5705(local32, local28, arg2)) {
					return local18;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
	@Override
	public void method5048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt6178 && this.anInt6185 == arg1) {
			return;
		}
		this.anInt6178 = arg0;
		this.anInt6185 = arg1;
		this.method5149();
		this.method5139();
		if (this.anInt6176 == 3) {
			this.method5152();
		} else if (this.anInt6176 == 2) {
			this.method5089();
			return;
		}
	}

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "()I")
	@Override
	public int method4984() {
		return this.anInt6148 + this.anInt6147 + this.anInt6146;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!fs;II)V")
	@Override
	public void method5005(@OriginalArg(1) Class22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class22_Sub1 local6 = (Class22_Sub1) arg0;
		@Pc(9) Class19_Sub4_Sub1 local9 = local6.aClass19_Sub4_Sub1_1;
		this.method5151();
		this.method5109(local6.aClass19_Sub4_Sub1_1);
		this.method5078(1);
		this.method5145(8448, 7681);
		this.method5081(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat54 / (float) local9.anInt5085;
		@Pc(46) float local46 = local9.aFloat55 / (float) local9.anInt5086;
		OpenGL.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6158 - arg1), (float) (this.anInt6150 - arg2) * local46);
		OpenGL.glVertex2i(this.anInt6158, this.anInt6150);
		OpenGL.glTexCoord2f((float) (this.anInt6158 - arg1) * local39, (float) (this.anInt6184 - arg2) * local46);
		OpenGL.glVertex2i(this.anInt6158, this.anInt6184);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6156 - arg1), (float) (this.anInt6184 - arg2) * local46);
		OpenGL.glVertex2i(this.anInt6156, this.anInt6184);
		OpenGL.glTexCoord2f((float) (this.anInt6156 - arg1) * local39, local46 * (float) (this.anInt6150 - arg2));
		OpenGL.glVertex2i(this.anInt6156, this.anInt6150);
		OpenGL.glEnd();
		this.method5081(0, 5890, 768);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIILclient!fs;II)V")
	@Override
	public void method5068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class22 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class22_Sub1 local6 = (Class22_Sub1) arg5;
		@Pc(9) Class19_Sub4_Sub1 local9 = local6.aClass19_Sub4_Sub1_1;
		this.method5151();
		this.method5109(local6.aClass19_Sub4_Sub1_1);
		this.method5078(1);
		this.method5145(8448, 7681);
		this.method5081(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat54 / (float) local9.anInt5085;
		@Pc(46) float local46 = local9.aFloat55 / (float) local9.anInt5086;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method5081(0, 5890, 768);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZZ)V")
	public void method5146(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method5099(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4980(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas5) {
			throw new RuntimeException();
		} else if (!this.aHashtable2.containsKey(arg0)) {
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
			this.aHashtable2.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "(B)V")
	private void method5147() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt6187; local7++) {
			@Pc(22) Class6_Sub11 local22 = this.aClass6_Sub11Array2[local7];
			@Pc(26) int local26 = local7 + 16386;
			Static435.aFloatArray32[0] = local22.method6390();
			Static435.aFloatArray32[1] = local22.method6391();
			Static435.aFloatArray32[2] = local22.method6392();
			Static435.aFloatArray32[3] = 1.0F;
			OpenGL.glLightfv(local26, 4611, Static435.aFloatArray32, 0);
			@Pc(60) int local60 = local22.method6396();
			@Pc(66) float local66 = local22.method6389() / 255.0F;
			Static435.aFloatArray32[0] = local66 * (float) (local60 >> 16 & 0xFF);
			Static435.aFloatArray32[2] = local66 * (float) (local60 & 0xFF);
			Static435.aFloatArray32[1] = local66 * (float) (local60 >> 8 & 0xFF);
			OpenGL.glLightfv(local26, 4609, Static435.aFloatArray32, 0);
			OpenGL.glLightf(local26, 4617, 1.0F / (float) (local22.method6395() * local22.method6395()));
			OpenGL.glEnable(local26);
		}
		while (this.anInt6166 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt6166 = this.anInt6187;
	}

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "()I")
	@Override
	public int method4986() {
		return this.anInt6185;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[Lclient!dq;)V")
	@Override
	public void method5000(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub11[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass6_Sub11Array2[local7] = arg1[local7];
		}
		this.anInt6187 = arg0;
		if (this.anInt6176 != 1) {
			this.method5147();
		}
	}

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "(II)I")
	public int method5148(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "()Z")
	@Override
	public boolean method5008() {
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "()Z")
	@Override
	public boolean method4976() {
		return false;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(IIII)V")
	@Override
	public void method5013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass130_1.method3016(arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5137();
		this.method5078(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5061() {
	}

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "(I)V")
	private void method5149() {
		@Pc(6) float[] local6 = this.aFloatArray24;
		@Pc(18) float local18 = (float) (-this.anInt6170 * this.anInt6178) / (float) this.anInt6149;
		@Pc(39) float local39 = (float) (this.anInt6178 * (this.anInt6041 - this.anInt6170)) / (float) this.anInt6149;
		@Pc(50) float local50 = (float) (this.anInt6160 * this.anInt6178) / (float) this.anInt6163;
		@Pc(65) float local65 = (float) ((this.anInt6160 - this.anInt6028) * this.anInt6178) / (float) this.anInt6163;
		if (local39 == local18 || local50 == local65) {
			local6[14] = 0.0F;
			local6[11] = 0.0F;
			local6[13] = 0.0F;
			local6[15] = 1.0F;
			local6[8] = 0.0F;
			local6[9] = 0.0F;
			local6[3] = 0.0F;
			local6[10] = 1.0F;
			local6[2] = 0.0F;
			local6[7] = 0.0F;
			local6[12] = 0.0F;
			local6[5] = 1.0F;
			local6[1] = 0.0F;
			local6[4] = 0.0F;
			local6[0] = 1.0F;
			local6[6] = 0.0F;
		} else {
			@Pc(79) float local79 = (float) this.anInt6178 * 2.0F;
			local6[10] = this.aFloat80 = (float) -(this.anInt6185 + this.anInt6178) / (float) (this.anInt6185 - this.anInt6178);
			local6[2] = 0.0F;
			local6[1] = 0.0F;
			local6[5] = local79 / (local50 - local65);
			local6[13] = 0.0F;
			local6[9] = (local65 + local50) / (-local65 + local50);
			local6[14] = this.aFloat79 = -((float) this.anInt6185 * local79) / (float) (this.anInt6185 - this.anInt6178);
			local6[11] = -1.0F;
			local6[3] = 0.0F;
			local6[7] = 0.0F;
			local6[0] = local79 / (local39 - local18);
			local6[4] = 0.0F;
			local6[8] = (local18 + local39) / (-local18 + local39);
			local6[6] = 0.0F;
			local6[15] = 0.0F;
			local6[12] = 0.0F;
		}
		this.method5154();
	}

	@OriginalMember(owner = "client!rl", name = "z", descriptor = "(I)V")
	private void method5150() {
		OpenGL.glDepthMask(this.aBoolean387 && this.bf);
	}

	@OriginalMember(owner = "client!rl", name = "A", descriptor = "(I)V")
	public void method5151() {
		if (this.anInt6157 == 2) {
			return;
		}
		this.method5130();
		this.method5106(false);
		this.method5110(false);
		this.method5094(false);
		this.method5134(false);
		this.method5093(-2);
		this.anInt6157 = 2;
	}

	@OriginalMember(owner = "client!rl", name = "H", descriptor = "()Z")
	@Override
	public boolean method5074() {
		return this.aBoolean379 && (!this.method5056() || this.aBoolean377);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!va;Lclient!bv;Lclient!gs;Lclient!la;I)V")
	@Override
	public void method5021(@OriginalArg(0) Class224 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) Class57_Sub5 arg3) {
		arg0.method5798(arg2, arg3, 0);
		this.method5034(arg1);
	}

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "(I)V")
	@Override
	public void method5047(@OriginalArg(0) int arg0) {
		this.method5129();
	}

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "(B)V")
	private void method5152() {
		@Pc(15) float local15 = (float) -this.anInt6170 * this.aFloat86 / (float) this.anInt6149;
		@Pc(27) float local27 = this.aFloat86 * (float) -this.anInt6160 / (float) this.anInt6163;
		@Pc(42) float local42 = (float) (this.anInt6041 - this.anInt6170) * this.aFloat86 / (float) this.anInt6149;
		@Pc(57) float local57 = this.aFloat86 * (float) (this.anInt6028 - this.anInt6160) / (float) this.anInt6163;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local57 != local27) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) ((float) this.anInt6178 - this.aFloat82), (double) ((float) this.anInt6185 - this.aFloat82));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(ILclient!ht;)V")
	public void method5153(@OriginalArg(1) Interface2 arg0) {
		if (this.aBoolean384) {
			this.method5120(arg0);
			this.method5104(arg0);
		} else if (this.anInt6145 >= 0 && this.anInterface2Array2[this.anInt6145] == arg0) {
			this.anInterface2Array2[this.anInt6145--] = null;
			arg0.method4538();
			if (this.anInt6145 < 0) {
				this.anInterface2_2 = this.anInterface2_1 = null;
			} else {
				this.anInterface2_2 = this.anInterface2_1 = this.anInterface2Array2[this.anInt6145];
				this.anInterface2_2.method4535();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "(B)V")
	private void method5154() {
		if (this.aFloat82 == 0.0F) {
			this.aFloatArray24[10] = this.aFloat80;
			this.aFloatArray24[14] = this.aFloat79;
		} else {
			@Pc(13) float local13 = this.aFloat71 / (this.aFloat82 + this.aFloat71);
			@Pc(17) float local17 = local13 * local13;
			@Pc(33) float local33 = -this.aFloat79 * (1.0F - local13) * (1.0F - local13) / this.aFloat82;
			this.aFloatArray24[14] = this.aFloat79 * local17;
			this.aFloatArray24[10] = this.aFloat80 + local33;
		}
		this.aFloat66 = (float) this.anInt6185 - this.aFloat82;
		this.aFloat68 = (this.aFloatArray24[14] - (float) this.anInt6185) / this.aFloatArray24[10];
	}

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "()I")
	@Override
	public int method5012() {
		return 4;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIILclient!lp;I)V")
	public void method5155(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface4 arg2) {
		@Pc(7) int local7 = arg2.method4587();
		@Pc(16) int local16 = arg1 * this.method5103(local7);
		this.method5101(arg2);
		OpenGL.glDrawElements(4, arg0, local7, arg2.method4589() + (long) local16);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
	@Override
	public void method4967(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(IIIIII)Lclient!oi;")
	@Override
	public Class82 method5063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean392 ? new Class82_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!rl", name = "B", descriptor = "(I)V")
	private void method5156() {
		this.method5093(-2);
		for (@Pc(14) int local14 = this.anInt6164 - 1; local14 >= 0; local14--) {
			this.method5075(local14);
			this.method5109(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5145(8448, 8448);
		this.method5081(2, 34168, 770);
		this.method5116();
		this.anInt6186 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt6154 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean388 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean395 = true;
		this.method5106(true);
		this.method5110(true);
		this.method5094(true);
		this.method5134(true);
		this.method5127();
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
		@Pc(135) float[] local135 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(137) int local137 = 0; local137 < 8; local137++) {
			@Pc(144) int local144 = local137 + 16384;
			OpenGL.glLightfv(local144, 4608, local135, 0);
			OpenGL.glLightf(local144, 4615, 0.0F);
			OpenGL.glLightf(local144, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt6152 = this.anInt6165 = -1;
		this.method5070();
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5006(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas5 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!rl", name = "C", descriptor = "(I)V")
	private void method5157() {
		if (this.anInt6156 >= this.anInt6158 && this.anInt6184 >= this.anInt6150) {
			OpenGL.glScissor(this.anInt6158 + this.anInt6168, this.anInt6162 - (-this.anInt6028 - -this.anInt6184), this.anInt6156 - this.anInt6158, this.anInt6184 + -this.anInt6150);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}
}
