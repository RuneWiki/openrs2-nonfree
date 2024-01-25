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

@OriginalClass("client!bl")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
	public int anInt566;

	@OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
	private int anInt577;

	@OriginalMember(owner = "client!bl", name = "Xb", descriptor = "I")
	private int anInt629;

	@OriginalMember(owner = "client!bl", name = "Cd", descriptor = "I")
	public int anInt711;

	@OriginalMember(owner = "client!bl", name = "re", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!bl", name = "se", descriptor = "I")
	public int anInt737;

	@OriginalMember(owner = "client!bl", name = "ze", descriptor = "Lclient!op;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!bl", name = "Ae", descriptor = "Lclient!op;")
	private Interface7 anInterface7_2;

	@OriginalMember(owner = "client!bl", name = "Ce", descriptor = "I")
	private int anInt741;

	@OriginalMember(owner = "client!bl", name = "De", descriptor = "I")
	public int anInt742;

	@OriginalMember(owner = "client!bl", name = "Ee", descriptor = "I")
	public int anInt743;

	@OriginalMember(owner = "client!bl", name = "Me", descriptor = "I")
	private int anInt745;

	@OriginalMember(owner = "client!bl", name = "Ne", descriptor = "Lclient!ju;")
	private Class133_Sub1 aClass133_Sub1_1;

	@OriginalMember(owner = "client!bl", name = "Pe", descriptor = "Lclient!ri;")
	public Class39_Sub2 aClass39_Sub2_1;

	@OriginalMember(owner = "client!bl", name = "Re", descriptor = "I")
	private int anInt746;

	@OriginalMember(owner = "client!bl", name = "Se", descriptor = "Z")
	public boolean aBoolean41;

	@OriginalMember(owner = "client!bl", name = "Ue", descriptor = "Z")
	private boolean aBoolean43;

	@OriginalMember(owner = "client!bl", name = "Ve", descriptor = "Z")
	public boolean aBoolean44;

	@OriginalMember(owner = "client!bl", name = "Ze", descriptor = "Z")
	private boolean aBoolean45;

	@OriginalMember(owner = "client!bl", name = "af", descriptor = "Z")
	private boolean aBoolean46;

	@OriginalMember(owner = "client!bl", name = "bf", descriptor = "F")
	private float bf;

	@OriginalMember(owner = "client!bl", name = "cf", descriptor = "Z")
	public boolean aBoolean47;

	@OriginalMember(owner = "client!bl", name = "df", descriptor = "Lclient!sg;")
	public Class40_Sub3 aClass40_Sub3_1;

	@OriginalMember(owner = "client!bl", name = "gf", descriptor = "Lclient!sg;")
	public Class40_Sub3 aClass40_Sub3_2;

	@OriginalMember(owner = "client!bl", name = "hf", descriptor = "Z")
	public boolean aBoolean48;

	@OriginalMember(owner = "client!bl", name = "jf", descriptor = "Lclient!ri;")
	public Class39_Sub2 aClass39_Sub2_2;

	@OriginalMember(owner = "client!bl", name = "mf", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!bl", name = "pf", descriptor = "Z")
	private boolean aBoolean49;

	@OriginalMember(owner = "client!bl", name = "rf", descriptor = "Z")
	public boolean aBoolean50;

	@OriginalMember(owner = "client!bl", name = "sf", descriptor = "Lclient!mg;")
	public Class166 aClass166_1;

	@OriginalMember(owner = "client!bl", name = "tf", descriptor = "Z")
	private boolean aBoolean51;

	@OriginalMember(owner = "client!bl", name = "uf", descriptor = "I")
	private int anInt754;

	@OriginalMember(owner = "client!bl", name = "vf", descriptor = "Z")
	public boolean aBoolean52;

	@OriginalMember(owner = "client!bl", name = "wf", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!bl", name = "xf", descriptor = "Lclient!ot;")
	public Class195 aClass195_1;

	@OriginalMember(owner = "client!bl", name = "yf", descriptor = "I")
	public int anInt755;

	@OriginalMember(owner = "client!bl", name = "zf", descriptor = "I")
	private int anInt756;

	@OriginalMember(owner = "client!bl", name = "Af", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!bl", name = "Bf", descriptor = "Z")
	public boolean aBoolean53;

	@OriginalMember(owner = "client!bl", name = "Cf", descriptor = "Lclient!sg;")
	public Class40_Sub3 aClass40_Sub3_3;

	@OriginalMember(owner = "client!bl", name = "Ff", descriptor = "Z")
	private boolean aBoolean54;

	@OriginalMember(owner = "client!bl", name = "Gf", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!bl", name = "Hf", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!bl", name = "Lf", descriptor = "I")
	public int anInt759;

	@OriginalMember(owner = "client!bl", name = "Mf", descriptor = "I")
	public int anInt760;

	@OriginalMember(owner = "client!bl", name = "Nf", descriptor = "F")
	private float aFloat17;

	@OriginalMember(owner = "client!bl", name = "Of", descriptor = "Lclient!ri;")
	public Class39_Sub2 aClass39_Sub2_3;

	@OriginalMember(owner = "client!bl", name = "Pf", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!bl", name = "Qf", descriptor = "Lclient!ri;")
	public Class39_Sub2 aClass39_Sub2_4;

	@OriginalMember(owner = "client!bl", name = "Tf", descriptor = "I")
	private int anInt761;

	@OriginalMember(owner = "client!bl", name = "Uf", descriptor = "Lclient!mg;")
	public Class166 aClass166_2;

	@OriginalMember(owner = "client!bl", name = "Vf", descriptor = "I")
	private int anInt762;

	@OriginalMember(owner = "client!bl", name = "Zf", descriptor = "Lclient!ri;")
	public Class39_Sub2 aClass39_Sub2_5;

	@OriginalMember(owner = "client!bl", name = "ag", descriptor = "I")
	private int anInt763;

	@OriginalMember(owner = "client!bl", name = "bg", descriptor = "Lclient!ri;")
	public Class39_Sub2 aClass39_Sub2_6;

	@OriginalMember(owner = "client!bl", name = "dg", descriptor = "Z")
	public boolean aBoolean57;

	@OriginalMember(owner = "client!bl", name = "eg", descriptor = "Lclient!na;")
	public Class132_Sub2 aClass132_Sub2_3;

	@OriginalMember(owner = "client!bl", name = "hg", descriptor = "I")
	private int anInt765;

	@OriginalMember(owner = "client!bl", name = "ig", descriptor = "Lclient!ri;")
	public Class39_Sub2 aClass39_Sub2_7;

	@OriginalMember(owner = "client!bl", name = "kg", descriptor = "I")
	private int anInt767;

	@OriginalMember(owner = "client!bl", name = "lg", descriptor = "Z")
	private boolean aBoolean58;

	@OriginalMember(owner = "client!bl", name = "mg", descriptor = "Lclient!ot;")
	public Class195 aClass195_2;

	@OriginalMember(owner = "client!bl", name = "ng", descriptor = "I")
	private int anInt768;

	@OriginalMember(owner = "client!bl", name = "og", descriptor = "I")
	public int anInt769;

	@OriginalMember(owner = "client!bl", name = "pg", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!bl", name = "sg", descriptor = "I")
	private int anInt770;

	@OriginalMember(owner = "client!bl", name = "tg", descriptor = "[Lclient!ce;")
	private Class40[] aClass40Array1;

	@OriginalMember(owner = "client!bl", name = "zg", descriptor = "Lclient!ri;")
	public Class39_Sub2 aClass39_Sub2_8;

	@OriginalMember(owner = "client!bl", name = "Bg", descriptor = "Z")
	private boolean aBoolean61;

	@OriginalMember(owner = "client!bl", name = "Cg", descriptor = "Lclient!ri;")
	public Class39_Sub2 aClass39_Sub2_9;

	@OriginalMember(owner = "client!bl", name = "Dg", descriptor = "Z")
	private boolean aBoolean62;

	@OriginalMember(owner = "client!bl", name = "Eg", descriptor = "F")
	private float aFloat23;

	@OriginalMember(owner = "client!bl", name = "Gg", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!bl", name = "Ig", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!bl", name = "Mg", descriptor = "I")
	private int anInt777;

	@OriginalMember(owner = "client!bl", name = "Qg", descriptor = "Lclient!ph;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!bl", name = "Rg", descriptor = "Z")
	public boolean aBoolean65;

	@OriginalMember(owner = "client!bl", name = "Sg", descriptor = "Lclient!na;")
	public Class132_Sub2 aClass132_Sub2_4;

	@OriginalMember(owner = "client!bl", name = "Tg", descriptor = "Lclient!ri;")
	public Class39_Sub2 aClass39_Sub2_10;

	@OriginalMember(owner = "client!bl", name = "Ug", descriptor = "Lclient!eo;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!bl", name = "Wg", descriptor = "Lclient!js;")
	private Class40_Sub3_Sub1 aClass40_Sub3_Sub1_1;

	@OriginalMember(owner = "client!bl", name = "Xg", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!bl", name = "Yg", descriptor = "I")
	private int anInt780;

	@OriginalMember(owner = "client!bl", name = "Zg", descriptor = "Z")
	private boolean aBoolean66;

	@OriginalMember(owner = "client!bl", name = "bh", descriptor = "Lclient!eo;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!bl", name = "pb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!bl", name = "Rd", descriptor = "I")
	public int anInt724 = 128;

	@OriginalMember(owner = "client!bl", name = "Xd", descriptor = "Lclient!ln;")
	private final Class154 aClass154_1 = new Class154();

	@OriginalMember(owner = "client!bl", name = "he", descriptor = "Lclient!na;")
	private final Class132_Sub2 aClass132_Sub2_1 = new Class132_Sub2();

	@OriginalMember(owner = "client!bl", name = "le", descriptor = "Lclient!na;")
	public final Class132_Sub2 aClass132_Sub2_2 = new Class132_Sub2();

	@OriginalMember(owner = "client!bl", name = "me", descriptor = "I")
	public int anInt735 = 8;

	@OriginalMember(owner = "client!bl", name = "ne", descriptor = "I")
	public int anInt736 = 3;

	@OriginalMember(owner = "client!bl", name = "qe", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!bl", name = "pe", descriptor = "Lclient!ft;")
	private final Class88 aClass88_1 = new Class88();

	@OriginalMember(owner = "client!bl", name = "ue", descriptor = "I")
	private int anInt739 = -1;

	@OriginalMember(owner = "client!bl", name = "te", descriptor = "I")
	private int anInt738 = -1;

	@OriginalMember(owner = "client!bl", name = "ve", descriptor = "[Lclient!op;")
	private final Interface7[] anInterface7Array1 = new Interface7[4];

	@OriginalMember(owner = "client!bl", name = "xe", descriptor = "[Lclient!op;")
	private final Interface7[] anInterface7Array3 = new Interface7[4];

	@OriginalMember(owner = "client!bl", name = "we", descriptor = "[Lclient!op;")
	private final Interface7[] anInterface7Array2 = new Interface7[4];

	@OriginalMember(owner = "client!bl", name = "ye", descriptor = "I")
	private int anInt740 = -1;

	@OriginalMember(owner = "client!bl", name = "Be", descriptor = "Lclient!ft;")
	private final Class88 aClass88_2;

	@OriginalMember(owner = "client!bl", name = "Fe", descriptor = "Lclient!ft;")
	private final Class88 aClass88_3;

	@OriginalMember(owner = "client!bl", name = "Ge", descriptor = "Lclient!ft;")
	private final Class88 aClass88_4;

	@OriginalMember(owner = "client!bl", name = "He", descriptor = "Lclient!ft;")
	private final Class88 aClass88_5;

	@OriginalMember(owner = "client!bl", name = "Ie", descriptor = "Lclient!ft;")
	private final Class88 aClass88_6;

	@OriginalMember(owner = "client!bl", name = "Je", descriptor = "Lclient!ft;")
	private final Class88 aClass88_7;

	@OriginalMember(owner = "client!bl", name = "Ke", descriptor = "Lclient!ft;")
	private final Class88 aClass88_8;

	@OriginalMember(owner = "client!bl", name = "Le", descriptor = "I")
	private int anInt744;

	@OriginalMember(owner = "client!bl", name = "Xe", descriptor = "[F")
	private final float[] aFloatArray2;

	@OriginalMember(owner = "client!bl", name = "ff", descriptor = "I")
	private int anInt748;

	@OriginalMember(owner = "client!bl", name = "Te", descriptor = "Z")
	private boolean aBoolean42;

	@OriginalMember(owner = "client!bl", name = "of", descriptor = "I")
	public int anInt752;

	@OriginalMember(owner = "client!bl", name = "Ef", descriptor = "I")
	public int anInt757;

	@OriginalMember(owner = "client!bl", name = "Rf", descriptor = "F")
	private float aFloat18;

	@OriginalMember(owner = "client!bl", name = "If", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!bl", name = "Ye", descriptor = "F")
	private float aFloat10;

	@OriginalMember(owner = "client!bl", name = "ef", descriptor = "I")
	private int anInt747;

	@OriginalMember(owner = "client!bl", name = "jg", descriptor = "I")
	public int anInt766;

	@OriginalMember(owner = "client!bl", name = "We", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!bl", name = "cg", descriptor = "[F")
	private final float[] aFloatArray4;

	@OriginalMember(owner = "client!bl", name = "kf", descriptor = "I")
	private int anInt749;

	@OriginalMember(owner = "client!bl", name = "lf", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!bl", name = "fg", descriptor = "I")
	private int anInt764;

	@OriginalMember(owner = "client!bl", name = "Qe", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!bl", name = "rg", descriptor = "[F")
	private final float[] aFloatArray5;

	@OriginalMember(owner = "client!bl", name = "Df", descriptor = "[F")
	private final float[] aFloatArray3;

	@OriginalMember(owner = "client!bl", name = "Kf", descriptor = "F")
	public float aFloat16;

	@OriginalMember(owner = "client!bl", name = "gg", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!bl", name = "xg", descriptor = "I")
	public int anInt772;

	@OriginalMember(owner = "client!bl", name = "ug", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!bl", name = "Sf", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!bl", name = "Jf", descriptor = "I")
	private int anInt758;

	@OriginalMember(owner = "client!bl", name = "yg", descriptor = "I")
	public int anInt773;

	@OriginalMember(owner = "client!bl", name = "vg", descriptor = "F")
	private float aFloat22;

	@OriginalMember(owner = "client!bl", name = "wg", descriptor = "[F")
	public final float[] aFloatArray6;

	@OriginalMember(owner = "client!bl", name = "qf", descriptor = "I")
	private int anInt753;

	@OriginalMember(owner = "client!bl", name = "Lg", descriptor = "I")
	private int anInt776;

	@OriginalMember(owner = "client!bl", name = "Pg", descriptor = "I")
	public int anInt778;

	@OriginalMember(owner = "client!bl", name = "nf", descriptor = "I")
	private int anInt751;

	@OriginalMember(owner = "client!bl", name = "Xf", descriptor = "[Lclient!ki;")
	private final Class6_Sub6[] aClass6_Sub6Array1;

	@OriginalMember(owner = "client!bl", name = "Og", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!bl", name = "Kg", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!bl", name = "Jg", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!bl", name = "ch", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!bl", name = "ah", descriptor = "I")
	public int anInt781;

	@OriginalMember(owner = "client!bl", name = "Vg", descriptor = "I")
	public int anInt779;

	@OriginalMember(owner = "client!bl", name = "W", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas3;

	@OriginalMember(owner = "client!bl", name = "Ab", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!bl", name = "Sd", descriptor = "I")
	public final int anInt725;

	@OriginalMember(owner = "client!bl", name = "Vc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!bl", name = "Lb", descriptor = "J")
	private final long aLong22;

	@OriginalMember(owner = "client!bl", name = "Sb", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!bl", name = "Fg", descriptor = "I")
	public final int anInt774;

	@OriginalMember(owner = "client!bl", name = "Yf", descriptor = "Z")
	private boolean aBoolean56;

	@OriginalMember(owner = "client!bl", name = "Hg", descriptor = "Z")
	public boolean aBoolean63;

	@OriginalMember(owner = "client!bl", name = "Ng", descriptor = "Z")
	public boolean aBoolean64;

	@OriginalMember(owner = "client!bl", name = "Oe", descriptor = "Z")
	public boolean aBoolean40;

	@OriginalMember(owner = "client!bl", name = "qg", descriptor = "Z")
	private boolean aBoolean59;

	@OriginalMember(owner = "client!bl", name = "Ag", descriptor = "Z")
	public boolean aBoolean60;

	@OriginalMember(owner = "client!bl", name = "Wf", descriptor = "Z")
	private final boolean aBoolean55;

	@OriginalMember(owner = "client!bl", name = "ae", descriptor = "Lclient!bm;")
	public final Class29 aClass29_1;

	@OriginalMember(owner = "client!bl", name = "oe", descriptor = "Lclient!bj;")
	public final Class27 aClass27_1;

	@OriginalMember(owner = "client!bl", name = "Yd", descriptor = "Lclient!to;")
	private final Class237 aClass237_1;

	@OriginalMember(owner = "client!bl", name = "Kd", descriptor = "Lclient!lk;")
	private Class6_Sub21_Sub1 aClass6_Sub21_Sub1_1;

	@OriginalMember(owner = "client!bl", name = "Zd", descriptor = "Lclient!wp;")
	private final Class264 aClass264_1;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!vl;ILclient!hf;)V")
	public Class28_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class103 arg4) {
		super(arg0, arg2);
		new Class202();
		new Class137(16);
		this.aClass88_2 = new Class88();
		this.aClass88_3 = new Class88();
		this.aClass88_4 = new Class88();
		this.aClass88_5 = new Class88();
		this.aClass88_6 = new Class88();
		this.aClass88_7 = new Class88();
		this.aClass88_8 = new Class88();
		this.anInt744 = 0;
		this.aFloatArray2 = new float[16];
		this.anInt748 = -1;
		this.aBoolean42 = true;
		this.anInt752 = 512;
		this.anInt757 = 0;
		this.aFloat18 = 1.0F;
		this.aFloat15 = -1.0F;
		this.aFloat10 = 0.0F;
		this.anInt747 = -1;
		this.anInt766 = 0;
		this.aFloat9 = -1.0F;
		this.aFloatArray4 = new float[4];
		this.anInt749 = 0;
		this.anInt750 = 0;
		this.anInt764 = 0;
		this.aFloat8 = 1.0F;
		this.aFloatArray5 = new float[4];
		this.aFloatArray3 = new float[4];
		this.aFloat16 = 3584.0F;
		this.aFloat20 = 3000.0F;
		this.anInt772 = 3584;
		this.anInt771 = 0;
		this.aFloat19 = 1.0F;
		this.anInt758 = 0;
		this.anInt773 = 50;
		this.aFloat22 = 1.0F;
		this.aFloatArray6 = new float[4];
		this.anInt753 = 8448;
		this.anInt776 = 8448;
		this.anInt778 = -1;
		this.anInt751 = 0;
		this.aClass6_Sub6Array1 = new Class6_Sub6[Static333.anInt3902];
		this.aFloat27 = 3584.0F;
		this.anInt775 = -1;
		this.aFloat26 = 1.0F;
		this.anInt782 = 512;
		this.anInt781 = 0;
		this.anInt779 = -1;
		this.aCanvas4 = this.aCanvas3 = arg1;
		this.anInt725 = arg3;
		try {
			if (Static30.aBoolean38 == null || !Static30.aBoolean38) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static30.aBoolean38 = Boolean.TRUE;
				} else {
					@Pc(254) String local254 = System.getProperty("os.name").toLowerCase();
					if (!local254.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local254.startsWith("linux") || local254.startsWith("sunos")) {
						System.load(arg4.method2376("libjaggl.so").toString());
					} else if (local254.startsWith("mac")) {
						System.load(arg4.method2376("libjaggl.jnilib").toString());
					} else if (local254.startsWith("win")) {
						System.load(arg4.method2376("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static30.aBoolean38 = Boolean.TRUE;
				}
			}
			if (Static30.aBoolean38 == null || !Static30.aBoolean38) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong23 = this.aLong22 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt725);
			if (this.aLong22 == 0L) {
				throw new RuntimeException("");
			}
			this.method689();
			@Pc(355) int local355 = this.method716();
			if (local355 != 0) {
				throw new RuntimeException("");
			}
			this.anInt774 = this.aBoolean52 ? 33639 : 5121;
			@Pc(382) int local382;
			if (this.aString6.indexOf("radeon") != -1) {
				local382 = 0;
				@Pc(384) boolean local384 = false;
				@Pc(386) boolean local386 = false;
				@Pc(395) String[] local395 = Static109.method1808(' ', this.aString6.replace('/', ' '));
				for (@Pc(397) int local397 = 0; local397 < local395.length; local397++) {
					@Pc(403) String local403 = local395[local397];
					try {
						if (local403.length() > 0) {
							if (local403.charAt(0) == 'x' && local403.length() >= 3 && Static176.method2767(local403.substring(1, 3))) {
								local403 = local403.substring(1);
								local386 = true;
							}
							if (local403.equals("hd")) {
								local384 = true;
							} else {
								if (local403.startsWith("hd")) {
									local403 = local403.substring(2);
									local384 = true;
								}
								if (local403.length() >= 4 && Static176.method2767(local403.substring(0, 4))) {
									local382 = Static265.method4063(local403.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(471) Exception local471) {
					}
				}
				if (!local386 && !local384) {
					if (local382 >= 7000 && local382 <= 7999) {
						this.aBoolean56 = false;
					}
					if (local382 >= 7000 && local382 <= 9250) {
						this.aBoolean63 = false;
					}
				}
				if (!local384 || local382 < 4000) {
					this.aBoolean64 = false;
				}
				this.aBoolean40 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean59 = this.aBoolean56;
			}
			if (this.aString7.indexOf("intel") != -1) {
				this.aBoolean60 = false;
			}
			this.aBoolean55 = !this.aString7.equals("s3 graphics");
			if (this.aBoolean56) {
				try {
					@Pc(557) int[] local557 = new int[1];
					OpenGL.glGenBuffersARB(1, local557, 0);
				} catch (@Pc(563) Throwable local563) {
					throw new RuntimeException("");
				}
			}
			Static301.method2520(true);
			this.aBoolean39 = true;
			this.aClass29_1 = new Class29(this, super.anInterface11_6);
			this.method672();
			this.aClass27_1 = new Class27(this);
			this.aClass237_1 = new Class237(this);
			if (this.aClass237_1.method5342()) {
				this.aClass6_Sub21_Sub1_1 = new Class6_Sub21_Sub1(this);
				if (!this.aClass6_Sub21_Sub1_1.method3455()) {
					this.aClass6_Sub21_Sub1_1.method3444();
					this.aClass6_Sub21_Sub1_1 = null;
				}
			}
			this.aClass264_1 = new Class264(this);
			this.method645();
			this.method662();
			OpenGL.glClear(16640);
			local382 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(642) Exception local642) {
					if (local382++ > 5) {
						throw new RuntimeException("");
					}
					Static170.method1617(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(660) Throwable local660) {
			local660.printStackTrace();
			this.method3578();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BIII)V")
	public void method643(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIF)Lclient!ki;")
	@Override
	public Class6_Sub6 method3482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub6_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "()Z")
	@Override
	public boolean method3537() {
		return this.aClass6_Sub21_Sub1_1 != null && (this.anInt725 <= 1 || this.aBoolean66);
	}

	@OriginalMember(owner = "client!bl", name = "E", descriptor = "()I")
	@Override
	public int method3574() {
		return 4;
	}

	@OriginalMember(owner = "client!bl", name = "G", descriptor = "()V")
	@Override
	protected void method3578() {
		for (@Pc(10) Class6 local10 = this.aClass88_1.method1882(); local10 != null; local10 = this.aClass88_1.method1891()) {
			((Class6_Sub27_Sub1) local10).method5231();
		}
		if (this.aClass237_1 != null) {
			this.aClass237_1.method5343();
		}
		if (this.anOpenGL1 != null) {
			this.method715();
			@Pc(40) Enumeration local40 = this.aHashtable1.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable1.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean39) {
			Static94.method1632(true);
			this.aBoolean39 = false;
		}
	}

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "(I)V")
	public void method644() {
		if (this.anInt765 == 8) {
			return;
		}
		this.method649();
		this.method677(true);
		this.method670(true);
		this.method666(true);
		this.method708(1);
		this.method678(0);
		this.anInt765 = 8;
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(Z)V")
	private void method645() {
		this.method718(-2);
		for (@Pc(14) int local14 = this.anInt760 - 1; local14 >= 0; local14--) {
			this.method650(local14);
			this.method654(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method692(8448, 8448);
		this.method665(34168, 770, 2);
		this.method710();
		this.anInt768 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt745 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean49 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean43 = true;
		this.method677(true);
		this.method668(true);
		this.method670(true);
		this.method666(true);
		this.method656();
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
		@Pc(126) float[] local126 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(128) int local128 = 0; local128 < 8; local128++) {
			@Pc(134) int local134 = local128 + 16384;
			OpenGL.glLightfv(local134, 4608, local126, 0);
			OpenGL.glLightf(local134, 4615, 0.0F);
			OpenGL.glLightf(local134, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt747 = this.anInt778 = -1;
		this.method3554();
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "()I")
	@Override
	public int method3485() {
		@Pc(6) int local6 = this.anInt763;
		this.anInt763 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II[[I[[IIII)Lclient!fo;")
	@Override
	public Class84 method3507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class84_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIILclient!be;II)V")
	@Override
	public void method3484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class24 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class24_Sub2 local6 = (Class24_Sub2) arg5;
		@Pc(9) Class40_Sub3_Sub1 local9 = local6.aClass40_Sub3_Sub1_2;
		this.method648();
		this.method654(local6.aClass40_Sub3_Sub1_2);
		this.method708(1);
		this.method692(8448, 7681);
		this.method665(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat61 / (float) local9.anInt3384;
		@Pc(46) float local46 = local9.aFloat62 / (float) local9.anInt3385;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method665(5890, 768, 0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
	@Override
	public void method3490(@OriginalArg(0) int arg0) {
		this.method689();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!lf;Lclient!lf;FLclient!lf;)Lclient!lf;")
	@Override
	public Class133 method3573(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class133 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean65 && this.aBoolean60 && this.aBoolean48) {
			@Pc(18) Class133_Sub1_Sub1 local18 = null;
			@Pc(21) Class133_Sub1 local21 = (Class133_Sub1) arg0;
			@Pc(24) Class133_Sub1 local24 = (Class133_Sub1) arg1;
			@Pc(28) Class40_Sub4 local28 = local21.method4772();
			@Pc(32) Class40_Sub4 local32 = local24.method4772();
			if (local28 != null && local32 != null) {
				@Pc(51) int local51 = local28.anInt6165 > local32.anInt6165 ? local28.anInt6165 : local32.anInt6165;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class133_Sub1_Sub1) {
					@Pc(63) Class133_Sub1_Sub1 local63 = (Class133_Sub1_Sub1) arg3;
					if (local51 == local63.method4249()) {
						local18 = local63;
					}
				}
				if (local18 == null) {
					local18 = new Class133_Sub1_Sub1(this, local51);
				}
				if (local18.method4244(local28, local32, arg2)) {
					return local18;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "()V")
	@Override
	public void method3533() {
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(II)I")
	@Override
	public int method3539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "(I)V")
	private void method646() {
		if (this.anInt765 == 1) {
			return;
		}
		this.method722();
		this.method677(false);
		this.method668(false);
		this.method670(false);
		this.method666(false);
		this.method654(null);
		this.method718(-2);
		this.method678(1);
		this.anInt765 = 1;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method3527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(57) float local57;
		@Pc(45) float local45;
		if (this.aClass40_Sub3_Sub1_1 == null || arg2 > this.aClass40_Sub3_Sub1_1.anInt3372 || arg3 > this.aClass40_Sub3_Sub1_1.anInt3370) {
			this.aClass40_Sub3_Sub1_1 = Static339.method4788(arg3, arg2, this, arg6);
			this.aClass40_Sub3_Sub1_1.method3021(false, false);
			local57 = this.aClass40_Sub3_Sub1_1.aFloat62;
			local45 = this.aClass40_Sub3_Sub1_1.aFloat61;
		} else {
			this.aClass40_Sub3_Sub1_1.method3019(6406, arg6, arg2, arg3, false);
			local45 = this.aClass40_Sub3_Sub1_1.aFloat61 * (float) arg2 / (float) this.aClass40_Sub3_Sub1_1.anInt3372;
			local57 = this.aClass40_Sub3_Sub1_1.aFloat62 * (float) arg3 / (float) this.aClass40_Sub3_Sub1_1.anInt3370;
		}
		this.method648();
		this.method654(this.aClass40_Sub3_Sub1_1);
		this.method708(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method673(arg5);
		this.method692(34165, 34165);
		this.method665(34166, 768, 0);
		this.method665(5890, 770, 2);
		this.method643(34166, 0);
		this.method643(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = local150 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local57, local45);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local57, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method665(5890, 768, 0);
		this.method665(34166, 770, 2);
		this.method643(5890, 0);
		this.method643(34166, 2);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
	@Override
	public void method3495(@OriginalArg(0) int arg0) {
		this.anInt736 = 0;
		while (arg0 > 1) {
			this.anInt736++;
			arg0 >>= 0x1;
		}
		this.anInt735 = 0x1 << this.anInt736;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
	@Override
	public void method3535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt778 == arg0 && this.anInt775 == arg1 && this.anInt766 == arg2) {
			return;
		}
		this.anInt778 = arg0;
		this.anInt775 = arg1;
		this.anInt766 = arg2;
		if (!this.aBoolean57) {
			this.method695();
			this.method652();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIZ)Lclient!ig;")
	@Override
	public Class12 method3518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class12_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bl", name = "z", descriptor = "()Z")
	@Override
	public boolean method3557() {
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(JB)V")
	public synchronized void method647(@OriginalArg(0) long arg0) {
		@Pc(19) Class6 local19 = new Class6();
		local19.aLong217 = arg0;
		this.aClass88_8.method1878(local19);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	public void method648() {
		if (this.anInt765 == 2) {
			return;
		}
		this.method722();
		this.method677(false);
		this.method668(false);
		this.method670(false);
		this.method666(false);
		this.method718(-2);
		this.anInt765 = 2;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
	private void method649() {
		if (this.anInt767 != 2) {
			this.anInt767 = 2;
			this.method724();
			this.method712();
			this.anInt765 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)Lclient!pt;")
	@Override
	public Class6_Sub27 method3516() {
		@Pc(8) Class6_Sub27_Sub1 local8 = new Class6_Sub27_Sub1(78643200);
		this.aClass88_1.method1878(local8);
		return local8;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V")
	public void method650(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt777) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt777 = arg0;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!fd;Z)Lclient!ig;")
	@Override
	public Class12 method3540(@OriginalArg(0) Class77 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt1842 * arg0.anInt1844];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray24 == null) {
			for (local21 = 0; local21 < arg0.anInt1844; local21++) {
				for (local25 = 0; local25 < arg0.anInt1842; local25++) {
					@Pc(83) int local83 = arg0.anIntArray196[arg0.aByteArray23[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt1844; local21++) {
				for (local25 = 0; local25 < arg0.anInt1842; local25++) {
					local12[local16++] = arg0.anIntArray196[arg0.aByteArray23[local14] & 0xFF] | arg0.aByteArray24[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(122) Class12 local122 = this.method3512(local12, arg0.anInt1842, arg0.anInt1842, arg0.anInt1844);
		local122.method5663(arg0.anInt1845, arg0.anInt1846, arg0.anInt1847, arg0.anInt1843);
		return local122;
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "(II)I")
	public int method651(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(IIII)V")
	@Override
	public void method3528() {
		this.anInt759 = -1;
		this.aBoolean57 = true;
		this.anInt779 = 40;
		this.anInt771 = 127;
		this.anInt748 = 1583160;
		this.aClass264_1.method5949(false, false, 3);
		this.aClass264_1.aClass5_Sub9_1.method5934();
		this.method695();
		this.method652();
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void method3568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)V")
	private void method652() {
		if (this.aBoolean61 && this.anInt775 >= 0 | this.aBoolean57) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method3579(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "()I")
	@Override
	public int method3543() {
		return this.anInt773;
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)V")
	private void method653() {
		Static243.aFloatArray21[0] = this.aFloat13 * this.aFloat26;
		Static243.aFloatArray21[2] = this.aFloat13 * this.aFloat19;
		Static243.aFloatArray21[1] = this.aFloat8 * this.aFloat13;
		Static243.aFloatArray21[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static243.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3489(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas3 == arg0) {
			local5 = this.aLong22;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable1.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas4) {
			this.method662();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!ce;Z)V")
	public void method654(@OriginalArg(0) Class40 arg0) {
		@Pc(11) Class40 local11 = this.aClass40Array1[this.anInt777];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt6158);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt6158);
				} else if (arg0.anInt6158 != local11.anInt6158) {
					OpenGL.glDisable(local11.anInt6158);
					OpenGL.glEnable(arg0.anInt6158);
				}
				OpenGL.glBindTexture(arg0.anInt6158, arg0.method5151());
			}
			this.aClass40Array1[this.anInt777] = arg0;
		}
		this.anInt765 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!ph;I)V")
	public void method655(@OriginalArg(0) Interface8 arg0) {
		if (this.anInterface8_1 != arg0) {
			if (this.aBoolean56) {
				OpenGL.glBindBufferARB(34963, arg0.method4285());
			}
			this.anInterface8_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "()Z")
	@Override
	public boolean method3499() {
		if (this.aClass6_Sub21_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass6_Sub21_Sub1_1.method3448()) {
			if (!this.aClass237_1.method5348(this.aClass6_Sub21_Sub1_1)) {
				return false;
			}
			this.aClass29_1.method730();
		}
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "(B)V")
	public void method656() {
		if (this.anInt767 != 0) {
			this.anInt765 &= 0xFFFFFFE0;
			this.anInt767 = 0;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BII)V")
	public synchronized void method657(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub44 local8 = new Class6_Sub44(arg0);
		local8.aLong217 = arg1;
		this.aClass88_4.method1878(local8);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZFF)V")
	public void method658(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat22 = arg1;
		this.aFloat10 = arg0;
		if (!this.aBoolean57) {
			this.method695();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!op;)V")
	public void method659(@OriginalArg(1) Interface7 arg0) {
		if (this.aBoolean48) {
			this.method687(arg0);
			this.method663(arg0);
		} else if (this.anInt739 >= 0 && this.anInterface7Array2[this.anInt739] == arg0) {
			this.anInterface7Array2[this.anInt739--] = null;
			arg0.method3749();
			if (this.anInt739 >= 0) {
				this.anInterface7_1 = this.anInterface7_2 = this.anInterface7Array2[this.anInt739];
				this.anInterface7_1.method3750();
			} else {
				this.anInterface7_1 = this.anInterface7_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!op;I)V")
	public void method660(@OriginalArg(0) Interface7 arg0) {
		if (this.anInt740 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt740 >= 0) {
			this.anInterface7Array1[this.anInt740].method3747();
		}
		this.anInterface7_1 = this.anInterface7Array1[++this.anInt740] = arg0;
		this.anInterface7_1.method3751();
	}

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "()I")
	@Override
	public int method3548() {
		return this.anInt742 + this.anInt743 + this.anInt741;
	}

	@OriginalMember(owner = "client!bl", name = "y", descriptor = "()F")
	@Override
	public float method3556() {
		return this.aFloat24;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZIILclient!ph;)V")
	public void method661(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Interface8 arg2) {
		@Pc(7) int local7 = arg2.method4286();
		@Pc(14) int local14 = arg0 * this.method717(local7);
		this.method655(arg2);
		OpenGL.glDrawElements(4, arg1, local7, arg2.method4283() + (long) local14);
	}

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "(Z)V")
	private void method662() {
		if (this.aCanvas4 == null) {
			this.anInt629 = this.anInt577 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas4.getSize();
			this.anInt577 = local10.height;
			this.anInt629 = local10.width;
		}
		if (this.anInterface7_2 == null) {
			this.anInt566 = this.anInt577;
			this.anInt711 = this.anInt629;
			this.method684();
		}
		this.method656();
		this.method3554();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLclient!op;)V")
	public void method663(@OriginalArg(1) Interface7 arg0) {
		if (this.anInt738 < 0 || this.anInterface7Array3[this.anInt738] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface7Array3[this.anInt738--] = null;
		arg0.method3748();
		if (this.anInt738 < 0) {
			this.anInterface7_2 = null;
		} else {
			this.anInterface7_2 = this.anInterface7Array3[this.anInt738];
			this.anInterface7_2.method3752();
		}
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method3544(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class6_Sub44 local19;
		while (!this.aClass88_3.method1888()) {
			local19 = (Class6_Sub44) this.aClass88_3.method1881();
			Static56.anIntArray97[local7++] = (int) local19.aLong217;
			this.anInt743 -= local19.anInt7027;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static56.anIntArray97, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static56.anIntArray97, 0);
			local7 = 0;
		}
		while (!this.aClass88_4.method1888()) {
			local19 = (Class6_Sub44) this.aClass88_4.method1881();
			Static56.anIntArray97[local7++] = (int) local19.aLong217;
			this.anInt742 -= local19.anInt7027;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static56.anIntArray97, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static56.anIntArray97, 0);
			local7 = 0;
		}
		while (!this.aClass88_5.method1888()) {
			local19 = (Class6_Sub44) this.aClass88_5.method1881();
			Static56.anIntArray97[local7++] = local19.anInt7027;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static56.anIntArray97, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static56.anIntArray97, 0);
			local7 = 0;
		}
		while (!this.aClass88_6.method1888()) {
			local19 = (Class6_Sub44) this.aClass88_6.method1881();
			Static56.anIntArray97[local7++] = (int) local19.aLong217;
			this.anInt741 -= local19.anInt7027;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static56.anIntArray97, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static56.anIntArray97, 0);
		}
		while (!this.aClass88_2.method1888()) {
			local19 = (Class6_Sub44) this.aClass88_2.method1881();
			OpenGL.glDeleteLists((int) local19.aLong217, local19.anInt7027);
		}
		@Pc(212) Class6 local212;
		while (!this.aClass88_7.method1888()) {
			local212 = this.aClass88_7.method1881();
			OpenGL.glDeleteProgramARB((int) local212.aLong217);
		}
		while (!this.aClass88_8.method1888()) {
			local212 = this.aClass88_8.method1881();
			OpenGL.glDeleteObjectARB(local212.aLong217);
		}
		while (!this.aClass88_2.method1888()) {
			local19 = (Class6_Sub44) this.aClass88_2.method1881();
			OpenGL.glDeleteLists((int) local19.aLong217, local19.anInt7027);
		}
		this.aClass29_1.method729();
		if (this.method3548() > 100663296 && Static154.method2527() > this.aLong25 + 60000L) {
			System.gc();
			this.aLong25 = Static154.method2527();
		}
		this.anInt737 = local11;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Lclient!op;I)V")
	public void method664(@OriginalArg(0) Interface7 arg0) {
		if (this.anInt738 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt738 >= 0) {
			this.anInterface7Array3[this.anInt738].method3748();
		}
		this.anInterface7_2 = this.anInterface7Array3[++this.anInt738] = arg0;
		this.anInterface7_2.method3752();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBII)V")
	public void method665(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "()Lclient!ql;")
	@Override
	public Class132 method3513() {
		return new Class132_Sub2();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZ)V")
	public void method666(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean54 != arg0) {
			this.aBoolean54 = arg0;
			this.method721();
			this.anInt765 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(B)V")
	private void method667() {
		@Pc(15) float local15 = (float) -this.anInt781 * this.aFloat18 / (float) this.anInt782;
		@Pc(27) float local27 = this.aFloat18 * (float) -this.anInt757 / (float) this.anInt752;
		@Pc(41) float local41 = this.aFloat18 * (float) (this.anInt711 - this.anInt781) / (float) this.anInt782;
		@Pc(56) float local56 = this.aFloat18 * (float) (this.anInt566 - this.anInt757) / (float) this.anInt752;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local41 != local15 && local27 != local56) {
			OpenGL.glOrtho((double) local15, (double) local41, (double) -local56, (double) -local27, (double) ((float) this.anInt773 - this.aFloat24), (double) ((float) this.anInt772 - this.aFloat24));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
	@Override
	public void method3480(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BZ)V")
	public void method668(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean46) {
			this.aBoolean46 = arg0;
			this.method719();
			this.anInt765 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3525(@OriginalArg(0) Canvas arg0) {
		this.aLong23 = 0L;
		this.aCanvas4 = null;
		if (arg0 == null || arg0 == this.aCanvas3) {
			this.aLong23 = this.aLong22;
			this.aCanvas4 = this.aCanvas3;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable1.get(arg0);
			this.aLong23 = local26;
			this.aCanvas4 = arg0;
		}
		if (this.aCanvas4 == null || this.aLong23 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong23);
		this.method662();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method3529(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt747;
		if (local15 || this.aFloat15 != arg1 || this.aFloat9 != arg2) {
			this.aFloat15 = arg1;
			this.aFloat9 = arg2;
			this.anInt747 = arg0;
			if (local15) {
				this.aFloat26 = (float) (this.anInt747 & 0xFF0000) / 1.671168E7F;
				this.aFloat19 = (float) (this.anInt747 & 0xFF) / 255.0F;
				this.aFloat8 = (float) (this.anInt747 & 0xFF00) / 65280.0F;
				this.method653();
			}
			this.method707();
		}
		if (this.aFloatArray5[0] == arg3 && arg4 == this.aFloatArray5[1] && this.aFloatArray5[2] == arg5) {
			return;
		}
		this.aFloatArray5[1] = arg4;
		this.aFloatArray5[2] = arg5;
		this.aFloatArray5[0] = arg3;
		this.aFloatArray4[0] = -arg3;
		this.aFloatArray4[1] = -arg4;
		this.aFloatArray4[2] = -arg5;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray6[1] = arg4 * local142;
		this.aFloatArray6[0] = arg3 * local142;
		this.aFloatArray6[2] = local142 * arg5;
		this.aFloatArray3[1] = -this.aFloatArray6[1];
		this.aFloatArray3[0] = -this.aFloatArray6[0];
		this.aFloatArray3[2] = -this.aFloatArray6[2];
		this.method671();
		this.anInt755 = (int) (arg5 * 256.0F / arg4);
		this.anInt769 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIIB[B)Lclient!ph;")
	public Interface8 method669(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface8) (this.aBoolean56 && (!arg0 || this.aBoolean59) ? new Class82_Sub1(this, 5123, arg2, arg1, arg0) : new Class97_Sub2(this, 5123, arg2, arg1));
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(FFF)V")
	@Override
	public void method3521(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static387.aFloat98 = arg1;
		Static171.aFloat40 = arg0;
		Static191.aFloat60 = arg2;
	}

	@OriginalMember(owner = "client!bl", name = "x", descriptor = "()Z")
	@Override
	public boolean method3555() {
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "(I)V")
	@Override
	public void method3553(@OriginalArg(0) int arg0) {
		this.method708(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!bl", name = "A", descriptor = "()Z")
	@Override
	public boolean method3563() {
		return this.aClass6_Sub21_Sub1_1 != null && this.aClass6_Sub21_Sub1_1.method3448();
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method3506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method646();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method708(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean45) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean45) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method3545(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method3503();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZZ)V")
	public void method670(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean62) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt765 &= 0xFFFFFFE0;
		this.aBoolean62 = arg0;
	}

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "(I)V")
	public void method671() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray6, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "()I")
	@Override
	public int method3478() {
		return this.anInt772;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([Lclient!cd;Lclient!ql;[Lclient!ni;I)V")
	@Override
	public void method3566(@OriginalArg(0) Class39[] arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) Class48_Sub7[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method4910(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(IIIIII)Z")
	@Override
	public boolean method3511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass132_Sub2_3.aFloat71 + this.aClass132_Sub2_3.aFloat73 * (float) arg2 + (float) arg0 * this.aClass132_Sub2_3.aFloat79 + (float) arg1 * this.aClass132_Sub2_3.aFloat75;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass132_Sub2_3.aFloat71 + (float) arg3 * this.aClass132_Sub2_3.aFloat79 + (float) arg4 * this.aClass132_Sub2_3.aFloat75 + (float) arg5 * this.aClass132_Sub2_3.aFloat73;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt773 > local28 && (float) this.anInt773 > local59 || !(!(local28 > (float) this.anInt772) || !((float) this.anInt772 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) (((float) arg0 * this.aClass132_Sub2_3.aFloat82 + (float) arg1 * this.aClass132_Sub2_3.aFloat74 + this.aClass132_Sub2_3.aFloat81 * (float) arg2 + this.aClass132_Sub2_3.aFloat72) * (float) this.anInt782 / local28);
		@Pc(155) int local155 = (int) (((float) arg4 * this.aClass132_Sub2_3.aFloat74 + this.aClass132_Sub2_3.aFloat82 * (float) arg3 + (float) arg5 * this.aClass132_Sub2_3.aFloat81 + this.aClass132_Sub2_3.aFloat72) * (float) this.anInt782 / local59);
		if (this.aFloat21 > (float) local123 && this.aFloat21 > (float) local155 || this.aFloat11 < (float) local123 && (float) local155 > this.aFloat11) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt752 * (this.aClass132_Sub2_3.aFloat77 * (float) arg0 + (float) arg1 * this.aClass132_Sub2_3.aFloat80 + (float) arg2 * this.aClass132_Sub2_3.aFloat78 + this.aClass132_Sub2_3.aFloat76) / local28);
			@Pc(245) int local245 = (int) ((this.aClass132_Sub2_3.aFloat76 + (float) arg3 * this.aClass132_Sub2_3.aFloat77 + this.aClass132_Sub2_3.aFloat80 * (float) arg4 + this.aClass132_Sub2_3.aFloat78 * (float) arg5) * (float) this.anInt752 / local59);
			return (!(this.aFloat25 > (float) local213) || !((float) local245 < this.aFloat25)) && (!((float) local213 > this.aFloat14) || !((float) local245 > this.aFloat14));
		}
	}

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "()Z")
	@Override
	public boolean method3522() {
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "(B)V")
	private void method672() {
		this.aClass132_Sub2_3 = new Class132_Sub2();
		this.aClass132_Sub2_4 = new Class132_Sub2();
		this.aClass40Array1 = new Class40[this.anInt760];
		this.aClass40_Sub3_1 = new Class40_Sub3(this, 3553, 6408, 1, 1);
		this.aClass40_Sub3_2 = new Class40_Sub3(this, 3553, 6408, 1, 1);
		this.aClass40_Sub3_3 = new Class40_Sub3(this, 3553, 6408, 1, 1);
		this.aClass39_Sub2_2 = new Class39_Sub2(this);
		this.aClass39_Sub2_4 = new Class39_Sub2(this);
		this.aClass39_Sub2_7 = new Class39_Sub2(this);
		this.aClass39_Sub2_6 = new Class39_Sub2(this);
		this.aClass39_Sub2_1 = new Class39_Sub2(this);
		this.aClass39_Sub2_8 = new Class39_Sub2(this);
		this.aClass39_Sub2_10 = new Class39_Sub2(this);
		this.aClass39_Sub2_9 = new Class39_Sub2(this);
		this.aClass39_Sub2_3 = new Class39_Sub2(this);
		this.aClass39_Sub2_5 = new Class39_Sub2(this);
		if (this.aBoolean60) {
			this.aClass166_1 = new Class166(this);
			this.aClass166_2 = new Class166(this);
		}
	}

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "()Z")
	@Override
	public boolean method3530() {
		return this.aClass264_1.method5951();
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(IIII)V")
	@Override
	public void method3519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt782 = arg2;
		this.anInt781 = arg0;
		this.anInt757 = arg1;
		this.anInt752 = arg3;
		this.method683();
		this.method675();
		if (this.anInt767 == 3) {
			this.method667();
		} else if (this.anInt767 == 2) {
			this.method724();
			return;
		}
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(II)V")
	public void method673(@OriginalArg(1) int arg0) {
		Static243.aFloatArray21[3] = (float) (arg0 >>> 24) / 255.0F;
		Static243.aFloatArray21[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static243.aFloatArray21[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static243.aFloatArray21[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static243.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "()Z")
	@Override
	public boolean method3491() {
		return this.aBoolean45 && (!this.method3563() || this.aBoolean66);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!wr;IIII)Lclient!cd;")
	@Override
	public Class39 method3496(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class39_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "(IIIIII)V")
	@Override
	public void method3579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method646();
		this.method708(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "(I)Lclient!sl;")
	public Class40_Sub4 method674() {
		return this.aClass133_Sub1_1 == null ? null : this.aClass133_Sub1_1.method4772();
	}

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "(B)V")
	private void method675() {
		this.aFloat14 = this.anInt744 - this.anInt757;
		this.aFloat11 = this.anInt749 - this.anInt781;
		this.aFloat21 = this.anInt750 - this.anInt781;
		this.aFloat25 = this.anInt758 - this.anInt757;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3492(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)I")
	@Override
	public int method3532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!be;II)V")
	@Override
	public void method3582(@OriginalArg(1) Class24 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class24_Sub2 local6 = (Class24_Sub2) arg0;
		@Pc(9) Class40_Sub3_Sub1 local9 = local6.aClass40_Sub3_Sub1_2;
		this.method648();
		this.method654(local6.aClass40_Sub3_Sub1_2);
		this.method708(1);
		this.method692(8448, 7681);
		this.method665(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat61 / (float) local9.anInt3384;
		@Pc(46) float local46 = local9.aFloat62 / (float) local9.anInt3385;
		OpenGL.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt750 - arg1), (float) (this.anInt758 - arg2) * local46);
		OpenGL.glVertex2i(this.anInt750, this.anInt758);
		OpenGL.glTexCoord2f((float) (this.anInt750 - arg1) * local39, local46 * (float) (this.anInt744 - arg2));
		OpenGL.glVertex2i(this.anInt750, this.anInt744);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt749 - arg1), local46 * (float) (this.anInt744 - arg2));
		OpenGL.glVertex2i(this.anInt749, this.anInt744);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt749 - arg1), (float) (this.anInt758 - arg2) * local46);
		OpenGL.glVertex2i(this.anInt749, this.anInt758);
		OpenGL.glEnd();
		this.method665(5890, 768, 0);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(ZZ)V")
	public void method677(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean61) {
			this.aBoolean61 = arg0;
			this.method652();
			this.anInt765 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "(II)V")
	public void method678(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method692(7681, 7681);
		} else if (arg0 == 0) {
			this.method692(8448, 8448);
		} else if (arg0 == 2) {
			this.method692(7681, 34165);
		} else if (arg0 == 3) {
			this.method692(8448, 260);
		} else if (arg0 == 4) {
			this.method692(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "()Z")
	@Override
	public boolean method3514() {
		return false;
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3558(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas3 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "(I)V")
	public void method679() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(IIIII)V")
	@Override
	public void method3551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method646();
		this.method708(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!op;)V")
	public void method680(@OriginalArg(1) Interface7 arg0) {
		if (this.aBoolean48) {
			this.method660(arg0);
			this.method664(arg0);
		} else if (this.anInt739 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt739 >= 0) {
				this.anInterface7Array2[this.anInt739].method3749();
			}
			this.anInterface7_1 = this.anInterface7_2 = this.anInterface7Array2[++this.anInt739] = arg0;
			this.anInterface7_1.method3750();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([IIIII)Lclient!ig;")
	@Override
	public Class12 method3512(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class12_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "()I")
	@Override
	public int method3517() {
		@Pc(6) int local6 = this.anInt754;
		this.anInt754 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!na;)V")
	public void method681(@OriginalArg(1) Class132_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method3994(), 0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([BIIZI)Lclient!eo;")
	public Interface5 method682(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface5) (this.aBoolean56 && (!arg3 || this.aBoolean59) ? new Class82_Sub2(this, arg2, arg0, arg1, arg3) : new Class97_Sub1(this, arg2, arg0, arg1));
	}

	@OriginalMember(owner = "client!bl", name = "u", descriptor = "()Z")
	@Override
	public boolean method3550() {
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "(I)V")
	private void method683() {
		@Pc(6) float[] local6 = this.aFloatArray2;
		@Pc(31) float local31 = (float) (-this.anInt781 * this.anInt773) / (float) this.anInt782;
		@Pc(46) float local46 = (float) (this.anInt773 * (this.anInt711 - this.anInt781)) / (float) this.anInt782;
		@Pc(57) float local57 = (float) (this.anInt773 * this.anInt757) / (float) this.anInt752;
		@Pc(72) float local72 = (float) ((this.anInt757 - this.anInt566) * this.anInt773) / (float) this.anInt752;
		if (local46 == local31 || local72 == local57) {
			local6[5] = 1.0F;
			local6[13] = 0.0F;
			local6[1] = 0.0F;
			local6[15] = 1.0F;
			local6[2] = 0.0F;
			local6[7] = 0.0F;
			local6[14] = 0.0F;
			local6[0] = 1.0F;
			local6[10] = 1.0F;
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[8] = 0.0F;
			local6[6] = 0.0F;
			local6[11] = 0.0F;
			local6[12] = 0.0F;
			local6[9] = 0.0F;
		} else {
			@Pc(86) float local86 = (float) this.anInt773 * 2.0F;
			local6[4] = 0.0F;
			local6[10] = this.aFloat17 = (float) -(this.anInt773 + this.anInt772) / (float) (this.anInt772 - this.anInt773);
			local6[8] = (local31 + local46) / (-local31 + local46);
			local6[15] = 0.0F;
			local6[7] = 0.0F;
			local6[5] = local86 / (local57 - local72);
			local6[3] = 0.0F;
			local6[9] = (local57 + local72) / (local57 - local72);
			local6[0] = local86 / (local46 - local31);
			local6[14] = this.aFloat23 = -((float) this.anInt772 * local86) / (float) (this.anInt772 - this.anInt773);
			local6[12] = 0.0F;
			local6[1] = 0.0F;
			local6[2] = 0.0F;
			local6[13] = 0.0F;
			local6[6] = 0.0F;
			local6[11] = -1.0F;
		}
		this.method725();
	}

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "()V")
	@Override
	public void method3546() {
		this.aBoolean57 = false;
		this.aClass264_1.method5949(false, false, 0);
		this.method695();
		this.method652();
	}

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "(I)V")
	@Override
	public void method3567(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "(B)V")
	private void method684() {
		OpenGL.glViewport(this.anInt764, this.anInt751, this.anInt711, this.anInt566);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)V")
	@Override
	public void method3483(@OriginalArg(0) boolean arg0) {
		this.aBoolean42 = arg0;
		this.method721();
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(IIII)V")
	@Override
	public void method3570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt711 < arg2) {
			arg2 = this.anInt711;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt566) {
			arg3 = this.anInt566;
		}
		this.anInt750 = arg0;
		this.anInt749 = arg2;
		this.anInt758 = arg1;
		this.anInt744 = arg3;
		OpenGL.glEnable(3089);
		this.method675();
		this.method691();
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)V")
	public synchronized void method685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub44 local8 = new Class6_Sub44(arg1);
		local8.aLong217 = arg0;
		this.aClass88_3.method1878(local8);
	}

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "()V")
	@Override
	public void method3554() {
		this.anInt758 = 0;
		this.anInt749 = this.anInt711;
		this.anInt744 = this.anInt566;
		this.anInt750 = 0;
		OpenGL.glDisable(3089);
		this.method675();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLclient!eo;)V")
	public void method686(@OriginalArg(1) Interface5 arg0) {
		if (arg0 != this.anInterface5_2) {
			if (this.aBoolean56) {
				OpenGL.glBindBufferARB(34962, arg0.method4748());
			}
			this.anInterface5_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(Lclient!op;I)V")
	public void method687(@OriginalArg(0) Interface7 arg0) {
		if (this.anInt740 < 0 || arg0 != this.anInterface7Array1[this.anInt740]) {
			throw new RuntimeException();
		}
		this.anInterface7Array1[this.anInt740--] = null;
		arg0.method3747();
		if (this.anInt740 < 0) {
			this.anInterface7_1 = null;
		} else {
			this.anInterface7_1 = this.anInterface7Array1[this.anInt740];
			this.anInterface7_1.method3751();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(FIFF)V")
	private void method688(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean58) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean58 = true;
	}

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "(B)V")
	private void method689() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static170.method1617(1000L);
		}
	}

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "(B)V")
	public void method690() {
		if (this.anInt765 == 16) {
			return;
		}
		this.method698();
		this.method677(true);
		this.method670(true);
		this.method666(true);
		this.method708(1);
		this.method678(0);
		this.anInt765 = 16;
	}

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "(IIII)V")
	@Override
	public void method3575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass237_1.method5347(arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "(Z)V")
	private void method691() {
		if (this.anInt749 >= this.anInt750 && this.anInt744 >= this.anInt758) {
			OpenGL.glScissor(this.anInt764 + this.anInt750, this.anInt751 - -this.anInt566 + -this.anInt744, this.anInt749 - this.anInt750, -this.anInt758 + this.anInt744);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(BII)V")
	public void method692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt777 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(20) boolean local20 = false;
		if (arg1 != this.anInt753) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local20 = true;
			this.anInt753 = arg1;
		}
		if (arg0 != this.anInt776) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			this.anInt776 = arg0;
			local20 = true;
		}
		if (local20) {
			this.anInt765 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "(II)I")
	public int method693(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(IIII)V")
	@Override
	public void method3536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 > this.anInt758) {
			this.anInt758 = arg1;
		}
		if (arg0 > this.anInt750) {
			this.anInt750 = arg0;
		}
		if (this.anInt749 > arg2) {
			this.anInt749 = arg2;
		}
		if (this.anInt744 > arg3) {
			this.anInt744 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method675();
		this.method691();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!ii;)V")
	@Override
	public void method3488(@OriginalArg(0) Class115 arg0) {
		this.aClass154_1.method3473(arg0, this);
	}

	@OriginalMember(owner = "client!bl", name = "C", descriptor = "()Z")
	@Override
	public boolean method3569() {
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!jaggl/memory/NativeBuffer;ZII)Lclient!eo;")
	public Interface5 method694(@OriginalArg(1) NativeBuffer arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return (Interface5) (this.aBoolean56 ? new Class82_Sub2(this, arg2, arg0, arg1, false) : new Class97_Sub1(this, arg2, arg0));
	}

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "(Z)V")
	private void method695() {
		@Pc(59) int local59;
		if (this.aBoolean57) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local59 = this.anInt748;
		} else {
			this.bf = (float) (this.anInt772 - this.anInt766) - this.aFloat10;
			this.aFloat12 = this.bf - this.aFloat22 * (float) this.anInt775;
			if (this.aFloat12 < (float) this.anInt773) {
				this.aFloat12 = this.anInt773;
			}
			OpenGL.glFogf(2915, this.aFloat12);
			OpenGL.glFogf(2916, this.bf);
			local59 = this.anInt778;
		}
		Static243.aFloatArray21[1] = (float) (local59 & 0xFF00) / 65280.0F;
		Static243.aFloatArray21[2] = (float) (local59 & 0xFF) / 255.0F;
		Static243.aFloatArray21[0] = (float) (local59 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static243.aFloatArray21, 0);
		if (this.aBoolean57) {
			this.aClass264_1.aClass5_Sub9_1.method5935();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(FI)V")
	public void method696(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat18) {
			this.aFloat18 = arg0;
			if (this.anInt767 == 3) {
				this.method667();
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([I)V")
	@Override
	public void method3524(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt749;
		arg0[1] = this.anInt758;
		arg0[3] = this.anInt744;
		arg0[0] = this.anInt750;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([Lclient!cd;Lclient!ii;Lclient!ql;[Lclient!ni;I)V")
	@Override
	public void method3501(@OriginalArg(0) Class39[] arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(3) Class48_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method3566(arg0, arg2, arg3, arg4);
		this.method3488(arg1);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!cd;Lclient!ii;Lclient!ql;Lclient!ni;I)V")
	@Override
	public void method3571(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(3) Class48_Sub7 arg3) {
		arg0.method4910(arg2, arg3, 0);
		this.method3488(arg1);
	}

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "(Z)V")
	private void method698() {
		if (this.anInt767 != 3) {
			this.anInt767 = 3;
			this.method667();
			this.method712();
			this.anInt765 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIZ)V")
	public synchronized void method699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub44 local8 = new Class6_Sub44(arg1);
		local8.aLong217 = arg0;
		this.aClass88_6.method1878(local8);
	}

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "(II)V")
	public synchronized void method700(@OriginalArg(1) int arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong217 = arg0;
		this.aClass88_7.method1878(local7);
	}

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "(I)V")
	public void method701() {
		if (this.anInt765 == 4) {
			return;
		}
		this.method722();
		this.method677(false);
		this.method668(false);
		this.method670(false);
		this.method666(false);
		this.method718(-2);
		this.method708(1);
		this.method678(0);
		this.anInt765 = 4;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "()Z")
	@Override
	public boolean method3481() {
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!na;I)V")
	public void method702(@OriginalArg(0) Class132_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method3994(), 0);
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "(IIII)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean57) {
			throw new RuntimeException("");
		}
		this.anInt771 = arg3;
		this.anInt748 = arg1;
		this.anInt779 = arg2;
		this.anInt759 = arg0;
		this.aClass264_1.aClass5_Sub9_1.method5934();
		this.method695();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[Lclient!ki;)V")
	@Override
	public void method3504(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub6[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass6_Sub6Array1[local3] = arg1[local3];
		}
		this.anInt746 = arg0;
		if (this.anInt767 != 1) {
			this.method727();
		}
	}

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "()V")
	@Override
	public void method3503() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(FIFFF)V")
	public void method704(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static243.aFloatArray21[3] = arg3;
		Static243.aFloatArray21[2] = arg1;
		Static243.aFloatArray21[1] = arg0;
		Static243.aFloatArray21[0] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static243.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V")
	@Override
	public void method3498(@OriginalArg(0) int arg0) {
		this.method715();
	}

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "()V")
	@Override
	public void method3552() {
		this.method666(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V")
	@Override
	public void method3500(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt724 = arg0;
		this.aClass29_1.method730();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
	@Override
	public void method3479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt773 == arg0 && arg1 == this.anInt772) {
			return;
		}
		this.anInt772 = arg1;
		this.anInt773 = arg0;
		this.method683();
		this.method695();
		if (this.anInt767 == 3) {
			this.method667();
			return;
		}
		if (this.anInt767 != 2) {
			return;
		}
		this.method724();
	}

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "(IIIIII)V")
	@Override
	public void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method646();
		this.method708(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean45) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean45) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!pm;[Lclient!fd;Z)Lclient!wn;")
	@Override
	public Class92 method3476(@OriginalArg(0) Class201 arg0, @OriginalArg(1) Class77[] arg1) {
		return new Class92_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!pt;)V")
	@Override
	public void method3549(@OriginalArg(0) Class6_Sub27 arg0) {
		this.aNativeHeap1 = ((Class6_Sub27_Sub1) arg0).aNativeHeap2;
		if (this.anInterface5_1 != null) {
			return;
		}
		@Pc(16) Class6_Sub15_Sub2 local16 = new Class6_Sub15_Sub2(80);
		if (this.aBoolean52) {
			local16.method3139(-1.0F);
			local16.method3139(-1.0F);
			local16.method3139(0.0F);
			local16.method3139(0.0F);
			local16.method3139(1.0F);
			local16.method3139(1.0F);
			local16.method3139(-1.0F);
			local16.method3139(0.0F);
			local16.method3139(1.0F);
			local16.method3139(1.0F);
			local16.method3139(1.0F);
			local16.method3139(1.0F);
			local16.method3139(0.0F);
			local16.method3139(1.0F);
			local16.method3139(0.0F);
			local16.method3139(-1.0F);
			local16.method3139(1.0F);
			local16.method3139(0.0F);
			local16.method3139(0.0F);
			local16.method3139(0.0F);
		} else {
			local16.method3142(-1.0F);
			local16.method3142(-1.0F);
			local16.method3142(0.0F);
			local16.method3142(0.0F);
			local16.method3142(1.0F);
			local16.method3142(1.0F);
			local16.method3142(-1.0F);
			local16.method3142(0.0F);
			local16.method3142(1.0F);
			local16.method3142(1.0F);
			local16.method3142(1.0F);
			local16.method3142(1.0F);
			local16.method3142(0.0F);
			local16.method3142(1.0F);
			local16.method3142(0.0F);
			local16.method3142(-1.0F);
			local16.method3142(1.0F);
			local16.method3142(0.0F);
			local16.method3142(0.0F);
			local16.method3142(0.0F);
		}
		this.anInterface5_1 = this.method682(local16.aByteArray51, local16.anInt3487, 20, false);
		this.aClass195_2 = new Class195(this, this.anInterface5_1, 5126, 3, 0);
		this.aClass195_1 = new Class195(this, this.anInterface5_1, 5126, 2, 12);
		this.aClass154_1.method3470(this);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIZI)V")
	public void method705(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt761 != arg2) {
			if (arg2 < 0) {
				this.method710();
				this.method654(null);
				this.method678(0);
				if (!this.aBoolean57) {
					this.aClass264_1.method5949(arg0, arg1, 0);
				}
			} else {
				@Pc(24) Class40_Sub3 local24 = this.aClass29_1.method728(arg2);
				@Pc(30) Class229 local30 = super.anInterface11_6.method2466(arg2);
				if (local30.aByte88 == 0 && local30.aByte89 == 0) {
					this.method710();
				} else {
					@Pc(43) int local43 = local30.aBoolean405 ? 64 : 128;
					@Pc(47) int local47 = local43 * 50;
					this.method688((float) (this.anInt737 % local47 * local30.aByte88) / (float) local47, 0.0F, (float) (local30.aByte89 * (this.anInt737 % local47)) / (float) local47);
				}
				if (this.aBoolean57) {
					this.aClass264_1.method5949(arg0, arg1, 3);
					this.method654(local24);
					this.method678(local30.anInt6136);
				} else {
					this.aClass264_1.method5949(arg0, arg1, local30.aByte85);
					this.aClass264_1.method5948(local30.anInt6138, local30.aByte87);
					if (!this.aClass264_1.method5954(local30.anInt6136, local24)) {
						this.method654(local24);
						this.method678(local30.anInt6136);
					}
				}
			}
			this.anInt761 = arg2;
		}
		this.anInt765 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method3547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method646();
		this.method708(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(BII)V")
	public void method706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt764 = arg0;
		this.anInt751 = arg1;
		this.method684();
		this.method691();
	}

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "(Z)V")
	private void method707() {
		Static243.aFloatArray21[3] = 1.0F;
		Static243.aFloatArray21[2] = this.aFloat15 * this.aFloat19;
		Static243.aFloatArray21[1] = this.aFloat8 * this.aFloat15;
		Static243.aFloatArray21[0] = this.aFloat15 * this.aFloat26;
		OpenGL.glLightfv(16384, 4609, Static243.aFloatArray21, 0);
		Static243.aFloatArray21[3] = 1.0F;
		Static243.aFloatArray21[1] = -this.aFloat9 * this.aFloat8;
		Static243.aFloatArray21[0] = -this.aFloat9 * this.aFloat26;
		Static243.aFloatArray21[2] = this.aFloat19 * -this.aFloat9;
		OpenGL.glLightfv(16385, 4609, Static243.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "(II)V")
	public void method708(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt768) {
			return;
		}
		@Pc(17) boolean local17;
		@Pc(13) byte local13;
		if (arg0 == 1) {
			local17 = true;
			local13 = 1;
		} else if (arg0 == 2) {
			local13 = 2;
			local17 = false;
		} else if (arg0 == 128) {
			local17 = true;
			local13 = 3;
		} else {
			local17 = false;
			local13 = 0;
		}
		if (!this.aBoolean43) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean43 = true;
		}
		if (this.aBoolean49 != local17) {
			if (local17) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean49 = local17;
		}
		if (local13 != this.anInt745) {
			if (local13 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local13 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local13 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt745 = local13;
		}
		this.anInt768 = arg0;
		this.anInt765 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "(II)V")
	public synchronized void method709(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub44 local12 = new Class6_Sub44(arg0);
		this.aClass88_5.method1878(local12);
	}

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "(I)V")
	private void method710() {
		if (this.aBoolean58) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean58 = false;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIB)V")
	public void method711(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.method705(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "(I)V")
	private void method712() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass132_Sub2_3.method3994(), 0);
		if (this.aBoolean57) {
			this.aClass264_1.aClass5_Sub9_1.method5934();
		}
		this.method671();
		this.method727();
	}

	@OriginalMember(owner = "client!bl", name = "H", descriptor = "()V")
	@Override
	public void method3580() {
		if (this.aClass6_Sub21_Sub1_1 != null && this.aClass6_Sub21_Sub1_1.method3448()) {
			this.aClass237_1.method5341(this.aClass6_Sub21_Sub1_1);
			this.aClass29_1.method730();
		}
	}

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "(I)V")
	public void method713() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIII)Lclient!lf;")
	@Override
	public Class133 method3486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean65 ? new Class133_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass132_Sub2_3.aFloat71 + this.aClass132_Sub2_3.aFloat75 * (float) arg1 + this.aClass132_Sub2_3.aFloat79 * (float) arg0 + this.aClass132_Sub2_3.aFloat73 * (float) arg2;
		if (local28 < (float) this.anInt773 || local28 > (float) this.anInt772) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass132_Sub2_3.aFloat72 + this.aClass132_Sub2_3.aFloat74 * (float) arg1 + (float) arg0 * this.aClass132_Sub2_3.aFloat82 + (float) arg2 * this.aClass132_Sub2_3.aFloat81) * (float) this.anInt782 / local28);
		@Pc(117) int local117 = (int) ((this.aClass132_Sub2_3.aFloat76 + (float) arg1 * this.aClass132_Sub2_3.aFloat80 + this.aClass132_Sub2_3.aFloat77 * (float) arg0 + (float) arg2 * this.aClass132_Sub2_3.aFloat78) * (float) this.anInt752 / local28);
		if (this.aFloat21 <= (float) local85 && this.aFloat11 >= (float) local85 && this.aFloat25 <= (float) local117 && (float) local117 <= this.aFloat14) {
			arg3[1] = (int) ((float) local117 - this.aFloat25);
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat21);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(Z)V")
	@Override
	public void method3505(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method3510() {
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!ot;Lclient!ot;ILclient!ot;Lclient!ot;)V")
	public void method714(@OriginalArg(0) Class195 arg0, @OriginalArg(1) Class195 arg1, @OriginalArg(3) Class195 arg2, @OriginalArg(4) Class195 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method686(arg3.anInterface5_5);
			OpenGL.glVertexPointer(arg3.aByte61, arg3.aShort67, this.anInterface5_2.method4747(), this.anInterface5_2.method4749() + (long) arg3.aByte60);
			OpenGL.glEnableClientState(32884);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method686(arg0.anInterface5_5);
			OpenGL.glNormalPointer(arg0.aShort67, this.anInterface5_2.method4747(), this.anInterface5_2.method4749() + (long) arg0.aByte60);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method686(arg2.anInterface5_5);
			OpenGL.glColorPointer(arg2.aByte61, arg2.aShort67, this.anInterface5_2.method4747(), this.anInterface5_2.method4749() + (long) arg2.aByte60);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method686(arg1.anInterface5_5);
			OpenGL.glTexCoordPointer(arg1.aByte61, arg1.aShort67, this.anInterface5_2.method4747(), this.anInterface5_2.method4749() + (long) arg1.aByte60);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "(I)V")
	private void method715() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!ql;)V")
	@Override
	public void method3509(@OriginalArg(0) Class132 arg0) {
		this.aClass132_Sub2_3 = (Class132_Sub2) arg0;
		this.aClass132_Sub2_4.method3992(this.aClass132_Sub2_3);
		if (this.anInt767 != 1) {
			this.method712();
		}
	}

	@OriginalMember(owner = "client!bl", name = "u", descriptor = "(I)I")
	private int method716() {
		@Pc(5) int local5 = 0;
		this.aString7 = OpenGL.glGetString(7936).toLowerCase();
		this.aString6 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString7.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString7.indexOf("brian paul") != -1 || this.aString7.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(52) String[] local52 = Static109.method1808(' ', local44.replace('.', ' '));
		if (local52.length >= 2) {
			try {
				@Pc(64) int local64 = Static265.method4063(local52[0]);
				@Pc(70) int local70 = Static265.method4063(local52[1]);
				this.anInt770 = local70 + local64 * 10;
			} catch (@Pc(79) NumberFormatException local79) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt770 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(118) int[] local118 = new int[1];
		OpenGL.glGetIntegerv(34018, local118, 0);
		this.anInt760 = local118[0];
		OpenGL.glGetIntegerv(34929, local118, 0);
		this.anInt762 = local118[0];
		OpenGL.glGetIntegerv(34930, local118, 0);
		this.anInt756 = local118[0];
		if (this.anInt760 < 2 || this.anInt762 < 2 || this.anInt756 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean52 = NativeStream.b();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean56 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean45 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean41 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean50 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean44 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean63 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean40 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean65 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean64 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean47 = false;
		this.aBoolean60 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean48 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean53 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean66 = this.aBoolean48 & this.aBoolean53;
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "(II)I")
	public int method717(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "()V")
	@Override
	public void method3497() {
		if (!this.aBoolean55 || this.anInt711 <= 0 || this.anInt566 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt750;
		@Pc(19) int local19 = this.anInt749;
		@Pc(22) int local22 = this.anInt758;
		@Pc(25) int local25 = this.anInt744;
		this.method3554();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method656();
		this.method677(false);
		this.method668(false);
		this.method670(false);
		this.method666(false);
		this.method654(null);
		this.method718(-2);
		this.method678(1);
		this.method708(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt711, this.anInt566, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.method3570(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(BI)V")
	public void method718(@OriginalArg(1) int arg0) {
		this.method711(true, arg0);
	}

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "(B)V")
	private void method719() {
		if (this.aBoolean46 && !this.aBoolean51) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(FF)V")
	@Override
	public void method3581(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat20 == arg0 && this.aFloat24 == arg1) {
			return;
		}
		this.aFloat20 = arg0;
		this.aFloat24 = arg1;
		this.method725();
		if (this.anInt767 == 3) {
			this.method667();
		} else if (this.anInt767 == 2) {
			this.method724();
			return;
		}
	}

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "()Z")
	@Override
	public boolean method3541() {
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(IBII)V")
	public void method720(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!lf;)V")
	@Override
	public void method3502(@OriginalArg(0) Class133 arg0) {
		this.aClass133_Sub1_1 = (Class133_Sub1) arg0;
	}

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "()Z")
	@Override
	public boolean method3576() {
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "(B)V")
	private void method721() {
		OpenGL.glDepthMask(this.aBoolean54 && this.aBoolean42);
	}

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "(B)V")
	private void method722() {
		if (this.anInt767 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt711 > 0 && this.anInt566 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt711, (double) this.anInt566, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt767 = 1;
		this.anInt765 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(IZ)V")
	public void method723(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean51 != arg0) {
			this.aBoolean51 = arg0;
			this.method719();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(F)V")
	@Override
	public void method3583(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat13) {
			this.aFloat13 = arg0;
			this.method653();
		}
	}

	@OriginalMember(owner = "client!bl", name = "D", descriptor = "()F")
	@Override
	public float method3572() {
		return this.aFloat20;
	}

	@OriginalMember(owner = "client!bl", name = "B", descriptor = "()Lclient!ql;")
	@Override
	public Class132 method3564() {
		return this.aClass132_Sub2_1;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)[I")
	@Override
	public int[] method3487() {
		@Pc(10) int[] local10 = new int[1152];
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			OpenGL.glReadPixelsi(0, this.anInt566 - local12, 36, 1, 32993, this.anInt774, local10, local12 * 36);
		}
		return local10;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II[I[I)Lclient!be;")
	@Override
	public Class24 method3515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static111.method1830(this, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "(I)V")
	private void method724() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray2, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "(I)V")
	private void method725() {
		if (this.aFloat24 == 0.0F) {
			this.aFloatArray2[10] = this.aFloat17;
			this.aFloatArray2[14] = this.aFloat23;
		} else {
			@Pc(17) float local17 = this.aFloat20 / (this.aFloat20 + this.aFloat24);
			@Pc(21) float local21 = local17 * local17;
			@Pc(37) float local37 = -this.aFloat23 * (1.0F - local17) * (1.0F - local17) / this.aFloat24;
			this.aFloatArray2[10] = this.aFloat17 + local37;
			this.aFloatArray2[14] = this.aFloat23 * local21;
		}
		this.aFloat27 = (float) this.anInt772 - this.aFloat24;
		this.aFloat16 = (this.aFloatArray2[14] - (float) this.anInt772) / this.aFloatArray2[10];
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "()Z")
	@Override
	public boolean method3493() {
		return false;
	}

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "()V")
	@Override
	public void method3542() {
		this.aClass237_1.method5345();
	}

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "(B)V")
	private void method727() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt746; local7++) {
			@Pc(14) Class6_Sub6 local14 = this.aClass6_Sub6Array1[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static171.aFloatArray9[0] = local14.method1163();
			Static171.aFloatArray9[1] = local14.method1170();
			Static171.aFloatArray9[2] = local14.method1169();
			Static171.aFloatArray9[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static171.aFloatArray9, 0);
			@Pc(52) int local52 = local14.method1172();
			@Pc(58) float local58 = local14.method1166() / 255.0F;
			Static171.aFloatArray9[0] = local58 * (float) (local52 >> 16 & 0xFF);
			Static171.aFloatArray9[2] = local58 * (float) (local52 & 0xFF);
			Static171.aFloatArray9[1] = local58 * (float) (local52 >> 8 & 0xFF);
			OpenGL.glLightfv(local18, 4609, Static171.aFloatArray9, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method1162() * local14.method1162()));
			OpenGL.glEnable(local18);
		}
		while (this.anInt780 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt780 = this.anInt746;
	}
}
