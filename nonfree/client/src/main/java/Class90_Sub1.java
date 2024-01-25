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

@OriginalClass("client!en")
public final class Class90_Sub1 extends Class90 {

	@OriginalMember(owner = "client!en", name = "N", descriptor = "I")
	public int anInt2266;

	@OriginalMember(owner = "client!en", name = "Eb", descriptor = "I")
	private int anInt2307;

	@OriginalMember(owner = "client!en", name = "jc", descriptor = "I")
	public int anInt2336;

	@OriginalMember(owner = "client!en", name = "Gc", descriptor = "I")
	private int anInt2358;

	@OriginalMember(owner = "client!en", name = "qe", descriptor = "I")
	public int anInt2434;

	@OriginalMember(owner = "client!en", name = "re", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!en", name = "Ae", descriptor = "Lclient!uk;")
	private Interface21 anInterface21_1;

	@OriginalMember(owner = "client!en", name = "Be", descriptor = "Lclient!uk;")
	private Interface21 anInterface21_2;

	@OriginalMember(owner = "client!en", name = "Ce", descriptor = "I")
	private int anInt2439;

	@OriginalMember(owner = "client!en", name = "De", descriptor = "I")
	public int anInt2440;

	@OriginalMember(owner = "client!en", name = "Ee", descriptor = "I")
	public int anInt2441;

	@OriginalMember(owner = "client!en", name = "Oe", descriptor = "Lclient!qa;")
	private Interface15 anInterface15_1;

	@OriginalMember(owner = "client!en", name = "Pe", descriptor = "Z")
	private boolean aBoolean150;

	@OriginalMember(owner = "client!en", name = "Qe", descriptor = "Z")
	public boolean aBoolean151;

	@OriginalMember(owner = "client!en", name = "Re", descriptor = "I")
	public int anInt2444;

	@OriginalMember(owner = "client!en", name = "Se", descriptor = "Lclient!jc;")
	public Class24_Sub2 aClass24_Sub2_1;

	@OriginalMember(owner = "client!en", name = "Ue", descriptor = "I")
	private int anInt2445;

	@OriginalMember(owner = "client!en", name = "We", descriptor = "Z")
	private boolean aBoolean154;

	@OriginalMember(owner = "client!en", name = "Xe", descriptor = "Lclient!pn;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "client!en", name = "Ye", descriptor = "Z")
	private boolean aBoolean155;

	@OriginalMember(owner = "client!en", name = "Ze", descriptor = "Lclient!jc;")
	public Class24_Sub2 aClass24_Sub2_2;

	@OriginalMember(owner = "client!en", name = "af", descriptor = "Lclient!im;")
	public Class93_Sub2 aClass93_Sub2_3;

	@OriginalMember(owner = "client!en", name = "gf", descriptor = "Z")
	public boolean aBoolean157;

	@OriginalMember(owner = "client!en", name = "hf", descriptor = "Lclient!pn;")
	private Interface14 anInterface14_2;

	@OriginalMember(owner = "client!en", name = "lf", descriptor = "Z")
	private boolean aBoolean158;

	@OriginalMember(owner = "client!en", name = "mf", descriptor = "I")
	public int anInt2447;

	@OriginalMember(owner = "client!en", name = "of", descriptor = "I")
	private int anInt2449;

	@OriginalMember(owner = "client!en", name = "qf", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!en", name = "sf", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!en", name = "uf", descriptor = "I")
	private int anInt2451;

	@OriginalMember(owner = "client!en", name = "vf", descriptor = "Lclient!jc;")
	public Class24_Sub2 aClass24_Sub2_3;

	@OriginalMember(owner = "client!en", name = "wf", descriptor = "Lclient!jc;")
	public Class24_Sub2 aClass24_Sub2_4;

	@OriginalMember(owner = "client!en", name = "zf", descriptor = "F")
	private float aFloat45;

	@OriginalMember(owner = "client!en", name = "Cf", descriptor = "Lclient!kca;")
	public Class166 aClass166_1;

	@OriginalMember(owner = "client!en", name = "Gf", descriptor = "Lclient!jc;")
	public Class24_Sub2 aClass24_Sub2_5;

	@OriginalMember(owner = "client!en", name = "If", descriptor = "I")
	private int anInt2456;

	@OriginalMember(owner = "client!en", name = "Jf", descriptor = "Lclient!jc;")
	public Class24_Sub2 aClass24_Sub2_6;

	@OriginalMember(owner = "client!en", name = "Kf", descriptor = "Z")
	public boolean aBoolean159;

	@OriginalMember(owner = "client!en", name = "Mf", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!en", name = "Pf", descriptor = "Z")
	private boolean aBoolean160;

	@OriginalMember(owner = "client!en", name = "Qf", descriptor = "Lclient!jc;")
	public Class24_Sub2 aClass24_Sub2_7;

	@OriginalMember(owner = "client!en", name = "Rf", descriptor = "Lclient!an;")
	private Class16_Sub1_Sub1 aClass16_Sub1_Sub1_3;

	@OriginalMember(owner = "client!en", name = "Sf", descriptor = "Z")
	private boolean aBoolean161;

	@OriginalMember(owner = "client!en", name = "Tf", descriptor = "Z")
	public boolean aBoolean162;

	@OriginalMember(owner = "client!en", name = "Uf", descriptor = "I")
	private int anInt2460;

	@OriginalMember(owner = "client!en", name = "Vf", descriptor = "Lclient!im;")
	public Class93_Sub2 aClass93_Sub2_4;

	@OriginalMember(owner = "client!en", name = "Wf", descriptor = "Z")
	private boolean aBoolean163;

	@OriginalMember(owner = "client!en", name = "Xf", descriptor = "Lclient!jc;")
	public Class24_Sub2 aClass24_Sub2_8;

	@OriginalMember(owner = "client!en", name = "Yf", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!en", name = "Zf", descriptor = "Lclient!jc;")
	public Class24_Sub2 aClass24_Sub2_9;

	@OriginalMember(owner = "client!en", name = "ag", descriptor = "I")
	private int anInt2461;

	@OriginalMember(owner = "client!en", name = "bg", descriptor = "Z")
	public boolean aBoolean164;

	@OriginalMember(owner = "client!en", name = "dg", descriptor = "Lclient!waa;")
	public Class16_Sub1 aClass16_Sub1_1;

	@OriginalMember(owner = "client!en", name = "eg", descriptor = "Lclient!jc;")
	public Class24_Sub2 aClass24_Sub2_10;

	@OriginalMember(owner = "client!en", name = "fg", descriptor = "Lclient!ufa;")
	public Class319 aClass319_1;

	@OriginalMember(owner = "client!en", name = "hg", descriptor = "Lclient!kca;")
	public Class166 aClass166_2;

	@OriginalMember(owner = "client!en", name = "ig", descriptor = "I")
	private int anInt2463;

	@OriginalMember(owner = "client!en", name = "mg", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!en", name = "ng", descriptor = "F")
	private float aFloat50;

	@OriginalMember(owner = "client!en", name = "og", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!en", name = "qg", descriptor = "I")
	private int anInt2467;

	@OriginalMember(owner = "client!en", name = "rg", descriptor = "Z")
	public boolean aBoolean165;

	@OriginalMember(owner = "client!en", name = "sg", descriptor = "I")
	public int anInt2468;

	@OriginalMember(owner = "client!en", name = "tg", descriptor = "I")
	private int anInt2469;

	@OriginalMember(owner = "client!en", name = "xg", descriptor = "Z")
	public boolean aBoolean166;

	@OriginalMember(owner = "client!en", name = "yg", descriptor = "F")
	private float aFloat55;

	@OriginalMember(owner = "client!en", name = "zg", descriptor = "I")
	private int anInt2471;

	@OriginalMember(owner = "client!en", name = "Gg", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!en", name = "Hg", descriptor = "Z")
	private boolean aBoolean168;

	@OriginalMember(owner = "client!en", name = "Lg", descriptor = "Z")
	public boolean aBoolean170;

	@OriginalMember(owner = "client!en", name = "Rg", descriptor = "I")
	private int anInt2476;

	@OriginalMember(owner = "client!en", name = "Sg", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!en", name = "Tg", descriptor = "Lclient!aba;")
	private Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!en", name = "Vg", descriptor = "F")
	private float aFloat60;

	@OriginalMember(owner = "client!en", name = "Wg", descriptor = "Z")
	private boolean aBoolean174;

	@OriginalMember(owner = "client!en", name = "Xg", descriptor = "I")
	public int anInt2478;

	@OriginalMember(owner = "client!en", name = "Yg", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!en", name = "Zg", descriptor = "Z")
	private boolean aBoolean175;

	@OriginalMember(owner = "client!en", name = "bh", descriptor = "[Lclient!it;")
	private Class16[] aClass16Array1;

	@OriginalMember(owner = "client!en", name = "ch", descriptor = "Z")
	public boolean aBoolean176;

	@OriginalMember(owner = "client!en", name = "dh", descriptor = "I")
	private int anInt2479;

	@OriginalMember(owner = "client!en", name = "fh", descriptor = "I")
	private int anInt2480;

	@OriginalMember(owner = "client!en", name = "wd", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!en", name = "Kd", descriptor = "I")
	public int anInt2410 = 128;

	@OriginalMember(owner = "client!en", name = "Wd", descriptor = "Lclient!wh;")
	private final Class345 aClass345_1 = new Class345();

	@OriginalMember(owner = "client!en", name = "le", descriptor = "Lclient!im;")
	private final Class93_Sub2 aClass93_Sub2_1 = new Class93_Sub2();

	@OriginalMember(owner = "client!en", name = "me", descriptor = "Lclient!im;")
	public final Class93_Sub2 aClass93_Sub2_2 = new Class93_Sub2();

	@OriginalMember(owner = "client!en", name = "oe", descriptor = "I")
	public int anInt2433 = 3;

	@OriginalMember(owner = "client!en", name = "se", descriptor = "I")
	public int anInt2435 = 8;

	@OriginalMember(owner = "client!en", name = "te", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!en", name = "ne", descriptor = "Lclient!su;")
	private final Class298 aClass298_48 = new Class298();

	@OriginalMember(owner = "client!en", name = "we", descriptor = "I")
	private int anInt2437 = -1;

	@OriginalMember(owner = "client!en", name = "ye", descriptor = "[Lclient!uk;")
	private final Interface21[] anInterface21Array2 = new Interface21[4];

	@OriginalMember(owner = "client!en", name = "ve", descriptor = "I")
	private int anInt2436 = -1;

	@OriginalMember(owner = "client!en", name = "ue", descriptor = "[Lclient!uk;")
	private final Interface21[] anInterface21Array1 = new Interface21[4];

	@OriginalMember(owner = "client!en", name = "xe", descriptor = "I")
	private int anInt2438 = -1;

	@OriginalMember(owner = "client!en", name = "ze", descriptor = "[Lclient!uk;")
	private final Interface21[] anInterface21Array3 = new Interface21[4];

	@OriginalMember(owner = "client!en", name = "Fe", descriptor = "Lclient!su;")
	private final Class298 aClass298_49;

	@OriginalMember(owner = "client!en", name = "Ge", descriptor = "Lclient!su;")
	private final Class298 aClass298_50;

	@OriginalMember(owner = "client!en", name = "He", descriptor = "Lclient!su;")
	private final Class298 aClass298_51;

	@OriginalMember(owner = "client!en", name = "Ie", descriptor = "Lclient!su;")
	private final Class298 aClass298_52;

	@OriginalMember(owner = "client!en", name = "Je", descriptor = "Lclient!su;")
	private final Class298 aClass298_53;

	@OriginalMember(owner = "client!en", name = "Ke", descriptor = "Lclient!su;")
	private final Class298 aClass298_54;

	@OriginalMember(owner = "client!en", name = "Le", descriptor = "Lclient!su;")
	private final Class298 aClass298_55;

	@OriginalMember(owner = "client!en", name = "df", descriptor = "F")
	private float aFloat39;

	@OriginalMember(owner = "client!en", name = "cf", descriptor = "F")
	private float aFloat38;

	@OriginalMember(owner = "client!en", name = "rf", descriptor = "[F")
	private final float[] aFloatArray12;

	@OriginalMember(owner = "client!en", name = "Ef", descriptor = "[Lclient!ld;")
	private final Class6_Sub25[] aClass6_Sub25Array1;

	@OriginalMember(owner = "client!en", name = "Df", descriptor = "[F")
	private final float[] aFloatArray13;

	@OriginalMember(owner = "client!en", name = "Nf", descriptor = "I")
	private int anInt2458;

	@OriginalMember(owner = "client!en", name = "ff", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!en", name = "tf", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!en", name = "pf", descriptor = "I")
	private int anInt2450;

	@OriginalMember(owner = "client!en", name = "jg", descriptor = "I")
	public int anInt2464;

	@OriginalMember(owner = "client!en", name = "Lf", descriptor = "I")
	public int anInt2457;

	@OriginalMember(owner = "client!en", name = "jf", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!en", name = "wg", descriptor = "I")
	public int anInt2470;

	@OriginalMember(owner = "client!en", name = "nf", descriptor = "I")
	public int anInt2448;

	@OriginalMember(owner = "client!en", name = "kg", descriptor = "I")
	public int anInt2465;

	@OriginalMember(owner = "client!en", name = "kf", descriptor = "I")
	private int anInt2446;

	@OriginalMember(owner = "client!en", name = "Cg", descriptor = "I")
	private int anInt2472;

	@OriginalMember(owner = "client!en", name = "cg", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!en", name = "Of", descriptor = "I")
	private int anInt2459;

	@OriginalMember(owner = "client!en", name = "lg", descriptor = "I")
	public int anInt2466;

	@OriginalMember(owner = "client!en", name = "Bf", descriptor = "I")
	public int anInt2455;

	@OriginalMember(owner = "client!en", name = "vg", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!en", name = "pg", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!en", name = "Eg", descriptor = "[F")
	private final float[] aFloatArray14;

	@OriginalMember(owner = "client!en", name = "Ig", descriptor = "[F")
	private final float[] aFloatArray15;

	@OriginalMember(owner = "client!en", name = "Ne", descriptor = "I")
	public int anInt2443;

	@OriginalMember(owner = "client!en", name = "ug", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!en", name = "xf", descriptor = "I")
	private int anInt2452;

	@OriginalMember(owner = "client!en", name = "Jg", descriptor = "F")
	private float aFloat57;

	@OriginalMember(owner = "client!en", name = "Ff", descriptor = "F")
	private float aFloat46;

	@OriginalMember(owner = "client!en", name = "Pg", descriptor = "F")
	private float aFloat58;

	@OriginalMember(owner = "client!en", name = "ef", descriptor = "Z")
	private boolean aBoolean156;

	@OriginalMember(owner = "client!en", name = "gg", descriptor = "I")
	private int anInt2462;

	@OriginalMember(owner = "client!en", name = "Ag", descriptor = "F")
	private float aFloat56;

	@OriginalMember(owner = "client!en", name = "Me", descriptor = "I")
	private int anInt2442;

	@OriginalMember(owner = "client!en", name = "Og", descriptor = "I")
	private int anInt2475;

	@OriginalMember(owner = "client!en", name = "yf", descriptor = "I")
	private int anInt2453;

	@OriginalMember(owner = "client!en", name = "Dg", descriptor = "I")
	public int anInt2473;

	@OriginalMember(owner = "client!en", name = "Fg", descriptor = "I")
	public int anInt2474;

	@OriginalMember(owner = "client!en", name = "Ug", descriptor = "I")
	public int anInt2477;

	@OriginalMember(owner = "client!en", name = "ah", descriptor = "[F")
	public final float[] aFloatArray16;

	@OriginalMember(owner = "client!en", name = "Hf", descriptor = "Lclient!dl;")
	public Class6_Sub12_Sub1 aClass6_Sub12_Sub1_1;

	@OriginalMember(owner = "client!en", name = "eh", descriptor = "[B")
	public final byte[] aByteArray30;

	@OriginalMember(owner = "client!en", name = "gh", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!en", name = "hh", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!en", name = "ih", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!en", name = "ke", descriptor = "I")
	public final int anInt2432;

	@OriginalMember(owner = "client!en", name = "gd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas4;

	@OriginalMember(owner = "client!en", name = "rc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!en", name = "Fb", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!en", name = "Ub", descriptor = "J")
	private final long aLong45;

	@OriginalMember(owner = "client!en", name = "Hc", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!en", name = "Af", descriptor = "I")
	public final int anInt2454;

	@OriginalMember(owner = "client!en", name = "Te", descriptor = "Z")
	public boolean aBoolean152;

	@OriginalMember(owner = "client!en", name = "bf", descriptor = "Z")
	private boolean bf;

	@OriginalMember(owner = "client!en", name = "Mg", descriptor = "Z")
	public boolean aBoolean171;

	@OriginalMember(owner = "client!en", name = "Bg", descriptor = "Z")
	public boolean aBoolean167;

	@OriginalMember(owner = "client!en", name = "Ng", descriptor = "Z")
	public boolean aBoolean172;

	@OriginalMember(owner = "client!en", name = "Kg", descriptor = "Z")
	private boolean aBoolean169;

	@OriginalMember(owner = "client!en", name = "Ve", descriptor = "Z")
	public boolean aBoolean153;

	@OriginalMember(owner = "client!en", name = "Qg", descriptor = "Z")
	private final boolean aBoolean173;

	@OriginalMember(owner = "client!en", name = "Yd", descriptor = "Lclient!jq;")
	private final Class160 aClass160_1;

	@OriginalMember(owner = "client!en", name = "pe", descriptor = "Lclient!ig;")
	public final Class142 aClass142_1;

	@OriginalMember(owner = "client!en", name = "Ud", descriptor = "Lclient!ul;")
	private final Class322 aClass322_1;

	@OriginalMember(owner = "client!en", name = "Sd", descriptor = "Lclient!rw;")
	private Class6_Sub33_Sub1 aClass6_Sub33_Sub1_1;

	@OriginalMember(owner = "client!en", name = "Jd", descriptor = "Lclient!nda;")
	private final Class215 aClass215_1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;I)V")
	public Class90_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class256();
		new Class234(16);
		this.aClass298_49 = new Class298();
		this.aClass298_50 = new Class298();
		this.aClass298_51 = new Class298();
		this.aClass298_52 = new Class298();
		this.aClass298_53 = new Class298();
		this.aClass298_54 = new Class298();
		this.aClass298_55 = new Class298();
		this.aFloat39 = 1.0F;
		this.aFloat38 = -1.0F;
		this.aFloatArray12 = new float[4];
		this.aClass6_Sub25Array1 = new Class6_Sub25[Static251.anInt4618];
		this.aFloatArray13 = new float[16];
		this.anInt2458 = -1;
		this.aFloat40 = -1.0F;
		this.aFloat44 = 1.0F;
		this.anInt2450 = 8448;
		this.anInt2464 = 0;
		this.anInt2457 = 0;
		this.aFloat41 = 1.0F;
		this.anInt2470 = 512;
		this.anInt2448 = 0;
		this.anInt2465 = 512;
		this.anInt2446 = 0;
		this.anInt2472 = 0;
		this.aFloat48 = -1.0F;
		this.anInt2459 = 0;
		this.anInt2466 = -1;
		this.anInt2455 = -1;
		this.aFloat54 = 3584.0F;
		this.aFloat52 = 1.0F;
		this.aFloatArray14 = new float[4];
		this.aFloatArray15 = new float[4];
		this.anInt2443 = 3584;
		this.aFloat53 = 3584.0F;
		this.anInt2452 = 0;
		this.aFloat57 = 3000.0F;
		this.aFloat46 = -1.0F;
		this.aFloat58 = 0.0F;
		this.aBoolean156 = true;
		this.anInt2462 = 8448;
		this.aFloat56 = 1.0F;
		this.anInt2442 = -1;
		this.anInt2475 = 0;
		this.anInt2453 = 0;
		this.anInt2473 = 0;
		this.anInt2474 = -1;
		this.anInt2477 = 50;
		this.aFloatArray16 = new float[4];
		this.aClass6_Sub12_Sub1_1 = new Class6_Sub12_Sub1(8192);
		this.aByteArray30 = new byte[16384];
		this.anIntArray188 = new int[1];
		this.anIntArray189 = new int[1];
		this.anIntArray190 = new int[1];
		this.anInt2432 = arg2;
		this.aCanvas3 = this.aCanvas4 = arg0;
		if (!Static560.method7781("jaclib")) {
			throw new RuntimeException("");
		} else if (Static560.method7781("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong46 = this.aLong45 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt2432);
				if (this.aLong45 == 0L) {
					throw new RuntimeException("");
				}
				this.method2128();
				@Pc(320) int local320 = this.method2094();
				if (local320 != 0) {
					throw new RuntimeException("");
				}
				this.anInt2454 = this.aBoolean176 ? 33639 : 5121;
				@Pc(346) int local346;
				if (this.aString17.indexOf("radeon") != -1) {
					local346 = 0;
					@Pc(348) boolean local348 = false;
					@Pc(350) boolean local350 = false;
					@Pc(359) String[] local359 = Static395.method5728(this.aString17.replace('/', ' '), ' ');
					for (@Pc(361) int local361 = 0; local361 < local359.length; local361++) {
						@Pc(367) String local367 = local359[local361];
						try {
							if (local367.length() > 0) {
								if (local367.charAt(0) == 'x' && local367.length() >= 3 && Static166.method3816(local367.substring(1, 3))) {
									local367 = local367.substring(1);
									local350 = true;
								}
								if (local367.equals("hd")) {
									local348 = true;
								} else {
									if (local367.startsWith("hd")) {
										local348 = true;
										local367 = local367.substring(2);
									}
									if (local367.length() >= 4 && Static166.method3816(local367.substring(0, 4))) {
										local346 = Static443.method6265(local367.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(434) Exception local434) {
						}
					}
					if (!local348 || local346 < 4000) {
						this.aBoolean152 = false;
					}
					if (!local350 && !local348) {
						if (local346 >= 7000 && local346 <= 7999) {
							this.bf = false;
						}
						if (local346 >= 7000 && local346 <= 9250) {
							this.aBoolean171 = false;
						}
					}
					this.aBoolean167 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean172 = true;
					this.aBoolean169 = this.bf;
				}
				if (this.aString16.indexOf("intel") != -1) {
					this.aBoolean153 = false;
				}
				this.aBoolean173 = !this.aString16.equals("s3 graphics");
				if (this.bf) {
					try {
						@Pc(520) int[] local520 = new int[1];
						OpenGL.glGenBuffersARB(1, local520, 0);
					} catch (@Pc(526) Throwable local526) {
						throw new RuntimeException("");
					}
				}
				Static477.method6609(true, false);
				this.aBoolean149 = true;
				this.aClass160_1 = new Class160(this, super.anInterface2_15);
				this.method2086();
				this.aClass142_1 = new Class142(this);
				this.aClass322_1 = new Class322(this);
				if (this.aClass322_1.method7231()) {
					this.aClass6_Sub33_Sub1_1 = new Class6_Sub33_Sub1(this);
					if (!this.aClass6_Sub33_Sub1_1.method6442()) {
						this.aClass6_Sub33_Sub1_1.method6432();
						this.aClass6_Sub33_Sub1_1 = null;
					}
				}
				this.aClass215_1 = new Class215(this);
				this.method2132();
				this.method2137();
				OpenGL.glClear(16640);
				local346 = 0;
				while (true) {
					try {
						this.anOpenGL1.swapBuffers();
						break;
					} catch (@Pc(605) Exception local605) {
						if (local346++ > 5) {
							throw new RuntimeException("");
						}
						Static183.method3079(100L);
					}
				}
				OpenGL.glClear(16384);
			} catch (@Pc(625) Throwable local625) {
				local625.printStackTrace();
				this.method7525();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class17 method7517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static425.method5986(arg0, arg1, this, arg2, arg3);
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
	private void method2059() {
		if (this.aFloat50 == 0.0F) {
			this.aFloatArray13[10] = this.aFloat55;
			this.aFloatArray13[14] = this.aFloat45;
		} else {
			@Pc(17) float local17 = this.aFloat57 / (this.aFloat57 + this.aFloat50);
			@Pc(21) float local21 = local17 * local17;
			@Pc(37) float local37 = (1.0F - local17) * (-local17 + 1.0F) * -this.aFloat45 / this.aFloat50;
			this.aFloatArray13[10] = local37 + this.aFloat55;
			this.aFloatArray13[14] = local21 * this.aFloat45;
		}
		this.aFloat53 = ((float) -this.anInt2443 + this.aFloatArray13[14]) / this.aFloatArray13[10];
		this.aFloat54 = (float) this.anInt2443 - this.aFloat50;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7457(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static580.aFloat212 = arg0;
		Static488.aFloat210 = arg2;
		Static514.aFloat182 = arg1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!hn;IIII)Lclient!ba;")
	@Override
	public Class24 method7464(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class24_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7460(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7508();
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "(I)V")
	private void method2060() {
		OpenGL.glViewport(this.anInt2446, this.anInt2452, this.anInt2336, this.anInt2266);
	}

	@OriginalMember(owner = "client!en", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class17_Sub1 local6 = (Class17_Sub1) arg1;
		@Pc(9) Class16_Sub1_Sub1 local9 = local6.aClass16_Sub1_Sub1_1;
		this.method2130();
		this.method2126(local6.aClass16_Sub1_Sub1_1);
		this.method2090(1);
		this.method2120(8448, 7681);
		this.method2119(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat15 / (float) local9.anInt356;
		@Pc(46) float local46 = local9.aFloat16 / (float) local9.anInt355;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2453 - arg2), local46 * (float) (this.anInt2459 - arg3));
		OpenGL.glVertex2i(this.anInt2453, this.anInt2459);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2453 - arg2), local46 * (float) (this.anInt2472 - arg3));
		OpenGL.glVertex2i(this.anInt2453, this.anInt2472);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2475 - arg2), (float) (this.anInt2472 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2475, this.anInt2472);
		OpenGL.glTexCoord2f((float) (this.anInt2475 - arg2) * local39, local46 * (float) (this.anInt2459 - arg3));
		OpenGL.glVertex2i(this.anInt2475, this.anInt2459);
		OpenGL.glEnd();
		this.method2119(0, 768, 5890);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III)V")
	public synchronized void method2061(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class6_Sub14 local12 = new Class6_Sub14(arg1);
		local12.aLong245 = arg0;
		this.aClass298_53.method6812(local12);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(FFFI)V")
	private void method2063(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean163) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean163 = true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7492(@OriginalArg(0) Class93 arg0) {
		this.aClass93_Sub2_4 = (Class93_Sub2) arg0;
		this.aClass93_Sub2_3.method3567(this.aClass93_Sub2_4);
		if (this.anInt2449 != 1) {
			this.method2096();
		}
	}

	@OriginalMember(owner = "client!en", name = "z", descriptor = "()Z")
	@Override
	public boolean method7513() {
		return false;
	}

	@OriginalMember(owner = "client!en", name = "m", descriptor = "()V")
	@Override
	public void method7488() {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([BIIZI)Lclient!qa;")
	public Interface15 method2065(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface15) (this.bf && (!arg2 || this.aBoolean169) ? new Class91_Sub1(this, 5123, arg0, arg1, arg2) : new Class135_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!kca;BLclient!kca;Lclient!kca;Lclient!kca;)V")
	public void method2066(@OriginalArg(0) Class166 arg0, @OriginalArg(2) Class166 arg1, @OriginalArg(3) Class166 arg2, @OriginalArg(4) Class166 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method2079(arg0.anInterface14_4);
			OpenGL.glVertexPointer(arg0.aByte55, arg0.aShort72, this.anInterface14_2.method7308(), this.anInterface14_2.method7307() + (long) arg0.aByte54);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method2079(arg3.anInterface14_4);
			OpenGL.glNormalPointer(arg3.aShort72, this.anInterface14_2.method7308(), this.anInterface14_2.method7307() + (long) arg3.aByte54);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method2079(arg2.anInterface14_4);
			OpenGL.glColorPointer(arg2.aByte55, arg2.aShort72, this.anInterface14_2.method7308(), this.anInterface14_2.method7307() + (long) arg2.aByte54);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method2079(arg1.anInterface14_4);
			OpenGL.glTexCoordPointer(arg1.aByte55, arg1.aShort72, this.anInterface14_2.method7308(), this.anInterface14_2.method7307() + (long) arg1.aByte54);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
	public void method2067() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray16, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray15, 0);
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V")
	@Override
	public void method7491(@OriginalArg(0) int arg0) {
		this.method2128();
	}

	@OriginalMember(owner = "client!en", name = "j", descriptor = "(I)Lclient!wg;")
	public Class16_Sub4 method2068() {
		return this.aClass3_Sub1_1 == null ? null : this.aClass3_Sub1_1.method5662();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IB)V")
	public void method2069(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt2445) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt2445 = arg0;
		}
	}

	@OriginalMember(owner = "client!en", name = "j", descriptor = "()Z")
	@Override
	public boolean method7480() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "()V")
	@Override
	public void method7475() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[Lclient!ld;)V")
	@Override
	public void method7448(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub25[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass6_Sub25Array1[local3] = arg1[local3];
		}
		this.anInt2476 = arg0;
		if (this.anInt2449 != 1) {
			this.method2136();
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method7449(@OriginalArg(0) Class6_Sub2 arg0) {
		this.aNativeHeap2 = ((Class6_Sub2_Sub2) arg0).aNativeHeap3;
		if (this.anInterface14_1 != null) {
			return;
		}
		@Pc(16) Class6_Sub12_Sub1 local16 = new Class6_Sub12_Sub1(80);
		if (this.aBoolean176) {
			local16.method1604(-1.0F);
			local16.method1604(-1.0F);
			local16.method1604(0.0F);
			local16.method1604(0.0F);
			local16.method1604(1.0F);
			local16.method1604(1.0F);
			local16.method1604(-1.0F);
			local16.method1604(0.0F);
			local16.method1604(1.0F);
			local16.method1604(1.0F);
			local16.method1604(1.0F);
			local16.method1604(1.0F);
			local16.method1604(0.0F);
			local16.method1604(1.0F);
			local16.method1604(0.0F);
			local16.method1604(-1.0F);
			local16.method1604(1.0F);
			local16.method1604(0.0F);
			local16.method1604(0.0F);
			local16.method1604(0.0F);
		} else {
			local16.method1602(-1.0F);
			local16.method1602(-1.0F);
			local16.method1602(0.0F);
			local16.method1602(0.0F);
			local16.method1602(1.0F);
			local16.method1602(1.0F);
			local16.method1602(-1.0F);
			local16.method1602(0.0F);
			local16.method1602(1.0F);
			local16.method1602(1.0F);
			local16.method1602(1.0F);
			local16.method1602(1.0F);
			local16.method1602(0.0F);
			local16.method1602(1.0F);
			local16.method1602(0.0F);
			local16.method1602(-1.0F);
			local16.method1602(1.0F);
			local16.method1602(0.0F);
			local16.method1602(0.0F);
			local16.method1602(0.0F);
		}
		this.anInterface14_1 = this.method2108(local16.aByteArray97, false, 20, local16.anInt7556);
		this.aClass166_2 = new Class166(this.anInterface14_1, 5126, 3, 0);
		this.aClass166_1 = new Class166(this.anInterface14_1, 5126, 2, 12);
		this.aClass345_1.method7856(this);
	}

	@OriginalMember(owner = "client!en", name = "C", descriptor = "(IIIIII)V")
	@Override
	public void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method2093();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method2090(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean174) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean174) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZZZ)V")
	public void method2070(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt2461 != arg0) {
			if (arg0 < 0) {
				this.method2103();
				this.method2126(null);
				this.method2123(0);
				if (!this.aBoolean164) {
					this.aClass215_1.method5195(arg1, arg2, 0, 0, 0);
				}
			} else {
				@Pc(50) Class16_Sub1 local50 = this.aClass160_1.method3926(arg0);
				@Pc(56) Class115 local56 = super.anInterface2_15.method3085(arg0);
				if (local56.aByte36 == 0 && local56.aByte35 == 0) {
					this.method2103();
				} else {
					@Pc(72) int local72 = local56.aBoolean233 ? 64 : 128;
					@Pc(76) int local76 = local72 * 50;
					this.method2063((float) (this.anInt2434 % local76 * local56.aByte36) / (float) local76, (float) (local56.aByte35 * (this.anInt2434 % local76)) / (float) local76, 0.0F);
				}
				if (this.aBoolean164) {
					this.method2126(local50);
					this.method2123(local56.anInt2984);
				} else {
					this.aClass215_1.method5195(arg1, arg2, local56.aByte34, local56.anInt2987, local56.aByte39);
					if (!this.aClass215_1.method5196(local56.anInt2984, local50)) {
						this.method2126(local50);
						this.method2123(local56.anInt2984);
					}
				}
			}
			this.anInt2461 = arg0;
		}
		this.anInt2460 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!en", name = "k", descriptor = "(I)V")
	public void method2071() {
		if (this.anInt2449 != 0) {
			this.anInt2460 &= 0xFFFFFFE0;
			this.anInt2449 = 0;
		}
	}

	@OriginalMember(owner = "client!en", name = "l", descriptor = "(I)V")
	private void method2072() {
		if (this.anInt2449 != 2) {
			this.anInt2449 = 2;
			this.method2143();
			this.method2096();
			this.anInt2460 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIII)Lclient!ka;")
	@Override
	public Class3 method7456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean165 ? new Class3_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)V")
	public void method2073(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean175) {
			this.aBoolean175 = arg0;
			this.method2131();
		}
	}

	@OriginalMember(owner = "client!en", name = "X", descriptor = "(III)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt2474 && this.anInt2455 == arg1 && arg2 == this.anInt2457) {
			return;
		}
		this.anInt2455 = arg1;
		this.anInt2474 = arg0;
		this.anInt2457 = arg2;
		if (this.aBoolean164) {
			return;
		}
		this.method2089();
		this.method2098();
	}

	@OriginalMember(owner = "client!en", name = "q", descriptor = "()Z")
	@Override
	public boolean method7498() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "m", descriptor = "(I)V")
	private void method2074() {
		if (this.anInt2449 != 3) {
			this.anInt2449 = 3;
			this.method2117();
			this.method2096();
			this.anInt2460 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(B)V")
	public void method2075() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(II)I")
	public int method2076(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!ka;Lclient!ka;FLclient!ka;)Lclient!ka;")
	@Override
	public Class3 method7503(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean165 && this.aBoolean153) {
			@Pc(15) Class3_Sub1_Sub1 local15 = null;
			@Pc(18) Class3_Sub1 local18 = (Class3_Sub1) arg0;
			@Pc(21) Class3_Sub1 local21 = (Class3_Sub1) arg1;
			@Pc(25) Class16_Sub4 local25 = local18.method5662();
			@Pc(29) Class16_Sub4 local29 = local21.method5662();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt9867 < local25.anInt9867 ? local25.anInt9867 : local29.anInt9867;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class3_Sub1_Sub1) {
					@Pc(56) Class3_Sub1_Sub1 local56 = (Class3_Sub1_Sub1) arg3;
					if (local56.method4400() == local44) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class3_Sub1_Sub1(this, local44);
				}
				if (local15.method4402(local25, local29, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!en", name = "n", descriptor = "(I)V")
	private void method2077() {
		@Pc(6) float[] local6 = this.aFloatArray13;
		@Pc(18) float local18 = (float) (-this.anInt2473 * this.anInt2477) / (float) this.anInt2465;
		@Pc(39) float local39 = (float) (this.anInt2477 * (this.anInt2336 - this.anInt2473)) / (float) this.anInt2465;
		@Pc(50) float local50 = (float) (this.anInt2477 * this.anInt2448) / (float) this.anInt2470;
		@Pc(65) float local65 = (float) (this.anInt2477 * (this.anInt2448 - this.anInt2266)) / (float) this.anInt2470;
		if (local39 == local18 || local50 == local65) {
			local6[15] = 1.0F;
			local6[1] = 0.0F;
			local6[11] = 0.0F;
			local6[5] = 1.0F;
			local6[0] = 1.0F;
			local6[2] = 0.0F;
			local6[7] = 0.0F;
			local6[9] = 0.0F;
			local6[14] = 0.0F;
			local6[10] = 1.0F;
			local6[6] = 0.0F;
			local6[4] = 0.0F;
			local6[12] = 0.0F;
			local6[3] = 0.0F;
			local6[13] = 0.0F;
			local6[8] = 0.0F;
		} else {
			@Pc(79) float local79 = (float) this.anInt2477 * 2.0F;
			local6[9] = (local50 + local65) / (-local65 + local50);
			local6[1] = 0.0F;
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[2] = 0.0F;
			local6[5] = local79 / (local50 - local65);
			local6[6] = 0.0F;
			local6[14] = this.aFloat45 = -((float) this.anInt2443 * local79) / (float) (this.anInt2443 - this.anInt2477);
			local6[0] = local79 / (local39 - local18);
			local6[10] = this.aFloat55 = (float) -(this.anInt2443 + this.anInt2477) / (float) (this.anInt2443 - this.anInt2477);
			local6[15] = 0.0F;
			local6[7] = 0.0F;
			local6[12] = 0.0F;
			local6[13] = 0.0F;
			local6[11] = -1.0F;
			local6[8] = (local18 + local39) / (local39 - local18);
		}
		this.method2059();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!uk;I)V")
	public void method2078(@OriginalArg(0) Interface21 arg0) {
		if (this.anInt2437 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2437 >= 0) {
			this.anInterface21Array1[this.anInt2437].method7187();
		}
		this.anInterface21_2 = this.anInterface21Array1[++this.anInt2437] = arg0;
		this.anInterface21_2.method7189();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!pn;I)V")
	public void method2079(@OriginalArg(0) Interface14 arg0) {
		if (arg0 != this.anInterface14_2) {
			if (this.bf) {
				OpenGL.glBindBufferARB(34962, arg0.method7309());
			}
			this.anInterface14_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!en", name = "u", descriptor = "()Z")
	@Override
	public boolean method7502() {
		return this.aClass215_1.method5197();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)I")
	@Override
	public int method7461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7484(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZ)I")
	public int method2080(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([Lclient!ba;Lclient!hfa;Lclient!q;[Lclient!rc;I)V")
	@Override
	public void method7524(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class60_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method7476(arg0, arg2, arg3, arg4);
		this.method7511(arg1);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(IIII)V")
	public void method2081(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!en", name = "aa", descriptor = "()I")
	@Override
	public int aa() {
		@Pc(6) int local6 = this.anInt2480;
		this.anInt2480 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZZI)V")
	public void method2082(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		this.method2070(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method7520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class17 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class17_Sub1 local6 = (Class17_Sub1) arg5;
		@Pc(9) Class16_Sub1_Sub1 local9 = local6.aClass16_Sub1_Sub1_1;
		this.method2130();
		this.method2126(local6.aClass16_Sub1_Sub1_1);
		this.method2090(1);
		this.method2120(8448, 7681);
		this.method2119(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat15 / (float) local9.anInt356;
		@Pc(46) float local46 = local9.aFloat16 / (float) local9.anInt355;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(60) float local60 = (float) -arg1 + (float) arg3;
		@Pc(73) float local73 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local60 * local60)));
		@Pc(77) float local77 = local60 * local73;
		@Pc(81) float local81 = local53 * local73;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local81 + 0.35F, local77 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method2119(0, 768, 5890);
	}

	@OriginalMember(owner = "client!en", name = "A", descriptor = "()V")
	@Override
	public void method7514() {
		if (this.aClass6_Sub33_Sub1_1 != null && this.aClass6_Sub33_Sub1_1.method6440()) {
			this.aClass322_1.method7236(this.aClass6_Sub33_Sub1_1);
			this.aClass160_1.method3927();
		}
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "()V")
	@Override
	public void method7469() {
		if (!this.aBoolean173 || this.anInt2336 <= 0 || this.anInt2266 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2453;
		@Pc(22) int local22 = this.anInt2475;
		@Pc(25) int local25 = this.anInt2459;
		@Pc(28) int local28 = this.anInt2472;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method2071();
		this.method2100(false);
		this.method2099(false);
		this.method2101(false);
		this.method2127(false);
		this.method2126(null);
		this.method2111(-2);
		this.method2123(1);
		this.method2090(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt2336, this.anInt2266, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7472(@OriginalArg(0) Canvas arg0) {
		this.aCanvas3 = null;
		this.aLong46 = 0L;
		if (arg0 == null || arg0 == this.aCanvas4) {
			this.aLong46 = this.aLong45;
			this.aCanvas3 = this.aCanvas4;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable1.get(arg0);
			this.aLong46 = local36;
			this.aCanvas3 = arg0;
		}
		if (this.aCanvas3 == null || this.aLong46 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong46);
		this.method2137();
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "()Z")
	@Override
	public boolean method7466() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "(IIIII)V")
	@Override
	protected void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt2453 || this.anInt2475 < arg0 - arg2 || arg2 + arg1 < this.anInt2459 || arg1 - arg2 > this.anInt2472) {
			return;
		}
		this.method2093();
		this.method2090(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(71) float local71 = (float) arg0 + 0.35F;
		@Pc(76) float local76 = (float) arg1 + 0.35F;
		@Pc(80) int local80 = arg2 << 1;
		if (this.aFloat46 > (float) local80) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local71 + 1.0F, local76 + 1.0F);
			OpenGL.glVertex2f(local71 + 1.0F, -1.0F + local76);
			OpenGL.glVertex2f(local71 - 1.0F, -1.0F + local76);
			OpenGL.glVertex2f(local71 - 1.0F, local76 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat38 >= (float) local80) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local80);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local71, local76);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local71, local76);
			@Pc(149) int local149 = 262144 / (arg2 * 6);
			if (local149 <= 64) {
				local149 = 64;
			} else if (local149 > 512) {
				local149 = 512;
			}
			local149 = Static118.method7958(local149);
			OpenGL.glVertex2f((float) arg2 + local71, local76);
			for (@Pc(178) int local178 = 16384 - local149; local178 > 0; local178 -= local149) {
				OpenGL.glVertex2f((float) arg2 * Class6_Sub45.aFloatArray68[local178] + local71, local76 + (float) arg2 * Class6_Sub45.aFloatArray69[local178]);
			}
			OpenGL.glVertex2f((float) arg2 + local71, local76);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!en", name = "v", descriptor = "()I")
	@Override
	public int v() {
		return this.anInt2440 + this.anInt2441 + this.anInt2439;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(II)V")
	public void method2083(@OriginalArg(0) int arg0) {
		Static184.aFloatArray27[3] = (float) (arg0 >>> 24) / 255.0F;
		Static184.aFloatArray27[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static184.aFloatArray27[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static184.aFloatArray27[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static184.aFloatArray27, 0);
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(II)I")
	public int method2084(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class71 method7453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class71_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!en", name = "w", descriptor = "()Z")
	@Override
	public boolean method7504() {
		return false;
	}

	@OriginalMember(owner = "client!en", name = "o", descriptor = "(I)V")
	public void method2085() {
		if (this.anInt2460 == 16) {
			return;
		}
		this.method2074();
		this.method2100(true);
		this.method2101(true);
		this.method2127(true);
		this.method2090(1);
		this.anInt2460 = 16;
	}

	@OriginalMember(owner = "client!en", name = "l", descriptor = "()Z")
	@Override
	public boolean method7485() {
		return this.aClass6_Sub33_Sub1_1 != null && (this.anInt2432 <= 1 || this.aBoolean158);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	@Override
	public void method7468(@OriginalArg(0) int arg0) {
		this.method2125();
	}

	@OriginalMember(owner = "client!en", name = "r", descriptor = "()Z")
	@Override
	public boolean method7499() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "F", descriptor = "()V")
	@Override
	public void F() {
		this.anInt2453 = 0;
		this.anInt2475 = this.anInt2336;
		this.anInt2459 = 0;
		this.anInt2472 = this.anInt2266;
		OpenGL.glDisable(3089);
		this.method2138();
	}

	@OriginalMember(owner = "client!en", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		@Pc(6) int local6 = this.anInt2479;
		this.anInt2479 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!mj;[Lclient!kq;Z)Lclient!ta;")
	@Override
	public Class82 method7523(@OriginalArg(0) Class202 arg0, @OriginalArg(1) Class177[] arg1) {
		return new Class82_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!en", name = "p", descriptor = "(I)V")
	private void method2086() {
		this.aClass93_Sub2_4 = new Class93_Sub2();
		this.aClass93_Sub2_3 = new Class93_Sub2();
		this.aClass16Array1 = new Class16[this.anInt2468];
		this.aClass16_Sub1_1 = new Class16_Sub1(this, 3553, 6408, 1, 1);
		new Class16_Sub1(this, 3553, 6408, 1, 1);
		new Class16_Sub1(this, 3553, 6408, 1, 1);
		this.aClass24_Sub2_4 = new Class24_Sub2(this);
		this.aClass24_Sub2_3 = new Class24_Sub2(this);
		this.aClass24_Sub2_2 = new Class24_Sub2(this);
		this.aClass24_Sub2_10 = new Class24_Sub2(this);
		this.aClass24_Sub2_1 = new Class24_Sub2(this);
		this.aClass24_Sub2_8 = new Class24_Sub2(this);
		this.aClass24_Sub2_5 = new Class24_Sub2(this);
		this.aClass24_Sub2_7 = new Class24_Sub2(this);
		this.aClass24_Sub2_9 = new Class24_Sub2(this);
		this.aClass24_Sub2_6 = new Class24_Sub2(this);
		if (this.aBoolean153) {
			this.aClass319_1 = new Class319(this);
			new Class319(this);
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V")
	@Override
	public void method7483(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!en", name = "q", descriptor = "(I)V")
	public void method2087() {
		if (this.anInt2460 == 4) {
			return;
		}
		this.method2118();
		this.method2100(false);
		this.method2099(false);
		this.method2101(false);
		this.method2127(false);
		this.method2111(-2);
		this.method2090(1);
		this.anInt2460 = 4;
	}

	@OriginalMember(owner = "client!en", name = "na", descriptor = "(III[I)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass93_Sub2_4.aFloat105 * (float) arg2 + this.aClass93_Sub2_4.aFloat94 * (float) arg0 + (float) arg1 * this.aClass93_Sub2_4.aFloat103 + this.aClass93_Sub2_4.aFloat100;
		if (local28 < (float) this.anInt2477 || (float) this.anInt2443 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass93_Sub2_4.aFloat96 + (float) arg0 * this.aClass93_Sub2_4.aFloat98 + this.aClass93_Sub2_4.aFloat95 * (float) arg1 + this.aClass93_Sub2_4.aFloat102 * (float) arg2) * (float) this.anInt2465 / local28);
		@Pc(117) int local117 = (int) ((this.aClass93_Sub2_4.aFloat104 + this.aClass93_Sub2_4.aFloat101 * (float) arg1 + (float) arg0 * this.aClass93_Sub2_4.aFloat99 + (float) arg2 * this.aClass93_Sub2_4.aFloat97) * (float) this.anInt2470 / local28);
		if (this.aFloat59 <= (float) local85 && this.aFloat42 >= (float) local85 && (float) local117 >= this.aFloat51 && (float) local117 <= this.aFloat43) {
			arg3[1] = (int) ((float) local117 - this.aFloat51);
			arg3[0] = (int) ((float) local85 - this.aFloat59);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!en", name = "y", descriptor = "()V")
	@Override
	public void method7508() throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!en", name = "r", descriptor = "(I)V")
	private void method2088() {
		OpenGL.glDepthMask(this.aBoolean155 && this.aBoolean156);
	}

	@OriginalMember(owner = "client!en", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt2458 != arg0;
		if (local11 || arg1 != this.aFloat48 || this.aFloat40 != arg2) {
			this.aFloat48 = arg1;
			this.anInt2458 = arg0;
			this.aFloat40 = arg2;
			if (local11) {
				this.aFloat52 = (float) (this.anInt2458 & 0xFF0000) / 1.671168E7F;
				this.aFloat41 = (float) (this.anInt2458 & 0xFF00) / 65280.0F;
				this.aFloat44 = (float) (this.anInt2458 & 0xFF) / 255.0F;
				this.method2105();
			}
			this.method2097();
		}
		if (this.aFloatArray12[0] == arg3 && arg4 == this.aFloatArray12[1] && this.aFloatArray12[2] == arg5) {
			return;
		}
		this.aFloatArray12[2] = arg5;
		this.aFloatArray12[0] = arg3;
		this.aFloatArray12[1] = arg4;
		this.aFloatArray14[0] = -arg3;
		this.aFloatArray14[1] = -arg4;
		this.aFloatArray14[2] = -arg5;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray16[2] = local138 * arg5;
		this.aFloatArray16[0] = local138 * arg3;
		this.aFloatArray16[1] = arg4 * local138;
		this.aFloatArray15[1] = -this.aFloatArray16[1];
		this.aFloatArray15[0] = -this.aFloatArray16[0];
		this.aFloatArray15[2] = -this.aFloatArray16[2];
		this.method2067();
		this.anInt2444 = (int) (arg5 * 256.0F / arg4);
		this.anInt2478 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!en", name = "o", descriptor = "()Z")
	@Override
	public boolean method7496() {
		return this.aClass6_Sub33_Sub1_1 != null && this.aClass6_Sub33_Sub1_1.method6440();
	}

	@OriginalMember(owner = "client!en", name = "k", descriptor = "()V")
	@Override
	public void k() {
		this.aBoolean164 = false;
		this.aClass215_1.method5195(false, false, 0, 0, 0);
		this.method2089();
		this.method2098();
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(B)V")
	private void method2089() {
		@Pc(54) int local54;
		if (this.aBoolean164) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local54 = this.anInt2442;
		} else {
			this.aFloat60 = (float) (this.anInt2443 - this.anInt2457) - this.aFloat58;
			this.aFloat47 = this.aFloat60 - this.aFloat56 * (float) this.anInt2455;
			if (this.aFloat47 < (float) this.anInt2477) {
				this.aFloat47 = this.anInt2477;
			}
			OpenGL.glFogf(2915, this.aFloat47);
			OpenGL.glFogf(2916, this.aFloat60);
			local54 = this.anInt2474;
		}
		Static184.aFloatArray27[0] = (float) (local54 & 0xFF0000) / 1.671168E7F;
		Static184.aFloatArray27[1] = (float) (local54 & 0xFF00) / 65280.0F;
		Static184.aFloatArray27[2] = (float) (local54 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static184.aFloatArray27, 0);
		if (this.aBoolean164) {
			this.aClass215_1.aClass8_Sub1_1.method129();
		}
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(II)V")
	public void method2090(@OriginalArg(0) int arg0) {
		if (this.anInt2456 == arg0) {
			return;
		}
		@Pc(23) boolean local23;
		@Pc(25) byte local25;
		if (arg0 == 1) {
			local23 = true;
			local25 = 1;
		} else if (arg0 == 2) {
			local23 = false;
			local25 = 2;
		} else if (arg0 == 128) {
			local23 = true;
			local25 = 3;
		} else {
			local25 = 0;
			local23 = false;
		}
		if (!this.aBoolean168) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean168 = true;
		}
		if (local23 != this.aBoolean161) {
			if (local23) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean161 = local23;
		}
		if (local25 != this.anInt2471) {
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
			this.anInt2471 = local25;
		}
		this.anInt2460 &= 0xFFFFFFE3;
		this.anInt2456 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!qa;Z)V")
	public void method2091(@OriginalArg(0) Interface15 arg0) {
		if (arg0 != this.anInterface15_1) {
			if (this.bf) {
				OpenGL.glBindBufferARB(34963, arg0.method3359());
			}
			this.anInterface15_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!en", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return this.anInt2443;
	}

	@OriginalMember(owner = "client!en", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.method2090(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!en", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass93_Sub2_4.aFloat100 + (float) arg0 * this.aClass93_Sub2_4.aFloat94 + this.aClass93_Sub2_4.aFloat103 * (float) arg1 + (float) arg2 * this.aClass93_Sub2_4.aFloat105;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass93_Sub2_4.aFloat100 + (float) arg3 * this.aClass93_Sub2_4.aFloat94 + (float) arg4 * this.aClass93_Sub2_4.aFloat103 + this.aClass93_Sub2_4.aFloat105 * (float) arg5;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt2477 && (float) this.anInt2477 > local59 || !(!(local28 > (float) this.anInt2443) || !((float) this.anInt2443 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt2465 * (this.aClass93_Sub2_4.aFloat96 + (float) arg1 * this.aClass93_Sub2_4.aFloat95 + this.aClass93_Sub2_4.aFloat98 * (float) arg0 + (float) arg2 * this.aClass93_Sub2_4.aFloat102) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt2465 * (this.aClass93_Sub2_4.aFloat102 * (float) arg5 + this.aClass93_Sub2_4.aFloat98 * (float) arg3 + this.aClass93_Sub2_4.aFloat95 * (float) arg4 + this.aClass93_Sub2_4.aFloat96) / local59);
		if ((float) local123 < this.aFloat59 && this.aFloat59 > (float) local155 || (float) local123 > this.aFloat42 && (float) local155 > this.aFloat42) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt2470 * (this.aClass93_Sub2_4.aFloat104 + (float) arg1 * this.aClass93_Sub2_4.aFloat101 + this.aClass93_Sub2_4.aFloat99 * (float) arg0 + this.aClass93_Sub2_4.aFloat97 * (float) arg2) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt2470 * (this.aClass93_Sub2_4.aFloat97 * (float) arg5 + this.aClass93_Sub2_4.aFloat101 * (float) arg4 + (float) arg3 * this.aClass93_Sub2_4.aFloat99 + this.aClass93_Sub2_4.aFloat104) / local59);
			return (!((float) local213 < this.aFloat51) || !((float) local245 < this.aFloat51)) && (!((float) local213 > this.aFloat43) || !(this.aFloat43 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(B)V")
	public void method2092() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(B)V")
	private void method2093() {
		if (this.anInt2460 == 1) {
			return;
		}
		this.method2118();
		this.method2100(false);
		this.method2099(false);
		this.method2101(false);
		this.method2127(false);
		this.method2126(null);
		this.method2111(-2);
		this.method2123(1);
		this.anInt2460 = 1;
	}

	@OriginalMember(owner = "client!en", name = "JA", descriptor = "(I)V")
	@Override
	public void JA(@OriginalArg(0) int arg0) {
		this.anInt2433 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt2433++;
		}
		this.anInt2435 = 0x1 << this.anInt2433;
	}

	@OriginalMember(owner = "client!en", name = "p", descriptor = "()Z")
	@Override
	public boolean method7497() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass322_1.method7230(arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(B)I")
	private int method2094() {
		@Pc(5) int local5 = 0;
		this.aString16 = OpenGL.glGetString(7936).toLowerCase();
		this.aString17 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString16.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString16.indexOf("brian paul") != -1 || this.aString16.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(56) String[] local56 = Static395.method5728(local46.replace('.', ' '), ' ');
		if (local56.length >= 2) {
			try {
				@Pc(68) int local68 = Static443.method6265(local56[0]);
				@Pc(74) int local74 = Static443.method6265(local56[1]);
				this.anInt2463 = local74 + local68 * 10;
			} catch (@Pc(83) NumberFormatException local83) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt2463 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(122) int[] local122 = new int[1];
		OpenGL.glGetIntegerv(34018, local122, 0);
		this.anInt2468 = local122[0];
		OpenGL.glGetIntegerv(34929, local122, 0);
		this.anInt2467 = local122[0];
		OpenGL.glGetIntegerv(34930, local122, 0);
		this.anInt2451 = local122[0];
		if (this.anInt2468 < 2 || this.anInt2467 < 2 || this.anInt2451 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean176 = Stream.a();
		this.anOpenGL1.arePbuffersAvailable();
		this.bf = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean174 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean151 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean166 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean162 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean171 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean167 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean165 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean152 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean159 = false;
		this.aBoolean153 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean157 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean170 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean158 = this.aBoolean170 & this.aBoolean157;
		OpenGL.glGetFloatv(2834, Static184.aFloatArray27, 0);
		this.aFloat38 = Static184.aFloatArray27[1];
		this.aFloat46 = Static184.aFloatArray27[0];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!en", name = "sa", descriptor = "(II)V")
	@Override
	public void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2477 == arg0 && arg1 == this.anInt2443) {
			return;
		}
		this.anInt2443 = arg1;
		this.anInt2477 = arg0;
		this.method2077();
		this.method2089();
		if (this.anInt2449 == 3) {
			this.method2117();
		} else if (this.anInt2449 == 2) {
			this.method2143();
			return;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!im;B)V")
	public void method2095(@OriginalArg(0) Class93_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method3568(), 0);
	}

	@OriginalMember(owner = "client!en", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2466 = arg2;
		this.anInt2447 = arg0;
		this.anInt2464 = arg3;
		this.anInt2442 = arg1;
		this.aBoolean164 = true;
		this.aClass215_1.method5195(false, false, 3, 0, 0);
		this.aClass215_1.aClass8_Sub1_1.method128();
		this.method2089();
		this.method2098();
	}

	@OriginalMember(owner = "client!en", name = "s", descriptor = "(I)V")
	private void method2096() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass93_Sub2_4.method3568(), 0);
		if (this.aBoolean164) {
			this.aClass215_1.aClass8_Sub1_1.method128();
		}
		this.method2067();
		this.method2136();
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2093();
		this.method2090(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(22) float local22 = (float) arg3 - (float) arg1;
		@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local16 * local16)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(54) float local54 = local22 * local35;
		@Pc(58) float local58 = local16 * local35;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local58 + (float) arg2 + 0.35F, (float) arg3 + 0.35F + local54);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(II)I")
	@Override
	public int method7505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!en", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(57) float local57;
		if (this.aClass16_Sub1_Sub1_3 == null || this.aClass16_Sub1_Sub1_3.anInt345 < arg2 || arg3 > this.aClass16_Sub1_Sub1_3.anInt350) {
			this.aClass16_Sub1_Sub1_3 = Static238.method3727(arg2, arg6, arg3, this);
			this.aClass16_Sub1_Sub1_3.method303(false, false);
			local45 = this.aClass16_Sub1_Sub1_3.aFloat16;
			local57 = this.aClass16_Sub1_Sub1_3.aFloat15;
		} else {
			this.aClass16_Sub1_Sub1_3.method299(arg2, arg6, false, arg3, 6406);
			local45 = (float) arg3 * this.aClass16_Sub1_Sub1_3.aFloat16 / (float) this.aClass16_Sub1_Sub1_3.anInt350;
			local57 = (float) arg2 * this.aClass16_Sub1_Sub1_3.aFloat15 / (float) this.aClass16_Sub1_Sub1_3.anInt345;
		}
		this.method2130();
		this.method2126(this.aClass16_Sub1_Sub1_3);
		this.method2090(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2083(arg5);
		this.method2120(34165, 34165);
		this.method2119(0, 768, 34166);
		this.method2119(2, 770, 5890);
		this.method2133(0, 34166);
		this.method2133(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
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
		this.method2119(0, 768, 5890);
		this.method2119(2, 770, 34166);
		this.method2133(0, 5890);
		this.method2133(2, 34166);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!rc;I)V")
	@Override
	public void method7476(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class60_Sub6[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method7393(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "t", descriptor = "(I)V")
	private void method2097() {
		Static184.aFloatArray27[2] = this.aFloat48 * this.aFloat44;
		Static184.aFloatArray27[0] = this.aFloat52 * this.aFloat48;
		Static184.aFloatArray27[1] = this.aFloat48 * this.aFloat41;
		Static184.aFloatArray27[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static184.aFloatArray27, 0);
		Static184.aFloatArray27[3] = 1.0F;
		Static184.aFloatArray27[0] = this.aFloat52 * -this.aFloat40;
		Static184.aFloatArray27[1] = -this.aFloat40 * this.aFloat41;
		Static184.aFloatArray27[2] = -this.aFloat40 * this.aFloat44;
		OpenGL.glLightfv(16385, 4609, Static184.aFloatArray27, 0);
	}

	@OriginalMember(owner = "client!en", name = "ka", descriptor = "(FF)V")
	@Override
	public void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat57 && this.aFloat50 == arg1) {
			return;
		}
		this.aFloat57 = arg0;
		this.aFloat50 = arg1;
		this.method2059();
		if (this.anInt2449 == 3) {
			this.method2117();
		} else if (this.anInt2449 == 2) {
			this.method2143();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "()Lclient!fea;")
	@Override
	public Class102 method7450() {
		@Pc(7) int local7 = -1;
		if (this.aString16.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString16.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString16.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class102(local7, "OpenGL", this.anInt2463, this.aString17, 0L);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!hfa;)V")
	@Override
	public void method7511(@OriginalArg(0) Class127 arg0) {
		this.aClass345_1.method7852(arg0, this);
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(Z)V")
	private void method2098() {
		if (this.aBoolean150 && this.anInt2455 >= 0 | this.aBoolean164) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(ZI)V")
	public void method2099(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean154 != arg0) {
			this.aBoolean154 = arg0;
			this.method2131();
			this.anInt2460 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!en", name = "t", descriptor = "()V")
	@Override
	public void method7501() {
		this.aClass322_1.method7228();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZB)V")
	public void method2100(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean150) {
			this.aBoolean150 = arg0;
			this.method2098();
			this.anInt2460 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZZ)V")
	public void method2101(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean160 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt2460 &= 0xFFFFFFE0;
		this.aBoolean160 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "ya", descriptor = "(IIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2093();
		this.method2090(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!en", name = "ca", descriptor = "(IIII)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt2336 < arg2) {
			arg2 = this.anInt2336;
		}
		if (arg3 > this.anInt2266) {
			arg3 = this.anInt2266;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt2453 = arg0;
		this.anInt2472 = arg3;
		this.anInt2459 = arg1;
		this.anInt2475 = arg2;
		OpenGL.glEnable(3089);
		this.method2138();
		this.method2141();
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(IIIII)V")
	@Override
	public void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2093();
		this.method2090(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Lclient!uk;I)V")
	public void method2102(@OriginalArg(0) Interface21 arg0) {
		if (this.anInt2436 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2436 >= 0) {
			this.anInterface21Array2[this.anInt2436].method7185();
		}
		this.anInterface21_1 = this.anInterface21Array2[++this.anInt2436] = arg0;
		this.anInterface21_1.method7188();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!kq;Z)Lclient!xa;")
	@Override
	public Class71 method7522(@OriginalArg(0) Class177 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt4884 * arg0.anInt4887];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray67 == null) {
			for (local21 = 0; local21 < arg0.anInt4884; local21++) {
				for (local25 = 0; local25 < arg0.anInt4887; local25++) {
					@Pc(38) int local38 = arg0.anIntArray399[arg0.aByteArray66[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt4884; local21++) {
				for (local25 = 0; local25 < arg0.anInt4887; local25++) {
					local12[local16++] = arg0.aByteArray67[local14] << 24 | arg0.anIntArray399[arg0.aByteArray66[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(119) Class71 local119 = this.method7471(local12, arg0.anInt4887, arg0.anInt4887, arg0.anInt4884);
		local119.EA(arg0.anInt4886, arg0.anInt4885, arg0.anInt4889, arg0.anInt4888);
		return local119;
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "(B)V")
	private void method2103() {
		if (this.aBoolean163) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean163 = false;
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(III)V")
	public synchronized void method2104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class6_Sub14 local13 = new Class6_Sub14(arg1);
		local13.aLong245 = arg0;
		this.aClass298_51.method6812(local13);
	}

	@OriginalMember(owner = "client!en", name = "i", descriptor = "(B)V")
	private void method2105() {
		Static184.aFloatArray27[3] = 1.0F;
		Static184.aFloatArray27[0] = this.aFloat49 * this.aFloat52;
		Static184.aFloatArray27[1] = this.aFloat49 * this.aFloat41;
		Static184.aFloatArray27[2] = this.aFloat49 * this.aFloat44;
		OpenGL.glLightModelfv(2899, Static184.aFloatArray27, 0);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(FFB)V")
	public void method2106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat58 = arg0;
		this.aFloat56 = arg1;
		if (!this.aBoolean164) {
			this.method2089();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!uk;B)V")
	public void method2107(@OriginalArg(0) Interface21 arg0) {
		if (this.aBoolean157) {
			this.method2142(arg0);
			this.method2121(arg0);
		} else if (this.anInt2438 >= 0 && arg0 == this.anInterface21Array3[this.anInt2438]) {
			this.anInterface21Array3[this.anInt2438--] = null;
			arg0.method7184();
			if (this.anInt2438 >= 0) {
				this.anInterface21_2 = this.anInterface21_1 = this.anInterface21Array3[this.anInt2438];
				this.anInterface21_2.method7186();
			} else {
				this.anInterface21_2 = this.anInterface21_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([BZIBI)Lclient!pn;")
	public Interface14 method2108(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return (Interface14) (this.bf && (!arg1 || this.aBoolean169) ? new Class91_Sub2(this, arg2, arg0, arg3, arg1) : new Class135_Sub2(this, arg2, arg0, arg3));
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "()Z")
	@Override
	public boolean method7474() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!im;Z)V")
	public void method2109(@OriginalArg(0) Class93_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method3568(), 0);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(JI)V")
	public synchronized void method2110(@OriginalArg(0) long arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong245 = arg0;
		this.aClass298_55.method6812(local7);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BI)V")
	public void method2111(@OriginalArg(1) int arg0) {
		this.method2082(true, arg0);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BF)V")
	public void method2112(@OriginalArg(1) float arg0) {
		if (this.aFloat39 == arg0) {
			return;
		}
		this.aFloat39 = arg0;
		if (this.anInt2449 == 3) {
			this.method2117();
			return;
		}
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(II)V")
	public synchronized void method2114(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub14 local8 = new Class6_Sub14(arg0);
		this.aClass298_52.method6812(local8);
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "(II)V")
	public synchronized void method2115(@OriginalArg(1) int arg0) {
		@Pc(13) Class6 local13 = new Class6();
		local13.aLong245 = arg0;
		this.aClass298_54.method6812(local13);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZIILclient!jaclib/memory/Buffer;)Lclient!pn;")
	public Interface14 method2116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Buffer arg2) {
		return (Interface14) (this.bf ? new Class91_Sub2(this, arg1, arg2, arg0, false) : new Class135_Sub2(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!en", name = "u", descriptor = "(I)V")
	private void method2117() {
		@Pc(15) float local15 = (float) -this.anInt2473 * this.aFloat39 / (float) this.anInt2465;
		@Pc(27) float local27 = this.aFloat39 * (float) -this.anInt2448 / (float) this.anInt2470;
		@Pc(42) float local42 = this.aFloat39 * (float) (this.anInt2336 - this.anInt2473) / (float) this.anInt2465;
		@Pc(56) float local56 = this.aFloat39 * (float) (this.anInt2266 - this.anInt2448) / (float) this.anInt2470;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local56 != local27) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local56, (double) -local27, (double) ((float) this.anInt2477 - this.aFloat50), (double) ((float) this.anInt2443 - this.aFloat50));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7486(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class6_Sub14 local19;
		while (!this.aClass298_50.method6813()) {
			local19 = (Class6_Sub14) this.aClass298_50.method6811();
			Static456.anIntArray568[local11++] = (int) local19.aLong245;
			this.anInt2441 -= local19.anInt2188;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static456.anIntArray568, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static456.anIntArray568, 0);
			local11 = 0;
		}
		while (!this.aClass298_51.method6813()) {
			local19 = (Class6_Sub14) this.aClass298_51.method6811();
			Static456.anIntArray568[local11++] = (int) local19.aLong245;
			this.anInt2440 -= local19.anInt2188;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static456.anIntArray568, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static456.anIntArray568, 0);
			local11 = 0;
		}
		while (!this.aClass298_52.method6813()) {
			local19 = (Class6_Sub14) this.aClass298_52.method6811();
			Static456.anIntArray568[local11++] = local19.anInt2188;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static456.anIntArray568, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static456.anIntArray568, 0);
			local11 = 0;
		}
		while (!this.aClass298_53.method6813()) {
			local19 = (Class6_Sub14) this.aClass298_53.method6811();
			Static456.anIntArray568[local11++] = (int) local19.aLong245;
			this.anInt2439 -= local19.anInt2188;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static456.anIntArray568, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static456.anIntArray568, 0);
		}
		while (!this.aClass298_49.method6813()) {
			local19 = (Class6_Sub14) this.aClass298_49.method6811();
			OpenGL.glDeleteLists((int) local19.aLong245, local19.anInt2188);
		}
		@Pc(210) Class6 local210;
		while (!this.aClass298_54.method6813()) {
			local210 = this.aClass298_54.method6811();
			OpenGL.glDeleteProgramARB((int) local210.aLong245);
		}
		while (!this.aClass298_55.method6813()) {
			local210 = this.aClass298_55.method6811();
			OpenGL.glDeleteObjectARB(local210.aLong245);
		}
		while (!this.aClass298_49.method6813()) {
			local19 = (Class6_Sub14) this.aClass298_49.method6811();
			OpenGL.glDeleteLists((int) local19.aLong245, local19.anInt2188);
		}
		this.aClass160_1.method3930();
		if (this.v() > 100663296 && this.aLong47 + 60000L < Static416.method5922()) {
			System.gc();
			this.aLong47 = Static416.method5922();
		}
		this.anInt2434 = local9;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!ba;Lclient!hfa;Lclient!q;Lclient!rc;I)V")
	@Override
	public void method7470(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class60_Sub6 arg3, @OriginalArg(4) int arg4) {
		arg0.method7393(arg2, arg3, arg4);
		this.method7511(arg1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Lclient!i;")
	@Override
	public Class6_Sub2 method7451(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub2 local8 = new Class6_Sub2_Sub2(arg0);
		this.aClass298_48.method6812(local8);
		return local8;
	}

	@OriginalMember(owner = "client!en", name = "A", descriptor = "([I)V")
	@Override
	public void A(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt2472;
		arg0[1] = this.anInt2459;
		arg0[2] = this.anInt2475;
		arg0[0] = this.anInt2453;
	}

	@OriginalMember(owner = "client!en", name = "m", descriptor = "(IIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2465 = arg2;
		this.anInt2470 = arg3;
		this.anInt2448 = arg1;
		this.anInt2473 = arg0;
		this.method2077();
		this.method2138();
		if (this.anInt2449 == 3) {
			this.method2117();
		} else if (this.anInt2449 == 2) {
			this.method2143();
			return;
		}
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V")
	@Override
	public void method7510(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt2410 = arg0;
		this.aClass160_1.method3927();
	}

	@OriginalMember(owner = "client!en", name = "LA", descriptor = "(IIII)V")
	@Override
	public void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean164) {
			throw new RuntimeException("");
		}
		this.anInt2466 = arg2;
		this.anInt2442 = arg1;
		this.anInt2464 = arg3;
		this.anInt2447 = arg0;
		this.aClass215_1.aClass8_Sub1_1.method128();
		this.method2089();
	}

	@OriginalMember(owner = "client!en", name = "v", descriptor = "(I)V")
	private void method2118() {
		if (this.anInt2449 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt2336 > 0 && this.anInt2266 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt2336, (double) this.anInt2266, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt2460 &= 0xFFFFFFE7;
		this.anInt2449 = 1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBII)V")
	public void method2119(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZII)V")
	public void method2120(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2445 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(21) boolean local21 = false;
		if (this.anInt2450 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt2450 = arg1;
			local21 = true;
		}
		if (this.anInt2462 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local21 = true;
			this.anInt2462 = arg0;
		}
		if (local21) {
			this.anInt2460 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(Lclient!uk;I)V")
	public void method2121(@OriginalArg(0) Interface21 arg0) {
		if (this.anInt2436 < 0 || this.anInterface21Array2[this.anInt2436] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface21Array2[this.anInt2436--] = null;
		arg0.method7185();
		if (this.anInt2436 >= 0) {
			this.anInterface21_1 = this.anInterface21Array2[this.anInt2436];
			this.anInterface21_1.method7188();
		} else {
			this.anInterface21_1 = null;
		}
	}

	@OriginalMember(owner = "client!en", name = "ha", descriptor = "(F)V")
	@Override
	public void ha(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat49) {
			this.aFloat49 = arg0;
			this.method2105();
		}
	}

	@OriginalMember(owner = "client!en", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt2266 - arg1 - local12, arg2, 1, 32993, this.anInt2454, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(Z)V")
	public void method2122() {
		if (this.anInt2460 == 8) {
			return;
		}
		this.method2072();
		this.method2100(true);
		this.method2101(true);
		this.method2127(true);
		this.method2090(1);
		this.anInt2460 = 8;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIF)Lclient!ld;")
	@Override
	public Class6_Sub25 method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub25_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class46 method7477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class46_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "()I")
	@Override
	public int method7458() {
		return 4;
	}

	@OriginalMember(owner = "client!en", name = "i", descriptor = "(II)V")
	public void method2123(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method2120(7681, 7681);
		} else if (arg0 == 0) {
			this.method2120(8448, 8448);
		} else if (arg0 == 2) {
			this.method2120(7681, 34165);
		} else if (arg0 == 3) {
			this.method2120(8448, 260);
		} else if (arg0 == 4) {
			this.method2120(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!en", name = "s", descriptor = "()F")
	public float method2124() {
		return this.aFloat50;
	}

	@OriginalMember(owner = "client!en", name = "j", descriptor = "(B)V")
	private void method2125() {
		this.anOpenGL1.b();
	}

	@OriginalMember(owner = "client!en", name = "C", descriptor = "()V")
	@Override
	public void method7521() {
		this.method2127(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLclient!it;)V")
	public void method2126(@OriginalArg(1) Class16 arg0) {
		@Pc(11) Class16 local11 = this.aClass16Array1[this.anInt2445];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt9862);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt9862);
				} else if (local11.anInt9862 != arg0.anInt9862) {
					OpenGL.glDisable(local11.anInt9862);
					OpenGL.glEnable(arg0.anInt9862);
				}
				OpenGL.glBindTexture(arg0.anInt9862, arg0.method7841());
			}
			this.aClass16Array1[this.anInt2445] = arg0;
		}
		this.anInt2460 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(ZB)V")
	public void method2127(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean155) {
			this.aBoolean155 = arg0;
			this.method2088();
			this.anInt2460 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7512() {
		this.method2093();
		this.method2090(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!en", name = "w", descriptor = "(I)V")
	private void method2128() {
		@Pc(14) int local14 = 0;
		while (!this.anOpenGL1.a()) {
			if (local14++ > 5) {
				throw new RuntimeException("");
			}
			Static183.method3079(1000L);
		}
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(III)V")
	public synchronized void method2129(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class6_Sub14 local12 = new Class6_Sub14(arg1);
		local12.aLong245 = arg0;
		this.aClass298_50.method6812(local12);
	}

	@OriginalMember(owner = "client!en", name = "x", descriptor = "(I)V")
	public void method2130() {
		if (this.anInt2460 == 2) {
			return;
		}
		this.method2118();
		this.method2100(false);
		this.method2099(false);
		this.method2101(false);
		this.method2127(false);
		this.method2111(-2);
		this.anInt2460 = 2;
	}

	@OriginalMember(owner = "client!en", name = "y", descriptor = "(I)V")
	private void method2131() {
		if (this.aBoolean154 && !this.aBoolean175) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!en", name = "z", descriptor = "(I)V")
	private void method2132() {
		this.method2111(-2);
		for (@Pc(14) int local14 = this.anInt2468 - 1; local14 >= 0; local14--) {
			this.method2069(local14);
			this.method2126(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method2120(8448, 8448);
		this.method2119(2, 770, 34168);
		this.method2103();
		this.anInt2456 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt2471 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean161 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean168 = true;
		this.method2100(true);
		this.method2099(true);
		this.method2101(true);
		this.method2127(true);
		this.method2071();
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
		this.anInt2458 = this.anInt2474 = -1;
		this.F();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZI)V")
	public void method2133(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class71 method7471(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class71_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!ka;)V")
	@Override
	public void method7454(@OriginalArg(0) Class3 arg0) {
		this.aClass3_Sub1_1 = (Class3_Sub1) arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(FFFBF)V")
	public void method2134(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static184.aFloatArray27[2] = arg2;
		Static184.aFloatArray27[3] = arg3;
		Static184.aFloatArray27[1] = arg1;
		Static184.aFloatArray27[0] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static184.aFloatArray27, 0);
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "()Lclient!q;")
	@Override
	public Class93 method7455() {
		return this.aClass93_Sub2_1;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7487(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas4 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!en", name = "i", descriptor = "()Z")
	@Override
	public boolean method7479() {
		if (this.aClass6_Sub33_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass6_Sub33_Sub1_1.method6440()) {
			if (!this.aClass322_1.method7229(this.aClass6_Sub33_Sub1_1)) {
				return false;
			}
			this.aClass160_1.method3927();
		}
		return true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIB)V")
	public void method2135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2446 = arg1;
		this.anInt2452 = arg0;
		this.method2060();
		this.method2141();
	}

	@OriginalMember(owner = "client!en", name = "A", descriptor = "(I)V")
	private void method2136() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt2476; local7++) {
			@Pc(22) Class6_Sub25 local22 = this.aClass6_Sub25Array1[local7];
			Static513.aFloatArray74[0] = local22.method6405();
			@Pc(33) int local33 = local7 + 16386;
			Static513.aFloatArray74[1] = local22.method6402();
			Static513.aFloatArray74[2] = local22.method6400();
			Static513.aFloatArray74[3] = 1.0F;
			OpenGL.glLightfv(local33, 4611, Static513.aFloatArray74, 0);
			@Pc(60) int local60 = local22.method6409(true);
			@Pc(66) float local66 = local22.method6407() / 255.0F;
			Static513.aFloatArray74[2] = local66 * (float) (local60 & 0xFF);
			Static513.aFloatArray74[1] = (float) (local60 >> 8 & 0xFF) * local66;
			Static513.aFloatArray74[0] = (float) (local60 >> 16 & 0xFF) * local66;
			OpenGL.glLightfv(local33, 4609, Static513.aFloatArray74, 0);
			OpenGL.glLightf(local33, 4617, 1.0F / (float) (local22.method6398() * local22.method6398()));
			OpenGL.glEnable(local33);
		}
		while (local7 < this.anInt2469) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt2469 = this.anInt2476;
	}

	@OriginalMember(owner = "client!en", name = "B", descriptor = "(I)V")
	private void method2137() {
		if (this.aCanvas3 == null) {
			this.anInt2307 = this.anInt2358 = 0;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas3.getSize();
			this.anInt2358 = local18.height;
			this.anInt2307 = local18.width;
		}
		if (this.anInterface21_1 == null) {
			this.anInt2336 = this.anInt2307;
			this.anInt2266 = this.anInt2358;
			this.method2060();
		}
		this.method2071();
		this.F();
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)V")
	@Override
	public void method7489(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!en", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > this.anInt2453) {
			this.anInt2453 = arg0;
		}
		if (this.anInt2472 > arg3) {
			this.anInt2472 = arg3;
		}
		if (this.anInt2459 < arg1) {
			this.anInt2459 = arg1;
		}
		if (this.anInt2475 > arg2) {
			this.anInt2475 = arg2;
		}
		OpenGL.glEnable(3089);
		this.method2138();
		this.method2141();
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method2093();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method2090(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean174) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean174) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)V")
	@Override
	public void method7478(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!en", name = "C", descriptor = "(I)V")
	private void method2138() {
		this.aFloat43 = this.anInt2472 - this.anInt2448;
		this.aFloat59 = this.anInt2453 - this.anInt2473;
		this.aFloat42 = this.anInt2475 - this.anInt2473;
		this.aFloat51 = this.anInt2459 - this.anInt2448;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!uk;Z)V")
	public void method2139(@OriginalArg(0) Interface21 arg0) {
		if (this.aBoolean157) {
			this.method2078(arg0);
			this.method2102(arg0);
		} else if (this.anInt2438 < 3) {
			if (this.anInt2438 >= 0) {
				this.anInterface21Array3[this.anInt2438].method7184();
			}
			this.anInterface21_2 = this.anInterface21_1 = this.anInterface21Array3[++this.anInt2438] = arg0;
			this.anInterface21_2.method7186();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7507(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!en", name = "E", descriptor = "()F")
	public float method2140() {
		return this.aFloat57;
	}

	@OriginalMember(owner = "client!en", name = "B", descriptor = "()Lclient!q;")
	@Override
	public Class93 method7518() {
		return new Class93_Sub2();
	}

	@OriginalMember(owner = "client!en", name = "x", descriptor = "()Z")
	@Override
	public boolean method7506() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7526(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas4 == arg0) {
			local5 = this.aLong45;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable1.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas3 == arg0) {
			this.method2137();
		}
	}

	@OriginalMember(owner = "client!en", name = "D", descriptor = "()V")
	@Override
	protected void method7525() {
		for (@Pc(6) Class6 local6 = this.aClass298_48.method6809(); local6 != null; local6 = this.aClass298_48.method6821()) {
			((Class6_Sub2_Sub2) local6).method2367();
		}
		if (this.aClass322_1 != null) {
			this.aClass322_1.method7234();
		}
		if (this.anOpenGL1 != null) {
			this.method2125();
			@Pc(40) Enumeration local40 = this.aHashtable1.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable1.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean149) {
			Static477.method6611(true, false);
			this.aBoolean149 = false;
		}
	}

	@OriginalMember(owner = "client!en", name = "E", descriptor = "(I)V")
	private void method2141() {
		if (this.anInt2475 >= this.anInt2453 && this.anInt2459 <= this.anInt2472) {
			OpenGL.glScissor(this.anInt2453 + this.anInt2446, -this.anInt2472 + this.anInt2266 + this.anInt2452, this.anInt2475 - this.anInt2453, this.anInt2472 + -this.anInt2459);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLclient!uk;)V")
	public void method2142(@OriginalArg(1) Interface21 arg0) {
		if (this.anInt2437 < 0 || this.anInterface21Array1[this.anInt2437] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface21Array1[this.anInt2437--] = null;
		arg0.method7187();
		if (this.anInt2437 < 0) {
			this.anInterface21_2 = null;
		} else {
			this.anInterface21_2 = this.anInterface21Array1[this.anInt2437];
			this.anInterface21_2.method7189();
		}
	}

	@OriginalMember(owner = "client!en", name = "F", descriptor = "(I)V")
	private void method2143() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray13, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!en", name = "n", descriptor = "()Z")
	@Override
	public boolean method7493() {
		return this.aBoolean174 && (!this.method7496() || this.aBoolean158);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "()Z")
	@Override
	public boolean method7452() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt2477;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(Z)V")
	@Override
	public void method7500(@OriginalArg(0) boolean arg0) {
		this.aBoolean156 = arg0;
		this.method2088();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!qa;IBI)V")
	public void method2144(@OriginalArg(0) int arg0, @OriginalArg(1) Interface15 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1.method3356();
		@Pc(14) int local14 = arg2 * this.method2080(local7);
		this.method2091(arg1);
		OpenGL.glDrawElements(4, arg0, local7, arg1.method3358() + (long) local14);
	}
}
