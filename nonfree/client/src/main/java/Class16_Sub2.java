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

@OriginalClass("client!hk")
public final class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!hk", name = "hb", descriptor = "I")
	private int anInt4200;

	@OriginalMember(owner = "client!hk", name = "nc", descriptor = "I")
	public int anInt4256;

	@OriginalMember(owner = "client!hk", name = "ke", descriptor = "I")
	private int anInt4352;

	@OriginalMember(owner = "client!hk", name = "re", descriptor = "I")
	public int anInt4359;

	@OriginalMember(owner = "client!hk", name = "Fe", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!hk", name = "Ie", descriptor = "I")
	public int anInt4365;

	@OriginalMember(owner = "client!hk", name = "Le", descriptor = "Lclient!jr;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "client!hk", name = "Ne", descriptor = "Lclient!jr;")
	private Interface13 anInterface13_2;

	@OriginalMember(owner = "client!hk", name = "Pe", descriptor = "Lclient!et;")
	private Class109 aClass109_1;

	@OriginalMember(owner = "client!hk", name = "Se", descriptor = "Lclient!hs;")
	private Class102_Sub2 aClass102_Sub2_1;

	@OriginalMember(owner = "client!hk", name = "Ue", descriptor = "I")
	private int anInt4369;

	@OriginalMember(owner = "client!hk", name = "Ve", descriptor = "I")
	public int anInt4370;

	@OriginalMember(owner = "client!hk", name = "We", descriptor = "I")
	public int anInt4371;

	@OriginalMember(owner = "client!hk", name = "ef", descriptor = "I")
	private int anInt4372;

	@OriginalMember(owner = "client!hk", name = "ff", descriptor = "Z")
	private boolean aBoolean310;

	@OriginalMember(owner = "client!hk", name = "gf", descriptor = "Z")
	private boolean aBoolean311;

	@OriginalMember(owner = "client!hk", name = "jf", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!hk", name = "kf", descriptor = "I")
	private int anInt4373;

	@OriginalMember(owner = "client!hk", name = "lf", descriptor = "Z")
	private boolean aBoolean312;

	@OriginalMember(owner = "client!hk", name = "mf", descriptor = "Z")
	private boolean aBoolean313;

	@OriginalMember(owner = "client!hk", name = "nf", descriptor = "I")
	private int anInt4374;

	@OriginalMember(owner = "client!hk", name = "qf", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!hk", name = "rf", descriptor = "I")
	private int anInt4375;

	@OriginalMember(owner = "client!hk", name = "sf", descriptor = "Lclient!kf;")
	public Class39_Sub4 aClass39_Sub4_1;

	@OriginalMember(owner = "client!hk", name = "tf", descriptor = "I")
	public int anInt4376;

	@OriginalMember(owner = "client!hk", name = "uf", descriptor = "Lclient!b;")
	public Class28_Sub1 aClass28_Sub1_1;

	@OriginalMember(owner = "client!hk", name = "xf", descriptor = "Lclient!et;")
	public Class109 aClass109_2;

	@OriginalMember(owner = "client!hk", name = "yf", descriptor = "Z")
	public boolean aBoolean314;

	@OriginalMember(owner = "client!hk", name = "zf", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!hk", name = "Bf", descriptor = "Z")
	private boolean aBoolean315;

	@OriginalMember(owner = "client!hk", name = "Cf", descriptor = "Lclient!b;")
	public Class28_Sub1 aClass28_Sub1_2;

	@OriginalMember(owner = "client!hk", name = "Ef", descriptor = "Ljava/lang/String;")
	private String aString52;

	@OriginalMember(owner = "client!hk", name = "Gf", descriptor = "I")
	private int anInt4378;

	@OriginalMember(owner = "client!hk", name = "Hf", descriptor = "Z")
	private boolean aBoolean317;

	@OriginalMember(owner = "client!hk", name = "Kf", descriptor = "Z")
	public boolean aBoolean319;

	@OriginalMember(owner = "client!hk", name = "Lf", descriptor = "I")
	private int anInt4379;

	@OriginalMember(owner = "client!hk", name = "Mf", descriptor = "Lclient!tca;")
	private Class106_Sub2 aClass106_Sub2_1;

	@OriginalMember(owner = "client!hk", name = "Pf", descriptor = "Lclient!nba;")
	public Class243 aClass243_5;

	@OriginalMember(owner = "client!hk", name = "Tf", descriptor = "Z")
	public boolean aBoolean322;

	@OriginalMember(owner = "client!hk", name = "Wf", descriptor = "I")
	private int anInt4383;

	@OriginalMember(owner = "client!hk", name = "Zf", descriptor = "Lclient!wfa;")
	private Interface26 anInterface26_2;

	@OriginalMember(owner = "client!hk", name = "cg", descriptor = "I")
	private int anInt4385;

	@OriginalMember(owner = "client!hk", name = "dg", descriptor = "Z")
	private boolean aBoolean324;

	@OriginalMember(owner = "client!hk", name = "eg", descriptor = "Lclient!b;")
	public Class28_Sub1 aClass28_Sub1_3;

	@OriginalMember(owner = "client!hk", name = "jg", descriptor = "Lclient!nba;")
	public Class243 aClass243_6;

	@OriginalMember(owner = "client!hk", name = "kg", descriptor = "Z")
	private boolean aBoolean326;

	@OriginalMember(owner = "client!hk", name = "lg", descriptor = "Lclient!b;")
	public Class28_Sub1 aClass28_Sub1_4;

	@OriginalMember(owner = "client!hk", name = "ng", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!hk", name = "og", descriptor = "I")
	private int anInt4388;

	@OriginalMember(owner = "client!hk", name = "ug", descriptor = "Ljava/lang/String;")
	private String aString53;

	@OriginalMember(owner = "client!hk", name = "Ag", descriptor = "Z")
	private boolean aBoolean328;

	@OriginalMember(owner = "client!hk", name = "Bg", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!hk", name = "Cg", descriptor = "I")
	private int anInt4394;

	@OriginalMember(owner = "client!hk", name = "Eg", descriptor = "Lclient!b;")
	public Class28_Sub1 aClass28_Sub1_5;

	@OriginalMember(owner = "client!hk", name = "Gg", descriptor = "Z")
	private boolean aBoolean330;

	@OriginalMember(owner = "client!hk", name = "Hg", descriptor = "Lclient!b;")
	public Class28_Sub1 aClass28_Sub1_6;

	@OriginalMember(owner = "client!hk", name = "Kg", descriptor = "Z")
	public boolean aBoolean332;

	@OriginalMember(owner = "client!hk", name = "Lg", descriptor = "Z")
	private boolean aBoolean333;

	@OriginalMember(owner = "client!hk", name = "Mg", descriptor = "Z")
	public boolean aBoolean334;

	@OriginalMember(owner = "client!hk", name = "Og", descriptor = "I")
	private int anInt4397;

	@OriginalMember(owner = "client!hk", name = "Rg", descriptor = "F")
	private float aFloat100;

	@OriginalMember(owner = "client!hk", name = "Wg", descriptor = "I")
	public int anInt4402;

	@OriginalMember(owner = "client!hk", name = "Xg", descriptor = "Lclient!b;")
	public Class28_Sub1 aClass28_Sub1_7;

	@OriginalMember(owner = "client!hk", name = "Yg", descriptor = "Lclient!b;")
	public Class28_Sub1 aClass28_Sub1_8;

	@OriginalMember(owner = "client!hk", name = "ah", descriptor = "I")
	public int anInt4404;

	@OriginalMember(owner = "client!hk", name = "bh", descriptor = "Lclient!wfa;")
	private Interface26 anInterface26_3;

	@OriginalMember(owner = "client!hk", name = "ch", descriptor = "Z")
	public boolean aBoolean335;

	@OriginalMember(owner = "client!hk", name = "dh", descriptor = "Z")
	public boolean aBoolean336;

	@OriginalMember(owner = "client!hk", name = "eh", descriptor = "Lclient!nc;")
	private Interface17 anInterface17_2;

	@OriginalMember(owner = "client!hk", name = "fh", descriptor = "Lclient!b;")
	public Class28_Sub1 aClass28_Sub1_9;

	@OriginalMember(owner = "client!hk", name = "hh", descriptor = "Z")
	public boolean aBoolean338;

	@OriginalMember(owner = "client!hk", name = "ih", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!hk", name = "jh", descriptor = "Lclient!vq;")
	private Class39_Sub4_Sub1 aClass39_Sub4_Sub1_1;

	@OriginalMember(owner = "client!hk", name = "mh", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!hk", name = "ph", descriptor = "Z")
	public boolean aBoolean339;

	@OriginalMember(owner = "client!hk", name = "qh", descriptor = "Z")
	public boolean aBoolean340;

	@OriginalMember(owner = "client!hk", name = "rh", descriptor = "F")
	private float aFloat105;

	@OriginalMember(owner = "client!hk", name = "sh", descriptor = "F")
	private float aFloat106;

	@OriginalMember(owner = "client!hk", name = "uh", descriptor = "[Lclient!qk;")
	private Class39[] aClass39Array1;

	@OriginalMember(owner = "client!hk", name = "vh", descriptor = "Lclient!b;")
	public Class28_Sub1 aClass28_Sub1_10;

	@OriginalMember(owner = "client!hk", name = "wh", descriptor = "I")
	public int anInt4408;

	@OriginalMember(owner = "client!hk", name = "yh", descriptor = "I")
	private int anInt4409;

	@OriginalMember(owner = "client!hk", name = "Ah", descriptor = "I")
	private int anInt4410;

	@OriginalMember(owner = "client!hk", name = "kb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "client!hk", name = "ye", descriptor = "I")
	public int anInt4362 = 128;

	@OriginalMember(owner = "client!hk", name = "xe", descriptor = "Lclient!pa;")
	private final Class272 aClass272_1 = new Class272();

	@OriginalMember(owner = "client!hk", name = "Be", descriptor = "Lclient!ar;")
	private final Class25_Sub1 aClass25_Sub1_1 = new Class25_Sub1();

	@OriginalMember(owner = "client!hk", name = "Ce", descriptor = "Lclient!ar;")
	public final Class25_Sub1 aClass25_Sub1_2 = new Class25_Sub1();

	@OriginalMember(owner = "client!hk", name = "Ee", descriptor = "I")
	public int anInt4363 = 8;

	@OriginalMember(owner = "client!hk", name = "Ge", descriptor = "I")
	public int anInt4364 = 3;

	@OriginalMember(owner = "client!hk", name = "De", descriptor = "Z")
	private boolean aBoolean309 = false;

	@OriginalMember(owner = "client!hk", name = "Je", descriptor = "Lclient!jia;")
	private final Class193 aClass193_19 = new Class193();

	@OriginalMember(owner = "client!hk", name = "Ke", descriptor = "I")
	private int anInt4366 = -1;

	@OriginalMember(owner = "client!hk", name = "Oe", descriptor = "[Lclient!jr;")
	private final Interface13[] anInterface13Array2 = new Interface13[4];

	@OriginalMember(owner = "client!hk", name = "Qe", descriptor = "I")
	private int anInt4367 = -1;

	@OriginalMember(owner = "client!hk", name = "Re", descriptor = "I")
	private int anInt4368 = -1;

	@OriginalMember(owner = "client!hk", name = "Te", descriptor = "[Lclient!jr;")
	private final Interface13[] anInterface13Array3 = new Interface13[4];

	@OriginalMember(owner = "client!hk", name = "Me", descriptor = "[Lclient!jr;")
	private final Interface13[] anInterface13Array1 = new Interface13[4];

	@OriginalMember(owner = "client!hk", name = "Xe", descriptor = "Lclient!jia;")
	private final Class193 aClass193_20;

	@OriginalMember(owner = "client!hk", name = "Ye", descriptor = "Lclient!jia;")
	private final Class193 aClass193_21;

	@OriginalMember(owner = "client!hk", name = "Ze", descriptor = "Lclient!jia;")
	private final Class193 aClass193_22;

	@OriginalMember(owner = "client!hk", name = "af", descriptor = "Lclient!jia;")
	private final Class193 aClass193_23;

	@OriginalMember(owner = "client!hk", name = "bf", descriptor = "Lclient!jia;")
	private final Class193 bf;

	@OriginalMember(owner = "client!hk", name = "cf", descriptor = "Lclient!jia;")
	private final Class193 aClass193_24;

	@OriginalMember(owner = "client!hk", name = "df", descriptor = "Lclient!jia;")
	private final Class193 aClass193_25;

	@OriginalMember(owner = "client!hk", name = "hf", descriptor = "Lclient!ar;")
	public final Class25_Sub1 aClass25_Sub1_3;

	@OriginalMember(owner = "client!hk", name = "of", descriptor = "Lclient!ar;")
	public final Class25_Sub1 aClass25_Sub1_4;

	@OriginalMember(owner = "client!hk", name = "pf", descriptor = "Lclient!ar;")
	public final Class25_Sub1 aClass25_Sub1_5;

	@OriginalMember(owner = "client!hk", name = "Jf", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!hk", name = "Df", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!hk", name = "Nf", descriptor = "[F")
	private final float[] aFloatArray39;

	@OriginalMember(owner = "client!hk", name = "Yf", descriptor = "I")
	private int anInt4384;

	@OriginalMember(owner = "client!hk", name = "mg", descriptor = "I")
	public int anInt4387;

	@OriginalMember(owner = "client!hk", name = "wf", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!hk", name = "ag", descriptor = "[F")
	private final float[] aFloatArray40;

	@OriginalMember(owner = "client!hk", name = "Af", descriptor = "I")
	public int anInt4377;

	@OriginalMember(owner = "client!hk", name = "Uf", descriptor = "Z")
	private boolean aBoolean323;

	@OriginalMember(owner = "client!hk", name = "Qf", descriptor = "I")
	private int anInt4381;

	@OriginalMember(owner = "client!hk", name = "Of", descriptor = "I")
	private int anInt4380;

	@OriginalMember(owner = "client!hk", name = "wg", descriptor = "F")
	private float aFloat97;

	@OriginalMember(owner = "client!hk", name = "zg", descriptor = "I")
	public int anInt4393;

	@OriginalMember(owner = "client!hk", name = "qg", descriptor = "I")
	public int anInt4389;

	@OriginalMember(owner = "client!hk", name = "bg", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!hk", name = "yg", descriptor = "I")
	private int anInt4392;

	@OriginalMember(owner = "client!hk", name = "xg", descriptor = "F")
	private float aFloat98;

	@OriginalMember(owner = "client!hk", name = "Ng", descriptor = "I")
	public int anInt4396;

	@OriginalMember(owner = "client!hk", name = "Ug", descriptor = "[Lclient!bq;")
	private final Class3_Sub7[] aClass3_Sub7Array3;

	@OriginalMember(owner = "client!hk", name = "fg", descriptor = "[F")
	private final float[] aFloatArray41;

	@OriginalMember(owner = "client!hk", name = "ig", descriptor = "I")
	public int anInt4386;

	@OriginalMember(owner = "client!hk", name = "Qg", descriptor = "I")
	private int anInt4399;

	@OriginalMember(owner = "client!hk", name = "hg", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!hk", name = "vg", descriptor = "Z")
	private boolean aBoolean327;

	@OriginalMember(owner = "client!hk", name = "pg", descriptor = "[F")
	public final float[] aFloatArray42;

	@OriginalMember(owner = "client!hk", name = "Pg", descriptor = "I")
	private int anInt4398;

	@OriginalMember(owner = "client!hk", name = "Vf", descriptor = "I")
	private int anInt4382;

	@OriginalMember(owner = "client!hk", name = "rg", descriptor = "I")
	private int anInt4390;

	@OriginalMember(owner = "client!hk", name = "kh", descriptor = "[F")
	private final float[] aFloatArray43;

	@OriginalMember(owner = "client!hk", name = "Vg", descriptor = "I")
	public int anInt4401;

	@OriginalMember(owner = "client!hk", name = "sg", descriptor = "I")
	public int anInt4391;

	@OriginalMember(owner = "client!hk", name = "Xf", descriptor = "F")
	private float aFloat92;

	@OriginalMember(owner = "client!hk", name = "Tg", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!hk", name = "vf", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!hk", name = "lh", descriptor = "I")
	public int anInt4405;

	@OriginalMember(owner = "client!hk", name = "oh", descriptor = "F")
	private float aFloat104;

	@OriginalMember(owner = "client!hk", name = "nh", descriptor = "I")
	private int anInt4406;

	@OriginalMember(owner = "client!hk", name = "Sg", descriptor = "I")
	private int anInt4400;

	@OriginalMember(owner = "client!hk", name = "Fg", descriptor = "I")
	public int anInt4395;

	@OriginalMember(owner = "client!hk", name = "tg", descriptor = "F")
	private float aFloat96;

	@OriginalMember(owner = "client!hk", name = "th", descriptor = "I")
	public int anInt4407;

	@OriginalMember(owner = "client!hk", name = "Jg", descriptor = "Lclient!iw;")
	public Class3_Sub17_Sub1 aClass3_Sub17_Sub1_1;

	@OriginalMember(owner = "client!hk", name = "xh", descriptor = "[B")
	public final byte[] aByteArray39;

	@OriginalMember(owner = "client!hk", name = "zh", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!hk", name = "Bh", descriptor = "[I")
	public int[] anIntArray288;

	@OriginalMember(owner = "client!hk", name = "Ch", descriptor = "[I")
	public int[] anIntArray289;

	@OriginalMember(owner = "client!hk", name = "vc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas6;

	@OriginalMember(owner = "client!hk", name = "W", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!hk", name = "ue", descriptor = "I")
	public final int anInt4361;

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!hk", name = "Kc", descriptor = "J")
	private final long aLong109;

	@OriginalMember(owner = "client!hk", name = "cd", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!hk", name = "Zg", descriptor = "I")
	public final int anInt4403;

	@OriginalMember(owner = "client!hk", name = "Rf", descriptor = "Z")
	public boolean aBoolean320;

	@OriginalMember(owner = "client!hk", name = "Ff", descriptor = "Z")
	private boolean aBoolean316;

	@OriginalMember(owner = "client!hk", name = "Dg", descriptor = "Z")
	public boolean aBoolean329;

	@OriginalMember(owner = "client!hk", name = "If", descriptor = "Z")
	public boolean aBoolean318;

	@OriginalMember(owner = "client!hk", name = "Sf", descriptor = "Z")
	public boolean aBoolean321;

	@OriginalMember(owner = "client!hk", name = "gh", descriptor = "Z")
	private boolean aBoolean337;

	@OriginalMember(owner = "client!hk", name = "Ig", descriptor = "Z")
	public boolean aBoolean331;

	@OriginalMember(owner = "client!hk", name = "gg", descriptor = "Z")
	private final boolean aBoolean325;

	@OriginalMember(owner = "client!hk", name = "ze", descriptor = "Lclient!gaa;")
	private final Class138 aClass138_1;

	@OriginalMember(owner = "client!hk", name = "He", descriptor = "Lclient!wj;")
	public final Class390 aClass390_1;

	@OriginalMember(owner = "client!hk", name = "Ae", descriptor = "Lclient!nr;")
	private final Class254 aClass254_1;

	@OriginalMember(owner = "client!hk", name = "ve", descriptor = "Lclient!kia;")
	private Class3_Sub31_Sub1 aClass3_Sub31_Sub1_1;

	@OriginalMember(owner = "client!hk", name = "we", descriptor = "Lclient!hb;")
	private final Class153 aClass153_1;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class16_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class258();
		new Class62(16);
		this.aClass193_20 = new Class193();
		this.aClass193_21 = new Class193();
		this.aClass193_22 = new Class193();
		this.aClass193_23 = new Class193();
		this.bf = new Class193();
		this.aClass193_24 = new Class193();
		this.aClass193_25 = new Class193();
		this.aClass25_Sub1_3 = new Class25_Sub1();
		this.aClass25_Sub1_4 = new Class25_Sub1();
		this.aClass25_Sub1_5 = new Class25_Sub1();
		this.aFloat91 = 1.0F;
		this.aFloat90 = 3584.0F;
		this.aFloatArray39 = new float[4];
		this.anInt4384 = 0;
		this.anInt4387 = -1;
		this.aFloat88 = 1.0F;
		this.aFloatArray40 = new float[4];
		this.anInt4377 = 512;
		this.aBoolean323 = true;
		this.anInt4381 = 8448;
		this.anInt4380 = 3584;
		this.aFloat97 = 0.0F;
		this.anInt4393 = 0;
		this.anInt4389 = 50;
		this.aFloat93 = -1.0F;
		this.anInt4392 = -1;
		this.aFloat98 = 1.0F;
		this.anInt4396 = 512;
		this.aClass3_Sub7Array3 = new Class3_Sub7[Static380.anInt6673];
		this.aFloatArray41 = new float[4];
		this.anInt4386 = -1;
		this.anInt4399 = 0;
		this.aFloat94 = 1.0F;
		this.aBoolean327 = false;
		this.aFloatArray42 = new float[4];
		this.anInt4398 = 8448;
		this.anInt4382 = 0;
		this.anInt4390 = 0;
		this.aFloatArray43 = new float[16];
		this.anInt4401 = -1;
		this.anInt4391 = 0;
		this.aFloat92 = -1.0F;
		this.aFloat101 = -1.0F;
		this.aFloat87 = 3584.0F;
		this.anInt4405 = -1;
		this.aFloat104 = 1.0F;
		this.anInt4406 = 0;
		this.anInt4400 = 0;
		this.anInt4395 = 0;
		this.aFloat96 = -1.0F;
		this.anInt4407 = 0;
		this.aClass3_Sub17_Sub1_1 = new Class3_Sub17_Sub1(8192);
		this.aByteArray39 = new byte[16384];
		this.anIntArray287 = new int[1];
		this.anIntArray288 = new int[1];
		this.anIntArray289 = new int[1];
		this.aCanvas5 = this.aCanvas6 = arg0;
		this.anInt4361 = arg2;
		if (!Static519.method7352("jaclib")) {
			throw new RuntimeException("");
		} else if (Static519.method7352("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong110 = this.aLong109 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt4361);
				if (this.aLong109 == 0L) {
					throw new RuntimeException("");
				}
				this.method3639();
				@Pc(335) int local335 = this.method3694();
				if (local335 != 0) {
					throw new RuntimeException("");
				}
				this.anInt4403 = this.aBoolean322 ? 33639 : 5121;
				if (this.aString52.indexOf("radeon") != -1) {
					@Pc(359) int local359 = 0;
					@Pc(361) boolean local361 = false;
					@Pc(363) boolean local363 = false;
					@Pc(372) String[] local372 = Static325.method5062(this.aString52.replace('/', ' '), ' ');
					for (@Pc(374) int local374 = 0; local374 < local372.length; local374++) {
						@Pc(380) String local380 = local372[local374];
						try {
							if (local380.length() > 0) {
								if (local380.charAt(0) == 'x' && local380.length() >= 3 && Static363.method5417(local380.substring(1, 3))) {
									local363 = true;
									local380 = local380.substring(1);
								}
								if (local380.equals("hd")) {
									local361 = true;
								} else {
									if (local380.startsWith("hd")) {
										local380 = local380.substring(2);
										local361 = true;
									}
									if (local380.length() >= 4 && Static363.method5417(local380.substring(0, 4))) {
										local359 = Static305.method4695(local380.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(447) Exception local447) {
						}
					}
					if (!local363 && !local361) {
						if (local359 >= 7000 && local359 <= 9250) {
							this.aBoolean320 = false;
						}
						if (local359 >= 7000 && local359 <= 7999) {
							this.aBoolean316 = false;
						}
					}
					if (!local361 || local359 < 4000) {
						this.aBoolean329 = false;
					}
					this.aBoolean318 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean321 = true;
					this.aBoolean337 = this.aBoolean316;
				}
				if (this.aString53.indexOf("intel") != -1) {
					this.aBoolean331 = false;
				}
				this.aBoolean325 = !this.aString53.equals("s3 graphics");
				if (this.aBoolean316) {
					try {
						@Pc(531) int[] local531 = new int[1];
						OpenGL.glGenBuffersARB(1, local531, 0);
					} catch (@Pc(537) Throwable local537) {
						throw new RuntimeException("");
					}
				}
				Static69.method1566(true, false);
				this.aBoolean309 = true;
				this.aClass138_1 = new Class138(this, super.anInterface5_12);
				this.method3658();
				this.aClass390_1 = new Class390(this);
				this.aClass254_1 = new Class254(this);
				if (this.aClass254_1.method5793()) {
					this.aClass3_Sub31_Sub1_1 = new Class3_Sub31_Sub1(this);
					if (!this.aClass3_Sub31_Sub1_1.method4785()) {
						this.aClass3_Sub31_Sub1_1.method4773();
						this.aClass3_Sub31_Sub1_1 = null;
					}
				}
				this.aClass153_1 = new Class153(this);
				this.method3625();
				this.method3693();
				this.method8167();
			} catch (@Pc(611) Throwable local611) {
				local611.printStackTrace();
				this.method8163();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZ)V")
	public void method3611(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean324) {
			this.aBoolean324 = arg0;
			this.method3614();
		}
	}

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "()Z")
	@Override
	public boolean method8195() {
		return this.aClass153_1.method3376();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
	public synchronized void method3612(@OriginalArg(1) int arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong309 = (long) arg0;
		this.aClass193_24.method4462(local7);
	}

	@OriginalMember(owner = "client!hk", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIF)Lclient!bq;")
	@Override
	public Class3_Sub7 method8154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub7_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "()Z")
	@Override
	public boolean method8191() {
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZII[B)Lclient!nc;")
	public Interface17 method3613(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface17) (this.aBoolean316 && (!arg0 || this.aBoolean337) ? new Class113_Sub1(this, 5123, arg2, arg1, arg0) : new Class127_Sub2(this, 5123, arg2, arg1));
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
	private void method3614() {
		if (this.aBoolean315 && !this.aBoolean324) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "()Z")
	@Override
	public boolean method8192() {
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLclient!jr;)V")
	public void method3615(@OriginalArg(1) Interface13 arg0) {
		if (this.aBoolean335) {
			this.method3649(arg0);
			this.method3630(arg0);
		} else if (this.anInt4366 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt4366 >= 0) {
				this.anInterface13Array2[this.anInt4366].method2541();
			}
			this.anInterface13_1 = this.anInterface13_2 = this.anInterface13Array2[++this.anInt4366] = arg0;
			this.anInterface13_1.method2545();
		}
	}

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt4371 + this.anInt4370 + this.anInt4369;
	}

	@OriginalMember(owner = "client!hk", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt4380;
	}

	@OriginalMember(owner = "client!hk", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = (float) arg2 * this.aClass25_Sub1_3.aFloat45 + this.aClass25_Sub1_3.aFloat37 * (float) arg1 + (float) arg0 * this.aClass25_Sub1_3.aFloat42 + this.aClass25_Sub1_3.aFloat39;
		if ((float) this.anInt4389 > local28 || (float) this.anInt4380 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((float) this.anInt4396 * (this.aClass25_Sub1_3.aFloat47 * (float) arg1 + this.aClass25_Sub1_3.aFloat48 * (float) arg0 + this.aClass25_Sub1_3.aFloat46 * (float) arg2 + this.aClass25_Sub1_3.aFloat43) / (float) arg3);
		@Pc(119) int local119 = (int) ((this.aClass25_Sub1_3.aFloat41 + (float) arg2 * this.aClass25_Sub1_3.aFloat40 + this.aClass25_Sub1_3.aFloat44 * (float) arg0 + (float) arg1 * this.aClass25_Sub1_3.aFloat38) * (float) this.anInt4377 / (float) arg3);
		if ((float) local86 >= this.aFloat103 && (float) local86 <= this.aFloat102 && this.aFloat89 <= (float) local119 && this.aFloat95 >= (float) local119) {
			arg4[2] = (int) local28;
			arg4[0] = (int) ((float) local86 - this.aFloat103);
			arg4[1] = (int) ((float) local119 - this.aFloat89);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "(I)V")
	private void method3616() {
		if (this.anInt4378 != 2) {
			this.anInt4378 = 2;
			this.method3668();
			this.method3667();
			this.anInt4373 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "()V")
	@Override
	protected void method8163() {
		for (@Pc(6) Class3 local6 = this.aClass193_19.method4457(); local6 != null; local6 = this.aClass193_19.method4459()) {
			((Class3_Sub14_Sub1) local6).method2314();
		}
		if (this.aClass254_1 != null) {
			this.aClass254_1.method5795();
		}
		if (this.anOpenGL1 != null) {
			this.method3675();
			@Pc(40) Enumeration local40 = this.aHashtable3.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable3.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean309) {
			Static22.method745(false, true);
			this.aBoolean309 = false;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(ZI)V")
	public void method3617(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean310) {
			this.aBoolean310 = arg0;
			this.method3638();
			this.anInt4373 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!hk", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean340 = false;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	private void method3618() {
		this.aFloat100 = (float) (this.anInt4380 - this.anInt4393) - this.aFloat97;
		this.aFloat99 = this.aFloat100 - (float) this.anInt4386 * this.aFloat98;
		if (this.aFloat99 < (float) this.anInt4389) {
			this.aFloat99 = (float) this.anInt4389;
		}
		OpenGL.glFogf(2915, this.aFloat99);
		OpenGL.glFogf(2916, this.aFloat100);
		Static544.aFloatArray65[0] = (float) (this.anInt4405 & 0xFF0000) / 1.671168E7F;
		Static544.aFloatArray65[2] = (float) (this.anInt4405 & 0xFF) / 255.0F;
		Static544.aFloatArray65[1] = (float) (this.anInt4405 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static544.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!en;Lclient!en;FLclient!en;)Lclient!en;")
	@Override
	public Class106 method8158(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean334 && this.aBoolean331) {
			@Pc(15) Class106_Sub2_Sub1 local15 = null;
			@Pc(18) Class106_Sub2 local18 = (Class106_Sub2) arg0;
			@Pc(21) Class106_Sub2 local21 = (Class106_Sub2) arg1;
			@Pc(25) Class39_Sub1 local25 = local18.method4441();
			@Pc(29) Class39_Sub1 local29 = local21.method4441();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt1312 > local29.anInt1312 ? local25.anInt1312 : local29.anInt1312;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class106_Sub2_Sub1) {
					@Pc(60) Class106_Sub2_Sub1 local60 = (Class106_Sub2_Sub1) arg3;
					if (local60.method3455() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class106_Sub2_Sub1(this, local48);
				}
				if (local15.method3456(local29, local25, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!nc;B)V")
	public void method3619(@OriginalArg(0) Interface17 arg0) {
		if (arg0 != this.anInterface17_2) {
			if (this.aBoolean316) {
				OpenGL.glBindBufferARB(34963, arg0.method7365());
			}
			this.anInterface17_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)Lclient!oq;")
	@Override
	public Interface19 method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "()Z")
	@Override
	public boolean method8200() {
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt4410;
		this.anInt4410 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8144(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas6) {
			throw new RuntimeException();
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable3.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "()V")
	@Override
	public void method8167() {
		if (!this.aBoolean325 || this.anInt4256 <= 0 || this.anInt4359 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt4382;
		@Pc(22) int local22 = this.anInt4390;
		@Pc(25) int local25 = this.anInt4400;
		@Pc(28) int local28 = this.anInt4399;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3665();
		this.method3681(false);
		this.method3637(false);
		this.method3631(false);
		this.method3617(false);
		this.method3620((Class39) null);
		this.method3687(-2);
		this.method3680(1);
		this.method3654(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt4256, this.anInt4359, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "()Z")
	@Override
	public boolean method8157() {
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!qk;I)V")
	public void method3620(@OriginalArg(0) Class39 arg0) {
		@Pc(11) Class39 local11 = this.aClass39Array1[this.anInt4388];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt9936);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt9936);
				} else if (local11.anInt9936 != arg0.anInt9936) {
					OpenGL.glDisable(local11.anInt9936);
					OpenGL.glEnable(arg0.anInt9936);
				}
				OpenGL.glBindTexture(arg0.anInt9936, arg0.method8460());
			}
			this.aClass39Array1[this.anInt4388] = arg0;
		}
		this.anInt4373 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass25_Sub1_3.aFloat45 * (float) arg2 + this.aClass25_Sub1_3.aFloat37 * (float) arg1 + this.aClass25_Sub1_3.aFloat42 * (float) arg0 + this.aClass25_Sub1_3.aFloat39;
		@Pc(55) float local55 = this.aClass25_Sub1_3.aFloat39 + this.aClass25_Sub1_3.aFloat37 * (float) arg4 + (float) arg3 * this.aClass25_Sub1_3.aFloat42 + this.aClass25_Sub1_3.aFloat45 * (float) arg5;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt4389 > local30 && (float) this.anInt4389 > local55) {
			local57 |= 0x10;
		} else if ((float) this.anInt4380 < local30 && (float) this.anInt4380 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass25_Sub1_3.aFloat47 * (float) arg1 + this.aClass25_Sub1_3.aFloat48 * (float) arg0 + this.aClass25_Sub1_3.aFloat46 * (float) arg2 + this.aClass25_Sub1_3.aFloat43) * (float) this.anInt4396 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt4396 * (this.aClass25_Sub1_3.aFloat46 * (float) arg5 + (float) arg4 * this.aClass25_Sub1_3.aFloat47 + this.aClass25_Sub1_3.aFloat48 * (float) arg3 + this.aClass25_Sub1_3.aFloat43) / (float) arg6);
		if ((float) local124 < this.aFloat103 && (float) local157 < this.aFloat103) {
			local57 |= 0x1;
		} else if ((float) local124 > this.aFloat102 && (float) local157 > this.aFloat102) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass25_Sub1_3.aFloat41 + (float) arg2 * this.aClass25_Sub1_3.aFloat40 + this.aClass25_Sub1_3.aFloat38 * (float) arg1 + (float) arg0 * this.aClass25_Sub1_3.aFloat44) * (float) this.anInt4377 / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt4377 * (this.aClass25_Sub1_3.aFloat41 + (float) arg5 * this.aClass25_Sub1_3.aFloat40 + (float) arg3 * this.aClass25_Sub1_3.aFloat44 + this.aClass25_Sub1_3.aFloat38 * (float) arg4) / (float) arg6);
		if (this.aFloat89 > (float) local224 && (float) local257 < this.aFloat89) {
			local57 |= 0x4;
		} else if (this.aFloat95 < (float) local224 && (float) local257 > this.aFloat95) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg5;
		@Pc(9) Class39_Sub4_Sub1 local9 = local6.aClass39_Sub4_Sub1_5;
		this.method3633();
		this.method3620(local6.aClass39_Sub4_Sub1_5);
		this.method3654(1);
		this.method3671(7681, 8448);
		this.method3669(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat195 / (float) local9.anInt9958;
		@Pc(46) float local46 = local9.aFloat196 / (float) local9.anInt9955;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(59) float local59 = (float) arg3 - (float) arg1;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local59 * local59)));
		@Pc(76) float local76 = local59 * local72;
		@Pc(80) float local80 = local53 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f(local80 + (float) arg2 + 0.35F, local76 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method3669(5890, 0, 768);
	}

	@OriginalMember(owner = "client!hk", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method3640();
		this.method3654(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean333) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean333) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "()Z")
	@Override
	public boolean method8181() {
		if (this.aClass3_Sub31_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub31_Sub1_1.method4782()) {
			if (!this.aClass254_1.method5794(this.aClass3_Sub31_Sub1_1)) {
				return false;
			}
			this.aClass138_1.method3002();
		}
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean323 = arg0;
		this.method3638();
	}

	@OriginalMember(owner = "client!hk", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean340) {
			throw new RuntimeException("");
		}
		this.anInt4387 = arg2;
		this.anInt4407 = arg3;
		this.anInt4401 = arg1;
		this.anInt4408 = arg0;
		if (this.aBoolean327) {
			this.aClass153_1.aClass21_Sub4_1.method4006();
			this.aClass153_1.aClass21_Sub4_1.method4007();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
	public void method3621(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4384 = arg1;
		this.anInt4406 = arg0;
		this.method3676();
		this.method3657();
	}

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "()Lclient!aja;")
	@Override
	public Class18 method8193() {
		@Pc(7) int local7 = -1;
		if (this.aString53.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString53.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString53.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class18(local7, "OpenGL", this.anInt4383, this.aString52, 0L);
	}

	@OriginalMember(owner = "client!hk", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method3654(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "()Z")
	@Override
	public boolean method8186() {
		return this.aClass3_Sub31_Sub1_1 != null && this.aClass3_Sub31_Sub1_1.method4782();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!wfa;)V")
	public void method3622(@OriginalArg(1) Interface26 arg0) {
		if (arg0 != this.anInterface26_2) {
			if (this.aBoolean316) {
				OpenGL.glBindBufferARB(34962, arg0.method5258());
			}
			this.anInterface26_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!hk", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass25_Sub1_3.aFloat39 + (float) arg1 * this.aClass25_Sub1_3.aFloat37 + this.aClass25_Sub1_3.aFloat42 * (float) arg0 + (float) arg2 * this.aClass25_Sub1_3.aFloat45;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt4396 * (this.aClass25_Sub1_3.aFloat46 * (float) arg2 + (float) arg0 * this.aClass25_Sub1_3.aFloat48 + this.aClass25_Sub1_3.aFloat47 * (float) arg1 + this.aClass25_Sub1_3.aFloat43) / local28);
		@Pc(109) int local109 = (int) ((this.aClass25_Sub1_3.aFloat41 + (float) arg2 * this.aClass25_Sub1_3.aFloat40 + (float) arg1 * this.aClass25_Sub1_3.aFloat38 + (float) arg0 * this.aClass25_Sub1_3.aFloat44) * (float) this.anInt4377 / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat103);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local109 - this.aFloat89);
	}

	@OriginalMember(owner = "client!hk", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt4382 || this.anInt4390 < arg0 - arg2 || arg1 + arg2 < this.anInt4400 || arg1 - arg2 > this.anInt4399) {
			return;
		}
		this.method3640();
		this.method3654(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(72) float local72 = (float) arg0 + 0.35F;
		@Pc(77) float local77 = (float) arg1 + 0.35F;
		@Pc(81) int local81 = arg2 << 1;
		if ((float) local81 < this.aFloat96) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local72 + 1.0F, local77 + 1.0F);
			OpenGL.glVertex2f(local72 + 1.0F, local77 - 1.0F);
			OpenGL.glVertex2f(local72 - 1.0F, -1.0F + local77);
			OpenGL.glVertex2f(local72 - 1.0F, local77 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local81 <= this.aFloat92) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local81);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local72, local77);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local72, local77);
			@Pc(150) int local150 = 262144 / (arg2 * 6);
			if (local150 <= 64) {
				local150 = 64;
			} else if (local150 > 512) {
				local150 = 512;
			}
			local150 = Static675.method8723(local150);
			OpenGL.glVertex2f(local72 + (float) arg2, local77);
			for (@Pc(178) int local178 = 16384 - local150; local178 > 0; local178 -= local150) {
				OpenGL.glVertex2f(Class41.aFloatArray24[local178] * (float) arg2 + local72, (float) arg2 * Class41.aFloatArray23[local178] + local77);
			}
			OpenGL.glVertex2f((float) arg2 + local72, local77);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "()Lclient!sk;")
	@Override
	public Class25 method8159() {
		return this.aClass25_Sub1_3;
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
	@Override
	public void method8126() {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8134(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static260.aFloat111 = arg2;
		Static269.aFloat119 = arg0;
		Static78.aFloat67 = arg1;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIII)V")
	public void method3623(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(FBF)V")
	public void method3624(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat97 = arg0;
		this.aFloat98 = arg1;
		this.method3618();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!kc;[Lclient!gs;Z)Lclient!da;")
	@Override
	public Class69 method8117(@OriginalArg(0) Class202 arg0, @OriginalArg(1) Class150[] arg1) {
		return new Class69_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!hk", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < this.anInt4390) {
			this.anInt4390 = arg2;
		}
		if (arg1 > this.anInt4400) {
			this.anInt4400 = arg1;
		}
		if (arg0 > this.anInt4382) {
			this.anInt4382 = arg0;
		}
		if (this.anInt4399 > arg3) {
			this.anInt4399 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method3684();
		this.method3657();
	}

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "(I)V")
	private void method3625() {
		this.method3687(-2);
		for (@Pc(14) int local14 = this.anInt4404 - 1; local14 >= 0; local14--) {
			this.method3683(local14);
			this.method3620((Class39) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method3671(8448, 8448);
		this.method3669(34168, 2, 770);
		this.method3636();
		this.anInt4374 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt4372 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean312 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean313 = true;
		this.method3681(true);
		this.method3637(true);
		this.method3631(true);
		this.method3617(true);
		this.method3665();
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
		@Pc(137) float[] local137 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(139) int local139 = 0; local139 < 8; local139++) {
			@Pc(145) int local145 = local139 + 16384;
			OpenGL.glLightfv(local145, 4608, local137, 0);
			OpenGL.glLightf(local145, 4615, 0.0F);
			OpenGL.glLightf(local145, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt4392 = this.anInt4405 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIIIZ)Lclient!nf;")
	@Override
	public Class102 method8148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class102_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!el;)V")
	@Override
	public void method8152(@OriginalArg(0) Interface8 arg0) {
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
	public void method3627() {
		if (this.anInt4373 == 4) {
			return;
		}
		this.method3678();
		this.method3681(false);
		this.method3637(false);
		this.method3631(false);
		this.method3617(false);
		this.method3687(-2);
		this.method3654(1);
		this.anInt4373 = 4;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(IIIIII)Lclient!en;")
	@Override
	public Class106 method8177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean334 ? new Class106_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass254_1.method5789(arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "()I")
	@Override
	public int method8130() {
		return 4;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!gh;Lclient!oq;)Lclient!el;")
	@Override
	public Interface8 method8166(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Interface19 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method8121(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub53 local19;
		while (!this.aClass193_21.method4454()) {
			local19 = (Class3_Sub53) this.aClass193_21.method4452();
			Static409.anIntArray423[local11++] = (int) local19.aLong309;
			this.anInt4370 -= local19.anInt10023;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static409.anIntArray423, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static409.anIntArray423, 0);
			local11 = 0;
		}
		while (!this.aClass193_22.method4454()) {
			local19 = (Class3_Sub53) this.aClass193_22.method4452();
			Static409.anIntArray423[local11++] = (int) local19.aLong309;
			this.anInt4371 -= local19.anInt10023;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static409.anIntArray423, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static409.anIntArray423, 0);
			local11 = 0;
		}
		while (!this.aClass193_23.method4454()) {
			local19 = (Class3_Sub53) this.aClass193_23.method4452();
			Static409.anIntArray423[local11++] = local19.anInt10023;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static409.anIntArray423, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static409.anIntArray423, 0);
			local11 = 0;
		}
		while (!this.bf.method4454()) {
			local19 = (Class3_Sub53) this.bf.method4452();
			Static409.anIntArray423[local11++] = (int) local19.aLong309;
			this.anInt4369 -= local19.anInt10023;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static409.anIntArray423, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static409.anIntArray423, 0);
		}
		while (!this.aClass193_20.method4454()) {
			local19 = (Class3_Sub53) this.aClass193_20.method4452();
			OpenGL.glDeleteLists((int) local19.aLong309, local19.anInt10023);
		}
		@Pc(214) Class3 local214;
		while (!this.aClass193_24.method4454()) {
			local214 = this.aClass193_24.method4452();
			OpenGL.glDeleteProgramARB((int) local214.aLong309);
		}
		while (!this.aClass193_25.method4454()) {
			local214 = this.aClass193_25.method4452();
			OpenGL.glDeleteObjectARB(local214.aLong309);
		}
		while (!this.aClass193_20.method4454()) {
			local19 = (Class3_Sub53) this.aClass193_20.method4452();
			OpenGL.glDeleteLists((int) local19.aLong309, local19.anInt10023);
		}
		this.aClass138_1.method3001();
		if (this.E() > 100663296 && this.aLong111 + 60000L < Static131.method2268()) {
			System.gc();
			this.aLong111 = Static131.method2268();
		}
		this.anInt4365 = local9;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!nba;ILclient!nba;Lclient!nba;Lclient!nba;)V")
	public void method3629(@OriginalArg(0) Class243 arg0, @OriginalArg(2) Class243 arg1, @OriginalArg(3) Class243 arg2, @OriginalArg(4) Class243 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method3622(arg0.anInterface26_5);
			OpenGL.glVertexPointer(arg0.aByte92, arg0.aShort78, this.anInterface26_2.method5255(), this.anInterface26_2.method5256() + (long) arg0.aByte93);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method3622(arg1.anInterface26_5);
			OpenGL.glNormalPointer(arg1.aShort78, this.anInterface26_2.method5255(), this.anInterface26_2.method5256() + (long) arg1.aByte93);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method3622(arg3.anInterface26_5);
			OpenGL.glColorPointer(arg3.aByte92, arg3.aShort78, this.anInterface26_2.method5255(), this.anInterface26_2.method5256() + (long) arg3.aByte93);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method3622(arg2.anInterface26_5);
			OpenGL.glTexCoordPointer(arg2.aByte92, arg2.aShort78, this.anInterface26_2.method5255(), this.anInterface26_2.method5256() + (long) arg2.aByte93);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!gs;Z)Lclient!nf;")
	@Override
	public Class102 method8132(@OriginalArg(0) Class150 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt3831 * arg0.anInt3828];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray33 == null) {
			for (local21 = 0; local21 < arg0.anInt3828; local21++) {
				for (local25 = 0; local25 < arg0.anInt3831; local25++) {
					@Pc(38) int local38 = arg0.anIntArray258[arg0.aByteArray34[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt3828; local21++) {
				for (local25 = 0; local25 < arg0.anInt3831; local25++) {
					local12[local16++] = arg0.anIntArray258[arg0.aByteArray34[local14] & 0xFF] | arg0.aByteArray33[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(124) Class102 local124 = this.method8131(arg0.anInt3831, local12, arg0.anInt3828, arg0.anInt3831);
		local124.method6959(arg0.anInt3830, arg0.anInt3826, arg0.anInt3827, arg0.anInt3829);
		return local124;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!jr;)V")
	public void method3630(@OriginalArg(1) Interface13 arg0) {
		if (this.anInt4367 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4367 >= 0) {
			this.anInterface13Array1[this.anInt4367].method2542();
		}
		this.anInterface13_2 = this.anInterface13Array1[++this.anInt4367] = arg0;
		this.anInterface13_2.method2544();
	}

	@OriginalMember(owner = "client!hk", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt4256) {
			arg2 = this.anInt4256;
		}
		if (arg3 > this.anInt4359) {
			arg3 = this.anInt4359;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt4390 = arg2;
		this.anInt4382 = arg0;
		this.anInt4400 = arg1;
		this.anInt4399 = arg3;
		OpenGL.glEnable(3089);
		this.method3684();
		this.method3657();
	}

	@OriginalMember(owner = "client!hk", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method3617(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZB)V")
	public void method3631(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean311 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt4373 &= 0xFFFFFFE0;
		this.aBoolean311 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILclient!nc;II)V")
	public void method3632(@OriginalArg(1) int arg0, @OriginalArg(2) Interface17 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1.method7367();
		@Pc(16) int local16 = arg0 * this.method3674(local9);
		this.method3619(arg1);
		OpenGL.glDrawElements(4, arg2, local9, arg1.method7364() + (long) local16);
	}

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt4389;
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V")
	public void method3633() {
		if (this.anInt4373 == 2) {
			return;
		}
		this.method3678();
		this.method3681(false);
		this.method3637(false);
		this.method3631(false);
		this.method3617(false);
		this.method3687(-2);
		this.anInt4373 = 2;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!ar;)V")
	public void method3634(@OriginalArg(1) Class25_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method844(), 0);
	}

	@OriginalMember(owner = "client!hk", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt4392 != arg0;
		if (local15 || this.aFloat93 != arg1 || this.aFloat101 != arg2) {
			this.aFloat93 = arg1;
			this.aFloat101 = arg2;
			this.anInt4392 = arg0;
			if (local15) {
				this.aFloat94 = (float) (this.anInt4392 & 0xFF0000) / 1.671168E7F;
				this.aFloat91 = (float) (this.anInt4392 & 0xFF) / 255.0F;
				this.aFloat88 = (float) (this.anInt4392 & 0xFF00) / 65280.0F;
				this.method3663();
			}
			this.method3688();
		}
		if (arg3 == this.aFloatArray39[0] && this.aFloatArray39[1] == arg4 && arg5 == this.aFloatArray39[2]) {
			return;
		}
		this.aFloatArray39[0] = arg3;
		this.aFloatArray39[2] = arg5;
		this.aFloatArray39[1] = arg4;
		this.aFloatArray41[1] = -arg4;
		this.aFloatArray41[2] = -arg5;
		this.aFloatArray41[0] = -arg3;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray42[1] = arg4 * local142;
		this.aFloatArray42[0] = local142 * arg3;
		this.aFloatArray42[2] = arg5 * local142;
		this.aFloatArray40[1] = -this.aFloatArray42[1];
		this.aFloatArray40[2] = -this.aFloatArray42[2];
		this.aFloatArray40[0] = -this.aFloatArray42[0];
		this.method3689();
		this.anInt4402 = (int) (arg5 * 256.0F / arg4);
		this.anInt4376 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!jr;)V")
	public void method3635(@OriginalArg(1) Interface13 arg0) {
		if (this.aBoolean335) {
			this.method3670(arg0);
			this.method3645(arg0);
		} else if (this.anInt4366 >= 0 && this.anInterface13Array2[this.anInt4366] == arg0) {
			this.anInterface13Array2[this.anInt4366--] = null;
			arg0.method2541();
			if (this.anInt4366 >= 0) {
				this.anInterface13_1 = this.anInterface13_2 = this.anInterface13Array2[this.anInt4366];
				this.anInterface13_1.method2545();
			} else {
				this.anInterface13_1 = this.anInterface13_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "(I)V")
	private void method3636() {
		if (this.aBoolean317) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean317 = false;
		}
	}

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "()V")
	@Override
	public void method8172() {
		this.aClass254_1.method5791();
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(ZI)V")
	public void method3637(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean315 != arg0) {
			this.aBoolean315 = arg0;
			this.method3614();
			this.anInt4373 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "()Z")
	@Override
	public boolean method8124() {
		return this.aClass3_Sub31_Sub1_1 != null && (this.anInt4361 <= 1 || this.aBoolean326);
	}

	@OriginalMember(owner = "client!hk", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3640();
		this.method3654(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(B)V")
	private void method3638() {
		OpenGL.glDepthMask(this.aBoolean310 && this.aBoolean323);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "()Z")
	@Override
	public boolean method8120() {
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)V")
	@Override
	public void method8175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "(I)V")
	private void method3639() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL1.a()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static365.method3472(1000L);
		}
	}

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V")
	@Override
	public void method8183(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "(I)V")
	private void method3640() {
		if (this.anInt4373 == 1) {
			return;
		}
		this.method3678();
		this.method3681(false);
		this.method3637(false);
		this.method3631(false);
		this.method3617(false);
		this.method3620((Class39) null);
		this.method3687(-2);
		this.method3680(1);
		this.anInt4373 = 1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZZ)V")
	public void method3641(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3646(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "(I)V")
	private void method3642() {
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.anInt4379; local13++) {
			@Pc(20) Class3_Sub7 local20 = this.aClass3_Sub7Array3[local13];
			Static216.aFloatArray38[0] = (float) local20.method6348();
			@Pc(31) int local31 = local13 + 16386;
			Static216.aFloatArray38[1] = (float) local20.method6346();
			Static216.aFloatArray38[2] = (float) local20.method6343();
			Static216.aFloatArray38[3] = 1.0F;
			OpenGL.glLightfv(local31, 4611, Static216.aFloatArray38, 0);
			@Pc(58) int local58 = local20.method6351();
			@Pc(64) float local64 = local20.method6352() / 255.0F;
			Static216.aFloatArray38[2] = (float) (local58 & 0xFF) * local64;
			Static216.aFloatArray38[0] = local64 * (float) (local58 >> 16 & 0xFF);
			Static216.aFloatArray38[1] = (float) (local58 >> 8 & 0xFF) * local64;
			OpenGL.glLightfv(local31, 4609, Static216.aFloatArray38, 0);
			OpenGL.glLightf(local31, 4617, 1.0F / (float) (local20.method6349() * local20.method6349()));
			OpenGL.glEnable(local31);
		}
		while (local13 < this.anInt4397) {
			OpenGL.glDisable(local13 + 16386);
			local13++;
		}
		this.anInt4397 = this.anInt4379;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([I)V")
	@Override
	public void method8190(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt4359;
		arg0[0] = this.anInt4256;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8116(@OriginalArg(0) Class3_Sub14 arg0) {
		this.aNativeHeap4 = ((Class3_Sub14_Sub1) arg0).aNativeHeap3;
		if (this.anInterface26_3 != null) {
			return;
		}
		@Pc(16) Class3_Sub17_Sub1 local16 = new Class3_Sub17_Sub1(80);
		if (this.aBoolean322) {
			local16.method4226(-1.0F);
			local16.method4226(-1.0F);
			local16.method4226(0.0F);
			local16.method4226(0.0F);
			local16.method4226(1.0F);
			local16.method4226(1.0F);
			local16.method4226(-1.0F);
			local16.method4226(0.0F);
			local16.method4226(1.0F);
			local16.method4226(1.0F);
			local16.method4226(1.0F);
			local16.method4226(1.0F);
			local16.method4226(0.0F);
			local16.method4226(1.0F);
			local16.method4226(0.0F);
			local16.method4226(-1.0F);
			local16.method4226(1.0F);
			local16.method4226(0.0F);
			local16.method4226(0.0F);
			local16.method4226(0.0F);
		} else {
			local16.method4229(-1.0F);
			local16.method4229(-1.0F);
			local16.method4229(0.0F);
			local16.method4229(0.0F);
			local16.method4229(1.0F);
			local16.method4229(1.0F);
			local16.method4229(-1.0F);
			local16.method4229(0.0F);
			local16.method4229(1.0F);
			local16.method4229(1.0F);
			local16.method4229(1.0F);
			local16.method4229(1.0F);
			local16.method4229(0.0F);
			local16.method4229(1.0F);
			local16.method4229(0.0F);
			local16.method4229(-1.0F);
			local16.method4229(1.0F);
			local16.method4229(0.0F);
			local16.method4229(0.0F);
			local16.method4229(0.0F);
		}
		this.anInterface26_3 = this.method3643(20, false, local16.aByteArray59, local16.lb);
		this.aClass243_5 = new Class243(this.anInterface26_3, 5126, 3, 0);
		this.aClass243_6 = new Class243(this.anInterface26_3, 5126, 2, 12);
		this.aClass272_1.method6446(this);
	}

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt4390;
		arg0[0] = this.anInt4382;
		arg0[1] = this.anInt4400;
		arg0[3] = this.anInt4399;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method8140(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "()V")
	@Override
	public void method8138() {
		if (this.aBoolean331) {
			if (this.anInterface13_2 != this.aClass109_1) {
				throw new RuntimeException();
			}
			this.aClass109_1.method2552(0);
			this.aClass109_1.method2552(8);
			this.method3635(this.aClass109_1);
		} else if (this.aBoolean330) {
			this.aClass102_Sub2_1.method6954(0, 0, this.anInt4256, this.anInt4359, 0, 0);
			this.anOpenGL1.setSurface(this.aLong110);
		} else {
			throw new RuntimeException("");
		}
		this.anInt4359 = this.anInt4352;
		this.anInt4256 = this.anInt4200;
		this.aClass102_Sub2_1 = null;
		this.method3665();
		this.method3676();
		this.la();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ[BII)Lclient!wfa;")
	public Interface26 method3643(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		return (Interface26) (this.aBoolean316 && (!arg1 || this.aBoolean337) ? new Class113_Sub2(this, arg0, arg2, arg3, arg1) : new Class127_Sub1(this, arg0, arg2, arg3));
	}

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "(II)V")
	public void method3644(@OriginalArg(1) int arg0) {
		Static544.aFloatArray65[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static544.aFloatArray65[3] = (float) (arg0 >>> 24) / 255.0F;
		Static544.aFloatArray65[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static544.aFloatArray65[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static544.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!jr;I)V")
	public void method3645(@OriginalArg(0) Interface13 arg0) {
		if (this.anInt4367 < 0 || arg0 != this.anInterface13Array1[this.anInt4367]) {
			throw new RuntimeException();
		}
		this.anInterface13Array1[this.anInt4367--] = null;
		arg0.method2542();
		if (this.anInt4367 < 0) {
			this.anInterface13_2 = null;
		} else {
			this.anInterface13_2 = this.anInterface13Array1[this.anInt4367];
			this.anInterface13_2.method2544();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZBIZ)V")
	public void method3646(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt4385 || this.aBoolean340 != this.aBoolean327) {
			@Pc(22) Class39_Sub4 local22 = null;
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = this.aBoolean340 ? 3 : 0;
			if (arg1 < 0) {
				this.method3636();
			} else {
				local22 = this.aClass138_1.method3004(arg1);
				@Pc(49) Class342 local49 = super.anInterface5_12.method5193(arg1);
				if (local49.aByte130 == 0 && local49.aByte127 == 0) {
					this.method3636();
				} else {
					@Pc(70) int local70 = local49.aBoolean695 ? 64 : 128;
					@Pc(74) int local74 = local70 * 50;
					this.method3648(0.0F, (float) (local49.aByte127 * (this.anInt4365 % local74)) / (float) local74, (float) (this.anInt4365 % local74 * local49.aByte130) / (float) local74);
				}
				if (!this.aBoolean340) {
					local35 = local49.aByte129;
					local28 = local49.anInt9281;
					local26 = local49.aByte128;
				}
				local24 = local49.anInt9279;
			}
			this.aClass153_1.method3381(local28, local35, arg0, arg2, local26);
			if (!this.aClass153_1.method3375(local22, local24)) {
				this.method3620(local22);
				this.method3680(local24);
			}
			this.anInt4385 = arg1;
			this.aBoolean327 = this.aBoolean340;
		}
		this.anInt4373 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)V")
	public synchronized void method3647(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub53 local8 = new Class3_Sub53(arg0);
		this.aClass193_23.method4462(local8);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I")
	@Override
	public int method8122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IFFF)V")
	private void method3648(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean317) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg1, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean317 = true;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Lclient!jr;I)V")
	public void method3649(@OriginalArg(0) Interface13 arg0) {
		if (this.anInt4368 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4368 >= 0) {
			this.anInterface13Array3[this.anInt4368].method2543();
		}
		this.anInterface13_1 = this.anInterface13Array3[++this.anInt4368] = arg0;
		this.anInterface13_1.method2546();
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8173(@OriginalArg(0) Canvas arg0) {
		this.aLong110 = 0L;
		this.aCanvas5 = null;
		if (arg0 == null || this.aCanvas6 == arg0) {
			this.aLong110 = this.aLong109;
			this.aCanvas5 = this.aCanvas6;
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable3.get(arg0);
			this.aLong110 = local36;
			this.aCanvas5 = arg0;
		}
		if (this.aCanvas5 == null || this.aLong110 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong110);
		this.method3693();
	}

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub14 method8188(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub14_Sub1 local8 = new Class3_Sub14_Sub1(arg0);
		this.aClass193_19.method4462(local8);
		return local8;
	}

	@OriginalMember(owner = "client!hk", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3640();
		this.method3654(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "(II)I")
	public int method3650(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BFFFF)V")
	public void method3651(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static544.aFloatArray65[3] = arg3;
		Static544.aFloatArray65[1] = arg0;
		Static544.aFloatArray65[0] = arg1;
		Static544.aFloatArray65[2] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static544.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!hk", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat86 != arg0) {
			this.aFloat86 = arg0;
			this.method3663();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!mf;)V")
	@Override
	public void method8119(@OriginalArg(0) Class237 arg0) {
		this.aClass272_1.method6442(-1, arg0, this);
	}

	@OriginalMember(owner = "client!hk", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt4395, this.anInt4391, this.anInt4396, this.anInt4377 };
	}

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "()Lclient!sk;")
	@Override
	public Class25 method8178() {
		return new Class25_Sub1();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([IIIIIZ)Lclient!nf;")
	@Override
	public Class102 method8194(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class102_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method8146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method3640();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method3654(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean333) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean333) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "(II)V")
	public void method3654(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt4374) {
			return;
		}
		@Pc(15) boolean local15;
		@Pc(19) byte local19;
		if (arg0 == 1) {
			local15 = true;
			local19 = 1;
		} else if (arg0 == 2) {
			local15 = false;
			local19 = 2;
		} else if (arg0 == 128) {
			local19 = 3;
			local15 = true;
		} else {
			local19 = 0;
			local15 = false;
		}
		if (!this.aBoolean313) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean313 = true;
		}
		if (local15 != this.aBoolean312) {
			if (local15) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean312 = local15;
		}
		if (local19 != this.anInt4372) {
			if (local19 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local19 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local19 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt4372 = local19;
		}
		this.anInt4373 &= 0xFFFFFFE3;
		this.anInt4374 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "()V")
	@Override
	public void method8127() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "(I)V")
	private void method3655() {
		@Pc(6) float[] local6 = this.aFloatArray43;
		@Pc(18) float local18 = (float) (-this.anInt4395 * this.anInt4389) / (float) this.anInt4396;
		@Pc(33) float local33 = (float) (this.anInt4389 * (this.anInt4256 - this.anInt4395)) / (float) this.anInt4396;
		@Pc(44) float local44 = (float) (this.anInt4391 * this.anInt4389) / (float) this.anInt4377;
		@Pc(59) float local59 = (float) ((this.anInt4391 - this.anInt4359) * this.anInt4389) / (float) this.anInt4377;
		if (local18 == local33 || local59 == local44) {
			local6[3] = 0.0F;
			local6[12] = 0.0F;
			local6[9] = 0.0F;
			local6[5] = 1.0F;
			local6[8] = 0.0F;
			local6[1] = 0.0F;
			local6[7] = 0.0F;
			local6[14] = 0.0F;
			local6[2] = 0.0F;
			local6[13] = 0.0F;
			local6[10] = 1.0F;
			local6[11] = 0.0F;
			local6[15] = 1.0F;
			local6[6] = 0.0F;
			local6[0] = 1.0F;
			local6[4] = 0.0F;
		} else {
			@Pc(79) float local79 = (float) this.anInt4389 * 2.0F;
			local6[14] = this.aFloat106 = -((float) this.anInt4380 * local79) / (float) (this.anInt4380 - this.anInt4389);
			local6[3] = 0.0F;
			local6[6] = 0.0F;
			local6[8] = (local18 + local33) / (local33 - local18);
			local6[5] = local79 / (local44 - local59);
			local6[1] = 0.0F;
			local6[9] = (local44 + local59) / (-local59 + local44);
			local6[10] = this.aFloat105 = (float) -(this.anInt4389 + this.anInt4380) / (float) (this.anInt4380 - this.anInt4389);
			local6[13] = 0.0F;
			local6[11] = -1.0F;
			local6[7] = 0.0F;
			local6[2] = 0.0F;
			local6[15] = 0.0F;
			local6[4] = 0.0F;
			local6[12] = 0.0F;
			local6[0] = local79 / (local33 - local18);
		}
		this.method3660();
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(II)I")
	@Override
	public int method8198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!hk", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean340 = true;
		this.anInt4387 = arg2;
		this.anInt4401 = arg1;
		this.anInt4408 = arg0;
		this.anInt4407 = arg3;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8171() {
		this.method3640();
		this.method3654(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "(I)V")
	public void method3656() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(B)V")
	private void method3657() {
		if (this.anInt4382 <= this.anInt4390 && this.anInt4399 >= this.anInt4400) {
			OpenGL.glScissor(this.anInt4406 + this.anInt4382, this.anInt4359 + this.anInt4384 - this.anInt4399, this.anInt4390 - this.anInt4382, this.anInt4399 - this.anInt4400);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt4364 = 0;
		while (arg0 > 1) {
			this.anInt4364++;
			arg0 >>= 0x1;
		}
		this.anInt4363 = 0x1 << this.anInt4364;
	}

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "(I)V")
	private void method3658() {
		this.aClass39Array1 = new Class39[this.anInt4404];
		this.aClass39_Sub4_1 = new Class39_Sub4(this, 3553, 6408, 1, 1);
		new Class39_Sub4(this, 3553, 6408, 1, 1);
		new Class39_Sub4(this, 3553, 6408, 1, 1);
		this.aClass28_Sub1_8 = new Class28_Sub1(this);
		this.aClass28_Sub1_2 = new Class28_Sub1(this);
		this.aClass28_Sub1_3 = new Class28_Sub1(this);
		this.aClass28_Sub1_6 = new Class28_Sub1(this);
		this.aClass28_Sub1_9 = new Class28_Sub1(this);
		this.aClass28_Sub1_4 = new Class28_Sub1(this);
		this.aClass28_Sub1_5 = new Class28_Sub1(this);
		this.aClass28_Sub1_1 = new Class28_Sub1(this);
		this.aClass28_Sub1_10 = new Class28_Sub1(this);
		this.aClass28_Sub1_7 = new Class28_Sub1(this);
		if (this.aBoolean331) {
			this.aClass109_2 = new Class109(this);
			new Class109(this);
		}
	}

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "(I)V")
	private void method3659() {
		@Pc(15) float local15 = this.aFloat104 * (float) -this.anInt4395 / (float) this.anInt4396;
		@Pc(27) float local27 = this.aFloat104 * (float) -this.anInt4391 / (float) this.anInt4377;
		@Pc(41) float local41 = (float) (this.anInt4256 - this.anInt4395) * this.aFloat104 / (float) this.anInt4396;
		@Pc(67) float local67 = this.aFloat104 * (float) (this.anInt4359 - this.anInt4391) / (float) this.anInt4377;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local41 != local15 && local67 != local27) {
			OpenGL.glOrtho((double) local15, (double) local41, (double) -local67, (double) -local27, (double) this.anInt4389, (double) this.anInt4380);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	@Override
	public void method8114(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt4362 = arg0;
		this.aClass138_1.method3002();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!dc;IIII)Lclient!ka;")
	@Override
	public Class28 method8137(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class28_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(B)V")
	private void method3660() {
		this.aFloatArray43[10] = this.aFloat105;
		this.aFloatArray43[14] = this.aFloat106;
		this.aFloat90 = ((float) -this.anInt4380 + this.aFloatArray43[14]) / this.aFloatArray43[10];
		this.aFloat87 = (float) this.anInt4380;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3640();
		this.method3654(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(24) float local24 = (float) -arg1 + (float) arg3;
		if (local17 == 0.0F && local24 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(45) float local45 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local24 * local24)));
			local24 *= local45;
			local17 *= local45;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local17 + (float) arg2 + 0.35F, (float) arg3 + 0.35F + local24);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZ)Lclient!nf;")
	@Override
	public Class102 method8168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class102_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Class39_Sub4_Sub1 local9 = local6.aClass39_Sub4_Sub1_5;
		this.method3633();
		this.method3620(local6.aClass39_Sub4_Sub1_5);
		this.method3654(1);
		this.method3671(7681, 8448);
		this.method3669(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat195 / (float) local9.anInt9958;
		@Pc(46) float local46 = local9.aFloat196 / (float) local9.anInt9955;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4382 - arg2), (float) (this.anInt4400 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4382, this.anInt4400);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4382 - arg2), (float) (this.anInt4399 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4382, this.anInt4399);
		OpenGL.glTexCoord2f((float) (this.anInt4390 - arg2) * local39, (float) (this.anInt4399 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4390, this.anInt4399);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4390 - arg2), local46 * (float) (this.anInt4400 - arg3));
		OpenGL.glVertex2i(this.anInt4390, this.anInt4400);
		OpenGL.glEnd();
		this.method3669(5890, 0, 768);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZI)V")
	public void method3661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)V")
	public synchronized void method3662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub53 local8 = new Class3_Sub53(arg1);
		local8.aLong309 = (long) arg0;
		this.aClass193_22.method4462(local8);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == arg2 && arg3 == arg1) {
			return;
		}
		this.method3640();
		this.method3654(1);
		@Pc(29) float local29 = (float) arg2 - (float) arg0;
		@Pc(36) float local36 = (float) -arg1 + (float) arg3;
		@Pc(49) float local49 = (float) (1.0D / Math.sqrt((double) (local36 * local36 + local29 * local29)));
		@Pc(53) float local53 = local36 * local49;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(72) float local72 = local29 * local49;
		@Pc(78) int local78 = arg7 % (arg5 + arg6);
		@Pc(83) float local83 = local72 * (float) arg5;
		@Pc(88) float local88 = local53 * (float) arg5;
		@Pc(90) float local90 = 0.0F;
		@Pc(92) float local92 = 0.0F;
		@Pc(94) float local94 = local83;
		@Pc(96) float local96 = local88;
		if (arg5 < local78) {
			local90 = local72 * (float) (arg6 + arg5 - local78);
			local92 = local53 * (float) (arg5 + arg6 - local78);
		} else {
			local96 = (float) (arg5 - local78) * local53;
			local94 = local72 * (float) (arg5 - local78);
		}
		@Pc(148) float local148 = (float) arg0 + local90 + 0.35F;
		@Pc(155) float local155 = local92 + (float) arg1 + 0.35F;
		@Pc(160) float local160 = (float) arg6 * local72;
		@Pc(165) float local165 = local53 * (float) arg6;
		while (true) {
			if (arg2 > arg0) {
				if (local148 > (float) arg2 + 0.35F) {
					break;
				}
				if (local148 + local94 > (float) arg2) {
					local94 = (float) arg2 - local148;
				}
			} else {
				if (local148 < (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 > local94 + local148) {
					local94 = (float) arg2 - local148;
				}
			}
			if (arg3 <= arg1) {
				if (local155 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local96 + local155) {
					local96 = (float) arg3 - local155;
				}
			} else {
				if (local155 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local96 + local155) {
					local96 = (float) arg3 - local155;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local148, local155);
			OpenGL.glVertex2f(local94 + local148, local155 + local96);
			local155 += local165 + local96;
			local148 += local94 + local160;
			OpenGL.glEnd();
			local96 = local88;
			local94 = local83;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8184(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas6 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable3.containsKey(arg0)) {
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
			this.aHashtable3.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "(I)V")
	private void method3663() {
		Static544.aFloatArray65[1] = this.aFloat88 * this.aFloat86;
		Static544.aFloatArray65[2] = this.aFloat91 * this.aFloat86;
		Static544.aFloatArray65[3] = 1.0F;
		Static544.aFloatArray65[0] = this.aFloat86 * this.aFloat94;
		OpenGL.glLightModelfv(2899, Static544.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "(B)V")
	private void method3664() {
		if (this.anInt4378 != 3) {
			this.anInt4378 = 3;
			this.method3659();
			this.method3667();
			this.anInt4373 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "(I)V")
	public void method3665() {
		if (this.anInt4378 != 0) {
			this.anInt4378 = 0;
			this.anInt4373 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
	@Override
	public void method8165(@OriginalArg(0) int arg0) {
		this.method3639();
	}

	@OriginalMember(owner = "client!hk", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass25_Sub1_3.aFloat39 + this.aClass25_Sub1_3.aFloat37 * (float) arg1 + this.aClass25_Sub1_3.aFloat42 * (float) arg0 + this.aClass25_Sub1_3.aFloat45 * (float) arg2;
		if (local28 < (float) this.anInt4389 || (float) this.anInt4380 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass25_Sub1_3.aFloat43 + this.aClass25_Sub1_3.aFloat48 * (float) arg0 + (float) arg1 * this.aClass25_Sub1_3.aFloat47 + (float) arg2 * this.aClass25_Sub1_3.aFloat46) * (float) this.anInt4396 / local28);
		@Pc(117) int local117 = (int) ((this.aClass25_Sub1_3.aFloat41 + this.aClass25_Sub1_3.aFloat40 * (float) arg2 + this.aClass25_Sub1_3.aFloat44 * (float) arg0 + (float) arg1 * this.aClass25_Sub1_3.aFloat38) * (float) this.anInt4377 / local28);
		if ((float) local85 >= this.aFloat103 && this.aFloat102 >= (float) local85 && (float) local117 >= this.aFloat89 && (float) local117 <= this.aFloat95) {
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat103);
			arg3[1] = (int) ((float) local117 - this.aFloat89);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "(I)V")
	public void method3666() {
		if (this.anInt4373 == 16) {
			return;
		}
		this.method3664();
		this.method3681(true);
		this.method3631(true);
		this.method3617(true);
		this.method3654(1);
		this.anInt4373 = 16;
	}

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "(B)V")
	private void method3667() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass25_Sub1_4.method844(), 0);
		if (this.aBoolean327) {
			this.aClass153_1.aClass21_Sub4_1.method4006();
		}
		this.method3689();
		this.method3642();
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(Z)V")
	private void method3668() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray43, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(IIII)V")
	public void method3669(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(BLclient!jr;)V")
	public void method3670(@OriginalArg(1) Interface13 arg0) {
		if (this.anInt4368 < 0 || arg0 != this.anInterface13Array3[this.anInt4368]) {
			throw new RuntimeException();
		}
		this.anInterface13Array3[this.anInt4368--] = null;
		arg0.method2543();
		if (this.anInt4368 >= 0) {
			this.anInterface13_1 = this.anInterface13Array3[this.anInt4368];
			this.anInterface13_1.method2546();
		} else {
			this.anInterface13_1 = null;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[Lclient!bq;)V")
	@Override
	public void method8162(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass3_Sub7Array3[local3] = arg1[local3];
		}
		this.anInt4379 = arg0;
		if (this.anInt4378 != 1) {
			this.method3642();
		}
	}

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "()Z")
	@Override
	public boolean method8149() {
		return this.aBoolean333 && (!this.method8186() || this.aBoolean326);
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(III)V")
	public void method3671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4388 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(23) boolean local23 = false;
		if (this.anInt4381 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt4381 = arg0;
			local23 = true;
		}
		if (this.anInt4398 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt4398 = arg1;
			local23 = true;
		}
		if (local23) {
			this.anInt4373 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIZ)V")
	public synchronized void method3672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class3_Sub53 local14 = new Class3_Sub53(arg0);
		local14.aLong309 = (long) arg1;
		this.bf.method4462(local14);
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(III)V")
	public synchronized void method3673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub53 local14 = new Class3_Sub53(arg0);
		local14.aLong309 = (long) arg1;
		this.aClass193_21.method4462(local14);
	}

	@OriginalMember(owner = "client!hk", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt4359 - local12 - arg1, arg2, 1, 32993, this.anInt4403, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "(II)I")
	public int method3674(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "()V")
	@Override
	public void method8189() {
		if (this.aClass3_Sub31_Sub1_1 != null && this.aClass3_Sub31_Sub1_1.method4782()) {
			this.aClass254_1.method5788(this.aClass3_Sub31_Sub1_1);
			this.aClass138_1.method3002();
		}
	}

	@OriginalMember(owner = "client!hk", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt4409;
		this.anInt4409 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(II)Lclient!gh;")
	@Override
	public Interface10 method8176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4405 == arg0 && this.anInt4386 == arg1 && arg2 == this.anInt4393) {
			return;
		}
		this.anInt4386 = arg1;
		this.anInt4393 = arg2;
		this.anInt4405 = arg0;
		this.method3618();
		this.method3682();
	}

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4389 == arg0 && this.anInt4380 == arg1) {
			return;
		}
		this.anInt4389 = arg0;
		this.anInt4380 = arg1;
		this.method3655();
		this.method3618();
		if (this.anInt4378 == 3) {
			this.method3659();
		} else if (this.anInt4378 == 2) {
			this.method3668();
		}
	}

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
	@Override
	public void method8133(@OriginalArg(0) int arg0) {
		this.method3675();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8174(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8175(arg2, arg3);
	}

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "(I)V")
	private void method3675() {
		this.anOpenGL1.b();
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(Z)V")
	private void method3676() {
		OpenGL.glViewport(this.anInt4406, this.anInt4384, this.anInt4256, this.anInt4359);
	}

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "(II)I")
	public int method3677(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(Z)V")
	private void method3678() {
		if (this.anInt4378 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt4256 > 0 && this.anInt4359 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt4256, (double) this.anInt4359, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt4373 &= 0xFFFFFFE7;
		this.anInt4378 = 1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(JB)V")
	public synchronized void method3679(@OriginalArg(0) long arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong309 = arg0;
		this.aClass193_25.method4462(local7);
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(ZI)V")
	public void method3680(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method3671(7681, 7681);
		} else if (arg0 == 0) {
			this.method3671(8448, 8448);
		} else if (arg0 == 2) {
			this.method3671(34165, 7681);
		} else if (arg0 == 3) {
			this.method3671(260, 8448);
		} else if (arg0 == 4) {
			this.method3671(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "()Z")
	@Override
	public boolean method8187() {
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		@Pc(23) Class1_Sub2 local23 = (Class1_Sub2) arg5;
		@Pc(26) Class39_Sub4_Sub1 local26 = local23.aClass39_Sub4_Sub1_5;
		this.method3633();
		this.method3620(local23.aClass39_Sub4_Sub1_5);
		this.method3654(1);
		this.method3671(7681, 8448);
		this.method3669(34167, 0, 768);
		@Pc(56) float local56 = local26.aFloat195 / (float) local26.anInt9958;
		@Pc(63) float local63 = local26.aFloat196 / (float) local26.anInt9955;
		@Pc(70) float local70 = (float) -arg0 + (float) arg2;
		@Pc(77) float local77 = (float) -arg1 + (float) arg3;
		@Pc(90) float local90 = (float) (1.0D / Math.sqrt((double) (local77 * local77 + local70 * local70)));
		@Pc(96) int local96 = arg10 % (arg8 + arg9);
		@Pc(100) float local100 = local77 * local90;
		@Pc(104) float local104 = local70 * local90;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(124) float local124 = local104 * (float) arg8;
		@Pc(129) float local129 = local100 * (float) arg8;
		@Pc(131) float local131 = 0.0F;
		@Pc(133) float local133 = 0.0F;
		@Pc(135) float local135 = local124;
		@Pc(137) float local137 = local129;
		if (arg8 < local96) {
			local131 = (float) (arg9 + arg8 - local96) * local104;
			local133 = (float) (arg8 + arg9 - local96) * local100;
		} else {
			local137 = (float) (arg8 - local96) * local100;
			local135 = (float) (arg8 - local96) * local104;
		}
		@Pc(189) float local189 = local131 + (float) arg0 + 0.35F;
		@Pc(196) float local196 = (float) arg1 + local133 + 0.35F;
		@Pc(201) float local201 = local104 * (float) arg9;
		@Pc(206) float local206 = (float) arg9 * local100;
		while (true) {
			if (arg0 < arg2) {
				if (local189 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local189 + local135) {
					local135 = (float) arg2 - local189;
				}
			} else {
				if (local189 < (float) arg2 + 0.35F) {
					break;
				}
				if (local189 + local135 < (float) arg2) {
					local135 = (float) arg2 - local189;
				}
			}
			if (arg1 >= arg3) {
				if (local196 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local137 + local196) {
					local137 = (float) arg3 - local196;
				}
			} else {
				if ((float) arg3 + 0.35F < local196) {
					break;
				}
				if (local196 + local137 > (float) arg3) {
					local137 = (float) arg3 - local196;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local56 * ((float) -arg6 + local189), (local196 - (float) arg7) * local63);
			OpenGL.glVertex2f(local189, local196);
			OpenGL.glTexCoord2f(local56 * ((float) -arg6 + local135 + local189), (local137 + local196 - (float) arg7) * local63);
			OpenGL.glVertex2f(local135 + local189, local137 + local196);
			local196 += local137 + local206;
			OpenGL.glEnd();
			local189 += local135 + local201;
			local137 = local129;
			local135 = local124;
		}
		this.method3669(5890, 0, 768);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V")
	public void method3681(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean328 != arg0) {
			this.aBoolean328 = arg0;
			this.method3682();
			this.anInt4373 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!hk", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(57) float local57;
		@Pc(45) float local45;
		if (this.aClass39_Sub4_Sub1_1 == null || arg2 > this.aClass39_Sub4_Sub1_1.anInt9944 || arg3 > this.aClass39_Sub4_Sub1_1.anInt9946) {
			this.aClass39_Sub4_Sub1_1 = Static608.method8045(arg2, arg3, this, arg6);
			this.aClass39_Sub4_Sub1_1.method8469(false, false);
			local45 = this.aClass39_Sub4_Sub1_1.aFloat195;
			local57 = this.aClass39_Sub4_Sub1_1.aFloat196;
		} else {
			this.aClass39_Sub4_Sub1_1.method8468(arg3, arg2, arg6, false, 6406);
			local45 = this.aClass39_Sub4_Sub1_1.aFloat195 * (float) arg2 / (float) this.aClass39_Sub4_Sub1_1.anInt9944;
			local57 = this.aClass39_Sub4_Sub1_1.aFloat196 * (float) arg3 / (float) this.aClass39_Sub4_Sub1_1.anInt9946;
		}
		this.method3633();
		this.method3620(this.aClass39_Sub4_Sub1_1);
		this.method3654(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3644(arg5);
		this.method3671(34165, 34165);
		this.method3669(34166, 0, 768);
		this.method3669(5890, 2, 770);
		this.method3661(0, 34166);
		this.method3661(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
		@Pc(160) float local160 = local150 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local147, local160);
		OpenGL.glTexCoord2f(local57, local45);
		OpenGL.glVertex2f(local155, local160);
		OpenGL.glTexCoord2f(local57, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method3669(5890, 0, 768);
		this.method3669(34166, 2, 770);
		this.method3661(0, 5890);
		this.method3661(2, 34166);
	}

	@OriginalMember(owner = "client!hk", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt4399 = this.anInt4359;
		this.anInt4382 = 0;
		this.anInt4390 = this.anInt4256;
		this.anInt4400 = 0;
		OpenGL.glDisable(3089);
		this.method3684();
	}

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "()Z")
	@Override
	public boolean method8197() {
		return false;
	}

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "(I)V")
	private void method3682() {
		if (this.aBoolean328 && this.anInt4386 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "(II)V")
	public void method3683(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt4388) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt4388 = arg0;
		}
	}

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "(B)V")
	private void method3684() {
		this.aFloat89 = (float) (this.anInt4400 - this.anInt4391);
		this.aFloat102 = (float) (this.anInt4390 - this.anInt4395);
		this.aFloat95 = (float) (this.anInt4399 - this.anInt4391);
		this.aFloat103 = (float) (this.anInt4382 - this.anInt4395);
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)V")
	@Override
	public void method8139(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "(I)Lclient!bja;")
	public Class39_Sub1 method3685() {
		return this.aClass106_Sub2_1 == null ? null : this.aClass106_Sub2_1.method4441();
	}

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "(I)V")
	public void method3686() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "(II)V")
	public void method3687(@OriginalArg(1) int arg0) {
		this.method3641(arg0, true);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class104 method8196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class104_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method8135(@OriginalArg(0) Class25 arg0) {
		this.aClass25_Sub1_3.method4297(arg0);
		this.aClass25_Sub1_4.method4297(this.aClass25_Sub1_3);
		this.aClass25_Sub1_4.method845();
		this.aClass25_Sub1_5.method843(this.aClass25_Sub1_4);
		if (this.anInt4378 != 1) {
			this.method3667();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!mf;I)V")
	@Override
	public void method8115(@OriginalArg(0) Class237 arg0, @OriginalArg(1) int arg1) {
		this.aClass272_1.method6442(arg1, arg0, this);
	}

	@OriginalMember(owner = "client!hk", name = "B", descriptor = "(I)V")
	private void method3688() {
		Static544.aFloatArray65[0] = this.aFloat94 * this.aFloat93;
		Static544.aFloatArray65[1] = this.aFloat88 * this.aFloat93;
		Static544.aFloatArray65[2] = this.aFloat91 * this.aFloat93;
		Static544.aFloatArray65[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static544.aFloatArray65, 0);
		Static544.aFloatArray65[3] = 1.0F;
		Static544.aFloatArray65[0] = this.aFloat94 * -this.aFloat101;
		Static544.aFloatArray65[2] = -this.aFloat101 * this.aFloat91;
		Static544.aFloatArray65[1] = this.aFloat88 * -this.aFloat101;
		OpenGL.glLightfv(16385, 4609, Static544.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!hk", name = "C", descriptor = "(I)V")
	public void method3689() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray42, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray40, 0);
	}

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "()Z")
	@Override
	public boolean method8179() {
		return false;
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(Z)V")
	public void method3690() {
		if (this.anInt4373 == 8) {
			return;
		}
		this.method3616();
		this.method3681(true);
		this.method3631(true);
		this.method3617(true);
		this.method3654(1);
		this.anInt4373 = 8;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!ar;)V")
	public void method3691(@OriginalArg(1) Class25_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method844(), 0);
	}

	@OriginalMember(owner = "client!hk", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass25_Sub1_3.aFloat39 + this.aClass25_Sub1_3.aFloat45 * (float) arg2 + this.aClass25_Sub1_3.aFloat42 * (float) arg0 + this.aClass25_Sub1_3.aFloat37 * (float) arg1;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass25_Sub1_3.aFloat39 + this.aClass25_Sub1_3.aFloat42 * (float) arg3 + (float) arg4 * this.aClass25_Sub1_3.aFloat37 + this.aClass25_Sub1_3.aFloat45 * (float) arg5;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt4389 > local32 && (float) this.anInt4389 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt4380 < local32 && (float) this.anInt4380 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass25_Sub1_3.aFloat43 + this.aClass25_Sub1_3.aFloat47 * (float) arg1 + this.aClass25_Sub1_3.aFloat48 * (float) arg0 + (float) arg2 * this.aClass25_Sub1_3.aFloat46) * (float) this.anInt4396 / local32);
		@Pc(167) int local167 = (int) (((float) arg3 * this.aClass25_Sub1_3.aFloat48 + this.aClass25_Sub1_3.aFloat47 * (float) arg4 + (float) arg5 * this.aClass25_Sub1_3.aFloat46 + this.aClass25_Sub1_3.aFloat43) * (float) this.anInt4396 / local63);
		if (this.aFloat103 > (float) local135 && (float) local167 < this.aFloat103) {
			local7 |= 0x1;
		} else if (this.aFloat102 < (float) local135 && this.aFloat102 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt4377 * ((float) arg2 * this.aClass25_Sub1_3.aFloat40 + (float) arg0 * this.aClass25_Sub1_3.aFloat44 + (float) arg1 * this.aClass25_Sub1_3.aFloat38 + this.aClass25_Sub1_3.aFloat41) / local32);
		@Pc(265) int local265 = (int) (((float) arg5 * this.aClass25_Sub1_3.aFloat40 + (float) arg4 * this.aClass25_Sub1_3.aFloat38 + (float) arg3 * this.aClass25_Sub1_3.aFloat44 + this.aClass25_Sub1_3.aFloat41) * (float) this.anInt4377 / local63);
		if (this.aFloat89 > (float) local233 && (float) local265 < this.aFloat89) {
			local7 |= 0x4;
		} else if (this.aFloat95 < (float) local233 && this.aFloat95 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!en;)V")
	@Override
	public void method8201(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub2_1 = (Class106_Sub2) arg0;
	}

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "()V")
	@Override
	public void method8161() {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
	@Override
	public void method8125(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;IZI)Lclient!wfa;")
	public Interface26 method3692(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(4) int arg2) {
		return (Interface26) (this.aBoolean316 ? new Class113_Sub2(this, arg2, arg1, arg0, false) : new Class127_Sub1(this, arg2, arg1));
	}

	@OriginalMember(owner = "client!hk", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4396 = arg2;
		this.anInt4395 = arg0;
		this.anInt4377 = arg3;
		this.anInt4391 = arg1;
		this.method3655();
		this.method3684();
		if (this.anInt4378 == 3) {
			this.method3659();
		} else if (this.anInt4378 == 2) {
			this.method3668();
			return;
		}
	}

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "()Lclient!sk;")
	@Override
	public Class25 method8156() {
		return this.aClass25_Sub1_1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8118(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas6 == arg0) {
			local5 = this.aLong109;
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable3.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas5) {
			this.method3693();
		}
	}

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "(B)V")
	private void method3693() {
		if (this.aCanvas5 == null) {
			this.anInt4200 = this.anInt4352 = 0;
		} else {
			@Pc(23) Dimension local23 = this.aCanvas5.getSize();
			this.anInt4200 = local23.width;
			this.anInt4352 = local23.height;
		}
		if (this.anInterface13_2 == null) {
			this.anInt4359 = this.anInt4352;
			this.anInt4256 = this.anInt4200;
			this.method3676();
		}
		this.method3665();
		this.la();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static595.method7960(arg1, arg2, arg3, arg0, this);
	}

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "(B)I")
	private int method3694() {
		this.aString53 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString52 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString53.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString53.indexOf("brian paul") != -1 || this.aString53.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(51) String local51 = OpenGL.glGetString(7938);
		@Pc(59) String[] local59 = Static325.method5062(local51.replace('.', ' '), ' ');
		if (local59.length >= 2) {
			try {
				@Pc(71) int local71 = Static305.method4695(local59[0]);
				@Pc(77) int local77 = Static305.method4695(local59[1]);
				this.anInt4383 = local71 * 10 + local77;
			} catch (@Pc(86) NumberFormatException local86) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt4383 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(127) int[] local127 = new int[1];
		OpenGL.glGetIntegerv(34018, local127, 0);
		this.anInt4404 = local127[0];
		OpenGL.glGetIntegerv(34929, local127, 0);
		this.anInt4375 = local127[0];
		OpenGL.glGetIntegerv(34930, local127, 0);
		this.anInt4394 = local127[0];
		if (this.anInt4404 < 2 || this.anInt4375 < 2 || this.anInt4394 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean322 = Stream.c();
		this.aBoolean330 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean316 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean333 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean336 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean332 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean339 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean320 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean318 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean334 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean329 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean314 = false;
		this.aBoolean331 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean335 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean319 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean326 = this.aBoolean335 & this.aBoolean319;
		this.aBoolean338 = Class359.aString121.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static544.aFloatArray65, 0);
		this.aFloat96 = Static544.aFloatArray65[0];
		this.aFloat92 = Static544.aFloatArray65[1];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IF)V")
	public void method3695(@OriginalArg(1) float arg0) {
		if (this.aFloat104 == arg0) {
			return;
		}
		this.aFloat104 = arg0;
		if (this.anInt4378 == 3) {
			this.method3659();
			return;
		}
	}
}
