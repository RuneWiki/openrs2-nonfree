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

@OriginalClass("client!nq")
public final class Class167_Sub1 extends Class167 {

	@OriginalMember(owner = "client!nq", name = "Ub", descriptor = "I")
	private int anInt4773;

	@OriginalMember(owner = "client!nq", name = "Cc", descriptor = "I")
	private int anInt4806;

	@OriginalMember(owner = "client!nq", name = "Kc", descriptor = "I")
	public int anInt4813;

	@OriginalMember(owner = "client!nq", name = "Mc", descriptor = "I")
	public int anInt4815;

	@OriginalMember(owner = "client!nq", name = "te", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!nq", name = "we", descriptor = "I")
	public int anInt4890;

	@OriginalMember(owner = "client!nq", name = "Ce", descriptor = "Lclient!bf;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!nq", name = "Ee", descriptor = "Lclient!bf;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!nq", name = "Fe", descriptor = "I")
	public int anInt4894;

	@OriginalMember(owner = "client!nq", name = "Ge", descriptor = "I")
	private int anInt4895;

	@OriginalMember(owner = "client!nq", name = "He", descriptor = "I")
	public int anInt4896;

	@OriginalMember(owner = "client!nq", name = "Re", descriptor = "Z")
	private boolean aBoolean339;

	@OriginalMember(owner = "client!nq", name = "Se", descriptor = "Lclient!ms;")
	private Interface9 anInterface9_5;

	@OriginalMember(owner = "client!nq", name = "Te", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!nq", name = "Ue", descriptor = "Z")
	public boolean aBoolean340;

	@OriginalMember(owner = "client!nq", name = "Xe", descriptor = "Lclient!wv;")
	public Class137_Sub1 aClass137_Sub1_3;

	@OriginalMember(owner = "client!nq", name = "Ye", descriptor = "Lclient!rd;")
	public Class108_Sub2 aClass108_Sub2_1;

	@OriginalMember(owner = "client!nq", name = "af", descriptor = "Z")
	private boolean aBoolean341;

	@OriginalMember(owner = "client!nq", name = "cf", descriptor = "Z")
	public boolean aBoolean342;

	@OriginalMember(owner = "client!nq", name = "df", descriptor = "J")
	private long aLong158;

	@OriginalMember(owner = "client!nq", name = "ff", descriptor = "I")
	private int anInt4902;

	@OriginalMember(owner = "client!nq", name = "gf", descriptor = "Lclient!gu;")
	public Class11_Sub2 aClass11_Sub2_3;

	@OriginalMember(owner = "client!nq", name = "hf", descriptor = "Lclient!ld;")
	private Class137_Sub1_Sub1 aClass137_Sub1_Sub1_5;

	@OriginalMember(owner = "client!nq", name = "nf", descriptor = "I")
	public int anInt4904;

	@OriginalMember(owner = "client!nq", name = "of", descriptor = "Lclient!rd;")
	public Class108_Sub2 aClass108_Sub2_2;

	@OriginalMember(owner = "client!nq", name = "rf", descriptor = "Z")
	private boolean aBoolean344;

	@OriginalMember(owner = "client!nq", name = "uf", descriptor = "Lclient!m;")
	public Class145 aClass145_11;

	@OriginalMember(owner = "client!nq", name = "zf", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!nq", name = "Af", descriptor = "Lclient!rd;")
	public Class108_Sub2 aClass108_Sub2_3;

	@OriginalMember(owner = "client!nq", name = "Cf", descriptor = "Lclient!rd;")
	public Class108_Sub2 aClass108_Sub2_4;

	@OriginalMember(owner = "client!nq", name = "Df", descriptor = "Lclient!rd;")
	public Class108_Sub2 aClass108_Sub2_5;

	@OriginalMember(owner = "client!nq", name = "If", descriptor = "Z")
	private boolean aBoolean347;

	@OriginalMember(owner = "client!nq", name = "Jf", descriptor = "Lclient!rd;")
	public Class108_Sub2 aClass108_Sub2_6;

	@OriginalMember(owner = "client!nq", name = "Lf", descriptor = "I")
	private int anInt4909;

	@OriginalMember(owner = "client!nq", name = "Nf", descriptor = "I")
	public int anInt4910;

	@OriginalMember(owner = "client!nq", name = "Of", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!nq", name = "Qf", descriptor = "I")
	private int anInt4912;

	@OriginalMember(owner = "client!nq", name = "Rf", descriptor = "I")
	private int anInt4913;

	@OriginalMember(owner = "client!nq", name = "Sf", descriptor = "Lclient!rd;")
	public Class108_Sub2 aClass108_Sub2_7;

	@OriginalMember(owner = "client!nq", name = "Tf", descriptor = "I")
	private int anInt4914;

	@OriginalMember(owner = "client!nq", name = "Uf", descriptor = "Z")
	public boolean aBoolean349;

	@OriginalMember(owner = "client!nq", name = "Vf", descriptor = "[Lclient!lr;")
	private Class137[] aClass137Array1;

	@OriginalMember(owner = "client!nq", name = "Wf", descriptor = "Lclient!vf;")
	private Interface13 anInterface13_4;

	@OriginalMember(owner = "client!nq", name = "Zf", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!nq", name = "ag", descriptor = "Z")
	private boolean aBoolean351;

	@OriginalMember(owner = "client!nq", name = "cg", descriptor = "Z")
	public boolean aBoolean352;

	@OriginalMember(owner = "client!nq", name = "dg", descriptor = "Ljava/lang/String;")
	private String aString53;

	@OriginalMember(owner = "client!nq", name = "fg", descriptor = "Lclient!rd;")
	public Class108_Sub2 aClass108_Sub2_8;

	@OriginalMember(owner = "client!nq", name = "gg", descriptor = "Lclient!gu;")
	public Class11_Sub2 aClass11_Sub2_4;

	@OriginalMember(owner = "client!nq", name = "hg", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!nq", name = "ig", descriptor = "Lclient!ms;")
	private Interface9 anInterface9_6;

	@OriginalMember(owner = "client!nq", name = "jg", descriptor = "Lclient!vt;")
	private Class139_Sub1 aClass139_Sub1_1;

	@OriginalMember(owner = "client!nq", name = "kg", descriptor = "I")
	public int anInt4916;

	@OriginalMember(owner = "client!nq", name = "lg", descriptor = "Ljava/lang/String;")
	private String aString54;

	@OriginalMember(owner = "client!nq", name = "og", descriptor = "Z")
	private boolean aBoolean353;

	@OriginalMember(owner = "client!nq", name = "pg", descriptor = "Z")
	public boolean aBoolean354;

	@OriginalMember(owner = "client!nq", name = "sg", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!nq", name = "tg", descriptor = "Z")
	public boolean aBoolean357;

	@OriginalMember(owner = "client!nq", name = "vg", descriptor = "Z")
	private boolean aBoolean358;

	@OriginalMember(owner = "client!nq", name = "xg", descriptor = "Z")
	public boolean aBoolean359;

	@OriginalMember(owner = "client!nq", name = "zg", descriptor = "Z")
	public boolean aBoolean360;

	@OriginalMember(owner = "client!nq", name = "Ag", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!nq", name = "Bg", descriptor = "Z")
	private boolean aBoolean361;

	@OriginalMember(owner = "client!nq", name = "Cg", descriptor = "I")
	private int anInt4919;

	@OriginalMember(owner = "client!nq", name = "Dg", descriptor = "Lclient!rd;")
	public Class108_Sub2 aClass108_Sub2_9;

	@OriginalMember(owner = "client!nq", name = "Fg", descriptor = "Z")
	private boolean aBoolean362;

	@OriginalMember(owner = "client!nq", name = "Hg", descriptor = "Lclient!sk;")
	public Class224 aClass224_4;

	@OriginalMember(owner = "client!nq", name = "Jg", descriptor = "Lclient!rd;")
	public Class108_Sub2 aClass108_Sub2_10;

	@OriginalMember(owner = "client!nq", name = "Lg", descriptor = "I")
	private int anInt4923;

	@OriginalMember(owner = "client!nq", name = "Mg", descriptor = "Lclient!m;")
	public Class145 aClass145_12;

	@OriginalMember(owner = "client!nq", name = "Ng", descriptor = "F")
	private float aFloat79;

	@OriginalMember(owner = "client!nq", name = "Og", descriptor = "I")
	private int anInt4924;

	@OriginalMember(owner = "client!nq", name = "Qg", descriptor = "I")
	private int anInt4926;

	@OriginalMember(owner = "client!nq", name = "Rg", descriptor = "I")
	public int anInt4927;

	@OriginalMember(owner = "client!nq", name = "Tg", descriptor = "Z")
	public boolean aBoolean363;

	@OriginalMember(owner = "client!nq", name = "Xg", descriptor = "F")
	private float aFloat80;

	@OriginalMember(owner = "client!nq", name = "Zg", descriptor = "F")
	private float aFloat82;

	@OriginalMember(owner = "client!nq", name = "bh", descriptor = "I")
	private int anInt4931;

	@OriginalMember(owner = "client!nq", name = "ch", descriptor = "I")
	private int anInt4932;

	@OriginalMember(owner = "client!nq", name = "dh", descriptor = "Z")
	private boolean aBoolean366;

	@OriginalMember(owner = "client!nq", name = "eh", descriptor = "I")
	private int anInt4933;

	@OriginalMember(owner = "client!nq", name = "gh", descriptor = "I")
	private int anInt4934;

	@OriginalMember(owner = "client!nq", name = "xb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!nq", name = "me", descriptor = "I")
	public int anInt4887 = 128;

	@OriginalMember(owner = "client!nq", name = "je", descriptor = "Lclient!ch;")
	private final Class33 aClass33_1 = new Class33();

	@OriginalMember(owner = "client!nq", name = "oe", descriptor = "Lclient!gu;")
	private final Class11_Sub2 aClass11_Sub2_1 = new Class11_Sub2();

	@OriginalMember(owner = "client!nq", name = "pe", descriptor = "Lclient!gu;")
	public final Class11_Sub2 aClass11_Sub2_2 = new Class11_Sub2();

	@OriginalMember(owner = "client!nq", name = "qe", descriptor = "Z")
	private boolean aBoolean338 = false;

	@OriginalMember(owner = "client!nq", name = "ue", descriptor = "I")
	public int anInt4889 = 8;

	@OriginalMember(owner = "client!nq", name = "se", descriptor = "I")
	public int anInt4888 = 3;

	@OriginalMember(owner = "client!nq", name = "re", descriptor = "Lclient!ps;")
	private final Class193 aClass193_39 = new Class193();

	@OriginalMember(owner = "client!nq", name = "ze", descriptor = "[Lclient!bf;")
	private final Interface2[] anInterface2Array1 = new Interface2[4];

	@OriginalMember(owner = "client!nq", name = "Ae", descriptor = "[Lclient!bf;")
	private final Interface2[] anInterface2Array2 = new Interface2[4];

	@OriginalMember(owner = "client!nq", name = "Be", descriptor = "I")
	private int anInt4893 = -1;

	@OriginalMember(owner = "client!nq", name = "ye", descriptor = "I")
	private int anInt4892 = -1;

	@OriginalMember(owner = "client!nq", name = "xe", descriptor = "I")
	private int anInt4891 = -1;

	@OriginalMember(owner = "client!nq", name = "De", descriptor = "[Lclient!bf;")
	private final Interface2[] anInterface2Array3 = new Interface2[4];

	@OriginalMember(owner = "client!nq", name = "Ie", descriptor = "Lclient!ps;")
	private final Class193 aClass193_40;

	@OriginalMember(owner = "client!nq", name = "Je", descriptor = "Lclient!ps;")
	private final Class193 aClass193_41;

	@OriginalMember(owner = "client!nq", name = "Ke", descriptor = "Lclient!ps;")
	private final Class193 aClass193_42;

	@OriginalMember(owner = "client!nq", name = "Le", descriptor = "Lclient!ps;")
	private final Class193 aClass193_43;

	@OriginalMember(owner = "client!nq", name = "Me", descriptor = "Lclient!ps;")
	private final Class193 aClass193_44;

	@OriginalMember(owner = "client!nq", name = "Ne", descriptor = "Lclient!ps;")
	private final Class193 aClass193_45;

	@OriginalMember(owner = "client!nq", name = "Oe", descriptor = "Lclient!ps;")
	private final Class193 aClass193_46;

	@OriginalMember(owner = "client!nq", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!nq", name = "Pe", descriptor = "I")
	public int anInt4897;

	@OriginalMember(owner = "client!nq", name = "kf", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!nq", name = "Ze", descriptor = "I")
	private int anInt4901;

	@OriginalMember(owner = "client!nq", name = "Ve", descriptor = "I")
	public int anInt4899;

	@OriginalMember(owner = "client!nq", name = "Ef", descriptor = "I")
	public int anInt4907;

	@OriginalMember(owner = "client!nq", name = "eg", descriptor = "I")
	public int anInt4915;

	@OriginalMember(owner = "client!nq", name = "xf", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!nq", name = "bg", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!nq", name = "vf", descriptor = "F")
	private float aFloat64;

	@OriginalMember(owner = "client!nq", name = "Gf", descriptor = "I")
	public int anInt4908;

	@OriginalMember(owner = "client!nq", name = "mg", descriptor = "I")
	private int anInt4917;

	@OriginalMember(owner = "client!nq", name = "Yf", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!nq", name = "wg", descriptor = "F")
	private float aFloat75;

	@OriginalMember(owner = "client!nq", name = "Mf", descriptor = "[F")
	private final float[] aFloatArray28;

	@OriginalMember(owner = "client!nq", name = "qf", descriptor = "I")
	private int anInt4905;

	@OriginalMember(owner = "client!nq", name = "ug", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!nq", name = "ef", descriptor = "[F")
	private final float[] aFloatArray24;

	@OriginalMember(owner = "client!nq", name = "Xf", descriptor = "Z")
	private boolean aBoolean350;

	@OriginalMember(owner = "client!nq", name = "yg", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!nq", name = "Ff", descriptor = "[F")
	public final float[] aFloatArray27;

	@OriginalMember(owner = "client!nq", name = "Ig", descriptor = "I")
	public int anInt4921;

	@OriginalMember(owner = "client!nq", name = "ng", descriptor = "I")
	private int anInt4918;

	@OriginalMember(owner = "client!nq", name = "Pf", descriptor = "I")
	public int anInt4911;

	@OriginalMember(owner = "client!nq", name = "Sg", descriptor = "I")
	private int anInt4928;

	@OriginalMember(owner = "client!nq", name = "jf", descriptor = "I")
	public int anInt4903;

	@OriginalMember(owner = "client!nq", name = "Eg", descriptor = "I")
	public int anInt4920;

	@OriginalMember(owner = "client!nq", name = "Yg", descriptor = "F")
	private float aFloat81;

	@OriginalMember(owner = "client!nq", name = "Pg", descriptor = "I")
	public int anInt4925;

	@OriginalMember(owner = "client!nq", name = "sf", descriptor = "[F")
	private final float[] aFloatArray25;

	@OriginalMember(owner = "client!nq", name = "mf", descriptor = "[Lclient!be;")
	private final Class3_Sub7[] aClass3_Sub7Array2;

	@OriginalMember(owner = "client!nq", name = "Qe", descriptor = "I")
	private int anInt4898;

	@OriginalMember(owner = "client!nq", name = "Hf", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!nq", name = "wf", descriptor = "[F")
	private final float[] aFloatArray26;

	@OriginalMember(owner = "client!nq", name = "Wg", descriptor = "I")
	private int anInt4929;

	@OriginalMember(owner = "client!nq", name = "Gg", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!nq", name = "Kg", descriptor = "I")
	public int anInt4922;

	@OriginalMember(owner = "client!nq", name = "Bf", descriptor = "I")
	private int anInt4906;

	@OriginalMember(owner = "client!nq", name = "ah", descriptor = "I")
	private int anInt4930;

	@OriginalMember(owner = "client!nq", name = "pf", descriptor = "Lclient!ns;")
	public Class3_Sub25_Sub2 aClass3_Sub25_Sub2_3;

	@OriginalMember(owner = "client!nq", name = "hh", descriptor = "[I")
	public int[] anIntArray318;

	@OriginalMember(owner = "client!nq", name = "fh", descriptor = "[B")
	public final byte[] aByteArray87;

	@OriginalMember(owner = "client!nq", name = "ih", descriptor = "[I")
	public int[] anIntArray319;

	@OriginalMember(owner = "client!nq", name = "jh", descriptor = "[I")
	public int[] anIntArray320;

	@OriginalMember(owner = "client!nq", name = "fe", descriptor = "I")
	public final int anInt4884;

	@OriginalMember(owner = "client!nq", name = "dd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas6;

	@OriginalMember(owner = "client!nq", name = "Ic", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!nq", name = "ee", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!nq", name = "U", descriptor = "J")
	private final long aLong156;

	@OriginalMember(owner = "client!nq", name = "qc", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!nq", name = "We", descriptor = "I")
	public final int anInt4900;

	@OriginalMember(owner = "client!nq", name = "Kf", descriptor = "Z")
	public boolean aBoolean348;

	@OriginalMember(owner = "client!nq", name = "yf", descriptor = "Z")
	private boolean aBoolean346;

	@OriginalMember(owner = "client!nq", name = "rg", descriptor = "Z")
	public boolean aBoolean356;

	@OriginalMember(owner = "client!nq", name = "Vg", descriptor = "Z")
	public boolean aBoolean365;

	@OriginalMember(owner = "client!nq", name = "Ug", descriptor = "Z")
	private boolean aBoolean364;

	@OriginalMember(owner = "client!nq", name = "tf", descriptor = "Z")
	public boolean aBoolean345;

	@OriginalMember(owner = "client!nq", name = "lf", descriptor = "Z")
	public boolean aBoolean343;

	@OriginalMember(owner = "client!nq", name = "qg", descriptor = "Z")
	private final boolean aBoolean355;

	@OriginalMember(owner = "client!nq", name = "he", descriptor = "Lclient!jr;")
	public final Class122 aClass122_1;

	@OriginalMember(owner = "client!nq", name = "ve", descriptor = "Lclient!ra;")
	public final Class205 aClass205_1;

	@OriginalMember(owner = "client!nq", name = "le", descriptor = "Lclient!mc;")
	private final Class147 aClass147_1;

	@OriginalMember(owner = "client!nq", name = "ie", descriptor = "Lclient!rc;")
	private Class3_Sub39_Sub1 aClass3_Sub39_Sub1_1;

	@OriginalMember(owner = "client!nq", name = "ne", descriptor = "Lclient!hf;")
	private final Class97 aClass97_1;

	static {
		new Class174("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;ILclient!dq;)V")
	public Class167_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class51 arg4) {
		super(arg0, arg2);
		new Class65();
		new Class140(16);
		this.aClass193_40 = new Class193();
		this.aClass193_41 = new Class193();
		this.aClass193_42 = new Class193();
		this.aClass193_43 = new Class193();
		this.aClass193_44 = new Class193();
		this.aClass193_45 = new Class193();
		this.aClass193_46 = new Class193();
		this.bf = 0;
		this.anInt4897 = 512;
		this.aFloat63 = 3584.0F;
		this.anInt4901 = 8448;
		this.anInt4899 = -1;
		this.anInt4907 = 50;
		this.anInt4915 = -1;
		this.aFloat65 = -1.0F;
		this.aFloat71 = 1.0F;
		this.aFloat64 = 0.0F;
		this.anInt4908 = 0;
		this.anInt4917 = 0;
		this.aFloat69 = 1.0F;
		this.aFloat75 = 1.0F;
		this.aFloatArray28 = new float[4];
		this.anInt4905 = 0;
		this.aFloat74 = -1.0F;
		this.aFloatArray24 = new float[16];
		this.aBoolean350 = true;
		this.aFloat76 = 3000.0F;
		this.aFloatArray27 = new float[4];
		this.anInt4921 = 0;
		this.anInt4918 = -1;
		this.anInt4911 = 3584;
		this.anInt4928 = 0;
		this.anInt4903 = 512;
		this.anInt4920 = 0;
		this.aFloat81 = 1.0F;
		this.anInt4925 = 0;
		this.aFloatArray25 = new float[4];
		this.aClass3_Sub7Array2 = new Class3_Sub7[Static142.anInt2557];
		this.anInt4898 = 8448;
		this.aFloat67 = 3584.0F;
		this.aFloatArray26 = new float[4];
		this.anInt4929 = -1;
		this.aFloat78 = 1.0F;
		this.anInt4922 = -1;
		this.anInt4906 = 0;
		this.anInt4930 = 0;
		this.aClass3_Sub25_Sub2_3 = new Class3_Sub25_Sub2(8192);
		this.anIntArray318 = new int[1];
		this.aByteArray87 = new byte[16384];
		this.anIntArray319 = new int[1];
		this.anIntArray320 = new int[1];
		this.anInt4884 = arg3;
		this.aCanvas5 = this.aCanvas6 = arg1;
		try {
			if (Static163.aBoolean475 == null || !Static163.aBoolean475) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static163.aBoolean475 = Boolean.TRUE;
				} else {
					@Pc(276) String local276 = System.getProperty("os.name").toLowerCase();
					if (!local276.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local276.startsWith("linux") || local276.startsWith("sunos")) {
						System.load(arg4.method1362("libjaggl.so").toString());
					} else if (local276.startsWith("mac")) {
						System.load(arg4.method1362("libjaggl.jnilib").toString());
					} else if (local276.startsWith("win")) {
						System.load(arg4.method1362("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static163.aBoolean475 = Boolean.TRUE;
				}
			}
			if (Static163.aBoolean475 == null || !Static163.aBoolean475) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong157 = this.aLong156 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt4884);
			if (this.aLong156 == 0L) {
				throw new RuntimeException("");
			}
			this.method4000();
			@Pc(377) int local377 = this.method4050();
			if (local377 != 0) {
				throw new RuntimeException("");
			}
			this.anInt4900 = this.aBoolean349 ? 33639 : 5121;
			@Pc(404) int local404;
			if (this.aString54.indexOf("radeon") != -1) {
				local404 = 0;
				@Pc(406) boolean local406 = false;
				@Pc(408) boolean local408 = false;
				@Pc(417) String[] local417 = Static403.method5514(this.aString54.replace('/', ' '), ' ');
				for (@Pc(419) int local419 = 0; local419 < local417.length; local419++) {
					@Pc(425) String local425 = local417[local419];
					try {
						if (local425.length() > 0) {
							if (local425.charAt(0) == 'x' && local425.length() >= 3 && Static38.method611(local425.substring(1, 3))) {
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
								if (local425.length() >= 4 && Static38.method611(local425.substring(0, 4))) {
									local404 = Static160.method2518(local425.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(497) Exception local497) {
					}
				}
				if (!local408 && !local406) {
					if (local404 >= 7000 && local404 <= 9250) {
						this.aBoolean348 = false;
					}
					if (local404 >= 7000 && local404 <= 7999) {
						this.aBoolean346 = false;
					}
				}
				if (!local406 || local404 < 4000) {
					this.aBoolean356 = false;
				}
				this.aBoolean365 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean364 = this.aBoolean346;
				this.aBoolean345 = true;
			}
			if (this.aString53.indexOf("intel") != -1) {
				this.aBoolean343 = false;
			}
			this.aBoolean355 = !this.aString53.equals("s3 graphics");
			if (this.aBoolean346) {
				try {
					@Pc(582) int[] local582 = new int[1];
					OpenGL.glGenBuffersARB(1, local582, 0);
				} catch (@Pc(588) Throwable local588) {
					throw new RuntimeException("");
				}
			}
			Static176.method2835(false, true);
			this.aBoolean338 = true;
			this.aClass122_1 = new Class122(this, super.anInterface7_8);
			this.method4003();
			this.aClass205_1 = new Class205(this);
			this.aClass147_1 = new Class147(this);
			if (this.aClass147_1.method3560()) {
				this.aClass3_Sub39_Sub1_1 = new Class3_Sub39_Sub1(this);
				if (!this.aClass3_Sub39_Sub1_1.method4928()) {
					this.aClass3_Sub39_Sub1_1.method4924();
					this.aClass3_Sub39_Sub1_1 = null;
				}
			}
			this.aClass97_1 = new Class97(this);
			this.method4032();
			this.method3995();
			OpenGL.glClear(16640);
			local404 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(667) Exception local667) {
					if (local404++ > 5) {
						throw new RuntimeException("");
					}
					Static83.method1499(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(685) Throwable local685) {
			local685.printStackTrace();
			this.method6014();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!nq", name = "N", descriptor = "(IIII)[I")
	@Override
	public int[] N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt4815 - local12 - arg1, arg2, 1, 32993, this.anInt4900, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)V")
	public void method3966() {
		if (this.anInt4912 == 16) {
			return;
		}
		this.method4013();
		this.method4022(true);
		this.method4017(true);
		this.method4036(true);
		this.method4040(1);
		this.method3998(0);
		this.anInt4912 = 16;
	}

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "()Z")
	@Override
	public boolean method6027() {
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "v", descriptor = "()V")
	@Override
	public void method6005() {
		this.method4036(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!nq", name = "s", descriptor = "()F")
	@Override
	public float s() {
		return this.aFloat70;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!fq;)V")
	@Override
	public void method5976(@OriginalArg(0) Class77 arg0) {
		this.aClass33_1.method917(arg0, this);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIF)Lclient!be;")
	@Override
	public Class3_Sub7 method6025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub7_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)V")
	public void method3968(@OriginalArg(0) int arg0) {
		this.method4038(arg0, true);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5997(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "()Z")
	@Override
	public boolean method5949() {
		return false;
	}

	@OriginalMember(owner = "client!nq", name = "Z", descriptor = "()I")
	@Override
	public int Z() {
		@Pc(6) int local6 = this.anInt4934;
		this.anInt4934 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZB)V")
	public void method3971(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean362) {
			this.aBoolean362 = arg0;
			this.method3982();
			this.anInt4912 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "(I)V")
	public void method3972() {
		if (this.anInt4923 != 0) {
			this.anInt4912 &= 0xFFFFFFE0;
			this.anInt4923 = 0;
		}
	}

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "(IIII)V")
	@Override
	public void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 > this.anInt4815) {
			arg3 = this.anInt4815;
		}
		if (arg2 > this.anInt4813) {
			arg2 = this.anInt4813;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt4928 = arg1;
		this.anInt4905 = arg3;
		this.anInt4930 = arg0;
		this.anInt4917 = arg2;
		OpenGL.glEnable(3089);
		this.method4010();
		this.method4041();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BFFFF)V")
	public void method3973(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static424.aFloatArray32[2] = arg3;
		Static424.aFloatArray32[3] = arg2;
		Static424.aFloatArray32[1] = arg0;
		Static424.aFloatArray32[0] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static424.aFloatArray32, 0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIBI)V")
	public void method3974(@OriginalArg(0) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)I")
	@Override
	public int method6006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!nq", name = "XA", descriptor = "(III[I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass11_Sub2_3.aFloat38 + this.aClass11_Sub2_3.aFloat40 * (float) arg2 + this.aClass11_Sub2_3.aFloat47 * (float) arg0 + (float) arg1 * this.aClass11_Sub2_3.aFloat45;
		if ((float) this.anInt4907 > local28 || (float) this.anInt4911 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt4897 * (this.aClass11_Sub2_3.aFloat46 + this.aClass11_Sub2_3.aFloat37 * (float) arg1 + this.aClass11_Sub2_3.aFloat42 * (float) arg0 + (float) arg2 * this.aClass11_Sub2_3.aFloat44) / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt4903 * (this.aClass11_Sub2_3.aFloat41 * (float) arg0 + (float) arg1 * this.aClass11_Sub2_3.aFloat43 + (float) arg2 * this.aClass11_Sub2_3.aFloat39 + this.aClass11_Sub2_3.aFloat36) / local28);
		if (this.aFloat73 <= (float) local85 && this.aFloat68 >= (float) local85 && this.aFloat62 <= (float) local117 && (float) local117 <= this.aFloat77) {
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat73);
			arg3[1] = (int) ((float) local117 - this.aFloat62);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!nq", name = "GA", descriptor = "(ILclient!i;II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class14_Sub1 local6 = (Class14_Sub1) arg1;
		@Pc(9) Class137_Sub1_Sub1 local9 = local6.aClass137_Sub1_Sub1_1;
		this.method4049();
		this.method4028(local6.aClass137_Sub1_Sub1_1);
		this.method4040(1);
		this.method3983(7681, 8448);
		this.method4012(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat58 / (float) local9.anInt3918;
		@Pc(46) float local46 = local9.aFloat57 / (float) local9.anInt3919;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt4930 - arg2) * local39, local46 * (float) (this.anInt4928 - arg3));
		OpenGL.glVertex2i(this.anInt4930, this.anInt4928);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4930 - arg2), (float) (this.anInt4905 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4930, this.anInt4905);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4917 - arg2), (float) (this.anInt4905 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4917, this.anInt4905);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4917 - arg2), (float) (this.anInt4928 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4917, this.anInt4928);
		OpenGL.glEnd();
		this.method4012(5890, 768, 0);
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(Z)V")
	public void method3975() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "(I)V")
	private void method3976() {
		if (this.aFloat70 == 0.0F) {
			this.aFloatArray24[10] = this.aFloat80;
			this.aFloatArray24[14] = this.aFloat82;
		} else {
			@Pc(27) float local27 = this.aFloat76 / (this.aFloat70 + this.aFloat76);
			@Pc(31) float local31 = local27 * local27;
			@Pc(48) float local48 = (1.0F - local27) * -this.aFloat82 * (1.0F - local27) / this.aFloat70;
			this.aFloatArray24[10] = this.aFloat80 + local48;
			this.aFloatArray24[14] = local31 * this.aFloat82;
		}
		this.aFloat67 = (float) this.anInt4911 - this.aFloat70;
		this.aFloat63 = ((float) -this.anInt4911 + this.aFloatArray24[14]) / this.aFloatArray24[10];
	}

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "()Z")
	@Override
	public boolean method6028() {
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)V")
	public void method3977(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean361) {
			this.aBoolean361 = arg0;
			this.method3982();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)I")
	public int method3978(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method6007(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class3_Sub30 local19;
		while (!this.aClass193_41.method4529()) {
			local19 = (Class3_Sub30) this.aClass193_41.method4521();
			Static123.anIntArray101[local7++] = (int) local19.aLong248;
			this.anInt4894 -= local19.anInt3957;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static123.anIntArray101, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static123.anIntArray101, 0);
			local7 = 0;
		}
		while (!this.aClass193_42.method4529()) {
			local19 = (Class3_Sub30) this.aClass193_42.method4521();
			Static123.anIntArray101[local7++] = (int) local19.aLong248;
			this.anInt4896 -= local19.anInt3957;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static123.anIntArray101, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static123.anIntArray101, 0);
			local7 = 0;
		}
		while (!this.aClass193_43.method4529()) {
			local19 = (Class3_Sub30) this.aClass193_43.method4521();
			Static123.anIntArray101[local7++] = local19.anInt3957;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static123.anIntArray101, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static123.anIntArray101, 0);
			local7 = 0;
		}
		while (!this.aClass193_44.method4529()) {
			local19 = (Class3_Sub30) this.aClass193_44.method4521();
			Static123.anIntArray101[local7++] = (int) local19.aLong248;
			this.anInt4895 -= local19.anInt3957;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static123.anIntArray101, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static123.anIntArray101, 0);
		}
		while (!this.aClass193_40.method4529()) {
			local19 = (Class3_Sub30) this.aClass193_40.method4521();
			OpenGL.glDeleteLists((int) local19.aLong248, local19.anInt3957);
		}
		@Pc(215) Class3 local215;
		while (!this.aClass193_45.method4529()) {
			local215 = this.aClass193_45.method4521();
			OpenGL.glDeleteProgramARB((int) local215.aLong248);
		}
		while (!this.aClass193_46.method4529()) {
			local215 = this.aClass193_46.method4521();
			OpenGL.glDeleteObjectARB(local215.aLong248);
		}
		while (!this.aClass193_40.method4529()) {
			local19 = (Class3_Sub30) this.aClass193_40.method4521();
			OpenGL.glDeleteLists((int) local19.aLong248, local19.anInt3957);
		}
		this.aClass122_1.method3078();
		if (this.xa() > 100663296 && this.aLong158 + 60000L < Static354.method4966()) {
			System.gc();
			this.aLong158 = Static354.method4966();
		}
		this.anInt4890 = local11;
	}

	@OriginalMember(owner = "client!nq", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		return this.anInt4895 + this.anInt4896 + this.anInt4894;
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(B)V")
	private void method3980() {
		@Pc(6) float[] local6 = this.aFloatArray24;
		@Pc(18) float local18 = (float) (-this.anInt4925 * this.anInt4907) / (float) this.anInt4897;
		@Pc(37) float local37 = (float) ((this.anInt4813 - this.anInt4925) * this.anInt4907) / (float) this.anInt4897;
		@Pc(48) float local48 = (float) (this.anInt4921 * this.anInt4907) / (float) this.anInt4903;
		@Pc(63) float local63 = (float) ((this.anInt4921 - this.anInt4815) * this.anInt4907) / (float) this.anInt4903;
		if (local37 == local18 || local48 == local63) {
			local6[14] = 0.0F;
			local6[5] = 1.0F;
			local6[1] = 0.0F;
			local6[6] = 0.0F;
			local6[10] = 1.0F;
			local6[0] = 1.0F;
			local6[3] = 0.0F;
			local6[2] = 0.0F;
			local6[12] = 0.0F;
			local6[9] = 0.0F;
			local6[15] = 1.0F;
			local6[8] = 0.0F;
			local6[4] = 0.0F;
			local6[13] = 0.0F;
			local6[7] = 0.0F;
			local6[11] = 0.0F;
		} else {
			@Pc(77) float local77 = (float) this.anInt4907 * 2.0F;
			local6[13] = 0.0F;
			local6[15] = 0.0F;
			local6[14] = this.aFloat82 = -((float) this.anInt4911 * local77) / (float) (this.anInt4911 - this.anInt4907);
			local6[9] = (local63 + local48) / (-local63 + local48);
			local6[5] = local77 / (local48 - local63);
			local6[1] = 0.0F;
			local6[12] = 0.0F;
			local6[6] = 0.0F;
			local6[7] = 0.0F;
			local6[0] = local77 / (local37 - local18);
			local6[11] = -1.0F;
			local6[2] = 0.0F;
			local6[3] = 0.0F;
			local6[8] = (local37 + local18) / (local37 - local18);
			local6[4] = 0.0F;
			local6[10] = this.aFloat80 = (float) -(this.anInt4911 + this.anInt4907) / (float) (this.anInt4911 - this.anInt4907);
		}
		this.method3976();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!gu;I)V")
	public void method3981(@OriginalArg(0) Class11_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method2183(), 0);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V")
	@Override
	public void method6011(@OriginalArg(0) boolean arg0) {
		this.aBoolean350 = arg0;
		this.method4052();
	}

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "(I)V")
	private void method3982() {
		if (this.aBoolean362 && !this.aBoolean361) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIB)V")
	public void method3983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4926 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (arg0 != this.anInt4901) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local17 = true;
			this.anInt4901 = arg0;
		}
		if (arg1 != this.anInt4898) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local17 = true;
			this.anInt4898 = arg1;
		}
		if (local17) {
			this.anInt4912 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!vf;)V")
	public void method3984(@OriginalArg(1) Interface13 arg0) {
		if (this.anInterface13_4 != arg0) {
			if (this.aBoolean346) {
				OpenGL.glBindBufferARB(34963, arg0.method4217());
			}
			this.anInterface13_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!nq", name = "la", descriptor = "(IFFFFF)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt4918;
		if (local15 || this.aFloat74 != arg1 || arg2 != this.aFloat65) {
			this.aFloat74 = arg1;
			this.aFloat65 = arg2;
			this.anInt4918 = arg0;
			if (local15) {
				this.aFloat71 = (float) (this.anInt4918 & 0xFF0000) / 1.671168E7F;
				this.aFloat69 = (float) (this.anInt4918 & 0xFF) / 255.0F;
				this.aFloat78 = (float) (this.anInt4918 & 0xFF00) / 65280.0F;
				this.method4011();
			}
			this.method3991();
		}
		if (this.aFloatArray25[0] == arg3 && arg4 == this.aFloatArray25[1] && this.aFloatArray25[2] == arg5) {
			return;
		}
		this.aFloatArray25[0] = arg3;
		this.aFloatArray25[2] = arg5;
		this.aFloatArray25[1] = arg4;
		this.aFloatArray26[0] = -arg3;
		this.aFloatArray26[1] = -arg4;
		this.aFloatArray26[2] = -arg5;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray27[2] = arg5 * local142;
		this.aFloatArray27[0] = arg3 * local142;
		this.aFloatArray27[1] = local142 * arg4;
		this.aFloatArray28[1] = -this.aFloatArray27[1];
		this.aFloatArray28[2] = -this.aFloatArray27[2];
		this.aFloatArray28[0] = -this.aFloatArray27[0];
		this.method3994();
		this.anInt4916 = (int) (arg3 * 256.0F / arg4);
		this.anInt4904 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!nq", name = "y", descriptor = "()Z")
	@Override
	public boolean method6019() {
		return this.aClass3_Sub39_Sub1_1 != null && this.aClass3_Sub39_Sub1_1.method4913();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZII)V")
	public synchronized void method3985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub30 local8 = new Class3_Sub30(arg0);
		local8.aLong248 = arg1;
		this.aClass193_41.method4527(local8);
	}

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(B)V")
	private void method3986() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZZB)V")
	public void method3987(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (this.anInt4909 != arg0) {
			if (arg0 < 0) {
				this.method4051();
				this.method4028(null);
				this.method3998(0);
				if (!this.aBoolean342) {
					this.aClass97_1.method2333(0, 0, arg1, arg2, 0);
				}
			} else {
				@Pc(45) Class137_Sub1 local45 = this.aClass122_1.method3081(arg0);
				@Pc(51) Class105 local51 = super.anInterface7_8.method4417(arg0);
				if (local51.aByte40 == 0 && local51.aByte38 == 0) {
					this.method4051();
				} else {
					@Pc(72) int local72 = local51.aBoolean232 ? 64 : 128;
					@Pc(76) int local76 = local72 * 50;
					this.method4037(0.0F, (float) (local51.aByte40 * (this.anInt4890 % local76)) / (float) local76, (float) (this.anInt4890 % local76 * local51.aByte38) / (float) local76);
				}
				if (this.aBoolean342) {
					this.method4028(local45);
					this.method3998(local51.anInt3012);
				} else {
					this.aClass97_1.method2333(local51.anInt3013, local51.aByte37, arg1, arg2, local51.aByte41);
					if (!this.aClass97_1.method2331(local45, local51.anInt3012)) {
						this.method4028(local45);
						this.method3998(local51.anInt3012);
					}
				}
			}
			this.anInt4909 = arg0;
		}
		this.anInt4912 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!nq", name = "U", descriptor = "()I")
	@Override
	public int U() {
		@Pc(6) int local6 = this.anInt4933;
		this.anInt4933 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "()Z")
	@Override
	public boolean method6024() {
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(Z)V")
	private void method3988() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass11_Sub2_3.method2183(), 0);
		if (this.aBoolean342) {
			this.aClass97_1.aClass38_Sub2_1.method1153();
		}
		this.method3994();
		this.method4027();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BIZLclient!jaggl/memory/NativeBuffer;I)Lclient!ms;")
	public Interface9 method3989(@OriginalArg(1) int arg0, @OriginalArg(3) NativeBuffer arg1, @OriginalArg(4) int arg2) {
		return (Interface9) (this.aBoolean346 ? new Class8_Sub1(this, arg0, arg1, arg2, false) : new Class89_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass147_1.method3553(arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLclient!bf;)V")
	public void method3990(@OriginalArg(1) Interface2 arg0) {
		if (this.anInt4893 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4893 >= 0) {
			this.anInterface2Array3[this.anInt4893].method5222();
		}
		this.anInterface2_1 = this.anInterface2Array3[++this.anInt4893] = arg0;
		this.anInterface2_1.method5219();
	}

	@OriginalMember(owner = "client!nq", name = "MA", descriptor = "(F)V")
	@Override
	public void MA(@OriginalArg(0) float arg0) {
		if (this.aFloat66 != arg0) {
			this.aFloat66 = arg0;
			this.method4011();
		}
	}

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "(B)V")
	private void method3991() {
		Static424.aFloatArray32[0] = this.aFloat74 * this.aFloat71;
		Static424.aFloatArray32[3] = 1.0F;
		Static424.aFloatArray32[1] = this.aFloat74 * this.aFloat78;
		Static424.aFloatArray32[2] = this.aFloat74 * this.aFloat69;
		OpenGL.glLightfv(16384, 4609, Static424.aFloatArray32, 0);
		Static424.aFloatArray32[0] = this.aFloat71 * -this.aFloat65;
		Static424.aFloatArray32[2] = this.aFloat69 * -this.aFloat65;
		Static424.aFloatArray32[3] = 1.0F;
		Static424.aFloatArray32[1] = this.aFloat78 * -this.aFloat65;
		OpenGL.glLightfv(16385, 4609, Static424.aFloatArray32, 0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!bf;Z)V")
	public void method3992(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt4892 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4892 >= 0) {
			this.anInterface2Array2[this.anInt4892].method5221();
		}
		this.anInterface2_2 = this.anInterface2Array2[++this.anInt4892] = arg0;
		this.anInterface2_2.method5217();
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(BI)V")
	public void method3993(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt4926) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt4926 = arg0;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5955(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nq", name = "ha", descriptor = "(III)V")
	@Override
	public void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4915 == arg0 && arg1 == this.anInt4922 && this.anInt4920 == arg2) {
			return;
		}
		this.anInt4920 = arg2;
		this.anInt4922 = arg1;
		this.anInt4915 = arg0;
		if (!this.aBoolean342) {
			this.method4048();
			this.method4019();
		}
	}

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "(B)V")
	public void method3994() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray27, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIII)Lclient!lo;")
	@Override
	public Class139 method5980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean363 ? new Class139_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II[[I[[IIII)Lclient!o;")
	@Override
	public Class55 method6017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class55_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "(B)V")
	private void method3995() {
		if (this.aCanvas5 == null) {
			this.anInt4773 = this.anInt4806 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas5.getSize();
			this.anInt4773 = local10.width;
			this.anInt4806 = local10.height;
		}
		if (this.anInterface2_1 == null) {
			this.anInt4813 = this.anInt4773;
			this.anInt4815 = this.anInt4806;
			this.method4004();
		}
		this.method3972();
		this.H();
	}

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "(I)V")
	@Override
	public void method6022(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "()V")
	@Override
	public void method5991() {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method6012(@OriginalArg(0) Class11 arg0) {
		this.aClass11_Sub2_3 = (Class11_Sub2) arg0;
		this.aClass11_Sub2_4.method2186(this.aClass11_Sub2_3);
		if (this.anInt4923 != 1) {
			this.method3988();
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IIBI)V")
	public void method3997(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([IIIII)Lclient!aa;")
	@Override
	public Class2 method6021(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class2_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(II)V")
	public void method3998(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method3983(7681, 7681);
		} else if (arg0 == 0) {
			this.method3983(8448, 8448);
		} else if (arg0 == 2) {
			this.method3983(34165, 7681);
		} else if (arg0 == 3) {
			this.method3983(260, 8448);
		} else if (arg0 == 4) {
			this.method3983(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(II)V")
	public synchronized void method3999(@OriginalArg(0) int arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong248 = arg0;
		this.aClass193_45.method4527(local7);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4897 = arg2;
		this.anInt4903 = arg3;
		this.anInt4921 = arg1;
		this.anInt4925 = arg0;
		this.method3980();
		this.method4010();
		if (this.anInt4923 == 3) {
			this.method4014();
		} else if (this.anInt4923 == 2) {
			this.method4042();
			return;
		}
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(Z)V")
	@Override
	public void method6020(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "(B)V")
	private void method4000() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static83.method1499(1000L);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([BIIZI)Lclient!ms;")
	public Interface9 method4001(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		return (Interface9) (this.aBoolean346 && (!arg2 || this.aBoolean364) ? new Class8_Sub1(this, arg3, arg0, arg1, arg2) : new Class89_Sub1(this, arg3, arg0, arg1));
	}

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "(IIII)V")
	@Override
	public void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4929 = arg1;
		this.anInt4927 = arg0;
		this.anInt4899 = arg2;
		this.anInt4908 = arg3;
		this.aBoolean342 = true;
		this.aClass97_1.method2333(0, 3, false, false, 0);
		this.aClass97_1.aClass38_Sub2_1.method1153();
		this.method4048();
		this.method4019();
	}

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "(B)V")
	private void method4002() {
		if (this.anInt4912 == 1) {
			return;
		}
		this.method4016();
		this.method4022(false);
		this.method3971(false);
		this.method4017(false);
		this.method4036(false);
		this.method4028(null);
		this.method3968(-2);
		this.method3998(1);
		this.anInt4912 = 1;
	}

	@OriginalMember(owner = "client!nq", name = "IA", descriptor = "(IIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4917 > arg2) {
			this.anInt4917 = arg2;
		}
		if (arg1 > this.anInt4928) {
			this.anInt4928 = arg1;
		}
		if (this.anInt4905 > arg3) {
			this.anInt4905 = arg3;
		}
		if (this.anInt4930 < arg0) {
			this.anInt4930 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method4010();
		this.method4041();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5998(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static321.aFloat89 = arg0;
		Static298.aFloat85 = arg2;
		Static60.aFloat17 = arg1;
	}

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "()Z")
	@Override
	public boolean method5969() {
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "(I)V")
	private void method4003() {
		this.aClass11_Sub2_3 = new Class11_Sub2();
		this.aClass11_Sub2_4 = new Class11_Sub2();
		this.aClass137Array1 = new Class137[this.anInt4910];
		this.aClass137_Sub1_3 = new Class137_Sub1(this, 3553, 6408, 1, 1);
		new Class137_Sub1(this, 3553, 6408, 1, 1);
		new Class137_Sub1(this, 3553, 6408, 1, 1);
		this.aClass108_Sub2_7 = new Class108_Sub2(this);
		this.aClass108_Sub2_4 = new Class108_Sub2(this);
		this.aClass108_Sub2_3 = new Class108_Sub2(this);
		this.aClass108_Sub2_8 = new Class108_Sub2(this);
		this.aClass108_Sub2_1 = new Class108_Sub2(this);
		this.aClass108_Sub2_2 = new Class108_Sub2(this);
		this.aClass108_Sub2_6 = new Class108_Sub2(this);
		this.aClass108_Sub2_9 = new Class108_Sub2(this);
		this.aClass108_Sub2_5 = new Class108_Sub2(this);
		this.aClass108_Sub2_10 = new Class108_Sub2(this);
		if (this.aBoolean343) {
			this.aClass224_4 = new Class224(this);
			new Class224(this);
		}
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(IIIII)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4002();
		this.method4040(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)I")
	@Override
	public int method5967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "(I)V")
	private void method4004() {
		OpenGL.glViewport(this.anInt4906, this.bf, this.anInt4813, this.anInt4815);
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "()Z")
	@Override
	public boolean method5962() {
		return this.aClass97_1.method2332();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!nd;IIII)Lclient!ka;")
	@Override
	public Class108 method5984(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class108_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6002() {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIZ)Lclient!aa;")
	@Override
	public Class2 method5974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class2_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6013(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5994();
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(III)V")
	public void method4005(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.bf = arg1;
		this.anInt4906 = arg0;
		this.method4004();
		this.method4041();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!bf;I)V")
	public void method4006(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt4893 < 0 || arg0 != this.anInterface2Array3[this.anInt4893]) {
			throw new RuntimeException();
		}
		this.anInterface2Array3[this.anInt4893--] = null;
		arg0.method5222();
		if (this.anInt4893 >= 0) {
			this.anInterface2_1 = this.anInterface2Array3[this.anInt4893];
			this.anInterface2_1.method5219();
		} else {
			this.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IJ)V")
	public synchronized void method4007(@OriginalArg(1) long arg0) {
		@Pc(16) Class3 local16 = new Class3();
		local16.aLong248 = arg0;
		this.aClass193_46.method4527(local16);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Lclient!bf;I)V")
	public void method4008(@OriginalArg(0) Interface2 arg0) {
		if (this.aBoolean354) {
			this.method4035(arg0);
			this.method4006(arg0);
		} else if (this.anInt4891 >= 0 && this.anInterface2Array1[this.anInt4891] == arg0) {
			this.anInterface2Array1[this.anInt4891--] = null;
			arg0.method5220();
			if (this.anInt4891 >= 0) {
				this.anInterface2_2 = this.anInterface2_1 = this.anInterface2Array1[this.anInt4891];
				this.anInterface2_2.method5218();
			} else {
				this.anInterface2_2 = this.anInterface2_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "(I)V")
	@Override
	public void l(@OriginalArg(0) int arg0) {
		this.method4040(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "(I)V")
	private void method4010() {
		this.aFloat62 = this.anInt4928 - this.anInt4921;
		this.aFloat68 = this.anInt4917 - this.anInt4925;
		this.aFloat77 = this.anInt4905 - this.anInt4921;
		this.aFloat73 = this.anInt4930 - this.anInt4925;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4002();
		this.method4040(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "(B)V")
	private void method4011() {
		Static424.aFloatArray32[0] = this.aFloat71 * this.aFloat66;
		Static424.aFloatArray32[1] = this.aFloat78 * this.aFloat66;
		Static424.aFloatArray32[3] = 1.0F;
		Static424.aFloatArray32[2] = this.aFloat66 * this.aFloat69;
		OpenGL.glLightModelfv(2899, Static424.aFloatArray32, 0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ju;[Lclient!mn;Z)Lclient!ba;")
	@Override
	public Class18 method5995(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class154[] arg1) {
		return new Class18_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!nq", name = "x", descriptor = "()V")
	@Override
	protected void method6014() {
		for (@Pc(6) Class3 local6 = this.aClass193_39.method4519(); local6 != null; local6 = this.aClass193_39.method4525()) {
			((Class3_Sub26_Sub1) local6).method2992();
		}
		if (this.aClass147_1 != null) {
			this.aClass147_1.method3555();
		}
		if (this.anOpenGL1 != null) {
			this.method3986();
			@Pc(40) Enumeration local40 = this.aHashtable2.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable2.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean338) {
			Static80.method1439(false, true);
			this.aBoolean338 = false;
		}
	}

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "()I")
	@Override
	public int method5986() {
		return 4;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIILclient!i;II)V")
	@Override
	public void method5954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class14 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class14_Sub1 local6 = (Class14_Sub1) arg5;
		@Pc(9) Class137_Sub1_Sub1 local9 = local6.aClass137_Sub1_Sub1_1;
		this.method4049();
		this.method4028(local6.aClass137_Sub1_Sub1_1);
		this.method4040(1);
		this.method3983(7681, 8448);
		this.method4012(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat58 / (float) local9.anInt3918;
		@Pc(46) float local46 = local9.aFloat57 / (float) local9.anInt3919;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method4012(5890, 768, 0);
	}

	@OriginalMember(owner = "client!nq", name = "S", descriptor = "(IIIII)V")
	@Override
	protected void S(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(IIII)V")
	public void method4012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "(B)V")
	private void method4013() {
		if (this.anInt4923 != 3) {
			this.anInt4923 = 3;
			this.method4014();
			this.method3988();
			this.anInt4912 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "(I)V")
	private void method4014() {
		@Pc(15) float local15 = this.aFloat81 * (float) -this.anInt4925 / (float) this.anInt4897;
		@Pc(27) float local27 = (float) -this.anInt4921 * this.aFloat81 / (float) this.anInt4903;
		@Pc(42) float local42 = (float) (this.anInt4813 - this.anInt4925) * this.aFloat81 / (float) this.anInt4897;
		@Pc(56) float local56 = (float) (this.anInt4815 - this.anInt4921) * this.aFloat81 / (float) this.anInt4903;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local42 && local27 != local56) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local56, (double) -local27, (double) ((float) this.anInt4907 - this.aFloat70), (double) ((float) this.anInt4911 - this.aFloat70));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "()V")
	@Override
	public void method5987() {
		if (!this.aBoolean355 || this.anInt4813 <= 0 || this.anInt4815 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt4930;
		@Pc(22) int local22 = this.anInt4917;
		@Pc(25) int local25 = this.anInt4928;
		@Pc(28) int local28 = this.anInt4905;
		this.H();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3972();
		this.method4022(false);
		this.method3971(false);
		this.method4017(false);
		this.method4036(false);
		this.method4028(null);
		this.method3968(-2);
		this.method3998(1);
		this.method4040(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt4813, this.anInt4815, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.w(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ms;I)V")
	public void method4015(@OriginalArg(0) Interface9 arg0) {
		if (this.anInterface9_6 != arg0) {
			if (this.aBoolean346) {
				OpenGL.glBindBufferARB(34962, arg0.method2080());
			}
			this.anInterface9_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!nq", name = "u", descriptor = "()V")
	@Override
	public void method5994() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "()Z")
	@Override
	public boolean method5961() {
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!mn;Z)Lclient!aa;")
	@Override
	public Class2 method5993(@OriginalArg(0) Class154 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt4359 * arg0.anInt4358];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray74 == null) {
			for (local21 = 0; local21 < arg0.anInt4359; local21++) {
				for (local25 = 0; local25 < arg0.anInt4358; local25++) {
					@Pc(38) int local38 = arg0.anIntArray287[arg0.aByteArray73[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt4359; local21++) {
				for (local25 = 0; local25 < arg0.anInt4358; local25++) {
					local12[local16++] = arg0.aByteArray74[local14] << 24 | arg0.anIntArray287[arg0.aByteArray73[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(118) Class2 local118 = this.method6021(local12, arg0.anInt4358, arg0.anInt4358, arg0.anInt4359);
		local118.l(arg0.anInt4356, arg0.anInt4354, arg0.anInt4357, arg0.anInt4355);
		return local118;
	}

	@OriginalMember(owner = "client!nq", name = "s", descriptor = "(I)V")
	private void method4016() {
		if (this.anInt4923 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt4813 > 0 && this.anInt4815 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt4813, (double) this.anInt4815, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt4912 &= 0xFFFFFFE7;
		this.anInt4923 = 1;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IZ)V")
	public void method4017(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean351 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt4912 &= 0xFFFFFFE0;
		this.aBoolean351 = arg0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIILclient!vf;I)V")
	public void method4018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface13 arg2) {
		@Pc(7) int local7 = arg2.method4214();
		@Pc(14) int local14 = arg0 * this.method3978(local7);
		this.method3984(arg2);
		OpenGL.glDrawElements(4, arg1, local7, (long) local14 + arg2.method4216());
	}

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(Z)V")
	private void method4019() {
		if (this.aBoolean339 && this.anInt4922 >= 0 | this.aBoolean342) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "(B)V")
	public void method4020() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(IZ)V")
	public synchronized void method4021(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub30 local14 = new Class3_Sub30(arg0);
		this.aClass193_43.method4527(local14);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
	@Override
	public void method5953(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt4887 = arg0;
		this.aClass122_1.method3079();
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(ZB)V")
	public void method4022(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean339) {
			this.aBoolean339 = arg0;
			this.method4019();
			this.anInt4912 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(II)I")
	public int method4023(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!nq", name = "K", descriptor = "(I)V")
	@Override
	public void K(@OriginalArg(0) int arg0) {
		this.anInt4888 = 0;
		while (arg0 > 1) {
			this.anInt4888++;
			arg0 >>= 0x1;
		}
		this.anInt4889 = 0x1 << this.anInt4888;
	}

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "()V")
	@Override
	public void method6008() {
		this.aClass147_1.method3552();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!bf;)V")
	public void method4024(@OriginalArg(1) Interface2 arg0) {
		if (this.aBoolean354) {
			this.method3992(arg0);
			this.method3990(arg0);
		} else if (this.anInt4891 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt4891 >= 0) {
				this.anInterface2Array1[this.anInt4891].method5220();
			}
			this.anInterface2_2 = this.anInterface2_1 = this.anInterface2Array1[++this.anInt4891] = arg0;
			this.anInterface2_2.method5218();
		}
	}

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "(I)V")
	public void method4025() {
		if (this.anInt4912 == 4) {
			return;
		}
		this.method4016();
		this.method4022(false);
		this.method3971(false);
		this.method4017(false);
		this.method4036(false);
		this.method3968(-2);
		this.method4040(1);
		this.method3998(0);
		this.anInt4912 = 4;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([Lclient!ka;Lclient!n;[Lclient!st;I)V")
	@Override
	public void method6015(@OriginalArg(0) Class108[] arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class23_Sub6[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method4931(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5970(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas6 == arg0) {
			local5 = this.aLong156;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable2.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas5 == arg0) {
			this.method3995();
		}
	}

	@OriginalMember(owner = "client!nq", name = "M", descriptor = "(IIIIII)V")
	@Override
	public void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method4002();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method4040(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean353) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean353) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!nq", name = "PA", descriptor = "(FF)V")
	@Override
	public void PA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat76 && this.aFloat70 == arg1) {
			return;
		}
		this.aFloat76 = arg0;
		this.aFloat70 = arg1;
		this.method3976();
		if (this.anInt4923 == 3) {
			this.method4014();
			return;
		}
		if (this.anInt4923 != 2) {
			return;
		}
		this.method4042();
	}

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "()Z")
	@Override
	public boolean method5990() {
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "()Lclient!n;")
	@Override
	public Class11 method5975() {
		return new Class11_Sub2();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II[I[I)Lclient!i;")
	@Override
	public Class14 method5964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static387.method5396(arg2, arg3, this, arg0, arg1);
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6023(@OriginalArg(0) Canvas arg0) {
		this.aLong157 = 0L;
		this.aCanvas5 = null;
		if (arg0 == null || this.aCanvas6 == arg0) {
			this.aCanvas5 = this.aCanvas6;
			this.aLong157 = this.aLong156;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable2.get(arg0);
			this.aLong157 = local36;
			this.aCanvas5 = arg0;
		}
		if (this.aCanvas5 == null || this.aLong157 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong157);
		this.method3995();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!lo;)V")
	@Override
	public void method5982(@OriginalArg(0) Class139 arg0) {
		this.aClass139_Sub1_1 = (Class139_Sub1) arg0;
	}

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "()V")
	@Override
	public void r() {
		this.aBoolean342 = false;
		this.aClass97_1.method2333(0, 0, false, false, 0);
		this.method4048();
		this.method4019();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([Lclient!ka;Lclient!fq;Lclient!n;[Lclient!st;I)V")
	@Override
	public void method5950(@OriginalArg(0) Class108[] arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class23_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method6015(arg0, arg2, arg3, arg4);
		this.method5976(arg1);
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "()Z")
	@Override
	public boolean method5963() {
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(BI)V")
	public void method4026(@OriginalArg(1) int arg0) {
		Static424.aFloatArray32[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static424.aFloatArray32[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static424.aFloatArray32[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static424.aFloatArray32[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static424.aFloatArray32, 0);
	}

	@OriginalMember(owner = "client!nq", name = "u", descriptor = "(I)V")
	private void method4027() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt4924; local7++) {
			@Pc(14) Class3_Sub7 local14 = this.aClass3_Sub7Array2[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static429.aFloatArray33[0] = local14.method2483();
			Static429.aFloatArray33[1] = local14.method2476();
			Static429.aFloatArray33[2] = local14.method2481();
			Static429.aFloatArray33[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static429.aFloatArray33, 0);
			@Pc(52) int local52 = local14.method2480();
			@Pc(58) float local58 = local14.method2479() / 255.0F;
			Static429.aFloatArray33[2] = (float) (local52 & 0xFF) * local58;
			Static429.aFloatArray33[1] = (float) (local52 >> 8 & 0xFF) * local58;
			Static429.aFloatArray33[0] = (float) (local52 >> 16 & 0xFF) * local58;
			OpenGL.glLightfv(local18, 4609, Static429.aFloatArray33, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method2478() * local14.method2478()));
			OpenGL.glEnable(local18);
		}
		while (local7 < this.anInt4931) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt4931 = this.anInt4924;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!lr;I)V")
	public void method4028(@OriginalArg(0) Class137 arg0) {
		@Pc(11) Class137 local11 = this.aClass137Array1[this.anInt4926];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt7136);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt7136);
				} else if (local11.anInt7136 != arg0.anInt7136) {
					OpenGL.glDisable(local11.anInt7136);
					OpenGL.glEnable(arg0.anInt7136);
				}
				OpenGL.glBindTexture(arg0.anInt7136, arg0.method5785());
			}
			this.aClass137Array1[this.anInt4926] = arg0;
		}
		this.anInt4912 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBI)V")
	public synchronized void method4029(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub30 local14 = new Class3_Sub30(arg1);
		local14.aLong248 = arg0;
		this.aClass193_42.method4527(local14);
	}

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(II)I")
	public int method4030(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "()Z")
	@Override
	public boolean method5988() {
		return this.aBoolean353 && (!this.method6019() || this.aBoolean358);
	}

	@OriginalMember(owner = "client!nq", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.anInt4907;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!w;)V")
	@Override
	public void method5965(@OriginalArg(0) Class3_Sub26 arg0) {
		this.aNativeHeap2 = ((Class3_Sub26_Sub1) arg0).aNativeHeap1;
		if (this.anInterface9_5 != null) {
			return;
		}
		@Pc(16) Class3_Sub25_Sub2 local16 = new Class3_Sub25_Sub2(80);
		if (this.aBoolean349) {
			local16.method4128(-1.0F);
			local16.method4128(-1.0F);
			local16.method4128(0.0F);
			local16.method4128(0.0F);
			local16.method4128(1.0F);
			local16.method4128(1.0F);
			local16.method4128(-1.0F);
			local16.method4128(0.0F);
			local16.method4128(1.0F);
			local16.method4128(1.0F);
			local16.method4128(1.0F);
			local16.method4128(1.0F);
			local16.method4128(0.0F);
			local16.method4128(1.0F);
			local16.method4128(0.0F);
			local16.method4128(-1.0F);
			local16.method4128(1.0F);
			local16.method4128(0.0F);
			local16.method4128(0.0F);
			local16.method4128(0.0F);
		} else {
			local16.method4130(-1.0F);
			local16.method4130(-1.0F);
			local16.method4130(0.0F);
			local16.method4130(0.0F);
			local16.method4130(1.0F);
			local16.method4130(1.0F);
			local16.method4130(-1.0F);
			local16.method4130(0.0F);
			local16.method4130(1.0F);
			local16.method4130(1.0F);
			local16.method4130(1.0F);
			local16.method4130(1.0F);
			local16.method4130(0.0F);
			local16.method4130(1.0F);
			local16.method4130(0.0F);
			local16.method4130(-1.0F);
			local16.method4130(1.0F);
			local16.method4130(0.0F);
			local16.method4130(0.0F);
			local16.method4130(0.0F);
		}
		this.anInterface9_5 = this.method4001(local16.aByteArray88, local16.anInt4974, false, 20);
		this.aClass145_12 = new Class145(this.anInterface9_5, 5126, 3, 0);
		this.aClass145_11 = new Class145(this.anInterface9_5, 5126, 2, 12);
		this.aClass33_1.method919(this);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!lo;Lclient!lo;FLclient!lo;)Lclient!lo;")
	@Override
	public Class139 method5973(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class139 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean363 && this.aBoolean343) {
			@Pc(15) Class139_Sub1_Sub1 local15 = null;
			@Pc(18) Class139_Sub1 local18 = (Class139_Sub1) arg0;
			@Pc(21) Class139_Sub1 local21 = (Class139_Sub1) arg1;
			@Pc(25) Class137_Sub4 local25 = local18.method5201();
			@Pc(29) Class137_Sub4 local29 = local21.method5201();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt7153 <= local29.anInt7153 ? local29.anInt7153 : local25.anInt7153;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class139_Sub1_Sub1) {
					@Pc(60) Class139_Sub1_Sub1 local60 = (Class139_Sub1_Sub1) arg3;
					if (local60.method4481() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class139_Sub1_Sub1(this, local48);
				}
				if (local15.method4480(local29, local25, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!nq", name = "sa", descriptor = "()I")
	@Override
	public int sa() {
		return this.anInt4911;
	}

	@OriginalMember(owner = "client!nq", name = "BA", descriptor = "(IIIII)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4002();
		this.method4040(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "(B)V")
	public void method4031() {
		if (this.anInt4912 == 8) {
			return;
		}
		this.method4046();
		this.method4022(true);
		this.method4017(true);
		this.method4036(true);
		this.method4040(1);
		this.method3998(0);
		this.anInt4912 = 8;
	}

	@OriginalMember(owner = "client!nq", name = "v", descriptor = "(I)V")
	private void method4032() {
		this.method3968(-2);
		for (@Pc(18) int local18 = this.anInt4910 - 1; local18 >= 0; local18--) {
			this.method3993(local18);
			this.method4028(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method3983(8448, 8448);
		this.method4012(34168, 770, 2);
		this.method4051();
		this.anInt4919 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt4902 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean366 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean347 = true;
		this.method4022(true);
		this.method3971(true);
		this.method4017(true);
		this.method4036(true);
		this.method3972();
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
		this.anInt4918 = this.anInt4915 = -1;
		this.H();
	}

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "(I)Lclient!us;")
	public Class137_Sub4 method4033() {
		return this.aClass139_Sub1_1 == null ? null : this.aClass139_Sub1_1.method5201();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(FFZ)V")
	public void method4034(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat64 = arg1;
		this.aFloat75 = arg0;
		if (!this.aBoolean342) {
			this.method4048();
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(ILclient!bf;)V")
	public void method4035(@OriginalArg(1) Interface2 arg0) {
		if (this.anInt4892 < 0 || arg0 != this.anInterface2Array2[this.anInt4892]) {
			throw new RuntimeException();
		}
		this.anInterface2Array2[this.anInt4892--] = null;
		arg0.method5221();
		if (this.anInt4892 < 0) {
			this.anInterface2_2 = null;
		} else {
			this.anInterface2_2 = this.anInterface2Array2[this.anInt4892];
			this.anInterface2_2.method5217();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BZ)V")
	public void method4036(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean341 != arg0) {
			this.aBoolean341 = arg0;
			this.method4052();
			this.anInt4912 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(FZFF)V")
	private void method4037(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean344) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg2, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean344 = true;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "()V")
	@Override
	public void method5957() {
		if (this.aClass3_Sub39_Sub1_1 != null && this.aClass3_Sub39_Sub1_1.method4913()) {
			this.aClass147_1.method3558(this.aClass3_Sub39_Sub1_1);
			this.aClass122_1.method3079();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZI)V")
	public void method4038(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3987(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Lclient!gu;I)V")
	public void method4039(@OriginalArg(0) Class11_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method2183(), 0);
	}

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "([I)V")
	@Override
	public void p(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt4905;
		arg0[0] = this.anInt4930;
		arg0[1] = this.anInt4928;
		arg0[2] = this.anInt4917;
	}

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "(II)V")
	public void method4040(@OriginalArg(0) int arg0) {
		if (this.anInt4919 == arg0) {
			return;
		}
		@Pc(25) boolean local25;
		@Pc(23) byte local23;
		if (arg0 == 1) {
			local23 = 1;
			local25 = true;
		} else if (arg0 == 2) {
			local23 = 2;
			local25 = false;
		} else if (arg0 == 128) {
			local25 = true;
			local23 = 3;
		} else {
			local25 = false;
			local23 = 0;
		}
		if (!this.aBoolean347) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean347 = true;
		}
		if (this.aBoolean366 != local25) {
			if (local25) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean366 = local25;
		}
		if (local23 != this.anInt4902) {
			if (local23 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local23 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local23 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt4902 = local23;
		}
		this.anInt4919 = arg0;
		this.anInt4912 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)V")
	@Override
	public void method6000(@OriginalArg(0) int arg0) {
		this.method4000();
	}

	@OriginalMember(owner = "client!nq", name = "x", descriptor = "(I)V")
	private void method4041() {
		if (this.anInt4917 >= this.anInt4930 && this.anInt4928 <= this.anInt4905) {
			OpenGL.glScissor(this.anInt4930 + this.anInt4906, this.bf - (-this.anInt4815 - -this.anInt4905), this.anInt4917 - this.anInt4930, this.anInt4905 + -this.anInt4928);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "(II)V")
	@Override
	public void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt4907 && arg1 == this.anInt4911) {
			return;
		}
		this.anInt4911 = arg1;
		this.anInt4907 = arg0;
		this.method3980();
		this.method4048();
		if (this.anInt4923 == 3) {
			this.method4014();
		} else if (this.anInt4923 == 2) {
			this.method4042();
			return;
		}
	}

	@OriginalMember(owner = "client!nq", name = "TA", descriptor = "(IIIIII)Z")
	@Override
	public boolean TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass11_Sub2_3.aFloat40 * (float) arg2 + (float) arg1 * this.aClass11_Sub2_3.aFloat45 + this.aClass11_Sub2_3.aFloat47 * (float) arg0 + this.aClass11_Sub2_3.aFloat38;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass11_Sub2_3.aFloat40 * (float) arg5 + this.aClass11_Sub2_3.aFloat45 * (float) arg4 + this.aClass11_Sub2_3.aFloat47 * (float) arg3 + this.aClass11_Sub2_3.aFloat38;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt4907 && (float) this.anInt4907 > local59 || !(!((float) this.anInt4911 < local28) || !((float) this.anInt4911 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt4897 * (this.aClass11_Sub2_3.aFloat46 + (float) arg0 * this.aClass11_Sub2_3.aFloat42 + (float) arg1 * this.aClass11_Sub2_3.aFloat37 + this.aClass11_Sub2_3.aFloat44 * (float) arg2) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt4897 * (this.aClass11_Sub2_3.aFloat46 + this.aClass11_Sub2_3.aFloat44 * (float) arg5 + (float) arg3 * this.aClass11_Sub2_3.aFloat42 + this.aClass11_Sub2_3.aFloat37 * (float) arg4) / local59);
		if (this.aFloat73 > (float) local123 && (float) local155 < this.aFloat73 || this.aFloat68 < (float) local123 && this.aFloat68 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt4903 * (this.aClass11_Sub2_3.aFloat36 + (float) arg2 * this.aClass11_Sub2_3.aFloat39 + this.aClass11_Sub2_3.aFloat41 * (float) arg0 + this.aClass11_Sub2_3.aFloat43 * (float) arg1) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt4903 * (this.aClass11_Sub2_3.aFloat39 * (float) arg5 + (float) arg4 * this.aClass11_Sub2_3.aFloat43 + (float) arg3 * this.aClass11_Sub2_3.aFloat41 + this.aClass11_Sub2_3.aFloat36) / local59);
			return (!((float) local213 < this.aFloat62) || !(this.aFloat62 > (float) local245)) && (!((float) local213 > this.aFloat77) || !((float) local245 > this.aFloat77));
		}
	}

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "()Z")
	@Override
	public boolean method5977() {
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)Lclient!w;")
	@Override
	public Class3_Sub26 method6004(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub26_Sub1 local8 = new Class3_Sub26_Sub1(arg0);
		this.aClass193_39.method4527(local8);
		return local8;
	}

	@OriginalMember(owner = "client!nq", name = "y", descriptor = "(I)V")
	private void method4042() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray24, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IBI)V")
	public synchronized void method4043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub30 local8 = new Class3_Sub30(arg1);
		local8.aLong248 = arg0;
		this.aClass193_44.method4527(local8);
	}

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "()Lclient!n;")
	@Override
	public Class11 method5989() {
		return this.aClass11_Sub2_1;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5959(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
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

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BF)V")
	public void method4044(@OriginalArg(1) float arg0) {
		if (this.aFloat81 == arg0) {
			return;
		}
		this.aFloat81 = arg0;
		if (this.anInt4923 == 3) {
			this.method4014();
			return;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!m;Lclient!m;Lclient!m;Lclient!m;I)V")
	public void method4045(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) Class145 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method4015(arg0.anInterface9_4);
			OpenGL.glVertexPointer(arg0.aByte47, arg0.aShort50, this.anInterface9_6.method2082(), this.anInterface9_6.method2081() + (long) arg0.aByte48);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method4015(arg1.anInterface9_4);
			OpenGL.glNormalPointer(arg1.aShort50, this.anInterface9_6.method2082(), this.anInterface9_6.method2081() + (long) arg1.aByte48);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method4015(arg3.anInterface9_4);
			OpenGL.glColorPointer(arg3.aByte47, arg3.aShort50, this.anInterface9_6.method2082(), this.anInterface9_6.method2081() + (long) arg3.aByte48);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method4015(arg2.anInterface9_4);
			OpenGL.glTexCoordPointer(arg2.aByte47, arg2.aShort50, this.anInterface9_6.method2082(), this.anInterface9_6.method2081() + (long) arg2.aByte48);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "(I)V")
	private void method4046() {
		if (this.anInt4923 != 2) {
			this.anInt4923 = 2;
			this.method4042();
			this.method3988();
			this.anInt4912 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZIIZ[B)Lclient!vf;")
	public Interface13 method4047(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface13) (this.aBoolean346 && (!arg0 || this.aBoolean364) ? new Class8_Sub2(this, 5123, arg2, arg1, arg0) : new Class89_Sub2(this, 5123, arg2, arg1));
	}

	@OriginalMember(owner = "client!nq", name = "ua", descriptor = "(IIIIII[BII)V")
	@Override
	public void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(57) float local57;
		if (this.aClass137_Sub1_Sub1_5 == null || this.aClass137_Sub1_Sub1_5.anInt3911 < arg2 || this.aClass137_Sub1_Sub1_5.anInt3916 < arg3) {
			this.aClass137_Sub1_Sub1_5 = Static368.method5133(arg2, this, arg3, arg6);
			this.aClass137_Sub1_Sub1_5.method3346(false, false);
			local45 = this.aClass137_Sub1_Sub1_5.aFloat57;
			local57 = this.aClass137_Sub1_Sub1_5.aFloat58;
		} else {
			this.aClass137_Sub1_Sub1_5.method3350(arg3, arg6, arg2, 6406, false);
			local45 = (float) arg3 * this.aClass137_Sub1_Sub1_5.aFloat57 / (float) this.aClass137_Sub1_Sub1_5.anInt3916;
			local57 = (float) arg2 * this.aClass137_Sub1_Sub1_5.aFloat58 / (float) this.aClass137_Sub1_Sub1_5.anInt3911;
		}
		this.method4049();
		this.method4028(this.aClass137_Sub1_Sub1_5);
		this.method4040(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4026(arg5);
		this.method3983(34165, 34165);
		this.method4012(34166, 768, 0);
		this.method4012(5890, 770, 2);
		this.method3997(0, 34166);
		this.method3997(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = local147 + (float) arg2;
		@Pc(160) float local160 = (float) arg3 + local150;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local57);
		OpenGL.glVertex2f(local147, local160);
		OpenGL.glTexCoord2f(local45, local57);
		OpenGL.glVertex2f(local155, local160);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method4012(5890, 768, 0);
		this.method4012(34166, 770, 2);
		this.method3997(0, 5890);
		this.method3997(2, 34166);
	}

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "(I)V")
	private void method4048() {
		@Pc(57) int local57;
		if (this.aBoolean342) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local57 = this.anInt4929;
		} else {
			this.aFloat79 = (float) (this.anInt4911 - this.anInt4920) - this.aFloat64;
			this.aFloat72 = this.aFloat79 - this.aFloat75 * (float) this.anInt4922;
			if (this.aFloat72 < (float) this.anInt4907) {
				this.aFloat72 = this.anInt4907;
			}
			OpenGL.glFogf(2915, this.aFloat72);
			OpenGL.glFogf(2916, this.aFloat79);
			local57 = this.anInt4915;
		}
		Static424.aFloatArray32[2] = (float) (local57 & 0xFF) / 255.0F;
		Static424.aFloatArray32[0] = (float) (local57 & 0xFF0000) / 1.671168E7F;
		Static424.aFloatArray32[1] = (float) (local57 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static424.aFloatArray32, 0);
		if (this.aBoolean342) {
			this.aClass97_1.aClass38_Sub2_1.method1154();
		}
	}

	@OriginalMember(owner = "client!nq", name = "C", descriptor = "(I)V")
	public void method4049() {
		if (this.anInt4912 == 2) {
			return;
		}
		this.method4016();
		this.method4022(false);
		this.method3971(false);
		this.method4017(false);
		this.method4036(false);
		this.method3968(-2);
		this.anInt4912 = 2;
	}

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "()Z")
	@Override
	public boolean method5978() {
		return false;
	}

	@OriginalMember(owner = "client!nq", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean342) {
			throw new RuntimeException("");
		}
		this.anInt4929 = arg1;
		this.anInt4927 = arg0;
		this.anInt4908 = arg3;
		this.anInt4899 = arg2;
		this.aClass97_1.aClass38_Sub2_1.method1153();
		this.method4048();
	}

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "()Z")
	@Override
	public boolean method5992() {
		return this.aClass3_Sub39_Sub1_1 != null && (this.anInt4884 <= 1 || this.aBoolean358);
	}

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "(I)I")
	private int method4050() {
		@Pc(5) int local5 = 0;
		this.aString53 = OpenGL.glGetString(7936).toLowerCase();
		this.aString54 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString53.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString53.indexOf("brian paul") != -1 || this.aString53.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static403.method5514(local46.replace('.', ' '), ' ');
		if (local54.length >= 2) {
			try {
				@Pc(66) int local66 = Static160.method2518(local54[0]);
				@Pc(72) int local72 = Static160.method2518(local54[1]);
				this.anInt4913 = local72 + local66 * 10;
			} catch (@Pc(81) NumberFormatException local81) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt4913 < 12) {
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
		this.anInt4910 = local122[0];
		OpenGL.glGetIntegerv(34929, local122, 0);
		this.anInt4914 = local122[0];
		OpenGL.glGetIntegerv(34930, local122, 0);
		this.anInt4932 = local122[0];
		if (this.anInt4910 < 2 || this.anInt4914 < 2 || this.anInt4932 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean349 = NativeStream.b();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean346 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean353 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean359 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean360 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean340 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean348 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean365 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean363 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean356 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean357 = false;
		this.aBoolean343 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean354 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean352 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean358 = this.aBoolean352 & this.aBoolean354;
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "()V")
	@Override
	public void H() {
		this.anInt4905 = this.anInt4815;
		this.anInt4930 = 0;
		this.anInt4928 = 0;
		this.anInt4917 = this.anInt4813;
		OpenGL.glDisable(3089);
		this.method4010();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I[Lclient!be;)V")
	@Override
	public void method5985(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub7Array2[local7] = arg1[local7];
		}
		this.anInt4924 = arg0;
		if (this.anInt4923 != 1) {
			this.method4027();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ka;Lclient!fq;Lclient!n;Lclient!st;I)V")
	@Override
	public void method5999(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class23_Sub6 arg3) {
		arg0.method4931(arg2, arg3, 0);
		this.method5976(arg1);
	}

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "(B)V")
	private void method4051() {
		if (this.aBoolean344) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean344 = false;
		}
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
	@Override
	public void method5983(@OriginalArg(0) int arg0) {
		this.method3986();
	}

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "(B)V")
	private void method4052() {
		OpenGL.glDepthMask(this.aBoolean341 && this.aBoolean350);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5968(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "()Z")
	@Override
	public boolean method5971() {
		if (this.aClass3_Sub39_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub39_Sub1_1.method4913()) {
			if (!this.aClass147_1.method3563(this.aClass3_Sub39_Sub1_1)) {
				return false;
			}
			this.aClass122_1.method3079();
		}
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "I", descriptor = "()F")
	@Override
	public float I() {
		return this.aFloat76;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method4002();
		this.method4040(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean353) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean353) {
			OpenGL.glEnable(32925);
		}
	}
}
