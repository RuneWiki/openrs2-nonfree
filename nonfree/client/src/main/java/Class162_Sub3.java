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

@OriginalClass("client!uca")
public final class Class162_Sub3 extends Class162 {

	@OriginalMember(owner = "client!uca", name = "B", descriptor = "I")
	private int anInt8508;

	@OriginalMember(owner = "client!uca", name = "Cb", descriptor = "I")
	private int anInt8556;

	@OriginalMember(owner = "client!uca", name = "Nc", descriptor = "I")
	public int anInt8616;

	@OriginalMember(owner = "client!uca", name = "fd", descriptor = "I")
	public int anInt8634;

	@OriginalMember(owner = "client!uca", name = "me", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!uca", name = "oe", descriptor = "I")
	public int anInt8686;

	@OriginalMember(owner = "client!uca", name = "ue", descriptor = "Lclient!mp;")
	private Class38_Sub3 aClass38_Sub3_1;

	@OriginalMember(owner = "client!uca", name = "we", descriptor = "Lclient!tr;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!uca", name = "ye", descriptor = "Lclient!tr;")
	private Interface22 anInterface22_2;

	@OriginalMember(owner = "client!uca", name = "Be", descriptor = "Lclient!ffa;")
	private Class105 aClass105_6;

	@OriginalMember(owner = "client!uca", name = "Ge", descriptor = "I")
	public int anInt8691;

	@OriginalMember(owner = "client!uca", name = "He", descriptor = "I")
	private int anInt8692;

	@OriginalMember(owner = "client!uca", name = "Ie", descriptor = "I")
	public int anInt8693;

	@OriginalMember(owner = "client!uca", name = "Je", descriptor = "I")
	private int anInt8694;

	@OriginalMember(owner = "client!uca", name = "Qe", descriptor = "I")
	private int anInt8695;

	@OriginalMember(owner = "client!uca", name = "Re", descriptor = "I")
	private int anInt8696;

	@OriginalMember(owner = "client!uca", name = "Se", descriptor = "Z")
	private boolean aBoolean716;

	@OriginalMember(owner = "client!uca", name = "Te", descriptor = "I")
	private int anInt8697;

	@OriginalMember(owner = "client!uca", name = "Ve", descriptor = "Z")
	private boolean aBoolean717;

	@OriginalMember(owner = "client!uca", name = "We", descriptor = "Z")
	private boolean aBoolean718;

	@OriginalMember(owner = "client!uca", name = "Xe", descriptor = "J")
	private long aLong242;

	@OriginalMember(owner = "client!uca", name = "Ye", descriptor = "Z")
	private boolean aBoolean719;

	@OriginalMember(owner = "client!uca", name = "cf", descriptor = "Z")
	public boolean aBoolean720;

	@OriginalMember(owner = "client!uca", name = "gf", descriptor = "I")
	private int anInt8698;

	@OriginalMember(owner = "client!uca", name = "hf", descriptor = "Z")
	private boolean aBoolean722;

	@OriginalMember(owner = "client!uca", name = "jf", descriptor = "I")
	private int anInt8699;

	@OriginalMember(owner = "client!uca", name = "of", descriptor = "Z")
	public boolean aBoolean723;

	@OriginalMember(owner = "client!uca", name = "rf", descriptor = "Z")
	public boolean aBoolean724;

	@OriginalMember(owner = "client!uca", name = "sf", descriptor = "Lclient!re;")
	private Interface21 anInterface21_5;

	@OriginalMember(owner = "client!uca", name = "tf", descriptor = "Lclient!tda;")
	public Class33_Sub3 aClass33_Sub3_1;

	@OriginalMember(owner = "client!uca", name = "vf", descriptor = "Lclient!tda;")
	public Class33_Sub3 aClass33_Sub3_2;

	@OriginalMember(owner = "client!uca", name = "yf", descriptor = "Ljava/lang/String;")
	private String aString128;

	@OriginalMember(owner = "client!uca", name = "zf", descriptor = "Lclient!gv;")
	public Class133 aClass133_11;

	@OriginalMember(owner = "client!uca", name = "Bf", descriptor = "Lclient!tda;")
	public Class33_Sub3 aClass33_Sub3_3;

	@OriginalMember(owner = "client!uca", name = "Cf", descriptor = "F")
	public float aFloat216;

	@OriginalMember(owner = "client!uca", name = "Ef", descriptor = "I")
	private int anInt8705;

	@OriginalMember(owner = "client!uca", name = "Gf", descriptor = "Lclient!tda;")
	public Class33_Sub3 aClass33_Sub3_4;

	@OriginalMember(owner = "client!uca", name = "Hf", descriptor = "Z")
	public boolean aBoolean725;

	@OriginalMember(owner = "client!uca", name = "Jf", descriptor = "F")
	public float aFloat219;

	@OriginalMember(owner = "client!uca", name = "Mf", descriptor = "Z")
	private boolean aBoolean726;

	@OriginalMember(owner = "client!uca", name = "Nf", descriptor = "Lclient!tda;")
	public Class33_Sub3 aClass33_Sub3_5;

	@OriginalMember(owner = "client!uca", name = "Of", descriptor = "I")
	private int anInt8708;

	@OriginalMember(owner = "client!uca", name = "Pf", descriptor = "Z")
	public boolean aBoolean727;

	@OriginalMember(owner = "client!uca", name = "Qf", descriptor = "Z")
	public boolean aBoolean728;

	@OriginalMember(owner = "client!uca", name = "Sf", descriptor = "Lclient!fba;")
	private Interface10 anInterface10_5;

	@OriginalMember(owner = "client!uca", name = "Tf", descriptor = "Z")
	private boolean aBoolean729;

	@OriginalMember(owner = "client!uca", name = "Vf", descriptor = "Lclient!tda;")
	public Class33_Sub3 aClass33_Sub3_6;

	@OriginalMember(owner = "client!uca", name = "Yf", descriptor = "Lclient!tda;")
	public Class33_Sub3 aClass33_Sub3_7;

	@OriginalMember(owner = "client!uca", name = "ag", descriptor = "I")
	public int anInt8710;

	@OriginalMember(owner = "client!uca", name = "cg", descriptor = "Z")
	private boolean aBoolean731;

	@OriginalMember(owner = "client!uca", name = "dg", descriptor = "I")
	public int anInt8712;

	@OriginalMember(owner = "client!uca", name = "eg", descriptor = "F")
	private float aFloat223;

	@OriginalMember(owner = "client!uca", name = "fg", descriptor = "Lclient!ei;")
	private Class3_Sub1_Sub1 aClass3_Sub1_Sub1_4;

	@OriginalMember(owner = "client!uca", name = "gg", descriptor = "F")
	private float aFloat224;

	@OriginalMember(owner = "client!uca", name = "hg", descriptor = "Lclient!tda;")
	public Class33_Sub3 aClass33_Sub3_8;

	@OriginalMember(owner = "client!uca", name = "kg", descriptor = "Lclient!tda;")
	public Class33_Sub3 aClass33_Sub3_9;

	@OriginalMember(owner = "client!uca", name = "mg", descriptor = "F")
	public float aFloat225;

	@OriginalMember(owner = "client!uca", name = "ng", descriptor = "I")
	private int anInt8715;

	@OriginalMember(owner = "client!uca", name = "pg", descriptor = "Lclient!gv;")
	public Class133 aClass133_12;

	@OriginalMember(owner = "client!uca", name = "rg", descriptor = "Z")
	private boolean aBoolean733;

	@OriginalMember(owner = "client!uca", name = "vg", descriptor = "Lclient!ffa;")
	public Class105 aClass105_7;

	@OriginalMember(owner = "client!uca", name = "zg", descriptor = "Lclient!fw;")
	private Class17_Sub1 aClass17_Sub1_1;

	@OriginalMember(owner = "client!uca", name = "Cg", descriptor = "Lclient!fba;")
	private Interface10 anInterface10_6;

	@OriginalMember(owner = "client!uca", name = "Dg", descriptor = "Z")
	public boolean aBoolean737;

	@OriginalMember(owner = "client!uca", name = "Eg", descriptor = "Lclient!tda;")
	public Class33_Sub3 aClass33_Sub3_10;

	@OriginalMember(owner = "client!uca", name = "Fg", descriptor = "Z")
	public boolean aBoolean738;

	@OriginalMember(owner = "client!uca", name = "Gg", descriptor = "I")
	private int anInt8719;

	@OriginalMember(owner = "client!uca", name = "Hg", descriptor = "Ljava/lang/String;")
	private String aString129;

	@OriginalMember(owner = "client!uca", name = "Ig", descriptor = "I")
	public int anInt8720;

	@OriginalMember(owner = "client!uca", name = "Jg", descriptor = "Z")
	public boolean aBoolean739;

	@OriginalMember(owner = "client!uca", name = "Kg", descriptor = "Z")
	private boolean aBoolean740;

	@OriginalMember(owner = "client!uca", name = "Lg", descriptor = "F")
	public float aFloat228;

	@OriginalMember(owner = "client!uca", name = "Pg", descriptor = "I")
	private int anInt8723;

	@OriginalMember(owner = "client!uca", name = "Qg", descriptor = "F")
	public float aFloat229;

	@OriginalMember(owner = "client!uca", name = "Vg", descriptor = "Z")
	private boolean aBoolean743;

	@OriginalMember(owner = "client!uca", name = "Xg", descriptor = "F")
	public float aFloat230;

	@OriginalMember(owner = "client!uca", name = "Yg", descriptor = "F")
	private float aFloat231;

	@OriginalMember(owner = "client!uca", name = "Zg", descriptor = "I")
	private int anInt8727;

	@OriginalMember(owner = "client!uca", name = "bh", descriptor = "I")
	public int anInt8729;

	@OriginalMember(owner = "client!uca", name = "eh", descriptor = "Lclient!aaa;")
	public Class3_Sub1 aClass3_Sub1_5;

	@OriginalMember(owner = "client!uca", name = "gh", descriptor = "[Lclient!vaa;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!uca", name = "lh", descriptor = "I")
	private int anInt8731;

	@OriginalMember(owner = "client!uca", name = "nh", descriptor = "I")
	private int anInt8732;

	@OriginalMember(owner = "client!uca", name = "Rb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!uca", name = "je", descriptor = "I")
	public int anInt8684 = 128;

	@OriginalMember(owner = "client!uca", name = "Wd", descriptor = "Lclient!dt;")
	private final Class81 aClass81_1 = new Class81();

	@OriginalMember(owner = "client!uca", name = "ke", descriptor = "Lclient!bb;")
	private final Class25_Sub1 aClass25_Sub1_1 = new Class25_Sub1();

	@OriginalMember(owner = "client!uca", name = "le", descriptor = "Lclient!bb;")
	public final Class25_Sub1 aClass25_Sub1_2 = new Class25_Sub1();

	@OriginalMember(owner = "client!uca", name = "ne", descriptor = "I")
	public int anInt8685 = 3;

	@OriginalMember(owner = "client!uca", name = "qe", descriptor = "I")
	public int anInt8687 = 8;

	@OriginalMember(owner = "client!uca", name = "se", descriptor = "Z")
	private boolean aBoolean715 = false;

	@OriginalMember(owner = "client!uca", name = "re", descriptor = "Lclient!dc;")
	private final Class70 aClass70_59 = new Class70();

	@OriginalMember(owner = "client!uca", name = "te", descriptor = "I")
	private int anInt8688 = -1;

	@OriginalMember(owner = "client!uca", name = "xe", descriptor = "I")
	private int anInt8689 = -1;

	@OriginalMember(owner = "client!uca", name = "Ae", descriptor = "[Lclient!tr;")
	private final Interface22[] anInterface22Array2 = new Interface22[4];

	@OriginalMember(owner = "client!uca", name = "ze", descriptor = "[Lclient!tr;")
	private final Interface22[] anInterface22Array1 = new Interface22[4];

	@OriginalMember(owner = "client!uca", name = "Ce", descriptor = "[Lclient!tr;")
	private final Interface22[] anInterface22Array3 = new Interface22[4];

	@OriginalMember(owner = "client!uca", name = "De", descriptor = "I")
	private int anInt8690 = -1;

	@OriginalMember(owner = "client!uca", name = "ve", descriptor = "Lclient!oga;")
	private final Class253 aClass253_10 = new Class253();

	@OriginalMember(owner = "client!uca", name = "Ee", descriptor = "Lclient!efa;")
	private final Class90 aClass90_38 = new Class90(16);

	@OriginalMember(owner = "client!uca", name = "Fe", descriptor = "Lclient!dc;")
	private final Class70 aClass70_60 = new Class70();

	@OriginalMember(owner = "client!uca", name = "Ke", descriptor = "Lclient!dc;")
	private final Class70 aClass70_61 = new Class70();

	@OriginalMember(owner = "client!uca", name = "Le", descriptor = "Lclient!dc;")
	private final Class70 aClass70_62 = new Class70();

	@OriginalMember(owner = "client!uca", name = "Me", descriptor = "Lclient!dc;")
	private final Class70 aClass70_63 = new Class70();

	@OriginalMember(owner = "client!uca", name = "Ne", descriptor = "Lclient!dc;")
	private final Class70 aClass70_64 = new Class70();

	@OriginalMember(owner = "client!uca", name = "Oe", descriptor = "Lclient!dc;")
	private final Class70 aClass70_65 = new Class70();

	@OriginalMember(owner = "client!uca", name = "Pe", descriptor = "Lclient!dc;")
	private final Class70 aClass70_66 = new Class70();

	@OriginalMember(owner = "client!uca", name = "Ue", descriptor = "Lclient!bb;")
	public final Class25_Sub1 aClass25_Sub1_3 = new Class25_Sub1();

	@OriginalMember(owner = "client!uca", name = "Ze", descriptor = "Lclient!bb;")
	public final Class25_Sub1 aClass25_Sub1_4 = new Class25_Sub1();

	@OriginalMember(owner = "client!uca", name = "af", descriptor = "Lclient!bb;")
	public final Class25_Sub1 aClass25_Sub1_5 = new Class25_Sub1();

	@OriginalMember(owner = "client!uca", name = "kf", descriptor = "I")
	public int anInt8700 = 0;

	@OriginalMember(owner = "client!uca", name = "ff", descriptor = "F")
	private float aFloat212 = -1.0F;

	@OriginalMember(owner = "client!uca", name = "nf", descriptor = "F")
	private float aFloat213 = -1.0F;

	@OriginalMember(owner = "client!uca", name = "pf", descriptor = "F")
	public float aFloat214 = 1.0F;

	@OriginalMember(owner = "client!uca", name = "Uf", descriptor = "F")
	public float aFloat220 = 3584.0F;

	@OriginalMember(owner = "client!uca", name = "Ff", descriptor = "F")
	public float aFloat218 = 1.0F;

	@OriginalMember(owner = "client!uca", name = "df", descriptor = "F")
	public float aFloat211 = 1.0F;

	@OriginalMember(owner = "client!uca", name = "If", descriptor = "[F")
	private final float[] aFloatArray68 = new float[16];

	@OriginalMember(owner = "client!uca", name = "bg", descriptor = "I")
	private int anInt8711 = 0;

	@OriginalMember(owner = "client!uca", name = "bf", descriptor = "I")
	public int bf = 512;

	@OriginalMember(owner = "client!uca", name = "lg", descriptor = "[F")
	private final float[] aFloatArray69 = new float[4];

	@OriginalMember(owner = "client!uca", name = "Wf", descriptor = "F")
	private float aFloat221 = 1.0F;

	@OriginalMember(owner = "client!uca", name = "lf", descriptor = "I")
	public int anInt8701 = -1;

	@OriginalMember(owner = "client!uca", name = "tg", descriptor = "Z")
	private boolean aBoolean734 = false;

	@OriginalMember(owner = "client!uca", name = "ug", descriptor = "I")
	public int anInt8717 = 0;

	@OriginalMember(owner = "client!uca", name = "Kf", descriptor = "I")
	private int anInt8706 = 0;

	@OriginalMember(owner = "client!uca", name = "wg", descriptor = "[Lclient!tg;")
	private final Class2_Sub11[] aClass2_Sub11Array5 = new Class2_Sub11[Static498.anInt7931];

	@OriginalMember(owner = "client!uca", name = "Rf", descriptor = "I")
	private int anInt8709 = 0;

	@OriginalMember(owner = "client!uca", name = "Df", descriptor = "F")
	private float aFloat217 = 0.0F;

	@OriginalMember(owner = "client!uca", name = "qg", descriptor = "F")
	public float aFloat226 = -1.0F;

	@OriginalMember(owner = "client!uca", name = "sg", descriptor = "I")
	private int anInt8716 = 3584;

	@OriginalMember(owner = "client!uca", name = "jg", descriptor = "I")
	private int anInt8714 = -1;

	@OriginalMember(owner = "client!uca", name = "Zf", descriptor = "F")
	public float aFloat222 = -1.0F;

	@OriginalMember(owner = "client!uca", name = "Af", descriptor = "I")
	public int anInt8704 = -1;

	@OriginalMember(owner = "client!uca", name = "xf", descriptor = "I")
	public int anInt8703 = 50;

	@OriginalMember(owner = "client!uca", name = "ig", descriptor = "I")
	private int anInt8713 = 8448;

	@OriginalMember(owner = "client!uca", name = "Bg", descriptor = "I")
	private int anInt8718 = 0;

	@OriginalMember(owner = "client!uca", name = "Ag", descriptor = "F")
	private float aFloat227 = 1.0F;

	@OriginalMember(owner = "client!uca", name = "Lf", descriptor = "I")
	public int anInt8707 = 0;

	@OriginalMember(owner = "client!uca", name = "wf", descriptor = "[F")
	private final float[] aFloatArray67 = new float[4];

	@OriginalMember(owner = "client!uca", name = "Mg", descriptor = "I")
	public int anInt8721 = -1;

	@OriginalMember(owner = "client!uca", name = "Rg", descriptor = "I")
	private int anInt8724 = 0;

	@OriginalMember(owner = "client!uca", name = "Ng", descriptor = "I")
	private int anInt8722 = 0;

	@OriginalMember(owner = "client!uca", name = "Og", descriptor = "[F")
	public final float[] aFloatArray70 = new float[4];

	@OriginalMember(owner = "client!uca", name = "Ug", descriptor = "Z")
	private boolean aBoolean742 = true;

	@OriginalMember(owner = "client!uca", name = "ch", descriptor = "I")
	public int anInt8730 = -1;

	@OriginalMember(owner = "client!uca", name = "Wg", descriptor = "I")
	private int anInt8726 = 8448;

	@OriginalMember(owner = "client!uca", name = "uf", descriptor = "F")
	public float aFloat215 = 3584.0F;

	@OriginalMember(owner = "client!uca", name = "ah", descriptor = "I")
	public int anInt8728 = 512;

	@OriginalMember(owner = "client!uca", name = "Tg", descriptor = "I")
	public int anInt8725 = 0;

	@OriginalMember(owner = "client!uca", name = "fh", descriptor = "[F")
	private final float[] aFloatArray71 = new float[4];

	@OriginalMember(owner = "client!uca", name = "qf", descriptor = "Lclient!bca;")
	public Class2_Sub7_Sub1 aClass2_Sub7_Sub1_3 = new Class2_Sub7_Sub1(8192);

	@OriginalMember(owner = "client!uca", name = "ih", descriptor = "[I")
	public int[] anIntArray569 = new int[1];

	@OriginalMember(owner = "client!uca", name = "jh", descriptor = "[I")
	public int[] anIntArray570 = new int[1];

	@OriginalMember(owner = "client!uca", name = "mh", descriptor = "[I")
	public int[] anIntArray571 = new int[1];

	@OriginalMember(owner = "client!uca", name = "kh", descriptor = "[B")
	public final byte[] aByteArray93 = new byte[16384];

	@OriginalMember(owner = "client!uca", name = "ae", descriptor = "I")
	public final int anInt8678;

	@OriginalMember(owner = "client!uca", name = "Lc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas13;

	@OriginalMember(owner = "client!uca", name = "vb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!uca", name = "yb", descriptor = "Lclient!jaggl/OpenGL;")
	public OpenGL anOpenGL2;

	@OriginalMember(owner = "client!uca", name = "pb", descriptor = "J")
	private final long aLong240;

	@OriginalMember(owner = "client!uca", name = "Ob", descriptor = "J")
	private long aLong241;

	@OriginalMember(owner = "client!uca", name = "mf", descriptor = "I")
	public final int anInt8702;

	@OriginalMember(owner = "client!uca", name = "hh", descriptor = "Z")
	public boolean aBoolean745;

	@OriginalMember(owner = "client!uca", name = "yg", descriptor = "Z")
	private boolean aBoolean736;

	@OriginalMember(owner = "client!uca", name = "Xf", descriptor = "Z")
	public boolean aBoolean730;

	@OriginalMember(owner = "client!uca", name = "xg", descriptor = "Z")
	public boolean aBoolean735;

	@OriginalMember(owner = "client!uca", name = "dh", descriptor = "Z")
	public boolean aBoolean744;

	@OriginalMember(owner = "client!uca", name = "Sg", descriptor = "Z")
	private boolean aBoolean741;

	@OriginalMember(owner = "client!uca", name = "ef", descriptor = "Z")
	public boolean aBoolean721;

	@OriginalMember(owner = "client!uca", name = "og", descriptor = "Z")
	private final boolean aBoolean732;

	@OriginalMember(owner = "client!uca", name = "Vd", descriptor = "Lclient!tfa;")
	private final Class325 aClass325_1;

	@OriginalMember(owner = "client!uca", name = "pe", descriptor = "Lclient!jn;")
	public final Class178 aClass178_1;

	@OriginalMember(owner = "client!uca", name = "ge", descriptor = "Lclient!oa;")
	private final Class248 aClass248_1;

	@OriginalMember(owner = "client!uca", name = "ce", descriptor = "Lclient!ki;")
	private Class2_Sub15_Sub1 aClass2_Sub15_Sub1_1;

	@OriginalMember(owner = "client!uca", name = "ie", descriptor = "Lclient!rga;")
	private final Class298 aClass298_1;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;I)V")
	public Class162_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		this.anInt8678 = arg2;
		this.aCanvas12 = this.aCanvas13 = arg0;
		if (!Static560.method7324("jaclib")) {
			throw new RuntimeException("");
		} else if (Static560.method7324("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong241 = this.aLong240 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt8678);
				if (this.aLong240 == 0L) {
					throw new RuntimeException("");
				}
				this.method6933();
				@Pc(339) int local339 = this.method6948();
				if (local339 != 0) {
					throw new RuntimeException("");
				}
				this.anInt8702 = this.aBoolean720 ? 33639 : 5121;
				if (this.aString129.indexOf("radeon") != -1) {
					@Pc(366) int local366 = 0;
					@Pc(368) boolean local368 = false;
					@Pc(370) boolean local370 = false;
					@Pc(379) String[] local379 = Static439.method5762(this.aString129.replace('/', ' '), ' ');
					for (@Pc(381) int local381 = 0; local381 < local379.length; local381++) {
						@Pc(387) String local387 = local379[local381];
						try {
							if (local387.length() > 0) {
								if (local387.charAt(0) == 'x' && local387.length() >= 3 && Static531.method6990(local387.substring(1, 3))) {
									local387 = local387.substring(1);
									local370 = true;
								}
								if (local387.equals("hd")) {
									local368 = true;
								} else {
									if (local387.startsWith("hd")) {
										local368 = true;
										local387 = local387.substring(2);
									}
									if (local387.length() >= 4 && Static531.method6990(local387.substring(0, 4))) {
										local366 = Static559.method7310(local387.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(455) Exception local455) {
						}
					}
					if (!local370 && !local368) {
						if (local366 >= 7000 && local366 <= 9250) {
							this.aBoolean745 = false;
						}
						if (local366 >= 7000 && local366 <= 7999) {
							this.aBoolean736 = false;
						}
					}
					if (!local368 || local366 < 4000) {
						this.aBoolean730 = false;
					}
					this.aBoolean735 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean744 = true;
					this.aBoolean741 = this.aBoolean736;
				}
				if (this.aString128.indexOf("intel") != -1) {
					this.aBoolean721 = false;
				}
				this.aBoolean732 = !this.aString128.equals("s3 graphics");
				if (this.aBoolean736) {
					try {
						@Pc(544) int[] local544 = new int[1];
						OpenGL.glGenBuffersARB(1, local544, 0);
					} catch (@Pc(550) Throwable local550) {
						throw new RuntimeException("");
					}
				}
				Static50.method866(true, false);
				this.aBoolean715 = true;
				this.aClass325_1 = new Class325(this, super.anInterface9_10);
				this.method6891();
				this.aClass178_1 = new Class178(this);
				this.aClass248_1 = new Class248(this);
				if (this.aClass248_1.method5212()) {
					this.aClass2_Sub15_Sub1_1 = new Class2_Sub15_Sub1(this);
					if (!this.aClass2_Sub15_Sub1_1.method4044()) {
						this.aClass2_Sub15_Sub1_1.method4038();
						this.aClass2_Sub15_Sub1_1 = null;
					}
				}
				this.aClass298_1 = new Class298(this);
				this.method6935();
				this.method6917();
				this.method6832();
			} catch (@Pc(624) Throwable local624) {
				local624.printStackTrace();
				this.method6875();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)V")
	public synchronized void method6890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub44 local16 = new Class2_Sub44(arg0);
		local16.aLong268 = arg1;
		this.aClass70_61.method1269(local16);
	}

	@OriginalMember(owner = "client!uca", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6930();
		this.method6923(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)Lclient!e;")
	@Override
	public Class2_Sub12 method6820(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub12_Sub2 local8 = new Class2_Sub12_Sub2(arg0);
		this.aClass70_59.method1269(local8);
		return local8;
	}

	@OriginalMember(owner = "client!uca", name = "k", descriptor = "()V")
	@Override
	public void method6842() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class84 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class84_Sub3 local6 = (Class84_Sub3) arg5;
		@Pc(9) Class3_Sub1_Sub1 local9 = local6.aClass3_Sub1_Sub1_1;
		this.method6950();
		this.method6911(local6.aClass3_Sub1_Sub1_1);
		this.method6923(1);
		this.method6903(7681, 8448);
		this.method6957(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat53 / (float) local9.anInt2079;
		@Pc(46) float local46 = local9.aFloat52 / (float) local9.anInt2081;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local52 * local52)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(91) float local91 = local52 * local72;
		@Pc(95) float local95 = local59 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f(local91 + (float) arg2 + 0.35F, local95 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method6957(5890, 768, 0);
	}

	@OriginalMember(owner = "client!uca", name = "g", descriptor = "(I)V")
	private void method6891() {
		this.aClass3Array1 = new Class3[this.anInt8729];
		this.aClass3_Sub1_5 = new Class3_Sub1(this, 3553, 6408, 1, 1);
		new Class3_Sub1(this, 3553, 6408, 1, 1);
		new Class3_Sub1(this, 3553, 6408, 1, 1);
		this.aClass33_Sub3_5 = new Class33_Sub3(this);
		this.aClass33_Sub3_10 = new Class33_Sub3(this);
		this.aClass33_Sub3_7 = new Class33_Sub3(this);
		this.aClass33_Sub3_1 = new Class33_Sub3(this);
		this.aClass33_Sub3_8 = new Class33_Sub3(this);
		this.aClass33_Sub3_6 = new Class33_Sub3(this);
		this.aClass33_Sub3_4 = new Class33_Sub3(this);
		this.aClass33_Sub3_2 = new Class33_Sub3(this);
		this.aClass33_Sub3_9 = new Class33_Sub3(this);
		this.aClass33_Sub3_3 = new Class33_Sub3(this);
		if (this.aBoolean721) {
			this.aClass105_7 = new Class105(this);
			new Class105(this);
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(FZ)V")
	public void method6893(@OriginalArg(0) float arg0) {
		if (this.aFloat227 == arg0) {
			return;
		}
		this.aFloat227 = arg0;
		if (this.anInt8705 == 3) {
			this.method6925();
			return;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILclient!tr;)V")
	public void method6894(@OriginalArg(1) Interface22 arg0) {
		if (this.anInt8689 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8689 >= 0) {
			this.anInterface22Array2[this.anInt8689].method1938();
		}
		this.anInterface22_1 = this.anInterface22Array2[++this.anInt8689] = arg0;
		this.anInterface22_1.method1937();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZZ)V")
	public void method6895(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean717) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean717 = arg0;
		this.anInt8696 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BZ)V")
	public void method6896(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean716) {
			this.aBoolean716 = arg0;
			this.method6915();
			this.anInt8696 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!tr;I)V")
	public void method6897(@OriginalArg(0) Interface22 arg0) {
		if (this.aBoolean727) {
			this.method6901(arg0);
			this.method6927(arg0);
		} else if (this.anInt8688 >= 0 && this.anInterface22Array1[this.anInt8688] == arg0) {
			this.anInterface22Array1[this.anInt8688--] = null;
			arg0.method1935();
			if (this.anInt8688 < 0) {
				this.anInterface22_1 = this.anInterface22_2 = null;
			} else {
				this.anInterface22_1 = this.anInterface22_2 = this.anInterface22Array1[this.anInt8688];
				this.anInterface22_1.method1934();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "()Z")
	@Override
	public boolean method6822() {
		return false;
	}

	@OriginalMember(owner = "client!uca", name = "r", descriptor = "()Z")
	@Override
	public boolean method6856() {
		return this.aClass2_Sub15_Sub1_1 != null && (this.anInt8678 <= 1 || this.aBoolean726);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6836(@OriginalArg(0) Class2_Sub12 arg0) {
		this.aNativeHeap6 = ((Class2_Sub12_Sub2) arg0).aNativeHeap4;
		if (this.anInterface10_5 != null) {
			return;
		}
		@Pc(16) Class2_Sub7_Sub1 local16 = new Class2_Sub7_Sub1(80);
		if (this.aBoolean720) {
			local16.method546(-1.0F);
			local16.method546(-1.0F);
			local16.method546(0.0F);
			local16.method546(0.0F);
			local16.method546(1.0F);
			local16.method546(1.0F);
			local16.method546(-1.0F);
			local16.method546(0.0F);
			local16.method546(1.0F);
			local16.method546(1.0F);
			local16.method546(1.0F);
			local16.method546(1.0F);
			local16.method546(0.0F);
			local16.method546(1.0F);
			local16.method546(0.0F);
			local16.method546(-1.0F);
			local16.method546(1.0F);
			local16.method546(0.0F);
			local16.method546(0.0F);
			local16.method546(0.0F);
		} else {
			local16.method545(-1.0F);
			local16.method545(-1.0F);
			local16.method545(0.0F);
			local16.method545(0.0F);
			local16.method545(1.0F);
			local16.method545(1.0F);
			local16.method545(-1.0F);
			local16.method545(0.0F);
			local16.method545(1.0F);
			local16.method545(1.0F);
			local16.method545(1.0F);
			local16.method545(1.0F);
			local16.method545(0.0F);
			local16.method545(1.0F);
			local16.method545(0.0F);
			local16.method545(-1.0F);
			local16.method545(1.0F);
			local16.method545(0.0F);
			local16.method545(0.0F);
			local16.method545(0.0F);
		}
		this.anInterface10_5 = this.method6955(20, local16.aByteArray52, local16.anInt5186, false);
		this.aClass133_11 = new Class133(this.anInterface10_5, 5126, 3, 0);
		this.aClass133_12 = new Class133(this.anInterface10_5, 5126, 2, 12);
		this.aClass81_1.method1538(this);
	}

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "(I)V")
	public void method6898() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(B)V")
	private void method6899() {
		if (this.aBoolean731) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean731 = false;
		}
	}

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(B)Lclient!eg;")
	public Class3_Sub3 method6900() {
		return this.aClass17_Sub1_1 == null ? null : this.aClass17_Sub1_1.method6601();
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(Lclient!tr;I)V")
	public void method6901(@OriginalArg(0) Interface22 arg0) {
		if (this.anInt8689 < 0 || this.anInterface22Array2[this.anInt8689] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface22Array2[this.anInt8689--] = null;
		arg0.method1938();
		if (this.anInt8689 < 0) {
			this.anInterface22_1 = null;
		} else {
			this.anInterface22_1 = this.anInterface22Array2[this.anInt8689];
			this.anInterface22_1.method1937();
		}
	}

	@OriginalMember(owner = "client!uca", name = "w", descriptor = "()Lclient!pg;")
	@Override
	public Class267 method6863() {
		@Pc(7) int local7 = -1;
		if (this.aString128.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString128.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString128.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class267(local7, "OpenGL", this.anInt8727, this.aString129, 0L);
	}

	@OriginalMember(owner = "client!uca", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(57) float local57;
		@Pc(45) float local45;
		if (this.aClass3_Sub1_Sub1_4 == null || arg2 > this.aClass3_Sub1_Sub1_4.anInt2066 || this.aClass3_Sub1_Sub1_4.anInt2069 < arg3) {
			this.aClass3_Sub1_Sub1_4 = Static62.method1079(arg3, arg2, this, arg6);
			this.aClass3_Sub1_Sub1_4.method1720(false, false);
			local57 = this.aClass3_Sub1_Sub1_4.aFloat52;
			local45 = this.aClass3_Sub1_Sub1_4.aFloat53;
		} else {
			this.aClass3_Sub1_Sub1_4.method1719(arg2, arg3, arg6, 6406, false);
			local45 = this.aClass3_Sub1_Sub1_4.aFloat53 * (float) arg2 / (float) this.aClass3_Sub1_Sub1_4.anInt2066;
			local57 = this.aClass3_Sub1_Sub1_4.aFloat52 * (float) arg3 / (float) this.aClass3_Sub1_Sub1_4.anInt2069;
		}
		this.method6950();
		this.method6911(this.aClass3_Sub1_Sub1_4);
		this.method6923(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method6961(arg5);
		this.method6903(34165, 34165);
		this.method6957(34166, 768, 0);
		this.method6957(5890, 770, 2);
		this.method6926(34166, 0);
		this.method6926(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = local147 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = local150 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local57, local45);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local57, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method6957(5890, 768, 0);
		this.method6957(34166, 770, 2);
		this.method6926(5890, 0);
		this.method6926(34166, 2);
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(Lclient!tr;I)V")
	public void method6902(@OriginalArg(0) Interface22 arg0) {
		if (this.anInt8690 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8690 >= 0) {
			this.anInterface22Array3[this.anInt8690].method1939();
		}
		this.anInterface22_2 = this.anInterface22Array3[++this.anInt8690] = arg0;
		this.anInterface22_2.method1936();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!ut;Z)Lclient!f;")
	@Override
	public Class38 method6845(@OriginalArg(0) Class344 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt8946 * arg0.anInt8947];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray95 == null) {
			for (local21 = 0; local21 < arg0.anInt8946; local21++) {
				for (local25 = 0; local25 < arg0.anInt8947; local25++) {
					@Pc(83) int local83 = arg0.anIntArray585[arg0.aByteArray94[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt8946; local21++) {
				for (local25 = 0; local25 < arg0.anInt8947; local25++) {
					local12[local16++] = arg0.aByteArray95[local14] << 24 | arg0.anIntArray585[arg0.aByteArray94[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(122) Class38 local122 = this.method6879(local12, arg0.anInt8947, arg0.anInt8947, arg0.anInt8946);
		local122.Q(arg0.anInt8948, arg0.anInt8950, arg0.anInt8949, arg0.anInt8945);
		return local122;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(III)V")
	public void method6903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt8723 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (arg0 != this.anInt8726) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt8726 = arg0;
			local17 = true;
		}
		if (this.anInt8713 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt8713 = arg1;
			local17 = true;
		}
		if (local17) {
			this.anInt8696 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIILclient!re;)V")
	public void method6904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Interface21 arg2) {
		@Pc(7) int local7 = arg2.method5345();
		@Pc(14) int local14 = arg0 * this.method6944(local7);
		this.method6934(arg2);
		OpenGL.glDrawElements(4, arg1, local7, arg2.method5346() + (long) local14);
	}

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "(B)V")
	public void method6905() {
		if (this.anInt8705 != 0) {
			this.anInt8705 = 0;
			this.anInt8696 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!uca", name = "i", descriptor = "(I)V")
	private void method6906() {
		@Pc(10) float[] local10 = this.aFloatArray68;
		@Pc(22) float local22 = (float) (-this.anInt8725 * this.anInt8703) / (float) this.anInt8728;
		@Pc(37) float local37 = (float) ((this.anInt8616 - this.anInt8725) * this.anInt8703) / (float) this.anInt8728;
		@Pc(48) float local48 = (float) (this.anInt8717 * this.anInt8703) / (float) this.bf;
		@Pc(63) float local63 = (float) (this.anInt8703 * (this.anInt8717 - this.anInt8634)) / (float) this.bf;
		if (local22 == local37 || local48 == local63) {
			local10[1] = 0.0F;
			local10[9] = 0.0F;
			local10[3] = 0.0F;
			local10[10] = 1.0F;
			local10[14] = 0.0F;
			local10[15] = 1.0F;
			local10[2] = 0.0F;
			local10[8] = 0.0F;
			local10[5] = 1.0F;
			local10[13] = 0.0F;
			local10[11] = 0.0F;
			local10[12] = 0.0F;
			local10[7] = 0.0F;
			local10[4] = 0.0F;
			local10[6] = 0.0F;
			local10[0] = 1.0F;
		} else {
			@Pc(143) float local143 = (float) this.anInt8703 * 2.0F;
			local10[8] = (local37 + local22) / (local37 - local22);
			local10[11] = -1.0F;
			local10[10] = this.aFloat224 = (float) -(this.anInt8716 + this.anInt8703) / (float) (this.anInt8716 - this.anInt8703);
			local10[2] = 0.0F;
			local10[12] = 0.0F;
			local10[1] = 0.0F;
			local10[0] = local143 / (local37 - local22);
			local10[6] = 0.0F;
			local10[9] = (local63 + local48) / (-local63 + local48);
			local10[14] = this.aFloat231 = -((float) this.anInt8716 * local143) / (float) (this.anInt8716 - this.anInt8703);
			local10[3] = 0.0F;
			local10[7] = 0.0F;
			local10[4] = 0.0F;
			local10[5] = local143 / (local48 - local63);
			local10[15] = 0.0F;
			local10[13] = 0.0F;
		}
		this.method6968();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZB)V")
	public void method6907(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean733 != arg0) {
			this.aBoolean733 = arg0;
			this.method6940();
			this.anInt8696 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!uca", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		if (this.aFloat225 != arg0) {
			this.aFloat225 = arg0;
			this.method6949();
		}
	}

	@OriginalMember(owner = "client!uca", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8711 < arg0) {
			this.anInt8711 = arg0;
		}
		if (arg2 < this.anInt8709) {
			this.anInt8709 = arg2;
		}
		if (this.anInt8724 < arg1) {
			this.anInt8724 = arg1;
		}
		if (arg3 < this.anInt8718) {
			this.anInt8718 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method6973();
		this.method6945();
	}

	@OriginalMember(owner = "client!uca", name = "j", descriptor = "()Z")
	@Override
	public boolean method6841() {
		return false;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!ak;IIII)Lclient!da;")
	@Override
	public Class33 method6839(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class33_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!uca", name = "j", descriptor = "(I)V")
	private void method6908() {
		if (this.anInt8705 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt8616 > 0 && this.anInt8634 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt8616, (double) this.anInt8634, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt8696 &= 0xFFFFFFE7;
		this.anInt8705 = 1;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZIIILclient!jaclib/memory/Buffer;)Lclient!fba;")
	public Interface10 method6909(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Buffer arg2) {
		return (Interface10) (this.aBoolean736 ? new Class83_Sub2(this, arg1, arg2, arg0, false) : new Class79_Sub1(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!uca", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8616 < arg2) {
			arg2 = this.anInt8616;
		}
		if (arg3 > this.anInt8634) {
			arg3 = this.anInt8634;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt8709 = arg2;
		this.anInt8718 = arg3;
		this.anInt8724 = arg1;
		this.anInt8711 = arg0;
		OpenGL.glEnable(3089);
		this.method6973();
		this.method6945();
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(III)V")
	public synchronized void method6910(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub44 local8 = new Class2_Sub44(arg1);
		local8.aLong268 = arg0;
		this.aClass70_64.method1269(local8);
	}

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "()Z")
	@Override
	public boolean method6835() {
		return true;
	}

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "()V")
	@Override
	public void method6832() {
		if (!this.aBoolean732 || this.anInt8616 <= 0 || this.anInt8634 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt8711;
		@Pc(25) int local25 = this.anInt8709;
		@Pc(28) int local28 = this.anInt8724;
		@Pc(31) int local31 = this.anInt8718;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6905();
		this.method6972(false);
		this.method6907(false);
		this.method6895(false);
		this.method6896(false);
		this.method6911(null);
		this.method6963(-2);
		this.method6953(1);
		this.method6923(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt8616, this.anInt8634, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLclient!vaa;)V")
	public void method6911(@OriginalArg(1) Class3 arg0) {
		@Pc(15) Class3 local15 = this.aClass3Array1[this.anInt8723];
		if (local15 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local15.anInt6726);
			} else {
				if (local15 == null) {
					OpenGL.glEnable(arg0.anInt6726);
				} else if (arg0.anInt6726 != local15.anInt6726) {
					OpenGL.glDisable(local15.anInt6726);
					OpenGL.glEnable(arg0.anInt6726);
				}
				OpenGL.glBindTexture(arg0.anInt6726, arg0.method5575());
			}
			this.aClass3Array1[this.anInt8723] = arg0;
		}
		this.anInt8696 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "(B)V")
	public void method6912() {
		if (this.anInt8696 == 4) {
			return;
		}
		this.method6908();
		this.method6972(false);
		this.method6907(false);
		this.method6895(false);
		this.method6896(false);
		this.method6963(-2);
		this.method6923(1);
		this.anInt8696 = 4;
	}

	@OriginalMember(owner = "client!uca", name = "t", descriptor = "()V")
	@Override
	public void method6861() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZLclient!bb;)V")
	public void method6913(@OriginalArg(1) Class25_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method383(), 0);
	}

	@OriginalMember(owner = "client!uca", name = "y", descriptor = "()Z")
	@Override
	public boolean method6866() {
		return true;
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(Z)V")
	public void method6914() {
		if (this.anInt8696 == 16) {
			return;
		}
		this.method6964();
		this.method6972(true);
		this.method6895(true);
		this.method6896(true);
		this.method6923(1);
		this.anInt8696 = 16;
	}

	@OriginalMember(owner = "client!uca", name = "k", descriptor = "(I)V")
	private void method6915() {
		OpenGL.glDepthMask(this.aBoolean716 && this.aBoolean742);
	}

	@OriginalMember(owner = "client!uca", name = "l", descriptor = "()V")
	@Override
	public void method6843() {
	}

	@OriginalMember(owner = "client!uca", name = "s", descriptor = "()V")
	@Override
	public void method6857() {
		this.aClass248_1.method5215();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!gv;ILclient!gv;Lclient!gv;Lclient!gv;)V")
	public void method6916(@OriginalArg(0) Class133 arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class133 arg2, @OriginalArg(4) Class133 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6938(arg3.anInterface10_2);
			OpenGL.glVertexPointer(arg3.aByte35, arg3.aShort33, this.anInterface10_6.method2294(), this.anInterface10_6.method2291() + (long) arg3.aByte36);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6938(arg1.anInterface10_2);
			OpenGL.glNormalPointer(arg1.aShort33, this.anInterface10_6.method2294(), this.anInterface10_6.method2291() + (long) arg1.aByte36);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6938(arg2.anInterface10_2);
			OpenGL.glColorPointer(arg2.aByte35, arg2.aShort33, this.anInterface10_6.method2294(), this.anInterface10_6.method2291() + (long) arg2.aByte36);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6938(arg0.anInterface10_2);
			OpenGL.glTexCoordPointer(arg0.aByte35, arg0.aShort33, this.anInterface10_6.method2294(), this.anInterface10_6.method2291() + (long) arg0.aByte36);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class151 method6858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class151_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6869(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6842();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!fo;[Lclient!ut;Z)Lclient!la;")
	@Override
	public Class37 method6864(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class344[] arg1) {
		return new Class37_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!uca", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class84_Sub3 local6 = (Class84_Sub3) arg1;
		@Pc(9) Class3_Sub1_Sub1 local9 = local6.aClass3_Sub1_Sub1_1;
		this.method6950();
		this.method6911(local6.aClass3_Sub1_Sub1_1);
		this.method6923(1);
		this.method6903(7681, 8448);
		this.method6957(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat53 / (float) local9.anInt2079;
		@Pc(46) float local46 = local9.aFloat52 / (float) local9.anInt2081;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt8711 - arg2) * local39, local46 * (float) (this.anInt8724 - arg3));
		OpenGL.glVertex2i(this.anInt8711, this.anInt8724);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8711 - arg2), local46 * (float) (this.anInt8718 - arg3));
		OpenGL.glVertex2i(this.anInt8711, this.anInt8718);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8709 - arg2), local46 * (float) (this.anInt8718 - arg3));
		OpenGL.glVertex2i(this.anInt8709, this.anInt8718);
		OpenGL.glTexCoord2f((float) (this.anInt8709 - arg2) * local39, local46 * (float) (this.anInt8724 - arg3));
		OpenGL.glVertex2i(this.anInt8709, this.anInt8724);
		OpenGL.glEnd();
		this.method6957(5890, 768, 0);
	}

	@OriginalMember(owner = "client!uca", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt8703;
	}

	@OriginalMember(owner = "client!uca", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean723 = true;
		this.anInt8721 = arg1;
		this.anInt8710 = arg0;
		this.anInt8700 = arg3;
		this.anInt8704 = arg2;
	}

	@OriginalMember(owner = "client!uca", name = "l", descriptor = "(I)V")
	private void method6917() {
		if (this.aCanvas12 == null) {
			this.anInt8508 = this.anInt8556 = 0;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas12.getSize();
			this.anInt8556 = local14.height;
			this.anInt8508 = local14.width;
		}
		if (this.anInterface22_2 == null) {
			this.anInt8616 = this.anInt8508;
			this.anInt8634 = this.anInt8556;
			this.method6929();
		}
		this.method6905();
		this.JA();
	}

	@OriginalMember(owner = "client!uca", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6896(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6930();
		this.method6923(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(II)I")
	@Override
	public int method6881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!uca", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean723) {
			throw new RuntimeException("");
		}
		this.anInt8710 = arg0;
		this.anInt8704 = arg2;
		this.anInt8721 = arg1;
		this.anInt8700 = arg3;
		if (this.aBoolean734) {
			this.aClass298_1.aClass42_Sub8_1.method7487();
			this.aClass298_1.aClass42_Sub8_1.method7488();
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZI)V")
	public void method6918(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean729) {
			this.aBoolean729 = arg0;
			this.method6940();
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZIB)V")
	public void method6919(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.method6924(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!uca", name = "p", descriptor = "()I")
	@Override
	public int method6851() {
		return 4;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBI)V")
	public synchronized void method6920(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub44 local8 = new Class2_Sub44(arg0);
		local8.aLong268 = arg1;
		this.aClass70_62.method1269(local8);
	}

	@OriginalMember(owner = "client!uca", name = "q", descriptor = "()Z")
	@Override
	public boolean method6853() {
		return true;
	}

	@OriginalMember(owner = "client!uca", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt8703 && arg1 == this.anInt8716) {
			return;
		}
		this.anInt8703 = arg0;
		this.anInt8716 = arg1;
		this.method6906();
		this.method6941();
		if (this.anInt8705 == 3) {
			this.method6925();
			return;
		}
		if (this.anInt8705 != 2) {
			return;
		}
		this.method6936();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IZ[BII)Lclient!re;")
	public Interface21 method6921(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2) {
		return (Interface21) (this.aBoolean736 && (!arg1 || this.aBoolean741) ? new Class83_Sub1(this, 5123, arg2, arg0, arg1) : new Class79_Sub2(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!uca", name = "g", descriptor = "(B)V")
	private void method6922() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt8715; local7++) {
			@Pc(14) Class2_Sub11 local14 = this.aClass2_Sub11Array5[local7];
			Static107.aFloatArray7[0] = local14.method7276();
			@Pc(25) int local25 = local7 + 16386;
			Static107.aFloatArray7[1] = local14.method7270();
			Static107.aFloatArray7[2] = local14.method7271();
			Static107.aFloatArray7[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static107.aFloatArray7, 0);
			@Pc(52) int local52 = local14.method7274();
			@Pc(58) float local58 = local14.method7280() / 255.0F;
			Static107.aFloatArray7[2] = local58 * (float) (local52 & 0xFF);
			Static107.aFloatArray7[0] = (float) (local52 >> 16 & 0xFF) * local58;
			Static107.aFloatArray7[1] = (float) (local52 >> 8 & 0xFF) * local58;
			OpenGL.glLightfv(local25, 4609, Static107.aFloatArray7, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method7277() * local14.method7277()));
			OpenGL.glEnable(local25);
		}
		while (this.anInt8719 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt8719 = this.anInt8715;
	}

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(II)V")
	public void method6923(@OriginalArg(1) int arg0) {
		if (this.anInt8695 == arg0) {
			return;
		}
		@Pc(17) boolean local17;
		@Pc(19) byte local19;
		if (arg0 == 1) {
			local17 = true;
			local19 = 1;
		} else if (arg0 == 2) {
			local17 = false;
			local19 = 2;
		} else if (arg0 == 128) {
			local17 = true;
			local19 = 3;
		} else {
			local19 = 0;
			local17 = false;
		}
		if (!this.aBoolean718) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean718 = true;
		}
		if (local17 != this.aBoolean719) {
			if (local17) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean719 = local17;
		}
		if (this.anInt8697 != local19) {
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
			this.anInt8697 = local19;
		}
		this.anInt8695 = arg0;
		this.anInt8696 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZZII)V")
	public void method6924(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8698 != arg2 || this.aBoolean723 != this.aBoolean734) {
			@Pc(24) Class3_Sub1 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean723 ? 3 : 0;
			if (arg2 < 0) {
				this.method6899();
			} else {
				local24 = this.aClass325_1.method6617(arg2);
				@Pc(54) Class291 local54 = super.anInterface9_10.method1074(arg2);
				if (local54.aByte97 == 0 && local54.aByte100 == 0) {
					this.method6899();
				} else {
					@Pc(78) int local78 = local54.aBoolean602 ? 64 : 128;
					@Pc(82) int local82 = local78 * 50;
					this.method6946(0.0F, (float) (this.anInt8686 % local82 * local54.aByte97) / (float) local82, (float) (local54.aByte100 * (this.anInt8686 % local82)) / (float) local82);
				}
				local26 = local54.anInt7229;
				if (!this.aBoolean723) {
					local37 = local54.aByte96;
					local28 = local54.aByte95;
					local30 = local54.anInt7228;
				}
			}
			this.aClass298_1.method5976(local30, local37, local28, arg1, arg0);
			if (!this.aClass298_1.method5973(local26, local24)) {
				this.method6911(local24);
				this.method6953(local26);
			}
			this.aBoolean734 = this.aBoolean723;
			this.anInt8698 = arg2;
		}
		this.anInt8696 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "(B)V")
	private void method6925() {
		@Pc(19) float local19 = this.aFloat227 * (float) -this.anInt8725 / (float) this.anInt8728;
		@Pc(31) float local31 = this.aFloat227 * (float) -this.anInt8717 / (float) this.bf;
		@Pc(46) float local46 = this.aFloat227 * (float) (this.anInt8616 - this.anInt8725) / (float) this.anInt8728;
		@Pc(60) float local60 = (float) (this.anInt8634 - this.anInt8717) * this.aFloat227 / (float) this.bf;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local19 != local46 && local31 != local60) {
			OpenGL.glOrtho((double) local19, (double) local46, (double) -local60, (double) -local31, (double) this.anInt8703, (double) this.anInt8716);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class38 method6868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class38_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!uca", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8711;
		arg0[3] = this.anInt8718;
		arg0[1] = this.anInt8724;
		arg0[2] = this.anInt8709;
	}

	@OriginalMember(owner = "client!uca", name = "C", descriptor = "()Lclient!q;")
	@Override
	public Class25 method6889() {
		return new Class25_Sub1();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BIII)V")
	public void method6926(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZLclient!tr;)V")
	public void method6927(@OriginalArg(1) Interface22 arg0) {
		if (this.anInt8690 < 0 || this.anInterface22Array3[this.anInt8690] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface22Array3[this.anInt8690--] = null;
		arg0.method1939();
		if (this.anInt8690 >= 0) {
			this.anInterface22_2 = this.anInterface22Array3[this.anInt8690];
			this.anInterface22_2.method1936();
		} else {
			this.anInterface22_2 = null;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I[Lclient!tg;)V")
	@Override
	public void method6874(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass2_Sub11Array5[local3] = arg1[local3];
		}
		this.anInt8715 = arg0;
		if (this.anInt8705 != 1) {
			this.method6922();
		}
	}

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "(I)V")
	private void method6929() {
		OpenGL.glViewport(this.anInt8706, this.anInt8722, this.anInt8616, this.anInt8634);
	}

	@OriginalMember(owner = "client!uca", name = "n", descriptor = "(I)V")
	private void method6930() {
		if (this.anInt8696 == 1) {
			return;
		}
		this.method6908();
		this.method6972(false);
		this.method6907(false);
		this.method6895(false);
		this.method6896(false);
		this.method6911(null);
		this.method6963(-2);
		this.method6953(1);
		this.anInt8696 = 1;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6814(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!uca", name = "o", descriptor = "(I)V")
	private void method6931() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!uca", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(6) int local6 = this.anInt8731;
		this.anInt8731 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!uca", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass25_Sub1_3.aFloat22 + (float) arg2 * this.aClass25_Sub1_3.aFloat19 + (float) arg1 * this.aClass25_Sub1_3.aFloat18 + (float) arg0 * this.aClass25_Sub1_3.aFloat13;
		if (local28 < (float) this.anInt8703 || (float) this.anInt8716 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) (((float) arg1 * this.aClass25_Sub1_3.aFloat15 + this.aClass25_Sub1_3.aFloat12 * (float) arg0 + (float) arg2 * this.aClass25_Sub1_3.aFloat17 + this.aClass25_Sub1_3.aFloat11) * (float) this.anInt8728 / local28);
		@Pc(117) int local117 = (int) ((float) this.bf * (this.aClass25_Sub1_3.aFloat16 + this.aClass25_Sub1_3.aFloat21 * (float) arg2 + (float) arg0 * this.aClass25_Sub1_3.aFloat14 + (float) arg1 * this.aClass25_Sub1_3.aFloat20) / local28);
		if (this.aFloat219 <= (float) local85 && this.aFloat216 >= (float) local85 && this.aFloat228 <= (float) local117 && (float) local117 <= this.aFloat230) {
			arg3[1] = (int) ((float) local117 - this.aFloat228);
			arg3[0] = (int) ((float) local85 - this.aFloat219);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!uca", name = "i", descriptor = "(B)V")
	public void method6932() {
		if (this.anInt8696 == 8) {
			return;
		}
		this.method6951();
		this.method6972(true);
		this.method6895(true);
		this.method6896(true);
		this.method6923(1);
		this.anInt8696 = 8;
	}

	@OriginalMember(owner = "client!uca", name = "j", descriptor = "(B)V")
	private void method6933() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL2.a()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static263.method3671(1000L);
		}
	}

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6884(@OriginalArg(0) Canvas arg0) {
		this.aCanvas12 = null;
		this.aLong241 = 0L;
		if (arg0 == null || this.aCanvas13 == arg0) {
			this.aLong241 = this.aLong240;
			this.aCanvas12 = this.aCanvas13;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable7.get(arg0);
			this.aLong241 = local26;
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.aLong241 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong241);
		this.method6917();
	}

	@OriginalMember(owner = "client!uca", name = "n", descriptor = "()V")
	@Override
	public void method6847() {
		if (this.aBoolean721) {
			if (this.aClass105_6 != this.anInterface22_2) {
				throw new RuntimeException();
			}
			this.aClass105_6.method1949(0);
			this.aClass105_6.method1949(8);
			this.method6897(this.aClass105_6);
		} else if (this.aBoolean722) {
			this.aClass38_Sub3_1.da(0, 0, this.anInt8616, this.anInt8634, 0, 0);
			this.anOpenGL2.setSurface(this.aLong241);
		} else {
			throw new RuntimeException("");
		}
		this.anInt8616 = this.anInt8508;
		this.aClass38_Sub3_1 = null;
		this.anInt8634 = this.anInt8556;
		this.method6905();
		this.method6929();
		this.JA();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6816(@OriginalArg(0) Class25 arg0) {
		this.aClass25_Sub1_3.M(arg0);
		this.aClass25_Sub1_4.M(this.aClass25_Sub1_3);
		this.aClass25_Sub1_4.method378();
		this.aClass25_Sub1_5.method381(this.aClass25_Sub1_4);
		if (this.anInt8705 != 1) {
			this.method6954();
		}
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method6930();
		this.method6923(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean740) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean740) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6828() {
		this.method6930();
		this.method6923(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!uca", name = "i", descriptor = "()V")
	@Override
	public void method6840() {
		if (this.aClass2_Sub15_Sub1_1 != null && this.aClass2_Sub15_Sub1_1.method4037()) {
			this.aClass248_1.method5206(this.aClass2_Sub15_Sub1_1);
			this.aClass325_1.method6613();
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class38 method6879(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class38_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLclient!re;)V")
	public void method6934(@OriginalArg(1) Interface21 arg0) {
		if (this.anInterface21_5 != arg0) {
			if (this.aBoolean736) {
				OpenGL.glBindBufferARB(34963, arg0.method5343());
			}
			this.anInterface21_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass248_1.method5213(arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!uca", name = "p", descriptor = "(I)V")
	private void method6935() {
		this.method6963(-2);
		for (@Pc(14) int local14 = this.anInt8729 - 1; local14 >= 0; local14--) {
			this.method6947(local14);
			this.method6911(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6903(8448, 8448);
		this.method6957(34168, 770, 2);
		this.method6899();
		this.anInt8695 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt8697 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean719 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean718 = true;
		this.method6972(true);
		this.method6907(true);
		this.method6895(true);
		this.method6896(true);
		this.method6905();
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
		@Pc(129) float[] local129 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(131) int local131 = 0; local131 < 8; local131++) {
			@Pc(137) int local137 = local131 + 16384;
			OpenGL.glLightfv(local137, 4608, local129, 0);
			OpenGL.glLightf(local137, 4615, 0.0F);
			OpenGL.glLightf(local137, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt8714 = this.anInt8730 = -1;
		this.JA();
	}

	@OriginalMember(owner = "client!uca", name = "q", descriptor = "(I)V")
	private void method6936() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray68, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!uca", name = "r", descriptor = "(I)V")
	private void method6937() {
		if (this.aBoolean743 && this.anInt8701 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILclient!fba;)V")
	public void method6938(@OriginalArg(1) Interface10 arg0) {
		if (this.anInterface10_6 != arg0) {
			if (this.aBoolean736) {
				OpenGL.glBindBufferARB(34962, arg0.method2293());
			}
			this.anInterface10_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(FBF)V")
	public void method6939(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat221 = arg1;
		this.aFloat217 = arg0;
		this.method6941();
	}

	@OriginalMember(owner = "client!uca", name = "s", descriptor = "(I)V")
	private void method6940() {
		if (this.aBoolean733 && !this.aBoolean729) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!uca", name = "t", descriptor = "(I)V")
	private void method6941() {
		this.aFloat223 = (float) (this.anInt8716 - this.anInt8707) - this.aFloat217;
		this.aFloat229 = this.aFloat223 - this.aFloat221 * (float) this.anInt8701;
		if (this.aFloat229 < (float) this.anInt8703) {
			this.aFloat229 = this.anInt8703;
		}
		OpenGL.glFogf(2915, this.aFloat229);
		OpenGL.glFogf(2916, this.aFloat223);
		Static161.aFloatArray53[2] = (float) (this.anInt8730 & 0xFF) / 255.0F;
		Static161.aFloatArray53[0] = (float) (this.anInt8730 & 0xFF0000) / 1.671168E7F;
		Static161.aFloatArray53[1] = (float) (this.anInt8730 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static161.aFloatArray53, 0);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "()Z")
	@Override
	public boolean method6818() {
		return true;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!tr;B)V")
	public void method6942(@OriginalArg(0) Interface22 arg0) {
		if (this.aBoolean727) {
			this.method6894(arg0);
			this.method6902(arg0);
		} else if (this.anInt8688 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt8688 >= 0) {
				this.anInterface22Array1[this.anInt8688].method1935();
			}
			this.anInterface22_1 = this.anInterface22_2 = this.anInterface22Array1[++this.anInt8688] = arg0;
			this.anInterface22_1.method1934();
		}
	}

	@OriginalMember(owner = "client!uca", name = "k", descriptor = "(B)V")
	private void method6943() {
		Static161.aFloatArray53[2] = this.aFloat222 * this.aFloat211;
		Static161.aFloatArray53[3] = 1.0F;
		Static161.aFloatArray53[0] = this.aFloat218 * this.aFloat222;
		Static161.aFloatArray53[1] = this.aFloat222 * this.aFloat214;
		OpenGL.glLightfv(16384, 4609, Static161.aFloatArray53, 0);
		Static161.aFloatArray53[0] = this.aFloat218 * -this.aFloat226;
		Static161.aFloatArray53[2] = -this.aFloat226 * this.aFloat211;
		Static161.aFloatArray53[3] = 1.0F;
		Static161.aFloatArray53[1] = this.aFloat214 * -this.aFloat226;
		OpenGL.glLightfv(16385, 4609, Static161.aFloatArray53, 0);
	}

	@OriginalMember(owner = "client!uca", name = "x", descriptor = "()Z")
	@Override
	public boolean method6865() {
		return true;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(ZI)I")
	public int method6944(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!uca", name = "u", descriptor = "(I)V")
	private void method6945() {
		if (this.anInt8709 >= this.anInt8711 && this.anInt8718 >= this.anInt8724) {
			OpenGL.glScissor(this.anInt8706 + this.anInt8711, this.anInt8634 + (this.anInt8722 - this.anInt8718), this.anInt8709 - this.anInt8711, -this.anInt8724 + this.anInt8718);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(FFFI)V")
	private void method6946(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean731) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg2, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean731 = true;
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(ZI)V")
	public void method6947(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt8723) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt8723 = arg0;
		}
	}

	@OriginalMember(owner = "client!uca", name = "v", descriptor = "(I)I")
	private int method6948() {
		this.aString128 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString129 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString128.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString128.indexOf("brian paul") != -1 || this.aString128.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(47) String local47 = OpenGL.glGetString(7938);
		@Pc(55) String[] local55 = Static439.method5762(local47.replace('.', ' '), ' ');
		if (local55.length >= 2) {
			try {
				@Pc(67) int local67 = Static559.method7310(local55[0]);
				@Pc(73) int local73 = Static559.method7310(local55[1]);
				this.anInt8727 = local73 + local67 * 10;
			} catch (@Pc(82) NumberFormatException local82) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt8727 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(123) int[] local123 = new int[1];
		OpenGL.glGetIntegerv(34018, local123, 0);
		this.anInt8729 = local123[0];
		OpenGL.glGetIntegerv(34929, local123, 0);
		this.anInt8699 = local123[0];
		OpenGL.glGetIntegerv(34930, local123, 0);
		this.anInt8708 = local123[0];
		if (this.anInt8729 < 2 || this.anInt8699 < 2 || this.anInt8708 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean720 = Stream.b();
		this.aBoolean722 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean736 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean740 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean738 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean724 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean728 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean745 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean735 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean725 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean730 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean739 = false;
		this.aBoolean721 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean727 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean737 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean726 = this.aBoolean737 & this.aBoolean727;
		OpenGL.glGetFloatv(2834, Static161.aFloatArray53, 0);
		this.aFloat212 = Static161.aFloatArray53[1];
		this.aFloat213 = Static161.aFloatArray53[0];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(I)V")
	@Override
	public void method6830(@OriginalArg(0) int arg0) {
		this.method6931();
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)V")
	@Override
	public void method6823(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!uca", name = "w", descriptor = "(I)V")
	private void method6949() {
		Static161.aFloatArray53[0] = this.aFloat218 * this.aFloat225;
		Static161.aFloatArray53[3] = 1.0F;
		Static161.aFloatArray53[2] = this.aFloat211 * this.aFloat225;
		Static161.aFloatArray53[1] = this.aFloat225 * this.aFloat214;
		OpenGL.glLightModelfv(2899, Static161.aFloatArray53, 0);
	}

	@OriginalMember(owner = "client!uca", name = "x", descriptor = "(I)V")
	public void method6950() {
		if (this.anInt8696 == 2) {
			return;
		}
		this.method6908();
		this.method6972(false);
		this.method6907(false);
		this.method6895(false);
		this.method6896(false);
		this.method6963(-2);
		this.anInt8696 = 2;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class38 method6825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class38_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "()Z")
	@Override
	public boolean method6838() {
		if (this.aClass2_Sub15_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub15_Sub1_1.method4037()) {
			if (!this.aClass248_1.method5210(this.aClass2_Sub15_Sub1_1)) {
				return false;
			}
			this.aClass325_1.method6613();
		}
		return true;
	}

	@OriginalMember(owner = "client!uca", name = "l", descriptor = "(B)V")
	private void method6951() {
		if (this.anInt8705 != 2) {
			this.anInt8705 = 2;
			this.method6936();
			this.method6954();
			this.anInt8696 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(FIFFF)V")
	public void method6952(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static161.aFloatArray53[1] = arg0;
		Static161.aFloatArray53[3] = arg2;
		Static161.aFloatArray53[0] = arg3;
		Static161.aFloatArray53[2] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static161.aFloatArray53, 0);
	}

	@OriginalMember(owner = "client!uca", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt8711 = 0;
		this.anInt8724 = 0;
		this.anInt8709 = this.anInt8616;
		this.anInt8718 = this.anInt8634;
		OpenGL.glDisable(3089);
		this.method6973();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Z)V")
	@Override
	public void method6813(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "(II)V")
	public void method6953(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6903(7681, 7681);
		} else if (arg0 == 0) {
			this.method6903(8448, 8448);
		} else if (arg0 == 2) {
			this.method6903(34165, 7681);
		} else if (arg0 == 3) {
			this.method6903(260, 8448);
			return;
		} else if (arg0 == 4) {
			this.method6903(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6854(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable7.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!uca", name = "y", descriptor = "(I)V")
	private void method6954() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass25_Sub1_4.method383(), 0);
		if (this.aBoolean734) {
			this.aClass298_1.aClass42_Sub8_1.method7487();
		}
		this.method6958();
		this.method6922();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I[BIZI)Lclient!fba;")
	public Interface10 method6955(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface10) (this.aBoolean736 && (!arg3 || this.aBoolean741) ? new Class83_Sub2(this, arg0, arg1, arg2, arg3) : new Class79_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!uca", name = "B", descriptor = "()Z")
	@Override
	public boolean method6880() {
		return this.aClass2_Sub15_Sub1_1 != null && this.aClass2_Sub15_Sub1_1.method4037();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBII)V")
	public void method6956(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!uca", name = "L", descriptor = "()V")
	@Override
	public void L() {
		this.aBoolean723 = false;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "([I)V")
	@Override
	public void method6811(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8616;
		arg0[1] = this.anInt8634;
	}

	@OriginalMember(owner = "client!uca", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean742 = arg0;
		this.method6915();
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(IIII)V")
	public void method6957(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "(B)V")
	public void method6958() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray70, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6819(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static349.aFloat187 = arg2;
		Static218.aFloat70 = arg1;
		Static267.aFloat241 = arg0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method6883(@OriginalArg(0) Class339 arg0, @OriginalArg(1) int arg1) {
		this.aClass81_1.method1533(arg1, arg0, this);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6930();
		this.method6923(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(22) float local22 = (float) arg3 - (float) arg1;
		if (local16 == 0.0F && local22 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(43) float local43 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local22 * local22)));
			local22 *= local43;
			local16 *= local43;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, local22 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt8711 || arg0 - arg2 > this.anInt8709 || this.anInt8724 > arg2 + arg1 || this.anInt8718 < arg1 - arg2) {
			return;
		}
		this.method6930();
		this.method6923(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(71) float local71 = (float) arg0 + 0.35F;
		@Pc(76) float local76 = (float) arg1 + 0.35F;
		@Pc(80) int local80 = arg2 << 1;
		if ((float) local80 < this.aFloat213) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local71 + 1.0F, local76 + 1.0F);
			OpenGL.glVertex2f(local71 + 1.0F, local76 - 1.0F);
			OpenGL.glVertex2f(local71 - 1.0F, -1.0F + local76);
			OpenGL.glVertex2f(local71 - 1.0F, local76 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat212 >= (float) local80) {
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
			local149 = Static511.method7273(local149);
			OpenGL.glVertex2f(local71 + (float) arg2, local76);
			for (@Pc(180) int local180 = 16384 - local149; local180 > 0; local180 -= local149) {
				OpenGL.glVertex2f(local71 + (float) arg2 * Class284.aFloatArray63[local180], (float) arg2 * Class284.aFloatArray62[local180] + local76);
			}
			OpenGL.glVertex2f((float) arg2 + local71, local76);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6810(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!uca", name = "A", descriptor = "()V")
	@Override
	protected void method6875() {
		for (@Pc(6) Class2 local6 = this.aClass70_59.method1264(); local6 != null; local6 = this.aClass70_59.method1261()) {
			((Class2_Sub12_Sub2) local6).method3736();
		}
		if (this.aClass248_1 != null) {
			this.aClass248_1.method5211();
		}
		if (this.anOpenGL2 != null) {
			this.method6931();
			@Pc(40) Enumeration local40 = this.aHashtable7.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable7.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean715) {
			Static5.method82(false, true);
			this.aBoolean715 = false;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIIF)Lclient!tg;")
	@Override
	public Class2_Sub11 method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub11_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!uca", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass25_Sub1_3.aFloat22 + (float) arg0 * this.aClass25_Sub1_3.aFloat13 + this.aClass25_Sub1_3.aFloat18 * (float) arg1 + (float) arg2 * this.aClass25_Sub1_3.aFloat19;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = (float) arg3 * this.aClass25_Sub1_3.aFloat13 + (float) arg4 * this.aClass25_Sub1_3.aFloat18 + (float) arg5 * this.aClass25_Sub1_3.aFloat19 + this.aClass25_Sub1_3.aFloat22;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt8703 && local59 < (float) this.anInt8703 || !(!(local28 > (float) this.anInt8716) || !(local59 > (float) this.anInt8716))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass25_Sub1_3.aFloat11 + (float) arg2 * this.aClass25_Sub1_3.aFloat17 + this.aClass25_Sub1_3.aFloat12 * (float) arg0 + this.aClass25_Sub1_3.aFloat15 * (float) arg1) * (float) this.anInt8728 / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt8728 * (this.aClass25_Sub1_3.aFloat17 * (float) arg5 + (float) arg3 * this.aClass25_Sub1_3.aFloat12 + this.aClass25_Sub1_3.aFloat15 * (float) arg4 + this.aClass25_Sub1_3.aFloat11) / local59);
		if ((float) local123 < this.aFloat219 && (float) local155 < this.aFloat219 || (float) local123 > this.aFloat216 && this.aFloat216 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass25_Sub1_3.aFloat16 + (float) arg2 * this.aClass25_Sub1_3.aFloat21 + this.aClass25_Sub1_3.aFloat14 * (float) arg0 + (float) arg1 * this.aClass25_Sub1_3.aFloat20) * (float) this.bf / local28);
			@Pc(245) int local245 = (int) ((this.aClass25_Sub1_3.aFloat16 + this.aClass25_Sub1_3.aFloat14 * (float) arg3 + this.aClass25_Sub1_3.aFloat20 * (float) arg4 + this.aClass25_Sub1_3.aFloat21 * (float) arg5) * (float) this.bf / local59);
			return (!((float) local213 < this.aFloat228) || !(this.aFloat228 > (float) local245)) && (!((float) local213 > this.aFloat230) || !(this.aFloat230 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "(I)V")
	@Override
	public void method6850(@OriginalArg(0) int arg0) {
		this.method6933();
	}

	@OriginalMember(owner = "client!uca", name = "z", descriptor = "()Z")
	@Override
	public boolean method6872() {
		return true;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IJ)V")
	public synchronized void method6959(@OriginalArg(1) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong268 = arg0;
		this.aClass70_66.method1269(local7);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BI)V")
	public synchronized void method6960(@OriginalArg(1) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong268 = arg0;
		this.aClass70_65.method1269(local7);
	}

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(ZI)V")
	public void method6961(@OriginalArg(1) int arg0) {
		Static161.aFloatArray53[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static161.aFloatArray53[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static161.aFloatArray53[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static161.aFloatArray53[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static161.aFloatArray53, 0);
	}

	@OriginalMember(owner = "client!uca", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method6930();
		this.method6923(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean740) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean740) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(BI)I")
	public int method6962(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "()Z")
	@Override
	public boolean method6824() {
		return this.aBoolean740 && (!this.method6880() || this.aBoolean726);
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(II)I")
	@Override
	public int method6846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!uca", name = "g", descriptor = "(II)V")
	public void method6963(@OriginalArg(0) int arg0) {
		this.method6919(true, arg0);
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(Z)V")
	@Override
	public void method6887(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uca", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt8716;
	}

	@OriginalMember(owner = "client!uca", name = "n", descriptor = "(B)V")
	private void method6964() {
		if (this.anInt8705 != 3) {
			this.anInt8705 = 3;
			this.method6925();
			this.method6954();
			this.anInt8696 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "(I)V")
	@Override
	public void method6870(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt8684 = arg0;
		this.aClass325_1.method6613();
	}

	@OriginalMember(owner = "client!uca", name = "o", descriptor = "(B)V")
	public void method6965() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!uca", name = "o", descriptor = "()Z")
	@Override
	public boolean method6848() {
		return true;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class84 method6817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static297.method4278(this, arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!uca", name = "g", descriptor = "()Z")
	@Override
	public boolean method6837() {
		return this.aClass298_1.method5974();
	}

	@OriginalMember(owner = "client!uca", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.aClass25_Sub1_3.aFloat19 + (float) arg0 * this.aClass25_Sub1_3.aFloat13 + this.aClass25_Sub1_3.aFloat18 * (float) arg1 + this.aClass25_Sub1_3.aFloat22;
		if (local28 < (float) this.anInt8703 || (float) this.anInt8716 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt8728 * (this.aClass25_Sub1_3.aFloat11 + (float) arg1 * this.aClass25_Sub1_3.aFloat15 + (float) arg0 * this.aClass25_Sub1_3.aFloat12 + this.aClass25_Sub1_3.aFloat17 * (float) arg2) / local28);
		@Pc(117) int local117 = (int) ((float) this.bf * (this.aClass25_Sub1_3.aFloat16 + this.aClass25_Sub1_3.aFloat21 * (float) arg2 + (float) arg0 * this.aClass25_Sub1_3.aFloat14 + this.aClass25_Sub1_3.aFloat20 * (float) arg1) / local28);
		arg3[0] = (int) ((float) local85 - this.aFloat219);
		arg3[1] = (int) ((float) local117 - this.aFloat228);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(IBI)V")
	public void method6966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8706 = arg0;
		this.anInt8722 = arg1;
		this.method6929();
		this.method6945();
	}

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "(II)V")
	public synchronized void method6967(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub44 local8 = new Class2_Sub44(arg0);
		this.aClass70_63.method1269(local8);
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(IIIIII)Lclient!rs;")
	@Override
	public Class17 method6815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean725 ? new Class17_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(Z)V")
	private void method6968() {
		this.aFloatArray68[14] = this.aFloat231;
		this.aFloatArray68[10] = this.aFloat224;
		this.aFloat220 = this.anInt8716;
		this.aFloat215 = ((float) -this.anInt8716 + this.aFloatArray68[14]) / this.aFloatArray68[10];
	}

	@OriginalMember(owner = "client!uca", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt8725, this.anInt8717, this.anInt8728, this.bf };
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!bb;B)V")
	public void method6969(@OriginalArg(0) Class25_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method383(), 0);
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt8692 + this.anInt8691 + this.anInt8693;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6855(@OriginalArg(0) Class38 arg0) {
		this.aClass38_Sub3_1 = (Class38_Sub3) arg0;
		@Pc(81) Class2_Sub2 local81;
		if (this.aBoolean721) {
			if (this.aClass105_6 == null) {
				this.aClass105_6 = new Class105(this);
			}
			if (this.anInterface22_2 == this.aClass105_6) {
				throw new RuntimeException();
			}
			this.method6942(this.aClass105_6);
			@Pc(53) Class2_Sub2_Sub3 local53 = (Class2_Sub2_Sub3) this.aClass90_38.method1685((long) (this.aClass38_Sub3_1.E() << 16 | this.aClass38_Sub3_1.u()));
			if (local53 == null) {
				local53 = new Class2_Sub2_Sub3(this, 6402, this.aClass38_Sub3_1.E(), this.aClass38_Sub3_1.u());
				@Pc(86) Class2_Sub2_Sub3 local86;
				for (this.anInt8694 += local53.anInt1650; this.anInt8694 > 2097152; this.anInt8694 -= local86.anInt1650) {
					local81 = this.aClass253_10.method5325();
					if (local81 == null) {
						break;
					}
					local86 = (Class2_Sub2_Sub3) local81;
					local86.method7659();
					local86.method7657();
					local86.method1386();
				}
				this.aClass90_38.method1684(local53, (long) (this.aClass38_Sub3_1.E() << 16 | this.aClass38_Sub3_1.u()));
			}
			this.aClass253_10.method5326(local53);
			this.aClass105_6.method1944(local53, 8);
			this.aClass105_6.method1940(this.aClass38_Sub3_1.aClass3_Sub1_Sub1_2, 0);
		} else if (this.aBoolean722) {
			@Pc(169) Class2_Sub2_Sub7 local169 = (Class2_Sub2_Sub7) this.aClass90_38.method1685((long) (this.aClass38_Sub3_1.E() << 16 | this.aClass38_Sub3_1.u()));
			if (local169 == null) {
				local169 = new Class2_Sub2_Sub7(this, this.aClass38_Sub3_1.E(), this.aClass38_Sub3_1.u());
				@Pc(203) Class2_Sub2_Sub7 local203;
				for (this.anInt8694 += local169.anInt2644 * 4; this.anInt8694 > 2097152; this.anInt8694 -= local203.anInt2644) {
					local81 = this.aClass253_10.method5325();
					if (local81 == null) {
						break;
					}
					local203 = (Class2_Sub2_Sub7) local81;
					local203.method7659();
					local203.method7657();
					this.anOpenGL2.releasePbuffer(local203.method2276());
				}
				this.aClass90_38.method1684(local169, (long) (this.aClass38_Sub3_1.E() << 16 | this.aClass38_Sub3_1.u()));
			}
			this.aClass253_10.method5326(local169);
			this.anOpenGL2.setPbuffer(local169.method2276());
		} else {
			throw new RuntimeException("");
		}
		this.anInt8616 = arg0.E();
		this.anInt8634 = arg0.u();
		this.method6905();
		this.method6929();
		this.JA();
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method6829(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class2_Sub44 local19;
		while (!this.aClass70_61.method1263()) {
			local19 = (Class2_Sub44) this.aClass70_61.method1262();
			Static576.anIntArray608[local7++] = (int) local19.aLong268;
			this.anInt8693 -= local19.anInt7748;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static576.anIntArray608, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static576.anIntArray608, 0);
			local7 = 0;
		}
		while (!this.aClass70_62.method1263()) {
			local19 = (Class2_Sub44) this.aClass70_62.method1262();
			Static576.anIntArray608[local7++] = (int) local19.aLong268;
			this.anInt8691 -= local19.anInt7748;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static576.anIntArray608, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static576.anIntArray608, 0);
			local7 = 0;
		}
		while (!this.aClass70_63.method1263()) {
			local19 = (Class2_Sub44) this.aClass70_63.method1262();
			Static576.anIntArray608[local7++] = local19.anInt7748;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static576.anIntArray608, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static576.anIntArray608, 0);
			local7 = 0;
		}
		while (!this.aClass70_64.method1263()) {
			local19 = (Class2_Sub44) this.aClass70_64.method1262();
			Static576.anIntArray608[local7++] = (int) local19.aLong268;
			this.anInt8692 -= local19.anInt7748;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static576.anIntArray608, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static576.anIntArray608, 0);
		}
		while (!this.aClass70_60.method1263()) {
			local19 = (Class2_Sub44) this.aClass70_60.method1262();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt7748);
		}
		@Pc(216) Class2 local216;
		while (!this.aClass70_65.method1263()) {
			local216 = this.aClass70_65.method1262();
			OpenGL.glDeleteProgramARB((int) local216.aLong268);
		}
		while (!this.aClass70_66.method1263()) {
			local216 = this.aClass70_66.method1262();
			OpenGL.glDeleteObjectARB(local216.aLong268);
		}
		while (!this.aClass70_60.method1263()) {
			local19 = (Class2_Sub44) this.aClass70_60.method1262();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt7748);
		}
		this.aClass325_1.method6615();
		if (this.b() > 100663296 && Static362.method5133() > this.aLong242 + 60000L) {
			System.gc();
			this.aLong242 = Static362.method5133();
		}
		this.anInt8686 = local11;
	}

	@OriginalMember(owner = "client!uca", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.anInt8685 = 0;
		while (arg0 > 1) {
			this.anInt8685++;
			arg0 >>= 0x1;
		}
		this.anInt8687 = 0x1 << this.anInt8685;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!uo;)V")
	@Override
	public void method6860(@OriginalArg(0) Class339 arg0) {
		this.aClass81_1.method1533(-1, arg0, this);
	}

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "()Lclient!q;")
	@Override
	public Class25 method6844() {
		return this.aClass25_Sub1_3;
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(BI)I")
	public int method6970(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!rs;Lclient!rs;FLclient!rs;)Lclient!rs;")
	@Override
	public Class17 method6882(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class17 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean725 && this.aBoolean721) {
			@Pc(15) Class17_Sub1_Sub1 local15 = null;
			@Pc(18) Class17_Sub1 local18 = (Class17_Sub1) arg0;
			@Pc(21) Class17_Sub1 local21 = (Class17_Sub1) arg1;
			@Pc(25) Class3_Sub3 local25 = local18.method6601();
			@Pc(29) Class3_Sub3 local29 = local21.method6601();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local29.anInt2042 >= local25.anInt2042 ? local29.anInt2042 : local25.anInt2042;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class17_Sub1_Sub1) {
					@Pc(60) Class17_Sub1_Sub1 local60 = (Class17_Sub1_Sub1) arg3;
					if (local60.method286() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class17_Sub1_Sub1(this, local48);
				}
				if (local15.method289(local25, arg2, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!rs;)V")
	@Override
	public void method6812(@OriginalArg(0) Class17 arg0) {
		this.aClass17_Sub1_1 = (Class17_Sub1) arg0;
	}

	@OriginalMember(owner = "client!uca", name = "u", descriptor = "()Lclient!q;")
	@Override
	public Class25 method6862() {
		return this.aClass25_Sub1_1;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(ZB)V")
	public void method6972(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean743 != arg0) {
			this.aBoolean743 = arg0;
			this.method6937();
			this.anInt8696 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!uca", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.method6923(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!uca", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt8714;
		if (local15 || arg1 != this.aFloat222 || arg2 != this.aFloat226) {
			this.aFloat226 = arg2;
			this.aFloat222 = arg1;
			this.anInt8714 = arg0;
			if (local15) {
				this.aFloat211 = (float) (this.anInt8714 & 0xFF) / 255.0F;
				this.aFloat218 = (float) (this.anInt8714 & 0xFF0000) / 1.671168E7F;
				this.aFloat214 = (float) (this.anInt8714 & 0xFF00) / 65280.0F;
				this.method6949();
			}
			this.method6943();
		}
		if (this.aFloatArray71[0] == arg3 && this.aFloatArray71[1] == arg4 && arg5 == this.aFloatArray71[2]) {
			return;
		}
		this.aFloatArray71[0] = arg3;
		this.aFloatArray71[1] = arg4;
		this.aFloatArray71[2] = arg5;
		this.aFloatArray69[1] = -arg4;
		this.aFloatArray69[2] = -arg5;
		this.aFloatArray69[0] = -arg3;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray70[1] = local142 * arg4;
		this.aFloatArray70[0] = arg3 * local142;
		this.aFloatArray70[2] = arg5 * local142;
		this.aFloatArray67[1] = -this.aFloatArray70[1];
		this.aFloatArray67[2] = -this.aFloatArray70[2];
		this.aFloatArray67[0] = -this.aFloatArray70[0];
		this.method6958();
		this.anInt8720 = (int) (arg3 * 256.0F / arg4);
		this.anInt8712 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!uca", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(6) int local6 = this.anInt8732;
		this.anInt8732 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!uca", name = "A", descriptor = "(I)V")
	private void method6973() {
		this.aFloat228 = this.anInt8724 - this.anInt8717;
		this.aFloat216 = this.anInt8709 - this.anInt8725;
		this.aFloat230 = this.anInt8718 - this.anInt8717;
		this.aFloat219 = this.anInt8711 - this.anInt8725;
	}

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt8634 - local12 - arg1, arg2, 1, 32993, this.anInt8702, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!uca", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8717 = arg1;
		this.bf = arg3;
		this.anInt8725 = arg0;
		this.anInt8728 = arg2;
		this.method6906();
		this.method6973();
		if (this.anInt8705 == 3) {
			this.method6925();
		} else if (this.anInt8705 == 2) {
			this.method6936();
			return;
		}
	}

	@OriginalMember(owner = "client!uca", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8730 == arg0 && arg1 == this.anInt8701 && this.anInt8707 == arg2) {
			return;
		}
		this.anInt8707 = arg2;
		this.anInt8730 = arg0;
		this.anInt8701 = arg1;
		this.method6941();
		this.method6937();
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6831(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas13) {
			local5 = this.aLong240;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable7.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas12 == arg0) {
			this.method6917();
		}
	}
}
