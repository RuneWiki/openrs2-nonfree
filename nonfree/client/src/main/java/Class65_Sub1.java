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

@OriginalClass("client!ck")
public final class Class65_Sub1 extends Class65 {

	@OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
	private int anInt1207;

	@OriginalMember(owner = "client!ck", name = "tb", descriptor = "I")
	private int anInt1231;

	@OriginalMember(owner = "client!ck", name = "Cb", descriptor = "I")
	public int anInt1240;

	@OriginalMember(owner = "client!ck", name = "le", descriptor = "I")
	public int anInt1374;

	@OriginalMember(owner = "client!ck", name = "Ce", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!ck", name = "De", descriptor = "I")
	public int anInt1383;

	@OriginalMember(owner = "client!ck", name = "Ke", descriptor = "Lclient!dk;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!ck", name = "Ne", descriptor = "Lclient!vd;")
	private Class363 aClass363_1;

	@OriginalMember(owner = "client!ck", name = "Oe", descriptor = "Lclient!dk;")
	private Interface6 anInterface6_2;

	@OriginalMember(owner = "client!ck", name = "Pe", descriptor = "Lclient!ca;")
	private Class50_Sub1 aClass50_Sub1_1;

	@OriginalMember(owner = "client!ck", name = "Qe", descriptor = "I")
	public int anInt1387;

	@OriginalMember(owner = "client!ck", name = "Re", descriptor = "I")
	private int anInt1388;

	@OriginalMember(owner = "client!ck", name = "Te", descriptor = "I")
	public int anInt1389;

	@OriginalMember(owner = "client!ck", name = "af", descriptor = "Z")
	private boolean aBoolean89;

	@OriginalMember(owner = "client!ck", name = "cf", descriptor = "Z")
	private boolean aBoolean90;

	@OriginalMember(owner = "client!ck", name = "df", descriptor = "I")
	private int anInt1390;

	@OriginalMember(owner = "client!ck", name = "ef", descriptor = "Z")
	private boolean aBoolean91;

	@OriginalMember(owner = "client!ck", name = "ff", descriptor = "Z")
	private boolean aBoolean92;

	@OriginalMember(owner = "client!ck", name = "gf", descriptor = "I")
	private int anInt1391;

	@OriginalMember(owner = "client!ck", name = "hf", descriptor = "I")
	private int anInt1392;

	@OriginalMember(owner = "client!ck", name = "jf", descriptor = "J")
	private long aLong37;

	@OriginalMember(owner = "client!ck", name = "qf", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!ck", name = "rf", descriptor = "I")
	public int anInt1397;

	@OriginalMember(owner = "client!ck", name = "uf", descriptor = "Z")
	public boolean aBoolean93;

	@OriginalMember(owner = "client!ck", name = "vf", descriptor = "Z")
	private boolean aBoolean94;

	@OriginalMember(owner = "client!ck", name = "wf", descriptor = "Z")
	public boolean aBoolean95;

	@OriginalMember(owner = "client!ck", name = "yf", descriptor = "Lclient!to;")
	public Class153_Sub2 aClass153_Sub2_1;

	@OriginalMember(owner = "client!ck", name = "zf", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!ck", name = "Af", descriptor = "Lclient!to;")
	public Class153_Sub2 aClass153_Sub2_2;

	@OriginalMember(owner = "client!ck", name = "Df", descriptor = "Lclient!to;")
	public Class153_Sub2 aClass153_Sub2_3;

	@OriginalMember(owner = "client!ck", name = "Ef", descriptor = "I")
	public int anInt1403;

	@OriginalMember(owner = "client!ck", name = "Gf", descriptor = "I")
	private int anInt1405;

	@OriginalMember(owner = "client!ck", name = "Hf", descriptor = "Z")
	private boolean aBoolean96;

	@OriginalMember(owner = "client!ck", name = "If", descriptor = "Lclient!to;")
	public Class153_Sub2 aClass153_Sub2_4;

	@OriginalMember(owner = "client!ck", name = "Jf", descriptor = "Lclient!gaa;")
	private Class57_Sub2 aClass57_Sub2_1;

	@OriginalMember(owner = "client!ck", name = "Kf", descriptor = "Z")
	public boolean aBoolean97;

	@OriginalMember(owner = "client!ck", name = "Lf", descriptor = "Lclient!to;")
	public Class153_Sub2 aClass153_Sub2_5;

	@OriginalMember(owner = "client!ck", name = "Nf", descriptor = "Lclient!to;")
	public Class153_Sub2 aClass153_Sub2_6;

	@OriginalMember(owner = "client!ck", name = "Pf", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!ck", name = "Qf", descriptor = "Lclient!nk;")
	private Interface17 anInterface17_2;

	@OriginalMember(owner = "client!ck", name = "Sf", descriptor = "Z")
	private boolean aBoolean98;

	@OriginalMember(owner = "client!ck", name = "Wf", descriptor = "Lclient!dea;")
	public Class79 aClass79_3;

	@OriginalMember(owner = "client!ck", name = "Yf", descriptor = "F")
	private float aFloat16;

	@OriginalMember(owner = "client!ck", name = "ag", descriptor = "F")
	private float aFloat17;

	@OriginalMember(owner = "client!ck", name = "dg", descriptor = "Z")
	public boolean aBoolean101;

	@OriginalMember(owner = "client!ck", name = "eg", descriptor = "I")
	private int anInt1409;

	@OriginalMember(owner = "client!ck", name = "fg", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!ck", name = "jg", descriptor = "Lclient!dea;")
	public Class79 aClass79_4;

	@OriginalMember(owner = "client!ck", name = "kg", descriptor = "Z")
	public boolean aBoolean103;

	@OriginalMember(owner = "client!ck", name = "ng", descriptor = "I")
	private int anInt1412;

	@OriginalMember(owner = "client!ck", name = "og", descriptor = "Z")
	private boolean aBoolean104;

	@OriginalMember(owner = "client!ck", name = "pg", descriptor = "I")
	private int anInt1413;

	@OriginalMember(owner = "client!ck", name = "qg", descriptor = "Z")
	public boolean aBoolean105;

	@OriginalMember(owner = "client!ck", name = "rg", descriptor = "Z")
	private boolean aBoolean106;

	@OriginalMember(owner = "client!ck", name = "vg", descriptor = "Lclient!to;")
	public Class153_Sub2 aClass153_Sub2_7;

	@OriginalMember(owner = "client!ck", name = "Ag", descriptor = "Z")
	public boolean aBoolean109;

	@OriginalMember(owner = "client!ck", name = "Cg", descriptor = "Z")
	public boolean aBoolean111;

	@OriginalMember(owner = "client!ck", name = "Eg", descriptor = "I")
	private int anInt1416;

	@OriginalMember(owner = "client!ck", name = "Hg", descriptor = "Z")
	private boolean aBoolean114;

	@OriginalMember(owner = "client!ck", name = "Ig", descriptor = "Lclient!rc;")
	private Class80_Sub2_Sub1 aClass80_Sub2_Sub1_3;

	@OriginalMember(owner = "client!ck", name = "Lg", descriptor = "Lclient!to;")
	public Class153_Sub2 aClass153_Sub2_8;

	@OriginalMember(owner = "client!ck", name = "Ng", descriptor = "Lclient!to;")
	public Class153_Sub2 aClass153_Sub2_9;

	@OriginalMember(owner = "client!ck", name = "Qg", descriptor = "I")
	private int anInt1419;

	@OriginalMember(owner = "client!ck", name = "Tg", descriptor = "F")
	private float aFloat27;

	@OriginalMember(owner = "client!ck", name = "Ug", descriptor = "Lclient!nk;")
	private Interface17 anInterface17_3;

	@OriginalMember(owner = "client!ck", name = "Xg", descriptor = "[Lclient!wj;")
	private Class80[] aClass80Array1;

	@OriginalMember(owner = "client!ck", name = "Yg", descriptor = "Z")
	public boolean aBoolean116;

	@OriginalMember(owner = "client!ck", name = "Zg", descriptor = "Lclient!to;")
	public Class153_Sub2 aClass153_Sub2_10;

	@OriginalMember(owner = "client!ck", name = "ah", descriptor = "I")
	public int anInt1420;

	@OriginalMember(owner = "client!ck", name = "ch", descriptor = "I")
	public int anInt1421;

	@OriginalMember(owner = "client!ck", name = "dh", descriptor = "I")
	private int anInt1422;

	@OriginalMember(owner = "client!ck", name = "eh", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!ck", name = "fh", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!ck", name = "gh", descriptor = "Z")
	public boolean aBoolean117;

	@OriginalMember(owner = "client!ck", name = "hh", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!ck", name = "jh", descriptor = "Lclient!vd;")
	public Class363 aClass363_2;

	@OriginalMember(owner = "client!ck", name = "lh", descriptor = "Lclient!gha;")
	public Class80_Sub2 aClass80_Sub2_1;

	@OriginalMember(owner = "client!ck", name = "nh", descriptor = "Ljava/lang/String;")
	private String aString10;

	@OriginalMember(owner = "client!ck", name = "oh", descriptor = "I")
	private int anInt1425;

	@OriginalMember(owner = "client!ck", name = "ph", descriptor = "Z")
	private boolean aBoolean119;

	@OriginalMember(owner = "client!ck", name = "rh", descriptor = "Lclient!pm;")
	private Interface23 anInterface23_3;

	@OriginalMember(owner = "client!ck", name = "uh", descriptor = "I")
	private int anInt1427;

	@OriginalMember(owner = "client!ck", name = "xh", descriptor = "I")
	private int anInt1428;

	@OriginalMember(owner = "client!ck", name = "dc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!ck", name = "we", descriptor = "I")
	public int anInt1380 = 128;

	@OriginalMember(owner = "client!ck", name = "ne", descriptor = "Lclient!ug;")
	private final Class350 aClass350_1 = new Class350();

	@OriginalMember(owner = "client!ck", name = "xe", descriptor = "Lclient!no;")
	private final Class254_Sub1 aClass254_Sub1_1 = new Class254_Sub1();

	@OriginalMember(owner = "client!ck", name = "ye", descriptor = "Lclient!no;")
	public final Class254_Sub1 aClass254_Sub1_2 = new Class254_Sub1();

	@OriginalMember(owner = "client!ck", name = "Ae", descriptor = "I")
	public int anInt1381 = 3;

	@OriginalMember(owner = "client!ck", name = "ze", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!ck", name = "Be", descriptor = "I")
	public int anInt1382 = 8;

	@OriginalMember(owner = "client!ck", name = "Fe", descriptor = "Lclient!fca;")
	private final Class114 aClass114_10 = new Class114();

	@OriginalMember(owner = "client!ck", name = "Ge", descriptor = "[Lclient!dk;")
	private final Interface6[] anInterface6Array1 = new Interface6[4];

	@OriginalMember(owner = "client!ck", name = "Je", descriptor = "I")
	private int anInt1386 = -1;

	@OriginalMember(owner = "client!ck", name = "He", descriptor = "I")
	private int anInt1384 = -1;

	@OriginalMember(owner = "client!ck", name = "Le", descriptor = "[Lclient!dk;")
	private final Interface6[] anInterface6Array2 = new Interface6[4];

	@OriginalMember(owner = "client!ck", name = "Ie", descriptor = "I")
	private int anInt1385 = -1;

	@OriginalMember(owner = "client!ck", name = "Me", descriptor = "[Lclient!dk;")
	private final Interface6[] anInterface6Array3 = new Interface6[4];

	@OriginalMember(owner = "client!ck", name = "Se", descriptor = "Lclient!fca;")
	private final Class114 aClass114_11;

	@OriginalMember(owner = "client!ck", name = "Ue", descriptor = "Lclient!fca;")
	private final Class114 aClass114_12;

	@OriginalMember(owner = "client!ck", name = "Ve", descriptor = "Lclient!fca;")
	private final Class114 aClass114_13;

	@OriginalMember(owner = "client!ck", name = "We", descriptor = "Lclient!fca;")
	private final Class114 aClass114_14;

	@OriginalMember(owner = "client!ck", name = "Xe", descriptor = "Lclient!fca;")
	private final Class114 aClass114_15;

	@OriginalMember(owner = "client!ck", name = "Ye", descriptor = "Lclient!fca;")
	private final Class114 aClass114_16;

	@OriginalMember(owner = "client!ck", name = "Ze", descriptor = "Lclient!fca;")
	private final Class114 aClass114_17;

	@OriginalMember(owner = "client!ck", name = "bf", descriptor = "Lclient!no;")
	public final Class254_Sub1 bf;

	@OriginalMember(owner = "client!ck", name = "kf", descriptor = "Lclient!no;")
	public final Class254_Sub1 aClass254_Sub1_3;

	@OriginalMember(owner = "client!ck", name = "lf", descriptor = "Lclient!no;")
	public final Class254_Sub1 aClass254_Sub1_4;

	@OriginalMember(owner = "client!ck", name = "mf", descriptor = "I")
	private int anInt1393;

	@OriginalMember(owner = "client!ck", name = "nf", descriptor = "I")
	public int anInt1394;

	@OriginalMember(owner = "client!ck", name = "Cf", descriptor = "I")
	private int anInt1402;

	@OriginalMember(owner = "client!ck", name = "sf", descriptor = "I")
	public int anInt1398;

	@OriginalMember(owner = "client!ck", name = "xf", descriptor = "I")
	public int anInt1400;

	@OriginalMember(owner = "client!ck", name = "Tf", descriptor = "F")
	private float aFloat14;

	@OriginalMember(owner = "client!ck", name = "cg", descriptor = "F")
	private float aFloat19;

	@OriginalMember(owner = "client!ck", name = "Uf", descriptor = "F")
	private float aFloat15;

	@OriginalMember(owner = "client!ck", name = "Bf", descriptor = "I")
	public int anInt1401;

	@OriginalMember(owner = "client!ck", name = "Mf", descriptor = "I")
	public int anInt1406;

	@OriginalMember(owner = "client!ck", name = "bg", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!ck", name = "of", descriptor = "I")
	public int anInt1395;

	@OriginalMember(owner = "client!ck", name = "wg", descriptor = "[F")
	public final float[] aFloatArray5;

	@OriginalMember(owner = "client!ck", name = "ug", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!ck", name = "Og", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!ck", name = "Sg", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!ck", name = "Jg", descriptor = "I")
	private int anInt1417;

	@OriginalMember(owner = "client!ck", name = "Ff", descriptor = "I")
	public int anInt1404;

	@OriginalMember(owner = "client!ck", name = "Pg", descriptor = "I")
	private int anInt1418;

	@OriginalMember(owner = "client!ck", name = "mg", descriptor = "F")
	private float aFloat21;

	@OriginalMember(owner = "client!ck", name = "Wg", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!ck", name = "Rf", descriptor = "I")
	private int anInt1408;

	@OriginalMember(owner = "client!ck", name = "pf", descriptor = "I")
	public int anInt1396;

	@OriginalMember(owner = "client!ck", name = "Dg", descriptor = "[F")
	private final float[] aFloatArray6;

	@OriginalMember(owner = "client!ck", name = "Of", descriptor = "I")
	private int anInt1407;

	@OriginalMember(owner = "client!ck", name = "hg", descriptor = "[F")
	private final float[] aFloatArray4;

	@OriginalMember(owner = "client!ck", name = "Kg", descriptor = "[F")
	private final float[] aFloatArray7;

	@OriginalMember(owner = "client!ck", name = "Rg", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!ck", name = "tf", descriptor = "I")
	public int anInt1399;

	@OriginalMember(owner = "client!ck", name = "kh", descriptor = "I")
	public int anInt1424;

	@OriginalMember(owner = "client!ck", name = "sg", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!ck", name = "Xf", descriptor = "[Lclient!gu;")
	private final Class5_Sub18[] aClass5_Sub18Array1;

	@OriginalMember(owner = "client!ck", name = "qh", descriptor = "[F")
	private final float[] aFloatArray8;

	@OriginalMember(owner = "client!ck", name = "yg", descriptor = "I")
	public int anInt1414;

	@OriginalMember(owner = "client!ck", name = "zg", descriptor = "I")
	private int anInt1415;

	@OriginalMember(owner = "client!ck", name = "bh", descriptor = "F")
	private float aFloat29;

	@OriginalMember(owner = "client!ck", name = "Mg", descriptor = "Z")
	private boolean aBoolean115;

	@OriginalMember(owner = "client!ck", name = "mh", descriptor = "Z")
	private boolean aBoolean118;

	@OriginalMember(owner = "client!ck", name = "lg", descriptor = "I")
	private int anInt1411;

	@OriginalMember(owner = "client!ck", name = "sh", descriptor = "I")
	private int anInt1426;

	@OriginalMember(owner = "client!ck", name = "ih", descriptor = "I")
	private int anInt1423;

	@OriginalMember(owner = "client!ck", name = "Vg", descriptor = "Lclient!qca;")
	public Class5_Sub41_Sub1 aClass5_Sub41_Sub1_2;

	@OriginalMember(owner = "client!ck", name = "wh", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!ck", name = "th", descriptor = "[I")
	public int[] anIntArray67;

	@OriginalMember(owner = "client!ck", name = "vh", descriptor = "[I")
	public int[] anIntArray68;

	@OriginalMember(owner = "client!ck", name = "yh", descriptor = "[B")
	public final byte[] aByteArray15;

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas1;

	@OriginalMember(owner = "client!ck", name = "md", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!ck", name = "qe", descriptor = "I")
	public final int anInt1377;

	@OriginalMember(owner = "client!ck", name = "wc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "J")
	private final long aLong35;

	@OriginalMember(owner = "client!ck", name = "Gb", descriptor = "J")
	private long aLong36;

	@OriginalMember(owner = "client!ck", name = "gg", descriptor = "I")
	public final int anInt1410;

	@OriginalMember(owner = "client!ck", name = "ig", descriptor = "Z")
	public boolean aBoolean102;

	@OriginalMember(owner = "client!ck", name = "Fg", descriptor = "Z")
	public boolean aBoolean112;

	@OriginalMember(owner = "client!ck", name = "Gg", descriptor = "Z")
	private boolean aBoolean113;

	@OriginalMember(owner = "client!ck", name = "Vf", descriptor = "Z")
	public boolean aBoolean99;

	@OriginalMember(owner = "client!ck", name = "Bg", descriptor = "Z")
	private boolean aBoolean110;

	@OriginalMember(owner = "client!ck", name = "tg", descriptor = "Z")
	public boolean aBoolean107;

	@OriginalMember(owner = "client!ck", name = "Zf", descriptor = "Z")
	public boolean aBoolean100;

	@OriginalMember(owner = "client!ck", name = "xg", descriptor = "Z")
	private final boolean aBoolean108;

	@OriginalMember(owner = "client!ck", name = "re", descriptor = "Lclient!pja;")
	private final Class279 aClass279_1;

	@OriginalMember(owner = "client!ck", name = "Ee", descriptor = "Lclient!faa;")
	public final Class112 aClass112_1;

	@OriginalMember(owner = "client!ck", name = "pe", descriptor = "Lclient!kea;")
	private final Class193 aClass193_1;

	@OriginalMember(owner = "client!ck", name = "ve", descriptor = "Lclient!js;")
	private Class5_Sub34_Sub1 aClass5_Sub34_Sub1_1;

	@OriginalMember(owner = "client!ck", name = "te", descriptor = "Lclient!ts;")
	private final Class342 aClass342_1;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class65_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class358();
		new Class300(16);
		this.aClass114_11 = new Class114();
		this.aClass114_12 = new Class114();
		this.aClass114_13 = new Class114();
		this.aClass114_14 = new Class114();
		this.aClass114_15 = new Class114();
		this.aClass114_16 = new Class114();
		this.aClass114_17 = new Class114();
		this.bf = new Class254_Sub1();
		this.aClass254_Sub1_3 = new Class254_Sub1();
		this.aClass254_Sub1_4 = new Class254_Sub1();
		this.anInt1393 = 8448;
		this.anInt1394 = -1;
		this.anInt1402 = 0;
		this.anInt1398 = 512;
		this.anInt1400 = -1;
		this.aFloat14 = 0.0F;
		this.aFloat19 = 1.0F;
		this.aFloat15 = -1.0F;
		this.anInt1401 = -1;
		this.anInt1406 = 0;
		this.aFloat18 = 3584.0F;
		this.anInt1395 = 0;
		this.aFloatArray5 = new float[4];
		this.aFloat23 = 1.0F;
		this.aFloat24 = 1.0F;
		this.aFloat26 = -1.0F;
		this.anInt1417 = 8448;
		this.anInt1404 = 50;
		this.anInt1418 = 0;
		this.aFloat21 = 1.0F;
		this.aFloat28 = -1.0F;
		this.anInt1408 = 0;
		this.anInt1396 = 512;
		this.aFloatArray6 = new float[4];
		this.anInt1407 = 0;
		this.aFloatArray4 = new float[16];
		this.aFloatArray7 = new float[4];
		this.aFloat25 = 3584.0F;
		this.anInt1399 = -1;
		this.anInt1424 = 0;
		this.aFloat22 = 1.0F;
		this.aClass5_Sub18Array1 = new Class5_Sub18[Static293.anInt5673];
		this.aFloatArray8 = new float[4];
		this.anInt1414 = 0;
		this.anInt1415 = 3584;
		this.aFloat29 = -1.0F;
		this.aBoolean115 = true;
		this.aBoolean118 = false;
		this.anInt1411 = 0;
		this.anInt1426 = 0;
		this.anInt1423 = -1;
		this.aClass5_Sub41_Sub1_2 = new Class5_Sub41_Sub1(8192);
		this.anIntArray69 = new int[1];
		this.anIntArray67 = new int[1];
		this.anIntArray68 = new int[1];
		this.aByteArray15 = new byte[16384];
		this.aCanvas2 = this.aCanvas1 = arg0;
		this.anInt1377 = arg2;
		if (!Static278.method4508("jaclib")) {
			throw new RuntimeException("");
		} else if (Static278.method4508("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong36 = this.aLong35 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt1377);
				if (this.aLong35 == 0L) {
					throw new RuntimeException("");
				}
				this.method1219();
				@Pc(333) int local333 = this.method1241();
				if (local333 != 0) {
					throw new RuntimeException("");
				}
				this.anInt1410 = this.aBoolean97 ? 33639 : 5121;
				if (this.aString9.indexOf("radeon") != -1) {
					@Pc(356) int local356 = 0;
					@Pc(358) boolean local358 = false;
					@Pc(360) boolean local360 = false;
					@Pc(369) String[] local369 = Static147.method2668(' ', this.aString9.replace('/', ' '));
					for (@Pc(371) int local371 = 0; local371 < local369.length; local371++) {
						@Pc(376) String local376 = local369[local371];
						try {
							if (local376.length() > 0) {
								if (local376.charAt(0) == 'x' && local376.length() >= 3 && Static414.method6154(local376.substring(1, 3))) {
									local376 = local376.substring(1);
									local360 = true;
								}
								if (local376.equals("hd")) {
									local358 = true;
								} else {
									if (local376.startsWith("hd")) {
										local358 = true;
										local376 = local376.substring(2);
									}
									if (local376.length() >= 4 && Static414.method6154(local376.substring(0, 4))) {
										local356 = Static270.method4173(local376.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(442) Exception local442) {
						}
					}
					if (!local358 || local356 < 4000) {
						this.aBoolean102 = false;
					}
					if (!local360 && !local358) {
						if (local356 >= 7000 && local356 <= 9250) {
							this.aBoolean112 = false;
						}
						if (local356 >= 7000 && local356 <= 7999) {
							this.aBoolean113 = false;
						}
					}
					this.aBoolean99 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean110 = this.aBoolean113;
					this.aBoolean107 = true;
				}
				if (this.aString10.indexOf("intel") != -1) {
					this.aBoolean100 = false;
				}
				this.aBoolean108 = !this.aString10.equals("s3 graphics");
				if (this.aBoolean113) {
					try {
						@Pc(526) int[] local526 = new int[1];
						OpenGL.glGenBuffersARB(1, local526, 0);
					} catch (@Pc(532) Throwable local532) {
						throw new RuntimeException("");
					}
				}
				Static238.method3722(true, false);
				this.aBoolean88 = true;
				this.aClass279_1 = new Class279(this, super.anInterface4_11);
				this.method1267();
				this.aClass112_1 = new Class112(this);
				this.aClass193_1 = new Class193(this);
				if (this.aClass193_1.method4871()) {
					this.aClass5_Sub34_Sub1_1 = new Class5_Sub34_Sub1(this);
					if (!this.aClass5_Sub34_Sub1_1.method4750()) {
						this.aClass5_Sub34_Sub1_1.method4740();
						this.aClass5_Sub34_Sub1_1 = null;
					}
				}
				this.aClass342_1 = new Class342(this);
				this.method1254();
				this.method1300();
				this.method6909();
			} catch (@Pc(606) Throwable local606) {
				local606.printStackTrace();
				this.method6904();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V")
	private void method1219() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL1.a()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static579.method8004(1000L);
		}
	}

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "(I)V")
	public void method1220() {
		if (this.anInt1392 == 16) {
			return;
		}
		this.method1247();
		this.method1234(true);
		this.method1289(true);
		this.method1297(true);
		this.method1231(1);
		this.anInt1392 = 16;
	}

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "(II)V")
	public synchronized void method1221(@OriginalArg(0) int arg0) {
		@Pc(7) Class5 local7 = new Class5();
		local7.aLong307 = (long) arg0;
		this.aClass114_16.method2807(local7);
	}

	@OriginalMember(owner = "client!ck", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean117 = false;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZ)Lclient!pu;")
	@Override
	public Class50 method6907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class50_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([BZIII)Lclient!nk;")
	public Interface17 method1223(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return (Interface17) (this.aBoolean113 && (!arg1 || this.aBoolean110) ? new Class165_Sub1(this, arg3, arg0, arg2, arg1) : new Class274_Sub1(this, arg3, arg0, arg2));
	}

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "(I)V")
	private void method1224() {
		@Pc(12) float[] local12 = this.aFloatArray4;
		@Pc(24) float local24 = (float) (this.anInt1404 * -this.anInt1406) / (float) this.anInt1398;
		@Pc(39) float local39 = (float) (this.anInt1404 * (this.anInt1240 - this.anInt1406)) / (float) this.anInt1398;
		@Pc(50) float local50 = (float) (this.anInt1424 * this.anInt1404) / (float) this.anInt1396;
		@Pc(65) float local65 = (float) ((this.anInt1424 - this.anInt1374) * this.anInt1404) / (float) this.anInt1396;
		if (local39 == local24 || local50 == local65) {
			local12[2] = 0.0F;
			local12[7] = 0.0F;
			local12[5] = 1.0F;
			local12[1] = 0.0F;
			local12[14] = 0.0F;
			local12[4] = 0.0F;
			local12[9] = 0.0F;
			local12[6] = 0.0F;
			local12[13] = 0.0F;
			local12[8] = 0.0F;
			local12[15] = 1.0F;
			local12[12] = 0.0F;
			local12[3] = 0.0F;
			local12[0] = 1.0F;
			local12[10] = 1.0F;
			local12[11] = 0.0F;
		} else {
			@Pc(79) float local79 = (float) this.anInt1404 * 2.0F;
			local12[7] = 0.0F;
			local12[6] = 0.0F;
			local12[13] = 0.0F;
			local12[15] = 0.0F;
			local12[1] = 0.0F;
			local12[9] = (local50 + local65) / (local50 - local65);
			local12[2] = 0.0F;
			local12[3] = 0.0F;
			local12[14] = this.aFloat27 = -((float) this.anInt1415 * local79) / (float) (this.anInt1415 - this.anInt1404);
			local12[11] = -1.0F;
			local12[8] = (local39 + local24) / (local39 - local24);
			local12[5] = local79 / (local50 - local65);
			local12[10] = this.aFloat16 = (float) -(this.anInt1415 + this.anInt1404) / (float) (this.anInt1415 - this.anInt1404);
			local12[0] = local79 / (local39 - local24);
			local12[12] = 0.0F;
			local12[4] = 0.0F;
		}
		this.method1236();
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "()Lclient!oha;")
	@Override
	public Class254 method6890() {
		return this.bf;
	}

	@OriginalMember(owner = "client!ck", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean117) {
			throw new RuntimeException("");
		}
		this.anInt1401 = arg1;
		this.anInt1420 = arg0;
		this.anInt1395 = arg3;
		this.anInt1400 = arg2;
		if (this.aBoolean118) {
			this.aClass342_1.aClass231_Sub4_1.method6551();
			this.aClass342_1.aClass231_Sub4_1.method6553();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
	public void method1225() {
		if (this.anInt1392 == 2) {
			return;
		}
		this.method1294();
		this.method1234(false);
		this.method1285(false);
		this.method1289(false);
		this.method1297(false);
		this.method1246(-2);
		this.anInt1392 = 2;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!oha;)V")
	@Override
	public void method6891(@OriginalArg(0) Class254 arg0) {
		this.bf.method7356(arg0);
		this.aClass254_Sub1_3.method7356(this.bf);
		this.aClass254_Sub1_3.method5935();
		this.aClass254_Sub1_4.method5929(this.aClass254_Sub1_3);
		if (this.anInt1412 != 1) {
			this.method1280();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6915() {
		this.method1282();
		this.method1231(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(FFBF)V")
	private void method1226(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean106) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg0, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean106 = true;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)I")
	public int method1227(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "(I)V")
	@Override
	public void method6958(@OriginalArg(0) int arg0) {
		this.method1242();
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)I")
	@Override
	public int method6885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!vi;Z)Lclient!pu;")
	@Override
	public Class50 method6898(@OriginalArg(0) Class369 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt10309 * arg0.anInt10307];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray103 == null) {
			for (local21 = 0; local21 < arg0.anInt10307; local21++) {
				for (local25 = 0; local25 < arg0.anInt10309; local25++) {
					@Pc(87) int local87 = arg0.anIntArray561[arg0.aByteArray104[local14++] & 0xFF];
					local12[local16++] = local87 == 0 ? 0 : local87 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt10307; local21++) {
				for (local25 = 0; local25 < arg0.anInt10309; local25++) {
					local12[local16++] = arg0.anIntArray561[arg0.aByteArray104[local14] & 0xFF] | arg0.aByteArray103[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(127) Class50 local127 = this.method6952(arg0.anInt10307, arg0.anInt10309, local12, arg0.anInt10309);
		local127.method5986(arg0.anInt10308, arg0.anInt10306, arg0.anInt10311, arg0.anInt10310);
		return local127;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIII)Lclient!tea;")
	@Override
	public Class57 method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean109 ? new Class57_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
	public void method1228(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1416 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (arg0 != this.anInt1393) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local17 = true;
			this.anInt1393 = arg0;
		}
		if (arg1 != this.anInt1417) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local17 = true;
			this.anInt1417 = arg1;
		}
		if (local17) {
			this.anInt1392 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!dk;)V")
	public void method1229(@OriginalArg(1) Interface6 arg0) {
		if (this.aBoolean95) {
			this.method1273(arg0);
			this.method1275(arg0);
		} else if (this.anInt1385 >= 0 && this.anInterface6Array2[this.anInt1385] == arg0) {
			this.anInterface6Array2[this.anInt1385--] = null;
			arg0.method8442();
			if (this.anInt1385 >= 0) {
				this.anInterface6_2 = this.anInterface6_1 = this.anInterface6Array2[this.anInt1385];
				this.anInterface6_2.method8439();
			} else {
				this.anInterface6_2 = this.anInterface6_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static601.method8231(arg2, arg1, this, arg0, arg3);
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)Lclient!od;")
	@Override
	public Interface19 method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!pm;)V")
	public void method1230(@OriginalArg(1) Interface23 arg0) {
		if (arg0 != this.anInterface23_3) {
			if (this.aBoolean113) {
				OpenGL.glBindBufferARB(34963, arg0.method9044());
			}
			this.anInterface23_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "(II)V")
	public void method1231(@OriginalArg(0) int arg0) {
		if (this.anInt1391 == arg0) {
			return;
		}
		@Pc(14) boolean local14;
		@Pc(12) byte local12;
		if (arg0 == 1) {
			local12 = 1;
			local14 = true;
		} else if (arg0 == 2) {
			local12 = 2;
			local14 = false;
		} else if (arg0 == 128) {
			local14 = true;
			local12 = 3;
		} else {
			local14 = false;
			local12 = 0;
		}
		if (!this.aBoolean91) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean91 = true;
		}
		if (local14 != this.aBoolean90) {
			if (local14) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean90 = local14;
		}
		if (this.anInt1390 != local12) {
			if (local12 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local12 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local12 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt1390 = local12;
		}
		this.anInt1392 &= 0xFFFFFFE3;
		this.anInt1391 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "()Z")
	@Override
	public boolean method6953() {
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6950(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas1 == arg0) {
			local5 = this.aLong35;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas2) {
			this.method1300();
		}
	}

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "(II)V")
	public void method1232(@OriginalArg(0) int arg0) {
		Static215.aFloatArray78[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static215.aFloatArray78[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static215.aFloatArray78[3] = (float) (arg0 >>> 24) / 255.0F;
		Static215.aFloatArray78[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static215.aFloatArray78, 0);
	}

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ck", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat13 != arg0) {
			this.aFloat13 = arg0;
			this.method1287();
		}
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1282();
		this.method1231(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		if (local16 == 0.0F && local23 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(44) float local44 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local23 * local23)));
			local23 *= local44;
			local16 *= local44;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, local23 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!md;)V")
	@Override
	public void method6877(@OriginalArg(0) Interface15 arg0) {
	}

	@OriginalMember(owner = "client!ck", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Class80_Sub2_Sub1 local9 = local6.aClass80_Sub2_Sub1_5;
		this.method1225();
		this.method1286(local6.aClass80_Sub2_Sub1_5);
		this.method1231(1);
		this.method1228(7681, 8448);
		this.method1265(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat169 / (float) local9.anInt8361;
		@Pc(46) float local46 = local9.aFloat168 / (float) local9.anInt8362;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt1426 - arg2), local46 * (float) (this.anInt1407 - arg3));
		OpenGL.glVertex2i(this.anInt1426, this.anInt1407);
		OpenGL.glTexCoord2f((float) (this.anInt1426 - arg2) * local39, (float) (this.anInt1402 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt1426, this.anInt1402);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt1418 - arg2), local46 * (float) (this.anInt1402 - arg3));
		OpenGL.glVertex2i(this.anInt1418, this.anInt1402);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt1418 - arg2), local46 * (float) (this.anInt1407 - arg3));
		OpenGL.glVertex2i(this.anInt1418, this.anInt1407);
		OpenGL.glEnd();
		this.method1265(0, 768, 5890);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIII)V")
	public void method1233(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ck", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt1415;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
	@Override
	public void method6911(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt1380 = arg0;
		this.aClass279_1.method6512();
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IZ)V")
	public void method1234(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean114) {
			this.aBoolean114 = arg0;
			this.method1245();
			this.anInt1392 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "(I)V")
	public void method1235() {
		if (this.anInt1392 == 4) {
			return;
		}
		this.method1294();
		this.method1234(false);
		this.method1285(false);
		this.method1289(false);
		this.method1297(false);
		this.method1246(-2);
		this.method1231(1);
		this.anInt1392 = 4;
	}

	@OriginalMember(owner = "client!ck", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt1423;
		if (local11 || this.aFloat26 != arg1 || arg2 != this.aFloat28) {
			this.aFloat26 = arg1;
			this.aFloat28 = arg2;
			this.anInt1423 = arg0;
			if (local11) {
				this.aFloat24 = (float) (this.anInt1423 & 0xFF) / 255.0F;
				this.aFloat22 = (float) (this.anInt1423 & 0xFF00) / 65280.0F;
				this.aFloat23 = (float) (this.anInt1423 & 0xFF0000) / 1.671168E7F;
				this.method1287();
			}
			this.method1272();
		}
		if (this.aFloatArray6[0] == arg3 && this.aFloatArray6[1] == arg4 && arg5 == this.aFloatArray6[2]) {
			return;
		}
		this.aFloatArray6[0] = arg3;
		this.aFloatArray6[1] = arg4;
		this.aFloatArray6[2] = arg5;
		this.aFloatArray7[1] = -arg4;
		this.aFloatArray7[2] = -arg5;
		this.aFloatArray7[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray5[0] = arg3 * local138;
		this.aFloatArray5[1] = local138 * arg4;
		this.aFloatArray5[2] = arg5 * local138;
		this.aFloatArray8[1] = -this.aFloatArray5[1];
		this.aFloatArray8[0] = -this.aFloatArray5[0];
		this.aFloatArray8[2] = -this.aFloatArray5[2];
		this.method1240();
		this.anInt1421 = (int) (arg5 * 256.0F / arg4);
		this.anInt1403 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ck", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt1381 = 0;
		while (arg0 > 1) {
			this.anInt1381++;
			arg0 >>= 0x1;
		}
		this.anInt1382 = 0x1 << this.anInt1381;
	}

	@OriginalMember(owner = "client!ck", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg2 * this.bf.aFloat130 + (float) arg1 * this.bf.aFloat141 + (float) arg0 * this.bf.aFloat139 + this.bf.aFloat132;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.bf.aFloat132 + this.bf.aFloat139 * (float) arg3 + this.bf.aFloat141 * (float) arg4 + (float) arg5 * this.bf.aFloat130;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt1404 > local32 && local63 < (float) this.anInt1404) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt1415 && (float) this.anInt1415 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt1398 * (this.bf.aFloat134 * (float) arg0 + (float) arg1 * this.bf.aFloat136 + this.bf.aFloat138 * (float) arg2 + this.bf.aFloat137) / local32);
		@Pc(167) int local167 = (int) ((this.bf.aFloat137 + this.bf.aFloat138 * (float) arg5 + this.bf.aFloat134 * (float) arg3 + this.bf.aFloat136 * (float) arg4) * (float) this.anInt1398 / local63);
		if ((float) local135 < this.aFloat30 && this.aFloat30 > (float) local167) {
			local7 |= 0x1;
		} else if (this.aFloat20 < (float) local135 && this.aFloat20 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt1396 * (this.bf.aFloat131 + (float) arg2 * this.bf.aFloat133 + this.bf.aFloat140 * (float) arg1 + (float) arg0 * this.bf.aFloat135) / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt1396 * (this.bf.aFloat131 + this.bf.aFloat135 * (float) arg3 + (float) arg4 * this.bf.aFloat140 + this.bf.aFloat133 * (float) arg5) / local63);
		if ((float) local233 < this.aFloat12 && (float) local265 < this.aFloat12) {
			local7 |= 0x4;
		} else if (this.aFloat32 < (float) local233 && this.aFloat32 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "(I)V")
	private void method1236() {
		this.aFloatArray4[10] = this.aFloat16;
		this.aFloatArray4[14] = this.aFloat27;
		this.aFloat18 = ((float) -this.anInt1415 + this.aFloatArray4[14]) / this.aFloatArray4[10];
		this.aFloat25 = (float) this.anInt1415;
	}

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt1427;
		this.anInt1427 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ck", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method1231(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "()Z")
	@Override
	public boolean method6887() {
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "(I)V")
	private void method1237() {
		if (this.aBoolean106) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean106 = false;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6921(@OriginalArg(0) Class5_Sub14 arg0) {
		this.aNativeHeap1 = ((Class5_Sub14_Sub1) arg0).aNativeHeap4;
		if (this.anInterface17_2 != null) {
			return;
		}
		@Pc(16) Class5_Sub41_Sub1 local16 = new Class5_Sub41_Sub1(80);
		if (this.aBoolean97) {
			local16.method6771(-1.0F);
			local16.method6771(-1.0F);
			local16.method6771(0.0F);
			local16.method6771(0.0F);
			local16.method6771(1.0F);
			local16.method6771(1.0F);
			local16.method6771(-1.0F);
			local16.method6771(0.0F);
			local16.method6771(1.0F);
			local16.method6771(1.0F);
			local16.method6771(1.0F);
			local16.method6771(1.0F);
			local16.method6771(0.0F);
			local16.method6771(1.0F);
			local16.method6771(0.0F);
			local16.method6771(-1.0F);
			local16.method6771(1.0F);
			local16.method6771(0.0F);
			local16.method6771(0.0F);
			local16.method6771(0.0F);
		} else {
			local16.method6768(-1.0F);
			local16.method6768(-1.0F);
			local16.method6768(0.0F);
			local16.method6768(0.0F);
			local16.method6768(1.0F);
			local16.method6768(1.0F);
			local16.method6768(-1.0F);
			local16.method6768(0.0F);
			local16.method6768(1.0F);
			local16.method6768(1.0F);
			local16.method6768(1.0F);
			local16.method6768(1.0F);
			local16.method6768(0.0F);
			local16.method6768(1.0F);
			local16.method6768(0.0F);
			local16.method6768(-1.0F);
			local16.method6768(1.0F);
			local16.method6768(0.0F);
			local16.method6768(0.0F);
			local16.method6768(0.0F);
		}
		this.anInterface17_2 = this.method1223(local16.aByteArray93, false, local16.anInt9230, 20);
		this.aClass79_4 = new Class79(this.anInterface17_2, 5126, 3, 0);
		this.aClass79_3 = new Class79(this.anInterface17_2, 5126, 2, 12);
		this.aClass350_1.method8164(this);
	}

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "()Z")
	@Override
	public boolean method6908() {
		return false;
	}

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "(I)V")
	public void method1238() {
		if (this.anInt1412 != 0) {
			this.anInt1392 &= 0xFFFFFFE0;
			this.anInt1412 = 0;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6912(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6916(arg2, arg3);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(III)V")
	public synchronized void method1239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class5_Sub47 local12 = new Class5_Sub47(arg0);
		local12.aLong307 = (long) arg1;
		this.aClass114_15.method2807(local12);
	}

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "()V")
	@Override
	public void method6959() {
		if (this.aBoolean100) {
			if (this.aClass363_1 != this.anInterface6_1) {
				throw new RuntimeException();
			}
			this.aClass363_1.method8446(0);
			this.aClass363_1.method8446(8);
			this.method1229(this.aClass363_1);
		} else if (this.aBoolean94) {
			this.aClass50_Sub1_1.method5998(0, 0, this.anInt1240, this.anInt1374, 0, 0);
			this.anOpenGL1.setSurface(this.aLong36);
		} else {
			throw new RuntimeException("");
		}
		this.anInt1240 = this.anInt1231;
		this.aClass50_Sub1_1 = null;
		this.anInt1374 = this.anInt1207;
		this.method1238();
		this.method1266();
		this.la();
	}

	@OriginalMember(owner = "client!ck", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(53) float local53;
		if (this.aClass80_Sub2_Sub1_3 == null || arg2 > this.aClass80_Sub2_Sub1_3.anInt8354 || arg3 > this.aClass80_Sub2_Sub1_3.anInt8357) {
			this.aClass80_Sub2_Sub1_3 = Static107.method2042(arg3, this, arg6, arg2);
			this.aClass80_Sub2_Sub1_3.method7150(false, false);
			local41 = this.aClass80_Sub2_Sub1_3.aFloat168;
			local53 = this.aClass80_Sub2_Sub1_3.aFloat169;
		} else {
			this.aClass80_Sub2_Sub1_3.method7151(arg6, arg3, arg2, false, 6406);
			local41 = this.aClass80_Sub2_Sub1_3.aFloat168 * (float) arg3 / (float) this.aClass80_Sub2_Sub1_3.anInt8357;
			local53 = (float) arg2 * this.aClass80_Sub2_Sub1_3.aFloat169 / (float) this.aClass80_Sub2_Sub1_3.anInt8354;
		}
		this.method1225();
		this.method1286(this.aClass80_Sub2_Sub1_3);
		this.method1231(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method1232(arg5);
		this.method1228(34165, 34165);
		this.method1265(0, 768, 34166);
		this.method1265(2, 770, 5890);
		this.method1233(0, 34166);
		this.method1233(2, 5890);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = local143 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(158) float local158 = local146 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local53);
		OpenGL.glVertex2f(local143, local158);
		OpenGL.glTexCoord2f(local41, local53);
		OpenGL.glVertex2f(local151, local158);
		OpenGL.glTexCoord2f(local41, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method1265(0, 768, 5890);
		this.method1265(2, 770, 34166);
		this.method1233(0, 5890);
		this.method1233(2, 34166);
	}

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.bf.aFloat139 * (float) arg0 + this.bf.aFloat141 * (float) arg1 + (float) arg2 * this.bf.aFloat130 + this.bf.aFloat132;
		@Pc(55) float local55 = this.bf.aFloat141 * (float) arg4 + (float) arg3 * this.bf.aFloat139 + this.bf.aFloat130 * (float) arg5 + this.bf.aFloat132;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt1404 && (float) this.anInt1404 > local55) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt1415 && (float) this.anInt1415 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.bf.aFloat137 + (float) arg0 * this.bf.aFloat134 + this.bf.aFloat136 * (float) arg1 + this.bf.aFloat138 * (float) arg2) * (float) this.anInt1398 / (float) arg6);
		@Pc(157) int local157 = (int) (((float) arg4 * this.bf.aFloat136 + (float) arg3 * this.bf.aFloat134 + this.bf.aFloat138 * (float) arg5 + this.bf.aFloat137) * (float) this.anInt1398 / (float) arg6);
		if (this.aFloat30 > (float) local124 && this.aFloat30 > (float) local157) {
			local57 |= 0x1;
		} else if (this.aFloat20 < (float) local124 && this.aFloat20 < (float) local157) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt1396 * (this.bf.aFloat131 + this.bf.aFloat135 * (float) arg0 + this.bf.aFloat140 * (float) arg1 + this.bf.aFloat133 * (float) arg2) / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt1396 * ((float) arg5 * this.bf.aFloat133 + this.bf.aFloat140 * (float) arg4 + (float) arg3 * this.bf.aFloat135 + this.bf.aFloat131) / (float) arg6);
		if (this.aFloat12 > (float) local224 && this.aFloat12 > (float) local257) {
			local57 |= 0x4;
		} else if (this.aFloat32 < (float) local224 && (float) local257 > this.aFloat32) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg5;
		@Pc(9) Class80_Sub2_Sub1 local9 = local6.aClass80_Sub2_Sub1_5;
		this.method1225();
		this.method1286(local6.aClass80_Sub2_Sub1_5);
		this.method1231(1);
		this.method1228(7681, 8448);
		this.method1265(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat169 / (float) local9.anInt8361;
		@Pc(46) float local46 = local9.aFloat168 / (float) local9.anInt8362;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(59) float local59 = (float) arg3 - (float) arg1;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local59 * local59)));
		@Pc(76) float local76 = local53 * local72;
		@Pc(80) float local80 = local59 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local76 + 0.35F, local80 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method1265(0, 768, 5890);
	}

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "(I)V")
	public void method1240() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray5, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray8, 0);
	}

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public Class5_Sub14 method6954(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub14_Sub1 local8 = new Class5_Sub14_Sub1(arg0);
		this.aClass114_10.method2807(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)I")
	@Override
	public int method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)I")
	private int method1241() {
		@Pc(5) int local5 = 0;
		this.aString10 = OpenGL.glGetString(7936).toLowerCase();
		this.aString9 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString10.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString10.indexOf("brian paul") != -1 || this.aString10.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static147.method2668(' ', local46.replace('.', ' '));
		if (local54.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(69) int local69 = Static270.method4173(local54[0]);
				@Pc(75) int local75 = Static270.method4173(local54[1]);
				this.anInt1409 = local69 * 10 + local75;
			} catch (@Pc(85) NumberFormatException local85) {
				local5 |= 0x4;
			}
		}
		if (this.anInt1409 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(119) int[] local119 = new int[1];
		OpenGL.glGetIntegerv(34018, local119, 0);
		this.anInt1397 = local119[0];
		OpenGL.glGetIntegerv(34929, local119, 0);
		this.anInt1425 = local119[0];
		OpenGL.glGetIntegerv(34930, local119, 0);
		this.anInt1405 = local119[0];
		if (this.anInt1397 < 2 || this.anInt1425 < 2 || this.anInt1405 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean97 = Stream.c();
		this.aBoolean94 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean113 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean98 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean93 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean111 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean101 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean112 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean99 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean109 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean102 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean103 = false;
		this.aBoolean100 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean95 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean116 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean119 = this.aBoolean116 & this.aBoolean95;
		this.aBoolean105 = Class383.aString119.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static215.aFloatArray78, 0);
		this.aFloat15 = Static215.aFloatArray78[0];
		this.aFloat29 = Static215.aFloatArray78[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
	private void method1242() {
		this.anOpenGL1.b();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!no;Z)V")
	public void method1243(@OriginalArg(0) Class254_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method5932(), 0);
	}

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "(I)V")
	@Override
	public void method6956(@OriginalArg(0) int arg0) {
		this.method1219();
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(II)Lclient!ic;")
	@Override
	public Interface9 method6939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(Z)Lclient!maa;")
	public Class80_Sub4 method1244() {
		return this.aClass57_Sub2_1 == null ? null : this.aClass57_Sub2_1.method5798();
	}

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt1407;
		arg0[0] = this.anInt1426;
		arg0[2] = this.anInt1418;
		arg0[3] = this.anInt1402;
	}

	@OriginalMember(owner = "client!ck", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt1406, this.anInt1424, this.anInt1398, this.anInt1396 };
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6928(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas1 == arg0) {
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

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "()V")
	@Override
	public void method6961() {
		if (this.aClass5_Sub34_Sub1_1 != null && this.aClass5_Sub34_Sub1_1.method4736()) {
			this.aClass193_1.method4876(this.aClass5_Sub34_Sub1_1);
			this.aClass279_1.method6512();
		}
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)V")
	private void method1245() {
		if (this.aBoolean114 && this.anInt1394 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6918(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class5_Sub47 local19;
		while (!this.aClass114_12.method2810()) {
			local19 = (Class5_Sub47) this.aClass114_12.method2813();
			Static154.anIntArray134[local7++] = (int) local19.aLong307;
			this.anInt1389 -= local19.anInt8308;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static154.anIntArray134, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static154.anIntArray134, 0);
			local7 = 0;
		}
		while (!this.aClass114_13.method2810()) {
			local19 = (Class5_Sub47) this.aClass114_13.method2813();
			Static154.anIntArray134[local7++] = (int) local19.aLong307;
			this.anInt1387 -= local19.anInt8308;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static154.anIntArray134, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static154.anIntArray134, 0);
			local7 = 0;
		}
		while (!this.aClass114_14.method2810()) {
			local19 = (Class5_Sub47) this.aClass114_14.method2813();
			Static154.anIntArray134[local7++] = local19.anInt8308;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static154.anIntArray134, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static154.anIntArray134, 0);
			local7 = 0;
		}
		while (!this.aClass114_15.method2810()) {
			local19 = (Class5_Sub47) this.aClass114_15.method2813();
			Static154.anIntArray134[local7++] = (int) local19.aLong307;
			this.anInt1388 -= local19.anInt8308;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static154.anIntArray134, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static154.anIntArray134, 0);
		}
		while (!this.aClass114_11.method2810()) {
			local19 = (Class5_Sub47) this.aClass114_11.method2813();
			OpenGL.glDeleteLists((int) local19.aLong307, local19.anInt8308);
		}
		@Pc(216) Class5 local216;
		while (!this.aClass114_16.method2810()) {
			local216 = this.aClass114_16.method2813();
			OpenGL.glDeleteProgramARB((int) local216.aLong307);
		}
		while (!this.aClass114_17.method2810()) {
			local216 = this.aClass114_17.method2813();
			OpenGL.glDeleteObjectARB(local216.aLong307);
		}
		while (!this.aClass114_11.method2810()) {
			local19 = (Class5_Sub47) this.aClass114_11.method2813();
			OpenGL.glDeleteLists((int) local19.aLong307, local19.anInt8308);
		}
		this.aClass279_1.method6511();
		if (this.E() > 100663296 && Static547.method7619() > this.aLong37 + 60000L) {
			System.gc();
			this.aLong37 = Static547.method7619();
		}
		this.anInt1383 = local11;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)V")
	public void method1246(@OriginalArg(0) int arg0) {
		this.method1271(true, arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6932(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6946(@OriginalArg(0) Canvas arg0) {
		this.aLong36 = 0L;
		this.aCanvas2 = null;
		if (arg0 == null || this.aCanvas1 == arg0) {
			this.aLong36 = this.aLong35;
			this.aCanvas2 = this.aCanvas1;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable2.get(arg0);
			this.aLong36 = local26;
			this.aCanvas2 = arg0;
		}
		if (this.aCanvas2 == null || this.aLong36 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong36);
		this.method1300();
	}

	@OriginalMember(owner = "client!ck", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int[] local8 = new int[arg2 * arg3];
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, this.anInt1374 - arg1 - local10, arg2, 1, 32993, this.anInt1410, local8, local10 * arg2);
		}
		return local8;
	}

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "(I)V")
	private void method1247() {
		if (this.anInt1412 != 3) {
			this.anInt1412 = 3;
			this.method1274();
			this.method1280();
			this.anInt1392 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "(I)V")
	private void method1248() {
		this.aFloat17 = (float) (this.anInt1415 - this.anInt1414) - this.aFloat14;
		this.aFloat31 = this.aFloat17 - this.aFloat19 * (float) this.anInt1394;
		if ((float) this.anInt1404 > this.aFloat31) {
			this.aFloat31 = (float) this.anInt1404;
		}
		OpenGL.glFogf(2915, this.aFloat31);
		OpenGL.glFogf(2916, this.aFloat17);
		Static215.aFloatArray78[2] = (float) (this.anInt1399 & 0xFF) / 255.0F;
		Static215.aFloatArray78[0] = (float) (this.anInt1399 & 0xFF0000) / 1.671168E7F;
		Static215.aFloatArray78[1] = (float) (this.anInt1399 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static215.aFloatArray78, 0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)V")
	public void method1249(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean96 != arg0) {
			this.aBoolean96 = arg0;
			this.method1264();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!wq;)V")
	@Override
	public void method6899(@OriginalArg(0) Class392 arg0) {
		this.aClass350_1.method8168(this, -1, arg0);
	}

	@OriginalMember(owner = "client!ck", name = "A", descriptor = "()V")
	@Override
	public void method6963() {
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
	@Override
	public void method6913() {
	}

	@OriginalMember(owner = "client!ck", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1402 > arg3) {
			this.anInt1402 = arg3;
		}
		if (this.anInt1426 < arg0) {
			this.anInt1426 = arg0;
		}
		if (arg1 > this.anInt1407) {
			this.anInt1407 = arg1;
		}
		if (arg2 < this.anInt1418) {
			this.anInt1418 = arg2;
		}
		OpenGL.glEnable(3089);
		this.method1296();
		this.method1259();
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)V")
	public void method1250() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!dk;B)V")
	public void method1251(@OriginalArg(0) Interface6 arg0) {
		if (this.anInt1384 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt1384 >= 0) {
			this.anInterface6Array1[this.anInt1384].method8443();
		}
		this.anInterface6_2 = this.anInterface6Array1[++this.anInt1384] = arg0;
		this.anInterface6_2.method8440();
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(Z)V")
	private void method1252() {
		@Pc(11) int local11;
		for (local11 = 0; local11 < this.anInt1422; local11++) {
			@Pc(17) Class5_Sub18 local17 = this.aClass5_Sub18Array1[local11];
			Static76.aFloatArray1[0] = (float) local17.method8055();
			@Pc(28) int local28 = local11 + 16386;
			Static76.aFloatArray1[1] = (float) local17.method8051();
			Static76.aFloatArray1[2] = (float) local17.method8057();
			Static76.aFloatArray1[3] = 1.0F;
			OpenGL.glLightfv(local28, 4611, Static76.aFloatArray1, 0);
			@Pc(55) int local55 = local17.method8058();
			@Pc(61) float local61 = local17.method8054() / 255.0F;
			Static76.aFloatArray1[0] = (float) (local55 >> 16 & 0xFF) * local61;
			Static76.aFloatArray1[2] = local61 * (float) (local55 & 0xFF);
			Static76.aFloatArray1[1] = (float) (local55 >> 8 & 0xFF) * local61;
			OpenGL.glLightfv(local28, 4609, Static76.aFloatArray1, 0);
			OpenGL.glLightf(local28, 4617, 1.0F / (float) (local17.method8056() * local17.method8056()));
			OpenGL.glEnable(local28);
		}
		while (this.anInt1419 > local11) {
			OpenGL.glDisable(local11 + 16386);
			local11++;
		}
		this.anInt1419 = this.anInt1422;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IFF)V")
	public void method1253(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat19 = arg0;
		this.aFloat14 = arg1;
		this.method1248();
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)V")
	private void method1254() {
		this.method1246(-2);
		for (@Pc(12) int local12 = this.anInt1397 - 1; local12 >= 0; local12--) {
			this.method1256(local12);
			this.method1286((Class80) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method1228(8448, 8448);
		this.method1265(2, 770, 34168);
		this.method1237();
		this.anInt1391 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt1390 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean90 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean91 = true;
		this.method1234(true);
		this.method1285(true);
		this.method1289(true);
		this.method1297(true);
		this.method1238();
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
		@Pc(127) float[] local127 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(129) int local129 = 0; local129 < 8; local129++) {
			@Pc(134) int local134 = local129 + 16384;
			OpenGL.glLightfv(local134, 4608, local127, 0);
			OpenGL.glLightf(local134, 4615, 0.0F);
			OpenGL.glLightf(local134, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt1423 = this.anInt1399 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(III)V")
	public synchronized void method1255(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub47 local8 = new Class5_Sub47(arg0);
		local8.aLong307 = (long) arg1;
		this.aClass114_12.method2807(local8);
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(IZ)V")
	public void method1256(@OriginalArg(0) int arg0) {
		if (this.anInt1416 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt1416 = arg0;
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IB)I")
	public int method1257(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!dea;Lclient!dea;Lclient!dea;Lclient!dea;I)V")
	public void method1258(@OriginalArg(0) Class79 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) Class79 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method1269(arg0.anInterface17_4);
			OpenGL.glVertexPointer(arg0.aByte18, arg0.aShort12, this.anInterface17_3.method6470(), this.anInterface17_3.method6467() + (long) arg0.aByte17);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method1269(arg3.anInterface17_4);
			OpenGL.glNormalPointer(arg3.aShort12, this.anInterface17_3.method6470(), this.anInterface17_3.method6467() + (long) arg3.aByte17);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method1269(arg2.anInterface17_4);
			OpenGL.glColorPointer(arg2.aByte18, arg2.aShort12, this.anInterface17_3.method6470(), this.anInterface17_3.method6467() + (long) arg2.aByte17);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method1269(arg1.anInterface17_4);
			OpenGL.glTexCoordPointer(arg1.aByte18, arg1.aShort12, this.anInterface17_3.method6470(), this.anInterface17_3.method6467() + (long) arg1.aByte17);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "(I)V")
	private void method1259() {
		if (this.anInt1418 >= this.anInt1426 && this.anInt1407 <= this.anInt1402) {
			OpenGL.glScissor(this.anInt1426 + this.anInt1408, -this.anInt1402 + this.anInt1374 + this.anInt1411, this.anInt1418 - this.anInt1426, -this.anInt1407 + this.anInt1402);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "()V")
	@Override
	protected void method6904() {
		for (@Pc(8) Class5 local8 = this.aClass114_10.method2805(); local8 != null; local8 = this.aClass114_10.method2814()) {
			((Class5_Sub14_Sub1) local8).method2081();
		}
		if (this.aClass193_1 != null) {
			this.aClass193_1.method4877();
		}
		if (this.anOpenGL1 != null) {
			this.method1242();
			@Pc(37) Enumeration local37 = this.aHashtable2.keys();
			while (local37.hasMoreElements()) {
				@Pc(42) Canvas local42 = (Canvas) local37.nextElement();
				@Pc(48) Long local48 = (Long) this.aHashtable2.get(local42);
				this.anOpenGL1.releaseSurface(local42, local48);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean88) {
			Static358.method5409(true, false);
			this.aBoolean88 = false;
		}
	}

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "(II)V")
	public synchronized void method1260(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub47 local8 = new Class5_Sub47(arg0);
		this.aClass114_14.method2807(local8);
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(II)V")
	@Override
	public void method6916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "(I)V")
	public void method1261() {
		if (this.anInt1392 == 8) {
			return;
		}
		this.method1263();
		this.method1234(true);
		this.method1289(true);
		this.method1297(true);
		this.method1231(1);
		this.anInt1392 = 8;
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(III)V")
	public void method1262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1411 = arg1;
		this.anInt1408 = arg0;
		this.method1266();
		this.method1259();
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "()Z")
	@Override
	public boolean method6884() {
		return this.aClass5_Sub34_Sub1_1 != null && (this.anInt1377 <= 1 || this.aBoolean119);
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(Z)V")
	private void method1263() {
		if (this.anInt1412 != 2) {
			this.anInt1412 = 2;
			this.method1293();
			this.method1280();
			this.anInt1392 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ck", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1282();
		this.method1231(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "(I)V")
	private void method1264() {
		if (this.aBoolean104 && !this.aBoolean96) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ck", name = "x", descriptor = "()Lclient!oha;")
	@Override
	public Class254 method6955() {
		return new Class254_Sub1();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIB)V")
	public void method1265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "()V")
	@Override
	public void method6910() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([IIIIIZ)Lclient!pu;")
	@Override
	public Class50 method6933(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class50_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass193_1.method4870(arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!ck", name = "x", descriptor = "(I)V")
	private void method1266() {
		OpenGL.glViewport(this.anInt1408, this.anInt1411, this.anInt1240, this.anInt1374);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6888(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static439.aFloat159 = arg0;
		Static385.aFloat128 = arg2;
		Static77.aFloat10 = arg1;
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "()Z")
	@Override
	public boolean method6889() {
		return this.aClass342_1.method8006();
	}

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "(I)V")
	private void method1267() {
		this.aClass80Array1 = new Class80[this.anInt1397];
		this.aClass80_Sub2_1 = new Class80_Sub2(this, 3553, 6408, 1, 1);
		new Class80_Sub2(this, 3553, 6408, 1, 1);
		new Class80_Sub2(this, 3553, 6408, 1, 1);
		this.aClass153_Sub2_6 = new Class153_Sub2(this);
		this.aClass153_Sub2_8 = new Class153_Sub2(this);
		this.aClass153_Sub2_5 = new Class153_Sub2(this);
		this.aClass153_Sub2_7 = new Class153_Sub2(this);
		this.aClass153_Sub2_1 = new Class153_Sub2(this);
		this.aClass153_Sub2_2 = new Class153_Sub2(this);
		this.aClass153_Sub2_10 = new Class153_Sub2(this);
		this.aClass153_Sub2_3 = new Class153_Sub2(this);
		this.aClass153_Sub2_4 = new Class153_Sub2(this);
		this.aClass153_Sub2_9 = new Class153_Sub2(this);
		if (this.aBoolean100) {
			this.aClass363_2 = new Class363(this);
			new Class363(this);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(15) Class1_Sub1 local15 = (Class1_Sub1) arg5;
		@Pc(18) Class80_Sub2_Sub1 local18 = local15.aClass80_Sub2_Sub1_5;
		this.method1225();
		this.method1286(local15.aClass80_Sub2_Sub1_5);
		this.method1231(1);
		this.method1228(7681, 8448);
		this.method1265(0, 768, 34167);
		@Pc(48) float local48 = local18.aFloat169 / (float) local18.anInt8361;
		@Pc(55) float local55 = local18.aFloat168 / (float) local18.anInt8362;
		@Pc(61) float local61 = (float) arg2 - (float) arg0;
		@Pc(68) float local68 = (float) -arg1 + (float) arg3;
		@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local61 * local61 + local68 * local68)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(100) float local100 = local61 * local81;
		@Pc(104) float local104 = local68 * local81;
		@Pc(111) int local111 = arg10 % (arg9 + arg8);
		@Pc(116) float local116 = (float) arg8 * local100;
		@Pc(121) float local121 = (float) arg8 * local104;
		@Pc(123) float local123 = 0.0F;
		@Pc(125) float local125 = 0.0F;
		@Pc(127) float local127 = local116;
		@Pc(129) float local129 = local121;
		if (arg8 >= local111) {
			local129 = (float) (arg8 - local111) * local104;
			local127 = local100 * (float) (arg8 - local111);
		} else {
			local125 = (float) (arg8 + arg9 - local111) * local104;
			local123 = (float) (arg9 + arg8 - local111) * local100;
		}
		@Pc(180) float local180 = local123 + (float) arg0 + 0.35F;
		@Pc(187) float local187 = (float) arg1 + local125 + 0.35F;
		@Pc(192) float local192 = (float) arg9 * local100;
		@Pc(197) float local197 = local104 * (float) arg9;
		while (true) {
			if (arg0 < arg2) {
				if ((float) arg2 + 0.35F < local180) {
					break;
				}
				if ((float) arg2 < local180 + local127) {
					local127 = (float) arg2 - local180;
				}
			} else {
				if ((float) arg2 + 0.35F > local180) {
					break;
				}
				if (local180 + local127 < (float) arg2) {
					local127 = (float) arg2 - local180;
				}
			}
			if (arg3 > arg1) {
				if ((float) arg3 + 0.35F < local187) {
					break;
				}
				if ((float) arg3 < local129 + local187) {
					local129 = (float) arg3 - local187;
				}
			} else {
				if (local187 < (float) arg3 + 0.35F) {
					break;
				}
				if (local187 + local129 < (float) arg3) {
					local129 = (float) arg3 - local187;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local48 * (local180 - (float) arg6), local55 * ((float) -arg7 + local187));
			OpenGL.glVertex2f(local180, local187);
			OpenGL.glTexCoord2f(local48 * (local180 + local127 - (float) arg6), (local187 + local129 - (float) arg7) * local55);
			OpenGL.glVertex2f(local180 + local127, local187 + local129);
			local187 += local129 + local197;
			local180 += local127 + local192;
			OpenGL.glEnd();
			local129 = local121;
			local127 = local116;
		}
		this.method1265(0, 768, 5890);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6941(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas1 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ck", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1395 = arg3;
		this.anInt1420 = arg0;
		this.anInt1401 = arg1;
		this.aBoolean117 = true;
		this.anInt1400 = arg2;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZZ)V")
	public void method1268(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt1413 || this.aBoolean117 != this.aBoolean118) {
			@Pc(18) Class80_Sub2 local18 = null;
			@Pc(20) int local20 = 0;
			@Pc(22) byte local22 = 0;
			@Pc(24) int local24 = 0;
			@Pc(31) int local31 = this.aBoolean117 ? 3 : 0;
			if (arg0 < 0) {
				this.method1237();
			} else {
				local18 = this.aClass279_1.method6510(arg0);
				@Pc(49) Class136 local49 = super.anInterface4_11.method358(arg0);
				if (local49.aByte52 == 0 && local49.aByte53 == 0) {
					this.method1237();
				} else {
					@Pc(65) int local65 = local49.aBoolean312 ? 64 : 128;
					@Pc(69) int local69 = local65 * 50;
					this.method1226((float) (local49.aByte53 * (this.anInt1383 % local69)) / (float) local69, (float) (this.anInt1383 % local69 * local49.aByte52) / (float) local69, 0.0F);
				}
				local20 = local49.anInt3868;
				if (!this.aBoolean117) {
					local22 = local49.aByte57;
					local24 = local49.anInt3864;
					local31 = local49.aByte56;
				}
			}
			this.aClass342_1.method8005(local24, local22, arg2, arg1, local31);
			if (!this.aClass342_1.method8007(local18, local20)) {
				this.method1286(local18);
				this.method1290(local20);
			}
			this.aBoolean118 = this.aBoolean117;
			this.anInt1413 = arg0;
		}
		this.anInt1392 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "()Lclient!fga;")
	@Override
	public Class118 method6878() {
		@Pc(7) int local7 = -1;
		if (this.aString10.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString10.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString10.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class118(local7, "OpenGL", this.anInt1409, this.aString9, 0L);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!nk;)V")
	public void method1269(@OriginalArg(1) Interface17 arg0) {
		if (this.anInterface17_3 != arg0) {
			if (this.aBoolean113) {
				OpenGL.glBindBufferARB(34962, arg0.method6468());
			}
			this.anInterface17_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1399 == arg0 && this.anInt1394 == arg1 && arg2 == this.anInt1414) {
			return;
		}
		this.anInt1414 = arg2;
		this.anInt1399 = arg0;
		this.anInt1394 = arg1;
		this.method1248();
		this.method1245();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZII)V")
	public void method1271(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method1268(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "(B)V")
	private void method1272() {
		Static215.aFloatArray78[0] = this.aFloat23 * this.aFloat26;
		Static215.aFloatArray78[2] = this.aFloat26 * this.aFloat24;
		Static215.aFloatArray78[1] = this.aFloat22 * this.aFloat26;
		Static215.aFloatArray78[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static215.aFloatArray78, 0);
		Static215.aFloatArray78[0] = -this.aFloat28 * this.aFloat23;
		Static215.aFloatArray78[3] = 1.0F;
		Static215.aFloatArray78[1] = -this.aFloat28 * this.aFloat22;
		Static215.aFloatArray78[2] = -this.aFloat28 * this.aFloat24;
		OpenGL.glLightfv(16385, 4609, Static215.aFloatArray78, 0);
	}

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "()Z")
	@Override
	public boolean method6929() {
		if (this.aClass5_Sub34_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass5_Sub34_Sub1_1.method4736()) {
			if (!this.aClass193_1.method4873(this.aClass5_Sub34_Sub1_1)) {
				return false;
			}
			this.aClass279_1.method6512();
		}
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!su;IIII)Lclient!ka;")
	@Override
	public Class153 method6964(@OriginalArg(0) Class329 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class153_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLclient!dk;)V")
	public void method1273(@OriginalArg(1) Interface6 arg0) {
		if (this.anInt1384 < 0 || this.anInterface6Array1[this.anInt1384] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface6Array1[this.anInt1384--] = null;
		arg0.method8443();
		if (this.anInt1384 >= 0) {
			this.anInterface6_2 = this.anInterface6Array1[this.anInt1384];
			this.anInterface6_2.method8440();
		} else {
			this.anInterface6_2 = null;
		}
	}

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "(B)V")
	private void method1274() {
		@Pc(21) float local21 = (float) -this.anInt1406 * this.aFloat21 / (float) this.anInt1398;
		@Pc(33) float local33 = (float) -this.anInt1424 * this.aFloat21 / (float) this.anInt1396;
		@Pc(48) float local48 = this.aFloat21 * (float) (this.anInt1240 - this.anInt1406) / (float) this.anInt1398;
		@Pc(63) float local63 = (float) (this.anInt1374 - this.anInt1424) * this.aFloat21 / (float) this.anInt1396;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local21 != local48 && local33 != local63) {
			OpenGL.glOrtho((double) local21, (double) local48, (double) -local63, (double) -local33, (double) this.anInt1404, (double) this.anInt1415);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "()Z")
	@Override
	public boolean method6896() {
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
	@Override
	public void method6944(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLclient!dk;)V")
	public void method1275(@OriginalArg(1) Interface6 arg0) {
		if (this.anInt1386 < 0 || this.anInterface6Array3[this.anInt1386] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface6Array3[this.anInt1386--] = null;
		arg0.method8444();
		if (this.anInt1386 >= 0) {
			this.anInterface6_1 = this.anInterface6Array3[this.anInt1386];
			this.anInterface6_1.method8441();
		} else {
			this.anInterface6_1 = null;
		}
	}

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "()V")
	@Override
	public void method6909() {
		if (!this.aBoolean108 || this.anInt1240 <= 0 || this.anInt1374 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt1426;
		@Pc(19) int local19 = this.anInt1418;
		@Pc(22) int local22 = this.anInt1407;
		@Pc(25) int local25 = this.anInt1402;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method1238();
		this.method1234(false);
		this.method1285(false);
		this.method1289(false);
		this.method1297(false);
		this.method1286((Class80) null);
		this.method1246(-2);
		this.method1290(1);
		this.method1231(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt1240, this.anInt1374, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([I)V")
	@Override
	public void method6945(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1240;
		arg0[1] = this.anInt1374;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[Lclient!gu;)V")
	@Override
	public void method6926(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub18[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			this.aClass5_Sub18Array1[local5] = arg1[local5];
		}
		this.anInt1422 = arg0;
		if (this.anInt1412 != 1) {
			this.method1252();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(FFFFI)V")
	public void method1276(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static215.aFloatArray78[2] = arg0;
		Static215.aFloatArray78[1] = arg1;
		Static215.aFloatArray78[0] = arg3;
		Static215.aFloatArray78[3] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static215.aFloatArray78, 0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(JZ)V")
	public synchronized void method1277(@OriginalArg(0) long arg0) {
		@Pc(7) Class5 local7 = new Class5();
		local7.aLong307 = arg0;
		this.aClass114_17.method2807(local7);
	}

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "(B)V")
	private void method1278() {
		OpenGL.glDepthMask(this.aBoolean92 && this.aBoolean115);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BF)V")
	public void method1279(@OriginalArg(1) float arg0) {
		if (this.aFloat21 != arg0) {
			this.aFloat21 = arg0;
			if (this.anInt1412 == 3) {
				this.method1274();
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1282();
		this.method1231(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(Z)V")
	private void method1280() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass254_Sub1_3.method5932(), 0);
		if (this.aBoolean118) {
			this.aClass342_1.aClass231_Sub4_1.method6551();
		}
		this.method1240();
		this.method1252();
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "()Z")
	@Override
	public boolean method6883() {
		return false;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!wq;I)V")
	@Override
	public void method6897(@OriginalArg(0) Class392 arg0, @OriginalArg(1) int arg1) {
		this.aClass350_1.method8168(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILclient!jaclib/memory/Buffer;ZB)Lclient!nk;")
	public Interface17 method1281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		return (Interface17) (this.aBoolean113 ? new Class165_Sub1(this, arg0, arg2, arg1, false) : new Class274_Sub1(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "(I)V")
	private void method1282() {
		if (this.anInt1392 == 1) {
			return;
		}
		this.method1294();
		this.method1234(false);
		this.method1285(false);
		this.method1289(false);
		this.method1297(false);
		this.method1286((Class80) null);
		this.method1246(-2);
		this.method1290(1);
		this.anInt1392 = 1;
	}

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "()Lclient!oha;")
	@Override
	public Class254 method6903() {
		return this.aClass254_Sub1_1;
	}

	@OriginalMember(owner = "client!ck", name = "A", descriptor = "(I)V")
	public void method1283() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!tea;)V")
	@Override
	public void method6905(@OriginalArg(0) Class57 arg0) {
		this.aClass57_Sub2_1 = (Class57_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "()Z")
	@Override
	public boolean method6917() {
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method1297(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "()V")
	@Override
	public void method6940() {
		this.aClass193_1.method4875();
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method6895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method1282();
		this.method1231(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean98) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean98) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "()Z")
	@Override
	public boolean method6934() {
		return this.aClass5_Sub34_Sub1_1 != null && this.aClass5_Sub34_Sub1_1.method4736();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)V")
	public synchronized void method1284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class5_Sub47 local19 = new Class5_Sub47(arg0);
		local19.aLong307 = (long) arg1;
		this.aClass114_13.method2807(local19);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(ZI)V")
	public void method1285(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean104) {
			this.aBoolean104 = arg0;
			this.method1264();
			this.anInt1392 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!od;Lclient!ic;)Lclient!md;")
	@Override
	public Interface15 method6942(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface9 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "()Z")
	@Override
	public boolean method6927() {
		return this.aBoolean98 && (!this.method6934() || this.aBoolean119);
	}

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean115 = arg0;
		this.method1278();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLclient!wj;)V")
	public void method1286(@OriginalArg(1) Class80 arg0) {
		@Pc(9) Class80 local9 = this.aClass80Array1[this.anInt1416];
		if (arg0 != local9) {
			if (arg0 == null) {
				OpenGL.glDisable(local9.anInt8338);
			} else {
				if (local9 == null) {
					OpenGL.glEnable(arg0.anInt8338);
				} else if (arg0.anInt8338 != local9.anInt8338) {
					OpenGL.glDisable(local9.anInt8338);
					OpenGL.glEnable(arg0.anInt8338);
				}
				OpenGL.glBindTexture(arg0.anInt8338, arg0.method7133());
			}
			this.aClass80Array1[this.anInt1416] = arg0;
		}
		this.anInt1392 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt1404;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!tea;Lclient!tea;FLclient!tea;)Lclient!tea;")
	@Override
	public Class57 method6949(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class57 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean109 && this.aBoolean100) {
			@Pc(15) Class57_Sub2_Sub2 local15 = null;
			@Pc(18) Class57_Sub2 local18 = (Class57_Sub2) arg0;
			@Pc(21) Class57_Sub2 local21 = (Class57_Sub2) arg1;
			@Pc(25) Class80_Sub4 local25 = local18.method5798();
			@Pc(29) Class80_Sub4 local29 = local21.method5798();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local29.anInt6519 >= local25.anInt6519 ? local29.anInt6519 : local25.anInt6519;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class57_Sub2_Sub2) {
					@Pc(60) Class57_Sub2_Sub2 local60 = (Class57_Sub2_Sub2) arg3;
					if (local60.method5801() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class57_Sub2_Sub2(this, local48);
				}
				if (local15.method5804(arg2, local29, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ck", name = "B", descriptor = "(I)V")
	private void method1287() {
		Static215.aFloatArray78[0] = this.aFloat23 * this.aFloat13;
		Static215.aFloatArray78[1] = this.aFloat22 * this.aFloat13;
		Static215.aFloatArray78[2] = this.aFloat13 * this.aFloat24;
		Static215.aFloatArray78[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static215.aFloatArray78, 0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIZ)Lclient!pu;")
	@Override
	public Class50 method6936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class50_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!no;I)V")
	public void method1288(@OriginalArg(0) Class254_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method5932(), 0);
	}

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "()Z")
	@Override
	public boolean method6947() {
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
	@Override
	public void method6914(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZB)V")
	public void method1289(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean89 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean89 = arg0;
		this.anInt1392 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)V")
	public void method1290(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method1228(7681, 7681);
		} else if (arg0 == 0) {
			this.method1228(8448, 8448);
		} else if (arg0 == 2) {
			this.method1228(34165, 7681);
		} else if (arg0 == 3) {
			this.method1228(260, 8448);
		} else if (arg0 == 4) {
			this.method1228(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!ck", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt1426 = 0;
		this.anInt1402 = this.anInt1374;
		this.anInt1407 = 0;
		this.anInt1418 = this.anInt1240;
		OpenGL.glDisable(3089);
		this.method1296();
	}

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt1428;
		this.anInt1428 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.bf.aFloat132 + (float) arg2 * this.bf.aFloat130 + this.bf.aFloat139 * (float) arg0 + this.bf.aFloat141 * (float) arg1;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt1398 * (this.bf.aFloat134 * (float) arg0 + this.bf.aFloat136 * (float) arg1 + this.bf.aFloat138 * (float) arg2 + this.bf.aFloat137) / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat30);
		@Pc(118) int local118 = (int) ((float) this.anInt1396 * ((float) arg2 * this.bf.aFloat133 + (float) arg1 * this.bf.aFloat140 + (float) arg0 * this.bf.aFloat135 + this.bf.aFloat131) / local28);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local118 - this.aFloat12);
	}

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V")
	@Override
	public void method6931(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!pm;IZII)V")
	public void method1291(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg0.method9045();
		@Pc(14) int local14 = arg2 * this.method1227(local7);
		this.method1230(arg0);
		OpenGL.glDrawElements(4, arg1, local7, (long) local14 + arg0.method9042());
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZ[BI)Lclient!pm;")
	public Interface23 method1292(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2) {
		return (Interface23) (this.aBoolean113 && (!arg1 || this.aBoolean110) ? new Class165_Sub2(this, 5123, arg2, arg0, arg1) : new Class274_Sub2(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method1282();
		this.method1231(1);
		@Pc(26) float local26 = (float) -arg0 + (float) arg2;
		@Pc(32) float local32 = (float) arg3 - (float) arg1;
		@Pc(45) float local45 = (float) (1.0D / Math.sqrt((double) (local26 * local26 + local32 * local32)));
		@Pc(49) float local49 = local32 * local45;
		@Pc(53) float local53 = local26 * local45;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(74) int local74 = arg7 % (arg5 + arg6);
		@Pc(79) float local79 = local53 * (float) arg5;
		@Pc(84) float local84 = local49 * (float) arg5;
		@Pc(86) float local86 = 0.0F;
		@Pc(88) float local88 = 0.0F;
		@Pc(90) float local90 = local79;
		@Pc(92) float local92 = local84;
		if (local74 > arg5) {
			local86 = (float) (arg6 + arg5 - local74) * local53;
			local88 = local49 * (float) (arg5 + arg6 - local74);
		} else {
			local90 = local53 * (float) (arg5 - local74);
			local92 = local49 * (float) (arg5 - local74);
		}
		@Pc(143) float local143 = local86 + (float) arg0 + 0.35F;
		@Pc(150) float local150 = (float) arg1 + local88 + 0.35F;
		@Pc(155) float local155 = (float) arg6 * local53;
		@Pc(160) float local160 = local49 * (float) arg6;
		while (true) {
			if (arg2 > arg0) {
				if (local143 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local90 + local143) {
					local90 = (float) arg2 - local143;
				}
			} else {
				if (local143 < (float) arg2 + 0.35F) {
					break;
				}
				if (local90 + local143 < (float) arg2) {
					local90 = (float) arg2 - local143;
				}
			}
			if (arg3 <= arg1) {
				if (local150 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local92 + local150) {
					local92 = (float) arg3 - local150;
				}
			} else {
				if (local150 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local92 + local150) {
					local92 = (float) arg3 - local150;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local143, local150);
			OpenGL.glVertex2f(local90 + local143, local150 + local92);
			OpenGL.glEnd();
			local143 += local90 + local155;
			local150 += local92 + local160;
			local90 = local79;
			local92 = local84;
		}
	}

	@OriginalMember(owner = "client!ck", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt1426 > arg0 + arg2 || this.anInt1418 < arg0 - arg2 || arg1 + arg2 < this.anInt1407 || arg1 - arg2 > this.anInt1402) {
			return;
		}
		this.method1282();
		this.method1231(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(75) float local75 = (float) arg0 + 0.35F;
		@Pc(80) float local80 = (float) arg1 + 0.35F;
		@Pc(84) int local84 = arg2 << 1;
		if ((float) local84 < this.aFloat15) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local75 + 1.0F, local80 + 1.0F);
			OpenGL.glVertex2f(local75 + 1.0F, -1.0F + local80);
			OpenGL.glVertex2f(local75 - 1.0F, -1.0F + local80);
			OpenGL.glVertex2f(local75 - 1.0F, local80 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat29 >= (float) local84) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local84);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local75, local80);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local75, local80);
			@Pc(153) int local153 = 262144 / (arg2 * 6);
			if (local153 <= 64) {
				local153 = 64;
			} else if (local153 > 512) {
				local153 = 512;
			}
			local153 = Static180.method2993(local153);
			OpenGL.glVertex2f((float) arg2 + local75, local80);
			for (@Pc(180) int local180 = 16384 - local153; local180 > 0; local180 -= local153) {
				OpenGL.glVertex2f(Class254.aFloatArray85[local180] * (float) arg2 + local75, Class254.aFloatArray86[local180] * (float) arg2 + local80);
			}
			OpenGL.glVertex2f(local75 + (float) arg2, local80);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIF)Lclient!gu;")
	@Override
	public Class5_Sub18 method6919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub18_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "(I)V")
	private void method1293() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray4, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ck", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = (float) arg1 * this.bf.aFloat141 + (float) arg0 * this.bf.aFloat139 + this.bf.aFloat130 * (float) arg2 + this.bf.aFloat132;
		if ((float) this.anInt1404 > local28 || (float) this.anInt1415 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((this.bf.aFloat137 + this.bf.aFloat134 * (float) arg0 + this.bf.aFloat136 * (float) arg1 + (float) arg2 * this.bf.aFloat138) * (float) this.anInt1398 / (float) arg3);
		@Pc(119) int local119 = (int) ((this.bf.aFloat131 + this.bf.aFloat135 * (float) arg0 + (float) arg1 * this.bf.aFloat140 + this.bf.aFloat133 * (float) arg2) * (float) this.anInt1396 / (float) arg3);
		if ((float) local86 >= this.aFloat30 && this.aFloat20 >= (float) local86 && (float) local119 >= this.aFloat12 && (float) local119 <= this.aFloat32) {
			arg4[0] = (int) ((float) local86 - this.aFloat30);
			arg4[1] = (int) ((float) local119 - this.aFloat12);
			arg4[2] = (int) local28;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "()I")
	@Override
	public int method6892() {
		return 4;
	}

	@OriginalMember(owner = "client!ck", name = "D", descriptor = "(I)V")
	private void method1294() {
		if (this.anInt1412 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt1240 > 0 && this.anInt1374 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt1240, (double) this.anInt1374, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt1392 &= 0xFFFFFFE7;
		this.anInt1412 = 1;
	}

	@OriginalMember(owner = "client!ck", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1240 < arg2) {
			arg2 = this.anInt1240;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt1374) {
			arg3 = this.anInt1374;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt1407 = arg1;
		this.anInt1426 = arg0;
		this.anInt1402 = arg3;
		this.anInt1418 = arg2;
		OpenGL.glEnable(3089);
		this.method1296();
		this.method1259();
	}

	@OriginalMember(owner = "client!ck", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1396 = arg3;
		this.anInt1398 = arg2;
		this.anInt1406 = arg0;
		this.anInt1424 = arg1;
		this.method1224();
		this.method1296();
		if (this.anInt1412 == 3) {
			this.method1274();
		} else if (this.anInt1412 == 2) {
			this.method1293();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!ne;[Lclient!vi;Z)Lclient!da;")
	@Override
	public Class73 method6886(@OriginalArg(0) Class247 arg0, @OriginalArg(1) Class369[] arg1) {
		return new Class73_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(ILclient!dk;)V")
	public void method1295(@OriginalArg(1) Interface6 arg0) {
		if (this.anInt1386 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt1386 >= 0) {
			this.anInterface6Array3[this.anInt1386].method8444();
		}
		this.anInterface6_1 = this.anInterface6Array3[++this.anInt1386] = arg0;
		this.anInterface6_1.method8441();
	}

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "()Z")
	@Override
	public boolean method6930() {
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "(B)V")
	private void method1296() {
		this.aFloat30 = (float) (this.anInt1426 - this.anInt1406);
		this.aFloat20 = (float) (this.anInt1418 - this.anInt1406);
		this.aFloat32 = (float) (this.anInt1402 - this.anInt1424);
		this.aFloat12 = (float) (this.anInt1407 - this.anInt1424);
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1404 == arg0 && arg1 == this.anInt1415) {
			return;
		}
		this.anInt1404 = arg0;
		this.anInt1415 = arg1;
		this.method1224();
		this.method1248();
		if (this.anInt1412 == 3) {
			this.method1274();
			return;
		}
		if (this.anInt1412 != 2) {
			return;
		}
		this.method1293();
	}

	@OriginalMember(owner = "client!ck", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.bf.aFloat130 + this.bf.aFloat139 * (float) arg0 + (float) arg1 * this.bf.aFloat141 + this.bf.aFloat132;
		if ((float) this.anInt1404 > local28 || local28 > (float) this.anInt1415) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.bf.aFloat137 + (float) arg2 * this.bf.aFloat138 + this.bf.aFloat136 * (float) arg1 + (float) arg0 * this.bf.aFloat134) * (float) this.anInt1398 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt1396 * ((float) arg1 * this.bf.aFloat140 + this.bf.aFloat135 * (float) arg0 + this.bf.aFloat133 * (float) arg2 + this.bf.aFloat131) / local28);
		if ((float) local85 >= this.aFloat30 && this.aFloat20 >= (float) local85 && (float) local117 >= this.aFloat12 && (float) local117 <= this.aFloat32) {
			arg3[0] = (int) ((float) local85 - this.aFloat30);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat12);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BZ)V")
	public void method1297(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean92 != arg0) {
			this.aBoolean92 = arg0;
			this.method1278();
			this.anInt1392 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ck", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method1282();
		this.method1231(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean98) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean98) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZIII)V")
	public void method1298(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!dk;I)V")
	public void method1299(@OriginalArg(0) Interface6 arg0) {
		if (this.aBoolean95) {
			this.method1251(arg0);
			this.method1295(arg0);
		} else if (this.anInt1385 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt1385 >= 0) {
				this.anInterface6Array2[this.anInt1385].method8442();
			}
			this.anInterface6_2 = this.anInterface6_1 = this.anInterface6Array2[++this.anInt1385] = arg0;
			this.anInterface6_2.method8439();
		}
	}

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "(I)V")
	private void method1300() {
		if (this.aCanvas2 == null) {
			this.anInt1231 = this.anInt1207 = 0;
		} else {
			@Pc(13) Dimension local13 = this.aCanvas2.getSize();
			this.anInt1231 = local13.width;
			this.anInt1207 = local13.height;
		}
		if (this.anInterface6_1 == null) {
			this.anInt1374 = this.anInt1207;
			this.anInt1240 = this.anInt1231;
			this.method1266();
		}
		this.method1238();
		this.la();
	}

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt1389 + this.anInt1387 + this.anInt1388;
	}

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "(II)I")
	public int method1301(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class109 method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class109_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}
}
