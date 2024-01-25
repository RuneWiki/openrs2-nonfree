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

@OriginalClass("client!dw")
public final class Class82_Sub1 extends Class82 {

	@OriginalMember(owner = "client!dw", name = "B", descriptor = "I")
	private int anInt2271;

	@OriginalMember(owner = "client!dw", name = "gb", descriptor = "I")
	public int anInt2300;

	@OriginalMember(owner = "client!dw", name = "Rb", descriptor = "I")
	private int anInt2336;

	@OriginalMember(owner = "client!dw", name = "ie", descriptor = "I")
	public int anInt2450;

	@OriginalMember(owner = "client!dw", name = "Ee", descriptor = "I")
	public int anInt2463;

	@OriginalMember(owner = "client!dw", name = "Ge", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!dw", name = "Je", descriptor = "Lclient!eba;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "client!dw", name = "Le", descriptor = "Lclient!lt;")
	private Interface15 anInterface15_1;

	@OriginalMember(owner = "client!dw", name = "Ne", descriptor = "Lclient!lt;")
	private Interface15 anInterface15_2;

	@OriginalMember(owner = "client!dw", name = "Se", descriptor = "Lclient!gba;")
	private Class103_Sub1 aClass103_Sub1_1;

	@OriginalMember(owner = "client!dw", name = "Te", descriptor = "I")
	private int anInt2469;

	@OriginalMember(owner = "client!dw", name = "Ue", descriptor = "I")
	public int anInt2470;

	@OriginalMember(owner = "client!dw", name = "Ve", descriptor = "I")
	public int anInt2471;

	@OriginalMember(owner = "client!dw", name = "df", descriptor = "Z")
	private boolean aBoolean169;

	@OriginalMember(owner = "client!dw", name = "ef", descriptor = "Z")
	private boolean aBoolean170;

	@OriginalMember(owner = "client!dw", name = "ff", descriptor = "Z")
	private boolean aBoolean171;

	@OriginalMember(owner = "client!dw", name = "gf", descriptor = "I")
	private int anInt2472;

