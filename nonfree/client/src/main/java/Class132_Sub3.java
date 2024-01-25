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

@OriginalClass("client!pq")
public final class Class132_Sub3 extends Class132 {

	@OriginalMember(owner = "client!pq", name = "bb", descriptor = "I")
	public int anInt7710;

	@OriginalMember(owner = "client!pq", name = "Eb", descriptor = "I")
	private int anInt7737;

	@OriginalMember(owner = "client!pq", name = "Gb", descriptor = "I")
	public int anInt7739;

	@OriginalMember(owner = "client!pq", name = "ue", descriptor = "I")
	private int anInt7876;

	@OriginalMember(owner = "client!pq", name = "Ie", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!pq", name = "Ke", descriptor = "I")
	public int anInt7881;

	@OriginalMember(owner = "client!pq", name = "Ne", descriptor = "Lclient!rp;")
	private Class9_Sub2 aClass9_Sub2_1;

	@OriginalMember(owner = "client!pq", name = "Pe", descriptor = "Lclient!qaa;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!pq", name = "Qe", descriptor = "Lclient!hha;")
	private Class143 aClass143_6;

	@OriginalMember(owner = "client!pq", name = "Ue", descriptor = "Lclient!qaa;")
	private Interface22 anInterface22_2;

	@OriginalMember(owner = "client!pq", name = "We", descriptor = "I")
	public int anInt7885;

	@OriginalMember(owner = "client!pq", name = "Xe", descriptor = "I")
	public int anInt7886;

	@OriginalMember(owner = "client!pq", name = "Ze", descriptor = "I")
	private int anInt7887;

	@OriginalMember(owner = "client!pq", name = "hf", descriptor = "J")
	private long aLong235;

	@OriginalMember(owner = "client!pq", name = "jf", descriptor = "Z")
	private boolean aBoolean516;

	@OriginalMember(owner = "client!pq", name = "kf", descriptor = "I")
	private int anInt7888;

	@OriginalMember(owner = "client!pq", name = "lf", descriptor = "Z")
	private boolean aBoolean517;

	@OriginalMember(owner = "client!pq", name = "mf", descriptor = "I")
	private int anInt7889;

	@OriginalMember(owner = "client!pq", name = "nf", descriptor = "I")
	private int anInt7890;

	@OriginalMember(owner = "client!pq", name = "of", descriptor = "Z")
	private boolean aBoolean518;

	@OriginalMember(owner = "client!pq", name = "pf", descriptor = "Z")
	private boolean aBoolean519;

	@OriginalMember(owner = "client!pq", name = "sf", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!pq", name = "tf", descriptor = "Lclient!vn;")
	private Interface26 anInterface26_4;

	@OriginalMember(owner = "client!pq", name = "xf", descriptor = "Lclient!ls;")
	public Class214 aClass214_9;

	@OriginalMember(owner = "client!pq", name = "yf", descriptor = "Lclient!ls;")
	public Class214 aClass214_10;

	@OriginalMember(owner = "client!pq", name = "zf", descriptor = "Lclient!pr;")
	public Class184_Sub2 aClass184_Sub2_1;

	@OriginalMember(owner = "client!pq", name = "Df", descriptor = "I")
	private int anInt7894;

	@OriginalMember(owner = "client!pq", name = "Hf", descriptor = "Lclient!pr;")
	public Class184_Sub2 aClass184_Sub2_2;

	@OriginalMember(owner = "client!pq", name = "If", descriptor = "Z")
	public boolean aBoolean522;

	@OriginalMember(owner = "client!pq", name = "Jf", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!pq", name = "Kf", descriptor = "Lclient!vn;")
	private Interface26 anInterface26_5;

	@OriginalMember(owner = "client!pq", name = "Lf", descriptor = "I")
	public int anInt7895;

	@OriginalMember(owner = "client!pq", name = "Mf", descriptor = "I")
	private int anInt7896;

	@OriginalMember(owner = "client!pq", name = "Of", descriptor = "I")
	public int anInt7897;

	@OriginalMember(owner = "client!pq", name = "Qf", descriptor = "I")
	public int anInt7898;

	@OriginalMember(owner = "client!pq", name = "Rf", descriptor = "I")
	private int anInt7899;

	@OriginalMember(owner = "client!pq", name = "Sf", descriptor = "I")
	private int anInt7900;

	@OriginalMember(owner = "client!pq", name = "Tf", descriptor = "Lclient!pr;")
	public Class184_Sub2 aClass184_Sub2_3;

	@OriginalMember(owner = "client!pq", name = "Uf", descriptor = "Ljava/lang/String;")
	private String aString102;

	@OriginalMember(owner = "client!pq", name = "Wf", descriptor = "Z")
	private boolean aBoolean525;

	@OriginalMember(owner = "client!pq", name = "Xf", descriptor = "I")
	private int anInt7902;

	@OriginalMember(owner = "client!pq", name = "Yf", descriptor = "I")
	private int anInt7903;

	@OriginalMember(owner = "client!pq", name = "Zf", descriptor = "F")
	private float aFloat134;

	@OriginalMember(owner = "client!pq", name = "dg", descriptor = "Lclient!pr;")
	public Class184_Sub2 aClass184_Sub2_4;

	@OriginalMember(owner = "client!pq", name = "hg", descriptor = "Lclient!iq;")
	private Class53_Sub2_Sub1 aClass53_Sub2_Sub1_3;

	@OriginalMember(owner = "client!pq", name = "jg", descriptor = "Lclient!pr;")
	public Class184_Sub2 aClass184_Sub2_5;

	@OriginalMember(owner = "client!pq", name = "kg", descriptor = "Z")
	private boolean aBoolean528;

	@OriginalMember(owner = "client!pq", name = "tg", descriptor = "Lclient!pr;")
	public Class184_Sub2 aClass184_Sub2_6;

	@OriginalMember(owner = "client!pq", name = "vg", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!pq", name = "wg", descriptor = "Lclient!hha;")
	public Class143 aClass143_7;

	@OriginalMember(owner = "client!pq", name = "xg", descriptor = "F")
	private float aFloat139;

	@OriginalMember(owner = "client!pq", name = "Ag", descriptor = "[Lclient!wha;")
	private Class53[] aClass53Array1;

	@OriginalMember(owner = "client!pq", name = "Dg", descriptor = "Z")
	private boolean aBoolean532;

	@OriginalMember(owner = "client!pq", name = "Eg", descriptor = "Z")
	private boolean aBoolean533;

	@OriginalMember(owner = "client!pq", name = "Fg", descriptor = "Z")
	public boolean aBoolean534;

	@OriginalMember(owner = "client!pq", name = "Gg", descriptor = "F")
	public float aFloat140;

	@OriginalMember(owner = "client!pq", name = "Hg", descriptor = "Lclient!pr;")
	public Class184_Sub2 aClass184_Sub2_7;

	@OriginalMember(owner = "client!pq", name = "Jg", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!pq", name = "Mg", descriptor = "Z")
	private boolean aBoolean535;

	@OriginalMember(owner = "client!pq", name = "Rg", descriptor = "Lclient!pr;")
	public Class184_Sub2 aClass184_Sub2_8;

	@OriginalMember(owner = "client!pq", name = "Sg", descriptor = "I")
	private int anInt7917;

	@OriginalMember(owner = "client!pq", name = "Tg", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!pq", name = "Ug", descriptor = "Z")
	public boolean aBoolean536;

	@OriginalMember(owner = "client!pq", name = "Xg", descriptor = "Lclient!wfa;")
	private Class25_Sub2 aClass25_Sub2_1;

	@OriginalMember(owner = "client!pq", name = "Zg", descriptor = "Z")
	private boolean aBoolean537;

	@OriginalMember(owner = "client!pq", name = "ah", descriptor = "Lclient!rq;")
	public Class53_Sub2 aClass53_Sub2_6;

	@OriginalMember(owner = "client!pq", name = "ch", descriptor = "Z")
	public boolean aBoolean538;

	@OriginalMember(owner = "client!pq", name = "eh", descriptor = "Z")
	public boolean aBoolean540;

	@OriginalMember(owner = "client!pq", name = "gh", descriptor = "Z")
	private boolean aBoolean541;

	@OriginalMember(owner = "client!pq", name = "ih", descriptor = "Z")
	public boolean aBoolean542;

	@OriginalMember(owner = "client!pq", name = "jh", descriptor = "Lclient!pr;")
	public Class184_Sub2 aClass184_Sub2_9;

	@OriginalMember(owner = "client!pq", name = "kh", descriptor = "Lclient!jda;")
	private Interface14 anInterface14_3;

	@OriginalMember(owner = "client!pq", name = "nh", descriptor = "I")
	public int anInt7922;

	@OriginalMember(owner = "client!pq", name = "oh", descriptor = "Z")
	public boolean aBoolean543;

	@OriginalMember(owner = "client!pq", name = "ph", descriptor = "Z")
	public boolean aBoolean544;

	@OriginalMember(owner = "client!pq", name = "qh", descriptor = "Ljava/lang/String;")
	private String aString103;

	@OriginalMember(owner = "client!pq", name = "uh", descriptor = "Z")
	public boolean aBoolean545;

	@OriginalMember(owner = "client!pq", name = "vh", descriptor = "F")
	private float aFloat149;

	@OriginalMember(owner = "client!pq", name = "wh", descriptor = "Lclient!pr;")
	public Class184_Sub2 aClass184_Sub2_10;

	@OriginalMember(owner = "client!pq", name = "xh", descriptor = "I")
	private int anInt7924;

	@OriginalMember(owner = "client!pq", name = "yh", descriptor = "Z")
	public boolean aBoolean546;

	@OriginalMember(owner = "client!pq", name = "Bh", descriptor = "I")
	private int anInt7925;

	@OriginalMember(owner = "client!pq", name = "Ch", descriptor = "I")
	private int anInt7926;

	@OriginalMember(owner = "client!pq", name = "M", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!pq", name = "ye", descriptor = "I")
	public int anInt7877 = 128;

	@OriginalMember(owner = "client!pq", name = "Ae", descriptor = "Lclient!ot;")
	private final Class262 aClass262_1 = new Class262();

	@OriginalMember(owner = "client!pq", name = "De", descriptor = "Lclient!lha;")
	private final Class207_Sub1 aClass207_Sub1_1 = new Class207_Sub1();

	@OriginalMember(owner = "client!pq", name = "Ee", descriptor = "Lclient!lha;")
	public final Class207_Sub1 aClass207_Sub1_2 = new Class207_Sub1();

	@OriginalMember(owner = "client!pq", name = "Ge", descriptor = "I")
	public int anInt7879 = 3;

	@OriginalMember(owner = "client!pq", name = "He", descriptor = "I")
	public int anInt7880 = 8;

	@OriginalMember(owner = "client!pq", name = "Le", descriptor = "Z")
	private boolean aBoolean515 = false;

	@OriginalMember(owner = "client!pq", name = "Fe", descriptor = "Lclient!v;")
	private final Class362 aClass362_45 = new Class362();

	@OriginalMember(owner = "client!pq", name = "Oe", descriptor = "[Lclient!qaa;")
	private final Interface22[] anInterface22Array1 = new Interface22[4];

	@OriginalMember(owner = "client!pq", name = "Me", descriptor = "I")
	private int anInt7882 = -1;

	@OriginalMember(owner = "client!pq", name = "Se", descriptor = "[Lclient!qaa;")
	private final Interface22[] anInterface22Array2 = new Interface22[4];

	@OriginalMember(owner = "client!pq", name = "Te", descriptor = "[Lclient!qaa;")
	private final Interface22[] anInterface22Array3 = new Interface22[4];

	@OriginalMember(owner = "client!pq", name = "Re", descriptor = "I")
	private int anInt7883 = -1;

	@OriginalMember(owner = "client!pq", name = "Ve", descriptor = "I")
	private int anInt7884 = -1;

	@OriginalMember(owner = "client!pq", name = "Ye", descriptor = "Lclient!v;")
	private final Class362 aClass362_46;

	@OriginalMember(owner = "client!pq", name = "af", descriptor = "Lclient!v;")
	private final Class362 aClass362_47;

	@OriginalMember(owner = "client!pq", name = "bf", descriptor = "Lclient!v;")
	private final Class362 bf;

	@OriginalMember(owner = "client!pq", name = "cf", descriptor = "Lclient!v;")
	private final Class362 aClass362_48;

	@OriginalMember(owner = "client!pq", name = "df", descriptor = "Lclient!v;")
	private final Class362 aClass362_49;

	@OriginalMember(owner = "client!pq", name = "ef", descriptor = "Lclient!v;")
	private final Class362 aClass362_50;

	@OriginalMember(owner = "client!pq", name = "ff", descriptor = "Lclient!v;")
	private final Class362 aClass362_51;

	@OriginalMember(owner = "client!pq", name = "gf", descriptor = "Lclient!lha;")
	public final Class207_Sub1 aClass207_Sub1_3;

	@OriginalMember(owner = "client!pq", name = "qf", descriptor = "Lclient!lha;")
	public final Class207_Sub1 aClass207_Sub1_4;

	@OriginalMember(owner = "client!pq", name = "rf", descriptor = "Lclient!lha;")
	public final Class207_Sub1 aClass207_Sub1_5;

	@OriginalMember(owner = "client!pq", name = "uf", descriptor = "F")
	private float aFloat130;

	@OriginalMember(owner = "client!pq", name = "Ef", descriptor = "F")
	private float aFloat131;

	@OriginalMember(owner = "client!pq", name = "wf", descriptor = "I")
	public int anInt7891;

	@OriginalMember(owner = "client!pq", name = "cg", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!pq", name = "Vf", descriptor = "I")
	public int anInt7901;

	@OriginalMember(owner = "client!pq", name = "Af", descriptor = "I")
	public int anInt7892;

	@OriginalMember(owner = "client!pq", name = "qg", descriptor = "[Lclient!sca;")
	private final Class6_Sub17[] aClass6_Sub17Array4;

	@OriginalMember(owner = "client!pq", name = "Gf", descriptor = "F")
	private float aFloat132;

	@OriginalMember(owner = "client!pq", name = "vf", descriptor = "[F")
	private final float[] aFloatArray41;

	@OriginalMember(owner = "client!pq", name = "ig", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!pq", name = "Nf", descriptor = "Z")
	private boolean aBoolean523;

	@OriginalMember(owner = "client!pq", name = "Lg", descriptor = "I")
	private int anInt7914;

	@OriginalMember(owner = "client!pq", name = "mg", descriptor = "I")
	public int anInt7906;

	@OriginalMember(owner = "client!pq", name = "Bg", descriptor = "I")
	private int anInt7910;

	@OriginalMember(owner = "client!pq", name = "Og", descriptor = "I")
	private int anInt7916;

	@OriginalMember(owner = "client!pq", name = "Cg", descriptor = "I")
	public int anInt7911;

	@OriginalMember(owner = "client!pq", name = "zg", descriptor = "[F")
	private final float[] aFloatArray43;

	@OriginalMember(owner = "client!pq", name = "Ig", descriptor = "I")
	private int anInt7912;

	@OriginalMember(owner = "client!pq", name = "Pg", descriptor = "[F")
	private final float[] aFloatArray44;

	@OriginalMember(owner = "client!pq", name = "Yg", descriptor = "I")
	public int anInt7920;

	@OriginalMember(owner = "client!pq", name = "mh", descriptor = "[F")
	public final float[] aFloatArray45;

	@OriginalMember(owner = "client!pq", name = "Qg", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!pq", name = "eg", descriptor = "I")
	public int anInt7904;

	@OriginalMember(owner = "client!pq", name = "Wg", descriptor = "I")
	private int anInt7919;

	@OriginalMember(owner = "client!pq", name = "yg", descriptor = "I")
	private int anInt7909;

	@OriginalMember(owner = "client!pq", name = "lh", descriptor = "F")
	public float aFloat146;

	@OriginalMember(owner = "client!pq", name = "Ng", descriptor = "I")
	public int anInt7915;

	@OriginalMember(owner = "client!pq", name = "lg", descriptor = "I")
	private int anInt7905;

	@OriginalMember(owner = "client!pq", name = "Kg", descriptor = "I")
	private int anInt7913;

	@OriginalMember(owner = "client!pq", name = "pg", descriptor = "I")
	public int anInt7908;

	@OriginalMember(owner = "client!pq", name = "fh", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!pq", name = "rh", descriptor = "F")
	public float aFloat147;

	@OriginalMember(owner = "client!pq", name = "th", descriptor = "I")
	public int anInt7923;

	@OriginalMember(owner = "client!pq", name = "hh", descriptor = "F")
	private float aFloat145;

	@OriginalMember(owner = "client!pq", name = "Bf", descriptor = "I")
	public int anInt7893;

	@OriginalMember(owner = "client!pq", name = "ug", descriptor = "[F")
	private final float[] aFloatArray42;

	@OriginalMember(owner = "client!pq", name = "gg", descriptor = "F")
	private float aFloat136;

	@OriginalMember(owner = "client!pq", name = "ag", descriptor = "Z")
	private boolean aBoolean526;

	@OriginalMember(owner = "client!pq", name = "ng", descriptor = "I")
	private int anInt7907;

	@OriginalMember(owner = "client!pq", name = "bh", descriptor = "I")
	private int anInt7921;

	@OriginalMember(owner = "client!pq", name = "sh", descriptor = "F")
	public float aFloat148;

	@OriginalMember(owner = "client!pq", name = "fg", descriptor = "Lclient!un;")
	public Class6_Sub23_Sub2 aClass6_Sub23_Sub2_2;

	@OriginalMember(owner = "client!pq", name = "Ah", descriptor = "[I")
	public int[] anIntArray521;

	@OriginalMember(owner = "client!pq", name = "zh", descriptor = "[I")
	public int[] anIntArray520;

	@OriginalMember(owner = "client!pq", name = "Dh", descriptor = "[I")
	public int[] anIntArray522;

	@OriginalMember(owner = "client!pq", name = "Eh", descriptor = "[B")
	public final byte[] aByteArray85;

	@OriginalMember(owner = "client!pq", name = "Be", descriptor = "I")
	public final int anInt7878;

	@OriginalMember(owner = "client!pq", name = "Cb", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas10;

	@OriginalMember(owner = "client!pq", name = "cd", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!pq", name = "fc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!pq", name = "N", descriptor = "J")
	private final long aLong233;

	@OriginalMember(owner = "client!pq", name = "nc", descriptor = "J")
	private long aLong234;

	@OriginalMember(owner = "client!pq", name = "Vg", descriptor = "I")
	public final int anInt7918;

	@OriginalMember(owner = "client!pq", name = "Cf", descriptor = "Z")
	public boolean aBoolean520;

	@OriginalMember(owner = "client!pq", name = "bg", descriptor = "Z")
	private boolean aBoolean527;

	@OriginalMember(owner = "client!pq", name = "rg", descriptor = "Z")
	public boolean aBoolean530;

	@OriginalMember(owner = "client!pq", name = "dh", descriptor = "Z")
	public boolean aBoolean539;

	@OriginalMember(owner = "client!pq", name = "Pf", descriptor = "Z")
	public boolean aBoolean524;

	@OriginalMember(owner = "client!pq", name = "sg", descriptor = "Z")
	private boolean aBoolean531;

	@OriginalMember(owner = "client!pq", name = "og", descriptor = "Z")
	public boolean aBoolean529;

	@OriginalMember(owner = "client!pq", name = "Ff", descriptor = "Z")
	private final boolean aBoolean521;

	@OriginalMember(owner = "client!pq", name = "ze", descriptor = "Lclient!ie;")
	private final Class155 aClass155_1;

	@OriginalMember(owner = "client!pq", name = "Je", descriptor = "Lclient!ffa;")
	public final Class106 aClass106_1;

	@OriginalMember(owner = "client!pq", name = "Ce", descriptor = "Lclient!mda;")
	private final Class221 aClass221_1;

	@OriginalMember(owner = "client!pq", name = "we", descriptor = "Lclient!cga;")
	private Class6_Sub11_Sub1 aClass6_Sub11_Sub1_1;

	@OriginalMember(owner = "client!pq", name = "xe", descriptor = "Lclient!uga;")
	private final Class352 aClass352_1;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class132_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class384();
		new Class209(16);
		this.aClass362_46 = new Class362();
		this.aClass362_47 = new Class362();
		this.bf = new Class362();
		this.aClass362_48 = new Class362();
		this.aClass362_49 = new Class362();
		this.aClass362_50 = new Class362();
		this.aClass362_51 = new Class362();
		this.aClass207_Sub1_3 = new Class207_Sub1();
		this.aClass207_Sub1_4 = new Class207_Sub1();
		this.aClass207_Sub1_5 = new Class207_Sub1();
		this.aFloat130 = -1.0F;
		this.aFloat131 = 0.0F;
		this.anInt7891 = -1;
		this.aFloat135 = 1.0F;
		this.anInt7901 = 512;
		this.anInt7892 = 0;
		this.aClass6_Sub17Array4 = new Class6_Sub17[Static216.anInt3672];
		this.aFloat132 = -1.0F;
		this.aFloatArray41 = new float[4];
		this.aFloat137 = -1.0F;
		this.aBoolean523 = false;
		this.anInt7914 = 0;
		this.anInt7906 = 0;
		this.anInt7910 = 0;
		this.anInt7916 = -1;
		this.anInt7911 = 0;
		this.aFloatArray43 = new float[16];
		this.anInt7912 = 0;
		this.aFloatArray44 = new float[4];
		this.anInt7920 = 50;
		this.aFloatArray45 = new float[4];
		this.aFloat142 = 3584.0F;
		this.anInt7904 = -1;
		this.anInt7919 = 0;
		this.anInt7909 = 8448;
		this.aFloat146 = -1.0F;
		this.anInt7915 = -1;
		this.anInt7905 = 8448;
		this.anInt7913 = 0;
		this.anInt7908 = 512;
		this.aFloat144 = 1.0F;
		this.aFloat147 = 1.0F;
		this.anInt7923 = -1;
		this.aFloat145 = 1.0F;
		this.anInt7893 = 0;
		this.aFloatArray42 = new float[4];
		this.aFloat136 = 1.0F;
		this.aBoolean526 = true;
		this.anInt7907 = 3584;
		this.anInt7921 = 0;
		this.aFloat148 = 3584.0F;
		this.aClass6_Sub23_Sub2_2 = new Class6_Sub23_Sub2(8192);
		this.anIntArray521 = new int[1];
		this.anIntArray520 = new int[1];
		this.anIntArray522 = new int[1];
		this.aByteArray85 = new byte[16384];
		this.anInt7878 = arg2;
		this.aCanvas11 = this.aCanvas10 = arg0;
		if (!Static272.method4009("jaclib")) {
			throw new RuntimeException("");
		} else if (Static272.method4009("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong234 = this.aLong233 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt7878);
				if (this.aLong233 == 0L) {
					throw new RuntimeException("");
				}
				this.method6789();
				@Pc(335) int local335 = this.method6795();
				if (local335 != 0) {
					throw new RuntimeException("");
				}
				this.anInt7918 = this.aBoolean544 ? 33639 : 5121;
				if (this.aString103.indexOf("radeon") != -1) {
					@Pc(362) int local362 = 0;
					@Pc(364) boolean local364 = false;
					@Pc(366) boolean local366 = false;
					@Pc(375) String[] local375 = Static635.method8720(this.aString103.replace('/', ' '), ' ');
					for (@Pc(377) int local377 = 0; local377 < local375.length; local377++) {
						@Pc(383) String local383 = local375[local377];
						try {
							if (local383.length() > 0) {
								if (local383.charAt(0) == 'x' && local383.length() >= 3 && Static267.method3977(local383.substring(1, 3))) {
									local366 = true;
									local383 = local383.substring(1);
								}
								if (local383.equals("hd")) {
									local364 = true;
								} else {
									if (local383.startsWith("hd")) {
										local364 = true;
										local383 = local383.substring(2);
									}
									if (local383.length() >= 4 && Static267.method3977(local383.substring(0, 4))) {
										local362 = Static368.method5312(local383.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(451) Exception local451) {
						}
					}
					if (!local364 || local362 < 4000) {
						this.aBoolean520 = false;
					}
					if (!local366 && !local364) {
						if (local362 >= 7000 && local362 <= 7999) {
							this.aBoolean527 = false;
						}
						if (local362 >= 7000 && local362 <= 9250) {
							this.aBoolean530 = false;
						}
					}
					this.aBoolean539 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean524 = true;
					this.aBoolean531 = this.aBoolean527;
				}
				if (this.aString102.indexOf("intel") != -1) {
					this.aBoolean529 = false;
				}
				this.aBoolean521 = !this.aString102.equals("s3 graphics");
				if (this.aBoolean527) {
					try {
						@Pc(533) int[] local533 = new int[1];
						OpenGL.glGenBuffersARB(1, local533, 0);
					} catch (@Pc(539) Throwable local539) {
						throw new RuntimeException("");
					}
				}
				Static144.method2110(true, false);
				this.aBoolean515 = true;
				this.aClass155_1 = new Class155(this, super.anInterface6_11);
				this.method6805();
				this.aClass106_1 = new Class106(this);
				this.aClass221_1 = new Class221(this);
				if (this.aClass221_1.method5218()) {
					this.aClass6_Sub11_Sub1_1 = new Class6_Sub11_Sub1(this);
					if (!this.aClass6_Sub11_Sub1_1.method1300()) {
						this.aClass6_Sub11_Sub1_1.method1290();
						this.aClass6_Sub11_Sub1_1 = null;
					}
				}
				this.aClass352_1 = new Class352(this);
				this.method6801();
				this.method6785();
				this.method7477();
			} catch (@Pc(613) Throwable local613) {
				local613.printStackTrace();
				this.method7498();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V")
	private void method6732() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass207_Sub1_4.method4994(), 0);
		if (this.aBoolean523) {
			this.aClass352_1.aClass11_Sub5_1.method4911();
		}
		this.method6813();
		this.method6755();
	}

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "(II)V")
	public void method6733(@OriginalArg(0) int arg0) {
		Static449.aFloatArray40[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static449.aFloatArray40[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static449.aFloatArray40[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static449.aFloatArray40[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static449.aFloatArray40, 0);
	}

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "(I)V")
	private void method6734() {
		@Pc(15) float local15 = this.aFloat145 * (float) -this.anInt7906 / (float) this.anInt7908;
		@Pc(27) float local27 = this.aFloat145 * (float) -this.anInt7893 / (float) this.anInt7901;
		@Pc(42) float local42 = this.aFloat145 * (float) (this.anInt7739 - this.anInt7906) / (float) this.anInt7908;
		@Pc(57) float local57 = this.aFloat145 * (float) (this.anInt7710 - this.anInt7893) / (float) this.anInt7901;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local42 && local27 != local57) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) this.anInt7920, (double) this.anInt7907);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7473(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "()Z")
	@Override
	public boolean method7447() {
		return true;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(FI)V")
	public void method6736(@OriginalArg(0) float arg0) {
		if (this.aFloat145 != arg0) {
			this.aFloat145 = arg0;
			if (this.anInt7900 == 3) {
				this.method6734();
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "(I)V")
	private void method6737() {
		Static449.aFloatArray40[2] = this.aFloat135 * this.aFloat143;
		Static449.aFloatArray40[1] = this.aFloat147 * this.aFloat143;
		Static449.aFloatArray40[0] = this.aFloat143 * this.aFloat144;
		Static449.aFloatArray40[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static449.aFloatArray40, 0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIF)Lclient!sca;")
	@Override
	public Class6_Sub17 method7501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub17_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pq", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt7887 + this.anInt7885 + this.anInt7886;
	}

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "()Z")
	@Override
	public boolean method7466() {
		return this.aClass6_Sub11_Sub1_1 != null && this.aClass6_Sub11_Sub1_1.method1296();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static643.method8779(arg1, arg0, this, arg2, arg3);
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(Z)V")
	private void method6738() {
		this.aFloat134 = (float) (this.anInt7907 - this.anInt7892) - this.aFloat131;
		this.aFloat141 = this.aFloat134 - (float) this.anInt7891 * this.aFloat136;
		if ((float) this.anInt7920 > this.aFloat141) {
			this.aFloat141 = (float) this.anInt7920;
		}
		OpenGL.glFogf(2915, this.aFloat141);
		OpenGL.glFogf(2916, this.aFloat134);
		Static449.aFloatArray40[2] = (float) (this.anInt7904 & 0xFF) / 255.0F;
		Static449.aFloatArray40[1] = (float) (this.anInt7904 & 0xFF00) / 65280.0F;
		Static449.aFloatArray40[0] = (float) (this.anInt7904 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static449.aFloatArray40, 0);
	}

	@OriginalMember(owner = "client!pq", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt7879 = 0;
		while (arg0 > 1) {
			this.anInt7879++;
			arg0 >>= 0x1;
		}
		this.anInt7880 = 0x1 << this.anInt7879;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass221_1.method5219(arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7471(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static294.aFloat198 = arg2;
		Static589.aFloat181 = arg0;
		Static515.aFloat161 = arg1;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "()Z")
	@Override
	public boolean method7433() {
		return true;
	}

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "()Z")
	@Override
	public boolean method7495() {
		return true;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)V")
	private void method6740() {
		if (this.aBoolean537 && this.anInt7891 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "(I)V")
	private void method6741() {
		if (this.aBoolean541) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean541 = false;
		}
	}

	@OriginalMember(owner = "client!pq", name = "A", descriptor = "()I")
	@Override
	public int method7511() {
		return 4;
	}

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "()Z")
	@Override
	public boolean method7474() {
		return this.aBoolean528 && (!this.method7466() || this.aBoolean532);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IZ)V")
	public void method6742(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean533) {
			this.aBoolean533 = arg0;
			this.method6815();
			this.anInt7888 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pq", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IJ)V")
	public synchronized void method6743(@OriginalArg(1) long arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong314 = arg0;
		this.aClass362_51.method8536(local7);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZI)I")
	public int method6744(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!pq", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6758();
		this.method6781(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "()Z")
	@Override
	public boolean method7487() {
		return false;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "()V")
	@Override
	public void method7442() {
		if (this.aClass6_Sub11_Sub1_1 != null && this.aClass6_Sub11_Sub1_1.method1296()) {
			this.aClass221_1.method5214(this.aClass6_Sub11_Sub1_1);
			this.aClass155_1.method3593();
		}
	}

	@OriginalMember(owner = "client!pq", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.aClass207_Sub1_3.aFloat62 + this.aClass207_Sub1_3.aFloat58 * (float) arg0 + this.aClass207_Sub1_3.aFloat65 * (float) arg1 + this.aClass207_Sub1_3.aFloat66;
		if ((float) this.anInt7920 > local28 || local28 > (float) this.anInt7907) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt7908 * (this.aClass207_Sub1_3.aFloat68 * (float) arg2 + this.aClass207_Sub1_3.aFloat67 * (float) arg1 + (float) arg0 * this.aClass207_Sub1_3.aFloat59 + this.aClass207_Sub1_3.aFloat61) / local28);
		@Pc(117) int local117 = (int) (((float) arg1 * this.aClass207_Sub1_3.aFloat69 + this.aClass207_Sub1_3.aFloat60 * (float) arg0 + this.aClass207_Sub1_3.aFloat63 * (float) arg2 + this.aClass207_Sub1_3.aFloat64) * (float) this.anInt7901 / local28);
		if ((float) local85 >= this.aFloat129 && (float) local85 <= this.aFloat140 && this.aFloat133 <= (float) local117 && (float) local117 <= this.aFloat138) {
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat129);
			arg3[1] = (int) ((float) local117 - this.aFloat133);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt7920;
	}

	@OriginalMember(owner = "client!pq", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass207_Sub1_3.aFloat66 + (float) arg2 * this.aClass207_Sub1_3.aFloat62 + this.aClass207_Sub1_3.aFloat58 * (float) arg0 + this.aClass207_Sub1_3.aFloat65 * (float) arg1;
		if ((float) this.anInt7920 > local28 || (float) this.anInt7907 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((float) this.anInt7908 * (this.aClass207_Sub1_3.aFloat68 * (float) arg2 + (float) arg1 * this.aClass207_Sub1_3.aFloat67 + (float) arg0 * this.aClass207_Sub1_3.aFloat59 + this.aClass207_Sub1_3.aFloat61) / (float) arg3);
		@Pc(119) int local119 = (int) ((float) this.anInt7901 * (this.aClass207_Sub1_3.aFloat63 * (float) arg2 + this.aClass207_Sub1_3.aFloat60 * (float) arg0 + (float) arg1 * this.aClass207_Sub1_3.aFloat69 + this.aClass207_Sub1_3.aFloat64) / (float) arg3);
		if (this.aFloat129 <= (float) local86 && this.aFloat140 >= (float) local86 && this.aFloat133 <= (float) local119 && (float) local119 <= this.aFloat138) {
			arg4[2] = (int) local28;
			arg4[0] = (int) ((float) local86 - this.aFloat129);
			arg4[1] = (int) ((float) local119 - this.aFloat133);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!pq", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt7914 = this.anInt7739;
		this.anInt7919 = 0;
		this.anInt7921 = this.anInt7710;
		this.anInt7910 = 0;
		OpenGL.glDisable(3089);
		this.method6768();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BII[BZ)Lclient!jda;")
	public Interface14 method6745(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) boolean arg2) {
		return (Interface14) (this.aBoolean527 && (!arg2 || this.aBoolean531) ? new Class148_Sub2(this, 5123, arg1, arg0, arg2) : new Class165_Sub2(this, 5123, arg1, arg0));
	}

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "(I)V")
	@Override
	public void method7519() {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(FFBFF)V")
	public void method6746(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static449.aFloatArray40[0] = arg0;
		Static449.aFloatArray40[1] = arg2;
		Static449.aFloatArray40[3] = arg3;
		Static449.aFloatArray40[2] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static449.aFloatArray40, 0);
	}

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "(I)V")
	private void method6747() {
		OpenGL.glDepthMask(this.aBoolean519 && this.aBoolean526);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!vn;)V")
	public void method6748(@OriginalArg(1) Interface26 arg0) {
		if (arg0 != this.anInterface26_4) {
			if (this.aBoolean527) {
				OpenGL.glBindBufferARB(34962, arg0.method3631());
			}
			this.anInterface26_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "(I)V")
	public void method6749() {
		if (this.anInt7888 == 16) {
			return;
		}
		this.method6782();
		this.method6774(true);
		this.method6764(true);
		this.method6787(true);
		this.method6781(1);
		this.anInt7888 = 16;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!lha;)V")
	public void method6750(@OriginalArg(1) Class207_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method4994(), 0);
	}

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "()Z")
	@Override
	public boolean method7508() {
		return true;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BILclient!jda;II)V")
	public void method6751(@OriginalArg(1) int arg0, @OriginalArg(2) Interface14 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg1.method8577();
		@Pc(14) int local14 = arg2 * this.method6744(local7);
		this.method6812(arg1);
		OpenGL.glDrawElements(4, arg0, local7, (long) local14 + arg1.method8574());
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(B)V")
	public void method6752() {
		if (this.anInt7888 == 4) {
			return;
		}
		this.method6771();
		this.method6774(false);
		this.method6742(false);
		this.method6764(false);
		this.method6787(false);
		this.method6772(-2);
		this.method6781(1);
		this.anInt7888 = 4;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIII)Lclient!ok;")
	@Override
	public Class25 method7443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean536 ? new Class25_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BII)V")
	public synchronized void method6753(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub36 local8 = new Class6_Sub36(arg0);
		local8.aLong314 = (long) arg1;
		this.aClass362_49.method8536(local8);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!hw;[Lclient!fm;Z)Lclient!da;")
	@Override
	public Class19 method7518(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class112[] arg1) {
		return new Class19_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!qaa;)V")
	public void method6754(@OriginalArg(1) Interface22 arg0) {
		if (this.anInt7883 < 0 || arg0 != this.anInterface22Array3[this.anInt7883]) {
			throw new RuntimeException();
		}
		this.anInterface22Array3[this.anInt7883--] = null;
		arg0.method3123();
		if (this.anInt7883 >= 0) {
			this.anInterface22_2 = this.anInterface22Array3[this.anInt7883];
			this.anInterface22_2.method3126();
		} else {
			this.anInterface22_2 = null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "(I)V")
	private void method6755() {
		@Pc(11) int local11;
		for (local11 = 0; local11 < this.anInt7902; local11++) {
			@Pc(18) Class6_Sub17 local18 = this.aClass6_Sub17Array4[local11];
			Static576.aFloatArray71[0] = (float) local18.method8518();
			@Pc(30) int local30 = local11 + 16386;
			Static576.aFloatArray71[1] = (float) local18.method8522();
			Static576.aFloatArray71[2] = (float) local18.method8521();
			Static576.aFloatArray71[3] = 1.0F;
			OpenGL.glLightfv(local30, 4611, Static576.aFloatArray71, 0);
			@Pc(57) int local57 = local18.method8519();
			@Pc(63) float local63 = local18.method8524() / 255.0F;
			Static576.aFloatArray71[1] = local63 * (float) (local57 >> 8 & 0xFF);
			Static576.aFloatArray71[0] = local63 * (float) (local57 >> 16 & 0xFF);
			Static576.aFloatArray71[2] = (float) (local57 & 0xFF) * local63;
			OpenGL.glLightfv(local30, 4609, Static576.aFloatArray71, 0);
			OpenGL.glLightf(local30, 4617, 1.0F / (float) (local18.method8520() * local18.method8520()));
			OpenGL.glEnable(local30);
		}
		while (this.anInt7924 > local11) {
			OpenGL.glDisable(local11 + 16386);
			local11++;
		}
		this.anInt7924 = this.anInt7902;
	}

	@OriginalMember(owner = "client!pq", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt7906, this.anInt7893, this.anInt7908, this.anInt7901 };
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLclient!qaa;)V")
	public void method6756(@OriginalArg(1) Interface22 arg0) {
		if (this.anInt7884 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7884 >= 0) {
			this.anInterface22Array1[this.anInt7884].method3122();
		}
		this.anInterface22_1 = this.anInterface22Array1[++this.anInt7884] = arg0;
		this.anInterface22_1.method3125();
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(B)V")
	private void method6757() {
		this.anOpenGL2.a();
	}

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "()V")
	@Override
	public void method7493() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "(I)V")
	private void method6758() {
		if (this.anInt7888 == 1) {
			return;
		}
		this.method6771();
		this.method6774(false);
		this.method6742(false);
		this.method6764(false);
		this.method6787(false);
		this.method6759((Class53) null);
		this.method6772(-2);
		this.method6803(1);
		this.anInt7888 = 1;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg5;
		@Pc(9) Class53_Sub2_Sub1 local9 = local6.aClass53_Sub2_Sub1_2;
		this.method6767();
		this.method6759(local6.aClass53_Sub2_Sub1_2);
		this.method6781(1);
		this.method6770(8448, 7681);
		this.method6763(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat31 / (float) local9.anInt4464;
		@Pc(46) float local46 = local9.aFloat32 / (float) local9.anInt4466;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local59 * local59)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(91) float local91 = local52 * local72;
		@Pc(95) float local95 = local59 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local91 + 0.35F, local95 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method6763(0, 768, 5890);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		this.method6758();
		this.method6781(1);
		@Pc(33) float local33 = (float) arg2 - (float) arg0;
		@Pc(39) float local39 = (float) arg3 - (float) arg1;
		@Pc(52) float local52 = (float) (1.0D / Math.sqrt((double) (local33 * local33 + local39 * local39)));
		@Pc(56) float local56 = local39 * local52;
		@Pc(62) int local62 = arg7 % (arg5 + arg6);
		@Pc(66) float local66 = local33 * local52;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(86) float local86 = local66 * (float) arg5;
		@Pc(91) float local91 = local56 * (float) arg5;
		@Pc(93) float local93 = 0.0F;
		@Pc(95) float local95 = 0.0F;
		@Pc(97) float local97 = local86;
		@Pc(99) float local99 = local91;
		if (local62 > arg5) {
			local95 = (float) (arg6 + arg5 - local62) * local56;
			local93 = (float) (arg6 + arg5 - local62) * local66;
		} else {
			local97 = local66 * (float) (arg5 - local62);
			local99 = (float) (arg5 - local62) * local56;
		}
		@Pc(147) float local147 = local93 + (float) arg0 + 0.35F;
		@Pc(154) float local154 = local95 + (float) arg1 + 0.35F;
		@Pc(159) float local159 = local66 * (float) arg6;
		@Pc(164) float local164 = (float) arg6 * local56;
		while (true) {
			if (arg2 <= arg0) {
				if ((float) arg2 + 0.35F > local147) {
					break;
				}
				if (local97 + local147 < (float) arg2) {
					local97 = (float) arg2 - local147;
				}
			} else {
				if ((float) arg2 + 0.35F < local147) {
					break;
				}
				if (local97 + local147 > (float) arg2) {
					local97 = (float) arg2 - local147;
				}
			}
			if (arg3 <= arg1) {
				if (local154 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local154 + local99) {
					local99 = (float) arg3 - local154;
				}
			} else {
				if (local154 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local154 + local99) {
					local99 = (float) arg3 - local154;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local147, local154);
			OpenGL.glVertex2f(local147 + local97, local99 + local154);
			local154 += local164 + local99;
			OpenGL.glEnd();
			local147 += local159 + local97;
			local99 = local91;
			local97 = local86;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLclient!wha;)V")
	public void method6759(@OriginalArg(1) Class53 arg0) {
		@Pc(11) Class53 local11 = this.aClass53Array1[this.anInt7903];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt9817);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt9817);
				} else if (local11.anInt9817 != arg0.anInt9817) {
					OpenGL.glDisable(local11.anInt9817);
					OpenGL.glEnable(arg0.anInt9817);
				}
				OpenGL.glBindTexture(arg0.anInt9817, arg0.method8291());
			}
			this.aClass53Array1[this.anInt7903] = arg0;
		}
		this.anInt7888 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!pq", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6758();
		this.method6781(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(IIII)V")
	public void method6760(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "(II)V")
	public synchronized void method6761(@OriginalArg(1) int arg0) {
		@Pc(13) Class6 local13 = new Class6();
		local13.aLong314 = (long) arg0;
		this.aClass362_50.method8536(local13);
	}

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "(II)V")
	public synchronized void method6762(@OriginalArg(1) int arg0) {
		@Pc(16) Class6_Sub36 local16 = new Class6_Sub36(arg0);
		this.aClass362_48.method8536(local16);
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(IIII)V")
	public void method6763(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "()Z")
	@Override
	public boolean method7500() {
		if (this.aClass6_Sub11_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass6_Sub11_Sub1_1.method1296()) {
			if (!this.aClass221_1.method5217(this.aClass6_Sub11_Sub1_1)) {
				return false;
			}
			this.aClass155_1.method3593();
		}
		return true;
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(I)V")
	@Override
	public void method7484(@OriginalArg(0) int arg0) {
		this.method6757();
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(IZ)V")
	public void method6764(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean516 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt7888 &= 0xFFFFFFE0;
		this.aBoolean516 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6758();
		this.method6781(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(22) float local22 = (float) arg3 - (float) arg1;
		if (local16 == 0.0F && local22 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(43) float local43 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local22 * local22)));
			local16 *= local43;
			local22 *= local43;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local16 + 0.35F, (float) arg3 + local22 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "(B)V")
	public void method6765() {
		if (this.anInt7900 != 0) {
			this.anInt7888 &= 0xFFFFFFE0;
			this.anInt7900 = 0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!cn;Lclient!rca;)Lclient!mia;")
	@Override
	public Interface16 method7463(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Interface23 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "(B)V")
	private void method6766() {
		OpenGL.glViewport(this.anInt7912, this.anInt7913, this.anInt7739, this.anInt7710);
	}

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "(I)V")
	public void method6767() {
		if (this.anInt7888 == 2) {
			return;
		}
		this.method6771();
		this.method6774(false);
		this.method6742(false);
		this.method6764(false);
		this.method6787(false);
		this.method6772(-2);
		this.anInt7888 = 2;
	}

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "(I)V")
	private void method6768() {
		this.aFloat129 = (float) (this.anInt7919 - this.anInt7906);
		this.aFloat138 = (float) (this.anInt7921 - this.anInt7893);
		this.aFloat133 = (float) (this.anInt7910 - this.anInt7893);
		this.aFloat140 = (float) (this.anInt7914 - this.anInt7906);
	}

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "(I)V")
	private void method6769() {
		Static449.aFloatArray40[1] = this.aFloat147 * this.aFloat137;
		Static449.aFloatArray40[0] = this.aFloat144 * this.aFloat137;
		Static449.aFloatArray40[2] = this.aFloat135 * this.aFloat137;
		Static449.aFloatArray40[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static449.aFloatArray40, 0);
		Static449.aFloatArray40[1] = -this.aFloat146 * this.aFloat147;
		Static449.aFloatArray40[2] = -this.aFloat146 * this.aFloat135;
		Static449.aFloatArray40[0] = -this.aFloat146 * this.aFloat144;
		Static449.aFloatArray40[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static449.aFloatArray40, 0);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(IIZ)V")
	public void method6770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7903 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(14) boolean local14 = false;
		if (arg1 != this.anInt7909) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local14 = true;
			this.anInt7909 = arg1;
		}
		if (this.anInt7905 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local14 = true;
			this.anInt7905 = arg0;
		}
		if (local14) {
			this.anInt7888 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "(I)V")
	private void method6771() {
		if (this.anInt7900 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt7739 > 0 && this.anInt7710 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt7739, (double) this.anInt7710, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt7900 = 1;
		this.anInt7888 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "(II)V")
	public void method6772(@OriginalArg(0) int arg0) {
		this.method6800(true, arg0);
	}

	@OriginalMember(owner = "client!pq", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass207_Sub1_3.aFloat66 + this.aClass207_Sub1_3.aFloat65 * (float) arg1 + (float) arg0 * this.aClass207_Sub1_3.aFloat58 + (float) arg2 * this.aClass207_Sub1_3.aFloat62;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt7908 * (this.aClass207_Sub1_3.aFloat61 + this.aClass207_Sub1_3.aFloat67 * (float) arg1 + this.aClass207_Sub1_3.aFloat59 * (float) arg0 + (float) arg2 * this.aClass207_Sub1_3.aFloat68) / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat129);
		@Pc(118) int local118 = (int) (((float) arg2 * this.aClass207_Sub1_3.aFloat63 + this.aClass207_Sub1_3.aFloat60 * (float) arg0 + (float) arg1 * this.aClass207_Sub1_3.aFloat69 + this.aClass207_Sub1_3.aFloat64) * (float) this.anInt7901 / local28);
		arg3[1] = (int) ((float) local118 - this.aFloat133);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "(I)V")
	private void method6773() {
		this.aFloatArray43[14] = this.aFloat139;
		this.aFloatArray43[10] = this.aFloat149;
		this.aFloat148 = (float) this.anInt7907;
		this.aFloat142 = (this.aFloatArray43[14] - (float) this.anInt7907) / this.aFloatArray43[10];
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(Z)V")
	@Override
	public void method7502(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(ZI)V")
	public void method6774(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean537 != arg0) {
			this.aBoolean537 = arg0;
			this.method6740();
			this.anInt7888 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "()Z")
	@Override
	public boolean method7445() {
		return false;
	}

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "()Z")
	@Override
	public boolean method7470() {
		return this.aClass6_Sub11_Sub1_1 != null && (this.anInt7878 <= 1 || this.aBoolean532);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLclient!jaclib/memory/Buffer;ZII)Lclient!vn;")
	public Interface26 method6775(@OriginalArg(1) Buffer arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return (Interface26) (this.aBoolean527 ? new Class148_Sub1(this, arg1, arg0, arg2, false) : new Class165_Sub1(this, arg1, arg0));
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(IZ)V")
	public void method6776(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean525 != arg0) {
			this.aBoolean525 = arg0;
			this.method6815();
		}
	}

	@OriginalMember(owner = "client!pq", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean546) {
			throw new RuntimeException("");
		}
		this.anInt7923 = arg1;
		this.anInt7898 = arg0;
		this.anInt7911 = arg3;
		this.anInt7915 = arg2;
		if (this.aBoolean523) {
			this.aClass352_1.aClass11_Sub5_1.method4911();
			this.aClass352_1.aClass11_Sub5_1.method4912();
		}
	}

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "(Z)V")
	public void method6777() {
		if (this.anInt7888 == 8) {
			return;
		}
		this.method6798();
		this.method6774(true);
		this.method6764(true);
		this.method6787(true);
		this.method6781(1);
		this.anInt7888 = 8;
	}

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "(I)V")
	@Override
	public void method7486(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(FFI)V")
	public void method6778(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat131 = arg1;
		this.aFloat136 = arg0;
		this.method6738();
	}

	@OriginalMember(owner = "client!pq", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt7710 - arg1 - local12, arg2, 1, 32993, this.anInt7918, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(IIZ)V")
	public void method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7913 = arg0;
		this.anInt7912 = arg1;
		this.method6766();
		this.method6808();
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(IIII)V")
	public void method6780(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "()Z")
	@Override
	public boolean method7480() {
		return true;
	}

	@OriginalMember(owner = "client!pq", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt7907;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(II)Lclient!rca;")
	@Override
	public Interface23 method7459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pq", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean526 = arg0;
		this.method6747();
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(IB)V")
	public void method6781(@OriginalArg(0) int arg0) {
		if (this.anInt7889 == arg0) {
			return;
		}
		@Pc(24) boolean local24;
		@Pc(26) byte local26;
		if (arg0 == 1) {
			local24 = true;
			local26 = 1;
		} else if (arg0 == 2) {
			local24 = false;
			local26 = 2;
		} else if (arg0 == 128) {
			local26 = 3;
			local24 = true;
		} else {
			local26 = 0;
			local24 = false;
		}
		if (!this.aBoolean518) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean518 = true;
		}
		if (local24 != this.aBoolean517) {
			if (local24) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean517 = local24;
		}
		if (local26 != this.anInt7890) {
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
			this.anInt7890 = local26;
		}
		this.anInt7889 = arg0;
		this.anInt7888 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "(B)V")
	private void method6782() {
		if (this.anInt7900 != 3) {
			this.anInt7900 = 3;
			this.method6734();
			this.method6732();
			this.anInt7888 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7515() {
		this.method6758();
		this.method6781(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "(I)V")
	private void method6783() {
		@Pc(6) float[] local6 = this.aFloatArray43;
		@Pc(18) float local18 = (float) (-this.anInt7906 * this.anInt7920) / (float) this.anInt7908;
		@Pc(33) float local33 = (float) (this.anInt7920 * (this.anInt7739 - this.anInt7906)) / (float) this.anInt7908;
		@Pc(52) float local52 = (float) (this.anInt7893 * this.anInt7920) / (float) this.anInt7901;
		@Pc(66) float local66 = (float) (this.anInt7920 * (this.anInt7893 - this.anInt7710)) / (float) this.anInt7901;
		if (local33 == local18 || local52 == local66) {
			local6[12] = 0.0F;
			local6[1] = 0.0F;
			local6[13] = 0.0F;
			local6[15] = 1.0F;
			local6[3] = 0.0F;
			local6[5] = 1.0F;
			local6[7] = 0.0F;
			local6[2] = 0.0F;
			local6[4] = 0.0F;
			local6[14] = 0.0F;
			local6[10] = 1.0F;
			local6[6] = 0.0F;
			local6[11] = 0.0F;
			local6[0] = 1.0F;
			local6[9] = 0.0F;
			local6[8] = 0.0F;
		} else {
			@Pc(80) float local80 = (float) this.anInt7920 * 2.0F;
			local6[6] = 0.0F;
			local6[0] = local80 / (local33 - local18);
			local6[13] = 0.0F;
			local6[8] = (local33 + local18) / (local33 - local18);
			local6[15] = 0.0F;
			local6[5] = local80 / (local52 - local66);
			local6[10] = this.aFloat149 = (float) -(this.anInt7920 + this.anInt7907) / (float) (this.anInt7907 - this.anInt7920);
			local6[11] = -1.0F;
			local6[2] = 0.0F;
			local6[14] = this.aFloat139 = -((float) this.anInt7907 * local80) / (float) (this.anInt7907 - this.anInt7920);
			local6[7] = 0.0F;
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[9] = (local52 + local66) / (-local66 + local52);
			local6[1] = 0.0F;
			local6[12] = 0.0F;
		}
		this.method6773();
	}

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "(I)Lclient!jka;")
	public Class53_Sub3 method6784() {
		return this.aClass25_Sub2_1 == null ? null : this.aClass25_Sub2_1.method6550();
	}

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "(B)V")
	private void method6785() {
		if (this.aCanvas11 == null) {
			this.anInt7876 = this.anInt7737 = 0;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas11.getSize();
			this.anInt7876 = local14.width;
			this.anInt7737 = local14.height;
		}
		if (this.anInterface22_2 == null) {
			this.anInt7739 = this.anInt7876;
			this.anInt7710 = this.anInt7737;
			this.method6766();
		}
		this.method6765();
		this.la();
	}

	@OriginalMember(owner = "client!pq", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean546 = false;
	}

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "(I)V")
	public void method6786() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZB)V")
	public void method6787(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean519 != arg0) {
			this.aBoolean519 = arg0;
			this.method6747();
			this.anInt7888 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ok;Lclient!ok;FLclient!ok;)Lclient!ok;")
	@Override
	public Class25 method7457(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class25 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean536 && this.aBoolean529) {
			@Pc(15) Class25_Sub2_Sub2 local15 = null;
			@Pc(18) Class25_Sub2 local18 = (Class25_Sub2) arg0;
			@Pc(21) Class25_Sub2 local21 = (Class25_Sub2) arg1;
			@Pc(25) Class53_Sub3 local25 = local18.method6550();
			@Pc(29) Class53_Sub3 local29 = local21.method6550();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt4822 <= local29.anInt4822 ? local29.anInt4822 : local25.anInt4822;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class25_Sub2_Sub2) {
					@Pc(60) Class25_Sub2_Sub2 local60 = (Class25_Sub2_Sub2) arg3;
					if (local60.method6553() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class25_Sub2_Sub2(this, local48);
				}
				if (local15.method6551(local25, local29, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ls;Lclient!ls;Lclient!ls;BLclient!ls;)V")
	public void method6788(@OriginalArg(0) Class214 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) Class214 arg2, @OriginalArg(4) Class214 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6748(arg0.anInterface26_2);
			OpenGL.glVertexPointer(arg0.aByte101, arg0.aShort79, this.anInterface26_4.method3633(), this.anInterface26_4.method3634() + (long) arg0.aByte102);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6748(arg3.anInterface26_2);
			OpenGL.glNormalPointer(arg3.aShort79, this.anInterface26_4.method3633(), this.anInterface26_4.method3634() + (long) arg3.aByte102);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6748(arg2.anInterface26_2);
			OpenGL.glColorPointer(arg2.aByte101, arg2.aShort79, this.anInterface26_4.method3633(), this.anInterface26_4.method3634() + (long) arg2.aByte102);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6748(arg1.anInterface26_2);
			OpenGL.glTexCoordPointer(arg1.aByte101, arg1.aShort79, this.anInterface26_4.method3633(), this.anInterface26_4.method3634() + (long) arg1.aByte102);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "(B)V")
	private void method6789() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL2.b()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static520.method7923(1000L);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)I")
	public int method6790(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!fm;Z)Lclient!ho;")
	@Override
	public Class9 method7488(@OriginalArg(0) Class112 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt2740 * arg0.anInt2743];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray30 == null) {
			for (local21 = 0; local21 < arg0.anInt2740; local21++) {
				for (local25 = 0; local25 < arg0.anInt2743; local25++) {
					@Pc(83) int local83 = arg0.anIntArray152[arg0.aByteArray31[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt2740; local21++) {
				for (local25 = 0; local25 < arg0.anInt2743; local25++) {
					local12[local16++] = arg0.anIntArray152[arg0.aByteArray31[local14] & 0xFF] | arg0.aByteArray30[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(116) Class9 local116 = this.method7444(local12, arg0.anInt2743, arg0.anInt2740, arg0.anInt2743);
		local116.method8931(arg0.anInt2745, arg0.anInt2741, arg0.anInt2742, arg0.anInt2744);
		return local116;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "([IIIIIZ)Lclient!ho;")
	@Override
	public Class9 method7507(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class9_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(ILclient!qaa;)V")
	public void method6791(@OriginalArg(1) Interface22 arg0) {
		if (this.anInt7883 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7883 >= 0) {
			this.anInterface22Array3[this.anInt7883].method3123();
		}
		this.anInterface22_2 = this.anInterface22Array3[++this.anInt7883] = arg0;
		this.anInterface22_2.method3126();
	}

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "(I)V")
	@Override
	public void method7497(@OriginalArg(0) int arg0) {
		this.method6789();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIZZ)V")
	public void method6792(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt7899 != arg0 || this.aBoolean523 != this.aBoolean546) {
			@Pc(22) Class53_Sub2 local22 = null;
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = this.aBoolean546 ? 3 : 0;
			if (arg0 < 0) {
				this.method6741();
			} else {
				local22 = this.aClass155_1.method3591(arg0);
				@Pc(54) Class294 local54 = super.anInterface6_11.method7088(arg0);
				if (local54.aByte115 == 0 && local54.aByte117 == 0) {
					this.method6741();
				} else {
					@Pc(67) int local67 = local54.aBoolean574 ? 64 : 128;
					@Pc(71) int local71 = local67 * 50;
					this.method6794((float) (this.anInt7881 % local71 * local54.aByte117) / (float) local71, 0.0F, (float) (local54.aByte115 * (this.anInt7881 % local71)) / (float) local71);
				}
				local24 = local54.anInt8332;
				if (!this.aBoolean546) {
					local28 = local54.anInt8334;
					local35 = local54.aByte120;
					local26 = local54.aByte114;
				}
			}
			this.aClass352_1.method8273(local26, arg1, local35, arg2, local28);
			if (!this.aClass352_1.method8275(local24, local22)) {
				this.method6759(local22);
				this.method6803(local24);
			}
			this.anInt7899 = arg0;
			this.aBoolean523 = this.aBoolean546;
		}
		this.anInt7888 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
	@Override
	public void method7450(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLclient!lha;)V")
	public void method6793(@OriginalArg(1) Class207_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method4994(), 0);
	}

	@OriginalMember(owner = "client!pq", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt7919 || this.anInt7914 < arg0 - arg2 || arg2 + arg1 < this.anInt7910 || this.anInt7921 < arg1 - arg2) {
			return;
		}
		this.method6758();
		this.method6781(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(81) float local81 = (float) arg0 + 0.35F;
		@Pc(86) float local86 = (float) arg1 + 0.35F;
		@Pc(90) int local90 = arg2 << 1;
		if (this.aFloat132 > (float) local90) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local81 + 1.0F, local86 + 1.0F);
			OpenGL.glVertex2f(local81 + 1.0F, -1.0F + local86);
			OpenGL.glVertex2f(local81 - 1.0F, local86 - 1.0F);
			OpenGL.glVertex2f(local81 - 1.0F, local86 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat130 >= (float) local90) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local90);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local81, local86);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local81, local86);
			@Pc(145) int local145 = 262144 / (arg2 * 6);
			if (local145 <= 64) {
				local145 = 64;
			} else if (local145 > 512) {
				local145 = 512;
			}
			local145 = Static199.method2911(local145);
			OpenGL.glVertex2f((float) arg2 + local81, local86);
			for (@Pc(175) int local175 = 16384 - local145; local175 > 0; local175 -= local145) {
				OpenGL.glVertex2f(Class28.aFloatArray1[local175] * (float) arg2 + local81, local86 + Class28.aFloatArray2[local175] * (float) arg2);
			}
			OpenGL.glVertex2f((float) arg2 + local81, local86);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(FIFF)V")
	private void method6794(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean541) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean541 = true;
	}

	@OriginalMember(owner = "client!pq", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7904 == arg0 && this.anInt7891 == arg1 && this.anInt7892 == arg2) {
			return;
		}
		this.anInt7891 = arg1;
		this.anInt7904 = arg0;
		this.anInt7892 = arg2;
		this.method6738();
		this.method6740();
	}

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "(Z)I")
	private int method6795() {
		@Pc(5) int local5 = 0;
		this.aString102 = OpenGL.glGetString(7936).toLowerCase();
		this.aString103 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString102.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString102.indexOf("brian paul") != -1 || this.aString102.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static635.method8720(local45.replace('.', ' '), ' ');
		if (local53.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(71) int local71 = Static368.method5312(local53[0]);
				@Pc(77) int local77 = Static368.method5312(local53[1]);
				this.anInt7917 = local71 * 10 + local77;
			} catch (@Pc(86) NumberFormatException local86) {
				local5 |= 0x4;
			}
		}
		if (this.anInt7917 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(120) int[] local120 = new int[1];
		OpenGL.glGetIntegerv(34018, local120, 0);
		this.anInt7895 = local120[0];
		OpenGL.glGetIntegerv(34929, local120, 0);
		this.anInt7896 = local120[0];
		OpenGL.glGetIntegerv(34930, local120, 0);
		this.anInt7894 = local120[0];
		if (this.anInt7895 < 2 || this.anInt7896 < 2 || this.anInt7894 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean544 = Stream.b();
		this.aBoolean535 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean527 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean528 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean540 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean522 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean543 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean530 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean539 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean536 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean520 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean538 = false;
		this.aBoolean529 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean545 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean542 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean532 = this.aBoolean545 & this.aBoolean542;
		this.aBoolean534 = Class344.aString133.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static449.aFloatArray40, 0);
		this.aFloat130 = Static449.aFloatArray40[1];
		this.aFloat132 = Static449.aFloatArray40[0];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBI)V")
	public synchronized void method6796(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class6_Sub36 local14 = new Class6_Sub36(arg1);
		local14.aLong314 = (long) arg0;
		this.bf.method8536(local14);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(BI)I")
	public int method6797(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method7458(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class6_Sub36 local19;
		while (!this.aClass362_47.method8541()) {
			local19 = (Class6_Sub36) this.aClass362_47.method8531();
			Static630.anIntArray366[local7++] = (int) local19.aLong314;
			this.anInt7886 -= local19.anInt5996;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static630.anIntArray366, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static630.anIntArray366, 0);
			local7 = 0;
		}
		while (!this.bf.method8541()) {
			local19 = (Class6_Sub36) this.bf.method8531();
			Static630.anIntArray366[local7++] = (int) local19.aLong314;
			this.anInt7885 -= local19.anInt5996;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static630.anIntArray366, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static630.anIntArray366, 0);
			local7 = 0;
		}
		while (!this.aClass362_48.method8541()) {
			local19 = (Class6_Sub36) this.aClass362_48.method8531();
			Static630.anIntArray366[local7++] = local19.anInt5996;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static630.anIntArray366, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static630.anIntArray366, 0);
			local7 = 0;
		}
		while (!this.aClass362_49.method8541()) {
			local19 = (Class6_Sub36) this.aClass362_49.method8531();
			Static630.anIntArray366[local7++] = (int) local19.aLong314;
			this.anInt7887 -= local19.anInt5996;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static630.anIntArray366, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static630.anIntArray366, 0);
		}
		while (!this.aClass362_46.method8541()) {
			local19 = (Class6_Sub36) this.aClass362_46.method8531();
			OpenGL.glDeleteLists((int) local19.aLong314, local19.anInt5996);
		}
		@Pc(222) Class6 local222;
		while (!this.aClass362_50.method8541()) {
			local222 = this.aClass362_50.method8531();
			OpenGL.glDeleteProgramARB((int) local222.aLong314);
		}
		while (!this.aClass362_51.method8541()) {
			local222 = this.aClass362_51.method8531();
			OpenGL.glDeleteObjectARB(local222.aLong314);
		}
		while (!this.aClass362_46.method8541()) {
			local19 = (Class6_Sub36) this.aClass362_46.method8531();
			OpenGL.glDeleteLists((int) local19.aLong314, local19.anInt5996);
		}
		this.aClass155_1.method3594();
		if (this.E() > 100663296 && this.aLong235 + 60000L < Static566.method7936()) {
			System.gc();
			this.aLong235 = Static566.method7936();
		}
		this.anInt7881 = local11;
	}

	@OriginalMember(owner = "client!pq", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt7710) {
			arg3 = this.anInt7710;
		}
		if (arg2 > this.anInt7739) {
			arg2 = this.anInt7739;
		}
		this.anInt7919 = arg0;
		this.anInt7910 = arg1;
		this.anInt7914 = arg2;
		this.anInt7921 = arg3;
		OpenGL.glEnable(3089);
		this.method6768();
		this.method6808();
	}

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "(B)V")
	private void method6798() {
		if (this.anInt7900 != 2) {
			this.anInt7900 = 2;
			this.method6811();
			this.method6732();
			this.anInt7888 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class12 method7437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class12_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method6758();
		this.method6781(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean528) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean528) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "([I)V")
	@Override
	public void method7451(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7739;
		arg0[1] = this.anInt7710;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7460(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable6.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7483(@OriginalArg(0) Class6_Sub20 arg0) {
		this.aNativeHeap4 = ((Class6_Sub20_Sub2) arg0).aNativeHeap6;
		if (this.anInterface26_5 != null) {
			return;
		}
		@Pc(16) Class6_Sub23_Sub2 local16 = new Class6_Sub23_Sub2(80);
		if (this.aBoolean544) {
			local16.method8407(-1.0F);
			local16.method8407(-1.0F);
			local16.method8407(0.0F);
			local16.method8407(0.0F);
			local16.method8407(1.0F);
			local16.method8407(1.0F);
			local16.method8407(-1.0F);
			local16.method8407(0.0F);
			local16.method8407(1.0F);
			local16.method8407(1.0F);
			local16.method8407(1.0F);
			local16.method8407(1.0F);
			local16.method8407(0.0F);
			local16.method8407(1.0F);
			local16.method8407(0.0F);
			local16.method8407(-1.0F);
			local16.method8407(1.0F);
			local16.method8407(0.0F);
			local16.method8407(0.0F);
			local16.method8407(0.0F);
		} else {
			local16.method8406(-1.0F);
			local16.method8406(-1.0F);
			local16.method8406(0.0F);
			local16.method8406(0.0F);
			local16.method8406(1.0F);
			local16.method8406(1.0F);
			local16.method8406(-1.0F);
			local16.method8406(0.0F);
			local16.method8406(1.0F);
			local16.method8406(1.0F);
			local16.method8406(1.0F);
			local16.method8406(1.0F);
			local16.method8406(0.0F);
			local16.method8406(1.0F);
			local16.method8406(0.0F);
			local16.method8406(-1.0F);
			local16.method8406(1.0F);
			local16.method8406(0.0F);
			local16.method8406(0.0F);
			local16.method8406(0.0F);
		}
		this.anInterface26_5 = this.method6806(20, local16.anInt9901, false, local16.aByteArray101);
		this.aClass214_9 = new Class214(this.anInterface26_5, 5126, 3, 0);
		this.aClass214_10 = new Class214(this.anInterface26_5, 5126, 2, 12);
		this.aClass262_1.method6412(this);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(BLclient!qaa;)V")
	public void method6799(@OriginalArg(1) Interface22 arg0) {
		if (this.aBoolean545) {
			this.method6807(arg0);
			this.method6754(arg0);
		} else if (this.anInt7882 >= 0 && arg0 == this.anInterface22Array2[this.anInt7882]) {
			this.anInterface22Array2[this.anInt7882--] = null;
			arg0.method3121();
			if (this.anInt7882 < 0) {
				this.anInterface22_1 = this.anInterface22_2 = null;
			} else {
				this.anInterface22_1 = this.anInterface22_2 = this.anInterface22Array2[this.anInt7882];
				this.anInterface22_1.method3124();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pq", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass207_Sub1_3.aFloat66 + this.aClass207_Sub1_3.aFloat62 * (float) arg2 + (float) arg1 * this.aClass207_Sub1_3.aFloat65 + (float) arg0 * this.aClass207_Sub1_3.aFloat58;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg5 * this.aClass207_Sub1_3.aFloat62 + this.aClass207_Sub1_3.aFloat65 * (float) arg4 + (float) arg3 * this.aClass207_Sub1_3.aFloat58 + this.aClass207_Sub1_3.aFloat66;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt7920 > local32 && (float) this.anInt7920 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt7907 < local32 && local63 > (float) this.anInt7907) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass207_Sub1_3.aFloat61 + this.aClass207_Sub1_3.aFloat59 * (float) arg0 + this.aClass207_Sub1_3.aFloat67 * (float) arg1 + (float) arg2 * this.aClass207_Sub1_3.aFloat68) * (float) this.anInt7908 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt7908 * (this.aClass207_Sub1_3.aFloat61 + this.aClass207_Sub1_3.aFloat68 * (float) arg5 + this.aClass207_Sub1_3.aFloat59 * (float) arg3 + this.aClass207_Sub1_3.aFloat67 * (float) arg4) / local63);
		if (this.aFloat129 > (float) local135 && this.aFloat129 > (float) local167) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat140 && (float) local167 > this.aFloat140) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) (((float) arg2 * this.aClass207_Sub1_3.aFloat63 + this.aClass207_Sub1_3.aFloat69 * (float) arg1 + (float) arg0 * this.aClass207_Sub1_3.aFloat60 + this.aClass207_Sub1_3.aFloat64) * (float) this.anInt7901 / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt7901 * (this.aClass207_Sub1_3.aFloat64 + this.aClass207_Sub1_3.aFloat63 * (float) arg5 + (float) arg3 * this.aClass207_Sub1_3.aFloat60 + this.aClass207_Sub1_3.aFloat69 * (float) arg4) / local63);
		if ((float) local233 < this.aFloat133 && this.aFloat133 > (float) local265) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat138 && this.aFloat138 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZII)V")
	public void method6800(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method6792(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "(I)V")
	private void method6801() {
		this.method6772(-2);
		for (@Pc(14) int local14 = this.anInt7895 - 1; local14 >= 0; local14--) {
			this.method6802(local14);
			this.method6759((Class53) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6770(8448, 8448);
		this.method6763(2, 770, 34168);
		this.method6741();
		this.anInt7889 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt7890 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean517 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean518 = true;
		this.method6774(true);
		this.method6742(true);
		this.method6764(true);
		this.method6787(true);
		this.method6765();
		this.anOpenGL2.setSwapInterval(0);
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
		this.anInt7916 = this.anInt7904 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!pq", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method6758();
		this.method6781(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean528) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean528) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = (float) arg0 * this.aClass207_Sub1_3.aFloat58 + this.aClass207_Sub1_3.aFloat65 * (float) arg1 + (float) arg2 * this.aClass207_Sub1_3.aFloat62 + this.aClass207_Sub1_3.aFloat66;
		@Pc(55) float local55 = this.aClass207_Sub1_3.aFloat62 * (float) arg5 + this.aClass207_Sub1_3.aFloat58 * (float) arg3 + (float) arg4 * this.aClass207_Sub1_3.aFloat65 + this.aClass207_Sub1_3.aFloat66;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt7920 && (float) this.anInt7920 > local55) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt7907 && (float) this.anInt7907 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) (((float) arg2 * this.aClass207_Sub1_3.aFloat68 + this.aClass207_Sub1_3.aFloat67 * (float) arg1 + this.aClass207_Sub1_3.aFloat59 * (float) arg0 + this.aClass207_Sub1_3.aFloat61) * (float) this.anInt7908 / (float) arg6);
		@Pc(157) int local157 = (int) ((this.aClass207_Sub1_3.aFloat68 * (float) arg5 + this.aClass207_Sub1_3.aFloat67 * (float) arg4 + (float) arg3 * this.aClass207_Sub1_3.aFloat59 + this.aClass207_Sub1_3.aFloat61) * (float) this.anInt7908 / (float) arg6);
		if ((float) local124 < this.aFloat129 && this.aFloat129 > (float) local157) {
			local57 |= 0x1;
		} else if ((float) local124 > this.aFloat140 && (float) local157 > this.aFloat140) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt7901 * ((float) arg2 * this.aClass207_Sub1_3.aFloat63 + this.aClass207_Sub1_3.aFloat69 * (float) arg1 + this.aClass207_Sub1_3.aFloat60 * (float) arg0 + this.aClass207_Sub1_3.aFloat64) / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass207_Sub1_3.aFloat64 + this.aClass207_Sub1_3.aFloat60 * (float) arg3 + this.aClass207_Sub1_3.aFloat69 * (float) arg4 + (float) arg5 * this.aClass207_Sub1_3.aFloat63) * (float) this.anInt7901 / (float) arg6);
		if ((float) local224 < this.aFloat133 && this.aFloat133 > (float) local257) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat138 && this.aFloat138 < (float) local257) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "()V")
	@Override
	public void method7472() {
		this.aClass221_1.method5213();
	}

	@OriginalMember(owner = "client!pq", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7908 = arg2;
		this.anInt7901 = arg3;
		this.anInt7906 = arg0;
		this.anInt7893 = arg1;
		this.method6783();
		this.method6768();
		if (this.anInt7900 == 3) {
			this.method6734();
		} else if (this.anInt7900 == 2) {
			this.method6811();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7494(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas10) {
			throw new RuntimeException();
		} else if (!this.aHashtable6.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) long local53 = this.anOpenGL2.prepareSurface(arg0);
			if (local53 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "(I)V")
	@Override
	public void method7485(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt7877 = arg0;
		this.aClass155_1.method3593();
	}

	@OriginalMember(owner = "client!pq", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat143 != arg0) {
			this.aFloat143 = arg0;
			this.method6737();
		}
	}

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "()Lclient!oo;")
	@Override
	public Class207 method7467() {
		return new Class207_Sub1();
	}

	@OriginalMember(owner = "client!pq", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7914 > arg2) {
			this.anInt7914 = arg2;
		}
		if (arg0 > this.anInt7919) {
			this.anInt7919 = arg0;
		}
		if (this.anInt7921 > arg3) {
			this.anInt7921 = arg3;
		}
		if (arg1 > this.anInt7910) {
			this.anInt7910 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method6768();
		this.method6808();
	}

	@OriginalMember(owner = "client!pq", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt7914;
		arg0[1] = this.anInt7910;
		arg0[0] = this.anInt7919;
		arg0[3] = this.anInt7921;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ok;)V")
	@Override
	public void method7452(@OriginalArg(0) Class25 arg0) {
		this.aClass25_Sub2_1 = (Class25_Sub2) arg0;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "()Lclient!rb;")
	@Override
	public Class297 method7439() {
		@Pc(7) int local7 = -1;
		if (this.aString102.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString102.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString102.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class297(local7, "OpenGL", this.anInt7917, this.aString103, 0L);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Lclient!za;")
	@Override
	public Class6_Sub20 method7453(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub20_Sub2 local8 = new Class6_Sub20_Sub2(arg0);
		this.aClass362_45.method8536(local8);
		return local8;
	}

	@OriginalMember(owner = "client!pq", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt7916;
		if (local11 || this.aFloat137 != arg1 || this.aFloat146 != arg2) {
			this.anInt7916 = arg0;
			this.aFloat146 = arg2;
			this.aFloat137 = arg1;
			if (local11) {
				this.aFloat147 = (float) (this.anInt7916 & 0xFF00) / 65280.0F;
				this.aFloat144 = (float) (this.anInt7916 & 0xFF0000) / 1.671168E7F;
				this.aFloat135 = (float) (this.anInt7916 & 0xFF) / 255.0F;
				this.method6737();
			}
			this.method6769();
		}
		if (this.aFloatArray44[0] == arg3 && arg4 == this.aFloatArray44[1] && arg5 == this.aFloatArray44[2]) {
			return;
		}
		this.aFloatArray44[0] = arg3;
		this.aFloatArray44[1] = arg4;
		this.aFloatArray44[2] = arg5;
		this.aFloatArray41[1] = -arg4;
		this.aFloatArray41[2] = -arg5;
		this.aFloatArray41[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray45[1] = local138 * arg4;
		this.aFloatArray45[0] = arg3 * local138;
		this.aFloatArray45[2] = local138 * arg5;
		this.aFloatArray42[0] = -this.aFloatArray45[0];
		this.aFloatArray42[1] = -this.aFloatArray45[1];
		this.aFloatArray42[2] = -this.aFloatArray45[2];
		this.method6813();
		this.anInt7897 = (int) (arg3 * 256.0F / arg4);
		this.anInt7922 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "(II)V")
	public void method6802(@OriginalArg(0) int arg0) {
		if (this.anInt7903 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt7903 = arg0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt7926;
		this.anInt7926 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "(II)V")
	public void method6803(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6770(7681, 7681);
		} else if (arg0 == 0) {
			this.method6770(8448, 8448);
		} else if (arg0 == 2) {
			this.method6770(7681, 34165);
		} else if (arg0 == 3) {
			this.method6770(8448, 260);
		} else if (arg0 == 4) {
			this.method6770(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "()Lclient!oo;")
	@Override
	public Class207 method7496() {
		return this.aClass207_Sub1_3;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!hda;I)V")
	@Override
	public void method7469(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1) {
		this.aClass262_1.method6409(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!mia;)V")
	@Override
	public void method7489(@OriginalArg(0) Interface16 arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!hda;)V")
	@Override
	public void method7455(@OriginalArg(0) Class137 arg0) {
		this.aClass262_1.method6409(this, arg0, -1);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7446(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7464(arg2, arg3);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)V")
	public synchronized void method6804(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub36 local8 = new Class6_Sub36(arg1);
		local8.aLong314 = (long) arg0;
		this.aClass362_47.method8536(local8);
	}

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "(I)V")
	private void method6805() {
		this.aClass53Array1 = new Class53[this.anInt7895];
		this.aClass53_Sub2_6 = new Class53_Sub2(this, 3553, 6408, 1, 1);
		new Class53_Sub2(this, 3553, 6408, 1, 1);
		new Class53_Sub2(this, 3553, 6408, 1, 1);
		this.aClass184_Sub2_2 = new Class184_Sub2(this);
		this.aClass184_Sub2_4 = new Class184_Sub2(this);
		this.aClass184_Sub2_10 = new Class184_Sub2(this);
		this.aClass184_Sub2_8 = new Class184_Sub2(this);
		this.aClass184_Sub2_1 = new Class184_Sub2(this);
		this.aClass184_Sub2_3 = new Class184_Sub2(this);
		this.aClass184_Sub2_7 = new Class184_Sub2(this);
		this.aClass184_Sub2_9 = new Class184_Sub2(this);
		this.aClass184_Sub2_6 = new Class184_Sub2(this);
		this.aClass184_Sub2_5 = new Class184_Sub2(this);
		if (this.aBoolean529) {
			this.aClass143_7 = new Class143(this);
			new Class143(this);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIZ[B)Lclient!vn;")
	public Interface26 method6806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface26) (this.aBoolean527 && (!arg2 || this.aBoolean531) ? new Class148_Sub1(this, arg0, arg3, arg1, arg2) : new Class165_Sub1(this, arg0, arg3, arg1));
	}

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "()Lclient!oo;")
	@Override
	public Class207 method7456() {
		return this.aClass207_Sub1_1;
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(II)V")
	@Override
	public void method7464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "()V")
	@Override
	public void method7499() {
		if (this.aBoolean529) {
			if (this.anInterface22_2 != this.aClass143_6) {
				throw new RuntimeException();
			}
			this.aClass143_6.method3138(0);
			this.aClass143_6.method3138(8);
			this.method6799(this.aClass143_6);
		} else if (this.aBoolean535) {
			this.aClass9_Sub2_1.method8932(0, 0, this.anInt7739, this.anInt7710, 0, 0);
			this.anOpenGL2.setSurface(this.aLong234);
		} else {
			throw new RuntimeException("");
		}
		this.anInt7710 = this.anInt7737;
		this.anInt7739 = this.anInt7876;
		this.aClass9_Sub2_1 = null;
		this.method6765();
		this.method6766();
		this.la();
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(II)I")
	@Override
	public int method7509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "()V")
	@Override
	public void method7477() {
		if (!this.aBoolean521 || this.anInt7739 <= 0 || this.anInt7710 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt7919;
		@Pc(19) int local19 = this.anInt7914;
		@Pc(22) int local22 = this.anInt7910;
		@Pc(25) int local25 = this.anInt7921;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6765();
		this.method6774(false);
		this.method6742(false);
		this.method6764(false);
		this.method6787(false);
		this.method6759((Class53) null);
		this.method6772(-2);
		this.method6803(1);
		this.method6781(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt7739, this.anInt7710, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!qaa;Z)V")
	public void method6807(@OriginalArg(0) Interface22 arg0) {
		if (this.anInt7884 < 0 || arg0 != this.anInterface22Array1[this.anInt7884]) {
			throw new RuntimeException();
		}
		this.anInterface22Array1[this.anInt7884--] = null;
		arg0.method3122();
		if (this.anInt7884 < 0) {
			this.anInterface22_1 = null;
		} else {
			this.anInterface22_1 = this.anInterface22Array1[this.anInt7884];
			this.anInterface22_1.method3125();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIZ)Lclient!ho;")
	@Override
	public Class9 method7476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class9_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pq", name = "A", descriptor = "(I)V")
	private void method6808() {
		if (this.anInt7919 <= this.anInt7914 && this.anInt7921 >= this.anInt7910) {
			OpenGL.glScissor(this.anInt7912 + this.anInt7919, this.anInt7913 + this.anInt7710 - this.anInt7921, this.anInt7914 - this.anInt7919, -this.anInt7910 + this.anInt7921);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!pq", name = "B", descriptor = "(I)V")
	public void method6809() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "()V")
	@Override
	public void method7454() {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I[Lclient!sca;)V")
	@Override
	public void method7504(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub17[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass6_Sub17Array4[local7] = arg1[local7];
		}
		this.anInt7902 = arg0;
		if (this.anInt7900 != 1) {
			this.method6755();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(23) Class1_Sub2 local23 = (Class1_Sub2) arg5;
		@Pc(26) Class53_Sub2_Sub1 local26 = local23.aClass53_Sub2_Sub1_2;
		this.method6767();
		this.method6759(local23.aClass53_Sub2_Sub1_2);
		this.method6781(1);
		this.method6770(8448, 7681);
		this.method6763(0, 768, 34167);
		@Pc(56) float local56 = local26.aFloat31 / (float) local26.anInt4464;
		@Pc(63) float local63 = local26.aFloat32 / (float) local26.anInt4466;
		@Pc(69) float local69 = (float) arg2 - (float) arg0;
		@Pc(76) float local76 = (float) -arg1 + (float) arg3;
		@Pc(89) float local89 = (float) (1.0D / Math.sqrt((double) (local76 * local76 + local69 * local69)));
		@Pc(93) float local93 = local69 * local89;
		@Pc(97) float local97 = local76 * local89;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(118) int local118 = arg10 % (arg9 + arg8);
		@Pc(123) float local123 = (float) arg8 * local93;
		@Pc(128) float local128 = local97 * (float) arg8;
		@Pc(130) float local130 = 0.0F;
		@Pc(132) float local132 = 0.0F;
		@Pc(134) float local134 = local123;
		@Pc(136) float local136 = local128;
		if (arg8 >= local118) {
			local136 = (float) (arg8 - local118) * local97;
			local134 = (float) (arg8 - local118) * local93;
		} else {
			local130 = local93 * (float) (arg8 + arg9 - local118);
			local132 = local97 * (float) (arg9 + arg8 - local118);
		}
		@Pc(182) float local182 = (float) arg0 + local130 + 0.35F;
		@Pc(189) float local189 = (float) arg1 + local132 + 0.35F;
		@Pc(194) float local194 = (float) arg9 * local93;
		@Pc(199) float local199 = local97 * (float) arg9;
		while (true) {
			if (arg2 > arg0) {
				if ((float) arg2 + 0.35F < local182) {
					break;
				}
				if ((float) arg2 < local134 + local182) {
					local134 = (float) arg2 - local182;
				}
			} else {
				if ((float) arg2 + 0.35F > local182) {
					break;
				}
				if ((float) arg2 > local134 + local182) {
					local134 = (float) arg2 - local182;
				}
			}
			if (arg3 <= arg1) {
				if (local189 < (float) arg3 + 0.35F) {
					break;
				}
				if (local189 + local136 < (float) arg3) {
					local136 = (float) arg3 - local189;
				}
			} else {
				if (local189 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local189 + local136) {
					local136 = (float) arg3 - local189;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(((float) -arg6 + local182) * local56, (local189 - (float) arg7) * local63);
			OpenGL.glVertex2f(local182, local189);
			OpenGL.glTexCoord2f((local182 + local134 - (float) arg6) * local56, local63 * ((float) -arg7 + local189 + local136));
			OpenGL.glVertex2f(local134 + local182, local189 + local136);
			local182 += local194 + local134;
			OpenGL.glEnd();
			local189 += local136 + local199;
			local136 = local128;
			local134 = local123;
		}
		this.method6763(0, 768, 5890);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!oo;)V")
	@Override
	public void method7517(@OriginalArg(0) Class207 arg0) {
		this.aClass207_Sub1_3.method8211(arg0);
		this.aClass207_Sub1_4.method8211(this.aClass207_Sub1_3);
		this.aClass207_Sub1_4.method4996();
		this.aClass207_Sub1_5.method5003(this.aClass207_Sub1_4);
		if (this.anInt7900 != 1) {
			this.method6732();
		}
	}

	@OriginalMember(owner = "client!pq", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean546 = true;
		this.anInt7898 = arg0;
		this.anInt7923 = arg1;
		this.anInt7915 = arg2;
		this.anInt7911 = arg3;
	}

	@OriginalMember(owner = "client!pq", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Class53_Sub2_Sub1 local9 = local6.aClass53_Sub2_Sub1_2;
		this.method6767();
		this.method6759(local6.aClass53_Sub2_Sub1_2);
		this.method6781(1);
		this.method6770(8448, 7681);
		this.method6763(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat31 / (float) local9.anInt4464;
		@Pc(46) float local46 = local9.aFloat32 / (float) local9.anInt4466;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7919 - arg2), local46 * (float) (this.anInt7910 - arg3));
		OpenGL.glVertex2i(this.anInt7919, this.anInt7910);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7919 - arg2), local46 * (float) (this.anInt7921 - arg3));
		OpenGL.glVertex2i(this.anInt7919, this.anInt7921);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7914 - arg2), (float) (this.anInt7921 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt7914, this.anInt7921);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7914 - arg2), local46 * (float) (this.anInt7910 - arg3));
		OpenGL.glVertex2i(this.anInt7914, this.anInt7910);
		OpenGL.glEnd();
		this.method6763(0, 768, 5890);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ao;IIII)Lclient!ka;")
	@Override
	public Class184 method7475(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class184_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!pq", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method6781(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!pq", name = "C", descriptor = "(I)V")
	private void method6811() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray43, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pq", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt7925;
		this.anInt7925 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!jda;B)V")
	public void method6812(@OriginalArg(0) Interface14 arg0) {
		if (this.anInterface14_3 != arg0) {
			if (this.aBoolean527) {
				OpenGL.glBindBufferARB(34963, arg0.method8576());
			}
			this.anInterface14_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "()V")
	@Override
	protected void method7498() {
		for (@Pc(10) Class6 local10 = this.aClass362_45.method8538(); local10 != null; local10 = this.aClass362_45.method8530()) {
			((Class6_Sub20_Sub2) local10).method8844();
		}
		if (this.aClass221_1 != null) {
			this.aClass221_1.method5220();
		}
		if (this.anOpenGL2 != null) {
			this.method6757();
			@Pc(40) Enumeration local40 = this.aHashtable6.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable6.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean515) {
			Static557.method7881(false, true);
			this.aBoolean515 = false;
		}
	}

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "()Z")
	@Override
	public boolean method7506() {
		return true;
	}

	@OriginalMember(owner = "client!pq", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6787(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)Lclient!cn;")
	@Override
	public Interface4 method7436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pq", name = "D", descriptor = "(I)V")
	public void method6813() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray45, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray42, 0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIZ)Lclient!ho;")
	@Override
	public Class9 method7482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class9_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "()Z")
	@Override
	public boolean method7503() {
		return this.aClass352_1.method8274();
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(ILclient!qaa;)V")
	public void method6814(@OriginalArg(1) Interface22 arg0) {
		if (this.aBoolean545) {
			this.method6756(arg0);
			this.method6791(arg0);
		} else if (this.anInt7882 < 3) {
			if (this.anInt7882 >= 0) {
				this.anInterface22Array2[this.anInt7882].method3121();
			}
			this.anInterface22_1 = this.anInterface22_2 = this.anInterface22Array2[++this.anInt7882] = arg0;
			this.anInterface22_1.method3124();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7920 == arg0 && this.anInt7907 == arg1) {
			return;
		}
		this.anInt7920 = arg0;
		this.anInt7907 = arg1;
		this.method6783();
		this.method6738();
		if (this.anInt7900 == 3) {
			this.method6734();
		} else if (this.anInt7900 == 2) {
			this.method6811();
			return;
		}
	}

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "(B)V")
	private void method6815() {
		if (this.aBoolean533 && !this.aBoolean525) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)I")
	@Override
	public int method7448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7510(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas10 == arg0) {
			local5 = this.aLong233;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable6.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas11) {
			this.method6785();
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7505(@OriginalArg(0) Canvas arg0) {
		this.aLong234 = 0L;
		this.aCanvas11 = null;
		if (arg0 == null || this.aCanvas10 == arg0) {
			this.aCanvas11 = this.aCanvas10;
			this.aLong234 = this.aLong233;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable6.get(arg0);
			this.aLong234 = local36;
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.aLong234 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong234);
		this.method6785();
	}

	@OriginalMember(owner = "client!pq", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(53) float local53;
		if (this.aClass53_Sub2_Sub1_3 == null || arg2 > this.aClass53_Sub2_Sub1_3.anInt4460 || arg3 > this.aClass53_Sub2_Sub1_3.anInt4459) {
			this.aClass53_Sub2_Sub1_3 = Static655.method8906(arg2, arg6, this, arg3);
			this.aClass53_Sub2_Sub1_3.method3730(false, false);
			local41 = this.aClass53_Sub2_Sub1_3.aFloat32;
			local53 = this.aClass53_Sub2_Sub1_3.aFloat31;
		} else {
			this.aClass53_Sub2_Sub1_3.method3733(false, arg3, arg6, arg2, 6406);
			local41 = (float) arg3 * this.aClass53_Sub2_Sub1_3.aFloat32 / (float) this.aClass53_Sub2_Sub1_3.anInt4459;
			local53 = this.aClass53_Sub2_Sub1_3.aFloat31 * (float) arg2 / (float) this.aClass53_Sub2_Sub1_3.anInt4460;
		}
		this.method6767();
		this.method6759(this.aClass53_Sub2_Sub1_3);
		this.method6781(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method6733(arg5);
		this.method6770(34165, 34165);
		this.method6763(0, 768, 34166);
		this.method6763(2, 770, 5890);
		this.method6760(34166, 0);
		this.method6760(5890, 2);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = local143 + (float) arg2;
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
		this.method6763(0, 768, 5890);
		this.method6763(2, 770, 34166);
		this.method6760(5890, 0);
		this.method6760(34166, 2);
	}
}
