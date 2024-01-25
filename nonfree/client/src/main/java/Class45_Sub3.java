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

@OriginalClass("client!vj")
public final class Class45_Sub3 extends Class45 {

	@OriginalMember(owner = "client!vj", name = "Yc", descriptor = "I")
	private int anInt8986;

	@OriginalMember(owner = "client!vj", name = "gd", descriptor = "I")
	public int anInt8994;

	@OriginalMember(owner = "client!vj", name = "md", descriptor = "I")
	public int anInt9000;

	@OriginalMember(owner = "client!vj", name = "Gd", descriptor = "I")
	private int anInt9019;

	@OriginalMember(owner = "client!vj", name = "le", descriptor = "I")
	public int anInt9042;

	@OriginalMember(owner = "client!vj", name = "oe", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!vj", name = "te", descriptor = "Lclient!kp;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!vj", name = "ve", descriptor = "Lclient!kp;")
	private Interface8 anInterface8_2;

	@OriginalMember(owner = "client!vj", name = "xe", descriptor = "Lclient!be;")
	private Class14_Sub2 aClass14_Sub2_1;

	@OriginalMember(owner = "client!vj", name = "ye", descriptor = "Lclient!wt;")
	private Class364 aClass364_6;

	@OriginalMember(owner = "client!vj", name = "Ee", descriptor = "I")
	private int anInt9048;

	@OriginalMember(owner = "client!vj", name = "Fe", descriptor = "I")
	public int anInt9049;

	@OriginalMember(owner = "client!vj", name = "He", descriptor = "I")
	private int anInt9050;

	@OriginalMember(owner = "client!vj", name = "Ie", descriptor = "I")
	public int anInt9051;

	@OriginalMember(owner = "client!vj", name = "Pe", descriptor = "Z")
	private boolean aBoolean678;

	@OriginalMember(owner = "client!vj", name = "Qe", descriptor = "I")
	private int anInt9052;

	@OriginalMember(owner = "client!vj", name = "Re", descriptor = "Z")
	private boolean aBoolean679;

	@OriginalMember(owner = "client!vj", name = "Se", descriptor = "Z")
	private boolean aBoolean680;

	@OriginalMember(owner = "client!vj", name = "Te", descriptor = "I")
	private int anInt9053;

	@OriginalMember(owner = "client!vj", name = "Ue", descriptor = "I")
	private int anInt9054;

	@OriginalMember(owner = "client!vj", name = "Ve", descriptor = "Z")
	private boolean aBoolean681;

	@OriginalMember(owner = "client!vj", name = "Xe", descriptor = "J")
	private long aLong260;

	@OriginalMember(owner = "client!vj", name = "af", descriptor = "Lclient!jg;")
	public Class60_Sub2 aClass60_Sub2_1;

	@OriginalMember(owner = "client!vj", name = "bf", descriptor = "F")
	private float bf;

	@OriginalMember(owner = "client!vj", name = "cf", descriptor = "Z")
	public boolean aBoolean682;

	@OriginalMember(owner = "client!vj", name = "df", descriptor = "Lclient!ut;")
	private Interface21 anInterface21_6;

	@OriginalMember(owner = "client!vj", name = "ef", descriptor = "Lclient!jg;")
	public Class60_Sub2 aClass60_Sub2_2;

	@OriginalMember(owner = "client!vj", name = "ff", descriptor = "Z")
	private boolean aBoolean683;

	@OriginalMember(owner = "client!vj", name = "gf", descriptor = "Z")
	private boolean aBoolean684;

	@OriginalMember(owner = "client!vj", name = "hf", descriptor = "I")
	private int anInt9055;

	@OriginalMember(owner = "client!vj", name = "mf", descriptor = "Z")
	public boolean aBoolean686;

	@OriginalMember(owner = "client!vj", name = "of", descriptor = "I")
	public int anInt9057;

	@OriginalMember(owner = "client!vj", name = "qf", descriptor = "[Lclient!av;")
	private Class24[] aClass24Array1;

	@OriginalMember(owner = "client!vj", name = "rf", descriptor = "Z")
	public boolean aBoolean687;

	@OriginalMember(owner = "client!vj", name = "sf", descriptor = "Z")
	private boolean aBoolean688;

	@OriginalMember(owner = "client!vj", name = "uf", descriptor = "I")
	private int anInt9060;

	@OriginalMember(owner = "client!vj", name = "vf", descriptor = "F")
	public float aFloat183;

	@OriginalMember(owner = "client!vj", name = "wf", descriptor = "Z")
	public boolean aBoolean689;

	@OriginalMember(owner = "client!vj", name = "xf", descriptor = "I")
	public int anInt9061;

	@OriginalMember(owner = "client!vj", name = "Af", descriptor = "Z")
	public boolean aBoolean691;

	@OriginalMember(owner = "client!vj", name = "Bf", descriptor = "I")
	private int anInt9062;

	@OriginalMember(owner = "client!vj", name = "If", descriptor = "I")
	private int anInt9065;

	@OriginalMember(owner = "client!vj", name = "Jf", descriptor = "Z")
	public boolean aBoolean694;

	@OriginalMember(owner = "client!vj", name = "Lf", descriptor = "Lclient!cn;")
	private Interface2 anInterface2_5;

	@OriginalMember(owner = "client!vj", name = "Mf", descriptor = "Ljava/lang/String;")
	private String aString83;

	@OriginalMember(owner = "client!vj", name = "Nf", descriptor = "Lclient!rr;")
	private Class12_Sub2 aClass12_Sub2_1;

	@OriginalMember(owner = "client!vj", name = "Of", descriptor = "Lclient!jg;")
	public Class60_Sub2 aClass60_Sub2_3;

	@OriginalMember(owner = "client!vj", name = "Pf", descriptor = "F")
	private float aFloat187;

	@OriginalMember(owner = "client!vj", name = "Rf", descriptor = "Z")
	private boolean aBoolean696;

	@OriginalMember(owner = "client!vj", name = "Tf", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!vj", name = "Vf", descriptor = "Z")
	private boolean aBoolean697;

	@OriginalMember(owner = "client!vj", name = "Xf", descriptor = "Lclient!hea;")
	public Class126 aClass126_15;

	@OriginalMember(owner = "client!vj", name = "ag", descriptor = "I")
	private int anInt9070;

	@OriginalMember(owner = "client!vj", name = "bg", descriptor = "Lclient!hea;")
	public Class126 aClass126_16;

	@OriginalMember(owner = "client!vj", name = "dg", descriptor = "Lclient!jg;")
	public Class60_Sub2 aClass60_Sub2_4;

	@OriginalMember(owner = "client!vj", name = "eg", descriptor = "I")
	public int anInt9072;

	@OriginalMember(owner = "client!vj", name = "hg", descriptor = "I")
	private int anInt9074;

	@OriginalMember(owner = "client!vj", name = "jg", descriptor = "Lclient!br;")
	private Class24_Sub1_Sub1 aClass24_Sub1_Sub1_5;

	@OriginalMember(owner = "client!vj", name = "pg", descriptor = "Lclient!jg;")
	public Class60_Sub2 aClass60_Sub2_5;

	@OriginalMember(owner = "client!vj", name = "qg", descriptor = "Lclient!wt;")
	public Class364 aClass364_7;

	@OriginalMember(owner = "client!vj", name = "rg", descriptor = "I")
	public int anInt9076;

	@OriginalMember(owner = "client!vj", name = "sg", descriptor = "Lclient!jg;")
	public Class60_Sub2 aClass60_Sub2_6;

	@OriginalMember(owner = "client!vj", name = "tg", descriptor = "I")
	private int anInt9077;

	@OriginalMember(owner = "client!vj", name = "wg", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!vj", name = "xg", descriptor = "Lclient!jg;")
	public Class60_Sub2 aClass60_Sub2_7;

	@OriginalMember(owner = "client!vj", name = "zg", descriptor = "Lclient!jg;")
	public Class60_Sub2 aClass60_Sub2_8;

	@OriginalMember(owner = "client!vj", name = "Bg", descriptor = "Ljava/lang/String;")
	private String aString84;

	@OriginalMember(owner = "client!vj", name = "Cg", descriptor = "Z")
	private boolean aBoolean701;

	@OriginalMember(owner = "client!vj", name = "Dg", descriptor = "Z")
	public boolean aBoolean702;

	@OriginalMember(owner = "client!vj", name = "Og", descriptor = "F")
	public float aFloat197;

	@OriginalMember(owner = "client!vj", name = "Pg", descriptor = "F")
	private float aFloat198;

	@OriginalMember(owner = "client!vj", name = "Qg", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!vj", name = "Rg", descriptor = "I")
	private int anInt9084;

	@OriginalMember(owner = "client!vj", name = "Sg", descriptor = "Z")
	private boolean aBoolean705;

	@OriginalMember(owner = "client!vj", name = "Ug", descriptor = "Lclient!jg;")
	public Class60_Sub2 aClass60_Sub2_9;

	@OriginalMember(owner = "client!vj", name = "Vg", descriptor = "Lclient!jg;")
	public Class60_Sub2 aClass60_Sub2_10;

	@OriginalMember(owner = "client!vj", name = "Wg", descriptor = "Lclient!ut;")
	private Interface21 anInterface21_7;

	@OriginalMember(owner = "client!vj", name = "Yg", descriptor = "Z")
	public boolean aBoolean706;

	@OriginalMember(owner = "client!vj", name = "Zg", descriptor = "Lclient!g;")
	public Class24_Sub1 aClass24_Sub1_6;

	@OriginalMember(owner = "client!vj", name = "bh", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!vj", name = "fh", descriptor = "Z")
	public boolean aBoolean707;

	@OriginalMember(owner = "client!vj", name = "hh", descriptor = "I")
	private int anInt9089;

	@OriginalMember(owner = "client!vj", name = "kh", descriptor = "I")
	private int anInt9090;

	@OriginalMember(owner = "client!vj", name = "Gb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!vj", name = "ae", descriptor = "I")
	public int anInt9035 = 128;

	@OriginalMember(owner = "client!vj", name = "Xd", descriptor = "Lclient!as;")
	private final Class21 aClass21_1 = new Class21();

	@OriginalMember(owner = "client!vj", name = "je", descriptor = "Lclient!kw;")
	private final Class11_Sub2 aClass11_Sub2_1 = new Class11_Sub2();

	@OriginalMember(owner = "client!vj", name = "ke", descriptor = "Lclient!kw;")
	public final Class11_Sub2 aClass11_Sub2_2 = new Class11_Sub2();

	@OriginalMember(owner = "client!vj", name = "me", descriptor = "I")
	public int anInt9043 = 3;

	@OriginalMember(owner = "client!vj", name = "re", descriptor = "I")
	public int anInt9044 = 8;

	@OriginalMember(owner = "client!vj", name = "pe", descriptor = "Z")
	private boolean aBoolean677 = false;

	@OriginalMember(owner = "client!vj", name = "ne", descriptor = "Lclient!gk;")
	private final Class112 aClass112_63 = new Class112();

	@OriginalMember(owner = "client!vj", name = "we", descriptor = "[Lclient!kp;")
	private final Interface8[] anInterface8Array1 = new Interface8[4];

	@OriginalMember(owner = "client!vj", name = "ue", descriptor = "I")
	private int anInt9046 = -1;

	@OriginalMember(owner = "client!vj", name = "se", descriptor = "I")
	private int anInt9045 = -1;

	@OriginalMember(owner = "client!vj", name = "ze", descriptor = "[Lclient!kp;")
	private final Interface8[] anInterface8Array2 = new Interface8[4];

	@OriginalMember(owner = "client!vj", name = "Ae", descriptor = "I")
	private int anInt9047 = -1;

	@OriginalMember(owner = "client!vj", name = "Be", descriptor = "[Lclient!kp;")
	private final Interface8[] anInterface8Array3 = new Interface8[4];

	@OriginalMember(owner = "client!vj", name = "Ce", descriptor = "Lclient!th;")
	private final Class325 aClass325_12 = new Class325();

	@OriginalMember(owner = "client!vj", name = "De", descriptor = "Lclient!wa;")
	private final Class354 aClass354_41 = new Class354(16);

	@OriginalMember(owner = "client!vj", name = "Ge", descriptor = "Lclient!gk;")
	private final Class112 aClass112_64 = new Class112();

	@OriginalMember(owner = "client!vj", name = "Je", descriptor = "Lclient!gk;")
	private final Class112 aClass112_65 = new Class112();

	@OriginalMember(owner = "client!vj", name = "Ke", descriptor = "Lclient!gk;")
	private final Class112 aClass112_66 = new Class112();

	@OriginalMember(owner = "client!vj", name = "Le", descriptor = "Lclient!gk;")
	private final Class112 aClass112_67 = new Class112();

	@OriginalMember(owner = "client!vj", name = "Me", descriptor = "Lclient!gk;")
	private final Class112 aClass112_68 = new Class112();

	@OriginalMember(owner = "client!vj", name = "Ne", descriptor = "Lclient!gk;")
	private final Class112 aClass112_69 = new Class112();

	@OriginalMember(owner = "client!vj", name = "Oe", descriptor = "Lclient!gk;")
	private final Class112 aClass112_70 = new Class112();

	@OriginalMember(owner = "client!vj", name = "We", descriptor = "Lclient!kw;")
	public final Class11_Sub2 aClass11_Sub2_3 = new Class11_Sub2();

	@OriginalMember(owner = "client!vj", name = "Ye", descriptor = "Lclient!kw;")
	public final Class11_Sub2 aClass11_Sub2_4 = new Class11_Sub2();

	@OriginalMember(owner = "client!vj", name = "Ze", descriptor = "Lclient!kw;")
	public final Class11_Sub2 aClass11_Sub2_5 = new Class11_Sub2();

	@OriginalMember(owner = "client!vj", name = "nf", descriptor = "I")
	private int anInt9056 = 0;

	@OriginalMember(owner = "client!vj", name = "Ff", descriptor = "I")
	private int anInt9064 = 0;

	@OriginalMember(owner = "client!vj", name = "Hf", descriptor = "F")
	public float aFloat186 = 1.0F;

	@OriginalMember(owner = "client!vj", name = "Ef", descriptor = "I")
	public int anInt9063 = 0;

	@OriginalMember(owner = "client!vj", name = "yf", descriptor = "F")
	public float aFloat184 = 1.0F;

	@OriginalMember(owner = "client!vj", name = "fg", descriptor = "[F")
	private final float[] aFloatArray99 = new float[4];

	@OriginalMember(owner = "client!vj", name = "Yf", descriptor = "I")
	public int anInt9068 = -1;

	@OriginalMember(owner = "client!vj", name = "tf", descriptor = "I")
	private int anInt9059 = 0;

	@OriginalMember(owner = "client!vj", name = "Wf", descriptor = "F")
	private float aFloat189 = -1.0F;

	@OriginalMember(owner = "client!vj", name = "ug", descriptor = "[F")
	private final float[] aFloatArray100 = new float[16];

	@OriginalMember(owner = "client!vj", name = "pf", descriptor = "I")
	public int anInt9058 = -1;

	@OriginalMember(owner = "client!vj", name = "gg", descriptor = "I")
	public int anInt9073 = 0;

	@OriginalMember(owner = "client!vj", name = "kf", descriptor = "Z")
	private boolean aBoolean685 = false;

	@OriginalMember(owner = "client!vj", name = "Qf", descriptor = "[F")
	public final float[] aFloatArray98 = new float[4];

	@OriginalMember(owner = "client!vj", name = "cg", descriptor = "I")
	private int anInt9071 = 8448;

	@OriginalMember(owner = "client!vj", name = "lf", descriptor = "F")
	public float aFloat182 = 3584.0F;

	@OriginalMember(owner = "client!vj", name = "vg", descriptor = "I")
	private int anInt9078 = 0;

	@OriginalMember(owner = "client!vj", name = "lg", descriptor = "I")
	public int anInt9075 = 0;

	@OriginalMember(owner = "client!vj", name = "Df", descriptor = "F")
	private float aFloat185 = 1.0F;

	@OriginalMember(owner = "client!vj", name = "og", descriptor = "Z")
	private boolean aBoolean699 = true;

	@OriginalMember(owner = "client!vj", name = "mg", descriptor = "F")
	private float aFloat191 = 0.0F;

	@OriginalMember(owner = "client!vj", name = "Uf", descriptor = "I")
	private int anInt9067 = -1;

	@OriginalMember(owner = "client!vj", name = "Jg", descriptor = "I")
	public int anInt9083 = 0;

	@OriginalMember(owner = "client!vj", name = "Hg", descriptor = "[F")
	private final float[] aFloatArray101 = new float[4];

	@OriginalMember(owner = "client!vj", name = "jf", descriptor = "F")
	public float aFloat181 = -1.0F;

	@OriginalMember(owner = "client!vj", name = "ig", descriptor = "F")
	public float aFloat190 = 3584.0F;

	@OriginalMember(owner = "client!vj", name = "Sf", descriptor = "I")
	public int anInt9066 = 512;

	@OriginalMember(owner = "client!vj", name = "Gg", descriptor = "I")
	public int anInt9081 = 50;

	@OriginalMember(owner = "client!vj", name = "ng", descriptor = "F")
	private float aFloat192 = 1.0F;

	@OriginalMember(owner = "client!vj", name = "Mg", descriptor = "F")
	public float aFloat196 = 1.0F;

	@OriginalMember(owner = "client!vj", name = "Ag", descriptor = "I")
	private int anInt9079 = 8448;

	@OriginalMember(owner = "client!vj", name = "ah", descriptor = "I")
	public int anInt9086 = 512;

	@OriginalMember(owner = "client!vj", name = "Xg", descriptor = "[F")
	private final float[] aFloatArray102 = new float[4];

	@OriginalMember(owner = "client!vj", name = "Tg", descriptor = "I")
	public int anInt9085 = -1;

	@OriginalMember(owner = "client!vj", name = "ch", descriptor = "I")
	public int anInt9087 = -1;

	@OriginalMember(owner = "client!vj", name = "Lg", descriptor = "F")
	private float aFloat195 = -1.0F;

	@OriginalMember(owner = "client!vj", name = "dh", descriptor = "I")
	private int anInt9088 = 0;

	@OriginalMember(owner = "client!vj", name = "Kg", descriptor = "F")
	public float aFloat194 = -1.0F;

	@OriginalMember(owner = "client!vj", name = "Eg", descriptor = "I")
	private int anInt9080 = 3584;

	@OriginalMember(owner = "client!vj", name = "gh", descriptor = "[Lclient!eq;")
	private final Class3_Sub10[] aClass3_Sub10Array6 = new Class3_Sub10[Static180.anInt3474];

	@OriginalMember(owner = "client!vj", name = "Ig", descriptor = "I")
	private int anInt9082 = 0;

	@OriginalMember(owner = "client!vj", name = "eh", descriptor = "Lclient!nea;")
	public Class3_Sub11_Sub2 aClass3_Sub11_Sub2_3 = new Class3_Sub11_Sub2(8192);

	@OriginalMember(owner = "client!vj", name = "jh", descriptor = "[I")
	public int[] anIntArray583 = new int[1];

	@OriginalMember(owner = "client!vj", name = "ih", descriptor = "[I")
	public int[] anIntArray582 = new int[1];

	@OriginalMember(owner = "client!vj", name = "mh", descriptor = "[B")
	public final byte[] aByteArray93 = new byte[16384];

	@OriginalMember(owner = "client!vj", name = "lh", descriptor = "[I")
	public int[] anIntArray584 = new int[1];

	@OriginalMember(owner = "client!vj", name = "he", descriptor = "I")
	public final int anInt9040;

	@OriginalMember(owner = "client!vj", name = "Cc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas13;

	@OriginalMember(owner = "client!vj", name = "fb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!vj", name = "Od", descriptor = "Lclient!jaggl/OpenGL;")
	public OpenGL anOpenGL2;

	@OriginalMember(owner = "client!vj", name = "Lc", descriptor = "J")
	private final long aLong259;

	@OriginalMember(owner = "client!vj", name = "dc", descriptor = "J")
	private long aLong258;

	@OriginalMember(owner = "client!vj", name = "Zf", descriptor = "I")
	public final int anInt9069;

	@OriginalMember(owner = "client!vj", name = "Kf", descriptor = "Z")
	public boolean aBoolean695;

	@OriginalMember(owner = "client!vj", name = "zf", descriptor = "Z")
	private boolean aBoolean690;

	@OriginalMember(owner = "client!vj", name = "Gf", descriptor = "Z")
	public boolean aBoolean693;

	@OriginalMember(owner = "client!vj", name = "kg", descriptor = "Z")
	public boolean aBoolean698;

	@OriginalMember(owner = "client!vj", name = "Cf", descriptor = "Z")
	public boolean aBoolean692;

	@OriginalMember(owner = "client!vj", name = "Fg", descriptor = "Z")
	private boolean aBoolean703;

	@OriginalMember(owner = "client!vj", name = "Ng", descriptor = "Z")
	public boolean aBoolean704;

	@OriginalMember(owner = "client!vj", name = "yg", descriptor = "Z")
	private final boolean aBoolean700;

	@OriginalMember(owner = "client!vj", name = "Vd", descriptor = "Lclient!jj;")
	private final Class161 aClass161_1;

	@OriginalMember(owner = "client!vj", name = "qe", descriptor = "Lclient!ih;")
	public final Class146 aClass146_1;

	@OriginalMember(owner = "client!vj", name = "fe", descriptor = "Lclient!kb;")
	private final Class172 aClass172_1;

	@OriginalMember(owner = "client!vj", name = "Zd", descriptor = "Lclient!aq;")
	private Class3_Sub5_Sub1 aClass3_Sub5_Sub1_1;

	@OriginalMember(owner = "client!vj", name = "de", descriptor = "Lclient!tba;")
	private final Class320 aClass320_1;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;I)V")
	public Class45_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		this.anInt9040 = arg2;
		this.aCanvas12 = this.aCanvas13 = arg0;
		if (!Static10.method149("jaclib")) {
			throw new RuntimeException("");
		} else if (Static10.method149("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong258 = this.aLong259 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt9040);
				if (this.aLong259 == 0L) {
					throw new RuntimeException("");
				}
				this.method7466();
				@Pc(339) int local339 = this.method7488();
				if (local339 != 0) {
					throw new RuntimeException("");
				}
				this.anInt9069 = this.aBoolean687 ? 33639 : 5121;
				if (this.aString84.indexOf("radeon") != -1) {
					@Pc(362) int local362 = 0;
					@Pc(364) boolean local364 = false;
					@Pc(366) boolean local366 = false;
					@Pc(375) String[] local375 = Static572.method7699(' ', this.aString84.replace('/', ' '));
					for (@Pc(377) int local377 = 0; local377 < local375.length; local377++) {
						@Pc(383) String local383 = local375[local377];
						try {
							if (local383.length() > 0) {
								if (local383.charAt(0) == 'x' && local383.length() >= 3 && Static368.method5388(local383.substring(1, 3))) {
									local383 = local383.substring(1);
									local366 = true;
								}
								if (local383.equals("hd")) {
									local364 = true;
								} else {
									if (local383.startsWith("hd")) {
										local364 = true;
										local383 = local383.substring(2);
									}
									if (local383.length() >= 4 && Static368.method5388(local383.substring(0, 4))) {
										local362 = Static213.method6524(local383.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(453) Exception local453) {
						}
					}
					if (!local366 && !local364) {
						if (local362 >= 7000 && local362 <= 9250) {
							this.aBoolean695 = false;
						}
						if (local362 >= 7000 && local362 <= 7999) {
							this.aBoolean690 = false;
						}
					}
					if (!local364 || local362 < 4000) {
						this.aBoolean693 = false;
					}
					this.aBoolean698 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean692 = true;
					this.aBoolean703 = this.aBoolean690;
				}
				if (this.aString83.indexOf("intel") != -1) {
					this.aBoolean704 = false;
				}
				this.aBoolean700 = !this.aString83.equals("s3 graphics");
				if (this.aBoolean690) {
					try {
						@Pc(540) int[] local540 = new int[1];
						OpenGL.glGenBuffersARB(1, local540, 0);
					} catch (@Pc(546) Throwable local546) {
						throw new RuntimeException("");
					}
				}
				Static218.method3484(true, false);
				this.aBoolean677 = true;
				this.aClass161_1 = new Class161(this, super.anInterface3_12);
				this.method7486();
				this.aClass146_1 = new Class146(this);
				this.aClass172_1 = new Class172(this);
				if (this.aClass172_1.method4094()) {
					this.aClass3_Sub5_Sub1_1 = new Class3_Sub5_Sub1(this);
					if (!this.aClass3_Sub5_Sub1_1.method390()) {
						this.aClass3_Sub5_Sub1_1.method379();
						this.aClass3_Sub5_Sub1_1 = null;
					}
				}
				this.aClass320_1 = new Class320(this);
				this.method7487();
				this.method7514();
				this.method7361();
			} catch (@Pc(620) Throwable local620) {
				local620.printStackTrace();
				this.method7359();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!vj", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.method7465(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class14 method7362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class14_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7441();
		this.method7465(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "(I)V")
	private void method7436() {
		@Pc(6) float[] local6 = this.aFloatArray100;
		@Pc(18) float local18 = (float) (-this.anInt9073 * this.anInt9081) / (float) this.anInt9066;
		@Pc(32) float local32 = (float) (this.anInt9081 * (this.anInt8994 - this.anInt9073)) / (float) this.anInt9066;
		@Pc(43) float local43 = (float) (this.anInt9083 * this.anInt9081) / (float) this.anInt9086;
		@Pc(57) float local57 = (float) ((this.anInt9083 - this.anInt9000) * this.anInt9081) / (float) this.anInt9086;
		if (local18 == local32 || local57 == local43) {
			local6[11] = 0.0F;
			local6[8] = 0.0F;
			local6[10] = 1.0F;
			local6[1] = 0.0F;
			local6[5] = 1.0F;
			local6[9] = 0.0F;
			local6[14] = 0.0F;
			local6[15] = 1.0F;
			local6[2] = 0.0F;
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[6] = 0.0F;
			local6[0] = 1.0F;
			local6[12] = 0.0F;
			local6[13] = 0.0F;
			local6[7] = 0.0F;
		} else {
			@Pc(137) float local137 = (float) this.anInt9081 * 2.0F;
			local6[14] = this.aFloat198 = -(local137 * (float) this.anInt9080) / (float) (this.anInt9080 - this.anInt9081);
			local6[12] = 0.0F;
			local6[11] = -1.0F;
			local6[15] = 0.0F;
			local6[9] = (local43 + local57) / (-local57 + local43);
			local6[1] = 0.0F;
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[8] = (local18 + local32) / (local32 - local18);
			local6[2] = 0.0F;
			local6[6] = 0.0F;
			local6[0] = local137 / (local32 - local18);
			local6[10] = this.bf = (float) -(this.anInt9080 + this.anInt9081) / (float) (this.anInt9080 - this.anInt9081);
			local6[13] = 0.0F;
			local6[7] = 0.0F;
			local6[5] = local137 / (local43 - local57);
		}
		this.method7444();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZB)V")
	public void method7437(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean680) {
			this.aBoolean680 = arg0;
			this.method7460();
			this.anInt9053 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class14 method7395(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class14_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)V")
	@Override
	public void method7421(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method7382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class81 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class81_Sub1 local6 = (Class81_Sub1) arg5;
		@Pc(9) Class24_Sub1_Sub1 local9 = local6.aClass24_Sub1_Sub1_3;
		this.method7476();
		this.method7475(local6.aClass24_Sub1_Sub1_3);
		this.method7465(1);
		this.method7491(7681, 8448);
		this.method7507(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat25 / (float) local9.anInt991;
		@Pc(46) float local46 = local9.aFloat26 / (float) local9.anInt990;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(59) float local59 = (float) arg3 - (float) arg1;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local53 * local53)));
		@Pc(76) float local76 = local59 * local72;
		@Pc(80) float local80 = local53 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local80 + 0.35F, (float) arg3 + local76 + 0.35F);
		OpenGL.glEnd();
		this.method7507(768, 5890, 0);
	}

	@OriginalMember(owner = "client!vj", name = "A", descriptor = "()V")
	@Override
	public void method7432() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!vj", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method7441();
		this.method7465(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean683) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean683) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "()Lclient!q;")
	@Override
	public Class11 method7397() {
		return this.aClass11_Sub2_1;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)V")
	public synchronized void method7438(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub17 local8 = new Class3_Sub17(arg0);
		this.aClass112_67.method3079(local8);
	}

	@OriginalMember(owner = "client!vj", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean686) {
			throw new RuntimeException("");
		}
		this.anInt9058 = arg2;
		this.anInt9063 = arg3;
		this.anInt9076 = arg0;
		this.anInt9068 = arg1;
		if (this.aBoolean685) {
			this.aClass320_1.aClass46_Sub5_1.method3331();
			this.aClass320_1.aClass46_Sub5_1.method3332();
		}
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "()V")
	@Override
	public void method7361() {
		if (!this.aBoolean700 || this.anInt8994 <= 0 || this.anInt9000 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt9082;
		@Pc(25) int local25 = this.anInt9078;
		@Pc(28) int local28 = this.anInt9088;
		@Pc(31) int local31 = this.anInt9056;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7519();
		this.method7481(false);
		this.method7489(false);
		this.method7461(false);
		this.method7437(false);
		this.method7475(null);
		this.method7505(-2);
		this.method7500(1);
		this.method7465(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt8994, this.anInt9000, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!vj", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt9080;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
	private void method7439() {
		if (this.anInt9077 != 2) {
			this.anInt9077 = 2;
			this.method7484();
			this.method7516();
			this.anInt9053 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FBFFF)V")
	public void method7440(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static258.aFloatArray81[3] = arg2;
		Static258.aFloatArray81[2] = arg3;
		Static258.aFloatArray81[0] = arg1;
		Static258.aFloatArray81[1] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static258.aFloatArray81, 0);
	}

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "(I)V")
	private void method7441() {
		if (this.anInt9053 == 1) {
			return;
		}
		this.method7495();
		this.method7481(false);
		this.method7489(false);
		this.method7461(false);
		this.method7437(false);
		this.method7475(null);
		this.method7505(-2);
		this.method7500(1);
		this.anInt9053 = 1;
	}

	@OriginalMember(owner = "client!vj", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt9088 = 0;
		this.anInt9078 = this.anInt8994;
		this.anInt9056 = this.anInt9000;
		this.anInt9082 = 0;
		OpenGL.glDisable(3089);
		this.method7445();
	}

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "(I)V")
	private void method7442() {
		Static258.aFloatArray81[3] = 1.0F;
		Static258.aFloatArray81[2] = this.aFloat194 * this.aFloat184;
		Static258.aFloatArray81[1] = this.aFloat186 * this.aFloat194;
		Static258.aFloatArray81[0] = this.aFloat194 * this.aFloat196;
		OpenGL.glLightfv(16384, 4609, Static258.aFloatArray81, 0);
		Static258.aFloatArray81[2] = -this.aFloat181 * this.aFloat184;
		Static258.aFloatArray81[0] = -this.aFloat181 * this.aFloat196;
		Static258.aFloatArray81[1] = this.aFloat186 * -this.aFloat181;
		Static258.aFloatArray81[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static258.aFloatArray81, 0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!kp;B)V")
	public void method7443(@OriginalArg(0) Interface8 arg0) {
		if (this.aBoolean694) {
			this.method7456(arg0);
			this.method7492(arg0);
		} else if (this.anInt9047 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt9047 >= 0) {
				this.anInterface8Array2[this.anInt9047].method7920();
			}
			this.anInterface8_2 = this.anInterface8_1 = this.anInterface8Array2[++this.anInt9047] = arg0;
			this.anInterface8_2.method7921();
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
	private void method7444() {
		this.aFloatArray100[14] = this.aFloat198;
		this.aFloatArray100[10] = this.bf;
		this.aFloat190 = this.anInt9080;
		this.aFloat182 = (this.aFloatArray100[14] - (float) this.anInt9080) / this.aFloatArray100[10];
	}

	@OriginalMember(owner = "client!vj", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class81_Sub1 local6 = (Class81_Sub1) arg1;
		@Pc(9) Class24_Sub1_Sub1 local9 = local6.aClass24_Sub1_Sub1_3;
		this.method7476();
		this.method7475(local6.aClass24_Sub1_Sub1_3);
		this.method7465(1);
		this.method7491(7681, 8448);
		this.method7507(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat25 / (float) local9.anInt991;
		@Pc(46) float local46 = local9.aFloat26 / (float) local9.anInt990;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt9082 - arg2), (float) (this.anInt9088 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt9082, this.anInt9088);
		OpenGL.glTexCoord2f((float) (this.anInt9082 - arg2) * local39, local46 * (float) (this.anInt9056 - arg3));
		OpenGL.glVertex2i(this.anInt9082, this.anInt9056);
		OpenGL.glTexCoord2f((float) (this.anInt9078 - arg2) * local39, local46 * (float) (this.anInt9056 - arg3));
		OpenGL.glVertex2i(this.anInt9078, this.anInt9056);
		OpenGL.glTexCoord2f((float) (this.anInt9078 - arg2) * local39, (float) (this.anInt9088 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt9078, this.anInt9088);
		OpenGL.glEnd();
		this.method7507(768, 5890, 0);
	}

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "(I)V")
	@Override
	public void method7428(@OriginalArg(0) int arg0) {
		this.method7462();
	}

	@OriginalMember(owner = "client!vj", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt9000 < arg3) {
			arg3 = this.anInt9000;
		}
		if (arg2 > this.anInt8994) {
			arg2 = this.anInt8994;
		}
		this.anInt9088 = arg1;
		this.anInt9056 = arg3;
		this.anInt9082 = arg0;
		this.anInt9078 = arg2;
		OpenGL.glEnable(3089);
		this.method7445();
		this.method7503();
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V")
	private void method7445() {
		this.aFloat193 = this.anInt9056 - this.anInt9083;
		this.aFloat200 = this.anInt9082 - this.anInt9073;
		this.aFloat183 = this.anInt9078 - this.anInt9073;
		this.aFloat199 = this.anInt9088 - this.anInt9083;
	}

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "(I)Lclient!fca;")
	public Class24_Sub3 method7446() {
		return this.aClass12_Sub2_1 == null ? null : this.aClass12_Sub2_1.method3734();
	}

	@OriginalMember(owner = "client!vj", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9076 = arg0;
		this.aBoolean686 = true;
		this.anInt9068 = arg1;
		this.anInt9058 = arg2;
		this.anInt9063 = arg3;
	}

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "(I)V")
	private void method7447() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt9074; local7++) {
			@Pc(16) Class3_Sub10 local16 = this.aClass3_Sub10Array6[local7];
			@Pc(20) int local20 = local7 + 16386;
			Static208.aFloatArray44[0] = local16.method6021();
			Static208.aFloatArray44[1] = local16.method6011();
			Static208.aFloatArray44[2] = local16.method6015();
			Static208.aFloatArray44[3] = 1.0F;
			OpenGL.glLightfv(local20, 4611, Static208.aFloatArray44, 0);
			@Pc(54) int local54 = local16.method6020();
			@Pc(60) float local60 = local16.method6013() / 255.0F;
			Static208.aFloatArray44[2] = local60 * (float) (local54 & 0xFF);
			Static208.aFloatArray44[0] = (float) (local54 >> 16 & 0xFF) * local60;
			Static208.aFloatArray44[1] = (float) (local54 >> 8 & 0xFF) * local60;
			OpenGL.glLightfv(local20, 4609, Static208.aFloatArray44, 0);
			OpenGL.glLightf(local20, 4617, 1.0F / (float) (local16.method6018() * local16.method6018()));
			OpenGL.glEnable(local20);
		}
		while (this.anInt9084 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt9084 = this.anInt9074;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)V")
	public void method7448() {
		if (this.anInt9053 == 4) {
			return;
		}
		this.method7495();
		this.method7481(false);
		this.method7489(false);
		this.method7461(false);
		this.method7437(false);
		this.method7505(-2);
		this.method7465(1);
		this.anInt9053 = 4;
	}

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "()Z")
	@Override
	public boolean method7391() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "(I)V")
	public void method7449() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIII)V")
	public void method7450(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "()V")
	@Override
	public void method7386() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "(I)V")
	private void method7451() {
		@Pc(15) float local15 = (float) -this.anInt9073 * this.aFloat192 / (float) this.anInt9066;
		@Pc(27) float local27 = (float) -this.anInt9083 * this.aFloat192 / (float) this.anInt9086;
		@Pc(42) float local42 = (float) (this.anInt8994 - this.anInt9073) * this.aFloat192 / (float) this.anInt9066;
		@Pc(57) float local57 = (float) (this.anInt9000 - this.anInt9083) * this.aFloat192 / (float) this.anInt9086;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local57 != local27) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) this.anInt9081, (double) this.anInt9080);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[Lclient!eq;)V")
	@Override
	public void method7413(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub10[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub10Array6[local7] = arg1[local7];
		}
		this.anInt9074 = arg0;
		if (this.anInt9077 != 1) {
			this.method7447();
		}
	}

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "(I)V")
	private void method7452() {
		if (this.aBoolean697 && !this.aBoolean684) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "()Z")
	@Override
	public boolean method7360() {
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZZII)V")
	public void method7453(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 != this.anInt9060 || this.aBoolean686 != this.aBoolean685) {
			@Pc(25) Class24_Sub1 local25 = null;
			@Pc(27) int local27 = 0;
			@Pc(29) byte local29 = 0;
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = this.aBoolean686 ? 3 : 0;
			if (arg2 < 0) {
				this.method7497();
			} else {
				local25 = this.aClass161_1.method3886(arg2);
				@Pc(60) Class55 local60 = super.anInterface3_12.method4776(arg2);
				if (local60.aByte18 == 0 && local60.aByte21 == 0) {
					this.method7497();
				} else {
					@Pc(78) int local78 = local60.aBoolean141 ? 64 : 128;
					@Pc(82) int local82 = local78 * 50;
					this.method7463((float) (this.anInt9042 % local82 * local60.aByte18) / (float) local82, 0.0F, (float) (this.anInt9042 % local82 * local60.aByte21) / (float) local82);
				}
				local27 = local60.anInt1675;
				if (!this.aBoolean686) {
					local38 = local60.aByte16;
					local31 = local60.anInt1674;
					local29 = local60.aByte20;
				}
			}
			this.aClass320_1.method6753(local29, local31, arg0, arg1, local38);
			if (!this.aClass320_1.method6755(local25, local27)) {
				this.method7475(local25);
				this.method7500(local27);
			}
			this.aBoolean685 = this.aBoolean686;
			this.anInt9060 = arg2;
		}
		this.anInt9053 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "(I)V")
	public void method7454() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray98, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray99, 0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BF)V")
	public void method7455(@OriginalArg(1) float arg0) {
		if (arg0 == this.aFloat192) {
			return;
		}
		this.aFloat192 = arg0;
		if (this.anInt9077 == 3) {
			this.method7451();
			return;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!kp;I)V")
	public void method7456(@OriginalArg(0) Interface8 arg0) {
		if (this.anInt9045 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt9045 >= 0) {
			this.anInterface8Array1[this.anInt9045].method7922();
		}
		this.anInterface8_2 = this.anInterface8Array1[++this.anInt9045] = arg0;
		this.anInterface8_2.method7923();
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "()Z")
	@Override
	public boolean method7363() {
		return this.aClass3_Sub5_Sub1_1 != null && this.aClass3_Sub5_Sub1_1.method378();
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(IIII)V")
	public void method7457(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7403(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas13 == arg0) {
			local5 = this.aLong259;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable7.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas12 == arg0) {
			this.method7514();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V")
	public void method7458(@OriginalArg(1) int arg0) {
		Static258.aFloatArray81[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static258.aFloatArray81[3] = (float) (arg0 >>> 24) / 255.0F;
		Static258.aFloatArray81[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static258.aFloatArray81[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static258.aFloatArray81, 0);
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)Lclient!e;")
	@Override
	public Class3_Sub15 method7423(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub15_Sub1 local8 = new Class3_Sub15_Sub1(arg0);
		this.aClass112_63.method3079(local8);
		return local8;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)V")
	public synchronized void method7459(@OriginalArg(1) int arg0) {
		@Pc(13) Class3 local13 = new Class3();
		local13.aLong273 = arg0;
		this.aClass112_69.method3079(local13);
	}

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "()Z")
	@Override
	public boolean method7389() {
		return this.aBoolean683 && (!this.method7363() || this.aBoolean688);
	}

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "()Z")
	@Override
	public boolean method7380() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean699 = arg0;
		this.method7460();
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(B)V")
	private void method7460() {
		OpenGL.glDepthMask(this.aBoolean680 && this.aBoolean699);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(ZI)V")
	public void method7461(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean678 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt9053 &= 0xFFFFFFE0;
		this.aBoolean678 = arg0;
	}

	@OriginalMember(owner = "client!vj", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt9067;
		if (local15 || arg1 != this.aFloat194 || arg2 != this.aFloat181) {
			this.aFloat181 = arg2;
			this.anInt9067 = arg0;
			this.aFloat194 = arg1;
			if (local15) {
				this.aFloat184 = (float) (this.anInt9067 & 0xFF) / 255.0F;
				this.aFloat186 = (float) (this.anInt9067 & 0xFF00) / 65280.0F;
				this.aFloat196 = (float) (this.anInt9067 & 0xFF0000) / 1.671168E7F;
				this.method7464();
			}
			this.method7442();
		}
		if (this.aFloatArray102[0] == arg3 && this.aFloatArray102[1] == arg4 && this.aFloatArray102[2] == arg5) {
			return;
		}
		this.aFloatArray102[0] = arg3;
		this.aFloatArray102[1] = arg4;
		this.aFloatArray102[2] = arg5;
		this.aFloatArray101[0] = -arg3;
		this.aFloatArray101[2] = -arg5;
		this.aFloatArray101[1] = -arg4;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray98[0] = local142 * arg3;
		this.aFloatArray98[2] = arg5 * local142;
		this.aFloatArray98[1] = local142 * arg4;
		this.aFloatArray99[0] = -this.aFloatArray98[0];
		this.aFloatArray99[1] = -this.aFloatArray98[1];
		this.aFloatArray99[2] = -this.aFloatArray98[2];
		this.method7454();
		this.anInt9061 = (int) (arg5 * 256.0F / arg4);
		this.anInt9057 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "()Z")
	@Override
	public boolean method7384() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "(I)V")
	private void method7462() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FIFF)V")
	private void method7463(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean705) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean705 = true;
	}

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "(I)V")
	private void method7464() {
		Static258.aFloatArray81[0] = this.aFloat196 * this.aFloat197;
		Static258.aFloatArray81[3] = 1.0F;
		Static258.aFloatArray81[2] = this.aFloat184 * this.aFloat197;
		Static258.aFloatArray81[1] = this.aFloat197 * this.aFloat186;
		OpenGL.glLightModelfv(2899, Static258.aFloatArray81, 0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class34 method7371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class34_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!vj", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt9056 > arg3) {
			this.anInt9056 = arg3;
		}
		if (this.anInt9078 > arg2) {
			this.anInt9078 = arg2;
		}
		if (this.anInt9088 < arg1) {
			this.anInt9088 = arg1;
		}
		if (this.anInt9082 < arg0) {
			this.anInt9082 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method7445();
		this.method7503();
	}

	@OriginalMember(owner = "client!vj", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9087 == arg0 && this.anInt9085 == arg1 && arg2 == this.anInt9075) {
			return;
		}
		this.anInt9087 = arg0;
		this.anInt9075 = arg2;
		this.anInt9085 = arg1;
		this.method7504();
		this.method7512();
	}

	@OriginalMember(owner = "client!vj", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7437(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(II)V")
	public void method7465(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt9054) {
			return;
		}
		@Pc(10) boolean local10;
		@Pc(12) byte local12;
		if (arg0 == 1) {
			local10 = true;
			local12 = 1;
		} else if (arg0 == 2) {
			local10 = false;
			local12 = 2;
		} else if (arg0 == 128) {
			local10 = true;
			local12 = 3;
		} else {
			local10 = false;
			local12 = 0;
		}
		if (!this.aBoolean681) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean681 = true;
		}
		if (this.aBoolean679 != local10) {
			if (local10) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean679 = local10;
		}
		if (this.anInt9052 != local12) {
			if (local12 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local12 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local12 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt9052 = local12;
		}
		this.anInt9053 &= 0xFFFFFFE3;
		this.anInt9054 = arg0;
	}

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "(I)V")
	private void method7466() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL2.a()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static589.method7892(1000L);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
	public synchronized void method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class3_Sub17 local16 = new Class3_Sub17(arg0);
		local16.aLong273 = arg1;
		this.aClass112_68.method3079(local16);
	}

	@OriginalMember(owner = "client!vj", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(6) int local6 = this.anInt9090;
		this.anInt9090 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!vj", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat197) {
			this.aFloat197 = arg0;
			this.method7464();
		}
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(II)I")
	public int method7468(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "(I)V")
	private void method7469() {
		if (this.anInt9077 != 3) {
			this.anInt9077 = 3;
			this.method7451();
			this.method7516();
			this.anInt9053 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "()Lclient!q;")
	@Override
	public Class11 method7408() {
		return this.aClass11_Sub2_3;
	}

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "()Z")
	@Override
	public boolean method7404() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7434(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable7.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
	@Override
	public void method7385(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "()Z")
	@Override
	public boolean method7429() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIF)Lclient!eq;")
	@Override
	public Class3_Sub10 method7357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub10_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)V")
	@Override
	public void method7416(@OriginalArg(0) int arg0) {
		this.method7466();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7400(@OriginalArg(0) Class14 arg0) {
		this.aClass14_Sub2_1 = (Class14_Sub2) arg0;
		@Pc(81) Class3_Sub7 local81;
		if (this.aBoolean704) {
			if (this.aClass364_6 == null) {
				this.aClass364_6 = new Class364(this);
			}
			if (this.anInterface8_1 == this.aClass364_6) {
				throw new RuntimeException();
			}
			this.method7443(this.aClass364_6);
			@Pc(53) Class3_Sub7_Sub2 local53 = (Class3_Sub7_Sub2) this.aClass354_41.method7689((long) (this.aClass14_Sub2_1.E() << 16 | this.aClass14_Sub2_1.u()));
			if (local53 == null) {
				local53 = new Class3_Sub7_Sub2(this, 6402, this.aClass14_Sub2_1.E(), this.aClass14_Sub2_1.u());
				@Pc(88) Class3_Sub7_Sub2 local88;
				for (this.anInt9050 += local53.anInt821; this.anInt9050 > 2097152; this.anInt9050 -= local88.anInt821) {
					local81 = this.aClass325_12.method6858();
					if (local81 == null) {
						break;
					}
					local88 = (Class3_Sub7_Sub2) local81;
					local88.method7614();
					local88.method7825();
					local88.method704();
				}
				this.aClass354_41.method7691(local53, (long) (this.aClass14_Sub2_1.E() << 16 | this.aClass14_Sub2_1.u()));
			}
			this.aClass325_12.method6856(local53);
			this.aClass364_6.method7927(local53, 8);
			this.aClass364_6.method7936(0, this.aClass14_Sub2_1.aClass24_Sub1_Sub1_2);
		} else if (this.aBoolean696) {
			@Pc(165) Class3_Sub7_Sub12 local165 = (Class3_Sub7_Sub12) this.aClass354_41.method7689((long) (this.aClass14_Sub2_1.E() << 16 | this.aClass14_Sub2_1.u()));
			if (local165 == null) {
				local165 = new Class3_Sub7_Sub12(this, this.aClass14_Sub2_1.E(), this.aClass14_Sub2_1.u());
				@Pc(201) Class3_Sub7_Sub12 local201;
				for (this.anInt9050 += local165.anInt3509 * 4; this.anInt9050 > 2097152; this.anInt9050 -= local201.anInt3509) {
					local81 = this.aClass325_12.method6858();
					if (local81 == null) {
						break;
					}
					local201 = (Class3_Sub7_Sub12) local81;
					local201.method7614();
					local201.method7825();
					this.anOpenGL2.releasePbuffer(local201.method3142());
				}
				this.aClass354_41.method7691(local165, (long) (this.aClass14_Sub2_1.E() << 16 | this.aClass14_Sub2_1.u()));
			}
			this.aClass325_12.method6856(local165);
			this.anOpenGL2.setPbuffer(local165.method3142());
		} else {
			throw new RuntimeException("");
		}
		this.anInt8994 = arg0.E();
		this.anInt9000 = arg0.u();
		this.method7519();
		this.method7509();
		this.JA();
	}

	@OriginalMember(owner = "client!vj", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass11_Sub2_3.aFloat103 + this.aClass11_Sub2_3.aFloat112 * (float) arg1 + this.aClass11_Sub2_3.aFloat111 * (float) arg0 + (float) arg2 * this.aClass11_Sub2_3.aFloat110;
		if (local28 < (float) this.anInt9081 || local28 > (float) this.anInt9080) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass11_Sub2_3.aFloat105 + this.aClass11_Sub2_3.aFloat104 * (float) arg2 + this.aClass11_Sub2_3.aFloat108 * (float) arg1 + this.aClass11_Sub2_3.aFloat114 * (float) arg0) * (float) this.anInt9066 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt9086 * (this.aClass11_Sub2_3.aFloat106 + this.aClass11_Sub2_3.aFloat109 * (float) arg1 + this.aClass11_Sub2_3.aFloat113 * (float) arg0 + this.aClass11_Sub2_3.aFloat107 * (float) arg2) / local28);
		if ((float) local85 >= this.aFloat200 && (float) local85 <= this.aFloat183 && (float) local117 >= this.aFloat199 && this.aFloat193 >= (float) local117) {
			arg3[0] = (int) ((float) local85 - this.aFloat200);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat199);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
	@Override
	public int method7392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IJ)V")
	public synchronized void method7470(@OriginalArg(1) long arg0) {
		@Pc(11) Class3 local11 = new Class3();
		local11.aLong273 = arg0;
		this.aClass112_70.method3079(local11);
	}

	@OriginalMember(owner = "client!vj", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass11_Sub2_3.aFloat110 * (float) arg2 + this.aClass11_Sub2_3.aFloat111 * (float) arg0 + this.aClass11_Sub2_3.aFloat112 * (float) arg1 + this.aClass11_Sub2_3.aFloat103;
		if ((float) this.anInt9081 > local28 || local28 > (float) this.anInt9080) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass11_Sub2_3.aFloat108 * (float) arg1 + (float) arg0 * this.aClass11_Sub2_3.aFloat114 + (float) arg2 * this.aClass11_Sub2_3.aFloat104 + this.aClass11_Sub2_3.aFloat105) * (float) this.anInt9066 / local28);
		arg3[0] = (int) ((float) local85 - this.aFloat200);
		@Pc(127) int local127 = (int) ((float) this.anInt9086 * (this.aClass11_Sub2_3.aFloat106 + (float) arg2 * this.aClass11_Sub2_3.aFloat107 + (float) arg0 * this.aClass11_Sub2_3.aFloat113 + this.aClass11_Sub2_3.aFloat109 * (float) arg1) / local28);
		arg3[1] = (int) ((float) local127 - this.aFloat199);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!qo;Z)Lclient!f;")
	@Override
	public Class14 method7398(@OriginalArg(0) Class279 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt7340 * arg0.anInt7341];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray79 == null) {
			for (local21 = 0; local21 < arg0.anInt7340; local21++) {
				for (local25 = 0; local25 < arg0.anInt7341; local25++) {
					@Pc(38) int local38 = arg0.anIntArray456[arg0.aByteArray80[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt7340; local21++) {
				for (local25 = 0; local25 < arg0.anInt7341; local25++) {
					local12[local16++] = arg0.anIntArray456[arg0.aByteArray80[local14] & 0xFF] | arg0.aByteArray79[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(122) Class14 local122 = this.method7395(local12, arg0.anInt7341, arg0.anInt7341, arg0.anInt7340);
		local122.Q(arg0.anInt7339, arg0.anInt7338, arg0.anInt7343, arg0.anInt7342);
		return local122;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!cn;I)V")
	public void method7471(@OriginalArg(0) Interface2 arg0) {
		if (arg0 != this.anInterface2_5) {
			if (this.aBoolean690) {
				OpenGL.glBindBufferARB(34963, arg0.method7528());
			}
			this.anInterface2_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!kw;Z)V")
	public void method7472(@OriginalArg(0) Class11_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method4276(), 0);
	}

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "()Z")
	@Override
	public boolean method7417() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7405(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static218.aFloat94 = arg1;
		Static314.aFloat118 = arg0;
		Static506.aFloat154 = arg2;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BFF)V")
	public void method7473(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat191 = arg0;
		this.aFloat185 = arg1;
		this.method7504();
	}

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "()V")
	@Override
	public void method7426() {
		this.aClass172_1.method4089();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!kw;I)V")
	public void method7474(@OriginalArg(0) Class11_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method4276(), 0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "()V")
	@Override
	protected void method7359() {
		for (@Pc(6) Class3 local6 = this.aClass112_63.method3088(); local6 != null; local6 = this.aClass112_63.method3084()) {
			((Class3_Sub15_Sub1) local6).method4373();
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.method4093();
		}
		if (this.anOpenGL2 != null) {
			this.method7462();
			@Pc(40) Enumeration local40 = this.aHashtable7.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable7.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean677) {
			Static133.method2618(true, false);
			this.aBoolean677 = false;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLclient!av;)V")
	public void method7475(@OriginalArg(1) Class24 arg0) {
		@Pc(15) Class24 local15 = this.aClass24Array1[this.anInt9062];
		if (local15 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local15.anInt3100);
			} else {
				if (local15 == null) {
					OpenGL.glEnable(arg0.anInt3100);
				} else if (local15.anInt3100 != arg0.anInt3100) {
					OpenGL.glDisable(local15.anInt3100);
					OpenGL.glEnable(arg0.anInt3100);
				}
				OpenGL.glBindTexture(arg0.anInt3100, arg0.method2794());
			}
			this.aClass24Array1[this.anInt9062] = arg0;
		}
		this.anInt9053 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "()Z")
	@Override
	public boolean method7406() {
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!lj;)V")
	@Override
	public void method7415(@OriginalArg(0) Class12 arg0) {
		this.aClass12_Sub2_1 = (Class12_Sub2) arg0;
	}

	@OriginalMember(owner = "client!vj", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(6) int local6 = this.anInt9089;
		this.anInt9089 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method7441();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method7465(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean683) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean683) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "()V")
	@Override
	public void method7370() {
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7414(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable7.containsKey(arg0)) {
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
			this.aHashtable7.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "(I)V")
	public void method7476() {
		if (this.anInt9053 == 2) {
			return;
		}
		this.method7495();
		this.method7481(false);
		this.method7489(false);
		this.method7461(false);
		this.method7437(false);
		this.method7505(-2);
		this.anInt9053 = 2;
	}

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "()Z")
	@Override
	public boolean method7430() {
		return this.aClass320_1.method6754();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7376(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method7418(@OriginalArg(0) Class3_Sub15 arg0) {
		this.aNativeHeap6 = ((Class3_Sub15_Sub1) arg0).aNativeHeap3;
		if (this.anInterface21_7 != null) {
			return;
		}
		@Pc(16) Class3_Sub11_Sub2 local16 = new Class3_Sub11_Sub2(80);
		if (this.aBoolean687) {
			local16.method5233(-1.0F);
			local16.method5233(-1.0F);
			local16.method5233(0.0F);
			local16.method5233(0.0F);
			local16.method5233(1.0F);
			local16.method5233(1.0F);
			local16.method5233(-1.0F);
			local16.method5233(0.0F);
			local16.method5233(1.0F);
			local16.method5233(1.0F);
			local16.method5233(1.0F);
			local16.method5233(1.0F);
			local16.method5233(0.0F);
			local16.method5233(1.0F);
			local16.method5233(0.0F);
			local16.method5233(-1.0F);
			local16.method5233(1.0F);
			local16.method5233(0.0F);
			local16.method5233(0.0F);
			local16.method5233(0.0F);
		} else {
			local16.method5234(-1.0F);
			local16.method5234(-1.0F);
			local16.method5234(0.0F);
			local16.method5234(0.0F);
			local16.method5234(1.0F);
			local16.method5234(1.0F);
			local16.method5234(-1.0F);
			local16.method5234(0.0F);
			local16.method5234(1.0F);
			local16.method5234(1.0F);
			local16.method5234(1.0F);
			local16.method5234(1.0F);
			local16.method5234(0.0F);
			local16.method5234(1.0F);
			local16.method5234(0.0F);
			local16.method5234(-1.0F);
			local16.method5234(1.0F);
			local16.method5234(0.0F);
			local16.method5234(0.0F);
			local16.method5234(0.0F);
		}
		this.anInterface21_7 = this.method7517(local16.aByteArray62, 20, false, local16.anInt6128);
		this.aClass126_15 = new Class126(this.anInterface21_7, 5126, 3, 0);
		this.aClass126_16 = new Class126(this.anInterface21_7, 5126, 2, 12);
		this.aClass21_1.method434(this);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ[BIZ)Lclient!cn;")
	public Interface2 method7477(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2) {
		return (Interface2) (this.aBoolean690 && (!arg1 || this.aBoolean703) ? new Class310_Sub1(this, 5123, arg2, arg0, arg1) : new Class111_Sub1(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)V")
	public synchronized void method7478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub17 local14 = new Class3_Sub17(arg0);
		local14.aLong273 = arg1;
		this.aClass112_65.method3079(local14);
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7410(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class3_Sub17 local19;
		while (!this.aClass112_65.method3093()) {
			local19 = (Class3_Sub17) this.aClass112_65.method3094();
			Static145.anIntArray144[local7++] = (int) local19.aLong273;
			this.anInt9051 -= local19.anInt3217;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static145.anIntArray144, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static145.anIntArray144, 0);
			local7 = 0;
		}
		while (!this.aClass112_66.method3093()) {
			local19 = (Class3_Sub17) this.aClass112_66.method3094();
			Static145.anIntArray144[local7++] = (int) local19.aLong273;
			this.anInt9049 -= local19.anInt3217;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static145.anIntArray144, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static145.anIntArray144, 0);
			local7 = 0;
		}
		while (!this.aClass112_67.method3093()) {
			local19 = (Class3_Sub17) this.aClass112_67.method3094();
			Static145.anIntArray144[local7++] = local19.anInt3217;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static145.anIntArray144, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static145.anIntArray144, 0);
			local7 = 0;
		}
		while (!this.aClass112_68.method3093()) {
			local19 = (Class3_Sub17) this.aClass112_68.method3094();
			Static145.anIntArray144[local7++] = (int) local19.aLong273;
			this.anInt9048 -= local19.anInt3217;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static145.anIntArray144, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static145.anIntArray144, 0);
		}
		while (!this.aClass112_64.method3093()) {
			local19 = (Class3_Sub17) this.aClass112_64.method3094();
			OpenGL.glDeleteLists((int) local19.aLong273, local19.anInt3217);
		}
		@Pc(215) Class3 local215;
		while (!this.aClass112_69.method3093()) {
			local215 = this.aClass112_69.method3094();
			OpenGL.glDeleteProgramARB((int) local215.aLong273);
		}
		while (!this.aClass112_70.method3093()) {
			local215 = this.aClass112_70.method3094();
			OpenGL.glDeleteObjectARB(local215.aLong273);
		}
		while (!this.aClass112_64.method3093()) {
			local19 = (Class3_Sub17) this.aClass112_64.method3094();
			OpenGL.glDeleteLists((int) local19.aLong273, local19.anInt3217);
		}
		this.aClass161_1.method3884();
		if (this.b() > 100663296 && this.aLong260 + 60000L < Static158.method2936()) {
			System.gc();
			this.aLong260 = Static158.method2936();
		}
		this.anInt9042 = local11;
	}

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt9073, this.anInt9083, this.anInt9066, this.anInt9086 };
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
	@Override
	public void method7372(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt9035 = arg0;
		this.aClass161_1.method3887();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZBI)V")
	public void method7479(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method7453(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)V")
	@Override
	public void method7411(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class14 method7390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class14_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!vj", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = (float) arg0 * this.aClass11_Sub2_3.aFloat111 + (float) arg1 * this.aClass11_Sub2_3.aFloat112 + (float) arg2 * this.aClass11_Sub2_3.aFloat110 + this.aClass11_Sub2_3.aFloat103;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = (float) arg4 * this.aClass11_Sub2_3.aFloat112 + (float) arg3 * this.aClass11_Sub2_3.aFloat111 + this.aClass11_Sub2_3.aFloat110 * (float) arg5 + this.aClass11_Sub2_3.aFloat103;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt9081 > local28 && (float) this.anInt9081 > local59 || !(!(local28 > (float) this.anInt9080) || !(local59 > (float) this.anInt9080))) {
			return false;
		}
		@Pc(123) int local123 = (int) (((float) arg0 * this.aClass11_Sub2_3.aFloat114 + (float) arg1 * this.aClass11_Sub2_3.aFloat108 + this.aClass11_Sub2_3.aFloat104 * (float) arg2 + this.aClass11_Sub2_3.aFloat105) * (float) this.anInt9066 / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt9066 * (this.aClass11_Sub2_3.aFloat105 + this.aClass11_Sub2_3.aFloat104 * (float) arg5 + this.aClass11_Sub2_3.aFloat108 * (float) arg4 + (float) arg3 * this.aClass11_Sub2_3.aFloat114) / local59);
		if (this.aFloat200 > (float) local123 && (float) local155 < this.aFloat200 || (float) local123 > this.aFloat183 && (float) local155 > this.aFloat183) {
			return false;
		} else {
			@Pc(213) int local213 = (int) (((float) arg2 * this.aClass11_Sub2_3.aFloat107 + (float) arg0 * this.aClass11_Sub2_3.aFloat113 + (float) arg1 * this.aClass11_Sub2_3.aFloat109 + this.aClass11_Sub2_3.aFloat106) * (float) this.anInt9086 / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt9086 * (this.aClass11_Sub2_3.aFloat106 + this.aClass11_Sub2_3.aFloat113 * (float) arg3 + this.aClass11_Sub2_3.aFloat109 * (float) arg4 + (float) arg5 * this.aClass11_Sub2_3.aFloat107) / local59);
			return (!((float) local213 < this.aFloat199) || !((float) local245 < this.aFloat199)) && (!(this.aFloat193 < (float) local213) || !((float) local245 > this.aFloat193));
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)V")
	public void method7481(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean701) {
			this.aBoolean701 = arg0;
			this.method7512();
			this.anInt9053 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!cn;IIII)V")
	public void method7482(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(19) int local19 = arg0.method7526();
		@Pc(26) int local26 = arg1 * this.method7506(local19);
		this.method7471(arg0);
		OpenGL.glDrawElements(4, arg2, local19, arg0.method7525() + (long) local26);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7441();
		this.method7465(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 - (float) arg1;
		if (local17 == 0.0F && local23 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(48) float local48 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local23 * local23)));
			local23 *= local48;
			local17 *= local48;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local17 + (float) arg2 + 0.35F, (float) arg3 + local23 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vj", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt9081 == arg0 && this.anInt9080 == arg1) {
			return;
		}
		this.anInt9081 = arg0;
		this.anInt9080 = arg1;
		this.method7436();
		this.method7504();
		if (this.anInt9077 == 3) {
			this.method7451();
		} else if (this.anInt9077 == 2) {
			this.method7484();
			return;
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7409(@OriginalArg(0) Canvas arg0) {
		this.aLong258 = 0L;
		this.aCanvas12 = null;
		if (arg0 == null || arg0 == this.aCanvas13) {
			this.aCanvas12 = this.aCanvas13;
			this.aLong258 = this.aLong259;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable7.get(arg0);
			this.aLong258 = local36;
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.aLong258 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong258);
		this.method7514();
	}

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "(I)V")
	private void method7484() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray100, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BILclient!jaclib/memory/Buffer;ZI)Lclient!ut;")
	public Interface21 method7485(@OriginalArg(1) int arg0, @OriginalArg(2) Buffer arg1, @OriginalArg(4) int arg2) {
		return (Interface21) (this.aBoolean690 ? new Class310_Sub2(this, arg2, arg1, arg0, false) : new Class111_Sub2(this, arg2, arg1));
	}

	@OriginalMember(owner = "client!vj", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.anInt9043 = 0;
		while (arg0 > 1) {
			this.anInt9043++;
			arg0 >>= 0x1;
		}
		this.anInt9044 = 0x1 << this.anInt9043;
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(B)V")
	private void method7486() {
		this.aClass24Array1 = new Class24[this.anInt9072];
		this.aClass24_Sub1_6 = new Class24_Sub1(this, 3553, 6408, 1, 1);
		new Class24_Sub1(this, 3553, 6408, 1, 1);
		new Class24_Sub1(this, 3553, 6408, 1, 1);
		this.aClass60_Sub2_2 = new Class60_Sub2(this);
		this.aClass60_Sub2_7 = new Class60_Sub2(this);
		this.aClass60_Sub2_1 = new Class60_Sub2(this);
		this.aClass60_Sub2_3 = new Class60_Sub2(this);
		this.aClass60_Sub2_9 = new Class60_Sub2(this);
		this.aClass60_Sub2_5 = new Class60_Sub2(this);
		this.aClass60_Sub2_8 = new Class60_Sub2(this);
		this.aClass60_Sub2_10 = new Class60_Sub2(this);
		this.aClass60_Sub2_6 = new Class60_Sub2(this);
		this.aClass60_Sub2_4 = new Class60_Sub2(this);
		if (this.aBoolean704) {
			this.aClass364_7 = new Class364(this);
			new Class364(this);
		}
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "(B)V")
	private void method7487() {
		this.method7505(-2);
		for (@Pc(14) int local14 = this.anInt9072 - 1; local14 >= 0; local14--) {
			this.method7510(local14);
			this.method7475(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method7491(8448, 8448);
		this.method7507(770, 34168, 2);
		this.method7497();
		this.anInt9054 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt9052 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean679 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean681 = true;
		this.method7481(true);
		this.method7489(true);
		this.method7461(true);
		this.method7437(true);
		this.method7519();
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
		@Pc(135) float[] local135 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(137) int local137 = 0; local137 < 8; local137++) {
			@Pc(143) int local143 = local137 + 16384;
			OpenGL.glLightfv(local143, 4608, local135, 0);
			OpenGL.glLightf(local143, 4615, 0.0F);
			OpenGL.glLightf(local143, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt9067 = this.anInt9087 = -1;
		this.JA();
	}

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "(I)I")
	private int method7488() {
		@Pc(5) int local5 = 0;
		this.aString83 = OpenGL.glGetString(7936).toLowerCase();
		this.aString84 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString83.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString83.indexOf("brian paul") != -1 || this.aString83.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static572.method7699(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static213.method6524(local53[0]);
				@Pc(69) int local69 = Static213.method6524(local53[1]);
				this.anInt9070 = local69 + local63 * 10;
			} catch (@Pc(78) NumberFormatException local78) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt9070 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(119) int[] local119 = new int[1];
		OpenGL.glGetIntegerv(34018, local119, 0);
		this.anInt9072 = local119[0];
		OpenGL.glGetIntegerv(34929, local119, 0);
		this.anInt9065 = local119[0];
		OpenGL.glGetIntegerv(34930, local119, 0);
		this.anInt9055 = local119[0];
		if (this.anInt9072 < 2 || this.anInt9065 < 2 || this.anInt9055 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean687 = Stream.c();
		this.aBoolean696 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean690 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean683 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean702 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean706 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean689 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean695 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean698 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean691 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean693 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean707 = false;
		this.aBoolean704 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean694 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean682 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean688 = this.aBoolean682 & this.aBoolean694;
		OpenGL.glGetFloatv(2834, Static258.aFloatArray81, 0);
		this.aFloat189 = Static258.aFloatArray81[0];
		this.aFloat195 = Static258.aFloatArray81[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(ZI)V")
	public void method7489(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean697 != arg0) {
			this.aBoolean697 = arg0;
			this.method7452();
			this.anInt9053 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(Z)V")
	public void method7490() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt9000 - local12 - arg1, arg2, 1, 32993, this.anInt9069, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BII)V")
	public void method7491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt9062 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(24) boolean local24 = false;
		if (arg0 != this.anInt9071) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local24 = true;
			this.anInt9071 = arg0;
		}
		if (arg1 != this.anInt9079) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local24 = true;
			this.anInt9079 = arg1;
		}
		if (local24) {
			this.anInt9053 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "()I")
	@Override
	public int method7374() {
		return 4;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!kp;)V")
	public void method7492(@OriginalArg(1) Interface8 arg0) {
		if (this.anInt9046 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt9046 >= 0) {
			this.anInterface8Array3[this.anInt9046].method7919();
		}
		this.anInterface8_1 = this.anInterface8Array3[++this.anInt9046] = arg0;
		this.anInterface8_1.method7924();
	}

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "(I)V")
	public void method7493() {
		if (this.anInt9053 == 8) {
			return;
		}
		this.method7439();
		this.method7481(true);
		this.method7461(true);
		this.method7437(true);
		this.method7465(1);
		this.anInt9053 = 8;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!kp;Z)V")
	public void method7494(@OriginalArg(0) Interface8 arg0) {
		if (this.anInt9045 < 0 || this.anInterface8Array1[this.anInt9045] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface8Array1[this.anInt9045--] = null;
		arg0.method7922();
		if (this.anInt9045 >= 0) {
			this.anInterface8_2 = this.anInterface8Array1[this.anInt9045];
			this.anInterface8_2.method7923();
		} else {
			this.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "(B)V")
	private void method7495() {
		if (this.anInt9077 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt8994 > 0 && this.anInt9000 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt8994, (double) this.anInt9000, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt9053 &= 0xFFFFFFE7;
		this.anInt9077 = 1;
	}

	@OriginalMember(owner = "client!vj", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt9088;
		arg0[3] = this.anInt9056;
		arg0[2] = this.anInt9078;
		arg0[0] = this.anInt9082;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!ho;[Lclient!qo;Z)Lclient!la;")
	@Override
	public Class54 method7394(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class279[] arg1) {
		return new Class54_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "()Lclient!aj;")
	@Override
	public Class15 method7401() {
		@Pc(7) int local7 = -1;
		if (this.aString83.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString83.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString83.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class15(local7, "OpenGL", this.anInt9070, this.aString84, 0L);
	}

	@OriginalMember(owner = "client!vj", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9066 = arg2;
		this.anInt9073 = arg0;
		this.anInt9086 = arg3;
		this.anInt9083 = arg1;
		this.method7436();
		this.method7445();
		if (this.anInt9077 == 3) {
			this.method7451();
		} else if (this.anInt9077 == 2) {
			this.method7484();
		}
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "()Z")
	@Override
	public boolean method7365() {
		if (this.aClass3_Sub5_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub5_Sub1_1.method378()) {
			if (!this.aClass172_1.method4095(this.aClass3_Sub5_Sub1_1)) {
				return false;
			}
			this.aClass161_1.method3887();
		}
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(II)I")
	public int method7496(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!qw;)V")
	@Override
	public void method7396(@OriginalArg(0) Class283 arg0) {
		this.aClass21_1.method435(arg0, -1, this);
	}

	@OriginalMember(owner = "client!vj", name = "A", descriptor = "(I)V")
	private void method7497() {
		if (this.aBoolean705) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean705 = false;
		}
	}

	@OriginalMember(owner = "client!vj", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7441();
		this.method7465(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!hea;ILclient!hea;Lclient!hea;Lclient!hea;)V")
	public void method7498(@OriginalArg(0) Class126 arg0, @OriginalArg(2) Class126 arg1, @OriginalArg(3) Class126 arg2, @OriginalArg(4) Class126 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method7499(arg0.anInterface21_2);
			OpenGL.glVertexPointer(arg0.aByte37, arg0.aShort44, this.anInterface21_6.method7593(), this.anInterface21_6.method7595() + (long) arg0.aByte36);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method7499(arg3.anInterface21_2);
			OpenGL.glNormalPointer(arg3.aShort44, this.anInterface21_6.method7593(), this.anInterface21_6.method7595() + (long) arg3.aByte36);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method7499(arg1.anInterface21_2);
			OpenGL.glColorPointer(arg1.aByte37, arg1.aShort44, this.anInterface21_6.method7593(), this.anInterface21_6.method7595() + (long) arg1.aByte36);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method7499(arg2.anInterface21_2);
			OpenGL.glTexCoordPointer(arg2.aByte37, arg2.aShort44, this.anInterface21_6.method7593(), this.anInterface21_6.method7595() + (long) arg2.aByte36);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!ef;IIII)Lclient!da;")
	@Override
	public Class60 method7419(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class60_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(IIIIII)Lclient!lj;")
	@Override
	public Class12 method7431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean691 ? new Class12_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLclient!ut;)V")
	public void method7499(@OriginalArg(1) Interface21 arg0) {
		if (this.anInterface21_6 != arg0) {
			if (this.aBoolean690) {
				OpenGL.glBindBufferARB(34962, arg0.method7594());
			}
			this.anInterface21_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(II)V")
	public void method7500(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method7491(7681, 7681);
		} else if (arg0 == 0) {
			this.method7491(8448, 8448);
		} else if (arg0 == 2) {
			this.method7491(34165, 7681);
		} else if (arg0 == 3) {
			this.method7491(260, 8448);
		} else if (arg0 == 4) {
			this.method7491(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!vj", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(41) float local41;
		if (this.aClass24_Sub1_Sub1_5 == null || arg2 > this.aClass24_Sub1_Sub1_5.anInt986 || this.aClass24_Sub1_Sub1_5.anInt983 < arg3) {
			this.aClass24_Sub1_Sub1_5 = Static58.method1203(arg6, arg2, arg3, this);
			this.aClass24_Sub1_Sub1_5.method824(false, false);
			local41 = this.aClass24_Sub1_Sub1_5.aFloat25;
			local45 = this.aClass24_Sub1_Sub1_5.aFloat26;
		} else {
			this.aClass24_Sub1_Sub1_5.method825(false, arg3, arg2, arg6, 6406);
			local41 = (float) arg2 * this.aClass24_Sub1_Sub1_5.aFloat25 / (float) this.aClass24_Sub1_Sub1_5.anInt986;
			local45 = (float) arg3 * this.aClass24_Sub1_Sub1_5.aFloat26 / (float) this.aClass24_Sub1_Sub1_5.anInt983;
		}
		this.method7476();
		this.method7475(this.aClass24_Sub1_Sub1_5);
		this.method7465(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method7458(arg5);
		this.method7491(34165, 34165);
		this.method7507(768, 34166, 0);
		this.method7507(770, 5890, 2);
		this.method7450(0, 34166);
		this.method7450(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = local150 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local45, local41);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method7507(768, 5890, 0);
		this.method7507(770, 34166, 2);
		this.method7450(0, 5890);
		this.method7450(2, 34166);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BZ)V")
	public void method7501(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean684 != arg0) {
			this.aBoolean684 = arg0;
			this.method7452();
		}
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt9082 || this.anInt9078 < arg0 - arg2 || arg1 + arg2 < this.anInt9088 || arg1 - arg2 > this.anInt9056) {
			return;
		}
		this.method7441();
		this.method7465(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(77) float local77 = (float) arg0 + 0.35F;
		@Pc(82) float local82 = (float) arg1 + 0.35F;
		@Pc(86) int local86 = arg2 << 1;
		if (this.aFloat189 > (float) local86) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local77 + 1.0F, local82 + 1.0F);
			OpenGL.glVertex2f(local77 + 1.0F, local82 - 1.0F);
			OpenGL.glVertex2f(local77 - 1.0F, -1.0F + local82);
			OpenGL.glVertex2f(local77 - 1.0F, local82 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat195 >= (float) local86) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local86);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local77, local82);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local77, local82);
			@Pc(141) int local141 = 262144 / (arg2 * 6);
			if (local141 <= 64) {
				local141 = 64;
			} else if (local141 > 512) {
				local141 = 512;
			}
			local141 = Static489.method6617(local141);
			OpenGL.glVertex2f(local77 + (float) arg2, local82);
			for (@Pc(172) int local172 = 16384 - local141; local172 > 0; local172 -= local141) {
				OpenGL.glVertex2f(local77 + Class1.aFloatArray2[local172] * (float) arg2, (float) arg2 * Class1.aFloatArray1[local172] + local82);
			}
			OpenGL.glVertex2f(local77 + (float) arg2, local82);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7367(@OriginalArg(0) Class11 arg0) {
		this.aClass11_Sub2_3.M(arg0);
		this.aClass11_Sub2_4.M(this.aClass11_Sub2_3);
		this.aClass11_Sub2_4.method4273();
		this.aClass11_Sub2_5.method4270(this.aClass11_Sub2_4);
		if (this.anInt9077 != 1) {
			this.method7516();
		}
	}

	@OriginalMember(owner = "client!vj", name = "L", descriptor = "()V")
	@Override
	public void L() {
		this.aBoolean686 = false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7399(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7386();
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)I")
	@Override
	public int method7393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!vj", name = "B", descriptor = "()Z")
	@Override
	public boolean method7433() {
		return this.aClass3_Sub5_Sub1_1 != null && (this.anInt9040 <= 1 || this.aBoolean688);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class81 method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static415.method7904(arg1, arg0, arg3, arg2, this);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!qw;I)V")
	@Override
	public void method7358(@OriginalArg(0) Class283 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_1.method435(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass172_1.method4090(arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "(B)V")
	private void method7503() {
		if (this.anInt9082 <= this.anInt9078 && this.anInt9088 <= this.anInt9056) {
			OpenGL.glScissor(this.anInt9082 + this.anInt9064, this.anInt9059 - (-this.anInt9000 - -this.anInt9056), this.anInt9078 - this.anInt9082, this.anInt9056 - this.anInt9088);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "()V")
	@Override
	public void method7368() {
		if (this.aBoolean704) {
			if (this.aClass364_6 != this.anInterface8_1) {
				throw new RuntimeException();
			}
			this.aClass364_6.method7935(0);
			this.aClass364_6.method7935(8);
			this.method7508(this.aClass364_6);
		} else if (this.aBoolean696) {
			this.aClass14_Sub2_1.da(0, 0, this.anInt8994, this.anInt9000, 0, 0);
			this.anOpenGL2.setSurface(this.aLong258);
		} else {
			throw new RuntimeException("");
		}
		this.aClass14_Sub2_1 = null;
		this.anInt8994 = this.anInt8986;
		this.anInt9000 = this.anInt9019;
		this.method7519();
		this.method7509();
		this.JA();
	}

	@OriginalMember(owner = "client!vj", name = "B", descriptor = "(I)V")
	private void method7504() {
		this.aFloat187 = (float) (this.anInt9080 - this.anInt9075) - this.aFloat191;
		this.aFloat188 = this.aFloat187 - (float) this.anInt9085 * this.aFloat185;
		if ((float) this.anInt9081 > this.aFloat188) {
			this.aFloat188 = this.anInt9081;
		}
		OpenGL.glFogf(2915, this.aFloat188);
		OpenGL.glFogf(2916, this.aFloat187);
		Static258.aFloatArray81[2] = (float) (this.anInt9087 & 0xFF) / 255.0F;
		Static258.aFloatArray81[1] = (float) (this.anInt9087 & 0xFF00) / 65280.0F;
		Static258.aFloatArray81[0] = (float) (this.anInt9087 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static258.aFloatArray81, 0);
	}

	@OriginalMember(owner = "client!vj", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt9081;
	}

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "()V")
	@Override
	public void method7420() {
		if (this.aClass3_Sub5_Sub1_1 != null && this.aClass3_Sub5_Sub1_1.method378()) {
			this.aClass172_1.method4096(this.aClass3_Sub5_Sub1_1);
			this.aClass161_1.method3887();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([I)V")
	@Override
	public void method7407(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8994;
		arg0[1] = this.anInt9000;
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "(II)V")
	public void method7505(@OriginalArg(1) int arg0) {
		this.method7479(true, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)I")
	public int method7506(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(IIII)V")
	public void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "C", descriptor = "()Z")
	@Override
	public boolean method7435() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(ILclient!kp;)V")
	public void method7508(@OriginalArg(1) Interface8 arg0) {
		if (this.aBoolean694) {
			this.method7494(arg0);
			this.method7513(arg0);
		} else if (this.anInt9047 >= 0 && arg0 == this.anInterface8Array2[this.anInt9047]) {
			this.anInterface8Array2[this.anInt9047--] = null;
			arg0.method7920();
			if (this.anInt9047 >= 0) {
				this.anInterface8_2 = this.anInterface8_1 = this.anInterface8Array2[this.anInt9047];
				this.anInterface8_2.method7921();
			} else {
				this.anInterface8_2 = this.anInterface8_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "(B)V")
	private void method7509() {
		OpenGL.glViewport(this.anInt9064, this.anInt9059, this.anInt8994, this.anInt9000);
	}

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "()Lclient!q;")
	@Override
	public Class11 method7422() {
		return new Class11_Sub2();
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(BI)V")
	public void method7510(@OriginalArg(1) int arg0) {
		if (this.anInt9062 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt9062 = arg0;
		}
	}

	@OriginalMember(owner = "client!vj", name = "C", descriptor = "(I)V")
	public void method7511() {
		if (this.anInt9053 == 16) {
			return;
		}
		this.method7469();
		this.method7481(true);
		this.method7461(true);
		this.method7437(true);
		this.method7465(1);
		this.anInt9053 = 16;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(Z)V")
	private void method7512() {
		if (this.aBoolean701 && this.anInt9085 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(ILclient!kp;)V")
	public void method7513(@OriginalArg(1) Interface8 arg0) {
		if (this.anInt9046 < 0 || arg0 != this.anInterface8Array3[this.anInt9046]) {
			throw new RuntimeException();
		}
		this.anInterface8Array3[this.anInt9046--] = null;
		arg0.method7919();
		if (this.anInt9046 >= 0) {
			this.anInterface8_1 = this.anInterface8Array3[this.anInt9046];
			this.anInterface8_1.method7924();
		} else {
			this.anInterface8_1 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!lj;Lclient!lj;FLclient!lj;)Lclient!lj;")
	@Override
	public Class12 method7381(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class12 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean691 && this.aBoolean704) {
			@Pc(15) Class12_Sub2_Sub1 local15 = null;
			@Pc(18) Class12_Sub2 local18 = (Class12_Sub2) arg0;
			@Pc(21) Class12_Sub2 local21 = (Class12_Sub2) arg1;
			@Pc(25) Class24_Sub3 local25 = local18.method3734();
			@Pc(29) Class24_Sub3 local29 = local21.method3734();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt3022 < local25.anInt3022 ? local25.anInt3022 : local29.anInt3022;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class12_Sub2_Sub1) {
					@Pc(56) Class12_Sub2_Sub1 local56 = (Class12_Sub2_Sub1) arg3;
					if (local56.method1199() == local44) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class12_Sub2_Sub1(this, local44);
				}
				if (local15.method1198(arg2, local29, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!vj", name = "D", descriptor = "(I)V")
	private void method7514() {
		if (this.aCanvas12 == null) {
			this.anInt8986 = this.anInt9019 = 0;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas12.getSize();
			this.anInt9019 = local14.height;
			this.anInt8986 = local14.width;
		}
		if (this.anInterface8_1 == null) {
			this.anInt8994 = this.anInt8986;
			this.anInt9000 = this.anInt9019;
			this.method7509();
		}
		this.method7519();
		this.JA();
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt9051 + this.anInt9049 + this.anInt9048;
	}

	@OriginalMember(owner = "client!vj", name = "E", descriptor = "(I)V")
	private void method7516() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass11_Sub2_4.method4276(), 0);
		if (this.aBoolean685) {
			this.aClass320_1.aClass46_Sub5_1.method3331();
		}
		this.method7454();
		this.method7447();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([BIBZI)Lclient!ut;")
	public Interface21 method7517(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		return (Interface21) (this.aBoolean690 && (!arg2 || this.aBoolean703) ? new Class310_Sub2(this, arg1, arg0, arg3, arg2) : new Class111_Sub2(this, arg1, arg0, arg3));
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7378() {
		this.method7441();
		this.method7465(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(III)V")
	public synchronized void method7518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub17 local8 = new Class3_Sub17(arg1);
		local8.aLong273 = arg0;
		this.aClass112_66.method3079(local8);
	}

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "(B)V")
	public void method7519() {
		if (this.anInt9077 != 0) {
			this.anInt9077 = 0;
			this.anInt9053 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(III)V")
	public void method7520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9064 = arg1;
		this.anInt9059 = arg0;
		this.method7509();
		this.method7503();
	}
}
