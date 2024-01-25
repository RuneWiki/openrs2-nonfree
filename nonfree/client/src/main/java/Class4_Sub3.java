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

@OriginalClass("client!mh")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
	public int anInt5633;

	@OriginalMember(owner = "client!mh", name = "ib", descriptor = "I")
	public int anInt5651;

	@OriginalMember(owner = "client!mh", name = "sb", descriptor = "I")
	private int anInt5659;

	@OriginalMember(owner = "client!mh", name = "Id", descriptor = "I")
	private int anInt5773;

	@OriginalMember(owner = "client!mh", name = "oe", descriptor = "I")
	public int anInt5794;

	@OriginalMember(owner = "client!mh", name = "re", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!mh", name = "xe", descriptor = "Lclient!tu;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!mh", name = "ze", descriptor = "Lclient!tu;")
	private Interface17 anInterface17_2;

	@OriginalMember(owner = "client!mh", name = "Ce", descriptor = "I")
	private int anInt5799;

	@OriginalMember(owner = "client!mh", name = "De", descriptor = "I")
	public int anInt5800;

	@OriginalMember(owner = "client!mh", name = "Ee", descriptor = "I")
	public int anInt5801;

	@OriginalMember(owner = "client!mh", name = "Me", descriptor = "Z")
	public boolean aBoolean421;

	@OriginalMember(owner = "client!mh", name = "Ne", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!mh", name = "Oe", descriptor = "Z")
	private boolean aBoolean422;

	@OriginalMember(owner = "client!mh", name = "Qe", descriptor = "I")
	private int anInt5802;

	@OriginalMember(owner = "client!mh", name = "Re", descriptor = "I")
	public int anInt5803;

	@OriginalMember(owner = "client!mh", name = "Se", descriptor = "F")
	private float aFloat109;

	@OriginalMember(owner = "client!mh", name = "Te", descriptor = "Z")
	private boolean aBoolean423;

	@OriginalMember(owner = "client!mh", name = "Ue", descriptor = "Lclient!kc;")
	public Class128_Sub2 aClass128_Sub2_3;

	@OriginalMember(owner = "client!mh", name = "Ve", descriptor = "Z")
	public boolean aBoolean424;

	@OriginalMember(owner = "client!mh", name = "Xe", descriptor = "Z")
	private boolean aBoolean425;

	@OriginalMember(owner = "client!mh", name = "af", descriptor = "F")
	public float aFloat111;

	@OriginalMember(owner = "client!mh", name = "df", descriptor = "Z")
	private boolean aBoolean428;

	@OriginalMember(owner = "client!mh", name = "ef", descriptor = "Z")
	public boolean aBoolean429;

	@OriginalMember(owner = "client!mh", name = "hf", descriptor = "F")
	private float aFloat113;

	@OriginalMember(owner = "client!mh", name = "kf", descriptor = "Z")
	public boolean aBoolean430;

	@OriginalMember(owner = "client!mh", name = "lf", descriptor = "I")
	private int anInt5807;

	@OriginalMember(owner = "client!mh", name = "mf", descriptor = "Z")
	private boolean aBoolean431;

	@OriginalMember(owner = "client!mh", name = "nf", descriptor = "Z")
	public boolean aBoolean432;

	@OriginalMember(owner = "client!mh", name = "of", descriptor = "I")
	private int anInt5808;

	@OriginalMember(owner = "client!mh", name = "pf", descriptor = "Lclient!sb;")
	public Class97_Sub3 aClass97_Sub3_1;

	@OriginalMember(owner = "client!mh", name = "qf", descriptor = "Lclient!kc;")
	public Class128_Sub2 aClass128_Sub2_4;

	@OriginalMember(owner = "client!mh", name = "rf", descriptor = "Ljava/lang/String;")
	private String aString134;

	@OriginalMember(owner = "client!mh", name = "sf", descriptor = "Lclient!ro;")
	public Class258 aClass258_7;

	@OriginalMember(owner = "client!mh", name = "uf", descriptor = "Lclient!sb;")
	public Class97_Sub3 aClass97_Sub3_2;

	@OriginalMember(owner = "client!mh", name = "wf", descriptor = "I")
	private int anInt5810;

	@OriginalMember(owner = "client!mh", name = "xf", descriptor = "Lclient!qo;")
	private Interface15 anInterface15_3;

	@OriginalMember(owner = "client!mh", name = "yf", descriptor = "Lclient!sb;")
	public Class97_Sub3 aClass97_Sub3_3;

	@OriginalMember(owner = "client!mh", name = "Af", descriptor = "Lclient!sb;")
	public Class97_Sub3 aClass97_Sub3_4;

	@OriginalMember(owner = "client!mh", name = "Df", descriptor = "I")
	private int anInt5813;

	@OriginalMember(owner = "client!mh", name = "Ef", descriptor = "Lclient!wj;")
	private Interface20 anInterface20_3;

	@OriginalMember(owner = "client!mh", name = "Gf", descriptor = "Lclient!sb;")
	public Class97_Sub3 aClass97_Sub3_5;

	@OriginalMember(owner = "client!mh", name = "Hf", descriptor = "I")
	public int anInt5815;

	@OriginalMember(owner = "client!mh", name = "If", descriptor = "Z")
	private boolean aBoolean434;

	@OriginalMember(owner = "client!mh", name = "Jf", descriptor = "Lclient!rr;")
	public Class164_Sub3 aClass164_Sub3_5;

	@OriginalMember(owner = "client!mh", name = "Kf", descriptor = "F")
	public float aFloat115;

	@OriginalMember(owner = "client!mh", name = "Nf", descriptor = "Lclient!sb;")
	public Class97_Sub3 aClass97_Sub3_6;

	@OriginalMember(owner = "client!mh", name = "Of", descriptor = "I")
	private int anInt5816;

	@OriginalMember(owner = "client!mh", name = "Rf", descriptor = "Lclient!ro;")
	public Class258 aClass258_8;

	@OriginalMember(owner = "client!mh", name = "Sf", descriptor = "Z")
	public boolean aBoolean435;

	@OriginalMember(owner = "client!mh", name = "Tf", descriptor = "Z")
	private boolean aBoolean436;

	@OriginalMember(owner = "client!mh", name = "Wf", descriptor = "Lclient!sb;")
	public Class97_Sub3 aClass97_Sub3_7;

	@OriginalMember(owner = "client!mh", name = "Xf", descriptor = "[Lclient!uu;")
	private Class164[] aClass164Array1;

	@OriginalMember(owner = "client!mh", name = "Zf", descriptor = "F")
	public float aFloat120;

	@OriginalMember(owner = "client!mh", name = "ag", descriptor = "Z")
	private boolean aBoolean438;

	@OriginalMember(owner = "client!mh", name = "bg", descriptor = "Lclient!gca;")
	private Class103_Sub2 aClass103_Sub2_1;

	@OriginalMember(owner = "client!mh", name = "gg", descriptor = "Z")
	public boolean aBoolean441;

	@OriginalMember(owner = "client!mh", name = "hg", descriptor = "I")
	public int anInt5820;

	@OriginalMember(owner = "client!mh", name = "jg", descriptor = "F")
	public float aFloat121;

	@OriginalMember(owner = "client!mh", name = "lg", descriptor = "Z")
	private boolean aBoolean443;

	@OriginalMember(owner = "client!mh", name = "qg", descriptor = "I")
	public int anInt5824;

	@OriginalMember(owner = "client!mh", name = "rg", descriptor = "Lclient!er;")
	public Class89 aClass89_6;

	@OriginalMember(owner = "client!mh", name = "sg", descriptor = "I")
	private int anInt5825;

	@OriginalMember(owner = "client!mh", name = "wg", descriptor = "I")
	private int anInt5827;

	@OriginalMember(owner = "client!mh", name = "xg", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!mh", name = "yg", descriptor = "Lclient!sb;")
	public Class97_Sub3 aClass97_Sub3_8;

	@OriginalMember(owner = "client!mh", name = "zg", descriptor = "Z")
	private boolean aBoolean444;

	@OriginalMember(owner = "client!mh", name = "Ag", descriptor = "Lclient!sb;")
	public Class97_Sub3 aClass97_Sub3_9;

	@OriginalMember(owner = "client!mh", name = "Cg", descriptor = "J")
	private long aLong148;

	@OriginalMember(owner = "client!mh", name = "Eg", descriptor = "Lclient!sb;")
	public Class97_Sub3 aClass97_Sub3_10;

	@OriginalMember(owner = "client!mh", name = "Gg", descriptor = "I")
	private int anInt5829;

	@OriginalMember(owner = "client!mh", name = "Jg", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!mh", name = "Mg", descriptor = "I")
	private int anInt5832;

	@OriginalMember(owner = "client!mh", name = "Ng", descriptor = "Z")
	public boolean aBoolean446;

	@OriginalMember(owner = "client!mh", name = "Rg", descriptor = "Lclient!qo;")
	private Interface15 anInterface15_4;

	@OriginalMember(owner = "client!mh", name = "Sg", descriptor = "Z")
	public boolean aBoolean447;

	@OriginalMember(owner = "client!mh", name = "Ug", descriptor = "Lclient!wo;")
	private Class164_Sub3_Sub1 aClass164_Sub3_Sub1_5;

	@OriginalMember(owner = "client!mh", name = "Vg", descriptor = "F")
	private float aFloat129;

	@OriginalMember(owner = "client!mh", name = "Wg", descriptor = "Ljava/lang/String;")
	private String aString135;

	@OriginalMember(owner = "client!mh", name = "Zg", descriptor = "I")
	private int anInt5836;

	@OriginalMember(owner = "client!mh", name = "fh", descriptor = "I")
	private int anInt5838;

	@OriginalMember(owner = "client!mh", name = "hh", descriptor = "I")
	private int anInt5839;

	@OriginalMember(owner = "client!mh", name = "fd", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "client!mh", name = "de", descriptor = "I")
	public int anInt5790 = 128;

	@OriginalMember(owner = "client!mh", name = "je", descriptor = "Lclient!og;")
	private final Class213 aClass213_1 = new Class213();

	@OriginalMember(owner = "client!mh", name = "le", descriptor = "Lclient!kc;")
	private final Class128_Sub2 aClass128_Sub2_1 = new Class128_Sub2();

	@OriginalMember(owner = "client!mh", name = "me", descriptor = "Lclient!kc;")
	public final Class128_Sub2 aClass128_Sub2_2 = new Class128_Sub2();

	@OriginalMember(owner = "client!mh", name = "ne", descriptor = "I")
	public int anInt5793 = 8;

	@OriginalMember(owner = "client!mh", name = "se", descriptor = "Z")
	private boolean aBoolean420 = false;

	@OriginalMember(owner = "client!mh", name = "qe", descriptor = "I")
	public int anInt5795 = 3;

	@OriginalMember(owner = "client!mh", name = "pe", descriptor = "Lclient!ui;")
	private final Class295 aClass295_22 = new Class295();

	@OriginalMember(owner = "client!mh", name = "ue", descriptor = "I")
	private int anInt5796 = -1;

	@OriginalMember(owner = "client!mh", name = "we", descriptor = "[Lclient!tu;")
	private final Interface17[] anInterface17Array2 = new Interface17[4];

	@OriginalMember(owner = "client!mh", name = "ve", descriptor = "[Lclient!tu;")
	private final Interface17[] anInterface17Array1 = new Interface17[4];

	@OriginalMember(owner = "client!mh", name = "ye", descriptor = "[Lclient!tu;")
	private final Interface17[] anInterface17Array3 = new Interface17[4];

	@OriginalMember(owner = "client!mh", name = "Be", descriptor = "I")
	private int anInt5798 = -1;

	@OriginalMember(owner = "client!mh", name = "Ae", descriptor = "I")
	private int anInt5797 = -1;

	@OriginalMember(owner = "client!mh", name = "Fe", descriptor = "Lclient!ui;")
	private final Class295 aClass295_23;

	@OriginalMember(owner = "client!mh", name = "Ge", descriptor = "Lclient!ui;")
	private final Class295 aClass295_24;

	@OriginalMember(owner = "client!mh", name = "He", descriptor = "Lclient!ui;")
	private final Class295 aClass295_25;

	@OriginalMember(owner = "client!mh", name = "Ie", descriptor = "Lclient!ui;")
	private final Class295 aClass295_26;

	@OriginalMember(owner = "client!mh", name = "Je", descriptor = "Lclient!ui;")
	private final Class295 aClass295_27;

	@OriginalMember(owner = "client!mh", name = "Ke", descriptor = "Lclient!ui;")
	private final Class295 aClass295_28;

	@OriginalMember(owner = "client!mh", name = "Le", descriptor = "Lclient!ui;")
	private final Class295 aClass295_29;

	@OriginalMember(owner = "client!mh", name = "Pe", descriptor = "[F")
	private final float[] aFloatArray49;

	@OriginalMember(owner = "client!mh", name = "ff", descriptor = "I")
	public int anInt5805;

	@OriginalMember(owner = "client!mh", name = "zf", descriptor = "I")
	public int anInt5811;

	@OriginalMember(owner = "client!mh", name = "Mf", descriptor = "F")
	public float aFloat117;

	@OriginalMember(owner = "client!mh", name = "We", descriptor = "F")
	private float aFloat110;

	@OriginalMember(owner = "client!mh", name = "Pf", descriptor = "I")
	private int anInt5817;

	@OriginalMember(owner = "client!mh", name = "Qf", descriptor = "F")
	public float aFloat118;

	@OriginalMember(owner = "client!mh", name = "bf", descriptor = "I")
	public int bf;

	@OriginalMember(owner = "client!mh", name = "tf", descriptor = "I")
	private int anInt5809;

	@OriginalMember(owner = "client!mh", name = "pg", descriptor = "[Lclient!cba;")
	private final Class1_Sub5[] aClass1_Sub5Array5;

	@OriginalMember(owner = "client!mh", name = "mg", descriptor = "[F")
	private final float[] aFloatArray51;

	@OriginalMember(owner = "client!mh", name = "kg", descriptor = "I")
	public int anInt5821;

	@OriginalMember(owner = "client!mh", name = "ng", descriptor = "I")
	public int anInt5822;

	@OriginalMember(owner = "client!mh", name = "cg", descriptor = "[F")
	private final float[] aFloatArray50;

	@OriginalMember(owner = "client!mh", name = "ig", descriptor = "Z")
	private boolean aBoolean442;

	@OriginalMember(owner = "client!mh", name = "Lf", descriptor = "F")
	public float aFloat116;

	@OriginalMember(owner = "client!mh", name = "Ff", descriptor = "I")
	private int anInt5814;

	@OriginalMember(owner = "client!mh", name = "Ye", descriptor = "I")
	private int anInt5804;

	@OriginalMember(owner = "client!mh", name = "vg", descriptor = "I")
	public int anInt5826;

	@OriginalMember(owner = "client!mh", name = "Uf", descriptor = "F")
	private float aFloat119;

	@OriginalMember(owner = "client!mh", name = "Bg", descriptor = "I")
	private int anInt5828;

	@OriginalMember(owner = "client!mh", name = "Ig", descriptor = "I")
	public int anInt5830;

	@OriginalMember(owner = "client!mh", name = "tg", descriptor = "F")
	private float aFloat122;

	@OriginalMember(owner = "client!mh", name = "ug", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!mh", name = "dg", descriptor = "I")
	public int anInt5819;

	@OriginalMember(owner = "client!mh", name = "Bf", descriptor = "I")
	public int anInt5812;

	@OriginalMember(owner = "client!mh", name = "vf", descriptor = "F")
	public float aFloat114;

	@OriginalMember(owner = "client!mh", name = "Qg", descriptor = "I")
	private int anInt5833;

	@OriginalMember(owner = "client!mh", name = "Dg", descriptor = "F")
	private float aFloat125;

	@OriginalMember(owner = "client!mh", name = "Pg", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!mh", name = "Lg", descriptor = "I")
	private int anInt5831;

	@OriginalMember(owner = "client!mh", name = "gf", descriptor = "F")
	public float aFloat112;

	@OriginalMember(owner = "client!mh", name = "Tg", descriptor = "I")
	public int anInt5834;

	@OriginalMember(owner = "client!mh", name = "og", descriptor = "I")
	public int anInt5823;

	@OriginalMember(owner = "client!mh", name = "Yf", descriptor = "I")
	private int anInt5818;

	@OriginalMember(owner = "client!mh", name = "Xg", descriptor = "I")
	private int anInt5835;

	@OriginalMember(owner = "client!mh", name = "Og", descriptor = "[F")
	public final float[] aFloatArray52;

	@OriginalMember(owner = "client!mh", name = "Yg", descriptor = "F")
	private float aFloat130;

	@OriginalMember(owner = "client!mh", name = "ah", descriptor = "I")
	private int anInt5837;

	@OriginalMember(owner = "client!mh", name = "ch", descriptor = "[F")
	private final float[] aFloatArray53;

	@OriginalMember(owner = "client!mh", name = "Fg", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!mh", name = "Hg", descriptor = "Lclient!gt;")
	public Class1_Sub17_Sub1 aClass1_Sub17_Sub1_2;

	@OriginalMember(owner = "client!mh", name = "eh", descriptor = "[I")
	public int[] anIntArray453;

	@OriginalMember(owner = "client!mh", name = "dh", descriptor = "[I")
	public int[] anIntArray452;

	@OriginalMember(owner = "client!mh", name = "gh", descriptor = "[B")
	public final byte[] aByteArray76;

	@OriginalMember(owner = "client!mh", name = "ih", descriptor = "[I")
	public int[] anIntArray454;

	@OriginalMember(owner = "client!mh", name = "Rb", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas10;

	@OriginalMember(owner = "client!mh", name = "Jd", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!mh", name = "he", descriptor = "I")
	public final int anInt5791;

	@OriginalMember(owner = "client!mh", name = "jb", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!mh", name = "kd", descriptor = "J")
	private final long aLong146;

	@OriginalMember(owner = "client!mh", name = "sd", descriptor = "J")
	private long aLong147;

	@OriginalMember(owner = "client!mh", name = "jf", descriptor = "I")
	public final int anInt5806;

	@OriginalMember(owner = "client!mh", name = "cf", descriptor = "Z")
	public boolean aBoolean427;

	@OriginalMember(owner = "client!mh", name = "eg", descriptor = "Z")
	private boolean aBoolean439;

	@OriginalMember(owner = "client!mh", name = "Ze", descriptor = "Z")
	public boolean aBoolean426;

	@OriginalMember(owner = "client!mh", name = "Cf", descriptor = "Z")
	public boolean aBoolean433;

	@OriginalMember(owner = "client!mh", name = "Kg", descriptor = "Z")
	private boolean aBoolean445;

	@OriginalMember(owner = "client!mh", name = "Vf", descriptor = "Z")
	public boolean aBoolean437;

	@OriginalMember(owner = "client!mh", name = "bh", descriptor = "Z")
	public boolean aBoolean448;

	@OriginalMember(owner = "client!mh", name = "fg", descriptor = "Z")
	private final boolean aBoolean440;

	@OriginalMember(owner = "client!mh", name = "ee", descriptor = "Lclient!qd;")
	private final Class237 aClass237_1;

	@OriginalMember(owner = "client!mh", name = "te", descriptor = "Lclient!ar;")
	public final Class16 aClass16_1;

	@OriginalMember(owner = "client!mh", name = "ge", descriptor = "Lclient!bba;")
	private final Class23 aClass23_1;

	@OriginalMember(owner = "client!mh", name = "fe", descriptor = "Lclient!lv;")
	private Class1_Sub34_Sub1 aClass1_Sub34_Sub1_1;

	@OriginalMember(owner = "client!mh", name = "be", descriptor = "Lclient!sl;")
	private final Class268 aClass268_1;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;I)V")
	public Class4_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface13 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class259();
		new Class230(16);
		this.aClass295_23 = new Class295();
		this.aClass295_24 = new Class295();
		this.aClass295_25 = new Class295();
		this.aClass295_26 = new Class295();
		this.aClass295_27 = new Class295();
		this.aClass295_28 = new Class295();
		this.aClass295_29 = new Class295();
		this.aFloatArray49 = new float[16];
		this.anInt5805 = 512;
		this.anInt5811 = 0;
		this.aFloat117 = -1.0F;
		this.aFloat110 = 0.0F;
		this.anInt5817 = 0;
		this.aFloat118 = 3584.0F;
		this.bf = 0;
		this.anInt5809 = 0;
		this.aClass1_Sub5Array5 = new Class1_Sub5[Static363.anInt6548];
		this.aFloatArray51 = new float[4];
		this.anInt5821 = 3584;
		this.anInt5822 = 0;
		this.aFloatArray50 = new float[4];
		this.aBoolean442 = true;
		this.aFloat116 = 1.0F;
		this.anInt5814 = -1;
		this.anInt5804 = 8448;
		this.anInt5826 = -1;
		this.aFloat119 = 1.0F;
		this.anInt5828 = 8448;
		this.anInt5830 = 0;
		this.aFloat122 = -1.0F;
		this.aFloat123 = 3000.0F;
		this.anInt5819 = -1;
		this.anInt5812 = -1;
		this.aFloat114 = -1.0F;
		this.anInt5833 = 0;
		this.aFloat125 = 1.0F;
		this.aFloat128 = 1.0F;
		this.anInt5831 = 0;
		this.aFloat112 = 1.0F;
		this.anInt5834 = 512;
		this.anInt5823 = 50;
		this.anInt5818 = -1;
		this.anInt5835 = 0;
		this.aFloatArray52 = new float[4];
		this.aFloat130 = -1.0F;
		this.anInt5837 = 0;
		this.aFloatArray53 = new float[4];
		this.aFloat126 = 3584.0F;
		this.aClass1_Sub17_Sub1_2 = new Class1_Sub17_Sub1(8192);
		this.anIntArray453 = new int[1];
		this.anIntArray452 = new int[1];
		this.aByteArray76 = new byte[16384];
		this.anIntArray454 = new int[1];
		this.aCanvas11 = this.aCanvas10 = arg0;
		this.anInt5791 = arg2;
		if (!Static259.method4668("jaclib")) {
			throw new RuntimeException("");
		} else if (Static259.method4668("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong147 = this.aLong146 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt5791);
				if (this.aLong146 == 0L) {
					throw new RuntimeException("");
				}
				this.method5244();
				@Pc(318) int local318 = this.method5275();
				if (local318 != 0) {
					throw new RuntimeException("");
				}
				this.anInt5806 = this.aBoolean421 ? 33639 : 5121;
				@Pc(341) int local341;
				if (this.aString134.indexOf("radeon") != -1) {
					local341 = 0;
					@Pc(343) boolean local343 = false;
					@Pc(345) boolean local345 = false;
					@Pc(354) String[] local354 = Static340.method5715(this.aString134.replace('/', ' '), ' ');
					for (@Pc(356) int local356 = 0; local356 < local354.length; local356++) {
						@Pc(362) String local362 = local354[local356];
						try {
							if (local362.length() > 0) {
								if (local362.charAt(0) == 'x' && local362.length() >= 3 && Static453.method6978(local362.substring(1, 3))) {
									local362 = local362.substring(1);
									local345 = true;
								}
								if (local362.equals("hd")) {
									local343 = true;
								} else {
									if (local362.startsWith("hd")) {
										local343 = true;
										local362 = local362.substring(2);
									}
									if (local362.length() >= 4 && Static453.method6978(local362.substring(0, 4))) {
										local341 = Static302.method8211(local362.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(425) Exception local425) {
						}
					}
					if (!local345 && !local343) {
						if (local341 >= 7000 && local341 <= 9250) {
							this.aBoolean427 = false;
						}
						if (local341 >= 7000 && local341 <= 7999) {
							this.aBoolean439 = false;
						}
					}
					if (!local343 || local341 < 4000) {
						this.aBoolean426 = false;
					}
					this.aBoolean433 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean445 = this.aBoolean439;
					this.aBoolean437 = true;
				}
				if (this.aString135.indexOf("intel") != -1) {
					this.aBoolean448 = false;
				}
				this.aBoolean440 = !this.aString135.equals("s3 graphics");
				if (this.aBoolean439) {
					try {
						@Pc(508) int[] local508 = new int[1];
						OpenGL.glGenBuffersARB(1, local508, 0);
					} catch (@Pc(514) Throwable local514) {
						throw new RuntimeException("");
					}
				}
				Static290.method5100(false, true);
				this.aBoolean420 = true;
				this.aClass237_1 = new Class237(this, super.anInterface13_13);
				this.method5259();
				this.aClass16_1 = new Class16(this);
				this.aClass23_1 = new Class23(this);
				if (this.aClass23_1.method790()) {
					this.aClass1_Sub34_Sub1_1 = new Class1_Sub34_Sub1(this);
					if (!this.aClass1_Sub34_Sub1_1.method5035()) {
						this.aClass1_Sub34_Sub1_1.method5021();
						this.aClass1_Sub34_Sub1_1 = null;
					}
				}
				this.aClass268_1 = new Class268(this);
				this.method5242();
				this.method5227();
				OpenGL.glClear(16640);
				local341 = 0;
				while (true) {
					try {
						this.anOpenGL1.swapBuffers();
						break;
					} catch (@Pc(593) Exception local593) {
						if (local341++ > 5) {
							throw new RuntimeException("");
						}
						Static265.method3147(100L);
					}
				}
				OpenGL.glClear(16384);
			} catch (@Pc(613) Throwable local613) {
				local613.printStackTrace();
				this.method7197();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mh", name = "IA", descriptor = "(III[I)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass128_Sub2_3.aFloat96 + (float) arg2 * this.aClass128_Sub2_3.aFloat99 + (float) arg0 * this.aClass128_Sub2_3.aFloat92 + (float) arg1 * this.aClass128_Sub2_3.aFloat91;
		if ((float) this.anInt5823 > local28 || local28 > (float) this.anInt5821) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass128_Sub2_3.aFloat98 * (float) arg1 + this.aClass128_Sub2_3.aFloat100 * (float) arg0 + (float) arg2 * this.aClass128_Sub2_3.aFloat95 + this.aClass128_Sub2_3.aFloat93) * (float) this.anInt5834 / local28);
		@Pc(117) int local117 = (int) ((this.aClass128_Sub2_3.aFloat94 + this.aClass128_Sub2_3.aFloat89 * (float) arg0 + this.aClass128_Sub2_3.aFloat90 * (float) arg1 + (float) arg2 * this.aClass128_Sub2_3.aFloat97) * (float) this.anInt5805 / local28);
		if (this.aFloat120 <= (float) local85 && (float) local85 <= this.aFloat115 && this.aFloat111 <= (float) local117 && (float) local117 <= this.aFloat108) {
			arg3[1] = (int) ((float) local117 - this.aFloat111);
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat120);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!r;Lclient!ka;Lclient!m;Lclient!cf;I)V")
	@Override
	public void method7211(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) Class46_Sub1 arg3) {
		arg0.method6773(arg2, arg3, 0);
		this.method7179(arg1);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!qo;I)V")
	public void method5224(@OriginalArg(0) Interface15 arg0) {
		if (arg0 != this.anInterface15_4) {
			if (this.aBoolean439) {
				OpenGL.glBindBufferARB(34962, arg0.method3790());
			}
			this.anInterface15_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)V")
	public void method5225(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt5816) {
			return;
		}
		@Pc(16) boolean local16;
		@Pc(14) byte local14;
		if (arg0 == 1) {
			local14 = 1;
			local16 = true;
		} else if (arg0 == 2) {
			local14 = 2;
			local16 = false;
		} else if (arg0 == 128) {
			local16 = true;
			local14 = 3;
		} else {
			local16 = false;
			local14 = 0;
		}
		if (!this.aBoolean443) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean443 = true;
		}
		if (this.aBoolean431 != local16) {
			if (local16) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean431 = local16;
		}
		if (this.anInt5802 != local14) {
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
			this.anInt5802 = local14;
		}
		this.anInt5807 &= 0xFFFFFFE3;
		this.anInt5816 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!mv;Lclient!mv;FLclient!mv;)Lclient!mv;")
	@Override
	public Class103 method7200(@OriginalArg(0) Class103 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class103 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean429 && this.aBoolean448) {
			@Pc(15) Class103_Sub2_Sub1 local15 = null;
			@Pc(18) Class103_Sub2 local18 = (Class103_Sub2) arg0;
			@Pc(21) Class103_Sub2 local21 = (Class103_Sub2) arg1;
			@Pc(25) Class164_Sub1 local25 = local18.method4825();
			@Pc(29) Class164_Sub1 local29 = local21.method4825();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local25.anInt4799 > local29.anInt4799 ? local25.anInt4799 : local29.anInt4799;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class103_Sub2_Sub1) {
					@Pc(56) Class103_Sub2_Sub1 local56 = (Class103_Sub2_Sub1) arg3;
					if (local44 == local56.method4052()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class103_Sub2_Sub1(this, local44);
				}
				if (local15.method4054(arg2, local29, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V")
	public void method5226(@OriginalArg(1) int arg0) {
		Static374.aFloatArray58[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static374.aFloatArray58[3] = (float) (arg0 >>> 24) / 255.0F;
		Static374.aFloatArray58[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static374.aFloatArray58[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static374.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "(I)V")
	private void method5227() {
		if (this.aCanvas11 == null) {
			this.anInt5773 = this.anInt5659 = 0;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas11.getSize();
			this.anInt5773 = local14.width;
			this.anInt5659 = local14.height;
		}
		if (this.anInterface17_1 == null) {
			this.anInt5651 = this.anInt5773;
			this.anInt5633 = this.anInt5659;
			this.method5262();
		}
		this.method5246();
		this.n();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZII)V")
	public void method5228(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method5234(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "(I)V")
	private void method5229() {
		if (this.anInt5809 >= this.anInt5835 && this.anInt5837 <= this.anInt5817) {
			OpenGL.glScissor(this.anInt5835 + this.anInt5831, -this.anInt5817 + this.anInt5833 + this.anInt5633, this.anInt5809 - this.anInt5835, -this.anInt5837 + this.anInt5817);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public Class1_Sub23 method7220(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub23_Sub1 local8 = new Class1_Sub23_Sub1(arg0);
		this.aClass295_22.method7533(local8);
		return local8;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)V")
	public void method5230(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method5266(7681, 7681);
		} else if (arg0 == 0) {
			this.method5266(8448, 8448);
		} else if (arg0 == 2) {
			this.method5266(7681, 34165);
		} else if (arg0 == 3) {
			this.method5266(8448, 260);
		} else if (arg0 == 4) {
			this.method5266(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public Class104 method7199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class104_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "()V")
	@Override
	public void method7168() {
		if (!this.aBoolean440 || this.anInt5651 <= 0 || this.anInt5633 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt5835;
		@Pc(22) int local22 = this.anInt5809;
		@Pc(25) int local25 = this.anInt5837;
		@Pc(28) int local28 = this.anInt5817;
		this.n();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5246();
		this.method5270(false);
		this.method5273(false);
		this.method5241(false);
		this.method5268(false);
		this.method5250(null);
		this.method5238(-2);
		this.method5230(1);
		this.method5225(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt5651, this.anInt5633, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.N(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "()Z")
	@Override
	public boolean method7153() {
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "N", descriptor = "(IIII)V")
	@Override
	public void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt5633 < arg3) {
			arg3 = this.anInt5633;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt5651 < arg2) {
			arg2 = this.anInt5651;
		}
		this.anInt5835 = arg0;
		this.anInt5817 = arg3;
		this.anInt5837 = arg1;
		this.anInt5809 = arg2;
		OpenGL.glEnable(3089);
		this.method5272();
		this.method5229();
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(II)I")
	public int method5231(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!mh", name = "A", descriptor = "(IIIII)V")
	@Override
	protected void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt5835 > arg2 + arg0 || arg0 - arg2 > this.anInt5809 || this.anInt5837 > arg2 + arg1 || this.anInt5817 < arg1 - arg2) {
			return;
		}
		this.method5284();
		this.method5225(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(78) float local78 = (float) arg0 + 0.35F;
		@Pc(83) float local83 = (float) arg1 + 0.35F;
		@Pc(87) int local87 = arg2 << 1;
		if ((float) local87 < this.aFloat122) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local78 + 1.0F, local83 + 1.0F);
			OpenGL.glVertex2f(local78 + 1.0F, local83 - 1.0F);
			OpenGL.glVertex2f(local78 - 1.0F, local83 - 1.0F);
			OpenGL.glVertex2f(local78 - 1.0F, local83 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local87 <= this.aFloat130) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local87);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local78, local83);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local78, local83);
			@Pc(142) int local142 = 262144 / (arg2 * 6);
			if (local142 <= 64) {
				local142 = 64;
			} else if (local142 > 512) {
				local142 = 512;
			}
			local142 = Static513.method7859(local142);
			OpenGL.glVertex2f(local78 + (float) arg2, local83);
			for (@Pc(171) int local171 = 16384 - local142; local171 > 0; local171 -= local142) {
				OpenGL.glVertex2f(local78 + Class1_Sub3_Sub9.aFloatArray22[local171] * (float) arg2, Class1_Sub3_Sub9.aFloatArray23[local171] * (float) arg2 + local83);
			}
			OpenGL.glVertex2f((float) arg2 + local78, local83);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
	public synchronized void method5232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class1_Sub14 local21 = new Class1_Sub14(arg1);
		local21.aLong251 = arg0;
		this.aClass295_27.method7533(local21);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
	private void method5233() {
		OpenGL.glDepthMask(this.aBoolean438 && this.aBoolean442);
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method5284();
		this.method5225(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean422) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean422) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!mh", name = "la", descriptor = "(FF)V")
	@Override
	public void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat123 == arg0 && this.aFloat127 == arg1) {
			return;
		}
		this.aFloat123 = arg0;
		this.aFloat127 = arg1;
		this.method5243();
		if (this.anInt5825 == 3) {
			this.method5256();
		} else if (this.anInt5825 == 2) {
			this.method5239();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZZ)V")
	public void method5234(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt5827 != arg0) {
			if (arg0 < 0) {
				this.method5303();
				this.method5250(null);
				this.method5230(0);
				if (!this.aBoolean435) {
					this.aClass268_1.method6967(0, arg2, 0, 0, arg1);
				}
			} else {
				@Pc(17) Class164_Sub3 local17 = this.aClass237_1.method6236(arg0);
				@Pc(23) Class296 local23 = super.anInterface13_13.method5789(arg0);
				if (local23.aByte101 == 0 && local23.aByte105 == 0) {
					this.method5303();
				} else {
					@Pc(42) int local42 = local23.aBoolean638 ? 64 : 128;
					@Pc(46) int local46 = local42 * 50;
					this.method5286((float) (local23.aByte105 * (this.anInt5794 % local46)) / (float) local46, 0.0F, (float) (this.anInt5794 % local46 * local23.aByte101) / (float) local46);
				}
				if (this.aBoolean435) {
					this.method5250(local17);
					this.method5230(local23.anInt8644);
				} else {
					this.aClass268_1.method6967(local23.anInt8641, arg2, local23.aByte104, local23.aByte100, arg1);
					if (!this.aClass268_1.method6966(local17, local23.anInt8644)) {
						this.method5250(local17);
						this.method5230(local23.anInt8644);
					}
				}
			}
			this.anInt5827 = arg0;
		}
		this.anInt5807 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!mh", name = "JA", descriptor = "(IIII)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean435) {
			throw new RuntimeException("");
		}
		this.anInt5830 = arg3;
		this.anInt5814 = arg1;
		this.anInt5826 = arg2;
		this.anInt5824 = arg0;
		this.aClass268_1.aClass83_Sub2_1.method2305();
		this.method5297();
	}

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "()V")
	@Override
	public void method7173() {
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method5284();
		this.method5225(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean422) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean422) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!mh", name = "P", descriptor = "()F")
	@Override
	public float P() {
		return this.aFloat123;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)V")
	private void method5235() {
		if (this.aBoolean436 && this.aBoolean435 | this.anInt5812 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZIII)V")
	public void method5236(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "(I)V")
	private void method5237() {
		@Pc(6) float[] local6 = this.aFloatArray49;
		@Pc(18) float local18 = (float) (this.anInt5823 * -this.anInt5822) / (float) this.anInt5834;
		@Pc(33) float local33 = (float) ((this.anInt5651 - this.anInt5822) * this.anInt5823) / (float) this.anInt5834;
		@Pc(53) float local53 = (float) (this.anInt5811 * this.anInt5823) / (float) this.anInt5805;
		@Pc(68) float local68 = (float) ((this.anInt5811 - this.anInt5633) * this.anInt5823) / (float) this.anInt5805;
		if (local18 == local33 || local68 == local53) {
			local6[15] = 1.0F;
			local6[0] = 1.0F;
			local6[2] = 0.0F;
			local6[8] = 0.0F;
			local6[11] = 0.0F;
			local6[6] = 0.0F;
			local6[10] = 1.0F;
			local6[14] = 0.0F;
			local6[12] = 0.0F;
			local6[4] = 0.0F;
			local6[13] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = 1.0F;
			local6[7] = 0.0F;
			local6[9] = 0.0F;
			local6[1] = 0.0F;
		} else {
			@Pc(148) float local148 = (float) this.anInt5823 * 2.0F;
			local6[6] = 0.0F;
			local6[1] = 0.0F;
			local6[7] = 0.0F;
			local6[3] = 0.0F;
			local6[8] = (local33 + local18) / (local33 - local18);
			local6[11] = -1.0F;
			local6[14] = this.aFloat109 = -((float) this.anInt5821 * local148) / (float) (this.anInt5821 - this.anInt5823);
			local6[4] = 0.0F;
			local6[15] = 0.0F;
			local6[0] = local148 / (local33 - local18);
			local6[10] = this.aFloat113 = (float) -(this.anInt5823 + this.anInt5821) / (float) (this.anInt5821 - this.anInt5823);
			local6[9] = (local53 + local68) / (local53 - local68);
			local6[2] = 0.0F;
			local6[12] = 0.0F;
			local6[13] = 0.0F;
			local6[5] = local148 / (local53 - local68);
		}
		this.method5243();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public void method7212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class28 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class28_Sub1 local6 = (Class28_Sub1) arg5;
		@Pc(9) Class164_Sub3_Sub1 local9 = local6.aClass164_Sub3_Sub1_1;
		this.method5267();
		this.method5250(local6.aClass164_Sub3_Sub1_1);
		this.method5225(1);
		this.method5266(8448, 7681);
		this.method5293(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat191 / (float) local9.anInt9484;
		@Pc(46) float local46 = local9.aFloat192 / (float) local9.anInt9477;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local59 * local59)));
		@Pc(76) float local76 = local59 * local72;
		@Pc(80) float local80 = local52 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f(local80 + (float) arg2 + 0.35F, local76 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method5293(0, 768, 5890);
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(II)V")
	public void method5238(@OriginalArg(1) int arg0) {
		this.method5228(true, arg0);
	}

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "(I)V")
	private void method5239() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray49, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V")
	private void method5240() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt5810; local7++) {
			@Pc(14) Class1_Sub5 local14 = this.aClass1_Sub5Array5[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static170.aFloatArray25[0] = local14.method4306();
			Static170.aFloatArray25[1] = local14.method4305();
			Static170.aFloatArray25[2] = local14.method4314();
			Static170.aFloatArray25[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static170.aFloatArray25, 0);
			@Pc(52) int local52 = local14.method4313();
			@Pc(58) float local58 = local14.method4310() / 255.0F;
			Static170.aFloatArray25[2] = local58 * (float) (local52 & 0xFF);
			Static170.aFloatArray25[0] = local58 * (float) (local52 >> 16 & 0xFF);
			Static170.aFloatArray25[1] = local58 * (float) (local52 >> 8 & 0xFF);
			OpenGL.glLightfv(local18, 4609, Static170.aFloatArray25, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method4311() * local14.method4311()));
			OpenGL.glEnable(local18);
		}
		while (local7 < this.anInt5836) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt5836 = this.anInt5810;
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "()V")
	@Override
	public void method7154() {
		if (this.aClass1_Sub34_Sub1_1 != null && this.aClass1_Sub34_Sub1_1.method5027()) {
			this.aClass23_1.method792(this.aClass1_Sub34_Sub1_1);
			this.aClass237_1.method6239();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BZ)V")
	public void method5241(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean428 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean428 = arg0;
		this.anInt5807 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7206(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static349.aFloat135 = arg2;
		Static478.aFloat182 = arg0;
		Static361.aFloat141 = arg1;
	}

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "()Lclient!m;")
	@Override
	public Class128 method7189() {
		return new Class128_Sub2();
	}

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "(I)V")
	private void method5242() {
		this.method5238(-2);
		for (@Pc(14) int local14 = this.anInt5803 - 1; local14 >= 0; local14--) {
			this.method5245(local14);
			this.method5250(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5266(8448, 8448);
		this.method5293(2, 770, 34168);
		this.method5303();
		this.anInt5816 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt5802 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean431 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean443 = true;
		this.method5270(true);
		this.method5273(true);
		this.method5241(true);
		this.method5268(true);
		this.method5246();
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
		@Pc(139) float[] local139 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(141) int local141 = 0; local141 < 8; local141++) {
			@Pc(147) int local147 = local141 + 16384;
			OpenGL.glLightfv(local147, 4608, local139, 0);
			OpenGL.glLightf(local147, 4615, 0.0F);
			OpenGL.glLightf(local147, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt5818 = this.anInt5819 = -1;
		this.n();
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(B)V")
	private void method5243() {
		if (this.aFloat127 == 0.0F) {
			this.aFloatArray49[10] = this.aFloat113;
			this.aFloatArray49[14] = this.aFloat109;
		} else {
			@Pc(31) float local31 = this.aFloat123 / (this.aFloat127 + this.aFloat123);
			@Pc(35) float local35 = local31 * local31;
			@Pc(51) float local51 = -this.aFloat109 * (1.0F - local31) * (1.0F - local31) / this.aFloat127;
			this.aFloatArray49[10] = local51 + this.aFloat113;
			this.aFloatArray49[14] = local35 * this.aFloat109;
		}
		this.aFloat126 = (this.aFloatArray49[14] - (float) this.anInt5821) / this.aFloatArray49[10];
		this.aFloat118 = (float) this.anInt5821 - this.aFloat127;
	}

	@OriginalMember(owner = "client!mh", name = "F", descriptor = "(IIII)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5809 > arg2) {
			this.anInt5809 = arg2;
		}
		if (this.anInt5817 > arg3) {
			this.anInt5817 = arg3;
		}
		if (arg0 > this.anInt5835) {
			this.anInt5835 = arg0;
		}
		if (this.anInt5837 < arg1) {
			this.anInt5837 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method5272();
		this.method5229();
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
	@Override
	public void method7196(@OriginalArg(0) int arg0) {
		this.method5244();
	}

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "()Z")
	@Override
	public boolean method7182() {
		return this.aClass1_Sub34_Sub1_1 != null && this.aClass1_Sub34_Sub1_1.method5027();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7177(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class1_Sub14 local19;
		while (!this.aClass295_24.method7536()) {
			local19 = (Class1_Sub14) this.aClass295_24.method7547();
			Static291.anIntArray449[local7++] = (int) local19.aLong251;
			this.anInt5800 -= local19.anInt2795;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static291.anIntArray449, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static291.anIntArray449, 0);
			local7 = 0;
		}
		while (!this.aClass295_25.method7536()) {
			local19 = (Class1_Sub14) this.aClass295_25.method7547();
			Static291.anIntArray449[local7++] = (int) local19.aLong251;
			this.anInt5801 -= local19.anInt2795;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static291.anIntArray449, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static291.anIntArray449, 0);
			local7 = 0;
		}
		while (!this.aClass295_26.method7536()) {
			local19 = (Class1_Sub14) this.aClass295_26.method7547();
			Static291.anIntArray449[local7++] = local19.anInt2795;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static291.anIntArray449, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static291.anIntArray449, 0);
			local7 = 0;
		}
		while (!this.aClass295_27.method7536()) {
			local19 = (Class1_Sub14) this.aClass295_27.method7547();
			Static291.anIntArray449[local7++] = (int) local19.aLong251;
			this.anInt5799 -= local19.anInt2795;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static291.anIntArray449, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static291.anIntArray449, 0);
		}
		while (!this.aClass295_23.method7536()) {
			local19 = (Class1_Sub14) this.aClass295_23.method7547();
			OpenGL.glDeleteLists((int) local19.aLong251, local19.anInt2795);
		}
		@Pc(210) Class1 local210;
		while (!this.aClass295_28.method7536()) {
			local210 = this.aClass295_28.method7547();
			OpenGL.glDeleteProgramARB((int) local210.aLong251);
		}
		while (!this.aClass295_29.method7536()) {
			local210 = this.aClass295_29.method7547();
			OpenGL.glDeleteObjectARB(local210.aLong251);
		}
		while (!this.aClass295_23.method7536()) {
			local19 = (Class1_Sub14) this.aClass295_23.method7547();
			OpenGL.glDeleteLists((int) local19.aLong251, local19.anInt2795);
		}
		this.aClass237_1.method6235();
		if (this.U() > 100663296 && this.aLong148 + 60000L < Static110.method2222()) {
			System.gc();
			this.aLong148 = Static110.method2222();
		}
		this.anInt5794 = local11;
	}

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "(I)V")
	private void method5244() {
		@Pc(15) int local15 = 0;
		while (!this.anOpenGL1.b()) {
			if (local15++ > 5) {
				throw new RuntimeException("");
			}
			Static265.method3147(1000L);
		}
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(II)V")
	public void method5245(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt5813) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt5813 = arg0;
		}
	}

	@OriginalMember(owner = "client!mh", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt5799 + this.anInt5801 + this.anInt5800;
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)V")
	public void method5246() {
		if (this.anInt5825 != 0) {
			this.anInt5807 &= 0xFFFFFFE0;
			this.anInt5825 = 0;
		}
	}

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "(I)V")
	public void method5247() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V")
	@Override
	public void method7214(@OriginalArg(0) boolean arg0) {
		this.aBoolean442 = arg0;
		this.method5233();
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(BI)V")
	public synchronized void method5248(@OriginalArg(1) int arg0) {
		@Pc(11) Class1 local11 = new Class1();
		local11.aLong251 = arg0;
		this.aClass295_28.method7533(local11);
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "()Z")
	@Override
	public boolean method7152() {
		return false;
	}

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "(I)V")
	public void method5249() {
		if (this.anInt5807 == 4) {
			return;
		}
		this.method5305();
		this.method5270(false);
		this.method5273(false);
		this.method5241(false);
		this.method5268(false);
		this.method5238(-2);
		this.method5225(1);
		this.anInt5807 = 4;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!uu;)V")
	public void method5250(@OriginalArg(1) Class164 arg0) {
		@Pc(11) Class164 local11 = this.aClass164Array1[this.anInt5813];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt9448);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt9448);
				} else if (arg0.anInt9448 != local11.anInt9448) {
					OpenGL.glDisable(local11.anInt9448);
					OpenGL.glEnable(arg0.anInt9448);
				}
				OpenGL.glBindTexture(arg0.anInt9448, arg0.method8151());
			}
			this.aClass164Array1[this.anInt5813] = arg0;
		}
		this.anInt5807 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "(B)V")
	public void method5251() {
		if (this.anInt5807 == 16) {
			return;
		}
		this.method5281();
		this.method5270(true);
		this.method5241(true);
		this.method5268(true);
		this.method5225(1);
		this.anInt5807 = 16;
	}

	@OriginalMember(owner = "client!mh", name = "D", descriptor = "()Z")
	@Override
	public boolean method7223() {
		return false;
	}

	@OriginalMember(owner = "client!mh", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass128_Sub2_3.aFloat96 + this.aClass128_Sub2_3.aFloat99 * (float) arg2 + (float) arg1 * this.aClass128_Sub2_3.aFloat91 + this.aClass128_Sub2_3.aFloat92 * (float) arg0;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass128_Sub2_3.aFloat96 + this.aClass128_Sub2_3.aFloat99 * (float) arg5 + this.aClass128_Sub2_3.aFloat91 * (float) arg4 + (float) arg3 * this.aClass128_Sub2_3.aFloat92;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt5823 && local59 < (float) this.anInt5823 || !(!((float) this.anInt5821 < local28) || !((float) this.anInt5821 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt5834 * ((float) arg2 * this.aClass128_Sub2_3.aFloat95 + (float) arg0 * this.aClass128_Sub2_3.aFloat100 + (float) arg1 * this.aClass128_Sub2_3.aFloat98 + this.aClass128_Sub2_3.aFloat93) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt5834 * ((float) arg3 * this.aClass128_Sub2_3.aFloat100 + (float) arg4 * this.aClass128_Sub2_3.aFloat98 + (float) arg5 * this.aClass128_Sub2_3.aFloat95 + this.aClass128_Sub2_3.aFloat93) / local59);
		if ((float) local123 < this.aFloat120 && (float) local155 < this.aFloat120 || this.aFloat115 < (float) local123 && this.aFloat115 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt5805 * (this.aClass128_Sub2_3.aFloat94 + this.aClass128_Sub2_3.aFloat97 * (float) arg2 + (float) arg1 * this.aClass128_Sub2_3.aFloat90 + (float) arg0 * this.aClass128_Sub2_3.aFloat89) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt5805 * (this.aClass128_Sub2_3.aFloat94 + this.aClass128_Sub2_3.aFloat89 * (float) arg3 + this.aClass128_Sub2_3.aFloat90 * (float) arg4 + (float) arg5 * this.aClass128_Sub2_3.aFloat97) / local59);
			return (!(this.aFloat111 > (float) local213) || !((float) local245 < this.aFloat111)) && (!((float) local213 > this.aFloat108) || !((float) local245 > this.aFloat108));
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!mv;)V")
	@Override
	public void method7218(@OriginalArg(0) Class103 arg0) {
		this.aClass103_Sub2_1 = (Class103_Sub2) arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZF)V")
	public void method5252(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat119) {
			this.aFloat119 = arg0;
			if (this.anInt5825 == 3) {
				this.method5256();
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBZLclient!jaclib/memory/Buffer;I)Lclient!qo;")
	public Interface15 method5253(@OriginalArg(0) int arg0, @OriginalArg(3) Buffer arg1, @OriginalArg(4) int arg2) {
		return (Interface15) (this.aBoolean439 ? new Class125_Sub1(this, arg2, arg1, arg0, false) : new Class138_Sub1(this, arg2, arg1));
	}

	@OriginalMember(owner = "client!mh", name = "x", descriptor = "()Z")
	@Override
	public boolean method7204() {
		if (this.aClass1_Sub34_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass1_Sub34_Sub1_1.method5027()) {
			if (!this.aClass23_1.method797(this.aClass1_Sub34_Sub1_1)) {
				return false;
			}
			this.aClass237_1.method6239();
		}
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "()V")
	@Override
	protected void method7197() {
		for (@Pc(6) Class1 local6 = this.aClass295_22.method7543(); local6 != null; local6 = this.aClass295_22.method7540()) {
			((Class1_Sub23_Sub1) local6).method4009();
		}
		if (this.aClass23_1 != null) {
			this.aClass23_1.method794();
		}
		if (this.anOpenGL1 != null) {
			this.method5290();
			@Pc(40) Enumeration local40 = this.aHashtable3.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable3.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean420) {
			Static133.method7848(true, false);
			this.aBoolean420 = false;
		}
	}

	@OriginalMember(owner = "client!mh", name = "ra", descriptor = "()F")
	@Override
	public float ra() {
		return this.aFloat127;
	}

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "()Z")
	@Override
	public boolean method7166() {
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "(I)V")
	public void method5254() {
		if (this.anInt5807 == 8) {
			return;
		}
		this.method5291();
		this.method5270(true);
		this.method5241(true);
		this.method5268(true);
		this.method5225(1);
		this.anInt5807 = 8;
	}

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "()I")
	@Override
	public int method7163() {
		return 4;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)Lclient!mv;")
	@Override
	public Class103 method7172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean429 ? new Class103_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.anInt5837 = 0;
		this.anInt5817 = this.anInt5633;
		this.anInt5835 = 0;
		this.anInt5809 = this.anInt5651;
		OpenGL.glDisable(3089);
		this.method5272();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(JI)V")
	public synchronized void method5255(@OriginalArg(0) long arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong251 = arg0;
		this.aClass295_29.method7533(local7);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!dp;Z)Lclient!ha;")
	@Override
	public Class104 method7149(@OriginalArg(0) Class70 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt2012 * arg0.anInt2013];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray18 == null) {
			for (local21 = 0; local21 < arg0.anInt2012; local21++) {
				for (local25 = 0; local25 < arg0.anInt2013; local25++) {
					@Pc(87) int local87 = arg0.anIntArray142[arg0.aByteArray19[local14++] & 0xFF];
					local12[local16++] = local87 == 0 ? 0 : local87 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt2012; local21++) {
				for (local25 = 0; local25 < arg0.anInt2013; local25++) {
					local12[local16++] = arg0.anIntArray142[arg0.aByteArray19[local14] & 0xFF] | arg0.aByteArray18[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(126) Class104 local126 = this.method7156(local12, arg0.anInt2013, arg0.anInt2013, arg0.anInt2012);
		local126.KA(arg0.anInt2011, arg0.anInt2010, arg0.anInt2015, arg0.anInt2014);
		return local126;
	}

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "(B)V")
	private void method5256() {
		@Pc(15) float local15 = (float) -this.anInt5822 * this.aFloat119 / (float) this.anInt5834;
		@Pc(27) float local27 = (float) -this.anInt5811 * this.aFloat119 / (float) this.anInt5805;
		@Pc(49) float local49 = (float) (this.anInt5651 - this.anInt5822) * this.aFloat119 / (float) this.anInt5834;
		@Pc(64) float local64 = this.aFloat119 * (float) (this.anInt5633 - this.anInt5811) / (float) this.anInt5805;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local49 != local15 && local27 != local64) {
			OpenGL.glOrtho((double) local15, (double) local49, (double) -local64, (double) -local27, (double) ((float) this.anInt5823 - this.aFloat127), (double) ((float) this.anInt5821 - this.aFloat127));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!kc;)V")
	public void method5257(@OriginalArg(1) Class128_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method4329(), 0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BFF)V")
	public void method5258(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat110 = arg1;
		this.aFloat125 = arg0;
		if (!this.aBoolean435) {
			this.method5297();
		}
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
	@Override
	public void method7213(@OriginalArg(0) int arg0) {
		this.method5290();
	}

	@OriginalMember(owner = "client!mh", name = "CA", descriptor = "()I")
	@Override
	public int CA() {
		return this.anInt5821;
	}

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "(I)V")
	private void method5259() {
		this.aClass128_Sub2_3 = new Class128_Sub2();
		this.aClass128_Sub2_4 = new Class128_Sub2();
		this.aClass164Array1 = new Class164[this.anInt5803];
		this.aClass164_Sub3_5 = new Class164_Sub3(this, 3553, 6408, 1, 1);
		new Class164_Sub3(this, 3553, 6408, 1, 1);
		new Class164_Sub3(this, 3553, 6408, 1, 1);
		this.aClass97_Sub3_9 = new Class97_Sub3(this);
		this.aClass97_Sub3_3 = new Class97_Sub3(this);
		this.aClass97_Sub3_8 = new Class97_Sub3(this);
		this.aClass97_Sub3_4 = new Class97_Sub3(this);
		this.aClass97_Sub3_5 = new Class97_Sub3(this);
		this.aClass97_Sub3_7 = new Class97_Sub3(this);
		this.aClass97_Sub3_10 = new Class97_Sub3(this);
		this.aClass97_Sub3_2 = new Class97_Sub3(this);
		this.aClass97_Sub3_1 = new Class97_Sub3(this);
		this.aClass97_Sub3_6 = new Class97_Sub3(this);
		if (this.aBoolean448) {
			this.aClass89_6 = new Class89(this);
			new Class89(this);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method7210(@OriginalArg(0) Class1_Sub23 arg0) {
		this.aNativeHeap4 = ((Class1_Sub23_Sub1) arg0).aNativeHeap3;
		if (this.anInterface15_3 != null) {
			return;
		}
		@Pc(16) Class1_Sub17_Sub1 local16 = new Class1_Sub17_Sub1(80);
		if (this.aBoolean421) {
			local16.method3096(-1.0F);
			local16.method3096(-1.0F);
			local16.method3096(0.0F);
			local16.method3096(0.0F);
			local16.method3096(1.0F);
			local16.method3096(1.0F);
			local16.method3096(-1.0F);
			local16.method3096(0.0F);
			local16.method3096(1.0F);
			local16.method3096(1.0F);
			local16.method3096(1.0F);
			local16.method3096(1.0F);
			local16.method3096(0.0F);
			local16.method3096(1.0F);
			local16.method3096(0.0F);
			local16.method3096(-1.0F);
			local16.method3096(1.0F);
			local16.method3096(0.0F);
			local16.method3096(0.0F);
			local16.method3096(0.0F);
		} else {
			local16.method3095(-1.0F);
			local16.method3095(-1.0F);
			local16.method3095(0.0F);
			local16.method3095(0.0F);
			local16.method3095(1.0F);
			local16.method3095(1.0F);
			local16.method3095(-1.0F);
			local16.method3095(0.0F);
			local16.method3095(1.0F);
			local16.method3095(1.0F);
			local16.method3095(1.0F);
			local16.method3095(1.0F);
			local16.method3095(0.0F);
			local16.method3095(1.0F);
			local16.method3095(0.0F);
			local16.method3095(-1.0F);
			local16.method3095(1.0F);
			local16.method3095(0.0F);
			local16.method3095(0.0F);
			local16.method3095(0.0F);
		}
		this.anInterface15_3 = this.method5299(local16.anInt4872, 20, local16.aByteArray58, false);
		this.aClass258_8 = new Class258(this.anInterface15_3, 5126, 3, 0);
		this.aClass258_7 = new Class258(this.anInterface15_3, 5126, 2, 12);
		this.aClass213_1.method5748(this);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZB)V")
	public void method5260(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean423) {
			this.aBoolean423 = arg0;
			this.method5301();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIB)V")
	public synchronized void method5261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class1_Sub14 local15 = new Class1_Sub14(arg0);
		local15.aLong251 = arg1;
		this.aClass295_24.method7533(local15);
	}

	@OriginalMember(owner = "client!mh", name = "M", descriptor = "(F)V")
	@Override
	public void M(@OriginalArg(0) float arg0) {
		if (this.aFloat121 != arg0) {
			this.aFloat121 = arg0;
			this.method5282();
		}
	}

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "()Z")
	@Override
	public boolean method7208() {
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "A", descriptor = "()Z")
	@Override
	public boolean method7209() {
		return this.aClass1_Sub34_Sub1_1 != null && (this.anInt5791 <= 1 || this.aBoolean425);
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V")
	@Override
	public void method7201(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt5790 = arg0;
		this.aClass237_1.method6239();
	}

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "(I)V")
	private void method5262() {
		OpenGL.glViewport(this.anInt5831, this.anInt5833, this.anInt5651, this.anInt5633);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public Class28 method7186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static117.method2280(arg0, arg2, arg1, this, arg3);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class7 method7187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class7_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.anInt5823;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!tu;I)V")
	public void method5263(@OriginalArg(0) Interface17 arg0) {
		if (this.aBoolean446) {
			this.method5269(arg0);
			this.method5277(arg0);
		} else if (this.anInt5797 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt5797 >= 0) {
				this.anInterface17Array3[this.anInt5797].method2249();
			}
			this.anInterface17_2 = this.anInterface17_1 = this.anInterface17Array3[++this.anInt5797] = arg0;
			this.anInterface17_2.method2250();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BII)V")
	public void method5264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5833 = arg1;
		this.anInt5831 = arg0;
		this.method5262();
		this.method5229();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!cf;I)V")
	@Override
	public void method7159(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) Class46_Sub1[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method6773(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)I")
	@Override
	public int method7184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!mh", name = "UA", descriptor = "(IIIII)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5284();
		this.method5225(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIBI)V")
	public void method5265(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()Z")
	@Override
	public boolean method7148() {
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(III)V")
	public void method5266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5813 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(26) boolean local26 = false;
		if (arg1 != this.anInt5804) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt5804 = arg1;
			local26 = true;
		}
		if (this.anInt5828 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local26 = true;
			this.anInt5828 = arg0;
		}
		if (local26) {
			this.anInt5807 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method7198(@OriginalArg(0) Class128 arg0) {
		this.aClass128_Sub2_3 = (Class128_Sub2) arg0;
		this.aClass128_Sub2_4.method4328(this.aClass128_Sub2_3);
		if (this.anInt5825 != 1) {
			this.method5274();
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7188(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable3.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "(I)V")
	public void method5267() {
		if (this.anInt5807 == 2) {
			return;
		}
		this.method5305();
		this.method5270(false);
		this.method5273(false);
		this.method5241(false);
		this.method5268(false);
		this.method5238(-2);
		this.anInt5807 = 2;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)V")
	public void method5268(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean438 != arg0) {
			this.aBoolean438 = arg0;
			this.method5233();
			this.anInt5807 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5284();
		this.method5225(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 - (float) arg1;
		@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local23 * local23 + local17 * local17)));
		@Pc(40) float local40 = local17 * local36;
		@Pc(44) float local44 = local23 * local36;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local40 + 0.35F, (float) arg3 + 0.35F + local44);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt5818 != arg0;
		if (local15 || arg1 != this.aFloat114 || arg2 != this.aFloat117) {
			this.anInt5818 = arg0;
			this.aFloat117 = arg2;
			this.aFloat114 = arg1;
			if (local15) {
				this.aFloat112 = (float) (this.anInt5818 & 0xFF00) / 65280.0F;
				this.aFloat116 = (float) (this.anInt5818 & 0xFF) / 255.0F;
				this.aFloat128 = (float) (this.anInt5818 & 0xFF0000) / 1.671168E7F;
				this.method5282();
			}
			this.method5302();
		}
		if (arg3 == this.aFloatArray53[0] && this.aFloatArray53[1] == arg4 && arg5 == this.aFloatArray53[2]) {
			return;
		}
		this.aFloatArray53[1] = arg4;
		this.aFloatArray53[2] = arg5;
		this.aFloatArray53[0] = arg3;
		this.aFloatArray51[0] = -arg3;
		this.aFloatArray51[1] = -arg4;
		this.aFloatArray51[2] = -arg5;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray52[1] = arg4 * local142;
		this.aFloatArray52[0] = arg3 * local142;
		this.aFloatArray52[2] = local142 * arg5;
		this.aFloatArray50[2] = -this.aFloatArray52[2];
		this.aFloatArray50[0] = -this.aFloatArray52[0];
		this.aFloatArray50[1] = -this.aFloatArray52[1];
		this.method5283();
		this.anInt5815 = (int) (arg5 * 256.0F / arg4);
		this.anInt5820 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "()Z")
	@Override
	public boolean method7183() {
		return this.aBoolean422 && (!this.method7182() || this.aBoolean425);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(Lclient!tu;I)V")
	public void method5269(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt5796 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5796 >= 0) {
			this.anInterface17Array2[this.anInt5796].method2252();
		}
		this.anInterface17_2 = this.anInterface17Array2[++this.anInt5796] = arg0;
		this.anInterface17_2.method2248();
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(BZ)V")
	public void method5270(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean436 != arg0) {
			this.aBoolean436 = arg0;
			this.method5235();
			this.anInt5807 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(Z)V")
	@Override
	public void method7216(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(III)V")
	public synchronized void method5271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub14 local12 = new Class1_Sub14(arg0);
		local12.aLong251 = arg1;
		this.aClass295_25.method7533(local12);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I")
	@Override
	public int method7167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ka;)V")
	@Override
	public void method7179(@OriginalArg(0) Class158 arg0) {
		this.aClass213_1.method5752(this, arg0);
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "([I)V")
	@Override
	public void d(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5835;
		arg0[3] = this.anInt5817;
		arg0[1] = this.anInt5837;
		arg0[2] = this.anInt5809;
	}

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "(I)V")
	private void method5272() {
		this.aFloat115 = this.anInt5809 - this.anInt5822;
		this.aFloat111 = this.anInt5837 - this.anInt5811;
		this.aFloat120 = this.anInt5835 - this.anInt5822;
		this.aFloat108 = this.anInt5817 - this.anInt5811;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZZ)V")
	public void method5273(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean444 != arg0) {
			this.aBoolean444 = arg0;
			this.method5301();
			this.anInt5807 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "(B)V")
	private void method5274() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass128_Sub2_3.method4329(), 0);
		if (this.aBoolean435) {
			this.aClass268_1.aClass83_Sub2_1.method2305();
		}
		this.method5283();
		this.method5240();
	}

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "(I)I")
	private int method5275() {
		this.aString135 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString134 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString135.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString135.indexOf("brian paul") != -1 || this.aString135.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static340.method5715(local45.replace('.', ' '), ' ');
		if (local53.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(69) int local69 = Static302.method8211(local53[0]);
				@Pc(75) int local75 = Static302.method8211(local53[1]);
				this.anInt5829 = local75 + local69 * 10;
			} catch (@Pc(84) NumberFormatException local84) {
				local10 |= 0x4;
			}
		}
		if (this.anInt5829 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(120) int[] local120 = new int[1];
		OpenGL.glGetIntegerv(34018, local120, 0);
		this.anInt5803 = local120[0];
		OpenGL.glGetIntegerv(34929, local120, 0);
		this.anInt5832 = local120[0];
		OpenGL.glGetIntegerv(34930, local120, 0);
		this.anInt5808 = local120[0];
		if (this.anInt5803 < 2 || this.anInt5832 < 2 || this.anInt5808 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean421 = Stream.a();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean439 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean422 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean432 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean447 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean424 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean427 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean433 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean429 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean426 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean430 = false;
		this.aBoolean448 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean446 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean441 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean425 = this.aBoolean446 & this.aBoolean441;
		OpenGL.glGetFloatv(2834, Static374.aFloatArray58, 0);
		this.aFloat130 = Static374.aFloatArray58[1];
		this.aFloat122 = Static374.aFloatArray58[0];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7217(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
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

	@OriginalMember(owner = "client!mh", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		this.method5225(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!tu;)V")
	public void method5276(@OriginalArg(1) Interface17 arg0) {
		if (this.aBoolean446) {
			this.method5280(arg0);
			this.method5294(arg0);
		} else if (this.anInt5797 >= 0 && this.anInterface17Array3[this.anInt5797] == arg0) {
			this.anInterface17Array3[this.anInt5797--] = null;
			arg0.method2249();
			if (this.anInt5797 < 0) {
				this.anInterface17_2 = this.anInterface17_1 = null;
			} else {
				this.anInterface17_2 = this.anInterface17_1 = this.anInterface17Array3[this.anInt5797];
				this.anInterface17_2.method2250();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
	@Override
	public void method7185(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mh", name = "E", descriptor = "(III)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt5819 && arg1 == this.anInt5812 && arg2 == this.bf) {
			return;
		}
		this.anInt5812 = arg1;
		this.anInt5819 = arg0;
		this.bf = arg2;
		if (this.aBoolean435) {
			return;
		}
		this.method5297();
		this.method5235();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7158(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas10 == arg0) {
			local5 = this.aLong146;
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable3.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas11 == arg0) {
			this.method5227();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[Lclient!cba;)V")
	@Override
	public void method7222(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass1_Sub5Array5[local3] = arg1[local3];
		}
		this.anInt5810 = arg0;
		if (this.anInt5825 != 1) {
			this.method5240();
		}
	}

	@OriginalMember(owner = "client!mh", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.aBoolean435 = false;
		this.aClass268_1.method6967(0, false, 0, 0, false);
		this.method5297();
		this.method5235();
	}

	@OriginalMember(owner = "client!mh", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class28_Sub1 local6 = (Class28_Sub1) arg1;
		@Pc(9) Class164_Sub3_Sub1 local9 = local6.aClass164_Sub3_Sub1_1;
		this.method5267();
		this.method5250(local6.aClass164_Sub3_Sub1_1);
		this.method5225(1);
		this.method5266(8448, 7681);
		this.method5293(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat191 / (float) local9.anInt9484;
		@Pc(46) float local46 = local9.aFloat192 / (float) local9.anInt9477;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt5835 - arg2) * local39, (float) (this.anInt5837 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5835, this.anInt5837);
		OpenGL.glTexCoord2f((float) (this.anInt5835 - arg2) * local39, (float) (this.anInt5817 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5835, this.anInt5817);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5809 - arg2), local46 * (float) (this.anInt5817 - arg3));
		OpenGL.glVertex2i(this.anInt5809, this.anInt5817);
		OpenGL.glTexCoord2f((float) (this.anInt5809 - arg2) * local39, local46 * (float) (this.anInt5837 - arg3));
		OpenGL.glVertex2i(this.anInt5809, this.anInt5837);
		OpenGL.glEnd();
		this.method5293(0, 768, 5890);
	}

	@OriginalMember(owner = "client!mh", name = "L", descriptor = "(I)V")
	@Override
	public void L(@OriginalArg(0) int arg0) {
		this.anInt5795 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt5795++;
		}
		this.anInt5793 = 0x1 << this.anInt5795;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass23_1.method791(arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "()V")
	@Override
	public void method7161() {
		this.aClass23_1.method793();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ei;IIII)Lclient!r;")
	@Override
	public Class97 method7192(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class97_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!tu;Z)V")
	public void method5277(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt5798 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5798 >= 0) {
			this.anInterface17Array1[this.anInt5798].method2247();
		}
		this.anInterface17_1 = this.anInterface17Array1[++this.anInt5798] = arg0;
		this.anInterface17_1.method2251();
	}

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "(I)Lclient!kh;")
	public Class164_Sub1 method5278() {
		return this.aClass103_Sub2_1 == null ? null : this.aClass103_Sub2_1.method4825();
	}

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "(I)V")
	public void method5279() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!tu;)V")
	public void method5280(@OriginalArg(1) Interface17 arg0) {
		if (this.anInt5796 < 0 || this.anInterface17Array2[this.anInt5796] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface17Array2[this.anInt5796--] = null;
		arg0.method2252();
		if (this.anInt5796 < 0) {
			this.anInterface17_2 = null;
		} else {
			this.anInterface17_2 = this.anInterface17Array2[this.anInt5796];
			this.anInterface17_2.method2248();
		}
	}

	@OriginalMember(owner = "client!mh", name = "x", descriptor = "(I)V")
	private void method5281() {
		if (this.anInt5825 != 3) {
			this.anInt5825 = 3;
			this.method5256();
			this.method5274();
			this.anInt5807 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7174(@OriginalArg(0) Canvas arg0) {
		this.aCanvas11 = null;
		this.aLong147 = 0L;
		if (arg0 == null || this.aCanvas10 == arg0) {
			this.aLong147 = this.aLong146;
			this.aCanvas11 = this.aCanvas10;
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable3.get(arg0);
			this.aLong147 = local36;
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.aLong147 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong147);
		this.method5227();
	}

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "(B)V")
	private void method5282() {
		Static374.aFloatArray58[0] = this.aFloat121 * this.aFloat128;
		Static374.aFloatArray58[2] = this.aFloat121 * this.aFloat116;
		Static374.aFloatArray58[1] = this.aFloat121 * this.aFloat112;
		Static374.aFloatArray58[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static374.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!mh", name = "ta", descriptor = "(II)V")
	@Override
	public void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt5823 && this.anInt5821 == arg1) {
			return;
		}
		this.anInt5821 = arg1;
		this.anInt5823 = arg0;
		this.method5237();
		this.method5297();
		if (this.anInt5825 == 3) {
			this.method5256();
		} else if (this.anInt5825 == 2) {
			this.method5239();
		}
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(Z)V")
	public void method5283() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray52, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray50, 0);
	}

	@OriginalMember(owner = "client!mh", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(61) float local61;
		@Pc(49) float local49;
		if (this.aClass164_Sub3_Sub1_5 == null || this.aClass164_Sub3_Sub1_5.anInt9475 < arg2 || this.aClass164_Sub3_Sub1_5.anInt9468 < arg3) {
			this.aClass164_Sub3_Sub1_5 = Static281.method4925(this, arg3, arg6, arg2);
			this.aClass164_Sub3_Sub1_5.method8159(false, false);
			local61 = this.aClass164_Sub3_Sub1_5.aFloat192;
			local49 = this.aClass164_Sub3_Sub1_5.aFloat191;
		} else {
			this.aClass164_Sub3_Sub1_5.method8161(false, 6406, arg6, arg3, arg2);
			local49 = (float) arg2 * this.aClass164_Sub3_Sub1_5.aFloat191 / (float) this.aClass164_Sub3_Sub1_5.anInt9475;
			local61 = this.aClass164_Sub3_Sub1_5.aFloat192 * (float) arg3 / (float) this.aClass164_Sub3_Sub1_5.anInt9468;
		}
		this.method5267();
		this.method5250(this.aClass164_Sub3_Sub1_5);
		this.method5225(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5226(arg5);
		this.method5266(34165, 34165);
		this.method5293(0, 768, 34166);
		this.method5293(2, 770, 5890);
		this.method5265(0, 34166);
		this.method5265(2, 5890);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = local151 + (float) arg2;
		@Pc(164) float local164 = (float) arg3 + local154;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local49);
		OpenGL.glVertex2f(local151, local164);
		OpenGL.glTexCoord2f(local61, local49);
		OpenGL.glVertex2f(local159, local164);
		OpenGL.glTexCoord2f(local61, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method5293(0, 768, 5890);
		this.method5293(2, 770, 34166);
		this.method5265(0, 5890);
		this.method5265(2, 34166);
	}

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "(I)V")
	private void method5284() {
		if (this.anInt5807 == 1) {
			return;
		}
		this.method5305();
		this.method5270(false);
		this.method5273(false);
		this.method5241(false);
		this.method5268(false);
		this.method5250(null);
		this.method5238(-2);
		this.method5230(1);
		this.anInt5807 = 1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!kc;I)V")
	public void method5285(@OriginalArg(0) Class128_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method4329(), 0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(FFFI)V")
	private void method5286(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean434) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean434 = true;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIILclient!wj;I)V")
	public void method5287(@OriginalArg(1) int arg0, @OriginalArg(3) Interface20 arg1, @OriginalArg(4) int arg2) {
		@Pc(13) int local13 = arg1.method8130();
		@Pc(20) int local20 = arg2 * this.method5231(local13);
		this.method5292(arg1);
		OpenGL.glDrawElements(4, arg0, local13, (long) local20 + arg1.method8131());
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "()Z")
	@Override
	public boolean method7151() {
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "()Lclient!m;")
	@Override
	public Class128 method7165() {
		return this.aClass128_Sub2_1;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)V")
	public synchronized void method5289(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(arg0);
		this.aClass295_26.method7533(local14);
	}

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "()Lclient!fd;")
	@Override
	public Class98 method7207() {
		@Pc(7) int local7 = -1;
		if (this.aString135.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString135.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString135.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class98(local7, "OpenGL", this.anInt5829, this.aString134, 0L);
	}

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "()Z")
	@Override
	public boolean method7180() {
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "B", descriptor = "()Z")
	@Override
	public boolean method7219() {
		return this.aClass268_1.method6964();
	}

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "()V")
	@Override
	public void method7221() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "(IIII)V")
	@Override
	public void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5824 = arg0;
		this.anInt5830 = arg3;
		this.aBoolean435 = true;
		this.anInt5814 = arg1;
		this.anInt5826 = arg2;
		this.aClass268_1.method6967(0, false, 3, 0, false);
		this.aClass268_1.aClass83_Sub2_1.method2305();
		this.method5297();
		this.method5235();
	}

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "()V")
	@Override
	public void method7164() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7215() {
		this.method5284();
		this.method5225(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7203(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!fc;[Lclient!dp;Z)Lclient!ra;")
	@Override
	public Class36 method7193(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class70[] arg1) {
		return new Class36_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "(B)V")
	private void method5290() {
		this.anOpenGL1.a();
	}

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "(B)V")
	private void method5291() {
		if (this.anInt5825 != 2) {
			this.anInt5825 = 2;
			this.method5239();
			this.method5274();
			this.anInt5807 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!wj;)V")
	public void method5292(@OriginalArg(1) Interface20 arg0) {
		if (arg0 != this.anInterface20_3) {
			if (this.aBoolean439) {
				OpenGL.glBindBufferARB(34963, arg0.method8128());
			}
			this.anInterface20_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!mh", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		@Pc(6) int local6 = this.anInt5839;
		this.anInt5839 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(ZIII)V")
	public void method5293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([Lclient!r;Lclient!ka;Lclient!m;[Lclient!cf;I)V")
	@Override
	public void method7175(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) Class46_Sub1[] arg3, @OriginalArg(4) int arg4) {
		this.method7159(arg0, arg2, arg3, arg4);
		this.method7179(arg1);
	}

	@OriginalMember(owner = "client!mh", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		@Pc(6) int local6 = this.anInt5838;
		this.anInt5838 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "()V")
	@Override
	public void method7202() {
		this.method5268(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(Lclient!tu;I)V")
	public void method5294(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt5798 < 0 || arg0 != this.anInterface17Array1[this.anInt5798]) {
			throw new RuntimeException();
		}
		this.anInterface17Array1[this.anInt5798--] = null;
		arg0.method2247();
		if (this.anInt5798 >= 0) {
			this.anInterface17_1 = this.anInterface17Array1[this.anInt5798];
			this.anInterface17_1.method2251();
		} else {
			this.anInterface17_1 = null;
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(IB)I")
	public int method5295(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IFFFF)V")
	public void method5296(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static374.aFloatArray58[0] = arg1;
		Static374.aFloatArray58[1] = arg3;
		Static374.aFloatArray58[3] = arg0;
		Static374.aFloatArray58[2] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static374.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt5633 - local12 - arg1, arg2, 1, 32993, this.anInt5806, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(IIIII)V")
	@Override
	public void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5284();
		this.method5225(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "(B)V")
	private void method5297() {
		@Pc(15) int local15;
		if (this.aBoolean435) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt5814;
		} else {
			this.aFloat129 = (float) (this.anInt5821 - this.bf) - this.aFloat110;
			this.aFloat124 = this.aFloat129 - (float) this.anInt5812 * this.aFloat125;
			if (this.aFloat124 < (float) this.anInt5823) {
				this.aFloat124 = this.anInt5823;
			}
			OpenGL.glFogf(2915, this.aFloat124);
			OpenGL.glFogf(2916, this.aFloat129);
			local15 = this.anInt5819;
		}
		Static374.aFloatArray58[1] = (float) (local15 & 0xFF00) / 65280.0F;
		Static374.aFloatArray58[2] = (float) (local15 & 0xFF) / 255.0F;
		Static374.aFloatArray58[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static374.aFloatArray58, 0);
		if (this.aBoolean435) {
			this.aClass268_1.aClass83_Sub2_1.method2304();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ro;Lclient!ro;BLclient!ro;Lclient!ro;)V")
	public void method5298(@OriginalArg(0) Class258 arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(3) Class258 arg2, @OriginalArg(4) Class258 arg3) {
		if (arg2 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5224(arg2.anInterface15_6);
			OpenGL.glVertexPointer(arg2.aByte86, arg2.aShort100, this.anInterface15_4.method3793(), this.anInterface15_4.method3791() + (long) arg2.aByte85);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5224(arg3.anInterface15_6);
			OpenGL.glNormalPointer(arg3.aShort100, this.anInterface15_4.method3793(), this.anInterface15_4.method3791() + (long) arg3.aByte85);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5224(arg1.anInterface15_6);
			OpenGL.glColorPointer(arg1.aByte86, arg1.aShort100, this.anInterface15_4.method3793(), this.anInterface15_4.method3791() + (long) arg1.aByte85);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5224(arg0.anInterface15_6);
			OpenGL.glTexCoordPointer(arg0.aByte86, arg0.aShort100, this.anInterface15_4.method3793(), this.anInterface15_4.method3791() + (long) arg0.aByte85);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[BZ)Lclient!qo;")
	public Interface15 method5299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		return (Interface15) (this.aBoolean439 && (!arg3 || this.aBoolean445) ? new Class125_Sub1(this, arg1, arg2, arg0, arg3) : new Class138_Sub1(this, arg1, arg2, arg0));
	}

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "(II)I")
	public int method5300(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7178(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method7164();
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5822 = arg0;
		this.anInt5805 = arg3;
		this.anInt5811 = arg1;
		this.anInt5834 = arg2;
		this.method5237();
		this.method5272();
		if (this.anInt5825 == 3) {
			this.method5256();
		} else if (this.anInt5825 == 2) {
			this.method5239();
			return;
		}
	}

	@OriginalMember(owner = "client!mh", name = "A", descriptor = "(I)V")
	private void method5301() {
		if (this.aBoolean444 && !this.aBoolean423) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public Class104 method7156(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class104_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!mh", name = "B", descriptor = "(I)V")
	private void method5302() {
		Static374.aFloatArray58[2] = this.aFloat116 * this.aFloat114;
		Static374.aFloatArray58[3] = 1.0F;
		Static374.aFloatArray58[1] = this.aFloat112 * this.aFloat114;
		Static374.aFloatArray58[0] = this.aFloat128 * this.aFloat114;
		OpenGL.glLightfv(16384, 4609, Static374.aFloatArray58, 0);
		Static374.aFloatArray58[0] = -this.aFloat117 * this.aFloat128;
		Static374.aFloatArray58[3] = 1.0F;
		Static374.aFloatArray58[2] = this.aFloat116 * -this.aFloat117;
		Static374.aFloatArray58[1] = -this.aFloat117 * this.aFloat112;
		OpenGL.glLightfv(16385, 4609, Static374.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "(I)V")
	private void method5303() {
		if (this.aBoolean434) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean434 = false;
		}
	}

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "()Z")
	@Override
	public boolean method7171() {
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIF)Lclient!cba;")
	@Override
	public Class1_Sub5 method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub5_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([BIIZI)Lclient!wj;")
	public Interface20 method5304(@OriginalArg(0) byte[] arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		return (Interface20) (this.aBoolean439 && (!arg1 || this.aBoolean445) ? new Class125_Sub2(this, 5123, arg0, arg2, arg1) : new Class138_Sub2(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "()Z")
	@Override
	public boolean method7195() {
		return true;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
	@Override
	public void method7160(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mh", name = "D", descriptor = "(I)V")
	private void method5305() {
		if (this.anInt5825 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt5651 > 0 && this.anInt5633 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt5651, (double) this.anInt5633, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt5825 = 1;
		this.anInt5807 &= 0xFFFFFFE7;
	}
}
