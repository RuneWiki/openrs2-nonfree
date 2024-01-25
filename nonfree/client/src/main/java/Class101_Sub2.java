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

@OriginalClass("client!lea")
public final class Class101_Sub2 extends Class101 {

	@OriginalMember(owner = "client!lea", name = "Hb", descriptor = "I")
	private int anInt6182;

	@OriginalMember(owner = "client!lea", name = "Lb", descriptor = "I")
	public int anInt6186;

	@OriginalMember(owner = "client!lea", name = "kc", descriptor = "I")
	public int anInt6211;

	@OriginalMember(owner = "client!lea", name = "vc", descriptor = "I")
	private int anInt6222;

	@OriginalMember(owner = "client!lea", name = "ye", descriptor = "I")
	public int anInt6314;

	@OriginalMember(owner = "client!lea", name = "Ae", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!lea", name = "Ee", descriptor = "Lclient!bq;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!lea", name = "He", descriptor = "Lclient!qg;")
	private Class71_Sub3 aClass71_Sub3_1;

	@OriginalMember(owner = "client!lea", name = "Je", descriptor = "Lclient!uba;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!lea", name = "Le", descriptor = "Lclient!uba;")
	private Interface22 anInterface22_2;

	@OriginalMember(owner = "client!lea", name = "Oe", descriptor = "I")
	public int anInt6320;

	@OriginalMember(owner = "client!lea", name = "Pe", descriptor = "I")
	private int anInt6321;

	@OriginalMember(owner = "client!lea", name = "Re", descriptor = "I")
	public int anInt6322;

	@OriginalMember(owner = "client!lea", name = "Ye", descriptor = "J")
	private long aLong171;

	@OriginalMember(owner = "client!lea", name = "Ze", descriptor = "I")
	private int anInt6323;

	@OriginalMember(owner = "client!lea", name = "af", descriptor = "Z")
	private boolean aBoolean447;

	@OriginalMember(owner = "client!lea", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!lea", name = "cf", descriptor = "I")
	private int anInt6324;

	@OriginalMember(owner = "client!lea", name = "ef", descriptor = "Z")
	private boolean aBoolean448;

	@OriginalMember(owner = "client!lea", name = "ff", descriptor = "Z")
	private boolean aBoolean449;

	@OriginalMember(owner = "client!lea", name = "gf", descriptor = "Z")
	private boolean aBoolean450;

	@OriginalMember(owner = "client!lea", name = "kf", descriptor = "Lclient!pc;")
	public Class274 aClass274_8;

	@OriginalMember(owner = "client!lea", name = "lf", descriptor = "I")
	public int anInt6325;

	@OriginalMember(owner = "client!lea", name = "mf", descriptor = "Z")
	public boolean aBoolean451;

	@OriginalMember(owner = "client!lea", name = "of", descriptor = "Lclient!qb;")
	public Class14_Sub2 aClass14_Sub2_1;

	@OriginalMember(owner = "client!lea", name = "pf", descriptor = "Z")
	public boolean aBoolean452;

	@OriginalMember(owner = "client!lea", name = "qf", descriptor = "Z")
	public boolean aBoolean453;

	@OriginalMember(owner = "client!lea", name = "tf", descriptor = "Lclient!pc;")
	public Class274 aClass274_9;

	@OriginalMember(owner = "client!lea", name = "yf", descriptor = "Z")
	private boolean aBoolean456;

	@OriginalMember(owner = "client!lea", name = "Af", descriptor = "Z")
	public boolean aBoolean457;

	@OriginalMember(owner = "client!lea", name = "Df", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!lea", name = "Ef", descriptor = "I")
	private int anInt6331;

	@OriginalMember(owner = "client!lea", name = "If", descriptor = "Z")
	public boolean aBoolean459;

	@OriginalMember(owner = "client!lea", name = "Jf", descriptor = "Lclient!qb;")
	public Class14_Sub2 aClass14_Sub2_2;

	@OriginalMember(owner = "client!lea", name = "Kf", descriptor = "I")
	private int anInt6334;

	@OriginalMember(owner = "client!lea", name = "Lf", descriptor = "Lclient!qb;")
	public Class14_Sub2 aClass14_Sub2_3;

	@OriginalMember(owner = "client!lea", name = "Mf", descriptor = "F")
	private float aFloat126;

	@OriginalMember(owner = "client!lea", name = "Pf", descriptor = "Lclient!uk;")
	private Class50_Sub4_Sub1 aClass50_Sub4_Sub1_2;

	@OriginalMember(owner = "client!lea", name = "Rf", descriptor = "Z")
	public boolean aBoolean461;

	@OriginalMember(owner = "client!lea", name = "Tf", descriptor = "I")
	public int anInt6337;

	@OriginalMember(owner = "client!lea", name = "Uf", descriptor = "Z")
	private boolean aBoolean462;

	@OriginalMember(owner = "client!lea", name = "Wf", descriptor = "Z")
	private boolean aBoolean464;

	@OriginalMember(owner = "client!lea", name = "Xf", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!lea", name = "Yf", descriptor = "Lclient!ab;")
	private Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!lea", name = "Zf", descriptor = "F")
	private float aFloat129;

	@OriginalMember(owner = "client!lea", name = "dg", descriptor = "Lclient!tj;")
	private Interface20 anInterface20_2;

	@OriginalMember(owner = "client!lea", name = "eg", descriptor = "I")
	public int anInt6339;

	@OriginalMember(owner = "client!lea", name = "gg", descriptor = "[Lclient!fga;")
	private Class50[] aClass50Array1;

	@OriginalMember(owner = "client!lea", name = "hg", descriptor = "Lclient!cq;")
	private Interface2 anInterface2_3;

	@OriginalMember(owner = "client!lea", name = "jg", descriptor = "I")
	public int anInt6341;

	@OriginalMember(owner = "client!lea", name = "kg", descriptor = "Lclient!cq;")
	private Interface2 anInterface2_4;

	@OriginalMember(owner = "client!lea", name = "lg", descriptor = "Lclient!wi;")
	public Class50_Sub4 aClass50_Sub4_1;

	@OriginalMember(owner = "client!lea", name = "ng", descriptor = "I")
	private int anInt6342;

	@OriginalMember(owner = "client!lea", name = "pg", descriptor = "Lclient!qb;")
	public Class14_Sub2 aClass14_Sub2_4;

	@OriginalMember(owner = "client!lea", name = "qg", descriptor = "Z")
	private boolean aBoolean468;

	@OriginalMember(owner = "client!lea", name = "sg", descriptor = "I")
	private int anInt6344;

	@OriginalMember(owner = "client!lea", name = "tg", descriptor = "Z")
	public boolean aBoolean470;

	@OriginalMember(owner = "client!lea", name = "yg", descriptor = "Lclient!qb;")
	public Class14_Sub2 aClass14_Sub2_5;

	@OriginalMember(owner = "client!lea", name = "Bg", descriptor = "Z")
	private boolean aBoolean471;

	@OriginalMember(owner = "client!lea", name = "Cg", descriptor = "Z")
	public boolean aBoolean472;

	@OriginalMember(owner = "client!lea", name = "Fg", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!lea", name = "Gg", descriptor = "Lclient!bq;")
	public Class39 aClass39_2;

	@OriginalMember(owner = "client!lea", name = "Jg", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!lea", name = "Kg", descriptor = "Lclient!qb;")
	public Class14_Sub2 aClass14_Sub2_6;

	@OriginalMember(owner = "client!lea", name = "Lg", descriptor = "I")
	private int anInt6349;

	@OriginalMember(owner = "client!lea", name = "Mg", descriptor = "Ljava/lang/String;")
	private String aString73;

	@OriginalMember(owner = "client!lea", name = "Qg", descriptor = "Z")
	private boolean aBoolean474;

	@OriginalMember(owner = "client!lea", name = "Rg", descriptor = "Lclient!qb;")
	public Class14_Sub2 aClass14_Sub2_7;

	@OriginalMember(owner = "client!lea", name = "Sg", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!lea", name = "Vg", descriptor = "I")
	private int anInt6353;

	@OriginalMember(owner = "client!lea", name = "Wg", descriptor = "Z")
	private boolean aBoolean475;

	@OriginalMember(owner = "client!lea", name = "Xg", descriptor = "Lclient!qb;")
	public Class14_Sub2 aClass14_Sub2_8;

	@OriginalMember(owner = "client!lea", name = "ah", descriptor = "Ljava/lang/String;")
	private String aString74;

	@OriginalMember(owner = "client!lea", name = "ch", descriptor = "I")
	private int anInt6354;

	@OriginalMember(owner = "client!lea", name = "dh", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!lea", name = "eh", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!lea", name = "fh", descriptor = "I")
	private int anInt6355;

	@OriginalMember(owner = "client!lea", name = "ih", descriptor = "F")
	private float aFloat140;

	@OriginalMember(owner = "client!lea", name = "lh", descriptor = "Lclient!qb;")
	public Class14_Sub2 aClass14_Sub2_9;

	@OriginalMember(owner = "client!lea", name = "ph", descriptor = "Z")
	public boolean aBoolean477;

	@OriginalMember(owner = "client!lea", name = "qh", descriptor = "Lclient!qb;")
	public Class14_Sub2 aClass14_Sub2_10;

	@OriginalMember(owner = "client!lea", name = "sh", descriptor = "I")
	private int anInt6359;

	@OriginalMember(owner = "client!lea", name = "vh", descriptor = "I")
	private int anInt6360;

	@OriginalMember(owner = "client!lea", name = "xb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!lea", name = "je", descriptor = "I")
	public int anInt6307 = 128;

	@OriginalMember(owner = "client!lea", name = "pe", descriptor = "Lclient!nh;")
	private final Class247 aClass247_1 = new Class247();

	@OriginalMember(owner = "client!lea", name = "ve", descriptor = "Lclient!iq;")
	private final Class76_Sub1 aClass76_Sub1_1 = new Class76_Sub1();

	@OriginalMember(owner = "client!lea", name = "we", descriptor = "Lclient!iq;")
	public final Class76_Sub1 aClass76_Sub1_2 = new Class76_Sub1();

	@OriginalMember(owner = "client!lea", name = "Ce", descriptor = "I")
	public int anInt6316 = 8;

	@OriginalMember(owner = "client!lea", name = "De", descriptor = "Z")
	private boolean aBoolean446 = false;

	@OriginalMember(owner = "client!lea", name = "ze", descriptor = "I")
	public int anInt6315 = 3;

	@OriginalMember(owner = "client!lea", name = "xe", descriptor = "Lclient!ow;")
	private final Class271 aClass271_31 = new Class271();

	@OriginalMember(owner = "client!lea", name = "Ge", descriptor = "[Lclient!uba;")
	private final Interface22[] anInterface22Array1 = new Interface22[4];

	@OriginalMember(owner = "client!lea", name = "Ie", descriptor = "[Lclient!uba;")
	private final Interface22[] anInterface22Array2 = new Interface22[4];

	@OriginalMember(owner = "client!lea", name = "Fe", descriptor = "I")
	private int anInt6317 = -1;

	@OriginalMember(owner = "client!lea", name = "Ke", descriptor = "I")
	private int anInt6318 = -1;

	@OriginalMember(owner = "client!lea", name = "Me", descriptor = "[Lclient!uba;")
	private final Interface22[] anInterface22Array3 = new Interface22[4];

	@OriginalMember(owner = "client!lea", name = "Ne", descriptor = "I")
	private int anInt6319 = -1;

	@OriginalMember(owner = "client!lea", name = "Qe", descriptor = "Lclient!ow;")
	private final Class271 aClass271_32;

	@OriginalMember(owner = "client!lea", name = "Se", descriptor = "Lclient!ow;")
	private final Class271 aClass271_33;

	@OriginalMember(owner = "client!lea", name = "Te", descriptor = "Lclient!ow;")
	private final Class271 aClass271_34;

	@OriginalMember(owner = "client!lea", name = "Ue", descriptor = "Lclient!ow;")
	private final Class271 aClass271_35;

	@OriginalMember(owner = "client!lea", name = "Ve", descriptor = "Lclient!ow;")
	private final Class271 aClass271_36;

	@OriginalMember(owner = "client!lea", name = "We", descriptor = "Lclient!ow;")
	private final Class271 aClass271_37;

	@OriginalMember(owner = "client!lea", name = "Xe", descriptor = "Lclient!ow;")
	private final Class271 aClass271_38;

	@OriginalMember(owner = "client!lea", name = "df", descriptor = "Lclient!iq;")
	public final Class76_Sub1 aClass76_Sub1_3;

	@OriginalMember(owner = "client!lea", name = "hf", descriptor = "Lclient!iq;")
	public final Class76_Sub1 aClass76_Sub1_4;

	@OriginalMember(owner = "client!lea", name = "jf", descriptor = "Lclient!iq;")
	public final Class76_Sub1 aClass76_Sub1_5;

	@OriginalMember(owner = "client!lea", name = "Cf", descriptor = "F")
	private float aFloat124;

	@OriginalMember(owner = "client!lea", name = "Hf", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!lea", name = "rf", descriptor = "I")
	public int anInt6326;

	@OriginalMember(owner = "client!lea", name = "uf", descriptor = "I")
	private int anInt6327;

	@OriginalMember(owner = "client!lea", name = "Bf", descriptor = "I")
	private int anInt6330;

	@OriginalMember(owner = "client!lea", name = "Ff", descriptor = "I")
	private int anInt6332;

	@OriginalMember(owner = "client!lea", name = "cg", descriptor = "I")
	public int anInt6338;

	@OriginalMember(owner = "client!lea", name = "bg", descriptor = "Z")
	private boolean aBoolean466;

	@OriginalMember(owner = "client!lea", name = "Gf", descriptor = "I")
	private int anInt6333;

	@OriginalMember(owner = "client!lea", name = "zg", descriptor = "I")
	public int anInt6347;

	@OriginalMember(owner = "client!lea", name = "sf", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!lea", name = "Dg", descriptor = "F")
	private float aFloat132;

	@OriginalMember(owner = "client!lea", name = "Hg", descriptor = "I")
	private int anInt6348;

	@OriginalMember(owner = "client!lea", name = "Qf", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!lea", name = "Nf", descriptor = "I")
	public int anInt6335;

	@OriginalMember(owner = "client!lea", name = "Ng", descriptor = "I")
	public int anInt6350;

	@OriginalMember(owner = "client!lea", name = "Ig", descriptor = "[F")
	private final float[] aFloatArray35;

	@OriginalMember(owner = "client!lea", name = "Ug", descriptor = "[F")
	private final float[] aFloatArray36;

	@OriginalMember(owner = "client!lea", name = "xg", descriptor = "F")
	private float aFloat131;

	@OriginalMember(owner = "client!lea", name = "Pg", descriptor = "Z")
	private boolean aBoolean473;

	@OriginalMember(owner = "client!lea", name = "nf", descriptor = "F")
	public float aFloat122;

	@OriginalMember(owner = "client!lea", name = "Yg", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!lea", name = "ug", descriptor = "F")
	private float aFloat130;

	@OriginalMember(owner = "client!lea", name = "vf", descriptor = "I")
	public int anInt6328;

	@OriginalMember(owner = "client!lea", name = "bh", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!lea", name = "fg", descriptor = "I")
	public int anInt6340;

	@OriginalMember(owner = "client!lea", name = "zf", descriptor = "I")
	private int anInt6329;

	@OriginalMember(owner = "client!lea", name = "vg", descriptor = "I")
	private int anInt6345;

	@OriginalMember(owner = "client!lea", name = "gh", descriptor = "I")
	private int anInt6356;

	@OriginalMember(owner = "client!lea", name = "Og", descriptor = "I")
	public int anInt6351;

	@OriginalMember(owner = "client!lea", name = "Sf", descriptor = "I")
	public int anInt6336;

	@OriginalMember(owner = "client!lea", name = "nh", descriptor = "F")
	private float aFloat142;

	@OriginalMember(owner = "client!lea", name = "Zg", descriptor = "[F")
	private final float[] aFloatArray37;

	@OriginalMember(owner = "client!lea", name = "hh", descriptor = "I")
	private int anInt6357;

	@OriginalMember(owner = "client!lea", name = "oh", descriptor = "[F")
	public final float[] aFloatArray38;

	@OriginalMember(owner = "client!lea", name = "og", descriptor = "I")
	public int anInt6343;

	@OriginalMember(owner = "client!lea", name = "Tg", descriptor = "I")
	public int anInt6352;

	@OriginalMember(owner = "client!lea", name = "kh", descriptor = "I")
	private int anInt6358;

	@OriginalMember(owner = "client!lea", name = "mg", descriptor = "[F")
	private final float[] aFloatArray34;

	@OriginalMember(owner = "client!lea", name = "jh", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!lea", name = "Eg", descriptor = "[Lclient!mfa;")
	private final Class2_Sub13[] aClass2_Sub13Array4;

	@OriginalMember(owner = "client!lea", name = "Ag", descriptor = "Lclient!bca;")
	public Class2_Sub8_Sub1 aClass2_Sub8_Sub1_2;

	@OriginalMember(owner = "client!lea", name = "rh", descriptor = "[B")
	public final byte[] aByteArray63;

	@OriginalMember(owner = "client!lea", name = "uh", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!lea", name = "th", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!lea", name = "wh", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!lea", name = "te", descriptor = "I")
	public final int anInt6313;

	@OriginalMember(owner = "client!lea", name = "Rc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas6;

	@OriginalMember(owner = "client!lea", name = "Ud", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!lea", name = "Ed", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!lea", name = "qb", descriptor = "J")
	private final long aLong169;

	@OriginalMember(owner = "client!lea", name = "wd", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!lea", name = "wg", descriptor = "I")
	public final int anInt6346;

	@OriginalMember(owner = "client!lea", name = "xf", descriptor = "Z")
	public boolean aBoolean455;

	@OriginalMember(owner = "client!lea", name = "wf", descriptor = "Z")
	public boolean aBoolean454;

	@OriginalMember(owner = "client!lea", name = "rg", descriptor = "Z")
	private boolean aBoolean469;

	@OriginalMember(owner = "client!lea", name = "ig", descriptor = "Z")
	public boolean aBoolean467;

	@OriginalMember(owner = "client!lea", name = "ag", descriptor = "Z")
	public boolean aBoolean465;

	@OriginalMember(owner = "client!lea", name = "mh", descriptor = "Z")
	private boolean aBoolean476;

	@OriginalMember(owner = "client!lea", name = "Vf", descriptor = "Z")
	public boolean aBoolean463;

	@OriginalMember(owner = "client!lea", name = "Of", descriptor = "Z")
	private final boolean aBoolean460;

	@OriginalMember(owner = "client!lea", name = "oe", descriptor = "Lclient!oha;")
	private final Class262 aClass262_1;

	@OriginalMember(owner = "client!lea", name = "Be", descriptor = "Lclient!im;")
	public final Class168 aClass168_1;

	@OriginalMember(owner = "client!lea", name = "he", descriptor = "Lclient!qc;")
	private final Class293 aClass293_1;

	@OriginalMember(owner = "client!lea", name = "ke", descriptor = "Lclient!vc;")
	private Class2_Sub31_Sub1 aClass2_Sub31_Sub1_1;

	@OriginalMember(owner = "client!lea", name = "me", descriptor = "Lclient!rr;")
	private final Class323 aClass323_1;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class101_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class279();
		new Class335(16);
		this.aClass271_32 = new Class271();
		this.aClass271_33 = new Class271();
		this.aClass271_34 = new Class271();
		this.aClass271_35 = new Class271();
		this.aClass271_36 = new Class271();
		this.aClass271_37 = new Class271();
		this.aClass271_38 = new Class271();
		this.aClass76_Sub1_3 = new Class76_Sub1();
		this.aClass76_Sub1_4 = new Class76_Sub1();
		this.aClass76_Sub1_5 = new Class76_Sub1();
		this.aFloat124 = 1.0F;
		this.aFloat125 = 1.0F;
		this.anInt6326 = 0;
		this.anInt6327 = 3584;
		this.anInt6330 = 0;
		this.anInt6332 = 8448;
		this.anInt6338 = 50;
		this.aBoolean466 = true;
		this.anInt6333 = 0;
		this.anInt6347 = 512;
		this.aFloat123 = 3584.0F;
		this.aFloat132 = 1.0F;
		this.anInt6348 = 8448;
		this.aFloat127 = 1.0F;
		this.anInt6335 = -1;
		this.anInt6350 = -1;
		this.aFloatArray35 = new float[16];
		this.aFloatArray36 = new float[4];
		this.aFloat131 = 0.0F;
		this.aBoolean473 = false;
		this.aFloat122 = -1.0F;
		this.aFloat136 = 3584.0F;
		this.aFloat130 = -1.0F;
		this.anInt6328 = 0;
		this.aFloat137 = -1.0F;
		this.anInt6340 = 0;
		this.anInt6329 = -1;
		this.anInt6345 = 0;
		this.anInt6356 = 0;
		this.anInt6351 = -1;
		this.anInt6336 = 512;
		this.aFloat142 = -1.0F;
		this.aFloatArray37 = new float[4];
		this.anInt6357 = 0;
		this.aFloatArray38 = new float[4];
		this.anInt6343 = 0;
		this.anInt6352 = -1;
		this.anInt6358 = 0;
		this.aFloatArray34 = new float[4];
		this.aFloat141 = 1.0F;
		this.aClass2_Sub13Array4 = new Class2_Sub13[Static15.anInt275];
		this.aClass2_Sub8_Sub1_2 = new Class2_Sub8_Sub1(8192);
		this.aByteArray63 = new byte[16384];
		this.anIntArray305 = new int[1];
		this.anIntArray304 = new int[1];
		this.anIntArray306 = new int[1];
		this.anInt6313 = arg2;
		this.aCanvas7 = this.aCanvas6 = arg0;
		if (!Static91.method1580("jaclib")) {
			throw new RuntimeException("");
		} else if (Static91.method1580("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong170 = this.aLong169 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt6313);
				if (this.aLong169 == 0L) {
					throw new RuntimeException("");
				}
				this.method5663();
				@Pc(335) int local335 = this.method5671();
				if (local335 != 0) {
					throw new RuntimeException("");
				}
				this.anInt6346 = this.aBoolean470 ? 33639 : 5121;
				if (this.aString73.indexOf("radeon") != -1) {
					@Pc(362) int local362 = 0;
					@Pc(364) boolean local364 = false;
					@Pc(366) boolean local366 = false;
					@Pc(375) String[] local375 = Static184.method3569(' ', this.aString73.replace('/', ' '));
					for (@Pc(377) int local377 = 0; local377 < local375.length; local377++) {
						@Pc(383) String local383 = local375[local377];
						try {
							if (local383.length() > 0) {
								if (local383.charAt(0) == 'x' && local383.length() >= 3 && Static664.method9705(local383.substring(1, 3))) {
									local383 = local383.substring(1);
									local366 = true;
								}
								if (local383.equals("hd")) {
									local364 = true;
								} else {
									if (local383.startsWith("hd")) {
										local383 = local383.substring(2);
										local364 = true;
									}
									if (local383.length() >= 4 && Static664.method9705(local383.substring(0, 4))) {
										local362 = Static77.method1385(local383.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(448) Exception local448) {
						}
					}
					if (!local364 || local362 < 4000) {
						this.aBoolean455 = false;
					}
					if (!local366 && !local364) {
						if (local362 >= 7000 && local362 <= 9250) {
							this.aBoolean454 = false;
						}
						if (local362 >= 7000 && local362 <= 7999) {
							this.aBoolean469 = false;
						}
					}
					this.aBoolean467 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean465 = true;
					this.aBoolean476 = this.aBoolean469;
				}
				if (this.aString74.indexOf("intel") != -1) {
					this.aBoolean463 = false;
				}
				this.aBoolean460 = !this.aString74.equals("s3 graphics");
				if (this.aBoolean469) {
					try {
						@Pc(536) int[] local536 = new int[1];
						OpenGL.glGenBuffersARB(1, local536, 0);
					} catch (@Pc(542) Throwable local542) {
						throw new RuntimeException("");
					}
				}
				Static28.method489(false, true);
				this.aBoolean446 = true;
				this.aClass262_1 = new Class262(this, super.anInterface3_12);
				this.method5643();
				this.aClass168_1 = new Class168(this);
				this.aClass293_1 = new Class293(this);
				if (this.aClass293_1.method7621()) {
					this.aClass2_Sub31_Sub1_1 = new Class2_Sub31_Sub1(this);
					if (!this.aClass2_Sub31_Sub1_1.method9292()) {
						this.aClass2_Sub31_Sub1_1.method9288();
						this.aClass2_Sub31_Sub1_1 = null;
					}
				}
				this.aClass323_1 = new Class323(this);
				this.method5640();
				this.method5688();
				this.method8147();
			} catch (@Pc(616) Throwable local616) {
				local616.printStackTrace();
				this.method8124();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!lea", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt6345 || arg0 - arg2 > this.anInt6333 || arg2 + arg1 < this.anInt6358 || arg1 - arg2 > this.anInt6356) {
			return;
		}
		this.method5630();
		this.method5614(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(71) float local71 = (float) arg0 + 0.35F;
		@Pc(76) float local76 = (float) arg1 + 0.35F;
		@Pc(80) int local80 = arg2 << 1;
		if ((float) local80 < this.aFloat130) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local71 + 1.0F, local76 + 1.0F);
			OpenGL.glVertex2f(local71 + 1.0F, -1.0F + local76);
			OpenGL.glVertex2f(local71 - 1.0F, -1.0F + local76);
			OpenGL.glVertex2f(local71 - 1.0F, local76 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat142 >= (float) local80) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local80);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local71, local76);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local71, local76);
			@Pc(135) int local135 = 262144 / (arg2 * 6);
			if (local135 <= 64) {
				local135 = 64;
			} else if (local135 > 512) {
				local135 = 512;
			}
			local135 = Static427.method7013(local135);
			OpenGL.glVertex2f(local71 + (float) arg2, local76);
			for (@Pc(163) int local163 = 16384 - local135; local163 > 0; local163 -= local135) {
				OpenGL.glVertex2f(Class352.aFloatArray74[local163] * (float) arg2 + local71, (float) arg2 * Class352.aFloatArray73[local163] + local76);
			}
			OpenGL.glVertex2f(local71 + (float) arg2, local76);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!gka;)V")
	@Override
	public void method8065(@OriginalArg(0) Class127 arg0) {
		this.aClass247_1.method6592(arg0, this, -1);
	}

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "(I)V")
	private void method5611() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray35, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)V")
	private void method5612() {
		if (this.anInt6344 != 3) {
			this.anInt6344 = 3;
			this.method5647();
			this.method5636();
			this.anInt6323 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!uba;I)V")
	public void method5613(@OriginalArg(0) Interface22 arg0) {
		if (this.aBoolean472) {
			this.method5633(arg0);
			this.method5624(arg0);
		} else if (this.anInt6319 < 3) {
			if (this.anInt6319 >= 0) {
				this.anInterface22Array2[this.anInt6319].method1101();
			}
			this.anInterface22_2 = this.anInterface22_1 = this.anInterface22Array2[++this.anInt6319] = arg0;
			this.anInterface22_2.method1104();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(BI)V")
	public void method5614(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt6324) {
			return;
		}
		@Pc(34) boolean local34;
		@Pc(32) byte local32;
		if (arg0 == 1) {
			local34 = true;
			local32 = 1;
		} else if (arg0 == 2) {
			local32 = 2;
			local34 = false;
		} else if (arg0 == 128) {
			local32 = 3;
			local34 = true;
		} else {
			local32 = 0;
			local34 = false;
		}
		if (!this.aBoolean447) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean447 = true;
		}
		if (local34 != this.aBoolean448) {
			if (local34) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean448 = local34;
		}
		if (this.bf != local32) {
			if (local32 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local32 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local32 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.bf = local32;
		}
		this.anInt6324 = arg0;
		this.anInt6323 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!lea", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt6211 - arg1 - local12, arg2, 1, 32993, this.anInt6346, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!lea", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6343 = arg3;
		this.anInt6351 = arg2;
		this.anInt6335 = arg1;
		this.anInt6325 = arg0;
		this.aBoolean459 = true;
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(B)V")
	public void method5616() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!lea", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean459 = false;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!iq;I)V")
	public void method5617(@OriginalArg(0) Class76_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method4554(), 0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!gka;I)V")
	@Override
	public void method8115(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1) {
		this.aClass247_1.method6592(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!lea", name = "A", descriptor = "()V")
	@Override
	public void method8147() {
		if (!this.aBoolean460 || this.anInt6186 <= 0 || this.anInt6211 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt6345;
		@Pc(22) int local22 = this.anInt6333;
		@Pc(25) int local25 = this.anInt6358;
		@Pc(28) int local28 = this.anInt6356;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5646();
		this.method5632(false);
		this.method5691(false);
		this.method5693(false);
		this.method5683(false);
		this.method5690((Class50) null);
		this.method5670(-2);
		this.method5681(1);
		this.method5614(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt6186, this.anInt6211, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "(I)V")
	private void method5618() {
		this.aFloatArray35[10] = this.aFloat129;
		this.aFloatArray35[14] = this.aFloat140;
		this.aFloat136 = (float) this.anInt6327;
		this.aFloat123 = (this.aFloatArray35[14] - (float) this.anInt6327) / this.aFloatArray35[10];
	}

	@OriginalMember(owner = "client!lea", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt6321 + this.anInt6322 + this.anInt6320;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZ)V")
	public void method5619(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean471) {
			this.aBoolean471 = arg0;
			this.method5674();
		}
	}

	@OriginalMember(owner = "client!lea", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt6360;
		this.anInt6360 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!lea", name = "y", descriptor = "()Z")
	@Override
	public boolean method8136() {
		return this.aClass2_Sub31_Sub1_1 != null && (this.anInt6313 <= 1 || this.aBoolean468);
	}

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "(Z)V")
	public void method5620() {
		if (this.anInt6323 == 8) {
			return;
		}
		this.method5631();
		this.method5632(true);
		this.method5693(true);
		this.method5683(true);
		this.method5614(1);
		this.anInt6323 = 8;
	}

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "()Lclient!dm;")
	@Override
	public Class76 method8085() {
		return this.aClass76_Sub1_1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!dm;)V")
	@Override
	public void method8067(@OriginalArg(0) Class76 arg0) {
		this.aClass76_Sub1_3.method9629(arg0);
		this.aClass76_Sub1_4.method9629(this.aClass76_Sub1_3);
		this.aClass76_Sub1_4.method4547();
		this.aClass76_Sub1_5.method4552(this.aClass76_Sub1_4);
		if (this.anInt6344 != 1) {
			this.method5636();
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "()Z")
	@Override
	public boolean method8070() {
		if (this.aClass2_Sub31_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub31_Sub1_1.method9285()) {
			if (!this.aClass293_1.method7625(this.aClass2_Sub31_Sub1_1)) {
				return false;
			}
			this.aClass262_1.method7038();
		}
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "(II)I")
	public int method5621(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!lea", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(41) float local41;
		if (this.aClass50_Sub4_Sub1_2 == null || arg2 > this.aClass50_Sub4_Sub1_2.anInt10687 || this.aClass50_Sub4_Sub1_2.anInt10688 < arg3) {
			this.aClass50_Sub4_Sub1_2 = Static266.method4569(this, arg2, arg3, arg6);
			this.aClass50_Sub4_Sub1_2.method9152(false, false);
			local41 = this.aClass50_Sub4_Sub1_2.aFloat189;
			local45 = this.aClass50_Sub4_Sub1_2.aFloat190;
		} else {
			this.aClass50_Sub4_Sub1_2.method9150(arg3, 6406, false, arg6, arg2);
			local41 = this.aClass50_Sub4_Sub1_2.aFloat189 * (float) arg2 / (float) this.aClass50_Sub4_Sub1_2.anInt10687;
			local45 = this.aClass50_Sub4_Sub1_2.aFloat190 * (float) arg3 / (float) this.aClass50_Sub4_Sub1_2.anInt10688;
		}
		this.method5626();
		this.method5690(this.aClass50_Sub4_Sub1_2);
		this.method5614(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5649(arg5);
		this.method5665(34165, 34165);
		this.method5657(768, 0, 34166);
		this.method5657(770, 2, 5890);
		this.method5680(0, 34166);
		this.method5680(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
		@Pc(160) float local160 = local150 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local147, local160);
		OpenGL.glTexCoord2f(local45, local41);
		OpenGL.glVertex2f(local155, local160);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method5657(768, 0, 5890);
		this.method5657(770, 2, 34166);
		this.method5680(0, 5890);
		this.method5680(2, 34166);
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "()V")
	@Override
	public void method8072() {
		if (this.aBoolean463) {
			if (this.aClass39_1 != this.anInterface22_1) {
				throw new RuntimeException();
			}
			this.aClass39_1.method1114(0);
			this.aClass39_1.method1114(8);
			this.method5678(this.aClass39_1);
		} else if (this.aBoolean475) {
			this.aClass71_Sub3_1.method7706(0, 0, this.anInt6186, this.anInt6211, 0, 0);
			this.anOpenGL2.setSurface(this.aLong170);
		} else {
			throw new RuntimeException("");
		}
		this.aClass71_Sub3_1 = null;
		this.anInt6186 = this.anInt6182;
		this.anInt6211 = this.anInt6222;
		this.method5646();
		this.method5687();
		this.la();
	}

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "(II)V")
	public synchronized void method5622(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub14 local8 = new Class2_Sub14(arg0);
		this.aClass271_35.method7174(local8);
	}

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "()Lclient!ev;")
	@Override
	public Class99 method8090() {
		@Pc(7) int local7 = -1;
		if (this.aString74.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString74.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString74.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class99(local7, "OpenGL", this.anInt6355, this.aString73, 0L);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([I)V")
	@Override
	public void method8106(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6211;
		arg0[0] = this.anInt6186;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(II)V")
	@Override
	public void method8081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!uba;Z)V")
	public void method5623(@OriginalArg(0) Interface22 arg0) {
		if (this.anInt6318 < 0 || this.anInterface22Array3[this.anInt6318] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface22Array3[this.anInt6318--] = null;
		arg0.method1102();
		if (this.anInt6318 >= 0) {
			this.anInterface22_2 = this.anInterface22Array3[this.anInt6318];
			this.anInterface22_2.method1103();
		} else {
			this.anInterface22_2 = null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(Lclient!uba;I)V")
	public void method5624(@OriginalArg(0) Interface22 arg0) {
		if (this.anInt6317 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6317 >= 0) {
			this.anInterface22Array1[this.anInt6317].method1105();
		}
		this.anInterface22_1 = this.anInterface22Array1[++this.anInt6317] = arg0;
		this.anInterface22_1.method1100();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(FZ)V")
	public void method5625(@OriginalArg(0) float arg0) {
		if (this.aFloat124 != arg0) {
			this.aFloat124 = arg0;
			if (this.anInt6344 == 3) {
				this.method5647();
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6336 = arg3;
		this.anInt6347 = arg2;
		this.anInt6326 = arg1;
		this.anInt6340 = arg0;
		this.method5662();
		this.method5673();
		if (this.anInt6344 == 3) {
			this.method5647();
		} else if (this.anInt6344 == 2) {
			this.method5611();
		}
	}

	@OriginalMember(owner = "client!lea", name = "w", descriptor = "()Z")
	@Override
	public boolean method8134() {
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg5;
		@Pc(9) Class50_Sub4_Sub1 local9 = local6.aClass50_Sub4_Sub1_1;
		this.method5626();
		this.method5690(local6.aClass50_Sub4_Sub1_1);
		this.method5614(1);
		this.method5665(7681, 8448);
		this.method5657(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat189 / (float) local9.anInt10693;
		@Pc(46) float local46 = local9.aFloat190 / (float) local9.anInt10695;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(59) float local59 = (float) arg3 - (float) arg1;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local59 * local59)));
		@Pc(76) float local76 = local59 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(95) float local95 = local53 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f(local95 + (float) arg2 + 0.35F, local76 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method5657(768, 0, 5890);
	}

	@OriginalMember(owner = "client!lea", name = "l", descriptor = "(I)V")
	public void method5626() {
		if (this.anInt6323 == 2) {
			return;
		}
		this.method5653();
		this.method5632(false);
		this.method5691(false);
		this.method5693(false);
		this.method5683(false);
		this.method5670(-2);
		this.anInt6323 = 2;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIF)Lclient!mfa;")
	@Override
	public Class2_Sub13 method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub13_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lea", name = "i", descriptor = "(II)V")
	public void method5627(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt6331) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt6331 = arg0;
		}
	}

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8118(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class2_Sub14 local19;
		while (!this.aClass271_33.method7169()) {
			local19 = (Class2_Sub14) this.aClass271_33.method7172();
			Static528.anIntArray474[local7++] = (int) local19.aLong313;
			this.anInt6322 -= local19.anInt1303;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static528.anIntArray474, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static528.anIntArray474, 0);
			local7 = 0;
		}
		while (!this.aClass271_34.method7169()) {
			local19 = (Class2_Sub14) this.aClass271_34.method7172();
			Static528.anIntArray474[local7++] = (int) local19.aLong313;
			this.anInt6320 -= local19.anInt1303;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static528.anIntArray474, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static528.anIntArray474, 0);
			local7 = 0;
		}
		while (!this.aClass271_35.method7169()) {
			local19 = (Class2_Sub14) this.aClass271_35.method7172();
			Static528.anIntArray474[local7++] = local19.anInt1303;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static528.anIntArray474, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static528.anIntArray474, 0);
			local7 = 0;
		}
		while (!this.aClass271_36.method7169()) {
			local19 = (Class2_Sub14) this.aClass271_36.method7172();
			Static528.anIntArray474[local7++] = (int) local19.aLong313;
			this.anInt6321 -= local19.anInt1303;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static528.anIntArray474, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static528.anIntArray474, 0);
		}
		while (!this.aClass271_32.method7169()) {
			local19 = (Class2_Sub14) this.aClass271_32.method7172();
			OpenGL.glDeleteLists((int) local19.aLong313, local19.anInt1303);
		}
		@Pc(216) Class2 local216;
		while (!this.aClass271_37.method7169()) {
			local216 = this.aClass271_37.method7172();
			OpenGL.glDeleteProgramARB((int) local216.aLong313);
		}
		while (!this.aClass271_38.method7169()) {
			local216 = this.aClass271_38.method7172();
			OpenGL.glDeleteObjectARB(local216.aLong313);
		}
		while (!this.aClass271_32.method7169()) {
			local19 = (Class2_Sub14) this.aClass271_32.method7172();
			OpenGL.glDeleteLists((int) local19.aLong313, local19.anInt1303);
		}
		this.aClass262_1.method7041();
		if (this.E() > 100663296 && Static99.method1701() > this.aLong171 + 60000L) {
			System.gc();
			this.aLong171 = Static99.method1701();
		}
		this.anInt6314 = local11;
	}

	@OriginalMember(owner = "client!lea", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5630();
		this.method5614(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lea", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Class50_Sub4_Sub1 local9 = local6.aClass50_Sub4_Sub1_1;
		this.method5626();
		this.method5690(local6.aClass50_Sub4_Sub1_1);
		this.method5614(1);
		this.method5665(7681, 8448);
		this.method5657(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat189 / (float) local9.anInt10693;
		@Pc(46) float local46 = local9.aFloat190 / (float) local9.anInt10695;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt6345 - arg2) * local39, (float) (this.anInt6358 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6345, this.anInt6358);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6345 - arg2), (float) (this.anInt6356 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6345, this.anInt6356);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6333 - arg2), (float) (this.anInt6356 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6333, this.anInt6356);
		OpenGL.glTexCoord2f((float) (this.anInt6333 - arg2) * local39, local46 * (float) (this.anInt6358 - arg3));
		OpenGL.glVertex2i(this.anInt6333, this.anInt6358);
		OpenGL.glEnd();
		this.method5657(768, 0, 5890);
	}

	@OriginalMember(owner = "client!lea", name = "q", descriptor = "()Z")
	@Override
	public boolean method8117() {
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static421.aFloat163 = arg0;
		Static275.aFloat107 = arg2;
		Static620.aFloat200 = arg1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!tj;I)V")
	public void method5629(@OriginalArg(0) Interface20 arg0) {
		if (arg0 != this.anInterface20_2) {
			if (this.aBoolean469) {
				OpenGL.glBindBufferARB(34963, arg0.method6706());
			}
			this.anInterface20_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!lea", name = "m", descriptor = "(I)V")
	private void method5630() {
		if (this.anInt6323 == 1) {
			return;
		}
		this.method5653();
		this.method5632(false);
		this.method5691(false);
		this.method5693(false);
		this.method5683(false);
		this.method5690((Class50) null);
		this.method5670(-2);
		this.method5681(1);
		this.anInt6323 = 1;
	}

	@OriginalMember(owner = "client!lea", name = "n", descriptor = "(I)V")
	private void method5631() {
		if (this.anInt6344 != 2) {
			this.anInt6344 = 2;
			this.method5611();
			this.method5636();
			this.anInt6323 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(BZ)V")
	public void method5632(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean456) {
			this.aBoolean456 = arg0;
			this.method5635();
			this.anInt6323 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(Lclient!uba;Z)V")
	public void method5633(@OriginalArg(0) Interface22 arg0) {
		if (this.anInt6318 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6318 >= 0) {
			this.anInterface22Array3[this.anInt6318].method1102();
		}
		this.anInterface22_2 = this.anInterface22Array3[++this.anInt6318] = arg0;
		this.anInterface22_2.method1103();
	}

	@OriginalMember(owner = "client!lea", name = "j", descriptor = "()Z")
	@Override
	public boolean method8102() {
		return this.aClass323_1.method8175();
	}

	@OriginalMember(owner = "client!lea", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt6338;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(JB)V")
	public synchronized void method5634(@OriginalArg(0) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong313 = arg0;
		this.aClass271_38.method7174(local7);
	}

	@OriginalMember(owner = "client!lea", name = "o", descriptor = "(I)V")
	private void method5635() {
		if (this.aBoolean456 && this.anInt6350 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!lea", name = "p", descriptor = "(I)V")
	private void method5636() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass76_Sub1_4.method4554(), 0);
		if (this.aBoolean473) {
			this.aClass323_1.aClass31_Sub5_1.method7128();
		}
		this.method5689();
		this.method5658();
	}

	@OriginalMember(owner = "client!lea", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5630();
		this.method5614(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIZ)Lclient!mq;")
	@Override
	public Class71 method8077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class71_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "(B)Lclient!oh;")
	public Class50_Sub3 method5637() {
		return this.aClass3_Sub1_1 == null ? null : this.aClass3_Sub1_1.method8765();
	}

	@OriginalMember(owner = "client!lea", name = "q", descriptor = "(I)V")
	private void method5638() {
		Static324.aFloatArray33[1] = this.aFloat122 * this.aFloat127;
		Static324.aFloatArray33[0] = this.aFloat122 * this.aFloat141;
		Static324.aFloatArray33[3] = 1.0F;
		Static324.aFloatArray33[2] = this.aFloat125 * this.aFloat122;
		OpenGL.glLightfv(16384, 4609, Static324.aFloatArray33, 0);
		Static324.aFloatArray33[3] = 1.0F;
		Static324.aFloatArray33[2] = -this.aFloat137 * this.aFloat125;
		Static324.aFloatArray33[0] = this.aFloat141 * -this.aFloat137;
		Static324.aFloatArray33[1] = this.aFloat127 * -this.aFloat137;
		OpenGL.glLightfv(16385, 4609, Static324.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([BZBII)Lclient!tj;")
	public Interface20 method5639(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) int arg2) {
		return (Interface20) (this.aBoolean469 && (!arg1 || this.aBoolean476) ? new Class199_Sub2(this, 5123, arg0, arg2, arg1) : new Class55_Sub2(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "(I)V")
	private void method5640() {
		this.method5670(-2);
		for (@Pc(14) int local14 = this.anInt6339 - 1; local14 >= 0; local14--) {
			this.method5627(local14);
			this.method5690((Class50) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5665(8448, 8448);
		this.method5657(770, 2, 34168);
		this.method5669();
		this.anInt6324 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.bf = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean448 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean447 = true;
		this.method5632(true);
		this.method5691(true);
		this.method5693(true);
		this.method5683(true);
		this.method5646();
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
		this.anInt6329 = this.anInt6352 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method8091(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([IIIIIZ)Lclient!mq;")
	@Override
	public Class71 method8105(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class71_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!lea", name = "j", descriptor = "(II)I")
	public int method5641(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!lea", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean459) {
			throw new RuntimeException("");
		}
		this.anInt6325 = arg0;
		this.anInt6343 = arg3;
		this.anInt6351 = arg2;
		this.anInt6335 = arg1;
		if (this.aBoolean473) {
			this.aClass323_1.aClass31_Sub5_1.method7128();
			this.aClass323_1.aClass31_Sub5_1.method7127();
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([BIIBZ)Lclient!cq;")
	public Interface2 method5642(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		return (Interface2) (this.aBoolean469 && (!arg3 || this.aBoolean476) ? new Class199_Sub1(this, arg1, arg0, arg2, arg3) : new Class55_Sub1(this, arg1, arg0, arg2));
	}

	@OriginalMember(owner = "client!lea", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt6359;
		this.anInt6359 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!lea", name = "n", descriptor = "()Lclient!dm;")
	@Override
	public Class76 method8112() {
		return this.aClass76_Sub1_3;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8138() {
		this.method5630();
		this.method5614(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lea", name = "s", descriptor = "(I)V")
	private void method5643() {
		this.aClass50Array1 = new Class50[this.anInt6339];
		this.aClass50_Sub4_1 = new Class50_Sub4(this, 3553, 6408, 1, 1);
		new Class50_Sub4(this, 3553, 6408, 1, 1);
		new Class50_Sub4(this, 3553, 6408, 1, 1);
		this.aClass14_Sub2_7 = new Class14_Sub2(this);
		this.aClass14_Sub2_3 = new Class14_Sub2(this);
		this.aClass14_Sub2_10 = new Class14_Sub2(this);
		this.aClass14_Sub2_6 = new Class14_Sub2(this);
		this.aClass14_Sub2_5 = new Class14_Sub2(this);
		this.aClass14_Sub2_2 = new Class14_Sub2(this);
		this.aClass14_Sub2_8 = new Class14_Sub2(this);
		this.aClass14_Sub2_9 = new Class14_Sub2(this);
		this.aClass14_Sub2_4 = new Class14_Sub2(this);
		this.aClass14_Sub2_1 = new Class14_Sub2(this);
		if (this.aBoolean463) {
			this.aClass39_2 = new Class39(this);
			new Class39(this);
		}
	}

	@OriginalMember(owner = "client!lea", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt6340, this.anInt6326, this.anInt6347, this.anInt6336 };
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIILclient!tj;I)V")
	public void method5645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface20 arg2) {
		@Pc(7) int local7 = arg2.method6708();
		@Pc(14) int local14 = arg1 * this.method5641(local7);
		this.method5629(arg2);
		OpenGL.glDrawElements(4, arg0, local7, arg2.method6707() + (long) local14);
	}

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt6338 && this.anInt6327 == arg1) {
			return;
		}
		this.anInt6327 = arg1;
		this.anInt6338 = arg0;
		this.method5662();
		this.method5675();
		if (this.anInt6344 == 3) {
			this.method5647();
		} else if (this.anInt6344 == 2) {
			this.method5611();
			return;
		}
	}

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "(B)V")
	public void method5646() {
		if (this.anInt6344 != 0) {
			this.anInt6344 = 0;
			this.anInt6323 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "(Z)V")
	private void method5647() {
		@Pc(19) float local19 = this.aFloat124 * (float) -this.anInt6340 / (float) this.anInt6347;
		@Pc(31) float local31 = (float) -this.anInt6326 * this.aFloat124 / (float) this.anInt6336;
		@Pc(46) float local46 = this.aFloat124 * (float) (this.anInt6186 - this.anInt6340) / (float) this.anInt6347;
		@Pc(60) float local60 = this.aFloat124 * (float) (this.anInt6211 - this.anInt6326) / (float) this.anInt6336;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local19 != local46 && local60 != local31) {
			OpenGL.glOrtho((double) local19, (double) local46, (double) -local60, (double) -local31, (double) this.anInt6338, (double) this.anInt6327);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!vr;Lclient!vr;FLclient!vr;)Lclient!vr;")
	@Override
	public Class3 method8071(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean453 && this.aBoolean463) {
			@Pc(15) Class3_Sub1_Sub2 local15 = null;
			@Pc(18) Class3_Sub1 local18 = (Class3_Sub1) arg0;
			@Pc(21) Class3_Sub1 local21 = (Class3_Sub1) arg1;
			@Pc(25) Class50_Sub3 local25 = local18.method8765();
			@Pc(29) Class50_Sub3 local29 = local21.method8765();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local29.anInt7870 < local25.anInt7870 ? local25.anInt7870 : local29.anInt7870;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class3_Sub1_Sub2) {
					@Pc(60) Class3_Sub1_Sub2 local60 = (Class3_Sub1_Sub2) arg3;
					if (local48 == local60.method8770()) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class3_Sub1_Sub2(this, local48);
				}
				if (local15.method8767(local25, local29, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!vr;)V")
	@Override
	public void method8068(@OriginalArg(0) Class3 arg0) {
		this.aClass3_Sub1_1 = (Class3_Sub1) arg0;
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(IIII)V")
	public void method5648(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "(II)V")
	public void method5649(@OriginalArg(0) int arg0) {
		Static324.aFloatArray33[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static324.aFloatArray33[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static324.aFloatArray33[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static324.aFloatArray33[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static324.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIZ)Lclient!mq;")
	@Override
	public Class71 method8079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class71_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!pc;Lclient!pc;Lclient!pc;Lclient!pc;B)V")
	public void method5650(@OriginalArg(0) Class274 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class274 arg2, @OriginalArg(3) Class274 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5685(arg1.anInterface2_6);
			OpenGL.glVertexPointer(arg1.aByte109, arg1.aShort76, this.anInterface2_4.method6369(), this.anInterface2_4.method6368() + (long) arg1.aByte108);
			OpenGL.glEnableClientState(32884);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5685(arg0.anInterface2_6);
			OpenGL.glNormalPointer(arg0.aShort76, this.anInterface2_4.method6369(), this.anInterface2_4.method6368() + (long) arg0.aByte108);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5685(arg2.anInterface2_6);
			OpenGL.glColorPointer(arg2.aByte109, arg2.aShort76, this.anInterface2_4.method6369(), this.anInterface2_4.method6368() + (long) arg2.aByte108);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5685(arg3.anInterface2_6);
			OpenGL.glTexCoordPointer(arg3.aByte109, arg3.aShort76, this.anInterface2_4.method6369(), this.anInterface2_4.method6368() + (long) arg3.aByte108);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!lea", name = "t", descriptor = "()V")
	@Override
	public void method8125() {
		if (this.aClass2_Sub31_Sub1_1 != null && this.aClass2_Sub31_Sub1_1.method9285()) {
			this.aClass293_1.method7624(this.aClass2_Sub31_Sub1_1);
			this.aClass262_1.method7038();
		}
	}

	@OriginalMember(owner = "client!lea", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method5614(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!lea", name = "m", descriptor = "()Z")
	@Override
	public boolean method8110() {
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIB)V")
	public void method5651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6330 = arg0;
		this.anInt6357 = arg1;
		this.method5687();
		this.method5660();
	}

	@OriginalMember(owner = "client!lea", name = "t", descriptor = "(I)V")
	public void method5652() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!lea", name = "p", descriptor = "()V")
	@Override
	public void method8116() {
		this.aClass293_1.method7618();
	}

	@OriginalMember(owner = "client!lea", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6352 == arg0 && arg1 == this.anInt6350 && arg2 == this.anInt6328) {
			return;
		}
		this.anInt6328 = arg2;
		this.anInt6350 = arg1;
		this.anInt6352 = arg0;
		this.method5675();
		this.method5635();
	}

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "(I)V")
	@Override
	public void method8122(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt6307 = arg0;
		this.aClass262_1.method7038();
	}

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "(I)V")
	@Override
	public void method8098() {
	}

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "(B)V")
	private void method5653() {
		if (this.anInt6344 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt6186 > 0 && this.anInt6211 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt6186, (double) this.anInt6211, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt6344 = 1;
		this.anInt6323 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I[Lclient!mfa;)V")
	@Override
	public void method8094(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub13Array4[local7] = arg1[local7];
		}
		this.anInt6342 = arg0;
		if (this.anInt6344 != 1) {
			this.method5658();
		}
	}

	@OriginalMember(owner = "client!lea", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method5630();
		this.method5614(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean462) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean462) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static5.method95(arg3, arg1, arg2, this, arg0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IB)I")
	public int method5654(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "()Z")
	@Override
	public boolean method8101() {
		return this.aClass2_Sub31_Sub1_1 != null && this.aClass2_Sub31_Sub1_1.method9285();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8074(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable4.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IBI)V")
	public synchronized void method5655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub14 local8 = new Class2_Sub14(arg0);
		local8.aLong313 = (long) arg1;
		this.aClass271_34.method7174(local8);
	}

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "()Z")
	@Override
	public boolean method8123() {
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "u", descriptor = "(I)V")
	private void method5656() {
		Static324.aFloatArray33[1] = this.aFloat127 * this.aFloat133;
		Static324.aFloatArray33[0] = this.aFloat141 * this.aFloat133;
		Static324.aFloatArray33[2] = this.aFloat125 * this.aFloat133;
		Static324.aFloatArray33[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static324.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIB)V")
	public void method5657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg0);
	}

	@OriginalMember(owner = "client!lea", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6356 > arg3) {
			this.anInt6356 = arg3;
		}
		if (arg0 > this.anInt6345) {
			this.anInt6345 = arg0;
		}
		if (this.anInt6333 > arg2) {
			this.anInt6333 = arg2;
		}
		if (arg1 > this.anInt6358) {
			this.anInt6358 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method5673();
		this.method5660();
	}

	@OriginalMember(owner = "client!lea", name = "v", descriptor = "(I)V")
	private void method5658() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt6342; local7++) {
			@Pc(14) Class2_Sub13 local14 = this.aClass2_Sub13Array4[local7];
			Static380.aFloatArray49[0] = (float) local14.method9411();
			@Pc(26) int local26 = local7 + 16386;
			Static380.aFloatArray49[1] = (float) local14.method9410();
			Static380.aFloatArray49[2] = (float) local14.method9406();
			Static380.aFloatArray49[3] = 1.0F;
			OpenGL.glLightfv(local26, 4611, Static380.aFloatArray49, 0);
			@Pc(53) int local53 = local14.method9405();
			@Pc(59) float local59 = local14.method9404() / 255.0F;
			Static380.aFloatArray49[1] = local59 * (float) (local53 >> 8 & 0xFF);
			Static380.aFloatArray49[2] = local59 * (float) (local53 & 0xFF);
			Static380.aFloatArray49[0] = local59 * (float) (local53 >> 16 & 0xFF);
			OpenGL.glLightfv(local26, 4609, Static380.aFloatArray49, 0);
			OpenGL.glLightf(local26, 4617, 1.0F / (float) (local14.method9407() * local14.method9407()));
			OpenGL.glEnable(local26);
		}
		while (this.anInt6349 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt6349 = this.anInt6342;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(BLclient!uba;)V")
	public void method5659(@OriginalArg(1) Interface22 arg0) {
		if (this.anInt6317 < 0 || arg0 != this.anInterface22Array1[this.anInt6317]) {
			throw new RuntimeException();
		}
		this.anInterface22Array1[this.anInt6317--] = null;
		arg0.method1105();
		if (this.anInt6317 < 0) {
			this.anInterface22_1 = null;
		} else {
			this.anInterface22_1 = this.anInterface22Array1[this.anInt6317];
			this.anInterface22_1.method1100();
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(II)I")
	@Override
	public int method8083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!lea", name = "w", descriptor = "(I)V")
	private void method5660() {
		if (this.anInt6333 >= this.anInt6345 && this.anInt6358 <= this.anInt6356) {
			OpenGL.glScissor(this.anInt6345 + this.anInt6357, -this.anInt6356 + this.anInt6211 + this.anInt6330, this.anInt6333 - this.anInt6345, -this.anInt6358 + this.anInt6356);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(FFI)V")
	public void method5661(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat131 = arg0;
		this.aFloat132 = arg1;
		this.method5675();
	}

	@OriginalMember(owner = "client!lea", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt6329 != arg0;
		if (local11 || this.aFloat122 != arg1 || this.aFloat137 != arg2) {
			this.aFloat137 = arg2;
			this.anInt6329 = arg0;
			this.aFloat122 = arg1;
			if (local11) {
				this.aFloat125 = (float) (this.anInt6329 & 0xFF) / 255.0F;
				this.aFloat127 = (float) (this.anInt6329 & 0xFF00) / 65280.0F;
				this.aFloat141 = (float) (this.anInt6329 & 0xFF0000) / 1.671168E7F;
				this.method5656();
			}
			this.method5638();
		}
		if (this.aFloatArray34[0] == arg3 && arg4 == this.aFloatArray34[1] && this.aFloatArray34[2] == arg5) {
			return;
		}
		this.aFloatArray34[2] = arg5;
		this.aFloatArray34[1] = arg4;
		this.aFloatArray34[0] = arg3;
		this.aFloatArray36[2] = -arg5;
		this.aFloatArray36[1] = -arg4;
		this.aFloatArray36[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray38[0] = local138 * arg3;
		this.aFloatArray38[1] = local138 * arg4;
		this.aFloatArray38[2] = local138 * arg5;
		this.aFloatArray37[0] = -this.aFloatArray38[0];
		this.aFloatArray37[1] = -this.aFloatArray38[1];
		this.aFloatArray37[2] = -this.aFloatArray38[2];
		this.method5689();
		this.anInt6337 = (int) (arg5 * 256.0F / arg4);
		this.anInt6341 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
	@Override
	public void method8062(@OriginalArg(0) int arg0) {
		this.method5663();
	}

	@OriginalMember(owner = "client!lea", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt6315 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt6315++;
		}
		this.anInt6316 = 0x1 << this.anInt6315;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5630();
		this.method5614(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		if (local16 == 0.0F && local23 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(44) float local44 = (float) (1.0D / Math.sqrt((double) (local23 * local23 + local16 * local16)));
			local23 *= local44;
			local16 *= local44;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, local23 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lea", name = "x", descriptor = "(I)V")
	private void method5662() {
		@Pc(12) float[] local12 = this.aFloatArray35;
		@Pc(24) float local24 = (float) (this.anInt6338 * -this.anInt6340) / (float) this.anInt6347;
		@Pc(39) float local39 = (float) (this.anInt6338 * (this.anInt6186 - this.anInt6340)) / (float) this.anInt6347;
		@Pc(50) float local50 = (float) (this.anInt6338 * this.anInt6326) / (float) this.anInt6336;
		@Pc(64) float local64 = (float) ((this.anInt6326 - this.anInt6211) * this.anInt6338) / (float) this.anInt6336;
		if (local24 == local39 || local64 == local50) {
			local12[2] = 0.0F;
			local12[7] = 0.0F;
			local12[11] = 0.0F;
			local12[3] = 0.0F;
			local12[15] = 1.0F;
			local12[9] = 0.0F;
			local12[12] = 0.0F;
			local12[14] = 0.0F;
			local12[8] = 0.0F;
			local12[1] = 0.0F;
			local12[5] = 1.0F;
			local12[13] = 0.0F;
			local12[4] = 0.0F;
			local12[10] = 1.0F;
			local12[6] = 0.0F;
			local12[0] = 1.0F;
		} else {
			@Pc(78) float local78 = (float) this.anInt6338 * 2.0F;
			local12[7] = 0.0F;
			local12[0] = local78 / (local39 - local24);
			local12[10] = this.aFloat129 = (float) -(this.anInt6327 + this.anInt6338) / (float) (this.anInt6327 - this.anInt6338);
			local12[2] = 0.0F;
			local12[6] = 0.0F;
			local12[15] = 0.0F;
			local12[1] = 0.0F;
			local12[5] = local78 / (local50 - local64);
			local12[3] = 0.0F;
			local12[14] = this.aFloat140 = -((float) this.anInt6327 * local78) / (float) (this.anInt6327 - this.anInt6338);
			local12[13] = 0.0F;
			local12[11] = -1.0F;
			local12[8] = (local24 + local39) / (-local24 + local39);
			local12[12] = 0.0F;
			local12[9] = (local50 + local64) / (local50 - local64);
			local12[4] = 0.0F;
		}
		this.method5618();
	}

	@OriginalMember(owner = "client!lea", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lea", name = "y", descriptor = "(I)V")
	private void method5663() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL2.b()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static650.method9565(1000L);
		}
	}

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "(IIIIII)Lclient!vr;")
	@Override
	public Class3 method8130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean453 ? new Class3_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!lea", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt6186 < arg2) {
			arg2 = this.anInt6186;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt6211 < arg3) {
			arg3 = this.anInt6211;
		}
		this.anInt6333 = arg2;
		this.anInt6345 = arg0;
		this.anInt6356 = arg3;
		this.anInt6358 = arg1;
		OpenGL.glEnable(3089);
		this.method5673();
		this.method5660();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!rt;[Lclient!de;Z)Lclient!da;")
	@Override
	public Class59 method8146(@OriginalArg(0) Class324 arg0, @OriginalArg(1) Class67[] arg1) {
		return new Class59_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!lea", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt6333 = this.anInt6186;
		this.anInt6358 = 0;
		this.anInt6356 = this.anInt6211;
		this.anInt6345 = 0;
		OpenGL.glDisable(3089);
		this.method5673();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILclient!iq;)V")
	public void method5664(@OriginalArg(1) Class76_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method4554(), 0);
	}

	@OriginalMember(owner = "client!lea", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass76_Sub1_3.aFloat93 + (float) arg2 * this.aClass76_Sub1_3.aFloat102 + this.aClass76_Sub1_3.aFloat95 * (float) arg1 + (float) arg0 * this.aClass76_Sub1_3.aFloat103;
		if (local28 < (float) this.anInt6338 || (float) this.anInt6327 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass76_Sub1_3.aFloat94 + (float) arg2 * this.aClass76_Sub1_3.aFloat99 + this.aClass76_Sub1_3.aFloat98 * (float) arg0 + this.aClass76_Sub1_3.aFloat96 * (float) arg1) * (float) this.anInt6347 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt6336 * ((float) arg1 * this.aClass76_Sub1_3.aFloat97 + (float) arg0 * this.aClass76_Sub1_3.aFloat101 + (float) arg2 * this.aClass76_Sub1_3.aFloat100 + this.aClass76_Sub1_3.aFloat104) / local28);
		if ((float) local85 >= this.aFloat135 && (float) local85 <= this.aFloat138 && (float) local117 >= this.aFloat134 && (float) local117 <= this.aFloat139) {
			arg3[1] = (int) ((float) local117 - this.aFloat134);
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat135);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "(II)Lclient!jk;")
	@Override
	public Interface8 method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!lf;Lclient!jk;)Lclient!rs;")
	@Override
	public Interface17 method8131(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface8 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(IIZ)V")
	public void method5665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6331 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (arg0 != this.anInt6332) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt6332 = arg0;
			local17 = true;
		}
		if (arg1 != this.anInt6348) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt6348 = arg1;
			local17 = true;
		}
		if (local17) {
			this.anInt6323 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!lea", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat133 != arg0) {
			this.aFloat133 = arg0;
			this.method5656();
		}
	}

	@OriginalMember(owner = "client!lea", name = "z", descriptor = "(I)V")
	public void method5666() {
		if (this.anInt6323 == 16) {
			return;
		}
		this.method5612();
		this.method5632(true);
		this.method5693(true);
		this.method5683(true);
		this.method5614(1);
		this.anInt6323 = 16;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(FFFBF)V")
	public void method5667(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static324.aFloatArray33[3] = arg2;
		Static324.aFloatArray33[0] = arg0;
		Static324.aFloatArray33[2] = arg3;
		Static324.aFloatArray33[1] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static324.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!lea", name = "x", descriptor = "()Z")
	@Override
	public boolean method8135() {
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(Z)V")
	@Override
	public void method8121(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(III)V")
	public synchronized void method5668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub14 local8 = new Class2_Sub14(arg1);
		local8.aLong313 = (long) arg0;
		this.aClass271_36.method7174(local8);
	}

	@OriginalMember(owner = "client!lea", name = "A", descriptor = "(I)V")
	private void method5669() {
		if (this.aBoolean474) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean474 = false;
		}
	}

	@OriginalMember(owner = "client!lea", name = "l", descriptor = "(II)V")
	public void method5670(@OriginalArg(1) int arg0) {
		this.method5692(true, arg0);
	}

	@OriginalMember(owner = "client!lea", name = "B", descriptor = "(I)I")
	private int method5671() {
		this.aString74 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString73 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString74.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString74.indexOf("brian paul") != -1 || this.aString74.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static184.method3569(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static77.method1385(local53[0]);
				@Pc(69) int local69 = Static77.method1385(local53[1]);
				this.anInt6355 = local69 + local63 * 10;
			} catch (@Pc(78) NumberFormatException local78) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt6355 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(119) int[] local119 = new int[1];
		OpenGL.glGetIntegerv(34018, local119, 0);
		this.anInt6339 = local119[0];
		OpenGL.glGetIntegerv(34929, local119, 0);
		this.anInt6354 = local119[0];
		OpenGL.glGetIntegerv(34930, local119, 0);
		this.anInt6353 = local119[0];
		if (this.anInt6339 < 2 || this.anInt6354 < 2 || this.anInt6353 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean470 = Stream.c();
		this.aBoolean475 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean469 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean462 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean477 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean451 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean452 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean454 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean467 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean453 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean455 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean457 = false;
		this.aBoolean463 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean472 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean458 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean468 = this.aBoolean458 & this.aBoolean472;
		this.aBoolean461 = Class346.aString114.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static324.aFloatArray33, 0);
		this.aFloat142 = Static324.aFloatArray33[1];
		this.aFloat130 = Static324.aFloatArray33[0];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!lea", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt6327;
	}

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "(Z)V")
	private void method5672() {
		OpenGL.glDepthMask(this.aBoolean449 && this.aBoolean466);
	}

	@OriginalMember(owner = "client!lea", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6345;
		arg0[1] = this.anInt6358;
		arg0[2] = this.anInt6333;
		arg0[3] = this.anInt6356;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8143(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8081(arg2, arg3);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class18 method8087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class18_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!rs;)V")
	@Override
	public void method8108(@OriginalArg(0) Interface17 arg0) {
	}

	@OriginalMember(owner = "client!lea", name = "u", descriptor = "()Z")
	@Override
	public boolean method8128() {
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		this.method5630();
		this.method5614(1);
		@Pc(29) float local29 = (float) arg2 - (float) arg0;
		@Pc(36) float local36 = (float) -arg1 + (float) arg3;
		@Pc(49) float local49 = (float) (1.0D / Math.sqrt((double) (local36 * local36 + local29 * local29)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(68) float local68 = local29 * local49;
		@Pc(72) float local72 = local36 * local49;
		@Pc(78) int local78 = arg7 % (arg5 + arg6);
		@Pc(83) float local83 = (float) arg5 * local68;
		@Pc(88) float local88 = local72 * (float) arg5;
		@Pc(90) float local90 = 0.0F;
		@Pc(92) float local92 = 0.0F;
		@Pc(94) float local94 = local83;
		@Pc(96) float local96 = local88;
		if (arg5 < local78) {
			local90 = local68 * (float) (arg5 + arg6 - local78);
			local92 = (float) (arg5 + arg6 - local78) * local72;
		} else {
			local96 = (float) (arg5 - local78) * local72;
			local94 = local68 * (float) (arg5 - local78);
		}
		@Pc(147) float local147 = (float) arg0 + local90 + 0.35F;
		@Pc(154) float local154 = local92 + (float) arg1 + 0.35F;
		@Pc(159) float local159 = local68 * (float) arg6;
		@Pc(164) float local164 = (float) arg6 * local72;
		while (true) {
			if (arg2 <= arg0) {
				if (local147 < (float) arg2 + 0.35F) {
					break;
				}
				if (local94 + local147 < (float) arg2) {
					local94 = (float) arg2 - local147;
				}
			} else {
				if (local147 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local94 + local147) {
					local94 = (float) arg2 - local147;
				}
			}
			if (arg3 > arg1) {
				if ((float) arg3 + 0.35F < local154) {
					break;
				}
				if ((float) arg3 < local96 + local154) {
					local96 = (float) arg3 - local154;
				}
			} else {
				if ((float) arg3 + 0.35F > local154) {
					break;
				}
				if (local96 + local154 < (float) arg3) {
					local96 = (float) arg3 - local154;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local147, local154);
			OpenGL.glVertex2f(local147 + local94, local154 + local96);
			local147 += local94 + local159;
			local154 += local96 + local164;
			OpenGL.glEnd();
			local94 = local83;
			local96 = local88;
		}
	}

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "(B)V")
	private void method5673() {
		this.aFloat138 = (float) (this.anInt6333 - this.anInt6340);
		this.aFloat139 = (float) (this.anInt6356 - this.anInt6326);
		this.aFloat135 = (float) (this.anInt6345 - this.anInt6340);
		this.aFloat134 = (float) (this.anInt6358 - this.anInt6326);
	}

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "(II)I")
	@Override
	public int method8095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!lea", name = "C", descriptor = "(I)V")
	private void method5674() {
		if (this.aBoolean464 && !this.aBoolean471) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!lea", name = "D", descriptor = "(I)V")
	private void method5675() {
		this.aFloat126 = (float) (this.anInt6327 - this.anInt6328) - this.aFloat131;
		this.aFloat128 = this.aFloat126 - this.aFloat132 * (float) this.anInt6350;
		if (this.aFloat128 < (float) this.anInt6338) {
			this.aFloat128 = (float) this.anInt6338;
		}
		OpenGL.glFogf(2915, this.aFloat128);
		OpenGL.glFogf(2916, this.aFloat126);
		Static324.aFloatArray33[1] = (float) (this.anInt6352 & 0xFF00) / 65280.0F;
		Static324.aFloatArray33[2] = (float) (this.anInt6352 & 0xFF) / 255.0F;
		Static324.aFloatArray33[0] = (float) (this.anInt6352 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static324.aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;IBIZ)Lclient!cq;")
	public Interface2 method5676(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return (Interface2) (this.aBoolean469 ? new Class199_Sub1(this, arg1, arg0, arg2, false) : new Class55_Sub1(this, arg1, arg0));
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8119(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas6) {
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

	@OriginalMember(owner = "client!lea", name = "l", descriptor = "()I")
	@Override
	public int method8109() {
		return 4;
	}

	@OriginalMember(owner = "client!lea", name = "z", descriptor = "()Lclient!dm;")
	@Override
	public Class76 method8141() {
		return new Class76_Sub1();
	}

	@OriginalMember(owner = "client!lea", name = "E", descriptor = "(I)V")
	public void method5677() {
		if (this.anInt6323 == 4) {
			return;
		}
		this.method5653();
		this.method5632(false);
		this.method5691(false);
		this.method5693(false);
		this.method5683(false);
		this.method5670(-2);
		this.method5614(1);
		this.anInt6323 = 4;
	}

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub5 method8100(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub5_Sub1 local8 = new Class2_Sub5_Sub1(arg0);
		this.aClass271_31.method7174(local8);
		return local8;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(BLclient!uba;)V")
	public void method5678(@OriginalArg(1) Interface22 arg0) {
		if (this.aBoolean472) {
			this.method5623(arg0);
			this.method5659(arg0);
		} else if (this.anInt6319 >= 0 && arg0 == this.anInterface22Array2[this.anInt6319]) {
			this.anInterface22Array2[this.anInt6319--] = null;
			arg0.method1101();
			if (this.anInt6319 < 0) {
				this.anInterface22_2 = this.anInterface22_1 = null;
			} else {
				this.anInterface22_2 = this.anInterface22_1 = this.anInterface22Array2[this.anInt6319];
				this.anInterface22_2.method1104();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(I)V")
	@Override
	public void method8088(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(IIB)V")
	public synchronized void method5679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub14 local8 = new Class2_Sub14(arg0);
		local8.aLong313 = (long) arg1;
		this.aClass271_33.method7174(local8);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(19) Class1_Sub1 local19 = (Class1_Sub1) arg5;
		@Pc(22) Class50_Sub4_Sub1 local22 = local19.aClass50_Sub4_Sub1_1;
		this.method5626();
		this.method5690(local19.aClass50_Sub4_Sub1_1);
		this.method5614(1);
		this.method5665(7681, 8448);
		this.method5657(768, 0, 34167);
		@Pc(52) float local52 = local22.aFloat189 / (float) local22.anInt10693;
		@Pc(59) float local59 = local22.aFloat190 / (float) local22.anInt10695;
		@Pc(66) float local66 = (float) -arg0 + (float) arg2;
		@Pc(72) float local72 = (float) arg3 - (float) arg1;
		@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local72 * local72)));
		@Pc(92) int local92 = arg10 % (arg9 + arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(111) float local111 = local66 * local85;
		@Pc(115) float local115 = local72 * local85;
		@Pc(120) float local120 = (float) arg8 * local111;
		@Pc(125) float local125 = (float) arg8 * local115;
		@Pc(127) float local127 = 0.0F;
		@Pc(129) float local129 = 0.0F;
		@Pc(131) float local131 = local120;
		@Pc(133) float local133 = local125;
		if (arg8 >= local92) {
			local133 = (float) (arg8 - local92) * local115;
			local131 = (float) (arg8 - local92) * local111;
		} else {
			local127 = (float) (arg9 + arg8 - local92) * local111;
			local129 = local115 * (float) (arg9 + arg8 - local92);
		}
		@Pc(184) float local184 = (float) arg0 + local127 + 0.35F;
		@Pc(191) float local191 = local129 + (float) arg1 + 0.35F;
		@Pc(196) float local196 = local111 * (float) arg9;
		@Pc(201) float local201 = local115 * (float) arg9;
		while (true) {
			if (arg0 < arg2) {
				if (local184 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local184 + local131) {
					local131 = (float) arg2 - local184;
				}
			} else {
				if ((float) arg2 + 0.35F > local184) {
					break;
				}
				if (local184 + local131 < (float) arg2) {
					local131 = (float) arg2 - local184;
				}
			}
			if (arg1 < arg3) {
				if ((float) arg3 + 0.35F < local191) {
					break;
				}
				if (local133 + local191 > (float) arg3) {
					local133 = (float) arg3 - local191;
				}
			} else {
				if ((float) arg3 + 0.35F > local191) {
					break;
				}
				if ((float) arg3 > local133 + local191) {
					local133 = (float) arg3 - local191;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local52 * ((float) -arg6 + local184), local59 * (local191 - (float) arg7));
			OpenGL.glVertex2f(local184, local191);
			OpenGL.glTexCoord2f(local52 * (local131 + local184 - (float) arg6), ((float) -arg7 + local133 + local191) * local59);
			OpenGL.glVertex2f(local131 + local184, local133 + local191);
			local191 += local201 + local133;
			local184 += local196 + local131;
			OpenGL.glEnd();
			local133 = local125;
			local131 = local120;
		}
		this.method5657(768, 0, 5890);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!de;Z)Lclient!mq;")
	@Override
	public Class71 method8063(@OriginalArg(0) Class67 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt1759 * arg0.anInt1761];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray20 == null) {
			for (local21 = 0; local21 < arg0.anInt1759; local21++) {
				for (local25 = 0; local25 < arg0.anInt1761; local25++) {
					@Pc(38) int local38 = arg0.anIntArray91[arg0.aByteArray19[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt1759; local21++) {
				for (local25 = 0; local25 < arg0.anInt1761; local25++) {
					local12[local16++] = arg0.aByteArray20[local14] << 24 | arg0.anIntArray91[arg0.aByteArray19[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(128) Class71 local128 = this.method8111(arg0.anInt1761, local12, arg0.anInt1759, arg0.anInt1761);
		local128.method7690(arg0.anInt1760, arg0.anInt1763, arg0.anInt1762, arg0.anInt1764);
		return local128;
	}

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "()V")
	@Override
	public void method8107() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "(IIII)V")
	public void method5680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!lea", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass76_Sub1_3.aFloat93 + (float) arg2 * this.aClass76_Sub1_3.aFloat102 + (float) arg0 * this.aClass76_Sub1_3.aFloat103 + this.aClass76_Sub1_3.aFloat95 * (float) arg1;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt6347 * (this.aClass76_Sub1_3.aFloat94 + this.aClass76_Sub1_3.aFloat98 * (float) arg0 + this.aClass76_Sub1_3.aFloat96 * (float) arg1 + (float) arg2 * this.aClass76_Sub1_3.aFloat99) / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat135);
		@Pc(119) int local119 = (int) ((this.aClass76_Sub1_3.aFloat97 * (float) arg1 + (float) arg0 * this.aClass76_Sub1_3.aFloat101 + (float) arg2 * this.aClass76_Sub1_3.aFloat100 + this.aClass76_Sub1_3.aFloat104) * (float) this.anInt6336 / local28);
		arg3[1] = (int) ((float) local119 - this.aFloat134);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8082(@OriginalArg(0) Class2_Sub5 arg0) {
		this.aNativeHeap5 = ((Class2_Sub5_Sub1) arg0).aNativeHeap1;
		if (this.anInterface2_3 != null) {
			return;
		}
		@Pc(16) Class2_Sub8_Sub1 local16 = new Class2_Sub8_Sub1(80);
		if (this.aBoolean470) {
			local16.method789(-1.0F);
			local16.method789(-1.0F);
			local16.method789(0.0F);
			local16.method789(0.0F);
			local16.method789(1.0F);
			local16.method789(1.0F);
			local16.method789(-1.0F);
			local16.method789(0.0F);
			local16.method789(1.0F);
			local16.method789(1.0F);
			local16.method789(1.0F);
			local16.method789(1.0F);
			local16.method789(0.0F);
			local16.method789(1.0F);
			local16.method789(0.0F);
			local16.method789(-1.0F);
			local16.method789(1.0F);
			local16.method789(0.0F);
			local16.method789(0.0F);
			local16.method789(0.0F);
		} else {
			local16.method788(-1.0F);
			local16.method788(-1.0F);
			local16.method788(0.0F);
			local16.method788(0.0F);
			local16.method788(1.0F);
			local16.method788(1.0F);
			local16.method788(-1.0F);
			local16.method788(0.0F);
			local16.method788(1.0F);
			local16.method788(1.0F);
			local16.method788(1.0F);
			local16.method788(1.0F);
			local16.method788(0.0F);
			local16.method788(1.0F);
			local16.method788(0.0F);
			local16.method788(-1.0F);
			local16.method788(1.0F);
			local16.method788(0.0F);
			local16.method788(0.0F);
			local16.method788(0.0F);
		}
		this.anInterface2_3 = this.method5642(local16.lb, 20, local16.anInt5725, false);
		this.aClass274_8 = new Class274(this.anInterface2_3, 5126, 3, 0);
		this.aClass274_9 = new Class274(this.anInterface2_3, 5126, 2, 12);
		this.aClass247_1.method6597(this);
	}

	@OriginalMember(owner = "client!lea", name = "o", descriptor = "()Z")
	@Override
	public boolean method8114() {
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(IB)V")
	public void method5681(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method5665(7681, 7681);
		} else if (arg0 == 0) {
			this.method5665(8448, 8448);
		} else if (arg0 == 2) {
			this.method5665(34165, 7681);
		} else if (arg0 == 3) {
			this.method5665(260, 8448);
		} else if (arg0 == 4) {
			this.method5665(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = (float) arg2 * this.aClass76_Sub1_3.aFloat102 + this.aClass76_Sub1_3.aFloat95 * (float) arg1 + (float) arg0 * this.aClass76_Sub1_3.aFloat103 + this.aClass76_Sub1_3.aFloat93;
		@Pc(55) float local55 = (float) arg5 * this.aClass76_Sub1_3.aFloat102 + this.aClass76_Sub1_3.aFloat95 * (float) arg4 + (float) arg3 * this.aClass76_Sub1_3.aFloat103 + this.aClass76_Sub1_3.aFloat93;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt6338 > local30 && (float) this.anInt6338 > local55) {
			local57 |= 0x10;
		} else if ((float) this.anInt6327 < local30 && (float) this.anInt6327 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt6347 * ((float) arg1 * this.aClass76_Sub1_3.aFloat96 + (float) arg0 * this.aClass76_Sub1_3.aFloat98 + (float) arg2 * this.aClass76_Sub1_3.aFloat99 + this.aClass76_Sub1_3.aFloat94) / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt6347 * (this.aClass76_Sub1_3.aFloat94 + this.aClass76_Sub1_3.aFloat98 * (float) arg3 + this.aClass76_Sub1_3.aFloat96 * (float) arg4 + this.aClass76_Sub1_3.aFloat99 * (float) arg5) / (float) arg6);
		if ((float) local124 < this.aFloat135 && this.aFloat135 > (float) local157) {
			local57 |= 0x1;
		} else if (this.aFloat138 < (float) local124 && (float) local157 > this.aFloat138) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass76_Sub1_3.aFloat104 + this.aClass76_Sub1_3.aFloat97 * (float) arg1 + this.aClass76_Sub1_3.aFloat101 * (float) arg0 + (float) arg2 * this.aClass76_Sub1_3.aFloat100) * (float) this.anInt6336 / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt6336 * ((float) arg3 * this.aClass76_Sub1_3.aFloat101 + this.aClass76_Sub1_3.aFloat97 * (float) arg4 + (float) arg5 * this.aClass76_Sub1_3.aFloat100 + this.aClass76_Sub1_3.aFloat104) / (float) arg6);
		if (this.aFloat134 > (float) local224 && this.aFloat134 > (float) local257) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat139 && (float) local257 > this.aFloat139) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!lea", name = "m", descriptor = "(II)V")
	public synchronized void method5682(@OriginalArg(1) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong313 = (long) arg0;
		this.aClass271_37.method7174(local7);
	}

	@OriginalMember(owner = "client!lea", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass76_Sub1_3.aFloat93 + this.aClass76_Sub1_3.aFloat95 * (float) arg1 + (float) arg0 * this.aClass76_Sub1_3.aFloat103 + this.aClass76_Sub1_3.aFloat102 * (float) arg2;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg5 * this.aClass76_Sub1_3.aFloat102 + this.aClass76_Sub1_3.aFloat103 * (float) arg3 + this.aClass76_Sub1_3.aFloat95 * (float) arg4 + this.aClass76_Sub1_3.aFloat93;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt6338 > local32 && local63 < (float) this.anInt6338) {
			local7 |= 0x10;
		} else if ((float) this.anInt6327 < local32 && (float) this.anInt6327 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass76_Sub1_3.aFloat94 + (float) arg1 * this.aClass76_Sub1_3.aFloat96 + this.aClass76_Sub1_3.aFloat98 * (float) arg0 + (float) arg2 * this.aClass76_Sub1_3.aFloat99) * (float) this.anInt6347 / local32);
		@Pc(167) int local167 = (int) ((this.aClass76_Sub1_3.aFloat94 + (float) arg5 * this.aClass76_Sub1_3.aFloat99 + this.aClass76_Sub1_3.aFloat98 * (float) arg3 + (float) arg4 * this.aClass76_Sub1_3.aFloat96) * (float) this.anInt6347 / local63);
		if ((float) local135 < this.aFloat135 && this.aFloat135 > (float) local167) {
			local7 |= 0x1;
		} else if (this.aFloat138 < (float) local135 && this.aFloat138 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt6336 * (this.aClass76_Sub1_3.aFloat104 + this.aClass76_Sub1_3.aFloat97 * (float) arg1 + this.aClass76_Sub1_3.aFloat101 * (float) arg0 + (float) arg2 * this.aClass76_Sub1_3.aFloat100) / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt6336 * (this.aClass76_Sub1_3.aFloat104 + this.aClass76_Sub1_3.aFloat100 * (float) arg5 + this.aClass76_Sub1_3.aFloat97 * (float) arg4 + (float) arg3 * this.aClass76_Sub1_3.aFloat101) / local63);
		if (this.aFloat134 > (float) local233 && (float) local265 < this.aFloat134) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat139 && (float) local265 > this.aFloat139) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V")
	@Override
	public void method8080(@OriginalArg(0) int arg0) {
		this.method5694();
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8144(@OriginalArg(0) Canvas arg0) {
		this.aLong170 = 0L;
		this.aCanvas7 = null;
		if (arg0 == null || this.aCanvas6 == arg0) {
			this.aLong170 = this.aLong169;
			this.aCanvas7 = this.aCanvas6;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable4.get(arg0);
			this.aLong170 = local36;
			this.aCanvas7 = arg0;
		}
		if (this.aCanvas7 == null || this.aLong170 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong170);
		this.method5688();
	}

	@OriginalMember(owner = "client!lea", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5683(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(IZ)V")
	public void method5683(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean449) {
			this.aBoolean449 = arg0;
			this.method5672();
			this.anInt6323 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "()Z")
	@Override
	public boolean method8086() {
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZZII)V")
	public void method5684(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 != this.anInt6334 || this.aBoolean459 != this.aBoolean473) {
			@Pc(14) Class50_Sub4 local14 = null;
			@Pc(16) int local16 = 0;
			@Pc(18) byte local18 = 0;
			@Pc(20) int local20 = 0;
			@Pc(27) int local27 = this.aBoolean459 ? 3 : 0;
			if (arg2 < 0) {
				this.method5669();
			} else {
				local14 = this.aClass262_1.method7044(arg2);
				@Pc(44) Class136 local44 = super.anInterface3_12.method1941(arg2);
				if (local44.aByte61 == 0 && local44.aByte65 == 0) {
					this.method5669();
				} else {
					@Pc(57) int local57 = local44.aBoolean333 ? 64 : 128;
					@Pc(61) int local61 = local57 * 50;
					this.method5686((float) (local44.aByte65 * (this.anInt6314 % local61)) / (float) local61, (float) (this.anInt6314 % local61 * local44.aByte61) / (float) local61, 0.0F);
				}
				if (!this.aBoolean459) {
					local18 = local44.aByte64;
					local27 = local44.aByte62;
					local20 = local44.anInt4369;
				}
				local16 = local44.anInt4368;
			}
			this.aClass323_1.method8171(local18, local27, arg1, local20, arg0);
			if (!this.aClass323_1.method8172(local14, local16)) {
				this.method5690(local14);
				this.method5681(local16);
			}
			this.aBoolean473 = this.aBoolean459;
			this.anInt6334 = arg2;
		}
		this.anInt6323 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "()V")
	@Override
	public void method8066() {
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass293_1.method7619(arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)V")
	@Override
	public void method8093(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!cq;B)V")
	public void method5685(@OriginalArg(0) Interface2 arg0) {
		if (arg0 != this.anInterface2_4) {
			if (this.aBoolean469) {
				OpenGL.glBindBufferARB(34962, arg0.method6367());
			}
			this.anInterface2_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(FFIF)V")
	private void method5686(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean474) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg0, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean474 = true;
	}

	@OriginalMember(owner = "client!lea", name = "i", descriptor = "(B)V")
	private void method5687() {
		OpenGL.glViewport(this.anInt6357, this.anInt6330, this.anInt6186, this.anInt6211);
	}

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "(Z)V")
	private void method5688() {
		if (this.aCanvas7 == null) {
			this.anInt6182 = this.anInt6222 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas7.getSize();
			this.anInt6182 = local10.width;
			this.anInt6222 = local10.height;
		}
		if (this.anInterface22_1 == null) {
			this.anInt6211 = this.anInt6222;
			this.anInt6186 = this.anInt6182;
			this.method5687();
		}
		this.method5646();
		this.la();
	}

	@OriginalMember(owner = "client!lea", name = "F", descriptor = "(I)V")
	public void method5689() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray38, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray37, 0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8092(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas6 == arg0) {
			local5 = this.aLong169;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable4.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas7) {
			this.method5688();
		}
	}

	@OriginalMember(owner = "client!lea", name = "v", descriptor = "()Z")
	@Override
	public boolean method8133() {
		return this.aBoolean462 && (!this.method8101() || this.aBoolean468);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!fga;B)V")
	public void method5690(@OriginalArg(0) Class50 arg0) {
		@Pc(17) Class50 local17 = this.aClass50Array1[this.anInt6331];
		if (arg0 != local17) {
			if (arg0 == null) {
				OpenGL.glDisable(local17.anInt10677);
			} else {
				if (local17 == null) {
					OpenGL.glEnable(arg0.anInt10677);
				} else if (local17.anInt10677 != arg0.anInt10677) {
					OpenGL.glDisable(local17.anInt10677);
					OpenGL.glEnable(arg0.anInt10677);
				}
				OpenGL.glBindTexture(arg0.anInt10677, arg0.method9138());
			}
			this.aClass50Array1[this.anInt6331] = arg0;
		}
		this.anInt6323 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZI)V")
	public void method5691(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean464 != arg0) {
			this.aBoolean464 = arg0;
			this.method5674();
			this.anInt6323 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!ida;IIII)Lclient!ka;")
	@Override
	public Class14 method8064(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class14_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!lea", name = "s", descriptor = "()V")
	@Override
	protected void method8124() {
		for (@Pc(10) Class2 local10 = this.aClass271_31.method7177(); local10 != null; local10 = this.aClass271_31.method7175()) {
			((Class2_Sub5_Sub1) local10).method525();
		}
		if (this.aClass293_1 != null) {
			this.aClass293_1.method7616();
		}
		if (this.anOpenGL2 != null) {
			this.method5694();
			@Pc(40) Enumeration local40 = this.aHashtable4.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable4.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean446) {
			Static508.method7933(true, false);
			this.aBoolean446 = false;
		}
	}

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method8129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method5630();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method5614(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean462) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean462) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!lea", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass76_Sub1_3.aFloat93 + (float) arg0 * this.aClass76_Sub1_3.aFloat103 + (float) arg1 * this.aClass76_Sub1_3.aFloat95 + (float) arg2 * this.aClass76_Sub1_3.aFloat102;
		if (local28 < (float) this.anInt6338 || local28 > (float) this.anInt6327) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((float) this.anInt6347 * ((float) arg0 * this.aClass76_Sub1_3.aFloat98 + (float) arg1 * this.aClass76_Sub1_3.aFloat96 + this.aClass76_Sub1_3.aFloat99 * (float) arg2 + this.aClass76_Sub1_3.aFloat94) / (float) arg3);
		@Pc(119) int local119 = (int) ((this.aClass76_Sub1_3.aFloat104 + this.aClass76_Sub1_3.aFloat101 * (float) arg0 + this.aClass76_Sub1_3.aFloat97 * (float) arg1 + (float) arg2 * this.aClass76_Sub1_3.aFloat100) * (float) this.anInt6336 / (float) arg3);
		if ((float) local86 >= this.aFloat135 && (float) local86 <= this.aFloat138 && (float) local119 >= this.aFloat134 && (float) local119 <= this.aFloat139) {
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local119 - this.aFloat134);
			arg4[0] = (int) ((float) local86 - this.aFloat135);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZIB)V")
	public void method5692(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.method5684(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(ZI)V")
	public void method5693(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean450) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt6323 &= 0xFFFFFFE0;
		this.aBoolean450 = arg0;
	}

	@OriginalMember(owner = "client!lea", name = "G", descriptor = "(I)V")
	private void method5694() {
		this.anOpenGL2.a();
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(II)Lclient!lf;")
	@Override
	public Interface11 method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lea", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean466 = arg0;
		this.method5672();
	}
}
