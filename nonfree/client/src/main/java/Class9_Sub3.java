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

@OriginalClass("client!te")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!te", name = "B", descriptor = "I")
	private int anInt7695;

	@OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
	private int anInt7710;

	@OriginalMember(owner = "client!te", name = "S", descriptor = "I")
	public int anInt7712;

	@OriginalMember(owner = "client!te", name = "Pb", descriptor = "I")
	public int anInt7756;

	@OriginalMember(owner = "client!te", name = "re", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!te", name = "ue", descriptor = "I")
	public int anInt7876;

	@OriginalMember(owner = "client!te", name = "xe", descriptor = "Lclient!np;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!te", name = "Ae", descriptor = "Lclient!np;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!te", name = "Ee", descriptor = "I")
	private int anInt7880;

	@OriginalMember(owner = "client!te", name = "Fe", descriptor = "I")
	public int anInt7881;

	@OriginalMember(owner = "client!te", name = "Ge", descriptor = "I")
	public int anInt7882;

	@OriginalMember(owner = "client!te", name = "Pe", descriptor = "Z")
	private boolean aBoolean507;

	@OriginalMember(owner = "client!te", name = "Qe", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!te", name = "Re", descriptor = "Lclient!mj;")
	private Interface7 anInterface7_5;

	@OriginalMember(owner = "client!te", name = "Te", descriptor = "I")
	private int anInt7885;

	@OriginalMember(owner = "client!te", name = "Ue", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!te", name = "Ve", descriptor = "Lclient!maa;")
	public Class188 aClass188_15;

	@OriginalMember(owner = "client!te", name = "We", descriptor = "Z")
	private boolean aBoolean508;

	@OriginalMember(owner = "client!te", name = "Ze", descriptor = "F")
	public float aFloat157;

	@OriginalMember(owner = "client!te", name = "af", descriptor = "Lclient!mg;")
	private Class25_Sub1 aClass25_Sub1_1;

	@OriginalMember(owner = "client!te", name = "bf", descriptor = "F")
	private float bf;

	@OriginalMember(owner = "client!te", name = "df", descriptor = "Z")
	public boolean aBoolean509;

	@OriginalMember(owner = "client!te", name = "gf", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!te", name = "hf", descriptor = "[Lclient!jl;")
	private Class20[] aClass20Array1;

	@OriginalMember(owner = "client!te", name = "jf", descriptor = "Lclient!qu;")
	public Class19_Sub3 aClass19_Sub3_1;

	@OriginalMember(owner = "client!te", name = "kf", descriptor = "Ljava/lang/String;")
	private String aString66;

	@OriginalMember(owner = "client!te", name = "nf", descriptor = "Z")
	private boolean aBoolean510;

	@OriginalMember(owner = "client!te", name = "qf", descriptor = "Lclient!qu;")
	public Class19_Sub3 aClass19_Sub3_2;

	@OriginalMember(owner = "client!te", name = "rf", descriptor = "Z")
	private boolean aBoolean512;

	@OriginalMember(owner = "client!te", name = "sf", descriptor = "Lclient!ea;")
	public Class20_Sub3 aClass20_Sub3_5;

	@OriginalMember(owner = "client!te", name = "uf", descriptor = "I")
	private int anInt7890;

	@OriginalMember(owner = "client!te", name = "vf", descriptor = "I")
	private int anInt7891;

	@OriginalMember(owner = "client!te", name = "xf", descriptor = "Lclient!da;")
	public Class22_Sub2 aClass22_Sub2_3;

	@OriginalMember(owner = "client!te", name = "yf", descriptor = "I")
	private int anInt7892;

	@OriginalMember(owner = "client!te", name = "zf", descriptor = "Lclient!qu;")
	public Class19_Sub3 aClass19_Sub3_3;

	@OriginalMember(owner = "client!te", name = "Bf", descriptor = "Lclient!maa;")
	public Class188 aClass188_16;

	@OriginalMember(owner = "client!te", name = "Cf", descriptor = "Z")
	public boolean aBoolean513;

	@OriginalMember(owner = "client!te", name = "Df", descriptor = "I")
	public int anInt7894;

	@OriginalMember(owner = "client!te", name = "Ef", descriptor = "Z")
	public boolean aBoolean514;

	@OriginalMember(owner = "client!te", name = "Ff", descriptor = "F")
	private float aFloat161;

	@OriginalMember(owner = "client!te", name = "Gf", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!te", name = "Hf", descriptor = "Lclient!qu;")
	public Class19_Sub3 aClass19_Sub3_4;

	@OriginalMember(owner = "client!te", name = "Jf", descriptor = "I")
	private int anInt7896;

	@OriginalMember(owner = "client!te", name = "Mf", descriptor = "Lclient!sp;")
	private Interface16 anInterface16_6;

	@OriginalMember(owner = "client!te", name = "Nf", descriptor = "Lclient!ne;")
	public Class205 aClass205_6;

	@OriginalMember(owner = "client!te", name = "Of", descriptor = "Z")
	public boolean aBoolean516;

	@OriginalMember(owner = "client!te", name = "Qf", descriptor = "Lclient!qu;")
	public Class19_Sub3 aClass19_Sub3_5;

	@OriginalMember(owner = "client!te", name = "Tf", descriptor = "Z")
	private boolean aBoolean518;

	@OriginalMember(owner = "client!te", name = "Vf", descriptor = "Z")
	public boolean aBoolean520;

	@OriginalMember(owner = "client!te", name = "Xf", descriptor = "Lclient!rp;")
	private Class20_Sub3_Sub1 aClass20_Sub3_Sub1_4;

	@OriginalMember(owner = "client!te", name = "bg", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!te", name = "cg", descriptor = "Z")
	private boolean aBoolean521;

	@OriginalMember(owner = "client!te", name = "eg", descriptor = "Lclient!qu;")
	public Class19_Sub3 aClass19_Sub3_6;

	@OriginalMember(owner = "client!te", name = "fg", descriptor = "Z")
	private boolean aBoolean522;

	@OriginalMember(owner = "client!te", name = "lg", descriptor = "I")
	private int anInt7901;

	@OriginalMember(owner = "client!te", name = "mg", descriptor = "Z")
	public boolean aBoolean523;

	@OriginalMember(owner = "client!te", name = "ng", descriptor = "I")
	private int anInt7902;

	@OriginalMember(owner = "client!te", name = "og", descriptor = "Z")
	private boolean aBoolean524;

	@OriginalMember(owner = "client!te", name = "pg", descriptor = "Z")
	private boolean aBoolean525;

	@OriginalMember(owner = "client!te", name = "qg", descriptor = "I")
	private int anInt7903;

	@OriginalMember(owner = "client!te", name = "sg", descriptor = "Lclient!qu;")
	public Class19_Sub3 aClass19_Sub3_7;

	@OriginalMember(owner = "client!te", name = "ug", descriptor = "Ljava/lang/String;")
	private String aString67;

	@OriginalMember(owner = "client!te", name = "wg", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!te", name = "xg", descriptor = "Z")
	public boolean aBoolean526;

	@OriginalMember(owner = "client!te", name = "zg", descriptor = "I")
	private int anInt7907;

	@OriginalMember(owner = "client!te", name = "Bg", descriptor = "Lclient!sp;")
	private Interface16 anInterface16_7;

	@OriginalMember(owner = "client!te", name = "Dg", descriptor = "F")
	private float aFloat171;

	@OriginalMember(owner = "client!te", name = "Eg", descriptor = "Lclient!qu;")
	public Class19_Sub3 aClass19_Sub3_8;

	@OriginalMember(owner = "client!te", name = "Gg", descriptor = "Z")
	public boolean aBoolean528;

	@OriginalMember(owner = "client!te", name = "Hg", descriptor = "I")
	public int anInt7910;

	@OriginalMember(owner = "client!te", name = "Lg", descriptor = "I")
	public int anInt7912;

	@OriginalMember(owner = "client!te", name = "Mg", descriptor = "Z")
	private boolean aBoolean530;

	@OriginalMember(owner = "client!te", name = "Og", descriptor = "I")
	private int anInt7914;

	@OriginalMember(owner = "client!te", name = "Pg", descriptor = "I")
	public int anInt7915;

	@OriginalMember(owner = "client!te", name = "Sg", descriptor = "Z")
	public boolean aBoolean532;

	@OriginalMember(owner = "client!te", name = "Tg", descriptor = "Lclient!da;")
	public Class22_Sub2 aClass22_Sub2_4;

	@OriginalMember(owner = "client!te", name = "Wg", descriptor = "Lclient!qu;")
	public Class19_Sub3 aClass19_Sub3_9;

	@OriginalMember(owner = "client!te", name = "Xg", descriptor = "Lclient!qu;")
	public Class19_Sub3 aClass19_Sub3_10;

	@OriginalMember(owner = "client!te", name = "Yg", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!te", name = "Zg", descriptor = "I")
	private int anInt7918;

	@OriginalMember(owner = "client!te", name = "eh", descriptor = "I")
	private int anInt7920;

	@OriginalMember(owner = "client!te", name = "gh", descriptor = "I")
	private int anInt7921;

	@OriginalMember(owner = "client!te", name = "Lc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable9 = new Hashtable();

	@OriginalMember(owner = "client!te", name = "fe", descriptor = "I")
	public int anInt7871 = 128;

	@OriginalMember(owner = "client!te", name = "he", descriptor = "Lclient!or;")
	private final Class223 aClass223_1 = new Class223();

	@OriginalMember(owner = "client!te", name = "me", descriptor = "Lclient!da;")
	private final Class22_Sub2 aClass22_Sub2_1 = new Class22_Sub2();

	@OriginalMember(owner = "client!te", name = "ne", descriptor = "Lclient!da;")
	public final Class22_Sub2 aClass22_Sub2_2 = new Class22_Sub2();

	@OriginalMember(owner = "client!te", name = "pe", descriptor = "I")
	public int anInt7874 = 3;

	@OriginalMember(owner = "client!te", name = "oe", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "client!te", name = "te", descriptor = "I")
	public int anInt7875 = 8;

	@OriginalMember(owner = "client!te", name = "se", descriptor = "Lclient!bu;")
	private final Class38 aClass38_61 = new Class38();

	@OriginalMember(owner = "client!te", name = "we", descriptor = "I")
	private int anInt7877 = -1;

	@OriginalMember(owner = "client!te", name = "ze", descriptor = "I")
	private int anInt7879 = -1;

	@OriginalMember(owner = "client!te", name = "ye", descriptor = "I")
	private int anInt7878 = -1;

	@OriginalMember(owner = "client!te", name = "ve", descriptor = "[Lclient!np;")
	private final Interface12[] anInterface12Array1 = new Interface12[4];

	@OriginalMember(owner = "client!te", name = "Be", descriptor = "[Lclient!np;")
	private final Interface12[] anInterface12Array2 = new Interface12[4];

	@OriginalMember(owner = "client!te", name = "Ce", descriptor = "[Lclient!np;")
	private final Interface12[] anInterface12Array3 = new Interface12[4];

	@OriginalMember(owner = "client!te", name = "De", descriptor = "Lclient!bu;")
	private final Class38 aClass38_62;

	@OriginalMember(owner = "client!te", name = "He", descriptor = "Lclient!bu;")
	private final Class38 aClass38_63;

	@OriginalMember(owner = "client!te", name = "Ie", descriptor = "Lclient!bu;")
	private final Class38 aClass38_64;

	@OriginalMember(owner = "client!te", name = "Je", descriptor = "Lclient!bu;")
	private final Class38 aClass38_65;

	@OriginalMember(owner = "client!te", name = "Ke", descriptor = "Lclient!bu;")
	private final Class38 aClass38_66;

	@OriginalMember(owner = "client!te", name = "Le", descriptor = "Lclient!bu;")
	private final Class38 aClass38_67;

	@OriginalMember(owner = "client!te", name = "Me", descriptor = "Lclient!bu;")
	private final Class38 aClass38_68;

	@OriginalMember(owner = "client!te", name = "Oe", descriptor = "F")
	public float aFloat153;

	@OriginalMember(owner = "client!te", name = "Ye", descriptor = "I")
	public int anInt7886;

	@OriginalMember(owner = "client!te", name = "ff", descriptor = "I")
	public int anInt7887;

	@OriginalMember(owner = "client!te", name = "If", descriptor = "I")
	private int anInt7895;

	@OriginalMember(owner = "client!te", name = "Se", descriptor = "I")
	private int anInt7884;

	@OriginalMember(owner = "client!te", name = "cf", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!te", name = "of", descriptor = "[F")
	private final float[] aFloatArray64;

	@OriginalMember(owner = "client!te", name = "Zf", descriptor = "I")
	public int anInt7898;

	@OriginalMember(owner = "client!te", name = "Rf", descriptor = "F")
	private float aFloat164;

	@OriginalMember(owner = "client!te", name = "Wf", descriptor = "I")
	private int anInt7897;

	@OriginalMember(owner = "client!te", name = "Lf", descriptor = "[F")
	private final float[] aFloatArray66;

	@OriginalMember(owner = "client!te", name = "jg", descriptor = "F")
	private float aFloat168;

	@OriginalMember(owner = "client!te", name = "hg", descriptor = "I")
	public int anInt7900;

	@OriginalMember(owner = "client!te", name = "ef", descriptor = "F")
	private float aFloat159;

	@OriginalMember(owner = "client!te", name = "Pf", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!te", name = "ig", descriptor = "F")
	private float aFloat167;

	@OriginalMember(owner = "client!te", name = "ag", descriptor = "I")
	public int anInt7899;

	@OriginalMember(owner = "client!te", name = "Yf", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!te", name = "dg", descriptor = "[F")
	private final float[] aFloatArray67;

	@OriginalMember(owner = "client!te", name = "kg", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!te", name = "tf", descriptor = "I")
	private int anInt7889;

	@OriginalMember(owner = "client!te", name = "Xe", descriptor = "F")
	private float aFloat156;

	@OriginalMember(owner = "client!te", name = "Af", descriptor = "I")
	public int anInt7893;

	@OriginalMember(owner = "client!te", name = "Cg", descriptor = "I")
	public int anInt7908;

	@OriginalMember(owner = "client!te", name = "Fg", descriptor = "I")
	public int anInt7909;

	@OriginalMember(owner = "client!te", name = "rg", descriptor = "I")
	private int anInt7904;

	@OriginalMember(owner = "client!te", name = "wf", descriptor = "[F")
	public final float[] aFloatArray65;

	@OriginalMember(owner = "client!te", name = "tg", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!te", name = "vg", descriptor = "I")
	private int anInt7905;

	@OriginalMember(owner = "client!te", name = "Kg", descriptor = "Z")
	private boolean aBoolean529;

	@OriginalMember(owner = "client!te", name = "mf", descriptor = "[F")
	private final float[] aFloatArray63;

	@OriginalMember(owner = "client!te", name = "Ig", descriptor = "I")
	public int anInt7911;

	@OriginalMember(owner = "client!te", name = "Jg", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!te", name = "Rg", descriptor = "I")
	private int anInt7916;

	@OriginalMember(owner = "client!te", name = "yg", descriptor = "I")
	private int anInt7906;

	@OriginalMember(owner = "client!te", name = "Ne", descriptor = "I")
	public int anInt7883;

	@OriginalMember(owner = "client!te", name = "Ug", descriptor = "I")
	public int anInt7917;

	@OriginalMember(owner = "client!te", name = "lf", descriptor = "I")
	private int anInt7888;

	@OriginalMember(owner = "client!te", name = "ah", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!te", name = "bh", descriptor = "I")
	private int anInt7919;

	@OriginalMember(owner = "client!te", name = "ch", descriptor = "[Lclient!nm;")
	private final Class1_Sub27[] aClass1_Sub27Array5;

	@OriginalMember(owner = "client!te", name = "gg", descriptor = "Lclient!eo;")
	public Class1_Sub13_Sub1 aClass1_Sub13_Sub1_3;

	@OriginalMember(owner = "client!te", name = "fh", descriptor = "[I")
	public int[] anIntArray617;

	@OriginalMember(owner = "client!te", name = "ih", descriptor = "[I")
	public int[] anIntArray619;

	@OriginalMember(owner = "client!te", name = "hh", descriptor = "[I")
	public int[] anIntArray618;

	@OriginalMember(owner = "client!te", name = "jh", descriptor = "[B")
	public final byte[] aByteArray95;

	@OriginalMember(owner = "client!te", name = "zd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas13;

	@OriginalMember(owner = "client!te", name = "jb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!te", name = "ie", descriptor = "I")
	public final int anInt7872;

	@OriginalMember(owner = "client!te", name = "bb", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!te", name = "Y", descriptor = "J")
	private final long aLong207;

	@OriginalMember(owner = "client!te", name = "Ab", descriptor = "J")
	private long aLong208;

	@OriginalMember(owner = "client!te", name = "Ng", descriptor = "I")
	public final int anInt7913;

	@OriginalMember(owner = "client!te", name = "pf", descriptor = "Z")
	private boolean aBoolean511;

	@OriginalMember(owner = "client!te", name = "Uf", descriptor = "Z")
	public boolean aBoolean519;

	@OriginalMember(owner = "client!te", name = "dh", descriptor = "Z")
	public boolean aBoolean534;

	@OriginalMember(owner = "client!te", name = "Kf", descriptor = "Z")
	public boolean aBoolean515;

	@OriginalMember(owner = "client!te", name = "Vg", descriptor = "Z")
	public boolean aBoolean533;

	@OriginalMember(owner = "client!te", name = "Sf", descriptor = "Z")
	private boolean aBoolean517;

	@OriginalMember(owner = "client!te", name = "Ag", descriptor = "Z")
	public boolean aBoolean527;

	@OriginalMember(owner = "client!te", name = "Qg", descriptor = "Z")
	private final boolean aBoolean531;

	@OriginalMember(owner = "client!te", name = "be", descriptor = "Lclient!tj;")
	private final Class275 aClass275_1;

	@OriginalMember(owner = "client!te", name = "qe", descriptor = "Lclient!oaa;")
	public final Class211 aClass211_1;

	@OriginalMember(owner = "client!te", name = "le", descriptor = "Lclient!kf;")
	private final Class161 aClass161_1;

	@OriginalMember(owner = "client!te", name = "je", descriptor = "Lclient!rj;")
	private Class1_Sub14_Sub1 aClass1_Sub14_Sub1_1;

	@OriginalMember(owner = "client!te", name = "ge", descriptor = "Lclient!cm;")
	private final Class46 aClass46_1;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;I)V")
	public Class9_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class307();
		new Class174(16);
		this.aClass38_62 = new Class38();
		this.aClass38_63 = new Class38();
		this.aClass38_64 = new Class38();
		this.aClass38_65 = new Class38();
		this.aClass38_66 = new Class38();
		this.aClass38_67 = new Class38();
		this.aClass38_68 = new Class38();
		this.aFloat153 = 3584.0F;
		this.anInt7886 = 0;
		this.anInt7887 = -1;
		this.anInt7895 = 0;
		this.anInt7884 = 0;
		this.aFloat158 = 3584.0F;
		this.aFloatArray64 = new float[4];
		this.anInt7898 = 50;
		this.aFloat164 = 1.0F;
		this.anInt7897 = 0;
		this.aFloatArray66 = new float[16];
		this.aFloat168 = -1.0F;
		this.anInt7900 = 0;
		this.aFloat159 = 1.0F;
		this.aFloat163 = 3000.0F;
		this.aFloat167 = -1.0F;
		this.anInt7899 = -1;
		this.aFloat165 = 1.0F;
		this.aFloatArray67 = new float[4];
		this.aFloat169 = 1.0F;
		this.anInt7889 = 8448;
		this.aFloat156 = 0.0F;
		this.anInt7893 = 512;
		this.anInt7908 = -1;
		this.anInt7909 = 0;
		this.anInt7904 = 0;
		this.aFloatArray65 = new float[4];
		this.aFloat170 = -1.0F;
		this.anInt7905 = 8448;
		this.aBoolean529 = true;
		this.aFloatArray63 = new float[4];
		this.anInt7911 = 512;
		this.aFloat172 = 1.0F;
		this.anInt7916 = -1;
		this.anInt7906 = -1;
		this.anInt7883 = 3584;
		this.anInt7917 = 0;
		this.anInt7888 = 0;
		this.aFloat174 = -1.0F;
		this.anInt7919 = 0;
		this.aClass1_Sub27Array5 = new Class1_Sub27[Static509.anInt8629];
		this.aClass1_Sub13_Sub1_3 = new Class1_Sub13_Sub1(8192);
		this.anIntArray617 = new int[1];
		this.anIntArray619 = new int[1];
		this.anIntArray618 = new int[1];
		this.aByteArray95 = new byte[16384];
		this.aCanvas12 = this.aCanvas13 = arg0;
		this.anInt7872 = arg2;
		if (!Static531.method7565("jaclib")) {
			throw new RuntimeException("");
		} else if (Static531.method7565("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong208 = this.aLong207 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt7872);
				if (this.aLong207 == 0L) {
					throw new RuntimeException("");
				}
				this.method6653();
				@Pc(318) int local318 = this.method6669();
				if (local318 != 0) {
					throw new RuntimeException("");
				}
				this.anInt7913 = this.aBoolean523 ? 33639 : 5121;
				@Pc(344) int local344;
				if (this.aString67.indexOf("radeon") != -1) {
					local344 = 0;
					@Pc(346) boolean local346 = false;
					@Pc(348) boolean local348 = false;
					@Pc(357) String[] local357 = Static12.method678(' ', this.aString67.replace('/', ' '));
					for (@Pc(359) int local359 = 0; local359 < local357.length; local359++) {
						@Pc(364) String local364 = local357[local359];
						try {
							if (local364.length() > 0) {
								if (local364.charAt(0) == 'x' && local364.length() >= 3 && Static138.method7942(local364.substring(1, 3))) {
									local348 = true;
									local364 = local364.substring(1);
								}
								if (local364.equals("hd")) {
									local346 = true;
								} else {
									if (local364.startsWith("hd")) {
										local364 = local364.substring(2);
										local346 = true;
									}
									if (local364.length() >= 4 && Static138.method7942(local364.substring(0, 4))) {
										local344 = Static485.method7022(local364.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(430) Exception local430) {
						}
					}
					if (!local348 && !local346) {
						if (local344 >= 7000 && local344 <= 7999) {
							this.aBoolean511 = false;
						}
						if (local344 >= 7000 && local344 <= 9250) {
							this.aBoolean519 = false;
						}
					}
					if (!local346 || local344 < 4000) {
						this.aBoolean534 = false;
					}
					this.aBoolean515 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean533 = true;
					this.aBoolean517 = this.aBoolean511;
				}
				if (this.aString66.indexOf("intel") != -1) {
					this.aBoolean527 = false;
				}
				this.aBoolean531 = !this.aString66.equals("s3 graphics");
				if (this.aBoolean511) {
					try {
						@Pc(517) int[] local517 = new int[1];
						OpenGL.glGenBuffersARB(1, local517, 0);
					} catch (@Pc(523) Throwable local523) {
						throw new RuntimeException("");
					}
				}
				Static105.method2288(false, true);
				this.aBoolean506 = true;
				this.aClass275_1 = new Class275(this, super.anInterface8_13);
				this.method6692();
				this.aClass211_1 = new Class211(this);
				this.aClass161_1 = new Class161(this);
				if (this.aClass161_1.method4238()) {
					this.aClass1_Sub14_Sub1_1 = new Class1_Sub14_Sub1(this);
					if (!this.aClass1_Sub14_Sub1_1.method6200()) {
						this.aClass1_Sub14_Sub1_1.method6196();
						this.aClass1_Sub14_Sub1_1 = null;
					}
				}
				this.aClass46_1 = new Class46(this);
				this.method6704();
				this.method6671();
				OpenGL.glClear(16640);
				local344 = 0;
				while (true) {
					try {
						this.anOpenGL2.swapBuffers();
						break;
					} catch (@Pc(602) Exception local602) {
						if (local344++ > 5) {
							throw new RuntimeException("");
						}
						Static505.method7295(100L);
					}
				}
				OpenGL.glClear(16384);
			} catch (@Pc(621) Throwable local621) {
				local621.printStackTrace();
				this.method7566();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!te", name = "N", descriptor = "(IIII)V")
	@Override
	public void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt7712) {
			arg3 = this.anInt7712;
		}
		if (this.anInt7756 < arg2) {
			arg2 = this.anInt7756;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt7888 = arg3;
		this.anInt7919 = arg1;
		this.anInt7897 = arg2;
		this.anInt7904 = arg0;
		OpenGL.glEnable(3089);
		this.method6728();
		this.method6666();
	}

	@OriginalMember(owner = "client!te", name = "P", descriptor = "()F")
	@Override
	public float P() {
		return this.aFloat163;
	}

	@OriginalMember(owner = "client!te", name = "p", descriptor = "()Z")
	@Override
	public boolean method7605() {
		return false;
	}

	@OriginalMember(owner = "client!te", name = "ta", descriptor = "(II)V")
	@Override
	public void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt7898 && arg1 == this.anInt7883) {
			return;
		}
		this.anInt7883 = arg1;
		this.anInt7898 = arg0;
		this.method6717();
		this.method6657();
		if (this.anInt7892 == 3) {
			this.method6659();
		} else if (this.anInt7892 == 2) {
			this.method6668();
		}
	}

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		this.method6654(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!te", name = "i", descriptor = "(I)V")
	private void method6653() {
		@Pc(9) int local9 = 0;
		while (!this.anOpenGL2.b()) {
			if (local9++ > 5) {
				throw new RuntimeException("");
			}
			Static505.method7295(1000L);
		}
	}

	@OriginalMember(owner = "client!te", name = "ra", descriptor = "()F")
	@Override
	public float ra() {
		return this.aFloat162;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method6658();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method6654(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean525) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean525) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!te", name = "x", descriptor = "()V")
	@Override
	public void method7624() {
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(II)V")
	public void method6654(@OriginalArg(0) int arg0) {
		if (this.anInt7902 == arg0) {
			return;
		}
		@Pc(28) boolean local28;
		@Pc(30) byte local30;
		if (arg0 == 1) {
			local28 = true;
			local30 = 1;
		} else if (arg0 == 2) {
			local28 = false;
			local30 = 2;
		} else if (arg0 == 128) {
			local30 = 3;
			local28 = true;
		} else {
			local28 = false;
			local30 = 0;
		}
		if (!this.aBoolean524) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean524 = true;
		}
		if (this.aBoolean530 != local28) {
			if (local28) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean530 = local28;
		}
		if (this.anInt7891 != local30) {
			if (local30 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local30 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local30 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt7891 = local30;
		}
		this.anInt7885 &= 0xFFFFFFE3;
		this.anInt7902 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "la", descriptor = "(FF)V")
	@Override
	public void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat163 == arg0 && this.aFloat162 == arg1) {
			return;
		}
		this.aFloat162 = arg1;
		this.aFloat163 = arg0;
		this.method6711();
		if (this.anInt7892 == 3) {
			this.method6659();
		} else if (this.anInt7892 == 2) {
			this.method6668();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
	public void method6655(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean512) {
			this.aBoolean512 = arg0;
			this.method6674();
			this.anInt7885 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBII)V")
	public void method6656(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!te", name = "j", descriptor = "(I)V")
	private void method6657() {
		@Pc(15) int local15;
		if (this.aBoolean516) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt7906;
		} else {
			this.aFloat161 = (float) (this.anInt7883 - this.anInt7886) - this.aFloat156;
			this.aFloat160 = this.aFloat161 - (float) this.anInt7887 * this.aFloat164;
			if (this.aFloat160 < (float) this.anInt7898) {
				this.aFloat160 = this.anInt7898;
			}
			OpenGL.glFogf(2915, this.aFloat160);
			OpenGL.glFogf(2916, this.aFloat161);
			local15 = this.anInt7908;
		}
		Static222.aFloatArray36[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static222.aFloatArray36[1] = (float) (local15 & 0xFF00) / 65280.0F;
		Static222.aFloatArray36[2] = (float) (local15 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static222.aFloatArray36, 0);
		if (this.aBoolean516) {
			this.aClass46_1.aClass35_Sub5_1.method3843();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!qba;)V")
	@Override
	public void method7580(@OriginalArg(0) Class25 arg0) {
		this.aClass25_Sub1_1 = (Class25_Sub1) arg0;
	}

	@OriginalMember(owner = "client!te", name = "k", descriptor = "(I)V")
	private void method6658() {
		if (this.anInt7885 == 1) {
			return;
		}
		this.method6727();
		this.method6655(false);
		this.method6733(false);
		this.method6705(false);
		this.method6691(false);
		this.method6701(null);
		this.method6672(-2);
		this.method6670(1);
		this.anInt7885 = 1;
	}

	@OriginalMember(owner = "client!te", name = "l", descriptor = "(I)V")
	private void method6659() {
		@Pc(15) float local15 = this.aFloat159 * (float) -this.anInt7917 / (float) this.anInt7893;
		@Pc(27) float local27 = (float) -this.anInt7909 * this.aFloat159 / (float) this.anInt7911;
		@Pc(42) float local42 = this.aFloat159 * (float) (this.anInt7756 - this.anInt7917) / (float) this.anInt7893;
		@Pc(57) float local57 = this.aFloat159 * (float) (this.anInt7712 - this.anInt7909) / (float) this.anInt7911;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local42 && local27 != local57) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) ((float) this.anInt7898 - this.aFloat162), (double) ((float) this.anInt7883 - this.aFloat162));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(II)V")
	public void method6660(@OriginalArg(1) int arg0) {
		if (this.anInt7918 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt7918 = arg0;
		}
	}

	@OriginalMember(owner = "client!te", name = "h", descriptor = "()Z")
	@Override
	public boolean method7579() {
		return true;
	}

	@OriginalMember(owner = "client!te", name = "q", descriptor = "(IIII)V")
	@Override
	public void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7899 = arg2;
		this.anInt7910 = arg0;
		this.anInt7906 = arg1;
		this.aBoolean516 = true;
		this.anInt7900 = arg3;
		this.aClass46_1.method1763(0, 3, false, false, 0);
		this.aClass46_1.aClass35_Sub5_1.method3842();
		this.method6657();
		this.method6674();
	}

	@OriginalMember(owner = "client!te", name = "A", descriptor = "(IIIII)V")
	@Override
	protected void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt7904 > arg2 + arg0 || arg0 - arg2 > this.anInt7897 || this.anInt7919 > arg2 + arg1 || this.anInt7888 < arg1 - arg2) {
			return;
		}
		this.method6658();
		this.method6654(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(79) float local79 = (float) arg0 + 0.35F;
		@Pc(84) float local84 = (float) arg1 + 0.35F;
		@Pc(88) int local88 = arg2 << 1;
		if (this.aFloat167 > (float) local88) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local79 + 1.0F, local84 + 1.0F);
			OpenGL.glVertex2f(local79 + 1.0F, local84 - 1.0F);
			OpenGL.glVertex2f(local79 - 1.0F, -1.0F + local84);
			OpenGL.glVertex2f(local79 - 1.0F, local84 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local88 <= this.aFloat168) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local88);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local79, local84);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local79, local84);
			@Pc(157) int local157 = 262144 / (arg2 * 6);
			if (local157 <= 64) {
				local157 = 64;
			} else if (local157 > 512) {
				local157 = 512;
			}
			local157 = Static216.method3865(local157);
			OpenGL.glVertex2f((float) arg2 + local79, local84);
			for (@Pc(185) int local185 = 16384 - local157; local185 > 0; local185 -= local157) {
				OpenGL.glVertex2f(Class47_Sub5.aFloatArray71[local185] * (float) arg2 + local79, local84 + (float) arg2 * Class47_Sub5.aFloatArray70[local185]);
			}
			OpenGL.glVertex2f((float) arg2 + local79, local84);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "([I)V")
	@Override
	public void d(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt7919;
		arg0[3] = this.anInt7888;
		arg0[0] = this.anInt7904;
		arg0[2] = this.anInt7897;
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "()Z")
	@Override
	public boolean method7576() {
		return true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V")
	public void method6662(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean518) {
			this.aBoolean518 = arg0;
			this.method6725();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!qba;Lclient!qba;FLclient!qba;)Lclient!qba;")
	@Override
	public Class25 method7609(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class25 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean526 && this.aBoolean527) {
			@Pc(15) Class25_Sub1_Sub1 local15 = null;
			@Pc(18) Class25_Sub1 local18 = (Class25_Sub1) arg0;
			@Pc(21) Class25_Sub1 local21 = (Class25_Sub1) arg1;
			@Pc(25) Class20_Sub2 local25 = local18.method3934();
			@Pc(29) Class20_Sub2 local29 = local21.method3934();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt1675 > local29.anInt1675 ? local25.anInt1675 : local29.anInt1675;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class25_Sub1_Sub1) {
					@Pc(60) Class25_Sub1_Sub1 local60 = (Class25_Sub1_Sub1) arg3;
					if (local48 == local60.method1219()) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class25_Sub1_Sub1(this, local48);
				}
				if (local15.method1217(local29, local25, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!te", name = "m", descriptor = "(I)Lclient!ci;")
	public Class20_Sub2 method6663() {
		return this.aClass25_Sub1_1 == null ? null : this.aClass25_Sub1_1.method3934();
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(ZI)V")
	public void method6664(@OriginalArg(1) int arg0) {
		Static222.aFloatArray36[3] = (float) (arg0 >>> 24) / 255.0F;
		Static222.aFloatArray36[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static222.aFloatArray36[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static222.aFloatArray36[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static222.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	@Override
	public void method7610(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!np;)V")
	public void method6665(@OriginalArg(1) Interface12 arg0) {
		if (this.anInt7879 < 0 || arg0 != this.anInterface12Array3[this.anInt7879]) {
			throw new RuntimeException();
		}
		this.anInterface12Array3[this.anInt7879--] = null;
		arg0.method5221();
		if (this.anInt7879 < 0) {
			this.anInterface12_2 = null;
		} else {
			this.anInterface12_2 = this.anInterface12Array3[this.anInt7879];
			this.anInterface12_2.method5223();
		}
	}

	@OriginalMember(owner = "client!te", name = "UA", descriptor = "(IIIII)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6658();
		this.method6654(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
	private void method6666() {
		if (this.anInt7904 <= this.anInt7897 && this.anInt7888 >= this.anInt7919) {
			OpenGL.glScissor(this.anInt7884 + this.anInt7904, -this.anInt7888 + this.anInt7712 + this.anInt7895, this.anInt7897 - this.anInt7904, this.anInt7888 + -this.anInt7919);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!te", name = "z", descriptor = "()Z")
	@Override
	public boolean method7630() {
		return true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I")
	@Override
	public int method7606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!te", name = "n", descriptor = "(I)V")
	private void method6667() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt7890; local7++) {
			@Pc(14) Class1_Sub27 local14 = this.aClass1_Sub27Array5[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static152.aFloatArray32[0] = local14.method5493();
			Static152.aFloatArray32[1] = local14.method5487();
			Static152.aFloatArray32[2] = local14.method5495();
			Static152.aFloatArray32[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static152.aFloatArray32, 0);
			@Pc(52) int local52 = local14.method5488();
			@Pc(58) float local58 = local14.method5486() / 255.0F;
			Static152.aFloatArray32[1] = local58 * (float) (local52 >> 8 & 0xFF);
			Static152.aFloatArray32[0] = (float) (local52 >> 16 & 0xFF) * local58;
			Static152.aFloatArray32[2] = local58 * (float) (local52 & 0xFF);
			OpenGL.glLightfv(local18, 4609, Static152.aFloatArray32, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method5496() * local14.method5496()));
			OpenGL.glEnable(local18);
		}
		while (local7 < this.anInt7896) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt7896 = this.anInt7890;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public Class23 method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static201.method3747(this, arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass161_1.method4233(arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!te", name = "o", descriptor = "(I)V")
	private void method6668() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray66, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!te", name = "p", descriptor = "(I)I")
	private int method6669() {
		@Pc(5) int local5 = 0;
		this.aString66 = OpenGL.glGetString(7936).toLowerCase();
		this.aString67 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString66.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString66.indexOf("brian paul") != -1 || this.aString66.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static12.method678(' ', local44.replace('.', ' '));
		if (local54.length >= 2) {
			try {
				@Pc(64) int local64 = Static485.method7022(local54[0]);
				@Pc(70) int local70 = Static485.method7022(local54[1]);
				this.anInt7907 = local64 * 10 + local70;
			} catch (@Pc(80) NumberFormatException local80) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt7907 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(118) int[] local118 = new int[1];
		OpenGL.glGetIntegerv(34018, local118, 0);
		this.anInt7894 = local118[0];
		OpenGL.glGetIntegerv(34929, local118, 0);
		this.anInt7914 = local118[0];
		OpenGL.glGetIntegerv(34930, local118, 0);
		this.anInt7901 = local118[0];
		if (this.anInt7894 < 2 || this.anInt7914 < 2 || this.anInt7901 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean523 = Stream.c();
		this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean511 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean525 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean528 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean532 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean520 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean519 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean515 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean526 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean534 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean513 = false;
		this.aBoolean527 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean509 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean514 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean521 = this.aBoolean514 & this.aBoolean509;
		OpenGL.glGetFloatv(2834, Static222.aFloatArray36, 0);
		this.aFloat167 = Static222.aFloatArray36[0];
		this.aFloat168 = Static222.aFloatArray36[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!te", name = "C", descriptor = "()Lclient!m;")
	@Override
	public Class22 method7642() {
		return this.aClass22_Sub2_1;
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(II)V")
	public void method6670(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method6732(7681, 7681);
		} else if (arg0 == 0) {
			this.method6732(8448, 8448);
		} else if (arg0 == 2) {
			this.method6732(34165, 7681);
		} else if (arg0 == 3) {
			this.method6732(260, 8448);
		} else if (arg0 == 4) {
			this.method6732(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
	@Override
	public void method7596(@OriginalArg(0) int arg0) {
		this.method6653();
	}

	@OriginalMember(owner = "client!te", name = "q", descriptor = "(I)V")
	private void method6671() {
		if (this.aCanvas12 == null) {
			this.anInt7710 = this.anInt7695 = 0;
		} else {
			@Pc(17) Dimension local17 = this.aCanvas12.getSize();
			this.anInt7695 = local17.height;
			this.anInt7710 = local17.width;
		}
		if (this.anInterface12_2 == null) {
			this.anInt7712 = this.anInt7695;
			this.anInt7756 = this.anInt7710;
			this.method6678();
		}
		this.method6690();
		this.n();
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IZ)V")
	public void method6672(@OriginalArg(0) int arg0) {
		this.method6695(arg0, true);
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(IIIII)V")
	@Override
	public void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6658();
		this.method6654(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!np;)V")
	public void method6673(@OriginalArg(1) Interface12 arg0) {
		if (this.anInt7878 < 0 || arg0 != this.anInterface12Array2[this.anInt7878]) {
			throw new RuntimeException();
		}
		this.anInterface12Array2[this.anInt7878--] = null;
		arg0.method5220();
		if (this.anInt7878 >= 0) {
			this.anInterface12_1 = this.anInterface12Array2[this.anInt7878];
			this.anInterface12_1.method5225();
		} else {
			this.anInterface12_1 = null;
		}
	}

	@OriginalMember(owner = "client!te", name = "r", descriptor = "(I)V")
	private void method6674() {
		if (this.aBoolean512 && this.anInt7887 >= 0 | this.aBoolean516) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
	private void method6675() {
		OpenGL.glDepthMask(this.aBoolean510 && this.aBoolean529);
	}

	@OriginalMember(owner = "client!te", name = "E", descriptor = "(III)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt7908 && arg1 == this.anInt7887 && this.anInt7886 == arg2) {
			return;
		}
		this.anInt7887 = arg1;
		this.anInt7908 = arg0;
		this.anInt7886 = arg2;
		if (this.aBoolean516) {
			return;
		}
		this.method6657();
		this.method6674();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class10 method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class10_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!np;I)V")
	public void method6676(@OriginalArg(0) Interface12 arg0) {
		if (this.anInt7879 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7879 >= 0) {
			this.anInterface12Array3[this.anInt7879].method5221();
		}
		this.anInterface12_2 = this.anInterface12Array3[++this.anInt7879] = arg0;
		this.anInterface12_2.method5223();
	}

	@OriginalMember(owner = "client!te", name = "s", descriptor = "(I)V")
	private void method6677() {
		if (this.aBoolean507) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean507 = false;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
	@Override
	public void method7589(@OriginalArg(0) boolean arg0) {
		this.aBoolean529 = arg0;
		this.method6675();
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
	private void method6678() {
		OpenGL.glViewport(this.anInt7884, this.anInt7895, this.anInt7756, this.anInt7712);
	}

	@OriginalMember(owner = "client!te", name = "t", descriptor = "(I)V")
	public void method6679() {
		if (this.anInt7885 == 8) {
			return;
		}
		this.method6723();
		this.method6655(true);
		this.method6705(true);
		this.method6691(true);
		this.method6654(1);
		this.anInt7885 = 8;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!rd;)V")
	@Override
	public void method7577(@OriginalArg(0) Class249 arg0) {
		this.aClass223_1.method5596(arg0, this);
	}

	@OriginalMember(owner = "client!te", name = "u", descriptor = "(I)V")
	private void method6680() {
		Static222.aFloatArray36[3] = 1.0F;
		Static222.aFloatArray36[0] = this.aFloat170 * this.aFloat169;
		Static222.aFloatArray36[1] = this.aFloat170 * this.aFloat165;
		Static222.aFloatArray36[2] = this.aFloat170 * this.aFloat172;
		OpenGL.glLightfv(16384, 4609, Static222.aFloatArray36, 0);
		Static222.aFloatArray36[2] = this.aFloat172 * -this.aFloat174;
		Static222.aFloatArray36[0] = this.aFloat169 * -this.aFloat174;
		Static222.aFloatArray36[1] = this.aFloat165 * -this.aFloat174;
		Static222.aFloatArray36[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static222.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!te", name = "k", descriptor = "()V")
	@Override
	public void method7586() {
		if (!this.aBoolean531 || this.anInt7756 <= 0 || this.anInt7712 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt7904;
		@Pc(25) int local25 = this.anInt7897;
		@Pc(28) int local28 = this.anInt7919;
		@Pc(31) int local31 = this.anInt7888;
		this.n();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6690();
		this.method6655(false);
		this.method6733(false);
		this.method6705(false);
		this.method6691(false);
		this.method6701(null);
		this.method6672(-2);
		this.method6670(1);
		this.method6654(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt7756, this.anInt7712, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.N(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7592(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable9.containsKey(arg0)) {
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
			this.aHashtable9.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!te", name = "v", descriptor = "(I)V")
	private void method6681() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, (float) 1, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass22_Sub2_4.method1960(), 0);
		if (this.aBoolean516) {
			this.aClass46_1.aClass35_Sub5_1.method3842();
		}
		this.method6731();
		this.method6667();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
	public void method6682(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7895 = arg0;
		this.anInt7884 = arg1;
		this.method6678();
		this.method6666();
	}

	@OriginalMember(owner = "client!te", name = "h", descriptor = "(II)V")
	public synchronized void method6683(@OriginalArg(1) int arg0) {
		@Pc(13) Class1 local13 = new Class1();
		local13.aLong244 = arg0;
		this.aClass38_67.method1426(local13);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IF)V")
	public void method6684(@OriginalArg(1) float arg0) {
		if (this.aFloat159 == arg0) {
			return;
		}
		this.aFloat159 = arg0;
		if (this.anInt7892 == 3) {
			this.method6659();
			return;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(III)V")
	public synchronized void method6685(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub33 local8 = new Class1_Sub33(arg0);
		local8.aLong244 = arg1;
		this.aClass38_66.method1426(local8);
	}

	@OriginalMember(owner = "client!te", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt7882 + this.anInt7881 + this.anInt7880;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I[Lclient!nm;)V")
	@Override
	public void method7588(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub27[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass1_Sub27Array5[local3] = arg1[local3];
		}
		this.anInt7890 = arg0;
		if (this.anInt7892 != 1) {
			this.method6667();
		}
	}

	@OriginalMember(owner = "client!te", name = "L", descriptor = "(I)V")
	@Override
	public void L(@OriginalArg(0) int arg0) {
		this.anInt7874 = 0;
		while (arg0 > 1) {
			this.anInt7874++;
			arg0 >>= 0x1;
		}
		this.anInt7875 = 0x1 << this.anInt7874;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "()V")
	@Override
	public void method7570() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(III)V")
	public synchronized void method6686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub33 local8 = new Class1_Sub33(arg0);
		local8.aLong244 = arg1;
		this.aClass38_63.method1426(local8);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	@Override
	public void method7584(@OriginalArg(0) int arg0) {
		this.method6699();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([BIBIZ)Lclient!mj;")
	public Interface7 method6687(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean arg2) {
		return (Interface7) (this.aBoolean511 && (!arg2 || this.aBoolean517) ? new Class41_Sub2(this, 5123, arg0, arg1, arg2) : new Class92_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!fd;IIII)Lclient!r;")
	@Override
	public Class19 method7635(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class19_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method6658();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method6654(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean525) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean525) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!te", name = "s", descriptor = "()V")
	@Override
	public void method7619() {
		this.aClass161_1.method4230();
	}

	@OriginalMember(owner = "client!te", name = "A", descriptor = "()V")
	@Override
	public void method7637() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!te", name = "l", descriptor = "()Z")
	@Override
	public boolean method7591() {
		return this.aClass1_Sub14_Sub1_1 != null && this.aClass1_Sub14_Sub1_1.method6197();
	}

	@OriginalMember(owner = "client!te", name = "i", descriptor = "(II)I")
	public int method6688(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!da;B)V")
	public void method6689(@OriginalArg(0) Class22_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method1960(), 0);
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(Z)V")
	public void method6690() {
		if (this.anInt7892 != 0) {
			this.anInt7892 = 0;
			this.anInt7885 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZB)V")
	public void method6691(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean510 != arg0) {
			this.aBoolean510 = arg0;
			this.method6675();
			this.anInt7885 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V")
	private void method6692() {
		this.aClass22_Sub2_4 = new Class22_Sub2();
		this.aClass22_Sub2_3 = new Class22_Sub2();
		this.aClass20Array1 = new Class20[this.anInt7894];
		this.aClass20_Sub3_5 = new Class20_Sub3(this, 3553, 6408, 1, 1);
		new Class20_Sub3(this, 3553, 6408, 1, 1);
		new Class20_Sub3(this, 3553, 6408, 1, 1);
		this.aClass19_Sub3_7 = new Class19_Sub3(this);
		this.aClass19_Sub3_9 = new Class19_Sub3(this);
		this.aClass19_Sub3_10 = new Class19_Sub3(this);
		this.aClass19_Sub3_3 = new Class19_Sub3(this);
		this.aClass19_Sub3_8 = new Class19_Sub3(this);
		this.aClass19_Sub3_5 = new Class19_Sub3(this);
		this.aClass19_Sub3_2 = new Class19_Sub3(this);
		this.aClass19_Sub3_4 = new Class19_Sub3(this);
		this.aClass19_Sub3_1 = new Class19_Sub3(this);
		this.aClass19_Sub3_6 = new Class19_Sub3(this);
		if (this.aBoolean527) {
			this.aClass205_6 = new Class205(this);
			new Class205(this);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)V")
	public synchronized void method6693(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub33 local12 = new Class1_Sub33(arg1);
		local12.aLong244 = arg0;
		this.aClass38_64.method1426(local12);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!da;)V")
	public void method6694(@OriginalArg(1) Class22_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method1960(), 0);
	}

	@OriginalMember(owner = "client!te", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		@Pc(6) int local6 = this.anInt7920;
		this.anInt7920 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BIZ)V")
	public void method6695(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		this.method6718(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6658();
		this.method6654(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local23 * local23 + local16 * local16)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(55) float local55 = local23 * local36;
		@Pc(59) float local59 = local16 * local36;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local59 + (float) arg2 + 0.35F, (float) arg3 + 0.35F + local55);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!np;B)V")
	public void method6696(@OriginalArg(0) Interface12 arg0) {
		if (this.anInt7878 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7878 >= 0) {
			this.anInterface12Array2[this.anInt7878].method5220();
		}
		this.anInterface12_1 = this.anInterface12Array2[++this.anInt7878] = arg0;
		this.anInterface12_1.method5225();
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(Z)V")
	private void method6697() {
		if (this.anInt7892 != 3) {
			this.anInt7892 = 3;
			this.method6659();
			this.method6681();
			this.anInt7885 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public Class12 method7641(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class12_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(ILclient!np;)V")
	public void method6698(@OriginalArg(1) Interface12 arg0) {
		if (this.aBoolean509) {
			this.method6696(arg0);
			this.method6676(arg0);
		} else if (this.anInt7877 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt7877 >= 0) {
				this.anInterface12Array1[this.anInt7877].method5224();
			}
			this.anInterface12_1 = this.anInterface12_2 = this.anInterface12Array1[++this.anInt7877] = arg0;
			this.anInterface12_1.method5222();
		}
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(Z)V")
	private void method6699() {
		this.anOpenGL2.a();
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(IIII)V")
	public void method6700(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V")
	@Override
	public void method7643(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!jl;)V")
	public void method6701(@OriginalArg(1) Class20 arg0) {
		@Pc(9) Class20 local9 = this.aClass20Array1[this.anInt7918];
		if (arg0 != local9) {
			if (arg0 == null) {
				OpenGL.glDisable(local9.anInt7329);
			} else {
				if (local9 == null) {
					OpenGL.glEnable(arg0.anInt7329);
				} else if (local9.anInt7329 != arg0.anInt7329) {
					OpenGL.glDisable(local9.anInt7329);
					OpenGL.glEnable(arg0.anInt7329);
				}
				OpenGL.glBindTexture(arg0.anInt7329, arg0.method6247());
			}
			this.aClass20Array1[this.anInt7918] = arg0;
		}
		this.anInt7885 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(B)V")
	private void method6702() {
		Static222.aFloatArray36[3] = 1.0F;
		Static222.aFloatArray36[1] = this.aFloat165 * this.aFloat157;
		Static222.aFloatArray36[0] = this.aFloat169 * this.aFloat157;
		Static222.aFloatArray36[2] = this.aFloat172 * this.aFloat157;
		OpenGL.glLightModelfv(2899, Static222.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!te", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt7916 != arg0;
		if (local15 || arg1 != this.aFloat170 || this.aFloat174 != arg2) {
			this.aFloat170 = arg1;
			this.aFloat174 = arg2;
			this.anInt7916 = arg0;
			if (local15) {
				this.aFloat169 = (float) (this.anInt7916 & 0xFF0000) / 1.671168E7F;
				this.aFloat165 = (float) (this.anInt7916 & 0xFF00) / 65280.0F;
				this.aFloat172 = (float) (this.anInt7916 & 0xFF) / 255.0F;
				this.method6702();
			}
			this.method6680();
		}
		if (this.aFloatArray67[0] == arg3 && arg4 == this.aFloatArray67[1] && this.aFloatArray67[2] == arg5) {
			return;
		}
		this.aFloatArray67[2] = arg5;
		this.aFloatArray67[0] = arg3;
		this.aFloatArray67[1] = arg4;
		this.aFloatArray63[2] = -arg5;
		this.aFloatArray63[1] = -arg4;
		this.aFloatArray63[0] = -arg3;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray65[2] = arg5 * local142;
		this.aFloatArray65[1] = arg4 * local142;
		this.aFloatArray65[0] = arg3 * local142;
		this.aFloatArray64[0] = -this.aFloatArray65[0];
		this.aFloatArray64[2] = -this.aFloatArray65[2];
		this.aFloatArray64[1] = -this.aFloatArray65[1];
		this.method6731();
		this.anInt7912 = (int) (arg5 * 256.0F / arg4);
		this.anInt7915 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!te", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass22_Sub2_4.aFloat61 + (float) arg2 * this.aClass22_Sub2_4.aFloat69 + this.aClass22_Sub2_4.aFloat62 * (float) arg0 + this.aClass22_Sub2_4.aFloat70 * (float) arg1;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass22_Sub2_4.aFloat61 + (float) arg4 * this.aClass22_Sub2_4.aFloat70 + this.aClass22_Sub2_4.aFloat62 * (float) arg3 + (float) arg5 * this.aClass22_Sub2_4.aFloat69;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt7898 && local59 < (float) this.anInt7898 || !(!(local28 > (float) this.anInt7883) || !((float) this.anInt7883 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt7893 * ((float) arg1 * this.aClass22_Sub2_4.aFloat64 + (float) arg0 * this.aClass22_Sub2_4.aFloat71 + (float) arg2 * this.aClass22_Sub2_4.aFloat63 + this.aClass22_Sub2_4.aFloat67) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt7893 * (this.aClass22_Sub2_4.aFloat67 + (float) arg3 * this.aClass22_Sub2_4.aFloat71 + this.aClass22_Sub2_4.aFloat64 * (float) arg4 + this.aClass22_Sub2_4.aFloat63 * (float) arg5) / local59);
		if ((float) local123 < this.aFloat173 && (float) local155 < this.aFloat173 || this.aFloat154 < (float) local123 && (float) local155 > this.aFloat154) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass22_Sub2_4.aFloat66 * (float) arg2 + (float) arg0 * this.aClass22_Sub2_4.aFloat68 + (float) arg1 * this.aClass22_Sub2_4.aFloat65 + this.aClass22_Sub2_4.aFloat60) * (float) this.anInt7911 / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt7911 * ((float) arg5 * this.aClass22_Sub2_4.aFloat66 + this.aClass22_Sub2_4.aFloat68 * (float) arg3 + (float) arg4 * this.aClass22_Sub2_4.aFloat65 + this.aClass22_Sub2_4.aFloat60) / local59);
			return (!((float) local213 < this.aFloat166) || !((float) local245 < this.aFloat166)) && (!((float) local213 > this.aFloat155) || !((float) local245 > this.aFloat155));
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()V")
	@Override
	protected void method7566() {
		for (@Pc(8) Class1 local8 = this.aClass38_61.method1419(); local8 != null; local8 = this.aClass38_61.method1415()) {
			((Class1_Sub16_Sub1) local8).method2790();
		}
		if (this.aClass161_1 != null) {
			this.aClass161_1.method4229();
		}
		if (this.anOpenGL2 != null) {
			this.method6699();
			@Pc(37) Enumeration local37 = this.aHashtable9.keys();
			while (local37.hasMoreElements()) {
				@Pc(42) Canvas local42 = (Canvas) local37.nextElement();
				@Pc(48) Long local48 = (Long) this.aHashtable9.get(local42);
				this.anOpenGL2.releaseSurface(local42, local48);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean506) {
			Static88.method2132(true, false);
			this.aBoolean506 = false;
		}
	}

	@OriginalMember(owner = "client!te", name = "r", descriptor = "()Z")
	@Override
	public boolean method7614() {
		return true;
	}

	@OriginalMember(owner = "client!te", name = "t", descriptor = "()Z")
	@Override
	public boolean method7620() {
		return true;
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method7613(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class1_Sub33 local19;
		while (!this.aClass38_63.method1414()) {
			local19 = (Class1_Sub33) this.aClass38_63.method1423();
			Static6.anIntArray12[local7++] = (int) local19.aLong244;
			this.anInt7882 -= local19.anInt6397;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static6.anIntArray12, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static6.anIntArray12, 0);
			local7 = 0;
		}
		while (!this.aClass38_64.method1414()) {
			local19 = (Class1_Sub33) this.aClass38_64.method1423();
			Static6.anIntArray12[local7++] = (int) local19.aLong244;
			this.anInt7881 -= local19.anInt6397;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static6.anIntArray12, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static6.anIntArray12, 0);
			local7 = 0;
		}
		while (!this.aClass38_65.method1414()) {
			local19 = (Class1_Sub33) this.aClass38_65.method1423();
			Static6.anIntArray12[local7++] = local19.anInt6397;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static6.anIntArray12, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static6.anIntArray12, 0);
			local7 = 0;
		}
		while (!this.aClass38_66.method1414()) {
			local19 = (Class1_Sub33) this.aClass38_66.method1423();
			Static6.anIntArray12[local7++] = (int) local19.aLong244;
			this.anInt7880 -= local19.anInt6397;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static6.anIntArray12, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static6.anIntArray12, 0);
		}
		while (!this.aClass38_62.method1414()) {
			local19 = (Class1_Sub33) this.aClass38_62.method1423();
			OpenGL.glDeleteLists((int) local19.aLong244, local19.anInt6397);
		}
		@Pc(213) Class1 local213;
		while (!this.aClass38_67.method1414()) {
			local213 = this.aClass38_67.method1423();
			OpenGL.glDeleteProgramARB((int) local213.aLong244);
		}
		while (!this.aClass38_68.method1414()) {
			local213 = this.aClass38_68.method1423();
			OpenGL.glDeleteObjectARB(local213.aLong244);
		}
		while (!this.aClass38_62.method1414()) {
			local19 = (Class1_Sub33) this.aClass38_62.method1423();
			OpenGL.glDeleteLists((int) local19.aLong244, local19.anInt6397);
		}
		this.aClass275_1.method6792();
		if (this.U() > 100663296 && Static93.method2172() > this.aLong209 + 60000L) {
			System.gc();
			this.aLong209 = Static93.method2172();
		}
		this.anInt7876 = local11;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7595() {
		this.method6658();
		this.method6654(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public Class1_Sub16 method7629(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub16_Sub1 local8 = new Class1_Sub16_Sub1(arg0);
		this.aClass38_61.method1426(local8);
		return local8;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!mj;I)V")
	public void method6703(@OriginalArg(0) Interface7 arg0) {
		if (this.anInterface7_5 != arg0) {
			if (this.aBoolean511) {
				OpenGL.glBindBufferARB(34963, arg0.method6740());
			}
			this.anInterface7_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!te", name = "h", descriptor = "(Z)V")
	private void method6704() {
		this.method6672(-2);
		for (@Pc(12) int local12 = this.anInt7894 - 1; local12 >= 0; local12--) {
			this.method6660(local12);
			this.method6701(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6732(8448, 8448);
		this.method6706(34168, 2, 770);
		this.method6677();
		this.anInt7902 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt7891 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean530 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean524 = true;
		this.method6655(true);
		this.method6733(true);
		this.method6705(true);
		this.method6691(true);
		this.method6690();
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
			@Pc(134) int local134 = local129 + 16384;
			OpenGL.glLightfv(local134, 4608, local127, 0);
			OpenGL.glLightf(local134, 4615, 0.0F);
			OpenGL.glLightf(local134, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt7916 = this.anInt7908 = -1;
		this.n();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZZ)V")
	public void method6705(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean508 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean508 = arg0;
		this.anInt7885 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!te", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		@Pc(6) int local6 = this.anInt7921;
		this.anInt7921 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZI)V")
	public void method6706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!lg;[Lclient!qm;Z)Lclient!ra;")
	@Override
	public Class27 method7603(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class242[] arg1) {
		return new Class27_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!te", name = "v", descriptor = "()V")
	@Override
	public void method7623() {
		this.method6691(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7636(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas13) {
			throw new RuntimeException();
		} else if (this.aHashtable9.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable9.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable9.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7893 = arg2;
		this.anInt7911 = arg3;
		this.anInt7917 = arg0;
		this.anInt7909 = arg1;
		this.method6717();
		this.method6728();
		if (this.anInt7892 == 3) {
			this.method6659();
		} else if (this.anInt7892 == 2) {
			this.method6668();
			return;
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(ILclient!np;)V")
	public void method6707(@OriginalArg(1) Interface12 arg0) {
		if (this.aBoolean509) {
			this.method6673(arg0);
			this.method6665(arg0);
		} else if (this.anInt7877 >= 0 && this.anInterface12Array1[this.anInt7877] == arg0) {
			this.anInterface12Array1[this.anInt7877--] = null;
			arg0.method5224();
			if (this.anInt7877 >= 0) {
				this.anInterface12_1 = this.anInterface12_2 = this.anInterface12Array1[this.anInt7877];
				this.anInterface12_1.method5222();
			} else {
				this.anInterface12_1 = this.anInterface12_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(B)V")
	public void method6708() {
		if (this.anInt7885 == 2) {
			return;
		}
		this.method6727();
		this.method6655(false);
		this.method6733(false);
		this.method6705(false);
		this.method6691(false);
		this.method6672(-2);
		this.anInt7885 = 2;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(FFFFB)V")
	public void method6709(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static222.aFloatArray36[2] = arg0;
		Static222.aFloatArray36[3] = arg2;
		Static222.aFloatArray36[1] = arg3;
		Static222.aFloatArray36[0] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static222.aFloatArray36, 0);
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "()Z")
	@Override
	public boolean method7575() {
		return true;
	}

	@OriginalMember(owner = "client!te", name = "IA", descriptor = "(III[I)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass22_Sub2_4.aFloat61 + this.aClass22_Sub2_4.aFloat62 * (float) arg0 + (float) arg1 * this.aClass22_Sub2_4.aFloat70 + (float) arg2 * this.aClass22_Sub2_4.aFloat69;
		if ((float) this.anInt7898 > local28 || (float) this.anInt7883 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt7893 * (this.aClass22_Sub2_4.aFloat67 + this.aClass22_Sub2_4.aFloat71 * (float) arg0 + (float) arg1 * this.aClass22_Sub2_4.aFloat64 + this.aClass22_Sub2_4.aFloat63 * (float) arg2) / local28);
		@Pc(117) int local117 = (int) ((this.aClass22_Sub2_4.aFloat60 + this.aClass22_Sub2_4.aFloat66 * (float) arg2 + this.aClass22_Sub2_4.aFloat68 * (float) arg0 + (float) arg1 * this.aClass22_Sub2_4.aFloat65) * (float) this.anInt7911 / local28);
		if (this.aFloat173 <= (float) local85 && this.aFloat154 >= (float) local85 && this.aFloat166 <= (float) local117 && (float) local117 <= this.aFloat155) {
			arg3[1] = (int) ((float) local117 - this.aFloat166);
			arg3[0] = (int) ((float) local85 - this.aFloat173);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!te", name = "j", descriptor = "(II)I")
	public int method6710(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!r;Lclient!rd;Lclient!m;Lclient!pr;I)V")
	@Override
	public void method7573(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class2_Sub7 arg3) {
		arg0.method7258(arg2, arg3, 0);
		this.method7577(arg1);
	}

	@OriginalMember(owner = "client!te", name = "D", descriptor = "()Lclient!m;")
	@Override
	public Class22 method7644() {
		return new Class22_Sub2();
	}

	@OriginalMember(owner = "client!te", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.anInt7904 = 0;
		this.anInt7897 = this.anInt7756;
		this.anInt7888 = this.anInt7712;
		this.anInt7919 = 0;
		OpenGL.glDisable(3089);
		this.method6728();
	}

	@OriginalMember(owner = "client!te", name = "w", descriptor = "(I)V")
	private void method6711() {
		if (this.aFloat162 == 0.0F) {
			this.aFloatArray66[10] = this.aFloat171;
			this.aFloatArray66[14] = this.bf;
		} else {
			@Pc(30) float local30 = this.aFloat163 / (this.aFloat162 + this.aFloat163);
			@Pc(34) float local34 = local30 * local30;
			@Pc(50) float local50 = (1.0F - local30) * -this.bf * (1.0F - local30) / this.aFloat162;
			this.aFloatArray66[14] = local34 * this.bf;
			this.aFloatArray66[10] = local50 + this.aFloat171;
		}
		this.aFloat158 = (float) this.anInt7883 - this.aFloat162;
		this.aFloat153 = (this.aFloatArray66[14] - (float) this.anInt7883) / this.aFloatArray66[10];
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public Class12 method7612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class12_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7604(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static329.aFloat119 = arg1;
		Static115.aFloat77 = arg2;
		Static46.aFloat55 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(53) float local53;
		@Pc(41) float local41;
		if (this.aClass20_Sub3_Sub1_4 == null || this.aClass20_Sub3_Sub1_4.anInt7338 < arg2 || this.aClass20_Sub3_Sub1_4.anInt7340 < arg3) {
			this.aClass20_Sub3_Sub1_4 = Static80.method2002(this, arg2, arg6, arg3);
			this.aClass20_Sub3_Sub1_4.method6253(false, false);
			local53 = this.aClass20_Sub3_Sub1_4.aFloat147;
			local41 = this.aClass20_Sub3_Sub1_4.aFloat146;
		} else {
			this.aClass20_Sub3_Sub1_4.method6250(arg3, arg2, false, arg6, 6406);
			local41 = (float) arg2 * this.aClass20_Sub3_Sub1_4.aFloat146 / (float) this.aClass20_Sub3_Sub1_4.anInt7338;
			local53 = this.aClass20_Sub3_Sub1_4.aFloat147 * (float) arg3 / (float) this.aClass20_Sub3_Sub1_4.anInt7340;
		}
		this.method6708();
		this.method6701(this.aClass20_Sub3_Sub1_4);
		this.method6654(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method6664(arg5);
		this.method6732(34165, 34165);
		this.method6706(34166, 0, 768);
		this.method6706(5890, 2, 770);
		this.method6656(34166, 0);
		this.method6656(5890, 2);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = local143 + (float) arg2;
		@Pc(156) float local156 = local146 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local143, local156);
		OpenGL.glTexCoord2f(local53, local41);
		OpenGL.glVertex2f(local151, local156);
		OpenGL.glTexCoord2f(local53, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method6706(5890, 0, 768);
		this.method6706(34166, 2, 770);
		this.method6656(5890, 0);
		this.method6656(34166, 2);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public void method7594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class23 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class23_Sub1 local6 = (Class23_Sub1) arg5;
		@Pc(9) Class20_Sub3_Sub1 local9 = local6.aClass20_Sub3_Sub1_1;
		this.method6708();
		this.method6701(local6.aClass20_Sub3_Sub1_1);
		this.method6654(1);
		this.method6732(7681, 8448);
		this.method6706(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat146 / (float) local9.anInt7346;
		@Pc(46) float local46 = local9.aFloat147 / (float) local9.anInt7348;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local52 * local52)));
		@Pc(76) float local76 = local59 * local72;
		@Pc(80) float local80 = local52 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f(local80 + (float) arg2 + 0.35F, local76 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method6706(5890, 0, 768);
	}

	@OriginalMember(owner = "client!te", name = "x", descriptor = "(I)V")
	public void method6712() {
		if (this.anInt7885 == 16) {
			return;
		}
		this.method6697();
		this.method6655(true);
		this.method6705(true);
		this.method6691(true);
		this.method6654(1);
		this.anInt7885 = 16;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!maa;BLclient!maa;Lclient!maa;Lclient!maa;)V")
	public void method6713(@OriginalArg(0) Class188 arg0, @OriginalArg(2) Class188 arg1, @OriginalArg(3) Class188 arg2, @OriginalArg(4) Class188 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6730(arg1.anInterface16_1);
			OpenGL.glVertexPointer(arg1.aByte64, arg1.aShort90, this.anInterface16_6.method6008(), this.anInterface16_6.method6007() + (long) arg1.aByte65);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6730(arg2.anInterface16_1);
			OpenGL.glNormalPointer(arg2.aShort90, this.anInterface16_6.method6008(), this.anInterface16_6.method6007() + (long) arg2.aByte65);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6730(arg3.anInterface16_1);
			OpenGL.glColorPointer(arg3.aByte64, arg3.aShort90, this.anInterface16_6.method6008(), this.anInterface16_6.method6007() + (long) arg3.aByte65);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6730(arg0.anInterface16_1);
			OpenGL.glTexCoordPointer(arg0.aByte64, arg0.aShort90, this.anInterface16_6.method6008(), this.anInterface16_6.method6007() + (long) arg0.aByte65);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!te", name = "k", descriptor = "(II)I")
	public int method6714(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!te", name = "j", descriptor = "()Z")
	@Override
	public boolean method7583() {
		if (this.aClass1_Sub14_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass1_Sub14_Sub1_1.method6197()) {
			if (!this.aClass161_1.method4232(this.aClass1_Sub14_Sub1_1)) {
				return false;
			}
			this.aClass275_1.method6787();
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.anInt7898;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7634(@OriginalArg(0) Canvas arg0) {
		this.aCanvas12 = null;
		this.aLong208 = 0L;
		if (arg0 == null || arg0 == this.aCanvas13) {
			this.aLong208 = this.aLong207;
			this.aCanvas12 = this.aCanvas13;
		} else if (this.aHashtable9.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable9.get(arg0);
			this.aLong208 = local26;
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.aLong208 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong208);
		this.method6671();
	}

	@OriginalMember(owner = "client!te", name = "JA", descriptor = "(IIII)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean516) {
			throw new RuntimeException("");
		}
		this.anInt7900 = arg3;
		this.anInt7906 = arg1;
		this.anInt7910 = arg0;
		this.anInt7899 = arg2;
		this.aClass46_1.aClass35_Sub5_1.method3842();
		this.method6657();
	}

	@OriginalMember(owner = "client!te", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class23_Sub1 local6 = (Class23_Sub1) arg1;
		@Pc(9) Class20_Sub3_Sub1 local9 = local6.aClass20_Sub3_Sub1_1;
		this.method6708();
		this.method6701(local6.aClass20_Sub3_Sub1_1);
		this.method6654(1);
		this.method6732(7681, 8448);
		this.method6706(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat146 / (float) local9.anInt7346;
		@Pc(46) float local46 = local9.aFloat147 / (float) local9.anInt7348;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7904 - arg2), local46 * (float) (this.anInt7919 - arg3));
		OpenGL.glVertex2i(this.anInt7904, this.anInt7919);
		OpenGL.glTexCoord2f((float) (this.anInt7904 - arg2) * local39, local46 * (float) (this.anInt7888 - arg3));
		OpenGL.glVertex2i(this.anInt7904, this.anInt7888);
		OpenGL.glTexCoord2f((float) (this.anInt7897 - arg2) * local39, (float) (this.anInt7888 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt7897, this.anInt7888);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7897 - arg2), local46 * (float) (this.anInt7919 - arg3));
		OpenGL.glVertex2i(this.anInt7897, this.anInt7919);
		OpenGL.glEnd();
		this.method6706(5890, 0, 768);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I")
	@Override
	public int method7607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!te", name = "F", descriptor = "(IIII)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7897 > arg2) {
			this.anInt7897 = arg2;
		}
		if (this.anInt7888 > arg3) {
			this.anInt7888 = arg3;
		}
		if (this.anInt7904 < arg0) {
			this.anInt7904 = arg0;
		}
		if (arg1 > this.anInt7919) {
			this.anInt7919 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method6728();
		this.method6666();
	}

	@OriginalMember(owner = "client!te", name = "y", descriptor = "(I)V")
	public void method6715() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IJ)V")
	public synchronized void method6716(@OriginalArg(1) long arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong244 = arg0;
		this.aClass38_68.method1426(local7);
	}

	@OriginalMember(owner = "client!te", name = "z", descriptor = "(I)V")
	private void method6717() {
		@Pc(12) float[] local12 = this.aFloatArray66;
		@Pc(24) float local24 = (float) (-this.anInt7917 * this.anInt7898) / (float) this.anInt7893;
		@Pc(39) float local39 = (float) (this.anInt7898 * (this.anInt7756 - this.anInt7917)) / (float) this.anInt7893;
		@Pc(50) float local50 = (float) (this.anInt7898 * this.anInt7909) / (float) this.anInt7911;
		@Pc(65) float local65 = (float) ((this.anInt7909 - this.anInt7712) * this.anInt7898) / (float) this.anInt7911;
		if (local39 == local24 || local50 == local65) {
			local12[12] = 0.0F;
			local12[4] = 0.0F;
			local12[3] = 0.0F;
			local12[15] = 1.0F;
			local12[5] = 1.0F;
			local12[8] = 0.0F;
			local12[6] = 0.0F;
			local12[9] = 0.0F;
			local12[11] = 0.0F;
			local12[2] = 0.0F;
			local12[0] = 1.0F;
			local12[7] = 0.0F;
			local12[14] = 0.0F;
			local12[1] = 0.0F;
			local12[13] = 0.0F;
			local12[10] = 1.0F;
		} else {
			@Pc(144) float local144 = (float) this.anInt7898 * 2.0F;
			local12[6] = 0.0F;
			local12[3] = 0.0F;
			local12[2] = 0.0F;
			local12[15] = 0.0F;
			local12[8] = (local24 + local39) / (local39 - local24);
			local12[4] = 0.0F;
			local12[10] = this.aFloat171 = (float) -(this.anInt7883 + this.anInt7898) / (float) (this.anInt7883 - this.anInt7898);
			local12[1] = 0.0F;
			local12[5] = local144 / (local50 - local65);
			local12[0] = local144 / (local39 - local24);
			local12[9] = (local65 + local50) / (-local65 + local50);
			local12[11] = -1.0F;
			local12[12] = 0.0F;
			local12[13] = 0.0F;
			local12[14] = this.bf = -(local144 * (float) this.anInt7883) / (float) (this.anInt7883 - this.anInt7898);
			local12[7] = 0.0F;
		}
		this.method6711();
	}

	@OriginalMember(owner = "client!te", name = "M", descriptor = "(F)V")
	@Override
	public void M(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat157) {
			this.aFloat157 = arg0;
			this.method6702();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZIZI)V")
	public void method6718(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt7903 != arg2) {
			if (arg2 < 0) {
				this.method6677();
				this.method6701(null);
				this.method6670(0);
				if (!this.aBoolean516) {
					this.aClass46_1.method1763(0, 0, arg0, arg1, 0);
				}
			} else {
				@Pc(11) Class20_Sub3 local11 = this.aClass275_1.method6790(arg2);
				@Pc(17) Class175 local17 = super.anInterface8_13.method7085(arg2);
				if (local17.aByte57 == 0 && local17.aByte60 == 0) {
					this.method6677();
				} else {
					@Pc(34) int local34 = local17.aBoolean354 ? 64 : 128;
					@Pc(38) int local38 = local34 * 50;
					this.method6722(0.0F, (float) (this.anInt7876 % local38 * local17.aByte60) / (float) local38, (float) (local17.aByte57 * (this.anInt7876 % local38)) / (float) local38);
				}
				if (this.aBoolean516) {
					this.method6701(local11);
					this.method6670(local17.anInt5193);
				} else {
					this.aClass46_1.method1763(local17.aByte56, local17.aByte54, arg0, arg1, local17.anInt5194);
					if (!this.aClass46_1.method1760(local11, local17.anInt5193)) {
						this.method6701(local11);
						this.method6670(local17.anInt5193);
					}
				}
			}
			this.anInt7903 = arg2;
		}
		this.anInt7885 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIF)Lclient!nm;")
	@Override
	public Class1_Sub27 method7616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub27_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method7600(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aNativeHeap5 = ((Class1_Sub16_Sub1) arg0).aNativeHeap3;
		if (this.anInterface16_7 != null) {
			return;
		}
		@Pc(16) Class1_Sub13_Sub1 local16 = new Class1_Sub13_Sub1(80);
		if (this.aBoolean523) {
			local16.method2612(-1.0F);
			local16.method2612(-1.0F);
			local16.method2612(0.0F);
			local16.method2612(0.0F);
			local16.method2612(1.0F);
			local16.method2612(1.0F);
			local16.method2612(-1.0F);
			local16.method2612(0.0F);
			local16.method2612(1.0F);
			local16.method2612(1.0F);
			local16.method2612(1.0F);
			local16.method2612(1.0F);
			local16.method2612(0.0F);
			local16.method2612(1.0F);
			local16.method2612(0.0F);
			local16.method2612(-1.0F);
			local16.method2612(1.0F);
			local16.method2612(0.0F);
			local16.method2612(0.0F);
			local16.method2612(0.0F);
		} else {
			local16.method2611(-1.0F);
			local16.method2611(-1.0F);
			local16.method2611(0.0F);
			local16.method2611(0.0F);
			local16.method2611(1.0F);
			local16.method2611(1.0F);
			local16.method2611(-1.0F);
			local16.method2611(0.0F);
			local16.method2611(1.0F);
			local16.method2611(1.0F);
			local16.method2611(1.0F);
			local16.method2611(1.0F);
			local16.method2611(0.0F);
			local16.method2611(1.0F);
			local16.method2611(0.0F);
			local16.method2611(-1.0F);
			local16.method2611(1.0F);
			local16.method2611(0.0F);
			local16.method2611(0.0F);
			local16.method2611(0.0F);
		}
		this.anInterface16_7 = this.method6729(local16.aByteArray45, false, local16.anInt3400, 20);
		this.aClass188_15 = new Class188(this.anInterface16_7, 5126, 3, 0);
		this.aClass188_16 = new Class188(this.anInterface16_7, 5126, 2, 12);
		this.aClass223_1.method5595(this);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIILclient!mj;)V")
	public void method6719(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Interface7 arg2) {
		@Pc(11) int local11 = arg2.method6743();
		@Pc(18) int local18 = arg0 * this.method6714(local11);
		this.method6703(arg2);
		OpenGL.glDrawElements(4, arg1, local11, arg2.method6742() + (long) local18);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7627(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas13 == arg0) {
			local5 = this.aLong207;
		} else if (this.aHashtable9.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable9.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas12 == arg0) {
			this.method6671();
		}
	}

	@OriginalMember(owner = "client!te", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt7712 - local12 - arg1, arg2, 1, 32993, this.anInt7913, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!pr;I)V")
	@Override
	public void method7578(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class2_Sub7[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method7258(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(FZF)V")
	public void method6720(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat164 = arg0;
		this.aFloat156 = arg1;
		if (!this.aBoolean516) {
			this.method6657();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZIZLclient!jaclib/memory/Buffer;)Lclient!sp;")
	public Interface16 method6721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Buffer arg2) {
		return (Interface16) (this.aBoolean511 ? new Class41_Sub1(this, arg1, arg2, arg0, false) : new Class92_Sub1(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method7597(@OriginalArg(0) Class22 arg0) {
		this.aClass22_Sub2_4 = (Class22_Sub2) arg0;
		this.aClass22_Sub2_3.method1961(this.aClass22_Sub2_4);
		if (this.anInt7892 != 1) {
			this.method6681();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BFFF)V")
	private void method6722(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean507) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg1, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean507 = true;
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "()Z")
	@Override
	public boolean method7571() {
		return this.aBoolean525 && (!this.method7591() || this.aBoolean521);
	}

	@OriginalMember(owner = "client!te", name = "A", descriptor = "(I)V")
	private void method6723() {
		if (this.anInt7892 != 2) {
			this.anInt7892 = 2;
			this.method6668();
			this.method6681();
			this.anInt7885 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!te", name = "h", descriptor = "(B)V")
	public void method6724() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(IIIIII)Lclient!qba;")
	@Override
	public Class25 method7608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean526 ? new Class25_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!te", name = "B", descriptor = "(I)V")
	private void method6725() {
		if (this.aBoolean522 && !this.aBoolean518) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!qm;Z)Lclient!ha;")
	@Override
	public Class12 method7625(@OriginalArg(0) Class242 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt6863 * arg0.anInt6866];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray82 == null) {
			for (local21 = 0; local21 < arg0.anInt6866; local21++) {
				for (local25 = 0; local25 < arg0.anInt6863; local25++) {
					@Pc(87) int local87 = arg0.anIntArray518[arg0.aByteArray83[local14++] & 0xFF];
					local12[local16++] = local87 == 0 ? 0 : local87 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt6866; local21++) {
				for (local25 = 0; local25 < arg0.anInt6863; local25++) {
					local12[local16++] = arg0.aByteArray82[local14] << 24 | arg0.anIntArray518[arg0.aByteArray83[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(123) Class12 local123 = this.method7641(local12, arg0.anInt6863, arg0.anInt6863, arg0.anInt6866);
		local123.KA(arg0.anInt6862, arg0.anInt6865, arg0.anInt6861, arg0.anInt6864);
		return local123;
	}

	@OriginalMember(owner = "client!te", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.aBoolean516 = false;
		this.aClass46_1.method1763(0, 0, false, false, 0);
		this.method6657();
		this.method6674();
	}

	@OriginalMember(owner = "client!te", name = "q", descriptor = "()Z")
	@Override
	public boolean method7611() {
		return true;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "()Z")
	@Override
	public boolean method7569() {
		return false;
	}

	@OriginalMember(owner = "client!te", name = "i", descriptor = "()I")
	@Override
	public int method7582() {
		return 4;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)V")
	public synchronized void method6726(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub33 local12 = new Class1_Sub33(arg0);
		this.aClass38_65.method1426(local12);
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
	@Override
	public void method7598(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt7871 = arg0;
		this.aClass275_1.method6787();
	}

	@OriginalMember(owner = "client!te", name = "y", descriptor = "()Lclient!cr;")
	@Override
	public Class49 method7626() {
		@Pc(7) int local7 = -1;
		if (this.aString66.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString66.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString66.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class49(local7, "OpenGL", this.anInt7907, this.aString67, 0L);
	}

	@OriginalMember(owner = "client!te", name = "CA", descriptor = "()I")
	@Override
	public int CA() {
		return this.anInt7883;
	}

	@OriginalMember(owner = "client!te", name = "C", descriptor = "(I)V")
	private void method6727() {
		if (this.anInt7892 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt7756 > 0 && this.anInt7712 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt7756, (double) this.anInt7712, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt7885 &= 0xFFFFFFE7;
		this.anInt7892 = 1;
	}

	@OriginalMember(owner = "client!te", name = "i", descriptor = "(B)V")
	private void method6728() {
		this.aFloat166 = this.anInt7919 - this.anInt7909;
		this.aFloat155 = this.anInt7888 - this.anInt7909;
		this.aFloat154 = this.anInt7897 - this.anInt7917;
		this.aFloat173 = this.anInt7904 - this.anInt7917;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([BZBII)Lclient!sp;")
	public Interface16 method6729(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return (Interface16) (this.aBoolean511 && (!arg1 || this.aBoolean517) ? new Class41_Sub1(this, arg3, arg0, arg2, arg1) : new Class92_Sub1(this, arg3, arg0, arg2));
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(Z)V")
	@Override
	public void method7615(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7567(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7637();
	}

	@OriginalMember(owner = "client!te", name = "B", descriptor = "()Z")
	@Override
	public boolean method7640() {
		return true;
	}

	@OriginalMember(owner = "client!te", name = "o", descriptor = "()V")
	@Override
	public void method7602() {
		if (this.aClass1_Sub14_Sub1_1 != null && this.aClass1_Sub14_Sub1_1.method6197()) {
			this.aClass161_1.method4231(this.aClass1_Sub14_Sub1_1);
			this.aClass275_1.method6787();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!sp;I)V")
	public void method6730(@OriginalArg(0) Interface16 arg0) {
		if (this.anInterface16_6 != arg0) {
			if (this.aBoolean511) {
				OpenGL.glBindBufferARB(34962, arg0.method6006());
			}
			this.anInterface16_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([Lclient!r;Lclient!rd;Lclient!m;[Lclient!pr;I)V")
	@Override
	public void method7593(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class2_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method7578(arg0, arg2, arg3, arg4);
		this.method7577(arg1);
	}

	@OriginalMember(owner = "client!te", name = "m", descriptor = "()Z")
	@Override
	public boolean method7601() {
		return this.aClass1_Sub14_Sub1_1 != null && (this.anInt7872 <= 1 || this.aBoolean521);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7572(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!te", name = "u", descriptor = "()Z")
	@Override
	public boolean method7622() {
		return this.aClass46_1.method1761();
	}

	@OriginalMember(owner = "client!te", name = "j", descriptor = "(B)V")
	public void method6731() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray65, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(III)V")
	public void method6732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7918 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(21) boolean local21 = false;
		if (arg0 != this.anInt7905) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local21 = true;
			this.anInt7905 = arg0;
		}
		if (arg1 != this.anInt7889) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local21 = true;
			this.anInt7889 = arg1;
		}
		if (local21) {
			this.anInt7885 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(ZZ)V")
	public void method6733(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean522) {
			this.aBoolean522 = arg0;
			this.method6725();
			this.anInt7885 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!te", name = "k", descriptor = "(B)V")
	public void method6734() {
		if (this.anInt7885 == 4) {
			return;
		}
		this.method6727();
		this.method6655(false);
		this.method6733(false);
		this.method6705(false);
		this.method6691(false);
		this.method6672(-2);
		this.method6654(1);
		this.anInt7885 = 4;
	}
}
