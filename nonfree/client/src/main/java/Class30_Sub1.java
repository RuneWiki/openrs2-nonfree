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

@OriginalClass("client!bv")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!bv", name = "jb", descriptor = "I")
	private int anInt1098;

	@OriginalMember(owner = "client!bv", name = "ac", descriptor = "I")
	public int anInt1138;

	@OriginalMember(owner = "client!bv", name = "jc", descriptor = "I")
	private int anInt1147;

	@OriginalMember(owner = "client!bv", name = "xc", descriptor = "I")
	public int anInt1161;

	@OriginalMember(owner = "client!bv", name = "qe", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!bv", name = "se", descriptor = "I")
	public int anInt1244;

	@OriginalMember(owner = "client!bv", name = "ve", descriptor = "Lclient!cc;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!bv", name = "Ae", descriptor = "Lclient!cc;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!bv", name = "Be", descriptor = "I")
	public int anInt1248;

	@OriginalMember(owner = "client!bv", name = "Ce", descriptor = "I")
	private int anInt1249;

	@OriginalMember(owner = "client!bv", name = "De", descriptor = "I")
	public int anInt1250;

	@OriginalMember(owner = "client!bv", name = "Le", descriptor = "I")
	private int anInt1251;

	@OriginalMember(owner = "client!bv", name = "Ne", descriptor = "Z")
	private boolean aBoolean57;

	@OriginalMember(owner = "client!bv", name = "Oe", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!bv", name = "Pe", descriptor = "Z")
	public boolean aBoolean58;

	@OriginalMember(owner = "client!bv", name = "Se", descriptor = "I")
	private int anInt1253;

	@OriginalMember(owner = "client!bv", name = "Te", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!bv", name = "Ue", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!bv", name = "Xe", descriptor = "I")
	private int anInt1256;

	@OriginalMember(owner = "client!bv", name = "Ye", descriptor = "Z")
	public boolean aBoolean59;

	@OriginalMember(owner = "client!bv", name = "Ze", descriptor = "Lclient!wg;")
	public Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!bv", name = "af", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_2;

	@OriginalMember(owner = "client!bv", name = "cf", descriptor = "Lclient!rc;")
	public Class116_Sub2 aClass116_Sub2_3;

	@OriginalMember(owner = "client!bv", name = "df", descriptor = "I")
	private int anInt1257;

	@OriginalMember(owner = "client!bv", name = "ef", descriptor = "Z")
	private boolean aBoolean60;

	@OriginalMember(owner = "client!bv", name = "gf", descriptor = "Lclient!ks;")
	public Class142 aClass142_1;

	@OriginalMember(owner = "client!bv", name = "kf", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_3;

	@OriginalMember(owner = "client!bv", name = "lf", descriptor = "I")
	public int anInt1260;

	@OriginalMember(owner = "client!bv", name = "mf", descriptor = "I")
	private int anInt1261;

	@OriginalMember(owner = "client!bv", name = "nf", descriptor = "I")
	private int anInt1262;

	@OriginalMember(owner = "client!bv", name = "of", descriptor = "Z")
	private boolean aBoolean61;

	@OriginalMember(owner = "client!bv", name = "pf", descriptor = "Z")
	public boolean aBoolean62;

	@OriginalMember(owner = "client!bv", name = "tf", descriptor = "Lclient!it;")
	public Class124 aClass124_5;

	@OriginalMember(owner = "client!bv", name = "vf", descriptor = "I")
	private int anInt1264;

	@OriginalMember(owner = "client!bv", name = "wf", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_4;

	@OriginalMember(owner = "client!bv", name = "zf", descriptor = "Lclient!rc;")
	public Class116_Sub2 aClass116_Sub2_4;

	@OriginalMember(owner = "client!bv", name = "Af", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_5;

	@OriginalMember(owner = "client!bv", name = "Cf", descriptor = "I")
	private int anInt1267;

	@OriginalMember(owner = "client!bv", name = "Df", descriptor = "I")
	public int anInt1268;

	@OriginalMember(owner = "client!bv", name = "Ef", descriptor = "F")
	private float aFloat27;

	@OriginalMember(owner = "client!bv", name = "Ff", descriptor = "Z")
	public boolean aBoolean65;

	@OriginalMember(owner = "client!bv", name = "Hf", descriptor = "Lclient!tb;")
	private Class59_Sub1 aClass59_Sub1_1;

	@OriginalMember(owner = "client!bv", name = "Jf", descriptor = "Z")
	private boolean aBoolean67;

	@OriginalMember(owner = "client!bv", name = "Lf", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!bv", name = "Mf", descriptor = "I")
	private int anInt1269;

	@OriginalMember(owner = "client!bv", name = "Qf", descriptor = "Lclient!wg;")
	public Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!bv", name = "Rf", descriptor = "I")
	public int anInt1272;

	@OriginalMember(owner = "client!bv", name = "Vf", descriptor = "I")
	private int anInt1274;

	@OriginalMember(owner = "client!bv", name = "Wf", descriptor = "Z")
	private boolean aBoolean70;

	@OriginalMember(owner = "client!bv", name = "Zf", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_6;

	@OriginalMember(owner = "client!bv", name = "cg", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!bv", name = "dg", descriptor = "Z")
	private boolean aBoolean71;

	@OriginalMember(owner = "client!bv", name = "eg", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!bv", name = "fg", descriptor = "Lclient!og;")
	private Class1_Sub3_Sub1 aClass1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!bv", name = "hg", descriptor = "I")
	private int anInt1277;

	@OriginalMember(owner = "client!bv", name = "jg", descriptor = "Lclient!ks;")
	public Class142 aClass142_2;

	@OriginalMember(owner = "client!bv", name = "kg", descriptor = "Lclient!gf;")
	private Interface6 anInterface6_2;

	@OriginalMember(owner = "client!bv", name = "pg", descriptor = "Z")
	public boolean aBoolean72;

	@OriginalMember(owner = "client!bv", name = "rg", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!bv", name = "tg", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!bv", name = "ug", descriptor = "I")
	public int anInt1282;

	@OriginalMember(owner = "client!bv", name = "zg", descriptor = "Z")
	private boolean aBoolean75;

	@OriginalMember(owner = "client!bv", name = "Ag", descriptor = "Z")
	public boolean aBoolean76;

	@OriginalMember(owner = "client!bv", name = "Bg", descriptor = "Z")
	public boolean aBoolean77;

	@OriginalMember(owner = "client!bv", name = "Cg", descriptor = "Z")
	public boolean aBoolean78;

	@OriginalMember(owner = "client!bv", name = "Eg", descriptor = "J")
	private long aLong24;

	@OriginalMember(owner = "client!bv", name = "Fg", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_7;

	@OriginalMember(owner = "client!bv", name = "Gg", descriptor = "Lclient!tu;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!bv", name = "Hg", descriptor = "F")
	private float aFloat39;

	@OriginalMember(owner = "client!bv", name = "Ig", descriptor = "Z")
	private boolean aBoolean79;

	@OriginalMember(owner = "client!bv", name = "Jg", descriptor = "I")
	private int anInt1286;

	@OriginalMember(owner = "client!bv", name = "Kg", descriptor = "Z")
	public boolean aBoolean80;

	@OriginalMember(owner = "client!bv", name = "Lg", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_8;

	@OriginalMember(owner = "client!bv", name = "Ng", descriptor = "Lclient!wg;")
	public Class1_Sub3 aClass1_Sub3_3;

	@OriginalMember(owner = "client!bv", name = "Og", descriptor = "Lclient!it;")
	public Class124 aClass124_6;

	@OriginalMember(owner = "client!bv", name = "Pg", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!bv", name = "Qg", descriptor = "I")
	private int anInt1287;

	@OriginalMember(owner = "client!bv", name = "Rg", descriptor = "Z")
	private boolean aBoolean81;

	@OriginalMember(owner = "client!bv", name = "Ug", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!bv", name = "Vg", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_9;

	@OriginalMember(owner = "client!bv", name = "Xg", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_10;

	@OriginalMember(owner = "client!bv", name = "Zg", descriptor = "F")
	private float aFloat43;

	@OriginalMember(owner = "client!bv", name = "ah", descriptor = "Z")
	private boolean aBoolean83;

	@OriginalMember(owner = "client!bv", name = "bh", descriptor = "[Lclient!kv;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!bv", name = "ch", descriptor = "Lclient!gf;")
	private Interface6 anInterface6_3;

	@OriginalMember(owner = "client!bv", name = "Ac", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!bv", name = "he", descriptor = "I")
	public int anInt1240 = 128;

	@OriginalMember(owner = "client!bv", name = "Wd", descriptor = "Lclient!on;")
	private final Class176 aClass176_1 = new Class176();

	@OriginalMember(owner = "client!bv", name = "ie", descriptor = "Lclient!rc;")
	private final Class116_Sub2 aClass116_Sub2_1 = new Class116_Sub2();

	@OriginalMember(owner = "client!bv", name = "je", descriptor = "Lclient!rc;")
	public final Class116_Sub2 aClass116_Sub2_2 = new Class116_Sub2();

	@OriginalMember(owner = "client!bv", name = "me", descriptor = "I")
	public int anInt1242 = 3;

	@OriginalMember(owner = "client!bv", name = "oe", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!bv", name = "re", descriptor = "I")
	public int anInt1243 = 8;

	@OriginalMember(owner = "client!bv", name = "pe", descriptor = "Lclient!vr;")
	private final Class258 aClass258_6 = new Class258();

	@OriginalMember(owner = "client!bv", name = "te", descriptor = "[Lclient!cc;")
	private final Interface1[] anInterface1Array1 = new Interface1[4];

	@OriginalMember(owner = "client!bv", name = "xe", descriptor = "I")
	private int anInt1245 = -1;

	@OriginalMember(owner = "client!bv", name = "we", descriptor = "[Lclient!cc;")
	private final Interface1[] anInterface1Array3 = new Interface1[4];

	@OriginalMember(owner = "client!bv", name = "ue", descriptor = "[Lclient!cc;")
	private final Interface1[] anInterface1Array2 = new Interface1[4];

	@OriginalMember(owner = "client!bv", name = "ye", descriptor = "I")
	private int anInt1246 = -1;

	@OriginalMember(owner = "client!bv", name = "ze", descriptor = "I")
	private int anInt1247 = -1;

	@OriginalMember(owner = "client!bv", name = "Ee", descriptor = "Lclient!vr;")
	private final Class258 aClass258_7;

	@OriginalMember(owner = "client!bv", name = "Fe", descriptor = "Lclient!vr;")
	private final Class258 aClass258_8;

	@OriginalMember(owner = "client!bv", name = "Ge", descriptor = "Lclient!vr;")
	private final Class258 aClass258_9;

	@OriginalMember(owner = "client!bv", name = "He", descriptor = "Lclient!vr;")
	private final Class258 aClass258_10;

	@OriginalMember(owner = "client!bv", name = "Ie", descriptor = "Lclient!vr;")
	private final Class258 aClass258_11;

	@OriginalMember(owner = "client!bv", name = "Je", descriptor = "Lclient!vr;")
	private final Class258 aClass258_12;

	@OriginalMember(owner = "client!bv", name = "Ke", descriptor = "Lclient!vr;")
	private final Class258 aClass258_13;

	@OriginalMember(owner = "client!bv", name = "Me", descriptor = "I")
	public int anInt1252;

	@OriginalMember(owner = "client!bv", name = "Ve", descriptor = "I")
	private int anInt1254;

	@OriginalMember(owner = "client!bv", name = "hf", descriptor = "I")
	public int anInt1259;

	@OriginalMember(owner = "client!bv", name = "Qe", descriptor = "[F")
	public final float[] aFloatArray8;

	@OriginalMember(owner = "client!bv", name = "qf", descriptor = "I")
	public int anInt1263;

	@OriginalMember(owner = "client!bv", name = "ff", descriptor = "I")
	private int anInt1258;

	@OriginalMember(owner = "client!bv", name = "yf", descriptor = "I")
	private int anInt1266;

	@OriginalMember(owner = "client!bv", name = "Re", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!bv", name = "Tf", descriptor = "I")
	private int anInt1273;

	@OriginalMember(owner = "client!bv", name = "Xf", descriptor = "I")
	private int anInt1275;

	@OriginalMember(owner = "client!bv", name = "Sf", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!bv", name = "uf", descriptor = "F")
	private float aFloat26;

	@OriginalMember(owner = "client!bv", name = "jf", descriptor = "[F")
	private final float[] aFloatArray9;

	@OriginalMember(owner = "client!bv", name = "lg", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!bv", name = "Pf", descriptor = "I")
	public int anInt1271;

	@OriginalMember(owner = "client!bv", name = "gg", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!bv", name = "qg", descriptor = "[F")
	private final float[] aFloatArray10;

	@OriginalMember(owner = "client!bv", name = "Uf", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!bv", name = "ig", descriptor = "I")
	public int anInt1278;

	@OriginalMember(owner = "client!bv", name = "Nf", descriptor = "I")
	private int anInt1270;

	@OriginalMember(owner = "client!bv", name = "yg", descriptor = "I")
	public int anInt1284;

	@OriginalMember(owner = "client!bv", name = "sf", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!bv", name = "If", descriptor = "Z")
	private boolean aBoolean66;

	@OriginalMember(owner = "client!bv", name = "Mg", descriptor = "[F")
	private final float[] aFloatArray11;

	@OriginalMember(owner = "client!bv", name = "Gf", descriptor = "[Lclient!dd;")
	private final Class4_Sub8[] aClass4_Sub8Array1;

	@OriginalMember(owner = "client!bv", name = "ng", descriptor = "I")
	private int anInt1280;

	@OriginalMember(owner = "client!bv", name = "Dg", descriptor = "I")
	public int anInt1285;

	@OriginalMember(owner = "client!bv", name = "og", descriptor = "I")
	public int anInt1281;

	@OriginalMember(owner = "client!bv", name = "bg", descriptor = "F")
	private float aFloat32;

	@OriginalMember(owner = "client!bv", name = "We", descriptor = "I")
	private int anInt1255;

	@OriginalMember(owner = "client!bv", name = "wg", descriptor = "I")
	public int anInt1283;

	@OriginalMember(owner = "client!bv", name = "Yf", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!bv", name = "xg", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!bv", name = "Tg", descriptor = "I")
	public int anInt1288;

	@OriginalMember(owner = "client!bv", name = "Sg", descriptor = "[F")
	private final float[] aFloatArray12;

	@OriginalMember(owner = "client!bv", name = "ag", descriptor = "I")
	public int anInt1276;

	@OriginalMember(owner = "client!bv", name = "mg", descriptor = "I")
	private int anInt1279;

	@OriginalMember(owner = "client!bv", name = "xf", descriptor = "I")
	private int anInt1265;

	@OriginalMember(owner = "client!bv", name = "Wg", descriptor = "F")
	private float aFloat42;

	@OriginalMember(owner = "client!bv", name = "Yd", descriptor = "I")
	public final int anInt1234;

	@OriginalMember(owner = "client!bv", name = "Dd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas2;

	@OriginalMember(owner = "client!bv", name = "D", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!bv", name = "nb", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!bv", name = "wd", descriptor = "J")
	private final long aLong23;

	@OriginalMember(owner = "client!bv", name = "kb", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!bv", name = "bf", descriptor = "I")
	public final int bf;

	@OriginalMember(owner = "client!bv", name = "sg", descriptor = "Z")
	private boolean aBoolean73;

	@OriginalMember(owner = "client!bv", name = "Yg", descriptor = "Z")
	public boolean aBoolean82;

	@OriginalMember(owner = "client!bv", name = "Bf", descriptor = "Z")
	public boolean aBoolean64;

	@OriginalMember(owner = "client!bv", name = "Kf", descriptor = "Z")
	public boolean aBoolean68;

	@OriginalMember(owner = "client!bv", name = "rf", descriptor = "Z")
	private boolean aBoolean63;

	@OriginalMember(owner = "client!bv", name = "Of", descriptor = "Z")
	public boolean aBoolean69;

	@OriginalMember(owner = "client!bv", name = "vg", descriptor = "Z")
	private final boolean aBoolean74;

	@OriginalMember(owner = "client!bv", name = "de", descriptor = "Lclient!ej;")
	public final Class63 aClass63_1;

	@OriginalMember(owner = "client!bv", name = "ne", descriptor = "Lclient!ng;")
	public final Class160 aClass160_1;

	@OriginalMember(owner = "client!bv", name = "fe", descriptor = "Lclient!cg;")
	private final Class34 aClass34_1;

	@OriginalMember(owner = "client!bv", name = "be", descriptor = "Lclient!ff;")
	private Class4_Sub12_Sub1 aClass4_Sub12_Sub1_1;

	@OriginalMember(owner = "client!bv", name = "Xd", descriptor = "Lclient!pc;")
	private final Class184 aClass184_1;

	static {
		new Class242("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
		new Class242("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;ILclient!hu;)V")
	public Class30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class114 arg4) {
		super(arg0, arg2);
		new Class140();
		new Class196(16);
		this.aClass258_7 = new Class258();
		this.aClass258_8 = new Class258();
		this.aClass258_9 = new Class258();
		this.aClass258_10 = new Class258();
		this.aClass258_11 = new Class258();
		this.aClass258_12 = new Class258();
		this.aClass258_13 = new Class258();
		this.anInt1252 = 50;
		this.anInt1254 = 0;
		this.anInt1259 = 0;
		this.aFloatArray8 = new float[4];
		this.anInt1263 = -1;
		this.anInt1258 = -1;
		this.anInt1266 = 0;
		this.aFloat23 = 1.0F;
		this.anInt1273 = 0;
		this.anInt1275 = 0;
		this.aFloat29 = 3000.0F;
		this.aFloat26 = 1.0F;
		this.aFloatArray9 = new float[16];
		this.aFloat36 = 1.0F;
		this.anInt1271 = 3584;
		this.aFloat35 = -1.0F;
		this.aFloatArray10 = new float[4];
		this.aFloat30 = 3584.0F;
		this.anInt1278 = -1;
		this.anInt1270 = 8448;
		this.anInt1284 = -1;
		this.aFloat25 = 3584.0F;
		this.aBoolean66 = true;
		this.aFloatArray11 = new float[4];
		this.aClass4_Sub8Array1 = new Class4_Sub8[Static72.anInt1746];
		this.anInt1280 = -1;
		this.anInt1285 = 512;
		this.anInt1281 = 512;
		this.aFloat32 = 1.0F;
		this.anInt1255 = 0;
		this.anInt1283 = 0;
		this.aFloat31 = -1.0F;
		this.aFloat38 = 1.0F;
		this.anInt1288 = 0;
		this.aFloatArray12 = new float[4];
		this.anInt1276 = 0;
		this.anInt1279 = 0;
		this.anInt1265 = 8448;
		this.aFloat42 = 0.0F;
		this.anInt1234 = arg3;
		this.aCanvas1 = this.aCanvas2 = arg1;
		try {
			if (Static113.aBoolean186 == null || !Static113.aBoolean186) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static113.aBoolean186 = Boolean.TRUE;
				} else {
					@Pc(246) String local246 = System.getProperty("os.name").toLowerCase();
					if (!local246.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local246.startsWith("linux") || local246.startsWith("sunos")) {
						System.load(arg4.method2341("libjaggl.so").toString());
					} else if (local246.startsWith("mac")) {
						System.load(arg4.method2341("libjaggl.jnilib").toString());
					} else if (local246.startsWith("win")) {
						System.load(arg4.method2341("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static113.aBoolean186 = Boolean.TRUE;
				}
			}
			if (Static113.aBoolean186 == null || !Static113.aBoolean186) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong22 = this.aLong23 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt1234);
			if (this.aLong23 == 0L) {
				throw new RuntimeException("");
			}
			this.method944();
			@Pc(355) int local355 = this.method971();
			if (local355 != 0) {
				throw new RuntimeException("");
			}
			this.bf = this.aBoolean76 ? 33639 : 5121;
			@Pc(378) int local378;
			if (this.aString14.indexOf("radeon") != -1) {
				local378 = 0;
				@Pc(380) boolean local380 = false;
				@Pc(382) boolean local382 = false;
				@Pc(391) String[] local391 = Static220.method4275(' ', this.aString14.replace('/', ' '));
				for (@Pc(393) int local393 = 0; local393 < local391.length; local393++) {
					@Pc(399) String local399 = local391[local393];
					try {
						if (local399.length() > 0) {
							if (local399.charAt(0) == 'x' && local399.length() >= 3 && Static30.method548(local399.substring(1, 3))) {
								local382 = true;
								local399 = local399.substring(1);
							}
							if (local399.equals("hd")) {
								local380 = true;
							} else {
								if (local399.startsWith("hd")) {
									local380 = true;
									local399 = local399.substring(2);
								}
								if (local399.length() >= 4 && Static30.method548(local399.substring(0, 4))) {
									local378 = Static297.method4115(local399.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(469) Exception local469) {
					}
				}
				if (!local382 && !local380) {
					if (local378 >= 7000 && local378 <= 7999) {
						this.aBoolean73 = false;
					}
					if (local378 >= 7000 && local378 <= 9250) {
						this.aBoolean82 = false;
					}
				}
				if (!local380 || local378 < 4000) {
					this.aBoolean64 = false;
				}
				this.aBoolean68 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean63 = this.aBoolean73;
			}
			if (this.aString13.indexOf("intel") != -1) {
				this.aBoolean69 = false;
			}
			this.aBoolean74 = !this.aString13.equals("s3 graphics");
			if (this.aBoolean73) {
				try {
					@Pc(555) int[] local555 = new int[1];
					OpenGL.glGenBuffersARB(1, local555, 0);
				} catch (@Pc(561) Throwable local561) {
					throw new RuntimeException("");
				}
			}
			Static13.method323(true, false);
			this.aBoolean56 = true;
			this.aClass63_1 = new Class63(this, super.anInterface10_7);
			this.method935();
			this.aClass160_1 = new Class160(this);
			this.aClass34_1 = new Class34(this);
			if (this.aClass34_1.method1036()) {
				this.aClass4_Sub12_Sub1_1 = new Class4_Sub12_Sub1(this);
				if (!this.aClass4_Sub12_Sub1_1.method1742()) {
					this.aClass4_Sub12_Sub1_1.method1738();
					this.aClass4_Sub12_Sub1_1 = null;
				}
			}
			this.aClass184_1 = new Class184(this);
			this.method936();
			this.method976();
			OpenGL.glClear(16640);
			local378 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(640) Exception local640) {
					if (local378++ > 5) {
						throw new RuntimeException("");
					}
					Static20.method1515(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(658) Throwable local658) {
			local658.printStackTrace();
			this.method4703();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4683(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static139.aFloat80 = arg2;
		Static407.aFloat201 = arg0;
		Static267.aFloat135 = arg1;
	}

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "(I)V")
	private void method895() {
		if (this.aBoolean81 && this.aBoolean58 | this.anInt1278 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!bv", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean58) {
			throw new RuntimeException("");
		}
		this.anInt1284 = arg2;
		this.anInt1258 = arg1;
		this.anInt1268 = arg0;
		this.anInt1283 = arg3;
		this.aClass184_1.aClass2_Sub4_1.method1501();
		this.method969();
	}

	@OriginalMember(owner = "client!bv", name = "da", descriptor = "(IIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method939();
		this.method931(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IB)V")
	public synchronized void method897(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub15 local8 = new Class4_Sub15(arg0);
		this.aClass258_10.method5526(local8);
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(Z)V")
	@Override
	public void method4671(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BI)I")
	public int method898(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "()I")
	@Override
	public int method4657() {
		return 4;
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "()V")
	@Override
	public void method4635() {
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(III)V")
	public synchronized void method899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub15 local8 = new Class4_Sub15(arg1);
		local8.aLong225 = arg0;
		this.aClass258_9.method5526(local8);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!cc;I)V")
	public void method900(@OriginalArg(0) Interface1 arg0) {
		if (this.anInt1247 < 0 || arg0 != this.anInterface1Array3[this.anInt1247]) {
			throw new RuntimeException();
		}
		this.anInterface1Array3[this.anInt1247--] = null;
		arg0.method3079();
		if (this.anInt1247 >= 0) {
			this.anInterface1_2 = this.anInterface1Array3[this.anInt1247];
			this.anInterface1_2.method3080();
		} else {
			this.anInterface1_2 = null;
		}
	}

	@OriginalMember(owner = "client!bv", name = "r", descriptor = "()Z")
	@Override
	public boolean method4680() {
		return this.aClass4_Sub12_Sub1_1 != null && (this.anInt1234 <= 1 || this.aBoolean71);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLclient!cc;)V")
	public void method901(@OriginalArg(1) Interface1 arg0) {
		if (this.anInt1247 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt1247 >= 0) {
			this.anInterface1Array3[this.anInt1247].method3079();
		}
		this.anInterface1_2 = this.anInterface1Array3[++this.anInt1247] = arg0;
		this.anInterface1_2.method3080();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIZLclient!jaggl/memory/NativeBuffer;Z)Lclient!gf;")
	public Interface6 method902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) NativeBuffer arg2) {
		return (Interface6) (this.aBoolean73 ? new Class104_Sub1(this, arg0, arg2, arg1, false) : new Class45_Sub1(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "(I)V")
	private void method904() {
		OpenGL.glDepthMask(this.aBoolean83 && this.aBoolean66);
	}

	@OriginalMember(owner = "client!bv", name = "w", descriptor = "()F")
	@Override
	public float w() {
		return this.aFloat34;
	}

	@OriginalMember(owner = "client!bv", name = "FA", descriptor = "()I")
	@Override
	public int FA() {
		return this.anInt1250 + this.anInt1248 + this.anInt1249;
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(III)V")
	public void method905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1287 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(21) boolean local21 = false;
		if (this.anInt1265 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local21 = true;
			this.anInt1265 = arg1;
		}
		if (arg0 != this.anInt1270) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local21 = true;
			this.anInt1270 = arg0;
		}
		if (local21) {
			this.anInt1257 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(BLclient!cc;)V")
	public void method906(@OriginalArg(1) Interface1 arg0) {
		if (this.anInt1245 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt1245 >= 0) {
			this.anInterface1Array1[this.anInt1245].method3078();
		}
		this.anInterface1_1 = this.anInterface1Array1[++this.anInt1245] = arg0;
		this.anInterface1_1.method3082();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!rc;I)V")
	public void method907(@OriginalArg(0) Class116_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method4594(), 0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!cc;Z)V")
	public void method908(@OriginalArg(0) Interface1 arg0) {
		if (this.aBoolean59) {
			this.method951(arg0);
			this.method900(arg0);
		} else if (this.anInt1246 >= 0 && arg0 == this.anInterface1Array2[this.anInt1246]) {
			this.anInterface1Array2[this.anInt1246--] = null;
			arg0.method3081();
			if (this.anInt1246 < 0) {
				this.anInterface1_1 = this.anInterface1_2 = null;
			} else {
				this.anInterface1_1 = this.anInterface1_2 = this.anInterface1Array2[this.anInt1246];
				this.anInterface1_1.method3083();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "()Z")
	@Override
	public boolean method4652() {
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(II)I")
	public int method909(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!vo;)V")
	@Override
	public void method4653(@OriginalArg(0) Class256 arg0) {
		this.aClass176_1.method4032(arg0, this);
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(Z)V")
	public void method910() {
		if (this.anInt1257 == 4) {
			return;
		}
		this.method927();
		this.method960(false);
		this.method952(false);
		this.method930(false);
		this.method956(false);
		this.method940(-2);
		this.method931(1);
		this.method923(0);
		this.anInt1257 = 4;
	}

	@OriginalMember(owner = "client!bv", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method939();
		this.method931(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(B)V")
	public void method911() {
		if (this.anInt1257 == 8) {
			return;
		}
		this.method967();
		this.method960(true);
		this.method930(true);
		this.method956(true);
		this.method931(1);
		this.method923(0);
		this.anInt1257 = 8;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(FIFF)V")
	private void method912(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean75) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean75 = true;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4707(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4704();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class146 method4669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class146_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!mn;I)V")
	@Override
	public void method4701(@OriginalArg(0) Class7[] arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(2) Class41_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method4091(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIF)Lclient!dd;")
	@Override
	public Class4_Sub8 method4654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub8_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!c;Lclient!vo;Lclient!ia;Lclient!mn;I)V")
	@Override
	public void method4676(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class116 arg2, @OriginalArg(3) Class41_Sub4 arg3) {
		arg0.method4091(arg2, arg3, 0);
		this.method4653(arg1);
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4649(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas2) {
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

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "(I)V")
	private void method913() {
		this.aFloat33 = this.anInt1275 - this.anInt1288;
		this.aFloat41 = this.anInt1279 - this.anInt1288;
		this.aFloat28 = this.anInt1255 - this.anInt1259;
		this.aFloat40 = this.anInt1254 - this.anInt1259;
	}

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "(I)V")
	@Override
	public void method4673(@OriginalArg(0) int arg0) {
		this.method944();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZII)V")
	public void method914(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method915(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "()Z")
	@Override
	public boolean method4666() {
		return this.aClass4_Sub12_Sub1_1 != null && this.aClass4_Sub12_Sub1_1.method1739();
	}

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "()Z")
	@Override
	public boolean method4660() {
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZIZI)V")
	public void method915(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anInt1277 != arg1) {
			if (arg1 < 0) {
				this.method970();
				this.method916(null);
				this.method923(0);
				if (!this.aBoolean58) {
					this.aClass184_1.method4114(0, arg0, arg2);
				}
			} else {
				@Pc(45) Class1_Sub3 local45 = this.aClass63_1.method1552(arg1);
				@Pc(51) Class118 local51 = super.anInterface10_7.method4241(arg1);
				if (local51.aByte55 == 0 && local51.aByte51 == 0) {
					this.method970();
				} else {
					@Pc(72) int local72 = local51.aBoolean231 ? 64 : 128;
					@Pc(76) int local76 = local72 * 50;
					this.method912((float) (local51.aByte51 * (this.anInt1244 % local76)) / (float) local76, 0.0F, (float) (local51.aByte55 * (this.anInt1244 % local76)) / (float) local76);
				}
				if (this.aBoolean58) {
					this.aClass184_1.method4114(3, arg0, arg2);
					this.method916(local45);
					this.method923(local51.anInt3169);
				} else {
					this.aClass184_1.method4114(local51.aByte56, arg0, arg2);
					this.aClass184_1.method4117(local51.anInt3167, local51.aByte52);
					if (!this.aClass184_1.method4118(local45, local51.anInt3169)) {
						this.method916(local45);
						this.method923(local51.anInt3169);
					}
				}
			}
			this.anInt1277 = arg1;
		}
		this.anInt1257 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!bv", name = "u", descriptor = "()Z")
	@Override
	public boolean method4686() {
		return false;
	}

	@OriginalMember(owner = "client!bv", name = "B", descriptor = "()V")
	@Override
	protected void method4703() {
		for (@Pc(10) Class4 local10 = this.aClass258_6.method5538(); local10 != null; local10 = this.aClass258_6.method5528()) {
			((Class4_Sub27_Sub1) local10).method3710();
		}
		if (this.aClass34_1 != null) {
			this.aClass34_1.method1028();
		}
		if (this.anOpenGL1 != null) {
			this.method922();
			@Pc(40) Enumeration local40 = this.aHashtable1.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable1.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean56) {
			Static85.method1457(true, false);
			this.aBoolean56 = false;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!kv;B)V")
	public void method916(@OriginalArg(0) Class1 arg0) {
		@Pc(24) Class1 local24 = this.aClass1Array1[this.anInt1287];
		if (local24 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local24.anInt5564);
			} else {
				if (local24 == null) {
					OpenGL.glEnable(arg0.anInt5564);
				} else if (local24.anInt5564 != arg0.anInt5564) {
					OpenGL.glDisable(local24.anInt5564);
					OpenGL.glEnable(arg0.anInt5564);
				}
				OpenGL.glBindTexture(arg0.anInt5564, arg0.method4265());
			}
			this.aClass1Array1[this.anInt1287] = arg0;
		}
		this.anInt1257 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "(I)V")
	private void method917() {
		if (this.anInt1253 != 3) {
			this.anInt1253 = 3;
			this.method973();
			this.method932();
			this.anInt1257 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "(I)V")
	public void method918() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray8, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray10, 0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!it;BLclient!it;Lclient!it;Lclient!it;)V")
	public void method919(@OriginalArg(0) Class124 arg0, @OriginalArg(2) Class124 arg1, @OriginalArg(3) Class124 arg2, @OriginalArg(4) Class124 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method978(arg1.anInterface6_4);
			OpenGL.glVertexPointer(arg1.aByte58, arg1.aShort59, this.anInterface6_2.method2115(), this.anInterface6_2.method2116() + (long) arg1.aByte59);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method978(arg2.anInterface6_4);
			OpenGL.glNormalPointer(arg2.aShort59, this.anInterface6_2.method2115(), this.anInterface6_2.method2116() + (long) arg2.aByte59);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method978(arg3.anInterface6_4);
			OpenGL.glColorPointer(arg3.aByte58, arg3.aShort59, this.anInterface6_2.method2115(), this.anInterface6_2.method2116() + (long) arg3.aByte59);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method978(arg0.anInterface6_4);
			OpenGL.glTexCoordPointer(arg0.aByte58, arg0.aShort59, this.anInterface6_2.method2115(), this.anInterface6_2.method2116() + (long) arg0.aByte59);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!bv", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1288 = arg0;
		this.anInt1285 = arg2;
		this.anInt1281 = arg3;
		this.anInt1259 = arg1;
		this.method961();
		this.method913();
		if (this.anInt1253 == 3) {
			this.method973();
		} else if (this.anInt1253 == 2) {
			this.method959();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class57 method4705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static84.method1449(arg1, arg0, arg2, arg3, this);
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method4689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method939();
		this.method931(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "(I)V")
	private void method920() {
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.anInt1261; local13++) {
			@Pc(20) Class4_Sub8 local20 = this.aClass4_Sub8Array1[local13];
			@Pc(25) int local25 = local13 + 16386;
			Static361.aFloatArray21[0] = local20.method5676();
			Static361.aFloatArray21[1] = local20.method5674();
			Static361.aFloatArray21[2] = local20.method5682();
			Static361.aFloatArray21[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static361.aFloatArray21, 0);
			@Pc(61) int local61 = local20.method5683();
			@Pc(67) float local67 = local20.method5675() / 255.0F;
			Static361.aFloatArray21[0] = local67 * (float) (local61 >> 16 & 0xFF);
			Static361.aFloatArray21[1] = local67 * (float) (local61 >> 8 & 0xFF);
			Static361.aFloatArray21[2] = (float) (local61 & 0xFF) * local67;
			OpenGL.glLightfv(local25, 4609, Static361.aFloatArray21, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local20.method5679() * local20.method5679()));
			OpenGL.glEnable(local25);
		}
		while (this.anInt1264 > local13) {
			OpenGL.glDisable(local13 + 16386);
			local13++;
		}
		this.anInt1264 = this.anInt1261;
	}

	@OriginalMember(owner = "client!bv", name = "aa", descriptor = "(IIIIII[BII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(37) float local37;
		@Pc(41) float local41;
		if (this.aClass1_Sub3_Sub1_1 == null || this.aClass1_Sub3_Sub1_1.anInt5174 < arg2 || this.aClass1_Sub3_Sub1_1.anInt5173 < arg3) {
			this.aClass1_Sub3_Sub1_1 = Static205.method2945(arg2, arg6, arg3, this);
			this.aClass1_Sub3_Sub1_1.method3964(false, false);
			local37 = this.aClass1_Sub3_Sub1_1.aFloat143;
			local41 = this.aClass1_Sub3_Sub1_1.aFloat144;
		} else {
			this.aClass1_Sub3_Sub1_1.method3969(arg6, 6406, arg2, false, arg3);
			local41 = (float) arg2 * this.aClass1_Sub3_Sub1_1.aFloat144 / (float) this.aClass1_Sub3_Sub1_1.anInt5174;
			local37 = (float) arg3 * this.aClass1_Sub3_Sub1_1.aFloat143 / (float) this.aClass1_Sub3_Sub1_1.anInt5173;
		}
		this.method962();
		this.method916(this.aClass1_Sub3_Sub1_1);
		this.method931(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method921(arg5);
		this.method905(34165, 34165);
		this.method957(34166, 768, 0);
		this.method957(5890, 770, 2);
		this.method954(0, 34166);
		this.method954(2, 5890);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = (float) arg2 + local143;
		OpenGL.glBegin(7);
		@Pc(158) float local158 = (float) arg3 + local146;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local143, local158);
		OpenGL.glTexCoord2f(local37, local41);
		OpenGL.glVertex2f(local151, local158);
		OpenGL.glTexCoord2f(local37, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method957(5890, 768, 0);
		this.method957(34166, 770, 2);
		this.method954(0, 5890);
		this.method954(2, 34166);
	}

	@OriginalMember(owner = "client!bv", name = "SA", descriptor = "(IIIIII)Z")
	@Override
	public boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass116_Sub2_4.aFloat172 * (float) arg0 + this.aClass116_Sub2_4.aFloat174 * (float) arg1 + (float) arg2 * this.aClass116_Sub2_4.aFloat170 + this.aClass116_Sub2_4.aFloat175;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass116_Sub2_4.aFloat174 * (float) arg4 + this.aClass116_Sub2_4.aFloat172 * (float) arg3 + (float) arg5 * this.aClass116_Sub2_4.aFloat170 + this.aClass116_Sub2_4.aFloat175;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt1252 && (float) this.anInt1252 > local59 || !(!((float) this.anInt1271 < local28) || !((float) this.anInt1271 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt1285 * ((float) arg1 * this.aClass116_Sub2_4.aFloat171 + (float) arg0 * this.aClass116_Sub2_4.aFloat169 + this.aClass116_Sub2_4.aFloat165 * (float) arg2 + this.aClass116_Sub2_4.aFloat176) / local28);
		@Pc(155) int local155 = (int) ((this.aClass116_Sub2_4.aFloat176 + (float) arg3 * this.aClass116_Sub2_4.aFloat169 + (float) arg4 * this.aClass116_Sub2_4.aFloat171 + (float) arg5 * this.aClass116_Sub2_4.aFloat165) * (float) this.anInt1285 / local59);
		if ((float) local123 < this.aFloat33 && this.aFloat33 > (float) local155 || (float) local123 > this.aFloat41 && this.aFloat41 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass116_Sub2_4.aFloat168 + this.aClass116_Sub2_4.aFloat173 * (float) arg2 + this.aClass116_Sub2_4.aFloat167 * (float) arg0 + this.aClass116_Sub2_4.aFloat166 * (float) arg1) * (float) this.anInt1281 / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt1281 * (this.aClass116_Sub2_4.aFloat166 * (float) arg4 + this.aClass116_Sub2_4.aFloat167 * (float) arg3 + (float) arg5 * this.aClass116_Sub2_4.aFloat173 + this.aClass116_Sub2_4.aFloat168) / local59);
			return (!(this.aFloat28 > (float) local213) || !((float) local245 < this.aFloat28)) && (!(this.aFloat40 < (float) local213) || !((float) local245 > this.aFloat40));
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method4664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class57_Sub2 local6 = (Class57_Sub2) arg5;
		@Pc(9) Class1_Sub3_Sub1 local9 = local6.aClass1_Sub3_Sub1_5;
		this.method962();
		this.method916(local6.aClass1_Sub3_Sub1_5);
		this.method931(1);
		this.method905(8448, 7681);
		this.method957(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat144 / (float) local9.anInt5182;
		@Pc(46) float local46 = local9.aFloat143 / (float) local9.anInt5180;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method957(5890, 768, 0);
	}

	@OriginalMember(owner = "client!bv", name = "Z", descriptor = "(IIII)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1279 > arg2) {
			this.anInt1279 = arg2;
		}
		if (arg3 < this.anInt1254) {
			this.anInt1254 = arg3;
		}
		if (this.anInt1275 < arg0) {
			this.anInt1275 = arg0;
		}
		if (this.anInt1255 < arg1) {
			this.anInt1255 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method913();
		this.method953();
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(II)V")
	public void method921(@OriginalArg(0) int arg0) {
		Static213.aFloatArray19[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static213.aFloatArray19[3] = (float) (arg0 >>> 24) / 255.0F;
		Static213.aFloatArray19[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static213.aFloatArray19[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static213.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class116 method4632() {
		return new Class116_Sub2();
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(B)V")
	private void method922() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "(II)V")
	public void method923(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method905(7681, 7681);
		} else if (arg0 == 0) {
			this.method905(8448, 8448);
		} else if (arg0 == 2) {
			this.method905(7681, 34165);
		} else if (arg0 == 3) {
			this.method905(8448, 260);
		} else if (arg0 == 4) {
			this.method905(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!bv", name = "W", descriptor = "()I")
	@Override
	public int W() {
		return this.anInt1271;
	}

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "(I)V")
	private void method924() {
		Static213.aFloatArray19[3] = 1.0F;
		Static213.aFloatArray19[0] = this.aFloat37 * this.aFloat23;
		Static213.aFloatArray19[2] = this.aFloat37 * this.aFloat38;
		Static213.aFloatArray19[1] = this.aFloat37 * this.aFloat36;
		OpenGL.glLightModelfv(2899, Static213.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "(Lclient!ia;)V")
	@Override
	public void m(@OriginalArg(0) Class116 arg0) {
		this.aClass116_Sub2_4 = (Class116_Sub2) arg0;
		this.aClass116_Sub2_3.method4596(this.aClass116_Sub2_4);
		if (this.anInt1253 != 1) {
			this.method932();
		}
	}

	@OriginalMember(owner = "client!bv", name = "XA", descriptor = "(IFFFFF)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt1280;
		if (local11 || this.aFloat31 != arg1 || this.aFloat35 != arg2) {
			this.aFloat35 = arg2;
			this.anInt1280 = arg0;
			this.aFloat31 = arg1;
			if (local11) {
				this.aFloat38 = (float) (this.anInt1280 & 0xFF) / 255.0F;
				this.aFloat23 = (float) (this.anInt1280 & 0xFF0000) / 1.671168E7F;
				this.aFloat36 = (float) (this.anInt1280 & 0xFF00) / 65280.0F;
				this.method924();
			}
			this.method968();
		}
		if (arg3 == this.aFloatArray12[0] && this.aFloatArray12[1] == arg4 && this.aFloatArray12[2] == arg5) {
			return;
		}
		this.aFloatArray12[2] = arg5;
		this.aFloatArray12[0] = arg3;
		this.aFloatArray12[1] = arg4;
		this.aFloatArray11[1] = -arg4;
		this.aFloatArray11[2] = -arg5;
		this.aFloatArray11[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray8[1] = arg4 * local138;
		this.aFloatArray8[0] = local138 * arg3;
		this.aFloatArray8[2] = local138 * arg5;
		this.aFloatArray10[1] = -this.aFloatArray8[1];
		this.aFloatArray10[2] = -this.aFloatArray8[2];
		this.aFloatArray10[0] = -this.aFloatArray8[0];
		this.method918();
		this.anInt1282 = (int) (arg3 * 256.0F / arg4);
		this.anInt1260 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!bv", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		this.method931(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(IIIIII)Lclient!mc;")
	@Override
	public Class59 method4670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean78 ? new Class59_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "(I)V")
	public void method925() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "()Lclient!ia;")
	@Override
	public Class116 method4678() {
		return this.aClass116_Sub2_1;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)I")
	@Override
	public int method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZII)V")
	public void method926(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!bv", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1284 = arg2;
		this.anInt1283 = arg3;
		this.aBoolean58 = true;
		this.anInt1268 = arg0;
		this.anInt1258 = arg1;
		this.aClass184_1.method4114(3, false, false);
		this.aClass184_1.aClass2_Sub4_1.method1501();
		this.method969();
		this.method895();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class3 method4672(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class3_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!bv", name = "r", descriptor = "(I)V")
	private void method927() {
		if (this.anInt1253 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt1161 > 0 && this.anInt1138 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt1161, (double) this.anInt1138, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt1253 = 1;
		this.anInt1257 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!bv", name = "C", descriptor = "()V")
	@Override
	public void method4704() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "(I)V")
	private void method928() {
		if (this.aFloat34 == 0.0F) {
			this.aFloatArray9[14] = this.aFloat43;
			this.aFloatArray9[10] = this.aFloat27;
		} else {
			@Pc(31) float local31 = this.aFloat29 / (this.aFloat34 + this.aFloat29);
			@Pc(35) float local35 = local31 * local31;
			@Pc(51) float local51 = (1.0F - local31) * (1.0F - local31) * -this.aFloat43 / this.aFloat34;
			this.aFloatArray9[10] = local51 + this.aFloat27;
			this.aFloatArray9[14] = this.aFloat43 * local35;
		}
		this.aFloat25 = (this.aFloatArray9[14] - (float) this.anInt1271) / this.aFloatArray9[10];
		this.aFloat30 = (float) this.anInt1271 - this.aFloat34;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZ)I")
	public int method929(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!bv", name = "y", descriptor = "()Z")
	@Override
	public boolean method4698() {
		if (this.aClass4_Sub12_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass4_Sub12_Sub1_1.method1739()) {
			if (!this.aClass34_1.method1027(this.aClass4_Sub12_Sub1_1)) {
				return false;
			}
			this.aClass63_1.method1547();
		}
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4650(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas2 == arg0) {
			local5 = this.aLong23;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable1.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas1 == arg0) {
			this.method976();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BZ)V")
	public void method930(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean79 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean79 = arg0;
		this.anInt1257 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I[Lclient!dd;)V")
	@Override
	public void method4706(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub8[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass4_Sub8Array1[local3] = arg1[local3];
		}
		this.anInt1261 = arg0;
		if (this.anInt1253 != 1) {
			this.method920();
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(IB)V")
	public void method931(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt1274) {
			return;
		}
		@Pc(25) boolean local25;
		@Pc(27) byte local27;
		if (arg0 == 1) {
			local27 = 1;
			local25 = true;
		} else if (arg0 == 2) {
			local25 = false;
			local27 = 2;
		} else if (arg0 == 128) {
			local25 = true;
			local27 = 3;
		} else {
			local25 = false;
			local27 = 0;
		}
		if (!this.aBoolean67) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean67 = true;
		}
		if (local25 != this.aBoolean61) {
			if (local25) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean61 = local25;
		}
		if (local27 != this.anInt1251) {
			if (local27 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local27 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local27 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt1251 = local27;
		}
		this.anInt1274 = arg0;
		this.anInt1257 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt1252;
	}

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "(I)V")
	private void method932() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass116_Sub2_4.method4594(), 0);
		if (this.aBoolean58) {
			this.aClass184_1.aClass2_Sub4_1.method1501();
		}
		this.method918();
		this.method920();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(FIF)V")
	public void method933(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat42 = arg1;
		this.aFloat26 = arg0;
		if (!this.aBoolean58) {
			this.method969();
		}
	}

	@OriginalMember(owner = "client!bv", name = "u", descriptor = "(I)Lclient!lr;")
	public Class1_Sub2 method934() {
		return this.aClass59_Sub1_1 == null ? null : this.aClass59_Sub1_1.method4050();
	}

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "(B)V")
	private void method935() {
		this.aClass116_Sub2_4 = new Class116_Sub2();
		this.aClass116_Sub2_3 = new Class116_Sub2();
		this.aClass1Array1 = new Class1[this.anInt1272];
		this.aClass1_Sub3_1 = new Class1_Sub3(this, 3553, 6408, 1, 1);
		this.aClass1_Sub3_2 = new Class1_Sub3(this, 3553, 6408, 1, 1);
		this.aClass1_Sub3_3 = new Class1_Sub3(this, 3553, 6408, 1, 1);
		this.aClass7_Sub1_3 = new Class7_Sub1(this);
		this.aClass7_Sub1_2 = new Class7_Sub1(this);
		this.aClass7_Sub1_10 = new Class7_Sub1(this);
		this.aClass7_Sub1_1 = new Class7_Sub1(this);
		this.aClass7_Sub1_6 = new Class7_Sub1(this);
		this.aClass7_Sub1_4 = new Class7_Sub1(this);
		this.aClass7_Sub1_5 = new Class7_Sub1(this);
		this.aClass7_Sub1_8 = new Class7_Sub1(this);
		this.aClass7_Sub1_7 = new Class7_Sub1(this);
		this.aClass7_Sub1_9 = new Class7_Sub1(this);
		if (this.aBoolean69) {
			this.aClass142_2 = new Class142(this);
			this.aClass142_1 = new Class142(this);
		}
	}

	@OriginalMember(owner = "client!bv", name = "v", descriptor = "(I)V")
	private void method936() {
		this.method940(-2);
		for (@Pc(14) int local14 = this.anInt1272 - 1; local14 >= 0; local14--) {
			this.method948(local14);
			this.method916(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method905(8448, 8448);
		this.method957(34168, 770, 2);
		this.method970();
		this.anInt1274 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt1251 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean61 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean67 = true;
		this.method960(true);
		this.method952(true);
		this.method930(true);
		this.method956(true);
		this.method942();
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
		for (@Pc(131) int local131 = 0; local131 < 8; local131++) {
			@Pc(137) int local137 = local131 + 16384;
			OpenGL.glLightfv(local137, 4608, local125, 0);
			OpenGL.glLightf(local137, 4615, 0.0F);
			OpenGL.glLightf(local137, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt1280 = this.anInt1263 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!bv", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		this.anInt1242 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt1242++;
		}
		this.anInt1243 = 0x1 << this.anInt1242;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BII)V")
	public synchronized void method937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub15 local8 = new Class4_Sub15(arg1);
		local8.aLong225 = arg0;
		this.aClass258_11.method5526(local8);
	}

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "(B)V")
	public void method938() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!bv", name = "w", descriptor = "(I)V")
	private void method939() {
		if (this.anInt1257 == 1) {
			return;
		}
		this.method927();
		this.method960(false);
		this.method952(false);
		this.method930(false);
		this.method956(false);
		this.method916(null);
		this.method940(-2);
		this.method923(1);
		this.anInt1257 = 1;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!se;[Lclient!rl;Z)Lclient!oa;")
	@Override
	public Class105 method4690(@OriginalArg(0) Class215 arg0, @OriginalArg(1) Class205[] arg1) {
		return new Class105_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(IB)V")
	public void method940(@OriginalArg(0) int arg0) {
		this.method914(true, arg0);
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)Lclient!l;")
	@Override
	public Class4_Sub27 method4647() {
		@Pc(8) Class4_Sub27_Sub1 local8 = new Class4_Sub27_Sub1(78643200);
		this.aClass258_6.method5526(local8);
		return local8;
	}

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method4697(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class4_Sub15 local19;
		while (!this.aClass258_8.method5533()) {
			local19 = (Class4_Sub15) this.aClass258_8.method5530();
			Static86.anIntArray552[local7++] = (int) local19.aLong225;
			this.anInt1250 -= local19.anInt2603;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static86.anIntArray552, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static86.anIntArray552, 0);
			local7 = 0;
		}
		while (!this.aClass258_9.method5533()) {
			local19 = (Class4_Sub15) this.aClass258_9.method5530();
			Static86.anIntArray552[local7++] = (int) local19.aLong225;
			this.anInt1248 -= local19.anInt2603;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static86.anIntArray552, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static86.anIntArray552, 0);
			local7 = 0;
		}
		while (!this.aClass258_10.method5533()) {
			local19 = (Class4_Sub15) this.aClass258_10.method5530();
			Static86.anIntArray552[local7++] = local19.anInt2603;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static86.anIntArray552, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static86.anIntArray552, 0);
			local7 = 0;
		}
		while (!this.aClass258_11.method5533()) {
			local19 = (Class4_Sub15) this.aClass258_11.method5530();
			Static86.anIntArray552[local7++] = (int) local19.aLong225;
			this.anInt1249 -= local19.anInt2603;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static86.anIntArray552, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static86.anIntArray552, 0);
		}
		while (!this.aClass258_7.method5533()) {
			local19 = (Class4_Sub15) this.aClass258_7.method5530();
			OpenGL.glDeleteLists((int) local19.aLong225, local19.anInt2603);
		}
		@Pc(214) Class4 local214;
		while (!this.aClass258_12.method5533()) {
			local214 = this.aClass258_12.method5530();
			OpenGL.glDeleteProgramARB((int) local214.aLong225);
		}
		while (!this.aClass258_13.method5533()) {
			local214 = this.aClass258_13.method5530();
			OpenGL.glDeleteObjectARB(local214.aLong225);
		}
		while (!this.aClass258_7.method5533()) {
			local19 = (Class4_Sub15) this.aClass258_7.method5530();
			OpenGL.glDeleteLists((int) local19.aLong225, local19.anInt2603);
		}
		this.aClass63_1.method1549();
		if (this.FA() > 100663296 && this.aLong24 + 60000L < Static199.method2845()) {
			System.gc();
			this.aLong24 = Static199.method2845();
		}
		this.anInt1244 = local11;
	}

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "(ILclient!ea;II)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class57_Sub2 local6 = (Class57_Sub2) arg1;
		@Pc(9) Class1_Sub3_Sub1 local9 = local6.aClass1_Sub3_Sub1_5;
		this.method962();
		this.method916(local6.aClass1_Sub3_Sub1_5);
		this.method931(1);
		this.method905(8448, 7681);
		this.method957(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat144 / (float) local9.anInt5182;
		@Pc(46) float local46 = local9.aFloat143 / (float) local9.anInt5180;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt1275 - arg2), local46 * (float) (this.anInt1255 - arg3));
		OpenGL.glVertex2i(this.anInt1275, this.anInt1255);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt1275 - arg2), (float) (this.anInt1254 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt1275, this.anInt1254);
		OpenGL.glTexCoord2f((float) (this.anInt1279 - arg2) * local39, (float) (this.anInt1254 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt1279, this.anInt1254);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt1279 - arg2), local46 * (float) (this.anInt1255 - arg3));
		OpenGL.glVertex2i(this.anInt1279, this.anInt1255);
		OpenGL.glEnd();
		this.method957(5890, 768, 0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I[BIIZ)Lclient!gf;")
	public Interface6 method941(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		return (Interface6) (this.aBoolean73 && (!arg3 || this.aBoolean63) ? new Class104_Sub1(this, arg0, arg1, arg2, arg3) : new Class45_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ro;IIII)Lclient!c;")
	@Override
	public Class7 method4655(@OriginalArg(0) Class208 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class7_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method4689(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "(B)V")
	public void method942() {
		if (this.anInt1253 != 0) {
			this.anInt1257 &= 0xFFFFFFE0;
			this.anInt1253 = 0;
		}
	}

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "(I)V")
	private void method943() {
		OpenGL.glViewport(this.anInt1266, this.anInt1273, this.anInt1161, this.anInt1138);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class3 method4633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class3_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "(I)V")
	@Override
	public void method4675(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bv", name = "y", descriptor = "(I)V")
	private void method944() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static20.method1515(1000L);
		}
	}

	@OriginalMember(owner = "client!bv", name = "ua", descriptor = "(F)V")
	@Override
	public void ua(@OriginalArg(0) float arg0) {
		if (this.aFloat37 != arg0) {
			this.aFloat37 = arg0;
			this.method924();
		}
	}

	@OriginalMember(owner = "client!bv", name = "ia", descriptor = "(III[I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg1 * this.aClass116_Sub2_4.aFloat174 + (float) arg0 * this.aClass116_Sub2_4.aFloat172 + (float) arg2 * this.aClass116_Sub2_4.aFloat170 + this.aClass116_Sub2_4.aFloat175;
		if (local28 < (float) this.anInt1252 || (float) this.anInt1271 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass116_Sub2_4.aFloat176 + (float) arg0 * this.aClass116_Sub2_4.aFloat169 + this.aClass116_Sub2_4.aFloat171 * (float) arg1 + this.aClass116_Sub2_4.aFloat165 * (float) arg2) * (float) this.anInt1285 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt1281 * (this.aClass116_Sub2_4.aFloat166 * (float) arg1 + this.aClass116_Sub2_4.aFloat167 * (float) arg0 + this.aClass116_Sub2_4.aFloat173 * (float) arg2 + this.aClass116_Sub2_4.aFloat168) / local28);
		if (this.aFloat33 <= (float) local85 && (float) local85 <= this.aFloat41 && this.aFloat28 <= (float) local117 && (float) local117 <= this.aFloat40) {
			arg3[1] = (int) ((float) local117 - this.aFloat28);
			arg3[0] = (int) ((float) local85 - this.aFloat33);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "()Z")
	@Override
	public boolean method4639() {
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "()V")
	@Override
	public void method4637() {
		if (!this.aBoolean74 || this.anInt1161 <= 0 || this.anInt1138 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt1275;
		@Pc(22) int local22 = this.anInt1279;
		@Pc(25) int local25 = this.anInt1255;
		@Pc(28) int local28 = this.anInt1254;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method942();
		this.method960(false);
		this.method952(false);
		this.method930(false);
		this.method956(false);
		this.method916(null);
		this.method940(-2);
		this.method923(1);
		this.method931(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt1161, this.anInt1138, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.pa(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I[BZII)Lclient!tu;")
	public Interface12 method945(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return (Interface12) (this.aBoolean73 && (!arg1 || this.aBoolean63) ? new Class104_Sub2(this, 5123, arg0, arg2, arg1) : new Class45_Sub2(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!bv", name = "z", descriptor = "(I)V")
	private void method946() {
		if (this.aBoolean57 && !this.aBoolean70) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
	@Override
	public void method4631(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt1240 = arg0;
		this.aClass63_1.method1547();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!rl;Z)Lclient!f;")
	@Override
	public Class3 method4656(@OriginalArg(0) Class205 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt6171 * arg0.anInt6175];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray70 == null) {
			for (local21 = 0; local21 < arg0.anInt6171; local21++) {
				for (local25 = 0; local25 < arg0.anInt6175; local25++) {
					@Pc(87) int local87 = arg0.anIntArray538[arg0.aByteArray71[local14++] & 0xFF];
					local12[local16++] = local87 == 0 ? 0 : local87 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt6171; local21++) {
				for (local25 = 0; local25 < arg0.anInt6175; local25++) {
					local12[local16++] = arg0.aByteArray70[local14] << 24 | arg0.anIntArray538[arg0.aByteArray71[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(127) Class3 local127 = this.method4672(local12, arg0.anInt6175, arg0.anInt6175, arg0.anInt6171);
		local127.ka(arg0.anInt6173, arg0.anInt6170, arg0.anInt6172, arg0.anInt6174);
		return local127;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZI)V")
	public synchronized void method947(@OriginalArg(1) int arg0) {
		@Pc(7) Class4 local7 = new Class4();
		local7.aLong225 = arg0;
		this.aClass258_12.method5526(local7);
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(IB)V")
	public void method948(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt1287) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt1287 = arg0;
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(IJ)V")
	public synchronized void method949(@OriginalArg(1) long arg0) {
		@Pc(7) Class4 local7 = new Class4();
		local7.aLong225 = arg0;
		this.aClass258_13.method5526(local7);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!tu;)V")
	public void method950(@OriginalArg(1) Interface12 arg0) {
		if (arg0 != this.anInterface12_2) {
			if (this.aBoolean73) {
				OpenGL.glBindBufferARB(34963, arg0.method4731());
			}
			this.anInterface12_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(Lclient!cc;I)V")
	public void method951(@OriginalArg(0) Interface1 arg0) {
		if (this.anInt1245 < 0 || this.anInterface1Array1[this.anInt1245] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface1Array1[this.anInt1245--] = null;
		arg0.method3078();
		if (this.anInt1245 >= 0) {
			this.anInterface1_1 = this.anInterface1Array1[this.anInt1245];
			this.anInterface1_1.method3082();
		} else {
			this.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(IZ)V")
	public void method952(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean57 != arg0) {
			this.aBoolean57 = arg0;
			this.method946();
			this.anInt1257 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bv", name = "A", descriptor = "(I)V")
	private void method953() {
		if (this.anInt1279 >= this.anInt1275 && this.anInt1255 <= this.anInt1254) {
			OpenGL.glScissor(this.anInt1275 + this.anInt1266, this.anInt1273 + (this.anInt1138 - this.anInt1254), this.anInt1279 - this.anInt1275, this.anInt1254 - this.anInt1255);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!bv", name = "v", descriptor = "()Z")
	@Override
	public boolean method4688() {
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BIII)V")
	public void method954(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!bv", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt1263 && this.anInt1278 == arg1 && arg2 == this.anInt1276) {
			return;
		}
		this.anInt1276 = arg2;
		this.anInt1263 = arg0;
		this.anInt1278 = arg1;
		if (!this.aBoolean58) {
			this.method969();
			this.method895();
		}
	}

	@OriginalMember(owner = "client!bv", name = "IA", descriptor = "(IIII)[I")
	@Override
	public int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt1138 - local12 - arg1, arg2, 1, 32993, this.bf, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(II)I")
	@Override
	public int method4674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "()Z")
	@Override
	public boolean method4634() {
		return this.aBoolean60 && (!this.method4666() || this.aBoolean71);
	}

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "()Z")
	@Override
	public boolean method4651() {
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "()Z")
	@Override
	public boolean method4643() {
		return false;
	}

	@OriginalMember(owner = "client!bv", name = "u", descriptor = "([I)V")
	@Override
	public void u(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt1254;
		arg0[0] = this.anInt1275;
		arg0[1] = this.anInt1255;
		arg0[2] = this.anInt1279;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method4699(@OriginalArg(0) Class4_Sub27 arg0) {
		this.aNativeHeap1 = ((Class4_Sub27_Sub1) arg0).aNativeHeap2;
		if (this.anInterface6_3 != null) {
			return;
		}
		@Pc(16) Class4_Sub30_Sub2 local16 = new Class4_Sub30_Sub2(80);
		if (this.aBoolean76) {
			local16.method4896(-1.0F);
			local16.method4896(-1.0F);
			local16.method4896(0.0F);
			local16.method4896(0.0F);
			local16.method4896(1.0F);
			local16.method4896(1.0F);
			local16.method4896(-1.0F);
			local16.method4896(0.0F);
			local16.method4896(1.0F);
			local16.method4896(1.0F);
			local16.method4896(1.0F);
			local16.method4896(1.0F);
			local16.method4896(0.0F);
			local16.method4896(1.0F);
			local16.method4896(0.0F);
			local16.method4896(-1.0F);
			local16.method4896(1.0F);
			local16.method4896(0.0F);
			local16.method4896(0.0F);
			local16.method4896(0.0F);
		} else {
			local16.method4892(-1.0F);
			local16.method4892(-1.0F);
			local16.method4892(0.0F);
			local16.method4892(0.0F);
			local16.method4892(1.0F);
			local16.method4892(1.0F);
			local16.method4892(-1.0F);
			local16.method4892(0.0F);
			local16.method4892(1.0F);
			local16.method4892(1.0F);
			local16.method4892(1.0F);
			local16.method4892(1.0F);
			local16.method4892(0.0F);
			local16.method4892(1.0F);
			local16.method4892(0.0F);
			local16.method4892(-1.0F);
			local16.method4892(1.0F);
			local16.method4892(0.0F);
			local16.method4892(0.0F);
			local16.method4892(0.0F);
		}
		this.anInterface6_3 = this.method941(20, local16.aByteArray79, local16.anInt6244, false);
		this.aClass124_5 = new Class124(this.anInterface6_3, 5126, 3, 0);
		this.aClass124_6 = new Class124(this.anInterface6_3, 5126, 2, 12);
		this.aClass176_1.method4029(this);
	}

	@OriginalMember(owner = "client!bv", name = "S", descriptor = "()V")
	@Override
	public void S() {
		this.aBoolean58 = false;
		this.aClass184_1.method4114(0, false, false);
		this.method969();
		this.method895();
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(ZI)V")
	public void method956(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean83) {
			this.aBoolean83 = arg0;
			this.method904();
			this.anInt1257 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIB)V")
	public void method957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method939();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method931(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean60) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean60) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIILclient!tu;I)V")
	public void method958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface12 arg2) {
		@Pc(9) int local9 = arg2.method4733();
		@Pc(16) int local16 = arg0 * this.method909(local9);
		this.method950(arg2);
		OpenGL.glDrawElements(4, arg1, local9, (long) local16 + arg2.method4732());
	}

	@OriginalMember(owner = "client!bv", name = "pa", descriptor = "(IIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt1161) {
			arg2 = this.anInt1161;
		}
		if (arg3 > this.anInt1138) {
			arg3 = this.anInt1138;
		}
		this.anInt1279 = arg2;
		this.anInt1254 = arg3;
		this.anInt1255 = arg1;
		this.anInt1275 = arg0;
		OpenGL.glEnable(3089);
		this.method913();
		this.method953();
	}

	@OriginalMember(owner = "client!bv", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		@Pc(6) int local6 = this.anInt1262;
		this.anInt1262 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!bv", name = "C", descriptor = "(I)V")
	private void method959() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray9, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZZ)V")
	public void method960(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean81 != arg0) {
			this.aBoolean81 = arg0;
			this.method895();
			this.anInt1257 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bv", name = "NA", descriptor = "(IIIIII)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method939();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method931(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean60) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean60) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!bv", name = "D", descriptor = "(I)V")
	private void method961() {
		@Pc(6) float[] local6 = this.aFloatArray9;
		@Pc(18) float local18 = (float) (this.anInt1252 * -this.anInt1288) / (float) this.anInt1285;
		@Pc(33) float local33 = (float) ((this.anInt1161 - this.anInt1288) * this.anInt1252) / (float) this.anInt1285;
		@Pc(44) float local44 = (float) (this.anInt1252 * this.anInt1259) / (float) this.anInt1281;
		@Pc(59) float local59 = (float) ((this.anInt1259 - this.anInt1138) * this.anInt1252) / (float) this.anInt1281;
		if (local33 == local18 || local44 == local59) {
			local6[8] = 0.0F;
			local6[11] = 0.0F;
			local6[12] = 0.0F;
			local6[0] = 1.0F;
			local6[15] = 1.0F;
			local6[1] = 0.0F;
			local6[10] = 1.0F;
			local6[3] = 0.0F;
			local6[7] = 0.0F;
			local6[2] = 0.0F;
			local6[6] = 0.0F;
			local6[13] = 0.0F;
			local6[9] = 0.0F;
			local6[14] = 0.0F;
			local6[4] = 0.0F;
			local6[5] = 1.0F;
		} else {
			@Pc(139) float local139 = (float) this.anInt1252 * 2.0F;
			local6[13] = 0.0F;
			local6[1] = 0.0F;
			local6[3] = 0.0F;
			local6[9] = (local44 + local59) / (local44 - local59);
			local6[12] = 0.0F;
			local6[11] = -1.0F;
			local6[6] = 0.0F;
			local6[14] = this.aFloat43 = -(local139 * (float) this.anInt1271) / (float) (this.anInt1271 - this.anInt1252);
			local6[5] = local139 / (local44 - local59);
			local6[2] = 0.0F;
			local6[7] = 0.0F;
			local6[0] = local139 / (local33 - local18);
			local6[15] = 0.0F;
			local6[10] = this.aFloat27 = (float) -(this.anInt1252 + this.anInt1271) / (float) (this.anInt1271 - this.anInt1252);
			local6[8] = (local18 + local33) / (-local18 + local33);
			local6[4] = 0.0F;
		}
		this.method928();
	}

	@OriginalMember(owner = "client!bv", name = "E", descriptor = "(I)V")
	public void method962() {
		if (this.anInt1257 == 2) {
			return;
		}
		this.method927();
		this.method960(false);
		this.method952(false);
		this.method930(false);
		this.method956(false);
		this.method940(-2);
		this.anInt1257 = 2;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(FB)V")
	public void method963(@OriginalArg(0) float arg0) {
		if (this.aFloat32 == arg0) {
			return;
		}
		this.aFloat32 = arg0;
		if (this.anInt1253 == 3) {
			this.method973();
			return;
		}
	}

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "(I)V")
	@Override
	public void method4685(@OriginalArg(0) int arg0) {
		this.method922();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(FFFFI)V")
	public void method964(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static213.aFloatArray19[1] = arg2;
		Static213.aFloatArray19[3] = arg3;
		Static213.aFloatArray19[0] = arg1;
		Static213.aFloatArray19[2] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static213.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(III)V")
	public synchronized void method965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub15 local8 = new Class4_Sub15(arg1);
		local8.aLong225 = arg0;
		this.aClass258_8.method5526(local8);
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(III)V")
	public void method966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1266 = arg0;
		this.anInt1273 = arg1;
		this.method943();
		this.method953();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!mc;Lclient!mc;FLclient!mc;)Lclient!mc;")
	@Override
	public Class59 method4641(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class59 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean78 && this.aBoolean69 && this.aBoolean59) {
			@Pc(18) Class59_Sub1_Sub1 local18 = null;
			@Pc(21) Class59_Sub1 local21 = (Class59_Sub1) arg0;
			@Pc(24) Class59_Sub1 local24 = (Class59_Sub1) arg1;
			@Pc(28) Class1_Sub2 local28 = local21.method4050();
			@Pc(32) Class1_Sub2 local32 = local24.method4050();
			if (local28 != null && local32 != null) {
				@Pc(47) int local47 = local32.anInt4346 < local28.anInt4346 ? local28.anInt4346 : local32.anInt4346;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class59_Sub1_Sub1) {
					@Pc(59) Class59_Sub1_Sub1 local59 = (Class59_Sub1_Sub1) arg3;
					if (local59.method1484() == local47) {
						local18 = local59;
					}
				}
				if (local18 == null) {
					local18 = new Class59_Sub1_Sub1(this, local47);
				}
				if (local18.method1486(local32, arg2, local28)) {
					return local18;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "()Z")
	@Override
	public boolean method4682() {
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "(B)V")
	private void method967() {
		if (this.anInt1253 != 2) {
			this.anInt1253 = 2;
			this.method959();
			this.method932();
			this.anInt1257 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bv", name = "z", descriptor = "()V")
	@Override
	public void method4700() {
		this.method956(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "()Z")
	@Override
	public boolean method4668() {
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "()Z")
	@Override
	public boolean method4681() {
		return this.aClass184_1.method4116();
	}

	@OriginalMember(owner = "client!bv", name = "O", descriptor = "(IIIII)V")
	@Override
	protected void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!bv", name = "F", descriptor = "(I)V")
	private void method968() {
		Static213.aFloatArray19[1] = this.aFloat36 * this.aFloat31;
		Static213.aFloatArray19[0] = this.aFloat31 * this.aFloat23;
		Static213.aFloatArray19[2] = this.aFloat31 * this.aFloat38;
		Static213.aFloatArray19[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static213.aFloatArray19, 0);
		Static213.aFloatArray19[2] = this.aFloat38 * -this.aFloat35;
		Static213.aFloatArray19[3] = 1.0F;
		Static213.aFloatArray19[1] = -this.aFloat35 * this.aFloat36;
		Static213.aFloatArray19[0] = -this.aFloat35 * this.aFloat23;
		OpenGL.glLightfv(16385, 4609, Static213.aFloatArray19, 0);
	}

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "(Z)V")
	private void method969() {
		@Pc(15) int local15;
		if (this.aBoolean58) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt1258;
		} else {
			this.aFloat39 = (float) (this.anInt1271 - this.anInt1276) - this.aFloat42;
			this.aFloat24 = this.aFloat39 - this.aFloat26 * (float) this.anInt1278;
			if ((float) this.anInt1252 > this.aFloat24) {
				this.aFloat24 = this.anInt1252;
			}
			OpenGL.glFogf(2915, this.aFloat24);
			OpenGL.glFogf(2916, this.aFloat39);
			local15 = this.anInt1263;
		}
		Static213.aFloatArray19[2] = (float) (local15 & 0xFF) / 255.0F;
		Static213.aFloatArray19[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static213.aFloatArray19[1] = (float) (local15 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static213.aFloatArray19, 0);
		if (this.aBoolean58) {
			this.aClass184_1.aClass2_Sub4_1.method1502();
		}
	}

	@OriginalMember(owner = "client!bv", name = "G", descriptor = "(I)V")
	private void method970() {
		if (this.aBoolean75) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean75 = false;
		}
	}

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "()I")
	@Override
	public int g() {
		@Pc(6) int local6 = this.anInt1256;
		this.anInt1256 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "(FF)V")
	@Override
	public void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat29 && arg1 == this.aFloat34) {
			return;
		}
		this.aFloat29 = arg0;
		this.aFloat34 = arg1;
		this.method928();
		if (this.anInt1253 == 3) {
			this.method973();
			return;
		}
		if (this.anInt1253 != 2) {
			return;
		}
		this.method959();
	}

	@OriginalMember(owner = "client!bv", name = "JA", descriptor = "(II)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1252 == arg0 && this.anInt1271 == arg1) {
			return;
		}
		this.anInt1252 = arg0;
		this.anInt1271 = arg1;
		this.method961();
		this.method969();
		if (this.anInt1253 == 3) {
			this.method973();
		} else if (this.anInt1253 == 2) {
			this.method959();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4638() {
	}

	@OriginalMember(owner = "client!bv", name = "H", descriptor = "(I)I")
	private int method971() {
		this.aString13 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString14 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString13.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString13.indexOf("brian paul") != -1 || this.aString13.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static220.method4275(' ', local46.replace('.', ' '));
		if (local54.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(72) int local72 = Static297.method4115(local54[0]);
				@Pc(80) int local80 = Static297.method4115(local54[1]);
				this.anInt1267 = local80 + local72 * 10;
			} catch (@Pc(89) NumberFormatException local89) {
				local10 |= 0x4;
			}
		}
		if (this.anInt1267 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(125) int[] local125 = new int[1];
		OpenGL.glGetIntegerv(34018, local125, 0);
		this.anInt1272 = local125[0];
		OpenGL.glGetIntegerv(34929, local125, 0);
		this.anInt1269 = local125[0];
		OpenGL.glGetIntegerv(34930, local125, 0);
		this.anInt1286 = local125[0];
		if (this.anInt1272 < 2 || this.anInt1269 < 2 || this.anInt1286 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean76 = NativeStream.a();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean73 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean60 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean80 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean77 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean65 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean82 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean68 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean78 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean64 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean62 = false;
		this.aBoolean69 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean59 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean72 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean71 = this.aBoolean72 & this.aBoolean59;
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!cc;)V")
	public void method972(@OriginalArg(1) Interface1 arg0) {
		if (this.aBoolean59) {
			this.method906(arg0);
			this.method901(arg0);
		} else if (this.anInt1246 < 3) {
			if (this.anInt1246 >= 0) {
				this.anInterface1Array2[this.anInt1246].method3081();
			}
			this.anInterface1_1 = this.anInterface1_2 = this.anInterface1Array2[++this.anInt1246] = arg0;
			this.anInterface1_1.method3083();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bv", name = "I", descriptor = "(I)V")
	private void method973() {
		@Pc(15) float local15 = (float) -this.anInt1288 * this.aFloat32 / (float) this.anInt1285;
		@Pc(27) float local27 = (float) -this.anInt1259 * this.aFloat32 / (float) this.anInt1281;
		@Pc(48) float local48 = this.aFloat32 * (float) (this.anInt1161 - this.anInt1288) / (float) this.anInt1285;
		@Pc(62) float local62 = (float) (this.anInt1138 - this.anInt1259) * this.aFloat32 / (float) this.anInt1281;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local48 != local15 && local62 != local27) {
			OpenGL.glOrtho((double) local15, (double) local48, (double) -local62, (double) -local27, (double) ((float) this.anInt1252 - this.aFloat34), (double) ((float) this.anInt1271 - this.aFloat34));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "()Z")
	@Override
	public boolean method4679() {
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "(B)V")
	public void method974() {
		if (this.anInt1257 == 16) {
			return;
		}
		this.method917();
		this.method960(true);
		this.method930(true);
		this.method956(true);
		this.method931(1);
		this.method923(0);
		this.anInt1257 = 16;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!mc;)V")
	@Override
	public void method4667(@OriginalArg(0) Class59 arg0) {
		this.aClass59_Sub1_1 = (Class59_Sub1) arg0;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V")
	@Override
	public void method4646(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "()V")
	@Override
	public void method4693() {
		this.aClass34_1.method1038();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass34_1.method1035(arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(Z)V")
	@Override
	public void method4663(@OriginalArg(0) boolean arg0) {
		this.aBoolean66 = arg0;
		this.method904();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4642(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = null;
		this.aLong22 = 0L;
		if (arg0 == null || this.aCanvas2 == arg0) {
			this.aLong22 = this.aLong23;
			this.aCanvas1 = this.aCanvas2;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable1.get(arg0);
			this.aLong22 = local26;
			this.aCanvas1 = arg0;
		}
		if (this.aCanvas1 == null || this.aLong22 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong22);
		this.method976();
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4684(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLclient!rc;)V")
	public void method975(@OriginalArg(1) Class116_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method4594(), 0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([Lclient!c;Lclient!vo;Lclient!ia;[Lclient!mn;I)V")
	@Override
	public void method4659(@OriginalArg(0) Class7[] arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class116 arg2, @OriginalArg(3) Class41_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method4701(arg0, arg2, arg3, arg4);
		this.method4653(arg1);
	}

	@OriginalMember(owner = "client!bv", name = "la", descriptor = "()F")
	@Override
	public float la() {
		return this.aFloat29;
	}

	@OriginalMember(owner = "client!bv", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt1255 = 0;
		this.anInt1254 = this.anInt1138;
		this.anInt1275 = 0;
		this.anInt1279 = this.anInt1161;
		OpenGL.glDisable(3089);
		this.method913();
	}

	@OriginalMember(owner = "client!bv", name = "J", descriptor = "(I)V")
	private void method976() {
		if (this.aCanvas1 == null) {
			this.anInt1147 = this.anInt1098 = 0;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas1.getSize();
			this.anInt1098 = local6.height;
			this.anInt1147 = local6.width;
		}
		if (this.anInterface1_2 == null) {
			this.anInt1161 = this.anInt1147;
			this.anInt1138 = this.anInt1098;
			this.method943();
		}
		this.method942();
		this.va();
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(ZZ)V")
	public void method977(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean70) {
			this.aBoolean70 = arg0;
			this.method946();
		}
	}

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "()V")
	@Override
	public void method4661() {
		if (this.aClass4_Sub12_Sub1_1 != null && this.aClass4_Sub12_Sub1_1.method1739()) {
			this.aClass34_1.method1030(this.aClass4_Sub12_Sub1_1);
			this.aClass63_1.method1547();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLclient!gf;)V")
	public void method978(@OriginalArg(1) Interface6 arg0) {
		if (this.anInterface6_2 != arg0) {
			if (this.aBoolean73) {
				OpenGL.glBindBufferARB(34962, arg0.method2117());
			}
			this.anInterface6_2 = arg0;
		}
	}
}
