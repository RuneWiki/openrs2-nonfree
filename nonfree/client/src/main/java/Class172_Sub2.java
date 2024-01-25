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

@OriginalClass("client!vj")
public final class Class172_Sub2 extends Class172 {

	@OriginalMember(owner = "client!vj", name = "Fb", descriptor = "I")
	private int anInt7033;

	@OriginalMember(owner = "client!vj", name = "Hb", descriptor = "I")
	private int anInt7035;

	@OriginalMember(owner = "client!vj", name = "ac", descriptor = "I")
	public int anInt7054;

	@OriginalMember(owner = "client!vj", name = "pc", descriptor = "I")
	public int anInt7068;

	@OriginalMember(owner = "client!vj", name = "oe", descriptor = "I")
	public int anInt7161;

	@OriginalMember(owner = "client!vj", name = "ue", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!vj", name = "ve", descriptor = "Lclient!wq;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!vj", name = "ze", descriptor = "Lclient!wq;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!vj", name = "De", descriptor = "I")
	private int anInt7167;

	@OriginalMember(owner = "client!vj", name = "Fe", descriptor = "I")
	public int anInt7168;

	@OriginalMember(owner = "client!vj", name = "Ge", descriptor = "I")
	public int anInt7169;

	@OriginalMember(owner = "client!vj", name = "Ne", descriptor = "Z")
	public boolean aBoolean599;

	@OriginalMember(owner = "client!vj", name = "Oe", descriptor = "Lclient!mf;")
	public Class112_Sub2 aClass112_Sub2_5;

	@OriginalMember(owner = "client!vj", name = "Qe", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!vj", name = "Se", descriptor = "Lclient!vq;")
	public Class9_Sub2 aClass9_Sub2_1;

	@OriginalMember(owner = "client!vj", name = "Te", descriptor = "Z")
	public boolean aBoolean601;

	@OriginalMember(owner = "client!vj", name = "Ue", descriptor = "I")
	private int anInt7171;

	@OriginalMember(owner = "client!vj", name = "Ve", descriptor = "Z")
	public boolean aBoolean602;

	@OriginalMember(owner = "client!vj", name = "We", descriptor = "Z")
	private boolean aBoolean603;

	@OriginalMember(owner = "client!vj", name = "Ye", descriptor = "Lclient!mf;")
	public Class112_Sub2 aClass112_Sub2_6;

	@OriginalMember(owner = "client!vj", name = "af", descriptor = "Z")
	private boolean aBoolean604;

	@OriginalMember(owner = "client!vj", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!vj", name = "cf", descriptor = "Ljava/lang/String;")
	private String aString63;

	@OriginalMember(owner = "client!vj", name = "ff", descriptor = "Z")
	public boolean aBoolean606;

	@OriginalMember(owner = "client!vj", name = "gf", descriptor = "I")
	private int anInt7174;

	@OriginalMember(owner = "client!vj", name = "hf", descriptor = "I")
	private int anInt7175;

	@OriginalMember(owner = "client!vj", name = "nf", descriptor = "Z")
	private boolean aBoolean608;

	@OriginalMember(owner = "client!vj", name = "of", descriptor = "Lclient!mn;")
	public Class107_Sub1 aClass107_Sub1_3;

	@OriginalMember(owner = "client!vj", name = "pf", descriptor = "Lclient!kd;")
	public Class127 aClass127_11;

	@OriginalMember(owner = "client!vj", name = "rf", descriptor = "Lclient!vq;")
	public Class9_Sub2 aClass9_Sub2_2;

	@OriginalMember(owner = "client!vj", name = "sf", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!vj", name = "tf", descriptor = "Z")
	public boolean aBoolean609;

	@OriginalMember(owner = "client!vj", name = "vf", descriptor = "F")
	private float aFloat79;

	@OriginalMember(owner = "client!vj", name = "wf", descriptor = "Lclient!vq;")
	public Class9_Sub2 aClass9_Sub2_3;

	@OriginalMember(owner = "client!vj", name = "yf", descriptor = "I")
	private int anInt7180;

	@OriginalMember(owner = "client!vj", name = "zf", descriptor = "Lclient!vh;")
	public Class259 aClass259_6;

	@OriginalMember(owner = "client!vj", name = "Cf", descriptor = "Z")
	private boolean aBoolean612;

	@OriginalMember(owner = "client!vj", name = "Ef", descriptor = "Lclient!mk;")
	private Class112_Sub2_Sub1 aClass112_Sub2_Sub1_5;

	@OriginalMember(owner = "client!vj", name = "Gf", descriptor = "I")
	private int anInt7181;

	@OriginalMember(owner = "client!vj", name = "Hf", descriptor = "Z")
	private boolean aBoolean614;

	@OriginalMember(owner = "client!vj", name = "If", descriptor = "Z")
	public boolean aBoolean615;

	@OriginalMember(owner = "client!vj", name = "Kf", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!vj", name = "Mf", descriptor = "I")
	public int anInt7182;

	@OriginalMember(owner = "client!vj", name = "Of", descriptor = "I")
	public int anInt7183;

	@OriginalMember(owner = "client!vj", name = "Pf", descriptor = "Ljava/lang/String;")
	private String aString64;

	@OriginalMember(owner = "client!vj", name = "Qf", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!vj", name = "Rf", descriptor = "F")
	private float aFloat83;

	@OriginalMember(owner = "client!vj", name = "Tf", descriptor = "Z")
	private boolean aBoolean618;

	@OriginalMember(owner = "client!vj", name = "Vf", descriptor = "Lclient!vq;")
	public Class9_Sub2 aClass9_Sub2_4;

	@OriginalMember(owner = "client!vj", name = "Xf", descriptor = "Lclient!hc;")
	private Class23_Sub1 aClass23_Sub1_1;

	@OriginalMember(owner = "client!vj", name = "Yf", descriptor = "I")
	private int anInt7184;

	@OriginalMember(owner = "client!vj", name = "ag", descriptor = "Lclient!vq;")
	public Class9_Sub2 aClass9_Sub2_5;

	@OriginalMember(owner = "client!vj", name = "eg", descriptor = "Z")
	public boolean aBoolean619;

	@OriginalMember(owner = "client!vj", name = "fg", descriptor = "Z")
	private boolean aBoolean620;

	@OriginalMember(owner = "client!vj", name = "gg", descriptor = "I")
	private int anInt7186;

	@OriginalMember(owner = "client!vj", name = "ig", descriptor = "Lclient!vq;")
	public Class9_Sub2 aClass9_Sub2_6;

	@OriginalMember(owner = "client!vj", name = "kg", descriptor = "I")
	private int anInt7189;

	@OriginalMember(owner = "client!vj", name = "mg", descriptor = "I")
	public int anInt7191;

	@OriginalMember(owner = "client!vj", name = "ng", descriptor = "I")
	private int anInt7192;

	@OriginalMember(owner = "client!vj", name = "og", descriptor = "Lclient!vq;")
	public Class9_Sub2 aClass9_Sub2_7;

	@OriginalMember(owner = "client!vj", name = "rg", descriptor = "Lclient!vq;")
	public Class9_Sub2 aClass9_Sub2_8;

	@OriginalMember(owner = "client!vj", name = "tg", descriptor = "I")
	public int anInt7195;

	@OriginalMember(owner = "client!vj", name = "ug", descriptor = "Z")
	public boolean aBoolean621;

	@OriginalMember(owner = "client!vj", name = "wg", descriptor = "Lclient!nh;")
	private Interface6 anInterface6_5;

	@OriginalMember(owner = "client!vj", name = "xg", descriptor = "Z")
	private boolean aBoolean622;

	@OriginalMember(owner = "client!vj", name = "yg", descriptor = "Lclient!vq;")
	public Class9_Sub2 aClass9_Sub2_9;

	@OriginalMember(owner = "client!vj", name = "zg", descriptor = "Lclient!mn;")
	public Class107_Sub1 aClass107_Sub1_4;

	@OriginalMember(owner = "client!vj", name = "Bg", descriptor = "Lclient!u;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!vj", name = "Dg", descriptor = "[Lclient!ih;")
	private Class112[] aClass112Array1;

	@OriginalMember(owner = "client!vj", name = "Eg", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!vj", name = "Hg", descriptor = "Z")
	public boolean aBoolean623;

	@OriginalMember(owner = "client!vj", name = "Ig", descriptor = "Lclient!nh;")
	private Interface6 anInterface6_6;

	@OriginalMember(owner = "client!vj", name = "Jg", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!vj", name = "Mg", descriptor = "Lclient!mf;")
	public Class112_Sub2 aClass112_Sub2_7;

	@OriginalMember(owner = "client!vj", name = "Pg", descriptor = "Lclient!vq;")
	public Class9_Sub2 aClass9_Sub2_10;

	@OriginalMember(owner = "client!vj", name = "Sg", descriptor = "Lclient!kd;")
	public Class127 aClass127_12;

	@OriginalMember(owner = "client!vj", name = "Tg", descriptor = "I")
	private int anInt7204;

	@OriginalMember(owner = "client!vj", name = "Ug", descriptor = "Lclient!vh;")
	public Class259 aClass259_7;

	@OriginalMember(owner = "client!vj", name = "Vg", descriptor = "F")
	private float aFloat92;

	@OriginalMember(owner = "client!vj", name = "Wg", descriptor = "Z")
	private boolean aBoolean624;

	@OriginalMember(owner = "client!vj", name = "Xg", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!vj", name = "Zg", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "client!vj", name = "bh", descriptor = "Z")
	private boolean aBoolean625;

	@OriginalMember(owner = "client!vj", name = "dh", descriptor = "I")
	private int anInt7206;

	@OriginalMember(owner = "client!vj", name = "eh", descriptor = "I")
	private int anInt7207;

	@OriginalMember(owner = "client!vj", name = "Mc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!vj", name = "de", descriptor = "I")
	public int anInt7153 = 128;

	@OriginalMember(owner = "client!vj", name = "be", descriptor = "Lclient!jn;")
	private final Class122 aClass122_1 = new Class122();

	@OriginalMember(owner = "client!vj", name = "me", descriptor = "Lclient!mn;")
	private final Class107_Sub1 aClass107_Sub1_1 = new Class107_Sub1();

	@OriginalMember(owner = "client!vj", name = "ne", descriptor = "Lclient!mn;")
	public final Class107_Sub1 aClass107_Sub1_2 = new Class107_Sub1();

	@OriginalMember(owner = "client!vj", name = "pe", descriptor = "Z")
	private boolean aBoolean598 = false;

	@OriginalMember(owner = "client!vj", name = "qe", descriptor = "I")
	public int anInt7162 = 3;

	@OriginalMember(owner = "client!vj", name = "te", descriptor = "I")
	public int anInt7163 = 8;

	@OriginalMember(owner = "client!vj", name = "se", descriptor = "Lclient!ug;")
	private final Class243 aClass243_44 = new Class243();

	@OriginalMember(owner = "client!vj", name = "we", descriptor = "I")
	private int anInt7164 = -1;

	@OriginalMember(owner = "client!vj", name = "xe", descriptor = "[Lclient!wq;")
	private final Interface12[] anInterface12Array1 = new Interface12[4];

	@OriginalMember(owner = "client!vj", name = "ye", descriptor = "I")
	private int anInt7165 = -1;

	@OriginalMember(owner = "client!vj", name = "Be", descriptor = "[Lclient!wq;")
	private final Interface12[] anInterface12Array2 = new Interface12[4];

	@OriginalMember(owner = "client!vj", name = "Ae", descriptor = "I")
	private int anInt7166 = -1;

	@OriginalMember(owner = "client!vj", name = "Ce", descriptor = "[Lclient!wq;")
	private final Interface12[] anInterface12Array3 = new Interface12[4];

	@OriginalMember(owner = "client!vj", name = "Ee", descriptor = "Lclient!ug;")
	private final Class243 aClass243_45;

	@OriginalMember(owner = "client!vj", name = "He", descriptor = "Lclient!ug;")
	private final Class243 aClass243_46;

	@OriginalMember(owner = "client!vj", name = "Ie", descriptor = "Lclient!ug;")
	private final Class243 aClass243_47;

	@OriginalMember(owner = "client!vj", name = "Je", descriptor = "Lclient!ug;")
	private final Class243 aClass243_48;

	@OriginalMember(owner = "client!vj", name = "Ke", descriptor = "Lclient!ug;")
	private final Class243 aClass243_49;

	@OriginalMember(owner = "client!vj", name = "Le", descriptor = "Lclient!ug;")
	private final Class243 aClass243_50;

	@OriginalMember(owner = "client!vj", name = "Me", descriptor = "Lclient!ug;")
	private final Class243 aClass243_51;

	@OriginalMember(owner = "client!vj", name = "Re", descriptor = "Z")
	private boolean aBoolean600;

	@OriginalMember(owner = "client!vj", name = "uf", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!vj", name = "Lf", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!vj", name = "Xe", descriptor = "I")
	private int anInt7172;

	@OriginalMember(owner = "client!vj", name = "jf", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!vj", name = "Ze", descriptor = "[F")
	public final float[] aFloatArray26;

	@OriginalMember(owner = "client!vj", name = "cg", descriptor = "F")
	private float aFloat87;

	@OriginalMember(owner = "client!vj", name = "qf", descriptor = "I")
	private int anInt7178;

	@OriginalMember(owner = "client!vj", name = "xf", descriptor = "I")
	private int anInt7179;

	@OriginalMember(owner = "client!vj", name = "Ff", descriptor = "[F")
	private final float[] aFloatArray27;

	@OriginalMember(owner = "client!vj", name = "vg", descriptor = "I")
	public int anInt7196;

	@OriginalMember(owner = "client!vj", name = "Jf", descriptor = "[Lclient!fk;")
	private final Class3_Sub8[] aClass3_Sub8Array3;

	@OriginalMember(owner = "client!vj", name = "df", descriptor = "I")
	public int anInt7173;

	@OriginalMember(owner = "client!vj", name = "Pe", descriptor = "I")
	public int anInt7170;

	@OriginalMember(owner = "client!vj", name = "Zf", descriptor = "I")
	public int anInt7185;

	@OriginalMember(owner = "client!vj", name = "pg", descriptor = "I")
	public int anInt7193;

	@OriginalMember(owner = "client!vj", name = "dg", descriptor = "[F")
	private final float[] aFloatArray28;

	@OriginalMember(owner = "client!vj", name = "sg", descriptor = "[F")
	private final float[] aFloatArray29;

	@OriginalMember(owner = "client!vj", name = "Ng", descriptor = "I")
	public int anInt7203;

	@OriginalMember(owner = "client!vj", name = "jg", descriptor = "I")
	public int anInt7188;

	@OriginalMember(owner = "client!vj", name = "Lg", descriptor = "I")
	private int anInt7202;

	@OriginalMember(owner = "client!vj", name = "bg", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!vj", name = "Kg", descriptor = "I")
	public int anInt7201;

	@OriginalMember(owner = "client!vj", name = "Uf", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!vj", name = "Ag", descriptor = "I")
	public int anInt7197;

	@OriginalMember(owner = "client!vj", name = "Rg", descriptor = "F")
	private float aFloat91;

	@OriginalMember(owner = "client!vj", name = "qg", descriptor = "I")
	private int anInt7194;

	@OriginalMember(owner = "client!vj", name = "Og", descriptor = "[F")
	private final float[] aFloatArray30;

	@OriginalMember(owner = "client!vj", name = "Cg", descriptor = "I")
	private int anInt7198;

	@OriginalMember(owner = "client!vj", name = "Qg", descriptor = "F")
	private float aFloat90;

	@OriginalMember(owner = "client!vj", name = "hg", descriptor = "I")
	private int anInt7187;

	@OriginalMember(owner = "client!vj", name = "Gg", descriptor = "I")
	public int anInt7200;

	@OriginalMember(owner = "client!vj", name = "kf", descriptor = "I")
	private int anInt7176;

	@OriginalMember(owner = "client!vj", name = "Fg", descriptor = "I")
	private int anInt7199;

	@OriginalMember(owner = "client!vj", name = "Wf", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!vj", name = "lg", descriptor = "I")
	public int anInt7190;

	@OriginalMember(owner = "client!vj", name = "Yg", descriptor = "I")
	private int anInt7205;

	@OriginalMember(owner = "client!vj", name = "ch", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!vj", name = "ah", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!vj", name = "I", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas7;

	@OriginalMember(owner = "client!vj", name = "Id", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!vj", name = "ge", descriptor = "I")
	public final int anInt7156;

	@OriginalMember(owner = "client!vj", name = "U", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!vj", name = "hc", descriptor = "J")
	private final long aLong215;

	@OriginalMember(owner = "client!vj", name = "A", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!vj", name = "mf", descriptor = "I")
	public final int anInt7177;

	@OriginalMember(owner = "client!vj", name = "Af", descriptor = "Z")
	public boolean aBoolean610;

	@OriginalMember(owner = "client!vj", name = "Bf", descriptor = "Z")
	private boolean aBoolean611;

	@OriginalMember(owner = "client!vj", name = "Sf", descriptor = "Z")
	public boolean aBoolean617;

	@OriginalMember(owner = "client!vj", name = "lf", descriptor = "Z")
	public boolean aBoolean607;

	@OriginalMember(owner = "client!vj", name = "Df", descriptor = "Z")
	private boolean aBoolean613;

	@OriginalMember(owner = "client!vj", name = "ef", descriptor = "Z")
	public boolean aBoolean605;

	@OriginalMember(owner = "client!vj", name = "Nf", descriptor = "Z")
	private final boolean aBoolean616;

	@OriginalMember(owner = "client!vj", name = "Wd", descriptor = "Lclient!rv;")
	public final Class221 aClass221_1;

	@OriginalMember(owner = "client!vj", name = "re", descriptor = "Lclient!cv;")
	public final Class45 aClass45_1;

	@OriginalMember(owner = "client!vj", name = "he", descriptor = "Lclient!rf;")
	private final Class214 aClass214_1;

	@OriginalMember(owner = "client!vj", name = "ae", descriptor = "Lclient!ra;")
	private Class3_Sub21_Sub1 aClass3_Sub21_Sub1_1;

	@OriginalMember(owner = "client!vj", name = "Ud", descriptor = "Lclient!ad;")
	private final Class5 aClass5_1;

	static {
		new Class189("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;ILclient!li;)V")
	public Class172_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class143 arg4) {
		super(arg0, arg2);
		new Class244();
		new Class11(16);
		this.aClass243_45 = new Class243();
		this.aClass243_46 = new Class243();
		this.aClass243_47 = new Class243();
		this.aClass243_48 = new Class243();
		this.aClass243_49 = new Class243();
		this.aClass243_50 = new Class243();
		this.aClass243_51 = new Class243();
		this.aBoolean600 = true;
		this.aFloat78 = -1.0F;
		this.aFloat81 = 3584.0F;
		this.anInt7172 = 0;
		this.aFloat76 = 1.0F;
		this.aFloatArray26 = new float[4];
		this.aFloat87 = 1.0F;
		this.anInt7178 = 0;
		this.anInt7179 = 0;
		this.aFloatArray27 = new float[4];
		this.anInt7196 = 50;
		this.aClass3_Sub8Array3 = new Class3_Sub8[Static85.anInt2105];
		this.anInt7173 = -1;
		this.anInt7170 = 0;
		this.anInt7185 = 512;
		this.anInt7193 = -1;
		this.aFloatArray28 = new float[4];
		this.aFloatArray29 = new float[16];
		this.anInt7203 = 0;
		this.anInt7188 = -1;
		this.anInt7202 = 0;
		this.aFloat86 = 3000.0F;
		this.anInt7201 = 3584;
		this.aFloat84 = 1.0F;
		this.anInt7197 = 0;
		this.aFloat91 = 1.0F;
		this.anInt7194 = 0;
		this.aFloatArray30 = new float[4];
		this.anInt7198 = 8448;
		this.aFloat90 = 0.0F;
		this.anInt7187 = 8448;
		this.anInt7200 = 512;
		this.anInt7176 = -1;
		this.anInt7199 = -1;
		this.aFloat85 = 1.0F;
		this.anInt7190 = 0;
		this.anInt7205 = 0;
		this.aFloat95 = -1.0F;
		this.aFloat94 = 3584.0F;
		this.aCanvas8 = this.aCanvas7 = arg1;
		this.anInt7156 = arg3;
		try {
			if (Static245.aBoolean411 == null || !Static245.aBoolean411) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static245.aBoolean411 = Boolean.TRUE;
				} else {
					@Pc(244) String local244 = System.getProperty("os.name").toLowerCase();
					if (!local244.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local244.startsWith("linux") || local244.startsWith("sunos")) {
						System.load(arg4.method3410("libjaggl.so").toString());
					} else if (local244.startsWith("mac")) {
						System.load(arg4.method3410("libjaggl.jnilib").toString());
					} else if (local244.startsWith("win")) {
						System.load(arg4.method3410("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static245.aBoolean411 = Boolean.TRUE;
				}
			}
			if (Static245.aBoolean411 == null || !Static245.aBoolean411) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong214 = this.aLong215 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt7156);
			if (this.aLong215 == 0L) {
				throw new RuntimeException("");
			}
			this.method5604();
			@Pc(350) int local350 = this.method5573();
			if (local350 != 0) {
				throw new RuntimeException("");
			}
			this.anInt7177 = this.aBoolean621 ? 33639 : 5121;
			@Pc(377) int local377;
			if (this.aString63.indexOf("radeon") != -1) {
				local377 = 0;
				@Pc(379) boolean local379 = false;
				@Pc(381) boolean local381 = false;
				@Pc(390) String[] local390 = Static379.method4945(this.aString63.replace('/', ' '), ' ');
				for (@Pc(392) int local392 = 0; local392 < local390.length; local392++) {
					@Pc(397) String local397 = local390[local392];
					try {
						if (local397.length() > 0) {
							if (local397.charAt(0) == 'x' && local397.length() >= 3 && Static406.method5236(local397.substring(1, 3))) {
								local397 = local397.substring(1);
								local381 = true;
							}
							if (local397.equals("hd")) {
								local379 = true;
							} else {
								if (local397.startsWith("hd")) {
									local397 = local397.substring(2);
									local379 = true;
								}
								if (local397.length() >= 4 && Static406.method5236(local397.substring(0, 4))) {
									local377 = Static247.method3714(local397.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(466) Exception local466) {
					}
				}
				if (!local381 && !local379) {
					if (local377 >= 7000 && local377 <= 9250) {
						this.aBoolean610 = false;
					}
					if (local377 >= 7000 && local377 <= 7999) {
						this.aBoolean611 = false;
					}
				}
				if (!local379 || local377 < 4000) {
					this.aBoolean617 = false;
				}
				this.aBoolean607 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean613 = this.aBoolean611;
			}
			if (this.aString64.indexOf("intel") != -1) {
				this.aBoolean605 = false;
			}
			this.aBoolean616 = !this.aString64.equals("s3 graphics");
			if (this.aBoolean611) {
				try {
					@Pc(550) int[] local550 = new int[1];
					OpenGL.glGenBuffersARB(1, local550, 0);
				} catch (@Pc(556) Throwable local556) {
					throw new RuntimeException("");
				}
			}
			Static403.method5213(false, true);
			this.aBoolean598 = true;
			this.aClass221_1 = new Class221(this, super.anInterface5_8);
			this.method5547();
			this.aClass45_1 = new Class45(this);
			this.aClass214_1 = new Class214(this);
			if (this.aClass214_1.method4581()) {
				this.aClass3_Sub21_Sub1_1 = new Class3_Sub21_Sub1(this);
				if (!this.aClass3_Sub21_Sub1_1.method4533()) {
					this.aClass3_Sub21_Sub1_1.method4528();
					this.aClass3_Sub21_Sub1_1 = null;
				}
			}
			this.aClass5_1 = new Class5(this);
			this.method5621();
			this.method5546();
			OpenGL.glClear(16640);
			local377 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(635) Exception local635) {
					if (local377++ > 5) {
						throw new RuntimeException("");
					}
					Static360.method4758(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(652) Throwable local652) {
			local652.printStackTrace();
			this.method5529();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5532(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas7) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "(I)V")
	private void method5546() {
		if (this.aCanvas8 == null) {
			this.anInt7035 = this.anInt7033 = 0;
		} else {
			@Pc(13) Dimension local13 = this.aCanvas8.getSize();
			this.anInt7033 = local13.height;
			this.anInt7035 = local13.width;
		}
		if (this.anInterface12_2 == null) {
			this.anInt7068 = this.anInt7033;
			this.anInt7054 = this.anInt7035;
			this.method5552();
		}
		this.method5577();
		this.va();
	}

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "()Lclient!ia;")
	@Override
	public Class107 method5495() {
		return this.aClass107_Sub1_1;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(Z)V")
	private void method5547() {
		this.aClass107_Sub1_4 = new Class107_Sub1();
		this.aClass107_Sub1_3 = new Class107_Sub1();
		this.aClass112Array1 = new Class112[this.anInt7195];
		this.aClass112_Sub2_5 = new Class112_Sub2(this, 3553, 6408, 1, 1);
		this.aClass112_Sub2_6 = new Class112_Sub2(this, 3553, 6408, 1, 1);
		this.aClass112_Sub2_7 = new Class112_Sub2(this, 3553, 6408, 1, 1);
		this.aClass9_Sub2_10 = new Class9_Sub2(this);
		this.aClass9_Sub2_4 = new Class9_Sub2(this);
		this.aClass9_Sub2_8 = new Class9_Sub2(this);
		this.aClass9_Sub2_3 = new Class9_Sub2(this);
		this.aClass9_Sub2_5 = new Class9_Sub2(this);
		this.aClass9_Sub2_6 = new Class9_Sub2(this);
		this.aClass9_Sub2_7 = new Class9_Sub2(this);
		this.aClass9_Sub2_2 = new Class9_Sub2(this);
		this.aClass9_Sub2_1 = new Class9_Sub2(this);
		this.aClass9_Sub2_9 = new Class9_Sub2(this);
		if (this.aBoolean605) {
			this.aClass259_7 = new Class259(this);
			this.aClass259_6 = new Class259(this);
		}
	}

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "()Z")
	@Override
	public boolean method5491() {
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "()V")
	@Override
	public void method5515() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
	@Override
	public void method5497(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "(I)V")
	private void method5548() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray29, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)V")
	@Override
	public synchronized void method5544(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub34 local19;
		while (!this.aClass243_46.method5211()) {
			local19 = (Class3_Sub34) this.aClass243_46.method5204();
			Static453.anIntArray533[local11++] = (int) local19.aLong234;
			this.anInt7168 -= local19.anInt5289;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static453.anIntArray533, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static453.anIntArray533, 0);
			local11 = 0;
		}
		while (!this.aClass243_47.method5211()) {
			local19 = (Class3_Sub34) this.aClass243_47.method5204();
			Static453.anIntArray533[local11++] = (int) local19.aLong234;
			this.anInt7169 -= local19.anInt5289;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static453.anIntArray533, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static453.anIntArray533, 0);
			local11 = 0;
		}
		while (!this.aClass243_48.method5211()) {
			local19 = (Class3_Sub34) this.aClass243_48.method5204();
			Static453.anIntArray533[local11++] = local19.anInt5289;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static453.anIntArray533, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static453.anIntArray533, 0);
			local11 = 0;
		}
		while (!this.aClass243_49.method5211()) {
			local19 = (Class3_Sub34) this.aClass243_49.method5204();
			Static453.anIntArray533[local11++] = (int) local19.aLong234;
			this.anInt7167 -= local19.anInt5289;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static453.anIntArray533, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static453.anIntArray533, 0);
		}
		while (!this.aClass243_45.method5211()) {
			local19 = (Class3_Sub34) this.aClass243_45.method5204();
			OpenGL.glDeleteLists((int) local19.aLong234, local19.anInt5289);
		}
		@Pc(216) Class3 local216;
		while (!this.aClass243_50.method5211()) {
			local216 = this.aClass243_50.method5204();
			OpenGL.glDeleteProgramARB((int) local216.aLong234);
		}
		while (!this.aClass243_51.method5211()) {
			local216 = this.aClass243_51.method5204();
			OpenGL.glDeleteObjectARB(local216.aLong234);
		}
		while (!this.aClass243_45.method5211()) {
			local19 = (Class3_Sub34) this.aClass243_45.method5204();
			OpenGL.glDeleteLists((int) local19.aLong234, local19.anInt5289);
		}
		this.aClass221_1.method4761();
		if (this.FA() > 100663296 && this.aLong216 + 60000L < Static118.method1934()) {
			System.gc();
			this.aLong216 = Static118.method1934();
		}
		this.anInt7161 = local9;
	}

	@OriginalMember(owner = "client!vj", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		@Pc(6) int local6 = this.anInt7192;
		this.anInt7192 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "()I")
	@Override
	public int g() {
		@Pc(6) int local6 = this.anInt7174;
		this.anInt7174 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(BI)I")
	public int method5549(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!vj", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean615) {
			throw new RuntimeException("");
		}
		this.anInt7199 = arg1;
		this.anInt7190 = arg3;
		this.anInt7193 = arg2;
		this.anInt7182 = arg0;
		this.aClass5_1.aClass72_Sub6_1.method5046();
		this.method5588();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZI)V")
	public synchronized void method5550(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub34 local14 = new Class3_Sub34(arg1);
		local14.aLong234 = arg0;
		this.aClass243_47.method5198(local14);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!u;I)V")
	public void method5551(@OriginalArg(0) Interface10 arg0) {
		if (arg0 != this.anInterface10_4) {
			if (this.aBoolean611) {
				OpenGL.glBindBufferARB(34963, arg0.method5073());
			}
			this.anInterface10_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
	private void method5552() {
		OpenGL.glViewport(this.anInt7178, this.anInt7172, this.anInt7054, this.anInt7068);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)V")
	public synchronized void method5553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class3_Sub34 local14 = new Class3_Sub34(arg0);
		local14.aLong234 = arg1;
		this.aClass243_46.method5198(local14);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class159 method5519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class159_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)Lclient!rd;")
	public Class112_Sub4 method5554() {
		return this.aClass23_Sub1_1 == null ? null : this.aClass23_Sub1_1.method4740();
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "()V")
	@Override
	public void method5476() {
		if (this.aClass3_Sub21_Sub1_1 != null && this.aClass3_Sub21_Sub1_1.method4525()) {
			this.aClass214_1.method4589(this.aClass3_Sub21_Sub1_1);
			this.aClass221_1.method4754();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5473(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5515();
	}

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "(I)V")
	public void method5555() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!wq;I)V")
	public void method5556(@OriginalArg(0) Interface12 arg0) {
		if (this.aBoolean606) {
			this.method5600(arg0);
			this.method5575(arg0);
		} else if (this.anInt7166 >= 0 && arg0 == this.anInterface12Array3[this.anInt7166]) {
			this.anInterface12Array3[this.anInt7166--] = null;
			arg0.method5433();
			if (this.anInt7166 >= 0) {
				this.anInterface12_1 = this.anInterface12_2 = this.anInterface12Array3[this.anInt7166];
				this.anInterface12_1.method5435();
			} else {
				this.anInterface12_1 = this.anInterface12_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vj", name = "XA", descriptor = "(IFFFFF)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt7176 != arg0;
		if (local15 || this.aFloat78 != arg1 || arg2 != this.aFloat95) {
			this.aFloat78 = arg1;
			this.anInt7176 = arg0;
			this.aFloat95 = arg2;
			if (local15) {
				this.aFloat84 = (float) (this.anInt7176 & 0xFF0000) / 1.671168E7F;
				this.aFloat76 = (float) (this.anInt7176 & 0xFF) / 255.0F;
				this.aFloat85 = (float) (this.anInt7176 & 0xFF00) / 65280.0F;
				this.method5613();
			}
			this.method5601();
		}
		if (arg3 == this.aFloatArray30[0] && arg4 == this.aFloatArray30[1] && this.aFloatArray30[2] == arg5) {
			return;
		}
		this.aFloatArray30[0] = arg3;
		this.aFloatArray30[1] = arg4;
		this.aFloatArray30[2] = arg5;
		this.aFloatArray28[2] = -arg5;
		this.aFloatArray28[1] = -arg4;
		this.aFloatArray28[0] = -arg3;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray26[2] = arg5 * local142;
		this.aFloatArray26[1] = local142 * arg4;
		this.aFloatArray26[0] = local142 * arg3;
		this.aFloatArray27[1] = -this.aFloatArray26[1];
		this.aFloatArray27[0] = -this.aFloatArray26[0];
		this.aFloatArray27[2] = -this.aFloatArray26[2];
		this.method5609();
		this.anInt7191 = (int) (arg5 * 256.0F / arg4);
		this.anInt7183 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([Lclient!c;Lclient!sh;Lclient!ia;[Lclient!lc;I)V")
	@Override
	public void method5522(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(2) Class107 arg2, @OriginalArg(3) Class6_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method5509(arg0, arg2, arg3, arg4);
		this.method5471(arg1);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "()V")
	@Override
	public void method5470() {
		this.aClass214_1.method4583();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FIFF)V")
	private void method5559(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean608) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg2, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean608 = true;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[BZII)Lclient!u;")
	public Interface10 method5560(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		return (Interface10) (this.aBoolean611 && (!arg2 || this.aBoolean613) ? new Class21_Sub1(this, 5123, arg1, arg0, arg2) : new Class121_Sub2(this, 5123, arg1, arg0));
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!sh;)V")
	@Override
	public void method5471(@OriginalArg(0) Class227 arg0) {
		this.aClass122_1.method3074(this, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5540(@OriginalArg(0) Canvas arg0) {
		this.aLong214 = 0L;
		this.aCanvas8 = null;
		if (arg0 == null || arg0 == this.aCanvas7) {
			this.aCanvas8 = this.aCanvas7;
			this.aLong214 = this.aLong215;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable2.get(arg0);
			this.aLong214 = local26;
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.aLong214 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong214);
		this.method5546();
	}

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "()Z")
	@Override
	public boolean method5513() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIBI)V")
	public void method5561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		this.anInt7162 = 0;
		while (arg0 > 1) {
			this.anInt7162++;
			arg0 >>= 0x1;
		}
		this.anInt7163 = 0x1 << this.anInt7162;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V")
	private void method5562() {
		if (this.aBoolean612 && this.aBoolean615 | this.anInt7173 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(Lclient!wq;I)V")
	public void method5563(@OriginalArg(0) Interface12 arg0) {
		if (this.anInt7165 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7165 >= 0) {
			this.anInterface12Array1[this.anInt7165].method5434();
		}
		this.anInterface12_1 = this.anInterface12Array1[++this.anInt7165] = arg0;
		this.anInterface12_1.method5432();
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5605();
		this.method5574(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method5526(@OriginalArg(0) Class3_Sub29 arg0) {
		this.aNativeHeap2 = ((Class3_Sub29_Sub1) arg0).aNativeHeap1;
		if (this.anInterface6_6 != null) {
			return;
		}
		@Pc(16) Class3_Sub7_Sub2 local16 = new Class3_Sub7_Sub2(80);
		if (this.aBoolean621) {
			local16.method2645(-1.0F);
			local16.method2645(-1.0F);
			local16.method2645(0.0F);
			local16.method2645(0.0F);
			local16.method2645(1.0F);
			local16.method2645(1.0F);
			local16.method2645(-1.0F);
			local16.method2645(0.0F);
			local16.method2645(1.0F);
			local16.method2645(1.0F);
			local16.method2645(1.0F);
			local16.method2645(1.0F);
			local16.method2645(0.0F);
			local16.method2645(1.0F);
			local16.method2645(0.0F);
			local16.method2645(-1.0F);
			local16.method2645(1.0F);
			local16.method2645(0.0F);
			local16.method2645(0.0F);
			local16.method2645(0.0F);
		} else {
			local16.method2643(-1.0F);
			local16.method2643(-1.0F);
			local16.method2643(0.0F);
			local16.method2643(0.0F);
			local16.method2643(1.0F);
			local16.method2643(1.0F);
			local16.method2643(-1.0F);
			local16.method2643(0.0F);
			local16.method2643(1.0F);
			local16.method2643(1.0F);
			local16.method2643(1.0F);
			local16.method2643(1.0F);
			local16.method2643(0.0F);
			local16.method2643(1.0F);
			local16.method2643(0.0F);
			local16.method2643(-1.0F);
			local16.method2643(1.0F);
			local16.method2643(0.0F);
			local16.method2643(0.0F);
			local16.method2643(0.0F);
		}
		this.anInterface6_6 = this.method5586(false, local16.anInt3235, local16.aByteArray46, 20);
		this.aClass127_12 = new Class127(this.anInterface6_6, 5126, 3, 0);
		this.aClass127_11 = new Class127(this.anInterface6_6, 5126, 2, 12);
		this.aClass122_1.method3076(this);
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
	@Override
	public void method5510(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt7153 = arg0;
		this.aClass221_1.method4754();
	}

	@OriginalMember(owner = "client!vj", name = "SA", descriptor = "(IIIIII)Z")
	@Override
	public boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = (float) arg2 * this.aClass107_Sub1_4.aFloat39 + (float) arg0 * this.aClass107_Sub1_4.aFloat45 + (float) arg1 * this.aClass107_Sub1_4.aFloat46 + this.aClass107_Sub1_4.aFloat35;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass107_Sub1_4.aFloat39 * (float) arg5 + this.aClass107_Sub1_4.aFloat46 * (float) arg4 + (float) arg3 * this.aClass107_Sub1_4.aFloat45 + this.aClass107_Sub1_4.aFloat35;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt7196 && local59 < (float) this.anInt7196 || !(!(local28 > (float) this.anInt7201) || !((float) this.anInt7201 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) (((float) arg1 * this.aClass107_Sub1_4.aFloat41 + this.aClass107_Sub1_4.aFloat43 * (float) arg0 + this.aClass107_Sub1_4.aFloat36 * (float) arg2 + this.aClass107_Sub1_4.aFloat42) * (float) this.anInt7185 / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt7185 * ((float) arg5 * this.aClass107_Sub1_4.aFloat36 + this.aClass107_Sub1_4.aFloat41 * (float) arg4 + (float) arg3 * this.aClass107_Sub1_4.aFloat43 + this.aClass107_Sub1_4.aFloat42) / local59);
		if (this.aFloat82 > (float) local123 && (float) local155 < this.aFloat82 || this.aFloat93 < (float) local123 && (float) local155 > this.aFloat93) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass107_Sub1_4.aFloat44 + (float) arg1 * this.aClass107_Sub1_4.aFloat38 + this.aClass107_Sub1_4.aFloat37 * (float) arg0 + this.aClass107_Sub1_4.aFloat40 * (float) arg2) * (float) this.anInt7200 / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt7200 * (this.aClass107_Sub1_4.aFloat44 + (float) arg3 * this.aClass107_Sub1_4.aFloat37 + this.aClass107_Sub1_4.aFloat38 * (float) arg4 + (float) arg5 * this.aClass107_Sub1_4.aFloat40) / local59);
			return (!(this.aFloat80 > (float) local213) || !(this.aFloat80 > (float) local245)) && (!(this.aFloat88 < (float) local213) || !((float) local245 > this.aFloat88));
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLclient!wq;)V")
	public void method5564(@OriginalArg(1) Interface12 arg0) {
		if (this.anInt7164 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7164 >= 0) {
			this.anInterface12Array2[this.anInt7164].method5431();
		}
		this.anInterface12_2 = this.anInterface12Array2[++this.anInt7164] = arg0;
		this.anInterface12_2.method5430();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class58 method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static338.method4508(arg0, arg2, this, arg1, arg3);
	}

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "(I)V")
	private void method5565() {
		if (this.anInt7181 != 3) {
			this.anInt7181 = 3;
			this.method5619();
			this.method5571();
			this.anInt7171 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "(I)V")
	private void method5566() {
		if (this.aBoolean608) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean608 = false;
		}
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)V")
	private void method5567() {
		@Pc(9) int local9;
		for (local9 = 0; local9 < this.bf; local9++) {
			@Pc(15) Class3_Sub8 local15 = this.aClass3_Sub8Array3[local9];
			@Pc(19) int local19 = local9 + 16386;
			Static93.aFloatArray5[0] = local15.method4404();
			Static93.aFloatArray5[1] = local15.method4397();
			Static93.aFloatArray5[2] = local15.method4395();
			Static93.aFloatArray5[3] = 1.0F;
			OpenGL.glLightfv(local19, 4611, Static93.aFloatArray5, 0);
			@Pc(53) int local53 = local15.method4402();
			@Pc(59) float local59 = local15.method4399() / 255.0F;
			Static93.aFloatArray5[0] = (float) (local53 >> 16 & 0xFF) * local59;
			Static93.aFloatArray5[1] = (float) (local53 >> 8 & 0xFF) * local59;
			Static93.aFloatArray5[2] = (float) (local53 & 0xFF) * local59;
			OpenGL.glLightfv(local19, 4609, Static93.aFloatArray5, 0);
			OpenGL.glLightf(local19, 4617, 1.0F / (float) (local15.method4400() * local15.method4400()));
			OpenGL.glEnable(local19);
		}
		while (this.anInt7180 > local9) {
			OpenGL.glDisable(local9 + 16386);
			local9++;
		}
		this.anInt7180 = this.bf;
	}

	@OriginalMember(owner = "client!vj", name = "pa", descriptor = "(IIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > this.anInt7054) {
			arg2 = this.anInt7054;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt7068) {
			arg3 = this.anInt7068;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt7205 = arg3;
		this.anInt7179 = arg0;
		this.anInt7202 = arg1;
		this.anInt7194 = arg2;
		OpenGL.glEnable(3089);
		this.method5606();
		this.method5576();
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V")
	@Override
	public void method5521(@OriginalArg(0) int arg0) {
		this.method5604();
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)V")
	public synchronized void method5568(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub34 local8 = new Class3_Sub34(arg0);
		this.aClass243_48.method5198(local8);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)V")
	public void method5569(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt7204) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt7204 = arg0;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5490(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static39.aFloat4 = arg2;
		Static62.aFloat9 = arg0;
		Static104.aFloat15 = arg1;
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(B)V")
	public void method5570() {
		if (this.anInt7171 == 2) {
			return;
		}
		this.method5608();
		this.method5583(false);
		this.method5581(false);
		this.method5623(false);
		this.method5624(false);
		this.method5610(-2);
		this.anInt7171 = 2;
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(B)V")
	private void method5571() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass107_Sub1_4.method3750(), 0);
		if (this.aBoolean615) {
			this.aClass5_1.aClass72_Sub6_1.method5046();
		}
		this.method5609();
		this.method5567();
	}

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "(ILclient!ea;II)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class58_Sub2 local6 = (Class58_Sub2) arg1;
		@Pc(9) Class112_Sub2_Sub1 local9 = local6.aClass112_Sub2_Sub1_4;
		this.method5570();
		this.method5630(local6.aClass112_Sub2_Sub1_4);
		this.method5574(1);
		this.method5591(7681, 8448);
		this.method5561(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat33 / (float) local9.anInt4737;
		@Pc(46) float local46 = local9.aFloat34 / (float) local9.anInt4736;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt7179 - arg2) * local39, local46 * (float) (this.anInt7202 - arg3));
		OpenGL.glVertex2i(this.anInt7179, this.anInt7202);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7179 - arg2), local46 * (float) (this.anInt7205 - arg3));
		OpenGL.glVertex2i(this.anInt7179, this.anInt7205);
		OpenGL.glTexCoord2f((float) (this.anInt7194 - arg2) * local39, local46 * (float) (this.anInt7205 - arg3));
		OpenGL.glVertex2i(this.anInt7194, this.anInt7205);
		OpenGL.glTexCoord2f((float) (this.anInt7194 - arg2) * local39, (float) (this.anInt7202 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt7194, this.anInt7202);
		OpenGL.glEnd();
		this.method5561(768, 5890, 0);
	}

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "()V")
	@Override
	public void method5518() {
		this.method5624(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "()Z")
	@Override
	public boolean method5486() {
		return this.aClass3_Sub21_Sub1_1 != null && (this.anInt7156 <= 1 || this.aBoolean622);
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(III)V")
	public synchronized void method5572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub34 local12 = new Class3_Sub34(arg0);
		local12.aLong234 = arg1;
		this.aClass243_49.method5198(local12);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[Lclient!fk;)V")
	@Override
	public void method5485(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass3_Sub8Array3[local3] = arg1[local3];
		}
		this.bf = arg0;
		if (this.anInt7181 != 1) {
			this.method5567();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class8 method5478(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class8_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "()Z")
	@Override
	public boolean method5474() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class8 method5481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class8_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "(I)I")
	private int method5573() {
		this.aString64 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString63 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString64.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString64.indexOf("brian paul") != -1 || this.aString64.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(47) String local47 = OpenGL.glGetString(7938);
		@Pc(55) String[] local55 = Static379.method4945(local47.replace('.', ' '), ' ');
		if (local55.length >= 2) {
			try {
				@Pc(67) int local67 = Static247.method3714(local55[0]);
				@Pc(73) int local73 = Static247.method3714(local55[1]);
				this.anInt7206 = local73 + local67 * 10;
			} catch (@Pc(82) NumberFormatException local82) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt7206 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(122) int[] local122 = new int[1];
		OpenGL.glGetIntegerv(34018, local122, 0);
		this.anInt7195 = local122[0];
		OpenGL.glGetIntegerv(34929, local122, 0);
		this.anInt7175 = local122[0];
		OpenGL.glGetIntegerv(34930, local122, 0);
		this.anInt7184 = local122[0];
		if (this.anInt7195 < 2 || this.anInt7175 < 2 || this.anInt7184 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean621 = NativeStream.a();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean611 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean624 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean609 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean602 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean623 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean610 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean607 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean599 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean617 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean619 = false;
		this.aBoolean605 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean606 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean601 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean622 = this.aBoolean601 & this.aBoolean606;
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)V")
	public void method5574(@OriginalArg(0) int arg0) {
		if (this.anInt7186 == arg0) {
			return;
		}
		@Pc(10) boolean local10;
		@Pc(8) byte local8;
		if (arg0 == 1) {
			local8 = 1;
			local10 = true;
		} else if (arg0 == 2) {
			local8 = 2;
			local10 = false;
		} else if (arg0 == 128) {
			local10 = true;
			local8 = 3;
		} else {
			local8 = 0;
			local10 = false;
		}
		if (!this.aBoolean620) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean620 = true;
		}
		if (local10 != this.aBoolean604) {
			if (local10) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean604 = local10;
		}
		if (local8 != this.anInt7189) {
			if (local8 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local8 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local8 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt7189 = local8;
		}
		this.anInt7171 &= 0xFFFFFFE3;
		this.anInt7186 = arg0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!wq;)V")
	public void method5575(@OriginalArg(1) Interface12 arg0) {
		if (this.anInt7164 < 0 || this.anInterface12Array2[this.anInt7164] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface12Array2[this.anInt7164--] = null;
		arg0.method5431();
		if (this.anInt7164 < 0) {
			this.anInterface12_2 = null;
		} else {
			this.anInterface12_2 = this.anInterface12Array2[this.anInt7164];
			this.anInterface12_2.method5430();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!c;Lclient!sh;Lclient!ia;Lclient!lc;I)V")
	@Override
	public void method5520(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(2) Class107 arg2, @OriginalArg(3) Class6_Sub5 arg3) {
		arg0.method5695(arg2, arg3, 0);
		this.method5471(arg1);
	}

	@OriginalMember(owner = "client!vj", name = "W", descriptor = "()I")
	@Override
	public int W() {
		return this.anInt7201;
	}

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "(I)V")
	private void method5576() {
		if (this.anInt7179 <= this.anInt7194 && this.anInt7205 >= this.anInt7202) {
			OpenGL.glScissor(this.anInt7179 + this.anInt7178, this.anInt7068 + this.anInt7172 + -this.anInt7205, this.anInt7194 - this.anInt7179, this.anInt7205 - this.anInt7202);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!we;Z)Lclient!f;")
	@Override
	public Class8 method5542(@OriginalArg(0) Class264 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt7502 * arg0.anInt7501];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray93 == null) {
			for (local21 = 0; local21 < arg0.anInt7501; local21++) {
				for (local25 = 0; local25 < arg0.anInt7502; local25++) {
					@Pc(83) int local83 = arg0.anIntArray523[arg0.aByteArray94[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt7501; local21++) {
				for (local25 = 0; local25 < arg0.anInt7502; local25++) {
					local12[local16++] = arg0.aByteArray93[local14] << 24 | arg0.anIntArray523[arg0.aByteArray94[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(122) Class8 local122 = this.method5478(local12, arg0.anInt7502, arg0.anInt7502, arg0.anInt7501);
		local122.ka(arg0.anInt7503, arg0.anInt7504, arg0.anInt7505, arg0.anInt7506);
		return local122;
	}

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "(I)V")
	public void method5577() {
		if (this.anInt7181 != 0) {
			this.anInt7171 &= 0xFFFFFFE0;
			this.anInt7181 = 0;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZIZZ)V")
	public void method5578(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt7207 != arg0) {
			if (arg0 < 0) {
				this.method5566();
				this.method5630(null);
				this.method5629(0);
				if (!this.aBoolean615) {
					this.aClass5_1.method31(0, arg2, arg1);
				}
			} else {
				@Pc(37) Class112_Sub2 local37 = this.aClass221_1.method4759(arg0);
				@Pc(43) Class76 local43 = super.anInterface5_8.method3918(arg0);
				if (local43.aByte41 == 0 && local43.aByte42 == 0) {
					this.method5566();
				} else {
					@Pc(59) int local59 = local43.aBoolean208 ? 64 : 128;
					@Pc(63) int local63 = local59 * 50;
					this.method5559(0.0F, (float) (local43.aByte41 * (this.anInt7161 % local63)) / (float) local63, (float) (local43.aByte42 * (this.anInt7161 % local63)) / (float) local63);
				}
				if (this.aBoolean615) {
					this.aClass5_1.method31(3, arg2, arg1);
					this.method5630(local37);
					this.method5629(local43.anInt2415);
				} else {
					this.aClass5_1.method31(local43.aByte46, arg2, arg1);
					this.aClass5_1.method30(local43.anInt2414, local43.aByte40);
					if (!this.aClass5_1.method28(local37, local43.anInt2415)) {
						this.method5630(local37);
						this.method5629(local43.anInt2415);
					}
				}
			}
			this.anInt7207 = arg0;
		}
		this.anInt7171 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!vj", name = "ia", descriptor = "(III[I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg1 * this.aClass107_Sub1_4.aFloat46 + (float) arg0 * this.aClass107_Sub1_4.aFloat45 + this.aClass107_Sub1_4.aFloat39 * (float) arg2 + this.aClass107_Sub1_4.aFloat35;
		if ((float) this.anInt7196 > local28 || (float) this.anInt7201 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt7185 * (this.aClass107_Sub1_4.aFloat42 + this.aClass107_Sub1_4.aFloat36 * (float) arg2 + (float) arg0 * this.aClass107_Sub1_4.aFloat43 + this.aClass107_Sub1_4.aFloat41 * (float) arg1) / local28);
		@Pc(117) int local117 = (int) ((this.aClass107_Sub1_4.aFloat38 * (float) arg1 + this.aClass107_Sub1_4.aFloat37 * (float) arg0 + this.aClass107_Sub1_4.aFloat40 * (float) arg2 + this.aClass107_Sub1_4.aFloat44) * (float) this.anInt7200 / local28);
		if ((float) local85 >= this.aFloat82 && this.aFloat93 >= (float) local85 && this.aFloat80 <= (float) local117 && this.aFloat88 >= (float) local117) {
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat82);
			arg3[1] = (int) ((float) local117 - this.aFloat80);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZII)V")
	public void method5579(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.method5578(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "()Lclient!ia;")
	@Override
	public Class107 method5524() {
		return new Class107_Sub1();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5488(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IF)V")
	public void method5580(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat87) {
			this.aFloat87 = arg0;
			if (this.anInt7181 == 3) {
				this.method5619();
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5605();
		this.method5574(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V")
	public void method5581(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean618) {
			this.aBoolean618 = arg0;
			this.method5589();
			this.anInt7171 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!vj", name = "S", descriptor = "()V")
	@Override
	public void S() {
		this.aBoolean615 = false;
		this.aClass5_1.method31(0, false, false);
		this.method5588();
		this.method5562();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZB)V")
	public void method5583(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean612 != arg0) {
			this.aBoolean612 = arg0;
			this.method5562();
			this.anInt7171 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "()Z")
	@Override
	public boolean method5496() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(Z)V")
	private void method5584() {
		OpenGL.glDepthMask(this.aBoolean603 && this.aBoolean600);
	}

	@OriginalMember(owner = "client!vj", name = "JA", descriptor = "(II)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt7196 && arg1 == this.anInt7201) {
			return;
		}
		this.anInt7196 = arg0;
		this.anInt7201 = arg1;
		this.method5596();
		this.method5588();
		if (this.anInt7181 == 3) {
			this.method5619();
		} else if (this.anInt7181 == 2) {
			this.method5548();
			return;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!wq;Z)V")
	public void method5585(@OriginalArg(0) Interface12 arg0) {
		if (this.aBoolean606) {
			this.method5563(arg0);
			this.method5564(arg0);
		} else if (this.anInt7166 < 3) {
			if (this.anInt7166 >= 0) {
				this.anInterface12Array3[this.anInt7166].method5433();
			}
			this.anInterface12_1 = this.anInterface12_2 = this.anInterface12Array3[++this.anInt7166] = arg0;
			this.anInterface12_1.method5435();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vj", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7199 = arg1;
		this.anInt7182 = arg0;
		this.anInt7193 = arg2;
		this.aBoolean615 = true;
		this.anInt7190 = arg3;
		this.aClass5_1.method31(3, false, false);
		this.aClass5_1.aClass72_Sub6_1.method5046();
		this.method5588();
		this.method5562();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI[BII)Lclient!nh;")
	public Interface6 method5586(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		return (Interface6) (this.aBoolean611 && (!arg0 || this.aBoolean613) ? new Class21_Sub2(this, arg3, arg2, arg1, arg0) : new Class121_Sub1(this, arg3, arg2, arg1));
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(IIIIII)Lclient!bi;")
	@Override
	public Class23 method5536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean599 ? new Class23_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!vj", name = "IA", descriptor = "(IIII)[I")
	@Override
	public int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt7068 - local12 - arg1, arg2, 1, 32993, this.anInt7177, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "()V")
	@Override
	public void method5477() {
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(Z)V")
	public void method5587() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "(B)V")
	private void method5588() {
		@Pc(59) int local59;
		if (this.aBoolean615) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local59 = this.anInt7199;
		} else {
			this.aFloat79 = (float) (this.anInt7201 - this.anInt7203) - this.aFloat90;
			this.aFloat89 = this.aFloat79 - this.aFloat91 * (float) this.anInt7173;
			if ((float) this.anInt7196 > this.aFloat89) {
				this.aFloat89 = this.anInt7196;
			}
			OpenGL.glFogf(2915, this.aFloat89);
			OpenGL.glFogf(2916, this.aFloat79);
			local59 = this.anInt7188;
		}
		Static254.aFloatArray12[0] = (float) (local59 & 0xFF0000) / 1.671168E7F;
		Static254.aFloatArray12[2] = (float) (local59 & 0xFF) / 255.0F;
		Static254.aFloatArray12[1] = (float) (local59 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static254.aFloatArray12, 0);
		if (this.aBoolean615) {
			this.aClass5_1.aClass72_Sub6_1.method5047();
		}
	}

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "(I)V")
	private void method5589() {
		if (this.aBoolean618 && !this.aBoolean614) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(Z)V")
	@Override
	public void method5541(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)I")
	@Override
	public int method5501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BII)V")
	public void method5591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7204 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(19) boolean local19 = false;
		if (this.anInt7198 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local19 = true;
			this.anInt7198 = arg0;
		}
		if (this.anInt7187 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local19 = true;
			this.anInt7187 = arg1;
		}
		if (local19) {
			this.anInt7171 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)Lclient!l;")
	@Override
	public Class3_Sub29 method5487() {
		@Pc(8) Class3_Sub29_Sub1 local8 = new Class3_Sub29_Sub1(78643200);
		this.aClass243_44.method5198(local8);
		return local8;
	}

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "()Z")
	@Override
	public boolean method5494() {
		if (this.aClass3_Sub21_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub21_Sub1_1.method4525()) {
			if (!this.aClass214_1.method4590(this.aClass3_Sub21_Sub1_1)) {
				return false;
			}
			this.aClass221_1.method4754();
		}
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIII)V")
	public void method5592(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "(Lclient!ia;)V")
	@Override
	public void m(@OriginalArg(0) Class107 arg0) {
		this.aClass107_Sub1_4 = (Class107_Sub1) arg0;
		this.aClass107_Sub1_3.method3748(this.aClass107_Sub1_4);
		if (this.anInt7181 != 1) {
			this.method5571();
		}
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(II)V")
	public void method5593(@OriginalArg(1) int arg0) {
		Static254.aFloatArray12[3] = (float) (arg0 >>> 24) / 255.0F;
		Static254.aFloatArray12[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static254.aFloatArray12[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static254.aFloatArray12[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static254.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!lc;I)V")
	@Override
	public void method5509(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) Class6_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method5695(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "(I)V")
	private void method5594() {
		if (this.anInt7181 != 2) {
			this.anInt7181 = 2;
			this.method5548();
			this.method5571();
			this.anInt7171 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method5605();
		this.method5574(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean624) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean624) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!vj", name = "FA", descriptor = "()I")
	@Override
	public int FA() {
		return this.anInt7167 + this.anInt7169 + this.anInt7168;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!mn;B)V")
	public void method5595(@OriginalArg(0) Class107_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method3750(), 0);
	}

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "(I)V")
	private void method5596() {
		@Pc(6) float[] local6 = this.aFloatArray29;
		@Pc(23) float local23 = (float) (-this.anInt7197 * this.anInt7196) / (float) this.anInt7185;
		@Pc(38) float local38 = (float) (this.anInt7196 * (this.anInt7054 - this.anInt7197)) / (float) this.anInt7185;
		@Pc(49) float local49 = (float) (this.anInt7196 * this.anInt7170) / (float) this.anInt7200;
		@Pc(64) float local64 = (float) (this.anInt7196 * (this.anInt7170 - this.anInt7068)) / (float) this.anInt7200;
		if (local23 == local38 || local49 == local64) {
			local6[6] = 0.0F;
			local6[1] = 0.0F;
			local6[15] = 1.0F;
			local6[0] = 1.0F;
			local6[13] = 0.0F;
			local6[8] = 0.0F;
			local6[2] = 0.0F;
			local6[5] = 1.0F;
			local6[12] = 0.0F;
			local6[3] = 0.0F;
			local6[10] = 1.0F;
			local6[4] = 0.0F;
			local6[11] = 0.0F;
			local6[9] = 0.0F;
			local6[14] = 0.0F;
			local6[7] = 0.0F;
		} else {
			@Pc(143) float local143 = (float) this.anInt7196 * 2.0F;
			local6[12] = 0.0F;
			local6[4] = 0.0F;
			local6[3] = 0.0F;
			local6[9] = (local49 + local64) / (-local64 + local49);
			local6[11] = -1.0F;
			local6[7] = 0.0F;
			local6[15] = 0.0F;
			local6[10] = this.aFloat92 = (float) -(this.anInt7201 + this.anInt7196) / (float) (this.anInt7201 - this.anInt7196);
			local6[1] = 0.0F;
			local6[8] = (local23 + local38) / (-local23 + local38);
			local6[14] = this.aFloat83 = -((float) this.anInt7201 * local143) / (float) (this.anInt7201 - this.anInt7196);
			local6[6] = 0.0F;
			local6[13] = 0.0F;
			local6[2] = 0.0F;
			local6[5] = local143 / (local49 - local64);
			local6[0] = local143 / (local38 - local23);
		}
		this.method5611();
	}

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "()F")
	@Override
	public float w() {
		return this.aFloat75;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5512() {
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIZLclient!jaggl/memory/NativeBuffer;I)Lclient!nh;")
	public Interface6 method5597(@OriginalArg(0) int arg0, @OriginalArg(3) NativeBuffer arg1, @OriginalArg(4) int arg2) {
		return (Interface6) (this.aBoolean611 ? new Class21_Sub2(this, arg2, arg1, arg0, false) : new Class121_Sub1(this, arg2, arg1));
	}

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "(I)V")
	public void method5598() {
		if (this.anInt7171 == 16) {
			return;
		}
		this.method5565();
		this.method5583(true);
		this.method5623(true);
		this.method5624(true);
		this.method5574(1);
		this.method5629(0);
		this.anInt7171 = 16;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIB)V")
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7178 = arg1;
		this.anInt7172 = arg0;
		this.method5552();
		this.method5576();
	}

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "()V")
	@Override
	protected void method5529() {
		for (@Pc(8) Class3 local8 = this.aClass243_44.method5208(); local8 != null; local8 = this.aClass243_44.method5203()) {
			((Class3_Sub29_Sub1) local8).method5012();
		}
		if (this.aClass214_1 != null) {
			this.aClass214_1.method4582();
		}
		if (this.anOpenGL1 != null) {
			this.method5614();
			@Pc(37) Enumeration local37 = this.aHashtable2.keys();
			while (local37.hasMoreElements()) {
				@Pc(42) Canvas local42 = (Canvas) local37.nextElement();
				@Pc(48) Long local48 = (Long) this.aHashtable2.get(local42);
				this.anOpenGL1.releaseSurface(local42, local48);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean598) {
			Static411.method5290(true, false);
			this.aBoolean598 = false;
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(ILclient!wq;)V")
	public void method5600(@OriginalArg(1) Interface12 arg0) {
		if (this.anInt7165 < 0 || this.anInterface12Array1[this.anInt7165] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface12Array1[this.anInt7165--] = null;
		arg0.method5434();
		if (this.anInt7165 < 0) {
			this.anInterface12_1 = null;
		} else {
			this.anInterface12_1 = this.anInterface12Array1[this.anInt7165];
			this.anInterface12_1.method5432();
		}
	}

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "(I)V")
	private void method5601() {
		Static254.aFloatArray12[2] = this.aFloat78 * this.aFloat76;
		Static254.aFloatArray12[3] = 1.0F;
		Static254.aFloatArray12[1] = this.aFloat78 * this.aFloat85;
		Static254.aFloatArray12[0] = this.aFloat78 * this.aFloat84;
		OpenGL.glLightfv(16384, 4609, Static254.aFloatArray12, 0);
		Static254.aFloatArray12[1] = this.aFloat85 * -this.aFloat95;
		Static254.aFloatArray12[2] = -this.aFloat95 * this.aFloat76;
		Static254.aFloatArray12[0] = this.aFloat84 * -this.aFloat95;
		Static254.aFloatArray12[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static254.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!mn;I)V")
	public void method5602(@OriginalArg(0) Class107_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method3750(), 0);
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(II)I")
	public int method5603(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
	@Override
	public int method5492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method5498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class58 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class58_Sub2 local6 = (Class58_Sub2) arg5;
		@Pc(9) Class112_Sub2_Sub1 local9 = local6.aClass112_Sub2_Sub1_4;
		this.method5570();
		this.method5630(local6.aClass112_Sub2_Sub1_4);
		this.method5574(1);
		this.method5591(7681, 8448);
		this.method5561(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat33 / (float) local9.anInt4737;
		@Pc(46) float local46 = local9.aFloat34 / (float) local9.anInt4736;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method5561(768, 5890, 0);
	}

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "()I")
	@Override
	public int method5531() {
		return 4;
	}

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "(I)V")
	private void method5604() {
		@Pc(9) int local9 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local9++ > 5) {
				throw new RuntimeException("");
			}
			Static360.method4758(1000L);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!eu;[Lclient!we;Z)Lclient!oa;")
	@Override
	public Class59 method5545(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class264[] arg1) {
		return new Class59_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "(B)V")
	private void method5605() {
		if (this.anInt7171 == 1) {
			return;
		}
		this.method5608();
		this.method5583(false);
		this.method5581(false);
		this.method5623(false);
		this.method5624(false);
		this.method5630(null);
		this.method5610(-2);
		this.method5629(1);
		this.anInt7171 = 1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5528(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "(I)V")
	private void method5606() {
		this.aFloat82 = this.anInt7179 - this.anInt7197;
		this.aFloat88 = this.anInt7205 - this.anInt7170;
		this.aFloat93 = this.anInt7194 - this.anInt7197;
		this.aFloat80 = this.anInt7202 - this.anInt7170;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IFFFF)V")
	public void method5607(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static254.aFloatArray12[1] = arg3;
		Static254.aFloatArray12[2] = arg2;
		Static254.aFloatArray12[3] = arg1;
		Static254.aFloatArray12[0] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static254.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "(I)V")
	private void method5608() {
		if (this.anInt7181 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt7054 > 0 && this.anInt7068 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt7054, (double) this.anInt7068, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt7171 &= 0xFFFFFFE7;
		this.anInt7181 = 1;
	}

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "(B)V")
	public void method5609() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray26, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray27, 0);
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(II)V")
	public void method5610(@OriginalArg(1) int arg0) {
		this.method5579(true, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "C", descriptor = "()V")
	@Override
	public void method5543() {
		if (!this.aBoolean616 || this.anInt7054 <= 0 || this.anInt7068 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt7179;
		@Pc(19) int local19 = this.anInt7194;
		@Pc(22) int local22 = this.anInt7202;
		@Pc(25) int local25 = this.anInt7205;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5577();
		this.method5583(false);
		this.method5581(false);
		this.method5623(false);
		this.method5624(false);
		this.method5630(null);
		this.method5610(-2);
		this.method5629(1);
		this.method5574(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt7054, this.anInt7068, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.pa(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "(B)V")
	private void method5611() {
		if (this.aFloat75 == 0.0F) {
			this.aFloatArray29[14] = this.aFloat83;
			this.aFloatArray29[10] = this.aFloat92;
		} else {
			@Pc(34) float local34 = this.aFloat86 / (this.aFloat75 + this.aFloat86);
			@Pc(38) float local38 = local34 * local34;
			@Pc(55) float local55 = (1.0F - local34) * -this.aFloat83 * (1.0F - local34) / this.aFloat75;
			this.aFloatArray29[10] = local55 + this.aFloat92;
			this.aFloatArray29[14] = this.aFloat83 * local38;
		}
		this.aFloat94 = (float) this.anInt7201 - this.aFloat75;
		this.aFloat81 = ((float) -this.anInt7201 + this.aFloatArray29[14]) / this.aFloatArray29[10];
	}

	@OriginalMember(owner = "client!vj", name = "aa", descriptor = "(IIIIII[BII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(41) float local41;
		if (this.aClass112_Sub2_Sub1_5 == null || arg2 > this.aClass112_Sub2_Sub1_5.anInt4728 || this.aClass112_Sub2_Sub1_5.anInt4726 < arg3) {
			this.aClass112_Sub2_Sub1_5 = Static19.method385(this, arg6, arg3, arg2);
			this.aClass112_Sub2_Sub1_5.method3727(false, false);
			local41 = this.aClass112_Sub2_Sub1_5.aFloat33;
			local45 = this.aClass112_Sub2_Sub1_5.aFloat34;
		} else {
			this.aClass112_Sub2_Sub1_5.method3730(false, arg2, arg3, arg6, 6406);
			local41 = this.aClass112_Sub2_Sub1_5.aFloat33 * (float) arg2 / (float) this.aClass112_Sub2_Sub1_5.anInt4728;
			local45 = (float) arg3 * this.aClass112_Sub2_Sub1_5.aFloat34 / (float) this.aClass112_Sub2_Sub1_5.anInt4726;
		}
		this.method5570();
		this.method5630(this.aClass112_Sub2_Sub1_5);
		this.method5574(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5593(arg5);
		this.method5591(34165, 34165);
		this.method5561(768, 34166, 0);
		this.method5561(770, 5890, 2);
		this.method5592(34166, 0);
		this.method5592(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = local147 + (float) arg2;
		@Pc(160) float local160 = local150 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local147, local160);
		OpenGL.glTexCoord2f(local45, local41);
		OpenGL.glVertex2f(local155, local160);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method5561(768, 5890, 0);
		this.method5561(770, 34166, 2);
		this.method5592(5890, 0);
		this.method5592(34166, 2);
	}

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "()Z")
	@Override
	public boolean method5516() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5514(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas7 == arg0) {
			local5 = this.aLong215;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas8 == arg0) {
			this.method5546();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IJ)V")
	public synchronized void method5612(@OriginalArg(1) long arg0) {
		@Pc(13) Class3 local13 = new Class3();
		local13.aLong234 = arg0;
		this.aClass243_51.method5198(local13);
	}

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "(I)V")
	private void method5613() {
		Static254.aFloatArray12[0] = this.aFloat77 * this.aFloat84;
		Static254.aFloatArray12[2] = this.aFloat76 * this.aFloat77;
		Static254.aFloatArray12[3] = 1.0F;
		Static254.aFloatArray12[1] = this.aFloat85 * this.aFloat77;
		OpenGL.glLightModelfv(2899, Static254.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "([I)V")
	@Override
	public void u(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt7202;
		arg0[0] = this.anInt7179;
		arg0[3] = this.anInt7205;
		arg0[2] = this.anInt7194;
	}

	@OriginalMember(owner = "client!vj", name = "ua", descriptor = "(F)V")
	@Override
	public void ua(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat77) {
			this.aFloat77 = arg0;
			this.method5613();
		}
	}

	@OriginalMember(owner = "client!vj", name = "A", descriptor = "(I)V")
	private void method5614() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt7196;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!nh;)V")
	public void method5615(@OriginalArg(1) Interface6 arg0) {
		if (arg0 != this.anInterface6_5) {
			if (this.aBoolean611) {
				OpenGL.glBindBufferARB(34962, arg0.method4765());
			}
			this.anInterface6_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(IIII)V")
	public void method5616(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(IB)V")
	public synchronized void method5617(@OriginalArg(0) int arg0) {
		@Pc(11) Class3 local11 = new Class3();
		local11.aLong234 = arg0;
		this.aClass243_50.method5198(local11);
	}

	@OriginalMember(owner = "client!vj", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7200 = arg3;
		this.anInt7170 = arg1;
		this.anInt7185 = arg2;
		this.anInt7197 = arg0;
		this.method5596();
		this.method5606();
		if (this.anInt7181 == 3) {
			this.method5619();
		} else if (this.anInt7181 == 2) {
			this.method5548();
			return;
		}
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(II)I")
	public int method5618(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "(B)V")
	private void method5619() {
		@Pc(15) float local15 = this.aFloat87 * (float) -this.anInt7197 / (float) this.anInt7185;
		@Pc(31) float local31 = this.aFloat87 * (float) -this.anInt7170 / (float) this.anInt7200;
		@Pc(46) float local46 = this.aFloat87 * (float) (this.anInt7054 - this.anInt7197) / (float) this.anInt7185;
		@Pc(60) float local60 = this.aFloat87 * (float) (this.anInt7068 - this.anInt7170) / (float) this.anInt7200;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local46 && local31 != local60) {
			OpenGL.glOrtho((double) local15, (double) local46, (double) -local60, (double) -local31, (double) ((float) this.anInt7196 - this.aFloat75), (double) ((float) this.anInt7201 - this.aFloat75));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vj", name = "la", descriptor = "()F")
	@Override
	public float la() {
		return this.aFloat86;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(FIF)V")
	public void method5620(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat90 = arg1;
		this.aFloat91 = arg0;
		if (!this.aBoolean615) {
			this.method5588();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5500(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas7 == arg0) {
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

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!bi;Lclient!bi;FLclient!bi;)Lclient!bi;")
	@Override
	public Class23 method5525(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class23 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean599 && this.aBoolean605 && this.aBoolean606) {
			@Pc(18) Class23_Sub1_Sub1 local18 = null;
			@Pc(21) Class23_Sub1 local21 = (Class23_Sub1) arg0;
			@Pc(24) Class23_Sub1 local24 = (Class23_Sub1) arg1;
			@Pc(28) Class112_Sub4 local28 = local21.method4740();
			@Pc(32) Class112_Sub4 local32 = local24.method4740();
			if (local28 != null && local32 != null) {
				@Pc(47) int local47 = local28.anInt5833 <= local32.anInt5833 ? local32.anInt5833 : local28.anInt5833;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class23_Sub1_Sub1) {
					@Pc(59) Class23_Sub1_Sub1 local59 = (Class23_Sub1_Sub1) arg3;
					if (local47 == local59.method3300()) {
						local18 = local59;
					}
				}
				if (local18 == null) {
					local18 = new Class23_Sub1_Sub1(this, local47);
				}
				if (local18.method3302(arg2, local28, local32)) {
					return local18;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)V")
	@Override
	public void method5527(@OriginalArg(0) boolean arg0) {
		this.aBoolean600 = arg0;
		this.method5584();
	}

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "(B)V")
	private void method5621() {
		this.method5610(-2);
		for (@Pc(18) int local18 = this.anInt7195 - 1; local18 >= 0; local18--) {
			this.method5569(local18);
			this.method5630(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5591(8448, 8448);
		this.method5561(770, 34168, 2);
		this.method5566();
		this.anInt7186 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt7189 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean604 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean620 = true;
		this.method5583(true);
		this.method5581(true);
		this.method5623(true);
		this.method5624(true);
		this.method5577();
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
		@Pc(131) float[] local131 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(133) int local133 = 0; local133 < 8; local133++) {
			@Pc(138) int local138 = local133 + 16384;
			OpenGL.glLightfv(local138, 4608, local131, 0);
			OpenGL.glLightf(local138, 4615, 0.0F);
			OpenGL.glLightf(local138, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt7176 = this.anInt7188 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!bi;)V")
	@Override
	public void method5530(@OriginalArg(0) Class23 arg0) {
		this.aClass23_Sub1_1 = (Class23_Sub1) arg0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!kd;Lclient!kd;Lclient!kd;Lclient!kd;I)V")
	public void method5622(@OriginalArg(0) Class127 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) Class127 arg3) {
		if (arg2 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5615(arg2.anInterface6_3);
			OpenGL.glVertexPointer(arg2.aByte74, arg2.aShort68, this.anInterface6_5.method4767(), this.anInterface6_5.method4766() + (long) arg2.aByte75);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5615(arg3.anInterface6_3);
			OpenGL.glNormalPointer(arg3.aShort68, this.anInterface6_5.method4767(), this.anInterface6_5.method4766() + (long) arg3.aByte75);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5615(arg0.anInterface6_3);
			OpenGL.glColorPointer(arg0.aByte74, arg0.aShort68, this.anInterface6_5.method4767(), this.anInterface6_5.method4766() + (long) arg0.aByte75);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5615(arg1.anInterface6_3);
			OpenGL.glTexCoordPointer(arg1.aByte74, arg1.aShort68, this.anInterface6_5.method4767(), this.anInterface6_5.method4766() + (long) arg1.aByte75);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(IZ)V")
	public void method5623(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean625) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt7171 &= 0xFFFFFFE0;
		this.aBoolean625 = arg0;
	}

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "()Z")
	@Override
	public boolean method5508() {
		return this.aClass5_1.method27();
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(IZ)V")
	public void method5624(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean603 != arg0) {
			this.aBoolean603 = arg0;
			this.method5584();
			this.anInt7171 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!vj", name = "B", descriptor = "(I)V")
	public void method5625() {
		if (this.anInt7171 == 4) {
			return;
		}
		this.method5608();
		this.method5583(false);
		this.method5581(false);
		this.method5623(false);
		this.method5624(false);
		this.method5610(-2);
		this.method5574(1);
		this.method5629(0);
		this.anInt7171 = 4;
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "()Z")
	@Override
	public boolean method5475() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "Z", descriptor = "(IIII)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7205 > arg3) {
			this.anInt7205 = arg3;
		}
		if (arg2 < this.anInt7194) {
			this.anInt7194 = arg2;
		}
		if (this.anInt7179 < arg0) {
			this.anInt7179 = arg0;
		}
		if (arg1 > this.anInt7202) {
			this.anInt7202 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method5606();
		this.method5576();
	}

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "()Z")
	@Override
	public boolean method5533() {
		return this.aBoolean624 && (!this.method5539() || this.aBoolean622);
	}

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "()Z")
	@Override
	public boolean method5482() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(ZB)V")
	public void method5626(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean614 != arg0) {
			this.aBoolean614 = arg0;
			this.method5589();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!nd;IIII)Lclient!c;")
	@Override
	public Class9 method5537(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class9_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass214_1.method4584(arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!vj", name = "C", descriptor = "(I)V")
	public void method5627() {
		if (this.anInt7171 == 8) {
			return;
		}
		this.method5594();
		this.method5583(true);
		this.method5623(true);
		this.method5624(true);
		this.method5574(1);
		this.method5629(0);
		this.anInt7171 = 8;
	}

	@OriginalMember(owner = "client!vj", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		this.method5574(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "()Z")
	@Override
	public boolean method5483() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt7188 && this.anInt7173 == arg1 && this.anInt7203 == arg2) {
			return;
		}
		this.anInt7173 = arg1;
		this.anInt7203 = arg2;
		this.anInt7188 = arg0;
		if (this.aBoolean615) {
			return;
		}
		this.method5588();
		this.method5562();
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "()Z")
	@Override
	public boolean method5472() {
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!u;IZI)V")
	public void method5628(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1, @OriginalArg(2) int arg2) {
		@Pc(14) int local14 = arg1.method5071();
		@Pc(21) int local21 = arg2 * this.method5618(local14);
		this.method5551(arg1);
		OpenGL.glDrawElements(4, arg0, local14, (long) local21 + arg1.method5072());
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIF)Lclient!fk;")
	@Override
	public Class3_Sub8 method5534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub8_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)V")
	@Override
	public void method5523(@OriginalArg(0) int arg0) {
		this.method5614();
	}

	@OriginalMember(owner = "client!vj", name = "da", descriptor = "(IIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5605();
		this.method5574(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vj", name = "NA", descriptor = "(IIIIII)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method5605();
		this.method5574(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean624) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean624) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "()Z")
	@Override
	public boolean method5502() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "B", descriptor = "()Z")
	@Override
	public boolean method5539() {
		return this.aClass3_Sub21_Sub1_1 != null && this.aClass3_Sub21_Sub1_1.method4525();
	}

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "(FF)V")
	@Override
	public void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat86 == arg0 && this.aFloat75 == arg1) {
			return;
		}
		this.aFloat86 = arg0;
		this.aFloat75 = arg1;
		this.method5611();
		if (this.anInt7181 == 3) {
			this.method5619();
		} else if (this.anInt7181 == 2) {
			this.method5548();
		}
	}

	@OriginalMember(owner = "client!vj", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt7194 = this.anInt7054;
		this.anInt7205 = this.anInt7068;
		this.anInt7179 = 0;
		this.anInt7202 = 0;
		OpenGL.glDisable(3089);
		this.method5606();
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "(II)V")
	public void method5629(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method5591(7681, 7681);
		} else if (arg0 == 0) {
			this.method5591(8448, 8448);
		} else if (arg0 == 2) {
			this.method5591(34165, 7681);
		} else if (arg0 == 3) {
			this.method5591(260, 8448);
		} else if (arg0 == 4) {
			this.method5591(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!ih;I)V")
	public void method5630(@OriginalArg(0) Class112 arg0) {
		@Pc(9) Class112 local9 = this.aClass112Array1[this.anInt7204];
		if (arg0 != local9) {
			if (arg0 == null) {
				OpenGL.glDisable(local9.anInt5815);
			} else {
				if (local9 == null) {
					OpenGL.glEnable(arg0.anInt5815);
				} else if (local9.anInt5815 != arg0.anInt5815) {
					OpenGL.glDisable(local9.anInt5815);
					OpenGL.glEnable(arg0.anInt5815);
				}
				OpenGL.glBindTexture(arg0.anInt5815, arg0.method4547());
			}
			this.aClass112Array1[this.anInt7204] = arg0;
		}
		this.anInt7171 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!vj", name = "O", descriptor = "(IIIII)V")
	@Override
	protected void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}
}
