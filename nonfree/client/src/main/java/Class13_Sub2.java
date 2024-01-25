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

@OriginalClass("client!bi")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!bi", name = "bc", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!bi", name = "uc", descriptor = "I")
	public int anInt980;

	@OriginalMember(owner = "client!bi", name = "Ec", descriptor = "I")
	public int anInt990;

	@OriginalMember(owner = "client!bi", name = "Pd", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!bi", name = "xe", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!bi", name = "ze", descriptor = "I")
	public int anInt1076;

	@OriginalMember(owner = "client!bi", name = "Be", descriptor = "Lclient!re;")
	private Class31_Sub3 aClass31_Sub3_1;

	@OriginalMember(owner = "client!bi", name = "Ce", descriptor = "Lclient!mj;")
	private Class227 aClass227_1;

	@OriginalMember(owner = "client!bi", name = "Fe", descriptor = "Lclient!jm;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "client!bi", name = "Ge", descriptor = "Lclient!jm;")
	private Interface13 anInterface13_2;

	@OriginalMember(owner = "client!bi", name = "Le", descriptor = "I")
	public int anInt1080;

	@OriginalMember(owner = "client!bi", name = "Me", descriptor = "I")
	private int anInt1081;

	@OriginalMember(owner = "client!bi", name = "Ne", descriptor = "I")
	public int anInt1082;

	@OriginalMember(owner = "client!bi", name = "Ue", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!bi", name = "Ve", descriptor = "Z")
	private boolean aBoolean78;

	@OriginalMember(owner = "client!bi", name = "We", descriptor = "Z")
	private boolean aBoolean79;

	@OriginalMember(owner = "client!bi", name = "Xe", descriptor = "Z")
	private boolean aBoolean80;

	@OriginalMember(owner = "client!bi", name = "Ye", descriptor = "I")
	private int anInt1083;

	@OriginalMember(owner = "client!bi", name = "af", descriptor = "I")
	private int anInt1084;

	@OriginalMember(owner = "client!bi", name = "bf", descriptor = "Z")
	private boolean bf;

	@OriginalMember(owner = "client!bi", name = "cf", descriptor = "I")
	private int anInt1085;

	@OriginalMember(owner = "client!bi", name = "gf", descriptor = "I")
	private int anInt1087;

	@OriginalMember(owner = "client!bi", name = "lf", descriptor = "Lclient!lw;")
	public Class193_Sub1 aClass193_Sub1_1;

	@OriginalMember(owner = "client!bi", name = "mf", descriptor = "Lclient!ju;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "client!bi", name = "nf", descriptor = "Z")
	public boolean aBoolean82;

	@OriginalMember(owner = "client!bi", name = "qf", descriptor = "Lclient!uo;")
	public Class352 aClass352_1;

	@OriginalMember(owner = "client!bi", name = "rf", descriptor = "Z")
	private boolean aBoolean83;

	@OriginalMember(owner = "client!bi", name = "sf", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!bi", name = "tf", descriptor = "Z")
	public boolean aBoolean84;

	@OriginalMember(owner = "client!bi", name = "vf", descriptor = "Z")
	public boolean aBoolean85;

	@OriginalMember(owner = "client!bi", name = "yf", descriptor = "Z")
	private boolean aBoolean86;

	@OriginalMember(owner = "client!bi", name = "zf", descriptor = "Lclient!baa;")
	private Class10_Sub2_Sub1 aClass10_Sub2_Sub1_1;

	@OriginalMember(owner = "client!bi", name = "Bf", descriptor = "I")
	private int anInt1091;

	@OriginalMember(owner = "client!bi", name = "Cf", descriptor = "I")
	public int anInt1092;

	@OriginalMember(owner = "client!bi", name = "Df", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!bi", name = "Gf", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!bi", name = "Hf", descriptor = "Lclient!lw;")
	public Class193_Sub1 aClass193_Sub1_2;

	@OriginalMember(owner = "client!bi", name = "Jf", descriptor = "I")
	private int anInt1095;

	@OriginalMember(owner = "client!bi", name = "Kf", descriptor = "Lclient!mj;")
	public Class227 aClass227_2;

	@OriginalMember(owner = "client!bi", name = "Lf", descriptor = "F")
	private float aFloat16;

	@OriginalMember(owner = "client!bi", name = "Mf", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!bi", name = "Pf", descriptor = "I")
	private int anInt1097;

	@OriginalMember(owner = "client!bi", name = "Rf", descriptor = "Lclient!ju;")
	private Interface14 anInterface14_2;

	@OriginalMember(owner = "client!bi", name = "Uf", descriptor = "Z")
	private boolean aBoolean89;

	@OriginalMember(owner = "client!bi", name = "Wf", descriptor = "Lclient!uo;")
	public Class352 aClass352_2;

	@OriginalMember(owner = "client!bi", name = "Yf", descriptor = "I")
	private int anInt1100;

	@OriginalMember(owner = "client!bi", name = "eg", descriptor = "Z")
	private boolean aBoolean92;

	@OriginalMember(owner = "client!bi", name = "hg", descriptor = "Lclient!lw;")
	public Class193_Sub1 aClass193_Sub1_3;

	@OriginalMember(owner = "client!bi", name = "ig", descriptor = "I")
	private int anInt1105;

	@OriginalMember(owner = "client!bi", name = "kg", descriptor = "Lclient!cb;")
	private Class49_Sub1 aClass49_Sub1_1;

	@OriginalMember(owner = "client!bi", name = "lg", descriptor = "Lclient!lw;")
	public Class193_Sub1 aClass193_Sub1_4;

	@OriginalMember(owner = "client!bi", name = "mg", descriptor = "F")
	private float aFloat20;

	@OriginalMember(owner = "client!bi", name = "pg", descriptor = "Lclient!bq;")
	public Class10_Sub2 aClass10_Sub2_1;

	@OriginalMember(owner = "client!bi", name = "rg", descriptor = "Z")
	public boolean aBoolean93;

	@OriginalMember(owner = "client!bi", name = "sg", descriptor = "I")
	private int anInt1108;

	@OriginalMember(owner = "client!bi", name = "vg", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!bi", name = "yg", descriptor = "[Lclient!cj;")
	private Class10[] aClass10Array1;

	@OriginalMember(owner = "client!bi", name = "Ag", descriptor = "Z")
	private boolean aBoolean96;

	@OriginalMember(owner = "client!bi", name = "Cg", descriptor = "I")
	public int anInt1112;

	@OriginalMember(owner = "client!bi", name = "Dg", descriptor = "Lclient!lw;")
	public Class193_Sub1 aClass193_Sub1_5;

	@OriginalMember(owner = "client!bi", name = "Eg", descriptor = "Z")
	public boolean aBoolean97;

	@OriginalMember(owner = "client!bi", name = "Gg", descriptor = "I")
	public int anInt1113;

	@OriginalMember(owner = "client!bi", name = "Hg", descriptor = "Lclient!lw;")
	public Class193_Sub1 aClass193_Sub1_6;

	@OriginalMember(owner = "client!bi", name = "Mg", descriptor = "Z")
	private boolean aBoolean99;

	@OriginalMember(owner = "client!bi", name = "Ng", descriptor = "Lclient!lw;")
	public Class193_Sub1 aClass193_Sub1_7;

	@OriginalMember(owner = "client!bi", name = "Og", descriptor = "Z")
	private boolean aBoolean100;

	@OriginalMember(owner = "client!bi", name = "Qg", descriptor = "Lclient!lw;")
	public Class193_Sub1 aClass193_Sub1_8;

	@OriginalMember(owner = "client!bi", name = "Sg", descriptor = "I")
	private int anInt1116;

	@OriginalMember(owner = "client!bi", name = "Tg", descriptor = "Z")
	public boolean aBoolean102;

	@OriginalMember(owner = "client!bi", name = "Ug", descriptor = "Lclient!g;")
	private Interface7 anInterface7_2;

	@OriginalMember(owner = "client!bi", name = "Vg", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!bi", name = "Xg", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!bi", name = "Yg", descriptor = "Z")
	public boolean aBoolean103;

	@OriginalMember(owner = "client!bi", name = "Zg", descriptor = "I")
	public int anInt1117;

	@OriginalMember(owner = "client!bi", name = "ah", descriptor = "Z")
	public boolean aBoolean104;

	@OriginalMember(owner = "client!bi", name = "ch", descriptor = "Lclient!lw;")
	public Class193_Sub1 aClass193_Sub1_9;

	@OriginalMember(owner = "client!bi", name = "dh", descriptor = "Lclient!lw;")
	public Class193_Sub1 aClass193_Sub1_10;

	@OriginalMember(owner = "client!bi", name = "eh", descriptor = "Z")
	public boolean aBoolean106;

	@OriginalMember(owner = "client!bi", name = "fh", descriptor = "Z")
	public boolean aBoolean107;

	@OriginalMember(owner = "client!bi", name = "gh", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!bi", name = "mh", descriptor = "F")
	private float aFloat30;

	@OriginalMember(owner = "client!bi", name = "oh", descriptor = "I")
	private int anInt1120;

	@OriginalMember(owner = "client!bi", name = "qh", descriptor = "I")
	private int anInt1121;

	@OriginalMember(owner = "client!bi", name = "ob", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!bi", name = "pe", descriptor = "I")
	public int anInt1073 = 128;

	@OriginalMember(owner = "client!bi", name = "qe", descriptor = "Lclient!ob;")
	private final Class249 aClass249_1 = new Class249();

	@OriginalMember(owner = "client!bi", name = "re", descriptor = "Lclient!qn;")
	private final Class51_Sub3 aClass51_Sub3_1 = new Class51_Sub3();

	@OriginalMember(owner = "client!bi", name = "se", descriptor = "Lclient!qn;")
	public final Class51_Sub3 aClass51_Sub3_2 = new Class51_Sub3();

	@OriginalMember(owner = "client!bi", name = "te", descriptor = "I")
	public int anInt1074 = 8;

	@OriginalMember(owner = "client!bi", name = "ve", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!bi", name = "ue", descriptor = "I")
	public int anInt1075 = 3;

	@OriginalMember(owner = "client!bi", name = "ye", descriptor = "Lclient!fh;")
	private final Class114 aClass114_2 = new Class114();

	@OriginalMember(owner = "client!bi", name = "De", descriptor = "I")
	private int anInt1078 = -1;

	@OriginalMember(owner = "client!bi", name = "Ae", descriptor = "I")
	private int anInt1077 = -1;

	@OriginalMember(owner = "client!bi", name = "Ee", descriptor = "I")
	private int anInt1079 = -1;

	@OriginalMember(owner = "client!bi", name = "Ie", descriptor = "[Lclient!jm;")
	private final Interface13[] anInterface13Array2 = new Interface13[4];

	@OriginalMember(owner = "client!bi", name = "He", descriptor = "[Lclient!jm;")
	private final Interface13[] anInterface13Array1 = new Interface13[4];

	@OriginalMember(owner = "client!bi", name = "Je", descriptor = "[Lclient!jm;")
	private final Interface13[] anInterface13Array3 = new Interface13[4];

	@OriginalMember(owner = "client!bi", name = "Ke", descriptor = "Lclient!fh;")
	private final Class114 aClass114_3;

	@OriginalMember(owner = "client!bi", name = "Oe", descriptor = "Lclient!fh;")
	private final Class114 aClass114_4;

	@OriginalMember(owner = "client!bi", name = "Pe", descriptor = "Lclient!fh;")
	private final Class114 aClass114_5;

	@OriginalMember(owner = "client!bi", name = "Qe", descriptor = "Lclient!fh;")
	private final Class114 aClass114_6;

	@OriginalMember(owner = "client!bi", name = "Re", descriptor = "Lclient!fh;")
	private final Class114 aClass114_7;

	@OriginalMember(owner = "client!bi", name = "Se", descriptor = "Lclient!fh;")
	private final Class114 aClass114_8;

	@OriginalMember(owner = "client!bi", name = "Te", descriptor = "Lclient!fh;")
	private final Class114 aClass114_9;

	@OriginalMember(owner = "client!bi", name = "Ze", descriptor = "Lclient!qn;")
	public final Class51_Sub3 aClass51_Sub3_3;

	@OriginalMember(owner = "client!bi", name = "df", descriptor = "Lclient!qn;")
	public final Class51_Sub3 aClass51_Sub3_4;

	@OriginalMember(owner = "client!bi", name = "ef", descriptor = "Lclient!qn;")
	public final Class51_Sub3 aClass51_Sub3_5;

	@OriginalMember(owner = "client!bi", name = "of", descriptor = "I")
	public int anInt1089;

	@OriginalMember(owner = "client!bi", name = "xf", descriptor = "[F")
	private final float[] aFloatArray9;

	@OriginalMember(owner = "client!bi", name = "Ef", descriptor = "F")
	private float aFloat14;

	@OriginalMember(owner = "client!bi", name = "kf", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!bi", name = "ff", descriptor = "I")
	public int anInt1086;

	@OriginalMember(owner = "client!bi", name = "Sf", descriptor = "I")
	private int anInt1098;

	@OriginalMember(owner = "client!bi", name = "ag", descriptor = "I")
	public int anInt1102;

	@OriginalMember(owner = "client!bi", name = "Xf", descriptor = "I")
	public int anInt1099;

	@OriginalMember(owner = "client!bi", name = "Of", descriptor = "I")
	public int anInt1096;

	@OriginalMember(owner = "client!bi", name = "fg", descriptor = "I")
	private int anInt1103;

	@OriginalMember(owner = "client!bi", name = "Vf", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!bi", name = "ug", descriptor = "Z")
	private boolean aBoolean94;

	@OriginalMember(owner = "client!bi", name = "ng", descriptor = "[F")
	public final float[] aFloatArray10;

	@OriginalMember(owner = "client!bi", name = "qg", descriptor = "[Lclient!laa;")
	private final Class2_Sub12[] aClass2_Sub12Array2;

	@OriginalMember(owner = "client!bi", name = "pf", descriptor = "[F")
	private final float[] aFloatArray8;

	@OriginalMember(owner = "client!bi", name = "bg", descriptor = "F")
	private float aFloat19;

	@OriginalMember(owner = "client!bi", name = "If", descriptor = "I")
	private int anInt1094;

	@OriginalMember(owner = "client!bi", name = "Zf", descriptor = "I")
	public int anInt1101;

	@OriginalMember(owner = "client!bi", name = "jg", descriptor = "I")
	private int anInt1106;

	@OriginalMember(owner = "client!bi", name = "Qf", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!bi", name = "Bg", descriptor = "I")
	private int anInt1111;

	@OriginalMember(owner = "client!bi", name = "Ig", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!bi", name = "Lg", descriptor = "I")
	private int anInt1115;

	@OriginalMember(owner = "client!bi", name = "Kg", descriptor = "I")
	private int anInt1114;

	@OriginalMember(owner = "client!bi", name = "tg", descriptor = "I")
	public int anInt1109;

	@OriginalMember(owner = "client!bi", name = "xg", descriptor = "F")
	private float aFloat21;

	@OriginalMember(owner = "client!bi", name = "og", descriptor = "I")
	private int anInt1107;

	@OriginalMember(owner = "client!bi", name = "hf", descriptor = "I")
	public int anInt1088;

	@OriginalMember(owner = "client!bi", name = "Pg", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!bi", name = "uf", descriptor = "F")
	private float aFloat12;

	@OriginalMember(owner = "client!bi", name = "jf", descriptor = "Z")
	private boolean aBoolean81;

	@OriginalMember(owner = "client!bi", name = "gg", descriptor = "I")
	public int anInt1104;

	@OriginalMember(owner = "client!bi", name = "zg", descriptor = "I")
	private int anInt1110;

	@OriginalMember(owner = "client!bi", name = "Fg", descriptor = "[F")
	private final float[] aFloatArray11;

	@OriginalMember(owner = "client!bi", name = "wf", descriptor = "I")
	private int anInt1090;

	@OriginalMember(owner = "client!bi", name = "Wg", descriptor = "F")
	private float aFloat25;

	@OriginalMember(owner = "client!bi", name = "jh", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!bi", name = "hh", descriptor = "I")
	public int anInt1118;

	@OriginalMember(owner = "client!bi", name = "lh", descriptor = "I")
	public int anInt1119;

	@OriginalMember(owner = "client!bi", name = "ih", descriptor = "[F")
	private final float[] aFloatArray12;

	@OriginalMember(owner = "client!bi", name = "kh", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!bi", name = "Nf", descriptor = "Lclient!fm;")
	public Class2_Sub17_Sub2 aClass2_Sub17_Sub2_1;

	@OriginalMember(owner = "client!bi", name = "nh", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!bi", name = "rh", descriptor = "[I")
	public int[] anIntArray66;

	@OriginalMember(owner = "client!bi", name = "sh", descriptor = "[B")
	public final byte[] aByteArray6;

	@OriginalMember(owner = "client!bi", name = "ph", descriptor = "[I")
	public int[] anIntArray65;

	@OriginalMember(owner = "client!bi", name = "oe", descriptor = "I")
	public final int anInt1072;

	@OriginalMember(owner = "client!bi", name = "Nc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas3;

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!bi", name = "jc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!bi", name = "lc", descriptor = "J")
	private final long aLong30;

	@OriginalMember(owner = "client!bi", name = "fe", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!bi", name = "Ff", descriptor = "I")
	public final int anInt1093;

	@OriginalMember(owner = "client!bi", name = "Rg", descriptor = "Z")
	public boolean aBoolean101;

	@OriginalMember(owner = "client!bi", name = "cg", descriptor = "Z")
	private boolean aBoolean90;

	@OriginalMember(owner = "client!bi", name = "Tf", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!bi", name = "wg", descriptor = "Z")
	public boolean aBoolean95;

	@OriginalMember(owner = "client!bi", name = "Af", descriptor = "Z")
	public boolean aBoolean87;

	@OriginalMember(owner = "client!bi", name = "Jg", descriptor = "Z")
	private boolean aBoolean98;

	@OriginalMember(owner = "client!bi", name = "dg", descriptor = "Z")
	public boolean aBoolean91;

	@OriginalMember(owner = "client!bi", name = "bh", descriptor = "Z")
	private final boolean aBoolean105;

	@OriginalMember(owner = "client!bi", name = "je", descriptor = "Lclient!ag;")
	private final Class11 aClass11_1;

	@OriginalMember(owner = "client!bi", name = "we", descriptor = "Lclient!jo;")
	public final Class185 aClass185_1;

	@OriginalMember(owner = "client!bi", name = "le", descriptor = "Lclient!kba;")
	private final Class196 aClass196_1;

	@OriginalMember(owner = "client!bi", name = "ke", descriptor = "Lclient!qaa;")
	private Class2_Sub37_Sub1 aClass2_Sub37_Sub1_1;

	@OriginalMember(owner = "client!bi", name = "ie", descriptor = "Lclient!dca;")
	private final Class67 aClass67_1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class13_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class290();
		new Class323(16);
		this.aClass114_3 = new Class114();
		this.aClass114_4 = new Class114();
		this.aClass114_5 = new Class114();
		this.aClass114_6 = new Class114();
		this.aClass114_7 = new Class114();
		this.aClass114_8 = new Class114();
		this.aClass114_9 = new Class114();
		this.aClass51_Sub3_3 = new Class51_Sub3();
		this.aClass51_Sub3_4 = new Class51_Sub3();
		this.aClass51_Sub3_5 = new Class51_Sub3();
		this.anInt1089 = 512;
		this.aFloatArray9 = new float[4];
		this.aFloat14 = 1.0F;
		this.aFloat10 = 1.0F;
		this.anInt1086 = 0;
		this.anInt1098 = 0;
		this.anInt1102 = 0;
		this.anInt1099 = 50;
		this.anInt1096 = -1;
		this.anInt1103 = 0;
		this.aFloat18 = 3584.0F;
		this.aBoolean94 = true;
		this.aFloatArray10 = new float[4];
		this.aClass2_Sub12Array2 = new Class2_Sub12[Static602.anInt9967];
		this.aFloatArray8 = new float[4];
		this.aFloat19 = 0.0F;
		this.anInt1094 = 3584;
		this.anInt1101 = 512;
		this.anInt1106 = 8448;
		this.aFloat17 = -1.0F;
		this.anInt1111 = 0;
		this.aFloat22 = 1.0F;
		this.anInt1115 = 0;
		this.anInt1114 = 0;
		this.anInt1109 = 0;
		this.aFloat21 = 1.0F;
		this.anInt1107 = 0;
		this.anInt1088 = -1;
		this.aFloat23 = 1.0F;
		this.aFloat12 = -1.0F;
		this.aBoolean81 = false;
		this.anInt1104 = -1;
		this.anInt1110 = 8448;
		this.aFloatArray11 = new float[16];
		this.anInt1090 = -1;
		this.aFloat25 = -1.0F;
		this.aFloat28 = -1.0F;
		this.anInt1118 = -1;
		this.anInt1119 = 0;
		this.aFloatArray12 = new float[4];
		this.aFloat29 = 3584.0F;
		this.aClass2_Sub17_Sub2_1 = new Class2_Sub17_Sub2(8192);
		this.anIntArray64 = new int[1];
		this.anIntArray66 = new int[1];
		this.aByteArray6 = new byte[16384];
		this.anIntArray65 = new int[1];
		this.anInt1072 = arg2;
		this.aCanvas2 = this.aCanvas3 = arg0;
		if (!Static354.method5314("jaclib")) {
			throw new RuntimeException("");
		} else if (Static354.method5314("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong31 = this.aLong30 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt1072);
				if (this.aLong30 == 0L) {
					throw new RuntimeException("");
				}
				this.method1069();
				@Pc(331) int local331 = this.method1033();
				if (local331 != 0) {
					throw new RuntimeException("");
				}
				this.anInt1093 = this.aBoolean102 ? 33639 : 5121;
				if (this.aString8.indexOf("radeon") != -1) {
					@Pc(358) int local358 = 0;
					@Pc(360) boolean local360 = false;
					@Pc(362) boolean local362 = false;
					@Pc(371) String[] local371 = Static386.method5691(' ', this.aString8.replace('/', ' '));
					for (@Pc(373) int local373 = 0; local373 < local371.length; local373++) {
						@Pc(378) String local378 = local371[local373];
						try {
							if (local378.length() > 0) {
								if (local378.charAt(0) == 'x' && local378.length() >= 3 && Static445.method6373(local378.substring(1, 3))) {
									local378 = local378.substring(1);
									local362 = true;
								}
								if (local378.equals("hd")) {
									local360 = true;
								} else {
									if (local378.startsWith("hd")) {
										local378 = local378.substring(2);
										local360 = true;
									}
									if (local378.length() >= 4 && Static445.method6373(local378.substring(0, 4))) {
										local358 = Static307.method4785(local378.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(445) Exception local445) {
						}
					}
					if (!local360 || local358 < 4000) {
						this.aBoolean101 = false;
					}
					if (!local362 && !local360) {
						if (local358 >= 7000 && local358 <= 7999) {
							this.aBoolean90 = false;
						}
						if (local358 >= 7000 && local358 <= 9250) {
							this.aBoolean88 = false;
						}
					}
					this.aBoolean95 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean87 = true;
					this.aBoolean98 = this.aBoolean90;
				}
				if (this.aString9.indexOf("intel") != -1) {
					this.aBoolean91 = false;
				}
				this.aBoolean105 = !this.aString9.equals("s3 graphics");
				if (this.aBoolean90) {
					try {
						@Pc(529) int[] local529 = new int[1];
						OpenGL.glGenBuffersARB(1, local529, 0);
					} catch (@Pc(535) Throwable local535) {
						throw new RuntimeException("");
					}
				}
				Static187.method3201(true, false);
				this.aBoolean77 = true;
				this.aClass11_1 = new Class11(this, super.anInterface2_12);
				this.method1041();
				this.aClass185_1 = new Class185(this);
				this.aClass196_1 = new Class196(this);
				if (this.aClass196_1.method4531()) {
					this.aClass2_Sub37_Sub1_1 = new Class2_Sub37_Sub1(this);
					if (!this.aClass2_Sub37_Sub1_1.method6471()) {
						this.aClass2_Sub37_Sub1_1.method6467();
						this.aClass2_Sub37_Sub1_1 = null;
					}
				}
				this.aClass67_1 = new Class67(this);
				this.method1025();
				this.method1051();
				this.method8118();
			} catch (@Pc(609) Throwable local609) {
				local609.printStackTrace();
				this.method8103();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZ[BI)Lclient!g;")
	public Interface7 method1020(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2) {
		return (Interface7) (this.aBoolean90 && (!arg1 || this.aBoolean98) ? new Class93_Sub1(this, 5123, arg2, arg0, arg1) : new Class130_Sub2(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBII)V")
	public void method1021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V")
	public void method1022(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean86) {
			this.aBoolean86 = arg0;
			this.method1075();
			this.anInt1085 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(II)V")
	public void method1023(@OriginalArg(0) int arg0) {
		this.method1058(arg0, true);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([IIIIIZ)Lclient!iea;")
	@Override
	public Class31 method8157(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class31_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "()V")
	@Override
	public void method8150() {
		this.aClass196_1.method4529();
	}

	@OriginalMember(owner = "client!bi", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt1090;
		if (local15 || arg1 != this.aFloat28 || this.aFloat17 != arg2) {
			this.anInt1090 = arg0;
			this.aFloat17 = arg2;
			this.aFloat28 = arg1;
			if (local15) {
				this.aFloat22 = (float) (this.anInt1090 & 0xFF0000) / 1.671168E7F;
				this.aFloat23 = (float) (this.anInt1090 & 0xFF00) / 65280.0F;
				this.aFloat10 = (float) (this.anInt1090 & 0xFF) / 255.0F;
				this.method1086();
			}
			this.method1073();
		}
		if (arg3 == this.aFloatArray8[0] && this.aFloatArray8[1] == arg4 && arg5 == this.aFloatArray8[2]) {
			return;
		}
		this.aFloatArray8[2] = arg5;
		this.aFloatArray8[0] = arg3;
		this.aFloatArray8[1] = arg4;
		this.aFloatArray9[2] = -arg5;
		this.aFloatArray9[0] = -arg3;
		this.aFloatArray9[1] = -arg4;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray10[1] = local142 * arg4;
		this.aFloatArray10[0] = local142 * arg3;
		this.aFloatArray10[2] = arg5 * local142;
		this.aFloatArray12[2] = -this.aFloatArray10[2];
		this.aFloatArray12[1] = -this.aFloatArray10[1];
		this.aFloatArray12[0] = -this.aFloatArray10[0];
		this.method1099();
		this.anInt1112 = (int) (arg3 * 256.0F / arg4);
		this.anInt1092 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!bi", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt1119, this.anInt1109, this.anInt1089, this.anInt1101 };
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(IIZ)V")
	public synchronized void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub41 local8 = new Class2_Sub41(arg1);
		local8.aLong278 = (long) arg0;
		this.aClass114_7.method2771(local8);
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
	private void method1025() {
		this.method1023(-2);
		for (@Pc(12) int local12 = this.anInt1113 - 1; local12 >= 0; local12--) {
			this.method1093(local12);
			this.method1096((Class10) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method1045(8448, 8448);
		this.method1021(34168, 770, 2);
		this.method1052();
		this.anInt1083 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt1084 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean80 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean79 = true;
		this.method1035(true);
		this.method1022(true);
		this.method1047(true);
		this.method1062(true);
		this.method1031();
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
		@Pc(128) float[] local128 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(130) int local130 = 0; local130 < 8; local130++) {
			@Pc(135) int local135 = local130 + 16384;
			OpenGL.glLightfv(local135, 4608, local128, 0);
			OpenGL.glLightf(local135, 4615, 0.0F);
			OpenGL.glLightf(local135, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt1090 = this.anInt1104 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "()Z")
	@Override
	public boolean method8114() {
		return true;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZZ)V")
	public void method1026(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt1105 || this.aBoolean107 != this.aBoolean81) {
			@Pc(10) Class10_Sub2 local10 = null;
			@Pc(12) int local12 = 0;
			@Pc(14) byte local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23 = this.aBoolean107 ? 3 : 0;
			if (arg0 < 0) {
				this.method1052();
			} else {
				local10 = this.aClass11_1.method154(arg0);
				@Pc(37) Class271 local37 = super.anInterface2_12.method6027(arg0);
				if (local37.aByte93 == 0 && local37.aByte95 == 0) {
					this.method1052();
				} else {
					@Pc(60) int local60 = local37.aBoolean516 ? 64 : 128;
					@Pc(64) int local64 = local60 * 50;
					this.method1053((float) (local37.aByte95 * (this.anInt1076 % local64)) / (float) local64, 0.0F, (float) (local37.aByte93 * (this.anInt1076 % local64)) / (float) local64);
				}
				local12 = local37.anInt7163;
				if (!this.aBoolean107) {
					local14 = local37.aByte97;
					local16 = local37.anInt7159;
					local23 = local37.aByte94;
				}
			}
			this.aClass67_1.method1888(local23, arg1, local14, arg2, local16);
			if (!this.aClass67_1.method1889(local10, local12)) {
				this.method1096(local10);
				this.method1046(local12);
			}
			this.anInt1105 = arg0;
			this.aBoolean81 = this.aBoolean107;
		}
		this.anInt1085 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!bi", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean107) {
			throw new RuntimeException("");
		}
		this.anInt1096 = arg2;
		this.anInt1117 = arg0;
		this.anInt1118 = arg1;
		this.anInt1086 = arg3;
		if (this.aBoolean81) {
			this.aClass67_1.aClass59_Sub8_1.method8044();
			this.aClass67_1.aClass59_Sub8_1.method8046();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)V")
	public void method1027(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean96) {
			this.aBoolean96 = arg0;
			this.method1075();
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
	private void method1028() {
		if (this.anInt1097 != 2) {
			this.anInt1097 = 2;
			this.method1042();
			this.method1076();
			this.anInt1085 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bi", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1101 = arg3;
		this.anInt1109 = arg1;
		this.anInt1119 = arg0;
		this.anInt1089 = arg2;
		this.method1081();
		this.method1049();
		if (this.anInt1097 == 3) {
			this.method1057();
		} else if (this.anInt1097 == 2) {
			this.method1042();
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "()Z")
	@Override
	public boolean method8093() {
		return this.aClass2_Sub37_Sub1_1 != null && this.aClass2_Sub37_Sub1_1.method6460();
	}

	@OriginalMember(owner = "client!bi", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1104 == arg0 && this.anInt1088 == arg1 && arg2 == this.anInt1102) {
			return;
		}
		this.anInt1104 = arg0;
		this.anInt1102 = arg2;
		this.anInt1088 = arg1;
		this.method1091();
		this.method1039();
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V")
	private void method1029() {
		if (this.anInt1097 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt990 > 0 && this.anInt980 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt990, (double) this.anInt980, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt1097 = 1;
		this.anInt1085 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "(I)V")
	public void method1030() {
		if (this.anInt1085 == 8) {
			return;
		}
		this.method1028();
		this.method1035(true);
		this.method1047(true);
		this.method1062(true);
		this.method1090(1);
		this.anInt1085 = 8;
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
	@Override
	public void method8105() {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIZ)Lclient!iea;")
	@Override
	public Class31 method8153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class31_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class91 method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class91_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "(I)V")
	public void method1031() {
		if (this.anInt1097 != 0) {
			this.anInt1097 = 0;
			this.anInt1085 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass196_1.method4527(arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)I")
	@Override
	public int method8122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "()Lclient!nia;")
	@Override
	public Class240 method8135() {
		@Pc(7) int local7 = -1;
		if (this.aString9.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString9.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString9.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class240(local7, "OpenGL", this.anInt1087, this.aString8, 0L);
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(II)Lclient!hca;")
	@Override
	public Interface8 method8151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	public synchronized void method1032(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub41 local8 = new Class2_Sub41(arg0);
		local8.aLong278 = (long) arg1;
		this.aClass114_5.method2771(local8);
	}

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "(I)I")
	private int method1033() {
		@Pc(5) int local5 = 0;
		this.aString9 = OpenGL.glGetString(7936).toLowerCase();
		this.aString8 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString9.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString9.indexOf("brian paul") != -1 || this.aString9.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(52) String[] local52 = Static386.method5691(' ', local44.replace('.', ' '));
		if (local52.length >= 2) {
			try {
				@Pc(62) int local62 = Static307.method4785(local52[0]);
				@Pc(68) int local68 = Static307.method4785(local52[1]);
				this.anInt1087 = local62 * 10 + local68;
			} catch (@Pc(78) NumberFormatException local78) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt1087 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(116) int[] local116 = new int[1];
		OpenGL.glGetIntegerv(34018, local116, 0);
		this.anInt1113 = local116[0];
		OpenGL.glGetIntegerv(34929, local116, 0);
		this.anInt1100 = local116[0];
		OpenGL.glGetIntegerv(34930, local116, 0);
		this.anInt1095 = local116[0];
		if (this.anInt1113 < 2 || this.anInt1100 < 2 || this.anInt1095 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean102 = Stream.c();
		this.aBoolean100 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean90 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean92 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean85 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean82 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean97 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean88 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean95 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean106 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean101 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean93 = false;
		this.aBoolean91 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean104 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean103 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean99 = this.aBoolean103 & this.aBoolean104;
		this.aBoolean84 = Class33_Sub26.aString102.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static292.aFloatArray41, 0);
		this.aFloat25 = Static292.aFloatArray41[0];
		this.aFloat12 = Static292.aFloatArray41[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "()Z")
	@Override
	public boolean method8134() {
		return false;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!lga;IIII)Lclient!ka;")
	@Override
	public Class193 method8161(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class193_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method8104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method1087();
		this.method1090(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean92) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean92) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt1099;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZI)V")
	public void method1034(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(ZI)V")
	public void method1035(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean89 != arg0) {
			this.aBoolean89 = arg0;
			this.method1039();
			this.anInt1085 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(IIIIII)Lclient!mda;")
	@Override
	public Class49 method8148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean106 ? new Class49_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!mda;Lclient!mda;FLclient!mda;)Lclient!mda;")
	@Override
	public Class49 method8123(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class49 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean106 && this.aBoolean91) {
			@Pc(15) Class49_Sub1_Sub1 local15 = null;
			@Pc(18) Class49_Sub1 local18 = (Class49_Sub1) arg0;
			@Pc(21) Class49_Sub1 local21 = (Class49_Sub1) arg1;
			@Pc(25) Class10_Sub3 local25 = local18.method7566();
			@Pc(29) Class10_Sub3 local29 = local21.method7566();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local25.anInt5379 > local29.anInt5379 ? local25.anInt5379 : local29.anInt5379;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class49_Sub1_Sub1) {
					@Pc(56) Class49_Sub1_Sub1 local56 = (Class49_Sub1_Sub1) arg3;
					if (local44 == local56.method6508()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class49_Sub1_Sub1(this, local44);
				}
				if (local15.method6511(local25, local29, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg5;
		@Pc(9) Class10_Sub2_Sub1 local9 = local6.aClass10_Sub2_Sub1_3;
		this.method1050();
		this.method1096(local6.aClass10_Sub2_Sub1_3);
		this.method1090(1);
		this.method1045(7681, 8448);
		this.method1021(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat6 / (float) local9.anInt648;
		@Pc(46) float local46 = local9.aFloat5 / (float) local9.anInt649;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local59 * local59)));
		@Pc(76) float local76 = local59 * local72;
		@Pc(80) float local80 = local52 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local80 + 0.35F, local76 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method1021(5890, 768, 0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZFF)V")
	public void method1036(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat14 = arg0;
		this.aFloat19 = arg1;
		this.method1091();
	}

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "(I)V")
	private void method1037() {
		this.anOpenGL1.b();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([I)V")
	@Override
	public void method8100(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt980;
		arg0[0] = this.anInt990;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V")
	public synchronized void method1038(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub41 local8 = new Class2_Sub41(arg0);
		this.aClass114_6.method2771(local8);
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)V")
	private void method1039() {
		if (this.aBoolean89 && this.anInt1088 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "(I)V")
	private void method1040() {
		OpenGL.glViewport(this.anInt1103, this.anInt1114, this.anInt990, this.anInt980);
	}

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "(I)V")
	private void method1041() {
		this.aClass10Array1 = new Class10[this.anInt1113];
		this.aClass10_Sub2_1 = new Class10_Sub2(this, 3553, 6408, 1, 1);
		new Class10_Sub2(this, 3553, 6408, 1, 1);
		new Class10_Sub2(this, 3553, 6408, 1, 1);
		this.aClass193_Sub1_9 = new Class193_Sub1(this);
		this.aClass193_Sub1_2 = new Class193_Sub1(this);
		this.aClass193_Sub1_5 = new Class193_Sub1(this);
		this.aClass193_Sub1_1 = new Class193_Sub1(this);
		this.aClass193_Sub1_6 = new Class193_Sub1(this);
		this.aClass193_Sub1_7 = new Class193_Sub1(this);
		this.aClass193_Sub1_4 = new Class193_Sub1(this);
		this.aClass193_Sub1_10 = new Class193_Sub1(this);
		this.aClass193_Sub1_3 = new Class193_Sub1(this);
		this.aClass193_Sub1_8 = new Class193_Sub1(this);
		if (this.aBoolean91) {
			this.aClass227_2 = new Class227(this);
			new Class227(this);
		}
	}

	@OriginalMember(owner = "client!bi", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1107 < arg0) {
			this.anInt1107 = arg0;
		}
		if (arg2 < this.anInt1111) {
			this.anInt1111 = arg2;
		}
		if (this.anInt1115 < arg1) {
			this.anInt1115 = arg1;
		}
		if (this.anInt1098 > arg3) {
			this.anInt1098 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method1049();
		this.method1048();
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)V")
	private void method1042() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray11, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bi", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat13 != arg0) {
			this.aFloat13 = arg0;
			this.method1086();
		}
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(B)V")
	public void method1043() {
		if (this.anInt1085 == 16) {
			return;
		}
		this.method1055();
		this.method1035(true);
		this.method1047(true);
		this.method1062(true);
		this.method1090(1);
		this.anInt1085 = 16;
	}

	@OriginalMember(owner = "client!bi", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass51_Sub3_3.aFloat141 * (float) arg1 + this.aClass51_Sub3_3.aFloat132 * (float) arg0 + (float) arg2 * this.aClass51_Sub3_3.aFloat134 + this.aClass51_Sub3_3.aFloat140;
		if (local28 < (float) this.anInt1099 || (float) this.anInt1094 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt1089 * (this.aClass51_Sub3_3.aFloat137 * (float) arg2 + this.aClass51_Sub3_3.aFloat136 * (float) arg0 + (float) arg1 * this.aClass51_Sub3_3.aFloat142 + this.aClass51_Sub3_3.aFloat135) / local28);
		@Pc(117) int local117 = (int) ((this.aClass51_Sub3_3.aFloat138 + this.aClass51_Sub3_3.aFloat133 * (float) arg2 + (float) arg1 * this.aClass51_Sub3_3.aFloat139 + this.aClass51_Sub3_3.aFloat143 * (float) arg0) * (float) this.anInt1101 / local28);
		if ((float) local85 >= this.aFloat26 && (float) local85 <= this.aFloat24 && this.aFloat11 <= (float) local117 && (float) local117 <= this.aFloat27) {
			arg3[0] = (int) ((float) local85 - this.aFloat26);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat11);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!bi", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1087();
		this.method1090(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(Z)V")
	public void method1044() {
		if (this.anInt1085 == 4) {
			return;
		}
		this.method1029();
		this.method1035(false);
		this.method1022(false);
		this.method1047(false);
		this.method1062(false);
		this.method1023(-2);
		this.method1090(1);
		this.anInt1085 = 4;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "()Z")
	@Override
	public boolean method8084() {
		return true;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
	public void method1045(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1116 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (arg0 != this.anInt1110) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt1110 = arg0;
			local17 = true;
		}
		if (arg1 != this.anInt1106) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt1106 = arg1;
			local17 = true;
		}
		if (local17) {
			this.anInt1085 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)V")
	@Override
	public void method8139(@OriginalArg(0) int arg0) {
		this.method1069();
	}

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "(II)V")
	public void method1046(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method1045(7681, 7681);
		} else if (arg0 == 0) {
			this.method1045(8448, 8448);
		} else if (arg0 == 2) {
			this.method1045(34165, 7681);
		} else if (arg0 == 3) {
			this.method1045(260, 8448);
			return;
		} else if (arg0 == 4) {
			this.method1045(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(IZ)V")
	public void method1047(@OriginalArg(1) boolean arg0) {
		if (this.bf == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt1085 &= 0xFFFFFFE0;
		this.bf = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)V")
	@Override
	public void method8133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "(I)V")
	private void method1048() {
		if (this.anInt1111 >= this.anInt1107 && this.anInt1115 <= this.anInt1098) {
			OpenGL.glScissor(this.anInt1107 + this.anInt1103, -this.anInt1098 + this.anInt1114 + this.anInt980, this.anInt1111 - this.anInt1107, this.anInt1098 + -this.anInt1115);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!bi", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1087();
		this.method1090(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "(I)V")
	private void method1049() {
		this.aFloat24 = (float) (this.anInt1111 - this.anInt1119);
		this.aFloat27 = (float) (this.anInt1098 - this.anInt1109);
		this.aFloat26 = (float) (this.anInt1107 - this.anInt1119);
		this.aFloat11 = (float) (this.anInt1115 - this.anInt1109);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "()I")
	@Override
	public int method8089() {
		return 4;
	}

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "()Z")
	@Override
	public boolean method8152() {
		return true;
	}

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(B)V")
	public void method1050() {
		if (this.anInt1085 == 2) {
			return;
		}
		this.method1029();
		this.method1035(false);
		this.method1022(false);
		this.method1047(false);
		this.method1062(false);
		this.method1023(-2);
		this.anInt1085 = 2;
	}

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "()V")
	@Override
	public void method8110() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "()Z")
	@Override
	public boolean method8128() {
		return this.aClass2_Sub37_Sub1_1 != null && (this.anInt1072 <= 1 || this.aBoolean99);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8146(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas3) {
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

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1107;
		arg0[1] = this.anInt1115;
		arg0[2] = this.anInt1111;
		arg0[3] = this.anInt1098;
	}

	@OriginalMember(owner = "client!bi", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt1115 = 0;
		this.anInt1107 = 0;
		this.anInt1111 = this.anInt990;
		this.anInt1098 = this.anInt980;
		OpenGL.glDisable(3089);
		this.method1049();
	}

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "(B)V")
	private void method1051() {
		if (this.aCanvas2 == null) {
			this.anInt963 = this.anInt1052 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas2.getSize();
			this.anInt963 = local10.width;
			this.anInt1052 = local10.height;
		}
		if (this.anInterface13_1 == null) {
			this.anInt990 = this.anInt963;
			this.anInt980 = this.anInt1052;
			this.method1040();
		}
		this.method1031();
		this.la();
	}

	@OriginalMember(owner = "client!bi", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(37) float local37;
		@Pc(41) float local41;
		if (this.aClass10_Sub2_Sub1_1 == null || this.aClass10_Sub2_Sub1_1.anInt634 < arg2 || this.aClass10_Sub2_Sub1_1.anInt639 < arg3) {
			this.aClass10_Sub2_Sub1_1 = Static596.method8401(arg6, arg3, this, arg2);
			this.aClass10_Sub2_Sub1_1.method720(false, false);
			local37 = this.aClass10_Sub2_Sub1_1.aFloat5;
			local41 = this.aClass10_Sub2_Sub1_1.aFloat6;
		} else {
			this.aClass10_Sub2_Sub1_1.method727(false, arg6, arg3, arg2, 6406);
			local41 = this.aClass10_Sub2_Sub1_1.aFloat6 * (float) arg2 / (float) this.aClass10_Sub2_Sub1_1.anInt634;
			local37 = (float) arg3 * this.aClass10_Sub2_Sub1_1.aFloat5 / (float) this.aClass10_Sub2_Sub1_1.anInt639;
		}
		this.method1050();
		this.method1096(this.aClass10_Sub2_Sub1_1);
		this.method1090(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method1068(arg5);
		this.method1045(34165, 34165);
		this.method1021(34166, 768, 0);
		this.method1021(5890, 770, 2);
		this.method1034(34166, 0);
		this.method1034(5890, 2);
		@Pc(142) float local142 = (float) arg0;
		@Pc(145) float local145 = (float) arg1;
		@Pc(150) float local150 = (float) arg2 + local142;
		@Pc(155) float local155 = (float) arg3 + local145;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local142, local145);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local142, local155);
		OpenGL.glTexCoord2f(local37, local41);
		OpenGL.glVertex2f(local150, local155);
		OpenGL.glTexCoord2f(local37, 0.0F);
		OpenGL.glVertex2f(local150, local145);
		OpenGL.glEnd();
		this.method1021(5890, 768, 0);
		this.method1021(34166, 770, 2);
		this.method1034(5890, 0);
		this.method1034(34166, 2);
	}

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "(I)V")
	private void method1052() {
		if (this.aBoolean83) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean83 = false;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(FFZF)V")
	private void method1053(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean83) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean83 = true;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
	@Override
	public void method8098(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "()Z")
	@Override
	public boolean method8147() {
		return this.aBoolean92 && (!this.method8093() || this.aBoolean99);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8124(@OriginalArg(0) Canvas arg0) {
		this.aLong31 = 0L;
		this.aCanvas2 = null;
		if (arg0 == null || this.aCanvas3 == arg0) {
			this.aCanvas2 = this.aCanvas3;
			this.aLong31 = this.aLong30;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable1.get(arg0);
			this.aLong31 = local26;
			this.aCanvas2 = arg0;
		}
		if (this.aCanvas2 == null || this.aLong31 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong31);
		this.method1051();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(FB)V")
	public void method1054(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat21) {
			this.aFloat21 = arg0;
			if (this.anInt1097 == 3) {
				this.method1057();
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "(I)V")
	private void method1055() {
		if (this.anInt1097 != 3) {
			this.anInt1097 = 3;
			this.method1057();
			this.method1076();
			this.anInt1085 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;ZIZ)Lclient!ju;")
	public Interface14 method1056(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(3) int arg2) {
		return (Interface14) (this.aBoolean90 ? new Class93_Sub2(this, arg0, arg1, arg2, false) : new Class130_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "()V")
	@Override
	protected void method8103() {
		for (@Pc(4) Class2 local4 = this.aClass114_2.method2772(); local4 != null; local4 = this.aClass114_2.method2762()) {
			((Class2_Sub40_Sub2) local4).method8402();
		}
		if (this.aClass196_1 != null) {
			this.aClass196_1.method4524();
		}
		if (this.anOpenGL1 != null) {
			this.method1037();
			@Pc(37) Enumeration local37 = this.aHashtable1.keys();
			while (local37.hasMoreElements()) {
				@Pc(42) Canvas local42 = (Canvas) local37.nextElement();
				@Pc(48) Long local48 = (Long) this.aHashtable1.get(local42);
				this.anOpenGL1.releaseSurface(local42, local48);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean77) {
			Static21.method563(false, true);
			this.aBoolean77 = false;
		}
	}

	@OriginalMember(owner = "client!bi", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt1107 || arg0 - arg2 > this.anInt1111 || arg1 + arg2 < this.anInt1115 || arg1 - arg2 > this.anInt1098) {
			return;
		}
		this.method1087();
		this.method1090(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(67) float local67 = (float) arg0 + 0.35F;
		@Pc(72) float local72 = (float) arg1 + 0.35F;
		@Pc(76) int local76 = arg2 << 1;
		if ((float) local76 < this.aFloat25) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local67 + 1.0F, local72 + 1.0F);
			OpenGL.glVertex2f(local67 + 1.0F, local72 - 1.0F);
			OpenGL.glVertex2f(local67 - 1.0F, local72 - 1.0F);
			OpenGL.glVertex2f(local67 - 1.0F, local72 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat12 >= (float) local76) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local76);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local67, local72);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local67, local72);
			@Pc(145) int local145 = 262144 / (arg2 * 6);
			if (local145 <= 64) {
				local145 = 64;
			} else if (local145 > 512) {
				local145 = 512;
			}
			local145 = Static276.method7580(local145);
			OpenGL.glVertex2f(local67 + (float) arg2, local72);
			for (@Pc(171) int local171 = 16384 - local145; local171 > 0; local171 -= local145) {
				OpenGL.glVertex2f(local67 + (float) arg2 * Class33_Sub27.aFloatArray106[local171], local72 + (float) arg2 * Class33_Sub27.aFloatArray107[local171]);
			}
			OpenGL.glVertex2f(local67 + (float) arg2, local72);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "()V")
	@Override
	public void method8108() {
		if (this.aClass2_Sub37_Sub1_1 != null && this.aClass2_Sub37_Sub1_1.method6460()) {
			this.aClass196_1.method4532(this.aClass2_Sub37_Sub1_1);
			this.aClass11_1.method147();
		}
	}

	@OriginalMember(owner = "client!bi", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method1090(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "(B)V")
	private void method1057() {
		@Pc(15) float local15 = this.aFloat21 * (float) -this.anInt1119 / (float) this.anInt1089;
		@Pc(27) float local27 = this.aFloat21 * (float) -this.anInt1109 / (float) this.anInt1101;
		@Pc(42) float local42 = (float) (this.anInt990 - this.anInt1119) * this.aFloat21 / (float) this.anInt1089;
		@Pc(62) float local62 = (float) (this.anInt980 - this.anInt1109) * this.aFloat21 / (float) this.anInt1101;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local42 && local27 != local62) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local62, (double) -local27, (double) this.anInt1099, (double) this.anInt1094);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZZ)V")
	public void method1058(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method1026(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "()Z")
	@Override
	public boolean method8109() {
		return true;
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(II)I")
	@Override
	public int method8163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "(B)Lclient!kk;")
	public Class10_Sub3 method1059() {
		return this.aClass49_Sub1_1 == null ? null : this.aClass49_Sub1_1.method7566();
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt1099 && arg1 == this.anInt1094) {
			return;
		}
		this.anInt1094 = arg1;
		this.anInt1099 = arg0;
		this.method1081();
		this.method1091();
		if (this.anInt1097 == 3) {
			this.method1057();
		} else if (this.anInt1097 == 2) {
			this.method1042();
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "()V")
	@Override
	public void method8166() {
	}

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "()Z")
	@Override
	public boolean method8116() {
		if (this.aClass2_Sub37_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub37_Sub1_1.method6460()) {
			if (!this.aClass196_1.method4525(this.aClass2_Sub37_Sub1_1)) {
				return false;
			}
			this.aClass11_1.method147();
		}
		return true;
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
	@Override
	public void method8113(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt1073 = arg0;
		this.aClass11_1.method147();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[BZII)Lclient!ju;")
	public Interface14 method1060(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return (Interface14) (this.aBoolean90 && (!arg1 || this.aBoolean98) ? new Class93_Sub2(this, arg3, arg0, arg2, arg1) : new Class130_Sub1(this, arg3, arg0, arg2));
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
	@Override
	public void method8099(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!jm;)V")
	public void method1061(@OriginalArg(1) Interface13 arg0) {
		if (this.aBoolean104) {
			this.method1079(arg0);
			this.method1095(arg0);
		} else if (this.anInt1078 < 3) {
			if (this.anInt1078 >= 0) {
				this.anInterface13Array3[this.anInt1078].method5334();
			}
			this.anInterface13_2 = this.anInterface13_1 = this.anInterface13Array3[++this.anInt1078] = arg0;
			this.anInterface13_2.method5335();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "()Z")
	@Override
	public boolean method8145() {
		return true;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)V")
	public void method1062(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean78 != arg0) {
			this.aBoolean78 = arg0;
			this.method1066();
			this.anInt1085 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "(II)I")
	public int method1063(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BJ)V")
	public synchronized void method1064(@OriginalArg(1) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong278 = arg0;
		this.aClass114_9.method2771(local7);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!nl;)V")
	@Override
	public void method8168(@OriginalArg(0) Interface18 arg0) {
	}

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "()V")
	@Override
	public void method8118() {
		if (!this.aBoolean105 || this.anInt990 <= 0 || this.anInt980 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt1107;
		@Pc(25) int local25 = this.anInt1111;
		@Pc(28) int local28 = this.anInt1115;
		@Pc(31) int local31 = this.anInt1098;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method1031();
		this.method1035(false);
		this.method1022(false);
		this.method1047(false);
		this.method1062(false);
		this.method1096((Class10) null);
		this.method1023(-2);
		this.method1046(1);
		this.method1090(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt990, this.anInt980, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "(I)V")
	public void method1065() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8126() {
		this.method1087();
		this.method1090(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "(I)V")
	private void method1066() {
		OpenGL.glDepthMask(this.aBoolean78 && this.aBoolean94);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!fl;)V")
	@Override
	public void method8101(@OriginalArg(0) Class119 arg0) {
		this.aClass249_1.method5950(this, -1, arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8131(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas3 == arg0) {
			local5 = this.aLong30;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas2 == arg0) {
			this.method1051();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!fl;I)V")
	@Override
	public void method8165(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1) {
		this.aClass249_1.method5950(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!uo;Lclient!uo;Lclient!uo;Lclient!uo;)V")
	public void method1067(@OriginalArg(1) Class352 arg0, @OriginalArg(2) Class352 arg1, @OriginalArg(3) Class352 arg2, @OriginalArg(4) Class352 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method1098(arg1.anInterface14_7);
			OpenGL.glVertexPointer(arg1.aByte129, arg1.aShort119, this.anInterface14_1.method4794(), this.anInterface14_1.method4796() + (long) arg1.aByte128);
			OpenGL.glEnableClientState(32884);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method1098(arg0.anInterface14_7);
			OpenGL.glNormalPointer(arg0.aShort119, this.anInterface14_1.method4794(), this.anInterface14_1.method4796() + (long) arg0.aByte128);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method1098(arg2.anInterface14_7);
			OpenGL.glColorPointer(arg2.aByte129, arg2.aShort119, this.anInterface14_1.method4794(), this.anInterface14_1.method4796() + (long) arg2.aByte128);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method1098(arg3.anInterface14_7);
			OpenGL.glTexCoordPointer(arg3.aByte129, arg3.aShort119, this.anInterface14_1.method4794(), this.anInterface14_1.method4796() + (long) arg3.aByte128);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "(II)V")
	public void method1068(@OriginalArg(1) int arg0) {
		Static292.aFloatArray41[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static292.aFloatArray41[3] = (float) (arg0 >>> 24) / 255.0F;
		Static292.aFloatArray41[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static292.aFloatArray41[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static292.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!bi", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt1075 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt1075++;
		}
		this.anInt1074 = 0x1 << this.anInt1075;
	}

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "(B)V")
	private void method1069() {
		@Pc(5) int local5 = 0;
		while (!this.anOpenGL1.a()) {
			if (local5++ > 5) {
				throw new RuntimeException("");
			}
			Static440.method6322(1000L);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!qn;I)V")
	public void method1070(@OriginalArg(0) Class51_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method6725(), 0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIF)Lclient!laa;")
	@Override
	public Class2_Sub12 method8111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub12_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BFFFF)V")
	public void method1071(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static292.aFloatArray41[2] = arg3;
		Static292.aFloatArray41[3] = arg1;
		Static292.aFloatArray41[0] = arg2;
		Static292.aFloatArray41[1] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static292.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass51_Sub3_3.aFloat140 + (float) arg2 * this.aClass51_Sub3_3.aFloat134 + (float) arg0 * this.aClass51_Sub3_3.aFloat132 + (float) arg1 * this.aClass51_Sub3_3.aFloat141;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt1089 * (this.aClass51_Sub3_3.aFloat135 + this.aClass51_Sub3_3.aFloat142 * (float) arg1 + this.aClass51_Sub3_3.aFloat136 * (float) arg0 + this.aClass51_Sub3_3.aFloat137 * (float) arg2) / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat26);
		@Pc(118) int local118 = (int) ((this.aClass51_Sub3_3.aFloat139 * (float) arg1 + this.aClass51_Sub3_3.aFloat143 * (float) arg0 + (float) arg2 * this.aClass51_Sub3_3.aFloat133 + this.aClass51_Sub3_3.aFloat138) * (float) this.anInt1101 / local28);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local118 - this.aFloat11);
	}

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt1120;
		this.anInt1120 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static141.aFloat60 = arg1;
		Static626.aFloat206 = arg0;
		Static542.aFloat166 = arg2;
	}

	@OriginalMember(owner = "client!bi", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt1094;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLclient!qn;)V")
	public void method1072(@OriginalArg(1) Class51_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method6725(), 0);
	}

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "(B)V")
	private void method1073() {
		Static292.aFloatArray41[1] = this.aFloat23 * this.aFloat28;
		Static292.aFloatArray41[3] = 1.0F;
		Static292.aFloatArray41[2] = this.aFloat28 * this.aFloat10;
		Static292.aFloatArray41[0] = this.aFloat22 * this.aFloat28;
		OpenGL.glLightfv(16384, 4609, Static292.aFloatArray41, 0);
		Static292.aFloatArray41[0] = -this.aFloat17 * this.aFloat22;
		Static292.aFloatArray41[2] = this.aFloat10 * -this.aFloat17;
		Static292.aFloatArray41[3] = 1.0F;
		Static292.aFloatArray41[1] = this.aFloat23 * -this.aFloat17;
		OpenGL.glLightfv(16385, 4609, Static292.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!bi", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!jm;I)V")
	public void method1074(@OriginalArg(0) Interface13 arg0) {
		if (this.anInt1077 < 0 || this.anInterface13Array2[this.anInt1077] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface13Array2[this.anInt1077--] = null;
		arg0.method5337();
		if (this.anInt1077 < 0) {
			this.anInterface13_1 = null;
		} else {
			this.anInterface13_1 = this.anInterface13Array2[this.anInt1077];
			this.anInterface13_1.method5338();
		}
	}

	@OriginalMember(owner = "client!bi", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method1087();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method1090(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean92) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean92) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "(B)V")
	private void method1075() {
		if (this.aBoolean86 && !this.aBoolean96) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8158(@OriginalArg(0) Class2_Sub40 arg0) {
		this.aNativeHeap1 = ((Class2_Sub40_Sub2) arg0).aNativeHeap6;
		if (this.anInterface14_2 != null) {
			return;
		}
		@Pc(16) Class2_Sub17_Sub2 local16 = new Class2_Sub17_Sub2(80);
		if (this.aBoolean102) {
			local16.method2890(-1.0F);
			local16.method2890(-1.0F);
			local16.method2890(0.0F);
			local16.method2890(0.0F);
			local16.method2890(1.0F);
			local16.method2890(1.0F);
			local16.method2890(-1.0F);
			local16.method2890(0.0F);
			local16.method2890(1.0F);
			local16.method2890(1.0F);
			local16.method2890(1.0F);
			local16.method2890(1.0F);
			local16.method2890(0.0F);
			local16.method2890(1.0F);
			local16.method2890(0.0F);
			local16.method2890(-1.0F);
			local16.method2890(1.0F);
			local16.method2890(0.0F);
			local16.method2890(0.0F);
			local16.method2890(0.0F);
		} else {
			local16.method2892(-1.0F);
			local16.method2892(-1.0F);
			local16.method2892(0.0F);
			local16.method2892(0.0F);
			local16.method2892(1.0F);
			local16.method2892(1.0F);
			local16.method2892(-1.0F);
			local16.method2892(0.0F);
			local16.method2892(1.0F);
			local16.method2892(1.0F);
			local16.method2892(1.0F);
			local16.method2892(1.0F);
			local16.method2892(0.0F);
			local16.method2892(1.0F);
			local16.method2892(0.0F);
			local16.method2892(-1.0F);
			local16.method2892(1.0F);
			local16.method2892(0.0F);
			local16.method2892(0.0F);
			local16.method2892(0.0F);
		}
		this.anInterface14_2 = this.method1060(local16.aByteArray26, false, local16.anInt3378, 20);
		this.aClass352_1 = new Class352(this.anInterface14_2, 5126, 3, 0);
		this.aClass352_2 = new Class352(this.anInterface14_2, 5126, 2, 12);
		this.aClass249_1.method5952(this);
	}

	@OriginalMember(owner = "client!bi", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg1 * this.aClass51_Sub3_3.aFloat141 + (float) arg0 * this.aClass51_Sub3_3.aFloat132 + this.aClass51_Sub3_3.aFloat134 * (float) arg2 + this.aClass51_Sub3_3.aFloat140;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass51_Sub3_3.aFloat140 + this.aClass51_Sub3_3.aFloat141 * (float) arg4 + this.aClass51_Sub3_3.aFloat132 * (float) arg3 + (float) arg5 * this.aClass51_Sub3_3.aFloat134;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt1099 > local32 && local63 < (float) this.anInt1099) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt1094 && (float) this.anInt1094 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass51_Sub3_3.aFloat135 + this.aClass51_Sub3_3.aFloat137 * (float) arg2 + (float) arg0 * this.aClass51_Sub3_3.aFloat136 + this.aClass51_Sub3_3.aFloat142 * (float) arg1) * (float) this.anInt1089 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt1089 * (this.aClass51_Sub3_3.aFloat135 + this.aClass51_Sub3_3.aFloat136 * (float) arg3 + (float) arg4 * this.aClass51_Sub3_3.aFloat142 + (float) arg5 * this.aClass51_Sub3_3.aFloat137) / local63);
		if ((float) local135 < this.aFloat26 && this.aFloat26 > (float) local167) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat24 && (float) local167 > this.aFloat24) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt1101 * ((float) arg1 * this.aClass51_Sub3_3.aFloat139 + (float) arg0 * this.aClass51_Sub3_3.aFloat143 + (float) arg2 * this.aClass51_Sub3_3.aFloat133 + this.aClass51_Sub3_3.aFloat138) / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt1101 * (this.aClass51_Sub3_3.aFloat138 + (float) arg5 * this.aClass51_Sub3_3.aFloat133 + this.aClass51_Sub3_3.aFloat143 * (float) arg3 + (float) arg4 * this.aClass51_Sub3_3.aFloat139) / local63);
		if ((float) local233 < this.aFloat11 && (float) local265 < this.aFloat11) {
			local7 |= 0x4;
		} else if (this.aFloat27 < (float) local233 && this.aFloat27 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "(I)V")
	private void method1076() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass51_Sub3_4.method6725(), 0);
		if (this.aBoolean81) {
			this.aClass67_1.aClass59_Sub8_1.method8044();
		}
		this.method1099();
		this.method1092();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!jl;[Lclient!hb;Z)Lclient!da;")
	@Override
	public Class37 method8136(@OriginalArg(0) Class183 arg0, @OriginalArg(1) Class139[] arg1) {
		return new Class37_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt1081 + this.anInt1082 + this.anInt1080;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method1087();
		this.method1090(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 - (float) arg1;
		if (local17 == 0.0F && local23 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(44) float local44 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local23 * local23)));
			local23 *= local44;
			local17 *= local44;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local17 + 0.35F, (float) arg3 + local23 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt1121;
		this.anInt1121 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "()Lclient!pda;")
	@Override
	public Class51 method8119() {
		return this.aClass51_Sub3_3;
	}

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "(II)V")
	public synchronized void method1077(@OriginalArg(1) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong278 = (long) arg0;
		this.aClass114_8.method2771(local7);
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)V")
	public synchronized void method1078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class2_Sub41 local14 = new Class2_Sub41(arg1);
		local14.aLong278 = (long) arg0;
		this.aClass114_4.method2771(local14);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!hb;Z)Lclient!iea;")
	@Override
	public Class31 method8141(@OriginalArg(0) Class139 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt3983 * arg0.anInt3984];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray31 == null) {
			for (local21 = 0; local21 < arg0.anInt3983; local21++) {
				for (local25 = 0; local25 < arg0.anInt3984; local25++) {
					@Pc(38) int local38 = arg0.anIntArray261[arg0.aByteArray32[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt3983; local21++) {
				for (local25 = 0; local25 < arg0.anInt3984; local25++) {
					local12[local16++] = arg0.aByteArray31[local14] << 24 | arg0.anIntArray261[arg0.aByteArray32[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(127) Class31 local127 = this.method8088(arg0.anInt3984, arg0.anInt3983, local12, arg0.anInt3984);
		local127.method8792(arg0.anInt3981, arg0.anInt3980, arg0.anInt3985, arg0.anInt3982);
		return local127;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Lclient!jm;I)V")
	public void method1079(@OriginalArg(0) Interface13 arg0) {
		if (this.anInt1079 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt1079 >= 0) {
			this.anInterface13Array1[this.anInt1079].method5339();
		}
		this.anInterface13_2 = this.anInterface13Array1[++this.anInt1079] = arg0;
		this.anInterface13_2.method5336();
	}

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub40 method8162(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub40_Sub2 local8 = new Class2_Sub40_Sub2(arg0);
		this.aClass114_2.method2771(local8);
		return local8;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!g;Z)V")
	public void method1080(@OriginalArg(0) Interface7 arg0) {
		if (this.anInterface7_2 != arg0) {
			if (this.aBoolean90) {
				OpenGL.glBindBufferARB(34963, arg0.method4614());
			}
			this.anInterface7_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!hca;Lclient!lda;)Lclient!nl;")
	@Override
	public Interface18 method8107(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Interface15 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!mda;)V")
	@Override
	public void method8132(@OriginalArg(0) Class49 arg0) {
		this.aClass49_Sub1_1 = (Class49_Sub1) arg0;
	}

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "(B)V")
	private void method1081() {
		@Pc(10) float[] local10 = this.aFloatArray11;
		@Pc(22) float local22 = (float) (-this.anInt1119 * this.anInt1099) / (float) this.anInt1089;
		@Pc(37) float local37 = (float) ((this.anInt990 - this.anInt1119) * this.anInt1099) / (float) this.anInt1089;
		@Pc(48) float local48 = (float) (this.anInt1109 * this.anInt1099) / (float) this.anInt1101;
		@Pc(63) float local63 = (float) (this.anInt1099 * (this.anInt1109 - this.anInt980)) / (float) this.anInt1101;
		if (local22 == local37 || local48 == local63) {
			local10[3] = 0.0F;
			local10[0] = 1.0F;
			local10[15] = 1.0F;
			local10[9] = 0.0F;
			local10[5] = 1.0F;
			local10[10] = 1.0F;
			local10[7] = 0.0F;
			local10[1] = 0.0F;
			local10[6] = 0.0F;
			local10[14] = 0.0F;
			local10[2] = 0.0F;
			local10[8] = 0.0F;
			local10[13] = 0.0F;
			local10[11] = 0.0F;
			local10[12] = 0.0F;
			local10[4] = 0.0F;
		} else {
			@Pc(77) float local77 = (float) this.anInt1099 * 2.0F;
			local10[13] = 0.0F;
			local10[6] = 0.0F;
			local10[14] = this.aFloat20 = -(local77 * (float) this.anInt1094) / (float) (this.anInt1094 - this.anInt1099);
			local10[8] = (local37 + local22) / (-local22 + local37);
			local10[11] = -1.0F;
			local10[3] = 0.0F;
			local10[1] = 0.0F;
			local10[7] = 0.0F;
			local10[4] = 0.0F;
			local10[2] = 0.0F;
			local10[0] = local77 / (local37 - local22);
			local10[9] = (local63 + local48) / (local48 - local63);
			local10[12] = 0.0F;
			local10[10] = this.aFloat16 = (float) -(this.anInt1094 + this.anInt1099) / (float) (this.anInt1094 - this.anInt1099);
			local10[5] = local77 / (local48 - local63);
			local10[15] = 0.0F;
		}
		this.method1088();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!jm;)V")
	public void method1082(@OriginalArg(1) Interface13 arg0) {
		if (this.anInt1079 < 0 || this.anInterface13Array1[this.anInt1079] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface13Array1[this.anInt1079--] = null;
		arg0.method5339();
		if (this.anInt1079 < 0) {
			this.anInterface13_2 = null;
		} else {
			this.anInterface13_2 = this.anInterface13Array1[this.anInt1079];
			this.anInterface13_2.method5336();
		}
	}

	@OriginalMember(owner = "client!bi", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean107 = false;
	}

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "(II)I")
	public int method1083(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method8097(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class2_Sub41 local19;
		while (!this.aClass114_4.method2767()) {
			local19 = (Class2_Sub41) this.aClass114_4.method2765();
			Static585.anIntArray687[local11++] = (int) local19.aLong278;
			this.anInt1080 -= local19.anInt9197;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static585.anIntArray687, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static585.anIntArray687, 0);
			local11 = 0;
		}
		while (!this.aClass114_5.method2767()) {
			local19 = (Class2_Sub41) this.aClass114_5.method2765();
			Static585.anIntArray687[local11++] = (int) local19.aLong278;
			this.anInt1082 -= local19.anInt9197;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static585.anIntArray687, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static585.anIntArray687, 0);
			local11 = 0;
		}
		while (!this.aClass114_6.method2767()) {
			local19 = (Class2_Sub41) this.aClass114_6.method2765();
			Static585.anIntArray687[local11++] = local19.anInt9197;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static585.anIntArray687, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static585.anIntArray687, 0);
			local11 = 0;
		}
		while (!this.aClass114_7.method2767()) {
			local19 = (Class2_Sub41) this.aClass114_7.method2765();
			Static585.anIntArray687[local11++] = (int) local19.aLong278;
			this.anInt1081 -= local19.anInt9197;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static585.anIntArray687, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static585.anIntArray687, 0);
		}
		while (!this.aClass114_3.method2767()) {
			local19 = (Class2_Sub41) this.aClass114_3.method2765();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt9197);
		}
		@Pc(222) Class2 local222;
		while (!this.aClass114_8.method2767()) {
			local222 = this.aClass114_8.method2765();
			OpenGL.glDeleteProgramARB((int) local222.aLong278);
		}
		while (!this.aClass114_9.method2767()) {
			local222 = this.aClass114_9.method2765();
			OpenGL.glDeleteObjectARB(local222.aLong278);
		}
		while (!this.aClass114_3.method2767()) {
			local19 = (Class2_Sub41) this.aClass114_3.method2765();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt9197);
		}
		this.aClass11_1.method153();
		if (this.E() > 100663296 && this.aLong32 + 60000L < Static48.method1203()) {
			System.gc();
			this.aLong32 = Static48.method1203();
		}
		this.anInt1076 = local9;
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(III)V")
	public void method1084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1103 = arg1;
		this.anInt1114 = arg0;
		this.method1040();
		this.method1048();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		this.method1087();
		this.method1090(1);
		@Pc(33) float local33 = (float) arg2 - (float) arg0;
		@Pc(39) float local39 = (float) arg3 - (float) arg1;
		@Pc(52) float local52 = (float) (1.0D / Math.sqrt((double) (local39 * local39 + local33 * local33)));
		@Pc(58) int local58 = arg7 % (arg5 + arg6);
		@Pc(62) float local62 = local33 * local52;
		@Pc(66) float local66 = local39 * local52;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(86) float local86 = local62 * (float) arg5;
		@Pc(91) float local91 = (float) arg5 * local66;
		@Pc(93) float local93 = 0.0F;
		@Pc(95) float local95 = 0.0F;
		@Pc(97) float local97 = local86;
		@Pc(99) float local99 = local91;
		if (arg5 >= local58) {
			local97 = (float) (arg5 - local58) * local62;
			local99 = local66 * (float) (arg5 - local58);
		} else {
			local93 = local62 * (float) (arg5 + arg6 - local58);
			local95 = local66 * (float) (arg6 + arg5 - local58);
		}
		@Pc(146) float local146 = local93 + (float) arg0 + 0.35F;
		@Pc(153) float local153 = local95 + (float) arg1 + 0.35F;
		@Pc(158) float local158 = (float) arg6 * local62;
		@Pc(163) float local163 = (float) arg6 * local66;
		while (true) {
			if (arg0 < arg2) {
				if (local146 > (float) arg2 + 0.35F) {
					break;
				}
				if (local146 + local97 > (float) arg2) {
					local97 = (float) arg2 - local146;
				}
			} else {
				if ((float) arg2 + 0.35F > local146) {
					break;
				}
				if (local97 + local146 < (float) arg2) {
					local97 = (float) arg2 - local146;
				}
			}
			if (arg1 < arg3) {
				if ((float) arg3 + 0.35F < local153) {
					break;
				}
				if ((float) arg3 < local153 + local99) {
					local99 = (float) arg3 - local153;
				}
			} else {
				if (local153 < (float) arg3 + 0.35F) {
					break;
				}
				if (local99 + local153 < (float) arg3) {
					local99 = (float) arg3 - local153;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local146, local153);
			OpenGL.glVertex2f(local97 + local146, local99 + local153);
			local153 += local99 + local163;
			OpenGL.glEnd();
			local146 += local158 + local97;
			local99 = local91;
			local97 = local86;
		}
	}

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "(I)V")
	public void method1085() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!bi", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass51_Sub3_3.aFloat140 + (float) arg0 * this.aClass51_Sub3_3.aFloat132 + this.aClass51_Sub3_3.aFloat141 * (float) arg1 + this.aClass51_Sub3_3.aFloat134 * (float) arg2;
		if ((float) this.anInt1099 > local28 || local28 > (float) this.anInt1094) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((this.aClass51_Sub3_3.aFloat135 + this.aClass51_Sub3_3.aFloat142 * (float) arg1 + (float) arg0 * this.aClass51_Sub3_3.aFloat136 + (float) arg2 * this.aClass51_Sub3_3.aFloat137) * (float) this.anInt1089 / (float) arg3);
		@Pc(119) int local119 = (int) ((float) this.anInt1101 * (this.aClass51_Sub3_3.aFloat133 * (float) arg2 + this.aClass51_Sub3_3.aFloat143 * (float) arg0 + (float) arg1 * this.aClass51_Sub3_3.aFloat139 + this.aClass51_Sub3_3.aFloat138) / (float) arg3);
		if (this.aFloat26 <= (float) local86 && this.aFloat24 >= (float) local86 && this.aFloat11 <= (float) local119 && this.aFloat27 >= (float) local119) {
			arg4[2] = (int) local28;
			arg4[0] = (int) ((float) local86 - this.aFloat26);
			arg4[1] = (int) ((float) local119 - this.aFloat11);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 == arg2 && arg3 == arg1) {
			return;
		}
		@Pc(15) Class1_Sub2 local15 = (Class1_Sub2) arg5;
		@Pc(18) Class10_Sub2_Sub1 local18 = local15.aClass10_Sub2_Sub1_3;
		this.method1050();
		this.method1096(local15.aClass10_Sub2_Sub1_3);
		this.method1090(1);
		this.method1045(7681, 8448);
		this.method1021(34167, 768, 0);
		@Pc(48) float local48 = local18.aFloat6 / (float) local18.anInt648;
		@Pc(55) float local55 = local18.aFloat5 / (float) local18.anInt649;
		@Pc(62) float local62 = (float) -arg0 + (float) arg2;
		@Pc(68) float local68 = (float) arg3 - (float) arg1;
		@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local68 * local68 + local62 * local62)));
		@Pc(87) int local87 = arg10 % (arg8 + arg9);
		@Pc(91) float local91 = local68 * local81;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(110) float local110 = local62 * local81;
		@Pc(115) float local115 = (float) arg8 * local110;
		@Pc(120) float local120 = (float) arg8 * local91;
		@Pc(122) float local122 = 0.0F;
		@Pc(124) float local124 = 0.0F;
		@Pc(126) float local126 = local115;
		@Pc(128) float local128 = local120;
		if (local87 > arg8) {
			local122 = (float) (arg9 + arg8 - local87) * local110;
			local124 = local91 * (float) (arg8 + arg9 - local87);
		} else {
			local126 = (float) (arg8 - local87) * local110;
			local128 = (float) (arg8 - local87) * local91;
		}
		@Pc(173) float local173 = local122 + (float) arg0 + 0.35F;
		@Pc(180) float local180 = (float) arg1 + local124 + 0.35F;
		@Pc(185) float local185 = local110 * (float) arg9;
		@Pc(190) float local190 = (float) arg9 * local91;
		while (true) {
			if (arg0 < arg2) {
				if (local173 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local173 + local126) {
					local126 = (float) arg2 - local173;
				}
			} else {
				if ((float) arg2 + 0.35F > local173) {
					break;
				}
				if ((float) arg2 > local126 + local173) {
					local126 = (float) arg2 - local173;
				}
			}
			if (arg1 >= arg3) {
				if (local180 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local128 + local180) {
					local128 = (float) arg3 - local180;
				}
			} else {
				if (local180 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local128 + local180) {
					local128 = (float) arg3 - local180;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local48 * ((float) -arg6 + local173), (local180 - (float) arg7) * local55);
			OpenGL.glVertex2f(local173, local180);
			OpenGL.glTexCoord2f(((float) -arg6 + local126 + local173) * local48, local55 * (local128 + local180 - (float) arg7));
			OpenGL.glVertex2f(local126 + local173, local180 + local128);
			OpenGL.glEnd();
			local173 += local126 + local185;
			local180 += local128 + local190;
			local126 = local115;
			local128 = local120;
		}
		this.method1021(5890, 768, 0);
	}

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "(B)V")
	private void method1086() {
		Static292.aFloatArray41[0] = this.aFloat13 * this.aFloat22;
		Static292.aFloatArray41[1] = this.aFloat13 * this.aFloat23;
		Static292.aFloatArray41[2] = this.aFloat10 * this.aFloat13;
		Static292.aFloatArray41[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static292.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(Z)V")
	private void method1087() {
		if (this.anInt1085 == 1) {
			return;
		}
		this.method1029();
		this.method1035(false);
		this.method1022(false);
		this.method1047(false);
		this.method1062(false);
		this.method1096((Class10) null);
		this.method1023(-2);
		this.method1046(1);
		this.anInt1085 = 1;
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(Z)V")
	private void method1088() {
		this.aFloatArray11[10] = this.aFloat16;
		this.aFloatArray11[14] = this.aFloat20;
		this.aFloat18 = (float) this.anInt1094;
		this.aFloat29 = ((float) -this.anInt1094 + this.aFloatArray11[14]) / this.aFloatArray11[10];
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	@Override
	public void method8086(@OriginalArg(0) int arg0) {
		this.method1037();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBI)V")
	public void method1089(@OriginalArg(0) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lclient!lda;")
	@Override
	public Interface15 method8120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "()Z")
	@Override
	public boolean method8121() {
		return this.aClass67_1.method1890();
	}

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "(II)V")
	public void method1090(@OriginalArg(1) int arg0) {
		if (this.anInt1083 == arg0) {
			return;
		}
		@Pc(21) boolean local21;
		@Pc(17) byte local17;
		if (arg0 == 1) {
			local21 = true;
			local17 = 1;
		} else if (arg0 == 2) {
			local17 = 2;
			local21 = false;
		} else if (arg0 == 128) {
			local21 = true;
			local17 = 3;
		} else {
			local21 = false;
			local17 = 0;
		}
		if (!this.aBoolean79) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean79 = true;
		}
		if (local21 != this.aBoolean80) {
			if (local21) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean80 = local21;
		}
		if (local17 != this.anInt1084) {
			if (local17 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local17 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local17 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt1084 = local17;
		}
		this.anInt1085 &= 0xFFFFFFE3;
		this.anInt1083 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "(I)V")
	private void method1091() {
		this.aFloat30 = (float) (this.anInt1094 - this.anInt1102) - this.aFloat19;
		this.aFloat15 = this.aFloat30 - this.aFloat14 * (float) this.anInt1088;
		if ((float) this.anInt1099 > this.aFloat15) {
			this.aFloat15 = (float) this.anInt1099;
		}
		OpenGL.glFogf(2915, this.aFloat15);
		OpenGL.glFogf(2916, this.aFloat30);
		Static292.aFloatArray41[1] = (float) (this.anInt1104 & 0xFF00) / 65280.0F;
		Static292.aFloatArray41[2] = (float) (this.anInt1104 & 0xFF) / 255.0F;
		Static292.aFloatArray41[0] = (float) (this.anInt1104 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static292.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8156(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas3) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = (float) arg0 * this.aClass51_Sub3_3.aFloat132 + this.aClass51_Sub3_3.aFloat141 * (float) arg1 + this.aClass51_Sub3_3.aFloat134 * (float) arg2 + this.aClass51_Sub3_3.aFloat140;
		@Pc(55) float local55 = this.aClass51_Sub3_3.aFloat140 + this.aClass51_Sub3_3.aFloat132 * (float) arg3 + (float) arg4 * this.aClass51_Sub3_3.aFloat141 + this.aClass51_Sub3_3.aFloat134 * (float) arg5;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt1099 > local30 && (float) this.anInt1099 > local55) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt1094 && (float) this.anInt1094 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass51_Sub3_3.aFloat135 + this.aClass51_Sub3_3.aFloat137 * (float) arg2 + this.aClass51_Sub3_3.aFloat142 * (float) arg1 + this.aClass51_Sub3_3.aFloat136 * (float) arg0) * (float) this.anInt1089 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt1089 * ((float) arg5 * this.aClass51_Sub3_3.aFloat137 + (float) arg3 * this.aClass51_Sub3_3.aFloat136 + (float) arg4 * this.aClass51_Sub3_3.aFloat142 + this.aClass51_Sub3_3.aFloat135) / (float) arg6);
		if ((float) local124 < this.aFloat26 && (float) local157 < this.aFloat26) {
			local57 |= 0x1;
		} else if ((float) local124 > this.aFloat24 && this.aFloat24 < (float) local157) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass51_Sub3_3.aFloat138 + (float) arg2 * this.aClass51_Sub3_3.aFloat133 + this.aClass51_Sub3_3.aFloat139 * (float) arg1 + (float) arg0 * this.aClass51_Sub3_3.aFloat143) * (float) this.anInt1101 / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass51_Sub3_3.aFloat138 + this.aClass51_Sub3_3.aFloat139 * (float) arg4 + this.aClass51_Sub3_3.aFloat143 * (float) arg3 + (float) arg5 * this.aClass51_Sub3_3.aFloat133) * (float) this.anInt1101 / (float) arg6);
		if ((float) local224 < this.aFloat11 && (float) local257 < this.aFloat11) {
			local57 |= 0x4;
		} else if (this.aFloat27 < (float) local224 && (float) local257 > this.aFloat27) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZ)Lclient!iea;")
	@Override
	public Class31 method8169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class31_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8085(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8133(arg2, arg3);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method8090(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "(I)V")
	private void method1092() {
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.anInt1108; local5++) {
			@Pc(18) Class2_Sub12 local18 = this.aClass2_Sub12Array2[local5];
			Static380.aFloatArray109[0] = (float) local18.method7415();
			@Pc(31) int local31 = local5 + 16386;
			Static380.aFloatArray109[1] = (float) local18.method7420();
			Static380.aFloatArray109[2] = (float) local18.method7421();
			Static380.aFloatArray109[3] = 1.0F;
			OpenGL.glLightfv(local31, 4611, Static380.aFloatArray109, 0);
			@Pc(60) int local60 = local18.method7417();
			@Pc(66) float local66 = local18.method7422() / 255.0F;
			Static380.aFloatArray109[1] = local66 * (float) (local60 >> 8 & 0xFF);
			Static380.aFloatArray109[2] = (float) (local60 & 0xFF) * local66;
			Static380.aFloatArray109[0] = (float) (local60 >> 16 & 0xFF) * local66;
			OpenGL.glLightfv(local31, 4609, Static380.aFloatArray109, 0);
			OpenGL.glLightf(local31, 4617, 1.0F / (float) (local18.method7418() * local18.method7418()));
			OpenGL.glEnable(local31);
		}
		while (this.anInt1091 > local5) {
			OpenGL.glDisable(local5 + 16386);
			local5++;
		}
		this.anInt1091 = this.anInt1108;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(IZ)V")
	public void method1093(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt1116) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt1116 = arg0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static336.method5099(arg3, arg2, arg1, this, arg0);
	}

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Class10_Sub2_Sub1 local9 = local6.aClass10_Sub2_Sub1_3;
		this.method1050();
		this.method1096(local6.aClass10_Sub2_Sub1_3);
		this.method1090(1);
		this.method1045(7681, 8448);
		this.method1021(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat6 / (float) local9.anInt648;
		@Pc(46) float local46 = local9.aFloat5 / (float) local9.anInt649;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt1107 - arg2) * local39, local46 * (float) (this.anInt1115 - arg3));
		OpenGL.glVertex2i(this.anInt1107, this.anInt1115);
		OpenGL.glTexCoord2f((float) (this.anInt1107 - arg2) * local39, (float) (this.anInt1098 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt1107, this.anInt1098);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt1111 - arg2), (float) (this.anInt1098 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt1111, this.anInt1098);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt1111 - arg2), (float) (this.anInt1115 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt1111, this.anInt1115);
		OpenGL.glEnd();
		this.method1021(5890, 768, 0);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(IB)I")
	public int method1094(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean94 = arg0;
		this.method1066();
	}

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "()Z")
	@Override
	public boolean method8167() {
		return false;
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "()V")
	@Override
	public void method8094() {
		if (this.aBoolean91) {
			if (this.aClass227_1 != this.anInterface13_1) {
				throw new RuntimeException();
			}
			this.aClass227_1.method5342(0);
			this.aClass227_1.method5342(8);
			this.method1097(this.aClass227_1);
		} else if (this.aBoolean100) {
			this.aClass31_Sub3_1.method8802(0, 0, this.anInt990, this.anInt980, 0, 0);
			this.anOpenGL1.setSurface(this.aLong31);
		} else {
			throw new RuntimeException("");
		}
		this.aClass31_Sub3_1 = null;
		this.anInt990 = this.anInt963;
		this.anInt980 = this.anInt1052;
		this.method1031();
		this.method1040();
		this.la();
	}

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "()Lclient!pda;")
	@Override
	public Class51 method8154() {
		return this.aClass51_Sub3_1;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(ILclient!jm;)V")
	public void method1095(@OriginalArg(1) Interface13 arg0) {
		if (this.anInt1077 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt1077 >= 0) {
			this.anInterface13Array2[this.anInt1077].method5337();
		}
		this.anInterface13_1 = this.anInterface13Array2[++this.anInt1077] = arg0;
		this.anInterface13_1.method5338();
	}

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "()Lclient!pda;")
	@Override
	public Class51 method8137() {
		return new Class51_Sub3();
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)V")
	@Override
	public void method8140(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bi", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int[] local8 = new int[arg3 * arg2];
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, this.anInt980 - arg1 - local10, arg2, 1, 32993, this.anInt1093, local8, local10 * arg2);
		}
		return local8;
	}

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "()Z")
	@Override
	public boolean method8142() {
		return true;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!cj;)V")
	public void method1096(@OriginalArg(1) Class10 arg0) {
		@Pc(9) Class10 local9 = this.aClass10Array1[this.anInt1116];
		if (local9 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local9.anInt8418);
			} else {
				if (local9 == null) {
					OpenGL.glEnable(arg0.anInt8418);
				} else if (arg0.anInt8418 != local9.anInt8418) {
					OpenGL.glDisable(local9.anInt8418);
					OpenGL.glEnable(arg0.anInt8418);
				}
				OpenGL.glBindTexture(arg0.anInt8418, arg0.method7261());
			}
			this.aClass10Array1[this.anInt1116] = arg0;
		}
		this.anInt1085 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!bi", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean107 = true;
		this.anInt1096 = arg2;
		this.anInt1086 = arg3;
		this.anInt1117 = arg0;
		this.anInt1118 = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[Lclient!laa;)V")
	@Override
	public void method8102(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub12Array2[local7] = arg1[local7];
		}
		this.anInt1108 = arg0;
		if (this.anInt1097 != 1) {
			this.method1092();
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(ILclient!jm;)V")
	public void method1097(@OriginalArg(1) Interface13 arg0) {
		if (this.aBoolean104) {
			this.method1082(arg0);
			this.method1074(arg0);
		} else if (this.anInt1078 >= 0 && arg0 == this.anInterface13Array3[this.anInt1078]) {
			this.anInterface13Array3[this.anInt1078--] = null;
			arg0.method5334();
			if (this.anInt1078 >= 0) {
				this.anInterface13_2 = this.anInterface13_1 = this.anInterface13Array3[this.anInt1078];
				this.anInterface13_2.method5335();
			} else {
				this.anInterface13_2 = this.anInterface13_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bi", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt990) {
			arg2 = this.anInt990;
		}
		if (arg3 > this.anInt980) {
			arg3 = this.anInt980;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt1098 = arg3;
		this.anInt1107 = arg0;
		this.anInt1115 = arg1;
		this.anInt1111 = arg2;
		OpenGL.glEnable(3089);
		this.method1049();
		this.method1048();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!ju;)V")
	public void method1098(@OriginalArg(1) Interface14 arg0) {
		if (this.anInterface14_1 != arg0) {
			if (this.aBoolean90) {
				OpenGL.glBindBufferARB(34962, arg0.method4795());
			}
			this.anInterface14_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "(I)V")
	public void method1099() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray10, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIILclient!g;B)V")
	public void method1100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface7 arg2) {
		@Pc(7) int local7 = arg2.method4612();
		@Pc(14) int local14 = arg0 * this.method1094(local7);
		this.method1080(arg2);
		OpenGL.glDrawElements(4, arg1, local7, (long) local14 + arg2.method4613());
	}

	@OriginalMember(owner = "client!bi", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method1062(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!pda;)V")
	@Override
	public void method8138(@OriginalArg(0) Class51 arg0) {
		this.aClass51_Sub3_3.method6704(arg0);
		this.aClass51_Sub3_4.method6704(this.aClass51_Sub3_3);
		this.aClass51_Sub3_4.method6728();
		this.aClass51_Sub3_5.method6723(this.aClass51_Sub3_4);
		if (this.anInt1097 != 1) {
			this.method1076();
		}
	}
}
