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

@OriginalClass("client!eq")
public final class Class33_Sub3 extends Class33 {

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
	private int anInt3220;

	@OriginalMember(owner = "client!eq", name = "Kb", descriptor = "I")
	private int anInt3284;

	@OriginalMember(owner = "client!eq", name = "dd", descriptor = "I")
	public int anInt3352;

	@OriginalMember(owner = "client!eq", name = "Md", descriptor = "I")
	public int anInt3387;

	@OriginalMember(owner = "client!eq", name = "ye", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!eq", name = "Ee", descriptor = "I")
	public int anInt3418;

	@OriginalMember(owner = "client!eq", name = "Fe", descriptor = "Lclient!tt;")
	private Class324 aClass324_1;

	@OriginalMember(owner = "client!eq", name = "Ie", descriptor = "Lclient!qv;")
	private Interface21 anInterface21_1;

	@OriginalMember(owner = "client!eq", name = "Ke", descriptor = "Lclient!au;")
	private Class5_Sub2 aClass5_Sub2_1;

	@OriginalMember(owner = "client!eq", name = "Le", descriptor = "Lclient!qv;")
	private Interface21 anInterface21_2;

	@OriginalMember(owner = "client!eq", name = "Pe", descriptor = "I")
	public int anInt3422;

	@OriginalMember(owner = "client!eq", name = "Qe", descriptor = "I")
	private int anInt3423;

	@OriginalMember(owner = "client!eq", name = "Re", descriptor = "I")
	public int anInt3424;

	@OriginalMember(owner = "client!eq", name = "Ze", descriptor = "I")
	private int anInt3425;

	@OriginalMember(owner = "client!eq", name = "af", descriptor = "Z")
	private boolean aBoolean252;

	@OriginalMember(owner = "client!eq", name = "bf", descriptor = "J")
	private long bf;

	@OriginalMember(owner = "client!eq", name = "cf", descriptor = "I")
	private int anInt3426;

	@OriginalMember(owner = "client!eq", name = "df", descriptor = "Z")
	private boolean aBoolean253;

	@OriginalMember(owner = "client!eq", name = "ff", descriptor = "I")
	private int anInt3427;

	@OriginalMember(owner = "client!eq", name = "gf", descriptor = "Z")
	private boolean aBoolean254;

	@OriginalMember(owner = "client!eq", name = "hf", descriptor = "Z")
	private boolean aBoolean255;

	@OriginalMember(owner = "client!eq", name = "lf", descriptor = "Z")
	public boolean aBoolean256;

	@OriginalMember(owner = "client!eq", name = "nf", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!eq", name = "of", descriptor = "Lclient!ur;")
	private Interface27 anInterface27_2;

	@OriginalMember(owner = "client!eq", name = "qf", descriptor = "Lclient!hn;")
	public Class128_Sub2 aClass128_Sub2_1;

	@OriginalMember(owner = "client!eq", name = "rf", descriptor = "Lclient!mba;")
	private Class121_Sub2_Sub1 aClass121_Sub2_Sub1_3;

	@OriginalMember(owner = "client!eq", name = "vf", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!eq", name = "xf", descriptor = "Lclient!tt;")
	public Class324 aClass324_2;

	@OriginalMember(owner = "client!eq", name = "yf", descriptor = "I")
	public int anInt3429;

	@OriginalMember(owner = "client!eq", name = "zf", descriptor = "F")
	private float aFloat107;

	@OriginalMember(owner = "client!eq", name = "Bf", descriptor = "I")
	private int anInt3431;

	@OriginalMember(owner = "client!eq", name = "Df", descriptor = "I")
	private int anInt3432;

	@OriginalMember(owner = "client!eq", name = "Ef", descriptor = "Z")
	private boolean aBoolean260;

	@OriginalMember(owner = "client!eq", name = "Gf", descriptor = "Z")
	public boolean aBoolean261;

	@OriginalMember(owner = "client!eq", name = "Hf", descriptor = "Lclient!hn;")
	public Class128_Sub2 aClass128_Sub2_2;

	@OriginalMember(owner = "client!eq", name = "Nf", descriptor = "I")
	private int anInt3434;

	@OriginalMember(owner = "client!eq", name = "Pf", descriptor = "I")
	public int anInt3435;

	@OriginalMember(owner = "client!eq", name = "Rf", descriptor = "Z")
	public boolean aBoolean264;

	@OriginalMember(owner = "client!eq", name = "Tf", descriptor = "Lclient!hn;")
	public Class128_Sub2 aClass128_Sub2_3;

	@OriginalMember(owner = "client!eq", name = "Uf", descriptor = "Lclient!kc;")
	private Class4_Sub1 aClass4_Sub1_1;

	@OriginalMember(owner = "client!eq", name = "Wf", descriptor = "I")
	public int anInt3438;

	@OriginalMember(owner = "client!eq", name = "Yf", descriptor = "F")
	public float aFloat111;

	@OriginalMember(owner = "client!eq", name = "ag", descriptor = "Z")
	public boolean aBoolean265;

	@OriginalMember(owner = "client!eq", name = "bg", descriptor = "I")
	public int anInt3440;

	@OriginalMember(owner = "client!eq", name = "cg", descriptor = "Lclient!hn;")
	public Class128_Sub2 aClass128_Sub2_4;

	@OriginalMember(owner = "client!eq", name = "dg", descriptor = "Lclient!hga;")
	public Class121_Sub2 aClass121_Sub2_1;

	@OriginalMember(owner = "client!eq", name = "hg", descriptor = "Lclient!hn;")
	public Class128_Sub2 aClass128_Sub2_5;

	@OriginalMember(owner = "client!eq", name = "ig", descriptor = "F")
	private float aFloat112;

	@OriginalMember(owner = "client!eq", name = "jg", descriptor = "F")
	public float aFloat113;

	@OriginalMember(owner = "client!eq", name = "lg", descriptor = "Z")
	public boolean aBoolean268;

	@OriginalMember(owner = "client!eq", name = "mg", descriptor = "Lclient!jb;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!eq", name = "og", descriptor = "Z")
	public boolean aBoolean269;

	@OriginalMember(owner = "client!eq", name = "pg", descriptor = "Z")
	private boolean aBoolean270;

	@OriginalMember(owner = "client!eq", name = "qg", descriptor = "Z")
	private boolean aBoolean271;

	@OriginalMember(owner = "client!eq", name = "rg", descriptor = "Lclient!qe;")
	public Class270 aClass270_4;

	@OriginalMember(owner = "client!eq", name = "sg", descriptor = "F")
	public float aFloat114;

	@OriginalMember(owner = "client!eq", name = "ug", descriptor = "Lclient!hn;")
	public Class128_Sub2 aClass128_Sub2_6;

	@OriginalMember(owner = "client!eq", name = "zg", descriptor = "I")
	private int anInt3445;

	@OriginalMember(owner = "client!eq", name = "Bg", descriptor = "[Lclient!kp;")
	private Class121[] aClass121Array1;

	@OriginalMember(owner = "client!eq", name = "Cg", descriptor = "Lclient!hn;")
	public Class128_Sub2 aClass128_Sub2_7;

	@OriginalMember(owner = "client!eq", name = "Eg", descriptor = "Lclient!hn;")
	public Class128_Sub2 aClass128_Sub2_8;

	@OriginalMember(owner = "client!eq", name = "Fg", descriptor = "Z")
	public boolean aBoolean272;

	@OriginalMember(owner = "client!eq", name = "Kg", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!eq", name = "Og", descriptor = "F")
	public float aFloat118;

	@OriginalMember(owner = "client!eq", name = "Pg", descriptor = "Lclient!ur;")
	private Interface27 anInterface27_3;

	@OriginalMember(owner = "client!eq", name = "Rg", descriptor = "Z")
	public boolean aBoolean274;

	@OriginalMember(owner = "client!eq", name = "Vg", descriptor = "I")
	private int anInt3454;

	@OriginalMember(owner = "client!eq", name = "Wg", descriptor = "Z")
	public boolean aBoolean275;

	@OriginalMember(owner = "client!eq", name = "Xg", descriptor = "F")
	private float aFloat120;

	@OriginalMember(owner = "client!eq", name = "Yg", descriptor = "Lclient!qe;")
	public Class270 aClass270_5;

	@OriginalMember(owner = "client!eq", name = "Zg", descriptor = "Z")
	public boolean aBoolean276;

	@OriginalMember(owner = "client!eq", name = "ah", descriptor = "Z")
	private boolean aBoolean277;

	@OriginalMember(owner = "client!eq", name = "ch", descriptor = "Z")
	private boolean aBoolean279;

	@OriginalMember(owner = "client!eq", name = "dh", descriptor = "F")
	public float aFloat121;

	@OriginalMember(owner = "client!eq", name = "eh", descriptor = "Lclient!hn;")
	public Class128_Sub2 aClass128_Sub2_9;

	@OriginalMember(owner = "client!eq", name = "hh", descriptor = "Z")
	private boolean aBoolean280;

	@OriginalMember(owner = "client!eq", name = "jh", descriptor = "Z")
	private boolean aBoolean281;

	@OriginalMember(owner = "client!eq", name = "kh", descriptor = "I")
	private int anInt3458;

	@OriginalMember(owner = "client!eq", name = "nh", descriptor = "Lclient!hn;")
	public Class128_Sub2 aClass128_Sub2_10;

	@OriginalMember(owner = "client!eq", name = "oh", descriptor = "I")
	private int anInt3460;

	@OriginalMember(owner = "client!eq", name = "rh", descriptor = "I")
	private int anInt3461;

	@OriginalMember(owner = "client!eq", name = "sh", descriptor = "I")
	private int anInt3462;

	@OriginalMember(owner = "client!eq", name = "wh", descriptor = "I")
	private int anInt3463;

	@OriginalMember(owner = "client!eq", name = "Vb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable8 = new Hashtable();

	@OriginalMember(owner = "client!eq", name = "ne", descriptor = "I")
	public int anInt3412 = 128;

	@OriginalMember(owner = "client!eq", name = "ve", descriptor = "Lclient!eba;")
	private final Class74 aClass74_1 = new Class74();

	@OriginalMember(owner = "client!eq", name = "we", descriptor = "Lclient!fw;")
	private final Class47_Sub2 aClass47_Sub2_1 = new Class47_Sub2();

	@OriginalMember(owner = "client!eq", name = "xe", descriptor = "Lclient!fw;")
	public final Class47_Sub2 aClass47_Sub2_2 = new Class47_Sub2();

	@OriginalMember(owner = "client!eq", name = "ze", descriptor = "I")
	public int anInt3416 = 3;

	@OriginalMember(owner = "client!eq", name = "De", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!eq", name = "Ce", descriptor = "I")
	public int anInt3417 = 8;

	@OriginalMember(owner = "client!eq", name = "Be", descriptor = "Lclient!qia;")
	private final Class276 aClass276_19 = new Class276();

	@OriginalMember(owner = "client!eq", name = "He", descriptor = "[Lclient!qv;")
	private final Interface21[] anInterface21Array2 = new Interface21[4];

	@OriginalMember(owner = "client!eq", name = "Ge", descriptor = "[Lclient!qv;")
	private final Interface21[] anInterface21Array1 = new Interface21[4];

	@OriginalMember(owner = "client!eq", name = "Je", descriptor = "I")
	private int anInt3419 = -1;

	@OriginalMember(owner = "client!eq", name = "Oe", descriptor = "I")
	private int anInt3421 = -1;

	@OriginalMember(owner = "client!eq", name = "Me", descriptor = "I")
	private int anInt3420 = -1;

	@OriginalMember(owner = "client!eq", name = "Ne", descriptor = "[Lclient!qv;")
	private final Interface21[] anInterface21Array3 = new Interface21[4];

	@OriginalMember(owner = "client!eq", name = "Se", descriptor = "Lclient!qia;")
	private final Class276 aClass276_20;

	@OriginalMember(owner = "client!eq", name = "Te", descriptor = "Lclient!qia;")
	private final Class276 aClass276_21;

	@OriginalMember(owner = "client!eq", name = "Ue", descriptor = "Lclient!qia;")
	private final Class276 aClass276_22;

	@OriginalMember(owner = "client!eq", name = "Ve", descriptor = "Lclient!qia;")
	private final Class276 aClass276_23;

	@OriginalMember(owner = "client!eq", name = "We", descriptor = "Lclient!qia;")
	private final Class276 aClass276_24;

	@OriginalMember(owner = "client!eq", name = "Xe", descriptor = "Lclient!qia;")
	private final Class276 aClass276_25;

	@OriginalMember(owner = "client!eq", name = "Ye", descriptor = "Lclient!qia;")
	private final Class276 aClass276_26;

	@OriginalMember(owner = "client!eq", name = "ef", descriptor = "Lclient!fw;")
	public final Class47_Sub2 aClass47_Sub2_3;

	@OriginalMember(owner = "client!eq", name = "jf", descriptor = "Lclient!fw;")
	public final Class47_Sub2 aClass47_Sub2_4;

	@OriginalMember(owner = "client!eq", name = "kf", descriptor = "Lclient!fw;")
	public final Class47_Sub2 aClass47_Sub2_5;

	@OriginalMember(owner = "client!eq", name = "mf", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!eq", name = "Ff", descriptor = "F")
	private float aFloat108;

	@OriginalMember(owner = "client!eq", name = "Kf", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!eq", name = "Xf", descriptor = "[F")
	public final float[] aFloatArray42;

	@OriginalMember(owner = "client!eq", name = "If", descriptor = "I")
	public int anInt3433;

	@OriginalMember(owner = "client!eq", name = "pf", descriptor = "Z")
	private boolean aBoolean257;

	@OriginalMember(owner = "client!eq", name = "Mf", descriptor = "[F")
	private final float[] aFloatArray40;

	@OriginalMember(owner = "client!eq", name = "Sf", descriptor = "I")
	private int anInt3437;

	@OriginalMember(owner = "client!eq", name = "Ag", descriptor = "I")
	public int anInt3446;

	@OriginalMember(owner = "client!eq", name = "uf", descriptor = "F")
	public float aFloat106;

	@OriginalMember(owner = "client!eq", name = "yg", descriptor = "F")
	private float aFloat116;

	@OriginalMember(owner = "client!eq", name = "ng", descriptor = "I")
	public int anInt3442;

	@OriginalMember(owner = "client!eq", name = "vg", descriptor = "I")
	public int anInt3443;

	@OriginalMember(owner = "client!eq", name = "Hg", descriptor = "I")
	public int anInt3448;

	@OriginalMember(owner = "client!eq", name = "Lg", descriptor = "I")
	private int anInt3450;

	@OriginalMember(owner = "client!eq", name = "tg", descriptor = "F")
	private float aFloat115;

	@OriginalMember(owner = "client!eq", name = "Qf", descriptor = "I")
	public int anInt3436;

	@OriginalMember(owner = "client!eq", name = "Ig", descriptor = "F")
	private float aFloat117;

	@OriginalMember(owner = "client!eq", name = "Tg", descriptor = "I")
	private int anInt3453;

	@OriginalMember(owner = "client!eq", name = "xg", descriptor = "I")
	private int anInt3444;

	@OriginalMember(owner = "client!eq", name = "wg", descriptor = "[Lclient!pk;")
	private final Class3_Sub27[] aClass3_Sub27Array4;

	@OriginalMember(owner = "client!eq", name = "fg", descriptor = "I")
	private int anInt3441;

	@OriginalMember(owner = "client!eq", name = "sf", descriptor = "F")
	private float aFloat105;

	@OriginalMember(owner = "client!eq", name = "Qg", descriptor = "I")
	private int anInt3452;

	@OriginalMember(owner = "client!eq", name = "Lf", descriptor = "F")
	public float aFloat110;

	@OriginalMember(owner = "client!eq", name = "Dg", descriptor = "I")
	public int anInt3447;

	@OriginalMember(owner = "client!eq", name = "Mg", descriptor = "I")
	public int anInt3451;

	@OriginalMember(owner = "client!eq", name = "Jg", descriptor = "I")
	private int anInt3449;

	@OriginalMember(owner = "client!eq", name = "Ug", descriptor = "F")
	public float aFloat119;

	@OriginalMember(owner = "client!eq", name = "gh", descriptor = "I")
	private int anInt3456;

	@OriginalMember(owner = "client!eq", name = "Af", descriptor = "I")
	private int anInt3430;

	@OriginalMember(owner = "client!eq", name = "tf", descriptor = "I")
	public int anInt3428;

	@OriginalMember(owner = "client!eq", name = "eg", descriptor = "Z")
	private boolean aBoolean266;

	@OriginalMember(owner = "client!eq", name = "Gg", descriptor = "[F")
	private final float[] aFloatArray43;

	@OriginalMember(owner = "client!eq", name = "lh", descriptor = "I")
	public int anInt3459;

	@OriginalMember(owner = "client!eq", name = "fh", descriptor = "I")
	public int anInt3455;

	@OriginalMember(owner = "client!eq", name = "ih", descriptor = "I")
	private int anInt3457;

	@OriginalMember(owner = "client!eq", name = "ph", descriptor = "F")
	public float aFloat122;

	@OriginalMember(owner = "client!eq", name = "Vf", descriptor = "[F")
	private final float[] aFloatArray41;

	@OriginalMember(owner = "client!eq", name = "Sg", descriptor = "[F")
	private final float[] aFloatArray44;

	@OriginalMember(owner = "client!eq", name = "qh", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!eq", name = "kg", descriptor = "Lclient!wb;")
	public Class3_Sub15_Sub2 aClass3_Sub15_Sub2_2;

	@OriginalMember(owner = "client!eq", name = "vh", descriptor = "[I")
	public int[] anIntArray162;

	@OriginalMember(owner = "client!eq", name = "uh", descriptor = "[B")
	public final byte[] aByteArray35;

	@OriginalMember(owner = "client!eq", name = "th", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!eq", name = "xh", descriptor = "[I")
	public int[] anIntArray163;

	@OriginalMember(owner = "client!eq", name = "ue", descriptor = "I")
	public final int anInt3415;

	@OriginalMember(owner = "client!eq", name = "Cc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas9;

	@OriginalMember(owner = "client!eq", name = "Ab", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!eq", name = "be", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!eq", name = "Xc", descriptor = "J")
	private final long aLong69;

	@OriginalMember(owner = "client!eq", name = "me", descriptor = "J")
	private long aLong70;

	@OriginalMember(owner = "client!eq", name = "Zf", descriptor = "I")
	public final int anInt3439;

	@OriginalMember(owner = "client!eq", name = "gg", descriptor = "Z")
	private boolean aBoolean267;

	@OriginalMember(owner = "client!eq", name = "bh", descriptor = "Z")
	public boolean aBoolean278;

	@OriginalMember(owner = "client!eq", name = "Of", descriptor = "Z")
	public boolean aBoolean263;

	@OriginalMember(owner = "client!eq", name = "Jf", descriptor = "Z")
	public boolean aBoolean262;

	@OriginalMember(owner = "client!eq", name = "mh", descriptor = "Z")
	public boolean aBoolean282;

	@OriginalMember(owner = "client!eq", name = "wf", descriptor = "Z")
	private boolean aBoolean258;

	@OriginalMember(owner = "client!eq", name = "Ng", descriptor = "Z")
	public boolean aBoolean273;

	@OriginalMember(owner = "client!eq", name = "Cf", descriptor = "Z")
	private final boolean aBoolean259;

	@OriginalMember(owner = "client!eq", name = "se", descriptor = "Lclient!ks;")
	private final Class189 aClass189_1;

	@OriginalMember(owner = "client!eq", name = "Ae", descriptor = "Lclient!waa;")
	public final Class365 aClass365_1;

	@OriginalMember(owner = "client!eq", name = "oe", descriptor = "Lclient!vd;")
	private final Class350 aClass350_1;

	@OriginalMember(owner = "client!eq", name = "te", descriptor = "Lclient!fr;")
	private Class3_Sub21_Sub1 aClass3_Sub21_Sub1_1;

	@OriginalMember(owner = "client!eq", name = "pe", descriptor = "Lclient!kv;")
	private final Class190 aClass190_1;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class33_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class30();
		new Class307(16);
		this.aClass276_20 = new Class276();
		this.aClass276_21 = new Class276();
		this.aClass276_22 = new Class276();
		this.aClass276_23 = new Class276();
		this.aClass276_24 = new Class276();
		this.aClass276_25 = new Class276();
		this.aClass276_26 = new Class276();
		this.aClass47_Sub2_3 = new Class47_Sub2();
		this.aClass47_Sub2_4 = new Class47_Sub2();
		this.aClass47_Sub2_5 = new Class47_Sub2();
		this.aFloat103 = -1.0F;
		this.aFloat108 = 0.0F;
		this.aFloat109 = 1.0F;
		this.aFloatArray42 = new float[4];
		this.anInt3433 = 0;
		this.aBoolean257 = true;
		this.aFloatArray40 = new float[4];
		this.anInt3437 = 0;
		this.anInt3446 = 50;
		this.aFloat106 = 3584.0F;
		this.aFloat116 = -1.0F;
		this.anInt3442 = 0;
		this.anInt3443 = 512;
		this.anInt3448 = 0;
		this.anInt3450 = 0;
		this.aFloat115 = -1.0F;
		this.anInt3436 = -1;
		this.aFloat117 = 1.0F;
		this.anInt3453 = -1;
		this.anInt3444 = 0;
		this.aClass3_Sub27Array4 = new Class3_Sub27[Static647.anInt10552];
		this.anInt3441 = 3584;
		this.aFloat105 = 1.0F;
		this.anInt3452 = 0;
		this.aFloat110 = 1.0F;
		this.anInt3447 = -1;
		this.anInt3451 = -1;
		this.anInt3449 = 8448;
		this.aFloat119 = 3584.0F;
		this.anInt3456 = 0;
		this.anInt3430 = 0;
		this.anInt3428 = 512;
		this.aBoolean266 = false;
		this.aFloatArray43 = new float[4];
		this.anInt3459 = 0;
		this.anInt3455 = -1;
		this.anInt3457 = 8448;
		this.aFloat122 = -1.0F;
		this.aFloatArray41 = new float[16];
		this.aFloatArray44 = new float[4];
		this.aFloat123 = 1.0F;
		this.aClass3_Sub15_Sub2_2 = new Class3_Sub15_Sub2(8192);
		this.anIntArray162 = new int[1];
		this.aByteArray35 = new byte[16384];
		this.anIntArray161 = new int[1];
		this.anIntArray163 = new int[1];
		this.anInt3415 = arg2;
		this.aCanvas8 = this.aCanvas9 = arg0;
		if (!Static30.method575("jaclib")) {
			throw new RuntimeException("");
		} else if (Static30.method575("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong70 = this.aLong69 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt3415);
				if (this.aLong69 == 0L) {
					throw new RuntimeException("");
				}
				this.method3026();
				@Pc(333) int local333 = this.method3048();
				if (local333 != 0) {
					throw new RuntimeException("");
				}
				this.anInt3439 = this.aBoolean264 ? 33639 : 5121;
				if (this.aString24.indexOf("radeon") != -1) {
					@Pc(356) int local356 = 0;
					@Pc(358) boolean local358 = false;
					@Pc(360) boolean local360 = false;
					@Pc(369) String[] local369 = Static107.method2685(' ', this.aString24.replace('/', ' '));
					for (@Pc(371) int local371 = 0; local371 < local369.length; local371++) {
						@Pc(377) String local377 = local369[local371];
						try {
							if (local377.length() > 0) {
								if (local377.charAt(0) == 'x' && local377.length() >= 3 && Static621.method8474(local377.substring(1, 3))) {
									local377 = local377.substring(1);
									local360 = true;
								}
								if (local377.equals("hd")) {
									local358 = true;
								} else {
									if (local377.startsWith("hd")) {
										local377 = local377.substring(2);
										local358 = true;
									}
									if (local377.length() >= 4 && Static621.method8474(local377.substring(0, 4))) {
										local356 = Static607.method8246(local377.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(447) Exception local447) {
						}
					}
					if (!local360 && !local358) {
						if (local356 >= 7000 && local356 <= 7999) {
							this.aBoolean267 = false;
						}
						if (local356 >= 7000 && local356 <= 9250) {
							this.aBoolean278 = false;
						}
					}
					if (!local358 || local356 < 4000) {
						this.aBoolean263 = false;
					}
					this.aBoolean262 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean282 = true;
					this.aBoolean258 = this.aBoolean267;
				}
				if (this.aString25.indexOf("intel") != -1) {
					this.aBoolean273 = false;
				}
				this.aBoolean259 = !this.aString25.equals("s3 graphics");
				if (this.aBoolean267) {
					try {
						@Pc(530) int[] local530 = new int[1];
						OpenGL.glGenBuffersARB(1, local530, 0);
					} catch (@Pc(536) Throwable local536) {
						throw new RuntimeException("");
					}
				}
				Static146.method3249(false, true);
				this.aBoolean251 = true;
				this.aClass189_1 = new Class189(this, super.anInterface5_11);
				this.method3078();
				this.aClass365_1 = new Class365(this);
				this.aClass350_1 = new Class350(this);
				if (this.aClass350_1.method8151()) {
					this.aClass3_Sub21_Sub1_1 = new Class3_Sub21_Sub1(this);
					if (!this.aClass3_Sub21_Sub1_1.method3435()) {
						this.aClass3_Sub21_Sub1_1.method3428();
						this.aClass3_Sub21_Sub1_1 = null;
					}
				}
				this.aClass190_1 = new Class190(this);
				this.method3061();
				this.method3082();
				this.method6181();
			} catch (@Pc(610) Throwable local610) {
				local610.printStackTrace();
				this.method6224();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "()Z")
	@Override
	public boolean method6166() {
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass350_1.method8148(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "(II)V")
	public synchronized void method3006(@OriginalArg(0) int arg0) {
		@Pc(15) Class3 local15 = new Class3();
		local15.aLong277 = arg0;
		this.aClass276_25.method6906(local15);
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V")
	public void method3007() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray42, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray40, 0);
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3446 == arg0 && this.anInt3441 == arg1) {
			return;
		}
		this.anInt3446 = arg0;
		this.anInt3441 = arg1;
		this.method3053();
		this.method3037();
		if (this.anInt3432 == 3) {
			this.method3046();
		} else if (this.anInt3432 == 2) {
			this.method3054();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!pea;Lclient!st;)Lclient!mk;")
	@Override
	public Interface16 method6211(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface25 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "(I)V")
	public void method3008() {
		if (this.anInt3425 == 2) {
			return;
		}
		this.method3033();
		this.method3040(false);
		this.method3080(false);
		this.method3031(false);
		this.method3017(false);
		this.method3032(-2);
		this.anInt3425 = 2;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6189(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas9) {
			local5 = this.aLong69;
		} else if (this.aHashtable8.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable8.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas8) {
			this.method3082();
		}
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(B)V")
	private void method3009() {
		if (this.aBoolean271 && !this.aBoolean279) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "()V")
	@Override
	public void method6167() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "(II)V")
	public void method3010(@OriginalArg(0) int arg0) {
		Static485.aFloatArray63[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static485.aFloatArray63[3] = (float) (arg0 >>> 24) / 255.0F;
		Static485.aFloatArray63[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static485.aFloatArray63[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static485.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!cd;I)V")
	@Override
	public void method6214(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		this.aClass74_1.method2715(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(B)V")
	private void method3011() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt3431; local7++) {
			@Pc(20) Class3_Sub27 local20 = this.aClass3_Sub27Array4[local7];
			Static100.aFloatArray37[0] = local20.method5627();
			@Pc(31) int local31 = local7 + 16386;
			Static100.aFloatArray37[1] = local20.method5628();
			Static100.aFloatArray37[2] = local20.method5630();
			Static100.aFloatArray37[3] = 1.0F;
			OpenGL.glLightfv(local31, 4611, Static100.aFloatArray37, 0);
			@Pc(58) int local58 = local20.method5626();
			@Pc(64) float local64 = local20.method5631() / 255.0F;
			Static100.aFloatArray37[0] = (float) (local58 >> 16 & 0xFF) * local64;
			Static100.aFloatArray37[1] = (float) (local58 >> 8 & 0xFF) * local64;
			Static100.aFloatArray37[2] = local64 * (float) (local58 & 0xFF);
			OpenGL.glLightfv(local31, 4609, Static100.aFloatArray37, 0);
			OpenGL.glLightf(local31, 4617, 1.0F / (float) (local20.method5624() * local20.method5624()));
			OpenGL.glEnable(local31);
		}
		while (this.anInt3460 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt3460 = this.anInt3431;
	}

	@OriginalMember(owner = "client!eq", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(49) float local49;
		@Pc(61) float local61;
		if (this.aClass121_Sub2_Sub1_3 == null || this.aClass121_Sub2_Sub1_3.anInt6654 < arg2 || arg3 > this.aClass121_Sub2_Sub1_3.anInt6656) {
			this.aClass121_Sub2_Sub1_3 = Static370.method5905(arg3, arg6, arg2, this);
			this.aClass121_Sub2_Sub1_3.method5567(false, false);
			local49 = this.aClass121_Sub2_Sub1_3.aFloat187;
			local61 = this.aClass121_Sub2_Sub1_3.aFloat185;
		} else {
			this.aClass121_Sub2_Sub1_3.method5566(arg2, arg3, false, arg6, 6406);
			local49 = (float) arg3 * this.aClass121_Sub2_Sub1_3.aFloat187 / (float) this.aClass121_Sub2_Sub1_3.anInt6656;
			local61 = this.aClass121_Sub2_Sub1_3.aFloat185 * (float) arg2 / (float) this.aClass121_Sub2_Sub1_3.anInt6654;
		}
		this.method3008();
		this.method3012(this.aClass121_Sub2_Sub1_3);
		this.method3087(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3010(arg5);
		this.method3057(34165, 34165);
		this.method3024(768, 34166, 0);
		this.method3024(770, 5890, 2);
		this.method3081(34166, 0);
		this.method3081(5890, 2);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = (float) arg2 + local151;
		@Pc(164) float local164 = local154 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local61);
		OpenGL.glVertex2f(local151, local164);
		OpenGL.glTexCoord2f(local49, local61);
		OpenGL.glVertex2f(local159, local164);
		OpenGL.glTexCoord2f(local49, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method3024(768, 5890, 0);
		this.method3024(770, 34166, 2);
		this.method3081(5890, 0);
		this.method3081(34166, 2);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!kp;)V")
	public void method3012(@OriginalArg(1) Class121 arg0) {
		@Pc(17) Class121 local17 = this.aClass121Array1[this.anInt3434];
		if (arg0 != local17) {
			if (arg0 == null) {
				OpenGL.glDisable(local17.anInt8871);
			} else {
				if (local17 == null) {
					OpenGL.glEnable(arg0.anInt8871);
				} else if (arg0.anInt8871 != local17.anInt8871) {
					OpenGL.glDisable(local17.anInt8871);
					OpenGL.glEnable(arg0.anInt8871);
				}
				OpenGL.glBindTexture(arg0.anInt8871, arg0.method7332());
			}
			this.aClass121Array1[this.anInt3434] = arg0;
		}
		this.anInt3425 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!eq", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method3087(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!wc;)V")
	@Override
	public void method6233(@OriginalArg(0) Class47 arg0) {
		this.aClass47_Sub2_3.method7877(arg0);
		this.aClass47_Sub2_4.method7877(this.aClass47_Sub2_3);
		this.aClass47_Sub2_4.method3499();
		this.aClass47_Sub2_5.method3497(this.aClass47_Sub2_4);
		if (this.anInt3432 != 1) {
			this.method3035();
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(II)I")
	@Override
	public int method6176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "()Z")
	@Override
	public boolean method6155() {
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(B)V")
	public void method3013() {
		if (this.anInt3425 == 4) {
			return;
		}
		this.method3033();
		this.method3040(false);
		this.method3080(false);
		this.method3031(false);
		this.method3017(false);
		this.method3032(-2);
		this.method3087(1);
		this.anInt3425 = 4;
	}

	@OriginalMember(owner = "client!eq", name = "w", descriptor = "()Lclient!wc;")
	@Override
	public Class47 method6225() {
		return this.aClass47_Sub2_1;
	}

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "(B)V")
	private void method3014() {
		OpenGL.glViewport(this.anInt3452, this.anInt3444, this.anInt3387, this.anInt3352);
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6227(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas9) {
			throw new RuntimeException();
		} else if (!this.aHashtable8.containsKey(arg0)) {
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
			this.aHashtable8.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(Z)V")
	private void method3015() {
		Static485.aFloatArray63[3] = 1.0F;
		Static485.aFloatArray63[1] = this.aFloat114 * this.aFloat110;
		Static485.aFloatArray63[2] = this.aFloat109 * this.aFloat114;
		Static485.aFloatArray63[0] = this.aFloat114 * this.aFloat123;
		OpenGL.glLightModelfv(2899, Static485.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(Z)V")
	private void method3016() {
		if (this.aBoolean277 && this.anInt3447 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "()V")
	@Override
	public void method6178() {
		if (this.aBoolean273) {
			if (this.anInterface21_2 != this.aClass324_1) {
				throw new RuntimeException();
			}
			this.aClass324_1.method7845(0);
			this.aClass324_1.method7845(8);
			this.method3034(this.aClass324_1);
		} else if (this.aBoolean270) {
			this.aClass5_Sub2_1.method7578(0, 0, this.anInt3387, this.anInt3352, 0, 0);
			this.anOpenGL2.setSurface(this.aLong70);
		} else {
			throw new RuntimeException("");
		}
		this.anInt3387 = this.anInt3220;
		this.aClass5_Sub2_1 = null;
		this.anInt3352 = this.anInt3284;
		this.method3085();
		this.method3014();
		this.la();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!tba;[Lclient!be;Z)Lclient!da;")
	@Override
	public Class25 method6202(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class28[] arg1) {
		return new Class25_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIZ)Lclient!ac;")
	@Override
	public Class5 method6153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class5_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZ)V")
	public void method3017(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean255 != arg0) {
			this.aBoolean255 = arg0;
			this.method3028();
			this.anInt3425 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "(I)V")
	public void method3018() {
		if (this.anInt3425 == 8) {
			return;
		}
		this.method3059();
		this.method3040(true);
		this.method3031(true);
		this.method3017(true);
		this.method3087(1);
		this.anInt3425 = 8;
	}

	@OriginalMember(owner = "client!eq", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3456;
		arg0[2] = this.anInt3430;
		arg0[1] = this.anInt3450;
		arg0[3] = this.anInt3437;
	}

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)V")
	@Override
	public void method6212() {
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V")
	public synchronized void method3019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub8 local8 = new Class3_Sub8(arg1);
		local8.aLong277 = arg0;
		this.aClass276_24.method6906(local8);
	}

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "(I)V")
	private void method3020() {
		this.aFloatArray41[14] = this.aFloat120;
		this.aFloatArray41[10] = this.aFloat112;
		this.aFloat106 = this.anInt3441;
		this.aFloat119 = ((float) -this.anInt3441 + this.aFloatArray41[14]) / this.aFloatArray41[10];
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZ)Lclient!ac;")
	@Override
	public Class5 method6188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class5_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6163() {
		this.method3042();
		this.method3087(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([I)V")
	@Override
	public void method6215(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt3352;
		arg0[0] = this.anInt3387;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IJ)V")
	public synchronized void method3021(@OriginalArg(1) long arg0) {
		@Pc(11) Class3 local11 = new Class3();
		local11.aLong277 = arg0;
		this.aClass276_26.method6906(local11);
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(Z)V")
	@Override
	public void method6197(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "(II)I")
	public int method3022(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!eq", name = "A", descriptor = "()Z")
	@Override
	public boolean method6237() {
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt3423 + this.anInt3422 + this.anInt3424;
	}

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "(I)V")
	private void method3023() {
		Static485.aFloatArray63[3] = 1.0F;
		Static485.aFloatArray63[1] = this.aFloat110 * this.aFloat103;
		Static485.aFloatArray63[2] = this.aFloat109 * this.aFloat103;
		Static485.aFloatArray63[0] = this.aFloat103 * this.aFloat123;
		OpenGL.glLightfv(16384, 4609, Static485.aFloatArray63, 0);
		Static485.aFloatArray63[0] = this.aFloat123 * -this.aFloat122;
		Static485.aFloatArray63[1] = -this.aFloat122 * this.aFloat110;
		Static485.aFloatArray63[2] = this.aFloat109 * -this.aFloat122;
		Static485.aFloatArray63[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static485.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IBII)V")
	public void method3024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!id;IIII)Lclient!ka;")
	@Override
	public Class128 method6157(@OriginalArg(0) Class142 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class128_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!cd;)V")
	@Override
	public void method6160(@OriginalArg(0) Class40 arg0) {
		this.aClass74_1.method2715(this, -1, arg0);
	}

	@OriginalMember(owner = "client!eq", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt3448, this.anInt3433, this.anInt3443, this.anInt3428 };
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BIII)V")
	public void method3025(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "()Z")
	@Override
	public boolean method6218() {
		return this.aClass3_Sub21_Sub1_1 != null && (this.anInt3415 <= 1 || this.aBoolean280);
	}

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "(I)V")
	private void method3026() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL2.a()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static500.method7308(1000L);
		}
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "()V")
	@Override
	public void method6177() {
		if (this.aClass3_Sub21_Sub1_1 != null && this.aClass3_Sub21_Sub1_1.method3432()) {
			this.aClass350_1.method8146(this.aClass3_Sub21_Sub1_1);
			this.aClass189_1.method5161();
		}
	}

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "(II)V")
	public void method3027(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt3434) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt3434 = arg0;
		}
	}

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "(B)V")
	private void method3028() {
		OpenGL.glDepthMask(this.aBoolean255 && this.aBoolean257);
	}

	@OriginalMember(owner = "client!eq", name = "y", descriptor = "()Lclient!oj;")
	@Override
	public Class248 method6230() {
		@Pc(7) int local7 = -1;
		if (this.aString25.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString25.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString25.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class248(local7, "OpenGL", this.anInt3445, this.aString24, 0L);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZZ)V")
	public void method3029(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt3458 != arg0 || this.aBoolean266 != this.aBoolean269) {
			@Pc(24) Class121_Sub2 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean269 ? 3 : 0;
			if (arg0 < 0) {
				this.method3051();
			} else {
				local24 = this.aClass189_1.method5159(arg0);
				@Pc(56) Class156 local56 = super.anInterface5_11.method6869(arg0);
				if (local56.aByte68 == 0 && local56.aByte73 == 0) {
					this.method3051();
				} else {
					@Pc(77) int local77 = local56.aBoolean494 ? 64 : 128;
					@Pc(81) int local81 = local77 * 50;
					this.method3038(0.0F, (float) (local56.aByte68 * (this.anInt3418 % local81)) / (float) local81, (float) (this.anInt3418 % local81 * local56.aByte73) / (float) local81);
				}
				local26 = local56.anInt5676;
				if (!this.aBoolean269) {
					local30 = local56.anInt5678;
					local37 = local56.aByte69;
					local28 = local56.aByte72;
				}
			}
			this.aClass190_1.method5177(local28, arg2, local37, local30, arg1);
			if (!this.aClass190_1.method5176(local24, local26)) {
				this.method3012(local24);
				this.method3045(local26);
			}
			this.aBoolean266 = this.aBoolean269;
			this.anInt3458 = arg0;
		}
		this.anInt3425 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!jb;)V")
	public void method3030(@OriginalArg(1) Interface12 arg0) {
		if (arg0 != this.anInterface12_2) {
			if (this.aBoolean267) {
				OpenGL.glBindBufferARB(34963, arg0.method3817());
			}
			this.anInterface12_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static326.method5482(arg0, arg2, arg3, arg1, this);
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(IZ)V")
	public void method3031(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean252 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean252 = arg0;
		this.anInt3425 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "(II)V")
	public void method3032(@OriginalArg(1) int arg0) {
		this.method3052(arg0, true);
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(Z)V")
	@Override
	public void method6228(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "()Z")
	@Override
	public boolean method6235() {
		return this.aClass190_1.method5178();
	}

	@OriginalMember(owner = "client!eq", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3451 = arg2;
		this.anInt3438 = arg0;
		this.anInt3455 = arg1;
		this.anInt3459 = arg3;
		this.aBoolean269 = true;
	}

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "()V")
	@Override
	protected void method6224() {
		for (@Pc(6) Class3 local6 = this.aClass276_19.method6907(); local6 != null; local6 = this.aClass276_19.method6912()) {
			((Class3_Sub5_Sub1) local6).method595();
		}
		if (this.aClass350_1 != null) {
			this.aClass350_1.method8143();
		}
		if (this.anOpenGL2 != null) {
			this.method3041();
			@Pc(40) Enumeration local40 = this.aHashtable8.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable8.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean251) {
			Static577.method6361(false, true);
			this.aBoolean251 = false;
		}
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(IIIIII)Lclient!tj;")
	@Override
	public Class4 method6183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean265 ? new Class4_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!eq", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method3017(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!eq", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat114) {
			this.aFloat114 = arg0;
			this.method3015();
		}
	}

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "(I)V")
	private void method3033() {
		if (this.anInt3432 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt3387 > 0 && this.anInt3352 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt3387, (double) this.anInt3352, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt3432 = 1;
		this.anInt3425 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!qv;)V")
	public void method3034(@OriginalArg(1) Interface21 arg0) {
		if (this.aBoolean268) {
			this.method3065(arg0);
			this.method3084(arg0);
		} else if (this.anInt3419 >= 0 && this.anInterface21Array2[this.anInt3419] == arg0) {
			this.anInterface21Array2[this.anInt3419--] = null;
			arg0.method7838();
			if (this.anInt3419 >= 0) {
				this.anInterface21_1 = this.anInterface21_2 = this.anInterface21Array2[this.anInt3419];
				this.anInterface21_1.method7841();
			} else {
				this.anInterface21_1 = this.anInterface21_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(II)Lclient!pea;")
	@Override
	public Interface19 method6213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "(I)V")
	private void method3035() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass47_Sub2_4.method3500(), 0);
		if (this.aBoolean266) {
			this.aClass190_1.aClass14_Sub5_1.method4264();
		}
		this.method3007();
		this.method3011();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!tj;Lclient!tj;FLclient!tj;)Lclient!tj;")
	@Override
	public Class4 method6222(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class4 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean265 && this.aBoolean273) {
			@Pc(15) Class4_Sub1_Sub2 local15 = null;
			@Pc(18) Class4_Sub1 local18 = (Class4_Sub1) arg0;
			@Pc(21) Class4_Sub1 local21 = (Class4_Sub1) arg1;
			@Pc(25) Class121_Sub1 local25 = local18.method4632();
			@Pc(29) Class121_Sub1 local29 = local21.method4632();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local29.anInt4549 >= local25.anInt4549 ? local29.anInt4549 : local25.anInt4549;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class4_Sub1_Sub2) {
					@Pc(60) Class4_Sub1_Sub2 local60 = (Class4_Sub1_Sub2) arg3;
					if (local60.method4638() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class4_Sub1_Sub2(this, local48);
				}
				if (local15.method4640(arg2, local25, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!eq", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3430 > arg2) {
			this.anInt3430 = arg2;
		}
		if (arg3 < this.anInt3437) {
			this.anInt3437 = arg3;
		}
		if (this.anInt3456 < arg0) {
			this.anInt3456 = arg0;
		}
		if (this.anInt3450 < arg1) {
			this.anInt3450 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method3044();
		this.method3066();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6229(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6217(arg2, arg3);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILclient!jaclib/memory/Buffer;ZB)Lclient!ur;")
	public Interface27 method3036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		return (Interface27) (this.aBoolean267 ? new Class119_Sub2(this, arg0, arg2, arg1, false) : new Class66_Sub2(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!tj;)V")
	@Override
	public void method6219(@OriginalArg(0) Class4 arg0) {
		this.aClass4_Sub1_1 = (Class4_Sub1) arg0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIF)Lclient!pk;")
	@Override
	public Class3_Sub27 method6152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub27_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "(B)V")
	private void method3037() {
		this.aFloat107 = (float) (this.anInt3441 - this.anInt3442) - this.aFloat108;
		this.aFloat113 = this.aFloat107 - (float) this.anInt3447 * this.aFloat117;
		if ((float) this.anInt3446 > this.aFloat113) {
			this.aFloat113 = this.anInt3446;
		}
		OpenGL.glFogf(2915, this.aFloat113);
		OpenGL.glFogf(2916, this.aFloat107);
		Static485.aFloatArray63[1] = (float) (this.anInt3436 & 0xFF00) / 65280.0F;
		Static485.aFloatArray63[0] = (float) (this.anInt3436 & 0xFF0000) / 1.671168E7F;
		Static485.aFloatArray63[2] = (float) (this.anInt3436 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static485.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!eq", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt3387 < arg2) {
			arg2 = this.anInt3387;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt3352 < arg3) {
			arg3 = this.anInt3352;
		}
		this.anInt3450 = arg1;
		this.anInt3437 = arg3;
		this.anInt3456 = arg0;
		this.anInt3430 = arg2;
		OpenGL.glEnable(3089);
		this.method3044();
		this.method3066();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IFFF)V")
	private void method3038(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean260) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg2, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean260 = true;
	}

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "()Z")
	@Override
	public boolean method6185() {
		return this.aClass3_Sub21_Sub1_1 != null && this.aClass3_Sub21_Sub1_1.method3432();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BF)V")
	public void method3039(@OriginalArg(1) float arg0) {
		if (this.aFloat105 != arg0) {
			this.aFloat105 = arg0;
			if (this.anInt3432 == 3) {
				this.method3046();
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "()Z")
	@Override
	public boolean method6198() {
		return this.aBoolean281 && (!this.method6185() || this.aBoolean280);
	}

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "()I")
	@Override
	public int method6226() {
		return 4;
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(IZ)V")
	public void method3040(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean277) {
			this.aBoolean277 = arg0;
			this.method3016();
			this.anInt3425 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!eq", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = (float) arg0 * this.aClass47_Sub2_3.aFloat141 + this.aClass47_Sub2_3.aFloat136 * (float) arg1 + (float) arg2 * this.aClass47_Sub2_3.aFloat133 + this.aClass47_Sub2_3.aFloat139;
		if (local28 < (float) this.anInt3446 || (float) this.anInt3441 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((float) this.anInt3443 * ((float) arg0 * this.aClass47_Sub2_3.aFloat135 + this.aClass47_Sub2_3.aFloat132 * (float) arg1 + (float) arg2 * this.aClass47_Sub2_3.aFloat138 + this.aClass47_Sub2_3.aFloat142) / (float) arg3);
		@Pc(119) int local119 = (int) ((float) this.anInt3428 * (this.aClass47_Sub2_3.aFloat140 + (float) arg1 * this.aClass47_Sub2_3.aFloat137 + this.aClass47_Sub2_3.aFloat131 * (float) arg0 + this.aClass47_Sub2_3.aFloat134 * (float) arg2) / (float) arg3);
		if (this.aFloat118 <= (float) local86 && (float) local86 <= this.aFloat121 && this.aFloat104 <= (float) local119 && this.aFloat111 >= (float) local119) {
			arg4[0] = (int) ((float) local86 - this.aFloat118);
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local119 - this.aFloat104);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!mk;)V")
	@Override
	public void method6194(@OriginalArg(0) Interface16 arg0) {
	}

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method6201(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class3_Sub8 local19;
		while (!this.aClass276_21.method6908()) {
			local19 = (Class3_Sub8) this.aClass276_21.method6911();
			Static147.anIntArray192[local7++] = (int) local19.aLong277;
			this.anInt3424 -= local19.anInt706;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static147.anIntArray192, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static147.anIntArray192, 0);
			local7 = 0;
		}
		while (!this.aClass276_22.method6908()) {
			local19 = (Class3_Sub8) this.aClass276_22.method6911();
			Static147.anIntArray192[local7++] = (int) local19.aLong277;
			this.anInt3422 -= local19.anInt706;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static147.anIntArray192, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static147.anIntArray192, 0);
			local7 = 0;
		}
		while (!this.aClass276_23.method6908()) {
			local19 = (Class3_Sub8) this.aClass276_23.method6911();
			Static147.anIntArray192[local7++] = local19.anInt706;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static147.anIntArray192, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static147.anIntArray192, 0);
			local7 = 0;
		}
		while (!this.aClass276_24.method6908()) {
			local19 = (Class3_Sub8) this.aClass276_24.method6911();
			Static147.anIntArray192[local7++] = (int) local19.aLong277;
			this.anInt3423 -= local19.anInt706;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static147.anIntArray192, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static147.anIntArray192, 0);
		}
		while (!this.aClass276_20.method6908()) {
			local19 = (Class3_Sub8) this.aClass276_20.method6911();
			OpenGL.glDeleteLists((int) local19.aLong277, local19.anInt706);
		}
		@Pc(218) Class3 local218;
		while (!this.aClass276_25.method6908()) {
			local218 = this.aClass276_25.method6911();
			OpenGL.glDeleteProgramARB((int) local218.aLong277);
		}
		while (!this.aClass276_26.method6908()) {
			local218 = this.aClass276_26.method6911();
			OpenGL.glDeleteObjectARB(local218.aLong277);
		}
		while (!this.aClass276_20.method6908()) {
			local19 = (Class3_Sub8) this.aClass276_20.method6911();
			OpenGL.glDeleteLists((int) local19.aLong277, local19.anInt706);
		}
		this.aClass189_1.method5158();
		if (this.E() > 100663296 && this.bf + 60000L < Static444.method6719()) {
			System.gc();
			this.bf = Static444.method6719();
		}
		this.anInt3418 = local11;
	}

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "(B)V")
	private void method3041() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!eq", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean269 = false;
	}

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "(I)V")
	private void method3042() {
		if (this.anInt3425 == 1) {
			return;
		}
		this.method3033();
		this.method3040(false);
		this.method3080(false);
		this.method3031(false);
		this.method3017(false);
		this.method3012(null);
		this.method3032(-2);
		this.method3045(1);
		this.anInt3425 = 1;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BFF)V")
	public void method3043(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat108 = arg0;
		this.aFloat117 = arg1;
		this.method3037();
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method3042();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method3087(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean281) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean281) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!eq", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt3352 - arg1 - local12, arg2, 1, 32993, this.anInt3439, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "(B)V")
	private void method3044() {
		this.aFloat104 = this.anInt3450 - this.anInt3433;
		this.aFloat111 = this.anInt3437 - this.anInt3433;
		this.aFloat121 = this.anInt3430 - this.anInt3448;
		this.aFloat118 = this.anInt3456 - this.anInt3448;
	}

	@OriginalMember(owner = "client!eq", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt3416 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt3416++;
		}
		this.anInt3417 = 0x1 << this.anInt3416;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class274 method6206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class274_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "(II)V")
	public void method3045(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method3057(7681, 7681);
		} else if (arg0 == 0) {
			this.method3057(8448, 8448);
		} else if (arg0 == 2) {
			this.method3057(7681, 34165);
		} else if (arg0 == 3) {
			this.method3057(8448, 260);
		} else if (arg0 == 4) {
			this.method3057(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6168(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "(I)V")
	private void method3046() {
		@Pc(19) float local19 = (float) -this.anInt3448 * this.aFloat105 / (float) this.anInt3443;
		@Pc(31) float local31 = (float) -this.anInt3433 * this.aFloat105 / (float) this.anInt3428;
		@Pc(46) float local46 = (float) (this.anInt3387 - this.anInt3448) * this.aFloat105 / (float) this.anInt3443;
		@Pc(61) float local61 = (float) (this.anInt3352 - this.anInt3433) * this.aFloat105 / (float) this.anInt3428;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local19 != local46 && local31 != local61) {
			OpenGL.glOrtho((double) local19, (double) local46, (double) -local61, (double) -local31, (double) this.anInt3446, (double) this.anInt3441);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!be;Z)Lclient!ac;")
	@Override
	public Class5 method6161(@OriginalArg(0) Class28 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt618 * arg0.anInt616];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray3 == null) {
			for (local21 = 0; local21 < arg0.anInt616; local21++) {
				for (local25 = 0; local25 < arg0.anInt618; local25++) {
					@Pc(83) int local83 = arg0.anIntArray36[arg0.aByteArray2[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt616; local21++) {
				for (local25 = 0; local25 < arg0.anInt618; local25++) {
					local12[local16++] = arg0.anIntArray36[arg0.aByteArray2[local14] & 0xFF] | arg0.aByteArray3[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(119) Class5 local119 = this.method6204(arg0.anInt616, arg0.anInt618, local12, arg0.anInt618);
		local119.method7586(arg0.anInt617, arg0.anInt614, arg0.anInt619, arg0.anInt615);
		return local119;
	}

	@OriginalMember(owner = "client!eq", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt3456 || this.anInt3430 < arg0 - arg2 || this.anInt3450 > arg1 + arg2 || this.anInt3437 < arg1 - arg2) {
			return;
		}
		this.method3042();
		this.method3087(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(72) float local72 = (float) arg0 + 0.35F;
		@Pc(77) float local77 = (float) arg1 + 0.35F;
		@Pc(81) int local81 = arg2 << 1;
		if (this.aFloat116 > (float) local81) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local72 + 1.0F, local77 + 1.0F);
			OpenGL.glVertex2f(local72 + 1.0F, local77 - 1.0F);
			OpenGL.glVertex2f(local72 - 1.0F, -1.0F + local77);
			OpenGL.glVertex2f(local72 - 1.0F, local77 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local81 <= this.aFloat115) {
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
			local150 = Static51.method1165(local150);
			OpenGL.glVertex2f((float) arg2 + local72, local77);
			for (@Pc(179) int local179 = 16384 - local150; local179 > 0; local179 -= local150) {
				OpenGL.glVertex2f(local72 + (float) arg2 * Class3_Sub1_Sub12.aFloatArray51[local179], local77 + Class3_Sub1_Sub12.aFloatArray52[local179] * (float) arg2);
			}
			OpenGL.glVertex2f((float) arg2 + local72, local77);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "()V")
	@Override
	public void method6173() {
		this.aClass350_1.method8149();
	}

	@OriginalMember(owner = "client!eq", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3436 == arg0 && arg1 == this.anInt3447 && arg2 == this.anInt3442) {
			return;
		}
		this.anInt3436 = arg0;
		this.anInt3447 = arg1;
		this.anInt3442 = arg2;
		this.method3037();
		this.method3016();
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(II)V")
	@Override
	public void method6217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "(B)V")
	private void method3047() {
		if (this.anInt3432 != 3) {
			this.anInt3432 = 3;
			this.method3046();
			this.method3035();
			this.anInt3425 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "()Z")
	@Override
	public boolean method6172() {
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "(B)I")
	private int method3048() {
		this.aString25 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString24 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString25.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString25.indexOf("brian paul") != -1 || this.aString25.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(53) String local53 = OpenGL.glGetString(7938);
		@Pc(61) String[] local61 = Static107.method2685(' ', local53.replace('.', ' '));
		if (local61.length >= 2) {
			try {
				@Pc(71) int local71 = Static607.method8246(local61[0]);
				@Pc(77) int local77 = Static607.method8246(local61[1]);
				this.anInt3445 = local77 + local71 * 10;
			} catch (@Pc(86) NumberFormatException local86) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt3445 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(127) int[] local127 = new int[1];
		OpenGL.glGetIntegerv(34018, local127, 0);
		this.anInt3429 = local127[0];
		OpenGL.glGetIntegerv(34929, local127, 0);
		this.anInt3461 = local127[0];
		OpenGL.glGetIntegerv(34930, local127, 0);
		this.anInt3454 = local127[0];
		if (this.anInt3429 < 2 || this.anInt3461 < 2 || this.anInt3454 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean264 = Stream.b();
		this.aBoolean270 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean267 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean281 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean274 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean276 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean272 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean278 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean262 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean265 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean263 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean275 = false;
		this.aBoolean273 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean268 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean261 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean280 = this.aBoolean268 & this.aBoolean261;
		this.aBoolean256 = Class2_Sub3_Sub2.aString69.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static485.aFloatArray63, 0);
		this.aFloat115 = Static485.aFloatArray63[1];
		this.aFloat116 = Static485.aFloatArray63[0];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "()Z")
	@Override
	public boolean method6216() {
		if (this.aClass3_Sub21_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub21_Sub1_1.method3432()) {
			if (!this.aClass350_1.method8147(this.aClass3_Sub21_Sub1_1)) {
				return false;
			}
			this.aClass189_1.method5161();
		}
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "(I)V")
	public void method3049() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(ILclient!qv;)V")
	public void method3050(@OriginalArg(1) Interface21 arg0) {
		if (this.aBoolean268) {
			this.method3089(arg0);
			this.method3083(arg0);
		} else if (this.anInt3419 < 3) {
			if (this.anInt3419 >= 0) {
				this.anInterface21Array2[this.anInt3419].method7838();
			}
			this.anInterface21_1 = this.anInterface21_2 = this.anInterface21Array2[++this.anInt3419] = arg0;
			this.anInterface21_1.method7841();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "(I)V")
	private void method3051() {
		if (this.aBoolean260) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean260 = false;
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIZ)V")
	public void method3052(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method3029(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "(I)V")
	private void method3053() {
		@Pc(6) float[] local6 = this.aFloatArray41;
		@Pc(18) float local18 = (float) (this.anInt3446 * -this.anInt3448) / (float) this.anInt3443;
		@Pc(32) float local32 = (float) ((this.anInt3387 - this.anInt3448) * this.anInt3446) / (float) this.anInt3443;
		@Pc(43) float local43 = (float) (this.anInt3446 * this.anInt3433) / (float) this.anInt3428;
		@Pc(57) float local57 = (float) (this.anInt3446 * (this.anInt3433 - this.anInt3352)) / (float) this.anInt3428;
		if (local32 == local18 || local57 == local43) {
			local6[4] = 0.0F;
			local6[13] = 0.0F;
			local6[6] = 0.0F;
			local6[1] = 0.0F;
			local6[8] = 0.0F;
			local6[5] = 1.0F;
			local6[10] = 1.0F;
			local6[0] = 1.0F;
			local6[14] = 0.0F;
			local6[2] = 0.0F;
			local6[12] = 0.0F;
			local6[11] = 0.0F;
			local6[15] = 1.0F;
			local6[7] = 0.0F;
			local6[9] = 0.0F;
			local6[3] = 0.0F;
		} else {
			@Pc(71) float local71 = (float) this.anInt3446 * 2.0F;
			local6[9] = (local57 + local43) / (-local57 + local43);
			local6[10] = this.aFloat112 = (float) -(this.anInt3441 + this.anInt3446) / (float) (this.anInt3441 - this.anInt3446);
			local6[12] = 0.0F;
			local6[11] = -1.0F;
			local6[6] = 0.0F;
			local6[14] = this.aFloat120 = -(local71 * (float) this.anInt3441) / (float) (this.anInt3441 - this.anInt3446);
			local6[13] = 0.0F;
			local6[5] = local71 / (local43 - local57);
			local6[4] = 0.0F;
			local6[2] = 0.0F;
			local6[1] = 0.0F;
			local6[15] = 0.0F;
			local6[3] = 0.0F;
			local6[7] = 0.0F;
			local6[0] = local71 / (local32 - local18);
			local6[8] = (local32 + local18) / (local32 - local18);
		}
		this.method3020();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method3042();
		this.method3087(1);
		@Pc(30) float local30 = (float) -arg0 + (float) arg2;
		@Pc(36) float local36 = (float) arg3 - (float) arg1;
		@Pc(49) float local49 = (float) (1.0D / Math.sqrt((double) (local36 * local36 + local30 * local30)));
		@Pc(53) float local53 = local30 * local49;
		@Pc(57) float local57 = local36 * local49;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(78) int local78 = arg7 % (arg5 + arg6);
		@Pc(83) float local83 = (float) arg5 * local53;
		@Pc(88) float local88 = (float) arg5 * local57;
		@Pc(90) float local90 = 0.0F;
		@Pc(92) float local92 = 0.0F;
		@Pc(94) float local94 = local83;
		@Pc(96) float local96 = local88;
		if (local78 <= arg5) {
			local94 = local53 * (float) (arg5 - local78);
			local96 = local57 * (float) (arg5 - local78);
		} else {
			local92 = (float) (arg5 + arg6 - local78) * local57;
			local90 = local53 * (float) (arg5 + arg6 - local78);
		}
		@Pc(150) float local150 = local90 + (float) arg0 + 0.35F;
		@Pc(157) float local157 = (float) arg1 + local92 + 0.35F;
		@Pc(162) float local162 = (float) arg6 * local53;
		@Pc(167) float local167 = (float) arg6 * local57;
		while (true) {
			if (arg2 <= arg0) {
				if ((float) arg2 + 0.35F > local150) {
					break;
				}
				if (local94 + local150 < (float) arg2) {
					local94 = (float) arg2 - local150;
				}
			} else {
				if ((float) arg2 + 0.35F < local150) {
					break;
				}
				if ((float) arg2 < local150 + local94) {
					local94 = (float) arg2 - local150;
				}
			}
			if (arg3 > arg1) {
				if (local157 > (float) arg3 + 0.35F) {
					break;
				}
				if (local96 + local157 > (float) arg3) {
					local96 = (float) arg3 - local157;
				}
			} else {
				if (local157 < (float) arg3 + 0.35F) {
					break;
				}
				if (local96 + local157 < (float) arg3) {
					local96 = (float) arg3 - local157;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local150, local157);
			OpenGL.glVertex2f(local150 + local94, local157 + local96);
			local150 += local162 + local94;
			local157 += local167 + local96;
			OpenGL.glEnd();
			local96 = local88;
			local94 = local83;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([IIIIIZ)Lclient!ac;")
	@Override
	public Class5 method6193(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class5_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "(I)V")
	private void method3054() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray41, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(FIFFF)V")
	public void method3055(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static485.aFloatArray63[3] = arg2;
		Static485.aFloatArray63[0] = arg1;
		Static485.aFloatArray63[1] = arg3;
		Static485.aFloatArray63[2] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static485.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(Z)V")
	public void method3056() {
		if (this.anInt3425 == 16) {
			return;
		}
		this.method3047();
		this.method3040(true);
		this.method3031(true);
		this.method3017(true);
		this.method3087(1);
		this.anInt3425 = 16;
	}

	@OriginalMember(owner = "client!eq", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean269) {
			throw new RuntimeException("");
		}
		this.anInt3438 = arg0;
		this.anInt3459 = arg3;
		this.anInt3455 = arg1;
		this.anInt3451 = arg2;
		if (this.aBoolean266) {
			this.aClass190_1.aClass14_Sub5_1.method4264();
			this.aClass190_1.aClass14_Sub5_1.method4265();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BII)V")
	public void method3057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3434 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(7) boolean local7 = false;
		if (arg1 != this.anInt3457) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt3457 = arg1;
			local7 = true;
		}
		if (this.anInt3449 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local7 = true;
			this.anInt3449 = arg0;
		}
		if (local7) {
			this.anInt3425 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)I")
	public int method3058(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "()Z")
	@Override
	public boolean method6205() {
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)V")
	@Override
	public void method6195(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!eq", name = "w", descriptor = "(I)V")
	private void method3059() {
		if (this.anInt3432 != 2) {
			this.anInt3432 = 2;
			this.method3054();
			this.method3035();
			this.anInt3425 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6196(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aNativeHeap5 = ((Class3_Sub5_Sub1) arg0).aNativeHeap1;
		if (this.anInterface27_2 != null) {
			return;
		}
		@Pc(16) Class3_Sub15_Sub2 local16 = new Class3_Sub15_Sub2(80);
		if (this.aBoolean264) {
			local16.method8469(-1.0F);
			local16.method8469(-1.0F);
			local16.method8469(0.0F);
			local16.method8469(0.0F);
			local16.method8469(1.0F);
			local16.method8469(1.0F);
			local16.method8469(-1.0F);
			local16.method8469(0.0F);
			local16.method8469(1.0F);
			local16.method8469(1.0F);
			local16.method8469(1.0F);
			local16.method8469(1.0F);
			local16.method8469(0.0F);
			local16.method8469(1.0F);
			local16.method8469(0.0F);
			local16.method8469(-1.0F);
			local16.method8469(1.0F);
			local16.method8469(0.0F);
			local16.method8469(0.0F);
			local16.method8469(0.0F);
		} else {
			local16.method8470(-1.0F);
			local16.method8470(-1.0F);
			local16.method8470(0.0F);
			local16.method8470(0.0F);
			local16.method8470(1.0F);
			local16.method8470(1.0F);
			local16.method8470(-1.0F);
			local16.method8470(0.0F);
			local16.method8470(1.0F);
			local16.method8470(1.0F);
			local16.method8470(1.0F);
			local16.method8470(1.0F);
			local16.method8470(0.0F);
			local16.method8470(1.0F);
			local16.method8470(0.0F);
			local16.method8470(-1.0F);
			local16.method8470(1.0F);
			local16.method8470(0.0F);
			local16.method8470(0.0F);
			local16.method8470(0.0F);
		}
		this.anInterface27_2 = this.method3072(20, local16.anInt10282, local16.aByteArray106, false);
		this.aClass270_4 = new Class270(this.anInterface27_2, 5126, 3, 0);
		this.aClass270_5 = new Class270(this.anInterface27_2, 5126, 2, 12);
		this.aClass74_1.method2722(this);
	}

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "(I)Lclient!gv;")
	public Class121_Sub1 method3060() {
		return this.aClass4_Sub1_1 == null ? null : this.aClass4_Sub1_1.method4632();
	}

	@OriginalMember(owner = "client!eq", name = "y", descriptor = "(I)V")
	private void method3061() {
		this.method3032(-2);
		for (@Pc(16) int local16 = this.anInt3429 - 1; local16 >= 0; local16--) {
			this.method3027(local16);
			this.method3012(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method3057(8448, 8448);
		this.method3024(770, 34168, 2);
		this.method3051();
		this.anInt3426 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt3427 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean254 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean253 = true;
		this.method3040(true);
		this.method3080(true);
		this.method3031(true);
		this.method3017(true);
		this.method3085();
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
		this.anInt3453 = this.anInt3436 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V")
	@Override
	public void method6184(@OriginalArg(0) int arg0) {
		this.method3041();
	}

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "(I)V")
	@Override
	public void method6232(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt3412 = arg0;
		this.aClass189_1.method5161();
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
	@Override
	public void method6154(@OriginalArg(0) int arg0) {
		this.method3026();
	}

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "(I)V")
	public void method3062() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!fw;I)V")
	public void method3063(@OriginalArg(0) Class47_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method3500(), 0);
	}

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "()Z")
	@Override
	public boolean method6192() {
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "()Lclient!wc;")
	@Override
	public Class47 method6200() {
		return this.aClass47_Sub2_3;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([BIIZI)Lclient!jb;")
	public Interface12 method3064(@OriginalArg(0) byte[] arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		return (Interface12) (this.aBoolean267 && (!arg1 || this.aBoolean258) ? new Class119_Sub1(this, 5123, arg0, arg2, arg1) : new Class66_Sub1(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!eq", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass47_Sub2_3.aFloat139 + this.aClass47_Sub2_3.aFloat141 * (float) arg0 + (float) arg1 * this.aClass47_Sub2_3.aFloat136 + this.aClass47_Sub2_3.aFloat133 * (float) arg2;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg3 * this.aClass47_Sub2_3.aFloat141 + (float) arg4 * this.aClass47_Sub2_3.aFloat136 + this.aClass47_Sub2_3.aFloat133 * (float) arg5 + this.aClass47_Sub2_3.aFloat139;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt3446 && local63 < (float) this.anInt3446) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt3441 && (float) this.anInt3441 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt3443 * ((float) arg1 * this.aClass47_Sub2_3.aFloat132 + (float) arg0 * this.aClass47_Sub2_3.aFloat135 + this.aClass47_Sub2_3.aFloat138 * (float) arg2 + this.aClass47_Sub2_3.aFloat142) / local32);
		@Pc(167) int local167 = (int) ((this.aClass47_Sub2_3.aFloat142 + this.aClass47_Sub2_3.aFloat138 * (float) arg5 + (float) arg4 * this.aClass47_Sub2_3.aFloat132 + (float) arg3 * this.aClass47_Sub2_3.aFloat135) * (float) this.anInt3443 / local63);
		if (this.aFloat118 > (float) local135 && (float) local167 < this.aFloat118) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat121 && (float) local167 > this.aFloat121) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) (((float) arg2 * this.aClass47_Sub2_3.aFloat134 + this.aClass47_Sub2_3.aFloat137 * (float) arg1 + this.aClass47_Sub2_3.aFloat131 * (float) arg0 + this.aClass47_Sub2_3.aFloat140) * (float) this.anInt3428 / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt3428 * ((float) arg3 * this.aClass47_Sub2_3.aFloat131 + this.aClass47_Sub2_3.aFloat137 * (float) arg4 + (float) arg5 * this.aClass47_Sub2_3.aFloat134 + this.aClass47_Sub2_3.aFloat140) / local63);
		if ((float) local233 < this.aFloat104 && this.aFloat104 > (float) local265) {
			local7 |= 0x4;
		} else if (this.aFloat111 < (float) local233 && (float) local265 > this.aFloat111) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!eq", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt3441;
	}

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "()V")
	@Override
	public void method6181() {
		if (!this.aBoolean259 || this.anInt3387 <= 0 || this.anInt3352 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt3456;
		@Pc(19) int local19 = this.anInt3430;
		@Pc(22) int local22 = this.anInt3450;
		@Pc(25) int local25 = this.anInt3437;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3085();
		this.method3040(false);
		this.method3080(false);
		this.method3031(false);
		this.method3017(false);
		this.method3012(null);
		this.method3032(-2);
		this.method3045(1);
		this.method3087(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt3387, this.anInt3352, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!qv;I)V")
	public void method3065(@OriginalArg(0) Interface21 arg0) {
		if (this.anInt3421 < 0 || this.anInterface21Array3[this.anInt3421] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface21Array3[this.anInt3421--] = null;
		arg0.method7837();
		if (this.anInt3421 < 0) {
			this.anInterface21_1 = null;
		} else {
			this.anInterface21_1 = this.anInterface21Array3[this.anInt3421];
			this.anInterface21_1.method7840();
		}
	}

	@OriginalMember(owner = "client!eq", name = "A", descriptor = "(I)V")
	private void method3066() {
		if (this.anInt3430 >= this.anInt3456 && this.anInt3437 >= this.anInt3450) {
			OpenGL.glScissor(this.anInt3452 + this.anInt3456, this.anInt3352 + this.anInt3444 + -this.anInt3437, this.anInt3430 - this.anInt3456, this.anInt3437 - this.anInt3450);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!eq", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3042();
		this.method3087(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6159(@OriginalArg(0) Canvas arg0) {
		this.aCanvas8 = null;
		this.aLong70 = 0L;
		if (arg0 == null || this.aCanvas9 == arg0) {
			this.aLong70 = this.aLong69;
			this.aCanvas8 = this.aCanvas9;
		} else if (this.aHashtable8.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable8.get(arg0);
			this.aLong70 = local26;
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.aLong70 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong70);
		this.method3082();
	}

	@OriginalMember(owner = "client!eq", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method3042();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method3087(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean281) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean281) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[Lclient!pk;)V")
	@Override
	public void method6203(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass3_Sub27Array4[local3] = arg1[local3];
		}
		this.anInt3431 = arg0;
		if (this.anInt3432 != 1) {
			this.method3011();
		}
	}

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt3446;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)V")
	public synchronized void method3067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub8 local8 = new Class3_Sub8(arg0);
		local8.aLong277 = arg1;
		this.aClass276_21.method6906(local8);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6182(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static613.aFloat279 = arg0;
		Static146.aFloat127 = arg2;
		Static331.aFloat184 = arg1;
	}

	@OriginalMember(owner = "client!eq", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Class121_Sub2_Sub1 local9 = local6.aClass121_Sub2_Sub1_5;
		this.method3008();
		this.method3012(local6.aClass121_Sub2_Sub1_5);
		this.method3087(1);
		this.method3057(8448, 7681);
		this.method3024(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat185 / (float) local9.anInt6665;
		@Pc(46) float local46 = local9.aFloat187 / (float) local9.anInt6660;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3456 - arg2), (float) (this.anInt3450 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3456, this.anInt3450);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3456 - arg2), local46 * (float) (this.anInt3437 - arg3));
		OpenGL.glVertex2i(this.anInt3456, this.anInt3437);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3430 - arg2), local46 * (float) (this.anInt3437 - arg3));
		OpenGL.glVertex2i(this.anInt3430, this.anInt3437);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3430 - arg2), local46 * (float) (this.anInt3450 - arg3));
		OpenGL.glVertex2i(this.anInt3430, this.anInt3450);
		OpenGL.glEnd();
		this.method3024(768, 5890, 0);
	}

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "()V")
	@Override
	public void method6199() {
	}

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "(II)V")
	public synchronized void method3068(@OriginalArg(0) int arg0) {
		@Pc(17) Class3_Sub8 local17 = new Class3_Sub8(arg0);
		this.aClass276_23.method6906(local17);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BZ)V")
	public void method3069(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean279) {
			this.aBoolean279 = arg0;
			this.method3009();
		}
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(II)I")
	@Override
	public int method6220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "()Z")
	@Override
	public boolean method6186() {
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIB)V")
	public void method3070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3444 = arg1;
		this.anInt3452 = arg0;
		this.method3014();
		this.method3066();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)I")
	public int method3071(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub5 method6158(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub5_Sub1 local8 = new Class3_Sub5_Sub1(arg0);
		this.aClass276_19.method6906(local8);
		return local8;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[BZZ)Lclient!ur;")
	public Interface27 method3072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) boolean arg3) {
		return (Interface27) (this.aBoolean267 && (!arg3 || this.aBoolean258) ? new Class119_Sub2(this, arg0, arg2, arg1, arg3) : new Class66_Sub2(this, arg0, arg2, arg1));
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!qe;Lclient!qe;Lclient!qe;Lclient!qe;I)V")
	public void method3073(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class270 arg2, @OriginalArg(3) Class270 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method3079(arg1.anInterface27_6);
			OpenGL.glVertexPointer(arg1.aByte98, arg1.aShort105, this.anInterface27_3.method8094(), this.anInterface27_3.method8093() + (long) arg1.aByte99);
			OpenGL.glEnableClientState(32884);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method3079(arg0.anInterface27_6);
			OpenGL.glNormalPointer(arg0.aShort105, this.anInterface27_3.method8094(), this.anInterface27_3.method8093() + (long) arg0.aByte99);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method3079(arg2.anInterface27_6);
			OpenGL.glColorPointer(arg2.aByte98, arg2.aShort105, this.anInterface27_3.method8094(), this.anInterface27_3.method8093() + (long) arg2.aByte99);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method3079(arg3.anInterface27_6);
			OpenGL.glTexCoordPointer(arg3.aByte98, arg3.aShort105, this.anInterface27_3.method8094(), this.anInterface27_3.method8093() + (long) arg3.aByte99);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIILclient!jb;)V")
	public void method3075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Interface12 arg2) {
		@Pc(7) int local7 = arg2.method3815();
		@Pc(14) int local14 = arg1 * this.method3058(local7);
		this.method3030(arg2);
		OpenGL.glDrawElements(4, arg0, local7, arg2.method3816() + (long) local14);
	}

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "()Lclient!wc;")
	@Override
	public Class47 method6223() {
		return new Class47_Sub2();
	}

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "(B)V")
	private void method3078() {
		this.aClass121Array1 = new Class121[this.anInt3429];
		this.aClass121_Sub2_1 = new Class121_Sub2(this, 3553, 6408, 1, 1);
		new Class121_Sub2(this, 3553, 6408, 1, 1);
		new Class121_Sub2(this, 3553, 6408, 1, 1);
		this.aClass128_Sub2_3 = new Class128_Sub2(this);
		this.aClass128_Sub2_5 = new Class128_Sub2(this);
		this.aClass128_Sub2_6 = new Class128_Sub2(this);
		this.aClass128_Sub2_4 = new Class128_Sub2(this);
		this.aClass128_Sub2_2 = new Class128_Sub2(this);
		this.aClass128_Sub2_10 = new Class128_Sub2(this);
		this.aClass128_Sub2_1 = new Class128_Sub2(this);
		this.aClass128_Sub2_9 = new Class128_Sub2(this);
		this.aClass128_Sub2_8 = new Class128_Sub2(this);
		this.aClass128_Sub2_7 = new Class128_Sub2(this);
		if (this.aBoolean273) {
			this.aClass324_2 = new Class324(this);
			new Class324(this);
		}
	}

	@OriginalMember(owner = "client!eq", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3433 = arg1;
		this.anInt3443 = arg2;
		this.anInt3428 = arg3;
		this.anInt3448 = arg0;
		this.method3053();
		this.method3044();
		if (this.anInt3432 == 3) {
			this.method3046();
		} else if (this.anInt3432 == 2) {
			this.method3054();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!ur;)V")
	public void method3079(@OriginalArg(1) Interface27 arg0) {
		if (arg0 != this.anInterface27_3) {
			if (this.aBoolean267) {
				OpenGL.glBindBufferARB(34962, arg0.method8095());
			}
			this.anInterface27_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg5;
		@Pc(9) Class121_Sub2_Sub1 local9 = local6.aClass121_Sub2_Sub1_5;
		this.method3008();
		this.method3012(local6.aClass121_Sub2_Sub1_5);
		this.method3087(1);
		this.method3057(8448, 7681);
		this.method3024(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat185 / (float) local9.anInt6665;
		@Pc(46) float local46 = local9.aFloat187 / (float) local9.anInt6660;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local59 * local59)));
		@Pc(76) float local76 = local59 * local72;
		@Pc(80) float local80 = local52 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f(local80 + (float) arg2 + 0.35F, local76 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method3024(768, 5890, 0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZZ)V")
	public void method3080(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean271 != arg0) {
			this.aBoolean271 = arg0;
			this.method3009();
			this.anInt3425 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZII)V")
	public void method3081(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "(B)V")
	private void method3082() {
		if (this.aCanvas8 == null) {
			this.anInt3220 = this.anInt3284 = 0;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas8.getSize();
			this.anInt3284 = local18.height;
			this.anInt3220 = local18.width;
		}
		if (this.anInterface21_2 == null) {
			this.anInt3387 = this.anInt3220;
			this.anInt3352 = this.anInt3284;
			this.method3014();
		}
		this.method3085();
		this.la();
	}

	@OriginalMember(owner = "client!eq", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass47_Sub2_3.aFloat133 * (float) arg2 + (float) arg0 * this.aClass47_Sub2_3.aFloat141 + (float) arg1 * this.aClass47_Sub2_3.aFloat136 + this.aClass47_Sub2_3.aFloat139;
		if (local28 < (float) this.anInt3446 || local28 > (float) this.anInt3441) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt3443 * (this.aClass47_Sub2_3.aFloat142 + this.aClass47_Sub2_3.aFloat138 * (float) arg2 + this.aClass47_Sub2_3.aFloat132 * (float) arg1 + (float) arg0 * this.aClass47_Sub2_3.aFloat135) / local28);
		@Pc(117) int local117 = (int) ((this.aClass47_Sub2_3.aFloat140 + this.aClass47_Sub2_3.aFloat131 * (float) arg0 + this.aClass47_Sub2_3.aFloat137 * (float) arg1 + this.aClass47_Sub2_3.aFloat134 * (float) arg2) * (float) this.anInt3428 / local28);
		if ((float) local85 >= this.aFloat118 && this.aFloat121 >= (float) local85 && (float) local117 >= this.aFloat104 && (float) local117 <= this.aFloat111) {
			arg3[0] = (int) ((float) local85 - this.aFloat118);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat104);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "()Z")
	@Override
	public boolean method6221() {
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(19) Class1_Sub3 local19 = (Class1_Sub3) arg5;
		@Pc(22) Class121_Sub2_Sub1 local22 = local19.aClass121_Sub2_Sub1_5;
		this.method3008();
		this.method3012(local19.aClass121_Sub2_Sub1_5);
		this.method3087(1);
		this.method3057(8448, 7681);
		this.method3024(768, 34167, 0);
		@Pc(52) float local52 = local22.aFloat185 / (float) local22.anInt6665;
		@Pc(59) float local59 = local22.aFloat187 / (float) local22.anInt6660;
		@Pc(66) float local66 = (float) -arg0 + (float) arg2;
		@Pc(72) float local72 = (float) arg3 - (float) arg1;
		@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local72 * local72)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(104) float local104 = local66 * local85;
		@Pc(108) float local108 = local72 * local85;
		@Pc(114) int local114 = arg10 % (arg8 + arg9);
		@Pc(119) float local119 = (float) arg8 * local104;
		@Pc(124) float local124 = (float) arg8 * local108;
		@Pc(126) float local126 = 0.0F;
		@Pc(128) float local128 = 0.0F;
		@Pc(130) float local130 = local119;
		@Pc(132) float local132 = local124;
		if (local114 > arg8) {
			local128 = local108 * (float) (arg9 + arg8 - local114);
			local126 = (float) (arg8 + arg9 - local114) * local104;
		} else {
			local132 = (float) (arg8 - local114) * local108;
			local130 = (float) (arg8 - local114) * local104;
		}
		@Pc(179) float local179 = (float) arg0 + local126 + 0.35F;
		@Pc(186) float local186 = (float) arg1 + local128 + 0.35F;
		@Pc(191) float local191 = local104 * (float) arg9;
		@Pc(196) float local196 = local108 * (float) arg9;
		while (true) {
			if (arg2 <= arg0) {
				if ((float) arg2 + 0.35F > local179) {
					break;
				}
				if ((float) arg2 > local179 + local130) {
					local130 = (float) arg2 - local179;
				}
			} else {
				if (local179 > (float) arg2 + 0.35F) {
					break;
				}
				if (local179 + local130 > (float) arg2) {
					local130 = (float) arg2 - local179;
				}
			}
			if (arg3 > arg1) {
				if ((float) arg3 + 0.35F < local186) {
					break;
				}
				if ((float) arg3 < local186 + local132) {
					local132 = (float) arg3 - local186;
				}
			} else {
				if (local186 < (float) arg3 + 0.35F) {
					break;
				}
				if (local186 + local132 < (float) arg3) {
					local132 = (float) arg3 - local186;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local52 * (local179 - (float) arg6), local59 * (local186 - (float) arg7));
			OpenGL.glVertex2f(local179, local186);
			OpenGL.glTexCoord2f(local52 * (local130 + local179 - (float) arg6), local59 * (local132 + local186 - (float) arg7));
			OpenGL.glVertex2f(local130 + local179, local132 + local186);
			local179 += local130 + local191;
			local186 += local196 + local132;
			OpenGL.glEnd();
			local132 = local124;
			local130 = local119;
		}
		this.method3024(768, 5890, 0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZLclient!qv;)V")
	public void method3083(@OriginalArg(1) Interface21 arg0) {
		if (this.anInt3420 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3420 >= 0) {
			this.anInterface21Array1[this.anInt3420].method7839();
		}
		this.anInterface21_2 = this.anInterface21Array1[++this.anInt3420] = arg0;
		this.anInterface21_2.method7836();
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(ILclient!qv;)V")
	public void method3084(@OriginalArg(1) Interface21 arg0) {
		if (this.anInt3420 < 0 || arg0 != this.anInterface21Array1[this.anInt3420]) {
			throw new RuntimeException();
		}
		this.anInterface21Array1[this.anInt3420--] = null;
		arg0.method7839();
		if (this.anInt3420 < 0) {
			this.anInterface21_2 = null;
		} else {
			this.anInterface21_2 = this.anInterface21Array1[this.anInt3420];
			this.anInterface21_2.method7836();
		}
	}

	@OriginalMember(owner = "client!eq", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt3453;
		if (local11 || arg1 != this.aFloat103 || arg2 != this.aFloat122) {
			this.aFloat103 = arg1;
			this.aFloat122 = arg2;
			this.anInt3453 = arg0;
			if (local11) {
				this.aFloat123 = (float) (this.anInt3453 & 0xFF0000) / 1.671168E7F;
				this.aFloat110 = (float) (this.anInt3453 & 0xFF00) / 65280.0F;
				this.aFloat109 = (float) (this.anInt3453 & 0xFF) / 255.0F;
				this.method3015();
			}
			this.method3023();
		}
		if (arg3 == this.aFloatArray43[0] && arg4 == this.aFloatArray43[1] && arg5 == this.aFloatArray43[2]) {
			return;
		}
		this.aFloatArray43[0] = arg3;
		this.aFloatArray43[1] = arg4;
		this.aFloatArray43[2] = arg5;
		this.aFloatArray44[0] = -arg3;
		this.aFloatArray44[2] = -arg5;
		this.aFloatArray44[1] = -arg4;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray42[1] = local138 * arg4;
		this.aFloatArray42[0] = local138 * arg3;
		this.aFloatArray42[2] = arg5 * local138;
		this.aFloatArray40[0] = -this.aFloatArray42[0];
		this.aFloatArray40[1] = -this.aFloatArray42[1];
		this.aFloatArray40[2] = -this.aFloatArray42[2];
		this.method3007();
		this.anInt3440 = (int) (arg3 * 256.0F / arg4);
		this.anInt3435 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!eq", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eq", name = "B", descriptor = "(I)V")
	public void method3085() {
		if (this.anInt3432 != 0) {
			this.anInt3432 = 0;
			this.anInt3425 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!eq", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.aClass47_Sub2_3.aFloat133 + this.aClass47_Sub2_3.aFloat136 * (float) arg1 + (float) arg0 * this.aClass47_Sub2_3.aFloat141 + this.aClass47_Sub2_3.aFloat139;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt3443 * (this.aClass47_Sub2_3.aFloat142 + this.aClass47_Sub2_3.aFloat135 * (float) arg0 + this.aClass47_Sub2_3.aFloat132 * (float) arg1 + (float) arg2 * this.aClass47_Sub2_3.aFloat138) / local28);
		@Pc(109) int local109 = (int) (((float) arg2 * this.aClass47_Sub2_3.aFloat134 + (float) arg1 * this.aClass47_Sub2_3.aFloat137 + (float) arg0 * this.aClass47_Sub2_3.aFloat131 + this.aClass47_Sub2_3.aFloat140) * (float) this.anInt3428 / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat118);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local109 - this.aFloat104);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BLclient!fw;)V")
	public void method3086(@OriginalArg(1) Class47_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method3500(), 0);
	}

	@OriginalMember(owner = "client!eq", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3042();
		this.method3087(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "(II)V")
	public void method3087(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt3426) {
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
		if (!this.aBoolean253) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean253 = true;
		}
		if (local22 != this.aBoolean254) {
			if (local22) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean254 = local22;
		}
		if (local24 != this.anInt3427) {
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
			this.anInt3427 = local24;
		}
		this.anInt3426 = arg0;
		this.anInt3425 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!eq", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt3456 = 0;
		this.anInt3450 = 0;
		this.anInt3437 = this.anInt3352;
		this.anInt3430 = this.anInt3387;
		OpenGL.glDisable(3089);
		this.method3044();
	}

	@OriginalMember(owner = "client!eq", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt3462;
		this.anInt3462 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method6168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3042();
		this.method3087(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(22) float local22 = (float) arg3 - (float) arg1;
		if (local16 == 0.0F && local22 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(47) float local47 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local16 * local16)));
			local22 *= local47;
			local16 *= local47;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, (float) arg3 + local22 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!eq", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt3463;
		this.anInt3463 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIB)V")
	public synchronized void method3088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class3_Sub8 local20 = new Class3_Sub8(arg0);
		local20.aLong277 = arg1;
		this.aClass276_22.method6906(local20);
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6187(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas9 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable8.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable8.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable8.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(ILclient!qv;)V")
	public void method3089(@OriginalArg(1) Interface21 arg0) {
		if (this.anInt3421 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3421 >= 0) {
			this.anInterface21Array3[this.anInt3421].method7837();
		}
		this.anInterface21_1 = this.anInterface21Array3[++this.anInt3421] = arg0;
		this.anInterface21_1.method7840();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Lclient!st;")
	@Override
	public Interface25 method6169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass47_Sub2_3.aFloat133 * (float) arg2 + this.aClass47_Sub2_3.aFloat136 * (float) arg1 + this.aClass47_Sub2_3.aFloat141 * (float) arg0 + this.aClass47_Sub2_3.aFloat139;
		@Pc(55) float local55 = this.aClass47_Sub2_3.aFloat136 * (float) arg4 + (float) arg3 * this.aClass47_Sub2_3.aFloat141 + (float) arg5 * this.aClass47_Sub2_3.aFloat133 + this.aClass47_Sub2_3.aFloat139;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt3446 && local55 < (float) this.anInt3446) {
			local57 |= 0x10;
		} else if ((float) this.anInt3441 < local30 && (float) this.anInt3441 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass47_Sub2_3.aFloat135 * (float) arg0 + this.aClass47_Sub2_3.aFloat132 * (float) arg1 + (float) arg2 * this.aClass47_Sub2_3.aFloat138 + this.aClass47_Sub2_3.aFloat142) * (float) this.anInt3443 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt3443 * (this.aClass47_Sub2_3.aFloat135 * (float) arg3 + (float) arg4 * this.aClass47_Sub2_3.aFloat132 + (float) arg5 * this.aClass47_Sub2_3.aFloat138 + this.aClass47_Sub2_3.aFloat142) / (float) arg6);
		if (this.aFloat118 > (float) local124 && (float) local157 < this.aFloat118) {
			local57 |= 0x1;
		} else if ((float) local124 > this.aFloat121 && (float) local157 > this.aFloat121) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass47_Sub2_3.aFloat140 + this.aClass47_Sub2_3.aFloat134 * (float) arg2 + this.aClass47_Sub2_3.aFloat137 * (float) arg1 + (float) arg0 * this.aClass47_Sub2_3.aFloat131) * (float) this.anInt3428 / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass47_Sub2_3.aFloat140 + (float) arg4 * this.aClass47_Sub2_3.aFloat137 + (float) arg3 * this.aClass47_Sub2_3.aFloat131 + (float) arg5 * this.aClass47_Sub2_3.aFloat134) * (float) this.anInt3428 / (float) arg6);
		if ((float) local224 < this.aFloat104 && this.aFloat104 > (float) local257) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat111 && (float) local257 > this.aFloat111) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!eq", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean257 = arg0;
		this.method3028();
	}
}
