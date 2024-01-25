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

@OriginalClass("client!na")
public final class Class75_Sub2 extends Class75 {

	@OriginalMember(owner = "client!na", name = "sb", descriptor = "I")
	private int anInt4725;

	@OriginalMember(owner = "client!na", name = "ub", descriptor = "I")
	private int anInt4727;

	@OriginalMember(owner = "client!na", name = "dc", descriptor = "I")
	public int anInt4760;

	@OriginalMember(owner = "client!na", name = "qd", descriptor = "I")
	public int anInt4822;

	@OriginalMember(owner = "client!na", name = "le", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!na", name = "pe", descriptor = "I")
	public int anInt4860;

	@OriginalMember(owner = "client!na", name = "se", descriptor = "Lclient!pv;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!na", name = "xe", descriptor = "Lclient!pv;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!na", name = "ye", descriptor = "I")
	public int anInt4864;

	@OriginalMember(owner = "client!na", name = "ze", descriptor = "I")
	public int anInt4865;

	@OriginalMember(owner = "client!na", name = "Ae", descriptor = "I")
	private int anInt4866;

	@OriginalMember(owner = "client!na", name = "Je", descriptor = "Z")
	public boolean aBoolean333;

	@OriginalMember(owner = "client!na", name = "Ke", descriptor = "Lclient!to;")
	public Class63_Sub2 aClass63_Sub2_1;

	@OriginalMember(owner = "client!na", name = "Le", descriptor = "I")
	private int anInt4868;

	@OriginalMember(owner = "client!na", name = "Me", descriptor = "F")
	private float aFloat38;

	@OriginalMember(owner = "client!na", name = "Oe", descriptor = "Ljava/lang/String;")
	private String aString41;

	@OriginalMember(owner = "client!na", name = "Pe", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!na", name = "Se", descriptor = "Z")
	public boolean aBoolean335;

	@OriginalMember(owner = "client!na", name = "Te", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!na", name = "Ue", descriptor = "Lclient!nf;")
	public Class6_Sub2 aClass6_Sub2_3;

	@OriginalMember(owner = "client!na", name = "We", descriptor = "Lclient!ui;")
	private Interface12 anInterface12_3;

	@OriginalMember(owner = "client!na", name = "Xe", descriptor = "Z")
	public boolean aBoolean336;

	@OriginalMember(owner = "client!na", name = "Ye", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!na", name = "bf", descriptor = "Ljava/lang/String;")
	private String bf;

	@OriginalMember(owner = "client!na", name = "cf", descriptor = "Lclient!to;")
	public Class63_Sub2 aClass63_Sub2_2;

	@OriginalMember(owner = "client!na", name = "df", descriptor = "Lclient!tb;")
	private Interface11 anInterface11_2;

	@OriginalMember(owner = "client!na", name = "ef", descriptor = "Z")
	public boolean aBoolean337;

	@OriginalMember(owner = "client!na", name = "ff", descriptor = "Z")
	private boolean aBoolean338;

	@OriginalMember(owner = "client!na", name = "hf", descriptor = "Lclient!to;")
	public Class63_Sub2 aClass63_Sub2_3;

	@OriginalMember(owner = "client!na", name = "lf", descriptor = "Z")
	public boolean aBoolean340;

	@OriginalMember(owner = "client!na", name = "mf", descriptor = "Lclient!sa;")
	public Class64_Sub4 aClass64_Sub4_4;

	@OriginalMember(owner = "client!na", name = "nf", descriptor = "Z")
	private boolean aBoolean341;

	@OriginalMember(owner = "client!na", name = "pf", descriptor = "I")
	public int anInt4875;

	@OriginalMember(owner = "client!na", name = "uf", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!na", name = "xf", descriptor = "[Lclient!ed;")
	private Class64[] aClass64Array1;

	@OriginalMember(owner = "client!na", name = "yf", descriptor = "I")
	private int anInt4878;

	@OriginalMember(owner = "client!na", name = "zf", descriptor = "Z")
	public boolean aBoolean344;

	@OriginalMember(owner = "client!na", name = "Af", descriptor = "Lclient!to;")
	public Class63_Sub2 aClass63_Sub2_4;

	@OriginalMember(owner = "client!na", name = "Bf", descriptor = "I")
	public int anInt4879;

	@OriginalMember(owner = "client!na", name = "Cf", descriptor = "Lclient!db;")
	public Class47 aClass47_5;

	@OriginalMember(owner = "client!na", name = "Gf", descriptor = "Z")
	private boolean aBoolean346;

	@OriginalMember(owner = "client!na", name = "Hf", descriptor = "Z")
	private boolean aBoolean347;

	@OriginalMember(owner = "client!na", name = "Jf", descriptor = "I")
	private int anInt4882;

	@OriginalMember(owner = "client!na", name = "Kf", descriptor = "I")
	public int anInt4883;

	@OriginalMember(owner = "client!na", name = "Lf", descriptor = "Z")
	private boolean aBoolean348;

	@OriginalMember(owner = "client!na", name = "Of", descriptor = "Z")
	public boolean aBoolean349;

	@OriginalMember(owner = "client!na", name = "Pf", descriptor = "Lclient!to;")
	public Class63_Sub2 aClass63_Sub2_5;

	@OriginalMember(owner = "client!na", name = "Uf", descriptor = "I")
	private int anInt4887;

	@OriginalMember(owner = "client!na", name = "Vf", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!na", name = "Wf", descriptor = "Lclient!dg;")
	public Class51 aClass51_6;

	@OriginalMember(owner = "client!na", name = "Xf", descriptor = "Z")
	private boolean aBoolean352;

	@OriginalMember(owner = "client!na", name = "Zf", descriptor = "Lclient!to;")
	public Class63_Sub2 aClass63_Sub2_6;

	@OriginalMember(owner = "client!na", name = "bg", descriptor = "I")
	private int anInt4889;

	@OriginalMember(owner = "client!na", name = "cg", descriptor = "Z")
	public boolean aBoolean353;

	@OriginalMember(owner = "client!na", name = "eg", descriptor = "F")
	private float aFloat49;

	@OriginalMember(owner = "client!na", name = "gg", descriptor = "I")
	public int anInt4891;

	@OriginalMember(owner = "client!na", name = "ig", descriptor = "Lclient!to;")
	public Class63_Sub2 aClass63_Sub2_7;

	@OriginalMember(owner = "client!na", name = "kg", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!na", name = "lg", descriptor = "Lclient!to;")
	public Class63_Sub2 aClass63_Sub2_8;

	@OriginalMember(owner = "client!na", name = "ng", descriptor = "Lclient!nf;")
	public Class6_Sub2 aClass6_Sub2_4;

	@OriginalMember(owner = "client!na", name = "og", descriptor = "F")
	private float aFloat51;

	@OriginalMember(owner = "client!na", name = "rg", descriptor = "Lclient!nm;")
	private Class141_Sub1 aClass141_Sub1_1;

	@OriginalMember(owner = "client!na", name = "sg", descriptor = "Z")
	private boolean aBoolean354;

	@OriginalMember(owner = "client!na", name = "ug", descriptor = "I")
	private int anInt4896;

	@OriginalMember(owner = "client!na", name = "vg", descriptor = "Lclient!ui;")
	private Interface12 anInterface12_4;

	@OriginalMember(owner = "client!na", name = "yg", descriptor = "I")
	private int anInt4898;

	@OriginalMember(owner = "client!na", name = "Bg", descriptor = "I")
	private int anInt4899;

	@OriginalMember(owner = "client!na", name = "Dg", descriptor = "I")
	private int anInt4900;

	@OriginalMember(owner = "client!na", name = "Eg", descriptor = "Z")
	private boolean aBoolean356;

	@OriginalMember(owner = "client!na", name = "Fg", descriptor = "J")
	private long aLong224;

	@OriginalMember(owner = "client!na", name = "Gg", descriptor = "Z")
	private boolean aBoolean357;

	@OriginalMember(owner = "client!na", name = "Hg", descriptor = "Lclient!db;")
	public Class47 aClass47_6;

	@OriginalMember(owner = "client!na", name = "Ig", descriptor = "I")
	private int anInt4901;

	@OriginalMember(owner = "client!na", name = "Jg", descriptor = "Lclient!to;")
	public Class63_Sub2 aClass63_Sub2_9;

	@OriginalMember(owner = "client!na", name = "Kg", descriptor = "Lclient!me;")
	private Class64_Sub4_Sub1 aClass64_Sub4_Sub1_4;

	@OriginalMember(owner = "client!na", name = "Pg", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!na", name = "Qg", descriptor = "Z")
	private boolean aBoolean359;

	@OriginalMember(owner = "client!na", name = "Sg", descriptor = "I")
	private int anInt4903;

	@OriginalMember(owner = "client!na", name = "Ug", descriptor = "Z")
	public boolean aBoolean360;

	@OriginalMember(owner = "client!na", name = "Wg", descriptor = "Lclient!to;")
	public Class63_Sub2 aClass63_Sub2_10;

	@OriginalMember(owner = "client!na", name = "Yg", descriptor = "I")
	private int anInt4904;

	@OriginalMember(owner = "client!na", name = "ah", descriptor = "I")
	private int anInt4905;

	@OriginalMember(owner = "client!na", name = "Hb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!na", name = "fe", descriptor = "I")
	public int anInt4857 = 128;

	@OriginalMember(owner = "client!na", name = "ge", descriptor = "Lclient!pq;")
	private final Class199 aClass199_1 = new Class199();

	@OriginalMember(owner = "client!na", name = "he", descriptor = "Lclient!nf;")
	private final Class6_Sub2 aClass6_Sub2_1 = new Class6_Sub2();

	@OriginalMember(owner = "client!na", name = "ie", descriptor = "Lclient!nf;")
	public final Class6_Sub2 aClass6_Sub2_2 = new Class6_Sub2();

	@OriginalMember(owner = "client!na", name = "ne", descriptor = "I")
	public int anInt4858 = 8;

	@OriginalMember(owner = "client!na", name = "ke", descriptor = "Z")
	private boolean aBoolean332 = false;

	@OriginalMember(owner = "client!na", name = "oe", descriptor = "I")
	public int anInt4859 = 3;

	@OriginalMember(owner = "client!na", name = "me", descriptor = "Lclient!nj;")
	private final Class181 aClass181_18 = new Class181();

	@OriginalMember(owner = "client!na", name = "qe", descriptor = "[Lclient!pv;")
	private final Interface9[] anInterface9Array1 = new Interface9[4];

	@OriginalMember(owner = "client!na", name = "re", descriptor = "[Lclient!pv;")
	private final Interface9[] anInterface9Array2 = new Interface9[4];

	@OriginalMember(owner = "client!na", name = "ve", descriptor = "[Lclient!pv;")
	private final Interface9[] anInterface9Array3 = new Interface9[4];

	@OriginalMember(owner = "client!na", name = "we", descriptor = "I")
	private int anInt4863 = -1;

	@OriginalMember(owner = "client!na", name = "te", descriptor = "I")
	private int anInt4861 = -1;

	@OriginalMember(owner = "client!na", name = "ue", descriptor = "I")
	private int anInt4862 = -1;

	@OriginalMember(owner = "client!na", name = "Be", descriptor = "Lclient!nj;")
	private final Class181 aClass181_19;

	@OriginalMember(owner = "client!na", name = "Ce", descriptor = "Lclient!nj;")
	private final Class181 aClass181_20;

	@OriginalMember(owner = "client!na", name = "De", descriptor = "Lclient!nj;")
	private final Class181 aClass181_21;

	@OriginalMember(owner = "client!na", name = "Ee", descriptor = "Lclient!nj;")
	private final Class181 aClass181_22;

	@OriginalMember(owner = "client!na", name = "Fe", descriptor = "Lclient!nj;")
	private final Class181 aClass181_23;

	@OriginalMember(owner = "client!na", name = "Ge", descriptor = "Lclient!nj;")
	private final Class181 aClass181_24;

	@OriginalMember(owner = "client!na", name = "He", descriptor = "Lclient!nj;")
	private final Class181 aClass181_25;

	@OriginalMember(owner = "client!na", name = "Ne", descriptor = "I")
	public int anInt4869;

	@OriginalMember(owner = "client!na", name = "Ve", descriptor = "I")
	public int anInt4870;

	@OriginalMember(owner = "client!na", name = "Re", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!na", name = "af", descriptor = "I")
	private int anInt4872;

	@OriginalMember(owner = "client!na", name = "vf", descriptor = "I")
	public int anInt4877;

	@OriginalMember(owner = "client!na", name = "qf", descriptor = "F")
	private float aFloat44;

	@OriginalMember(owner = "client!na", name = "sf", descriptor = "I")
	public int anInt4876;

	@OriginalMember(owner = "client!na", name = "Ie", descriptor = "I")
	private int anInt4867;

	@OriginalMember(owner = "client!na", name = "kf", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!na", name = "Ff", descriptor = "[F")
	private final float[] aFloatArray8;

	@OriginalMember(owner = "client!na", name = "tf", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!na", name = "Rf", descriptor = "I")
	public int anInt4885;

	@OriginalMember(owner = "client!na", name = "Nf", descriptor = "I")
	private int anInt4884;

	@OriginalMember(owner = "client!na", name = "Mf", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!na", name = "of", descriptor = "I")
	private int anInt4874;

	@OriginalMember(owner = "client!na", name = "hg", descriptor = "I")
	public int anInt4892;

	@OriginalMember(owner = "client!na", name = "dg", descriptor = "I")
	private int anInt4890;

	@OriginalMember(owner = "client!na", name = "gf", descriptor = "I")
	private int anInt4873;

	@OriginalMember(owner = "client!na", name = "If", descriptor = "I")
	private int anInt4881;

	@OriginalMember(owner = "client!na", name = "Ef", descriptor = "I")
	public int anInt4880;

	@OriginalMember(owner = "client!na", name = "mg", descriptor = "[Lclient!as;")
	private final Class2_Sub4[] aClass2_Sub4Array3;

	@OriginalMember(owner = "client!na", name = "pg", descriptor = "I")
	private int anInt4894;

	@OriginalMember(owner = "client!na", name = "wg", descriptor = "I")
	private int anInt4897;

	@OriginalMember(owner = "client!na", name = "fg", descriptor = "[F")
	private final float[] aFloatArray10;

	@OriginalMember(owner = "client!na", name = "Sf", descriptor = "I")
	public int anInt4886;

	@OriginalMember(owner = "client!na", name = "qg", descriptor = "F")
	private float aFloat52;

	@OriginalMember(owner = "client!na", name = "zg", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!na", name = "ag", descriptor = "[F")
	public final float[] aFloatArray9;

	@OriginalMember(owner = "client!na", name = "xg", descriptor = "F")
	private float aFloat53;

	@OriginalMember(owner = "client!na", name = "Ag", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!na", name = "Ze", descriptor = "I")
	public int anInt4871;

	@OriginalMember(owner = "client!na", name = "Yf", descriptor = "I")
	public int anInt4888;

	@OriginalMember(owner = "client!na", name = "Mg", descriptor = "[F")
	private final float[] aFloatArray11;

	@OriginalMember(owner = "client!na", name = "rf", descriptor = "Z")
	private boolean aBoolean342;

	@OriginalMember(owner = "client!na", name = "jg", descriptor = "I")
	private int anInt4893;

	@OriginalMember(owner = "client!na", name = "Ng", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!na", name = "Rg", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!na", name = "tg", descriptor = "I")
	public int anInt4895;

	@OriginalMember(owner = "client!na", name = "Vg", descriptor = "[F")
	private final float[] aFloatArray12;

	@OriginalMember(owner = "client!na", name = "Tg", descriptor = "Lclient!wm;")
	public Class2_Sub17_Sub2 aClass2_Sub17_Sub2_1;

	@OriginalMember(owner = "client!na", name = "Xg", descriptor = "[I")
	public int[] anIntArray404;

	@OriginalMember(owner = "client!na", name = "bh", descriptor = "[I")
	public int[] anIntArray406;

	@OriginalMember(owner = "client!na", name = "Zg", descriptor = "[I")
	public int[] anIntArray405;

	@OriginalMember(owner = "client!na", name = "ch", descriptor = "[B")
	public final byte[] aByteArray55;

	@OriginalMember(owner = "client!na", name = "be", descriptor = "I")
	public final int anInt4853;

	@OriginalMember(owner = "client!na", name = "Db", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas4;

	@OriginalMember(owner = "client!na", name = "zd", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!na", name = "rc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!na", name = "Jc", descriptor = "J")
	private final long aLong223;

	@OriginalMember(owner = "client!na", name = "C", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "client!na", name = "Lg", descriptor = "I")
	public final int anInt4902;

	@OriginalMember(owner = "client!na", name = "Cg", descriptor = "Z")
	public boolean aBoolean355;

	@OriginalMember(owner = "client!na", name = "Qf", descriptor = "Z")
	private boolean aBoolean350;

	@OriginalMember(owner = "client!na", name = "Tf", descriptor = "Z")
	public boolean aBoolean351;

	@OriginalMember(owner = "client!na", name = "Df", descriptor = "Z")
	public boolean aBoolean345;

	@OriginalMember(owner = "client!na", name = "wf", descriptor = "Z")
	private boolean aBoolean343;

	@OriginalMember(owner = "client!na", name = "Og", descriptor = "Z")
	public boolean aBoolean358;

	@OriginalMember(owner = "client!na", name = "jf", descriptor = "Z")
	public boolean aBoolean339;

	@OriginalMember(owner = "client!na", name = "Qe", descriptor = "Z")
	private final boolean aBoolean334;

	@OriginalMember(owner = "client!na", name = "Xd", descriptor = "Lclient!ki;")
	public final Class145 aClass145_1;

	@OriginalMember(owner = "client!na", name = "je", descriptor = "Lclient!qk;")
	public final Class205 aClass205_1;

	@OriginalMember(owner = "client!na", name = "Zd", descriptor = "Lclient!je;")
	private final Class130 aClass130_1;

	@OriginalMember(owner = "client!na", name = "Yd", descriptor = "Lclient!cd;")
	private Class2_Sub6_Sub1 aClass2_Sub6_Sub1_1;

	@OriginalMember(owner = "client!na", name = "ae", descriptor = "Lclient!ia;")
	private final Class119 aClass119_1;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;ILclient!pb;)V")
	public Class75_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class194 arg4) {
		super(arg0, arg2);
		new Class71();
		new Class220(16);
		this.aClass181_19 = new Class181();
		this.aClass181_20 = new Class181();
		this.aClass181_21 = new Class181();
		this.aClass181_22 = new Class181();
		this.aClass181_23 = new Class181();
		this.aClass181_24 = new Class181();
		this.aClass181_25 = new Class181();
		this.anInt4869 = -1;
		this.anInt4870 = 3584;
		this.aFloat40 = 1.0F;
		this.anInt4872 = -1;
		this.anInt4877 = 0;
		this.aFloat44 = 1.0F;
		this.anInt4876 = 0;
		this.anInt4867 = 0;
		this.aFloat43 = 3000.0F;
		this.aFloatArray8 = new float[16];
		this.aFloat45 = 1.0F;
		this.anInt4885 = -1;
		this.anInt4884 = -1;
		this.aFloat47 = -1.0F;
		this.anInt4874 = 8448;
		this.anInt4892 = 512;
		this.anInt4890 = 8448;
		this.anInt4873 = 0;
		this.anInt4881 = 0;
		this.anInt4880 = 50;
		this.aClass2_Sub4Array3 = new Class2_Sub4[Static264.anInt4628];
		this.anInt4894 = 0;
		this.anInt4897 = 0;
		this.aFloatArray10 = new float[4];
		this.anInt4886 = 0;
		this.aFloat52 = 1.0F;
		this.aFloat54 = 3584.0F;
		this.aFloatArray9 = new float[4];
		this.aFloat53 = 0.0F;
		this.aFloat55 = -1.0F;
		this.anInt4871 = 0;
		this.anInt4888 = -1;
		this.aFloatArray11 = new float[4];
		this.aBoolean342 = true;
		this.anInt4893 = 0;
		this.aFloat56 = 1.0F;
		this.aFloat58 = 3584.0F;
		this.anInt4895 = 512;
		this.aFloatArray12 = new float[4];
		this.aClass2_Sub17_Sub2_1 = new Class2_Sub17_Sub2(8192);
		this.anIntArray404 = new int[1];
		this.anIntArray406 = new int[1];
		this.anIntArray405 = new int[1];
		this.aByteArray55 = new byte[16384];
		this.anInt4853 = arg3;
		this.aCanvas5 = this.aCanvas4 = arg1;
		try {
			if (Static178.aBoolean196 == null || !Static178.aBoolean196) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static178.aBoolean196 = Boolean.TRUE;
				} else {
					@Pc(276) String local276 = System.getProperty("os.name").toLowerCase();
					if (!local276.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local276.startsWith("linux") || local276.startsWith("sunos")) {
						System.load(arg4.method4396("libjaggl.so").toString());
					} else if (local276.startsWith("mac")) {
						System.load(arg4.method4396("libjaggl.jnilib").toString());
					} else if (local276.startsWith("win")) {
						System.load(arg4.method4396("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static178.aBoolean196 = Boolean.TRUE;
				}
			}
			if (Static178.aBoolean196 == null || !Static178.aBoolean196) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong222 = this.aLong223 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt4853);
			if (this.aLong223 == 0L) {
				throw new RuntimeException("");
			}
			this.method3839();
			@Pc(375) int local375 = this.method3866();
			if (local375 != 0) {
				throw new RuntimeException("");
			}
			this.anInt4902 = this.aBoolean349 ? 33639 : 5121;
			@Pc(401) int local401;
			if (this.aString41.indexOf("radeon") != -1) {
				local401 = 0;
				@Pc(403) boolean local403 = false;
				@Pc(405) boolean local405 = false;
				@Pc(414) String[] local414 = Static305.method172(this.aString41.replace('/', ' '), ' ');
				for (@Pc(416) int local416 = 0; local416 < local414.length; local416++) {
					@Pc(422) String local422 = local414[local416];
					try {
						if (local422.length() > 0) {
							if (local422.charAt(0) == 'x' && local422.length() >= 3 && Static117.method1916(local422.substring(1, 3))) {
								local422 = local422.substring(1);
								local405 = true;
							}
							if (local422.equals("hd")) {
								local403 = true;
							} else {
								if (local422.startsWith("hd")) {
									local422 = local422.substring(2);
									local403 = true;
								}
								if (local422.length() >= 4 && Static117.method1916(local422.substring(0, 4))) {
									local401 = Static389.method5412(local422.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(488) Exception local488) {
					}
				}
				if (!local405 && !local403) {
					if (local401 >= 7000 && local401 <= 9250) {
						this.aBoolean355 = false;
					}
					if (local401 >= 7000 && local401 <= 7999) {
						this.aBoolean350 = false;
					}
				}
				if (!local403 || local401 < 4000) {
					this.aBoolean351 = false;
				}
				this.aBoolean345 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean343 = this.aBoolean350;
				this.aBoolean358 = true;
			}
			if (this.bf.indexOf("intel") != -1) {
				this.aBoolean339 = false;
			}
			this.aBoolean334 = !this.bf.equals("s3 graphics");
			if (this.aBoolean350) {
				try {
					@Pc(569) int[] local569 = new int[1];
					OpenGL.glGenBuffersARB(1, local569, 0);
				} catch (@Pc(575) Throwable local575) {
					throw new RuntimeException("");
				}
			}
			Static202.method2831(true, false);
			this.aBoolean332 = true;
			this.aClass145_1 = new Class145(this, super.anInterface7_8);
			this.method3812();
			this.aClass205_1 = new Class205(this);
			this.aClass130_1 = new Class130(this);
			if (this.aClass130_1.method2771()) {
				this.aClass2_Sub6_Sub1_1 = new Class2_Sub6_Sub1(this);
				if (!this.aClass2_Sub6_Sub1_1.method698()) {
					this.aClass2_Sub6_Sub1_1.method683();
					this.aClass2_Sub6_Sub1_1 = null;
				}
			}
			this.aClass119_1 = new Class119(this);
			this.method3830();
			this.method3856();
			OpenGL.glClear(16640);
			local401 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(654) Exception local654) {
					if (local401++ > 5) {
						throw new RuntimeException("");
					}
					Static167.method6157(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(672) Throwable local672) {
			local672.printStackTrace();
			this.method6000();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!na", name = "y", descriptor = "()Lclient!c;")
	@Override
	public Class6 method6014() {
		return new Class6_Sub2();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIF)Lclient!as;")
	@Override
	public Class2_Sub4 method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub4_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class41 method5973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class41_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!na", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		if (this.aFloat57 != arg0) {
			this.aFloat57 = arg0;
			this.method3858();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5953(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class2_Sub5 local19;
		while (!this.aClass181_20.method3971()) {
			local19 = (Class2_Sub5) this.aClass181_20.method3976();
			Static273.anIntArray411[local7++] = (int) local19.aLong401;
			this.anInt4864 -= local19.anInt603;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static273.anIntArray411, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static273.anIntArray411, 0);
			local7 = 0;
		}
		while (!this.aClass181_21.method3971()) {
			local19 = (Class2_Sub5) this.aClass181_21.method3976();
			Static273.anIntArray411[local7++] = (int) local19.aLong401;
			this.anInt4865 -= local19.anInt603;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static273.anIntArray411, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static273.anIntArray411, 0);
			local7 = 0;
		}
		while (!this.aClass181_22.method3971()) {
			local19 = (Class2_Sub5) this.aClass181_22.method3976();
			Static273.anIntArray411[local7++] = local19.anInt603;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static273.anIntArray411, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static273.anIntArray411, 0);
			local7 = 0;
		}
		while (!this.aClass181_23.method3971()) {
			local19 = (Class2_Sub5) this.aClass181_23.method3976();
			Static273.anIntArray411[local7++] = (int) local19.aLong401;
			this.anInt4866 -= local19.anInt603;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static273.anIntArray411, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static273.anIntArray411, 0);
		}
		while (!this.aClass181_19.method3971()) {
			local19 = (Class2_Sub5) this.aClass181_19.method3976();
			OpenGL.glDeleteLists((int) local19.aLong401, local19.anInt603);
		}
		@Pc(215) Class2 local215;
		while (!this.aClass181_24.method3971()) {
			local215 = this.aClass181_24.method3976();
			OpenGL.glDeleteProgramARB((int) local215.aLong401);
		}
		while (!this.aClass181_25.method3971()) {
			local215 = this.aClass181_25.method3976();
			OpenGL.glDeleteObjectARB(local215.aLong401);
		}
		while (!this.aClass181_19.method3971()) {
			local19 = (Class2_Sub5) this.aClass181_19.method3976();
			OpenGL.glDeleteLists((int) local19.aLong401, local19.anInt603);
		}
		this.aClass145_1.method3029();
		if (this.pa() > 100663296 && this.aLong224 + 60000L < Static432.method5870()) {
			System.gc();
			this.aLong224 = Static432.method5870();
		}
		this.anInt4860 = local11;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()Z")
	@Override
	public boolean method5947() {
		if (this.aClass2_Sub6_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub6_Sub1_1.method684()) {
			if (!this.aClass130_1.method2768(this.aClass2_Sub6_Sub1_1)) {
				return false;
			}
			this.aClass145_1.method3031();
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(II)I")
	public int method3797(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(II)V")
	public void method3798(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method3872(7681, 7681);
		} else if (arg0 == 0) {
			this.method3872(8448, 8448);
		} else if (arg0 == 2) {
			this.method3872(7681, 34165);
		} else if (arg0 == 3) {
			this.method3872(8448, 260);
		} else if (arg0 == 4) {
			this.method3872(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!mt;Lclient!mt;FLclient!mt;)Lclient!mt;")
	@Override
	public Class141 method6005(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class141 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean337 && this.aBoolean339) {
			@Pc(15) Class141_Sub1_Sub1 local15 = null;
			@Pc(18) Class141_Sub1 local18 = (Class141_Sub1) arg0;
			@Pc(21) Class141_Sub1 local21 = (Class141_Sub1) arg1;
			@Pc(25) Class64_Sub1 local25 = local18.method3562();
			@Pc(29) Class64_Sub1 local29 = local21.method3562();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local25.anInt1424 <= local29.anInt1424 ? local29.anInt1424 : local25.anInt1424;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class141_Sub1_Sub1) {
					@Pc(56) Class141_Sub1_Sub1 local56 = (Class141_Sub1_Sub1) arg3;
					if (local56.method2914() == local44) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class141_Sub1_Sub1(this, local44);
				}
				if (local15.method2911(local25, local29, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
	private void method3799() {
		if (this.anInt4889 != 2) {
			this.anInt4889 = 2;
			this.method3879();
			this.method3835();
			this.anInt4896 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6020(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!na", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4876 = arg1;
		this.anInt4892 = arg2;
		this.anInt4871 = arg0;
		this.anInt4895 = arg3;
		this.method3820();
		this.method3827();
		if (this.anInt4889 == 3) {
			this.method3809();
		} else if (this.anInt4889 == 2) {
			this.method3879();
		}
	}

	@OriginalMember(owner = "client!na", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.method3870(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class102 method5982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static387.method5377(arg3, arg1, arg2, arg0, this);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V")
	public void method3800(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean348 != arg0) {
			this.aBoolean348 = arg0;
			this.method3832();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!kk;I)V")
	@Override
	public void method6004(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class28_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method6293(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt4822 - local12 - arg1, arg2, 1, 32993, this.anInt4902, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZI)V")
	public void method3801(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		this.method3823(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(IIII)V")
	public void method3802(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method6013(@OriginalArg(0) Class2_Sub7 arg0) {
		this.aNativeHeap2 = ((Class2_Sub7_Sub1) arg0).aNativeHeap1;
		if (this.anInterface12_3 != null) {
			return;
		}
		@Pc(16) Class2_Sub17_Sub2 local16 = new Class2_Sub17_Sub2(80);
		if (this.aBoolean349) {
			local16.method6175(-1.0F);
			local16.method6175(-1.0F);
			local16.method6175(0.0F);
			local16.method6175(0.0F);
			local16.method6175(1.0F);
			local16.method6175(1.0F);
			local16.method6175(-1.0F);
			local16.method6175(0.0F);
			local16.method6175(1.0F);
			local16.method6175(1.0F);
			local16.method6175(1.0F);
			local16.method6175(1.0F);
			local16.method6175(0.0F);
			local16.method6175(1.0F);
			local16.method6175(0.0F);
			local16.method6175(-1.0F);
			local16.method6175(1.0F);
			local16.method6175(0.0F);
			local16.method6175(0.0F);
			local16.method6175(0.0F);
		} else {
			local16.method6179(-1.0F);
			local16.method6179(-1.0F);
			local16.method6179(0.0F);
			local16.method6179(0.0F);
			local16.method6179(1.0F);
			local16.method6179(1.0F);
			local16.method6179(-1.0F);
			local16.method6179(0.0F);
			local16.method6179(1.0F);
			local16.method6179(1.0F);
			local16.method6179(1.0F);
			local16.method6179(1.0F);
			local16.method6179(0.0F);
			local16.method6179(1.0F);
			local16.method6179(0.0F);
			local16.method6179(-1.0F);
			local16.method6179(1.0F);
			local16.method6179(0.0F);
			local16.method6179(0.0F);
			local16.method6179(0.0F);
		}
		this.anInterface12_3 = this.method3848(20, local16.anInt7523, local16.aByteArray94, false);
		this.aClass47_5 = new Class47(this.anInterface12_3, 5126, 3, 0);
		this.aClass47_6 = new Class47(this.anInterface12_3, 5126, 2, 12);
		this.aClass199_1.method4570(this);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5988(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas4) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6012(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas4 == arg0) {
			local5 = this.aLong223;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas5 == arg0) {
			this.method3856();
		}
	}

	@OriginalMember(owner = "client!na", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.anInt4865 + this.anInt4864 + this.anInt4866;
	}

	@OriginalMember(owner = "client!na", name = "k", descriptor = "(I)V")
	private void method3803() {
		if (this.anInt4896 == 1) {
			return;
		}
		this.method3813();
		this.method3867(false);
		this.method3808(false);
		this.method3876(false);
		this.method3875(false);
		this.method3844(null);
		this.method3857(-2);
		this.method3798(1);
		this.anInt4896 = 1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!nf;I)V")
	public void method3805(@OriginalArg(0) Class6_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method3922(), 0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZLclient!jaggl/memory/NativeBuffer;II)Lclient!ui;")
	public Interface12 method3806(@OriginalArg(0) int arg0, @OriginalArg(2) NativeBuffer arg1, @OriginalArg(3) int arg2) {
		return (Interface12) (this.aBoolean350 ? new Class94_Sub2(this, arg2, arg1, arg0, false) : new Class170_Sub1(this, arg2, arg1));
	}

	@OriginalMember(owner = "client!na", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt4870;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!pv;)V")
	public void method3807(@OriginalArg(1) Interface9 arg0) {
		if (this.aBoolean336) {
			this.method3819(arg0);
			this.method3869(arg0);
		} else if (this.anInt4862 >= 0 && arg0 == this.anInterface9Array3[this.anInt4862]) {
			this.anInterface9Array3[this.anInt4862--] = null;
			arg0.method1073();
			if (this.anInt4862 < 0) {
				this.anInterface9_2 = this.anInterface9_1 = null;
			} else {
				this.anInterface9_2 = this.anInterface9_1 = this.anInterface9Array3[this.anInt4862];
				this.anInterface9_2.method1076();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
	@Override
	public void method5949(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!mt;)V")
	@Override
	public void method5958(@OriginalArg(0) Class141 arg0) {
		this.aClass141_Sub1_1 = (Class141_Sub1) arg0;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(ZI)V")
	public void method3808(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean352) {
			this.aBoolean352 = arg0;
			this.method3832();
			this.anInt4896 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!na", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method3803();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method3870(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean359) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean359) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
	private void method3809() {
		@Pc(19) float local19 = (float) -this.anInt4871 * this.aFloat52 / (float) this.anInt4892;
		@Pc(31) float local31 = (float) -this.anInt4876 * this.aFloat52 / (float) this.anInt4895;
		@Pc(45) float local45 = this.aFloat52 * (float) (this.anInt4760 - this.anInt4871) / (float) this.anInt4892;
		@Pc(60) float local60 = (float) (this.anInt4822 - this.anInt4876) * this.aFloat52 / (float) this.anInt4895;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local45 != local19 && local31 != local60) {
			OpenGL.glOrtho((double) local19, (double) local45, (double) -local60, (double) -local31, (double) ((float) this.anInt4880 - this.aFloat39), (double) ((float) this.anInt4870 - this.aFloat39));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class41 method6006(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class41_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(ILclient!pv;)V")
	public void method3810(@OriginalArg(1) Interface9 arg0) {
		if (this.anInt4863 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4863 >= 0) {
			this.anInterface9Array1[this.anInt4863].method1072();
		}
		this.anInterface9_1 = this.anInterface9Array1[++this.anInt4863] = arg0;
		this.anInterface9_1.method1075();
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(II)V")
	public void method3811(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt4900) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt4900 = arg0;
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
	private void method3812() {
		this.aClass6_Sub2_4 = new Class6_Sub2();
		this.aClass6_Sub2_3 = new Class6_Sub2();
		this.aClass64Array1 = new Class64[this.anInt4883];
		this.aClass64_Sub4_4 = new Class64_Sub4(this, 3553, 6408, 1, 1);
		new Class64_Sub4(this, 3553, 6408, 1, 1);
		new Class64_Sub4(this, 3553, 6408, 1, 1);
		this.aClass63_Sub2_7 = new Class63_Sub2(this);
		this.aClass63_Sub2_9 = new Class63_Sub2(this);
		this.aClass63_Sub2_3 = new Class63_Sub2(this);
		this.aClass63_Sub2_1 = new Class63_Sub2(this);
		this.aClass63_Sub2_8 = new Class63_Sub2(this);
		this.aClass63_Sub2_4 = new Class63_Sub2(this);
		this.aClass63_Sub2_10 = new Class63_Sub2(this);
		this.aClass63_Sub2_2 = new Class63_Sub2(this);
		this.aClass63_Sub2_6 = new Class63_Sub2(this);
		this.aClass63_Sub2_5 = new Class63_Sub2(this);
		if (this.aBoolean339) {
			this.aClass51_6 = new Class51(this);
			new Class51(this);
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(Z)V")
	private void method3813() {
		if (this.anInt4889 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt4760 > 0 && this.anInt4822 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt4760, (double) this.anInt4822, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt4896 &= 0xFFFFFFE7;
		this.anInt4889 = 1;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V")
	private void method3814() {
		if (this.anInt4889 != 3) {
			this.anInt4889 = 3;
			this.method3809();
			this.method3835();
			this.anInt4896 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V")
	public synchronized void method3815(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub5 local8 = new Class2_Sub5(arg0);
		this.aClass181_22.method3973(local8);
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "()V")
	@Override
	public void method5963() {
		this.method3875(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)I")
	@Override
	public int method6023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IFF)V")
	public void method3816(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat44 = arg0;
		this.aFloat53 = arg1;
		if (!this.aBoolean353) {
			this.method3817();
		}
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(B)V")
	private void method3817() {
		@Pc(15) int local15;
		if (this.aBoolean353) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt4884;
		} else {
			this.aFloat51 = (float) (this.anInt4870 - this.anInt4886) - this.aFloat53;
			this.aFloat50 = this.aFloat51 - (float) this.anInt4885 * this.aFloat44;
			if ((float) this.anInt4880 > this.aFloat50) {
				this.aFloat50 = this.anInt4880;
			}
			OpenGL.glFogf(2915, this.aFloat50);
			OpenGL.glFogf(2916, this.aFloat51);
			local15 = this.anInt4869;
		}
		Static324.aFloatArray14[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static324.aFloatArray14[2] = (float) (local15 & 0xFF) / 255.0F;
		Static324.aFloatArray14[1] = (float) (local15 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static324.aFloatArray14, 0);
		if (this.aBoolean353) {
			this.aClass119_1.aClass40_Sub1_1.method778();
		}
	}

	@OriginalMember(owner = "client!na", name = "o", descriptor = "()Z")
	@Override
	public boolean method5991() {
		return false;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIZ[B)Lclient!tb;")
	public Interface11 method3818(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface11) (this.aBoolean350 && (!arg1 || this.aBoolean343) ? new Class94_Sub1(this, 5123, arg2, arg0, arg1) : new Class170_Sub2(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!pv;)V")
	public void method3819(@OriginalArg(1) Interface9 arg0) {
		if (this.anInt4861 < 0 || arg0 != this.anInterface9Array2[this.anInt4861]) {
			throw new RuntimeException();
		}
		this.anInterface9Array2[this.anInt4861--] = null;
		arg0.method1071();
		if (this.anInt4861 >= 0) {
			this.anInterface9_2 = this.anInterface9Array2[this.anInt4861];
			this.anInterface9_2.method1074();
		} else {
			this.anInterface9_2 = null;
		}
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "()Z")
	@Override
	public boolean method5961() {
		return this.aClass119_1.method2511();
	}

	@OriginalMember(owner = "client!na", name = "m", descriptor = "(I)V")
	private void method3820() {
		@Pc(12) float[] local12 = this.aFloatArray8;
		@Pc(24) float local24 = (float) (this.anInt4880 * -this.anInt4871) / (float) this.anInt4892;
		@Pc(39) float local39 = (float) ((this.anInt4760 - this.anInt4871) * this.anInt4880) / (float) this.anInt4892;
		@Pc(50) float local50 = (float) (this.anInt4880 * this.anInt4876) / (float) this.anInt4895;
		@Pc(65) float local65 = (float) (this.anInt4880 * (this.anInt4876 - this.anInt4822)) / (float) this.anInt4895;
		if (local39 == local24 || local50 == local65) {
			local12[10] = 1.0F;
			local12[11] = 0.0F;
			local12[14] = 0.0F;
			local12[9] = 0.0F;
			local12[1] = 0.0F;
			local12[8] = 0.0F;
			local12[3] = 0.0F;
			local12[13] = 0.0F;
			local12[0] = 1.0F;
			local12[15] = 1.0F;
			local12[12] = 0.0F;
			local12[6] = 0.0F;
			local12[2] = 0.0F;
			local12[5] = 1.0F;
			local12[4] = 0.0F;
			local12[7] = 0.0F;
		} else {
			@Pc(145) float local145 = (float) this.anInt4880 * 2.0F;
			local12[7] = 0.0F;
			local12[0] = local145 / (local39 - local24);
			local12[4] = 0.0F;
			local12[1] = 0.0F;
			local12[9] = (local50 + local65) / (local50 - local65);
			local12[10] = this.aFloat49 = (float) -(this.anInt4870 + this.anInt4880) / (float) (this.anInt4870 - this.anInt4880);
			local12[3] = 0.0F;
			local12[8] = (local24 + local39) / (local39 - local24);
			local12[2] = 0.0F;
			local12[6] = 0.0F;
			local12[5] = local145 / (local50 - local65);
			local12[12] = 0.0F;
			local12[11] = -1.0F;
			local12[13] = 0.0F;
			local12[14] = this.aFloat38 = -(local145 * (float) this.anInt4870) / (float) (this.anInt4870 - this.anInt4880);
			local12[15] = 0.0F;
		}
		this.method3850();
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "()Z")
	@Override
	public boolean method5951() {
		return true;
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "()Z")
	@Override
	public boolean method5978() {
		return this.aBoolean359 && (!this.method5972() || this.aBoolean338);
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(B)Lclient!ea;")
	public Class64_Sub1 method3821() {
		return this.aClass141_Sub1_1 == null ? null : this.aClass141_Sub1_1.method3562();
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(Z)V")
	private void method3822() {
		OpenGL.glViewport(this.anInt4893, this.anInt4897, this.anInt4760, this.anInt4822);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZIZI)V")
	public void method3823(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anInt4887 != arg1) {
			if (arg1 < 0) {
				this.method3873();
				this.method3844(null);
				this.method3798(0);
				if (!this.aBoolean353) {
					this.aClass119_1.method2510(0, 0, 0, arg0, arg2);
				}
			} else {
				@Pc(27) Class64_Sub4 local27 = this.aClass145_1.method3033(arg1);
				@Pc(33) Class257 local33 = super.anInterface7_8.method1170(arg1);
				if (local33.aByte92 == 0 && local33.aByte95 == 0) {
					this.method3873();
				} else {
					@Pc(49) int local49 = local33.aBoolean493 ? 64 : 128;
					@Pc(53) int local53 = local49 * 50;
					this.method3840((float) (local33.aByte95 * (this.anInt4860 % local53)) / (float) local53, 0.0F, (float) (local33.aByte92 * (this.anInt4860 % local53)) / (float) local53);
				}
				if (this.aBoolean353) {
					this.method3844(local27);
					this.method3798(local33.anInt7252);
				} else {
					this.aClass119_1.method2510(local33.aByte94, local33.anInt7253, local33.aByte96, arg0, arg2);
					if (!this.aClass119_1.method2513(local33.anInt7252, local27)) {
						this.method3844(local27);
						this.method3798(local33.anInt7252);
					}
				}
			}
			this.anInt4887 = arg1;
		}
		this.anInt4896 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!dm;)V")
	@Override
	public void method5957(@OriginalArg(0) Class56 arg0) {
		this.aClass199_1.method4574(this, arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!tb;Z)V")
	public void method3824(@OriginalArg(0) Interface11 arg0) {
		if (arg0 != this.anInterface11_2) {
			if (this.aBoolean350) {
				OpenGL.glBindBufferARB(34963, arg0.method5886());
			}
			this.anInterface11_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(B)V")
	public void method3825() {
		if (this.anInt4896 == 4) {
			return;
		}
		this.method3813();
		this.method3867(false);
		this.method3808(false);
		this.method3876(false);
		this.method3875(false);
		this.method3857(-2);
		this.method3870(1);
		this.method3798(0);
		this.anInt4896 = 4;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "()Z")
	@Override
	public boolean method5948() {
		return true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!fc;IIII)Lclient!e;")
	@Override
	public Class63 method6016(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class63_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLclient!pv;)V")
	public void method3826(@OriginalArg(1) Interface9 arg0) {
		if (this.aBoolean336) {
			this.method3842(arg0);
			this.method3810(arg0);
		} else if (this.anInt4862 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt4862 >= 0) {
				this.anInterface9Array3[this.anInt4862].method1073();
			}
			this.anInterface9_2 = this.anInterface9_1 = this.anInterface9Array3[++this.anInt4862] = arg0;
			this.anInterface9_2.method1076();
		}
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(Z)V")
	private void method3827() {
		this.aFloat46 = this.anInt4867 - this.anInt4876;
		this.aFloat48 = this.anInt4881 - this.anInt4871;
		this.aFloat42 = this.anInt4894 - this.anInt4876;
		this.aFloat41 = this.anInt4873 - this.anInt4871;
	}

	@OriginalMember(owner = "client!na", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4877 = arg3;
		this.anInt4879 = arg0;
		this.anInt4884 = arg1;
		this.anInt4888 = arg2;
		this.aBoolean353 = true;
		this.aClass119_1.method2510(0, 0, 3, false, false);
		this.aClass119_1.aClass40_Sub1_1.method777();
		this.method3817();
		this.method3862();
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(Z)V")
	@Override
	public void method5971(@OriginalArg(0) boolean arg0) {
		this.aBoolean342 = arg0;
		this.method3859();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ui;I)V")
	public void method3828(@OriginalArg(0) Interface12 arg0) {
		if (this.anInterface12_4 != arg0) {
			if (this.aBoolean350) {
				OpenGL.glBindBufferARB(34962, arg0.method5415());
			}
			this.anInterface12_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean353) {
			throw new RuntimeException("");
		}
		this.anInt4888 = arg2;
		this.anInt4877 = arg3;
		this.anInt4884 = arg1;
		this.anInt4879 = arg0;
		this.aClass119_1.aClass40_Sub1_1.method777();
		this.method3817();
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)Lclient!n;")
	@Override
	public Class2_Sub7 method5955(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub7_Sub1 local8 = new Class2_Sub7_Sub1(arg0);
		this.aClass181_18.method3973(local8);
		return local8;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!aq;[Lclient!ok;Z)Lclient!la;")
	@Override
	public Class14 method5977(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class190[] arg1) {
		return new Class14_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "(B)V")
	private void method3830() {
		this.method3857(-2);
		for (@Pc(18) int local18 = this.anInt4883 - 1; local18 >= 0; local18--) {
			this.method3811(local18);
			this.method3844(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method3872(8448, 8448);
		this.method3802(2, 34168, 770);
		this.method3873();
		this.anInt4878 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt4901 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean346 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean354 = true;
		this.method3867(true);
		this.method3808(true);
		this.method3876(true);
		this.method3875(true);
		this.method3865();
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
		this.anInt4872 = this.anInt4869 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5970(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static105.aFloat14 = arg2;
		Static162.aFloat21 = arg1;
		Static439.aFloat95 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass6_Sub2_4.aFloat59 + this.aClass6_Sub2_4.aFloat65 * (float) arg2 + this.aClass6_Sub2_4.aFloat64 * (float) arg0 + (float) arg1 * this.aClass6_Sub2_4.aFloat69;
		if ((float) this.anInt4880 > local28 || local28 > (float) this.anInt4870) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass6_Sub2_4.aFloat60 + (float) arg2 * this.aClass6_Sub2_4.aFloat62 + (float) arg1 * this.aClass6_Sub2_4.aFloat61 + (float) arg0 * this.aClass6_Sub2_4.aFloat63) * (float) this.anInt4892 / local28);
		@Pc(117) int local117 = (int) ((this.aClass6_Sub2_4.aFloat68 + (float) arg0 * this.aClass6_Sub2_4.aFloat66 + (float) arg1 * this.aClass6_Sub2_4.aFloat67 + (float) arg2 * this.aClass6_Sub2_4.aFloat70) * (float) this.anInt4895 / local28);
		if ((float) local85 >= this.aFloat41 && (float) local85 <= this.aFloat48 && (float) local117 >= this.aFloat42 && this.aFloat46 >= (float) local117) {
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat42);
			arg3[0] = (int) ((float) local85 - this.aFloat41);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[Lclient!as;)V")
	@Override
	public void method6018(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub4Array3[local7] = arg1[local7];
		}
		this.anInt4868 = arg0;
		if (this.anInt4889 != 1) {
			this.method3831();
		}
	}

	@OriginalMember(owner = "client!na", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat39;
	}

	@OriginalMember(owner = "client!na", name = "n", descriptor = "(I)V")
	private void method3831() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt4868; local7++) {
			@Pc(14) Class2_Sub4 local14 = this.aClass2_Sub4Array3[local7];
			Static425.aFloatArray32[0] = local14.method4087();
			@Pc(25) int local25 = local7 + 16386;
			Static425.aFloatArray32[1] = local14.method4081();
			Static425.aFloatArray32[2] = local14.method4092();
			Static425.aFloatArray32[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static425.aFloatArray32, 0);
			@Pc(54) int local54 = local14.method4084();
			@Pc(60) float local60 = local14.method4085() / 255.0F;
			Static425.aFloatArray32[0] = local60 * (float) (local54 >> 16 & 0xFF);
			Static425.aFloatArray32[1] = local60 * (float) (local54 >> 8 & 0xFF);
			Static425.aFloatArray32[2] = (float) (local54 & 0xFF) * local60;
			OpenGL.glLightfv(local25, 4609, Static425.aFloatArray32, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method4089() * local14.method4089()));
			OpenGL.glEnable(local25);
		}
		while (local7 < this.anInt4898) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt4898 = this.anInt4868;
	}

	@OriginalMember(owner = "client!na", name = "o", descriptor = "(I)V")
	private void method3832() {
		if (this.aBoolean352 && !this.aBoolean348) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!na", name = "w", descriptor = "()Z")
	@Override
	public boolean method6002() {
		return true;
	}

	@OriginalMember(owner = "client!na", name = "p", descriptor = "(I)V")
	public void method3833() {
		if (this.anInt4896 == 2) {
			return;
		}
		this.method3813();
		this.method3867(false);
		this.method3808(false);
		this.method3876(false);
		this.method3875(false);
		this.method3857(-2);
		this.anInt4896 = 2;
	}

	@OriginalMember(owner = "client!na", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt4873 = 0;
		this.anInt4867 = this.anInt4822;
		this.anInt4894 = 0;
		this.anInt4881 = this.anInt4760;
		OpenGL.glDisable(3089);
		this.method3827();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I")
	@Override
	public int method5987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(II)I")
	public int method3834(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!na", name = "i", descriptor = "()V")
	@Override
	public void method5975() {
		if (this.aClass2_Sub6_Sub1_1 != null && this.aClass2_Sub6_Sub1_1.method684()) {
			this.aClass130_1.method2774(this.aClass2_Sub6_Sub1_1);
			this.aClass145_1.method3031();
		}
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "()Z")
	@Override
	public boolean method5972() {
		return this.aClass2_Sub6_Sub1_1 != null && this.aClass2_Sub6_Sub1_1.method684();
	}

	@OriginalMember(owner = "client!na", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt4880;
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V")
	@Override
	public void method5984(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()Z")
	@Override
	public boolean method5952() {
		return true;
	}

	@OriginalMember(owner = "client!na", name = "v", descriptor = "()V")
	@Override
	protected void method6000() {
		for (@Pc(6) Class2 local6 = this.aClass181_18.method3972(); local6 != null; local6 = this.aClass181_18.method3975()) {
			((Class2_Sub7_Sub1) local6).method898();
		}
		if (this.aClass130_1 != null) {
			this.aClass130_1.method2763();
		}
		if (this.anOpenGL1 != null) {
			this.method3878();
			@Pc(40) Enumeration local40 = this.aHashtable1.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable1.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean332) {
			Static177.method2584(true, false);
			this.aBoolean332 = false;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5950() {
	}

	@OriginalMember(owner = "client!na", name = "z", descriptor = "()Z")
	@Override
	public boolean method6015() {
		return true;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method3803();
		this.method3870(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean359) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean359) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!na", name = "u", descriptor = "()Z")
	@Override
	public boolean method5999() {
		return this.aClass2_Sub6_Sub1_1 != null && (this.anInt4853 <= 1 || this.aBoolean338);
	}

	@OriginalMember(owner = "client!na", name = "A", descriptor = "()Z")
	@Override
	public boolean method6017() {
		return true;
	}

	@OriginalMember(owner = "client!na", name = "q", descriptor = "(I)V")
	private void method3835() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass6_Sub2_4.method3922(), 0);
		if (this.aBoolean353) {
			this.aClass119_1.aClass40_Sub1_1.method777();
		}
		this.method3836();
		this.method3831();
	}

	@OriginalMember(owner = "client!na", name = "r", descriptor = "(I)V")
	public void method3836() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray9, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!nf;)V")
	public void method3837(@OriginalArg(1) Class6_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method3922(), 0);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IB)I")
	public int method3838(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!na", name = "s", descriptor = "(I)V")
	private void method3839() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static167.method6157(1000L);
		}
	}

	@OriginalMember(owner = "client!na", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class102_Sub1 local6 = (Class102_Sub1) arg1;
		@Pc(9) Class64_Sub4_Sub1 local9 = local6.aClass64_Sub4_Sub1_1;
		this.method3833();
		this.method3844(local6.aClass64_Sub4_Sub1_1);
		this.method3870(1);
		this.method3872(8448, 7681);
		this.method3802(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat36 / (float) local9.anInt4413;
		@Pc(46) float local46 = local9.aFloat37 / (float) local9.anInt4416;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4873 - arg2), (float) (this.anInt4894 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4873, this.anInt4894);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4873 - arg2), local46 * (float) (this.anInt4867 - arg3));
		OpenGL.glVertex2i(this.anInt4873, this.anInt4867);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4881 - arg2), (float) (this.anInt4867 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4881, this.anInt4867);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4881 - arg2), local46 * (float) (this.anInt4894 - arg3));
		OpenGL.glVertex2i(this.anInt4881, this.anInt4894);
		OpenGL.glEnd();
		this.method3802(0, 5890, 768);
	}

	@OriginalMember(owner = "client!na", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class6 arg0) {
		this.aClass6_Sub2_4 = (Class6_Sub2) arg0;
		this.aClass6_Sub2_3.method3921(this.aClass6_Sub2_4);
		if (this.anInt4889 != 1) {
			this.method3835();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BFFF)V")
	private void method3840(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean357) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean357 = true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!tb;IIII)V")
	public void method3841(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0.method5885();
		@Pc(14) int local14 = arg1 * this.method3834(local7);
		this.method3824(arg0);
		OpenGL.glDrawElements(4, arg2, local7, arg0.method5884() + (long) local14);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ok;Z)Lclient!o;")
	@Override
	public Class41 method5986(@OriginalArg(0) Class190 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt5313 * arg0.anInt5312];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray57 == null) {
			for (local21 = 0; local21 < arg0.anInt5313; local21++) {
				for (local25 = 0; local25 < arg0.anInt5312; local25++) {
					@Pc(79) int local79 = arg0.anIntArray453[arg0.aByteArray58[local14++] & 0xFF];
					local12[local16++] = local79 == 0 ? 0 : local79 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt5313; local21++) {
				for (local25 = 0; local25 < arg0.anInt5312; local25++) {
					local12[local16++] = arg0.anIntArray453[arg0.aByteArray58[local14] & 0xFF] | arg0.aByteArray57[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(119) Class41 local119 = this.method6006(local12, arg0.anInt5312, arg0.anInt5312, arg0.anInt5313);
		local119.ha(arg0.anInt5311, arg0.anInt5315, arg0.anInt5310, arg0.anInt5314);
		return local119;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(BLclient!pv;)V")
	public void method3842(@OriginalArg(1) Interface9 arg0) {
		if (this.anInt4861 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4861 >= 0) {
			this.anInterface9Array2[this.anInt4861].method1071();
		}
		this.anInterface9_2 = this.anInterface9Array2[++this.anInt4861] = arg0;
		this.anInterface9_2.method1074();
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	@Override
	public void method5954(@OriginalArg(0) int arg0) {
		this.method3839();
	}

	@OriginalMember(owner = "client!na", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
		this.anInt4859 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt4859++;
		}
		this.anInt4858 = 0x1 << this.anInt4859;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIB)V")
	public void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!ed;)V")
	public void method3844(@OriginalArg(1) Class64 arg0) {
		@Pc(11) Class64 local11 = this.aClass64Array1[this.anInt4900];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt4388);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt4388);
				} else if (arg0.anInt4388 != local11.anInt4388) {
					OpenGL.glDisable(local11.anInt4388);
					OpenGL.glEnable(arg0.anInt4388);
				}
				OpenGL.glBindTexture(arg0.anInt4388, arg0.method3526());
			}
			this.aClass64Array1[this.anInt4900] = arg0;
		}
		this.anInt4896 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
	@Override
	public void method5966(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!na", name = "u", descriptor = "(I)V")
	public void method3845() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(IIIIII)Lclient!mt;")
	@Override
	public Class141 method6009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean337 ? new Class141_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!na", name = "v", descriptor = "(I)V")
	public void method3846() {
		if (this.anInt4896 == 16) {
			return;
		}
		this.method3814();
		this.method3867(true);
		this.method3876(true);
		this.method3875(true);
		this.method3870(1);
		this.method3798(0);
		this.anInt4896 = 16;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass130_1.method2770(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!na", name = "q", descriptor = "()V")
	@Override
	public void method5992() {
		this.aClass130_1.method2773();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class102 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class102_Sub1 local6 = (Class102_Sub1) arg5;
		@Pc(9) Class64_Sub4_Sub1 local9 = local6.aClass64_Sub4_Sub1_1;
		this.method3833();
		this.method3844(local6.aClass64_Sub4_Sub1_1);
		this.method3870(1);
		this.method3872(8448, 7681);
		this.method3802(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat36 / (float) local9.anInt4413;
		@Pc(46) float local46 = local9.aFloat37 / (float) local9.anInt4416;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method3802(0, 5890, 768);
	}

	@OriginalMember(owner = "client!na", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.aBoolean353 = false;
		this.aClass119_1.method2510(0, 0, 0, false, false);
		this.method3817();
		this.method3862();
	}

	@OriginalMember(owner = "client!na", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(61) float local61;
		@Pc(49) float local49;
		if (this.aClass64_Sub4_Sub1_4 == null || arg2 > this.aClass64_Sub4_Sub1_4.anInt4399 || this.aClass64_Sub4_Sub1_4.anInt4403 < arg3) {
			this.aClass64_Sub4_Sub1_4 = Static342.method4851(this, arg6, arg2, arg3);
			this.aClass64_Sub4_Sub1_4.method3530(false, false);
			local61 = this.aClass64_Sub4_Sub1_4.aFloat37;
			local49 = this.aClass64_Sub4_Sub1_4.aFloat36;
		} else {
			this.aClass64_Sub4_Sub1_4.method3534(arg2, 6406, arg6, false, arg3);
			local49 = (float) arg2 * this.aClass64_Sub4_Sub1_4.aFloat36 / (float) this.aClass64_Sub4_Sub1_4.anInt4399;
			local61 = this.aClass64_Sub4_Sub1_4.aFloat37 * (float) arg3 / (float) this.aClass64_Sub4_Sub1_4.anInt4403;
		}
		this.method3833();
		this.method3844(this.aClass64_Sub4_Sub1_4);
		this.method3870(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3854(arg5);
		this.method3872(34165, 34165);
		this.method3802(0, 34166, 768);
		this.method3802(2, 5890, 770);
		this.method3843(0, 34166);
		this.method3843(2, 5890);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = (float) arg2 + local151;
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
		this.method3802(0, 5890, 768);
		this.method3802(2, 34166, 770);
		this.method3843(0, 5890);
		this.method3843(2, 34166);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!e;Lclient!dm;Lclient!c;Lclient!kk;I)V")
	@Override
	public void method5960(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) Class28_Sub4 arg3) {
		arg0.method6293(arg2, arg3, 0);
		this.method5957(arg1);
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
	@Override
	public void method5974(@OriginalArg(0) int arg0) {
		this.method3878();
	}

	@OriginalMember(owner = "client!na", name = "i", descriptor = "(B)V")
	private void method3847() {
		if (this.anInt4873 <= this.anInt4881 && this.anInt4894 <= this.anInt4867) {
			OpenGL.glScissor(this.anInt4893 + this.anInt4873, this.anInt4822 + this.anInt4897 + -this.anInt4867, this.anInt4881 - this.anInt4873, -this.anInt4894 + this.anInt4867);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZII[BZ)Lclient!ui;")
	public Interface12 method3848(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		return (Interface12) (this.aBoolean350 && (!arg3 || this.aBoolean343) ? new Class94_Sub2(this, arg0, arg2, arg1, arg3) : new Class170_Sub1(this, arg0, arg2, arg1));
	}

	@OriginalMember(owner = "client!na", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3803();
		this.method3870(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "(B)V")
	private void method3849() {
		Static324.aFloatArray14[1] = this.aFloat40 * this.aFloat55;
		Static324.aFloatArray14[3] = 1.0F;
		Static324.aFloatArray14[2] = this.aFloat45 * this.aFloat55;
		Static324.aFloatArray14[0] = this.aFloat55 * this.aFloat56;
		OpenGL.glLightfv(16384, 4609, Static324.aFloatArray14, 0);
		Static324.aFloatArray14[3] = 1.0F;
		Static324.aFloatArray14[0] = this.aFloat56 * -this.aFloat47;
		Static324.aFloatArray14[1] = this.aFloat40 * -this.aFloat47;
		Static324.aFloatArray14[2] = -this.aFloat47 * this.aFloat45;
		OpenGL.glLightfv(16385, 4609, Static324.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!na", name = "k", descriptor = "(B)V")
	private void method3850() {
		if (this.aFloat39 == 0.0F) {
			this.aFloatArray8[10] = this.aFloat49;
			this.aFloatArray8[14] = this.aFloat38;
		} else {
			@Pc(27) float local27 = this.aFloat43 / (this.aFloat43 + this.aFloat39);
			@Pc(31) float local31 = local27 * local27;
			@Pc(48) float local48 = (1.0F - local27) * -this.aFloat38 * (1.0F - local27) / this.aFloat39;
			this.aFloatArray8[14] = this.aFloat38 * local31;
			this.aFloatArray8[10] = this.aFloat49 + local48;
		}
		this.aFloat54 = (this.aFloatArray8[14] - (float) this.anInt4870) / this.aFloatArray8[10];
		this.aFloat58 = (float) this.anInt4870 - this.aFloat39;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZ)V")
	public synchronized void method3851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class2_Sub5 local14 = new Class2_Sub5(arg1);
		local14.aLong401 = arg0;
		this.aClass181_23.method3973(local14);
	}

	@OriginalMember(owner = "client!na", name = "x", descriptor = "()Z")
	@Override
	public boolean method6003() {
		return false;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!db;Lclient!db;Lclient!db;ILclient!db;)V")
	public void method3852(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(4) Class47 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method3828(arg1.anInterface12_1);
			OpenGL.glVertexPointer(arg1.aByte10, arg1.aShort5, this.anInterface12_4.method5414(), this.anInterface12_4.method5417() + (long) arg1.aByte9);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method3828(arg3.anInterface12_1);
			OpenGL.glNormalPointer(arg3.aShort5, this.anInterface12_4.method5414(), this.anInterface12_4.method5417() + (long) arg3.aByte9);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method3828(arg0.anInterface12_1);
			OpenGL.glColorPointer(arg0.aByte10, arg0.aShort5, this.anInterface12_4.method5414(), this.anInterface12_4.method5417() + (long) arg0.aByte9);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method3828(arg2.anInterface12_1);
			OpenGL.glTexCoordPointer(arg2.aByte10, arg2.aShort5, this.anInterface12_4.method5414(), this.anInterface12_4.method5417() + (long) arg2.aByte9);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4869 == arg0 && arg1 == this.anInt4885 && arg2 == this.anInt4886) {
			return;
		}
		this.anInt4869 = arg0;
		this.anInt4886 = arg2;
		this.anInt4885 = arg1;
		if (this.aBoolean353) {
			return;
		}
		this.method3817();
		this.method3862();
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt4880 && this.anInt4870 == arg1) {
			return;
		}
		this.anInt4870 = arg1;
		this.anInt4880 = arg0;
		this.method3820();
		this.method3817();
		if (this.anInt4889 == 3) {
			this.method3809();
		} else if (this.anInt4889 == 2) {
			this.method3879();
			return;
		}
	}

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(6) int local6 = this.anInt4905;
		this.anInt4905 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!na", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(6) int local6 = this.anInt4904;
		this.anInt4904 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5962(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)V")
	public synchronized void method3853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub5 local8 = new Class2_Sub5(arg0);
		local8.aLong401 = arg1;
		this.aClass181_21.method3973(local8);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)V")
	public void method3854(@OriginalArg(1) int arg0) {
		Static324.aFloatArray14[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static324.aFloatArray14[3] = (float) (arg0 >>> 24) / 255.0F;
		Static324.aFloatArray14[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static324.aFloatArray14[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static324.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!na", name = "m", descriptor = "()Lclient!c;")
	@Override
	public Class6 method5990() {
		return this.aClass6_Sub2_1;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
	@Override
	public void method5968(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt4857 = arg0;
		this.aClass145_1.method3031();
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(BII)V")
	public synchronized void method3855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub5 local8 = new Class2_Sub5(arg1);
		local8.aLong401 = arg0;
		this.aClass181_20.method3973(local8);
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "(Z)V")
	private void method3856() {
		if (this.aCanvas5 == null) {
			this.anInt4725 = this.anInt4727 = 0;
		} else {
			@Pc(20) Dimension local20 = this.aCanvas5.getSize();
			this.anInt4725 = local20.width;
			this.anInt4727 = local20.height;
		}
		if (this.anInterface9_1 == null) {
			this.anInt4822 = this.anInt4727;
			this.anInt4760 = this.anInt4725;
			this.method3822();
		}
		this.method3865();
		this.va();
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "()Z")
	@Override
	public boolean method5969() {
		return true;
	}

	@OriginalMember(owner = "client!na", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat43;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class22 method6010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class22_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)V")
	public void method3857(@OriginalArg(0) int arg0) {
		this.method3801(true, arg0);
	}

	@OriginalMember(owner = "client!na", name = "l", descriptor = "(B)V")
	private void method3858() {
		Static324.aFloatArray14[2] = this.aFloat57 * this.aFloat45;
		Static324.aFloatArray14[1] = this.aFloat57 * this.aFloat40;
		Static324.aFloatArray14[3] = 1.0F;
		Static324.aFloatArray14[0] = this.aFloat57 * this.aFloat56;
		OpenGL.glLightModelfv(2899, Static324.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!na", name = "w", descriptor = "(I)V")
	private void method3859() {
		OpenGL.glDepthMask(this.aBoolean347 && this.aBoolean342);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(JB)V")
	public synchronized void method3860(@OriginalArg(0) long arg0) {
		@Pc(19) Class2 local19 = new Class2();
		local19.aLong401 = arg0;
		this.aClass181_25.method3973(local19);
	}

	@OriginalMember(owner = "client!na", name = "s", descriptor = "()I")
	@Override
	public int method5994() {
		return 4;
	}

	@OriginalMember(owner = "client!na", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3803();
		this.method3870(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!na", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4822 < arg3) {
			arg3 = this.anInt4822;
		}
		if (arg2 > this.anInt4760) {
			arg2 = this.anInt4760;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt4881 = arg2;
		this.anInt4894 = arg1;
		this.anInt4867 = arg3;
		this.anInt4873 = arg0;
		OpenGL.glEnable(3089);
		this.method3827();
		this.method3847();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(FI)V")
	public void method3861(@OriginalArg(0) float arg0) {
		if (this.aFloat52 == arg0) {
			return;
		}
		this.aFloat52 = arg0;
		if (this.anInt4889 == 3) {
			this.method3809();
			return;
		}
	}

	@OriginalMember(owner = "client!na", name = "l", descriptor = "()V")
	@Override
	public void method5983() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!na", name = "x", descriptor = "(I)V")
	private void method3862() {
		if (this.aBoolean341 && this.aBoolean353 | this.anInt4885 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!na", name = "y", descriptor = "(I)V")
	public void method3863() {
		if (this.anInt4896 == 8) {
			return;
		}
		this.method3799();
		this.method3867(true);
		this.method3876(true);
		this.method3875(true);
		this.method3870(1);
		this.method3798(0);
		this.anInt4896 = 8;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
	public void method3864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4893 = arg1;
		this.anInt4897 = arg0;
		this.method3822();
		this.method3847();
	}

	@OriginalMember(owner = "client!na", name = "z", descriptor = "(I)V")
	public void method3865() {
		if (this.anInt4889 != 0) {
			this.anInt4889 = 0;
			this.anInt4896 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!na", name = "m", descriptor = "(B)I")
	private int method3866() {
		@Pc(5) int local5 = 0;
		this.bf = OpenGL.glGetString(7936).toLowerCase();
		this.aString41 = OpenGL.glGetString(7937).toLowerCase();
		if (this.bf.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.bf.indexOf("brian paul") != -1 || this.bf.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(52) String[] local52 = Static305.method172(local44.replace('.', ' '), ' ');
		if (local52.length >= 2) {
			try {
				@Pc(62) int local62 = Static389.method5412(local52[0]);
				@Pc(68) int local68 = Static389.method5412(local52[1]);
				this.anInt4903 = local68 + local62 * 10;
			} catch (@Pc(77) NumberFormatException local77) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt4903 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(116) int[] local116 = new int[1];
		OpenGL.glGetIntegerv(34018, local116, 0);
		this.anInt4883 = local116[0];
		OpenGL.glGetIntegerv(34929, local116, 0);
		this.anInt4882 = local116[0];
		OpenGL.glGetIntegerv(34930, local116, 0);
		this.anInt4899 = local116[0];
		if (this.anInt4883 < 2 || this.anInt4882 < 2 || this.anInt4899 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean349 = NativeStream.a();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean350 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean359 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean335 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean333 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean344 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean355 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean345 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean337 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean351 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean360 = false;
		this.aBoolean339 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean336 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean340 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean338 = this.aBoolean336 & this.aBoolean340;
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IZ)V")
	public void method3867(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean341 != arg0) {
			this.aBoolean341 = arg0;
			this.method3862();
			this.anInt4896 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "(II)V")
	public synchronized void method3868(@OriginalArg(0) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong401 = arg0;
		this.aClass181_24.method3973(local7);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!pv;I)V")
	public void method3869(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt4863 < 0 || arg0 != this.anInterface9Array1[this.anInt4863]) {
			throw new RuntimeException();
		}
		this.anInterface9Array1[this.anInt4863--] = null;
		arg0.method1072();
		if (this.anInt4863 < 0) {
			this.anInterface9_1 = null;
		} else {
			this.anInterface9_1 = this.anInterface9Array1[this.anInt4863];
			this.anInterface9_1.method1075();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3803();
		this.method3870(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5964(@OriginalArg(0) Canvas arg0) {
		this.aLong222 = 0L;
		this.aCanvas5 = null;
		if (arg0 == null || arg0 == this.aCanvas4) {
			this.aCanvas5 = this.aCanvas4;
			this.aLong222 = this.aLong223;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable1.get(arg0);
			this.aLong222 = local36;
			this.aCanvas5 = arg0;
		}
		if (this.aCanvas5 == null || this.aLong222 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong222);
		this.method3856();
	}

	@OriginalMember(owner = "client!na", name = "t", descriptor = "()V")
	@Override
	public void method5998() {
		if (!this.aBoolean334 || this.anInt4760 <= 0 || this.anInt4822 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt4873;
		@Pc(25) int local25 = this.anInt4881;
		@Pc(28) int local28 = this.anInt4894;
		@Pc(31) int local31 = this.anInt4867;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3865();
		this.method3867(false);
		this.method3808(false);
		this.method3876(false);
		this.method3875(false);
		this.method3844(null);
		this.method3857(-2);
		this.method3798(1);
		this.method3870(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt4760, this.anInt4822, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ba(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!na", name = "k", descriptor = "()V")
	@Override
	public void method5980() {
	}

	@OriginalMember(owner = "client!na", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat43 && arg1 == this.aFloat39) {
			return;
		}
		this.aFloat43 = arg0;
		this.aFloat39 = arg1;
		this.method3850();
		if (this.anInt4889 == 3) {
			this.method3809();
		} else if (this.anInt4889 == 2) {
			this.method3879();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5956(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5983();
	}

	@OriginalMember(owner = "client!na", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt4894;
		arg0[2] = this.anInt4881;
		arg0[3] = this.anInt4867;
		arg0[0] = this.anInt4873;
	}

	@OriginalMember(owner = "client!na", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4867 > arg3) {
			this.anInt4867 = arg3;
		}
		if (arg2 < this.anInt4881) {
			this.anInt4881 = arg2;
		}
		if (this.anInt4873 < arg0) {
			this.anInt4873 = arg0;
		}
		if (this.anInt4894 < arg1) {
			this.anInt4894 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method3827();
		this.method3847();
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(BI)V")
	public void method3870(@OriginalArg(1) int arg0) {
		if (this.anInt4878 == arg0) {
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
			local24 = 3;
			local22 = true;
		} else {
			local22 = false;
			local24 = 0;
		}
		if (!this.aBoolean354) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean354 = true;
		}
		if (local22 != this.aBoolean346) {
			if (local22) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean346 = local22;
		}
		if (local24 != this.anInt4901) {
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
			this.anInt4901 = local24;
		}
		this.anInt4896 &= 0xFFFFFFE3;
		this.anInt4878 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "B", descriptor = "()Z")
	@Override
	public boolean method6021() {
		return true;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(IIII)V")
	public void method3871(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)V")
	public void method3872(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4900 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (arg1 != this.anInt4890) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt4890 = arg1;
			local17 = true;
		}
		if (arg0 != this.anInt4874) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			this.anInt4874 = arg0;
			local17 = true;
		}
		if (local17) {
			this.anInt4896 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!na", name = "A", descriptor = "(I)V")
	private void method3873() {
		if (this.aBoolean357) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean357 = false;
		}
	}

	@OriginalMember(owner = "client!na", name = "B", descriptor = "(I)V")
	public void method3874() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZB)V")
	public void method3875(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean347) {
			this.aBoolean347 = arg0;
			this.method3859();
			this.anInt4896 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!na", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt4872 != arg0;
		if (local11 || arg1 != this.aFloat55 || arg2 != this.aFloat47) {
			this.aFloat47 = arg2;
			this.anInt4872 = arg0;
			this.aFloat55 = arg1;
			if (local11) {
				this.aFloat40 = (float) (this.anInt4872 & 0xFF00) / 65280.0F;
				this.aFloat45 = (float) (this.anInt4872 & 0xFF) / 255.0F;
				this.aFloat56 = (float) (this.anInt4872 & 0xFF0000) / 1.671168E7F;
				this.method3858();
			}
			this.method3849();
		}
		if (this.aFloatArray10[0] == arg3 && this.aFloatArray10[1] == arg4 && this.aFloatArray10[2] == arg5) {
			return;
		}
		this.aFloatArray10[1] = arg4;
		this.aFloatArray10[2] = arg5;
		this.aFloatArray10[0] = arg3;
		this.aFloatArray11[2] = -arg5;
		this.aFloatArray11[1] = -arg4;
		this.aFloatArray11[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray9[0] = local138 * arg3;
		this.aFloatArray9[2] = local138 * arg5;
		this.aFloatArray9[1] = local138 * arg4;
		this.aFloatArray12[0] = -this.aFloatArray9[0];
		this.aFloatArray12[2] = -this.aFloatArray9[2];
		this.aFloatArray12[1] = -this.aFloatArray9[1];
		this.method3836();
		this.anInt4875 = (int) (arg3 * 256.0F / arg4);
		this.anInt4891 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(ZI)V")
	public void method3876(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean356 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean356 = arg0;
		this.anInt4896 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(FFFIF)V")
	public void method3877(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static324.aFloatArray14[2] = arg0;
		Static324.aFloatArray14[3] = arg3;
		Static324.aFloatArray14[1] = arg2;
		Static324.aFloatArray14[0] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static324.aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!na", name = "i", descriptor = "(Z)V")
	private void method3878() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([Lclient!e;Lclient!dm;Lclient!c;[Lclient!kk;I)V")
	@Override
	public void method5965(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) Class28_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method6004(arg0, arg2, arg3, arg4);
		this.method5957(arg1);
	}

	@OriginalMember(owner = "client!na", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!na", name = "n", descriptor = "(B)V")
	private void method3879() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray8, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!na", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = (float) arg0 * this.aClass6_Sub2_4.aFloat64 + (float) arg1 * this.aClass6_Sub2_4.aFloat69 + this.aClass6_Sub2_4.aFloat65 * (float) arg2 + this.aClass6_Sub2_4.aFloat59;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass6_Sub2_4.aFloat59 + (float) arg4 * this.aClass6_Sub2_4.aFloat69 + (float) arg3 * this.aClass6_Sub2_4.aFloat64 + (float) arg5 * this.aClass6_Sub2_4.aFloat65;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt4880 > local28 && local59 < (float) this.anInt4880 || !(!(local28 > (float) this.anInt4870) || !((float) this.anInt4870 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass6_Sub2_4.aFloat61 * (float) arg1 + (float) arg0 * this.aClass6_Sub2_4.aFloat63 + (float) arg2 * this.aClass6_Sub2_4.aFloat62 + this.aClass6_Sub2_4.aFloat60) * (float) this.anInt4892 / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt4892 * (this.aClass6_Sub2_4.aFloat60 + (float) arg5 * this.aClass6_Sub2_4.aFloat62 + (float) arg4 * this.aClass6_Sub2_4.aFloat61 + this.aClass6_Sub2_4.aFloat63 * (float) arg3) / local59);
		if (this.aFloat41 > (float) local123 && this.aFloat41 > (float) local155 || this.aFloat48 < (float) local123 && (float) local155 > this.aFloat48) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass6_Sub2_4.aFloat68 + (float) arg2 * this.aClass6_Sub2_4.aFloat70 + this.aClass6_Sub2_4.aFloat66 * (float) arg0 + this.aClass6_Sub2_4.aFloat67 * (float) arg1) * (float) this.anInt4895 / local28);
			@Pc(245) int local245 = (int) ((this.aClass6_Sub2_4.aFloat70 * (float) arg5 + (float) arg4 * this.aClass6_Sub2_4.aFloat67 + this.aClass6_Sub2_4.aFloat66 * (float) arg3 + this.aClass6_Sub2_4.aFloat68) * (float) this.anInt4895 / local59);
			return (!((float) local213 < this.aFloat42) || !(this.aFloat42 > (float) local245)) && (!(this.aFloat46 < (float) local213) || !((float) local245 > this.aFloat46));
		}
	}
}
