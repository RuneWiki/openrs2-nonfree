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

@OriginalClass("client!rs")
public final class Class133_Sub3 extends Class133 {

	@OriginalMember(owner = "client!rs", name = "Mb", descriptor = "I")
	private int anInt8388;

	@OriginalMember(owner = "client!rs", name = "Nc", descriptor = "I")
	private int anInt8439;

	@OriginalMember(owner = "client!rs", name = "Ed", descriptor = "I")
	public int anInt8481;

	@OriginalMember(owner = "client!rs", name = "he", descriptor = "I")
	public int anInt8510;

	@OriginalMember(owner = "client!rs", name = "Je", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!rs", name = "Me", descriptor = "I")
	public int anInt8530;

	@OriginalMember(owner = "client!rs", name = "Qe", descriptor = "Lclient!qr;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!rs", name = "Se", descriptor = "Lclient!dda;")
	private Class28_Sub2 aClass28_Sub2_1;

	@OriginalMember(owner = "client!rs", name = "Te", descriptor = "Lclient!qr;")
	private Interface19 anInterface19_2;

	@OriginalMember(owner = "client!rs", name = "Ve", descriptor = "Lclient!ju;")
	private Class186 aClass186_4;

	@OriginalMember(owner = "client!rs", name = "af", descriptor = "I")
	private int anInt8535;

	@OriginalMember(owner = "client!rs", name = "cf", descriptor = "I")
	public int anInt8536;

	@OriginalMember(owner = "client!rs", name = "df", descriptor = "I")
	public int anInt8537;

	@OriginalMember(owner = "client!rs", name = "lf", descriptor = "Z")
	private boolean aBoolean607;

	@OriginalMember(owner = "client!rs", name = "mf", descriptor = "Z")
	private boolean aBoolean608;

	@OriginalMember(owner = "client!rs", name = "nf", descriptor = "I")
	private int anInt8538;

	@OriginalMember(owner = "client!rs", name = "of", descriptor = "I")
	private int anInt8539;

	@OriginalMember(owner = "client!rs", name = "pf", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "client!rs", name = "rf", descriptor = "Z")
	private boolean aBoolean609;

	@OriginalMember(owner = "client!rs", name = "sf", descriptor = "I")
	private int anInt8540;

	@OriginalMember(owner = "client!rs", name = "tf", descriptor = "Z")
	private boolean aBoolean610;

	@OriginalMember(owner = "client!rs", name = "xf", descriptor = "I")
	public int anInt8541;

	@OriginalMember(owner = "client!rs", name = "zf", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!rs", name = "Af", descriptor = "Z")
	public boolean aBoolean611;

	@OriginalMember(owner = "client!rs", name = "Cf", descriptor = "Lclient!vo;")
	public Class187_Sub3 aClass187_Sub3_1;

	@OriginalMember(owner = "client!rs", name = "Df", descriptor = "Lclient!ju;")
	public Class186 aClass186_5;

	@OriginalMember(owner = "client!rs", name = "Ef", descriptor = "Z")
	private boolean aBoolean612;

	@OriginalMember(owner = "client!rs", name = "Gf", descriptor = "Z")
	private boolean aBoolean614;

	@OriginalMember(owner = "client!rs", name = "If", descriptor = "[Lclient!nba;")
	private Class167[] aClass167Array1;

	@OriginalMember(owner = "client!rs", name = "Kf", descriptor = "Z")
	private boolean aBoolean616;

	@OriginalMember(owner = "client!rs", name = "Lf", descriptor = "Z")
	private boolean aBoolean617;

	@OriginalMember(owner = "client!rs", name = "Nf", descriptor = "I")
	private int anInt8543;

	@OriginalMember(owner = "client!rs", name = "Of", descriptor = "Z")
	public boolean aBoolean618;

	@OriginalMember(owner = "client!rs", name = "Qf", descriptor = "Lclient!vo;")
	public Class187_Sub3 aClass187_Sub3_2;

	@OriginalMember(owner = "client!rs", name = "Tf", descriptor = "F")
	private float aFloat154;

	@OriginalMember(owner = "client!rs", name = "Uf", descriptor = "F")
	private float aFloat155;

	@OriginalMember(owner = "client!rs", name = "Vf", descriptor = "Z")
	private boolean aBoolean619;

	@OriginalMember(owner = "client!rs", name = "Wf", descriptor = "Z")
	public boolean aBoolean620;

	@OriginalMember(owner = "client!rs", name = "bg", descriptor = "Lclient!wo;")
	public Class167_Sub3 aClass167_Sub3_4;

	@OriginalMember(owner = "client!rs", name = "dg", descriptor = "Z")
	public boolean aBoolean623;

	@OriginalMember(owner = "client!rs", name = "fg", descriptor = "Lclient!ak;")
	public Class18 aClass18_7;

	@OriginalMember(owner = "client!rs", name = "gg", descriptor = "F")
	public float aFloat156;

	@OriginalMember(owner = "client!rs", name = "hg", descriptor = "I")
	public int anInt8548;

	@OriginalMember(owner = "client!rs", name = "jg", descriptor = "F")
	private float aFloat157;

	@OriginalMember(owner = "client!rs", name = "lg", descriptor = "Lclient!js;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!rs", name = "og", descriptor = "Lclient!vo;")
	public Class187_Sub3 aClass187_Sub3_3;

	@OriginalMember(owner = "client!rs", name = "pg", descriptor = "Lclient!js;")
	private Interface10 anInterface10_5;

	@OriginalMember(owner = "client!rs", name = "qg", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!rs", name = "rg", descriptor = "Lclient!pk;")
	private Class130_Sub2 aClass130_Sub2_1;

	@OriginalMember(owner = "client!rs", name = "sg", descriptor = "I")
	private int anInt8551;

	@OriginalMember(owner = "client!rs", name = "vg", descriptor = "Lclient!vo;")
	public Class187_Sub3 aClass187_Sub3_4;

	@OriginalMember(owner = "client!rs", name = "xg", descriptor = "Lclient!vo;")
	public Class187_Sub3 aClass187_Sub3_5;

	@OriginalMember(owner = "client!rs", name = "yg", descriptor = "Lclient!sb;")
	private Class167_Sub3_Sub1 aClass167_Sub3_Sub1_5;

	@OriginalMember(owner = "client!rs", name = "Ag", descriptor = "Z")
	public boolean aBoolean625;

	@OriginalMember(owner = "client!rs", name = "Bg", descriptor = "Lclient!vo;")
	public Class187_Sub3 aClass187_Sub3_6;

	@OriginalMember(owner = "client!rs", name = "Ig", descriptor = "I")
	private int anInt8558;

	@OriginalMember(owner = "client!rs", name = "Ng", descriptor = "Z")
	public boolean aBoolean628;

	@OriginalMember(owner = "client!rs", name = "Pg", descriptor = "Lclient!ak;")
	public Class18 aClass18_8;

	@OriginalMember(owner = "client!rs", name = "Qg", descriptor = "Lclient!sda;")
	private Interface21 anInterface21_4;

	@OriginalMember(owner = "client!rs", name = "Rg", descriptor = "Lclient!vo;")
	public Class187_Sub3 aClass187_Sub3_7;

	@OriginalMember(owner = "client!rs", name = "Tg", descriptor = "I")
	private int anInt8560;

	@OriginalMember(owner = "client!rs", name = "Vg", descriptor = "I")
	private int anInt8561;

	@OriginalMember(owner = "client!rs", name = "bh", descriptor = "Z")
	public boolean aBoolean630;

	@OriginalMember(owner = "client!rs", name = "ch", descriptor = "Z")
	public boolean aBoolean631;

	@OriginalMember(owner = "client!rs", name = "dh", descriptor = "I")
	public int anInt8565;

	@OriginalMember(owner = "client!rs", name = "gh", descriptor = "Lclient!vo;")
	public Class187_Sub3 aClass187_Sub3_8;

	@OriginalMember(owner = "client!rs", name = "hh", descriptor = "I")
	public int anInt8568;

	@OriginalMember(owner = "client!rs", name = "ih", descriptor = "Z")
	public boolean aBoolean632;

	@OriginalMember(owner = "client!rs", name = "kh", descriptor = "I")
	private int anInt8570;

	@OriginalMember(owner = "client!rs", name = "mh", descriptor = "I")
	private int anInt8571;

	@OriginalMember(owner = "client!rs", name = "nh", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!rs", name = "ph", descriptor = "Lclient!vo;")
	public Class187_Sub3 aClass187_Sub3_9;

	@OriginalMember(owner = "client!rs", name = "qh", descriptor = "Z")
	private boolean aBoolean633;

	@OriginalMember(owner = "client!rs", name = "rh", descriptor = "Lclient!vo;")
	public Class187_Sub3 aClass187_Sub3_10;

	@OriginalMember(owner = "client!rs", name = "sh", descriptor = "Z")
	public boolean aBoolean634;

	@OriginalMember(owner = "client!rs", name = "uh", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!rs", name = "vh", descriptor = "Ljava/lang/String;")
	private String aString97;

	@OriginalMember(owner = "client!rs", name = "wh", descriptor = "Z")
	private boolean aBoolean635;

	@OriginalMember(owner = "client!rs", name = "xh", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!rs", name = "yh", descriptor = "Ljava/lang/String;")
	private String aString98;

	@OriginalMember(owner = "client!rs", name = "Ah", descriptor = "I")
	private int anInt8574;

	@OriginalMember(owner = "client!rs", name = "Fh", descriptor = "I")
	private int anInt8575;

	@OriginalMember(owner = "client!rs", name = "Gh", descriptor = "I")
	private int anInt8576;

	@OriginalMember(owner = "client!rs", name = "Gb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!rs", name = "Ge", descriptor = "I")
	public int anInt8528 = 128;

	@OriginalMember(owner = "client!rs", name = "Ce", descriptor = "Lclient!je;")
	private final Class173 aClass173_1 = new Class173();

	@OriginalMember(owner = "client!rs", name = "He", descriptor = "Lclient!o;")
	private final Class113_Sub2 aClass113_Sub2_1 = new Class113_Sub2();

	@OriginalMember(owner = "client!rs", name = "Ie", descriptor = "Lclient!o;")
	public final Class113_Sub2 aClass113_Sub2_2 = new Class113_Sub2();

	@OriginalMember(owner = "client!rs", name = "Ke", descriptor = "Z")
	private boolean aBoolean606 = false;

	@OriginalMember(owner = "client!rs", name = "Ne", descriptor = "I")
	public int anInt8531 = 8;

	@OriginalMember(owner = "client!rs", name = "Le", descriptor = "I")
	public int anInt8529 = 3;

	@OriginalMember(owner = "client!rs", name = "Pe", descriptor = "Lclient!tg;")
	private final Class330 aClass330_47 = new Class330();

	@OriginalMember(owner = "client!rs", name = "We", descriptor = "I")
	private int anInt8534 = -1;

	@OriginalMember(owner = "client!rs", name = "Re", descriptor = "I")
	private int anInt8532 = -1;

	@OriginalMember(owner = "client!rs", name = "Ye", descriptor = "[Lclient!qr;")
	private final Interface19[] anInterface19Array2 = new Interface19[4];

	@OriginalMember(owner = "client!rs", name = "Xe", descriptor = "[Lclient!qr;")
	private final Interface19[] anInterface19Array1 = new Interface19[4];

	@OriginalMember(owner = "client!rs", name = "Ue", descriptor = "I")
	private int anInt8533 = -1;

	@OriginalMember(owner = "client!rs", name = "Ze", descriptor = "[Lclient!qr;")
	private final Interface19[] anInterface19Array3 = new Interface19[4];

	@OriginalMember(owner = "client!rs", name = "bf", descriptor = "Lclient!tg;")
	private final Class330 bf;

	@OriginalMember(owner = "client!rs", name = "ef", descriptor = "Lclient!tg;")
	private final Class330 aClass330_48;

	@OriginalMember(owner = "client!rs", name = "ff", descriptor = "Lclient!tg;")
	private final Class330 aClass330_49;

	@OriginalMember(owner = "client!rs", name = "gf", descriptor = "Lclient!tg;")
	private final Class330 aClass330_50;

	@OriginalMember(owner = "client!rs", name = "hf", descriptor = "Lclient!tg;")
	private final Class330 aClass330_51;

	@OriginalMember(owner = "client!rs", name = "jf", descriptor = "Lclient!tg;")
	private final Class330 aClass330_52;

	@OriginalMember(owner = "client!rs", name = "kf", descriptor = "Lclient!tg;")
	private final Class330 aClass330_53;

	@OriginalMember(owner = "client!rs", name = "qf", descriptor = "Lclient!o;")
	public final Class113_Sub2 aClass113_Sub2_3;

	@OriginalMember(owner = "client!rs", name = "uf", descriptor = "Lclient!o;")
	public final Class113_Sub2 aClass113_Sub2_4;

	@OriginalMember(owner = "client!rs", name = "vf", descriptor = "Lclient!o;")
	public final Class113_Sub2 aClass113_Sub2_5;

	@OriginalMember(owner = "client!rs", name = "Bf", descriptor = "[F")
	private final float[] aFloatArray65;

	@OriginalMember(owner = "client!rs", name = "Mf", descriptor = "[Lclient!vt;")
	private final Class5_Sub11[] aClass5_Sub11Array8;

	@OriginalMember(owner = "client!rs", name = "ag", descriptor = "I")
	private int anInt8547;

	@OriginalMember(owner = "client!rs", name = "mg", descriptor = "F")
	private float aFloat158;

	@OriginalMember(owner = "client!rs", name = "Xf", descriptor = "I")
	public int anInt8545;

	@OriginalMember(owner = "client!rs", name = "tg", descriptor = "I")
	public int anInt8552;

	@OriginalMember(owner = "client!rs", name = "wg", descriptor = "F")
	private float aFloat161;

	@OriginalMember(owner = "client!rs", name = "Pf", descriptor = "I")
	public int anInt8544;

	@OriginalMember(owner = "client!rs", name = "Fg", descriptor = "I")
	public int anInt8556;

	@OriginalMember(owner = "client!rs", name = "Zf", descriptor = "I")
	private int anInt8546;

	@OriginalMember(owner = "client!rs", name = "ig", descriptor = "I")
	public int anInt8549;

	@OriginalMember(owner = "client!rs", name = "Gg", descriptor = "I")
	private int anInt8557;

	@OriginalMember(owner = "client!rs", name = "yf", descriptor = "I")
	public int anInt8542;

	@OriginalMember(owner = "client!rs", name = "Mg", descriptor = "Z")
	private boolean aBoolean627;

	@OriginalMember(owner = "client!rs", name = "Kg", descriptor = "[F")
	private final float[] aFloatArray66;

	@OriginalMember(owner = "client!rs", name = "ah", descriptor = "[F")
	private final float[] aFloatArray68;

	@OriginalMember(owner = "client!rs", name = "zg", descriptor = "I")
	private int anInt8554;

	@OriginalMember(owner = "client!rs", name = "Yg", descriptor = "I")
	private int anInt8563;

	@OriginalMember(owner = "client!rs", name = "Cg", descriptor = "I")
	private int anInt8555;

	@OriginalMember(owner = "client!rs", name = "Hf", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!rs", name = "Rf", descriptor = "F")
	public float aFloat152;

	@OriginalMember(owner = "client!rs", name = "eg", descriptor = "Z")
	private boolean aBoolean624;

	@OriginalMember(owner = "client!rs", name = "Lg", descriptor = "F")
	private float aFloat164;

	@OriginalMember(owner = "client!rs", name = "Hg", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!rs", name = "ug", descriptor = "I")
	private int anInt8553;

	@OriginalMember(owner = "client!rs", name = "ng", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!rs", name = "Ug", descriptor = "[F")
	public final float[] aFloatArray67;

	@OriginalMember(owner = "client!rs", name = "kg", descriptor = "I")
	public int anInt8550;

	@OriginalMember(owner = "client!rs", name = "lh", descriptor = "F")
	private float aFloat166;

	@OriginalMember(owner = "client!rs", name = "Jg", descriptor = "I")
	private int anInt8559;

	@OriginalMember(owner = "client!rs", name = "oh", descriptor = "I")
	private int anInt8572;

	@OriginalMember(owner = "client!rs", name = "fh", descriptor = "I")
	private int anInt8567;

	@OriginalMember(owner = "client!rs", name = "Xg", descriptor = "I")
	public int anInt8562;

	@OriginalMember(owner = "client!rs", name = "Eg", descriptor = "F")
	private float aFloat162;

	@OriginalMember(owner = "client!rs", name = "jh", descriptor = "I")
	public int anInt8569;

	@OriginalMember(owner = "client!rs", name = "th", descriptor = "I")
	public int anInt8573;

	@OriginalMember(owner = "client!rs", name = "Zg", descriptor = "I")
	public int anInt8564;

	@OriginalMember(owner = "client!rs", name = "Sf", descriptor = "F")
	public float aFloat153;

	@OriginalMember(owner = "client!rs", name = "wf", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!rs", name = "Og", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!rs", name = "Bh", descriptor = "[F")
	private final float[] aFloatArray69;

	@OriginalMember(owner = "client!rs", name = "Wg", descriptor = "Lclient!og;")
	public Class5_Sub22_Sub2 aClass5_Sub22_Sub2_3;

	@OriginalMember(owner = "client!rs", name = "Hh", descriptor = "[B")
	public final byte[] aByteArray91;

	@OriginalMember(owner = "client!rs", name = "Dh", descriptor = "[I")
	public int[] anIntArray478;

	@OriginalMember(owner = "client!rs", name = "Ih", descriptor = "[I")
	public int[] anIntArray480;

	@OriginalMember(owner = "client!rs", name = "Eh", descriptor = "[I")
	public int[] anIntArray479;

	@OriginalMember(owner = "client!rs", name = "Be", descriptor = "I")
	public final int anInt8526;

	@OriginalMember(owner = "client!rs", name = "ye", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas20;

	@OriginalMember(owner = "client!rs", name = "rc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas19;

	@OriginalMember(owner = "client!rs", name = "xe", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!rs", name = "Jb", descriptor = "J")
	private final long aLong209;

	@OriginalMember(owner = "client!rs", name = "id", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "client!rs", name = "eh", descriptor = "I")
	public final int anInt8566;

	@OriginalMember(owner = "client!rs", name = "Dg", descriptor = "Z")
	private boolean aBoolean626;

	@OriginalMember(owner = "client!rs", name = "Ff", descriptor = "Z")
	public boolean aBoolean613;

	@OriginalMember(owner = "client!rs", name = "Yf", descriptor = "Z")
	public boolean aBoolean621;

	@OriginalMember(owner = "client!rs", name = "cg", descriptor = "Z")
	public boolean aBoolean622;

	@OriginalMember(owner = "client!rs", name = "zh", descriptor = "Z")
	public boolean aBoolean636;

	@OriginalMember(owner = "client!rs", name = "Ch", descriptor = "Z")
	private boolean aBoolean637;

	@OriginalMember(owner = "client!rs", name = "Jf", descriptor = "Z")
	public boolean aBoolean615;

	@OriginalMember(owner = "client!rs", name = "Sg", descriptor = "Z")
	private final boolean aBoolean629;

	@OriginalMember(owner = "client!rs", name = "De", descriptor = "Lclient!to;")
	private final Class339 aClass339_1;

	@OriginalMember(owner = "client!rs", name = "Oe", descriptor = "Lclient!sca;")
	public final Class313 aClass313_1;

	@OriginalMember(owner = "client!rs", name = "Ae", descriptor = "Lclient!di;")
	private final Class74 aClass74_1;

	@OriginalMember(owner = "client!rs", name = "Ee", descriptor = "Lclient!se;")
	private Class5_Sub46_Sub1 aClass5_Sub46_Sub1_1;

	@OriginalMember(owner = "client!rs", name = "ze", descriptor = "Lclient!dr;")
	private final Class80 aClass80_1;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class133_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class368();
		new Class273(16);
		this.bf = new Class330();
		this.aClass330_48 = new Class330();
		this.aClass330_49 = new Class330();
		this.aClass330_50 = new Class330();
		this.aClass330_51 = new Class330();
		this.aClass330_52 = new Class330();
		this.aClass330_53 = new Class330();
		this.aClass113_Sub2_3 = new Class113_Sub2();
		this.aClass113_Sub2_4 = new Class113_Sub2();
		this.aClass113_Sub2_5 = new Class113_Sub2();
		this.aFloatArray65 = new float[4];
		this.aClass5_Sub11Array8 = new Class5_Sub11[Static362.anInt6061];
		this.anInt8547 = 0;
		this.aFloat158 = 0.0F;
		this.anInt8545 = 50;
		this.anInt8552 = 0;
		this.aFloat161 = -1.0F;
		this.anInt8544 = 0;
		this.anInt8556 = -1;
		this.anInt8546 = 0;
		this.anInt8549 = 0;
		this.anInt8557 = 8448;
		this.anInt8542 = 0;
		this.aBoolean627 = false;
		this.aFloatArray66 = new float[16];
		this.aFloatArray68 = new float[4];
		this.anInt8554 = 0;
		this.anInt8563 = 8448;
		this.anInt8555 = 0;
		this.aFloat151 = 1.0F;
		this.aFloat152 = 3584.0F;
		this.aBoolean624 = true;
		this.aFloat164 = -1.0F;
		this.aFloat163 = -1.0F;
		this.anInt8553 = 0;
		this.aFloat159 = 1.0F;
		this.aFloatArray67 = new float[4];
		this.anInt8550 = 512;
		this.aFloat166 = 1.0F;
		this.anInt8559 = 0;
		this.anInt8572 = 3584;
		this.anInt8567 = -1;
		this.anInt8562 = -1;
		this.aFloat162 = 1.0F;
		this.anInt8569 = -1;
		this.anInt8573 = -1;
		this.anInt8564 = 512;
		this.aFloat153 = 1.0F;
		this.aFloat149 = -1.0F;
		this.aFloat165 = 3584.0F;
		this.aFloatArray69 = new float[4];
		this.aClass5_Sub22_Sub2_3 = new Class5_Sub22_Sub2(8192);
		this.aByteArray91 = new byte[16384];
		this.anIntArray478 = new int[1];
		this.anIntArray480 = new int[1];
		this.anIntArray479 = new int[1];
		this.anInt8526 = arg2;
		this.aCanvas19 = this.aCanvas20 = arg0;
		if (!Static82.method1382("jaclib")) {
			throw new RuntimeException("");
		} else if (Static82.method1382("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong210 = this.aLong209 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt8526);
				if (this.aLong209 == 0L) {
					throw new RuntimeException("");
				}
				this.method7345();
				@Pc(335) int local335 = this.method7365();
				if (local335 != 0) {
					throw new RuntimeException("");
				}
				this.anInt8566 = this.aBoolean611 ? 33639 : 5121;
				if (this.aString97.indexOf("radeon") != -1) {
					@Pc(361) int local361 = 0;
					@Pc(363) boolean local363 = false;
					@Pc(365) boolean local365 = false;
					@Pc(374) String[] local374 = Static481.method7093(this.aString97.replace('/', ' '), ' ');
					for (@Pc(376) int local376 = 0; local376 < local374.length; local376++) {
						@Pc(382) String local382 = local374[local376];
						try {
							if (local382.length() > 0) {
								if (local382.charAt(0) == 'x' && local382.length() >= 3 && Static495.method7354(local382.substring(1, 3))) {
									local365 = true;
									local382 = local382.substring(1);
								}
								if (local382.equals("hd")) {
									local363 = true;
								} else {
									if (local382.startsWith("hd")) {
										local363 = true;
										local382 = local382.substring(2);
									}
									if (local382.length() >= 4 && Static495.method7354(local382.substring(0, 4))) {
										local361 = Static548.method7986(local382.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(447) Exception local447) {
						}
					}
					if (!local365 && !local363) {
						if (local361 >= 7000 && local361 <= 7999) {
							this.aBoolean626 = false;
						}
						if (local361 >= 7000 && local361 <= 9250) {
							this.aBoolean613 = false;
						}
					}
					if (!local363 || local361 < 4000) {
						this.aBoolean621 = false;
					}
					this.aBoolean622 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean636 = true;
					this.aBoolean637 = this.aBoolean626;
				}
				if (this.aString98.indexOf("intel") != -1) {
					this.aBoolean615 = false;
				}
				this.aBoolean629 = !this.aString98.equals("s3 graphics");
				if (this.aBoolean626) {
					try {
						@Pc(531) int[] local531 = new int[1];
						OpenGL.glGenBuffersARB(1, local531, 0);
					} catch (@Pc(537) Throwable local537) {
						throw new RuntimeException("");
					}
				}
				Static627.method8869(true, false);
				this.aBoolean606 = true;
				this.aClass339_1 = new Class339(this, super.anInterface3_12);
				this.method7376();
				this.aClass313_1 = new Class313(this);
				this.aClass74_1 = new Class74(this);
				if (this.aClass74_1.method1620()) {
					this.aClass5_Sub46_Sub1_1 = new Class5_Sub46_Sub1(this);
					if (!this.aClass5_Sub46_Sub1_1.method7582()) {
						this.aClass5_Sub46_Sub1_1.method7581();
						this.aClass5_Sub46_Sub1_1 = null;
					}
				}
				this.aClass80_1 = new Class80(this);
				this.method7330();
				this.method7353();
				this.method7247();
			} catch (@Pc(611) Throwable local611) {
				local611.printStackTrace();
				this.method7236();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
	private void method7323() {
		Static204.aFloatArray23[3] = 1.0F;
		Static204.aFloatArray23[2] = this.aFloat149 * this.aFloat159;
		Static204.aFloatArray23[0] = this.aFloat153 * this.aFloat149;
		Static204.aFloatArray23[1] = this.aFloat151 * this.aFloat149;
		OpenGL.glLightfv(16384, 4609, Static204.aFloatArray23, 0);
		Static204.aFloatArray23[3] = 1.0F;
		Static204.aFloatArray23[2] = this.aFloat159 * -this.aFloat163;
		Static204.aFloatArray23[1] = -this.aFloat163 * this.aFloat151;
		Static204.aFloatArray23[0] = -this.aFloat163 * this.aFloat153;
		OpenGL.glLightfv(16385, 4609, Static204.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "(II)I")
	public int method7324(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!rs", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt8529 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt8529++;
		}
		this.anInt8531 = 0x1 << this.anInt8529;
	}

	@OriginalMember(owner = "client!rs", name = "A", descriptor = "()Z")
	@Override
	public boolean method7319() {
		return this.aClass5_Sub46_Sub1_1 != null && this.aClass5_Sub46_Sub1_1.method7575();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!b;IIII)Lclient!ka;")
	@Override
	public Class187 method7256(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class187_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "()Lclient!tc;")
	@Override
	public Class113 method7262() {
		return this.aClass113_Sub2_1;
	}

	@OriginalMember(owner = "client!rs", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean631) {
			throw new RuntimeException("");
		}
		this.anInt8565 = arg0;
		this.anInt8556 = arg2;
		this.anInt8562 = arg1;
		this.anInt8552 = arg3;
		if (this.aBoolean627) {
			this.aClass80_1.aClass39_Sub3_1.method1550();
			this.aClass80_1.aClass39_Sub3_1.method1549();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)V")
	public void method7325(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean616) {
			this.aBoolean616 = arg0;
			this.method7339();
			this.anInt8540 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(IIII)V")
	public void method7326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7303(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas20) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable6.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([IIIIIZ)Lclient!it;")
	@Override
	public Class28 method7312(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class28_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIZ)Lclient!it;")
	@Override
	public Class28 method7258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class28_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!mp;I)V")
	@Override
	public void method7302(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1) {
		this.aClass173_1.method4171(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I[Lclient!vt;)V")
	@Override
	public void method7286(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub11[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass5_Sub11Array8[local7] = arg1[local7];
		}
		this.anInt8571 = arg0;
		if (this.anInt8560 != 1) {
			this.method7334();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!vm;Lclient!vm;FLclient!vm;)Lclient!vm;")
	@Override
	public Class130 method7259(@OriginalArg(0) Class130 arg0, @OriginalArg(1) Class130 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class130 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean625 && this.aBoolean615) {
			@Pc(15) Class130_Sub2_Sub2 local15 = null;
			@Pc(18) Class130_Sub2 local18 = (Class130_Sub2) arg0;
			@Pc(21) Class130_Sub2 local21 = (Class130_Sub2) arg1;
			@Pc(25) Class167_Sub1 local25 = local18.method5475();
			@Pc(29) Class167_Sub1 local29 = local21.method5475();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt4402 < local25.anInt4402 ? local25.anInt4402 : local29.anInt4402;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class130_Sub2_Sub2) {
					@Pc(56) Class130_Sub2_Sub2 local56 = (Class130_Sub2_Sub2) arg3;
					if (local44 == local56.method5479()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class130_Sub2_Sub2(this, local44);
				}
				if (local15.method5481(arg2, local25, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)V")
	public void method7329() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "(I)V")
	private void method7330() {
		this.method7395(-2);
		for (@Pc(14) int local14 = this.anInt8541 - 1; local14 >= 0; local14--) {
			this.method7368(local14);
			this.method7375(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method7342(8448, 8448);
		this.method7326(2, 34168, 770);
		this.method7361();
		this.anInt8538 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt8539 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean607 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean609 = true;
		this.method7325(true);
		this.method7359(true);
		this.method7386(true);
		this.method7346(true);
		this.method7379();
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
		@Pc(131) float[] local131 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(133) int local133 = 0; local133 < 8; local133++) {
			@Pc(139) int local139 = local133 + 16384;
			OpenGL.glLightfv(local139, 4608, local131, 0);
			OpenGL.glLightf(local139, 4615, 0.0F);
			OpenGL.glLightf(local139, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt8567 = this.anInt8569 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(Z)V")
	public void method7331() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "(Z)V")
	private void method7332() {
		@Pc(6) float[] local6 = this.aFloatArray66;
		@Pc(18) float local18 = (float) (this.anInt8545 * -this.anInt8544) / (float) this.anInt8564;
		@Pc(33) float local33 = (float) (this.anInt8545 * (this.anInt8510 - this.anInt8544)) / (float) this.anInt8564;
		@Pc(48) float local48 = (float) (this.anInt8545 * this.anInt8549) / (float) this.anInt8550;
		@Pc(63) float local63 = (float) ((this.anInt8549 - this.anInt8481) * this.anInt8545) / (float) this.anInt8550;
		if (local33 == local18 || local63 == local48) {
			local6[4] = 0.0F;
			local6[14] = 0.0F;
			local6[5] = 1.0F;
			local6[3] = 0.0F;
			local6[9] = 0.0F;
			local6[7] = 0.0F;
			local6[1] = 0.0F;
			local6[0] = 1.0F;
			local6[10] = 1.0F;
			local6[15] = 1.0F;
			local6[11] = 0.0F;
			local6[12] = 0.0F;
			local6[8] = 0.0F;
			local6[2] = 0.0F;
			local6[13] = 0.0F;
			local6[6] = 0.0F;
		} else {
			@Pc(77) float local77 = (float) this.anInt8545 * 2.0F;
			local6[5] = local77 / (local48 - local63);
			local6[15] = 0.0F;
			local6[10] = this.aFloat154 = (float) -(this.anInt8572 + this.anInt8545) / (float) (this.anInt8572 - this.anInt8545);
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[1] = 0.0F;
			local6[7] = 0.0F;
			local6[14] = this.aFloat157 = -(local77 * (float) this.anInt8572) / (float) (this.anInt8572 - this.anInt8545);
			local6[12] = 0.0F;
			local6[0] = local77 / (local33 - local18);
			local6[8] = (local18 + local33) / (local33 - local18);
			local6[6] = 0.0F;
			local6[11] = -1.0F;
			local6[2] = 0.0F;
			local6[13] = 0.0F;
			local6[9] = (local48 + local63) / (-local63 + local48);
		}
		this.method7400();
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)V")
	@Override
	public void method7265(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(JZ)V")
	public synchronized void method7333(@OriginalArg(0) long arg0) {
		@Pc(7) Class5 local7 = new Class5();
		local7.aLong278 = arg0;
		this.aClass330_53.method7917(local7);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!mp;)V")
	@Override
	public void method7308(@OriginalArg(0) Class235 arg0) {
		this.aClass173_1.method4171(this, -1, arg0);
	}

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "(Z)V")
	private void method7334() {
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.anInt8571; local13++) {
			@Pc(20) Class5_Sub11 local20 = this.aClass5_Sub11Array8[local13];
			Static472.aFloatArray64[0] = local20.method8103();
			@Pc(32) int local32 = local13 + 16386;
			Static472.aFloatArray64[1] = local20.method8096();
			Static472.aFloatArray64[2] = local20.method8098();
			Static472.aFloatArray64[3] = 1.0F;
			OpenGL.glLightfv(local32, 4611, Static472.aFloatArray64, 0);
			@Pc(59) int local59 = local20.method8102();
			@Pc(65) float local65 = local20.method8101() / 255.0F;
			Static472.aFloatArray64[2] = (float) (local59 & 0xFF) * local65;
			Static472.aFloatArray64[1] = local65 * (float) (local59 >> 8 & 0xFF);
			Static472.aFloatArray64[0] = (float) (local59 >> 16 & 0xFF) * local65;
			OpenGL.glLightfv(local32, 4609, Static472.aFloatArray64, 0);
			OpenGL.glLightf(local32, 4617, 1.0F / (float) (local20.method8099() * local20.method8099()));
			OpenGL.glEnable(local32);
		}
		while (this.anInt8543 > local13) {
			OpenGL.glDisable(local13 + 16386);
			local13++;
		}
		this.anInt8543 = this.anInt8571;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!sda;B)V")
	public void method7335(@OriginalArg(0) Interface21 arg0) {
		if (this.anInterface21_4 != arg0) {
			if (this.aBoolean626) {
				OpenGL.glBindBufferARB(34963, arg0.method8973());
			}
			this.anInterface21_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!qr;)V")
	public void method7337(@OriginalArg(1) Interface19 arg0) {
		if (this.anInt8534 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8534 >= 0) {
			this.anInterface19Array1[this.anInt8534].method4333();
		}
		this.anInterface19_2 = this.anInterface19Array1[++this.anInt8534] = arg0;
		this.anInterface19_2.method4331();
	}

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "()Z")
	@Override
	public boolean method7249() {
		return this.aBoolean635 && (!this.method7319() || this.aBoolean614);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIBI)V")
	public void method7338(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7273(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas20 == arg0) {
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

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(B)V")
	private void method7339() {
		if (this.aBoolean616 && this.anInt8573 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "(II)I")
	public int method7340(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(Z)V")
	@Override
	public void method7289(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZI[BI)Lclient!js;")
	public Interface10 method7341(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		return (Interface10) (this.aBoolean626 && (!arg0 || this.aBoolean637) ? new Class278_Sub1(this, arg3, arg2, arg1, arg0) : new Class164_Sub1(this, arg3, arg2, arg1));
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)V")
	public void method7342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt8570 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt8563 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local11 = true;
			this.anInt8563 = arg1;
		}
		if (arg0 != this.anInt8557) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local11 = true;
			this.anInt8557 = arg0;
		}
		if (local11) {
			this.anInt8540 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!o;)V")
	public void method7343(@OriginalArg(1) Class113_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method5673(), 0);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "()V")
	@Override
	public void method7234() {
		if (this.aClass5_Sub46_Sub1_1 != null && this.aClass5_Sub46_Sub1_1.method7575()) {
			this.aClass74_1.method1619(this.aClass5_Sub46_Sub1_1);
			this.aClass339_1.method7987();
		}
	}

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "(II)V")
	public void method7344(@OriginalArg(0) int arg0) {
		Static204.aFloatArray23[3] = (float) (arg0 >>> 24) / 255.0F;
		Static204.aFloatArray23[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static204.aFloatArray23[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static204.aFloatArray23[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static204.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "(B)V")
	private void method7345() {
		@Pc(15) int local15 = 0;
		while (!this.anOpenGL2.a()) {
			if (local15++ > 5) {
				throw new RuntimeException("");
			}
			Static314.method4821(1000L);
		}
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(II)V")
	@Override
	public void method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!rs", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt8481 - arg1 - local12, arg2, 1, 32993, this.anInt8566, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BZ)V")
	public void method7346(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean608 != arg0) {
			this.aBoolean608 = arg0;
			this.method7358();
			this.anInt8540 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static360.method5375(arg1, arg2, this, arg0, arg3);
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(IIII)V")
	public void method7347(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "()V")
	@Override
	public void method7247() {
		if (!this.aBoolean629 || this.anInt8510 <= 0 || this.anInt8481 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt8555;
		@Pc(25) int local25 = this.anInt8559;
		@Pc(28) int local28 = this.anInt8554;
		@Pc(31) int local31 = this.anInt8547;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7379();
		this.method7325(false);
		this.method7359(false);
		this.method7386(false);
		this.method7346(false);
		this.method7375(null);
		this.method7395(-2);
		this.method7401(1);
		this.method7388(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt8510, this.anInt8481, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!rs", name = "x", descriptor = "()Z")
	@Override
	public boolean method7314() {
		return true;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7263() {
		this.method7355();
		this.method7388(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "(I)V")
	private void method7348() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(IZ)V")
	public void method7349(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean612 != arg0) {
			this.aBoolean612 = arg0;
			this.method7372();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7321(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static437.aFloat138 = arg1;
		Static88.aFloat31 = arg0;
		Static541.aFloat173 = arg2;
	}

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)V")
	@Override
	public void method7278(@OriginalArg(0) int arg0) {
		this.method7345();
	}

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "(I)V")
	private void method7350() {
		if (this.anInt8560 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt8510 > 0 && this.anInt8481 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt8510, (double) this.anInt8481, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt8560 = 1;
		this.anInt8540 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(FFFI)V")
	private void method7351(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean633) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg0, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean633 = true;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method7252(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class5_Sub41 local19;
		while (!this.aClass330_48.method7918()) {
			local19 = (Class5_Sub41) this.aClass330_48.method7911();
			Static336.anIntArray312[local11++] = (int) local19.aLong278;
			this.anInt8537 -= local19.anInt7600;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static336.anIntArray312, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static336.anIntArray312, 0);
			local11 = 0;
		}
		while (!this.aClass330_49.method7918()) {
			local19 = (Class5_Sub41) this.aClass330_49.method7911();
			Static336.anIntArray312[local11++] = (int) local19.aLong278;
			this.anInt8536 -= local19.anInt7600;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static336.anIntArray312, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static336.anIntArray312, 0);
			local11 = 0;
		}
		while (!this.aClass330_50.method7918()) {
			local19 = (Class5_Sub41) this.aClass330_50.method7911();
			Static336.anIntArray312[local11++] = local19.anInt7600;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static336.anIntArray312, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static336.anIntArray312, 0);
			local11 = 0;
		}
		while (!this.aClass330_51.method7918()) {
			local19 = (Class5_Sub41) this.aClass330_51.method7911();
			Static336.anIntArray312[local11++] = (int) local19.aLong278;
			this.anInt8535 -= local19.anInt7600;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static336.anIntArray312, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static336.anIntArray312, 0);
		}
		while (!this.bf.method7918()) {
			local19 = (Class5_Sub41) this.bf.method7911();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt7600);
		}
		@Pc(213) Class5 local213;
		while (!this.aClass330_52.method7918()) {
			local213 = this.aClass330_52.method7911();
			OpenGL.glDeleteProgramARB((int) local213.aLong278);
		}
		while (!this.aClass330_53.method7918()) {
			local213 = this.aClass330_53.method7911();
			OpenGL.glDeleteObjectARB(local213.aLong278);
		}
		while (!this.bf.method7918()) {
			local19 = (Class5_Sub41) this.bf.method7911();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt7600);
		}
		this.aClass339_1.method7989();
		if (this.E() > 100663296 && Static95.method1587() > this.aLong211 + 60000L) {
			System.gc();
			this.aLong211 = Static95.method1587();
		}
		this.anInt8530 = local9;
	}

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "()Lclient!tc;")
	@Override
	public Class113 method7275() {
		return new Class113_Sub2();
	}

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "(I)V")
	@Override
	public void method7309(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt8528 = arg0;
		this.aClass339_1.method7987();
	}

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt8545 && arg1 == this.anInt8572) {
			return;
		}
		this.anInt8572 = arg1;
		this.anInt8545 = arg0;
		this.method7332();
		this.method7405();
		if (this.anInt8560 == 3) {
			this.method7373();
		} else if (this.anInt8560 == 2) {
			this.method7367();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7239(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7282(arg2, arg3);
	}

	@OriginalMember(owner = "client!rs", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt8575;
		this.anInt8575 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([I)V")
	@Override
	public void method7248(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8510;
		arg0[1] = this.anInt8481;
	}

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "()V")
	@Override
	public void method7267() {
		if (this.aBoolean615) {
			if (this.aClass186_4 != this.anInterface19_1) {
				throw new RuntimeException();
			}
			this.aClass186_4.method4345(0);
			this.aClass186_4.method4345(8);
			this.method7363(this.aClass186_4);
		} else if (this.aBoolean619) {
			this.aClass28_Sub2_1.method4052(0, 0, this.anInt8510, this.anInt8481, 0, 0);
			this.anOpenGL2.setSurface(this.aLong210);
		} else {
			throw new RuntimeException("");
		}
		this.anInt8510 = this.anInt8439;
		this.anInt8481 = this.anInt8388;
		this.aClass28_Sub2_1 = null;
		this.method7379();
		this.method7406();
		this.la();
	}

	@OriginalMember(owner = "client!rs", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt8567 != arg0;
		if (local15 || arg1 != this.aFloat149 || this.aFloat163 != arg2) {
			this.aFloat163 = arg2;
			this.anInt8567 = arg0;
			this.aFloat149 = arg1;
			if (local15) {
				this.aFloat159 = (float) (this.anInt8567 & 0xFF) / 255.0F;
				this.aFloat151 = (float) (this.anInt8567 & 0xFF00) / 65280.0F;
				this.aFloat153 = (float) (this.anInt8567 & 0xFF0000) / 1.671168E7F;
				this.method7378();
			}
			this.method7323();
		}
		if (this.aFloatArray69[0] == arg3 && arg4 == this.aFloatArray69[1] && arg5 == this.aFloatArray69[2]) {
			return;
		}
		this.aFloatArray69[1] = arg4;
		this.aFloatArray69[0] = arg3;
		this.aFloatArray69[2] = arg5;
		this.aFloatArray65[2] = -arg5;
		this.aFloatArray65[0] = -arg3;
		this.aFloatArray65[1] = -arg4;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray67[0] = arg3 * local142;
		this.aFloatArray67[1] = arg4 * local142;
		this.aFloatArray67[2] = local142 * arg5;
		this.aFloatArray68[2] = -this.aFloatArray67[2];
		this.aFloatArray68[0] = -this.aFloatArray67[0];
		this.aFloatArray68[1] = -this.aFloatArray67[1];
		this.method7393();
		this.anInt8568 = (int) (arg3 * 256.0F / arg4);
		this.anInt8548 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7276(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas20) {
			local5 = this.aLong209;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable6.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas19) {
			this.method7353();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZ)Lclient!it;")
	@Override
	public Class28 method7290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class28_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIF)Lclient!vt;")
	@Override
	public Class5_Sub11 method7293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub11_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "(I)V")
	private void method7353() {
		if (this.aCanvas19 == null) {
			this.anInt8439 = this.anInt8388 = 0;
		} else {
			@Pc(9) Dimension local9 = this.aCanvas19.getSize();
			this.anInt8439 = local9.width;
			this.anInt8388 = local9.height;
		}
		if (this.anInterface19_1 == null) {
			this.anInt8481 = this.anInt8388;
			this.anInt8510 = this.anInt8439;
			this.method7406();
		}
		this.method7379();
		this.la();
	}

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "(II)Lclient!wm;")
	@Override
	public Interface27 method7313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "()Z")
	@Override
	public boolean method7270() {
		return true;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	@Override
	public void method7242(@OriginalArg(0) int arg0) {
		this.method7348();
	}

	@OriginalMember(owner = "client!rs", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt8572;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "(Z)V")
	private void method7355() {
		if (this.anInt8540 == 1) {
			return;
		}
		this.method7350();
		this.method7325(false);
		this.method7359(false);
		this.method7386(false);
		this.method7346(false);
		this.method7375(null);
		this.method7395(-2);
		this.method7401(1);
		this.anInt8540 = 1;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!pia;[Lclient!gu;Z)Lclient!da;")
	@Override
	public Class55 method7255(@OriginalArg(0) Class272 arg0, @OriginalArg(1) Class131[] arg1) {
		return new Class55_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!rs", name = "z", descriptor = "()Z")
	@Override
	public boolean method7317() {
		return this.aClass5_Sub46_Sub1_1 != null && (this.anInt8526 <= 1 || this.aBoolean614);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 == arg2 && arg3 == arg1) {
			return;
		}
		@Pc(19) Class1_Sub2 local19 = (Class1_Sub2) arg5;
		@Pc(22) Class167_Sub3_Sub1 local22 = local19.aClass167_Sub3_Sub1_4;
		this.method7369();
		this.method7375(local19.aClass167_Sub3_Sub1_4);
		this.method7388(1);
		this.method7342(8448, 7681);
		this.method7326(0, 34167, 768);
		@Pc(52) float local52 = local22.aFloat171 / (float) local22.anInt8741;
		@Pc(59) float local59 = local22.aFloat170 / (float) local22.anInt8742;
		@Pc(66) float local66 = (float) -arg0 + (float) arg2;
		@Pc(73) float local73 = (float) -arg1 + (float) arg3;
		@Pc(86) float local86 = (float) (1.0D / Math.sqrt((double) (local73 * local73 + local66 * local66)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(105) float local105 = local66 * local86;
		@Pc(109) float local109 = local73 * local86;
		@Pc(116) int local116 = arg10 % (arg9 + arg8);
		@Pc(121) float local121 = (float) arg8 * local105;
		@Pc(126) float local126 = local109 * (float) arg8;
		@Pc(128) float local128 = 0.0F;
		@Pc(130) float local130 = 0.0F;
		@Pc(132) float local132 = local121;
		@Pc(134) float local134 = local126;
		if (local116 <= arg8) {
			local134 = (float) (arg8 - local116) * local109;
			local132 = (float) (arg8 - local116) * local105;
		} else {
			local128 = local105 * (float) (arg9 + arg8 - local116);
			local130 = (float) (arg9 + arg8 - local116) * local109;
		}
		@Pc(185) float local185 = local128 + (float) arg0 + 0.35F;
		@Pc(192) float local192 = local130 + (float) arg1 + 0.35F;
		@Pc(197) float local197 = local105 * (float) arg9;
		@Pc(202) float local202 = (float) arg9 * local109;
		while (true) {
			if (arg0 < arg2) {
				if (local185 > (float) arg2 + 0.35F) {
					break;
				}
				if (local185 + local132 > (float) arg2) {
					local132 = (float) arg2 - local185;
				}
			} else {
				if ((float) arg2 + 0.35F > local185) {
					break;
				}
				if ((float) arg2 > local132 + local185) {
					local132 = (float) arg2 - local185;
				}
			}
			if (arg1 >= arg3) {
				if (local192 < (float) arg3 + 0.35F) {
					break;
				}
				if (local134 + local192 < (float) arg3) {
					local134 = (float) arg3 - local192;
				}
			} else {
				if ((float) arg3 + 0.35F < local192) {
					break;
				}
				if (local134 + local192 > (float) arg3) {
					local134 = (float) arg3 - local192;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(((float) -arg6 + local185) * local52, ((float) -arg7 + local192) * local59);
			OpenGL.glVertex2f(local185, local192);
			OpenGL.glTexCoord2f(local52 * ((float) -arg6 + local132 + local185), local59 * (local134 + local192 - (float) arg7));
			OpenGL.glVertex2f(local132 + local185, local134 + local192);
			OpenGL.glEnd();
			local192 += local134 + local202;
			local185 += local197 + local132;
			local132 = local121;
			local134 = local126;
		}
		this.method7326(0, 5890, 768);
	}

	@OriginalMember(owner = "client!rs", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(57) float local57;
		if (this.aClass167_Sub3_Sub1_5 == null || arg2 > this.aClass167_Sub3_Sub1_5.anInt8740 || arg3 > this.aClass167_Sub3_Sub1_5.anInt8729) {
			this.aClass167_Sub3_Sub1_5 = Static636.method8978(arg3, this, arg6, arg2);
			this.aClass167_Sub3_Sub1_5.method7524(false, false);
			local57 = this.aClass167_Sub3_Sub1_5.aFloat171;
			local45 = this.aClass167_Sub3_Sub1_5.aFloat170;
		} else {
			this.aClass167_Sub3_Sub1_5.method7520(arg2, arg3, 6406, false, arg6);
			local45 = (float) arg3 * this.aClass167_Sub3_Sub1_5.aFloat170 / (float) this.aClass167_Sub3_Sub1_5.anInt8729;
			local57 = (float) arg2 * this.aClass167_Sub3_Sub1_5.aFloat171 / (float) this.aClass167_Sub3_Sub1_5.anInt8740;
		}
		this.method7369();
		this.method7375(this.aClass167_Sub3_Sub1_5);
		this.method7388(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method7344(arg5);
		this.method7342(34165, 34165);
		this.method7326(0, 34166, 768);
		this.method7326(2, 5890, 770);
		this.method7347(34166, 0);
		this.method7347(5890, 2);
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
		this.method7326(0, 5890, 768);
		this.method7326(2, 34166, 770);
		this.method7347(5890, 0);
		this.method7347(34166, 2);
	}

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "(I)Lclient!za;")
	@Override
	public Class5_Sub6 method7300(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub6_Sub1 local8 = new Class5_Sub6_Sub1(arg0);
		this.aClass330_47.method7917(local8);
		return local8;
	}

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "(B)V")
	private void method7356() {
		this.aFloat156 = this.anInt8547 - this.anInt8549;
		this.aFloat167 = this.anInt8555 - this.anInt8544;
		this.aFloat160 = this.anInt8559 - this.anInt8544;
		this.aFloat169 = this.anInt8554 - this.anInt8549;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass74_1.method1621(arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBI)V")
	public synchronized void method7357(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub41 local8 = new Class5_Sub41(arg0);
		local8.aLong278 = arg1;
		this.aClass330_51.method7917(local8);
	}

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "(Z)V")
	private void method7358() {
		OpenGL.glDepthMask(this.aBoolean608 && this.aBoolean624);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI)V")
	public void method7359(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean617) {
			this.aBoolean617 = arg0;
			this.method7372();
			this.anInt8540 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "()V")
	@Override
	public void method7305() {
		this.aClass74_1.method1617();
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(BLclient!qr;)V")
	public void method7360(@OriginalArg(1) Interface19 arg0) {
		if (this.anInt8532 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8532 >= 0) {
			this.anInterface19Array3[this.anInt8532].method4330();
		}
		this.anInterface19_1 = this.anInterface19Array3[++this.anInt8532] = arg0;
		this.anInterface19_1.method4329();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7235(@OriginalArg(0) Class5_Sub6 arg0) {
		this.aNativeHeap5 = ((Class5_Sub6_Sub1) arg0).aNativeHeap1;
		if (this.anInterface10_5 != null) {
			return;
		}
		@Pc(16) Class5_Sub22_Sub2 local16 = new Class5_Sub22_Sub2(80);
		if (this.aBoolean611) {
			local16.method5969(-1.0F);
			local16.method5969(-1.0F);
			local16.method5969(0.0F);
			local16.method5969(0.0F);
			local16.method5969(1.0F);
			local16.method5969(1.0F);
			local16.method5969(-1.0F);
			local16.method5969(0.0F);
			local16.method5969(1.0F);
			local16.method5969(1.0F);
			local16.method5969(1.0F);
			local16.method5969(1.0F);
			local16.method5969(0.0F);
			local16.method5969(1.0F);
			local16.method5969(0.0F);
			local16.method5969(-1.0F);
			local16.method5969(1.0F);
			local16.method5969(0.0F);
			local16.method5969(0.0F);
			local16.method5969(0.0F);
		} else {
			local16.method5970(-1.0F);
			local16.method5970(-1.0F);
			local16.method5970(0.0F);
			local16.method5970(0.0F);
			local16.method5970(1.0F);
			local16.method5970(1.0F);
			local16.method5970(-1.0F);
			local16.method5970(0.0F);
			local16.method5970(1.0F);
			local16.method5970(1.0F);
			local16.method5970(1.0F);
			local16.method5970(1.0F);
			local16.method5970(0.0F);
			local16.method5970(1.0F);
			local16.method5970(0.0F);
			local16.method5970(-1.0F);
			local16.method5970(1.0F);
			local16.method5970(0.0F);
			local16.method5970(0.0F);
			local16.method5970(0.0F);
		}
		this.anInterface10_5 = this.method7341(false, local16.anInt6629, local16.aByteArray71, 20);
		this.aClass18_7 = new Class18(this.anInterface10_5, 5126, 3, 0);
		this.aClass18_8 = new Class18(this.anInterface10_5, 5126, 2, 12);
		this.aClass173_1.method4166(this);
	}

	@OriginalMember(owner = "client!rs", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7346(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)Lclient!hu;")
	@Override
	public Interface7 method7271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "(I)V")
	private void method7361() {
		if (this.aBoolean633) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean633 = false;
		}
	}

	@OriginalMember(owner = "client!rs", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(III)V")
	public synchronized void method7362(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub41 local13 = new Class5_Sub41(arg1);
		local13.aLong278 = arg0;
		this.aClass330_48.method7917(local13);
	}

	@OriginalMember(owner = "client!rs", name = "v", descriptor = "()Z")
	@Override
	public boolean method7310() {
		if (this.aClass5_Sub46_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass5_Sub46_Sub1_1.method7575()) {
			if (!this.aClass74_1.method1618(this.aClass5_Sub46_Sub1_1)) {
				return false;
			}
			this.aClass339_1.method7987();
		}
		return true;
	}

	@OriginalMember(owner = "client!rs", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat150 != arg0) {
			this.aFloat150 = arg0;
			this.method7378();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!qr;)V")
	public void method7363(@OriginalArg(1) Interface19 arg0) {
		if (this.aBoolean623) {
			this.method7394(arg0);
			this.method7402(arg0);
		} else if (this.anInt8533 >= 0 && this.anInterface19Array2[this.anInt8533] == arg0) {
			this.anInterface19Array2[this.anInt8533--] = null;
			arg0.method4334();
			if (this.anInt8533 < 0) {
				this.anInterface19_2 = this.anInterface19_1 = null;
			} else {
				this.anInterface19_2 = this.anInterface19_1 = this.anInterface19Array2[this.anInt8533];
				this.anInterface19_2.method4332();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!o;I)V")
	public void method7364(@OriginalArg(0) Class113_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method5673(), 0);
	}

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "(B)I")
	private int method7365() {
		@Pc(5) int local5 = 0;
		this.aString98 = OpenGL.glGetString(7936).toLowerCase();
		this.aString97 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString98.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString98.indexOf("brian paul") != -1 || this.aString98.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static481.method7093(local46.replace('.', ' '), ' ');
		if (local54.length >= 2) {
			try {
				@Pc(64) int local64 = Static548.method7986(local54[0]);
				@Pc(70) int local70 = Static548.method7986(local54[1]);
				this.anInt8551 = local70 + local64 * 10;
			} catch (@Pc(79) NumberFormatException local79) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt8551 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(120) int[] local120 = new int[1];
		OpenGL.glGetIntegerv(34018, local120, 0);
		this.anInt8541 = local120[0];
		OpenGL.glGetIntegerv(34929, local120, 0);
		this.anInt8561 = local120[0];
		OpenGL.glGetIntegerv(34930, local120, 0);
		this.anInt8558 = local120[0];
		if (this.anInt8541 < 2 || this.anInt8561 < 2 || this.anInt8558 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean611 = Stream.a();
		this.aBoolean619 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean626 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean635 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean634 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean630 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean628 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean613 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean622 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean625 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean621 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean620 = false;
		this.aBoolean615 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean623 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean618 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean614 = this.aBoolean618 & this.aBoolean623;
		this.aBoolean632 = Class273.aString81.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static204.aFloatArray23, 0);
		this.aFloat164 = Static204.aFloatArray23[0];
		this.aFloat161 = Static204.aFloatArray23[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "(I)V")
	private void method7366() {
		if (this.anInt8555 <= this.anInt8559 && this.anInt8554 <= this.anInt8547) {
			OpenGL.glScissor(this.anInt8555 + this.anInt8546, -this.anInt8547 + this.anInt8553 + this.anInt8481, this.anInt8559 - this.anInt8555, this.anInt8547 + -this.anInt8554);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7304(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "(I)V")
	private void method7367() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray66, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rs", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass113_Sub2_3.aFloat109 * (float) arg1 + (float) arg0 * this.aClass113_Sub2_3.aFloat108 + (float) arg2 * this.aClass113_Sub2_3.aFloat102 + this.aClass113_Sub2_3.aFloat105;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((this.aClass113_Sub2_3.aFloat101 * (float) arg2 + (float) arg0 * this.aClass113_Sub2_3.aFloat103 + this.aClass113_Sub2_3.aFloat107 * (float) arg1 + this.aClass113_Sub2_3.aFloat106) * (float) this.anInt8564 / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat167);
		@Pc(118) int local118 = (int) ((this.aClass113_Sub2_3.aFloat110 + (float) arg2 * this.aClass113_Sub2_3.aFloat112 + (float) arg0 * this.aClass113_Sub2_3.aFloat111 + (float) arg1 * this.aClass113_Sub2_3.aFloat104) * (float) this.anInt8550 / local28);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local118 - this.aFloat169);
	}

	@OriginalMember(owner = "client!rs", name = "w", descriptor = "()Z")
	@Override
	public boolean method7311() {
		return true;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)V")
	public void method7368(@OriginalArg(0) int arg0) {
		if (this.anInt8570 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt8570 = arg0;
		}
	}

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "(B)V")
	public void method7369() {
		if (this.anInt8540 == 2) {
			return;
		}
		this.method7350();
		this.method7325(false);
		this.method7359(false);
		this.method7386(false);
		this.method7346(false);
		this.method7395(-2);
		this.anInt8540 = 2;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7291(@OriginalArg(0) Canvas arg0) {
		this.aCanvas19 = null;
		this.aLong210 = 0L;
		if (arg0 == null || arg0 == this.aCanvas20) {
			this.aLong210 = this.aLong209;
			this.aCanvas19 = this.aCanvas20;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable6.get(arg0);
			this.aLong210 = local26;
			this.aCanvas19 = arg0;
		}
		if (this.aCanvas19 == null || this.aLong210 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong210);
		this.method7353();
	}

	@OriginalMember(owner = "client!rs", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8544 = arg0;
		this.anInt8549 = arg1;
		this.anInt8550 = arg3;
		this.anInt8564 = arg2;
		this.method7332();
		this.method7356();
		if (this.anInt8560 == 3) {
			this.method7373();
		} else if (this.anInt8560 == 2) {
			this.method7367();
		}
	}

	@OriginalMember(owner = "client!rs", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass113_Sub2_3.aFloat105 + (float) arg0 * this.aClass113_Sub2_3.aFloat108 + this.aClass113_Sub2_3.aFloat109 * (float) arg1 + (float) arg2 * this.aClass113_Sub2_3.aFloat102;
		if (local28 < (float) this.anInt8545 || (float) this.anInt8572 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt8564 * (this.aClass113_Sub2_3.aFloat106 + (float) arg0 * this.aClass113_Sub2_3.aFloat103 + (float) arg1 * this.aClass113_Sub2_3.aFloat107 + this.aClass113_Sub2_3.aFloat101 * (float) arg2) / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt8550 * ((float) arg2 * this.aClass113_Sub2_3.aFloat112 + (float) arg1 * this.aClass113_Sub2_3.aFloat104 + this.aClass113_Sub2_3.aFloat111 * (float) arg0 + this.aClass113_Sub2_3.aFloat110) / local28);
		if (this.aFloat167 <= (float) local85 && this.aFloat160 >= (float) local85 && (float) local117 >= this.aFloat169 && this.aFloat156 >= (float) local117) {
			arg3[0] = (int) ((float) local85 - this.aFloat167);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat169);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZLclient!js;)V")
	public void method7370(@OriginalArg(1) Interface10 arg0) {
		if (arg0 != this.anInterface10_4) {
			if (this.aBoolean626) {
				OpenGL.glBindBufferARB(34962, arg0.method8856());
			}
			this.anInterface10_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(Z)V")
	@Override
	public void method7274(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rs", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean631 = false;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([BBZII)Lclient!sda;")
	public Interface21 method7371(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2) {
		return (Interface21) (this.aBoolean626 && (!arg1 || this.aBoolean637) ? new Class278_Sub2(this, 5123, arg0, arg2, arg1) : new Class164_Sub2(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "(I)V")
	private void method7372() {
		if (this.aBoolean617 && !this.aBoolean612) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!rs", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt8510) {
			arg2 = this.anInt8510;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt8481) {
			arg3 = this.anInt8481;
		}
		this.anInt8547 = arg3;
		this.anInt8559 = arg2;
		this.anInt8554 = arg1;
		this.anInt8555 = arg0;
		OpenGL.glEnable(3089);
		this.method7356();
		this.method7366();
	}

	@OriginalMember(owner = "client!rs", name = "t", descriptor = "(I)V")
	private void method7373() {
		@Pc(15) float local15 = this.aFloat166 * (float) -this.anInt8544 / (float) this.anInt8564;
		@Pc(27) float local27 = this.aFloat166 * (float) -this.anInt8549 / (float) this.anInt8550;
		@Pc(48) float local48 = (float) (this.anInt8510 - this.anInt8544) * this.aFloat166 / (float) this.anInt8564;
		@Pc(63) float local63 = this.aFloat166 * (float) (this.anInt8481 - this.anInt8549) / (float) this.anInt8550;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local48 && local63 != local27) {
			OpenGL.glOrtho((double) local15, (double) local48, (double) -local63, (double) -local27, (double) this.anInt8545, (double) this.anInt8572);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "()V")
	@Override
	public void method7298() {
	}

	@OriginalMember(owner = "client!rs", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean624 = arg0;
		this.method7358();
	}

	@OriginalMember(owner = "client!rs", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7355();
		this.method7388(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(III)V")
	public synchronized void method7374(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub41 local13 = new Class5_Sub41(arg0);
		local13.aLong278 = arg1;
		this.aClass330_49.method7917(local13);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!nba;I)V")
	public void method7375(@OriginalArg(0) Class167 arg0) {
		@Pc(15) Class167 local15 = this.aClass167Array1[this.anInt8570];
		if (arg0 != local15) {
			if (arg0 == null) {
				OpenGL.glDisable(local15.anInt9270);
			} else {
				if (local15 == null) {
					OpenGL.glEnable(arg0.anInt9270);
				} else if (arg0.anInt9270 != local15.anInt9270) {
					OpenGL.glDisable(local15.anInt9270);
					OpenGL.glEnable(arg0.anInt9270);
				}
				OpenGL.glBindTexture(arg0.anInt9270, arg0.method8002());
			}
			this.aClass167Array1[this.anInt8570] = arg0;
		}
		this.anInt8540 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "(I)V")
	private void method7376() {
		this.aClass167Array1 = new Class167[this.anInt8541];
		this.aClass167_Sub3_4 = new Class167_Sub3(this, 3553, 6408, 1, 1);
		new Class167_Sub3(this, 3553, 6408, 1, 1);
		new Class167_Sub3(this, 3553, 6408, 1, 1);
		this.aClass187_Sub3_3 = new Class187_Sub3(this);
		this.aClass187_Sub3_4 = new Class187_Sub3(this);
		this.aClass187_Sub3_1 = new Class187_Sub3(this);
		this.aClass187_Sub3_2 = new Class187_Sub3(this);
		this.aClass187_Sub3_10 = new Class187_Sub3(this);
		this.aClass187_Sub3_5 = new Class187_Sub3(this);
		this.aClass187_Sub3_9 = new Class187_Sub3(this);
		this.aClass187_Sub3_7 = new Class187_Sub3(this);
		this.aClass187_Sub3_8 = new Class187_Sub3(this);
		this.aClass187_Sub3_6 = new Class187_Sub3(this);
		if (this.aBoolean615) {
			this.aClass186_5 = new Class186(this);
			new Class186(this);
		}
	}

	@OriginalMember(owner = "client!rs", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt8544, this.anInt8549, this.anInt8564, this.anInt8550 };
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "()Z")
	@Override
	public boolean method7237() {
		return true;
	}

	@OriginalMember(owner = "client!rs", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8552 = arg3;
		this.anInt8562 = arg1;
		this.anInt8556 = arg2;
		this.aBoolean631 = true;
		this.anInt8565 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "()Lclient!qm;")
	@Override
	public Class294 method7281() {
		@Pc(7) int local7 = -1;
		if (this.aString98.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString98.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString98.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class294(local7, "OpenGL", this.anInt8551, this.aString97, 0L);
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "()Z")
	@Override
	public boolean method7241() {
		return false;
	}

	@OriginalMember(owner = "client!rs", name = "v", descriptor = "(I)V")
	public void method7377() {
		if (this.anInt8540 == 16) {
			return;
		}
		this.method7407();
		this.method7325(true);
		this.method7386(true);
		this.method7346(true);
		this.method7388(1);
		this.anInt8540 = 16;
	}

	@OriginalMember(owner = "client!rs", name = "w", descriptor = "(I)V")
	private void method7378() {
		Static204.aFloatArray23[2] = this.aFloat159 * this.aFloat150;
		Static204.aFloatArray23[0] = this.aFloat150 * this.aFloat153;
		Static204.aFloatArray23[1] = this.aFloat150 * this.aFloat151;
		Static204.aFloatArray23[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static204.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!rs", name = "x", descriptor = "(I)V")
	public void method7379() {
		if (this.anInt8560 != 0) {
			this.anInt8560 = 0;
			this.anInt8540 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "(IIIIII)Lclient!vm;")
	@Override
	public Class130 method7318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean625 ? new Class130_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBZ)V")
	public void method7380(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method7404(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!rs", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt8555 > arg0 + arg2 || arg0 - arg2 > this.anInt8559 || this.anInt8554 > arg2 + arg1 || this.anInt8547 < arg1 - arg2) {
			return;
		}
		this.method7355();
		this.method7388(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(65) float local65 = (float) arg0 + 0.35F;
		@Pc(70) float local70 = (float) arg1 + 0.35F;
		@Pc(74) int local74 = arg2 << 1;
		if ((float) local74 < this.aFloat164) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local65 + 1.0F, local70 + 1.0F);
			OpenGL.glVertex2f(local65 + 1.0F, -1.0F + local70);
			OpenGL.glVertex2f(local65 - 1.0F, local70 - 1.0F);
			OpenGL.glVertex2f(local65 - 1.0F, local70 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat161 >= (float) local74) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local74);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local65, local70);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local65, local70);
			@Pc(129) int local129 = 262144 / (arg2 * 6);
			if (local129 <= 64) {
				local129 = 64;
			} else if (local129 > 512) {
				local129 = 512;
			}
			local129 = Static460.method6846(local129);
			OpenGL.glVertex2f(local65 + (float) arg2, local70);
			for (@Pc(158) int local158 = 16384 - local129; local158 > 0; local158 -= local129) {
				OpenGL.glVertex2f(Class374.aFloatArray81[local158] * (float) arg2 + local65, Class374.aFloatArray80[local158] * (float) arg2 + local70);
			}
			OpenGL.glVertex2f(local65 + (float) arg2, local70);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "(II)I")
	public int method7381(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "(II)V")
	public synchronized void method7382(@OriginalArg(0) int arg0) {
		@Pc(13) Class5 local13 = new Class5();
		local13.aLong278 = arg0;
		this.aClass330_52.method7917(local13);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZIILclient!sda;)V")
	public void method7383(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Interface21 arg2) {
		@Pc(7) int local7 = arg2.method8971();
		@Pc(14) int local14 = arg0 * this.method7340(local7);
		this.method7335(arg2);
		OpenGL.glDrawElements(4, arg1, local7, (long) local14 + arg2.method8972());
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BF)V")
	public void method7384(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat166) {
			this.aFloat166 = arg0;
			if (this.anInt8560 == 3) {
				this.method7373();
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg1 * this.aClass113_Sub2_3.aFloat109 + (float) arg0 * this.aClass113_Sub2_3.aFloat108 + (float) arg2 * this.aClass113_Sub2_3.aFloat102 + this.aClass113_Sub2_3.aFloat105;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass113_Sub2_3.aFloat105 + this.aClass113_Sub2_3.aFloat102 * (float) arg5 + this.aClass113_Sub2_3.aFloat108 * (float) arg3 + this.aClass113_Sub2_3.aFloat109 * (float) arg4;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt8545 > local32 && local63 < (float) this.anInt8545) {
			local7 |= 0x10;
		} else if ((float) this.anInt8572 < local32 && (float) this.anInt8572 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt8564 * ((float) arg1 * this.aClass113_Sub2_3.aFloat107 + (float) arg0 * this.aClass113_Sub2_3.aFloat103 + (float) arg2 * this.aClass113_Sub2_3.aFloat101 + this.aClass113_Sub2_3.aFloat106) / local32);
		@Pc(167) int local167 = (int) (((float) arg5 * this.aClass113_Sub2_3.aFloat101 + this.aClass113_Sub2_3.aFloat107 * (float) arg4 + this.aClass113_Sub2_3.aFloat103 * (float) arg3 + this.aClass113_Sub2_3.aFloat106) * (float) this.anInt8564 / local63);
		if ((float) local135 < this.aFloat167 && (float) local167 < this.aFloat167) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat160 && this.aFloat160 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass113_Sub2_3.aFloat110 + (float) arg2 * this.aClass113_Sub2_3.aFloat112 + (float) arg0 * this.aClass113_Sub2_3.aFloat111 + (float) arg1 * this.aClass113_Sub2_3.aFloat104) * (float) this.anInt8550 / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt8550 * (this.aClass113_Sub2_3.aFloat110 + this.aClass113_Sub2_3.aFloat112 * (float) arg5 + (float) arg4 * this.aClass113_Sub2_3.aFloat104 + this.aClass113_Sub2_3.aFloat111 * (float) arg3) / local63);
		if ((float) local233 < this.aFloat169 && (float) local265 < this.aFloat169) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat156 && this.aFloat156 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIB)V")
	public void method7385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8553 = arg1;
		this.anInt8546 = arg0;
		this.method7406();
		this.method7366();
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "(I)V")
	@Override
	public void method7266() {
	}

	@OriginalMember(owner = "client!rs", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt8554 = 0;
		this.anInt8555 = 0;
		this.anInt8559 = this.anInt8510;
		this.anInt8547 = this.anInt8481;
		OpenGL.glDisable(3089);
		this.method7356();
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "(II)I")
	@Override
	public int method7296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(BZ)V")
	public void method7386(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean610) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean610 = arg0;
		this.anInt8540 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt8545;
	}

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "()Z")
	@Override
	public boolean method7283() {
		return false;
	}

	@OriginalMember(owner = "client!rs", name = "y", descriptor = "(I)V")
	private void method7387() {
		if (this.anInt8560 != 2) {
			this.anInt8560 = 2;
			this.method7367();
			this.method7389();
			this.anInt8540 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "()V")
	@Override
	protected void method7236() {
		for (@Pc(6) Class5 local6 = this.aClass330_47.method7908(); local6 != null; local6 = this.aClass330_47.method7914()) {
			((Class5_Sub6_Sub1) local6).method567();
		}
		if (this.aClass74_1 != null) {
			this.aClass74_1.method1613();
		}
		if (this.anOpenGL2 != null) {
			this.method7348();
			@Pc(40) Enumeration local40 = this.aHashtable6.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable6.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean606) {
			Static487.method7200(true, false);
			this.aBoolean606 = false;
		}
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(IZ)V")
	public void method7388(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt8538) {
			return;
		}
		@Pc(29) boolean local29;
		@Pc(25) byte local25;
		if (arg0 == 1) {
			local29 = true;
			local25 = 1;
		} else if (arg0 == 2) {
			local25 = 2;
			local29 = false;
		} else if (arg0 == 128) {
			local29 = true;
			local25 = 3;
		} else {
			local25 = 0;
			local29 = false;
		}
		if (!this.aBoolean609) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean609 = true;
		}
		if (local29 != this.aBoolean607) {
			if (local29) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean607 = local29;
		}
		if (local25 != this.anInt8539) {
			if (local25 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local25 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local25 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt8539 = local25;
		}
		this.anInt8538 = arg0;
		this.anInt8540 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!rs", name = "z", descriptor = "(I)V")
	private void method7389() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass113_Sub2_4.method5673(), 0);
		if (this.aBoolean627) {
			this.aClass80_1.aClass39_Sub3_1.method1550();
		}
		this.method7393();
		this.method7334();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg5;
		@Pc(9) Class167_Sub3_Sub1 local9 = local6.aClass167_Sub3_Sub1_4;
		this.method7369();
		this.method7375(local6.aClass167_Sub3_Sub1_4);
		this.method7388(1);
		this.method7342(8448, 7681);
		this.method7326(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat171 / (float) local9.anInt8741;
		@Pc(46) float local46 = local9.aFloat170 / (float) local9.anInt8742;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(58) float local58 = (float) arg3 - (float) arg1;
		@Pc(71) float local71 = (float) (1.0D / Math.sqrt((double) (local58 * local58 + local52 * local52)));
		@Pc(75) float local75 = local58 * local71;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(94) float local94 = local52 * local71;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local94 + 0.35F, (float) arg3 + local75 + 0.35F);
		OpenGL.glEnd();
		this.method7326(0, 5890, 768);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!qr;B)V")
	public void method7390(@OriginalArg(0) Interface19 arg0) {
		if (this.aBoolean623) {
			this.method7337(arg0);
			this.method7360(arg0);
		} else if (this.anInt8533 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt8533 >= 0) {
				this.anInterface19Array2[this.anInt8533].method4334();
			}
			this.anInterface19_2 = this.anInterface19_1 = this.anInterface19Array2[++this.anInt8533] = arg0;
			this.anInterface19_2.method4332();
		}
	}

	@OriginalMember(owner = "client!rs", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method7355();
		this.method7388(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean635) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean635) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IFF)V")
	public void method7391(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat162 = arg0;
		this.aFloat158 = arg1;
		this.method7405();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		this.method7355();
		this.method7388(1);
		@Pc(29) float local29 = (float) arg2 - (float) arg0;
		@Pc(36) float local36 = (float) -arg1 + (float) arg3;
		@Pc(49) float local49 = (float) (1.0D / Math.sqrt((double) (local36 * local36 + local29 * local29)));
		@Pc(56) int local56 = arg7 % (arg6 + arg5);
		@Pc(60) float local60 = local29 * local49;
		@Pc(64) float local64 = local36 * local49;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(84) float local84 = local60 * (float) arg5;
		@Pc(89) float local89 = local64 * (float) arg5;
		@Pc(91) float local91 = 0.0F;
		@Pc(93) float local93 = 0.0F;
		@Pc(95) float local95 = local84;
		@Pc(97) float local97 = local89;
		if (arg5 >= local56) {
			local97 = (float) (arg5 - local56) * local64;
			local95 = (float) (arg5 - local56) * local60;
		} else {
			local91 = (float) (arg5 + arg6 - local56) * local60;
			local93 = (float) (arg6 + arg5 - local56) * local64;
		}
		@Pc(148) float local148 = local91 + (float) arg0 + 0.35F;
		@Pc(155) float local155 = (float) arg1 + local93 + 0.35F;
		@Pc(160) float local160 = (float) arg6 * local60;
		@Pc(165) float local165 = local64 * (float) arg6;
		while (true) {
			if (arg2 > arg0) {
				if ((float) arg2 + 0.35F < local148) {
					break;
				}
				if (local95 + local148 > (float) arg2) {
					local95 = (float) arg2 - local148;
				}
			} else {
				if ((float) arg2 + 0.35F > local148) {
					break;
				}
				if ((float) arg2 > local95 + local148) {
					local95 = (float) arg2 - local148;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 + 0.35F > local155) {
					break;
				}
				if ((float) arg3 > local155 + local97) {
					local97 = (float) arg3 - local155;
				}
			} else {
				if ((float) arg3 + 0.35F < local155) {
					break;
				}
				if (local155 + local97 > (float) arg3) {
					local97 = (float) arg3 - local155;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local148, local155);
			OpenGL.glVertex2f(local95 + local148, local97 + local155);
			local155 += local97 + local165;
			OpenGL.glEnd();
			local148 += local160 + local95;
			local97 = local89;
			local95 = local84;
		}
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method7304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7355();
		this.method7388(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		if (local16 == 0.0F && local23 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(48) float local48 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local23 * local23)));
			local23 *= local48;
			local16 *= local48;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, (float) arg3 + 0.35F + local23);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = (float) arg1 * this.aClass113_Sub2_3.aFloat109 + (float) arg0 * this.aClass113_Sub2_3.aFloat108 + this.aClass113_Sub2_3.aFloat102 * (float) arg2 + this.aClass113_Sub2_3.aFloat105;
		@Pc(55) float local55 = (float) arg5 * this.aClass113_Sub2_3.aFloat102 + this.aClass113_Sub2_3.aFloat108 * (float) arg3 + (float) arg4 * this.aClass113_Sub2_3.aFloat109 + this.aClass113_Sub2_3.aFloat105;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt8545 > local30 && local55 < (float) this.anInt8545) {
			local57 |= 0x10;
		} else if ((float) this.anInt8572 < local30 && local55 > (float) this.anInt8572) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt8564 * (this.aClass113_Sub2_3.aFloat106 + this.aClass113_Sub2_3.aFloat107 * (float) arg1 + this.aClass113_Sub2_3.aFloat103 * (float) arg0 + this.aClass113_Sub2_3.aFloat101 * (float) arg2) / (float) arg6);
		@Pc(157) int local157 = (int) ((this.aClass113_Sub2_3.aFloat106 + this.aClass113_Sub2_3.aFloat101 * (float) arg5 + (float) arg4 * this.aClass113_Sub2_3.aFloat107 + this.aClass113_Sub2_3.aFloat103 * (float) arg3) * (float) this.anInt8564 / (float) arg6);
		if (this.aFloat167 > (float) local124 && (float) local157 < this.aFloat167) {
			local57 |= 0x1;
		} else if (this.aFloat160 < (float) local124 && this.aFloat160 < (float) local157) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass113_Sub2_3.aFloat110 + (float) arg0 * this.aClass113_Sub2_3.aFloat111 + this.aClass113_Sub2_3.aFloat104 * (float) arg1 + (float) arg2 * this.aClass113_Sub2_3.aFloat112) * (float) this.anInt8550 / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt8550 * (this.aClass113_Sub2_3.aFloat110 + (float) arg4 * this.aClass113_Sub2_3.aFloat104 + this.aClass113_Sub2_3.aFloat111 * (float) arg3 + (float) arg5 * this.aClass113_Sub2_3.aFloat112) / (float) arg6);
		if (this.aFloat169 > (float) local224 && (float) local257 < this.aFloat169) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat156 && (float) local257 > this.aFloat156) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "(B)V")
	public void method7392() {
		if (this.anInt8540 == 4) {
			return;
		}
		this.method7350();
		this.method7325(false);
		this.method7359(false);
		this.method7386(false);
		this.method7346(false);
		this.method7395(-2);
		this.method7388(1);
		this.anInt8540 = 4;
	}

	@OriginalMember(owner = "client!rs", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt8576;
		this.anInt8576 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class61 method7277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class61_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "()Z")
	@Override
	public boolean method7254() {
		return this.aClass80_1.method1671();
	}

	@OriginalMember(owner = "client!rs", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass113_Sub2_3.aFloat105 + this.aClass113_Sub2_3.aFloat108 * (float) arg0 + (float) arg1 * this.aClass113_Sub2_3.aFloat109 + this.aClass113_Sub2_3.aFloat102 * (float) arg2;
		if ((float) this.anInt8545 > local28 || local28 > (float) this.anInt8572) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((float) this.anInt8564 * (this.aClass113_Sub2_3.aFloat106 + (float) arg0 * this.aClass113_Sub2_3.aFloat103 + (float) arg1 * this.aClass113_Sub2_3.aFloat107 + (float) arg2 * this.aClass113_Sub2_3.aFloat101) / (float) arg3);
		@Pc(119) int local119 = (int) (((float) arg2 * this.aClass113_Sub2_3.aFloat112 + (float) arg1 * this.aClass113_Sub2_3.aFloat104 + this.aClass113_Sub2_3.aFloat111 * (float) arg0 + this.aClass113_Sub2_3.aFloat110) * (float) this.anInt8550 / (float) arg3);
		if ((float) local86 >= this.aFloat167 && (float) local86 <= this.aFloat160 && this.aFloat169 <= (float) local119 && (float) local119 <= this.aFloat156) {
			arg4[0] = (int) ((float) local86 - this.aFloat167);
			arg4[1] = (int) ((float) local119 - this.aFloat169);
			arg4[2] = (int) local28;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!rs", name = "A", descriptor = "(I)V")
	public void method7393() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray67, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray68, 0);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!tc;)V")
	@Override
	public void method7269(@OriginalArg(0) Class113 arg0) {
		this.aClass113_Sub2_3.method8456(arg0);
		this.aClass113_Sub2_4.method8456(this.aClass113_Sub2_3);
		this.aClass113_Sub2_4.method5676();
		this.aClass113_Sub2_5.method5677(this.aClass113_Sub2_4);
		if (this.anInt8560 != 1) {
			this.method7389();
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(ILclient!qr;)V")
	public void method7394(@OriginalArg(1) Interface19 arg0) {
		if (this.anInt8534 < 0 || arg0 != this.anInterface19Array1[this.anInt8534]) {
			throw new RuntimeException();
		}
		this.anInterface19Array1[this.anInt8534--] = null;
		arg0.method4333();
		if (this.anInt8534 < 0) {
			this.anInterface19_2 = null;
		} else {
			this.anInterface19_2 = this.anInterface19Array1[this.anInt8534];
			this.anInterface19_2.method4331();
		}
	}

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "(II)V")
	public void method7395(@OriginalArg(1) int arg0) {
		this.method7380(arg0, true);
	}

	@OriginalMember(owner = "client!rs", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method7388(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!ak;Lclient!ak;Lclient!ak;Lclient!ak;I)V")
	public void method7396(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) Class18 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method7370(arg3.anInterface10_1);
			OpenGL.glVertexPointer(arg3.aByte4, arg3.aShort7, this.anInterface10_4.method8854(), this.anInterface10_4.method8857() + (long) arg3.aByte3);
			OpenGL.glEnableClientState(32884);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method7370(arg0.anInterface10_1);
			OpenGL.glNormalPointer(arg0.aShort7, this.anInterface10_4.method8854(), this.anInterface10_4.method8857() + (long) arg0.aByte3);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method7370(arg1.anInterface10_1);
			OpenGL.glColorPointer(arg1.aByte4, arg1.aShort7, this.anInterface10_4.method8854(), this.anInterface10_4.method8857() + (long) arg1.aByte3);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method7370(arg2.anInterface10_1);
			OpenGL.glTexCoordPointer(arg2.aByte4, arg2.aShort7, this.anInterface10_4.method8854(), this.anInterface10_4.method8857() + (long) arg2.aByte3);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!rs", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8547 > arg3) {
			this.anInt8547 = arg3;
		}
		if (arg1 > this.anInt8554) {
			this.anInt8554 = arg1;
		}
		if (arg2 < this.anInt8559) {
			this.anInt8559 = arg2;
		}
		if (this.anInt8555 < arg0) {
			this.anInt8555 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method7356();
		this.method7366();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(FFFFI)V")
	public void method7397(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static204.aFloatArray23[2] = arg0;
		Static204.aFloatArray23[1] = arg2;
		Static204.aFloatArray23[3] = arg3;
		Static204.aFloatArray23[0] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static204.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!rs", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Class167_Sub3_Sub1 local9 = local6.aClass167_Sub3_Sub1_4;
		this.method7369();
		this.method7375(local6.aClass167_Sub3_Sub1_4);
		this.method7388(1);
		this.method7342(8448, 7681);
		this.method7326(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat171 / (float) local9.anInt8741;
		@Pc(46) float local46 = local9.aFloat170 / (float) local9.anInt8742;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt8555 - arg2) * local39, (float) (this.anInt8554 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8555, this.anInt8554);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8555 - arg2), local46 * (float) (this.anInt8547 - arg3));
		OpenGL.glVertex2i(this.anInt8555, this.anInt8547);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8559 - arg2), (float) (this.anInt8547 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8559, this.anInt8547);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8559 - arg2), local46 * (float) (this.anInt8554 - arg3));
		OpenGL.glVertex2i(this.anInt8559, this.anInt8554);
		OpenGL.glEnd();
		this.method7326(0, 5890, 768);
	}

	@OriginalMember(owner = "client!rs", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt8535 + this.anInt8536 + this.anInt8537;
	}

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "(B)V")
	public void method7398() {
		if (this.anInt8540 == 8) {
			return;
		}
		this.method7387();
		this.method7325(true);
		this.method7386(true);
		this.method7346(true);
		this.method7388(1);
		this.anInt8540 = 8;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!gu;Z)Lclient!it;")
	@Override
	public Class28 method7297(@OriginalArg(0) Class131 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt3345 * arg0.anInt3344];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray30 == null) {
			for (local21 = 0; local21 < arg0.anInt3345; local21++) {
				for (local25 = 0; local25 < arg0.anInt3344; local25++) {
					@Pc(38) int local38 = arg0.anIntArray186[arg0.aByteArray29[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt3345; local21++) {
				for (local25 = 0; local25 < arg0.anInt3344; local25++) {
					local12[local16++] = arg0.anIntArray186[arg0.aByteArray29[local14] & 0xFF] | arg0.aByteArray30[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(120) Class28 local120 = this.method7261(local12, arg0.anInt3345, arg0.anInt3344, arg0.anInt3344);
		local120.method4043(arg0.anInt3341, arg0.anInt3343, arg0.anInt3346, arg0.anInt3342);
		return local120;
	}

	@OriginalMember(owner = "client!rs", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7355();
		this.method7388(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rs", name = "t", descriptor = "()Lclient!tc;")
	@Override
	public Class113 method7299() {
		return this.aClass113_Sub2_3;
	}

	@OriginalMember(owner = "client!rs", name = "B", descriptor = "(I)Lclient!io;")
	public Class167_Sub1 method7399() {
		return this.aClass130_Sub2_1 == null ? null : this.aClass130_Sub2_1.method5475();
	}

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "(B)V")
	private void method7400() {
		this.aFloatArray66[14] = this.aFloat157;
		this.aFloatArray66[10] = this.aFloat154;
		this.aFloat165 = this.anInt8572;
		this.aFloat152 = (this.aFloatArray66[14] - (float) this.anInt8572) / this.aFloatArray66[10];
	}

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "(II)V")
	public void method7401(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method7342(7681, 7681);
		} else if (arg0 == 0) {
			this.method7342(8448, 8448);
		} else if (arg0 == 2) {
			this.method7342(7681, 34165);
		} else if (arg0 == 3) {
			this.method7342(8448, 260);
		} else if (arg0 == 4) {
			this.method7342(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!rs", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt8569 && arg1 == this.anInt8573 && this.anInt8542 == arg2) {
			return;
		}
		this.anInt8542 = arg2;
		this.anInt8573 = arg1;
		this.anInt8569 = arg0;
		this.method7405();
		this.method7339();
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(ILclient!qr;)V")
	public void method7402(@OriginalArg(1) Interface19 arg0) {
		if (this.anInt8532 < 0 || arg0 != this.anInterface19Array3[this.anInt8532]) {
			throw new RuntimeException();
		}
		this.anInterface19Array3[this.anInt8532--] = null;
		arg0.method4330();
		if (this.anInt8532 < 0) {
			this.anInterface19_1 = null;
		} else {
			this.anInterface19_1 = this.anInterface19Array3[this.anInt8532];
			this.anInterface19_1.method4329();
		}
	}

	@OriginalMember(owner = "client!rs", name = "y", descriptor = "()Z")
	@Override
	public boolean method7315() {
		return true;
	}

	@OriginalMember(owner = "client!rs", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt8559;
		arg0[1] = this.anInt8554;
		arg0[3] = this.anInt8547;
		arg0[0] = this.anInt8555;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILclient!jaclib/memory/Buffer;Z)Lclient!js;")
	public Interface10 method7403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Buffer arg2) {
		return (Interface10) (this.aBoolean626 ? new Class278_Sub1(this, arg0, arg2, arg1, false) : new Class164_Sub1(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZZI)V")
	public void method7404(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 != this.anInt8574 || this.aBoolean627 != this.aBoolean631) {
			@Pc(12) Class167_Sub3 local12 = null;
			@Pc(14) int local14 = 0;
			@Pc(16) byte local16 = 0;
			@Pc(18) int local18 = 0;
			@Pc(25) int local25 = this.aBoolean631 ? 3 : 0;
			if (arg2 < 0) {
				this.method7361();
			} else {
				local12 = this.aClass339_1.method7985(arg2);
				@Pc(47) Class145 local47 = super.anInterface3_12.method4656(arg2);
				if (local47.aByte62 == 0 && local47.aByte65 == 0) {
					this.method7361();
				} else {
					@Pc(66) int local66 = local47.aBoolean293 ? 64 : 128;
					@Pc(70) int local70 = local66 * 50;
					this.method7351((float) (this.anInt8530 % local70 * local47.aByte65) / (float) local70, (float) (local47.aByte62 * (this.anInt8530 % local70)) / (float) local70, 0.0F);
				}
				if (!this.aBoolean631) {
					local16 = local47.aByte64;
					local18 = local47.anInt3991;
					local25 = local47.aByte68;
				}
				local14 = local47.anInt3990;
			}
			this.aClass80_1.method1672(local16, local18, arg0, arg1, local25);
			if (!this.aClass80_1.method1673(local12, local14)) {
				this.method7375(local12);
				this.method7401(local14);
			}
			this.aBoolean627 = this.aBoolean631;
			this.anInt8574 = arg2;
		}
		this.anInt8540 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "()V")
	@Override
	public void method7268() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!rs", name = "C", descriptor = "(I)V")
	private void method7405() {
		this.aFloat155 = (float) (this.anInt8572 - this.anInt8542) - this.aFloat158;
		this.aFloat168 = this.aFloat155 - this.aFloat162 * (float) this.anInt8573;
		if ((float) this.anInt8545 > this.aFloat168) {
			this.aFloat168 = this.anInt8545;
		}
		OpenGL.glFogf(2915, this.aFloat168);
		OpenGL.glFogf(2916, this.aFloat155);
		Static204.aFloatArray23[1] = (float) (this.anInt8569 & 0xFF00) / 65280.0F;
		Static204.aFloatArray23[2] = (float) (this.anInt8569 & 0xFF) / 255.0F;
		Static204.aFloatArray23[0] = (float) (this.anInt8569 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static204.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!pea;)V")
	@Override
	public void method7322(@OriginalArg(0) Interface16 arg0) {
	}

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "(B)V")
	private void method7406() {
		OpenGL.glViewport(this.anInt8546, this.anInt8553, this.anInt8510, this.anInt8481);
	}

	@OriginalMember(owner = "client!rs", name = "D", descriptor = "(I)V")
	private void method7407() {
		if (this.anInt8560 != 3) {
			this.anInt8560 = 3;
			this.method7373();
			this.method7389();
			this.anInt8540 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(II)I")
	@Override
	public int method7292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!vm;)V")
	@Override
	public void method7257(@OriginalArg(0) Class130 arg0) {
		this.aClass130_Sub2_1 = (Class130_Sub2) arg0;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(IB)V")
	public synchronized void method7408(@OriginalArg(0) int arg0) {
		@Pc(14) Class5_Sub41 local14 = new Class5_Sub41(arg0);
		this.aClass330_50.method7917(local14);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!hu;Lclient!wm;)Lclient!pea;")
	@Override
	public Interface16 method7288(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Interface27 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method7355();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method7388(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean635) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean635) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "()I")
	@Override
	public int method7245() {
		return 4;
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "()Z")
	@Override
	public boolean method7240() {
		return true;
	}
}
