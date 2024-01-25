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

@OriginalClass("client!bt")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!bt", name = "Yb", descriptor = "I")
	private int anInt730;

	@OriginalMember(owner = "client!bt", name = "Bc", descriptor = "I")
	public int anInt758;

	@OriginalMember(owner = "client!bt", name = "sd", descriptor = "I")
	public int anInt801;

	@OriginalMember(owner = "client!bt", name = "Vd", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!bt", name = "qe", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!bt", name = "se", descriptor = "I")
	public int anInt841;

	@OriginalMember(owner = "client!bt", name = "ue", descriptor = "Lclient!wr;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "client!bt", name = "we", descriptor = "Lclient!wr;")
	private Interface13 anInterface13_2;

	@OriginalMember(owner = "client!bt", name = "Be", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!bt", name = "De", descriptor = "I")
	public int anInt846;

	@OriginalMember(owner = "client!bt", name = "Ee", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!bt", name = "Le", descriptor = "Lclient!vs;")
	public Class57_Sub2 aClass57_Sub2_1;

	@OriginalMember(owner = "client!bt", name = "Oe", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!bt", name = "Pe", descriptor = "Z")
	public boolean aBoolean34;

	@OriginalMember(owner = "client!bt", name = "Qe", descriptor = "Z")
	public boolean aBoolean35;

	@OriginalMember(owner = "client!bt", name = "Re", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!bt", name = "Te", descriptor = "Z")
	public boolean aBoolean36;

	@OriginalMember(owner = "client!bt", name = "Ue", descriptor = "Z")
	public boolean aBoolean37;

	@OriginalMember(owner = "client!bt", name = "Ve", descriptor = "Lclient!fl;")
	public Class72_Sub2 aClass72_Sub2_3;

	@OriginalMember(owner = "client!bt", name = "Ye", descriptor = "Lclient!vs;")
	public Class57_Sub2 aClass57_Sub2_2;

	@OriginalMember(owner = "client!bt", name = "Ze", descriptor = "Lclient!nn;")
	public Class172 aClass172_1;

	@OriginalMember(owner = "client!bt", name = "bf", descriptor = "Lclient!vs;")
	public Class57_Sub2 bf;

	@OriginalMember(owner = "client!bt", name = "df", descriptor = "Lclient!hf;")
	private Class62_Sub2_Sub1 aClass62_Sub2_Sub1_1;

	@OriginalMember(owner = "client!bt", name = "ef", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!bt", name = "ff", descriptor = "Lclient!jd;")
	public Class118 aClass118_1;

	@OriginalMember(owner = "client!bt", name = "jf", descriptor = "Z")
	private boolean aBoolean40;

	@OriginalMember(owner = "client!bt", name = "lf", descriptor = "Z")
	private boolean aBoolean41;

	@OriginalMember(owner = "client!bt", name = "mf", descriptor = "Z")
	private boolean aBoolean42;

	@OriginalMember(owner = "client!bt", name = "qf", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!bt", name = "sf", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!bt", name = "tf", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!bt", name = "uf", descriptor = "F")
	private float aFloat12;

	@OriginalMember(owner = "client!bt", name = "wf", descriptor = "Lclient!vs;")
	public Class57_Sub2 aClass57_Sub2_3;

	@OriginalMember(owner = "client!bt", name = "xf", descriptor = "Z")
	public boolean aBoolean44;

	@OriginalMember(owner = "client!bt", name = "yf", descriptor = "Lclient!uk;")
	public Class62_Sub2 aClass62_Sub2_1;

	@OriginalMember(owner = "client!bt", name = "Af", descriptor = "Lclient!vs;")
	public Class57_Sub2 aClass57_Sub2_4;

	@OriginalMember(owner = "client!bt", name = "Cf", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!bt", name = "Df", descriptor = "F")
	private float aFloat13;

	@OriginalMember(owner = "client!bt", name = "Hf", descriptor = "Lclient!us;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!bt", name = "Jf", descriptor = "F")
	private float aFloat15;

	@OriginalMember(owner = "client!bt", name = "Kf", descriptor = "Z")
	private boolean aBoolean47;

	@OriginalMember(owner = "client!bt", name = "Lf", descriptor = "Z")
	private boolean aBoolean48;

	@OriginalMember(owner = "client!bt", name = "Nf", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!bt", name = "Of", descriptor = "Lclient!vs;")
	public Class57_Sub2 aClass57_Sub2_5;

	@OriginalMember(owner = "client!bt", name = "Pf", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!bt", name = "Qf", descriptor = "I")
	public int anInt860;

	@OriginalMember(owner = "client!bt", name = "Rf", descriptor = "Z")
	private boolean aBoolean49;

	@OriginalMember(owner = "client!bt", name = "Sf", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!bt", name = "Tf", descriptor = "Lclient!jd;")
	public Class118 aClass118_2;

	@OriginalMember(owner = "client!bt", name = "Uf", descriptor = "I")
	public int anInt861;

	@OriginalMember(owner = "client!bt", name = "Vf", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!bt", name = "Xf", descriptor = "I")
	public int anInt863;

	@OriginalMember(owner = "client!bt", name = "Yf", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!bt", name = "cg", descriptor = "Z")
	public boolean aBoolean50;

	@OriginalMember(owner = "client!bt", name = "dg", descriptor = "Z")
	public boolean aBoolean51;

	@OriginalMember(owner = "client!bt", name = "fg", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!bt", name = "kg", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!bt", name = "lg", descriptor = "Z")
	public boolean aBoolean53;

	@OriginalMember(owner = "client!bt", name = "mg", descriptor = "Z")
	private boolean aBoolean54;

	@OriginalMember(owner = "client!bt", name = "og", descriptor = "Z")
	private boolean aBoolean55;

	@OriginalMember(owner = "client!bt", name = "pg", descriptor = "Lclient!vs;")
	public Class57_Sub2 aClass57_Sub2_6;

	@OriginalMember(owner = "client!bt", name = "qg", descriptor = "Z")
	private boolean aBoolean56;

	@OriginalMember(owner = "client!bt", name = "sg", descriptor = "Z")
	public boolean aBoolean57;

	@OriginalMember(owner = "client!bt", name = "tg", descriptor = "[Lclient!ei;")
	private Class62[] aClass62Array1;

	@OriginalMember(owner = "client!bt", name = "ug", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!bt", name = "vg", descriptor = "Lclient!co;")
	private Class41_Sub1 aClass41_Sub1_1;

	@OriginalMember(owner = "client!bt", name = "wg", descriptor = "Lclient!vs;")
	public Class57_Sub2 aClass57_Sub2_7;

	@OriginalMember(owner = "client!bt", name = "yg", descriptor = "Lclient!us;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!bt", name = "zg", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!bt", name = "Ag", descriptor = "Lclient!fl;")
	public Class72_Sub2 aClass72_Sub2_4;

	@OriginalMember(owner = "client!bt", name = "Dg", descriptor = "Lclient!vs;")
	public Class57_Sub2 aClass57_Sub2_8;

	@OriginalMember(owner = "client!bt", name = "Hg", descriptor = "Lclient!vn;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!bt", name = "Jg", descriptor = "Z")
	private boolean aBoolean58;

	@OriginalMember(owner = "client!bt", name = "Lg", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!bt", name = "Ng", descriptor = "Lclient!vs;")
	public Class57_Sub2 aClass57_Sub2_9;

	@OriginalMember(owner = "client!bt", name = "Og", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!bt", name = "Qg", descriptor = "I")
	public int anInt879;

	@OriginalMember(owner = "client!bt", name = "Sg", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!bt", name = "Ug", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!bt", name = "Yg", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!bt", name = "ah", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!bt", name = "fh", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!bt", name = "mb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!bt", name = "ae", descriptor = "I")
	public int anInt834 = 128;

	@OriginalMember(owner = "client!bt", name = "ge", descriptor = "Lclient!ld;")
	private final Class142 aClass142_1 = new Class142();

	@OriginalMember(owner = "client!bt", name = "ke", descriptor = "Lclient!fl;")
	private final Class72_Sub2 aClass72_Sub2_1 = new Class72_Sub2();

	@OriginalMember(owner = "client!bt", name = "le", descriptor = "Lclient!fl;")
	public final Class72_Sub2 aClass72_Sub2_2 = new Class72_Sub2();

	@OriginalMember(owner = "client!bt", name = "ne", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!bt", name = "pe", descriptor = "I")
	public int anInt839 = 3;

	@OriginalMember(owner = "client!bt", name = "re", descriptor = "I")
	public int anInt840 = 8;

	@OriginalMember(owner = "client!bt", name = "oe", descriptor = "Lclient!gw;")
	private final Class91 aClass91_2 = new Class91();

	@OriginalMember(owner = "client!bt", name = "ve", descriptor = "I")
	private int anInt843 = -1;

	@OriginalMember(owner = "client!bt", name = "xe", descriptor = "I")
	private int anInt844 = -1;

	@OriginalMember(owner = "client!bt", name = "te", descriptor = "I")
	private int anInt842 = -1;

	@OriginalMember(owner = "client!bt", name = "ze", descriptor = "[Lclient!wr;")
	private final Interface13[] anInterface13Array2 = new Interface13[4];

	@OriginalMember(owner = "client!bt", name = "ye", descriptor = "[Lclient!wr;")
	private final Interface13[] anInterface13Array1 = new Interface13[4];

	@OriginalMember(owner = "client!bt", name = "Ae", descriptor = "[Lclient!wr;")
	private final Interface13[] anInterface13Array3 = new Interface13[4];

	@OriginalMember(owner = "client!bt", name = "Ce", descriptor = "Lclient!gw;")
	private final Class91 aClass91_3;

	@OriginalMember(owner = "client!bt", name = "Fe", descriptor = "Lclient!gw;")
	private final Class91 aClass91_4;

	@OriginalMember(owner = "client!bt", name = "Ge", descriptor = "Lclient!gw;")
	private final Class91 aClass91_5;

	@OriginalMember(owner = "client!bt", name = "He", descriptor = "Lclient!gw;")
	private final Class91 aClass91_6;

	@OriginalMember(owner = "client!bt", name = "Ie", descriptor = "Lclient!gw;")
	private final Class91 aClass91_7;

	@OriginalMember(owner = "client!bt", name = "Je", descriptor = "Lclient!gw;")
	private final Class91 aClass91_8;

	@OriginalMember(owner = "client!bt", name = "Ke", descriptor = "Lclient!gw;")
	private final Class91 aClass91_9;

	@OriginalMember(owner = "client!bt", name = "Me", descriptor = "F")
	private float aFloat5;

	@OriginalMember(owner = "client!bt", name = "kf", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!bt", name = "af", descriptor = "F")
	private float aFloat7;

	@OriginalMember(owner = "client!bt", name = "cf", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!bt", name = "Ne", descriptor = "F")
	public float aFloat6;

	@OriginalMember(owner = "client!bt", name = "Gf", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!bt", name = "rf", descriptor = "[F")
	public final float[] aFloatArray1;

	@OriginalMember(owner = "client!bt", name = "Ff", descriptor = "[F")
	private final float[] aFloatArray2;

	@OriginalMember(owner = "client!bt", name = "nf", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!bt", name = "bg", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!bt", name = "hg", descriptor = "[F")
	private final float[] aFloatArray3;

	@OriginalMember(owner = "client!bt", name = "Se", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!bt", name = "Ef", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!bt", name = "vf", descriptor = "I")
	public int anInt856;

	@OriginalMember(owner = "client!bt", name = "ng", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!bt", name = "pf", descriptor = "I")
	public int anInt854;

	@OriginalMember(owner = "client!bt", name = "Eg", descriptor = "[F")
	private final float[] aFloatArray4;

	@OriginalMember(owner = "client!bt", name = "Wf", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!bt", name = "xg", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!bt", name = "Mg", descriptor = "I")
	public int anInt877;

	@OriginalMember(owner = "client!bt", name = "zf", descriptor = "I")
	public int anInt857;

	@OriginalMember(owner = "client!bt", name = "rg", descriptor = "I")
	public int anInt870;

	@OriginalMember(owner = "client!bt", name = "Kg", descriptor = "[Lclient!ni;")
	private final Class4_Sub17[] aClass4_Sub17Array1;

	@OriginalMember(owner = "client!bt", name = "Fg", descriptor = "I")
	public int anInt873;

	@OriginalMember(owner = "client!bt", name = "ag", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!bt", name = "Cg", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!bt", name = "hf", descriptor = "I")
	public int anInt852;

	@OriginalMember(owner = "client!bt", name = "We", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!bt", name = "eg", descriptor = "I")
	public int anInt866;

	@OriginalMember(owner = "client!bt", name = "Mf", descriptor = "F")
	private float aFloat16;

	@OriginalMember(owner = "client!bt", name = "Ig", descriptor = "I")
	public int anInt875;

	@OriginalMember(owner = "client!bt", name = "Xg", descriptor = "I")
	public int anInt883;

	@OriginalMember(owner = "client!bt", name = "Gg", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!bt", name = "Pg", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!bt", name = "Bg", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!bt", name = "Rg", descriptor = "[F")
	private final float[] aFloatArray5;

	@OriginalMember(owner = "client!bt", name = "ig", descriptor = "I")
	public int anInt868;

	@OriginalMember(owner = "client!bt", name = "Tg", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!bt", name = "Zg", descriptor = "Z")
	private boolean aBoolean61;

	@OriginalMember(owner = "client!bt", name = "jg", descriptor = "Lclient!ow;")
	public Class4_Sub20_Sub2 aClass4_Sub20_Sub2_1;

	@OriginalMember(owner = "client!bt", name = "bh", descriptor = "[B")
	public final byte[] aByteArray3;

	@OriginalMember(owner = "client!bt", name = "ch", descriptor = "[I")
	public int[] anIntArray46;

	@OriginalMember(owner = "client!bt", name = "dh", descriptor = "[I")
	public int[] anIntArray47;

	@OriginalMember(owner = "client!bt", name = "eh", descriptor = "[I")
	public int[] anIntArray48;

	@OriginalMember(owner = "client!bt", name = "nb", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas1;

	@OriginalMember(owner = "client!bt", name = "Ab", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!bt", name = "Zd", descriptor = "I")
	public final int anInt833;

	@OriginalMember(owner = "client!bt", name = "hb", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!bt", name = "Td", descriptor = "J")
	private final long aLong25;

	@OriginalMember(owner = "client!bt", name = "oc", descriptor = "J")
	private long aLong24;

	@OriginalMember(owner = "client!bt", name = "Zf", descriptor = "I")
	public final int anInt864;

	@OriginalMember(owner = "client!bt", name = "Vg", descriptor = "Z")
	public boolean aBoolean59;

	@OriginalMember(owner = "client!bt", name = "of", descriptor = "Z")
	private boolean aBoolean43;

	@OriginalMember(owner = "client!bt", name = "If", descriptor = "Z")
	public boolean aBoolean46;

	@OriginalMember(owner = "client!bt", name = "gf", descriptor = "Z")
	public boolean aBoolean39;

	@OriginalMember(owner = "client!bt", name = "Xe", descriptor = "Z")
	public boolean aBoolean38;

	@OriginalMember(owner = "client!bt", name = "gg", descriptor = "Z")
	private boolean aBoolean52;

	@OriginalMember(owner = "client!bt", name = "Wg", descriptor = "Z")
	public boolean aBoolean60;

	@OriginalMember(owner = "client!bt", name = "Bf", descriptor = "Z")
	private final boolean aBoolean45;

	@OriginalMember(owner = "client!bt", name = "ce", descriptor = "Lclient!lg;")
	public final Class144 aClass144_1;

	@OriginalMember(owner = "client!bt", name = "me", descriptor = "Lclient!li;")
	public final Class146 aClass146_1;

	@OriginalMember(owner = "client!bt", name = "be", descriptor = "Lclient!ih;")
	private final Class106 aClass106_1;

	@OriginalMember(owner = "client!bt", name = "he", descriptor = "Lclient!rf;")
	private Class4_Sub13_Sub1 aClass4_Sub13_Sub1_1;

	@OriginalMember(owner = "client!bt", name = "ie", descriptor = "Lclient!sb;")
	private final Class230 aClass230_1;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;ILclient!ul;)V")
	public Class30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class255 arg4) {
		super(arg0, arg2);
		new Class252();
		new Class96(16);
		this.aClass91_3 = new Class91();
		this.aClass91_4 = new Class91();
		this.aClass91_5 = new Class91();
		this.aClass91_6 = new Class91();
		this.aClass91_7 = new Class91();
		this.aClass91_8 = new Class91();
		this.aClass91_9 = new Class91();
		this.aFloat5 = 1.0F;
		this.aFloat9 = 1.0F;
		this.aFloat7 = 1.0F;
		this.aFloat8 = -1.0F;
		this.aFloat6 = 1.0F;
		this.aFloat14 = 1.0F;
		this.aFloatArray1 = new float[4];
		this.aFloatArray2 = new float[4];
		this.anInt853 = 0;
		this.aFloat21 = 3584.0F;
		this.aFloatArray3 = new float[4];
		this.anInt849 = 0;
		this.anInt859 = 0;
		this.anInt856 = 0;
		this.anInt869 = 8448;
		this.anInt854 = -1;
		this.aFloatArray4 = new float[16];
		this.anInt862 = 8448;
		this.anInt872 = -1;
		this.anInt877 = 50;
		this.anInt857 = 3584;
		this.anInt870 = 512;
		this.aClass4_Sub17Array1 = new Class4_Sub17[Static461.anInt5547];
		this.anInt873 = 512;
		this.anInt865 = 0;
		this.aFloat24 = 3584.0F;
		this.anInt852 = 0;
		this.anInt850 = 0;
		this.anInt866 = 0;
		this.aFloat16 = 0.0F;
		this.anInt875 = -1;
		this.anInt883 = 0;
		this.anInt874 = 0;
		this.aFloat25 = 3000.0F;
		this.aFloat23 = -1.0F;
		this.aFloatArray5 = new float[4];
		this.anInt868 = -1;
		this.anInt881 = -1;
		this.aBoolean61 = true;
		this.aClass4_Sub20_Sub2_1 = new Class4_Sub20_Sub2(8192);
		this.aByteArray3 = new byte[16384];
		this.anIntArray46 = new int[1];
		this.anIntArray47 = new int[1];
		this.anIntArray48 = new int[1];
		this.aCanvas2 = this.aCanvas1 = arg1;
		this.anInt833 = arg3;
		try {
			if (Static264.aBoolean565 == null || !Static264.aBoolean565) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static264.aBoolean565 = Boolean.TRUE;
				} else {
					@Pc(276) String local276 = System.getProperty("os.name").toLowerCase();
					if (!local276.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local276.startsWith("linux") || local276.startsWith("sunos")) {
						System.load(arg4.method5830("libjaggl.so").toString());
					} else if (local276.startsWith("mac")) {
						System.load(arg4.method5830("libjaggl.jnilib").toString());
					} else if (local276.startsWith("win")) {
						System.load(arg4.method5830("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static264.aBoolean565 = Boolean.TRUE;
				}
			}
			if (Static264.aBoolean565 == null || !Static264.aBoolean565) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong24 = this.aLong25 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt833);
			if (this.aLong25 == 0L) {
				throw new RuntimeException("");
			}
			this.method753();
			@Pc(377) int local377 = this.method688();
			if (local377 != 0) {
				throw new RuntimeException("");
			}
			this.anInt864 = this.aBoolean51 ? 33639 : 5121;
			@Pc(404) int local404;
			if (this.aString3.indexOf("radeon") != -1) {
				local404 = 0;
				@Pc(406) boolean local406 = false;
				@Pc(408) boolean local408 = false;
				@Pc(417) String[] local417 = Static399.method5642(this.aString3.replace('/', ' '), ' ');
				for (@Pc(419) int local419 = 0; local419 < local417.length; local419++) {
					@Pc(425) String local425 = local417[local419];
					try {
						if (local425.length() > 0) {
							if (local425.charAt(0) == 'x' && local425.length() >= 3 && Static9.method159(local425.substring(1, 3))) {
								local408 = true;
								local425 = local425.substring(1);
							}
							if (local425.equals("hd")) {
								local406 = true;
							} else {
								if (local425.startsWith("hd")) {
									local425 = local425.substring(2);
									local406 = true;
								}
								if (local425.length() >= 4 && Static9.method159(local425.substring(0, 4))) {
									local404 = Static269.method4335(local425.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(491) Exception local491) {
					}
				}
				if (!local406 || local404 < 4000) {
					this.aBoolean59 = false;
				}
				if (!local408 && !local406) {
					if (local404 >= 7000 && local404 <= 7999) {
						this.aBoolean43 = false;
					}
					if (local404 >= 7000 && local404 <= 9250) {
						this.aBoolean46 = false;
					}
				}
				this.aBoolean39 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean38 = true;
				this.aBoolean52 = this.aBoolean43;
			}
			if (this.aString4.indexOf("intel") != -1) {
				this.aBoolean60 = false;
			}
			this.aBoolean45 = !this.aString4.equals("s3 graphics");
			if (this.aBoolean43) {
				try {
					@Pc(574) int[] local574 = new int[1];
					OpenGL.glGenBuffersARB(1, local574, 0);
				} catch (@Pc(580) Throwable local580) {
					throw new RuntimeException("");
				}
			}
			Static198.method3514(false, true);
			this.aBoolean33 = true;
			this.aClass144_1 = new Class144(this, super.anInterface4_5);
			this.method709();
			this.aClass146_1 = new Class146(this);
			this.aClass106_1 = new Class106(this);
			if (this.aClass106_1.method2935()) {
				this.aClass4_Sub13_Sub1_1 = new Class4_Sub13_Sub1(this);
				if (!this.aClass4_Sub13_Sub1_1.method5082()) {
					this.aClass4_Sub13_Sub1_1.method5078();
					this.aClass4_Sub13_Sub1_1 = null;
				}
			}
			this.aClass230_1 = new Class230(this);
			this.method699();
			this.method739();
			OpenGL.glClear(16640);
			local404 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(659) Exception local659) {
					if (local404++ > 5) {
						throw new RuntimeException("");
					}
					Static77.method1653(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(677) Throwable local677) {
			local677.printStackTrace();
			this.method2053();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bt", name = "H", descriptor = "()V")
	@Override
	public void H() {
		this.anInt874 = 0;
		this.anInt853 = 0;
		this.anInt865 = this.anInt758;
		this.anInt859 = this.anInt801;
		OpenGL.glDisable(3089);
		this.method744();
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)V")
	public void method680() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(I)V")
	private void method681() {
		@Pc(19) float local19 = this.aFloat5 * (float) -this.anInt852 / (float) this.anInt870;
		@Pc(31) float local31 = (float) -this.anInt866 * this.aFloat5 / (float) this.anInt873;
		@Pc(46) float local46 = this.aFloat5 * (float) (this.anInt758 - this.anInt852) / (float) this.anInt870;
		@Pc(60) float local60 = this.aFloat5 * (float) (this.anInt801 - this.anInt866) / (float) this.anInt873;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local19 != local46 && local31 != local60) {
			OpenGL.glOrtho((double) local19, (double) local46, (double) -local60, (double) -local31, (double) ((float) this.anInt877 - this.aFloat17), (double) ((float) this.anInt857 - this.aFloat17));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bt", name = "z", descriptor = "()Z")
	@Override
	public boolean method2101() {
		return this.aClass230_1.method5232();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BZ)V")
	public void method682(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean48 != arg0) {
			this.aBoolean48 = arg0;
			this.method762();
		}
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "()Z")
	@Override
	public boolean method2048() {
		return false;
	}

	@OriginalMember(owner = "client!bt", name = "IA", descriptor = "(IIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt859 > arg3) {
			this.anInt859 = arg3;
		}
		if (this.anInt874 < arg0) {
			this.anInt874 = arg0;
		}
		if (this.anInt865 > arg2) {
			this.anInt865 = arg2;
		}
		if (this.anInt853 < arg1) {
			this.anInt853 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method744();
		this.method716();
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)V")
	private void method683() {
		if (this.anInt871 != 3) {
			this.anInt871 = 3;
			this.method681();
			this.method755();
			this.anInt884 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "()Z")
	@Override
	public boolean method2070() {
		return false;
	}

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "()Z")
	@Override
	public boolean method2052() {
		return true;
	}

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "(IIII)V")
	@Override
	public void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean53 = true;
		this.anInt860 = arg0;
		this.anInt881 = arg1;
		this.anInt883 = arg3;
		this.anInt868 = arg2;
		this.aClass230_1.method5231(0, 3, 0, false, false);
		this.aClass230_1.aClass39_Sub5_1.method4005();
		this.method694();
		this.method717();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLclient!wr;)V")
	public void method685(@OriginalArg(1) Interface13 arg0) {
		if (this.anInt844 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt844 >= 0) {
			this.anInterface13Array3[this.anInt844].method4321();
		}
		this.anInterface13_2 = this.anInterface13Array3[++this.anInt844] = arg0;
		this.anInterface13_2.method4320();
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)V")
	@Override
	public void method2049(@OriginalArg(0) int arg0) {
		this.method753();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZII[B)Lclient!us;")
	public Interface9 method686(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface9) (this.aBoolean43 && (!arg0 || this.aBoolean52) ? new Class138_Sub2(this, arg1, arg3, arg2, arg0) : new Class129_Sub1(this, arg1, arg3, arg2));
	}

	@OriginalMember(owner = "client!bt", name = "la", descriptor = "(IFFFFF)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt872;
		if (local15 || arg1 != this.aFloat8 || arg2 != this.aFloat23) {
			this.aFloat23 = arg2;
			this.anInt872 = arg0;
			this.aFloat8 = arg1;
			if (local15) {
				this.aFloat6 = (float) (this.anInt872 & 0xFF0000) / 1.671168E7F;
				this.aFloat14 = (float) (this.anInt872 & 0xFF) / 255.0F;
				this.aFloat9 = (float) (this.anInt872 & 0xFF00) / 65280.0F;
				this.method691();
			}
			this.method711();
		}
		if (arg3 == this.aFloatArray3[0] && arg4 == this.aFloatArray3[1] && this.aFloatArray3[2] == arg5) {
			return;
		}
		this.aFloatArray3[2] = arg5;
		this.aFloatArray3[0] = arg3;
		this.aFloatArray3[1] = arg4;
		this.aFloatArray5[1] = -arg4;
		this.aFloatArray5[0] = -arg3;
		this.aFloatArray5[2] = -arg5;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray1[1] = local142 * arg4;
		this.aFloatArray1[0] = local142 * arg3;
		this.aFloatArray1[2] = local142 * arg5;
		this.aFloatArray2[1] = -this.aFloatArray1[1];
		this.aFloatArray2[2] = -this.aFloatArray1[2];
		this.aFloatArray2[0] = -this.aFloatArray1[0];
		this.method718();
		this.anInt861 = (int) (arg3 * 256.0F / arg4);
		this.anInt879 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)V")
	public void method687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt849 = arg1;
		this.anInt850 = arg0;
		this.method732();
		this.method716();
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(I)I")
	private int method688() {
		@Pc(5) int local5 = 0;
		this.aString4 = OpenGL.glGetString(7936).toLowerCase();
		this.aString3 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString4.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString4.indexOf("brian paul") != -1 || this.aString4.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(47) String local47 = OpenGL.glGetString(7938);
		@Pc(55) String[] local55 = Static399.method5642(local47.replace('.', ' '), ' ');
		if (local55.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(71) int local71 = Static269.method4335(local55[0]);
				@Pc(77) int local77 = Static269.method4335(local55[1]);
				this.anInt848 = local71 * 10 + local77;
			} catch (@Pc(86) NumberFormatException local86) {
				local5 |= 0x4;
			}
		}
		if (this.anInt848 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(122) int[] local122 = new int[1];
		OpenGL.glGetIntegerv(34018, local122, 0);
		this.anInt863 = local122[0];
		OpenGL.glGetIntegerv(34929, local122, 0);
		this.anInt878 = local122[0];
		OpenGL.glGetIntegerv(34930, local122, 0);
		this.anInt855 = local122[0];
		if (this.anInt863 < 2 || this.anInt878 < 2 || this.anInt855 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean51 = NativeStream.a();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean43 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean54 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean35 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean36 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean37 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean46 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean39 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean34 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean59 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean50 = false;
		this.aBoolean60 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean57 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean44 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean47 = this.aBoolean44 & this.aBoolean57;
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!bt", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.anInt877;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	@Override
	public void method2030(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt834 = arg0;
		this.aClass144_1.method3824();
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(B)V")
	private void method689() {
		if (this.anInt871 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt758 > 0 && this.anInt801 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt758, (double) this.anInt801, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt884 &= 0xFFFFFFE7;
		this.anInt871 = 1;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIB)V")
	public void method690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "(I)V")
	private void method691() {
		Static295.aFloatArray24[0] = this.aFloat6 * this.aFloat22;
		Static295.aFloatArray24[3] = 1.0F;
		Static295.aFloatArray24[1] = this.aFloat9 * this.aFloat22;
		Static295.aFloatArray24[2] = this.aFloat14 * this.aFloat22;
		OpenGL.glLightModelfv(2899, Static295.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(FB)V")
	public void method692(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat5) {
			this.aFloat5 = arg0;
			if (this.anInt871 == 3) {
				this.method681();
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean53) {
			throw new RuntimeException("");
		}
		this.anInt881 = arg1;
		this.anInt883 = arg3;
		this.anInt860 = arg0;
		this.anInt868 = arg2;
		this.aClass230_1.aClass39_Sub5_1.method4005();
		this.method694();
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)V")
	public void method693(@OriginalArg(0) int arg0) {
		this.method740(arg0, true);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(Z)V")
	private void method694() {
		@Pc(23) int local23;
		if (this.aBoolean53) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local23 = this.anInt881;
		} else {
			this.aFloat13 = (float) (this.anInt857 - this.anInt856) - this.aFloat16;
			this.aFloat20 = this.aFloat13 - this.aFloat7 * (float) this.anInt854;
			if (this.aFloat20 < (float) this.anInt877) {
				this.aFloat20 = this.anInt877;
			}
			OpenGL.glFogf(2915, this.aFloat20);
			OpenGL.glFogf(2916, this.aFloat13);
			local23 = this.anInt875;
		}
		Static295.aFloatArray24[2] = (float) (local23 & 0xFF) / 255.0F;
		Static295.aFloatArray24[1] = (float) (local23 & 0xFF00) / 65280.0F;
		Static295.aFloatArray24[0] = (float) (local23 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static295.aFloatArray24, 0);
		if (this.aBoolean53) {
			this.aClass230_1.aClass39_Sub5_1.method4008();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2075(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method2042();
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(B)V")
	private void method695() {
		@Pc(6) float[] local6 = this.aFloatArray4;
		@Pc(18) float local18 = (float) (-this.anInt852 * this.anInt877) / (float) this.anInt870;
		@Pc(33) float local33 = (float) (this.anInt877 * (this.anInt758 - this.anInt852)) / (float) this.anInt870;
		@Pc(44) float local44 = (float) (this.anInt877 * this.anInt866) / (float) this.anInt873;
		@Pc(59) float local59 = (float) (this.anInt877 * (this.anInt866 - this.anInt801)) / (float) this.anInt873;
		if (local33 == local18 || local59 == local44) {
			local6[5] = 1.0F;
			local6[11] = 0.0F;
			local6[12] = 0.0F;
			local6[13] = 0.0F;
			local6[9] = 0.0F;
			local6[2] = 0.0F;
			local6[7] = 0.0F;
			local6[10] = 1.0F;
			local6[4] = 0.0F;
			local6[15] = 1.0F;
			local6[8] = 0.0F;
			local6[1] = 0.0F;
			local6[14] = 0.0F;
			local6[0] = 1.0F;
			local6[3] = 0.0F;
			local6[6] = 0.0F;
		} else {
			@Pc(143) float local143 = (float) this.anInt877 * 2.0F;
			local6[1] = 0.0F;
			local6[10] = this.aFloat12 = (float) -(this.anInt857 + this.anInt877) / (float) (this.anInt857 - this.anInt877);
			local6[13] = 0.0F;
			local6[8] = (local18 + local33) / (-local18 + local33);
			local6[12] = 0.0F;
			local6[4] = 0.0F;
			local6[3] = 0.0F;
			local6[6] = 0.0F;
			local6[14] = this.aFloat15 = -((float) this.anInt857 * local143) / (float) (this.anInt857 - this.anInt877);
			local6[0] = local143 / (local33 - local18);
			local6[7] = 0.0F;
			local6[15] = 0.0F;
			local6[11] = -1.0F;
			local6[2] = 0.0F;
			local6[5] = local143 / (local44 - local59);
			local6[9] = (local44 + local59) / (-local59 + local44);
		}
		this.method706();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZI)V")
	public synchronized void method696(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub16 local16 = new Class4_Sub16(arg0);
		this.aClass91_6.method2587(local16);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method2064(@OriginalArg(0) Class72 arg0) {
		this.aClass72_Sub2_3 = (Class72_Sub2) arg0;
		this.aClass72_Sub2_4.method2195(this.aClass72_Sub2_3);
		if (this.anInt871 != 1) {
			this.method755();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!wr;)V")
	public void method697(@OriginalArg(1) Interface13 arg0) {
		if (this.anInt843 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt843 >= 0) {
			this.anInterface13Array2[this.anInt843].method4322();
		}
		this.anInterface13_1 = this.anInterface13Array2[++this.anInt843] = arg0;
		this.anInterface13_1.method4323();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method2097(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "()F")
	@Override
	public float s() {
		return this.aFloat17;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	@Override
	public void method2044(@OriginalArg(0) int arg0) {
		this.method733();
	}

	@OriginalMember(owner = "client!bt", name = "M", descriptor = "(IIIIII)V")
	@Override
	public void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method707();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method703(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean54) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean54) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(I)V")
	private void method699() {
		this.method693(-2);
		for (@Pc(14) int local14 = this.anInt863 - 1; local14 >= 0; local14--) {
			this.method726(local14);
			this.method730(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method724(8448, 8448);
		this.method752(34168, 770, 2);
		this.method705();
		this.anInt867 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt851 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean42 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean49 = true;
		this.method760(true);
		this.method704(true);
		this.method738(true);
		this.method731(true);
		this.method761();
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
		@Pc(125) float[] local125 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(127) int local127 = 0; local127 < 8; local127++) {
			@Pc(133) int local133 = local127 + 16384;
			OpenGL.glLightfv(local133, 4608, local125, 0);
			OpenGL.glLightf(local133, 4615, 0.0F);
			OpenGL.glLightf(local133, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt872 = this.anInt875 = -1;
		this.H();
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)I")
	@Override
	public int method2102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIII)Lclient!kv;")
	@Override
	public Class41 method2057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean34 ? new Class41_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(II)I")
	public int method700(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "()Z")
	@Override
	public boolean method2071() {
		return true;
	}

	@OriginalMember(owner = "client!bt", name = "PA", descriptor = "(FF)V")
	@Override
	public void PA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat25 == arg0 && this.aFloat17 == arg1) {
			return;
		}
		this.aFloat17 = arg1;
		this.aFloat25 = arg0;
		this.method706();
		if (this.anInt871 == 3) {
			this.method681();
		} else if (this.anInt871 == 2) {
			this.method741();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[[I[[IIII)Lclient!o;")
	@Override
	public Class14 method2089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class14_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[I[I)Lclient!i;")
	@Override
	public Class74 method2079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static274.method4384(arg2, arg1, this, arg0, arg3);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!ch;IIII)Lclient!ka;")
	@Override
	public Class57 method2036(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class57_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I[Lclient!ni;)V")
	@Override
	public void method2081(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub17[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass4_Sub17Array1[local3] = arg1[local3];
		}
		this.anInt858 = arg0;
		if (this.anInt871 != 1) {
			this.method750();
		}
	}

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "(I)V")
	public void method702() {
		if (this.anInt884 == 8) {
			return;
		}
		this.method735();
		this.method760(true);
		this.method738(true);
		this.method731(true);
		this.method703(1);
		this.method713(0);
		this.anInt884 = 8;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIILclient!i;II)V")
	@Override
	public void method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class74 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class74_Sub2 local6 = (Class74_Sub2) arg5;
		@Pc(9) Class62_Sub2_Sub1 local9 = local6.aClass62_Sub2_Sub1_5;
		this.method727();
		this.method730(local6.aClass62_Sub2_Sub1_5);
		this.method703(1);
		this.method724(7681, 8448);
		this.method752(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat61 / (float) local9.anInt3025;
		@Pc(46) float local46 = local9.aFloat60 / (float) local9.anInt3028;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method752(5890, 768, 0);
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(II)V")
	public void method703(@OriginalArg(0) int arg0) {
		if (this.anInt867 == arg0) {
			return;
		}
		@Pc(14) boolean local14;
		@Pc(18) byte local18;
		if (arg0 == 1) {
			local14 = true;
			local18 = 1;
		} else if (arg0 == 2) {
			local14 = false;
			local18 = 2;
		} else if (arg0 == 128) {
			local14 = true;
			local18 = 3;
		} else {
			local18 = 0;
			local14 = false;
		}
		if (!this.aBoolean49) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean49 = true;
		}
		if (local14 != this.aBoolean42) {
			if (local14) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean42 = local14;
		}
		if (this.anInt851 != local18) {
			if (local18 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local18 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local18 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt851 = local18;
		}
		this.anInt867 = arg0;
		this.anInt884 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(BZ)V")
	public void method704(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean58 != arg0) {
			this.aBoolean58 = arg0;
			this.method762();
			this.anInt884 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method2062(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class4_Sub16 local19;
		while (!this.aClass91_4.method2575()) {
			local19 = (Class4_Sub16) this.aClass91_4.method2583();
			Static25.anIntArray30[local7++] = (int) local19.aLong228;
			this.anInt846 -= local19.anInt2197;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static25.anIntArray30, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static25.anIntArray30, 0);
			local7 = 0;
		}
		while (!this.aClass91_5.method2575()) {
			local19 = (Class4_Sub16) this.aClass91_5.method2583();
			Static25.anIntArray30[local7++] = (int) local19.aLong228;
			this.anInt847 -= local19.anInt2197;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static25.anIntArray30, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static25.anIntArray30, 0);
			local7 = 0;
		}
		while (!this.aClass91_6.method2575()) {
			local19 = (Class4_Sub16) this.aClass91_6.method2583();
			Static25.anIntArray30[local7++] = local19.anInt2197;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static25.anIntArray30, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static25.anIntArray30, 0);
			local7 = 0;
		}
		while (!this.aClass91_7.method2575()) {
			local19 = (Class4_Sub16) this.aClass91_7.method2583();
			Static25.anIntArray30[local7++] = (int) local19.aLong228;
			this.anInt845 -= local19.anInt2197;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static25.anIntArray30, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static25.anIntArray30, 0);
		}
		while (!this.aClass91_3.method2575()) {
			local19 = (Class4_Sub16) this.aClass91_3.method2583();
			OpenGL.glDeleteLists((int) local19.aLong228, local19.anInt2197);
		}
		@Pc(213) Class4 local213;
		while (!this.aClass91_8.method2575()) {
			local213 = this.aClass91_8.method2583();
			OpenGL.glDeleteProgramARB((int) local213.aLong228);
		}
		while (!this.aClass91_9.method2575()) {
			local213 = this.aClass91_9.method2583();
			OpenGL.glDeleteObjectARB(local213.aLong228);
		}
		while (!this.aClass91_3.method2575()) {
			local19 = (Class4_Sub16) this.aClass91_3.method2583();
			OpenGL.glDeleteLists((int) local19.aLong228, local19.anInt2197);
		}
		this.aClass144_1.method3823();
		if (this.xa() > 100663296 && Static167.method2929() > this.aLong26 + 60000L) {
			System.gc();
			this.aLong26 = Static167.method2929();
		}
		this.anInt841 = local11;
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(B)V")
	private void method705() {
		if (this.aBoolean41) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean41 = false;
		}
	}

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(I)V")
	@Override
	public void l(@OriginalArg(0) int arg0) {
		this.method703(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "(I)V")
	private void method706() {
		if (this.aFloat17 == 0.0F) {
			this.aFloatArray4[14] = this.aFloat15;
			this.aFloatArray4[10] = this.aFloat12;
		} else {
			@Pc(31) float local31 = this.aFloat25 / (this.aFloat25 + this.aFloat17);
			@Pc(35) float local35 = local31 * local31;
			@Pc(50) float local50 = -this.aFloat15 * (1.0F - local31) * (1.0F - local31) / this.aFloat17;
			this.aFloatArray4[14] = local35 * this.aFloat15;
			this.aFloatArray4[10] = local50 + this.aFloat12;
		}
		this.aFloat21 = (float) this.anInt857 - this.aFloat17;
		this.aFloat24 = (this.aFloatArray4[14] - (float) this.anInt857) / this.aFloatArray4[10];
	}

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "(I)V")
	private void method707() {
		if (this.anInt884 == 1) {
			return;
		}
		this.method689();
		this.method760(false);
		this.method704(false);
		this.method738(false);
		this.method731(false);
		this.method730(null);
		this.method693(-2);
		this.method713(1);
		this.anInt884 = 1;
	}

	@OriginalMember(owner = "client!bt", name = "v", descriptor = "()Z")
	@Override
	public boolean method2094() {
		if (this.aClass4_Sub13_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass4_Sub13_Sub1_1.method5079()) {
			if (!this.aClass106_1.method2933(this.aClass4_Sub13_Sub1_1)) {
				return false;
			}
			this.aClass144_1.method3824();
		}
		return true;
	}

	@OriginalMember(owner = "client!bt", name = "sa", descriptor = "()I")
	@Override
	public int sa() {
		return this.anInt857;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!kv;Lclient!kv;FLclient!kv;)Lclient!kv;")
	@Override
	public Class41 method2035(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class41 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean34 && this.aBoolean60) {
			@Pc(15) Class41_Sub1_Sub1 local15 = null;
			@Pc(18) Class41_Sub1 local18 = (Class41_Sub1) arg0;
			@Pc(21) Class41_Sub1 local21 = (Class41_Sub1) arg1;
			@Pc(25) Class62_Sub3 local25 = local18.method3949();
			@Pc(29) Class62_Sub3 local29 = local21.method3949();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local29.anInt3200 < local25.anInt3200 ? local25.anInt3200 : local29.anInt3200;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class41_Sub1_Sub1) {
					@Pc(60) Class41_Sub1_Sub1 local60 = (Class41_Sub1_Sub1) arg3;
					if (local48 == local60.method1249()) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class41_Sub1_Sub1(this, local48);
				}
				if (local15.method1246(arg2, local25, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIZZ)V")
	public void method708(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt882) {
			if (arg0 < 0) {
				this.method705();
				this.method730(null);
				this.method713(0);
				if (!this.aBoolean53) {
					this.aClass230_1.method5231(0, 0, 0, arg2, arg1);
				}
			} else {
				@Pc(43) Class62_Sub2 local43 = this.aClass144_1.method3825(arg0);
				@Pc(49) Class160 local49 = super.anInterface4_5.method5685(arg0);
				if (local49.aByte55 == 0 && local49.aByte50 == 0) {
					this.method705();
				} else {
					@Pc(70) int local70 = local49.aBoolean322 ? 64 : 128;
					@Pc(74) int local74 = local70 * 50;
					this.method764(0.0F, (float) (local49.aByte50 * (this.anInt841 % local74)) / (float) local74, (float) (this.anInt841 % local74 * local49.aByte55) / (float) local74);
				}
				if (this.aBoolean53) {
					this.method730(local43);
					this.method713(local49.anInt4784);
				} else {
					this.aClass230_1.method5231(local49.aByte52, local49.aByte51, local49.anInt4785, arg2, arg1);
					if (!this.aClass230_1.method5233(local49.anInt4784, local43)) {
						this.method730(local43);
						this.method713(local49.anInt4784);
					}
				}
			}
			this.anInt882 = arg0;
		}
		this.anInt884 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "(I)V")
	private void method709() {
		this.aClass72_Sub2_3 = new Class72_Sub2();
		this.aClass72_Sub2_4 = new Class72_Sub2();
		this.aClass62Array1 = new Class62[this.anInt863];
		this.aClass62_Sub2_1 = new Class62_Sub2(this, 3553, 6408, 1, 1);
		new Class62_Sub2(this, 3553, 6408, 1, 1);
		new Class62_Sub2(this, 3553, 6408, 1, 1);
		this.aClass57_Sub2_1 = new Class57_Sub2(this);
		this.bf = new Class57_Sub2(this);
		this.aClass57_Sub2_3 = new Class57_Sub2(this);
		this.aClass57_Sub2_5 = new Class57_Sub2(this);
		this.aClass57_Sub2_6 = new Class57_Sub2(this);
		this.aClass57_Sub2_9 = new Class57_Sub2(this);
		this.aClass57_Sub2_8 = new Class57_Sub2(this);
		this.aClass57_Sub2_4 = new Class57_Sub2(this);
		this.aClass57_Sub2_7 = new Class57_Sub2(this);
		this.aClass57_Sub2_2 = new Class57_Sub2(this);
		if (this.aBoolean60) {
			this.aClass172_1 = new Class172(this);
			new Class172(this);
		}
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "()V")
	@Override
	public void method2039() {
		if (this.aClass4_Sub13_Sub1_1 != null && this.aClass4_Sub13_Sub1_1.method5079()) {
			this.aClass106_1.method2938(this.aClass4_Sub13_Sub1_1);
			this.aClass144_1.method3824();
		}
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method2097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method707();
		this.method703(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "(I)V")
	public void method710() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(B)V")
	private void method711() {
		Static295.aFloatArray24[1] = this.aFloat9 * this.aFloat8;
		Static295.aFloatArray24[3] = 1.0F;
		Static295.aFloatArray24[2] = this.aFloat14 * this.aFloat8;
		Static295.aFloatArray24[0] = this.aFloat6 * this.aFloat8;
		OpenGL.glLightfv(16384, 4609, Static295.aFloatArray24, 0);
		Static295.aFloatArray24[0] = this.aFloat6 * -this.aFloat23;
		Static295.aFloatArray24[2] = this.aFloat14 * -this.aFloat23;
		Static295.aFloatArray24[1] = this.aFloat9 * -this.aFloat23;
		Static295.aFloatArray24[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static295.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!bt", name = "A", descriptor = "()Lclient!n;")
	@Override
	public Class72 method2103() {
		return new Class72_Sub2();
	}

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "([I)V")
	@Override
	public void p(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt865;
		arg0[1] = this.anInt853;
		arg0[3] = this.anInt859;
		arg0[0] = this.anInt874;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2084(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static76.aFloat35 = arg1;
		Static115.aFloat57 = arg2;
		Static373.aFloat89 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BJ)V")
	public synchronized void method712(@OriginalArg(1) long arg0) {
		@Pc(13) Class4 local13 = new Class4();
		local13.aLong228 = arg0;
		this.aClass91_9.method2587(local13);
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(II)V")
	public void method713(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method724(7681, 7681);
		} else if (arg0 == 0) {
			this.method724(8448, 8448);
		} else if (arg0 == 2) {
			this.method724(34165, 7681);
			return;
		} else if (arg0 == 3) {
			this.method724(260, 8448);
			return;
		} else if (arg0 == 4) {
			this.method724(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "()V")
	@Override
	public void method2088() {
		if (!this.aBoolean45 || this.anInt758 <= 0 || this.anInt801 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt874;
		@Pc(25) int local25 = this.anInt865;
		@Pc(28) int local28 = this.anInt853;
		@Pc(31) int local31 = this.anInt859;
		this.H();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method761();
		this.method760(false);
		this.method704(false);
		this.method738(false);
		this.method731(false);
		this.method730(null);
		this.method693(-2);
		this.method713(1);
		this.method703(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt758, this.anInt801, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.w(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass106_1.method2930(arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I")
	@Override
	public int method2065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!wg;)V")
	@Override
	public void method2085(@OriginalArg(0) Class270 arg0) {
		this.aClass142_1.method3817(this, arg0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!us;I)V")
	public void method714(@OriginalArg(0) Interface9 arg0) {
		if (this.anInterface9_2 != arg0) {
			if (this.aBoolean43) {
				OpenGL.glBindBufferARB(34962, arg0.method4496());
			}
			this.anInterface9_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIZ)Lclient!aa;")
	@Override
	public Class2 method2058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class2_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BFF)V")
	public void method715(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat7 = arg0;
		this.aFloat16 = arg1;
		if (!this.aBoolean53) {
			this.method694();
		}
	}

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "(I)V")
	private void method716() {
		if (this.anInt865 >= this.anInt874 && this.anInt853 <= this.anInt859) {
			OpenGL.glScissor(this.anInt850 + this.anInt874, this.anInt849 - (-this.anInt801 - -this.anInt859), this.anInt865 - this.anInt874, -this.anInt853 + this.anInt859);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "(I)V")
	private void method717() {
		if (this.aBoolean55 && this.anInt854 >= 0 | this.aBoolean53) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2059() {
	}

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "(I)V")
	public void method718() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray1, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray2, 0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!fl;Z)V")
	public void method719(@OriginalArg(0) Class72_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method2193(), 0);
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)Lclient!w;")
	@Override
	public Class4_Sub18 method2051(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub18_Sub1 local8 = new Class4_Sub18_Sub1(arg0);
		this.aClass91_2.method2587(local8);
		return local8;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)I")
	public int method720(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2073(@OriginalArg(0) Canvas arg0) {
		this.aLong24 = 0L;
		this.aCanvas2 = null;
		if (arg0 == null || arg0 == this.aCanvas1) {
			this.aCanvas2 = this.aCanvas1;
			this.aLong24 = this.aLong25;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable1.get(arg0);
			this.aLong24 = local36;
			this.aCanvas2 = arg0;
		}
		if (this.aCanvas2 == null || this.aLong24 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong24);
		this.method739();
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Z)V")
	@Override
	public void method2068(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IBIILclient!vn;)V")
	public void method721(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Interface11 arg2) {
		@Pc(15) int local15 = arg2.method4365();
		@Pc(22) int local22 = arg0 * this.method749(local15);
		this.method751(arg2);
		OpenGL.glDrawElements(4, arg1, local15, (long) local22 + arg2.method4364());
	}

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "()V")
	@Override
	public void method2083() {
		this.method731(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V")
	@Override
	public void method2056(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2043(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas1) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZZ[BII)Lclient!vn;")
	public Interface11 method723(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2) {
		return (Interface11) (this.aBoolean43 && (!arg0 || this.aBoolean52) ? new Class138_Sub1(this, 5123, arg1, arg2, arg0) : new Class129_Sub2(this, 5123, arg1, arg2));
	}

	@OriginalMember(owner = "client!bt", name = "I", descriptor = "()F")
	@Override
	public float I() {
		return this.aFloat25;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(Z)V")
	@Override
	public void method2106(@OriginalArg(0) boolean arg0) {
		this.aBoolean61 = arg0;
		this.method725();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([Lclient!ka;Lclient!wg;Lclient!n;[Lclient!wc;I)V")
	@Override
	public void method2078(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) Class71_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method2050(arg0, arg2, arg3, arg4);
		this.method2085(arg1);
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(III)V")
	public void method724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt880 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(26) boolean local26 = false;
		if (this.anInt862 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt862 = arg0;
			local26 = true;
		}
		if (this.anInt869 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local26 = true;
			this.anInt869 = arg1;
		}
		if (local26) {
			this.anInt884 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!bt", name = "v", descriptor = "(I)V")
	private void method725() {
		OpenGL.glDepthMask(this.aBoolean40 && this.aBoolean61);
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(IB)V")
	public void method726(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt880) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt880 = arg0;
		}
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(B)V")
	public void method727() {
		if (this.anInt884 == 2) {
			return;
		}
		this.method689();
		this.method760(false);
		this.method704(false);
		this.method738(false);
		this.method731(false);
		this.method693(-2);
		this.anInt884 = 2;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!gg;[Lclient!ho;Z)Lclient!ba;")
	@Override
	public Class18 method2054(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class98[] arg1) {
		return new Class18_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "()V")
	@Override
	public void method2042() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!wr;I)V")
	public void method728(@OriginalArg(0) Interface13 arg0) {
		if (this.aBoolean57) {
			this.method756(arg0);
			this.method737(arg0);
		} else if (this.anInt842 >= 0 && this.anInterface13Array1[this.anInt842] == arg0) {
			this.anInterface13Array1[this.anInt842--] = null;
			arg0.method4324();
			if (this.anInt842 >= 0) {
				this.anInterface13_2 = this.anInterface13_1 = this.anInterface13Array1[this.anInt842];
				this.anInterface13_2.method4325();
			} else {
				this.anInterface13_2 = this.anInterface13_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(III)V")
	public synchronized void method729(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub16 local14 = new Class4_Sub16(arg1);
		local14.aLong228 = arg0;
		this.aClass91_4.method2587(local14);
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "()V")
	@Override
	public void method2038() {
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([IIIII)Lclient!aa;")
	@Override
	public Class2 method2055(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class2_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZLclient!ei;)V")
	public void method730(@OriginalArg(1) Class62 arg0) {
		@Pc(17) Class62 local17 = this.aClass62Array1[this.anInt880];
		if (arg0 != local17) {
			if (arg0 == null) {
				OpenGL.glDisable(local17.anInt6644);
			} else {
				if (local17 == null) {
					OpenGL.glEnable(arg0.anInt6644);
				} else if (local17.anInt6644 != arg0.anInt6644) {
					OpenGL.glDisable(local17.anInt6644);
					OpenGL.glEnable(arg0.anInt6644);
				}
				OpenGL.glBindTexture(arg0.anInt6644, arg0.method5356());
			}
			this.aClass62Array1[this.anInt880] = arg0;
		}
		this.anInt884 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZ)V")
	public void method731(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean40) {
			this.aBoolean40 = arg0;
			this.method725();
			this.anInt884 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(B)V")
	private void method732() {
		OpenGL.glViewport(this.anInt850, this.anInt849, this.anInt758, this.anInt801);
	}

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "(B)V")
	private void method733() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(ILclient!wr;)V")
	public void method734(@OriginalArg(1) Interface13 arg0) {
		if (this.aBoolean57) {
			this.method685(arg0);
			this.method697(arg0);
		} else if (this.anInt842 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt842 >= 0) {
				this.anInterface13Array1[this.anInt842].method4324();
			}
			this.anInterface13_2 = this.anInterface13_1 = this.anInterface13Array1[++this.anInt842] = arg0;
			this.anInterface13_2.method4325();
		}
	}

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "(I)V")
	private void method735() {
		if (this.anInt871 != 2) {
			this.anInt871 = 2;
			this.method741();
			this.method755();
			this.anInt884 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!fl;I)V")
	public void method736(@OriginalArg(0) Class72_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method2193(), 0);
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "()Z")
	@Override
	public boolean method2040() {
		return this.aClass4_Sub13_Sub1_1 != null && this.aClass4_Sub13_Sub1_1.method5079();
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(IIIII)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method707();
		this.method703(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!kv;)V")
	@Override
	public void method2067(@OriginalArg(0) Class41 arg0) {
		this.aClass41_Sub1_1 = (Class41_Sub1) arg0;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(ILclient!wr;)V")
	public void method737(@OriginalArg(1) Interface13 arg0) {
		if (this.anInt843 < 0 || arg0 != this.anInterface13Array2[this.anInt843]) {
			throw new RuntimeException();
		}
		this.anInterface13Array2[this.anInt843--] = null;
		arg0.method4322();
		if (this.anInt843 < 0) {
			this.anInterface13_1 = null;
		} else {
			this.anInterface13_1 = this.anInterface13Array2[this.anInt843];
			this.anInterface13_1.method4323();
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(BZ)V")
	public void method738(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean56 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt884 &= 0xFFFFFFE0;
		this.aBoolean56 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "x", descriptor = "(I)V")
	private void method739() {
		if (this.aCanvas2 == null) {
			this.anInt730 = this.anInt829 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas2.getSize();
			this.anInt730 = local10.width;
			this.anInt829 = local10.height;
		}
		if (this.anInterface13_1 == null) {
			this.anInt801 = this.anInt829;
			this.anInt758 = this.anInt730;
			this.method732();
		}
		this.method761();
		this.H();
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZB)V")
	public void method740(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method708(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!w;)V")
	@Override
	public void method2060(@OriginalArg(0) Class4_Sub18 arg0) {
		this.aNativeHeap1 = ((Class4_Sub18_Sub1) arg0).aNativeHeap2;
		if (this.anInterface9_1 != null) {
			return;
		}
		@Pc(16) Class4_Sub20_Sub2 local16 = new Class4_Sub20_Sub2(80);
		if (this.aBoolean51) {
			local16.method4626(-1.0F);
			local16.method4626(-1.0F);
			local16.method4626(0.0F);
			local16.method4626(0.0F);
			local16.method4626(1.0F);
			local16.method4626(1.0F);
			local16.method4626(-1.0F);
			local16.method4626(0.0F);
			local16.method4626(1.0F);
			local16.method4626(1.0F);
			local16.method4626(1.0F);
			local16.method4626(1.0F);
			local16.method4626(0.0F);
			local16.method4626(1.0F);
			local16.method4626(0.0F);
			local16.method4626(-1.0F);
			local16.method4626(1.0F);
			local16.method4626(0.0F);
			local16.method4626(0.0F);
			local16.method4626(0.0F);
		} else {
			local16.method4627(-1.0F);
			local16.method4627(-1.0F);
			local16.method4627(0.0F);
			local16.method4627(0.0F);
			local16.method4627(1.0F);
			local16.method4627(1.0F);
			local16.method4627(-1.0F);
			local16.method4627(0.0F);
			local16.method4627(1.0F);
			local16.method4627(1.0F);
			local16.method4627(1.0F);
			local16.method4627(1.0F);
			local16.method4627(0.0F);
			local16.method4627(1.0F);
			local16.method4627(0.0F);
			local16.method4627(-1.0F);
			local16.method4627(1.0F);
			local16.method4627(0.0F);
			local16.method4627(0.0F);
			local16.method4627(0.0F);
		}
		this.anInterface9_1 = this.method686(false, 20, local16.anInt5526, local16.aByteArray77);
		this.aClass118_1 = new Class118(this.anInterface9_1, 5126, 3, 0);
		this.aClass118_2 = new Class118(this.anInterface9_1, 5126, 2, 12);
		this.aClass142_1.method3812(this);
	}

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "()V")
	@Override
	protected void method2053() {
		for (@Pc(6) Class4 local6 = this.aClass91_2.method2584(); local6 != null; local6 = this.aClass91_2.method2586()) {
			((Class4_Sub18_Sub1) local6).method2788();
		}
		if (this.aClass106_1 != null) {
			this.aClass106_1.method2936();
		}
		if (this.anOpenGL1 != null) {
			this.method733();
			@Pc(40) Enumeration local40 = this.aHashtable1.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable1.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean33) {
			Static148.method5176(false, true);
			this.aBoolean33 = false;
		}
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(Z)V")
	private void method741() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray4, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(II)V")
	public synchronized void method742(@OriginalArg(0) int arg0) {
		@Pc(13) Class4 local13 = new Class4();
		local13.aLong228 = arg0;
		this.aClass91_8.method2587(local13);
	}

	@OriginalMember(owner = "client!bt", name = "B", descriptor = "()I")
	@Override
	public int method2104() {
		return 4;
	}

	@OriginalMember(owner = "client!bt", name = "N", descriptor = "(IIII)[I")
	@Override
	public int[] N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt801 - arg1 - local12, arg2, 1, 32993, this.anInt864, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "()V")
	@Override
	public void r() {
		this.aBoolean53 = false;
		this.aClass230_1.method5231(0, 0, 0, false, false);
		this.method694();
		this.method717();
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "(II)V")
	@Override
	public void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt877 && arg1 == this.anInt857) {
			return;
		}
		this.anInt857 = arg1;
		this.anInt877 = arg0;
		this.method695();
		this.method694();
		if (this.anInt871 == 3) {
			this.method681();
		} else if (this.anInt871 == 2) {
			this.method741();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!ho;Z)Lclient!aa;")
	@Override
	public Class2 method2031(@OriginalArg(0) Class98 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt3175 * arg0.anInt3171];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray34 == null) {
			for (local21 = 0; local21 < arg0.anInt3175; local21++) {
				for (local25 = 0; local25 < arg0.anInt3171; local25++) {
					@Pc(38) int local38 = arg0.anIntArray260[arg0.aByteArray33[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt3175; local21++) {
				for (local25 = 0; local25 < arg0.anInt3171; local25++) {
					local12[local16++] = arg0.anIntArray260[arg0.aByteArray33[local14] & 0xFF] | arg0.aByteArray34[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(119) Class2 local119 = this.method2055(local12, arg0.anInt3171, arg0.anInt3171, arg0.anInt3175);
		local119.l(arg0.anInt3173, arg0.anInt3176, arg0.anInt3174, arg0.anInt3172);
		return local119;
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(Z)V")
	private void method744() {
		this.aFloat19 = this.anInt874 - this.anInt852;
		this.aFloat11 = this.anInt853 - this.anInt866;
		this.aFloat10 = this.anInt859 - this.anInt866;
		this.aFloat18 = this.anInt865 - this.anInt852;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(FIFFF)V")
	public void method745(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static295.aFloatArray24[0] = arg3;
		Static295.aFloatArray24[2] = arg0;
		Static295.aFloatArray24[1] = arg2;
		Static295.aFloatArray24[3] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static295.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2047(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas1 == arg0) {
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

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "()Lclient!n;")
	@Override
	public Class72 method2092() {
		return this.aClass72_Sub2_1;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZI)V")
	public synchronized void method746(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub16 local8 = new Class4_Sub16(arg0);
		local8.aLong228 = arg1;
		this.aClass91_5.method2587(local8);
	}

	@OriginalMember(owner = "client!bt", name = "ha", descriptor = "(III)V")
	@Override
	public void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt875 && this.anInt854 == arg1 && arg2 == this.anInt856) {
			return;
		}
		this.anInt875 = arg0;
		this.anInt856 = arg2;
		this.anInt854 = arg1;
		if (this.aBoolean53) {
			return;
		}
		this.method694();
		this.method717();
	}

	@OriginalMember(owner = "client!bt", name = "y", descriptor = "(I)V")
	public void method747() {
		if (this.anInt884 == 4) {
			return;
		}
		this.method689();
		this.method760(false);
		this.method704(false);
		this.method738(false);
		this.method731(false);
		this.method693(-2);
		this.method703(1);
		this.method713(0);
		this.anInt884 = 4;
	}

	@OriginalMember(owner = "client!bt", name = "x", descriptor = "()V")
	@Override
	public void method2098() {
		this.aClass106_1.method2931();
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)V")
	@Override
	public void method2099(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "()Z")
	@Override
	public boolean method2076() {
		return this.aBoolean54 && (!this.method2040() || this.aBoolean47);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!jd;Lclient!jd;Lclient!jd;ILclient!jd;)V")
	public void method748(@OriginalArg(0) Class118 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(4) Class118 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method714(arg3.anInterface9_4);
			OpenGL.glVertexPointer(arg3.aByte23, arg3.aShort40, this.anInterface9_2.method4494(), this.anInterface9_2.method4495() + (long) arg3.aByte24);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method714(arg1.anInterface9_4);
			OpenGL.glNormalPointer(arg1.aShort40, this.anInterface9_2.method4494(), this.anInterface9_2.method4495() + (long) arg1.aByte24);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method714(arg0.anInterface9_4);
			OpenGL.glColorPointer(arg0.aByte23, arg0.aShort40, this.anInterface9_2.method4494(), this.anInterface9_2.method4495() + (long) arg0.aByte24);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method714(arg2.anInterface9_4);
			OpenGL.glTexCoordPointer(arg2.aByte23, arg2.aShort40, this.anInterface9_2.method4494(), this.anInterface9_2.method4495() + (long) arg2.aByte24);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "(II)I")
	public int method749(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!bt", name = "z", descriptor = "(I)V")
	private void method750() {
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.anInt858; local13++) {
			@Pc(20) Class4_Sub17 local20 = this.aClass4_Sub17Array1[local13];
			Static321.aFloatArray23[0] = local20.method6165();
			@Pc(31) int local31 = local13 + 16386;
			Static321.aFloatArray23[1] = local20.method6162();
			Static321.aFloatArray23[2] = local20.method6161();
			Static321.aFloatArray23[3] = 1.0F;
			OpenGL.glLightfv(local31, 4611, Static321.aFloatArray23, 0);
			@Pc(60) int local60 = local20.method6159();
			@Pc(66) float local66 = local20.method6158() / 255.0F;
			Static321.aFloatArray23[0] = (float) (local60 >> 16 & 0xFF) * local66;
			Static321.aFloatArray23[2] = local66 * (float) (local60 & 0xFF);
			Static321.aFloatArray23[1] = (float) (local60 >> 8 & 0xFF) * local66;
			OpenGL.glLightfv(local31, 4609, Static321.aFloatArray23, 0);
			OpenGL.glLightf(local31, 4617, 1.0F / (float) (local20.method6160() * local20.method6160()));
			OpenGL.glEnable(local31);
		}
		while (local13 < this.anInt876) {
			OpenGL.glDisable(local13 + 16386);
			local13++;
		}
		this.anInt876 = this.anInt858;
	}

	@OriginalMember(owner = "client!bt", name = "GA", descriptor = "(ILclient!i;II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class74_Sub2 local6 = (Class74_Sub2) arg1;
		@Pc(9) Class62_Sub2_Sub1 local9 = local6.aClass62_Sub2_Sub1_5;
		this.method727();
		this.method730(local6.aClass62_Sub2_Sub1_5);
		this.method703(1);
		this.method724(7681, 8448);
		this.method752(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat61 / (float) local9.anInt3025;
		@Pc(46) float local46 = local9.aFloat60 / (float) local9.anInt3028;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt874 - arg2) * local39, local46 * (float) (this.anInt853 - arg3));
		OpenGL.glVertex2i(this.anInt874, this.anInt853);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt874 - arg2), local46 * (float) (this.anInt859 - arg3));
		OpenGL.glVertex2i(this.anInt874, this.anInt859);
		OpenGL.glTexCoord2f((float) (this.anInt865 - arg2) * local39, (float) (this.anInt859 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt865, this.anInt859);
		OpenGL.glTexCoord2f((float) (this.anInt865 - arg2) * local39, local46 * (float) (this.anInt853 - arg3));
		OpenGL.glVertex2i(this.anInt865, this.anInt853);
		OpenGL.glEnd();
		this.method752(5890, 768, 0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([Lclient!ka;Lclient!n;[Lclient!wc;I)V")
	@Override
	public void method2050(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class71_Sub7[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method6073(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "BA", descriptor = "(IIIII)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method707();
		this.method703(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(IIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt866 = arg1;
		this.anInt873 = arg3;
		this.anInt852 = arg0;
		this.anInt870 = arg2;
		this.method695();
		this.method744();
		if (this.anInt871 == 3) {
			this.method681();
		} else if (this.anInt871 == 2) {
			this.method741();
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "()Z")
	@Override
	public boolean method2034() {
		return true;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method2074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method707();
		this.method703(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean54) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean54) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!bt", name = "TA", descriptor = "(IIIIII)Z")
	@Override
	public boolean TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass72_Sub2_3.aFloat45 * (float) arg2 + (float) arg0 * this.aClass72_Sub2_3.aFloat52 + this.aClass72_Sub2_3.aFloat51 * (float) arg1 + this.aClass72_Sub2_3.aFloat54;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = (float) arg5 * this.aClass72_Sub2_3.aFloat45 + (float) arg3 * this.aClass72_Sub2_3.aFloat52 + this.aClass72_Sub2_3.aFloat51 * (float) arg4 + this.aClass72_Sub2_3.aFloat54;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt877 && (float) this.anInt877 > local59 || !(!(local28 > (float) this.anInt857) || !((float) this.anInt857 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass72_Sub2_3.aFloat48 + this.aClass72_Sub2_3.aFloat50 * (float) arg2 + this.aClass72_Sub2_3.aFloat55 * (float) arg1 + (float) arg0 * this.aClass72_Sub2_3.aFloat56) * (float) this.anInt870 / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt870 * (this.aClass72_Sub2_3.aFloat48 + (float) arg5 * this.aClass72_Sub2_3.aFloat50 + (float) arg4 * this.aClass72_Sub2_3.aFloat55 + this.aClass72_Sub2_3.aFloat56 * (float) arg3) / local59);
		if ((float) local123 < this.aFloat19 && this.aFloat19 > (float) local155 || this.aFloat18 < (float) local123 && (float) local155 > this.aFloat18) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt873 * (this.aClass72_Sub2_3.aFloat46 + (float) arg1 * this.aClass72_Sub2_3.aFloat47 + (float) arg0 * this.aClass72_Sub2_3.aFloat53 + this.aClass72_Sub2_3.aFloat49 * (float) arg2) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt873 * (this.aClass72_Sub2_3.aFloat46 + (float) arg4 * this.aClass72_Sub2_3.aFloat47 + this.aClass72_Sub2_3.aFloat53 * (float) arg3 + (float) arg5 * this.aClass72_Sub2_3.aFloat49) / local59);
			return (!((float) local213 < this.aFloat11) || !(this.aFloat11 > (float) local245)) && (!((float) local213 > this.aFloat10) || !(this.aFloat10 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "()Z")
	@Override
	public boolean method2090() {
		return true;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!vn;B)V")
	public void method751(@OriginalArg(0) Interface11 arg0) {
		if (this.anInterface11_1 != arg0) {
			if (this.aBoolean43) {
				OpenGL.glBindBufferARB(34963, arg0.method4366());
			}
			this.anInterface11_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!bt", name = "MA", descriptor = "(F)V")
	@Override
	public void MA(@OriginalArg(0) float arg0) {
		if (this.aFloat22 != arg0) {
			this.aFloat22 = arg0;
			this.method691();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!ka;Lclient!wg;Lclient!n;Lclient!wc;I)V")
	@Override
	public void method2041(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) Class71_Sub7 arg3) {
		arg0.method6073(arg2, arg3, 0);
		this.method2085(arg1);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZIII)V")
	public void method752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIF)Lclient!ni;")
	@Override
	public Class4_Sub17 method2087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub17_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bt", name = "ua", descriptor = "(IIIIII[BII)V")
	@Override
	public void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(53) float local53;
		if (this.aClass62_Sub2_Sub1_1 == null || this.aClass62_Sub2_Sub1_1.anInt3019 < arg2 || arg3 > this.aClass62_Sub2_Sub1_1.anInt3021) {
			this.aClass62_Sub2_Sub1_1 = Static274.method4386(arg6, arg3, this, arg2);
			this.aClass62_Sub2_Sub1_1.method2681(false, false);
			local41 = this.aClass62_Sub2_Sub1_1.aFloat60;
			local53 = this.aClass62_Sub2_Sub1_1.aFloat61;
		} else {
			this.aClass62_Sub2_Sub1_1.method2687(arg2, 6406, false, arg3, arg6);
			local41 = this.aClass62_Sub2_Sub1_1.aFloat60 * (float) arg3 / (float) this.aClass62_Sub2_Sub1_1.anInt3021;
			local53 = this.aClass62_Sub2_Sub1_1.aFloat61 * (float) arg2 / (float) this.aClass62_Sub2_Sub1_1.anInt3019;
		}
		this.method727();
		this.method730(this.aClass62_Sub2_Sub1_1);
		this.method703(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method765(arg5);
		this.method724(34165, 34165);
		this.method752(34166, 768, 0);
		this.method752(5890, 770, 2);
		this.method690(34166, 0);
		this.method690(5890, 2);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = (float) arg2 + local143;
		@Pc(156) float local156 = local146 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local53);
		OpenGL.glVertex2f(local143, local156);
		OpenGL.glTexCoord2f(local41, local53);
		OpenGL.glVertex2f(local151, local156);
		OpenGL.glTexCoord2f(local41, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method752(5890, 768, 0);
		this.method752(34166, 770, 2);
		this.method690(5890, 0);
		this.method690(34166, 2);
	}

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "()Z")
	@Override
	public boolean method2046() {
		return true;
	}

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "(B)V")
	private void method753() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static77.method1653(1000L);
		}
	}

	@OriginalMember(owner = "client!bt", name = "Z", descriptor = "()I")
	@Override
	public int Z() {
		@Pc(6) int local6 = this.anInt885;
		this.anInt885 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "(B)V")
	public void method754() {
		if (this.anInt884 == 16) {
			return;
		}
		this.method683();
		this.method760(true);
		this.method738(true);
		this.method731(true);
		this.method703(1);
		this.method713(0);
		this.anInt884 = 16;
	}

	@OriginalMember(owner = "client!bt", name = "y", descriptor = "()Z")
	@Override
	public boolean method2100() {
		return true;
	}

	@OriginalMember(owner = "client!bt", name = "A", descriptor = "(I)V")
	private void method755() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass72_Sub2_3.method2193(), 0);
		if (this.aBoolean53) {
			this.aClass230_1.aClass39_Sub5_1.method4005();
		}
		this.method718();
		this.method750();
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Lclient!wr;I)V")
	public void method756(@OriginalArg(0) Interface13 arg0) {
		if (this.anInt844 < 0 || arg0 != this.anInterface13Array3[this.anInt844]) {
			throw new RuntimeException();
		}
		this.anInterface13Array3[this.anInt844--] = null;
		arg0.method4321();
		if (this.anInt844 >= 0) {
			this.anInterface13_2 = this.anInterface13Array3[this.anInt844];
			this.anInterface13_2.method4320();
		} else {
			this.anInterface13_2 = null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(IIII)V")
	public void method757(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "(IIII)V")
	@Override
	public void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt801 < arg3) {
			arg3 = this.anInt801;
		}
		if (this.anInt758 < arg2) {
			arg2 = this.anInt758;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt865 = arg2;
		this.anInt859 = arg3;
		this.anInt853 = arg1;
		this.anInt874 = arg0;
		OpenGL.glEnable(3089);
		this.method744();
		this.method716();
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "()Z")
	@Override
	public boolean method2045() {
		return true;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIB)V")
	public synchronized void method759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub16 local8 = new Class4_Sub16(arg1);
		local8.aLong228 = arg0;
		this.aClass91_7.method2587(local8);
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(IZ)V")
	public void method760(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean55) {
			this.aBoolean55 = arg0;
			this.method717();
			this.anInt884 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bt", name = "B", descriptor = "(I)V")
	public void method761() {
		if (this.anInt871 != 0) {
			this.anInt871 = 0;
			this.anInt884 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "()Z")
	@Override
	public boolean method2033() {
		return this.aClass4_Sub13_Sub1_1 != null && (this.anInt833 <= 1 || this.aBoolean47);
	}

	@OriginalMember(owner = "client!bt", name = "K", descriptor = "(I)V")
	@Override
	public void K(@OriginalArg(0) int arg0) {
		this.anInt839 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt839++;
		}
		this.anInt840 = 0x1 << this.anInt839;
	}

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "(B)V")
	private void method762() {
		if (this.aBoolean58 && !this.aBoolean48) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIZLclient!jaggl/memory/NativeBuffer;I)Lclient!us;")
	public Interface9 method763(@OriginalArg(0) int arg0, @OriginalArg(3) NativeBuffer arg1, @OriginalArg(4) int arg2) {
		return (Interface9) (this.aBoolean43 ? new Class138_Sub2(this, arg2, arg1, arg0, false) : new Class129_Sub1(this, arg2, arg1));
	}

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "()Z")
	@Override
	public boolean method2096() {
		return true;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(FIFF)V")
	private void method764(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean41) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg1, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean41 = true;
	}

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "(II)V")
	public void method765(@OriginalArg(0) int arg0) {
		Static295.aFloatArray24[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static295.aFloatArray24[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static295.aFloatArray24[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static295.aFloatArray24[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static295.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!bt", name = "C", descriptor = "(I)Lclient!hp;")
	public Class62_Sub3 method766() {
		return this.aClass41_Sub1_1 == null ? null : this.aClass41_Sub1_1.method3949();
	}

	@OriginalMember(owner = "client!bt", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		return this.anInt847 + this.anInt846 + this.anInt845;
	}

	@OriginalMember(owner = "client!bt", name = "XA", descriptor = "(III[I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass72_Sub2_3.aFloat45 * (float) arg2 + this.aClass72_Sub2_3.aFloat51 * (float) arg1 + this.aClass72_Sub2_3.aFloat52 * (float) arg0 + this.aClass72_Sub2_3.aFloat54;
		if (local28 < (float) this.anInt877 || local28 > (float) this.anInt857) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass72_Sub2_3.aFloat56 * (float) arg0 + (float) arg1 * this.aClass72_Sub2_3.aFloat55 + this.aClass72_Sub2_3.aFloat50 * (float) arg2 + this.aClass72_Sub2_3.aFloat48) * (float) this.anInt870 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt873 * (this.aClass72_Sub2_3.aFloat46 + (float) arg0 * this.aClass72_Sub2_3.aFloat53 + (float) arg1 * this.aClass72_Sub2_3.aFloat47 + this.aClass72_Sub2_3.aFloat49 * (float) arg2) / local28);
		if (this.aFloat19 <= (float) local85 && this.aFloat18 >= (float) local85 && this.aFloat11 <= (float) local117 && (float) local117 <= this.aFloat10) {
			arg3[0] = (int) ((float) local85 - this.aFloat19);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat11);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!bt", name = "U", descriptor = "()I")
	@Override
	public int U() {
		@Pc(6) int local6 = this.anInt886;
		this.anInt886 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!bt", name = "S", descriptor = "(IIIII)V")
	@Override
	protected void S(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2032(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas1 == arg0) {
			local5 = this.aLong25;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable1.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas2) {
			this.method739();
		}
	}
}
