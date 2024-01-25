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

@OriginalClass("client!vd")
public final class Class51_Sub2 extends Class51 {

	@OriginalMember(owner = "client!vd", name = "Lb", descriptor = "I")
	private int anInt6787;

	@OriginalMember(owner = "client!vd", name = "oc", descriptor = "I")
	public int anInt6816;

	@OriginalMember(owner = "client!vd", name = "Dc", descriptor = "I")
	public int anInt6830;

	@OriginalMember(owner = "client!vd", name = "ae", descriptor = "I")
	private int anInt6903;

	@OriginalMember(owner = "client!vd", name = "pe", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!vd", name = "se", descriptor = "I")
	public int anInt6911;

	@OriginalMember(owner = "client!vd", name = "Be", descriptor = "Lclient!md;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!vd", name = "De", descriptor = "Lclient!md;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!vd", name = "Ie", descriptor = "I")
	public int anInt6916;

	@OriginalMember(owner = "client!vd", name = "Ke", descriptor = "I")
	public int anInt6917;

	@OriginalMember(owner = "client!vd", name = "Le", descriptor = "I")
	private int anInt6918;

	@OriginalMember(owner = "client!vd", name = "Ue", descriptor = "F")
	private float aFloat192;

	@OriginalMember(owner = "client!vd", name = "Ve", descriptor = "Lclient!sg;")
	public Class163_Sub2 aClass163_Sub2_1;

	@OriginalMember(owner = "client!vd", name = "Xe", descriptor = "Z")
	public boolean aBoolean440;

	@OriginalMember(owner = "client!vd", name = "Ye", descriptor = "Z")
	public boolean aBoolean441;

	@OriginalMember(owner = "client!vd", name = "af", descriptor = "Lclient!hs;")
	public Class33_Sub2 aClass33_Sub2_3;

	@OriginalMember(owner = "client!vd", name = "ff", descriptor = "I")
	public int anInt6921;

	@OriginalMember(owner = "client!vd", name = "gf", descriptor = "Lclient!sg;")
	public Class163_Sub2 aClass163_Sub2_2;

	@OriginalMember(owner = "client!vd", name = "jf", descriptor = "[Lclient!ew;")
	private Class59[] aClass59Array1;

	@OriginalMember(owner = "client!vd", name = "kf", descriptor = "I")
	private int anInt6922;

	@OriginalMember(owner = "client!vd", name = "mf", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!vd", name = "nf", descriptor = "I")
	private int anInt6924;

	@OriginalMember(owner = "client!vd", name = "of", descriptor = "I")
	private int anInt6925;

	@OriginalMember(owner = "client!vd", name = "pf", descriptor = "I")
	private int anInt6926;

	@OriginalMember(owner = "client!vd", name = "sf", descriptor = "F")
	public float aFloat197;

	@OriginalMember(owner = "client!vd", name = "tf", descriptor = "Z")
	public boolean aBoolean443;

	@OriginalMember(owner = "client!vd", name = "uf", descriptor = "Ljava/lang/String;")
	private String aString65;

	@OriginalMember(owner = "client!vd", name = "vf", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!vd", name = "wf", descriptor = "Z")
	public boolean aBoolean444;

	@OriginalMember(owner = "client!vd", name = "yf", descriptor = "Lclient!oj;")
	private Interface10 anInterface10_5;

	@OriginalMember(owner = "client!vd", name = "Af", descriptor = "Lclient!ft;")
	public Class87 aClass87_12;

	@OriginalMember(owner = "client!vd", name = "Ef", descriptor = "Z")
	private boolean aBoolean446;

	@OriginalMember(owner = "client!vd", name = "Ff", descriptor = "Z")
	public boolean aBoolean447;

	@OriginalMember(owner = "client!vd", name = "If", descriptor = "I")
	private int anInt6931;

	@OriginalMember(owner = "client!vd", name = "Jf", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!vd", name = "Kf", descriptor = "F")
	private float aFloat200;

	@OriginalMember(owner = "client!vd", name = "Lf", descriptor = "F")
	private float aFloat201;

	@OriginalMember(owner = "client!vd", name = "Mf", descriptor = "Lclient!sg;")
	public Class163_Sub2 aClass163_Sub2_3;

	@OriginalMember(owner = "client!vd", name = "Of", descriptor = "Z")
	private boolean aBoolean449;

	@OriginalMember(owner = "client!vd", name = "Pf", descriptor = "Ljava/lang/String;")
	private String aString66;

	@OriginalMember(owner = "client!vd", name = "Sf", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!vd", name = "Uf", descriptor = "Lclient!sg;")
	public Class163_Sub2 aClass163_Sub2_4;

	@OriginalMember(owner = "client!vd", name = "Vf", descriptor = "Lclient!sg;")
	public Class163_Sub2 aClass163_Sub2_5;

	@OriginalMember(owner = "client!vd", name = "Xf", descriptor = "Lclient!sg;")
	public Class163_Sub2 aClass163_Sub2_6;

	@OriginalMember(owner = "client!vd", name = "Yf", descriptor = "I")
	private int anInt6935;

	@OriginalMember(owner = "client!vd", name = "Zf", descriptor = "Z")
	private boolean aBoolean450;

	@OriginalMember(owner = "client!vd", name = "ag", descriptor = "Lclient!ud;")
	public Class59_Sub3 aClass59_Sub3_5;

	@OriginalMember(owner = "client!vd", name = "dg", descriptor = "Z")
	private boolean aBoolean452;

	@OriginalMember(owner = "client!vd", name = "fg", descriptor = "Lclient!sg;")
	public Class163_Sub2 aClass163_Sub2_7;

	@OriginalMember(owner = "client!vd", name = "gg", descriptor = "Z")
	public boolean aBoolean453;

	@OriginalMember(owner = "client!vd", name = "hg", descriptor = "I")
	public int anInt6938;

	@OriginalMember(owner = "client!vd", name = "jg", descriptor = "Lclient!sg;")
	public Class163_Sub2 aClass163_Sub2_8;

	@OriginalMember(owner = "client!vd", name = "mg", descriptor = "F")
	public float aFloat204;

	@OriginalMember(owner = "client!vd", name = "ng", descriptor = "I")
	private int anInt6939;

	@OriginalMember(owner = "client!vd", name = "og", descriptor = "Z")
	private boolean aBoolean456;

	@OriginalMember(owner = "client!vd", name = "pg", descriptor = "I")
	public int anInt6940;

	@OriginalMember(owner = "client!vd", name = "rg", descriptor = "Lclient!lm;")
	private Interface8 anInterface8_5;

	@OriginalMember(owner = "client!vd", name = "sg", descriptor = "F")
	public float aFloat205;

	@OriginalMember(owner = "client!vd", name = "tg", descriptor = "I")
	private int anInt6941;

	@OriginalMember(owner = "client!vd", name = "vg", descriptor = "I")
	public int anInt6942;

	@OriginalMember(owner = "client!vd", name = "wg", descriptor = "Z")
	public boolean aBoolean457;

	@OriginalMember(owner = "client!vd", name = "Ag", descriptor = "I")
	private int anInt6944;

	@OriginalMember(owner = "client!vd", name = "Cg", descriptor = "Lclient!hs;")
	public Class33_Sub2 aClass33_Sub2_4;

	@OriginalMember(owner = "client!vd", name = "Eg", descriptor = "Z")
	private boolean aBoolean459;

	@OriginalMember(owner = "client!vd", name = "Fg", descriptor = "Z")
	private boolean aBoolean460;

	@OriginalMember(owner = "client!vd", name = "Gg", descriptor = "I")
	private int anInt6947;

	@OriginalMember(owner = "client!vd", name = "Hg", descriptor = "Z")
	public boolean aBoolean461;

	@OriginalMember(owner = "client!vd", name = "Lg", descriptor = "Lclient!es;")
	public Class73 aClass73_6;

	@OriginalMember(owner = "client!vd", name = "Mg", descriptor = "Lclient!ft;")
	public Class87 aClass87_13;

	@OriginalMember(owner = "client!vd", name = "Pg", descriptor = "Lclient!sg;")
	public Class163_Sub2 aClass163_Sub2_9;

	@OriginalMember(owner = "client!vd", name = "Qg", descriptor = "Z")
	private boolean aBoolean463;

	@OriginalMember(owner = "client!vd", name = "Sg", descriptor = "Lclient!wq;")
	private Class59_Sub3_Sub1 aClass59_Sub3_Sub1_5;

	@OriginalMember(owner = "client!vd", name = "Ug", descriptor = "Z")
	private boolean aBoolean464;

	@OriginalMember(owner = "client!vd", name = "Wg", descriptor = "F")
	public float aFloat209;

	@OriginalMember(owner = "client!vd", name = "Xg", descriptor = "Z")
	private boolean aBoolean465;

	@OriginalMember(owner = "client!vd", name = "Yg", descriptor = "Lclient!lm;")
	private Interface8 anInterface8_6;

	@OriginalMember(owner = "client!vd", name = "Zg", descriptor = "I")
	private int anInt6953;

	@OriginalMember(owner = "client!vd", name = "ch", descriptor = "Lclient!tj;")
	private Class96_Sub1 aClass96_Sub1_1;

	@OriginalMember(owner = "client!vd", name = "eh", descriptor = "Lclient!sg;")
	public Class163_Sub2 aClass163_Sub2_10;

	@OriginalMember(owner = "client!vd", name = "fh", descriptor = "Z")
	public boolean aBoolean467;

	@OriginalMember(owner = "client!vd", name = "ih", descriptor = "I")
	private int anInt6956;

	@OriginalMember(owner = "client!vd", name = "lh", descriptor = "I")
	private int anInt6957;

	@OriginalMember(owner = "client!vd", name = "qc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!vd", name = "je", descriptor = "I")
	public int anInt6907 = 128;

	@OriginalMember(owner = "client!vd", name = "he", descriptor = "Lclient!w;")
	private final Class264 aClass264_1 = new Class264();

	@OriginalMember(owner = "client!vd", name = "me", descriptor = "Lclient!hs;")
	private final Class33_Sub2 aClass33_Sub2_1 = new Class33_Sub2();

	@OriginalMember(owner = "client!vd", name = "oe", descriptor = "Lclient!hs;")
	public final Class33_Sub2 aClass33_Sub2_2 = new Class33_Sub2();

	@OriginalMember(owner = "client!vd", name = "te", descriptor = "Z")
	private boolean aBoolean439 = false;

	@OriginalMember(owner = "client!vd", name = "qe", descriptor = "I")
	public int anInt6909 = 3;

	@OriginalMember(owner = "client!vd", name = "re", descriptor = "I")
	public int anInt6910 = 8;

	@OriginalMember(owner = "client!vd", name = "ye", descriptor = "Lclient!fr;")
	private final Class85 aClass85_39 = new Class85();

	@OriginalMember(owner = "client!vd", name = "Ge", descriptor = "[Lclient!md;")
	private final Interface9[] anInterface9Array3 = new Interface9[4];

	@OriginalMember(owner = "client!vd", name = "Ce", descriptor = "I")
	private int anInt6914 = -1;

	@OriginalMember(owner = "client!vd", name = "He", descriptor = "I")
	private int anInt6915 = -1;

	@OriginalMember(owner = "client!vd", name = "Fe", descriptor = "[Lclient!md;")
	private final Interface9[] anInterface9Array2 = new Interface9[4];

	@OriginalMember(owner = "client!vd", name = "Ee", descriptor = "[Lclient!md;")
	private final Interface9[] anInterface9Array1 = new Interface9[4];

	@OriginalMember(owner = "client!vd", name = "Ae", descriptor = "I")
	private int anInt6913 = -1;

	@OriginalMember(owner = "client!vd", name = "Je", descriptor = "Lclient!fr;")
	private final Class85 aClass85_40;

	@OriginalMember(owner = "client!vd", name = "Me", descriptor = "Lclient!fr;")
	private final Class85 aClass85_41;

	@OriginalMember(owner = "client!vd", name = "Ne", descriptor = "Lclient!fr;")
	private final Class85 aClass85_42;

	@OriginalMember(owner = "client!vd", name = "Oe", descriptor = "Lclient!fr;")
	private final Class85 aClass85_43;

	@OriginalMember(owner = "client!vd", name = "Pe", descriptor = "Lclient!fr;")
	private final Class85 aClass85_44;

	@OriginalMember(owner = "client!vd", name = "Qe", descriptor = "Lclient!fr;")
	private final Class85 aClass85_45;

	@OriginalMember(owner = "client!vd", name = "Re", descriptor = "Lclient!fr;")
	private final Class85 aClass85_46;

	@OriginalMember(owner = "client!vd", name = "Te", descriptor = "I")
	public int anInt6919;

	@OriginalMember(owner = "client!vd", name = "cf", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!vd", name = "rf", descriptor = "I")
	private int anInt6928;

	@OriginalMember(owner = "client!vd", name = "lf", descriptor = "I")
	public int anInt6923;

	@OriginalMember(owner = "client!vd", name = "Nf", descriptor = "F")
	public float aFloat202;

	@OriginalMember(owner = "client!vd", name = "Df", descriptor = "[Lclient!wr;")
	private final Class7_Sub30[] aClass7_Sub30Array2;

	@OriginalMember(owner = "client!vd", name = "Wf", descriptor = "I")
	public int anInt6934;

	@OriginalMember(owner = "client!vd", name = "Cf", descriptor = "[F")
	private final float[] aFloatArray28;

	@OriginalMember(owner = "client!vd", name = "Rf", descriptor = "I")
	public int anInt6932;

	@OriginalMember(owner = "client!vd", name = "Ze", descriptor = "I")
	private int anInt6920;

	@OriginalMember(owner = "client!vd", name = "bg", descriptor = "I")
	private int anInt6936;

	@OriginalMember(owner = "client!vd", name = "qf", descriptor = "I")
	private int anInt6927;

	@OriginalMember(owner = "client!vd", name = "df", descriptor = "F")
	private float aFloat194;

	@OriginalMember(owner = "client!vd", name = "ef", descriptor = "F")
	private float aFloat195;

	@OriginalMember(owner = "client!vd", name = "Qf", descriptor = "F")
	public float aFloat203;

	@OriginalMember(owner = "client!vd", name = "lg", descriptor = "[F")
	private final float[] aFloatArray29;

	@OriginalMember(owner = "client!vd", name = "Se", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!vd", name = "ug", descriptor = "F")
	private float aFloat206;

	@OriginalMember(owner = "client!vd", name = "xf", descriptor = "[F")
	private final float[] aFloatArray27;

	@OriginalMember(owner = "client!vd", name = "xg", descriptor = "F")
	public float aFloat207;

	@OriginalMember(owner = "client!vd", name = "Bg", descriptor = "I")
	public int anInt6945;

	@OriginalMember(owner = "client!vd", name = "Bf", descriptor = "I")
	private int anInt6929;

	@OriginalMember(owner = "client!vd", name = "Dg", descriptor = "I")
	public int anInt6946;

	@OriginalMember(owner = "client!vd", name = "Ig", descriptor = "[F")
	private final float[] aFloatArray31;

	@OriginalMember(owner = "client!vd", name = "zg", descriptor = "I")
	private int anInt6943;

	@OriginalMember(owner = "client!vd", name = "Og", descriptor = "I")
	public int anInt6949;

	@OriginalMember(owner = "client!vd", name = "eg", descriptor = "I")
	private int anInt6937;

	@OriginalMember(owner = "client!vd", name = "Rg", descriptor = "I")
	public int anInt6950;

	@OriginalMember(owner = "client!vd", name = "Jg", descriptor = "I")
	private int anInt6948;

	@OriginalMember(owner = "client!vd", name = "Tf", descriptor = "I")
	private int anInt6933;

	@OriginalMember(owner = "client!vd", name = "Tg", descriptor = "I")
	public int anInt6951;

	@OriginalMember(owner = "client!vd", name = "Vg", descriptor = "I")
	public int anInt6952;

	@OriginalMember(owner = "client!vd", name = "Ng", descriptor = "F")
	public float aFloat208;

	@OriginalMember(owner = "client!vd", name = "ah", descriptor = "I")
	public int anInt6954;

	@OriginalMember(owner = "client!vd", name = "Hf", descriptor = "I")
	private int anInt6930;

	@OriginalMember(owner = "client!vd", name = "Kg", descriptor = "Z")
	private boolean aBoolean462;

	@OriginalMember(owner = "client!vd", name = "dh", descriptor = "F")
	public float aFloat210;

	@OriginalMember(owner = "client!vd", name = "qg", descriptor = "[F")
	public final float[] aFloatArray30;

	@OriginalMember(owner = "client!vd", name = "bf", descriptor = "F")
	public float bf;

	@OriginalMember(owner = "client!vd", name = "We", descriptor = "Lclient!pb;")
	public Class7_Sub14_Sub2 aClass7_Sub14_Sub2_2;

	@OriginalMember(owner = "client!vd", name = "kh", descriptor = "[I")
	public int[] anIntArray593;

	@OriginalMember(owner = "client!vd", name = "jh", descriptor = "[B")
	public final byte[] aByteArray93;

	@OriginalMember(owner = "client!vd", name = "hh", descriptor = "[I")
	public int[] anIntArray592;

	@OriginalMember(owner = "client!vd", name = "mh", descriptor = "[I")
	public int[] anIntArray594;

	@OriginalMember(owner = "client!vd", name = "Gb", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas5;

	@OriginalMember(owner = "client!vd", name = "Vd", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!vd", name = "le", descriptor = "I")
	public final int anInt6908;

	@OriginalMember(owner = "client!vd", name = "Hb", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!vd", name = "kd", descriptor = "J")
	private final long aLong213;

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!vd", name = "gh", descriptor = "I")
	public final int anInt6955;

	@OriginalMember(owner = "client!vd", name = "kg", descriptor = "Z")
	public boolean aBoolean455;

	@OriginalMember(owner = "client!vd", name = "cg", descriptor = "Z")
	private boolean aBoolean451;

	@OriginalMember(owner = "client!vd", name = "ig", descriptor = "Z")
	public boolean aBoolean454;

	@OriginalMember(owner = "client!vd", name = "hf", descriptor = "Z")
	public boolean aBoolean442;

	@OriginalMember(owner = "client!vd", name = "bh", descriptor = "Z")
	private boolean aBoolean466;

	@OriginalMember(owner = "client!vd", name = "Gf", descriptor = "Z")
	public boolean aBoolean448;

	@OriginalMember(owner = "client!vd", name = "yg", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!vd", name = "zf", descriptor = "Z")
	private final boolean aBoolean445;

	@OriginalMember(owner = "client!vd", name = "ke", descriptor = "Lclient!wp;")
	public final Class269 aClass269_1;

	@OriginalMember(owner = "client!vd", name = "xe", descriptor = "Lclient!ab;")
	public final Class3 aClass3_1;

	@OriginalMember(owner = "client!vd", name = "ge", descriptor = "Lclient!fk;")
	private final Class80 aClass80_1;

	@OriginalMember(owner = "client!vd", name = "fe", descriptor = "Lclient!nr;")
	private Class7_Sub23_Sub1 aClass7_Sub23_Sub1_1;

	@OriginalMember(owner = "client!vd", name = "ie", descriptor = "Lclient!vv;")
	private final Class263 aClass263_1;

	static {
		new Class55("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;ILclient!ec;)V")
	public Class51_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class61 arg4) {
		super(arg0, arg2);
		new Class24();
		new Class164(16);
		this.aClass85_40 = new Class85();
		this.aClass85_41 = new Class85();
		this.aClass85_42 = new Class85();
		this.aClass85_43 = new Class85();
		this.aClass85_44 = new Class85();
		this.aClass85_45 = new Class85();
		this.aClass85_46 = new Class85();
		this.anInt6919 = -1;
		this.aFloat193 = 1.0F;
		this.anInt6928 = 0;
		this.anInt6923 = 50;
		this.aFloat202 = 1.0F;
		this.aClass7_Sub30Array2 = new Class7_Sub30[Static284.anInt872];
		this.anInt6934 = 512;
		this.aFloatArray28 = new float[4];
		this.anInt6932 = 0;
		this.anInt6920 = 0;
		this.anInt6936 = 0;
		this.anInt6927 = 0;
		this.aFloat194 = 0.0F;
		this.aFloat195 = 1.0F;
		this.aFloat203 = 1.0F;
		this.aFloatArray29 = new float[16];
		this.aFloat191 = 3000.0F;
		this.aFloat206 = 1.0F;
		this.aFloatArray27 = new float[4];
		this.aFloat207 = -1.0F;
		this.anInt6945 = 0;
		this.anInt6929 = -1;
		this.anInt6946 = 3584;
		this.aFloatArray31 = new float[4];
		this.anInt6943 = 0;
		this.anInt6949 = 0;
		this.anInt6937 = 8448;
		this.anInt6950 = -1;
		this.anInt6948 = -1;
		this.anInt6933 = 0;
		this.anInt6951 = 0;
		this.anInt6952 = 512;
		this.aFloat208 = -1.0F;
		this.anInt6954 = -1;
		this.anInt6930 = 8448;
		this.aBoolean462 = true;
		this.aFloat210 = 3584.0F;
		this.aFloatArray30 = new float[4];
		this.bf = 3584.0F;
		this.aClass7_Sub14_Sub2_2 = new Class7_Sub14_Sub2(8192);
		this.anIntArray593 = new int[1];
		this.aByteArray93 = new byte[16384];
		this.anIntArray592 = new int[1];
		this.anIntArray594 = new int[1];
		this.aCanvas6 = this.aCanvas5 = arg1;
		this.anInt6908 = arg3;
		try {
			if (Static295.aBoolean306 == null || !Static295.aBoolean306) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static295.aBoolean306 = Boolean.TRUE;
				} else {
					@Pc(276) String local276 = System.getProperty("os.name").toLowerCase();
					if (!local276.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local276.startsWith("linux") || local276.startsWith("sunos")) {
						System.load(arg4.method1449("libjaggl.so").toString());
					} else if (local276.startsWith("mac")) {
						System.load(arg4.method1449("libjaggl.jnilib").toString());
					} else if (local276.startsWith("win")) {
						System.load(arg4.method1449("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static295.aBoolean306 = Boolean.TRUE;
				}
			}
			if (Static295.aBoolean306 == null || !Static295.aBoolean306) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong212 = this.aLong213 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt6908);
			if (this.aLong213 == 0L) {
				throw new RuntimeException("");
			}
			this.method5382();
			@Pc(375) int local375 = this.method5403();
			if (local375 != 0) {
				throw new RuntimeException("");
			}
			this.anInt6955 = this.aBoolean461 ? 33639 : 5121;
			@Pc(399) int local399;
			if (this.aString65.indexOf("radeon") != -1) {
				local399 = 0;
				@Pc(401) boolean local401 = false;
				@Pc(403) boolean local403 = false;
				@Pc(412) String[] local412 = Static295.method3893(this.aString65.replace('/', ' '), ' ');
				for (@Pc(414) int local414 = 0; local414 < local412.length; local414++) {
					@Pc(420) String local420 = local412[local414];
					try {
						if (local420.length() > 0) {
							if (local420.charAt(0) == 'x' && local420.length() >= 3 && Static106.method1840(local420.substring(1, 3))) {
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
								if (local420.length() >= 4 && Static106.method1840(local420.substring(0, 4))) {
									local399 = Static259.method3459(local420.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(488) Exception local488) {
					}
				}
				if (!local403 && !local401) {
					if (local399 >= 7000 && local399 <= 9250) {
						this.aBoolean455 = false;
					}
					if (local399 >= 7000 && local399 <= 7999) {
						this.aBoolean451 = false;
					}
				}
				if (!local401 || local399 < 4000) {
					this.aBoolean454 = false;
				}
				this.aBoolean442 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean466 = this.aBoolean451;
				this.aBoolean448 = true;
			}
			if (this.aString66.indexOf("intel") != -1) {
				this.aBoolean458 = false;
			}
			this.aBoolean445 = !this.aString66.equals("s3 graphics");
			if (this.aBoolean451) {
				try {
					@Pc(574) int[] local574 = new int[1];
					OpenGL.glGenBuffersARB(1, local574, 0);
				} catch (@Pc(580) Throwable local580) {
					throw new RuntimeException("");
				}
			}
			Static394.method5010(true, false);
			this.aBoolean439 = true;
			this.aClass269_1 = new Class269(this, super.anInterface4_8);
			this.method5419();
			this.aClass3_1 = new Class3(this);
			this.aClass80_1 = new Class80(this);
			if (this.aClass80_1.method1956()) {
				this.aClass7_Sub23_Sub1_1 = new Class7_Sub23_Sub1(this);
				if (!this.aClass7_Sub23_Sub1_1.method3693()) {
					this.aClass7_Sub23_Sub1_1.method3687();
					this.aClass7_Sub23_Sub1_1 = null;
				}
			}
			this.aClass263_1 = new Class263(this);
			this.method5426();
			this.method5358();
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
					Static214.method2089(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(679) Throwable local679) {
			local679.printStackTrace();
			this.method5338();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "(F)V")
	@Override
	public void B(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat199) {
			this.aFloat199 = arg0;
			this.method5438();
		}
	}

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "(I)V")
	private void method5354() {
		if (this.aBoolean465) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean465 = false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "ea", descriptor = "(Lclient!c;)V")
	@Override
	public void ea(@OriginalArg(0) Class33 arg0) {
		this.aClass33_Sub2_3 = (Class33_Sub2) arg0;
		this.aClass33_Sub2_4.method2386(this.aClass33_Sub2_3);
		if (this.anInt6924 != 1) {
			this.method5411();
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(Z)V")
	private void method5355() {
		@Pc(6) float[] local6 = this.aFloatArray29;
		@Pc(24) float local24 = (float) (this.anInt6923 * -this.anInt6932) / (float) this.anInt6952;
		@Pc(39) float local39 = (float) (this.anInt6923 * (this.anInt6816 - this.anInt6932)) / (float) this.anInt6952;
		@Pc(50) float local50 = (float) (this.anInt6949 * this.anInt6923) / (float) this.anInt6934;
		@Pc(65) float local65 = (float) ((this.anInt6949 - this.anInt6830) * this.anInt6923) / (float) this.anInt6934;
		if (local39 == local24 || local65 == local50) {
			local6[2] = 0.0F;
			local6[1] = 0.0F;
			local6[12] = 0.0F;
			local6[0] = 1.0F;
			local6[7] = 0.0F;
			local6[10] = 1.0F;
			local6[5] = 1.0F;
			local6[9] = 0.0F;
			local6[8] = 0.0F;
			local6[11] = 0.0F;
			local6[15] = 1.0F;
			local6[13] = 0.0F;
			local6[14] = 0.0F;
			local6[6] = 0.0F;
			local6[4] = 0.0F;
			local6[3] = 0.0F;
		} else {
			@Pc(79) float local79 = (float) this.anInt6923 * 2.0F;
			local6[13] = 0.0F;
			local6[4] = 0.0F;
			local6[11] = -1.0F;
			local6[8] = (local24 + local39) / (-local24 + local39);
			local6[5] = local79 / (local50 - local65);
			local6[1] = 0.0F;
			local6[10] = this.aFloat200 = (float) -(this.anInt6946 + this.anInt6923) / (float) (this.anInt6946 - this.anInt6923);
			local6[14] = this.aFloat201 = -(local79 * (float) this.anInt6946) / (float) (this.anInt6946 - this.anInt6923);
			local6[3] = 0.0F;
			local6[9] = (local50 + local65) / (-local65 + local50);
			local6[15] = 0.0F;
			local6[12] = 0.0F;
			local6[6] = 0.0F;
			local6[7] = 0.0F;
			local6[2] = 0.0F;
			local6[0] = local79 / (local39 - local24);
		}
		this.method5436();
	}

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "()Z")
	@Override
	public boolean method5316() {
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public void method5356() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray30, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5289(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!io;IIII)Lclient!t;")
	@Override
	public Class163 method5346(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class163_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZIIZ)V")
	public void method5357(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt6941 != arg1) {
			if (arg1 < 0) {
				this.method5354();
				this.method5364(null);
				this.method5400(0);
				if (!this.aBoolean447) {
					this.aClass263_1.method5616(0, arg2, arg0);
				}
			} else {
				@Pc(20) Class59_Sub3 local20 = this.aClass269_1.method5750(arg1);
				@Pc(26) Class203 local26 = super.anInterface4_8.method3138(arg1);
				if (local26.aByte58 == 0 && local26.aByte56 == 0) {
					this.method5354();
				} else {
					@Pc(50) int local50 = local26.aBoolean365 ? 64 : 128;
					@Pc(54) int local54 = local50 * 50;
					this.method5422((float) (this.anInt6911 % local54 * local26.aByte58) / (float) local54, 0.0F, (float) (local26.aByte56 * (this.anInt6911 % local54)) / (float) local54);
				}
				if (this.aBoolean447) {
					this.aClass263_1.method5616(3, arg2, arg0);
					this.method5364(local20);
					this.method5400(local26.anInt5348);
				} else {
					this.aClass263_1.method5616(local26.aByte59, arg2, arg0);
					this.aClass263_1.method5613(local26.anInt5345, local26.aByte60);
					if (!this.aClass263_1.method5615(local20, local26.anInt5348)) {
						this.method5364(local20);
						this.method5400(local26.anInt5348);
					}
				}
			}
			this.anInt6941 = arg1;
		}
		this.anInt6935 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5297() {
	}

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "(I)V")
	private void method5358() {
		if (this.aCanvas6 == null) {
			this.anInt6787 = this.anInt6903 = 0;
		} else {
			@Pc(11) Dimension local11 = this.aCanvas6.getSize();
			this.anInt6903 = local11.height;
			this.anInt6787 = local11.width;
		}
		if (this.anInterface9_2 == null) {
			this.anInt6816 = this.anInt6787;
			this.anInt6830 = this.anInt6903;
			this.method5381();
		}
		this.method5362();
		this.e();
	}

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "(I)V")
	public void method5359() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "()Z")
	@Override
	public boolean method5321() {
		return this.aBoolean464 && (!this.method5326() || this.aBoolean449);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
	private void method5360() {
		this.aFloat196 = this.anInt6943 - this.anInt6932;
		this.aFloat204 = this.anInt6933 - this.anInt6949;
		this.aFloat209 = this.anInt6920 - this.anInt6932;
		this.aFloat197 = this.anInt6927 - this.anInt6949;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V")
	private void method5361() {
		if (this.aBoolean450 && this.anInt6950 >= 0 | this.aBoolean447) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "(I)V")
	public void method5362() {
		if (this.anInt6924 != 0) {
			this.anInt6924 = 0;
			this.anInt6935 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "DA", descriptor = "(IIIIII[BII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(41) float local41;
		if (this.aClass59_Sub3_Sub1_5 == null || arg2 > this.aClass59_Sub3_Sub1_5.anInt7486 || this.aClass59_Sub3_Sub1_5.anInt7488 < arg3) {
			this.aClass59_Sub3_Sub1_5 = Static413.method5191(arg2, arg3, this, arg6);
			this.aClass59_Sub3_Sub1_5.method5770(false, false);
			local41 = this.aClass59_Sub3_Sub1_5.aFloat220;
			local45 = this.aClass59_Sub3_Sub1_5.aFloat221;
		} else {
			this.aClass59_Sub3_Sub1_5.method5765(6406, arg6, arg2, false, arg3);
			local45 = (float) arg3 * this.aClass59_Sub3_Sub1_5.aFloat221 / (float) this.aClass59_Sub3_Sub1_5.anInt7488;
			local41 = (float) arg2 * this.aClass59_Sub3_Sub1_5.aFloat220 / (float) this.aClass59_Sub3_Sub1_5.anInt7486;
		}
		this.method5379();
		this.method5364(this.aClass59_Sub3_Sub1_5);
		this.method5412(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5397(arg5);
		this.method5394(34165, 34165);
		this.method5408(768, 34166, 0);
		this.method5408(770, 5890, 2);
		this.method5374(34166, 0);
		this.method5374(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = local147 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = (float) arg3 + local150;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local45, local41);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method5408(768, 5890, 0);
		this.method5408(770, 34166, 2);
		this.method5374(5890, 0);
		this.method5374(34166, 2);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)I")
	public int method5363(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "()V")
	@Override
	public void e() {
		this.anInt6927 = this.anInt6830;
		this.anInt6943 = this.anInt6816;
		this.anInt6920 = 0;
		this.anInt6933 = 0;
		OpenGL.glDisable(3089);
		this.method5360();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!ew;)V")
	public void method5364(@OriginalArg(1) Class59 arg0) {
		@Pc(11) Class59 local11 = this.aClass59Array1[this.anInt6925];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt7465);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt7465);
				} else if (arg0.anInt7465 != local11.anInt7465) {
					OpenGL.glDisable(local11.anInt7465);
					OpenGL.glEnable(arg0.anInt7465);
				}
				OpenGL.glBindTexture(arg0.anInt7465, arg0.method5759());
			}
			this.aClass59Array1[this.anInt6925] = arg0;
		}
		this.anInt6935 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "()Z")
	@Override
	public boolean method5328() {
		return false;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5314(@OriginalArg(0) Canvas arg0) {
		this.aLong212 = 0L;
		this.aCanvas6 = null;
		if (arg0 == null || this.aCanvas5 == arg0) {
			this.aCanvas6 = this.aCanvas5;
			this.aLong212 = this.aLong213;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable2.get(arg0);
			this.aLong212 = local36;
			this.aCanvas6 = arg0;
		}
		if (this.aCanvas6 == null || this.aLong212 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong212);
		this.method5358();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt6923;
	}

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "()Z")
	@Override
	public boolean method5350() {
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!oj;II)V")
	public void method5365(@OriginalArg(2) Interface10 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(9) int local9 = arg0.method5744();
		@Pc(16) int local16 = arg1 * this.method5406(local9);
		this.method5417(arg0);
		OpenGL.glDrawElements(4, arg2, local9, (long) local16 + arg0.method5745());
	}

	@OriginalMember(owner = "client!vd", name = "ca", descriptor = "(ILclient!ma;II)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class119_Sub2 local6 = (Class119_Sub2) arg1;
		@Pc(9) Class59_Sub3_Sub1 local9 = local6.aClass59_Sub3_Sub1_3;
		this.method5379();
		this.method5364(local6.aClass59_Sub3_Sub1_3);
		this.method5412(1);
		this.method5394(7681, 8448);
		this.method5408(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat220 / (float) local9.anInt7491;
		@Pc(46) float local46 = local9.aFloat221 / (float) local9.anInt7494;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt6920 - arg2) * local39, local46 * (float) (this.anInt6933 - arg3));
		OpenGL.glVertex2i(this.anInt6920, this.anInt6933);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6920 - arg2), (float) (this.anInt6927 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6920, this.anInt6927);
		OpenGL.glTexCoord2f((float) (this.anInt6943 - arg2) * local39, local46 * (float) (this.anInt6927 - arg3));
		OpenGL.glVertex2i(this.anInt6943, this.anInt6927);
		OpenGL.glTexCoord2f((float) (this.anInt6943 - arg2) * local39, (float) (this.anInt6933 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6943, this.anInt6933);
		OpenGL.glEnd();
		this.method5408(768, 5890, 0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class11 method5310(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class11_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5330(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas5) {
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

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZB)V")
	public void method5366(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean446 != arg0) {
			this.aBoolean446 = arg0;
			this.method5399();
		}
	}

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "()Z")
	@Override
	public boolean method5305() {
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "()V")
	@Override
	protected void method5338() {
		for (@Pc(10) Class7 local10 = this.aClass85_39.method2010(); local10 != null; local10 = this.aClass85_39.method2000()) {
			((Class7_Sub40_Sub1) local10).method4735();
		}
		if (this.aClass80_1 != null) {
			this.aClass80_1.method1955();
		}
		if (this.anOpenGL1 != null) {
			this.method5404();
			@Pc(40) Enumeration local40 = this.aHashtable2.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable2.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean439) {
			Static388.method4970(false, true);
			this.aBoolean439 = false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "(I)V")
	private void method5367() {
		if (this.anInt6924 != 2) {
			this.anInt6924 = 2;
			this.method5437();
			this.method5411();
			this.anInt6935 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(FFZFF)V")
	public void method5368(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static356.aFloatArray24[1] = arg3;
		Static356.aFloatArray24[3] = arg0;
		Static356.aFloatArray24[0] = arg2;
		Static356.aFloatArray24[2] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static356.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!md;B)V")
	public void method5369(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt6913 < 0 || arg0 != this.anInterface9Array1[this.anInt6913]) {
			throw new RuntimeException();
		}
		this.anInterface9Array1[this.anInt6913--] = null;
		arg0.method1726();
		if (this.anInt6913 < 0) {
			this.anInterface9_2 = null;
		} else {
			this.anInterface9_2 = this.anInterface9Array1[this.anInt6913];
			this.anInterface9_2.method1727();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
	public synchronized void method5370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class7_Sub2 local8 = new Class7_Sub2(arg1);
		local8.aLong230 = arg0;
		this.aClass85_42.method2011(local8);
	}

	@OriginalMember(owner = "client!vd", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6951 = arg3;
		this.anInt6948 = arg1;
		this.anInt6938 = arg0;
		this.anInt6919 = arg2;
		this.aBoolean447 = true;
		this.aClass263_1.method5616(3, false, false);
		this.aClass263_1.aClass22_Sub2_1.method637();
		this.method5424();
		this.method5361();
	}

	@OriginalMember(owner = "client!vd", name = "JA", descriptor = "(IIIIII)Z")
	@Override
	public boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass33_Sub2_3.aFloat72 + this.aClass33_Sub2_3.aFloat74 * (float) arg2 + (float) arg0 * this.aClass33_Sub2_3.aFloat80 + (float) arg1 * this.aClass33_Sub2_3.aFloat78;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass33_Sub2_3.aFloat78 * (float) arg4 + (float) arg3 * this.aClass33_Sub2_3.aFloat80 + (float) arg5 * this.aClass33_Sub2_3.aFloat74 + this.aClass33_Sub2_3.aFloat72;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt6923 && local59 < (float) this.anInt6923 || !(!(local28 > (float) this.anInt6946) || !((float) this.anInt6946 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt6952 * (this.aClass33_Sub2_3.aFloat82 * (float) arg0 + (float) arg1 * this.aClass33_Sub2_3.aFloat76 + (float) arg2 * this.aClass33_Sub2_3.aFloat81 + this.aClass33_Sub2_3.aFloat75) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt6952 * ((float) arg5 * this.aClass33_Sub2_3.aFloat81 + (float) arg4 * this.aClass33_Sub2_3.aFloat76 + (float) arg3 * this.aClass33_Sub2_3.aFloat82 + this.aClass33_Sub2_3.aFloat75) / local59);
		if (this.aFloat209 > (float) local123 && this.aFloat209 > (float) local155 || (float) local123 > this.aFloat196 && this.aFloat196 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt6934 * (this.aClass33_Sub2_3.aFloat79 + (float) arg0 * this.aClass33_Sub2_3.aFloat73 + (float) arg1 * this.aClass33_Sub2_3.aFloat71 + this.aClass33_Sub2_3.aFloat77 * (float) arg2) / local28);
			@Pc(245) int local245 = (int) (((float) arg4 * this.aClass33_Sub2_3.aFloat71 + this.aClass33_Sub2_3.aFloat73 * (float) arg3 + (float) arg5 * this.aClass33_Sub2_3.aFloat77 + this.aClass33_Sub2_3.aFloat79) * (float) this.anInt6934 / local59);
			return (!((float) local213 < this.aFloat204) || !((float) local245 < this.aFloat204)) && (!((float) local213 > this.aFloat197) || !(this.aFloat197 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(II)V")
	public void method5371(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt6925) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt6925 = arg0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!md;I)V")
	public void method5372(@OriginalArg(0) Interface9 arg0) {
		if (this.aBoolean453) {
			this.method5439(arg0);
			this.method5369(arg0);
		} else if (this.anInt6914 >= 0 && this.anInterface9Array2[this.anInt6914] == arg0) {
			this.anInterface9Array2[this.anInt6914--] = null;
			arg0.method1728();
			if (this.anInt6914 < 0) {
				this.anInterface9_1 = this.anInterface9_2 = null;
			} else {
				this.anInterface9_1 = this.anInterface9_2 = this.anInterface9Array2[this.anInt6914];
				this.anInterface9_1.method1731();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5309(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas5 == arg0) {
			local5 = this.aLong213;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable2.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas6) {
			this.method5358();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IF)V")
	public void method5373(@OriginalArg(1) float arg0) {
		if (arg0 == this.aFloat195) {
			return;
		}
		this.aFloat195 = arg0;
		if (this.anInt6924 == 3) {
			this.method5416();
			return;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class165 method5288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class165_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIII)V")
	public void method5374(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(IZ)V")
	public void method5375(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean459) {
			this.aBoolean459 = arg0;
			this.method5409();
			this.anInt6935 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "()Z")
	@Override
	public boolean method5317() {
		if (this.aClass7_Sub23_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass7_Sub23_Sub1_1.method3676()) {
			if (!this.aClass80_1.method1954(this.aClass7_Sub23_Sub1_1)) {
				return false;
			}
			this.aClass269_1.method5751();
		}
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "xa", descriptor = "()F")
	@Override
	public float xa() {
		return this.aFloat205;
	}

	@OriginalMember(owner = "client!vd", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		this.anInt6909 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt6909++;
		}
		this.anInt6910 = 0x1 << this.anInt6909;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method5336(@OriginalArg(0) Class7_Sub40 arg0) {
		this.aNativeHeap2 = ((Class7_Sub40_Sub1) arg0).aNativeHeap1;
		if (this.anInterface8_6 != null) {
			return;
		}
		@Pc(16) Class7_Sub14_Sub2 local16 = new Class7_Sub14_Sub2(80);
		if (this.aBoolean461) {
			local16.method3996(-1.0F);
			local16.method3996(-1.0F);
			local16.method3996(0.0F);
			local16.method3996(0.0F);
			local16.method3996(1.0F);
			local16.method3996(1.0F);
			local16.method3996(-1.0F);
			local16.method3996(0.0F);
			local16.method3996(1.0F);
			local16.method3996(1.0F);
			local16.method3996(1.0F);
			local16.method3996(1.0F);
			local16.method3996(0.0F);
			local16.method3996(1.0F);
			local16.method3996(0.0F);
			local16.method3996(-1.0F);
			local16.method3996(1.0F);
			local16.method3996(0.0F);
			local16.method3996(0.0F);
			local16.method3996(0.0F);
		} else {
			local16.method3994(-1.0F);
			local16.method3994(-1.0F);
			local16.method3994(0.0F);
			local16.method3994(0.0F);
			local16.method3994(1.0F);
			local16.method3994(1.0F);
			local16.method3994(-1.0F);
			local16.method3994(0.0F);
			local16.method3994(1.0F);
			local16.method3994(1.0F);
			local16.method3994(1.0F);
			local16.method3994(1.0F);
			local16.method3994(0.0F);
			local16.method3994(1.0F);
			local16.method3994(0.0F);
			local16.method3994(-1.0F);
			local16.method3994(1.0F);
			local16.method3994(0.0F);
			local16.method3994(0.0F);
			local16.method3994(0.0F);
		}
		this.anInterface8_6 = this.method5433(local16.aByteArray75, false, 20, local16.anInt4989);
		this.aClass87_13 = new Class87(this.anInterface8_6, 5126, 3, 0);
		this.aClass87_12 = new Class87(this.anInterface8_6, 5126, 2, 12);
		this.aClass264_1.method5620(this);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5298(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas5 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "(IIII)[I")
	@Override
	public int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt6830 - local12 - arg1, arg2, 1, 32993, this.anInt6955, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!jaggl/memory/NativeBuffer;ZIII)Lclient!lm;")
	public Interface8 method5376(@OriginalArg(0) NativeBuffer arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return (Interface8) (this.aBoolean451 ? new Class118_Sub1(this, arg2, arg0, arg1, false) : new Class10_Sub1(this, arg2, arg0));
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(ZI)V")
	public synchronized void method5377(@OriginalArg(1) int arg0) {
		@Pc(7) Class7 local7 = new Class7();
		local7.aLong230 = arg0;
		this.aClass85_45.method2011(local7);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method5413();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method5412(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean464) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean464) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "()Z")
	@Override
	public boolean method5342() {
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean447) {
			throw new RuntimeException("");
		}
		this.anInt6919 = arg2;
		this.anInt6951 = arg3;
		this.anInt6948 = arg1;
		this.anInt6938 = arg0;
		this.aClass263_1.aClass22_Sub2_1.method637();
		this.method5424();
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V")
	public void method5379() {
		if (this.anInt6935 == 2) {
			return;
		}
		this.method5393();
		this.method5414(false);
		this.method5392(false);
		this.method5389(false);
		this.method5375(false);
		this.method5431(-2);
		this.anInt6935 = 2;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5413();
		this.method5412(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLclient!lm;)V")
	public void method5380(@OriginalArg(1) Interface8 arg0) {
		if (this.anInterface8_5 != arg0) {
			if (this.aBoolean451) {
				OpenGL.glBindBufferARB(34962, arg0.method4987());
			}
			this.anInterface8_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V")
	private void method5381() {
		OpenGL.glViewport(this.anInt6928, this.anInt6936, this.anInt6816, this.anInt6830);
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(B)V")
	private void method5382() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static214.method2089(1000L);
		}
	}

	@OriginalMember(owner = "client!vd", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return this.anInt6916 + this.anInt6917 + this.anInt6918;
	}

	@OriginalMember(owner = "client!vd", name = "X", descriptor = "(III[I)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass33_Sub2_3.aFloat72 + this.aClass33_Sub2_3.aFloat78 * (float) arg1 + this.aClass33_Sub2_3.aFloat80 * (float) arg0 + (float) arg2 * this.aClass33_Sub2_3.aFloat74;
		if (local28 < (float) this.anInt6923 || local28 > (float) this.anInt6946) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) (((float) arg0 * this.aClass33_Sub2_3.aFloat82 + this.aClass33_Sub2_3.aFloat76 * (float) arg1 + (float) arg2 * this.aClass33_Sub2_3.aFloat81 + this.aClass33_Sub2_3.aFloat75) * (float) this.anInt6952 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt6934 * ((float) arg2 * this.aClass33_Sub2_3.aFloat77 + this.aClass33_Sub2_3.aFloat73 * (float) arg0 + this.aClass33_Sub2_3.aFloat71 * (float) arg1 + this.aClass33_Sub2_3.aFloat79) / local28);
		if (this.aFloat209 <= (float) local85 && (float) local85 <= this.aFloat196 && (float) local117 >= this.aFloat204 && this.aFloat197 >= (float) local117) {
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat204);
			arg3[0] = (int) ((float) local85 - this.aFloat209);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!qs;)V")
	@Override
	public void method5344(@OriginalArg(0) Class96 arg0) {
		this.aClass96_Sub1_1 = (Class96_Sub1) arg0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5282(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static67.aFloat38 = arg2;
		Static42.aFloat21 = arg0;
		Static223.aFloat111 = arg1;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!du;[Lclient!ul;Z)Lclient!la;")
	@Override
	public Class63 method5281(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class246[] arg1) {
		return new Class63_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5343(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5353();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[BZII)Lclient!oj;")
	public Interface10 method5383(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return (Interface10) (this.aBoolean451 && (!arg1 || this.aBoolean466) ? new Class118_Sub2(this, 5123, arg0, arg2, arg1) : new Class10_Sub2(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "(B)V")
	public void method5384() {
		if (this.anInt6935 == 8) {
			return;
		}
		this.method5367();
		this.method5414(true);
		this.method5389(true);
		this.method5375(true);
		this.method5412(1);
		this.method5400(0);
		this.anInt6935 = 8;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lclient!md;B)V")
	public void method5385(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt6915 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6915 >= 0) {
			this.anInterface9Array3[this.anInt6915].method1729();
		}
		this.anInterface9_1 = this.anInterface9Array3[++this.anInt6915] = arg0;
		this.anInterface9_1.method1730();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class119 method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static198.method2849(arg0, this, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lclient!md;I)V")
	public void method5386(@OriginalArg(0) Interface9 arg0) {
		if (this.aBoolean453) {
			this.method5385(arg0);
			this.method5405(arg0);
		} else if (this.anInt6914 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt6914 >= 0) {
				this.anInterface9Array2[this.anInt6914].method1728();
			}
			this.anInterface9_1 = this.anInterface9_2 = this.anInterface9Array2[++this.anInt6914] = arg0;
			this.anInterface9_1.method1731();
		}
	}

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "()Z")
	@Override
	public boolean method5337() {
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
	@Override
	public void method5331(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "()Z")
	@Override
	public boolean method5326() {
		return this.aClass7_Sub23_Sub1_1 != null && this.aClass7_Sub23_Sub1_1.method3676();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)I")
	public int method5387(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "(I)V")
	public void method5388() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZ)V")
	public void method5389(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean460) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt6935 &= 0xFFFFFFE0;
		this.aBoolean460 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!pv;)V")
	@Override
	public void method5311(@OriginalArg(0) Class201 arg0) {
		this.aClass264_1.method5623(arg0, this);
	}

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "(I)V")
	public void method5390() {
		if (this.anInt6935 == 16) {
			return;
		}
		this.method5420();
		this.method5414(true);
		this.method5389(true);
		this.method5375(true);
		this.method5412(1);
		this.method5400(0);
		this.anInt6935 = 16;
	}

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "(IIII)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6932 = arg0;
		this.anInt6934 = arg3;
		this.anInt6949 = arg1;
		this.anInt6952 = arg2;
		this.method5355();
		this.method5360();
		if (this.anInt6924 == 3) {
			this.method5416();
		} else if (this.anInt6924 == 2) {
			this.method5437();
			return;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BFF)V")
	public void method5391(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat206 = arg1;
		this.aFloat194 = arg0;
		if (!this.aBoolean447) {
			this.method5424();
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(ZI)V")
	public void method5392(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean452) {
			this.aBoolean452 = arg0;
			this.method5399();
			this.anInt6935 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[Lclient!wr;)V")
	@Override
	public void method5318(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub30[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass7_Sub30Array2[local7] = arg1[local7];
		}
		this.anInt6947 = arg0;
		if (this.anInt6924 != 1) {
			this.method5432();
		}
	}

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)Lclient!u;")
	@Override
	public Class7_Sub40 method5347(@OriginalArg(0) int arg0) {
		@Pc(8) Class7_Sub40_Sub1 local8 = new Class7_Sub40_Sub1(arg0);
		this.aClass85_39.method2011(local8);
		return local8;
	}

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "(B)V")
	private void method5393() {
		if (this.anInt6924 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt6816 > 0 && this.anInt6830 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt6816, (double) this.anInt6830, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt6924 = 1;
		this.anInt6935 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIB)V")
	public void method5394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6925 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(19) boolean local19 = false;
		if (this.anInt6937 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local19 = true;
			this.anInt6937 = arg0;
		}
		if (arg1 != this.anInt6930) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt6930 = arg1;
			local19 = true;
		}
		if (local19) {
			this.anInt6935 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBI)V")
	public synchronized void method5395(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class7_Sub2 local15 = new Class7_Sub2(arg1);
		local15.aLong230 = arg0;
		this.aClass85_41.method2011(local15);
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "(FF)V")
	@Override
	public void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat191 && this.aFloat205 == arg1) {
			return;
		}
		this.aFloat205 = arg1;
		this.aFloat191 = arg0;
		this.method5436();
		if (this.anInt6924 == 3) {
			this.method5416();
			return;
		}
		if (this.anInt6924 != 2) {
			return;
		}
		this.method5437();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)V")
	public void method5397(@OriginalArg(1) int arg0) {
		Static356.aFloatArray24[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static356.aFloatArray24[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static356.aFloatArray24[3] = (float) (arg0 >>> 24) / 255.0F;
		Static356.aFloatArray24[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static356.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class11 method5349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class11_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "(I)V")
	private void method5398() {
		if (this.anInt6943 >= this.anInt6920 && this.anInt6927 >= this.anInt6933) {
			OpenGL.glScissor(this.anInt6920 + this.anInt6928, this.anInt6830 + (this.anInt6936 - this.anInt6927), this.anInt6943 - this.anInt6920, -this.anInt6933 + this.anInt6927);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(Z)V")
	private void method5399() {
		if (this.aBoolean452 && !this.aBoolean446) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(IZ)V")
	public void method5400(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method5394(7681, 7681);
		} else if (arg0 == 0) {
			this.method5394(8448, 8448);
		} else if (arg0 == 2) {
			this.method5394(34165, 7681);
		} else if (arg0 == 3) {
			this.method5394(260, 8448);
		} else if (arg0 == 4) {
			this.method5394(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "()Z")
	@Override
	public boolean method5327() {
		return this.aClass7_Sub23_Sub1_1 != null && (this.anInt6908 <= 1 || this.aBoolean449);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(BI)V")
	public synchronized void method5402(@OriginalArg(1) int arg0) {
		@Pc(12) Class7_Sub2 local12 = new Class7_Sub2(arg0);
		this.aClass85_43.method2011(local12);
	}

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "()Z")
	@Override
	public boolean method5301() {
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "()Z")
	@Override
	public boolean method5348() {
		return this.aClass263_1.method5617();
	}

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "(B)I")
	private int method5403() {
		@Pc(5) int local5 = 0;
		this.aString66 = OpenGL.glGetString(7936).toLowerCase();
		this.aString65 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString66.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString66.indexOf("brian paul") != -1 || this.aString66.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static295.method3893(local46.replace('.', ' '), ' ');
		if (local54.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(72) int local72 = Static259.method3459(local54[0]);
				@Pc(80) int local80 = Static259.method3459(local54[1]);
				this.anInt6922 = local80 + local72 * 10;
			} catch (@Pc(89) NumberFormatException local89) {
				local5 |= 0x4;
			}
		}
		if (this.anInt6922 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(123) int[] local123 = new int[1];
		OpenGL.glGetIntegerv(34018, local123, 0);
		this.anInt6942 = local123[0];
		OpenGL.glGetIntegerv(34929, local123, 0);
		this.anInt6931 = local123[0];
		OpenGL.glGetIntegerv(34930, local123, 0);
		this.anInt6953 = local123[0];
		if (this.anInt6942 < 2 || this.anInt6931 < 2 || this.anInt6953 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean461 = NativeStream.a();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean451 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean464 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean443 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean440 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean441 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean455 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean442 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean457 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean454 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean467 = false;
		this.aBoolean458 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean453 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean444 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean449 = this.aBoolean453 & this.aBoolean444;
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "(B)V")
	private void method5404() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!md;)V")
	public void method5405(@OriginalArg(1) Interface9 arg0) {
		if (this.anInt6913 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6913 >= 0) {
			this.anInterface9Array1[this.anInt6913].method1726();
		}
		this.anInterface9_2 = this.anInterface9Array1[++this.anInt6913] = arg0;
		this.anInterface9_2.method1727();
	}

	@OriginalMember(owner = "client!vd", name = "da", descriptor = "([I)V")
	@Override
	public void da(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt6943;
		arg0[0] = this.anInt6920;
		arg0[3] = this.anInt6927;
		arg0[1] = this.anInt6933;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(IB)I")
	public int method5406(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	@Override
	public void method5279(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass80_1.method1946(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(Z)V")
	@Override
	public void method5333(@OriginalArg(0) boolean arg0) {
		this.aBoolean462 = arg0;
		this.method5409();
	}

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "(B)Lclient!ui;")
	public Class59_Sub4 method5407() {
		return this.aClass96_Sub1_1 == null ? null : this.aClass96_Sub1_1.method2755();
	}

	@OriginalMember(owner = "client!vd", name = "TA", descriptor = "(IIIII)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5413();
		this.method5412(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vd", name = "W", descriptor = "()F")
	@Override
	public float W() {
		return this.aFloat191;
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V")
	@Override
	public void method5345(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt6907 = arg0;
		this.aClass269_1.method5751();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZI)V")
	public void method5408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(Z)V")
	private void method5409() {
		OpenGL.glDepthMask(this.aBoolean459 && this.aBoolean462);
	}

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "()V")
	@Override
	public void method5302() {
		this.aClass80_1.method1947();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!t;Lclient!pv;Lclient!c;Lclient!qb;I)V")
	@Override
	public void method5291(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class28_Sub6 arg3) {
		arg0.method4667(arg2, arg3, 0);
		this.method5311(arg1);
	}

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "(I)V")
	private void method5411() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass33_Sub2_3.method2389(), 0);
		if (this.aBoolean447) {
			this.aClass263_1.aClass22_Sub2_1.method637();
		}
		this.method5356();
		this.method5432();
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(II)V")
	public void method5412(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt6926) {
			return;
		}
		@Pc(28) boolean local28;
		@Pc(26) byte local26;
		if (arg0 == 1) {
			local26 = 1;
			local28 = true;
		} else if (arg0 == 2) {
			local26 = 2;
			local28 = false;
		} else if (arg0 == 128) {
			local26 = 3;
			local28 = true;
		} else {
			local26 = 0;
			local28 = false;
		}
		if (!this.aBoolean456) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean456 = true;
		}
		if (local28 != this.aBoolean463) {
			if (local28) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean463 = local28;
		}
		if (local26 != this.anInt6939) {
			if (local26 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local26 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local26 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt6939 = local26;
		}
		this.anInt6926 = arg0;
		this.anInt6935 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!vd", name = "T", descriptor = "(IFFFFF)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt6929 != arg0;
		if (local15 || this.aFloat207 != arg1 || this.aFloat208 != arg2) {
			this.aFloat207 = arg1;
			this.aFloat208 = arg2;
			this.anInt6929 = arg0;
			if (local15) {
				this.aFloat203 = (float) (this.anInt6929 & 0xFF0000) / 1.671168E7F;
				this.aFloat193 = (float) (this.anInt6929 & 0xFF00) / 65280.0F;
				this.aFloat202 = (float) (this.anInt6929 & 0xFF) / 255.0F;
				this.method5438();
			}
			this.method5428();
		}
		if (arg3 == this.aFloatArray27[0] && this.aFloatArray27[1] == arg4 && arg5 == this.aFloatArray27[2]) {
			return;
		}
		this.aFloatArray27[0] = arg3;
		this.aFloatArray27[2] = arg5;
		this.aFloatArray27[1] = arg4;
		this.aFloatArray31[0] = -arg3;
		this.aFloatArray31[2] = -arg5;
		this.aFloatArray31[1] = -arg4;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray30[2] = arg5 * local142;
		this.aFloatArray30[1] = arg4 * local142;
		this.aFloatArray30[0] = local142 * arg3;
		this.aFloatArray28[2] = -this.aFloatArray30[2];
		this.aFloatArray28[1] = -this.aFloatArray30[1];
		this.aFloatArray28[0] = -this.aFloatArray30[0];
		this.method5356();
		this.anInt6921 = (int) (arg3 * 256.0F / arg4);
		this.anInt6940 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "(I)V")
	private void method5413() {
		if (this.anInt6935 == 1) {
			return;
		}
		this.method5393();
		this.method5414(false);
		this.method5392(false);
		this.method5389(false);
		this.method5375(false);
		this.method5364(null);
		this.method5431(-2);
		this.method5400(1);
		this.anInt6935 = 1;
	}

	@OriginalMember(owner = "client!vd", name = "UA", descriptor = "(III)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6954 == arg0 && arg1 == this.anInt6950 && arg2 == this.anInt6945) {
			return;
		}
		this.anInt6950 = arg1;
		this.anInt6945 = arg2;
		this.anInt6954 = arg0;
		if (this.aBoolean447) {
			return;
		}
		this.method5424();
		this.method5361();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!qb;I)V")
	@Override
	public void method5334(@OriginalArg(0) Class163[] arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class28_Sub6[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method4667(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "()Z")
	@Override
	public boolean method5284() {
		return false;
	}

	@OriginalMember(owner = "client!vd", name = "ia", descriptor = "(II)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6923 == arg0 && arg1 == this.anInt6946) {
			return;
		}
		this.anInt6946 = arg1;
		this.anInt6923 = arg0;
		this.method5355();
		this.method5424();
		if (this.anInt6924 == 3) {
			this.method5416();
		} else if (this.anInt6924 == 2) {
			this.method5437();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([Lclient!t;Lclient!pv;Lclient!c;[Lclient!qb;I)V")
	@Override
	public void method5322(@OriginalArg(0) Class163[] arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class28_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method5334(arg0, arg2, arg3, arg4);
		this.method5311(arg1);
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "()I")
	@Override
	public int method5290() {
		return 4;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!qs;Lclient!qs;FLclient!qs;)Lclient!qs;")
	@Override
	public Class96 method5320(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class96 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean457 && this.aBoolean458) {
			@Pc(15) Class96_Sub1_Sub2 local15 = null;
			@Pc(18) Class96_Sub1 local18 = (Class96_Sub1) arg0;
			@Pc(21) Class96_Sub1 local21 = (Class96_Sub1) arg1;
			@Pc(25) Class59_Sub4 local25 = local18.method2755();
			@Pc(29) Class59_Sub4 local29 = local21.method2755();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt6451 > local29.anInt6451 ? local25.anInt6451 : local29.anInt6451;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class96_Sub1_Sub2) {
					@Pc(60) Class96_Sub1_Sub2 local60 = (Class96_Sub1_Sub2) arg3;
					if (local60.method2757() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class96_Sub1_Sub2(this, local48);
				}
				if (local15.method2759(local25, arg2, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(ZZ)V")
	public void method5414(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean450 != arg0) {
			this.aBoolean450 = arg0;
			this.method5361();
			this.anInt6935 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "()Lclient!c;")
	@Override
	public Class33 method5293() {
		return new Class33_Sub2();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method5339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class119 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class119_Sub2 local6 = (Class119_Sub2) arg5;
		@Pc(9) Class59_Sub3_Sub1 local9 = local6.aClass59_Sub3_Sub1_3;
		this.method5379();
		this.method5364(local6.aClass59_Sub3_Sub1_3);
		this.method5412(1);
		this.method5394(7681, 8448);
		this.method5408(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat220 / (float) local9.anInt7491;
		@Pc(46) float local46 = local9.aFloat221 / (float) local9.anInt7494;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method5408(768, 5890, 0);
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)I")
	@Override
	public int method5352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!ft;Lclient!ft;ILclient!ft;Lclient!ft;)V")
	public void method5415(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(3) Class87 arg2, @OriginalArg(4) Class87 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5380(arg0.anInterface8_2);
			OpenGL.glVertexPointer(arg0.aByte20, arg0.aShort27, this.anInterface8_5.method4985(), this.anInterface8_5.method4986() + (long) arg0.aByte19);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5380(arg2.anInterface8_2);
			OpenGL.glNormalPointer(arg2.aShort27, this.anInterface8_5.method4985(), this.anInterface8_5.method4986() + (long) arg2.aByte19);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5380(arg1.anInterface8_2);
			OpenGL.glColorPointer(arg1.aByte20, arg1.aShort27, this.anInterface8_5.method4985(), this.anInterface8_5.method4986() + (long) arg1.aByte19);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5380(arg3.anInterface8_2);
			OpenGL.glTexCoordPointer(arg3.aByte20, arg3.aShort27, this.anInterface8_5.method4985(), this.anInterface8_5.method4986() + (long) arg3.aByte19);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "(I)V")
	private void method5416() {
		@Pc(15) float local15 = (float) -this.anInt6932 * this.aFloat195 / (float) this.anInt6952;
		@Pc(33) float local33 = (float) -this.anInt6949 * this.aFloat195 / (float) this.anInt6934;
		@Pc(47) float local47 = this.aFloat195 * (float) (this.anInt6816 - this.anInt6932) / (float) this.anInt6952;
		@Pc(62) float local62 = this.aFloat195 * (float) (this.anInt6830 - this.anInt6949) / (float) this.anInt6934;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local47 && local33 != local62) {
			OpenGL.glOrtho((double) local15, (double) local47, (double) -local62, (double) -local33, (double) ((float) this.anInt6923 - this.aFloat205), (double) ((float) this.anInt6946 - this.aFloat205));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!oj;)V")
	public void method5417(@OriginalArg(1) Interface10 arg0) {
		if (this.anInterface10_5 != arg0) {
			if (this.aBoolean451) {
				OpenGL.glBindBufferARB(34963, arg0.method5746());
			}
			this.anInterface10_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "(B)V")
	private void method5419() {
		this.aClass33_Sub2_3 = new Class33_Sub2();
		this.aClass33_Sub2_4 = new Class33_Sub2();
		this.aClass59Array1 = new Class59[this.anInt6942];
		this.aClass59_Sub3_5 = new Class59_Sub3(this, 3553, 6408, 1, 1);
		new Class59_Sub3(this, 3553, 6408, 1, 1);
		new Class59_Sub3(this, 3553, 6408, 1, 1);
		this.aClass163_Sub2_2 = new Class163_Sub2(this);
		this.aClass163_Sub2_9 = new Class163_Sub2(this);
		this.aClass163_Sub2_7 = new Class163_Sub2(this);
		this.aClass163_Sub2_1 = new Class163_Sub2(this);
		this.aClass163_Sub2_3 = new Class163_Sub2(this);
		this.aClass163_Sub2_10 = new Class163_Sub2(this);
		this.aClass163_Sub2_8 = new Class163_Sub2(this);
		this.aClass163_Sub2_4 = new Class163_Sub2(this);
		this.aClass163_Sub2_5 = new Class163_Sub2(this);
		this.aClass163_Sub2_6 = new Class163_Sub2(this);
		if (this.aBoolean458) {
			this.aClass73_6 = new Class73(this);
			new Class73(this);
		}
	}

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "()I")
	@Override
	public int w() {
		@Pc(6) int local6 = this.anInt6956;
		this.anInt6956 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "(B)V")
	private void method5420() {
		if (this.anInt6924 != 3) {
			this.anInt6924 = 3;
			this.method5416();
			this.method5411();
			this.anInt6935 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIF)Lclient!wr;")
	@Override
	public Class7_Sub30 method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class7_Sub30_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!vd", name = "OA", descriptor = "(IIII)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > this.anInt6816) {
			arg2 = this.anInt6816;
		}
		if (arg3 > this.anInt6830) {
			arg3 = this.anInt6830;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt6943 = arg2;
		this.anInt6933 = arg1;
		this.anInt6927 = arg3;
		this.anInt6920 = arg0;
		OpenGL.glEnable(3089);
		this.method5360();
		this.method5398();
	}

	@OriginalMember(owner = "client!vd", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		@Pc(6) int local6 = this.anInt6957;
		this.anInt6957 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
	@Override
	public void method5340(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "()Lclient!c;")
	@Override
	public Class33 method5285() {
		return this.aClass33_Sub2_1;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5299(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class7_Sub2 local19;
		while (!this.aClass85_41.method2007()) {
			local19 = (Class7_Sub2) this.aClass85_41.method2004();
			Static105.anIntArray145[local7++] = (int) local19.aLong230;
			this.anInt6916 -= local19.anInt128;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static105.anIntArray145, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static105.anIntArray145, 0);
			local7 = 0;
		}
		while (!this.aClass85_42.method2007()) {
			local19 = (Class7_Sub2) this.aClass85_42.method2004();
			Static105.anIntArray145[local7++] = (int) local19.aLong230;
			this.anInt6917 -= local19.anInt128;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static105.anIntArray145, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static105.anIntArray145, 0);
			local7 = 0;
		}
		while (!this.aClass85_43.method2007()) {
			local19 = (Class7_Sub2) this.aClass85_43.method2004();
			Static105.anIntArray145[local7++] = local19.anInt128;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static105.anIntArray145, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static105.anIntArray145, 0);
			local7 = 0;
		}
		while (!this.aClass85_44.method2007()) {
			local19 = (Class7_Sub2) this.aClass85_44.method2004();
			Static105.anIntArray145[local7++] = (int) local19.aLong230;
			this.anInt6918 -= local19.anInt128;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static105.anIntArray145, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static105.anIntArray145, 0);
		}
		while (!this.aClass85_40.method2007()) {
			local19 = (Class7_Sub2) this.aClass85_40.method2004();
			OpenGL.glDeleteLists((int) local19.aLong230, local19.anInt128);
		}
		@Pc(212) Class7 local212;
		while (!this.aClass85_45.method2007()) {
			local212 = this.aClass85_45.method2004();
			OpenGL.glDeleteProgramARB((int) local212.aLong230);
		}
		while (!this.aClass85_46.method2007()) {
			local212 = this.aClass85_46.method2004();
			OpenGL.glDeleteObjectARB(local212.aLong230);
		}
		while (!this.aClass85_40.method2007()) {
			local19 = (Class7_Sub2) this.aClass85_40.method2004();
			OpenGL.glDeleteLists((int) local19.aLong230, local19.anInt128);
		}
		this.aClass269_1.method5753();
		if (this.IA() > 100663296 && this.aLong214 + 60000L < Static158.method2342()) {
			System.gc();
			this.aLong214 = Static158.method2342();
		}
		this.anInt6911 = local11;
	}

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "()V")
	@Override
	public void method5292() {
		if (!this.aBoolean445 || this.anInt6816 <= 0 || this.anInt6830 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt6920;
		@Pc(22) int local22 = this.anInt6943;
		@Pc(25) int local25 = this.anInt6933;
		@Pc(28) int local28 = this.anInt6927;
		this.e();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5362();
		this.method5414(false);
		this.method5392(false);
		this.method5389(false);
		this.method5375(false);
		this.method5364(null);
		this.method5431(-2);
		this.method5400(1);
		this.method5412(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt6816, this.anInt6830, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.OA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!vd", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6933 < arg1) {
			this.anInt6933 = arg1;
		}
		if (arg3 < this.anInt6927) {
			this.anInt6927 = arg3;
		}
		if (this.anInt6943 > arg2) {
			this.anInt6943 = arg2;
		}
		if (this.anInt6920 < arg0) {
			this.anInt6920 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method5360();
		this.method5398();
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
	@Override
	public void method5341(@OriginalArg(0) int arg0) {
		this.method5382();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLclient!hs;)V")
	public void method5421(@OriginalArg(1) Class33_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method2389(), 0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(FFBF)V")
	private void method5422(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean465) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean465 = true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!ul;Z)Lclient!l;")
	@Override
	public Class11 method5308(@OriginalArg(0) Class246 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt6476 * arg0.anInt6475];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray89 == null) {
			for (local21 = 0; local21 < arg0.anInt6475; local21++) {
				for (local25 = 0; local25 < arg0.anInt6476; local25++) {
					@Pc(38) int local38 = arg0.anIntArray578[arg0.aByteArray90[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt6475; local21++) {
				for (local25 = 0; local25 < arg0.anInt6476; local25++) {
					local12[local16++] = arg0.aByteArray89[local14] << 24 | arg0.anIntArray578[arg0.aByteArray90[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(119) Class11 local119 = this.method5310(local12, arg0.anInt6476, arg0.anInt6476, arg0.anInt6475);
		local119.MA(arg0.anInt6473, arg0.anInt6478, arg0.anInt6474, arg0.anInt6477);
		return local119;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5413();
		this.method5412(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(IIII)V")
	public void method5423(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "(I)V")
	private void method5424() {
		@Pc(15) int local15;
		if (this.aBoolean447) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt6948;
		} else {
			this.aFloat192 = (float) (this.anInt6946 - this.anInt6945) - this.aFloat194;
			this.aFloat198 = this.aFloat192 - this.aFloat206 * (float) this.anInt6950;
			if ((float) this.anInt6923 > this.aFloat198) {
				this.aFloat198 = this.anInt6923;
			}
			OpenGL.glFogf(2915, this.aFloat198);
			OpenGL.glFogf(2916, this.aFloat192);
			local15 = this.anInt6954;
		}
		Static356.aFloatArray24[2] = (float) (local15 & 0xFF) / 255.0F;
		Static356.aFloatArray24[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static356.aFloatArray24[1] = (float) (local15 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static356.aFloatArray24, 0);
		if (this.aBoolean447) {
			this.aClass263_1.aClass22_Sub2_1.method638();
		}
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "(Z)V")
	public void method5425() {
		if (this.anInt6935 == 4) {
			return;
		}
		this.method5393();
		this.method5414(false);
		this.method5392(false);
		this.method5389(false);
		this.method5375(false);
		this.method5431(-2);
		this.method5412(1);
		this.method5400(0);
		this.anInt6935 = 4;
	}

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "(I)V")
	private void method5426() {
		this.method5431(-2);
		for (@Pc(14) int local14 = this.anInt6942 - 1; local14 >= 0; local14--) {
			this.method5371(local14);
			this.method5364(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5394(8448, 8448);
		this.method5408(770, 34168, 2);
		this.method5354();
		this.anInt6926 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt6939 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean463 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean456 = true;
		this.method5414(true);
		this.method5392(true);
		this.method5389(true);
		this.method5375(true);
		this.method5362();
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
		@Pc(130) float[] local130 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(132) int local132 = 0; local132 < 8; local132++) {
			@Pc(138) int local138 = local132 + 16384;
			OpenGL.glLightfv(local138, 4608, local130, 0);
			OpenGL.glLightf(local138, 4615, 0.0F);
			OpenGL.glLightf(local138, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt6929 = this.anInt6954 = -1;
		this.e();
	}

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "(IIIIII)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method5413();
		this.method5412(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean464) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean464) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(JI)V")
	public synchronized void method5427(@OriginalArg(0) long arg0) {
		@Pc(7) Class7 local7 = new Class7();
		local7.aLong230 = arg0;
		this.aClass85_46.method2011(local7);
	}

	@OriginalMember(owner = "client!vd", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt6946;
	}

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "(B)V")
	private void method5428() {
		Static356.aFloatArray24[0] = this.aFloat203 * this.aFloat207;
		Static356.aFloatArray24[3] = 1.0F;
		Static356.aFloatArray24[2] = this.aFloat202 * this.aFloat207;
		Static356.aFloatArray24[1] = this.aFloat193 * this.aFloat207;
		OpenGL.glLightfv(16384, 4609, Static356.aFloatArray24, 0);
		Static356.aFloatArray24[3] = 1.0F;
		Static356.aFloatArray24[2] = this.aFloat202 * -this.aFloat208;
		Static356.aFloatArray24[1] = this.aFloat193 * -this.aFloat208;
		Static356.aFloatArray24[0] = -this.aFloat208 * this.aFloat203;
		OpenGL.glLightfv(16385, 4609, Static356.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)V")
	public void method5429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6936 = arg0;
		this.anInt6928 = arg1;
		this.method5381();
		this.method5398();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBZ)V")
	public void method5430(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method5357(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(II)V")
	public void method5431(@OriginalArg(0) int arg0) {
		this.method5430(arg0, true);
	}

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "()V")
	@Override
	public void method5353() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "(I)V")
	private void method5432() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt6947; local7++) {
			@Pc(14) Class7_Sub30 local14 = this.aClass7_Sub30Array2[local7];
			Static353.aFloatArray23[0] = local14.method5032();
			@Pc(25) int local25 = local7 + 16386;
			Static353.aFloatArray23[1] = local14.method5029();
			Static353.aFloatArray23[2] = local14.method5023();
			Static353.aFloatArray23[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static353.aFloatArray23, 0);
			@Pc(52) int local52 = local14.method5025();
			@Pc(58) float local58 = local14.method5024() / 255.0F;
			Static353.aFloatArray23[2] = (float) (local52 & 0xFF) * local58;
			Static353.aFloatArray23[0] = local58 * (float) (local52 >> 16 & 0xFF);
			Static353.aFloatArray23[1] = (float) (local52 >> 8 & 0xFF) * local58;
			OpenGL.glLightfv(local25, 4609, Static353.aFloatArray23, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method5031() * local14.method5031()));
			OpenGL.glEnable(local25);
		}
		while (local7 < this.anInt6944) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt6944 = this.anInt6947;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I[BZII)Lclient!lm;")
	public Interface8 method5433(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return (Interface8) (this.aBoolean451 && (!arg1 || this.aBoolean466) ? new Class118_Sub1(this, arg2, arg0, arg3, arg1) : new Class10_Sub1(this, arg2, arg0, arg3));
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!hs;I)V")
	public void method5434(@OriginalArg(0) Class33_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method2389(), 0);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "()V")
	@Override
	public void method5278() {
		this.method5375(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "(I)V")
	@Override
	public void p(@OriginalArg(0) int arg0) {
		this.method5412(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "()V")
	@Override
	public void l() {
		this.aBoolean447 = false;
		this.aClass263_1.method5616(0, false, false);
		this.method5424();
		this.method5361();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZ)V")
	public synchronized void method5435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class7_Sub2 local14 = new Class7_Sub2(arg0);
		local14.aLong230 = arg1;
		this.aClass85_44.method2011(local14);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)I")
	@Override
	public int method5323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "()V")
	@Override
	public void method5300() {
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	@Override
	public void method5306(@OriginalArg(0) int arg0) {
		this.method5404();
	}

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "(B)V")
	private void method5436() {
		if (this.aFloat205 == 0.0F) {
			this.aFloatArray29[10] = this.aFloat200;
			this.aFloatArray29[14] = this.aFloat201;
		} else {
			@Pc(31) float local31 = this.aFloat191 / (this.aFloat205 + this.aFloat191);
			@Pc(35) float local35 = local31 * local31;
			@Pc(50) float local50 = (1.0F - local31) * -this.aFloat201 * (1.0F - local31) / this.aFloat205;
			this.aFloatArray29[14] = this.aFloat201 * local35;
			this.aFloatArray29[10] = this.aFloat200 + local50;
		}
		this.bf = ((float) -this.anInt6946 + this.aFloatArray29[14]) / this.aFloatArray29[10];
		this.aFloat210 = (float) this.anInt6946 - this.aFloat205;
	}

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "(I)V")
	private void method5437() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray29, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(IIIIII)Lclient!qs;")
	@Override
	public Class96 method5351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean457 ? new Class96_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "()V")
	@Override
	public void method5283() {
		if (this.aClass7_Sub23_Sub1_1 != null && this.aClass7_Sub23_Sub1_1.method3676()) {
			this.aClass80_1.method1949(this.aClass7_Sub23_Sub1_1);
			this.aClass269_1.method5751();
		}
	}

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "()Z")
	@Override
	public boolean method5307() {
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "(B)V")
	private void method5438() {
		Static356.aFloatArray24[3] = 1.0F;
		Static356.aFloatArray24[1] = this.aFloat193 * this.aFloat199;
		Static356.aFloatArray24[0] = this.aFloat199 * this.aFloat203;
		Static356.aFloatArray24[2] = this.aFloat199 * this.aFloat202;
		OpenGL.glLightModelfv(2899, Static356.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "()Z")
	@Override
	public boolean method5295() {
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "NA", descriptor = "(IIIII)V")
	@Override
	protected void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLclient!md;)V")
	public void method5439(@OriginalArg(1) Interface9 arg0) {
		if (this.anInt6915 < 0 || this.anInterface9Array3[this.anInt6915] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface9Array3[this.anInt6915--] = null;
		arg0.method1729();
		if (this.anInt6915 < 0) {
			this.anInterface9_1 = null;
		} else {
			this.anInterface9_1 = this.anInterface9Array3[this.anInt6915];
			this.anInterface9_1.method1730();
		}
	}
}
