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

@OriginalClass("client!dia")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!dia", name = "r", descriptor = "I")
	private int anInt1958;

	@OriginalMember(owner = "client!dia", name = "Eb", descriptor = "I")
	private int anInt2020;

	@OriginalMember(owner = "client!dia", name = "Lc", descriptor = "I")
	public int anInt2076;

	@OriginalMember(owner = "client!dia", name = "Rd", descriptor = "I")
	public int anInt2132;

	@OriginalMember(owner = "client!dia", name = "xe", descriptor = "I")
	public int anInt2155;

	@OriginalMember(owner = "client!dia", name = "ye", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!dia", name = "Ce", descriptor = "Lclient!mj;")
	private Class221 aClass221_3;

	@OriginalMember(owner = "client!dia", name = "De", descriptor = "Lclient!rp;")
	private Class33_Sub3 aClass33_Sub3_1;

	@OriginalMember(owner = "client!dia", name = "Ee", descriptor = "Lclient!hga;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!dia", name = "Ke", descriptor = "Lclient!hga;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!dia", name = "Me", descriptor = "I")
	private int anInt2160;

	@OriginalMember(owner = "client!dia", name = "Ne", descriptor = "I")
	public int anInt2161;

	@OriginalMember(owner = "client!dia", name = "Oe", descriptor = "I")
	public int anInt2162;

	@OriginalMember(owner = "client!dia", name = "Ve", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!dia", name = "We", descriptor = "Z")
	private boolean aBoolean153;

	@OriginalMember(owner = "client!dia", name = "Xe", descriptor = "Z")
	private boolean aBoolean154;

	@OriginalMember(owner = "client!dia", name = "Ye", descriptor = "Z")
	private boolean aBoolean155;

	@OriginalMember(owner = "client!dia", name = "Ze", descriptor = "I")
	private int anInt2163;

	@OriginalMember(owner = "client!dia", name = "af", descriptor = "Z")
	private boolean aBoolean156;

	@OriginalMember(owner = "client!dia", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!dia", name = "df", descriptor = "I")
	private int anInt2164;

	@OriginalMember(owner = "client!dia", name = "hf", descriptor = "I")
	public int anInt2165;

	@OriginalMember(owner = "client!dia", name = "lf", descriptor = "Z")
	private boolean aBoolean158;

	@OriginalMember(owner = "client!dia", name = "mf", descriptor = "Lclient!fha;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!dia", name = "nf", descriptor = "Z")
	private boolean aBoolean159;

	@OriginalMember(owner = "client!dia", name = "of", descriptor = "Z")
	private boolean aBoolean160;

	@OriginalMember(owner = "client!dia", name = "qf", descriptor = "Z")
	public boolean aBoolean161;

	@OriginalMember(owner = "client!dia", name = "rf", descriptor = "Z")
	private boolean aBoolean162;

	@OriginalMember(owner = "client!dia", name = "tf", descriptor = "Lclient!we;")
	public Class381 aClass381_5;

	@OriginalMember(owner = "client!dia", name = "vf", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!dia", name = "xf", descriptor = "Z")
	public boolean aBoolean163;

	@OriginalMember(owner = "client!dia", name = "Bf", descriptor = "Lclient!we;")
	public Class381 aClass381_6;

	@OriginalMember(owner = "client!dia", name = "Cf", descriptor = "Z")
	public boolean aBoolean166;

	@OriginalMember(owner = "client!dia", name = "Ff", descriptor = "Lclient!fha;")
	private Interface9 anInterface9_3;

	@OriginalMember(owner = "client!dia", name = "Gf", descriptor = "Lclient!nha;")
	public Class95_Sub3 aClass95_Sub3_1;

	@OriginalMember(owner = "client!dia", name = "If", descriptor = "Lclient!nha;")
	public Class95_Sub3 aClass95_Sub3_2;

	@OriginalMember(owner = "client!dia", name = "Jf", descriptor = "I")
	private int anInt2170;

	@OriginalMember(owner = "client!dia", name = "Lf", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!dia", name = "Mf", descriptor = "I")
	private int anInt2172;

	@OriginalMember(owner = "client!dia", name = "Nf", descriptor = "Z")
	public boolean aBoolean169;

	@OriginalMember(owner = "client!dia", name = "Pf", descriptor = "Lclient!nha;")
	public Class95_Sub3 aClass95_Sub3_3;

	@OriginalMember(owner = "client!dia", name = "Rf", descriptor = "F")
	private float aFloat51;

	@OriginalMember(owner = "client!dia", name = "Tf", descriptor = "I")
	public int anInt2175;

	@OriginalMember(owner = "client!dia", name = "Uf", descriptor = "Ljava/lang/String;")
	private String aString19;

	@OriginalMember(owner = "client!dia", name = "Vf", descriptor = "Lclient!nha;")
	public Class95_Sub3 aClass95_Sub3_4;

	@OriginalMember(owner = "client!dia", name = "Xf", descriptor = "Z")
	public boolean aBoolean170;

	@OriginalMember(owner = "client!dia", name = "Yf", descriptor = "Lclient!nha;")
	public Class95_Sub3 aClass95_Sub3_5;

	@OriginalMember(owner = "client!dia", name = "ag", descriptor = "I")
	public int anInt2177;

	@OriginalMember(owner = "client!dia", name = "dg", descriptor = "I")
	private int anInt2179;

	@OriginalMember(owner = "client!dia", name = "eg", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!dia", name = "gg", descriptor = "F")
	private float aFloat53;

	@OriginalMember(owner = "client!dia", name = "kg", descriptor = "I")
	private int anInt2182;

	@OriginalMember(owner = "client!dia", name = "ng", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!dia", name = "pg", descriptor = "Lclient!mj;")
	public Class221 aClass221_4;

	@OriginalMember(owner = "client!dia", name = "sg", descriptor = "I")
	private int anInt2185;

	@OriginalMember(owner = "client!dia", name = "ug", descriptor = "I")
	public int anInt2186;

	@OriginalMember(owner = "client!dia", name = "wg", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!dia", name = "xg", descriptor = "Z")
	public boolean aBoolean173;

	@OriginalMember(owner = "client!dia", name = "zg", descriptor = "Lclient!tca;")
	public Class85_Sub3 aClass85_Sub3_3;

	@OriginalMember(owner = "client!dia", name = "Cg", descriptor = "Lclient!nha;")
	public Class95_Sub3 aClass95_Sub3_6;

	@OriginalMember(owner = "client!dia", name = "Dg", descriptor = "Lclient!gf;")
	private Class35_Sub2 aClass35_Sub2_1;

	@OriginalMember(owner = "client!dia", name = "Eg", descriptor = "Lclient!m;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!dia", name = "Gg", descriptor = "Lclient!nha;")
	public Class95_Sub3 aClass95_Sub3_7;

	@OriginalMember(owner = "client!dia", name = "Hg", descriptor = "Z")
	public boolean aBoolean174;

	@OriginalMember(owner = "client!dia", name = "Jg", descriptor = "I")
	private int anInt2190;

	@OriginalMember(owner = "client!dia", name = "Kg", descriptor = "Z")
	public boolean aBoolean175;

	@OriginalMember(owner = "client!dia", name = "Mg", descriptor = "[Lclient!il;")
	private Class85[] aClass85Array1;

	@OriginalMember(owner = "client!dia", name = "Og", descriptor = "I")
	private int anInt2191;

	@OriginalMember(owner = "client!dia", name = "Rg", descriptor = "Lclient!nha;")
	public Class95_Sub3 aClass95_Sub3_8;

	@OriginalMember(owner = "client!dia", name = "Tg", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!dia", name = "Ug", descriptor = "Z")
	private boolean aBoolean177;

	@OriginalMember(owner = "client!dia", name = "Vg", descriptor = "Z")
	private boolean aBoolean178;

	@OriginalMember(owner = "client!dia", name = "Wg", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!dia", name = "Zg", descriptor = "Lclient!me;")
	private Class85_Sub3_Sub1 aClass85_Sub3_Sub1_3;

	@OriginalMember(owner = "client!dia", name = "bh", descriptor = "F")
	private float aFloat63;

	@OriginalMember(owner = "client!dia", name = "ch", descriptor = "I")
	private int anInt2196;

	@OriginalMember(owner = "client!dia", name = "dh", descriptor = "Lclient!nha;")
	public Class95_Sub3 aClass95_Sub3_9;

	@OriginalMember(owner = "client!dia", name = "eh", descriptor = "Z")
	private boolean aBoolean180;

	@OriginalMember(owner = "client!dia", name = "fh", descriptor = "Lclient!nha;")
	public Class95_Sub3 aClass95_Sub3_10;

	@OriginalMember(owner = "client!dia", name = "hh", descriptor = "Z")
	public boolean aBoolean181;

	@OriginalMember(owner = "client!dia", name = "ih", descriptor = "Z")
	public boolean aBoolean182;

	@OriginalMember(owner = "client!dia", name = "oh", descriptor = "I")
	private int anInt2199;

	@OriginalMember(owner = "client!dia", name = "th", descriptor = "I")
	private int anInt2200;

	@OriginalMember(owner = "client!dia", name = "wd", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!dia", name = "fe", descriptor = "I")
	public int anInt2144 = 128;

	@OriginalMember(owner = "client!dia", name = "he", descriptor = "Lclient!fka;")
	private final Class105 aClass105_1 = new Class105();

	@OriginalMember(owner = "client!dia", name = "se", descriptor = "Lclient!ra;")
	private final Class239_Sub2 aClass239_Sub2_1 = new Class239_Sub2();

	@OriginalMember(owner = "client!dia", name = "te", descriptor = "Lclient!ra;")
	public final Class239_Sub2 aClass239_Sub2_2 = new Class239_Sub2();

	@OriginalMember(owner = "client!dia", name = "ue", descriptor = "I")
	public int anInt2154 = 3;

	@OriginalMember(owner = "client!dia", name = "we", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!dia", name = "ze", descriptor = "I")
	public int anInt2156 = 8;

	@OriginalMember(owner = "client!dia", name = "Ae", descriptor = "Lclient!tm;")
	private final Class338 aClass338_48 = new Class338();

	@OriginalMember(owner = "client!dia", name = "Be", descriptor = "I")
	private int anInt2157 = -1;

	@OriginalMember(owner = "client!dia", name = "He", descriptor = "I")
	private int anInt2158 = -1;

	@OriginalMember(owner = "client!dia", name = "Fe", descriptor = "[Lclient!hga;")
	private final Interface12[] anInterface12Array1 = new Interface12[4];

	@OriginalMember(owner = "client!dia", name = "Ge", descriptor = "[Lclient!hga;")
	private final Interface12[] anInterface12Array2 = new Interface12[4];

	@OriginalMember(owner = "client!dia", name = "Ie", descriptor = "[Lclient!hga;")
	private final Interface12[] anInterface12Array3 = new Interface12[4];

	@OriginalMember(owner = "client!dia", name = "Je", descriptor = "I")
	private int anInt2159 = -1;

	@OriginalMember(owner = "client!dia", name = "Le", descriptor = "Lclient!tm;")
	private final Class338 aClass338_49;

	@OriginalMember(owner = "client!dia", name = "Pe", descriptor = "Lclient!tm;")
	private final Class338 aClass338_50;

	@OriginalMember(owner = "client!dia", name = "Qe", descriptor = "Lclient!tm;")
	private final Class338 aClass338_51;

	@OriginalMember(owner = "client!dia", name = "Re", descriptor = "Lclient!tm;")
	private final Class338 aClass338_52;

	@OriginalMember(owner = "client!dia", name = "Se", descriptor = "Lclient!tm;")
	private final Class338 aClass338_53;

	@OriginalMember(owner = "client!dia", name = "Te", descriptor = "Lclient!tm;")
	private final Class338 aClass338_54;

	@OriginalMember(owner = "client!dia", name = "Ue", descriptor = "Lclient!tm;")
	private final Class338 aClass338_55;

	@OriginalMember(owner = "client!dia", name = "cf", descriptor = "Lclient!ra;")
	public final Class239_Sub2 aClass239_Sub2_3;

	@OriginalMember(owner = "client!dia", name = "ef", descriptor = "Lclient!ra;")
	public final Class239_Sub2 aClass239_Sub2_4;

	@OriginalMember(owner = "client!dia", name = "ff", descriptor = "Lclient!ra;")
	public final Class239_Sub2 aClass239_Sub2_5;

	@OriginalMember(owner = "client!dia", name = "jf", descriptor = "I")
	private int anInt2166;

	@OriginalMember(owner = "client!dia", name = "wf", descriptor = "I")
	public int anInt2168;

	@OriginalMember(owner = "client!dia", name = "uf", descriptor = "F")
	private float aFloat47;

	@OriginalMember(owner = "client!dia", name = "Zf", descriptor = "[F")
	public final float[] aFloatArray17;

	@OriginalMember(owner = "client!dia", name = "sf", descriptor = "I")
	public int anInt2167;

	@OriginalMember(owner = "client!dia", name = "Wf", descriptor = "I")
	private int anInt2176;

	@OriginalMember(owner = "client!dia", name = "Qf", descriptor = "I")
	public int anInt2173;

	@OriginalMember(owner = "client!dia", name = "cg", descriptor = "I")
	public int anInt2178;

	@OriginalMember(owner = "client!dia", name = "qg", descriptor = "I")
	private int anInt2184;

	@OriginalMember(owner = "client!dia", name = "ig", descriptor = "I")
	private int anInt2180;

	@OriginalMember(owner = "client!dia", name = "jg", descriptor = "I")
	private int anInt2181;

	@OriginalMember(owner = "client!dia", name = "vg", descriptor = "I")
	private int anInt2187;

	@OriginalMember(owner = "client!dia", name = "Of", descriptor = "[Lclient!uca;")
	private final Class3_Sub15[] aClass3_Sub15Array2;

	@OriginalMember(owner = "client!dia", name = "Ag", descriptor = "I")
	public int anInt2189;

	@OriginalMember(owner = "client!dia", name = "Fg", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!dia", name = "Sf", descriptor = "I")
	private int anInt2174;

	@OriginalMember(owner = "client!dia", name = "tg", descriptor = "[F")
	private final float[] aFloatArray20;

	@OriginalMember(owner = "client!dia", name = "hg", descriptor = "[F")
	private final float[] aFloatArray18;

	@OriginalMember(owner = "client!dia", name = "Af", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!dia", name = "Ng", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!dia", name = "rg", descriptor = "F")
	private float aFloat55;

	@OriginalMember(owner = "client!dia", name = "Hf", descriptor = "I")
	public int anInt2169;

	@OriginalMember(owner = "client!dia", name = "bg", descriptor = "Z")
	private boolean aBoolean171;

	@OriginalMember(owner = "client!dia", name = "og", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!dia", name = "pf", descriptor = "[F")
	private final float[] aFloatArray16;

	@OriginalMember(owner = "client!dia", name = "Xg", descriptor = "I")
	private int anInt2194;

	@OriginalMember(owner = "client!dia", name = "lg", descriptor = "[F")
	private final float[] aFloatArray19;

	@OriginalMember(owner = "client!dia", name = "Ig", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!dia", name = "Qg", descriptor = "I")
	public int anInt2192;

	@OriginalMember(owner = "client!dia", name = "Lg", descriptor = "F")
	private float aFloat59;

	@OriginalMember(owner = "client!dia", name = "mg", descriptor = "I")
	private int anInt2183;

	@OriginalMember(owner = "client!dia", name = "yg", descriptor = "I")
	private int anInt2188;

	@OriginalMember(owner = "client!dia", name = "Sg", descriptor = "I")
	public int anInt2193;

	@OriginalMember(owner = "client!dia", name = "Ef", descriptor = "Z")
	private boolean aBoolean168;

	@OriginalMember(owner = "client!dia", name = "jh", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!dia", name = "gh", descriptor = "I")
	public int anInt2197;

	@OriginalMember(owner = "client!dia", name = "lh", descriptor = "I")
	public int anInt2198;

	@OriginalMember(owner = "client!dia", name = "Yg", descriptor = "I")
	public int anInt2195;

	@OriginalMember(owner = "client!dia", name = "kf", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!dia", name = "mh", descriptor = "F")
	private float aFloat65;

	@OriginalMember(owner = "client!dia", name = "nh", descriptor = "F")
	private float aFloat66;

	@OriginalMember(owner = "client!dia", name = "Bg", descriptor = "Lclient!uj;")
	public Class3_Sub25_Sub2 aClass3_Sub25_Sub2_1;

	@OriginalMember(owner = "client!dia", name = "rh", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!dia", name = "ph", descriptor = "[I")
	public int[] anIntArray163;

	@OriginalMember(owner = "client!dia", name = "qh", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!dia", name = "sh", descriptor = "[B")
	public final byte[] aByteArray13;

	@OriginalMember(owner = "client!dia", name = "Md", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas5;

	@OriginalMember(owner = "client!dia", name = "Ib", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!dia", name = "de", descriptor = "I")
	public final int anInt2142;

	@OriginalMember(owner = "client!dia", name = "Ab", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!dia", name = "Kc", descriptor = "J")
	private final long aLong59;

	@OriginalMember(owner = "client!dia", name = "Hc", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!dia", name = "Kf", descriptor = "I")
	public final int anInt2171;

	@OriginalMember(owner = "client!dia", name = "yf", descriptor = "Z")
	public boolean aBoolean164;

	@OriginalMember(owner = "client!dia", name = "zf", descriptor = "Z")
	private boolean aBoolean165;

	@OriginalMember(owner = "client!dia", name = "Df", descriptor = "Z")
	public boolean aBoolean167;

	@OriginalMember(owner = "client!dia", name = "Pg", descriptor = "Z")
	public boolean aBoolean176;

	@OriginalMember(owner = "client!dia", name = "ah", descriptor = "Z")
	private boolean aBoolean179;

	@OriginalMember(owner = "client!dia", name = "kh", descriptor = "Z")
	public boolean aBoolean183;

	@OriginalMember(owner = "client!dia", name = "fg", descriptor = "Z")
	public boolean aBoolean172;

	@OriginalMember(owner = "client!dia", name = "gf", descriptor = "Z")
	private final boolean aBoolean157;

	@OriginalMember(owner = "client!dia", name = "ke", descriptor = "Lclient!gp;")
	private final Class123 aClass123_1;

	@OriginalMember(owner = "client!dia", name = "ve", descriptor = "Lclient!lu;")
	public final Class207 aClass207_1;

	@OriginalMember(owner = "client!dia", name = "ce", descriptor = "Lclient!fw;")
	private final Class112 aClass112_1;

	@OriginalMember(owner = "client!dia", name = "be", descriptor = "Lclient!bb;")
	private Class3_Sub7_Sub1 aClass3_Sub7_Sub1_1;

	@OriginalMember(owner = "client!dia", name = "ie", descriptor = "Lclient!dk;")
	private final Class76 aClass76_1;

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class13_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class74();
		new Class83(16);
		this.aClass338_49 = new Class338();
		this.aClass338_50 = new Class338();
		this.aClass338_51 = new Class338();
		this.aClass338_52 = new Class338();
		this.aClass338_53 = new Class338();
		this.aClass338_54 = new Class338();
		this.aClass338_55 = new Class338();
		this.aClass239_Sub2_3 = new Class239_Sub2();
		this.aClass239_Sub2_4 = new Class239_Sub2();
		this.aClass239_Sub2_5 = new Class239_Sub2();
		this.anInt2166 = 8448;
		this.anInt2168 = 512;
		this.aFloat47 = -1.0F;
		this.aFloatArray17 = new float[4];
		this.anInt2167 = -1;
		this.anInt2176 = 0;
		this.anInt2173 = 50;
		this.anInt2178 = 0;
		this.anInt2184 = 0;
		this.anInt2180 = 0;
		this.anInt2181 = 0;
		this.anInt2187 = 3584;
		this.aClass3_Sub15Array2 = new Class3_Sub15[Static122.anInt2526];
		this.anInt2189 = 512;
		this.aFloat57 = 1.0F;
		this.anInt2174 = -1;
		this.aFloatArray20 = new float[4];
		this.aFloatArray18 = new float[4];
		this.aFloat49 = -1.0F;
		this.aFloat60 = -1.0F;
		this.aFloat55 = 1.0F;
		this.anInt2169 = -1;
		this.aBoolean171 = false;
		this.aFloat54 = 1.0F;
		this.aFloatArray16 = new float[16];
		this.anInt2194 = 0;
		this.aFloatArray19 = new float[4];
		this.aFloat58 = 3584.0F;
		this.anInt2192 = 0;
		this.aFloat59 = 1.0F;
		this.anInt2183 = 0;
		this.anInt2188 = 8448;
		this.anInt2193 = 0;
		this.aBoolean168 = true;
		this.aFloat64 = 3584.0F;
		this.anInt2197 = -1;
		this.anInt2198 = 0;
		this.anInt2195 = -1;
		this.aFloat46 = 1.0F;
		this.aFloat65 = -1.0F;
		this.aFloat66 = 0.0F;
		this.aClass3_Sub25_Sub2_1 = new Class3_Sub25_Sub2(8192);
		this.anIntArray165 = new int[1];
		this.anIntArray163 = new int[1];
		this.anIntArray164 = new int[1];
		this.aByteArray13 = new byte[16384];
		this.aCanvas4 = this.aCanvas5 = arg0;
		this.anInt2142 = arg2;
		if (!Static379.method5472("jaclib")) {
			throw new RuntimeException("");
		} else if (Static379.method5472("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong58 = this.aLong59 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt2142);
				if (this.aLong59 == 0L) {
					throw new RuntimeException("");
				}
				this.method2004();
				@Pc(331) int local331 = this.method1965();
				if (local331 != 0) {
					throw new RuntimeException("");
				}
				this.anInt2171 = this.aBoolean166 ? 33639 : 5121;
				if (this.aString20.indexOf("radeon") != -1) {
					@Pc(358) int local358 = 0;
					@Pc(360) boolean local360 = false;
					@Pc(362) boolean local362 = false;
					@Pc(371) String[] local371 = Static644.method8957(this.aString20.replace('/', ' '), ' ');
					for (@Pc(373) int local373 = 0; local373 < local371.length; local373++) {
						@Pc(378) String local378 = local371[local373];
						try {
							if (local378.length() > 0) {
								if (local378.charAt(0) == 'x' && local378.length() >= 3 && Static409.method5813(local378.substring(1, 3))) {
									local362 = true;
									local378 = local378.substring(1);
								}
								if (local378.equals("hd")) {
									local360 = true;
								} else {
									if (local378.startsWith("hd")) {
										local378 = local378.substring(2);
										local360 = true;
									}
									if (local378.length() >= 4 && Static409.method5813(local378.substring(0, 4))) {
										local358 = Static63.method1308(local378.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(445) Exception local445) {
						}
					}
					if (!local360 || local358 < 4000) {
						this.aBoolean164 = false;
					}
					if (!local362 && !local360) {
						if (local358 >= 7000 && local358 <= 7999) {
							this.aBoolean165 = false;
						}
						if (local358 >= 7000 && local358 <= 9250) {
							this.aBoolean167 = false;
						}
					}
					this.aBoolean176 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean179 = this.aBoolean165;
					this.aBoolean183 = true;
				}
				if (this.aString19.indexOf("intel") != -1) {
					this.aBoolean172 = false;
				}
				this.aBoolean157 = !this.aString19.equals("s3 graphics");
				if (this.aBoolean165) {
					try {
						@Pc(535) int[] local535 = new int[1];
						OpenGL.glGenBuffersARB(1, local535, 0);
					} catch (@Pc(541) Throwable local541) {
						throw new RuntimeException("");
					}
				}
				Static164.method2975(true, false);
				this.aBoolean152 = true;
				this.aClass123_1 = new Class123(this, super.anInterface4_14);
				this.method1986();
				this.aClass207_1 = new Class207(this);
				this.aClass112_1 = new Class112(this);
				if (this.aClass112_1.method3219()) {
					this.aClass3_Sub7_Sub1_1 = new Class3_Sub7_Sub1(this);
					if (!this.aClass3_Sub7_Sub1_1.method785()) {
						this.aClass3_Sub7_Sub1_1.method783();
						this.aClass3_Sub7_Sub1_1 = null;
					}
				}
				this.aClass76_1 = new Class76(this);
				this.method1953();
				this.method2001();
				this.method8480();
			} catch (@Pc(615) Throwable local615) {
				local615.printStackTrace();
				this.method8455();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZIZI)V")
	public void method1951(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 != this.anInt2190 || this.aBoolean171 != this.aBoolean163) {
			@Pc(10) Class85_Sub3 local10 = null;
			@Pc(12) int local12 = 0;
			@Pc(14) byte local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23 = this.aBoolean163 ? 3 : 0;
			if (arg2 < 0) {
				this.method1955();
			} else {
				local10 = this.aClass123_1.method3647(arg2);
				@Pc(37) Class119 local37 = super.anInterface4_14.method4673(arg2);
				if (local37.aByte57 == 0 && local37.aByte59 == 0) {
					this.method1955();
				} else {
					@Pc(56) int local56 = local37.aBoolean292 ? 64 : 128;
					@Pc(60) int local60 = local56 * 50;
					this.method2006((float) (this.anInt2155 % local60 * local37.aByte59) / (float) local60, 0.0F, (float) (local37.aByte57 * (this.anInt2155 % local60)) / (float) local60);
				}
				local12 = local37.anInt3896;
				if (!this.aBoolean163) {
					local14 = local37.aByte56;
					local23 = local37.aByte54;
					local16 = local37.anInt3899;
				}
			}
			this.aClass76_1.method2054(local14, arg0, local23, local16, arg1);
			if (!this.aClass76_1.method2053(local10, local12)) {
				this.method2024(local10);
				this.method1960(local12);
			}
			this.anInt2190 = arg2;
			this.aBoolean171 = this.aBoolean163;
		}
		this.bf &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(Z)V")
	private void method1952() {
		if (this.anInt2176 >= this.anInt2183 && this.anInt2184 <= this.anInt2194) {
			OpenGL.glScissor(this.anInt2183 + this.anInt2180, this.anInt2132 + this.anInt2181 + -this.anInt2194, this.anInt2176 - this.anInt2183, -this.anInt2184 + this.anInt2194);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "(Z)V")
	private void method1953() {
		this.method2011(-2);
		for (@Pc(12) int local12 = this.anInt2175 - 1; local12 >= 0; local12--) {
			this.method2008(local12);
			this.method2024((Class85) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method1993(8448, 8448);
		this.method2012(34168, 770, 2);
		this.method1955();
		this.anInt2163 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt2164 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean154 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean155 = true;
		this.method2013(true);
		this.method1988(true);
		this.method1958(true);
		this.method1954(true);
		this.method2000();
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
		this.anInt2174 = this.anInt2169 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!dia", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BZ)V")
	public void method1954(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean153 != arg0) {
			this.aBoolean153 = arg0;
			this.method2010();
			this.bf &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "(B)V")
	private void method1955() {
		if (this.aBoolean177) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean177 = false;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!eia;[Lclient!eu;Z)Lclient!da;")
	@Override
	public Class69 method8515(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class97[] arg1) {
		return new Class69_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IB)V")
	public synchronized void method1956(@OriginalArg(0) int arg0) {
		@Pc(15) Class3 local15 = new Class3();
		local15.aLong311 = (long) arg0;
		this.aClass338_54.method8171(local15);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!m;IIZI)V")
	public void method1957(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg0.method6787();
		@Pc(20) int local20 = arg2 * this.method2029(local7);
		this.method2023(arg0);
		OpenGL.glDrawElements(4, arg1, local7, (long) local20 + arg0.method6788());
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "()Z")
	@Override
	public boolean method8451() {
		return this.aClass3_Sub7_Sub1_1 != null && this.aClass3_Sub7_Sub1_1.method774();
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass112_1.method3216(arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!dia", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt2162 + this.anInt2161 + this.anInt2160;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!ef;)V")
	@Override
	public void method8499(@OriginalArg(0) Class84 arg0) {
		this.aClass105_1.method3087(arg0, -1, this);
	}

	@OriginalMember(owner = "client!dia", name = "e", descriptor = "()V")
	@Override
	public void method8457() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V")
	@Override
	public void method8458(@OriginalArg(0) int arg0) {
		this.method2004();
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8445(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas5) {
			local5 = this.aLong59;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable2.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas4) {
			this.method2001();
		}
	}

	@OriginalMember(owner = "client!dia", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2173 == arg0 && arg1 == this.anInt2187) {
			return;
		}
		this.anInt2173 = arg0;
		this.anInt2187 = arg1;
		this.method2018();
		this.method1997();
		if (this.anInt2196 == 3) {
			this.method1990();
		} else if (this.anInt2196 == 2) {
			this.method2020();
		}
	}

	@OriginalMember(owner = "client!dia", name = "y", descriptor = "()Z")
	@Override
	public boolean method8524() {
		if (this.aClass3_Sub7_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub7_Sub1_1.method774()) {
			if (!this.aClass112_1.method3214(this.aClass3_Sub7_Sub1_1)) {
				return false;
			}
			this.aClass123_1.method3645();
		}
		return true;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZZ)V")
	public void method1958(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean156) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.bf &= 0xFFFFFFE0;
		this.aBoolean156 = arg0;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!eu;Z)Lclient!vr;")
	@Override
	public Class33 method8465(@OriginalArg(0) Class97 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt2963 * arg0.anInt2960];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray24 == null) {
			for (local21 = 0; local21 < arg0.anInt2960; local21++) {
				for (local25 = 0; local25 < arg0.anInt2963; local25++) {
					@Pc(83) int local83 = arg0.anIntArray260[arg0.aByteArray23[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt2960; local21++) {
				for (local25 = 0; local25 < arg0.anInt2963; local25++) {
					local12[local16++] = arg0.aByteArray24[local14] << 24 | arg0.anIntArray260[arg0.aByteArray23[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(123) Class33 local123 = this.method8479(arg0.anInt2963, local12, arg0.anInt2960, arg0.anInt2963);
		local123.method7664(arg0.anInt2964, arg0.anInt2962, arg0.anInt2961, arg0.anInt2965);
		return local123;
	}

	@OriginalMember(owner = "client!dia", name = "e", descriptor = "(B)V")
	public void method1959() {
		if (this.bf == 8) {
			return;
		}
		this.method1991();
		this.method2013(true);
		this.method1958(true);
		this.method1954(true);
		this.method2019(1);
		this.bf = 8;
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8464(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas5) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!dia", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt2173;
	}

	@OriginalMember(owner = "client!dia", name = "g", descriptor = "(II)V")
	public void method1960(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method1993(7681, 7681);
		} else if (arg0 == 0) {
			this.method1993(8448, 8448);
		} else if (arg0 == 2) {
			this.method1993(7681, 34165);
			return;
		} else if (arg0 == 3) {
			this.method1993(8448, 260);
			return;
		} else if (arg0 == 4) {
			this.method1993(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!dia", name = "f", descriptor = "(B)V")
	private void method1961() {
		OpenGL.glViewport(this.anInt2180, this.anInt2181, this.anInt2076, this.anInt2132);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IZ)V")
	public void method1962(@OriginalArg(0) int arg0) {
		Static613.aFloatArray80[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static613.aFloatArray80[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static613.aFloatArray80[3] = (float) (arg0 >>> 24) / 255.0F;
		Static613.aFloatArray80[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static613.aFloatArray80, 0);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!bfa;Lclient!tq;)Lclient!vv;")
	@Override
	public Interface26 method8529(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Interface25 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!dia", name = "g", descriptor = "(B)V")
	private void method1963() {
		if (this.anInt2196 != 3) {
			this.anInt2196 = 3;
			this.method1990();
			this.method1999();
			this.bf &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!dia", name = "h", descriptor = "(B)V")
	public void method1964() {
		if (this.bf == 4) {
			return;
		}
		this.method2005();
		this.method2013(false);
		this.method1988(false);
		this.method1958(false);
		this.method1954(false);
		this.method2011(-2);
		this.method2019(1);
		this.bf = 4;
	}

	@OriginalMember(owner = "client!dia", name = "q", descriptor = "()Z")
	@Override
	public boolean method8492() {
		return true;
	}

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "(I)I")
	private int method1965() {
		@Pc(5) int local5 = 0;
		this.aString19 = OpenGL.glGetString(7936).toLowerCase();
		this.aString20 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString19.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString19.indexOf("brian paul") != -1 || this.aString19.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static644.method8957(local46.replace('.', ' '), ' ');
		if (local54.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(71) int local71 = Static63.method1308(local54[0]);
				@Pc(77) int local77 = Static63.method1308(local54[1]);
				this.anInt2185 = local77 + local71 * 10;
			} catch (@Pc(86) NumberFormatException local86) {
				local5 |= 0x4;
			}
		}
		if (this.anInt2185 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(120) int[] local120 = new int[1];
		OpenGL.glGetIntegerv(34018, local120, 0);
		this.anInt2175 = local120[0];
		OpenGL.glGetIntegerv(34929, local120, 0);
		this.anInt2182 = local120[0];
		OpenGL.glGetIntegerv(34930, local120, 0);
		this.anInt2172 = local120[0];
		if (this.anInt2175 < 2 || this.anInt2182 < 2 || this.anInt2172 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean166 = Stream.c();
		this.aBoolean178 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean165 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean180 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean181 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean169 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean173 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean167 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean176 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean182 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean164 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean170 = false;
		this.aBoolean172 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean174 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean175 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean159 = this.aBoolean175 & this.aBoolean174;
		this.aBoolean161 = Class6_Sub8.aString37.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static613.aFloatArray80, 0);
		this.aFloat47 = Static613.aFloatArray80[1];
		this.aFloat65 = Static613.aFloatArray80[0];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!dia", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(41) float local41;
		if (this.aClass85_Sub3_Sub1_3 == null || arg2 > this.aClass85_Sub3_Sub1_3.anInt5926 || arg3 > this.aClass85_Sub3_Sub1_3.anInt5915) {
			this.aClass85_Sub3_Sub1_3 = Static338.method5088(arg6, arg3, this, arg2);
			this.aClass85_Sub3_Sub1_3.method5365(false, false);
			local41 = this.aClass85_Sub3_Sub1_3.aFloat119;
			local45 = this.aClass85_Sub3_Sub1_3.aFloat118;
		} else {
			this.aClass85_Sub3_Sub1_3.method5368(arg2, false, arg3, arg6, 6406);
			local45 = this.aClass85_Sub3_Sub1_3.aFloat118 * (float) arg3 / (float) this.aClass85_Sub3_Sub1_3.anInt5915;
			local41 = this.aClass85_Sub3_Sub1_3.aFloat119 * (float) arg2 / (float) this.aClass85_Sub3_Sub1_3.anInt5926;
		}
		this.method1974();
		this.method2024(this.aClass85_Sub3_Sub1_3);
		this.method2019(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method1962(arg5);
		this.method1993(34165, 34165);
		this.method2012(34166, 768, 0);
		this.method2012(5890, 770, 2);
		this.method2028(0, 34166);
		this.method2028(2, 5890);
		@Pc(146) float local146 = (float) arg0;
		@Pc(149) float local149 = (float) arg1;
		@Pc(154) float local154 = local146 + (float) arg2;
		@Pc(159) float local159 = local149 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local146, local149);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local146, local159);
		OpenGL.glTexCoord2f(local45, local41);
		OpenGL.glVertex2f(local154, local159);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local154, local149);
		OpenGL.glEnd();
		this.method2012(5890, 768, 0);
		this.method2012(34166, 770, 2);
		this.method2028(0, 5890);
		this.method2028(2, 34166);
	}

	@OriginalMember(owner = "client!dia", name = "k", descriptor = "()Z")
	@Override
	public boolean method8471() {
		return this.aBoolean180 && (!this.method8451() || this.aBoolean159);
	}

	@OriginalMember(owner = "client!dia", name = "i", descriptor = "(I)V")
	private void method1966() {
		this.anOpenGL1.a();
	}

	@OriginalMember(owner = "client!dia", name = "w", descriptor = "()Z")
	@Override
	public boolean method8513() {
		return true;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(II[BZI)Lclient!fha;")
	public Interface9 method1967(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		return (Interface9) (this.aBoolean165 && (!arg2 || this.aBoolean179) ? new Class266_Sub1(this, arg3, arg1, arg0, arg2) : new Class17_Sub2(this, arg3, arg1, arg0));
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IZIZ[B)Lclient!m;")
	public Interface17 method1968(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface17) (this.aBoolean165 && (!arg1 || this.aBoolean179) ? new Class266_Sub2(this, 5123, arg2, arg0, arg1) : new Class17_Sub1(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(II)I")
	@Override
	public int method8495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!dia", name = "i", descriptor = "(B)V")
	private void method1969() {
		this.aFloat52 = (float) (this.anInt2184 - this.anInt2192);
		this.aFloat56 = (float) (this.anInt2183 - this.anInt2198);
		this.aFloat50 = (float) (this.anInt2176 - this.anInt2198);
		this.aFloat48 = (float) (this.anInt2194 - this.anInt2192);
	}

	@OriginalMember(owner = "client!dia", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt2184;
		arg0[2] = this.anInt2176;
		arg0[0] = this.anInt2183;
		arg0[3] = this.anInt2194;
	}

	@OriginalMember(owner = "client!dia", name = "j", descriptor = "(I)V")
	public void method1970() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!dn;)V")
	@Override
	public void method8462(@OriginalArg(0) Class35 arg0) {
		this.aClass35_Sub2_1 = (Class35_Sub2) arg0;
	}

	@OriginalMember(owner = "client!dia", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method2019(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!we;Lclient!we;Lclient!we;BLclient!we;)V")
	public void method1971(@OriginalArg(0) Class381 arg0, @OriginalArg(1) Class381 arg1, @OriginalArg(2) Class381 arg2, @OriginalArg(4) Class381 arg3) {
		if (arg2 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method2022(arg2.anInterface9_7);
			OpenGL.glVertexPointer(arg2.aByte167, arg2.aShort117, this.anInterface9_3.method8392(), this.anInterface9_3.method8393() + (long) arg2.aByte166);
			OpenGL.glEnableClientState(32884);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method2022(arg0.anInterface9_7);
			OpenGL.glNormalPointer(arg0.aShort117, this.anInterface9_3.method8392(), this.anInterface9_3.method8393() + (long) arg0.aByte166);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method2022(arg1.anInterface9_7);
			OpenGL.glColorPointer(arg1.aByte167, arg1.aShort117, this.anInterface9_3.method8392(), this.anInterface9_3.method8393() + (long) arg1.aByte166);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method2022(arg3.anInterface9_7);
			OpenGL.glTexCoordPointer(arg3.aByte167, arg3.aShort117, this.anInterface9_3.method8392(), this.anInterface9_3.method8393() + (long) arg3.aByte166);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!dia", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean163) {
			throw new RuntimeException("");
		}
		this.anInt2193 = arg3;
		this.anInt2197 = arg2;
		this.anInt2195 = arg1;
		this.anInt2186 = arg0;
		if (this.aBoolean171) {
			this.aClass76_1.aClass38_Sub7_1.method7285();
			this.aClass76_1.aClass38_Sub7_1.method7284();
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIB)V")
	public synchronized void method1972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub33 local8 = new Class3_Sub33(arg0);
		local8.aLong311 = (long) arg1;
		this.aClass338_53.method8171(local8);
	}

	@OriginalMember(owner = "client!dia", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method1954(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!dia", name = "h", descriptor = "()Z")
	@Override
	public boolean method8466() {
		return this.aClass3_Sub7_Sub1_1 != null && (this.anInt2142 <= 1 || this.aBoolean159);
	}

	@OriginalMember(owner = "client!dia", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2198 = arg0;
		this.anInt2168 = arg2;
		this.anInt2189 = arg3;
		this.anInt2192 = arg1;
		this.method2018();
		this.method1969();
		if (this.anInt2196 == 3) {
			this.method1990();
		} else if (this.anInt2196 == 2) {
			this.method2020();
			return;
		}
	}

	@OriginalMember(owner = "client!dia", name = "j", descriptor = "(B)V")
	public void method1973() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray17, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray18, 0);
	}

	@OriginalMember(owner = "client!dia", name = "k", descriptor = "(I)V")
	public void method1974() {
		if (this.bf == 2) {
			return;
		}
		this.method2005();
		this.method2013(false);
		this.method1988(false);
		this.method1958(false);
		this.method1954(false);
		this.method2011(-2);
		this.bf = 2;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(FIF)V")
	public void method1975(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat66 = arg0;
		this.aFloat55 = arg1;
		this.method1997();
	}

	@OriginalMember(owner = "client!dia", name = "l", descriptor = "(I)V")
	private void method1976() {
		if (this.aBoolean162 && !this.aBoolean160) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub5 method8469(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub5_Sub1 local8 = new Class3_Sub5_Sub1(arg0);
		this.aClass338_48.method8171(local8);
		return local8;
	}

	@OriginalMember(owner = "client!dia", name = "m", descriptor = "(I)V")
	private void method1977() {
		Static613.aFloatArray80[3] = 1.0F;
		Static613.aFloatArray80[2] = this.aFloat61 * this.aFloat46;
		Static613.aFloatArray80[1] = this.aFloat57 * this.aFloat61;
		Static613.aFloatArray80[0] = this.aFloat61 * this.aFloat54;
		OpenGL.glLightModelfv(2899, Static613.aFloatArray80, 0);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(IIB)V")
	public void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2181 = arg1;
		this.anInt2180 = arg0;
		this.method1961();
		this.method1952();
	}

	@OriginalMember(owner = "client!dia", name = "h", descriptor = "(II)I")
	public int method1979(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "()Lclient!uu;")
	@Override
	public Class239 method8447() {
		return this.aClass239_Sub2_1;
	}

	@OriginalMember(owner = "client!dia", name = "n", descriptor = "(I)V")
	private void method1980() {
		if (this.bf == 1) {
			return;
		}
		this.method2005();
		this.method2013(false);
		this.method1988(false);
		this.method1958(false);
		this.method1954(false);
		this.method2024((Class85) null);
		this.method2011(-2);
		this.method1960(1);
		this.bf = 1;
	}

	@OriginalMember(owner = "client!dia", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass239_Sub2_3.aFloat167 + this.aClass239_Sub2_3.aFloat160 * (float) arg0 + (float) arg1 * this.aClass239_Sub2_3.aFloat169 + this.aClass239_Sub2_3.aFloat166 * (float) arg2;
		if (local28 < (float) this.anInt2173 || (float) this.anInt2187 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((this.aClass239_Sub2_3.aFloat164 + (float) arg0 * this.aClass239_Sub2_3.aFloat163 + this.aClass239_Sub2_3.aFloat165 * (float) arg1 + (float) arg2 * this.aClass239_Sub2_3.aFloat168) * (float) this.anInt2168 / (float) arg3);
		@Pc(119) int local119 = (int) ((float) this.anInt2189 * (this.aClass239_Sub2_3.aFloat171 + this.aClass239_Sub2_3.aFloat162 * (float) arg0 + (float) arg1 * this.aClass239_Sub2_3.aFloat161 + this.aClass239_Sub2_3.aFloat170 * (float) arg2) / (float) arg3);
		if (this.aFloat56 <= (float) local86 && this.aFloat50 >= (float) local86 && (float) local119 >= this.aFloat52 && (float) local119 <= this.aFloat48) {
			arg4[0] = (int) ((float) local86 - this.aFloat56);
			arg4[1] = (int) ((float) local119 - this.aFloat52);
			arg4[2] = (int) local28;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(IB)V")
	public synchronized void method1981(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub33 local8 = new Class3_Sub33(arg0);
		this.aClass338_52.method8171(local8);
	}

	@OriginalMember(owner = "client!dia", name = "k", descriptor = "(B)V")
	public void method1982() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!dia", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1980();
		this.method2019(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!dia", name = "A", descriptor = "()V")
	@Override
	public void method8530() {
		this.aClass112_1.method3217();
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(FFFIF)V")
	public void method1983(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static613.aFloatArray80[1] = arg3;
		Static613.aFloatArray80[0] = arg0;
		Static613.aFloatArray80[2] = arg1;
		Static613.aFloatArray80[3] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static613.aFloatArray80, 0);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IF)V")
	public void method1984(@OriginalArg(1) float arg0) {
		if (this.aFloat59 != arg0) {
			this.aFloat59 = arg0;
			if (this.anInt2196 == 3) {
				this.method1990();
			}
		}
	}

	@OriginalMember(owner = "client!dia", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2195 = arg1;
		this.anInt2186 = arg0;
		this.aBoolean163 = true;
		this.anInt2193 = arg3;
		this.anInt2197 = arg2;
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(II)V")
	@Override
	public void method8484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZII)V")
	public void method1985(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.method1951(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!dia", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = (float) arg2 * this.aClass239_Sub2_3.aFloat166 + (float) arg1 * this.aClass239_Sub2_3.aFloat169 + this.aClass239_Sub2_3.aFloat160 * (float) arg0 + this.aClass239_Sub2_3.aFloat167;
		@Pc(55) float local55 = this.aClass239_Sub2_3.aFloat167 + (float) arg4 * this.aClass239_Sub2_3.aFloat169 + (float) arg3 * this.aClass239_Sub2_3.aFloat160 + (float) arg5 * this.aClass239_Sub2_3.aFloat166;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt2173 > local30 && local55 < (float) this.anInt2173) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt2187 && (float) this.anInt2187 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt2168 * (this.aClass239_Sub2_3.aFloat164 + (float) arg2 * this.aClass239_Sub2_3.aFloat168 + this.aClass239_Sub2_3.aFloat163 * (float) arg0 + this.aClass239_Sub2_3.aFloat165 * (float) arg1) / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt2168 * (this.aClass239_Sub2_3.aFloat164 + (float) arg3 * this.aClass239_Sub2_3.aFloat163 + this.aClass239_Sub2_3.aFloat165 * (float) arg4 + this.aClass239_Sub2_3.aFloat168 * (float) arg5) / (float) arg6);
		if (this.aFloat56 > (float) local124 && this.aFloat56 > (float) local157) {
			local57 |= 0x1;
		} else if (this.aFloat50 < (float) local124 && (float) local157 > this.aFloat50) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass239_Sub2_3.aFloat171 + (float) arg2 * this.aClass239_Sub2_3.aFloat170 + (float) arg1 * this.aClass239_Sub2_3.aFloat161 + (float) arg0 * this.aClass239_Sub2_3.aFloat162) * (float) this.anInt2189 / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass239_Sub2_3.aFloat162 * (float) arg3 + (float) arg4 * this.aClass239_Sub2_3.aFloat161 + this.aClass239_Sub2_3.aFloat170 * (float) arg5 + this.aClass239_Sub2_3.aFloat171) * (float) this.anInt2189 / (float) arg6);
		if (this.aFloat52 > (float) local224 && (float) local257 < this.aFloat52) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat48 && (float) local257 > this.aFloat48) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!dia", name = "o", descriptor = "(I)V")
	private void method1986() {
		this.aClass85Array1 = new Class85[this.anInt2175];
		this.aClass85_Sub3_3 = new Class85_Sub3(this, 3553, 6408, 1, 1);
		new Class85_Sub3(this, 3553, 6408, 1, 1);
		new Class85_Sub3(this, 3553, 6408, 1, 1);
		this.aClass95_Sub3_5 = new Class95_Sub3(this);
		this.aClass95_Sub3_4 = new Class95_Sub3(this);
		this.aClass95_Sub3_9 = new Class95_Sub3(this);
		this.aClass95_Sub3_6 = new Class95_Sub3(this);
		this.aClass95_Sub3_3 = new Class95_Sub3(this);
		this.aClass95_Sub3_10 = new Class95_Sub3(this);
		this.aClass95_Sub3_8 = new Class95_Sub3(this);
		this.aClass95_Sub3_7 = new Class95_Sub3(this);
		this.aClass95_Sub3_1 = new Class95_Sub3(this);
		this.aClass95_Sub3_2 = new Class95_Sub3(this);
		if (this.aBoolean172) {
			this.aClass221_4 = new Class221(this);
			new Class221(this);
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!hga;I)V")
	public void method1987(@OriginalArg(0) Interface12 arg0) {
		if (this.anInt2158 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2158 >= 0) {
			this.anInterface12Array1[this.anInt2158].method5420();
		}
		this.anInterface12_2 = this.anInterface12Array1[++this.anInt2158] = arg0;
		this.anInterface12_2.method5422();
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!gfa;IIII)Lclient!ka;")
	@Override
	public Class95 method8489(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class95_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZB)V")
	public void method1988(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean162 != arg0) {
			this.aBoolean162 = arg0;
			this.method1976();
			this.bf &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!dia", name = "p", descriptor = "(I)Lclient!efa;")
	public Class85_Sub1 method1989() {
		return this.aClass35_Sub2_1 == null ? null : this.aClass35_Sub2_1.method5092();
	}

	@OriginalMember(owner = "client!dia", name = "q", descriptor = "(I)V")
	private void method1990() {
		@Pc(23) float local23 = this.aFloat59 * (float) -this.anInt2198 / (float) this.anInt2168;
		@Pc(35) float local35 = (float) -this.anInt2192 * this.aFloat59 / (float) this.anInt2189;
		@Pc(50) float local50 = (float) (this.anInt2076 - this.anInt2198) * this.aFloat59 / (float) this.anInt2168;
		@Pc(65) float local65 = (float) (this.anInt2132 - this.anInt2192) * this.aFloat59 / (float) this.anInt2189;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local23 != local50 && local35 != local65) {
			OpenGL.glOrtho((double) local23, (double) local50, (double) -local65, (double) -local35, (double) this.anInt2173, (double) this.anInt2187);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V")
	@Override
	public void method8449() {
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method8511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method1980();
		this.method2019(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean180) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean180) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!dia", name = "r", descriptor = "(I)V")
	private void method1991() {
		if (this.anInt2196 != 2) {
			this.anInt2196 = 2;
			this.method2020();
			this.method1999();
			this.bf &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!hga;Z)V")
	public void method1992(@OriginalArg(0) Interface12 arg0) {
		if (this.aBoolean174) {
			this.method2025(arg0);
			this.method2026(arg0);
		} else if (this.anInt2157 >= 0 && this.anInterface12Array2[this.anInt2157] == arg0) {
			this.anInterface12Array2[this.anInt2157--] = null;
			arg0.method5421();
			if (this.anInt2157 >= 0) {
				this.anInterface12_2 = this.anInterface12_1 = this.anInterface12Array2[this.anInt2157];
				this.anInterface12_2.method5424();
			} else {
				this.anInterface12_2 = this.anInterface12_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dia", name = "x", descriptor = "()Lclient!cja;")
	@Override
	public Class61 method8522() {
		@Pc(7) int local7 = -1;
		if (this.aString19.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString19.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString19.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class61(local7, "OpenGL", this.anInt2185, this.aString20, 0L);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!uu;)V")
	@Override
	public void method8501(@OriginalArg(0) Class239 arg0) {
		this.aClass239_Sub2_3.method9247(arg0);
		this.aClass239_Sub2_4.method9247(this.aClass239_Sub2_3);
		this.aClass239_Sub2_4.method7198();
		this.aClass239_Sub2_5.method7194(this.aClass239_Sub2_4);
		if (this.anInt2196 != 1) {
			this.method1999();
		}
	}

	@OriginalMember(owner = "client!dia", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt2199;
		this.anInt2199 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(IIB)V")
	public void method1993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2170 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(13) boolean local13 = false;
		if (this.anInt2188 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt2188 = arg1;
			local13 = true;
		}
		if (arg0 != this.anInt2166) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local13 = true;
			this.anInt2166 = arg0;
		}
		if (local13) {
			this.bf &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(JZ)V")
	public synchronized void method1994(@OriginalArg(0) long arg0) {
		@Pc(11) Class3 local11 = new Class3();
		local11.aLong311 = arg0;
		this.aClass338_55.method8171(local11);
	}

	@OriginalMember(owner = "client!dia", name = "s", descriptor = "(I)V")
	private void method1995() {
		Static613.aFloatArray80[1] = this.aFloat57 * this.aFloat60;
		Static613.aFloatArray80[0] = this.aFloat54 * this.aFloat60;
		Static613.aFloatArray80[2] = this.aFloat46 * this.aFloat60;
		Static613.aFloatArray80[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static613.aFloatArray80, 0);
		Static613.aFloatArray80[1] = this.aFloat57 * -this.aFloat49;
		Static613.aFloatArray80[0] = this.aFloat54 * -this.aFloat49;
		Static613.aFloatArray80[2] = this.aFloat46 * -this.aFloat49;
		Static613.aFloatArray80[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static613.aFloatArray80, 0);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static461.method6717(this, arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!dia", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt2154 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt2154++;
		}
		this.anInt2156 = 0x1 << this.anInt2154;
	}

	@OriginalMember(owner = "client!dia", name = "u", descriptor = "()Z")
	@Override
	public boolean method8507() {
		return this.aClass76_1.method2056();
	}

	@OriginalMember(owner = "client!dia", name = "t", descriptor = "(I)V")
	private void method1996() {
		this.aFloatArray16[14] = this.aFloat51;
		this.aFloatArray16[10] = this.aFloat63;
		this.aFloat58 = (this.aFloatArray16[14] - (float) this.anInt2187) / this.aFloatArray16[10];
		this.aFloat64 = (float) this.anInt2187;
	}

	@OriginalMember(owner = "client!dia", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > this.anInt2076) {
			arg2 = this.anInt2076;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt2132) {
			arg3 = this.anInt2132;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt2176 = arg2;
		this.anInt2183 = arg0;
		this.anInt2194 = arg3;
		this.anInt2184 = arg1;
		OpenGL.glEnable(3089);
		this.method1969();
		this.method1952();
	}

	@OriginalMember(owner = "client!dia", name = "u", descriptor = "(I)V")
	private void method1997() {
		this.aFloat53 = (float) (this.anInt2187 - this.anInt2178) - this.aFloat66;
		this.aFloat62 = this.aFloat53 - (float) this.anInt2167 * this.aFloat55;
		if (this.aFloat62 < (float) this.anInt2173) {
			this.aFloat62 = (float) this.anInt2173;
		}
		OpenGL.glFogf(2915, this.aFloat62);
		OpenGL.glFogf(2916, this.aFloat53);
		Static613.aFloatArray80[2] = (float) (this.anInt2169 & 0xFF) / 255.0F;
		Static613.aFloatArray80[0] = (float) (this.anInt2169 & 0xFF0000) / 1.671168E7F;
		Static613.aFloatArray80[1] = (float) (this.anInt2169 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static613.aFloatArray80, 0);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(IIII)V")
	public void method1998(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!dia", name = "l", descriptor = "(B)V")
	private void method1999() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass239_Sub2_4.method7199(), 0);
		if (this.aBoolean171) {
			this.aClass76_1.aClass38_Sub7_1.method7285();
		}
		this.method1973();
		this.method2015();
	}

	@OriginalMember(owner = "client!dia", name = "m", descriptor = "(B)V")
	public void method2000() {
		if (this.anInt2196 != 0) {
			this.anInt2196 = 0;
			this.bf &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!dia", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt2194 = this.anInt2132;
		this.anInt2183 = 0;
		this.anInt2176 = this.anInt2076;
		this.anInt2184 = 0;
		OpenGL.glDisable(3089);
		this.method1969();
	}

	@OriginalMember(owner = "client!dia", name = "n", descriptor = "(B)V")
	private void method2001() {
		if (this.aCanvas4 == null) {
			this.anInt1958 = this.anInt2020 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas4.getSize();
			this.anInt2020 = local10.height;
			this.anInt1958 = local10.width;
		}
		if (this.anInterface12_1 == null) {
			this.anInt2132 = this.anInt2020;
			this.anInt2076 = this.anInt1958;
			this.method1961();
		}
		this.method2000();
		this.la();
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8473(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8484(arg2, arg3);
	}

	@OriginalMember(owner = "client!dia", name = "j", descriptor = "()Z")
	@Override
	public boolean method8470() {
		return true;
	}

	@OriginalMember(owner = "client!dia", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean163 = false;
	}

	@OriginalMember(owner = "client!dia", name = "v", descriptor = "(I)V")
	private void method2002() {
		if (this.aBoolean158 && this.anInt2167 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIZ)Lclient!vr;")
	@Override
	public Class33 method8487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class33_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(ZZ)V")
	public void method2003(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean160) {
			this.aBoolean160 = arg0;
			this.method1976();
		}
	}

	@OriginalMember(owner = "client!dia", name = "o", descriptor = "(B)V")
	private void method2004() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL1.b()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static373.method5403(1000L);
		}
	}

	@OriginalMember(owner = "client!dia", name = "e", descriptor = "(Z)V")
	private void method2005() {
		if (this.anInt2196 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt2076 > 0 && this.anInt2132 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt2076, (double) this.anInt2132, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.bf &= 0xFFFFFFE7;
		this.anInt2196 = 1;
	}

	@OriginalMember(owner = "client!dia", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt2183 || arg0 - arg2 > this.anInt2176 || arg1 + arg2 < this.anInt2184 || arg1 - arg2 > this.anInt2194) {
			return;
		}
		this.method1980();
		this.method2019(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(75) float local75 = (float) arg0 + 0.35F;
		@Pc(80) float local80 = (float) arg1 + 0.35F;
		@Pc(84) int local84 = arg2 << 1;
		if (this.aFloat65 > (float) local84) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local75 + 1.0F, local80 + 1.0F);
			OpenGL.glVertex2f(local75 + 1.0F, local80 - 1.0F);
			OpenGL.glVertex2f(local75 - 1.0F, -1.0F + local80);
			OpenGL.glVertex2f(local75 - 1.0F, local80 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat47 >= (float) local84) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local84);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local75, local80);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local75, local80);
			@Pc(153) int local153 = 262144 / (arg2 * 6);
			if (local153 <= 64) {
				local153 = 64;
			} else if (local153 > 512) {
				local153 = 512;
			}
			local153 = Static677.method9371(local153);
			OpenGL.glVertex2f((float) arg2 + local75, local80);
			for (@Pc(181) int local181 = 16384 - local153; local181 > 0; local181 -= local153) {
				OpenGL.glVertex2f(local75 + Class3_Sub11_Sub13.aFloatArray42[local181] * (float) arg2, local80 + (float) arg2 * Class3_Sub11_Sub13.aFloatArray41[local181]);
			}
			OpenGL.glVertex2f(local75 + (float) arg2, local80);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!dia", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean168 = arg0;
		this.method2010();
	}

	@OriginalMember(owner = "client!dia", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Class85_Sub3_Sub1 local9 = local6.aClass85_Sub3_Sub1_1;
		this.method1974();
		this.method2024(local6.aClass85_Sub3_Sub1_1);
		this.method2019(1);
		this.method1993(8448, 7681);
		this.method2012(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat119 / (float) local9.anInt5931;
		@Pc(46) float local46 = local9.aFloat118 / (float) local9.anInt5927;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2183 - arg2), (float) (this.anInt2184 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2183, this.anInt2184);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2183 - arg2), (float) (this.anInt2194 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2183, this.anInt2194);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2176 - arg2), local46 * (float) (this.anInt2194 - arg3));
		OpenGL.glVertex2i(this.anInt2176, this.anInt2194);
		OpenGL.glTexCoord2f((float) (this.anInt2176 - arg2) * local39, (float) (this.anInt2184 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2176, this.anInt2184);
		OpenGL.glEnd();
		this.method2012(5890, 768, 0);
	}

	@OriginalMember(owner = "client!dia", name = "o", descriptor = "()V")
	@Override
	public void method8483() {
		if (this.aClass3_Sub7_Sub1_1 != null && this.aClass3_Sub7_Sub1_1.method774()) {
			this.aClass112_1.method3224(this.aClass3_Sub7_Sub1_1);
			this.aClass123_1.method3645();
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(FFFI)V")
	private void method2006(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean177) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean177 = true;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLclient!hga;)V")
	public void method2007(@OriginalArg(1) Interface12 arg0) {
		if (this.anInt2159 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2159 >= 0) {
			this.anInterface12Array3[this.anInt2159].method5423();
		}
		this.anInterface12_1 = this.anInterface12Array3[++this.anInt2159] = arg0;
		this.anInterface12_1.method5425();
	}

	@OriginalMember(owner = "client!dia", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1980();
		this.method2019(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(I[Lclient!uca;)V")
	@Override
	public void method8472(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass3_Sub15Array2[local3] = arg1[local3];
		}
		this.anInt2179 = arg0;
		if (this.anInt2196 != 1) {
			this.method2015();
		}
	}

	@OriginalMember(owner = "client!dia", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2169 == arg0 && arg1 == this.anInt2167 && arg2 == this.anInt2178) {
			return;
		}
		this.anInt2169 = arg0;
		this.anInt2167 = arg1;
		this.anInt2178 = arg2;
		this.method1997();
		this.method2002();
	}

	@OriginalMember(owner = "client!dia", name = "i", descriptor = "(II)V")
	public void method2008(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt2170) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt2170 = arg0;
		}
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(BLclient!hga;)V")
	public void method2009(@OriginalArg(1) Interface12 arg0) {
		if (this.aBoolean174) {
			this.method1987(arg0);
			this.method2007(arg0);
		} else if (this.anInt2157 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt2157 >= 0) {
				this.anInterface12Array2[this.anInt2157].method5421();
			}
			this.anInterface12_2 = this.anInterface12_1 = this.anInterface12Array2[++this.anInt2157] = arg0;
			this.anInterface12_2.method5424();
		}
	}

	@OriginalMember(owner = "client!dia", name = "w", descriptor = "(I)V")
	private void method2010() {
		OpenGL.glDepthMask(this.aBoolean153 && this.aBoolean168);
	}

	@OriginalMember(owner = "client!dia", name = "m", descriptor = "()V")
	@Override
	public void method8480() {
		if (!this.aBoolean157 || this.anInt2076 <= 0 || this.anInt2132 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt2183;
		@Pc(22) int local22 = this.anInt2176;
		@Pc(25) int local25 = this.anInt2184;
		@Pc(28) int local28 = this.anInt2194;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method2000();
		this.method2013(false);
		this.method1988(false);
		this.method1958(false);
		this.method1954(false);
		this.method2024((Class85) null);
		this.method2011(-2);
		this.method1960(1);
		this.method2019(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt2076, this.anInt2132, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!dia", name = "j", descriptor = "(II)V")
	public void method2011(@OriginalArg(0) int arg0) {
		this.method1985(true, arg0);
	}

	@OriginalMember(owner = "client!dia", name = "p", descriptor = "()V")
	@Override
	public void method8490() {
		if (this.aBoolean172) {
			if (this.anInterface12_1 != this.aClass221_3) {
				throw new RuntimeException();
			}
			this.aClass221_3.method5433(0);
			this.aClass221_3.method5433(8);
			this.method1992(this.aClass221_3);
		} else if (this.aBoolean178) {
			this.aClass33_Sub3_1.method7653(0, 0, this.anInt2076, this.anInt2132, 0, 0);
			this.anOpenGL1.setSurface(this.aLong58);
		} else {
			throw new RuntimeException("");
		}
		this.anInt2076 = this.anInt1958;
		this.aClass33_Sub3_1 = null;
		this.anInt2132 = this.anInt2020;
		this.method2000();
		this.method1961();
		this.la();
	}

	@OriginalMember(owner = "client!dia", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt2174 != arg0;
		if (local11 || this.aFloat60 != arg1 || this.aFloat49 != arg2) {
			this.aFloat60 = arg1;
			this.anInt2174 = arg0;
			this.aFloat49 = arg2;
			if (local11) {
				this.aFloat46 = (float) (this.anInt2174 & 0xFF) / 255.0F;
				this.aFloat57 = (float) (this.anInt2174 & 0xFF00) / 65280.0F;
				this.aFloat54 = (float) (this.anInt2174 & 0xFF0000) / 1.671168E7F;
				this.method1977();
			}
			this.method1995();
		}
		if (this.aFloatArray19[0] == arg3 && this.aFloatArray19[1] == arg4 && this.aFloatArray19[2] == arg5) {
			return;
		}
		this.aFloatArray19[2] = arg5;
		this.aFloatArray19[0] = arg3;
		this.aFloatArray19[1] = arg4;
		this.aFloatArray20[1] = -arg4;
		this.aFloatArray20[0] = -arg3;
		this.aFloatArray20[2] = -arg5;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray17[0] = local138 * arg3;
		this.aFloatArray17[1] = arg4 * local138;
		this.aFloatArray17[2] = arg5 * local138;
		this.aFloatArray18[2] = -this.aFloatArray17[2];
		this.aFloatArray18[0] = -this.aFloatArray17[0];
		this.aFloatArray18[1] = -this.aFloatArray17[1];
		this.method1973();
		this.anInt2165 = (int) (arg3 * 256.0F / arg4);
		this.anInt2177 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!vv;)V")
	@Override
	public void method8519(@OriginalArg(0) Interface26 arg0) {
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method8523(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(IIII)V")
	public void method2012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(IZ)V")
	public void method2013(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean158 != arg0) {
			this.aBoolean158 = arg0;
			this.method2002();
			this.bf &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "([IIIIIZ)Lclient!vr;")
	@Override
	public Class33 method8514(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class33_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!dia", name = "e", descriptor = "(I)V")
	@Override
	public void method8475(@OriginalArg(0) int arg0) {
		this.method1966();
	}

	@OriginalMember(owner = "client!dia", name = "z", descriptor = "()Lclient!uu;")
	@Override
	public Class239 method8528() {
		return this.aClass239_Sub2_3;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!ef;I)V")
	@Override
	public void method8506(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass105_1.method3087(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "()V")
	@Override
	protected void method8455() {
		for (@Pc(8) Class3 local8 = this.aClass338_48.method8177(); local8 != null; local8 = this.aClass338_48.method8168()) {
			((Class3_Sub5_Sub1) local8).method688();
		}
		if (this.aClass112_1 != null) {
			this.aClass112_1.method3215();
		}
		if (this.anOpenGL1 != null) {
			this.method1966();
			@Pc(37) Enumeration local37 = this.aHashtable2.keys();
			while (local37.hasMoreElements()) {
				@Pc(42) Canvas local42 = (Canvas) local37.nextElement();
				@Pc(48) Long local48 = (Long) this.aHashtable2.get(local42);
				this.anOpenGL1.releaseSurface(local42, local48);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean152) {
			Static211.method7571(true, false);
			this.aBoolean152 = false;
		}
	}

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method8523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1980();
		this.method2019(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(22) float local22 = (float) arg3 - (float) arg1;
		if (local16 == 0.0F && local22 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(47) float local47 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local16 * local16)));
			local22 *= local47;
			local16 *= local47;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, local22 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILclient!ra;)V")
	public void method2014(@OriginalArg(1) Class239_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method7199(), 0);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "()I")
	@Override
	public int method8448() {
		return 4;
	}

	@OriginalMember(owner = "client!dia", name = "l", descriptor = "()Z")
	@Override
	public boolean method8474() {
		return true;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8491(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static103.aFloat45 = arg2;
		Static368.aFloat120 = arg1;
		Static135.aFloat135 = arg0;
	}

	@OriginalMember(owner = "client!dia", name = "x", descriptor = "(I)V")
	private void method2015() {
		@Pc(9) int local9;
		for (local9 = 0; local9 < this.anInt2179; local9++) {
			@Pc(15) Class3_Sub15 local15 = this.aClass3_Sub15Array2[local9];
			@Pc(19) int local19 = local9 + 16386;
			Static486.aFloatArray62[0] = (float) local15.method8384();
			Static486.aFloatArray62[1] = (float) local15.method8380();
			Static486.aFloatArray62[2] = (float) local15.method8383();
			Static486.aFloatArray62[3] = 1.0F;
			OpenGL.glLightfv(local19, 4611, Static486.aFloatArray62, 0);
			@Pc(53) int local53 = local15.method8377();
			@Pc(59) float local59 = local15.method8381() / 255.0F;
			Static486.aFloatArray62[1] = (float) (local53 >> 8 & 0xFF) * local59;
			Static486.aFloatArray62[0] = (float) (local53 >> 16 & 0xFF) * local59;
			Static486.aFloatArray62[2] = local59 * (float) (local53 & 0xFF);
			OpenGL.glLightfv(local19, 4609, Static486.aFloatArray62, 0);
			OpenGL.glLightf(local19, 4617, 1.0F / (float) (local15.method8378() * local15.method8378()));
			OpenGL.glEnable(local19);
		}
		while (this.anInt2191 > local9) {
			OpenGL.glDisable(local9 + 16386);
			local9++;
		}
		this.anInt2191 = this.anInt2179;
	}

	@OriginalMember(owner = "client!dia", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 > this.anInt2184) {
			this.anInt2184 = arg1;
		}
		if (this.anInt2194 > arg3) {
			this.anInt2194 = arg3;
		}
		if (this.anInt2176 > arg2) {
			this.anInt2176 = arg2;
		}
		if (this.anInt2183 < arg0) {
			this.anInt2183 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method1969();
		this.method1952();
	}

	@OriginalMember(owner = "client!dia", name = "k", descriptor = "(II)I")
	public int method2016(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(III)V")
	public synchronized void method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class3_Sub33 local14 = new Class3_Sub33(arg1);
		local14.aLong311 = (long) arg0;
		this.aClass338_50.method8171(local14);
	}

	@OriginalMember(owner = "client!dia", name = "f", descriptor = "()Lclient!uu;")
	@Override
	public Class239 method8461() {
		return new Class239_Sub2();
	}

	@OriginalMember(owner = "client!dia", name = "f", descriptor = "(I)V")
	@Override
	public void method8485(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt2144 = arg0;
		this.aClass123_1.method3645();
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(IIIIII)Lclient!dn;")
	@Override
	public Class35 method8456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean182 ? new Class35_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class21 method8517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class21_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!dia", name = "y", descriptor = "(I)V")
	private void method2018() {
		@Pc(6) float[] local6 = this.aFloatArray16;
		@Pc(18) float local18 = (float) (-this.anInt2198 * this.anInt2173) / (float) this.anInt2168;
		@Pc(38) float local38 = (float) ((this.anInt2076 - this.anInt2198) * this.anInt2173) / (float) this.anInt2168;
		@Pc(49) float local49 = (float) (this.anInt2192 * this.anInt2173) / (float) this.anInt2189;
		@Pc(64) float local64 = (float) ((this.anInt2192 - this.anInt2132) * this.anInt2173) / (float) this.anInt2189;
		if (local18 == local38 || local49 == local64) {
			local6[0] = 1.0F;
			local6[13] = 0.0F;
			local6[5] = 1.0F;
			local6[14] = 0.0F;
			local6[4] = 0.0F;
			local6[1] = 0.0F;
			local6[8] = 0.0F;
			local6[15] = 1.0F;
			local6[3] = 0.0F;
			local6[6] = 0.0F;
			local6[11] = 0.0F;
			local6[12] = 0.0F;
			local6[10] = 1.0F;
			local6[7] = 0.0F;
			local6[9] = 0.0F;
			local6[2] = 0.0F;
		} else {
			@Pc(78) float local78 = (float) this.anInt2173 * 2.0F;
			local6[2] = 0.0F;
			local6[7] = 0.0F;
			local6[8] = (local38 + local18) / (-local18 + local38);
			local6[6] = 0.0F;
			local6[14] = this.aFloat51 = -((float) this.anInt2187 * local78) / (float) (this.anInt2187 - this.anInt2173);
			local6[0] = local78 / (local38 - local18);
			local6[15] = 0.0F;
			local6[1] = 0.0F;
			local6[5] = local78 / (local49 - local64);
			local6[10] = this.aFloat63 = (float) -(this.anInt2173 + this.anInt2187) / (float) (this.anInt2187 - this.anInt2173);
			local6[12] = 0.0F;
			local6[3] = 0.0F;
			local6[13] = 0.0F;
			local6[4] = 0.0F;
			local6[9] = (local64 + local49) / (-local64 + local49);
			local6[11] = -1.0F;
		}
		this.method1996();
	}

	@OriginalMember(owner = "client!dia", name = "l", descriptor = "(II)V")
	public void method2019(@OriginalArg(1) int arg0) {
		if (this.anInt2163 == arg0) {
			return;
		}
		@Pc(16) boolean local16;
		@Pc(12) byte local12;
		if (arg0 == 1) {
			local12 = 1;
			local16 = true;
		} else if (arg0 == 2) {
			local12 = 2;
			local16 = false;
		} else if (arg0 == 128) {
			local12 = 3;
			local16 = true;
		} else {
			local16 = false;
			local12 = 0;
		}
		if (!this.aBoolean155) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean155 = true;
		}
		if (this.aBoolean154 != local16) {
			if (local16) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean154 = local16;
		}
		if (local12 != this.anInt2164) {
			if (local12 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local12 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local12 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt2164 = local12;
		}
		this.bf &= 0xFFFFFFE3;
		this.anInt2163 = arg0;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Z)V")
	@Override
	public void method8505(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIIF)Lclient!uca;")
	@Override
	public Class3_Sub15 method8504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub15_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)I")
	@Override
	public int method8478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!dia", name = "p", descriptor = "(B)V")
	private void method2020() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray16, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dia", name = "q", descriptor = "(B)V")
	public void method2021() {
		if (this.bf == 16) {
			return;
		}
		this.method1963();
		this.method2013(true);
		this.method1958(true);
		this.method1954(true);
		this.method2019(1);
		this.bf = 16;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILclient!fha;)V")
	public void method2022(@OriginalArg(1) Interface9 arg0) {
		if (this.anInterface9_3 != arg0) {
			if (this.aBoolean165) {
				OpenGL.glBindBufferARB(34962, arg0.method8394());
			}
			this.anInterface9_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!dia", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass239_Sub2_3.aFloat167 + (float) arg0 * this.aClass239_Sub2_3.aFloat160 + this.aClass239_Sub2_3.aFloat169 * (float) arg1 + this.aClass239_Sub2_3.aFloat166 * (float) arg2;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg4 * this.aClass239_Sub2_3.aFloat169 + (float) arg3 * this.aClass239_Sub2_3.aFloat160 + (float) arg5 * this.aClass239_Sub2_3.aFloat166 + this.aClass239_Sub2_3.aFloat167;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt2173 && (float) this.anInt2173 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt2187 < local32 && (float) this.anInt2187 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass239_Sub2_3.aFloat165 * (float) arg1 + (float) arg0 * this.aClass239_Sub2_3.aFloat163 + this.aClass239_Sub2_3.aFloat168 * (float) arg2 + this.aClass239_Sub2_3.aFloat164) * (float) this.anInt2168 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt2168 * (this.aClass239_Sub2_3.aFloat165 * (float) arg4 + (float) arg3 * this.aClass239_Sub2_3.aFloat163 + this.aClass239_Sub2_3.aFloat168 * (float) arg5 + this.aClass239_Sub2_3.aFloat164) / local63);
		if ((float) local135 < this.aFloat56 && this.aFloat56 > (float) local167) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat50 && (float) local167 > this.aFloat50) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass239_Sub2_3.aFloat170 * (float) arg2 + this.aClass239_Sub2_3.aFloat162 * (float) arg0 + (float) arg1 * this.aClass239_Sub2_3.aFloat161 + this.aClass239_Sub2_3.aFloat171) * (float) this.anInt2189 / local32);
		@Pc(265) int local265 = (int) ((this.aClass239_Sub2_3.aFloat170 * (float) arg5 + this.aClass239_Sub2_3.aFloat162 * (float) arg3 + (float) arg4 * this.aClass239_Sub2_3.aFloat161 + this.aClass239_Sub2_3.aFloat171) * (float) this.anInt2189 / local63);
		if ((float) local233 < this.aFloat52 && (float) local265 < this.aFloat52) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat48 && (float) local265 > this.aFloat48) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		@Pc(15) Class1_Sub1 local15 = (Class1_Sub1) arg5;
		@Pc(18) Class85_Sub3_Sub1 local18 = local15.aClass85_Sub3_Sub1_1;
		this.method1974();
		this.method2024(local15.aClass85_Sub3_Sub1_1);
		this.method2019(1);
		this.method1993(8448, 7681);
		this.method2012(34167, 768, 0);
		@Pc(48) float local48 = local18.aFloat119 / (float) local18.anInt5931;
		@Pc(55) float local55 = local18.aFloat118 / (float) local18.anInt5927;
		@Pc(61) float local61 = (float) arg2 - (float) arg0;
		@Pc(68) float local68 = (float) -arg1 + (float) arg3;
		@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local61 * local61)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(100) float local100 = local61 * local81;
		@Pc(106) int local106 = arg10 % (arg8 + arg9);
		@Pc(110) float local110 = local68 * local81;
		@Pc(115) float local115 = local100 * (float) arg8;
		@Pc(120) float local120 = local110 * (float) arg8;
		@Pc(122) float local122 = 0.0F;
		@Pc(124) float local124 = 0.0F;
		@Pc(126) float local126 = local115;
		@Pc(128) float local128 = local120;
		if (arg8 >= local106) {
			local126 = local100 * (float) (arg8 - local106);
			local128 = local110 * (float) (arg8 - local106);
		} else {
			local124 = (float) (arg8 + arg9 - local106) * local110;
			local122 = (float) (arg9 + arg8 - local106) * local100;
		}
		@Pc(174) float local174 = (float) arg0 + local122 + 0.35F;
		@Pc(181) float local181 = local124 + (float) arg1 + 0.35F;
		@Pc(186) float local186 = (float) arg9 * local100;
		@Pc(191) float local191 = local110 * (float) arg9;
		while (true) {
			if (arg0 < arg2) {
				if (local174 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local174 + local126) {
					local126 = (float) arg2 - local174;
				}
			} else {
				if ((float) arg2 + 0.35F > local174) {
					break;
				}
				if (local126 + local174 < (float) arg2) {
					local126 = (float) arg2 - local174;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 + 0.35F > local181) {
					break;
				}
				if ((float) arg3 > local181 + local128) {
					local128 = (float) arg3 - local181;
				}
			} else {
				if (local181 > (float) arg3 + 0.35F) {
					break;
				}
				if (local128 + local181 > (float) arg3) {
					local128 = (float) arg3 - local181;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local48 * (local174 - (float) arg6), ((float) -arg7 + local181) * local55);
			OpenGL.glVertex2f(local174, local181);
			OpenGL.glTexCoord2f(((float) -arg6 + local126 + local174) * local48, local55 * ((float) -arg7 + local128 + local181));
			OpenGL.glVertex2f(local126 + local174, local181 + local128);
			local174 += local186 + local126;
			local181 += local191 + local128;
			OpenGL.glEnd();
			local126 = local115;
			local128 = local120;
		}
		this.method2012(5890, 768, 0);
	}

	@OriginalMember(owner = "client!dia", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat61) {
			this.aFloat61 = arg0;
			this.method1977();
		}
	}

	@OriginalMember(owner = "client!dia", name = "n", descriptor = "()Z")
	@Override
	public boolean method8481() {
		return true;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		this.method1980();
		this.method2019(1);
		@Pc(30) float local30 = (float) -arg0 + (float) arg2;
		@Pc(37) float local37 = (float) -arg1 + (float) arg3;
		@Pc(50) float local50 = (float) (1.0D / Math.sqrt((double) (local37 * local37 + local30 * local30)));
		@Pc(54) float local54 = local37 * local50;
		@Pc(58) float local58 = local30 * local50;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(79) int local79 = arg7 % (arg6 + arg5);
		@Pc(84) float local84 = local58 * (float) arg5;
		@Pc(89) float local89 = local54 * (float) arg5;
		@Pc(91) float local91 = 0.0F;
		@Pc(93) float local93 = 0.0F;
		@Pc(95) float local95 = local84;
		@Pc(97) float local97 = local89;
		if (local79 > arg5) {
			local93 = (float) (arg6 + arg5 - local79) * local54;
			local91 = local58 * (float) (arg6 + arg5 - local79);
		} else {
			local97 = (float) (arg5 - local79) * local54;
			local95 = local58 * (float) (arg5 - local79);
		}
		@Pc(143) float local143 = (float) arg0 + local91 + 0.35F;
		@Pc(150) float local150 = (float) arg1 + local93 + 0.35F;
		@Pc(155) float local155 = (float) arg6 * local58;
		@Pc(160) float local160 = (float) arg6 * local54;
		while (true) {
			if (arg2 <= arg0) {
				if ((float) arg2 + 0.35F > local143) {
					break;
				}
				if ((float) arg2 > local143 + local95) {
					local95 = (float) arg2 - local143;
				}
			} else {
				if (local143 > (float) arg2 + 0.35F) {
					break;
				}
				if (local143 + local95 > (float) arg2) {
					local95 = (float) arg2 - local143;
				}
			}
			if (arg1 < arg3) {
				if (local150 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local150 + local97) {
					local97 = (float) arg3 - local150;
				}
			} else {
				if (local150 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local97 + local150) {
					local97 = (float) arg3 - local150;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local143, local150);
			OpenGL.glVertex2f(local95 + local143, local97 + local150);
			local143 += local95 + local155;
			OpenGL.glEnd();
			local150 += local97 + local160;
			local95 = local84;
			local97 = local89;
		}
	}

	@OriginalMember(owner = "client!dia", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt2200;
		this.anInt2200 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILclient!m;)V")
	public void method2023(@OriginalArg(1) Interface17 arg0) {
		if (arg0 != this.anInterface17_1) {
			if (this.aBoolean165) {
				OpenGL.glBindBufferARB(34963, arg0.method6789());
			}
			this.anInterface17_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLclient!il;)V")
	public void method2024(@OriginalArg(1) Class85 arg0) {
		@Pc(9) Class85 local9 = this.aClass85Array1[this.anInt2170];
		if (arg0 != local9) {
			if (arg0 == null) {
				OpenGL.glDisable(local9.anInt9006);
			} else {
				if (local9 == null) {
					OpenGL.glEnable(arg0.anInt9006);
				} else if (arg0.anInt9006 != local9.anInt9006) {
					OpenGL.glDisable(local9.anInt9006);
					OpenGL.glEnable(arg0.anInt9006);
				}
				OpenGL.glBindTexture(arg0.anInt9006, arg0.method7869());
			}
			this.aClass85Array1[this.anInt2170] = arg0;
		}
		this.bf &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!dia", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt2187;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILclient!hga;)V")
	public void method2025(@OriginalArg(1) Interface12 arg0) {
		if (this.anInt2158 < 0 || arg0 != this.anInterface12Array1[this.anInt2158]) {
			throw new RuntimeException();
		}
		this.anInterface12Array1[this.anInt2158--] = null;
		arg0.method5420();
		if (this.anInt2158 < 0) {
			this.anInterface12_2 = null;
		} else {
			this.anInterface12_2 = this.anInterface12Array1[this.anInt2158];
			this.anInterface12_2.method5422();
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIZ)Lclient!vr;")
	@Override
	public Class33 method8526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class33_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(Lclient!hga;Z)V")
	public void method2026(@OriginalArg(0) Interface12 arg0) {
		if (this.anInt2159 < 0 || this.anInterface12Array3[this.anInt2159] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface12Array3[this.anInt2159--] = null;
		arg0.method5423();
		if (this.anInt2159 < 0) {
			this.anInterface12_1 = null;
		} else {
			this.anInterface12_1 = this.anInterface12Array3[this.anInt2159];
			this.anInterface12_1.method5425();
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8450(@OriginalArg(0) Canvas arg0) {
		this.aLong58 = 0L;
		this.aCanvas4 = null;
		if (arg0 == null || arg0 == this.aCanvas5) {
			this.aCanvas4 = this.aCanvas5;
			this.aLong58 = this.aLong59;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable2.get(arg0);
			this.aLong58 = local26;
			this.aCanvas4 = arg0;
		}
		if (this.aCanvas4 == null || this.aLong58 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong58);
		this.method2001();
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;ZIII)Lclient!fha;")
	public Interface9 method2027(@OriginalArg(0) Buffer arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		return (Interface9) (this.aBoolean165 ? new Class266_Sub1(this, arg2, arg0, arg1, false) : new Class17_Sub2(this, arg2, arg0));
	}

	@OriginalMember(owner = "client!dia", name = "e", descriptor = "(II)Lclient!tq;")
	@Override
	public Interface25 method8509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BIII)V")
	public void method2028(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "([I)V")
	@Override
	public void method8525(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2076;
		arg0[1] = this.anInt2132;
	}

	@OriginalMember(owner = "client!dia", name = "m", descriptor = "(II)I")
	public int method2029(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!dia", name = "s", descriptor = "()Z")
	@Override
	public boolean method8497() {
		return false;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	@Override
	public Class35 method8477(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class35 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean182 && this.aBoolean172) {
			@Pc(15) Class35_Sub2_Sub1 local15 = null;
			@Pc(18) Class35_Sub2 local18 = (Class35_Sub2) arg0;
			@Pc(21) Class35_Sub2 local21 = (Class35_Sub2) arg1;
			@Pc(25) Class85_Sub1 local25 = local18.method5092();
			@Pc(29) Class85_Sub1 local29 = local21.method5092();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local25.anInt2641 > local29.anInt2641 ? local25.anInt2641 : local29.anInt2641;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class35_Sub2_Sub1) {
					@Pc(56) Class35_Sub2_Sub1 local56 = (Class35_Sub2_Sub1) arg3;
					if (local56.method1837() == local44) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class35_Sub2_Sub1(this, local44);
				}
				if (local15.method1838(local29, local25, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!dia", name = "t", descriptor = "()V")
	@Override
	public void method8503() {
	}

	@OriginalMember(owner = "client!dia", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method1980();
		this.method2019(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean180) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean180) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg5;
		@Pc(9) Class85_Sub3_Sub1 local9 = local6.aClass85_Sub3_Sub1_1;
		this.method1974();
		this.method2024(local6.aClass85_Sub3_Sub1_1);
		this.method2019(1);
		this.method1993(8448, 7681);
		this.method2012(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat119 / (float) local9.anInt5931;
		@Pc(46) float local46 = local9.aFloat118 / (float) local9.anInt5927;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(60) float local60 = (float) -arg1 + (float) arg3;
		@Pc(73) float local73 = (float) (1.0D / Math.sqrt((double) (local60 * local60 + local53 * local53)));
		@Pc(77) float local77 = local53 * local73;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(96) float local96 = local60 * local73;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f(local77 + (float) arg2 + 0.35F, local96 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method2012(5890, 768, 0);
	}

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "(II)Lclient!bfa;")
	@Override
	public Interface2 method8502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(ILclient!ra;)V")
	public void method2031(@OriginalArg(1) Class239_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method7199(), 0);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(III)V")
	public synchronized void method2032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub33 local8 = new Class3_Sub33(arg1);
		local8.aLong311 = (long) arg0;
		this.aClass338_51.method8171(local8);
	}

	@OriginalMember(owner = "client!dia", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass239_Sub2_3.aFloat167 + this.aClass239_Sub2_3.aFloat166 * (float) arg2 + (float) arg1 * this.aClass239_Sub2_3.aFloat169 + (float) arg0 * this.aClass239_Sub2_3.aFloat160;
		if (local28 < (float) this.anInt2173 || local28 > (float) this.anInt2187) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass239_Sub2_3.aFloat164 + this.aClass239_Sub2_3.aFloat168 * (float) arg2 + (float) arg1 * this.aClass239_Sub2_3.aFloat165 + this.aClass239_Sub2_3.aFloat163 * (float) arg0) * (float) this.anInt2168 / local28);
		@Pc(117) int local117 = (int) ((this.aClass239_Sub2_3.aFloat171 + this.aClass239_Sub2_3.aFloat170 * (float) arg2 + (float) arg1 * this.aClass239_Sub2_3.aFloat161 + this.aClass239_Sub2_3.aFloat162 * (float) arg0) * (float) this.anInt2189 / local28);
		if (this.aFloat56 <= (float) local85 && (float) local85 <= this.aFloat50 && (float) local117 >= this.aFloat52 && (float) local117 <= this.aFloat48) {
			arg3[1] = (int) ((float) local117 - this.aFloat52);
			arg3[0] = (int) ((float) local85 - this.aFloat56);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!dia", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8516(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class3_Sub33 local19;
		while (!this.aClass338_50.method8166()) {
			local19 = (Class3_Sub33) this.aClass338_50.method8169();
			Static204.anIntArray354[local7++] = (int) local19.aLong311;
			this.anInt2162 -= local19.anInt4831;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static204.anIntArray354, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static204.anIntArray354, 0);
			local7 = 0;
		}
		while (!this.aClass338_51.method8166()) {
			local19 = (Class3_Sub33) this.aClass338_51.method8169();
			Static204.anIntArray354[local7++] = (int) local19.aLong311;
			this.anInt2161 -= local19.anInt4831;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static204.anIntArray354, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static204.anIntArray354, 0);
			local7 = 0;
		}
		while (!this.aClass338_52.method8166()) {
			local19 = (Class3_Sub33) this.aClass338_52.method8169();
			Static204.anIntArray354[local7++] = local19.anInt4831;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static204.anIntArray354, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static204.anIntArray354, 0);
			local7 = 0;
		}
		while (!this.aClass338_53.method8166()) {
			local19 = (Class3_Sub33) this.aClass338_53.method8169();
			Static204.anIntArray354[local7++] = (int) local19.aLong311;
			this.anInt2160 -= local19.anInt4831;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static204.anIntArray354, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static204.anIntArray354, 0);
		}
		while (!this.aClass338_49.method8166()) {
			local19 = (Class3_Sub33) this.aClass338_49.method8169();
			OpenGL.glDeleteLists((int) local19.aLong311, local19.anInt4831);
		}
		@Pc(216) Class3 local216;
		while (!this.aClass338_54.method8166()) {
			local216 = this.aClass338_54.method8169();
			OpenGL.glDeleteProgramARB((int) local216.aLong311);
		}
		while (!this.aClass338_55.method8166()) {
			local216 = this.aClass338_55.method8169();
			OpenGL.glDeleteObjectARB(local216.aLong311);
		}
		while (!this.aClass338_49.method8166()) {
			local19 = (Class3_Sub33) this.aClass338_49.method8169();
			OpenGL.glDeleteLists((int) local19.aLong311, local19.anInt4831);
		}
		this.aClass123_1.method3646();
		if (this.E() > 100663296 && this.aLong60 + 60000L < Static524.method7320()) {
			System.gc();
			this.aLong60 = Static524.method7320();
		}
		this.anInt2155 = local11;
	}

	@OriginalMember(owner = "client!dia", name = "h", descriptor = "(I)V")
	@Override
	public void method8521(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8468(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas5 == arg0) {
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

	@OriginalMember(owner = "client!dia", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass239_Sub2_3.aFloat160 * (float) arg0 + this.aClass239_Sub2_3.aFloat169 * (float) arg1 + (float) arg2 * this.aClass239_Sub2_3.aFloat166 + this.aClass239_Sub2_3.aFloat167;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt2168 * (this.aClass239_Sub2_3.aFloat164 + (float) arg2 * this.aClass239_Sub2_3.aFloat168 + (float) arg1 * this.aClass239_Sub2_3.aFloat165 + this.aClass239_Sub2_3.aFloat163 * (float) arg0) / local28);
		@Pc(109) int local109 = (int) ((this.aClass239_Sub2_3.aFloat161 * (float) arg1 + this.aClass239_Sub2_3.aFloat162 * (float) arg0 + this.aClass239_Sub2_3.aFloat170 * (float) arg2 + this.aClass239_Sub2_3.aFloat171) * (float) this.anInt2189 / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat56);
		arg3[1] = (int) ((float) local109 - this.aFloat52);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!dia", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt2198, this.anInt2192, this.anInt2168, this.anInt2189 };
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8446(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aNativeHeap3 = ((Class3_Sub5_Sub1) arg0).aNativeHeap2;
		if (this.anInterface9_2 != null) {
			return;
		}
		@Pc(16) Class3_Sub25_Sub2 local16 = new Class3_Sub25_Sub2(80);
		if (this.aBoolean166) {
			local16.method8652(-1.0F);
			local16.method8652(-1.0F);
			local16.method8652(0.0F);
			local16.method8652(0.0F);
			local16.method8652(1.0F);
			local16.method8652(1.0F);
			local16.method8652(-1.0F);
			local16.method8652(0.0F);
			local16.method8652(1.0F);
			local16.method8652(1.0F);
			local16.method8652(1.0F);
			local16.method8652(1.0F);
			local16.method8652(0.0F);
			local16.method8652(1.0F);
			local16.method8652(0.0F);
			local16.method8652(-1.0F);
			local16.method8652(1.0F);
			local16.method8652(0.0F);
			local16.method8652(0.0F);
			local16.method8652(0.0F);
		} else {
			local16.method8653(-1.0F);
			local16.method8653(-1.0F);
			local16.method8653(0.0F);
			local16.method8653(0.0F);
			local16.method8653(1.0F);
			local16.method8653(1.0F);
			local16.method8653(-1.0F);
			local16.method8653(0.0F);
			local16.method8653(1.0F);
			local16.method8653(1.0F);
			local16.method8653(1.0F);
			local16.method8653(1.0F);
			local16.method8653(0.0F);
			local16.method8653(1.0F);
			local16.method8653(0.0F);
			local16.method8653(-1.0F);
			local16.method8653(1.0F);
			local16.method8653(0.0F);
			local16.method8653(0.0F);
			local16.method8653(0.0F);
		}
		this.anInterface9_2 = this.method1967(local16.anInt9765, local16.aByteArray106, false, 20);
		this.aClass381_6 = new Class381(this.anInterface9_2, 5126, 3, 0);
		this.aClass381_5 = new Class381(this.anInterface9_2, 5126, 2, 12);
		this.aClass105_1.method3084(this);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8510() {
		this.method1980();
		this.method2019(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!dia", name = "v", descriptor = "()Z")
	@Override
	public boolean method8508() {
		return true;
	}

	@OriginalMember(owner = "client!dia", name = "r", descriptor = "()Z")
	@Override
	public boolean method8496() {
		return false;
	}

	@OriginalMember(owner = "client!dia", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt2132 - local12 - arg1, arg2, 1, 32993, this.anInt2171, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(Z)V")
	@Override
	public void method8512(@OriginalArg(0) boolean arg0) {
	}
}