	@OriginalMember(owner = "client!dw", name = "hf", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!dw", name = "kf", descriptor = "I")
	private int anInt2473;

	@OriginalMember(owner = "client!dw", name = "lf", descriptor = "I")
	private int anInt2474;

	@OriginalMember(owner = "client!dw", name = "mf", descriptor = "Z")
	private boolean aBoolean172;

	@OriginalMember(owner = "client!dw", name = "pf", descriptor = "Lclient!dn;")
	public Class75_Sub1 aClass75_Sub1_1;

	@OriginalMember(owner = "client!dw", name = "tf", descriptor = "Lclient!dn;")
	public Class75_Sub1 aClass75_Sub1_2;

	@OriginalMember(owner = "client!dw", name = "vf", descriptor = "Lclient!dn;")
	public Class75_Sub1 aClass75_Sub1_3;

	@OriginalMember(owner = "client!dw", name = "wf", descriptor = "Z")
	public boolean aBoolean174;

	@OriginalMember(owner = "client!dw", name = "xf", descriptor = "Lclient!dn;")
	public Class75_Sub1 aClass75_Sub1_4;

	@OriginalMember(owner = "client!dw", name = "Af", descriptor = "Z")
	public boolean aBoolean175;

	@OriginalMember(owner = "client!dw", name = "Df", descriptor = "Z")
	public boolean aBoolean177;

	@OriginalMember(owner = "client!dw", name = "Ff", descriptor = "Z")
	public boolean aBoolean178;

	@OriginalMember(owner = "client!dw", name = "Hf", descriptor = "F")
	private float aFloat30;

	@OriginalMember(owner = "client!dw", name = "If", descriptor = "Lclient!dn;")
	public Class75_Sub1 aClass75_Sub1_5;

	@OriginalMember(owner = "client!dw", name = "Kf", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!dw", name = "Mf", descriptor = "Z")
	private boolean aBoolean179;

	@OriginalMember(owner = "client!dw", name = "Nf", descriptor = "Lclient!dn;")
	public Class75_Sub1 aClass75_Sub1_6;

	@OriginalMember(owner = "client!dw", name = "Pf", descriptor = "I")
	private int anInt2481;

	@OriginalMember(owner = "client!dw", name = "Qf", descriptor = "Z")
	public boolean aBoolean180;

	@OriginalMember(owner = "client!dw", name = "Tf", descriptor = "Lclient!bia;")
	private Interface3 anInterface3_3;

	@OriginalMember(owner = "client!dw", name = "Uf", descriptor = "Z")
	private boolean aBoolean181;

	@OriginalMember(owner = "client!dw", name = "Yf", descriptor = "Lclient!dn;")
	public Class75_Sub1 aClass75_Sub1_7;

	@OriginalMember(owner = "client!dw", name = "bg", descriptor = "Lclient!fba;")
	public Class94_Sub2 aClass94_Sub2_1;

	@OriginalMember(owner = "client!dw", name = "eg", descriptor = "Lclient!ss;")
	public Class313 aClass313_9;

	@OriginalMember(owner = "client!dw", name = "ig", descriptor = "Lclient!bia;")
	private Interface3 anInterface3_4;

	@OriginalMember(owner = "client!dw", name = "jg", descriptor = "I")
	public int anInt2490;

	@OriginalMember(owner = "client!dw", name = "kg", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!dw", name = "lg", descriptor = "Lclient!pa;")
	private Interface17 anInterface17_2;

	@OriginalMember(owner = "client!dw", name = "mg", descriptor = "Lclient!gv;")
	private Class94_Sub2_Sub1 aClass94_Sub2_Sub1_1;

	@OriginalMember(owner = "client!dw", name = "ng", descriptor = "I")
	private int anInt2491;

	@OriginalMember(owner = "client!dw", name = "og", descriptor = "Lclient!dn;")
	public Class75_Sub1 aClass75_Sub1_8;

	@OriginalMember(owner = "client!dw", name = "qg", descriptor = "F")
	private float aFloat37;

	@OriginalMember(owner = "client!dw", name = "tg", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!dw", name = "ug", descriptor = "Z")
	private boolean aBoolean184;

	@OriginalMember(owner = "client!dw", name = "vg", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!dw", name = "wg", descriptor = "Lclient!dn;")
	public Class75_Sub1 aClass75_Sub1_9;

	@OriginalMember(owner = "client!dw", name = "zg", descriptor = "I")
	private int anInt2494;

	@OriginalMember(owner = "client!dw", name = "Cg", descriptor = "I")
	private int anInt2495;

	@OriginalMember(owner = "client!dw", name = "Dg", descriptor = "Z")
	public boolean aBoolean186;

	@OriginalMember(owner = "client!dw", name = "Eg", descriptor = "Lclient!eba;")
	public Class85 aClass85_2;

	@OriginalMember(owner = "client!dw", name = "Gg", descriptor = "Z")
	public boolean aBoolean187;

	@OriginalMember(owner = "client!dw", name = "Lg", descriptor = "I")
	public int anInt2498;

	@OriginalMember(owner = "client!dw", name = "Mg", descriptor = "Z")
	private boolean aBoolean188;

	@OriginalMember(owner = "client!dw", name = "Ng", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!dw", name = "Og", descriptor = "I")
	private int anInt2499;

	@OriginalMember(owner = "client!dw", name = "Pg", descriptor = "I")
	public int anInt2500;

	@OriginalMember(owner = "client!dw", name = "Qg", descriptor = "Z")
	public boolean aBoolean189;

	@OriginalMember(owner = "client!dw", name = "Sg", descriptor = "Z")
	private boolean aBoolean190;

	@OriginalMember(owner = "client!dw", name = "Tg", descriptor = "F")
	private float aFloat43;

	@OriginalMember(owner = "client!dw", name = "Ug", descriptor = "Z")
	public boolean aBoolean191;

	@OriginalMember(owner = "client!dw", name = "Wg", descriptor = "Z")
	private boolean aBoolean192;

	@OriginalMember(owner = "client!dw", name = "bh", descriptor = "I")
	public int anInt2503;

	@OriginalMember(owner = "client!dw", name = "ch", descriptor = "Z")
	private boolean aBoolean194;

	@OriginalMember(owner = "client!dw", name = "eh", descriptor = "I")
	private int anInt2505;

	@OriginalMember(owner = "client!dw", name = "fh", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!dw", name = "hh", descriptor = "[Lclient!wu;")
	private Class94[] aClass94Array1;

	@OriginalMember(owner = "client!dw", name = "jh", descriptor = "Lclient!ss;")
	public Class313 aClass313_10;

	@OriginalMember(owner = "client!dw", name = "kh", descriptor = "I")
	private int anInt2506;

	@OriginalMember(owner = "client!dw", name = "nh", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!dw", name = "rh", descriptor = "Lclient!dn;")
	public Class75_Sub1 aClass75_Sub1_10;

	@OriginalMember(owner = "client!dw", name = "sh", descriptor = "Lclient!paa;")
	private Class141_Sub2 aClass141_Sub2_1;

	@OriginalMember(owner = "client!dw", name = "th", descriptor = "I")
	private int anInt2508;

	@OriginalMember(owner = "client!dw", name = "uh", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!dw", name = "vh", descriptor = "Z")
	public boolean aBoolean199;

	@OriginalMember(owner = "client!dw", name = "xh", descriptor = "I")
	private int anInt2509;

	@OriginalMember(owner = "client!dw", name = "zh", descriptor = "I")
	private int anInt2510;

	@OriginalMember(owner = "client!dw", name = "nc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!dw", name = "ve", descriptor = "I")
	public int anInt2460 = 128;

	@OriginalMember(owner = "client!dw", name = "xe", descriptor = "Lclient!ci;")
	private final Class52 aClass52_1 = new Class52();

	@OriginalMember(owner = "client!dw", name = "Ae", descriptor = "Lclient!tu;")
	private final Class31_Sub3 aClass31_Sub3_1 = new Class31_Sub3();

	@OriginalMember(owner = "client!dw", name = "Be", descriptor = "Lclient!tu;")
	public final Class31_Sub3 aClass31_Sub3_2 = new Class31_Sub3();

	@OriginalMember(owner = "client!dw", name = "De", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!dw", name = "Ie", descriptor = "I")
	public int anInt2465 = 8;

	@OriginalMember(owner = "client!dw", name = "He", descriptor = "I")
	public int anInt2464 = 3;

	@OriginalMember(owner = "client!dw", name = "Fe", descriptor = "Lclient!mba;")
	private final Class216 aClass216_12 = new Class216();

	@OriginalMember(owner = "client!dw", name = "Ke", descriptor = "[Lclient!lt;")
	private final Interface15[] anInterface15Array1 = new Interface15[4];

	@OriginalMember(owner = "client!dw", name = "Me", descriptor = "[Lclient!lt;")
	private final Interface15[] anInterface15Array2 = new Interface15[4];

	@OriginalMember(owner = "client!dw", name = "Qe", descriptor = "[Lclient!lt;")
	private final Interface15[] anInterface15Array3 = new Interface15[4];

	@OriginalMember(owner = "client!dw", name = "Pe", descriptor = "I")
	private int anInt2467 = -1;

	@OriginalMember(owner = "client!dw", name = "Oe", descriptor = "I")
	private int anInt2466 = -1;

	@OriginalMember(owner = "client!dw", name = "Re", descriptor = "I")
	private int anInt2468 = -1;

	@OriginalMember(owner = "client!dw", name = "We", descriptor = "Lclient!mba;")
	private final Class216 aClass216_13;

	@OriginalMember(owner = "client!dw", name = "Xe", descriptor = "Lclient!mba;")
	private final Class216 aClass216_14;

	@OriginalMember(owner = "client!dw", name = "Ye", descriptor = "Lclient!mba;")
	private final Class216 aClass216_15;

	@OriginalMember(owner = "client!dw", name = "Ze", descriptor = "Lclient!mba;")
	private final Class216 aClass216_16;

	@OriginalMember(owner = "client!dw", name = "af", descriptor = "Lclient!mba;")
	private final Class216 aClass216_17;

	@OriginalMember(owner = "client!dw", name = "bf", descriptor = "Lclient!mba;")
	private final Class216 bf;

	@OriginalMember(owner = "client!dw", name = "cf", descriptor = "Lclient!mba;")
	private final Class216 aClass216_18;

	@OriginalMember(owner = "client!dw", name = "jf", descriptor = "Lclient!tu;")
	public final Class31_Sub3 aClass31_Sub3_3;

	@OriginalMember(owner = "client!dw", name = "nf", descriptor = "Lclient!tu;")
	public final Class31_Sub3 aClass31_Sub3_4;

	@OriginalMember(owner = "client!dw", name = "of", descriptor = "Lclient!tu;")
	public final Class31_Sub3 aClass31_Sub3_5;

	@OriginalMember(owner = "client!dw", name = "sf", descriptor = "Z")
	private boolean aBoolean173;

	@OriginalMember(owner = "client!dw", name = "Jf", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!dw", name = "uf", descriptor = "I")
	public int anInt2476;

	@OriginalMember(owner = "client!dw", name = "ag", descriptor = "I")
	private int anInt2485;

	@OriginalMember(owner = "client!dw", name = "Lf", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!dw", name = "xg", descriptor = "[F")
	public final float[] aFloatArray11;

	@OriginalMember(owner = "client!dw", name = "qf", descriptor = "I")
	public int anInt2475;

	@OriginalMember(owner = "client!dw", name = "gg", descriptor = "I")
	public int anInt2489;

	@OriginalMember(owner = "client!dw", name = "yf", descriptor = "[F")
	private final float[] aFloatArray9;

	@OriginalMember(owner = "client!dw", name = "Ef", descriptor = "I")
	private int anInt2479;

	@OriginalMember(owner = "client!dw", name = "Xf", descriptor = "I")
	private int anInt2484;

	@OriginalMember(owner = "client!dw", name = "sg", descriptor = "I")
	public int anInt2492;

	@OriginalMember(owner = "client!dw", name = "Bf", descriptor = "I")
	private int anInt2478;

	@OriginalMember(owner = "client!dw", name = "cg", descriptor = "I")
	private int anInt2486;

	@OriginalMember(owner = "client!dw", name = "yg", descriptor = "I")
	private int anInt2493;

	@OriginalMember(owner = "client!dw", name = "Fg", descriptor = "I")
	public int anInt2496;

	@OriginalMember(owner = "client!dw", name = "Hg", descriptor = "I")
	private int anInt2497;

	@OriginalMember(owner = "client!dw", name = "Jg", descriptor = "F")
	private float aFloat41;

	@OriginalMember(owner = "client!dw", name = "dg", descriptor = "I")
	public int anInt2487;

	@OriginalMember(owner = "client!dw", name = "Rf", descriptor = "I")
	public int anInt2482;

	@OriginalMember(owner = "client!dw", name = "Vg", descriptor = "I")
	private int anInt2502;

	@OriginalMember(owner = "client!dw", name = "Gf", descriptor = "F")
	private float aFloat29;

	@OriginalMember(owner = "client!dw", name = "Xg", descriptor = "F")
	private float aFloat44;

	@OriginalMember(owner = "client!dw", name = "Rg", descriptor = "I")
	private int anInt2501;

	@OriginalMember(owner = "client!dw", name = "Wf", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!dw", name = "Ag", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!dw", name = "Vf", descriptor = "I")
	public int anInt2483;

	@OriginalMember(owner = "client!dw", name = "Zf", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!dw", name = "ah", descriptor = "F")
	private float aFloat45;

	@OriginalMember(owner = "client!dw", name = "zf", descriptor = "I")
	public int anInt2477;

	@OriginalMember(owner = "client!dw", name = "Ig", descriptor = "[F")
	private final float[] aFloatArray12;

	@OriginalMember(owner = "client!dw", name = "Zg", descriptor = "[F")
	private final float[] aFloatArray13;

	@OriginalMember(owner = "client!dw", name = "rg", descriptor = "[F")
	private final float[] aFloatArray10;

	@OriginalMember(owner = "client!dw", name = "Sf", descriptor = "[Lclient!tj;")
	private final Class3_Sub22[] aClass3_Sub22Array1;

	@OriginalMember(owner = "client!dw", name = "rf", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!dw", name = "gh", descriptor = "F")
	private float aFloat46;

	@OriginalMember(owner = "client!dw", name = "mh", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!dw", name = "dh", descriptor = "I")
	public int anInt2504;

	@OriginalMember(owner = "client!dw", name = "qh", descriptor = "Z")
	private boolean aBoolean198;

	@OriginalMember(owner = "client!dw", name = "lh", descriptor = "I")
	private int anInt2507;

	@OriginalMember(owner = "client!dw", name = "Of", descriptor = "I")
	public int anInt2480;

	@OriginalMember(owner = "client!dw", name = "Kg", descriptor = "Lclient!bga;")
	public Class3_Sub9_Sub1 aClass3_Sub9_Sub1_2;

	@OriginalMember(owner = "client!dw", name = "wh", descriptor = "[B")
	public final byte[] aByteArray22;

	@OriginalMember(owner = "client!dw", name = "yh", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!dw", name = "Ah", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!dw", name = "Bh", descriptor = "[I")
	public int[] anIntArray159;

	@OriginalMember(owner = "client!dw", name = "ue", descriptor = "I")
	public final int anInt2459;

	@OriginalMember(owner = "client!dw", name = "Wd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas1;

	@OriginalMember(owner = "client!dw", name = "fe", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!dw", name = "ec", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!dw", name = "T", descriptor = "J")
	private final long aLong63;

	@OriginalMember(owner = "client!dw", name = "H", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!dw", name = "fg", descriptor = "I")
	public final int anInt2488;

	@OriginalMember(owner = "client!dw", name = "ih", descriptor = "Z")
	public boolean aBoolean195;

	@OriginalMember(owner = "client!dw", name = "hg", descriptor = "Z")
	private boolean aBoolean182;

	@OriginalMember(owner = "client!dw", name = "Yg", descriptor = "Z")
	public boolean aBoolean193;

	@OriginalMember(owner = "client!dw", name = "Cf", descriptor = "Z")
	public boolean aBoolean176;

	@OriginalMember(owner = "client!dw", name = "oh", descriptor = "Z")
	public boolean aBoolean196;

	@OriginalMember(owner = "client!dw", name = "pg", descriptor = "Z")
	private boolean aBoolean183;

	@OriginalMember(owner = "client!dw", name = "Bg", descriptor = "Z")
	public boolean aBoolean185;

	@OriginalMember(owner = "client!dw", name = "ph", descriptor = "Z")
	private final boolean aBoolean197;

	@OriginalMember(owner = "client!dw", name = "ze", descriptor = "Lclient!gi;")
	private final Class128 aClass128_1;

	@OriginalMember(owner = "client!dw", name = "Ce", descriptor = "Lclient!dt;")
	public final Class79 aClass79_1;

	@OriginalMember(owner = "client!dw", name = "se", descriptor = "Lclient!vn;")
	private final Class358 aClass358_1;

	@OriginalMember(owner = "client!dw", name = "te", descriptor = "Lclient!taa;")
	private Class3_Sub44_Sub1 aClass3_Sub44_Sub1_1;

	@OriginalMember(owner = "client!dw", name = "re", descriptor = "Lclient!eg;")
	private final Class90 aClass90_1;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class82_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class363();
		new Class25(16);
		this.aClass216_13 = new Class216();
		this.aClass216_14 = new Class216();
		this.aClass216_15 = new Class216();
		this.aClass216_16 = new Class216();
		this.aClass216_17 = new Class216();
		this.bf = new Class216();
		this.aClass216_18 = new Class216();
		this.aClass31_Sub3_3 = new Class31_Sub3();
		this.aClass31_Sub3_4 = new Class31_Sub3();
		this.aClass31_Sub3_5 = new Class31_Sub3();
		this.aBoolean173 = false;
		this.aFloat31 = -1.0F;
		this.anInt2476 = 0;
		this.anInt2485 = 0;
		this.aFloat33 = 3584.0F;
		this.aFloatArray11 = new float[4];
		this.anInt2475 = -1;
		this.anInt2489 = 512;
		this.aFloatArray9 = new float[4];
		this.anInt2479 = -1;
		this.anInt2484 = 0;
		this.anInt2492 = 0;
		this.anInt2478 = 0;
		this.anInt2486 = 0;
		this.anInt2493 = 8448;
		this.anInt2496 = 0;
		this.anInt2497 = 3584;
		this.aFloat41 = 1.0F;
		this.anInt2487 = -1;
		this.anInt2482 = 512;
		this.anInt2502 = 8448;
		this.aFloat29 = 1.0F;
		this.aFloat44 = -1.0F;
		this.anInt2501 = 0;
		this.aFloat34 = 1.0F;
		this.aFloat40 = 1.0F;
		this.anInt2483 = 50;
		this.aFloat35 = 1.0F;
		this.aFloat45 = 0.0F;
		this.anInt2477 = 0;
		this.aFloatArray12 = new float[4];
		this.aFloatArray13 = new float[16];
		this.aFloatArray10 = new float[4];
		this.aClass3_Sub22Array1 = new Class3_Sub22[Static565.anInt8007];
		this.aFloat28 = 3584.0F;
		this.aFloat46 = -1.0F;
		this.aFloat47 = -1.0F;
		this.anInt2504 = -1;
		this.aBoolean198 = true;
		this.anInt2507 = 0;
		this.anInt2480 = -1;
		this.aClass3_Sub9_Sub1_2 = new Class3_Sub9_Sub1(8192);
		this.aByteArray22 = new byte[16384];
		this.anIntArray157 = new int[1];
		this.anIntArray158 = new int[1];
		this.anIntArray159 = new int[1];
		this.anInt2459 = arg2;
		this.aCanvas2 = this.aCanvas1 = arg0;
		if (!Static422.method6653("jaclib")) {
			throw new RuntimeException("");
		} else if (Static422.method6653("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong62 = this.aLong63 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt2459);
				if (this.aLong63 == 0L) {
					throw new RuntimeException("");
				}
				this.method2095();
				@Pc(335) int local335 = this.method2072();
				if (local335 != 0) {
					throw new RuntimeException("");
				}
				this.anInt2488 = this.aBoolean174 ? 33639 : 5121;
				if (this.aString15.indexOf("radeon") != -1) {
					@Pc(359) int local359 = 0;
					@Pc(361) boolean local361 = false;
					@Pc(363) boolean local363 = false;
					@Pc(372) String[] local372 = Static557.method7916(' ', this.aString15.replace('/', ' '));
					for (@Pc(374) int local374 = 0; local374 < local372.length; local374++) {
						@Pc(380) String local380 = local372[local374];
						try {
							if (local380.length() > 0) {
								if (local380.charAt(0) == 'x' && local380.length() >= 3 && Static279.method4561(local380.substring(1, 3))) {
									local380 = local380.substring(1);
									local363 = true;
								}
								if (local380.equals("hd")) {
									local361 = true;
								} else {
									if (local380.startsWith("hd")) {
										local380 = local380.substring(2);
										local361 = true;
									}
									if (local380.length() >= 4 && Static279.method4561(local380.substring(0, 4))) {
										local359 = Static508.method7720(local380.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(450) Exception local450) {
						}
					}
					if (!local361 || local359 < 4000) {
						this.aBoolean195 = false;
					}
					if (!local363 && !local361) {
						if (local359 >= 7000 && local359 <= 7999) {
							this.aBoolean182 = false;
						}
						if (local359 >= 7000 && local359 <= 9250) {
							this.aBoolean193 = false;
						}
					}
					this.aBoolean176 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean196 = true;
					this.aBoolean183 = this.aBoolean182;
				}
				if (this.aString14.indexOf("intel") != -1) {
					this.aBoolean185 = false;
				}
				this.aBoolean197 = !this.aString14.equals("s3 graphics");
				if (this.aBoolean182) {
					try {
						@Pc(531) int[] local531 = new int[1];
						OpenGL.glGenBuffersARB(1, local531, 0);
					} catch (@Pc(537) Throwable local537) {
						throw new RuntimeException("");
					}
				}
				Static56.method1015(true, false);
				this.aBoolean168 = true;
				this.aClass128_1 = new Class128(this, super.anInterface5_9);
				this.method2074();
				this.aClass79_1 = new Class79(this);
				this.aClass358_1 = new Class358(this);
				if (this.aClass358_1.method8340()) {
					this.aClass3_Sub44_Sub1_1 = new Class3_Sub44_Sub1(this);
					if (!this.aClass3_Sub44_Sub1_1.method7745()) {
						this.aClass3_Sub44_Sub1_1.method7734();
						this.aClass3_Sub44_Sub1_1 = null;
					}
				}
				this.aClass90_1 = new Class90(this);
				this.method2059();
				this.method2037();
				this.method6153();
			} catch (@Pc(611) Throwable local611) {
				local611.printStackTrace();
				this.method6121();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)V")
	private void method2018() {
		if (this.aBoolean181 && this.anInt2504 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!dw", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt2509;
		this.anInt2509 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!he;)V")
	@Override
	public void method6145(@OriginalArg(0) Class141 arg0) {
		this.aClass141_Sub2_1 = (Class141_Sub2) arg0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([I)V")
	@Override
	public void method6156(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2300;
		arg0[1] = this.anInt2450;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;ZII)Lclient!bia;")
	public Interface3 method2019(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(4) int arg2) {
		return (Interface3) (this.aBoolean182 ? new Class239_Sub2(this, arg0, arg1, arg2, false) : new Class41_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(B)V")
	public void method2020() {
		if (this.anInt2473 == 4) {
			return;
		}
		this.method2030();
		this.method2051(false);
		this.method2028(false);
		this.method2055(false);
		this.method2032(false);
		this.method2057(-2);
		this.method2085(1);
		this.anInt2473 = 4;
	}

	@OriginalMember(owner = "client!dw", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method2032(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "()Z")
	@Override
	public boolean method6136() {
		return this.aClass3_Sub44_Sub1_1 != null && (this.anInt2459 <= 1 || this.aBoolean192);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
	@Override
	public void method6098(@OriginalArg(0) int arg0) {
		this.method2095();
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(B)V")
	private void method2021() {
		@Pc(6) float[] local6 = this.aFloatArray13;
		@Pc(18) float local18 = (float) (this.anInt2483 * -this.anInt2496) / (float) this.anInt2482;
		@Pc(39) float local39 = (float) ((this.anInt2300 - this.anInt2496) * this.anInt2483) / (float) this.anInt2482;
		@Pc(50) float local50 = (float) (this.anInt2483 * this.anInt2477) / (float) this.anInt2489;
		@Pc(64) float local64 = (float) (this.anInt2483 * (this.anInt2477 - this.anInt2450)) / (float) this.anInt2489;
		if (local39 == local18 || local64 == local50) {
			local6[12] = 0.0F;
			local6[6] = 0.0F;
			local6[3] = 0.0F;
			local6[8] = 0.0F;
			local6[14] = 0.0F;
			local6[9] = 0.0F;
			local6[10] = 1.0F;
			local6[15] = 1.0F;
			local6[0] = 1.0F;
			local6[11] = 0.0F;
			local6[13] = 0.0F;
			local6[7] = 0.0F;
			local6[5] = 1.0F;
			local6[1] = 0.0F;
			local6[4] = 0.0F;
			local6[2] = 0.0F;
		} else {
			@Pc(78) float local78 = (float) this.anInt2483 * 2.0F;
			local6[3] = 0.0F;
			local6[2] = 0.0F;
			local6[12] = 0.0F;
			local6[8] = (local18 + local39) / (-local18 + local39);
			local6[14] = this.aFloat37 = -(local78 * (float) this.anInt2497) / (float) (this.anInt2497 - this.anInt2483);
			local6[6] = 0.0F;
			local6[9] = (local64 + local50) / (local50 - local64);
			local6[0] = local78 / (local39 - local18);
			local6[11] = -1.0F;
			local6[7] = 0.0F;
			local6[4] = 0.0F;
			local6[15] = 0.0F;
			local6[10] = this.aFloat30 = (float) -(this.anInt2497 + this.anInt2483) / (float) (this.anInt2497 - this.anInt2483);
			local6[13] = 0.0F;
			local6[1] = 0.0F;
			local6[5] = local78 / (local50 - local64);
		}
		this.method2090();
	}

	@OriginalMember(owner = "client!dw", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass31_Sub3_3.aFloat182 * (float) arg2 + this.aClass31_Sub3_3.aFloat181 * (float) arg1 + this.aClass31_Sub3_3.aFloat185 * (float) arg0 + this.aClass31_Sub3_3.aFloat188;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt2482 * (this.aClass31_Sub3_3.aFloat187 * (float) arg2 + this.aClass31_Sub3_3.aFloat190 * (float) arg1 + this.aClass31_Sub3_3.aFloat186 * (float) arg0 + this.aClass31_Sub3_3.aFloat189) / local28);
		@Pc(109) int local109 = (int) ((this.aClass31_Sub3_3.aFloat184 * (float) arg1 + this.aClass31_Sub3_3.aFloat180 * (float) arg0 + (float) arg2 * this.aClass31_Sub3_3.aFloat191 + this.aClass31_Sub3_3.aFloat183) * (float) this.anInt2489 / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat42);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local109 - this.aFloat48);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class91 method6139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class91_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "(I)V")
	private void method2022() {
		this.aFloat43 = (float) (this.anInt2497 - this.anInt2492) - this.aFloat45;
		this.aFloat38 = this.aFloat43 - (float) this.anInt2504 * this.aFloat41;
		if ((float) this.anInt2483 > this.aFloat38) {
			this.aFloat38 = (float) this.anInt2483;
		}
		OpenGL.glFogf(2915, this.aFloat38);
		OpenGL.glFogf(2916, this.aFloat43);
		Static526.aFloatArray89[1] = (float) (this.anInt2475 & 0xFF00) / 65280.0F;
		Static526.aFloatArray89[2] = (float) (this.anInt2475 & 0xFF) / 255.0F;
		Static526.aFloatArray89[0] = (float) (this.anInt2475 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static526.aFloatArray89, 0);
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(IIZ)V")
	public synchronized void method2023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class3_Sub51 local14 = new Class3_Sub51(arg1);
		local14.aLong277 = (long) arg0;
		this.aClass216_15.method5449(local14);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6123(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)V")
	@Override
	public void method6135() {
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIF)Lclient!tj;")
	@Override
	public Class3_Sub22 method6126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub22_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "()Z")
	@Override
	public boolean method6104() {
		return false;
	}

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "()V")
	@Override
	public void method6118() {
	}

	@OriginalMember(owner = "client!dw", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass31_Sub3_3.aFloat188 + this.aClass31_Sub3_3.aFloat182 * (float) arg2 + (float) arg0 * this.aClass31_Sub3_3.aFloat185 + (float) arg1 * this.aClass31_Sub3_3.aFloat181;
		if ((float) this.anInt2483 > local28 || (float) this.anInt2497 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt2482 * (this.aClass31_Sub3_3.aFloat186 * (float) arg0 + this.aClass31_Sub3_3.aFloat190 * (float) arg1 + (float) arg2 * this.aClass31_Sub3_3.aFloat187 + this.aClass31_Sub3_3.aFloat189) / local28);
		@Pc(117) int local117 = (int) ((this.aClass31_Sub3_3.aFloat183 + (float) arg0 * this.aClass31_Sub3_3.aFloat180 + (float) arg1 * this.aClass31_Sub3_3.aFloat184 + this.aClass31_Sub3_3.aFloat191 * (float) arg2) * (float) this.anInt2489 / local28);
		if ((float) local85 >= this.aFloat42 && this.aFloat39 >= (float) local85 && this.aFloat48 <= (float) local117 && this.aFloat32 >= (float) local117) {
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat42);
			arg3[1] = (int) ((float) local117 - this.aFloat48);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "()I")
	@Override
	public int method6131() {
		return 4;
	}

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "()V")
	@Override
	public void method6153() {
		if (!this.aBoolean197 || this.anInt2300 <= 0 || this.anInt2450 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2478;
		@Pc(22) int local22 = this.anInt2507;
		@Pc(25) int local25 = this.anInt2485;
		@Pc(28) int local28 = this.anInt2501;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method2062();
		this.method2051(false);
		this.method2028(false);
		this.method2055(false);
		this.method2032(false);
		this.method2029((Class94) null);
		this.method2057(-2);
		this.method2068(1);
		this.method2085(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt2300, this.anInt2450, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ik;)V")
	@Override
	public void method6161(@OriginalArg(0) Class162 arg0) {
		this.aClass52_1.method1247(this, -1, arg0);
	}

	@OriginalMember(owner = "client!dw", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt2497;
	}

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "(I)Lclient!ifa;")
	public Class94_Sub4 method2024() {
		return this.aClass141_Sub2_1 == null ? null : this.aClass141_Sub2_1.method6654();
	}

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "(II)I")
	public int method2025(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6099(@OriginalArg(0) Canvas arg0) {
		this.aCanvas2 = null;
		this.aLong62 = 0L;
		if (arg0 == null || arg0 == this.aCanvas1) {
			this.aLong62 = this.aLong63;
			this.aCanvas2 = this.aCanvas1;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable2.get(arg0);
			this.aLong62 = local26;
			this.aCanvas2 = arg0;
		}
		if (this.aCanvas2 == null || this.aLong62 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong62);
		this.method2037();
	}

	@OriginalMember(owner = "client!dw", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2031();
		this.method2085(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!oia;Z)Lclient!fd;")
	@Override
	public Class103 method6106(@OriginalArg(0) Class251 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt7185 * arg0.anInt7184];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray64 == null) {
			for (local21 = 0; local21 < arg0.anInt7184; local21++) {
				for (local25 = 0; local25 < arg0.anInt7185; local25++) {
					@Pc(38) int local38 = arg0.anIntArray430[arg0.aByteArray65[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt7184; local21++) {
				for (local25 = 0; local25 < arg0.anInt7185; local25++) {
					local12[local16++] = arg0.anIntArray430[arg0.aByteArray65[local14] & 0xFF] | arg0.aByteArray64[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(123) Class103 local123 = this.method6112(arg0.anInt7184, local12, arg0.anInt7185, arg0.anInt7185);
		local123.method7441(arg0.anInt7183, arg0.anInt7180, arg0.anInt7181, arg0.anInt7182);
		return local123;
	}

	@OriginalMember(owner = "client!dw", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method2085(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!dw", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt2496, this.anInt2477, this.anInt2482, this.anInt2489 };
	}

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "(I)V")
	private void method2026() {
		@Pc(15) float local15 = (float) -this.anInt2496 * this.aFloat29 / (float) this.anInt2482;
		@Pc(27) float local27 = this.aFloat29 * (float) -this.anInt2477 / (float) this.anInt2489;
		@Pc(41) float local41 = this.aFloat29 * (float) (this.anInt2300 - this.anInt2496) / (float) this.anInt2482;
		@Pc(56) float local56 = (float) (this.anInt2450 - this.anInt2477) * this.aFloat29 / (float) this.anInt2489;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local41 != local15 && local27 != local56) {
			OpenGL.glOrtho((double) local15, (double) local41, (double) -local56, (double) -local27, (double) this.anInt2483, (double) this.anInt2497);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZZZ)V")
	public void method2027(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt2495 || this.aBoolean187 != this.aBoolean173) {
			@Pc(24) Class94_Sub2 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean187 ? 3 : 0;
			if (arg0 < 0) {
				this.method2061();
			} else {
				local24 = this.aClass128_1.method2984(arg0);
				@Pc(59) Class355 local59 = super.anInterface5_9.method4129(arg0);
				if (local59.aByte125 == 0 && local59.aByte122 == 0) {
					this.method2061();
				} else {
					@Pc(78) int local78 = local59.aBoolean741 ? 64 : 128;
					@Pc(82) int local82 = local78 * 50;
					this.method2056((float) (local59.aByte125 * (this.anInt2463 % local82)) / (float) local82, 0.0F, (float) (this.anInt2463 % local82 * local59.aByte122) / (float) local82);
				}
				if (!this.aBoolean187) {
					local30 = local59.anInt9795;
					local37 = local59.aByte119;
					local28 = local59.aByte120;
				}
				local26 = local59.anInt9794;
			}
			this.aClass90_1.method2238(local30, local37, arg2, local28, arg1);
			if (!this.aClass90_1.method2242(local26, local24)) {
				this.method2029(local24);
				this.method2068(local26);
			}
			this.anInt2495 = arg0;
			this.aBoolean173 = this.aBoolean187;
		}
		this.anInt2473 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!dw", name = "v", descriptor = "()Lclient!ih;")
	@Override
	public Class31 method6170() {
		return new Class31_Sub3();
	}

	@OriginalMember(owner = "client!dw", name = "w", descriptor = "()Z")
	@Override
	public boolean method6171() {
		return this.aBoolean179 && (!this.method6103() || this.aBoolean192);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BZ)V")
	public void method2028(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean184) {
			this.aBoolean184 = arg0;
			this.method2091();
			this.anInt2473 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!wu;I)V")
	public void method2029(@OriginalArg(0) Class94 arg0) {
		@Pc(16) Class94 local16 = this.aClass94Array1[this.anInt2481];
		if (local16 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local16.anInt4672);
			} else {
				if (local16 == null) {
					OpenGL.glEnable(arg0.anInt4672);
				} else if (arg0.anInt4672 != local16.anInt4672) {
					OpenGL.glDisable(local16.anInt4672);
					OpenGL.glEnable(arg0.anInt4672);
				}
				OpenGL.glBindTexture(arg0.anInt4672, arg0.method4006());
			}
			this.aClass94Array1[this.anInt2481] = arg0;
		}
		this.anInt2473 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "(I)V")
	private void method2030() {
		if (this.anInt2506 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt2300 > 0 && this.anInt2450 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt2300, (double) this.anInt2450, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt2473 &= 0xFFFFFFE7;
		this.anInt2506 = 1;
	}

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "(I)V")
	private void method2031() {
		if (this.anInt2473 == 1) {
			return;
		}
		this.method2030();
		this.method2051(false);
		this.method2028(false);
		this.method2055(false);
		this.method2032(false);
		this.method2029((Class94) null);
		this.method2057(-2);
		this.method2068(1);
		this.anInt2473 = 1;
	}

	@OriginalMember(owner = "client!dw", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method2031();
		this.method2085(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean179) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean179) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!dw", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Class94_Sub2_Sub1 local9 = local6.aClass94_Sub2_Sub1_5;
		this.method2060();
		this.method2029(local6.aClass94_Sub2_Sub1_5);
		this.method2085(1);
		this.method2077(7681, 8448);
		this.method2066(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat78 / (float) local9.anInt3664;
		@Pc(46) float local46 = local9.aFloat77 / (float) local9.anInt3671;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2478 - arg2), (float) (this.anInt2485 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2478, this.anInt2485);
		OpenGL.glTexCoord2f((float) (this.anInt2478 - arg2) * local39, (float) (this.anInt2501 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2478, this.anInt2501);
		OpenGL.glTexCoord2f((float) (this.anInt2507 - arg2) * local39, (float) (this.anInt2501 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2507, this.anInt2501);
		OpenGL.glTexCoord2f((float) (this.anInt2507 - arg2) * local39, (float) (this.anInt2485 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2507, this.anInt2485);
		OpenGL.glEnd();
		this.method2066(5890, 768, 0);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI)V")
	public void method2032(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean170 != arg0) {
			this.aBoolean170 = arg0;
			this.method2046();
			this.anInt2473 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!dw", name = "t", descriptor = "()V")
	@Override
	public void method6162() {
		if (this.aClass3_Sub44_Sub1_1 != null && this.aClass3_Sub44_Sub1_1.method7732()) {
			this.aClass358_1.method8337(this.aClass3_Sub44_Sub1_1);
			this.aClass128_1.method2983();
		}
	}

	@OriginalMember(owner = "client!dw", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean187 = true;
		this.anInt2480 = arg1;
		this.anInt2487 = arg2;
		this.anInt2476 = arg3;
		this.anInt2500 = arg0;
	}

	@OriginalMember(owner = "client!dw", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "(II)V")
	public synchronized void method2033(@OriginalArg(0) int arg0) {
		@Pc(16) Class3 local16 = new Class3();
		local16.aLong277 = (long) arg0;
		this.bf.method5449(local16);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method2031();
		this.method2085(1);
		@Pc(26) float local26 = (float) -arg0 + (float) arg2;
		@Pc(32) float local32 = (float) arg3 - (float) arg1;
		@Pc(45) float local45 = (float) (1.0D / Math.sqrt((double) (local26 * local26 + local32 * local32)));
		@Pc(51) int local51 = arg7 % (arg6 + arg5);
		@Pc(55) float local55 = local32 * local45;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(74) float local74 = local26 * local45;
		@Pc(79) float local79 = local74 * (float) arg5;
		@Pc(84) float local84 = local55 * (float) arg5;
		@Pc(86) float local86 = 0.0F;
		@Pc(88) float local88 = 0.0F;
		@Pc(90) float local90 = local79;
		@Pc(92) float local92 = local84;
		if (arg5 < local51) {
			local88 = local55 * (float) (arg6 + arg5 - local51);
			local86 = local74 * (float) (arg5 + arg6 - local51);
		} else {
			local90 = (float) (arg5 - local51) * local74;
			local92 = (float) (arg5 - local51) * local55;
		}
		@Pc(140) float local140 = local86 + (float) arg0 + 0.35F;
		@Pc(147) float local147 = (float) arg1 + local88 + 0.35F;
		@Pc(152) float local152 = local74 * (float) arg6;
		@Pc(157) float local157 = (float) arg6 * local55;
		while (true) {
			if (arg0 < arg2) {
				if (local140 > (float) arg2 + 0.35F) {
					break;
				}
				if (local90 + local140 > (float) arg2) {
					local90 = (float) arg2 - local140;
				}
			} else {
				if (local140 < (float) arg2 + 0.35F) {
					break;
				}
				if (local90 + local140 < (float) arg2) {
					local90 = (float) arg2 - local140;
				}
			}
			if (arg3 > arg1) {
				if ((float) arg3 + 0.35F < local147) {
					break;
				}
				if (local147 + local92 > (float) arg3) {
					local92 = (float) arg3 - local147;
				}
			} else {
				if (local147 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local147 + local92) {
					local92 = (float) arg3 - local147;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local140, local147);
			OpenGL.glVertex2f(local90 + local140, local147 + local92);
			local147 += local157 + local92;
			OpenGL.glEnd();
			local140 += local152 + local90;
			local92 = local84;
			local90 = local79;
		}
	}

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "(I)V")
	private void method2034() {
		OpenGL.glViewport(this.anInt2484, this.anInt2486, this.anInt2300, this.anInt2450);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ih;)V")
	@Override
	public void method6160(@OriginalArg(0) Class31 arg0) {
		this.aClass31_Sub3_3.method7934(arg0);
		this.aClass31_Sub3_4.method7934(this.aClass31_Sub3_3);
		this.aClass31_Sub3_4.method7938();
		this.aClass31_Sub3_5.method7943(this.aClass31_Sub3_4);
		if (this.anInt2506 != 1) {
			this.method2064();
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI[BII)Lclient!bia;")
	public Interface3 method2035(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		return (Interface3) (this.aBoolean182 && (!arg0 || this.aBoolean183) ? new Class239_Sub2(this, arg1, arg2, arg3, arg0) : new Class41_Sub2(this, arg1, arg2, arg3));
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIILclient!pa;I)V")
	public void method2036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface17 arg2) {
		@Pc(7) int local7 = arg2.method5961();
		@Pc(16) int local16 = arg0 * this.method2083(local7);
		this.method2053(arg2);
		OpenGL.glDrawElements(4, arg1, local7, arg2.method5962() + (long) local16);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!he;Lclient!he;FLclient!he;)Lclient!he;")
	@Override
	public Class141 method6150(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class141 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean191 && this.aBoolean185) {
			@Pc(15) Class141_Sub2_Sub2 local15 = null;
			@Pc(18) Class141_Sub2 local18 = (Class141_Sub2) arg0;
			@Pc(21) Class141_Sub2 local21 = (Class141_Sub2) arg1;
			@Pc(25) Class94_Sub4 local25 = local18.method6654();
			@Pc(29) Class94_Sub4 local29 = local21.method6654();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt4689 >= local25.anInt4689 ? local29.anInt4689 : local25.anInt4689;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class141_Sub2_Sub2) {
					@Pc(56) Class141_Sub2_Sub2 local56 = (Class141_Sub2_Sub2) arg3;
					if (local44 == local56.method6659()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class141_Sub2_Sub2(this, local44);
				}
				if (local15.method6658(local29, arg2, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "(I)V")
	private void method2037() {
		if (this.aCanvas2 == null) {
			this.anInt2271 = this.anInt2336 = 0;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas2.getSize();
			this.anInt2271 = local6.width;
			this.anInt2336 = local6.height;
		}
		if (this.anInterface15_1 == null) {
			this.anInt2450 = this.anInt2336;
			this.anInt2300 = this.anInt2271;
			this.method2034();
		}
		this.method2062();
		this.la();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZLclient!lt;)V")
	public void method2038(@OriginalArg(1) Interface15 arg0) {
		if (this.anInt2468 < 0 || arg0 != this.anInterface15Array1[this.anInt2468]) {
			throw new RuntimeException();
		}
		this.anInterface15Array1[this.anInt2468--] = null;
		arg0.method2137();
		if (this.anInt2468 >= 0) {
			this.anInterface15_1 = this.anInterface15Array1[this.anInt2468];
			this.anInterface15_1.method2136();
		} else {
			this.anInterface15_1 = null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt2501 = this.anInt2450;
		this.anInt2478 = 0;
		this.anInt2507 = this.anInt2300;
		this.anInt2485 = 0;
		OpenGL.glDisable(3089);
		this.method2040();
	}

	@OriginalMember(owner = "client!dw", name = "x", descriptor = "()Lclient!ih;")
	@Override
	public Class31 method6174() {
		return this.aClass31_Sub3_3;
	}

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "(I)V")
	private void method2039() {
		if (this.anInt2507 >= this.anInt2478 && this.anInt2485 <= this.anInt2501) {
			OpenGL.glScissor(this.anInt2478 + this.anInt2484, -this.anInt2501 + this.anInt2450 + this.anInt2486, this.anInt2507 - this.anInt2478, this.anInt2501 - this.anInt2485);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(Z)V")
	private void method2040() {
		this.aFloat48 = (float) (this.anInt2485 - this.anInt2477);
		this.aFloat42 = (float) (this.anInt2478 - this.anInt2496);
		this.aFloat32 = (float) (this.anInt2501 - this.anInt2477);
		this.aFloat39 = (float) (this.anInt2507 - this.anInt2496);
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(IIIIII)Lclient!he;")
	@Override
	public Class141 method6168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean191 ? new Class141_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(JI)V")
	public synchronized void method2041(@OriginalArg(0) long arg0) {
		@Pc(13) Class3 local13 = new Class3();
		local13.aLong277 = arg0;
		this.aClass216_18.method5449(local13);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!lt;B)V")
	public void method2042(@OriginalArg(0) Interface15 arg0) {
		if (this.aBoolean199) {
			this.method2058(arg0);
			this.method2038(arg0);
		} else if (this.anInt2467 >= 0 && this.anInterface15Array3[this.anInt2467] == arg0) {
			this.anInterface15Array3[this.anInt2467--] = null;
			arg0.method2138();
			if (this.anInt2467 >= 0) {
				this.anInterface15_2 = this.anInterface15_1 = this.anInterface15Array3[this.anInt2467];
				this.anInterface15_2.method2140();
			} else {
				this.anInterface15_2 = this.anInterface15_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([IIIIIZ)Lclient!fd;")
	@Override
	public Class103 method6180(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class103_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!lt;I)V")
	public void method2043(@OriginalArg(0) Interface15 arg0) {
		if (this.aBoolean199) {
			this.method2099(arg0);
			this.method2081(arg0);
		} else if (this.anInt2467 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt2467 >= 0) {
				this.anInterface15Array3[this.anInt2467].method2138();
			}
			this.anInterface15_2 = this.anInterface15_1 = this.anInterface15Array3[++this.anInt2467] = arg0;
			this.anInterface15_2.method2140();
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I[BIZI)Lclient!pa;")
	public Interface17 method2044(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface17) (this.aBoolean182 && (!arg2 || this.aBoolean183) ? new Class239_Sub1(this, 5123, arg0, arg1, arg2) : new Class41_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "(I)V")
	public void method2045() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6173(@OriginalArg(0) Class3_Sub45 arg0) {
		this.aNativeHeap1 = ((Class3_Sub45_Sub1) arg0).aNativeHeap5;
		if (this.anInterface3_4 != null) {
			return;
		}
		@Pc(16) Class3_Sub9_Sub1 local16 = new Class3_Sub9_Sub1(80);
		if (this.aBoolean174) {
			local16.method706(-1.0F);
			local16.method706(-1.0F);
			local16.method706(0.0F);
			local16.method706(0.0F);
			local16.method706(1.0F);
			local16.method706(1.0F);
			local16.method706(-1.0F);
			local16.method706(0.0F);
			local16.method706(1.0F);
			local16.method706(1.0F);
			local16.method706(1.0F);
			local16.method706(1.0F);
			local16.method706(0.0F);
			local16.method706(1.0F);
			local16.method706(0.0F);
			local16.method706(-1.0F);
			local16.method706(1.0F);
			local16.method706(0.0F);
			local16.method706(0.0F);
			local16.method706(0.0F);
		} else {
			local16.method704(-1.0F);
			local16.method704(-1.0F);
			local16.method704(0.0F);
			local16.method704(0.0F);
			local16.method704(1.0F);
			local16.method704(1.0F);
			local16.method704(-1.0F);
			local16.method704(0.0F);
			local16.method704(1.0F);
			local16.method704(1.0F);
			local16.method704(1.0F);
			local16.method704(1.0F);
			local16.method704(0.0F);
			local16.method704(1.0F);
			local16.method704(0.0F);
			local16.method704(-1.0F);
			local16.method704(1.0F);
			local16.method704(0.0F);
			local16.method704(0.0F);
			local16.method704(0.0F);
		}
		this.anInterface3_4 = this.method2035(false, 20, local16.aByteArray51, local16.anInt6453);
		this.aClass313_9 = new Class313(this.anInterface3_4, 5126, 3, 0);
		this.aClass313_10 = new Class313(this.anInterface3_4, 5126, 2, 12);
		this.aClass52_1.method1248(this);
	}

	@OriginalMember(owner = "client!dw", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt2464 = 0;
		while (arg0 > 1) {
			this.anInt2464++;
			arg0 >>= 0x1;
		}
		this.anInt2465 = 0x1 << this.anInt2464;
	}

	@OriginalMember(owner = "client!dw", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2478;
		arg0[3] = this.anInt2501;
		arg0[2] = this.anInt2507;
		arg0[1] = this.anInt2485;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)Lclient!pw;")
	@Override
	public Interface19 method6163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!dw", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt2510;
		this.anInt2510 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "(I)V")
	private void method2046() {
		OpenGL.glDepthMask(this.aBoolean170 && this.aBoolean198);
	}

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "(B)V")
	private void method2047() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt2491; local7++) {
			@Pc(14) Class3_Sub22 local14 = this.aClass3_Sub22Array1[local7];
			Static149.aFloatArray14[0] = (float) local14.method8391();
			@Pc(25) int local25 = local7 + 16386;
			Static149.aFloatArray14[1] = (float) local14.method8383();
			Static149.aFloatArray14[2] = (float) local14.method8386();
			Static149.aFloatArray14[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static149.aFloatArray14, 0);
			@Pc(52) int local52 = local14.method8384();
			@Pc(58) float local58 = local14.method8387() / 255.0F;
			Static149.aFloatArray14[2] = (float) (local52 & 0xFF) * local58;
			Static149.aFloatArray14[0] = (float) (local52 >> 16 & 0xFF) * local58;
			Static149.aFloatArray14[1] = local58 * (float) (local52 >> 8 & 0xFF);
			OpenGL.glLightfv(local25, 4609, Static149.aFloatArray14, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method8382() * local14.method8382()));
			OpenGL.glEnable(local25);
		}
		while (this.anInt2499 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt2499 = this.anInt2491;
	}

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "(I)V")
	public void method2048() {
		if (this.anInt2473 == 8) {
			return;
		}
		this.method2069();
		this.method2051(true);
		this.method2055(true);
		this.method2032(true);
		this.method2085(1);
		this.anInt2473 = 8;
	}

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass31_Sub3_3.aFloat188 + (float) arg2 * this.aClass31_Sub3_3.aFloat182 + this.aClass31_Sub3_3.aFloat185 * (float) arg0 + (float) arg1 * this.aClass31_Sub3_3.aFloat181;
		@Pc(55) float local55 = this.aClass31_Sub3_3.aFloat181 * (float) arg4 + (float) arg3 * this.aClass31_Sub3_3.aFloat185 + (float) arg5 * this.aClass31_Sub3_3.aFloat182 + this.aClass31_Sub3_3.aFloat188;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt2483 > local30 && local55 < (float) this.anInt2483) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt2497 && (float) this.anInt2497 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt2482 * ((float) arg0 * this.aClass31_Sub3_3.aFloat186 + (float) arg1 * this.aClass31_Sub3_3.aFloat190 + (float) arg2 * this.aClass31_Sub3_3.aFloat187 + this.aClass31_Sub3_3.aFloat189) / (float) arg6);
		@Pc(157) int local157 = (int) ((this.aClass31_Sub3_3.aFloat189 + (float) arg4 * this.aClass31_Sub3_3.aFloat190 + (float) arg3 * this.aClass31_Sub3_3.aFloat186 + this.aClass31_Sub3_3.aFloat187 * (float) arg5) * (float) this.anInt2482 / (float) arg6);
		if (this.aFloat42 > (float) local124 && (float) local157 < this.aFloat42) {
			local57 |= 0x1;
		} else if (this.aFloat39 < (float) local124 && this.aFloat39 < (float) local157) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass31_Sub3_3.aFloat183 + this.aClass31_Sub3_3.aFloat184 * (float) arg1 + this.aClass31_Sub3_3.aFloat180 * (float) arg0 + this.aClass31_Sub3_3.aFloat191 * (float) arg2) * (float) this.anInt2489 / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt2489 * (this.aClass31_Sub3_3.aFloat183 + (float) arg5 * this.aClass31_Sub3_3.aFloat191 + this.aClass31_Sub3_3.aFloat184 * (float) arg4 + this.aClass31_Sub3_3.aFloat180 * (float) arg3) / (float) arg6);
		if ((float) local224 < this.aFloat48 && (float) local257 < this.aFloat48) {
			local57 |= 0x4;
		} else if (this.aFloat32 < (float) local224 && (float) local257 > this.aFloat32) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!dw", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat36 != arg0) {
			this.aFloat36 = arg0;
			this.method2076();
		}
	}

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "()Z")
	@Override
	public boolean method6129() {
		return true;
	}

	@OriginalMember(owner = "client!dw", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean187) {
			throw new RuntimeException("");
		}
		this.anInt2476 = arg3;
		this.anInt2487 = arg2;
		this.anInt2500 = arg0;
		this.anInt2480 = arg1;
		if (this.aBoolean173) {
			this.aClass90_1.aClass6_Sub6_1.method7607();
			this.aClass90_1.aClass6_Sub6_1.method7606();
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIB)V")
	public synchronized void method2049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class3_Sub51 local12 = new Class3_Sub51(arg0);
		local12.aLong277 = (long) arg1;
		this.aClass216_17.method5449(local12);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZZ)V")
	public void method2050(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean188 != arg0) {
			this.aBoolean188 = arg0;
			this.method2091();
		}
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6149(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas1) {
			local5 = this.aLong63;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas2) {
			this.method2037();
		}
	}

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "()V")
	@Override
	public void method6157() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "(I)V")
	@Override
	public void method6159(@OriginalArg(0) int arg0) {
		this.method2079();
	}

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "()Lclient!ih;")
	@Override
	public Class31 method6125() {
		return this.aClass31_Sub3_1;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(ZZ)V")
	public void method2051(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean181) {
			this.aBoolean181 = arg0;
			this.method2018();
			this.anInt2473 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "(B)V")
	private void method2052() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray13, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!pa;B)V")
	public void method2053(@OriginalArg(0) Interface17 arg0) {
		if (this.anInterface17_2 != arg0) {
			if (this.aBoolean182) {
				OpenGL.glBindBufferARB(34963, arg0.method5959());
			}
			this.anInterface17_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "()V")
	@Override
	public void method6130() {
		this.aClass358_1.method8335();
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "()Z")
	@Override
	public boolean method6111() {
		return true;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6122() {
		this.method2031();
		this.method2085(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!pw;Lclient!lh;)Lclient!di;")
	@Override
	public Interface7 method6143(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface14 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!dw", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt2450 - arg1 - local12, arg2, 1, 32993, this.anInt2488, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IF)V")
	public void method2054(@OriginalArg(1) float arg0) {
		if (this.aFloat29 == arg0) {
			return;
		}
		this.aFloat29 = arg0;
		if (this.anInt2506 == 3) {
			this.method2026();
			return;
		}
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(BZ)V")
	public void method2055(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean171 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean171 = arg0;
		this.anInt2473 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!dw", name = "u", descriptor = "()V")
	@Override
	public void method6167() {
		if (this.aBoolean185) {
			if (this.anInterface15_1 != this.aClass85_1) {
				throw new RuntimeException();
			}
			this.aClass85_1.method2145(0);
			this.aClass85_1.method2145(8);
			this.method2042(this.aClass85_1);
		} else if (this.aBoolean194) {
			this.aClass103_Sub1_1.method7443(0, 0, this.anInt2300, this.anInt2450, 0, 0);
			this.anOpenGL1.setSurface(this.aLong62);
		} else {
			throw new RuntimeException("");
		}
		this.aClass103_Sub1_1 = null;
		this.anInt2300 = this.anInt2271;
		this.anInt2450 = this.anInt2336;
		this.method2062();
		this.method2034();
		this.la();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg5;
		@Pc(9) Class94_Sub2_Sub1 local9 = local6.aClass94_Sub2_Sub1_5;
		this.method2060();
		this.method2029(local6.aClass94_Sub2_Sub1_5);
		this.method2085(1);
		this.method2077(7681, 8448);
		this.method2066(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat78 / (float) local9.anInt3664;
		@Pc(46) float local46 = local9.aFloat77 / (float) local9.anInt3671;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(60) float local60 = (float) -arg1 + (float) arg3;
		@Pc(73) float local73 = (float) (1.0D / Math.sqrt((double) (local60 * local60 + local53 * local53)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(92) float local92 = local60 * local73;
		@Pc(96) float local96 = local53 * local73;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local96 + 0.35F, (float) arg3 + local92 + 0.35F);
		OpenGL.glEnd();
		this.method2066(5890, 768, 0);
	}

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "(I)V")
	@Override
	public void method6155(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt2460 = arg0;
		this.aClass128_1.method2983();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static227.method3944(arg3, this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt2483 && arg1 == this.anInt2497) {
			return;
		}
		this.anInt2483 = arg0;
		this.anInt2497 = arg1;
		this.method2021();
		this.method2022();
		if (this.anInt2506 == 3) {
			this.method2026();
		} else if (this.anInt2506 == 2) {
			this.method2052();
		}
	}

	@OriginalMember(owner = "client!dw", name = "A", descriptor = "()Z")
	@Override
	public boolean method6183() {
		return this.aClass90_1.method2239();
	}

	@OriginalMember(owner = "client!dw", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass31_Sub3_3.aFloat188 + this.aClass31_Sub3_3.aFloat181 * (float) arg1 + (float) arg0 * this.aClass31_Sub3_3.aFloat185 + this.aClass31_Sub3_3.aFloat182 * (float) arg2;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg5 * this.aClass31_Sub3_3.aFloat182 + (float) arg3 * this.aClass31_Sub3_3.aFloat185 + this.aClass31_Sub3_3.aFloat181 * (float) arg4 + this.aClass31_Sub3_3.aFloat188;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt2483 && local63 < (float) this.anInt2483) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt2497 && local63 > (float) this.anInt2497) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt2482 * (this.aClass31_Sub3_3.aFloat189 + this.aClass31_Sub3_3.aFloat190 * (float) arg1 + (float) arg0 * this.aClass31_Sub3_3.aFloat186 + this.aClass31_Sub3_3.aFloat187 * (float) arg2) / local32);
		@Pc(167) int local167 = (int) ((this.aClass31_Sub3_3.aFloat189 + (float) arg3 * this.aClass31_Sub3_3.aFloat186 + this.aClass31_Sub3_3.aFloat190 * (float) arg4 + this.aClass31_Sub3_3.aFloat187 * (float) arg5) * (float) this.anInt2482 / local63);
		if (this.aFloat42 > (float) local135 && this.aFloat42 > (float) local167) {
			local7 |= 0x1;
		} else if (this.aFloat39 < (float) local135 && (float) local167 > this.aFloat39) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt2489 * (this.aClass31_Sub3_3.aFloat183 + (float) arg2 * this.aClass31_Sub3_3.aFloat191 + (float) arg0 * this.aClass31_Sub3_3.aFloat180 + (float) arg1 * this.aClass31_Sub3_3.aFloat184) / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt2489 * ((float) arg5 * this.aClass31_Sub3_3.aFloat191 + this.aClass31_Sub3_3.aFloat180 * (float) arg3 + this.aClass31_Sub3_3.aFloat184 * (float) arg4 + this.aClass31_Sub3_3.aFloat183) / local63);
		if (this.aFloat48 > (float) local233 && this.aFloat48 > (float) local265) {
			local7 |= 0x4;
		} else if (this.aFloat32 < (float) local233 && this.aFloat32 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!dw", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt2475 && arg1 == this.anInt2504 && arg2 == this.anInt2492) {
			return;
		}
		this.anInt2475 = arg0;
		this.anInt2504 = arg1;
		this.anInt2492 = arg2;
		this.method2022();
		this.method2018();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IFFF)V")
	private void method2056(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean190) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean190 = true;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BI)V")
	public void method2057(@OriginalArg(1) int arg0) {
		this.method2084(true, arg0);
	}

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "()Lclient!er;")
	@Override
	public Class98 method6119() {
		@Pc(7) int local7 = -1;
		if (this.aString14.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString14.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString14.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class98(local7, "OpenGL", this.anInt2508, this.aString15, 0L);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!lt;)V")
	public void method2058(@OriginalArg(1) Interface15 arg0) {
		if (this.anInt2466 < 0 || this.anInterface15Array2[this.anInt2466] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface15Array2[this.anInt2466--] = null;
		arg0.method2139();
		if (this.anInt2466 >= 0) {
			this.anInterface15_2 = this.anInterface15Array2[this.anInt2466];
			this.anInterface15_2.method2135();
		} else {
			this.anInterface15_2 = null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2031();
		this.method2085(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(24) float local24 = (float) -arg1 + (float) arg3;
		if (local17 == 0.0F && local24 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(49) float local49 = (float) (1.0D / Math.sqrt((double) (local24 * local24 + local17 * local17)));
			local17 *= local49;
			local24 *= local49;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local17 + 0.35F, local24 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIZ)Lclient!fd;")
	@Override
	public Class103 method6144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class103_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!dw", name = "t", descriptor = "(I)V")
	private void method2059() {
		this.method2057(-2);
		for (@Pc(14) int local14 = this.anInt2503 - 1; local14 >= 0; local14--) {
			this.method2086(local14);
			this.method2029((Class94) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method2077(8448, 8448);
		this.method2066(34168, 770, 2);
		this.method2061();
		this.anInt2474 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt2472 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean172 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean169 = true;
		this.method2051(true);
		this.method2028(true);
		this.method2055(true);
		this.method2032(true);
		this.method2062();
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
		this.anInt2479 = this.anInt2475 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!di;)V")
	@Override
	public void method6141(@OriginalArg(0) Interface7 arg0) {
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(Z)V")
	@Override
	public void method6128(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)I")
	@Override
	public int method6105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!dw", name = "u", descriptor = "(I)V")
	public void method2060() {
		if (this.anInt2473 == 2) {
			return;
		}
		this.method2030();
		this.method2051(false);
		this.method2028(false);
		this.method2055(false);
		this.method2032(false);
		this.method2057(-2);
		this.anInt2473 = 2;
	}

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "(B)V")
	private void method2061() {
		if (this.aBoolean190) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean190 = false;
		}
	}

	@OriginalMember(owner = "client!dw", name = "z", descriptor = "()Z")
	@Override
	public boolean method6177() {
		if (this.aClass3_Sub44_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub44_Sub1_1.method7732()) {
			if (!this.aClass358_1.method8341(this.aClass3_Sub44_Sub1_1)) {
				return false;
			}
			this.aClass128_1.method2983();
		}
		return true;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "()Z")
	@Override
	public boolean method6101() {
		return false;
	}

	@OriginalMember(owner = "client!dw", name = "v", descriptor = "(I)V")
	public void method2062() {
		if (this.anInt2506 != 0) {
			this.anInt2473 &= 0xFFFFFFE0;
			this.anInt2506 = 0;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIB)V")
	public void method2063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(Z)V")
	private void method2064() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass31_Sub3_4.method7942(), 0);
		if (this.aBoolean173) {
			this.aClass90_1.aClass6_Sub6_1.method7607();
		}
		this.method2092();
		this.method2047();
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(IIII)V")
	public void method2066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(BI)V")
	public synchronized void method2067(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub51 local14 = new Class3_Sub51(arg0);
		this.aClass216_16.method5449(local14);
	}

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "(II)V")
	public void method2068(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method2077(7681, 7681);
		} else if (arg0 == 0) {
			this.method2077(8448, 8448);
		} else if (arg0 == 2) {
			this.method2077(34165, 7681);
		} else if (arg0 == 3) {
			this.method2077(260, 8448);
		} else if (arg0 == 4) {
			this.method2077(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(Z)V")
	private void method2069() {
		if (this.anInt2506 != 2) {
			this.anInt2506 = 2;
			this.method2052();
			this.method2064();
			this.anInt2473 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIZ)Lclient!fd;")
	@Override
	public Class103 method6110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class103_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!tu;)V")
	public void method2070(@OriginalArg(1) Class31_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method7942(), 0);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6148(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6166(arg2, arg3);
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(II)I")
	@Override
	public int method6169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(II)Lclient!lh;")
	@Override
	public Interface14 method6182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BII)V")
	public void method2071(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2486 = arg1;
		this.anInt2484 = arg0;
		this.method2034();
		this.method2039();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I[Lclient!tj;)V")
	@Override
	public void method6100(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub22Array1[local7] = arg1[local7];
		}
		this.anInt2491 = arg0;
		if (this.anInt2506 != 1) {
			this.method2047();
		}
	}

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "(Z)I")
	private int method2072() {
		@Pc(5) int local5 = 0;
		this.aString14 = OpenGL.glGetString(7936).toLowerCase();
		this.aString15 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString14.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString14.indexOf("brian paul") != -1 || this.aString14.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static557.method7916(' ', local45.replace('.', ' '));
		if (local53.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(77) int local77 = Static508.method7720(local53[0]);
				@Pc(83) int local83 = Static508.method7720(local53[1]);
				this.anInt2508 = local83 + local77 * 10;
			} catch (@Pc(92) NumberFormatException local92) {
				local5 |= 0x4;
			}
		}
		if (this.anInt2508 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(128) int[] local128 = new int[1];
		OpenGL.glGetIntegerv(34018, local128, 0);
		this.anInt2503 = local128[0];
		OpenGL.glGetIntegerv(34929, local128, 0);
		this.anInt2505 = local128[0];
		OpenGL.glGetIntegerv(34930, local128, 0);
		this.anInt2494 = local128[0];
		if (this.anInt2503 < 2 || this.anInt2505 < 2 || this.anInt2494 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean174 = Stream.c();
		this.aBoolean194 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean182 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean179 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean189 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean186 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean177 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean193 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean176 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean191 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean195 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean180 = false;
		this.aBoolean185 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean199 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean178 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean192 = this.aBoolean199 & this.aBoolean178;
		this.aBoolean175 = Class82_Sub3_Sub1.aString25.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static526.aFloatArray89, 0);
		this.aFloat44 = Static526.aFloatArray89[0];
		this.aFloat46 = Static526.aFloatArray89[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ss;BLclient!ss;Lclient!ss;Lclient!ss;)V")
	public void method2073(@OriginalArg(0) Class313 arg0, @OriginalArg(2) Class313 arg1, @OriginalArg(3) Class313 arg2, @OriginalArg(4) Class313 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method2096(arg3.anInterface3_7);
			OpenGL.glVertexPointer(arg3.aByte105, arg3.aShort106, this.anInterface3_3.method8528(), this.anInterface3_3.method8531() + (long) arg3.aByte106);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method2096(arg2.anInterface3_7);
			OpenGL.glNormalPointer(arg2.aShort106, this.anInterface3_3.method8528(), this.anInterface3_3.method8531() + (long) arg2.aByte106);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method2096(arg0.anInterface3_7);
			OpenGL.glColorPointer(arg0.aByte105, arg0.aShort106, this.anInterface3_3.method8528(), this.anInterface3_3.method8531() + (long) arg0.aByte106);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method2096(arg1.anInterface3_7);
			OpenGL.glTexCoordPointer(arg1.aByte105, arg1.aShort106, this.anInterface3_3.method8528(), this.anInterface3_3.method8531() + (long) arg1.aByte106);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!dw", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2031();
		this.method2085(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!dw", name = "x", descriptor = "(I)V")
	private void method2074() {
		this.aClass94Array1 = new Class94[this.anInt2503];
		this.aClass94_Sub2_1 = new Class94_Sub2(this, 3553, 6408, 1, 1);
		new Class94_Sub2(this, 3553, 6408, 1, 1);
		new Class94_Sub2(this, 3553, 6408, 1, 1);
		this.aClass75_Sub1_3 = new Class75_Sub1(this);
		this.aClass75_Sub1_2 = new Class75_Sub1(this);
		this.aClass75_Sub1_4 = new Class75_Sub1(this);
		this.aClass75_Sub1_9 = new Class75_Sub1(this);
		this.aClass75_Sub1_8 = new Class75_Sub1(this);
		this.aClass75_Sub1_6 = new Class75_Sub1(this);
		this.aClass75_Sub1_1 = new Class75_Sub1(this);
		this.aClass75_Sub1_10 = new Class75_Sub1(this);
		this.aClass75_Sub1_7 = new Class75_Sub1(this);
		this.aClass75_Sub1_5 = new Class75_Sub1(this);
		if (this.aBoolean185) {
			this.aClass85_2 = new Class85(this);
			new Class85(this);
		}
	}

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "(B)V")
	private void method2075() {
		Static526.aFloatArray89[0] = this.aFloat40 * this.aFloat31;
		Static526.aFloatArray89[1] = this.aFloat31 * this.aFloat34;
		Static526.aFloatArray89[3] = 1.0F;
		Static526.aFloatArray89[2] = this.aFloat31 * this.aFloat35;
		OpenGL.glLightfv(16384, 4609, Static526.aFloatArray89, 0);
		Static526.aFloatArray89[2] = this.aFloat35 * -this.aFloat47;
		Static526.aFloatArray89[0] = -this.aFloat47 * this.aFloat40;
		Static526.aFloatArray89[1] = -this.aFloat47 * this.aFloat34;
		Static526.aFloatArray89[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static526.aFloatArray89, 0);
	}

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "(B)V")
	private void method2076() {
		Static526.aFloatArray89[0] = this.aFloat40 * this.aFloat36;
		Static526.aFloatArray89[2] = this.aFloat36 * this.aFloat35;
		Static526.aFloatArray89[1] = this.aFloat34 * this.aFloat36;
		Static526.aFloatArray89[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static526.aFloatArray89, 0);
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(BII)V")
	public void method2077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2481 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(14) boolean local14 = false;
		if (this.anInt2502 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt2502 = arg0;
			local14 = true;
		}
		if (arg1 != this.anInt2493) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local14 = true;
			this.anInt2493 = arg1;
		}
		if (local14) {
			this.anInt2473 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6140(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas1) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(BI)I")
	public int method2078(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!dw", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt2479;
		if (local15 || arg1 != this.aFloat31 || this.aFloat47 != arg2) {
			this.aFloat47 = arg2;
			this.aFloat31 = arg1;
			this.anInt2479 = arg0;
			if (local15) {
				this.aFloat34 = (float) (this.anInt2479 & 0xFF00) / 65280.0F;
				this.aFloat35 = (float) (this.anInt2479 & 0xFF) / 255.0F;
				this.aFloat40 = (float) (this.anInt2479 & 0xFF0000) / 1.671168E7F;
				this.method2076();
			}
			this.method2075();
		}
		if (arg3 == this.aFloatArray12[0] && this.aFloatArray12[1] == arg4 && this.aFloatArray12[2] == arg5) {
			return;
		}
		this.aFloatArray12[0] = arg3;
		this.aFloatArray12[1] = arg4;
		this.aFloatArray12[2] = arg5;
		this.aFloatArray9[2] = -arg5;
		this.aFloatArray9[1] = -arg4;
		this.aFloatArray9[0] = -arg3;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray11[1] = arg4 * local142;
		this.aFloatArray11[2] = arg5 * local142;
		this.aFloatArray11[0] = arg3 * local142;
		this.aFloatArray10[1] = -this.aFloatArray11[1];
		this.aFloatArray10[2] = -this.aFloatArray11[2];
		this.aFloatArray10[0] = -this.aFloatArray11[0];
		this.method2092();
		this.anInt2490 = (int) (arg3 * 256.0F / arg4);
		this.anInt2498 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ik;I)V")
	@Override
	public void method6107(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1) {
		this.aClass52_1.method1247(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt2483;
	}

	@OriginalMember(owner = "client!dw", name = "y", descriptor = "(I)V")
	private void method2079() {
		this.anOpenGL1.a();
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(II)V")
	@Override
	public void method6166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method6132(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class3_Sub51 local19;
		while (!this.aClass216_14.method5455()) {
			local19 = (Class3_Sub51) this.aClass216_14.method5462();
			Static241.anIntArray263[local7++] = (int) local19.aLong277;
			this.anInt2471 -= local19.anInt9787;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static241.anIntArray263, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static241.anIntArray263, 0);
			local7 = 0;
		}
		while (!this.aClass216_15.method5455()) {
			local19 = (Class3_Sub51) this.aClass216_15.method5462();
			Static241.anIntArray263[local7++] = (int) local19.aLong277;
			this.anInt2470 -= local19.anInt9787;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static241.anIntArray263, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static241.anIntArray263, 0);
			local7 = 0;
		}
		while (!this.aClass216_16.method5455()) {
			local19 = (Class3_Sub51) this.aClass216_16.method5462();
			Static241.anIntArray263[local7++] = local19.anInt9787;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static241.anIntArray263, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static241.anIntArray263, 0);
			local7 = 0;
		}
		while (!this.aClass216_17.method5455()) {
			local19 = (Class3_Sub51) this.aClass216_17.method5462();
			Static241.anIntArray263[local7++] = (int) local19.aLong277;
			this.anInt2469 -= local19.anInt9787;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static241.anIntArray263, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static241.anIntArray263, 0);
		}
		while (!this.aClass216_13.method5455()) {
			local19 = (Class3_Sub51) this.aClass216_13.method5462();
			OpenGL.glDeleteLists((int) local19.aLong277, local19.anInt9787);
		}
		@Pc(214) Class3 local214;
		while (!this.bf.method5455()) {
			local214 = this.bf.method5462();
			OpenGL.glDeleteProgramARB((int) local214.aLong277);
		}
		while (!this.aClass216_18.method5455()) {
			local214 = this.aClass216_18.method5462();
			OpenGL.glDeleteObjectARB(local214.aLong277);
		}
		while (!this.aClass216_13.method5455()) {
			local19 = (Class3_Sub51) this.aClass216_13.method5462();
			OpenGL.glDeleteLists((int) local19.aLong277, local19.anInt9787);
		}
		this.aClass128_1.method2985();
		if (this.E() > 100663296 && Static191.method3071() > this.aLong65 + 60000L) {
			System.gc();
			this.aLong65 = Static191.method3071();
		}
		this.anInt2463 = local11;
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "()Z")
	@Override
	public boolean method6113() {
		return true;
	}

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "()V")
	@Override
	protected void method6121() {
		for (@Pc(6) Class3 local6 = this.aClass216_12.method5457(); local6 != null; local6 = this.aClass216_12.method5458()) {
			((Class3_Sub45_Sub1) local6).method7112();
		}
		if (this.aClass358_1 != null) {
			this.aClass358_1.method8334();
		}
		if (this.anOpenGL1 != null) {
			this.method2079();
			@Pc(40) Enumeration local40 = this.aHashtable2.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable2.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean168) {
			Static92.method1552(false, true);
			this.aBoolean168 = false;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(FIF)V")
	public void method2080(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat45 = arg0;
		this.aFloat41 = arg1;
		this.method2022();
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(ILclient!lt;)V")
	public void method2081(@OriginalArg(1) Interface15 arg0) {
		if (this.anInt2468 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2468 >= 0) {
			this.anInterface15Array1[this.anInt2468].method2137();
		}
		this.anInterface15_1 = this.anInterface15Array1[++this.anInt2468] = arg0;
		this.anInterface15_1.method2136();
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub45 method6138(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub45_Sub1 local8 = new Class3_Sub45_Sub1(arg0);
		this.aClass216_12.method5449(local8);
		return local8;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V")
	@Override
	public void method6109(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "(II)I")
	public int method2083(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZZI)V")
	public void method2084(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method2027(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "(II)V")
	public void method2085(@OriginalArg(1) int arg0) {
		if (this.anInt2474 == arg0) {
			return;
		}
		@Pc(14) boolean local14;
		@Pc(16) byte local16;
		if (arg0 == 1) {
			local14 = true;
			local16 = 1;
		} else if (arg0 == 2) {
			local14 = false;
			local16 = 2;
		} else if (arg0 == 128) {
			local14 = true;
			local16 = 3;
		} else {
			local14 = false;
			local16 = 0;
		}
		if (!this.aBoolean169) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean169 = true;
		}
		if (this.aBoolean172 != local14) {
			if (local14) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean172 = local14;
		}
		if (this.anInt2472 != local16) {
			if (local16 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local16 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local16 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt2472 = local16;
		}
		this.anInt2474 = arg0;
		this.anInt2473 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(BI)V")
	public void method2086(@OriginalArg(1) int arg0) {
		if (this.anInt2481 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt2481 = arg0;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(FFFFB)V")
	public void method2087(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static526.aFloatArray89[2] = arg0;
		Static526.aFloatArray89[3] = arg1;
		Static526.aFloatArray89[0] = arg3;
		Static526.aFloatArray89[1] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static526.aFloatArray89, 0);
	}

	@OriginalMember(owner = "client!dw", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean198 = arg0;
		this.method2046();
	}

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "(B)V")
	public void method2088() {
		if (this.anInt2473 == 16) {
			return;
		}
		this.method2098();
		this.method2051(true);
		this.method2055(true);
		this.method2032(true);
		this.method2085(1);
		this.anInt2473 = 16;
	}

	@OriginalMember(owner = "client!dw", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass31_Sub3_3.aFloat188 + this.aClass31_Sub3_3.aFloat182 * (float) arg2 + this.aClass31_Sub3_3.aFloat185 * (float) arg0 + this.aClass31_Sub3_3.aFloat181 * (float) arg1;
		if ((float) this.anInt2483 > local28 || local28 > (float) this.anInt2497) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((float) this.anInt2482 * (this.aClass31_Sub3_3.aFloat189 + (float) arg0 * this.aClass31_Sub3_3.aFloat186 + (float) arg1 * this.aClass31_Sub3_3.aFloat190 + (float) arg2 * this.aClass31_Sub3_3.aFloat187) / (float) arg3);
		@Pc(119) int local119 = (int) ((float) this.anInt2489 * (this.aClass31_Sub3_3.aFloat183 + this.aClass31_Sub3_3.aFloat191 * (float) arg2 + (float) arg1 * this.aClass31_Sub3_3.aFloat184 + (float) arg0 * this.aClass31_Sub3_3.aFloat180) / (float) arg3);
		if ((float) local86 >= this.aFloat42 && this.aFloat39 >= (float) local86 && (float) local119 >= this.aFloat48 && this.aFloat32 >= (float) local119) {
			arg4[0] = (int) ((float) local86 - this.aFloat42);
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local119 - this.aFloat48);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "(I)V")
	@Override
	public void method6165(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method6179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method2031();
		this.method2085(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean179) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean179) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6164(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!dw", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt2470 + this.anInt2471 + this.anInt2469;
	}

	@OriginalMember(owner = "client!dw", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2482 = arg2;
		this.anInt2489 = arg3;
		this.anInt2477 = arg1;
		this.anInt2496 = arg0;
		this.method2021();
		this.method2040();
		if (this.anInt2506 == 3) {
			this.method2026();
		} else if (this.anInt2506 == 2) {
			this.method2052();
		}
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(IIII)V")
	public void method2089(@OriginalArg(0) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!dw", name = "y", descriptor = "()Z")
	@Override
	public boolean method6175() {
		return true;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "()Z")
	@Override
	public boolean method6103() {
		return this.aClass3_Sub44_Sub1_1 != null && this.aClass3_Sub44_Sub1_1.method7732();
	}

	@OriginalMember(owner = "client!dw", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(57) float local57;
		@Pc(45) float local45;
		if (this.aClass94_Sub2_Sub1_1 == null || arg2 > this.aClass94_Sub2_Sub1_1.anInt3653 || this.aClass94_Sub2_Sub1_1.anInt3659 < arg3) {
			this.aClass94_Sub2_Sub1_1 = Static301.method5120(arg2, this, arg3, arg6);
			this.aClass94_Sub2_Sub1_1.method3120(false, false);
			local57 = this.aClass94_Sub2_Sub1_1.aFloat77;
			local45 = this.aClass94_Sub2_Sub1_1.aFloat78;
		} else {
			this.aClass94_Sub2_Sub1_1.method3125(arg6, arg2, false, arg3, 6406);
			local45 = (float) arg2 * this.aClass94_Sub2_Sub1_1.aFloat78 / (float) this.aClass94_Sub2_Sub1_1.anInt3653;
			local57 = (float) arg3 * this.aClass94_Sub2_Sub1_1.aFloat77 / (float) this.aClass94_Sub2_Sub1_1.anInt3659;
		}
		this.method2060();
		this.method2029(this.aClass94_Sub2_Sub1_1);
		this.method2085(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2100(arg5);
		this.method2077(34165, 34165);
		this.method2066(34166, 768, 0);
		this.method2066(5890, 770, 2);
		this.method2063(34166, 0);
		this.method2063(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = (float) arg3 + local150;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local57, local45);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local57, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method2066(5890, 768, 0);
		this.method2066(34166, 770, 2);
		this.method2063(5890, 0);
		this.method2063(34166, 2);
	}

	@OriginalMember(owner = "client!dw", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt2300) {
			arg2 = this.anInt2300;
		}
		if (arg3 > this.anInt2450) {
			arg3 = this.anInt2450;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt2501 = arg3;
		this.anInt2478 = arg0;
		this.anInt2507 = arg2;
		this.anInt2485 = arg1;
		OpenGL.glEnable(3089);
		this.method2040();
		this.method2039();
	}

	@OriginalMember(owner = "client!dw", name = "z", descriptor = "(I)V")
	private void method2090() {
		this.aFloatArray13[10] = this.aFloat30;
		this.aFloatArray13[14] = this.aFloat37;
		this.aFloat28 = (float) this.anInt2497;
		this.aFloat33 = (this.aFloatArray13[14] - (float) this.anInt2497) / this.aFloatArray13[10];
	}

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "()Z")
	@Override
	public boolean method6158() {
		return true;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ej;[Lclient!oia;Z)Lclient!da;")
	@Override
	public Class63 method6127(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class251[] arg1) {
		return new Class63_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "(B)V")
	private void method2091() {
		if (this.aBoolean184 && !this.aBoolean188) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "(B)V")
	public void method2092() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray11, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray10, 0);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!tu;I)V")
	public void method2093(@OriginalArg(0) Class31_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method7942(), 0);
	}

	@OriginalMember(owner = "client!dw", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2485 < arg1) {
			this.anInt2485 = arg1;
		}
		if (this.anInt2501 > arg3) {
			this.anInt2501 = arg3;
		}
		if (this.anInt2507 > arg2) {
			this.anInt2507 = arg2;
		}
		if (this.anInt2478 < arg0) {
			this.anInt2478 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method2040();
		this.method2039();
	}

	@OriginalMember(owner = "client!dw", name = "A", descriptor = "(I)V")
	public void method2094() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!dw", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean187 = false;
	}

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "(B)V")
	private void method2095() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL1.b()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static143.method2414(1000L);
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!bia;I)V")
	public void method2096(@OriginalArg(0) Interface3 arg0) {
		if (this.anInterface3_3 != arg0) {
			if (this.aBoolean182) {
				OpenGL.glBindBufferARB(34962, arg0.method8529());
			}
			this.anInterface3_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!vo;IIII)Lclient!ka;")
	@Override
	public Class75 method6176(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class75_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(BII)V")
	public synchronized void method2097(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub51 local12 = new Class3_Sub51(arg1);
		local12.aLong277 = (long) arg0;
		this.aClass216_14.method5449(local12);
	}

	@OriginalMember(owner = "client!dw", name = "B", descriptor = "(I)V")
	private void method2098() {
		if (this.anInt2506 != 3) {
			this.anInt2506 = 3;
			this.method2026();
			this.method2064();
			this.anInt2473 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(ILclient!lt;)V")
	public void method2099(@OriginalArg(1) Interface15 arg0) {
		if (this.anInt2466 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2466 >= 0) {
			this.anInterface15Array2[this.anInt2466].method2139();
		}
		this.anInterface15_2 = this.anInterface15Array2[++this.anInt2466] = arg0;
		this.anInterface15_2.method2135();
	}

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "()Z")
	@Override
	public boolean method6120() {
		return true;
	}

	@OriginalMember(owner = "client!dw", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt2478 || arg0 - arg2 > this.anInt2507 || arg1 + arg2 < this.anInt2485 || arg1 - arg2 > this.anInt2501) {
			return;
		}
		this.method2031();
		this.method2085(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(69) float local69 = (float) arg0 + 0.35F;
		@Pc(74) float local74 = (float) arg1 + 0.35F;
		@Pc(78) int local78 = arg2 << 1;
		if ((float) local78 < this.aFloat44) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local69 + 1.0F, local74 + 1.0F);
			OpenGL.glVertex2f(local69 + 1.0F, -1.0F + local74);
			OpenGL.glVertex2f(local69 - 1.0F, local74 - 1.0F);
			OpenGL.glVertex2f(local69 - 1.0F, local74 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local78 <= this.aFloat46) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local78);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local69, local74);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local69, local74);
			@Pc(147) int local147 = 262144 / (arg2 * 6);
			if (local147 <= 64) {
				local147 = 64;
			} else if (local147 > 512) {
				local147 = 512;
			}
			local147 = Static107.method1798(local147);
			OpenGL.glVertex2f(local69 + (float) arg2, local74);
			for (@Pc(178) int local178 = 16384 - local147; local178 > 0; local178 -= local147) {
				OpenGL.glVertex2f(local69 + (float) arg2 * Class63.aFloatArray91[local178], local74 + Class63.aFloatArray90[local178] * (float) arg2);
			}
			OpenGL.glVertex2f(local69 + (float) arg2, local74);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		@Pc(23) Class1_Sub1 local23 = (Class1_Sub1) arg5;
		@Pc(26) Class94_Sub2_Sub1 local26 = local23.aClass94_Sub2_Sub1_5;
		this.method2060();
		this.method2029(local23.aClass94_Sub2_Sub1_5);
		this.method2085(1);
		this.method2077(7681, 8448);
		this.method2066(34167, 768, 0);
		@Pc(56) float local56 = local26.aFloat78 / (float) local26.anInt3664;
		@Pc(63) float local63 = local26.aFloat77 / (float) local26.anInt3671;
		@Pc(69) float local69 = (float) arg2 - (float) arg0;
		@Pc(75) float local75 = (float) arg3 - (float) arg1;
		@Pc(88) float local88 = (float) (1.0D / Math.sqrt((double) (local69 * local69 + local75 * local75)));
		@Pc(92) float local92 = local69 * local88;
		@Pc(98) int local98 = arg10 % (arg8 + arg9);
		@Pc(102) float local102 = local75 * local88;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(122) float local122 = local92 * (float) arg8;
		@Pc(127) float local127 = (float) arg8 * local102;
		@Pc(129) float local129 = 0.0F;
		@Pc(131) float local131 = 0.0F;
		@Pc(133) float local133 = local122;
		@Pc(135) float local135 = local127;
		if (local98 <= arg8) {
			local135 = local102 * (float) (arg8 - local98);
			local133 = local92 * (float) (arg8 - local98);
		} else {
			local131 = local102 * (float) (arg9 + arg8 - local98);
			local129 = (float) (arg9 + arg8 - local98) * local92;
		}
		@Pc(183) float local183 = (float) arg0 + local129 + 0.35F;
		@Pc(190) float local190 = local131 + (float) arg1 + 0.35F;
		@Pc(195) float local195 = local92 * (float) arg9;
		@Pc(200) float local200 = local102 * (float) arg9;
		while (true) {
			if (arg0 >= arg2) {
				if ((float) arg2 + 0.35F > local183) {
					break;
				}
				if ((float) arg2 > local133 + local183) {
					local133 = (float) arg2 - local183;
				}
			} else {
				if (local183 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local133 + local183) {
					local133 = (float) arg2 - local183;
				}
			}
			if (arg3 <= arg1) {
				if ((float) arg3 + 0.35F > local190) {
					break;
				}
				if ((float) arg3 > local135 + local190) {
					local135 = (float) arg3 - local190;
				}
			} else {
				if (local190 > (float) arg3 + 0.35F) {
					break;
				}
				if (local135 + local190 > (float) arg3) {
					local135 = (float) arg3 - local190;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local56 * (local183 - (float) arg6), ((float) -arg7 + local190) * local63);
			OpenGL.glVertex2f(local183, local190);
			OpenGL.glTexCoord2f(local56 * (local183 + local133 - (float) arg6), ((float) -arg7 + local135 + local190) * local63);
			OpenGL.glVertex2f(local183 + local133, local135 + local190);
			local183 += local195 + local133;
			OpenGL.glEnd();
			local190 += local135 + local200;
			local135 = local127;
			local133 = local122;
		}
		this.method2066(5890, 768, 0);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass358_1.method8342(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6102(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static27.aFloat7 = arg1;
		Static488.aFloat155 = arg2;
		Static76.aFloat25 = arg0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IB)V")
	public void method2100(@OriginalArg(0) int arg0) {
		Static526.aFloatArray89[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static526.aFloatArray89[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static526.aFloatArray89[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static526.aFloatArray89[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static526.aFloatArray89, 0);
	}
}
