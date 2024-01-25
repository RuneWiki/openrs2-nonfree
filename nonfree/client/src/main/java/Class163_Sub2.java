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

@OriginalClass("client!pg")
public final class Class163_Sub2 extends Class163 {

	@OriginalMember(owner = "client!pg", name = "dc", descriptor = "I")
	public int anInt5121;

	@OriginalMember(owner = "client!pg", name = "Bc", descriptor = "I")
	private int anInt5143;

	@OriginalMember(owner = "client!pg", name = "Md", descriptor = "I")
	public int anInt5202;

	@OriginalMember(owner = "client!pg", name = "Vd", descriptor = "I")
	private int anInt5211;

	@OriginalMember(owner = "client!pg", name = "ke", descriptor = "I")
	public int anInt5219;

	@OriginalMember(owner = "client!pg", name = "qe", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!pg", name = "se", descriptor = "Lclient!li;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!pg", name = "we", descriptor = "Lclient!li;")
	private Interface10 anInterface10_2;

	@OriginalMember(owner = "client!pg", name = "ze", descriptor = "I")
	private int anInt5225;

	@OriginalMember(owner = "client!pg", name = "Ae", descriptor = "I")
	public int anInt5226;

	@OriginalMember(owner = "client!pg", name = "Ce", descriptor = "I")
	public int anInt5227;

	@OriginalMember(owner = "client!pg", name = "Ke", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!pg", name = "Le", descriptor = "Z")
	private boolean aBoolean360;

	@OriginalMember(owner = "client!pg", name = "Me", descriptor = "Lclient!oj;")
	public Class59_Sub1 aClass59_Sub1_1;

	@OriginalMember(owner = "client!pg", name = "Oe", descriptor = "I")
	private int anInt5229;

	@OriginalMember(owner = "client!pg", name = "Qe", descriptor = "Z")
	public boolean aBoolean362;

	@OriginalMember(owner = "client!pg", name = "Re", descriptor = "Ljava/lang/String;")
	private String aString149;

	@OriginalMember(owner = "client!pg", name = "Te", descriptor = "I")
	private int anInt5231;

	@OriginalMember(owner = "client!pg", name = "Ve", descriptor = "[Lclient!fg;")
	private Class20[] aClass20Array1;

	@OriginalMember(owner = "client!pg", name = "We", descriptor = "I")
	private int anInt5233;

	@OriginalMember(owner = "client!pg", name = "df", descriptor = "Z")
	public boolean aBoolean365;

	@OriginalMember(owner = "client!pg", name = "ff", descriptor = "Z")
	public boolean aBoolean366;

	@OriginalMember(owner = "client!pg", name = "gf", descriptor = "Z")
	private boolean aBoolean367;

	@OriginalMember(owner = "client!pg", name = "kf", descriptor = "Z")
	public boolean aBoolean369;

	@OriginalMember(owner = "client!pg", name = "lf", descriptor = "Z")
	private boolean aBoolean370;

	@OriginalMember(owner = "client!pg", name = "mf", descriptor = "I")
	private int anInt5236;

	@OriginalMember(owner = "client!pg", name = "nf", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!pg", name = "pf", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!pg", name = "qf", descriptor = "F")
	private float aFloat62;

	@OriginalMember(owner = "client!pg", name = "rf", descriptor = "Lclient!oj;")
	public Class59_Sub1 aClass59_Sub1_2;

	@OriginalMember(owner = "client!pg", name = "tf", descriptor = "Lclient!oj;")
	public Class59_Sub1 aClass59_Sub1_3;

	@OriginalMember(owner = "client!pg", name = "vf", descriptor = "I")
	public int anInt5238;

	@OriginalMember(owner = "client!pg", name = "xf", descriptor = "Lclient!gq;")
	private Class20_Sub1_Sub1 aClass20_Sub1_Sub1_3;

	@OriginalMember(owner = "client!pg", name = "Af", descriptor = "Z")
	private boolean aBoolean372;

	@OriginalMember(owner = "client!pg", name = "Bf", descriptor = "Z")
	private boolean aBoolean373;

	@OriginalMember(owner = "client!pg", name = "Cf", descriptor = "F")
	private float aFloat64;

	@OriginalMember(owner = "client!pg", name = "Df", descriptor = "I")
	private int anInt5240;

	@OriginalMember(owner = "client!pg", name = "Ff", descriptor = "Z")
	public boolean aBoolean374;

	@OriginalMember(owner = "client!pg", name = "Gf", descriptor = "Z")
	private boolean aBoolean375;

	@OriginalMember(owner = "client!pg", name = "Jf", descriptor = "Lclient!hf;")
	public Class100 aClass100_13;

	@OriginalMember(owner = "client!pg", name = "Kf", descriptor = "Lclient!sh;")
	public Class31_Sub2 aClass31_Sub2_3;

	@OriginalMember(owner = "client!pg", name = "Of", descriptor = "Z")
	public boolean aBoolean379;

	@OriginalMember(owner = "client!pg", name = "Pf", descriptor = "F")
	private float aFloat65;

	@OriginalMember(owner = "client!pg", name = "Rf", descriptor = "Lclient!oj;")
	public Class59_Sub1 aClass59_Sub1_4;

	@OriginalMember(owner = "client!pg", name = "Sf", descriptor = "Z")
	public boolean aBoolean380;

	@OriginalMember(owner = "client!pg", name = "Tf", descriptor = "Lclient!nn;")
	private Interface11 anInterface11_6;

	@OriginalMember(owner = "client!pg", name = "Uf", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!pg", name = "Wf", descriptor = "Z")
	private boolean aBoolean381;

	@OriginalMember(owner = "client!pg", name = "Yf", descriptor = "Z")
	public boolean aBoolean382;

	@OriginalMember(owner = "client!pg", name = "Zf", descriptor = "J")
	private long aLong169;

	@OriginalMember(owner = "client!pg", name = "ag", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!pg", name = "bg", descriptor = "Z")
	public boolean aBoolean384;

	@OriginalMember(owner = "client!pg", name = "cg", descriptor = "I")
	private int anInt5246;

	@OriginalMember(owner = "client!pg", name = "gg", descriptor = "Lclient!eb;")
	public Class61 aClass61_6;

	@OriginalMember(owner = "client!pg", name = "hg", descriptor = "Lclient!nn;")
	private Interface11 anInterface11_7;

	@OriginalMember(owner = "client!pg", name = "jg", descriptor = "I")
	public int anInt5250;

	@OriginalMember(owner = "client!pg", name = "lg", descriptor = "Lclient!oj;")
	public Class59_Sub1 aClass59_Sub1_5;

	@OriginalMember(owner = "client!pg", name = "mg", descriptor = "Lclient!oj;")
	public Class59_Sub1 aClass59_Sub1_6;

	@OriginalMember(owner = "client!pg", name = "ng", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!pg", name = "pg", descriptor = "Lclient!oj;")
	public Class59_Sub1 aClass59_Sub1_7;

	@OriginalMember(owner = "client!pg", name = "rg", descriptor = "I")
	private int anInt5252;

	@OriginalMember(owner = "client!pg", name = "tg", descriptor = "Lclient!oj;")
	public Class59_Sub1 aClass59_Sub1_8;

	@OriginalMember(owner = "client!pg", name = "xg", descriptor = "I")
	public int anInt5256;

	@OriginalMember(owner = "client!pg", name = "yg", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!pg", name = "Ag", descriptor = "Z")
	private boolean aBoolean386;

	@OriginalMember(owner = "client!pg", name = "Dg", descriptor = "I")
	private int anInt5257;

	@OriginalMember(owner = "client!pg", name = "Eg", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!pg", name = "Fg", descriptor = "Z")
	private boolean aBoolean387;

	@OriginalMember(owner = "client!pg", name = "Gg", descriptor = "Lclient!oj;")
	public Class59_Sub1 aClass59_Sub1_9;

	@OriginalMember(owner = "client!pg", name = "Hg", descriptor = "Lclient!fw;")
	private Interface5 anInterface5_4;

	@OriginalMember(owner = "client!pg", name = "Ig", descriptor = "Lclient!sh;")
	public Class31_Sub2 aClass31_Sub2_4;

	@OriginalMember(owner = "client!pg", name = "Lg", descriptor = "I")
	private int anInt5259;

	@OriginalMember(owner = "client!pg", name = "Mg", descriptor = "Lclient!bd;")
	public Class20_Sub1 aClass20_Sub1_5;

	@OriginalMember(owner = "client!pg", name = "Og", descriptor = "I")
	private int anInt5260;

	@OriginalMember(owner = "client!pg", name = "Rg", descriptor = "Lclient!hu;")
	private Class109_Sub1 aClass109_Sub1_1;

	@OriginalMember(owner = "client!pg", name = "Sg", descriptor = "I")
	public int anInt5262;

	@OriginalMember(owner = "client!pg", name = "Tg", descriptor = "Lclient!hf;")
	public Class100 aClass100_14;

	@OriginalMember(owner = "client!pg", name = "Vg", descriptor = "Lclient!oj;")
	public Class59_Sub1 aClass59_Sub1_10;

	@OriginalMember(owner = "client!pg", name = "Wg", descriptor = "I")
	private int anInt5263;

	@OriginalMember(owner = "client!pg", name = "Xg", descriptor = "Ljava/lang/String;")
	private String aString150;

	@OriginalMember(owner = "client!pg", name = "Zg", descriptor = "I")
	private int anInt5264;

	@OriginalMember(owner = "client!pg", name = "ch", descriptor = "I")
	private int anInt5265;

	@OriginalMember(owner = "client!pg", name = "wc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!pg", name = "de", descriptor = "I")
	public int anInt5217 = 128;

	@OriginalMember(owner = "client!pg", name = "he", descriptor = "Lclient!fj;")
	private final Class77 aClass77_1 = new Class77();

	@OriginalMember(owner = "client!pg", name = "ie", descriptor = "Lclient!sh;")
	private final Class31_Sub2 aClass31_Sub2_1 = new Class31_Sub2();

	@OriginalMember(owner = "client!pg", name = "je", descriptor = "Lclient!sh;")
	public final Class31_Sub2 aClass31_Sub2_2 = new Class31_Sub2();

	@OriginalMember(owner = "client!pg", name = "oe", descriptor = "I")
	public int anInt5220 = 3;

	@OriginalMember(owner = "client!pg", name = "le", descriptor = "Z")
	private boolean aBoolean359 = false;

	@OriginalMember(owner = "client!pg", name = "pe", descriptor = "I")
	public int anInt5221 = 8;

	@OriginalMember(owner = "client!pg", name = "ne", descriptor = "Lclient!mg;")
	private final Class156 aClass156_39 = new Class156();

	@OriginalMember(owner = "client!pg", name = "ue", descriptor = "[Lclient!li;")
	private final Interface10[] anInterface10Array2 = new Interface10[4];

	@OriginalMember(owner = "client!pg", name = "re", descriptor = "[Lclient!li;")
	private final Interface10[] anInterface10Array1 = new Interface10[4];

	@OriginalMember(owner = "client!pg", name = "ve", descriptor = "I")
	private int anInt5223 = -1;

	@OriginalMember(owner = "client!pg", name = "te", descriptor = "I")
	private int anInt5222 = -1;

	@OriginalMember(owner = "client!pg", name = "ye", descriptor = "[Lclient!li;")
	private final Interface10[] anInterface10Array3 = new Interface10[4];

	@OriginalMember(owner = "client!pg", name = "xe", descriptor = "I")
	private int anInt5224 = -1;

	@OriginalMember(owner = "client!pg", name = "Be", descriptor = "Lclient!mg;")
	private final Class156 aClass156_40;

	@OriginalMember(owner = "client!pg", name = "De", descriptor = "Lclient!mg;")
	private final Class156 aClass156_41;

	@OriginalMember(owner = "client!pg", name = "Ee", descriptor = "Lclient!mg;")
	private final Class156 aClass156_42;

	@OriginalMember(owner = "client!pg", name = "Fe", descriptor = "Lclient!mg;")
	private final Class156 aClass156_43;

	@OriginalMember(owner = "client!pg", name = "Ge", descriptor = "Lclient!mg;")
	private final Class156 aClass156_44;

	@OriginalMember(owner = "client!pg", name = "He", descriptor = "Lclient!mg;")
	private final Class156 aClass156_45;

	@OriginalMember(owner = "client!pg", name = "Ie", descriptor = "Lclient!mg;")
	private final Class156 aClass156_46;

	@OriginalMember(owner = "client!pg", name = "of", descriptor = "[Lclient!sa;")
	private final Class2_Sub29[] aClass2_Sub29Array3;

	@OriginalMember(owner = "client!pg", name = "Se", descriptor = "I")
	public int anInt5230;

	@OriginalMember(owner = "client!pg", name = "Ye", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!pg", name = "Ne", descriptor = "I")
	private int anInt5228;

	@OriginalMember(owner = "client!pg", name = "uf", descriptor = "I")
	public int anInt5237;

	@OriginalMember(owner = "client!pg", name = "Lf", descriptor = "I")
	private int anInt5243;

	@OriginalMember(owner = "client!pg", name = "jf", descriptor = "I")
	public int anInt5235;

	@OriginalMember(owner = "client!pg", name = "zf", descriptor = "I")
	public int anInt5239;

	@OriginalMember(owner = "client!pg", name = "Vf", descriptor = "I")
	private int anInt5244;

	@OriginalMember(owner = "client!pg", name = "Xe", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!pg", name = "Hf", descriptor = "I")
	private int anInt5242;

	@OriginalMember(owner = "client!pg", name = "og", descriptor = "I")
	private int anInt5251;

	@OriginalMember(owner = "client!pg", name = "Qf", descriptor = "[F")
	private final float[] aFloatArray28;

	@OriginalMember(owner = "client!pg", name = "kg", descriptor = "F")
	private float aFloat68;

	@OriginalMember(owner = "client!pg", name = "qg", descriptor = "F")
	private float aFloat70;

	@OriginalMember(owner = "client!pg", name = "ef", descriptor = "I")
	public int anInt5234;

	@OriginalMember(owner = "client!pg", name = "Pe", descriptor = "Z")
	private boolean aBoolean361;

	@OriginalMember(owner = "client!pg", name = "vg", descriptor = "I")
	private int anInt5255;

	@OriginalMember(owner = "client!pg", name = "wg", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!pg", name = "eg", descriptor = "I")
	private int anInt5247;

	@OriginalMember(owner = "client!pg", name = "wf", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!pg", name = "ug", descriptor = "I")
	private int anInt5254;

	@OriginalMember(owner = "client!pg", name = "Ef", descriptor = "I")
	public int anInt5241;

	@OriginalMember(owner = "client!pg", name = "sg", descriptor = "I")
	public int anInt5253;

	@OriginalMember(owner = "client!pg", name = "Je", descriptor = "[F")
	private final float[] aFloatArray26;

	@OriginalMember(owner = "client!pg", name = "bf", descriptor = "I")
	public int bf;

	@OriginalMember(owner = "client!pg", name = "Bg", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!pg", name = "Kg", descriptor = "I")
	private int anInt5258;

	@OriginalMember(owner = "client!pg", name = "Jg", descriptor = "[F")
	private final float[] aFloatArray29;

	@OriginalMember(owner = "client!pg", name = "Xf", descriptor = "I")
	public int anInt5245;

	@OriginalMember(owner = "client!pg", name = "Ug", descriptor = "[F")
	private final float[] aFloatArray30;

	@OriginalMember(owner = "client!pg", name = "dg", descriptor = "F")
	private float aFloat67;

	@OriginalMember(owner = "client!pg", name = "Ue", descriptor = "I")
	private int anInt5232;

	@OriginalMember(owner = "client!pg", name = "Qg", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!pg", name = "Cg", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!pg", name = "Ng", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!pg", name = "fg", descriptor = "I")
	public int anInt5248;

	@OriginalMember(owner = "client!pg", name = "cf", descriptor = "[F")
	public final float[] aFloatArray27;

	@OriginalMember(owner = "client!pg", name = "Pg", descriptor = "I")
	public int anInt5261;

	@OriginalMember(owner = "client!pg", name = "yf", descriptor = "Lclient!dv;")
	public Class2_Sub13_Sub1 aClass2_Sub13_Sub1_3;

	@OriginalMember(owner = "client!pg", name = "Yg", descriptor = "[I")
	public int[] anIntArray427;

	@OriginalMember(owner = "client!pg", name = "bh", descriptor = "[I")
	public int[] anIntArray428;

	@OriginalMember(owner = "client!pg", name = "dh", descriptor = "[I")
	public int[] anIntArray429;

	@OriginalMember(owner = "client!pg", name = "ah", descriptor = "[B")
	public final byte[] aByteArray65;

	@OriginalMember(owner = "client!pg", name = "fe", descriptor = "I")
	public final int anInt5218;

	@OriginalMember(owner = "client!pg", name = "pc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas6;

	@OriginalMember(owner = "client!pg", name = "xb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!pg", name = "Vc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!pg", name = "xd", descriptor = "J")
	private final long aLong168;

	@OriginalMember(owner = "client!pg", name = "Cc", descriptor = "J")
	private long aLong167;

	@OriginalMember(owner = "client!pg", name = "ig", descriptor = "I")
	public final int anInt5249;

	@OriginalMember(owner = "client!pg", name = "Ze", descriptor = "Z")
	public boolean aBoolean363;

	@OriginalMember(owner = "client!pg", name = "If", descriptor = "Z")
	public boolean aBoolean376;

	@OriginalMember(owner = "client!pg", name = "Nf", descriptor = "Z")
	private boolean aBoolean378;

	@OriginalMember(owner = "client!pg", name = "Mf", descriptor = "Z")
	public boolean aBoolean377;

	@OriginalMember(owner = "client!pg", name = "af", descriptor = "Z")
	private boolean aBoolean364;

	@OriginalMember(owner = "client!pg", name = "sf", descriptor = "Z")
	public boolean aBoolean371;

	@OriginalMember(owner = "client!pg", name = "hf", descriptor = "Z")
	public boolean aBoolean368;

	@OriginalMember(owner = "client!pg", name = "zg", descriptor = "Z")
	private final boolean aBoolean385;

	@OriginalMember(owner = "client!pg", name = "be", descriptor = "Lclient!hl;")
	public final Class105 aClass105_1;

	@OriginalMember(owner = "client!pg", name = "me", descriptor = "Lclient!we;")
	public final Class264 aClass264_1;

	@OriginalMember(owner = "client!pg", name = "ge", descriptor = "Lclient!ng;")
	private final Class167 aClass167_1;

	@OriginalMember(owner = "client!pg", name = "ee", descriptor = "Lclient!cq;")
	private Class2_Sub9_Sub1 aClass2_Sub9_Sub1_1;

	@OriginalMember(owner = "client!pg", name = "ce", descriptor = "Lclient!ej;")
	private final Class66 aClass66_1;

	static {
		new Class134("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;ILclient!or;)V")
	public Class163_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class183 arg4) {
		super(arg0, arg2);
		new Class261();
		new Class72(16);
		this.aClass156_40 = new Class156();
		this.aClass156_41 = new Class156();
		this.aClass156_42 = new Class156();
		this.aClass156_43 = new Class156();
		this.aClass156_44 = new Class156();
		this.aClass156_45 = new Class156();
		this.aClass156_46 = new Class156();
		this.aClass2_Sub29Array3 = new Class2_Sub29[Static176.anInt49];
		this.anInt5230 = 0;
		this.aFloat59 = -1.0F;
		this.anInt5228 = 0;
		this.anInt5237 = 3584;
		this.anInt5243 = 0;
		this.anInt5235 = 512;
		this.anInt5239 = 50;
		this.anInt5244 = 8448;
		this.aFloat58 = -1.0F;
		this.anInt5242 = 0;
		this.anInt5251 = 0;
		this.aFloatArray28 = new float[16];
		this.aFloat68 = 1.0F;
		this.aFloat70 = 0.0F;
		this.anInt5234 = 0;
		this.aBoolean361 = true;
		this.anInt5255 = 0;
		this.aFloat71 = 3584.0F;
		this.anInt5247 = 8448;
		this.aFloat63 = 1.0F;
		this.anInt5254 = 0;
		this.anInt5241 = -1;
		this.anInt5253 = -1;
		this.aFloatArray26 = new float[4];
		this.bf = 0;
		this.aFloat73 = 3584.0F;
		this.anInt5258 = -1;
		this.aFloatArray29 = new float[4];
		this.anInt5245 = 0;
		this.aFloatArray30 = new float[4];
		this.aFloat67 = 1.0F;
		this.anInt5232 = -1;
		this.aFloat77 = 1.0F;
		this.aFloat74 = 1.0F;
		this.aFloat76 = 3000.0F;
		this.anInt5248 = 512;
		this.aFloatArray27 = new float[4];
		this.anInt5261 = -1;
		this.aClass2_Sub13_Sub1_3 = new Class2_Sub13_Sub1(8192);
		this.anIntArray427 = new int[1];
		this.anIntArray428 = new int[1];
		this.anIntArray429 = new int[1];
		this.aByteArray65 = new byte[16384];
		this.anInt5218 = arg3;
		this.aCanvas5 = this.aCanvas6 = arg1;
		try {
			if (Static119.aBoolean148 == null || !Static119.aBoolean148) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static119.aBoolean148 = Boolean.TRUE;
				} else {
					@Pc(268) String local268 = System.getProperty("os.name").toLowerCase();
					if (!local268.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local268.startsWith("linux") || local268.startsWith("sunos")) {
						System.load(arg4.method3920("libjaggl.so").toString());
					} else if (local268.startsWith("mac")) {
						System.load(arg4.method3920("libjaggl.jnilib").toString());
					} else if (local268.startsWith("win")) {
						System.load(arg4.method3920("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static119.aBoolean148 = Boolean.TRUE;
				}
			}
			if (Static119.aBoolean148 == null || !Static119.aBoolean148) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong167 = this.aLong168 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt5218);
			if (this.aLong168 == 0L) {
				throw new RuntimeException("");
			}
			this.method4152();
			@Pc(375) int local375 = this.method4115();
			if (local375 != 0) {
				throw new RuntimeException("");
			}
			this.anInt5249 = this.aBoolean374 ? 33639 : 5121;
			@Pc(399) int local399;
			if (this.aString149.indexOf("radeon") != -1) {
				local399 = 0;
				@Pc(401) boolean local401 = false;
				@Pc(403) boolean local403 = false;
				@Pc(412) String[] local412 = Static203.method2715(' ', this.aString149.replace('/', ' '));
				for (@Pc(414) int local414 = 0; local414 < local412.length; local414++) {
					@Pc(420) String local420 = local412[local414];
					try {
						if (local420.length() > 0) {
							if (local420.charAt(0) == 'x' && local420.length() >= 3 && Static189.method2546(local420.substring(1, 3))) {
								local403 = true;
								local420 = local420.substring(1);
							}
							if (local420.equals("hd")) {
								local401 = true;
							} else {
								if (local420.startsWith("hd")) {
									local420 = local420.substring(2);
									local401 = true;
								}
								if (local420.length() >= 4 && Static189.method2546(local420.substring(0, 4))) {
									local399 = Static205.method2736(local420.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(488) Exception local488) {
					}
				}
				if (!local401 || local399 < 4000) {
					this.aBoolean363 = false;
				}
				if (!local403 && !local401) {
					if (local399 >= 7000 && local399 <= 9250) {
						this.aBoolean376 = false;
					}
					if (local399 >= 7000 && local399 <= 7999) {
						this.aBoolean378 = false;
					}
				}
				this.aBoolean377 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean364 = this.aBoolean378;
				this.aBoolean371 = true;
			}
			if (this.aString150.indexOf("intel") != -1) {
				this.aBoolean368 = false;
			}
			this.aBoolean385 = !this.aString150.equals("s3 graphics");
			if (this.aBoolean378) {
				try {
					@Pc(573) int[] local573 = new int[1];
					OpenGL.glGenBuffersARB(1, local573, 0);
				} catch (@Pc(579) Throwable local579) {
					throw new RuntimeException("");
				}
			}
			Static340.method5394(true, false);
			this.aBoolean359 = true;
			this.aClass105_1 = new Class105(this, super.anInterface9_12);
			this.method4176();
			this.aClass264_1 = new Class264(this);
			this.aClass167_1 = new Class167(this);
			if (this.aClass167_1.method3621()) {
				this.aClass2_Sub9_Sub1_1 = new Class2_Sub9_Sub1(this);
				if (!this.aClass2_Sub9_Sub1_1.method884()) {
					this.aClass2_Sub9_Sub1_1.method875();
					this.aClass2_Sub9_Sub1_1 = null;
				}
			}
			this.aClass66_1 = new Class66(this);
			this.method4149();
			this.method4106();
			OpenGL.glClear(16640);
			local399 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(658) Exception local658) {
					if (local399++ > 5) {
						throw new RuntimeException("");
					}
					Static429.method5376(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(676) Throwable local676) {
			local676.printStackTrace();
			this.method5497();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(IIII)V")
	public void method4103(@OriginalArg(0) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5519(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas6 == arg0) {
			local5 = this.aLong168;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable2.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas5 == arg0) {
			this.method4106();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5535(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5562();
	}

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "()V")
	@Override
	public void method5520() {
		if (this.aClass2_Sub9_Sub1_1 != null && this.aClass2_Sub9_Sub1_1.method871()) {
			this.aClass167_1.method3627(this.aClass2_Sub9_Sub1_1);
			this.aClass105_1.method2195();
		}
	}

	@OriginalMember(owner = "client!pg", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		if (this.aFloat60 != arg0) {
			this.aFloat60 = arg0;
			this.method4123();
		}
	}

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.method4174(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "(I)V")
	private void method4104() {
		if (this.aFloat72 == 0.0F) {
			this.aFloatArray28[10] = this.aFloat64;
			this.aFloatArray28[14] = this.aFloat65;
		} else {
			@Pc(13) float local13 = this.aFloat76 / (this.aFloat72 + this.aFloat76);
			@Pc(17) float local17 = local13 * local13;
			@Pc(33) float local33 = (1.0F - local13) * (1.0F - local13) * -this.aFloat65 / this.aFloat72;
			this.aFloatArray28[14] = local17 * this.aFloat65;
			this.aFloatArray28[10] = local33 + this.aFloat64;
		}
		this.aFloat71 = (float) this.anInt5237 - this.aFloat72;
		this.aFloat73 = (this.aFloatArray28[14] - (float) this.anInt5237) / this.aFloatArray28[10];
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBLclient!fw;II)V")
	public void method4105(@OriginalArg(0) int arg0, @OriginalArg(2) Interface5 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg1.method5175();
		@Pc(18) int local18 = arg0 * this.method4136(local7);
		this.method4141(arg1);
		OpenGL.glDrawElements(4, arg2, local7, (long) local18 + arg1.method5174());
	}

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "()I")
	@Override
	public int method5553() {
		return 4;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5510(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class2_Sub20 local19;
		while (!this.aClass156_41.method3153()) {
			local19 = (Class2_Sub20) this.aClass156_41.method3152();
			Static199.anIntArray294[local11++] = (int) local19.aLong225;
			this.anInt5226 -= local19.anInt2212;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static199.anIntArray294, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static199.anIntArray294, 0);
			local11 = 0;
		}
		while (!this.aClass156_42.method3153()) {
			local19 = (Class2_Sub20) this.aClass156_42.method3152();
			Static199.anIntArray294[local11++] = (int) local19.aLong225;
			this.anInt5227 -= local19.anInt2212;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static199.anIntArray294, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static199.anIntArray294, 0);
			local11 = 0;
		}
		while (!this.aClass156_43.method3153()) {
			local19 = (Class2_Sub20) this.aClass156_43.method3152();
			Static199.anIntArray294[local11++] = local19.anInt2212;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static199.anIntArray294, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static199.anIntArray294, 0);
			local11 = 0;
		}
		while (!this.aClass156_44.method3153()) {
			local19 = (Class2_Sub20) this.aClass156_44.method3152();
			Static199.anIntArray294[local11++] = (int) local19.aLong225;
			this.anInt5225 -= local19.anInt2212;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static199.anIntArray294, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static199.anIntArray294, 0);
		}
		while (!this.aClass156_40.method3153()) {
			local19 = (Class2_Sub20) this.aClass156_40.method3152();
			OpenGL.glDeleteLists((int) local19.aLong225, local19.anInt2212);
		}
		@Pc(215) Class2 local215;
		while (!this.aClass156_45.method3153()) {
			local215 = this.aClass156_45.method3152();
			OpenGL.glDeleteProgramARB((int) local215.aLong225);
		}
		while (!this.aClass156_46.method3153()) {
			local215 = this.aClass156_46.method3152();
			OpenGL.glDeleteObjectARB(local215.aLong225);
		}
		while (!this.aClass156_40.method3153()) {
			local19 = (Class2_Sub20) this.aClass156_40.method3152();
			OpenGL.glDeleteLists((int) local19.aLong225, local19.anInt2212);
		}
		this.aClass105_1.method2197();
		if (this.pa() > 100663296 && Static110.method1702() > this.aLong169 + 60000L) {
			System.gc();
			this.aLong169 = Static110.method1702();
		}
		this.anInt5219 = local9;
	}

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "(I)V")
	private void method4106() {
		if (this.aCanvas5 == null) {
			this.anInt5143 = this.anInt5211 = 0;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas5.getSize();
			this.anInt5211 = local6.height;
			this.anInt5143 = local6.width;
		}
		if (this.anInterface10_1 == null) {
			this.anInt5121 = this.anInt5211;
			this.anInt5202 = this.anInt5143;
			this.method4145();
		}
		this.method4179();
		this.va();
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass167_1.method3622(arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "(I)V")
	@Override
	public void method5564(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(II)V")
	public void method4107(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method4164(7681, 7681);
		} else if (arg0 == 0) {
			this.method4164(8448, 8448);
		} else if (arg0 == 2) {
			this.method4164(34165, 7681);
		} else if (arg0 == 3) {
			this.method4164(260, 8448);
		} else if (arg0 == 4) {
			this.method4164(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "()V")
	@Override
	public void method5559() {
		this.method4166(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "()Z")
	@Override
	public boolean method5538() {
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	private void method4108() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass31_Sub2_4.method4801(), 0);
		if (this.aBoolean365) {
			this.aClass66_1.aClass63_Sub7_1.method4419();
		}
		this.method4170();
		this.method4132();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class35 method5550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static64.method962(arg3, this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BII)V")
	public synchronized void method4109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub20 local15 = new Class2_Sub20(arg0);
		local15.aLong225 = arg1;
		this.aClass156_44.method3157(local15);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZ)V")
	public void method4110(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method4116(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!li;Z)V")
	public void method4111(@OriginalArg(0) Interface10 arg0) {
		if (this.aBoolean369) {
			this.method4153(arg0);
			this.method4150(arg0);
		} else if (this.anInt5223 >= 0 && arg0 == this.anInterface10Array1[this.anInt5223]) {
			this.anInterface10Array1[this.anInt5223--] = null;
			arg0.method1396();
			if (this.anInt5223 < 0) {
				this.anInterface10_2 = this.anInterface10_1 = null;
			} else {
				this.anInterface10_2 = this.anInterface10_1 = this.anInterface10Array1[this.anInt5223];
				this.anInterface10_2.method1399();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!qq;IIII)Lclient!e;")
	@Override
	public Class59 method5530(@OriginalArg(0) Class205 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class59_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "(I)V")
	public void method4112() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!pg", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(6) int local6 = this.anInt5264;
		this.anInt5264 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!pg", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
		this.anInt5220 = 0;
		while (arg0 > 1) {
			this.anInt5220++;
			arg0 >>= 0x1;
		}
		this.anInt5221 = 0x1 << this.anInt5220;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!li;I)V")
	public void method4113(@OriginalArg(0) Interface10 arg0) {
		if (this.anInt5224 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5224 >= 0) {
			this.anInterface10Array2[this.anInt5224].method1397();
		}
		this.anInterface10_2 = this.anInterface10Array2[++this.anInt5224] = arg0;
		this.anInterface10_2.method1395();
	}

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "()Z")
	@Override
	public boolean method5521() {
		return this.aBoolean383 && (!this.method5555() || this.aBoolean386);
	}

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "()Z")
	@Override
	public boolean method5544() {
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4165();
		this.method4174(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V")
	@Override
	public void method5531(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "()Z")
	@Override
	public boolean method5516() {
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.anInt5226 + this.anInt5227 + this.anInt5225;
	}

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "()Z")
	@Override
	public boolean method5548() {
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!hf;Lclient!hf;Lclient!hf;Lclient!hf;I)V")
	public void method4114(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method4140(arg3.anInterface11_2);
			OpenGL.glVertexPointer(arg3.aByte27, arg3.aShort24, this.anInterface11_6.method1893(), this.anInterface11_6.method1892() + (long) arg3.aByte26);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method4140(arg1.anInterface11_2);
			OpenGL.glNormalPointer(arg1.aShort24, this.anInterface11_6.method1893(), this.anInterface11_6.method1892() + (long) arg1.aByte26);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method4140(arg2.anInterface11_2);
			OpenGL.glColorPointer(arg2.aByte27, arg2.aShort24, this.anInterface11_6.method1893(), this.anInterface11_6.method1892() + (long) arg2.aByte26);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method4140(arg0.anInterface11_2);
			OpenGL.glTexCoordPointer(arg0.aByte27, arg0.aShort24, this.anInterface11_6.method1893(), this.anInterface11_6.method1892() + (long) arg0.aByte26);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
	@Override
	public void method5496(@OriginalArg(0) int arg0) {
		this.method4119();
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)I")
	private int method4115() {
		this.aString150 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString149 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString150.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString150.indexOf("brian paul") != -1 || this.aString150.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(53) String local53 = OpenGL.glGetString(7938);
		@Pc(61) String[] local61 = Static203.method2715(' ', local53.replace('.', ' '));
		if (local61.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(81) int local81 = Static205.method2736(local61[0]);
				@Pc(87) int local87 = Static205.method2736(local61[1]);
				this.anInt5246 = local81 * 10 + local87;
			} catch (@Pc(97) NumberFormatException local97) {
				local10 |= 0x4;
			}
		}
		if (this.anInt5246 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(133) int[] local133 = new int[1];
		OpenGL.glGetIntegerv(34018, local133, 0);
		this.anInt5250 = local133[0];
		OpenGL.glGetIntegerv(34929, local133, 0);
		this.anInt5229 = local133[0];
		OpenGL.glGetIntegerv(34930, local133, 0);
		this.anInt5233 = local133[0];
		if (this.anInt5250 < 2 || this.anInt5229 < 2 || this.anInt5233 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean374 = NativeStream.b();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean378 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean383 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean366 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean384 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean362 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean376 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean377 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean379 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean363 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean380 = false;
		this.aBoolean368 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean369 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean382 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean386 = this.aBoolean369 & this.aBoolean382;
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZIZI)V")
	public void method4116(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 != this.anInt5260) {
			if (arg2 < 0) {
				this.method4117();
				this.method4118(null);
				this.method4107(0);
				if (!this.aBoolean365) {
					this.aClass66_1.method1495(arg0, 0, arg1, 0, 0);
				}
			} else {
				@Pc(19) Class20_Sub1 local19 = this.aClass105_1.method2196(arg2);
				@Pc(25) Class158 local25 = super.anInterface9_12.method1769(arg2);
				if (local25.aByte48 == 0 && local25.aByte42 == 0) {
					this.method4117();
				} else {
					@Pc(48) int local48 = local25.aBoolean283 ? 64 : 128;
					@Pc(52) int local52 = local48 * 50;
					this.method4121((float) (local25.aByte48 * (this.anInt5219 % local52)) / (float) local52, 0.0F, (float) (this.anInt5219 % local52 * local25.aByte42) / (float) local52);
				}
				if (this.aBoolean365) {
					this.method4118(local19);
					this.method4107(local25.anInt4043);
				} else {
					this.aClass66_1.method1495(arg0, local25.aByte43, arg1, local25.anInt4044, local25.aByte44);
					if (!this.aClass66_1.method1496(local19, local25.anInt4043)) {
						this.method4118(local19);
						this.method4107(local25.anInt4043);
					}
				}
			}
			this.anInt5260 = arg2;
		}
		this.anInt5236 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "(I)V")
	private void method4117() {
		if (this.aBoolean387) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean387 = false;
		}
	}

	@OriginalMember(owner = "client!pg", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat76;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!rr;I)V")
	@Override
	public void method5509(@OriginalArg(0) Class59[] arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class21_Sub7[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method5736(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat72;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!fg;Z)V")
	public void method4118(@OriginalArg(0) Class20 arg0) {
		@Pc(17) Class20 local17 = this.aClass20Array1[this.anInt5259];
		if (arg0 != local17) {
			if (arg0 == null) {
				OpenGL.glDisable(local17.anInt3919);
			} else {
				if (local17 == null) {
					OpenGL.glEnable(arg0.anInt3919);
				} else if (local17.anInt3919 != arg0.anInt3919) {
					OpenGL.glDisable(local17.anInt3919);
					OpenGL.glEnable(arg0.anInt3919);
				}
				OpenGL.glBindTexture(arg0.anInt3919, arg0.method3112());
			}
			this.aClass20Array1[this.anInt5259] = arg0;
		}
		this.anInt5236 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(Z)V")
	private void method4119() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(II)V")
	public synchronized void method4120(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub20 local8 = new Class2_Sub20(arg0);
		this.aClass156_43.method3157(local8);
	}

	@OriginalMember(owner = "client!pg", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class13 method5513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class13_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5515(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas6) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!pg", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat76 == arg0 && arg1 == this.aFloat72) {
			return;
		}
		this.aFloat76 = arg0;
		this.aFloat72 = arg1;
		this.method4104();
		if (this.anInt5231 == 3) {
			this.method4163();
		} else if (this.anInt5231 == 2) {
			this.method4172();
			return;
		}
	}

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "()Z")
	@Override
	public boolean method5541() {
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "()Z")
	@Override
	public boolean method5524() {
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(FIFF)V")
	private void method4121(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean387) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean387 = true;
	}

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "(I)V")
	private void method4122() {
		if (this.anInt5231 != 2) {
			this.anInt5231 = 2;
			this.method4172();
			this.method4108();
			this.anInt5236 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5533(@OriginalArg(0) Class2_Sub6 arg0) {
		this.aNativeHeap2 = ((Class2_Sub6_Sub1) arg0).aNativeHeap1;
		if (this.anInterface11_7 != null) {
			return;
		}
		@Pc(16) Class2_Sub13_Sub1 local16 = new Class2_Sub13_Sub1(80);
		if (this.aBoolean374) {
			local16.method1353(-1.0F);
			local16.method1353(-1.0F);
			local16.method1353(0.0F);
			local16.method1353(0.0F);
			local16.method1353(1.0F);
			local16.method1353(1.0F);
			local16.method1353(-1.0F);
			local16.method1353(0.0F);
			local16.method1353(1.0F);
			local16.method1353(1.0F);
			local16.method1353(1.0F);
			local16.method1353(1.0F);
			local16.method1353(0.0F);
			local16.method1353(1.0F);
			local16.method1353(0.0F);
			local16.method1353(-1.0F);
			local16.method1353(1.0F);
			local16.method1353(0.0F);
			local16.method1353(0.0F);
			local16.method1353(0.0F);
		} else {
			local16.method1354(-1.0F);
			local16.method1354(-1.0F);
			local16.method1354(0.0F);
			local16.method1354(0.0F);
			local16.method1354(1.0F);
			local16.method1354(1.0F);
			local16.method1354(-1.0F);
			local16.method1354(0.0F);
			local16.method1354(1.0F);
			local16.method1354(1.0F);
			local16.method1354(1.0F);
			local16.method1354(1.0F);
			local16.method1354(0.0F);
			local16.method1354(1.0F);
			local16.method1354(0.0F);
			local16.method1354(-1.0F);
			local16.method1354(1.0F);
			local16.method1354(0.0F);
			local16.method1354(0.0F);
			local16.method1354(0.0F);
		}
		this.anInterface11_7 = this.method4124(local16.anInt4347, false, 20, local16.aByteArray52);
		this.aClass100_14 = new Class100(this.anInterface11_7, 5126, 3, 0);
		this.aClass100_13 = new Class100(this.anInterface11_7, 5126, 2, 12);
		this.aClass77_1.method1743(this);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)I")
	@Override
	public int method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "(I)V")
	private void method4123() {
		Static83.aFloatArray5[2] = this.aFloat60 * this.aFloat77;
		Static83.aFloatArray5[0] = this.aFloat63 * this.aFloat60;
		Static83.aFloatArray5[1] = this.aFloat74 * this.aFloat60;
		Static83.aFloatArray5[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static83.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZI[BI)Lclient!nn;")
	public Interface11 method4124(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		return (Interface11) (this.aBoolean378 && (!arg1 || this.aBoolean364) ? new Class42_Sub1(this, arg2, arg3, arg0, arg1) : new Class83_Sub1(this, arg2, arg3, arg0));
	}

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt5237;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5517(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static138.aFloat23 = arg1;
		Static74.aFloat16 = arg2;
		Static359.aFloat82 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "(I)V")
	private void method4125() {
		if (this.anInt5231 != 3) {
			this.anInt5231 = 3;
			this.method4163();
			this.method4108();
			this.anInt5236 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	public synchronized void method4126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub20 local14 = new Class2_Sub20(arg1);
		local14.aLong225 = arg0;
		this.aClass156_42.method3157(local14);
	}

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "()Z")
	@Override
	public boolean method5552() {
		return this.aClass66_1.method1500();
	}

	@OriginalMember(owner = "client!pg", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method4165();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method4174(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean383) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean383) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(II)V")
	public synchronized void method4127(@OriginalArg(1) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong225 = arg0;
		this.aClass156_45.method3157(local7);
	}

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "(I)V")
	private void method4128() {
		Static83.aFloatArray5[3] = 1.0F;
		Static83.aFloatArray5[1] = this.aFloat74 * this.aFloat59;
		Static83.aFloatArray5[2] = this.aFloat59 * this.aFloat77;
		Static83.aFloatArray5[0] = this.aFloat59 * this.aFloat63;
		OpenGL.glLightfv(16384, 4609, Static83.aFloatArray5, 0);
		Static83.aFloatArray5[1] = this.aFloat74 * -this.aFloat58;
		Static83.aFloatArray5[2] = -this.aFloat58 * this.aFloat77;
		Static83.aFloatArray5[0] = -this.aFloat58 * this.aFloat63;
		Static83.aFloatArray5[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static83.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!pg", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = (float) arg0 * this.aClass31_Sub2_4.aFloat86 + (float) arg1 * this.aClass31_Sub2_4.aFloat95 + this.aClass31_Sub2_4.aFloat88 * (float) arg2 + this.aClass31_Sub2_4.aFloat92;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass31_Sub2_4.aFloat92 + this.aClass31_Sub2_4.aFloat88 * (float) arg5 + (float) arg4 * this.aClass31_Sub2_4.aFloat95 + (float) arg3 * this.aClass31_Sub2_4.aFloat86;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt5239 > local28 && (float) this.anInt5239 > local59 || !(!((float) this.anInt5237 < local28) || !((float) this.anInt5237 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass31_Sub2_4.aFloat90 + (float) arg0 * this.aClass31_Sub2_4.aFloat84 + (float) arg1 * this.aClass31_Sub2_4.aFloat85 + this.aClass31_Sub2_4.aFloat91 * (float) arg2) * (float) this.anInt5248 / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt5248 * (this.aClass31_Sub2_4.aFloat91 * (float) arg5 + (float) arg4 * this.aClass31_Sub2_4.aFloat85 + (float) arg3 * this.aClass31_Sub2_4.aFloat84 + this.aClass31_Sub2_4.aFloat90) / local59);
		if (this.aFloat57 > (float) local123 && this.aFloat57 > (float) local155 || this.aFloat61 < (float) local123 && this.aFloat61 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt5235 * ((float) arg2 * this.aClass31_Sub2_4.aFloat89 + this.aClass31_Sub2_4.aFloat94 * (float) arg1 + this.aClass31_Sub2_4.aFloat93 * (float) arg0 + this.aClass31_Sub2_4.aFloat87) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt5235 * ((float) arg5 * this.aClass31_Sub2_4.aFloat89 + this.aClass31_Sub2_4.aFloat93 * (float) arg3 + (float) arg4 * this.aClass31_Sub2_4.aFloat94 + this.aClass31_Sub2_4.aFloat87) / local59);
			return (!(this.aFloat69 > (float) local213) || !((float) local245 < this.aFloat69)) && (!(this.aFloat75 < (float) local213) || !((float) local245 > this.aFloat75));
		}
	}

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(53) float local53;
		@Pc(41) float local41;
		if (this.aClass20_Sub1_Sub1_3 == null || this.aClass20_Sub1_Sub1_3.anInt2466 < arg2 || arg3 > this.aClass20_Sub1_Sub1_3.anInt2464) {
			this.aClass20_Sub1_Sub1_3 = Static348.method4629(arg2, this, arg3, arg6);
			this.aClass20_Sub1_Sub1_3.method2040(false, false);
			local53 = this.aClass20_Sub1_Sub1_3.aFloat25;
			local41 = this.aClass20_Sub1_Sub1_3.aFloat26;
		} else {
			this.aClass20_Sub1_Sub1_3.method2046(arg2, 6406, false, arg3, arg6);
			local41 = this.aClass20_Sub1_Sub1_3.aFloat26 * (float) arg2 / (float) this.aClass20_Sub1_Sub1_3.anInt2466;
			local53 = (float) arg3 * this.aClass20_Sub1_Sub1_3.aFloat25 / (float) this.aClass20_Sub1_Sub1_3.anInt2464;
		}
		this.method4173();
		this.method4118(this.aClass20_Sub1_Sub1_3);
		this.method4174(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4129(arg5);
		this.method4164(34165, 34165);
		this.method4181(0, 768, 34166);
		this.method4181(2, 770, 5890);
		this.method4135(0, 34166);
		this.method4135(2, 5890);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = local143 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(158) float local158 = (float) arg3 + local146;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local143, local158);
		OpenGL.glTexCoord2f(local53, local41);
		OpenGL.glVertex2f(local151, local158);
		OpenGL.glTexCoord2f(local53, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method4181(0, 768, 5890);
		this.method4181(2, 770, 34166);
		this.method4135(0, 5890);
		this.method4135(2, 34166);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIII)Lclient!ks;")
	@Override
	public Class109 method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean379 ? new Class109_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V")
	public void method4129(@OriginalArg(1) int arg0) {
		Static83.aFloatArray5[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static83.aFloatArray5[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static83.aFloatArray5[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static83.aFloatArray5[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static83.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(Z)V")
	@Override
	public void method5534(@OriginalArg(0) boolean arg0) {
		this.aBoolean361 = arg0;
		this.method4184();
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
	@Override
	public void method5547(@OriginalArg(0) int arg0) {
		this.method4152();
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "()Z")
	@Override
	public boolean method5492() {
		if (this.aClass2_Sub9_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub9_Sub1_1.method871()) {
			if (!this.aClass167_1.method3620(this.aClass2_Sub9_Sub1_1)) {
				return false;
			}
			this.aClass105_1.method2195();
		}
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V")
	private void method4130() {
		if (this.anInt5231 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt5202 > 0 && this.anInt5121 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt5202, (double) this.anInt5121, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt5236 &= 0xFFFFFFE7;
		this.anInt5231 = 1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5526(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)V")
	public void method4131(@OriginalArg(1) int arg0) {
		if (this.anInt5259 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt5259 = arg0;
		}
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)V")
	private void method4132() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt5257; local7++) {
			@Pc(16) Class2_Sub29 local16 = this.aClass2_Sub29Array3[local7];
			Static243.aFloatArray2[0] = local16.method5687();
			@Pc(28) int local28 = local7 + 16386;
			Static243.aFloatArray2[1] = local16.method5695();
			Static243.aFloatArray2[2] = local16.method5693();
			Static243.aFloatArray2[3] = 1.0F;
			OpenGL.glLightfv(local28, 4611, Static243.aFloatArray2, 0);
			@Pc(59) int local59 = local16.method5692();
			@Pc(65) float local65 = local16.method5694() / 255.0F;
			Static243.aFloatArray2[0] = local65 * (float) (local59 >> 16 & 0xFF);
			Static243.aFloatArray2[1] = (float) (local59 >> 8 & 0xFF) * local65;
			Static243.aFloatArray2[2] = local65 * (float) (local59 & 0xFF);
			OpenGL.glLightfv(local28, 4609, Static243.aFloatArray2, 0);
			OpenGL.glLightf(local28, 4617, 1.0F / (float) (local16.method5691() * local16.method5691()));
			OpenGL.glEnable(local28);
		}
		while (this.anInt5240 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt5240 = this.anInt5257;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(FBF)V")
	public void method4133(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat70 = arg1;
		this.aFloat68 = arg0;
		if (!this.aBoolean365) {
			this.method4137();
		}
	}

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "(I)V")
	public void method4134() {
		if (this.anInt5236 == 4) {
			return;
		}
		this.method4130();
		this.method4161(false);
		this.method4177(false);
		this.method4157(false);
		this.method4166(false);
		this.method4139(-2);
		this.method4174(1);
		this.method4107(0);
		this.anInt5236 = 4;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(IIII)V")
	public void method4135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class162 method5557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class162_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)I")
	public int method4136(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!pg", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt5254;
		arg0[2] = this.anInt5251;
		arg0[0] = this.anInt5242;
		arg0[1] = this.anInt5243;
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(Z)V")
	private void method4137() {
		@Pc(15) int local15;
		if (this.aBoolean365) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt5232;
		} else {
			this.aFloat62 = (float) (this.anInt5237 - this.anInt5245) - this.aFloat70;
			this.aFloat66 = this.aFloat62 - this.aFloat68 * (float) this.anInt5241;
			if ((float) this.anInt5239 > this.aFloat66) {
				this.aFloat66 = this.anInt5239;
			}
			OpenGL.glFogf(2915, this.aFloat66);
			OpenGL.glFogf(2916, this.aFloat62);
			local15 = this.anInt5253;
		}
		Static83.aFloatArray5[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static83.aFloatArray5[2] = (float) (local15 & 0xFF) / 255.0F;
		Static83.aFloatArray5[1] = (float) (local15 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static83.aFloatArray5, 0);
		if (this.aBoolean365) {
			this.aClass66_1.aClass63_Sub7_1.method4418();
		}
	}

	@OriginalMember(owner = "client!pg", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4165();
		this.method4174(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt5258 != arg0;
		if (local15 || arg1 != this.aFloat59 || this.aFloat58 != arg2) {
			this.aFloat59 = arg1;
			this.aFloat58 = arg2;
			this.anInt5258 = arg0;
			if (local15) {
				this.aFloat77 = (float) (this.anInt5258 & 0xFF) / 255.0F;
				this.aFloat63 = (float) (this.anInt5258 & 0xFF0000) / 1.671168E7F;
				this.aFloat74 = (float) (this.anInt5258 & 0xFF00) / 65280.0F;
				this.method4123();
			}
			this.method4128();
		}
		if (this.aFloatArray30[0] == arg3 && this.aFloatArray30[1] == arg4 && arg5 == this.aFloatArray30[2]) {
			return;
		}
		this.aFloatArray30[0] = arg3;
		this.aFloatArray30[2] = arg5;
		this.aFloatArray30[1] = arg4;
		this.aFloatArray26[2] = -arg5;
		this.aFloatArray26[0] = -arg3;
		this.aFloatArray26[1] = -arg4;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray27[1] = local142 * arg4;
		this.aFloatArray27[2] = arg5 * local142;
		this.aFloatArray27[0] = local142 * arg3;
		this.aFloatArray29[0] = -this.aFloatArray27[0];
		this.aFloatArray29[1] = -this.aFloatArray27[1];
		this.aFloatArray29[2] = -this.aFloatArray27[2];
		this.method4170();
		this.anInt5256 = (int) (arg3 * 256.0F / arg4);
		this.anInt5262 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(B)V")
	private void method4138() {
		@Pc(6) float[] local6 = this.aFloatArray28;
		@Pc(18) float local18 = (float) (this.anInt5239 * -this.anInt5230) / (float) this.anInt5248;
		@Pc(33) float local33 = (float) ((this.anInt5202 - this.anInt5230) * this.anInt5239) / (float) this.anInt5248;
		@Pc(50) float local50 = (float) (this.anInt5239 * this.anInt5234) / (float) this.anInt5235;
		@Pc(65) float local65 = (float) ((this.anInt5234 - this.anInt5121) * this.anInt5239) / (float) this.anInt5235;
		if (local18 == local33 || local50 == local65) {
			local6[4] = 0.0F;
			local6[2] = 0.0F;
			local6[11] = 0.0F;
			local6[13] = 0.0F;
			local6[9] = 0.0F;
			local6[12] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = 1.0F;
			local6[8] = 0.0F;
			local6[1] = 0.0F;
			local6[14] = 0.0F;
			local6[7] = 0.0F;
			local6[6] = 0.0F;
			local6[10] = 1.0F;
			local6[0] = 1.0F;
			local6[15] = 1.0F;
		} else {
			@Pc(79) float local79 = (float) this.anInt5239 * 2.0F;
			local6[3] = 0.0F;
			local6[2] = 0.0F;
			local6[14] = this.aFloat65 = -(local79 * (float) this.anInt5237) / (float) (this.anInt5237 - this.anInt5239);
			local6[13] = 0.0F;
			local6[0] = local79 / (local33 - local18);
			local6[15] = 0.0F;
			local6[6] = 0.0F;
			local6[1] = 0.0F;
			local6[9] = (local50 + local65) / (-local65 + local50);
			local6[5] = local79 / (local50 - local65);
			local6[12] = 0.0F;
			local6[11] = -1.0F;
			local6[10] = this.aFloat64 = (float) -(this.anInt5239 + this.anInt5237) / (float) (this.anInt5237 - this.anInt5239);
			local6[8] = (local18 + local33) / (local33 - local18);
			local6[7] = 0.0F;
			local6[4] = 0.0F;
		}
		this.method4104();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
	public void method4139(@OriginalArg(0) int arg0) {
		this.method4110(arg0, true);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZLclient!nn;)V")
	public void method4140(@OriginalArg(1) Interface11 arg0) {
		if (this.anInterface11_6 != arg0) {
			if (this.aBoolean378) {
				OpenGL.glBindBufferARB(34962, arg0.method1890());
			}
			this.anInterface11_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!fw;)V")
	public void method4141(@OriginalArg(1) Interface5 arg0) {
		if (this.anInterface5_4 != arg0) {
			if (this.aBoolean378) {
				OpenGL.glBindBufferARB(34963, arg0.method5173());
			}
			this.anInterface5_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "()V")
	@Override
	public void method5505() {
		this.aClass167_1.method3624();
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Lclient!li;I)V")
	public void method4142(@OriginalArg(0) Interface10 arg0) {
		if (this.aBoolean369) {
			this.method4113(arg0);
			this.method4175(arg0);
		} else if (this.anInt5223 < 3) {
			if (this.anInt5223 >= 0) {
				this.anInterface10Array1[this.anInt5223].method1396();
			}
			this.anInterface10_2 = this.anInterface10_1 = this.anInterface10Array1[++this.anInt5223] = arg0;
			this.anInterface10_2.method1399();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "()V")
	@Override
	public void method5498() {
	}

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "(I)Lclient!gi;")
	public Class20_Sub3 method4143() {
		return this.aClass109_Sub1_1 == null ? null : this.aClass109_Sub1_1.method4787();
	}

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "()V")
	@Override
	public void method5562() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!sh;I)V")
	public void method4144(@OriginalArg(0) Class31_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method4801(), 0);
	}

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "()Lclient!c;")
	@Override
	public Class31 method5566() {
		return new Class31_Sub2();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([Lclient!e;Lclient!vk;Lclient!c;[Lclient!rr;I)V")
	@Override
	public void method5556(@OriginalArg(0) Class59[] arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class21_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method5509(arg0, arg2, arg3, arg4);
		this.method5503(arg1);
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(B)V")
	private void method4145() {
		OpenGL.glViewport(this.anInt5255, this.anInt5228, this.anInt5202, this.anInt5121);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V")
	public synchronized void method4146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub20 local8 = new Class2_Sub20(arg1);
		local8.aLong225 = arg0;
		this.aClass156_41.method3157(local8);
	}

	@OriginalMember(owner = "client!pg", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt5121 - arg1 - local12, arg2, 1, 32993, this.anInt5249, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)Lclient!n;")
	@Override
	public Class2_Sub6 method5506(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub6_Sub1 local8 = new Class2_Sub6_Sub1(arg0);
		this.aClass156_39.method3157(local8);
		return local8;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([BIZIB)Lclient!fw;")
	public Interface5 method4147(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return (Interface5) (this.aBoolean378 && (!arg1 || this.aBoolean364) ? new Class42_Sub2(this, 5123, arg0, arg2, arg1) : new Class83_Sub2(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!vk;)V")
	@Override
	public void method5503(@OriginalArg(0) Class256 arg0) {
		this.aClass77_1.method1741(arg0, this);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5518(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(FFZFF)V")
	public void method4148(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static83.aFloatArray5[0] = arg0;
		Static83.aFloatArray5[3] = arg2;
		Static83.aFloatArray5[2] = arg1;
		Static83.aFloatArray5[1] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static83.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "(I)V")
	private void method4149() {
		this.method4139(-2);
		for (@Pc(14) int local14 = this.anInt5250 - 1; local14 >= 0; local14--) {
			this.method4131(local14);
			this.method4118(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method4164(8448, 8448);
		this.method4181(2, 770, 34168);
		this.method4117();
		this.anInt5252 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt5263 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean367 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean372 = true;
		this.method4161(true);
		this.method4177(true);
		this.method4157(true);
		this.method4166(true);
		this.method4179();
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
		this.anInt5258 = this.anInt5253 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!li;B)V")
	public void method4150(@OriginalArg(0) Interface10 arg0) {
		if (this.anInt5222 < 0 || this.anInterface10Array3[this.anInt5222] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface10Array3[this.anInt5222--] = null;
		arg0.method1398();
		if (this.anInt5222 >= 0) {
			this.anInterface10_1 = this.anInterface10Array3[this.anInt5222];
			this.anInterface10_1.method1394();
		} else {
			this.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "()Z")
	@Override
	public boolean method5555() {
		return this.aClass2_Sub9_Sub1_1 != null && this.aClass2_Sub9_Sub1_1.method871();
	}

	@OriginalMember(owner = "client!pg", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4165();
		this.method4174(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pg", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt5254 = this.anInt5121;
		this.anInt5243 = 0;
		this.anInt5242 = 0;
		this.anInt5251 = this.anInt5202;
		OpenGL.glDisable(3089);
		this.method4167();
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5560(@OriginalArg(0) Canvas arg0) {
		this.aLong167 = 0L;
		this.aCanvas5 = null;
		if (arg0 == null || this.aCanvas6 == arg0) {
			this.aCanvas5 = this.aCanvas6;
			this.aLong167 = this.aLong168;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable2.get(arg0);
			this.aLong167 = local36;
			this.aCanvas5 = arg0;
		}
		if (this.aCanvas5 == null || this.aLong167 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong167);
		this.method4106();
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(B)V")
	private void method4152() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static429.method5376(1000L);
		}
	}

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.aBoolean365 = false;
		this.aClass66_1.method1495(false, 0, false, 0, 0);
		this.method4137();
		this.method4183();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!e;Lclient!vk;Lclient!c;Lclient!rr;I)V")
	@Override
	public void method5551(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class21_Sub7 arg3) {
		arg0.method5736(arg2, arg3, 0);
		this.method5503(arg1);
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "()Z")
	@Override
	public boolean method5507() {
		return this.aClass2_Sub9_Sub1_1 != null && (this.anInt5218 <= 1 || this.aBoolean386);
	}

	@OriginalMember(owner = "client!pg", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt5202 < arg2) {
			arg2 = this.anInt5202;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt5121) {
			arg3 = this.anInt5121;
		}
		this.anInt5243 = arg1;
		this.anInt5251 = arg2;
		this.anInt5254 = arg3;
		this.anInt5242 = arg0;
		OpenGL.glEnable(3089);
		this.method4167();
		this.method4159();
	}

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5261 = arg2;
		this.anInt5238 = arg0;
		this.anInt5232 = arg1;
		this.bf = arg3;
		this.aBoolean365 = true;
		this.aClass66_1.method1495(false, 3, false, 0, 0);
		this.aClass66_1.aClass63_Sub7_1.method4419();
		this.method4137();
		this.method4183();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class35 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class35_Sub2 local6 = (Class35_Sub2) arg5;
		@Pc(9) Class20_Sub1_Sub1 local9 = local6.aClass20_Sub1_Sub1_5;
		this.method4173();
		this.method4118(local6.aClass20_Sub1_Sub1_5);
		this.method4174(1);
		this.method4164(7681, 8448);
		this.method4181(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat26 / (float) local9.anInt2477;
		@Pc(46) float local46 = local9.aFloat25 / (float) local9.anInt2476;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method4181(0, 768, 5890);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!li;)V")
	public void method4153(@OriginalArg(1) Interface10 arg0) {
		if (this.anInt5224 < 0 || arg0 != this.anInterface10Array2[this.anInt5224]) {
			throw new RuntimeException();
		}
		this.anInterface10Array2[this.anInt5224--] = null;
		arg0.method1397();
		if (this.anInt5224 >= 0) {
			this.anInterface10_2 = this.anInterface10Array2[this.anInt5224];
			this.anInterface10_2.method1395();
		} else {
			this.anInterface10_2 = null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt5239;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[Lclient!sa;)V")
	@Override
	public void method5536(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub29[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub29Array3[local7] = arg1[local7];
		}
		this.anInt5257 = arg0;
		if (this.anInt5231 != 1) {
			this.method4132();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class13 method5522(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class13_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BF)V")
	public void method4154(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat67) {
			this.aFloat67 = arg0;
			if (this.anInt5231 == 3) {
				this.method4163();
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IJ)V")
	public synchronized void method4155(@OriginalArg(1) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong225 = arg0;
		this.aClass156_46.method3157(local7);
	}

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "(I)V")
	public void method4156() {
		if (this.anInt5236 == 16) {
			return;
		}
		this.method4125();
		this.method4161(true);
		this.method4157(true);
		this.method4166(true);
		this.method4174(1);
		this.method4107(0);
		this.anInt5236 = 16;
	}

	@OriginalMember(owner = "client!pg", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class31 arg0) {
		this.aClass31_Sub2_4 = (Class31_Sub2) arg0;
		this.aClass31_Sub2_3.method4804(this.aClass31_Sub2_4);
		if (this.anInt5231 != 1) {
			this.method4108();
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(ZI)V")
	public void method4157(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean375) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean375 = arg0;
		this.anInt5236 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(III)V")
	public void method4158(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5255 = arg0;
		this.anInt5228 = arg1;
		this.method4145();
		this.method4159();
	}

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "(B)V")
	private void method4159() {
		if (this.anInt5251 >= this.anInt5242 && this.anInt5254 >= this.anInt5243) {
			OpenGL.glScissor(this.anInt5242 + this.anInt5255, -this.anInt5254 + this.anInt5121 + this.anInt5228, this.anInt5251 - this.anInt5242, this.anInt5254 + -this.anInt5243);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!kt;[Lclient!au;Z)Lclient!la;")
	@Override
	public Class92 method5537(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class17[] arg1) {
		return new Class92_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5253 == arg0 && this.anInt5241 == arg1 && arg2 == this.anInt5245) {
			return;
		}
		this.anInt5253 = arg0;
		this.anInt5241 = arg1;
		this.anInt5245 = arg2;
		if (this.aBoolean365) {
			return;
		}
		this.method4137();
		this.method4183();
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "()V")
	@Override
	protected void method5497() {
		for (@Pc(10) Class2 local10 = this.aClass156_39.method3155(); local10 != null; local10 = this.aClass156_39.method3150()) {
			((Class2_Sub6_Sub1) local10).method522();
		}
		if (this.aClass167_1 != null) {
			this.aClass167_1.method3629();
		}
		if (this.anOpenGL1 != null) {
			this.method4119();
			@Pc(40) Enumeration local40 = this.aHashtable2.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable2.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean359) {
			Static228.method2981(false, true);
			this.aBoolean359 = false;
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(BI)I")
	public int method4160(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method4165();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method4174(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean383) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean383) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IZ)V")
	public void method4161(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean381) {
			this.aBoolean381 = arg0;
			this.method4183();
			this.anInt5236 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)I")
	@Override
	public int method5502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BIIZLclient!jaggl/memory/NativeBuffer;)Lclient!nn;")
	public Interface11 method4162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) NativeBuffer arg2) {
		return (Interface11) (this.aBoolean378 ? new Class42_Sub1(this, arg1, arg2, arg0, false) : new Class83_Sub1(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "(I)V")
	private void method4163() {
		@Pc(15) float local15 = this.aFloat67 * (float) -this.anInt5230 / (float) this.anInt5248;
		@Pc(27) float local27 = (float) -this.anInt5234 * this.aFloat67 / (float) this.anInt5235;
		@Pc(47) float local47 = this.aFloat67 * (float) (this.anInt5202 - this.anInt5230) / (float) this.anInt5248;
		@Pc(61) float local61 = (float) (this.anInt5121 - this.anInt5234) * this.aFloat67 / (float) this.anInt5235;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local47 != local15 && local61 != local27) {
			OpenGL.glOrtho((double) local15, (double) local47, (double) -local61, (double) -local27, (double) ((float) this.anInt5239 - this.aFloat72), (double) ((float) this.anInt5237 - this.aFloat72));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(III)V")
	public void method4164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5259 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(26) boolean local26 = false;
		if (arg0 != this.anInt5247) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt5247 = arg0;
			local26 = true;
		}
		if (arg1 != this.anInt5244) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local26 = true;
			this.anInt5244 = arg1;
		}
		if (local26) {
			this.anInt5236 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "()Z")
	@Override
	public boolean method5508() {
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "(B)V")
	private void method4165() {
		if (this.anInt5236 == 1) {
			return;
		}
		this.method4130();
		this.method4161(false);
		this.method4177(false);
		this.method4157(false);
		this.method4166(false);
		this.method4118(null);
		this.method4139(-2);
		this.method4107(1);
		this.anInt5236 = 1;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(IZ)V")
	public void method4166(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean360) {
			this.aBoolean360 = arg0;
			this.method4184();
			this.anInt5236 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pg", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5234 = arg1;
		this.anInt5248 = arg2;
		this.anInt5235 = arg3;
		this.anInt5230 = arg0;
		this.method4138();
		this.method4167();
		if (this.anInt5231 == 3) {
			this.method4163();
		} else if (this.anInt5231 == 2) {
			this.method4172();
		}
	}

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "(I)V")
	private void method4167() {
		this.aFloat75 = this.anInt5254 - this.anInt5234;
		this.aFloat61 = this.anInt5251 - this.anInt5230;
		this.aFloat69 = this.anInt5243 - this.anInt5234;
		this.aFloat57 = this.anInt5242 - this.anInt5230;
	}

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "()Lclient!c;")
	@Override
	public Class31 method5539() {
		return this.aClass31_Sub2_1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!ks;Lclient!ks;FLclient!ks;)Lclient!ks;")
	@Override
	public Class109 method5525(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class109 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean379 && this.aBoolean368) {
			@Pc(15) Class109_Sub1_Sub2 local15 = null;
			@Pc(18) Class109_Sub1 local18 = (Class109_Sub1) arg0;
			@Pc(21) Class109_Sub1 local21 = (Class109_Sub1) arg1;
			@Pc(25) Class20_Sub3 local25 = local18.method4787();
			@Pc(29) Class20_Sub3 local29 = local21.method4787();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local29.anInt2389 < local25.anInt2389 ? local25.anInt2389 : local29.anInt2389;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class109_Sub1_Sub2) {
					@Pc(60) Class109_Sub1_Sub2 local60 = (Class109_Sub1_Sub2) arg3;
					if (local60.method4790() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class109_Sub1_Sub2(this, local48);
				}
				if (local15.method4792(arg2, local25, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "(B)V")
	private void method4168() {
		if (this.aBoolean373 && !this.aBoolean370) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(ZI)V")
	public void method4169(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean370 != arg0) {
			this.aBoolean370 = arg0;
			this.method4168();
		}
	}

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "(B)V")
	public void method4170() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray27, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "(B)V")
	public void method4171() {
		if (this.anInt5236 == 8) {
			return;
		}
		this.method4122();
		this.method4161(true);
		this.method4157(true);
		this.method4166(true);
		this.method4174(1);
		this.method4107(0);
		this.anInt5236 = 8;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	@Override
	public void method5495(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt5217 = arg0;
		this.aClass105_1.method2195();
	}

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "(I)V")
	private void method4172() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray28, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass31_Sub2_4.aFloat92 + this.aClass31_Sub2_4.aFloat88 * (float) arg2 + this.aClass31_Sub2_4.aFloat95 * (float) arg1 + this.aClass31_Sub2_4.aFloat86 * (float) arg0;
		if ((float) this.anInt5239 > local28 || local28 > (float) this.anInt5237) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass31_Sub2_4.aFloat91 * (float) arg2 + (float) arg0 * this.aClass31_Sub2_4.aFloat84 + this.aClass31_Sub2_4.aFloat85 * (float) arg1 + this.aClass31_Sub2_4.aFloat90) * (float) this.anInt5248 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt5235 * (this.aClass31_Sub2_4.aFloat87 + this.aClass31_Sub2_4.aFloat89 * (float) arg2 + this.aClass31_Sub2_4.aFloat94 * (float) arg1 + this.aClass31_Sub2_4.aFloat93 * (float) arg0) / local28);
		if (this.aFloat57 <= (float) local85 && this.aFloat61 >= (float) local85 && (float) local117 >= this.aFloat69 && this.aFloat75 >= (float) local117) {
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat57);
			arg3[1] = (int) ((float) local117 - this.aFloat69);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(Z)V")
	public void method4173() {
		if (this.anInt5236 == 2) {
			return;
		}
		this.method4130();
		this.method4161(false);
		this.method4177(false);
		this.method4157(false);
		this.method4166(false);
		this.method4139(-2);
		this.anInt5236 = 2;
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(II)V")
	public void method4174(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt5252) {
			return;
		}
		@Pc(14) boolean local14;
		@Pc(10) byte local10;
		if (arg0 == 1) {
			local10 = 1;
			local14 = true;
		} else if (arg0 == 2) {
			local14 = false;
			local10 = 2;
		} else if (arg0 == 128) {
			local10 = 3;
			local14 = true;
		} else {
			local10 = 0;
			local14 = false;
		}
		if (!this.aBoolean372) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean372 = true;
		}
		if (this.aBoolean367 != local14) {
			if (local14) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean367 = local14;
		}
		if (this.anInt5263 != local10) {
			if (local10 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local10 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local10 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt5263 = local10;
		}
		this.anInt5252 = arg0;
		this.anInt5236 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!pg", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class35_Sub2 local6 = (Class35_Sub2) arg1;
		@Pc(9) Class20_Sub1_Sub1 local9 = local6.aClass20_Sub1_Sub1_5;
		this.method4173();
		this.method4118(local6.aClass20_Sub1_Sub1_5);
		this.method4174(1);
		this.method4164(7681, 8448);
		this.method4181(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat26 / (float) local9.anInt2477;
		@Pc(46) float local46 = local9.aFloat25 / (float) local9.anInt2476;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt5242 - arg2) * local39, (float) (this.anInt5243 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5242, this.anInt5243);
		OpenGL.glTexCoord2f((float) (this.anInt5242 - arg2) * local39, (float) (this.anInt5254 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5242, this.anInt5254);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5251 - arg2), local46 * (float) (this.anInt5254 - arg3));
		OpenGL.glVertex2i(this.anInt5251, this.anInt5254);
		OpenGL.glTexCoord2f((float) (this.anInt5251 - arg2) * local39, local46 * (float) (this.anInt5243 - arg3));
		OpenGL.glVertex2i(this.anInt5251, this.anInt5243);
		OpenGL.glEnd();
		this.method4181(0, 768, 5890);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean365) {
			throw new RuntimeException("");
		}
		this.anInt5238 = arg0;
		this.bf = arg3;
		this.anInt5232 = arg1;
		this.anInt5261 = arg2;
		this.aClass66_1.aClass63_Sub7_1.method4419();
		this.method4137();
	}

	@OriginalMember(owner = "client!pg", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(6) int local6 = this.anInt5265;
		this.anInt5265 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!au;Z)Lclient!o;")
	@Override
	public Class13 method5549(@OriginalArg(0) Class17 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt342 * arg0.anInt345];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray3 == null) {
			for (local21 = 0; local21 < arg0.anInt345; local21++) {
				for (local25 = 0; local25 < arg0.anInt342; local25++) {
					@Pc(87) int local87 = arg0.anIntArray32[arg0.aByteArray4[local14++] & 0xFF];
					local12[local16++] = local87 == 0 ? 0 : local87 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt345; local21++) {
				for (local25 = 0; local25 < arg0.anInt342; local25++) {
					local12[local16++] = arg0.aByteArray3[local14] << 24 | arg0.anIntArray32[arg0.aByteArray4[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(126) Class13 local126 = this.method5522(local12, arg0.anInt342, arg0.anInt342, arg0.anInt345);
		local126.ha(arg0.anInt341, arg0.anInt344, arg0.anInt343, arg0.anInt346);
		return local126;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5523() {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!li;)V")
	public void method4175(@OriginalArg(1) Interface10 arg0) {
		if (this.anInt5222 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5222 >= 0) {
			this.anInterface10Array3[this.anInt5222].method1398();
		}
		this.anInterface10_1 = this.anInterface10Array3[++this.anInt5222] = arg0;
		this.anInterface10_1.method1394();
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(Z)V")
	private void method4176() {
		this.aClass31_Sub2_4 = new Class31_Sub2();
		this.aClass31_Sub2_3 = new Class31_Sub2();
		this.aClass20Array1 = new Class20[this.anInt5250];
		this.aClass20_Sub1_5 = new Class20_Sub1(this, 3553, 6408, 1, 1);
		new Class20_Sub1(this, 3553, 6408, 1, 1);
		new Class20_Sub1(this, 3553, 6408, 1, 1);
		this.aClass59_Sub1_6 = new Class59_Sub1(this);
		this.aClass59_Sub1_10 = new Class59_Sub1(this);
		this.aClass59_Sub1_2 = new Class59_Sub1(this);
		this.aClass59_Sub1_9 = new Class59_Sub1(this);
		this.aClass59_Sub1_3 = new Class59_Sub1(this);
		this.aClass59_Sub1_4 = new Class59_Sub1(this);
		this.aClass59_Sub1_8 = new Class59_Sub1(this);
		this.aClass59_Sub1_7 = new Class59_Sub1(this);
		this.aClass59_Sub1_5 = new Class59_Sub1(this);
		this.aClass59_Sub1_1 = new Class59_Sub1(this);
		if (this.aBoolean368) {
			this.aClass61_6 = new Class61(this);
			new Class61(this);
		}
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt5239 && this.anInt5237 == arg1) {
			return;
		}
		this.anInt5239 = arg0;
		this.anInt5237 = arg1;
		this.method4138();
		this.method4137();
		if (this.anInt5231 == 3) {
			this.method4163();
			return;
		}
		if (this.anInt5231 != 2) {
			return;
		}
		this.method4172();
	}

	@OriginalMember(owner = "client!pg", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < this.anInt5254) {
			this.anInt5254 = arg3;
		}
		if (arg1 > this.anInt5243) {
			this.anInt5243 = arg1;
		}
		if (arg2 < this.anInt5251) {
			this.anInt5251 = arg2;
		}
		if (this.anInt5242 < arg0) {
			this.anInt5242 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method4167();
		this.method4159();
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(IZ)V")
	public void method4177(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean373) {
			this.aBoolean373 = arg0;
			this.method4168();
			this.anInt5236 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!sh;)V")
	public void method4178(@OriginalArg(1) Class31_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method4801(), 0);
	}

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "(I)V")
	public void method4179() {
		if (this.anInt5231 != 0) {
			this.anInt5231 = 0;
			this.anInt5236 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "(II)I")
	public int method4180(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZIII)V")
	public void method4181(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "()Z")
	@Override
	public boolean method5563() {
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "()Z")
	@Override
	public boolean method5528() {
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()Z")
	@Override
	public boolean method5491() {
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	@Override
	public void method5493(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "()V")
	@Override
	public void method5511() {
		if (!this.aBoolean385 || this.anInt5202 <= 0 || this.anInt5121 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt5242;
		@Pc(22) int local22 = this.anInt5251;
		@Pc(25) int local25 = this.anInt5243;
		@Pc(28) int local28 = this.anInt5254;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4179();
		this.method4161(false);
		this.method4177(false);
		this.method4157(false);
		this.method4166(false);
		this.method4118(null);
		this.method4139(-2);
		this.method4107(1);
		this.method4174(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt5202, this.anInt5121, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ba(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "(I)V")
	public void method4182() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "(I)V")
	private void method4183() {
		if (this.aBoolean381 && this.aBoolean365 | this.anInt5241 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "(I)V")
	private void method4184() {
		OpenGL.glDepthMask(this.aBoolean360 && this.aBoolean361);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!ks;)V")
	@Override
	public void method5561(@OriginalArg(0) Class109 arg0) {
		this.aClass109_Sub1_1 = (Class109_Sub1) arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIF)Lclient!sa;")
	@Override
	public Class2_Sub29 method5542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub29_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}
}
