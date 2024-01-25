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

@OriginalClass("client!tt")
public final class Class200_Sub2 extends Class200 {

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
	private int anInt6540;

	@OriginalMember(owner = "client!tt", name = "eb", descriptor = "I")
	public int anInt6572;

	@OriginalMember(owner = "client!tt", name = "Gb", descriptor = "I")
	public int anInt6597;

	@OriginalMember(owner = "client!tt", name = "oc", descriptor = "I")
	private int anInt6630;

	@OriginalMember(owner = "client!tt", name = "re", descriptor = "I")
	public int anInt6720;

	@OriginalMember(owner = "client!tt", name = "se", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!tt", name = "ve", descriptor = "Lclient!un;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "client!tt", name = "we", descriptor = "Lclient!un;")
	private Interface13 anInterface13_2;

	@OriginalMember(owner = "client!tt", name = "Ce", descriptor = "I")
	public int anInt6725;

	@OriginalMember(owner = "client!tt", name = "De", descriptor = "I")
	private int anInt6726;

	@OriginalMember(owner = "client!tt", name = "Fe", descriptor = "I")
	public int anInt6727;

	@OriginalMember(owner = "client!tt", name = "Me", descriptor = "Lclient!gl;")
	public Class29_Sub1 aClass29_Sub1_3;

	@OriginalMember(owner = "client!tt", name = "Pe", descriptor = "Lclient!qo;")
	public Class57_Sub2 aClass57_Sub2_1;

	@OriginalMember(owner = "client!tt", name = "Te", descriptor = "I")
	private int anInt6730;

	@OriginalMember(owner = "client!tt", name = "Ue", descriptor = "Lclient!pp;")
	public Class195 aClass195_12;

	@OriginalMember(owner = "client!tt", name = "Ve", descriptor = "Z")
	private boolean aBoolean428;

	@OriginalMember(owner = "client!tt", name = "We", descriptor = "I")
	public int anInt6731;

	@OriginalMember(owner = "client!tt", name = "Xe", descriptor = "I")
	private int anInt6732;

	@OriginalMember(owner = "client!tt", name = "Ye", descriptor = "I")
	private int anInt6733;

	@OriginalMember(owner = "client!tt", name = "af", descriptor = "I")
	private int anInt6734;

	@OriginalMember(owner = "client!tt", name = "cf", descriptor = "I")
	public int anInt6735;

