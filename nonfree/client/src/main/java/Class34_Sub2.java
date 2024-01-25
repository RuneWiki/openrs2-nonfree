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

@OriginalClass("client!ur")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
	public int anInt6906;

	@OriginalMember(owner = "client!ur", name = "Dc", descriptor = "I")
	public int anInt6997;

	@OriginalMember(owner = "client!ur", name = "nd", descriptor = "I")
	private int anInt7031;

	@OriginalMember(owner = "client!ur", name = "Gd", descriptor = "I")
	private int anInt7048;

	@OriginalMember(owner = "client!ur", name = "pe", descriptor = "I")
	public int anInt7073;

	@OriginalMember(owner = "client!ur", name = "re", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!ur", name = "ze", descriptor = "Lclient!ju;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!ur", name = "Be", descriptor = "Lclient!ju;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!ur", name = "De", descriptor = "I")
	public int anInt7078;

	@OriginalMember(owner = "client!ur", name = "Ee", descriptor = "I")
	private int anInt7079;

	@OriginalMember(owner = "client!ur", name = "Fe", descriptor = "I")
	public int anInt7080;

	@OriginalMember(owner = "client!ur", name = "Me", descriptor = "Lclient!pg;")
	public Class57_Sub2 aClass57_Sub2_1;

	@OriginalMember(owner = "client!ur", name = "Ne", descriptor = "Z")
	public boolean aBoolean751;

	@OriginalMember(owner = "client!ur", name = "Oe", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!ur", name = "Pe", descriptor = "I")
	private int anInt7081;

	@OriginalMember(owner = "client!ur", name = "Qe", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!ur", name = "Re", descriptor = "Z")
	private boolean aBoolean752;

	@OriginalMember(owner = "client!ur", name = "Ue", descriptor = "Lclient!pg;")
	public Class57_Sub2 aClass57_Sub2_2;

	@OriginalMember(owner = "client!ur", name = "We", descriptor = "I")
	public int anInt7083;

	@OriginalMember(owner = "client!ur", name = "Ze", descriptor = "Lclient!ku;")
	public Class32_Sub2 aClass32_Sub2_3;

	@OriginalMember(owner = "client!ur", name = "ff", descriptor = "Lclient!pg;")
	public Class57_Sub2 aClass57_Sub2_3;

	@OriginalMember(owner = "client!ur", name = "hf", descriptor = "Z")
	public boolean aBoolean756;

	@OriginalMember(owner = "client!ur", name = "kf", descriptor = "Lclient!pg;")
	public Class57_Sub2 aClass57_Sub2_4;

	@OriginalMember(owner = "client!ur", name = "mf", descriptor = "I")
	private int anInt7085;

	@OriginalMember(owner = "client!ur", name = "nf", descriptor = "I")
	private int anInt7086;

	@OriginalMember(owner = "client!ur", name = "qf", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!ur", name = "rf", descriptor = "Z")
	private boolean aBoolean758;

	@OriginalMember(owner = "client!ur", name = "sf", descriptor = "Lclient!ha;")
	private Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!ur", name = "tf", descriptor = "I")
	public int anInt7087;

	@OriginalMember(owner = "client!ur", name = "xf", descriptor = "Lclient!pg;")
	public Class57_Sub2 aClass57_Sub2_5;

	@OriginalMember(owner = "client!ur", name = "Bf", descriptor = "Lclient!mq;")
	public Class158 aClass158_6;

	@OriginalMember(owner = "client!ur", name = "Df", descriptor = "I")
	private int anInt7092;

	@OriginalMember(owner = "client!ur", name = "Ff", descriptor = "Lclient!fe;")
	private Interface2 anInterface2_5;

	@OriginalMember(owner = "client!ur", name = "Gf", descriptor = "Z")
	public boolean aBoolean760;

	@OriginalMember(owner = "client!ur", name = "Hf", descriptor = "Z")
	private boolean aBoolean761;

	@OriginalMember(owner = "client!ur", name = "If", descriptor = "Z")
	private boolean aBoolean762;

	@OriginalMember(owner = "client!ur", name = "Jf", descriptor = "Z")
	private boolean aBoolean763;

	@OriginalMember(owner = "client!ur", name = "Kf", descriptor = "Lclient!pg;")
	public Class57_Sub2 aClass57_Sub2_6;

	@OriginalMember(owner = "client!ur", name = "Mf", descriptor = "I")
	private int anInt7094;

	@OriginalMember(owner = "client!ur", name = "Nf", descriptor = "Z")
	public boolean aBoolean765;

	@OriginalMember(owner = "client!ur", name = "Of", descriptor = "[Lclient!he;")
	private Class10[] aClass10Array1;

	@OriginalMember(owner = "client!ur", name = "Qf", descriptor = "Z")
	private boolean aBoolean766;

	@OriginalMember(owner = "client!ur", name = "Rf", descriptor = "Ljava/lang/String;")
	private String aString76;

	@OriginalMember(owner = "client!ur", name = "Tf", descriptor = "Lclient!pg;")
	public Class57_Sub2 aClass57_Sub2_7;

	@OriginalMember(owner = "client!ur", name = "Zf", descriptor = "Z")
	public boolean aBoolean768;

	@OriginalMember(owner = "client!ur", name = "ag", descriptor = "Z")
	public boolean aBoolean769;

	@OriginalMember(owner = "client!ur", name = "bg", descriptor = "Lclient!pg;")
	public Class57_Sub2 aClass57_Sub2_8;

	@OriginalMember(owner = "client!ur", name = "dg", descriptor = "Lclient!al;")
	private Class10_Sub1_Sub1 aClass10_Sub1_Sub1_5;

	@OriginalMember(owner = "client!ur", name = "fg", descriptor = "Lclient!se;")
	private Interface10 anInterface10_6;

	@OriginalMember(owner = "client!ur", name = "hg", descriptor = "Z")
	private boolean aBoolean771;

	@OriginalMember(owner = "client!ur", name = "jg", descriptor = "I")
	private int anInt7102;

	@OriginalMember(owner = "client!ur", name = "kg", descriptor = "I")
	private int anInt7103;

	@OriginalMember(owner = "client!ur", name = "lg", descriptor = "Z")
	public boolean aBoolean772;

	@OriginalMember(owner = "client!ur", name = "mg", descriptor = "I")
	public int anInt7104;

	@OriginalMember(owner = "client!ur", name = "og", descriptor = "I")
	private int anInt7106;

	@OriginalMember(owner = "client!ur", name = "pg", descriptor = "Z")
	public boolean aBoolean773;

	@OriginalMember(owner = "client!ur", name = "ug", descriptor = "Lclient!tp;")
	public Class238 aClass238_13;

	@OriginalMember(owner = "client!ur", name = "vg", descriptor = "Lclient!pg;")
	public Class57_Sub2 aClass57_Sub2_9;

	@OriginalMember(owner = "client!ur", name = "wg", descriptor = "Z")
	private boolean aBoolean775;

	@OriginalMember(owner = "client!ur", name = "xg", descriptor = "F")
	private float aFloat91;

	@OriginalMember(owner = "client!ur", name = "yg", descriptor = "I")
	private int anInt7109;

	@OriginalMember(owner = "client!ur", name = "zg", descriptor = "Ljava/lang/String;")
	private String aString77;

	@OriginalMember(owner = "client!ur", name = "Ag", descriptor = "F")
	private float aFloat92;

	@OriginalMember(owner = "client!ur", name = "Bg", descriptor = "Lclient!ku;")
	public Class32_Sub2 aClass32_Sub2_4;

	@OriginalMember(owner = "client!ur", name = "Cg", descriptor = "Lclient!se;")
	private Interface10 anInterface10_7;

	@OriginalMember(owner = "client!ur", name = "Dg", descriptor = "F")
	private float aFloat93;

	@OriginalMember(owner = "client!ur", name = "Eg", descriptor = "Lclient!km;")
	public Class10_Sub1 aClass10_Sub1_5;

	@OriginalMember(owner = "client!ur", name = "Fg", descriptor = "I")
	private int anInt7110;

	@OriginalMember(owner = "client!ur", name = "Gg", descriptor = "Z")
	public boolean aBoolean776;

	@OriginalMember(owner = "client!ur", name = "Hg", descriptor = "I")
	public int anInt7111;

	@OriginalMember(owner = "client!ur", name = "Ig", descriptor = "Z")
	private boolean aBoolean777;

	@OriginalMember(owner = "client!ur", name = "Jg", descriptor = "J")
	private long aLong217;

	@OriginalMember(owner = "client!ur", name = "Rg", descriptor = "F")
	public float aFloat98;

	@OriginalMember(owner = "client!ur", name = "Sg", descriptor = "Lclient!tp;")
	public Class238 aClass238_14;

	@OriginalMember(owner = "client!ur", name = "Tg", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!ur", name = "Ug", descriptor = "Lclient!pg;")
	public Class57_Sub2 aClass57_Sub2_10;

	@OriginalMember(owner = "client!ur", name = "Wg", descriptor = "F")
	public float aFloat100;

	@OriginalMember(owner = "client!ur", name = "Xg", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!ur", name = "Zg", descriptor = "I")
	private int anInt7116;

	@OriginalMember(owner = "client!ur", name = "ah", descriptor = "Z")
	private boolean aBoolean778;

	@OriginalMember(owner = "client!ur", name = "ch", descriptor = "I")
	private int anInt7117;

	@OriginalMember(owner = "client!ur", name = "dh", descriptor = "I")
	private int anInt7118;

	@OriginalMember(owner = "client!ur", name = "sd", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!ur", name = "ie", descriptor = "I")
	public int anInt7071 = 128;

	@OriginalMember(owner = "client!ur", name = "Sd", descriptor = "Lclient!hd;")
	private final Class97 aClass97_1 = new Class97();

	@OriginalMember(owner = "client!ur", name = "le", descriptor = "Lclient!ku;")
	private final Class32_Sub2 aClass32_Sub2_1 = new Class32_Sub2();

	@OriginalMember(owner = "client!ur", name = "me", descriptor = "Lclient!ku;")
	public final Class32_Sub2 aClass32_Sub2_2 = new Class32_Sub2();

	@OriginalMember(owner = "client!ur", name = "ne", descriptor = "I")
	public int anInt7072 = 3;

	@OriginalMember(owner = "client!ur", name = "oe", descriptor = "Z")
	private boolean aBoolean750 = false;

	@OriginalMember(owner = "client!ur", name = "qe", descriptor = "I")
	public int anInt7074 = 8;

	@OriginalMember(owner = "client!ur", name = "se", descriptor = "Lclient!sr;")
	private final Class227 aClass227_44 = new Class227();

	@OriginalMember(owner = "client!ur", name = "ue", descriptor = "I")
	private int anInt7075 = -1;

	@OriginalMember(owner = "client!ur", name = "we", descriptor = "[Lclient!ju;")
	private final Interface5[] anInterface5Array1 = new Interface5[4];

	@OriginalMember(owner = "client!ur", name = "ve", descriptor = "I")
	private int anInt7076 = -1;

	@OriginalMember(owner = "client!ur", name = "xe", descriptor = "I")
	private int anInt7077 = -1;

	@OriginalMember(owner = "client!ur", name = "ye", descriptor = "[Lclient!ju;")
	private final Interface5[] anInterface5Array2 = new Interface5[4];

	@OriginalMember(owner = "client!ur", name = "Ae", descriptor = "[Lclient!ju;")
	private final Interface5[] anInterface5Array3 = new Interface5[4];

	@OriginalMember(owner = "client!ur", name = "Ce", descriptor = "Lclient!sr;")
	private final Class227 aClass227_45;

	@OriginalMember(owner = "client!ur", name = "Ge", descriptor = "Lclient!sr;")
	private final Class227 aClass227_46;

	@OriginalMember(owner = "client!ur", name = "He", descriptor = "Lclient!sr;")
	private final Class227 aClass227_47;

	@OriginalMember(owner = "client!ur", name = "Ie", descriptor = "Lclient!sr;")
	private final Class227 aClass227_48;

	@OriginalMember(owner = "client!ur", name = "Je", descriptor = "Lclient!sr;")
	private final Class227 aClass227_49;

	@OriginalMember(owner = "client!ur", name = "Ke", descriptor = "Lclient!sr;")
	private final Class227 aClass227_50;

	@OriginalMember(owner = "client!ur", name = "Le", descriptor = "Lclient!sr;")
	private final Class227 aClass227_51;

	@OriginalMember(owner = "client!ur", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!ur", name = "zf", descriptor = "I")
	public int anInt7091;

	@OriginalMember(owner = "client!ur", name = "pf", descriptor = "Z")
	private boolean aBoolean757;

	@OriginalMember(owner = "client!ur", name = "yf", descriptor = "I")
	private int anInt7090;

	@OriginalMember(owner = "client!ur", name = "Pf", descriptor = "I")
	public int anInt7095;

	@OriginalMember(owner = "client!ur", name = "af", descriptor = "[F")
	private final float[] aFloatArray29;

	@OriginalMember(owner = "client!ur", name = "Uf", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!ur", name = "Yf", descriptor = "[Lclient!bn;")
	private final Class1_Sub7[] aClass1_Sub7Array3;

	@OriginalMember(owner = "client!ur", name = "wf", descriptor = "[F")
	private final float[] aFloatArray31;

	@OriginalMember(owner = "client!ur", name = "ng", descriptor = "I")
	public int anInt7105;

	@OriginalMember(owner = "client!ur", name = "jf", descriptor = "I")
	private int anInt7084;

	@OriginalMember(owner = "client!ur", name = "Ef", descriptor = "I")
	public int anInt7093;

	@OriginalMember(owner = "client!ur", name = "vf", descriptor = "I")
	public int anInt7089;

	@OriginalMember(owner = "client!ur", name = "Wf", descriptor = "I")
	private int anInt7097;

	@OriginalMember(owner = "client!ur", name = "sg", descriptor = "I")
	private int anInt7108;

	@OriginalMember(owner = "client!ur", name = "df", descriptor = "F")
	private float aFloat84;

	@OriginalMember(owner = "client!ur", name = "Xf", descriptor = "I")
	private int anInt7098;

	@OriginalMember(owner = "client!ur", name = "Te", descriptor = "I")
	private int anInt7082;

	@OriginalMember(owner = "client!ur", name = "Ve", descriptor = "[F")
	private final float[] aFloatArray27;

	@OriginalMember(owner = "client!ur", name = "Vf", descriptor = "I")
	public int anInt7096;

	@OriginalMember(owner = "client!ur", name = "ef", descriptor = "[F")
	private final float[] aFloatArray30;

	@OriginalMember(owner = "client!ur", name = "Ye", descriptor = "[F")
	public final float[] aFloatArray28;

	@OriginalMember(owner = "client!ur", name = "of", descriptor = "F")
	private float aFloat87;

	@OriginalMember(owner = "client!ur", name = "cg", descriptor = "I")
	public int anInt7099;

	@OriginalMember(owner = "client!ur", name = "uf", descriptor = "I")
	public int anInt7088;

	@OriginalMember(owner = "client!ur", name = "gf", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!ur", name = "qg", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!ur", name = "ig", descriptor = "I")
	private int anInt7101;

	@OriginalMember(owner = "client!ur", name = "lf", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!ur", name = "Kg", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!ur", name = "Vg", descriptor = "I")
	public int anInt7115;

	@OriginalMember(owner = "client!ur", name = "Og", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!ur", name = "Qg", descriptor = "I")
	public int anInt7114;

	@OriginalMember(owner = "client!ur", name = "Mg", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!ur", name = "Yg", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!ur", name = "Pg", descriptor = "F")
	private float aFloat97;

	@OriginalMember(owner = "client!ur", name = "rg", descriptor = "I")
	private int anInt7107;

	@OriginalMember(owner = "client!ur", name = "eg", descriptor = "I")
	private int anInt7100;

	@OriginalMember(owner = "client!ur", name = "Lg", descriptor = "I")
	public int anInt7112;

	@OriginalMember(owner = "client!ur", name = "Af", descriptor = "Lclient!uo;")
	public Class1_Sub28_Sub2 aClass1_Sub28_Sub2_3;

	@OriginalMember(owner = "client!ur", name = "bh", descriptor = "[I")
	public int[] anIntArray465;

	@OriginalMember(owner = "client!ur", name = "eh", descriptor = "[I")
	public int[] anIntArray466;

	@OriginalMember(owner = "client!ur", name = "gh", descriptor = "[B")
	public final byte[] aByteArray87;

	@OriginalMember(owner = "client!ur", name = "fh", descriptor = "[I")
	public int[] anIntArray467;

	@OriginalMember(owner = "client!ur", name = "Pd", descriptor = "I")
	public final int anInt7056;

	@OriginalMember(owner = "client!ur", name = "mb", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas6;

	@OriginalMember(owner = "client!ur", name = "td", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!ur", name = "oc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ur", name = "gd", descriptor = "J")
	private final long aLong216;

	@OriginalMember(owner = "client!ur", name = "wc", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "client!ur", name = "Ng", descriptor = "I")
	public final int anInt7113;

	@OriginalMember(owner = "client!ur", name = "Lf", descriptor = "Z")
	public boolean aBoolean764;

	@OriginalMember(owner = "client!ur", name = "cf", descriptor = "Z")
	private boolean aBoolean755;

	@OriginalMember(owner = "client!ur", name = "gg", descriptor = "Z")
	public boolean aBoolean770;

	@OriginalMember(owner = "client!ur", name = "Cf", descriptor = "Z")
	public boolean aBoolean759;

	@OriginalMember(owner = "client!ur", name = "Sf", descriptor = "Z")
	public boolean aBoolean767;

	@OriginalMember(owner = "client!ur", name = "Xe", descriptor = "Z")
	private boolean aBoolean754;

	@OriginalMember(owner = "client!ur", name = "tg", descriptor = "Z")
	public boolean aBoolean774;

	@OriginalMember(owner = "client!ur", name = "Se", descriptor = "Z")
	private final boolean aBoolean753;

	@OriginalMember(owner = "client!ur", name = "je", descriptor = "Lclient!ss;")
	public final Class228 aClass228_1;

	@OriginalMember(owner = "client!ur", name = "te", descriptor = "Lclient!sj;")
	public final Class222 aClass222_1;

	@OriginalMember(owner = "client!ur", name = "ce", descriptor = "Lclient!pf;")
	private final Class186 aClass186_1;

	@OriginalMember(owner = "client!ur", name = "Td", descriptor = "Lclient!hg;")
	private Class1_Sub21_Sub1 aClass1_Sub21_Sub1_1;

	@OriginalMember(owner = "client!ur", name = "Vd", descriptor = "Lclient!tt;")
	private final Class240 aClass240_1;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;ILclient!fq;)V")
	public Class34_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class83 arg4) {
		super(arg0, arg2);
		new Class225();
		new Class199(16);
		this.aClass227_45 = new Class227();
		this.aClass227_46 = new Class227();
		this.aClass227_47 = new Class227();
		this.aClass227_48 = new Class227();
		this.aClass227_49 = new Class227();
		this.aClass227_50 = new Class227();
		this.aClass227_51 = new Class227();
		this.bf = 0;
		this.anInt7091 = 0;
		this.aBoolean757 = true;
		this.anInt7090 = 0;
		this.anInt7095 = -1;
		this.aFloatArray29 = new float[4];
		this.aFloat89 = 3584.0F;
		this.aClass1_Sub7Array3 = new Class1_Sub7[Static108.anInt2048];
		this.aFloatArray31 = new float[4];
		this.anInt7105 = 512;
		this.anInt7084 = 8448;
		this.anInt7093 = -1;
		this.anInt7089 = 0;
		this.anInt7097 = -1;
		this.anInt7108 = 8448;
		this.aFloat84 = 1.0F;
		this.anInt7098 = 0;
		this.anInt7082 = 0;
		this.aFloatArray27 = new float[16];
		this.anInt7096 = 512;
		this.aFloatArray30 = new float[4];
		this.aFloatArray28 = new float[4];
		this.aFloat87 = 1.0F;
		this.anInt7099 = 50;
		this.anInt7088 = 3584;
		this.aFloat85 = 1.0F;
		this.aFloat90 = 3000.0F;
		this.anInt7101 = 0;
		this.aFloat86 = 3584.0F;
		this.aFloat94 = -1.0F;
		this.anInt7115 = 0;
		this.aFloat96 = 1.0F;
		this.anInt7114 = -1;
		this.aFloat95 = -1.0F;
		this.aFloat102 = 1.0F;
		this.aFloat97 = 0.0F;
		this.anInt7107 = -1;
		this.anInt7100 = 0;
		this.anInt7112 = 0;
		this.aClass1_Sub28_Sub2_3 = new Class1_Sub28_Sub2(8192);
		this.anIntArray465 = new int[1];
		this.anIntArray466 = new int[1];
		this.aByteArray87 = new byte[16384];
		this.anIntArray467 = new int[1];
		this.anInt7056 = arg3;
		this.aCanvas7 = this.aCanvas6 = arg1;
		try {
			if (Static228.aBoolean546 == null || !Static228.aBoolean546) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static228.aBoolean546 = Boolean.TRUE;
				} else {
					@Pc(276) String local276 = System.getProperty("os.name").toLowerCase();
					if (!local276.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local276.startsWith("linux") || local276.startsWith("sunos")) {
						System.load(arg4.method1878("libjaggl.so").toString());
					} else if (local276.startsWith("mac")) {
						System.load(arg4.method1878("libjaggl.jnilib").toString());
					} else if (local276.startsWith("win")) {
						System.load(arg4.method1878("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static228.aBoolean546 = Boolean.TRUE;
				}
			}
			if (Static228.aBoolean546 == null || !Static228.aBoolean546) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong215 = this.aLong216 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt7056);
			if (this.aLong216 == 0L) {
				throw new RuntimeException("");
			}
			this.method5508();
			@Pc(377) int local377 = this.method5496();
			if (local377 != 0) {
				throw new RuntimeException("");
			}
			this.anInt7113 = this.aBoolean751 ? 33639 : 5121;
			@Pc(403) int local403;
			if (this.aString77.indexOf("radeon") != -1) {
				local403 = 0;
				@Pc(405) boolean local405 = false;
				@Pc(407) boolean local407 = false;
				@Pc(416) String[] local416 = Static192.method2761(' ', this.aString77.replace('/', ' '));
				for (@Pc(418) int local418 = 0; local418 < local416.length; local418++) {
					@Pc(424) String local424 = local416[local418];
					try {
						if (local424.length() > 0) {
							if (local424.charAt(0) == 'x' && local424.length() >= 3 && Static48.method797(local424.substring(1, 3))) {
								local424 = local424.substring(1);
								local407 = true;
							}
							if (local424.equals("hd")) {
								local405 = true;
							} else {
								if (local424.startsWith("hd")) {
									local424 = local424.substring(2);
									local405 = true;
								}
								if (local424.length() >= 4 && Static48.method797(local424.substring(0, 4))) {
									local403 = Static219.method3201(local424.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(492) Exception local492) {
					}
				}
				if (!local407 && !local405) {
					if (local403 >= 7000 && local403 <= 9250) {
						this.aBoolean764 = false;
					}
					if (local403 >= 7000 && local403 <= 7999) {
						this.aBoolean755 = false;
					}
				}
				if (!local405 || local403 < 4000) {
					this.aBoolean770 = false;
				}
				this.aBoolean759 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean767 = true;
				this.aBoolean754 = this.aBoolean755;
			}
			if (this.aString76.indexOf("intel") != -1) {
				this.aBoolean774 = false;
			}
			this.aBoolean753 = !this.aString76.equals("s3 graphics");
			if (this.aBoolean755) {
				try {
					@Pc(574) int[] local574 = new int[1];
					OpenGL.glGenBuffersARB(1, local574, 0);
				} catch (@Pc(580) Throwable local580) {
					throw new RuntimeException("");
				}
			}
			Static182.method2647(false, true);
			this.aBoolean750 = true;
			this.aClass228_1 = new Class228(this, super.anInterface6_8);
			this.method5512();
			this.aClass222_1 = new Class222(this);
			this.aClass186_1 = new Class186(this);
			if (this.aClass186_1.method4146()) {
				this.aClass1_Sub21_Sub1_1 = new Class1_Sub21_Sub1(this);
				if (!this.aClass1_Sub21_Sub1_1.method2220()) {
					this.aClass1_Sub21_Sub1_1.method2217();
					this.aClass1_Sub21_Sub1_1 = null;
				}
			}
			this.aClass240_1 = new Class240(this);
			this.method5501();
			this.method5491();
			OpenGL.glClear(16640);
			local403 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(659) Exception local659) {
					if (local403++ > 5) {
						throw new RuntimeException("");
					}
					Static223.method4582(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(679) Throwable local679) {
			local679.printStackTrace();
			this.method5786();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
	@Override
	public void method5737(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(IIIIII)Lclient!ob;")
	@Override
	public Class3 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean776 ? new Class3_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ur", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
		this.anInt7072 = 0;
		while (arg0 > 1) {
			this.anInt7072++;
			arg0 >>= 0x1;
		}
		this.anInt7074 = 0x1 << this.anInt7072;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)V")
	private void method5483() {
		this.aFloat99 = this.anInt7098 - this.anInt7112;
		this.aFloat88 = this.anInt7101 - this.anInt7091;
		this.aFloat100 = this.anInt7082 - this.anInt7091;
		this.aFloat98 = this.anInt7090 - this.anInt7112;
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5793(@OriginalArg(0) Canvas arg0) {
		this.aCanvas7 = null;
		this.aLong215 = 0L;
		if (arg0 == null || arg0 == this.aCanvas6) {
			this.aCanvas7 = this.aCanvas6;
			this.aLong215 = this.aLong216;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable2.get(arg0);
			this.aLong215 = local26;
			this.aCanvas7 = arg0;
		}
		if (this.aCanvas7 == null || this.aLong215 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong215);
		this.method5491();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!ku;)V")
	public void method5484(@OriginalArg(1) Class32_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method3239(), 0);
	}

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "()Z")
	@Override
	public boolean method5775() {
		if (this.aClass1_Sub21_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass1_Sub21_Sub1_1.method2206()) {
			if (!this.aClass186_1.method4145(this.aClass1_Sub21_Sub1_1)) {
				return false;
			}
			this.aClass228_1.method4982();
		}
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!ju;)V")
	public void method5485(@OriginalArg(1) Interface5 arg0) {
		if (this.anInt7075 < 0 || arg0 != this.anInterface5Array1[this.anInt7075]) {
			throw new RuntimeException();
		}
		this.anInterface5Array1[this.anInt7075--] = null;
		arg0.method3656();
		if (this.anInt7075 >= 0) {
			this.anInterface5_2 = this.anInterface5Array1[this.anInt7075];
			this.anInterface5_2.method3652();
		} else {
			this.anInterface5_2 = null;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBII)V")
	public void method5486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ur", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat90 && arg1 == this.aFloat101) {
			return;
		}
		this.aFloat90 = arg0;
		this.aFloat101 = arg1;
		this.method5513();
		if (this.anInt7116 == 3) {
			this.method5548();
		} else if (this.anInt7116 == 2) {
			this.method5522();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)V")
	public void method5487(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean766) {
			this.aBoolean766 = arg0;
			this.method5519();
			this.anInt7103 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V")
	@Override
	public void method5757(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ur", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt7101 = 0;
		this.anInt7090 = 0;
		this.anInt7082 = this.anInt6906;
		this.anInt7098 = this.anInt6997;
		OpenGL.glDisable(3089);
		this.method5483();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class104 method5761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static193.method2779(arg3, arg2, this, arg1, arg0);
	}

	@OriginalMember(owner = "client!ur", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5498();
		this.method5536(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ur", name = "A", descriptor = "()Z")
	@Override
	public boolean method5796() {
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(B)V")
	private void method5488() {
		if (this.anInt7116 != 2) {
			this.anInt7116 = 2;
			this.method5522();
			this.method5562();
			this.anInt7103 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIF)Lclient!bn;")
	@Override
	public Class1_Sub7 method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub7_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BII)V")
	public synchronized void method5489(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub26 local14 = new Class1_Sub26(arg1);
		local14.aLong230 = arg0;
		this.aClass227_49.method4972(local14);
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(B)V")
	private void method5490() {
		OpenGL.glDepthMask(this.aBoolean758 && this.aBoolean757);
	}

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "(I)V")
	private void method5491() {
		if (this.aCanvas7 == null) {
			this.anInt7031 = this.anInt7048 = 0;
		} else {
			@Pc(26) Dimension local26 = this.aCanvas7.getSize();
			this.anInt7048 = local26.height;
			this.anInt7031 = local26.width;
		}
		if (this.anInterface5_2 == null) {
			this.anInt6997 = this.anInt7031;
			this.anInt6906 = this.anInt7048;
			this.method5527();
		}
		this.method5529();
		this.va();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZB)V")
	public void method5492(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean777 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean777 = arg0;
		this.anInt7103 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean756 = true;
		this.anInt7115 = arg3;
		this.anInt7087 = arg0;
		this.anInt7093 = arg2;
		this.anInt7107 = arg1;
		this.aClass240_1.method5188(false, 3, false, 0, 0);
		this.aClass240_1.aClass38_Sub8_1.method5052();
		this.method5543();
		this.method5547();
	}

	@OriginalMember(owner = "client!ur", name = "B", descriptor = "()I")
	@Override
	public int method5800() {
		return 4;
	}

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.aBoolean756 = false;
		this.aClass240_1.method5188(false, 0, false, 0, 0);
		this.method5543();
		this.method5547();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!he;I)V")
	public void method5493(@OriginalArg(0) Class10 arg0) {
		@Pc(11) Class10 local11 = this.aClass10Array1[this.anInt7092];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt7522);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt7522);
				} else if (arg0.anInt7522 != local11.anInt7522) {
					OpenGL.glDisable(local11.anInt7522);
					OpenGL.glEnable(arg0.anInt7522);
				}
				OpenGL.glBindTexture(arg0.anInt7522, arg0.method5930());
			}
			this.aClass10Array1[this.anInt7092] = arg0;
		}
		this.anInt7103 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ur", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.anInt7079 + this.anInt7078 + this.anInt7080;
	}

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "(I)V")
	public void method5494() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(Z)V")
	@Override
	public void method5768(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "(I)V")
	private void method5495() {
		@Pc(11) int local11;
		for (local11 = 0; local11 < this.anInt7109; local11++) {
			@Pc(18) Class1_Sub7 local18 = this.aClass1_Sub7Array3[local11];
			@Pc(23) int local23 = local11 + 16386;
			Static166.aFloatArray9[0] = local18.method5113();
			Static166.aFloatArray9[1] = local18.method5114();
			Static166.aFloatArray9[2] = local18.method5117();
			Static166.aFloatArray9[3] = 1.0F;
			OpenGL.glLightfv(local23, 4611, Static166.aFloatArray9, 0);
			@Pc(57) int local57 = local18.method5122();
			@Pc(63) float local63 = local18.method5124() / 255.0F;
			Static166.aFloatArray9[1] = (float) (local57 >> 8 & 0xFF) * local63;
			Static166.aFloatArray9[2] = (float) (local57 & 0xFF) * local63;
			Static166.aFloatArray9[0] = local63 * (float) (local57 >> 16 & 0xFF);
			OpenGL.glLightfv(local23, 4609, Static166.aFloatArray9, 0);
			OpenGL.glLightf(local23, 4617, 1.0F / (float) (local18.method5120() * local18.method5120()));
			OpenGL.glEnable(local23);
		}
		while (local11 < this.anInt7085) {
			OpenGL.glDisable(local11 + 16386);
			local11++;
		}
		this.anInt7085 = this.anInt7109;
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(B)I")
	private int method5496() {
		this.aString76 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString77 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString76.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString76.indexOf("brian paul") != -1 || this.aString76.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static192.method2761(' ', local46.replace('.', ' '));
		if (local54.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(70) int local70 = Static219.method3201(local54[0]);
				@Pc(76) int local76 = Static219.method3201(local54[1]);
				this.anInt7081 = local70 * 10 + local76;
			} catch (@Pc(85) NumberFormatException local85) {
				local10 |= 0x4;
			}
		}
		if (this.anInt7081 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(121) int[] local121 = new int[1];
		OpenGL.glGetIntegerv(34018, local121, 0);
		this.anInt7104 = local121[0];
		OpenGL.glGetIntegerv(34929, local121, 0);
		this.anInt7102 = local121[0];
		OpenGL.glGetIntegerv(34930, local121, 0);
		this.anInt7094 = local121[0];
		if (this.anInt7104 < 2 || this.anInt7102 < 2 || this.anInt7094 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean751 = NativeStream.c();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean755 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean763 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean773 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean772 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean760 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean764 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean759 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean776 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean770 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean768 = false;
		this.aBoolean774 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean765 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean769 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean761 = this.aBoolean765 & this.aBoolean769;
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "()V")
	@Override
	public void method5764() {
		if (this.aClass1_Sub21_Sub1_1 != null && this.aClass1_Sub21_Sub1_1.method2206()) {
			this.aClass186_1.method4143(this.aClass1_Sub21_Sub1_1);
			this.aClass228_1.method4982();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IFFF)V")
	private void method5497(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean778) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg2, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean778 = true;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ob;)V")
	@Override
	public void method5746(@OriginalArg(0) Class3 arg0) {
		this.aClass3_Sub1_1 = (Class3_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5743(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class1_Sub26 local19;
		while (!this.aClass227_46.method4976()) {
			local19 = (Class1_Sub26) this.aClass227_46.method4974();
			Static185.anIntArray207[local11++] = (int) local19.aLong230;
			this.anInt7080 -= local19.anInt3459;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static185.anIntArray207, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static185.anIntArray207, 0);
			local11 = 0;
		}
		while (!this.aClass227_47.method4976()) {
			local19 = (Class1_Sub26) this.aClass227_47.method4974();
			Static185.anIntArray207[local11++] = (int) local19.aLong230;
			this.anInt7078 -= local19.anInt3459;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static185.anIntArray207, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static185.anIntArray207, 0);
			local11 = 0;
		}
		while (!this.aClass227_48.method4976()) {
			local19 = (Class1_Sub26) this.aClass227_48.method4974();
			Static185.anIntArray207[local11++] = local19.anInt3459;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static185.anIntArray207, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static185.anIntArray207, 0);
			local11 = 0;
		}
		while (!this.aClass227_49.method4976()) {
			local19 = (Class1_Sub26) this.aClass227_49.method4974();
			Static185.anIntArray207[local11++] = (int) local19.aLong230;
			this.anInt7079 -= local19.anInt3459;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static185.anIntArray207, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static185.anIntArray207, 0);
		}
		while (!this.aClass227_45.method4976()) {
			local19 = (Class1_Sub26) this.aClass227_45.method4974();
			OpenGL.glDeleteLists((int) local19.aLong230, local19.anInt3459);
		}
		@Pc(222) Class1 local222;
		while (!this.aClass227_50.method4976()) {
			local222 = this.aClass227_50.method4974();
			OpenGL.glDeleteProgramARB((int) local222.aLong230);
		}
		while (!this.aClass227_51.method4976()) {
			local222 = this.aClass227_51.method4974();
			OpenGL.glDeleteObjectARB(local222.aLong230);
		}
		while (!this.aClass227_45.method4976()) {
			local19 = (Class1_Sub26) this.aClass227_45.method4974();
			OpenGL.glDeleteLists((int) local19.aLong230, local19.anInt3459);
		}
		this.aClass228_1.method4983();
		if (this.pa() > 100663296 && this.aLong217 + 60000L < Static27.method359()) {
			System.gc();
			this.aLong217 = Static27.method359();
		}
		this.anInt7073 = local9;
	}

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.method5536(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "(I)V")
	private void method5498() {
		if (this.anInt7103 == 1) {
			return;
		}
		this.method5524();
		this.method5555(false);
		this.method5487(false);
		this.method5492(false);
		this.method5546(false);
		this.method5493(null);
		this.method5556(-2);
		this.method5517(1);
		this.anInt7103 = 1;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5752(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ur", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt7088;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IFF)V")
	public void method5499(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat97 = arg1;
		this.aFloat87 = arg0;
		if (!this.aBoolean756) {
			this.method5543();
		}
	}

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "()Z")
	@Override
	public boolean method5740() {
		return this.aBoolean763 && (!this.method5734() || this.aBoolean761);
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "()Z")
	@Override
	public boolean method5739() {
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5751(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5781();
	}

	@OriginalMember(owner = "client!ur", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt7099;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ku;I)V")
	public void method5500(@OriginalArg(0) Class32_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method3239(), 0);
	}

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "()Lclient!c;")
	@Override
	public Class32 method5747() {
		return this.aClass32_Sub2_1;
	}

	@OriginalMember(owner = "client!ur", name = "z", descriptor = "()Z")
	@Override
	public boolean method5794() {
		return this.aClass1_Sub21_Sub1_1 != null && (this.anInt7056 <= 1 || this.aBoolean761);
	}

	@OriginalMember(owner = "client!ur", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(6) int local6 = this.anInt7118;
		this.anInt7118 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!pq;IIII)Lclient!e;")
	@Override
	public Class57 method5792(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class57_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "(B)V")
	private void method5501() {
		this.method5556(-2);
		for (@Pc(14) int local14 = this.anInt7104 - 1; local14 >= 0; local14--) {
			this.method5507(local14);
			this.method5493(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5526(8448, 8448);
		this.method5486(34168, 2, 770);
		this.method5511();
		this.anInt7086 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt7110 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean752 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean775 = true;
		this.method5555(true);
		this.method5487(true);
		this.method5492(true);
		this.method5546(true);
		this.method5529();
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
		@Pc(136) float[] local136 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(138) int local138 = 0; local138 < 8; local138++) {
			@Pc(144) int local144 = local138 + 16384;
			OpenGL.glLightfv(local144, 4608, local136, 0);
			OpenGL.glLightf(local144, 4615, 0.0F);
			OpenGL.glLightf(local144, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt7097 = this.anInt7114 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class157 method5744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class157_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(ILclient!ju;)V")
	public void method5502(@OriginalArg(1) Interface5 arg0) {
		if (this.anInt7076 < 0 || this.anInterface5Array3[this.anInt7076] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface5Array3[this.anInt7076--] = null;
		arg0.method3653();
		if (this.anInt7076 >= 0) {
			this.anInterface5_1 = this.anInterface5Array3[this.anInt7076];
			this.anInterface5_1.method3655();
		} else {
			this.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(FIFFF)V")
	public void method5503(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static294.aFloatArray22[3] = arg3;
		Static294.aFloatArray22[0] = arg1;
		Static294.aFloatArray22[2] = arg0;
		Static294.aFloatArray22[1] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static294.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBIILclient!fe;)V")
	public void method5504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Interface2 arg2) {
		@Pc(15) int local15 = arg2.method3825();
		@Pc(22) int local22 = arg1 * this.method5540(local15);
		this.method5538(arg2);
		OpenGL.glDrawElements(4, arg0, local15, (long) local22 + arg2.method3823());
	}

	@OriginalMember(owner = "client!ur", name = "y", descriptor = "()V")
	@Override
	public void method5789() {
		if (!this.aBoolean753 || this.anInt6997 <= 0 || this.anInt6906 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt7090;
		@Pc(19) int local19 = this.anInt7098;
		@Pc(22) int local22 = this.anInt7101;
		@Pc(25) int local25 = this.anInt7082;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5529();
		this.method5555(false);
		this.method5487(false);
		this.method5492(false);
		this.method5546(false);
		this.method5493(null);
		this.method5556(-2);
		this.method5517(1);
		this.method5536(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt6997, this.anInt6906, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ba(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "(I)V")
	public void method5505() {
		if (this.anInt7103 == 16) {
			return;
		}
		this.method5531();
		this.method5555(true);
		this.method5492(true);
		this.method5546(true);
		this.method5536(1);
		this.method5517(0);
		this.anInt7103 = 16;
	}

	@OriginalMember(owner = "client!ur", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.aClass32_Sub2_4.aFloat47 + this.aClass32_Sub2_4.aFloat56 * (float) arg0 + (float) arg1 * this.aClass32_Sub2_4.aFloat46 + this.aClass32_Sub2_4.aFloat51;
		if ((float) this.anInt7099 > local28 || local28 > (float) this.anInt7088) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass32_Sub2_4.aFloat54 * (float) arg0 + this.aClass32_Sub2_4.aFloat52 * (float) arg1 + (float) arg2 * this.aClass32_Sub2_4.aFloat50 + this.aClass32_Sub2_4.aFloat48) * (float) this.anInt7105 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt7096 * ((float) arg1 * this.aClass32_Sub2_4.aFloat53 + this.aClass32_Sub2_4.aFloat45 * (float) arg0 + (float) arg2 * this.aClass32_Sub2_4.aFloat49 + this.aClass32_Sub2_4.aFloat55) / local28);
		if ((float) local85 >= this.aFloat98 && this.aFloat99 >= (float) local85 && (float) local117 >= this.aFloat88 && this.aFloat100 >= (float) local117) {
			arg3[1] = (int) ((float) local117 - this.aFloat88);
			arg3[0] = (int) ((float) local85 - this.aFloat98);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ur", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(6) int local6 = this.anInt7117;
		this.anInt7117 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5738(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLclient!ju;)V")
	public void method5506(@OriginalArg(1) Interface5 arg0) {
		if (this.anInt7076 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7076 >= 0) {
			this.anInterface5Array3[this.anInt7076].method3653();
		}
		this.anInterface5_1 = this.anInterface5Array3[++this.anInt7076] = arg0;
		this.anInterface5_1.method3655();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)V")
	public void method5507(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt7092) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt7092 = arg0;
		}
	}

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "(I)V")
	private void method5508() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static223.method4582(1000L);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ob;Lclient!ob;FLclient!ob;)Lclient!ob;")
	@Override
	public Class3 method5763(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean776 && this.aBoolean774) {
			@Pc(15) Class3_Sub1_Sub2 local15 = null;
			@Pc(18) Class3_Sub1 local18 = (Class3_Sub1) arg0;
			@Pc(21) Class3_Sub1 local21 = (Class3_Sub1) arg1;
			@Pc(25) Class10_Sub3 local25 = local18.method2022();
			@Pc(29) Class10_Sub3 local29 = local21.method2022();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local25.anInt6143 <= local29.anInt6143 ? local29.anInt6143 : local25.anInt6143;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class3_Sub1_Sub2) {
					@Pc(56) Class3_Sub1_Sub2 local56 = (Class3_Sub1_Sub2) arg3;
					if (local44 == local56.method2026()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class3_Sub1_Sub2(this, local44);
				}
				if (local15.method2025(arg2, local25, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)V")
	public synchronized void method5510(@OriginalArg(0) int arg0) {
		@Pc(13) Class1 local13 = new Class1();
		local13.aLong230 = arg0;
		this.aClass227_50.method4972(local13);
	}

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "(I)V")
	private void method5511() {
		if (this.aBoolean778) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean778 = false;
		}
	}

	@OriginalMember(owner = "client!ur", name = "v", descriptor = "()V")
	@Override
	public void method5781() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "(B)V")
	private void method5512() {
		this.aClass32_Sub2_4 = new Class32_Sub2();
		this.aClass32_Sub2_3 = new Class32_Sub2();
		this.aClass10Array1 = new Class10[this.anInt7104];
		this.aClass10_Sub1_5 = new Class10_Sub1(this, 3553, 6408, 1, 1);
		new Class10_Sub1(this, 3553, 6408, 1, 1);
		new Class10_Sub1(this, 3553, 6408, 1, 1);
		this.aClass57_Sub2_10 = new Class57_Sub2(this);
		this.aClass57_Sub2_1 = new Class57_Sub2(this);
		this.aClass57_Sub2_2 = new Class57_Sub2(this);
		this.aClass57_Sub2_7 = new Class57_Sub2(this);
		this.aClass57_Sub2_9 = new Class57_Sub2(this);
		this.aClass57_Sub2_6 = new Class57_Sub2(this);
		this.aClass57_Sub2_3 = new Class57_Sub2(this);
		this.aClass57_Sub2_8 = new Class57_Sub2(this);
		this.aClass57_Sub2_4 = new Class57_Sub2(this);
		this.aClass57_Sub2_5 = new Class57_Sub2(this);
		if (this.aBoolean774) {
			this.aClass158_6 = new Class158(this);
			new Class158(this);
		}
	}

	@OriginalMember(owner = "client!ur", name = "o", descriptor = "(I)V")
	private void method5513() {
		if (this.aFloat101 == 0.0F) {
			this.aFloatArray27[14] = this.aFloat91;
			this.aFloatArray27[10] = this.aFloat92;
		} else {
			@Pc(17) float local17 = this.aFloat90 / (this.aFloat90 + this.aFloat101);
			@Pc(21) float local21 = local17 * local17;
			@Pc(37) float local37 = (1.0F - local17) * -this.aFloat91 * (1.0F - local17) / this.aFloat101;
			this.aFloatArray27[14] = local21 * this.aFloat91;
			this.aFloatArray27[10] = local37 + this.aFloat92;
		}
		this.aFloat89 = (float) this.anInt7088 - this.aFloat101;
		this.aFloat86 = (this.aFloatArray27[14] - (float) this.anInt7088) / this.aFloatArray27[10];
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(II)V")
	public synchronized void method5514(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub26 local13 = new Class1_Sub26(arg0);
		this.aClass227_48.method4972(local13);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(JI)V")
	public synchronized void method5515(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = new Class1();
		local11.aLong230 = arg0;
		this.aClass227_51.method4972(local11);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!se;I)V")
	public void method5516(@OriginalArg(0) Interface10 arg0) {
		if (arg0 != this.anInterface10_7) {
			if (this.aBoolean755) {
				OpenGL.glBindBufferARB(34962, arg0.method5248());
			}
			this.anInterface10_7 = arg0;
		}
	}

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "(II)V")
	public void method5517(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method5526(7681, 7681);
		} else if (arg0 == 0) {
			this.method5526(8448, 8448);
		} else if (arg0 == 2) {
			this.method5526(34165, 7681);
		} else if (arg0 == 3) {
			this.method5526(260, 8448);
			return;
		} else if (arg0 == 4) {
			this.method5526(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5785(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas6) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)I")
	@Override
	public int method5783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!ur", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat83) {
			this.aFloat83 = arg0;
			this.method5532();
		}
	}

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "(B)V")
	private void method5519() {
		if (this.aBoolean766 && !this.aBoolean762) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)V")
	public void method5520(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean762) {
			this.aBoolean762 = arg0;
			this.method5519();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ju;I)V")
	public void method5521(@OriginalArg(0) Interface5 arg0) {
		if (this.aBoolean765) {
			this.method5506(arg0);
			this.method5554(arg0);
		} else if (this.anInt7077 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt7077 >= 0) {
				this.anInterface5Array2[this.anInt7077].method3657();
			}
			this.anInterface5_1 = this.anInterface5_2 = this.anInterface5Array2[++this.anInt7077] = arg0;
			this.anInterface5_1.method3654();
		}
	}

	@OriginalMember(owner = "client!ur", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method5498();
		this.method5536(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean763) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean763) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ur", name = "x", descriptor = "()V")
	@Override
	public void method5788() {
		this.method5546(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!gf;[Lclient!ev;Z)Lclient!la;")
	@Override
	public Class76 method5754(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class72[] arg1) {
		return new Class76_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class104 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class104_Sub2 local6 = (Class104_Sub2) arg5;
		@Pc(9) Class10_Sub1_Sub1 local9 = local6.aClass10_Sub1_Sub1_2;
		this.method5530();
		this.method5493(local6.aClass10_Sub1_Sub1_2);
		this.method5536(1);
		this.method5526(7681, 8448);
		this.method5486(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat7 / (float) local9.anInt262;
		@Pc(46) float local46 = local9.aFloat6 / (float) local9.anInt263;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method5486(5890, 0, 768);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "()Z")
	@Override
	public boolean method5728() {
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!eu;)V")
	@Override
	public void method5741(@OriginalArg(0) Class71 arg0) {
		this.aClass97_1.method2179(arg0, this);
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(Z)V")
	private void method5522() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray27, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "()Z")
	@Override
	public boolean method5774() {
		return false;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "()Z")
	@Override
	public boolean method5732() {
		return false;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZZ)V")
	public void method5523(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method5560(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "(B)V")
	private void method5524() {
		if (this.anInt7116 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt6997 > 0 && this.anInt6906 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt6997, (double) this.anInt6906, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt7116 = 1;
		this.anInt7103 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "()Lclient!c;")
	@Override
	public Class32 method5736() {
		return new Class32_Sub2();
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt7099 && this.anInt7088 == arg1) {
			return;
		}
		this.anInt7099 = arg0;
		this.anInt7088 = arg1;
		this.method5537();
		this.method5543();
		if (this.anInt7116 == 3) {
			this.method5548();
		} else if (this.anInt7116 == 2) {
			this.method5522();
		}
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V")
	@Override
	public void method5749(@OriginalArg(0) int arg0) {
		this.method5545();
	}

	@OriginalMember(owner = "client!ur", name = "q", descriptor = "(I)Lclient!sa;")
	public Class10_Sub3 method5525() {
		return this.aClass3_Sub1_1 == null ? null : this.aClass3_Sub1_1.method2022();
	}

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "()Z")
	@Override
	public boolean method5766() {
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class6 method5777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class6_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5498();
		this.method5536(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)V")
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7092 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(23) boolean local23 = false;
		if (arg0 != this.anInt7108) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local23 = true;
			this.anInt7108 = arg0;
		}
		if (arg1 != this.anInt7084) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local23 = true;
			this.anInt7084 = arg1;
		}
		if (local23) {
			this.anInt7103 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "(B)V")
	private void method5527() {
		OpenGL.glViewport(this.anInt7100, this.bf, this.anInt6997, this.anInt6906);
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(BLclient!ju;)V")
	public void method5528(@OriginalArg(1) Interface5 arg0) {
		if (this.aBoolean765) {
			this.method5502(arg0);
			this.method5485(arg0);
		} else if (this.anInt7077 >= 0 && this.anInterface5Array2[this.anInt7077] == arg0) {
			this.anInterface5Array2[this.anInt7077--] = null;
			arg0.method3657();
			if (this.anInt7077 >= 0) {
				this.anInterface5_1 = this.anInterface5_2 = this.anInterface5Array2[this.anInt7077];
				this.anInterface5_1.method3654();
			} else {
				this.anInterface5_1 = this.anInterface5_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "(B)V")
	public void method5529() {
		if (this.anInt7116 != 0) {
			this.anInt7116 = 0;
			this.anInt7103 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "(B)V")
	public void method5530() {
		if (this.anInt7103 == 2) {
			return;
		}
		this.method5524();
		this.method5555(false);
		this.method5487(false);
		this.method5492(false);
		this.method5546(false);
		this.method5556(-2);
		this.anInt7103 = 2;
	}

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "(I)V")
	@Override
	public void method5790(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt7071 = arg0;
		this.aClass228_1.method4982();
	}

	@OriginalMember(owner = "client!ur", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat101;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(Z)V")
	@Override
	public void method5745(@OriginalArg(0) boolean arg0) {
		this.aBoolean757 = arg0;
		this.method5490();
	}

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "()V")
	@Override
	public void method5765() {
	}

	@OriginalMember(owner = "client!ur", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat90;
	}

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "(B)V")
	private void method5531() {
		if (this.anInt7116 != 3) {
			this.anInt7116 = 3;
			this.method5548();
			this.method5562();
			this.anInt7103 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5791(@OriginalArg(0) Class1_Sub12 arg0) {
		this.aNativeHeap2 = ((Class1_Sub12_Sub1) arg0).aNativeHeap1;
		if (this.anInterface10_6 != null) {
			return;
		}
		@Pc(16) Class1_Sub28_Sub2 local16 = new Class1_Sub28_Sub2(80);
		if (this.aBoolean751) {
			local16.method5401(-1.0F);
			local16.method5401(-1.0F);
			local16.method5401(0.0F);
			local16.method5401(0.0F);
			local16.method5401(1.0F);
			local16.method5401(1.0F);
			local16.method5401(-1.0F);
			local16.method5401(0.0F);
			local16.method5401(1.0F);
			local16.method5401(1.0F);
			local16.method5401(1.0F);
			local16.method5401(1.0F);
			local16.method5401(0.0F);
			local16.method5401(1.0F);
			local16.method5401(0.0F);
			local16.method5401(-1.0F);
			local16.method5401(1.0F);
			local16.method5401(0.0F);
			local16.method5401(0.0F);
			local16.method5401(0.0F);
		} else {
			local16.method5400(-1.0F);
			local16.method5400(-1.0F);
			local16.method5400(0.0F);
			local16.method5400(0.0F);
			local16.method5400(1.0F);
			local16.method5400(1.0F);
			local16.method5400(-1.0F);
			local16.method5400(0.0F);
			local16.method5400(1.0F);
			local16.method5400(1.0F);
			local16.method5400(1.0F);
			local16.method5400(1.0F);
			local16.method5400(0.0F);
			local16.method5400(1.0F);
			local16.method5400(0.0F);
			local16.method5400(-1.0F);
			local16.method5400(1.0F);
			local16.method5400(0.0F);
			local16.method5400(0.0F);
			local16.method5400(0.0F);
		}
		this.anInterface10_6 = this.method5564(local16.aByteArray86, local16.anInt6812, false, 20);
		this.aClass238_13 = new Class238(this.anInterface10_6, 5126, 3, 0);
		this.aClass238_14 = new Class238(this.anInterface10_6, 5126, 2, 12);
		this.aClass97_1.method2182(this);
	}

	@OriginalMember(owner = "client!ur", name = "r", descriptor = "(I)V")
	private void method5532() {
		Static294.aFloatArray22[1] = this.aFloat85 * this.aFloat83;
		Static294.aFloatArray22[0] = this.aFloat83 * this.aFloat102;
		Static294.aFloatArray22[2] = this.aFloat83 * this.aFloat96;
		Static294.aFloatArray22[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static294.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IB)V")
	public void method5533(@OriginalArg(0) int arg0) {
		Static294.aFloatArray22[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static294.aFloatArray22[3] = (float) (arg0 >>> 24) / 255.0F;
		Static294.aFloatArray22[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static294.aFloatArray22[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static294.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class6 method5798(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class6_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BIII)V")
	public void method5534(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBI)V")
	public synchronized void method5535(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub26 local8 = new Class1_Sub26(arg1);
		local8.aLong230 = arg0;
		this.aClass227_46.method4972(local8);
	}

	@OriginalMember(owner = "client!ur", name = "q", descriptor = "()Z")
	@Override
	public boolean method5772() {
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "()Z")
	@Override
	public boolean method5758() {
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(IB)V")
	public void method5536(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt7086) {
			return;
		}
		@Pc(24) boolean local24;
		@Pc(26) byte local26;
		if (arg0 == 1) {
			local26 = 1;
			local24 = true;
		} else if (arg0 == 2) {
			local26 = 2;
			local24 = false;
		} else if (arg0 == 128) {
			local24 = true;
			local26 = 3;
		} else {
			local24 = false;
			local26 = 0;
		}
		if (!this.aBoolean775) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean775 = true;
		}
		if (this.aBoolean752 != local24) {
			if (local24) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean752 = local24;
		}
		if (this.anInt7110 != local26) {
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
			this.anInt7110 = local26;
		}
		this.anInt7086 = arg0;
		this.anInt7103 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ur", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt7082;
		arg0[2] = this.anInt7098;
		arg0[0] = this.anInt7090;
		arg0[1] = this.anInt7101;
	}

	@OriginalMember(owner = "client!ur", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7098 > arg2) {
			this.anInt7098 = arg2;
		}
		if (arg0 > this.anInt7090) {
			this.anInt7090 = arg0;
		}
		if (this.anInt7101 < arg1) {
			this.anInt7101 = arg1;
		}
		if (arg3 < this.anInt7082) {
			this.anInt7082 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method5483();
		this.method5557();
	}

	@OriginalMember(owner = "client!ur", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt6906 < arg3) {
			arg3 = this.anInt6906;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt6997 < arg2) {
			arg2 = this.anInt6997;
		}
		this.anInt7082 = arg3;
		this.anInt7101 = arg1;
		this.anInt7098 = arg2;
		this.anInt7090 = arg0;
		OpenGL.glEnable(3089);
		this.method5483();
		this.method5557();
	}

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "(I)V")
	private void method5537() {
		@Pc(6) float[] local6 = this.aFloatArray27;
		@Pc(18) float local18 = (float) (this.anInt7099 * -this.anInt7112) / (float) this.anInt7105;
		@Pc(33) float local33 = (float) (this.anInt7099 * (this.anInt6997 - this.anInt7112)) / (float) this.anInt7105;
		@Pc(44) float local44 = (float) (this.anInt7099 * this.anInt7091) / (float) this.anInt7096;
		@Pc(59) float local59 = (float) ((this.anInt7091 - this.anInt6906) * this.anInt7099) / (float) this.anInt7096;
		if (local33 == local18 || local59 == local44) {
			local6[9] = 0.0F;
			local6[2] = 0.0F;
			local6[4] = 0.0F;
			local6[14] = 0.0F;
			local6[11] = 0.0F;
			local6[6] = 0.0F;
			local6[15] = 1.0F;
			local6[0] = 1.0F;
			local6[13] = 0.0F;
			local6[1] = 0.0F;
			local6[10] = 1.0F;
			local6[3] = 0.0F;
			local6[8] = 0.0F;
			local6[7] = 0.0F;
			local6[12] = 0.0F;
			local6[5] = 1.0F;
		} else {
			@Pc(139) float local139 = (float) this.anInt7099 * 2.0F;
			local6[7] = 0.0F;
			local6[11] = -1.0F;
			local6[3] = 0.0F;
			local6[2] = 0.0F;
			local6[9] = (local44 + local59) / (local44 - local59);
			local6[1] = 0.0F;
			local6[0] = local139 / (local33 - local18);
			local6[4] = 0.0F;
			local6[13] = 0.0F;
			local6[8] = (local18 + local33) / (-local18 + local33);
			local6[10] = this.aFloat92 = (float) -(this.anInt7088 + this.anInt7099) / (float) (this.anInt7088 - this.anInt7099);
			local6[15] = 0.0F;
			local6[14] = this.aFloat91 = -((float) this.anInt7088 * local139) / (float) (this.anInt7088 - this.anInt7099);
			local6[5] = local139 / (local44 - local59);
			local6[6] = 0.0F;
			local6[12] = 0.0F;
		}
		this.method5513();
	}

	@OriginalMember(owner = "client!ur", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass32_Sub2_4.aFloat56 * (float) arg0 + this.aClass32_Sub2_4.aFloat46 * (float) arg1 + (float) arg2 * this.aClass32_Sub2_4.aFloat47 + this.aClass32_Sub2_4.aFloat51;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass32_Sub2_4.aFloat56 * (float) arg3 + (float) arg4 * this.aClass32_Sub2_4.aFloat46 + (float) arg5 * this.aClass32_Sub2_4.aFloat47 + this.aClass32_Sub2_4.aFloat51;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt7099 && local59 < (float) this.anInt7099 || !(!(local28 > (float) this.anInt7088) || !(local59 > (float) this.anInt7088))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt7105 * (this.aClass32_Sub2_4.aFloat48 + this.aClass32_Sub2_4.aFloat50 * (float) arg2 + (float) arg0 * this.aClass32_Sub2_4.aFloat54 + (float) arg1 * this.aClass32_Sub2_4.aFloat52) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt7105 * (this.aClass32_Sub2_4.aFloat48 + (float) arg3 * this.aClass32_Sub2_4.aFloat54 + (float) arg4 * this.aClass32_Sub2_4.aFloat52 + (float) arg5 * this.aClass32_Sub2_4.aFloat50) / local59);
		if ((float) local123 < this.aFloat98 && (float) local155 < this.aFloat98 || (float) local123 > this.aFloat99 && this.aFloat99 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass32_Sub2_4.aFloat55 + this.aClass32_Sub2_4.aFloat53 * (float) arg1 + (float) arg0 * this.aClass32_Sub2_4.aFloat45 + (float) arg2 * this.aClass32_Sub2_4.aFloat49) * (float) this.anInt7096 / local28);
			@Pc(245) int local245 = (int) ((this.aClass32_Sub2_4.aFloat55 + this.aClass32_Sub2_4.aFloat45 * (float) arg3 + (float) arg4 * this.aClass32_Sub2_4.aFloat53 + (float) arg5 * this.aClass32_Sub2_4.aFloat49) * (float) this.anInt7096 / local59);
			return (!(this.aFloat88 > (float) local213) || !((float) local245 < this.aFloat88)) && (!(this.aFloat100 < (float) local213) || !(this.aFloat100 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!fe;B)V")
	public void method5538(@OriginalArg(0) Interface2 arg0) {
		if (arg0 != this.anInterface2_5) {
			if (this.aBoolean755) {
				OpenGL.glBindBufferARB(34963, arg0.method3826());
			}
			this.anInterface2_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ev;Z)Lclient!o;")
	@Override
	public Class6 method5756(@OriginalArg(0) Class72 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt1855 * arg0.anInt1851];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray18 == null) {
			for (local21 = 0; local21 < arg0.anInt1851; local21++) {
				for (local25 = 0; local25 < arg0.anInt1855; local25++) {
					@Pc(38) int local38 = arg0.anIntArray129[arg0.aByteArray17[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt1851; local21++) {
				for (local25 = 0; local25 < arg0.anInt1855; local25++) {
					local12[local16++] = arg0.aByteArray18[local14] << 24 | arg0.anIntArray129[arg0.aByteArray17[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(119) Class6 local119 = this.method5798(local12, arg0.anInt1855, arg0.anInt1855, arg0.anInt1851);
		local119.ha(arg0.anInt1854, arg0.anInt1856, arg0.anInt1852, arg0.anInt1853);
		return local119;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5750() {
	}

	@OriginalMember(owner = "client!ur", name = "o", descriptor = "(B)V")
	public void method5539() {
		if (this.anInt7103 == 8) {
			return;
		}
		this.method5488();
		this.method5555(true);
		this.method5492(true);
		this.method5546(true);
		this.method5536(1);
		this.method5517(0);
		this.anInt7103 = 8;
	}

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "(II)I")
	public int method5540(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ur", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class32 arg0) {
		this.aClass32_Sub2_4 = (Class32_Sub2) arg0;
		this.aClass32_Sub2_3.method3233(this.aClass32_Sub2_4);
		if (this.anInt7116 != 1) {
			this.method5562();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I[Lclient!bn;)V")
	@Override
	public void method5730(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass1_Sub7Array3[local3] = arg1[local3];
		}
		this.anInt7109 = arg0;
		if (this.anInt7116 != 1) {
			this.method5495();
		}
	}

	@OriginalMember(owner = "client!ur", name = "p", descriptor = "(B)V")
	public void method5542() {
		if (this.anInt7103 == 4) {
			return;
		}
		this.method5524();
		this.method5555(false);
		this.method5487(false);
		this.method5492(false);
		this.method5546(false);
		this.method5556(-2);
		this.method5536(1);
		this.method5517(0);
		this.anInt7103 = 4;
	}

	@OriginalMember(owner = "client!ur", name = "q", descriptor = "(B)V")
	private void method5543() {
		@Pc(53) int local53;
		if (this.aBoolean756) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local53 = this.anInt7107;
		} else {
			this.aFloat93 = (float) (this.anInt7088 - this.anInt7089) - this.aFloat97;
			this.aFloat82 = this.aFloat93 - (float) this.anInt7095 * this.aFloat87;
			if ((float) this.anInt7099 > this.aFloat82) {
				this.aFloat82 = this.anInt7099;
			}
			OpenGL.glFogf(2915, this.aFloat82);
			OpenGL.glFogf(2916, this.aFloat93);
			local53 = this.anInt7114;
		}
		Static294.aFloatArray22[2] = (float) (local53 & 0xFF) / 255.0F;
		Static294.aFloatArray22[1] = (float) (local53 & 0xFF00) / 65280.0F;
		Static294.aFloatArray22[0] = (float) (local53 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static294.aFloatArray22, 0);
		if (this.aBoolean756) {
			this.aClass240_1.aClass38_Sub8_1.method5051();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIBLclient!jaggl/memory/NativeBuffer;Z)Lclient!se;")
	public Interface10 method5544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) NativeBuffer arg2) {
		return (Interface10) (this.aBoolean755 ? new Class51_Sub1(this, arg1, arg2, arg0, false) : new Class56_Sub2(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "(I)V")
	private void method5545() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean756) {
			throw new RuntimeException("");
		}
		this.anInt7107 = arg1;
		this.anInt7093 = arg2;
		this.anInt7115 = arg3;
		this.anInt7087 = arg0;
		this.aClass240_1.aClass38_Sub8_1.method5052();
		this.method5543();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BZ)V")
	public void method5546(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean758 != arg0) {
			this.aBoolean758 = arg0;
			this.method5490();
			this.anInt7103 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(Z)V")
	private void method5547() {
		if (this.aBoolean771 && this.anInt7095 >= 0 | this.aBoolean756) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ur", name = "v", descriptor = "(I)V")
	private void method5548() {
		@Pc(15) float local15 = (float) -this.anInt7112 * this.aFloat84 / (float) this.anInt7105;
		@Pc(27) float local27 = this.aFloat84 * (float) -this.anInt7091 / (float) this.anInt7096;
		@Pc(41) float local41 = (float) (this.anInt6997 - this.anInt7112) * this.aFloat84 / (float) this.anInt7105;
		@Pc(56) float local56 = (float) (this.anInt6906 - this.anInt7091) * this.aFloat84 / (float) this.anInt7096;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local41 != local15 && local27 != local56) {
			OpenGL.glOrtho((double) local15, (double) local41, (double) -local56, (double) -local27, (double) ((float) this.anInt7099 - this.aFloat101), (double) ((float) this.anInt7088 - this.aFloat101));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(IZ)I")
	public int method5549(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!tp;Lclient!tp;Lclient!tp;ILclient!tp;)V")
	public void method5550(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(4) Class238 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5516(arg0.anInterface10_5);
			OpenGL.glVertexPointer(arg0.aByte102, arg0.aShort107, this.anInterface10_7.method5246(), this.anInterface10_7.method5247() + (long) arg0.aByte101);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5516(arg3.anInterface10_5);
			OpenGL.glNormalPointer(arg3.aShort107, this.anInterface10_7.method5246(), this.anInterface10_7.method5247() + (long) arg3.aByte101);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5516(arg2.anInterface10_5);
			OpenGL.glColorPointer(arg2.aByte102, arg2.aShort107, this.anInterface10_7.method5246(), this.anInterface10_7.method5247() + (long) arg2.aByte101);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5516(arg1.anInterface10_5);
			OpenGL.glTexCoordPointer(arg1.aByte102, arg1.aShort107, this.anInterface10_7.method5246(), this.anInterface10_7.method5247() + (long) arg1.aByte101);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ur", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!ur", name = "w", descriptor = "()V")
	@Override
	protected void method5786() {
		for (@Pc(10) Class1 local10 = this.aClass227_44.method4967(); local10 != null; local10 = this.aClass227_44.method4973()) {
			((Class1_Sub12_Sub1) local10).method1063();
		}
		if (this.aClass186_1 != null) {
			this.aClass186_1.method4144();
		}
		if (this.anOpenGL1 != null) {
			this.method5545();
			@Pc(40) Enumeration local40 = this.aHashtable2.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable2.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean750) {
			Static109.method3817(false, true);
			this.aBoolean750 = false;
		}
	}

	@OriginalMember(owner = "client!ur", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5498();
		this.method5536(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ur", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7096 = arg3;
		this.anInt7112 = arg0;
		this.anInt7091 = arg1;
		this.anInt7105 = arg2;
		this.method5537();
		this.method5483();
		if (this.anInt7116 == 3) {
			this.method5548();
		} else if (this.anInt7116 == 2) {
			this.method5522();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IF)V")
	public void method5551(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat84) {
			this.aFloat84 = arg0;
			if (this.anInt7116 == 3) {
				this.method5548();
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([Lclient!e;Lclient!eu;Lclient!c;[Lclient!ut;I)V")
	@Override
	public void method5797(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class4_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method5771(arg0, arg2, arg3, arg4);
		this.method5741(arg1);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIB)V")
	public void method5552(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ur", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class104_Sub2 local6 = (Class104_Sub2) arg1;
		@Pc(9) Class10_Sub1_Sub1 local9 = local6.aClass10_Sub1_Sub1_2;
		this.method5530();
		this.method5493(local6.aClass10_Sub1_Sub1_2);
		this.method5536(1);
		this.method5526(7681, 8448);
		this.method5486(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat7 / (float) local9.anInt262;
		@Pc(46) float local46 = local9.aFloat6 / (float) local9.anInt263;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt7090 - arg2) * local39, local46 * (float) (this.anInt7101 - arg3));
		OpenGL.glVertex2i(this.anInt7090, this.anInt7101);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7090 - arg2), local46 * (float) (this.anInt7082 - arg3));
		OpenGL.glVertex2i(this.anInt7090, this.anInt7082);
		OpenGL.glTexCoord2f((float) (this.anInt7098 - arg2) * local39, local46 * (float) (this.anInt7082 - arg3));
		OpenGL.glVertex2i(this.anInt7098, this.anInt7082);
		OpenGL.glTexCoord2f((float) (this.anInt7098 - arg2) * local39, (float) (this.anInt7101 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt7098, this.anInt7101);
		OpenGL.glEnd();
		this.method5486(5890, 0, 768);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!ut;I)V")
	@Override
	public void method5771(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class4_Sub8[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method5953(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "r", descriptor = "(B)V")
	public void method5553() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray28, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray31, 0);
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(ILclient!ju;)V")
	public void method5554(@OriginalArg(1) Interface5 arg0) {
		if (this.anInt7075 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7075 >= 0) {
			this.anInterface5Array1[this.anInt7075].method3656();
		}
		this.anInterface5_2 = this.anInterface5Array1[++this.anInt7075] = arg0;
		this.anInterface5_2.method3652();
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(ZI)V")
	public void method5555(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean771) {
			this.aBoolean771 = arg0;
			this.method5547();
			this.anInt7103 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ur", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt7114 && arg1 == this.anInt7095 && this.anInt7089 == arg2) {
			return;
		}
		this.anInt7089 = arg2;
		this.anInt7095 = arg1;
		this.anInt7114 = arg0;
		if (!this.aBoolean756) {
			this.method5543();
			this.method5547();
		}
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(IB)V")
	public void method5556(@OriginalArg(0) int arg0) {
		this.method5523(arg0, true);
	}

	@OriginalMember(owner = "client!ur", name = "w", descriptor = "(I)V")
	private void method5557() {
		if (this.anInt7098 >= this.anInt7090 && this.anInt7101 <= this.anInt7082) {
			OpenGL.glScissor(this.anInt7100 + this.anInt7090, -this.anInt7082 + this.anInt6906 + this.bf, this.anInt7098 - this.anInt7090, -this.anInt7101 + this.anInt7082);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "x", descriptor = "(I)V")
	public void method5558() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "(II)I")
	public int method5559(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	@Override
	public void method5742(@OriginalArg(0) int arg0) {
		this.method5508();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZIIZ)V")
	public void method5560(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt7106 != arg1) {
			if (arg1 < 0) {
				this.method5511();
				this.method5493(null);
				this.method5517(0);
				if (!this.aBoolean756) {
					this.aClass240_1.method5188(arg0, 0, arg2, 0, 0);
				}
			} else {
				@Pc(54) Class10_Sub1 local54 = this.aClass228_1.method4984(arg1);
				@Pc(60) Class114 local60 = super.anInterface6_8.method3937(arg1);
				if (local60.aByte28 == 0 && local60.aByte27 == 0) {
					this.method5511();
				} else {
					@Pc(83) int local83 = local60.aBoolean339 ? 64 : 128;
					@Pc(87) int local87 = local83 * 50;
					this.method5497(0.0F, (float) (this.anInt7073 % local87 * local60.aByte28) / (float) local87, (float) (local60.aByte27 * (this.anInt7073 % local87)) / (float) local87);
				}
				if (this.aBoolean756) {
					this.method5493(local54);
					this.method5517(local60.anInt2891);
				} else {
					this.aClass240_1.method5188(arg0, local60.aByte30, arg2, local60.anInt2895, local60.aByte26);
					if (!this.aClass240_1.method5185(local54, local60.anInt2891)) {
						this.method5493(local54);
						this.method5517(local60.anInt2891);
					}
				}
			}
			this.anInt7106 = arg1;
		}
		this.anInt7103 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "()Z")
	@Override
	public boolean method5734() {
		return this.aClass1_Sub21_Sub1_1 != null && this.aClass1_Sub21_Sub1_1.method2206();
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)V")
	public synchronized void method5561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class1_Sub26 local14 = new Class1_Sub26(arg0);
		local14.aLong230 = arg1;
		this.aClass227_47.method4972(local14);
	}

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "(B)V")
	private void method5562() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass32_Sub2_4.method3239(), 0);
		if (this.aBoolean756) {
			this.aClass240_1.aClass38_Sub8_1.method5052();
		}
		this.method5553();
		this.method5495();
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(III)V")
	public void method5563(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7100 = arg0;
		this.bf = arg1;
		this.method5527();
		this.method5557();
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)I")
	@Override
	public int method5787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([BIIZI)Lclient!se;")
	public Interface10 method5564(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		return (Interface10) (this.aBoolean755 && (!arg2 || this.aBoolean754) ? new Class51_Sub1(this, arg3, arg0, arg1, arg2) : new Class56_Sub2(this, arg3, arg0, arg1));
	}

	@OriginalMember(owner = "client!ur", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt7097 != arg0;
		if (local11 || arg1 != this.aFloat95 || this.aFloat94 != arg2) {
			this.anInt7097 = arg0;
			this.aFloat94 = arg2;
			this.aFloat95 = arg1;
			if (local11) {
				this.aFloat102 = (float) (this.anInt7097 & 0xFF0000) / 1.671168E7F;
				this.aFloat85 = (float) (this.anInt7097 & 0xFF00) / 65280.0F;
				this.aFloat96 = (float) (this.anInt7097 & 0xFF) / 255.0F;
				this.method5532();
			}
			this.method5566();
		}
		if (arg3 == this.aFloatArray30[0] && arg4 == this.aFloatArray30[1] && arg5 == this.aFloatArray30[2]) {
			return;
		}
		this.aFloatArray30[2] = arg5;
		this.aFloatArray30[1] = arg4;
		this.aFloatArray30[0] = arg3;
		this.aFloatArray29[0] = -arg3;
		this.aFloatArray29[1] = -arg4;
		this.aFloatArray29[2] = -arg5;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray28[0] = local138 * arg3;
		this.aFloatArray28[2] = arg5 * local138;
		this.aFloatArray28[1] = local138 * arg4;
		this.aFloatArray31[0] = -this.aFloatArray28[0];
		this.aFloatArray31[1] = -this.aFloatArray28[1];
		this.aFloatArray31[2] = -this.aFloatArray28[2];
		this.method5553();
		this.anInt7111 = (int) (arg3 * 256.0F / arg4);
		this.anInt7083 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "(I)Lclient!n;")
	@Override
	public Class1_Sub12 method5795(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub12_Sub1 local8 = new Class1_Sub12_Sub1(arg0);
		this.aClass227_44.method4972(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "()Z")
	@Override
	public boolean method5760() {
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZII[BI)Lclient!fe;")
	public Interface2 method5565(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		return (Interface2) (this.aBoolean755 && (!arg0 || this.aBoolean754) ? new Class51_Sub2(this, 5123, arg2, arg1, arg0) : new Class56_Sub1(this, 5123, arg2, arg1));
	}

	@OriginalMember(owner = "client!ur", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt6906 - arg1 - local12, arg2, 1, 32993, this.anInt7113, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ur", name = "o", descriptor = "()Z")
	@Override
	public boolean method5770() {
		return this.aClass240_1.method5190();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5735(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas6 == arg0) {
			local5 = this.aLong216;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas7) {
			this.method5491();
		}
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method5498();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method5536(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean763) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean763) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "()Z")
	@Override
	public boolean method5755() {
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass186_1.method4142(arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "()V")
	@Override
	public void method5780() {
		this.aClass186_1.method4139();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5778(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static136.aFloat79 = arg1;
		Static96.aFloat42 = arg2;
		Static37.aFloat9 = arg0;
	}

	@OriginalMember(owner = "client!ur", name = "y", descriptor = "(I)V")
	private void method5566() {
		Static294.aFloatArray22[1] = this.aFloat95 * this.aFloat85;
		Static294.aFloatArray22[3] = 1.0F;
		Static294.aFloatArray22[0] = this.aFloat95 * this.aFloat102;
		Static294.aFloatArray22[2] = this.aFloat96 * this.aFloat95;
		OpenGL.glLightfv(16384, 4609, Static294.aFloatArray22, 0);
		Static294.aFloatArray22[2] = this.aFloat96 * -this.aFloat94;
		Static294.aFloatArray22[3] = 1.0F;
		Static294.aFloatArray22[0] = this.aFloat102 * -this.aFloat94;
		Static294.aFloatArray22[1] = -this.aFloat94 * this.aFloat85;
		OpenGL.glLightfv(16385, 4609, Static294.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!e;Lclient!eu;Lclient!c;Lclient!ut;I)V")
	@Override
	public void method5762(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class4_Sub8 arg3) {
		arg0.method5953(arg2, arg3, 0);
		this.method5741(arg1);
	}

	@OriginalMember(owner = "client!ur", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(41) float local41;
		if (this.aClass10_Sub1_Sub1_5 == null || this.aClass10_Sub1_Sub1_5.anInt257 < arg2 || this.aClass10_Sub1_Sub1_5.anInt252 < arg3) {
			this.aClass10_Sub1_Sub1_5 = Static264.method3745(arg3, arg2, this, arg6);
			this.aClass10_Sub1_Sub1_5.method201(false, false);
			local41 = this.aClass10_Sub1_Sub1_5.aFloat7;
			local45 = this.aClass10_Sub1_Sub1_5.aFloat6;
		} else {
			this.aClass10_Sub1_Sub1_5.method197(arg6, arg3, 6406, false, arg2);
			local41 = this.aClass10_Sub1_Sub1_5.aFloat7 * (float) arg2 / (float) this.aClass10_Sub1_Sub1_5.anInt257;
			local45 = this.aClass10_Sub1_Sub1_5.aFloat6 * (float) arg3 / (float) this.aClass10_Sub1_Sub1_5.anInt252;
		}
		this.method5530();
		this.method5493(this.aClass10_Sub1_Sub1_5);
		this.method5536(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5533(arg5);
		this.method5526(34165, 34165);
		this.method5486(34166, 0, 768);
		this.method5486(5890, 2, 770);
		this.method5534(0, 34166);
		this.method5534(2, 5890);
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
		this.method5486(5890, 0, 768);
		this.method5486(34166, 2, 770);
		this.method5534(0, 5890);
		this.method5534(2, 34166);
	}
}
