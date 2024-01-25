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

@OriginalClass("client!lf")
public final class Class95_Sub3 extends Class95 {

	@OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
	private int anInt5581;

	@OriginalMember(owner = "client!lf", name = "Vc", descriptor = "I")
	public int anInt5669;

	@OriginalMember(owner = "client!lf", name = "Jd", descriptor = "I")
	public int anInt5708;

	@OriginalMember(owner = "client!lf", name = "Vd", descriptor = "I")
	private int anInt5718;

	@OriginalMember(owner = "client!lf", name = "Oe", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!lf", name = "Pe", descriptor = "I")
	public int anInt5751;

	@OriginalMember(owner = "client!lf", name = "Se", descriptor = "Lclient!gea;")
	private Class127 aClass127_4;

	@OriginalMember(owner = "client!lf", name = "Ue", descriptor = "Lclient!vk;")
	private Interface25 anInterface25_1;

	@OriginalMember(owner = "client!lf", name = "Ve", descriptor = "Lclient!aea;")
	private Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!lf", name = "We", descriptor = "Lclient!vk;")
	private Interface25 anInterface25_2;

	@OriginalMember(owner = "client!lf", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!lf", name = "cf", descriptor = "I")
	public int anInt5755;

	@OriginalMember(owner = "client!lf", name = "ef", descriptor = "I")
	public int anInt5756;

	@OriginalMember(owner = "client!lf", name = "mf", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!lf", name = "nf", descriptor = "I")
	private int anInt5757;

	@OriginalMember(owner = "client!lf", name = "of", descriptor = "I")
	private int anInt5758;

	@OriginalMember(owner = "client!lf", name = "pf", descriptor = "Z")
	private boolean aBoolean362;

	@OriginalMember(owner = "client!lf", name = "rf", descriptor = "Z")
	private boolean aBoolean363;

	@OriginalMember(owner = "client!lf", name = "sf", descriptor = "I")
	private int anInt5759;

	@OriginalMember(owner = "client!lf", name = "tf", descriptor = "Z")
	private boolean aBoolean364;

	@OriginalMember(owner = "client!lf", name = "uf", descriptor = "Z")
	private boolean aBoolean365;

	@OriginalMember(owner = "client!lf", name = "zf", descriptor = "Z")
	public boolean aBoolean366;

	@OriginalMember(owner = "client!lf", name = "Af", descriptor = "Z")
	private boolean aBoolean367;

	@OriginalMember(owner = "client!lf", name = "Bf", descriptor = "Lclient!sca;")
	public Class149_Sub2 aClass149_Sub2_1;

	@OriginalMember(owner = "client!lf", name = "Cf", descriptor = "I")
	public int anInt5760;

	@OriginalMember(owner = "client!lf", name = "Ff", descriptor = "Z")
	public boolean aBoolean368;

	@OriginalMember(owner = "client!lf", name = "Gf", descriptor = "Z")
	public boolean aBoolean369;

	@OriginalMember(owner = "client!lf", name = "Hf", descriptor = "Ljava/lang/String;")
	private String aString73;

	@OriginalMember(owner = "client!lf", name = "If", descriptor = "I")
	public int anInt5762;

	@OriginalMember(owner = "client!lf", name = "Jf", descriptor = "Z")
	public boolean aBoolean370;

	@OriginalMember(owner = "client!lf", name = "Kf", descriptor = "Z")
	private boolean aBoolean371;

	@OriginalMember(owner = "client!lf", name = "Mf", descriptor = "[Lclient!ru;")
	private Class10[] aClass10Array1;

	@OriginalMember(owner = "client!lf", name = "Of", descriptor = "I")
	public int anInt5764;

	@OriginalMember(owner = "client!lf", name = "Uf", descriptor = "I")
	private int anInt5768;

	@OriginalMember(owner = "client!lf", name = "Vf", descriptor = "Lclient!rba;")
	public Class10_Sub2 aClass10_Sub2_2;

	@OriginalMember(owner = "client!lf", name = "Wf", descriptor = "I")
	private int anInt5769;

	@OriginalMember(owner = "client!lf", name = "Yf", descriptor = "F")
	private float aFloat83;

	@OriginalMember(owner = "client!lf", name = "Zf", descriptor = "Lclient!ut;")
	public Class364 aClass364_5;

	@OriginalMember(owner = "client!lf", name = "bg", descriptor = "Lclient!sca;")
	public Class149_Sub2 aClass149_Sub2_2;

	@OriginalMember(owner = "client!lf", name = "cg", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!lf", name = "eg", descriptor = "Z")
	private boolean aBoolean375;

	@OriginalMember(owner = "client!lf", name = "gg", descriptor = "Lclient!sca;")
	public Class149_Sub2 aClass149_Sub2_3;

	@OriginalMember(owner = "client!lf", name = "hg", descriptor = "Z")
	public boolean aBoolean377;

	@OriginalMember(owner = "client!lf", name = "ig", descriptor = "Z")
	public boolean aBoolean378;

	@OriginalMember(owner = "client!lf", name = "jg", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!lf", name = "kg", descriptor = "I")
	private int anInt5771;

	@OriginalMember(owner = "client!lf", name = "lg", descriptor = "Z")
	public boolean aBoolean379;

	@OriginalMember(owner = "client!lf", name = "mg", descriptor = "Lclient!fu;")
	private Class10_Sub2_Sub1 aClass10_Sub2_Sub1_5;

	@OriginalMember(owner = "client!lf", name = "ng", descriptor = "Lclient!sca;")
	public Class149_Sub2 aClass149_Sub2_4;

	@OriginalMember(owner = "client!lf", name = "pg", descriptor = "F")
	private float aFloat87;

	@OriginalMember(owner = "client!lf", name = "qg", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!lf", name = "tg", descriptor = "I")
	private int anInt5773;

	@OriginalMember(owner = "client!lf", name = "vg", descriptor = "Lclient!sca;")
	public Class149_Sub2 aClass149_Sub2_5;

	@OriginalMember(owner = "client!lf", name = "wg", descriptor = "Z")
	public boolean aBoolean382;

	@OriginalMember(owner = "client!lf", name = "Cg", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!lf", name = "Eg", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!lf", name = "Fg", descriptor = "Lclient!sca;")
	public Class149_Sub2 aClass149_Sub2_6;

	@OriginalMember(owner = "client!lf", name = "Gg", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!lf", name = "Ig", descriptor = "I")
	private int anInt5777;

	@OriginalMember(owner = "client!lf", name = "Lg", descriptor = "Lclient!sca;")
	public Class149_Sub2 aClass149_Sub2_7;

	@OriginalMember(owner = "client!lf", name = "Mg", descriptor = "Lclient!ut;")
	public Class364 aClass364_6;

	@OriginalMember(owner = "client!lf", name = "Ng", descriptor = "I")
	public int anInt5779;

	@OriginalMember(owner = "client!lf", name = "Og", descriptor = "Z")
	private boolean aBoolean385;

	@OriginalMember(owner = "client!lf", name = "Pg", descriptor = "F")
	private float aFloat95;

	@OriginalMember(owner = "client!lf", name = "Rg", descriptor = "Ljava/lang/String;")
	private String aString74;

	@OriginalMember(owner = "client!lf", name = "Ug", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!lf", name = "Vg", descriptor = "Lclient!gea;")
	public Class127 aClass127_5;

	@OriginalMember(owner = "client!lf", name = "Wg", descriptor = "Lclient!ot;")
	private Interface21 anInterface21_2;

	@OriginalMember(owner = "client!lf", name = "Zg", descriptor = "I")
	private int anInt5783;

	@OriginalMember(owner = "client!lf", name = "bh", descriptor = "Lclient!sca;")
	public Class149_Sub2 aClass149_Sub2_8;

	@OriginalMember(owner = "client!lf", name = "ch", descriptor = "Z")
	private boolean aBoolean387;

	@OriginalMember(owner = "client!lf", name = "dh", descriptor = "Z")
	public boolean aBoolean388;

	@OriginalMember(owner = "client!lf", name = "fh", descriptor = "Z")
	public boolean aBoolean389;

	@OriginalMember(owner = "client!lf", name = "hh", descriptor = "Z")
	private boolean aBoolean390;

	@OriginalMember(owner = "client!lf", name = "mh", descriptor = "Lclient!ot;")
	private Interface21 anInterface21_3;

	@OriginalMember(owner = "client!lf", name = "qh", descriptor = "I")
	private int anInt5788;

	@OriginalMember(owner = "client!lf", name = "uh", descriptor = "Lclient!wl;")
	private Class57_Sub2 aClass57_Sub2_1;

	@OriginalMember(owner = "client!lf", name = "zh", descriptor = "Lclient!sca;")
	public Class149_Sub2 aClass149_Sub2_9;

	@OriginalMember(owner = "client!lf", name = "Ah", descriptor = "Lclient!vv;")
	private Interface27 anInterface27_1;

	@OriginalMember(owner = "client!lf", name = "Ch", descriptor = "Lclient!sca;")
	public Class149_Sub2 aClass149_Sub2_10;

	@OriginalMember(owner = "client!lf", name = "Dh", descriptor = "I")
	private int anInt5793;

	@OriginalMember(owner = "client!lf", name = "Gh", descriptor = "I")
	private int anInt5794;

	@OriginalMember(owner = "client!lf", name = "Jh", descriptor = "I")
	private int anInt5795;

	@OriginalMember(owner = "client!lf", name = "mb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!lf", name = "De", descriptor = "I")
	public int anInt5745 = 128;

	@OriginalMember(owner = "client!lf", name = "ue", descriptor = "Lclient!lk;")
	private final Class212 aClass212_1 = new Class212();

	@OriginalMember(owner = "client!lf", name = "Ie", descriptor = "Lclient!po;")
	private final Class17_Sub3 aClass17_Sub3_1 = new Class17_Sub3();

	@OriginalMember(owner = "client!lf", name = "Je", descriptor = "Lclient!po;")
	public final Class17_Sub3 aClass17_Sub3_2 = new Class17_Sub3();

	@OriginalMember(owner = "client!lf", name = "Ne", descriptor = "I")
	public int anInt5750 = 3;

	@OriginalMember(owner = "client!lf", name = "Le", descriptor = "I")
	public int anInt5749 = 8;

	@OriginalMember(owner = "client!lf", name = "Qe", descriptor = "Z")
	private boolean aBoolean361 = false;

	@OriginalMember(owner = "client!lf", name = "Ke", descriptor = "Lclient!qw;")
	private final Class302 aClass302_29 = new Class302();

	@OriginalMember(owner = "client!lf", name = "Te", descriptor = "[Lclient!vk;")
	private final Interface25[] anInterface25Array1 = new Interface25[4];

	@OriginalMember(owner = "client!lf", name = "Re", descriptor = "I")
	private int anInt5752 = -1;

	@OriginalMember(owner = "client!lf", name = "Xe", descriptor = "I")
	private int anInt5753 = -1;

	@OriginalMember(owner = "client!lf", name = "Ye", descriptor = "I")
	private int anInt5754 = -1;

	@OriginalMember(owner = "client!lf", name = "af", descriptor = "[Lclient!vk;")
	private final Interface25[] anInterface25Array3 = new Interface25[4];

	@OriginalMember(owner = "client!lf", name = "Ze", descriptor = "[Lclient!vk;")
	private final Interface25[] anInterface25Array2 = new Interface25[4];

	@OriginalMember(owner = "client!lf", name = "df", descriptor = "Lclient!qw;")
	private final Class302 aClass302_30;

	@OriginalMember(owner = "client!lf", name = "ff", descriptor = "Lclient!qw;")
	private final Class302 aClass302_31;

	@OriginalMember(owner = "client!lf", name = "gf", descriptor = "Lclient!qw;")
	private final Class302 aClass302_32;

	@OriginalMember(owner = "client!lf", name = "hf", descriptor = "Lclient!qw;")
	private final Class302 aClass302_33;

	@OriginalMember(owner = "client!lf", name = "jf", descriptor = "Lclient!qw;")
	private final Class302 aClass302_34;

	@OriginalMember(owner = "client!lf", name = "kf", descriptor = "Lclient!qw;")
	private final Class302 aClass302_35;

	@OriginalMember(owner = "client!lf", name = "lf", descriptor = "Lclient!qw;")
	private final Class302 aClass302_36;

	@OriginalMember(owner = "client!lf", name = "qf", descriptor = "Lclient!po;")
	public final Class17_Sub3 aClass17_Sub3_3;

	@OriginalMember(owner = "client!lf", name = "vf", descriptor = "Lclient!po;")
	public final Class17_Sub3 aClass17_Sub3_4;

	@OriginalMember(owner = "client!lf", name = "wf", descriptor = "Lclient!po;")
	public final Class17_Sub3 aClass17_Sub3_5;

	@OriginalMember(owner = "client!lf", name = "Sf", descriptor = "I")
	public int anInt5767;

	@OriginalMember(owner = "client!lf", name = "dg", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!lf", name = "xg", descriptor = "I")
	private int anInt5774;

	@OriginalMember(owner = "client!lf", name = "Bg", descriptor = "I")
	private int anInt5776;

	@OriginalMember(owner = "client!lf", name = "xf", descriptor = "[F")
	public final float[] aFloatArray33;

	@OriginalMember(owner = "client!lf", name = "Df", descriptor = "I")
	private int anInt5761;

	@OriginalMember(owner = "client!lf", name = "rg", descriptor = "F")
	private float aFloat89;

	@OriginalMember(owner = "client!lf", name = "Ag", descriptor = "I")
	private int anInt5775;

	@OriginalMember(owner = "client!lf", name = "Tf", descriptor = "[F")
	private final float[] aFloatArray35;

	@OriginalMember(owner = "client!lf", name = "Ef", descriptor = "[F")
	private final float[] aFloatArray34;

	@OriginalMember(owner = "client!lf", name = "sg", descriptor = "I")
	public int anInt5772;

	@OriginalMember(owner = "client!lf", name = "Tg", descriptor = "I")
	public int anInt5781;

	@OriginalMember(owner = "client!lf", name = "Pf", descriptor = "I")
	public int anInt5765;

	@OriginalMember(owner = "client!lf", name = "Kg", descriptor = "I")
	private int anInt5778;

	@OriginalMember(owner = "client!lf", name = "yg", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!lf", name = "Dg", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!lf", name = "Xg", descriptor = "Z")
	private boolean aBoolean386;

	@OriginalMember(owner = "client!lf", name = "ag", descriptor = "I")
	public int anInt5770;

	@OriginalMember(owner = "client!lf", name = "Nf", descriptor = "I")
	private int anInt5763;

	@OriginalMember(owner = "client!lf", name = "Hg", descriptor = "F")
	private float aFloat94;

	@OriginalMember(owner = "client!lf", name = "ph", descriptor = "I")
	public int anInt5787;

	@OriginalMember(owner = "client!lf", name = "Sg", descriptor = "I")
	public int anInt5780;

	@OriginalMember(owner = "client!lf", name = "jh", descriptor = "F")
	private float aFloat98;

	@OriginalMember(owner = "client!lf", name = "zg", descriptor = "[F")
	private final float[] aFloatArray36;

	@OriginalMember(owner = "client!lf", name = "rh", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!lf", name = "sh", descriptor = "[F")
	private final float[] aFloatArray37;

	@OriginalMember(owner = "client!lf", name = "nh", descriptor = "F")
	private float aFloat100;

	@OriginalMember(owner = "client!lf", name = "eh", descriptor = "[Lclient!uaa;")
	private final Class3_Sub13[] aClass3_Sub13Array2;

	@OriginalMember(owner = "client!lf", name = "yf", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!lf", name = "lh", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!lf", name = "og", descriptor = "Z")
	private boolean aBoolean380;

	@OriginalMember(owner = "client!lf", name = "yh", descriptor = "I")
	public int anInt5791;

	@OriginalMember(owner = "client!lf", name = "ih", descriptor = "I")
	public int anInt5785;

	@OriginalMember(owner = "client!lf", name = "Yg", descriptor = "I")
	public int anInt5782;

	@OriginalMember(owner = "client!lf", name = "wh", descriptor = "I")
	private int anInt5790;

	@OriginalMember(owner = "client!lf", name = "Qf", descriptor = "I")
	private int anInt5766;

	@OriginalMember(owner = "client!lf", name = "vh", descriptor = "I")
	private int anInt5789;

	@OriginalMember(owner = "client!lf", name = "ah", descriptor = "F")
	private float aFloat97;

	@OriginalMember(owner = "client!lf", name = "xh", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!lf", name = "kh", descriptor = "I")
	private int anInt5786;

	@OriginalMember(owner = "client!lf", name = "gh", descriptor = "I")
	public int anInt5784;

	@OriginalMember(owner = "client!lf", name = "Qg", descriptor = "Lclient!uba;")
	public Class3_Sub4_Sub2 aClass3_Sub4_Sub2_1;

	@OriginalMember(owner = "client!lf", name = "Fh", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!lf", name = "Hh", descriptor = "[I")
	public int[] anIntArray313;

	@OriginalMember(owner = "client!lf", name = "Eh", descriptor = "[I")
	public int[] anIntArray311;

	@OriginalMember(owner = "client!lf", name = "Ih", descriptor = "[B")
	public final byte[] aByteArray47;

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas6;

	@OriginalMember(owner = "client!lf", name = "Tb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!lf", name = "He", descriptor = "I")
	public final int anInt5748;

	@OriginalMember(owner = "client!lf", name = "Od", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!lf", name = "Sd", descriptor = "J")
	private final long aLong158;

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!lf", name = "Bh", descriptor = "I")
	public final int anInt5792;

	@OriginalMember(owner = "client!lf", name = "fg", descriptor = "Z")
	public boolean aBoolean376;

	@OriginalMember(owner = "client!lf", name = "Rf", descriptor = "Z")
	private boolean aBoolean373;

	@OriginalMember(owner = "client!lf", name = "ug", descriptor = "Z")
	public boolean aBoolean381;

	@OriginalMember(owner = "client!lf", name = "Jg", descriptor = "Z")
	public boolean aBoolean384;

	@OriginalMember(owner = "client!lf", name = "oh", descriptor = "Z")
	public boolean aBoolean391;

	@OriginalMember(owner = "client!lf", name = "Lf", descriptor = "Z")
	private boolean aBoolean372;

	@OriginalMember(owner = "client!lf", name = "th", descriptor = "Z")
	public boolean aBoolean392;

	@OriginalMember(owner = "client!lf", name = "Xf", descriptor = "Z")
	private final boolean aBoolean374;

	@OriginalMember(owner = "client!lf", name = "Ge", descriptor = "Lclient!oha;")
	private final Class267 aClass267_1;

	@OriginalMember(owner = "client!lf", name = "Me", descriptor = "Lclient!laa;")
	public final Class204 aClass204_1;

	@OriginalMember(owner = "client!lf", name = "qe", descriptor = "Lclient!bo;")
	private final Class39 aClass39_1;

	@OriginalMember(owner = "client!lf", name = "ye", descriptor = "Lclient!nia;")
	private Class3_Sub36_Sub1 aClass3_Sub36_Sub1_1;

	@OriginalMember(owner = "client!lf", name = "se", descriptor = "Lclient!pfa;")
	private final Class280 aClass280_1;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class95_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class243();
		new Class333(16);
		this.aClass302_30 = new Class302();
		this.aClass302_31 = new Class302();
		this.aClass302_32 = new Class302();
		this.aClass302_33 = new Class302();
		this.aClass302_34 = new Class302();
		this.aClass302_35 = new Class302();
		this.aClass302_36 = new Class302();
		this.aClass17_Sub3_3 = new Class17_Sub3();
		this.aClass17_Sub3_4 = new Class17_Sub3();
		this.aClass17_Sub3_5 = new Class17_Sub3();
		this.anInt5767 = 0;
		this.aFloat85 = 1.0F;
		this.anInt5774 = -1;
		this.anInt5776 = 0;
		this.aFloatArray33 = new float[4];
		this.anInt5761 = 0;
		this.aFloat89 = -1.0F;
		this.anInt5775 = 0;
		this.aFloatArray35 = new float[16];
		this.aFloatArray34 = new float[4];
		this.anInt5772 = 0;
		this.anInt5781 = 512;
		this.anInt5765 = -1;
		this.anInt5778 = 0;
		this.aFloat90 = 3584.0F;
		this.aFloat91 = -1.0F;
		this.aBoolean386 = false;
		this.anInt5770 = -1;
		this.anInt5763 = 3584;
		this.aFloat94 = 0.0F;
		this.anInt5787 = 0;
		this.anInt5780 = -1;
		this.aFloat98 = 1.0F;
		this.aFloatArray36 = new float[4];
		this.aFloat101 = 1.0F;
		this.aFloatArray37 = new float[4];
		this.aFloat100 = 1.0F;
		this.aClass3_Sub13Array2 = new Class3_Sub13[Static637.anInt2182];
		this.aFloat82 = 3584.0F;
		this.aFloat99 = 1.0F;
		this.aBoolean380 = true;
		this.anInt5791 = -1;
		this.anInt5785 = 512;
		this.anInt5782 = 50;
		this.anInt5790 = 0;
		this.anInt5766 = 8448;
		this.anInt5789 = 8448;
		this.aFloat97 = -1.0F;
		this.aFloat102 = -1.0F;
		this.anInt5786 = 0;
		this.anInt5784 = 0;
		this.aClass3_Sub4_Sub2_1 = new Class3_Sub4_Sub2(8192);
		this.anIntArray312 = new int[1];
		this.anIntArray313 = new int[1];
		this.anIntArray311 = new int[1];
		this.aByteArray47 = new byte[16384];
		this.aCanvas7 = this.aCanvas6 = arg0;
		this.anInt5748 = arg2;
		if (!Static634.method5642("jaclib")) {
			throw new RuntimeException("");
		} else if (Static634.method5642("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong157 = this.aLong158 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt5748);
				if (this.aLong158 == 0L) {
					throw new RuntimeException("");
				}
				this.method4914();
				@Pc(333) int local333 = this.method4910();
				if (local333 != 0) {
					throw new RuntimeException("");
				}
				this.anInt5792 = this.aBoolean369 ? 33639 : 5121;
				if (this.aString74.indexOf("radeon") != -1) {
					@Pc(356) int local356 = 0;
					@Pc(358) boolean local358 = false;
					@Pc(360) boolean local360 = false;
					@Pc(369) String[] local369 = Static120.method1814(this.aString74.replace('/', ' '), ' ');
					for (@Pc(371) int local371 = 0; local371 < local369.length; local371++) {
						@Pc(377) String local377 = local369[local371];
						try {
							if (local377.length() > 0) {
								if (local377.charAt(0) == 'x' && local377.length() >= 3 && Static346.method5030(local377.substring(1, 3))) {
									local360 = true;
									local377 = local377.substring(1);
								}
								if (local377.equals("hd")) {
									local358 = true;
								} else {
									if (local377.startsWith("hd")) {
										local358 = true;
										local377 = local377.substring(2);
									}
									if (local377.length() >= 4 && Static346.method5030(local377.substring(0, 4))) {
										local356 = Static505.method6599(local377.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(447) Exception local447) {
						}
					}
					if (!local360 && !local358) {
						if (local356 >= 7000 && local356 <= 9250) {
							this.aBoolean376 = false;
						}
						if (local356 >= 7000 && local356 <= 7999) {
							this.aBoolean373 = false;
						}
					}
					if (!local358 || local356 < 4000) {
						this.aBoolean381 = false;
					}
					this.aBoolean384 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean391 = true;
					this.aBoolean372 = this.aBoolean373;
				}
				if (this.aString73.indexOf("intel") != -1) {
					this.aBoolean392 = false;
				}
				this.aBoolean374 = !this.aString73.equals("s3 graphics");
				if (this.aBoolean373) {
					try {
						@Pc(533) int[] local533 = new int[1];
						OpenGL.glGenBuffersARB(1, local533, 0);
					} catch (@Pc(539) Throwable local539) {
						throw new RuntimeException("");
					}
				}
				Static253.method3817(true, false);
				this.aBoolean361 = true;
				this.aClass267_1 = new Class267(this, super.anInterface2_12);
				this.method4857();
				this.aClass204_1 = new Class204(this);
				this.aClass39_1 = new Class39(this);
				if (this.aClass39_1.method1039()) {
					this.aClass3_Sub36_Sub1_1 = new Class3_Sub36_Sub1(this);
					if (!this.aClass3_Sub36_Sub1_1.method5572()) {
						this.aClass3_Sub36_Sub1_1.method5562();
						this.aClass3_Sub36_Sub1_1 = null;
					}
				}
				this.aClass280_1 = new Class280(this);
				this.method4872();
				this.method4913();
				this.method8019();
			} catch (@Pc(613) Throwable local613) {
				local613.printStackTrace();
				this.method8014();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBI)V")
	public synchronized void method4830(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub24 local8 = new Class3_Sub24(arg0);
		local8.aLong313 = (long) arg1;
		this.aClass302_31.method6613(local8);
	}

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
	private void method4831() {
		Static172.aFloatArray20[2] = this.aFloat99 * this.aFloat84;
		Static172.aFloatArray20[1] = this.aFloat84 * this.aFloat85;
		Static172.aFloatArray20[0] = this.aFloat101 * this.aFloat84;
		Static172.aFloatArray20[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static172.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5776 < arg1) {
			this.anInt5776 = arg1;
		}
		if (this.anInt5790 < arg0) {
			this.anInt5790 = arg0;
		}
		if (arg3 < this.anInt5786) {
			this.anInt5786 = arg3;
		}
		if (arg2 < this.anInt5778) {
			this.anInt5778 = arg2;
		}
		OpenGL.glEnable(3089);
		this.method4894();
		this.method4851();
	}

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt5755 + this.anInt5756 + this.bf;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIII)V")
	public void method4832(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "()V")
	@Override
	public void method8019() {
		if (!this.aBoolean374 || this.anInt5708 <= 0 || this.anInt5669 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt5790;
		@Pc(22) int local22 = this.anInt5778;
		@Pc(25) int local25 = this.anInt5776;
		@Pc(28) int local28 = this.anInt5786;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4844();
		this.method4839(false);
		this.method4908(false);
		this.method4862(false);
		this.method4841(false);
		this.method4864((Class10) null);
		this.method4849(-2);
		this.method4870(1);
		this.method4833(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt5708, this.anInt5669, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt5750 = 0;
		while (arg0 > 1) {
			this.anInt5750++;
			arg0 >>= 0x1;
		}
		this.anInt5749 = 0x1 << this.anInt5750;
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)V")
	@Override
	public void method8060(@OriginalArg(0) int arg0) {
		this.method4876();
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "()Z")
	@Override
	public boolean method7995() {
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg1 * this.aClass17_Sub3_3.aFloat151 + (float) arg0 * this.aClass17_Sub3_3.aFloat148 + this.aClass17_Sub3_3.aFloat149 * (float) arg2 + this.aClass17_Sub3_3.aFloat150;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt5785 * (this.aClass17_Sub3_3.aFloat143 * (float) arg2 + this.aClass17_Sub3_3.aFloat145 * (float) arg0 + this.aClass17_Sub3_3.aFloat146 * (float) arg1 + this.aClass17_Sub3_3.aFloat147) / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat92);
		@Pc(119) int local119 = (int) (((float) arg2 * this.aClass17_Sub3_3.aFloat142 + (float) arg1 * this.aClass17_Sub3_3.aFloat140 + (float) arg0 * this.aClass17_Sub3_3.aFloat141 + this.aClass17_Sub3_3.aFloat144) * (float) this.anInt5781 / local28);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local119 - this.aFloat86);
	}

	@OriginalMember(owner = "client!lf", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass17_Sub3_3.aFloat150 + (float) arg2 * this.aClass17_Sub3_3.aFloat149 + (float) arg1 * this.aClass17_Sub3_3.aFloat151 + this.aClass17_Sub3_3.aFloat148 * (float) arg0;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg5 * this.aClass17_Sub3_3.aFloat149 + this.aClass17_Sub3_3.aFloat151 * (float) arg4 + (float) arg3 * this.aClass17_Sub3_3.aFloat148 + this.aClass17_Sub3_3.aFloat150;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt5782 && local63 < (float) this.anInt5782) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt5763 && (float) this.anInt5763 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass17_Sub3_3.aFloat147 + this.aClass17_Sub3_3.aFloat145 * (float) arg0 + this.aClass17_Sub3_3.aFloat146 * (float) arg1 + (float) arg2 * this.aClass17_Sub3_3.aFloat143) * (float) this.anInt5785 / local32);
		@Pc(167) int local167 = (int) ((this.aClass17_Sub3_3.aFloat147 + this.aClass17_Sub3_3.aFloat143 * (float) arg5 + this.aClass17_Sub3_3.aFloat146 * (float) arg4 + this.aClass17_Sub3_3.aFloat145 * (float) arg3) * (float) this.anInt5785 / local63);
		if ((float) local135 < this.aFloat92 && this.aFloat92 > (float) local167) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat96 && (float) local167 > this.aFloat96) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt5781 * (this.aClass17_Sub3_3.aFloat140 * (float) arg1 + (float) arg0 * this.aClass17_Sub3_3.aFloat141 + (float) arg2 * this.aClass17_Sub3_3.aFloat142 + this.aClass17_Sub3_3.aFloat144) / local32);
		@Pc(265) int local265 = (int) ((this.aClass17_Sub3_3.aFloat142 * (float) arg5 + this.aClass17_Sub3_3.aFloat140 * (float) arg4 + this.aClass17_Sub3_3.aFloat141 * (float) arg3 + this.aClass17_Sub3_3.aFloat144) * (float) this.anInt5781 / local63);
		if (this.aFloat86 > (float) local233 && (float) local265 < this.aFloat86) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat93 && (float) local265 > this.aFloat93) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(Z)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
	public void method4833(@OriginalArg(0) int arg0) {
		if (this.anInt5759 == arg0) {
			return;
		}
		@Pc(18) boolean local18;
		@Pc(22) byte local22;
		if (arg0 == 1) {
			local18 = true;
			local22 = 1;
		} else if (arg0 == 2) {
			local22 = 2;
			local18 = false;
		} else if (arg0 == 128) {
			local22 = 3;
			local18 = true;
		} else {
			local18 = false;
			local22 = 0;
		}
		if (!this.aBoolean365) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean365 = true;
		}
		if (this.aBoolean363 != local18) {
			if (local18) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean363 = local18;
		}
		if (local22 != this.anInt5757) {
			if (local22 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local22 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local22 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt5757 = local22;
		}
		this.anInt5759 = arg0;
		this.anInt5758 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(II)V")
	public synchronized void method4834(@OriginalArg(0) int arg0) {
		@Pc(11) Class3 local11 = new Class3();
		local11.aLong313 = (long) arg0;
		this.aClass302_35.method6613(local11);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(FFIF)V")
	private void method4835(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean375) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean375 = true;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "()Z")
	@Override
	public boolean method7996() {
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!vk;I)V")
	public void method4836(@OriginalArg(0) Interface25 arg0) {
		if (this.aBoolean370) {
			this.method4875(arg0);
			this.method4878(arg0);
		} else if (this.anInt5753 >= 0 && arg0 == this.anInterface25Array1[this.anInt5753]) {
			this.anInterface25Array1[this.anInt5753--] = null;
			arg0.method2974();
			if (this.anInt5753 >= 0) {
				this.anInterface25_2 = this.anInterface25_1 = this.anInterface25Array1[this.anInt5753];
				this.anInterface25_2.method2970();
			} else {
				this.anInterface25_2 = this.anInterface25_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIIILclient!vv;)V")
	public void method4837(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Interface27 arg2) {
		@Pc(7) int local7 = arg2.method7796();
		@Pc(14) int local14 = arg0 * this.method4856(local7);
		this.method4909(arg2);
		OpenGL.glDrawElements(4, arg1, local7, arg2.method7793() + (long) local14);
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(II)V")
	public synchronized void method4838(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub24 local12 = new Class3_Sub24(arg0);
		this.aClass302_33.method6613(local12);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BZ)V")
	public void method4839(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean367 != arg0) {
			this.aBoolean367 = arg0;
			this.method4858();
			this.anInt5758 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
	private void method4840() {
		@Pc(15) int local15;
		for (local15 = 0; local15 < this.anInt5773; local15++) {
			@Pc(22) Class3_Sub13 local22 = this.aClass3_Sub13Array2[local15];
			Static124.aFloatArray9[0] = (float) local22.method5958();
			@Pc(33) int local33 = local15 + 16386;
			Static124.aFloatArray9[1] = (float) local22.method5963();
			Static124.aFloatArray9[2] = (float) local22.method5960();
			Static124.aFloatArray9[3] = 1.0F;
			OpenGL.glLightfv(local33, 4611, Static124.aFloatArray9, 0);
			@Pc(60) int local60 = local22.method5957();
			@Pc(66) float local66 = local22.method5961() / 255.0F;
			Static124.aFloatArray9[0] = local66 * (float) (local60 >> 16 & 0xFF);
			Static124.aFloatArray9[2] = (float) (local60 & 0xFF) * local66;
			Static124.aFloatArray9[1] = local66 * (float) (local60 >> 8 & 0xFF);
			OpenGL.glLightfv(local33, 4609, Static124.aFloatArray9, 0);
			OpenGL.glLightf(local33, 4617, 1.0F / (float) (local22.method5962() * local22.method5962()));
			OpenGL.glEnable(local33);
		}
		while (this.anInt5768 > local15) {
			OpenGL.glDisable(local15 + 16386);
			local15++;
		}
		this.anInt5768 = this.anInt5773;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZZ)V")
	public void method4841(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean362 != arg0) {
			this.aBoolean362 = arg0;
			this.method4898();
			this.anInt5758 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JZ)V")
	public synchronized void method4842(@OriginalArg(0) long arg0) {
		@Pc(13) Class3 local13 = new Class3();
		local13.aLong313 = arg0;
		this.aClass302_36.method6613(local13);
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(Z)V")
	private void method4843() {
		this.aFloatArray35[10] = this.aFloat95;
		this.aFloatArray35[14] = this.aFloat87;
		this.aFloat82 = (float) this.anInt5763;
		this.aFloat90 = (this.aFloatArray35[14] - (float) this.anInt5763) / this.aFloatArray35[10];
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		this.method4861();
		this.method4833(1);
		@Pc(25) float local25 = (float) arg2 - (float) arg0;
		@Pc(32) float local32 = (float) -arg1 + (float) arg3;
		@Pc(45) float local45 = (float) (1.0D / Math.sqrt((double) (local25 * local25 + local32 * local32)));
		@Pc(51) int local51 = arg7 % (arg6 + arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(70) float local70 = local32 * local45;
		@Pc(74) float local74 = local25 * local45;
		@Pc(79) float local79 = local74 * (float) arg5;
		@Pc(84) float local84 = (float) arg5 * local70;
		@Pc(86) float local86 = 0.0F;
		@Pc(88) float local88 = 0.0F;
		@Pc(90) float local90 = local79;
		@Pc(92) float local92 = local84;
		if (local51 <= arg5) {
			local92 = local70 * (float) (arg5 - local51);
			local90 = (float) (arg5 - local51) * local74;
		} else {
			local86 = (float) (arg5 + arg6 - local51) * local74;
			local88 = (float) (arg6 + arg5 - local51) * local70;
		}
		@Pc(144) float local144 = local86 + (float) arg0 + 0.35F;
		@Pc(151) float local151 = (float) arg1 + local88 + 0.35F;
		@Pc(156) float local156 = (float) arg6 * local74;
		@Pc(161) float local161 = (float) arg6 * local70;
		while (true) {
			if (arg0 >= arg2) {
				if ((float) arg2 + 0.35F > local144) {
					break;
				}
				if ((float) arg2 > local90 + local144) {
					local90 = (float) arg2 - local144;
				}
			} else {
				if ((float) arg2 + 0.35F < local144) {
					break;
				}
				if (local144 + local90 > (float) arg2) {
					local90 = (float) arg2 - local144;
				}
			}
			if (arg3 <= arg1) {
				if ((float) arg3 + 0.35F > local151) {
					break;
				}
				if (local151 + local92 < (float) arg3) {
					local92 = (float) arg3 - local151;
				}
			} else {
				if (local151 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local151 + local92) {
					local92 = (float) arg3 - local151;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local144, local151);
			OpenGL.glVertex2f(local144 + local90, local92 + local151);
			OpenGL.glEnd();
			local151 += local161 + local92;
			local144 += local156 + local90;
			local92 = local84;
			local90 = local79;
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
	public void method4844() {
		if (this.anInt5771 != 0) {
			this.anInt5758 &= 0xFFFFFFE0;
			this.anInt5771 = 0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	private void method4845() {
		if (this.anInt5771 != 3) {
			this.anInt5771 = 3;
			this.method4854();
			this.method4880();
			this.anInt5758 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!lf", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass17_Sub3_3.aFloat150 + (float) arg2 * this.aClass17_Sub3_3.aFloat149 + this.aClass17_Sub3_3.aFloat151 * (float) arg1 + (float) arg0 * this.aClass17_Sub3_3.aFloat148;
		if ((float) this.anInt5782 > local28 || local28 > (float) this.anInt5763) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((this.aClass17_Sub3_3.aFloat147 + (float) arg2 * this.aClass17_Sub3_3.aFloat143 + (float) arg1 * this.aClass17_Sub3_3.aFloat146 + (float) arg0 * this.aClass17_Sub3_3.aFloat145) * (float) this.anInt5785 / (float) arg3);
		@Pc(119) int local119 = (int) ((this.aClass17_Sub3_3.aFloat144 + this.aClass17_Sub3_3.aFloat141 * (float) arg0 + this.aClass17_Sub3_3.aFloat140 * (float) arg1 + this.aClass17_Sub3_3.aFloat142 * (float) arg2) * (float) this.anInt5781 / (float) arg3);
		if (this.aFloat92 <= (float) local86 && (float) local86 <= this.aFloat96 && this.aFloat86 <= (float) local119 && (float) local119 <= this.aFloat93) {
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local119 - this.aFloat86);
			arg4[0] = (int) ((float) local86 - this.aFloat92);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "()Z")
	@Override
	public boolean method8059() {
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt5782;
	}

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "()V")
	@Override
	public void method8058() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt5786;
		arg0[2] = this.anInt5778;
		arg0[0] = this.anInt5790;
		arg0[1] = this.anInt5776;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(Z)Lclient!iv;")
	public Class10_Sub3 method4846() {
		return this.aClass57_Sub2_1 == null ? null : this.aClass57_Sub2_1.method8388();
	}

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "()Z")
	@Override
	public boolean method8016() {
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8073(@OriginalArg(0) Canvas arg0) {
		this.aLong157 = 0L;
		this.aCanvas7 = null;
		if (arg0 == null || arg0 == this.aCanvas6) {
			this.aCanvas7 = this.aCanvas6;
			this.aLong157 = this.aLong158;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable7.get(arg0);
			this.aLong157 = local36;
			this.aCanvas7 = arg0;
		}
		if (this.aCanvas7 == null || this.aLong157 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong157);
		this.method4913();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIZ[BI)Lclient!ot;")
	public Interface21 method4847(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		return (Interface21) (this.aBoolean373 && (!arg1 || this.aBoolean372) ? new Class75_Sub2(this, arg3, arg2, arg0, arg1) : new Class167_Sub1(this, arg3, arg2, arg0));
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)V")
	public void method4849(@OriginalArg(1) int arg0) {
		this.method4897(true, arg0);
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(IIII)V")
	public void method4850(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(I)V")
	private void method4851() {
		if (this.anInt5778 >= this.anInt5790 && this.anInt5776 <= this.anInt5786) {
			OpenGL.glScissor(this.anInt5790 + this.anInt5761, this.anInt5669 + this.anInt5775 + -this.anInt5786, this.anInt5778 - this.anInt5790, this.anInt5786 + -this.anInt5776);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(Z)V")
	private void method4852() {
		@Pc(6) float[] local6 = this.aFloatArray35;
		@Pc(18) float local18 = (float) (this.anInt5782 * -this.anInt5784) / (float) this.anInt5785;
		@Pc(33) float local33 = (float) ((this.anInt5708 - this.anInt5784) * this.anInt5782) / (float) this.anInt5785;
		@Pc(44) float local44 = (float) (this.anInt5782 * this.anInt5772) / (float) this.anInt5781;
		@Pc(59) float local59 = (float) ((this.anInt5772 - this.anInt5669) * this.anInt5782) / (float) this.anInt5781;
		if (local33 == local18 || local44 == local59) {
			local6[7] = 0.0F;
			local6[4] = 0.0F;
			local6[2] = 0.0F;
			local6[8] = 0.0F;
			local6[0] = 1.0F;
			local6[6] = 0.0F;
			local6[12] = 0.0F;
			local6[15] = 1.0F;
			local6[3] = 0.0F;
			local6[11] = 0.0F;
			local6[13] = 0.0F;
			local6[9] = 0.0F;
			local6[1] = 0.0F;
			local6[5] = 1.0F;
			local6[14] = 0.0F;
			local6[10] = 1.0F;
		} else {
			@Pc(139) float local139 = (float) this.anInt5782 * 2.0F;
			local6[4] = 0.0F;
			local6[5] = local139 / (local44 - local59);
			local6[1] = 0.0F;
			local6[6] = 0.0F;
			local6[0] = local139 / (local33 - local18);
			local6[15] = 0.0F;
			local6[11] = -1.0F;
			local6[2] = 0.0F;
			local6[7] = 0.0F;
			local6[10] = this.aFloat95 = (float) -(this.anInt5782 + this.anInt5763) / (float) (this.anInt5763 - this.anInt5782);
			local6[13] = 0.0F;
			local6[14] = this.aFloat87 = -(local139 * (float) this.anInt5763) / (float) (this.anInt5763 - this.anInt5782);
			local6[9] = (local59 + local44) / (-local59 + local44);
			local6[8] = (local33 + local18) / (local33 - local18);
			local6[12] = 0.0F;
			local6[3] = 0.0F;
		}
		this.method4843();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4861();
		this.method4833(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 - (float) arg1;
		if (local17 == 0.0F && local23 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(44) float local44 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local23 * local23)));
			local17 *= local44;
			local23 *= local44;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local17 + 0.35F, local23 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "(I)V")
	private void method4853() {
		this.aFloat83 = (float) (this.anInt5763 - this.anInt5767) - this.aFloat94;
		this.aFloat88 = this.aFloat83 - (float) this.anInt5780 * this.aFloat100;
		if (this.aFloat88 < (float) this.anInt5782) {
			this.aFloat88 = (float) this.anInt5782;
		}
		OpenGL.glFogf(2915, this.aFloat88);
		OpenGL.glFogf(2916, this.aFloat83);
		Static172.aFloatArray20[2] = (float) (this.anInt5791 & 0xFF) / 255.0F;
		Static172.aFloatArray20[0] = (float) (this.anInt5791 & 0xFF0000) / 1.671168E7F;
		Static172.aFloatArray20[1] = (float) (this.anInt5791 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static172.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "(I)V")
	private void method4854() {
		@Pc(15) float local15 = (float) -this.anInt5784 * this.aFloat98 / (float) this.anInt5785;
		@Pc(34) float local34 = (float) -this.anInt5772 * this.aFloat98 / (float) this.anInt5781;
		@Pc(49) float local49 = this.aFloat98 * (float) (this.anInt5708 - this.anInt5784) / (float) this.anInt5785;
		@Pc(64) float local64 = this.aFloat98 * (float) (this.anInt5669 - this.anInt5772) / (float) this.anInt5781;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local49 != local15 && local34 != local64) {
			OpenGL.glOrtho((double) local15, (double) local49, (double) -local64, (double) -local34, (double) this.anInt5782, (double) this.anInt5763);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!vk;)V")
	public void method4855(@OriginalArg(1) Interface25 arg0) {
		if (this.anInt5754 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5754 >= 0) {
			this.anInterface25Array2[this.anInt5754].method2975();
		}
		this.anInterface25_2 = this.anInterface25Array2[++this.anInt5754] = arg0;
		this.anInterface25_2.method2971();
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IB)I")
	public int method4856(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!lf", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4841(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!lf", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method4833(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "(I)V")
	private void method4857() {
		this.aClass10Array1 = new Class10[this.anInt5764];
		this.aClass10_Sub2_2 = new Class10_Sub2(this, 3553, 6408, 1, 1);
		new Class10_Sub2(this, 3553, 6408, 1, 1);
		new Class10_Sub2(this, 3553, 6408, 1, 1);
		this.aClass149_Sub2_2 = new Class149_Sub2(this);
		this.aClass149_Sub2_5 = new Class149_Sub2(this);
		this.aClass149_Sub2_10 = new Class149_Sub2(this);
		this.aClass149_Sub2_4 = new Class149_Sub2(this);
		this.aClass149_Sub2_6 = new Class149_Sub2(this);
		this.aClass149_Sub2_7 = new Class149_Sub2(this);
		this.aClass149_Sub2_9 = new Class149_Sub2(this);
		this.aClass149_Sub2_3 = new Class149_Sub2(this);
		this.aClass149_Sub2_8 = new Class149_Sub2(this);
		this.aClass149_Sub2_1 = new Class149_Sub2(this);
		if (this.aBoolean392) {
			this.aClass127_5 = new Class127(this);
			new Class127(this);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[Lclient!uaa;)V")
	@Override
	public void method8018(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub13[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass3_Sub13Array2[local3] = arg1[local3];
		}
		this.anInt5773 = arg0;
		if (this.anInt5771 != 1) {
			this.method4840();
		}
	}

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "()Lclient!al;")
	@Override
	public Class17 method8013() {
		return this.aClass17_Sub3_1;
	}

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "()Z")
	@Override
	public boolean method8017() {
		return this.aBoolean383 && (!this.method8011() || this.aBoolean387);
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)I")
	@Override
	public int method8012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "(I)V")
	private void method4858() {
		if (this.aBoolean367 && this.anInt5780 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "()Lclient!al;")
	@Override
	public Class17 method7992() {
		return this.aClass17_Sub3_3;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([IIIIIZ)Lclient!hh;")
	@Override
	public Class6 method8005(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class6_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(II)I")
	public int method4859(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V")
	public void method4860() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray33, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray34, 0);
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	@Override
	public void method8029(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "(I)V")
	private void method4861() {
		if (this.anInt5758 == 1) {
			return;
		}
		this.method4907();
		this.method4839(false);
		this.method4908(false);
		this.method4862(false);
		this.method4841(false);
		this.method4864((Class10) null);
		this.method4849(-2);
		this.method4870(1);
		this.anInt5758 = 1;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(BZ)V")
	public void method4862(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean364 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt5758 &= 0xFFFFFFE0;
		this.aBoolean364 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!vk;B)V")
	public void method4863(@OriginalArg(0) Interface25 arg0) {
		if (this.aBoolean370) {
			this.method4855(arg0);
			this.method4905(arg0);
		} else if (this.anInt5753 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt5753 >= 0) {
				this.anInterface25Array1[this.anInt5753].method2974();
			}
			this.anInterface25_2 = this.anInterface25_1 = this.anInterface25Array1[++this.anInt5753] = arg0;
			this.anInterface25_2.method2970();
		}
	}

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(41) float local41;
		if (this.aClass10_Sub2_Sub1_5 == null || this.aClass10_Sub2_Sub1_5.anInt3349 < arg2 || arg3 > this.aClass10_Sub2_Sub1_5.anInt3354) {
			this.aClass10_Sub2_Sub1_5 = Static259.method3886(arg2, arg6, arg3, this);
			this.aClass10_Sub2_Sub1_5.method2859(false, false);
			local41 = this.aClass10_Sub2_Sub1_5.aFloat58;
			local45 = this.aClass10_Sub2_Sub1_5.aFloat59;
		} else {
			this.aClass10_Sub2_Sub1_5.method2858(arg6, 6406, false, arg3, arg2);
			local41 = (float) arg2 * this.aClass10_Sub2_Sub1_5.aFloat58 / (float) this.aClass10_Sub2_Sub1_5.anInt3349;
			local45 = this.aClass10_Sub2_Sub1_5.aFloat59 * (float) arg3 / (float) this.aClass10_Sub2_Sub1_5.anInt3354;
		}
		this.method4867();
		this.method4864(this.aClass10_Sub2_Sub1_5);
		this.method4833(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4893(arg5);
		this.method4899(34165, 34165);
		this.method4869(34166, 0, 768);
		this.method4869(5890, 2, 770);
		this.method4850(0, 34166);
		this.method4850(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = local150 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local45, local41);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method4869(5890, 0, 768);
		this.method4869(34166, 2, 770);
		this.method4850(0, 5890);
		this.method4850(2, 34166);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!cj;Lclient!cj;FLclient!cj;)Lclient!cj;")
	@Override
	public Class57 method8055(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class57 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean382 && this.aBoolean392) {
			@Pc(15) Class57_Sub2_Sub2 local15 = null;
			@Pc(18) Class57_Sub2 local18 = (Class57_Sub2) arg0;
			@Pc(21) Class57_Sub2 local21 = (Class57_Sub2) arg1;
			@Pc(25) Class10_Sub3 local25 = local18.method8388();
			@Pc(29) Class10_Sub3 local29 = local21.method8388();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local29.anInt4633 < local25.anInt4633 ? local25.anInt4633 : local29.anInt4633;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class57_Sub2_Sub2) {
					@Pc(60) Class57_Sub2_Sub2 local60 = (Class57_Sub2_Sub2) arg3;
					if (local60.method8390() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class57_Sub2_Sub2(this, local48);
				}
				if (local15.method8391(local29, local25, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass17_Sub3_3.aFloat150 + this.aClass17_Sub3_3.aFloat149 * (float) arg2 + this.aClass17_Sub3_3.aFloat151 * (float) arg1 + (float) arg0 * this.aClass17_Sub3_3.aFloat148;
		@Pc(55) float local55 = this.aClass17_Sub3_3.aFloat149 * (float) arg5 + this.aClass17_Sub3_3.aFloat151 * (float) arg4 + this.aClass17_Sub3_3.aFloat148 * (float) arg3 + this.aClass17_Sub3_3.aFloat150;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt5782 && (float) this.anInt5782 > local55) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt5763 && (float) this.anInt5763 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt5785 * (this.aClass17_Sub3_3.aFloat146 * (float) arg1 + this.aClass17_Sub3_3.aFloat145 * (float) arg0 + this.aClass17_Sub3_3.aFloat143 * (float) arg2 + this.aClass17_Sub3_3.aFloat147) / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt5785 * (this.aClass17_Sub3_3.aFloat147 + this.aClass17_Sub3_3.aFloat143 * (float) arg5 + (float) arg3 * this.aClass17_Sub3_3.aFloat145 + (float) arg4 * this.aClass17_Sub3_3.aFloat146) / (float) arg6);
		if ((float) local124 < this.aFloat92 && this.aFloat92 > (float) local157) {
			local57 |= 0x1;
		} else if ((float) local124 > this.aFloat96 && this.aFloat96 < (float) local157) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt5781 * (this.aClass17_Sub3_3.aFloat144 + this.aClass17_Sub3_3.aFloat140 * (float) arg1 + this.aClass17_Sub3_3.aFloat141 * (float) arg0 + this.aClass17_Sub3_3.aFloat142 * (float) arg2) / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt5781 * (this.aClass17_Sub3_3.aFloat144 + this.aClass17_Sub3_3.aFloat140 * (float) arg4 + this.aClass17_Sub3_3.aFloat141 * (float) arg3 + this.aClass17_Sub3_3.aFloat142 * (float) arg5) / (float) arg6);
		if ((float) local224 < this.aFloat86 && (float) local257 < this.aFloat86) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat93 && this.aFloat93 < (float) local257) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!ru;)V")
	public void method4864(@OriginalArg(1) Class10 arg0) {
		@Pc(17) Class10 local17 = this.aClass10Array1[this.anInt5769];
		if (arg0 != local17) {
			if (arg0 == null) {
				OpenGL.glDisable(local17.anInt7252);
			} else {
				if (local17 == null) {
					OpenGL.glEnable(arg0.anInt7252);
				} else if (local17.anInt7252 != arg0.anInt7252) {
					OpenGL.glDisable(local17.anInt7252);
					OpenGL.glEnable(arg0.anInt7252);
				}
				OpenGL.glBindTexture(arg0.anInt7252, arg0.method6099());
			}
			this.aClass10Array1[this.anInt5769] = arg0;
		}
		this.anInt5758 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!lf", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean389) {
			throw new RuntimeException("");
		}
		this.anInt5765 = arg1;
		this.anInt5787 = arg3;
		this.anInt5779 = arg0;
		this.anInt5770 = arg2;
		if (this.aBoolean386) {
			this.aClass280_1.aClass22_Sub7_1.method6595();
			this.aClass280_1.aClass22_Sub7_1.method6596();
		}
	}

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "()Z")
	@Override
	public boolean method8061() {
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "(I)V")
	private void method4865() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray35, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "(I)V")
	private void method4866() {
		if (this.aBoolean375) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean375 = false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!gl;IIII)Lclient!ka;")
	@Override
	public Class149 method8021(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class149_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		@Pc(19) Class1_Sub1 local19 = (Class1_Sub1) arg5;
		@Pc(22) Class10_Sub2_Sub1 local22 = local19.aClass10_Sub2_Sub1_1;
		this.method4867();
		this.method4864(local19.aClass10_Sub2_Sub1_1);
		this.method4833(1);
		this.method4899(7681, 8448);
		this.method4869(34167, 0, 768);
		@Pc(52) float local52 = local22.aFloat58 / (float) local22.anInt3366;
		@Pc(59) float local59 = local22.aFloat59 / (float) local22.anInt3361;
		@Pc(65) float local65 = (float) arg2 - (float) arg0;
		@Pc(71) float local71 = (float) arg3 - (float) arg1;
		@Pc(84) float local84 = (float) (1.0D / Math.sqrt((double) (local71 * local71 + local65 * local65)));
		@Pc(91) int local91 = arg10 % (arg9 + arg8);
		@Pc(95) float local95 = local71 * local84;
		@Pc(99) float local99 = local65 * local84;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(119) float local119 = (float) arg8 * local99;
		@Pc(124) float local124 = (float) arg8 * local95;
		@Pc(126) float local126 = 0.0F;
		@Pc(128) float local128 = 0.0F;
		@Pc(130) float local130 = local119;
		@Pc(132) float local132 = local124;
		if (local91 <= arg8) {
			local132 = (float) (arg8 - local91) * local95;
			local130 = local99 * (float) (arg8 - local91);
		} else {
			local126 = local99 * (float) (arg8 + arg9 - local91);
			local128 = (float) (arg9 + arg8 - local91) * local95;
		}
		@Pc(182) float local182 = (float) arg0 + local126 + 0.35F;
		@Pc(189) float local189 = local128 + (float) arg1 + 0.35F;
		@Pc(194) float local194 = (float) arg9 * local99;
		@Pc(199) float local199 = local95 * (float) arg9;
		while (true) {
			if (arg2 <= arg0) {
				if (local182 < (float) arg2 + 0.35F) {
					break;
				}
				if (local130 + local182 < (float) arg2) {
					local130 = (float) arg2 - local182;
				}
			} else {
				if (local182 > (float) arg2 + 0.35F) {
					break;
				}
				if (local182 + local130 > (float) arg2) {
					local130 = (float) arg2 - local182;
				}
			}
			if (arg1 < arg3) {
				if ((float) arg3 + 0.35F < local189) {
					break;
				}
				if ((float) arg3 < local132 + local189) {
					local132 = (float) arg3 - local189;
				}
			} else {
				if ((float) arg3 + 0.35F > local189) {
					break;
				}
				if (local189 + local132 < (float) arg3) {
					local132 = (float) arg3 - local189;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f((local182 - (float) arg6) * local52, (local189 - (float) arg7) * local59);
			OpenGL.glVertex2f(local182, local189);
			OpenGL.glTexCoord2f(local52 * ((float) -arg6 + local182 + local130), (local189 + local132 - (float) arg7) * local59);
			OpenGL.glVertex2f(local130 + local182, local132 + local189);
			OpenGL.glEnd();
			local182 += local130 + local194;
			local189 += local199 + local132;
			local132 = local124;
			local130 = local119;
		}
		this.method4869(5890, 0, 768);
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "()Z")
	@Override
	public boolean method7999() {
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt5763;
	}

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "(I)V")
	public void method4867() {
		if (this.anInt5758 == 2) {
			return;
		}
		this.method4907();
		this.method4839(false);
		this.method4908(false);
		this.method4862(false);
		this.method4841(false);
		this.method4849(-2);
		this.anInt5758 = 2;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8067(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas6 == arg0) {
			local5 = this.aLong158;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable7.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas7 == arg0) {
			this.method4913();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg5;
		@Pc(9) Class10_Sub2_Sub1 local9 = local6.aClass10_Sub2_Sub1_1;
		this.method4867();
		this.method4864(local6.aClass10_Sub2_Sub1_1);
		this.method4833(1);
		this.method4899(7681, 8448);
		this.method4869(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat58 / (float) local9.anInt3366;
		@Pc(46) float local46 = local9.aFloat59 / (float) local9.anInt3361;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local52 * local52)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(91) float local91 = local52 * local72;
		@Pc(95) float local95 = local59 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local91 + 0.35F, (float) arg3 + local95 + 0.35F);
		OpenGL.glEnd();
		this.method4869(5890, 0, 768);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!cj;)V")
	@Override
	public void method7989(@OriginalArg(0) Class57 arg0) {
		this.aClass57_Sub2_1 = (Class57_Sub2) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt5774;
		if (local15 || arg1 != this.aFloat102 || this.aFloat91 != arg2) {
			this.aFloat102 = arg1;
			this.aFloat91 = arg2;
			this.anInt5774 = arg0;
			if (local15) {
				this.aFloat99 = (float) (this.anInt5774 & 0xFF) / 255.0F;
				this.aFloat85 = (float) (this.anInt5774 & 0xFF00) / 65280.0F;
				this.aFloat101 = (float) (this.anInt5774 & 0xFF0000) / 1.671168E7F;
				this.method4831();
			}
			this.method4883();
		}
		if (arg3 == this.aFloatArray36[0] && this.aFloatArray36[1] == arg4 && arg5 == this.aFloatArray36[2]) {
			return;
		}
		this.aFloatArray36[0] = arg3;
		this.aFloatArray36[1] = arg4;
		this.aFloatArray36[2] = arg5;
		this.aFloatArray37[1] = -arg4;
		this.aFloatArray37[0] = -arg3;
		this.aFloatArray37[2] = -arg5;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray33[2] = arg5 * local142;
		this.aFloatArray33[1] = arg4 * local142;
		this.aFloatArray33[0] = arg3 * local142;
		this.aFloatArray34[2] = -this.aFloatArray33[2];
		this.aFloatArray34[0] = -this.aFloatArray33[0];
		this.aFloatArray34[1] = -this.aFloatArray33[1];
		this.method4860();
		this.anInt5760 = (int) (arg3 * 256.0F / arg4);
		this.anInt5762 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!po;I)V")
	public void method4868(@OriginalArg(0) Class17_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method6245(), 0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	@Override
	public void method7991() {
	}

	@OriginalMember(owner = "client!lf", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5781 = arg3;
		this.anInt5784 = arg0;
		this.anInt5772 = arg1;
		this.anInt5785 = arg2;
		this.method4852();
		this.method4894();
		if (this.anInt5771 == 3) {
			this.method4854();
		} else if (this.anInt5771 == 2) {
			this.method4865();
			return;
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(IIII)V")
	public void method4869(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!tv;I)V")
	@Override
	public void method8051(@OriginalArg(0) Class347 arg0, @OriginalArg(1) int arg1) {
		this.aClass212_1.method4993(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	@Override
	public void method8009(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "(II)V")
	public void method4870(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method4899(7681, 7681);
		} else if (arg0 == 0) {
			this.method4899(8448, 8448);
		} else if (arg0 == 2) {
			this.method4899(34165, 7681);
		} else if (arg0 == 3) {
			this.method4899(260, 8448);
			return;
		} else if (arg0 == 4) {
			this.method4899(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!eb;[Lclient!vf;Z)Lclient!da;")
	@Override
	public Class67 method8032(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class370[] arg1) {
		return new Class67_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIF)Lclient!uaa;")
	@Override
	public Class3_Sub13 method8070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub13_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt5784, this.anInt5772, this.anInt5785, this.anInt5781 };
	}

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "()Z")
	@Override
	public boolean method8038() {
		if (this.aClass3_Sub36_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub36_Sub1_1.method5571()) {
			if (!this.aClass39_1.method1049(this.aClass3_Sub36_Sub1_1)) {
				return false;
			}
			this.aClass267_1.method5942();
		}
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "()V")
	@Override
	protected void method8014() {
		for (@Pc(10) Class3 local10 = this.aClass302_29.method6603(); local10 != null; local10 = this.aClass302_29.method6605()) {
			((Class3_Sub51_Sub1) local10).method8725();
		}
		if (this.aClass39_1 != null) {
			this.aClass39_1.method1043();
		}
		if (this.anOpenGL1 != null) {
			this.method4876();
			@Pc(40) Enumeration local40 = this.aHashtable7.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable7.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean361) {
			Static84.method1335(false, true);
			this.aBoolean361 = false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt5669 - arg1 - local12, arg2, 1, 32993, this.anInt5792, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(Z)V")
	private void method4871() {
		OpenGL.glViewport(this.anInt5761, this.anInt5775, this.anInt5708, this.anInt5669);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)Lclient!hh;")
	@Override
	public Class6 method8025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class6_Sub1(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static143.aFloat45 = arg2;
		Static479.aFloat187 = arg1;
		Static500.aFloat155 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "(I)V")
	private void method4872() {
		this.method4849(-2);
		for (@Pc(14) int local14 = this.anInt5764 - 1; local14 >= 0; local14--) {
			this.method4900(local14);
			this.method4864((Class10) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method4899(8448, 8448);
		this.method4869(34168, 2, 770);
		this.method4866();
		this.anInt5759 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt5757 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean363 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean365 = true;
		this.method4839(true);
		this.method4908(true);
		this.method4862(true);
		this.method4841(true);
		this.method4844();
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
		for (@Pc(127) int local127 = 0; local127 < 8; local127++) {
			@Pc(133) int local133 = local127 + 16384;
			OpenGL.glLightfv(local133, 4608, local125, 0);
			OpenGL.glLightf(local133, 4615, 0.0F);
			OpenGL.glLightf(local133, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt5774 = this.anInt5791 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(Z)V")
	public void method4873() {
		if (this.anInt5758 == 8) {
			return;
		}
		this.method4879();
		this.method4839(true);
		this.method4862(true);
		this.method4841(true);
		this.method4833(1);
		this.anInt5758 = 8;
	}

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4861();
		this.method4833(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(B)V")
	public void method4874() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Lclient!vk;I)V")
	public void method4875(@OriginalArg(0) Interface25 arg0) {
		if (this.anInt5754 < 0 || this.anInterface25Array2[this.anInt5754] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface25Array2[this.anInt5754--] = null;
		arg0.method2975();
		if (this.anInt5754 < 0) {
			this.anInterface25_2 = null;
		} else {
			this.anInterface25_2 = this.anInterface25Array2[this.anInt5754];
			this.anInterface25_2.method2971();
		}
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(B)V")
	private void method4876() {
		this.anOpenGL1.b();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZIZ)V")
	public void method4877(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt5777 != arg0 || this.aBoolean386 != this.aBoolean389) {
			@Pc(14) Class10_Sub2 local14 = null;
			@Pc(16) int local16 = 0;
			@Pc(18) byte local18 = 0;
			@Pc(20) int local20 = 0;
			@Pc(27) int local27 = this.aBoolean389 ? 3 : 0;
			if (arg0 < 0) {
				this.method4866();
			} else {
				local14 = this.aClass267_1.method5941(arg0);
				@Pc(41) Class250 local41 = super.anInterface2_12.method8330(arg0);
				if (local41.aByte95 == 0 && local41.aByte92 == 0) {
					this.method4866();
				} else {
					@Pc(64) int local64 = local41.aBoolean462 ? 64 : 128;
					@Pc(68) int local68 = local64 * 50;
					this.method4835((float) (this.anInt5751 % local68 * local41.aByte92) / (float) local68, 0.0F, (float) (local41.aByte95 * (this.anInt5751 % local68)) / (float) local68);
				}
				local16 = local41.anInt6669;
				if (!this.aBoolean389) {
					local20 = local41.anInt6670;
					local18 = local41.aByte97;
					local27 = local41.aByte93;
				}
			}
			this.aClass280_1.method6147(local20, arg1, local27, local18, arg2);
			if (!this.aClass280_1.method6145(local16, local14)) {
				this.method4864(local14);
				this.method4870(local16);
			}
			this.anInt5777 = arg0;
			this.aBoolean386 = this.aBoolean389;
		}
		this.anInt5758 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!vk;)V")
	public void method4878(@OriginalArg(1) Interface25 arg0) {
		if (this.anInt5752 < 0 || this.anInterface25Array3[this.anInt5752] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface25Array3[this.anInt5752--] = null;
		arg0.method2972();
		if (this.anInt5752 < 0) {
			this.anInterface25_1 = null;
		} else {
			this.anInterface25_1 = this.anInterface25Array3[this.anInt5752];
			this.anInterface25_1.method2973();
		}
	}

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "(I)V")
	private void method4879() {
		if (this.anInt5771 != 2) {
			this.anInt5771 = 2;
			this.method4865();
			this.method4880();
			this.anInt5758 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!al;)V")
	@Override
	public void method8037(@OriginalArg(0) Class17 arg0) {
		this.aClass17_Sub3_3.method6233(arg0);
		this.aClass17_Sub3_4.method6233(this.aClass17_Sub3_3);
		this.aClass17_Sub3_4.method6248();
		this.aClass17_Sub3_5.method6251(this.aClass17_Sub3_4);
		if (this.anInt5771 != 1) {
			this.method4880();
		}
	}

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "(I)V")
	private void method4880() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass17_Sub3_4.method6245(), 0);
		if (this.aBoolean386) {
			this.aClass280_1.aClass22_Sub7_1.method6595();
		}
		this.method4860();
		this.method4840();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Lclient!rr;")
	@Override
	public Interface23 method7987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub51 method8015(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub51_Sub1 local8 = new Class3_Sub51_Sub1(arg0);
		this.aClass302_29.method6613(local8);
		return local8;
	}

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "(I)V")
	public void method4881() {
		if (this.anInt5758 == 16) {
			return;
		}
		this.method4845();
		this.method4839(true);
		this.method4862(true);
		this.method4841(true);
		this.method4833(1);
		this.anInt5758 = 16;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!ot;)V")
	public void method4882(@OriginalArg(1) Interface21 arg0) {
		if (this.anInterface21_3 != arg0) {
			if (this.aBoolean373) {
				OpenGL.glBindBufferARB(34962, arg0.method8696());
			}
			this.anInterface21_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8065(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable7.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "()V")
	@Override
	public void method8027() {
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(B)V")
	private void method4883() {
		Static172.aFloatArray20[1] = this.aFloat102 * this.aFloat85;
		Static172.aFloatArray20[2] = this.aFloat102 * this.aFloat99;
		Static172.aFloatArray20[3] = 1.0F;
		Static172.aFloatArray20[0] = this.aFloat102 * this.aFloat101;
		OpenGL.glLightfv(16384, 4609, Static172.aFloatArray20, 0);
		Static172.aFloatArray20[2] = this.aFloat99 * -this.aFloat91;
		Static172.aFloatArray20[3] = 1.0F;
		Static172.aFloatArray20[0] = this.aFloat101 * -this.aFloat91;
		Static172.aFloatArray20[1] = -this.aFloat91 * this.aFloat85;
		OpenGL.glLightfv(16385, 4609, Static172.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!lf", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt5786 = this.anInt5669;
		this.anInt5776 = 0;
		this.anInt5778 = this.anInt5708;
		this.anInt5790 = 0;
		OpenGL.glDisable(3089);
		this.method4894();
	}

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "()V")
	@Override
	public void method8039() {
		if (this.aClass3_Sub36_Sub1_1 != null && this.aClass3_Sub36_Sub1_1.method5571()) {
			this.aClass39_1.method1040(this.aClass3_Sub36_Sub1_1);
			this.aClass267_1.method5942();
		}
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	@Override
	public void method8035(@OriginalArg(0) int arg0) {
		this.method4914();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass39_1.method1044(arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([BIZII)Lclient!vv;")
	public Interface27 method4884(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2) {
		return (Interface27) (this.aBoolean373 && (!arg1 || this.aBoolean372) ? new Class75_Sub1(this, 5123, arg0, arg2, arg1) : new Class167_Sub2(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "()Z")
	@Override
	public boolean method8001() {
		return false;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V")
	public void method4885(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean390) {
			this.aBoolean390 = arg0;
			this.method4901();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class35 method8044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class35_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(FFI)V")
	public void method4886(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat94 = arg0;
		this.aFloat100 = arg1;
		this.method4853();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static212.method3144(arg0, arg1, this, arg3, arg2);
	}

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5791 == arg0 && this.anInt5780 == arg1 && arg2 == this.anInt5767) {
			return;
		}
		this.anInt5791 = arg0;
		this.anInt5767 = arg2;
		this.anInt5780 = arg1;
		this.method4853();
		this.method4858();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)V")
	public synchronized void method4887(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub24 local8 = new Class3_Sub24(arg1);
		local8.aLong313 = (long) arg0;
		this.aClass302_34.method6613(local8);
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "()Z")
	@Override
	public boolean method8002() {
		return this.aClass280_1.method6149();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8048(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8010(arg2, arg3);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;IZB)Lclient!ot;")
	public Interface21 method4888(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2) {
		return (Interface21) (this.aBoolean373 ? new Class75_Sub2(this, arg2, arg1, arg0, false) : new Class167_Sub1(this, arg2, arg1));
	}

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "()V")
	@Override
	public void method8042() {
		if (this.aBoolean392) {
			if (this.aClass127_4 != this.anInterface25_1) {
				throw new RuntimeException();
			}
			this.aClass127_4.method2983(0);
			this.aClass127_4.method2983(8);
			this.method4836(this.aClass127_4);
		} else if (this.aBoolean371) {
			this.aClass6_Sub1_1.method5122(0, 0, this.anInt5708, this.anInt5669, 0, 0);
			this.anOpenGL1.setSurface(this.aLong157);
		} else {
			throw new RuntimeException("");
		}
		this.anInt5708 = this.anInt5581;
		this.aClass6_Sub1_1 = null;
		this.anInt5669 = this.anInt5718;
		this.method4844();
		this.method4871();
		this.la();
	}

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt5795;
		this.anInt5795 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIZ)Lclient!hh;")
	@Override
	public Class6 method7998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class6_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "(I)V")
	public void method4889() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
	public void method4890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5775 = arg1;
		this.anInt5761 = arg0;
		this.method4871();
		this.method4851();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(FB)V")
	public void method4891(@OriginalArg(0) float arg0) {
		if (this.aFloat98 != arg0) {
			this.aFloat98 = arg0;
			if (this.anInt5771 == 3) {
				this.method4854();
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8006() {
		this.method4861();
		this.method4833(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lf", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean389 = true;
		this.anInt5787 = arg3;
		this.anInt5765 = arg1;
		this.anInt5779 = arg0;
		this.anInt5770 = arg2;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIIIII)Lclient!cj;")
	@Override
	public Class57 method8043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean382 ? new Class57_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!po;)V")
	public void method4892(@OriginalArg(1) Class17_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method6245(), 0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!io;Lclient!rr;)Lclient!hg;")
	@Override
	public Interface10 method8004(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Interface23 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lf", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat84 != arg0) {
			this.aFloat84 = arg0;
			this.method4831();
		}
	}

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "(II)V")
	public void method4893(@OriginalArg(1) int arg0) {
		Static172.aFloatArray20[3] = (float) (arg0 >>> 24) / 255.0F;
		Static172.aFloatArray20[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static172.aFloatArray20[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static172.aFloatArray20[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static172.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "(I)V")
	private void method4894() {
		this.aFloat92 = (float) (this.anInt5790 - this.anInt5784);
		this.aFloat93 = (float) (this.anInt5786 - this.anInt5772);
		this.aFloat86 = (float) (this.anInt5776 - this.anInt5772);
		this.aFloat96 = (float) (this.anInt5778 - this.anInt5784);
	}

	@OriginalMember(owner = "client!lf", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method4861();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method4833(arg5);
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

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "(II)I")
	public int method4895(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method8024(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "()Z")
	@Override
	public boolean method8003() {
		return this.aClass3_Sub36_Sub1_1 != null && (this.anInt5748 <= 1 || this.aBoolean387);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IFFFF)V")
	public void method4896(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static172.aFloatArray20[0] = arg3;
		Static172.aFloatArray20[3] = arg2;
		Static172.aFloatArray20[1] = arg1;
		Static172.aFloatArray20[2] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static172.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZII)V")
	public void method4897(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method4877(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method8062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method4861();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method4833(arg5);
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

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(II)Lclient!io;")
	@Override
	public Interface12 method8030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "(I)V")
	private void method4898() {
		OpenGL.glDepthMask(this.aBoolean362 && this.aBoolean380);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)V")
	public void method4899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5769 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (this.anInt5766 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local17 = true;
			this.anInt5766 = arg0;
		}
		if (arg1 != this.anInt5789) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt5789 = arg1;
			local17 = true;
		}
		if (local17) {
			this.anInt5758 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "()Z")
	@Override
	public boolean method8033() {
		return false;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8031(@OriginalArg(0) Class3_Sub51 arg0) {
		this.aNativeHeap2 = ((Class3_Sub51_Sub1) arg0).aNativeHeap5;
		if (this.anInterface21_2 != null) {
			return;
		}
		@Pc(16) Class3_Sub4_Sub2 local16 = new Class3_Sub4_Sub2(80);
		if (this.aBoolean369) {
			local16.method7962(-1.0F);
			local16.method7962(-1.0F);
			local16.method7962(0.0F);
			local16.method7962(0.0F);
			local16.method7962(1.0F);
			local16.method7962(1.0F);
			local16.method7962(-1.0F);
			local16.method7962(0.0F);
			local16.method7962(1.0F);
			local16.method7962(1.0F);
			local16.method7962(1.0F);
			local16.method7962(1.0F);
			local16.method7962(0.0F);
			local16.method7962(1.0F);
			local16.method7962(0.0F);
			local16.method7962(-1.0F);
			local16.method7962(1.0F);
			local16.method7962(0.0F);
			local16.method7962(0.0F);
			local16.method7962(0.0F);
		} else {
			local16.method7963(-1.0F);
			local16.method7963(-1.0F);
			local16.method7963(0.0F);
			local16.method7963(0.0F);
			local16.method7963(1.0F);
			local16.method7963(1.0F);
			local16.method7963(-1.0F);
			local16.method7963(0.0F);
			local16.method7963(1.0F);
			local16.method7963(1.0F);
			local16.method7963(1.0F);
			local16.method7963(1.0F);
			local16.method7963(0.0F);
			local16.method7963(1.0F);
			local16.method7963(0.0F);
			local16.method7963(-1.0F);
			local16.method7963(1.0F);
			local16.method7963(0.0F);
			local16.method7963(0.0F);
			local16.method7963(0.0F);
		}
		this.anInterface21_2 = this.method4847(local16.anInt9739, false, local16.aByteArray90, 20);
		this.aClass364_6 = new Class364(this.anInterface21_2, 5126, 3, 0);
		this.aClass364_5 = new Class364(this.anInterface21_2, 5126, 2, 12);
		this.aClass212_1.method4996(this);
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
	@Override
	public void method8053(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt5745 = arg0;
		this.aClass267_1.method5942();
	}

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "(II)V")
	public void method4900(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt5769) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt5769 = arg0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(B)V")
	private void method4901() {
		if (this.aBoolean385 && !this.aBoolean390) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!lf", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt5790 || this.anInt5778 < arg0 - arg2 || arg2 + arg1 < this.anInt5776 || arg1 - arg2 > this.anInt5786) {
			return;
		}
		this.method4861();
		this.method4833(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(75) float local75 = (float) arg0 + 0.35F;
		@Pc(80) float local80 = (float) arg1 + 0.35F;
		@Pc(84) int local84 = arg2 << 1;
		if ((float) local84 < this.aFloat97) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local75 + 1.0F, local80 + 1.0F);
			OpenGL.glVertex2f(local75 + 1.0F, local80 - 1.0F);
			OpenGL.glVertex2f(local75 - 1.0F, local80 - 1.0F);
			OpenGL.glVertex2f(local75 - 1.0F, local80 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat89 >= (float) local84) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local84);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local75, local80);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local75, local80);
			@Pc(139) int local139 = 262144 / (arg2 * 6);
			if (local139 <= 64) {
				local139 = 64;
			} else if (local139 > 512) {
				local139 = 512;
			}
			local139 = Static324.method4617(local139);
			OpenGL.glVertex2f(local75 + (float) arg2, local80);
			for (@Pc(167) int local167 = 16384 - local139; local167 > 0; local167 -= local139) {
				OpenGL.glVertex2f(Class336.aFloatArray56[local167] * (float) arg2 + local75, local80 + Class336.aFloatArray57[local167] * (float) arg2);
			}
			OpenGL.glVertex2f((float) arg2 + local75, local80);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5782 == arg0 && this.anInt5763 == arg1) {
			return;
		}
		this.anInt5782 = arg0;
		this.anInt5763 = arg1;
		this.method4852();
		this.method4853();
		if (this.anInt5771 == 3) {
			this.method4854();
		} else if (this.anInt5771 == 2) {
			this.method4865();
			return;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([I)V")
	@Override
	public void method7994(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt5669;
		arg0[0] = this.anInt5708;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(II)I")
	@Override
	public int method8047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
	@Override
	public void method8010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ut;Lclient!ut;Lclient!ut;Lclient!ut;B)V")
	public void method4903(@OriginalArg(0) Class364 arg0, @OriginalArg(1) Class364 arg1, @OriginalArg(2) Class364 arg2, @OriginalArg(3) Class364 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method4882(arg1.anInterface21_6);
			OpenGL.glVertexPointer(arg1.aByte142, arg1.aShort108, this.anInterface21_3.method8695(), this.anInterface21_3.method8697() + (long) arg1.aByte141);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method4882(arg3.anInterface21_6);
			OpenGL.glNormalPointer(arg3.aShort108, this.anInterface21_3.method8695(), this.anInterface21_3.method8697() + (long) arg3.aByte141);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method4882(arg2.anInterface21_6);
			OpenGL.glColorPointer(arg2.aByte142, arg2.aShort108, this.anInterface21_3.method8695(), this.anInterface21_3.method8697() + (long) arg2.aByte141);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method4882(arg0.anInterface21_6);
			OpenGL.glTexCoordPointer(arg0.aByte142, arg0.aShort108, this.anInterface21_3.method8695(), this.anInterface21_3.method8697() + (long) arg0.aByte141);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!tv;)V")
	@Override
	public void method8057(@OriginalArg(0) Class347 arg0) {
		this.aClass212_1.method4993(this, arg0, -1);
	}

	@OriginalMember(owner = "client!lf", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt5708 < arg2) {
			arg2 = this.anInt5708;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt5669 < arg3) {
			arg3 = this.anInt5669;
		}
		this.anInt5790 = arg0;
		this.anInt5776 = arg1;
		this.anInt5778 = arg2;
		this.anInt5786 = arg3;
		OpenGL.glEnable(3089);
		this.method4894();
		this.method4851();
	}

	@OriginalMember(owner = "client!lf", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean389 = false;
	}

	@OriginalMember(owner = "client!lf", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass17_Sub3_3.aFloat150 + this.aClass17_Sub3_3.aFloat149 * (float) arg2 + this.aClass17_Sub3_3.aFloat148 * (float) arg0 + (float) arg1 * this.aClass17_Sub3_3.aFloat151;
		if ((float) this.anInt5782 > local28 || (float) this.anInt5763 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt5785 * (this.aClass17_Sub3_3.aFloat147 + this.aClass17_Sub3_3.aFloat143 * (float) arg2 + this.aClass17_Sub3_3.aFloat145 * (float) arg0 + this.aClass17_Sub3_3.aFloat146 * (float) arg1) / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt5781 * (this.aClass17_Sub3_3.aFloat144 + (float) arg0 * this.aClass17_Sub3_3.aFloat141 + (float) arg1 * this.aClass17_Sub3_3.aFloat140 + (float) arg2 * this.aClass17_Sub3_3.aFloat142) / local28);
		if (this.aFloat92 <= (float) local85 && (float) local85 <= this.aFloat96 && this.aFloat86 <= (float) local117 && this.aFloat93 >= (float) local117) {
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat86);
			arg3[0] = (int) ((float) local85 - this.aFloat92);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4861();
		this.method4833(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "()Lclient!al;")
	@Override
	public Class17 method8063() {
		return new Class17_Sub3();
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(ILclient!vk;)V")
	public void method4905(@OriginalArg(1) Interface25 arg0) {
		if (this.anInt5752 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5752 >= 0) {
			this.anInterface25Array3[this.anInt5752].method2972();
		}
		this.anInterface25_1 = this.anInterface25Array3[++this.anInt5752] = arg0;
		this.anInterface25_1.method2973();
	}

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "()I")
	@Override
	public int method8026() {
		return 4;
	}

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "()Lclient!dca;")
	@Override
	public Class72 method8064() {
		@Pc(7) int local7 = -1;
		if (this.aString73.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString73.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString73.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class72(local7, "OpenGL", this.anInt5783, this.aString74, 0L);
	}

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Class10_Sub2_Sub1 local9 = local6.aClass10_Sub2_Sub1_1;
		this.method4867();
		this.method4864(local6.aClass10_Sub2_Sub1_1);
		this.method4833(1);
		this.method4899(7681, 8448);
		this.method4869(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat58 / (float) local9.anInt3366;
		@Pc(46) float local46 = local9.aFloat59 / (float) local9.anInt3361;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5790 - arg2), local46 * (float) (this.anInt5776 - arg3));
		OpenGL.glVertex2i(this.anInt5790, this.anInt5776);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5790 - arg2), local46 * (float) (this.anInt5786 - arg3));
		OpenGL.glVertex2i(this.anInt5790, this.anInt5786);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5778 - arg2), local46 * (float) (this.anInt5786 - arg3));
		OpenGL.glVertex2i(this.anInt5778, this.anInt5786);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5778 - arg2), local46 * (float) (this.anInt5776 - arg3));
		OpenGL.glVertex2i(this.anInt5778, this.anInt5776);
		OpenGL.glEnd();
		this.method4869(5890, 0, 768);
	}

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "(I)V")
	private void method4907() {
		if (this.anInt5771 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt5708 > 0 && this.anInt5669 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt5708, (double) this.anInt5669, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt5771 = 1;
		this.anInt5758 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V")
	public void method4908(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean385) {
			this.aBoolean385 = arg0;
			this.method4901();
			this.anInt5758 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!vv;)V")
	public void method4909(@OriginalArg(1) Interface27 arg0) {
		if (this.anInterface27_1 != arg0) {
			if (this.aBoolean373) {
				OpenGL.glBindBufferARB(34963, arg0.method7794());
			}
			this.anInterface27_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "()Z")
	@Override
	public boolean method8011() {
		return this.aClass3_Sub36_Sub1_1 != null && this.aClass3_Sub36_Sub1_1.method5571();
	}

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean380 = arg0;
		this.method4898();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8028(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas6 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable7.containsKey(arg0)) {
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
			this.aHashtable7.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!vf;Z)Lclient!hh;")
	@Override
	public Class6 method8008(@OriginalArg(0) Class370 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt10491 * arg0.anInt10490];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray97 == null) {
			for (local21 = 0; local21 < arg0.anInt10490; local21++) {
				for (local25 = 0; local25 < arg0.anInt10491; local25++) {
					@Pc(38) int local38 = arg0.anIntArray556[arg0.aByteArray96[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt10490; local21++) {
				for (local25 = 0; local25 < arg0.anInt10491; local25++) {
					local12[local16++] = arg0.anIntArray556[arg0.aByteArray96[local14] & 0xFF] | arg0.aByteArray97[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(124) Class6 local124 = this.method7993(local12, arg0.anInt10491, arg0.anInt10490, arg0.anInt10491);
		local124.method5123(arg0.anInt10493, arg0.anInt10494, arg0.anInt10492, arg0.anInt10495);
		return local124;
	}

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "(I)I")
	private int method4910() {
		this.aString73 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString74 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString73.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString73.indexOf("brian paul") != -1 || this.aString73.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static120.method1814(local46.replace('.', ' '), ' ');
		if (local54.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(70) int local70 = Static505.method6599(local54[0]);
				@Pc(76) int local76 = Static505.method6599(local54[1]);
				this.anInt5783 = local76 + local70 * 10;
			} catch (@Pc(85) NumberFormatException local85) {
				local10 |= 0x4;
			}
		}
		if (this.anInt5783 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(121) int[] local121 = new int[1];
		OpenGL.glGetIntegerv(34018, local121, 0);
		this.anInt5764 = local121[0];
		OpenGL.glGetIntegerv(34929, local121, 0);
		this.anInt5793 = local121[0];
		OpenGL.glGetIntegerv(34930, local121, 0);
		this.anInt5788 = local121[0];
		if (this.anInt5764 < 2 || this.anInt5793 < 2 || this.anInt5788 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean369 = Stream.b();
		this.aBoolean371 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean373 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean383 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean388 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean366 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean378 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean376 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean384 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean382 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean381 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean377 = false;
		this.aBoolean392 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean370 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean379 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean387 = this.aBoolean370 & this.aBoolean379;
		this.aBoolean368 = Class171.aString60.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static172.aFloatArray20, 0);
		this.aFloat97 = Static172.aFloatArray20[0];
		this.aFloat89 = Static172.aFloatArray20[1];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "()V")
	@Override
	public void method8052() {
		this.aClass39_1.method1045();
	}

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "(I)V")
	public void method4911() {
		if (this.anInt5758 == 4) {
			return;
		}
		this.method4907();
		this.method4839(false);
		this.method4908(false);
		this.method4862(false);
		this.method4841(false);
		this.method4849(-2);
		this.method4833(1);
		this.anInt5758 = 4;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(III)V")
	public synchronized void method4912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub24 local8 = new Class3_Sub24(arg0);
		local8.aLong313 = (long) arg1;
		this.aClass302_32.method6613(local8);
	}

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "(I)V")
	private void method4913() {
		if (this.aCanvas7 == null) {
			this.anInt5581 = this.anInt5718 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas7.getSize();
			this.anInt5581 = local10.width;
			this.anInt5718 = local10.height;
		}
		if (this.anInterface25_1 == null) {
			this.anInt5708 = this.anInt5581;
			this.anInt5669 = this.anInt5718;
			this.method4871();
		}
		this.method4844();
		this.la();
	}

	@OriginalMember(owner = "client!lf", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt5794;
		this.anInt5794 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!hg;)V")
	@Override
	public void method8072(@OriginalArg(0) Interface10 arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8056(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class3_Sub24 local19;
		while (!this.aClass302_31.method6612()) {
			local19 = (Class3_Sub24) this.aClass302_31.method6611();
			Static502.anIntArray426[local7++] = (int) local19.aLong313;
			this.anInt5755 -= local19.anInt3846;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static502.anIntArray426, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static502.anIntArray426, 0);
			local7 = 0;
		}
		while (!this.aClass302_32.method6612()) {
			local19 = (Class3_Sub24) this.aClass302_32.method6611();
			Static502.anIntArray426[local7++] = (int) local19.aLong313;
			this.anInt5756 -= local19.anInt3846;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static502.anIntArray426, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static502.anIntArray426, 0);
			local7 = 0;
		}
		while (!this.aClass302_33.method6612()) {
			local19 = (Class3_Sub24) this.aClass302_33.method6611();
			Static502.anIntArray426[local7++] = local19.anInt3846;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static502.anIntArray426, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static502.anIntArray426, 0);
			local7 = 0;
		}
		while (!this.aClass302_34.method6612()) {
			local19 = (Class3_Sub24) this.aClass302_34.method6611();
			Static502.anIntArray426[local7++] = (int) local19.aLong313;
			this.bf -= local19.anInt3846;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static502.anIntArray426, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static502.anIntArray426, 0);
		}
		while (!this.aClass302_30.method6612()) {
			local19 = (Class3_Sub24) this.aClass302_30.method6611();
			OpenGL.glDeleteLists((int) local19.aLong313, local19.anInt3846);
		}
		@Pc(217) Class3 local217;
		while (!this.aClass302_35.method6612()) {
			local217 = this.aClass302_35.method6611();
			OpenGL.glDeleteProgramARB((int) local217.aLong313);
		}
		while (!this.aClass302_36.method6612()) {
			local217 = this.aClass302_36.method6611();
			OpenGL.glDeleteObjectARB(local217.aLong313);
		}
		while (!this.aClass302_30.method6612()) {
			local19 = (Class3_Sub24) this.aClass302_30.method6611();
			OpenGL.glDeleteLists((int) local19.aLong313, local19.anInt3846);
		}
		this.aClass267_1.method5943();
		if (this.E() > 100663296 && this.aLong159 + 60000L < Static15.method380()) {
			System.gc();
			this.aLong159 = Static15.method380();
		}
		this.anInt5751 = local11;
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "(Z)V")
	private void method4914() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL1.a()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static26.method592(1000L);
		}
	}
}
