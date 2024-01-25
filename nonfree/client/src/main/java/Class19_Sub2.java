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

@OriginalClass("client!fd")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
	private int anInt2106;

	@OriginalMember(owner = "client!fd", name = "tb", descriptor = "I")
	public int anInt2138;

	@OriginalMember(owner = "client!fd", name = "Uc", descriptor = "I")
	private int anInt2214;

	@OriginalMember(owner = "client!fd", name = "vd", descriptor = "I")
	public int anInt2240;

	@OriginalMember(owner = "client!fd", name = "pe", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!fd", name = "qe", descriptor = "I")
	public int anInt2274;

	@OriginalMember(owner = "client!fd", name = "ve", descriptor = "Lclient!cp;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!fd", name = "ye", descriptor = "Lclient!cp;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!fd", name = "Ce", descriptor = "I")
	public int anInt2279;

	@OriginalMember(owner = "client!fd", name = "Ee", descriptor = "I")
	public int anInt2280;

	@OriginalMember(owner = "client!fd", name = "Fe", descriptor = "I")
	private int anInt2281;

	@OriginalMember(owner = "client!fd", name = "Pe", descriptor = "Z")
	public boolean aBoolean192;

	@OriginalMember(owner = "client!fd", name = "Re", descriptor = "I")
	private int anInt2284;

	@OriginalMember(owner = "client!fd", name = "Se", descriptor = "Lclient!ip;")
	public Class110_Sub1 aClass110_Sub1_1;

	@OriginalMember(owner = "client!fd", name = "Te", descriptor = "I")
	private int anInt2285;

	@OriginalMember(owner = "client!fd", name = "Ye", descriptor = "I")
	public int anInt2288;

	@OriginalMember(owner = "client!fd", name = "Ze", descriptor = "I")
	public int anInt2289;

	@OriginalMember(owner = "client!fd", name = "af", descriptor = "Z")
	private boolean aBoolean194;

	@OriginalMember(owner = "client!fd", name = "df", descriptor = "Z")
	private boolean aBoolean195;

	@OriginalMember(owner = "client!fd", name = "ef", descriptor = "Lclient!ip;")
	public Class110_Sub1 aClass110_Sub1_2;

	@OriginalMember(owner = "client!fd", name = "gf", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!fd", name = "hf", descriptor = "F")
	private float aFloat60;

	@OriginalMember(owner = "client!fd", name = "jf", descriptor = "I")
	private int anInt2291;

	@OriginalMember(owner = "client!fd", name = "kf", descriptor = "Lclient!bk;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!fd", name = "lf", descriptor = "Z")
	private boolean aBoolean197;

	@OriginalMember(owner = "client!fd", name = "pf", descriptor = "Lclient!af;")
	public Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!fd", name = "qf", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!fd", name = "rf", descriptor = "Lclient!ip;")
	public Class110_Sub1 aClass110_Sub1_3;

	@OriginalMember(owner = "client!fd", name = "uf", descriptor = "Z")
	public boolean aBoolean198;

	@OriginalMember(owner = "client!fd", name = "xf", descriptor = "Lclient!ip;")
	public Class110_Sub1 aClass110_Sub1_4;

	@OriginalMember(owner = "client!fd", name = "zf", descriptor = "Lclient!af;")
	public Class6_Sub1 aClass6_Sub1_2;

	@OriginalMember(owner = "client!fd", name = "Bf", descriptor = "Z")
	public boolean aBoolean199;

	@OriginalMember(owner = "client!fd", name = "Cf", descriptor = "Z")
	private boolean aBoolean200;

	@OriginalMember(owner = "client!fd", name = "Df", descriptor = "Lclient!pc;")
	public Class177 aClass177_5;

	@OriginalMember(owner = "client!fd", name = "Ff", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!fd", name = "Gf", descriptor = "I")
	private int anInt2298;

	@OriginalMember(owner = "client!fd", name = "Hf", descriptor = "Z")
	private boolean aBoolean201;

	@OriginalMember(owner = "client!fd", name = "If", descriptor = "Lclient!ps;")
	private Class6_Sub1_Sub1 aClass6_Sub1_Sub1_1;

	@OriginalMember(owner = "client!fd", name = "Jf", descriptor = "Lclient!vd;")
	private Interface11 anInterface11_2;

	@OriginalMember(owner = "client!fd", name = "Kf", descriptor = "Lclient!pc;")
	public Class177 aClass177_6;

	@OriginalMember(owner = "client!fd", name = "Mf", descriptor = "Z")
	private boolean aBoolean202;

	@OriginalMember(owner = "client!fd", name = "Pf", descriptor = "Z")
	private boolean aBoolean203;

	@OriginalMember(owner = "client!fd", name = "Qf", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!fd", name = "Rf", descriptor = "I")
	private int anInt2300;

	@OriginalMember(owner = "client!fd", name = "Sf", descriptor = "I")
	private int anInt2301;

	@OriginalMember(owner = "client!fd", name = "Tf", descriptor = "Z")
	public boolean aBoolean204;

	@OriginalMember(owner = "client!fd", name = "Uf", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!fd", name = "Wf", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!fd", name = "Xf", descriptor = "Z")
	private boolean aBoolean206;

	@OriginalMember(owner = "client!fd", name = "Yf", descriptor = "Lclient!ml;")
	public Class150 aClass150_1;

	@OriginalMember(owner = "client!fd", name = "ag", descriptor = "Lclient!vd;")
	private Interface11 anInterface11_3;

	@OriginalMember(owner = "client!fd", name = "bg", descriptor = "Lclient!tu;")
	public Class31_Sub1 aClass31_Sub1_3;

	@OriginalMember(owner = "client!fd", name = "cg", descriptor = "F")
	private float aFloat69;

	@OriginalMember(owner = "client!fd", name = "dg", descriptor = "I")
	private int anInt2303;

	@OriginalMember(owner = "client!fd", name = "eg", descriptor = "I")
	private int anInt2304;

	@OriginalMember(owner = "client!fd", name = "gg", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!fd", name = "hg", descriptor = "Lclient!tu;")
	public Class31_Sub1 aClass31_Sub1_4;

	@OriginalMember(owner = "client!fd", name = "ig", descriptor = "Lclient!ip;")
	public Class110_Sub1 aClass110_Sub1_5;

	@OriginalMember(owner = "client!fd", name = "jg", descriptor = "Lclient!ip;")
	public Class110_Sub1 aClass110_Sub1_6;

	@OriginalMember(owner = "client!fd", name = "lg", descriptor = "Lclient!ip;")
	public Class110_Sub1 aClass110_Sub1_7;

	@OriginalMember(owner = "client!fd", name = "mg", descriptor = "I")
	public int anInt2306;

	@OriginalMember(owner = "client!fd", name = "qg", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!fd", name = "ug", descriptor = "Lclient!ip;")
	public Class110_Sub1 aClass110_Sub1_8;

	@OriginalMember(owner = "client!fd", name = "xg", descriptor = "[Lclient!kj;")
	private Class6[] aClass6Array1;

	@OriginalMember(owner = "client!fd", name = "Ag", descriptor = "I")
	private int anInt2310;

	@OriginalMember(owner = "client!fd", name = "Bg", descriptor = "I")
	public int anInt2311;

	@OriginalMember(owner = "client!fd", name = "Cg", descriptor = "Lclient!af;")
	public Class6_Sub1 aClass6_Sub1_3;

	@OriginalMember(owner = "client!fd", name = "Eg", descriptor = "Lclient!ip;")
	public Class110_Sub1 aClass110_Sub1_9;

	@OriginalMember(owner = "client!fd", name = "Hg", descriptor = "Z")
	public boolean aBoolean209;

	@OriginalMember(owner = "client!fd", name = "Ig", descriptor = "I")
	private int anInt2314;

	@OriginalMember(owner = "client!fd", name = "Kg", descriptor = "Lclient!ml;")
	public Class150 aClass150_2;

	@OriginalMember(owner = "client!fd", name = "Mg", descriptor = "I")
	private int anInt2316;

	@OriginalMember(owner = "client!fd", name = "Og", descriptor = "Z")
	private boolean aBoolean212;

	@OriginalMember(owner = "client!fd", name = "Pg", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!fd", name = "Rg", descriptor = "Z")
	public boolean aBoolean213;

	@OriginalMember(owner = "client!fd", name = "Tg", descriptor = "Lclient!ip;")
	public Class110_Sub1 aClass110_Sub1_10;

	@OriginalMember(owner = "client!fd", name = "Ug", descriptor = "F")
	private float aFloat76;

	@OriginalMember(owner = "client!fd", name = "Wg", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!fd", name = "Xg", descriptor = "Z")
	public boolean aBoolean214;

	@OriginalMember(owner = "client!fd", name = "Yg", descriptor = "Z")
	public boolean aBoolean215;

	@OriginalMember(owner = "client!fd", name = "Zg", descriptor = "I")
	private int anInt2319;

	@OriginalMember(owner = "client!fd", name = "ah", descriptor = "Z")
	private boolean aBoolean216;

	@OriginalMember(owner = "client!fd", name = "bh", descriptor = "Z")
	public boolean aBoolean217;

	@OriginalMember(owner = "client!fd", name = "ch", descriptor = "I")
	private int anInt2320;

	@OriginalMember(owner = "client!fd", name = "dh", descriptor = "Lclient!tm;")
	private Class99_Sub1 aClass99_Sub1_1;

	@OriginalMember(owner = "client!fd", name = "wd", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!fd", name = "ce", descriptor = "I")
	public int anInt2269 = 128;

	@OriginalMember(owner = "client!fd", name = "he", descriptor = "Lclient!cm;")
	private final Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!fd", name = "le", descriptor = "Lclient!tu;")
	private final Class31_Sub1 aClass31_Sub1_1 = new Class31_Sub1();

	@OriginalMember(owner = "client!fd", name = "me", descriptor = "Lclient!tu;")
	public final Class31_Sub1 aClass31_Sub1_2 = new Class31_Sub1();

	@OriginalMember(owner = "client!fd", name = "re", descriptor = "I")
	public int anInt2275 = 3;

	@OriginalMember(owner = "client!fd", name = "oe", descriptor = "I")
	public int anInt2273 = 8;

	@OriginalMember(owner = "client!fd", name = "ne", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!fd", name = "te", descriptor = "Lclient!pk;")
	private final Class183 aClass183_6 = new Class183();

	@OriginalMember(owner = "client!fd", name = "ue", descriptor = "[Lclient!cp;")
	private final Interface3[] anInterface3Array1 = new Interface3[4];

	@OriginalMember(owner = "client!fd", name = "xe", descriptor = "I")
	private int anInt2277 = -1;

	@OriginalMember(owner = "client!fd", name = "we", descriptor = "I")
	private int anInt2276 = -1;

	@OriginalMember(owner = "client!fd", name = "Be", descriptor = "[Lclient!cp;")
	private final Interface3[] anInterface3Array3 = new Interface3[4];

	@OriginalMember(owner = "client!fd", name = "Ae", descriptor = "[Lclient!cp;")
	private final Interface3[] anInterface3Array2 = new Interface3[4];

	@OriginalMember(owner = "client!fd", name = "ze", descriptor = "I")
	private int anInt2278 = -1;

	@OriginalMember(owner = "client!fd", name = "De", descriptor = "Lclient!pk;")
	private final Class183 aClass183_7;

	@OriginalMember(owner = "client!fd", name = "Ge", descriptor = "Lclient!pk;")
	private final Class183 aClass183_8;

	@OriginalMember(owner = "client!fd", name = "He", descriptor = "Lclient!pk;")
	private final Class183 aClass183_9;

	@OriginalMember(owner = "client!fd", name = "Ie", descriptor = "Lclient!pk;")
	private final Class183 aClass183_10;

	@OriginalMember(owner = "client!fd", name = "Je", descriptor = "Lclient!pk;")
	private final Class183 aClass183_11;

	@OriginalMember(owner = "client!fd", name = "Ke", descriptor = "Lclient!pk;")
	private final Class183 aClass183_12;

	@OriginalMember(owner = "client!fd", name = "Le", descriptor = "Lclient!pk;")
	private final Class183 aClass183_13;

	@OriginalMember(owner = "client!fd", name = "We", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!fd", name = "Ne", descriptor = "I")
	public int anInt2282;

	@OriginalMember(owner = "client!fd", name = "of", descriptor = "[F")
	private final float[] aFloatArray16;

	@OriginalMember(owner = "client!fd", name = "cf", descriptor = "I")
	public int anInt2290;

	@OriginalMember(owner = "client!fd", name = "yf", descriptor = "I")
	private int anInt2296;

	@OriginalMember(owner = "client!fd", name = "Ue", descriptor = "I")
	private int anInt2286;

	@OriginalMember(owner = "client!fd", name = "wf", descriptor = "[Lclient!vp;")
	private final Class4_Sub21[] aClass4_Sub21Array1;

	@OriginalMember(owner = "client!fd", name = "sf", descriptor = "I")
	public int anInt2293;

	@OriginalMember(owner = "client!fd", name = "Ve", descriptor = "I")
	private int anInt2287;

	@OriginalMember(owner = "client!fd", name = "nf", descriptor = "I")
	private int anInt2292;

	@OriginalMember(owner = "client!fd", name = "tf", descriptor = "I")
	public int anInt2294;

	@OriginalMember(owner = "client!fd", name = "Af", descriptor = "I")
	public int anInt2297;

	@OriginalMember(owner = "client!fd", name = "bf", descriptor = "[F")
	private final float[] bf;

	@OriginalMember(owner = "client!fd", name = "Qe", descriptor = "F")
	private float aFloat57;

	@OriginalMember(owner = "client!fd", name = "kg", descriptor = "I")
	private int anInt2305;

	@OriginalMember(owner = "client!fd", name = "mf", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!fd", name = "fg", descriptor = "[F")
	private final float[] aFloatArray17;

	@OriginalMember(owner = "client!fd", name = "tg", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!fd", name = "vg", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!fd", name = "vf", descriptor = "I")
	public int anInt2295;

	@OriginalMember(owner = "client!fd", name = "Of", descriptor = "F")
	private float aFloat66;

	@OriginalMember(owner = "client!fd", name = "Zf", descriptor = "I")
	public int anInt2302;

	@OriginalMember(owner = "client!fd", name = "Ef", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!fd", name = "wg", descriptor = "I")
	private int anInt2308;

	@OriginalMember(owner = "client!fd", name = "Gg", descriptor = "[F")
	public final float[] aFloatArray19;

	@OriginalMember(owner = "client!fd", name = "Qg", descriptor = "I")
	public int anInt2317;

	@OriginalMember(owner = "client!fd", name = "Lg", descriptor = "Z")
	private boolean aBoolean210;

	@OriginalMember(owner = "client!fd", name = "Jg", descriptor = "I")
	public int anInt2315;

	@OriginalMember(owner = "client!fd", name = "ng", descriptor = "[F")
	private final float[] aFloatArray18;

	@OriginalMember(owner = "client!fd", name = "og", descriptor = "F")
	private float aFloat71;

	@OriginalMember(owner = "client!fd", name = "Dg", descriptor = "I")
	public int anInt2312;

	@OriginalMember(owner = "client!fd", name = "zg", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!fd", name = "yg", descriptor = "I")
	public int anInt2309;

	@OriginalMember(owner = "client!fd", name = "Fg", descriptor = "I")
	private int anInt2313;

	@OriginalMember(owner = "client!fd", name = "Nf", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!fd", name = "Lf", descriptor = "I")
	private int anInt2299;

	@OriginalMember(owner = "client!fd", name = "Sg", descriptor = "I")
	private int anInt2318;

	@OriginalMember(owner = "client!fd", name = "Vg", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!fd", name = "Oe", descriptor = "I")
	private int anInt2283;

	@OriginalMember(owner = "client!fd", name = "Sb", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas3;

	@OriginalMember(owner = "client!fd", name = "hb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!fd", name = "je", descriptor = "I")
	public final int anInt2272;

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!fd", name = "ed", descriptor = "J")
	private final long aLong73;

	@OriginalMember(owner = "client!fd", name = "mc", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!fd", name = "sg", descriptor = "I")
	public final int anInt2307;

	@OriginalMember(owner = "client!fd", name = "Xe", descriptor = "Z")
	public boolean aBoolean193;

	@OriginalMember(owner = "client!fd", name = "Vf", descriptor = "Z")
	private boolean aBoolean205;

	@OriginalMember(owner = "client!fd", name = "Ng", descriptor = "Z")
	public boolean aBoolean211;

	@OriginalMember(owner = "client!fd", name = "pg", descriptor = "Z")
	public boolean aBoolean207;

	@OriginalMember(owner = "client!fd", name = "rg", descriptor = "Z")
	private boolean aBoolean208;

	@OriginalMember(owner = "client!fd", name = "Me", descriptor = "Z")
	public boolean aBoolean191;

	@OriginalMember(owner = "client!fd", name = "ff", descriptor = "Z")
	private final boolean aBoolean196;

	@OriginalMember(owner = "client!fd", name = "ie", descriptor = "Lclient!ee;")
	public final Class59 aClass59_1;

	@OriginalMember(owner = "client!fd", name = "se", descriptor = "Lclient!de;")
	public final Class47 aClass47_1;

	@OriginalMember(owner = "client!fd", name = "ee", descriptor = "Lclient!wb;")
	private final Class260 aClass260_1;

	@OriginalMember(owner = "client!fd", name = "ke", descriptor = "Lclient!fh;")
	private Class4_Sub10_Sub1 aClass4_Sub10_Sub1_1;

	@OriginalMember(owner = "client!fd", name = "fe", descriptor = "Lclient!uv;")
	private final Class248 aClass248_1;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;ILclient!et;)V")
	public Class19_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class66 arg4) {
		super(arg0, arg2);
		new Class229();
		new Class102(16);
		this.aClass183_7 = new Class183();
		this.aClass183_8 = new Class183();
		this.aClass183_9 = new Class183();
		this.aClass183_10 = new Class183();
		this.aClass183_11 = new Class183();
		this.aClass183_12 = new Class183();
		this.aClass183_13 = new Class183();
		this.aFloat58 = 1.0F;
		this.anInt2282 = 0;
		this.aFloatArray16 = new float[4];
		this.anInt2290 = 50;
		this.anInt2296 = 0;
		this.anInt2286 = -1;
		this.aClass4_Sub21Array1 = new Class4_Sub21[Static182.anInt3494];
		this.anInt2293 = 0;
		this.anInt2287 = -1;
		this.anInt2292 = 0;
		this.anInt2294 = 512;
		this.anInt2297 = 0;
		this.bf = new float[16];
		this.aFloat57 = 0.0F;
		this.anInt2305 = 8448;
		this.aFloat61 = 3584.0F;
		this.aFloatArray17 = new float[4];
		this.aFloat72 = 1.0F;
		this.aFloat73 = -1.0F;
		this.anInt2295 = 0;
		this.aFloat66 = 1.0F;
		this.anInt2302 = -1;
		this.aFloat63 = 3000.0F;
		this.anInt2308 = 0;
		this.aFloatArray19 = new float[4];
		this.anInt2317 = -1;
		this.aBoolean210 = true;
		this.anInt2315 = -1;
		this.aFloatArray18 = new float[4];
		this.aFloat71 = 1.0F;
		this.anInt2312 = 3584;
		this.aFloat74 = 1.0F;
		this.anInt2309 = 512;
		this.anInt2313 = 0;
		this.aFloat65 = -1.0F;
		this.anInt2299 = 8448;
		this.anInt2318 = 0;
		this.aFloat77 = 3584.0F;
		this.anInt2283 = 0;
		this.aCanvas2 = this.aCanvas3 = arg1;
		this.anInt2272 = arg3;
		try {
			if (Static179.aBoolean288 == null || !Static179.aBoolean288) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static179.aBoolean288 = Boolean.TRUE;
				} else {
					@Pc(254) String local254 = System.getProperty("os.name").toLowerCase();
					if (!local254.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local254.startsWith("linux") || local254.startsWith("sunos")) {
						System.load(arg4.method1733("libjaggl.so").toString());
					} else if (local254.startsWith("mac")) {
						System.load(arg4.method1733("libjaggl.jnilib").toString());
					} else if (local254.startsWith("win")) {
						System.load(arg4.method1733("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static179.aBoolean288 = Boolean.TRUE;
				}
			}
			if (Static179.aBoolean288 == null || !Static179.aBoolean288) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong72 = this.aLong73 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt2272);
			if (this.aLong73 == 0L) {
				throw new RuntimeException("");
			}
			this.method1896();
			@Pc(353) int local353 = this.method1974();
			if (local353 != 0) {
				throw new RuntimeException("");
			}
			this.anInt2307 = this.aBoolean215 ? 33639 : 5121;
			@Pc(376) int local376;
			if (this.aString27.indexOf("radeon") != -1) {
				local376 = 0;
				@Pc(378) boolean local378 = false;
				@Pc(380) boolean local380 = false;
				@Pc(389) String[] local389 = Static113.method2058(this.aString27.replace('/', ' '), ' ');
				for (@Pc(391) int local391 = 0; local391 < local389.length; local391++) {
					@Pc(397) String local397 = local389[local391];
					try {
						if (local397.length() > 0) {
							if (local397.charAt(0) == 'x' && local397.length() >= 3 && Static88.method1590(local397.substring(1, 3))) {
								local397 = local397.substring(1);
								local380 = true;
							}
							if (local397.equals("hd")) {
								local378 = true;
							} else {
								if (local397.startsWith("hd")) {
									local378 = true;
									local397 = local397.substring(2);
								}
								if (local397.length() >= 4 && Static88.method1590(local397.substring(0, 4))) {
									local376 = Static198.method3113(local397.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(464) Exception local464) {
					}
				}
				if (!local378 || local376 < 4000) {
					this.aBoolean193 = false;
				}
				if (!local380 && !local378) {
					if (local376 >= 7000 && local376 <= 7999) {
						this.aBoolean205 = false;
					}
					if (local376 >= 7000 && local376 <= 9250) {
						this.aBoolean211 = false;
					}
				}
				this.aBoolean207 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean208 = this.aBoolean205;
			}
			if (this.aString26.indexOf("intel") != -1) {
				this.aBoolean191 = false;
			}
			this.aBoolean196 = !this.aString26.equals("s3 graphics");
			if (this.aBoolean205) {
				try {
					@Pc(543) int[] local543 = new int[1];
					OpenGL.glGenBuffersARB(1, local543, 0);
				} catch (@Pc(549) Throwable local549) {
					throw new RuntimeException("");
				}
			}
			Static347.method4678(false, true);
			this.aBoolean190 = true;
			this.aClass59_1 = new Class59(this, super.anInterface7_6);
			this.method1964();
			this.aClass47_1 = new Class47(this);
			this.aClass260_1 = new Class260(this);
			if (this.aClass260_1.method5531()) {
				this.aClass4_Sub10_Sub1_1 = new Class4_Sub10_Sub1(this);
				if (!this.aClass4_Sub10_Sub1_1.method2008()) {
					this.aClass4_Sub10_Sub1_1.method2006();
					this.aClass4_Sub10_Sub1_1 = null;
				}
			}
			this.aClass248_1 = new Class248(this);
			this.method1969();
			this.method1909();
			OpenGL.glClear(16640);
			local376 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(628) Exception local628) {
					if (local376++ > 5) {
						throw new RuntimeException("");
					}
					Static435.method5503(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(648) Throwable local648) {
			local648.printStackTrace();
			this.method4239();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(I)V")
	private void method1896() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static435.method5503(1000L);
		}
	}

	@OriginalMember(owner = "client!fd", name = "X", descriptor = "(III[I)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.aClass31_Sub1_4.aFloat199 + this.aClass31_Sub1_4.aFloat203 * (float) arg1 + this.aClass31_Sub1_4.aFloat206 * (float) arg0 + this.aClass31_Sub1_4.aFloat198;
		if ((float) this.anInt2290 > local28 || local28 > (float) this.anInt2312) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt2309 * (this.aClass31_Sub1_4.aFloat209 + (float) arg2 * this.aClass31_Sub1_4.aFloat208 + this.aClass31_Sub1_4.aFloat202 * (float) arg0 + (float) arg1 * this.aClass31_Sub1_4.aFloat207) / local28);
		@Pc(117) int local117 = (int) ((this.aClass31_Sub1_4.aFloat205 + this.aClass31_Sub1_4.aFloat200 * (float) arg0 + (float) arg1 * this.aClass31_Sub1_4.aFloat204 + (float) arg2 * this.aClass31_Sub1_4.aFloat201) * (float) this.anInt2294 / local28);
		if ((float) local85 >= this.aFloat75 && this.aFloat64 >= (float) local85 && (float) local117 >= this.aFloat62 && (float) local117 <= this.aFloat68) {
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat62);
			arg3[0] = (int) ((float) local85 - this.aFloat75);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)I")
	public int method1897(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "()Z")
	@Override
	public boolean method4279() {
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "()Z")
	@Override
	public boolean method4243() {
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4263(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas3) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(Z)V")
	public void method1898() {
		if (this.anInt2319 != 0) {
			this.anInt2319 = 0;
			this.anInt2320 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	@Override
	public void method4237(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class145 method4285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static408.method5256(arg1, arg2, arg0, this, arg3);
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(I)V")
	private void method1899() {
		if (this.anInt2319 != 3) {
			this.anInt2319 = 3;
			this.method1933();
			this.method1952();
			this.anInt2320 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(II)V")
	public void method1900(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method1912(7681, 7681);
		} else if (arg0 == 0) {
			this.method1912(8448, 8448);
		} else if (arg0 == 2) {
			this.method1912(34165, 7681);
		} else if (arg0 == 3) {
			this.method1912(260, 8448);
		} else if (arg0 == 4) {
			this.method1912(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)V")
	public void method1901(@OriginalArg(1) int arg0) {
		Static406.aFloatArray30[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static406.aFloatArray30[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static406.aFloatArray30[3] = (float) (arg0 >>> 24) / 255.0F;
		Static406.aFloatArray30[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static406.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZILclient!jaggl/memory/NativeBuffer;II)Lclient!vd;")
	public Interface11 method1902(@OriginalArg(2) NativeBuffer arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return (Interface11) (this.aBoolean205 ? new Class152_Sub2(this, arg2, arg0, arg1, false) : new Class64_Sub2(this, arg2, arg0));
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)V")
	@Override
	public void method4255(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(Z)V")
	private void method1903() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt2291; local7++) {
			@Pc(19) Class4_Sub21 local19 = this.aClass4_Sub21Array1[local7];
			@Pc(23) int local23 = local7 + 16386;
			Static206.aFloatArray23[0] = local19.method3160();
			Static206.aFloatArray23[1] = local19.method3161();
			Static206.aFloatArray23[2] = local19.method3164();
			Static206.aFloatArray23[3] = 1.0F;
			OpenGL.glLightfv(local23, 4611, Static206.aFloatArray23, 0);
			@Pc(57) int local57 = local19.method3162();
			@Pc(63) float local63 = local19.method3159() / 255.0F;
			Static206.aFloatArray23[0] = local63 * (float) (local57 >> 16 & 0xFF);
			Static206.aFloatArray23[1] = (float) (local57 >> 8 & 0xFF) * local63;
			Static206.aFloatArray23[2] = (float) (local57 & 0xFF) * local63;
			OpenGL.glLightfv(local23, 4609, Static206.aFloatArray23, 0);
			OpenGL.glLightf(local23, 4617, 1.0F / (float) (local19.method3165() * local19.method3165()));
			OpenGL.glEnable(local23);
		}
		while (local7 < this.anInt2284) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt2284 = this.anInt2291;
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "(I)V")
	public void method1904() {
		if (this.anInt2320 == 8) {
			return;
		}
		this.method1924();
		this.method1918(true);
		this.method1951(true);
		this.method1911(true);
		this.method1958(1);
		this.method1900(0);
		this.anInt2320 = 8;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLclient!kj;)V")
	public void method1905(@OriginalArg(1) Class6 arg0) {
		@Pc(11) Class6 local11 = this.aClass6Array1[this.anInt2301];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt5441);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt5441);
				} else if (arg0.anInt5441 != local11.anInt5441) {
					OpenGL.glDisable(local11.anInt5441);
					OpenGL.glEnable(arg0.anInt5441);
				}
				OpenGL.glBindTexture(arg0.anInt5441, arg0.method4186());
			}
			this.aClass6Array1[this.anInt2301] = arg0;
		}
		this.anInt2320 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!fd", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < this.anInt2296) {
			this.anInt2296 = arg3;
		}
		if (this.anInt2292 > arg2) {
			this.anInt2292 = arg2;
		}
		if (this.anInt2318 < arg1) {
			this.anInt2318 = arg1;
		}
		if (this.anInt2313 < arg0) {
			this.anInt2313 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method1953();
		this.method1915();
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Lclient!u;")
	@Override
	public Class4_Sub2 method4284(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub2_Sub1 local8 = new Class4_Sub2_Sub1(arg0);
		this.aClass183_6.method4137(local8);
		return local8;
	}

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "()I")
	@Override
	public int method4260() {
		return 4;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
	public void method1906(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean212 != arg0) {
			this.aBoolean212 = arg0;
			this.method1919();
			this.anInt2320 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "(I)V")
	private void method1907() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.bf, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)V")
	public synchronized void method1908(@OriginalArg(0) int arg0) {
		@Pc(13) Class4 local13 = new Class4();
		local13.aLong224 = arg0;
		this.aClass183_12.method4137(local13);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	private void method1909() {
		if (this.aCanvas2 == null) {
			this.anInt2214 = this.anInt2106 = 0;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas2.getSize();
			this.anInt2106 = local14.height;
			this.anInt2214 = local14.width;
		}
		if (this.anInterface3_1 == null) {
			this.anInt2138 = this.anInt2106;
			this.anInt2240 = this.anInt2214;
			this.method1950();
		}
		this.method1898();
		this.e();
	}

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "(IIIIII)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method1977();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method1958(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean194) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean194) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	public synchronized void method1910(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub37 local8 = new Class4_Sub37(arg0);
		local8.aLong224 = arg1;
		this.aClass183_11.method4137(local8);
	}

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "()Z")
	@Override
	public boolean method4286() {
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
	@Override
	public void method4283(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "()Z")
	@Override
	public boolean method4300() {
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)V")
	public void method1911(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean200 != arg0) {
			this.aBoolean200 = arg0;
			this.method1976();
			this.anInt2320 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass260_1.method5530(arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZ)V")
	public void method1912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2301 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (this.anInt2299 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt2299 = arg0;
			local17 = true;
		}
		if (arg1 != this.anInt2305) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local17 = true;
			this.anInt2305 = arg1;
		}
		if (local17) {
			this.anInt2320 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!fd", name = "NA", descriptor = "(IIIII)V")
	@Override
	protected void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZFFFF)V")
	public void method1913(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static406.aFloatArray30[2] = arg2;
		Static406.aFloatArray30[1] = arg0;
		Static406.aFloatArray30[3] = arg1;
		Static406.aFloatArray30[0] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static406.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!jq;IIII)Lclient!t;")
	@Override
	public Class110 method4254(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class110_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	public void method1914() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray19, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "()Z")
	@Override
	public boolean method4261() {
		return this.aClass248_1.method5317();
	}

	@OriginalMember(owner = "client!fd", name = "ea", descriptor = "(Lclient!c;)V")
	@Override
	public void ea(@OriginalArg(0) Class31 arg0) {
		this.aClass31_Sub1_4 = (Class31_Sub1) arg0;
		this.aClass31_Sub1_3.method5158(this.aClass31_Sub1_4);
		if (this.anInt2319 != 1) {
			this.method1952();
		}
	}

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "()V")
	@Override
	public void method4311() {
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4272(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas3 == arg0) {
			local5 = this.aLong73;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable2.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas2 == arg0) {
			this.method1909();
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
	private void method1915() {
		if (this.anInt2313 <= this.anInt2292 && this.anInt2318 <= this.anInt2296) {
			OpenGL.glScissor(this.anInt2313 + this.anInt2308, -this.anInt2296 + (this.anInt2283 - -this.anInt2138), this.anInt2292 - this.anInt2313, this.anInt2296 + -this.anInt2318);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4250(@OriginalArg(0) Canvas arg0) {
		this.aCanvas2 = null;
		this.aLong72 = 0L;
		if (arg0 == null || arg0 == this.aCanvas3) {
			this.aLong72 = this.aLong73;
			this.aCanvas2 = this.aCanvas3;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable2.get(arg0);
			this.aLong72 = local26;
			this.aCanvas2 = arg0;
		}
		if (this.aCanvas2 == null || this.aLong72 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong72);
		this.method1909();
	}

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "()V")
	@Override
	public void method4278() {
		this.aClass260_1.method5532();
	}

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "(I)V")
	public void method1916() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!fd", name = "W", descriptor = "()F")
	@Override
	public float W() {
		return this.aFloat63;
	}

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "(I)V")
	private void method1917() {
		if (this.aBoolean206) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean206 = false;
		}
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "()Z")
	@Override
	public boolean method4248() {
		if (this.aClass4_Sub10_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass4_Sub10_Sub1_1.method2003()) {
			if (!this.aClass260_1.method5525(this.aClass4_Sub10_Sub1_1)) {
				return false;
			}
			this.aClass59_1.method1550();
		}
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(ZI)V")
	public void method1918(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean197 != arg0) {
			this.aBoolean197 = arg0;
			this.method1968();
			this.anInt2320 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "(I)V")
	private void method1919() {
		if (this.aBoolean212 && !this.aBoolean202) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(II)I")
	public int method1920(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(Z)V")
	private void method1921() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!cp;B)V")
	public void method1922(@OriginalArg(0) Interface3 arg0) {
		if (this.aBoolean204) {
			this.method1940(arg0);
			this.method1956(arg0);
		} else if (this.anInt2276 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt2276 >= 0) {
				this.anInterface3Array3[this.anInt2276].method3603();
			}
			this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array3[++this.anInt2276] = arg0;
			this.anInterface3_2.method3602();
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V")
	private void method1923() {
		@Pc(6) float[] local6 = this.bf;
		@Pc(18) float local18 = (float) (-this.anInt2295 * this.anInt2290) / (float) this.anInt2309;
		@Pc(32) float local32 = (float) ((this.anInt2240 - this.anInt2295) * this.anInt2290) / (float) this.anInt2309;
		@Pc(52) float local52 = (float) (this.anInt2297 * this.anInt2290) / (float) this.anInt2294;
		@Pc(67) float local67 = (float) (this.anInt2290 * (this.anInt2297 - this.anInt2138)) / (float) this.anInt2294;
		if (local18 == local32 || local67 == local52) {
			local6[7] = 0.0F;
			local6[13] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = 1.0F;
			local6[2] = 0.0F;
			local6[9] = 0.0F;
			local6[14] = 0.0F;
			local6[4] = 0.0F;
			local6[10] = 1.0F;
			local6[15] = 1.0F;
			local6[8] = 0.0F;
			local6[1] = 0.0F;
			local6[12] = 0.0F;
			local6[0] = 1.0F;
			local6[11] = 0.0F;
			local6[6] = 0.0F;
		} else {
			@Pc(81) float local81 = (float) this.anInt2290 * 2.0F;
			local6[6] = 0.0F;
			local6[3] = 0.0F;
			local6[13] = 0.0F;
			local6[5] = local81 / (local52 - local67);
			local6[4] = 0.0F;
			local6[7] = 0.0F;
			local6[8] = (local32 + local18) / (local32 - local18);
			local6[12] = 0.0F;
			local6[9] = (local52 + local67) / (-local67 + local52);
			local6[14] = this.aFloat60 = -(local81 * (float) this.anInt2312) / (float) (this.anInt2312 - this.anInt2290);
			local6[2] = 0.0F;
			local6[15] = 0.0F;
			local6[10] = this.aFloat69 = (float) -(this.anInt2312 + this.anInt2290) / (float) (this.anInt2312 - this.anInt2290);
			local6[1] = 0.0F;
			local6[11] = -1.0F;
			local6[0] = local81 / (local32 - local18);
		}
		this.method1975();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)Lclient!tb;")
	@Override
	public Class99 method4268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean199 ? new Class99_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(Z)V")
	private void method1924() {
		if (this.anInt2319 != 2) {
			this.anInt2319 = 2;
			this.method1907();
			this.method1952();
			this.anInt2320 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4290(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4247();
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIII)V")
	public void method1925(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!tb;Lclient!tb;FLclient!tb;)Lclient!tb;")
	@Override
	public Class99 method4298(@OriginalArg(0) Class99 arg0, @OriginalArg(1) Class99 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class99 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean199 && this.aBoolean191 && this.aBoolean204) {
			@Pc(18) Class99_Sub1_Sub1 local18 = null;
			@Pc(21) Class99_Sub1 local21 = (Class99_Sub1) arg0;
			@Pc(24) Class99_Sub1 local24 = (Class99_Sub1) arg1;
			@Pc(28) Class6_Sub4 local28 = local21.method3232();
			@Pc(32) Class6_Sub4 local32 = local24.method3232();
			if (local28 != null && local32 != null) {
				@Pc(51) int local51 = local32.anInt3257 < local28.anInt3257 ? local28.anInt3257 : local32.anInt3257;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class99_Sub1_Sub1) {
					@Pc(63) Class99_Sub1_Sub1 local63 = (Class99_Sub1_Sub1) arg3;
					if (local51 == local63.method2668()) {
						local18 = local63;
					}
				}
				if (local18 == null) {
					local18 = new Class99_Sub1_Sub1(this, local51);
				}
				if (local18.method2666(local32, arg2, local28)) {
					return local18;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!t;Lclient!mc;Lclient!c;Lclient!mi;I)V")
	@Override
	public void method4262(@OriginalArg(0) Class110 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class3_Sub5 arg3) {
		arg0.method4889(arg2, arg3, 0);
		this.method4277(arg1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZBIZ)V")
	public void method1926(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt2314 != arg1) {
			if (arg1 < 0) {
				this.method1917();
				this.method1905(null);
				this.method1900(0);
				if (!this.aBoolean192) {
					this.aClass248_1.method5318(arg2, arg0, 0);
				}
			} else {
				@Pc(13) Class6_Sub1 local13 = this.aClass59_1.method1549(arg1);
				@Pc(19) Class251 local19 = super.anInterface7_6.method2396(arg1);
				if (local19.aByte91 == 0 && local19.aByte93 == 0) {
					this.method1917();
				} else {
					@Pc(35) int local35 = local19.aBoolean637 ? 64 : 128;
					@Pc(39) int local39 = local35 * 50;
					this.method1963((float) (local19.aByte93 * (this.anInt2274 % local39)) / (float) local39, (float) (local19.aByte91 * (this.anInt2274 % local39)) / (float) local39, 0.0F);
				}
				if (this.aBoolean192) {
					this.aClass248_1.method5318(arg2, arg0, 3);
					this.method1905(local13);
					this.method1900(local19.anInt6934);
				} else {
					this.aClass248_1.method5318(arg2, arg0, local19.aByte89);
					this.aClass248_1.method5319(local19.anInt6933, local19.aByte88);
					if (!this.aClass248_1.method5316(local13, local19.anInt6934)) {
						this.method1905(local13);
						this.method1900(local19.anInt6934);
					}
				}
			}
			this.anInt2314 = arg1;
		}
		this.anInt2320 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)V")
	private void method1927() {
		Static406.aFloatArray30[2] = this.aFloat74 * this.aFloat73;
		Static406.aFloatArray30[0] = this.aFloat73 * this.aFloat72;
		Static406.aFloatArray30[3] = 1.0F;
		Static406.aFloatArray30[1] = this.aFloat58 * this.aFloat73;
		OpenGL.glLightfv(16384, 4609, Static406.aFloatArray30, 0);
		Static406.aFloatArray30[1] = this.aFloat58 * -this.aFloat65;
		Static406.aFloatArray30[2] = -this.aFloat65 * this.aFloat74;
		Static406.aFloatArray30[3] = 1.0F;
		Static406.aFloatArray30[0] = -this.aFloat65 * this.aFloat72;
		OpenGL.glLightfv(16385, 4609, Static406.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!fd", name = "T", descriptor = "(IFFFFF)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt2286 != arg0;
		if (local11 || arg1 != this.aFloat73 || arg2 != this.aFloat65) {
			this.aFloat65 = arg2;
			this.anInt2286 = arg0;
			this.aFloat73 = arg1;
			if (local11) {
				this.aFloat58 = (float) (this.anInt2286 & 0xFF00) / 65280.0F;
				this.aFloat72 = (float) (this.anInt2286 & 0xFF0000) / 1.671168E7F;
				this.aFloat74 = (float) (this.anInt2286 & 0xFF) / 255.0F;
				this.method1961();
			}
			this.method1927();
		}
		if (this.aFloatArray18[0] == arg3 && arg4 == this.aFloatArray18[1] && this.aFloatArray18[2] == arg5) {
			return;
		}
		this.aFloatArray18[2] = arg5;
		this.aFloatArray18[1] = arg4;
		this.aFloatArray18[0] = arg3;
		this.aFloatArray16[1] = -arg4;
		this.aFloatArray16[0] = -arg3;
		this.aFloatArray16[2] = -arg5;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray19[0] = arg3 * local138;
		this.aFloatArray19[2] = arg5 * local138;
		this.aFloatArray19[1] = local138 * arg4;
		this.aFloatArray17[2] = -this.aFloatArray19[2];
		this.aFloatArray17[1] = -this.aFloatArray19[1];
		this.aFloatArray17[0] = -this.aFloatArray19[0];
		this.method1914();
		this.anInt2289 = (int) (arg3 * 256.0F / arg4);
		this.anInt2311 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(Z)V")
	public void method1928() {
		if (this.anInt2320 == 16) {
			return;
		}
		this.method1899();
		this.method1918(true);
		this.method1951(true);
		this.method1911(true);
		this.method1958(1);
		this.method1900(0);
		this.anInt2320 = 16;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)I")
	@Override
	public int method4282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4246(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class4_Sub37 local19;
		while (!this.aClass183_8.method4147()) {
			local19 = (Class4_Sub37) this.aClass183_8.method4136();
			Static429.anIntArray537[local11++] = (int) local19.aLong224;
			this.anInt2280 -= local19.anInt5426;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static429.anIntArray537, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static429.anIntArray537, 0);
			local11 = 0;
		}
		while (!this.aClass183_9.method4147()) {
			local19 = (Class4_Sub37) this.aClass183_9.method4136();
			Static429.anIntArray537[local11++] = (int) local19.aLong224;
			this.anInt2279 -= local19.anInt5426;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static429.anIntArray537, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static429.anIntArray537, 0);
			local11 = 0;
		}
		while (!this.aClass183_10.method4147()) {
			local19 = (Class4_Sub37) this.aClass183_10.method4136();
			Static429.anIntArray537[local11++] = local19.anInt5426;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static429.anIntArray537, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static429.anIntArray537, 0);
			local11 = 0;
		}
		while (!this.aClass183_11.method4147()) {
			local19 = (Class4_Sub37) this.aClass183_11.method4136();
			Static429.anIntArray537[local11++] = (int) local19.aLong224;
			this.anInt2281 -= local19.anInt5426;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static429.anIntArray537, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static429.anIntArray537, 0);
		}
		while (!this.aClass183_7.method4147()) {
			local19 = (Class4_Sub37) this.aClass183_7.method4136();
			OpenGL.glDeleteLists((int) local19.aLong224, local19.anInt5426);
		}
		@Pc(215) Class4 local215;
		while (!this.aClass183_12.method4147()) {
			local215 = this.aClass183_12.method4136();
			OpenGL.glDeleteProgramARB((int) local215.aLong224);
		}
		while (!this.aClass183_13.method4147()) {
			local215 = this.aClass183_13.method4136();
			OpenGL.glDeleteObjectARB(local215.aLong224);
		}
		while (!this.aClass183_7.method4147()) {
			local19 = (Class4_Sub37) this.aClass183_7.method4136();
			OpenGL.glDeleteLists((int) local19.aLong224, local19.anInt5426);
		}
		this.aClass59_1.method1545();
		if (this.IA() > 100663296 && Static282.method3962() > this.aLong74 + 60000L) {
			System.gc();
			this.aLong74 = Static282.method3962();
		}
		this.anInt2274 = local9;
	}

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "(I)V")
	public void method1929() {
		if (this.anInt2320 == 4) {
			return;
		}
		this.method1932();
		this.method1918(false);
		this.method1906(false);
		this.method1951(false);
		this.method1911(false);
		this.method1957(-2);
		this.method1958(1);
		this.method1900(0);
		this.anInt2320 = 4;
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(Z)V")
	public void method1930() {
		if (this.anInt2320 == 2) {
			return;
		}
		this.method1932();
		this.method1918(false);
		this.method1906(false);
		this.method1951(false);
		this.method1911(false);
		this.method1957(-2);
		this.anInt2320 = 2;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)V")
	public void method1931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2308 = arg1;
		this.anInt2283 = arg0;
		this.method1950();
		this.method1915();
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
	@Override
	public void method4303(@OriginalArg(0) int arg0) {
		this.method1921();
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "()V")
	@Override
	public void e() {
		this.anInt2292 = this.anInt2240;
		this.anInt2313 = 0;
		this.anInt2296 = this.anInt2138;
		this.anInt2318 = 0;
		OpenGL.glDisable(3089);
		this.method1953();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class65 method4297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class65_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "(I)V")
	private void method1932() {
		if (this.anInt2319 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt2240 > 0 && this.anInt2138 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt2240, (double) this.anInt2138, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt2319 = 1;
		this.anInt2320 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class145_Sub1 local6 = (Class145_Sub1) arg5;
		@Pc(9) Class6_Sub1_Sub1 local9 = local6.aClass6_Sub1_Sub1_5;
		this.method1930();
		this.method1905(local6.aClass6_Sub1_Sub1_5);
		this.method1958(1);
		this.method1912(7681, 8448);
		this.method1945(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat172 / (float) local9.anInt5470;
		@Pc(46) float local46 = local9.aFloat171 / (float) local9.anInt5474;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method1945(0, 768, 5890);
	}

	@OriginalMember(owner = "client!fd", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2293 = arg3;
		this.anInt2288 = arg0;
		this.anInt2317 = arg2;
		this.anInt2287 = arg1;
		this.aBoolean192 = true;
		this.aClass248_1.method5318(false, false, 3);
		this.aClass248_1.aClass9_Sub9_1.method5380();
		this.method1959();
		this.method1968();
	}

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "()Z")
	@Override
	public boolean method4259() {
		return this.aBoolean194 && (!this.method4301() || this.aBoolean201);
	}

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "(I)V")
	private void method1933() {
		@Pc(15) float local15 = (float) -this.anInt2295 * this.aFloat66 / (float) this.anInt2309;
		@Pc(27) float local27 = this.aFloat66 * (float) -this.anInt2297 / (float) this.anInt2294;
		@Pc(48) float local48 = this.aFloat66 * (float) (this.anInt2240 - this.anInt2295) / (float) this.anInt2309;
		@Pc(63) float local63 = (float) (this.anInt2138 - this.anInt2297) * this.aFloat66 / (float) this.anInt2294;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local48 && local27 != local63) {
			OpenGL.glOrtho((double) local15, (double) local48, (double) -local63, (double) -local27, (double) ((float) this.anInt2290 - this.aFloat67), (double) ((float) this.anInt2312 - this.aFloat67));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!pc;ILclient!pc;Lclient!pc;Lclient!pc;)V")
	public void method1934(@OriginalArg(0) Class177 arg0, @OriginalArg(2) Class177 arg1, @OriginalArg(3) Class177 arg2, @OriginalArg(4) Class177 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method1944(arg3.anInterface11_7);
			OpenGL.glVertexPointer(arg3.aByte56, arg3.aShort68, this.anInterface11_3.method5182(), this.anInterface11_3.method5183() + (long) arg3.aByte55);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method1944(arg1.anInterface11_7);
			OpenGL.glNormalPointer(arg1.aShort68, this.anInterface11_3.method5182(), this.anInterface11_3.method5183() + (long) arg1.aByte55);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method1944(arg0.anInterface11_7);
			OpenGL.glColorPointer(arg0.aByte56, arg0.aShort68, this.anInterface11_3.method5182(), this.anInterface11_3.method5183() + (long) arg0.aByte55);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method1944(arg2.anInterface11_7);
			OpenGL.glTexCoordPointer(arg2.aByte56, arg2.aShort68, this.anInterface11_3.method5182(), this.anInterface11_3.method5183() + (long) arg2.aByte55);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[Lclient!vp;)V")
	@Override
	public void method4238(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub21[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass4_Sub21Array1[local7] = arg1[local7];
		}
		this.anInt2291 = arg0;
		if (this.anInt2319 != 1) {
			this.method1903();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLclient!cp;)V")
	public void method1935(@OriginalArg(1) Interface3 arg0) {
		if (this.anInt2278 < 0 || this.anInterface3Array2[this.anInt2278] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface3Array2[this.anInt2278--] = null;
		arg0.method3606();
		if (this.anInt2278 >= 0) {
			this.anInterface3_2 = this.anInterface3Array2[this.anInt2278];
			this.anInterface3_2.method3607();
		} else {
			this.anInterface3_2 = null;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method4244(@OriginalArg(0) Class4_Sub2 arg0) {
		this.aNativeHeap2 = ((Class4_Sub2_Sub1) arg0).aNativeHeap1;
		if (this.anInterface11_2 != null) {
			return;
		}
		@Pc(16) Class4_Sub12_Sub2 local16 = new Class4_Sub12_Sub2(80);
		if (this.aBoolean215) {
			local16.method2556(-1.0F);
			local16.method2556(-1.0F);
			local16.method2556(0.0F);
			local16.method2556(0.0F);
			local16.method2556(1.0F);
			local16.method2556(1.0F);
			local16.method2556(-1.0F);
			local16.method2556(0.0F);
			local16.method2556(1.0F);
			local16.method2556(1.0F);
			local16.method2556(1.0F);
			local16.method2556(1.0F);
			local16.method2556(0.0F);
			local16.method2556(1.0F);
			local16.method2556(0.0F);
			local16.method2556(-1.0F);
			local16.method2556(1.0F);
			local16.method2556(0.0F);
			local16.method2556(0.0F);
			local16.method2556(0.0F);
		} else {
			local16.method2552(-1.0F);
			local16.method2552(-1.0F);
			local16.method2552(0.0F);
			local16.method2552(0.0F);
			local16.method2552(1.0F);
			local16.method2552(1.0F);
			local16.method2552(-1.0F);
			local16.method2552(0.0F);
			local16.method2552(1.0F);
			local16.method2552(1.0F);
			local16.method2552(1.0F);
			local16.method2552(1.0F);
			local16.method2552(0.0F);
			local16.method2552(1.0F);
			local16.method2552(0.0F);
			local16.method2552(-1.0F);
			local16.method2552(1.0F);
			local16.method2552(0.0F);
			local16.method2552(0.0F);
			local16.method2552(0.0F);
		}
		this.anInterface11_2 = this.method1960(local16.anInt2997, local16.aByteArray36, false, 20);
		this.aClass177_6 = new Class177(this.anInterface11_2, 5126, 3, 0);
		this.aClass177_5 = new Class177(this.anInterface11_2, 5126, 2, 12);
		this.aClass40_1.method917(this);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt2290;
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(II)V")
	public void method1936(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt2301) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt2301 = arg0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "()V")
	@Override
	public void l() {
		this.aBoolean192 = false;
		this.aClass248_1.method5318(false, false, 0);
		this.method1959();
		this.method1968();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FB)V")
	public void method1937(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat66) {
			this.aFloat66 = arg0;
			if (this.anInt2319 == 3) {
				this.method1933();
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "()Lclient!c;")
	@Override
	public Class31 method4289() {
		return this.aClass31_Sub1_1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIZ)V")
	public void method1938(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		this.method1926(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(III)V")
	public synchronized void method1939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class4_Sub37 local12 = new Class4_Sub37(arg1);
		local12.aLong224 = arg0;
		this.aClass183_8.method4137(local12);
	}

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "()Z")
	@Override
	public boolean method4264() {
		return false;
	}

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "()Lclient!c;")
	@Override
	public Class31 method4274() {
		return new Class31_Sub1();
	}

	@OriginalMember(owner = "client!fd", name = "OA", descriptor = "(IIII)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt2138) {
			arg3 = this.anInt2138;
		}
		if (arg2 > this.anInt2240) {
			arg2 = this.anInt2240;
		}
		this.anInt2313 = arg0;
		this.anInt2318 = arg1;
		this.anInt2292 = arg2;
		this.anInt2296 = arg3;
		OpenGL.glEnable(3089);
		this.method1953();
		this.method1915();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLclient!cp;)V")
	public void method1940(@OriginalArg(1) Interface3 arg0) {
		if (this.anInt2278 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2278 >= 0) {
			this.anInterface3Array2[this.anInt2278].method3606();
		}
		this.anInterface3_2 = this.anInterface3Array2[++this.anInt2278] = arg0;
		this.anInterface3_2.method3607();
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(ZI)V")
	public synchronized void method1941(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub37 local12 = new Class4_Sub37(arg0);
		this.aClass183_10.method4137(local12);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!tu;I)V")
	public void method1942(@OriginalArg(0) Class31_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method5161(), 0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFI)V")
	public void method1943(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat57 = arg1;
		this.aFloat71 = arg0;
		if (!this.aBoolean192) {
			this.method1959();
		}
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "()Z")
	@Override
	public boolean method4245() {
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		@Pc(6) int local6 = this.anInt2310;
		this.anInt2310 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!fd", name = "da", descriptor = "([I)V")
	@Override
	public void da(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt2296;
		arg0[2] = this.anInt2292;
		arg0[0] = this.anInt2313;
		arg0[1] = this.anInt2318;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!vd;I)V")
	public void method1944(@OriginalArg(0) Interface11 arg0) {
		if (arg0 != this.anInterface11_3) {
			if (this.aBoolean205) {
				OpenGL.glBindBufferARB(34962, arg0.method5181());
			}
			this.anInterface11_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "xa", descriptor = "()F")
	@Override
	public float xa() {
		return this.aFloat67;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIII)V")
	public void method1945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(B)Lclient!im;")
	public Class6_Sub4 method1946() {
		return this.aClass99_Sub1_1 == null ? null : this.aClass99_Sub1_1.method3232();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!tb;)V")
	@Override
	public void method4288(@OriginalArg(0) Class99 arg0) {
		this.aClass99_Sub1_1 = (Class99_Sub1) arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class57 method4280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class57_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!tu;)V")
	public void method1948(@OriginalArg(1) Class31_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method5161(), 0);
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "()Z")
	@Override
	public boolean method4251() {
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "()I")
	@Override
	public int w() {
		@Pc(6) int local6 = this.anInt2303;
		this.anInt2303 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Lclient!cp;B)V")
	public void method1949(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt2277 < 0 || arg0 != this.anInterface3Array1[this.anInt2277]) {
			throw new RuntimeException();
		}
		this.anInterface3Array1[this.anInt2277--] = null;
		arg0.method3604();
		if (this.anInt2277 < 0) {
			this.anInterface3_1 = null;
		} else {
			this.anInterface3_1 = this.anInterface3Array1[this.anInt2277];
			this.anInterface3_1.method3605();
		}
	}

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "(I)V")
	private void method1950() {
		OpenGL.glViewport(this.anInt2308, this.anInt2283, this.anInt2240, this.anInt2138);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)V")
	public void method1951(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean203 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt2320 &= 0xFFFFFFE0;
		this.aBoolean203 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "()V")
	@Override
	protected void method4239() {
		for (@Pc(6) Class4 local6 = this.aClass183_6.method4140(); local6 != null; local6 = this.aClass183_6.method4144()) {
			((Class4_Sub2_Sub1) local6).method104();
		}
		if (this.aClass260_1 != null) {
			this.aClass260_1.method5524();
		}
		if (this.anOpenGL1 != null) {
			this.method1921();
			@Pc(40) Enumeration local40 = this.aHashtable2.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable2.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean190) {
			Static218.method3281(false, true);
			this.aBoolean190 = false;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method4302(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([Lclient!t;Lclient!mc;Lclient!c;[Lclient!mi;I)V")
	@Override
	public void method4299(@OriginalArg(0) Class110[] arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class3_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method4307(arg0, arg2, arg3, arg4);
		this.method4277(arg1);
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "()V")
	@Override
	public void method4247() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!fd", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean192) {
			throw new RuntimeException("");
		}
		this.anInt2288 = arg0;
		this.anInt2317 = arg2;
		this.anInt2287 = arg1;
		this.anInt2293 = arg3;
		this.aClass248_1.aClass9_Sub9_1.method5380();
		this.method1959();
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
	@Override
	public void method4273(@OriginalArg(0) int arg0) {
		this.method1896();
	}

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "(I)V")
	private void method1952() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass31_Sub1_4.method5161(), 0);
		if (this.aBoolean192) {
			this.aClass248_1.aClass9_Sub9_1.method5380();
		}
		this.method1914();
		this.method1903();
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "(Z)V")
	private void method1953() {
		this.aFloat68 = this.anInt2296 - this.anInt2297;
		this.aFloat62 = this.anInt2318 - this.anInt2297;
		this.aFloat64 = this.anInt2292 - this.anInt2295;
		this.aFloat75 = this.anInt2313 - this.anInt2295;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIII)V")
	public void method1954(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!fd", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return this.anInt2281 + this.anInt2279 + this.anInt2280;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)I")
	@Override
	public int method4269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!fd", name = "ia", descriptor = "(II)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt2290 && arg1 == this.anInt2312) {
			return;
		}
		this.anInt2290 = arg0;
		this.anInt2312 = arg1;
		this.method1923();
		this.method1959();
		if (this.anInt2319 == 3) {
			this.method1933();
		} else if (this.anInt2319 == 2) {
			this.method1907();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZ[BI)Lclient!bk;")
	public Interface1 method1955(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2) {
		return (Interface1) (this.aBoolean205 && (!arg1 || this.aBoolean208) ? new Class152_Sub1(this, 5123, arg2, arg0, arg1) : new Class64_Sub1(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "()V")
	@Override
	public void method4281() {
		if (!this.aBoolean196 || this.anInt2240 <= 0 || this.anInt2138 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2313;
		@Pc(22) int local22 = this.anInt2292;
		@Pc(25) int local25 = this.anInt2318;
		@Pc(28) int local28 = this.anInt2296;
		this.e();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method1898();
		this.method1918(false);
		this.method1906(false);
		this.method1951(false);
		this.method1911(false);
		this.method1905(null);
		this.method1957(-2);
		this.method1900(1);
		this.method1958(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt2240, this.anInt2138, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.OA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4257(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static159.aFloat108 = arg1;
		Static15.aFloat7 = arg0;
		Static421.aFloat215 = arg2;
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)V")
	@Override
	public void method4306(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt2269 = arg0;
		this.aClass59_1.method1550();
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "()Z")
	@Override
	public boolean method4242() {
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(Lclient!cp;B)V")
	public void method1956(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt2277 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2277 >= 0) {
			this.anInterface3Array1[this.anInt2277].method3604();
		}
		this.anInterface3_1 = this.anInterface3Array1[++this.anInt2277] = arg0;
		this.anInterface3_1.method3605();
	}

	@OriginalMember(owner = "client!fd", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt2312;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method1977();
		this.method1958(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean194) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean194) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1977();
		this.method1958(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(ZI)V")
	public void method1957(@OriginalArg(1) int arg0) {
		this.method1938(arg0, true);
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(II)V")
	public void method1958(@OriginalArg(1) int arg0) {
		if (this.anInt2304 == arg0) {
			return;
		}
		@Pc(22) boolean local22;
		@Pc(20) byte local20;
		if (arg0 == 1) {
			local22 = true;
			local20 = 1;
		} else if (arg0 == 2) {
			local22 = false;
			local20 = 2;
		} else if (arg0 == 128) {
			local20 = 3;
			local22 = true;
		} else {
			local20 = 0;
			local22 = false;
		}
		if (!this.aBoolean195) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean195 = true;
		}
		if (local22 != this.aBoolean216) {
			if (local22) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean216 = local22;
		}
		if (local20 != this.anInt2316) {
			if (local20 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local20 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local20 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt2316 = local20;
		}
		this.anInt2320 &= 0xFFFFFFE3;
		this.anInt2304 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "ca", descriptor = "(ILclient!ma;II)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class145_Sub1 local6 = (Class145_Sub1) arg1;
		@Pc(9) Class6_Sub1_Sub1 local9 = local6.aClass6_Sub1_Sub1_5;
		this.method1930();
		this.method1905(local6.aClass6_Sub1_Sub1_5);
		this.method1958(1);
		this.method1912(7681, 8448);
		this.method1945(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat172 / (float) local9.anInt5470;
		@Pc(46) float local46 = local9.aFloat171 / (float) local9.anInt5474;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt2313 - arg2) * local39, (float) (this.anInt2318 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2313, this.anInt2318);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2313 - arg2), (float) (this.anInt2296 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2313, this.anInt2296);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2292 - arg2), local46 * (float) (this.anInt2296 - arg3));
		OpenGL.glVertex2i(this.anInt2292, this.anInt2296);
		OpenGL.glTexCoord2f((float) (this.anInt2292 - arg2) * local39, (float) (this.anInt2318 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2292, this.anInt2318);
		OpenGL.glEnd();
		this.method1945(0, 768, 5890);
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(B)V")
	private void method1959() {
		@Pc(23) int local23;
		if (this.aBoolean192) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local23 = this.anInt2287;
		} else {
			this.aFloat76 = (float) (this.anInt2312 - this.anInt2282) - this.aFloat57;
			this.aFloat59 = this.aFloat76 - (float) this.anInt2315 * this.aFloat71;
			if ((float) this.anInt2290 > this.aFloat59) {
				this.aFloat59 = this.anInt2290;
			}
			OpenGL.glFogf(2915, this.aFloat59);
			OpenGL.glFogf(2916, this.aFloat76);
			local23 = this.anInt2302;
		}
		Static406.aFloatArray30[1] = (float) (local23 & 0xFF00) / 65280.0F;
		Static406.aFloatArray30[0] = (float) (local23 & 0xFF0000) / 1.671168E7F;
		Static406.aFloatArray30[2] = (float) (local23 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static406.aFloatArray30, 0);
		if (this.aBoolean192) {
			this.aClass248_1.aClass9_Sub9_1.method5379();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[BZI)Lclient!vd;")
	public Interface11 method1960(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		return (Interface11) (this.aBoolean205 && (!arg2 || this.aBoolean208) ? new Class152_Sub2(this, arg3, arg1, arg0, arg2) : new Class64_Sub2(this, arg3, arg1, arg0));
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "(Z)V")
	private void method1961() {
		Static406.aFloatArray30[2] = this.aFloat70 * this.aFloat74;
		Static406.aFloatArray30[1] = this.aFloat58 * this.aFloat70;
		Static406.aFloatArray30[3] = 1.0F;
		Static406.aFloatArray30[0] = this.aFloat72 * this.aFloat70;
		OpenGL.glLightModelfv(2899, Static406.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(II)I")
	public int method1962(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!mi;I)V")
	@Override
	public void method4307(@OriginalArg(0) Class110[] arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class3_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method4889(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!gt;[Lclient!bb;Z)Lclient!la;")
	@Override
	public Class46 method4275(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class18[] arg1) {
		return new Class46_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "()V")
	@Override
	public void method4236() {
		if (this.aClass4_Sub10_Sub1_1 != null && this.aClass4_Sub10_Sub1_1.method2003()) {
			this.aClass260_1.method5529(this.aClass4_Sub10_Sub1_1);
			this.aClass59_1.method1550();
		}
	}

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "(F)V")
	@Override
	public void B(@OriginalArg(0) float arg0) {
		if (this.aFloat70 != arg0) {
			this.aFloat70 = arg0;
			this.method1961();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4249(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas3 == arg0) {
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

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BFFF)V")
	private void method1963(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean206) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg0, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean206 = true;
	}

	@OriginalMember(owner = "client!fd", name = "UA", descriptor = "(III)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2302 == arg0 && arg1 == this.anInt2315 && arg2 == this.anInt2282) {
			return;
		}
		this.anInt2282 = arg2;
		this.anInt2302 = arg0;
		this.anInt2315 = arg1;
		if (!this.aBoolean192) {
			this.method1959();
			this.method1968();
		}
	}

	@OriginalMember(owner = "client!fd", name = "DA", descriptor = "(IIIIII[BII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(45) float local45;
		if (this.aClass6_Sub1_Sub1_1 == null || this.aClass6_Sub1_Sub1_1.anInt5466 < arg2 || this.aClass6_Sub1_Sub1_1.anInt5458 < arg3) {
			this.aClass6_Sub1_Sub1_1 = Static38.method671(arg6, this, arg2, arg3);
			this.aClass6_Sub1_Sub1_1.method4196(false, false);
			local41 = this.aClass6_Sub1_Sub1_1.aFloat171;
			local45 = this.aClass6_Sub1_Sub1_1.aFloat172;
		} else {
			this.aClass6_Sub1_Sub1_1.method4191(arg2, arg6, arg3, 6406, false);
			local45 = (float) arg2 * this.aClass6_Sub1_Sub1_1.aFloat172 / (float) this.aClass6_Sub1_Sub1_1.anInt5466;
			local41 = (float) arg3 * this.aClass6_Sub1_Sub1_1.aFloat171 / (float) this.aClass6_Sub1_Sub1_1.anInt5458;
		}
		this.method1930();
		this.method1905(this.aClass6_Sub1_Sub1_1);
		this.method1958(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method1901(arg5);
		this.method1912(34165, 34165);
		this.method1945(0, 768, 34166);
		this.method1945(2, 770, 5890);
		this.method1954(34166, 0);
		this.method1954(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = local147 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = (float) arg3 + local150;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local41, local45);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local41, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method1945(0, 768, 5890);
		this.method1945(2, 770, 34166);
		this.method1954(5890, 0);
		this.method1954(34166, 2);
	}

	@OriginalMember(owner = "client!fd", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		this.anInt2275 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt2275++;
		}
		this.anInt2273 = 0x1 << this.anInt2275;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIF)Lclient!vp;")
	@Override
	public Class4_Sub21 method4310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub21_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!fd", name = "TA", descriptor = "(IIIII)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1977();
		this.method1958(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(B)V")
	private void method1964() {
		this.aClass31_Sub1_4 = new Class31_Sub1();
		this.aClass31_Sub1_3 = new Class31_Sub1();
		this.aClass6Array1 = new Class6[this.anInt2306];
		this.aClass6_Sub1_3 = new Class6_Sub1(this, 3553, 6408, 1, 1);
		this.aClass6_Sub1_2 = new Class6_Sub1(this, 3553, 6408, 1, 1);
		this.aClass6_Sub1_1 = new Class6_Sub1(this, 3553, 6408, 1, 1);
		this.aClass110_Sub1_7 = new Class110_Sub1(this);
		this.aClass110_Sub1_3 = new Class110_Sub1(this);
		this.aClass110_Sub1_9 = new Class110_Sub1(this);
		this.aClass110_Sub1_2 = new Class110_Sub1(this);
		this.aClass110_Sub1_8 = new Class110_Sub1(this);
		this.aClass110_Sub1_1 = new Class110_Sub1(this);
		this.aClass110_Sub1_5 = new Class110_Sub1(this);
		this.aClass110_Sub1_10 = new Class110_Sub1(this);
		this.aClass110_Sub1_6 = new Class110_Sub1(this);
		this.aClass110_Sub1_4 = new Class110_Sub1(this);
		if (this.aBoolean191) {
			this.aClass150_2 = new Class150(this);
			this.aClass150_1 = new Class150(this);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1977();
		this.method1958(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(B)V")
	public void method1965() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZ)V")
	public void method1966(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean202 != arg0) {
			this.aBoolean202 = arg0;
			this.method1919();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIILclient!bk;B)V")
	public void method1967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface1 arg2) {
		@Pc(13) int local13 = arg2.method3659();
		@Pc(20) int local20 = arg0 * this.method1897(local13);
		this.method1970(arg2);
		OpenGL.glDrawElements(4, arg1, local13, (long) local20 + arg2.method3658());
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(Z)V")
	@Override
	public void method4309(@OriginalArg(0) boolean arg0) {
		this.aBoolean210 = arg0;
		this.method1976();
	}

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "(Z)V")
	private void method1968() {
		if (this.aBoolean197 && this.anInt2315 >= 0 | this.aBoolean192) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!fd", name = "JA", descriptor = "(IIIIII)Z")
	@Override
	public boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = (float) arg2 * this.aClass31_Sub1_4.aFloat199 + (float) arg1 * this.aClass31_Sub1_4.aFloat203 + (float) arg0 * this.aClass31_Sub1_4.aFloat206 + this.aClass31_Sub1_4.aFloat198;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass31_Sub1_4.aFloat198 + this.aClass31_Sub1_4.aFloat206 * (float) arg3 + this.aClass31_Sub1_4.aFloat203 * (float) arg4 + this.aClass31_Sub1_4.aFloat199 * (float) arg5;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt2290 > local28 && (float) this.anInt2290 > local59 || !(!(local28 > (float) this.anInt2312) || !(local59 > (float) this.anInt2312))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt2309 * (this.aClass31_Sub1_4.aFloat202 * (float) arg0 + (float) arg1 * this.aClass31_Sub1_4.aFloat207 + (float) arg2 * this.aClass31_Sub1_4.aFloat208 + this.aClass31_Sub1_4.aFloat209) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt2309 * (this.aClass31_Sub1_4.aFloat202 * (float) arg3 + (float) arg4 * this.aClass31_Sub1_4.aFloat207 + this.aClass31_Sub1_4.aFloat208 * (float) arg5 + this.aClass31_Sub1_4.aFloat209) / local59);
		if ((float) local123 < this.aFloat75 && (float) local155 < this.aFloat75 || this.aFloat64 < (float) local123 && this.aFloat64 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass31_Sub1_4.aFloat201 * (float) arg2 + this.aClass31_Sub1_4.aFloat200 * (float) arg0 + this.aClass31_Sub1_4.aFloat204 * (float) arg1 + this.aClass31_Sub1_4.aFloat205) * (float) this.anInt2294 / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt2294 * (this.aClass31_Sub1_4.aFloat201 * (float) arg5 + (float) arg3 * this.aClass31_Sub1_4.aFloat200 + this.aClass31_Sub1_4.aFloat204 * (float) arg4 + this.aClass31_Sub1_4.aFloat205) / local59);
			return (!((float) local213 < this.aFloat62) || !(this.aFloat62 > (float) local245)) && (!((float) local213 > this.aFloat68) || !((float) local245 > this.aFloat68));
		}
	}

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "(I)V")
	private void method1969() {
		this.method1957(-2);
		for (@Pc(14) int local14 = this.anInt2306 - 1; local14 >= 0; local14--) {
			this.method1936(local14);
			this.method1905(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method1912(8448, 8448);
		this.method1945(2, 770, 34168);
		this.method1917();
		this.anInt2304 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt2316 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean216 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean195 = true;
		this.method1918(true);
		this.method1906(true);
		this.method1951(true);
		this.method1911(true);
		this.method1898();
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
		@Pc(125) float[] local125 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(127) int local127 = 0; local127 < 8; local127++) {
			@Pc(133) int local133 = local127 + 16384;
			OpenGL.glLightfv(local133, 4608, local125, 0);
			OpenGL.glLightf(local133, 4615, 0.0F);
			OpenGL.glLightf(local133, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt2286 = this.anInt2302 = -1;
		this.e();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!bk;)V")
	public void method1970(@OriginalArg(1) Interface1 arg0) {
		if (this.anInterface1_1 != arg0) {
			if (this.aBoolean205) {
				OpenGL.glBindBufferARB(34963, arg0.method3656());
			}
			this.anInterface1_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4276() {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!mc;)V")
	@Override
	public void method4277(@OriginalArg(0) Class146 arg0) {
		this.aClass40_1.method916(arg0, this);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!cp;I)V")
	public void method1971(@OriginalArg(0) Interface3 arg0) {
		if (this.aBoolean204) {
			this.method1935(arg0);
			this.method1949(arg0);
		} else if (this.anInt2276 >= 0 && arg0 == this.anInterface3Array3[this.anInt2276]) {
			this.anInterface3Array3[this.anInt2276--] = null;
			arg0.method3603();
			if (this.anInt2276 >= 0) {
				this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array3[this.anInt2276];
				this.anInterface3_2.method3602();
			} else {
				this.anInterface3_2 = this.anInterface3_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class57 method4265(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class57_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "(IIII)[I")
	@Override
	public int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt2138 - local12 - arg1, arg2, 1, 32993, this.anInt2307, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!bb;Z)Lclient!l;")
	@Override
	public Class57 method4308(@OriginalArg(0) Class18 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt366 * arg0.anInt367];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray5 == null) {
			for (local21 = 0; local21 < arg0.anInt366; local21++) {
				for (local25 = 0; local25 < arg0.anInt367; local25++) {
					@Pc(38) int local38 = arg0.anIntArray25[arg0.aByteArray4[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt366; local21++) {
				for (local25 = 0; local25 < arg0.anInt367; local25++) {
					local12[local16++] = arg0.aByteArray5[local14] << 24 | arg0.anIntArray25[arg0.aByteArray4[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(122) Class57 local122 = this.method4265(local12, arg0.anInt367, arg0.anInt367, arg0.anInt366);
		local122.MA(arg0.anInt368, arg0.anInt370, arg0.anInt369, arg0.anInt371);
		return local122;
	}

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "()Z")
	@Override
	public boolean method4258() {
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IJ)V")
	public synchronized void method1973(@OriginalArg(1) long arg0) {
		@Pc(7) Class4 local7 = new Class4();
		local7.aLong224 = arg0;
		this.aClass183_13.method4137(local7);
	}

	@OriginalMember(owner = "client!fd", name = "H", descriptor = "(IIII)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2294 = arg3;
		this.anInt2297 = arg1;
		this.anInt2309 = arg2;
		this.anInt2295 = arg0;
		this.method1923();
		this.method1953();
		if (this.anInt2319 == 3) {
			this.method1933();
		} else if (this.anInt2319 == 2) {
			this.method1907();
		}
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "()Z")
	@Override
	public boolean method4252() {
		return this.aClass4_Sub10_Sub1_1 != null && (this.anInt2272 <= 1 || this.aBoolean201);
	}

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "(I)I")
	private int method1974() {
		@Pc(5) int local5 = 0;
		this.aString26 = OpenGL.glGetString(7936).toLowerCase();
		this.aString27 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString26.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString26.indexOf("brian paul") != -1 || this.aString26.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static113.method2058(local46.replace('.', ' '), ' ');
		if (local54.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(70) int local70 = Static198.method3113(local54[0]);
				@Pc(76) int local76 = Static198.method3113(local54[1]);
				this.anInt2300 = local70 * 10 + local76;
			} catch (@Pc(85) NumberFormatException local85) {
				local5 |= 0x4;
			}
		}
		if (this.anInt2300 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(119) int[] local119 = new int[1];
		OpenGL.glGetIntegerv(34018, local119, 0);
		this.anInt2306 = local119[0];
		OpenGL.glGetIntegerv(34929, local119, 0);
		this.anInt2298 = local119[0];
		OpenGL.glGetIntegerv(34930, local119, 0);
		this.anInt2285 = local119[0];
		if (this.anInt2306 < 2 || this.anInt2298 < 2 || this.anInt2285 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean215 = NativeStream.c();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean205 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean194 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean198 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean217 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean214 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean211 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean207 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean199 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean193 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean213 = false;
		this.aBoolean191 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean204 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean209 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean201 = this.aBoolean209 & this.aBoolean204;
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "()V")
	@Override
	public void method4266() {
		this.method1911(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "(I)V")
	private void method1975() {
		if (this.aFloat67 == (float) 0) {
			this.bf[10] = this.aFloat69;
			this.bf[14] = this.aFloat60;
		} else {
			@Pc(28) float local28 = this.aFloat63 / (this.aFloat63 + this.aFloat67);
			@Pc(32) float local32 = local28 * local28;
			@Pc(47) float local47 = -this.aFloat60 * (1.0F - local28) * (1.0F - local28) / this.aFloat67;
			this.bf[14] = local32 * this.aFloat60;
			this.bf[10] = this.aFloat69 + local47;
		}
		this.aFloat77 = (float) this.anInt2312 - this.aFloat67;
		this.aFloat61 = (this.bf[14] - (float) this.anInt2312) / this.bf[10];
	}

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "()Z")
	@Override
	public boolean method4291() {
		return false;
	}

	@OriginalMember(owner = "client!fd", name = "C", descriptor = "()Z")
	@Override
	public boolean method4301() {
		return this.aClass4_Sub10_Sub1_1 != null && this.aClass4_Sub10_Sub1_1.method2003();
	}

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "(I)V")
	@Override
	public void p(@OriginalArg(0) int arg0) {
		this.method1958(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "(I)V")
	private void method1976() {
		OpenGL.glDepthMask(this.aBoolean200 && this.aBoolean210);
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(B)V")
	private void method1977() {
		if (this.anInt2320 == 1) {
			return;
		}
		this.method1932();
		this.method1918(false);
		this.method1906(false);
		this.method1951(false);
		this.method1911(false);
		this.method1905(null);
		this.method1957(-2);
		this.method1900(1);
		this.anInt2320 = 1;
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(FF)V")
	@Override
	public void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat63 == arg0 && this.aFloat67 == arg1) {
			return;
		}
		this.aFloat63 = arg0;
		this.aFloat67 = arg1;
		this.method1975();
		if (this.anInt2319 == 3) {
			this.method1933();
			return;
		}
		if (this.anInt2319 != 2) {
			return;
		}
		this.method1907();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBI)V")
	public synchronized void method1978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub37 local8 = new Class4_Sub37(arg1);
		local8.aLong224 = arg0;
		this.aClass183_9.method4137(local8);
	}
}
