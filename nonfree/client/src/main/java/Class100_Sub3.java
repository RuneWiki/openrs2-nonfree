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

@OriginalClass("client!vf")
public final class Class100_Sub3 extends Class100 {

	@OriginalMember(owner = "client!vf", name = "de", descriptor = "I")
	private int anInt10127;

	@OriginalMember(owner = "client!vf", name = "id", descriptor = "I")
	public int anInt10154;

	@OriginalMember(owner = "client!vf", name = "Eg", descriptor = "I")
	public int anInt10175;

	@OriginalMember(owner = "client!vf", name = "Yg", descriptor = "I")
	private int anInt10183;

	@OriginalMember(owner = "client!vf", name = "Ib", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!vf", name = "Ub", descriptor = "I")
	public int anInt10257;

	@OriginalMember(owner = "client!vf", name = "sh", descriptor = "Lclient!dr;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!vf", name = "eg", descriptor = "Lclient!ro;")
	private Class155_Sub3 aClass155_Sub3_1;

	@OriginalMember(owner = "client!vf", name = "vf", descriptor = "Lclient!dr;")
	private Interface10 anInterface10_2;

	@OriginalMember(owner = "client!vf", name = "xc", descriptor = "Lclient!lea;")
	private Class219 aClass219_6;

	@OriginalMember(owner = "client!vf", name = "sc", descriptor = "I")
	public int anInt10261;

	@OriginalMember(owner = "client!vf", name = "Hf", descriptor = "I")
	private int anInt10262;

	@OriginalMember(owner = "client!vf", name = "Ae", descriptor = "I")
	public int anInt10263;

	@OriginalMember(owner = "client!vf", name = "vg", descriptor = "I")
	private int anInt10264;

	@OriginalMember(owner = "client!vf", name = "fh", descriptor = "Z")
	private boolean aBoolean712;

	@OriginalMember(owner = "client!vf", name = "Mc", descriptor = "Z")
	private boolean aBoolean713;

	@OriginalMember(owner = "client!vf", name = "Dc", descriptor = "J")
	private long aLong290;

	@OriginalMember(owner = "client!vf", name = "Ah", descriptor = "I")
	private int anInt10265;

	@OriginalMember(owner = "client!vf", name = "Ng", descriptor = "Z")
	private boolean aBoolean714;

	@OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
	private int anInt10266;

	@OriginalMember(owner = "client!vf", name = "Hd", descriptor = "Z")
	private boolean aBoolean715;

	@OriginalMember(owner = "client!vf", name = "Xd", descriptor = "Lclient!bv;")
	private Interface6 anInterface6_5;

	@OriginalMember(owner = "client!vf", name = "db", descriptor = "Lclient!bp;")
	public Class43_Sub1 aClass43_Sub1_1;

	@OriginalMember(owner = "client!vf", name = "rb", descriptor = "Lclient!ub;")
	private Class29_Sub3_Sub1 aClass29_Sub3_Sub1_5;

	@OriginalMember(owner = "client!vf", name = "vc", descriptor = "Ljava/lang/String;")
	private String aString116;

	@OriginalMember(owner = "client!vf", name = "Fe", descriptor = "Z")
	public boolean aBoolean716;

	@OriginalMember(owner = "client!vf", name = "jf", descriptor = "Z")
	private boolean aBoolean717;

	@OriginalMember(owner = "client!vf", name = "dh", descriptor = "Lclient!ika;")
	private Interface17 anInterface17_6;

	@OriginalMember(owner = "client!vf", name = "jb", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!vf", name = "rc", descriptor = "Z")
	private boolean aBoolean720;

	@OriginalMember(owner = "client!vf", name = "X", descriptor = "Lclient!bp;")
	public Class43_Sub1 aClass43_Sub1_2;

	@OriginalMember(owner = "client!vf", name = "Re", descriptor = "Z")
	public boolean aBoolean721;

	@OriginalMember(owner = "client!vf", name = "Jg", descriptor = "Lclient!vba;")
	private Class185_Sub1 aClass185_Sub1_1;

	@OriginalMember(owner = "client!vf", name = "og", descriptor = "Z")
	public boolean aBoolean722;

	@OriginalMember(owner = "client!vf", name = "Lc", descriptor = "Z")
	public boolean aBoolean723;

	@OriginalMember(owner = "client!vf", name = "F", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!vf", name = "oc", descriptor = "Lclient!kia;")
	public Class29_Sub3 aClass29_Sub3_6;

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "Z")
	public boolean aBoolean725;

	@OriginalMember(owner = "client!vf", name = "Ne", descriptor = "I")
	public int anInt10276;

	@OriginalMember(owner = "client!vf", name = "V", descriptor = "Z")
	private boolean aBoolean726;

	@OriginalMember(owner = "client!vf", name = "zh", descriptor = "Z")
	public boolean aBoolean727;

	@OriginalMember(owner = "client!vf", name = "ce", descriptor = "Z")
	public boolean aBoolean728;

	@OriginalMember(owner = "client!vf", name = "nd", descriptor = "Z")
	private boolean aBoolean729;

	@OriginalMember(owner = "client!vf", name = "se", descriptor = "Lclient!kn;")
	public Class207 aClass207_15;

	@OriginalMember(owner = "client!vf", name = "sg", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!vf", name = "qb", descriptor = "Lclient!bp;")
	public Class43_Sub1 aClass43_Sub1_3;

	@OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
	private int anInt10280;

	@OriginalMember(owner = "client!vf", name = "Uc", descriptor = "I")
	private int anInt10281;

	@OriginalMember(owner = "client!vf", name = "Ef", descriptor = "F")
	public float aFloat202;

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
	private int anInt10282;

	@OriginalMember(owner = "client!vf", name = "be", descriptor = "Lclient!bp;")
	public Class43_Sub1 aClass43_Sub1_4;

	@OriginalMember(owner = "client!vf", name = "mf", descriptor = "Lclient!ika;")
	private Interface17 anInterface17_7;

	@OriginalMember(owner = "client!vf", name = "Df", descriptor = "Z")
	private boolean aBoolean733;

	@OriginalMember(owner = "client!vf", name = "Me", descriptor = "[Lclient!gb;")
	private Class29[] aClass29Array1;

	@OriginalMember(owner = "client!vf", name = "Of", descriptor = "F")
	private float aFloat206;

	@OriginalMember(owner = "client!vf", name = "Fc", descriptor = "Lclient!bp;")
	public Class43_Sub1 aClass43_Sub1_5;

	@OriginalMember(owner = "client!vf", name = "Gd", descriptor = "I")
	public int anInt10285;

	@OriginalMember(owner = "client!vf", name = "Ve", descriptor = "Z")
	public boolean aBoolean735;

	@OriginalMember(owner = "client!vf", name = "ch", descriptor = "F")
	public float aFloat207;

	@OriginalMember(owner = "client!vf", name = "ug", descriptor = "I")
	private int anInt10286;

	@OriginalMember(owner = "client!vf", name = "Mf", descriptor = "I")
	public int anInt10287;

	@OriginalMember(owner = "client!vf", name = "Wb", descriptor = "I")
	private int anInt10288;

	@OriginalMember(owner = "client!vf", name = "rd", descriptor = "F")
	private float aFloat208;

	@OriginalMember(owner = "client!vf", name = "Mg", descriptor = "Lclient!bp;")
	public Class43_Sub1 aClass43_Sub1_6;

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "Lclient!bp;")
	public Class43_Sub1 aClass43_Sub1_7;

	@OriginalMember(owner = "client!vf", name = "vd", descriptor = "I")
	public int anInt10290;

	@OriginalMember(owner = "client!vf", name = "Ed", descriptor = "Z")
	public boolean aBoolean736;

	@OriginalMember(owner = "client!vf", name = "Hb", descriptor = "Z")
	private boolean aBoolean737;

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
	private int anInt10293;

	@OriginalMember(owner = "client!vf", name = "Gf", descriptor = "F")
	private float aFloat209;

	@OriginalMember(owner = "client!vf", name = "If", descriptor = "Z")
	public boolean aBoolean738;

	@OriginalMember(owner = "client!vf", name = "df", descriptor = "Z")
	private boolean aBoolean739;

	@OriginalMember(owner = "client!vf", name = "gb", descriptor = "Lclient!bp;")
	public Class43_Sub1 aClass43_Sub1_8;

	@OriginalMember(owner = "client!vf", name = "ve", descriptor = "Lclient!lea;")
	public Class219 aClass219_7;

	@OriginalMember(owner = "client!vf", name = "yf", descriptor = "Ljava/lang/String;")
	private String aString117;

	@OriginalMember(owner = "client!vf", name = "ff", descriptor = "Lclient!bp;")
	public Class43_Sub1 aClass43_Sub1_9;

	@OriginalMember(owner = "client!vf", name = "ph", descriptor = "F")
	public float aFloat210;

	@OriginalMember(owner = "client!vf", name = "Pd", descriptor = "I")
	private int anInt10297;

	@OriginalMember(owner = "client!vf", name = "uf", descriptor = "I")
	private int anInt10298;

	@OriginalMember(owner = "client!vf", name = "tc", descriptor = "Lclient!bp;")
	public Class43_Sub1 aClass43_Sub1_10;

	@OriginalMember(owner = "client!vf", name = "yc", descriptor = "Lclient!kn;")
	public Class207 aClass207_16;

	@OriginalMember(owner = "client!vf", name = "Ec", descriptor = "I")
	private int anInt10299;

	@OriginalMember(owner = "client!vf", name = "fe", descriptor = "I")
	private int anInt10300;

	@OriginalMember(owner = "client!vf", name = "ze", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable16 = new Hashtable();

	@OriginalMember(owner = "client!vf", name = "fc", descriptor = "I")
	public int anInt10238 = 128;

	@OriginalMember(owner = "client!vf", name = "ee", descriptor = "Lclient!hf;")
	private final Class150 aClass150_1 = new Class150();

	@OriginalMember(owner = "client!vf", name = "Fg", descriptor = "Lclient!fh;")
	private final Class10_Sub3 aClass10_Sub3_1 = new Class10_Sub3();

	@OriginalMember(owner = "client!vf", name = "ye", descriptor = "Lclient!fh;")
	public final Class10_Sub3 aClass10_Sub3_2 = new Class10_Sub3();

	@OriginalMember(owner = "client!vf", name = "gg", descriptor = "I")
	public int anInt10256 = 3;

	@OriginalMember(owner = "client!vf", name = "Oe", descriptor = "I")
	public int anInt10255 = 8;

	@OriginalMember(owner = "client!vf", name = "ue", descriptor = "Z")
	private boolean aBoolean711 = false;

	@OriginalMember(owner = "client!vf", name = "zd", descriptor = "Lclient!at;")
	private final Class20 aClass20_63 = new Class20();

	@OriginalMember(owner = "client!vf", name = "Ze", descriptor = "[Lclient!dr;")
	private final Interface10[] anInterface10Array1 = new Interface10[4];

	@OriginalMember(owner = "client!vf", name = "ad", descriptor = "[Lclient!dr;")
	private final Interface10[] anInterface10Array2 = new Interface10[4];

	@OriginalMember(owner = "client!vf", name = "pf", descriptor = "[Lclient!dr;")
	private final Interface10[] anInterface10Array3 = new Interface10[4];

	@OriginalMember(owner = "client!vf", name = "Vf", descriptor = "I")
	private int anInt10260 = -1;

	@OriginalMember(owner = "client!vf", name = "wg", descriptor = "I")
	private int anInt10259 = -1;

	@OriginalMember(owner = "client!vf", name = "ge", descriptor = "I")
	private int anInt10258 = -1;

	@OriginalMember(owner = "client!vf", name = "Ld", descriptor = "Lclient!at;")
	private final Class20 aClass20_64;

	@OriginalMember(owner = "client!vf", name = "qg", descriptor = "Lclient!at;")
	private final Class20 aClass20_65;

	@OriginalMember(owner = "client!vf", name = "Vg", descriptor = "Lclient!at;")
	private final Class20 aClass20_66;

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "Lclient!at;")
	private final Class20 aClass20_67;

	@OriginalMember(owner = "client!vf", name = "Cf", descriptor = "Lclient!at;")
	private final Class20 aClass20_68;

	@OriginalMember(owner = "client!vf", name = "qc", descriptor = "Lclient!at;")
	private final Class20 aClass20_69;

	@OriginalMember(owner = "client!vf", name = "Og", descriptor = "Lclient!at;")
	private final Class20 aClass20_70;

	@OriginalMember(owner = "client!vf", name = "ie", descriptor = "Lclient!fh;")
	public final Class10_Sub3 aClass10_Sub3_3;

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "Lclient!fh;")
	public final Class10_Sub3 aClass10_Sub3_4;

	@OriginalMember(owner = "client!vf", name = "Pf", descriptor = "Lclient!fh;")
	public final Class10_Sub3 aClass10_Sub3_5;

	@OriginalMember(owner = "client!vf", name = "Dd", descriptor = "[F")
	public final float[] aFloatArray71;

	@OriginalMember(owner = "client!vf", name = "Tb", descriptor = "I")
	private int anInt10269;

	@OriginalMember(owner = "client!vf", name = "Bb", descriptor = "F")
	private float aFloat194;

	@OriginalMember(owner = "client!vf", name = "Ee", descriptor = "I")
	private int anInt10274;

	@OriginalMember(owner = "client!vf", name = "ke", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!vf", name = "Ff", descriptor = "F")
	private float aFloat195;

	@OriginalMember(owner = "client!vf", name = "tg", descriptor = "[F")
	private final float[] aFloatArray73;

	@OriginalMember(owner = "client!vf", name = "lc", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!vf", name = "uh", descriptor = "F")
	public float aFloat201;

	@OriginalMember(owner = "client!vf", name = "fb", descriptor = "F")
	public float aFloat197;

	@OriginalMember(owner = "client!vf", name = "Hg", descriptor = "I")
	public int anInt10268;

	@OriginalMember(owner = "client!vf", name = "Xf", descriptor = "I")
	public int anInt10273;

	@OriginalMember(owner = "client!vf", name = "rg", descriptor = "F")
	private float aFloat191;

	@OriginalMember(owner = "client!vf", name = "Sb", descriptor = "I")
	private int anInt10278;

	@OriginalMember(owner = "client!vf", name = "gd", descriptor = "I")
	public int anInt10270;

	@OriginalMember(owner = "client!vf", name = "Qg", descriptor = "I")
	private int anInt10275;

	@OriginalMember(owner = "client!vf", name = "Le", descriptor = "Z")
	private boolean aBoolean718;

	@OriginalMember(owner = "client!vf", name = "Kd", descriptor = "I")
	private int anInt10289;

	@OriginalMember(owner = "client!vf", name = "mg", descriptor = "F")
	public float aFloat203;

	@OriginalMember(owner = "client!vf", name = "ah", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!vf", name = "Ig", descriptor = "I")
	private int anInt10271;

	@OriginalMember(owner = "client!vf", name = "Yd", descriptor = "[F")
	private final float[] aFloatArray72;

	@OriginalMember(owner = "client!vf", name = "kd", descriptor = "I")
	public int anInt10272;

	@OriginalMember(owner = "client!vf", name = "hh", descriptor = "I")
	public int anInt10291;

	@OriginalMember(owner = "client!vf", name = "Nf", descriptor = "I")
	private int anInt10279;

	@OriginalMember(owner = "client!vf", name = "we", descriptor = "I")
	private int anInt10283;

	@OriginalMember(owner = "client!vf", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!vf", name = "Lf", descriptor = "F")
	private float aFloat204;

	@OriginalMember(owner = "client!vf", name = "Yc", descriptor = "I")
	public int anInt10267;

	@OriginalMember(owner = "client!vf", name = "hb", descriptor = "I")
	private int anInt10294;

	@OriginalMember(owner = "client!vf", name = "Db", descriptor = "I")
	public int anInt10295;

	@OriginalMember(owner = "client!vf", name = "kb", descriptor = "[F")
	private final float[] aFloatArray74;

	@OriginalMember(owner = "client!vf", name = "Zb", descriptor = "[Lclient!ih;")
	private final Class5_Sub12[] aClass5_Sub12Array6;

	@OriginalMember(owner = "client!vf", name = "Pb", descriptor = "I")
	public int anInt10277;

	@OriginalMember(owner = "client!vf", name = "Tg", descriptor = "Z")
	private boolean aBoolean740;

	@OriginalMember(owner = "client!vf", name = "oh", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!vf", name = "Ye", descriptor = "I")
	public int anInt10292;

	@OriginalMember(owner = "client!vf", name = "nc", descriptor = "F")
	private float aFloat205;

	@OriginalMember(owner = "client!vf", name = "fd", descriptor = "I")
	public int anInt10296;

	@OriginalMember(owner = "client!vf", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!vf", name = "O", descriptor = "[F")
	private final float[] aFloatArray75;

	@OriginalMember(owner = "client!vf", name = "Jc", descriptor = "Lclient!mka;")
	public Class5_Sub36_Sub1 aClass5_Sub36_Sub1_3;

	@OriginalMember(owner = "client!vf", name = "Rd", descriptor = "[I")
	public int[] anIntArray582;

	@OriginalMember(owner = "client!vf", name = "eh", descriptor = "[I")
	public int[] anIntArray581;

	@OriginalMember(owner = "client!vf", name = "xh", descriptor = "[B")
	public final byte[] aByteArray106;

	@OriginalMember(owner = "client!vf", name = "Xc", descriptor = "[I")
	public int[] anIntArray583;

	@OriginalMember(owner = "client!vf", name = "Jf", descriptor = "I")
	public final int anInt10236;

	@OriginalMember(owner = "client!vf", name = "md", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas13;

	@OriginalMember(owner = "client!vf", name = "Rf", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!vf", name = "Od", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!vf", name = "bc", descriptor = "J")
	private final long aLong288;

	@OriginalMember(owner = "client!vf", name = "Bd", descriptor = "J")
	private long aLong289;

	@OriginalMember(owner = "client!vf", name = "nb", descriptor = "I")
	public final int anInt10284;

	@OriginalMember(owner = "client!vf", name = "je", descriptor = "Z")
	public boolean aBoolean742;

	@OriginalMember(owner = "client!vf", name = "Ab", descriptor = "Z")
	private boolean aBoolean724;

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "Z")
	public boolean aBoolean730;

	@OriginalMember(owner = "client!vf", name = "Sg", descriptor = "Z")
	public boolean aBoolean731;

	@OriginalMember(owner = "client!vf", name = "lg", descriptor = "Z")
	private boolean aBoolean719;

	@OriginalMember(owner = "client!vf", name = "cf", descriptor = "Z")
	public boolean aBoolean734;

	@OriginalMember(owner = "client!vf", name = "Y", descriptor = "Z")
	public boolean aBoolean741;

	@OriginalMember(owner = "client!vf", name = "Sd", descriptor = "Z")
	private final boolean aBoolean732;

	@OriginalMember(owner = "client!vf", name = "Ke", descriptor = "Lclient!dd;")
	private final Class76 aClass76_1;

	@OriginalMember(owner = "client!vf", name = "Rg", descriptor = "Lclient!oka;")
	public final Class271 aClass271_1;

	@OriginalMember(owner = "client!vf", name = "nf", descriptor = "Lclient!kp;")
	private final Class209 aClass209_1;

	@OriginalMember(owner = "client!vf", name = "Q", descriptor = "Lclient!go;")
	private Class5_Sub23_Sub1 aClass5_Sub23_Sub1_1;

	@OriginalMember(owner = "client!vf", name = "ag", descriptor = "Lclient!ab;")
	private final Class3 aClass3_1;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class100_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class388();
		new Class306(16);
		this.aClass20_64 = new Class20();
		this.aClass20_65 = new Class20();
		this.aClass20_66 = new Class20();
		this.aClass20_67 = new Class20();
		this.aClass20_68 = new Class20();
		this.aClass20_69 = new Class20();
		this.aClass20_70 = new Class20();
		this.aClass10_Sub3_3 = new Class10_Sub3();
		this.aClass10_Sub3_4 = new Class10_Sub3();
		this.aClass10_Sub3_5 = new Class10_Sub3();
		this.aFloatArray71 = new float[4];
		this.anInt10269 = -1;
		this.aFloat194 = -1.0F;
		this.anInt10274 = 0;
		this.aFloat192 = 1.0F;
		this.aFloat195 = 1.0F;
		this.aFloatArray73 = new float[4];
		this.aFloat199 = 1.0F;
		this.aFloat201 = 1.0F;
		this.aFloat197 = 3584.0F;
		this.anInt10268 = -1;
		this.anInt10273 = 512;
		this.aFloat191 = 1.0F;
		this.anInt10278 = 0;
		this.anInt10270 = -1;
		this.anInt10275 = 0;
		this.aBoolean718 = true;
		this.anInt10289 = 8448;
		this.aFloat203 = -1.0F;
		this.aFloat193 = -1.0F;
		this.anInt10271 = 0;
		this.aFloatArray72 = new float[4];
		this.anInt10272 = 0;
		this.anInt10291 = 50;
		this.anInt10279 = 3584;
		this.anInt10283 = 0;
		this.lb = -1;
		this.aFloat204 = 0.0F;
		this.anInt10267 = 0;
		this.anInt10294 = 0;
		this.anInt10295 = 0;
		this.aFloatArray74 = new float[4];
		this.aClass5_Sub12Array6 = new Class5_Sub12[Static120.anInt1954];
		this.anInt10277 = 0;
		this.aBoolean740 = false;
		this.aFloat198 = 3584.0F;
		this.anInt10292 = -1;
		this.aFloat205 = -1.0F;
		this.anInt10296 = 512;
		this.bf = 8448;
		this.aFloatArray75 = new float[16];
		this.aClass5_Sub36_Sub1_3 = new Class5_Sub36_Sub1(8192);
		this.anIntArray582 = new int[1];
		this.anIntArray581 = new int[1];
		this.aByteArray106 = new byte[16384];
		this.anIntArray583 = new int[1];
		this.anInt10236 = arg2;
		this.aCanvas12 = this.aCanvas13 = arg0;
		if (!Static472.method6674("jaclib")) {
			throw new RuntimeException("");
		} else if (Static472.method6674("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong289 = this.aLong288 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt10236);
				if (this.aLong288 == 0L) {
					throw new RuntimeException("");
				}
				this.method8695();
				@Pc(339) int local339 = this.method8710();
				if (local339 != 0) {
					throw new RuntimeException("");
				}
				this.anInt10284 = this.aBoolean735 ? 33639 : 5121;
				if (this.aString117.indexOf("radeon") != -1) {
					@Pc(369) int local369 = 0;
					@Pc(371) boolean local371 = false;
					@Pc(373) boolean local373 = false;
					@Pc(382) String[] local382 = Static350.method5156(' ', this.aString117.replace('/', ' '));
					for (@Pc(384) int local384 = 0; local384 < local382.length; local384++) {
						@Pc(390) String local390 = local382[local384];
						try {
							if (local390.length() > 0) {
								if (local390.charAt(0) == 'x' && local390.length() >= 3 && Static352.method5186(local390.substring(1, 3))) {
									local373 = true;
									local390 = local390.substring(1);
								}
								if (local390.equals("hd")) {
									local371 = true;
								} else {
									if (local390.startsWith("hd")) {
										local371 = true;
										local390 = local390.substring(2);
									}
									if (local390.length() >= 4 && Static352.method5186(local390.substring(0, 4))) {
										local369 = Static407.method5956(local390.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(471) Exception local471) {
						}
					}
					if (!local373 && !local371) {
						if (local369 >= 7000 && local369 <= 9250) {
							this.aBoolean742 = false;
						}
						if (local369 >= 7000 && local369 <= 7999) {
							this.aBoolean724 = false;
						}
					}
					if (!local371 || local369 < 4000) {
						this.aBoolean730 = false;
					}
					this.aBoolean731 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean719 = this.aBoolean724;
					this.aBoolean734 = true;
				}
				if (this.aString116.indexOf("intel") != -1) {
					this.aBoolean741 = false;
				}
				this.aBoolean732 = !this.aString116.equals("s3 graphics");
				if (this.aBoolean724) {
					try {
						@Pc(578) int[] local578 = new int[1];
						OpenGL.glGenBuffersARB(1, local578, 0);
					} catch (@Pc(584) Throwable local584) {
						throw new RuntimeException("");
					}
				}
				Static207.method3389(true, false);
				this.aBoolean711 = true;
				this.aClass76_1 = new Class76(this, super.anInterface7_12);
				this.method8746();
				this.aClass271_1 = new Class271(this);
				this.aClass209_1 = new Class209(this);
				if (this.aClass209_1.method4803()) {
					this.aClass5_Sub23_Sub1_1 = new Class5_Sub23_Sub1(this);
					if (!this.aClass5_Sub23_Sub1_1.method3265()) {
						this.aClass5_Sub23_Sub1_1.method3252();
						this.aClass5_Sub23_Sub1_1 = null;
					}
				}
				this.aClass3_1 = new Class3(this);
				this.method8690();
				this.method8675();
				this.method8663();
			} catch (@Pc(662) Throwable local662) {
				local662.printStackTrace();
				this.method8653();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!vf", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method8684();
		this.method8728(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean717) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean717) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)Lclient!tq;")
	@Override
	public Interface26 method8642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
	@Override
	public void method8608(@OriginalArg(0) int arg0) {
		this.method8695();
	}

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "(B)V")
	public void method8668() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "()Z")
	@Override
	public boolean method8632() {
		return true;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method8669(@OriginalArg(0) Class10_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method2819(), 0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!dr;B)V")
	public void method8670(@OriginalArg(0) Interface10 arg0) {
		if (this.aBoolean722) {
			this.method8731(arg0);
			this.method8689(arg0);
		} else if (this.anInt10260 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt10260 >= 0) {
				this.anInterface10Array2[this.anInt10260].method4965();
			}
			this.anInterface10_2 = this.anInterface10_1 = this.anInterface10Array2[++this.anInt10260] = arg0;
			this.anInterface10_2.method4962();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!lia;)V")
	@Override
	public void method8639(@OriginalArg(0) Class185 arg0) {
		this.aClass185_Sub1_1 = (Class185_Sub1) arg0;
	}

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "()Lclient!sj;")
	@Override
	public Class10 method8610() {
		return this.aClass10_Sub3_1;
	}

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "()Z")
	@Override
	public boolean method8656() {
		return this.aClass5_Sub23_Sub1_1 != null && this.aClass5_Sub23_Sub1_1.method3259();
	}

	@OriginalMember(owner = "client!vf", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt10175 - local12 - arg1, arg2, 1, 32993, this.anInt10284, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)V")
	public void method8671(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method8738(7681, 7681);
		} else if (arg0 == 0) {
			this.method8738(8448, 8448);
		} else if (arg0 == 2) {
			this.method8738(7681, 34165);
		} else if (arg0 == 3) {
			this.method8738(8448, 260);
		} else if (arg0 == 4) {
			this.method8738(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(IIIIII)Lclient!lia;")
	@Override
	public Class185 method8658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean721 ? new Class185_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V")
	private void method8672() {
		@Pc(15) float local15 = (float) -this.anInt10295 * this.aFloat191 / (float) this.anInt10296;
		@Pc(27) float local27 = this.aFloat191 * (float) -this.anInt10277 / (float) this.anInt10273;
		@Pc(47) float local47 = (float) (this.anInt10154 - this.anInt10295) * this.aFloat191 / (float) this.anInt10296;
		@Pc(62) float local62 = this.aFloat191 * (float) (this.anInt10175 - this.anInt10277) / (float) this.anInt10273;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local47 != local15 && local27 != local62) {
			OpenGL.glOrtho((double) local15, (double) local47, (double) -local62, (double) -local27, (double) this.anInt10291, (double) this.anInt10279);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(IIII)V")
	public void method8673(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "()Z")
	@Override
	public boolean method8622() {
		return true;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		this.method8684();
		this.method8728(1);
		@Pc(32) float local32 = (float) arg2 - (float) arg0;
		@Pc(38) float local38 = (float) arg3 - (float) arg1;
		@Pc(51) float local51 = (float) (1.0D / Math.sqrt((double) (local32 * local32 + local38 * local38)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(70) float local70 = local32 * local51;
		@Pc(76) int local76 = arg7 % (arg6 + arg5);
		@Pc(80) float local80 = local38 * local51;
		@Pc(85) float local85 = (float) arg5 * local70;
		@Pc(90) float local90 = local80 * (float) arg5;
		@Pc(92) float local92 = 0.0F;
		@Pc(94) float local94 = 0.0F;
		@Pc(96) float local96 = local85;
		@Pc(98) float local98 = local90;
		if (local76 <= arg5) {
			local98 = local80 * (float) (arg5 - local76);
			local96 = local70 * (float) (arg5 - local76);
		} else {
			local92 = local70 * (float) (arg6 + arg5 - local76);
			local94 = (float) (arg6 + arg5 - local76) * local80;
		}
		@Pc(149) float local149 = (float) arg0 + local92 + 0.35F;
		@Pc(156) float local156 = (float) arg1 + local94 + 0.35F;
		@Pc(161) float local161 = (float) arg6 * local70;
		@Pc(166) float local166 = (float) arg6 * local80;
		while (true) {
			if (arg0 >= arg2) {
				if ((float) arg2 + 0.35F > local149) {
					break;
				}
				if ((float) arg2 > local96 + local149) {
					local96 = (float) arg2 - local149;
				}
			} else {
				if (local149 > (float) arg2 + 0.35F) {
					break;
				}
				if (local149 + local96 > (float) arg2) {
					local96 = (float) arg2 - local149;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 + 0.35F > local156) {
					break;
				}
				if ((float) arg3 > local156 + local98) {
					local98 = (float) arg3 - local156;
				}
			} else {
				if ((float) arg3 + 0.35F < local156) {
					break;
				}
				if ((float) arg3 < local98 + local156) {
					local98 = (float) arg3 - local156;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local149, local156);
			OpenGL.glVertex2f(local96 + local149, local156 + local98);
			local156 += local166 + local98;
			OpenGL.glEnd();
			local149 += local96 + local161;
			local96 = local85;
			local98 = local90;
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IZ)V")
	public void method8674(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean729 != arg0) {
			this.aBoolean729 = arg0;
			this.method8676();
		}
	}

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "()V")
	@Override
	public void method8601() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "(I)V")
	private void method8675() {
		if (this.aCanvas12 == null) {
			this.anInt10183 = this.anInt10127 = 0;
		} else {
			@Pc(16) Dimension local16 = this.aCanvas12.getSize();
			this.anInt10183 = local16.width;
			this.anInt10127 = local16.height;
		}
		if (this.anInterface10_1 == null) {
			this.anInt10154 = this.anInt10183;
			this.anInt10175 = this.anInt10127;
			this.method8691();
		}
		this.method8680();
		this.la();
	}

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "()V")
	@Override
	public void method8663() {
		if (!this.aBoolean732 || this.anInt10154 <= 0 || this.anInt10175 <= 0) {
			return;
		}
		@Pc(27) int local27 = this.anInt10278;
		@Pc(30) int local30 = this.anInt10274;
		@Pc(33) int local33 = this.anInt10283;
		@Pc(36) int local36 = this.anInt10275;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method8680();
		this.method8692(false);
		this.method8720(false);
		this.method8709(false);
		this.method8735(false);
		this.method8743((Class29) null);
		this.method8693(-2);
		this.method8671(1);
		this.method8728(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt10154, this.anInt10175, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local27, local33, local30, local36);
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(Z)V")
	private void method8676() {
		if (this.aBoolean726 && !this.aBoolean729) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "()Z")
	@Override
	public boolean method8631() {
		return this.aClass3_1.method27();
	}

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "(I)V")
	public void method8677() {
		if (this.anInt10264 == 2) {
			return;
		}
		this.method8716();
		this.method8692(false);
		this.method8720(false);
		this.method8709(false);
		this.method8735(false);
		this.method8693(-2);
		this.anInt10264 = 2;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lclient!el;")
	@Override
	public Interface13 method8629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(BI)V")
	public void method8678(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt10280) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt10280 = arg0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "()Z")
	@Override
	public boolean method8655() {
		return true;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(Z)V")
	@Override
	public void method8651(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "(I)V")
	private void method8679() {
		if (this.anInt10286 != 2) {
			this.anInt10286 = 2;
			this.method8740();
			this.method8729();
			this.anInt10264 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static28.method429(arg0, arg2, arg3, this, arg1);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		@Pc(22) Class1_Sub1 local22 = (Class1_Sub1) arg5;
		@Pc(25) Class29_Sub3_Sub1 local25 = local22.aClass29_Sub3_Sub1_1;
		this.method8677();
		this.method8743(local22.aClass29_Sub3_Sub1_1);
		this.method8728(1);
		this.method8738(8448, 7681);
		this.method8702(768, 34167, 0);
		@Pc(55) float local55 = local25.aFloat186 / (float) local25.anInt9593;
		@Pc(62) float local62 = local25.aFloat187 / (float) local25.anInt9590;
		@Pc(69) float local69 = (float) -arg0 + (float) arg2;
		@Pc(76) float local76 = (float) -arg1 + (float) arg3;
		@Pc(89) float local89 = (float) (1.0D / Math.sqrt((double) (local76 * local76 + local69 * local69)));
		@Pc(95) int local95 = arg10 % (arg8 + arg9);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(114) float local114 = local76 * local89;
		@Pc(118) float local118 = local69 * local89;
		@Pc(123) float local123 = (float) arg8 * local118;
		@Pc(128) float local128 = local114 * (float) arg8;
		@Pc(130) float local130 = 0.0F;
		@Pc(132) float local132 = 0.0F;
		@Pc(134) float local134 = local123;
		@Pc(136) float local136 = local128;
		if (local95 <= arg8) {
			local134 = local118 * (float) (arg8 - local95);
			local136 = (float) (arg8 - local95) * local114;
		} else {
			local132 = local114 * (float) (arg8 + arg9 - local95);
			local130 = (float) (arg8 + arg9 - local95) * local118;
		}
		@Pc(187) float local187 = (float) arg0 + local130 + 0.35F;
		@Pc(194) float local194 = local132 + (float) arg1 + 0.35F;
		@Pc(199) float local199 = local118 * (float) arg9;
		@Pc(204) float local204 = local114 * (float) arg9;
		while (true) {
			if (arg2 > arg0) {
				if ((float) arg2 + 0.35F < local187) {
					break;
				}
				if ((float) arg2 < local134 + local187) {
					local134 = (float) arg2 - local187;
				}
			} else {
				if (local187 < (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 > local134 + local187) {
					local134 = (float) arg2 - local187;
				}
			}
			if (arg3 > arg1) {
				if (local194 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local194 + local136) {
					local136 = (float) arg3 - local194;
				}
			} else {
				if ((float) arg3 + 0.35F > local194) {
					break;
				}
				if (local136 + local194 < (float) arg3) {
					local136 = (float) arg3 - local194;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(((float) -arg6 + local187) * local55, ((float) -arg7 + local194) * local62);
			OpenGL.glVertex2f(local187, local194);
			OpenGL.glTexCoord2f((local187 + local134 - (float) arg6) * local55, local62 * ((float) -arg7 + local194 + local136));
			OpenGL.glVertex2f(local134 + local187, local194 + local136);
			local194 += local136 + local204;
			OpenGL.glEnd();
			local187 += local199 + local134;
			local136 = local128;
			local134 = local123;
		}
		this.method8702(768, 5890, 0);
	}

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt10291;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8613(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas13 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable16.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(32) Class local32 = Class.forName("java.awt.Canvas");
				@Pc(44) Method local44 = local32.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local44.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(56) Exception local56) {
			}
			@Pc(61) long local61 = this.anOpenGL2.prepareSurface(arg0);
			if (local61 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable16.put(arg0, Long.valueOf(local61));
		}
	}

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "()V")
	@Override
	protected void method8653() {
		for (@Pc(6) Class5 local6 = this.aClass20_63.method378(); local6 != null; local6 = this.aClass20_63.method366()) {
			((Class5_Sub42_Sub1) local6).method6082();
		}
		if (this.aClass209_1 != null) {
			this.aClass209_1.method4800();
		}
		if (this.anOpenGL2 != null) {
			this.method8730();
			@Pc(48) Enumeration local48 = this.aHashtable16.keys();
			while (local48.hasMoreElements()) {
				@Pc(56) Canvas local56 = (Canvas) local48.nextElement();
				@Pc(62) Long local62 = (Long) this.aHashtable16.get(local56);
				this.anOpenGL2.releaseSurface(local56, local62);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean711) {
			Static616.method8461(false, true);
			this.aBoolean711 = false;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!sn;I)V")
	@Override
	public void method8618(@OriginalArg(0) Class336 arg0, @OriginalArg(1) int arg1) {
		this.aClass150_1.method3414(arg1, this, arg0);
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
	public void method8680() {
		if (this.anInt10286 != 0) {
			this.anInt10264 &= 0xFFFFFFE0;
			this.anInt10286 = 0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method8638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method8684();
		this.method8728(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		if (local16 == 0.0F && local23 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(50) float local50 = (float) (1.0D / Math.sqrt((double) (local23 * local23 + local16 * local16)));
			local16 *= local50;
			local23 *= local50;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, (float) arg3 + local23 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IFFF)V")
	private void method8681(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean720) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg1, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean720 = true;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFI)V")
	public void method8682(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat204 = arg0;
		this.aFloat195 = arg1;
		this.method8685();
	}

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "(I)V")
	public void method8683() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "(B)V")
	private void method8684() {
		if (this.anInt10264 == 1) {
			return;
		}
		this.method8716();
		this.method8692(false);
		this.method8720(false);
		this.method8709(false);
		this.method8735(false);
		this.method8743((Class29) null);
		this.method8693(-2);
		this.method8671(1);
		this.anInt10264 = 1;
	}

	@OriginalMember(owner = "client!vf", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8735(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[Lclient!ih;)V")
	@Override
	public void method8609(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub12[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass5_Sub12Array6[local3] = arg1[local3];
		}
		this.anInt10281 = arg0;
		if (this.anInt10286 != 1) {
			this.method8713();
		}
	}

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "(I)V")
	private void method8685() {
		this.aFloat206 = (float) (this.anInt10279 - this.anInt10267) - this.aFloat204;
		this.aFloat210 = this.aFloat206 - (float) this.anInt10292 * this.aFloat195;
		if ((float) this.anInt10291 > this.aFloat210) {
			this.aFloat210 = (float) this.anInt10291;
		}
		OpenGL.glFogf(2915, this.aFloat210);
		OpenGL.glFogf(2916, this.aFloat206);
		Static378.aFloatArray54[2] = (float) (this.lb & 0xFF) / 255.0F;
		Static378.aFloatArray54[0] = (float) (this.lb & 0xFF0000) / 1.671168E7F;
		Static378.aFloatArray54[1] = (float) (this.lb & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static378.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8591(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static17.aFloat14 = arg0;
		Static41.aFloat26 = arg1;
		Static105.aFloat43 = arg2;
	}

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "(II)I")
	public int method8686(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg5;
		@Pc(9) Class29_Sub3_Sub1 local9 = local6.aClass29_Sub3_Sub1_1;
		this.method8677();
		this.method8743(local6.aClass29_Sub3_Sub1_1);
		this.method8728(1);
		this.method8738(8448, 7681);
		this.method8702(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat186 / (float) local9.anInt9593;
		@Pc(46) float local46 = local9.aFloat187 / (float) local9.anInt9590;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(60) float local60 = (float) -arg1 + (float) arg3;
		@Pc(73) float local73 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local60 * local60)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(92) float local92 = local60 * local73;
		@Pc(96) float local96 = local53 * local73;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local96 + 0.35F, local92 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method8702(768, 5890, 0);
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(Z)V")
	public void method8687() {
		if (this.anInt10264 == 4) {
			return;
		}
		this.method8716();
		this.method8692(false);
		this.method8720(false);
		this.method8709(false);
		this.method8735(false);
		this.method8693(-2);
		this.method8728(1);
		this.anInt10264 = 4;
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "(II)V")
	public synchronized void method8688(@OriginalArg(0) int arg0) {
		@Pc(7) Class5 local7 = new Class5();
		local7.aLong312 = (long) arg0;
		this.aClass20_69.method370(local7);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!dr;)V")
	public void method8689(@OriginalArg(1) Interface10 arg0) {
		if (this.anInt10258 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt10258 >= 0) {
			this.anInterface10Array3[this.anInt10258].method4963();
		}
		this.anInterface10_1 = this.anInterface10Array3[++this.anInt10258] = arg0;
		this.anInterface10_1.method4964();
	}

	@OriginalMember(owner = "client!vf", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass10_Sub3_3.aFloat104 * (float) arg2 + (float) arg1 * this.aClass10_Sub3_3.aFloat110 + this.aClass10_Sub3_3.aFloat100 * (float) arg0 + this.aClass10_Sub3_3.aFloat105;
		if ((float) this.anInt10291 > local28 || local28 > (float) this.anInt10279) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(88) int local88 = (int) ((this.aClass10_Sub3_3.aFloat106 * (float) arg1 + this.aClass10_Sub3_3.aFloat108 * (float) arg0 + this.aClass10_Sub3_3.aFloat103 * (float) arg2 + this.aClass10_Sub3_3.aFloat102) * (float) this.anInt10296 / local28);
		@Pc(120) int local120 = (int) ((this.aClass10_Sub3_3.aFloat101 + (float) arg1 * this.aClass10_Sub3_3.aFloat109 + (float) arg0 * this.aClass10_Sub3_3.aFloat99 + this.aClass10_Sub3_3.aFloat107 * (float) arg2) * (float) this.anInt10273 / local28);
		if ((float) local88 >= this.aFloat202 && this.aFloat190 >= (float) local88 && this.aFloat207 <= (float) local120 && this.aFloat200 >= (float) local120) {
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local120 - this.aFloat207);
			arg3[0] = (int) ((float) local88 - this.aFloat202);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "()I")
	@Override
	public int method8635() {
		return 4;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!sj;)V")
	@Override
	public void method8590(@OriginalArg(0) Class10 arg0) {
		this.aClass10_Sub3_3.method4212(arg0);
		this.aClass10_Sub3_4.method4212(this.aClass10_Sub3_3);
		this.aClass10_Sub3_4.method2822();
		this.aClass10_Sub3_5.method2815(this.aClass10_Sub3_4);
		if (this.anInt10286 != 1) {
			this.method8729();
		}
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "()Z")
	@Override
	public boolean method8661() {
		return this.aClass5_Sub23_Sub1_1 != null && (this.anInt10236 <= 1 || this.aBoolean733);
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(B)V")
	private void method8690() {
		this.method8693(-2);
		for (@Pc(14) int local14 = this.anInt10285 - 1; local14 >= 0; local14--) {
			this.method8678(local14);
			this.method8743((Class29) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method8738(8448, 8448);
		this.method8702(770, 34168, 2);
		this.method8722();
		this.anInt10265 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt10266 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean713 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean715 = true;
		this.method8692(true);
		this.method8720(true);
		this.method8709(true);
		this.method8735(true);
		this.method8680();
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
		@Pc(128) float[] local128 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(130) int local130 = 0; local130 < 8; local130++) {
			@Pc(138) int local138 = local130 + 16384;
			OpenGL.glLightfv(local138, 4608, local128, 0);
			OpenGL.glLightf(local138, 4615, 0.0F);
			OpenGL.glLightf(local138, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt10269 = this.lb = -1;
		this.la();
	}

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "(I)V")
	private void method8691() {
		OpenGL.glViewport(this.anInt10294, this.anInt10271, this.anInt10154, this.anInt10175);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(ZI)V")
	public void method8692(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean737 != arg0) {
			this.aBoolean737 = arg0;
			this.method8699();
			this.anInt10264 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "(II)V")
	public void method8693(@OriginalArg(0) int arg0) {
		this.method8750(arg0, true);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([I)V")
	@Override
	public void method8649(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt10154;
		arg0[1] = this.anInt10175;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIILclient!jaclib/memory/Buffer;Z)Lclient!ika;")
	public Interface17 method8694(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Buffer arg2) {
		return (Interface17) (this.aBoolean724 && (this.aBoolean719 || true) ? new Class34_Sub2(this, arg1, arg2, arg0, false) : new Class276_Sub1(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!lia;Lclient!lia;FLclient!lia;)Lclient!lia;")
	@Override
	public Class185 method8584(@OriginalArg(0) Class185 arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class185 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean721 && this.aBoolean741) {
			@Pc(21) Class185_Sub1_Sub1 local21 = null;
			@Pc(24) Class185_Sub1 local24 = (Class185_Sub1) arg0;
			@Pc(27) Class185_Sub1 local27 = (Class185_Sub1) arg1;
			@Pc(31) Class29_Sub2 local31 = local24.method8477();
			@Pc(35) Class29_Sub2 local35 = local27.method8477();
			if (local31 != null && local35 != null) {
				@Pc(59) int local59 = local35.anInt1663 >= local31.anInt1663 ? local35.anInt1663 : local31.anInt1663;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class185_Sub1_Sub1) {
					@Pc(75) Class185_Sub1_Sub1 local75 = (Class185_Sub1_Sub1) arg3;
					if (local59 == local75.method4314()) {
						local21 = local75;
					}
				}
				if (local21 == null) {
					local21 = new Class185_Sub1_Sub1(this, local59);
				}
				if (local21.method4315(local35, local31, arg2)) {
					return local21;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "(I)V")
	private void method8695() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL2.b()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static620.method7045(-4, 1000L);
		}
	}

	@OriginalMember(owner = "client!vf", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIF)Lclient!ih;")
	@Override
	public Class5_Sub12 method8625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub12_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIII)V")
	public void method8696(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!vf", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt10278 || this.anInt10274 < arg0 - arg2 || arg2 + arg1 < this.anInt10283 || this.anInt10275 < arg1 - arg2) {
			return;
		}
		this.method8684();
		this.method8728(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(83) float local83 = (float) arg0 + 0.35F;
		@Pc(88) float local88 = (float) arg1 + 0.35F;
		@Pc(92) int local92 = arg2 << 1;
		if ((float) local92 < this.aFloat205) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local83 + 1.0F, local88 + 1.0F);
			OpenGL.glVertex2f(local83 + 1.0F, -1.0F + local88);
			OpenGL.glVertex2f(local83 - 1.0F, local88 - 1.0F);
			OpenGL.glVertex2f(local83 - 1.0F, local88 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat194 >= (float) local92) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local92);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local83, local88);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local83, local88);
			@Pc(148) int local148 = 262144 / (arg2 * 6);
			if (local148 <= 64) {
				local148 = 64;
			} else if (local148 > 512) {
				local148 = 512;
			}
			local148 = Static186.method3180(local148);
			OpenGL.glVertex2f((float) arg2 + local83, local88);
			for (@Pc(177) int local177 = 16384 - local148; local177 > 0; local177 -= local148) {
				OpenGL.glVertex2f(local83 + Class119.aFloatArray28[local177] * (float) arg2, (float) arg2 * Class119.aFloatArray27[local177] + local88);
			}
			OpenGL.glVertex2f((float) arg2 + local83, local88);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(II)V")
	public synchronized void method8697(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub43 local8 = new Class5_Sub43(arg0);
		this.aClass20_67.method370(local8);
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "(Z)V")
	private void method8698() {
		if (this.anInt10278 <= this.anInt10274 && this.anInt10275 >= this.anInt10283) {
			OpenGL.glScissor(this.anInt10278 + this.anInt10294, this.anInt10271 - (-this.anInt10175 + this.anInt10275), this.anInt10274 - this.anInt10278, this.anInt10275 - this.anInt10283);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "()Z")
	@Override
	public boolean method8611() {
		return false;
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(B)V")
	private void method8699() {
		if (this.aBoolean737 && this.anInt10292 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "(I)V")
	private void method8700() {
		this.aFloatArray75[14] = this.aFloat209;
		this.aFloatArray75[10] = this.aFloat208;
		this.aFloat197 = (this.aFloatArray75[14] - (float) this.anInt10279) / this.aFloatArray75[10];
		this.aFloat198 = (float) this.anInt10279;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFIFF)V")
	public void method8701(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static378.aFloatArray54[0] = arg3;
		Static378.aFloatArray54[2] = arg0;
		Static378.aFloatArray54[3] = arg2;
		Static378.aFloatArray54[1] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static378.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIII)V")
	public void method8702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(FZ)V")
	public void method8703(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat191) {
			this.aFloat191 = arg0;
			if (this.anInt10286 == 3) {
				this.method8672();
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "(II)V")
	public void method8704(@OriginalArg(1) int arg0) {
		Static378.aFloatArray54[3] = (float) (arg0 >>> 24) / 255.0F;
		Static378.aFloatArray54[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static378.aFloatArray54[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static378.aFloatArray54[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static378.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLclient!dr;)V")
	public void method8705(@OriginalArg(1) Interface10 arg0) {
		if (this.anInt10258 < 0 || this.anInterface10Array3[this.anInt10258] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface10Array3[this.anInt10258--] = null;
		arg0.method4963();
		if (this.anInt10258 < 0) {
			this.anInterface10_1 = null;
		} else {
			this.anInterface10_1 = this.anInterface10Array3[this.anInt10258];
			this.anInterface10_1.method4964();
		}
	}

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "(I)V")
	private void method8706() {
		@Pc(6) float[] local6 = this.aFloatArray75;
		@Pc(26) float local26 = (float) (this.anInt10291 * -this.anInt10295) / (float) this.anInt10296;
		@Pc(41) float local41 = (float) (this.anInt10291 * (this.anInt10154 - this.anInt10295)) / (float) this.anInt10296;
		@Pc(52) float local52 = (float) (this.anInt10291 * this.anInt10277) / (float) this.anInt10273;
		@Pc(67) float local67 = (float) ((this.anInt10277 - this.anInt10175) * this.anInt10291) / (float) this.anInt10273;
		if (local26 == local41 || local52 == local67) {
			local6[4] = 0.0F;
			local6[1] = 0.0F;
			local6[6] = 0.0F;
			local6[9] = 0.0F;
			local6[2] = 0.0F;
			local6[10] = 1.0F;
			local6[13] = 0.0F;
			local6[0] = 1.0F;
			local6[3] = 0.0F;
			local6[11] = 0.0F;
			local6[5] = 1.0F;
			local6[12] = 0.0F;
			local6[15] = 1.0F;
			local6[14] = 0.0F;
			local6[7] = 0.0F;
			local6[8] = 0.0F;
		} else {
			@Pc(151) float local151 = (float) this.anInt10291 * 2.0F;
			local6[10] = this.aFloat208 = (float) -(this.anInt10279 + this.anInt10291) / (float) (this.anInt10279 - this.anInt10291);
			local6[15] = 0.0F;
			local6[4] = 0.0F;
			local6[2] = 0.0F;
			local6[5] = local151 / (local52 - local67);
			local6[6] = 0.0F;
			local6[13] = 0.0F;
			local6[8] = (local41 + local26) / (local41 - local26);
			local6[3] = 0.0F;
			local6[11] = -1.0F;
			local6[12] = 0.0F;
			local6[1] = 0.0F;
			local6[0] = local151 / (local41 - local26);
			local6[9] = (local67 + local52) / (local52 - local67);
			local6[14] = this.aFloat209 = -((float) this.anInt10279 * local151) / (float) (this.anInt10279 - this.anInt10291);
			local6[7] = 0.0F;
		}
		this.method8700();
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!bv;III)V")
	public void method8707(@OriginalArg(1) Interface6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = arg0.method7653();
		@Pc(26) int local26 = arg1 * this.method8686(local19);
		this.method8736(arg0);
		OpenGL.glDrawElements(4, arg2, local19, (long) local26 + arg0.method7655());
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "()Z")
	@Override
	public boolean method8596() {
		return true;
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)V")
	@Override
	public void method8580() {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZ)Lclient!hk;")
	@Override
	public Class155 method8647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class155_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "()Z")
	@Override
	public boolean method8657() {
		return false;
	}

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "(I)V")
	private void method8708() {
		if (this.anInt10286 != 3) {
			this.anInt10286 = 3;
			this.method8672();
			this.method8729();
			this.anInt10264 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!el;Lclient!tq;)Lclient!sia;")
	@Override
	public Interface24 method8664(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) Interface26 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!vf", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8684();
		this.method8728(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)V")
	public void method8709(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean714) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean714 = arg0;
		this.anInt10264 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!sia;)V")
	@Override
	public void method8594(@OriginalArg(0) Interface24 arg0) {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class84 method8587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class84_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "(I)I")
	private int method8710() {
		this.aString116 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString117 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString116.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString116.indexOf("brian paul") != -1 || this.aString116.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(54) String local54 = OpenGL.glGetString(7938);
		@Pc(62) String[] local62 = Static350.method5156(' ', local54.replace('.', ' '));
		if (local62.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(80) int local80 = Static407.method5956(local62[0]);
				@Pc(86) int local86 = Static407.method5956(local62[1]);
				this.anInt10293 = local80 * 10 + local86;
			} catch (@Pc(95) NumberFormatException local95) {
				local10 |= 0x4;
			}
		}
		if (this.anInt10293 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(145) int[] local145 = new int[1];
		OpenGL.glGetIntegerv(34018, local145, 0);
		this.anInt10285 = local145[0];
		OpenGL.glGetIntegerv(34929, local145, 0);
		this.anInt10288 = local145[0];
		OpenGL.glGetIntegerv(34930, local145, 0);
		this.anInt10282 = local145[0];
		if (this.anInt10285 < 2 || this.anInt10288 < 2 || this.anInt10282 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean735 = Stream.c();
		this.aBoolean739 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean724 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean717 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean725 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean727 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean738 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean742 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean731 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean721 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean730 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean736 = false;
		this.aBoolean741 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean722 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean723 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean733 = this.aBoolean722 & this.aBoolean723;
		this.aBoolean716 = Class186.aString53.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static378.aFloatArray54, 0);
		this.aFloat205 = Static378.aFloatArray54[0];
		this.aFloat194 = Static378.aFloatArray54[1];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public Class5_Sub42 method8659(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub42_Sub1 local8 = new Class5_Sub42_Sub1(arg0);
		this.aClass20_63.method370(local8);
		return local8;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!kaa;[Lclient!uh;Z)Lclient!da;")
	@Override
	public Class70 method8612(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class362[] arg1) {
		return new Class70_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZZII[B)Lclient!bv;")
	public Interface6 method8711(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface6) (this.aBoolean724 && (!arg0 || this.aBoolean719) ? new Class34_Sub1(this, 5123, arg2, arg1, arg0) : new Class276_Sub2(this, 5123, arg2, arg1));
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8604(@OriginalArg(0) Class5_Sub42 arg0) {
		this.aNativeHeap6 = ((Class5_Sub42_Sub1) arg0).aNativeHeap3;
		if (this.anInterface17_7 != null) {
			return;
		}
		@Pc(16) Class5_Sub36_Sub1 local16 = new Class5_Sub36_Sub1(80);
		if (this.aBoolean735) {
			local16.method5494(-1.0F);
			local16.method5494(-1.0F);
			local16.method5494(0.0F);
			local16.method5494(0.0F);
			local16.method5494(1.0F);
			local16.method5494(1.0F);
			local16.method5494(-1.0F);
			local16.method5494(0.0F);
			local16.method5494(1.0F);
			local16.method5494(1.0F);
			local16.method5494(1.0F);
			local16.method5494(1.0F);
			local16.method5494(0.0F);
			local16.method5494(1.0F);
			local16.method5494(0.0F);
			local16.method5494(-1.0F);
			local16.method5494(1.0F);
			local16.method5494(0.0F);
			local16.method5494(0.0F);
			local16.method5494(0.0F);
		} else {
			local16.method5496(-1.0F);
			local16.method5496(-1.0F);
			local16.method5496(0.0F);
			local16.method5496(0.0F);
			local16.method5496(1.0F);
			local16.method5496(1.0F);
			local16.method5496(-1.0F);
			local16.method5496(0.0F);
			local16.method5496(1.0F);
			local16.method5496(1.0F);
			local16.method5496(1.0F);
			local16.method5496(1.0F);
			local16.method5496(0.0F);
			local16.method5496(1.0F);
			local16.method5496(0.0F);
			local16.method5496(-1.0F);
			local16.method5496(1.0F);
			local16.method5496(0.0F);
			local16.method5496(0.0F);
			local16.method5496(0.0F);
		}
		this.anInterface17_7 = this.method8734(local16.anInt8456, local16.aByteArray89, 20, false);
		this.aClass207_15 = new Class207(this.anInterface17_7, 5126, 3, 0);
		this.aClass207_16 = new Class207(this.anInterface17_7, 5126, 2, 12);
		this.aClass150_1.method3416(this);
	}

	@OriginalMember(owner = "client!vf", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean728 = false;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!uh;Z)Lclient!hk;")
	@Override
	public Class155 method8640(@OriginalArg(0) Class362 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt9728 * arg0.anInt9727];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray99 == null) {
			for (local21 = 0; local21 < arg0.anInt9728; local21++) {
				for (local25 = 0; local25 < arg0.anInt9727; local25++) {
					@Pc(91) int local91 = arg0.anIntArray541[arg0.aByteArray98[local14++] & 0xFF];
					local12[local16++] = local91 == 0 ? 0 : local91 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt9728; local21++) {
				for (local25 = 0; local25 < arg0.anInt9727; local25++) {
					local12[local16++] = arg0.anIntArray541[arg0.aByteArray98[local14] & 0xFF] | arg0.aByteArray99[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(135) Class155 local135 = this.method8645(arg0.anInt9727, arg0.anInt9727, local12, arg0.anInt9728);
		local135.method7190(arg0.anInt9723, arg0.anInt9725, arg0.anInt9724, arg0.anInt9726);
		return local135;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(III)V")
	public synchronized void method8712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub43 local8 = new Class5_Sub43(arg0);
		local8.aLong312 = (long) arg1;
		this.aClass20_66.method370(local8);
	}

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "(I)V")
	private void method8713() {
		@Pc(15) int local15;
		for (local15 = 0; local15 < this.anInt10281; local15++) {
			@Pc(22) Class5_Sub12 local22 = this.aClass5_Sub12Array6[local15];
			Static640.aFloatArray76[0] = (float) local22.method4537();
			@Pc(33) int local33 = local15 + 16386;
			Static640.aFloatArray76[1] = (float) local22.method4533();
			Static640.aFloatArray76[2] = (float) local22.method4534();
			Static640.aFloatArray76[3] = 1.0F;
			OpenGL.glLightfv(local33, 4611, Static640.aFloatArray76, 0);
			@Pc(60) int local60 = local22.method4530();
			@Pc(66) float local66 = local22.method4536() / 255.0F;
			Static640.aFloatArray76[2] = local66 * (float) (local60 & 0xFF);
			Static640.aFloatArray76[1] = local66 * (float) (local60 >> 8 & 0xFF);
			Static640.aFloatArray76[0] = (float) (local60 >> 16 & 0xFF) * local66;
			OpenGL.glLightfv(local33, 4609, Static640.aFloatArray76, 0);
			OpenGL.glLightf(local33, 4617, 1.0F / (float) (local22.method4531() * local22.method4531()));
			OpenGL.glEnable(local33);
		}
		while (this.anInt10298 > local15) {
			OpenGL.glDisable(local15 + 16386);
			local15++;
		}
		this.anInt10298 = this.anInt10281;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!kc;IIII)Lclient!ka;")
	@Override
	public Class43 method8588(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class43_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!vf", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt10283 < arg1) {
			this.anInt10283 = arg1;
		}
		if (this.anInt10274 > arg2) {
			this.anInt10274 = arg2;
		}
		if (arg0 > this.anInt10278) {
			this.anInt10278 = arg0;
		}
		if (this.anInt10275 > arg3) {
			this.anInt10275 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method8724();
		this.method8698();
	}

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Class29_Sub3_Sub1 local9 = local6.aClass29_Sub3_Sub1_1;
		this.method8677();
		this.method8743(local6.aClass29_Sub3_Sub1_1);
		this.method8728(1);
		this.method8738(8448, 7681);
		this.method8702(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat186 / (float) local9.anInt9593;
		@Pc(46) float local46 = local9.aFloat187 / (float) local9.anInt9590;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt10278 - arg2), local46 * (float) (this.anInt10283 - arg3));
		OpenGL.glVertex2i(this.anInt10278, this.anInt10283);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt10278 - arg2), (float) (this.anInt10275 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt10278, this.anInt10275);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt10274 - arg2), (float) (this.anInt10275 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt10274, this.anInt10275);
		OpenGL.glTexCoord2f((float) (this.anInt10274 - arg2) * local39, (float) (this.anInt10283 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt10274, this.anInt10283);
		OpenGL.glEnd();
		this.method8702(768, 5890, 0);
	}

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt10300;
		this.anInt10300 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "(B)Lclient!dka;")
	public Class29_Sub2 method8714() {
		return this.aClass185_Sub1_1 == null ? null : this.aClass185_Sub1_1.method8477();
	}

	@OriginalMember(owner = "client!vf", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(65) float local65;
		@Pc(53) float local53;
		if (this.aClass29_Sub3_Sub1_5 == null || this.aClass29_Sub3_Sub1_5.anInt9586 < arg2 || arg3 > this.aClass29_Sub3_Sub1_5.anInt9587) {
			this.aClass29_Sub3_Sub1_5 = Static608.method8368(arg3, arg2, this, arg6);
			this.aClass29_Sub3_Sub1_5.method8174(false, false);
			local65 = this.aClass29_Sub3_Sub1_5.aFloat187;
			local53 = this.aClass29_Sub3_Sub1_5.aFloat186;
		} else {
			this.aClass29_Sub3_Sub1_5.method8173(arg2, 6406, arg6, false, arg3);
			local53 = this.aClass29_Sub3_Sub1_5.aFloat186 * (float) arg2 / (float) this.aClass29_Sub3_Sub1_5.anInt9586;
			local65 = (float) arg3 * this.aClass29_Sub3_Sub1_5.aFloat187 / (float) this.aClass29_Sub3_Sub1_5.anInt9587;
		}
		this.method8677();
		this.method8743(this.aClass29_Sub3_Sub1_5);
		this.method8728(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method8704(arg5);
		this.method8738(34165, 34165);
		this.method8702(768, 34166, 0);
		this.method8702(770, 5890, 2);
		this.method8673(34166, 0);
		this.method8673(5890, 2);
		@Pc(155) float local155 = (float) arg0;
		@Pc(158) float local158 = (float) arg1;
		@Pc(163) float local163 = local155 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(170) float local170 = local158 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local155, local158);
		OpenGL.glTexCoord2f(0.0F, local53);
		OpenGL.glVertex2f(local155, local170);
		OpenGL.glTexCoord2f(local65, local53);
		OpenGL.glVertex2f(local163, local170);
		OpenGL.glTexCoord2f(local65, 0.0F);
		OpenGL.glVertex2f(local163, local158);
		OpenGL.glEnd();
		this.method8702(768, 5890, 0);
		this.method8702(770, 34166, 2);
		this.method8673(5890, 0);
		this.method8673(34166, 2);
	}

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8684();
		this.method8728(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vf", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt10295, this.anInt10277, this.anInt10296, this.anInt10273 };
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt10291 && arg1 == this.anInt10279) {
			return;
		}
		this.anInt10291 = arg0;
		this.anInt10279 = arg1;
		this.method8706();
		this.method8685();
		if (this.anInt10286 == 3) {
			this.method8672();
			return;
		}
		if (this.anInt10286 != 2) {
			return;
		}
		this.method8740();
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V")
	private void method8716() {
		if (this.anInt10286 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt10154 > 0 && this.anInt10175 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt10154, (double) this.anInt10175, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt10264 &= 0xFFFFFFE7;
		this.anInt10286 = 1;
	}

	@OriginalMember(owner = "client!vf", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method8728(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)V")
	public void method8718(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt10271 = arg1;
		this.anInt10294 = arg0;
		this.method8691();
		this.method8698();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!ika;B)V")
	public void method8719(@OriginalArg(0) Interface17 arg0) {
		if (arg0 != this.anInterface17_6) {
			if (this.aBoolean724) {
				OpenGL.glBindBufferARB(34962, arg0.method8310());
			}
			this.anInterface17_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "()Lclient!sj;")
	@Override
	public Class10 method8623() {
		return new Class10_Sub3();
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method8607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method8684();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method8728(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean717) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean717) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!vf", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat196 != arg0) {
			this.aFloat196 = arg0;
			this.method8744();
		}
	}

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "()V")
	@Override
	public void method8616() {
		if (this.aClass5_Sub23_Sub1_1 != null && this.aClass5_Sub23_Sub1_1.method3259()) {
			this.aClass209_1.method4804(this.aClass5_Sub23_Sub1_1);
			this.aClass76_1.method1402();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIZ)Lclient!hk;")
	@Override
	public Class155 method8643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class155_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)I")
	@Override
	public int method8665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(II)V")
	@Override
	public void method8582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZB)V")
	public void method8720(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean726) {
			this.aBoolean726 = arg0;
			this.method8676();
			this.anInt10264 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "(B)V")
	public void method8721() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray71, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray74, 0);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
	private void method8722() {
		if (this.aBoolean720) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean720 = false;
		}
	}

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "()Z")
	@Override
	public boolean method8650() {
		if (this.aClass5_Sub23_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass5_Sub23_Sub1_1.method3259()) {
			if (!this.aClass209_1.method4806(this.aClass5_Sub23_Sub1_1)) {
				return false;
			}
			this.aClass76_1.method1402();
		}
		return true;
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(Z)V")
	private void method8723() {
		OpenGL.glDepthMask(this.aBoolean712 && this.aBoolean718);
	}

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "(I)V")
	private void method8724() {
		this.aFloat207 = (float) (this.anInt10283 - this.anInt10277);
		this.aFloat202 = (float) (this.anInt10278 - this.anInt10295);
		this.aFloat200 = (float) (this.anInt10275 - this.anInt10277);
		this.aFloat190 = (float) (this.anInt10274 - this.anInt10295);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8627(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas13) {
			throw new RuntimeException();
		} else if (this.aHashtable16.containsKey(arg0)) {
			@Pc(23) Long local23 = (Long) this.aHashtable16.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local23);
			this.aHashtable16.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!dr;I)V")
	public void method8725(@OriginalArg(0) Interface10 arg0) {
		if (this.anInt10259 < 0 || this.anInterface10Array1[this.anInt10259] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface10Array1[this.anInt10259--] = null;
		arg0.method4966();
		if (this.anInt10259 >= 0) {
			this.anInterface10_2 = this.anInterface10Array1[this.anInt10259];
			this.anInterface10_2.method4961();
		} else {
			this.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(BI)I")
	public int method8726(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!kn;Lclient!kn;BLclient!kn;Lclient!kn;)V")
	public void method8727(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(3) Class207 arg2, @OriginalArg(4) Class207 arg3) {
		if (arg2 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method8719(arg2.anInterface17_4);
			OpenGL.glVertexPointer(arg2.aByte77, arg2.aShort58, this.anInterface17_6.method8311(), this.anInterface17_6.method8312() + (long) arg2.aByte78);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method8719(arg3.anInterface17_4);
			OpenGL.glNormalPointer(arg3.aShort58, this.anInterface17_6.method8311(), this.anInterface17_6.method8312() + (long) arg3.aByte78);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method8719(arg0.anInterface17_4);
			OpenGL.glColorPointer(arg0.aByte77, arg0.aShort58, this.anInterface17_6.method8311(), this.anInterface17_6.method8312() + (long) arg0.aByte78);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method8719(arg1.anInterface17_4);
			OpenGL.glTexCoordPointer(arg1.aByte77, arg1.aShort58, this.anInterface17_6.method8311(), this.anInterface17_6.method8312() + (long) arg1.aByte78);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "(II)V")
	public void method8728(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt10265) {
			return;
		}
		@Pc(25) boolean local25;
		@Pc(27) byte local27;
		if (arg0 == 1) {
			local25 = true;
			local27 = 1;
		} else if (arg0 == 2) {
			local27 = 2;
			local25 = false;
		} else if (arg0 == 128) {
			local25 = true;
			local27 = 3;
		} else {
			local27 = 0;
			local25 = false;
		}
		if (!this.aBoolean715) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean715 = true;
		}
		if (this.aBoolean713 != local25) {
			if (local25) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean713 = local25;
		}
		if (this.anInt10266 != local27) {
			if (local27 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local27 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local27 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt10266 = local27;
		}
		this.anInt10264 &= 0xFFFFFFE3;
		this.anInt10265 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(Z)V")
	@Override
	public void method8599(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vf", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt10256 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt10256++;
		}
		this.anInt10255 = 0x1 << this.anInt10256;
	}

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "(I)V")
	private void method8729() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass10_Sub3_4.method2819(), 0);
		if (this.aBoolean740) {
			this.aClass3_1.aClass160_Sub9_1.method8069();
		}
		this.method8721();
		this.method8713();
	}

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "(I)V")
	private void method8730() {
		this.anOpenGL2.a();
	}

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "()Lclient!waa;")
	@Override
	public Class385 method8602() {
		@Pc(7) int local7 = -1;
		if (this.aString116.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString116.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString116.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class385(local7, "OpenGL", this.anInt10293, this.aString117, 0L);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "()Lclient!sj;")
	@Override
	public Class10 method8595() {
		return this.aClass10_Sub3_3;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lclient!dr;B)V")
	public void method8731(@OriginalArg(0) Interface10 arg0) {
		if (this.anInt10259 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt10259 >= 0) {
			this.anInterface10Array1[this.anInt10259].method4966();
		}
		this.anInterface10_2 = this.anInterface10Array1[++this.anInt10259] = arg0;
		this.anInterface10_2.method4961();
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
	@Override
	public void method8598(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt10238 = arg0;
		this.aClass76_1.method1402();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)I")
	public int method8732(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!vf", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt10274 = this.anInt10154;
		this.anInt10275 = this.anInt10175;
		this.anInt10278 = 0;
		this.anInt10283 = 0;
		OpenGL.glDisable(3089);
		this.method8724();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass209_1.method4799(arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "()Z")
	@Override
	public boolean method8600() {
		return true;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8614(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas13) {
			local5 = this.aLong288;
		} else if (this.aHashtable16.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable16.get(arg0);
			local5 = local26;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas12 == arg0) {
			this.method8675();
		}
	}

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "(I)V")
	public void method8733() {
		if (this.anInt10264 == 16) {
			return;
		}
		this.method8708();
		this.method8692(true);
		this.method8709(true);
		this.method8735(true);
		this.method8728(1);
		this.anInt10264 = 16;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI[BIZ)Lclient!ika;")
	public Interface17 method8734(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		return (Interface17) (this.aBoolean724 && (!arg3 || this.aBoolean719) ? new Class34_Sub2(this, arg2, arg1, arg0, arg3) : new Class276_Sub1(this, arg2, arg1, arg0));
	}

	@OriginalMember(owner = "client!vf", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass10_Sub3_3.aFloat104 * (float) arg2 + this.aClass10_Sub3_3.aFloat100 * (float) arg0 + (float) arg1 * this.aClass10_Sub3_3.aFloat110 + this.aClass10_Sub3_3.aFloat105;
		if ((float) this.anInt10291 > local28 || local28 > (float) this.anInt10279) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(89) int local89 = (int) ((float) this.anInt10296 * (this.aClass10_Sub3_3.aFloat102 + this.aClass10_Sub3_3.aFloat103 * (float) arg2 + (float) arg1 * this.aClass10_Sub3_3.aFloat106 + (float) arg0 * this.aClass10_Sub3_3.aFloat108) / (float) arg3);
		@Pc(122) int local122 = (int) ((float) this.anInt10273 * (this.aClass10_Sub3_3.aFloat101 + this.aClass10_Sub3_3.aFloat107 * (float) arg2 + this.aClass10_Sub3_3.aFloat109 * (float) arg1 + this.aClass10_Sub3_3.aFloat99 * (float) arg0) / (float) arg3);
		if ((float) local89 >= this.aFloat202 && this.aFloat190 >= (float) local89 && this.aFloat207 <= (float) local122 && this.aFloat200 >= (float) local122) {
			arg4[1] = (int) ((float) local122 - this.aFloat207);
			arg4[0] = (int) ((float) local89 - this.aFloat202);
			arg4[2] = (int) local28;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)V")
	public void method8735(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean712 != arg0) {
			this.aBoolean712 = arg0;
			this.method8723();
			this.anInt10264 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLclient!bv;)V")
	public void method8736(@OriginalArg(1) Interface6 arg0) {
		if (this.anInterface6_5 != arg0) {
			if (this.aBoolean724) {
				OpenGL.glBindBufferARB(34963, arg0.method7652());
			}
			this.anInterface6_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt10279;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBZZ)V")
	public void method8737(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt10297 != arg0 || this.aBoolean740 != this.aBoolean728) {
			@Pc(24) Class29_Sub3 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(38) int local38 = this.aBoolean728 ? 3 : 0;
			if (arg0 < 0) {
				this.method8722();
			} else {
				local24 = this.aClass76_1.method1407(arg0);
				@Pc(62) Class44 local62 = super.anInterface7_12.method7423(arg0);
				if (local62.aByte18 == 0 && local62.aByte20 == 0) {
					this.method8722();
				} else {
					@Pc(86) int local86 = local62.aBoolean62 ? 64 : 128;
					@Pc(90) int local90 = local86 * 50;
					this.method8681(0.0F, (float) (local62.aByte20 * (this.anInt10257 % local90)) / (float) local90, (float) (this.anInt10257 % local90 * local62.aByte18) / (float) local90);
				}
				if (!this.aBoolean728) {
					local28 = local62.aByte19;
					local30 = local62.anInt814;
					local38 = local62.aByte23;
				}
				local26 = local62.anInt811;
			}
			this.aClass3_1.method32(local38, local28, arg2, local30, arg1);
			if (!this.aClass3_1.method30(local26, local24)) {
				this.method8743(local24);
				this.method8671(local26);
			}
			this.aBoolean740 = this.aBoolean728;
			this.anInt10297 = arg0;
		}
		this.anInt10264 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass10_Sub3_3.aFloat104 * (float) arg2 + this.aClass10_Sub3_3.aFloat110 * (float) arg1 + (float) arg0 * this.aClass10_Sub3_3.aFloat100 + this.aClass10_Sub3_3.aFloat105;
		@Pc(55) float local55 = this.aClass10_Sub3_3.aFloat110 * (float) arg4 + this.aClass10_Sub3_3.aFloat100 * (float) arg3 + this.aClass10_Sub3_3.aFloat104 * (float) arg5 + this.aClass10_Sub3_3.aFloat105;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt10291 && local55 < (float) this.anInt10291) {
			local57 |= 0x10;
		} else if ((float) this.anInt10279 < local30 && (float) this.anInt10279 < local55) {
			local57 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((float) this.anInt10296 * (this.aClass10_Sub3_3.aFloat102 + (float) arg2 * this.aClass10_Sub3_3.aFloat103 + this.aClass10_Sub3_3.aFloat106 * (float) arg1 + this.aClass10_Sub3_3.aFloat108 * (float) arg0) / (float) arg6);
		@Pc(163) int local163 = (int) ((this.aClass10_Sub3_3.aFloat102 + this.aClass10_Sub3_3.aFloat103 * (float) arg5 + (float) arg3 * this.aClass10_Sub3_3.aFloat108 + (float) arg4 * this.aClass10_Sub3_3.aFloat106) * (float) this.anInt10296 / (float) arg6);
		if ((float) local130 < this.aFloat202 && (float) local163 < this.aFloat202) {
			local57 |= 0x1;
		} else if ((float) local130 > this.aFloat190 && this.aFloat190 < (float) local163) {
			local57 |= 0x2;
		}
		@Pc(236) int local236 = (int) ((this.aClass10_Sub3_3.aFloat109 * (float) arg1 + this.aClass10_Sub3_3.aFloat99 * (float) arg0 + this.aClass10_Sub3_3.aFloat107 * (float) arg2 + this.aClass10_Sub3_3.aFloat101) * (float) this.anInt10273 / (float) arg6);
		@Pc(269) int local269 = (int) ((this.aClass10_Sub3_3.aFloat109 * (float) arg4 + (float) arg3 * this.aClass10_Sub3_3.aFloat99 + (float) arg5 * this.aClass10_Sub3_3.aFloat107 + this.aClass10_Sub3_3.aFloat101) * (float) this.anInt10273 / (float) arg6);
		if (this.aFloat207 > (float) local236 && (float) local269 < this.aFloat207) {
			local57 |= 0x4;
		} else if (this.aFloat200 < (float) local236 && (float) local269 > this.aFloat200) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIB)V")
	public void method8738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt10280 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (arg1 != this.anInt10289) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local4 = true;
			this.anInt10289 = arg1;
		}
		if (arg0 != this.bf) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			this.bf = arg0;
			local4 = true;
		}
		if (local4) {
			this.anInt10264 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8634(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class5_Sub43 local19;
		while (!this.aClass20_65.method367()) {
			local19 = (Class5_Sub43) this.aClass20_65.method369();
			Static33.anIntArray40[local7++] = (int) local19.aLong312;
			this.anInt10263 -= local19.anInt6989;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static33.anIntArray40, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static33.anIntArray40, 0);
			local7 = 0;
		}
		while (!this.aClass20_66.method367()) {
			local19 = (Class5_Sub43) this.aClass20_66.method369();
			Static33.anIntArray40[local7++] = (int) local19.aLong312;
			this.anInt10261 -= local19.anInt6989;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static33.anIntArray40, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static33.anIntArray40, 0);
			local7 = 0;
		}
		while (!this.aClass20_67.method367()) {
			local19 = (Class5_Sub43) this.aClass20_67.method369();
			Static33.anIntArray40[local7++] = local19.anInt6989;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static33.anIntArray40, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static33.anIntArray40, 0);
			local7 = 0;
		}
		while (!this.aClass20_68.method367()) {
			local19 = (Class5_Sub43) this.aClass20_68.method369();
			Static33.anIntArray40[local7++] = (int) local19.aLong312;
			this.anInt10262 -= local19.anInt6989;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static33.anIntArray40, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static33.anIntArray40, 0);
		}
		while (!this.aClass20_64.method367()) {
			local19 = (Class5_Sub43) this.aClass20_64.method369();
			OpenGL.glDeleteLists((int) local19.aLong312, local19.anInt6989);
		}
		@Pc(223) Class5 local223;
		while (!this.aClass20_69.method367()) {
			local223 = this.aClass20_69.method369();
			OpenGL.glDeleteProgramARB((int) local223.aLong312);
		}
		while (!this.aClass20_70.method367()) {
			local223 = this.aClass20_70.method369();
			OpenGL.glDeleteObjectARB(local223.aLong312);
		}
		while (!this.aClass20_64.method367()) {
			local19 = (Class5_Sub43) this.aClass20_64.method369();
			OpenGL.glDeleteLists((int) local19.aLong312, local19.anInt6989);
		}
		this.aClass76_1.method1400();
		if (this.E() > 100663296 && Static480.method6763() > this.aLong290 + 60000L) {
			System.gc();
			this.aLong290 = Static480.method6763();
		}
		this.anInt10257 = local11;
	}

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "()V")
	@Override
	public void method8648() {
		if (this.aBoolean741) {
			if (this.anInterface10_1 != this.aClass219_6) {
				throw new RuntimeException();
			}
			this.aClass219_6.method4976(0);
			this.aClass219_6.method4976(8);
			this.method8748(this.aClass219_6);
		} else if (this.aBoolean739) {
			this.aClass155_Sub3_1.method7214(0, 0, this.anInt10154, this.anInt10175, 0, 0);
			this.anOpenGL2.setSurface(this.aLong289);
		} else {
			throw new RuntimeException("");
		}
		this.anInt10154 = this.anInt10183;
		this.anInt10175 = this.anInt10127;
		this.aClass155_Sub3_1 = null;
		this.method8680();
		this.method8691();
		this.la();
	}

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt10283;
		arg0[2] = this.anInt10274;
		arg0[0] = this.anInt10278;
		arg0[3] = this.anInt10275;
	}

	@OriginalMember(owner = "client!vf", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10276 = arg0;
		this.anInt10272 = arg3;
		this.anInt10270 = arg1;
		this.anInt10268 = arg2;
		this.aBoolean728 = true;
	}

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean718 = arg0;
		this.method8723();
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)V")
	public synchronized void method8739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub43 local8 = new Class5_Sub43(arg1);
		local8.aLong312 = (long) arg0;
		this.aClass20_65.method370(local8);
	}

	@OriginalMember(owner = "client!vf", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(12) boolean local12 = this.anInt10269 != arg0;
		if (local12 || arg1 != this.aFloat193 || arg2 != this.aFloat203) {
			this.aFloat203 = arg2;
			this.aFloat193 = arg1;
			this.anInt10269 = arg0;
			if (local12) {
				this.aFloat192 = (float) (this.anInt10269 & 0xFF) / 255.0F;
				this.aFloat199 = (float) (this.anInt10269 & 0xFF00) / 65280.0F;
				this.aFloat201 = (float) (this.anInt10269 & 0xFF0000) / 1.671168E7F;
				this.method8744();
			}
			this.method8742();
		}
		if (this.aFloatArray72[0] == arg3 && this.aFloatArray72[1] == arg4 && arg5 == this.aFloatArray72[2]) {
			return;
		}
		this.aFloatArray72[2] = arg5;
		this.aFloatArray72[1] = arg4;
		this.aFloatArray72[0] = arg3;
		this.aFloatArray73[0] = -arg3;
		this.aFloatArray73[1] = -arg4;
		this.aFloatArray73[2] = -arg5;
		@Pc(151) float local151 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray71[0] = arg3 * local151;
		this.aFloatArray71[2] = arg5 * local151;
		this.aFloatArray71[1] = local151 * arg4;
		this.aFloatArray74[2] = -this.aFloatArray71[2];
		this.aFloatArray74[0] = -this.aFloatArray71[0];
		this.aFloatArray74[1] = -this.aFloatArray71[1];
		this.method8721();
		this.anInt10290 = (int) (arg5 * 256.0F / arg4);
		this.anInt10287 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "(B)V")
	private void method8740() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray75, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V")
	@Override
	public void method8626(@OriginalArg(0) int arg0) {
		this.method8730();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(JZ)V")
	public synchronized void method8741(@OriginalArg(0) long arg0) {
		@Pc(12) Class5 local12 = new Class5();
		local12.aLong312 = arg0;
		this.aClass20_70.method370(local12);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([IIIIIZ)Lclient!hk;")
	@Override
	public Class155 method8636(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class155_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8583(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8582(arg2, arg3);
	}

	@OriginalMember(owner = "client!vf", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt10299;
		this.anInt10299 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!vf", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean728) {
			throw new RuntimeException("");
		}
		this.anInt10276 = arg0;
		this.anInt10268 = arg2;
		this.anInt10272 = arg3;
		this.anInt10270 = arg1;
		if (this.aBoolean740) {
			this.aClass3_1.aClass160_Sub9_1.method8069();
			this.aClass3_1.aClass160_Sub9_1.method8071();
		}
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "()V")
	@Override
	public void method8630() {
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8646(@OriginalArg(0) Canvas arg0) {
		this.aLong289 = 0L;
		this.aCanvas12 = null;
		if (arg0 == null || arg0 == this.aCanvas13) {
			this.aLong289 = this.aLong288;
			this.aCanvas12 = this.aCanvas13;
		} else if (this.aHashtable16.containsKey(arg0)) {
			@Pc(30) Long local30 = (Long) this.aHashtable16.get(arg0);
			this.aLong289 = local30;
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.aLong289 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong289);
		this.method8675();
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(II)I")
	@Override
	public int method8628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "(I)V")
	private void method8742() {
		Static378.aFloatArray54[1] = this.aFloat199 * this.aFloat193;
		Static378.aFloatArray54[3] = 1.0F;
		Static378.aFloatArray54[0] = this.aFloat193 * this.aFloat201;
		Static378.aFloatArray54[2] = this.aFloat193 * this.aFloat192;
		OpenGL.glLightfv(16384, 4609, Static378.aFloatArray54, 0);
		Static378.aFloatArray54[2] = -this.aFloat203 * this.aFloat192;
		Static378.aFloatArray54[3] = 1.0F;
		Static378.aFloatArray54[1] = -this.aFloat203 * this.aFloat199;
		Static378.aFloatArray54[0] = this.aFloat201 * -this.aFloat203;
		OpenGL.glLightfv(16385, 4609, Static378.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!gb;Z)V")
	public void method8743(@OriginalArg(0) Class29 arg0) {
		@Pc(11) Class29 local11 = this.aClass29Array1[this.anInt10280];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt9567);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt9567);
				} else if (local11.anInt9567 != arg0.anInt9567) {
					OpenGL.glDisable(local11.anInt9567);
					OpenGL.glEnable(arg0.anInt9567);
				}
				OpenGL.glBindTexture(arg0.anInt9567, arg0.method8170());
			}
			this.aClass29Array1[this.anInt10280] = arg0;
		}
		this.anInt10264 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "()Z")
	@Override
	public boolean method8641() {
		return this.aBoolean717 && (!this.method8656() || this.aBoolean733);
	}

	@OriginalMember(owner = "client!vf", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass10_Sub3_3.aFloat104 * (float) arg2 + (float) arg0 * this.aClass10_Sub3_3.aFloat100 + this.aClass10_Sub3_3.aFloat110 * (float) arg1 + this.aClass10_Sub3_3.aFloat105;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg5 * this.aClass10_Sub3_3.aFloat104 + (float) arg3 * this.aClass10_Sub3_3.aFloat100 + (float) arg4 * this.aClass10_Sub3_3.aFloat110 + this.aClass10_Sub3_3.aFloat105;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt10291 > local32 && (float) this.anInt10291 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt10279 < local32 && (float) this.anInt10279 < local63) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) ((this.aClass10_Sub3_3.aFloat102 + this.aClass10_Sub3_3.aFloat103 * (float) arg2 + this.aClass10_Sub3_3.aFloat106 * (float) arg1 + (float) arg0 * this.aClass10_Sub3_3.aFloat108) * (float) this.anInt10296 / local32);
		@Pc(173) int local173 = (int) ((this.aClass10_Sub3_3.aFloat108 * (float) arg3 + (float) arg4 * this.aClass10_Sub3_3.aFloat106 + this.aClass10_Sub3_3.aFloat103 * (float) arg5 + this.aClass10_Sub3_3.aFloat102) * (float) this.anInt10296 / local63);
		if ((float) local141 < this.aFloat202 && this.aFloat202 > (float) local173) {
			local7 |= 0x1;
		} else if (this.aFloat190 < (float) local141 && this.aFloat190 < (float) local173) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) ((this.aClass10_Sub3_3.aFloat99 * (float) arg0 + this.aClass10_Sub3_3.aFloat109 * (float) arg1 + this.aClass10_Sub3_3.aFloat107 * (float) arg2 + this.aClass10_Sub3_3.aFloat101) * (float) this.anInt10273 / local32);
		@Pc(277) int local277 = (int) ((float) this.anInt10273 * ((float) arg5 * this.aClass10_Sub3_3.aFloat107 + this.aClass10_Sub3_3.aFloat99 * (float) arg3 + (float) arg4 * this.aClass10_Sub3_3.aFloat109 + this.aClass10_Sub3_3.aFloat101) / local63);
		if (this.aFloat207 > (float) local245 && this.aFloat207 > (float) local277) {
			local7 |= 0x4;
		} else if (this.aFloat200 < (float) local245 && this.aFloat200 < (float) local277) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V")
	private void method8744() {
		Static378.aFloatArray54[2] = this.aFloat196 * this.aFloat192;
		Static378.aFloatArray54[3] = 1.0F;
		Static378.aFloatArray54[1] = this.aFloat199 * this.aFloat196;
		Static378.aFloatArray54[0] = this.aFloat201 * this.aFloat196;
		OpenGL.glLightModelfv(2899, Static378.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method8638(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!vf", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt10154) {
			arg2 = this.anInt10154;
		}
		if (this.anInt10175 < arg3) {
			arg3 = this.anInt10175;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt10275 = arg3;
		this.anInt10274 = arg2;
		this.anInt10278 = arg0;
		this.anInt10283 = arg1;
		OpenGL.glEnable(3089);
		this.method8724();
		this.method8698();
	}

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "(I)V")
	public void method8745() {
		if (this.anInt10264 == 8) {
			return;
		}
		this.method8679();
		this.method8692(true);
		this.method8709(true);
		this.method8735(true);
		this.method8728(1);
		this.anInt10264 = 8;
	}

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "(I)V")
	private void method8746() {
		this.aClass29Array1 = new Class29[this.anInt10285];
		this.aClass29_Sub3_6 = new Class29_Sub3(this, 3553, 6408, 1, 1);
		new Class29_Sub3(this, 3553, 6408, 1, 1);
		new Class29_Sub3(this, 3553, 6408, 1, 1);
		this.aClass43_Sub1_7 = new Class43_Sub1(this);
		this.aClass43_Sub1_9 = new Class43_Sub1(this);
		this.aClass43_Sub1_4 = new Class43_Sub1(this);
		this.aClass43_Sub1_10 = new Class43_Sub1(this);
		this.aClass43_Sub1_8 = new Class43_Sub1(this);
		this.aClass43_Sub1_6 = new Class43_Sub1(this);
		this.aClass43_Sub1_2 = new Class43_Sub1(this);
		this.aClass43_Sub1_3 = new Class43_Sub1(this);
		this.aClass43_Sub1_1 = new Class43_Sub1(this);
		this.aClass43_Sub1_5 = new Class43_Sub1(this);
		if (this.aBoolean741) {
			this.aClass219_7 = new Class219(this);
			new Class219(this);
		}
	}

	@OriginalMember(owner = "client!vf", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass10_Sub3_3.aFloat100 * (float) arg0 + (float) arg1 * this.aClass10_Sub3_3.aFloat110 + (float) arg2 * this.aClass10_Sub3_3.aFloat104 + this.aClass10_Sub3_3.aFloat105;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(78) int local78 = (int) ((this.aClass10_Sub3_3.aFloat106 * (float) arg1 + (float) arg0 * this.aClass10_Sub3_3.aFloat108 + (float) arg2 * this.aClass10_Sub3_3.aFloat103 + this.aClass10_Sub3_3.aFloat102) * (float) this.anInt10296 / local28);
		@Pc(110) int local110 = (int) ((float) this.anInt10273 * (this.aClass10_Sub3_3.aFloat101 + (float) arg0 * this.aClass10_Sub3_3.aFloat99 + (float) arg1 * this.aClass10_Sub3_3.aFloat109 + this.aClass10_Sub3_3.aFloat107 * (float) arg2) / local28);
		arg3[0] = (int) ((float) local78 - this.aFloat202);
		arg3[1] = (int) ((float) local110 - this.aFloat207);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	@Override
	public void method8662(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8606() {
		this.method8684();
		this.method8728(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vf", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.lb == arg0 && arg1 == this.anInt10292 && this.anInt10267 == arg2) {
			return;
		}
		this.anInt10292 = arg1;
		this.anInt10267 = arg2;
		this.lb = arg0;
		this.method8685();
		this.method8699();
	}

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "()Z")
	@Override
	public boolean method8624() {
		return true;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!fh;B)V")
	public void method8747(@OriginalArg(0) Class10_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method2819(), 0);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lclient!dr;I)V")
	public void method8748(@OriginalArg(0) Interface10 arg0) {
		if (this.aBoolean722) {
			this.method8725(arg0);
			this.method8705(arg0);
		} else if (this.anInt10260 >= 0 && arg0 == this.anInterface10Array2[this.anInt10260]) {
			this.anInterface10Array2[this.anInt10260--] = null;
			arg0.method4965();
			if (this.anInt10260 < 0) {
				this.anInterface10_2 = this.anInterface10_1 = null;
			} else {
				this.anInterface10_2 = this.anInterface10_1 = this.anInterface10Array2[this.anInt10260];
				this.anInterface10_2.method4962();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(III)V")
	public synchronized void method8749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub43 local8 = new Class5_Sub43(arg1);
		local8.aLong312 = (long) arg0;
		this.aClass20_68.method370(local8);
	}

	@OriginalMember(owner = "client!vf", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10273 = arg3;
		this.anInt10295 = arg0;
		this.anInt10277 = arg1;
		this.anInt10296 = arg2;
		this.method8706();
		this.method8724();
		if (this.anInt10286 == 3) {
			this.method8672();
		} else if (this.anInt10286 == 2) {
			this.method8740();
			return;
		}
	}

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "()V")
	@Override
	public void method8654() {
		this.aClass209_1.method4798();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZB)V")
	public void method8750(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method8737(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt10263 + this.anInt10261 + this.anInt10262;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!sn;)V")
	@Override
	public void method8586(@OriginalArg(0) Class336 arg0) {
		this.aClass150_1.method3414(-1, this, arg0);
	}
}
