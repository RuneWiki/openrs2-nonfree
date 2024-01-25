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

@OriginalClass("client!nv")
public final class Class16_Sub3 extends Class16 {

	@OriginalMember(owner = "client!nv", name = "hb", descriptor = "I")
	private int anInt7173;

	@OriginalMember(owner = "client!nv", name = "hc", descriptor = "I")
	private int anInt7222;

	@OriginalMember(owner = "client!nv", name = "fd", descriptor = "I")
	public int anInt7270;

	@OriginalMember(owner = "client!nv", name = "pe", descriptor = "I")
	public int anInt7331;

	@OriginalMember(owner = "client!nv", name = "Ie", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!nv", name = "Je", descriptor = "I")
	public int anInt7338;

	@OriginalMember(owner = "client!nv", name = "Le", descriptor = "Lclient!ao;")
	private Class21_Sub1 aClass21_Sub1_1;

	@OriginalMember(owner = "client!nv", name = "Qe", descriptor = "Lclient!gk;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!nv", name = "Re", descriptor = "Lclient!gk;")
	private Interface7 anInterface7_2;

	@OriginalMember(owner = "client!nv", name = "Ue", descriptor = "Lclient!er;")
	private Class89 aClass89_6;

	@OriginalMember(owner = "client!nv", name = "Ve", descriptor = "I")
	private int anInt7343;

	@OriginalMember(owner = "client!nv", name = "We", descriptor = "I")
	public int anInt7344;

	@OriginalMember(owner = "client!nv", name = "Ye", descriptor = "I")
	public int anInt7345;

	@OriginalMember(owner = "client!nv", name = "ff", descriptor = "J")
	private long aLong183;

	@OriginalMember(owner = "client!nv", name = "gf", descriptor = "Z")
	private boolean aBoolean505;

	@OriginalMember(owner = "client!nv", name = "jf", descriptor = "Z")
	private boolean aBoolean506;

	@OriginalMember(owner = "client!nv", name = "kf", descriptor = "I")
	private int anInt7346;

	@OriginalMember(owner = "client!nv", name = "lf", descriptor = "Z")
	private boolean aBoolean507;

	@OriginalMember(owner = "client!nv", name = "mf", descriptor = "I")
	private int anInt7347;

	@OriginalMember(owner = "client!nv", name = "nf", descriptor = "Z")
	private boolean aBoolean508;

	@OriginalMember(owner = "client!nv", name = "of", descriptor = "I")
	private int anInt7348;

	@OriginalMember(owner = "client!nv", name = "sf", descriptor = "Z")
	public boolean aBoolean510;

	@OriginalMember(owner = "client!nv", name = "tf", descriptor = "Lclient!lea;")
	public Class83_Sub2 aClass83_Sub2_1;

	@OriginalMember(owner = "client!nv", name = "uf", descriptor = "Lclient!lea;")
	public Class83_Sub2 aClass83_Sub2_2;

	@OriginalMember(owner = "client!nv", name = "vf", descriptor = "Ljava/lang/String;")
	private String aString73;

	@OriginalMember(owner = "client!nv", name = "yf", descriptor = "I")
	public int anInt7350;

	@OriginalMember(owner = "client!nv", name = "zf", descriptor = "I")
	public int anInt7351;

	@OriginalMember(owner = "client!nv", name = "Af", descriptor = "Z")
	public boolean aBoolean511;

	@OriginalMember(owner = "client!nv", name = "Cf", descriptor = "I")
	public int anInt7353;

	@OriginalMember(owner = "client!nv", name = "Df", descriptor = "Z")
	private boolean aBoolean512;

	@OriginalMember(owner = "client!nv", name = "Gf", descriptor = "I")
	private int anInt7354;

	@OriginalMember(owner = "client!nv", name = "Jf", descriptor = "Lclient!ji;")
	private Class40_Sub2 aClass40_Sub2_1;

	@OriginalMember(owner = "client!nv", name = "Kf", descriptor = "I")
	private int anInt7355;

	@OriginalMember(owner = "client!nv", name = "Pf", descriptor = "Z")
	public boolean aBoolean515;

	@OriginalMember(owner = "client!nv", name = "Qf", descriptor = "Lclient!lea;")
	public Class83_Sub2 aClass83_Sub2_3;

	@OriginalMember(owner = "client!nv", name = "Rf", descriptor = "Z")
	public boolean aBoolean516;

	@OriginalMember(owner = "client!nv", name = "Sf", descriptor = "Lclient!lea;")
	public Class83_Sub2 aClass83_Sub2_4;

	@OriginalMember(owner = "client!nv", name = "Tf", descriptor = "F")
	private float aFloat154;

	@OriginalMember(owner = "client!nv", name = "Vf", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!nv", name = "Yf", descriptor = "Z")
	private boolean aBoolean518;

	@OriginalMember(owner = "client!nv", name = "ag", descriptor = "Lclient!id;")
	private Interface9 anInterface9_4;

	@OriginalMember(owner = "client!nv", name = "bg", descriptor = "I")
	private int anInt7360;

	@OriginalMember(owner = "client!nv", name = "cg", descriptor = "F")
	private float aFloat156;

	@OriginalMember(owner = "client!nv", name = "fg", descriptor = "Z")
	public boolean aBoolean519;

	@OriginalMember(owner = "client!nv", name = "gg", descriptor = "Z")
	private boolean aBoolean520;

	@OriginalMember(owner = "client!nv", name = "hg", descriptor = "F")
	public float aFloat157;

	@OriginalMember(owner = "client!nv", name = "ig", descriptor = "Lclient!pw;")
	public Class268 aClass268_12;

	@OriginalMember(owner = "client!nv", name = "lg", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!nv", name = "mg", descriptor = "[Lclient!tha;")
	private Class20[] aClass20Array1;

	@OriginalMember(owner = "client!nv", name = "og", descriptor = "Lclient!lea;")
	public Class83_Sub2 aClass83_Sub2_5;

	@OriginalMember(owner = "client!nv", name = "rg", descriptor = "Lclient!lea;")
	public Class83_Sub2 aClass83_Sub2_6;

	@OriginalMember(owner = "client!nv", name = "sg", descriptor = "Lclient!pw;")
	public Class268 aClass268_13;

	@OriginalMember(owner = "client!nv", name = "tg", descriptor = "Lclient!id;")
	private Interface9 anInterface9_5;

	@OriginalMember(owner = "client!nv", name = "ug", descriptor = "Lclient!tv;")
	private Interface23 anInterface23_3;

	@OriginalMember(owner = "client!nv", name = "vg", descriptor = "Lclient!wn;")
	public Class20_Sub4 aClass20_Sub4_5;

	@OriginalMember(owner = "client!nv", name = "wg", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!nv", name = "Cg", descriptor = "Lclient!lea;")
	public Class83_Sub2 aClass83_Sub2_7;

	@OriginalMember(owner = "client!nv", name = "Dg", descriptor = "Lclient!lea;")
	public Class83_Sub2 aClass83_Sub2_8;

	@OriginalMember(owner = "client!nv", name = "Eg", descriptor = "I")
	private int anInt7368;

	@OriginalMember(owner = "client!nv", name = "Ig", descriptor = "I")
	private int anInt7371;

	@OriginalMember(owner = "client!nv", name = "Lg", descriptor = "I")
	private int anInt7373;

	@OriginalMember(owner = "client!nv", name = "Mg", descriptor = "I")
	private int anInt7374;

	@OriginalMember(owner = "client!nv", name = "Og", descriptor = "I")
	public int anInt7375;

	@OriginalMember(owner = "client!nv", name = "Rg", descriptor = "Z")
	public boolean aBoolean523;

	@OriginalMember(owner = "client!nv", name = "Sg", descriptor = "F")
	private float aFloat164;

	@OriginalMember(owner = "client!nv", name = "Tg", descriptor = "Lclient!tea;")
	private Class20_Sub4_Sub1 aClass20_Sub4_Sub1_5;

	@OriginalMember(owner = "client!nv", name = "Wg", descriptor = "Lclient!lea;")
	public Class83_Sub2 aClass83_Sub2_9;

	@OriginalMember(owner = "client!nv", name = "Xg", descriptor = "Lclient!lea;")
	public Class83_Sub2 aClass83_Sub2_10;

	@OriginalMember(owner = "client!nv", name = "Yg", descriptor = "Z")
	public boolean aBoolean525;

	@OriginalMember(owner = "client!nv", name = "bh", descriptor = "Ljava/lang/String;")
	private String aString74;

	@OriginalMember(owner = "client!nv", name = "ch", descriptor = "Z")
	public boolean aBoolean526;

	@OriginalMember(owner = "client!nv", name = "eh", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!nv", name = "hh", descriptor = "Z")
	private boolean aBoolean528;

	@OriginalMember(owner = "client!nv", name = "ih", descriptor = "Z")
	private boolean aBoolean529;

	@OriginalMember(owner = "client!nv", name = "mh", descriptor = "Z")
	private boolean aBoolean532;

	@OriginalMember(owner = "client!nv", name = "ph", descriptor = "Lclient!er;")
	public Class89 aClass89_7;

	@OriginalMember(owner = "client!nv", name = "qh", descriptor = "Z")
	private boolean aBoolean533;

	@OriginalMember(owner = "client!nv", name = "sh", descriptor = "I")
	private int anInt7381;

	@OriginalMember(owner = "client!nv", name = "th", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!nv", name = "wh", descriptor = "Z")
	public boolean aBoolean534;

	@OriginalMember(owner = "client!nv", name = "Ah", descriptor = "I")
	private int anInt7383;

	@OriginalMember(owner = "client!nv", name = "Ch", descriptor = "I")
	private int anInt7384;

	@OriginalMember(owner = "client!nv", name = "te", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!nv", name = "ye", descriptor = "I")
	public int anInt7336 = 128;

	@OriginalMember(owner = "client!nv", name = "Ae", descriptor = "Lclient!we;")
	private final Class368 aClass368_1 = new Class368();

	@OriginalMember(owner = "client!nv", name = "Ce", descriptor = "Lclient!eb;")
	private final Class54_Sub2 aClass54_Sub2_1 = new Class54_Sub2();

	@OriginalMember(owner = "client!nv", name = "De", descriptor = "Lclient!eb;")
	public final Class54_Sub2 aClass54_Sub2_2 = new Class54_Sub2();

	@OriginalMember(owner = "client!nv", name = "He", descriptor = "I")
	public int anInt7337 = 8;

	@OriginalMember(owner = "client!nv", name = "Ge", descriptor = "Z")
	private boolean aBoolean504 = false;

	@OriginalMember(owner = "client!nv", name = "Ke", descriptor = "I")
	public int anInt7339 = 3;

	@OriginalMember(owner = "client!nv", name = "Fe", descriptor = "Lclient!bq;")
	private final Class43 aClass43_41 = new Class43();

	@OriginalMember(owner = "client!nv", name = "Me", descriptor = "I")
	private int anInt7340 = -1;

	@OriginalMember(owner = "client!nv", name = "Ne", descriptor = "[Lclient!gk;")
	private final Interface7[] anInterface7Array1 = new Interface7[4];

	@OriginalMember(owner = "client!nv", name = "Oe", descriptor = "[Lclient!gk;")
	private final Interface7[] anInterface7Array2 = new Interface7[4];

	@OriginalMember(owner = "client!nv", name = "Pe", descriptor = "[Lclient!gk;")
	private final Interface7[] anInterface7Array3 = new Interface7[4];

	@OriginalMember(owner = "client!nv", name = "Se", descriptor = "I")
	private int anInt7341 = -1;

	@OriginalMember(owner = "client!nv", name = "Te", descriptor = "I")
	private int anInt7342 = -1;

	@OriginalMember(owner = "client!nv", name = "Xe", descriptor = "Lclient!bq;")
	private final Class43 aClass43_42;

	@OriginalMember(owner = "client!nv", name = "Ze", descriptor = "Lclient!bq;")
	private final Class43 aClass43_43;

	@OriginalMember(owner = "client!nv", name = "af", descriptor = "Lclient!bq;")
	private final Class43 aClass43_44;

	@OriginalMember(owner = "client!nv", name = "bf", descriptor = "Lclient!bq;")
	private final Class43 bf;

	@OriginalMember(owner = "client!nv", name = "cf", descriptor = "Lclient!bq;")
	private final Class43 aClass43_45;

	@OriginalMember(owner = "client!nv", name = "df", descriptor = "Lclient!bq;")
	private final Class43 aClass43_46;

	@OriginalMember(owner = "client!nv", name = "ef", descriptor = "Lclient!bq;")
	private final Class43 aClass43_47;

	@OriginalMember(owner = "client!nv", name = "hf", descriptor = "Lclient!eb;")
	public final Class54_Sub2 aClass54_Sub2_3;

	@OriginalMember(owner = "client!nv", name = "pf", descriptor = "Lclient!eb;")
	public final Class54_Sub2 aClass54_Sub2_4;

	@OriginalMember(owner = "client!nv", name = "qf", descriptor = "Lclient!eb;")
	public final Class54_Sub2 aClass54_Sub2_5;

	@OriginalMember(owner = "client!nv", name = "Mf", descriptor = "F")
	public float aFloat152;

	@OriginalMember(owner = "client!nv", name = "wf", descriptor = "I")
	private int anInt7349;

	@OriginalMember(owner = "client!nv", name = "Zf", descriptor = "I")
	private int anInt7359;

	@OriginalMember(owner = "client!nv", name = "kg", descriptor = "I")
	public int anInt7362;

	@OriginalMember(owner = "client!nv", name = "Nf", descriptor = "F")
	public float aFloat153;

	@OriginalMember(owner = "client!nv", name = "xf", descriptor = "[F")
	private final float[] aFloatArray62;

	@OriginalMember(owner = "client!nv", name = "Bf", descriptor = "I")
	private int anInt7352;

	@OriginalMember(owner = "client!nv", name = "qg", descriptor = "[F")
	public final float[] aFloatArray64;

	@OriginalMember(owner = "client!nv", name = "dg", descriptor = "[F")
	private final float[] aFloatArray63;

	@OriginalMember(owner = "client!nv", name = "yg", descriptor = "F")
	private float aFloat160;

	@OriginalMember(owner = "client!nv", name = "zg", descriptor = "I")
	public int anInt7365;

	@OriginalMember(owner = "client!nv", name = "Hg", descriptor = "F")
	private float aFloat161;

	@OriginalMember(owner = "client!nv", name = "Gg", descriptor = "I")
	private int anInt7370;

	@OriginalMember(owner = "client!nv", name = "Xf", descriptor = "I")
	public int anInt7358;

	@OriginalMember(owner = "client!nv", name = "Of", descriptor = "I")
	private int anInt7356;

	@OriginalMember(owner = "client!nv", name = "xg", descriptor = "I")
	public int anInt7364;

	@OriginalMember(owner = "client!nv", name = "Lf", descriptor = "F")
	private float aFloat151;

	@OriginalMember(owner = "client!nv", name = "If", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!nv", name = "Fg", descriptor = "I")
	private int anInt7369;

	@OriginalMember(owner = "client!nv", name = "Ff", descriptor = "F")
	private float aFloat149;

	@OriginalMember(owner = "client!nv", name = "gh", descriptor = "Z")
	private boolean aBoolean527;

	@OriginalMember(owner = "client!nv", name = "Zg", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!nv", name = "eg", descriptor = "I")
	private int anInt7361;

	@OriginalMember(owner = "client!nv", name = "fh", descriptor = "I")
	public int anInt7379;

	@OriginalMember(owner = "client!nv", name = "Jg", descriptor = "F")
	private float aFloat162;

	@OriginalMember(owner = "client!nv", name = "Qg", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!nv", name = "Uf", descriptor = "I")
	private int anInt7357;

	@OriginalMember(owner = "client!nv", name = "Bg", descriptor = "I")
	public int anInt7367;

	@OriginalMember(owner = "client!nv", name = "pg", descriptor = "I")
	public int anInt7363;

	@OriginalMember(owner = "client!nv", name = "ah", descriptor = "I")
	public int anInt7377;

	@OriginalMember(owner = "client!nv", name = "lh", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!nv", name = "jh", descriptor = "Z")
	private boolean aBoolean530;

	@OriginalMember(owner = "client!nv", name = "dh", descriptor = "I")
	public int anInt7378;

	@OriginalMember(owner = "client!nv", name = "ng", descriptor = "[Lclient!ada;")
	private final Class8_Sub1[] aClass8_Sub1Array6;

	@OriginalMember(owner = "client!nv", name = "Kg", descriptor = "I")
	private int anInt7372;

	@OriginalMember(owner = "client!nv", name = "nh", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!nv", name = "rh", descriptor = "I")
	public int anInt7380;

	@OriginalMember(owner = "client!nv", name = "Vg", descriptor = "[F")
	private final float[] aFloatArray65;

	@OriginalMember(owner = "client!nv", name = "Ag", descriptor = "I")
	private int anInt7366;

	@OriginalMember(owner = "client!nv", name = "vh", descriptor = "I")
	public int anInt7382;

	@OriginalMember(owner = "client!nv", name = "oh", descriptor = "[F")
	private final float[] aFloatArray66;

	@OriginalMember(owner = "client!nv", name = "uh", descriptor = "Lclient!bs;")
	public Class8_Sub8_Sub1 aClass8_Sub8_Sub1_2;

	@OriginalMember(owner = "client!nv", name = "Bh", descriptor = "[B")
	public final byte[] aByteArray54;

	@OriginalMember(owner = "client!nv", name = "yh", descriptor = "[I")
	public int[] anIntArray396;

	@OriginalMember(owner = "client!nv", name = "zh", descriptor = "[I")
	public int[] anIntArray397;

	@OriginalMember(owner = "client!nv", name = "xh", descriptor = "[I")
	public int[] anIntArray395;

	@OriginalMember(owner = "client!nv", name = "ce", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas11;

	@OriginalMember(owner = "client!nv", name = "ub", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!nv", name = "xe", descriptor = "I")
	public final int anInt7335;

	@OriginalMember(owner = "client!nv", name = "oc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!nv", name = "rb", descriptor = "J")
	private final long aLong182;

	@OriginalMember(owner = "client!nv", name = "fb", descriptor = "J")
	private long aLong181;

	@OriginalMember(owner = "client!nv", name = "Pg", descriptor = "I")
	public final int anInt7376;

	@OriginalMember(owner = "client!nv", name = "kh", descriptor = "Z")
	public boolean aBoolean531;

	@OriginalMember(owner = "client!nv", name = "rf", descriptor = "Z")
	private boolean aBoolean509;

	@OriginalMember(owner = "client!nv", name = "Ef", descriptor = "Z")
	public boolean aBoolean513;

	@OriginalMember(owner = "client!nv", name = "jg", descriptor = "Z")
	public boolean aBoolean521;

	@OriginalMember(owner = "client!nv", name = "Wf", descriptor = "Z")
	public boolean aBoolean517;

	@OriginalMember(owner = "client!nv", name = "Hf", descriptor = "Z")
	private boolean aBoolean514;

	@OriginalMember(owner = "client!nv", name = "Ug", descriptor = "Z")
	public boolean aBoolean524;

	@OriginalMember(owner = "client!nv", name = "Ng", descriptor = "Z")
	private final boolean aBoolean522;

	@OriginalMember(owner = "client!nv", name = "Be", descriptor = "Lclient!ce;")
	private final Class51 aClass51_1;

	@OriginalMember(owner = "client!nv", name = "Ee", descriptor = "Lclient!nea;")
	public final Class221 aClass221_1;

	@OriginalMember(owner = "client!nv", name = "ze", descriptor = "Lclient!es;")
	private final Class90 aClass90_1;

	@OriginalMember(owner = "client!nv", name = "ue", descriptor = "Lclient!ld;")
	private Class8_Sub32_Sub1 aClass8_Sub32_Sub1_1;

	@OriginalMember(owner = "client!nv", name = "we", descriptor = "Lclient!pba;")
	private final Class248 aClass248_1;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class16_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class302();
		new Class253(16);
		this.aClass43_42 = new Class43();
		this.aClass43_43 = new Class43();
		this.aClass43_44 = new Class43();
		this.bf = new Class43();
		this.aClass43_45 = new Class43();
		this.aClass43_46 = new Class43();
		this.aClass43_47 = new Class43();
		this.aClass54_Sub2_3 = new Class54_Sub2();
		this.aClass54_Sub2_4 = new Class54_Sub2();
		this.aClass54_Sub2_5 = new Class54_Sub2();
		this.aFloat152 = 3584.0F;
		this.anInt7349 = 8448;
		this.anInt7359 = 0;
		this.anInt7362 = 512;
		this.aFloat153 = 1.0F;
		this.aFloatArray62 = new float[4];
		this.anInt7352 = 3584;
		this.aFloatArray64 = new float[4];
		this.aFloatArray63 = new float[16];
		this.aFloat160 = -1.0F;
		this.anInt7365 = -1;
		this.aFloat161 = 0.0F;
		this.anInt7370 = -1;
		this.anInt7358 = 512;
		this.anInt7356 = 0;
		this.anInt7364 = -1;
		this.aFloat151 = 1.0F;
		this.aFloat150 = 1.0F;
		this.anInt7369 = 0;
		this.aFloat149 = -1.0F;
		this.aBoolean527 = true;
		this.aFloat165 = -1.0F;
		this.anInt7361 = 0;
		this.anInt7379 = 0;
		this.aFloat162 = 1.0F;
		this.aFloat163 = -1.0F;
		this.anInt7357 = 0;
		this.anInt7367 = -1;
		this.anInt7363 = 0;
		this.anInt7377 = 50;
		this.aFloat167 = 1.0F;
		this.aBoolean530 = false;
		this.anInt7378 = -1;
		this.aClass8_Sub1Array6 = new Class8_Sub1[Static614.anInt6683];
		this.anInt7372 = 0;
		this.aFloat168 = 3584.0F;
		this.anInt7380 = 0;
		this.aFloatArray65 = new float[4];
		this.anInt7366 = 8448;
		this.anInt7382 = 0;
		this.aFloatArray66 = new float[4];
		this.aClass8_Sub8_Sub1_2 = new Class8_Sub8_Sub1(8192);
		this.aByteArray54 = new byte[16384];
		this.anIntArray396 = new int[1];
		this.anIntArray397 = new int[1];
		this.anIntArray395 = new int[1];
		this.aCanvas10 = this.aCanvas11 = arg0;
		this.anInt7335 = arg2;
		if (!Static267.method4634("jaclib")) {
			throw new RuntimeException("");
		} else if (Static267.method4634("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong181 = this.aLong182 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt7335);
				if (this.aLong182 == 0L) {
					throw new RuntimeException("");
				}
				this.method5970();
				@Pc(335) int local335 = this.method6004();
				if (local335 != 0) {
					throw new RuntimeException("");
				}
				this.anInt7376 = this.aBoolean519 ? 33639 : 5121;
				if (this.aString74.indexOf("radeon") != -1) {
					@Pc(361) int local361 = 0;
					@Pc(363) boolean local363 = false;
					@Pc(365) boolean local365 = false;
					@Pc(374) String[] local374 = Static403.method6410(this.aString74.replace('/', ' '), ' ');
					for (@Pc(376) int local376 = 0; local376 < local374.length; local376++) {
						@Pc(382) String local382 = local374[local376];
						try {
							if (local382.length() > 0) {
								if (local382.charAt(0) == 'x' && local382.length() >= 3 && Static577.method8064(local382.substring(1, 3))) {
									local382 = local382.substring(1);
									local365 = true;
								}
								if (local382.equals("hd")) {
									local363 = true;
								} else {
									if (local382.startsWith("hd")) {
										local382 = local382.substring(2);
										local363 = true;
									}
									if (local382.length() >= 4 && Static577.method8064(local382.substring(0, 4))) {
										local361 = Static82.method2080(local382.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(449) Exception local449) {
						}
					}
					if (!local365 && !local363) {
						if (local361 >= 7000 && local361 <= 9250) {
							this.aBoolean531 = false;
						}
						if (local361 >= 7000 && local361 <= 7999) {
							this.aBoolean509 = false;
						}
					}
					if (!local363 || local361 < 4000) {
						this.aBoolean513 = false;
					}
					this.aBoolean521 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean517 = true;
					this.aBoolean514 = this.aBoolean509;
				}
				if (this.aString73.indexOf("intel") != -1) {
					this.aBoolean524 = false;
				}
				this.aBoolean522 = !this.aString73.equals("s3 graphics");
				if (this.aBoolean509) {
					try {
						@Pc(534) int[] local534 = new int[1];
						OpenGL.glGenBuffersARB(1, local534, 0);
					} catch (@Pc(540) Throwable local540) {
						throw new RuntimeException("");
					}
				}
				Static93.method2184(false, true);
				this.aBoolean504 = true;
				this.aClass51_1 = new Class51(this, super.anInterface2_12);
				this.method6012();
				this.aClass221_1 = new Class221(this);
				this.aClass90_1 = new Class90(this);
				if (this.aClass90_1.method2938()) {
					this.aClass8_Sub32_Sub1_1 = new Class8_Sub32_Sub1(this);
					if (!this.aClass8_Sub32_Sub1_1.method4960()) {
						this.aClass8_Sub32_Sub1_1.method4950();
						this.aClass8_Sub32_Sub1_1 = null;
					}
				}
				this.aClass248_1 = new Class248(this);
				this.method6009();
				this.method5958();
				this.method6081();
			} catch (@Pc(614) Throwable local614) {
				local614.printStackTrace();
				this.method6053();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!nv", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt7339 = 0;
		while (arg0 > 1) {
			this.anInt7339++;
			arg0 >>= 0x1;
		}
		this.anInt7337 = 0x1 << this.anInt7339;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!id;B)V")
	public void method5943(@OriginalArg(0) Interface9 arg0) {
		if (this.anInterface9_5 != arg0) {
			if (this.aBoolean509) {
				OpenGL.glBindBufferARB(34962, arg0.method6287());
			}
			this.anInterface9_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "()Z")
	@Override
	public boolean method6079() {
		return this.aClass8_Sub32_Sub1_1 != null && this.aClass8_Sub32_Sub1_1.method4953();
	}

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "()Lclient!oba;")
	@Override
	public Class234 method6103() {
		@Pc(7) int local7 = -1;
		if (this.aString73.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString73.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString73.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class234(local7, "OpenGL", this.anInt7355, this.aString74, 0L);
	}

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "(II)V")
	public void method5944(@OriginalArg(1) int arg0) {
		if (this.anInt7360 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt7360 = arg0;
		}
	}

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "()V")
	@Override
	public void method6095() {
		this.aClass90_1.method2936();
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(Z)V")
	private void method5945() {
		this.aFloat166 = this.anInt7361 - this.anInt7363;
		this.aFloat157 = this.anInt7357 - this.anInt7379;
		this.aFloat158 = this.anInt7359 - this.anInt7379;
		this.aFloat155 = this.anInt7356 - this.anInt7363;
	}

	@OriginalMember(owner = "client!nv", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean527 = arg0;
		this.method5987();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "()V")
	@Override
	protected void method6053() {
		for (@Pc(6) Class8 local6 = this.aClass43_41.method1422(); local6 != null; local6 = this.aClass43_41.method1426()) {
			((Class8_Sub30_Sub1) local6).method4684();
		}
		if (this.aClass90_1 != null) {
			this.aClass90_1.method2943();
		}
		if (this.anOpenGL2 != null) {
			this.method5979();
			@Pc(40) Enumeration local40 = this.aHashtable4.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable4.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean504) {
			Static266.method4631(false, true);
			this.aBoolean504 = false;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6096(@OriginalArg(0) Class8_Sub30 arg0) {
		this.aNativeHeap5 = ((Class8_Sub30_Sub1) arg0).aNativeHeap4;
		if (this.anInterface9_4 != null) {
			return;
		}
		@Pc(16) Class8_Sub8_Sub1 local16 = new Class8_Sub8_Sub1(80);
		if (this.aBoolean519) {
			local16.method1576(-1.0F);
			local16.method1576(-1.0F);
			local16.method1576(0.0F);
			local16.method1576(0.0F);
			local16.method1576(1.0F);
			local16.method1576(1.0F);
			local16.method1576(-1.0F);
			local16.method1576(0.0F);
			local16.method1576(1.0F);
			local16.method1576(1.0F);
			local16.method1576(1.0F);
			local16.method1576(1.0F);
			local16.method1576(0.0F);
			local16.method1576(1.0F);
			local16.method1576(0.0F);
			local16.method1576(-1.0F);
			local16.method1576(1.0F);
			local16.method1576(0.0F);
			local16.method1576(0.0F);
			local16.method1576(0.0F);
		} else {
			local16.method1578(-1.0F);
			local16.method1578(-1.0F);
			local16.method1578(0.0F);
			local16.method1578(0.0F);
			local16.method1578(1.0F);
			local16.method1578(1.0F);
			local16.method1578(-1.0F);
			local16.method1578(0.0F);
			local16.method1578(1.0F);
			local16.method1578(1.0F);
			local16.method1578(1.0F);
			local16.method1578(1.0F);
			local16.method1578(0.0F);
			local16.method1578(1.0F);
			local16.method1578(0.0F);
			local16.method1578(-1.0F);
			local16.method1578(1.0F);
			local16.method1578(0.0F);
			local16.method1578(0.0F);
			local16.method1578(0.0F);
		}
		this.anInterface9_4 = this.method5997(local16.aByteArray107, false, local16.anInt10588, 20);
		this.aClass268_13 = new Class268(this.anInterface9_4, 5126, 3, 0);
		this.aClass268_12 = new Class268(this.anInterface9_4, 5126, 2, 12);
		this.aClass368_1.method8403(this);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V")
	public void method5946() {
		if (this.anInt7347 == 4) {
			return;
		}
		this.method6028();
		this.method5996(false);
		this.method6024(false);
		this.method5950(false);
		this.method5955(false);
		this.method6023(-2);
		this.method6005(1);
		this.anInt7347 = 4;
	}

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "(II)I")
	public int method5947(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
	@Override
	public void method6071(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5959();
		this.method6005(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!nv", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5955(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "(I)V")
	@Override
	public void method6134(@OriginalArg(0) int arg0) {
		this.method5979();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6085(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas11) {
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

	@OriginalMember(owner = "client!nv", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean525 = true;
		this.anInt7350 = arg0;
		this.anInt7378 = arg1;
		this.anInt7380 = arg3;
		this.anInt7364 = arg2;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Lclient!tc;")
	public Class20_Sub3 method5949() {
		return this.aClass40_Sub2_1 == null ? null : this.aClass40_Sub2_1.method3440();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BZ)V")
	public void method5950(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean507 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt7347 &= 0xFFFFFFE0;
		this.aBoolean507 = arg0;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(III)V")
	public void method5951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7372 = arg1;
		this.anInt7369 = arg0;
		this.method6021();
		this.method5969();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IFF)V")
	public void method5952(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat161 = arg0;
		this.aFloat162 = arg1;
		this.method6026();
	}

	@OriginalMember(owner = "client!nv", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt7270 - local12 - arg1, arg2, 1, 32993, this.anInt7376, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBI)V")
	public synchronized void method5953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class8_Sub17 local8 = new Class8_Sub17(arg1);
		local8.aLong285 = arg0;
		this.aClass43_44.method1424(local8);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZI)V")
	public void method5955(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean508) {
			this.aBoolean508 = arg0;
			this.method5987();
			this.anInt7347 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(B)V")
	public void method5956() {
		if (this.anInt7347 == 16) {
			return;
		}
		this.method6001();
		this.method5996(true);
		this.method5950(true);
		this.method5955(true);
		this.method6005(1);
		this.anInt7347 = 16;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6129(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas11) {
			local5 = this.aLong182;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable4.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas10) {
			this.method5958();
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(III)V")
	public void method5957(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7360 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (this.anInt7366 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local17 = true;
			this.anInt7366 = arg0;
		}
		if (arg1 != this.anInt7349) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local17 = true;
			this.anInt7349 = arg1;
		}
		if (local17) {
			this.anInt7347 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(B)V")
	private void method5958() {
		if (this.aCanvas10 == null) {
			this.anInt7222 = this.anInt7173 = 0;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas10.getSize();
			this.anInt7222 = local18.width;
			this.anInt7173 = local18.height;
		}
		if (this.anInterface7_2 == null) {
			this.anInt7331 = this.anInt7222;
			this.anInt7270 = this.anInt7173;
			this.method6021();
		}
		this.method6010();
		this.la();
	}

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(B)V")
	private void method5959() {
		if (this.anInt7347 == 1) {
			return;
		}
		this.method6028();
		this.method5996(false);
		this.method6024(false);
		this.method5950(false);
		this.method5955(false);
		this.method6020(null);
		this.method6023(-2);
		this.method5972(1);
		this.anInt7347 = 1;
	}

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "(B)V")
	public void method5960() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6090(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas11 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable4.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!nv", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass54_Sub2_3.aFloat69 + (float) arg2 * this.aClass54_Sub2_3.aFloat73 + (float) arg0 * this.aClass54_Sub2_3.aFloat71 + (float) arg1 * this.aClass54_Sub2_3.aFloat64;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt7358 * ((float) arg2 * this.aClass54_Sub2_3.aFloat72 + (float) arg1 * this.aClass54_Sub2_3.aFloat67 + this.aClass54_Sub2_3.aFloat68 * (float) arg0 + this.aClass54_Sub2_3.aFloat63) / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat166);
		@Pc(118) int local118 = (int) ((float) this.anInt7362 * (this.aClass54_Sub2_3.aFloat65 * (float) arg2 + (float) arg0 * this.aClass54_Sub2_3.aFloat70 + this.aClass54_Sub2_3.aFloat74 * (float) arg1 + this.aClass54_Sub2_3.aFloat66) / local28);
		arg3[1] = (int) ((float) local118 - this.aFloat157);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static39.method1278(arg3, this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLclient!gk;)V")
	public void method5961(@OriginalArg(1) Interface7 arg0) {
		if (this.anInt7342 < 0 || arg0 != this.anInterface7Array1[this.anInt7342]) {
			throw new RuntimeException();
		}
		this.anInterface7Array1[this.anInt7342--] = null;
		arg0.method2923();
		if (this.anInt7342 >= 0) {
			this.anInterface7_1 = this.anInterface7Array1[this.anInt7342];
			this.anInterface7_1.method2921();
		} else {
			this.anInterface7_1 = null;
		}
	}

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "(I)Lclient!za;")
	@Override
	public Class8_Sub30 method6112(@OriginalArg(0) int arg0) {
		@Pc(8) Class8_Sub30_Sub1 local8 = new Class8_Sub30_Sub1(arg0);
		this.aClass43_41.method1424(local8);
		return local8;
	}

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "()I")
	@Override
	public int method6074() {
		return 4;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "()V")
	@Override
	public void method6059() {
	}

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "(I)V")
	private void method5962() {
		if (this.anInt7373 != 2) {
			this.anInt7373 = 2;
			this.method5989();
			this.method5967();
			this.anInt7347 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "(I)V")
	private void method5963() {
		@Pc(6) float[] local6 = this.aFloatArray63;
		@Pc(18) float local18 = (float) (-this.anInt7363 * this.anInt7377) / (float) this.anInt7358;
		@Pc(33) float local33 = (float) (this.anInt7377 * (this.anInt7331 - this.anInt7363)) / (float) this.anInt7358;
		@Pc(44) float local44 = (float) (this.anInt7379 * this.anInt7377) / (float) this.anInt7362;
		@Pc(59) float local59 = (float) (this.anInt7377 * (this.anInt7379 - this.anInt7270)) / (float) this.anInt7362;
		if (local18 == local33 || local44 == local59) {
			local6[10] = 1.0F;
			local6[9] = 0.0F;
			local6[2] = 0.0F;
			local6[15] = 1.0F;
			local6[12] = 0.0F;
			local6[8] = 0.0F;
			local6[0] = 1.0F;
			local6[11] = 0.0F;
			local6[5] = 1.0F;
			local6[13] = 0.0F;
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[7] = 0.0F;
			local6[14] = 0.0F;
			local6[6] = 0.0F;
			local6[1] = 0.0F;
		} else {
			@Pc(139) float local139 = (float) this.anInt7377 * 2.0F;
			local6[7] = 0.0F;
			local6[6] = 0.0F;
			local6[12] = 0.0F;
			local6[1] = 0.0F;
			local6[2] = 0.0F;
			local6[4] = 0.0F;
			local6[14] = this.aFloat154 = -((float) this.anInt7352 * local139) / (float) (this.anInt7352 - this.anInt7377);
			local6[9] = (local44 + local59) / (-local59 + local44);
			local6[5] = local139 / (local44 - local59);
			local6[15] = 0.0F;
			local6[13] = 0.0F;
			local6[11] = -1.0F;
			local6[3] = 0.0F;
			local6[0] = local139 / (local33 - local18);
			local6[8] = (local33 + local18) / (-local18 + local33);
			local6[10] = this.aFloat164 = (float) -(this.anInt7377 + this.anInt7352) / (float) (this.anInt7352 - this.anInt7377);
		}
		this.method6015();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BZI)V")
	public void method5964(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		this.method5976(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "(I)V")
	public void method5965() {
		if (this.anInt7347 == 8) {
			return;
		}
		this.method5962();
		this.method5996(true);
		this.method5950(true);
		this.method5955(true);
		this.method6005(1);
		this.anInt7347 = 8;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!km;)V")
	@Override
	public void method6072(@OriginalArg(0) Class40 arg0) {
		this.aClass40_Sub2_1 = (Class40_Sub2) arg0;
	}

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "(II)I")
	public int method5966(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!dfa;)V")
	@Override
	public void method6066(@OriginalArg(0) Class54 arg0) {
		this.aClass54_Sub2_3.method5137(arg0);
		this.aClass54_Sub2_4.method5137(this.aClass54_Sub2_3);
		this.aClass54_Sub2_4.method2597();
		this.aClass54_Sub2_5.method2599(this.aClass54_Sub2_4);
		if (this.anInt7373 != 1) {
			this.method5967();
		}
	}

	@OriginalMember(owner = "client!nv", name = "z", descriptor = "()Z")
	@Override
	public boolean method6133() {
		if (this.aClass8_Sub32_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass8_Sub32_Sub1_1.method4953()) {
			if (!this.aClass90_1.method2935(this.aClass8_Sub32_Sub1_1)) {
				return false;
			}
			this.aClass51_1.method1713();
		}
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass54_Sub2_3.aFloat73 * (float) arg2 + (float) arg0 * this.aClass54_Sub2_3.aFloat71 + this.aClass54_Sub2_3.aFloat64 * (float) arg1 + this.aClass54_Sub2_3.aFloat69;
		if (local28 < (float) this.anInt7377 || (float) this.anInt7352 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((this.aClass54_Sub2_3.aFloat68 * (float) arg0 + (float) arg1 * this.aClass54_Sub2_3.aFloat67 + this.aClass54_Sub2_3.aFloat72 * (float) arg2 + this.aClass54_Sub2_3.aFloat63) * (float) this.anInt7358 / (float) arg3);
		@Pc(119) int local119 = (int) ((float) this.anInt7362 * ((float) arg1 * this.aClass54_Sub2_3.aFloat74 + this.aClass54_Sub2_3.aFloat70 * (float) arg0 + this.aClass54_Sub2_3.aFloat65 * (float) arg2 + this.aClass54_Sub2_3.aFloat66) / (float) arg3);
		if (this.aFloat166 <= (float) local86 && this.aFloat155 >= (float) local86 && this.aFloat157 <= (float) local119 && this.aFloat158 >= (float) local119) {
			arg4[2] = (int) local28;
			arg4[0] = (int) ((float) local86 - this.aFloat166);
			arg4[1] = (int) ((float) local119 - this.aFloat157);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6093(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt7377;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!jj;)V")
	@Override
	public void method6078(@OriginalArg(0) Interface11 arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Lclient!iaa;")
	@Override
	public Interface8 method6064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!nv", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method6005(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "(B)V")
	private void method5967() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass54_Sub2_4.method2596(), 0);
		if (this.aBoolean530) {
			this.aClass248_1.aClass13_Sub2_1.method2357();
		}
		this.method5977();
		this.method6013();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIF)Lclient!ada;")
	@Override
	public Class8_Sub1 method6084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class8_Sub1_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I[Lclient!ada;)V")
	@Override
	public void method6052(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass8_Sub1Array6[local7] = arg1[local7];
		}
		this.anInt7371 = arg0;
		if (this.anInt7373 != 1) {
			this.method6013();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IB)V")
	public synchronized void method5968(@OriginalArg(0) int arg0) {
		@Pc(16) Class8_Sub17 local16 = new Class8_Sub17(arg0);
		this.bf.method1424(local16);
	}

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "()V")
	@Override
	public void method6075() {
		if (this.aClass8_Sub32_Sub1_1 != null && this.aClass8_Sub32_Sub1_1.method4953()) {
			this.aClass90_1.method2942(this.aClass8_Sub32_Sub1_1);
			this.aClass51_1.method1713();
		}
	}

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "(I)V")
	private void method5969() {
		if (this.anInt7361 <= this.anInt7356 && this.anInt7357 <= this.anInt7359) {
			OpenGL.glScissor(this.anInt7369 + this.anInt7361, -this.anInt7359 + this.anInt7372 + this.anInt7270, this.anInt7356 - this.anInt7361, this.anInt7359 - this.anInt7357);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIZ)Lclient!hu;")
	@Override
	public Class21 method6104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class21_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "()Lclient!dfa;")
	@Override
	public Class54 method6118() {
		return this.aClass54_Sub2_3;
	}

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "(I)V")
	private void method5970() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL2.b()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static214.method4061(1000L);
		}
	}

	@OriginalMember(owner = "client!nv", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean525) {
			throw new RuntimeException("");
		}
		this.anInt7350 = arg0;
		this.anInt7380 = arg3;
		this.anInt7364 = arg2;
		this.anInt7378 = arg1;
		if (this.aBoolean530) {
			this.aClass248_1.aClass13_Sub2_1.method2357();
			this.aClass248_1.aClass13_Sub2_1.method2360();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIB)V")
	public void method5971(@OriginalArg(0) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZ)V")
	public void method5972(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method5957(7681, 7681);
		} else if (arg0 == 0) {
			this.method5957(8448, 8448);
		} else if (arg0 == 2) {
			this.method5957(34165, 7681);
		} else if (arg0 == 3) {
			this.method5957(260, 8448);
		} else if (arg0 == 4) {
			this.method5957(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(FZ)V")
	public void method5973(@OriginalArg(0) float arg0) {
		if (this.aFloat151 != arg0) {
			this.aFloat151 = arg0;
			if (this.anInt7373 == 3) {
				this.method5990();
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(FIFFF)V")
	public void method5974(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static101.aFloatArray36[3] = arg3;
		Static101.aFloatArray36[0] = arg1;
		Static101.aFloatArray36[2] = arg0;
		Static101.aFloatArray36[1] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static101.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass90_1.method2937(arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)I")
	@Override
	public int method6109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!nv", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(57) float local57;
		if (this.aClass20_Sub4_Sub1_5 == null || arg2 > this.aClass20_Sub4_Sub1_5.anInt9354 || arg3 > this.aClass20_Sub4_Sub1_5.anInt9355) {
			this.aClass20_Sub4_Sub1_5 = Static383.method6154(arg2, arg3, arg6, this);
			this.aClass20_Sub4_Sub1_5.method7626(false, false);
			local57 = this.aClass20_Sub4_Sub1_5.aFloat188;
			local45 = this.aClass20_Sub4_Sub1_5.aFloat189;
		} else {
			this.aClass20_Sub4_Sub1_5.method7621(arg2, arg3, arg6, false, 6406);
			local45 = (float) arg3 * this.aClass20_Sub4_Sub1_5.aFloat189 / (float) this.aClass20_Sub4_Sub1_5.anInt9355;
			local57 = this.aClass20_Sub4_Sub1_5.aFloat188 * (float) arg2 / (float) this.aClass20_Sub4_Sub1_5.anInt9354;
		}
		this.method6019();
		this.method6020(this.aClass20_Sub4_Sub1_5);
		this.method6005(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5980(arg5);
		this.method5957(34165, 34165);
		this.method6025(768, 0, 34166);
		this.method6025(770, 2, 5890);
		this.method6029(0, 34166);
		this.method6029(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = local147 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = local150 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local57);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local45, local57);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method6025(768, 0, 5890);
		this.method6025(770, 2, 34166);
		this.method6029(0, 5890);
		this.method6029(2, 34166);
	}

	@OriginalMember(owner = "client!nv", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7331 < arg2) {
			arg2 = this.anInt7331;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt7270 < arg3) {
			arg3 = this.anInt7270;
		}
		this.anInt7356 = arg2;
		this.anInt7357 = arg1;
		this.anInt7359 = arg3;
		this.anInt7361 = arg0;
		OpenGL.glEnable(3089);
		this.method5945();
		this.method5969();
	}

	@OriginalMember(owner = "client!nv", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg0 * this.aClass54_Sub2_3.aFloat71 + this.aClass54_Sub2_3.aFloat64 * (float) arg1 + this.aClass54_Sub2_3.aFloat73 * (float) arg2 + this.aClass54_Sub2_3.aFloat69;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass54_Sub2_3.aFloat69 + (float) arg5 * this.aClass54_Sub2_3.aFloat73 + this.aClass54_Sub2_3.aFloat71 * (float) arg3 + (float) arg4 * this.aClass54_Sub2_3.aFloat64;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt7377 && (float) this.anInt7377 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt7352 < local32 && (float) this.anInt7352 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass54_Sub2_3.aFloat72 * (float) arg2 + this.aClass54_Sub2_3.aFloat68 * (float) arg0 + this.aClass54_Sub2_3.aFloat67 * (float) arg1 + this.aClass54_Sub2_3.aFloat63) * (float) this.anInt7358 / local32);
		@Pc(167) int local167 = (int) ((this.aClass54_Sub2_3.aFloat67 * (float) arg4 + (float) arg3 * this.aClass54_Sub2_3.aFloat68 + (float) arg5 * this.aClass54_Sub2_3.aFloat72 + this.aClass54_Sub2_3.aFloat63) * (float) this.anInt7358 / local63);
		if ((float) local135 < this.aFloat166 && this.aFloat166 > (float) local167) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat155 && (float) local167 > this.aFloat155) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt7362 * (this.aClass54_Sub2_3.aFloat74 * (float) arg1 + (float) arg0 * this.aClass54_Sub2_3.aFloat70 + this.aClass54_Sub2_3.aFloat65 * (float) arg2 + this.aClass54_Sub2_3.aFloat66) / local32);
		@Pc(265) int local265 = (int) ((this.aClass54_Sub2_3.aFloat66 + this.aClass54_Sub2_3.aFloat65 * (float) arg5 + this.aClass54_Sub2_3.aFloat74 * (float) arg4 + (float) arg3 * this.aClass54_Sub2_3.aFloat70) * (float) this.anInt7362 / local63);
		if ((float) local233 < this.aFloat157 && this.aFloat157 > (float) local265) {
			local7 |= 0x4;
		} else if (this.aFloat158 < (float) local233 && (float) local265 > this.aFloat158) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "(I)V")
	private void method5975() {
		if (this.aBoolean520) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean520 = false;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		this.method5959();
		this.method6005(1);
		@Pc(30) float local30 = (float) -arg0 + (float) arg2;
		@Pc(36) float local36 = (float) arg3 - (float) arg1;
		@Pc(49) float local49 = (float) (1.0D / Math.sqrt((double) (local36 * local36 + local30 * local30)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(70) int local70 = arg7 % (arg5 + arg6);
		@Pc(74) float local74 = local36 * local49;
		@Pc(78) float local78 = local30 * local49;
		@Pc(83) float local83 = (float) arg5 * local78;
		@Pc(88) float local88 = local74 * (float) arg5;
		@Pc(90) float local90 = 0.0F;
		@Pc(92) float local92 = 0.0F;
		@Pc(94) float local94 = local83;
		@Pc(96) float local96 = local88;
		if (arg5 >= local70) {
			local94 = (float) (arg5 - local70) * local78;
			local96 = (float) (arg5 - local70) * local74;
		} else {
			local90 = (float) (arg5 + arg6 - local70) * local78;
			local92 = local74 * (float) (arg5 + arg6 - local70);
		}
		@Pc(145) float local145 = local90 + (float) arg0 + 0.35F;
		@Pc(152) float local152 = local92 + (float) arg1 + 0.35F;
		@Pc(157) float local157 = (float) arg6 * local78;
		@Pc(162) float local162 = (float) arg6 * local74;
		while (true) {
			if (arg0 >= arg2) {
				if (local145 < (float) arg2 + 0.35F) {
					break;
				}
				if (local145 + local94 < (float) arg2) {
					local94 = (float) arg2 - local145;
				}
			} else {
				if (local145 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local145 + local94) {
					local94 = (float) arg2 - local145;
				}
			}
			if (arg3 > arg1) {
				if (local152 > (float) arg3 + 0.35F) {
					break;
				}
				if (local152 + local96 > (float) arg3) {
					local96 = (float) arg3 - local152;
				}
			} else {
				if (local152 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local96 + local152) {
					local96 = (float) arg3 - local152;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local145, local152);
			OpenGL.glVertex2f(local94 + local145, local152 + local96);
			local145 += local94 + local157;
			local152 += local96 + local162;
			OpenGL.glEnd();
			local96 = local88;
			local94 = local83;
		}
	}

	@OriginalMember(owner = "client!nv", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nv", name = "w", descriptor = "()Z")
	@Override
	public boolean method6123() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZZI)V")
	public void method5976(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (this.anInt7374 != arg0 || this.aBoolean525 != this.aBoolean530) {
			@Pc(18) Class20_Sub4 local18 = null;
			@Pc(20) int local20 = 0;
			@Pc(22) byte local22 = 0;
			@Pc(24) int local24 = 0;
			@Pc(31) int local31 = this.aBoolean525 ? 3 : 0;
			if (arg0 < 0) {
				this.method5975();
			} else {
				local18 = this.aClass51_1.method1710(arg0);
				@Pc(45) Class218 local45 = super.anInterface2_12.method4027(arg0);
				if (local45.aByte67 == 0 && local45.aByte64 == 0) {
					this.method5975();
				} else {
					@Pc(69) int local69 = local45.aBoolean476 ? 64 : 128;
					@Pc(73) int local73 = local69 * 50;
					this.method5995((float) (local45.aByte67 * (this.anInt7338 % local73)) / (float) local73, (float) (this.anInt7338 % local73 * local45.aByte64) / (float) local73, 0.0F);
				}
				if (!this.aBoolean525) {
					local31 = local45.aByte66;
					local24 = local45.anInt6845;
					local22 = local45.aByte62;
				}
				local20 = local45.anInt6843;
			}
			this.aClass248_1.method6517(arg2, local31, local24, arg1, local22);
			if (!this.aClass248_1.method6515(local20, local18)) {
				this.method6020(local18);
				this.method5972(local20);
			}
			this.anInt7374 = arg0;
			this.aBoolean530 = this.aBoolean525;
		}
		this.anInt7347 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(I)V")
	@Override
	public void method6099(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "(I)V")
	public void method5977() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray64, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!eb;)V")
	public void method5978(@OriginalArg(1) Class54_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method2596(), 0);
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(Z)V")
	private void method5979() {
		this.anOpenGL2.a();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI)V")
	public void method5980(@OriginalArg(1) int arg0) {
		Static101.aFloatArray36[3] = (float) (arg0 >>> 24) / 255.0F;
		Static101.aFloatArray36[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static101.aFloatArray36[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static101.aFloatArray36[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static101.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "()Z")
	@Override
	public boolean method6091() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(III)V")
	public synchronized void method5982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class8_Sub17 local8 = new Class8_Sub17(arg0);
		local8.aLong285 = arg1;
		this.aClass43_43.method1424(local8);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6107(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static55.aFloat43 = arg2;
		Static104.aFloat58 = arg1;
		Static72.aFloat57 = arg0;
	}

	@OriginalMember(owner = "client!nv", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat169 != arg0) {
			this.aFloat169 = arg0;
			this.method6018();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BII)V")
	public synchronized void method5984(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class8_Sub17 local8 = new Class8_Sub17(arg1);
		local8.aLong285 = arg0;
		this.aClass43_45.method1424(local8);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(19) Class1_Sub1 local19 = (Class1_Sub1) arg5;
		@Pc(22) Class20_Sub4_Sub1 local22 = local19.aClass20_Sub4_Sub1_4;
		this.method6019();
		this.method6020(local19.aClass20_Sub4_Sub1_4);
		this.method6005(1);
		this.method5957(7681, 8448);
		this.method6025(768, 0, 34167);
		@Pc(52) float local52 = local22.aFloat188 / (float) local22.anInt9361;
		@Pc(59) float local59 = local22.aFloat189 / (float) local22.anInt9362;
		@Pc(66) float local66 = (float) -arg0 + (float) arg2;
		@Pc(72) float local72 = (float) arg3 - (float) arg1;
		@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local72 * local72)));
		@Pc(91) int local91 = arg10 % (arg8 + arg9);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(110) float local110 = local66 * local85;
		@Pc(114) float local114 = local72 * local85;
		@Pc(119) float local119 = (float) arg8 * local110;
		@Pc(124) float local124 = (float) arg8 * local114;
		@Pc(126) float local126 = 0.0F;
		@Pc(128) float local128 = 0.0F;
		@Pc(130) float local130 = local119;
		@Pc(132) float local132 = local124;
		if (arg8 >= local91) {
			local132 = local114 * (float) (arg8 - local91);
			local130 = local110 * (float) (arg8 - local91);
		} else {
			local128 = (float) (arg9 + arg8 - local91) * local114;
			local126 = local110 * (float) (arg8 + arg9 - local91);
		}
		@Pc(180) float local180 = local126 + (float) arg0 + 0.35F;
		@Pc(187) float local187 = (float) arg1 + local128 + 0.35F;
		@Pc(192) float local192 = local110 * (float) arg9;
		@Pc(197) float local197 = local114 * (float) arg9;
		while (true) {
			if (arg0 >= arg2) {
				if ((float) arg2 + 0.35F > local180) {
					break;
				}
				if (local180 + local130 < (float) arg2) {
					local130 = (float) arg2 - local180;
				}
			} else {
				if ((float) arg2 + 0.35F < local180) {
					break;
				}
				if (local180 + local130 > (float) arg2) {
					local130 = (float) arg2 - local180;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 + 0.35F > local187) {
					break;
				}
				if (local132 + local187 < (float) arg3) {
					local132 = (float) arg3 - local187;
				}
			} else {
				if (local187 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local187 + local132) {
					local132 = (float) arg3 - local187;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f((local180 - (float) arg6) * local52, local59 * (local187 - (float) arg7));
			OpenGL.glVertex2f(local180, local187);
			OpenGL.glTexCoord2f((local180 + local130 - (float) arg6) * local52, ((float) -arg7 + local187 + local132) * local59);
			OpenGL.glVertex2f(local130 + local180, local187 + local132);
			local180 += local130 + local192;
			OpenGL.glEnd();
			local187 += local132 + local197;
			local130 = local119;
			local132 = local124;
		}
		this.method6025(768, 0, 5890);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIII)Lclient!km;")
	@Override
	public Class40 method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean510 ? new Class40_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class86 method6126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class86_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "(B)V")
	private void method5986() {
		Static101.aFloatArray36[2] = this.aFloat163 * this.aFloat153;
		Static101.aFloatArray36[1] = this.aFloat167 * this.aFloat163;
		Static101.aFloatArray36[3] = 1.0F;
		Static101.aFloatArray36[0] = this.aFloat150 * this.aFloat163;
		OpenGL.glLightfv(16384, 4609, Static101.aFloatArray36, 0);
		Static101.aFloatArray36[3] = 1.0F;
		Static101.aFloatArray36[2] = this.aFloat153 * -this.aFloat165;
		Static101.aFloatArray36[0] = this.aFloat150 * -this.aFloat165;
		Static101.aFloatArray36[1] = -this.aFloat165 * this.aFloat167;
		OpenGL.glLightfv(16385, 4609, Static101.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!nv", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt7361 = 0;
		this.anInt7356 = this.anInt7331;
		this.anInt7357 = 0;
		this.anInt7359 = this.anInt7270;
		OpenGL.glDisable(3089);
		this.method5945();
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(Z)V")
	private void method5987() {
		OpenGL.glDepthMask(this.aBoolean508 && this.aBoolean527);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6057() {
		this.method5959();
		this.method6005(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "()Z")
	@Override
	public boolean method6122() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!pw;Lclient!pw;Lclient!pw;ZLclient!pw;)V")
	public void method5988(@OriginalArg(0) Class268 arg0, @OriginalArg(1) Class268 arg1, @OriginalArg(2) Class268 arg2, @OriginalArg(4) Class268 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5943(arg3.anInterface9_6);
			OpenGL.glVertexPointer(arg3.aByte87, arg3.aShort90, this.anInterface9_5.method6289(), this.anInterface9_5.method6288() + (long) arg3.aByte88);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5943(arg1.anInterface9_6);
			OpenGL.glNormalPointer(arg1.aShort90, this.anInterface9_5.method6289(), this.anInterface9_5.method6288() + (long) arg1.aByte88);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5943(arg0.anInterface9_6);
			OpenGL.glColorPointer(arg0.aByte87, arg0.aShort90, this.anInterface9_5.method6289(), this.anInterface9_5.method6288() + (long) arg0.aByte88);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5943(arg2.anInterface9_6);
			OpenGL.glTexCoordPointer(arg2.aByte87, arg2.aShort90, this.anInterface9_5.method6289(), this.anInterface9_5.method6288() + (long) arg2.aByte88);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!pca;I)V")
	@Override
	public void method6108(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1) {
		this.aClass368_1.method8401(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "()Z")
	@Override
	public boolean method6056() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt7384;
		this.anInt7384 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([IIIIIZ)Lclient!hu;")
	@Override
	public Class21 method6054(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class21_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "(I)V")
	private void method5989() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray63, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nv", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt7363, this.anInt7379, this.anInt7358, this.anInt7362 };
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "()V")
	@Override
	public void method6061() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "(B)V")
	private void method5990() {
		@Pc(15) float local15 = this.aFloat151 * (float) -this.anInt7363 / (float) this.anInt7358;
		@Pc(35) float local35 = (float) -this.anInt7379 * this.aFloat151 / (float) this.anInt7362;
		@Pc(50) float local50 = (float) (this.anInt7331 - this.anInt7363) * this.aFloat151 / (float) this.anInt7358;
		@Pc(64) float local64 = (float) (this.anInt7270 - this.anInt7379) * this.aFloat151 / (float) this.anInt7362;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local50 != local15 && local35 != local64) {
			OpenGL.glOrtho((double) local15, (double) local50, (double) -local64, (double) -local35, (double) this.anInt7377, (double) this.anInt7352);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "()Z")
	@Override
	public boolean method6055() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!g;Z)Lclient!hu;")
	@Override
	public Class21 method6135(@OriginalArg(0) Class111 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt4054 * arg0.anInt4053];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray28 == null) {
			for (local21 = 0; local21 < arg0.anInt4053; local21++) {
				for (local25 = 0; local25 < arg0.anInt4054; local25++) {
					@Pc(38) int local38 = arg0.anIntArray216[arg0.aByteArray27[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt4053; local21++) {
				for (local25 = 0; local25 < arg0.anInt4054; local25++) {
					local12[local16++] = arg0.anIntArray216[arg0.aByteArray27[local14] & 0xFF] | arg0.aByteArray28[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(128) Class21 local128 = this.method6132(arg0.anInt4053, local12, arg0.anInt4054, arg0.anInt4054);
		local128.method5778(arg0.anInt4055, arg0.anInt4050, arg0.anInt4051, arg0.anInt4052);
		return local128;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!ur;[Lclient!g;Z)Lclient!da;")
	@Override
	public Class27 method6088(@OriginalArg(0) Class345 arg0, @OriginalArg(1) Class111[] arg1) {
		return new Class27_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(BI)I")
	public int method5991(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!nv", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5959();
		this.method6005(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!nv", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt7343 + this.anInt7344 + this.anInt7345;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IILclient!tv;BI)V")
	public void method5992(@OriginalArg(1) int arg0, @OriginalArg(2) Interface23 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg1.method5439();
		@Pc(14) int local14 = arg2 * this.method5991(local7);
		this.method5993(arg1);
		OpenGL.glDrawElements(4, arg0, local7, (long) local14 + arg1.method5437());
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!tv;B)V")
	public void method5993(@OriginalArg(0) Interface23 arg0) {
		if (this.anInterface23_3 != arg0) {
			if (this.aBoolean509) {
				OpenGL.glBindBufferARB(34963, arg0.method5436());
			}
			this.anInterface23_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "()Z")
	@Override
	public boolean method6102() {
		return this.aClass248_1.method6512();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IJ)V")
	public synchronized void method5994(@OriginalArg(1) long arg0) {
		@Pc(13) Class8 local13 = new Class8();
		local13.aLong285 = arg0;
		this.aClass43_47.method1424(local13);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([I)V")
	@Override
	public void method6087(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7331;
		arg0[1] = this.anInt7270;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(FFIF)V")
	private void method5995(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean520) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean520 = true;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(BZ)V")
	public void method5996(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean529) {
			this.aBoolean529 = arg0;
			this.method5998();
			this.anInt7347 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nv", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt7361 || this.anInt7356 < arg0 - arg2 || arg2 + arg1 < this.anInt7357 || arg1 - arg2 > this.anInt7359) {
			return;
		}
		this.method5959();
		this.method6005(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(72) float local72 = (float) arg0 + 0.35F;
		@Pc(77) float local77 = (float) arg1 + 0.35F;
		@Pc(81) int local81 = arg2 << 1;
		if (this.aFloat160 > (float) local81) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local72 + 1.0F, local77 + 1.0F);
			OpenGL.glVertex2f(local72 + 1.0F, -1.0F + local77);
			OpenGL.glVertex2f(local72 - 1.0F, -1.0F + local77);
			OpenGL.glVertex2f(local72 - 1.0F, local77 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local81 <= this.aFloat149) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local81);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local72, local77);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local72, local77);
			@Pc(136) int local136 = 262144 / (arg2 * 6);
			if (local136 <= 64) {
				local136 = 64;
			} else if (local136 > 512) {
				local136 = 512;
			}
			local136 = Static258.method4554(local136);
			OpenGL.glVertex2f(local72 + (float) arg2, local77);
			for (@Pc(166) int local166 = 16384 - local136; local166 > 0; local166 -= local136) {
				OpenGL.glVertex2f(local72 + (float) arg2 * Class5_Sub2.aFloatArray23[local166], local77 + Class5_Sub2.aFloatArray24[local166] * (float) arg2);
			}
			OpenGL.glVertex2f(local72 + (float) arg2, local77);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6069(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6131(arg2, arg3);
	}

	@OriginalMember(owner = "client!nv", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean525 = false;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([BIZII)Lclient!id;")
	public Interface9 method5997(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return (Interface9) (this.aBoolean509 && (!arg1 || this.aBoolean514) ? new Class64_Sub1(this, arg3, arg0, arg2, arg1) : new Class53_Sub2(this, arg3, arg0, arg2));
	}

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "(B)V")
	private void method5998() {
		if (this.aBoolean529 && this.anInt7365 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "()Z")
	@Override
	public boolean method6080() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(II)Lclient!kv;")
	@Override
	public Interface14 method6127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!nv", name = "A", descriptor = "()Z")
	@Override
	public boolean method6138() {
		return this.aBoolean512 && (!this.method6079() || this.aBoolean533);
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method6106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method5959();
		this.method6005(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean512) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean512) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!km;Lclient!km;FLclient!km;)Lclient!km;")
	@Override
	public Class40 method6067(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class40 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean510 && this.aBoolean524) {
			@Pc(15) Class40_Sub2_Sub1 local15 = null;
			@Pc(18) Class40_Sub2 local18 = (Class40_Sub2) arg0;
			@Pc(21) Class40_Sub2 local21 = (Class40_Sub2) arg1;
			@Pc(25) Class20_Sub3 local25 = local18.method3440();
			@Pc(29) Class20_Sub3 local29 = local21.method3440();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local25.anInt9208 <= local29.anInt9208 ? local29.anInt9208 : local25.anInt9208;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class40_Sub2_Sub1) {
					@Pc(56) Class40_Sub2_Sub1 local56 = (Class40_Sub2_Sub1) arg3;
					if (local56.method1753() == local44) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class40_Sub2_Sub1(this, local44);
				}
				if (local15.method1754(local29, arg2, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!kv;Lclient!iaa;)Lclient!jj;")
	@Override
	public Interface11 method6125(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) Interface8 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method5999(@OriginalArg(0) Interface7 arg0) {
		if (this.anInt7340 < 0 || this.anInterface7Array2[this.anInt7340] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface7Array2[this.anInt7340--] = null;
		arg0.method2920();
		if (this.anInt7340 < 0) {
			this.anInterface7_2 = null;
		} else {
			this.anInterface7_2 = this.anInterface7Array2[this.anInt7340];
			this.anInterface7_2.method2922();
		}
	}

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "()Z")
	@Override
	public boolean method6117() {
		return false;
	}

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "()Lclient!dfa;")
	@Override
	public Class54 method6124() {
		return this.aClass54_Sub2_1;
	}

	@OriginalMember(owner = "client!nv", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < this.anInt7356) {
			this.anInt7356 = arg2;
		}
		if (this.anInt7361 < arg0) {
			this.anInt7361 = arg0;
		}
		if (arg3 < this.anInt7359) {
			this.anInt7359 = arg3;
		}
		if (arg1 > this.anInt7357) {
			this.anInt7357 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method5945();
		this.method5969();
	}

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "()Lclient!dfa;")
	@Override
	public Class54 method6076() {
		return new Class54_Sub2();
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V")
	@Override
	public void method6083() {
	}

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "(I)V")
	public void method6000() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(Z)V")
	private void method6001() {
		if (this.anInt7373 != 3) {
			this.anInt7373 = 3;
			this.method5990();
			this.method5967();
			this.anInt7347 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZB)V")
	public void method6002(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean528) {
			this.aBoolean528 = arg0;
			this.method6008();
		}
	}

	@OriginalMember(owner = "client!nv", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method5959();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method6005(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean512) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean512) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "()V")
	@Override
	public void method6128() {
		if (this.aBoolean524) {
			if (this.aClass89_6 != this.anInterface7_2) {
				throw new RuntimeException();
			}
			this.aClass89_6.method2932(0);
			this.aClass89_6.method2932(8);
			this.method6016(this.aClass89_6);
		} else if (this.aBoolean532) {
			this.aClass21_Sub1_1.method5798(0, 0, this.anInt7331, this.anInt7270, 0, 0);
			this.anOpenGL2.setSurface(this.aLong181);
		} else {
			throw new RuntimeException("");
		}
		this.aClass21_Sub1_1 = null;
		this.anInt7270 = this.anInt7173;
		this.anInt7331 = this.anInt7222;
		this.method6010();
		this.method6021();
		this.la();
	}

	@OriginalMember(owner = "client!nv", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt7352;
	}

	@OriginalMember(owner = "client!nv", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7367 == arg0 && this.anInt7365 == arg1 && arg2 == this.anInt7382) {
			return;
		}
		this.anInt7365 = arg1;
		this.anInt7382 = arg2;
		this.anInt7367 = arg0;
		this.method6026();
		this.method5998();
	}

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "(I)I")
	private int method6004() {
		this.aString73 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString74 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString73.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString73.indexOf("brian paul") != -1 || this.aString73.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(52) String[] local52 = Static403.method6410(local44.replace('.', ' '), ' ');
		if (local52.length >= 2) {
			try {
				@Pc(62) int local62 = Static82.method2080(local52[0]);
				@Pc(68) int local68 = Static82.method2080(local52[1]);
				this.anInt7355 = local62 * 10 + local68;
			} catch (@Pc(78) NumberFormatException local78) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt7355 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(117) int[] local117 = new int[1];
		OpenGL.glGetIntegerv(34018, local117, 0);
		this.anInt7353 = local117[0];
		OpenGL.glGetIntegerv(34929, local117, 0);
		this.anInt7381 = local117[0];
		OpenGL.glGetIntegerv(34930, local117, 0);
		this.anInt7354 = local117[0];
		if (this.anInt7353 < 2 || this.anInt7381 < 2 || this.anInt7354 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean519 = Stream.c();
		this.aBoolean532 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean509 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean512 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean516 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean526 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean523 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean531 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean521 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean510 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean513 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean534 = false;
		this.aBoolean524 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean515 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean511 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean533 = this.aBoolean515 & this.aBoolean511;
		OpenGL.glGetFloatv(2834, Static101.aFloatArray36, 0);
		this.aFloat149 = Static101.aFloatArray36[1];
		this.aFloat160 = Static101.aFloatArray36[0];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5959();
		this.method6005(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		if (local16 == 0.0F && local23 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(44) float local44 = (float) (1.0D / Math.sqrt((double) (local23 * local23 + local16 * local16)));
			local16 *= local44;
			local23 *= local44;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, (float) arg3 + 0.35F + local23);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!uk;IIII)Lclient!ka;")
	@Override
	public Class83 method6094(@OriginalArg(0) Class344 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class83_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "(II)V")
	public void method6005(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt7346) {
			return;
		}
		@Pc(29) boolean local29;
		@Pc(27) byte local27;
		if (arg0 == 1) {
			local27 = 1;
			local29 = true;
		} else if (arg0 == 2) {
			local27 = 2;
			local29 = false;
		} else if (arg0 == 128) {
			local27 = 3;
			local29 = true;
		} else {
			local27 = 0;
			local29 = false;
		}
		if (!this.aBoolean506) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean506 = true;
		}
		if (local29 != this.aBoolean505) {
			if (local29) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean505 = local29;
		}
		if (local27 != this.anInt7348) {
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
			this.anInt7348 = local27;
		}
		this.anInt7346 = arg0;
		this.anInt7347 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZILclient!jaclib/memory/Buffer;B)Lclient!id;")
	public Interface9 method6006(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Buffer arg2) {
		return (Interface9) (this.aBoolean509 ? new Class64_Sub1(this, arg0, arg2, arg1, false) : new Class53_Sub2(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIZ[B)Lclient!tv;")
	public Interface23 method6007(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface23) (this.aBoolean509 && (!arg1 || this.aBoolean514) ? new Class64_Sub2(this, 5123, arg2, arg0, arg1) : new Class53_Sub1(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!nv", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt7370 != arg0;
		if (local11 || arg1 != this.aFloat163 || arg2 != this.aFloat165) {
			this.anInt7370 = arg0;
			this.aFloat163 = arg1;
			this.aFloat165 = arg2;
			if (local11) {
				this.aFloat150 = (float) (this.anInt7370 & 0xFF0000) / 1.671168E7F;
				this.aFloat153 = (float) (this.anInt7370 & 0xFF) / 255.0F;
				this.aFloat167 = (float) (this.anInt7370 & 0xFF00) / 65280.0F;
				this.method6018();
			}
			this.method5986();
		}
		if (this.aFloatArray66[0] == arg3 && arg4 == this.aFloatArray66[1] && this.aFloatArray66[2] == arg5) {
			return;
		}
		this.aFloatArray66[2] = arg5;
		this.aFloatArray66[1] = arg4;
		this.aFloatArray66[0] = arg3;
		this.aFloatArray62[0] = -arg3;
		this.aFloatArray62[2] = -arg5;
		this.aFloatArray62[1] = -arg4;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray64[2] = local138 * arg5;
		this.aFloatArray64[1] = local138 * arg4;
		this.aFloatArray64[0] = arg3 * local138;
		this.aFloatArray65[1] = -this.aFloatArray64[1];
		this.aFloatArray65[2] = -this.aFloatArray64[2];
		this.aFloatArray65[0] = -this.aFloatArray64[0];
		this.method5977();
		this.anInt7351 = (int) (arg3 * 256.0F / arg4);
		this.anInt7375 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(II)I")
	@Override
	public int method6121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "(I)V")
	private void method6008() {
		if (this.aBoolean518 && !this.aBoolean528) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "(B)V")
	private void method6009() {
		this.method6023(-2);
		for (@Pc(14) int local14 = this.anInt7353 - 1; local14 >= 0; local14--) {
			this.method5944(local14);
			this.method6020(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5957(8448, 8448);
		this.method6025(770, 2, 34168);
		this.method5975();
		this.anInt7346 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt7348 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean505 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean506 = true;
		this.method5996(true);
		this.method6024(true);
		this.method5950(true);
		this.method5955(true);
		this.method6010();
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
		this.anInt7370 = this.anInt7367 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(II)V")
	@Override
	public void method6131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "(I)V")
	@Override
	public synchronized void method6119(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class8_Sub17 local19;
		while (!this.aClass43_43.method1420()) {
			local19 = (Class8_Sub17) this.aClass43_43.method1432();
			Static473.anIntArray460[local7++] = (int) local19.aLong285;
			this.anInt7344 -= local19.anInt2919;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static473.anIntArray460, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static473.anIntArray460, 0);
			local7 = 0;
		}
		while (!this.aClass43_44.method1420()) {
			local19 = (Class8_Sub17) this.aClass43_44.method1432();
			Static473.anIntArray460[local7++] = (int) local19.aLong285;
			this.anInt7345 -= local19.anInt2919;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static473.anIntArray460, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static473.anIntArray460, 0);
			local7 = 0;
		}
		while (!this.bf.method1420()) {
			local19 = (Class8_Sub17) this.bf.method1432();
			Static473.anIntArray460[local7++] = local19.anInt2919;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static473.anIntArray460, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static473.anIntArray460, 0);
			local7 = 0;
		}
		while (!this.aClass43_45.method1420()) {
			local19 = (Class8_Sub17) this.aClass43_45.method1432();
			Static473.anIntArray460[local7++] = (int) local19.aLong285;
			this.anInt7343 -= local19.anInt2919;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static473.anIntArray460, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static473.anIntArray460, 0);
		}
		while (!this.aClass43_42.method1420()) {
			local19 = (Class8_Sub17) this.aClass43_42.method1432();
			OpenGL.glDeleteLists((int) local19.aLong285, local19.anInt2919);
		}
		@Pc(215) Class8 local215;
		while (!this.aClass43_46.method1420()) {
			local215 = this.aClass43_46.method1432();
			OpenGL.glDeleteProgramARB((int) local215.aLong285);
		}
		while (!this.aClass43_47.method1420()) {
			local215 = this.aClass43_47.method1432();
			OpenGL.glDeleteObjectARB(local215.aLong285);
		}
		while (!this.aClass43_42.method1420()) {
			local19 = (Class8_Sub17) this.aClass43_42.method1432();
			OpenGL.glDeleteLists((int) local19.aLong285, local19.anInt2919);
		}
		this.aClass51_1.method1714();
		if (this.E() > 100663296 && Static342.method5463() > this.aLong183 + 60000L) {
			System.gc();
			this.aLong183 = Static342.method5463();
		}
		this.anInt7338 = local11;
	}

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "(I)V")
	public void method6010() {
		if (this.anInt7373 != 0) {
			this.anInt7373 = 0;
			this.anInt7347 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!pca;)V")
	@Override
	public void method6100(@OriginalArg(0) Class250 arg0) {
		this.aClass368_1.method8401(this, -1, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!gk;)V")
	public void method6011(@OriginalArg(1) Interface7 arg0) {
		if (this.anInt7340 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7340 >= 0) {
			this.anInterface7Array2[this.anInt7340].method2920();
		}
		this.anInterface7_2 = this.anInterface7Array2[++this.anInt7340] = arg0;
		this.anInterface7_2.method2922();
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass54_Sub2_3.aFloat64 * (float) arg1 + this.aClass54_Sub2_3.aFloat71 * (float) arg0 + (float) arg2 * this.aClass54_Sub2_3.aFloat73 + this.aClass54_Sub2_3.aFloat69;
		@Pc(55) float local55 = this.aClass54_Sub2_3.aFloat69 + this.aClass54_Sub2_3.aFloat73 * (float) arg5 + this.aClass54_Sub2_3.aFloat64 * (float) arg4 + (float) arg3 * this.aClass54_Sub2_3.aFloat71;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt7377 && (float) this.anInt7377 > local55) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt7352 && (float) this.anInt7352 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) (((float) arg2 * this.aClass54_Sub2_3.aFloat72 + (float) arg1 * this.aClass54_Sub2_3.aFloat67 + (float) arg0 * this.aClass54_Sub2_3.aFloat68 + this.aClass54_Sub2_3.aFloat63) * (float) this.anInt7358 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt7358 * (this.aClass54_Sub2_3.aFloat67 * (float) arg4 + (float) arg3 * this.aClass54_Sub2_3.aFloat68 + this.aClass54_Sub2_3.aFloat72 * (float) arg5 + this.aClass54_Sub2_3.aFloat63) / (float) arg6);
		if ((float) local124 < this.aFloat166 && (float) local157 < this.aFloat166) {
			local57 |= 0x1;
		} else if (this.aFloat155 < (float) local124 && this.aFloat155 < (float) local157) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt7362 * (this.aClass54_Sub2_3.aFloat66 + (float) arg2 * this.aClass54_Sub2_3.aFloat65 + (float) arg0 * this.aClass54_Sub2_3.aFloat70 + this.aClass54_Sub2_3.aFloat74 * (float) arg1) / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt7362 * (this.aClass54_Sub2_3.aFloat65 * (float) arg5 + this.aClass54_Sub2_3.aFloat74 * (float) arg4 + (float) arg3 * this.aClass54_Sub2_3.aFloat70 + this.aClass54_Sub2_3.aFloat66) / (float) arg6);
		if ((float) local224 < this.aFloat157 && (float) local257 < this.aFloat157) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat158 && (float) local257 > this.aFloat158) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "(Z)V")
	private void method6012() {
		this.aClass20Array1 = new Class20[this.anInt7353];
		this.aClass20_Sub4_5 = new Class20_Sub4(this, 3553, 6408, 1, 1);
		new Class20_Sub4(this, 3553, 6408, 1, 1);
		new Class20_Sub4(this, 3553, 6408, 1, 1);
		this.aClass83_Sub2_3 = new Class83_Sub2(this);
		this.aClass83_Sub2_7 = new Class83_Sub2(this);
		this.aClass83_Sub2_6 = new Class83_Sub2(this);
		this.aClass83_Sub2_9 = new Class83_Sub2(this);
		this.aClass83_Sub2_1 = new Class83_Sub2(this);
		this.aClass83_Sub2_10 = new Class83_Sub2(this);
		this.aClass83_Sub2_5 = new Class83_Sub2(this);
		this.aClass83_Sub2_8 = new Class83_Sub2(this);
		this.aClass83_Sub2_4 = new Class83_Sub2(this);
		this.aClass83_Sub2_2 = new Class83_Sub2(this);
		if (this.aBoolean524) {
			this.aClass89_7 = new Class89(this);
			new Class89(this);
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(Z)V")
	@Override
	public void method6111(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Class20_Sub4_Sub1 local9 = local6.aClass20_Sub4_Sub1_4;
		this.method6019();
		this.method6020(local6.aClass20_Sub4_Sub1_4);
		this.method6005(1);
		this.method5957(7681, 8448);
		this.method6025(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat188 / (float) local9.anInt9361;
		@Pc(46) float local46 = local9.aFloat189 / (float) local9.anInt9362;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7361 - arg2), local46 * (float) (this.anInt7357 - arg3));
		OpenGL.glVertex2i(this.anInt7361, this.anInt7357);
		OpenGL.glTexCoord2f((float) (this.anInt7361 - arg2) * local39, local46 * (float) (this.anInt7359 - arg3));
		OpenGL.glVertex2i(this.anInt7361, this.anInt7359);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7356 - arg2), (float) (this.anInt7359 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt7356, this.anInt7359);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7356 - arg2), local46 * (float) (this.anInt7357 - arg3));
		OpenGL.glVertex2i(this.anInt7356, this.anInt7357);
		OpenGL.glEnd();
		this.method6025(768, 0, 5890);
	}

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "(B)V")
	private void method6013() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt7371; local7++) {
			@Pc(14) Class8_Sub1 local14 = this.aClass8_Sub1Array6[local7];
			Static95.aFloatArray35[0] = local14.method5206();
			@Pc(25) int local25 = local7 + 16386;
			Static95.aFloatArray35[1] = local14.method5198();
			Static95.aFloatArray35[2] = local14.method5207();
			Static95.aFloatArray35[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static95.aFloatArray35, 0);
			@Pc(52) int local52 = local14.method5203();
			@Pc(58) float local58 = local14.method5205() / 255.0F;
			Static95.aFloatArray35[2] = (float) (local52 & 0xFF) * local58;
			Static95.aFloatArray35[1] = local58 * (float) (local52 >> 8 & 0xFF);
			Static95.aFloatArray35[0] = (float) (local52 >> 16 & 0xFF) * local58;
			OpenGL.glLightfv(local25, 4609, Static95.aFloatArray35, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method5200() * local14.method5200()));
			OpenGL.glEnable(local25);
		}
		while (local7 < this.anInt7368) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt7368 = this.anInt7371;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!gk;Z)V")
	public void method6014(@OriginalArg(0) Interface7 arg0) {
		if (this.aBoolean515) {
			this.method6017(arg0);
			this.method6011(arg0);
		} else if (this.anInt7341 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt7341 >= 0) {
				this.anInterface7Array3[this.anInt7341].method2919();
			}
			this.anInterface7_1 = this.anInterface7_2 = this.anInterface7Array3[++this.anInt7341] = arg0;
			this.anInterface7_1.method2918();
		}
	}

	@OriginalMember(owner = "client!nv", name = "w", descriptor = "(I)V")
	private void method6015() {
		this.aFloatArray63[14] = this.aFloat154;
		this.aFloatArray63[10] = this.aFloat164;
		this.aFloat168 = this.anInt7352;
		this.aFloat152 = (this.aFloatArray63[14] - (float) this.anInt7352) / this.aFloatArray63[10];
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(BLclient!gk;)V")
	public void method6016(@OriginalArg(1) Interface7 arg0) {
		if (this.aBoolean515) {
			this.method5961(arg0);
			this.method5999(arg0);
		} else if (this.anInt7341 >= 0 && arg0 == this.anInterface7Array3[this.anInt7341]) {
			this.anInterface7Array3[this.anInt7341--] = null;
			arg0.method2919();
			if (this.anInt7341 >= 0) {
				this.anInterface7_1 = this.anInterface7_2 = this.anInterface7Array3[this.anInt7341];
				this.anInterface7_1.method2918();
			} else {
				this.anInterface7_1 = this.anInterface7_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "()V")
	@Override
	public void method6081() {
		if (!this.aBoolean522 || this.anInt7331 <= 0 || this.anInt7270 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt7361;
		@Pc(25) int local25 = this.anInt7356;
		@Pc(28) int local28 = this.anInt7357;
		@Pc(31) int local31 = this.anInt7359;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6010();
		this.method5996(false);
		this.method6024(false);
		this.method5950(false);
		this.method5955(false);
		this.method6020(null);
		this.method6023(-2);
		this.method5972(1);
		this.method6005(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt7331, this.anInt7270, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(Lclient!gk;I)V")
	public void method6017(@OriginalArg(0) Interface7 arg0) {
		if (this.anInt7342 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7342 >= 0) {
			this.anInterface7Array1[this.anInt7342].method2923();
		}
		this.anInterface7_1 = this.anInterface7Array1[++this.anInt7342] = arg0;
		this.anInterface7_1.method2921();
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6120(@OriginalArg(0) Canvas arg0) {
		this.aCanvas10 = null;
		this.aLong181 = 0L;
		if (arg0 == null || this.aCanvas11 == arg0) {
			this.aLong181 = this.aLong182;
			this.aCanvas10 = this.aCanvas11;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable4.get(arg0);
			this.aLong181 = local26;
			this.aCanvas10 = arg0;
		}
		if (this.aCanvas10 == null || this.aLong181 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong181);
		this.method5958();
	}

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7377 == arg0 && this.anInt7352 == arg1) {
			return;
		}
		this.anInt7377 = arg0;
		this.anInt7352 = arg1;
		this.method5963();
		this.method6026();
		if (this.anInt7373 == 3) {
			this.method5990();
			return;
		}
		if (this.anInt7373 != 2) {
			return;
		}
		this.method5989();
	}

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "(I)V")
	private void method6018() {
		Static101.aFloatArray36[1] = this.aFloat167 * this.aFloat169;
		Static101.aFloatArray36[2] = this.aFloat153 * this.aFloat169;
		Static101.aFloatArray36[0] = this.aFloat150 * this.aFloat169;
		Static101.aFloatArray36[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static101.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "(Z)V")
	public void method6019() {
		if (this.anInt7347 == 2) {
			return;
		}
		this.method6028();
		this.method5996(false);
		this.method6024(false);
		this.method5950(false);
		this.method5955(false);
		this.method6023(-2);
		this.anInt7347 = 2;
	}

	@OriginalMember(owner = "client!nv", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt7383;
		this.anInt7383 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "()Z")
	@Override
	public boolean method6115() {
		return false;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!tha;)V")
	public void method6020(@OriginalArg(1) Class20 arg0) {
		@Pc(11) Class20 local11 = this.aClass20Array1[this.anInt7360];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt9337);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt9337);
				} else if (arg0.anInt9337 != local11.anInt9337) {
					OpenGL.glDisable(local11.anInt9337);
					OpenGL.glEnable(arg0.anInt9337);
				}
				OpenGL.glBindTexture(arg0.anInt9337, arg0.method7612());
			}
			this.aClass20Array1[this.anInt7360] = arg0;
		}
		this.anInt7347 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIZ)Lclient!hu;")
	@Override
	public Class21 method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class21_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "(I)V")
	private void method6021() {
		OpenGL.glViewport(this.anInt7369, this.anInt7372, this.anInt7331, this.anInt7270);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)V")
	@Override
	public void method6082(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt7336 = arg0;
		this.aClass51_1.method1713();
	}

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "(II)V")
	public synchronized void method6022(@OriginalArg(0) int arg0) {
		@Pc(7) Class8 local7 = new Class8();
		local7.aLong285 = arg0;
		this.aClass43_46.method1424(local7);
	}

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "(II)V")
	public void method6023(@OriginalArg(0) int arg0) {
		this.method5964(true, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7379 = arg1;
		this.anInt7362 = arg3;
		this.anInt7363 = arg0;
		this.anInt7358 = arg2;
		this.method5963();
		this.method5945();
		if (this.anInt7373 == 3) {
			this.method5990();
		} else if (this.anInt7373 == 2) {
			this.method5989();
			return;
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(BZ)V")
	public void method6024(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean518 != arg0) {
			this.aBoolean518 = arg0;
			this.method6008();
			this.anInt7347 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(I)V")
	@Override
	public void method6101(@OriginalArg(0) int arg0) {
		this.method5970();
	}

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "()Z")
	@Override
	public boolean method6077() {
		return this.aClass8_Sub32_Sub1_1 != null && (this.anInt7335 <= 1 || this.aBoolean533);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(IIII)V")
	public void method6025(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg5;
		@Pc(9) Class20_Sub4_Sub1 local9 = local6.aClass20_Sub4_Sub1_4;
		this.method6019();
		this.method6020(local6.aClass20_Sub4_Sub1_4);
		this.method6005(1);
		this.method5957(7681, 8448);
		this.method6025(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat188 / (float) local9.anInt9361;
		@Pc(46) float local46 = local9.aFloat189 / (float) local9.anInt9362;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local59 * local59)));
		@Pc(76) float local76 = local52 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(95) float local95 = local59 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local76 + 0.35F, (float) arg3 + 0.35F + local95);
		OpenGL.glEnd();
		this.method6025(768, 0, 5890);
	}

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "(B)V")
	private void method6026() {
		this.aFloat156 = (float) (this.anInt7352 - this.anInt7382) - this.aFloat161;
		this.aFloat159 = this.aFloat156 - (float) this.anInt7365 * this.aFloat162;
		if ((float) this.anInt7377 > this.aFloat159) {
			this.aFloat159 = this.anInt7377;
		}
		OpenGL.glFogf(2915, this.aFloat159);
		OpenGL.glFogf(2916, this.aFloat156);
		Static101.aFloatArray36[2] = (float) (this.anInt7367 & 0xFF) / 255.0F;
		Static101.aFloatArray36[0] = (float) (this.anInt7367 & 0xFF0000) / 1.671168E7F;
		Static101.aFloatArray36[1] = (float) (this.anInt7367 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static101.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLclient!eb;)V")
	public void method6027(@OriginalArg(1) Class54_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method2596(), 0);
	}

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "(B)V")
	private void method6028() {
		if (this.anInt7373 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt7331 > 0 && this.anInt7270 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt7331, (double) this.anInt7270, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt7347 &= 0xFFFFFFE7;
		this.anInt7373 = 1;
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(IIII)V")
	public void method6029(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!nv", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg1 * this.aClass54_Sub2_3.aFloat64 + (float) arg0 * this.aClass54_Sub2_3.aFloat71 + this.aClass54_Sub2_3.aFloat73 * (float) arg2 + this.aClass54_Sub2_3.aFloat69;
		if (local28 < (float) this.anInt7377 || local28 > (float) this.anInt7352) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt7358 * (this.aClass54_Sub2_3.aFloat72 * (float) arg2 + this.aClass54_Sub2_3.aFloat67 * (float) arg1 + (float) arg0 * this.aClass54_Sub2_3.aFloat68 + this.aClass54_Sub2_3.aFloat63) / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt7362 * (this.aClass54_Sub2_3.aFloat74 * (float) arg1 + (float) arg0 * this.aClass54_Sub2_3.aFloat70 + this.aClass54_Sub2_3.aFloat65 * (float) arg2 + this.aClass54_Sub2_3.aFloat66) / local28);
		if ((float) local85 >= this.aFloat166 && (float) local85 <= this.aFloat155 && (float) local117 >= this.aFloat157 && (float) local117 <= this.aFloat158) {
			arg3[1] = (int) ((float) local117 - this.aFloat157);
			arg3[0] = (int) ((float) local85 - this.aFloat166);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!nv", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt7356;
		arg0[3] = this.anInt7359;
		arg0[1] = this.anInt7357;
		arg0[0] = this.anInt7361;
	}
}
