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

@OriginalClass("client!pea")
public final class Class121_Sub3 extends Class121 {

	@OriginalMember(owner = "client!pea", name = "J", descriptor = "I")
	private int anInt6624;

	@OriginalMember(owner = "client!pea", name = "R", descriptor = "I")
	private int anInt6632;

	@OriginalMember(owner = "client!pea", name = "ud", descriptor = "I")
	public int anInt6758;

	@OriginalMember(owner = "client!pea", name = "ae", descriptor = "I")
	public int anInt6787;

	@OriginalMember(owner = "client!pea", name = "xe", descriptor = "I")
	public int anInt6800;

	@OriginalMember(owner = "client!pea", name = "ye", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!pea", name = "ze", descriptor = "Lclient!rk;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!pea", name = "Be", descriptor = "Lclient!rk;")
	private Interface17 anInterface17_2;

	@OriginalMember(owner = "client!pea", name = "Ie", descriptor = "I")
	public int anInt6804;

	@OriginalMember(owner = "client!pea", name = "Je", descriptor = "I")
	public int anInt6805;

	@OriginalMember(owner = "client!pea", name = "Ke", descriptor = "I")
	private int anInt6806;

	@OriginalMember(owner = "client!pea", name = "Re", descriptor = "I")
	private int anInt6807;

	@OriginalMember(owner = "client!pea", name = "Se", descriptor = "Z")
	public boolean aBoolean456;

	@OriginalMember(owner = "client!pea", name = "Te", descriptor = "Z")
	public boolean aBoolean457;

	@OriginalMember(owner = "client!pea", name = "We", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!pea", name = "Xe", descriptor = "Z")
	private boolean aBoolean459;

	@OriginalMember(owner = "client!pea", name = "Ze", descriptor = "I")
	public int anInt6810;

	@OriginalMember(owner = "client!pea", name = "af", descriptor = "Z")
	private boolean aBoolean460;

	@OriginalMember(owner = "client!pea", name = "ef", descriptor = "Lclient!kw;")
	private Class17_Sub2 aClass17_Sub2_1;

	@OriginalMember(owner = "client!pea", name = "gf", descriptor = "Z")
	public boolean aBoolean461;

	@OriginalMember(owner = "client!pea", name = "hf", descriptor = "I")
	public int anInt6813;

	@OriginalMember(owner = "client!pea", name = "jf", descriptor = "Lclient!gb;")
	public Class34_Sub2 aClass34_Sub2_3;

	@OriginalMember(owner = "client!pea", name = "lf", descriptor = "Lclient!eca;")
	public Class22_Sub2 aClass22_Sub2_1;

	@OriginalMember(owner = "client!pea", name = "mf", descriptor = "F")
	private float aFloat145;

	@OriginalMember(owner = "client!pea", name = "nf", descriptor = "I")
	private int anInt6814;

	@OriginalMember(owner = "client!pea", name = "of", descriptor = "I")
	private int anInt6815;

	@OriginalMember(owner = "client!pea", name = "pf", descriptor = "Lclient!av;")
	private Interface2 anInterface2_6;

	@OriginalMember(owner = "client!pea", name = "qf", descriptor = "Z")
	public boolean aBoolean462;

	@OriginalMember(owner = "client!pea", name = "rf", descriptor = "Z")
	private boolean aBoolean463;

	@OriginalMember(owner = "client!pea", name = "tf", descriptor = "I")
	private int anInt6816;

	@OriginalMember(owner = "client!pea", name = "vf", descriptor = "Lclient!eca;")
	public Class22_Sub2 aClass22_Sub2_2;

	@OriginalMember(owner = "client!pea", name = "Bf", descriptor = "I")
	private int anInt6820;

	@OriginalMember(owner = "client!pea", name = "Cf", descriptor = "Z")
	private boolean aBoolean465;

	@OriginalMember(owner = "client!pea", name = "Ff", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!pea", name = "Gf", descriptor = "Lclient!uf;")
	public Class315 aClass315_3;

	@OriginalMember(owner = "client!pea", name = "Hf", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!pea", name = "If", descriptor = "Ljava/lang/String;")
	private String aString83;

	@OriginalMember(owner = "client!pea", name = "Jf", descriptor = "I")
	private int anInt6822;

	@OriginalMember(owner = "client!pea", name = "Lf", descriptor = "Lclient!eca;")
	public Class22_Sub2 aClass22_Sub2_3;

	@OriginalMember(owner = "client!pea", name = "Mf", descriptor = "I")
	private int anInt6823;

	@OriginalMember(owner = "client!pea", name = "Of", descriptor = "Lclient!gb;")
	public Class34_Sub2 aClass34_Sub2_4;

	@OriginalMember(owner = "client!pea", name = "Pf", descriptor = "I")
	private int anInt6824;

	@OriginalMember(owner = "client!pea", name = "Sf", descriptor = "F")
	private float aFloat151;

	@OriginalMember(owner = "client!pea", name = "Tf", descriptor = "I")
	public int anInt6826;

	@OriginalMember(owner = "client!pea", name = "Uf", descriptor = "Lclient!eca;")
	public Class22_Sub2 aClass22_Sub2_4;

	@OriginalMember(owner = "client!pea", name = "Vf", descriptor = "Z")
	private boolean aBoolean469;

	@OriginalMember(owner = "client!pea", name = "Yf", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!pea", name = "ag", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!pea", name = "dg", descriptor = "[Lclient!wq;")
	private Class35[] aClass35Array1;

	@OriginalMember(owner = "client!pea", name = "eg", descriptor = "Lclient!av;")
	private Interface2 anInterface2_7;

	@OriginalMember(owner = "client!pea", name = "fg", descriptor = "I")
	private int anInt6827;

	@OriginalMember(owner = "client!pea", name = "ig", descriptor = "Z")
	private boolean aBoolean473;

	@OriginalMember(owner = "client!pea", name = "kg", descriptor = "Z")
	public boolean aBoolean474;

	@OriginalMember(owner = "client!pea", name = "lg", descriptor = "Lclient!qw;")
	public Class35_Sub3 aClass35_Sub3_4;

	@OriginalMember(owner = "client!pea", name = "ng", descriptor = "Z")
	private boolean aBoolean475;

	@OriginalMember(owner = "client!pea", name = "pg", descriptor = "Lclient!eca;")
	public Class22_Sub2 aClass22_Sub2_5;

	@OriginalMember(owner = "client!pea", name = "rg", descriptor = "Z")
	private boolean aBoolean476;

	@OriginalMember(owner = "client!pea", name = "sg", descriptor = "Z")
	public boolean aBoolean477;

	@OriginalMember(owner = "client!pea", name = "tg", descriptor = "F")
	private float aFloat155;

	@OriginalMember(owner = "client!pea", name = "ug", descriptor = "I")
	public int anInt6832;

	@OriginalMember(owner = "client!pea", name = "xg", descriptor = "Lclient!rm;")
	private Interface19 anInterface19_4;

	@OriginalMember(owner = "client!pea", name = "yg", descriptor = "F")
	private float aFloat157;

	@OriginalMember(owner = "client!pea", name = "Ag", descriptor = "Lclient!eca;")
	public Class22_Sub2 aClass22_Sub2_6;

	@OriginalMember(owner = "client!pea", name = "Bg", descriptor = "Z")
	private boolean aBoolean479;

	@OriginalMember(owner = "client!pea", name = "Gg", descriptor = "Lclient!eca;")
	public Class22_Sub2 aClass22_Sub2_7;

	@OriginalMember(owner = "client!pea", name = "Hg", descriptor = "Lclient!eca;")
	public Class22_Sub2 aClass22_Sub2_8;

	@OriginalMember(owner = "client!pea", name = "Ig", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!pea", name = "Jg", descriptor = "Lclient!eca;")
	public Class22_Sub2 aClass22_Sub2_9;

	@OriginalMember(owner = "client!pea", name = "Kg", descriptor = "Lclient!cm;")
	public Class53 aClass53_14;

	@OriginalMember(owner = "client!pea", name = "Lg", descriptor = "Z")
	private boolean aBoolean480;

	@OriginalMember(owner = "client!pea", name = "Og", descriptor = "Lclient!cm;")
	public Class53 aClass53_15;

	@OriginalMember(owner = "client!pea", name = "Pg", descriptor = "I")
	private int anInt6835;

	@OriginalMember(owner = "client!pea", name = "Rg", descriptor = "I")
	private int anInt6836;

	@OriginalMember(owner = "client!pea", name = "Sg", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!pea", name = "Wg", descriptor = "Z")
	public boolean aBoolean481;

	@OriginalMember(owner = "client!pea", name = "Xg", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!pea", name = "Yg", descriptor = "Lclient!mm;")
	private Class35_Sub3_Sub1 aClass35_Sub3_Sub1_4;

	@OriginalMember(owner = "client!pea", name = "bh", descriptor = "Ljava/lang/String;")
	private String aString84;

	@OriginalMember(owner = "client!pea", name = "ch", descriptor = "Z")
	public boolean aBoolean482;

	@OriginalMember(owner = "client!pea", name = "eh", descriptor = "Lclient!eca;")
	public Class22_Sub2 aClass22_Sub2_10;

	@OriginalMember(owner = "client!pea", name = "ih", descriptor = "I")
	private int anInt6843;

	@OriginalMember(owner = "client!pea", name = "jh", descriptor = "I")
	private int anInt6844;

	@OriginalMember(owner = "client!pea", name = "Dd", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!pea", name = "oe", descriptor = "I")
	public int anInt6797 = 128;

	@OriginalMember(owner = "client!pea", name = "le", descriptor = "Lclient!ds;")
	private final Class74 aClass74_1 = new Class74();

	@OriginalMember(owner = "client!pea", name = "qe", descriptor = "Lclient!gb;")
	private final Class34_Sub2 aClass34_Sub2_1 = new Class34_Sub2();

	@OriginalMember(owner = "client!pea", name = "re", descriptor = "Lclient!gb;")
	public final Class34_Sub2 aClass34_Sub2_2 = new Class34_Sub2();

	@OriginalMember(owner = "client!pea", name = "se", descriptor = "Z")
	private boolean aBoolean455 = false;

	@OriginalMember(owner = "client!pea", name = "ue", descriptor = "I")
	public int anInt6799 = 8;

	@OriginalMember(owner = "client!pea", name = "te", descriptor = "I")
	public int anInt6798 = 3;

	@OriginalMember(owner = "client!pea", name = "ve", descriptor = "Lclient!rh;")
	private final Class275 aClass275_136 = new Class275();

	@OriginalMember(owner = "client!pea", name = "De", descriptor = "I")
	private int anInt6801 = -1;

	@OriginalMember(owner = "client!pea", name = "Fe", descriptor = "I")
	private int anInt6802 = -1;

	@OriginalMember(owner = "client!pea", name = "Ee", descriptor = "[Lclient!rk;")
	private final Interface17[] anInterface17Array3 = new Interface17[4];

	@OriginalMember(owner = "client!pea", name = "Ae", descriptor = "[Lclient!rk;")
	private final Interface17[] anInterface17Array1 = new Interface17[4];

	@OriginalMember(owner = "client!pea", name = "Ce", descriptor = "[Lclient!rk;")
	private final Interface17[] anInterface17Array2 = new Interface17[4];

	@OriginalMember(owner = "client!pea", name = "Ge", descriptor = "I")
	private int anInt6803 = -1;

	@OriginalMember(owner = "client!pea", name = "He", descriptor = "Lclient!rh;")
	private final Class275 aClass275_137;

	@OriginalMember(owner = "client!pea", name = "Le", descriptor = "Lclient!rh;")
	private final Class275 aClass275_138;

	@OriginalMember(owner = "client!pea", name = "Me", descriptor = "Lclient!rh;")
	private final Class275 aClass275_139;

	@OriginalMember(owner = "client!pea", name = "Ne", descriptor = "Lclient!rh;")
	private final Class275 aClass275_140;

	@OriginalMember(owner = "client!pea", name = "Oe", descriptor = "Lclient!rh;")
	private final Class275 aClass275_141;

	@OriginalMember(owner = "client!pea", name = "Pe", descriptor = "Lclient!rh;")
	private final Class275 aClass275_142;

	@OriginalMember(owner = "client!pea", name = "Qe", descriptor = "Lclient!rh;")
	private final Class275 aClass275_143;

	@OriginalMember(owner = "client!pea", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!pea", name = "ff", descriptor = "I")
	public int anInt6812;

	@OriginalMember(owner = "client!pea", name = "yf", descriptor = "F")
	private float aFloat146;

	@OriginalMember(owner = "client!pea", name = "df", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!pea", name = "kf", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!pea", name = "zf", descriptor = "F")
	public float aFloat147;

	@OriginalMember(owner = "client!pea", name = "Ve", descriptor = "I")
	private int anInt6809;

	@OriginalMember(owner = "client!pea", name = "sf", descriptor = "[F")
	public final float[] aFloatArray41;

	@OriginalMember(owner = "client!pea", name = "uf", descriptor = "I")
	public int anInt6817;

	@OriginalMember(owner = "client!pea", name = "qg", descriptor = "[F")
	private final float[] aFloatArray43;

	@OriginalMember(owner = "client!pea", name = "Xf", descriptor = "F")
	private float aFloat153;

	@OriginalMember(owner = "client!pea", name = "jg", descriptor = "I")
	private int anInt6830;

	@OriginalMember(owner = "client!pea", name = "Wf", descriptor = "F")
	private float aFloat152;

	@OriginalMember(owner = "client!pea", name = "Ye", descriptor = "[Lclient!hj;")
	private final Class6_Sub7[] aClass6_Sub7Array5;

	@OriginalMember(owner = "client!pea", name = "Df", descriptor = "F")
	public float aFloat148;

	@OriginalMember(owner = "client!pea", name = "xf", descriptor = "I")
	public int anInt6818;

	@OriginalMember(owner = "client!pea", name = "gg", descriptor = "I")
	public int anInt6828;

	@OriginalMember(owner = "client!pea", name = "cf", descriptor = "I")
	public int anInt6811;

	@OriginalMember(owner = "client!pea", name = "wg", descriptor = "F")
	private float aFloat156;

	@OriginalMember(owner = "client!pea", name = "Cg", descriptor = "I")
	public int anInt6833;

	@OriginalMember(owner = "client!pea", name = "Rf", descriptor = "I")
	private int anInt6825;

	@OriginalMember(owner = "client!pea", name = "Eg", descriptor = "F")
	private float aFloat160;

	@OriginalMember(owner = "client!pea", name = "hg", descriptor = "I")
	private int anInt6829;

	@OriginalMember(owner = "client!pea", name = "Qg", descriptor = "[F")
	private final float[] aFloatArray44;

	@OriginalMember(owner = "client!pea", name = "Ue", descriptor = "I")
	private int anInt6808;

	@OriginalMember(owner = "client!pea", name = "og", descriptor = "I")
	public int anInt6831;

	@OriginalMember(owner = "client!pea", name = "Ef", descriptor = "I")
	public int anInt6821;

	@OriginalMember(owner = "client!pea", name = "zg", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!pea", name = "Tg", descriptor = "I")
	private int anInt6837;

	@OriginalMember(owner = "client!pea", name = "Mg", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!pea", name = "ah", descriptor = "I")
	private int anInt6840;

	@OriginalMember(owner = "client!pea", name = "Dg", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!pea", name = "mg", descriptor = "[F")
	private final float[] aFloatArray42;

	@OriginalMember(owner = "client!pea", name = "Vg", descriptor = "I")
	public int anInt6838;

	@OriginalMember(owner = "client!pea", name = "Fg", descriptor = "F")
	private float aFloat161;

	@OriginalMember(owner = "client!pea", name = "Ug", descriptor = "[F")
	private final float[] aFloatArray45;

	@OriginalMember(owner = "client!pea", name = "Zg", descriptor = "I")
	private int anInt6839;

	@OriginalMember(owner = "client!pea", name = "Ng", descriptor = "I")
	private int anInt6834;

	@OriginalMember(owner = "client!pea", name = "fh", descriptor = "I")
	public int anInt6841;

	@OriginalMember(owner = "client!pea", name = "gh", descriptor = "I")
	public int anInt6842;

	@OriginalMember(owner = "client!pea", name = "hh", descriptor = "Z")
	private boolean aBoolean483;

	@OriginalMember(owner = "client!pea", name = "dh", descriptor = "Lclient!kj;")
	public Class6_Sub14_Sub1 aClass6_Sub14_Sub1_3;

	@OriginalMember(owner = "client!pea", name = "kh", descriptor = "[B")
	public final byte[] aByteArray83;

	@OriginalMember(owner = "client!pea", name = "lh", descriptor = "[I")
	public int[] anIntArray558;

	@OriginalMember(owner = "client!pea", name = "mh", descriptor = "[I")
	public int[] anIntArray559;

	@OriginalMember(owner = "client!pea", name = "nh", descriptor = "[I")
	public int[] anIntArray560;

	@OriginalMember(owner = "client!pea", name = "fd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas12;

	@OriginalMember(owner = "client!pea", name = "E", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!pea", name = "je", descriptor = "I")
	public final int anInt6795;

	@OriginalMember(owner = "client!pea", name = "Wc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!pea", name = "Wb", descriptor = "J")
	private final long aLong176;

	@OriginalMember(owner = "client!pea", name = "Ld", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!pea", name = "Af", descriptor = "I")
	public final int anInt6819;

	@OriginalMember(owner = "client!pea", name = "cg", descriptor = "Z")
	public boolean aBoolean472;

	@OriginalMember(owner = "client!pea", name = "Kf", descriptor = "Z")
	private boolean aBoolean466;

	@OriginalMember(owner = "client!pea", name = "Zf", descriptor = "Z")
	public boolean aBoolean470;

	@OriginalMember(owner = "client!pea", name = "wf", descriptor = "Z")
	public boolean aBoolean464;

	@OriginalMember(owner = "client!pea", name = "Nf", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!pea", name = "vg", descriptor = "Z")
	public boolean aBoolean478;

	@OriginalMember(owner = "client!pea", name = "Qf", descriptor = "Z")
	public boolean aBoolean468;

	@OriginalMember(owner = "client!pea", name = "bg", descriptor = "Z")
	private final boolean aBoolean471;

	@OriginalMember(owner = "client!pea", name = "pe", descriptor = "Lclient!lg;")
	private final Class183 aClass183_1;

	@OriginalMember(owner = "client!pea", name = "we", descriptor = "Lclient!co;")
	public final Class54 aClass54_1;

	@OriginalMember(owner = "client!pea", name = "ke", descriptor = "Lclient!to;")
	private final Class308 aClass308_1;

	@OriginalMember(owner = "client!pea", name = "ie", descriptor = "Lclient!mu;")
	private Class6_Sub27_Sub1 aClass6_Sub27_Sub1_1;

	@OriginalMember(owner = "client!pea", name = "me", descriptor = "Lclient!tm;")
	private final Class306 aClass306_1;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;I)V")
	public Class121_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class144();
		new Class212(16);
		this.aClass275_137 = new Class275();
		this.aClass275_138 = new Class275();
		this.aClass275_139 = new Class275();
		this.aClass275_140 = new Class275();
		this.aClass275_141 = new Class275();
		this.aClass275_142 = new Class275();
		this.aClass275_143 = new Class275();
		this.bf = 8448;
		this.anInt6812 = 3584;
		this.aFloat146 = 3000.0F;
		this.aFloat143 = 1.0F;
		this.aFloat144 = 3584.0F;
		this.aFloat147 = 3584.0F;
		this.anInt6809 = 0;
		this.aFloatArray41 = new float[4];
		this.anInt6817 = -1;
		this.aFloatArray43 = new float[16];
		this.aFloat153 = 0.0F;
		this.anInt6830 = 0;
		this.aFloat152 = 1.0F;
		this.aClass6_Sub7Array5 = new Class6_Sub7[Static466.anInt7902];
		this.aFloat148 = -1.0F;
		this.anInt6818 = -1;
		this.anInt6828 = 0;
		this.anInt6811 = 0;
		this.aFloat156 = -1.0F;
		this.anInt6833 = 50;
		this.anInt6825 = 8448;
		this.aFloat160 = -1.0F;
		this.anInt6829 = 0;
		this.aFloatArray44 = new float[4];
		this.anInt6808 = -1;
		this.anInt6831 = 512;
		this.anInt6821 = 512;
		this.aFloat158 = -1.0F;
		this.anInt6837 = 0;
		this.aFloat163 = 1.0F;
		this.anInt6840 = 0;
		this.aFloat159 = 1.0F;
		this.aFloatArray42 = new float[4];
		this.anInt6838 = 0;
		this.aFloat161 = 1.0F;
		this.aFloatArray45 = new float[4];
		this.anInt6839 = -1;
		this.anInt6834 = 0;
		this.anInt6841 = 0;
		this.anInt6842 = -1;
		this.aBoolean483 = true;
		this.aClass6_Sub14_Sub1_3 = new Class6_Sub14_Sub1(8192);
		this.aByteArray83 = new byte[16384];
		this.anIntArray558 = new int[1];
		this.anIntArray559 = new int[1];
		this.anIntArray560 = new int[1];
		this.aCanvas11 = this.aCanvas12 = arg0;
		this.anInt6795 = arg2;
		if (!Static69.method889("jaclib")) {
			throw new RuntimeException("");
		} else if (Static69.method889("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong177 = this.aLong176 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt6795);
				if (this.aLong176 == 0L) {
					throw new RuntimeException("");
				}
				this.method5691();
				@Pc(318) int local318 = this.method5676();
				if (local318 != 0) {
					throw new RuntimeException("");
				}
				this.anInt6819 = this.aBoolean458 ? 33639 : 5121;
				@Pc(345) int local345;
				if (this.aString84.indexOf("radeon") != -1) {
					local345 = 0;
					@Pc(347) boolean local347 = false;
					@Pc(349) boolean local349 = false;
					@Pc(358) String[] local358 = Static128.method1936(this.aString84.replace('/', ' '), ' ');
					for (@Pc(360) int local360 = 0; local360 < local358.length; local360++) {
						@Pc(366) String local366 = local358[local360];
						try {
							if (local366.length() > 0) {
								if (local366.charAt(0) == 'x' && local366.length() >= 3 && Static44.method598(local366.substring(1, 3))) {
									local366 = local366.substring(1);
									local349 = true;
								}
								if (local366.equals("hd")) {
									local347 = true;
								} else {
									if (local366.startsWith("hd")) {
										local366 = local366.substring(2);
										local347 = true;
									}
									if (local366.length() >= 4 && Static44.method598(local366.substring(0, 4))) {
										local345 = Static467.method6543(local366.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(431) Exception local431) {
						}
					}
					if (!local349 && !local347) {
						if (local345 >= 7000 && local345 <= 9250) {
							this.aBoolean472 = false;
						}
						if (local345 >= 7000 && local345 <= 7999) {
							this.aBoolean466 = false;
						}
					}
					if (!local347 || local345 < 4000) {
						this.aBoolean470 = false;
					}
					this.aBoolean464 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean467 = this.aBoolean466;
					this.aBoolean478 = true;
				}
				if (this.aString83.indexOf("intel") != -1) {
					this.aBoolean468 = false;
				}
				this.aBoolean471 = !this.aString83.equals("s3 graphics");
				if (this.aBoolean466) {
					try {
						@Pc(517) int[] local517 = new int[1];
						OpenGL.glGenBuffersARB(1, local517, 0);
					} catch (@Pc(523) Throwable local523) {
						throw new RuntimeException("");
					}
				}
				Static285.method4044(true, false);
				this.aBoolean455 = true;
				this.aClass183_1 = new Class183(this, super.anInterface7_14);
				this.method5719();
				this.aClass54_1 = new Class54(this);
				this.aClass308_1 = new Class308(this);
				if (this.aClass308_1.method6822()) {
					this.aClass6_Sub27_Sub1_1 = new Class6_Sub27_Sub1(this);
					if (!this.aClass6_Sub27_Sub1_1.method4976()) {
						this.aClass6_Sub27_Sub1_1.method4967();
						this.aClass6_Sub27_Sub1_1 = null;
					}
				}
				this.aClass306_1 = new Class306(this);
				this.method5718();
				this.method5660();
				OpenGL.glClear(16640);
				local345 = 0;
				while (true) {
					try {
						this.anOpenGL2.swapBuffers();
						break;
					} catch (@Pc(602) Exception local602) {
						if (local345++ > 5) {
							throw new RuntimeException("");
						}
						Static149.method2211(100L);
					}
				}
				OpenGL.glClear(16384);
			} catch (@Pc(622) Throwable local622) {
				local622.printStackTrace();
				this.method7125();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pea", name = "JA", descriptor = "(I)V")
	@Override
	public void JA(@OriginalArg(0) int arg0) {
		this.anInt6798 = 0;
		while (arg0 > 1) {
			this.anInt6798++;
			arg0 >>= 0x1;
		}
		this.anInt6799 = 0x1 << this.anInt6798;
	}

	@OriginalMember(owner = "client!pea", name = "g", descriptor = "(I)V")
	@Override
	public void method7119(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "(I)V")
	private void method5644() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "()Z")
	@Override
	public boolean method7093() {
		return false;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BZ)V")
	public void method5645(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean465) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean465 = arg0;
		this.anInt6827 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "(I)V")
	public void method5646() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
	private void method5647() {
		if (this.anInt6814 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt6758 > 0 && this.anInt6787 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt6758, (double) this.anInt6787, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt6827 &= 0xFFFFFFE7;
		this.anInt6814 = 1;
	}

	@OriginalMember(owner = "client!pea", name = "x", descriptor = "()Z")
	@Override
	public boolean method7143() {
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "p", descriptor = "()V")
	@Override
	public void method7130() {
		this.aClass308_1.method6824();
	}

	@OriginalMember(owner = "client!pea", name = "l", descriptor = "()Lclient!ru;")
	@Override
	public Class282 method7124() {
		@Pc(7) int local7 = -1;
		if (this.aString83.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString83.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString83.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class282(local7, "OpenGL", this.anInt6820, this.aString84, 0L);
	}

	@OriginalMember(owner = "client!pea", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean461 = true;
		this.anInt6839 = arg1;
		this.anInt6842 = arg2;
		this.anInt6828 = arg3;
		this.anInt6832 = arg0;
		this.aClass306_1.method6804(false, 0, 0, 3, false);
		this.aClass306_1.aClass52_Sub9_1.method7610();
		this.method5721();
		this.method5669();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IB)V")
	public void method5648(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt6815) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt6815 = arg0;
		}
	}

	@OriginalMember(owner = "client!pea", name = "na", descriptor = "(III[I)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass34_Sub2_4.aFloat36 + (float) arg2 * this.aClass34_Sub2_4.aFloat32 + this.aClass34_Sub2_4.aFloat34 * (float) arg0 + (float) arg1 * this.aClass34_Sub2_4.aFloat27;
		if ((float) this.anInt6833 > local28 || local28 > (float) this.anInt6812) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) (((float) arg0 * this.aClass34_Sub2_4.aFloat37 + this.aClass34_Sub2_4.aFloat35 * (float) arg1 + (float) arg2 * this.aClass34_Sub2_4.aFloat29 + this.aClass34_Sub2_4.aFloat33) * (float) this.anInt6821 / local28);
		@Pc(117) int local117 = (int) ((this.aClass34_Sub2_4.aFloat28 + this.aClass34_Sub2_4.aFloat31 * (float) arg2 + this.aClass34_Sub2_4.aFloat30 * (float) arg1 + this.aClass34_Sub2_4.aFloat38 * (float) arg0) * (float) this.anInt6831 / local28);
		if ((float) local85 >= this.aFloat165 && (float) local85 <= this.aFloat164 && this.aFloat149 <= (float) local117 && (float) local117 <= this.aFloat154) {
			arg3[1] = (int) ((float) local117 - this.aFloat149);
			arg3[0] = (int) ((float) local85 - this.aFloat165);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "(I)V")
	private void method5649() {
		if (this.aFloat151 == 0.0F) {
			this.aFloatArray43[14] = this.aFloat145;
			this.aFloatArray43[10] = this.aFloat155;
		} else {
			@Pc(27) float local27 = this.aFloat146 / (this.aFloat151 + this.aFloat146);
			@Pc(31) float local31 = local27 * local27;
			@Pc(48) float local48 = -this.aFloat145 * (1.0F - local27) * (1.0F - local27) / this.aFloat151;
			this.aFloatArray43[14] = this.aFloat145 * local31;
			this.aFloatArray43[10] = this.aFloat155 + local48;
		}
		this.aFloat144 = ((float) -this.anInt6812 + this.aFloatArray43[14]) / this.aFloatArray43[10];
		this.aFloat147 = (float) this.anInt6812 - this.aFloat151;
	}

	@OriginalMember(owner = "client!pea", name = "A", descriptor = "([I)V")
	@Override
	public void A(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt6830;
		arg0[0] = this.anInt6837;
		arg0[1] = this.anInt6829;
		arg0[2] = this.anInt6809;
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(B)V")
	private void method5650() {
		OpenGL.glDepthMask(this.aBoolean463 && this.aBoolean483);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(II)I")
	@Override
	public int method7099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!pea", name = "C", descriptor = "(IIIIII)V")
	@Override
	public void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method5728();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method5707(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean475) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean475) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIZ)V")
	public synchronized void method5651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub9 local8 = new Class6_Sub9(arg0);
		local8.aLong249 = arg1;
		this.aClass275_141.method6370(local8);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!rk;B)V")
	public void method5652(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt6802 < 0 || arg0 != this.anInterface17Array2[this.anInt6802]) {
			throw new RuntimeException();
		}
		this.anInterface17Array2[this.anInt6802--] = null;
		arg0.method7044();
		if (this.anInt6802 < 0) {
			this.anInterface17_1 = null;
		} else {
			this.anInterface17_1 = this.anInterface17Array2[this.anInt6802];
			this.anInterface17_1.method7047();
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "()Z")
	@Override
	public boolean method7081() {
		return false;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILclient!av;)V")
	public void method5653(@OriginalArg(1) Interface2 arg0) {
		if (this.anInterface2_6 != arg0) {
			if (this.aBoolean466) {
				OpenGL.glBindBufferARB(34962, arg0.method6953());
			}
			this.anInterface2_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Z[BIII)Lclient!av;")
	public Interface2 method5654(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return (Interface2) (this.aBoolean466 && (!arg0 || this.aBoolean467) ? new Class15_Sub2(this, arg2, arg1, arg3, arg0) : new Class113_Sub2(this, arg2, arg1, arg3));
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5728();
		this.method5707(arg5);
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

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!aq;)V")
	@Override
	public void method7108(@OriginalArg(0) Class17 arg0) {
		this.aClass17_Sub2_1 = (Class17_Sub2) arg0;
	}

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "()Z")
	@Override
	public boolean method7103() {
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZZ)V")
	public void method5655(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean479) {
			this.aBoolean479 = arg0;
			this.method5700();
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(FI)V")
	public void method5656(@OriginalArg(0) float arg0) {
		if (arg0 == this.aFloat161) {
			return;
		}
		this.aFloat161 = arg0;
		if (this.anInt6814 == 3) {
			this.method5678();
			return;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIILclient!rm;)V")
	public void method5657(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Interface19 arg2) {
		@Pc(7) int local7 = arg2.method6483();
		@Pc(14) int local14 = arg1 * this.method5686(local7);
		this.method5696(arg2);
		OpenGL.glDrawElements(4, arg0, local7, arg2.method6486() + (long) local14);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZ[BII)Lclient!rm;")
	public Interface19 method5658(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2) {
		return (Interface19) (this.aBoolean466 && (!arg1 || this.aBoolean467) ? new Class15_Sub1(this, 5123, arg2, arg0, arg1) : new Class113_Sub1(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!pea", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		@Pc(6) int local6 = this.anInt6844;
		this.anInt6844 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(III)V")
	public void method5659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6815 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(14) boolean local14 = false;
		if (arg1 != this.anInt6825) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local14 = true;
			this.anInt6825 = arg1;
		}
		if (arg0 != this.bf) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local14 = true;
			this.bf = arg0;
		}
		if (local14) {
			this.anInt6827 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!pea", name = "j", descriptor = "(I)V")
	private void method5660() {
		if (this.aCanvas11 == null) {
			this.anInt6632 = this.anInt6624 = 0;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas11.getSize();
			this.anInt6624 = local18.height;
			this.anInt6632 = local18.width;
		}
		if (this.anInterface17_2 == null) {
			this.anInt6787 = this.anInt6624;
			this.anInt6758 = this.anInt6632;
			this.method5710();
		}
		this.method5726();
		this.F();
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "(II)V")
	public synchronized void method5661(@OriginalArg(0) int arg0) {
		@Pc(13) Class6 local13 = new Class6();
		local13.aLong249 = arg0;
		this.aClass275_142.method6370(local13);
	}

	@OriginalMember(owner = "client!pea", name = "k", descriptor = "(I)V")
	public void method5662() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method7117(@OriginalArg(0) Class6_Sub24 arg0) {
		this.aNativeHeap5 = ((Class6_Sub24_Sub1) arg0).aNativeHeap1;
		if (this.anInterface2_7 != null) {
			return;
		}
		@Pc(16) Class6_Sub14_Sub1 local16 = new Class6_Sub14_Sub1(80);
		if (this.aBoolean458) {
			local16.method3726(-1.0F);
			local16.method3726(-1.0F);
			local16.method3726(0.0F);
			local16.method3726(0.0F);
			local16.method3726(1.0F);
			local16.method3726(1.0F);
			local16.method3726(-1.0F);
			local16.method3726(0.0F);
			local16.method3726(1.0F);
			local16.method3726(1.0F);
			local16.method3726(1.0F);
			local16.method3726(1.0F);
			local16.method3726(0.0F);
			local16.method3726(1.0F);
			local16.method3726(0.0F);
			local16.method3726(-1.0F);
			local16.method3726(1.0F);
			local16.method3726(0.0F);
			local16.method3726(0.0F);
			local16.method3726(0.0F);
		} else {
			local16.method3725(-1.0F);
			local16.method3725(-1.0F);
			local16.method3725(0.0F);
			local16.method3725(0.0F);
			local16.method3725(1.0F);
			local16.method3725(1.0F);
			local16.method3725(-1.0F);
			local16.method3725(0.0F);
			local16.method3725(1.0F);
			local16.method3725(1.0F);
			local16.method3725(1.0F);
			local16.method3725(1.0F);
			local16.method3725(0.0F);
			local16.method3725(1.0F);
			local16.method3725(0.0F);
			local16.method3725(-1.0F);
			local16.method3725(1.0F);
			local16.method3725(0.0F);
			local16.method3725(0.0F);
			local16.method3725(0.0F);
		}
		this.anInterface2_7 = this.method5654(false, local16.aByteArray88, 20, local16.anInt7244);
		this.aClass53_14 = new Class53(this.anInterface2_7, 5126, 3, 0);
		this.aClass53_15 = new Class53(this.anInterface2_7, 5126, 2, 12);
		this.aClass74_1.method1500(this);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!aq;Lclient!aq;FLclient!aq;)Lclient!aq;")
	@Override
	public Class17 method7104(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class17 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean456 && this.aBoolean468) {
			@Pc(15) Class17_Sub2_Sub2 local15 = null;
			@Pc(18) Class17_Sub2 local18 = (Class17_Sub2) arg0;
			@Pc(21) Class17_Sub2 local21 = (Class17_Sub2) arg1;
			@Pc(25) Class35_Sub2 local25 = local18.method2856();
			@Pc(29) Class35_Sub2 local29 = local21.method2856();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt1135 <= local29.anInt1135 ? local29.anInt1135 : local25.anInt1135;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class17_Sub2_Sub2) {
					@Pc(60) Class17_Sub2_Sub2 local60 = (Class17_Sub2_Sub2) arg3;
					if (local48 == local60.method2861()) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class17_Sub2_Sub2(this, local48);
				}
				if (local15.method2859(local25, local29, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "(B)V")
	private void method5664() {
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.anInt6823; local13++) {
			@Pc(20) Class6_Sub7 local20 = this.aClass6_Sub7Array5[local13];
			@Pc(24) int local24 = local13 + 16386;
			Static379.aFloatArray40[0] = local20.method3490();
			Static379.aFloatArray40[1] = local20.method3493();
			Static379.aFloatArray40[2] = local20.method3492();
			Static379.aFloatArray40[3] = 1.0F;
			OpenGL.glLightfv(local24, 4611, Static379.aFloatArray40, 0);
			@Pc(58) int local58 = local20.method3486();
			@Pc(64) float local64 = local20.method3491() / 255.0F;
			Static379.aFloatArray40[2] = local64 * (float) (local58 & 0xFF);
			Static379.aFloatArray40[1] = (float) (local58 >> 8 & 0xFF) * local64;
			Static379.aFloatArray40[0] = local64 * (float) (local58 >> 16 & 0xFF);
			OpenGL.glLightfv(local24, 4609, Static379.aFloatArray40, 0);
			OpenGL.glLightf(local24, 4617, 1.0F / (float) (local20.method3487() * local20.method3487()));
			OpenGL.glEnable(local24);
		}
		while (local13 < this.anInt6822) {
			OpenGL.glDisable(local13 + 16386);
			local13++;
		}
		this.anInt6822 = this.anInt6823;
	}

	@OriginalMember(owner = "client!pea", name = "ka", descriptor = "(FF)V")
	@Override
	public void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat146 && arg1 == this.aFloat151) {
			return;
		}
		this.aFloat146 = arg0;
		this.aFloat151 = arg1;
		this.method5649();
		if (this.anInt6814 == 3) {
			this.method5678();
		} else if (this.anInt6814 == 2) {
			this.method5709();
			return;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZ)V")
	public void method5665(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean463) {
			this.aBoolean463 = arg0;
			this.method5650();
			this.anInt6827 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pea", name = "m", descriptor = "(I)V")
	private void method5666() {
		this.aFloat154 = this.anInt6830 - this.anInt6841;
		this.aFloat164 = this.anInt6809 - this.anInt6838;
		this.aFloat149 = this.anInt6829 - this.anInt6841;
		this.aFloat165 = this.anInt6837 - this.anInt6838;
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(IIII)V")
	public void method5667(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLclient!gb;)V")
	public void method5668(@OriginalArg(1) Class34_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method2285(), 0);
	}

	@OriginalMember(owner = "client!pea", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return this.anInt6812;
	}

	@OriginalMember(owner = "client!pea", name = "ca", descriptor = "(IIII)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt6787 < arg3) {
			arg3 = this.anInt6787;
		}
		if (arg2 > this.anInt6758) {
			arg2 = this.anInt6758;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt6809 = arg2;
		this.anInt6830 = arg3;
		this.anInt6829 = arg1;
		this.anInt6837 = arg0;
		OpenGL.glEnable(3089);
		this.method5666();
		this.method5672();
	}

	@OriginalMember(owner = "client!pea", name = "n", descriptor = "(I)V")
	private void method5669() {
		if (this.aBoolean476 && this.aBoolean461 | this.anInt6817 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!pea", name = "u", descriptor = "()Z")
	@Override
	public boolean method7141() {
		return this.aClass6_Sub27_Sub1_1 != null && this.aClass6_Sub27_Sub1_1.method4966();
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(IB)V")
	public synchronized void method5670(@OriginalArg(0) int arg0) {
		@Pc(14) Class6_Sub9 local14 = new Class6_Sub9(arg0);
		this.aClass275_140.method6370(local14);
	}

	@OriginalMember(owner = "client!pea", name = "A", descriptor = "()V")
	@Override
	public void method7147() {
		if (!this.aBoolean471 || this.anInt6758 <= 0 || this.anInt6787 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt6837;
		@Pc(22) int local22 = this.anInt6809;
		@Pc(25) int local25 = this.anInt6829;
		@Pc(28) int local28 = this.anInt6830;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5726();
		this.method5729(false);
		this.method5680(false);
		this.method5645(false);
		this.method5665(false);
		this.method5713(null);
		this.method5690(-2);
		this.method5684(1);
		this.method5707(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt6758, this.anInt6787, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I[Lclient!hj;)V")
	@Override
	public void method7158(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub7[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass6_Sub7Array5[local3] = arg1[local3];
		}
		this.anInt6823 = arg0;
		if (this.anInt6814 != 1) {
			this.method5664();
		}
	}

	@OriginalMember(owner = "client!pea", name = "LA", descriptor = "(IIII)V")
	@Override
	public void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean461) {
			throw new RuntimeException("");
		}
		this.anInt6832 = arg0;
		this.anInt6842 = arg2;
		this.anInt6828 = arg3;
		this.anInt6839 = arg1;
		this.aClass306_1.aClass52_Sub9_1.method7610();
		this.method5721();
	}

	@OriginalMember(owner = "client!pea", name = "g", descriptor = "()Z")
	@Override
	public boolean method7097() {
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "o", descriptor = "(I)V")
	private void method5671() {
		@Pc(10) float[] local10 = this.aFloatArray43;
		@Pc(22) float local22 = (float) (this.anInt6833 * -this.anInt6838) / (float) this.anInt6821;
		@Pc(37) float local37 = (float) (this.anInt6833 * (this.anInt6758 - this.anInt6838)) / (float) this.anInt6821;
		@Pc(48) float local48 = (float) (this.anInt6833 * this.anInt6841) / (float) this.anInt6831;
		@Pc(63) float local63 = (float) ((this.anInt6841 - this.anInt6787) * this.anInt6833) / (float) this.anInt6831;
		if (local37 == local22 || local48 == local63) {
			local10[4] = 0.0F;
			local10[1] = 0.0F;
			local10[12] = 0.0F;
			local10[3] = 0.0F;
			local10[14] = 0.0F;
			local10[8] = 0.0F;
			local10[10] = 1.0F;
			local10[5] = 1.0F;
			local10[7] = 0.0F;
			local10[6] = 0.0F;
			local10[11] = 0.0F;
			local10[0] = 1.0F;
			local10[2] = 0.0F;
			local10[15] = 1.0F;
			local10[13] = 0.0F;
			local10[9] = 0.0F;
		} else {
			@Pc(77) float local77 = (float) this.anInt6833 * 2.0F;
			local10[9] = (local63 + local48) / (-local63 + local48);
			local10[7] = 0.0F;
			local10[8] = (local22 + local37) / (local37 - local22);
			local10[6] = 0.0F;
			local10[15] = 0.0F;
			local10[13] = 0.0F;
			local10[12] = 0.0F;
			local10[14] = this.aFloat145 = -((float) this.anInt6812 * local77) / (float) (this.anInt6812 - this.anInt6833);
			local10[4] = 0.0F;
			local10[10] = this.aFloat155 = (float) -(this.anInt6833 + this.anInt6812) / (float) (this.anInt6812 - this.anInt6833);
			local10[11] = -1.0F;
			local10[5] = local77 / (local48 - local63);
			local10[3] = 0.0F;
			local10[2] = 0.0F;
			local10[1] = 0.0F;
			local10[0] = local77 / (local37 - local22);
		}
		this.method5649();
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "(B)V")
	private void method5672() {
		if (this.anInt6837 <= this.anInt6809 && this.anInt6830 >= this.anInt6829) {
			OpenGL.glScissor(this.anInt6834 + this.anInt6837, -this.anInt6830 + this.anInt6787 + this.anInt6840, this.anInt6809 - this.anInt6837, this.anInt6830 - this.anInt6829);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!pea", name = "z", descriptor = "()Lclient!q;")
	@Override
	public Class34 method7146() {
		return new Class34_Sub2();
	}

	@OriginalMember(owner = "client!pea", name = "m", descriptor = "(IIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6841 = arg1;
		this.anInt6821 = arg2;
		this.anInt6831 = arg3;
		this.anInt6838 = arg0;
		this.method5671();
		this.method5666();
		if (this.anInt6814 == 3) {
			this.method5678();
		} else if (this.anInt6814 == 2) {
			this.method5709();
			return;
		}
	}

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "(II)I")
	public int method5673(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7115() {
		this.method5728();
		this.method5707(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pea", name = "j", descriptor = "()Z")
	@Override
	public boolean method7122() {
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!ba;Lclient!ob;Lclient!q;Lclient!qn;I)V")
	@Override
	public void method7118(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class102_Sub5 arg3, @OriginalArg(4) int arg4) {
		arg0.method4689(arg2, arg3, arg4);
		this.method7087(arg1);
	}

	@OriginalMember(owner = "client!pea", name = "D", descriptor = "()Z")
	@Override
	public boolean method7159() {
		return this.aClass306_1.method6808();
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "()V")
	@Override
	public void method7084() {
		this.method5665(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!pea", name = "s", descriptor = "()F")
	public float method5674() {
		return this.aFloat151;
	}

	@OriginalMember(owner = "client!pea", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt6808;
		if (local11 || arg1 != this.aFloat148 || this.aFloat158 != arg2) {
			this.aFloat158 = arg2;
			this.aFloat148 = arg1;
			this.anInt6808 = arg0;
			if (local11) {
				this.aFloat159 = (float) (this.anInt6808 & 0xFF0000) / 1.671168E7F;
				this.aFloat163 = (float) (this.anInt6808 & 0xFF) / 255.0F;
				this.aFloat143 = (float) (this.anInt6808 & 0xFF00) / 65280.0F;
				this.method5708();
			}
			this.method5695();
		}
		if (arg3 == this.aFloatArray44[0] && arg4 == this.aFloatArray44[1] && arg5 == this.aFloatArray44[2]) {
			return;
		}
		this.aFloatArray44[1] = arg4;
		this.aFloatArray44[2] = arg5;
		this.aFloatArray44[0] = arg3;
		this.aFloatArray45[1] = -arg4;
		this.aFloatArray45[2] = -arg5;
		this.aFloatArray45[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray41[1] = local138 * arg4;
		this.aFloatArray41[0] = local138 * arg3;
		this.aFloatArray41[2] = local138 * arg5;
		this.aFloatArray42[1] = -this.aFloatArray41[1];
		this.aFloatArray42[0] = -this.aFloatArray41[0];
		this.aFloatArray42[2] = -this.aFloatArray41[2];
		this.method5704();
		this.anInt6826 = (int) (arg3 * 256.0F / arg4);
		this.anInt6810 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(FIFFF)V")
	public void method5675(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static184.aFloatArray12[2] = arg1;
		Static184.aFloatArray12[1] = arg0;
		Static184.aFloatArray12[3] = arg2;
		Static184.aFloatArray12[0] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static184.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(II)I")
	@Override
	public int method7150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!pea", name = "w", descriptor = "()Z")
	@Override
	public boolean method7142() {
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "C", descriptor = "()V")
	@Override
	public void method7155() {
	}

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "(I)V")
	@Override
	public void method7105(@OriginalArg(0) int arg0) {
		this.method5691();
	}

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "(Z)I")
	private int method5676() {
		this.aString83 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString84 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString83.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString83.indexOf("brian paul") != -1 || this.aString83.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static128.method1936(local46.replace('.', ' '), ' ');
		if (local54.length >= 2) {
			try {
				@Pc(66) int local66 = Static467.method6543(local54[0]);
				@Pc(72) int local72 = Static467.method6543(local54[1]);
				this.anInt6820 = local72 + local66 * 10;
			} catch (@Pc(81) NumberFormatException local81) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt6820 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(120) int[] local120 = new int[1];
		OpenGL.glGetIntegerv(34018, local120, 0);
		this.anInt6813 = local120[0];
		OpenGL.glGetIntegerv(34929, local120, 0);
		this.anInt6835 = local120[0];
		OpenGL.glGetIntegerv(34930, local120, 0);
		this.anInt6836 = local120[0];
		if (this.anInt6813 < 2 || this.anInt6835 < 2 || this.anInt6836 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean458 = Stream.a();
		this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean466 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean475 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean462 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean477 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean481 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean472 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean464 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean456 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean470 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean457 = false;
		this.aBoolean468 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean474 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean482 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean473 = this.aBoolean482 & this.aBoolean474;
		OpenGL.glGetFloatv(2834, Static184.aFloatArray12, 0);
		this.aFloat156 = Static184.aFloatArray12[0];
		this.aFloat160 = Static184.aFloatArray12[1];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "()V")
	@Override
	public void method7114() {
		if (this.aClass6_Sub27_Sub1_1 != null && this.aClass6_Sub27_Sub1_1.method4966()) {
			this.aClass308_1.method6825(this.aClass6_Sub27_Sub1_1);
			this.aClass183_1.method4035();
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7137(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static200.aFloat83 = arg2;
		Static337.aFloat136 = arg0;
		Static576.aFloat205 = arg1;
	}

	@OriginalMember(owner = "client!pea", name = "m", descriptor = "()V")
	@Override
	protected void method7125() {
		for (@Pc(6) Class6 local6 = this.aClass275_136.method6366(); local6 != null; local6 = this.aClass275_136.method6364()) {
			((Class6_Sub24_Sub1) local6).method3326();
		}
		if (this.aClass308_1 != null) {
			this.aClass308_1.method6827();
		}
		if (this.anOpenGL2 != null) {
			this.method5644();
			@Pc(40) Enumeration local40 = this.aHashtable6.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable6.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean455) {
			Static441.method6330(false, true);
			this.aBoolean455 = false;
		}
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "()I")
	@Override
	public int method7085() {
		return 4;
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "()V")
	@Override
	public void method7090() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!pea", name = "p", descriptor = "(I)V")
	private void method5677() {
		if (this.anInt6814 != 2) {
			this.anInt6814 = 2;
			this.method5709();
			this.method5711();
			this.anInt6827 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pea", name = "g", descriptor = "(Z)V")
	private void method5678() {
		@Pc(15) float local15 = this.aFloat161 * (float) -this.anInt6838 / (float) this.anInt6821;
		@Pc(27) float local27 = (float) -this.anInt6841 * this.aFloat161 / (float) this.anInt6831;
		@Pc(42) float local42 = (float) (this.anInt6758 - this.anInt6838) * this.aFloat161 / (float) this.anInt6821;
		@Pc(63) float local63 = this.aFloat161 * (float) (this.anInt6787 - this.anInt6841) / (float) this.anInt6831;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local63 != local27) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local63, (double) -local27, (double) ((float) this.anInt6833 - this.aFloat151), (double) ((float) this.anInt6812 - this.aFloat151));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "(II)V")
	public void method5679(@OriginalArg(0) int arg0) {
		Static184.aFloatArray12[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static184.aFloatArray12[3] = (float) (arg0 >>> 24) / 255.0F;
		Static184.aFloatArray12[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static184.aFloatArray12[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static184.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!pea", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt6833;
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(BZ)V")
	public void method5680(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean459) {
			this.aBoolean459 = arg0;
			this.method5700();
			this.anInt6827 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZZI)V")
	public void method5681(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt6824 != arg2) {
			if (arg2 < 0) {
				this.method5702();
				this.method5713(null);
				this.method5684(0);
				if (!this.aBoolean461) {
					this.aClass306_1.method6804(arg1, 0, 0, 0, arg0);
				}
			} else {
				@Pc(32) Class35_Sub3 local32 = this.aClass183_1.method4036(arg2);
				@Pc(38) Class76 local38 = super.anInterface7_14.method5209(arg2);
				if (local38.aByte19 == 0 && local38.aByte20 == 0) {
					this.method5702();
				} else {
					@Pc(54) int local54 = local38.aBoolean105 ? 64 : 128;
					@Pc(58) int local58 = local54 * 50;
					this.method5714((float) (this.anInt6800 % local58 * local38.aByte19) / (float) local58, 0.0F, (float) (this.anInt6800 % local58 * local38.aByte20) / (float) local58);
				}
				if (this.aBoolean461) {
					this.method5713(local32);
					this.method5684(local38.anInt1602);
				} else {
					this.aClass306_1.method6804(arg1, local38.aByte22, local38.anInt1601, local38.aByte24, arg0);
					if (!this.aClass306_1.method6805(local38.anInt1602, local32)) {
						this.method5713(local32);
						this.method5684(local38.anInt1602);
					}
				}
			}
			this.anInt6824 = arg2;
		}
		this.anInt6827 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!rk;I)V")
	public void method5682(@OriginalArg(0) Interface17 arg0) {
		if (this.aBoolean474) {
			this.method5652(arg0);
			this.method5689(arg0);
		} else if (this.anInt6801 >= 0 && arg0 == this.anInterface17Array1[this.anInt6801]) {
			this.anInterface17Array1[this.anInt6801--] = null;
			arg0.method7046();
			if (this.anInt6801 < 0) {
				this.anInterface17_1 = this.anInterface17_2 = null;
			} else {
				this.anInterface17_1 = this.anInterface17_2 = this.anInterface17Array1[this.anInt6801];
				this.anInterface17_1.method7045();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(III)V")
	public void method5683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6840 = arg1;
		this.anInt6834 = arg0;
		this.method5710();
		this.method5672();
	}

	@OriginalMember(owner = "client!pea", name = "ya", descriptor = "(IIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5728();
		this.method5707(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pea", name = "g", descriptor = "(II)V")
	public void method5684(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method5659(7681, 7681);
		} else if (arg0 == 0) {
			this.method5659(8448, 8448);
		} else if (arg0 == 2) {
			this.method5659(7681, 34165);
		} else if (arg0 == 3) {
			this.method5659(8448, 260);
			return;
		} else if (arg0 == 4) {
			this.method5659(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIZ)V")
	public void method5685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
	}

	@OriginalMember(owner = "client!pea", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.method5707(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!me;Z)Lclient!xa;")
	@Override
	public Class4 method7157(@OriginalArg(0) Class196 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt5516 * arg0.anInt5517];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray67 == null) {
			for (local21 = 0; local21 < arg0.anInt5517; local21++) {
				for (local25 = 0; local25 < arg0.anInt5516; local25++) {
					@Pc(79) int local79 = arg0.anIntArray509[arg0.aByteArray68[local14++] & 0xFF];
					local12[local16++] = local79 == 0 ? 0 : local79 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt5517; local21++) {
				for (local25 = 0; local25 < arg0.anInt5516; local25++) {
					local12[local16++] = arg0.aByteArray67[local14] << 24 | arg0.anIntArray509[arg0.aByteArray68[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(115) Class4 local115 = this.method7110(local12, arg0.anInt5516, arg0.anInt5516, arg0.anInt5517);
		local115.EA(arg0.anInt5514, arg0.anInt5515, arg0.anInt5518, arg0.anInt5513);
		return local115;
	}

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "(II)I")
	public int method5686(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!pea", name = "q", descriptor = "()Z")
	@Override
	public boolean method7131() {
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7112(@OriginalArg(0) Class34 arg0) {
		this.aClass34_Sub2_4 = (Class34_Sub2) arg0;
		this.aClass34_Sub2_3.method2287(this.aClass34_Sub2_4);
		if (this.anInt6814 != 1) {
			this.method5711();
		}
	}

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "(Z)V")
	public void method5687() {
		if (this.anInt6827 == 16) {
			return;
		}
		this.method5716();
		this.method5729(true);
		this.method5645(true);
		this.method5665(true);
		this.method5707(1);
		this.anInt6827 = 16;
	}

	@OriginalMember(owner = "client!pea", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class16_Sub3 local6 = (Class16_Sub3) arg1;
		@Pc(9) Class35_Sub3_Sub1 local9 = local6.aClass35_Sub3_Sub1_3;
		this.method5724();
		this.method5713(local6.aClass35_Sub3_Sub1_3);
		this.method5707(1);
		this.method5659(8448, 7681);
		this.method5685(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat128 / (float) local9.anInt5653;
		@Pc(46) float local46 = local9.aFloat129 / (float) local9.anInt5654;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt6837 - arg2) * local39, (float) (this.anInt6829 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6837, this.anInt6829);
		OpenGL.glTexCoord2f((float) (this.anInt6837 - arg2) * local39, (float) (this.anInt6830 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6837, this.anInt6830);
		OpenGL.glTexCoord2f((float) (this.anInt6809 - arg2) * local39, (float) (this.anInt6830 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6809, this.anInt6830);
		OpenGL.glTexCoord2f((float) (this.anInt6809 - arg2) * local39, local46 * (float) (this.anInt6829 - arg3));
		OpenGL.glVertex2i(this.anInt6809, this.anInt6829);
		OpenGL.glEnd();
		this.method5685(768, 5890, 0);
	}

	@OriginalMember(owner = "client!pea", name = "q", descriptor = "(I)Lclient!cn;")
	public Class35_Sub2 method5688() {
		return this.aClass17_Sub2_1 == null ? null : this.aClass17_Sub2_1.method2856();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V")
	@Override
	public void method7086(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt6797 = arg0;
		this.aClass183_1.method4035();
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(Lclient!rk;B)V")
	public void method5689(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt6803 < 0 || arg0 != this.anInterface17Array3[this.anInt6803]) {
			throw new RuntimeException();
		}
		this.anInterface17Array3[this.anInt6803--] = null;
		arg0.method7049();
		if (this.anInt6803 >= 0) {
			this.anInterface17_2 = this.anInterface17Array3[this.anInt6803];
			this.anInterface17_2.method7048();
		} else {
			this.anInterface17_2 = null;
		}
	}

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "()Lclient!q;")
	@Override
	public Class34 method7096() {
		return this.aClass34_Sub2_1;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass308_1.method6820(arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIF)Lclient!hj;")
	@Override
	public Class6_Sub7 method7082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub7_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "(II)V")
	public void method5690(@OriginalArg(0) int arg0) {
		this.method5692(true, arg0);
	}

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "(B)V")
	private void method5691() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL2.a()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static149.method2211(1000L);
		}
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7120(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas12) {
			throw new RuntimeException();
		} else if (!this.aHashtable6.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) long local53 = this.anOpenGL2.prepareSurface(arg0);
			if (local53 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "([Lclient!ba;Lclient!ob;Lclient!q;[Lclient!qn;I)V")
	@Override
	public void method7151(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class102_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method7136(arg0, arg2, arg3, arg4);
		this.method7087(arg1);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!rf;IIII)Lclient!ba;")
	@Override
	public Class22 method7088(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class22_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZII)V")
	public void method5692(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.method5681(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "(B)V")
	public void method5693() {
		if (this.anInt6827 == 8) {
			return;
		}
		this.method5677();
		this.method5729(true);
		this.method5645(true);
		this.method5665(true);
		this.method5707(1);
		this.anInt6827 = 8;
	}

	@OriginalMember(owner = "client!pea", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6837 < arg0) {
			this.anInt6837 = arg0;
		}
		if (arg2 < this.anInt6809) {
			this.anInt6809 = arg2;
		}
		if (arg3 < this.anInt6830) {
			this.anInt6830 = arg3;
		}
		if (this.anInt6829 < arg1) {
			this.anInt6829 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method5666();
		this.method5672();
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(Z)V")
	@Override
	public void method7102(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method7127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method5728();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method5707(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean475) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean475) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!pea", name = "sa", descriptor = "(II)V")
	@Override
	public void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt6833 && this.anInt6812 == arg1) {
			return;
		}
		this.anInt6833 = arg0;
		this.anInt6812 = arg1;
		this.method5671();
		this.method5721();
		if (this.anInt6814 == 3) {
			this.method5678();
		} else if (this.anInt6814 == 2) {
			this.method5709();
			return;
		}
	}

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "(Z)V")
	private void method5695() {
		Static184.aFloatArray12[1] = this.aFloat143 * this.aFloat148;
		Static184.aFloatArray12[2] = this.aFloat148 * this.aFloat163;
		Static184.aFloatArray12[3] = 1.0F;
		Static184.aFloatArray12[0] = this.aFloat148 * this.aFloat159;
		OpenGL.glLightfv(16384, 4609, Static184.aFloatArray12, 0);
		Static184.aFloatArray12[0] = -this.aFloat158 * this.aFloat159;
		Static184.aFloatArray12[1] = -this.aFloat158 * this.aFloat143;
		Static184.aFloatArray12[3] = 1.0F;
		Static184.aFloatArray12[2] = this.aFloat163 * -this.aFloat158;
		OpenGL.glLightfv(16385, 4609, Static184.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLclient!rm;)V")
	public void method5696(@OriginalArg(1) Interface19 arg0) {
		if (arg0 != this.anInterface19_4) {
			if (this.aBoolean466) {
				OpenGL.glBindBufferARB(34963, arg0.method6485());
			}
			this.anInterface19_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "(I)Lclient!i;")
	@Override
	public Class6_Sub24 method7107(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub24_Sub1 local8 = new Class6_Sub24_Sub1(arg0);
		this.aClass275_136.method6370(local8);
		return local8;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(JI)V")
	public synchronized void method5697(@OriginalArg(0) long arg0) {
		@Pc(15) Class6 local15 = new Class6();
		local15.aLong249 = arg0;
		this.aClass275_143.method6370(local15);
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7156(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas12) {
			local5 = this.aLong176;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable6.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas11) {
			this.method5660();
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!rk;Z)V")
	public void method5699(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt6803 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6803 >= 0) {
			this.anInterface17Array3[this.anInt6803].method7049();
		}
		this.anInterface17_2 = this.anInterface17Array3[++this.anInt6803] = arg0;
		this.anInterface17_2.method7048();
	}

	@OriginalMember(owner = "client!pea", name = "s", descriptor = "(I)V")
	private void method5700() {
		if (this.aBoolean459 && !this.aBoolean479) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "(Lclient!rk;B)V")
	public void method5701(@OriginalArg(0) Interface17 arg0) {
		if (this.aBoolean474) {
			this.method5720(arg0);
			this.method5699(arg0);
		} else if (this.anInt6801 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt6801 >= 0) {
				this.anInterface17Array1[this.anInt6801].method7046();
			}
			this.anInterface17_1 = this.anInterface17_2 = this.anInterface17Array1[++this.anInt6801] = arg0;
			this.anInterface17_1.method7045();
		}
	}

	@OriginalMember(owner = "client!pea", name = "t", descriptor = "(I)V")
	private void method5702() {
		if (this.aBoolean480) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean480 = false;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZI)V")
	public synchronized void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class6_Sub9 local14 = new Class6_Sub9(arg0);
		local14.aLong249 = arg1;
		this.aClass275_138.method6370(local14);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!ob;)V")
	@Override
	public void method7087(@OriginalArg(0) Class222 arg0) {
		this.aClass74_1.method1495(arg0, this);
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "(IIIIII)Lclient!aq;")
	@Override
	public Class17 method7113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean456 ? new Class17_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!pea", name = "u", descriptor = "(I)V")
	public void method5704() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray41, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray42, 0);
	}

	@OriginalMember(owner = "client!pea", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(53) float local53;
		if (this.aClass35_Sub3_Sub1_4 == null || arg2 > this.aClass35_Sub3_Sub1_4.anInt5645 || this.aClass35_Sub3_Sub1_4.anInt5638 < arg3) {
			this.aClass35_Sub3_Sub1_4 = Static503.method849(arg2, arg3, this, arg6);
			this.aClass35_Sub3_Sub1_4.method4857(false, false);
			local41 = this.aClass35_Sub3_Sub1_4.aFloat129;
			local53 = this.aClass35_Sub3_Sub1_4.aFloat128;
		} else {
			this.aClass35_Sub3_Sub1_4.method4853(arg3, arg2, arg6, 6406, false);
			local41 = (float) arg3 * this.aClass35_Sub3_Sub1_4.aFloat129 / (float) this.aClass35_Sub3_Sub1_4.anInt5638;
			local53 = this.aClass35_Sub3_Sub1_4.aFloat128 * (float) arg2 / (float) this.aClass35_Sub3_Sub1_4.anInt5645;
		}
		this.method5724();
		this.method5713(this.aClass35_Sub3_Sub1_4);
		this.method5707(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5679(arg5);
		this.method5659(34165, 34165);
		this.method5685(768, 34166, 0);
		this.method5685(770, 5890, 2);
		this.method5717(0, 34166);
		this.method5717(2, 5890);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = (float) arg2 + local143;
		@Pc(156) float local156 = local146 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local53);
		OpenGL.glVertex2f(local143, local156);
		OpenGL.glTexCoord2f(local41, local53);
		OpenGL.glVertex2f(local151, local156);
		OpenGL.glTexCoord2f(local41, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method5685(768, 5890, 0);
		this.method5685(770, 34166, 2);
		this.method5717(0, 5890);
		this.method5717(2, 34166);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class16 method7083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static483.method6706(arg2, this, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;IZZI)Lclient!av;")
	public Interface2 method5705(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		return (Interface2) (this.aBoolean466 ? new Class15_Sub2(this, arg2, arg0, arg1, false) : new Class113_Sub2(this, arg2, arg0));
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7101(@OriginalArg(0) Canvas arg0) {
		this.aCanvas11 = null;
		this.aLong177 = 0L;
		if (arg0 == null || this.aCanvas12 == arg0) {
			this.aLong177 = this.aLong176;
			this.aCanvas11 = this.aCanvas12;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable6.get(arg0);
			this.aLong177 = local36;
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.aLong177 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong177);
		this.method5660();
	}

	@OriginalMember(owner = "client!pea", name = "g", descriptor = "(B)V")
	public void method5706() {
		if (this.anInt6827 == 4) {
			return;
		}
		this.method5647();
		this.method5729(false);
		this.method5680(false);
		this.method5645(false);
		this.method5665(false);
		this.method5690(-2);
		this.method5707(1);
		this.anInt6827 = 4;
	}

	@OriginalMember(owner = "client!pea", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass34_Sub2_4.aFloat34 * (float) arg0 + this.aClass34_Sub2_4.aFloat27 * (float) arg1 + (float) arg2 * this.aClass34_Sub2_4.aFloat32 + this.aClass34_Sub2_4.aFloat36;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass34_Sub2_4.aFloat36 + this.aClass34_Sub2_4.aFloat32 * (float) arg5 + this.aClass34_Sub2_4.aFloat34 * (float) arg3 + this.aClass34_Sub2_4.aFloat27 * (float) arg4;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt6833 && local59 < (float) this.anInt6833 || !(!(local28 > (float) this.anInt6812) || !(local59 > (float) this.anInt6812))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass34_Sub2_4.aFloat33 + this.aClass34_Sub2_4.aFloat29 * (float) arg2 + (float) arg0 * this.aClass34_Sub2_4.aFloat37 + this.aClass34_Sub2_4.aFloat35 * (float) arg1) * (float) this.anInt6821 / local28);
		@Pc(155) int local155 = (int) (((float) arg3 * this.aClass34_Sub2_4.aFloat37 + this.aClass34_Sub2_4.aFloat35 * (float) arg4 + (float) arg5 * this.aClass34_Sub2_4.aFloat29 + this.aClass34_Sub2_4.aFloat33) * (float) this.anInt6821 / local59);
		if (this.aFloat165 > (float) local123 && (float) local155 < this.aFloat165 || this.aFloat164 < (float) local123 && (float) local155 > this.aFloat164) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt6831 * ((float) arg2 * this.aClass34_Sub2_4.aFloat31 + (float) arg1 * this.aClass34_Sub2_4.aFloat30 + (float) arg0 * this.aClass34_Sub2_4.aFloat38 + this.aClass34_Sub2_4.aFloat28) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt6831 * (this.aClass34_Sub2_4.aFloat31 * (float) arg5 + (float) arg3 * this.aClass34_Sub2_4.aFloat38 + (float) arg4 * this.aClass34_Sub2_4.aFloat30 + this.aClass34_Sub2_4.aFloat28) / local59);
			return (!((float) local213 < this.aFloat149) || !(this.aFloat149 > (float) local245)) && (!((float) local213 > this.aFloat154) || !(this.aFloat154 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7133(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7128();
	}

	@OriginalMember(owner = "client!pea", name = "F", descriptor = "()V")
	@Override
	public void F() {
		this.anInt6829 = 0;
		this.anInt6837 = 0;
		this.anInt6830 = this.anInt6787;
		this.anInt6809 = this.anInt6758;
		OpenGL.glDisable(3089);
		this.method5666();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7094(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!pea", name = "aa", descriptor = "()I")
	@Override
	public int aa() {
		@Pc(6) int local6 = this.anInt6843;
		this.anInt6843 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(IZ)V")
	public void method5707(@OriginalArg(0) int arg0) {
		if (this.anInt6807 == arg0) {
			return;
		}
		@Pc(20) boolean local20;
		@Pc(24) byte local24;
		if (arg0 == 1) {
			local20 = true;
			local24 = 1;
		} else if (arg0 == 2) {
			local24 = 2;
			local20 = false;
		} else if (arg0 == 128) {
			local20 = true;
			local24 = 3;
		} else {
			local24 = 0;
			local20 = false;
		}
		if (!this.aBoolean460) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean460 = true;
		}
		if (this.aBoolean469 != local20) {
			if (local20) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean469 = local20;
		}
		if (this.anInt6816 != local24) {
			if (local24 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local24 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local24 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt6816 = local24;
		}
		this.anInt6827 &= 0xFFFFFFE3;
		this.anInt6807 = arg0;
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method7100(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class6_Sub9 local19;
		while (!this.aClass275_138.method6371()) {
			local19 = (Class6_Sub9) this.aClass275_138.method6360();
			Static245.anIntArray432[local11++] = (int) local19.aLong249;
			this.anInt6804 -= local19.anInt1006;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static245.anIntArray432, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static245.anIntArray432, 0);
			local11 = 0;
		}
		while (!this.aClass275_139.method6371()) {
			local19 = (Class6_Sub9) this.aClass275_139.method6360();
			Static245.anIntArray432[local11++] = (int) local19.aLong249;
			this.anInt6805 -= local19.anInt1006;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static245.anIntArray432, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static245.anIntArray432, 0);
			local11 = 0;
		}
		while (!this.aClass275_140.method6371()) {
			local19 = (Class6_Sub9) this.aClass275_140.method6360();
			Static245.anIntArray432[local11++] = local19.anInt1006;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static245.anIntArray432, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static245.anIntArray432, 0);
			local11 = 0;
		}
		while (!this.aClass275_141.method6371()) {
			local19 = (Class6_Sub9) this.aClass275_141.method6360();
			Static245.anIntArray432[local11++] = (int) local19.aLong249;
			this.anInt6806 -= local19.anInt1006;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static245.anIntArray432, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static245.anIntArray432, 0);
		}
		while (!this.aClass275_137.method6371()) {
			local19 = (Class6_Sub9) this.aClass275_137.method6360();
			OpenGL.glDeleteLists((int) local19.aLong249, local19.anInt1006);
		}
		@Pc(218) Class6 local218;
		while (!this.aClass275_142.method6371()) {
			local218 = this.aClass275_142.method6360();
			OpenGL.glDeleteProgramARB((int) local218.aLong249);
		}
		while (!this.aClass275_143.method6371()) {
			local218 = this.aClass275_143.method6360();
			OpenGL.glDeleteObjectARB(local218.aLong249);
		}
		while (!this.aClass275_137.method6371()) {
			local19 = (Class6_Sub9) this.aClass275_137.method6360();
			OpenGL.glDeleteLists((int) local19.aLong249, local19.anInt1006);
		}
		this.aClass183_1.method4038();
		if (this.v() > 100663296 && Static137.method2058() > this.aLong178 + 60000L) {
			System.gc();
			this.aLong178 = Static137.method2058();
		}
		this.anInt6800 = local9;
	}

	@OriginalMember(owner = "client!pea", name = "B", descriptor = "()Z")
	@Override
	public boolean method7148() {
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "(B)V")
	private void method5708() {
		Static184.aFloatArray12[0] = this.aFloat150 * this.aFloat159;
		Static184.aFloatArray12[2] = this.aFloat163 * this.aFloat150;
		Static184.aFloatArray12[3] = 1.0F;
		Static184.aFloatArray12[1] = this.aFloat150 * this.aFloat143;
		OpenGL.glLightModelfv(2899, Static184.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!pea", name = "i", descriptor = "(B)V")
	private void method5709() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray43, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pea", name = "v", descriptor = "()I")
	@Override
	public int v() {
		return this.anInt6806 + this.anInt6804 + this.anInt6805;
	}

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "(Z)V")
	@Override
	public void method7129(@OriginalArg(0) boolean arg0) {
		this.aBoolean483 = arg0;
		this.method5650();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method7098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class16 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class16_Sub3 local6 = (Class16_Sub3) arg5;
		@Pc(9) Class35_Sub3_Sub1 local9 = local6.aClass35_Sub3_Sub1_3;
		this.method5724();
		this.method5713(local6.aClass35_Sub3_Sub1_3);
		this.method5707(1);
		this.method5659(8448, 7681);
		this.method5685(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat128 / (float) local9.anInt5653;
		@Pc(46) float local46 = local9.aFloat129 / (float) local9.anInt5654;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(60) float local60 = (float) -arg1 + (float) arg3;
		@Pc(73) float local73 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local60 * local60)));
		@Pc(77) float local77 = local53 * local73;
		@Pc(81) float local81 = local60 * local73;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local77 + 0.35F, local81 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method5685(768, 5890, 0);
	}

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "(IIIII)V")
	@Override
	protected void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt6837 > arg2 + arg0 || this.anInt6809 < arg0 - arg2 || this.anInt6829 > arg2 + arg1 || this.anInt6830 < arg1 - arg2) {
			return;
		}
		this.method5728();
		this.method5707(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(63) float local63 = (float) arg0 + 0.35F;
		@Pc(68) float local68 = (float) arg1 + 0.35F;
		@Pc(72) int local72 = arg2 << 1;
		if (this.aFloat156 > (float) local72) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local63 + 1.0F, local68 + 1.0F);
			OpenGL.glVertex2f(local63 + 1.0F, local68 - 1.0F);
			OpenGL.glVertex2f(local63 - 1.0F, local68 - 1.0F);
			OpenGL.glVertex2f(local63 - 1.0F, local68 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local72 <= this.aFloat160) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local72);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local63, local68);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local63, local68);
			@Pc(141) int local141 = 262144 / (arg2 * 6);
			if (local141 <= 64) {
				local141 = 64;
			} else if (local141 > 512) {
				local141 = 512;
			}
			local141 = Static21.method292(local141);
			OpenGL.glVertex2f((float) arg2 + local63, local68);
			for (@Pc(168) int local168 = 16384 - local141; local168 > 0; local168 -= local141) {
				OpenGL.glVertex2f(local63 + (float) arg2 * Class184_Sub2.aFloatArray46[local168], Class184_Sub2.aFloatArray47[local168] * (float) arg2 + local68);
			}
			OpenGL.glVertex2f(local63 + (float) arg2, local68);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!pea", name = "X", descriptor = "(III)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6818 == arg0 && arg1 == this.anInt6817 && this.anInt6811 == arg2) {
			return;
		}
		this.anInt6811 = arg2;
		this.anInt6817 = arg1;
		this.anInt6818 = arg0;
		if (!this.aBoolean461) {
			this.method5721();
			this.method5669();
		}
	}

	@OriginalMember(owner = "client!pea", name = "j", descriptor = "(B)V")
	private void method5710() {
		OpenGL.glViewport(this.anInt6834, this.anInt6840, this.anInt6758, this.anInt6787);
	}

	@OriginalMember(owner = "client!pea", name = "j", descriptor = "(Z)V")
	private void method5711() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass34_Sub2_4.method2285(), 0);
		if (this.aBoolean461) {
			this.aClass306_1.aClass52_Sub9_1.method7610();
		}
		this.method5704();
		this.method5664();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!qn;I)V")
	@Override
	public void method7136(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class102_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method4689(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!gb;B)V")
	public void method5712(@OriginalArg(0) Class34_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method2285(), 0);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLclient!wq;)V")
	public void method5713(@OriginalArg(1) Class35 arg0) {
		@Pc(11) Class35 local11 = this.aClass35Array1[this.anInt6815];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt6267);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt6267);
				} else if (arg0.anInt6267 != local11.anInt6267) {
					OpenGL.glDisable(local11.anInt6267);
					OpenGL.glEnable(arg0.anInt6267);
				}
				OpenGL.glBindTexture(arg0.anInt6267, arg0.method5324());
			}
			this.aClass35Array1[this.anInt6815] = arg0;
		}
		this.anInt6827 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!pea", name = "o", descriptor = "()V")
	@Override
	public void method7128() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BFFF)V")
	private void method5714(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean480) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean480 = true;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!il;[Lclient!me;Z)Lclient!ta;")
	@Override
	public Class56 method7123(@OriginalArg(0) Class146 arg0, @OriginalArg(1) Class196[] arg1) {
		return new Class56_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class4 method7110(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class4_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!pea", name = "k", descriptor = "()V")
	@Override
	public void k() {
		this.aBoolean461 = false;
		this.aClass306_1.method6804(false, 0, 0, 0, false);
		this.method5721();
		this.method5669();
	}

	@OriginalMember(owner = "client!pea", name = "j", descriptor = "(II)I")
	public int method5715(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!pea", name = "y", descriptor = "()Z")
	@Override
	public boolean method7145() {
		return this.aClass6_Sub27_Sub1_1 != null && (this.anInt6795 <= 1 || this.aBoolean473);
	}

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "(IIIII)V")
	@Override
	public void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5728();
		this.method5707(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pea", name = "v", descriptor = "(I)V")
	private void method5716() {
		if (this.anInt6814 != 3) {
			this.anInt6814 = 3;
			this.method5678();
			this.method5711();
			this.anInt6827 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "(IIII)V")
	public void method5717(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "(Z)V")
	@Override
	public void method7135(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pea", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt6787 - local12 - arg1, arg2, 1, 32993, this.anInt6819, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!pea", name = "n", descriptor = "()Z")
	@Override
	public boolean method7126() {
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "ha", descriptor = "(F)V")
	@Override
	public void ha(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat150) {
			this.aFloat150 = arg0;
			this.method5708();
		}
	}

	@OriginalMember(owner = "client!pea", name = "w", descriptor = "(I)V")
	private void method5718() {
		this.method5690(-2);
		for (@Pc(14) int local14 = this.anInt6813 - 1; local14 >= 0; local14--) {
			this.method5648(local14);
			this.method5713(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5659(8448, 8448);
		this.method5685(770, 34168, 2);
		this.method5702();
		this.anInt6807 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt6816 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean469 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean460 = true;
		this.method5729(true);
		this.method5680(true);
		this.method5645(true);
		this.method5665(true);
		this.method5726();
		this.anOpenGL2.setSwapInterval(0);
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
		@Pc(133) float[] local133 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(135) int local135 = 0; local135 < 8; local135++) {
			@Pc(141) int local141 = local135 + 16384;
			OpenGL.glLightfv(local141, 4608, local133, 0);
			OpenGL.glLightf(local141, 4615, 0.0F);
			OpenGL.glLightf(local141, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt6808 = this.anInt6818 = -1;
		this.F();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class60 method7121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class60_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!pea", name = "x", descriptor = "(I)V")
	private void method5719() {
		this.aClass34_Sub2_4 = new Class34_Sub2();
		this.aClass34_Sub2_3 = new Class34_Sub2();
		this.aClass35Array1 = new Class35[this.anInt6813];
		this.aClass35_Sub3_4 = new Class35_Sub3(this, 3553, 6408, 1, 1);
		new Class35_Sub3(this, 3553, 6408, 1, 1);
		new Class35_Sub3(this, 3553, 6408, 1, 1);
		this.aClass22_Sub2_5 = new Class22_Sub2(this);
		this.aClass22_Sub2_3 = new Class22_Sub2(this);
		this.aClass22_Sub2_6 = new Class22_Sub2(this);
		this.aClass22_Sub2_9 = new Class22_Sub2(this);
		this.aClass22_Sub2_10 = new Class22_Sub2(this);
		this.aClass22_Sub2_8 = new Class22_Sub2(this);
		this.aClass22_Sub2_1 = new Class22_Sub2(this);
		this.aClass22_Sub2_4 = new Class22_Sub2(this);
		this.aClass22_Sub2_7 = new Class22_Sub2(this);
		this.aClass22_Sub2_2 = new Class22_Sub2(this);
		if (this.aBoolean468) {
			this.aClass315_3 = new Class315(this);
			new Class315(this);
		}
	}

	@OriginalMember(owner = "client!pea", name = "r", descriptor = "()Z")
	@Override
	public boolean method7134() {
		return this.aBoolean475 && (!this.method7141() || this.aBoolean473);
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(Lclient!rk;I)V")
	public void method5720(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt6802 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6802 >= 0) {
			this.anInterface17Array2[this.anInt6802].method7044();
		}
		this.anInterface17_1 = this.anInterface17Array2[++this.anInt6802] = arg0;
		this.anInterface17_1.method7047();
	}

	@OriginalMember(owner = "client!pea", name = "k", descriptor = "(Z)V")
	private void method5721() {
		@Pc(53) int local53;
		if (this.aBoolean461) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local53 = this.anInt6839;
		} else {
			this.aFloat157 = (float) (this.anInt6812 - this.anInt6811) - this.aFloat153;
			this.aFloat162 = this.aFloat157 - this.aFloat152 * (float) this.anInt6817;
			if (this.aFloat162 < (float) this.anInt6833) {
				this.aFloat162 = this.anInt6833;
			}
			OpenGL.glFogf(2915, this.aFloat162);
			OpenGL.glFogf(2916, this.aFloat157);
			local53 = this.anInt6818;
		}
		Static184.aFloatArray12[1] = (float) (local53 & 0xFF00) / 65280.0F;
		Static184.aFloatArray12[0] = (float) (local53 & 0xFF0000) / 1.671168E7F;
		Static184.aFloatArray12[2] = (float) (local53 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static184.aFloatArray12, 0);
		if (this.aBoolean461) {
			this.aClass306_1.aClass52_Sub9_1.method7608();
		}
	}

	@OriginalMember(owner = "client!pea", name = "E", descriptor = "()F")
	public float method5722() {
		return this.aFloat146;
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "(III)V")
	public synchronized void method5723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class6_Sub9 local14 = new Class6_Sub9(arg0);
		local14.aLong249 = arg1;
		this.aClass275_139.method6370(local14);
	}

	@OriginalMember(owner = "client!pea", name = "y", descriptor = "(I)V")
	public void method5724() {
		if (this.anInt6827 == 2) {
			return;
		}
		this.method5647();
		this.method5729(false);
		this.method5680(false);
		this.method5645(false);
		this.method5665(false);
		this.method5690(-2);
		this.anInt6827 = 2;
	}

	@OriginalMember(owner = "client!pea", name = "t", descriptor = "()Z")
	@Override
	public boolean method7139() {
		if (this.aClass6_Sub27_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass6_Sub27_Sub1_1.method4966()) {
			if (!this.aClass308_1.method6823(this.aClass6_Sub27_Sub1_1)) {
				return false;
			}
			this.aClass183_1.method4035();
		}
		return true;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IFF)V")
	public void method5725(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat153 = arg0;
		this.aFloat152 = arg1;
		if (!this.aBoolean461) {
			this.method5721();
		}
	}

	@OriginalMember(owner = "client!pea", name = "k", descriptor = "(B)V")
	public void method5726() {
		if (this.anInt6814 != 0) {
			this.anInt6814 = 0;
			this.anInt6827 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)V")
	@Override
	public void method7089(@OriginalArg(0) int arg0) {
		this.method5644();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class4 method7091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class4_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lclient!cm;ILclient!cm;Lclient!cm;Lclient!cm;)V")
	public void method5727(@OriginalArg(0) Class53 arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) Class53 arg2, @OriginalArg(4) Class53 arg3) {
		if (arg2 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5653(arg2.anInterface2_1);
			OpenGL.glVertexPointer(arg2.aByte15, arg2.aShort13, this.anInterface2_6.method6955(), this.anInterface2_6.method6954() + (long) arg2.aByte14);
			OpenGL.glEnableClientState(32884);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5653(arg0.anInterface2_1);
			OpenGL.glNormalPointer(arg0.aShort13, this.anInterface2_6.method6955(), this.anInterface2_6.method6954() + (long) arg0.aByte14);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5653(arg3.anInterface2_1);
			OpenGL.glColorPointer(arg3.aByte15, arg3.aShort13, this.anInterface2_6.method6955(), this.anInterface2_6.method6954() + (long) arg3.aByte14);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5653(arg1.anInterface2_1);
			OpenGL.glTexCoordPointer(arg1.aByte15, arg1.aShort13, this.anInterface2_6.method6955(), this.anInterface2_6.method6954() + (long) arg1.aByte14);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!pea", name = "z", descriptor = "(I)V")
	private void method5728() {
		if (this.anInt6827 == 1) {
			return;
		}
		this.method5647();
		this.method5729(false);
		this.method5680(false);
		this.method5645(false);
		this.method5665(false);
		this.method5713(null);
		this.method5690(-2);
		this.method5684(1);
		this.anInt6827 = 1;
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7132(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas12 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable6.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZI)V")
	public void method5729(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean476 != arg0) {
			this.aBoolean476 = arg0;
			this.method5669();
			this.anInt6827 &= 0xFFFFFFE0;
		}
	}
}