	@OriginalMember(owner = "client!tt", name = "df", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!tt", name = "ef", descriptor = "I")
	private int anInt6736;

	@OriginalMember(owner = "client!tt", name = "ff", descriptor = "Z")
	public boolean aBoolean429;

	@OriginalMember(owner = "client!tt", name = "gf", descriptor = "I")
	public int anInt6737;

	@OriginalMember(owner = "client!tt", name = "hf", descriptor = "Z")
	private boolean aBoolean430;

	@OriginalMember(owner = "client!tt", name = "kf", descriptor = "F")
	private float aFloat155;

	@OriginalMember(owner = "client!tt", name = "lf", descriptor = "Z")
	private boolean aBoolean431;

	@OriginalMember(owner = "client!tt", name = "mf", descriptor = "Lclient!qo;")
	public Class57_Sub2 aClass57_Sub2_2;

	@OriginalMember(owner = "client!tt", name = "nf", descriptor = "Lclient!qo;")
	public Class57_Sub2 aClass57_Sub2_3;

	@OriginalMember(owner = "client!tt", name = "pf", descriptor = "I")
	private int anInt6740;

	@OriginalMember(owner = "client!tt", name = "rf", descriptor = "I")
	private int anInt6742;

	@OriginalMember(owner = "client!tt", name = "tf", descriptor = "Lclient!ak;")
	public Class11 aClass11_3;

	@OriginalMember(owner = "client!tt", name = "uf", descriptor = "Lclient!gl;")
	public Class29_Sub1 aClass29_Sub1_4;

	@OriginalMember(owner = "client!tt", name = "yf", descriptor = "Lclient!tm;")
	private Class24_Sub1 aClass24_Sub1_1;

	@OriginalMember(owner = "client!tt", name = "Bf", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!tt", name = "Cf", descriptor = "Lclient!qo;")
	public Class57_Sub2 aClass57_Sub2_4;

	@OriginalMember(owner = "client!tt", name = "Df", descriptor = "Z")
	public boolean aBoolean433;

	@OriginalMember(owner = "client!tt", name = "Ef", descriptor = "I")
	private int anInt6743;

	@OriginalMember(owner = "client!tt", name = "Ff", descriptor = "Z")
	private boolean aBoolean434;

	@OriginalMember(owner = "client!tt", name = "Jf", descriptor = "I")
	public int anInt6744;

	@OriginalMember(owner = "client!tt", name = "Mf", descriptor = "Z")
	public boolean aBoolean437;

	@OriginalMember(owner = "client!tt", name = "Pf", descriptor = "Z")
	private boolean aBoolean438;

	@OriginalMember(owner = "client!tt", name = "Sf", descriptor = "Ljava/lang/String;")
	private String aString69;

	@OriginalMember(owner = "client!tt", name = "Uf", descriptor = "Z")
	public boolean aBoolean441;

	@OriginalMember(owner = "client!tt", name = "Wf", descriptor = "Lclient!qo;")
	public Class57_Sub2 aClass57_Sub2_5;

	@OriginalMember(owner = "client!tt", name = "Xf", descriptor = "F")
	private float aFloat160;

	@OriginalMember(owner = "client!tt", name = "Zf", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!tt", name = "bg", descriptor = "J")
	private long aLong207;

	@OriginalMember(owner = "client!tt", name = "cg", descriptor = "Lclient!qo;")
	public Class57_Sub2 aClass57_Sub2_6;

	@OriginalMember(owner = "client!tt", name = "fg", descriptor = "Lclient!qo;")
	public Class57_Sub2 aClass57_Sub2_7;

	@OriginalMember(owner = "client!tt", name = "gg", descriptor = "Z")
	private boolean aBoolean442;

	@OriginalMember(owner = "client!tt", name = "hg", descriptor = "I")
	private int anInt6753;

	@OriginalMember(owner = "client!tt", name = "jg", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!tt", name = "kg", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!tt", name = "lg", descriptor = "I")
	private int anInt6754;

	@OriginalMember(owner = "client!tt", name = "mg", descriptor = "Z")
	public boolean aBoolean443;

	@OriginalMember(owner = "client!tt", name = "og", descriptor = "Z")
	private boolean aBoolean445;

	@OriginalMember(owner = "client!tt", name = "pg", descriptor = "Lclient!ql;")
	private Interface12 anInterface12_5;

	@OriginalMember(owner = "client!tt", name = "rg", descriptor = "F")
	private float aFloat167;

	@OriginalMember(owner = "client!tt", name = "tg", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!tt", name = "ug", descriptor = "Lclient!f;")
	private Class31_Sub1_Sub1 aClass31_Sub1_Sub1_2;

	@OriginalMember(owner = "client!tt", name = "wg", descriptor = "Z")
	public boolean aBoolean446;

	@OriginalMember(owner = "client!tt", name = "yg", descriptor = "Lclient!qo;")
	public Class57_Sub2 aClass57_Sub2_8;

	@OriginalMember(owner = "client!tt", name = "zg", descriptor = "Lclient!ql;")
	private Interface12 anInterface12_6;

	@OriginalMember(owner = "client!tt", name = "Bg", descriptor = "[Lclient!in;")
	private Class31[] aClass31Array1;

	@OriginalMember(owner = "client!tt", name = "Dg", descriptor = "Z")
	public boolean aBoolean448;

	@OriginalMember(owner = "client!tt", name = "Fg", descriptor = "I")
	private int anInt6758;

	@OriginalMember(owner = "client!tt", name = "Gg", descriptor = "Z")
	private boolean aBoolean449;

	@OriginalMember(owner = "client!tt", name = "Hg", descriptor = "Lclient!qo;")
	public Class57_Sub2 aClass57_Sub2_9;

	@OriginalMember(owner = "client!tt", name = "Kg", descriptor = "Lclient!qo;")
	public Class57_Sub2 aClass57_Sub2_10;

	@OriginalMember(owner = "client!tt", name = "Mg", descriptor = "Z")
	public boolean aBoolean450;

	@OriginalMember(owner = "client!tt", name = "Ng", descriptor = "Z")
	private boolean aBoolean451;

	@OriginalMember(owner = "client!tt", name = "Og", descriptor = "Lclient!pp;")
	public Class195 aClass195_13;

	@OriginalMember(owner = "client!tt", name = "Pg", descriptor = "Lclient!cd;")
	public Class31_Sub1 aClass31_Sub1_3;

	@OriginalMember(owner = "client!tt", name = "Rg", descriptor = "Lclient!fp;")
	private Interface5 anInterface5_4;

	@OriginalMember(owner = "client!tt", name = "Sg", descriptor = "Z")
	public boolean aBoolean452;

	@OriginalMember(owner = "client!tt", name = "Ug", descriptor = "Ljava/lang/String;")
	private String aString70;

	@OriginalMember(owner = "client!tt", name = "Xg", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!tt", name = "ah", descriptor = "Z")
	private boolean aBoolean454;

	@OriginalMember(owner = "client!tt", name = "dh", descriptor = "I")
	private int anInt6765;

	@OriginalMember(owner = "client!tt", name = "fh", descriptor = "I")
	private int anInt6766;

	@OriginalMember(owner = "client!tt", name = "yb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!tt", name = "Wd", descriptor = "I")
	public int anInt6708 = 128;

	@OriginalMember(owner = "client!tt", name = "ke", descriptor = "Lclient!ve;")
	private final Class250 aClass250_1 = new Class250();

	@OriginalMember(owner = "client!tt", name = "le", descriptor = "Lclient!gl;")
	private final Class29_Sub1 aClass29_Sub1_1 = new Class29_Sub1();

	@OriginalMember(owner = "client!tt", name = "me", descriptor = "Lclient!gl;")
	public final Class29_Sub1 aClass29_Sub1_2 = new Class29_Sub1();

	@OriginalMember(owner = "client!tt", name = "ne", descriptor = "I")
	public int anInt6719 = 8;

	@OriginalMember(owner = "client!tt", name = "pe", descriptor = "Z")
	private boolean aBoolean427 = false;

	@OriginalMember(owner = "client!tt", name = "te", descriptor = "I")
	public int anInt6721 = 3;

	@OriginalMember(owner = "client!tt", name = "qe", descriptor = "Lclient!nv;")
	private final Class177 aClass177_37 = new Class177();

	@OriginalMember(owner = "client!tt", name = "ue", descriptor = "[Lclient!un;")
	private final Interface13[] anInterface13Array1 = new Interface13[4];

	@OriginalMember(owner = "client!tt", name = "ze", descriptor = "I")
	private int anInt6723 = -1;

	@OriginalMember(owner = "client!tt", name = "ye", descriptor = "I")
	private int anInt6722 = -1;

	@OriginalMember(owner = "client!tt", name = "Ae", descriptor = "I")
	private int anInt6724 = -1;

	@OriginalMember(owner = "client!tt", name = "xe", descriptor = "[Lclient!un;")
	private final Interface13[] anInterface13Array2 = new Interface13[4];

	@OriginalMember(owner = "client!tt", name = "Be", descriptor = "[Lclient!un;")
	private final Interface13[] anInterface13Array3 = new Interface13[4];

	@OriginalMember(owner = "client!tt", name = "Ee", descriptor = "Lclient!nv;")
	private final Class177 aClass177_38;

	@OriginalMember(owner = "client!tt", name = "Ge", descriptor = "Lclient!nv;")
	private final Class177 aClass177_39;

	@OriginalMember(owner = "client!tt", name = "He", descriptor = "Lclient!nv;")
	private final Class177 aClass177_40;

	@OriginalMember(owner = "client!tt", name = "Ie", descriptor = "Lclient!nv;")
	private final Class177 aClass177_41;

	@OriginalMember(owner = "client!tt", name = "Je", descriptor = "Lclient!nv;")
	private final Class177 aClass177_42;

	@OriginalMember(owner = "client!tt", name = "Ke", descriptor = "Lclient!nv;")
	private final Class177 aClass177_43;

	@OriginalMember(owner = "client!tt", name = "Le", descriptor = "Lclient!nv;")
	private final Class177 aClass177_44;

	@OriginalMember(owner = "client!tt", name = "Re", descriptor = "I")
	public int anInt6729;

	@OriginalMember(owner = "client!tt", name = "qf", descriptor = "I")
	private int anInt6741;

	@OriginalMember(owner = "client!tt", name = "Oe", descriptor = "[Lclient!rd;")
	private final Class5_Sub19[] aClass5_Sub19Array3;

	@OriginalMember(owner = "client!tt", name = "xf", descriptor = "[F")
	private final float[] aFloatArray18;

	@OriginalMember(owner = "client!tt", name = "Ze", descriptor = "[F")
	private final float[] aFloatArray16;

	@OriginalMember(owner = "client!tt", name = "zf", descriptor = "[F")
	public final float[] aFloatArray19;

	@OriginalMember(owner = "client!tt", name = "ag", descriptor = "I")
	public int anInt6751;

	@OriginalMember(owner = "client!tt", name = "sg", descriptor = "I")
	private int anInt6755;

	@OriginalMember(owner = "client!tt", name = "vf", descriptor = "F")
	public float aFloat156;

	@OriginalMember(owner = "client!tt", name = "ig", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!tt", name = "Qf", descriptor = "[F")
	private final float[] aFloatArray20;

	@OriginalMember(owner = "client!tt", name = "of", descriptor = "I")
	private int anInt6739;

	@OriginalMember(owner = "client!tt", name = "xg", descriptor = "I")
	private int anInt6757;

	@OriginalMember(owner = "client!tt", name = "Kf", descriptor = "I")
	public int anInt6745;

	@OriginalMember(owner = "client!tt", name = "Ne", descriptor = "F")
	public float aFloat153;

	@OriginalMember(owner = "client!tt", name = "Qe", descriptor = "I")
	private int anInt6728;

	@OriginalMember(owner = "client!tt", name = "eg", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!tt", name = "Lf", descriptor = "I")
	public int anInt6746;

	@OriginalMember(owner = "client!tt", name = "qg", descriptor = "F")
	private float aFloat166;

	@OriginalMember(owner = "client!tt", name = "Eg", descriptor = "F")
	private float aFloat170;

	@OriginalMember(owner = "client!tt", name = "dg", descriptor = "I")
	public int anInt6752;

	@OriginalMember(owner = "client!tt", name = "Yf", descriptor = "I")
	public int anInt6750;

	@OriginalMember(owner = "client!tt", name = "wf", descriptor = "F")
	public float aFloat157;

	@OriginalMember(owner = "client!tt", name = "Of", descriptor = "I")
	private int anInt6748;

	@OriginalMember(owner = "client!tt", name = "Ig", descriptor = "I")
	private int anInt6759;

	@OriginalMember(owner = "client!tt", name = "Rf", descriptor = "Z")
	private boolean aBoolean439;

	@OriginalMember(owner = "client!tt", name = "sf", descriptor = "[F")
	private final float[] aFloatArray17;

	@OriginalMember(owner = "client!tt", name = "Cg", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!tt", name = "Vf", descriptor = "I")
	public int anInt6749;

	@OriginalMember(owner = "client!tt", name = "jf", descriptor = "I")
	private int anInt6738;

	@OriginalMember(owner = "client!tt", name = "Vg", descriptor = "I")
	private int anInt6762;

	@OriginalMember(owner = "client!tt", name = "Tg", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!tt", name = "Nf", descriptor = "I")
	public int anInt6747;

	@OriginalMember(owner = "client!tt", name = "vg", descriptor = "I")
	public int anInt6756;

	@OriginalMember(owner = "client!tt", name = "Zg", descriptor = "I")
	public int anInt6764;

	@OriginalMember(owner = "client!tt", name = "If", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!tt", name = "Lg", descriptor = "F")
	private float aFloat171;

	@OriginalMember(owner = "client!tt", name = "Wg", descriptor = "I")
	private int anInt6763;

	@OriginalMember(owner = "client!tt", name = "Qg", descriptor = "I")
	public int anInt6761;

	@OriginalMember(owner = "client!tt", name = "Se", descriptor = "Lclient!sd;")
	public Class5_Sub15_Sub1 aClass5_Sub15_Sub1_2;

	@OriginalMember(owner = "client!tt", name = "eh", descriptor = "[I")
	public int[] anIntArray464;

	@OriginalMember(owner = "client!tt", name = "bh", descriptor = "[I")
	public int[] anIntArray462;

	@OriginalMember(owner = "client!tt", name = "gh", descriptor = "[B")
	public final byte[] aByteArray86;

	@OriginalMember(owner = "client!tt", name = "ch", descriptor = "[I")
	public int[] anIntArray463;

	@OriginalMember(owner = "client!tt", name = "Zd", descriptor = "I")
	public final int anInt6710;

	@OriginalMember(owner = "client!tt", name = "bd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas6;

	@OriginalMember(owner = "client!tt", name = "yd", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!tt", name = "Ub", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!tt", name = "zd", descriptor = "J")
	private final long aLong206;

	@OriginalMember(owner = "client!tt", name = "gb", descriptor = "J")
	private long aLong205;

	@OriginalMember(owner = "client!tt", name = "Jg", descriptor = "I")
	public final int anInt6760;

	@OriginalMember(owner = "client!tt", name = "Tf", descriptor = "Z")
	public boolean aBoolean440;

	@OriginalMember(owner = "client!tt", name = "Hf", descriptor = "Z")
	private boolean aBoolean436;

	@OriginalMember(owner = "client!tt", name = "Ag", descriptor = "Z")
	public boolean aBoolean447;

	@OriginalMember(owner = "client!tt", name = "Af", descriptor = "Z")
	public boolean aBoolean432;

	@OriginalMember(owner = "client!tt", name = "Yg", descriptor = "Z")
	private boolean aBoolean453;

	@OriginalMember(owner = "client!tt", name = "bf", descriptor = "Z")
	public boolean bf;

	@OriginalMember(owner = "client!tt", name = "Gf", descriptor = "Z")
	public boolean aBoolean435;

	@OriginalMember(owner = "client!tt", name = "ng", descriptor = "Z")
	private final boolean aBoolean444;

	@OriginalMember(owner = "client!tt", name = "Td", descriptor = "Lclient!ou;")
	public final Class187 aClass187_1;

	@OriginalMember(owner = "client!tt", name = "oe", descriptor = "Lclient!kc;")
	public final Class134 aClass134_1;

	@OriginalMember(owner = "client!tt", name = "ae", descriptor = "Lclient!ut;")
	private final Class245 aClass245_1;

	@OriginalMember(owner = "client!tt", name = "de", descriptor = "Lclient!ts;")
	private Class5_Sub39_Sub1 aClass5_Sub39_Sub1_1;

	@OriginalMember(owner = "client!tt", name = "Xd", descriptor = "Lclient!ch;")
	private final Class34 aClass34_1;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;ILclient!gt;)V")
	public Class200_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class93 arg4) {
		super(arg0, arg2);
		new Class123();
		new Class252(16);
		this.aClass177_38 = new Class177();
		this.aClass177_39 = new Class177();
		this.aClass177_40 = new Class177();
		this.aClass177_41 = new Class177();
		this.aClass177_42 = new Class177();
		this.aClass177_43 = new Class177();
		this.aClass177_44 = new Class177();
		this.anInt6729 = 0;
		this.anInt6741 = 8448;
		this.aClass5_Sub19Array3 = new Class5_Sub19[Static329.anInt5080];
		this.aFloatArray18 = new float[4];
		this.aFloatArray16 = new float[16];
		this.aFloatArray19 = new float[4];
		this.anInt6751 = 50;
		this.anInt6755 = -1;
		this.aFloat156 = 1.0F;
		this.aFloat163 = 1.0F;
		this.aFloatArray20 = new float[4];
		this.anInt6739 = -1;
		this.anInt6757 = 0;
		this.anInt6745 = 0;
		this.aFloat153 = 3584.0F;
		this.anInt6728 = 0;
		this.aFloat162 = -1.0F;
		this.anInt6746 = -1;
		this.aFloat166 = 1.0F;
		this.aFloat170 = 0.0F;
		this.anInt6752 = 3584;
		this.anInt6750 = 512;
		this.aFloat157 = -1.0F;
		this.anInt6748 = 0;
		this.anInt6759 = 0;
		this.aBoolean439 = true;
		this.aFloatArray17 = new float[4];
		this.aFloat169 = 3584.0F;
		this.anInt6749 = 0;
		this.anInt6738 = 0;
		this.anInt6762 = 0;
		this.aFloat172 = 3000.0F;
		this.anInt6747 = 0;
		this.anInt6756 = -1;
		this.anInt6764 = -1;
		this.aFloat159 = 1.0F;
		this.aFloat171 = 1.0F;
		this.anInt6763 = 8448;
		this.anInt6761 = 512;
		this.aClass5_Sub15_Sub1_2 = new Class5_Sub15_Sub1(8192);
		this.anIntArray464 = new int[1];
		this.anIntArray462 = new int[1];
		this.aByteArray86 = new byte[16384];
		this.anIntArray463 = new int[1];
		this.anInt6710 = arg3;
		this.aCanvas7 = this.aCanvas6 = arg1;
		try {
			if (Static59.aBoolean92 == null || !Static59.aBoolean92) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static59.aBoolean92 = Boolean.TRUE;
				} else {
					@Pc(276) String local276 = System.getProperty("os.name").toLowerCase();
					if (!local276.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local276.startsWith("linux") || local276.startsWith("sunos")) {
						System.load(arg4.method2096("libjaggl.so").toString());
					} else if (local276.startsWith("mac")) {
						System.load(arg4.method2096("libjaggl.jnilib").toString());
					} else if (local276.startsWith("win")) {
						System.load(arg4.method2096("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static59.aBoolean92 = Boolean.TRUE;
				}
			}
			if (Static59.aBoolean92 == null || !Static59.aBoolean92) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong205 = this.aLong206 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt6710);
			if (this.aLong206 == 0L) {
				throw new RuntimeException("");
			}
			this.method5329();
			@Pc(375) int local375 = this.method5291();
			if (local375 != 0) {
				throw new RuntimeException("");
			}
			this.anInt6760 = this.aBoolean433 ? 33639 : 5121;
			@Pc(399) int local399;
			if (this.aString69.indexOf("radeon") != -1) {
				local399 = 0;
				@Pc(401) boolean local401 = false;
				@Pc(403) boolean local403 = false;
				@Pc(412) String[] local412 = Static73.method1083(' ', this.aString69.replace('/', ' '));
				for (@Pc(414) int local414 = 0; local414 < local412.length; local414++) {
					@Pc(420) String local420 = local412[local414];
					try {
						if (local420.length() > 0) {
							if (local420.charAt(0) == 'x' && local420.length() >= 3 && Static172.method2975(local420.substring(1, 3))) {
								local420 = local420.substring(1);
								local403 = true;
							}
							if (local420.equals("hd")) {
								local401 = true;
							} else {
								if (local420.startsWith("hd")) {
									local401 = true;
									local420 = local420.substring(2);
								}
								if (local420.length() >= 4 && Static172.method2975(local420.substring(0, 4))) {
									local399 = Static311.method3824(local420.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(488) Exception local488) {
					}
				}
				if (!local401 || local399 < 4000) {
					this.aBoolean440 = false;
				}
				if (!local403 && !local401) {
					if (local399 >= 7000 && local399 <= 7999) {
						this.aBoolean436 = false;
					}
					if (local399 >= 7000 && local399 <= 9250) {
						this.aBoolean447 = false;
					}
				}
				this.aBoolean432 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean453 = this.aBoolean436;
				this.bf = true;
			}
			if (this.aString70.indexOf("intel") != -1) {
				this.aBoolean435 = false;
			}
			this.aBoolean444 = !this.aString70.equals("s3 graphics");
			if (this.aBoolean436) {
				try {
					@Pc(574) int[] local574 = new int[1];
					OpenGL.glGenBuffersARB(1, local574, 0);
				} catch (@Pc(580) Throwable local580) {
					throw new RuntimeException("");
				}
			}
			Static209.method2788(true, false);
			this.aBoolean427 = true;
			this.aClass187_1 = new Class187(this, super.anInterface8_134);
			this.method5274();
			this.aClass134_1 = new Class134(this);
			this.aClass245_1 = new Class245(this);
			if (this.aClass245_1.method5526()) {
				this.aClass5_Sub39_Sub1_1 = new Class5_Sub39_Sub1(this);
				if (!this.aClass5_Sub39_Sub1_1.method5192()) {
					this.aClass5_Sub39_Sub1_1.method5190();
					this.aClass5_Sub39_Sub1_1 = null;
				}
			}
			this.aClass34_1 = new Class34(this);
			this.method5327();
			this.method5332();
			OpenGL.glClear(16640);
			local399 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(659) Exception local659) {
					if (local399++ > 5) {
						throw new RuntimeException("");
					}
					Static140.method2004(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(677) Throwable local677) {
			local677.printStackTrace();
			this.method5885();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5868(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas6) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZ)V")
	public void method5269(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean428 != arg0) {
			this.aBoolean428 = arg0;
			this.method5336();
			this.anInt6732 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZIII)V")
	public void method5270(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(IZ)V")
	public void method5271(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean442) {
			this.aBoolean442 = arg0;
			this.method5284();
			this.anInt6732 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!vm;)V")
	@Override
	public void method5872(@OriginalArg(0) Class255 arg0) {
		this.aClass250_1.method5650(arg0, this);
	}

	@OriginalMember(owner = "client!tt", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6745 = arg0;
		this.anInt6761 = arg3;
		this.anInt6729 = arg1;
		this.anInt6750 = arg2;
		this.method5346();
		this.method5335();
		if (this.anInt6730 == 3) {
			this.method5330();
		} else if (this.anInt6730 == 2) {
			this.method5309();
			return;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(FBFFF)V")
	public void method5272(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static29.aFloatArray1[0] = arg1;
		Static29.aFloatArray1[3] = arg2;
		Static29.aFloatArray1[2] = arg0;
		Static29.aFloatArray1[1] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static29.aFloatArray1, 0);
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "()V")
	@Override
	public void method5818() {
		this.aClass245_1.method5523();
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(B)V")
	private void method5273() {
		if (this.anInt6730 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt6572 > 0 && this.anInt6597 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt6572, (double) this.anInt6597, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt6730 = 1;
		this.anInt6732 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "()Z")
	@Override
	public boolean method5864() {
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(B)V")
	private void method5274() {
		this.aClass29_Sub1_3 = new Class29_Sub1();
		this.aClass29_Sub1_4 = new Class29_Sub1();
		this.aClass31Array1 = new Class31[this.anInt6744];
		this.aClass31_Sub1_3 = new Class31_Sub1(this, 3553, 6408, 1, 1);
		new Class31_Sub1(this, 3553, 6408, 1, 1);
		new Class31_Sub1(this, 3553, 6408, 1, 1);
		this.aClass57_Sub2_7 = new Class57_Sub2(this);
		this.aClass57_Sub2_10 = new Class57_Sub2(this);
		this.aClass57_Sub2_3 = new Class57_Sub2(this);
		this.aClass57_Sub2_5 = new Class57_Sub2(this);
		this.aClass57_Sub2_2 = new Class57_Sub2(this);
		this.aClass57_Sub2_9 = new Class57_Sub2(this);
		this.aClass57_Sub2_6 = new Class57_Sub2(this);
		this.aClass57_Sub2_1 = new Class57_Sub2(this);
		this.aClass57_Sub2_8 = new Class57_Sub2(this);
		this.aClass57_Sub2_4 = new Class57_Sub2(this);
		if (this.aBoolean435) {
			this.aClass11_3 = new Class11(this);
			new Class11(this);
		}
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt6751 && arg1 == this.anInt6752) {
			return;
		}
		this.anInt6752 = arg1;
		this.anInt6751 = arg0;
		this.method5346();
		this.method5316();
		if (this.anInt6730 == 3) {
			this.method5330();
		} else if (this.anInt6730 == 2) {
			this.method5309();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class49 method5855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class49_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "()Z")
	@Override
	public boolean method5873() {
		return false;
	}

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "(I)V")
	public void method5275() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!tt", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt6751;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method5342();
		this.method5295(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean430) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean430) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!tt", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(6) int local6 = this.anInt6766;
		this.anInt6766 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "()Z")
	@Override
	public boolean method5835() {
		return this.aBoolean430 && (!this.method5839() || this.aBoolean431);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)V")
	public synchronized void method5276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub34 local8 = new Class5_Sub34(arg1);
		local8.aLong234 = arg0;
		this.aClass177_39.method3615(local8);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!un;B)V")
	public void method5277(@OriginalArg(0) Interface13 arg0) {
		if (this.anInt6723 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6723 >= 0) {
			this.anInterface13Array1[this.anInt6723].method184();
		}
		this.anInterface13_1 = this.anInterface13Array1[++this.anInt6723] = arg0;
		this.anInterface13_1.method186();
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(B)V")
	private void method5278() {
		OpenGL.glViewport(this.anInt6738, this.anInt6759, this.anInt6572, this.anInt6597);
	}

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "(I)V")
	private void method5279() {
		if (this.aFloat173 == (float) 0) {
			this.aFloatArray16[10] = this.aFloat155;
			this.aFloatArray16[14] = this.aFloat160;
		} else {
			@Pc(28) float local28 = this.aFloat172 / (this.aFloat172 + this.aFloat173);
			@Pc(32) float local32 = local28 * local28;
			@Pc(47) float local47 = (1.0F - local28) * (1.0F - local28) * -this.aFloat160 / this.aFloat173;
			this.aFloatArray16[10] = this.aFloat155 + local47;
			this.aFloatArray16[14] = local32 * this.aFloat160;
		}
		this.aFloat169 = ((float) -this.anInt6752 + this.aFloatArray16[14]) / this.aFloatArray16[10];
		this.aFloat153 = (float) this.anInt6752 - this.aFloat173;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIB)V")
	public synchronized void method5280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub34 local8 = new Class5_Sub34(arg1);
		local8.aLong234 = arg0;
		this.aClass177_42.method3615(local8);
	}

	@OriginalMember(owner = "client!tt", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 > this.anInt6597) {
			arg3 = this.anInt6597;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt6572 < arg2) {
			arg2 = this.anInt6572;
		}
		this.anInt6728 = arg3;
		this.anInt6748 = arg1;
		this.anInt6757 = arg0;
		this.anInt6762 = arg2;
		OpenGL.glEnable(3089);
		this.method5335();
		this.method5333();
	}

	@OriginalMember(owner = "client!tt", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = (float) arg2 * this.aClass29_Sub1_3.aFloat60 + this.aClass29_Sub1_3.aFloat51 * (float) arg0 + (float) arg1 * this.aClass29_Sub1_3.aFloat53 + this.aClass29_Sub1_3.aFloat54;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = (float) arg3 * this.aClass29_Sub1_3.aFloat51 + this.aClass29_Sub1_3.aFloat53 * (float) arg4 + this.aClass29_Sub1_3.aFloat60 * (float) arg5 + this.aClass29_Sub1_3.aFloat54;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt6751 > local28 && local59 < (float) this.anInt6751 || !(!((float) this.anInt6752 < local28) || !(local59 > (float) this.anInt6752))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt6750 * (this.aClass29_Sub1_3.aFloat52 + this.aClass29_Sub1_3.aFloat55 * (float) arg2 + (float) arg1 * this.aClass29_Sub1_3.aFloat58 + (float) arg0 * this.aClass29_Sub1_3.aFloat57) / local28);
		@Pc(155) int local155 = (int) ((this.aClass29_Sub1_3.aFloat55 * (float) arg5 + this.aClass29_Sub1_3.aFloat57 * (float) arg3 + (float) arg4 * this.aClass29_Sub1_3.aFloat58 + this.aClass29_Sub1_3.aFloat52) * (float) this.anInt6750 / local59);
		if ((float) local123 < this.aFloat161 && (float) local155 < this.aFloat161 || this.aFloat168 < (float) local123 && this.aFloat168 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass29_Sub1_3.aFloat49 * (float) arg2 + (float) arg1 * this.aClass29_Sub1_3.aFloat59 + this.aClass29_Sub1_3.aFloat56 * (float) arg0 + this.aClass29_Sub1_3.aFloat50) * (float) this.anInt6761 / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt6761 * (this.aClass29_Sub1_3.aFloat50 + (float) arg4 * this.aClass29_Sub1_3.aFloat59 + this.aClass29_Sub1_3.aFloat56 * (float) arg3 + (float) arg5 * this.aClass29_Sub1_3.aFloat49) / local59);
			return (!((float) local213 < this.aFloat165) || !((float) local245 < this.aFloat165)) && (!((float) local213 > this.aFloat164) || !((float) local245 > this.aFloat164));
		}
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(Z)V")
	@Override
	public void method5863(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIZ)V")
	public void method5281(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method5306(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ap;[Lclient!rr;Z)Lclient!la;")
	@Override
	public Class23 method5837(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class214[] arg1) {
		return new Class23_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!bn;)V")
	@Override
	public void method5826(@OriginalArg(0) Class24 arg0) {
		this.aClass24_Sub1_1 = (Class24_Sub1) arg0;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "()V")
	@Override
	public void method5813() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "(I)V")
	public void method5283() {
		if (this.anInt6732 == 4) {
			return;
		}
		this.method5273();
		this.method5338(false);
		this.method5271(false);
		this.method5302(false);
		this.method5269(false);
		this.method5288(-2);
		this.method5295(1);
		this.method5297(0);
		this.anInt6732 = 4;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5840(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas6) {
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

	@OriginalMember(owner = "client!tt", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(Z)V")
	private void method5284() {
		if (this.aBoolean442 && !this.aBoolean438) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!tt", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt6597 - arg1 - local12, arg2, 1, 32993, this.anInt6760, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!gl;I)V")
	public void method5285(@OriginalArg(0) Class29_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method1963(), 0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)Lclient!n;")
	@Override
	public Class5_Sub28 method5817(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub28_Sub1 local8 = new Class5_Sub28_Sub1(arg0);
		this.aClass177_37.method3615(local8);
		return local8;
	}

	@OriginalMember(owner = "client!tt", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt6755 != arg0;
		if (local15 || this.aFloat157 != arg1 || arg2 != this.aFloat162) {
			this.aFloat157 = arg1;
			this.anInt6755 = arg0;
			this.aFloat162 = arg2;
			if (local15) {
				this.aFloat156 = (float) (this.anInt6755 & 0xFF) / 255.0F;
				this.aFloat163 = (float) (this.anInt6755 & 0xFF0000) / 1.671168E7F;
				this.aFloat159 = (float) (this.anInt6755 & 0xFF00) / 65280.0F;
				this.method5315();
			}
			this.method5317();
		}
		if (this.aFloatArray20[0] == arg3 && this.aFloatArray20[1] == arg4 && this.aFloatArray20[2] == arg5) {
			return;
		}
		this.aFloatArray20[1] = arg4;
		this.aFloatArray20[2] = arg5;
		this.aFloatArray20[0] = arg3;
		this.aFloatArray18[1] = -arg4;
		this.aFloatArray18[0] = -arg3;
		this.aFloatArray18[2] = -arg5;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray19[2] = local142 * arg5;
		this.aFloatArray19[1] = local142 * arg4;
		this.aFloatArray19[0] = local142 * arg3;
		this.aFloatArray17[2] = -this.aFloatArray19[2];
		this.aFloatArray17[1] = -this.aFloatArray19[1];
		this.aFloatArray17[0] = -this.aFloatArray19[0];
		this.method5337();
		this.anInt6737 = (int) (arg5 * 256.0F / arg4);
		this.anInt6731 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IF)V")
	public void method5286(@OriginalArg(1) float arg0) {
		if (arg0 == this.aFloat171) {
			return;
		}
		this.aFloat171 = arg0;
		if (this.anInt6730 == 3) {
			this.method5330();
			return;
		}
	}

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "(I)V")
	public void method5287() {
		if (this.anInt6732 == 8) {
			return;
		}
		this.method5290();
		this.method5338(true);
		this.method5302(true);
		this.method5269(true);
		this.method5295(1);
		this.method5297(0);
		this.anInt6732 = 8;
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(II)V")
	public void method5288(@OriginalArg(1) int arg0) {
		this.method5281(arg0, true);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V")
	@Override
	public void method5819(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "(I)V")
	private void method5289() {
		if (this.aBoolean449 && this.aBoolean452 | this.anInt6746 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!tt", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		if (this.aFloat154 != arg0) {
			this.aFloat154 = arg0;
			this.method5315();
		}
	}

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "()I")
	@Override
	public int method5852() {
		return 4;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!e;Lclient!vm;Lclient!c;Lclient!wg;I)V")
	@Override
	public void method5869(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) Class88_Sub8 arg3) {
		arg0.method6060(arg2, arg3, 0);
		this.method5872(arg1);
	}

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "(I)V")
	private void method5290() {
		if (this.anInt6730 != 2) {
			this.anInt6730 = 2;
			this.method5309();
			this.method5344();
			this.anInt6732 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!bn;Lclient!bn;FLclient!bn;)Lclient!bn;")
	@Override
	public Class24 method5823(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class24 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean443 && this.aBoolean435) {
			@Pc(15) Class24_Sub1_Sub1 local15 = null;
			@Pc(18) Class24_Sub1 local18 = (Class24_Sub1) arg0;
			@Pc(21) Class24_Sub1 local21 = (Class24_Sub1) arg1;
			@Pc(25) Class31_Sub4 local25 = local18.method3334();
			@Pc(29) Class31_Sub4 local29 = local21.method3334();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt5796 < local25.anInt5796 ? local25.anInt5796 : local29.anInt5796;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class24_Sub1_Sub1) {
					@Pc(56) Class24_Sub1_Sub1 local56 = (Class24_Sub1_Sub1) arg3;
					if (local44 == local56.method2350()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class24_Sub1_Sub1(this, local44);
				}
				if (local15.method2351(local25, arg2, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "(B)I")
	private int method5291() {
		@Pc(5) int local5 = 0;
		this.aString70 = OpenGL.glGetString(7936).toLowerCase();
		this.aString69 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString70.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString70.indexOf("brian paul") != -1 || this.aString70.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static73.method1083(' ', local45.replace('.', ' '));
		if (local53.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(69) int local69 = Static311.method3824(local53[0]);
				@Pc(75) int local75 = Static311.method3824(local53[1]);
				this.anInt6736 = local75 + local69 * 10;
			} catch (@Pc(84) NumberFormatException local84) {
				local5 |= 0x4;
			}
		}
		if (this.anInt6736 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(120) int[] local120 = new int[1];
		OpenGL.glGetIntegerv(34018, local120, 0);
		this.anInt6744 = local120[0];
		OpenGL.glGetIntegerv(34929, local120, 0);
		this.anInt6734 = local120[0];
		OpenGL.glGetIntegerv(34930, local120, 0);
		this.anInt6742 = local120[0];
		if (this.anInt6744 < 2 || this.anInt6734 < 2 || this.anInt6742 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean433 = NativeStream.b();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean436 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean430 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean446 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean450 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean441 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean447 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean432 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean443 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean440 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean429 = false;
		this.aBoolean435 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean448 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean437 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean431 = this.aBoolean437 & this.aBoolean448;
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "()Z")
	@Override
	public boolean method5844() {
		if (this.aClass5_Sub39_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass5_Sub39_Sub1_1.method5182()) {
			if (!this.aClass245_1.method5531(this.aClass5_Sub39_Sub1_1)) {
				return false;
			}
			this.aClass187_1.method3821();
		}
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "(Z)Lclient!rh;")
	public Class31_Sub4 method5292() {
		return this.aClass24_Sub1_1 == null ? null : this.aClass24_Sub1_1.method3334();
	}

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "(B)V")
	public void method5293() {
		if (this.anInt6732 == 16) {
			return;
		}
		this.method5322();
		this.method5338(true);
		this.method5302(true);
		this.method5269(true);
		this.method5295(1);
		this.method5297(0);
		this.anInt6732 = 16;
	}

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "()Z")
	@Override
	public boolean method5862() {
		return this.aClass5_Sub39_Sub1_1 != null && (this.anInt6710 <= 1 || this.aBoolean431);
	}

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "(I)V")
	private void method5294() {
		if (this.aBoolean454) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean454 = false;
		}
	}

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "()Z")
	@Override
	public boolean method5832() {
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5822(@OriginalArg(0) Class5_Sub28 arg0) {
		this.aNativeHeap2 = ((Class5_Sub28_Sub1) arg0).aNativeHeap1;
		if (this.anInterface12_5 != null) {
			return;
		}
		@Pc(16) Class5_Sub15_Sub1 local16 = new Class5_Sub15_Sub1(80);
		if (this.aBoolean433) {
			local16.method4831(-1.0F);
			local16.method4831(-1.0F);
			local16.method4831(0.0F);
			local16.method4831(0.0F);
			local16.method4831(1.0F);
			local16.method4831(1.0F);
			local16.method4831(-1.0F);
			local16.method4831(0.0F);
			local16.method4831(1.0F);
			local16.method4831(1.0F);
			local16.method4831(1.0F);
			local16.method4831(1.0F);
			local16.method4831(0.0F);
			local16.method4831(1.0F);
			local16.method4831(0.0F);
			local16.method4831(-1.0F);
			local16.method4831(1.0F);
			local16.method4831(0.0F);
			local16.method4831(0.0F);
			local16.method4831(0.0F);
		} else {
			local16.method4833(-1.0F);
			local16.method4833(-1.0F);
			local16.method4833(0.0F);
			local16.method4833(0.0F);
			local16.method4833(1.0F);
			local16.method4833(1.0F);
			local16.method4833(-1.0F);
			local16.method4833(0.0F);
			local16.method4833(1.0F);
			local16.method4833(1.0F);
			local16.method4833(1.0F);
			local16.method4833(1.0F);
			local16.method4833(0.0F);
			local16.method4833(1.0F);
			local16.method4833(0.0F);
			local16.method4833(-1.0F);
			local16.method4833(1.0F);
			local16.method4833(0.0F);
			local16.method4833(0.0F);
			local16.method4833(0.0F);
		}
		this.anInterface12_5 = this.method5298(local16.aByteArray93, false, 20, local16.anInt7013);
		this.aClass195_12 = new Class195(this.anInterface12_5, 5126, 3, 0);
		this.aClass195_13 = new Class195(this.anInterface12_5, 5126, 2, 12);
		this.aClass250_1.method5648(this);
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(II)V")
	public void method5295(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt6753) {
			return;
		}
		@Pc(12) boolean local12;
		@Pc(14) byte local14;
		if (arg0 == 1) {
			local12 = true;
			local14 = 1;
		} else if (arg0 == 2) {
			local14 = 2;
			local12 = false;
		} else if (arg0 == 128) {
			local14 = 3;
			local12 = true;
		} else {
			local14 = 0;
			local12 = false;
		}
		if (!this.aBoolean434) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean434 = true;
		}
		if (this.aBoolean451 != local12) {
			if (local12) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean451 = local12;
		}
		if (this.anInt6758 != local14) {
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
			this.anInt6758 = local14;
		}
		this.anInt6753 = arg0;
		this.anInt6732 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.aBoolean452 = false;
		this.aClass34_1.method797(false, false, 0, 0, 0);
		this.method5316();
		this.method5289();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(FBFF)V")
	private void method5296(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean454) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean454 = true;
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "(II)V")
	public void method5297(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method5304(7681, 7681);
		} else if (arg0 == 0) {
			this.method5304(8448, 8448);
		} else if (arg0 == 2) {
			this.method5304(34165, 7681);
		} else if (arg0 == 3) {
			this.method5304(260, 8448);
			return;
		} else if (arg0 == 4) {
			this.method5304(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([BZIII)Lclient!ql;")
	public Interface12 method5298(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return (Interface12) (this.aBoolean436 && (!arg1 || this.aBoolean453) ? new Class69_Sub2(this, arg2, arg0, arg3, arg1) : new Class15_Sub2(this, arg2, arg0, arg3));
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class97 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class97_Sub2 local6 = (Class97_Sub2) arg5;
		@Pc(9) Class31_Sub1_Sub1 local9 = local6.aClass31_Sub1_Sub1_1;
		this.method5321();
		this.method5312(local6.aClass31_Sub1_Sub1_1);
		this.method5295(1);
		this.method5304(7681, 8448);
		this.method5343(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat39 / (float) local9.anInt1876;
		@Pc(46) float local46 = local9.aFloat38 / (float) local9.anInt1877;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method5343(768, 5890, 0);
	}

	@OriginalMember(owner = "client!tt", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(37) float local37;
		if (this.aClass31_Sub1_Sub1_2 == null || this.aClass31_Sub1_Sub1_2.anInt1864 < arg2 || this.aClass31_Sub1_Sub1_2.anInt1865 < arg3) {
			this.aClass31_Sub1_Sub1_2 = Static21.method353(this, arg3, arg6, arg2);
			this.aClass31_Sub1_Sub1_2.method1520(false, false);
			local37 = this.aClass31_Sub1_Sub1_2.aFloat39;
			local41 = this.aClass31_Sub1_Sub1_2.aFloat38;
		} else {
			this.aClass31_Sub1_Sub1_2.method1525(arg3, arg6, 6406, arg2, false);
			local37 = this.aClass31_Sub1_Sub1_2.aFloat39 * (float) arg2 / (float) this.aClass31_Sub1_Sub1_2.anInt1864;
			local41 = this.aClass31_Sub1_Sub1_2.aFloat38 * (float) arg3 / (float) this.aClass31_Sub1_Sub1_2.anInt1865;
		}
		this.method5321();
		this.method5312(this.aClass31_Sub1_Sub1_2);
		this.method5295(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5308(arg5);
		this.method5304(34165, 34165);
		this.method5343(768, 34166, 0);
		this.method5343(770, 5890, 2);
		this.method5341(34166, 0);
		this.method5341(5890, 2);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = local143 + (float) arg2;
		@Pc(156) float local156 = local146 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local37);
		OpenGL.glVertex2f(local143, local156);
		OpenGL.glTexCoord2f(local41, local37);
		OpenGL.glVertex2f(local151, local156);
		OpenGL.glTexCoord2f(local41, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method5343(768, 5890, 0);
		this.method5343(770, 34166, 2);
		this.method5341(5890, 0);
		this.method5341(34166, 2);
	}

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "()Z")
	@Override
	public boolean method5839() {
		return this.aClass5_Sub39_Sub1_1 != null && this.aClass5_Sub39_Sub1_1.method5182();
	}

	@OriginalMember(owner = "client!tt", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt6764 && arg1 == this.anInt6746 && this.anInt6747 == arg2) {
			return;
		}
		this.anInt6746 = arg1;
		this.anInt6747 = arg2;
		this.anInt6764 = arg0;
		if (!this.aBoolean452) {
			this.method5316();
			this.method5289();
		}
	}

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "(II)I")
	public int method5299(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lclient!un;B)V")
	public void method5300(@OriginalArg(0) Interface13 arg0) {
		if (this.anInt6723 < 0 || this.anInterface13Array1[this.anInt6723] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface13Array1[this.anInt6723--] = null;
		arg0.method184();
		if (this.anInt6723 >= 0) {
			this.anInterface13_1 = this.anInterface13Array1[this.anInt6723];
			this.anInterface13_1.method186();
		} else {
			this.anInterface13_1 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(ZI)V")
	public void method5301(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean438) {
			this.aBoolean438 = arg0;
			this.method5284();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BZ)V")
	public void method5302(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean445) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt6732 &= 0xFFFFFFE0;
		this.aBoolean445 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BII)V")
	public synchronized void method5303(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class5_Sub34 local15 = new Class5_Sub34(arg0);
		local15.aLong234 = arg1;
		this.aClass177_40.method3615(local15);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBI)V")
	public void method5304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6743 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt6763 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt6763 = arg0;
			local11 = true;
		}
		if (arg1 != this.anInt6741) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt6741 = arg1;
			local11 = true;
		}
		if (local11) {
			this.anInt6732 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!tt", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt6762 = this.anInt6572;
		this.anInt6728 = this.anInt6597;
		this.anInt6748 = 0;
		this.anInt6757 = 0;
		OpenGL.glDisable(3089);
		this.method5335();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean452) {
			throw new RuntimeException("");
		}
		this.anInt6735 = arg0;
		this.anInt6749 = arg3;
		this.anInt6756 = arg2;
		this.anInt6739 = arg1;
		this.aClass34_1.aClass16_Sub2_1.method475();
		this.method5316();
	}

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt6752;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BI)V")
	public synchronized void method5305(@OriginalArg(1) int arg0) {
		@Pc(7) Class5 local7 = new Class5();
		local7.aLong234 = arg0;
		this.aClass177_43.method3615(local7);
	}

	@OriginalMember(owner = "client!tt", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5342();
		this.method5295(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "()Z")
	@Override
	public boolean method5853() {
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZIZ)V")
	public void method5306(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt6740 != arg1) {
			if (arg1 < 0) {
				this.method5294();
				this.method5312(null);
				this.method5297(0);
				if (!this.aBoolean452) {
					this.aClass34_1.method797(arg0, arg2, 0, 0, 0);
				}
			} else {
				@Pc(26) Class31_Sub1 local26 = this.aClass187_1.method3823(arg1);
				@Pc(34) Class178 local34 = super.anInterface8_134.method4125(arg1);
				if (local34.aByte54 == 0 && local34.aByte50 == 0) {
					this.method5294();
				} else {
					@Pc(55) int local55 = local34.aBoolean324 ? 64 : 128;
					@Pc(59) int local59 = local55 * 50;
					this.method5296((float) (this.anInt6720 % local59 * local34.aByte50) / (float) local59, 0.0F, (float) (local34.aByte54 * (this.anInt6720 % local59)) / (float) local59);
				}
				if (this.aBoolean452) {
					this.method5312(local26);
					this.method5297(local34.anInt4614);
				} else {
					this.aClass34_1.method797(arg0, arg2, local34.aByte55, local34.anInt4620, local34.aByte56);
					if (!this.aClass34_1.method799(local34.anInt4614, local26)) {
						this.method5312(local26);
						this.method5297(local34.anInt4614);
					}
				}
			}
			this.anInt6740 = arg1;
		}
		this.anInt6732 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!tt", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class97_Sub2 local6 = (Class97_Sub2) arg1;
		@Pc(9) Class31_Sub1_Sub1 local9 = local6.aClass31_Sub1_Sub1_1;
		this.method5321();
		this.method5312(local6.aClass31_Sub1_Sub1_1);
		this.method5295(1);
		this.method5304(7681, 8448);
		this.method5343(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat39 / (float) local9.anInt1876;
		@Pc(46) float local46 = local9.aFloat38 / (float) local9.anInt1877;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt6757 - arg2) * local39, (float) (this.anInt6748 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6757, this.anInt6748);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6757 - arg2), (float) (this.anInt6728 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6757, this.anInt6728);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6762 - arg2), (float) (this.anInt6728 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6762, this.anInt6728);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6762 - arg2), (float) (this.anInt6748 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6762, this.anInt6748);
		OpenGL.glEnd();
		this.method5343(768, 5890, 0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IB)I")
	public int method5307(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "(II)V")
	public void method5308(@OriginalArg(0) int arg0) {
		Static29.aFloatArray1[3] = (float) (arg0 >>> 24) / 255.0F;
		Static29.aFloatArray1[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static29.aFloatArray1[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static29.aFloatArray1[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static29.aFloatArray1, 0);
	}

	@OriginalMember(owner = "client!tt", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat172;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5831(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas6) {
			local5 = this.aLong206;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas7) {
			this.method5332();
		}
	}

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "(Z)V")
	private void method5309() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray16, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLclient!gl;)V")
	public void method5310(@OriginalArg(1) Class29_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method1963(), 0);
	}

	@OriginalMember(owner = "client!tt", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method5342();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method5295(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean430) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean430) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5828() {
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method5854(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class5_Sub34 local19;
		while (!this.aClass177_39.method3616()) {
			local19 = (Class5_Sub34) this.aClass177_39.method3621();
			Static442.anIntArray492[local11++] = (int) local19.aLong234;
			this.anInt6725 -= local19.anInt5642;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static442.anIntArray492, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static442.anIntArray492, 0);
			local11 = 0;
		}
		while (!this.aClass177_40.method3616()) {
			local19 = (Class5_Sub34) this.aClass177_40.method3621();
			Static442.anIntArray492[local11++] = (int) local19.aLong234;
			this.anInt6727 -= local19.anInt5642;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static442.anIntArray492, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static442.anIntArray492, 0);
			local11 = 0;
		}
		while (!this.aClass177_41.method3616()) {
			local19 = (Class5_Sub34) this.aClass177_41.method3621();
			Static442.anIntArray492[local11++] = local19.anInt5642;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static442.anIntArray492, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static442.anIntArray492, 0);
			local11 = 0;
		}
		while (!this.aClass177_42.method3616()) {
			local19 = (Class5_Sub34) this.aClass177_42.method3621();
			Static442.anIntArray492[local11++] = (int) local19.aLong234;
			this.anInt6726 -= local19.anInt5642;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static442.anIntArray492, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static442.anIntArray492, 0);
		}
		while (!this.aClass177_38.method3616()) {
			local19 = (Class5_Sub34) this.aClass177_38.method3621();
			OpenGL.glDeleteLists((int) local19.aLong234, local19.anInt5642);
		}
		@Pc(217) Class5 local217;
		while (!this.aClass177_43.method3616()) {
			local217 = this.aClass177_43.method3621();
			OpenGL.glDeleteProgramARB((int) local217.aLong234);
		}
		while (!this.aClass177_44.method3616()) {
			local217 = this.aClass177_44.method3621();
			OpenGL.glDeleteObjectARB(local217.aLong234);
		}
		while (!this.aClass177_38.method3616()) {
			local19 = (Class5_Sub34) this.aClass177_38.method3621();
			OpenGL.glDeleteLists((int) local19.aLong234, local19.anInt5642);
		}
		this.aClass187_1.method3825();
		if (this.pa() > 100663296 && Static446.method5903() > this.aLong207 + 60000L) {
			System.gc();
			this.aLong207 = Static446.method5903();
		}
		this.anInt6720 = local9;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass245_1.method5527(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!pp;Lclient!pp;Lclient!pp;ILclient!pp;)V")
	public void method5311(@OriginalArg(0) Class195 arg0, @OriginalArg(1) Class195 arg1, @OriginalArg(2) Class195 arg2, @OriginalArg(4) Class195 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5348(arg3.anInterface12_3);
			OpenGL.glVertexPointer(arg3.aByte61, arg3.aShort58, this.anInterface12_6.method5509(), this.anInterface12_6.method5508() + (long) arg3.aByte60);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5348(arg2.anInterface12_3);
			OpenGL.glNormalPointer(arg2.aShort58, this.anInterface12_6.method5509(), this.anInterface12_6.method5508() + (long) arg2.aByte60);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5348(arg0.anInterface12_3);
			OpenGL.glColorPointer(arg0.aByte61, arg0.aShort58, this.anInterface12_6.method5509(), this.anInterface12_6.method5508() + (long) arg0.aByte60);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5348(arg1.anInterface12_3);
			OpenGL.glTexCoordPointer(arg1.aByte61, arg1.aShort58, this.anInterface12_6.method5509(), this.anInterface12_6.method5508() + (long) arg1.aByte60);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!in;)V")
	public void method5312(@OriginalArg(1) Class31 arg0) {
		@Pc(15) Class31 local15 = this.aClass31Array1[this.anInt6743];
		if (local15 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local15.anInt5787);
			} else {
				if (local15 == null) {
					OpenGL.glEnable(arg0.anInt5787);
				} else if (local15.anInt5787 != arg0.anInt5787) {
					OpenGL.glDisable(local15.anInt5787);
					OpenGL.glEnable(arg0.anInt5787);
				}
				OpenGL.glBindTexture(arg0.anInt5787, arg0.method4584());
			}
			this.aClass31Array1[this.anInt6743] = arg0;
		}
		this.anInt6732 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!tt", name = "B", descriptor = "()V")
	@Override
	public void method5887() {
		if (this.aClass5_Sub39_Sub1_1 != null && this.aClass5_Sub39_Sub1_1.method5182()) {
			this.aClass245_1.method5522(this.aClass5_Sub39_Sub1_1);
			this.aClass187_1.method3821();
		}
	}

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "()V")
	@Override
	protected void method5885() {
		for (@Pc(6) Class5 local6 = this.aClass177_37.method3618(); local6 != null; local6 = this.aClass177_37.method3619()) {
			((Class5_Sub28_Sub1) local6).method3667();
		}
		if (this.aClass245_1 != null) {
			this.aClass245_1.method5529();
		}
		if (this.anOpenGL1 != null) {
			this.method5340();
			@Pc(40) Enumeration local40 = this.aHashtable2.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable2.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean427) {
			Static356.method4615(false, true);
			this.aBoolean427 = false;
		}
	}

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "()V")
	@Override
	public void method5829() {
		if (!this.aBoolean444 || this.anInt6572 <= 0 || this.anInt6597 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt6757;
		@Pc(22) int local22 = this.anInt6762;
		@Pc(25) int local25 = this.anInt6748;
		@Pc(28) int local28 = this.anInt6728;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5347();
		this.method5338(false);
		this.method5271(false);
		this.method5302(false);
		this.method5269(false);
		this.method5312(null);
		this.method5288(-2);
		this.method5297(1);
		this.method5295(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt6572, this.anInt6597, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ba(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!tt", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat172 == arg0 && arg1 == this.aFloat173) {
			return;
		}
		this.aFloat172 = arg0;
		this.aFloat173 = arg1;
		this.method5279();
		if (this.anInt6730 == 3) {
			this.method5330();
		} else if (this.anInt6730 == 2) {
			this.method5309();
			return;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(JI)V")
	public synchronized void method5313(@OriginalArg(0) long arg0) {
		@Pc(7) Class5 local7 = new Class5();
		local7.aLong234 = arg0;
		this.aClass177_44.method3615(local7);
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)V")
	@Override
	public void method5848(@OriginalArg(0) int arg0) {
		this.method5340();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(FIF)V")
	public void method5314(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat170 = arg1;
		this.aFloat166 = arg0;
		if (!this.aBoolean452) {
			this.method5316();
		}
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5342();
		this.method5295(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "()Lclient!c;")
	@Override
	public Class29 method5880() {
		return new Class29_Sub1();
	}

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "(I)V")
	private void method5315() {
		Static29.aFloatArray1[0] = this.aFloat154 * this.aFloat163;
		Static29.aFloatArray1[2] = this.aFloat156 * this.aFloat154;
		Static29.aFloatArray1[1] = this.aFloat154 * this.aFloat159;
		Static29.aFloatArray1[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static29.aFloatArray1, 0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIF)Lclient!rd;")
	@Override
	public Class5_Sub19 method5858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub19_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "()V")
	@Override
	public void method5883() {
	}

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "()V")
	@Override
	public void method5881() {
		this.method5269(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "()Z")
	@Override
	public boolean method5833() {
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "(I)V")
	private void method5316() {
		@Pc(15) int local15;
		if (this.aBoolean452) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt6739;
		} else {
			this.aFloat167 = (float) (this.anInt6752 - this.anInt6747) - this.aFloat170;
			this.aFloat158 = this.aFloat167 - this.aFloat166 * (float) this.anInt6746;
			if ((float) this.anInt6751 > this.aFloat158) {
				this.aFloat158 = this.anInt6751;
			}
			OpenGL.glFogf(2915, this.aFloat158);
			OpenGL.glFogf(2916, this.aFloat167);
			local15 = this.anInt6764;
		}
		Static29.aFloatArray1[2] = (float) (local15 & 0xFF) / 255.0F;
		Static29.aFloatArray1[1] = (float) (local15 & 0xFF00) / 65280.0F;
		Static29.aFloatArray1[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static29.aFloatArray1, 0);
		if (this.aBoolean452) {
			this.aClass34_1.aClass16_Sub2_1.method480();
		}
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5878(@OriginalArg(0) Canvas arg0) {
		this.aLong205 = 0L;
		this.aCanvas7 = null;
		if (arg0 == null || arg0 == this.aCanvas6) {
			this.aLong205 = this.aLong206;
			this.aCanvas7 = this.aCanvas6;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable2.get(arg0);
			this.aLong205 = local36;
			this.aCanvas7 = arg0;
		}
		if (this.aCanvas7 == null || this.aLong205 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong205);
		this.method5332();
	}

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean452 = true;
		this.anInt6739 = arg1;
		this.anInt6749 = arg3;
		this.anInt6756 = arg2;
		this.anInt6735 = arg0;
		this.aClass34_1.method797(false, false, 3, 0, 0);
		this.aClass34_1.aClass16_Sub2_1.method475();
		this.method5316();
		this.method5289();
	}

	@OriginalMember(owner = "client!tt", name = "A", descriptor = "()Z")
	@Override
	public boolean method5886() {
		return false;
	}

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "(B)V")
	private void method5317() {
		Static29.aFloatArray1[0] = this.aFloat157 * this.aFloat163;
		Static29.aFloatArray1[2] = this.aFloat157 * this.aFloat156;
		Static29.aFloatArray1[3] = 1.0F;
		Static29.aFloatArray1[1] = this.aFloat159 * this.aFloat157;
		OpenGL.glLightfv(16384, 4609, Static29.aFloatArray1, 0);
		Static29.aFloatArray1[1] = -this.aFloat162 * this.aFloat159;
		Static29.aFloatArray1[3] = 1.0F;
		Static29.aFloatArray1[2] = this.aFloat156 * -this.aFloat162;
		Static29.aFloatArray1[0] = this.aFloat163 * -this.aFloat162;
		OpenGL.glLightfv(16385, 4609, Static29.aFloatArray1, 0);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(Z)V")
	@Override
	public void method5859(@OriginalArg(0) boolean arg0) {
		this.aBoolean439 = arg0;
		this.method5336();
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(III)V")
	public void method5318(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6759 = arg0;
		this.anInt6738 = arg1;
		this.method5278();
		this.method5333();
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(IIIIII)Lclient!bn;")
	@Override
	public Class24 method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean443 ? new Class24_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "(II)V")
	public void method5319(@OriginalArg(0) int arg0) {
		if (this.anInt6743 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt6743 = arg0;
		}
	}

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "(B)V")
	public void method5320() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "()Z")
	@Override
	public boolean method5816() {
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "(B)V")
	public void method5321() {
		if (this.anInt6732 == 2) {
			return;
		}
		this.method5273();
		this.method5338(false);
		this.method5271(false);
		this.method5302(false);
		this.method5269(false);
		this.method5288(-2);
		this.anInt6732 = 2;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([Lclient!e;Lclient!vm;Lclient!c;[Lclient!wg;I)V")
	@Override
	public void method5874(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) Class88_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method5843(arg0, arg2, arg3, arg4);
		this.method5872(arg1);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I[Lclient!rd;)V")
	@Override
	public void method5846(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass5_Sub19Array3[local3] = arg1[local3];
		}
		this.anInt6733 = arg0;
		if (this.anInt6730 != 1) {
			this.method5323();
		}
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "(I)V")
	@Override
	public void method5884(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt6708 = arg0;
		this.aClass187_1.method3821();
	}

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "(I)V")
	private void method5322() {
		if (this.anInt6730 != 3) {
			this.anInt6730 = 3;
			this.method5330();
			this.method5344();
			this.anInt6732 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "(B)V")
	private void method5323() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt6733; local7++) {
			@Pc(20) Class5_Sub19 local20 = this.aClass5_Sub19Array3[local7];
			@Pc(24) int local24 = local7 + 16386;
			Static277.aFloatArray9[0] = local20.method4977();
			Static277.aFloatArray9[1] = local20.method4981();
			Static277.aFloatArray9[2] = local20.method4979();
			Static277.aFloatArray9[3] = 1.0F;
			OpenGL.glLightfv(local24, 4611, Static277.aFloatArray9, 0);
			@Pc(58) int local58 = local20.method4975();
			@Pc(64) float local64 = local20.method4974() / 255.0F;
			Static277.aFloatArray9[2] = local64 * (float) (local58 & 0xFF);
			Static277.aFloatArray9[0] = (float) (local58 >> 16 & 0xFF) * local64;
			Static277.aFloatArray9[1] = local64 * (float) (local58 >> 8 & 0xFF);
			OpenGL.glLightfv(local24, 4609, Static277.aFloatArray9, 0);
			OpenGL.glLightf(local24, 4617, 1.0F / (float) (local20.method4982() * local20.method4982()));
			OpenGL.glEnable(local24);
		}
		while (local7 < this.anInt6754) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt6754 = this.anInt6733;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZIB[B)Lclient!fp;")
	public Interface5 method5324(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface5) (this.aBoolean436 && (!arg1 || this.aBoolean453) ? new Class69_Sub1(this, 5123, arg2, arg0, arg1) : new Class15_Sub1(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "()Z")
	@Override
	public boolean method5821() {
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "()Z")
	@Override
	public boolean method5812() {
		return this.aClass34_1.method796();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!wg;I)V")
	@Override
	public void method5843(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) Class88_Sub8[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method6060(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class49 method5849(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class49_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!tt", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat173;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!fp;BII)V")
	public void method5325(@OriginalArg(0) int arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg1.method1492();
		@Pc(14) int local14 = arg0 * this.method5349(local7);
		this.method5326(arg1);
		OpenGL.glDrawElements(4, arg2, local7, arg1.method1491() + (long) local14);
	}

	@OriginalMember(owner = "client!tt", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(6) int local6 = this.anInt6765;
		this.anInt6765 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!tt", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > this.anInt6757) {
			this.anInt6757 = arg0;
		}
		if (this.anInt6762 > arg2) {
			this.anInt6762 = arg2;
		}
		if (this.anInt6728 > arg3) {
			this.anInt6728 = arg3;
		}
		if (arg1 > this.anInt6748) {
			this.anInt6748 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method5335();
		this.method5333();
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
	@Override
	public void method5838(@OriginalArg(0) int arg0) {
		this.method5329();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!fp;I)V")
	public void method5326(@OriginalArg(0) Interface5 arg0) {
		if (this.anInterface5_4 != arg0) {
			if (this.aBoolean436) {
				OpenGL.glBindBufferARB(34963, arg0.method1490());
			}
			this.anInterface5_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "()Z")
	@Override
	public boolean method5850() {
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "(I)V")
	private void method5327() {
		this.method5288(-2);
		for (@Pc(14) int local14 = this.anInt6744 - 1; local14 >= 0; local14--) {
			this.method5319(local14);
			this.method5312(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5304(8448, 8448);
		this.method5343(770, 34168, 2);
		this.method5294();
		this.anInt6753 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt6758 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean451 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean434 = true;
		this.method5338(true);
		this.method5271(true);
		this.method5302(true);
		this.method5269(true);
		this.method5347();
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
		@Pc(133) float[] local133 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(135) int local135 = 0; local135 < 8; local135++) {
			@Pc(141) int local141 = local135 + 16384;
			OpenGL.glLightfv(local141, 4608, local133, 0);
			OpenGL.glLightf(local141, 4615, 0.0F);
			OpenGL.glLightf(local141, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt6755 = this.anInt6764 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class125 method5841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class125_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!tt", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5342();
		this.method5295(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(Lclient!un;B)V")
	public void method5328(@OriginalArg(0) Interface13 arg0) {
		if (this.aBoolean448) {
			this.method5350(arg0);
			this.method5277(arg0);
		} else if (this.anInt6724 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt6724 >= 0) {
				this.anInterface13Array2[this.anInt6724].method183();
			}
			this.anInterface13_2 = this.anInterface13_1 = this.anInterface13Array2[++this.anInt6724] = arg0;
			this.anInterface13_2.method181();
		}
	}

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "(I)V")
	private void method5329() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static140.method2004(1000L);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5861(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "(I)V")
	private void method5330() {
		@Pc(21) float local21 = (float) -this.anInt6745 * this.aFloat171 / (float) this.anInt6750;
		@Pc(33) float local33 = this.aFloat171 * (float) -this.anInt6729 / (float) this.anInt6761;
		@Pc(48) float local48 = (float) (this.anInt6572 - this.anInt6745) * this.aFloat171 / (float) this.anInt6750;
		@Pc(63) float local63 = this.aFloat171 * (float) (this.anInt6597 - this.anInt6729) / (float) this.anInt6761;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local48 != local21 && local63 != local33) {
			OpenGL.glOrtho((double) local21, (double) local48, (double) -local63, (double) -local33, (double) ((float) this.anInt6751 - this.aFloat173), (double) ((float) this.anInt6752 - this.aFloat173));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBLclient!jaggl/memory/NativeBuffer;ZI)Lclient!ql;")
	public Interface12 method5331(@OriginalArg(0) int arg0, @OriginalArg(2) NativeBuffer arg1, @OriginalArg(4) int arg2) {
		return (Interface12) (this.aBoolean436 ? new Class69_Sub2(this, arg0, arg1, arg2, false) : new Class15_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "(B)V")
	private void method5332() {
		if (this.aCanvas7 == null) {
			this.anInt6540 = this.anInt6630 = 0;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas7.getSize();
			this.anInt6630 = local6.height;
			this.anInt6540 = local6.width;
		}
		if (this.anInterface13_1 == null) {
			this.anInt6572 = this.anInt6540;
			this.anInt6597 = this.anInt6630;
			this.method5278();
		}
		this.method5347();
		this.va();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)I")
	@Override
	public int method5860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "(Z)V")
	private void method5333() {
		if (this.anInt6757 <= this.anInt6762 && this.anInt6728 >= this.anInt6748) {
			OpenGL.glScissor(this.anInt6738 + this.anInt6757, this.anInt6597 + this.anInt6759 + -this.anInt6728, this.anInt6762 - this.anInt6757, this.anInt6728 + -this.anInt6748);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "()Z")
	@Override
	public boolean method5825() {
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLclient!un;)V")
	public void method5334(@OriginalArg(1) Interface13 arg0) {
		if (this.anInt6722 < 0 || arg0 != this.anInterface13Array3[this.anInt6722]) {
			throw new RuntimeException();
		}
		this.anInterface13Array3[this.anInt6722--] = null;
		arg0.method185();
		if (this.anInt6722 >= 0) {
			this.anInterface13_2 = this.anInterface13Array3[this.anInt6722];
			this.anInterface13_2.method182();
		} else {
			this.anInterface13_2 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "(I)V")
	private void method5335() {
		this.aFloat168 = this.anInt6762 - this.anInt6745;
		this.aFloat164 = this.anInt6728 - this.anInt6729;
		this.aFloat161 = this.anInt6757 - this.anInt6745;
		this.aFloat165 = this.anInt6748 - this.anInt6729;
	}

	@OriginalMember(owner = "client!tt", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
		this.anInt6721 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt6721++;
		}
		this.anInt6719 = 0x1 << this.anInt6721;
	}

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "(I)V")
	private void method5336() {
		OpenGL.glDepthMask(this.aBoolean428 && this.aBoolean439);
	}

	@OriginalMember(owner = "client!tt", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt6762;
		arg0[3] = this.anInt6728;
		arg0[1] = this.anInt6748;
		arg0[0] = this.anInt6757;
	}

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "(I)V")
	public void method5337() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray19, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class97 method5847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static194.method2594(this, arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!tt", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class29 arg0) {
		this.aClass29_Sub1_3 = (Class29_Sub1) arg0;
		this.aClass29_Sub1_4.method1962(this.aClass29_Sub1_3);
		if (this.anInt6730 != 1) {
			this.method5344();
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(BZ)V")
	public void method5338(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean449 != arg0) {
			this.aBoolean449 = arg0;
			this.method5289();
			this.anInt6732 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5877(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5813();
	}

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass29_Sub1_3.aFloat54 + (float) arg2 * this.aClass29_Sub1_3.aFloat60 + this.aClass29_Sub1_3.aFloat53 * (float) arg1 + this.aClass29_Sub1_3.aFloat51 * (float) arg0;
		if ((float) this.anInt6751 > local28 || (float) this.anInt6752 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass29_Sub1_3.aFloat52 + (float) arg2 * this.aClass29_Sub1_3.aFloat55 + (float) arg0 * this.aClass29_Sub1_3.aFloat57 + this.aClass29_Sub1_3.aFloat58 * (float) arg1) * (float) this.anInt6750 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt6761 * (this.aClass29_Sub1_3.aFloat50 + this.aClass29_Sub1_3.aFloat59 * (float) arg1 + (float) arg0 * this.aClass29_Sub1_3.aFloat56 + this.aClass29_Sub1_3.aFloat49 * (float) arg2) / local28);
		if ((float) local85 >= this.aFloat161 && this.aFloat168 >= (float) local85 && (float) local117 >= this.aFloat165 && (float) local117 <= this.aFloat164) {
			arg3[0] = (int) ((float) local85 - this.aFloat161);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat165);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(IB)V")
	public synchronized void method5339(@OriginalArg(0) int arg0) {
		@Pc(16) Class5_Sub34 local16 = new Class5_Sub34(arg0);
		this.aClass177_41.method3615(local16);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!fe;IIII)Lclient!e;")
	@Override
	public Class57 method5882(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class57_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "(B)V")
	private void method5340() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(IIII)V")
	public void method5341(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!tt", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.anInt6725 + this.anInt6727 + this.anInt6726;
	}

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "(I)V")
	private void method5342() {
		if (this.anInt6732 == 1) {
			return;
		}
		this.method5273();
		this.method5338(false);
		this.method5271(false);
		this.method5302(false);
		this.method5269(false);
		this.method5312(null);
		this.method5288(-2);
		this.method5297(1);
		this.anInt6732 = 1;
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(IIII)V")
	public void method5343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
	}

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "(I)V")
	private void method5344() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass29_Sub1_3.method1963(), 0);
		if (this.aBoolean452) {
			this.aClass34_1.aClass16_Sub2_1.method475();
		}
		this.method5337();
		this.method5323();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!un;Z)V")
	public void method5345(@OriginalArg(0) Interface13 arg0) {
		if (this.aBoolean448) {
			this.method5334(arg0);
			this.method5300(arg0);
		} else if (this.anInt6724 >= 0 && this.anInterface13Array2[this.anInt6724] == arg0) {
			this.anInterface13Array2[this.anInt6724--] = null;
			arg0.method183();
			if (this.anInt6724 >= 0) {
				this.anInterface13_2 = this.anInterface13_1 = this.anInterface13Array2[this.anInt6724];
				this.anInterface13_2.method181();
			} else {
				this.anInterface13_2 = this.anInterface13_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "(B)V")
	private void method5346() {
		@Pc(6) float[] local6 = this.aFloatArray16;
		@Pc(18) float local18 = (float) (this.anInt6751 * -this.anInt6745) / (float) this.anInt6750;
		@Pc(33) float local33 = (float) ((this.anInt6572 - this.anInt6745) * this.anInt6751) / (float) this.anInt6750;
		@Pc(44) float local44 = (float) (this.anInt6751 * this.anInt6729) / (float) this.anInt6761;
		@Pc(63) float local63 = (float) ((this.anInt6729 - this.anInt6597) * this.anInt6751) / (float) this.anInt6761;
		if (local18 == local33 || local63 == local44) {
			local6[15] = 1.0F;
			local6[10] = 1.0F;
			local6[11] = 0.0F;
			local6[13] = 0.0F;
			local6[4] = 0.0F;
			local6[1] = 0.0F;
			local6[0] = 1.0F;
			local6[8] = 0.0F;
			local6[9] = 0.0F;
			local6[14] = 0.0F;
			local6[12] = 0.0F;
			local6[6] = 0.0F;
			local6[2] = 0.0F;
			local6[5] = 1.0F;
			local6[7] = 0.0F;
			local6[3] = 0.0F;
		} else {
			@Pc(77) float local77 = (float) this.anInt6751 * 2.0F;
			local6[0] = local77 / (local33 - local18);
			local6[9] = (local63 + local44) / (-local63 + local44);
			local6[4] = 0.0F;
			local6[5] = local77 / (local44 - local63);
			local6[11] = -1.0F;
			local6[7] = 0.0F;
			local6[12] = 0.0F;
			local6[15] = 0.0F;
			local6[13] = 0.0F;
			local6[1] = 0.0F;
			local6[10] = this.aFloat155 = (float) -(this.anInt6752 + this.anInt6751) / (float) (this.anInt6752 - this.anInt6751);
			local6[3] = 0.0F;
			local6[2] = 0.0F;
			local6[6] = 0.0F;
			local6[8] = (local33 + local18) / (local33 - local18);
			local6[14] = this.aFloat160 = -((float) this.anInt6752 * local77) / (float) (this.anInt6752 - this.anInt6751);
		}
		this.method5279();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!rr;Z)Lclient!o;")
	@Override
	public Class49 method5871(@OriginalArg(0) Class214 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt5882 * arg0.anInt5885];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray76 == null) {
			for (local21 = 0; local21 < arg0.anInt5885; local21++) {
				for (local25 = 0; local25 < arg0.anInt5882; local25++) {
					@Pc(83) int local83 = arg0.anIntArray419[arg0.aByteArray75[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt5885; local21++) {
				for (local25 = 0; local25 < arg0.anInt5882; local25++) {
					local12[local16++] = arg0.aByteArray76[local14] << 24 | arg0.anIntArray419[arg0.aByteArray75[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(119) Class49 local119 = this.method5849(local12, arg0.anInt5882, arg0.anInt5882, arg0.anInt5885);
		local119.ha(arg0.anInt5884, arg0.anInt5881, arg0.anInt5883, arg0.anInt5880);
		return local119;
	}

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "()Lclient!c;")
	@Override
	public Class29 method5866() {
		return this.aClass29_Sub1_1;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5820(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static127.aFloat44 = arg0;
		Static277.aFloat109 = arg2;
		Static463.aFloat149 = arg1;
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)V")
	@Override
	public void method5845(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "(I)V")
	public void method5347() {
		if (this.anInt6730 != 0) {
			this.anInt6732 &= 0xFFFFFFE0;
			this.anInt6730 = 0;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLclient!ql;)V")
	public void method5348(@OriginalArg(1) Interface12 arg0) {
		if (this.anInterface12_6 != arg0) {
			if (this.aBoolean436) {
				OpenGL.glBindBufferARB(34962, arg0.method5510());
			}
			this.anInterface12_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "(II)I")
	public int method5349(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(BLclient!un;)V")
	public void method5350(@OriginalArg(1) Interface13 arg0) {
		if (this.anInt6722 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6722 >= 0) {
			this.anInterface13Array3[this.anInt6722].method185();
		}
		this.anInterface13_2 = this.anInterface13Array3[++this.anInt6722] = arg0;
		this.anInterface13_2.method182();
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)I")
	@Override
	public int method5879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.method5295(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}
}
