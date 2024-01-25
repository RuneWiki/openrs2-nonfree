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

@OriginalClass("client!qg")
public final class Class121_Sub2 extends Class121 {

	@OriginalMember(owner = "client!qg", name = "sb", descriptor = "I")
	private int anInt5800;

	@OriginalMember(owner = "client!qg", name = "uc", descriptor = "I")
	private int anInt5851;

	@OriginalMember(owner = "client!qg", name = "td", descriptor = "I")
	public int anInt5900;

	@OriginalMember(owner = "client!qg", name = "Fd", descriptor = "I")
	public int anInt5911;

	@OriginalMember(owner = "client!qg", name = "le", descriptor = "I")
	public int anInt5935;

	@OriginalMember(owner = "client!qg", name = "ne", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!qg", name = "se", descriptor = "Lclient!ef;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!qg", name = "ue", descriptor = "Lclient!ef;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!qg", name = "Be", descriptor = "I")
	public int anInt5941;

	@OriginalMember(owner = "client!qg", name = "Ce", descriptor = "I")
	public int anInt5942;

	@OriginalMember(owner = "client!qg", name = "De", descriptor = "I")
	private int anInt5943;

	@OriginalMember(owner = "client!qg", name = "Le", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!qg", name = "Ne", descriptor = "Lclient!ph;")
	public Class37_Sub2 aClass37_Sub2_1;

	@OriginalMember(owner = "client!qg", name = "Oe", descriptor = "Z")
	public boolean aBoolean459;

	@OriginalMember(owner = "client!qg", name = "Pe", descriptor = "Lclient!ph;")
	public Class37_Sub2 aClass37_Sub2_2;

	@OriginalMember(owner = "client!qg", name = "Ue", descriptor = "Z")
	public boolean aBoolean461;

	@OriginalMember(owner = "client!qg", name = "Ve", descriptor = "Z")
	private boolean aBoolean462;

	@OriginalMember(owner = "client!qg", name = "We", descriptor = "I")
	private int anInt5949;

	@OriginalMember(owner = "client!qg", name = "Ye", descriptor = "Lclient!ht;")
	public Class43_Sub2 aClass43_Sub2_3;

	@OriginalMember(owner = "client!qg", name = "af", descriptor = "Lclient!ph;")
	public Class37_Sub2 aClass37_Sub2_3;

	@OriginalMember(owner = "client!qg", name = "bf", descriptor = "Ljava/lang/String;")
	private String bf;

	@OriginalMember(owner = "client!qg", name = "cf", descriptor = "Lclient!ce;")
	private Interface2 anInterface2_4;

	@OriginalMember(owner = "client!qg", name = "ef", descriptor = "Lclient!jp;")
	public Class21_Sub2 aClass21_Sub2_3;

	@OriginalMember(owner = "client!qg", name = "hf", descriptor = "Lclient!ph;")
	public Class37_Sub2 aClass37_Sub2_4;

	@OriginalMember(owner = "client!qg", name = "kf", descriptor = "Z")
	public boolean aBoolean465;

	@OriginalMember(owner = "client!qg", name = "lf", descriptor = "I")
	private int anInt5951;

	@OriginalMember(owner = "client!qg", name = "of", descriptor = "Lclient!uv;")
	private Interface12 anInterface12_4;

	@OriginalMember(owner = "client!qg", name = "sf", descriptor = "I")
	private int anInt5954;

	@OriginalMember(owner = "client!qg", name = "tf", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!qg", name = "uf", descriptor = "I")
	public int anInt5955;

	@OriginalMember(owner = "client!qg", name = "xf", descriptor = "I")
	public int anInt5957;

	@OriginalMember(owner = "client!qg", name = "zf", descriptor = "I")
	private int anInt5959;

	@OriginalMember(owner = "client!qg", name = "Af", descriptor = "Lclient!ls;")
	private Class21_Sub2_Sub1 aClass21_Sub2_Sub1_3;

	@OriginalMember(owner = "client!qg", name = "Cf", descriptor = "Z")
	public boolean aBoolean470;

	@OriginalMember(owner = "client!qg", name = "Df", descriptor = "Z")
	public boolean aBoolean471;

	@OriginalMember(owner = "client!qg", name = "Gf", descriptor = "I")
	private int anInt5961;

	@OriginalMember(owner = "client!qg", name = "Hf", descriptor = "Lclient!bb;")
	public Class19 aClass19_4;

	@OriginalMember(owner = "client!qg", name = "If", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!qg", name = "Jf", descriptor = "I")
	private int anInt5962;

	@OriginalMember(owner = "client!qg", name = "Of", descriptor = "Lclient!ph;")
	public Class37_Sub2 aClass37_Sub2_5;

	@OriginalMember(owner = "client!qg", name = "Pf", descriptor = "Z")
	public boolean aBoolean472;

	@OriginalMember(owner = "client!qg", name = "Qf", descriptor = "I")
	public int anInt5964;

	@OriginalMember(owner = "client!qg", name = "Rf", descriptor = "Lclient!jp;")
	public Class21_Sub2 aClass21_Sub2_4;

	@OriginalMember(owner = "client!qg", name = "Sf", descriptor = "I")
	private int anInt5965;

	@OriginalMember(owner = "client!qg", name = "Tf", descriptor = "Z")
	private boolean aBoolean473;

	@OriginalMember(owner = "client!qg", name = "Uf", descriptor = "Z")
	private boolean aBoolean474;

	@OriginalMember(owner = "client!qg", name = "Wf", descriptor = "Z")
	private boolean aBoolean475;

	@OriginalMember(owner = "client!qg", name = "Xf", descriptor = "I")
	private int anInt5967;

	@OriginalMember(owner = "client!qg", name = "Zf", descriptor = "F")
	private float aFloat93;

	@OriginalMember(owner = "client!qg", name = "ag", descriptor = "I")
	private int anInt5969;

	@OriginalMember(owner = "client!qg", name = "bg", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!qg", name = "cg", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!qg", name = "dg", descriptor = "Lclient!bb;")
	public Class19 aClass19_5;

	@OriginalMember(owner = "client!qg", name = "eg", descriptor = "Ljava/lang/String;")
	private String aString69;

	@OriginalMember(owner = "client!qg", name = "fg", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!qg", name = "gg", descriptor = "I")
	public int anInt5970;

	@OriginalMember(owner = "client!qg", name = "hg", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!qg", name = "ig", descriptor = "Z")
	private boolean aBoolean476;

	@OriginalMember(owner = "client!qg", name = "jg", descriptor = "Lclient!wt;")
	public Class267 aClass267_13;

	@OriginalMember(owner = "client!qg", name = "kg", descriptor = "Lclient!ph;")
	public Class37_Sub2 aClass37_Sub2_6;

	@OriginalMember(owner = "client!qg", name = "ng", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!qg", name = "og", descriptor = "Z")
	private boolean aBoolean478;

	@OriginalMember(owner = "client!qg", name = "pg", descriptor = "Z")
	private boolean aBoolean479;

	@OriginalMember(owner = "client!qg", name = "rg", descriptor = "Lclient!ph;")
	public Class37_Sub2 aClass37_Sub2_7;

	@OriginalMember(owner = "client!qg", name = "sg", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!qg", name = "ug", descriptor = "I")
	private int anInt5971;

	@OriginalMember(owner = "client!qg", name = "xg", descriptor = "Z")
	public boolean aBoolean480;

	@OriginalMember(owner = "client!qg", name = "yg", descriptor = "Z")
	private boolean aBoolean481;

	@OriginalMember(owner = "client!qg", name = "Ag", descriptor = "Lclient!ph;")
	public Class37_Sub2 aClass37_Sub2_8;

	@OriginalMember(owner = "client!qg", name = "Bg", descriptor = "[Lclient!go;")
	private Class21[] aClass21Array1;

	@OriginalMember(owner = "client!qg", name = "Cg", descriptor = "Z")
	public boolean aBoolean482;

	@OriginalMember(owner = "client!qg", name = "Eg", descriptor = "I")
	private int anInt5975;

	@OriginalMember(owner = "client!qg", name = "Gg", descriptor = "F")
	private float aFloat101;

	@OriginalMember(owner = "client!qg", name = "Hg", descriptor = "I")
	private int anInt5976;

	@OriginalMember(owner = "client!qg", name = "Ig", descriptor = "Lclient!ph;")
	public Class37_Sub2 aClass37_Sub2_9;

	@OriginalMember(owner = "client!qg", name = "Jg", descriptor = "Lclient!uv;")
	private Interface12 anInterface12_5;

	@OriginalMember(owner = "client!qg", name = "Lg", descriptor = "Z")
	private boolean aBoolean483;

	@OriginalMember(owner = "client!qg", name = "Mg", descriptor = "Lclient!kk;")
	private Class89_Sub1 aClass89_Sub1_1;

	@OriginalMember(owner = "client!qg", name = "Ng", descriptor = "I")
	private int anInt5977;

	@OriginalMember(owner = "client!qg", name = "Qg", descriptor = "Lclient!ph;")
	public Class37_Sub2 aClass37_Sub2_10;

	@OriginalMember(owner = "client!qg", name = "Rg", descriptor = "Lclient!jp;")
	public Class21_Sub2 aClass21_Sub2_5;

	@OriginalMember(owner = "client!qg", name = "Ug", descriptor = "Lclient!ht;")
	public Class43_Sub2 aClass43_Sub2_4;

	@OriginalMember(owner = "client!qg", name = "Vg", descriptor = "F")
	private float aFloat104;

	@OriginalMember(owner = "client!qg", name = "Zg", descriptor = "F")
	public float aFloat106;

	@OriginalMember(owner = "client!qg", name = "bh", descriptor = "Lclient!wt;")
	public Class267 aClass267_14;

	@OriginalMember(owner = "client!qg", name = "Ed", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!qg", name = "ee", descriptor = "I")
	public int anInt5933 = 128;

	@OriginalMember(owner = "client!qg", name = "fe", descriptor = "Lclient!gg;")
	private final Class97 aClass97_1 = new Class97();

	@OriginalMember(owner = "client!qg", name = "je", descriptor = "Lclient!ht;")
	private final Class43_Sub2 aClass43_Sub2_1 = new Class43_Sub2();

	@OriginalMember(owner = "client!qg", name = "ke", descriptor = "Lclient!ht;")
	public final Class43_Sub2 aClass43_Sub2_2 = new Class43_Sub2();

	@OriginalMember(owner = "client!qg", name = "pe", descriptor = "I")
	public int anInt5936 = 3;

	@OriginalMember(owner = "client!qg", name = "re", descriptor = "I")
	public int anInt5937 = 8;

	@OriginalMember(owner = "client!qg", name = "qe", descriptor = "Z")
	private boolean aBoolean457 = false;

	@OriginalMember(owner = "client!qg", name = "oe", descriptor = "Lclient!ko;")
	private final Class142 aClass142_34 = new Class142();

	@OriginalMember(owner = "client!qg", name = "ve", descriptor = "[Lclient!ef;")
	private final Interface3[] anInterface3Array1 = new Interface3[4];

	@OriginalMember(owner = "client!qg", name = "we", descriptor = "[Lclient!ef;")
	private final Interface3[] anInterface3Array2 = new Interface3[4];

	@OriginalMember(owner = "client!qg", name = "ye", descriptor = "I")
	private int anInt5940 = -1;

	@OriginalMember(owner = "client!qg", name = "xe", descriptor = "I")
	private int anInt5939 = -1;

	@OriginalMember(owner = "client!qg", name = "te", descriptor = "I")
	private int anInt5938 = -1;

	@OriginalMember(owner = "client!qg", name = "ze", descriptor = "[Lclient!ef;")
	private final Interface3[] anInterface3Array3 = new Interface3[4];

	@OriginalMember(owner = "client!qg", name = "Ae", descriptor = "Lclient!ko;")
	private final Class142 aClass142_35;

	@OriginalMember(owner = "client!qg", name = "Ee", descriptor = "Lclient!ko;")
	private final Class142 aClass142_36;

	@OriginalMember(owner = "client!qg", name = "Fe", descriptor = "Lclient!ko;")
	private final Class142 aClass142_37;

	@OriginalMember(owner = "client!qg", name = "Ge", descriptor = "Lclient!ko;")
	private final Class142 aClass142_38;

	@OriginalMember(owner = "client!qg", name = "He", descriptor = "Lclient!ko;")
	private final Class142 aClass142_39;

	@OriginalMember(owner = "client!qg", name = "Ie", descriptor = "Lclient!ko;")
	private final Class142 aClass142_40;

	@OriginalMember(owner = "client!qg", name = "Je", descriptor = "Lclient!ko;")
	private final Class142 aClass142_41;

	@OriginalMember(owner = "client!qg", name = "Xe", descriptor = "Z")
	private boolean aBoolean463;

	@OriginalMember(owner = "client!qg", name = "Re", descriptor = "I")
	private int anInt5947;

	@OriginalMember(owner = "client!qg", name = "Ke", descriptor = "I")
	private int anInt5944;

	@OriginalMember(owner = "client!qg", name = "df", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!qg", name = "Qe", descriptor = "I")
	public int anInt5946;

	@OriginalMember(owner = "client!qg", name = "yf", descriptor = "I")
	private int anInt5958;

	@OriginalMember(owner = "client!qg", name = "Lf", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!qg", name = "Ze", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!qg", name = "Vf", descriptor = "I")
	private int anInt5966;

	@OriginalMember(owner = "client!qg", name = "Kf", descriptor = "F")
	private float aFloat91;

	@OriginalMember(owner = "client!qg", name = "Mf", descriptor = "[F")
	public final float[] aFloatArray36;

	@OriginalMember(owner = "client!qg", name = "ff", descriptor = "I")
	private int anInt5950;

	@OriginalMember(owner = "client!qg", name = "mg", descriptor = "[F")
	private final float[] aFloatArray37;

	@OriginalMember(owner = "client!qg", name = "Se", descriptor = "I")
	public int anInt5948;

	@OriginalMember(owner = "client!qg", name = "qf", descriptor = "I")
	public int anInt5953;

	@OriginalMember(owner = "client!qg", name = "Me", descriptor = "I")
	public int anInt5945;

	@OriginalMember(owner = "client!qg", name = "tg", descriptor = "F")
	public float aFloat100;

	@OriginalMember(owner = "client!qg", name = "wf", descriptor = "I")
	public int anInt5956;

	@OriginalMember(owner = "client!qg", name = "qg", descriptor = "F")
	public float aFloat98;

	@OriginalMember(owner = "client!qg", name = "Fg", descriptor = "[F")
	private final float[] aFloatArray38;

	@OriginalMember(owner = "client!qg", name = "zg", descriptor = "I")
	private int anInt5973;

	@OriginalMember(owner = "client!qg", name = "Dg", descriptor = "I")
	private int anInt5974;

	@OriginalMember(owner = "client!qg", name = "Ff", descriptor = "I")
	public int anInt5960;

	@OriginalMember(owner = "client!qg", name = "Yf", descriptor = "I")
	public int anInt5968;

	@OriginalMember(owner = "client!qg", name = "Ef", descriptor = "F")
	private float aFloat89;

	@OriginalMember(owner = "client!qg", name = "Kg", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!qg", name = "wg", descriptor = "I")
	private int anInt5972;

	@OriginalMember(owner = "client!qg", name = "mf", descriptor = "I")
	public int anInt5952;

	@OriginalMember(owner = "client!qg", name = "Pg", descriptor = "I")
	private int anInt5978;

	@OriginalMember(owner = "client!qg", name = "rf", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!qg", name = "Og", descriptor = "F")
	private float aFloat103;

	@OriginalMember(owner = "client!qg", name = "nf", descriptor = "[F")
	private final float[] aFloatArray35;

	@OriginalMember(owner = "client!qg", name = "Sg", descriptor = "I")
	public int anInt5979;

	@OriginalMember(owner = "client!qg", name = "jf", descriptor = "[F")
	private final float[] aFloatArray34;

	@OriginalMember(owner = "client!qg", name = "Xg", descriptor = "I")
	public int anInt5981;

	@OriginalMember(owner = "client!qg", name = "ah", descriptor = "I")
	public int anInt5982;

	@OriginalMember(owner = "client!qg", name = "vg", descriptor = "[Lclient!tj;")
	private final Class1_Sub12[] aClass1_Sub12Array3;

	@OriginalMember(owner = "client!qg", name = "Tg", descriptor = "I")
	private int anInt5980;

	@OriginalMember(owner = "client!qg", name = "Yg", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas5;

	@OriginalMember(owner = "client!qg", name = "Ud", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!qg", name = "be", descriptor = "I")
	public final int anInt5931;

	@OriginalMember(owner = "client!qg", name = "ad", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!qg", name = "pc", descriptor = "J")
	private final long aLong169;

	@OriginalMember(owner = "client!qg", name = "Qb", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!qg", name = "Nf", descriptor = "I")
	public final int anInt5963;

	@OriginalMember(owner = "client!qg", name = "Bf", descriptor = "Z")
	public boolean aBoolean469;

	@OriginalMember(owner = "client!qg", name = "vf", descriptor = "Z")
	public boolean aBoolean468;

	@OriginalMember(owner = "client!qg", name = "Te", descriptor = "Z")
	private boolean aBoolean460;

	@OriginalMember(owner = "client!qg", name = "Wg", descriptor = "Z")
	public boolean aBoolean484;

	@OriginalMember(owner = "client!qg", name = "gf", descriptor = "Z")
	private boolean aBoolean464;

	@OriginalMember(owner = "client!qg", name = "pf", descriptor = "Z")
	public boolean aBoolean466;

	@OriginalMember(owner = "client!qg", name = "lg", descriptor = "Z")
	private final boolean aBoolean477;

	@OriginalMember(owner = "client!qg", name = "de", descriptor = "Lclient!lt;")
	public final Class156 aClass156_1;

	@OriginalMember(owner = "client!qg", name = "me", descriptor = "Lclient!ov;")
	public final Class188 aClass188_1;

	@OriginalMember(owner = "client!qg", name = "ie", descriptor = "Lclient!me;")
	private final Class157 aClass157_1;

	@OriginalMember(owner = "client!qg", name = "ge", descriptor = "Lclient!up;")
	private Class1_Sub42_Sub1 aClass1_Sub42_Sub1_1;

	@OriginalMember(owner = "client!qg", name = "ae", descriptor = "Lclient!fs;")
	private final Class92 aClass92_1;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;ILclient!ci;)V")
	public Class121_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class42 arg4) {
		super(arg0, arg2);
		new Class247();
		new Class51(16);
		this.aClass142_35 = new Class142();
		this.aClass142_36 = new Class142();
		this.aClass142_37 = new Class142();
		this.aClass142_38 = new Class142();
		this.aClass142_39 = new Class142();
		this.aClass142_40 = new Class142();
		this.aClass142_41 = new Class142();
		this.aBoolean463 = true;
		this.anInt5947 = -1;
		this.anInt5944 = 8448;
		this.aFloat87 = 1.0F;
		this.anInt5946 = -1;
		this.anInt5958 = 0;
		this.aFloat92 = 3000.0F;
		this.aFloat86 = -1.0F;
		this.anInt5966 = 0;
		this.aFloat91 = 0.0F;
		this.aFloatArray36 = new float[4];
		this.anInt5950 = 8448;
		this.aFloatArray37 = new float[16];
		this.anInt5948 = 512;
		this.anInt5953 = 0;
		this.anInt5945 = -1;
		this.aFloat100 = 1.0F;
		this.anInt5956 = 3584;
		this.aFloat98 = -1.0F;
		this.aFloatArray38 = new float[4];
		this.anInt5973 = 0;
		this.anInt5974 = 0;
		this.anInt5960 = 0;
		this.anInt5968 = 50;
		this.aFloat89 = 1.0F;
		this.aFloat102 = 3584.0F;
		this.anInt5972 = 0;
		this.anInt5952 = 0;
		this.anInt5978 = 0;
		this.aFloat88 = 1.0F;
		this.aFloat103 = 1.0F;
		this.aFloatArray35 = new float[4];
		this.anInt5979 = -1;
		this.aFloatArray34 = new float[4];
		this.anInt5981 = 512;
		this.anInt5982 = 0;
		this.aClass1_Sub12Array3 = new Class1_Sub12[Static390.anInt7014];
		this.anInt5980 = -1;
		this.aFloat105 = 3584.0F;
		this.aCanvas6 = this.aCanvas5 = arg1;
		this.anInt5931 = arg3;
		try {
			if (Static420.aBoolean628 == null || !Static420.aBoolean628) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static420.aBoolean628 = Boolean.TRUE;
				} else {
					@Pc(254) String local254 = System.getProperty("os.name").toLowerCase();
					if (!local254.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local254.startsWith("linux") || local254.startsWith("sunos")) {
						System.load(arg4.method667("libjaggl.so").toString());
					} else if (local254.startsWith("mac")) {
						System.load(arg4.method667("libjaggl.jnilib").toString());
					} else if (local254.startsWith("win")) {
						System.load(arg4.method667("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static420.aBoolean628 = Boolean.TRUE;
				}
			}
			if (Static420.aBoolean628 == null || !Static420.aBoolean628) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong168 = this.aLong169 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt5931);
			if (this.aLong169 == 0L) {
				throw new RuntimeException("");
			}
			this.method4719();
			@Pc(355) int local355 = this.method4704();
			if (local355 != 0) {
				throw new RuntimeException("");
			}
			this.anInt5963 = this.aBoolean471 ? 33639 : 5121;
			@Pc(379) int local379;
			if (this.aString69.indexOf("radeon") != -1) {
				local379 = 0;
				@Pc(381) boolean local381 = false;
				@Pc(383) boolean local383 = false;
				@Pc(392) String[] local392 = Static71.method1050(' ', this.aString69.replace('/', ' '));
				for (@Pc(394) int local394 = 0; local394 < local392.length; local394++) {
					@Pc(400) String local400 = local392[local394];
					try {
						if (local400.length() > 0) {
							if (local400.charAt(0) == 'x' && local400.length() >= 3 && Static12.method213(local400.substring(1, 3))) {
								local400 = local400.substring(1);
								local383 = true;
							}
							if (local400.equals("hd")) {
								local381 = true;
							} else {
								if (local400.startsWith("hd")) {
									local381 = true;
									local400 = local400.substring(2);
								}
								if (local400.length() >= 4 && Static12.method213(local400.substring(0, 4))) {
									local379 = Static32.method455(local400.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(470) Exception local470) {
					}
				}
				if (!local381 || local379 < 4000) {
					this.aBoolean469 = false;
				}
				if (!local383 && !local381) {
					if (local379 >= 7000 && local379 <= 9250) {
						this.aBoolean468 = false;
					}
					if (local379 >= 7000 && local379 <= 7999) {
						this.aBoolean460 = false;
					}
				}
				this.aBoolean484 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean464 = this.aBoolean460;
			}
			if (this.bf.indexOf("intel") != -1) {
				this.aBoolean466 = false;
			}
			this.aBoolean477 = !this.bf.equals("s3 graphics");
			if (this.aBoolean460) {
				try {
					@Pc(549) int[] local549 = new int[1];
					OpenGL.glGenBuffersARB(1, local549, 0);
				} catch (@Pc(555) Throwable local555) {
					throw new RuntimeException("");
				}
			}
			Static111.method1746(true, false);
			this.aBoolean457 = true;
			this.aClass156_1 = new Class156(this, super.anInterface5_16);
			this.method4711();
			this.aClass188_1 = new Class188(this);
			this.aClass157_1 = new Class157(this);
			if (this.aClass157_1.method3533()) {
				this.aClass1_Sub42_Sub1_1 = new Class1_Sub42_Sub1(this);
				if (!this.aClass1_Sub42_Sub1_1.method5581()) {
					this.aClass1_Sub42_Sub1_1.method5579();
					this.aClass1_Sub42_Sub1_1 = null;
				}
			}
			this.aClass92_1 = new Class92(this);
			this.method4653();
			this.method4720();
			OpenGL.glClear(16640);
			local379 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(634) Exception local634) {
					if (local379++ > 5) {
						throw new RuntimeException("");
					}
					Static366.method5214(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(652) Throwable local652) {
			local652.printStackTrace();
			this.method4578();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "()Z")
	@Override
	public boolean method4638() {
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "()V")
	@Override
	protected void method4578() {
		for (@Pc(6) Class1 local6 = this.aClass142_34.method3199(); local6 != null; local6 = this.aClass142_34.method3198()) {
			((Class1_Sub27_Sub1) local6).method5888();
		}
		if (this.aClass157_1 != null) {
			this.aClass157_1.method3537();
		}
		if (this.anOpenGL1 != null) {
			this.method4708();
			@Pc(40) Enumeration local40 = this.aHashtable2.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable2.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean457) {
			Static201.method3105(false, true);
			this.aBoolean457 = false;
		}
	}

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "()Z")
	@Override
	public boolean method4582() {
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "S", descriptor = "()V")
	@Override
	public void S() {
		this.aBoolean458 = false;
		this.aClass92_1.method1804(false, 0, false);
		this.method4671();
		this.method4710();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZI)V")
	public synchronized void method4646(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub37 local12 = new Class1_Sub37(arg1);
		local12.aLong237 = arg0;
		this.aClass142_37.method3212(local12);
	}

	@OriginalMember(owner = "client!qg", name = "JA", descriptor = "(II)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5968 == arg0 && this.anInt5956 == arg1) {
			return;
		}
		this.anInt5968 = arg0;
		this.anInt5956 = arg1;
		this.method4716();
		this.method4671();
		if (this.anInt5962 == 3) {
			this.method4672();
			return;
		}
		if (this.anInt5962 != 2) {
			return;
		}
		this.method4723();
	}

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "(I)V")
	@Override
	public void method4642(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt5933 = arg0;
		this.aClass156_1.method3496();
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)V")
	public void method4647(@OriginalArg(0) int arg0) {
		this.method4688(arg0, true);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!lo;IIII)Lclient!c;")
	@Override
	public Class37 method4617(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class37_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V")
	public void method4648(@OriginalArg(0) int arg0) {
		Static10.aFloatArray44[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static10.aFloatArray44[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static10.aFloatArray44[3] = (float) (arg0 >>> 24) / 255.0F;
		Static10.aFloatArray44[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static10.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FIF)V")
	public void method4649(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat91 = arg0;
		this.aFloat89 = arg1;
		if (!this.aBoolean458) {
			this.method4671();
		}
	}

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "(I)V")
	private void method4650() {
		if (this.aFloat106 == 0.0F) {
			this.aFloatArray37[10] = this.aFloat101;
			this.aFloatArray37[14] = this.aFloat104;
		} else {
			@Pc(13) float local13 = this.aFloat92 / (this.aFloat92 + this.aFloat106);
			@Pc(17) float local17 = local13 * local13;
			@Pc(33) float local33 = (1.0F - local13) * (1.0F - local13) * -this.aFloat104 / this.aFloat106;
			this.aFloatArray37[10] = local33 + this.aFloat101;
			this.aFloatArray37[14] = local17 * this.aFloat104;
		}
		this.aFloat102 = (float) this.anInt5956 - this.aFloat106;
		this.aFloat105 = (this.aFloatArray37[14] - (float) this.anInt5956) / this.aFloatArray37[10];
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4608() {
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZB[B)Lclient!ce;")
	public Interface2 method4651(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface2) (this.aBoolean460 && (!arg1 || this.aBoolean464) ? new Class31_Sub2(this, 5123, arg2, arg0, arg1) : new Class28_Sub2(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "()Z")
	@Override
	public boolean method4604() {
		return false;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!dt;Z)Lclient!f;")
	@Override
	public Class78 method4589(@OriginalArg(0) Class63 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt1470 * arg0.anInt1472];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray12 == null) {
			for (local21 = 0; local21 < arg0.anInt1470; local21++) {
				for (local25 = 0; local25 < arg0.anInt1472; local25++) {
					@Pc(83) int local83 = arg0.anIntArray71[arg0.aByteArray11[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt1470; local21++) {
				for (local25 = 0; local25 < arg0.anInt1472; local25++) {
					local12[local16++] = arg0.anIntArray71[arg0.aByteArray11[local14] & 0xFF] | arg0.aByteArray12[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(119) Class78 local119 = this.method4575(local12, arg0.anInt1472, arg0.anInt1472, arg0.anInt1470);
		local119.ka(arg0.anInt1473, arg0.anInt1468, arg0.anInt1469, arg0.anInt1471);
		return local119;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B[BZII)Lclient!uv;")
	public Interface12 method4652(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return (Interface12) (this.aBoolean460 && (!arg1 || this.aBoolean464) ? new Class31_Sub1(this, arg2, arg0, arg3, arg1) : new Class28_Sub1(this, arg2, arg0, arg3));
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
	private void method4653() {
		this.method4647(-2);
		for (@Pc(14) int local14 = this.anInt5957 - 1; local14 >= 0; local14--) {
			this.method4669(local14);
			this.method4681(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method4709(8448, 8448);
		this.method4692(2, 34168, 770);
		this.method4659();
		this.anInt5949 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt5961 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean467 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean475 = true;
		this.method4657(true);
		this.method4663(true);
		this.method4655(true);
		this.method4691(true);
		this.method4682();
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
		this.anInt5947 = this.anInt5979 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)V")
	private void method4654() {
		if (this.anInt5973 <= this.anInt5958 && this.anInt5966 >= this.anInt5972) {
			OpenGL.glScissor(this.anInt5973 + this.anInt5974, this.anInt5978 - -this.anInt5900 - this.anInt5966, this.anInt5958 - this.anInt5973, -this.anInt5972 + this.anInt5966);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BZ)V")
	public void method4655(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean473) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt5951 &= 0xFFFFFFE0;
		this.aBoolean473 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[Lclient!tj;)V")
	@Override
	public void method4591(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub12[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass1_Sub12Array3[local3] = arg1[local3];
		}
		this.anInt5959 = arg0;
		if (this.anInt5962 != 1) {
			this.method4668();
		}
	}

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "(I)V")
	public void method4656() {
		if (this.anInt5951 == 4) {
			return;
		}
		this.method4665();
		this.method4657(false);
		this.method4663(false);
		this.method4655(false);
		this.method4691(false);
		this.method4647(-2);
		this.method4700(1);
		this.method4707(0);
		this.anInt5951 = 4;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)V")
	public void method4657(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean476 != arg0) {
			this.aBoolean476 = arg0;
			this.method4710();
			this.anInt5951 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "(I)V")
	private void method4658() {
		if (this.anInt5962 != 2) {
			this.anInt5962 = 2;
			this.method4723();
			this.method4690();
			this.anInt5951 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)V")
	private void method4659() {
		if (this.aBoolean481) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean481 = false;
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(IZ)V")
	public synchronized void method4660(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub37 local8 = new Class1_Sub37(arg0);
		this.aClass142_38.method3212(local8);
	}

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "(I)V")
	private void method4661() {
		if (this.anInt5962 != 3) {
			this.anInt5962 = 3;
			this.method4672();
			this.method4690();
			this.anInt5951 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qg", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt5972 = 0;
		this.anInt5973 = 0;
		this.anInt5966 = this.anInt5900;
		this.anInt5958 = this.anInt5911;
		OpenGL.glDisable(3089);
		this.method4715();
	}

	@OriginalMember(owner = "client!qg", name = "W", descriptor = "()I")
	@Override
	public int W() {
		return this.anInt5956;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLclient!jaggl/memory/NativeBuffer;III)Lclient!uv;")
	public Interface12 method4662(@OriginalArg(1) NativeBuffer arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return (Interface12) (this.aBoolean460 ? new Class31_Sub1(this, arg1, arg0, arg2, false) : new Class28_Sub1(this, arg1, arg0));
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZ)V")
	public void method4663(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean474 != arg0) {
			this.aBoolean474 = arg0;
			this.method4727();
			this.anInt5951 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "()Z")
	@Override
	public boolean method4622() {
		return this.aClass1_Sub42_Sub1_1 != null && (this.anInt5931 <= 1 || this.aBoolean462);
	}

	@OriginalMember(owner = "client!qg", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt5979 && this.anInt5945 == arg1 && this.anInt5953 == arg2) {
			return;
		}
		this.anInt5979 = arg0;
		this.anInt5945 = arg1;
		this.anInt5953 = arg2;
		if (this.aBoolean458) {
			return;
		}
		this.method4671();
		this.method4710();
	}

	@OriginalMember(owner = "client!qg", name = "SA", descriptor = "(IIIIII)Z")
	@Override
	public boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass43_Sub2_4.aFloat47 * (float) arg2 + this.aClass43_Sub2_4.aFloat49 * (float) arg0 + this.aClass43_Sub2_4.aFloat42 * (float) arg1 + this.aClass43_Sub2_4.aFloat45;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass43_Sub2_4.aFloat47 * (float) arg5 + this.aClass43_Sub2_4.aFloat42 * (float) arg4 + this.aClass43_Sub2_4.aFloat49 * (float) arg3 + this.aClass43_Sub2_4.aFloat45;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt5968 && local59 < (float) this.anInt5968 || !(!(local28 > (float) this.anInt5956) || !((float) this.anInt5956 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass43_Sub2_4.aFloat48 + (float) arg2 * this.aClass43_Sub2_4.aFloat44 + this.aClass43_Sub2_4.aFloat50 * (float) arg0 + this.aClass43_Sub2_4.aFloat43 * (float) arg1) * (float) this.anInt5948 / local28);
		@Pc(155) int local155 = (int) ((this.aClass43_Sub2_4.aFloat44 * (float) arg5 + this.aClass43_Sub2_4.aFloat43 * (float) arg4 + this.aClass43_Sub2_4.aFloat50 * (float) arg3 + this.aClass43_Sub2_4.aFloat48) * (float) this.anInt5948 / local59);
		if (this.aFloat96 > (float) local123 && this.aFloat96 > (float) local155 || (float) local123 > this.aFloat97 && this.aFloat97 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) (((float) arg2 * this.aClass43_Sub2_4.aFloat46 + (float) arg1 * this.aClass43_Sub2_4.aFloat51 + (float) arg0 * this.aClass43_Sub2_4.aFloat41 + this.aClass43_Sub2_4.aFloat40) * (float) this.anInt5981 / local28);
			@Pc(245) int local245 = (int) (((float) arg5 * this.aClass43_Sub2_4.aFloat46 + (float) arg4 * this.aClass43_Sub2_4.aFloat51 + (float) arg3 * this.aClass43_Sub2_4.aFloat41 + this.aClass43_Sub2_4.aFloat40) * (float) this.anInt5981 / local59);
			return (!(this.aFloat94 > (float) local213) || !((float) local245 < this.aFloat94)) && (!((float) local213 > this.aFloat99) || !((float) local245 > this.aFloat99));
		}
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(II)I")
	public int method4664(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4620(@OriginalArg(0) Canvas arg0) {
		this.aCanvas6 = null;
		this.aLong168 = 0L;
		if (arg0 == null || arg0 == this.aCanvas5) {
			this.aCanvas6 = this.aCanvas5;
			this.aLong168 = this.aLong169;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable2.get(arg0);
			this.aLong168 = local26;
			this.aCanvas6 = arg0;
		}
		if (this.aCanvas6 == null || this.aLong168 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong168);
		this.method4720();
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(Z)V")
	private void method4665() {
		if (this.anInt5962 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt5911 > 0 && this.anInt5900 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt5911, (double) this.anInt5900, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt5951 &= 0xFFFFFFE7;
		this.anInt5962 = 1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
	@Override
	public int method4634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "(I)V")
	public void method4666() {
		if (this.anInt5951 == 8) {
			return;
		}
		this.method4658();
		this.method4657(true);
		this.method4655(true);
		this.method4691(true);
		this.method4700(1);
		this.method4707(0);
		this.anInt5951 = 8;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLclient!ce;)V")
	public void method4667(@OriginalArg(1) Interface2 arg0) {
		if (arg0 != this.anInterface2_4) {
			if (this.aBoolean460) {
				OpenGL.glBindBufferARB(34963, arg0.method5942());
			}
			this.anInterface2_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method4611(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "(I)V")
	private void method4668() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt5959; local7++) {
			@Pc(14) Class1_Sub12 local14 = this.aClass1_Sub12Array3[local7];
			Static147.aFloatArray14[0] = local14.method3182();
			@Pc(25) int local25 = local7 + 16386;
			Static147.aFloatArray14[1] = local14.method3186();
			Static147.aFloatArray14[2] = local14.method3181();
			Static147.aFloatArray14[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static147.aFloatArray14, 0);
			@Pc(52) int local52 = local14.method3184();
			@Pc(58) float local58 = local14.method3183() / 255.0F;
			Static147.aFloatArray14[0] = (float) (local52 >> 16 & 0xFF) * local58;
			Static147.aFloatArray14[2] = local58 * (float) (local52 & 0xFF);
			Static147.aFloatArray14[1] = local58 * (float) (local52 >> 8 & 0xFF);
			OpenGL.glLightfv(local25, 4609, Static147.aFloatArray14, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method3180() * local14.method3180()));
			OpenGL.glEnable(local25);
		}
		while (local7 < this.anInt5975) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt5975 = this.anInt5959;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)V")
	public void method4669(@OriginalArg(0) int arg0) {
		if (this.anInt5976 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt5976 = arg0;
		}
	}

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "(I)V")
	private void method4670() {
		Static10.aFloatArray44[2] = this.aFloat88 * this.aFloat95;
		Static10.aFloatArray44[0] = this.aFloat87 * this.aFloat95;
		Static10.aFloatArray44[3] = 1.0F;
		Static10.aFloatArray44[1] = this.aFloat100 * this.aFloat95;
		OpenGL.glLightModelfv(2899, Static10.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(Z)V")
	@Override
	public void method4624(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "()F")
	@Override
	public float w() {
		return this.aFloat106;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class78 method4575(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class78_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!ds;[Lclient!dt;Z)Lclient!oa;")
	@Override
	public Class4 method4612(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class63[] arg1) {
		return new Class4_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "()Z")
	@Override
	public boolean method4626() {
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "(I)V")
	private void method4671() {
		@Pc(53) int local53;
		if (this.aBoolean458) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local53 = this.anInt5980;
		} else {
			this.aFloat93 = (float) (this.anInt5956 - this.anInt5953) - this.aFloat91;
			this.aFloat90 = this.aFloat93 - (float) this.anInt5945 * this.aFloat89;
			if ((float) this.anInt5968 > this.aFloat90) {
				this.aFloat90 = this.anInt5968;
			}
			OpenGL.glFogf(2915, this.aFloat90);
			OpenGL.glFogf(2916, this.aFloat93);
			local53 = this.anInt5979;
		}
		Static10.aFloatArray44[2] = (float) (local53 & 0xFF) / 255.0F;
		Static10.aFloatArray44[1] = (float) (local53 & 0xFF00) / 65280.0F;
		Static10.aFloatArray44[0] = (float) (local53 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static10.aFloatArray44, 0);
		if (this.aBoolean458) {
			this.aClass92_1.aClass76_Sub7_1.method5283();
		}
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(B)V")
	private void method4672() {
		@Pc(15) float local15 = this.aFloat103 * (float) -this.anInt5982 / (float) this.anInt5948;
		@Pc(38) float local38 = (float) -this.anInt5952 * this.aFloat103 / (float) this.anInt5981;
		@Pc(53) float local53 = (float) (this.anInt5911 - this.anInt5982) * this.aFloat103 / (float) this.anInt5948;
		@Pc(68) float local68 = this.aFloat103 * (float) (this.anInt5900 - this.anInt5952) / (float) this.anInt5981;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local53 && local68 != local38) {
			OpenGL.glOrtho((double) local15, (double) local53, (double) -local68, (double) -local38, (double) ((float) this.anInt5968 - this.aFloat106), (double) ((float) this.anInt5956 - this.aFloat106));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIF)Lclient!tj;")
	@Override
	public Class1_Sub12 method4641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub12_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
	@Override
	public void method4609(@OriginalArg(0) int arg0) {
		this.method4719();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass157_1.method3540(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qg", name = "FA", descriptor = "()I")
	@Override
	public int FA() {
		return this.anInt5943 + this.anInt5941 + this.anInt5942;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(IIII)V")
	public void method4673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "(I)V")
	public void method4674() {
		if (this.anInt5951 == 2) {
			return;
		}
		this.method4665();
		this.method4657(false);
		this.method4663(false);
		this.method4655(false);
		this.method4691(false);
		this.method4647(-2);
		this.anInt5951 = 2;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLclient!ef;)V")
	public void method4675(@OriginalArg(1) Interface3 arg0) {
		if (this.aBoolean472) {
			this.method4722(arg0);
			this.method4701(arg0);
		} else if (this.anInt5940 < 3) {
			if (this.anInt5940 >= 0) {
				this.anInterface3Array3[this.anInt5940].method305();
			}
			this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array3[++this.anInt5940] = arg0;
			this.anInterface3_2.method306();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZBZ)V")
	public void method4676(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt5954) {
			if (arg0 < 0) {
				this.method4659();
				this.method4681(null);
				this.method4707(0);
				if (!this.aBoolean458) {
					this.aClass92_1.method1804(arg1, 0, arg2);
				}
			} else {
				@Pc(40) Class21_Sub2 local40 = this.aClass156_1.method3495(arg0);
				@Pc(46) Class132 local46 = super.anInterface5_16.method3920(arg0);
				if (local46.aByte37 == 0 && local46.aByte41 == 0) {
					this.method4659();
				} else {
					@Pc(62) int local62 = local46.aBoolean282 ? 64 : 128;
					@Pc(66) int local66 = local62 * 50;
					this.method4705((float) (this.anInt5935 % local66 * local46.aByte41) / (float) local66, 0.0F, (float) (this.anInt5935 % local66 * local46.aByte37) / (float) local66);
				}
				if (this.aBoolean458) {
					this.aClass92_1.method1804(arg1, 3, arg2);
					this.method4681(local40);
					this.method4707(local46.anInt3547);
				} else {
					this.aClass92_1.method1804(arg1, local46.aByte40, arg2);
					this.aClass92_1.method1806(local46.aByte43, local46.anInt3552);
					if (!this.aClass92_1.method1807(local40, local46.anInt3547)) {
						this.method4681(local40);
						this.method4707(local46.anInt3547);
					}
				}
			}
			this.anInt5954 = arg0;
		}
		this.anInt5951 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FZ)V")
	public void method4677(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat103) {
			this.aFloat103 = arg0;
			if (this.anInt5962 == 3) {
				this.method4672();
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(Z)V")
	private void method4678() {
		Static10.aFloatArray44[1] = this.aFloat100 * this.aFloat86;
		Static10.aFloatArray44[0] = this.aFloat86 * this.aFloat87;
		Static10.aFloatArray44[3] = 1.0F;
		Static10.aFloatArray44[2] = this.aFloat86 * this.aFloat88;
		OpenGL.glLightfv(16384, 4609, Static10.aFloatArray44, 0);
		Static10.aFloatArray44[2] = this.aFloat88 * -this.aFloat98;
		Static10.aFloatArray44[0] = -this.aFloat98 * this.aFloat87;
		Static10.aFloatArray44[1] = this.aFloat100 * -this.aFloat98;
		Static10.aFloatArray44[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static10.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!qg", name = "XA", descriptor = "(IFFFFF)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt5947;
		if (local11 || arg1 != this.aFloat86 || arg2 != this.aFloat98) {
			this.aFloat98 = arg2;
			this.anInt5947 = arg0;
			this.aFloat86 = arg1;
			if (local11) {
				this.aFloat100 = (float) (this.anInt5947 & 0xFF00) / 65280.0F;
				this.aFloat87 = (float) (this.anInt5947 & 0xFF0000) / 1.671168E7F;
				this.aFloat88 = (float) (this.anInt5947 & 0xFF) / 255.0F;
				this.method4670();
			}
			this.method4678();
		}
		if (this.aFloatArray34[0] == arg3 && arg4 == this.aFloatArray34[1] && this.aFloatArray34[2] == arg5) {
			return;
		}
		this.aFloatArray34[0] = arg3;
		this.aFloatArray34[1] = arg4;
		this.aFloatArray34[2] = arg5;
		this.aFloatArray35[2] = -arg5;
		this.aFloatArray35[0] = -arg3;
		this.aFloatArray35[1] = -arg4;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray36[2] = arg5 * local138;
		this.aFloatArray36[0] = arg3 * local138;
		this.aFloatArray36[1] = arg4 * local138;
		this.aFloatArray38[1] = -this.aFloatArray36[1];
		this.aFloatArray38[0] = -this.aFloatArray36[0];
		this.aFloatArray38[2] = -this.aFloatArray36[2];
		this.method4729();
		this.anInt5970 = (int) (arg3 * 256.0F / arg4);
		this.anInt5955 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4590(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4602();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZB)V")
	public void method4679(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean479) {
			this.aBoolean479 = arg0;
			this.method4727();
		}
	}

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "(I)V")
	public void method4680() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "(Lclient!ia;)V")
	@Override
	public void m(@OriginalArg(0) Class43 arg0) {
		this.aClass43_Sub2_4 = (Class43_Sub2) arg0;
		this.aClass43_Sub2_3.method2488(this.aClass43_Sub2_4);
		if (this.anInt5962 != 1) {
			this.method4690();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!go;I)V")
	public void method4681(@OriginalArg(0) Class21 arg0) {
		@Pc(16) Class21 local16 = this.aClass21Array1[this.anInt5976];
		if (local16 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local16.anInt4557);
			} else {
				if (local16 == null) {
					OpenGL.glEnable(arg0.anInt4557);
				} else if (local16.anInt4557 != arg0.anInt4557) {
					OpenGL.glDisable(local16.anInt4557);
					OpenGL.glEnable(arg0.anInt4557);
				}
				OpenGL.glBindTexture(arg0.anInt4557, arg0.method3758());
			}
			this.aClass21Array1[this.anInt5976] = arg0;
		}
		this.anInt5951 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!qg", name = "O", descriptor = "(IIIII)V")
	@Override
	protected void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method4618(@OriginalArg(0) Class1_Sub27 arg0) {
		this.aNativeHeap1 = ((Class1_Sub27_Sub1) arg0).aNativeHeap2;
		if (this.anInterface12_4 != null) {
			return;
		}
		@Pc(16) Class1_Sub14_Sub1 local16 = new Class1_Sub14_Sub1(80);
		if (this.aBoolean471) {
			local16.method1407(-1.0F);
			local16.method1407(-1.0F);
			local16.method1407(0.0F);
			local16.method1407(0.0F);
			local16.method1407(1.0F);
			local16.method1407(1.0F);
			local16.method1407(-1.0F);
			local16.method1407(0.0F);
			local16.method1407(1.0F);
			local16.method1407(1.0F);
			local16.method1407(1.0F);
			local16.method1407(1.0F);
			local16.method1407(0.0F);
			local16.method1407(1.0F);
			local16.method1407(0.0F);
			local16.method1407(-1.0F);
			local16.method1407(1.0F);
			local16.method1407(0.0F);
			local16.method1407(0.0F);
			local16.method1407(0.0F);
		} else {
			local16.method1406(-1.0F);
			local16.method1406(-1.0F);
			local16.method1406(0.0F);
			local16.method1406(0.0F);
			local16.method1406(1.0F);
			local16.method1406(1.0F);
			local16.method1406(-1.0F);
			local16.method1406(0.0F);
			local16.method1406(1.0F);
			local16.method1406(1.0F);
			local16.method1406(1.0F);
			local16.method1406(1.0F);
			local16.method1406(0.0F);
			local16.method1406(1.0F);
			local16.method1406(0.0F);
			local16.method1406(-1.0F);
			local16.method1406(1.0F);
			local16.method1406(0.0F);
			local16.method1406(0.0F);
			local16.method1406(0.0F);
		}
		this.anInterface12_4 = this.method4652(local16.aByteArray65, false, 20, local16.anInt5695);
		this.aClass267_13 = new Class267(this.anInterface12_4, 5126, 3, 0);
		this.aClass267_14 = new Class267(this.anInterface12_4, 5126, 2, 12);
		this.aClass97_1.method1937(this);
	}

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "(I)V")
	public void method4682() {
		if (this.anInt5962 != 0) {
			this.anInt5962 = 0;
			this.anInt5951 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLclient!uv;)V")
	public void method4683(@OriginalArg(1) Interface12 arg0) {
		if (this.anInterface12_5 != arg0) {
			if (this.aBoolean460) {
				OpenGL.glBindBufferARB(34962, arg0.method5236());
			}
			this.anInterface12_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!qg", name = "pa", descriptor = "(IIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5911 < arg2) {
			arg2 = this.anInt5911;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt5900 < arg3) {
			arg3 = this.anInt5900;
		}
		this.anInt5972 = arg1;
		this.anInt5973 = arg0;
		this.anInt5958 = arg2;
		this.anInt5966 = arg3;
		OpenGL.glEnable(3089);
		this.method4715();
		this.method4654();
	}

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "(ILclient!ea;II)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class34_Sub2 local6 = (Class34_Sub2) arg1;
		@Pc(9) Class21_Sub2_Sub1 local9 = local6.aClass21_Sub2_Sub1_2;
		this.method4674();
		this.method4681(local6.aClass21_Sub2_Sub1_2);
		this.method4700(1);
		this.method4709(8448, 7681);
		this.method4692(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat72 / (float) local9.anInt4204;
		@Pc(46) float local46 = local9.aFloat73 / (float) local9.anInt4202;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt5973 - arg2) * local39, local46 * (float) (this.anInt5972 - arg3));
		OpenGL.glVertex2i(this.anInt5973, this.anInt5972);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5973 - arg2), local46 * (float) (this.anInt5966 - arg3));
		OpenGL.glVertex2i(this.anInt5973, this.anInt5966);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5958 - arg2), local46 * (float) (this.anInt5966 - arg3));
		OpenGL.glVertex2i(this.anInt5958, this.anInt5966);
		OpenGL.glTexCoord2f((float) (this.anInt5958 - arg2) * local39, (float) (this.anInt5972 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5958, this.anInt5972);
		OpenGL.glEnd();
		this.method4692(0, 5890, 768);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!md;)V")
	@Override
	public void method4597(@OriginalArg(0) Class89 arg0) {
		this.aClass89_Sub1_1 = (Class89_Sub1) arg0;
	}

	@OriginalMember(owner = "client!qg", name = "C", descriptor = "()Z")
	@Override
	public boolean method4645() {
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "(I)V")
	private void method4685() {
		OpenGL.glViewport(this.anInt5974, this.anInt5978, this.anInt5911, this.anInt5900);
	}

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "()Lclient!ia;")
	@Override
	public Class43 method4588() {
		return this.aClass43_Sub2_1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
	@Override
	public void method4571(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "()Z")
	@Override
	public boolean method4581() {
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IJ)V")
	public synchronized void method4686(@OriginalArg(1) long arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong237 = arg0;
		this.aClass142_41.method3212(local7);
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(IIII)V")
	public void method4687(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)V")
	public void method4688(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		this.method4676(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class34 method4595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static278.method5795(arg0, arg1, this, arg2, arg3);
	}

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "()I")
	@Override
	public int g() {
		@Pc(6) int local6 = this.anInt5969;
		this.anInt5969 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "(B)V")
	public void method4689() {
		if (this.anInt5951 == 16) {
			return;
		}
		this.method4661();
		this.method4657(true);
		this.method4655(true);
		this.method4691(true);
		this.method4700(1);
		this.method4707(0);
		this.anInt5951 = 16;
	}

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "()Z")
	@Override
	public boolean method4635() {
		return this.aBoolean483 && (!this.method4613() || this.aBoolean462);
	}

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "()Lclient!ia;")
	@Override
	public Class43 method4592() {
		return new Class43_Sub2();
	}

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "(I)V")
	private void method4690() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass43_Sub2_4.method2483(), 0);
		if (this.aBoolean458) {
			this.aClass92_1.aClass76_Sub7_1.method5282();
		}
		this.method4729();
		this.method4668();
	}

	@OriginalMember(owner = "client!qg", name = "da", descriptor = "(IIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4697();
		this.method4700(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(BZ)V")
	public void method4691(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean478 != arg0) {
			this.aBoolean478 = arg0;
			this.method4694();
			this.anInt5951 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "()Z")
	@Override
	public boolean method4576() {
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(IIII)V")
	public void method4692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(IB)V")
	public synchronized void method4693(@OriginalArg(0) int arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong237 = arg0;
		this.aClass142_40.method3212(local7);
	}

	@OriginalMember(owner = "client!qg", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		this.method4700(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "(B)V")
	private void method4694() {
		OpenGL.glDepthMask(this.aBoolean478 && this.aBoolean463);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!ef;B)V")
	public void method4695(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt5939 < 0 || this.anInterface3Array1[this.anInt5939] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface3Array1[this.anInt5939--] = null;
		arg0.method308();
		if (this.anInt5939 < 0) {
			this.anInterface3_2 = null;
		} else {
			this.anInterface3_2 = this.anInterface3Array1[this.anInt5939];
			this.anInterface3_2.method309();
		}
	}

	@OriginalMember(owner = "client!qg", name = "ia", descriptor = "(III[I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass43_Sub2_4.aFloat47 * (float) arg2 + this.aClass43_Sub2_4.aFloat49 * (float) arg0 + this.aClass43_Sub2_4.aFloat42 * (float) arg1 + this.aClass43_Sub2_4.aFloat45;
		if (local28 < (float) this.anInt5968 || (float) this.anInt5956 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass43_Sub2_4.aFloat48 + (float) arg2 * this.aClass43_Sub2_4.aFloat44 + this.aClass43_Sub2_4.aFloat43 * (float) arg1 + (float) arg0 * this.aClass43_Sub2_4.aFloat50) * (float) this.anInt5948 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt5981 * (this.aClass43_Sub2_4.aFloat46 * (float) arg2 + this.aClass43_Sub2_4.aFloat41 * (float) arg0 + (float) arg1 * this.aClass43_Sub2_4.aFloat51 + this.aClass43_Sub2_4.aFloat40) / local28);
		if (this.aFloat96 <= (float) local85 && this.aFloat97 >= (float) local85 && this.aFloat94 <= (float) local117 && this.aFloat99 >= (float) local117) {
			arg3[1] = (int) ((float) local117 - this.aFloat94);
			arg3[0] = (int) ((float) local85 - this.aFloat96);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!gn;)V")
	@Override
	public void method4614(@OriginalArg(0) Class101 arg0) {
		this.aClass97_1.method1936(arg0, this);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!ht;I)V")
	public void method4696(@OriginalArg(0) Class43_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method2483(), 0);
	}

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "(I)V")
	private void method4697() {
		if (this.anInt5951 == 1) {
			return;
		}
		this.method4665();
		this.method4657(false);
		this.method4663(false);
		this.method4655(false);
		this.method4691(false);
		this.method4681(null);
		this.method4647(-2);
		this.method4707(1);
		this.anInt5951 = 1;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt5968;
	}

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "(I)V")
	@Override
	public void method4632(@OriginalArg(0) int arg0) {
		this.method4708();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!ef;I)V")
	public void method4698(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt5938 < 0 || arg0 != this.anInterface3Array2[this.anInt5938]) {
			throw new RuntimeException();
		}
		this.anInterface3Array2[this.anInt5938--] = null;
		arg0.method304();
		if (this.anInt5938 < 0) {
			this.anInterface3_1 = null;
		} else {
			this.anInterface3_1 = this.anInterface3Array2[this.anInt5938];
			this.anInterface3_1.method307();
		}
	}

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "()V")
	@Override
	public void method4619() {
		if (this.aClass1_Sub42_Sub1_1 != null && this.aClass1_Sub42_Sub1_1.method5573()) {
			this.aClass157_1.method3538(this.aClass1_Sub42_Sub1_1);
			this.aClass156_1.method3496();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class70 method4580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class70_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(BLclient!ef;)V")
	public void method4699(@OriginalArg(1) Interface3 arg0) {
		if (this.aBoolean472) {
			this.method4695(arg0);
			this.method4698(arg0);
		} else if (this.anInt5940 >= 0 && arg0 == this.anInterface3Array3[this.anInt5940]) {
			this.anInterface3Array3[this.anInt5940--] = null;
			arg0.method305();
			if (this.anInt5940 >= 0) {
				this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array3[this.anInt5940];
				this.anInterface3_2.method306();
			} else {
				this.anInterface3_2 = this.anInterface3_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "()V")
	@Override
	public void method4570() {
		this.aClass157_1.method3536();
	}

	@OriginalMember(owner = "client!qg", name = "Z", descriptor = "(IIII)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > this.anInt5973) {
			this.anInt5973 = arg0;
		}
		if (this.anInt5972 < arg1) {
			this.anInt5972 = arg1;
		}
		if (arg3 < this.anInt5966) {
			this.anInt5966 = arg3;
		}
		if (this.anInt5958 > arg2) {
			this.anInt5958 = arg2;
		}
		OpenGL.glEnable(3089);
		this.method4715();
		this.method4654();
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(IB)V")
	public void method4700(@OriginalArg(0) int arg0) {
		if (this.anInt5949 == arg0) {
			return;
		}
		@Pc(18) boolean local18;
		@Pc(16) byte local16;
		if (arg0 == 1) {
			local16 = 1;
			local18 = true;
		} else if (arg0 == 2) {
			local16 = 2;
			local18 = false;
		} else if (arg0 == 128) {
			local18 = true;
			local16 = 3;
		} else {
			local16 = 0;
			local18 = false;
		}
		if (!this.aBoolean475) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean475 = true;
		}
		if (local18 != this.aBoolean467) {
			if (local18) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean467 = local18;
		}
		if (this.anInt5961 != local16) {
			if (local16 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local16 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local16 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt5961 = local16;
		}
		this.anInt5949 = arg0;
		this.anInt5951 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(Lclient!ef;B)V")
	public void method4701(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt5938 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5938 >= 0) {
			this.anInterface3Array2[this.anInt5938].method304();
		}
		this.anInterface3_1 = this.anInterface3Array2[++this.anInt5938] = arg0;
		this.anInterface3_1.method307();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	@Override
	public void method4577(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "(I)V")
	public void method4703() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "(B)I")
	private int method4704() {
		this.bf = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString69 = OpenGL.glGetString(7937).toLowerCase();
		if (this.bf.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.bf.indexOf("brian paul") != -1 || this.bf.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(50) String local50 = OpenGL.glGetString(7938);
		@Pc(58) String[] local58 = Static71.method1050(' ', local50.replace('.', ' '));
		if (local58.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(74) int local74 = Static32.method455(local58[0]);
				@Pc(80) int local80 = Static32.method455(local58[1]);
				this.anInt5977 = local74 * 10 + local80;
			} catch (@Pc(90) NumberFormatException local90) {
				local10 |= 0x4;
			}
		}
		if (this.anInt5977 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(126) int[] local126 = new int[1];
		OpenGL.glGetIntegerv(34018, local126, 0);
		this.anInt5957 = local126[0];
		OpenGL.glGetIntegerv(34929, local126, 0);
		this.anInt5965 = local126[0];
		OpenGL.glGetIntegerv(34930, local126, 0);
		this.anInt5967 = local126[0];
		if (this.anInt5957 < 2 || this.anInt5965 < 2 || this.anInt5967 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean471 = NativeStream.b();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean460 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean483 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean459 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean482 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean465 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean468 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean484 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean480 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean469 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean461 = false;
		this.aBoolean466 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean472 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean470 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean462 = this.aBoolean470 & this.aBoolean472;
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!c;Lclient!gn;Lclient!ia;Lclient!sf;I)V")
	@Override
	public void method4574(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) Class36_Sub8 arg3) {
		arg0.method4167(arg2, arg3, 0);
		this.method4614(arg1);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FIFF)V")
	private void method4705(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean481) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean481 = true;
	}

	@OriginalMember(owner = "client!qg", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5981 = arg3;
		this.anInt5952 = arg1;
		this.anInt5948 = arg2;
		this.anInt5982 = arg0;
		this.method4716();
		this.method4715();
		if (this.anInt5962 == 3) {
			this.method4672();
		} else if (this.anInt5962 == 2) {
			this.method4723();
			return;
		}
	}

	@OriginalMember(owner = "client!qg", name = "NA", descriptor = "(IIIIII)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method4697();
		this.method4700(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean483) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean483) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
	public void method4706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5974 = arg1;
		this.anInt5978 = arg0;
		this.method4685();
		this.method4654();
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(II)V")
	public void method4707(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4709(7681, 7681);
		} else if (arg0 == 0) {
			this.method4709(8448, 8448);
		} else if (arg0 == 2) {
			this.method4709(7681, 34165);
		} else if (arg0 == 3) {
			this.method4709(8448, 260);
		} else if (arg0 == 4) {
			this.method4709(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "(I)V")
	private void method4708() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4616(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static27.aFloat5 = arg0;
		Static29.aFloat6 = arg1;
		Static288.aFloat80 = arg2;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(III)V")
	public void method4709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5976 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg1 != this.anInt5950) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt5950 = arg1;
			local11 = true;
		}
		if (this.anInt5944 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local11 = true;
			this.anInt5944 = arg0;
		}
		if (local11) {
			this.anInt5951 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "(I)V")
	private void method4710() {
		if (this.aBoolean476 && this.anInt5945 >= 0 | this.aBoolean458) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!qg", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5964 = arg0;
		this.anInt5960 = arg3;
		this.aBoolean458 = true;
		this.anInt5980 = arg1;
		this.anInt5946 = arg2;
		this.aClass92_1.method1804(false, 3, false);
		this.aClass92_1.aClass76_Sub7_1.method5282();
		this.method4671();
		this.method4710();
	}

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "()Z")
	@Override
	public boolean method4640() {
		return false;
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method4697();
		this.method4700(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean483) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean483) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "()Z")
	@Override
	public boolean method4610() {
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "(FF)V")
	@Override
	public void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat92 == arg0 && arg1 == this.aFloat106) {
			return;
		}
		this.aFloat92 = arg0;
		this.aFloat106 = arg1;
		this.method4650();
		if (this.anInt5962 == 3) {
			this.method4672();
		} else if (this.anInt5962 == 2) {
			this.method4723();
			return;
		}
	}

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "(B)V")
	private void method4711() {
		this.aClass43_Sub2_4 = new Class43_Sub2();
		this.aClass43_Sub2_3 = new Class43_Sub2();
		this.aClass21Array1 = new Class21[this.anInt5957];
		this.aClass21_Sub2_3 = new Class21_Sub2(this, 3553, 6408, 1, 1);
		this.aClass21_Sub2_5 = new Class21_Sub2(this, 3553, 6408, 1, 1);
		this.aClass21_Sub2_4 = new Class21_Sub2(this, 3553, 6408, 1, 1);
		this.aClass37_Sub2_4 = new Class37_Sub2(this);
		this.aClass37_Sub2_8 = new Class37_Sub2(this);
		this.aClass37_Sub2_3 = new Class37_Sub2(this);
		this.aClass37_Sub2_9 = new Class37_Sub2(this);
		this.aClass37_Sub2_7 = new Class37_Sub2(this);
		this.aClass37_Sub2_6 = new Class37_Sub2(this);
		this.aClass37_Sub2_2 = new Class37_Sub2(this);
		this.aClass37_Sub2_1 = new Class37_Sub2(this);
		this.aClass37_Sub2_5 = new Class37_Sub2(this);
		this.aClass37_Sub2_10 = new Class37_Sub2(this);
		if (this.aBoolean466) {
			this.aClass19_4 = new Class19(this);
			this.aClass19_5 = new Class19(this);
		}
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(IB)I")
	public int method4712(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "()V")
	@Override
	public void method4631() {
		if (!this.aBoolean477 || this.anInt5911 <= 0 || this.anInt5900 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt5973;
		@Pc(19) int local19 = this.anInt5958;
		@Pc(22) int local22 = this.anInt5972;
		@Pc(25) int local25 = this.anInt5966;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4682();
		this.method4657(false);
		this.method4663(false);
		this.method4655(false);
		this.method4691(false);
		this.method4681(null);
		this.method4647(-2);
		this.method4707(1);
		this.method4700(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt5911, this.anInt5900, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.pa(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFBF)V")
	public void method4713(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static10.aFloatArray44[3] = arg2;
		Static10.aFloatArray44[2] = arg0;
		Static10.aFloatArray44[1] = arg1;
		Static10.aFloatArray44[0] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static10.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4628(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas5 == arg0) {
			local5 = this.aLong169;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable2.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas6 == arg0) {
			this.method4720();
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "()I")
	@Override
	public int method4572() {
		return 4;
	}

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "()Z")
	@Override
	public boolean method4613() {
		return this.aClass1_Sub42_Sub1_1 != null && this.aClass1_Sub42_Sub1_1.method5573();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class78 method4627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class78_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qg", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4697();
		this.method4700(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4697();
		this.method4700(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)V")
	@Override
	public void method4596(@OriginalArg(0) boolean arg0) {
		this.aBoolean463 = arg0;
		this.method4694();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZII)V")
	public synchronized void method4714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub37 local8 = new Class1_Sub37(arg0);
		local8.aLong237 = arg1;
		this.aClass142_39.method3212(local8);
	}

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "()V")
	@Override
	public void method4621() {
		this.method4691(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "([I)V")
	@Override
	public void u(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5973;
		arg0[2] = this.anInt5958;
		arg0[1] = this.anInt5972;
		arg0[3] = this.anInt5966;
	}

	@OriginalMember(owner = "client!qg", name = "ua", descriptor = "(F)V")
	@Override
	public void ua(@OriginalArg(0) float arg0) {
		if (this.aFloat95 != arg0) {
			this.aFloat95 = arg0;
			this.method4670();
		}
	}

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "(I)V")
	private void method4715() {
		this.aFloat96 = this.anInt5973 - this.anInt5982;
		this.aFloat99 = this.anInt5966 - this.anInt5952;
		this.aFloat97 = this.anInt5958 - this.anInt5982;
		this.aFloat94 = this.anInt5972 - this.anInt5952;
	}

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "(I)V")
	private void method4716() {
		@Pc(6) float[] local6 = this.aFloatArray37;
		@Pc(26) float local26 = (float) (-this.anInt5982 * this.anInt5968) / (float) this.anInt5948;
		@Pc(41) float local41 = (float) ((this.anInt5911 - this.anInt5982) * this.anInt5968) / (float) this.anInt5948;
		@Pc(52) float local52 = (float) (this.anInt5968 * this.anInt5952) / (float) this.anInt5981;
		@Pc(67) float local67 = (float) (this.anInt5968 * (this.anInt5952 - this.anInt5900)) / (float) this.anInt5981;
		if (local41 == local26 || local67 == local52) {
			local6[13] = 0.0F;
			local6[12] = 0.0F;
			local6[2] = 0.0F;
			local6[5] = 1.0F;
			local6[9] = 0.0F;
			local6[6] = 0.0F;
			local6[3] = 0.0F;
			local6[14] = 0.0F;
			local6[11] = 0.0F;
			local6[10] = 1.0F;
			local6[0] = 1.0F;
			local6[1] = 0.0F;
			local6[4] = 0.0F;
			local6[7] = 0.0F;
			local6[8] = 0.0F;
			local6[15] = 1.0F;
		} else {
			@Pc(81) float local81 = (float) this.anInt5968 * 2.0F;
			local6[11] = -1.0F;
			local6[12] = 0.0F;
			local6[2] = 0.0F;
			local6[1] = 0.0F;
			local6[10] = this.aFloat101 = (float) -(this.anInt5968 + this.anInt5956) / (float) (this.anInt5956 - this.anInt5968);
			local6[6] = 0.0F;
			local6[9] = (local67 + local52) / (-local67 + local52);
			local6[3] = 0.0F;
			local6[0] = local81 / (local41 - local26);
			local6[14] = this.aFloat104 = -(local81 * (float) this.anInt5956) / (float) (this.anInt5956 - this.anInt5968);
			local6[7] = 0.0F;
			local6[4] = 0.0F;
			local6[5] = local81 / (local52 - local67);
			local6[13] = 0.0F;
			local6[15] = 0.0F;
			local6[8] = (local26 + local41) / (-local26 + local41);
		}
		this.method4650();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BII)V")
	public synchronized void method4717(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub37 local8 = new Class1_Sub37(arg1);
		local8.aLong237 = arg0;
		this.aClass142_36.method3212(local8);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)I")
	public int method4718(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!qg", name = "la", descriptor = "()F")
	@Override
	public float la() {
		return this.aFloat92;
	}

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "(I)V")
	private void method4719() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static366.method5214(1000L);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!sf;I)V")
	@Override
	public void method4585(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) Class36_Sub8[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method4167(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)Lclient!l;")
	@Override
	public Class1_Sub27 method4615() {
		@Pc(8) Class1_Sub27_Sub1 local8 = new Class1_Sub27_Sub1(78643200);
		this.aClass142_34.method3212(local8);
		return local8;
	}

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "()V")
	@Override
	public void method4602() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "(Z)V")
	private void method4720() {
		if (this.aCanvas6 == null) {
			this.anInt5851 = this.anInt5800 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas6.getSize();
			this.anInt5800 = local10.height;
			this.anInt5851 = local10.width;
		}
		if (this.anInterface3_1 == null) {
			this.anInt5900 = this.anInt5800;
			this.anInt5911 = this.anInt5851;
			this.method4685();
		}
		this.method4682();
		this.va();
	}

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "()V")
	@Override
	public void method4633() {
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLclient!ht;)V")
	public void method4721(@OriginalArg(1) Class43_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method2483(), 0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!ef;)V")
	public void method4722(@OriginalArg(1) Interface3 arg0) {
		if (this.anInt5939 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5939 >= 0) {
			this.anInterface3Array1[this.anInt5939].method308();
		}
		this.anInterface3_2 = this.anInterface3Array1[++this.anInt5939] = arg0;
		this.anInterface3_2.method309();
	}

	@OriginalMember(owner = "client!qg", name = "C", descriptor = "(I)V")
	private void method4723() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray37, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4625(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas5 == arg0) {
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

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!wt;Lclient!wt;Lclient!wt;ILclient!wt;)V")
	public void method4724(@OriginalArg(0) Class267 arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class267 arg2, @OriginalArg(4) Class267 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method4683(arg0.anInterface12_7);
			OpenGL.glVertexPointer(arg0.aByte103, arg0.aShort108, this.anInterface12_5.method5234(), this.anInterface12_5.method5233() + (long) arg0.aByte104);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method4683(arg1.anInterface12_7);
			OpenGL.glNormalPointer(arg1.aShort108, this.anInterface12_5.method5234(), this.anInterface12_5.method5233() + (long) arg1.aByte104);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method4683(arg3.anInterface12_7);
			OpenGL.glColorPointer(arg3.aByte103, arg3.aShort108, this.anInterface12_5.method5234(), this.anInterface12_5.method5233() + (long) arg3.aByte104);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method4683(arg2.anInterface12_7);
			OpenGL.glTexCoordPointer(arg2.aByte103, arg2.aShort108, this.anInterface12_5.method5234(), this.anInterface12_5.method5233() + (long) arg2.aByte104);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!ce;III)V")
	public void method4725(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg1.method5944();
		@Pc(16) int local16 = arg2 * this.method4718(local9);
		this.method4667(arg1);
		OpenGL.glDrawElements(4, arg0, local9, arg1.method5943() + (long) local16);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method4603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class34 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class34_Sub2 local6 = (Class34_Sub2) arg5;
		@Pc(9) Class21_Sub2_Sub1 local9 = local6.aClass21_Sub2_Sub1_2;
		this.method4674();
		this.method4681(local6.aClass21_Sub2_Sub1_2);
		this.method4700(1);
		this.method4709(8448, 7681);
		this.method4692(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat72 / (float) local9.anInt4204;
		@Pc(46) float local46 = local9.aFloat73 / (float) local9.anInt4202;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method4692(0, 5890, 768);
	}

	@OriginalMember(owner = "client!qg", name = "IA", descriptor = "(IIII)[I")
	@Override
	public int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt5900 - local12 - arg1, arg2, 1, 32993, this.anInt5963, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!qg", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		this.anInt5936 = 0;
		while (arg0 > 1) {
			this.anInt5936++;
			arg0 >>= 0x1;
		}
		this.anInt5937 = 0x1 << this.anInt5936;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4599(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas5) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!qg", name = "aa", descriptor = "(IIIIII[BII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(53) float local53;
		if (this.aClass21_Sub2_Sub1_3 == null || this.aClass21_Sub2_Sub1_3.anInt4199 < arg2 || arg3 > this.aClass21_Sub2_Sub1_3.anInt4198) {
			this.aClass21_Sub2_Sub1_3 = Static301.method4106(this, arg3, arg2, arg6);
			this.aClass21_Sub2_Sub1_3.method3487(false, false);
			local53 = this.aClass21_Sub2_Sub1_3.aFloat72;
			local41 = this.aClass21_Sub2_Sub1_3.aFloat73;
		} else {
			this.aClass21_Sub2_Sub1_3.method3486(false, arg6, 6406, arg3, arg2);
			local41 = this.aClass21_Sub2_Sub1_3.aFloat73 * (float) arg3 / (float) this.aClass21_Sub2_Sub1_3.anInt4198;
			local53 = this.aClass21_Sub2_Sub1_3.aFloat72 * (float) arg2 / (float) this.aClass21_Sub2_Sub1_3.anInt4199;
		}
		this.method4674();
		this.method4681(this.aClass21_Sub2_Sub1_3);
		this.method4700(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4648(arg5);
		this.method4709(34165, 34165);
		this.method4692(0, 34166, 768);
		this.method4692(2, 5890, 770);
		this.method4673(0, 34166);
		this.method4673(2, 5890);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = local143 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(158) float local158 = (float) arg3 + local146;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local53);
		OpenGL.glVertex2f(local143, local158);
		OpenGL.glTexCoord2f(local41, local53);
		OpenGL.glVertex2f(local151, local158);
		OpenGL.glTexCoord2f(local41, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method4692(0, 5890, 768);
		this.method4692(2, 34166, 770);
		this.method4673(0, 5890);
		this.method4673(2, 34166);
	}

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "()Z")
	@Override
	public boolean method4607() {
		return this.aClass92_1.method1808();
	}

	@OriginalMember(owner = "client!qg", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean458) {
			throw new RuntimeException("");
		}
		this.anInt5960 = arg3;
		this.anInt5980 = arg1;
		this.anInt5964 = arg0;
		this.anInt5946 = arg2;
		this.aClass92_1.aClass76_Sub7_1.method5282();
		this.method4671();
	}

	@OriginalMember(owner = "client!qg", name = "D", descriptor = "(I)V")
	private void method4727() {
		if (this.aBoolean474 && !this.aBoolean479) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(IIIIII)Lclient!md;")
	@Override
	public Class89 method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean480 ? new Class89_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "()Z")
	@Override
	public boolean method4630() {
		if (this.aClass1_Sub42_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass1_Sub42_Sub1_1.method5573()) {
			if (!this.aClass157_1.method3535(this.aClass1_Sub42_Sub1_1)) {
				return false;
			}
			this.aClass156_1.method3496();
		}
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)I")
	@Override
	public int method4643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "(Z)Lclient!nm;")
	public Class21_Sub4 method4728() {
		return this.aClass89_Sub1_1 == null ? null : this.aClass89_Sub1_1.method3813();
	}

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "()Z")
	@Override
	public boolean method4605() {
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4579(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class1_Sub37 local19;
		while (!this.aClass142_36.method3210()) {
			local19 = (Class1_Sub37) this.aClass142_36.method3196();
			Static266.anIntArray561[local11++] = (int) local19.aLong237;
			this.anInt5941 -= local19.anInt6451;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static266.anIntArray561, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static266.anIntArray561, 0);
			local11 = 0;
		}
		while (!this.aClass142_37.method3210()) {
			local19 = (Class1_Sub37) this.aClass142_37.method3196();
			Static266.anIntArray561[local11++] = (int) local19.aLong237;
			this.anInt5942 -= local19.anInt6451;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static266.anIntArray561, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static266.anIntArray561, 0);
			local11 = 0;
		}
		while (!this.aClass142_38.method3210()) {
			local19 = (Class1_Sub37) this.aClass142_38.method3196();
			Static266.anIntArray561[local11++] = local19.anInt6451;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static266.anIntArray561, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static266.anIntArray561, 0);
			local11 = 0;
		}
		while (!this.aClass142_39.method3210()) {
			local19 = (Class1_Sub37) this.aClass142_39.method3196();
			Static266.anIntArray561[local11++] = (int) local19.aLong237;
			this.anInt5943 -= local19.anInt6451;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static266.anIntArray561, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static266.anIntArray561, 0);
		}
		while (!this.aClass142_35.method3210()) {
			local19 = (Class1_Sub37) this.aClass142_35.method3196();
			OpenGL.glDeleteLists((int) local19.aLong237, local19.anInt6451);
		}
		@Pc(218) Class1 local218;
		while (!this.aClass142_40.method3210()) {
			local218 = this.aClass142_40.method3196();
			OpenGL.glDeleteProgramARB((int) local218.aLong237);
		}
		while (!this.aClass142_41.method3210()) {
			local218 = this.aClass142_41.method3196();
			OpenGL.glDeleteObjectARB(local218.aLong237);
		}
		while (!this.aClass142_35.method3210()) {
			local19 = (Class1_Sub37) this.aClass142_35.method3196();
			OpenGL.glDeleteLists((int) local19.aLong237, local19.anInt6451);
		}
		this.aClass156_1.method3494();
		if (this.FA() > 100663296 && Static107.method1707() > this.aLong170 + 60000L) {
			System.gc();
			this.aLong170 = Static107.method1707();
		}
		this.anInt5935 = local9;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!md;Lclient!md;FLclient!md;)Lclient!md;")
	@Override
	public Class89 method4637(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class89 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean480 && this.aBoolean466 && this.aBoolean472) {
			@Pc(18) Class89_Sub1_Sub1 local18 = null;
			@Pc(21) Class89_Sub1 local21 = (Class89_Sub1) arg0;
			@Pc(24) Class89_Sub1 local24 = (Class89_Sub1) arg1;
			@Pc(28) Class21_Sub4 local28 = local21.method3813();
			@Pc(32) Class21_Sub4 local32 = local24.method3813();
			if (local28 != null && local32 != null) {
				@Pc(47) int local47 = local28.anInt4566 > local32.anInt4566 ? local28.anInt4566 : local32.anInt4566;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class89_Sub1_Sub1) {
					@Pc(59) Class89_Sub1_Sub1 local59 = (Class89_Sub1_Sub1) arg3;
					if (local47 == local59.method1796()) {
						local18 = local59;
					}
				}
				if (local18 == null) {
					local18 = new Class89_Sub1_Sub1(this, local47);
				}
				if (local18.method1795(local32, arg2, local28)) {
					return local18;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([Lclient!c;Lclient!gn;Lclient!ia;[Lclient!sf;I)V")
	@Override
	public void method4593(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) Class36_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method4585(arg0, arg2, arg3, arg4);
		this.method4614(arg1);
	}

	@OriginalMember(owner = "client!qg", name = "E", descriptor = "(I)V")
	public void method4729() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray36, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray38, 0);
	}

	@OriginalMember(owner = "client!qg", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		@Pc(6) int local6 = this.anInt5971;
		this.anInt5971 = 0;
		return local6;
	}
}
