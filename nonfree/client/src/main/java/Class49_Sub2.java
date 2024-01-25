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

@OriginalClass("client!ef")
public final class Class49_Sub2 extends Class49 {

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
	public int anInt1823;

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
	public int anInt1824;

	@OriginalMember(owner = "client!ef", name = "zc", descriptor = "I")
	private int anInt1924;

	@OriginalMember(owner = "client!ef", name = "Lc", descriptor = "I")
	private int anInt1936;

	@OriginalMember(owner = "client!ef", name = "ke", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!ef", name = "le", descriptor = "I")
	public int anInt2002;

	@OriginalMember(owner = "client!ef", name = "te", descriptor = "Lclient!nf;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!ef", name = "ue", descriptor = "Lclient!nf;")
	private Interface8 anInterface8_2;

	@OriginalMember(owner = "client!ef", name = "ze", descriptor = "I")
	public int anInt2008;

	@OriginalMember(owner = "client!ef", name = "Be", descriptor = "I")
	public int anInt2009;

	@OriginalMember(owner = "client!ef", name = "Ce", descriptor = "I")
	private int anInt2010;

	@OriginalMember(owner = "client!ef", name = "Je", descriptor = "Lclient!ko;")
	public Class91_Sub2 aClass91_Sub2_1;

	@OriginalMember(owner = "client!ef", name = "Me", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!ef", name = "Oe", descriptor = "Z")
	public boolean aBoolean111;

	@OriginalMember(owner = "client!ef", name = "Pe", descriptor = "Z")
	public boolean aBoolean112;

	@OriginalMember(owner = "client!ef", name = "Qe", descriptor = "Lclient!rt;")
	private Interface10 anInterface10_2;

	@OriginalMember(owner = "client!ef", name = "Re", descriptor = "Z")
	public boolean aBoolean113;

	@OriginalMember(owner = "client!ef", name = "Se", descriptor = "Lclient!je;")
	public Class127 aClass127_1;

	@OriginalMember(owner = "client!ef", name = "Te", descriptor = "I")
	private int anInt2012;

	@OriginalMember(owner = "client!ef", name = "Ue", descriptor = "Lclient!ap;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ef", name = "We", descriptor = "Lclient!wc;")
	public Class260 aClass260_4;

	@OriginalMember(owner = "client!ef", name = "df", descriptor = "Z")
	private boolean aBoolean115;

	@OriginalMember(owner = "client!ef", name = "ef", descriptor = "Lclient!wc;")
	public Class260 aClass260_5;

	@OriginalMember(owner = "client!ef", name = "kf", descriptor = "Lclient!ko;")
	public Class91_Sub2 aClass91_Sub2_2;

	@OriginalMember(owner = "client!ef", name = "lf", descriptor = "Lclient!ap;")
	private Interface1 anInterface1_3;

	@OriginalMember(owner = "client!ef", name = "mf", descriptor = "Lclient!ko;")
	public Class91_Sub2 aClass91_Sub2_3;

	@OriginalMember(owner = "client!ef", name = "nf", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!ef", name = "of", descriptor = "Z")
	private boolean aBoolean116;

	@OriginalMember(owner = "client!ef", name = "rf", descriptor = "F")
	private float aFloat28;

	@OriginalMember(owner = "client!ef", name = "sf", descriptor = "Lclient!je;")
	public Class127 aClass127_2;

	@OriginalMember(owner = "client!ef", name = "tf", descriptor = "I")
	private int anInt2019;

	@OriginalMember(owner = "client!ef", name = "uf", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!ef", name = "vf", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!ef", name = "wf", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!ef", name = "xf", descriptor = "Lclient!ko;")
	public Class91_Sub2 aClass91_Sub2_4;

	@OriginalMember(owner = "client!ef", name = "yf", descriptor = "Z")
	private boolean aBoolean118;

	@OriginalMember(owner = "client!ef", name = "zf", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!ef", name = "Df", descriptor = "Z")
	private boolean aBoolean119;

	@OriginalMember(owner = "client!ef", name = "Ff", descriptor = "Z")
	private boolean aBoolean120;

	@OriginalMember(owner = "client!ef", name = "If", descriptor = "Lclient!tq;")
	private Class55_Sub3_Sub1 aClass55_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ef", name = "Jf", descriptor = "Lclient!tc;")
	public Class35_Sub2 aClass35_Sub2_3;

	@OriginalMember(owner = "client!ef", name = "Kf", descriptor = "Lclient!tc;")
	public Class35_Sub2 aClass35_Sub2_4;

	@OriginalMember(owner = "client!ef", name = "Mf", descriptor = "Z")
	public boolean aBoolean121;

	@OriginalMember(owner = "client!ef", name = "Of", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!ef", name = "Pf", descriptor = "Z")
	private boolean aBoolean122;

	@OriginalMember(owner = "client!ef", name = "Qf", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!ef", name = "Rf", descriptor = "Z")
	private boolean aBoolean123;

	@OriginalMember(owner = "client!ef", name = "Sf", descriptor = "Lclient!ko;")
	public Class91_Sub2 aClass91_Sub2_5;

	@OriginalMember(owner = "client!ef", name = "Vf", descriptor = "Z")
	public boolean aBoolean124;

	@OriginalMember(owner = "client!ef", name = "Xf", descriptor = "Z")
	private boolean aBoolean125;

	@OriginalMember(owner = "client!ef", name = "Zf", descriptor = "Ljava/lang/String;")
	private String aString19;

	@OriginalMember(owner = "client!ef", name = "ag", descriptor = "I")
	private int anInt2028;

	@OriginalMember(owner = "client!ef", name = "bg", descriptor = "I")
	public int anInt2029;

	@OriginalMember(owner = "client!ef", name = "cg", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!ef", name = "dg", descriptor = "I")
	private int anInt2030;

	@OriginalMember(owner = "client!ef", name = "eg", descriptor = "I")
	public int anInt2031;

	@OriginalMember(owner = "client!ef", name = "fg", descriptor = "F")
	private float aFloat37;

	@OriginalMember(owner = "client!ef", name = "ig", descriptor = "I")
	private int anInt2033;

	@OriginalMember(owner = "client!ef", name = "kg", descriptor = "[Lclient!mk;")
	private Class55[] aClass55Array1;

	@OriginalMember(owner = "client!ef", name = "og", descriptor = "Lclient!ko;")
	public Class91_Sub2 aClass91_Sub2_6;

	@OriginalMember(owner = "client!ef", name = "qg", descriptor = "I")
	private int anInt2035;

	@OriginalMember(owner = "client!ef", name = "rg", descriptor = "Lclient!ml;")
	public Class55_Sub3 aClass55_Sub3_1;

	@OriginalMember(owner = "client!ef", name = "sg", descriptor = "Lclient!ko;")
	public Class91_Sub2 aClass91_Sub2_7;

	@OriginalMember(owner = "client!ef", name = "tg", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!ef", name = "ug", descriptor = "I")
	private int anInt2036;

	@OriginalMember(owner = "client!ef", name = "vg", descriptor = "Z")
	public boolean aBoolean129;

	@OriginalMember(owner = "client!ef", name = "xg", descriptor = "Z")
	private boolean aBoolean130;

	@OriginalMember(owner = "client!ef", name = "yg", descriptor = "Lclient!ko;")
	public Class91_Sub2 aClass91_Sub2_8;

	@OriginalMember(owner = "client!ef", name = "zg", descriptor = "I")
	private int anInt2038;

	@OriginalMember(owner = "client!ef", name = "Bg", descriptor = "I")
	private int anInt2039;

	@OriginalMember(owner = "client!ef", name = "Cg", descriptor = "F")
	private float aFloat41;

	@OriginalMember(owner = "client!ef", name = "Dg", descriptor = "Z")
	public boolean aBoolean132;

	@OriginalMember(owner = "client!ef", name = "Eg", descriptor = "Z")
	public boolean aBoolean133;

	@OriginalMember(owner = "client!ef", name = "Gg", descriptor = "I")
	private int anInt2040;

	@OriginalMember(owner = "client!ef", name = "Hg", descriptor = "Z")
	private boolean aBoolean134;

	@OriginalMember(owner = "client!ef", name = "Ig", descriptor = "Lclient!ko;")
	public Class91_Sub2 aClass91_Sub2_9;

	@OriginalMember(owner = "client!ef", name = "Jg", descriptor = "Lclient!tb;")
	private Class155_Sub1 aClass155_Sub1_1;

	@OriginalMember(owner = "client!ef", name = "Lg", descriptor = "I")
	private int anInt2041;

	@OriginalMember(owner = "client!ef", name = "Og", descriptor = "I")
	private int anInt2044;

	@OriginalMember(owner = "client!ef", name = "Rg", descriptor = "Lclient!ml;")
	public Class55_Sub3 aClass55_Sub3_2;

	@OriginalMember(owner = "client!ef", name = "Tg", descriptor = "Lclient!ko;")
	public Class91_Sub2 aClass91_Sub2_10;

	@OriginalMember(owner = "client!ef", name = "Ug", descriptor = "Lclient!ml;")
	public Class55_Sub3 aClass55_Sub3_3;

	@OriginalMember(owner = "client!ef", name = "Vg", descriptor = "I")
	public int anInt2045;

	@OriginalMember(owner = "client!ef", name = "Wg", descriptor = "I")
	private int anInt2046;

	@OriginalMember(owner = "client!ef", name = "ah", descriptor = "I")
	public int anInt2049;

	@OriginalMember(owner = "client!ef", name = "xb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!ef", name = "Yd", descriptor = "I")
	public int anInt1995 = 128;

	@OriginalMember(owner = "client!ef", name = "ce", descriptor = "Lclient!dp;")
	private final Class57 aClass57_1 = new Class57();

	@OriginalMember(owner = "client!ef", name = "ie", descriptor = "Lclient!tc;")
	private final Class35_Sub2 aClass35_Sub2_1 = new Class35_Sub2();

	@OriginalMember(owner = "client!ef", name = "je", descriptor = "Lclient!tc;")
	public final Class35_Sub2 aClass35_Sub2_2 = new Class35_Sub2();

	@OriginalMember(owner = "client!ef", name = "ne", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!ef", name = "me", descriptor = "I")
	public int anInt2003 = 3;

	@OriginalMember(owner = "client!ef", name = "pe", descriptor = "I")
	public int anInt2004 = 8;

	@OriginalMember(owner = "client!ef", name = "oe", descriptor = "Lclient!ar;")
	private final Class14 aClass14_8 = new Class14();

	@OriginalMember(owner = "client!ef", name = "se", descriptor = "[Lclient!nf;")
	private final Interface8[] anInterface8Array2 = new Interface8[4];

	@OriginalMember(owner = "client!ef", name = "re", descriptor = "[Lclient!nf;")
	private final Interface8[] anInterface8Array1 = new Interface8[4];

	@OriginalMember(owner = "client!ef", name = "we", descriptor = "I")
	private int anInt2006 = -1;

	@OriginalMember(owner = "client!ef", name = "xe", descriptor = "I")
	private int anInt2007 = -1;

	@OriginalMember(owner = "client!ef", name = "ve", descriptor = "I")
	private int anInt2005 = -1;

	@OriginalMember(owner = "client!ef", name = "ye", descriptor = "[Lclient!nf;")
	private final Interface8[] anInterface8Array3 = new Interface8[4];

	@OriginalMember(owner = "client!ef", name = "Ae", descriptor = "Lclient!ar;")
	private final Class14 aClass14_9;

	@OriginalMember(owner = "client!ef", name = "De", descriptor = "Lclient!ar;")
	private final Class14 aClass14_10;

	@OriginalMember(owner = "client!ef", name = "Ee", descriptor = "Lclient!ar;")
	private final Class14 aClass14_11;

	@OriginalMember(owner = "client!ef", name = "Fe", descriptor = "Lclient!ar;")
	private final Class14 aClass14_12;

	@OriginalMember(owner = "client!ef", name = "Ge", descriptor = "Lclient!ar;")
	private final Class14 aClass14_13;

	@OriginalMember(owner = "client!ef", name = "He", descriptor = "Lclient!ar;")
	private final Class14 aClass14_14;

	@OriginalMember(owner = "client!ef", name = "Ie", descriptor = "Lclient!ar;")
	private final Class14 aClass14_15;

	@OriginalMember(owner = "client!ef", name = "Ke", descriptor = "I")
	public int anInt2011;

	@OriginalMember(owner = "client!ef", name = "Ye", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!ef", name = "Ef", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!ef", name = "hf", descriptor = "I")
	public int anInt2017;

	@OriginalMember(owner = "client!ef", name = "jf", descriptor = "I")
	private int anInt2018;

	@OriginalMember(owner = "client!ef", name = "Uf", descriptor = "I")
	private int anInt2026;

	@OriginalMember(owner = "client!ef", name = "Xe", descriptor = "I")
	private int anInt2013;

	@OriginalMember(owner = "client!ef", name = "Tf", descriptor = "I")
	public int anInt2025;

	@OriginalMember(owner = "client!ef", name = "cf", descriptor = "I")
	public int anInt2014;

	@OriginalMember(owner = "client!ef", name = "Nf", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!ef", name = "Af", descriptor = "I")
	private int anInt2020;

	@OriginalMember(owner = "client!ef", name = "Wf", descriptor = "F")
	private float aFloat35;

	@OriginalMember(owner = "client!ef", name = "Cf", descriptor = "[F")
	private final float[] aFloatArray15;

	@OriginalMember(owner = "client!ef", name = "mg", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!ef", name = "Yf", descriptor = "I")
	public int anInt2027;

	@OriginalMember(owner = "client!ef", name = "qf", descriptor = "[F")
	private final float[] aFloatArray14;

	@OriginalMember(owner = "client!ef", name = "pg", descriptor = "F")
	private float aFloat40;

	@OriginalMember(owner = "client!ef", name = "lg", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!ef", name = "Gf", descriptor = "I")
	private int anInt2022;

	@OriginalMember(owner = "client!ef", name = "wg", descriptor = "I")
	private int anInt2037;

	@OriginalMember(owner = "client!ef", name = "Le", descriptor = "[F")
	public final float[] aFloatArray12;

	@OriginalMember(owner = "client!ef", name = "af", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!ef", name = "Ze", descriptor = "[F")
	private final float[] aFloatArray13;

	@OriginalMember(owner = "client!ef", name = "gg", descriptor = "I")
	private int anInt2032;

	@OriginalMember(owner = "client!ef", name = "Fg", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!ef", name = "Ag", descriptor = "Z")
	private boolean aBoolean131;

	@OriginalMember(owner = "client!ef", name = "ff", descriptor = "I")
	public int anInt2015;

	@OriginalMember(owner = "client!ef", name = "jg", descriptor = "I")
	public int anInt2034;

	@OriginalMember(owner = "client!ef", name = "Mg", descriptor = "I")
	private int anInt2042;

	@OriginalMember(owner = "client!ef", name = "Pg", descriptor = "F")
	private float aFloat43;

	@OriginalMember(owner = "client!ef", name = "Ne", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!ef", name = "Kg", descriptor = "[F")
	private final float[] aFloatArray16;

	@OriginalMember(owner = "client!ef", name = "Bf", descriptor = "I")
	private int anInt2021;

	@OriginalMember(owner = "client!ef", name = "Hf", descriptor = "I")
	public int anInt2023;

	@OriginalMember(owner = "client!ef", name = "Qg", descriptor = "[Lclient!jd;")
	private final Class2_Sub20[] aClass2_Sub20Array1;

	@OriginalMember(owner = "client!ef", name = "Lf", descriptor = "I")
	public int anInt2024;

	@OriginalMember(owner = "client!ef", name = "gf", descriptor = "I")
	private int anInt2016;

	@OriginalMember(owner = "client!ef", name = "Xg", descriptor = "I")
	public int anInt2047;

	@OriginalMember(owner = "client!ef", name = "Yg", descriptor = "I")
	public int anInt2048;

	@OriginalMember(owner = "client!ef", name = "mc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas4;

	@OriginalMember(owner = "client!ef", name = "Xc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!ef", name = "fe", descriptor = "I")
	public final int anInt2000;

	@OriginalMember(owner = "client!ef", name = "ud", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ef", name = "jc", descriptor = "J")
	private final long aLong55;

	@OriginalMember(owner = "client!ef", name = "Sd", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!ef", name = "Ng", descriptor = "I")
	public final int anInt2043;

	@OriginalMember(owner = "client!ef", name = "Ve", descriptor = "Z")
	public boolean aBoolean114;

	@OriginalMember(owner = "client!ef", name = "bf", descriptor = "Z")
	private boolean bf;

	@OriginalMember(owner = "client!ef", name = "Sg", descriptor = "Z")
	public boolean aBoolean135;

	@OriginalMember(owner = "client!ef", name = "hg", descriptor = "Z")
	public boolean aBoolean126;

	@OriginalMember(owner = "client!ef", name = "ng", descriptor = "Z")
	private boolean aBoolean127;

	@OriginalMember(owner = "client!ef", name = "pf", descriptor = "Z")
	public boolean aBoolean117;

	@OriginalMember(owner = "client!ef", name = "Zg", descriptor = "Z")
	private final boolean aBoolean136;

	@OriginalMember(owner = "client!ef", name = "Xd", descriptor = "Lclient!qj;")
	public final Class204 aClass204_1;

	@OriginalMember(owner = "client!ef", name = "qe", descriptor = "Lclient!qo;")
	public final Class208 aClass208_1;

	@OriginalMember(owner = "client!ef", name = "ge", descriptor = "Lclient!rf;")
	private final Class212 aClass212_1;

	@OriginalMember(owner = "client!ef", name = "Wd", descriptor = "Lclient!it;")
	private Class2_Sub19_Sub1 aClass2_Sub19_Sub1_1;

	@OriginalMember(owner = "client!ef", name = "be", descriptor = "Lclient!pl;")
	private final Class192 aClass192_1;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;ILclient!dr;)V")
	public Class49_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class59 arg4) {
		super(arg0, arg2);
		new Class44();
		new Class163(16);
		this.aClass14_9 = new Class14();
		this.aClass14_10 = new Class14();
		this.aClass14_11 = new Class14();
		this.aClass14_12 = new Class14();
		this.aClass14_13 = new Class14();
		this.aClass14_14 = new Class14();
		this.aClass14_15 = new Class14();
		this.anInt2011 = 3584;
		this.aFloat25 = 3584.0F;
		this.aFloat31 = 3000.0F;
		this.anInt2017 = 512;
		this.anInt2018 = 8448;
		this.anInt2026 = 0;
		this.anInt2013 = -1;
		this.anInt2025 = 50;
		this.anInt2014 = 0;
		this.aFloat32 = 1.0F;
		this.anInt2020 = -1;
		this.aFloat35 = 0.0F;
		this.aFloatArray15 = new float[4];
		this.aFloat39 = 1.0F;
		this.anInt2027 = -1;
		this.aFloatArray14 = new float[4];
		this.aFloat40 = 1.0F;
		this.aFloat38 = -1.0F;
		this.anInt2022 = 0;
		this.anInt2037 = 0;
		this.aFloatArray12 = new float[4];
		this.aFloat26 = -1.0F;
		this.aFloatArray13 = new float[4];
		this.anInt2032 = 0;
		this.aFloat42 = 1.0F;
		this.aBoolean131 = true;
		this.anInt2015 = 512;
		this.anInt2034 = -1;
		this.anInt2042 = 8448;
		this.aFloat43 = 1.0F;
		this.aFloat24 = 3584.0F;
		this.aFloatArray16 = new float[16];
		this.anInt2021 = 0;
		this.anInt2023 = 0;
		this.aClass2_Sub20Array1 = new Class2_Sub20[Static2.anInt70];
		this.anInt2024 = -1;
		this.anInt2016 = 0;
		this.anInt2047 = 0;
		this.anInt2048 = 0;
		this.aCanvas5 = this.aCanvas4 = arg1;
		this.anInt2000 = arg3;
		try {
			if (Static34.aBoolean38 == null || !Static34.aBoolean38) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static34.aBoolean38 = Boolean.TRUE;
				} else {
					@Pc(246) String local246 = System.getProperty("os.name").toLowerCase();
					if (!local246.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local246.startsWith("linux") || local246.startsWith("sunos")) {
						System.load(arg4.method1373("libjaggl.so").toString());
					} else if (local246.startsWith("mac")) {
						System.load(arg4.method1373("libjaggl.jnilib").toString());
					} else if (local246.startsWith("win")) {
						System.load(arg4.method1373("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static34.aBoolean38 = Boolean.TRUE;
				}
			}
			if (Static34.aBoolean38 == null || !Static34.aBoolean38) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong56 = this.aLong55 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt2000);
			if (this.aLong55 == 0L) {
				throw new RuntimeException("");
			}
			this.method1648();
			@Pc(355) int local355 = this.method1655();
			if (local355 != 0) {
				throw new RuntimeException("");
			}
			this.anInt2043 = this.aBoolean111 ? 33639 : 5121;
			@Pc(381) int local381;
			if (this.aString18.indexOf("radeon") != -1) {
				local381 = 0;
				@Pc(383) boolean local383 = false;
				@Pc(385) boolean local385 = false;
				@Pc(394) String[] local394 = Static455.method4448(' ', this.aString18.replace('/', ' '));
				for (@Pc(396) int local396 = 0; local396 < local394.length; local396++) {
					@Pc(402) String local402 = local394[local396];
					try {
						if (local402.length() > 0) {
							if (local402.charAt(0) == 'x' && local402.length() >= 3 && Static24.method4076(local402.substring(1, 3))) {
								local402 = local402.substring(1);
								local385 = true;
							}
							if (local402.equals("hd")) {
								local383 = true;
							} else {
								if (local402.startsWith("hd")) {
									local402 = local402.substring(2);
									local383 = true;
								}
								if (local402.length() >= 4 && Static24.method4076(local402.substring(0, 4))) {
									local381 = Static418.method5543(local402.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(467) Exception local467) {
					}
				}
				if (!local383 || local381 < 4000) {
					this.aBoolean114 = false;
				}
				if (!local385 && !local383) {
					if (local381 >= 7000 && local381 <= 7999) {
						this.bf = false;
					}
					if (local381 >= 7000 && local381 <= 9250) {
						this.aBoolean135 = false;
					}
				}
				this.aBoolean126 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean127 = this.bf;
			}
			if (this.aString19.indexOf("intel") != -1) {
				this.aBoolean117 = false;
			}
			this.aBoolean136 = !this.aString19.equals("s3 graphics");
			if (this.bf) {
				try {
					@Pc(543) int[] local543 = new int[1];
					OpenGL.glGenBuffersARB(1, local543, 0);
				} catch (@Pc(549) Throwable local549) {
					throw new RuntimeException("");
				}
			}
			Static336.method4686(true, false);
			this.aBoolean110 = true;
			this.aClass204_1 = new Class204(this, super.anInterface4_6);
			this.method1607();
			this.aClass208_1 = new Class208(this);
			this.aClass212_1 = new Class212(this);
			if (this.aClass212_1.method4708()) {
				this.aClass2_Sub19_Sub1_1 = new Class2_Sub19_Sub1(this);
				if (!this.aClass2_Sub19_Sub1_1.method2782()) {
					this.aClass2_Sub19_Sub1_1.method2772();
					this.aClass2_Sub19_Sub1_1 = null;
				}
			}
			this.aClass192_1 = new Class192(this);
			this.method1657();
			this.method1627();
			OpenGL.glClear(16640);
			local381 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(628) Exception local628) {
					if (local381++ > 5) {
						throw new RuntimeException("");
					}
					Static81.method1477(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(648) Throwable local648) {
			local648.printStackTrace();
			this.method4420();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
	private void method1576() {
		if (this.anInt2033 != 3) {
			this.anInt2033 = 3;
			this.method1585();
			this.method1649();
			this.anInt2019 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)V")
	public void method1577() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray12, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray15, 0);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I")
	@Override
	public int method4451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "()Z")
	@Override
	public boolean method4459() {
		return false;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(IIIIII)Lclient!mh;")
	@Override
	public Class155 method4461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean128 ? new Class155_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ef", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean129) {
			throw new RuntimeException("");
		}
		this.anInt2024 = arg2;
		this.anInt2045 = arg0;
		this.anInt2014 = arg3;
		this.anInt2020 = arg1;
		this.aClass192_1.aClass62_Sub1_1.method1459();
		this.method1586();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method4472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class73 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class73_Sub2 local6 = (Class73_Sub2) arg5;
		@Pc(9) Class55_Sub3_Sub1 local9 = local6.aClass55_Sub3_Sub1_5;
		this.method1584();
		this.method1646(local6.aClass55_Sub3_Sub1_5);
		this.method1626(1);
		this.method1613(7681, 8448);
		this.method1625(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat100 / (float) local9.anInt6500;
		@Pc(46) float local46 = local9.aFloat101 / (float) local9.anInt6503;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method1625(5890, 768, 0);
	}

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "()Z")
	@Override
	public boolean method4447() {
		return true;
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V")
	@Override
	public void method4481(@OriginalArg(0) int arg0) {
		this.method1619();
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "()V")
	@Override
	public void method4417() {
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(FZ)V")
	public void method1578(@OriginalArg(0) float arg0) {
		if (arg0 == this.aFloat43) {
			return;
		}
		this.aFloat43 = arg0;
		if (this.anInt2033 == 3) {
			this.method1585();
			return;
		}
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "()Z")
	@Override
	public boolean method4425() {
		return true;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(Z)V")
	private void method1579() {
		OpenGL.glViewport(this.anInt2026, this.anInt2037, this.anInt1824, this.anInt1823);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BFF)V")
	public void method1580(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat35 = arg0;
		this.aFloat40 = arg1;
		if (!this.aBoolean129) {
			this.method1586();
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
	private void method1581() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt2041; local7++) {
			@Pc(14) Class2_Sub20 local14 = this.aClass2_Sub20Array1[local7];
			Static170.aFloatArray27[0] = local14.method5740();
			@Pc(25) int local25 = local7 + 16386;
			Static170.aFloatArray27[1] = local14.method5739();
			Static170.aFloatArray27[2] = local14.method5741();
			Static170.aFloatArray27[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static170.aFloatArray27, 0);
			@Pc(54) int local54 = local14.method5735();
			@Pc(60) float local60 = local14.method5737() / 255.0F;
			Static170.aFloatArray27[0] = (float) (local54 >> 16 & 0xFF) * local60;
			Static170.aFloatArray27[2] = local60 * (float) (local54 & 0xFF);
			Static170.aFloatArray27[1] = local60 * (float) (local54 >> 8 & 0xFF);
			OpenGL.glLightfv(local25, 4609, Static170.aFloatArray27, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method5743() * local14.method5743()));
			OpenGL.glEnable(local25);
		}
		while (local7 < this.anInt2030) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt2030 = this.anInt2041;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4419(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas4) {
			local5 = this.aLong55;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas5) {
			this.method1627();
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V")
	@Override
	public void method4423(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
	public void method1582(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean123) {
			this.aBoolean123 = arg0;
			this.method1608();
			this.anInt2019 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4411(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4412();
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(ZI)V")
	public void method1583(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean120 != arg0) {
			this.aBoolean120 = arg0;
			this.method1653();
		}
	}

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "(I)V")
	@Override
	public void p(@OriginalArg(0) int arg0) {
		this.method1626(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)V")
	public void method1584() {
		if (this.anInt2019 == 2) {
			return;
		}
		this.method1654();
		this.method1582(false);
		this.method1587(false);
		this.method1588(false);
		this.method1635(false);
		this.method1594(-2);
		this.anInt2019 = 2;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([Lclient!t;Lclient!pn;Lclient!c;[Lclient!ii;I)V")
	@Override
	public void method4421(@OriginalArg(0) Class91[] arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class8_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method4409(arg0, arg2, arg3, arg4);
		this.method4471(arg1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!t;Lclient!pn;Lclient!c;Lclient!ii;I)V")
	@Override
	public void method4468(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class8_Sub4 arg3) {
		arg0.method3276(arg2, arg3, 0);
		this.method4471(arg1);
	}

	@OriginalMember(owner = "client!ef", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		this.anInt2003 = 0;
		while (arg0 > 1) {
			this.anInt2003++;
			arg0 >>= 0x1;
		}
		this.anInt2004 = 0x1 << this.anInt2003;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
	private void method1585() {
		@Pc(15) float local15 = (float) -this.anInt2048 * this.aFloat43 / (float) this.anInt2017;
		@Pc(27) float local27 = this.aFloat43 * (float) -this.anInt2023 / (float) this.anInt2015;
		@Pc(50) float local50 = (float) (this.anInt1824 - this.anInt2048) * this.aFloat43 / (float) this.anInt2017;
		@Pc(65) float local65 = this.aFloat43 * (float) (this.anInt1823 - this.anInt2023) / (float) this.anInt2015;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local50 != local15 && local65 != local27) {
			OpenGL.glOrtho((double) local15, (double) local50, (double) -local65, (double) -local27, (double) ((float) this.anInt2025 - this.aFloat29), (double) ((float) this.anInt2011 - this.aFloat29));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(B)V")
	private void method1586() {
		@Pc(15) int local15;
		if (this.aBoolean129) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt2020;
		} else {
			this.aFloat41 = (float) (this.anInt2011 - this.anInt2047) - this.aFloat35;
			this.aFloat33 = this.aFloat41 - (float) this.anInt2034 * this.aFloat40;
			if ((float) this.anInt2025 > this.aFloat33) {
				this.aFloat33 = this.anInt2025;
			}
			OpenGL.glFogf(2915, this.aFloat33);
			OpenGL.glFogf(2916, this.aFloat41);
			local15 = this.anInt2027;
		}
		Static446.aFloatArray59[2] = (float) (local15 & 0xFF) / 255.0F;
		Static446.aFloatArray59[1] = (float) (local15 & 0xFF00) / 65280.0F;
		Static446.aFloatArray59[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static446.aFloatArray59, 0);
		if (this.aBoolean129) {
			this.aClass192_1.aClass62_Sub1_1.method1462();
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(ZI)V")
	public void method1587(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean134) {
			this.aBoolean134 = arg0;
			this.method1653();
			this.anInt2019 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)V")
	public void method1588(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean118) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt2019 &= 0xFFFFFFE0;
		this.aBoolean118 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!nf;B)V")
	public void method1589(@OriginalArg(0) Interface8 arg0) {
		if (this.aBoolean113) {
			this.method1651(arg0);
			this.method1633(arg0);
		} else if (this.anInt2007 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt2007 >= 0) {
				this.anInterface8Array1[this.anInt2007].method2867();
			}
			this.anInterface8_2 = this.anInterface8_1 = this.anInterface8Array1[++this.anInt2007] = arg0;
			this.anInterface8_2.method2870();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZILclient!jaggl/memory/NativeBuffer;I)Lclient!ap;")
	public Interface1 method1590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) NativeBuffer arg2) {
		return (Interface1) (this.bf ? new Class11_Sub2(this, arg0, arg2, arg1, false) : new Class41_Sub1(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!ef", name = "X", descriptor = "(III[I)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass35_Sub2_3.aFloat91 + (float) arg0 * this.aClass35_Sub2_3.aFloat93 + this.aClass35_Sub2_3.aFloat99 * (float) arg1 + (float) arg2 * this.aClass35_Sub2_3.aFloat94;
		if (local28 < (float) this.anInt2025 || (float) this.anInt2011 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass35_Sub2_3.aFloat92 + this.aClass35_Sub2_3.aFloat88 * (float) arg1 + (float) arg0 * this.aClass35_Sub2_3.aFloat90 + (float) arg2 * this.aClass35_Sub2_3.aFloat97) * (float) this.anInt2017 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt2015 * (this.aClass35_Sub2_3.aFloat96 * (float) arg2 + (float) arg0 * this.aClass35_Sub2_3.aFloat89 + (float) arg1 * this.aClass35_Sub2_3.aFloat95 + this.aClass35_Sub2_3.aFloat98) / local28);
		if (this.aFloat36 <= (float) local85 && this.aFloat23 >= (float) local85 && this.aFloat27 <= (float) local117 && (float) local117 <= this.aFloat30) {
			arg3[0] = (int) ((float) local85 - this.aFloat36);
			arg3[1] = (int) ((float) local117 - this.aFloat27);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "()V")
	@Override
	public void l() {
		this.aBoolean129 = false;
		this.aClass192_1.method4334(false, false, 0);
		this.method1586();
		this.method1608();
	}

	@OriginalMember(owner = "client!ef", name = "OA", descriptor = "(IIII)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1823 < arg3) {
			arg3 = this.anInt1823;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt1824 < arg2) {
			arg2 = this.anInt1824;
		}
		this.anInt2022 = arg3;
		this.anInt2021 = arg1;
		this.anInt2032 = arg2;
		this.anInt2016 = arg0;
		OpenGL.glEnable(3089);
		this.method1636();
		this.method1640();
	}

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "()V")
	@Override
	public void method4475() {
		if (this.aClass2_Sub19_Sub1_1 != null && this.aClass2_Sub19_Sub1_1.method2777()) {
			this.aClass212_1.method4706(this.aClass2_Sub19_Sub1_1);
			this.aClass204_1.method4530();
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4438(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas4) {
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

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZI[BI)Lclient!rt;")
	public Interface10 method1591(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2) {
		return (Interface10) (this.bf && (!arg1 || this.aBoolean127) ? new Class11_Sub1(this, 5123, arg2, arg0, arg1) : new Class41_Sub2(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!mh;)V")
	@Override
	public void method4470(@OriginalArg(0) Class155 arg0) {
		this.aClass155_Sub1_1 = (Class155_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(B)V")
	private void method1592() {
		if (this.aBoolean115) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean115 = false;
		}
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "()V")
	@Override
	public void e() {
		this.anInt2032 = this.anInt1824;
		this.anInt2021 = 0;
		this.anInt2022 = this.anInt1823;
		this.anInt2016 = 0;
		OpenGL.glDisable(3089);
		this.method1636();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class17 method4422(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class17_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[BBZ)Lclient!ap;")
	public Interface1 method1593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) boolean arg3) {
		return (Interface1) (this.bf && (!arg3 || this.aBoolean127) ? new Class11_Sub2(this, arg1, arg2, arg0, arg3) : new Class41_Sub1(this, arg1, arg2, arg0));
	}

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "()Z")
	@Override
	public boolean method4469() {
		return true;
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "()Z")
	@Override
	public boolean method4431() {
		return this.aClass2_Sub19_Sub1_1 != null && this.aClass2_Sub19_Sub1_1.method2777();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class64 method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class64_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method4446(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class2_Sub26 local19;
		while (!this.aClass14_10.method298()) {
			local19 = (Class2_Sub26) this.aClass14_10.method307();
			Static62.anIntArray122[local7++] = (int) local19.aLong227;
			this.anInt2009 -= local19.anInt4485;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static62.anIntArray122, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static62.anIntArray122, 0);
			local7 = 0;
		}
		while (!this.aClass14_11.method298()) {
			local19 = (Class2_Sub26) this.aClass14_11.method307();
			Static62.anIntArray122[local7++] = (int) local19.aLong227;
			this.anInt2008 -= local19.anInt4485;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static62.anIntArray122, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static62.anIntArray122, 0);
			local7 = 0;
		}
		while (!this.aClass14_12.method298()) {
			local19 = (Class2_Sub26) this.aClass14_12.method307();
			Static62.anIntArray122[local7++] = local19.anInt4485;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static62.anIntArray122, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static62.anIntArray122, 0);
			local7 = 0;
		}
		while (!this.aClass14_13.method298()) {
			local19 = (Class2_Sub26) this.aClass14_13.method307();
			Static62.anIntArray122[local7++] = (int) local19.aLong227;
			this.anInt2010 -= local19.anInt4485;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static62.anIntArray122, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static62.anIntArray122, 0);
		}
		while (!this.aClass14_9.method298()) {
			local19 = (Class2_Sub26) this.aClass14_9.method307();
			OpenGL.glDeleteLists((int) local19.aLong227, local19.anInt4485);
		}
		@Pc(210) Class2 local210;
		while (!this.aClass14_14.method298()) {
			local210 = this.aClass14_14.method307();
			OpenGL.glDeleteProgramARB((int) local210.aLong227);
		}
		while (!this.aClass14_15.method298()) {
			local210 = this.aClass14_15.method307();
			OpenGL.glDeleteObjectARB(local210.aLong227);
		}
		while (!this.aClass14_9.method298()) {
			local19 = (Class2_Sub26) this.aClass14_9.method307();
			OpenGL.glDeleteLists((int) local19.aLong227, local19.anInt4485);
		}
		this.aClass204_1.method4532();
		if (this.IA() > 100663296 && this.aLong57 + 60000L < Static21.method458()) {
			System.gc();
			this.aLong57 = Static21.method458();
		}
		this.anInt2002 = local11;
	}

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "()Z")
	@Override
	public boolean method4439() {
		return true;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)V")
	public void method1594(@OriginalArg(0) int arg0) {
		this.method1647(true, arg0);
	}

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "()Z")
	@Override
	public boolean method4450() {
		return this.aClass2_Sub19_Sub1_1 != null && (this.anInt2000 <= 1 || this.aBoolean122);
	}

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "(I)V")
	private void method1595() {
		if (this.anInt2019 == 1) {
			return;
		}
		this.method1654();
		this.method1582(false);
		this.method1587(false);
		this.method1588(false);
		this.method1635(false);
		this.method1646(null);
		this.method1594(-2);
		this.method1624(1);
		this.anInt2019 = 1;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method4449(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!dq;[Lclient!ft;Z)Lclient!la;")
	@Override
	public Class116 method4479(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class85[] arg1) {
		return new Class116_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(II)I")
	public int method1596(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "()Z")
	@Override
	public boolean method4458() {
		return true;
	}

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "()Z")
	@Override
	public boolean method4455() {
		return false;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!tc;Z)V")
	public void method1598(@OriginalArg(0) Class35_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method5049(), 0);
	}

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "(I)V")
	public void method1599() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(II)V")
	public void method1600(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt2038) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt2038 = arg0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(B)V")
	private void method1601() {
		if (this.aFloat29 == 0.0F) {
			this.aFloatArray16[14] = this.aFloat37;
			this.aFloatArray16[10] = this.aFloat28;
		} else {
			@Pc(31) float local31 = this.aFloat31 / (this.aFloat29 + this.aFloat31);
			@Pc(35) float local35 = local31 * local31;
			@Pc(50) float local50 = (1.0F - local31) * -this.aFloat37 * (1.0F - local31) / this.aFloat29;
			this.aFloatArray16[14] = local35 * this.aFloat37;
			this.aFloatArray16[10] = local50 + this.aFloat28;
		}
		this.aFloat24 = (float) this.anInt2011 - this.aFloat29;
		this.aFloat25 = ((float) -this.anInt2011 + this.aFloatArray16[14]) / this.aFloatArray16[10];
	}

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "()Z")
	@Override
	public boolean method4457() {
		if (this.aClass2_Sub19_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub19_Sub1_1.method2777()) {
			if (!this.aClass212_1.method4711(this.aClass2_Sub19_Sub1_1)) {
				return false;
			}
			this.aClass204_1.method4530();
		}
		return true;
	}

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "(IIII)[I")
	@Override
	public int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt1823 - arg1 - local12, arg2, 1, 32993, this.anInt2043, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLclient!nf;)V")
	public void method1602(@OriginalArg(1) Interface8 arg0) {
		if (this.anInt2005 < 0 || this.anInterface8Array2[this.anInt2005] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface8Array2[this.anInt2005--] = null;
		arg0.method2869();
		if (this.anInt2005 < 0) {
			this.anInterface8_1 = null;
		} else {
			this.anInterface8_1 = this.anInterface8Array2[this.anInt2005];
			this.anInterface8_1.method2868();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBI)V")
	public synchronized void method1603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub26 local14 = new Class2_Sub26(arg1);
		local14.aLong227 = arg0;
		this.aClass14_11.method300(local14);
	}

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "(I)V")
	public void method1604() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1595();
		this.method1626(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(B)V")
	private void method1605() {
		@Pc(6) float[] local6 = this.aFloatArray16;
		@Pc(18) float local18 = (float) (this.anInt2025 * -this.anInt2048) / (float) this.anInt2017;
		@Pc(33) float local33 = (float) (this.anInt2025 * (this.anInt1824 - this.anInt2048)) / (float) this.anInt2017;
		@Pc(44) float local44 = (float) (this.anInt2023 * this.anInt2025) / (float) this.anInt2015;
		@Pc(59) float local59 = (float) (this.anInt2025 * (this.anInt2023 - this.anInt1823)) / (float) this.anInt2015;
		if (local33 == local18 || local44 == local59) {
			local6[13] = 0.0F;
			local6[4] = 0.0F;
			local6[8] = 0.0F;
			local6[1] = 0.0F;
			local6[0] = 1.0F;
			local6[7] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = 1.0F;
			local6[12] = 0.0F;
			local6[14] = 0.0F;
			local6[6] = 0.0F;
			local6[10] = 1.0F;
			local6[11] = 0.0F;
			local6[15] = 1.0F;
			local6[9] = 0.0F;
			local6[2] = 0.0F;
		} else {
			@Pc(81) float local81 = (float) this.anInt2025 * 2.0F;
			local6[9] = (local44 + local59) / (local44 - local59);
			local6[15] = 0.0F;
			local6[6] = 0.0F;
			local6[3] = 0.0F;
			local6[12] = 0.0F;
			local6[7] = 0.0F;
			local6[11] = -1.0F;
			local6[13] = 0.0F;
			local6[10] = this.aFloat28 = (float) -(this.anInt2025 + this.anInt2011) / (float) (this.anInt2011 - this.anInt2025);
			local6[8] = (local18 + local33) / (-local18 + local33);
			local6[5] = local81 / (local44 - local59);
			local6[2] = 0.0F;
			local6[0] = local81 / (local33 - local18);
			local6[14] = this.aFloat37 = -((float) this.anInt2011 * local81) / (float) (this.anInt2011 - this.anInt2025);
			local6[1] = 0.0F;
			local6[4] = 0.0F;
		}
		this.method1601();
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(II)I")
	public int method1606(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class73 method4430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static402.method5293(this, arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "(I)V")
	private void method1607() {
		this.aClass35_Sub2_3 = new Class35_Sub2();
		this.aClass35_Sub2_4 = new Class35_Sub2();
		this.aClass55Array1 = new Class55[this.anInt2031];
		this.aClass55_Sub3_1 = new Class55_Sub3(this, 3553, 6408, 1, 1);
		this.aClass55_Sub3_3 = new Class55_Sub3(this, 3553, 6408, 1, 1);
		this.aClass55_Sub3_2 = new Class55_Sub3(this, 3553, 6408, 1, 1);
		this.aClass91_Sub2_5 = new Class91_Sub2(this);
		this.aClass91_Sub2_8 = new Class91_Sub2(this);
		this.aClass91_Sub2_10 = new Class91_Sub2(this);
		this.aClass91_Sub2_9 = new Class91_Sub2(this);
		this.aClass91_Sub2_1 = new Class91_Sub2(this);
		this.aClass91_Sub2_4 = new Class91_Sub2(this);
		this.aClass91_Sub2_6 = new Class91_Sub2(this);
		this.aClass91_Sub2_2 = new Class91_Sub2(this);
		this.aClass91_Sub2_7 = new Class91_Sub2(this);
		this.aClass91_Sub2_3 = new Class91_Sub2(this);
		if (this.aBoolean117) {
			this.aClass127_1 = new Class127(this);
			this.aClass127_2 = new Class127(this);
		}
	}

	@OriginalMember(owner = "client!ef", name = "O", descriptor = "(IIIIII)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method1595();
		this.method1626(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean125) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean125) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(Z)V")
	private void method1608() {
		if (this.aBoolean123 && this.anInt2034 >= 0 | this.aBoolean129) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(Z)V")
	@Override
	public void method4476(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "()V")
	@Override
	public void method4412() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "()F")
	@Override
	public float W() {
		return this.aFloat31;
	}

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "(I)Lclient!vg;")
	public Class55_Sub4 method1609() {
		return this.aClass155_Sub1_1 == null ? null : this.aClass155_Sub1_1.method3951();
	}

	@OriginalMember(owner = "client!ef", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt2011;
	}

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "()Lclient!c;")
	@Override
	public Class35 method4445() {
		return this.aClass35_Sub2_1;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIII)V")
	public void method1610(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
	@Override
	public void method4454(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt1995 = arg0;
		this.aClass204_1.method4530();
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method4449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1595();
		this.method1626(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	@Override
	public void method4407(@OriginalArg(0) int arg0) {
		this.method1648();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ap;I)V")
	public void method1612(@OriginalArg(0) Interface1 arg0) {
		if (arg0 != this.anInterface1_2) {
			if (this.bf) {
				OpenGL.glBindBufferARB(34962, arg0.method693());
			}
			this.anInterface1_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(FF)V")
	@Override
	public void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat31 == arg0 && this.aFloat29 == arg1) {
			return;
		}
		this.aFloat29 = arg1;
		this.aFloat31 = arg0;
		this.method1601();
		if (this.anInt2033 == 3) {
			this.method1585();
		} else if (this.anInt2033 == 2) {
			this.method1639();
			return;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZII)V")
	public void method1613(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2038 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(7) boolean local7 = false;
		if (this.anInt2018 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local7 = true;
			this.anInt2018 = arg0;
		}
		if (arg1 != this.anInt2042) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt2042 = arg1;
			local7 = true;
		}
		if (local7) {
			this.anInt2019 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4482() {
	}

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "(I)V")
	public void method1614() {
		if (this.anInt2033 != 0) {
			this.anInt2019 &= 0xFFFFFFE0;
			this.anInt2033 = 0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(II)V")
	public synchronized void method1616(@OriginalArg(0) int arg0) {
		@Pc(13) Class2 local13 = new Class2();
		local13.aLong227 = arg0;
		this.aClass14_14.method300(local13);
	}

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "()Z")
	@Override
	public boolean method4466() {
		return this.aBoolean125 && (!this.method4431() || this.aBoolean122);
	}

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "()I")
	@Override
	public int w() {
		@Pc(6) int local6 = this.anInt2046;
		this.anInt2046 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ef", name = "TA", descriptor = "(IIIII)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1595();
		this.method1626(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "(I)V")
	private void method1617() {
		Static446.aFloatArray59[1] = this.aFloat34 * this.aFloat39;
		Static446.aFloatArray59[2] = this.aFloat32 * this.aFloat34;
		Static446.aFloatArray59[3] = 1.0F;
		Static446.aFloatArray59[0] = this.aFloat42 * this.aFloat34;
		OpenGL.glLightModelfv(2899, Static446.aFloatArray59, 0);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!wc;Lclient!wc;ILclient!wc;Lclient!wc;)V")
	public void method1618(@OriginalArg(0) Class260 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(3) Class260 arg2, @OriginalArg(4) Class260 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method1612(arg0.anInterface1_7);
			OpenGL.glVertexPointer(arg0.aByte99, arg0.aShort96, this.anInterface1_2.method690(), this.anInterface1_2.method692() + (long) arg0.aByte98);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method1612(arg2.anInterface1_7);
			OpenGL.glNormalPointer(arg2.aShort96, this.anInterface1_2.method690(), this.anInterface1_2.method692() + (long) arg2.aByte98);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method1612(arg1.anInterface1_7);
			OpenGL.glColorPointer(arg1.aByte99, arg1.aShort96, this.anInterface1_2.method690(), this.anInterface1_2.method692() + (long) arg1.aByte98);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method1612(arg3.anInterface1_7);
			OpenGL.glTexCoordPointer(arg3.aByte99, arg3.aShort96, this.anInterface1_2.method690(), this.anInterface1_2.method692() + (long) arg3.aByte98);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "(I)V")
	private void method1619() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ft;Z)Lclient!l;")
	@Override
	public Class17 method4435(@OriginalArg(0) Class85 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt2652 * arg0.anInt2649];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray52 == null) {
			for (local21 = 0; local21 < arg0.anInt2649; local21++) {
				for (local25 = 0; local25 < arg0.anInt2652; local25++) {
					@Pc(38) int local38 = arg0.anIntArray206[arg0.aByteArray51[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt2649; local21++) {
				for (local25 = 0; local25 < arg0.anInt2652; local25++) {
					local12[local16++] = arg0.aByteArray52[local14] << 24 | arg0.anIntArray206[arg0.aByteArray51[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(123) Class17 local123 = this.method4422(local12, arg0.anInt2652, arg0.anInt2652, arg0.anInt2649);
		local123.MA(arg0.anInt2650, arg0.anInt2647, arg0.anInt2651, arg0.anInt2648);
		return local123;
	}

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "(II)I")
	public int method1620(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ef", name = "da", descriptor = "([I)V")
	@Override
	public void da(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt2022;
		arg0[1] = this.anInt2021;
		arg0[0] = this.anInt2016;
		arg0[2] = this.anInt2032;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(FFFFI)V")
	public void method1621(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static446.aFloatArray59[0] = arg2;
		Static446.aFloatArray59[3] = arg0;
		Static446.aFloatArray59[2] = arg1;
		Static446.aFloatArray59[1] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static446.aFloatArray59, 0);
	}

	@OriginalMember(owner = "client!ef", name = "UA", descriptor = "(III)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt2027 && arg1 == this.anInt2034 && arg2 == this.anInt2047) {
			return;
		}
		this.anInt2027 = arg0;
		this.anInt2034 = arg1;
		this.anInt2047 = arg2;
		if (this.aBoolean129) {
			return;
		}
		this.method1586();
		this.method1608();
	}

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "(IIII)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2023 = arg1;
		this.anInt2015 = arg3;
		this.anInt2017 = arg2;
		this.anInt2048 = arg0;
		this.method1605();
		this.method1636();
		if (this.anInt2033 == 3) {
			this.method1585();
		} else if (this.anInt2033 == 2) {
			this.method1639();
		}
	}

	@OriginalMember(owner = "client!ef", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		@Pc(6) int local6 = this.anInt2012;
		this.anInt2012 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method4453(@OriginalArg(0) Class2_Sub17 arg0) {
		this.aNativeHeap1 = ((Class2_Sub17_Sub1) arg0).aNativeHeap2;
		if (this.anInterface1_3 != null) {
			return;
		}
		@Pc(16) Class2_Sub23_Sub1 local16 = new Class2_Sub23_Sub1(80);
		if (this.aBoolean111) {
			local16.method3246(-1.0F);
			local16.method3246(-1.0F);
			local16.method3246(0.0F);
			local16.method3246(0.0F);
			local16.method3246(1.0F);
			local16.method3246(1.0F);
			local16.method3246(-1.0F);
			local16.method3246(0.0F);
			local16.method3246(1.0F);
			local16.method3246(1.0F);
			local16.method3246(1.0F);
			local16.method3246(1.0F);
			local16.method3246(0.0F);
			local16.method3246(1.0F);
			local16.method3246(0.0F);
			local16.method3246(-1.0F);
			local16.method3246(1.0F);
			local16.method3246(0.0F);
			local16.method3246(0.0F);
			local16.method3246(0.0F);
		} else {
			local16.method3249(-1.0F);
			local16.method3249(-1.0F);
			local16.method3249(0.0F);
			local16.method3249(0.0F);
			local16.method3249(1.0F);
			local16.method3249(1.0F);
			local16.method3249(-1.0F);
			local16.method3249(0.0F);
			local16.method3249(1.0F);
			local16.method3249(1.0F);
			local16.method3249(1.0F);
			local16.method3249(1.0F);
			local16.method3249(0.0F);
			local16.method3249(1.0F);
			local16.method3249(0.0F);
			local16.method3249(-1.0F);
			local16.method3249(1.0F);
			local16.method3249(0.0F);
			local16.method3249(0.0F);
			local16.method3249(0.0F);
		}
		this.anInterface1_3 = this.method1593(local16.anInt6952, 20, local16.aByteArray130, false);
		this.aClass260_5 = new Class260(this.anInterface1_3, 5126, 3, 0);
		this.aClass260_4 = new Class260(this.anInterface1_3, 5126, 2, 12);
		this.aClass57_1.method1331(this);
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(IIII)V")
	public void method1623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "(II)V")
	public void method1624(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method1613(7681, 7681);
		} else if (arg0 == 0) {
			this.method1613(8448, 8448);
		} else if (arg0 == 2) {
			this.method1613(34165, 7681);
		} else if (arg0 == 3) {
			this.method1613(260, 8448);
		} else if (arg0 == 4) {
			this.method1613(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!ef", name = "DA", descriptor = "(IIIIII[BII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(53) float local53;
		@Pc(41) float local41;
		if (this.aClass55_Sub3_Sub1_1 == null || arg2 > this.aClass55_Sub3_Sub1_1.anInt6487 || arg3 > this.aClass55_Sub3_Sub1_1.anInt6491) {
			this.aClass55_Sub3_Sub1_1 = Static205.method3256(arg3, this, arg2, arg6);
			this.aClass55_Sub3_Sub1_1.method5116(false, false);
			local41 = this.aClass55_Sub3_Sub1_1.aFloat100;
			local53 = this.aClass55_Sub3_Sub1_1.aFloat101;
		} else {
			this.aClass55_Sub3_Sub1_1.method5121(arg3, 6406, arg2, false, arg6);
			local41 = (float) arg2 * this.aClass55_Sub3_Sub1_1.aFloat100 / (float) this.aClass55_Sub3_Sub1_1.anInt6487;
			local53 = this.aClass55_Sub3_Sub1_1.aFloat101 * (float) arg3 / (float) this.aClass55_Sub3_Sub1_1.anInt6491;
		}
		this.method1584();
		this.method1646(this.aClass55_Sub3_Sub1_1);
		this.method1626(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method1642(arg5);
		this.method1613(34165, 34165);
		this.method1625(34166, 768, 0);
		this.method1625(5890, 770, 2);
		this.method1623(34166, 0);
		this.method1623(5890, 2);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = local143 + (float) arg2;
		@Pc(156) float local156 = (float) arg3 + local146;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local143, local156);
		OpenGL.glTexCoord2f(local53, local41);
		OpenGL.glVertex2f(local151, local156);
		OpenGL.glTexCoord2f(local53, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method1625(5890, 768, 0);
		this.method1625(34166, 770, 2);
		this.method1623(5890, 0);
		this.method1623(34166, 2);
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(IIII)V")
	public void method1625(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "(II)V")
	public void method1626(@OriginalArg(1) int arg0) {
		if (this.anInt2039 == arg0) {
			return;
		}
		@Pc(18) boolean local18;
		@Pc(22) byte local22;
		if (arg0 == 1) {
			local18 = true;
			local22 = 1;
		} else if (arg0 == 2) {
			local18 = false;
			local22 = 2;
		} else if (arg0 == 128) {
			local22 = 3;
			local18 = true;
		} else {
			local22 = 0;
			local18 = false;
		}
		if (!this.aBoolean119) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean119 = true;
		}
		if (this.aBoolean116 != local18) {
			if (local18) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean116 = local18;
		}
		if (this.anInt2028 != local22) {
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
			this.anInt2028 = local22;
		}
		this.anInt2019 &= 0xFFFFFFE3;
		this.anInt2039 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4436(@OriginalArg(0) Canvas arg0) {
		this.aLong56 = 0L;
		this.aCanvas5 = null;
		if (arg0 == null || arg0 == this.aCanvas4) {
			this.aLong56 = this.aLong55;
			this.aCanvas5 = this.aCanvas4;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable2.get(arg0);
			this.aLong56 = local36;
			this.aCanvas5 = arg0;
		}
		if (this.aCanvas5 == null || this.aLong56 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong56);
		this.method1627();
	}

	@OriginalMember(owner = "client!ef", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return this.anInt2010 + this.anInt2008 + this.anInt2009;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!mh;Lclient!mh;FLclient!mh;)Lclient!mh;")
	@Override
	public Class155 method4443(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class155 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean128 && this.aBoolean117 && this.aBoolean113) {
			@Pc(18) Class155_Sub1_Sub1 local18 = null;
			@Pc(21) Class155_Sub1 local21 = (Class155_Sub1) arg0;
			@Pc(24) Class155_Sub1 local24 = (Class155_Sub1) arg1;
			@Pc(28) Class55_Sub4 local28 = local21.method3951();
			@Pc(32) Class55_Sub4 local32 = local24.method3951();
			if (local28 != null && local32 != null) {
				@Pc(47) int local47 = local32.anInt7045 < local28.anInt7045 ? local28.anInt7045 : local32.anInt7045;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class155_Sub1_Sub1) {
					@Pc(59) Class155_Sub1_Sub1 local59 = (Class155_Sub1_Sub1) arg3;
					if (local47 == local59.method3595()) {
						local18 = local59;
					}
				}
				if (local18 == null) {
					local18 = new Class155_Sub1_Sub1(this, local47);
				}
				if (local18.method3596(local28, local32, arg2)) {
					return local18;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!ii;I)V")
	@Override
	public void method4409(@OriginalArg(0) Class91[] arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class8_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method3276(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "(I)V")
	private void method1627() {
		if (this.aCanvas5 == null) {
			this.anInt1924 = this.anInt1936 = 0;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas5.getSize();
			this.anInt1924 = local6.width;
			this.anInt1936 = local6.height;
		}
		if (this.anInterface8_1 == null) {
			this.anInt1823 = this.anInt1936;
			this.anInt1824 = this.anInt1924;
			this.method1579();
		}
		this.method1614();
		this.e();
	}

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "(B)V")
	private void method1628() {
		if (this.anInt2033 != 2) {
			this.anInt2033 = 2;
			this.method1639();
			this.method1649();
			this.anInt2019 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
	public synchronized void method1629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub26 local8 = new Class2_Sub26(arg0);
		local8.aLong227 = arg1;
		this.aClass14_10.method300(local8);
	}

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "(B)V")
	public void method1630() {
		if (this.anInt2019 == 4) {
			return;
		}
		this.method1654();
		this.method1582(false);
		this.method1587(false);
		this.method1588(false);
		this.method1635(false);
		this.method1594(-2);
		this.method1626(1);
		this.method1624(0);
		this.anInt2019 = 4;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BIIILclient!rt;)V")
	public void method1631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Interface10 arg2) {
		@Pc(7) int local7 = arg2.method2310();
		@Pc(14) int local14 = arg1 * this.method1596(local7);
		this.method1632(arg2);
		OpenGL.glDrawElements(4, arg0, local7, (long) local14 + arg2.method2311());
	}

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "()V")
	@Override
	public void method4483() {
		this.aClass212_1.method4704();
	}

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "()Z")
	@Override
	public boolean method4442() {
		return this.aClass192_1.method4335();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4427(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static85.aFloat44 = arg0;
		Static25.aFloat12 = arg2;
		Static49.aFloat16 = arg1;
	}

	@OriginalMember(owner = "client!ef", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < this.anInt2032) {
			this.anInt2032 = arg2;
		}
		if (this.anInt2016 < arg0) {
			this.anInt2016 = arg0;
		}
		if (arg1 > this.anInt2021) {
			this.anInt2021 = arg1;
		}
		if (arg3 < this.anInt2022) {
			this.anInt2022 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method1636();
		this.method1640();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!rt;)V")
	public void method1632(@OriginalArg(1) Interface10 arg0) {
		if (arg0 != this.anInterface10_2) {
			if (this.bf) {
				OpenGL.glBindBufferARB(34963, arg0.method2309());
			}
			this.anInterface10_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!nf;I)V")
	public void method1633(@OriginalArg(0) Interface8 arg0) {
		if (this.anInt2005 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2005 >= 0) {
			this.anInterface8Array2[this.anInt2005].method2869();
		}
		this.anInterface8_1 = this.anInterface8Array2[++this.anInt2005] = arg0;
		this.anInterface8_1.method2868();
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)V")
	public void method1634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2037 = arg1;
		this.anInt2026 = arg0;
		this.method1579();
		this.method1640();
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	@Override
	public void method4424(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "(F)V")
	@Override
	public void B(@OriginalArg(0) float arg0) {
		if (this.aFloat34 != arg0) {
			this.aFloat34 = arg0;
			this.method1617();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZB)V")
	public void method1635(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean130) {
			this.aBoolean130 = arg0;
			this.method1656();
			this.anInt2019 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "(B)V")
	private void method1636() {
		this.aFloat27 = this.anInt2021 - this.anInt2023;
		this.aFloat30 = this.anInt2022 - this.anInt2023;
		this.aFloat23 = this.anInt2032 - this.anInt2048;
		this.aFloat36 = this.anInt2016 - this.anInt2048;
	}

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "(II)V")
	public synchronized void method1637(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub26 local8 = new Class2_Sub26(arg0);
		this.aClass14_12.method300(local8);
	}

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "(I)V")
	public void method1638() {
		if (this.anInt2019 == 8) {
			return;
		}
		this.method1628();
		this.method1582(true);
		this.method1588(true);
		this.method1635(true);
		this.method1626(1);
		this.method1624(0);
		this.anInt2019 = 8;
	}

	@OriginalMember(owner = "client!ef", name = "NA", descriptor = "(IIIII)V")
	@Override
	protected void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "()Z")
	@Override
	public boolean method4408() {
		return true;
	}

	@OriginalMember(owner = "client!ef", name = "xa", descriptor = "()F")
	@Override
	public float xa() {
		return this.aFloat29;
	}

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "()V")
	@Override
	public void method4477() {
		this.method1635(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "()V")
	@Override
	protected void method4420() {
		for (@Pc(6) Class2 local6 = this.aClass14_8.method309(); local6 != null; local6 = this.aClass14_8.method311()) {
			((Class2_Sub17_Sub1) local6).method2526();
		}
		if (this.aClass212_1 != null) {
			this.aClass212_1.method4709();
		}
		if (this.anOpenGL1 != null) {
			this.method1619();
			@Pc(40) Enumeration local40 = this.aHashtable2.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable2.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean110) {
			Static313.method4399(false, true);
			this.aBoolean110 = false;
		}
	}

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "(I)V")
	private void method1639() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray16, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "(I)V")
	private void method1640() {
		if (this.anInt2032 >= this.anInt2016 && this.anInt2022 >= this.anInt2021) {
			OpenGL.glScissor(this.anInt2026 + this.anInt2016, this.anInt1823 + this.anInt2037 + -this.anInt2022, this.anInt2032 - this.anInt2016, -this.anInt2021 + this.anInt2022);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(FIFF)V")
	private void method1641(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean115) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg0, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean115 = true;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V")
	public void method1642(@OriginalArg(0) int arg0) {
		Static446.aFloatArray59[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static446.aFloatArray59[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static446.aFloatArray59[3] = (float) (arg0 >>> 24) / 255.0F;
		Static446.aFloatArray59[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static446.aFloatArray59, 0);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[Lclient!jd;)V")
	@Override
	public void method4428(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub20Array1[local7] = arg1[local7];
		}
		this.anInt2041 = arg0;
		if (this.anInt2033 != 1) {
			this.method1581();
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4460(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas4) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "()V")
	@Override
	public void method4432() {
		if (!this.aBoolean136 || this.anInt1824 <= 0 || this.anInt1823 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2016;
		@Pc(22) int local22 = this.anInt2032;
		@Pc(25) int local25 = this.anInt2021;
		@Pc(28) int local28 = this.anInt2022;
		this.e();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method1614();
		this.method1582(false);
		this.method1587(false);
		this.method1588(false);
		this.method1635(false);
		this.method1646(null);
		this.method1594(-2);
		this.method1624(1);
		this.method1626(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt1824, this.anInt1823, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.OA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "()Z")
	@Override
	public boolean method4465() {
		return true;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(III)V")
	public synchronized void method1643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub26 local8 = new Class2_Sub26(arg0);
		local8.aLong227 = arg1;
		this.aClass14_13.method300(local8);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!nf;)V")
	public void method1644(@OriginalArg(1) Interface8 arg0) {
		if (this.anInt2006 < 0 || this.anInterface8Array3[this.anInt2006] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface8Array3[this.anInt2006--] = null;
		arg0.method2865();
		if (this.anInt2006 < 0) {
			this.anInterface8_2 = null;
		} else {
			this.anInterface8_2 = this.anInterface8Array3[this.anInt2006];
			this.anInterface8_2.method2866();
		}
	}

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "(IFFFFF)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt2013;
		if (local11 || this.aFloat26 != arg1 || arg2 != this.aFloat38) {
			this.anInt2013 = arg0;
			this.aFloat26 = arg1;
			this.aFloat38 = arg2;
			if (local11) {
				this.aFloat39 = (float) (this.anInt2013 & 0xFF00) / 65280.0F;
				this.aFloat42 = (float) (this.anInt2013 & 0xFF0000) / 1.671168E7F;
				this.aFloat32 = (float) (this.anInt2013 & 0xFF) / 255.0F;
				this.method1617();
			}
			this.method1661();
		}
		if (this.aFloatArray13[0] == arg3 && this.aFloatArray13[1] == arg4 && arg5 == this.aFloatArray13[2]) {
			return;
		}
		this.aFloatArray13[0] = arg3;
		this.aFloatArray13[2] = arg5;
		this.aFloatArray13[1] = arg4;
		this.aFloatArray14[0] = -arg3;
		this.aFloatArray14[1] = -arg4;
		this.aFloatArray14[2] = -arg5;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray12[1] = local138 * arg4;
		this.aFloatArray12[2] = arg5 * local138;
		this.aFloatArray12[0] = local138 * arg3;
		this.aFloatArray15[0] = -this.aFloatArray12[0];
		this.aFloatArray15[1] = -this.aFloatArray12[1];
		this.aFloatArray15[2] = -this.aFloatArray12[2];
		this.method1577();
		this.anInt2029 = (int) (arg3 * 256.0F / arg4);
		this.anInt2049 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass212_1.method4707(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class17 method4441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class17_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "(B)V")
	public void method1645() {
		if (this.anInt2019 == 16) {
			return;
		}
		this.method1576();
		this.method1582(true);
		this.method1588(true);
		this.method1635(true);
		this.method1626(1);
		this.method1624(0);
		this.anInt2019 = 16;
	}

	@OriginalMember(owner = "client!ef", name = "JA", descriptor = "(IIIIII)Z")
	@Override
	public boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass35_Sub2_3.aFloat91 + (float) arg0 * this.aClass35_Sub2_3.aFloat93 + (float) arg1 * this.aClass35_Sub2_3.aFloat99 + this.aClass35_Sub2_3.aFloat94 * (float) arg2;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = (float) arg5 * this.aClass35_Sub2_3.aFloat94 + (float) arg4 * this.aClass35_Sub2_3.aFloat99 + (float) arg3 * this.aClass35_Sub2_3.aFloat93 + this.aClass35_Sub2_3.aFloat91;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt2025 && local59 < (float) this.anInt2025 || !(!((float) this.anInt2011 < local28) || !(local59 > (float) this.anInt2011))) {
			return false;
		}
		@Pc(123) int local123 = (int) (((float) arg2 * this.aClass35_Sub2_3.aFloat97 + (float) arg0 * this.aClass35_Sub2_3.aFloat90 + this.aClass35_Sub2_3.aFloat88 * (float) arg1 + this.aClass35_Sub2_3.aFloat92) * (float) this.anInt2017 / local28);
		@Pc(155) int local155 = (int) ((this.aClass35_Sub2_3.aFloat97 * (float) arg5 + (float) arg3 * this.aClass35_Sub2_3.aFloat90 + (float) arg4 * this.aClass35_Sub2_3.aFloat88 + this.aClass35_Sub2_3.aFloat92) * (float) this.anInt2017 / local59);
		if (this.aFloat36 > (float) local123 && this.aFloat36 > (float) local155 || (float) local123 > this.aFloat23 && (float) local155 > this.aFloat23) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass35_Sub2_3.aFloat95 * (float) arg1 + this.aClass35_Sub2_3.aFloat89 * (float) arg0 + (float) arg2 * this.aClass35_Sub2_3.aFloat96 + this.aClass35_Sub2_3.aFloat98) * (float) this.anInt2015 / local28);
			@Pc(245) int local245 = (int) (((float) arg5 * this.aClass35_Sub2_3.aFloat96 + (float) arg3 * this.aClass35_Sub2_3.aFloat89 + this.aClass35_Sub2_3.aFloat95 * (float) arg4 + this.aClass35_Sub2_3.aFloat98) * (float) this.anInt2015 / local59);
			return (!((float) local213 < this.aFloat27) || !(this.aFloat27 > (float) local245)) && (!(this.aFloat30 < (float) local213) || !((float) local245 > this.aFloat30));
		}
	}

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "()Lclient!c;")
	@Override
	public Class35 method4467() {
		return new Class35_Sub2();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!mk;)V")
	public void method1646(@OriginalArg(1) Class55 arg0) {
		@Pc(22) Class55 local22 = this.aClass55Array1[this.anInt2038];
		if (local22 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local22.anInt7037);
			} else {
				if (local22 == null) {
					OpenGL.glEnable(arg0.anInt7037);
				} else if (local22.anInt7037 != arg0.anInt7037) {
					OpenGL.glDisable(local22.anInt7037);
					OpenGL.glEnable(arg0.anInt7037);
				}
				OpenGL.glBindTexture(arg0.anInt7037, arg0.method5558());
			}
			this.aClass55Array1[this.anInt2038] = arg0;
		}
		this.anInt2019 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(ZII)V")
	public void method1647(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.method1652(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!pn;)V")
	@Override
	public void method4471(@OriginalArg(0) Class194 arg0) {
		this.aClass57_1.method1336(this, arg0);
	}

	@OriginalMember(owner = "client!ef", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2024 = arg2;
		this.anInt2045 = arg0;
		this.aBoolean129 = true;
		this.anInt2020 = arg1;
		this.anInt2014 = arg3;
		this.aClass192_1.method4334(false, false, 3);
		this.aClass192_1.aClass62_Sub1_1.method1459();
		this.method1586();
		this.method1608();
	}

	@OriginalMember(owner = "client!ef", name = "ia", descriptor = "(II)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt2025 && arg1 == this.anInt2011) {
			return;
		}
		this.anInt2011 = arg1;
		this.anInt2025 = arg0;
		this.method1605();
		this.method1586();
		if (this.anInt2033 == 3) {
			this.method1585();
		} else if (this.anInt2033 == 2) {
			this.method1639();
		}
	}

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "()I")
	@Override
	public int method4433() {
		return 4;
	}

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "(B)V")
	private void method1648() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static81.method1477(1000L);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIF)Lclient!jd;")
	@Override
	public Class2_Sub20 method4478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub20_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "(I)V")
	private void method1649() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, (float) 1, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass35_Sub2_3.method5049(), 0);
		if (this.aBoolean129) {
			this.aClass192_1.aClass62_Sub1_1.method1459();
		}
		this.method1577();
		this.method1581();
	}

	@OriginalMember(owner = "client!ef", name = "ea", descriptor = "(Lclient!c;)V")
	@Override
	public void ea(@OriginalArg(0) Class35 arg0) {
		this.aClass35_Sub2_3 = (Class35_Sub2) arg0;
		this.aClass35_Sub2_4.method5052(this.aClass35_Sub2_3);
		if (this.anInt2033 != 1) {
			this.method1649();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	@Override
	public void method4416(@OriginalArg(0) boolean arg0) {
		this.aBoolean131 = arg0;
		this.method1656();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
	@Override
	public int method4429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(ILclient!nf;)V")
	public void method1651(@OriginalArg(1) Interface8 arg0) {
		if (this.anInt2006 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2006 >= 0) {
			this.anInterface8Array3[this.anInt2006].method2865();
		}
		this.anInterface8_2 = this.anInterface8Array3[++this.anInt2006] = arg0;
		this.anInterface8_2.method2866();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZBZI)V")
	public void method1652(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 != this.anInt2036) {
			if (arg2 < 0) {
				this.method1592();
				this.method1646(null);
				this.method1624(0);
				if (!this.aBoolean129) {
					this.aClass192_1.method4334(arg1, arg0, 0);
				}
			} else {
				@Pc(40) Class55_Sub3 local40 = this.aClass204_1.method4531(arg2);
				@Pc(46) Class140 local46 = super.anInterface4_6.method3794(arg2);
				if (local46.aByte60 == 0 && local46.aByte63 == 0) {
					this.method1592();
				} else {
					@Pc(64) int local64 = local46.aBoolean286 ? 64 : 128;
					@Pc(68) int local68 = local64 * 50;
					this.method1641((float) (this.anInt2002 % local68 * local46.aByte63) / (float) local68, (float) (this.anInt2002 % local68 * local46.aByte60) / (float) local68, 0.0F);
				}
				if (this.aBoolean129) {
					this.aClass192_1.method4334(arg1, arg0, 3);
					this.method1646(local40);
					this.method1624(local46.anInt3820);
				} else {
					this.aClass192_1.method4334(arg1, arg0, local46.aByte62);
					this.aClass192_1.method4339(local46.anInt3819, local46.aByte61);
					if (!this.aClass192_1.method4337(local40, local46.anInt3820)) {
						this.method1646(local40);
						this.method1624(local46.anInt3820);
					}
				}
			}
			this.anInt2036 = arg2;
		}
		this.anInt2019 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(Z)V")
	private void method1653() {
		if (this.aBoolean134 && !this.aBoolean120) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "(I)V")
	private void method1654() {
		if (this.anInt2033 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt1824 > 0 && this.anInt1823 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt1824, (double) this.anInt1823, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt2033 = 1;
		this.anInt2019 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "(I)I")
	private int method1655() {
		@Pc(5) int local5 = 0;
		this.aString19 = OpenGL.glGetString(7936).toLowerCase();
		this.aString18 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString19.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString19.indexOf("brian paul") != -1 || this.aString19.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(52) String[] local52 = Static455.method4448(' ', local44.replace('.', ' '));
		if (local52.length >= 2) {
			try {
				@Pc(66) int local66 = Static418.method5543(local52[0]);
				@Pc(74) int local74 = Static418.method5543(local52[1]);
				this.anInt2044 = local74 + local66 * 10;
			} catch (@Pc(83) NumberFormatException local83) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt2044 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(122) int[] local122 = new int[1];
		OpenGL.glGetIntegerv(34018, local122, 0);
		this.anInt2031 = local122[0];
		OpenGL.glGetIntegerv(34929, local122, 0);
		this.anInt2040 = local122[0];
		OpenGL.glGetIntegerv(34930, local122, 0);
		this.anInt2035 = local122[0];
		if (this.anInt2031 < 2 || this.anInt2040 < 2 || this.anInt2035 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean111 = NativeStream.a();
		this.anOpenGL1.arePbuffersAvailable();
		this.bf = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean125 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean121 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean133 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean112 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean135 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean126 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean128 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean114 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean132 = false;
		this.aBoolean117 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean113 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean124 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean122 = this.aBoolean124 & this.aBoolean113;
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!ef", name = "ca", descriptor = "(ILclient!ma;II)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class73_Sub2 local6 = (Class73_Sub2) arg1;
		@Pc(9) Class55_Sub3_Sub1 local9 = local6.aClass55_Sub3_Sub1_5;
		this.method1584();
		this.method1646(local6.aClass55_Sub3_Sub1_5);
		this.method1626(1);
		this.method1613(7681, 8448);
		this.method1625(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat100 / (float) local9.anInt6500;
		@Pc(46) float local46 = local9.aFloat101 / (float) local9.anInt6503;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2016 - arg2), (float) (this.anInt2021 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2016, this.anInt2021);
		OpenGL.glTexCoord2f((float) (this.anInt2016 - arg2) * local39, local46 * (float) (this.anInt2022 - arg3));
		OpenGL.glVertex2i(this.anInt2016, this.anInt2022);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2032 - arg2), local46 * (float) (this.anInt2022 - arg3));
		OpenGL.glVertex2i(this.anInt2032, this.anInt2022);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2032 - arg2), (float) (this.anInt2021 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2032, this.anInt2021);
		OpenGL.glEnd();
		this.method1625(5890, 768, 0);
	}

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "(I)V")
	private void method1656() {
		OpenGL.glDepthMask(this.aBoolean130 && this.aBoolean131);
	}

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "(I)V")
	private void method1657() {
		this.method1594(-2);
		for (@Pc(14) int local14 = this.anInt2031 - 1; local14 >= 0; local14--) {
			this.method1600(local14);
			this.method1646(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method1613(8448, 8448);
		this.method1625(34168, 770, 2);
		this.method1592();
		this.anInt2039 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt2028 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean116 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean119 = true;
		this.method1582(true);
		this.method1587(true);
		this.method1588(true);
		this.method1635(true);
		this.method1614();
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
		@Pc(130) float[] local130 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(132) int local132 = 0; local132 < 8; local132++) {
			@Pc(138) int local138 = local132 + 16384;
			OpenGL.glLightfv(local138, 4608, local130, 0);
			OpenGL.glLightf(local138, 4615, 0.0F);
			OpenGL.glLightf(local138, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt2013 = this.anInt2027 = -1;
		this.e();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method1595();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method1626(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean125) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean125) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BJ)V")
	public synchronized void method1658(@OriginalArg(1) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong227 = arg0;
		this.aClass14_15.method300(local7);
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Lclient!u;")
	@Override
	public Class2_Sub17 method4440() {
		@Pc(8) Class2_Sub17_Sub1 local8 = new Class2_Sub17_Sub1(78643200);
		this.aClass14_8.method300(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Lclient!nf;I)V")
	public void method1659(@OriginalArg(0) Interface8 arg0) {
		if (this.aBoolean113) {
			this.method1644(arg0);
			this.method1602(arg0);
		} else if (this.anInt2007 >= 0 && this.anInterface8Array1[this.anInt2007] == arg0) {
			this.anInterface8Array1[this.anInt2007--] = null;
			arg0.method2867();
			if (this.anInt2007 >= 0) {
				this.anInterface8_2 = this.anInterface8_1 = this.anInterface8Array1[this.anInt2007];
				this.anInterface8_2.method2870();
			} else {
				this.anInterface8_2 = this.anInterface8_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt2025;
	}

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "()Z")
	@Override
	public boolean method4444() {
		return true;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!tc;)V")
	public void method1660(@OriginalArg(1) Class35_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method5049(), 0);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!kq;IIII)Lclient!t;")
	@Override
	public Class91 method4414(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class91_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(Z)V")
	private void method1661() {
		Static446.aFloatArray59[0] = this.aFloat26 * this.aFloat42;
		Static446.aFloatArray59[3] = 1.0F;
		Static446.aFloatArray59[2] = this.aFloat26 * this.aFloat32;
		Static446.aFloatArray59[1] = this.aFloat39 * this.aFloat26;
		OpenGL.glLightfv(16384, 4609, Static446.aFloatArray59, 0);
		Static446.aFloatArray59[3] = 1.0F;
		Static446.aFloatArray59[0] = this.aFloat42 * -this.aFloat38;
		Static446.aFloatArray59[2] = -this.aFloat38 * this.aFloat32;
		Static446.aFloatArray59[1] = this.aFloat39 * -this.aFloat38;
		OpenGL.glLightfv(16385, 4609, Static446.aFloatArray59, 0);
	}
}
