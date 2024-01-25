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

@OriginalClass("client!ih")
public final class Class106_Sub2 extends Class106 {

	@OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
	private int anInt3569;

	@OriginalMember(owner = "client!ih", name = "mb", descriptor = "I")
	public int anInt3589;

	@OriginalMember(owner = "client!ih", name = "Hb", descriptor = "I")
	private int anInt3609;

	@OriginalMember(owner = "client!ih", name = "Jd", descriptor = "I")
	public int anInt3713;

	@OriginalMember(owner = "client!ih", name = "qe", descriptor = "I")
	public int anInt3735;

	@OriginalMember(owner = "client!ih", name = "re", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!ih", name = "ve", descriptor = "Lclient!h;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!ih", name = "ye", descriptor = "Lclient!h;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!ih", name = "Ae", descriptor = "I")
	public int anInt3739;

	@OriginalMember(owner = "client!ih", name = "Ce", descriptor = "I")
	public int anInt3740;

	@OriginalMember(owner = "client!ih", name = "De", descriptor = "I")
	private int anInt3741;

	@OriginalMember(owner = "client!ih", name = "Le", descriptor = "I")
	private int anInt3742;

	@OriginalMember(owner = "client!ih", name = "Pe", descriptor = "I")
	private int anInt3746;

	@OriginalMember(owner = "client!ih", name = "Se", descriptor = "I")
	private int anInt3749;

	@OriginalMember(owner = "client!ih", name = "Ve", descriptor = "Z")
	public boolean aBoolean210;

	@OriginalMember(owner = "client!ih", name = "We", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!ih", name = "Ze", descriptor = "Z")
	private boolean aBoolean211;

	@OriginalMember(owner = "client!ih", name = "af", descriptor = "Lclient!ig;")
	private Interface3 anInterface3_4;

	@OriginalMember(owner = "client!ih", name = "cf", descriptor = "Z")
	private boolean aBoolean212;

	@OriginalMember(owner = "client!ih", name = "ff", descriptor = "I")
	public int anInt3754;

	@OriginalMember(owner = "client!ih", name = "jf", descriptor = "Lclient!at;")
	public Class17_Sub1 aClass17_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "kf", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!ih", name = "mf", descriptor = "Lclient!jk;")
	public Class131 aClass131_1;

	@OriginalMember(owner = "client!ih", name = "nf", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!ih", name = "of", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!ih", name = "qf", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!ih", name = "wf", descriptor = "Z")
	private boolean aBoolean214;

	@OriginalMember(owner = "client!ih", name = "zf", descriptor = "F")
	private float aFloat49;

	@OriginalMember(owner = "client!ih", name = "Af", descriptor = "Lclient!at;")
	public Class17_Sub1 aClass17_Sub1_2;

	@OriginalMember(owner = "client!ih", name = "Bf", descriptor = "I")
	private int anInt3757;

	@OriginalMember(owner = "client!ih", name = "Gf", descriptor = "Lclient!at;")
	public Class17_Sub1 aClass17_Sub1_3;

	@OriginalMember(owner = "client!ih", name = "Lf", descriptor = "Lclient!at;")
	public Class17_Sub1 aClass17_Sub1_4;

	@OriginalMember(owner = "client!ih", name = "Mf", descriptor = "Lclient!nb;")
	public Class40_Sub2 aClass40_Sub2_3;

	@OriginalMember(owner = "client!ih", name = "Nf", descriptor = "I")
	private int anInt3761;

	@OriginalMember(owner = "client!ih", name = "Of", descriptor = "Lclient!at;")
	public Class17_Sub1 aClass17_Sub1_5;

	@OriginalMember(owner = "client!ih", name = "Pf", descriptor = "I")
	private int anInt3762;

	@OriginalMember(owner = "client!ih", name = "Qf", descriptor = "Lclient!on;")
	private Class86_Sub1 aClass86_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "Rf", descriptor = "Ljava/lang/String;")
	private String aString32;

	@OriginalMember(owner = "client!ih", name = "Sf", descriptor = "Z")
	public boolean aBoolean218;

	@OriginalMember(owner = "client!ih", name = "Tf", descriptor = "Lclient!at;")
	public Class17_Sub1 aClass17_Sub1_6;

	@OriginalMember(owner = "client!ih", name = "Uf", descriptor = "Lclient!oi;")
	private Interface10 anInterface10_3;

	@OriginalMember(owner = "client!ih", name = "Vf", descriptor = "Z")
	public boolean aBoolean219;

	@OriginalMember(owner = "client!ih", name = "Wf", descriptor = "Lclient!nb;")
	public Class40_Sub2 aClass40_Sub2_4;

	@OriginalMember(owner = "client!ih", name = "Xf", descriptor = "I")
	private int anInt3763;

	@OriginalMember(owner = "client!ih", name = "Zf", descriptor = "I")
	public int anInt3764;

	@OriginalMember(owner = "client!ih", name = "ag", descriptor = "Z")
	private boolean aBoolean221;

	@OriginalMember(owner = "client!ih", name = "cg", descriptor = "Lclient!nn;")
	public Class179 aClass179_11;

	@OriginalMember(owner = "client!ih", name = "dg", descriptor = "Lclient!gq;")
	private Class8_Sub1_Sub1 aClass8_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ih", name = "eg", descriptor = "Z")
	public boolean aBoolean223;

	@OriginalMember(owner = "client!ih", name = "hg", descriptor = "Lclient!ah;")
	public Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "jg", descriptor = "I")
	private int anInt3765;

	@OriginalMember(owner = "client!ih", name = "kg", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!ih", name = "lg", descriptor = "F")
	private float aFloat53;

	@OriginalMember(owner = "client!ih", name = "mg", descriptor = "Lclient!nn;")
	public Class179 aClass179_12;

	@OriginalMember(owner = "client!ih", name = "ng", descriptor = "Z")
	private boolean aBoolean225;

	@OriginalMember(owner = "client!ih", name = "og", descriptor = "I")
	public int anInt3766;

	@OriginalMember(owner = "client!ih", name = "qg", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!ih", name = "rg", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!ih", name = "sg", descriptor = "Z")
	private boolean aBoolean226;

	@OriginalMember(owner = "client!ih", name = "tg", descriptor = "Z")
	public boolean aBoolean227;

	@OriginalMember(owner = "client!ih", name = "ug", descriptor = "Z")
	private boolean aBoolean228;

	@OriginalMember(owner = "client!ih", name = "vg", descriptor = "Z")
	private boolean aBoolean229;

	@OriginalMember(owner = "client!ih", name = "wg", descriptor = "Lclient!at;")
	public Class17_Sub1 aClass17_Sub1_7;

	@OriginalMember(owner = "client!ih", name = "xg", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!ih", name = "yg", descriptor = "F")
	private float aFloat57;

	@OriginalMember(owner = "client!ih", name = "zg", descriptor = "Z")
	private boolean aBoolean230;

	@OriginalMember(owner = "client!ih", name = "Ag", descriptor = "I")
	private int anInt3768;

	@OriginalMember(owner = "client!ih", name = "Bg", descriptor = "Lclient!ig;")
	private Interface3 anInterface3_5;

	@OriginalMember(owner = "client!ih", name = "Cg", descriptor = "[Lclient!kk;")
	private Class8[] aClass8Array1;

	@OriginalMember(owner = "client!ih", name = "Dg", descriptor = "I")
	private int anInt3769;

	@OriginalMember(owner = "client!ih", name = "Fg", descriptor = "Z")
	public boolean aBoolean231;

	@OriginalMember(owner = "client!ih", name = "Gg", descriptor = "Z")
	public boolean aBoolean232;

	@OriginalMember(owner = "client!ih", name = "Hg", descriptor = "I")
	public int anInt3771;

	@OriginalMember(owner = "client!ih", name = "Ig", descriptor = "Lclient!at;")
	public Class17_Sub1 aClass17_Sub1_8;

	@OriginalMember(owner = "client!ih", name = "Ng", descriptor = "I")
	private int anInt3775;

	@OriginalMember(owner = "client!ih", name = "Rg", descriptor = "Lclient!at;")
	public Class17_Sub1 aClass17_Sub1_9;

	@OriginalMember(owner = "client!ih", name = "Sg", descriptor = "Z")
	private boolean aBoolean234;

	@OriginalMember(owner = "client!ih", name = "Vg", descriptor = "Lclient!at;")
	public Class17_Sub1 aClass17_Sub1_10;

	@OriginalMember(owner = "client!ih", name = "Wg", descriptor = "Z")
	public boolean aBoolean235;

	@OriginalMember(owner = "client!ih", name = "Yg", descriptor = "Z")
	public boolean aBoolean236;

	@OriginalMember(owner = "client!ih", name = "bh", descriptor = "I")
	private int anInt3779;

	@OriginalMember(owner = "client!ih", name = "ch", descriptor = "I")
	private int anInt3780;

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!ih", name = "ie", descriptor = "I")
	public int anInt3732 = 128;

	@OriginalMember(owner = "client!ih", name = "ce", descriptor = "Lclient!kb;")
	private final Class140 aClass140_1 = new Class140();

	@OriginalMember(owner = "client!ih", name = "je", descriptor = "Lclient!nb;")
	private final Class40_Sub2 aClass40_Sub2_1 = new Class40_Sub2();

	@OriginalMember(owner = "client!ih", name = "ke", descriptor = "Lclient!nb;")
	public final Class40_Sub2 aClass40_Sub2_2 = new Class40_Sub2();

	@OriginalMember(owner = "client!ih", name = "me", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!ih", name = "oe", descriptor = "I")
	public int anInt3733 = 8;

	@OriginalMember(owner = "client!ih", name = "pe", descriptor = "I")
	public int anInt3734 = 3;

	@OriginalMember(owner = "client!ih", name = "ne", descriptor = "Lclient!pu;")
	private final Class203 aClass203_23 = new Class203();

	@OriginalMember(owner = "client!ih", name = "te", descriptor = "I")
	private int anInt3737 = -1;

	@OriginalMember(owner = "client!ih", name = "se", descriptor = "I")
	private int anInt3736 = -1;

	@OriginalMember(owner = "client!ih", name = "xe", descriptor = "[Lclient!h;")
	private final Interface2[] anInterface2Array2 = new Interface2[4];

	@OriginalMember(owner = "client!ih", name = "ze", descriptor = "[Lclient!h;")
	private final Interface2[] anInterface2Array3 = new Interface2[4];

	@OriginalMember(owner = "client!ih", name = "ue", descriptor = "I")
	private int anInt3738 = -1;

	@OriginalMember(owner = "client!ih", name = "we", descriptor = "[Lclient!h;")
	private final Interface2[] anInterface2Array1 = new Interface2[4];

	@OriginalMember(owner = "client!ih", name = "Be", descriptor = "Lclient!pu;")
	private final Class203 aClass203_24;

	@OriginalMember(owner = "client!ih", name = "Ee", descriptor = "Lclient!pu;")
	private final Class203 aClass203_25;

	@OriginalMember(owner = "client!ih", name = "Fe", descriptor = "Lclient!pu;")
	private final Class203 aClass203_26;

	@OriginalMember(owner = "client!ih", name = "Ge", descriptor = "Lclient!pu;")
	private final Class203 aClass203_27;

	@OriginalMember(owner = "client!ih", name = "He", descriptor = "Lclient!pu;")
	private final Class203 aClass203_28;

	@OriginalMember(owner = "client!ih", name = "Ie", descriptor = "Lclient!pu;")
	private final Class203 aClass203_29;

	@OriginalMember(owner = "client!ih", name = "Je", descriptor = "Lclient!pu;")
	private final Class203 aClass203_30;

	@OriginalMember(owner = "client!ih", name = "Xe", descriptor = "I")
	private int anInt3751;

	@OriginalMember(owner = "client!ih", name = "Me", descriptor = "I")
	private int anInt3743;

	@OriginalMember(owner = "client!ih", name = "pf", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!ih", name = "Ye", descriptor = "I")
	public int anInt3752;

	@OriginalMember(owner = "client!ih", name = "Re", descriptor = "I")
	private int anInt3748;

	@OriginalMember(owner = "client!ih", name = "Ke", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!ih", name = "Kf", descriptor = "I")
	private int anInt3760;

	@OriginalMember(owner = "client!ih", name = "Ff", descriptor = "[Lclient!ja;")
	private final Class1_Sub4[] aClass1_Sub4Array3;

	@OriginalMember(owner = "client!ih", name = "rf", descriptor = "[F")
	private final float[] aFloatArray16;

	@OriginalMember(owner = "client!ih", name = "Ef", descriptor = "[F")
	private final float[] aFloatArray17;

	@OriginalMember(owner = "client!ih", name = "hf", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!ih", name = "Ne", descriptor = "I")
	private int anInt3744;

	@OriginalMember(owner = "client!ih", name = "Qe", descriptor = "I")
	public int anInt3747;

	@OriginalMember(owner = "client!ih", name = "gf", descriptor = "[F")
	private final float[] aFloatArray15;

	@OriginalMember(owner = "client!ih", name = "bf", descriptor = "F")
	public float bf;

	@OriginalMember(owner = "client!ih", name = "Te", descriptor = "I")
	private int anInt3750;

	@OriginalMember(owner = "client!ih", name = "lf", descriptor = "I")
	private int anInt3755;

	@OriginalMember(owner = "client!ih", name = "Oe", descriptor = "I")
	public int anInt3745;

	@OriginalMember(owner = "client!ih", name = "gg", descriptor = "[F")
	public final float[] aFloatArray18;

	@OriginalMember(owner = "client!ih", name = "pg", descriptor = "I")
	private int anInt3767;

	@OriginalMember(owner = "client!ih", name = "sf", descriptor = "F")
	private float aFloat47;

	@OriginalMember(owner = "client!ih", name = "xf", descriptor = "F")
	private float aFloat48;

	@OriginalMember(owner = "client!ih", name = "ig", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!ih", name = "Eg", descriptor = "I")
	private int anInt3770;

	@OriginalMember(owner = "client!ih", name = "Jf", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!ih", name = "Yf", descriptor = "Z")
	private boolean aBoolean220;

	@OriginalMember(owner = "client!ih", name = "Kg", descriptor = "I")
	public int anInt3772;

	@OriginalMember(owner = "client!ih", name = "df", descriptor = "I")
	public int anInt3753;

	@OriginalMember(owner = "client!ih", name = "Lg", descriptor = "I")
	public int anInt3773;

	@OriginalMember(owner = "client!ih", name = "Mg", descriptor = "I")
	private int anInt3774;

	@OriginalMember(owner = "client!ih", name = "Pg", descriptor = "I")
	public int anInt3777;

	@OriginalMember(owner = "client!ih", name = "ef", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!ih", name = "Ug", descriptor = "F")
	private float aFloat59;

	@OriginalMember(owner = "client!ih", name = "uf", descriptor = "I")
	public int anInt3756;

	@OriginalMember(owner = "client!ih", name = "Qg", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!ih", name = "Tg", descriptor = "I")
	public int anInt3778;

	@OriginalMember(owner = "client!ih", name = "Og", descriptor = "I")
	public int anInt3776;

	@OriginalMember(owner = "client!ih", name = "Cf", descriptor = "I")
	public int anInt3758;

	@OriginalMember(owner = "client!ih", name = "Xg", descriptor = "[F")
	private final float[] aFloatArray19;

	@OriginalMember(owner = "client!ih", name = "tf", descriptor = "Lclient!ct;")
	public Class1_Sub3_Sub2 aClass1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!ih", name = "Zg", descriptor = "[I")
	public int[] anIntArray362;

	@OriginalMember(owner = "client!ih", name = "ah", descriptor = "[I")
	public int[] anIntArray363;

	@OriginalMember(owner = "client!ih", name = "eh", descriptor = "[I")
	public int[] anIntArray364;

	@OriginalMember(owner = "client!ih", name = "dh", descriptor = "[B")
	public final byte[] aByteArray44;

	@OriginalMember(owner = "client!ih", name = "sb", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas18;

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas17;

	@OriginalMember(owner = "client!ih", name = "he", descriptor = "I")
	public final int anInt3731;

	@OriginalMember(owner = "client!ih", name = "be", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ih", name = "ed", descriptor = "J")
	private final long aLong101;

	@OriginalMember(owner = "client!ih", name = "Hc", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!ih", name = "If", descriptor = "I")
	public final int anInt3759;

	@OriginalMember(owner = "client!ih", name = "vf", descriptor = "Z")
	public boolean aBoolean213;

	@OriginalMember(owner = "client!ih", name = "yf", descriptor = "Z")
	private boolean aBoolean215;

	@OriginalMember(owner = "client!ih", name = "Hf", descriptor = "Z")
	public boolean aBoolean217;

	@OriginalMember(owner = "client!ih", name = "Df", descriptor = "Z")
	public boolean aBoolean216;

	@OriginalMember(owner = "client!ih", name = "fg", descriptor = "Z")
	private boolean aBoolean224;

	@OriginalMember(owner = "client!ih", name = "Ue", descriptor = "Z")
	public boolean aBoolean209;

	@OriginalMember(owner = "client!ih", name = "Jg", descriptor = "Z")
	public boolean aBoolean233;

	@OriginalMember(owner = "client!ih", name = "bg", descriptor = "Z")
	private final boolean aBoolean222;

	@OriginalMember(owner = "client!ih", name = "fe", descriptor = "Lclient!hm;")
	public final Class107 aClass107_1;

	@OriginalMember(owner = "client!ih", name = "le", descriptor = "Lclient!hp;")
	public final Class110 aClass110_1;

	@OriginalMember(owner = "client!ih", name = "ge", descriptor = "Lclient!jr;")
	private final Class136 aClass136_1;

	@OriginalMember(owner = "client!ih", name = "ee", descriptor = "Lclient!lm;")
	private Class1_Sub24_Sub1 aClass1_Sub24_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "de", descriptor = "Lclient!cg;")
	private final Class43 aClass43_1;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;ILclient!nv;)V")
	public Class106_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class183 arg4) {
		super(arg0, arg2);
		new Class262();
		new Class38(16);
		this.aClass203_24 = new Class203();
		this.aClass203_25 = new Class203();
		this.aClass203_26 = new Class203();
		this.aClass203_27 = new Class203();
		this.aClass203_28 = new Class203();
		this.aClass203_29 = new Class203();
		this.aClass203_30 = new Class203();
		this.anInt3751 = 0;
		this.anInt3743 = 0;
		this.aFloat45 = 1.0F;
		this.anInt3752 = 512;
		this.anInt3748 = 8448;
		this.aFloat40 = 3584.0F;
		this.anInt3760 = -1;
		this.aClass1_Sub4Array3 = new Class1_Sub4[Static28.anInt660];
		this.aFloatArray16 = new float[16];
		this.aFloatArray17 = new float[4];
		this.aFloat43 = 3000.0F;
		this.anInt3744 = 0;
		this.anInt3747 = 50;
		this.aFloatArray15 = new float[4];
		this.bf = 3584.0F;
		this.anInt3750 = 0;
		this.anInt3755 = 8448;
		this.anInt3745 = 3584;
		this.aFloatArray18 = new float[4];
		this.anInt3767 = -1;
		this.aFloat47 = 1.0F;
		this.aFloat48 = 1.0F;
		this.aFloat51 = 1.0F;
		this.anInt3770 = 0;
		this.aFloat50 = 1.0F;
		this.aBoolean220 = true;
		this.anInt3772 = -1;
		this.anInt3753 = -1;
		this.anInt3773 = -1;
		this.anInt3774 = 0;
		this.anInt3777 = 0;
		this.aFloat42 = -1.0F;
		this.aFloat59 = 0.0F;
		this.anInt3756 = 0;
		this.aFloat58 = -1.0F;
		this.anInt3778 = 0;
		this.anInt3776 = 0;
		this.anInt3758 = 512;
		this.aFloatArray19 = new float[4];
		this.aClass1_Sub3_Sub2_2 = new Class1_Sub3_Sub2(8192);
		this.anIntArray362 = new int[1];
		this.anIntArray363 = new int[1];
		this.anIntArray364 = new int[1];
		this.aByteArray44 = new byte[16384];
		this.aCanvas17 = this.aCanvas18 = arg1;
		this.anInt3731 = arg3;
		try {
			if (Static290.aBoolean341 == null || !Static290.aBoolean341) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static290.aBoolean341 = Boolean.TRUE;
				} else {
					@Pc(266) String local266 = System.getProperty("os.name").toLowerCase();
					if (!local266.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local266.startsWith("linux") || local266.startsWith("sunos")) {
						System.load(arg4.method4146("libjaggl.so").toString());
					} else if (local266.startsWith("mac")) {
						System.load(arg4.method4146("libjaggl.jnilib").toString());
					} else if (local266.startsWith("win")) {
						System.load(arg4.method4146("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static290.aBoolean341 = Boolean.TRUE;
				}
			}
			if (Static290.aBoolean341 == null || !Static290.aBoolean341) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong100 = this.aLong101 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt3731);
			if (this.aLong101 == 0L) {
				throw new RuntimeException("");
			}
			this.method2924();
			@Pc(372) int local372 = this.method2926();
			if (local372 != 0) {
				throw new RuntimeException("");
			}
			this.anInt3759 = this.aBoolean227 ? 33639 : 5121;
			@Pc(396) int local396;
			if (this.aString32.indexOf("radeon") != -1) {
				local396 = 0;
				@Pc(398) boolean local398 = false;
				@Pc(400) boolean local400 = false;
				@Pc(409) String[] local409 = Static117.method1928(' ', this.aString32.replace('/', ' '));
				for (@Pc(411) int local411 = 0; local411 < local409.length; local411++) {
					@Pc(416) String local416 = local409[local411];
					try {
						if (local416.length() > 0) {
							if (local416.charAt(0) == 'x' && local416.length() >= 3 && Static437.method5877(local416.substring(1, 3))) {
								local400 = true;
								local416 = local416.substring(1);
							}
							if (local416.equals("hd")) {
								local398 = true;
							} else {
								if (local416.startsWith("hd")) {
									local398 = true;
									local416 = local416.substring(2);
								}
								if (local416.length() >= 4 && Static437.method5877(local416.substring(0, 4))) {
									local396 = Static293.method3599(local416.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(487) Exception local487) {
					}
				}
				if (!local398 || local396 < 4000) {
					this.aBoolean213 = false;
				}
				if (!local400 && !local398) {
					if (local396 >= 7000 && local396 <= 7999) {
						this.aBoolean215 = false;
					}
					if (local396 >= 7000 && local396 <= 9250) {
						this.aBoolean217 = false;
					}
				}
				this.aBoolean216 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean224 = this.aBoolean215;
				this.aBoolean209 = true;
			}
			if (this.aString31.indexOf("intel") != -1) {
				this.aBoolean233 = false;
			}
			this.aBoolean222 = !this.aString31.equals("s3 graphics");
			if (this.aBoolean215) {
				try {
					@Pc(577) int[] local577 = new int[1];
					OpenGL.glGenBuffersARB(1, local577, 0);
				} catch (@Pc(583) Throwable local583) {
					throw new RuntimeException("");
				}
			}
			Static53.method996(true, false);
			this.aBoolean208 = true;
			this.aClass107_1 = new Class107(this, super.anInterface7_10);
			this.method2894();
			this.aClass110_1 = new Class110(this);
			this.aClass136_1 = new Class136(this);
			if (this.aClass136_1.method3205()) {
				this.aClass1_Sub24_Sub1_1 = new Class1_Sub24_Sub1(this);
				if (!this.aClass1_Sub24_Sub1_1.method3588()) {
					this.aClass1_Sub24_Sub1_1.method3580();
					this.aClass1_Sub24_Sub1_1 = null;
				}
			}
			this.aClass43_1 = new Class43(this);
			this.method2895();
			this.method2882();
			OpenGL.glClear(16640);
			local396 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(662) Exception local662) {
					if (local396++ > 5) {
						throw new RuntimeException("");
					}
					Static289.method4249(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(681) Throwable local681) {
			local681.printStackTrace();
			this.method5906();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!nb;B)V")
	public void method2845(@OriginalArg(0) Class40_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method3908(), 0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)V")
	public void method2846(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean230) {
			this.aBoolean230 = arg0;
			this.method2905();
			this.anInt3746 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "()Z")
	@Override
	public boolean method5960() {
		return this.aClass1_Sub24_Sub1_1 != null && (this.anInt3731 <= 1 || this.aBoolean229);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!nn;Lclient!nn;Lclient!nn;Lclient!nn;)V")
	public void method2847(@OriginalArg(1) Class179 arg0, @OriginalArg(2) Class179 arg1, @OriginalArg(3) Class179 arg2, @OriginalArg(4) Class179 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method2852(arg3.anInterface3_7);
			OpenGL.glVertexPointer(arg3.aByte69, arg3.aShort77, this.anInterface3_4.method5204(), this.anInterface3_4.method5207() + (long) arg3.aByte70);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method2852(arg1.anInterface3_7);
			OpenGL.glNormalPointer(arg1.aShort77, this.anInterface3_4.method5204(), this.anInterface3_4.method5207() + (long) arg1.aByte70);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method2852(arg2.anInterface3_7);
			OpenGL.glColorPointer(arg2.aByte69, arg2.aShort77, this.anInterface3_4.method5204(), this.anInterface3_4.method5207() + (long) arg2.aByte70);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method2852(arg0.anInterface3_7);
			OpenGL.glTexCoordPointer(arg0.aByte69, arg0.aShort77, this.anInterface3_4.method5204(), this.anInterface3_4.method5207() + (long) arg0.aByte70);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I")
	@Override
	public int method5913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBILclient!oi;I)V")
	public void method2848(@OriginalArg(0) int arg0, @OriginalArg(3) Interface10 arg1, @OriginalArg(4) int arg2) {
		@Pc(15) int local15 = arg1.method5859();
		@Pc(22) int local22 = arg2 * this.method2903(local15);
		this.method2910(arg1);
		OpenGL.glDrawElements(4, arg0, local15, arg1.method5856() + (long) local22);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
	public void method2849() {
		if (this.anInt3757 != 0) {
			this.anInt3746 &= 0xFFFFFFE0;
			this.anInt3757 = 0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5959(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas18 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)V")
	private void method2850() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass40_Sub2_4.method3908(), 0);
		if (this.aBoolean223) {
			this.aClass43_1.aClass100_Sub8_1.method6148();
		}
		this.method2863();
		this.method2898();
	}

	@OriginalMember(owner = "client!ih", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class24_Sub2 local6 = (Class24_Sub2) arg1;
		@Pc(9) Class8_Sub1_Sub1 local9 = local6.aClass8_Sub1_Sub1_2;
		this.method2866();
		this.method2912(local6.aClass8_Sub1_Sub1_2);
		this.method2927(1);
		this.method2923(7681, 8448);
		this.method2915(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat23 / (float) local9.anInt3085;
		@Pc(46) float local46 = local9.aFloat24 / (float) local9.anInt3088;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt3774 - arg2) * local39, (float) (this.anInt3750 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3774, this.anInt3750);
		OpenGL.glTexCoord2f((float) (this.anInt3774 - arg2) * local39, (float) (this.anInt3744 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3774, this.anInt3744);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3743 - arg2), (float) (this.anInt3744 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3743, this.anInt3744);
		OpenGL.glTexCoord2f((float) (this.anInt3743 - arg2) * local39, local46 * (float) (this.anInt3750 - arg3));
		OpenGL.glVertex2i(this.anInt3743, this.anInt3750);
		OpenGL.glEnd();
		this.method2915(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)V")
	public void method2851(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method2923(7681, 7681);
		} else if (arg0 == 0) {
			this.method2923(8448, 8448);
		} else if (arg0 == 2) {
			this.method2923(34165, 7681);
		} else if (arg0 == 3) {
			this.method2923(260, 8448);
		} else if (arg0 == 4) {
			this.method2923(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ig;I)V")
	public void method2852(@OriginalArg(0) Interface3 arg0) {
		if (arg0 != this.anInterface3_4) {
			if (this.aBoolean215) {
				OpenGL.glBindBufferARB(34962, arg0.method5205());
			}
			this.anInterface3_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
	private void method2854() {
		if (this.aBoolean228 && !this.aBoolean214) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method2885();
		this.method2927(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean211) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean211) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)Lclient!n;")
	@Override
	public Class1_Sub11 method5940(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub11_Sub1 local8 = new Class1_Sub11_Sub1(arg0);
		this.aClass203_23.method4551(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZJ)V")
	public synchronized void method2855(@OriginalArg(1) long arg0) {
		@Pc(17) Class1 local17 = new Class1();
		local17.aLong228 = arg0;
		this.aClass203_30.method4551(local17);
	}

	@OriginalMember(owner = "client!ih", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat43 == arg0 && this.aFloat46 == arg1) {
			return;
		}
		this.aFloat43 = arg0;
		this.aFloat46 = arg1;
		this.method2867();
		if (this.anInt3757 == 3) {
			this.method2899();
			return;
		}
		if (this.anInt3757 != 2) {
			return;
		}
		this.method2907();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIZ)V")
	public void method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3751 = arg0;
		this.anInt3770 = arg1;
		this.method2880();
		this.method2859();
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5965(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas18) {
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

	@OriginalMember(owner = "client!ih", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt3744;
		arg0[2] = this.anInt3743;
		arg0[0] = this.anInt3774;
		arg0[1] = this.anInt3750;
	}

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "()V")
	@Override
	public void method5935() {
		if (!this.aBoolean222 || this.anInt3589 <= 0 || this.anInt3713 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt3774;
		@Pc(22) int local22 = this.anInt3743;
		@Pc(25) int local25 = this.anInt3750;
		@Pc(28) int local28 = this.anInt3744;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method2849();
		this.method2846(false);
		this.method2858(false);
		this.method2922(false);
		this.method2914(false);
		this.method2912(null);
		this.method2904(-2);
		this.method2851(1);
		this.method2927(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt3589, this.anInt3713, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ba(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!h;I)V")
	public void method2857(@OriginalArg(0) Interface2 arg0) {
		if (this.aBoolean231) {
			this.method2879(arg0);
			this.method2872(arg0);
		} else if (this.anInt3737 >= 0 && this.anInterface2Array3[this.anInt3737] == arg0) {
			this.anInterface2Array3[this.anInt3737--] = null;
			arg0.method3137();
			if (this.anInt3737 >= 0) {
				this.anInterface2_1 = this.anInterface2_2 = this.anInterface2Array3[this.anInt3737];
				this.anInterface2_1.method3138();
			} else {
				this.anInterface2_1 = this.anInterface2_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "()Z")
	@Override
	public boolean method5953() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZ)V")
	public void method2858(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean228 != arg0) {
			this.aBoolean228 = arg0;
			this.method2854();
			this.anInt3746 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
	@Override
	public void method5957(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt3732 = arg0;
		this.aClass107_1.method2629();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5946(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5977();
	}

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "()V")
	@Override
	public void method5964() {
		this.aClass136_1.method3198();
	}

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass40_Sub2_4.aFloat74 * (float) arg0 + (float) arg1 * this.aClass40_Sub2_4.aFloat81 + (float) arg2 * this.aClass40_Sub2_4.aFloat79 + this.aClass40_Sub2_4.aFloat75;
		if (local28 < (float) this.anInt3747 || (float) this.anInt3745 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass40_Sub2_4.aFloat78 + (float) arg2 * this.aClass40_Sub2_4.aFloat77 + this.aClass40_Sub2_4.aFloat71 * (float) arg1 + this.aClass40_Sub2_4.aFloat72 * (float) arg0) * (float) this.anInt3752 / local28);
		@Pc(117) int local117 = (int) (((float) arg2 * this.aClass40_Sub2_4.aFloat73 + (float) arg0 * this.aClass40_Sub2_4.aFloat76 + (float) arg1 * this.aClass40_Sub2_4.aFloat82 + this.aClass40_Sub2_4.aFloat80) * (float) this.anInt3758 / local28);
		if (this.aFloat55 <= (float) local85 && this.aFloat54 >= (float) local85 && (float) local117 >= this.aFloat52 && this.aFloat41 >= (float) local117) {
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat52);
			arg3[0] = (int) ((float) local85 - this.aFloat55);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V")
	private void method2859() {
		if (this.anInt3743 >= this.anInt3774 && this.anInt3744 >= this.anInt3750) {
			OpenGL.glScissor(this.anInt3751 + this.anInt3774, -this.anInt3744 + this.anInt3770 + this.anInt3713, this.anInt3743 - this.anInt3774, -this.anInt3750 + this.anInt3744);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V")
	public synchronized void method2860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub33 local14 = new Class1_Sub33(arg1);
		local14.aLong228 = arg0;
		this.aClass203_26.method4551(local14);
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "(I)V")
	public void method2861() {
		if (this.anInt3746 == 16) {
			return;
		}
		this.method2871();
		this.method2846(true);
		this.method2922(true);
		this.method2914(true);
		this.method2927(1);
		this.method2851(0);
		this.anInt3746 = 16;
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(B)V")
	private void method2862() {
		if (this.anInt3757 != 2) {
			this.anInt3757 = 2;
			this.method2907();
			this.method2850();
			this.anInt3746 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5920(@OriginalArg(0) Canvas arg0) {
		this.aLong100 = 0L;
		this.aCanvas17 = null;
		if (arg0 == null || this.aCanvas18 == arg0) {
			this.aLong100 = this.aLong101;
			this.aCanvas17 = this.aCanvas18;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable1.get(arg0);
			this.aLong100 = local26;
			this.aCanvas17 = arg0;
		}
		if (this.aCanvas17 == null || this.aLong100 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong100);
		this.method2882();
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(B)V")
	public void method2863() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray18, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!ih", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt3753 && this.anInt3773 == arg1 && arg2 == this.anInt3776) {
			return;
		}
		this.anInt3776 = arg2;
		this.anInt3773 = arg1;
		this.anInt3753 = arg0;
		if (!this.aBoolean223) {
			this.method2901();
			this.method2905();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class137 method5969(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class137_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIZLclient!jaggl/memory/NativeBuffer;)Lclient!ig;")
	public Interface3 method2864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) NativeBuffer arg2) {
		return (Interface3) (this.aBoolean215 ? new Class234_Sub1(this, arg0, arg2, arg1, false) : new Class4_Sub2(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!ih", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2885();
		this.method2927(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class24 method5939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static126.method2051(arg2, arg1, arg0, this, arg3);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZZI)V")
	public void method2865(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 != this.anInt3775) {
			if (arg2 < 0) {
				this.method2917();
				this.method2912(null);
				this.method2851(0);
				if (!this.aBoolean223) {
					this.aClass43_1.method925(0, arg1, 0, 0, arg0);
				}
			} else {
				@Pc(35) Class8_Sub1 local35 = this.aClass107_1.method2628(arg2);
				@Pc(41) Class150 local41 = super.anInterface7_10.method78(arg2);
				if (local41.aByte55 == 0 && local41.aByte52 == 0) {
					this.method2917();
				} else {
					@Pc(64) int local64 = local41.aBoolean272 ? 64 : 128;
					@Pc(68) int local68 = local64 * 50;
					this.method2891((float) (this.anInt3735 % local68 * local41.aByte52) / (float) local68, 0.0F, (float) (this.anInt3735 % local68 * local41.aByte55) / (float) local68);
				}
				if (this.aBoolean223) {
					this.method2912(local35);
					this.method2851(local41.anInt4425);
				} else {
					this.aClass43_1.method925(local41.aByte53, arg1, local41.aByte57, local41.anInt4426, arg0);
					if (!this.aClass43_1.method923(local35, local41.anInt4425)) {
						this.method2912(local35);
						this.method2851(local41.anInt4425);
					}
				}
			}
			this.anInt3775 = arg2;
		}
		this.anInt3746 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method5976(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class1_Sub33 local19;
		while (!this.aClass203_25.method4554()) {
			local19 = (Class1_Sub33) this.aClass203_25.method4549();
			Static287.anIntArray509[local11++] = (int) local19.aLong228;
			this.anInt3739 -= local19.anInt5633;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static287.anIntArray509, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static287.anIntArray509, 0);
			local11 = 0;
		}
		while (!this.aClass203_26.method4554()) {
			local19 = (Class1_Sub33) this.aClass203_26.method4549();
			Static287.anIntArray509[local11++] = (int) local19.aLong228;
			this.anInt3740 -= local19.anInt5633;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static287.anIntArray509, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static287.anIntArray509, 0);
			local11 = 0;
		}
		while (!this.aClass203_27.method4554()) {
			local19 = (Class1_Sub33) this.aClass203_27.method4549();
			Static287.anIntArray509[local11++] = local19.anInt5633;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static287.anIntArray509, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static287.anIntArray509, 0);
			local11 = 0;
		}
		while (!this.aClass203_28.method4554()) {
			local19 = (Class1_Sub33) this.aClass203_28.method4549();
			Static287.anIntArray509[local11++] = (int) local19.aLong228;
			this.anInt3741 -= local19.anInt5633;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static287.anIntArray509, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static287.anIntArray509, 0);
		}
		while (!this.aClass203_24.method4554()) {
			local19 = (Class1_Sub33) this.aClass203_24.method4549();
			OpenGL.glDeleteLists((int) local19.aLong228, local19.anInt5633);
		}
		@Pc(218) Class1 local218;
		while (!this.aClass203_29.method4554()) {
			local218 = this.aClass203_29.method4549();
			OpenGL.glDeleteProgramARB((int) local218.aLong228);
		}
		while (!this.aClass203_30.method4554()) {
			local218 = this.aClass203_30.method4549();
			OpenGL.glDeleteObjectARB(local218.aLong228);
		}
		while (!this.aClass203_24.method4554()) {
			local19 = (Class1_Sub33) this.aClass203_24.method4549();
			OpenGL.glDeleteLists((int) local19.aLong228, local19.anInt5633);
		}
		this.aClass107_1.method2626();
		if (this.pa() > 100663296 && this.aLong102 + 60000L < Static250.method3737()) {
			System.gc();
			this.aLong102 = Static250.method3737();
		}
		this.anInt3735 = local9;
	}

	@OriginalMember(owner = "client!ih", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass40_Sub2_4.aFloat75 + (float) arg1 * this.aClass40_Sub2_4.aFloat81 + this.aClass40_Sub2_4.aFloat74 * (float) arg0 + (float) arg2 * this.aClass40_Sub2_4.aFloat79;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = (float) arg4 * this.aClass40_Sub2_4.aFloat81 + this.aClass40_Sub2_4.aFloat74 * (float) arg3 + this.aClass40_Sub2_4.aFloat79 * (float) arg5 + this.aClass40_Sub2_4.aFloat75;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt3747 && (float) this.anInt3747 > local59 || !(!((float) this.anInt3745 < local28) || !(local59 > (float) this.anInt3745))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass40_Sub2_4.aFloat78 + this.aClass40_Sub2_4.aFloat72 * (float) arg0 + (float) arg1 * this.aClass40_Sub2_4.aFloat71 + this.aClass40_Sub2_4.aFloat77 * (float) arg2) * (float) this.anInt3752 / local28);
		@Pc(155) int local155 = (int) (((float) arg4 * this.aClass40_Sub2_4.aFloat71 + (float) arg3 * this.aClass40_Sub2_4.aFloat72 + (float) arg5 * this.aClass40_Sub2_4.aFloat77 + this.aClass40_Sub2_4.aFloat78) * (float) this.anInt3752 / local59);
		if (this.aFloat55 > (float) local123 && (float) local155 < this.aFloat55 || this.aFloat54 < (float) local123 && this.aFloat54 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) (((float) arg0 * this.aClass40_Sub2_4.aFloat76 + this.aClass40_Sub2_4.aFloat82 * (float) arg1 + (float) arg2 * this.aClass40_Sub2_4.aFloat73 + this.aClass40_Sub2_4.aFloat80) * (float) this.anInt3758 / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt3758 * (this.aClass40_Sub2_4.aFloat80 + (float) arg5 * this.aClass40_Sub2_4.aFloat73 + this.aClass40_Sub2_4.aFloat82 * (float) arg4 + (float) arg3 * this.aClass40_Sub2_4.aFloat76) / local59);
			return (!(this.aFloat52 > (float) local213) || !(this.aFloat52 > (float) local245)) && (!((float) local213 > this.aFloat41) || !((float) local245 > this.aFloat41));
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V")
	@Override
	public void method5971(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "()V")
	@Override
	public void method5950() {
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(B)V")
	public void method2866() {
		if (this.anInt3746 == 2) {
			return;
		}
		this.method2884();
		this.method2846(false);
		this.method2858(false);
		this.method2922(false);
		this.method2914(false);
		this.method2904(-2);
		this.anInt3746 = 2;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "()Z")
	@Override
	public boolean method5910() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "()I")
	@Override
	public int method5928() {
		return 4;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)I")
	@Override
	public int method5954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "(I)V")
	private void method2867() {
		if (this.aFloat46 == 0.0F) {
			this.aFloatArray16[10] = this.aFloat57;
			this.aFloatArray16[14] = this.aFloat53;
		} else {
			@Pc(31) float local31 = this.aFloat43 / (this.aFloat43 + this.aFloat46);
			@Pc(35) float local35 = local31 * local31;
			@Pc(51) float local51 = -this.aFloat53 * (1.0F - local31) * (1.0F - local31) / this.aFloat46;
			this.aFloatArray16[10] = local51 + this.aFloat57;
			this.aFloatArray16[14] = local35 * this.aFloat53;
		}
		this.aFloat40 = (this.aFloatArray16[14] - (float) this.anInt3745) / this.aFloatArray16[10];
		this.bf = (float) this.anInt3745 - this.aFloat46;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IZ)V")
	public void method2868(@OriginalArg(0) int arg0) {
		Static82.aFloatArray13[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static82.aFloatArray13[3] = (float) (arg0 >>> 24) / 255.0F;
		Static82.aFloatArray13[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static82.aFloatArray13[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static82.aFloatArray13, 0);
	}

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.method2927(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ih", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(6) int local6 = this.anInt3779;
		this.anInt3779 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(III)V")
	public synchronized void method2869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class1_Sub33 local16 = new Class1_Sub33(arg1);
		local16.aLong228 = arg0;
		this.aClass203_25.method4551(local16);
	}

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "()Z")
	@Override
	public boolean method5973() {
		return this.aClass43_1.method924();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
	@Override
	public void method5955(@OriginalArg(0) boolean arg0) {
		this.aBoolean220 = arg0;
		this.method2902();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!h;)V")
	public void method2870(@OriginalArg(1) Interface2 arg0) {
		if (this.aBoolean231) {
			this.method2897(arg0);
			this.method2906(arg0);
		} else if (this.anInt3737 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt3737 >= 0) {
				this.anInterface2Array3[this.anInt3737].method3137();
			}
			this.anInterface2_1 = this.anInterface2_2 = this.anInterface2Array3[++this.anInt3737] = arg0;
			this.anInterface2_1.method3138();
		}
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "(B)V")
	private void method2871() {
		if (this.anInt3757 != 3) {
			this.anInt3757 = 3;
			this.method2899();
			this.method2850();
			this.anInt3746 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!wh;Z)Lclient!o;")
	@Override
	public Class137 method5938(@OriginalArg(0) Class266 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt7824 * arg0.anInt7823];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray95 == null) {
			for (local21 = 0; local21 < arg0.anInt7824; local21++) {
				for (local25 = 0; local25 < arg0.anInt7823; local25++) {
					@Pc(38) int local38 = arg0.anIntArray742[arg0.aByteArray94[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt7824; local21++) {
				for (local25 = 0; local25 < arg0.anInt7823; local25++) {
					local12[local16++] = arg0.aByteArray95[local14] << 24 | arg0.anIntArray742[arg0.aByteArray94[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(115) Class137 local115 = this.method5969(local12, arg0.anInt7823, arg0.anInt7823, arg0.anInt7824);
		local115.ha(arg0.anInt7825, arg0.anInt7826, arg0.anInt7821, arg0.anInt7822);
		return local115;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLclient!h;)V")
	public void method2872(@OriginalArg(1) Interface2 arg0) {
		if (this.anInt3738 < 0 || arg0 != this.anInterface2Array2[this.anInt3738]) {
			throw new RuntimeException();
		}
		this.anInterface2Array2[this.anInt3738--] = null;
		arg0.method3135();
		if (this.anInt3738 < 0) {
			this.anInterface2_2 = null;
		} else {
			this.anInterface2_2 = this.anInterface2Array2[this.anInt3738];
			this.anInterface2_2.method3136();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5917(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static98.aFloat13 = arg0;
		Static130.aFloat21 = arg2;
		Static74.aFloat11 = arg1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIB)V")
	public void method2874(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3774 < arg0) {
			this.anInt3774 = arg0;
		}
		if (this.anInt3750 < arg1) {
			this.anInt3750 = arg1;
		}
		if (this.anInt3743 > arg2) {
			this.anInt3743 = arg2;
		}
		if (this.anInt3744 > arg3) {
			this.anInt3744 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method2900();
		this.method2859();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ko;IIII)Lclient!e;")
	@Override
	public Class17 method5922(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class17_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3747 == arg0 && this.anInt3745 == arg1) {
			return;
		}
		this.anInt3747 = arg0;
		this.anInt3745 = arg1;
		this.method2929();
		this.method2901();
		if (this.anInt3757 == 3) {
			this.method2899();
		} else if (this.anInt3757 == 2) {
			this.method2907();
		}
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "(B)V")
	public void method2875() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(Z)Lclient!hg;")
	public Class8_Sub3 method2876() {
		return this.aClass86_Sub1_1 == null ? null : this.aClass86_Sub1_1.method3600();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ug;)V")
	@Override
	public void method5967(@OriginalArg(0) Class86 arg0) {
		this.aClass86_Sub1_1 = (Class86_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ug;Lclient!ug;FLclient!ug;)Lclient!ug;")
	@Override
	public Class86 method5972(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class86 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean210 && this.aBoolean233) {
			@Pc(15) Class86_Sub1_Sub2 local15 = null;
			@Pc(18) Class86_Sub1 local18 = (Class86_Sub1) arg0;
			@Pc(21) Class86_Sub1 local21 = (Class86_Sub1) arg1;
			@Pc(25) Class8_Sub3 local25 = local18.method3600();
			@Pc(29) Class8_Sub3 local29 = local21.method3600();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local29.anInt3226 >= local25.anInt3226 ? local29.anInt3226 : local25.anInt3226;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class86_Sub1_Sub2) {
					@Pc(60) Class86_Sub1_Sub2 local60 = (Class86_Sub1_Sub2) arg3;
					if (local60.method3605() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class86_Sub1_Sub2(this, local48);
				}
				if (local15.method3604(arg2, local29, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "(B)V")
	private void method2878() {
		Static82.aFloatArray13[3] = 1.0F;
		Static82.aFloatArray13[2] = this.aFloat45 * this.aFloat56;
		Static82.aFloatArray13[0] = this.aFloat56 * this.aFloat51;
		Static82.aFloatArray13[1] = this.aFloat56 * this.aFloat50;
		OpenGL.glLightModelfv(2899, Static82.aFloatArray13, 0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!h;Z)V")
	public void method2879(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt3736 < 0 || arg0 != this.anInterface2Array1[this.anInt3736]) {
			throw new RuntimeException();
		}
		this.anInterface2Array1[this.anInt3736--] = null;
		arg0.method3134();
		if (this.anInt3736 >= 0) {
			this.anInterface2_1 = this.anInterface2Array1[this.anInt3736];
			this.anInterface2_1.method3133();
		} else {
			this.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "(I)V")
	private void method2880() {
		OpenGL.glViewport(this.anInt3751, this.anInt3770, this.anInt3589, this.anInt3713);
	}

	@OriginalMember(owner = "client!ih", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.anInt3741 + this.anInt3739 + this.anInt3740;
	}

	@OriginalMember(owner = "client!ih", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2885();
		this.method2927(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "()Z")
	@Override
	public boolean method5907() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(II)V")
	public void method2881(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt3768) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt3768 = arg0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!e;Lclient!d;Lclient!c;Lclient!tq;I)V")
	@Override
	public void method5952(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class41_Sub8 arg3) {
		arg0.method6189(arg2, arg3, 0);
		this.method5908(arg1);
	}

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "(B)V")
	private void method2882() {
		if (this.aCanvas17 == null) {
			this.anInt3609 = this.anInt3569 = 0;
		} else {
			@Pc(13) Dimension local13 = this.aCanvas17.getSize();
			this.anInt3569 = local13.height;
			this.anInt3609 = local13.width;
		}
		if (this.anInterface2_2 == null) {
			this.anInt3713 = this.anInt3569;
			this.anInt3589 = this.anInt3609;
			this.method2880();
		}
		this.method2849();
		this.va();
	}

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method2885();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method2927(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean211) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean211) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class24 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class24_Sub2 local6 = (Class24_Sub2) arg5;
		@Pc(9) Class8_Sub1_Sub1 local9 = local6.aClass8_Sub1_Sub1_2;
		this.method2866();
		this.method2912(local6.aClass8_Sub1_Sub1_2);
		this.method2927(1);
		this.method2923(7681, 8448);
		this.method2915(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat23 / (float) local9.anInt3085;
		@Pc(46) float local46 = local9.aFloat24 / (float) local9.anInt3088;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method2915(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI[BBI)Lclient!ig;")
	public Interface3 method2883(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		return (Interface3) (this.aBoolean215 && (!arg0 || this.aBoolean224) ? new Class234_Sub1(this, arg3, arg2, arg1, arg0) : new Class4_Sub2(this, arg3, arg2, arg1));
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIIIII)Lclient!ug;")
	@Override
	public Class86 method5929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean210 ? new Class86_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "()Z")
	@Override
	public boolean method5949() {
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "(B)V")
	private void method2884() {
		if (this.anInt3757 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt3589 > 0 && this.anInt3713 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt3589, (double) this.anInt3713, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt3757 = 1;
		this.anInt3746 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "()Z")
	@Override
	public boolean method5945() {
		return this.aClass1_Sub24_Sub1_1 != null && this.aClass1_Sub24_Sub1_1.method3583();
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "()Z")
	@Override
	public boolean method5925() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	@Override
	public void method5911(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ih", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(6) int local6 = this.anInt3780;
		this.anInt3780 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "(B)V")
	private void method2885() {
		if (this.anInt3746 == 1) {
			return;
		}
		this.method2884();
		this.method2846(false);
		this.method2858(false);
		this.method2922(false);
		this.method2914(false);
		this.method2912(null);
		this.method2904(-2);
		this.method2851(1);
		this.anInt3746 = 1;
	}

	@OriginalMember(owner = "client!ih", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		if (this.aFloat56 != arg0) {
			this.aFloat56 = arg0;
			this.method2878();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5970(@OriginalArg(0) Class1_Sub11 arg0) {
		this.aNativeHeap2 = ((Class1_Sub11_Sub1) arg0).aNativeHeap1;
		if (this.anInterface3_5 != null) {
			return;
		}
		@Pc(16) Class1_Sub3_Sub2 local16 = new Class1_Sub3_Sub2(80);
		if (this.aBoolean227) {
			local16.method1228(-1.0F);
			local16.method1228(-1.0F);
			local16.method1228(0.0F);
			local16.method1228(0.0F);
			local16.method1228(1.0F);
			local16.method1228(1.0F);
			local16.method1228(-1.0F);
			local16.method1228(0.0F);
			local16.method1228(1.0F);
			local16.method1228(1.0F);
			local16.method1228(1.0F);
			local16.method1228(1.0F);
			local16.method1228(0.0F);
			local16.method1228(1.0F);
			local16.method1228(0.0F);
			local16.method1228(-1.0F);
			local16.method1228(1.0F);
			local16.method1228(0.0F);
			local16.method1228(0.0F);
			local16.method1228(0.0F);
		} else {
			local16.method1232(-1.0F);
			local16.method1232(-1.0F);
			local16.method1232(0.0F);
			local16.method1232(0.0F);
			local16.method1232(1.0F);
			local16.method1232(1.0F);
			local16.method1232(-1.0F);
			local16.method1232(0.0F);
			local16.method1232(1.0F);
			local16.method1232(1.0F);
			local16.method1232(1.0F);
			local16.method1232(1.0F);
			local16.method1232(0.0F);
			local16.method1232(1.0F);
			local16.method1232(0.0F);
			local16.method1232(-1.0F);
			local16.method1232(1.0F);
			local16.method1232(0.0F);
			local16.method1232(0.0F);
			local16.method1232(0.0F);
		}
		this.anInterface3_5 = this.method2883(false, local16.anInt1710, local16.aByteArray14, 20);
		this.aClass179_11 = new Class179(this.anInterface3_5, 5126, 3, 0);
		this.aClass179_12 = new Class179(this.anInterface3_5, 5126, 2, 12);
		this.aClass140_1.method3267(this);
	}

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "(B)V")
	public void method2886() {
		if (this.anInt3746 == 8) {
			return;
		}
		this.method2862();
		this.method2846(true);
		this.method2922(true);
		this.method2914(true);
		this.method2927(1);
		this.method2851(0);
		this.anInt3746 = 8;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!nb;I)V")
	public void method2887(@OriginalArg(0) Class40_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method3908(), 0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[Lclient!ja;)V")
	@Override
	public void method5956(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub4[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass1_Sub4Array3[local7] = arg1[local7];
		}
		this.anInt3749 = arg0;
		if (this.anInt3757 != 1) {
			this.method2898();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BZ)V")
	public void method2888(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean214 != arg0) {
			this.aBoolean214 = arg0;
			this.method2854();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5914() {
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "()Z")
	@Override
	public boolean method5912() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!qm;[Lclient!wh;Z)Lclient!la;")
	@Override
	public Class20 method5968(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class266[] arg1) {
		return new Class20_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "(II)I")
	public int method2889(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(FIF)V")
	public void method2890(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat47 = arg1;
		this.aFloat59 = arg0;
		if (!this.aBoolean223) {
			this.method2901();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(FIFF)V")
	private void method2891(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean212) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean212 = true;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(IZ)V")
	public synchronized void method2892(@OriginalArg(0) int arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong228 = arg0;
		this.aClass203_29.method4551(local7);
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V")
	@Override
	public void method5978(@OriginalArg(0) int arg0) {
		this.method2924();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IF)V")
	public void method2893(@OriginalArg(1) float arg0) {
		if (this.aFloat48 != arg0) {
			this.aFloat48 = arg0;
			if (this.anInt3757 == 3) {
				this.method2899();
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class40 arg0) {
		this.aClass40_Sub2_4 = (Class40_Sub2) arg0;
		this.aClass40_Sub2_3.method3911(this.aClass40_Sub2_4);
		if (this.anInt3757 != 1) {
			this.method2850();
		}
	}

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "()Z")
	@Override
	public boolean method5980() {
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "(I)V")
	private void method2894() {
		this.aClass40_Sub2_4 = new Class40_Sub2();
		this.aClass40_Sub2_3 = new Class40_Sub2();
		this.aClass8Array1 = new Class8[this.anInt3771];
		this.aClass8_Sub1_1 = new Class8_Sub1(this, 3553, 6408, 1, 1);
		new Class8_Sub1(this, 3553, 6408, 1, 1);
		new Class8_Sub1(this, 3553, 6408, 1, 1);
		this.aClass17_Sub1_3 = new Class17_Sub1(this);
		this.aClass17_Sub1_8 = new Class17_Sub1(this);
		this.aClass17_Sub1_5 = new Class17_Sub1(this);
		this.aClass17_Sub1_9 = new Class17_Sub1(this);
		this.aClass17_Sub1_4 = new Class17_Sub1(this);
		this.aClass17_Sub1_10 = new Class17_Sub1(this);
		this.aClass17_Sub1_1 = new Class17_Sub1(this);
		this.aClass17_Sub1_7 = new Class17_Sub1(this);
		this.aClass17_Sub1_6 = new Class17_Sub1(this);
		this.aClass17_Sub1_2 = new Class17_Sub1(this);
		if (this.aBoolean233) {
			this.aClass131_1 = new Class131(this);
			new Class131(this);
		}
	}

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(49) float local49;
		@Pc(61) float local61;
		if (this.aClass8_Sub1_Sub1_3 == null || this.aClass8_Sub1_Sub1_3.anInt3069 < arg2 || arg3 > this.aClass8_Sub1_Sub1_3.anInt3063) {
			this.aClass8_Sub1_Sub1_3 = Static75.method1402(arg6, arg2, arg3, this);
			this.aClass8_Sub1_Sub1_3.method2252(false, false);
			local61 = this.aClass8_Sub1_Sub1_3.aFloat23;
			local49 = this.aClass8_Sub1_Sub1_3.aFloat24;
		} else {
			this.aClass8_Sub1_Sub1_3.method2258(arg2, false, arg6, arg3, 6406);
			local49 = this.aClass8_Sub1_Sub1_3.aFloat24 * (float) arg3 / (float) this.aClass8_Sub1_Sub1_3.anInt3063;
			local61 = (float) arg2 * this.aClass8_Sub1_Sub1_3.aFloat23 / (float) this.aClass8_Sub1_Sub1_3.anInt3069;
		}
		this.method2866();
		this.method2912(this.aClass8_Sub1_Sub1_3);
		this.method2927(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2868(arg5);
		this.method2923(34165, 34165);
		this.method2915(0, 34166, 768);
		this.method2915(2, 5890, 770);
		this.method2925(34166, 0);
		this.method2925(5890, 2);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = local151 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(166) float local166 = (float) arg3 + local154;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local61);
		OpenGL.glVertex2f(local151, local166);
		OpenGL.glTexCoord2f(local49, local61);
		OpenGL.glVertex2f(local159, local166);
		OpenGL.glTexCoord2f(local49, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method2915(0, 5890, 768);
		this.method2915(2, 34166, 770);
		this.method2925(5890, 0);
		this.method2925(34166, 2);
	}

	@OriginalMember(owner = "client!ih", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat46;
	}

	@OriginalMember(owner = "client!ih", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt3747;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!tq;I)V")
	@Override
	public void method5943(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class41_Sub8[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method6189(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2885();
		this.method2927(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.aBoolean223 = false;
		this.aClass43_1.method925(0, false, 0, 0, false);
		this.method2901();
		this.method2905();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIF)Lclient!ja;")
	@Override
	public Class1_Sub4 method5924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub4_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt3745;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!d;)V")
	@Override
	public void method5908(@OriginalArg(0) Class51 arg0) {
		this.aClass140_1.method3259(this, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(Z)V")
	private void method2895() {
		this.method2904(-2);
		for (@Pc(12) int local12 = this.anInt3771 - 1; local12 >= 0; local12--) {
			this.method2881(local12);
			this.method2912(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method2923(8448, 8448);
		this.method2915(2, 34168, 770);
		this.method2917();
		this.anInt3762 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt3761 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean221 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean226 = true;
		this.method2846(true);
		this.method2858(true);
		this.method2922(true);
		this.method2914(true);
		this.method2849();
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
		@Pc(123) float[] local123 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(125) int local125 = 0; local125 < 8; local125++) {
			@Pc(130) int local130 = local125 + 16384;
			OpenGL.glLightfv(local130, 4608, local123, 0);
			OpenGL.glLightf(local130, 4615, 0.0F);
			OpenGL.glLightf(local130, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt3767 = this.anInt3753 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(FIFFF)V")
	public void method2896(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static82.aFloatArray13[1] = arg2;
		Static82.aFloatArray13[0] = arg3;
		Static82.aFloatArray13[3] = arg1;
		Static82.aFloatArray13[2] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static82.aFloatArray13, 0);
	}

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "()Lclient!c;")
	@Override
	public Class40 method5944() {
		return new Class40_Sub2();
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(ILclient!h;)V")
	public void method2897(@OriginalArg(1) Interface2 arg0) {
		if (this.anInt3736 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3736 >= 0) {
			this.anInterface2Array1[this.anInt3736].method3134();
		}
		this.anInterface2_1 = this.anInterface2Array1[++this.anInt3736] = arg0;
		this.anInterface2_1.method3133();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([Lclient!e;Lclient!d;Lclient!c;[Lclient!tq;I)V")
	@Override
	public void method5947(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class41_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method5943(arg0, arg2, arg3, arg4);
		this.method5908(arg1);
	}

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "(I)V")
	private void method2898() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt3749; local7++) {
			@Pc(20) Class1_Sub4 local20 = this.aClass1_Sub4Array3[local7];
			@Pc(25) int local25 = local7 + 16386;
			Static427.aFloatArray27[0] = local20.method3813();
			Static427.aFloatArray27[1] = local20.method3810();
			Static427.aFloatArray27[2] = local20.method3809();
			Static427.aFloatArray27[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static427.aFloatArray27, 0);
			@Pc(59) int local59 = local20.method3808();
			@Pc(65) float local65 = local20.method3811() / 255.0F;
			Static427.aFloatArray27[1] = local65 * (float) (local59 >> 8 & 0xFF);
			Static427.aFloatArray27[0] = (float) (local59 >> 16 & 0xFF) * local65;
			Static427.aFloatArray27[2] = local65 * (float) (local59 & 0xFF);
			OpenGL.glLightfv(local25, 4609, Static427.aFloatArray27, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local20.method3805() * local20.method3805()));
			OpenGL.glEnable(local25);
		}
		while (this.anInt3765 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt3765 = this.anInt3749;
	}

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "(I)V")
	private void method2899() {
		@Pc(15) float local15 = (float) -this.anInt3778 * this.aFloat48 / (float) this.anInt3752;
		@Pc(27) float local27 = (float) -this.anInt3756 * this.aFloat48 / (float) this.anInt3758;
		@Pc(41) float local41 = this.aFloat48 * (float) (this.anInt3589 - this.anInt3778) / (float) this.anInt3752;
		@Pc(56) float local56 = (float) (this.anInt3713 - this.anInt3756) * this.aFloat48 / (float) this.anInt3758;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local41 != local15 && local27 != local56) {
			OpenGL.glOrtho((double) local15, (double) local41, (double) -local56, (double) -local27, (double) ((float) this.anInt3747 - this.aFloat46), (double) ((float) this.anInt3745 - this.aFloat46));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ih", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3713 < arg3) {
			arg3 = this.anInt3713;
		}
		if (this.anInt3589 < arg2) {
			arg2 = this.anInt3589;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt3743 = arg2;
		this.anInt3744 = arg3;
		this.anInt3750 = arg1;
		this.anInt3774 = arg0;
		OpenGL.glEnable(3089);
		this.method2900();
		this.method2859();
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(Z)V")
	private void method2900() {
		this.aFloat41 = this.anInt3744 - this.anInt3756;
		this.aFloat55 = this.anInt3774 - this.anInt3778;
		this.aFloat54 = this.anInt3743 - this.anInt3778;
		this.aFloat52 = this.anInt3750 - this.anInt3756;
	}

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "(I)V")
	private void method2901() {
		@Pc(15) int local15;
		if (this.aBoolean223) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt3760;
		} else {
			this.aFloat49 = (float) (this.anInt3745 - this.anInt3776) - this.aFloat59;
			this.aFloat44 = this.aFloat49 - this.aFloat47 * (float) this.anInt3773;
			if (this.aFloat44 < (float) this.anInt3747) {
				this.aFloat44 = this.anInt3747;
			}
			OpenGL.glFogf(2915, this.aFloat44);
			OpenGL.glFogf(2916, this.aFloat49);
			local15 = this.anInt3753;
		}
		Static82.aFloatArray13[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static82.aFloatArray13[2] = (float) (local15 & 0xFF) / 255.0F;
		Static82.aFloatArray13[1] = (float) (local15 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static82.aFloatArray13, 0);
		if (this.aBoolean223) {
			this.aClass43_1.aClass100_Sub8_1.method6146();
		}
	}

	@OriginalMember(owner = "client!ih", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt3744 = this.anInt3713;
		this.anInt3750 = 0;
		this.anInt3743 = this.anInt3589;
		this.anInt3774 = 0;
		OpenGL.glDisable(3089);
		this.method2900();
	}

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "(I)V")
	private void method2902() {
		OpenGL.glDepthMask(this.aBoolean225 && this.aBoolean220);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)I")
	public int method2903(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "()Z")
	@Override
	public boolean method5963() {
		if (this.aClass1_Sub24_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass1_Sub24_Sub1_1.method3583()) {
			if (!this.aClass136_1.method3196(this.aClass1_Sub24_Sub1_1)) {
				return false;
			}
			this.aClass107_1.method2629();
		}
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)V")
	public void method2904(@OriginalArg(0) int arg0) {
		this.method2918(true, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "(B)V")
	private void method2905() {
		if (this.aBoolean230 && this.anInt3773 >= 0 | this.aBoolean223) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "()V")
	@Override
	protected void method5906() {
		for (@Pc(4) Class1 local4 = this.aClass203_23.method4548(); local4 != null; local4 = this.aClass203_23.method4545()) {
			((Class1_Sub11_Sub1) local4).method1302();
		}
		if (this.aClass136_1 != null) {
			this.aClass136_1.method3199();
		}
		if (this.anOpenGL1 != null) {
			this.method2913();
			@Pc(37) Enumeration local37 = this.aHashtable1.keys();
			while (local37.hasMoreElements()) {
				@Pc(42) Canvas local42 = (Canvas) local37.nextElement();
				@Pc(48) Long local48 = (Long) this.aHashtable1.get(local42);
				this.anOpenGL1.releaseSurface(local42, local48);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean208) {
			Static198.method6180(true, false);
			this.aBoolean208 = false;
		}
	}

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "()Z")
	@Override
	public boolean method5975() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat43;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean223) {
			throw new RuntimeException("");
		}
		this.anInt3760 = arg1;
		this.anInt3777 = arg3;
		this.anInt3772 = arg2;
		this.anInt3764 = arg0;
		this.aClass43_1.aClass100_Sub8_1.method6148();
		this.method2901();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLclient!h;)V")
	public void method2906(@OriginalArg(1) Interface2 arg0) {
		if (this.anInt3738 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3738 >= 0) {
			this.anInterface2Array2[this.anInt3738].method3135();
		}
		this.anInterface2_2 = this.anInterface2Array2[++this.anInt3738] = arg0;
		this.anInterface2_2.method3136();
	}

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "(I)V")
	private void method2907() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray16, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "(B)V")
	public void method2908() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "()V")
	@Override
	public void method5926() {
		this.method2914(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ih", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt3713 - local12 - arg1, arg2, 1, 32993, this.anInt3759, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ih", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3778 = arg0;
		this.anInt3758 = arg3;
		this.anInt3752 = arg2;
		this.anInt3756 = arg1;
		this.method2929();
		this.method2900();
		if (this.anInt3757 == 3) {
			this.method2899();
		} else if (this.anInt3757 == 2) {
			this.method2907();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!oi;B)V")
	public void method2910(@OriginalArg(0) Interface10 arg0) {
		if (arg0 != this.anInterface10_3) {
			if (this.aBoolean215) {
				OpenGL.glBindBufferARB(34963, arg0.method5858());
			}
			this.anInterface10_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
		this.anInt3734 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt3734++;
		}
		this.anInt3733 = 0x1 << this.anInt3734;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class96 method5979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class96_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(Z)V")
	@Override
	public void method5982(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)I")
	public int method2911(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLclient!kk;)V")
	public void method2912(@OriginalArg(1) Class8 arg0) {
		@Pc(13) Class8 local13 = this.aClass8Array1[this.anInt3768];
		if (local13 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local13.anInt3947);
			} else {
				if (local13 == null) {
					OpenGL.glEnable(arg0.anInt3947);
				} else if (arg0.anInt3947 != local13.anInt3947) {
					OpenGL.glDisable(local13.anInt3947);
					OpenGL.glEnable(arg0.anInt3947);
				}
				OpenGL.glBindTexture(arg0.anInt3947, arg0.method3069());
			}
			this.aClass8Array1[this.anInt3768] = arg0;
		}
		this.anInt3746 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "(B)V")
	private void method2913() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(IZ)V")
	public void method2914(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean225 != arg0) {
			this.aBoolean225 = arg0;
			this.method2902();
			this.anInt3746 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIII)V")
	public void method2915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5934(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas18) {
			local5 = this.aLong101;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable1.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas17) {
			this.method2882();
		}
	}

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "(I)V")
	private void method2916() {
		Static82.aFloatArray13[0] = this.aFloat51 * this.aFloat58;
		Static82.aFloatArray13[1] = this.aFloat58 * this.aFloat50;
		Static82.aFloatArray13[2] = this.aFloat45 * this.aFloat58;
		Static82.aFloatArray13[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static82.aFloatArray13, 0);
		Static82.aFloatArray13[1] = this.aFloat50 * -this.aFloat42;
		Static82.aFloatArray13[2] = this.aFloat45 * -this.aFloat42;
		Static82.aFloatArray13[0] = this.aFloat51 * -this.aFloat42;
		Static82.aFloatArray13[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static82.aFloatArray13, 0);
	}

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "()V")
	@Override
	public void method5961() {
		if (this.aClass1_Sub24_Sub1_1 != null && this.aClass1_Sub24_Sub1_1.method3583()) {
			this.aClass136_1.method3195(this.aClass1_Sub24_Sub1_1);
			this.aClass107_1.method2629();
		}
	}

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt3767 != arg0;
		if (local15 || this.aFloat58 != arg1 || arg2 != this.aFloat42) {
			this.aFloat42 = arg2;
			this.anInt3767 = arg0;
			this.aFloat58 = arg1;
			if (local15) {
				this.aFloat50 = (float) (this.anInt3767 & 0xFF00) / 65280.0F;
				this.aFloat51 = (float) (this.anInt3767 & 0xFF0000) / 1.671168E7F;
				this.aFloat45 = (float) (this.anInt3767 & 0xFF) / 255.0F;
				this.method2878();
			}
			this.method2916();
		}
		if (arg3 == this.aFloatArray17[0] && arg4 == this.aFloatArray17[1] && arg5 == this.aFloatArray17[2]) {
			return;
		}
		this.aFloatArray17[2] = arg5;
		this.aFloatArray17[1] = arg4;
		this.aFloatArray17[0] = arg3;
		this.aFloatArray15[1] = -arg4;
		this.aFloatArray15[2] = -arg5;
		this.aFloatArray15[0] = -arg3;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray18[2] = arg5 * local142;
		this.aFloatArray18[1] = local142 * arg4;
		this.aFloatArray18[0] = arg3 * local142;
		this.aFloatArray19[0] = -this.aFloatArray18[0];
		this.aFloatArray19[1] = -this.aFloatArray18[1];
		this.aFloatArray19[2] = -this.aFloatArray18[2];
		this.method2863();
		this.anInt3766 = (int) (arg3 * 256.0F / arg4);
		this.anInt3754 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "(I)V")
	private void method2917() {
		if (this.aBoolean212) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean212 = false;
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	@Override
	public void method5915(@OriginalArg(0) int arg0) {
		this.method2913();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZI)V")
	public void method2918(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		this.method2865(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "(II)V")
	public synchronized void method2919(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub33 local16 = new Class1_Sub33(arg0);
		this.aClass203_27.method4551(local16);
	}

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "()V")
	@Override
	public void method5977() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "(I)V")
	public void method2920() {
		if (this.anInt3746 == 4) {
			return;
		}
		this.method2884();
		this.method2846(false);
		this.method2858(false);
		this.method2922(false);
		this.method2914(false);
		this.method2904(-2);
		this.method2927(1);
		this.method2851(0);
		this.anInt3746 = 4;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5923(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "()Lclient!c;")
	@Override
	public Class40 method5918() {
		return this.aClass40_Sub2_1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class137 method5931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class137_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([BZIII)Lclient!oi;")
	public Interface10 method2921(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) int arg2) {
		return (Interface10) (this.aBoolean215 && (!arg1 || this.aBoolean224) ? new Class234_Sub2(this, 5123, arg0, arg2, arg1) : new Class4_Sub1(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass136_1.method3201(arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(ZZ)V")
	public void method2922(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean234 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt3746 &= 0xFFFFFFE0;
		this.aBoolean234 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean223 = true;
		this.anInt3772 = arg2;
		this.anInt3760 = arg1;
		this.anInt3777 = arg3;
		this.anInt3764 = arg0;
		this.aClass43_1.method925(3, false, 0, 0, false);
		this.aClass43_1.aClass100_Sub8_1.method6148();
		this.method2901();
		this.method2905();
	}

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "()Z")
	@Override
	public boolean method5930() {
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(III)V")
	public void method2923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3768 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt3748 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local11 = true;
			this.anInt3748 = arg0;
		}
		if (this.anInt3755 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt3755 = arg1;
			local11 = true;
		}
		if (local11) {
			this.anInt3746 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "(I)V")
	private void method2924() {
		@Pc(9) int local9 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local9++ > 5) {
				throw new RuntimeException("");
			}
			Static289.method4249(1000L);
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(IIII)V")
	public void method2925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(Z)I")
	private int method2926() {
		@Pc(5) int local5 = 0;
		this.aString31 = OpenGL.glGetString(7936).toLowerCase();
		this.aString32 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString31.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString31.indexOf("brian paul") != -1 || this.aString31.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(52) String[] local52 = Static117.method1928(' ', local44.replace('.', ' '));
		if (local52.length >= 2) {
			try {
				@Pc(64) int local64 = Static293.method3599(local52[0]);
				@Pc(70) int local70 = Static293.method3599(local52[1]);
				this.anInt3742 = local64 * 10 + local70;
			} catch (@Pc(79) NumberFormatException local79) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt3742 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(119) int[] local119 = new int[1];
		OpenGL.glGetIntegerv(34018, local119, 0);
		this.anInt3771 = local119[0];
		OpenGL.glGetIntegerv(34929, local119, 0);
		this.anInt3769 = local119[0];
		OpenGL.glGetIntegerv(34930, local119, 0);
		this.anInt3763 = local119[0];
		if (this.anInt3771 < 2 || this.anInt3769 < 2 || this.anInt3763 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean227 = NativeStream.a();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean215 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean211 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean219 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean218 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean232 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean217 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean216 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean210 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean213 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean236 = false;
		this.aBoolean233 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean231 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean235 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean229 = this.aBoolean235 & this.aBoolean231;
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "()Z")
	@Override
	public boolean method5927() {
		return this.aBoolean211 && (!this.method5945() || this.aBoolean229);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IB)V")
	public void method2927(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt3762) {
			return;
		}
		@Pc(19) boolean local19;
		@Pc(21) byte local21;
		if (arg0 == 1) {
			local19 = true;
			local21 = 1;
		} else if (arg0 == 2) {
			local19 = false;
			local21 = 2;
		} else if (arg0 == 128) {
			local21 = 3;
			local19 = true;
		} else {
			local21 = 0;
			local19 = false;
		}
		if (!this.aBoolean226) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean226 = true;
		}
		if (this.aBoolean221 != local19) {
			if (local19) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean221 = local19;
		}
		if (this.anInt3761 != local21) {
			if (local21 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local21 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local21 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt3761 = local21;
		}
		this.anInt3762 = arg0;
		this.anInt3746 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(III)V")
	public synchronized void method2928(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub33 local8 = new Class1_Sub33(arg0);
		local8.aLong228 = arg1;
		this.aClass203_28.method4551(local8);
	}

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "(B)V")
	private void method2929() {
		@Pc(6) float[] local6 = this.aFloatArray16;
		@Pc(18) float local18 = (float) (-this.anInt3778 * this.anInt3747) / (float) this.anInt3752;
		@Pc(36) float local36 = (float) ((this.anInt3589 - this.anInt3778) * this.anInt3747) / (float) this.anInt3752;
		@Pc(47) float local47 = (float) (this.anInt3747 * this.anInt3756) / (float) this.anInt3758;
		@Pc(62) float local62 = (float) (this.anInt3747 * (this.anInt3756 - this.anInt3713)) / (float) this.anInt3758;
		if (local36 == local18 || local62 == local47) {
			local6[0] = 1.0F;
			local6[5] = 1.0F;
			local6[13] = 0.0F;
			local6[1] = 0.0F;
			local6[11] = 0.0F;
			local6[14] = 0.0F;
			local6[9] = 0.0F;
			local6[8] = 0.0F;
			local6[4] = 0.0F;
			local6[6] = 0.0F;
			local6[2] = 0.0F;
			local6[3] = 0.0F;
			local6[10] = 1.0F;
			local6[15] = 1.0F;
			local6[7] = 0.0F;
			local6[12] = 0.0F;
		} else {
			@Pc(76) float local76 = (float) this.anInt3747 * 2.0F;
			local6[3] = 0.0F;
			local6[5] = local76 / (local47 - local62);
			local6[13] = 0.0F;
			local6[1] = 0.0F;
			local6[14] = this.aFloat53 = -(local76 * (float) this.anInt3745) / (float) (this.anInt3745 - this.anInt3747);
			local6[6] = 0.0F;
			local6[12] = 0.0F;
			local6[10] = this.aFloat57 = (float) -(this.anInt3745 + this.anInt3747) / (float) (this.anInt3745 - this.anInt3747);
			local6[7] = 0.0F;
			local6[4] = 0.0F;
			local6[0] = local76 / (local36 - local18);
			local6[11] = -1.0F;
			local6[9] = (local62 + local47) / (-local62 + local47);
			local6[8] = (local36 + local18) / (-local18 + local36);
			local6[15] = 0.0F;
			local6[2] = 0.0F;
		}
		this.method2867();
	}

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "()Z")
	@Override
	public boolean method5942() {
		return true;
	}
}
