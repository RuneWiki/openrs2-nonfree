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

@OriginalClass("client!kw")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!kw", name = "D", descriptor = "I")
	public int anInt5457;

	@OriginalMember(owner = "client!kw", name = "Yb", descriptor = "I")
	public int anInt5529;

	@OriginalMember(owner = "client!kw", name = "Ed", descriptor = "I")
	private int anInt5608;

	@OriginalMember(owner = "client!kw", name = "pe", descriptor = "I")
	private int anInt5640;

	@OriginalMember(owner = "client!kw", name = "Ee", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!kw", name = "Fe", descriptor = "I")
	public int anInt5646;

	@OriginalMember(owner = "client!kw", name = "He", descriptor = "Lclient!mf;")
	private Class24_Sub2 aClass24_Sub2_1;

	@OriginalMember(owner = "client!kw", name = "Me", descriptor = "Lclient!vaa;")
	private Interface27 anInterface27_1;

	@OriginalMember(owner = "client!kw", name = "Oe", descriptor = "Lclient!tg;")
	private Class320 aClass320_4;

	@OriginalMember(owner = "client!kw", name = "Pe", descriptor = "Lclient!vaa;")
	private Interface27 anInterface27_2;

	@OriginalMember(owner = "client!kw", name = "Re", descriptor = "I")
	public int anInt5650;

	@OriginalMember(owner = "client!kw", name = "Te", descriptor = "I")
	private int anInt5651;

	@OriginalMember(owner = "client!kw", name = "Ue", descriptor = "I")
	public int anInt5652;

	@OriginalMember(owner = "client!kw", name = "bf", descriptor = "Z")
	private boolean bf;

	@OriginalMember(owner = "client!kw", name = "cf", descriptor = "I")
	private int anInt5653;

	@OriginalMember(owner = "client!kw", name = "df", descriptor = "Z")
	private boolean aBoolean371;

	@OriginalMember(owner = "client!kw", name = "ff", descriptor = "I")
	private int anInt5654;

	@OriginalMember(owner = "client!kw", name = "gf", descriptor = "Z")
	private boolean aBoolean372;

	@OriginalMember(owner = "client!kw", name = "hf", descriptor = "Z")
	private boolean aBoolean373;

	@OriginalMember(owner = "client!kw", name = "jf", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!kw", name = "kf", descriptor = "I")
	private int anInt5655;

	@OriginalMember(owner = "client!kw", name = "qf", descriptor = "Z")
	public boolean aBoolean375;

	@OriginalMember(owner = "client!kw", name = "sf", descriptor = "Lclient!am;")
	public Class17_Sub1 aClass17_Sub1_1;

	@OriginalMember(owner = "client!kw", name = "uf", descriptor = "Z")
	private boolean aBoolean376;

	@OriginalMember(owner = "client!kw", name = "vf", descriptor = "Z")
	private boolean aBoolean377;

	@OriginalMember(owner = "client!kw", name = "xf", descriptor = "Ljava/lang/String;")
	private String aString60;

	@OriginalMember(owner = "client!kw", name = "Bf", descriptor = "Lclient!jaa;")
	public Class164 aClass164_11;

	@OriginalMember(owner = "client!kw", name = "Cf", descriptor = "Z")
	public boolean aBoolean379;

	@OriginalMember(owner = "client!kw", name = "Df", descriptor = "Lclient!am;")
	public Class17_Sub1 aClass17_Sub1_2;

	@OriginalMember(owner = "client!kw", name = "Ef", descriptor = "Lclient!ol;")
	public Class76_Sub3 aClass76_Sub3_2;

	@OriginalMember(owner = "client!kw", name = "Lf", descriptor = "Z")
	public boolean aBoolean382;

	@OriginalMember(owner = "client!kw", name = "Mf", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!kw", name = "Nf", descriptor = "[Lclient!ou;")
	private Class76[] aClass76Array1;

	@OriginalMember(owner = "client!kw", name = "Of", descriptor = "Ljava/lang/String;")
	private String aString61;

	@OriginalMember(owner = "client!kw", name = "Sf", descriptor = "F")
	public float aFloat115;

	@OriginalMember(owner = "client!kw", name = "Tf", descriptor = "Lclient!am;")
	public Class17_Sub1 aClass17_Sub1_3;

	@OriginalMember(owner = "client!kw", name = "Uf", descriptor = "Lclient!am;")
	public Class17_Sub1 aClass17_Sub1_4;

	@OriginalMember(owner = "client!kw", name = "Wf", descriptor = "Lclient!tia;")
	private Class205_Sub1 aClass205_Sub1_1;

	@OriginalMember(owner = "client!kw", name = "ag", descriptor = "F")
	public float aFloat116;

	@OriginalMember(owner = "client!kw", name = "bg", descriptor = "Z")
	private boolean aBoolean386;

	@OriginalMember(owner = "client!kw", name = "cg", descriptor = "Z")
	public boolean aBoolean387;

	@OriginalMember(owner = "client!kw", name = "eg", descriptor = "Lclient!lca;")
	private Interface14 anInterface14_5;

	@OriginalMember(owner = "client!kw", name = "fg", descriptor = "Z")
	public boolean aBoolean388;

	@OriginalMember(owner = "client!kw", name = "hg", descriptor = "Z")
	public boolean aBoolean389;

	@OriginalMember(owner = "client!kw", name = "kg", descriptor = "I")
	public int anInt5668;

	@OriginalMember(owner = "client!kw", name = "lg", descriptor = "Lclient!am;")
	public Class17_Sub1 aClass17_Sub1_5;

	@OriginalMember(owner = "client!kw", name = "mg", descriptor = "I")
	private int anInt5669;

	@OriginalMember(owner = "client!kw", name = "ng", descriptor = "I")
	private int anInt5670;

	@OriginalMember(owner = "client!kw", name = "pg", descriptor = "I")
	private int anInt5672;

	@OriginalMember(owner = "client!kw", name = "qg", descriptor = "Lclient!tg;")
	public Class320 aClass320_5;

	@OriginalMember(owner = "client!kw", name = "rg", descriptor = "I")
	private int anInt5673;

	@OriginalMember(owner = "client!kw", name = "sg", descriptor = "F")
	public float aFloat118;

	@OriginalMember(owner = "client!kw", name = "ug", descriptor = "I")
	public int anInt5675;

	@OriginalMember(owner = "client!kw", name = "vg", descriptor = "Lclient!am;")
	public Class17_Sub1 aClass17_Sub1_6;

	@OriginalMember(owner = "client!kw", name = "xg", descriptor = "Z")
	private boolean aBoolean390;

	@OriginalMember(owner = "client!kw", name = "zg", descriptor = "I")
	private int anInt5677;

	@OriginalMember(owner = "client!kw", name = "Ag", descriptor = "F")
	public float aFloat119;

	@OriginalMember(owner = "client!kw", name = "Dg", descriptor = "Z")
	private boolean aBoolean392;

	@OriginalMember(owner = "client!kw", name = "Fg", descriptor = "Z")
	public boolean aBoolean393;

	@OriginalMember(owner = "client!kw", name = "Hg", descriptor = "Lclient!lo;")
	private Interface15 anInterface15_4;

	@OriginalMember(owner = "client!kw", name = "Jg", descriptor = "F")
	private float aFloat121;

	@OriginalMember(owner = "client!kw", name = "Kg", descriptor = "I")
	private int anInt5681;

	@OriginalMember(owner = "client!kw", name = "Lg", descriptor = "F")
	private float aFloat122;

	@OriginalMember(owner = "client!kw", name = "Mg", descriptor = "I")
	private int anInt5682;

	@OriginalMember(owner = "client!kw", name = "Ng", descriptor = "I")
	public int anInt5683;

	@OriginalMember(owner = "client!kw", name = "Pg", descriptor = "Lclient!am;")
	public Class17_Sub1 aClass17_Sub1_7;

	@OriginalMember(owner = "client!kw", name = "Tg", descriptor = "Lclient!am;")
	public Class17_Sub1 aClass17_Sub1_8;

	@OriginalMember(owner = "client!kw", name = "Ug", descriptor = "F")
	private float aFloat124;

	@OriginalMember(owner = "client!kw", name = "ah", descriptor = "Lclient!lca;")
	private Interface14 anInterface14_6;

	@OriginalMember(owner = "client!kw", name = "bh", descriptor = "I")
	private int anInt5687;

	@OriginalMember(owner = "client!kw", name = "ch", descriptor = "Lclient!jaa;")
	public Class164 aClass164_12;

	@OriginalMember(owner = "client!kw", name = "dh", descriptor = "Z")
	public boolean aBoolean396;

	@OriginalMember(owner = "client!kw", name = "eh", descriptor = "Z")
	private boolean aBoolean397;

	@OriginalMember(owner = "client!kw", name = "fh", descriptor = "I")
	public int anInt5688;

	@OriginalMember(owner = "client!kw", name = "gh", descriptor = "Lclient!am;")
	public Class17_Sub1 aClass17_Sub1_9;

	@OriginalMember(owner = "client!kw", name = "hh", descriptor = "Lclient!of;")
	private Class76_Sub3_Sub1 aClass76_Sub3_Sub1_1;

	@OriginalMember(owner = "client!kw", name = "jh", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!kw", name = "lh", descriptor = "Lclient!am;")
	public Class17_Sub1 aClass17_Sub1_10;

	@OriginalMember(owner = "client!kw", name = "rh", descriptor = "Z")
	public boolean aBoolean399;

	@OriginalMember(owner = "client!kw", name = "sh", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!kw", name = "th", descriptor = "I")
	private int anInt5690;

	@OriginalMember(owner = "client!kw", name = "xh", descriptor = "I")
	private int anInt5691;

	@OriginalMember(owner = "client!kw", name = "Zd", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "client!kw", name = "xe", descriptor = "I")
	public int anInt5643 = 128;

	@OriginalMember(owner = "client!kw", name = "se", descriptor = "Lclient!ida;")
	private final Class151 aClass151_1 = new Class151();

	@OriginalMember(owner = "client!kw", name = "ye", descriptor = "Lclient!ot;")
	private final Class39_Sub2 aClass39_Sub2_1 = new Class39_Sub2();

	@OriginalMember(owner = "client!kw", name = "ze", descriptor = "Lclient!ot;")
	public final Class39_Sub2 aClass39_Sub2_2 = new Class39_Sub2();

	@OriginalMember(owner = "client!kw", name = "De", descriptor = "I")
	public int anInt5645 = 8;

	@OriginalMember(owner = "client!kw", name = "Ce", descriptor = "I")
	public int anInt5644 = 3;

	@OriginalMember(owner = "client!kw", name = "Be", descriptor = "Z")
	private boolean aBoolean370 = false;

	@OriginalMember(owner = "client!kw", name = "Ae", descriptor = "Lclient!mr;")
	private final Class223 aClass223_25 = new Class223();

	@OriginalMember(owner = "client!kw", name = "Le", descriptor = "[Lclient!vaa;")
	private final Interface27[] anInterface27Array3 = new Interface27[4];

	@OriginalMember(owner = "client!kw", name = "Ke", descriptor = "[Lclient!vaa;")
	private final Interface27[] anInterface27Array2 = new Interface27[4];

	@OriginalMember(owner = "client!kw", name = "Ie", descriptor = "I")
	private int anInt5647 = -1;

	@OriginalMember(owner = "client!kw", name = "Je", descriptor = "[Lclient!vaa;")
	private final Interface27[] anInterface27Array1 = new Interface27[4];

	@OriginalMember(owner = "client!kw", name = "Qe", descriptor = "I")
	private int anInt5649 = -1;

	@OriginalMember(owner = "client!kw", name = "Ne", descriptor = "I")
	private int anInt5648 = -1;

	@OriginalMember(owner = "client!kw", name = "Se", descriptor = "Lclient!mr;")
	private final Class223 aClass223_26;

	@OriginalMember(owner = "client!kw", name = "Ve", descriptor = "Lclient!mr;")
	private final Class223 aClass223_27;

	@OriginalMember(owner = "client!kw", name = "We", descriptor = "Lclient!mr;")
	private final Class223 aClass223_28;

	@OriginalMember(owner = "client!kw", name = "Xe", descriptor = "Lclient!mr;")
	private final Class223 aClass223_29;

	@OriginalMember(owner = "client!kw", name = "Ye", descriptor = "Lclient!mr;")
	private final Class223 aClass223_30;

	@OriginalMember(owner = "client!kw", name = "Ze", descriptor = "Lclient!mr;")
	private final Class223 aClass223_31;

	@OriginalMember(owner = "client!kw", name = "af", descriptor = "Lclient!mr;")
	private final Class223 aClass223_32;

	@OriginalMember(owner = "client!kw", name = "ef", descriptor = "Lclient!ot;")
	public final Class39_Sub2 aClass39_Sub2_3;

	@OriginalMember(owner = "client!kw", name = "lf", descriptor = "Lclient!ot;")
	public final Class39_Sub2 aClass39_Sub2_4;

	@OriginalMember(owner = "client!kw", name = "mf", descriptor = "Lclient!ot;")
	public final Class39_Sub2 aClass39_Sub2_5;

	@OriginalMember(owner = "client!kw", name = "wf", descriptor = "F")
	private float aFloat111;

	@OriginalMember(owner = "client!kw", name = "Xf", descriptor = "I")
	public int anInt5664;

	@OriginalMember(owner = "client!kw", name = "pf", descriptor = "I")
	private int anInt5657;

	@OriginalMember(owner = "client!kw", name = "Gf", descriptor = "Z")
	private boolean aBoolean380;

	@OriginalMember(owner = "client!kw", name = "Kf", descriptor = "F")
	public float aFloat114;

	@OriginalMember(owner = "client!kw", name = "tf", descriptor = "F")
	private float aFloat110;

	@OriginalMember(owner = "client!kw", name = "ig", descriptor = "F")
	public float aFloat117;

	@OriginalMember(owner = "client!kw", name = "jg", descriptor = "I")
	private int anInt5667;

	@OriginalMember(owner = "client!kw", name = "Ff", descriptor = "F")
	private float aFloat113;

	@OriginalMember(owner = "client!kw", name = "Zf", descriptor = "[F")
	private final float[] aFloatArray35;

	@OriginalMember(owner = "client!kw", name = "Pf", descriptor = "I")
	private int anInt5662;

	@OriginalMember(owner = "client!kw", name = "Eg", descriptor = "I")
	public int anInt5680;

	@OriginalMember(owner = "client!kw", name = "og", descriptor = "I")
	private int anInt5671;

	@OriginalMember(owner = "client!kw", name = "of", descriptor = "I")
	private int anInt5656;

	@OriginalMember(owner = "client!kw", name = "Ig", descriptor = "[F")
	private final float[] aFloatArray36;

	@OriginalMember(owner = "client!kw", name = "rf", descriptor = "I")
	private int anInt5658;

	@OriginalMember(owner = "client!kw", name = "tg", descriptor = "I")
	private int anInt5674;

	@OriginalMember(owner = "client!kw", name = "Gg", descriptor = "F")
	public float aFloat120;

	@OriginalMember(owner = "client!kw", name = "Og", descriptor = "I")
	public int anInt5684;

	@OriginalMember(owner = "client!kw", name = "Qg", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!kw", name = "yf", descriptor = "I")
	public int anInt5659;

	@OriginalMember(owner = "client!kw", name = "Bg", descriptor = "I")
	public int anInt5678;

	@OriginalMember(owner = "client!kw", name = "Af", descriptor = "F")
	public float aFloat112;

	@OriginalMember(owner = "client!kw", name = "Jf", descriptor = "I")
	public int anInt5661;

	@OriginalMember(owner = "client!kw", name = "Sg", descriptor = "I")
	private int anInt5685;

	@OriginalMember(owner = "client!kw", name = "Cg", descriptor = "I")
	public int anInt5679;

	@OriginalMember(owner = "client!kw", name = "Vg", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!kw", name = "Yg", descriptor = "F")
	private float aFloat126;

	@OriginalMember(owner = "client!kw", name = "dg", descriptor = "[Lclient!wh;")
	private final Class3_Sub16[] aClass3_Sub16Array5;

	@OriginalMember(owner = "client!kw", name = "gg", descriptor = "I")
	private int anInt5666;

	@OriginalMember(owner = "client!kw", name = "kh", descriptor = "F")
	private float aFloat128;

	@OriginalMember(owner = "client!kw", name = "wg", descriptor = "I")
	public int anInt5676;

	@OriginalMember(owner = "client!kw", name = "Vf", descriptor = "I")
	private int anInt5663;

	@OriginalMember(owner = "client!kw", name = "ph", descriptor = "[F")
	private final float[] aFloatArray39;

	@OriginalMember(owner = "client!kw", name = "Yf", descriptor = "I")
	public int anInt5665;

	@OriginalMember(owner = "client!kw", name = "oh", descriptor = "[F")
	public final float[] aFloatArray38;

	@OriginalMember(owner = "client!kw", name = "mh", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!kw", name = "Xg", descriptor = "I")
	public int anInt5686;

	@OriginalMember(owner = "client!kw", name = "Zg", descriptor = "Z")
	private boolean aBoolean395;

	@OriginalMember(owner = "client!kw", name = "ih", descriptor = "[F")
	private final float[] aFloatArray37;

	@OriginalMember(owner = "client!kw", name = "nh", descriptor = "I")
	public int anInt5689;

	@OriginalMember(owner = "client!kw", name = "Wg", descriptor = "Lclient!ag;")
	public Class3_Sub3_Sub1 aClass3_Sub3_Sub1_3;

	@OriginalMember(owner = "client!kw", name = "wh", descriptor = "[B")
	public final byte[] aByteArray60;

	@OriginalMember(owner = "client!kw", name = "uh", descriptor = "[I")
	public int[] anIntArray299;

	@OriginalMember(owner = "client!kw", name = "vh", descriptor = "[I")
	public int[] anIntArray300;

	@OriginalMember(owner = "client!kw", name = "yh", descriptor = "[I")
	public int[] anIntArray301;

	@OriginalMember(owner = "client!kw", name = "ve", descriptor = "I")
	public final int anInt5642;

	@OriginalMember(owner = "client!kw", name = "Ic", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas7;

	@OriginalMember(owner = "client!kw", name = "yc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!kw", name = "lc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!kw", name = "ic", descriptor = "J")
	private final long aLong176;

	@OriginalMember(owner = "client!kw", name = "lb", descriptor = "J")
	private long lb;

	@OriginalMember(owner = "client!kw", name = "If", descriptor = "I")
	public final int anInt5660;

	@OriginalMember(owner = "client!kw", name = "qh", descriptor = "Z")
	public boolean aBoolean398;

	@OriginalMember(owner = "client!kw", name = "yg", descriptor = "Z")
	public boolean aBoolean391;

	@OriginalMember(owner = "client!kw", name = "Rf", descriptor = "Z")
	private boolean aBoolean385;

	@OriginalMember(owner = "client!kw", name = "Qf", descriptor = "Z")
	public boolean aBoolean384;

	@OriginalMember(owner = "client!kw", name = "Hf", descriptor = "Z")
	public boolean aBoolean381;

	@OriginalMember(owner = "client!kw", name = "zf", descriptor = "Z")
	private boolean aBoolean378;

	@OriginalMember(owner = "client!kw", name = "nf", descriptor = "Z")
	public boolean aBoolean374;

	@OriginalMember(owner = "client!kw", name = "Rg", descriptor = "Z")
	private final boolean aBoolean394;

	@OriginalMember(owner = "client!kw", name = "te", descriptor = "Lclient!bv;")
	private final Class41 aClass41_1;

	@OriginalMember(owner = "client!kw", name = "Ge", descriptor = "Lclient!tp;")
	public final Class326 aClass326_1;

	@OriginalMember(owner = "client!kw", name = "re", descriptor = "Lclient!bc;")
	private final Class26 aClass26_1;

	@OriginalMember(owner = "client!kw", name = "we", descriptor = "Lclient!sf;")
	private Class3_Sub20_Sub1 aClass3_Sub20_Sub1_1;

	@OriginalMember(owner = "client!kw", name = "ue", descriptor = "Lclient!jga;")
	private final Class171 aClass171_1;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class5_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class15();
		new Class280(16);
		this.aClass223_26 = new Class223();
		this.aClass223_27 = new Class223();
		this.aClass223_28 = new Class223();
		this.aClass223_29 = new Class223();
		this.aClass223_30 = new Class223();
		this.aClass223_31 = new Class223();
		this.aClass223_32 = new Class223();
		this.aClass39_Sub2_3 = new Class39_Sub2();
		this.aClass39_Sub2_4 = new Class39_Sub2();
		this.aClass39_Sub2_5 = new Class39_Sub2();
		this.aFloat111 = 0.0F;
		this.anInt5664 = 512;
		this.anInt5657 = 0;
		this.aBoolean380 = false;
		this.aFloat114 = 1.0F;
		this.aFloat110 = 1.0F;
		this.aFloat117 = 3584.0F;
		this.anInt5667 = 0;
		this.aFloat113 = -1.0F;
		this.aFloatArray35 = new float[4];
		this.anInt5662 = 8448;
		this.anInt5680 = -1;
		this.anInt5671 = 0;
		this.anInt5656 = -1;
		this.aFloatArray36 = new float[4];
		this.anInt5658 = 0;
		this.anInt5674 = 0;
		this.aFloat120 = 1.0F;
		this.anInt5684 = 0;
		this.aFloat123 = 3584.0F;
		this.anInt5659 = 0;
		this.anInt5678 = 0;
		this.aFloat112 = -1.0F;
		this.anInt5661 = -1;
		this.anInt5685 = 3584;
		this.anInt5679 = -1;
		this.aFloat125 = 1.0F;
		this.aFloat126 = -1.0F;
		this.aClass3_Sub16Array5 = new Class3_Sub16[Static412.anInt7523];
		this.anInt5666 = 8448;
		this.aFloat128 = 1.0F;
		this.anInt5676 = 512;
		this.anInt5663 = 0;
		this.aFloatArray39 = new float[4];
		this.anInt5665 = 50;
		this.aFloatArray38 = new float[4];
		this.aFloat129 = -1.0F;
		this.anInt5686 = -1;
		this.aBoolean395 = true;
		this.aFloatArray37 = new float[16];
		this.anInt5689 = 0;
		this.aClass3_Sub3_Sub1_3 = new Class3_Sub3_Sub1(8192);
		this.aByteArray60 = new byte[16384];
		this.anIntArray299 = new int[1];
		this.anIntArray300 = new int[1];
		this.anIntArray301 = new int[1];
		this.anInt5642 = arg2;
		this.aCanvas6 = this.aCanvas7 = arg0;
		if (!Static522.method7730("jaclib")) {
			throw new RuntimeException("");
		} else if (Static522.method7730("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.lb = this.aLong176 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt5642);
				if (this.aLong176 == 0L) {
					throw new RuntimeException("");
				}
				this.method4950();
				@Pc(335) int local335 = this.method4989();
				if (local335 != 0) {
					throw new RuntimeException("");
				}
				this.anInt5660 = this.aBoolean387 ? 33639 : 5121;
				if (this.aString60.indexOf("radeon") != -1) {
					@Pc(361) int local361 = 0;
					@Pc(363) boolean local363 = false;
					@Pc(365) boolean local365 = false;
					@Pc(374) String[] local374 = Static33.method1210(' ', this.aString60.replace('/', ' '));
					for (@Pc(376) int local376 = 0; local376 < local374.length; local376++) {
						@Pc(382) String local382 = local374[local376];
						try {
							if (local382.length() > 0) {
								if (local382.charAt(0) == 'x' && local382.length() >= 3 && Static93.method2083(local382.substring(1, 3))) {
									local382 = local382.substring(1);
									local365 = true;
								}
								if (local382.equals("hd")) {
									local363 = true;
								} else {
									if (local382.startsWith("hd")) {
										local382 = local382.substring(2);
										local363 = true;
									}
									if (local382.length() >= 4 && Static93.method2083(local382.substring(0, 4))) {
										local361 = Static134.method2553(local382.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(447) Exception local447) {
						}
					}
					if (!local363 || local361 < 4000) {
						this.aBoolean398 = false;
					}
					if (!local365 && !local363) {
						if (local361 >= 7000 && local361 <= 9250) {
							this.aBoolean391 = false;
						}
						if (local361 >= 7000 && local361 <= 7999) {
							this.aBoolean385 = false;
						}
					}
					this.aBoolean384 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean381 = true;
					this.aBoolean378 = this.aBoolean385;
				}
				if (this.aString61.indexOf("intel") != -1) {
					this.aBoolean374 = false;
				}
				this.aBoolean394 = !this.aString61.equals("s3 graphics");
				if (this.aBoolean385) {
					try {
						@Pc(534) int[] local534 = new int[1];
						OpenGL.glGenBuffersARB(1, local534, 0);
					} catch (@Pc(540) Throwable local540) {
						throw new RuntimeException("");
					}
				}
				Static335.method5470(false, true);
				this.aBoolean370 = true;
				this.aClass41_1 = new Class41(this, super.anInterface7_15);
				this.method4986();
				this.aClass326_1 = new Class326(this);
				this.aClass26_1 = new Class26(this);
				if (this.aClass26_1.method1209()) {
					this.aClass3_Sub20_Sub1_1 = new Class3_Sub20_Sub1(this);
					if (!this.aClass3_Sub20_Sub1_1.method7684()) {
						this.aClass3_Sub20_Sub1_1.method7677();
						this.aClass3_Sub20_Sub1_1 = null;
					}
				}
				this.aClass171_1 = new Class171(this);
				this.method4955();
				this.method4962();
				this.method7567();
			} catch (@Pc(614) Throwable local614) {
				local614.printStackTrace();
				this.method7493();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)V")
	@Override
	public void method7510(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub5 method7495(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub5_Sub2 local8 = new Class3_Sub5_Sub2(arg0);
		this.aClass223_25.method5868(local8);
		return local8;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIZ)Lclient!td;")
	@Override
	public Class24 method7545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class24_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)V")
	private void method4950() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL1.b()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static258.method4293(1000L);
		}
	}

	@OriginalMember(owner = "client!kw", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt5652 + this.anInt5650 + this.anInt5651;
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(II)V")
	@Override
	public void method7514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7544(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static574.aFloat203 = arg2;
		Static5.aFloat84 = arg1;
		Static623.aFloat211 = arg0;
	}

	@OriginalMember(owner = "client!kw", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.aClass39_Sub2_3.aFloat176 + this.aClass39_Sub2_3.aFloat171 * (float) arg1 + (float) arg0 * this.aClass39_Sub2_3.aFloat172 + this.aClass39_Sub2_3.aFloat174;
		if ((float) this.anInt5665 > local28 || (float) this.anInt5685 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt5676 * ((float) arg2 * this.aClass39_Sub2_3.aFloat173 + this.aClass39_Sub2_3.aFloat167 * (float) arg0 + (float) arg1 * this.aClass39_Sub2_3.aFloat168 + this.aClass39_Sub2_3.aFloat175) / local28);
		@Pc(117) int local117 = (int) ((this.aClass39_Sub2_3.aFloat178 + (float) arg2 * this.aClass39_Sub2_3.aFloat170 + (float) arg0 * this.aClass39_Sub2_3.aFloat169 + (float) arg1 * this.aClass39_Sub2_3.aFloat177) * (float) this.anInt5664 / local28);
		if ((float) local85 >= this.aFloat127 && this.aFloat130 >= (float) local85 && this.aFloat116 <= (float) local117 && (float) local117 <= this.aFloat115) {
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat116);
			arg3[0] = (int) ((float) local85 - this.aFloat127);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(JZ)V")
	public synchronized void method4951(@OriginalArg(0) long arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong276 = arg0;
		this.aClass223_32.method5868(local7);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7520(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas7) {
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

	@OriginalMember(owner = "client!kw", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt5667;
		arg0[1] = this.anInt5674;
		arg0[0] = this.anInt5663;
		arg0[3] = this.anInt5658;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIII)Lclient!ss;")
	@Override
	public Class205 method7486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean382 ? new Class205_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!ot;B)V")
	public void method4952(@OriginalArg(0) Class39_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method6554(), 0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7523(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aNativeHeap4 = ((Class3_Sub5_Sub2) arg0).aNativeHeap6;
		if (this.anInterface14_6 != null) {
			return;
		}
		@Pc(16) Class3_Sub3_Sub1 local16 = new Class3_Sub3_Sub1(80);
		if (this.aBoolean387) {
			local16.method834(-1.0F);
			local16.method834(-1.0F);
			local16.method834(0.0F);
			local16.method834(0.0F);
			local16.method834(1.0F);
			local16.method834(1.0F);
			local16.method834(-1.0F);
			local16.method834(0.0F);
			local16.method834(1.0F);
			local16.method834(1.0F);
			local16.method834(1.0F);
			local16.method834(1.0F);
			local16.method834(0.0F);
			local16.method834(1.0F);
			local16.method834(0.0F);
			local16.method834(-1.0F);
			local16.method834(1.0F);
			local16.method834(0.0F);
			local16.method834(0.0F);
			local16.method834(0.0F);
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
		this.anInterface14_6 = this.method5011(false, local16.anInt4736, local16.aByteArray54, 20);
		this.aClass164_12 = new Class164(this.anInterface14_6, 5126, 3, 0);
		this.aClass164_11 = new Class164(this.anInterface14_6, 5126, 2, 12);
		this.aClass151_1.method3911(this);
	}

	@OriginalMember(owner = "client!kw", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt5658 = this.anInt5457;
		this.anInt5667 = this.anInt5529;
		this.anInt5663 = 0;
		this.anInt5674 = 0;
		OpenGL.glDisable(3089);
		this.method4984();
	}

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "(II)V")
	public void method4953(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4982(7681, 7681);
		} else if (arg0 == 0) {
			this.method4982(8448, 8448);
		} else if (arg0 == 2) {
			this.method4982(7681, 34165);
		} else if (arg0 == 3) {
			this.method4982(8448, 260);
		} else if (arg0 == 4) {
			this.method4982(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "()Z")
	@Override
	public boolean method7518() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5663 < arg0) {
			this.anInt5663 = arg0;
		}
		if (arg1 > this.anInt5674) {
			this.anInt5674 = arg1;
		}
		if (arg2 < this.anInt5667) {
			this.anInt5667 = arg2;
		}
		if (arg3 < this.anInt5658) {
			this.anInt5658 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method4984();
		this.method5010();
	}

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "(I)V")
	private void method4954() {
		OpenGL.glDepthMask(this.aBoolean372 && this.aBoolean395);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
	private void method4955() {
		this.method5009(-2);
		for (@Pc(16) int local16 = this.anInt5668 - 1; local16 >= 0; local16--) {
			this.method5004(local16);
			this.method4997(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method4982(8448, 8448);
		this.method5000(34168, 770, 2);
		this.method4987();
		this.anInt5654 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt5655 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean373 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean371 = true;
		this.method5023(true);
		this.method4975(true);
		this.method5013(true);
		this.method4993(true);
		this.method4970();
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
		@Pc(136) float[] local136 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(138) int local138 = 0; local138 < 8; local138++) {
			@Pc(145) int local145 = local138 + 16384;
			OpenGL.glLightfv(local145, 4608, local136, 0);
			OpenGL.glLightf(local145, 4615, 0.0F);
			OpenGL.glLightf(local145, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt5656 = this.anInt5661 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "(II)V")
	public void method4956(@OriginalArg(0) int arg0) {
		Static380.aFloatArray57[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static380.aFloatArray57[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static380.aFloatArray57[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static380.aFloatArray57[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static380.aFloatArray57, 0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IFFF)V")
	private void method4957(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean390) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean390 = true;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([IIIIIZ)Lclient!td;")
	@Override
	public Class24 method7563(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class24_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLclient!lo;)V")
	public void method4958(@OriginalArg(1) Interface15 arg0) {
		if (arg0 != this.anInterface15_4) {
			if (this.aBoolean385) {
				OpenGL.glBindBufferARB(34963, arg0.method8707());
			}
			this.anInterface15_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!up;Lclient!rga;)Lclient!dv;")
	@Override
	public Interface8 method7512(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) Interface18 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7537(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "(II)V")
	public synchronized void method4959(@OriginalArg(0) int arg0) {
		@Pc(13) Class3 local13 = new Class3();
		local13.aLong276 = arg0;
		this.aClass223_31.method5868(local13);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZ)V")
	public void method4960(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean392) {
			this.aBoolean392 = arg0;
			this.method5003();
		}
	}

	@OriginalMember(owner = "client!kw", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4993(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)V")
	public void method4961() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!kw", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5002();
		this.method4971(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kw", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5659 = arg0;
		this.anInt5689 = arg1;
		this.anInt5676 = arg2;
		this.anInt5664 = arg3;
		this.method5017();
		this.method4984();
		if (this.anInt5669 == 3) {
			this.method5014();
		} else if (this.anInt5669 == 2) {
			this.method4981();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!eea;)V")
	@Override
	public void method7538(@OriginalArg(0) Class85 arg0) {
		this.aClass151_1.method3913(this, -1, arg0);
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "()Z")
	@Override
	public boolean method7499() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7533() {
		this.method5002();
		this.method4971(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "()Z")
	@Override
	public boolean method7494() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method5002();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method4971(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean376) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean376) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!eea;I)V")
	@Override
	public void method7551(@OriginalArg(0) Class85 arg0, @OriginalArg(1) int arg1) {
		this.aClass151_1.method3913(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!kw", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt5529 < arg2) {
			arg2 = this.anInt5529;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt5457 < arg3) {
			arg3 = this.anInt5457;
		}
		this.anInt5667 = arg2;
		this.anInt5674 = arg1;
		this.anInt5663 = arg0;
		this.anInt5658 = arg3;
		OpenGL.glEnable(3089);
		this.method4984();
		this.method5010();
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(Z)V")
	private void method4962() {
		if (this.aCanvas6 == null) {
			this.anInt5608 = this.anInt5640 = 0;
		} else {
			@Pc(20) Dimension local20 = this.aCanvas6.getSize();
			this.anInt5608 = local20.width;
			this.anInt5640 = local20.height;
		}
		if (this.anInterface27_1 == null) {
			this.anInt5457 = this.anInt5640;
			this.anInt5529 = this.anInt5608;
			this.method5024();
		}
		this.method4970();
		this.la();
	}

	@OriginalMember(owner = "client!kw", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Class76_Sub3_Sub1 local9 = local6.aClass76_Sub3_Sub1_4;
		this.method5005();
		this.method4997(local6.aClass76_Sub3_Sub1_4);
		this.method4971(1);
		this.method4982(8448, 7681);
		this.method5000(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat162 / (float) local9.anInt7375;
		@Pc(46) float local46 = local9.aFloat163 / (float) local9.anInt7373;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5663 - arg2), local46 * (float) (this.anInt5674 - arg3));
		OpenGL.glVertex2i(this.anInt5663, this.anInt5674);
		OpenGL.glTexCoord2f((float) (this.anInt5663 - arg2) * local39, (float) (this.anInt5658 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5663, this.anInt5658);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5667 - arg2), (float) (this.anInt5658 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5667, this.anInt5658);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5667 - arg2), (float) (this.anInt5674 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5667, this.anInt5674);
		OpenGL.glEnd();
		this.method5000(5890, 768, 0);
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(B)V")
	public void method4963() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!vaa;I)V")
	public void method4964(@OriginalArg(0) Interface27 arg0) {
		if (this.anInt5648 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5648 >= 0) {
			this.anInterface27Array3[this.anInt5648].method7955();
		}
		this.anInterface27_1 = this.anInterface27Array3[++this.anInt5648] = arg0;
		this.anInterface27_1.method7954();
	}

	@OriginalMember(owner = "client!kw", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass39_Sub2_3.aFloat176 * (float) arg2 + (float) arg0 * this.aClass39_Sub2_3.aFloat172 + this.aClass39_Sub2_3.aFloat171 * (float) arg1 + this.aClass39_Sub2_3.aFloat174;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass39_Sub2_3.aFloat174 + (float) arg4 * this.aClass39_Sub2_3.aFloat171 + this.aClass39_Sub2_3.aFloat172 * (float) arg3 + this.aClass39_Sub2_3.aFloat176 * (float) arg5;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt5665 && local63 < (float) this.anInt5665) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt5685 && (float) this.anInt5685 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass39_Sub2_3.aFloat167 * (float) arg0 + (float) arg1 * this.aClass39_Sub2_3.aFloat168 + (float) arg2 * this.aClass39_Sub2_3.aFloat173 + this.aClass39_Sub2_3.aFloat175) * (float) this.anInt5676 / local32);
		@Pc(167) int local167 = (int) (((float) arg5 * this.aClass39_Sub2_3.aFloat173 + this.aClass39_Sub2_3.aFloat168 * (float) arg4 + (float) arg3 * this.aClass39_Sub2_3.aFloat167 + this.aClass39_Sub2_3.aFloat175) * (float) this.anInt5676 / local63);
		if ((float) local135 < this.aFloat127 && this.aFloat127 > (float) local167) {
			local7 |= 0x1;
		} else if (this.aFloat130 < (float) local135 && (float) local167 > this.aFloat130) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) (((float) arg0 * this.aClass39_Sub2_3.aFloat169 + (float) arg1 * this.aClass39_Sub2_3.aFloat177 + this.aClass39_Sub2_3.aFloat170 * (float) arg2 + this.aClass39_Sub2_3.aFloat178) * (float) this.anInt5664 / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt5664 * (this.aClass39_Sub2_3.aFloat177 * (float) arg4 + this.aClass39_Sub2_3.aFloat169 * (float) arg3 + this.aClass39_Sub2_3.aFloat170 * (float) arg5 + this.aClass39_Sub2_3.aFloat178) / local63);
		if (this.aFloat116 > (float) local233 && (float) local265 < this.aFloat116) {
			local7 |= 0x4;
		} else if (this.aFloat115 < (float) local233 && this.aFloat115 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(III)V")
	public synchronized void method4965(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3_Sub19 local17 = new Class3_Sub19(arg0);
		local17.aLong276 = arg1;
		this.aClass223_28.method5868(local17);
	}

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "(I)V")
	public void method4966() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray38, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIZ)Lclient!td;")
	@Override
	public Class24 method7524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class24_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!jaa;Lclient!jaa;Lclient!jaa;Lclient!jaa;I)V")
	public void method4967(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) Class164 arg2, @OriginalArg(3) Class164 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5016(arg0.anInterface14_4);
			OpenGL.glVertexPointer(arg0.aByte64, arg0.aShort61, this.anInterface14_5.method3806(), this.anInterface14_5.method3808() + (long) arg0.aByte65);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5016(arg3.anInterface14_4);
			OpenGL.glNormalPointer(arg3.aShort61, this.anInterface14_5.method3806(), this.anInterface14_5.method3808() + (long) arg3.aByte65);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5016(arg1.anInterface14_4);
			OpenGL.glColorPointer(arg1.aByte64, arg1.aShort61, this.anInterface14_5.method3806(), this.anInterface14_5.method3808() + (long) arg1.aByte65);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5016(arg2.anInterface14_4);
			OpenGL.glTexCoordPointer(arg2.aByte64, arg2.aShort61, this.anInterface14_5.method3806(), this.anInterface14_5.method3808() + (long) arg2.aByte65);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!lo;III)V")
	public void method4968(@OriginalArg(1) Interface15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0.method8706();
		@Pc(14) int local14 = arg1 * this.method4992(local7);
		this.method4958(arg0);
		OpenGL.glDrawElements(4, arg2, local7, (long) local14 + arg0.method8704());
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(IIII)V")
	public void method4969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(15) Class1_Sub2 local15 = (Class1_Sub2) arg5;
		@Pc(18) Class76_Sub3_Sub1 local18 = local15.aClass76_Sub3_Sub1_4;
		this.method5005();
		this.method4997(local15.aClass76_Sub3_Sub1_4);
		this.method4971(1);
		this.method4982(8448, 7681);
		this.method5000(34167, 768, 0);
		@Pc(48) float local48 = local18.aFloat162 / (float) local18.anInt7375;
		@Pc(55) float local55 = local18.aFloat163 / (float) local18.anInt7373;
		@Pc(61) float local61 = (float) arg2 - (float) arg0;
		@Pc(67) float local67 = (float) arg3 - (float) arg1;
		@Pc(80) float local80 = (float) (1.0D / Math.sqrt((double) (local67 * local67 + local61 * local61)));
		@Pc(84) float local84 = local61 * local80;
		@Pc(90) int local90 = arg10 % (arg8 + arg9);
		@Pc(94) float local94 = local67 * local80;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(114) float local114 = local84 * (float) arg8;
		@Pc(119) float local119 = local94 * (float) arg8;
		@Pc(121) float local121 = 0.0F;
		@Pc(123) float local123 = 0.0F;
		@Pc(125) float local125 = local114;
		@Pc(127) float local127 = local119;
		if (arg8 >= local90) {
			local127 = (float) (arg8 - local90) * local94;
			local125 = (float) (arg8 - local90) * local84;
		} else {
			local123 = local94 * (float) (arg9 + arg8 - local90);
			local121 = local84 * (float) (arg9 + arg8 - local90);
		}
		@Pc(177) float local177 = local121 + (float) arg0 + 0.35F;
		@Pc(184) float local184 = local123 + (float) arg1 + 0.35F;
		@Pc(189) float local189 = local84 * (float) arg9;
		@Pc(194) float local194 = (float) arg9 * local94;
		while (true) {
			if (arg0 < arg2) {
				if (local177 > (float) arg2 + 0.35F) {
					break;
				}
				if (local125 + local177 > (float) arg2) {
					local125 = (float) arg2 - local177;
				}
			} else {
				if ((float) arg2 + 0.35F > local177) {
					break;
				}
				if ((float) arg2 > local177 + local125) {
					local125 = (float) arg2 - local177;
				}
			}
			if (arg3 > arg1) {
				if (local184 > (float) arg3 + 0.35F) {
					break;
				}
				if (local127 + local184 > (float) arg3) {
					local127 = (float) arg3 - local184;
				}
			} else {
				if ((float) arg3 + 0.35F > local184) {
					break;
				}
				if ((float) arg3 > local184 + local127) {
					local127 = (float) arg3 - local184;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f((local177 - (float) arg6) * local48, local55 * (local184 - (float) arg7));
			OpenGL.glVertex2f(local177, local184);
			OpenGL.glTexCoord2f((local177 + local125 - (float) arg6) * local48, (local127 + local184 - (float) arg7) * local55);
			OpenGL.glVertex2f(local177 + local125, local184 + local127);
			local184 += local194 + local127;
			OpenGL.glEnd();
			local177 += local189 + local125;
			local125 = local114;
			local127 = local119;
		}
		this.method5000(5890, 768, 0);
	}

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "(I)V")
	public void method4970() {
		if (this.anInt5669 != 0) {
			this.anInt5669 = 0;
			this.anInt5653 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "(II)V")
	public void method4971(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt5654) {
			return;
		}
		@Pc(20) boolean local20;
		@Pc(24) byte local24;
		if (arg0 == 1) {
			local20 = true;
			local24 = 1;
		} else if (arg0 == 2) {
			local24 = 2;
			local20 = false;
		} else if (arg0 == 128) {
			local20 = true;
			local24 = 3;
		} else {
			local20 = false;
			local24 = 0;
		}
		if (!this.aBoolean371) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean371 = true;
		}
		if (this.aBoolean373 != local20) {
			if (local20) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean373 = local20;
		}
		if (this.anInt5655 != local24) {
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
			this.anInt5655 = local24;
		}
		this.anInt5653 &= 0xFFFFFFE3;
		this.anInt5654 = arg0;
	}

	@OriginalMember(owner = "client!kw", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt5659, this.anInt5689, this.anInt5676, this.anInt5664 };
	}

	@OriginalMember(owner = "client!kw", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(37) float local37;
		@Pc(41) float local41;
		if (this.aClass76_Sub3_Sub1_1 == null || arg2 > this.aClass76_Sub3_Sub1_1.anInt7370 || arg3 > this.aClass76_Sub3_Sub1_1.anInt7369) {
			this.aClass76_Sub3_Sub1_1 = Static485.method7223(this, arg2, arg6, arg3);
			this.aClass76_Sub3_Sub1_1.method6412(false, false);
			local37 = this.aClass76_Sub3_Sub1_1.aFloat163;
			local41 = this.aClass76_Sub3_Sub1_1.aFloat162;
		} else {
			this.aClass76_Sub3_Sub1_1.method6408(arg6, arg2, 6406, arg3, false);
			local41 = (float) arg2 * this.aClass76_Sub3_Sub1_1.aFloat162 / (float) this.aClass76_Sub3_Sub1_1.anInt7370;
			local37 = this.aClass76_Sub3_Sub1_1.aFloat163 * (float) arg3 / (float) this.aClass76_Sub3_Sub1_1.anInt7369;
		}
		this.method5005();
		this.method4997(this.aClass76_Sub3_Sub1_1);
		this.method4971(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4956(arg5);
		this.method4982(34165, 34165);
		this.method5000(34166, 768, 0);
		this.method5000(5890, 770, 2);
		this.method4969(34166, 0);
		this.method4969(5890, 2);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = local143 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(158) float local158 = local146 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local143, local158);
		OpenGL.glTexCoord2f(local37, local41);
		OpenGL.glVertex2f(local151, local158);
		OpenGL.glTexCoord2f(local37, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method5000(5890, 768, 0);
		this.method5000(34166, 770, 2);
		this.method4969(5890, 0);
		this.method4969(34166, 2);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZIIZ[B)Lclient!lo;")
	public Interface15 method4972(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface15) (this.aBoolean385 && (!arg1 || this.aBoolean378) ? new Class149_Sub2(this, 5123, arg2, arg0, arg1) : new Class19_Sub2(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(II)I")
	@Override
	public int method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IFFFF)V")
	public void method4973(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static380.aFloatArray57[0] = arg2;
		Static380.aFloatArray57[2] = arg1;
		Static380.aFloatArray57[1] = arg0;
		Static380.aFloatArray57[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static380.aFloatArray57, 0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!dv;)V")
	@Override
	public void method7527(@OriginalArg(0) Interface8 arg0) {
	}

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "(I)V")
	private void method4974() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt5681; local7++) {
			@Pc(14) Class3_Sub16 local14 = this.aClass3_Sub16Array5[local7];
			Static287.aFloatArray34[0] = local14.method4778();
			@Pc(25) int local25 = local7 + 16386;
			Static287.aFloatArray34[1] = local14.method4777();
			Static287.aFloatArray34[2] = local14.method4783();
			Static287.aFloatArray34[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static287.aFloatArray34, 0);
			@Pc(54) int local54 = local14.method4776();
			@Pc(60) float local60 = local14.method4785() / 255.0F;
			Static287.aFloatArray34[0] = local60 * (float) (local54 >> 16 & 0xFF);
			Static287.aFloatArray34[2] = (float) (local54 & 0xFF) * local60;
			Static287.aFloatArray34[1] = (float) (local54 >> 8 & 0xFF) * local60;
			OpenGL.glLightfv(local25, 4609, Static287.aFloatArray34, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method4781() * local14.method4781()));
			OpenGL.glEnable(local25);
		}
		while (this.anInt5670 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt5670 = this.anInt5681;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZB)V")
	public void method4975(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean383) {
			this.aBoolean383 = arg0;
			this.method5003();
			this.anInt5653 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kw", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt5690;
		this.anInt5690 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "()V")
	@Override
	public void method7507() {
	}

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "(I)V")
	private void method4976() {
		this.anOpenGL1.a();
	}

	@OriginalMember(owner = "client!kw", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt5457 - arg1 - local12, arg2, 1, 32993, this.anInt5660, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "()Z")
	@Override
	public boolean method7516() {
		return this.aClass3_Sub20_Sub1_1 != null && this.aClass3_Sub20_Sub1_1.method7676();
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(IIZ)V")
	public synchronized void method4978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class3_Sub19 local20 = new Class3_Sub19(arg1);
		local20.aLong276 = arg0;
		this.aClass223_30.method5868(local20);
	}

	@OriginalMember(owner = "client!kw", name = "z", descriptor = "()Z")
	@Override
	public boolean method7568() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method5002();
		this.method4971(1);
		@Pc(34) float local34 = (float) -arg0 + (float) arg2;
		@Pc(41) float local41 = (float) -arg1 + (float) arg3;
		@Pc(54) float local54 = (float) (1.0D / Math.sqrt((double) (local34 * local34 + local41 * local41)));
		@Pc(58) float local58 = local34 * local54;
		@Pc(62) float local62 = local41 * local54;
		@Pc(69) int local69 = arg7 % (arg6 + arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(89) float local89 = (float) arg5 * local58;
		@Pc(94) float local94 = local62 * (float) arg5;
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.0F;
		@Pc(100) float local100 = local89;
		@Pc(102) float local102 = local94;
		if (local69 <= arg5) {
			local100 = local58 * (float) (arg5 - local69);
			local102 = (float) (arg5 - local69) * local62;
		} else {
			local98 = local62 * (float) (arg5 + arg6 - local69);
			local96 = (float) (arg5 + arg6 - local69) * local58;
		}
		@Pc(155) float local155 = (float) arg0 + local96 + 0.35F;
		@Pc(162) float local162 = local98 + (float) arg1 + 0.35F;
		@Pc(167) float local167 = local58 * (float) arg6;
		@Pc(172) float local172 = local62 * (float) arg6;
		while (true) {
			if (arg2 > arg0) {
				if ((float) arg2 + 0.35F < local155) {
					break;
				}
				if (local100 + local155 > (float) arg2) {
					local100 = (float) arg2 - local155;
				}
			} else {
				if (local155 < (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 > local155 + local100) {
					local100 = (float) arg2 - local155;
				}
			}
			if (arg1 >= arg3) {
				if (local162 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local102 + local162) {
					local102 = (float) arg3 - local162;
				}
			} else {
				if ((float) arg3 + 0.35F < local162) {
					break;
				}
				if ((float) arg3 < local102 + local162) {
					local102 = (float) arg3 - local162;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local155, local162);
			OpenGL.glVertex2f(local155 + local100, local162 + local102);
			local155 += local100 + local167;
			OpenGL.glEnd();
			local162 += local172 + local102;
			local100 = local89;
			local102 = local94;
		}
	}

	@OriginalMember(owner = "client!kw", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt5663 > arg2 + arg0 || this.anInt5667 < arg0 - arg2 || arg1 + arg2 < this.anInt5674 || arg1 - arg2 > this.anInt5658) {
			return;
		}
		this.method5002();
		this.method4971(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(72) float local72 = (float) arg0 + 0.35F;
		@Pc(77) float local77 = (float) arg1 + 0.35F;
		@Pc(81) int local81 = arg2 << 1;
		if ((float) local81 < this.aFloat126) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local72 + 1.0F, local77 + 1.0F);
			OpenGL.glVertex2f(local72 + 1.0F, -1.0F + local77);
			OpenGL.glVertex2f(local72 - 1.0F, -1.0F + local77);
			OpenGL.glVertex2f(local72 - 1.0F, local77 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat113 >= (float) local81) {
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
			local150 = Static274.method4478(local150);
			OpenGL.glVertex2f((float) arg2 + local72, local77);
			for (@Pc(176) int local176 = 16384 - local150; local176 > 0; local176 -= local150) {
				OpenGL.glVertex2f(local72 + Class216.aFloatArray56[local176] * (float) arg2, local77 + Class216.aFloatArray55[local176] * (float) arg2);
			}
			OpenGL.glVertex2f(local72 + (float) arg2, local77);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(B)V")
	private void method4979() {
		if (this.anInt5669 != 2) {
			this.anInt5669 = 2;
			this.method4981();
			this.method5031();
			this.anInt5653 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BLclient!vaa;)V")
	public void method4980(@OriginalArg(1) Interface27 arg0) {
		if (this.anInt5648 < 0 || this.anInterface27Array3[this.anInt5648] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface27Array3[this.anInt5648--] = null;
		arg0.method7955();
		if (this.anInt5648 < 0) {
			this.anInterface27_1 = null;
		} else {
			this.anInterface27_1 = this.anInterface27Array3[this.anInt5648];
			this.anInterface27_1.method7954();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!fu;IIII)Lclient!ka;")
	@Override
	public Class17 method7490(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class17_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "()Z")
	@Override
	public boolean method7543() {
		return this.aClass3_Sub20_Sub1_1 != null && (this.anInt5642 <= 1 || this.aBoolean397);
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
	@Override
	public void method7502(@OriginalArg(0) int arg0) {
		this.method4950();
	}

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "(I)V")
	private void method4981() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray37, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(III)V")
	public void method4982(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5672 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(26) boolean local26 = false;
		if (this.anInt5662 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local26 = true;
			this.anInt5662 = arg1;
		}
		if (arg0 != this.anInt5666) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local26 = true;
			this.anInt5666 = arg0;
		}
		if (local26) {
			this.anInt5653 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "(I)Lclient!dm;")
	public Class76_Sub1 method4983() {
		return this.aClass205_Sub1_1 == null ? null : this.aClass205_Sub1_1.method6466();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIF)Lclient!wh;")
	@Override
	public Class3_Sub16 method7550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub16_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kw", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt5685;
	}

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "()Z")
	@Override
	public boolean method7529() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "(I)V")
	private void method4984() {
		this.aFloat127 = this.anInt5663 - this.anInt5659;
		this.aFloat116 = this.anInt5674 - this.anInt5689;
		this.aFloat115 = this.anInt5658 - this.anInt5689;
		this.aFloat130 = this.anInt5667 - this.anInt5659;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Z)V")
	@Override
	public void method7491(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "(II)I")
	public int method4985(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7539(@OriginalArg(0) Canvas arg0) {
		this.aCanvas6 = null;
		this.lb = 0L;
		if (arg0 == null || this.aCanvas7 == arg0) {
			this.lb = this.aLong176;
			this.aCanvas6 = this.aCanvas7;
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable3.get(arg0);
			this.lb = local26;
			this.aCanvas6 = arg0;
		}
		if (this.aCanvas6 == null || this.lb == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.lb);
		this.method4962();
	}

	@OriginalMember(owner = "client!kw", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt5661 && arg1 == this.anInt5686 && this.anInt5684 == arg2) {
			return;
		}
		this.anInt5684 = arg2;
		this.anInt5686 = arg1;
		this.anInt5661 = arg0;
		this.method4991();
		this.method4998();
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(Z)V")
	private void method4986() {
		this.aClass76Array1 = new Class76[this.anInt5668];
		this.aClass76_Sub3_2 = new Class76_Sub3(this, 3553, 6408, 1, 1);
		new Class76_Sub3(this, 3553, 6408, 1, 1);
		new Class76_Sub3(this, 3553, 6408, 1, 1);
		this.aClass17_Sub1_1 = new Class17_Sub1(this);
		this.aClass17_Sub1_3 = new Class17_Sub1(this);
		this.aClass17_Sub1_7 = new Class17_Sub1(this);
		this.aClass17_Sub1_5 = new Class17_Sub1(this);
		this.aClass17_Sub1_6 = new Class17_Sub1(this);
		this.aClass17_Sub1_8 = new Class17_Sub1(this);
		this.aClass17_Sub1_10 = new Class17_Sub1(this);
		this.aClass17_Sub1_4 = new Class17_Sub1(this);
		this.aClass17_Sub1_9 = new Class17_Sub1(this);
		this.aClass17_Sub1_2 = new Class17_Sub1(this);
		if (this.aBoolean374) {
			this.aClass320_5 = new Class320(this);
			new Class320(this);
		}
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "(Z)V")
	private void method4987() {
		if (this.aBoolean390) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean390 = false;
		}
	}

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "(I)V")
	private void method4988() {
		if (this.anInt5669 != 3) {
			this.anInt5669 = 3;
			this.method5014();
			this.method5031();
			this.anInt5653 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "(B)I")
	private int method4989() {
		@Pc(11) int local11 = 0;
		this.aString61 = OpenGL.glGetString(7936).toLowerCase();
		this.aString60 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString61.indexOf("microsoft") != -1) {
			local11 = 1;
		}
		if (this.aString61.indexOf("brian paul") != -1 || this.aString61.indexOf("mesa") != -1) {
			local11 |= 0x1;
		}
		@Pc(51) String local51 = OpenGL.glGetString(7938);
		@Pc(59) String[] local59 = Static33.method1210(' ', local51.replace('.', ' '));
		if (local59.length < 2) {
			local11 |= 0x4;
		} else {
			try {
				@Pc(75) int local75 = Static134.method2553(local59[0]);
				@Pc(81) int local81 = Static134.method2553(local59[1]);
				this.anInt5687 = local81 + local75 * 10;
			} catch (@Pc(90) NumberFormatException local90) {
				local11 |= 0x4;
			}
		}
		if (this.anInt5687 < 12) {
			local11 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local11 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local11 |= 0x20;
		}
		@Pc(124) int[] local124 = new int[1];
		OpenGL.glGetIntegerv(34018, local124, 0);
		this.anInt5668 = local124[0];
		OpenGL.glGetIntegerv(34929, local124, 0);
		this.anInt5677 = local124[0];
		OpenGL.glGetIntegerv(34930, local124, 0);
		this.anInt5682 = local124[0];
		if (this.anInt5668 < 2 || this.anInt5677 < 2 || this.anInt5682 < 2) {
			local11 |= 0x10;
		}
		this.aBoolean387 = Stream.a();
		this.aBoolean386 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean385 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean376 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean375 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean396 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean389 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean391 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean384 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean382 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean398 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean379 = false;
		this.aBoolean374 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean388 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean393 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean397 = this.aBoolean388 & this.aBoolean393;
		OpenGL.glGetFloatv(2834, Static380.aFloatArray57, 0);
		this.aFloat113 = Static380.aFloatArray57[1];
		this.aFloat126 = Static380.aFloatArray57[0];
		return local11 == 0 ? 0 : local11;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BZI)V")
	public void method4990(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		this.method5006(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "(Z)V")
	private void method4991() {
		this.aFloat124 = (float) (this.anInt5685 - this.anInt5684) - this.aFloat111;
		this.aFloat119 = this.aFloat124 - (float) this.anInt5686 * this.aFloat128;
		if ((float) this.anInt5665 > this.aFloat119) {
			this.aFloat119 = this.anInt5665;
		}
		OpenGL.glFogf(2915, this.aFloat119);
		OpenGL.glFogf(2916, this.aFloat124);
		Static380.aFloatArray57[2] = (float) (this.anInt5661 & 0xFF) / 255.0F;
		Static380.aFloatArray57[0] = (float) (this.anInt5661 & 0xFF0000) / 1.671168E7F;
		Static380.aFloatArray57[1] = (float) (this.anInt5661 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static380.aFloatArray57, 0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)I")
	public int method4992(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZI)V")
	public void method4993(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean372) {
			this.aBoolean372 = arg0;
			this.method4954();
			this.anInt5653 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "()V")
	@Override
	public void method7489() {
		this.aClass26_1.method1211();
	}

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "(B)V")
	private void method4994() {
		this.aFloatArray37[10] = this.aFloat121;
		this.aFloatArray37[14] = this.aFloat122;
		this.aFloat117 = this.anInt5685;
		this.aFloat123 = ((float) -this.anInt5685 + this.aFloatArray37[14]) / this.aFloatArray37[10];
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(IIII)V")
	public void method4995(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([I)V")
	@Override
	public void method7530(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5529;
		arg0[1] = this.anInt5457;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Lclient!rga;")
	@Override
	public Interface18 method7488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7565(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7514(arg2, arg3);
	}

	@OriginalMember(owner = "client!kw", name = "A", descriptor = "()Lclient!fc;")
	@Override
	public Class103 method7569() {
		@Pc(7) int local7 = -1;
		if (this.aString61.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString61.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString61.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class103(local7, "OpenGL", this.anInt5687, this.aString60, 0L);
	}

	@OriginalMember(owner = "client!kw", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean395 = arg0;
		this.method4954();
	}

	@OriginalMember(owner = "client!kw", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean399) {
			throw new RuntimeException("");
		}
		this.anInt5680 = arg1;
		this.anInt5679 = arg2;
		this.anInt5678 = arg3;
		this.anInt5683 = arg0;
		if (this.aBoolean380) {
			this.aClass171_1.aClass127_Sub6_1.method5745();
			this.aClass171_1.aClass127_Sub6_1.method5746();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BFF)V")
	public void method4996(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat111 = arg0;
		this.aFloat128 = arg1;
		this.method4991();
	}

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt5665;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!ss;Lclient!ss;FLclient!ss;)Lclient!ss;")
	@Override
	public Class205 method7564(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class205 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean382 && this.aBoolean374) {
			@Pc(15) Class205_Sub1_Sub1 local15 = null;
			@Pc(18) Class205_Sub1 local18 = (Class205_Sub1) arg0;
			@Pc(21) Class205_Sub1 local21 = (Class205_Sub1) arg1;
			@Pc(25) Class76_Sub1 local25 = local18.method6466();
			@Pc(29) Class76_Sub1 local29 = local21.method6466();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local25.anInt2308 <= local29.anInt2308 ? local29.anInt2308 : local25.anInt2308;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class205_Sub1_Sub1) {
					@Pc(56) Class205_Sub1_Sub1 local56 = (Class205_Sub1_Sub1) arg3;
					if (local56.method5260() == local44) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class205_Sub1_Sub1(this, local44);
				}
				if (local15.method5261(local25, local29, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!kw", name = "u", descriptor = "()Lclient!sk;")
	@Override
	public Class39 method7552() {
		return new Class39_Sub2();
	}

	@OriginalMember(owner = "client!kw", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass39_Sub2_3.aFloat174 + (float) arg2 * this.aClass39_Sub2_3.aFloat176 + this.aClass39_Sub2_3.aFloat171 * (float) arg1 + this.aClass39_Sub2_3.aFloat172 * (float) arg0;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt5676 * (this.aClass39_Sub2_3.aFloat175 + this.aClass39_Sub2_3.aFloat173 * (float) arg2 + this.aClass39_Sub2_3.aFloat167 * (float) arg0 + this.aClass39_Sub2_3.aFloat168 * (float) arg1) / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat127);
		@Pc(118) int local118 = (int) ((this.aClass39_Sub2_3.aFloat178 + (float) arg0 * this.aClass39_Sub2_3.aFloat169 + (float) arg1 * this.aClass39_Sub2_3.aFloat177 + this.aClass39_Sub2_3.aFloat170 * (float) arg2) * (float) this.anInt5664 / local28);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local118 - this.aFloat116);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!ou;)V")
	public void method4997(@OriginalArg(1) Class76 arg0) {
		@Pc(11) Class76 local11 = this.aClass76Array1[this.anInt5672];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt9197);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt9197);
				} else if (local11.anInt9197 != arg0.anInt9197) {
					OpenGL.glDisable(local11.anInt9197);
					OpenGL.glEnable(arg0.anInt9197);
				}
				OpenGL.glBindTexture(arg0.anInt9197, arg0.method7931());
			}
			this.aClass76Array1[this.anInt5672] = arg0;
		}
		this.anInt5653 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "(I)V")
	private void method4998() {
		if (this.aBoolean377 && this.anInt5686 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "()Lclient!sk;")
	@Override
	public Class39 method7503() {
		return this.aClass39_Sub2_3;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7547(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas7) {
			throw new RuntimeException();
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable3.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!kw", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt5644 = 0;
		while (arg0 > 1) {
			this.anInt5644++;
			arg0 >>= 0x1;
		}
		this.anInt5645 = 0x1 << this.anInt5644;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)I")
	@Override
	public int method7501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I[Lclient!wh;)V")
	@Override
	public void method7521(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub16[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub16Array5[local7] = arg1[local7];
		}
		this.anInt5681 = arg0;
		if (this.anInt5669 != 1) {
			this.method4974();
		}
	}

	@OriginalMember(owner = "client!kw", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt5656;
		if (local15 || this.aFloat129 != arg1 || arg2 != this.aFloat112) {
			this.aFloat129 = arg1;
			this.anInt5656 = arg0;
			this.aFloat112 = arg2;
			if (local15) {
				this.aFloat125 = (float) (this.anInt5656 & 0xFF0000) / 1.671168E7F;
				this.aFloat114 = (float) (this.anInt5656 & 0xFF00) / 65280.0F;
				this.aFloat120 = (float) (this.anInt5656 & 0xFF) / 255.0F;
				this.method5018();
			}
			this.method5027();
		}
		if (arg3 == this.aFloatArray35[0] && arg4 == this.aFloatArray35[1] && this.aFloatArray35[2] == arg5) {
			return;
		}
		this.aFloatArray35[2] = arg5;
		this.aFloatArray35[1] = arg4;
		this.aFloatArray35[0] = arg3;
		this.aFloatArray39[2] = -arg5;
		this.aFloatArray39[1] = -arg4;
		this.aFloatArray39[0] = -arg3;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray38[1] = local142 * arg4;
		this.aFloatArray38[2] = arg5 * local142;
		this.aFloatArray38[0] = local142 * arg3;
		this.aFloatArray36[2] = -this.aFloatArray38[2];
		this.aFloatArray36[1] = -this.aFloatArray38[1];
		this.aFloatArray36[0] = -this.aFloatArray38[0];
		this.method4966();
		this.anInt5675 = (int) (arg3 * 256.0F / arg4);
		this.anInt5688 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(III)V")
	public synchronized void method4999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub19 local15 = new Class3_Sub19(arg0);
		local15.aLong276 = arg1;
		this.aClass223_27.method5868(local15);
	}

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "()Z")
	@Override
	public boolean method7559() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5683 = arg0;
		this.anInt5678 = arg3;
		this.anInt5679 = arg2;
		this.anInt5680 = arg1;
		this.aBoolean399 = true;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!qt;[Lclient!ffa;Z)Lclient!da;")
	@Override
	public Class62 method7515(@OriginalArg(0) Class282 arg0, @OriginalArg(1) Class107[] arg1) {
		return new Class62_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(IIII)V")
	public void method5000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "()Lclient!sk;")
	@Override
	public Class39 method7546() {
		return this.aClass39_Sub2_1;
	}

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "(I)V")
	@Override
	public void method7556(@OriginalArg(0) int arg0) {
		this.method4976();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method7504(@OriginalArg(0) Class39 arg0) {
		this.aClass39_Sub2_3.method7236(arg0);
		this.aClass39_Sub2_4.method7236(this.aClass39_Sub2_3);
		this.aClass39_Sub2_4.method6547();
		this.aClass39_Sub2_5.method6553(this.aClass39_Sub2_4);
		if (this.anInt5669 != 1) {
			this.method5031();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZBILclient!jaclib/memory/Buffer;)Lclient!lca;")
	public Interface14 method5001(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Buffer arg2) {
		return (Interface14) (this.aBoolean385 ? new Class149_Sub1(this, arg0, arg2, arg1, false) : new Class19_Sub1(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static426.method6665(arg3, this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!kw", name = "u", descriptor = "(I)V")
	private void method5002() {
		if (this.anInt5653 == 1) {
			return;
		}
		this.method5015();
		this.method5023(false);
		this.method4975(false);
		this.method5013(false);
		this.method4993(false);
		this.method4997(null);
		this.method5009(-2);
		this.method4953(1);
		this.anInt5653 = 1;
	}

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "(Z)V")
	private void method5003() {
		if (this.aBoolean383 && !this.aBoolean392) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(Z)V")
	@Override
	public void method7492(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "(II)V")
	public void method5004(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt5672) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt5672 = arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "(I)V")
	public void method5005() {
		if (this.anInt5653 == 2) {
			return;
		}
		this.method5015();
		this.method5023(false);
		this.method4975(false);
		this.method5013(false);
		this.method4993(false);
		this.method5009(-2);
		this.anInt5653 = 2;
	}

	@OriginalMember(owner = "client!kw", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5002();
		this.method4971(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass26_1.method1202(arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "(I)V")
	@Override
	public void method7561(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt5643 = arg0;
		this.aClass41_1.method1576();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZZI)V")
	public void method5006(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 != this.anInt5673 || this.aBoolean380 != this.aBoolean399) {
			@Pc(22) Class76_Sub3 local22 = null;
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = this.aBoolean399 ? 3 : 0;
			if (arg2 < 0) {
				this.method4987();
			} else {
				local22 = this.aClass41_1.method1577(arg2);
				@Pc(52) Class195 local52 = super.anInterface7_15.method8118(arg2);
				if (local52.aByte80 == 0 && local52.aByte81 == 0) {
					this.method4987();
				} else {
					@Pc(65) int local65 = local52.aBoolean364 ? 64 : 128;
					@Pc(69) int local69 = local65 * 50;
					this.method4957((float) (local52.aByte81 * (this.anInt5646 % local69)) / (float) local69, 0.0F, (float) (local52.aByte80 * (this.anInt5646 % local69)) / (float) local69);
				}
				local24 = local52.anInt5428;
				if (!this.aBoolean399) {
					local35 = local52.aByte83;
					local26 = local52.aByte82;
					local28 = local52.anInt5427;
				}
			}
			this.aClass171_1.method4325(local28, arg0, local35, arg1, local26);
			if (!this.aClass171_1.method4328(local22, local24)) {
				this.method4997(local22);
				this.method4953(local24);
			}
			this.anInt5673 = arg2;
			this.aBoolean380 = this.aBoolean399;
		}
		this.anInt5653 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "()V")
	@Override
	protected void method7493() {
		for (@Pc(10) Class3 local10 = this.aClass223_25.method5874(); local10 != null; local10 = this.aClass223_25.method5870()) {
			((Class3_Sub5_Sub2) local10).method8620();
		}
		if (this.aClass26_1 != null) {
			this.aClass26_1.method1206();
		}
		if (this.anOpenGL1 != null) {
			this.method4976();
			@Pc(40) Enumeration local40 = this.aHashtable3.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable3.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean370) {
			Static556.method8016(false, true);
			this.aBoolean370 = false;
		}
	}

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "(II)V")
	public synchronized void method5007(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub19 local14 = new Class3_Sub19(arg0);
		this.aClass223_29.method5868(local14);
	}

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "()I")
	@Override
	public int method7517() {
		return 4;
	}

	@OriginalMember(owner = "client!kw", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean399 = false;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!vaa;)V")
	public void method5008(@OriginalArg(1) Interface27 arg0) {
		if (this.anInt5649 < 0 || this.anInterface27Array1[this.anInt5649] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface27Array1[this.anInt5649--] = null;
		arg0.method7956();
		if (this.anInt5649 >= 0) {
			this.anInterface27_2 = this.anInterface27Array1[this.anInt5649];
			this.anInterface27_2.method7953();
		} else {
			this.anInterface27_2 = null;
		}
	}

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "()V")
	@Override
	public void method7555() {
		if (this.aClass3_Sub20_Sub1_1 != null && this.aClass3_Sub20_Sub1_1.method7676()) {
			this.aClass26_1.method1212(this.aClass3_Sub20_Sub1_1);
			this.aClass41_1.method1576();
		}
	}

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "(II)V")
	public void method5009(@OriginalArg(0) int arg0) {
		this.method4990(true, arg0);
	}

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "(I)V")
	private void method5010() {
		if (this.anInt5667 >= this.anInt5663 && this.anInt5658 >= this.anInt5674) {
			OpenGL.glScissor(this.anInt5671 + this.anInt5663, -this.anInt5658 + this.anInt5657 - -this.anInt5457, this.anInt5667 - this.anInt5663, this.anInt5658 - this.anInt5674);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZI[BIZ)Lclient!lca;")
	public Interface14 method5011(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		return (Interface14) (this.aBoolean385 && (!arg0 || this.aBoolean378) ? new Class149_Sub1(this, arg3, arg2, arg1, arg0) : new Class19_Sub1(this, arg3, arg2, arg1));
	}

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "()V")
	@Override
	public void method7535() {
		if (this.aBoolean374) {
			if (this.aClass320_4 != this.anInterface27_1) {
				throw new RuntimeException();
			}
			this.aClass320_4.method7961(0);
			this.aClass320_4.method7961(8);
			this.method5026(this.aClass320_4);
		} else if (this.aBoolean386) {
			this.aClass24_Sub2_1.method8565(0, 0, this.anInt5529, this.anInt5457, 0, 0);
			this.anOpenGL1.setSurface(this.lb);
		} else {
			throw new RuntimeException("");
		}
		this.aClass24_Sub2_1 = null;
		this.anInt5529 = this.anInt5608;
		this.anInt5457 = this.anInt5640;
		this.method4970();
		this.method5024();
		this.la();
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method7537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5002();
		this.method4971(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(22) float local22 = (float) arg3 - (float) arg1;
		if (local16 == 0.0F && local22 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(43) float local43 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local16 * local16)));
			local16 *= local43;
			local22 *= local43;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local16 + 0.35F, (float) arg3 + 0.35F + local22);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "(I)V")
	public void method5012() {
		if (this.anInt5653 == 8) {
			return;
		}
		this.method4979();
		this.method5023(true);
		this.method5013(true);
		this.method4993(true);
		this.method4971(1);
		this.anInt5653 = 8;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BZ)V")
	public void method5013(@OriginalArg(1) boolean arg0) {
		if (this.bf == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt5653 &= 0xFFFFFFE0;
		this.bf = arg0;
	}

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "(I)V")
	private void method5014() {
		@Pc(21) float local21 = this.aFloat110 * (float) -this.anInt5659 / (float) this.anInt5676;
		@Pc(33) float local33 = (float) -this.anInt5689 * this.aFloat110 / (float) this.anInt5664;
		@Pc(48) float local48 = this.aFloat110 * (float) (this.anInt5529 - this.anInt5659) / (float) this.anInt5676;
		@Pc(62) float local62 = (float) (this.anInt5457 - this.anInt5689) * this.aFloat110 / (float) this.anInt5664;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local48 != local21 && local33 != local62) {
			OpenGL.glOrtho((double) local21, (double) local48, (double) -local62, (double) -local33, (double) this.anInt5665, (double) this.anInt5685);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "()Z")
	@Override
	public boolean method7534() {
		if (this.aClass3_Sub20_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub20_Sub1_1.method7676()) {
			if (!this.aClass26_1.method1207(this.aClass3_Sub20_Sub1_1)) {
				return false;
			}
			this.aClass41_1.method1576();
		}
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "(B)V")
	private void method5015() {
		if (this.anInt5669 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt5529 > 0 && this.anInt5457 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt5529, (double) this.anInt5457, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt5669 = 1;
		this.anInt5653 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!lca;I)V")
	public void method5016(@OriginalArg(0) Interface14 arg0) {
		if (arg0 != this.anInterface14_5) {
			if (this.aBoolean385) {
				OpenGL.glBindBufferARB(34962, arg0.method3807());
			}
			this.anInterface14_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "z", descriptor = "(I)V")
	private void method5017() {
		@Pc(6) float[] local6 = this.aFloatArray37;
		@Pc(23) float local23 = (float) (-this.anInt5659 * this.anInt5665) / (float) this.anInt5676;
		@Pc(38) float local38 = (float) ((this.anInt5529 - this.anInt5659) * this.anInt5665) / (float) this.anInt5676;
		@Pc(49) float local49 = (float) (this.anInt5665 * this.anInt5689) / (float) this.anInt5664;
		@Pc(63) float local63 = (float) (this.anInt5665 * (this.anInt5689 - this.anInt5457)) / (float) this.anInt5664;
		if (local23 == local38 || local49 == local63) {
			local6[12] = 0.0F;
			local6[10] = 1.0F;
			local6[15] = 1.0F;
			local6[0] = 1.0F;
			local6[6] = 0.0F;
			local6[2] = 0.0F;
			local6[13] = 0.0F;
			local6[11] = 0.0F;
			local6[7] = 0.0F;
			local6[5] = 1.0F;
			local6[14] = 0.0F;
			local6[4] = 0.0F;
			local6[3] = 0.0F;
			local6[1] = 0.0F;
			local6[8] = 0.0F;
			local6[9] = 0.0F;
		} else {
			@Pc(143) float local143 = (float) this.anInt5665 * 2.0F;
			local6[8] = (local38 + local23) / (-local23 + local38);
			local6[6] = 0.0F;
			local6[5] = local143 / (local49 - local63);
			local6[2] = 0.0F;
			local6[9] = (local63 + local49) / (local49 - local63);
			local6[14] = this.aFloat122 = -(local143 * (float) this.anInt5685) / (float) (this.anInt5685 - this.anInt5665);
			local6[4] = 0.0F;
			local6[15] = 0.0F;
			local6[13] = 0.0F;
			local6[11] = -1.0F;
			local6[10] = this.aFloat121 = (float) -(this.anInt5665 + this.anInt5685) / (float) (this.anInt5685 - this.anInt5665);
			local6[7] = 0.0F;
			local6[1] = 0.0F;
			local6[3] = 0.0F;
			local6[0] = local143 / (local38 - local23);
			local6[12] = 0.0F;
		}
		this.method4994();
	}

	@OriginalMember(owner = "client!kw", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method4971(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt5665 && arg1 == this.anInt5685) {
			return;
		}
		this.anInt5685 = arg1;
		this.anInt5665 = arg0;
		this.method5017();
		this.method4991();
		if (this.anInt5669 == 3) {
			this.method5014();
		} else if (this.anInt5669 == 2) {
			this.method4981();
			return;
		}
	}

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "()Z")
	@Override
	public boolean method7542() {
		return false;
	}

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "(B)V")
	private void method5018() {
		Static380.aFloatArray57[1] = this.aFloat118 * this.aFloat114;
		Static380.aFloatArray57[2] = this.aFloat118 * this.aFloat120;
		Static380.aFloatArray57[0] = this.aFloat125 * this.aFloat118;
		Static380.aFloatArray57[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static380.aFloatArray57, 0);
	}

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "(I)V")
	@Override
	public void method7526() {
	}

	@OriginalMember(owner = "client!kw", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass39_Sub2_3.aFloat174 + (float) arg2 * this.aClass39_Sub2_3.aFloat176 + this.aClass39_Sub2_3.aFloat171 * (float) arg1 + (float) arg0 * this.aClass39_Sub2_3.aFloat172;
		if (local28 < (float) this.anInt5665 || local28 > (float) this.anInt5685) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((float) this.anInt5676 * (this.aClass39_Sub2_3.aFloat175 + this.aClass39_Sub2_3.aFloat173 * (float) arg2 + this.aClass39_Sub2_3.aFloat168 * (float) arg1 + (float) arg0 * this.aClass39_Sub2_3.aFloat167) / (float) arg3);
		@Pc(119) int local119 = (int) ((float) this.anInt5664 * (this.aClass39_Sub2_3.aFloat178 + (float) arg2 * this.aClass39_Sub2_3.aFloat170 + (float) arg1 * this.aClass39_Sub2_3.aFloat177 + this.aClass39_Sub2_3.aFloat169 * (float) arg0) / (float) arg3);
		if (this.aFloat127 <= (float) local86 && (float) local86 <= this.aFloat130 && this.aFloat116 <= (float) local119 && this.aFloat115 >= (float) local119) {
			arg4[0] = (int) ((float) local86 - this.aFloat127);
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local119 - this.aFloat116);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!ss;)V")
	@Override
	public void method7498(@OriginalArg(0) Class205 arg0) {
		this.aClass205_Sub1_1 = (Class205_Sub1) arg0;
	}

	@OriginalMember(owner = "client!kw", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class51 method7505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class51_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "(B)V")
	public void method5020() {
		if (this.anInt5653 == 16) {
			return;
		}
		this.method4988();
		this.method5023(true);
		this.method5013(true);
		this.method4993(true);
		this.method4971(1);
		this.anInt5653 = 16;
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(III)V")
	public void method5021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5671 = arg0;
		this.anInt5657 = arg1;
		this.method5024();
		this.method5010();
	}

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass39_Sub2_3.aFloat174 + this.aClass39_Sub2_3.aFloat176 * (float) arg2 + (float) arg0 * this.aClass39_Sub2_3.aFloat172 + this.aClass39_Sub2_3.aFloat171 * (float) arg1;
		@Pc(55) float local55 = this.aClass39_Sub2_3.aFloat172 * (float) arg3 + this.aClass39_Sub2_3.aFloat171 * (float) arg4 + (float) arg5 * this.aClass39_Sub2_3.aFloat176 + this.aClass39_Sub2_3.aFloat174;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt5665 > local30 && (float) this.anInt5665 > local55) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt5685 && local55 > (float) this.anInt5685) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass39_Sub2_3.aFloat173 * (float) arg2 + (float) arg1 * this.aClass39_Sub2_3.aFloat168 + (float) arg0 * this.aClass39_Sub2_3.aFloat167 + this.aClass39_Sub2_3.aFloat175) * (float) this.anInt5676 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt5676 * (this.aClass39_Sub2_3.aFloat175 + (float) arg5 * this.aClass39_Sub2_3.aFloat173 + (float) arg3 * this.aClass39_Sub2_3.aFloat167 + this.aClass39_Sub2_3.aFloat168 * (float) arg4) / (float) arg6);
		if ((float) local124 < this.aFloat127 && (float) local157 < this.aFloat127) {
			local57 |= 0x1;
		} else if (this.aFloat130 < (float) local124 && (float) local157 > this.aFloat130) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) (((float) arg0 * this.aClass39_Sub2_3.aFloat169 + this.aClass39_Sub2_3.aFloat177 * (float) arg1 + (float) arg2 * this.aClass39_Sub2_3.aFloat170 + this.aClass39_Sub2_3.aFloat178) * (float) this.anInt5664 / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt5664 * ((float) arg3 * this.aClass39_Sub2_3.aFloat169 + (float) arg4 * this.aClass39_Sub2_3.aFloat177 + (float) arg5 * this.aClass39_Sub2_3.aFloat170 + this.aClass39_Sub2_3.aFloat178) / (float) arg6);
		if (this.aFloat116 > (float) local224 && (float) local257 < this.aFloat116) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat115 && this.aFloat115 < (float) local257) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IF)V")
	public void method5022(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat110) {
			this.aFloat110 = arg0;
			if (this.anInt5669 == 3) {
				this.method5014();
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method7509(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub19 local19;
		while (!this.aClass223_27.method5864()) {
			local19 = (Class3_Sub19) this.aClass223_27.method5872();
			Static268.anIntArray261[local11++] = (int) local19.aLong276;
			this.anInt5650 -= local19.anInt2696;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static268.anIntArray261, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static268.anIntArray261, 0);
			local11 = 0;
		}
		while (!this.aClass223_28.method5864()) {
			local19 = (Class3_Sub19) this.aClass223_28.method5872();
			Static268.anIntArray261[local11++] = (int) local19.aLong276;
			this.anInt5652 -= local19.anInt2696;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static268.anIntArray261, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static268.anIntArray261, 0);
			local11 = 0;
		}
		while (!this.aClass223_29.method5864()) {
			local19 = (Class3_Sub19) this.aClass223_29.method5872();
			Static268.anIntArray261[local11++] = local19.anInt2696;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static268.anIntArray261, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static268.anIntArray261, 0);
			local11 = 0;
		}
		while (!this.aClass223_30.method5864()) {
			local19 = (Class3_Sub19) this.aClass223_30.method5872();
			Static268.anIntArray261[local11++] = (int) local19.aLong276;
			this.anInt5651 -= local19.anInt2696;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static268.anIntArray261, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static268.anIntArray261, 0);
		}
		while (!this.aClass223_26.method5864()) {
			local19 = (Class3_Sub19) this.aClass223_26.method5872();
			OpenGL.glDeleteLists((int) local19.aLong276, local19.anInt2696);
		}
		@Pc(215) Class3 local215;
		while (!this.aClass223_31.method5864()) {
			local215 = this.aClass223_31.method5872();
			OpenGL.glDeleteProgramARB((int) local215.aLong276);
		}
		while (!this.aClass223_32.method5864()) {
			local215 = this.aClass223_32.method5872();
			OpenGL.glDeleteObjectARB(local215.aLong276);
		}
		while (!this.aClass223_26.method5864()) {
			local19 = (Class3_Sub19) this.aClass223_26.method5872();
			OpenGL.glDeleteLists((int) local19.aLong276, local19.anInt2696);
		}
		this.aClass41_1.method1575();
		if (this.E() > 100663296 && Static374.method6036() > this.aLong178 + 60000L) {
			System.gc();
			this.aLong178 = Static374.method6036();
		}
		this.anInt5646 = local9;
	}

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "()Z")
	@Override
	public boolean method7549() {
		return false;
	}

	@OriginalMember(owner = "client!kw", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat118) {
			this.aFloat118 = arg0;
			this.method5018();
		}
	}

	@OriginalMember(owner = "client!kw", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method5002();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method4971(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean376) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean376) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "()Z")
	@Override
	public boolean method7497() {
		return this.aClass171_1.method4326();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZZ)V")
	public void method5023(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean377) {
			this.aBoolean377 = arg0;
			this.method4998();
			this.anInt5653 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "(B)V")
	private void method5024() {
		OpenGL.glViewport(this.anInt5671, this.anInt5657, this.anInt5529, this.anInt5457);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!vaa;B)V")
	public void method5025(@OriginalArg(0) Interface27 arg0) {
		if (this.anInt5649 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5649 >= 0) {
			this.anInterface27Array1[this.anInt5649].method7956();
		}
		this.anInterface27_2 = this.anInterface27Array1[++this.anInt5649] = arg0;
		this.anInterface27_2.method7953();
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7554(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas7 == arg0) {
			local5 = this.aLong176;
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable3.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas6) {
			this.method4962();
		}
	}

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "()V")
	@Override
	public void method7560() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "()V")
	@Override
	public void method7567() {
		if (!this.aBoolean394 || this.anInt5529 <= 0 || this.anInt5457 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt5663;
		@Pc(25) int local25 = this.anInt5667;
		@Pc(28) int local28 = this.anInt5674;
		@Pc(31) int local31 = this.anInt5658;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4970();
		this.method5023(false);
		this.method4975(false);
		this.method5013(false);
		this.method4993(false);
		this.method4997(null);
		this.method5009(-2);
		this.method4953(1);
		this.method4971(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt5529, this.anInt5457, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg5;
		@Pc(9) Class76_Sub3_Sub1 local9 = local6.aClass76_Sub3_Sub1_4;
		this.method5005();
		this.method4997(local6.aClass76_Sub3_Sub1_4);
		this.method4971(1);
		this.method4982(8448, 7681);
		this.method5000(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat162 / (float) local9.anInt7375;
		@Pc(46) float local46 = local9.aFloat163 / (float) local9.anInt7373;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(58) float local58 = (float) arg3 - (float) arg1;
		@Pc(71) float local71 = (float) (1.0D / Math.sqrt((double) (local58 * local58 + local52 * local52)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(90) float local90 = local52 * local71;
		@Pc(94) float local94 = local58 * local71;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f(local90 + (float) arg2 + 0.35F, local94 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method5000(5890, 768, 0);
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(ILclient!vaa;)V")
	public void method5026(@OriginalArg(1) Interface27 arg0) {
		if (this.aBoolean388) {
			this.method5008(arg0);
			this.method4980(arg0);
		} else if (this.anInt5647 >= 0 && arg0 == this.anInterface27Array2[this.anInt5647]) {
			this.anInterface27Array2[this.anInt5647--] = null;
			arg0.method7952();
			if (this.anInt5647 >= 0) {
				this.anInterface27_2 = this.anInterface27_1 = this.anInterface27Array2[this.anInt5647];
				this.anInterface27_2.method7957();
			} else {
				this.anInterface27_2 = this.anInterface27_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kw", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt5691;
		this.anInt5691 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!kw", name = "A", descriptor = "(I)V")
	private void method5027() {
		Static380.aFloatArray57[1] = this.aFloat129 * this.aFloat114;
		Static380.aFloatArray57[0] = this.aFloat125 * this.aFloat129;
		Static380.aFloatArray57[2] = this.aFloat120 * this.aFloat129;
		Static380.aFloatArray57[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static380.aFloatArray57, 0);
		Static380.aFloatArray57[2] = -this.aFloat112 * this.aFloat120;
		Static380.aFloatArray57[0] = -this.aFloat112 * this.aFloat125;
		Static380.aFloatArray57[1] = this.aFloat114 * -this.aFloat112;
		Static380.aFloatArray57[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static380.aFloatArray57, 0);
	}

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "()Z")
	@Override
	public boolean method7532() {
		return this.aBoolean376 && (!this.method7516() || this.aBoolean397);
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(II)Lclient!up;")
	@Override
	public Interface25 method7511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(Lclient!vaa;I)V")
	public void method5028(@OriginalArg(0) Interface27 arg0) {
		if (this.aBoolean388) {
			this.method5025(arg0);
			this.method4964(arg0);
		} else if (this.anInt5647 < 3) {
			if (this.anInt5647 >= 0) {
				this.anInterface27Array2[this.anInt5647].method7952();
			}
			this.anInterface27_2 = this.anInterface27_1 = this.anInterface27Array2[++this.anInt5647] = arg0;
			this.anInterface27_2.method7957();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!ffa;Z)Lclient!td;")
	@Override
	public Class24 method7525(@OriginalArg(0) Class107 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt3008 * arg0.anInt3006];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray29 == null) {
			for (local21 = 0; local21 < arg0.anInt3008; local21++) {
				for (local25 = 0; local25 < arg0.anInt3006; local25++) {
					@Pc(38) int local38 = arg0.anIntArray143[arg0.aByteArray28[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt3008; local21++) {
				for (local25 = 0; local25 < arg0.anInt3006; local25++) {
					local12[local16++] = arg0.aByteArray29[local14] << 24 | arg0.anIntArray143[arg0.aByteArray28[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(124) Class24 local124 = this.method7536(local12, arg0.anInt3008, arg0.anInt3006, arg0.anInt3006);
		local124.method8569(arg0.anInt3005, arg0.anInt3003, arg0.anInt3007, arg0.anInt3004);
		return local124;
	}

	@OriginalMember(owner = "client!kw", name = "B", descriptor = "(I)V")
	public void method5029() {
		if (this.anInt5653 == 4) {
			return;
		}
		this.method5015();
		this.method5023(false);
		this.method4975(false);
		this.method5013(false);
		this.method4993(false);
		this.method5009(-2);
		this.method4971(1);
		this.anInt5653 = 4;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!ot;Z)V")
	public void method5030(@OriginalArg(0) Class39_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method6554(), 0);
	}

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "(B)V")
	private void method5031() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass39_Sub2_4.method6554(), 0);
		if (this.aBoolean380) {
			this.aClass171_1.aClass127_Sub6_1.method5745();
		}
		this.method4966();
		this.method4974();
	}

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "(II)I")
	public int method5032(@OriginalArg(1) int arg0) {
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
}
