import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
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

@OriginalClass("client!ep")
public final class Class95_Sub1 extends Class95 {

	@OriginalMember(owner = "client!ep", name = "ec", descriptor = "I")
	public int anInt2397;

	@OriginalMember(owner = "client!ep", name = "Yc", descriptor = "I")
	private int anInt2443;

	@OriginalMember(owner = "client!ep", name = "Ad", descriptor = "I")
	public int anInt2469;

	@OriginalMember(owner = "client!ep", name = "re", descriptor = "I")
	private int anInt2510;

	@OriginalMember(owner = "client!ep", name = "Be", descriptor = "I")
	public int anInt2513;

	@OriginalMember(owner = "client!ep", name = "De", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!ep", name = "Je", descriptor = "Lclient!kn;")
	private Class61_Sub3 aClass61_Sub3_1;

	@OriginalMember(owner = "client!ep", name = "Oe", descriptor = "Lclient!tea;")
	private Class333 aClass333_1;

	@OriginalMember(owner = "client!ep", name = "Qe", descriptor = "Lclient!cg;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ep", name = "Re", descriptor = "Lclient!cg;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ep", name = "Se", descriptor = "I")
	public int anInt2519;

	@OriginalMember(owner = "client!ep", name = "Te", descriptor = "I")
	public int anInt2520;

	@OriginalMember(owner = "client!ep", name = "Ve", descriptor = "I")
	private int anInt2521;

	@OriginalMember(owner = "client!ep", name = "cf", descriptor = "I")
	private int anInt2522;

	@OriginalMember(owner = "client!ep", name = "df", descriptor = "I")
	private int anInt2523;

	@OriginalMember(owner = "client!ep", name = "ef", descriptor = "Z")
	private boolean aBoolean169;

	@OriginalMember(owner = "client!ep", name = "ff", descriptor = "Z")
	private boolean aBoolean170;

	@OriginalMember(owner = "client!ep", name = "gf", descriptor = "J")
	private long aLong71;

	@OriginalMember(owner = "client!ep", name = "jf", descriptor = "Z")
	private boolean aBoolean171;

	@OriginalMember(owner = "client!ep", name = "kf", descriptor = "Z")
	private boolean aBoolean172;

	@OriginalMember(owner = "client!ep", name = "lf", descriptor = "I")
	private int anInt2524;

	@OriginalMember(owner = "client!ep", name = "pf", descriptor = "Lclient!hu;")
	private Interface12 anInterface12_3;

	@OriginalMember(owner = "client!ep", name = "uf", descriptor = "Z")
	public boolean aBoolean173;

	@OriginalMember(owner = "client!ep", name = "vf", descriptor = "Z")
	public boolean aBoolean174;

	@OriginalMember(owner = "client!ep", name = "wf", descriptor = "Lclient!ml;")
	public Class182_Sub2 aClass182_Sub2_1;

	@OriginalMember(owner = "client!ep", name = "Af", descriptor = "Lclient!ml;")
	public Class182_Sub2 aClass182_Sub2_2;

	@OriginalMember(owner = "client!ep", name = "Bf", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!ep", name = "Cf", descriptor = "I")
	private int anInt2531;

	@OriginalMember(owner = "client!ep", name = "Df", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!ep", name = "If", descriptor = "Z")
	public boolean aBoolean179;

	@OriginalMember(owner = "client!ep", name = "Of", descriptor = "Lclient!ml;")
	public Class182_Sub2 aClass182_Sub2_3;

	@OriginalMember(owner = "client!ep", name = "Pf", descriptor = "Z")
	public boolean aBoolean181;

	@OriginalMember(owner = "client!ep", name = "Qf", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!ep", name = "Rf", descriptor = "[Lclient!hl;")
	private Class65[] aClass65Array1;

	@OriginalMember(owner = "client!ep", name = "Tf", descriptor = "Lclient!dd;")
	private Class65_Sub1_Sub1 aClass65_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ep", name = "Uf", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!ep", name = "Wf", descriptor = "Z")
	public boolean aBoolean183;

	@OriginalMember(owner = "client!ep", name = "Yf", descriptor = "Lclient!ml;")
	public Class182_Sub2 aClass182_Sub2_4;

	@OriginalMember(owner = "client!ep", name = "cg", descriptor = "Lclient!eca;")
	public Class82 aClass82_5;

	@OriginalMember(owner = "client!ep", name = "dg", descriptor = "Lclient!ml;")
	public Class182_Sub2 aClass182_Sub2_5;

	@OriginalMember(owner = "client!ep", name = "eg", descriptor = "Lclient!ml;")
	public Class182_Sub2 aClass182_Sub2_6;

	@OriginalMember(owner = "client!ep", name = "hg", descriptor = "I")
	private int anInt2538;

	@OriginalMember(owner = "client!ep", name = "jg", descriptor = "F")
	private float aFloat33;

	@OriginalMember(owner = "client!ep", name = "lg", descriptor = "F")
	private float aFloat34;

	@OriginalMember(owner = "client!ep", name = "og", descriptor = "Lclient!ml;")
	public Class182_Sub2 aClass182_Sub2_7;

	@OriginalMember(owner = "client!ep", name = "qg", descriptor = "Lclient!ml;")
	public Class182_Sub2 aClass182_Sub2_8;

	@OriginalMember(owner = "client!ep", name = "rg", descriptor = "Lclient!tea;")
	public Class333 aClass333_2;

	@OriginalMember(owner = "client!ep", name = "sg", descriptor = "Lclient!en;")
	private Class12_Sub2 aClass12_Sub2_1;

	@OriginalMember(owner = "client!ep", name = "ug", descriptor = "Z")
	private boolean aBoolean187;

	@OriginalMember(owner = "client!ep", name = "vg", descriptor = "Z")
	private boolean aBoolean188;

	@OriginalMember(owner = "client!ep", name = "wg", descriptor = "Lclient!ml;")
	public Class182_Sub2 aClass182_Sub2_9;

	@OriginalMember(owner = "client!ep", name = "xg", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!ep", name = "Ag", descriptor = "I")
	public int anInt2542;

	@OriginalMember(owner = "client!ep", name = "Bg", descriptor = "Z")
	private boolean aBoolean189;

	@OriginalMember(owner = "client!ep", name = "Cg", descriptor = "Z")
	private boolean aBoolean190;

	@OriginalMember(owner = "client!ep", name = "Dg", descriptor = "Z")
	private boolean aBoolean191;

	@OriginalMember(owner = "client!ep", name = "Fg", descriptor = "Z")
	public boolean aBoolean192;

	@OriginalMember(owner = "client!ep", name = "Hg", descriptor = "Lclient!fq;")
	public Class65_Sub1 aClass65_Sub1_1;

	@OriginalMember(owner = "client!ep", name = "Jg", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!ep", name = "Mg", descriptor = "Lclient!eca;")
	public Class82 aClass82_6;

	@OriginalMember(owner = "client!ep", name = "Ng", descriptor = "I")
	private int anInt2545;

	@OriginalMember(owner = "client!ep", name = "Og", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!ep", name = "Pg", descriptor = "Lclient!vi;")
	private Interface26 anInterface26_1;

	@OriginalMember(owner = "client!ep", name = "Sg", descriptor = "Lclient!ml;")
	public Class182_Sub2 aClass182_Sub2_10;

	@OriginalMember(owner = "client!ep", name = "Tg", descriptor = "I")
	private int anInt2546;

	@OriginalMember(owner = "client!ep", name = "Ug", descriptor = "F")
	private float aFloat43;

	@OriginalMember(owner = "client!ep", name = "Xg", descriptor = "I")
	public int anInt2548;

	@OriginalMember(owner = "client!ep", name = "Zg", descriptor = "I")
	public int anInt2549;

	@OriginalMember(owner = "client!ep", name = "bh", descriptor = "I")
	private int anInt2551;

	@OriginalMember(owner = "client!ep", name = "ch", descriptor = "I")
	private int anInt2552;

	@OriginalMember(owner = "client!ep", name = "dh", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!ep", name = "eh", descriptor = "Z")
	public boolean aBoolean194;

	@OriginalMember(owner = "client!ep", name = "gh", descriptor = "Lclient!hu;")
	private Interface12 anInterface12_4;

	@OriginalMember(owner = "client!ep", name = "ih", descriptor = "Z")
	public boolean aBoolean195;

	@OriginalMember(owner = "client!ep", name = "lh", descriptor = "Z")
	private boolean aBoolean196;

	@OriginalMember(owner = "client!ep", name = "mh", descriptor = "I")
	private int anInt2555;

	@OriginalMember(owner = "client!ep", name = "nh", descriptor = "I")
	private int anInt2556;

	@OriginalMember(owner = "client!ep", name = "ph", descriptor = "Z")
	private boolean aBoolean197;

	@OriginalMember(owner = "client!ep", name = "rh", descriptor = "I")
	public int anInt2558;

	@OriginalMember(owner = "client!ep", name = "sh", descriptor = "Z")
	public boolean aBoolean198;

	@OriginalMember(owner = "client!ep", name = "uh", descriptor = "I")
	private int anInt2559;

	@OriginalMember(owner = "client!ep", name = "wh", descriptor = "I")
	private int anInt2560;

	@OriginalMember(owner = "client!ep", name = "P", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!ep", name = "se", descriptor = "I")
	public int anInt2511 = 128;

	@OriginalMember(owner = "client!ep", name = "xe", descriptor = "Lclient!uw;")
	private final Class354 aClass354_1 = new Class354();

	@OriginalMember(owner = "client!ep", name = "ze", descriptor = "Lclient!uj;")
	private final Class177_Sub3 aClass177_Sub3_1 = new Class177_Sub3();

	@OriginalMember(owner = "client!ep", name = "Ae", descriptor = "Lclient!uj;")
	public final Class177_Sub3 aClass177_Sub3_2 = new Class177_Sub3();

	@OriginalMember(owner = "client!ep", name = "Ge", descriptor = "I")
	public int anInt2514 = 8;

	@OriginalMember(owner = "client!ep", name = "Ee", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!ep", name = "He", descriptor = "I")
	public int anInt2515 = 3;

	@OriginalMember(owner = "client!ep", name = "Fe", descriptor = "Lclient!fha;")
	private final Class109 aClass109_16 = new Class109();

	@OriginalMember(owner = "client!ep", name = "Ke", descriptor = "[Lclient!cg;")
	private final Interface3[] anInterface3Array2 = new Interface3[4];

	@OriginalMember(owner = "client!ep", name = "Ne", descriptor = "I")
	private int anInt2517 = -1;

	@OriginalMember(owner = "client!ep", name = "Me", descriptor = "I")
	private int anInt2516 = -1;

	@OriginalMember(owner = "client!ep", name = "Le", descriptor = "[Lclient!cg;")
	private final Interface3[] anInterface3Array3 = new Interface3[4];

	@OriginalMember(owner = "client!ep", name = "Ie", descriptor = "[Lclient!cg;")
	private final Interface3[] anInterface3Array1 = new Interface3[4];

	@OriginalMember(owner = "client!ep", name = "Pe", descriptor = "I")
	private int anInt2518 = -1;

	@OriginalMember(owner = "client!ep", name = "Ue", descriptor = "Lclient!fha;")
	private final Class109 aClass109_17;

	@OriginalMember(owner = "client!ep", name = "We", descriptor = "Lclient!fha;")
	private final Class109 aClass109_18;

	@OriginalMember(owner = "client!ep", name = "Xe", descriptor = "Lclient!fha;")
	private final Class109 aClass109_19;

	@OriginalMember(owner = "client!ep", name = "Ye", descriptor = "Lclient!fha;")
	private final Class109 aClass109_20;

	@OriginalMember(owner = "client!ep", name = "Ze", descriptor = "Lclient!fha;")
	private final Class109 aClass109_21;

	@OriginalMember(owner = "client!ep", name = "af", descriptor = "Lclient!fha;")
	private final Class109 aClass109_22;

	@OriginalMember(owner = "client!ep", name = "bf", descriptor = "Lclient!fha;")
	private final Class109 bf;

	@OriginalMember(owner = "client!ep", name = "hf", descriptor = "Lclient!uj;")
	public final Class177_Sub3 aClass177_Sub3_3;

	@OriginalMember(owner = "client!ep", name = "mf", descriptor = "Lclient!uj;")
	public final Class177_Sub3 aClass177_Sub3_4;

	@OriginalMember(owner = "client!ep", name = "nf", descriptor = "Lclient!uj;")
	public final Class177_Sub3 aClass177_Sub3_5;

	@OriginalMember(owner = "client!ep", name = "zf", descriptor = "I")
	private int anInt2530;

	@OriginalMember(owner = "client!ep", name = "Jf", descriptor = "I")
	public int anInt2533;

	@OriginalMember(owner = "client!ep", name = "Ff", descriptor = "Z")
	private boolean aBoolean177;

	@OriginalMember(owner = "client!ep", name = "Nf", descriptor = "I")
	private int anInt2534;

	@OriginalMember(owner = "client!ep", name = "rf", descriptor = "I")
	public int anInt2526;

	@OriginalMember(owner = "client!ep", name = "Kf", descriptor = "F")
	private float aFloat27;

	@OriginalMember(owner = "client!ep", name = "of", descriptor = "I")
	private int anInt2525;

	@OriginalMember(owner = "client!ep", name = "gg", descriptor = "I")
	public int anInt2537;

	@OriginalMember(owner = "client!ep", name = "sf", descriptor = "I")
	private int anInt2527;

	@OriginalMember(owner = "client!ep", name = "tf", descriptor = "I")
	private int anInt2528;

	@OriginalMember(owner = "client!ep", name = "xf", descriptor = "I")
	private int anInt2529;

	@OriginalMember(owner = "client!ep", name = "Sf", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!ep", name = "ag", descriptor = "I")
	public int anInt2536;

	@OriginalMember(owner = "client!ep", name = "Lg", descriptor = "F")
	private float aFloat40;

	@OriginalMember(owner = "client!ep", name = "Qg", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!ep", name = "Ig", descriptor = "I")
	public int anInt2543;

	@OriginalMember(owner = "client!ep", name = "ng", descriptor = "I")
	public int anInt2539;

	@OriginalMember(owner = "client!ep", name = "Lf", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!ep", name = "qf", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!ep", name = "yg", descriptor = "F")
	private float aFloat37;

	@OriginalMember(owner = "client!ep", name = "Xf", descriptor = "I")
	private int anInt2535;

	@OriginalMember(owner = "client!ep", name = "Vg", descriptor = "I")
	public int anInt2547;

	@OriginalMember(owner = "client!ep", name = "Yg", descriptor = "[Lclient!kb;")
	private final Class2_Sub24[] aClass2_Sub24Array11;

	@OriginalMember(owner = "client!ep", name = "Wg", descriptor = "[F")
	private final float[] aFloatArray9;

	@OriginalMember(owner = "client!ep", name = "Kg", descriptor = "I")
	public int anInt2544;

	@OriginalMember(owner = "client!ep", name = "Zf", descriptor = "[F")
	public final float[] aFloatArray7;

	@OriginalMember(owner = "client!ep", name = "tg", descriptor = "I")
	public int anInt2540;

	@OriginalMember(owner = "client!ep", name = "mg", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!ep", name = "Gf", descriptor = "I")
	private int anInt2532;

	@OriginalMember(owner = "client!ep", name = "kh", descriptor = "[F")
	private final float[] aFloatArray10;

	@OriginalMember(owner = "client!ep", name = "fh", descriptor = "I")
	private int anInt2553;

	@OriginalMember(owner = "client!ep", name = "hh", descriptor = "F")
	private float aFloat44;

	@OriginalMember(owner = "client!ep", name = "jh", descriptor = "I")
	private int anInt2554;

	@OriginalMember(owner = "client!ep", name = "Gg", descriptor = "F")
	private float aFloat38;

	@OriginalMember(owner = "client!ep", name = "bg", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!ep", name = "yf", descriptor = "Z")
	private boolean aBoolean175;

	@OriginalMember(owner = "client!ep", name = "zg", descriptor = "I")
	public int anInt2541;

	@OriginalMember(owner = "client!ep", name = "oh", descriptor = "I")
	public int anInt2557;

	@OriginalMember(owner = "client!ep", name = "Eg", descriptor = "[F")
	private final float[] aFloatArray8;

	@OriginalMember(owner = "client!ep", name = "qh", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!ep", name = "th", descriptor = "[F")
	private final float[] aFloatArray11;

	@OriginalMember(owner = "client!ep", name = "kg", descriptor = "Lclient!jga;")
	public Class2_Sub22_Sub1 aClass2_Sub22_Sub1_1;

	@OriginalMember(owner = "client!ep", name = "xh", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!ep", name = "vh", descriptor = "[B")
	public final byte[] aByteArray33;

	@OriginalMember(owner = "client!ep", name = "zh", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!ep", name = "yh", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!ep", name = "hd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas2;

	@OriginalMember(owner = "client!ep", name = "X", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!ep", name = "ue", descriptor = "I")
	public final int anInt2512;

	@OriginalMember(owner = "client!ep", name = "bc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ep", name = "qe", descriptor = "J")
	private final long aLong70;

	@OriginalMember(owner = "client!ep", name = "ed", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!ep", name = "ah", descriptor = "I")
	public final int anInt2550;

	@OriginalMember(owner = "client!ep", name = "ig", descriptor = "Z")
	public boolean aBoolean185;

	@OriginalMember(owner = "client!ep", name = "Vf", descriptor = "Z")
	public boolean aBoolean182;

	@OriginalMember(owner = "client!ep", name = "Mf", descriptor = "Z")
	private boolean aBoolean180;

	@OriginalMember(owner = "client!ep", name = "Ef", descriptor = "Z")
	public boolean aBoolean176;

	@OriginalMember(owner = "client!ep", name = "Hf", descriptor = "Z")
	private boolean aBoolean178;

	@OriginalMember(owner = "client!ep", name = "Rg", descriptor = "Z")
	public boolean aBoolean193;

	@OriginalMember(owner = "client!ep", name = "fg", descriptor = "Z")
	public boolean aBoolean184;

	@OriginalMember(owner = "client!ep", name = "pg", descriptor = "Z")
	private final boolean aBoolean186;

	@OriginalMember(owner = "client!ep", name = "te", descriptor = "Lclient!ht;")
	private final Class144 aClass144_1;

	@OriginalMember(owner = "client!ep", name = "Ce", descriptor = "Lclient!kj;")
	public final Class193 aClass193_1;

	@OriginalMember(owner = "client!ep", name = "ve", descriptor = "Lclient!kg;")
	private final Class190 aClass190_1;

	@OriginalMember(owner = "client!ep", name = "ye", descriptor = "Lclient!ud;")
	private Class2_Sub15_Sub1 aClass2_Sub15_Sub1_1;

	@OriginalMember(owner = "client!ep", name = "we", descriptor = "Lclient!pea;")
	private final Class265 aClass265_1;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class95_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class75();
		new Class118(16);
		this.aClass109_17 = new Class109();
		this.aClass109_18 = new Class109();
		this.aClass109_19 = new Class109();
		this.aClass109_20 = new Class109();
		this.aClass109_21 = new Class109();
		this.aClass109_22 = new Class109();
		this.bf = new Class109();
		this.aClass177_Sub3_3 = new Class177_Sub3();
		this.aClass177_Sub3_4 = new Class177_Sub3();
		this.aClass177_Sub3_5 = new Class177_Sub3();
		this.anInt2530 = 0;
		this.anInt2533 = 512;
		this.aBoolean177 = false;
		this.anInt2534 = 0;
		this.anInt2526 = 50;
		this.aFloat27 = 1.0F;
		this.anInt2525 = 3584;
		this.anInt2537 = -1;
		this.anInt2527 = 0;
		this.anInt2528 = 8448;
		this.anInt2529 = -1;
		this.aFloat30 = 1.0F;
		this.anInt2536 = 512;
		this.aFloat40 = -1.0F;
		this.aFloat42 = 3584.0F;
		this.anInt2543 = 0;
		this.anInt2539 = -1;
		this.aFloat28 = -1.0F;
		this.aFloat25 = -1.0F;
		this.aFloat37 = -1.0F;
		this.anInt2535 = 0;
		this.anInt2547 = 0;
		this.aClass2_Sub24Array11 = new Class2_Sub24[Static212.anInt3532];
		this.aFloatArray9 = new float[4];
		this.anInt2544 = 0;
		this.aFloatArray7 = new float[4];
		this.anInt2540 = -1;
		this.aFloat35 = 1.0F;
		this.anInt2532 = 0;
		this.aFloatArray10 = new float[4];
		this.anInt2553 = 8448;
		this.aFloat44 = 1.0F;
		this.anInt2554 = 0;
		this.aFloat38 = 0.0F;
		this.aFloat32 = 1.0F;
		this.aBoolean175 = true;
		this.anInt2541 = 0;
		this.anInt2557 = -1;
		this.aFloatArray8 = new float[16];
		this.aFloat45 = 3584.0F;
		this.aFloatArray11 = new float[4];
		this.aClass2_Sub22_Sub1_1 = new Class2_Sub22_Sub1(8192);
		this.anIntArray166 = new int[1];
		this.aByteArray33 = new byte[16384];
		this.anIntArray168 = new int[1];
		this.anIntArray167 = new int[1];
		this.aCanvas1 = this.aCanvas2 = arg0;
		this.anInt2512 = arg2;
		if (!Static550.method7576("jaclib")) {
			throw new RuntimeException("");
		} else if (Static550.method7576("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong69 = this.aLong70 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt2512);
				if (this.aLong70 == 0L) {
					throw new RuntimeException("");
				}
				this.method2046();
				@Pc(335) int local335 = this.method2068();
				if (local335 != 0) {
					throw new RuntimeException("");
				}
				this.anInt2550 = this.aBoolean174 ? 33639 : 5121;
				if (this.aString22.indexOf("radeon") != -1) {
					@Pc(358) int local358 = 0;
					@Pc(360) boolean local360 = false;
					@Pc(362) boolean local362 = false;
					@Pc(371) String[] local371 = Static17.method249(this.aString22.replace('/', ' '), ' ');
					for (@Pc(373) int local373 = 0; local373 < local371.length; local373++) {
						@Pc(379) String local379 = local371[local373];
						try {
							if (local379.length() > 0) {
								if (local379.charAt(0) == 'x' && local379.length() >= 3 && Static319.method4274(local379.substring(1, 3))) {
									local379 = local379.substring(1);
									local362 = true;
								}
								if (local379.equals("hd")) {
									local360 = true;
								} else {
									if (local379.startsWith("hd")) {
										local379 = local379.substring(2);
										local360 = true;
									}
									if (local379.length() >= 4 && Static319.method4274(local379.substring(0, 4))) {
										local358 = Static445.method6066(local379.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(445) Exception local445) {
						}
					}
					if (!local360 || local358 < 4000) {
						this.aBoolean185 = false;
					}
					if (!local362 && !local360) {
						if (local358 >= 7000 && local358 <= 9250) {
							this.aBoolean182 = false;
						}
						if (local358 >= 7000 && local358 <= 7999) {
							this.aBoolean180 = false;
						}
					}
					this.aBoolean176 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean178 = this.aBoolean180;
					this.aBoolean193 = true;
				}
				if (this.aString21.indexOf("intel") != -1) {
					this.aBoolean184 = false;
				}
				this.aBoolean186 = !this.aString21.equals("s3 graphics");
				if (this.aBoolean180) {
					try {
						@Pc(535) int[] local535 = new int[1];
						OpenGL.glGenBuffersARB(1, local535, 0);
					} catch (@Pc(541) Throwable local541) {
						throw new RuntimeException("");
					}
				}
				Static171.method2575(false, true);
				this.aBoolean168 = true;
				this.aClass144_1 = new Class144(this, super.anInterface6_27);
				this.method2050();
				this.aClass193_1 = new Class193(this);
				this.aClass190_1 = new Class190(this);
				if (this.aClass190_1.method4025()) {
					this.aClass2_Sub15_Sub1_1 = new Class2_Sub15_Sub1(this);
					if (!this.aClass2_Sub15_Sub1_1.method7794()) {
						this.aClass2_Sub15_Sub1_1.method7788();
						this.aClass2_Sub15_Sub1_1 = null;
					}
				}
				this.aClass265_1 = new Class265(this);
				this.method2111();
				this.method2087();
				this.method6986();
			} catch (@Pc(615) Throwable local615) {
				local615.printStackTrace();
				this.method6966();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIBI)V")
	public void method2038(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!uha;)V")
	@Override
	public void method6941(@OriginalArg(0) Class177 arg0) {
		this.aClass177_Sub3_3.method7879(arg0);
		this.aClass177_Sub3_4.method7879(this.aClass177_Sub3_3);
		this.aClass177_Sub3_4.method7887();
		this.aClass177_Sub3_5.method7890(this.aClass177_Sub3_4);
		if (this.anInt2546 != 1) {
			this.method2110();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!cha;)V")
	@Override
	public void method7010(@OriginalArg(0) Interface4 arg0) {
	}

	@OriginalMember(owner = "client!ep", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2539 == arg0 && arg1 == this.anInt2540 && arg2 == this.anInt2541) {
			return;
		}
		this.anInt2540 = arg1;
		this.anInt2539 = arg0;
		this.anInt2541 = arg2;
		this.method2048();
		this.method2041();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "([IIIIIZ)Lclient!cw;")
	@Override
	public Class61 method7012(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class61_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "(I)V")
	@Override
	public void method6982(@OriginalArg(0) int arg0) {
		this.method2046();
	}

	@OriginalMember(owner = "client!ep", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method2062(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg5;
		@Pc(9) Class65_Sub1_Sub1 local9 = local6.aClass65_Sub1_Sub1_2;
		this.method2093();
		this.method2077(local6.aClass65_Sub1_Sub1_2);
		this.method2062(1);
		this.method2105(7681, 8448);
		this.method2101(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat19 / (float) local9.anInt1699;
		@Pc(46) float local46 = local9.aFloat18 / (float) local9.anInt1700;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(58) float local58 = (float) arg3 - (float) arg1;
		@Pc(71) float local71 = (float) (1.0D / Math.sqrt((double) (local58 * local58 + local52 * local52)));
		@Pc(75) float local75 = local52 * local71;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(94) float local94 = local58 * local71;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local75 + 0.35F, (float) arg3 + 0.35F + local94);
		OpenGL.glEnd();
		this.method2101(768, 5890, 0);
	}

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "(I)V")
	@Override
	public void method6949(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt2511 = arg0;
		this.aClass144_1.method3028();
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V")
	private void method2039() {
		@Pc(15) float local15 = this.aFloat44 * (float) -this.anInt2547 / (float) this.anInt2536;
		@Pc(27) float local27 = (float) -this.anInt2543 * this.aFloat44 / (float) this.anInt2533;
		@Pc(42) float local42 = this.aFloat44 * (float) (this.anInt2397 - this.anInt2547) / (float) this.anInt2536;
		@Pc(56) float local56 = this.aFloat44 * (float) (this.anInt2469 - this.anInt2543) / (float) this.anInt2533;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local27 != local56) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local56, (double) -local27, (double) this.anInt2526, (double) this.anInt2525);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(FB)V")
	public void method2040(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat44) {
			this.aFloat44 = arg0;
			if (this.anInt2546 == 3) {
				this.method2039();
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(Z)V")
	private void method2041() {
		if (this.aBoolean187 && this.anInt2540 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZILclient!jaclib/memory/Buffer;II)Lclient!hu;")
	public Interface12 method2042(@OriginalArg(2) Buffer arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return (Interface12) (this.aBoolean180 ? new Class251_Sub2(this, arg2, arg0, arg1, false) : new Class153_Sub2(this, arg2, arg0));
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)V")
	public synchronized void method2043(@OriginalArg(1) int arg0) {
		@Pc(15) Class2 local15 = new Class2();
		local15.aLong280 = arg0;
		this.aClass109_22.method2323(local15);
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "()Z")
	@Override
	public boolean method6932() {
		return true;
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(II)Lclient!mp;")
	@Override
	public Interface18 method6983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "(I)V")
	private void method2044() {
		Static85.aFloatArray33[3] = 1.0F;
		Static85.aFloatArray33[1] = this.aFloat32 * this.aFloat36;
		Static85.aFloatArray33[2] = this.aFloat35 * this.aFloat36;
		Static85.aFloatArray33[0] = this.aFloat30 * this.aFloat36;
		OpenGL.glLightModelfv(2899, Static85.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!ep", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2536 = arg2;
		this.anInt2533 = arg3;
		this.anInt2547 = arg0;
		this.anInt2543 = arg1;
		this.method2049();
		this.method2112();
		if (this.anInt2546 == 3) {
			this.method2039();
		} else if (this.anInt2546 == 2) {
			this.method2079();
			return;
		}
	}

	@OriginalMember(owner = "client!ep", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt2560;
		this.anInt2560 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "(I)V")
	private void method2045() {
		if (this.anInt2554 <= this.anInt2535 && this.anInt2534 >= this.anInt2532) {
			OpenGL.glScissor(this.anInt2554 + this.anInt2527, -this.anInt2534 + this.anInt2469 + this.anInt2530, this.anInt2535 - this.anInt2554, -this.anInt2532 + this.anInt2534);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "()V")
	@Override
	public void method6986() {
		if (!this.aBoolean186 || this.anInt2397 <= 0 || this.anInt2469 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt2554;
		@Pc(19) int local19 = this.anInt2535;
		@Pc(22) int local22 = this.anInt2532;
		@Pc(25) int local25 = this.anInt2534;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method2056();
		this.method2074(false);
		this.method2099(false);
		this.method2102(false);
		this.method2096(false);
		this.method2077(null);
		this.method2053(-2);
		this.method2106(1);
		this.method2062(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt2397, this.anInt2469, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
	private void method2046() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL1.a()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static444.method6061(1000L);
		}
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(Z)V")
	private void method2047() {
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.anInt2531; local13++) {
			@Pc(20) Class2_Sub24 local20 = this.aClass2_Sub24Array11[local13];
			@Pc(24) int local24 = local13 + 16386;
			Static547.aFloatArray78[0] = local20.method6299();
			Static547.aFloatArray78[1] = local20.method6308();
			Static547.aFloatArray78[2] = local20.method6301();
			Static547.aFloatArray78[3] = 1.0F;
			OpenGL.glLightfv(local24, 4611, Static547.aFloatArray78, 0);
			@Pc(58) int local58 = local20.method6305();
			@Pc(64) float local64 = local20.method6307() / 255.0F;
			Static547.aFloatArray78[1] = local64 * (float) (local58 >> 8 & 0xFF);
			Static547.aFloatArray78[2] = local64 * (float) (local58 & 0xFF);
			Static547.aFloatArray78[0] = local64 * (float) (local58 >> 16 & 0xFF);
			OpenGL.glLightfv(local24, 4609, Static547.aFloatArray78, 0);
			OpenGL.glLightf(local24, 4617, 1.0F / (float) (local20.method6302() * local20.method6302()));
			OpenGL.glEnable(local24);
		}
		while (local13 < this.anInt2552) {
			OpenGL.glDisable(local13 + 16386);
			local13++;
		}
		this.anInt2552 = this.anInt2531;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!oq;[Lclient!tba;Z)Lclient!da;")
	@Override
	public Class62 method6956(@OriginalArg(0) Class256 arg0, @OriginalArg(1) Class329[] arg1) {
		return new Class62_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "()Z")
	@Override
	public boolean method6926() {
		return true;
	}

	@OriginalMember(owner = "client!ep", name = "A", descriptor = "()V")
	@Override
	public void method7011() {
		if (this.aClass2_Sub15_Sub1_1 != null && this.aClass2_Sub15_Sub1_1.method7781()) {
			this.aClass190_1.method4019(this.aClass2_Sub15_Sub1_1);
			this.aClass144_1.method3028();
		}
	}

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "()Lclient!uha;")
	@Override
	public Class177 method6967() {
		return this.aClass177_Sub3_1;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V")
	private void method2048() {
		this.aFloat43 = (float) (this.anInt2525 - this.anInt2541) - this.aFloat38;
		this.aFloat41 = this.aFloat43 - this.aFloat27 * (float) this.anInt2540;
		if (this.aFloat41 < (float) this.anInt2526) {
			this.aFloat41 = this.anInt2526;
		}
		OpenGL.glFogf(2915, this.aFloat41);
		OpenGL.glFogf(2916, this.aFloat43);
		Static85.aFloatArray33[1] = (float) (this.anInt2539 & 0xFF00) / 65280.0F;
		Static85.aFloatArray33[2] = (float) (this.anInt2539 & 0xFF) / 255.0F;
		Static85.aFloatArray33[0] = (float) (this.anInt2539 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static85.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!ep", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method2096(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "(I)V")
	private void method2049() {
		@Pc(6) float[] local6 = this.aFloatArray8;
		@Pc(24) float local24 = (float) (this.anInt2526 * -this.anInt2547) / (float) this.anInt2536;
		@Pc(38) float local38 = (float) ((this.anInt2397 - this.anInt2547) * this.anInt2526) / (float) this.anInt2536;
		@Pc(49) float local49 = (float) (this.anInt2526 * this.anInt2543) / (float) this.anInt2533;
		@Pc(64) float local64 = (float) (this.anInt2526 * (this.anInt2543 - this.anInt2469)) / (float) this.anInt2533;
		if (local38 == local24 || local64 == local49) {
			local6[10] = 1.0F;
			local6[1] = 0.0F;
			local6[11] = 0.0F;
			local6[8] = 0.0F;
			local6[9] = 0.0F;
			local6[14] = 0.0F;
			local6[7] = 0.0F;
			local6[2] = 0.0F;
			local6[6] = 0.0F;
			local6[4] = 0.0F;
			local6[12] = 0.0F;
			local6[0] = 1.0F;
			local6[13] = 0.0F;
			local6[5] = 1.0F;
			local6[3] = 0.0F;
			local6[15] = 1.0F;
		} else {
			@Pc(78) float local78 = (float) this.anInt2526 * 2.0F;
			local6[3] = 0.0F;
			local6[12] = 0.0F;
			local6[7] = 0.0F;
			local6[13] = 0.0F;
			local6[5] = local78 / (local49 - local64);
			local6[10] = this.aFloat34 = (float) -(this.anInt2526 + this.anInt2525) / (float) (this.anInt2525 - this.anInt2526);
			local6[9] = (local64 + local49) / (-local64 + local49);
			local6[6] = 0.0F;
			local6[4] = 0.0F;
			local6[1] = 0.0F;
			local6[8] = (local38 + local24) / (local38 - local24);
			local6[11] = -1.0F;
			local6[0] = local78 / (local38 - local24);
			local6[15] = 0.0F;
			local6[2] = 0.0F;
			local6[14] = this.aFloat33 = -((float) this.anInt2525 * local78) / (float) (this.anInt2525 - this.anInt2526);
		}
		this.method2119();
	}

	@OriginalMember(owner = "client!ep", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2534 > arg3) {
			this.anInt2534 = arg3;
		}
		if (arg2 < this.anInt2535) {
			this.anInt2535 = arg2;
		}
		if (this.anInt2554 < arg0) {
			this.anInt2554 = arg0;
		}
		if (arg1 > this.anInt2532) {
			this.anInt2532 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method2112();
		this.method2045();
	}

	@OriginalMember(owner = "client!ep", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt2554 || this.anInt2535 < arg0 - arg2 || arg1 + arg2 < this.anInt2532 || this.anInt2534 < arg1 - arg2) {
			return;
		}
		this.method2082();
		this.method2062(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(68) float local68 = (float) arg0 + 0.35F;
		@Pc(73) float local73 = (float) arg1 + 0.35F;
		@Pc(77) int local77 = arg2 << 1;
		if ((float) local77 < this.aFloat37) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local68 + 1.0F, local73 + 1.0F);
			OpenGL.glVertex2f(local68 + 1.0F, -1.0F + local73);
			OpenGL.glVertex2f(local68 - 1.0F, -1.0F + local73);
			OpenGL.glVertex2f(local68 - 1.0F, local73 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat40 >= (float) local77) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local77);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local68, local73);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local68, local73);
			@Pc(132) int local132 = 262144 / (arg2 * 6);
			if (local132 <= 64) {
				local132 = 64;
			} else if (local132 > 512) {
				local132 = 512;
			}
			local132 = Static285.method3974(local132);
			OpenGL.glVertex2f(local68 + (float) arg2, local73);
			for (@Pc(161) int local161 = 16384 - local132; local161 > 0; local161 -= local132) {
				OpenGL.glVertex2f(local68 + Class2_Sub6_Sub21.aFloatArray32[local161] * (float) arg2, Class2_Sub6_Sub21.aFloatArray31[local161] * (float) arg2 + local73);
			}
			OpenGL.glVertex2f(local68 + (float) arg2, local73);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static38.method620(this, arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(II)V")
	@Override
	public void method6996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!ep", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Class65_Sub1_Sub1 local9 = local6.aClass65_Sub1_Sub1_2;
		this.method2093();
		this.method2077(local6.aClass65_Sub1_Sub1_2);
		this.method2062(1);
		this.method2105(7681, 8448);
		this.method2101(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat19 / (float) local9.anInt1699;
		@Pc(46) float local46 = local9.aFloat18 / (float) local9.anInt1700;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2554 - arg2), local46 * (float) (this.anInt2532 - arg3));
		OpenGL.glVertex2i(this.anInt2554, this.anInt2532);
		OpenGL.glTexCoord2f((float) (this.anInt2554 - arg2) * local39, local46 * (float) (this.anInt2534 - arg3));
		OpenGL.glVertex2i(this.anInt2554, this.anInt2534);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2535 - arg2), local46 * (float) (this.anInt2534 - arg3));
		OpenGL.glVertex2i(this.anInt2535, this.anInt2534);
		OpenGL.glTexCoord2f((float) (this.anInt2535 - arg2) * local39, local46 * (float) (this.anInt2532 - arg3));
		OpenGL.glVertex2i(this.anInt2535, this.anInt2532);
		OpenGL.glEnd();
		this.method2101(768, 5890, 0);
	}

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "(I)V")
	private void method2050() {
		this.aClass65Array1 = new Class65[this.anInt2549];
		this.aClass65_Sub1_1 = new Class65_Sub1(this, 3553, 6408, 1, 1);
		new Class65_Sub1(this, 3553, 6408, 1, 1);
		new Class65_Sub1(this, 3553, 6408, 1, 1);
		this.aClass182_Sub2_4 = new Class182_Sub2(this);
		this.aClass182_Sub2_1 = new Class182_Sub2(this);
		this.aClass182_Sub2_10 = new Class182_Sub2(this);
		this.aClass182_Sub2_2 = new Class182_Sub2(this);
		this.aClass182_Sub2_7 = new Class182_Sub2(this);
		this.aClass182_Sub2_3 = new Class182_Sub2(this);
		this.aClass182_Sub2_9 = new Class182_Sub2(this);
		this.aClass182_Sub2_8 = new Class182_Sub2(this);
		this.aClass182_Sub2_6 = new Class182_Sub2(this);
		this.aClass182_Sub2_5 = new Class182_Sub2(this);
		if (this.aBoolean184) {
			this.aClass333_2 = new Class333(this);
			new Class333(this);
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7002(@OriginalArg(0) Canvas arg0) {
		this.aLong69 = 0L;
		this.aCanvas1 = null;
		if (arg0 == null || this.aCanvas2 == arg0) {
			this.aLong69 = this.aLong70;
			this.aCanvas1 = this.aCanvas2;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable1.get(arg0);
			this.aLong69 = local36;
			this.aCanvas1 = arg0;
		}
		if (this.aCanvas1 == null || this.aLong69 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong69);
		this.method2087();
	}

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "()V")
	@Override
	public void method6976() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(IIZ)V")
	public void method2051(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method2100(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!ep", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 > this.anInt2469) {
			arg3 = this.anInt2469;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt2397) {
			arg2 = this.anInt2397;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt2534 = arg3;
		this.anInt2532 = arg1;
		this.anInt2554 = arg0;
		this.anInt2535 = arg2;
		OpenGL.glEnable(3089);
		this.method2112();
		this.method2045();
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V")
	@Override
	public void method6935() {
	}

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "()Z")
	@Override
	public boolean method6993() {
		return true;
	}

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "()Z")
	@Override
	public boolean method6962() {
		return true;
	}

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "(II)I")
	@Override
	public int method7005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "(Z)Lclient!rh;")
	public Class65_Sub4 method2052() {
		return this.aClass12_Sub2_1 == null ? null : this.aClass12_Sub2_1.method8326();
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(BI)V")
	public void method2053(@OriginalArg(1) int arg0) {
		this.method2051(arg0, true);
	}

	@OriginalMember(owner = "client!ep", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt2515 = 0;
		while (arg0 > 1) {
			this.anInt2515++;
			arg0 >>= 0x1;
		}
		this.anInt2514 = 0x1 << this.anInt2515;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)I")
	@Override
	public int method6963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[Lclient!kb;)V")
	@Override
	public void method7004(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub24[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass2_Sub24Array11[local3] = arg1[local3];
		}
		this.anInt2531 = arg0;
		if (this.anInt2546 != 1) {
			this.method2047();
		}
	}

	@OriginalMember(owner = "client!ep", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt2547, this.anInt2543, this.anInt2536, this.anInt2533 };
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass190_1.method4020(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "(I)V")
	public void method2054() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray7, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray9, 0);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(FIFF)V")
	private void method2055(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean189) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean189 = true;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6927() {
		this.method2082();
		this.method2062(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "(I)V")
	public void method2056() {
		if (this.anInt2546 != 0) {
			this.anInt2546 = 0;
			this.anInt2523 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!ev;I)V")
	@Override
	public void method6977(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1) {
		this.aClass354_1.method8015(arg1, this, arg0);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIZ)Lclient!cw;")
	@Override
	public Class61 method6952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class61_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!vi;)V")
	public void method2057(@OriginalArg(1) Interface26 arg0) {
		if (arg0 != this.anInterface26_1) {
			if (this.aBoolean180) {
				OpenGL.glBindBufferARB(34963, arg0.method5674());
			}
			this.anInterface26_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(49) float local49;
		if (this.aClass65_Sub1_Sub1_1 == null || arg2 > this.aClass65_Sub1_Sub1_1.anInt1694 || arg3 > this.aClass65_Sub1_Sub1_1.anInt1686) {
			this.aClass65_Sub1_Sub1_1 = Static572.method7835(arg6, this, arg2, arg3);
			this.aClass65_Sub1_Sub1_1.method1424(false, false);
			local45 = this.aClass65_Sub1_Sub1_1.aFloat18;
			local49 = this.aClass65_Sub1_Sub1_1.aFloat19;
		} else {
			this.aClass65_Sub1_Sub1_1.method1426(false, arg6, arg2, arg3, 6406);
			local45 = this.aClass65_Sub1_Sub1_1.aFloat18 * (float) arg3 / (float) this.aClass65_Sub1_Sub1_1.anInt1686;
			local49 = this.aClass65_Sub1_Sub1_1.aFloat19 * (float) arg2 / (float) this.aClass65_Sub1_Sub1_1.anInt1694;
		}
		this.method2093();
		this.method2077(this.aClass65_Sub1_Sub1_1);
		this.method2062(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2109(arg5);
		this.method2105(34165, 34165);
		this.method2101(768, 34166, 0);
		this.method2101(770, 5890, 2);
		this.method2095(0, 34166);
		this.method2095(2, 5890);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = local151 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(166) float local166 = (float) arg3 + local154;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local49);
		OpenGL.glVertex2f(local151, local166);
		OpenGL.glTexCoord2f(local45, local49);
		OpenGL.glVertex2f(local159, local166);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method2101(768, 5890, 0);
		this.method2101(770, 34166, 2);
		this.method2095(0, 5890);
		this.method2095(2, 34166);
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(B)V")
	private void method2058() {
		this.anOpenGL1.b();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
	@Override
	public void method6988(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "(I)V")
	private void method2059() {
		if (this.anInt2546 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt2397 > 0 && this.anInt2469 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt2397, (double) this.anInt2469, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt2546 = 1;
		this.anInt2523 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "(I)V")
	public void method2060() {
		if (this.anInt2523 == 8) {
			return;
		}
		this.method2083();
		this.method2074(true);
		this.method2102(true);
		this.method2096(true);
		this.method2062(1);
		this.anInt2523 = 8;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIZ)Lclient!cw;")
	@Override
	public Class61 method6972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class61_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IJ)V")
	public synchronized void method2061(@OriginalArg(1) long arg0) {
		@Pc(13) Class2 local13 = new Class2();
		local13.aLong280 = arg0;
		this.bf.method2323(local13);
	}

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "(II)V")
	public void method2062(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt2522) {
			return;
		}
		@Pc(16) boolean local16;
		@Pc(20) byte local20;
		if (arg0 == 1) {
			local16 = true;
			local20 = 1;
		} else if (arg0 == 2) {
			local16 = false;
			local20 = 2;
		} else if (arg0 == 128) {
			local20 = 3;
			local16 = true;
		} else {
			local20 = 0;
			local16 = false;
		}
		if (!this.aBoolean171) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean171 = true;
		}
		if (this.aBoolean169 != local16) {
			if (local16) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean169 = local16;
		}
		if (local20 != this.anInt2524) {
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
			this.anInt2524 = local20;
		}
		this.anInt2523 &= 0xFFFFFFE3;
		this.anInt2522 = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!ev;)V")
	@Override
	public void method6960(@OriginalArg(0) Class98 arg0) {
		this.aClass354_1.method8015(-1, this, arg0);
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!ep", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg1 * this.aClass177_Sub3_3.aFloat204 + (float) arg0 * this.aClass177_Sub3_3.aFloat203 + (float) arg2 * this.aClass177_Sub3_3.aFloat201 + this.aClass177_Sub3_3.aFloat202;
		if ((float) this.anInt2526 > local28 || local28 > (float) this.anInt2525) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt2536 * (this.aClass177_Sub3_3.aFloat199 * (float) arg2 + this.aClass177_Sub3_3.aFloat197 * (float) arg0 + this.aClass177_Sub3_3.aFloat195 * (float) arg1 + this.aClass177_Sub3_3.aFloat200) / local28);
		@Pc(117) int local117 = (int) ((this.aClass177_Sub3_3.aFloat206 + this.aClass177_Sub3_3.aFloat198 * (float) arg0 + (float) arg1 * this.aClass177_Sub3_3.aFloat205 + this.aClass177_Sub3_3.aFloat196 * (float) arg2) * (float) this.anInt2533 / local28);
		if ((float) local85 >= this.aFloat29 && (float) local85 <= this.aFloat31 && (float) local117 >= this.aFloat26 && this.aFloat39 >= (float) local117) {
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat26);
			arg3[0] = (int) ((float) local85 - this.aFloat29);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ep", name = "u", descriptor = "()I")
	@Override
	public int method6994() {
		return 4;
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(B)V")
	public void method2063() {
		if (this.anInt2523 == 16) {
			return;
		}
		this.method2089();
		this.method2074(true);
		this.method2102(true);
		this.method2096(true);
		this.method2062(1);
		this.anInt2523 = 16;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!tba;Z)Lclient!cw;")
	@Override
	public Class61 method6980(@OriginalArg(0) Class329 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt8813 * arg0.anInt8812];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray100 == null) {
			for (local21 = 0; local21 < arg0.anInt8812; local21++) {
				for (local25 = 0; local25 < arg0.anInt8813; local25++) {
					@Pc(83) int local83 = arg0.anIntArray597[arg0.aByteArray101[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt8812; local21++) {
				for (local25 = 0; local25 < arg0.anInt8813; local25++) {
					local12[local16++] = arg0.aByteArray100[local14] << 24 | arg0.anIntArray597[arg0.aByteArray101[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(120) Class61 local120 = this.method6953(local12, arg0.anInt8813, arg0.anInt8813, arg0.anInt8812);
		local120.method6436(arg0.anInt8816, arg0.anInt8814, arg0.anInt8815, arg0.anInt8811);
		return local120;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "([I)V")
	@Override
	public void method6969(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2397;
		arg0[1] = this.anInt2469;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(III)V")
	public synchronized void method2064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub30 local8 = new Class2_Sub30(arg1);
		local8.aLong280 = arg0;
		this.aClass109_18.method2323(local8);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6957(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static42.aFloat113 = arg2;
		Static185.aFloat51 = arg0;
		Static436.aFloat142 = arg1;
	}

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "(I)V")
	private void method2066() {
		if (this.aBoolean197 && !this.aBoolean190) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "()Z")
	@Override
	public boolean method6946() {
		if (this.aClass2_Sub15_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub15_Sub1_1.method7781()) {
			if (!this.aClass190_1.method4021(this.aClass2_Sub15_Sub1_1)) {
				return false;
			}
			this.aClass144_1.method3028();
		}
		return true;
	}

	@OriginalMember(owner = "client!ep", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.aClass177_Sub3_3.aFloat201 + this.aClass177_Sub3_3.aFloat204 * (float) arg1 + (float) arg0 * this.aClass177_Sub3_3.aFloat203 + this.aClass177_Sub3_3.aFloat202;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((this.aClass177_Sub3_3.aFloat197 * (float) arg0 + this.aClass177_Sub3_3.aFloat195 * (float) arg1 + this.aClass177_Sub3_3.aFloat199 * (float) arg2 + this.aClass177_Sub3_3.aFloat200) * (float) this.anInt2536 / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat29);
		@Pc(118) int local118 = (int) ((float) this.anInt2533 * (this.aClass177_Sub3_3.aFloat206 + (float) arg2 * this.aClass177_Sub3_3.aFloat196 + (float) arg0 * this.aClass177_Sub3_3.aFloat198 + (float) arg1 * this.aClass177_Sub3_3.aFloat205) / local28);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local118 - this.aFloat26);
	}

	@OriginalMember(owner = "client!ep", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat36 != arg0) {
			this.aFloat36 = arg0;
			this.method2044();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!cg;B)V")
	public void method2067(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt2518 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2518 >= 0) {
			this.anInterface3Array3[this.anInt2518].method7477();
		}
		this.anInterface3_2 = this.anInterface3Array3[++this.anInt2518] = arg0;
		this.anInterface3_2.method7476();
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(IIIIII)Lclient!cd;")
	@Override
	public Class12 method6954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean183 ? new Class12_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "()V")
	@Override
	protected void method6966() {
		for (@Pc(10) Class2 local10 = this.aClass109_16.method2325(); local10 != null; local10 = this.aClass109_16.method2318()) {
			((Class2_Sub31_Sub2) local10).method7666();
		}
		if (this.aClass190_1 != null) {
			this.aClass190_1.method4024();
		}
		if (this.anOpenGL1 != null) {
			this.method2058();
			@Pc(40) Enumeration local40 = this.aHashtable1.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable1.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean168) {
			Static621.method8309(true, false);
			this.aBoolean168 = false;
		}
	}

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "()Lclient!uha;")
	@Override
	public Class177 method6979() {
		return this.aClass177_Sub3_3;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!cd;)V")
	@Override
	public void method6939(@OriginalArg(0) Class12 arg0) {
		this.aClass12_Sub2_1 = (Class12_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6984(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas2 == arg0) {
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

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "(B)I")
	private int method2068() {
		this.aString21 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(20) int local20 = 0;
		this.aString22 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString21.indexOf("microsoft") != -1) {
			local20 = 1;
		}
		if (this.aString21.indexOf("brian paul") != -1 || this.aString21.indexOf("mesa") != -1) {
			local20 |= 0x1;
		}
		@Pc(55) String local55 = OpenGL.glGetString(7938);
		@Pc(63) String[] local63 = Static17.method249(local55.replace('.', ' '), ' ');
		if (local63.length < 2) {
			local20 |= 0x4;
		} else {
			try {
				@Pc(83) int local83 = Static445.method6066(local63[0]);
				@Pc(89) int local89 = Static445.method6066(local63[1]);
				this.anInt2538 = local83 * 10 + local89;
			} catch (@Pc(98) NumberFormatException local98) {
				local20 |= 0x4;
			}
		}
		if (this.anInt2538 < 12) {
			local20 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local20 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local20 |= 0x20;
		}
		@Pc(134) int[] local134 = new int[1];
		OpenGL.glGetIntegerv(34018, local134, 0);
		this.anInt2549 = local134[0];
		OpenGL.glGetIntegerv(34929, local134, 0);
		this.anInt2555 = local134[0];
		OpenGL.glGetIntegerv(34930, local134, 0);
		this.anInt2551 = local134[0];
		if (this.anInt2549 < 2 || this.anInt2555 < 2 || this.anInt2551 < 2) {
			local20 |= 0x10;
		}
		this.aBoolean174 = Stream.a();
		this.aBoolean191 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean180 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean196 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean192 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean198 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean179 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean182 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean176 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean183 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean185 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean173 = false;
		this.aBoolean184 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean181 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean194 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean188 = this.aBoolean194 & this.aBoolean181;
		OpenGL.glGetFloatv(2834, Static85.aFloatArray33, 0);
		this.aFloat40 = Static85.aFloatArray33[1];
		this.aFloat37 = Static85.aFloatArray33[0];
		return local20 == 0 ? 0 : local20;
	}

	@OriginalMember(owner = "client!ep", name = "u", descriptor = "(I)V")
	public void method2069() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "()Z")
	@Override
	public boolean method6945() {
		return false;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)Lclient!hs;")
	@Override
	public Interface11 method6968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "()Lclient!uha;")
	@Override
	public Class177 method7001() {
		return new Class177_Sub3();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLclient!cg;)V")
	public void method2070(@OriginalArg(1) Interface3 arg0) {
		if (this.aBoolean181) {
			this.method2080(arg0);
			this.method2075(arg0);
		} else if (this.anInt2517 >= 0 && arg0 == this.anInterface3Array2[this.anInt2517]) {
			this.anInterface3Array2[this.anInt2517--] = null;
			arg0.method7473();
			if (this.anInt2517 < 0) {
				this.anInterface3_2 = this.anInterface3_1 = null;
			} else {
				this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array2[this.anInt2517];
				this.anInterface3_2.method7474();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt2526 && arg1 == this.anInt2525) {
			return;
		}
		this.anInt2525 = arg1;
		this.anInt2526 = arg0;
		this.method2049();
		this.method2048();
		if (this.anInt2546 == 3) {
			this.method2039();
		} else if (this.anInt2546 == 2) {
			this.method2079();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZ[BII)Lclient!hu;")
	public Interface12 method2071(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		return (Interface12) (this.aBoolean180 && (!arg1 || this.aBoolean178) ? new Class251_Sub2(this, arg3, arg2, arg0, arg1) : new Class153_Sub2(this, arg3, arg2, arg0));
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6925(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class2_Sub30 local19;
		while (!this.aClass109_18.method2328()) {
			local19 = (Class2_Sub30) this.aClass109_18.method2322();
			Static87.anIntArray126[local7++] = (int) local19.aLong280;
			this.anInt2520 -= local19.anInt5508;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static87.anIntArray126, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static87.anIntArray126, 0);
			local7 = 0;
		}
		while (!this.aClass109_19.method2328()) {
			local19 = (Class2_Sub30) this.aClass109_19.method2322();
			Static87.anIntArray126[local7++] = (int) local19.aLong280;
			this.anInt2519 -= local19.anInt5508;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static87.anIntArray126, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static87.anIntArray126, 0);
			local7 = 0;
		}
		while (!this.aClass109_20.method2328()) {
			local19 = (Class2_Sub30) this.aClass109_20.method2322();
			Static87.anIntArray126[local7++] = local19.anInt5508;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static87.anIntArray126, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static87.anIntArray126, 0);
			local7 = 0;
		}
		while (!this.aClass109_21.method2328()) {
			local19 = (Class2_Sub30) this.aClass109_21.method2322();
			Static87.anIntArray126[local7++] = (int) local19.aLong280;
			this.anInt2521 -= local19.anInt5508;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static87.anIntArray126, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static87.anIntArray126, 0);
		}
		while (!this.aClass109_17.method2328()) {
			local19 = (Class2_Sub30) this.aClass109_17.method2322();
			OpenGL.glDeleteLists((int) local19.aLong280, local19.anInt5508);
		}
		@Pc(216) Class2 local216;
		while (!this.aClass109_22.method2328()) {
			local216 = this.aClass109_22.method2322();
			OpenGL.glDeleteProgramARB((int) local216.aLong280);
		}
		while (!this.bf.method2328()) {
			local216 = this.bf.method2322();
			OpenGL.glDeleteObjectARB(local216.aLong280);
		}
		while (!this.aClass109_17.method2328()) {
			local19 = (Class2_Sub30) this.aClass109_17.method2322();
			OpenGL.glDeleteLists((int) local19.aLong280, local19.anInt5508);
		}
		this.aClass144_1.method3029();
		if (this.E() > 100663296 && this.aLong71 + 60000L < Static476.method6413()) {
			System.gc();
			this.aLong71 = Static476.method6413();
		}
		this.anInt2513 = local11;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IBI)V")
	public synchronized void method2072(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub30 local12 = new Class2_Sub30(arg0);
		local12.aLong280 = arg1;
		this.aClass109_21.method2323(local12);
	}

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "(Z)V")
	public void method2073() {
		if (this.anInt2523 == 4) {
			return;
		}
		this.method2059();
		this.method2074(false);
		this.method2099(false);
		this.method2102(false);
		this.method2096(false);
		this.method2053(-2);
		this.method2062(1);
		this.anInt2523 = 4;
	}

	@OriginalMember(owner = "client!ep", name = "z", descriptor = "()Lclient!gba;")
	@Override
	public Class117 method7008() {
		@Pc(7) int local7 = -1;
		if (this.aString21.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString21.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString21.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class117(local7, "OpenGL", this.anInt2538, this.aString22, 0L);
	}

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)V")
	@Override
	public void method6971(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ep", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean175 = arg0;
		this.method2097();
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(Z)V")
	@Override
	public void method7006(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!cd;Lclient!cd;FLclient!cd;)Lclient!cd;")
	@Override
	public Class12 method6974(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class12 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean183 && this.aBoolean184) {
			@Pc(15) Class12_Sub2_Sub2 local15 = null;
			@Pc(18) Class12_Sub2 local18 = (Class12_Sub2) arg0;
			@Pc(21) Class12_Sub2 local21 = (Class12_Sub2) arg1;
			@Pc(25) Class65_Sub4 local25 = local18.method8326();
			@Pc(29) Class65_Sub4 local29 = local21.method8326();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local25.anInt8066 <= local29.anInt8066 ? local29.anInt8066 : local25.anInt8066;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class12_Sub2_Sub2) {
					@Pc(56) Class12_Sub2_Sub2 local56 = (Class12_Sub2_Sub2) arg3;
					if (local44 == local56.method8330()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class12_Sub2_Sub2(this, local44);
				}
				if (local15.method8329(local25, local29, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(ZI)V")
	public void method2074(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean187 != arg0) {
			this.aBoolean187 = arg0;
			this.method2041();
			this.anInt2523 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2542 = arg0;
		this.anInt2544 = arg3;
		this.aBoolean195 = true;
		this.anInt2537 = arg1;
		this.anInt2557 = arg2;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(Lclient!cg;B)V")
	public void method2075(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt2516 < 0 || this.anInterface3Array1[this.anInt2516] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface3Array1[this.anInt2516--] = null;
		arg0.method7478();
		if (this.anInt2516 < 0) {
			this.anInterface3_1 = null;
		} else {
			this.anInterface3_1 = this.anInterface3Array1[this.anInt2516];
			this.anInterface3_1.method7475();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!uj;B)V")
	public void method2076(@OriginalArg(0) Class177_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method7889(), 0);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!hl;I)V")
	public void method2077(@OriginalArg(0) Class65 arg0) {
		@Pc(11) Class65 local11 = this.aClass65Array1[this.anInt2556];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt8058);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt8058);
				} else if (arg0.anInt8058 != local11.anInt8058) {
					OpenGL.glDisable(local11.anInt8058);
					OpenGL.glEnable(arg0.anInt8058);
				}
				OpenGL.glBindTexture(arg0.anInt8058, arg0.method6833());
			}
			this.aClass65Array1[this.anInt2556] = arg0;
		}
		this.anInt2523 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(FFFIF)V")
	public void method2078(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static85.aFloatArray33[3] = arg3;
		Static85.aFloatArray33[0] = arg1;
		Static85.aFloatArray33[1] = arg0;
		Static85.aFloatArray33[2] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static85.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass177_Sub3_3.aFloat204 * (float) arg1 + this.aClass177_Sub3_3.aFloat203 * (float) arg0 + (float) arg2 * this.aClass177_Sub3_3.aFloat201 + this.aClass177_Sub3_3.aFloat202;
		@Pc(55) float local55 = this.aClass177_Sub3_3.aFloat202 + this.aClass177_Sub3_3.aFloat201 * (float) arg5 + (float) arg4 * this.aClass177_Sub3_3.aFloat204 + (float) arg3 * this.aClass177_Sub3_3.aFloat203;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt2526 && (float) this.anInt2526 > local55) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt2525 && local55 > (float) this.anInt2525) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass177_Sub3_3.aFloat200 + this.aClass177_Sub3_3.aFloat199 * (float) arg2 + this.aClass177_Sub3_3.aFloat197 * (float) arg0 + this.aClass177_Sub3_3.aFloat195 * (float) arg1) * (float) this.anInt2536 / (float) arg6);
		@Pc(157) int local157 = (int) ((this.aClass177_Sub3_3.aFloat195 * (float) arg4 + (float) arg3 * this.aClass177_Sub3_3.aFloat197 + (float) arg5 * this.aClass177_Sub3_3.aFloat199 + this.aClass177_Sub3_3.aFloat200) * (float) this.anInt2536 / (float) arg6);
		if (this.aFloat29 > (float) local124 && this.aFloat29 > (float) local157) {
			local57 |= 0x1;
		} else if (this.aFloat31 < (float) local124 && this.aFloat31 < (float) local157) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt2533 * (this.aClass177_Sub3_3.aFloat196 * (float) arg2 + (float) arg1 * this.aClass177_Sub3_3.aFloat205 + this.aClass177_Sub3_3.aFloat198 * (float) arg0 + this.aClass177_Sub3_3.aFloat206) / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass177_Sub3_3.aFloat206 + (float) arg3 * this.aClass177_Sub3_3.aFloat198 + this.aClass177_Sub3_3.aFloat205 * (float) arg4 + (float) arg5 * this.aClass177_Sub3_3.aFloat196) * (float) this.anInt2533 / (float) arg6);
		if (this.aFloat26 > (float) local224 && this.aFloat26 > (float) local257) {
			local57 |= 0x4;
		} else if (this.aFloat39 < (float) local224 && (float) local257 > this.aFloat39) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "()Z")
	@Override
	public boolean method6992() {
		return true;
	}

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "(B)V")
	private void method2079() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray8, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!cg;I)V")
	public void method2080(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt2518 < 0 || this.anInterface3Array3[this.anInt2518] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface3Array3[this.anInt2518--] = null;
		arg0.method7477();
		if (this.anInt2518 >= 0) {
			this.anInterface3_2 = this.anInterface3Array3[this.anInt2518];
			this.anInterface3_2.method7476();
		} else {
			this.anInterface3_2 = null;
		}
	}

	@OriginalMember(owner = "client!ep", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt2525;
	}

	@OriginalMember(owner = "client!ep", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt2529 != arg0;
		if (local11 || this.aFloat25 != arg1 || this.aFloat28 != arg2) {
			this.aFloat25 = arg1;
			this.anInt2529 = arg0;
			this.aFloat28 = arg2;
			if (local11) {
				this.aFloat30 = (float) (this.anInt2529 & 0xFF0000) / 1.671168E7F;
				this.aFloat35 = (float) (this.anInt2529 & 0xFF) / 255.0F;
				this.aFloat32 = (float) (this.anInt2529 & 0xFF00) / 65280.0F;
				this.method2044();
			}
			this.method2092();
		}
		if (this.aFloatArray10[0] == arg3 && this.aFloatArray10[1] == arg4 && this.aFloatArray10[2] == arg5) {
			return;
		}
		this.aFloatArray10[0] = arg3;
		this.aFloatArray10[2] = arg5;
		this.aFloatArray10[1] = arg4;
		this.aFloatArray11[1] = -arg4;
		this.aFloatArray11[2] = -arg5;
		this.aFloatArray11[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray7[1] = arg4 * local138;
		this.aFloatArray7[0] = arg3 * local138;
		this.aFloatArray7[2] = arg5 * local138;
		this.aFloatArray9[1] = -this.aFloatArray7[1];
		this.aFloatArray9[2] = -this.aFloatArray7[2];
		this.aFloatArray9[0] = -this.aFloatArray7[0];
		this.method2054();
		this.anInt2548 = (int) (arg5 * 256.0F / arg4);
		this.anInt2558 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ep", name = "v", descriptor = "()Z")
	@Override
	public boolean method6995() {
		return this.aBoolean196 && (!this.method6951() || this.aBoolean188);
	}

	@OriginalMember(owner = "client!ep", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt2535;
		arg0[1] = this.anInt2532;
		arg0[3] = this.anInt2534;
		arg0[0] = this.anInt2554;
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(ZI)V")
	public void method2081(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean190 != arg0) {
			this.aBoolean190 = arg0;
			this.method2066();
		}
	}

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "(B)V")
	private void method2082() {
		if (this.anInt2523 == 1) {
			return;
		}
		this.method2059();
		this.method2074(false);
		this.method2099(false);
		this.method2102(false);
		this.method2096(false);
		this.method2077(null);
		this.method2053(-2);
		this.method2106(1);
		this.anInt2523 = 1;
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method2082();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method2062(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean196) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean196) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "(Z)V")
	private void method2083() {
		if (this.anInt2546 != 2) {
			this.anInt2546 = 2;
			this.method2079();
			this.method2110();
			this.anInt2523 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2082();
		this.method2062(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(24) float local24 = (float) -arg1 + (float) arg3;
		if (local17 == 0.0F && local24 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(49) float local49 = (float) (1.0D / Math.sqrt((double) (local24 * local24 + local17 * local17)));
			local24 *= local49;
			local17 *= local49;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local17 + (float) arg2 + 0.35F, local24 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(FFI)V")
	public void method2084(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat27 = arg1;
		this.aFloat38 = arg0;
		this.method2048();
	}

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "()Z")
	@Override
	public boolean method6964() {
		return this.aClass265_1.method5705();
	}

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "(II)V")
	public synchronized void method2085(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub30 local8 = new Class2_Sub30(arg0);
		this.aClass109_20.method2323(local8);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!eca;ILclient!eca;Lclient!eca;Lclient!eca;)V")
	public void method2086(@OriginalArg(0) Class82 arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) Class82 arg2, @OriginalArg(4) Class82 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method2103(arg1.anInterface12_2);
			OpenGL.glVertexPointer(arg1.aByte30, arg1.aShort26, this.anInterface12_4.method7603(), this.anInterface12_4.method7602() + (long) arg1.aByte31);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method2103(arg3.anInterface12_2);
			OpenGL.glNormalPointer(arg3.aShort26, this.anInterface12_4.method7603(), this.anInterface12_4.method7602() + (long) arg3.aByte31);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method2103(arg0.anInterface12_2);
			OpenGL.glColorPointer(arg0.aByte30, arg0.aShort26, this.anInterface12_4.method7603(), this.anInterface12_4.method7602() + (long) arg0.aByte31);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method2103(arg2.anInterface12_2);
			OpenGL.glTexCoordPointer(arg2.aByte30, arg2.aShort26, this.anInterface12_4.method7603(), this.anInterface12_4.method7602() + (long) arg2.aByte31);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ep", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2082();
		this.method2062(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "()Z")
	@Override
	public boolean method6944() {
		return this.aClass2_Sub15_Sub1_1 != null && (this.anInt2512 <= 1 || this.aBoolean188);
	}

	@OriginalMember(owner = "client!ep", name = "v", descriptor = "(I)V")
	private void method2087() {
		if (this.aCanvas1 == null) {
			this.anInt2510 = this.anInt2443 = 0;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas1.getSize();
			this.anInt2443 = local6.height;
			this.anInt2510 = local6.width;
		}
		if (this.anInterface3_1 == null) {
			this.anInt2469 = this.anInt2443;
			this.anInt2397 = this.anInt2510;
			this.method2104();
		}
		this.method2056();
		this.la();
	}

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "(I)V")
	private void method2088() {
		if (this.aBoolean189) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean189 = false;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6987(@OriginalArg(0) Class2_Sub31 arg0) {
		this.aNativeHeap1 = ((Class2_Sub31_Sub2) arg0).aNativeHeap6;
		if (this.anInterface12_3 != null) {
			return;
		}
		@Pc(16) Class2_Sub22_Sub1 local16 = new Class2_Sub22_Sub1(80);
		if (this.aBoolean174) {
			local16.method3702(-1.0F);
			local16.method3702(-1.0F);
			local16.method3702(0.0F);
			local16.method3702(0.0F);
			local16.method3702(1.0F);
			local16.method3702(1.0F);
			local16.method3702(-1.0F);
			local16.method3702(0.0F);
			local16.method3702(1.0F);
			local16.method3702(1.0F);
			local16.method3702(1.0F);
			local16.method3702(1.0F);
			local16.method3702(0.0F);
			local16.method3702(1.0F);
			local16.method3702(0.0F);
			local16.method3702(-1.0F);
			local16.method3702(1.0F);
			local16.method3702(0.0F);
			local16.method3702(0.0F);
			local16.method3702(0.0F);
		} else {
			local16.method3701(-1.0F);
			local16.method3701(-1.0F);
			local16.method3701(0.0F);
			local16.method3701(0.0F);
			local16.method3701(1.0F);
			local16.method3701(1.0F);
			local16.method3701(-1.0F);
			local16.method3701(0.0F);
			local16.method3701(1.0F);
			local16.method3701(1.0F);
			local16.method3701(1.0F);
			local16.method3701(1.0F);
			local16.method3701(0.0F);
			local16.method3701(1.0F);
			local16.method3701(0.0F);
			local16.method3701(-1.0F);
			local16.method3701(1.0F);
			local16.method3701(0.0F);
			local16.method3701(0.0F);
			local16.method3701(0.0F);
		}
		this.anInterface12_3 = this.method2071(local16.anInt10247, false, local16.aByteArray115, 20);
		this.aClass82_5 = new Class82(this.anInterface12_3, 5126, 3, 0);
		this.aClass82_6 = new Class82(this.anInterface12_3, 5126, 2, 12);
		this.aClass354_1.method8020(this);
	}

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "(I)V")
	@Override
	public void method6981(@OriginalArg(0) int arg0) {
		this.method2058();
	}

	@OriginalMember(owner = "client!ep", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt2521 + this.anInt2519 + this.anInt2520;
	}

	@OriginalMember(owner = "client!ep", name = "y", descriptor = "()Z")
	@Override
	public boolean method7003() {
		return false;
	}

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "(I)V")
	private void method2089() {
		if (this.anInt2546 != 3) {
			this.anInt2546 = 3;
			this.method2039();
			this.method2110();
			this.anInt2523 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(Lclient!cg;B)V")
	public void method2090(@OriginalArg(0) Interface3 arg0) {
		if (this.aBoolean181) {
			this.method2067(arg0);
			this.method2091(arg0);
		} else if (this.anInt2517 < 3) {
			if (this.anInt2517 >= 0) {
				this.anInterface3Array2[this.anInt2517].method7473();
			}
			this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array2[++this.anInt2517] = arg0;
			this.anInterface3_2.method7474();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(Lclient!cg;I)V")
	public void method2091(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt2516 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2516 >= 0) {
			this.anInterface3Array1[this.anInt2516].method7478();
		}
		this.anInterface3_1 = this.anInterface3Array1[++this.anInt2516] = arg0;
		this.anInterface3_1.method7475();
	}

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "(B)V")
	private void method2092() {
		Static85.aFloatArray33[3] = 1.0F;
		Static85.aFloatArray33[1] = this.aFloat25 * this.aFloat32;
		Static85.aFloatArray33[2] = this.aFloat35 * this.aFloat25;
		Static85.aFloatArray33[0] = this.aFloat25 * this.aFloat30;
		OpenGL.glLightfv(16384, 4609, Static85.aFloatArray33, 0);
		Static85.aFloatArray33[2] = this.aFloat35 * -this.aFloat28;
		Static85.aFloatArray33[1] = -this.aFloat28 * this.aFloat32;
		Static85.aFloatArray33[3] = 1.0F;
		Static85.aFloatArray33[0] = -this.aFloat28 * this.aFloat30;
		OpenGL.glLightfv(16385, 4609, Static85.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "(B)V")
	public void method2093() {
		if (this.anInt2523 == 2) {
			return;
		}
		this.method2059();
		this.method2074(false);
		this.method2099(false);
		this.method2102(false);
		this.method2096(false);
		this.method2053(-2);
		this.anInt2523 = 2;
	}

	@OriginalMember(owner = "client!ep", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean195) {
			throw new RuntimeException("");
		}
		this.anInt2542 = arg0;
		this.anInt2557 = arg2;
		this.anInt2537 = arg1;
		this.anInt2544 = arg3;
		if (this.aBoolean177) {
			this.aClass265_1.aClass18_Sub5_1.method2446();
			this.aClass265_1.aClass18_Sub5_1.method2448();
		}
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(III)V")
	public synchronized void method2094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class2_Sub30 local13 = new Class2_Sub30(arg1);
		local13.aLong280 = arg0;
		this.aClass109_19.method2323(local13);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6937(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ep", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass177_Sub3_3.aFloat201 * (float) arg2 + this.aClass177_Sub3_3.aFloat204 * (float) arg1 + this.aClass177_Sub3_3.aFloat203 * (float) arg0 + this.aClass177_Sub3_3.aFloat202;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg3 * this.aClass177_Sub3_3.aFloat203 + this.aClass177_Sub3_3.aFloat204 * (float) arg4 + this.aClass177_Sub3_3.aFloat201 * (float) arg5 + this.aClass177_Sub3_3.aFloat202;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt2526 > local32 && local63 < (float) this.anInt2526) {
			local7 |= 0x10;
		} else if ((float) this.anInt2525 < local32 && local63 > (float) this.anInt2525) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass177_Sub3_3.aFloat200 + this.aClass177_Sub3_3.aFloat197 * (float) arg0 + this.aClass177_Sub3_3.aFloat195 * (float) arg1 + this.aClass177_Sub3_3.aFloat199 * (float) arg2) * (float) this.anInt2536 / local32);
		@Pc(167) int local167 = (int) (((float) arg4 * this.aClass177_Sub3_3.aFloat195 + (float) arg3 * this.aClass177_Sub3_3.aFloat197 + this.aClass177_Sub3_3.aFloat199 * (float) arg5 + this.aClass177_Sub3_3.aFloat200) * (float) this.anInt2536 / local63);
		if ((float) local135 < this.aFloat29 && (float) local167 < this.aFloat29) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat31 && (float) local167 > this.aFloat31) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass177_Sub3_3.aFloat206 + this.aClass177_Sub3_3.aFloat205 * (float) arg1 + (float) arg0 * this.aClass177_Sub3_3.aFloat198 + this.aClass177_Sub3_3.aFloat196 * (float) arg2) * (float) this.anInt2533 / local32);
		@Pc(265) int local265 = (int) ((this.aClass177_Sub3_3.aFloat206 + (float) arg3 * this.aClass177_Sub3_3.aFloat198 + this.aClass177_Sub3_3.aFloat205 * (float) arg4 + this.aClass177_Sub3_3.aFloat196 * (float) arg5) * (float) this.anInt2533 / local63);
		if ((float) local233 < this.aFloat26 && this.aFloat26 > (float) local265) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat39 && this.aFloat39 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIZI)V")
	public void method2095(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ep", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2082();
		this.method2062(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZ)V")
	public void method2096(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean172) {
			this.aBoolean172 = arg0;
			this.method2097();
			this.anInt2523 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "y", descriptor = "(I)V")
	private void method2097() {
		OpenGL.glDepthMask(this.aBoolean172 && this.aBoolean175);
	}

	@OriginalMember(owner = "client!ep", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method2082();
		this.method2062(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean196) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean196) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "()Z")
	@Override
	public boolean method6951() {
		return this.aClass2_Sub15_Sub1_1 != null && this.aClass2_Sub15_Sub1_1.method7781();
	}

	@OriginalMember(owner = "client!ep", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = (float) arg2 * this.aClass177_Sub3_3.aFloat201 + (float) arg0 * this.aClass177_Sub3_3.aFloat203 + this.aClass177_Sub3_3.aFloat204 * (float) arg1 + this.aClass177_Sub3_3.aFloat202;
		if (local28 < (float) this.anInt2526 || (float) this.anInt2525 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((float) this.anInt2536 * (this.aClass177_Sub3_3.aFloat200 + (float) arg1 * this.aClass177_Sub3_3.aFloat195 + (float) arg0 * this.aClass177_Sub3_3.aFloat197 + this.aClass177_Sub3_3.aFloat199 * (float) arg2) / (float) arg3);
		@Pc(119) int local119 = (int) ((float) this.anInt2533 * (this.aClass177_Sub3_3.aFloat196 * (float) arg2 + (float) arg0 * this.aClass177_Sub3_3.aFloat198 + this.aClass177_Sub3_3.aFloat205 * (float) arg1 + this.aClass177_Sub3_3.aFloat206) / (float) arg3);
		if ((float) local86 >= this.aFloat29 && this.aFloat31 >= (float) local86 && this.aFloat26 <= (float) local119 && (float) local119 <= this.aFloat39) {
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local119 - this.aFloat26);
			arg4[0] = (int) ((float) local86 - this.aFloat29);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)V")
	public void method2098(@OriginalArg(0) int arg0) {
		if (this.anInt2556 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt2556 = arg0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZB)V")
	public void method2099(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean197) {
			this.aBoolean197 = arg0;
			this.method2066();
			this.anInt2523 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ep", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt2534 = this.anInt2469;
		this.anInt2554 = 0;
		this.anInt2532 = 0;
		this.anInt2535 = this.anInt2397;
		OpenGL.glDisable(3089);
		this.method2112();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIZZ)V")
	public void method2100(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt2545 != arg0 || this.aBoolean195 != this.aBoolean177) {
			@Pc(18) Class65_Sub1 local18 = null;
			@Pc(20) int local20 = 0;
			@Pc(22) byte local22 = 0;
			@Pc(24) int local24 = 0;
			@Pc(31) int local31 = this.aBoolean195 ? 3 : 0;
			if (arg0 < 0) {
				this.method2088();
			} else {
				local18 = this.aClass144_1.method3027(arg0);
				@Pc(45) Class175 local45 = super.anInterface6_27.method1492(arg0);
				if (local45.aByte53 == 0 && local45.aByte54 == 0) {
					this.method2088();
				} else {
					@Pc(63) int local63 = local45.aBoolean309 ? 64 : 128;
					@Pc(67) int local67 = local63 * 50;
					this.method2055((float) (local45.aByte53 * (this.anInt2513 % local67)) / (float) local67, 0.0F, (float) (local45.aByte54 * (this.anInt2513 % local67)) / (float) local67);
				}
				local20 = local45.anInt4382;
				if (!this.aBoolean195) {
					local31 = local45.aByte52;
					local22 = local45.aByte56;
					local24 = local45.anInt4383;
				}
			}
			this.aClass265_1.method5708(local22, arg1, local31, local24, arg2);
			if (!this.aClass265_1.method5709(local18, local20)) {
				this.method2077(local18);
				this.method2106(local20);
			}
			this.anInt2545 = arg0;
			this.aBoolean177 = this.aBoolean195;
		}
		this.anInt2523 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ep", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean195 = false;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		this.method2082();
		this.method2062(1);
		@Pc(26) float local26 = (float) -arg0 + (float) arg2;
		@Pc(32) float local32 = (float) arg3 - (float) arg1;
		@Pc(45) float local45 = (float) (1.0D / Math.sqrt((double) (local26 * local26 + local32 * local32)));
		@Pc(51) int local51 = arg7 % (arg5 + arg6);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(70) float local70 = local32 * local45;
		@Pc(74) float local74 = local26 * local45;
		@Pc(79) float local79 = (float) arg5 * local74;
		@Pc(84) float local84 = local70 * (float) arg5;
		@Pc(86) float local86 = 0.0F;
		@Pc(88) float local88 = 0.0F;
		@Pc(90) float local90 = local79;
		@Pc(92) float local92 = local84;
		if (arg5 >= local51) {
			local92 = (float) (arg5 - local51) * local70;
			local90 = (float) (arg5 - local51) * local74;
		} else {
			local88 = (float) (arg6 + arg5 - local51) * local70;
			local86 = local74 * (float) (arg5 + arg6 - local51);
		}
		@Pc(142) float local142 = local86 + (float) arg0 + 0.35F;
		@Pc(149) float local149 = local88 + (float) arg1 + 0.35F;
		@Pc(154) float local154 = (float) arg6 * local74;
		@Pc(159) float local159 = local70 * (float) arg6;
		while (true) {
			if (arg0 >= arg2) {
				if (local142 < (float) arg2 + 0.35F) {
					break;
				}
				if (local90 + local142 < (float) arg2) {
					local90 = (float) arg2 - local142;
				}
			} else {
				if ((float) arg2 + 0.35F < local142) {
					break;
				}
				if ((float) arg2 < local90 + local142) {
					local90 = (float) arg2 - local142;
				}
			}
			if (arg3 > arg1) {
				if ((float) arg3 + 0.35F < local149) {
					break;
				}
				if (local92 + local149 > (float) arg3) {
					local92 = (float) arg3 - local149;
				}
			} else {
				if (local149 < (float) arg3 + 0.35F) {
					break;
				}
				if (local92 + local149 < (float) arg3) {
					local92 = (float) arg3 - local149;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local142, local149);
			OpenGL.glVertex2f(local142 + local90, local149 + local92);
			OpenGL.glEnd();
			local142 += local154 + local90;
			local149 += local92 + local159;
			local92 = local84;
			local90 = local79;
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(IIII)V")
	public void method2101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "()V")
	@Override
	public void method6933() {
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZZ)V")
	public void method2102(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean170 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean170 = arg0;
		this.anInt2523 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!hu;B)V")
	public void method2103(@OriginalArg(0) Interface12 arg0) {
		if (arg0 != this.anInterface12_4) {
			if (this.aBoolean180) {
				OpenGL.glBindBufferARB(34962, arg0.method7600());
			}
			this.anInterface12_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "z", descriptor = "(I)V")
	private void method2104() {
		OpenGL.glViewport(this.anInt2527, this.anInt2530, this.anInt2397, this.anInt2469);
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(III)V")
	public void method2105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2556 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(13) boolean local13 = false;
		if (this.anInt2553 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local13 = true;
			this.anInt2553 = arg0;
		}
		if (arg1 != this.anInt2528) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local13 = true;
			this.anInt2528 = arg1;
		}
		if (local13) {
			this.anInt2523 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6943(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6996(arg2, arg3);
	}

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "(II)V")
	public void method2106(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method2105(7681, 7681);
		} else if (arg0 == 0) {
			this.method2105(8448, 8448);
		} else if (arg0 == 2) {
			this.method2105(34165, 7681);
		} else if (arg0 == 3) {
			this.method2105(260, 8448);
			return;
		} else if (arg0 == 4) {
			this.method2105(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II[BIZ)Lclient!vi;")
	public Interface26 method2107(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) boolean arg2) {
		return (Interface26) (this.aBoolean180 && (!arg2 || this.aBoolean178) ? new Class251_Sub1(this, 5123, arg1, arg0, arg2) : new Class153_Sub1(this, 5123, arg1, arg0));
	}

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "(II)I")
	public int method2108(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6978(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(BI)V")
	public void method2109(@OriginalArg(1) int arg0) {
		Static85.aFloatArray33[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static85.aFloatArray33[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static85.aFloatArray33[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static85.aFloatArray33[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static85.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class76 method6934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class76_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "()V")
	@Override
	public void method6991() {
		this.aClass190_1.method4022();
	}

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "()Z")
	@Override
	public boolean method6958() {
		return true;
	}

	@OriginalMember(owner = "client!ep", name = "A", descriptor = "(I)V")
	private void method2110() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass177_Sub3_4.method7889(), 0);
		if (this.aBoolean177) {
			this.aClass265_1.aClass18_Sub5_1.method2446();
		}
		this.method2054();
		this.method2047();
	}

	@OriginalMember(owner = "client!ep", name = "B", descriptor = "(I)V")
	private void method2111() {
		this.method2053(-2);
		for (@Pc(14) int local14 = this.anInt2549 - 1; local14 >= 0; local14--) {
			this.method2098(local14);
			this.method2077(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method2105(8448, 8448);
		this.method2101(770, 34168, 2);
		this.method2088();
		this.anInt2522 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt2524 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean169 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean171 = true;
		this.method2074(true);
		this.method2099(true);
		this.method2102(true);
		this.method2096(true);
		this.method2056();
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
		this.anInt2529 = this.anInt2539 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "(Z)V")
	private void method2112() {
		this.aFloat29 = this.anInt2554 - this.anInt2547;
		this.aFloat31 = this.anInt2535 - this.anInt2547;
		this.aFloat39 = this.anInt2534 - this.anInt2543;
		this.aFloat26 = this.anInt2532 - this.anInt2543;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!uj;)V")
	public void method2113(@OriginalArg(1) Class177_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method7889(), 0);
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(ZI)I")
	public int method2114(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ep", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ep", name = "C", descriptor = "(I)V")
	public void method2115() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!hs;Lclient!mp;)Lclient!cha;")
	@Override
	public Interface4 method6959(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface18 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(23) Class1_Sub2 local23 = (Class1_Sub2) arg5;
		@Pc(26) Class65_Sub1_Sub1 local26 = local23.aClass65_Sub1_Sub1_2;
		this.method2093();
		this.method2077(local23.aClass65_Sub1_Sub1_2);
		this.method2062(1);
		this.method2105(7681, 8448);
		this.method2101(768, 34167, 0);
		@Pc(56) float local56 = local26.aFloat19 / (float) local26.anInt1699;
		@Pc(63) float local63 = local26.aFloat18 / (float) local26.anInt1700;
		@Pc(69) float local69 = (float) arg2 - (float) arg0;
		@Pc(76) float local76 = (float) -arg1 + (float) arg3;
		@Pc(89) float local89 = (float) (1.0D / Math.sqrt((double) (local69 * local69 + local76 * local76)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(108) float local108 = local76 * local89;
		@Pc(114) int local114 = arg10 % (arg8 + arg9);
		@Pc(118) float local118 = local69 * local89;
		@Pc(123) float local123 = (float) arg8 * local118;
		@Pc(128) float local128 = (float) arg8 * local108;
		@Pc(130) float local130 = 0.0F;
		@Pc(132) float local132 = 0.0F;
		@Pc(134) float local134 = local123;
		@Pc(136) float local136 = local128;
		if (local114 > arg8) {
			local130 = local118 * (float) (arg9 + arg8 - local114);
			local132 = local108 * (float) (arg8 + arg9 - local114);
		} else {
			local134 = (float) (arg8 - local114) * local118;
			local136 = local108 * (float) (arg8 - local114);
		}
		@Pc(184) float local184 = local130 + (float) arg0 + 0.35F;
		@Pc(191) float local191 = (float) arg1 + local132 + 0.35F;
		@Pc(196) float local196 = local118 * (float) arg9;
		@Pc(201) float local201 = local108 * (float) arg9;
		while (true) {
			if (arg2 <= arg0) {
				if ((float) arg2 + 0.35F > local184) {
					break;
				}
				if ((float) arg2 > local184 + local134) {
					local134 = (float) arg2 - local184;
				}
			} else {
				if ((float) arg2 + 0.35F < local184) {
					break;
				}
				if (local134 + local184 > (float) arg2) {
					local134 = (float) arg2 - local184;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 + 0.35F > local191) {
					break;
				}
				if ((float) arg3 > local136 + local191) {
					local136 = (float) arg3 - local191;
				}
			} else {
				if (local191 > (float) arg3 + 0.35F) {
					break;
				}
				if (local136 + local191 > (float) arg3) {
					local136 = (float) arg3 - local191;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(((float) -arg6 + local184) * local56, local63 * ((float) -arg7 + local191));
			OpenGL.glVertex2f(local184, local191);
			OpenGL.glTexCoord2f(local56 * (local184 + local134 - (float) arg6), local63 * (local191 + local136 - (float) arg7));
			OpenGL.glVertex2f(local184 + local134, local191 + local136);
			OpenGL.glEnd();
			local191 += local136 + local201;
			local184 += local134 + local196;
			local134 = local123;
			local136 = local128;
		}
		this.method2101(768, 5890, 0);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!kda;IIII)Lclient!ka;")
	@Override
	public Class182 method6938(@OriginalArg(0) Class186 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class182_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ep", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt2559;
		this.anInt2559 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6950(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas2 == arg0) {
			local5 = this.aLong70;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable1.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas1 == arg0) {
			this.method2087();
		}
	}

	@OriginalMember(owner = "client!ep", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt2469 - arg1 - local12, arg2, 1, 32993, this.anInt2550, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIF)Lclient!kb;")
	@Override
	public Class2_Sub24 method6929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub24_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub31 method6985(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub31_Sub2 local8 = new Class2_Sub31_Sub2(arg0);
		this.aClass109_16.method2323(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "(III)V")
	public void method2116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2530 = arg0;
		this.anInt2527 = arg1;
		this.method2104();
		this.method2045();
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(BI)I")
	public int method2117(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "()V")
	@Override
	public void method7000() {
		if (this.aBoolean184) {
			if (this.anInterface3_1 != this.aClass333_1) {
				throw new RuntimeException();
			}
			this.aClass333_1.method7485(0);
			this.aClass333_1.method7485(8);
			this.method2070(this.aClass333_1);
		} else if (this.aBoolean191) {
			this.aClass61_Sub3_1.method6448(0, 0, this.anInt2397, this.anInt2469, 0, 0);
			this.anOpenGL1.setSurface(this.aLong69);
		} else {
			throw new RuntimeException("");
		}
		this.aClass61_Sub3_1 = null;
		this.anInt2397 = this.anInt2510;
		this.anInt2469 = this.anInt2443;
		this.method2056();
		this.method2104();
		this.la();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIILclient!vi;)V")
	public void method2118(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Interface26 arg2) {
		@Pc(7) int local7 = arg2.method5673();
		@Pc(14) int local14 = arg1 * this.method2117(local7);
		this.method2057(arg2);
		OpenGL.glDrawElements(4, arg0, local7, arg2.method5672() + (long) local14);
	}

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt2526;
	}

	@OriginalMember(owner = "client!ep", name = "D", descriptor = "(I)V")
	private void method2119() {
		this.aFloatArray8[14] = this.aFloat33;
		this.aFloatArray8[10] = this.aFloat34;
		this.aFloat42 = this.anInt2525;
		this.aFloat45 = (this.aFloatArray8[14] - (float) this.anInt2525) / this.aFloatArray8[10];
	}
}
