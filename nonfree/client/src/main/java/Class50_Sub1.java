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

@OriginalClass("client!da")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!da", name = "Pb", descriptor = "I")
	private int anInt1294;

	@OriginalMember(owner = "client!da", name = "Gc", descriptor = "I")
	public int anInt1334;

	@OriginalMember(owner = "client!da", name = "Jc", descriptor = "I")
	private int anInt1337;

	@OriginalMember(owner = "client!da", name = "Td", descriptor = "I")
	public int anInt1397;

	@OriginalMember(owner = "client!da", name = "je", descriptor = "I")
	public int anInt1403;

	@OriginalMember(owner = "client!da", name = "me", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!da", name = "se", descriptor = "Lclient!em;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!da", name = "ue", descriptor = "Lclient!em;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!da", name = "ve", descriptor = "I")
	public int anInt1408;

	@OriginalMember(owner = "client!da", name = "we", descriptor = "I")
	private int anInt1409;

	@OriginalMember(owner = "client!da", name = "xe", descriptor = "I")
	public int anInt1410;

	@OriginalMember(owner = "client!da", name = "Ge", descriptor = "I")
	public int anInt1411;

	@OriginalMember(owner = "client!da", name = "He", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!da", name = "Ie", descriptor = "[Lclient!ac;")
	private Class4[] aClass4Array1;

	@OriginalMember(owner = "client!da", name = "Je", descriptor = "Lclient!gm;")
	public Class63_Sub2 aClass63_Sub2_1;

	@OriginalMember(owner = "client!da", name = "Le", descriptor = "Z")
	private boolean aBoolean77;

	@OriginalMember(owner = "client!da", name = "Me", descriptor = "Lclient!gm;")
	public Class63_Sub2 aClass63_Sub2_2;

	@OriginalMember(owner = "client!da", name = "Ne", descriptor = "Z")
	public boolean aBoolean78;

	@OriginalMember(owner = "client!da", name = "Pe", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!da", name = "Re", descriptor = "I")
	private int anInt1414;

	@OriginalMember(owner = "client!da", name = "Ue", descriptor = "I")
	public int anInt1416;

	@OriginalMember(owner = "client!da", name = "Ve", descriptor = "Z")
	public boolean aBoolean80;

	@OriginalMember(owner = "client!da", name = "Ye", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!da", name = "Ze", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!da", name = "af", descriptor = "I")
	private int anInt1417;

	@OriginalMember(owner = "client!da", name = "bf", descriptor = "Z")
	public boolean bf;

	@OriginalMember(owner = "client!da", name = "cf", descriptor = "Lclient!gm;")
	public Class63_Sub2 aClass63_Sub2_3;

	@OriginalMember(owner = "client!da", name = "df", descriptor = "F")
	private float aFloat22;

	@OriginalMember(owner = "client!da", name = "gf", descriptor = "Lclient!gm;")
	public Class63_Sub2 aClass63_Sub2_4;

	@OriginalMember(owner = "client!da", name = "hf", descriptor = "Lclient!gm;")
	public Class63_Sub2 aClass63_Sub2_5;

	@OriginalMember(owner = "client!da", name = "lf", descriptor = "Z")
	public boolean aBoolean85;

	@OriginalMember(owner = "client!da", name = "mf", descriptor = "Lclient!oq;")
	public Class34_Sub1 aClass34_Sub1_3;

	@OriginalMember(owner = "client!da", name = "vf", descriptor = "Lclient!gm;")
	public Class63_Sub2 aClass63_Sub2_6;

	@OriginalMember(owner = "client!da", name = "xf", descriptor = "I")
	private int anInt1423;

	@OriginalMember(owner = "client!da", name = "yf", descriptor = "F")
	private float aFloat25;

	@OriginalMember(owner = "client!da", name = "zf", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!da", name = "Bf", descriptor = "Z")
	private boolean aBoolean87;

	@OriginalMember(owner = "client!da", name = "Ef", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!da", name = "Ff", descriptor = "F")
	private float aFloat27;

	@OriginalMember(owner = "client!da", name = "Gf", descriptor = "Lclient!al;")
	private Class4_Sub1_Sub1 aClass4_Sub1_Sub1_1;

	@OriginalMember(owner = "client!da", name = "Hf", descriptor = "I")
	public int anInt1427;

	@OriginalMember(owner = "client!da", name = "If", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!da", name = "Jf", descriptor = "Lclient!gg;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!da", name = "Kf", descriptor = "Lclient!gg;")
	private Interface4 anInterface4_3;

	@OriginalMember(owner = "client!da", name = "Nf", descriptor = "Z")
	public boolean aBoolean89;

	@OriginalMember(owner = "client!da", name = "Of", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!da", name = "Pf", descriptor = "Z")
	private boolean aBoolean90;

	@OriginalMember(owner = "client!da", name = "Sf", descriptor = "Lclient!er;")
	public Class71 aClass71_4;

	@OriginalMember(owner = "client!da", name = "Vf", descriptor = "Z")
	public boolean aBoolean91;

	@OriginalMember(owner = "client!da", name = "Wf", descriptor = "Lclient!ma;")
	private Class30_Sub1 aClass30_Sub1_1;

	@OriginalMember(owner = "client!da", name = "Xf", descriptor = "Lclient!af;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!da", name = "Zf", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!da", name = "ag", descriptor = "I")
	public int anInt1431;

	@OriginalMember(owner = "client!da", name = "bg", descriptor = "Z")
	private boolean aBoolean93;

	@OriginalMember(owner = "client!da", name = "cg", descriptor = "I")
	private int anInt1432;

	@OriginalMember(owner = "client!da", name = "dg", descriptor = "Lclient!er;")
	public Class71 aClass71_5;

	@OriginalMember(owner = "client!da", name = "eg", descriptor = "Lclient!oq;")
	public Class34_Sub1 aClass34_Sub1_4;

	@OriginalMember(owner = "client!da", name = "gg", descriptor = "Lclient!gm;")
	public Class63_Sub2 aClass63_Sub2_7;

	@OriginalMember(owner = "client!da", name = "hg", descriptor = "Z")
	private boolean aBoolean94;

	@OriginalMember(owner = "client!da", name = "ig", descriptor = "Lclient!gm;")
	public Class63_Sub2 aClass63_Sub2_8;

	@OriginalMember(owner = "client!da", name = "jg", descriptor = "I")
	private int anInt1433;

	@OriginalMember(owner = "client!da", name = "lg", descriptor = "I")
	private int anInt1435;

	@OriginalMember(owner = "client!da", name = "mg", descriptor = "I")
	private int anInt1436;

	@OriginalMember(owner = "client!da", name = "qg", descriptor = "Z")
	private boolean aBoolean95;

	@OriginalMember(owner = "client!da", name = "rg", descriptor = "Z")
	private boolean aBoolean96;

	@OriginalMember(owner = "client!da", name = "sg", descriptor = "Z")
	private boolean aBoolean97;

	@OriginalMember(owner = "client!da", name = "vg", descriptor = "I")
	private int anInt1439;

	@OriginalMember(owner = "client!da", name = "xg", descriptor = "Lclient!sq;")
	public Class4_Sub1 aClass4_Sub1_3;

	@OriginalMember(owner = "client!da", name = "yg", descriptor = "Z")
	public boolean aBoolean99;

	@OriginalMember(owner = "client!da", name = "Ag", descriptor = "I")
	private int anInt1442;

	@OriginalMember(owner = "client!da", name = "Bg", descriptor = "Z")
	private boolean aBoolean100;

	@OriginalMember(owner = "client!da", name = "Dg", descriptor = "Z")
	private boolean aBoolean101;

	@OriginalMember(owner = "client!da", name = "Eg", descriptor = "Lclient!vn;")
	public Class260 aClass260_3;

	@OriginalMember(owner = "client!da", name = "Fg", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!da", name = "Hg", descriptor = "I")
	private int anInt1443;

	@OriginalMember(owner = "client!da", name = "Jg", descriptor = "Z")
	public boolean aBoolean102;

	@OriginalMember(owner = "client!da", name = "Kg", descriptor = "I")
	private int anInt1444;

	@OriginalMember(owner = "client!da", name = "Lg", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!da", name = "Qg", descriptor = "Lclient!gm;")
	public Class63_Sub2 aClass63_Sub2_9;

	@OriginalMember(owner = "client!da", name = "Rg", descriptor = "Lclient!gm;")
	public Class63_Sub2 aClass63_Sub2_10;

	@OriginalMember(owner = "client!da", name = "Wg", descriptor = "I")
	private int anInt1448;

	@OriginalMember(owner = "client!da", name = "Xg", descriptor = "I")
	private int anInt1449;

	@OriginalMember(owner = "client!da", name = "fc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!da", name = "Ud", descriptor = "I")
	public int anInt1398 = 128;

	@OriginalMember(owner = "client!da", name = "ae", descriptor = "Lclient!bh;")
	private final Class25 aClass25_1 = new Class25();

	@OriginalMember(owner = "client!da", name = "ee", descriptor = "Lclient!oq;")
	private final Class34_Sub1 aClass34_Sub1_1 = new Class34_Sub1();

	@OriginalMember(owner = "client!da", name = "fe", descriptor = "Lclient!oq;")
	public final Class34_Sub1 aClass34_Sub1_2 = new Class34_Sub1();

	@OriginalMember(owner = "client!da", name = "he", descriptor = "I")
	public int anInt1402 = 8;

	@OriginalMember(owner = "client!da", name = "ge", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!da", name = "ke", descriptor = "I")
	public int anInt1404 = 3;

	@OriginalMember(owner = "client!da", name = "ie", descriptor = "Lclient!mf;")
	private final Class163 aClass163_5 = new Class163();

	@OriginalMember(owner = "client!da", name = "pe", descriptor = "I")
	private int anInt1406 = -1;

	@OriginalMember(owner = "client!da", name = "oe", descriptor = "[Lclient!em;")
	private final Interface3[] anInterface3Array1 = new Interface3[4];

	@OriginalMember(owner = "client!da", name = "re", descriptor = "I")
	private int anInt1407 = -1;

	@OriginalMember(owner = "client!da", name = "qe", descriptor = "[Lclient!em;")
	private final Interface3[] anInterface3Array2 = new Interface3[4];

	@OriginalMember(owner = "client!da", name = "ne", descriptor = "I")
	private int anInt1405 = -1;

	@OriginalMember(owner = "client!da", name = "te", descriptor = "[Lclient!em;")
	private final Interface3[] anInterface3Array3 = new Interface3[4];

	@OriginalMember(owner = "client!da", name = "ye", descriptor = "Lclient!mf;")
	private final Class163 aClass163_6;

	@OriginalMember(owner = "client!da", name = "ze", descriptor = "Lclient!mf;")
	private final Class163 aClass163_7;

	@OriginalMember(owner = "client!da", name = "Ae", descriptor = "Lclient!mf;")
	private final Class163 aClass163_8;

	@OriginalMember(owner = "client!da", name = "Be", descriptor = "Lclient!mf;")
	private final Class163 aClass163_9;

	@OriginalMember(owner = "client!da", name = "Ce", descriptor = "Lclient!mf;")
	private final Class163 aClass163_10;

	@OriginalMember(owner = "client!da", name = "De", descriptor = "Lclient!mf;")
	private final Class163 aClass163_11;

	@OriginalMember(owner = "client!da", name = "Ee", descriptor = "Lclient!mf;")
	private final Class163 aClass163_12;

	@OriginalMember(owner = "client!da", name = "Se", descriptor = "I")
	public int anInt1415;

	@OriginalMember(owner = "client!da", name = "Xe", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!da", name = "pf", descriptor = "[F")
	public final float[] aFloatArray8;

	@OriginalMember(owner = "client!da", name = "uf", descriptor = "I")
	private int anInt1421;

	@OriginalMember(owner = "client!da", name = "Oe", descriptor = "I")
	private int anInt1413;

	@OriginalMember(owner = "client!da", name = "Mf", descriptor = "[F")
	private final float[] aFloatArray10;

	@OriginalMember(owner = "client!da", name = "Tf", descriptor = "F")
	private float aFloat28;

	@OriginalMember(owner = "client!da", name = "nf", descriptor = "[F")
	private final float[] aFloatArray7;

	@OriginalMember(owner = "client!da", name = "Qe", descriptor = "F")
	private float aFloat18;

	@OriginalMember(owner = "client!da", name = "Lf", descriptor = "[F")
	private final float[] aFloatArray9;

	@OriginalMember(owner = "client!da", name = "Qf", descriptor = "I")
	private int anInt1428;

	@OriginalMember(owner = "client!da", name = "rf", descriptor = "I")
	public int anInt1419;

	@OriginalMember(owner = "client!da", name = "qf", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!da", name = "wf", descriptor = "I")
	public int anInt1422;

	@OriginalMember(owner = "client!da", name = "Fe", descriptor = "F")
	public float aFloat16;

	@OriginalMember(owner = "client!da", name = "Af", descriptor = "I")
	public int anInt1424;

	@OriginalMember(owner = "client!da", name = "og", descriptor = "F")
	private float aFloat31;

	@OriginalMember(owner = "client!da", name = "Df", descriptor = "I")
	public int anInt1426;

	@OriginalMember(owner = "client!da", name = "kg", descriptor = "I")
	private int anInt1434;

	@OriginalMember(owner = "client!da", name = "Uf", descriptor = "I")
	public int anInt1430;

	@OriginalMember(owner = "client!da", name = "Rf", descriptor = "I")
	private int anInt1429;

	@OriginalMember(owner = "client!da", name = "zg", descriptor = "I")
	private int anInt1441;

	@OriginalMember(owner = "client!da", name = "tg", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!da", name = "wg", descriptor = "I")
	public int anInt1440;

	@OriginalMember(owner = "client!da", name = "Gg", descriptor = "[F")
	private final float[] aFloatArray11;

	@OriginalMember(owner = "client!da", name = "ng", descriptor = "I")
	public int anInt1437;

	@OriginalMember(owner = "client!da", name = "of", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!da", name = "fg", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!da", name = "tf", descriptor = "I")
	public int anInt1420;

	@OriginalMember(owner = "client!da", name = "kf", descriptor = "I")
	private int anInt1418;

	@OriginalMember(owner = "client!da", name = "Mg", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!da", name = "Ng", descriptor = "Z")
	private boolean aBoolean103;

	@OriginalMember(owner = "client!da", name = "pg", descriptor = "I")
	private int anInt1438;

	@OriginalMember(owner = "client!da", name = "Cf", descriptor = "I")
	public int anInt1425;

	@OriginalMember(owner = "client!da", name = "Cg", descriptor = "[Lclient!bk;")
	private final Class10_Sub4[] aClass10_Sub4Array3;

	@OriginalMember(owner = "client!da", name = "Og", descriptor = "I")
	private int anInt1445;

	@OriginalMember(owner = "client!da", name = "Pg", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!da", name = "Sg", descriptor = "I")
	private int anInt1446;

	@OriginalMember(owner = "client!da", name = "Tg", descriptor = "I")
	public int anInt1447;

	@OriginalMember(owner = "client!da", name = "Ig", descriptor = "Lclient!cb;")
	public Class10_Sub8_Sub1 aClass10_Sub8_Sub1_2;

	@OriginalMember(owner = "client!da", name = "Ug", descriptor = "[I")
	public int[] anIntArray107;

	@OriginalMember(owner = "client!da", name = "Yg", descriptor = "[B")
	public final byte[] aByteArray11;

	@OriginalMember(owner = "client!da", name = "Vg", descriptor = "[I")
	public int[] anIntArray108;

	@OriginalMember(owner = "client!da", name = "Zg", descriptor = "[I")
	public int[] anIntArray109;

	@OriginalMember(owner = "client!da", name = "Zd", descriptor = "I")
	public final int anInt1399;

	@OriginalMember(owner = "client!da", name = "jc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas4;

	@OriginalMember(owner = "client!da", name = "hb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!da", name = "Bd", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!da", name = "Gb", descriptor = "J")
	private final long aLong42;

	@OriginalMember(owner = "client!da", name = "ub", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!da", name = "Ke", descriptor = "I")
	public final int anInt1412;

	@OriginalMember(owner = "client!da", name = "jf", descriptor = "Z")
	public boolean aBoolean84;

	@OriginalMember(owner = "client!da", name = "Te", descriptor = "Z")
	private boolean aBoolean79;

	@OriginalMember(owner = "client!da", name = "ff", descriptor = "Z")
	public boolean aBoolean83;

	@OriginalMember(owner = "client!da", name = "Yf", descriptor = "Z")
	public boolean aBoolean92;

	@OriginalMember(owner = "client!da", name = "sf", descriptor = "Z")
	public boolean aBoolean86;

	@OriginalMember(owner = "client!da", name = "We", descriptor = "Z")
	private boolean aBoolean81;

	@OriginalMember(owner = "client!da", name = "ug", descriptor = "Z")
	public boolean aBoolean98;

	@OriginalMember(owner = "client!da", name = "ef", descriptor = "Z")
	private final boolean aBoolean82;

	@OriginalMember(owner = "client!da", name = "Wd", descriptor = "Lclient!qf;")
	public final Class200 aClass200_1;

	@OriginalMember(owner = "client!da", name = "le", descriptor = "Lclient!tr;")
	public final Class242 aClass242_1;

	@OriginalMember(owner = "client!da", name = "Vd", descriptor = "Lclient!sp;")
	private final Class228 aClass228_1;

	@OriginalMember(owner = "client!da", name = "Xd", descriptor = "Lclient!ci;")
	private Class10_Sub10_Sub1 aClass10_Sub10_Sub1_1;

	@OriginalMember(owner = "client!da", name = "be", descriptor = "Lclient!pi;")
	private final Class188 aClass188_1;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;ILclient!lt;)V")
	public Class50_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class159 arg4) {
		super(arg0, arg2);
		new Class136();
		new Class167(16);
		this.aClass163_6 = new Class163();
		this.aClass163_7 = new Class163();
		this.aClass163_8 = new Class163();
		this.aClass163_9 = new Class163();
		this.aClass163_10 = new Class163();
		this.aClass163_11 = new Class163();
		this.aClass163_12 = new Class163();
		this.anInt1415 = 0;
		this.aFloat19 = 3584.0F;
		this.aFloatArray8 = new float[4];
		this.anInt1421 = -1;
		this.anInt1413 = 0;
		this.aFloatArray10 = new float[4];
		this.aFloat28 = 1.0F;
		this.aFloatArray7 = new float[16];
		this.aFloat18 = 0.0F;
		this.aFloatArray9 = new float[4];
		this.anInt1428 = -1;
		this.anInt1419 = 3584;
		this.aFloat24 = 1.0F;
		this.anInt1422 = 0;
		this.aFloat16 = 3584.0F;
		this.anInt1424 = -1;
		this.aFloat31 = 1.0F;
		this.anInt1426 = -1;
		this.anInt1434 = 0;
		this.anInt1430 = 0;
		this.anInt1429 = 0;
		this.anInt1441 = 0;
		this.aFloat32 = 1.0F;
		this.anInt1440 = 50;
		this.aFloatArray11 = new float[4];
		this.anInt1437 = 512;
		this.aFloat23 = 1.0F;
		this.aFloat30 = -1.0F;
		this.anInt1420 = 512;
		this.anInt1418 = 0;
		this.aFloat35 = -1.0F;
		this.aBoolean103 = true;
		this.anInt1438 = 0;
		this.anInt1425 = -1;
		this.aClass10_Sub4Array3 = new Class10_Sub4[Static74.anInt1520];
		this.anInt1445 = 8448;
		this.aFloat36 = 3000.0F;
		this.anInt1446 = 8448;
		this.anInt1447 = 0;
		this.aClass10_Sub8_Sub1_2 = new Class10_Sub8_Sub1(8192);
		this.anIntArray107 = new int[1];
		this.aByteArray11 = new byte[16384];
		this.anIntArray108 = new int[1];
		this.anIntArray109 = new int[1];
		this.anInt1399 = arg3;
		this.aCanvas3 = this.aCanvas4 = arg1;
		try {
			if (Static381.aBoolean305 == null || !Static381.aBoolean305) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static381.aBoolean305 = Boolean.TRUE;
				} else {
					@Pc(268) String local268 = System.getProperty("os.name").toLowerCase();
					if (!local268.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local268.startsWith("linux") || local268.startsWith("sunos")) {
						System.load(arg4.method3497("libjaggl.so").toString());
					} else if (local268.startsWith("mac")) {
						System.load(arg4.method3497("libjaggl.jnilib").toString());
					} else if (local268.startsWith("win")) {
						System.load(arg4.method3497("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static381.aBoolean305 = Boolean.TRUE;
				}
			}
			if (Static381.aBoolean305 == null || !Static381.aBoolean305) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong41 = this.aLong42 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt1399);
			if (this.aLong42 == 0L) {
				throw new RuntimeException("");
			}
			this.method1249();
			@Pc(375) int local375 = this.method1326();
			if (local375 != 0) {
				throw new RuntimeException("");
			}
			this.anInt1412 = this.aBoolean99 ? 33639 : 5121;
			@Pc(402) int local402;
			if (this.aString8.indexOf("radeon") != -1) {
				local402 = 0;
				@Pc(404) boolean local404 = false;
				@Pc(406) boolean local406 = false;
				@Pc(415) String[] local415 = Static253.method3686(' ', this.aString8.replace('/', ' '));
				for (@Pc(417) int local417 = 0; local417 < local415.length; local417++) {
					@Pc(423) String local423 = local415[local417];
					try {
						if (local423.length() > 0) {
							if (local423.charAt(0) == 'x' && local423.length() >= 3 && Static223.method3363(local423.substring(1, 3))) {
								local406 = true;
								local423 = local423.substring(1);
							}
							if (local423.equals("hd")) {
								local404 = true;
							} else {
								if (local423.startsWith("hd")) {
									local404 = true;
									local423 = local423.substring(2);
								}
								if (local423.length() >= 4 && Static223.method3363(local423.substring(0, 4))) {
									local402 = Static335.method4519(local423.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(492) Exception local492) {
					}
				}
				if (!local404 || local402 < 4000) {
					this.aBoolean84 = false;
				}
				if (!local406 && !local404) {
					if (local402 >= 7000 && local402 <= 7999) {
						this.aBoolean79 = false;
					}
					if (local402 >= 7000 && local402 <= 9250) {
						this.aBoolean83 = false;
					}
				}
				this.aBoolean92 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean86 = true;
				this.aBoolean81 = this.aBoolean79;
			}
			if (this.aString9.indexOf("intel") != -1) {
				this.aBoolean98 = false;
			}
			this.aBoolean82 = !this.aString9.equals("s3 graphics");
			if (this.aBoolean79) {
				try {
					@Pc(571) int[] local571 = new int[1];
					OpenGL.glGenBuffersARB(1, local571, 0);
				} catch (@Pc(577) Throwable local577) {
					throw new RuntimeException("");
				}
			}
			Static154.method2633(true, false);
			this.aBoolean76 = true;
			this.aClass200_1 = new Class200(this, super.anInterface7_8);
			this.method1321();
			this.aClass242_1 = new Class242(this);
			this.aClass228_1 = new Class228(this);
			if (this.aClass228_1.method5008()) {
				this.aClass10_Sub10_Sub1_1 = new Class10_Sub10_Sub1(this);
				if (!this.aClass10_Sub10_Sub1_1.method913()) {
					this.aClass10_Sub10_Sub1_1.method907();
					this.aClass10_Sub10_Sub1_1 = null;
				}
			}
			this.aClass188_1 = new Class188(this);
			this.method1262();
			this.method1286();
			OpenGL.glClear(16640);
			local402 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(656) Exception local656) {
					if (local402++ > 5) {
						throw new RuntimeException("");
					}
					Static328.method5696(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(676) Throwable local676) {
			local676.printStackTrace();
			this.method5841();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!da", name = "u", descriptor = "()Z")
	@Override
	public boolean method5860() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
	@Override
	public int method5822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIF)Lclient!bk;")
	@Override
	public Class10_Sub4 method5872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class10_Sub4_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	@Override
	public void method5837(@OriginalArg(0) boolean arg0) {
		this.aBoolean103 = arg0;
		this.method1281();
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(I)V")
	private void method1249() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static328.method5696(1000L);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	public void method1251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1418 = arg1;
		this.anInt1438 = arg0;
		this.method1314();
		this.method1315();
	}

	@OriginalMember(owner = "client!da", name = "z", descriptor = "()V")
	@Override
	public void method5877() {
		if (!this.aBoolean82 || this.anInt1397 <= 0 || this.anInt1334 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt1413;
		@Pc(25) int local25 = this.anInt1434;
		@Pc(28) int local28 = this.anInt1441;
		@Pc(31) int local31 = this.anInt1429;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method1323();
		this.method1273(false);
		this.method1298(false);
		this.method1293(false);
		this.method1331(false);
		this.method1295(null);
		this.method1318(-2);
		this.method1256(1);
		this.method1279(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt1397, this.anInt1334, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ba(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(IIII)V")
	@Override
	public void method5849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass228_1.method5005(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
	@Override
	public void method5868(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "t", descriptor = "()Z")
	@Override
	public boolean method5859() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V")
	public void method1252(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean101) {
			this.aBoolean101 = arg0;
			this.method1263();
		}
	}

	@OriginalMember(owner = "client!da", name = "m", descriptor = "()V")
	@Override
	public void method5844() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[BZ)Lclient!gg;")
	public Interface4 method1253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		return (Interface4) (this.aBoolean79 && (!arg3 || this.aBoolean81) ? new Class69_Sub2(this, arg1, arg2, arg0, arg3) : new Class26_Sub2(this, arg1, arg2, arg0));
	}

	@OriginalMember(owner = "client!da", name = "A", descriptor = "()Z")
	@Override
	public boolean method5881() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "i", descriptor = "(I)V")
	private void method1254() {
		this.aFloat20 = this.anInt1441 - this.anInt1422;
		this.aFloat21 = this.anInt1413 - this.anInt1447;
		this.aFloat17 = this.anInt1429 - this.anInt1422;
		this.aFloat33 = this.anInt1434 - this.anInt1447;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
	@Override
	public void method5866(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V")
	public void method1256(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method1316(7681, 7681);
		} else if (arg0 == 0) {
			this.method1316(8448, 8448);
		} else if (arg0 == 2) {
			this.method1316(34165, 7681);
		} else if (arg0 == 3) {
			this.method1316(260, 8448);
		} else if (arg0 == 4) {
			this.method1316(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
	private void method1257() {
		if (this.aFloat29 == 0.0F) {
			this.aFloatArray7[14] = this.aFloat25;
			this.aFloatArray7[10] = this.aFloat27;
		} else {
			@Pc(13) float local13 = this.aFloat36 / (this.aFloat29 + this.aFloat36);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = (1.0F - local13) * (1.0F - local13) * -this.aFloat25 / this.aFloat29;
			this.aFloatArray7[14] = this.aFloat25 * local17;
			this.aFloatArray7[10] = local32 + this.aFloat27;
		}
		this.aFloat19 = ((float) -this.anInt1419 + this.aFloatArray7[14]) / this.aFloatArray7[10];
		this.aFloat16 = (float) this.anInt1419 - this.aFloat29;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(II)V")
	public synchronized void method1258(@OriginalArg(0) int arg0) {
		@Pc(8) Class10_Sub12 local8 = new Class10_Sub12(arg0);
		this.aClass163_9.method3613(local8);
	}

	@OriginalMember(owner = "client!da", name = "j", descriptor = "(I)V")
	private void method1259() {
		@Pc(15) float local15 = this.aFloat31 * (float) -this.anInt1447 / (float) this.anInt1437;
		@Pc(27) float local27 = (float) -this.anInt1422 * this.aFloat31 / (float) this.anInt1420;
		@Pc(42) float local42 = (float) (this.anInt1397 - this.anInt1447) * this.aFloat31 / (float) this.anInt1437;
		@Pc(57) float local57 = this.aFloat31 * (float) (this.anInt1334 - this.anInt1422) / (float) this.anInt1420;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local57 != local27) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) ((float) this.anInt1440 - this.aFloat29), (double) ((float) this.anInt1419 - this.aFloat29));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(Z)V")
	public void method1260() {
		if (this.anInt1423 == 4) {
			return;
		}
		this.method1306();
		this.method1273(false);
		this.method1298(false);
		this.method1293(false);
		this.method1331(false);
		this.method1318(-2);
		this.method1279(1);
		this.method1256(0);
		this.anInt1423 = 4;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!qg;Lclient!qg;FLclient!qg;)Lclient!qg;")
	@Override
	public Class30 method5847(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class30 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean102 && this.aBoolean98) {
			@Pc(15) Class30_Sub1_Sub1 local15 = null;
			@Pc(18) Class30_Sub1 local18 = (Class30_Sub1) arg0;
			@Pc(21) Class30_Sub1 local21 = (Class30_Sub1) arg1;
			@Pc(25) Class4_Sub2 local25 = local18.method3802();
			@Pc(29) Class4_Sub2 local29 = local21.method3802();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt1545 < local25.anInt1545 ? local25.anInt1545 : local29.anInt1545;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class30_Sub1_Sub1) {
					@Pc(56) Class30_Sub1_Sub1 local56 = (Class30_Sub1_Sub1) arg3;
					if (local44 == local56.method558()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class30_Sub1_Sub1(this, local44);
				}
				if (local15.method559(local29, local25, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!da", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.method1279(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!em;)V")
	public void method1261(@OriginalArg(1) Interface3 arg0) {
		if (this.anInt1407 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt1407 >= 0) {
			this.anInterface3Array1[this.anInt1407].method5728();
		}
		this.anInterface3_2 = this.anInterface3Array1[++this.anInt1407] = arg0;
		this.anInterface3_2.method5724();
	}

	@OriginalMember(owner = "client!da", name = "k", descriptor = "(I)V")
	private void method1262() {
		this.method1318(-2);
		for (@Pc(14) int local14 = this.anInt1416 - 1; local14 >= 0; local14--) {
			this.method1300(local14);
			this.method1295(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method1316(8448, 8448);
		this.method1309(2, 34168, 770);
		this.method1287();
		this.anInt1436 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt1417 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean87 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean96 = true;
		this.method1273(true);
		this.method1298(true);
		this.method1293(true);
		this.method1331(true);
		this.method1323();
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
		@Pc(134) float[] local134 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(136) int local136 = 0; local136 < 8; local136++) {
			@Pc(142) int local142 = local136 + 16384;
			OpenGL.glLightfv(local142, 4608, local134, 0);
			OpenGL.glLightf(local142, 4615, 0.0F);
			OpenGL.glLightf(local142, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt1428 = this.anInt1424 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!pn;IIII)Lclient!e;")
	@Override
	public Class63 method5864(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class63_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!e;Lclient!ip;Lclient!c;Lclient!pr;I)V")
	@Override
	public void method5845(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class40_Sub8 arg3) {
		arg0.method6090(arg2, arg3, 0);
		this.method5855(arg1);
	}

	@OriginalMember(owner = "client!da", name = "l", descriptor = "(I)V")
	private void method1263() {
		if (this.aBoolean93 && !this.aBoolean101) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!da", name = "m", descriptor = "(I)V")
	private void method1264() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass34_Sub1_4.method4151(), 0);
		if (this.aBoolean91) {
			this.aClass188_1.aClass29_Sub8_1.method4047();
		}
		this.method1327();
		this.method1288();
	}

	@OriginalMember(owner = "client!da", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(49) float local49;
		if (this.aClass4_Sub1_Sub1_1 == null || arg2 > this.aClass4_Sub1_Sub1_1.anInt199 || arg3 > this.aClass4_Sub1_Sub1_1.anInt208) {
			this.aClass4_Sub1_Sub1_1 = Static141.method2403(arg2, this, arg6, arg3);
			this.aClass4_Sub1_Sub1_1.method154(false, false);
			local45 = this.aClass4_Sub1_Sub1_1.aFloat3;
			local49 = this.aClass4_Sub1_Sub1_1.aFloat4;
		} else {
			this.aClass4_Sub1_Sub1_1.method156(arg2, false, 6406, arg3, arg6);
			local49 = (float) arg2 * this.aClass4_Sub1_Sub1_1.aFloat4 / (float) this.aClass4_Sub1_Sub1_1.anInt199;
			local45 = this.aClass4_Sub1_Sub1_1.aFloat3 * (float) arg3 / (float) this.aClass4_Sub1_Sub1_1.anInt208;
		}
		this.method1271();
		this.method1295(this.aClass4_Sub1_Sub1_1);
		this.method1279(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method1278(arg5);
		this.method1316(34165, 34165);
		this.method1309(0, 34166, 768);
		this.method1309(2, 5890, 770);
		this.method1275(34166, 0);
		this.method1275(5890, 2);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = (float) arg2 + local151;
		OpenGL.glBegin(7);
		@Pc(166) float local166 = local154 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local49);
		OpenGL.glVertex2f(local151, local166);
		OpenGL.glTexCoord2f(local45, local49);
		OpenGL.glVertex2f(local159, local166);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method1309(0, 5890, 768);
		this.method1309(2, 34166, 770);
		this.method1275(5890, 0);
		this.method1275(34166, 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()Z")
	@Override
	public boolean method5808() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt1428;
		if (local11 || this.aFloat35 != arg1 || arg2 != this.aFloat30) {
			this.aFloat35 = arg1;
			this.anInt1428 = arg0;
			this.aFloat30 = arg2;
			if (local11) {
				this.aFloat23 = (float) (this.anInt1428 & 0xFF0000) / 1.671168E7F;
				this.aFloat24 = (float) (this.anInt1428 & 0xFF00) / 65280.0F;
				this.aFloat32 = (float) (this.anInt1428 & 0xFF) / 255.0F;
				this.method1297();
			}
			this.method1277();
		}
		if (arg3 == this.aFloatArray9[0] && arg4 == this.aFloatArray9[1] && this.aFloatArray9[2] == arg5) {
			return;
		}
		this.aFloatArray9[2] = arg5;
		this.aFloatArray9[1] = arg4;
		this.aFloatArray9[0] = arg3;
		this.aFloatArray10[2] = -arg5;
		this.aFloatArray10[0] = -arg3;
		this.aFloatArray10[1] = -arg4;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray8[0] = local138 * arg3;
		this.aFloatArray8[2] = arg5 * local138;
		this.aFloatArray8[1] = local138 * arg4;
		this.aFloatArray11[2] = -this.aFloatArray8[2];
		this.aFloatArray11[1] = -this.aFloatArray8[1];
		this.aFloatArray11[0] = -this.aFloatArray8[0];
		this.method1327();
		this.anInt1431 = (int) (arg5 * 256.0F / arg4);
		this.anInt1427 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(B)V")
	public void method1265() {
		if (this.anInt1423 == 8) {
			return;
		}
		this.method1299();
		this.method1273(true);
		this.method1293(true);
		this.method1331(true);
		this.method1279(1);
		this.method1256(0);
		this.anInt1423 = 8;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZ)V")
	public synchronized void method1266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class10_Sub12 local8 = new Class10_Sub12(arg0);
		local8.aLong264 = arg1;
		this.aClass163_10.method3613(local8);
	}

	@OriginalMember(owner = "client!da", name = "n", descriptor = "(I)V")
	private void method1267() {
		if (this.anInt1433 != 3) {
			this.anInt1433 = 3;
			this.method1259();
			this.method1264();
			this.anInt1423 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5818(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class10_Sub12 local19;
		while (!this.aClass163_7.method3617()) {
			local19 = (Class10_Sub12) this.aClass163_7.method3622();
			Static152.anIntArray297[local7++] = (int) local19.aLong264;
			this.anInt1408 -= local19.anInt1159;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static152.anIntArray297, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static152.anIntArray297, 0);
			local7 = 0;
		}
		while (!this.aClass163_8.method3617()) {
			local19 = (Class10_Sub12) this.aClass163_8.method3622();
			Static152.anIntArray297[local7++] = (int) local19.aLong264;
			this.anInt1410 -= local19.anInt1159;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static152.anIntArray297, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static152.anIntArray297, 0);
			local7 = 0;
		}
		while (!this.aClass163_9.method3617()) {
			local19 = (Class10_Sub12) this.aClass163_9.method3622();
			Static152.anIntArray297[local7++] = local19.anInt1159;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static152.anIntArray297, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static152.anIntArray297, 0);
			local7 = 0;
		}
		while (!this.aClass163_10.method3617()) {
			local19 = (Class10_Sub12) this.aClass163_10.method3622();
			Static152.anIntArray297[local7++] = (int) local19.aLong264;
			this.anInt1409 -= local19.anInt1159;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static152.anIntArray297, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static152.anIntArray297, 0);
		}
		while (!this.aClass163_6.method3617()) {
			local19 = (Class10_Sub12) this.aClass163_6.method3622();
			OpenGL.glDeleteLists((int) local19.aLong264, local19.anInt1159);
		}
		@Pc(214) Class10 local214;
		while (!this.aClass163_11.method3617()) {
			local214 = this.aClass163_11.method3622();
			OpenGL.glDeleteProgramARB((int) local214.aLong264);
		}
		while (!this.aClass163_12.method3617()) {
			local214 = this.aClass163_12.method3622();
			OpenGL.glDeleteObjectARB(local214.aLong264);
		}
		while (!this.aClass163_6.method3617()) {
			local19 = (Class10_Sub12) this.aClass163_6.method3622();
			OpenGL.glDeleteLists((int) local19.aLong264, local19.anInt1159);
		}
		this.aClass200_1.method4457();
		if (this.pa() > 100663296 && this.aLong43 + 60000L < Static220.method3314()) {
			System.gc();
			this.aLong43 = Static220.method3314();
		}
		this.anInt1403 = local11;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(II)I")
	public int method1268(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
	@Override
	public boolean method5867() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5812() {
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5827(@OriginalArg(0) Canvas arg0) {
		this.aCanvas3 = null;
		this.aLong41 = 0L;
		if (arg0 == null || this.aCanvas4 == arg0) {
			this.aCanvas3 = this.aCanvas4;
			this.aLong41 = this.aLong42;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable1.get(arg0);
			this.aLong41 = local26;
			this.aCanvas3 = arg0;
		}
		if (this.aCanvas3 == null || this.aLong41 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong41);
		this.method1286();
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(IIII)V")
	public void method1269(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!da", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt1334 - arg1 - local12, arg2, 1, 32993, this.anInt1412, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)I")
	public int method1270(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V")
	public void method1271() {
		if (this.anInt1423 == 2) {
			return;
		}
		this.method1306();
		this.method1273(false);
		this.method1298(false);
		this.method1293(false);
		this.method1331(false);
		this.method1318(-2);
		this.anInt1423 = 2;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	@Override
	public void method5832(@OriginalArg(0) int arg0) {
		this.method1249();
	}

	@OriginalMember(owner = "client!da", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.anInt1409 + this.anInt1408 + this.anInt1410;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5825(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas4) {
			local5 = this.aLong42;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable1.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas3 == arg0) {
			this.method1286();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!gg;B)V")
	public void method1272(@OriginalArg(0) Interface4 arg0) {
		if (this.anInterface4_3 != arg0) {
			if (this.aBoolean79) {
				OpenGL.glBindBufferARB(34962, arg0.method5477());
			}
			this.anInterface4_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class49 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class49_Sub2 local6 = (Class49_Sub2) arg5;
		@Pc(9) Class4_Sub1_Sub1 local9 = local6.aClass4_Sub1_Sub1_5;
		this.method1271();
		this.method1295(local6.aClass4_Sub1_Sub1_5);
		this.method1279(1);
		this.method1316(7681, 8448);
		this.method1309(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat4 / (float) local9.anInt214;
		@Pc(46) float local46 = local9.aFloat3 / (float) local9.anInt216;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method1309(0, 5890, 768);
	}

	@OriginalMember(owner = "client!da", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt1429 = this.anInt1334;
		this.anInt1441 = 0;
		this.anInt1413 = 0;
		this.anInt1434 = this.anInt1397;
		OpenGL.glDisable(3089);
		this.method1254();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZB)V")
	public void method1273(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean97) {
			this.aBoolean97 = arg0;
			this.method1325();
			this.anInt1423 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!da", name = "o", descriptor = "(I)V")
	private void method1274() {
		if (this.anInt1423 == 1) {
			return;
		}
		this.method1306();
		this.method1273(false);
		this.method1298(false);
		this.method1293(false);
		this.method1331(false);
		this.method1295(null);
		this.method1318(-2);
		this.method1256(1);
		this.anInt1423 = 1;
	}

	@OriginalMember(owner = "client!da", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1437 = arg2;
		this.anInt1420 = arg3;
		this.anInt1422 = arg1;
		this.anInt1447 = arg0;
		this.method1294();
		this.method1254();
		if (this.anInt1433 == 3) {
			this.method1259();
		} else if (this.anInt1433 == 2) {
			this.method1319();
		}
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(IIII)V")
	public void method1275(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class34 arg0) {
		this.aClass34_Sub1_4 = (Class34_Sub1) arg0;
		this.aClass34_Sub1_3.method4147(this.aClass34_Sub1_4);
		if (this.anInt1433 != 1) {
			this.method1264();
		}
	}

	@OriginalMember(owner = "client!da", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method1274();
		this.method1279(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean94) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean94) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IJ)V")
	public synchronized void method1276(@OriginalArg(1) long arg0) {
		@Pc(7) Class10 local7 = new Class10();
		local7.aLong264 = arg0;
		this.aClass163_12.method3613(local7);
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()Z")
	@Override
	public boolean method5813() {
		return this.aClass188_1.method4315();
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(IIIIII)Lclient!qg;")
	@Override
	public Class30 method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean102 ? new Class30_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!da", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(6) int local6 = this.anInt1448;
		this.anInt1448 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class80 method5838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class80_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "()V")
	@Override
	public void method5828() {
		if (this.aClass10_Sub10_Sub1_1 != null && this.aClass10_Sub10_Sub1_1.method911()) {
			this.aClass228_1.method5009(this.aClass10_Sub10_Sub1_1);
			this.aClass200_1.method4461();
		}
	}

	@OriginalMember(owner = "client!da", name = "B", descriptor = "()Z")
	@Override
	public boolean method5882() {
		return this.aClass10_Sub10_Sub1_1 != null && this.aClass10_Sub10_Sub1_1.method911();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class80 method5823(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class80_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "p", descriptor = "(I)V")
	private void method1277() {
		Static284.aFloatArray28[0] = this.aFloat23 * this.aFloat35;
		Static284.aFloatArray28[1] = this.aFloat24 * this.aFloat35;
		Static284.aFloatArray28[2] = this.aFloat32 * this.aFloat35;
		Static284.aFloatArray28[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static284.aFloatArray28, 0);
		Static284.aFloatArray28[2] = this.aFloat32 * -this.aFloat30;
		Static284.aFloatArray28[0] = this.aFloat23 * -this.aFloat30;
		Static284.aFloatArray28[1] = this.aFloat24 * -this.aFloat30;
		Static284.aFloatArray28[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static284.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5865(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5821();
	}

	@OriginalMember(owner = "client!da", name = "q", descriptor = "()Z")
	@Override
	public boolean method5850() {
		return this.aClass10_Sub10_Sub1_1 != null && (this.anInt1399 <= 1 || this.aBoolean100);
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(II)V")
	public void method1278(@OriginalArg(0) int arg0) {
		Static284.aFloatArray28[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static284.aFloatArray28[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static284.aFloatArray28[3] = (float) (arg0 >>> 24) / 255.0F;
		Static284.aFloatArray28[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static284.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(BI)V")
	public void method1279(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt1436) {
			return;
		}
		@Pc(10) boolean local10;
		@Pc(14) byte local14;
		if (arg0 == 1) {
			local10 = true;
			local14 = 1;
		} else if (arg0 == 2) {
			local10 = false;
			local14 = 2;
		} else if (arg0 == 128) {
			local10 = true;
			local14 = 3;
		} else {
			local10 = false;
			local14 = 0;
		}
		if (!this.aBoolean96) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean96 = true;
		}
		if (this.aBoolean87 != local10) {
			if (local10) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean87 = local10;
		}
		if (local14 != this.anInt1417) {
			if (local14 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local14 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local14 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt1417 = local14;
		}
		this.anInt1436 = arg0;
		this.anInt1423 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZZ)V")
	public void method1280(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method1317(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!da", name = "q", descriptor = "(I)V")
	private void method1281() {
		OpenGL.glDepthMask(this.aBoolean77 && this.aBoolean103);
	}

	@OriginalMember(owner = "client!da", name = "r", descriptor = "(I)V")
	public void method1282() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!da", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1434 > arg2) {
			this.anInt1434 = arg2;
		}
		if (arg3 < this.anInt1429) {
			this.anInt1429 = arg3;
		}
		if (arg0 > this.anInt1413) {
			this.anInt1413 = arg0;
		}
		if (this.anInt1441 < arg1) {
			this.anInt1441 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method1254();
		this.method1315();
	}

	@OriginalMember(owner = "client!da", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1274();
		this.method1279(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!da", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
		this.anInt1404 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt1404++;
		}
		this.anInt1402 = 0x1 << this.anInt1404;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5871(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas4 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt1440;
	}

	@OriginalMember(owner = "client!da", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass34_Sub1_4.aFloat83 + this.aClass34_Sub1_4.aFloat79 * (float) arg1 + this.aClass34_Sub1_4.aFloat84 * (float) arg0 + (float) arg2 * this.aClass34_Sub1_4.aFloat85;
		if (local28 < (float) this.anInt1440 || local28 > (float) this.anInt1419) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt1437 * ((float) arg2 * this.aClass34_Sub1_4.aFloat81 + this.aClass34_Sub1_4.aFloat86 * (float) arg0 + this.aClass34_Sub1_4.aFloat82 * (float) arg1 + this.aClass34_Sub1_4.aFloat80) / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt1420 * (this.aClass34_Sub1_4.aFloat90 + this.aClass34_Sub1_4.aFloat88 * (float) arg2 + (float) arg0 * this.aClass34_Sub1_4.aFloat89 + (float) arg1 * this.aClass34_Sub1_4.aFloat87) / local28);
		if ((float) local85 >= this.aFloat21 && this.aFloat33 >= (float) local85 && (float) local117 >= this.aFloat20 && this.aFloat17 >= (float) local117) {
			arg3[0] = (int) ((float) local85 - this.aFloat21);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat20);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!qg;)V")
	@Override
	public void method5835(@OriginalArg(0) Class30 arg0) {
		this.aClass30_Sub1_1 = (Class30_Sub1) arg0;
	}

	@OriginalMember(owner = "client!da", name = "y", descriptor = "()Z")
	@Override
	public boolean method5876() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!er;Lclient!er;Lclient!er;Lclient!er;)V")
	public void method1283(@OriginalArg(1) Class71 arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) Class71 arg2, @OriginalArg(4) Class71 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method1272(arg0.anInterface4_4);
			OpenGL.glVertexPointer(arg0.aByte16, arg0.aShort16, this.anInterface4_3.method5478(), this.anInterface4_3.method5479() + (long) arg0.aByte15);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method1272(arg2.anInterface4_4);
			OpenGL.glNormalPointer(arg2.aShort16, this.anInterface4_3.method5478(), this.anInterface4_3.method5479() + (long) arg2.aByte15);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method1272(arg3.anInterface4_4);
			OpenGL.glColorPointer(arg3.aByte16, arg3.aShort16, this.anInterface4_3.method5478(), this.anInterface4_3.method5479() + (long) arg3.aByte15);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method1272(arg1.anInterface4_4);
			OpenGL.glTexCoordPointer(arg1.aByte16, arg1.aShort16, this.anInterface4_3.method5478(), this.anInterface4_3.method5479() + (long) arg1.aByte15);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5874(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!em;Z)V")
	public void method1284(@OriginalArg(0) Interface3 arg0) {
		if (this.aBoolean78) {
			this.method1311(arg0);
			this.method1307(arg0);
		} else if (this.anInt1406 >= 0 && this.anInterface3Array2[this.anInt1406] == arg0) {
			this.anInterface3Array2[this.anInt1406--] = null;
			arg0.method5723();
			if (this.anInt1406 < 0) {
				this.anInterface3_2 = this.anInterface3_1 = null;
			} else {
				this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array2[this.anInt1406];
				this.anInterface3_2.method5725();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
	@Override
	public void method5821() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!da", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!fj;[Lclient!ef;Z)Lclient!la;")
	@Override
	public Class57 method5846(@OriginalArg(0) Class79 arg0, @OriginalArg(1) Class66[] arg1) {
		return new Class57_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	@Override
	public void method5817(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!da", name = "s", descriptor = "(I)V")
	private void method1285() {
		@Pc(52) int local52;
		if (this.aBoolean91) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local52 = this.anInt1421;
		} else {
			this.aFloat22 = (float) (this.anInt1419 - this.anInt1415) - this.aFloat18;
			this.aFloat26 = this.aFloat22 - this.aFloat28 * (float) this.anInt1426;
			if ((float) this.anInt1440 > this.aFloat26) {
				this.aFloat26 = this.anInt1440;
			}
			OpenGL.glFogf(2915, this.aFloat26);
			OpenGL.glFogf(2916, this.aFloat22);
			local52 = this.anInt1424;
		}
		Static284.aFloatArray28[1] = (float) (local52 & 0xFF00) / 65280.0F;
		Static284.aFloatArray28[2] = (float) (local52 & 0xFF) / 255.0F;
		Static284.aFloatArray28[0] = (float) (local52 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static284.aFloatArray28, 0);
		if (this.aBoolean91) {
			this.aClass188_1.aClass29_Sub8_1.method4048();
		}
	}

	@OriginalMember(owner = "client!da", name = "x", descriptor = "()Z")
	@Override
	public boolean method5875() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass34_Sub1_4.aFloat83 + this.aClass34_Sub1_4.aFloat85 * (float) arg2 + (float) arg0 * this.aClass34_Sub1_4.aFloat84 + (float) arg1 * this.aClass34_Sub1_4.aFloat79;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass34_Sub1_4.aFloat83 + (float) arg5 * this.aClass34_Sub1_4.aFloat85 + (float) arg3 * this.aClass34_Sub1_4.aFloat84 + (float) arg4 * this.aClass34_Sub1_4.aFloat79;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt1440 > local28 && (float) this.anInt1440 > local59 || !(!(local28 > (float) this.anInt1419) || !(local59 > (float) this.anInt1419))) {
			return false;
		}
		@Pc(123) int local123 = (int) (((float) arg2 * this.aClass34_Sub1_4.aFloat81 + this.aClass34_Sub1_4.aFloat82 * (float) arg1 + this.aClass34_Sub1_4.aFloat86 * (float) arg0 + this.aClass34_Sub1_4.aFloat80) * (float) this.anInt1437 / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt1437 * ((float) arg5 * this.aClass34_Sub1_4.aFloat81 + this.aClass34_Sub1_4.aFloat86 * (float) arg3 + this.aClass34_Sub1_4.aFloat82 * (float) arg4 + this.aClass34_Sub1_4.aFloat80) / local59);
		if ((float) local123 < this.aFloat21 && this.aFloat21 > (float) local155 || this.aFloat33 < (float) local123 && this.aFloat33 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass34_Sub1_4.aFloat90 + this.aClass34_Sub1_4.aFloat88 * (float) arg2 + this.aClass34_Sub1_4.aFloat89 * (float) arg0 + (float) arg1 * this.aClass34_Sub1_4.aFloat87) * (float) this.anInt1420 / local28);
			@Pc(245) int local245 = (int) ((this.aClass34_Sub1_4.aFloat90 + this.aClass34_Sub1_4.aFloat87 * (float) arg4 + (float) arg3 * this.aClass34_Sub1_4.aFloat89 + (float) arg5 * this.aClass34_Sub1_4.aFloat88) * (float) this.anInt1420 / local59);
			return (!(this.aFloat20 > (float) local213) || !(this.aFloat20 > (float) local245)) && (!(this.aFloat17 < (float) local213) || !((float) local245 > this.aFloat17));
		}
	}

	@OriginalMember(owner = "client!da", name = "u", descriptor = "(I)V")
	private void method1286() {
		if (this.aCanvas3 == null) {
			this.anInt1337 = this.anInt1294 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas3.getSize();
			this.anInt1294 = local10.height;
			this.anInt1337 = local10.width;
		}
		if (this.anInterface3_1 == null) {
			this.anInt1397 = this.anInt1337;
			this.anInt1334 = this.anInt1294;
			this.method1314();
		}
		this.method1323();
		this.va();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5814(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static405.aFloat114 = arg0;
		Static90.aFloat40 = arg2;
		Static137.aFloat51 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5819() {
		return this.aClass34_Sub1_1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method1274();
		this.method1279(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean94) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean94) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(Z)V")
	private void method1287() {
		if (this.aBoolean95) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean95 = false;
		}
	}

	@OriginalMember(owner = "client!da", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.aBoolean91 = false;
		this.aClass188_1.method4311(0, 0, 0, false, false);
		this.method1285();
		this.method1325();
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(B)V")
	private void method1288() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt1443; local7++) {
			@Pc(14) Class10_Sub4 local14 = this.aClass10_Sub4Array3[local7];
			Static57.aFloatArray6[0] = local14.method5354();
			@Pc(26) int local26 = local7 + 16386;
			Static57.aFloatArray6[1] = local14.method5365();
			Static57.aFloatArray6[2] = local14.method5362();
			Static57.aFloatArray6[3] = 1.0F;
			OpenGL.glLightfv(local26, 4611, Static57.aFloatArray6, 0);
			@Pc(53) int local53 = local14.method5361();
			@Pc(59) float local59 = local14.method5359() / 255.0F;
			Static57.aFloatArray6[0] = (float) (local53 >> 16 & 0xFF) * local59;
			Static57.aFloatArray6[2] = local59 * (float) (local53 & 0xFF);
			Static57.aFloatArray6[1] = local59 * (float) (local53 >> 8 & 0xFF);
			OpenGL.glLightfv(local26, 4609, Static57.aFloatArray6, 0);
			OpenGL.glLightf(local26, 4617, 1.0F / (float) (local14.method5355() * local14.method5355()));
			OpenGL.glEnable(local26);
		}
		while (this.anInt1439 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt1439 = this.anInt1443;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FFFI)V")
	private void method1289(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean95) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean95 = true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILclient!af;)V")
	public void method1290(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Interface1 arg2) {
		@Pc(7) int local7 = arg2.method1766();
		@Pc(14) int local14 = arg1 * this.method1268(local7);
		this.method1304(arg2);
		OpenGL.glDrawElements(4, arg0, local7, arg2.method1768() + (long) local14);
	}

	@OriginalMember(owner = "client!da", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1334 < arg3) {
			arg3 = this.anInt1334;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt1397 < arg2) {
			arg2 = this.anInt1397;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt1413 = arg0;
		this.anInt1434 = arg2;
		this.anInt1441 = arg1;
		this.anInt1429 = arg3;
		OpenGL.glEnable(3089);
		this.method1254();
		this.method1315();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lclient!bk;)V")
	@Override
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub4[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass10_Sub4Array3[local7] = arg1[local7];
		}
		this.anInt1443 = arg0;
		if (this.anInt1433 != 1) {
			this.method1288();
		}
	}

	@OriginalMember(owner = "client!da", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class49_Sub2 local6 = (Class49_Sub2) arg1;
		@Pc(9) Class4_Sub1_Sub1 local9 = local6.aClass4_Sub1_Sub1_5;
		this.method1271();
		this.method1295(local6.aClass4_Sub1_Sub1_5);
		this.method1279(1);
		this.method1316(7681, 8448);
		this.method1309(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat4 / (float) local9.anInt214;
		@Pc(46) float local46 = local9.aFloat3 / (float) local9.anInt216;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt1413 - arg2) * local39, local46 * (float) (this.anInt1441 - arg3));
		OpenGL.glVertex2i(this.anInt1413, this.anInt1441);
		OpenGL.glTexCoord2f((float) (this.anInt1413 - arg2) * local39, local46 * (float) (this.anInt1429 - arg3));
		OpenGL.glVertex2i(this.anInt1413, this.anInt1429);
		OpenGL.glTexCoord2f((float) (this.anInt1434 - arg2) * local39, local46 * (float) (this.anInt1429 - arg3));
		OpenGL.glVertex2i(this.anInt1434, this.anInt1429);
		OpenGL.glTexCoord2f((float) (this.anInt1434 - arg2) * local39, (float) (this.anInt1441 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt1434, this.anInt1441);
		OpenGL.glEnd();
		this.method1309(0, 5890, 768);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ef;Z)Lclient!o;")
	@Override
	public Class80 method5861(@OriginalArg(0) Class66 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt1861 * arg0.anInt1862];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray16 == null) {
			for (local21 = 0; local21 < arg0.anInt1862; local21++) {
				for (local25 = 0; local25 < arg0.anInt1861; local25++) {
					@Pc(83) int local83 = arg0.anIntArray150[arg0.aByteArray15[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt1862; local21++) {
				for (local25 = 0; local25 < arg0.anInt1861; local25++) {
					local12[local16++] = arg0.anIntArray150[arg0.aByteArray15[local14] & 0xFF] | arg0.aByteArray16[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(119) Class80 local119 = this.method5823(local12, arg0.anInt1861, arg0.anInt1861, arg0.anInt1862);
		local119.ha(arg0.anInt1865, arg0.anInt1864, arg0.anInt1863, arg0.anInt1866);
		return local119;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean91) {
			throw new RuntimeException("");
		}
		this.anInt1411 = arg0;
		this.anInt1421 = arg1;
		this.anInt1430 = arg3;
		this.anInt1425 = arg2;
		this.aClass188_1.aClass29_Sub8_1.method4047();
		this.method1285();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class154 method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class154_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!da", name = "v", descriptor = "(I)V")
	public void method1291() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FI)V")
	public void method1292(@OriginalArg(0) float arg0) {
		if (arg0 == this.aFloat31) {
			return;
		}
		this.aFloat31 = arg0;
		if (this.anInt1433 == 3) {
			this.method1259();
			return;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IZ)V")
	public void method1293(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean90 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt1423 &= 0xFFFFFFE0;
		this.aBoolean90 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "w", descriptor = "(I)V")
	private void method1294() {
		@Pc(6) float[] local6 = this.aFloatArray7;
		@Pc(18) float local18 = (float) (-this.anInt1447 * this.anInt1440) / (float) this.anInt1437;
		@Pc(39) float local39 = (float) (this.anInt1440 * (this.anInt1397 - this.anInt1447)) / (float) this.anInt1437;
		@Pc(50) float local50 = (float) (this.anInt1440 * this.anInt1422) / (float) this.anInt1420;
		@Pc(65) float local65 = (float) (this.anInt1440 * (this.anInt1422 - this.anInt1334)) / (float) this.anInt1420;
		if (local39 == local18 || local50 == local65) {
			local6[15] = 1.0F;
			local6[12] = 0.0F;
			local6[10] = 1.0F;
			local6[6] = 0.0F;
			local6[14] = 0.0F;
			local6[13] = 0.0F;
			local6[8] = 0.0F;
			local6[1] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = 1.0F;
			local6[0] = 1.0F;
			local6[4] = 0.0F;
			local6[2] = 0.0F;
			local6[11] = 0.0F;
			local6[9] = 0.0F;
			local6[7] = 0.0F;
		} else {
			@Pc(145) float local145 = (float) this.anInt1440 * 2.0F;
			local6[1] = 0.0F;
			local6[8] = (local39 + local18) / (-local18 + local39);
			local6[4] = 0.0F;
			local6[0] = local145 / (local39 - local18);
			local6[12] = 0.0F;
			local6[15] = 0.0F;
			local6[10] = this.aFloat27 = (float) -(this.anInt1419 + this.anInt1440) / (float) (this.anInt1419 - this.anInt1440);
			local6[9] = (local65 + local50) / (-local65 + local50);
			local6[6] = 0.0F;
			local6[7] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = local145 / (local50 - local65);
			local6[14] = this.aFloat25 = -((float) this.anInt1419 * local145) / (float) (this.anInt1419 - this.anInt1440);
			local6[13] = 0.0F;
			local6[11] = -1.0F;
			local6[2] = 0.0F;
		}
		this.method1257();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!ac;)V")
	public void method1295(@OriginalArg(1) Class4 arg0) {
		@Pc(11) Class4 local11 = this.aClass4Array1[this.anInt1442];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt5771);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt5771);
				} else if (local11.anInt5771 != arg0.anInt5771) {
					OpenGL.glDisable(local11.anInt5771);
					OpenGL.glEnable(arg0.anInt5771);
				}
				OpenGL.glBindTexture(arg0.anInt5771, arg0.method4582());
			}
			this.aClass4Array1[this.anInt1442] = arg0;
		}
		this.anInt1423 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!da", name = "x", descriptor = "(I)V")
	private void method1296() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()Z")
	@Override
	public boolean method5824() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(Z)V")
	private void method1297() {
		Static284.aFloatArray28[1] = this.aFloat24 * this.aFloat34;
		Static284.aFloatArray28[2] = this.aFloat34 * this.aFloat32;
		Static284.aFloatArray28[3] = 1.0F;
		Static284.aFloatArray28[0] = this.aFloat34 * this.aFloat23;
		OpenGL.glLightModelfv(2899, Static284.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!da", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat36 && arg1 == this.aFloat29) {
			return;
		}
		this.aFloat36 = arg0;
		this.aFloat29 = arg1;
		this.method1257();
		if (this.anInt1433 == 3) {
			this.method1259();
		} else if (this.anInt1433 == 2) {
			this.method1319();
			return;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V")
	public void method1298(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean93) {
			this.aBoolean93 = arg0;
			this.method1263();
			this.anInt1423 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!da", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt1429;
		arg0[0] = this.anInt1413;
		arg0[2] = this.anInt1434;
		arg0[1] = this.anInt1441;
	}

	@OriginalMember(owner = "client!da", name = "o", descriptor = "()V")
	@Override
	public void method5848() {
		this.method1331(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!pr;I)V")
	@Override
	public void method5858(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class40_Sub8[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method6090(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(B)V")
	private void method1299() {
		if (this.anInt1433 != 2) {
			this.anInt1433 = 2;
			this.method1319();
			this.method1264();
			this.anInt1423 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!da", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt1419;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(BI)V")
	public void method1300(@OriginalArg(1) int arg0) {
		if (this.anInt1442 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt1442 = arg0;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!e;Lclient!ip;Lclient!c;[Lclient!pr;I)V")
	@Override
	public void method5873(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class40_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method5858(arg0, arg2, arg3, arg4);
		this.method5855(arg1);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
	@Override
	public int method5856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(B)Lclient!dl;")
	public Class4_Sub2 method1301() {
		return this.aClass30_Sub1_1 == null ? null : this.aClass30_Sub1_1.method3802();
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
	@Override
	public boolean method5810() {
		if (this.aClass10_Sub10_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass10_Sub10_Sub1_1.method911()) {
			if (!this.aClass228_1.method5001(this.aClass10_Sub10_Sub1_1)) {
				return false;
			}
			this.aClass200_1.method4461();
		}
		return true;
	}

	@OriginalMember(owner = "client!da", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat34) {
			this.aFloat34 = arg0;
			this.method1297();
		}
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method5874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1274();
		this.method1279(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5829() {
		return new Class34_Sub1();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZLclient!jaggl/memory/NativeBuffer;II)Lclient!gg;")
	public Interface4 method1302(@OriginalArg(0) int arg0, @OriginalArg(2) NativeBuffer arg1, @OriginalArg(3) int arg2) {
		return (Interface4) (this.aBoolean79 ? new Class69_Sub2(this, arg2, arg1, arg0, false) : new Class26_Sub2(this, arg2, arg1));
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!em;I)V")
	public void method1303(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt1405 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt1405 >= 0) {
			this.anInterface3Array3[this.anInt1405].method5727();
		}
		this.anInterface3_1 = this.anInterface3Array3[++this.anInt1405] = arg0;
		this.anInterface3_1.method5726();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!af;I)V")
	public void method1304(@OriginalArg(0) Interface1 arg0) {
		if (arg0 != this.anInterface1_1) {
			if (this.aBoolean79) {
				OpenGL.glBindBufferARB(34963, arg0.method1767());
			}
			this.anInterface1_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!da", name = "s", descriptor = "()I")
	@Override
	public int method5854() {
		return 4;
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)Lclient!n;")
	@Override
	public Class10_Sub29 method5852(@OriginalArg(0) int arg0) {
		@Pc(8) Class10_Sub29_Sub1 local8 = new Class10_Sub29_Sub1(arg0);
		this.aClass163_5.method3613(local8);
		return local8;
	}

	@OriginalMember(owner = "client!da", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1274();
		this.method1279(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZI[B)Lclient!af;")
	public Interface1 method1305(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface1) (this.aBoolean79 && (!arg1 || this.aBoolean81) ? new Class69_Sub1(this, 5123, arg2, arg0, arg1) : new Class26_Sub1(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!da", name = "y", descriptor = "(I)V")
	private void method1306() {
		if (this.anInt1433 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt1397 > 0 && this.anInt1334 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt1397, (double) this.anInt1334, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt1423 &= 0xFFFFFFE7;
		this.anInt1433 = 1;
	}

	@OriginalMember(owner = "client!da", name = "j", descriptor = "()Z")
	@Override
	public boolean method5839() {
		return this.aBoolean94 && (!this.method5882() || this.aBoolean100);
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	@Override
	public void method5826(@OriginalArg(0) int arg0) {
		this.method1296();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLclient!em;)V")
	public void method1307(@OriginalArg(1) Interface3 arg0) {
		if (this.anInt1405 < 0 || this.anInterface3Array3[this.anInt1405] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface3Array3[this.anInt1405--] = null;
		arg0.method5727();
		if (this.anInt1405 < 0) {
			this.anInterface3_1 = null;
		} else {
			this.anInterface3_1 = this.anInterface3Array3[this.anInt1405];
			this.anInterface3_1.method5726();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FFIFF)V")
	public void method1308(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static284.aFloatArray28[1] = arg0;
		Static284.aFloatArray28[0] = arg1;
		Static284.aFloatArray28[2] = arg3;
		Static284.aFloatArray28[3] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static284.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(IIII)V")
	public void method1309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
	@Override
	public void method5842(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt1398 = arg0;
		this.aClass200_1.method4461();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ip;)V")
	@Override
	public void method5855(@OriginalArg(0) Class121 arg0) {
		this.aClass25_1.method431(arg0, this);
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(BI)V")
	public synchronized void method1310(@OriginalArg(1) int arg0) {
		@Pc(7) Class10 local7 = new Class10();
		local7.aLong264 = arg0;
		this.aClass163_11.method3613(local7);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(ILclient!em;)V")
	public void method1311(@OriginalArg(1) Interface3 arg0) {
		if (this.anInt1407 < 0 || this.anInterface3Array1[this.anInt1407] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface3Array1[this.anInt1407--] = null;
		arg0.method5728();
		if (this.anInt1407 < 0) {
			this.anInterface3_2 = null;
		} else {
			this.anInterface3_2 = this.anInterface3Array1[this.anInt1407];
			this.anInterface3_2.method5724();
		}
	}

	@OriginalMember(owner = "client!da", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat29;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5880(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas4) {
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

	@OriginalMember(owner = "client!da", name = "v", descriptor = "()V")
	@Override
	public void method5862() {
		this.aClass228_1.method5006();
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(BI)I")
	public int method1312(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!da", name = "i", descriptor = "()Z")
	@Override
	public boolean method5830() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FFZ)V")
	public void method1313(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat18 = arg1;
		this.aFloat28 = arg0;
		if (!this.aBoolean91) {
			this.method1285();
		}
	}

	@OriginalMember(owner = "client!da", name = "z", descriptor = "(I)V")
	private void method1314() {
		OpenGL.glViewport(this.anInt1438, this.anInt1418, this.anInt1397, this.anInt1334);
	}

	@OriginalMember(owner = "client!da", name = "A", descriptor = "(I)V")
	private void method1315() {
		if (this.anInt1413 <= this.anInt1434 && this.anInt1441 <= this.anInt1429) {
			OpenGL.glScissor(this.anInt1413 + this.anInt1438, -this.anInt1429 + this.anInt1418 + this.anInt1334, this.anInt1434 - this.anInt1413, -this.anInt1441 + this.anInt1429);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "k", descriptor = "()V")
	@Override
	protected void method5841() {
		for (@Pc(10) Class10 local10 = this.aClass163_5.method3620(); local10 != null; local10 = this.aClass163_5.method3621()) {
			((Class10_Sub29_Sub1) local10).method5399();
		}
		if (this.aClass228_1 != null) {
			this.aClass228_1.method5003();
		}
		if (this.anOpenGL1 != null) {
			this.method1296();
			@Pc(40) Enumeration local40 = this.aHashtable1.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable1.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean76) {
			Static228.method3402(false, true);
			this.aBoolean76 = false;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	public void method1316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1442 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(21) boolean local21 = false;
		if (this.anInt1445 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt1445 = arg0;
			local21 = true;
		}
		if (this.anInt1446 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local21 = true;
			this.anInt1446 = arg1;
		}
		if (local21) {
			this.anInt1423 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(6) int local6 = this.anInt1449;
		this.anInt1449 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!da", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1421 = arg1;
		this.anInt1411 = arg0;
		this.anInt1425 = arg2;
		this.anInt1430 = arg3;
		this.aBoolean91 = true;
		this.aClass188_1.method4311(0, 0, 3, false, false);
		this.aClass188_1.aClass29_Sub8_1.method4047();
		this.method1285();
		this.method1325();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZIB)V")
	public void method1317(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 != this.anInt1444) {
			if (arg2 < 0) {
				this.method1287();
				this.method1295(null);
				this.method1256(0);
				if (!this.aBoolean91) {
					this.aClass188_1.method4311(0, 0, 0, arg0, arg1);
				}
			} else {
				@Pc(16) Class4_Sub1 local16 = this.aClass200_1.method4456(arg2);
				@Pc(22) Class259 local22 = super.anInterface7_8.method4447(arg2);
				if (local22.aByte101 == 0 && local22.aByte104 == 0) {
					this.method1287();
				} else {
					@Pc(43) int local43 = local22.aBoolean474 ? 64 : 128;
					@Pc(47) int local47 = local43 * 50;
					this.method1289((float) (local22.aByte101 * (this.anInt1403 % local47)) / (float) local47, (float) (this.anInt1403 % local47 * local22.aByte104) / (float) local47, 0.0F);
				}
				if (this.aBoolean91) {
					this.method1295(local16);
					this.method1256(local22.anInt7252);
				} else {
					this.aClass188_1.method4311(local22.anInt7256, local22.aByte105, local22.aByte100, arg0, arg1);
					if (!this.aClass188_1.method4312(local16, local22.anInt7252)) {
						this.method1295(local16);
						this.method1256(local22.anInt7252);
					}
				}
			}
			this.anInt1444 = arg2;
		}
		this.anInt1423 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IB)V")
	public void method1318(@OriginalArg(0) int arg0) {
		this.method1280(arg0, true);
	}

	@OriginalMember(owner = "client!da", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat36;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5879(@OriginalArg(0) Class10_Sub29 arg0) {
		this.aNativeHeap1 = ((Class10_Sub29_Sub1) arg0).aNativeHeap2;
		if (this.anInterface4_2 != null) {
			return;
		}
		@Pc(16) Class10_Sub8_Sub1 local16 = new Class10_Sub8_Sub1(80);
		if (this.aBoolean99) {
			local16.method835(-1.0F);
			local16.method835(-1.0F);
			local16.method835(0.0F);
			local16.method835(0.0F);
			local16.method835(1.0F);
			local16.method835(1.0F);
			local16.method835(-1.0F);
			local16.method835(0.0F);
			local16.method835(1.0F);
			local16.method835(1.0F);
			local16.method835(1.0F);
			local16.method835(1.0F);
			local16.method835(0.0F);
			local16.method835(1.0F);
			local16.method835(0.0F);
			local16.method835(-1.0F);
			local16.method835(1.0F);
			local16.method835(0.0F);
			local16.method835(0.0F);
			local16.method835(0.0F);
		} else {
			local16.method833(-1.0F);
			local16.method833(-1.0F);
			local16.method833(0.0F);
			local16.method833(0.0F);
			local16.method833(1.0F);
			local16.method833(1.0F);
			local16.method833(-1.0F);
			local16.method833(0.0F);
			local16.method833(1.0F);
			local16.method833(1.0F);
			local16.method833(1.0F);
			local16.method833(1.0F);
			local16.method833(0.0F);
			local16.method833(1.0F);
			local16.method833(0.0F);
			local16.method833(-1.0F);
			local16.method833(1.0F);
			local16.method833(0.0F);
			local16.method833(0.0F);
			local16.method833(0.0F);
		}
		this.anInterface4_2 = this.method1253(local16.anInt2989, 20, local16.aByteArray44, false);
		this.aClass71_5 = new Class71(this.anInterface4_2, 5126, 3, 0);
		this.aClass71_4 = new Class71(this.anInterface4_2, 5126, 2, 12);
		this.aClass25_1.method432(this);
	}

	@OriginalMember(owner = "client!da", name = "i", descriptor = "(B)V")
	private void method1319() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray7, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(ILclient!em;)V")
	public void method1320(@OriginalArg(1) Interface3 arg0) {
		if (this.aBoolean78) {
			this.method1261(arg0);
			this.method1303(arg0);
		} else if (this.anInt1406 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt1406 >= 0) {
				this.anInterface3Array2[this.anInt1406].method5723();
			}
			this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array2[++this.anInt1406] = arg0;
			this.anInterface3_2.method5725();
		}
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(Z)V")
	private void method1321() {
		this.aClass34_Sub1_4 = new Class34_Sub1();
		this.aClass34_Sub1_3 = new Class34_Sub1();
		this.aClass4Array1 = new Class4[this.anInt1416];
		this.aClass4_Sub1_3 = new Class4_Sub1(this, 3553, 6408, 1, 1);
		new Class4_Sub1(this, 3553, 6408, 1, 1);
		new Class4_Sub1(this, 3553, 6408, 1, 1);
		this.aClass63_Sub2_10 = new Class63_Sub2(this);
		this.aClass63_Sub2_8 = new Class63_Sub2(this);
		this.aClass63_Sub2_1 = new Class63_Sub2(this);
		this.aClass63_Sub2_4 = new Class63_Sub2(this);
		this.aClass63_Sub2_9 = new Class63_Sub2(this);
		this.aClass63_Sub2_3 = new Class63_Sub2(this);
		this.aClass63_Sub2_2 = new Class63_Sub2(this);
		this.aClass63_Sub2_7 = new Class63_Sub2(this);
		this.aClass63_Sub2_5 = new Class63_Sub2(this);
		this.aClass63_Sub2_6 = new Class63_Sub2(this);
		if (this.aBoolean98) {
			this.aClass260_3 = new Class260(this);
			new Class260(this);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!oq;I)V")
	public void method1322(@OriginalArg(0) Class34_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method4151(), 0);
	}

	@OriginalMember(owner = "client!da", name = "B", descriptor = "(I)V")
	public void method1323() {
		if (this.anInt1433 != 0) {
			this.anInt1433 = 0;
			this.anInt1423 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Lclient!oq;I)V")
	public void method1324(@OriginalArg(0) Class34_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method4151(), 0);
	}

	@OriginalMember(owner = "client!da", name = "C", descriptor = "(I)V")
	private void method1325() {
		if (this.aBoolean97 && this.anInt1426 >= 0 | this.aBoolean91) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class49 method5863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static451.method6003(arg0, arg2, arg1, this, arg3);
	}

	@OriginalMember(owner = "client!da", name = "D", descriptor = "(I)I")
	private int method1326() {
		@Pc(5) int local5 = 0;
		this.aString9 = OpenGL.glGetString(7936).toLowerCase();
		this.aString8 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString9.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString9.indexOf("brian paul") != -1 || this.aString9.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static253.method3686(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(65) int local65 = Static335.method4519(local53[0]);
				@Pc(71) int local71 = Static335.method4519(local53[1]);
				this.anInt1432 = local71 + local65 * 10;
			} catch (@Pc(80) NumberFormatException local80) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt1432 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(121) int[] local121 = new int[1];
		OpenGL.glGetIntegerv(34018, local121, 0);
		this.anInt1416 = local121[0];
		OpenGL.glGetIntegerv(34929, local121, 0);
		this.anInt1435 = local121[0];
		OpenGL.glGetIntegerv(34930, local121, 0);
		this.anInt1414 = local121[0];
		if (this.anInt1416 < 2 || this.anInt1435 < 2 || this.anInt1414 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean99 = NativeStream.b();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean79 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean94 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean80 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean85 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean89 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean83 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean92 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean102 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean84 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean88 = false;
		this.aBoolean98 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean78 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.bf = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean100 = this.aBoolean78 & this.bf;
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!da", name = "i", descriptor = "(Z)V")
	public void method1327() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray8, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!da", name = "j", descriptor = "(B)V")
	public void method1328() {
		if (this.anInt1423 == 16) {
			return;
		}
		this.method1267();
		this.method1273(true);
		this.method1293(true);
		this.method1331(true);
		this.method1279(1);
		this.method1256(0);
		this.anInt1423 = 16;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(III)V")
	public synchronized void method1329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class10_Sub12 local8 = new Class10_Sub12(arg1);
		local8.aLong264 = arg0;
		this.aClass163_8.method3613(local8);
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(III)V")
	public synchronized void method1330(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class10_Sub12 local16 = new Class10_Sub12(arg0);
		local16.aLong264 = arg1;
		this.aClass163_7.method3613(local16);
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1440 == arg0 && arg1 == this.anInt1419) {
			return;
		}
		this.anInt1440 = arg0;
		this.anInt1419 = arg1;
		this.method1294();
		this.method1285();
		if (this.anInt1433 == 3) {
			this.method1259();
			return;
		}
		if (this.anInt1433 != 2) {
			return;
		}
		this.method1319();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BZ)V")
	public void method1331(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean77) {
			this.aBoolean77 = arg0;
			this.method1281();
			this.anInt1423 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt1424 && this.anInt1426 == arg1 && this.anInt1415 == arg2) {
			return;
		}
		this.anInt1415 = arg2;
		this.anInt1426 = arg1;
		this.anInt1424 = arg0;
		if (!this.aBoolean91) {
			this.method1285();
			this.method1325();
		}
	}

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()Z")
	@Override
	public boolean method5843() {
		return true;
	}
}
