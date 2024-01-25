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

@OriginalClass("client!pc")
public final class Class33_Sub3 extends Class33 {

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
	private int anInt7084;

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
	public int anInt7088;

	@OriginalMember(owner = "client!pc", name = "pc", descriptor = "I")
	public int anInt7157;

	@OriginalMember(owner = "client!pc", name = "Pd", descriptor = "I")
	private int anInt7233;

	@OriginalMember(owner = "client!pc", name = "Ce", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!pc", name = "De", descriptor = "I")
	public int anInt7264;

	@OriginalMember(owner = "client!pc", name = "Ie", descriptor = "Lclient!vda;")
	private Class371 aClass371_6;

	@OriginalMember(owner = "client!pc", name = "Je", descriptor = "Lclient!kv;")
	private Class17_Sub3 aClass17_Sub3_1;

	@OriginalMember(owner = "client!pc", name = "Ne", descriptor = "Lclient!ve;")
	private Interface24 anInterface24_1;

	@OriginalMember(owner = "client!pc", name = "Oe", descriptor = "Lclient!ve;")
	private Interface24 anInterface24_2;

	@OriginalMember(owner = "client!pc", name = "Se", descriptor = "I")
	public int anInt7269;

	@OriginalMember(owner = "client!pc", name = "Te", descriptor = "I")
	public int anInt7270;

	@OriginalMember(owner = "client!pc", name = "Ue", descriptor = "I")
	private int anInt7271;

	@OriginalMember(owner = "client!pc", name = "cf", descriptor = "Z")
	private boolean aBoolean549;

	@OriginalMember(owner = "client!pc", name = "df", descriptor = "I")
	private int anInt7272;

	@OriginalMember(owner = "client!pc", name = "ef", descriptor = "I")
	private int anInt7273;

	@OriginalMember(owner = "client!pc", name = "gf", descriptor = "I")
	private int anInt7274;

	@OriginalMember(owner = "client!pc", name = "hf", descriptor = "Z")
	private boolean aBoolean550;

	@OriginalMember(owner = "client!pc", name = "jf", descriptor = "Z")
	private boolean aBoolean551;

	@OriginalMember(owner = "client!pc", name = "kf", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "client!pc", name = "lf", descriptor = "Z")
	private boolean aBoolean552;

	@OriginalMember(owner = "client!pc", name = "pf", descriptor = "Lclient!df;")
	public Class62_Sub1 aClass62_Sub1_1;

	@OriginalMember(owner = "client!pc", name = "qf", descriptor = "I")
	private int anInt7275;

	@OriginalMember(owner = "client!pc", name = "sf", descriptor = "Lclient!ld;")
	public Class116_Sub2 aClass116_Sub2_5;

	@OriginalMember(owner = "client!pc", name = "tf", descriptor = "Lclient!sf;")
	public Class327 aClass327_14;

	@OriginalMember(owner = "client!pc", name = "uf", descriptor = "Z")
	public boolean aBoolean554;

	@OriginalMember(owner = "client!pc", name = "xf", descriptor = "Lclient!bia;")
	private Interface5 anInterface5_4;

	@OriginalMember(owner = "client!pc", name = "yf", descriptor = "Z")
	public boolean aBoolean555;

	@OriginalMember(owner = "client!pc", name = "zf", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!pc", name = "Af", descriptor = "Z")
	public boolean aBoolean556;

	@OriginalMember(owner = "client!pc", name = "Df", descriptor = "Lclient!df;")
	public Class62_Sub1 aClass62_Sub1_2;

	@OriginalMember(owner = "client!pc", name = "If", descriptor = "Lclient!df;")
	public Class62_Sub1 aClass62_Sub1_3;

	@OriginalMember(owner = "client!pc", name = "Kf", descriptor = "I")
	public int anInt7282;

	@OriginalMember(owner = "client!pc", name = "Lf", descriptor = "I")
	public int anInt7283;

	@OriginalMember(owner = "client!pc", name = "Mf", descriptor = "F")
	private float aFloat165;

	@OriginalMember(owner = "client!pc", name = "Nf", descriptor = "I")
	private int anInt7284;

	@OriginalMember(owner = "client!pc", name = "Qf", descriptor = "I")
	private int anInt7286;

	@OriginalMember(owner = "client!pc", name = "Sf", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!pc", name = "Vf", descriptor = "Z")
	public boolean aBoolean560;

	@OriginalMember(owner = "client!pc", name = "Xf", descriptor = "I")
	public int anInt7288;

	@OriginalMember(owner = "client!pc", name = "Yf", descriptor = "I")
	public int anInt7289;

	@OriginalMember(owner = "client!pc", name = "cg", descriptor = "I")
	private int anInt7292;

	@OriginalMember(owner = "client!pc", name = "eg", descriptor = "I")
	private int anInt7293;

	@OriginalMember(owner = "client!pc", name = "gg", descriptor = "F")
	private float aFloat169;

	@OriginalMember(owner = "client!pc", name = "jg", descriptor = "Lclient!df;")
	public Class62_Sub1 aClass62_Sub1_4;

	@OriginalMember(owner = "client!pc", name = "kg", descriptor = "I")
	private int anInt7296;

	@OriginalMember(owner = "client!pc", name = "og", descriptor = "Z")
	private boolean aBoolean561;

	@OriginalMember(owner = "client!pc", name = "pg", descriptor = "Z")
	private boolean aBoolean562;

	@OriginalMember(owner = "client!pc", name = "qg", descriptor = "Ljava/lang/String;")
	private String aString85;

	@OriginalMember(owner = "client!pc", name = "rg", descriptor = "Lclient!sf;")
	public Class327 aClass327_15;

	@OriginalMember(owner = "client!pc", name = "tg", descriptor = "Ljava/lang/String;")
	private String aString86;

	@OriginalMember(owner = "client!pc", name = "vg", descriptor = "Lclient!df;")
	public Class62_Sub1 aClass62_Sub1_5;

	@OriginalMember(owner = "client!pc", name = "wg", descriptor = "Lclient!rha;")
	private Class68_Sub2 aClass68_Sub2_1;

	@OriginalMember(owner = "client!pc", name = "zg", descriptor = "Z")
	private boolean aBoolean563;

	@OriginalMember(owner = "client!pc", name = "Ag", descriptor = "Lclient!df;")
	public Class62_Sub1 aClass62_Sub1_6;

	@OriginalMember(owner = "client!pc", name = "Bg", descriptor = "Lclient!df;")
	public Class62_Sub1 aClass62_Sub1_7;

	@OriginalMember(owner = "client!pc", name = "Cg", descriptor = "Lclient!vda;")
	public Class371 aClass371_7;

	@OriginalMember(owner = "client!pc", name = "Dg", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!pc", name = "Gg", descriptor = "Lclient!en;")
	private Interface11 anInterface11_5;

	@OriginalMember(owner = "client!pc", name = "Hg", descriptor = "Z")
	public boolean aBoolean565;

	@OriginalMember(owner = "client!pc", name = "Kg", descriptor = "Z")
	private boolean aBoolean566;

	@OriginalMember(owner = "client!pc", name = "Mg", descriptor = "Lclient!df;")
	public Class62_Sub1 aClass62_Sub1_8;

	@OriginalMember(owner = "client!pc", name = "Ng", descriptor = "[Lclient!fha;")
	private Class116[] aClass116Array1;

	@OriginalMember(owner = "client!pc", name = "Og", descriptor = "Lclient!qt;")
	private Class116_Sub2_Sub1 aClass116_Sub2_Sub1_4;

	@OriginalMember(owner = "client!pc", name = "Sg", descriptor = "Z")
	public boolean aBoolean570;

	@OriginalMember(owner = "client!pc", name = "Ug", descriptor = "Z")
	public boolean aBoolean571;

	@OriginalMember(owner = "client!pc", name = "Wg", descriptor = "Z")
	private boolean aBoolean572;

	@OriginalMember(owner = "client!pc", name = "Xg", descriptor = "Z")
	private boolean aBoolean573;

	@OriginalMember(owner = "client!pc", name = "Yg", descriptor = "F")
	public float aFloat176;

	@OriginalMember(owner = "client!pc", name = "Zg", descriptor = "Z")
	public boolean aBoolean574;

	@OriginalMember(owner = "client!pc", name = "ah", descriptor = "Lclient!df;")
	public Class62_Sub1 aClass62_Sub1_9;

	@OriginalMember(owner = "client!pc", name = "bh", descriptor = "F")
	public float aFloat177;

	@OriginalMember(owner = "client!pc", name = "ch", descriptor = "F")
	public float aFloat178;

	@OriginalMember(owner = "client!pc", name = "gh", descriptor = "Z")
	public boolean aBoolean575;

	@OriginalMember(owner = "client!pc", name = "hh", descriptor = "I")
	private int anInt7306;

	@OriginalMember(owner = "client!pc", name = "jh", descriptor = "Lclient!df;")
	public Class62_Sub1 aClass62_Sub1_10;

	@OriginalMember(owner = "client!pc", name = "mh", descriptor = "Z")
	public boolean aBoolean577;

	@OriginalMember(owner = "client!pc", name = "nh", descriptor = "Z")
	private boolean aBoolean578;

	@OriginalMember(owner = "client!pc", name = "ph", descriptor = "I")
	private int anInt7307;

	@OriginalMember(owner = "client!pc", name = "qh", descriptor = "Lclient!en;")
	private Interface11 anInterface11_6;

	@OriginalMember(owner = "client!pc", name = "th", descriptor = "F")
	private float aFloat182;

	@OriginalMember(owner = "client!pc", name = "xh", descriptor = "I")
	private int anInt7309;

	@OriginalMember(owner = "client!pc", name = "Ah", descriptor = "I")
	private int anInt7310;

	@OriginalMember(owner = "client!pc", name = "Yb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!pc", name = "oe", descriptor = "I")
	public int anInt7256 = 128;

	@OriginalMember(owner = "client!pc", name = "se", descriptor = "Lclient!ia;")
	private final Class159 aClass159_1 = new Class159();

	@OriginalMember(owner = "client!pc", name = "ze", descriptor = "Lclient!hea;")
	private final Class92_Sub2 aClass92_Sub2_1 = new Class92_Sub2();

	@OriginalMember(owner = "client!pc", name = "Ae", descriptor = "Lclient!hea;")
	public final Class92_Sub2 aClass92_Sub2_2 = new Class92_Sub2();

	@OriginalMember(owner = "client!pc", name = "Ee", descriptor = "I")
	public int anInt7265 = 3;

	@OriginalMember(owner = "client!pc", name = "Be", descriptor = "I")
	public int anInt7263 = 8;

	@OriginalMember(owner = "client!pc", name = "He", descriptor = "Z")
	private boolean aBoolean548 = false;

	@OriginalMember(owner = "client!pc", name = "Ge", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_50 = new Class163();

	@OriginalMember(owner = "client!pc", name = "Ke", descriptor = "[Lclient!ve;")
	private final Interface24[] anInterface24Array1 = new Interface24[4];

	@OriginalMember(owner = "client!pc", name = "Qe", descriptor = "[Lclient!ve;")
	private final Interface24[] anInterface24Array3 = new Interface24[4];

	@OriginalMember(owner = "client!pc", name = "Le", descriptor = "[Lclient!ve;")
	private final Interface24[] anInterface24Array2 = new Interface24[4];

	@OriginalMember(owner = "client!pc", name = "Pe", descriptor = "I")
	private int anInt7267 = -1;

	@OriginalMember(owner = "client!pc", name = "Me", descriptor = "I")
	private int anInt7266 = -1;

	@OriginalMember(owner = "client!pc", name = "Re", descriptor = "I")
	private int anInt7268 = -1;

	@OriginalMember(owner = "client!pc", name = "Ve", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_51;

	@OriginalMember(owner = "client!pc", name = "We", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_52;

	@OriginalMember(owner = "client!pc", name = "Xe", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_53;

	@OriginalMember(owner = "client!pc", name = "Ye", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_54;

	@OriginalMember(owner = "client!pc", name = "Ze", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_55;

	@OriginalMember(owner = "client!pc", name = "af", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_56;

	@OriginalMember(owner = "client!pc", name = "bf", descriptor = "Lclient!ifa;")
	private final Class163 bf;

	@OriginalMember(owner = "client!pc", name = "ff", descriptor = "Lclient!hea;")
	public final Class92_Sub2 aClass92_Sub2_3;

	@OriginalMember(owner = "client!pc", name = "mf", descriptor = "Lclient!hea;")
	public final Class92_Sub2 aClass92_Sub2_4;

	@OriginalMember(owner = "client!pc", name = "nf", descriptor = "Lclient!hea;")
	public final Class92_Sub2 aClass92_Sub2_5;

	@OriginalMember(owner = "client!pc", name = "Hf", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!pc", name = "bg", descriptor = "I")
	public int anInt7291;

	@OriginalMember(owner = "client!pc", name = "rf", descriptor = "I")
	private int anInt7276;

	@OriginalMember(owner = "client!pc", name = "lg", descriptor = "[F")
	private final float[] aFloatArray52;

	@OriginalMember(owner = "client!pc", name = "wf", descriptor = "I")
	private int anInt7278;

	@OriginalMember(owner = "client!pc", name = "mg", descriptor = "I")
	public int anInt7297;

	@OriginalMember(owner = "client!pc", name = "of", descriptor = "Z")
	private boolean aBoolean553;

	@OriginalMember(owner = "client!pc", name = "Wf", descriptor = "[F")
	private final float[] aFloatArray50;

	@OriginalMember(owner = "client!pc", name = "ng", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!pc", name = "ag", descriptor = "I")
	public int anInt7290;

	@OriginalMember(owner = "client!pc", name = "Cf", descriptor = "I")
	public int anInt7280;

	@OriginalMember(owner = "client!pc", name = "xg", descriptor = "I")
	private int anInt7299;

	@OriginalMember(owner = "client!pc", name = "sg", descriptor = "I")
	private int anInt7298;

	@OriginalMember(owner = "client!pc", name = "Ig", descriptor = "I")
	public int anInt7301;

	@OriginalMember(owner = "client!pc", name = "Fg", descriptor = "Z")
	private boolean aBoolean564;

	@OriginalMember(owner = "client!pc", name = "Gf", descriptor = "F")
	private float aFloat163;

	@OriginalMember(owner = "client!pc", name = "vf", descriptor = "I")
	public int anInt7277;

	@OriginalMember(owner = "client!pc", name = "Bf", descriptor = "I")
	private int anInt7279;

	@OriginalMember(owner = "client!pc", name = "Pf", descriptor = "I")
	private int anInt7285;

	@OriginalMember(owner = "client!pc", name = "Lg", descriptor = "[F")
	private final float[] aFloatArray53;

	@OriginalMember(owner = "client!pc", name = "Eg", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!pc", name = "yg", descriptor = "I")
	public int anInt7300;

	@OriginalMember(owner = "client!pc", name = "Of", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!pc", name = "ig", descriptor = "I")
	private int anInt7295;

	@OriginalMember(owner = "client!pc", name = "hg", descriptor = "F")
	private float aFloat170;

	@OriginalMember(owner = "client!pc", name = "ug", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!pc", name = "Tg", descriptor = "F")
	private float aFloat175;

	@OriginalMember(owner = "client!pc", name = "Vg", descriptor = "I")
	public int anInt7303;

	@OriginalMember(owner = "client!pc", name = "Zf", descriptor = "[F")
	private final float[] aFloatArray51;

	@OriginalMember(owner = "client!pc", name = "fh", descriptor = "F")
	public float aFloat179;

	@OriginalMember(owner = "client!pc", name = "Jg", descriptor = "I")
	private int anInt7302;

	@OriginalMember(owner = "client!pc", name = "fg", descriptor = "I")
	public int anInt7294;

	@OriginalMember(owner = "client!pc", name = "eh", descriptor = "I")
	public int anInt7305;

	@OriginalMember(owner = "client!pc", name = "Rf", descriptor = "I")
	private int anInt7287;

	@OriginalMember(owner = "client!pc", name = "oh", descriptor = "[Lclient!kp;")
	private final Class4_Sub29[] aClass4_Sub29Array5;

	@OriginalMember(owner = "client!pc", name = "rh", descriptor = "[F")
	public final float[] aFloatArray54;

	@OriginalMember(owner = "client!pc", name = "kh", descriptor = "F")
	public float aFloat180;

	@OriginalMember(owner = "client!pc", name = "lh", descriptor = "F")
	private float aFloat181;

	@OriginalMember(owner = "client!pc", name = "dh", descriptor = "I")
	public int anInt7304;

	@OriginalMember(owner = "client!pc", name = "uh", descriptor = "I")
	private int anInt7308;

	@OriginalMember(owner = "client!pc", name = "dg", descriptor = "F")
	private float aFloat168;

	@OriginalMember(owner = "client!pc", name = "Ff", descriptor = "Lclient!wja;")
	public Class4_Sub11_Sub2 aClass4_Sub11_Sub2_3;

	@OriginalMember(owner = "client!pc", name = "vh", descriptor = "[I")
	public int[] anIntArray489;

	@OriginalMember(owner = "client!pc", name = "wh", descriptor = "[I")
	public int[] anIntArray490;

	@OriginalMember(owner = "client!pc", name = "yh", descriptor = "[I")
	public int[] anIntArray491;

	@OriginalMember(owner = "client!pc", name = "zh", descriptor = "[B")
	public final byte[] aByteArray68;

	@OriginalMember(owner = "client!pc", name = "S", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas9;

	@OriginalMember(owner = "client!pc", name = "Kd", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!pc", name = "xe", descriptor = "I")
	public final int anInt7261;

	@OriginalMember(owner = "client!pc", name = "cb", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "J")
	private final long aLong209;

	@OriginalMember(owner = "client!pc", name = "vb", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "client!pc", name = "Ef", descriptor = "I")
	public final int anInt7281;

	@OriginalMember(owner = "client!pc", name = "ih", descriptor = "Z")
	private boolean aBoolean576;

	@OriginalMember(owner = "client!pc", name = "Tf", descriptor = "Z")
	public boolean aBoolean558;

	@OriginalMember(owner = "client!pc", name = "Jf", descriptor = "Z")
	public boolean aBoolean557;

	@OriginalMember(owner = "client!pc", name = "Qg", descriptor = "Z")
	public boolean aBoolean568;

	@OriginalMember(owner = "client!pc", name = "Rg", descriptor = "Z")
	public boolean aBoolean569;

	@OriginalMember(owner = "client!pc", name = "Uf", descriptor = "Z")
	private boolean aBoolean559;

	@OriginalMember(owner = "client!pc", name = "Pg", descriptor = "Z")
	public boolean aBoolean567;

	@OriginalMember(owner = "client!pc", name = "sh", descriptor = "Z")
	private final boolean aBoolean579;

	@OriginalMember(owner = "client!pc", name = "me", descriptor = "Lclient!bp;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!pc", name = "Fe", descriptor = "Lclient!q;")
	public final Class295 aClass295_1;

	@OriginalMember(owner = "client!pc", name = "pe", descriptor = "Lclient!kj;")
	private final Class193 aClass193_1;

	@OriginalMember(owner = "client!pc", name = "qe", descriptor = "Lclient!fka;")
	private Class4_Sub18_Sub1 aClass4_Sub18_Sub1_1;

	@OriginalMember(owner = "client!pc", name = "ve", descriptor = "Lclient!lr;")
	private final Class219 aClass219_1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class33_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class367();
		new Class66(16);
		this.aClass163_51 = new Class163();
		this.aClass163_52 = new Class163();
		this.aClass163_53 = new Class163();
		this.aClass163_54 = new Class163();
		this.aClass163_55 = new Class163();
		this.aClass163_56 = new Class163();
		this.bf = new Class163();
		this.aClass92_Sub2_3 = new Class92_Sub2();
		this.aClass92_Sub2_4 = new Class92_Sub2();
		this.aClass92_Sub2_5 = new Class92_Sub2();
		this.aFloat164 = 1.0F;
		this.anInt7291 = 0;
		this.anInt7276 = 8448;
		this.aFloatArray52 = new float[4];
		this.anInt7278 = 8448;
		this.anInt7297 = 0;
		this.aBoolean553 = false;
		this.aFloatArray50 = new float[4];
		this.aFloat171 = 1.0F;
		this.anInt7290 = 0;
		this.anInt7280 = 512;
		this.anInt7299 = -1;
		this.anInt7298 = 3584;
		this.anInt7301 = -1;
		this.aBoolean564 = true;
		this.aFloat163 = 1.0F;
		this.anInt7277 = 0;
		this.anInt7279 = 0;
		this.anInt7285 = 0;
		this.aFloatArray53 = new float[16];
		this.aFloat174 = -1.0F;
		this.anInt7300 = 50;
		this.aFloat166 = -1.0F;
		this.anInt7295 = 0;
		this.aFloat170 = 0.0F;
		this.aFloat172 = 3584.0F;
		this.aFloat175 = -1.0F;
		this.anInt7303 = -1;
		this.aFloatArray51 = new float[4];
		this.aFloat179 = 1.0F;
		this.anInt7302 = 0;
		this.anInt7294 = -1;
		this.anInt7305 = -1;
		this.anInt7287 = 0;
		this.aClass4_Sub29Array5 = new Class4_Sub29[Static43.anInt881];
		this.aFloatArray54 = new float[4];
		this.aFloat180 = 3584.0F;
		this.aFloat181 = 1.0F;
		this.anInt7304 = 512;
		this.anInt7308 = 0;
		this.aFloat168 = -1.0F;
		this.aClass4_Sub11_Sub2_3 = new Class4_Sub11_Sub2(8192);
		this.anIntArray489 = new int[1];
		this.anIntArray490 = new int[1];
		this.anIntArray491 = new int[1];
		this.aByteArray68 = new byte[16384];
		this.aCanvas10 = this.aCanvas9 = arg0;
		this.anInt7261 = arg2;
		if (!Static678.method8984("jaclib")) {
			throw new RuntimeException("");
		} else if (Static678.method8984("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong210 = this.aLong209 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt7261);
				if (this.aLong209 == 0L) {
					throw new RuntimeException("");
				}
				this.method6374();
				@Pc(333) int local333 = this.method6299();
				if (local333 != 0) {
					throw new RuntimeException("");
				}
				this.anInt7281 = this.aBoolean555 ? 33639 : 5121;
				if (this.aString86.indexOf("radeon") != -1) {
					@Pc(357) int local357 = 0;
					@Pc(359) boolean local359 = false;
					@Pc(361) boolean local361 = false;
					@Pc(370) String[] local370 = Static189.method2958(' ', this.aString86.replace('/', ' '));
					for (@Pc(372) int local372 = 0; local372 < local370.length; local372++) {
						@Pc(378) String local378 = local370[local372];
						try {
							if (local378.length() > 0) {
								if (local378.charAt(0) == 'x' && local378.length() >= 3 && Static509.method6933(local378.substring(1, 3))) {
									local378 = local378.substring(1);
									local361 = true;
								}
								if (local378.equals("hd")) {
									local359 = true;
								} else {
									if (local378.startsWith("hd")) {
										local378 = local378.substring(2);
										local359 = true;
									}
									if (local378.length() >= 4 && Static509.method6933(local378.substring(0, 4))) {
										local357 = Static613.method8035(local378.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(443) Exception local443) {
						}
					}
					if (!local361 && !local359) {
						if (local357 >= 7000 && local357 <= 7999) {
							this.aBoolean576 = false;
						}
						if (local357 >= 7000 && local357 <= 9250) {
							this.aBoolean558 = false;
						}
					}
					if (!local359 || local357 < 4000) {
						this.aBoolean557 = false;
					}
					this.aBoolean568 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean569 = true;
					this.aBoolean559 = this.aBoolean576;
				}
				if (this.aString85.indexOf("intel") != -1) {
					this.aBoolean567 = false;
				}
				this.aBoolean579 = !this.aString85.equals("s3 graphics");
				if (this.aBoolean576) {
					try {
						@Pc(531) int[] local531 = new int[1];
						OpenGL.glGenBuffersARB(1, local531, 0);
					} catch (@Pc(537) Throwable local537) {
						throw new RuntimeException("");
					}
				}
				Static650.method8679(false, true);
				this.aBoolean548 = true;
				this.aClass30_1 = new Class30(this, super.anInterface9_12);
				this.method6302();
				this.aClass295_1 = new Class295(this);
				this.aClass193_1 = new Class193(this);
				if (this.aClass193_1.method4353()) {
					this.aClass4_Sub18_Sub1_1 = new Class4_Sub18_Sub1(this);
					if (!this.aClass4_Sub18_Sub1_1.method2783()) {
						this.aClass4_Sub18_Sub1_1.method2782();
						this.aClass4_Sub18_Sub1_1 = null;
					}
				}
				this.aClass219_1 = new Class219(this);
				this.method6325();
				this.method6326();
				this.method8093();
			} catch (@Pc(611) Throwable local611) {
				local611.printStackTrace();
				this.method8126();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(BI)V")
	public void method6292(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt7274) {
			return;
		}
		@Pc(22) boolean local22;
		@Pc(24) byte local24;
		if (arg0 == 1) {
			local22 = true;
			local24 = 1;
		} else if (arg0 == 2) {
			local22 = false;
			local24 = 2;
		} else if (arg0 == 128) {
			local22 = true;
			local24 = 3;
		} else {
			local24 = 0;
			local22 = false;
		}
		if (!this.aBoolean552) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean552 = true;
		}
		if (local22 != this.aBoolean550) {
			if (local22) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean550 = local22;
		}
		if (local24 != this.anInt7272) {
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
			this.anInt7272 = local24;
		}
		this.anInt7274 = arg0;
		this.anInt7273 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!pc", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean574 = false;
	}

	@OriginalMember(owner = "client!pc", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7294 = arg2;
		this.anInt7290 = arg3;
		this.aBoolean574 = true;
		this.anInt7303 = arg1;
		this.anInt7288 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
	public void method6293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7295 = arg0;
		this.anInt7287 = arg1;
		this.method6343();
		this.method6358();
	}

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "()V")
	@Override
	public void method8154() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ve;I)V")
	public void method6294(@OriginalArg(0) Interface24 arg0) {
		if (this.anInt7268 < 0 || arg0 != this.anInterface24Array1[this.anInt7268]) {
			throw new RuntimeException();
		}
		this.anInterface24Array1[this.anInt7268--] = null;
		arg0.method8431();
		if (this.anInt7268 >= 0) {
			this.anInterface24_1 = this.anInterface24Array1[this.anInt7268];
			this.anInterface24_1.method8433();
		} else {
			this.anInterface24_1 = null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!so;IIII)Lclient!ka;")
	@Override
	public Class62 method8072(@OriginalArg(0) Class334 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class62_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt7269 + this.anInt7270 + this.anInt7271;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[Lclient!kp;)V")
	@Override
	public void method8090(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub29[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass4_Sub29Array5[local7] = arg1[local7];
		}
		this.anInt7306 = arg0;
		if (this.anInt7307 != 1) {
			this.method6303();
		}
	}

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "()Z")
	@Override
	public boolean method8136() {
		return this.aClass4_Sub18_Sub1_1 != null && this.aClass4_Sub18_Sub1_1.method2770();
	}

	@OriginalMember(owner = "client!pc", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean574) {
			throw new RuntimeException("");
		}
		this.anInt7290 = arg3;
		this.anInt7288 = arg0;
		this.anInt7303 = arg1;
		this.anInt7294 = arg2;
		if (this.aBoolean553) {
			this.aClass219_1.aClass44_Sub8_1.method7326();
			this.aClass219_1.aClass44_Sub8_1.method7328();
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	private void method6295() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Lclient!za;")
	@Override
	public Class4_Sub13 method8088(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub13_Sub1 local8 = new Class4_Sub13_Sub1(arg0);
		this.aClass163_50.method3646(local8);
		return local8;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)V")
	public void method6296(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean563 != arg0) {
			this.aBoolean563 = arg0;
			this.method6314();
			this.anInt7273 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "(I)V")
	private void method6297() {
		if (this.anInt7307 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt7157 > 0 && this.anInt7088 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt7157, (double) this.anInt7088, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt7273 &= 0xFFFFFFE7;
		this.anInt7307 = 1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass193_1.method4351(arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "(I)V")
	public void method6298() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray54, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray51, 0);
	}

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass92_Sub2_3.aFloat83 + this.aClass92_Sub2_3.aFloat79 * (float) arg1 + this.aClass92_Sub2_3.aFloat85 * (float) arg0 + (float) arg2 * this.aClass92_Sub2_3.aFloat76;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt7304 * (this.aClass92_Sub2_3.aFloat81 * (float) arg0 + (float) arg1 * this.aClass92_Sub2_3.aFloat75 + (float) arg2 * this.aClass92_Sub2_3.aFloat84 + this.aClass92_Sub2_3.aFloat82) / local28);
		@Pc(109) int local109 = (int) ((float) this.anInt7280 * (this.aClass92_Sub2_3.aFloat74 + this.aClass92_Sub2_3.aFloat80 * (float) arg0 + this.aClass92_Sub2_3.aFloat78 * (float) arg1 + (float) arg2 * this.aClass92_Sub2_3.aFloat77) / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat177);
		arg3[1] = (int) ((float) local109 - this.aFloat167);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "()V")
	@Override
	protected void method8126() {
		for (@Pc(10) Class4 local10 = this.aClass163_50.method3639(); local10 != null; local10 = this.aClass163_50.method3640()) {
			((Class4_Sub13_Sub1) local10).method1789();
		}
		if (this.aClass193_1 != null) {
			this.aClass193_1.method4355();
		}
		if (this.anOpenGL2 != null) {
			this.method6295();
			@Pc(40) Enumeration local40 = this.aHashtable4.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable4.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean548) {
			Static373.method4918(true, false);
			this.aBoolean548 = false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)I")
	private int method6299() {
		@Pc(5) int local5 = 0;
		this.aString85 = OpenGL.glGetString(7936).toLowerCase();
		this.aString86 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString85.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString85.indexOf("brian paul") != -1 || this.aString85.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static189.method2958(' ', local46.replace('.', ' '));
		if (local54.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(72) int local72 = Static613.method8035(local54[0]);
				@Pc(78) int local78 = Static613.method8035(local54[1]);
				this.anInt7284 = local78 + local72 * 10;
			} catch (@Pc(87) NumberFormatException local87) {
				local5 |= 0x4;
			}
		}
		if (this.anInt7284 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(121) int[] local121 = new int[1];
		OpenGL.glGetIntegerv(34018, local121, 0);
		this.anInt7289 = local121[0];
		OpenGL.glGetIntegerv(34929, local121, 0);
		this.anInt7275 = local121[0];
		OpenGL.glGetIntegerv(34930, local121, 0);
		this.anInt7293 = local121[0];
		if (this.anInt7289 < 2 || this.anInt7275 < 2 || this.anInt7293 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean555 = Stream.b();
		this.aBoolean578 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean576 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean562 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean565 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean556 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean554 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean558 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean568 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean575 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean557 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean571 = false;
		this.aBoolean567 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean560 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean577 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean573 = this.aBoolean577 & this.aBoolean560;
		this.aBoolean570 = Class4_Sub5_Sub13.aString48.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static573.aFloatArray64, 0);
		this.aFloat175 = Static573.aFloatArray64[0];
		this.aFloat168 = Static573.aFloatArray64[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!af;I)V")
	@Override
	public void method8094(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1) {
		this.aClass159_1.method3422(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([IIIIIZ)Lclient!tf;")
	@Override
	public Class17 method8156(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class17_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!bia;I)V")
	public void method6300(@OriginalArg(0) Interface5 arg0) {
		if (arg0 != this.anInterface5_4) {
			if (this.aBoolean576) {
				OpenGL.glBindBufferARB(34963, arg0.method8460());
			}
			this.anInterface5_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8141(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8120(arg2, arg3);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		this.method6334();
		this.method6292(1);
		@Pc(29) float local29 = (float) arg2 - (float) arg0;
		@Pc(36) float local36 = (float) -arg1 + (float) arg3;
		@Pc(49) float local49 = (float) (1.0D / Math.sqrt((double) (local36 * local36 + local29 * local29)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(71) int local71 = arg7 % (arg6 + arg5);
		@Pc(75) float local75 = local36 * local49;
		@Pc(79) float local79 = local29 * local49;
		@Pc(84) float local84 = local79 * (float) arg5;
		@Pc(89) float local89 = (float) arg5 * local75;
		@Pc(91) float local91 = 0.0F;
		@Pc(93) float local93 = 0.0F;
		@Pc(95) float local95 = local84;
		@Pc(97) float local97 = local89;
		if (local71 > arg5) {
			local93 = local75 * (float) (arg5 + arg6 - local71);
			local91 = local79 * (float) (arg6 + arg5 - local71);
		} else {
			local95 = (float) (arg5 - local71) * local79;
			local97 = local75 * (float) (arg5 - local71);
		}
		@Pc(145) float local145 = (float) arg0 + local91 + 0.35F;
		@Pc(152) float local152 = local93 + (float) arg1 + 0.35F;
		@Pc(157) float local157 = (float) arg6 * local79;
		@Pc(162) float local162 = (float) arg6 * local75;
		while (true) {
			if (arg2 <= arg0) {
				if ((float) arg2 + 0.35F > local145) {
					break;
				}
				if ((float) arg2 > local145 + local95) {
					local95 = (float) arg2 - local145;
				}
			} else {
				if ((float) arg2 + 0.35F < local145) {
					break;
				}
				if (local95 + local145 > (float) arg2) {
					local95 = (float) arg2 - local145;
				}
			}
			if (arg1 < arg3) {
				if (local152 > (float) arg3 + 0.35F) {
					break;
				}
				if (local97 + local152 > (float) arg3) {
					local97 = (float) arg3 - local152;
				}
			} else {
				if (local152 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local97 + local152) {
					local97 = (float) arg3 - local152;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local145, local152);
			OpenGL.glVertex2f(local95 + local145, local97 + local152);
			local152 += local97 + local162;
			OpenGL.glEnd();
			local145 += local157 + local95;
			local95 = local84;
			local97 = local89;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!hea;)V")
	public void method6301(@OriginalArg(1) Class92_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method3225(), 0);
	}

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "(I)V")
	private void method6302() {
		this.aClass116Array1 = new Class116[this.anInt7289];
		this.aClass116_Sub2_5 = new Class116_Sub2(this, 3553, 6408, 1, 1);
		new Class116_Sub2(this, 3553, 6408, 1, 1);
		new Class116_Sub2(this, 3553, 6408, 1, 1);
		this.aClass62_Sub1_3 = new Class62_Sub1(this);
		this.aClass62_Sub1_10 = new Class62_Sub1(this);
		this.aClass62_Sub1_9 = new Class62_Sub1(this);
		this.aClass62_Sub1_6 = new Class62_Sub1(this);
		this.aClass62_Sub1_8 = new Class62_Sub1(this);
		this.aClass62_Sub1_7 = new Class62_Sub1(this);
		this.aClass62_Sub1_1 = new Class62_Sub1(this);
		this.aClass62_Sub1_4 = new Class62_Sub1(this);
		this.aClass62_Sub1_5 = new Class62_Sub1(this);
		this.aClass62_Sub1_2 = new Class62_Sub1(this);
		if (this.aBoolean567) {
			this.aClass371_7 = new Class371(this);
			new Class371(this);
		}
	}

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "(I)V")
	private void method6303() {
		@Pc(11) int local11;
		for (local11 = 0; local11 < this.anInt7306; local11++) {
			@Pc(18) Class4_Sub29 local18 = this.aClass4_Sub29Array5[local11];
			@Pc(23) int local23 = local11 + 16386;
			Static290.aFloatArray24[0] = (float) local18.method7627();
			Static290.aFloatArray24[1] = (float) local18.method7630();
			Static290.aFloatArray24[2] = (float) local18.method7628();
			Static290.aFloatArray24[3] = 1.0F;
			OpenGL.glLightfv(local23, 4611, Static290.aFloatArray24, 0);
			@Pc(57) int local57 = local18.method7633();
			@Pc(63) float local63 = local18.method7626() / 255.0F;
			Static290.aFloatArray24[2] = local63 * (float) (local57 & 0xFF);
			Static290.aFloatArray24[0] = (float) (local57 >> 16 & 0xFF) * local63;
			Static290.aFloatArray24[1] = local63 * (float) (local57 >> 8 & 0xFF);
			OpenGL.glLightfv(local23, 4609, Static290.aFloatArray24, 0);
			OpenGL.glLightf(local23, 4617, 1.0F / (float) (local18.method7632() * local18.method7632()));
			OpenGL.glEnable(local23);
		}
		while (local11 < this.anInt7292) {
			OpenGL.glDisable(local11 + 16386);
			local11++;
		}
		this.anInt7292 = this.anInt7306;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(BI)I")
	public int method6304(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method8131(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class4_Sub24 local19;
		while (!this.aClass163_52.method3638()) {
			local19 = (Class4_Sub24) this.aClass163_52.method3644();
			Static218.anIntArray248[local7++] = (int) local19.aLong307;
			this.anInt7269 -= local19.anInt4156;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static218.anIntArray248, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static218.anIntArray248, 0);
			local7 = 0;
		}
		while (!this.aClass163_53.method3638()) {
			local19 = (Class4_Sub24) this.aClass163_53.method3644();
			Static218.anIntArray248[local7++] = (int) local19.aLong307;
			this.anInt7270 -= local19.anInt4156;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static218.anIntArray248, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static218.anIntArray248, 0);
			local7 = 0;
		}
		while (!this.aClass163_54.method3638()) {
			local19 = (Class4_Sub24) this.aClass163_54.method3644();
			Static218.anIntArray248[local7++] = local19.anInt4156;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static218.anIntArray248, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static218.anIntArray248, 0);
			local7 = 0;
		}
		while (!this.aClass163_55.method3638()) {
			local19 = (Class4_Sub24) this.aClass163_55.method3644();
			Static218.anIntArray248[local7++] = (int) local19.aLong307;
			this.anInt7271 -= local19.anInt4156;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static218.anIntArray248, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static218.anIntArray248, 0);
		}
		while (!this.aClass163_51.method3638()) {
			local19 = (Class4_Sub24) this.aClass163_51.method3644();
			OpenGL.glDeleteLists((int) local19.aLong307, local19.anInt4156);
		}
		@Pc(215) Class4 local215;
		while (!this.aClass163_56.method3638()) {
			local215 = this.aClass163_56.method3644();
			OpenGL.glDeleteProgramARB((int) local215.aLong307);
		}
		while (!this.bf.method3638()) {
			local215 = this.bf.method3644();
			OpenGL.glDeleteObjectARB(local215.aLong307);
		}
		while (!this.aClass163_51.method3638()) {
			local19 = (Class4_Sub24) this.aClass163_51.method3644();
			OpenGL.glDeleteLists((int) local19.aLong307, local19.anInt4156);
		}
		this.aClass30_1.method1010();
		if (this.E() > 100663296 && Static429.method5935() > this.aLong211 + 60000L) {
			System.gc();
			this.aLong211 = Static429.method5935();
		}
		this.anInt7264 = local11;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)V")
	public void method6305(@OriginalArg(0) int arg0) {
		this.method6370(arg0, true);
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(Z)V")
	private void method6306() {
		this.aFloatArray53[10] = this.aFloat182;
		this.aFloatArray53[14] = this.aFloat169;
		this.aFloat172 = ((float) -this.anInt7298 + this.aFloatArray53[14]) / this.aFloatArray53[10];
		this.aFloat180 = (float) this.anInt7298;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIII)V")
	public void method6307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBZ[BI)Lclient!en;")
	public Interface11 method6308(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		return (Interface11) (this.aBoolean576 && (!arg1 || this.aBoolean559) ? new Class238_Sub1(this, arg3, arg2, arg0, arg1) : new Class322_Sub1(this, arg3, arg2, arg0));
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZIZ)V")
	public void method6309(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt7286 || this.aBoolean574 != this.aBoolean553) {
			@Pc(20) Class116_Sub2 local20 = null;
			@Pc(22) int local22 = 0;
			@Pc(24) byte local24 = 0;
			@Pc(26) int local26 = 0;
			@Pc(33) int local33 = this.aBoolean574 ? 3 : 0;
			if (arg0 < 0) {
				this.method6322();
			} else {
				local20 = this.aClass30_1.method1011(arg0);
				@Pc(52) Class130 local52 = super.anInterface9_12.method1558(arg0);
				if (local52.aByte34 == 0 && local52.aByte36 == 0) {
					this.method6322();
				} else {
					@Pc(68) int local68 = local52.aBoolean236 ? 64 : 128;
					@Pc(72) int local72 = local68 * 50;
					this.method6351((float) (this.anInt7264 % local72 * local52.aByte36) / (float) local72, (float) (this.anInt7264 % local72 * local52.aByte34) / (float) local72, 0.0F);
				}
				if (!this.aBoolean574) {
					local24 = local52.aByte35;
					local33 = local52.aByte39;
					local26 = local52.anInt3118;
				}
				local22 = local52.anInt3117;
			}
			this.aClass219_1.method4759(local26, arg2, arg1, local24, local33);
			if (!this.aClass219_1.method4756(local22, local20)) {
				this.method6340(local20);
				this.method6336(local22);
			}
			this.aBoolean553 = this.aBoolean574;
			this.anInt7286 = arg0;
		}
		this.anInt7273 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!jia;)V")
	@Override
	public void method8069(@OriginalArg(0) Class68 arg0) {
		this.aClass68_Sub2_1 = (Class68_Sub2) arg0;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(ZI)V")
	public void method6310(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean551 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt7273 &= 0xFFFFFFE0;
		this.aBoolean551 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt7298;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!cr;Z)Lclient!tf;")
	@Override
	public Class17 method8147(@OriginalArg(0) Class51 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt1657 * arg0.anInt1661];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray22 == null) {
			for (local21 = 0; local21 < arg0.anInt1657; local21++) {
				for (local25 = 0; local25 < arg0.anInt1661; local25++) {
					@Pc(79) int local79 = arg0.anIntArray107[arg0.aByteArray23[local14++] & 0xFF];
					local12[local16++] = local79 == 0 ? 0 : local79 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt1657; local21++) {
				for (local25 = 0; local25 < arg0.anInt1661; local25++) {
					local12[local16++] = arg0.aByteArray22[local14] << 24 | arg0.anIntArray107[arg0.aByteArray23[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(116) Class17 local116 = this.method8128(local12, arg0.anInt1657, arg0.anInt1661, arg0.anInt1661);
		local116.method5250(arg0.anInt1659, arg0.anInt1662, arg0.anInt1660, arg0.anInt1658);
		return local116;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)V")
	public synchronized void method6311(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub24 local13 = new Class4_Sub24(arg0);
		local13.aLong307 = (long) arg1;
		this.aClass163_55.method3646(local13);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!af;)V")
	@Override
	public void method8085(@OriginalArg(0) Class9 arg0) {
		this.aClass159_1.method3422(this, -1, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8144(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas9 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable4.containsKey(arg0)) {
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
			this.aHashtable4.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7279 < arg1) {
			this.anInt7279 = arg1;
		}
		if (this.anInt7302 > arg3) {
			this.anInt7302 = arg3;
		}
		if (this.anInt7285 > arg2) {
			this.anInt7285 = arg2;
		}
		if (arg0 > this.anInt7308) {
			this.anInt7308 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method6353();
		this.method6358();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZB)V")
	public void method6312(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean549) {
			this.aBoolean549 = arg0;
			this.method6324();
			this.anInt7273 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass92_Sub2_3.aFloat83 + this.aClass92_Sub2_3.aFloat76 * (float) arg2 + (float) arg1 * this.aClass92_Sub2_3.aFloat79 + this.aClass92_Sub2_3.aFloat85 * (float) arg0;
		if (local28 < (float) this.anInt7300 || (float) this.anInt7298 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt7304 * (this.aClass92_Sub2_3.aFloat75 * (float) arg1 + this.aClass92_Sub2_3.aFloat81 * (float) arg0 + (float) arg2 * this.aClass92_Sub2_3.aFloat84 + this.aClass92_Sub2_3.aFloat82) / local28);
		@Pc(117) int local117 = (int) ((this.aClass92_Sub2_3.aFloat74 + (float) arg0 * this.aClass92_Sub2_3.aFloat80 + (float) arg1 * this.aClass92_Sub2_3.aFloat78 + (float) arg2 * this.aClass92_Sub2_3.aFloat77) * (float) this.anInt7280 / local28);
		if ((float) local85 >= this.aFloat177 && this.aFloat173 >= (float) local85 && this.aFloat167 <= (float) local117 && (float) local117 <= this.aFloat162) {
			arg3[0] = (int) ((float) local85 - this.aFloat177);
			arg3[1] = (int) ((float) local117 - this.aFloat167);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(II)V")
	public synchronized void method6313(@OriginalArg(1) int arg0) {
		@Pc(15) Class4_Sub24 local15 = new Class4_Sub24(arg0);
		this.aClass163_54.method3646(local15);
	}

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "(I)V")
	private void method6314() {
		if (this.aBoolean563 && !this.aBoolean572) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pc", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7304 = arg2;
		this.anInt7297 = arg1;
		this.anInt7277 = arg0;
		this.anInt7280 = arg3;
		this.method6319();
		this.method6353();
		if (this.anInt7307 == 3) {
			this.method6371();
		} else if (this.anInt7307 == 2) {
			this.method6321();
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(Z)V")
	private void method6315() {
		if (this.aBoolean566 && this.anInt7305 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!nm;)V")
	@Override
	public void method8117(@OriginalArg(0) Interface18 arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "()Z")
	@Override
	public boolean method8107() {
		return this.aClass4_Sub18_Sub1_1 != null && (this.anInt7261 <= 1 || this.aBoolean573);
	}

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "(I)V")
	public void method6316() {
		if (this.anInt7307 != 0) {
			this.anInt7307 = 0;
			this.anInt7273 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt7299;
		if (local11 || arg1 != this.aFloat174 || this.aFloat166 != arg2) {
			this.aFloat174 = arg1;
			this.aFloat166 = arg2;
			this.anInt7299 = arg0;
			if (local11) {
				this.aFloat171 = (float) (this.anInt7299 & 0xFF) / 255.0F;
				this.aFloat179 = (float) (this.anInt7299 & 0xFF00) / 65280.0F;
				this.aFloat164 = (float) (this.anInt7299 & 0xFF0000) / 1.671168E7F;
				this.method6333();
			}
			this.method6318();
		}
		if (this.aFloatArray52[0] == arg3 && arg4 == this.aFloatArray52[1] && this.aFloatArray52[2] == arg5) {
			return;
		}
		this.aFloatArray52[2] = arg5;
		this.aFloatArray52[0] = arg3;
		this.aFloatArray52[1] = arg4;
		this.aFloatArray50[0] = -arg3;
		this.aFloatArray50[1] = -arg4;
		this.aFloatArray50[2] = -arg5;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray54[0] = arg3 * local138;
		this.aFloatArray54[2] = arg5 * local138;
		this.aFloatArray54[1] = arg4 * local138;
		this.aFloatArray51[2] = -this.aFloatArray54[2];
		this.aFloatArray51[1] = -this.aFloatArray54[1];
		this.aFloatArray51[0] = -this.aFloatArray54[0];
		this.method6298();
		this.anInt7282 = (int) (arg3 * 256.0F / arg4);
		this.anInt7283 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class42 method8068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class42_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method8096(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
	@Override
	public void method8121() {
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IZ)V")
	public void method6317(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean566 != arg0) {
			this.aBoolean566 = arg0;
			this.method6315();
			this.anInt7273 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
	private void method6318() {
		Static573.aFloatArray64[2] = this.aFloat171 * this.aFloat174;
		Static573.aFloatArray64[3] = 1.0F;
		Static573.aFloatArray64[1] = this.aFloat174 * this.aFloat179;
		Static573.aFloatArray64[0] = this.aFloat174 * this.aFloat164;
		OpenGL.glLightfv(16384, 4609, Static573.aFloatArray64, 0);
		Static573.aFloatArray64[0] = -this.aFloat166 * this.aFloat164;
		Static573.aFloatArray64[1] = -this.aFloat166 * this.aFloat179;
		Static573.aFloatArray64[3] = 1.0F;
		Static573.aFloatArray64[2] = this.aFloat171 * -this.aFloat166;
		OpenGL.glLightfv(16385, 4609, Static573.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([I)V")
	@Override
	public void method8155(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7157;
		arg0[1] = this.anInt7088;
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V")
	private void method6319() {
		@Pc(6) float[] local6 = this.aFloatArray53;
		@Pc(27) float local27 = (float) (-this.anInt7277 * this.anInt7300) / (float) this.anInt7304;
		@Pc(42) float local42 = (float) (this.anInt7300 * (this.anInt7157 - this.anInt7277)) / (float) this.anInt7304;
		@Pc(53) float local53 = (float) (this.anInt7300 * this.anInt7297) / (float) this.anInt7280;
		@Pc(68) float local68 = (float) ((this.anInt7297 - this.anInt7088) * this.anInt7300) / (float) this.anInt7280;
		if (local27 == local42 || local68 == local53) {
			local6[6] = 0.0F;
			local6[15] = 1.0F;
			local6[11] = 0.0F;
			local6[3] = 0.0F;
			local6[9] = 0.0F;
			local6[8] = 0.0F;
			local6[10] = 1.0F;
			local6[0] = 1.0F;
			local6[4] = 0.0F;
			local6[1] = 0.0F;
			local6[7] = 0.0F;
			local6[12] = 0.0F;
			local6[13] = 0.0F;
			local6[5] = 1.0F;
			local6[2] = 0.0F;
			local6[14] = 0.0F;
		} else {
			@Pc(148) float local148 = (float) this.anInt7300 * 2.0F;
			local6[1] = 0.0F;
			local6[4] = 0.0F;
			local6[14] = this.aFloat169 = -(local148 * (float) this.anInt7298) / (float) (this.anInt7298 - this.anInt7300);
			local6[2] = 0.0F;
			local6[5] = local148 / (local53 - local68);
			local6[8] = (local27 + local42) / (-local27 + local42);
			local6[11] = -1.0F;
			local6[9] = (local68 + local53) / (local53 - local68);
			local6[12] = 0.0F;
			local6[15] = 0.0F;
			local6[0] = local148 / (local42 - local27);
			local6[13] = 0.0F;
			local6[3] = 0.0F;
			local6[6] = 0.0F;
			local6[10] = this.aFloat182 = (float) -(this.anInt7300 + this.anInt7298) / (float) (this.anInt7298 - this.anInt7300);
			local6[7] = 0.0F;
		}
		this.method6306();
	}

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "(I)V")
	private void method6320() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass92_Sub2_4.method3225(), 0);
		if (this.aBoolean553) {
			this.aClass219_1.aClass44_Sub8_1.method7326();
		}
		this.method6298();
		this.method6303();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!jia;Lclient!jia;FLclient!jia;)Lclient!jia;")
	@Override
	public Class68 method8138(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class68 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean575 && this.aBoolean567) {
			@Pc(15) Class68_Sub2_Sub2 local15 = null;
			@Pc(18) Class68_Sub2 local18 = (Class68_Sub2) arg0;
			@Pc(21) Class68_Sub2 local21 = (Class68_Sub2) arg1;
			@Pc(25) Class116_Sub1 local25 = local18.method8702();
			@Pc(29) Class116_Sub1 local29 = local21.method8702();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt3523 < local25.anInt3523 ? local25.anInt3523 : local29.anInt3523;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class68_Sub2_Sub2) {
					@Pc(56) Class68_Sub2_Sub2 local56 = (Class68_Sub2_Sub2) arg3;
					if (local56.method8706() == local44) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class68_Sub2_Sub2(this, local44);
				}
				if (local15.method8709(arg2, local25, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!sea;Lclient!up;)Lclient!nm;")
	@Override
	public Interface18 method8119(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface23 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "()Z")
	@Override
	public boolean method8146() {
		return false;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lclient!sea;")
	@Override
	public Interface21 method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(Z)V")
	private void method6321() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray53, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pc", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt7157 < arg2) {
			arg2 = this.anInt7157;
		}
		if (this.anInt7088 < arg3) {
			arg3 = this.anInt7088;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt7285 = arg2;
		this.anInt7308 = arg0;
		this.anInt7279 = arg1;
		this.anInt7302 = arg3;
		OpenGL.glEnable(3089);
		this.method6353();
		this.method6358();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 == arg2 && arg3 == arg1) {
			return;
		}
		@Pc(23) Class1_Sub1 local23 = (Class1_Sub1) arg5;
		@Pc(26) Class116_Sub2_Sub1 local26 = local23.aClass116_Sub2_Sub1_1;
		this.method6355();
		this.method6340(local23.aClass116_Sub2_Sub1_1);
		this.method6292(1);
		this.method6365(8448, 7681);
		this.method6307(34167, 0, 768);
		@Pc(56) float local56 = local26.aFloat190 / (float) local26.anInt7879;
		@Pc(63) float local63 = local26.aFloat189 / (float) local26.anInt7883;
		@Pc(70) float local70 = (float) -arg0 + (float) arg2;
		@Pc(77) float local77 = (float) -arg1 + (float) arg3;
		@Pc(90) float local90 = (float) (1.0D / Math.sqrt((double) (local77 * local77 + local70 * local70)));
		@Pc(96) int local96 = arg10 % (arg9 + arg8);
		@Pc(100) float local100 = local70 * local90;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(119) float local119 = local77 * local90;
		@Pc(124) float local124 = local100 * (float) arg8;
		@Pc(129) float local129 = local119 * (float) arg8;
		@Pc(131) float local131 = 0.0F;
		@Pc(133) float local133 = 0.0F;
		@Pc(135) float local135 = local124;
		@Pc(137) float local137 = local129;
		if (arg8 < local96) {
			local133 = local119 * (float) (arg8 + arg9 - local96);
			local131 = local100 * (float) (arg9 + arg8 - local96);
		} else {
			local137 = local119 * (float) (arg8 - local96);
			local135 = (float) (arg8 - local96) * local100;
		}
		@Pc(184) float local184 = local131 + (float) arg0 + 0.35F;
		@Pc(191) float local191 = (float) arg1 + local133 + 0.35F;
		@Pc(196) float local196 = local100 * (float) arg9;
		@Pc(201) float local201 = (float) arg9 * local119;
		while (true) {
			if (arg2 <= arg0) {
				if ((float) arg2 + 0.35F > local184) {
					break;
				}
				if ((float) arg2 > local135 + local184) {
					local135 = (float) arg2 - local184;
				}
			} else {
				if (local184 > (float) arg2 + 0.35F) {
					break;
				}
				if (local135 + local184 > (float) arg2) {
					local135 = (float) arg2 - local184;
				}
			}
			if (arg1 >= arg3) {
				if (local191 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local191 + local137) {
					local137 = (float) arg3 - local191;
				}
			} else {
				if ((float) arg3 + 0.35F < local191) {
					break;
				}
				if ((float) arg3 < local191 + local137) {
					local137 = (float) arg3 - local191;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(((float) -arg6 + local184) * local56, local63 * (local191 - (float) arg7));
			OpenGL.glVertex2f(local184, local191);
			OpenGL.glTexCoord2f(local56 * (local135 + local184 - (float) arg6), local63 * ((float) -arg7 + local137 + local191));
			OpenGL.glVertex2f(local135 + local184, local191 + local137);
			OpenGL.glEnd();
			local191 += local137 + local201;
			local184 += local135 + local196;
			local135 = local124;
			local137 = local129;
		}
		this.method6307(5890, 0, 768);
	}

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "(I)V")
	private void method6322() {
		if (this.aBoolean561) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean561 = false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "()Z")
	@Override
	public boolean method8152() {
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8110(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas9 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable4.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(ZB)V")
	public void method6323(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean572) {
			this.aBoolean572 = arg0;
			this.method6314();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8083(@OriginalArg(0) Class4_Sub13 arg0) {
		this.aNativeHeap4 = ((Class4_Sub13_Sub1) arg0).aNativeHeap1;
		if (this.anInterface11_6 != null) {
			return;
		}
		@Pc(16) Class4_Sub11_Sub2 local16 = new Class4_Sub11_Sub2(80);
		if (this.aBoolean555) {
			local16.method8897(-1.0F);
			local16.method8897(-1.0F);
			local16.method8897(0.0F);
			local16.method8897(0.0F);
			local16.method8897(1.0F);
			local16.method8897(1.0F);
			local16.method8897(-1.0F);
			local16.method8897(0.0F);
			local16.method8897(1.0F);
			local16.method8897(1.0F);
			local16.method8897(1.0F);
			local16.method8897(1.0F);
			local16.method8897(0.0F);
			local16.method8897(1.0F);
			local16.method8897(0.0F);
			local16.method8897(-1.0F);
			local16.method8897(1.0F);
			local16.method8897(0.0F);
			local16.method8897(0.0F);
			local16.method8897(0.0F);
		} else {
			local16.method8895(-1.0F);
			local16.method8895(-1.0F);
			local16.method8895(0.0F);
			local16.method8895(0.0F);
			local16.method8895(1.0F);
			local16.method8895(1.0F);
			local16.method8895(-1.0F);
			local16.method8895(0.0F);
			local16.method8895(1.0F);
			local16.method8895(1.0F);
			local16.method8895(1.0F);
			local16.method8895(1.0F);
			local16.method8895(0.0F);
			local16.method8895(1.0F);
			local16.method8895(0.0F);
			local16.method8895(-1.0F);
			local16.method8895(1.0F);
			local16.method8895(0.0F);
			local16.method8895(0.0F);
			local16.method8895(0.0F);
		}
		this.anInterface11_6 = this.method6308(local16.anInt10466, false, local16.aByteArray107, 20);
		this.aClass327_14 = new Class327(this.anInterface11_6, 5126, 3, 0);
		this.aClass327_15 = new Class327(this.anInterface11_6, 5126, 2, 12);
		this.aClass159_1.method3426(this);
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "()Lclient!nh;")
	@Override
	public Class92 method8078() {
		return this.aClass92_Sub2_1;
	}

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "(I)V")
	private void method6324() {
		OpenGL.glDepthMask(this.aBoolean549 && this.aBoolean564);
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "()Z")
	@Override
	public boolean method8074() {
		if (this.aClass4_Sub18_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass4_Sub18_Sub1_1.method2770()) {
			if (!this.aClass193_1.method4356(this.aClass4_Sub18_Sub1_1)) {
				return false;
			}
			this.aClass30_1.method1012();
		}
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "(I)V")
	private void method6325() {
		this.method6305(-2);
		for (@Pc(14) int local14 = this.anInt7289 - 1; local14 >= 0; local14--) {
			this.method6329(local14);
			this.method6340((Class116) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6365(8448, 8448);
		this.method6307(34168, 2, 770);
		this.method6322();
		this.anInt7274 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt7272 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean550 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean552 = true;
		this.method6317(true);
		this.method6296(true);
		this.method6310(true);
		this.method6312(true);
		this.method6316();
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
		@Pc(127) float[] local127 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(129) int local129 = 0; local129 < 8; local129++) {
			@Pc(135) int local135 = local129 + 16384;
			OpenGL.glLightfv(local135, 4608, local127, 0);
			OpenGL.glLightf(local135, 4615, 0.0F);
			OpenGL.glLightf(local135, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt7299 = this.anInt7301 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(B)V")
	private void method6326() {
		if (this.aCanvas10 == null) {
			this.anInt7084 = this.anInt7233 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas10.getSize();
			this.anInt7233 = local10.height;
			this.anInt7084 = local10.width;
		}
		if (this.anInterface24_2 == null) {
			this.anInt7157 = this.anInt7084;
			this.anInt7088 = this.anInt7233;
			this.method6343();
		}
		this.method6316();
		this.la();
	}

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "(I)V")
	public void method6327() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "()V")
	@Override
	public void method8134() {
		if (this.aBoolean567) {
			if (this.aClass371_6 != this.anInterface24_2) {
				throw new RuntimeException();
			}
			this.aClass371_6.method8447(0);
			this.aClass371_6.method8447(8);
			this.method6368(this.aClass371_6);
		} else if (this.aBoolean578) {
			this.aClass17_Sub3_1.method5269(0, 0, this.anInt7157, this.anInt7088, 0, 0);
			this.anOpenGL2.setSurface(this.aLong210);
		} else {
			throw new RuntimeException("");
		}
		this.aClass17_Sub3_1 = null;
		this.anInt7157 = this.anInt7084;
		this.anInt7088 = this.anInt7233;
		this.method6316();
		this.method6343();
		this.la();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!en;Z)V")
	public void method6328(@OriginalArg(0) Interface11 arg0) {
		if (this.anInterface11_5 != arg0) {
			if (this.aBoolean576) {
				OpenGL.glBindBufferARB(34962, arg0.method7226());
			}
			this.anInterface11_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!bq;[Lclient!cr;Z)Lclient!da;")
	@Override
	public Class56 method8081(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class51[] arg1) {
		return new Class56_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(BI)V")
	public void method6329(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt7296) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt7296 = arg0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt7300;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!nh;)V")
	@Override
	public void method8133(@OriginalArg(0) Class92 arg0) {
		this.aClass92_Sub2_3.method3865(arg0);
		this.aClass92_Sub2_4.method3865(this.aClass92_Sub2_3);
		this.aClass92_Sub2_4.method3221();
		this.aClass92_Sub2_5.method3219(this.aClass92_Sub2_4);
		if (this.anInt7307 != 1) {
			this.method6320();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static642.method8555(arg2, arg3, arg0, arg1, this);
	}

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "()Z")
	@Override
	public boolean method8108() {
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt7265 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt7265++;
		}
		this.anInt7263 = 0x1 << this.anInt7265;
	}

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(57) float local57;
		if (this.aClass116_Sub2_Sub1_4 == null || arg2 > this.aClass116_Sub2_Sub1_4.anInt7871 || this.aClass116_Sub2_Sub1_4.anInt7876 < arg3) {
			this.aClass116_Sub2_Sub1_4 = Static597.method7836(this, arg2, arg6, arg3);
			this.aClass116_Sub2_Sub1_4.method6838(false, false);
			local45 = this.aClass116_Sub2_Sub1_4.aFloat189;
			local57 = this.aClass116_Sub2_Sub1_4.aFloat190;
		} else {
			this.aClass116_Sub2_Sub1_4.method6836(6406, false, arg6, arg3, arg2);
			local45 = this.aClass116_Sub2_Sub1_4.aFloat189 * (float) arg3 / (float) this.aClass116_Sub2_Sub1_4.anInt7876;
			local57 = (float) arg2 * this.aClass116_Sub2_Sub1_4.aFloat190 / (float) this.aClass116_Sub2_Sub1_4.anInt7871;
		}
		this.method6355();
		this.method6340(this.aClass116_Sub2_Sub1_4);
		this.method6292(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method6357(arg5);
		this.method6365(34165, 34165);
		this.method6307(34166, 0, 768);
		this.method6307(5890, 2, 770);
		this.method6335(0, 34166);
		this.method6335(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = (float) arg3 + local150;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local57);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local45, local57);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method6307(5890, 0, 768);
		this.method6307(34166, 2, 770);
		this.method6335(0, 5890);
		this.method6335(2, 34166);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!jaclib/memory/Buffer;IZI)Lclient!en;")
	public Interface11 method6330(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return (Interface11) (this.aBoolean576 ? new Class238_Sub1(this, arg1, arg0, arg2, false) : new Class322_Sub1(this, arg1, arg0));
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJ)V")
	public synchronized void method6331(@OriginalArg(1) long arg0) {
		@Pc(7) Class4 local7 = new Class4();
		local7.aLong307 = arg0;
		this.bf.method3646(local7);
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)I")
	@Override
	public int method8124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V")
	public synchronized void method6332(@OriginalArg(0) int arg0) {
		@Pc(7) Class4 local7 = new Class4();
		local7.aLong307 = (long) arg0;
		this.aClass163_56.method3646(local7);
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(IIIIII)Lclient!jia;")
	@Override
	public Class68 method8112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean575 ? new Class68_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6334();
		this.method6292(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 - (float) arg1;
		if (local17 == 0.0F && local23 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(48) float local48 = (float) (1.0D / Math.sqrt((double) (local23 * local23 + local17 * local17)));
			local17 *= local48;
			local23 *= local48;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local17 + 0.35F, local23 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pc", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt7088 - local12 - arg1, arg2, 1, 32993, this.anInt7281, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "()V")
	@Override
	public void method8073() {
		if (this.aClass4_Sub18_Sub1_1 != null && this.aClass4_Sub18_Sub1_1.method2770()) {
			this.aClass193_1.method4349(this.aClass4_Sub18_Sub1_1);
			this.aClass30_1.method1012();
		}
	}

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "(I)V")
	private void method6333() {
		Static573.aFloatArray64[3] = 1.0F;
		Static573.aFloatArray64[0] = this.aFloat176 * this.aFloat164;
		Static573.aFloatArray64[1] = this.aFloat176 * this.aFloat179;
		Static573.aFloatArray64[2] = this.aFloat171 * this.aFloat176;
		OpenGL.glLightModelfv(2899, Static573.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "(I)V")
	private void method6334() {
		if (this.anInt7273 == 1) {
			return;
		}
		this.method6297();
		this.method6317(false);
		this.method6296(false);
		this.method6310(false);
		this.method6312(false);
		this.method6340((Class116) null);
		this.method6305(-2);
		this.method6336(1);
		this.anInt7273 = 1;
	}

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "()V")
	@Override
	public void method8149() {
		this.aClass193_1.method4352();
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(IIII)V")
	public void method6335(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IB)V")
	public void method6336(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6365(7681, 7681);
		} else if (arg0 == 0) {
			this.method6365(8448, 8448);
		} else if (arg0 == 2) {
			this.method6365(7681, 34165);
		} else if (arg0 == 3) {
			this.method6365(8448, 260);
		} else if (arg0 == 4) {
			this.method6365(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "()Lclient!nh;")
	@Override
	public Class92 method8076() {
		return this.aClass92_Sub2_3;
	}

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "(I)V")
	private void method6337() {
		if (this.anInt7307 != 3) {
			this.anInt7307 = 3;
			this.method6371();
			this.method6320();
			this.anInt7273 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "(I)V")
	public void method6338() {
		if (this.anInt7273 == 16) {
			return;
		}
		this.method6337();
		this.method6317(true);
		this.method6310(true);
		this.method6312(true);
		this.method6292(1);
		this.anInt7273 = 16;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!sf;Lclient!sf;Lclient!sf;Lclient!sf;I)V")
	public void method6339(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) Class327 arg2, @OriginalArg(3) Class327 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6328(arg1.anInterface11_7);
			OpenGL.glVertexPointer(arg1.aByte117, arg1.aShort108, this.anInterface11_5.method7227(), this.anInterface11_5.method7228() + (long) arg1.aByte118);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6328(arg3.anInterface11_7);
			OpenGL.glNormalPointer(arg3.aShort108, this.anInterface11_5.method7227(), this.anInterface11_5.method7228() + (long) arg3.aByte118);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6328(arg2.anInterface11_7);
			OpenGL.glColorPointer(arg2.aByte117, arg2.aShort108, this.anInterface11_5.method7227(), this.anInterface11_5.method7228() + (long) arg2.aByte118);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6328(arg0.anInterface11_7);
			OpenGL.glTexCoordPointer(arg0.aByte117, arg0.aShort108, this.anInterface11_5.method7227(), this.anInterface11_5.method7228() + (long) arg0.aByte118);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!fha;)V")
	public void method6340(@OriginalArg(1) Class116 arg0) {
		@Pc(17) Class116 local17 = this.aClass116Array1[this.anInt7296];
		if (arg0 != local17) {
			if (arg0 == null) {
				OpenGL.glDisable(local17.anInt9736);
			} else {
				if (local17 == null) {
					OpenGL.glEnable(arg0.anInt9736);
				} else if (local17.anInt9736 != arg0.anInt9736) {
					OpenGL.glDisable(local17.anInt9736);
					OpenGL.glEnable(arg0.anInt9736);
				}
				OpenGL.glBindTexture(arg0.anInt9736, arg0.method8339());
			}
			this.aClass116Array1[this.anInt7296] = arg0;
		}
		this.anInt7273 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!pc", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7301 == arg0 && arg1 == this.anInt7305 && arg2 == this.anInt7291) {
			return;
		}
		this.anInt7301 = arg0;
		this.anInt7291 = arg2;
		this.anInt7305 = arg1;
		this.method6356();
		this.method6315();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8067() {
		this.method6334();
		this.method6292(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V")
	@Override
	public void method8120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static626.aFloat227 = arg0;
		Static669.aFloat237 = arg1;
		Static72.aFloat17 = arg2;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
	@Override
	public void method8102(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(II)I")
	public int method6341(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!pc", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg1 * this.aClass92_Sub2_3.aFloat79 + this.aClass92_Sub2_3.aFloat85 * (float) arg0 + (float) arg2 * this.aClass92_Sub2_3.aFloat76 + this.aClass92_Sub2_3.aFloat83;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass92_Sub2_3.aFloat76 * (float) arg5 + this.aClass92_Sub2_3.aFloat85 * (float) arg3 + this.aClass92_Sub2_3.aFloat79 * (float) arg4 + this.aClass92_Sub2_3.aFloat83;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt7300 > local32 && (float) this.anInt7300 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt7298 < local32 && local63 > (float) this.anInt7298) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt7304 * (this.aClass92_Sub2_3.aFloat82 + (float) arg0 * this.aClass92_Sub2_3.aFloat81 + this.aClass92_Sub2_3.aFloat75 * (float) arg1 + this.aClass92_Sub2_3.aFloat84 * (float) arg2) / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt7304 * (this.aClass92_Sub2_3.aFloat82 + (float) arg5 * this.aClass92_Sub2_3.aFloat84 + (float) arg3 * this.aClass92_Sub2_3.aFloat81 + (float) arg4 * this.aClass92_Sub2_3.aFloat75) / local63);
		if ((float) local135 < this.aFloat177 && (float) local167 < this.aFloat177) {
			local7 |= 0x1;
		} else if (this.aFloat173 < (float) local135 && (float) local167 > this.aFloat173) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt7280 * (this.aClass92_Sub2_3.aFloat74 + (float) arg2 * this.aClass92_Sub2_3.aFloat77 + (float) arg0 * this.aClass92_Sub2_3.aFloat80 + this.aClass92_Sub2_3.aFloat78 * (float) arg1) / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt7280 * (this.aClass92_Sub2_3.aFloat74 + this.aClass92_Sub2_3.aFloat80 * (float) arg3 + this.aClass92_Sub2_3.aFloat78 * (float) arg4 + (float) arg5 * this.aClass92_Sub2_3.aFloat77) / local63);
		if ((float) local233 < this.aFloat167 && this.aFloat167 > (float) local265) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat162 && (float) local265 > this.aFloat162) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = (float) arg2 * this.aClass92_Sub2_3.aFloat76 + (float) arg1 * this.aClass92_Sub2_3.aFloat79 + (float) arg0 * this.aClass92_Sub2_3.aFloat85 + this.aClass92_Sub2_3.aFloat83;
		@Pc(55) float local55 = (float) arg5 * this.aClass92_Sub2_3.aFloat76 + this.aClass92_Sub2_3.aFloat79 * (float) arg4 + this.aClass92_Sub2_3.aFloat85 * (float) arg3 + this.aClass92_Sub2_3.aFloat83;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt7300 && (float) this.anInt7300 > local55) {
			local57 |= 0x10;
		} else if ((float) this.anInt7298 < local30 && local55 > (float) this.anInt7298) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass92_Sub2_3.aFloat75 * (float) arg1 + (float) arg0 * this.aClass92_Sub2_3.aFloat81 + this.aClass92_Sub2_3.aFloat84 * (float) arg2 + this.aClass92_Sub2_3.aFloat82) * (float) this.anInt7304 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt7304 * (this.aClass92_Sub2_3.aFloat81 * (float) arg3 + this.aClass92_Sub2_3.aFloat75 * (float) arg4 + (float) arg5 * this.aClass92_Sub2_3.aFloat84 + this.aClass92_Sub2_3.aFloat82) / (float) arg6);
		if (this.aFloat177 > (float) local124 && (float) local157 < this.aFloat177) {
			local57 |= 0x1;
		} else if (this.aFloat173 < (float) local124 && this.aFloat173 < (float) local157) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass92_Sub2_3.aFloat74 + this.aClass92_Sub2_3.aFloat80 * (float) arg0 + (float) arg1 * this.aClass92_Sub2_3.aFloat78 + (float) arg2 * this.aClass92_Sub2_3.aFloat77) * (float) this.anInt7280 / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass92_Sub2_3.aFloat80 * (float) arg3 + this.aClass92_Sub2_3.aFloat78 * (float) arg4 + (float) arg5 * this.aClass92_Sub2_3.aFloat77 + this.aClass92_Sub2_3.aFloat74) * (float) this.anInt7280 / (float) arg6);
		if ((float) local224 < this.aFloat167 && this.aFloat167 > (float) local257) {
			local57 |= 0x4;
		} else if (this.aFloat162 < (float) local224 && this.aFloat162 < (float) local257) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(III)V")
	public synchronized void method6342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class4_Sub24 local14 = new Class4_Sub24(arg1);
		local14.aLong307 = (long) arg0;
		this.aClass163_52.method3646(local14);
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	@Override
	public void method8092(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt7256 = arg0;
		this.aClass30_1.method1012();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
	@Override
	public void method8089(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method6292(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(B)V")
	private void method6343() {
		OpenGL.glViewport(this.anInt7287, this.anInt7295, this.anInt7157, this.anInt7088);
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(II)I")
	@Override
	public int method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!pc", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt7285;
		arg0[0] = this.anInt7308;
		arg0[3] = this.anInt7302;
		arg0[1] = this.anInt7279;
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "()V")
	@Override
	public void method8093() {
		if (!this.aBoolean579 || this.anInt7157 <= 0 || this.anInt7088 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt7308;
		@Pc(25) int local25 = this.anInt7285;
		@Pc(28) int local28 = this.anInt7279;
		@Pc(31) int local31 = this.anInt7302;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6316();
		this.method6317(false);
		this.method6296(false);
		this.method6310(false);
		this.method6312(false);
		this.method6340((Class116) null);
		this.method6305(-2);
		this.method6336(1);
		this.method6292(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt7157, this.anInt7088, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0) {
		this.method6295();
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIZ)V")
	public synchronized void method6345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class4_Sub24 local12 = new Class4_Sub24(arg1);
		local12.aLong307 = (long) arg0;
		this.aClass163_53.method3646(local12);
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(B)V")
	public void method6346() {
		if (this.anInt7273 == 8) {
			return;
		}
		this.method6363();
		this.method6317(true);
		this.method6310(true);
		this.method6312(true);
		this.method6292(1);
		this.anInt7273 = 8;
	}

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Class116_Sub2_Sub1 local9 = local6.aClass116_Sub2_Sub1_1;
		this.method6355();
		this.method6340(local6.aClass116_Sub2_Sub1_1);
		this.method6292(1);
		this.method6365(8448, 7681);
		this.method6307(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat190 / (float) local9.anInt7879;
		@Pc(46) float local46 = local9.aFloat189 / (float) local9.anInt7883;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt7308 - arg2) * local39, (float) (this.anInt7279 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt7308, this.anInt7279);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7308 - arg2), local46 * (float) (this.anInt7302 - arg3));
		OpenGL.glVertex2i(this.anInt7308, this.anInt7302);
		OpenGL.glTexCoord2f((float) (this.anInt7285 - arg2) * local39, local46 * (float) (this.anInt7302 - arg3));
		OpenGL.glVertex2i(this.anInt7285, this.anInt7302);
		OpenGL.glTexCoord2f((float) (this.anInt7285 - arg2) * local39, (float) (this.anInt7279 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt7285, this.anInt7279);
		OpenGL.glEnd();
		this.method6307(5890, 0, 768);
	}

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "()Z")
	@Override
	public boolean method8130() {
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg5;
		@Pc(9) Class116_Sub2_Sub1 local9 = local6.aClass116_Sub2_Sub1_1;
		this.method6355();
		this.method6340(local6.aClass116_Sub2_Sub1_1);
		this.method6292(1);
		this.method6365(8448, 7681);
		this.method6307(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat190 / (float) local9.anInt7879;
		@Pc(46) float local46 = local9.aFloat189 / (float) local9.anInt7883;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(59) float local59 = (float) arg3 - (float) arg1;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local59 * local59)));
		@Pc(76) float local76 = local53 * local72;
		@Pc(80) float local80 = local59 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f(local76 + (float) arg2 + 0.35F, (float) arg3 + local80 + 0.35F);
		OpenGL.glEnd();
		this.method6307(5890, 0, 768);
	}

	@OriginalMember(owner = "client!pc", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt7310;
		this.anInt7310 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt7277, this.anInt7297, this.anInt7304, this.anInt7280 };
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Lclient!ve;I)V")
	public void method6347(@OriginalArg(0) Interface24 arg0) {
		if (this.anInt7267 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7267 >= 0) {
			this.anInterface24Array2[this.anInt7267].method8430();
		}
		this.anInterface24_2 = this.anInterface24Array2[++this.anInt7267] = arg0;
		this.anInterface24_2.method8432();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIBILclient!bia;)V")
	public void method6348(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Interface5 arg2) {
		@Pc(13) int local13 = arg2.method8461();
		@Pc(20) int local20 = arg0 * this.method6350(local13);
		this.method6300(arg2);
		OpenGL.glDrawElements(4, arg1, local13, arg2.method8459() + (long) local20);
	}

	@OriginalMember(owner = "client!pc", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass92_Sub2_3.aFloat83 + (float) arg1 * this.aClass92_Sub2_3.aFloat79 + this.aClass92_Sub2_3.aFloat85 * (float) arg0 + (float) arg2 * this.aClass92_Sub2_3.aFloat76;
		if ((float) this.anInt7300 > local28 || local28 > (float) this.anInt7298) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((this.aClass92_Sub2_3.aFloat82 + this.aClass92_Sub2_3.aFloat84 * (float) arg2 + this.aClass92_Sub2_3.aFloat81 * (float) arg0 + (float) arg1 * this.aClass92_Sub2_3.aFloat75) * (float) this.anInt7304 / (float) arg3);
		@Pc(119) int local119 = (int) ((float) this.anInt7280 * ((float) arg2 * this.aClass92_Sub2_3.aFloat77 + this.aClass92_Sub2_3.aFloat80 * (float) arg0 + (float) arg1 * this.aClass92_Sub2_3.aFloat78 + this.aClass92_Sub2_3.aFloat74) / (float) arg3);
		if ((float) local86 >= this.aFloat177 && this.aFloat173 >= (float) local86 && this.aFloat167 <= (float) local119 && (float) local119 <= this.aFloat162) {
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local119 - this.aFloat167);
			arg4[0] = (int) ((float) local86 - this.aFloat177);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	@Override
	public void method8111(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(IIII)V")
	public void method6349(@OriginalArg(0) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "()Z")
	@Override
	public boolean method8135() {
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(IZ)I")
	public int method6350(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(FFZF)V")
	private void method6351(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean561) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg0, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean561 = true;
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt7300 && arg1 == this.anInt7298) {
			return;
		}
		this.anInt7300 = arg0;
		this.anInt7298 = arg1;
		this.method6319();
		this.method6356();
		if (this.anInt7307 == 3) {
			this.method6371();
			return;
		}
		if (this.anInt7307 != 2) {
			return;
		}
		this.method6321();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZ)Lclient!tf;")
	@Override
	public Class17 method8145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class17_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "()Z")
	@Override
	public boolean method8127() {
		return this.aClass219_1.method4753();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Z")
	@Override
	public boolean method8071() {
		return false;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BII[BZ)Lclient!bia;")
	public Interface5 method6352(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) boolean arg2) {
		return (Interface5) (this.aBoolean576 && (!arg2 || this.aBoolean559) ? new Class238_Sub2(this, 5123, arg1, arg0, arg2) : new Class322_Sub2(this, 5123, arg1, arg0));
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Lclient!up;")
	@Override
	public Interface23 method8113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean564 = arg0;
		this.method6324();
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(Z)V")
	private void method6353() {
		this.aFloat177 = (float) (this.anInt7308 - this.anInt7277);
		this.aFloat162 = (float) (this.anInt7302 - this.anInt7297);
		this.aFloat167 = (float) (this.anInt7279 - this.anInt7297);
		this.aFloat173 = (float) (this.anInt7285 - this.anInt7277);
	}

	@OriginalMember(owner = "client!pc", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat176) {
			this.aFloat176 = arg0;
			this.method6333();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!ve;)V")
	public void method6354(@OriginalArg(1) Interface24 arg0) {
		if (this.anInt7267 < 0 || this.anInterface24Array2[this.anInt7267] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface24Array2[this.anInt7267--] = null;
		arg0.method8430();
		if (this.anInt7267 >= 0) {
			this.anInterface24_2 = this.anInterface24Array2[this.anInt7267];
			this.anInterface24_2.method8432();
		} else {
			this.anInterface24_2 = null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "()V")
	@Override
	public void method8153() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "(I)V")
	public void method6355() {
		if (this.anInt7273 == 2) {
			return;
		}
		this.method6297();
		this.method6317(false);
		this.method6296(false);
		this.method6310(false);
		this.method6312(false);
		this.method6305(-2);
		this.anInt7273 = 2;
	}

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "(I)V")
	private void method6356() {
		this.aFloat165 = (float) (this.anInt7298 - this.anInt7291) - this.aFloat170;
		this.aFloat178 = this.aFloat165 - (float) this.anInt7305 * this.aFloat181;
		if (this.aFloat178 < (float) this.anInt7300) {
			this.aFloat178 = (float) this.anInt7300;
		}
		OpenGL.glFogf(2915, this.aFloat178);
		OpenGL.glFogf(2916, this.aFloat165);
		Static573.aFloatArray64[1] = (float) (this.anInt7301 & 0xFF00) / 65280.0F;
		Static573.aFloatArray64[2] = (float) (this.anInt7301 & 0xFF) / 255.0F;
		Static573.aFloatArray64[0] = (float) (this.anInt7301 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static573.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!pc", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt7309;
		this.anInt7309 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIF)Lclient!kp;")
	@Override
	public Class4_Sub29 method8075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub29_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "(II)V")
	public void method6357(@OriginalArg(0) int arg0) {
		Static573.aFloatArray64[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static573.aFloatArray64[3] = (float) (arg0 >>> 24) / 255.0F;
		Static573.aFloatArray64[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static573.aFloatArray64[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static573.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "(I)V")
	private void method6358() {
		if (this.anInt7308 <= this.anInt7285 && this.anInt7279 <= this.anInt7302) {
			OpenGL.glScissor(this.anInt7308 + this.anInt7287, this.anInt7088 + this.anInt7295 + -this.anInt7302, this.anInt7285 - this.anInt7308, this.anInt7302 - this.anInt7279);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8132(@OriginalArg(0) Canvas arg0) {
		this.aLong210 = 0L;
		this.aCanvas10 = null;
		if (arg0 == null || arg0 == this.aCanvas9) {
			this.aLong210 = this.aLong209;
			this.aCanvas10 = this.aCanvas9;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable4.get(arg0);
			this.aLong210 = local36;
			this.aCanvas10 = arg0;
		}
		if (this.aCanvas10 == null || this.aLong210 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong210);
		this.method6326();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIZ)Lclient!tf;")
	@Override
	public Class17 method8151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class17_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "()Z")
	@Override
	public boolean method8101() {
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6334();
		this.method6292(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "()I")
	@Override
	public int method8086() {
		return 4;
	}

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "()Lclient!ub;")
	@Override
	public Class359 method8115() {
		@Pc(7) int local7 = -1;
		if (this.aString85.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString85.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString85.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class359(local7, "OpenGL", this.anInt7284, this.aString86, 0L);
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "(B)V")
	public void method6359() {
		if (this.anInt7273 == 4) {
			return;
		}
		this.method6297();
		this.method6317(false);
		this.method6296(false);
		this.method6310(false);
		this.method6312(false);
		this.method6305(-2);
		this.method6292(1);
		this.anInt7273 = 4;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!ve;)V")
	public void method6360(@OriginalArg(1) Interface24 arg0) {
		if (this.aBoolean560) {
			this.method6372(arg0);
			this.method6347(arg0);
		} else if (this.anInt7266 < 3) {
			if (this.anInt7266 >= 0) {
				this.anInterface24Array3[this.anInt7266].method8434();
			}
			this.anInterface24_1 = this.anInterface24_2 = this.anInterface24Array3[++this.anInt7266] = arg0;
			this.anInterface24_1.method8435();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method6334();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method6292(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean562) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean562) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IF)V")
	public void method6362(@OriginalArg(1) float arg0) {
		if (this.aFloat163 != arg0) {
			this.aFloat163 = arg0;
			if (this.anInt7307 == 3) {
				this.method6371();
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(IIIIII)V")
	@Override
	public void method8142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method6334();
		this.method6292(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean562) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean562) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "(I)V")
	private void method6363() {
		if (this.anInt7307 != 2) {
			this.anInt7307 = 2;
			this.method6321();
			this.method6320();
			this.anInt7273 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pc", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt7308 || arg0 - arg2 > this.anInt7285 || arg1 + arg2 < this.anInt7279 || this.anInt7302 < arg1 - arg2) {
			return;
		}
		this.method6334();
		this.method6292(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(65) float local65 = (float) arg0 + 0.35F;
		@Pc(70) float local70 = (float) arg1 + 0.35F;
		@Pc(74) int local74 = arg2 << 1;
		if (this.aFloat175 > (float) local74) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local65 + 1.0F, local70 + 1.0F);
			OpenGL.glVertex2f(local65 + 1.0F, local70 - 1.0F);
			OpenGL.glVertex2f(local65 - 1.0F, -1.0F + local70);
			OpenGL.glVertex2f(local65 - 1.0F, local70 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local74 <= this.aFloat168) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local74);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local65, local70);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local65, local70);
			@Pc(143) int local143 = 262144 / (arg2 * 6);
			if (local143 <= 64) {
				local143 = 64;
			} else if (local143 > 512) {
				local143 = 512;
			}
			local143 = Static125.method2245(local143);
			OpenGL.glVertex2f(local65 + (float) arg2, local70);
			for (@Pc(172) int local172 = 16384 - local143; local172 > 0; local172 -= local143) {
				OpenGL.glVertex2f(local65 + (float) arg2 * Class136.aFloatArray18[local172], local70 + (float) arg2 * Class136.aFloatArray19[local172]);
			}
			OpenGL.glVertex2f((float) arg2 + local65, local70);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(FFFFI)V")
	public void method6364(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static573.aFloatArray64[1] = arg0;
		Static573.aFloatArray64[0] = arg3;
		Static573.aFloatArray64[3] = arg2;
		Static573.aFloatArray64[2] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static573.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(III)V")
	public void method6365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7296 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(12) boolean local12 = false;
		if (this.anInt7278 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt7278 = arg1;
			local12 = true;
		}
		if (this.anInt7276 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			this.anInt7276 = arg0;
			local12 = true;
		}
		if (local12) {
			this.anInt7273 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "(I)Lclient!hfa;")
	public Class116_Sub1 method6366() {
		return this.aClass68_Sub2_1 == null ? null : this.aClass68_Sub2_1.method8702();
	}

	@OriginalMember(owner = "client!pc", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6312(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "(I)V")
	public void method6367() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8098(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas9 == arg0) {
			local5 = this.aLong209;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable4.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas10) {
			this.method6326();
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(Lclient!ve;I)V")
	public void method6368(@OriginalArg(0) Interface24 arg0) {
		if (this.aBoolean560) {
			this.method6294(arg0);
			this.method6354(arg0);
		} else if (this.anInt7266 >= 0 && this.anInterface24Array3[this.anInt7266] == arg0) {
			this.anInterface24Array3[this.anInt7266--] = null;
			arg0.method8434();
			if (this.anInt7266 >= 0) {
				this.anInterface24_1 = this.anInterface24_2 = this.anInterface24Array3[this.anInt7266];
				this.anInterface24_1.method8435();
			} else {
				this.anInterface24_1 = this.anInterface24_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "()Z")
	@Override
	public boolean method8104() {
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!hea;B)V")
	public void method6369(@OriginalArg(0) Class92_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method3225(), 0);
	}

	@OriginalMember(owner = "client!pc", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt7285 = this.anInt7157;
		this.anInt7279 = 0;
		this.anInt7302 = this.anInt7088;
		this.anInt7308 = 0;
		OpenGL.glDisable(3089);
		this.method6353();
	}

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "()Lclient!nh;")
	@Override
	public Class92 method8118() {
		return new Class92_Sub2();
	}

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6334();
		this.method6292(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBZ)V")
	public void method6370(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method6309(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
	@Override
	public void method8109(@OriginalArg(0) int arg0) {
		this.method6374();
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "(B)V")
	private void method6371() {
		@Pc(19) float local19 = (float) -this.anInt7277 * this.aFloat163 / (float) this.anInt7304;
		@Pc(31) float local31 = this.aFloat163 * (float) -this.anInt7297 / (float) this.anInt7280;
		@Pc(45) float local45 = this.aFloat163 * (float) (this.anInt7157 - this.anInt7277) / (float) this.anInt7304;
		@Pc(59) float local59 = this.aFloat163 * (float) (this.anInt7088 - this.anInt7297) / (float) this.anInt7280;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local19 != local45 && local31 != local59) {
			OpenGL.glOrtho((double) local19, (double) local45, (double) -local59, (double) -local31, (double) this.anInt7300, (double) this.anInt7298);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "()Z")
	@Override
	public boolean method8114() {
		return this.aBoolean562 && (!this.method8136() || this.aBoolean573);
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(Lclient!ve;I)V")
	public void method6372(@OriginalArg(0) Interface24 arg0) {
		if (this.anInt7268 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7268 >= 0) {
			this.anInterface24Array1[this.anInt7268].method8431();
		}
		this.anInterface24_1 = this.anInterface24Array1[++this.anInt7268] = arg0;
		this.anInterface24_1.method8433();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(FFB)V")
	public void method6373(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 = arg0;
		this.aFloat170 = arg1;
		this.method6356();
	}

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "(B)V")
	private void method6374() {
		@Pc(15) int local15 = 0;
		while (!this.anOpenGL2.a()) {
			if (local15++ > 5) {
				throw new RuntimeException("");
			}
			Static491.method6679(1000L);
		}
	}
}
