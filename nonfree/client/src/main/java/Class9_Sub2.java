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

@OriginalClass("client!ap")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!ap", name = "Vb", descriptor = "I")
	public int anInt702;

	@OriginalMember(owner = "client!ap", name = "Mc", descriptor = "I")
	private int anInt742;

	@OriginalMember(owner = "client!ap", name = "Dd", descriptor = "I")
	private int anInt783;

	@OriginalMember(owner = "client!ap", name = "Td", descriptor = "I")
	public int anInt799;

	@OriginalMember(owner = "client!ap", name = "le", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!ap", name = "me", descriptor = "I")
	public int anInt810;

	@OriginalMember(owner = "client!ap", name = "re", descriptor = "Lclient!jt;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!ap", name = "se", descriptor = "Lclient!jt;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!ap", name = "ze", descriptor = "I")
	public int anInt815;

	@OriginalMember(owner = "client!ap", name = "Be", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!ap", name = "Ce", descriptor = "I")
	public int anInt817;

	@OriginalMember(owner = "client!ap", name = "Je", descriptor = "Z")
	public boolean aBoolean44;

	@OriginalMember(owner = "client!ap", name = "Ke", descriptor = "Lclient!rh;")
	public Class23_Sub2 aClass23_Sub2_1;

	@OriginalMember(owner = "client!ap", name = "Me", descriptor = "[Lclient!uda;")
	private Class132[] aClass132Array1;

	@OriginalMember(owner = "client!ap", name = "Oe", descriptor = "Z")
	private boolean aBoolean46;

	@OriginalMember(owner = "client!ap", name = "Pe", descriptor = "Z")
	public boolean aBoolean47;

	@OriginalMember(owner = "client!ap", name = "Qe", descriptor = "Lclient!rh;")
	public Class23_Sub2 aClass23_Sub2_2;

	@OriginalMember(owner = "client!ap", name = "Re", descriptor = "Lclient!jl;")
	public Class166 aClass166_1;

	@OriginalMember(owner = "client!ap", name = "Te", descriptor = "Lclient!rh;")
	public Class23_Sub2 aClass23_Sub2_3;

	@OriginalMember(owner = "client!ap", name = "Ue", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!ap", name = "We", descriptor = "Z")
	private boolean aBoolean49;

	@OriginalMember(owner = "client!ap", name = "Xe", descriptor = "Lclient!pb;")
	public Class8_Sub2 aClass8_Sub2_3;

	@OriginalMember(owner = "client!ap", name = "Ze", descriptor = "Z")
	private boolean aBoolean50;

	@OriginalMember(owner = "client!ap", name = "af", descriptor = "F")
	private float aFloat15;

	@OriginalMember(owner = "client!ap", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!ap", name = "cf", descriptor = "Z")
	private boolean aBoolean51;

	@OriginalMember(owner = "client!ap", name = "df", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!ap", name = "ef", descriptor = "Lclient!rl;")
	private Interface18 anInterface18_1;

	@OriginalMember(owner = "client!ap", name = "gf", descriptor = "I")
	private int anInt820;

	@OriginalMember(owner = "client!ap", name = "hf", descriptor = "Lclient!rh;")
	public Class23_Sub2 aClass23_Sub2_4;

	@OriginalMember(owner = "client!ap", name = "lf", descriptor = "Lclient!rh;")
	public Class23_Sub2 aClass23_Sub2_5;

	@OriginalMember(owner = "client!ap", name = "mf", descriptor = "F")
	public float aFloat16;

	@OriginalMember(owner = "client!ap", name = "nf", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!ap", name = "qf", descriptor = "Lclient!fm;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ap", name = "rf", descriptor = "Z")
	private boolean aBoolean54;

	@OriginalMember(owner = "client!ap", name = "tf", descriptor = "Z")
	private boolean aBoolean55;

	@OriginalMember(owner = "client!ap", name = "vf", descriptor = "I")
	public int anInt825;

	@OriginalMember(owner = "client!ap", name = "xf", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!ap", name = "zf", descriptor = "Lclient!rh;")
	public Class23_Sub2 aClass23_Sub2_6;

	@OriginalMember(owner = "client!ap", name = "Bf", descriptor = "Z")
	public boolean aBoolean57;

	@OriginalMember(owner = "client!ap", name = "Ef", descriptor = "Z")
	private boolean aBoolean58;

	@OriginalMember(owner = "client!ap", name = "Ff", descriptor = "Lclient!jl;")
	public Class166 aClass166_2;

	@OriginalMember(owner = "client!ap", name = "Gf", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!ap", name = "Hf", descriptor = "Z")
	private boolean aBoolean59;

	@OriginalMember(owner = "client!ap", name = "Jf", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!ap", name = "Kf", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!ap", name = "Lf", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!ap", name = "Pf", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!ap", name = "Qf", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!ap", name = "Uf", descriptor = "Lclient!pb;")
	public Class8_Sub2 aClass8_Sub2_4;

	@OriginalMember(owner = "client!ap", name = "Xf", descriptor = "Z")
	public boolean aBoolean61;

	@OriginalMember(owner = "client!ap", name = "Yf", descriptor = "Lclient!hea;")
	private Class132_Sub1_Sub1 aClass132_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ap", name = "ag", descriptor = "Lclient!ev;")
	private Class65_Sub2 aClass65_Sub2_1;

	@OriginalMember(owner = "client!ap", name = "bg", descriptor = "Lclient!rl;")
	private Interface18 anInterface18_2;

	@OriginalMember(owner = "client!ap", name = "eg", descriptor = "Z")
	public boolean aBoolean62;

	@OriginalMember(owner = "client!ap", name = "fg", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!ap", name = "gg", descriptor = "Z")
	public boolean aBoolean63;

	@OriginalMember(owner = "client!ap", name = "hg", descriptor = "Lclient!rh;")
	public Class23_Sub2 aClass23_Sub2_7;

	@OriginalMember(owner = "client!ap", name = "jg", descriptor = "F")
	private float aFloat27;

	@OriginalMember(owner = "client!ap", name = "kg", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!ap", name = "lg", descriptor = "F")
	private float aFloat28;

	@OriginalMember(owner = "client!ap", name = "ng", descriptor = "Z")
	public boolean aBoolean65;

	@OriginalMember(owner = "client!ap", name = "pg", descriptor = "Z")
	private boolean aBoolean66;

	@OriginalMember(owner = "client!ap", name = "sg", descriptor = "Lclient!rh;")
	public Class23_Sub2 aClass23_Sub2_8;

	@OriginalMember(owner = "client!ap", name = "ug", descriptor = "Z")
	private boolean aBoolean67;

	@OriginalMember(owner = "client!ap", name = "xg", descriptor = "I")
	public int anInt842;

	@OriginalMember(owner = "client!ap", name = "yg", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!ap", name = "Bg", descriptor = "Lclient!kp;")
	public Class132_Sub1 aClass132_Sub1_2;

	@OriginalMember(owner = "client!ap", name = "Cg", descriptor = "I")
	public int anInt845;

	@OriginalMember(owner = "client!ap", name = "Dg", descriptor = "Z")
	public boolean aBoolean68;

	@OriginalMember(owner = "client!ap", name = "Hg", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!ap", name = "Jg", descriptor = "F")
	private float aFloat32;

	@OriginalMember(owner = "client!ap", name = "Kg", descriptor = "Lclient!ei;")
	public Class89 aClass89_1;

	@OriginalMember(owner = "client!ap", name = "Lg", descriptor = "Lclient!rh;")
	public Class23_Sub2 aClass23_Sub2_9;

	@OriginalMember(owner = "client!ap", name = "Mg", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!ap", name = "Pg", descriptor = "I")
	public int anInt848;

	@OriginalMember(owner = "client!ap", name = "Sg", descriptor = "Z")
	public boolean aBoolean69;

	@OriginalMember(owner = "client!ap", name = "Vg", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!ap", name = "Wg", descriptor = "Lclient!rh;")
	public Class23_Sub2 aClass23_Sub2_10;

	@OriginalMember(owner = "client!ap", name = "Zg", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!ap", name = "ch", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!ap", name = "dh", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!ap", name = "tc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!ap", name = "de", descriptor = "I")
	public int anInt807 = 128;

	@OriginalMember(owner = "client!ap", name = "he", descriptor = "Lclient!kd;")
	private final Class178 aClass178_1 = new Class178();

	@OriginalMember(owner = "client!ap", name = "ie", descriptor = "Lclient!pb;")
	private final Class8_Sub2 aClass8_Sub2_1 = new Class8_Sub2();

	@OriginalMember(owner = "client!ap", name = "je", descriptor = "Lclient!pb;")
	public final Class8_Sub2 aClass8_Sub2_2 = new Class8_Sub2();

	@OriginalMember(owner = "client!ap", name = "ne", descriptor = "I")
	public int anInt811 = 3;

	@OriginalMember(owner = "client!ap", name = "qe", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!ap", name = "ke", descriptor = "I")
	public int anInt809 = 8;

	@OriginalMember(owner = "client!ap", name = "oe", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_5 = new Class211();

	@OriginalMember(owner = "client!ap", name = "te", descriptor = "I")
	private int anInt812 = -1;

	@OriginalMember(owner = "client!ap", name = "we", descriptor = "I")
	private int anInt814 = -1;

	@OriginalMember(owner = "client!ap", name = "xe", descriptor = "[Lclient!jt;")
	private final Interface9[] anInterface9Array2 = new Interface9[4];

	@OriginalMember(owner = "client!ap", name = "ve", descriptor = "I")
	private int anInt813 = -1;

	@OriginalMember(owner = "client!ap", name = "ue", descriptor = "[Lclient!jt;")
	private final Interface9[] anInterface9Array1 = new Interface9[4];

	@OriginalMember(owner = "client!ap", name = "ye", descriptor = "[Lclient!jt;")
	private final Interface9[] anInterface9Array3 = new Interface9[4];

	@OriginalMember(owner = "client!ap", name = "Ae", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_6;

	@OriginalMember(owner = "client!ap", name = "De", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_7;

	@OriginalMember(owner = "client!ap", name = "Ee", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_8;

	@OriginalMember(owner = "client!ap", name = "Fe", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_9;

	@OriginalMember(owner = "client!ap", name = "Ge", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_10;

	@OriginalMember(owner = "client!ap", name = "He", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_11;

	@OriginalMember(owner = "client!ap", name = "Ie", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_12;

	@OriginalMember(owner = "client!ap", name = "Ye", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!ap", name = "pf", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!ap", name = "jf", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!ap", name = "Ve", descriptor = "[F")
	private final float[] aFloatArray1;

	@OriginalMember(owner = "client!ap", name = "Af", descriptor = "I")
	public int anInt827;

	@OriginalMember(owner = "client!ap", name = "Df", descriptor = "I")
	public int anInt828;

	@OriginalMember(owner = "client!ap", name = "If", descriptor = "I")
	public int anInt829;

	@OriginalMember(owner = "client!ap", name = "yf", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!ap", name = "Zf", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!ap", name = "sf", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!ap", name = "of", descriptor = "[F")
	private final float[] aFloatArray2;

	@OriginalMember(owner = "client!ap", name = "Cf", descriptor = "[Lclient!od;")
	private final Class6_Sub29[] aClass6_Sub29Array1;

	@OriginalMember(owner = "client!ap", name = "uf", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!ap", name = "og", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!ap", name = "cg", descriptor = "I")
	public int anInt834;

	@OriginalMember(owner = "client!ap", name = "kf", descriptor = "Z")
	private boolean aBoolean53;

	@OriginalMember(owner = "client!ap", name = "rg", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!ap", name = "Rf", descriptor = "F")
	private float aFloat25;

	@OriginalMember(owner = "client!ap", name = "Mf", descriptor = "F")
	private float aFloat22;

	@OriginalMember(owner = "client!ap", name = "Gg", descriptor = "[F")
	private final float[] aFloatArray5;

	@OriginalMember(owner = "client!ap", name = "Wf", descriptor = "I")
	public int anInt832;

	@OriginalMember(owner = "client!ap", name = "wg", descriptor = "I")
	public int anInt841;

	@OriginalMember(owner = "client!ap", name = "Fg", descriptor = "F")
	private float aFloat30;

	@OriginalMember(owner = "client!ap", name = "dg", descriptor = "[F")
	public final float[] aFloatArray3;

	@OriginalMember(owner = "client!ap", name = "Of", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!ap", name = "Sf", descriptor = "I")
	public int anInt831;

	@OriginalMember(owner = "client!ap", name = "zg", descriptor = "I")
	public int anInt843;

	@OriginalMember(owner = "client!ap", name = "Ig", descriptor = "F")
	private float aFloat31;

	@OriginalMember(owner = "client!ap", name = "Ne", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!ap", name = "Ag", descriptor = "I")
	public int anInt844;

	@OriginalMember(owner = "client!ap", name = "Tf", descriptor = "F")
	private float aFloat26;

	@OriginalMember(owner = "client!ap", name = "Eg", descriptor = "[F")
	private final float[] aFloatArray4;

	@OriginalMember(owner = "client!ap", name = "Og", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!ap", name = "vg", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!ap", name = "Rg", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!ap", name = "Nf", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!ap", name = "Qg", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!ap", name = "Tg", descriptor = "I")
	public int anInt851;

	@OriginalMember(owner = "client!ap", name = "mg", descriptor = "I")
	public int anInt837;

	@OriginalMember(owner = "client!ap", name = "Ng", descriptor = "F")
	private float aFloat34;

	@OriginalMember(owner = "client!ap", name = "Xg", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!ap", name = "qg", descriptor = "Lclient!jh;")
	public Class6_Sub26_Sub1 aClass6_Sub26_Sub1_1;

	@OriginalMember(owner = "client!ap", name = "bh", descriptor = "[I")
	public int[] anIntArray51;

	@OriginalMember(owner = "client!ap", name = "ah", descriptor = "[I")
	public int[] anIntArray50;

	@OriginalMember(owner = "client!ap", name = "eh", descriptor = "[B")
	public final byte[] aByteArray22;

	@OriginalMember(owner = "client!ap", name = "fh", descriptor = "[I")
	public int[] anIntArray52;

	@OriginalMember(owner = "client!ap", name = "id", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas3;

	@OriginalMember(owner = "client!ap", name = "lb", descriptor = "Ljava/awt/Canvas;")
	private Canvas lb;

	@OriginalMember(owner = "client!ap", name = "Yd", descriptor = "I")
	public final int anInt804;

	@OriginalMember(owner = "client!ap", name = "Tb", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ap", name = "vc", descriptor = "J")
	private final long aLong13;

	@OriginalMember(owner = "client!ap", name = "Yb", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!ap", name = "tg", descriptor = "I")
	public final int anInt839;

	@OriginalMember(owner = "client!ap", name = "ig", descriptor = "Z")
	private boolean aBoolean64;

	@OriginalMember(owner = "client!ap", name = "Yg", descriptor = "Z")
	public boolean aBoolean71;

	@OriginalMember(owner = "client!ap", name = "wf", descriptor = "Z")
	public boolean aBoolean56;

	@OriginalMember(owner = "client!ap", name = "Vf", descriptor = "Z")
	public boolean aBoolean60;

	@OriginalMember(owner = "client!ap", name = "Se", descriptor = "Z")
	private boolean aBoolean48;

	@OriginalMember(owner = "client!ap", name = "ff", descriptor = "Z")
	public boolean aBoolean52;

	@OriginalMember(owner = "client!ap", name = "Ug", descriptor = "Z")
	public boolean aBoolean70;

	@OriginalMember(owner = "client!ap", name = "Le", descriptor = "Z")
	private final boolean aBoolean45;

	@OriginalMember(owner = "client!ap", name = "be", descriptor = "Lclient!ui;")
	private final Class316 aClass316_1;

	@OriginalMember(owner = "client!ap", name = "pe", descriptor = "Lclient!ef;")
	public final Class84 aClass84_1;

	@OriginalMember(owner = "client!ap", name = "ae", descriptor = "Lclient!lca;")
	private final Class193 aClass193_1;

	@OriginalMember(owner = "client!ap", name = "ee", descriptor = "Lclient!vn;")
	private Class6_Sub9_Sub1 aClass6_Sub9_Sub1_1;

	@OriginalMember(owner = "client!ap", name = "fe", descriptor = "Lclient!hn;")
	private final Class139 aClass139_1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;I)V")
	public Class9_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class143();
		new Class305(16);
		this.aClass211_6 = new Class211();
		this.aClass211_7 = new Class211();
		this.aClass211_8 = new Class211();
		this.aClass211_9 = new Class211();
		this.aClass211_10 = new Class211();
		this.aClass211_11 = new Class211();
		this.aClass211_12 = new Class211();
		this.aFloat14 = -1.0F;
		this.anInt823 = 8448;
		this.anInt821 = 0;
		this.aFloatArray1 = new float[4];
		this.anInt827 = -1;
		this.anInt828 = 50;
		this.anInt829 = 0;
		this.aFloat18 = 1.0F;
		this.anInt833 = 0;
		this.aFloat17 = 3584.0F;
		this.aFloatArray2 = new float[4];
		this.aClass6_Sub29Array1 = new Class6_Sub29[Static137.anInt2909];
		this.anInt824 = -1;
		this.aFloat29 = 1.0F;
		this.anInt834 = 0;
		this.aBoolean53 = true;
		this.anInt838 = 0;
		this.aFloat25 = 1.0F;
		this.aFloat22 = -1.0F;
		this.aFloatArray5 = new float[16];
		this.anInt832 = -1;
		this.anInt841 = 512;
		this.aFloat30 = -1.0F;
		this.aFloatArray3 = new float[4];
		this.aFloat24 = 3584.0F;
		this.anInt831 = 0;
		this.anInt843 = 3584;
		this.aFloat31 = 0.0F;
		this.anInt818 = 0;
		this.anInt844 = -1;
		this.aFloat26 = 1.0F;
		this.aFloatArray4 = new float[4];
		this.anInt847 = 0;
		this.anInt840 = 8448;
		this.anInt850 = 0;
		this.aFloat23 = 1.0F;
		this.anInt849 = -1;
		this.anInt851 = 0;
		this.anInt837 = 512;
		this.aFloat34 = 3000.0F;
		this.aFloat35 = -1.0F;
		this.aClass6_Sub26_Sub1_1 = new Class6_Sub26_Sub1(8192);
		this.anIntArray51 = new int[1];
		this.anIntArray50 = new int[1];
		this.aByteArray22 = new byte[16384];
		this.anIntArray52 = new int[1];
		this.lb = this.aCanvas3 = arg0;
		this.anInt804 = arg2;
		if (!Static234.method4121("jaclib")) {
			throw new RuntimeException("");
		} else if (Static234.method4121("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong12 = this.aLong13 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt804);
				if (this.aLong13 == 0L) {
					throw new RuntimeException("");
				}
				this.method788();
				@Pc(320) int local320 = this.method771();
				if (local320 != 0) {
					throw new RuntimeException("");
				}
				this.anInt839 = this.aBoolean65 ? 33639 : 5121;
				@Pc(346) int local346;
				if (this.aString8.indexOf("radeon") != -1) {
					local346 = 0;
					@Pc(348) boolean local348 = false;
					@Pc(350) boolean local350 = false;
					@Pc(359) String[] local359 = Static288.method4721(this.aString8.replace('/', ' '), ' ');
					for (@Pc(361) int local361 = 0; local361 < local359.length; local361++) {
						@Pc(367) String local367 = local359[local361];
						try {
							if (local367.length() > 0) {
								if (local367.charAt(0) == 'x' && local367.length() >= 3 && Static251.method4415(local367.substring(1, 3))) {
									local367 = local367.substring(1);
									local350 = true;
								}
								if (local367.equals("hd")) {
									local348 = true;
								} else {
									if (local367.startsWith("hd")) {
										local367 = local367.substring(2);
										local348 = true;
									}
									if (local367.length() >= 4 && Static251.method4415(local367.substring(0, 4))) {
										local346 = Static228.method4072(local367.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(437) Exception local437) {
						}
					}
					if (!local350 && !local348) {
						if (local346 >= 7000 && local346 <= 7999) {
							this.aBoolean64 = false;
						}
						if (local346 >= 7000 && local346 <= 9250) {
							this.aBoolean71 = false;
						}
					}
					if (!local348 || local346 < 4000) {
						this.aBoolean56 = false;
					}
					this.aBoolean60 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean48 = this.aBoolean64;
					this.aBoolean52 = true;
				}
				if (this.aString7.indexOf("intel") != -1) {
					this.aBoolean70 = false;
				}
				this.aBoolean45 = !this.aString7.equals("s3 graphics");
				if (this.aBoolean64) {
					try {
						@Pc(521) int[] local521 = new int[1];
						OpenGL.glGenBuffersARB(1, local521, 0);
					} catch (@Pc(527) Throwable local527) {
						throw new RuntimeException("");
					}
				}
				Static361.method5811(true, false);
				this.aBoolean43 = true;
				this.aClass316_1 = new Class316(this, super.anInterface2_11);
				this.method777();
				this.aClass84_1 = new Class84(this);
				this.aClass193_1 = new Class193(this);
				if (this.aClass193_1.method4783()) {
					this.aClass6_Sub9_Sub1_1 = new Class6_Sub9_Sub1(this);
					if (!this.aClass6_Sub9_Sub1_1.method7859()) {
						this.aClass6_Sub9_Sub1_1.method7849();
						this.aClass6_Sub9_Sub1_1 = null;
					}
				}
				this.aClass139_1 = new Class139(this);
				this.method756();
				this.method828();
				OpenGL.glClear(16640);
				local346 = 0;
				while (true) {
					try {
						this.anOpenGL1.swapBuffers();
						break;
					} catch (@Pc(606) Exception local606) {
						if (local346++ > 5) {
							throw new RuntimeException("");
						}
						Static566.method8004(100L);
					}
				}
				OpenGL.glClear(16384);
			} catch (@Pc(626) Throwable local626) {
				local626.printStackTrace();
				this.method5418();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)V")
	public void method747(@OriginalArg(0) int arg0) {
		this.method774(true, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt824 = arg1;
		this.anInt844 = arg2;
		this.anInt834 = arg3;
		this.aBoolean63 = true;
		this.anInt845 = arg0;
		this.aClass139_1.method3795(3, false, 0, 0, false);
		this.aClass139_1.aClass104_Sub1_1.method2652();
		this.method793();
		this.method787();
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(II)I")
	public int method749(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ap", name = "A", descriptor = "()Z")
	@Override
	public boolean method5458() {
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class19_Sub2 local6 = (Class19_Sub2) arg1;
		@Pc(9) Class132_Sub1_Sub1 local9 = local6.aClass132_Sub1_Sub1_2;
		this.method817();
		this.method814(local6.aClass132_Sub1_Sub1_2);
		this.method804(1);
		this.method797(7681, 8448);
		this.method798(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat98 / (float) local9.anInt4225;
		@Pc(46) float local46 = local9.aFloat99 / (float) local9.anInt4227;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt818 - arg2), local46 * (float) (this.anInt847 - arg3));
		OpenGL.glVertex2i(this.anInt818, this.anInt847);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt818 - arg2), local46 * (float) (this.anInt821 - arg3));
		OpenGL.glVertex2i(this.anInt818, this.anInt821);
		OpenGL.glTexCoord2f((float) (this.anInt838 - arg2) * local39, local46 * (float) (this.anInt821 - arg3));
		OpenGL.glVertex2i(this.anInt838, this.anInt821);
		OpenGL.glTexCoord2f((float) (this.anInt838 - arg2) * local39, local46 * (float) (this.anInt847 - arg3));
		OpenGL.glVertex2i(this.anInt838, this.anInt847);
		OpenGL.glEnd();
		this.method798(0, 768, 5890);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V")
	private void method750() {
		if (this.anInt819 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt702 > 0 && this.anInt799 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt702, (double) this.anInt799, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt852 &= 0xFFFFFFE7;
		this.anInt819 = 1;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V")
	private void method751() {
		OpenGL.glDepthMask(this.aBoolean46 && this.aBoolean53);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(JZ)V")
	public synchronized void method752(@OriginalArg(0) long arg0) {
		@Pc(11) Class6 local11 = new Class6();
		local11.aLong252 = arg0;
		this.aClass211_12.method5173(local11);
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(II)V")
	public void method753(@OriginalArg(1) int arg0) {
		Static76.aFloatArray6[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static76.aFloatArray6[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static76.aFloatArray6[3] = (float) (arg0 >>> 24) / 255.0F;
		Static76.aFloatArray6[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static76.aFloatArray6, 0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIF)Lclient!od;")
	@Override
	public Class6_Sub29 method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub29_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "(I)V")
	private void method754() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt835; local7++) {
			@Pc(14) Class6_Sub29 local14 = this.aClass6_Sub29Array1[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static153.aFloatArray19[0] = local14.method6164();
			Static153.aFloatArray19[1] = local14.method6161();
			Static153.aFloatArray19[2] = local14.method6165();
			Static153.aFloatArray19[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static153.aFloatArray19, 0);
			@Pc(52) int local52 = local14.method6157();
			@Pc(58) float local58 = local14.method6158() / 255.0F;
			Static153.aFloatArray19[2] = local58 * (float) (local52 & 0xFF);
			Static153.aFloatArray19[0] = local58 * (float) (local52 >> 16 & 0xFF);
			Static153.aFloatArray19[1] = local58 * (float) (local52 >> 8 & 0xFF);
			OpenGL.glLightfv(local18, 4609, Static153.aFloatArray19, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method6160() * local14.method6160()));
			OpenGL.glEnable(local18);
		}
		while (local7 < this.anInt830) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt830 = this.anInt835;
	}

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "(I)V")
	private void method755() {
		OpenGL.glViewport(this.anInt833, this.anInt850, this.anInt702, this.anInt799);
	}

	@OriginalMember(owner = "client!ap", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt849 != arg0;
		if (local15 || this.aFloat35 != arg1 || this.aFloat14 != arg2) {
			this.anInt849 = arg0;
			this.aFloat14 = arg2;
			this.aFloat35 = arg1;
			if (local15) {
				this.aFloat23 = (float) (this.anInt849 & 0xFF00) / 65280.0F;
				this.aFloat18 = (float) (this.anInt849 & 0xFF) / 255.0F;
				this.aFloat29 = (float) (this.anInt849 & 0xFF0000) / 1.671168E7F;
				this.method796();
			}
			this.method824();
		}
		if (this.aFloatArray4[0] == arg3 && this.aFloatArray4[1] == arg4 && this.aFloatArray4[2] == arg5) {
			return;
		}
		this.aFloatArray4[0] = arg3;
		this.aFloatArray4[2] = arg5;
		this.aFloatArray4[1] = arg4;
		this.aFloatArray1[1] = -arg4;
		this.aFloatArray1[0] = -arg3;
		this.aFloatArray1[2] = -arg5;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray3[0] = local142 * arg3;
		this.aFloatArray3[2] = local142 * arg5;
		this.aFloatArray3[1] = local142 * arg4;
		this.aFloatArray2[0] = -this.aFloatArray3[0];
		this.aFloatArray2[2] = -this.aFloatArray3[2];
		this.aFloatArray2[1] = -this.aFloatArray3[1];
		this.method825();
		this.anInt848 = (int) (arg3 * 256.0F / arg4);
		this.anInt842 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "(I)V")
	private void method756() {
		this.method747(-2);
		for (@Pc(14) int local14 = this.anInt825 - 1; local14 >= 0; local14--) {
			this.method806(local14);
			this.method814(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method797(8448, 8448);
		this.method798(2, 770, 34168);
		this.method829();
		this.anInt846 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt826 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean49 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean55 = true;
		this.method803(true);
		this.method826(true);
		this.method812(true);
		this.method808(true);
		this.method801();
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
			@Pc(142) int local142 = local128 + 16384;
			OpenGL.glLightfv(local142, 4608, local126, 0);
			OpenGL.glLightf(local142, 4615, 0.0F);
			OpenGL.glLightf(local142, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt849 = this.anInt832 = -1;
		this.F();
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(Z)V")
	@Override
	public void method5413(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "()F")
	public float method757() {
		return this.aFloat34;
	}

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "(I)V")
	private void method758() {
		this.aFloat21 = this.anInt847 - this.anInt851;
		this.aFloat13 = this.anInt818 - this.anInt829;
		this.aFloat20 = this.anInt821 - this.anInt851;
		this.aFloat16 = this.anInt838 - this.anInt829;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)V")
	public synchronized void method759(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class6_Sub24 local14 = new Class6_Sub24(arg0);
		local14.aLong252 = arg1;
		this.aClass211_7.method5173(local14);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!pb;I)V")
	public void method760(@OriginalArg(0) Class8_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method6053(), 0);
	}

	@OriginalMember(owner = "client!ap", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(49) float local49;
		@Pc(61) float local61;
		if (this.aClass132_Sub1_Sub1_1 == null || this.aClass132_Sub1_Sub1_1.anInt4217 < arg2 || arg3 > this.aClass132_Sub1_Sub1_1.anInt4212) {
			this.aClass132_Sub1_Sub1_1 = Static569.method8023(arg6, arg2, this, arg3);
			this.aClass132_Sub1_Sub1_1.method3694(false, false);
			local61 = this.aClass132_Sub1_Sub1_1.aFloat98;
			local49 = this.aClass132_Sub1_Sub1_1.aFloat99;
		} else {
			this.aClass132_Sub1_Sub1_1.method3698(arg6, arg3, false, arg2, 6406);
			local49 = this.aClass132_Sub1_Sub1_1.aFloat99 * (float) arg3 / (float) this.aClass132_Sub1_Sub1_1.anInt4212;
			local61 = (float) arg2 * this.aClass132_Sub1_Sub1_1.aFloat98 / (float) this.aClass132_Sub1_Sub1_1.anInt4217;
		}
		this.method817();
		this.method814(this.aClass132_Sub1_Sub1_1);
		this.method804(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method753(arg5);
		this.method797(34165, 34165);
		this.method798(0, 768, 34166);
		this.method798(2, 770, 5890);
		this.method816(34166, 0);
		this.method816(5890, 2);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = local151 + (float) arg2;
		@Pc(164) float local164 = (float) arg3 + local154;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local61);
		OpenGL.glVertex2f(local151, local164);
		OpenGL.glTexCoord2f(local49, local61);
		OpenGL.glVertex2f(local159, local164);
		OpenGL.glTexCoord2f(local49, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method798(0, 768, 5890);
		this.method798(2, 770, 34166);
		this.method816(5890, 0);
		this.method816(34166, 2);
	}

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "()Z")
	@Override
	public boolean method5437() {
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[Lclient!od;)V")
	@Override
	public void method5401(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub29[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass6_Sub29Array1[local3] = arg1[local3];
		}
		this.anInt835 = arg0;
		if (this.anInt819 != 1) {
			this.method754();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method5456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class19 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class19_Sub2 local6 = (Class19_Sub2) arg5;
		@Pc(9) Class132_Sub1_Sub1 local9 = local6.aClass132_Sub1_Sub1_2;
		this.method817();
		this.method814(local6.aClass132_Sub1_Sub1_2);
		this.method804(1);
		this.method797(7681, 8448);
		this.method798(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat98 / (float) local9.anInt4225;
		@Pc(46) float local46 = local9.aFloat99 / (float) local9.anInt4227;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(60) float local60 = (float) -arg1 + (float) arg3;
		@Pc(73) float local73 = (float) (1.0D / Math.sqrt((double) (local60 * local60 + local53 * local53)));
		@Pc(77) float local77 = local53 * local73;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(96) float local96 = local60 * local73;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f(local77 + (float) arg2 + 0.35F, local96 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method798(0, 768, 5890);
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(Z)V")
	@Override
	public void method5432(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ap", name = "ka", descriptor = "(FF)V")
	@Override
	public void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat34 == arg0 && this.aFloat32 == arg1) {
			return;
		}
		this.aFloat34 = arg0;
		this.aFloat32 = arg1;
		this.method779();
		if (this.anInt819 == 3) {
			this.method782();
			return;
		}
		if (this.anInt819 != 2) {
			return;
		}
		this.method789();
	}

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "(I)V")
	private void method762() {
		@Pc(6) float[] local6 = this.aFloatArray5;
		@Pc(18) float local18 = (float) (-this.anInt829 * this.anInt828) / (float) this.anInt837;
		@Pc(33) float local33 = (float) ((this.anInt702 - this.anInt829) * this.anInt828) / (float) this.anInt837;
		@Pc(44) float local44 = (float) (this.anInt851 * this.anInt828) / (float) this.anInt841;
		@Pc(59) float local59 = (float) ((this.anInt851 - this.anInt799) * this.anInt828) / (float) this.anInt841;
		if (local33 == local18 || local44 == local59) {
			local6[15] = 1.0F;
			local6[2] = 0.0F;
			local6[3] = 0.0F;
			local6[13] = 0.0F;
			local6[8] = 0.0F;
			local6[10] = 1.0F;
			local6[5] = 1.0F;
			local6[12] = 0.0F;
			local6[1] = 0.0F;
			local6[11] = 0.0F;
			local6[9] = 0.0F;
			local6[0] = 1.0F;
			local6[14] = 0.0F;
			local6[4] = 0.0F;
			local6[6] = 0.0F;
			local6[7] = 0.0F;
		} else {
			@Pc(73) float local73 = (float) this.anInt828 * 2.0F;
			local6[12] = 0.0F;
			local6[5] = local73 / (local44 - local59);
			local6[13] = 0.0F;
			local6[3] = 0.0F;
			local6[9] = (local59 + local44) / (local44 - local59);
			local6[4] = 0.0F;
			local6[11] = -1.0F;
			local6[8] = (local33 + local18) / (-local18 + local33);
			local6[2] = 0.0F;
			local6[6] = 0.0F;
			local6[10] = this.aFloat28 = (float) -(this.anInt843 + this.anInt828) / (float) (this.anInt843 - this.anInt828);
			local6[15] = 0.0F;
			local6[14] = this.aFloat27 = -(local73 * (float) this.anInt843) / (float) (this.anInt843 - this.anInt828);
			local6[0] = local73 / (local33 - local18);
			local6[7] = 0.0F;
			local6[1] = 0.0F;
		}
		this.method779();
	}

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "(I)V")
	private void method763() {
		if (this.anInt819 != 3) {
			this.anInt819 = 3;
			this.method782();
			this.method811();
			this.anInt852 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(FFFI)V")
	private void method764(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean67) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean67 = true;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(III)V")
	public synchronized void method765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class6_Sub24 local14 = new Class6_Sub24(arg0);
		local14.aLong252 = arg1;
		this.aClass211_8.method5173(local14);
	}

	@OriginalMember(owner = "client!ap", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt799 - local12 - arg1, arg2, 1, 32993, this.anInt839, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)I")
	public int method766(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!jt;B)V")
	public void method767(@OriginalArg(0) Interface9 arg0) {
		if (this.aBoolean61) {
			this.method800(arg0);
			this.method768(arg0);
		} else if (this.anInt813 >= 0 && arg0 == this.anInterface9Array2[this.anInt813]) {
			this.anInterface9Array2[this.anInt813--] = null;
			arg0.method2365();
			if (this.anInt813 >= 0) {
				this.anInterface9_1 = this.anInterface9_2 = this.anInterface9Array2[this.anInt813];
				this.anInterface9_1.method2362();
			} else {
				this.anInterface9_1 = this.anInterface9_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5450(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!jt;)V")
	public void method768(@OriginalArg(1) Interface9 arg0) {
		if (this.anInt812 < 0 || arg0 != this.anInterface9Array3[this.anInt812]) {
			throw new RuntimeException();
		}
		this.anInterface9Array3[this.anInt812--] = null;
		arg0.method2367();
		if (this.anInt812 < 0) {
			this.anInterface9_2 = null;
		} else {
			this.anInterface9_2 = this.anInterface9Array3[this.anInt812];
			this.anInterface9_2.method2366();
		}
	}

	@OriginalMember(owner = "client!ap", name = "ha", descriptor = "(F)V")
	@Override
	public void ha(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat33) {
			this.aFloat33 = arg0;
			this.method796();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class19 method5460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static422.method6537(arg1, arg0, arg2, arg3, this);
	}

	@OriginalMember(owner = "client!ap", name = "C", descriptor = "(IIIIII)V")
	@Override
	public void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method772();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method804(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean54) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean54) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ap", name = "E", descriptor = "()F")
	public float method769() {
		return this.aFloat32;
	}

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "()Lclient!q;")
	@Override
	public Class8 method5446() {
		return new Class8_Sub2();
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method772();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method804(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean54) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean54) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ap", name = "B", descriptor = "()Z")
	@Override
	public boolean method5462() {
		return this.aClass139_1.method3797();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZI)V")
	public void method770(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean58) {
			this.aBoolean58 = arg0;
			this.method818();
		}
	}

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "(I)I")
	private int method771() {
		@Pc(5) int local5 = 0;
		this.aString7 = OpenGL.glGetString(7936).toLowerCase();
		this.aString8 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString7.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString7.indexOf("brian paul") != -1 || this.aString7.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(47) String local47 = OpenGL.glGetString(7938);
		@Pc(57) String[] local57 = Static288.method4721(local47.replace('.', ' '), ' ');
		if (local57.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(75) int local75 = Static228.method4072(local57[0]);
				@Pc(81) int local81 = Static228.method4072(local57[1]);
				this.anInt820 = local75 * 10 + local81;
			} catch (@Pc(90) NumberFormatException local90) {
				local5 |= 0x4;
			}
		}
		if (this.anInt820 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(126) int[] local126 = new int[1];
		OpenGL.glGetIntegerv(34018, local126, 0);
		this.anInt825 = local126[0];
		OpenGL.glGetIntegerv(34929, local126, 0);
		this.bf = local126[0];
		OpenGL.glGetIntegerv(34930, local126, 0);
		this.anInt822 = local126[0];
		if (this.anInt825 < 2 || this.bf < 2 || this.anInt822 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean65 = Stream.c();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean64 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean54 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean44 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean62 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean47 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean71 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean60 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean68 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean56 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean69 = false;
		this.aBoolean70 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean61 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean57 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean59 = this.aBoolean61 & this.aBoolean57;
		OpenGL.glGetFloatv(2834, Static76.aFloatArray6, 0);
		this.aFloat22 = Static76.aFloatArray6[0];
		this.aFloat30 = Static76.aFloatArray6[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)V")
	private void method772() {
		if (this.anInt852 == 1) {
			return;
		}
		this.method750();
		this.method803(false);
		this.method826(false);
		this.method812(false);
		this.method808(false);
		this.method814(null);
		this.method747(-2);
		this.method822(1);
		this.anInt852 = 1;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;IZZI)Lclient!rl;")
	public Interface18 method773(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		return (Interface18) (this.aBoolean64 ? new Class108_Sub1(this, arg1, arg0, arg2, false) : new Class14_Sub1(this, arg1, arg0));
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZII)V")
	public void method774(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method799(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!fm;)V")
	public void method775(@OriginalArg(1) Interface3 arg0) {
		if (arg0 != this.anInterface3_2) {
			if (this.aBoolean64) {
				OpenGL.glBindBufferARB(34963, arg0.method7654());
			}
			this.anInterface3_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BF)V")
	public void method776(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat25) {
			this.aFloat25 = arg0;
			if (this.anInt819 == 3) {
				this.method782();
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		@Pc(6) int local6 = this.anInt855;
		this.anInt855 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method5451(@OriginalArg(0) Class6_Sub25 arg0) {
		this.aNativeHeap1 = ((Class6_Sub25_Sub1) arg0).aNativeHeap5;
		if (this.anInterface18_2 != null) {
			return;
		}
		@Pc(16) Class6_Sub26_Sub1 local16 = new Class6_Sub26_Sub1(80);
		if (this.aBoolean65) {
			local16.method4361(-1.0F);
			local16.method4361(-1.0F);
			local16.method4361(0.0F);
			local16.method4361(0.0F);
			local16.method4361(1.0F);
			local16.method4361(1.0F);
			local16.method4361(-1.0F);
			local16.method4361(0.0F);
			local16.method4361(1.0F);
			local16.method4361(1.0F);
			local16.method4361(1.0F);
			local16.method4361(1.0F);
			local16.method4361(0.0F);
			local16.method4361(1.0F);
			local16.method4361(0.0F);
			local16.method4361(-1.0F);
			local16.method4361(1.0F);
			local16.method4361(0.0F);
			local16.method4361(0.0F);
			local16.method4361(0.0F);
		} else {
			local16.method4360(-1.0F);
			local16.method4360(-1.0F);
			local16.method4360(0.0F);
			local16.method4360(0.0F);
			local16.method4360(1.0F);
			local16.method4360(1.0F);
			local16.method4360(-1.0F);
			local16.method4360(0.0F);
			local16.method4360(1.0F);
			local16.method4360(1.0F);
			local16.method4360(1.0F);
			local16.method4360(1.0F);
			local16.method4360(0.0F);
			local16.method4360(1.0F);
			local16.method4360(0.0F);
			local16.method4360(-1.0F);
			local16.method4360(1.0F);
			local16.method4360(0.0F);
			local16.method4360(0.0F);
			local16.method4360(0.0F);
		}
		this.anInterface18_2 = this.method823(local16.aByteArray65, false, 20, local16.anInt5769);
		this.aClass166_2 = new Class166(this.anInterface18_2, 5126, 3, 0);
		this.aClass166_1 = new Class166(this.anInterface18_2, 5126, 2, 12);
		this.aClass178_1.method4545(this);
	}

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "(I)V")
	private void method777() {
		this.aClass8_Sub2_3 = new Class8_Sub2();
		this.aClass8_Sub2_4 = new Class8_Sub2();
		this.aClass132Array1 = new Class132[this.anInt825];
		this.aClass132_Sub1_2 = new Class132_Sub1(this, 3553, 6408, 1, 1);
		new Class132_Sub1(this, 3553, 6408, 1, 1);
		new Class132_Sub1(this, 3553, 6408, 1, 1);
		this.aClass23_Sub2_1 = new Class23_Sub2(this);
		this.aClass23_Sub2_2 = new Class23_Sub2(this);
		this.aClass23_Sub2_10 = new Class23_Sub2(this);
		this.aClass23_Sub2_5 = new Class23_Sub2(this);
		this.aClass23_Sub2_8 = new Class23_Sub2(this);
		this.aClass23_Sub2_3 = new Class23_Sub2(this);
		this.aClass23_Sub2_6 = new Class23_Sub2(this);
		this.aClass23_Sub2_4 = new Class23_Sub2(this);
		this.aClass23_Sub2_7 = new Class23_Sub2(this);
		this.aClass23_Sub2_9 = new Class23_Sub2(this);
		if (this.aBoolean70) {
			this.aClass89_1 = new Class89(this);
			new Class89(this);
		}
	}

	@OriginalMember(owner = "client!ap", name = "D", descriptor = "()Z")
	@Override
	public boolean method5464() {
		return this.aBoolean54 && (!this.method5398() || this.aBoolean59);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!dga;)V")
	@Override
	public void method5391(@OriginalArg(0) Class65 arg0) {
		this.aClass65_Sub2_1 = (Class65_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(III)V")
	public synchronized void method778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class6_Sub24 local14 = new Class6_Sub24(arg1);
		local14.aLong252 = arg0;
		this.aClass211_10.method5173(local14);
	}

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "(I)V")
	private void method779() {
		if (this.aFloat32 == (float) 0) {
			this.aFloatArray5[10] = this.aFloat28;
			this.aFloatArray5[14] = this.aFloat27;
		} else {
			@Pc(14) float local14 = this.aFloat34 / (this.aFloat32 + this.aFloat34);
			@Pc(18) float local18 = local14 * local14;
			@Pc(35) float local35 = (1.0F - local14) * -this.aFloat27 * (1.0F - local14) / this.aFloat32;
			this.aFloatArray5[14] = this.aFloat27 * local18;
			this.aFloatArray5[10] = local35 + this.aFloat28;
		}
		this.aFloat17 = (this.aFloatArray5[14] - (float) this.anInt843) / this.aFloatArray5[10];
		this.aFloat24 = (float) this.anInt843 - this.aFloat32;
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(B)V")
	public void method780() {
		if (this.anInt852 == 4) {
			return;
		}
		this.method750();
		this.method803(false);
		this.method826(false);
		this.method812(false);
		this.method808(false);
		this.method747(-2);
		this.method804(1);
		this.anInt852 = 4;
	}

	@OriginalMember(owner = "client!ap", name = "z", descriptor = "()Z")
	@Override
	public boolean method5453() {
		if (this.aClass6_Sub9_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass6_Sub9_Sub1_1.method7846()) {
			if (!this.aClass193_1.method4779(this.aClass6_Sub9_Sub1_1)) {
				return false;
			}
			this.aClass316_1.method7582();
		}
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "()V")
	@Override
	public void method5406() {
		if (this.aClass6_Sub9_Sub1_1 != null && this.aClass6_Sub9_Sub1_1.method7846()) {
			this.aClass193_1.method4788(this.aClass6_Sub9_Sub1_1);
			this.aClass316_1.method7582();
		}
	}

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "(I)V")
	public void method781() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)Lclient!i;")
	@Override
	public Class6_Sub25 method5421(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub25_Sub1 local8 = new Class6_Sub25_Sub1(arg0);
		this.aClass211_5.method5173(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!qda;IIII)Lclient!ba;")
	@Override
	public Class23 method5404(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class23_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "(I)V")
	private void method782() {
		@Pc(15) float local15 = this.aFloat25 * (float) -this.anInt829 / (float) this.anInt837;
		@Pc(27) float local27 = this.aFloat25 * (float) -this.anInt851 / (float) this.anInt841;
		@Pc(45) float local45 = (float) (this.anInt702 - this.anInt829) * this.aFloat25 / (float) this.anInt837;
		@Pc(60) float local60 = (float) (this.anInt799 - this.anInt851) * this.aFloat25 / (float) this.anInt841;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local45 != local15 && local60 != local27) {
			OpenGL.glOrtho((double) local15, (double) local45, (double) -local60, (double) -local27, (double) ((float) this.anInt828 - this.aFloat32), (double) ((float) this.anInt843 - this.aFloat32));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method5450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method772();
		this.method804(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 - (float) arg1;
		@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local23 * local23)));
		@Pc(40) float local40 = local17 * local36;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(59) float local59 = local23 * local36;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local40 + (float) arg2 + 0.35F, local59 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "(I)V")
	public void method783() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ap", name = "C", descriptor = "()V")
	@Override
	public void method5463() {
		if (!this.aBoolean45 || this.anInt702 <= 0 || this.anInt799 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt818;
		@Pc(25) int local25 = this.anInt838;
		@Pc(28) int local28 = this.anInt847;
		@Pc(31) int local31 = this.anInt821;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method801();
		this.method803(false);
		this.method826(false);
		this.method812(false);
		this.method808(false);
		this.method814(null);
		this.method747(-2);
		this.method822(1);
		this.method804(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt702, this.anInt799, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method5429(@OriginalArg(0) Class8 arg0) {
		this.aClass8_Sub2_3 = (Class8_Sub2) arg0;
		this.aClass8_Sub2_4.method6054(this.aClass8_Sub2_3);
		if (this.anInt819 != 1) {
			this.method811();
		}
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(IIIIII)Lclient!dga;")
	@Override
	public Class65 method5442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean68 ? new Class65_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "()Z")
	@Override
	public boolean method5449() {
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5443(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static293.aFloat121 = arg0;
		Static571.aFloat196 = arg2;
		Static539.aFloat193 = arg1;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!ed;[Lclient!aaa;Z)Lclient!ta;")
	@Override
	public Class73 method5393(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class1[] arg1) {
		return new Class73_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BIII)V")
	public void method784(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!aaa;Z)Lclient!xa;")
	@Override
	public Class66 method5412(@OriginalArg(0) Class1 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt27 * arg0.anInt30];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray1 == null) {
			for (local21 = 0; local21 < arg0.anInt30; local21++) {
				for (local25 = 0; local25 < arg0.anInt27; local25++) {
					@Pc(83) int local83 = arg0.anIntArray6[arg0.aByteArray2[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt30; local21++) {
				for (local25 = 0; local25 < arg0.anInt27; local25++) {
					local12[local16++] = arg0.anIntArray6[arg0.aByteArray2[local14] & 0xFF] | arg0.aByteArray1[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(119) Class66 local119 = this.method5423(local12, arg0.anInt27, arg0.anInt27, arg0.anInt30);
		local119.EA(arg0.anInt29, arg0.anInt31, arg0.anInt28, arg0.anInt26);
		return local119;
	}

	@OriginalMember(owner = "client!ap", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass8_Sub2_3.aFloat160 + (float) arg2 * this.aClass8_Sub2_3.aFloat169 + (float) arg1 * this.aClass8_Sub2_3.aFloat168 + (float) arg0 * this.aClass8_Sub2_3.aFloat161;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass8_Sub2_3.aFloat168 * (float) arg4 + this.aClass8_Sub2_3.aFloat161 * (float) arg3 + this.aClass8_Sub2_3.aFloat169 * (float) arg5 + this.aClass8_Sub2_3.aFloat160;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt828 && local59 < (float) this.anInt828 || !(!(local28 > (float) this.anInt843) || !((float) this.anInt843 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt837 * (this.aClass8_Sub2_3.aFloat163 * (float) arg1 + (float) arg0 * this.aClass8_Sub2_3.aFloat166 + (float) arg2 * this.aClass8_Sub2_3.aFloat165 + this.aClass8_Sub2_3.aFloat164) / local28);
		@Pc(155) int local155 = (int) ((this.aClass8_Sub2_3.aFloat164 + this.aClass8_Sub2_3.aFloat165 * (float) arg5 + (float) arg3 * this.aClass8_Sub2_3.aFloat166 + this.aClass8_Sub2_3.aFloat163 * (float) arg4) * (float) this.anInt837 / local59);
		if ((float) local123 < this.aFloat13 && this.aFloat13 > (float) local155 || (float) local123 > this.aFloat16 && (float) local155 > this.aFloat16) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt841 * (this.aClass8_Sub2_3.aFloat159 * (float) arg1 + (float) arg0 * this.aClass8_Sub2_3.aFloat158 + (float) arg2 * this.aClass8_Sub2_3.aFloat167 + this.aClass8_Sub2_3.aFloat162) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt841 * (this.aClass8_Sub2_3.aFloat162 + (float) arg3 * this.aClass8_Sub2_3.aFloat158 + this.aClass8_Sub2_3.aFloat159 * (float) arg4 + (float) arg5 * this.aClass8_Sub2_3.aFloat167) / local59);
			return (!(this.aFloat21 > (float) local213) || !(this.aFloat21 > (float) local245)) && (!((float) local213 > this.aFloat20) || !(this.aFloat20 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "()V")
	@Override
	protected void method5418() {
		for (@Pc(6) Class6 local6 = this.aClass211_5.method5183(); local6 != null; local6 = this.aClass211_5.method5177()) {
			((Class6_Sub25_Sub1) local6).method6179();
		}
		if (this.aClass193_1 != null) {
			this.aClass193_1.method4778();
		}
		if (this.anOpenGL1 != null) {
			this.method786();
			@Pc(40) Enumeration local40 = this.aHashtable1.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable1.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean43) {
			Static30.method995(true, false);
			this.aBoolean43 = false;
		}
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "()Lclient!q;")
	@Override
	public Class8 method5417() {
		return this.aClass8_Sub2_1;
	}

	@OriginalMember(owner = "client!ap", name = "JA", descriptor = "(I)V")
	@Override
	public void JA(@OriginalArg(0) int arg0) {
		this.anInt811 = 0;
		while (arg0 > 1) {
			this.anInt811++;
			arg0 >>= 0x1;
		}
		this.anInt809 = 0x1 << this.anInt811;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass193_1.method4787(arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(FFI)V")
	public void method785(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat31 = arg1;
		this.aFloat26 = arg0;
		if (!this.aBoolean63) {
			this.method793();
		}
	}

	@OriginalMember(owner = "client!ap", name = "X", descriptor = "(III)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt832 == arg0 && arg1 == this.anInt827 && arg2 == this.anInt831) {
			return;
		}
		this.anInt827 = arg1;
		this.anInt831 = arg2;
		this.anInt832 = arg0;
		if (!this.aBoolean63) {
			this.method793();
			this.method787();
		}
	}

	@OriginalMember(owner = "client!ap", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.method804(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([Lclient!ba;Lclient!tg;Lclient!q;[Lclient!mr;I)V")
	@Override
	public void method5445(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class5_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method5408(arg0, arg2, arg3, arg4);
		this.method5433(arg1);
	}

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "(I)V")
	private void method786() {
		this.anOpenGL1.a();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class66 method5454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class66_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "(Z)V")
	private void method787() {
		if (this.aBoolean51 && this.anInt827 >= 0 | this.aBoolean63) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "()Lclient!hl;")
	@Override
	public Class138 method5435() {
		@Pc(7) int local7 = -1;
		if (this.aString7.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString7.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString7.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class138(local7, "OpenGL", this.anInt820, this.aString8, 0L);
	}

	@OriginalMember(owner = "client!ap", name = "v", descriptor = "(I)V")
	private void method788() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL1.b()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static566.method8004(1000L);
		}
	}

	@OriginalMember(owner = "client!ap", name = "aa", descriptor = "()I")
	@Override
	public int aa() {
		@Pc(6) int local6 = this.anInt854;
		this.anInt854 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "()Z")
	@Override
	public boolean method5431() {
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "w", descriptor = "(I)V")
	private void method789() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray5, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class62 method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class62_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "(IIIII)V")
	@Override
	protected void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt818 > arg2 + arg0 || arg0 - arg2 > this.anInt838 || this.anInt847 > arg1 + arg2 || this.anInt821 < arg1 - arg2) {
			return;
		}
		this.method772();
		this.method804(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(78) float local78 = (float) arg0 + 0.35F;
		@Pc(83) float local83 = (float) arg1 + 0.35F;
		@Pc(87) int local87 = arg2 << 1;
		if (this.aFloat22 > (float) local87) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local78 + 1.0F, local83 + 1.0F);
			OpenGL.glVertex2f(local78 + 1.0F, -1.0F + local83);
			OpenGL.glVertex2f(local78 - 1.0F, local83 - 1.0F);
			OpenGL.glVertex2f(local78 - 1.0F, local83 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local87 <= this.aFloat30) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local87);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local78, local83);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local78, local83);
			@Pc(156) int local156 = 262144 / (arg2 * 6);
			if (local156 <= 64) {
				local156 = 64;
			} else if (local156 > 512) {
				local156 = 512;
			}
			local156 = Static479.method7316(local156);
			OpenGL.glVertex2f(local78 + (float) arg2, local83);
			for (@Pc(183) int local183 = 16384 - local156; local183 > 0; local183 -= local156) {
				OpenGL.glVertex2f((float) arg2 * Class6_Sub44.aFloatArray62[local183] + local78, local83 + Class6_Sub44.aFloatArray63[local183] * (float) arg2);
			}
			OpenGL.glVertex2f((float) arg2 + local78, local83);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIBLclient!fm;)V")
	public void method790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Interface3 arg2) {
		@Pc(7) int local7 = arg2.method7655();
		@Pc(14) int local14 = arg1 * this.method749(local7);
		this.method775(arg2);
		OpenGL.glDrawElements(4, arg0, local7, arg2.method7656() + (long) local14);
	}

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "(I)V")
	public void method791() {
		if (this.anInt852 == 8) {
			return;
		}
		this.method830();
		this.method803(true);
		this.method812(true);
		this.method808(true);
		this.method804(1);
		this.anInt852 = 8;
	}

	@OriginalMember(owner = "client!ap", name = "y", descriptor = "(I)V")
	private void method792() {
		if (this.anInt838 >= this.anInt818 && this.anInt847 <= this.anInt821) {
			OpenGL.glScissor(this.anInt818 + this.anInt833, this.anInt799 + (this.anInt850 - this.anInt821), this.anInt838 - this.anInt818, -this.anInt847 + this.anInt821);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "()V")
	@Override
	public void k() {
		this.aBoolean63 = false;
		this.aClass139_1.method3795(0, false, 0, 0, false);
		this.method793();
		this.method787();
	}

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "()I")
	@Override
	public int method5427() {
		return 4;
	}

	@OriginalMember(owner = "client!ap", name = "z", descriptor = "(I)V")
	private void method793() {
		@Pc(15) int local15;
		if (this.aBoolean63) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt824;
		} else {
			this.aFloat15 = (float) (this.anInt843 - this.anInt831) - this.aFloat31;
			this.aFloat19 = this.aFloat15 - (float) this.anInt827 * this.aFloat26;
			if (this.aFloat19 < (float) this.anInt828) {
				this.aFloat19 = this.anInt828;
			}
			OpenGL.glFogf(2915, this.aFloat19);
			OpenGL.glFogf(2916, this.aFloat15);
			local15 = this.anInt832;
		}
		Static76.aFloatArray6[1] = (float) (local15 & 0xFF00) / 65280.0F;
		Static76.aFloatArray6[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static76.aFloatArray6[2] = (float) (local15 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static76.aFloatArray6, 0);
		if (this.aBoolean63) {
			this.aClass139_1.aClass104_Sub1_1.method2653();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!jt;I)V")
	public void method794(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt814 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt814 >= 0) {
			this.anInterface9Array1[this.anInt814].method2364();
		}
		this.anInterface9_1 = this.anInterface9Array1[++this.anInt814] = arg0;
		this.anInterface9_1.method2363();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class66 method5423(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class66_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(FIFFF)V")
	public void method795(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static76.aFloatArray6[3] = arg1;
		Static76.aFloatArray6[1] = arg3;
		Static76.aFloatArray6[2] = arg2;
		Static76.aFloatArray6[0] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static76.aFloatArray6, 0);
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(B)V")
	private void method796() {
		Static76.aFloatArray6[3] = 1.0F;
		Static76.aFloatArray6[2] = this.aFloat18 * this.aFloat33;
		Static76.aFloatArray6[0] = this.aFloat33 * this.aFloat29;
		Static76.aFloatArray6[1] = this.aFloat33 * this.aFloat23;
		OpenGL.glLightModelfv(2899, Static76.aFloatArray6, 0);
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(I)V")
	@Override
	public void method5426(@OriginalArg(0) int arg0) {
		this.method786();
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(III)V")
	public void method797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt853 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(15) boolean local15 = false;
		if (arg0 != this.anInt840) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local15 = true;
			this.anInt840 = arg0;
		}
		if (arg1 != this.anInt823) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt823 = arg1;
			local15 = true;
		}
		if (local15) {
			this.anInt852 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "()V")
	@Override
	public void method5420() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZII)V")
	public void method798(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
	@Override
	public void method5392(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt807 = arg0;
		this.aClass316_1.method7582();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BZZI)V")
	public void method799(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 != this.anInt836) {
			if (arg2 < 0) {
				this.method829();
				this.method814(null);
				this.method822(0);
				if (!this.aBoolean63) {
					this.aClass139_1.method3795(0, arg1, 0, 0, arg0);
				}
			} else {
				@Pc(49) Class132_Sub1 local49 = this.aClass316_1.method7584(arg2);
				@Pc(55) Class296 local55 = super.anInterface2_11.method3585(arg2);
				if (local55.aByte105 == 0 && local55.aByte107 == 0) {
					this.method829();
				} else {
					@Pc(81) int local81 = local55.aBoolean661 ? 64 : 128;
					@Pc(85) int local85 = local81 * 50;
					this.method764((float) (local55.aByte105 * (this.anInt810 % local85)) / (float) local85, 0.0F, (float) (this.anInt810 % local85 * local55.aByte107) / (float) local85);
				}
				if (this.aBoolean63) {
					this.method814(local49);
					this.method822(local55.anInt8779);
				} else {
					this.aClass139_1.method3795(local55.aByte104, arg1, local55.aByte102, local55.anInt8778, arg0);
					if (!this.aClass139_1.method3796(local49, local55.anInt8779)) {
						this.method814(local49);
						this.method822(local55.anInt8779);
					}
				}
			}
			this.anInt836 = arg2;
		}
		this.anInt852 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "()Z")
	@Override
	public boolean method5422() {
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(ILclient!jt;)V")
	public void method800(@OriginalArg(1) Interface9 arg0) {
		if (this.anInt814 < 0 || this.anInterface9Array1[this.anInt814] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface9Array1[this.anInt814--] = null;
		arg0.method2364();
		if (this.anInt814 >= 0) {
			this.anInterface9_1 = this.anInterface9Array1[this.anInt814];
			this.anInterface9_1.method2363();
		} else {
			this.anInterface9_1 = null;
		}
	}

	@OriginalMember(owner = "client!ap", name = "A", descriptor = "(I)V")
	public void method801() {
		if (this.anInt819 != 0) {
			this.anInt852 &= 0xFFFFFFE0;
			this.anInt819 = 0;
		}
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "(II)I")
	public int method802(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "()Z")
	@Override
	public boolean method5414() {
		return false;
	}

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "()V")
	@Override
	public void method5419() {
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZZ)V")
	public void method803(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean51) {
			this.aBoolean51 = arg0;
			this.method787();
			this.anInt852 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(ZI)V")
	public void method804(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt846) {
			return;
		}
		@Pc(17) boolean local17;
		@Pc(21) byte local21;
		if (arg0 == 1) {
			local17 = true;
			local21 = 1;
		} else if (arg0 == 2) {
			local17 = false;
			local21 = 2;
		} else if (arg0 == 128) {
			local17 = true;
			local21 = 3;
		} else {
			local21 = 0;
			local17 = false;
		}
		if (!this.aBoolean55) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean55 = true;
		}
		if (this.aBoolean49 != local17) {
			if (local17) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean49 = local17;
		}
		if (local21 != this.anInt826) {
			if (local21 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local21 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local21 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt826 = local21;
		}
		this.anInt852 &= 0xFFFFFFE3;
		this.anInt846 = arg0;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "()Z")
	@Override
	public boolean method5398() {
		return this.aClass6_Sub9_Sub1_1 != null && this.aClass6_Sub9_Sub1_1.method7846();
	}

	@OriginalMember(owner = "client!ap", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return this.anInt843;
	}

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "()Z")
	@Override
	public boolean method5439() {
		return this.aClass6_Sub9_Sub1_1 != null && (this.anInt804 <= 1 || this.aBoolean59);
	}

	@OriginalMember(owner = "client!ap", name = "A", descriptor = "([I)V")
	@Override
	public void A(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt847;
		arg0[0] = this.anInt818;
		arg0[3] = this.anInt821;
		arg0[2] = this.anInt838;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!jl;ILclient!jl;Lclient!jl;Lclient!jl;)V")
	public void method805(@OriginalArg(0) Class166 arg0, @OriginalArg(2) Class166 arg1, @OriginalArg(3) Class166 arg2, @OriginalArg(4) Class166 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method810(arg0.anInterface18_3);
			OpenGL.glVertexPointer(arg0.aByte50, arg0.aShort48, this.anInterface18_1.method3936(), this.anInterface18_1.method3935() + (long) arg0.aByte49);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method810(arg3.anInterface18_3);
			OpenGL.glNormalPointer(arg3.aShort48, this.anInterface18_1.method3936(), this.anInterface18_1.method3935() + (long) arg3.aByte49);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method810(arg2.anInterface18_3);
			OpenGL.glColorPointer(arg2.aByte50, arg2.aShort48, this.anInterface18_1.method3936(), this.anInterface18_1.method3935() + (long) arg2.aByte49);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method810(arg1.anInterface18_3);
			OpenGL.glTexCoordPointer(arg1.aByte50, arg1.aShort48, this.anInterface18_1.method3936(), this.anInterface18_1.method3935() + (long) arg1.aByte49);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(IB)V")
	public void method806(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt853) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt853 = arg0;
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
	@Override
	public void method5394(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!ba;Lclient!tg;Lclient!q;Lclient!mr;I)V")
	@Override
	public void method5457(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class5_Sub4 arg3, @OriginalArg(4) int arg4) {
		arg0.method7077(arg2, arg3, arg4);
		this.method5433(arg1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZB[BII)Lclient!fm;")
	public Interface3 method807(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		return (Interface3) (this.aBoolean64 && (!arg0 || this.aBoolean48) ? new Class108_Sub2(this, 5123, arg1, arg2, arg0) : new Class14_Sub2(this, 5123, arg1, arg2));
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5410(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas3 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(ZI)V")
	public void method808(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean46) {
			this.aBoolean46 = arg0;
			this.method751();
			this.anInt852 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ap", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt818 < arg0) {
			this.anInt818 = arg0;
		}
		if (this.anInt838 > arg2) {
			this.anInt838 = arg2;
		}
		if (arg1 > this.anInt847) {
			this.anInt847 = arg1;
		}
		if (this.anInt821 > arg3) {
			this.anInt821 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method758();
		this.method792();
	}

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "()V")
	@Override
	public void method5430() {
		this.method808(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(Z)V")
	@Override
	public void method5455(@OriginalArg(0) boolean arg0) {
		this.aBoolean53 = arg0;
		this.method751();
	}

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "()V")
	@Override
	public void method5441() {
		this.aClass193_1.method4780();
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Lclient!pb;I)V")
	public void method809(@OriginalArg(0) Class8_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method6053(), 0);
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "(I)V")
	@Override
	public void method5459(@OriginalArg(0) int arg0) {
		this.method788();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!rl;I)V")
	public void method810(@OriginalArg(0) Interface18 arg0) {
		if (arg0 != this.anInterface18_1) {
			if (this.aBoolean64) {
				OpenGL.glBindBufferARB(34962, arg0.method3934());
			}
			this.anInterface18_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!ap", name = "B", descriptor = "(I)V")
	private void method811() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass8_Sub2_3.method6053(), 0);
		if (this.aBoolean63) {
			this.aClass139_1.aClass104_Sub1_1.method2652();
		}
		this.method825();
		this.method754();
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(ZI)V")
	public void method812(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean66) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean66 = arg0;
		this.anInt852 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5448(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method5411();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "()Z")
	@Override
	public boolean method5395() {
		return false;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(IB)V")
	public synchronized void method813(@OriginalArg(0) int arg0) {
		@Pc(13) Class6 local13 = new Class6();
		local13.aLong252 = arg0;
		this.aClass211_11.method5173(local13);
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(IIIII)V")
	@Override
	public void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method772();
		this.method804(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ap", name = "ya", descriptor = "(IIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method772();
		this.method804(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!tg;)V")
	@Override
	public void method5433(@OriginalArg(0) Class299 arg0) {
		this.aClass178_1.method4539(this, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLclient!uda;)V")
	public void method814(@OriginalArg(1) Class132 arg0) {
		@Pc(19) Class132 local19 = this.aClass132Array1[this.anInt853];
		if (local19 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local19.anInt6650);
			} else {
				if (local19 == null) {
					OpenGL.glEnable(arg0.anInt6650);
				} else if (arg0.anInt6650 != local19.anInt6650) {
					OpenGL.glDisable(local19.anInt6650);
					OpenGL.glEnable(arg0.anInt6650);
				}
				OpenGL.glBindTexture(arg0.anInt6650, arg0.method5616());
			}
			this.aClass132Array1[this.anInt853] = arg0;
		}
		this.anInt852 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ap", name = "w", descriptor = "()Z")
	@Override
	public boolean method5447() {
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BII)V")
	public void method815(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt850 = arg0;
		this.anInt833 = arg1;
		this.method755();
		this.method792();
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(IZII)V")
	public void method816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!ap", name = "F", descriptor = "()V")
	@Override
	public void F() {
		this.anInt847 = 0;
		this.anInt838 = this.anInt702;
		this.anInt818 = 0;
		this.anInt821 = this.anInt799;
		OpenGL.glDisable(3089);
		this.method758();
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5465(@OriginalArg(0) Canvas arg0) {
		this.aLong12 = 0L;
		this.lb = null;
		if (arg0 == null || this.aCanvas3 == arg0) {
			this.lb = this.aCanvas3;
			this.aLong12 = this.aLong13;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable1.get(arg0);
			this.aLong12 = local26;
			this.lb = arg0;
		}
		if (this.lb == null || this.aLong12 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong12);
		this.method828();
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "(B)V")
	public void method817() {
		if (this.anInt852 == 2) {
			return;
		}
		this.method750();
		this.method803(false);
		this.method826(false);
		this.method812(false);
		this.method808(false);
		this.method747(-2);
		this.anInt852 = 2;
	}

	@OriginalMember(owner = "client!ap", name = "C", descriptor = "(I)V")
	private void method818() {
		if (this.aBoolean50 && !this.aBoolean58) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "(B)V")
	public void method819() {
		if (this.anInt852 == 16) {
			return;
		}
		this.method763();
		this.method803(true);
		this.method812(true);
		this.method808(true);
		this.method804(1);
		this.anInt852 = 16;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5428(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!ap", name = "E", descriptor = "(I)Lclient!ng;")
	public Class132_Sub4 method820() {
		return this.aClass65_Sub2_1 == null ? null : this.aClass65_Sub2_1.method7589();
	}

	@OriginalMember(owner = "client!ap", name = "sa", descriptor = "(II)V")
	@Override
	public void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt828 == arg0 && arg1 == this.anInt843) {
			return;
		}
		this.anInt828 = arg0;
		this.anInt843 = arg1;
		this.method762();
		this.method793();
		if (this.anInt819 == 3) {
			this.method782();
		} else if (this.anInt819 == 2) {
			this.method789();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!dga;Lclient!dga;FLclient!dga;)Lclient!dga;")
	@Override
	public Class65 method5402(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class65 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean68 && this.aBoolean70) {
			@Pc(15) Class65_Sub2_Sub2 local15 = null;
			@Pc(18) Class65_Sub2 local18 = (Class65_Sub2) arg0;
			@Pc(21) Class65_Sub2 local21 = (Class65_Sub2) arg1;
			@Pc(25) Class132_Sub4 local25 = local18.method7589();
			@Pc(29) Class132_Sub4 local29 = local21.method7589();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt6663 < local25.anInt6663 ? local25.anInt6663 : local29.anInt6663;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class65_Sub2_Sub2) {
					@Pc(56) Class65_Sub2_Sub2 local56 = (Class65_Sub2_Sub2) arg3;
					if (local44 == local56.method7591()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class65_Sub2_Sub2(this, local44);
				}
				if (local15.method7594(arg2, local29, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ap", name = "y", descriptor = "()Z")
	@Override
	public boolean method5452() {
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!mr;I)V")
	@Override
	public void method5408(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class5_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method7077(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZLclient!jt;)V")
	public void method821(@OriginalArg(1) Interface9 arg0) {
		if (this.aBoolean61) {
			this.method794(arg0);
			this.method831(arg0);
		} else if (this.anInt813 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt813 >= 0) {
				this.anInterface9Array2[this.anInt813].method2365();
			}
			this.anInterface9_1 = this.anInterface9_2 = this.anInterface9Array2[++this.anInt813] = arg0;
			this.anInterface9_1.method2362();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5396() {
		this.method772();
		this.method804(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "(II)V")
	public void method822(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method797(7681, 7681);
		} else if (arg0 == 0) {
			this.method797(8448, 8448);
		} else if (arg0 == 2) {
			this.method797(34165, 7681);
		} else if (arg0 == 3) {
			this.method797(260, 8448);
		} else if (arg0 == 4) {
			this.method797(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)I")
	@Override
	public int method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([BZIIB)Lclient!rl;")
	public Interface18 method823(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return (Interface18) (this.aBoolean64 && (!arg1 || this.aBoolean48) ? new Class108_Sub1(this, arg2, arg0, arg3, arg1) : new Class14_Sub1(this, arg2, arg0, arg3));
	}

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "(B)V")
	private void method824() {
		Static76.aFloatArray6[1] = this.aFloat35 * this.aFloat23;
		Static76.aFloatArray6[2] = this.aFloat18 * this.aFloat35;
		Static76.aFloatArray6[3] = 1.0F;
		Static76.aFloatArray6[0] = this.aFloat29 * this.aFloat35;
		OpenGL.glLightfv(16384, 4609, Static76.aFloatArray6, 0);
		Static76.aFloatArray6[3] = 1.0F;
		Static76.aFloatArray6[0] = this.aFloat29 * -this.aFloat14;
		Static76.aFloatArray6[1] = -this.aFloat14 * this.aFloat23;
		Static76.aFloatArray6[2] = this.aFloat18 * -this.aFloat14;
		OpenGL.glLightfv(16385, 4609, Static76.aFloatArray6, 0);
	}

	@OriginalMember(owner = "client!ap", name = "F", descriptor = "(I)V")
	public void method825() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray3, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray2, 0);
	}

	@OriginalMember(owner = "client!ap", name = "v", descriptor = "()I")
	@Override
	public int v() {
		return this.anInt816 + this.anInt815 + this.anInt817;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BZ)V")
	public void method826(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean50 != arg0) {
			this.aBoolean50 = arg0;
			this.method818();
			this.anInt852 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "(II)V")
	public synchronized void method827(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub24 local8 = new Class6_Sub24(arg0);
		this.aClass211_9.method5173(local8);
	}

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "(B)V")
	private void method828() {
		if (this.lb == null) {
			this.anInt783 = this.anInt742 = 0;
		} else {
			@Pc(16) Dimension local16 = this.lb.getSize();
			this.anInt742 = local16.height;
			this.anInt783 = local16.width;
		}
		if (this.anInterface9_2 == null) {
			this.anInt799 = this.anInt742;
			this.anInt702 = this.anInt783;
			this.method755();
		}
		this.method801();
		this.F();
	}

	@OriginalMember(owner = "client!ap", name = "ca", descriptor = "(IIII)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt799 < arg3) {
			arg3 = this.anInt799;
		}
		if (this.anInt702 < arg2) {
			arg2 = this.anInt702;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt821 = arg3;
		this.anInt838 = arg2;
		this.anInt847 = arg1;
		this.anInt818 = arg0;
		OpenGL.glEnable(3089);
		this.method758();
		this.method792();
	}

	@OriginalMember(owner = "client!ap", name = "G", descriptor = "(I)V")
	private void method829() {
		if (this.aBoolean67) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean67 = false;
		}
	}

	@OriginalMember(owner = "client!ap", name = "LA", descriptor = "(IIII)V")
	@Override
	public void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean63) {
			throw new RuntimeException("");
		}
		this.anInt845 = arg0;
		this.anInt834 = arg3;
		this.anInt844 = arg2;
		this.anInt824 = arg1;
		this.aClass139_1.aClass104_Sub1_1.method2652();
		this.method793();
	}

	@OriginalMember(owner = "client!ap", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt828;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5403(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas3) {
			local5 = this.aLong13;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable1.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.lb == arg0) {
			this.method828();
		}
	}

	@OriginalMember(owner = "client!ap", name = "H", descriptor = "(I)V")
	private void method830() {
		if (this.anInt819 != 2) {
			this.anInt819 = 2;
			this.method789();
			this.method811();
			this.anInt852 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "()V")
	@Override
	public void method5411() throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "()Z")
	@Override
	public boolean method5407() {
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "na", descriptor = "(III[I)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass8_Sub2_3.aFloat160 + this.aClass8_Sub2_3.aFloat161 * (float) arg0 + (float) arg1 * this.aClass8_Sub2_3.aFloat168 + (float) arg2 * this.aClass8_Sub2_3.aFloat169;
		if ((float) this.anInt828 > local28 || local28 > (float) this.anInt843) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass8_Sub2_3.aFloat164 + this.aClass8_Sub2_3.aFloat165 * (float) arg2 + (float) arg0 * this.aClass8_Sub2_3.aFloat166 + this.aClass8_Sub2_3.aFloat163 * (float) arg1) * (float) this.anInt837 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt841 * (this.aClass8_Sub2_3.aFloat162 + this.aClass8_Sub2_3.aFloat159 * (float) arg1 + this.aClass8_Sub2_3.aFloat158 * (float) arg0 + this.aClass8_Sub2_3.aFloat167 * (float) arg2) / local28);
		if (this.aFloat13 <= (float) local85 && (float) local85 <= this.aFloat16 && this.aFloat21 <= (float) local117 && (float) local117 <= this.aFloat20) {
			arg3[0] = (int) ((float) local85 - this.aFloat13);
			arg3[1] = (int) ((float) local117 - this.aFloat21);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)I")
	@Override
	public int method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Lclient!jt;I)V")
	public void method831(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt812 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt812 >= 0) {
			this.anInterface9Array3[this.anInt812].method2367();
		}
		this.anInterface9_2 = this.anInterface9Array3[++this.anInt812] = arg0;
		this.anInterface9_2.method2366();
	}

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "(IIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt837 = arg2;
		this.anInt829 = arg0;
		this.anInt851 = arg1;
		this.anInt841 = arg3;
		this.method762();
		this.method758();
		if (this.anInt819 == 3) {
			this.method782();
		} else if (this.anInt819 == 2) {
			this.method789();
		}
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method5438(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class6_Sub24 local19;
		while (!this.aClass211_7.method5170()) {
			local19 = (Class6_Sub24) this.aClass211_7.method5180();
			Static103.anIntArray181[local11++] = (int) local19.aLong252;
			this.anInt815 -= local19.anInt4156;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static103.anIntArray181, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static103.anIntArray181, 0);
			local11 = 0;
		}
		while (!this.aClass211_8.method5170()) {
			local19 = (Class6_Sub24) this.aClass211_8.method5180();
			Static103.anIntArray181[local11++] = (int) local19.aLong252;
			this.anInt817 -= local19.anInt4156;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static103.anIntArray181, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static103.anIntArray181, 0);
			local11 = 0;
		}
		while (!this.aClass211_9.method5170()) {
			local19 = (Class6_Sub24) this.aClass211_9.method5180();
			Static103.anIntArray181[local11++] = local19.anInt4156;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static103.anIntArray181, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static103.anIntArray181, 0);
			local11 = 0;
		}
		while (!this.aClass211_10.method5170()) {
			local19 = (Class6_Sub24) this.aClass211_10.method5180();
			Static103.anIntArray181[local11++] = (int) local19.aLong252;
			this.anInt816 -= local19.anInt4156;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static103.anIntArray181, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static103.anIntArray181, 0);
		}
		while (!this.aClass211_6.method5170()) {
			local19 = (Class6_Sub24) this.aClass211_6.method5180();
			OpenGL.glDeleteLists((int) local19.aLong252, local19.anInt4156);
		}
		@Pc(215) Class6 local215;
		while (!this.aClass211_11.method5170()) {
			local215 = this.aClass211_11.method5180();
			OpenGL.glDeleteProgramARB((int) local215.aLong252);
		}
		while (!this.aClass211_12.method5170()) {
			local215 = this.aClass211_12.method5180();
			OpenGL.glDeleteObjectARB(local215.aLong252);
		}
		while (!this.aClass211_6.method5170()) {
			local19 = (Class6_Sub24) this.aClass211_6.method5180();
			OpenGL.glDeleteLists((int) local19.aLong252, local19.anInt4156);
		}
		this.aClass316_1.method7581();
		if (this.v() > 100663296 && Static174.method3502() > this.aLong14 + 60000L) {
			System.gc();
			this.aLong14 = Static174.method3502();
		}
		this.anInt810 = local9;
	}
}
