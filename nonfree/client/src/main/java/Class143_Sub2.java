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

@OriginalClass("client!kv")
public final class Class143_Sub2 extends Class143 {

	@OriginalMember(owner = "client!kv", name = "Gc", descriptor = "I")
	public int anInt5737;

	@OriginalMember(owner = "client!kv", name = "Ic", descriptor = "I")
	private int anInt5739;

	@OriginalMember(owner = "client!kv", name = "vd", descriptor = "I")
	private int anInt5776;

	@OriginalMember(owner = "client!kv", name = "Nd", descriptor = "I")
	public int anInt5794;

	@OriginalMember(owner = "client!kv", name = "ve", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!kv", name = "ze", descriptor = "I")
	public int anInt5822;

	@OriginalMember(owner = "client!kv", name = "De", descriptor = "Lclient!vl;")
	private Interface26 anInterface26_1;

	@OriginalMember(owner = "client!kv", name = "Fe", descriptor = "Lclient!vl;")
	private Interface26 anInterface26_2;

	@OriginalMember(owner = "client!kv", name = "Je", descriptor = "Lclient!qf;")
	private Class59_Sub2 aClass59_Sub2_1;

	@OriginalMember(owner = "client!kv", name = "Le", descriptor = "Lclient!sca;")
	private Class318 aClass318_6;

	@OriginalMember(owner = "client!kv", name = "Ne", descriptor = "I")
	public int anInt5827;

	@OriginalMember(owner = "client!kv", name = "Oe", descriptor = "I")
	private int anInt5828;

	@OriginalMember(owner = "client!kv", name = "Pe", descriptor = "I")
	public int anInt5829;

	@OriginalMember(owner = "client!kv", name = "We", descriptor = "Z")
	private boolean aBoolean400;

	@OriginalMember(owner = "client!kv", name = "Xe", descriptor = "I")
	private int anInt5830;

	@OriginalMember(owner = "client!kv", name = "Ze", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!kv", name = "af", descriptor = "Z")
	private boolean aBoolean401;

	@OriginalMember(owner = "client!kv", name = "bf", descriptor = "Z")
	private boolean bf;

	@OriginalMember(owner = "client!kv", name = "cf", descriptor = "Z")
	private boolean aBoolean402;

	@OriginalMember(owner = "client!kv", name = "df", descriptor = "I")
	private int anInt5831;

	@OriginalMember(owner = "client!kv", name = "ef", descriptor = "I")
	private int anInt5832;

	@OriginalMember(owner = "client!kv", name = "hf", descriptor = "Lclient!ic;")
	private Interface8 anInterface8_4;

	@OriginalMember(owner = "client!kv", name = "mf", descriptor = "I")
	public int anInt5834;

	@OriginalMember(owner = "client!kv", name = "of", descriptor = "Z")
	private boolean aBoolean404;

	@OriginalMember(owner = "client!kv", name = "pf", descriptor = "Lclient!wv;")
	public Class114_Sub3 aClass114_Sub3_1;

	@OriginalMember(owner = "client!kv", name = "rf", descriptor = "Ljava/lang/String;")
	private String aString55;

	@OriginalMember(owner = "client!kv", name = "sf", descriptor = "Lclient!bp;")
	private Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!kv", name = "uf", descriptor = "I")
	private int anInt5836;

	@OriginalMember(owner = "client!kv", name = "vf", descriptor = "Z")
	private boolean aBoolean405;

	@OriginalMember(owner = "client!kv", name = "xf", descriptor = "[Lclient!fia;")
	private Class44[] aClass44Array1;

	@OriginalMember(owner = "client!kv", name = "yf", descriptor = "Lclient!sca;")
	public Class318 aClass318_7;

	@OriginalMember(owner = "client!kv", name = "zf", descriptor = "Z")
	public boolean aBoolean406;

	@OriginalMember(owner = "client!kv", name = "Af", descriptor = "I")
	private int anInt5837;

	@OriginalMember(owner = "client!kv", name = "Df", descriptor = "Lclient!kb;")
	public Class194 aClass194_7;

	@OriginalMember(owner = "client!kv", name = "Ef", descriptor = "I")
	private int anInt5839;

	@OriginalMember(owner = "client!kv", name = "Ff", descriptor = "I")
	private int anInt5840;

	@OriginalMember(owner = "client!kv", name = "Gf", descriptor = "F")
	private float aFloat99;

	@OriginalMember(owner = "client!kv", name = "Hf", descriptor = "Z")
	private boolean aBoolean407;

	@OriginalMember(owner = "client!kv", name = "Kf", descriptor = "I")
	public int anInt5843;

	@OriginalMember(owner = "client!kv", name = "Lf", descriptor = "Z")
	public boolean aBoolean408;

	@OriginalMember(owner = "client!kv", name = "Qf", descriptor = "Lclient!ho;")
	public Class44_Sub1 aClass44_Sub1_6;

	@OriginalMember(owner = "client!kv", name = "Rf", descriptor = "Z")
	private boolean aBoolean409;

	@OriginalMember(owner = "client!kv", name = "Tf", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!kv", name = "Uf", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!kv", name = "ag", descriptor = "F")
	private float aFloat104;

	@OriginalMember(owner = "client!kv", name = "bg", descriptor = "Z")
	public boolean aBoolean412;

	@OriginalMember(owner = "client!kv", name = "cg", descriptor = "Lclient!mda;")
	private Interface15 anInterface15_3;

	@OriginalMember(owner = "client!kv", name = "dg", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!kv", name = "hg", descriptor = "I")
	private int anInt5847;

	@OriginalMember(owner = "client!kv", name = "lg", descriptor = "I")
	private int anInt5849;

	@OriginalMember(owner = "client!kv", name = "ng", descriptor = "Z")
	public boolean aBoolean416;

	@OriginalMember(owner = "client!kv", name = "og", descriptor = "Lclient!wv;")
	public Class114_Sub3 aClass114_Sub3_2;

	@OriginalMember(owner = "client!kv", name = "qg", descriptor = "Z")
	private boolean aBoolean417;

	@OriginalMember(owner = "client!kv", name = "ug", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!kv", name = "vg", descriptor = "I")
	private int anInt5852;

	@OriginalMember(owner = "client!kv", name = "xg", descriptor = "Lclient!bo;")
	private Class44_Sub1_Sub1 aClass44_Sub1_Sub1_2;

	@OriginalMember(owner = "client!kv", name = "yg", descriptor = "I")
	public int anInt5854;

	@OriginalMember(owner = "client!kv", name = "zg", descriptor = "Lclient!wv;")
	public Class114_Sub3 aClass114_Sub3_3;

	@OriginalMember(owner = "client!kv", name = "Dg", descriptor = "F")
	public float aFloat110;

	@OriginalMember(owner = "client!kv", name = "Eg", descriptor = "Lclient!wv;")
	public Class114_Sub3 aClass114_Sub3_4;

	@OriginalMember(owner = "client!kv", name = "Fg", descriptor = "Ljava/lang/String;")
	private String aString56;

	@OriginalMember(owner = "client!kv", name = "Gg", descriptor = "Lclient!wv;")
	public Class114_Sub3 aClass114_Sub3_5;

	@OriginalMember(owner = "client!kv", name = "Jg", descriptor = "Lclient!wv;")
	public Class114_Sub3 aClass114_Sub3_6;

	@OriginalMember(owner = "client!kv", name = "Kg", descriptor = "Lclient!wv;")
	public Class114_Sub3 aClass114_Sub3_7;

	@OriginalMember(owner = "client!kv", name = "Lg", descriptor = "Lclient!kb;")
	public Class194 aClass194_8;

	@OriginalMember(owner = "client!kv", name = "Mg", descriptor = "Z")
	public boolean aBoolean418;

	@OriginalMember(owner = "client!kv", name = "Ng", descriptor = "Z")
	public boolean aBoolean419;

	@OriginalMember(owner = "client!kv", name = "Qg", descriptor = "Z")
	public boolean aBoolean421;

	@OriginalMember(owner = "client!kv", name = "Rg", descriptor = "Z")
	public boolean aBoolean422;

	@OriginalMember(owner = "client!kv", name = "Tg", descriptor = "Z")
	private boolean aBoolean423;

	@OriginalMember(owner = "client!kv", name = "Vg", descriptor = "Lclient!ic;")
	private Interface8 anInterface8_5;

	@OriginalMember(owner = "client!kv", name = "Yg", descriptor = "F")
	public float aFloat112;

	@OriginalMember(owner = "client!kv", name = "bh", descriptor = "Z")
	public boolean aBoolean425;

	@OriginalMember(owner = "client!kv", name = "ch", descriptor = "I")
	public int anInt5863;

	@OriginalMember(owner = "client!kv", name = "eh", descriptor = "Z")
	private boolean aBoolean426;

	@OriginalMember(owner = "client!kv", name = "fh", descriptor = "Lclient!wv;")
	public Class114_Sub3 aClass114_Sub3_8;

	@OriginalMember(owner = "client!kv", name = "gh", descriptor = "Lclient!wv;")
	public Class114_Sub3 aClass114_Sub3_9;

	@OriginalMember(owner = "client!kv", name = "ih", descriptor = "I")
	private int anInt5865;

	@OriginalMember(owner = "client!kv", name = "jh", descriptor = "Lclient!wv;")
	public Class114_Sub3 aClass114_Sub3_10;

	@OriginalMember(owner = "client!kv", name = "lh", descriptor = "Z")
	public boolean aBoolean428;

	@OriginalMember(owner = "client!kv", name = "nh", descriptor = "F")
	private float aFloat115;

	@OriginalMember(owner = "client!kv", name = "qh", descriptor = "I")
	private int anInt5867;

	@OriginalMember(owner = "client!kv", name = "th", descriptor = "I")
	private int anInt5868;

	@OriginalMember(owner = "client!kv", name = "fb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable15 = new Hashtable();

	@OriginalMember(owner = "client!kv", name = "ne", descriptor = "I")
	public int anInt5817 = 128;

	@OriginalMember(owner = "client!kv", name = "ke", descriptor = "Lclient!kg;")
	private final Class200 aClass200_1 = new Class200();

	@OriginalMember(owner = "client!kv", name = "te", descriptor = "Lclient!vha;")
	private final Class56_Sub3 aClass56_Sub3_1 = new Class56_Sub3();

	@OriginalMember(owner = "client!kv", name = "ue", descriptor = "Lclient!vha;")
	public final Class56_Sub3 aClass56_Sub3_2 = new Class56_Sub3();

	@OriginalMember(owner = "client!kv", name = "we", descriptor = "Z")
	private boolean aBoolean399 = false;

	@OriginalMember(owner = "client!kv", name = "xe", descriptor = "I")
	public int anInt5821 = 3;

	@OriginalMember(owner = "client!kv", name = "Be", descriptor = "I")
	public int anInt5823 = 8;

	@OriginalMember(owner = "client!kv", name = "ye", descriptor = "Lclient!ga;")
	private final Class124 aClass124_50 = new Class124();

	@OriginalMember(owner = "client!kv", name = "Ce", descriptor = "I")
	private int anInt5824 = -1;

	@OriginalMember(owner = "client!kv", name = "Ee", descriptor = "[Lclient!vl;")
	private final Interface26[] anInterface26Array1 = new Interface26[4];

	@OriginalMember(owner = "client!kv", name = "He", descriptor = "I")
	private int anInt5825 = -1;

	@OriginalMember(owner = "client!kv", name = "Ie", descriptor = "[Lclient!vl;")
	private final Interface26[] anInterface26Array3 = new Interface26[4];

	@OriginalMember(owner = "client!kv", name = "Ge", descriptor = "[Lclient!vl;")
	private final Interface26[] anInterface26Array2 = new Interface26[4];

	@OriginalMember(owner = "client!kv", name = "Ke", descriptor = "I")
	private int anInt5826 = -1;

	@OriginalMember(owner = "client!kv", name = "Me", descriptor = "Lclient!ga;")
	private final Class124 aClass124_51;

	@OriginalMember(owner = "client!kv", name = "Qe", descriptor = "Lclient!ga;")
	private final Class124 aClass124_52;

	@OriginalMember(owner = "client!kv", name = "Re", descriptor = "Lclient!ga;")
	private final Class124 aClass124_53;

	@OriginalMember(owner = "client!kv", name = "Se", descriptor = "Lclient!ga;")
	private final Class124 aClass124_54;

	@OriginalMember(owner = "client!kv", name = "Te", descriptor = "Lclient!ga;")
	private final Class124 aClass124_55;

	@OriginalMember(owner = "client!kv", name = "Ue", descriptor = "Lclient!ga;")
	private final Class124 aClass124_56;

	@OriginalMember(owner = "client!kv", name = "Ve", descriptor = "Lclient!ga;")
	private final Class124 aClass124_57;

	@OriginalMember(owner = "client!kv", name = "Ye", descriptor = "Lclient!vha;")
	public final Class56_Sub3 aClass56_Sub3_3;

	@OriginalMember(owner = "client!kv", name = "ff", descriptor = "Lclient!vha;")
	public final Class56_Sub3 aClass56_Sub3_4;

	@OriginalMember(owner = "client!kv", name = "gf", descriptor = "Lclient!vha;")
	public final Class56_Sub3 aClass56_Sub3_5;

	@OriginalMember(owner = "client!kv", name = "kf", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!kv", name = "Cf", descriptor = "I")
	public int anInt5838;

	@OriginalMember(owner = "client!kv", name = "Pf", descriptor = "[Lclient!jw;")
	private final Class5_Sub3[] aClass5_Sub3Array3;

	@OriginalMember(owner = "client!kv", name = "jf", descriptor = "F")
	private float aFloat95;

	@OriginalMember(owner = "client!kv", name = "Of", descriptor = "I")
	public int anInt5844;

	@OriginalMember(owner = "client!kv", name = "lf", descriptor = "I")
	public int anInt5833;

	@OriginalMember(owner = "client!kv", name = "gg", descriptor = "F")
	public float aFloat107;

	@OriginalMember(owner = "client!kv", name = "Jf", descriptor = "I")
	private int anInt5842;

	@OriginalMember(owner = "client!kv", name = "Sf", descriptor = "I")
	private int anInt5845;

	@OriginalMember(owner = "client!kv", name = "Yf", descriptor = "[F")
	private final float[] aFloatArray39;

	@OriginalMember(owner = "client!kv", name = "pg", descriptor = "[F")
	public final float[] aFloatArray40;

	@OriginalMember(owner = "client!kv", name = "qf", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!kv", name = "jg", descriptor = "I")
	public int anInt5848;

	@OriginalMember(owner = "client!kv", name = "nf", descriptor = "Z")
	private boolean aBoolean403;

	@OriginalMember(owner = "client!kv", name = "Zf", descriptor = "I")
	public int anInt5846;

	@OriginalMember(owner = "client!kv", name = "Wf", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!kv", name = "Bf", descriptor = "F")
	public float aFloat98;

	@OriginalMember(owner = "client!kv", name = "rg", descriptor = "I")
	private int anInt5850;

	@OriginalMember(owner = "client!kv", name = "If", descriptor = "I")
	public int anInt5841;

	@OriginalMember(owner = "client!kv", name = "sg", descriptor = "I")
	private int anInt5851;

	@OriginalMember(owner = "client!kv", name = "mg", descriptor = "Z")
	private boolean aBoolean415;

	@OriginalMember(owner = "client!kv", name = "Ig", descriptor = "I")
	public int anInt5859;

	@OriginalMember(owner = "client!kv", name = "Bg", descriptor = "I")
	public int anInt5856;

	@OriginalMember(owner = "client!kv", name = "Pg", descriptor = "[F")
	private final float[] aFloatArray42;

	@OriginalMember(owner = "client!kv", name = "tg", descriptor = "[F")
	private final float[] aFloatArray41;

	@OriginalMember(owner = "client!kv", name = "wg", descriptor = "I")
	private int anInt5853;

	@OriginalMember(owner = "client!kv", name = "Ag", descriptor = "I")
	private int anInt5855;

	@OriginalMember(owner = "client!kv", name = "Wg", descriptor = "I")
	public int anInt5860;

	@OriginalMember(owner = "client!kv", name = "Xg", descriptor = "I")
	private int anInt5861;

	@OriginalMember(owner = "client!kv", name = "Nf", descriptor = "F")
	public float aFloat100;

	@OriginalMember(owner = "client!kv", name = "Hg", descriptor = "I")
	public int anInt5858;

	@OriginalMember(owner = "client!kv", name = "Sg", descriptor = "F")
	private float aFloat111;

	@OriginalMember(owner = "client!kv", name = "wf", descriptor = "[F")
	private final float[] aFloatArray38;

	@OriginalMember(owner = "client!kv", name = "ah", descriptor = "I")
	private int anInt5862;

	@OriginalMember(owner = "client!kv", name = "tf", descriptor = "I")
	private int anInt5835;

	@OriginalMember(owner = "client!kv", name = "ig", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!kv", name = "Zg", descriptor = "F")
	private float aFloat113;

	@OriginalMember(owner = "client!kv", name = "fg", descriptor = "F")
	private float aFloat106;

	@OriginalMember(owner = "client!kv", name = "dh", descriptor = "I")
	private int anInt5864;

	@OriginalMember(owner = "client!kv", name = "kh", descriptor = "F")
	private float aFloat114;

	@OriginalMember(owner = "client!kv", name = "oh", descriptor = "I")
	public int anInt5866;

	@OriginalMember(owner = "client!kv", name = "Mf", descriptor = "Lclient!dca;")
	public Class5_Sub15_Sub1 aClass5_Sub15_Sub1_3;

	@OriginalMember(owner = "client!kv", name = "ph", descriptor = "[B")
	public final byte[] aByteArray56;

	@OriginalMember(owner = "client!kv", name = "sh", descriptor = "[I")
	public int[] anIntArray314;

	@OriginalMember(owner = "client!kv", name = "rh", descriptor = "[I")
	public int[] anIntArray313;

	@OriginalMember(owner = "client!kv", name = "uh", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!kv", name = "le", descriptor = "I")
	public final int anInt5816;

	@OriginalMember(owner = "client!kv", name = "md", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas8;

	@OriginalMember(owner = "client!kv", name = "uc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!kv", name = "wb", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!kv", name = "Vc", descriptor = "J")
	private final long aLong164;

	@OriginalMember(owner = "client!kv", name = "Tb", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!kv", name = "Cg", descriptor = "I")
	public final int anInt5857;

	@OriginalMember(owner = "client!kv", name = "eg", descriptor = "Z")
	public boolean aBoolean413;

	@OriginalMember(owner = "client!kv", name = "Xf", descriptor = "Z")
	private boolean aBoolean411;

	@OriginalMember(owner = "client!kv", name = "Vf", descriptor = "Z")
	public boolean aBoolean410;

	@OriginalMember(owner = "client!kv", name = "Ug", descriptor = "Z")
	public boolean aBoolean424;

	@OriginalMember(owner = "client!kv", name = "hh", descriptor = "Z")
	public boolean aBoolean427;

	@OriginalMember(owner = "client!kv", name = "kg", descriptor = "Z")
	private boolean aBoolean414;

	@OriginalMember(owner = "client!kv", name = "Og", descriptor = "Z")
	public boolean aBoolean420;

	@OriginalMember(owner = "client!kv", name = "mh", descriptor = "Z")
	private final boolean aBoolean429;

	@OriginalMember(owner = "client!kv", name = "je", descriptor = "Lclient!tm;")
	private final Class341 aClass341_1;

	@OriginalMember(owner = "client!kv", name = "Ae", descriptor = "Lclient!hfa;")
	public final Class151 aClass151_1;

	@OriginalMember(owner = "client!kv", name = "oe", descriptor = "Lclient!gi;")
	private final Class131 aClass131_1;

	@OriginalMember(owner = "client!kv", name = "me", descriptor = "Lclient!di;")
	private Class5_Sub17_Sub1 aClass5_Sub17_Sub1_1;

	@OriginalMember(owner = "client!kv", name = "qe", descriptor = "Lclient!sg;")
	private final Class321 aClass321_1;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class143_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class150();
		new Class335(16);
		this.aClass124_51 = new Class124();
		this.aClass124_52 = new Class124();
		this.aClass124_53 = new Class124();
		this.aClass124_54 = new Class124();
		this.aClass124_55 = new Class124();
		this.aClass124_56 = new Class124();
		this.aClass124_57 = new Class124();
		this.aClass56_Sub3_3 = new Class56_Sub3();
		this.aClass56_Sub3_4 = new Class56_Sub3();
		this.aClass56_Sub3_5 = new Class56_Sub3();
		this.aFloat96 = 1.0F;
		this.anInt5838 = -1;
		this.aClass5_Sub3Array3 = new Class5_Sub3[Static499.anInt8508];
		this.aFloat95 = 1.0F;
		this.anInt5844 = 0;
		this.anInt5833 = 512;
		this.aFloat107 = 3584.0F;
		this.anInt5842 = 0;
		this.anInt5845 = 0;
		this.aFloatArray39 = new float[4];
		this.aFloatArray40 = new float[4];
		this.aFloat97 = -1.0F;
		this.anInt5848 = 0;
		this.aBoolean403 = false;
		this.anInt5846 = -1;
		this.aFloat103 = 3584.0F;
		this.aFloat98 = 1.0F;
		this.anInt5850 = -1;
		this.anInt5841 = 50;
		this.anInt5851 = 0;
		this.aBoolean415 = true;
		this.anInt5859 = -1;
		this.anInt5856 = -1;
		this.aFloatArray42 = new float[4];
		this.aFloatArray41 = new float[4];
		this.anInt5853 = 3584;
		this.anInt5855 = 0;
		this.anInt5860 = 0;
		this.anInt5861 = 8448;
		this.aFloat100 = 1.0F;
		this.anInt5858 = 512;
		this.aFloat111 = 0.0F;
		this.aFloatArray38 = new float[16];
		this.anInt5862 = 0;
		this.anInt5835 = 8448;
		this.aFloat108 = -1.0F;
		this.aFloat113 = -1.0F;
		this.aFloat106 = 1.0F;
		this.anInt5864 = 0;
		this.aFloat114 = -1.0F;
		this.anInt5866 = 0;
		this.aClass5_Sub15_Sub1_3 = new Class5_Sub15_Sub1(8192);
		this.aByteArray56 = new byte[16384];
		this.anIntArray314 = new int[1];
		this.anIntArray313 = new int[1];
		this.anIntArray315 = new int[1];
		this.anInt5816 = arg2;
		this.aCanvas7 = this.aCanvas8 = arg0;
		if (!Static374.method6479("jaclib")) {
			throw new RuntimeException("");
		} else if (Static374.method6479("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong163 = this.aLong164 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt5816);
				if (this.aLong164 == 0L) {
					throw new RuntimeException("");
				}
				this.method4974();
				@Pc(331) int local331 = this.method4975();
				if (local331 != 0) {
					throw new RuntimeException("");
				}
				this.anInt5857 = this.aBoolean408 ? 33639 : 5121;
				if (this.aString55.indexOf("radeon") != -1) {
					@Pc(357) int local357 = 0;
					@Pc(359) boolean local359 = false;
					@Pc(361) boolean local361 = false;
					@Pc(370) String[] local370 = Static466.method6897(' ', this.aString55.replace('/', ' '));
					for (@Pc(372) int local372 = 0; local372 < local370.length; local372++) {
						@Pc(377) String local377 = local370[local372];
						try {
							if (local377.length() > 0) {
								if (local377.charAt(0) == 'x' && local377.length() >= 3 && Static648.method8534(local377.substring(1, 3))) {
									local361 = true;
									local377 = local377.substring(1);
								}
								if (local377.equals("hd")) {
									local359 = true;
								} else {
									if (local377.startsWith("hd")) {
										local377 = local377.substring(2);
										local359 = true;
									}
									if (local377.length() >= 4 && Static648.method8534(local377.substring(0, 4))) {
										local357 = Static171.method2534(local377.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(443) Exception local443) {
						}
					}
					if (!local361 && !local359) {
						if (local357 >= 7000 && local357 <= 9250) {
							this.aBoolean413 = false;
						}
						if (local357 >= 7000 && local357 <= 7999) {
							this.aBoolean411 = false;
						}
					}
					if (!local359 || local357 < 4000) {
						this.aBoolean410 = false;
					}
					this.aBoolean424 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean427 = true;
					this.aBoolean414 = this.aBoolean411;
				}
				if (this.aString56.indexOf("intel") != -1) {
					this.aBoolean420 = false;
				}
				this.aBoolean429 = !this.aString56.equals("s3 graphics");
				if (this.aBoolean411) {
					try {
						@Pc(527) int[] local527 = new int[1];
						OpenGL.glGenBuffersARB(1, local527, 0);
					} catch (@Pc(533) Throwable local533) {
						throw new RuntimeException("");
					}
				}
				Static168.method2468(false, true);
				this.aBoolean399 = true;
				this.aClass341_1 = new Class341(this, super.anInterface3_11);
				this.method5003();
				this.aClass151_1 = new Class151(this);
				this.aClass131_1 = new Class131(this);
				if (this.aClass131_1.method2746()) {
					this.aClass5_Sub17_Sub1_1 = new Class5_Sub17_Sub1(this);
					if (!this.aClass5_Sub17_Sub1_1.method1738()) {
						this.aClass5_Sub17_Sub1_1.method1731();
						this.aClass5_Sub17_Sub1_1 = null;
					}
				}
				this.aClass321_1 = new Class321(this);
				this.method4936();
				this.method4925();
				this.method6221();
			} catch (@Pc(607) Throwable local607) {
				local607.printStackTrace();
				this.method6223();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "()Z")
	@Override
	public boolean method6227() {
		if (this.aClass5_Sub17_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass5_Sub17_Sub1_1.method1735()) {
			if (!this.aClass131_1.method2745(this.aClass5_Sub17_Sub1_1)) {
				return false;
			}
			this.aClass341_1.method7845();
		}
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "(II)V")
	public void method4922(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt5830) {
			return;
		}
		@Pc(14) boolean local14;
		@Pc(16) byte local16;
		if (arg0 == 1) {
			local14 = true;
			local16 = 1;
		} else if (arg0 == 2) {
			local14 = false;
			local16 = 2;
		} else if (arg0 == 128) {
			local14 = true;
			local16 = 3;
		} else {
			local16 = 0;
			local14 = false;
		}
		if (!this.aBoolean400) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean400 = true;
		}
		if (local14 != this.aBoolean402) {
			if (local14) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean402 = local14;
		}
		if (local16 != this.anInt5831) {
			if (local16 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local16 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local16 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt5831 = local16;
		}
		this.anInt5832 &= 0xFFFFFFE3;
		this.anInt5830 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILclient!vl;)V")
	public void method4923(@OriginalArg(1) Interface26 arg0) {
		if (this.anInt5825 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5825 >= 0) {
			this.anInterface26Array1[this.anInt5825].method7382();
		}
		this.anInterface26_1 = this.anInterface26Array1[++this.anInt5825] = arg0;
		this.anInterface26_1.method7381();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIF)Lclient!jw;")
	@Override
	public Class5_Sub3 method6256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub3_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(Z)V")
	public void method4924() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray40, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray39, 0);
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(I)V")
	private void method4925() {
		if (this.aCanvas7 == null) {
			this.anInt5739 = this.anInt5776 = 0;
		} else {
			@Pc(13) Dimension local13 = this.aCanvas7.getSize();
			this.anInt5739 = local13.width;
			this.anInt5776 = local13.height;
		}
		if (this.anInterface26_2 == null) {
			this.anInt5737 = this.anInt5776;
			this.anInt5794 = this.anInt5739;
			this.method4938();
		}
		this.method4992();
		this.la();
	}

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "()Z")
	@Override
	public boolean method6224() {
		return this.aClass5_Sub17_Sub1_1 != null && this.aClass5_Sub17_Sub1_1.method1735();
	}

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "(I)V")
	private void method4926() {
		if (this.anInt5832 == 1) {
			return;
		}
		this.method4973();
		this.method4976(false);
		this.method4993(false);
		this.method4997(false);
		this.method4931(false);
		this.method4945((Class44) null);
		this.method4978(-2);
		this.method4994(1);
		this.anInt5832 = 1;
	}

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5841 == arg0 && arg1 == this.anInt5853) {
			return;
		}
		this.anInt5853 = arg1;
		this.anInt5841 = arg0;
		this.method4935();
		this.method4937();
		if (this.anInt5849 == 3) {
			this.method5001();
		} else if (this.anInt5849 == 2) {
			this.method4995();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZIIILclient!jaclib/memory/Buffer;)Lclient!ic;")
	public Interface8 method4927(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Buffer arg2) {
		return (Interface8) (this.aBoolean411 ? new Class30_Sub1(this, arg1, arg2, arg0, false) : new Class292_Sub2(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "()Z")
	@Override
	public boolean method6214() {
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(B)V")
	private void method4928() {
		this.aFloat110 = (float) (this.anInt5842 - this.anInt5860);
		this.aFloat102 = (float) (this.anInt5864 - this.anInt5866);
		this.aFloat109 = (float) (this.anInt5851 - this.anInt5860);
		this.aFloat112 = (float) (this.anInt5862 - this.anInt5866);
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6270(@OriginalArg(0) Canvas arg0) {
		this.aCanvas7 = null;
		this.aLong163 = 0L;
		if (arg0 == null || this.aCanvas8 == arg0) {
			this.aLong163 = this.aLong164;
			this.aCanvas7 = this.aCanvas8;
		} else if (this.aHashtable15.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable15.get(arg0);
			this.aLong163 = local36;
			this.aCanvas7 = arg0;
		}
		if (this.aCanvas7 == null || this.aLong163 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong163);
		this.method4925();
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIZ)V")
	public synchronized void method4929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class5_Sub43 local12 = new Class5_Sub43(arg1);
		local12.aLong329 = (long) arg0;
		this.aClass124_52.method2574(local12);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class88 method6242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class88_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "(II)V")
	public void method4930(@OriginalArg(0) int arg0) {
		if (this.anInt5847 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt5847 = arg0;
		}
	}

	@OriginalMember(owner = "client!kv", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt5867;
		this.anInt5867 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZI)V")
	public void method4931(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean401 != arg0) {
			this.aBoolean401 = arg0;
			this.method4980();
			this.anInt5832 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(B)V")
	public void method4932() {
		if (this.anInt5832 == 8) {
			return;
		}
		this.method4941();
		this.method4976(true);
		this.method4997(true);
		this.method4931(true);
		this.method4922(1);
		this.anInt5832 = 8;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!cp;)V")
	@Override
	public void method6250(@OriginalArg(0) Interface2 arg0) {
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BIII)V")
	public void method4933(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "(I)V")
	private void method4934() {
		Static448.aFloatArray63[3] = 1.0F;
		Static448.aFloatArray63[2] = this.aFloat97 * this.aFloat96;
		Static448.aFloatArray63[1] = this.aFloat97 * this.aFloat98;
		Static448.aFloatArray63[0] = this.aFloat97 * this.aFloat100;
		OpenGL.glLightfv(16384, 4609, Static448.aFloatArray63, 0);
		Static448.aFloatArray63[0] = this.aFloat100 * -this.aFloat108;
		Static448.aFloatArray63[1] = this.aFloat98 * -this.aFloat108;
		Static448.aFloatArray63[3] = 1.0F;
		Static448.aFloatArray63[2] = -this.aFloat108 * this.aFloat96;
		OpenGL.glLightfv(16385, 4609, Static448.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(B)V")
	private void method4935() {
		@Pc(6) float[] local6 = this.aFloatArray38;
		@Pc(22) float local22 = (float) (this.anInt5841 * -this.anInt5860) / (float) this.anInt5858;
		@Pc(37) float local37 = (float) (this.anInt5841 * (this.anInt5794 - this.anInt5860)) / (float) this.anInt5858;
		@Pc(48) float local48 = (float) (this.anInt5841 * this.anInt5866) / (float) this.anInt5833;
		@Pc(63) float local63 = (float) ((this.anInt5866 - this.anInt5737) * this.anInt5841) / (float) this.anInt5833;
		if (local37 == local22 || local63 == local48) {
			local6[13] = 0.0F;
			local6[8] = 0.0F;
			local6[10] = 1.0F;
			local6[2] = 0.0F;
			local6[7] = 0.0F;
			local6[12] = 0.0F;
			local6[11] = 0.0F;
			local6[1] = 0.0F;
			local6[15] = 1.0F;
			local6[4] = 0.0F;
			local6[0] = 1.0F;
			local6[14] = 0.0F;
			local6[6] = 0.0F;
			local6[9] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = 1.0F;
		} else {
			@Pc(77) float local77 = (float) this.anInt5841 * 2.0F;
			local6[4] = 0.0F;
			local6[0] = local77 / (local37 - local22);
			local6[9] = (local48 + local63) / (-local63 + local48);
			local6[14] = this.aFloat104 = -(local77 * (float) this.anInt5853) / (float) (this.anInt5853 - this.anInt5841);
			local6[13] = 0.0F;
			local6[6] = 0.0F;
			local6[7] = 0.0F;
			local6[1] = 0.0F;
			local6[11] = -1.0F;
			local6[5] = local77 / (local48 - local63);
			local6[15] = 0.0F;
			local6[2] = 0.0F;
			local6[3] = 0.0F;
			local6[10] = this.aFloat115 = (float) -(this.anInt5841 + this.anInt5853) / (float) (this.anInt5853 - this.anInt5841);
			local6[8] = (local37 + local22) / (local37 - local22);
			local6[12] = 0.0F;
		}
		this.method4979();
	}

	@OriginalMember(owner = "client!kv", name = "y", descriptor = "()Lclient!eh;")
	@Override
	public Class56 method6257() {
		return this.aClass56_Sub3_3;
	}

	@OriginalMember(owner = "client!kv", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass56_Sub3_3.aFloat183 + (float) arg2 * this.aClass56_Sub3_3.aFloat188 + (float) arg0 * this.aClass56_Sub3_3.aFloat180 + this.aClass56_Sub3_3.aFloat182 * (float) arg1;
		if (local28 < (float) this.anInt5841 || local28 > (float) this.anInt5853) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt5858 * (this.aClass56_Sub3_3.aFloat181 * (float) arg0 + (float) arg1 * this.aClass56_Sub3_3.aFloat177 + (float) arg2 * this.aClass56_Sub3_3.aFloat187 + this.aClass56_Sub3_3.aFloat185) / local28);
		@Pc(117) int local117 = (int) (((float) arg1 * this.aClass56_Sub3_3.aFloat184 + (float) arg0 * this.aClass56_Sub3_3.aFloat178 + (float) arg2 * this.aClass56_Sub3_3.aFloat179 + this.aClass56_Sub3_3.aFloat186) * (float) this.anInt5833 / local28);
		if (this.aFloat109 <= (float) local85 && (float) local85 <= this.aFloat110 && (float) local117 >= this.aFloat102 && this.aFloat112 >= (float) local117) {
			arg3[0] = (int) ((float) local85 - this.aFloat109);
			arg3[1] = (int) ((float) local117 - this.aFloat102);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!kv", name = "u", descriptor = "()Z")
	@Override
	public boolean method6234() {
		return false;
	}

	@OriginalMember(owner = "client!kv", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean428 = false;
	}

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public Class5_Sub26 method6268(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub26_Sub2 local8 = new Class5_Sub26_Sub2(arg0);
		this.aClass124_50.method2574(local8);
		return local8;
	}

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "()Z")
	@Override
	public boolean method6205() {
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "(B)V")
	private void method4936() {
		this.method4978(-2);
		for (@Pc(12) int local12 = this.anInt5834 - 1; local12 >= 0; local12--) {
			this.method4930(local12);
			this.method4945((Class44) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method4940(8448, 8448);
		this.method4947(770, 2, 34168);
		this.method4954();
		this.anInt5830 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt5831 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean402 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean400 = true;
		this.method4976(true);
		this.method4993(true);
		this.method4997(true);
		this.method4931(true);
		this.method4992();
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
		@Pc(120) float[] local120 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(122) int local122 = 0; local122 < 8; local122++) {
			@Pc(127) int local127 = local122 + 16384;
			OpenGL.glLightfv(local127, 4608, local120, 0);
			OpenGL.glLightf(local127, 4615, 0.0F);
			OpenGL.glLightf(local127, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt5850 = this.anInt5846 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)V")
	@Override
	public void method6196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "(B)V")
	private void method4937() {
		this.aFloat99 = (float) (this.anInt5853 - this.anInt5848) - this.aFloat111;
		this.aFloat101 = this.aFloat99 - (float) this.anInt5838 * this.aFloat95;
		if ((float) this.anInt5841 > this.aFloat101) {
			this.aFloat101 = (float) this.anInt5841;
		}
		OpenGL.glFogf(2915, this.aFloat101);
		OpenGL.glFogf(2916, this.aFloat99);
		Static448.aFloatArray63[2] = (float) (this.anInt5846 & 0xFF) / 255.0F;
		Static448.aFloatArray63[1] = (float) (this.anInt5846 & 0xFF00) / 65280.0F;
		Static448.aFloatArray63[0] = (float) (this.anInt5846 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static448.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "(B)V")
	private void method4938() {
		OpenGL.glViewport(this.anInt5855, this.anInt5845, this.anInt5794, this.anInt5737);
	}

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "(I)V")
	private void method4939() {
		if (this.aBoolean407 && this.anInt5838 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method6239(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class5_Sub43 local19;
		while (!this.aClass124_52.method2577()) {
			local19 = (Class5_Sub43) this.aClass124_52.method2571();
			Static463.anIntArray448[local7++] = (int) local19.aLong329;
			this.anInt5829 -= local19.anInt7821;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static463.anIntArray448, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static463.anIntArray448, 0);
			local7 = 0;
		}
		while (!this.aClass124_53.method2577()) {
			local19 = (Class5_Sub43) this.aClass124_53.method2571();
			Static463.anIntArray448[local7++] = (int) local19.aLong329;
			this.anInt5827 -= local19.anInt7821;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static463.anIntArray448, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static463.anIntArray448, 0);
			local7 = 0;
		}
		while (!this.aClass124_54.method2577()) {
			local19 = (Class5_Sub43) this.aClass124_54.method2571();
			Static463.anIntArray448[local7++] = local19.anInt7821;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static463.anIntArray448, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static463.anIntArray448, 0);
			local7 = 0;
		}
		while (!this.aClass124_55.method2577()) {
			local19 = (Class5_Sub43) this.aClass124_55.method2571();
			Static463.anIntArray448[local7++] = (int) local19.aLong329;
			this.anInt5828 -= local19.anInt7821;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static463.anIntArray448, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static463.anIntArray448, 0);
		}
		while (!this.aClass124_51.method2577()) {
			local19 = (Class5_Sub43) this.aClass124_51.method2571();
			OpenGL.glDeleteLists((int) local19.aLong329, local19.anInt7821);
		}
		@Pc(212) Class5 local212;
		while (!this.aClass124_56.method2577()) {
			local212 = this.aClass124_56.method2571();
			OpenGL.glDeleteProgramARB((int) local212.aLong329);
		}
		while (!this.aClass124_57.method2577()) {
			local212 = this.aClass124_57.method2571();
			OpenGL.glDeleteObjectARB(local212.aLong329);
		}
		while (!this.aClass124_51.method2577()) {
			local19 = (Class5_Sub43) this.aClass124_51.method2571();
			OpenGL.glDeleteLists((int) local19.aLong329, local19.anInt7821);
		}
		this.aClass341_1.method7846();
		if (this.E() > 100663296 && Static124.method1947() > this.aLong165 + 60000L) {
			System.gc();
			this.aLong165 = Static124.method1947();
		}
		this.anInt5822 = local11;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZII)V")
	public void method4940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5847 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt5835 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt5835 = arg0;
			local11 = true;
		}
		if (this.anInt5861 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt5861 = arg1;
			local11 = true;
		}
		if (local11) {
			this.anInt5832 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "(I)V")
	private void method4941() {
		if (this.anInt5849 != 2) {
			this.anInt5849 = 2;
			this.method4995();
			this.method4960();
			this.anInt5832 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kv", name = "A", descriptor = "()Z")
	@Override
	public boolean method6269() {
		return false;
	}

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "(I)V")
	private void method4942() {
		if (this.anInt5842 >= this.anInt5851 && this.anInt5864 <= this.anInt5862) {
			OpenGL.glScissor(this.anInt5851 + this.anInt5855, this.anInt5737 + this.anInt5845 - this.anInt5862, this.anInt5842 - this.anInt5851, -this.anInt5864 + this.anInt5862);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!eh;)V")
	@Override
	public void method6222(@OriginalArg(0) Class56 arg0) {
		this.aClass56_Sub3_3.method8393(arg0);
		this.aClass56_Sub3_4.method8393(this.aClass56_Sub3_3);
		this.aClass56_Sub3_4.method8408();
		this.aClass56_Sub3_5.method8404(this.aClass56_Sub3_4);
		if (this.anInt5849 != 1) {
			this.method4960();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!ag;)V")
	@Override
	public void method6249(@OriginalArg(0) Class11 arg0) {
		this.aClass11_Sub1_1 = (Class11_Sub1) arg0;
	}

	@OriginalMember(owner = "client!kv", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg2 * this.aClass56_Sub3_3.aFloat188 + (float) arg0 * this.aClass56_Sub3_3.aFloat180 + (float) arg1 * this.aClass56_Sub3_3.aFloat182 + this.aClass56_Sub3_3.aFloat183;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass56_Sub3_3.aFloat182 * (float) arg4 + (float) arg3 * this.aClass56_Sub3_3.aFloat180 + (float) arg5 * this.aClass56_Sub3_3.aFloat188 + this.aClass56_Sub3_3.aFloat183;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt5841 > local32 && local63 < (float) this.anInt5841) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt5853 && local63 > (float) this.anInt5853) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass56_Sub3_3.aFloat185 + this.aClass56_Sub3_3.aFloat177 * (float) arg1 + (float) arg0 * this.aClass56_Sub3_3.aFloat181 + (float) arg2 * this.aClass56_Sub3_3.aFloat187) * (float) this.anInt5858 / local32);
		@Pc(167) int local167 = (int) ((this.aClass56_Sub3_3.aFloat185 + (float) arg4 * this.aClass56_Sub3_3.aFloat177 + this.aClass56_Sub3_3.aFloat181 * (float) arg3 + (float) arg5 * this.aClass56_Sub3_3.aFloat187) * (float) this.anInt5858 / local63);
		if (this.aFloat109 > (float) local135 && (float) local167 < this.aFloat109) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat110 && this.aFloat110 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass56_Sub3_3.aFloat186 + this.aClass56_Sub3_3.aFloat179 * (float) arg2 + this.aClass56_Sub3_3.aFloat184 * (float) arg1 + (float) arg0 * this.aClass56_Sub3_3.aFloat178) * (float) this.anInt5833 / local32);
		@Pc(265) int local265 = (int) ((this.aClass56_Sub3_3.aFloat179 * (float) arg5 + this.aClass56_Sub3_3.aFloat178 * (float) arg3 + (float) arg4 * this.aClass56_Sub3_3.aFloat184 + this.aClass56_Sub3_3.aFloat186) * (float) this.anInt5833 / local63);
		if ((float) local233 < this.aFloat102 && this.aFloat102 > (float) local265) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat112 && (float) local265 > this.aFloat112) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZ[BZI)Lclient!mda;")
	public Interface15 method4943(@OriginalArg(2) byte[] arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		return (Interface15) (this.aBoolean411 && (!arg1 || this.aBoolean414) ? new Class30_Sub2(this, 5123, arg0, arg2, arg1) : new Class292_Sub1(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)V")
	public synchronized void method4944(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub43 local12 = new Class5_Sub43(arg1);
		local12.aLong329 = (long) arg0;
		this.aClass124_53.method2574(local12);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!fia;I)V")
	public void method4945(@OriginalArg(0) Class44 arg0) {
		@Pc(15) Class44 local15 = this.aClass44Array1[this.anInt5847];
		if (arg0 != local15) {
			if (arg0 == null) {
				OpenGL.glDisable(local15.anInt7892);
			} else {
				if (local15 == null) {
					OpenGL.glEnable(arg0.anInt7892);
				} else if (local15.anInt7892 != arg0.anInt7892) {
					OpenGL.glDisable(local15.anInt7892);
					OpenGL.glEnable(arg0.anInt7892);
				}
				OpenGL.glBindTexture(arg0.anInt7892, arg0.method6699());
			}
			this.aClass44Array1[this.anInt5847] = arg0;
		}
		this.anInt5832 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(III)V")
	public void method4946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5855 = arg0;
		this.anInt5845 = arg1;
		this.method4938();
		this.method4942();
	}

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt5841;
	}

	@OriginalMember(owner = "client!kv", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4926();
		this.method4922(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "()Lclient!eh;")
	@Override
	public Class56 method6212() {
		return this.aClass56_Sub3_1;
	}

	@OriginalMember(owner = "client!kv", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt5851 > arg0 + arg2 || this.anInt5842 < arg0 - arg2 || this.anInt5864 > arg1 + arg2 || arg1 - arg2 > this.anInt5862) {
			return;
		}
		this.method4926();
		this.method4922(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(72) float local72 = (float) arg0 + 0.35F;
		@Pc(77) float local77 = (float) arg1 + 0.35F;
		@Pc(81) int local81 = arg2 << 1;
		if ((float) local81 < this.aFloat113) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local72 + 1.0F, local77 + 1.0F);
			OpenGL.glVertex2f(local72 + 1.0F, -1.0F + local77);
			OpenGL.glVertex2f(local72 - 1.0F, -1.0F + local77);
			OpenGL.glVertex2f(local72 - 1.0F, local77 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local81 <= this.aFloat114) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local81);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local72, local77);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local72, local77);
			@Pc(150) int local150 = 262144 / (arg2 * 6);
			if (local150 <= 64) {
				local150 = 64;
			} else if (local150 > 512) {
				local150 = 512;
			}
			local150 = Static630.method8378(local150);
			OpenGL.glVertex2f((float) arg2 + local72, local77);
			for (@Pc(177) int local177 = 16384 - local150; local177 > 0; local177 -= local150) {
				OpenGL.glVertex2f(Class2_Sub12.aFloatArray48[local177] * (float) arg2 + local72, local77 + (float) arg2 * Class2_Sub12.aFloatArray49[local177]);
			}
			OpenGL.glVertex2f((float) arg2 + local72, local77);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6195(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas8) {
			throw new RuntimeException();
		} else if (this.aHashtable15.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable15.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable15.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIII)V")
	public void method4947(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg0);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BI)I")
	public int method4948(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(Z)V")
	private void method4949() {
		this.anOpenGL1.b();
	}

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "()V")
	@Override
	public void method6220() {
		this.aClass131_1.method2742();
	}

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "(II)V")
	public synchronized void method4951(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub43 local8 = new Class5_Sub43(arg0);
		this.aClass124_54.method2574(local8);
	}

	@OriginalMember(owner = "client!kv", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(49) float local49;
		@Pc(45) float local45;
		if (this.aClass44_Sub1_Sub1_2 == null || this.aClass44_Sub1_Sub1_2.anInt847 < arg2 || arg3 > this.aClass44_Sub1_Sub1_2.anInt838) {
			this.aClass44_Sub1_Sub1_2 = Static387.method5664(arg3, arg6, this, arg2);
			this.aClass44_Sub1_Sub1_2.method794(false, false);
			local45 = this.aClass44_Sub1_Sub1_2.aFloat11;
			local49 = this.aClass44_Sub1_Sub1_2.aFloat12;
		} else {
			this.aClass44_Sub1_Sub1_2.method798(6406, arg2, arg6, arg3, false);
			local49 = this.aClass44_Sub1_Sub1_2.aFloat12 * (float) arg3 / (float) this.aClass44_Sub1_Sub1_2.anInt838;
			local45 = (float) arg2 * this.aClass44_Sub1_Sub1_2.aFloat11 / (float) this.aClass44_Sub1_Sub1_2.anInt847;
		}
		this.method4969();
		this.method4945(this.aClass44_Sub1_Sub1_2);
		this.method4922(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4982(arg5);
		this.method4940(34165, 34165);
		this.method4947(768, 0, 34166);
		this.method4947(770, 2, 5890);
		this.method4933(34166, 0);
		this.method4933(5890, 2);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = (float) arg2 + local151;
		@Pc(164) float local164 = (float) arg3 + local154;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local151, local164);
		OpenGL.glTexCoord2f(local49, local45);
		OpenGL.glVertex2f(local159, local164);
		OpenGL.glTexCoord2f(local49, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method4947(768, 0, 5890);
		this.method4947(770, 2, 34166);
		this.method4933(5890, 0);
		this.method4933(34166, 2);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!mda;B)V")
	public void method4952(@OriginalArg(0) Interface15 arg0) {
		if (arg0 != this.anInterface15_3) {
			if (this.aBoolean411) {
				OpenGL.glBindBufferARB(34963, arg0.method8491());
			}
			this.anInterface15_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(II)I")
	@Override
	public int method6204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!kv", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass56_Sub3_3.aFloat188 * (float) arg2 + this.aClass56_Sub3_3.aFloat182 * (float) arg1 + this.aClass56_Sub3_3.aFloat180 * (float) arg0 + this.aClass56_Sub3_3.aFloat183;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt5858 * (this.aClass56_Sub3_3.aFloat185 + (float) arg2 * this.aClass56_Sub3_3.aFloat187 + (float) arg1 * this.aClass56_Sub3_3.aFloat177 + this.aClass56_Sub3_3.aFloat181 * (float) arg0) / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat109);
		@Pc(118) int local118 = (int) ((this.aClass56_Sub3_3.aFloat186 + (float) arg2 * this.aClass56_Sub3_3.aFloat179 + (float) arg1 * this.aClass56_Sub3_3.aFloat184 + this.aClass56_Sub3_3.aFloat178 * (float) arg0) * (float) this.anInt5833 / local28);
		arg3[1] = (int) ((float) local118 - this.aFloat102);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "()V")
	@Override
	public void method6187() {
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method4926();
		this.method4922(1);
		@Pc(34) float local34 = (float) -arg0 + (float) arg2;
		@Pc(40) float local40 = (float) arg3 - (float) arg1;
		@Pc(53) float local53 = (float) (1.0D / Math.sqrt((double) (local40 * local40 + local34 * local34)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(72) float local72 = local40 * local53;
		@Pc(76) float local76 = local34 * local53;
		@Pc(82) int local82 = arg7 % (arg5 + arg6);
		@Pc(87) float local87 = local76 * (float) arg5;
		@Pc(92) float local92 = local72 * (float) arg5;
		@Pc(94) float local94 = 0.0F;
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = local87;
		@Pc(100) float local100 = local92;
		if (arg5 < local82) {
			local96 = (float) (arg6 + arg5 - local82) * local72;
			local94 = (float) (arg6 + arg5 - local82) * local76;
		} else {
			local100 = (float) (arg5 - local82) * local72;
			local98 = (float) (arg5 - local82) * local76;
		}
		@Pc(147) float local147 = local94 + (float) arg0 + 0.35F;
		@Pc(154) float local154 = local96 + (float) arg1 + 0.35F;
		@Pc(159) float local159 = (float) arg6 * local76;
		@Pc(164) float local164 = (float) arg6 * local72;
		while (true) {
			if (arg0 < arg2) {
				if (local147 > (float) arg2 + 0.35F) {
					break;
				}
				if (local147 + local98 > (float) arg2) {
					local98 = (float) arg2 - local147;
				}
			} else {
				if (local147 < (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 > local147 + local98) {
					local98 = (float) arg2 - local147;
				}
			}
			if (arg3 > arg1) {
				if ((float) arg3 + 0.35F < local154) {
					break;
				}
				if (local100 + local154 > (float) arg3) {
					local100 = (float) arg3 - local154;
				}
			} else {
				if ((float) arg3 + 0.35F > local154) {
					break;
				}
				if ((float) arg3 > local154 + local100) {
					local100 = (float) arg3 - local154;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local147, local154);
			OpenGL.glVertex2f(local98 + local147, local154 + local100);
			OpenGL.glEnd();
			local154 += local100 + local164;
			local147 += local159 + local98;
			local100 = local92;
			local98 = local87;
		}
	}

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "(B)Lclient!mu;")
	public Class44_Sub3 method4953() {
		return this.aClass11_Sub1_1 == null ? null : this.aClass11_Sub1_1.method3582();
	}

	@OriginalMember(owner = "client!kv", name = "x", descriptor = "()Lclient!rda;")
	@Override
	public Class300 method6248() {
		@Pc(7) int local7 = -1;
		if (this.aString56.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString56.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString56.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class300(local7, "OpenGL", this.anInt5840, this.aString55, 0L);
	}

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "(I)V")
	private void method4954() {
		if (this.aBoolean417) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean417 = false;
		}
	}

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "(I)V")
	@Override
	public void method6230(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt5817 = arg0;
		this.aClass341_1.method7845();
	}

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "(I)V")
	@Override
	public void method6253(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kv", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt5868;
		this.anInt5868 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILclient!vha;)V")
	public void method4955(@OriginalArg(1) Class56_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method8409(), 0);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIZZ)V")
	public void method4956(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt5837 || this.aBoolean403 != this.aBoolean428) {
			@Pc(26) Class44_Sub1 local26 = null;
			@Pc(28) int local28 = 0;
			@Pc(30) byte local30 = 0;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39 = this.aBoolean428 ? 3 : 0;
			if (arg0 < 0) {
				this.method4954();
			} else {
				local26 = this.aClass341_1.method7847(arg0);
				@Pc(56) Class331 local56 = super.anInterface3_11.method8501(arg0);
				if (local56.aByte116 == 0 && local56.aByte113 == 0) {
					this.method4954();
				} else {
					@Pc(72) int local72 = local56.aBoolean659 ? 64 : 128;
					@Pc(76) int local76 = local72 * 50;
					this.method4964((float) (local56.aByte113 * (this.anInt5822 % local76)) / (float) local76, (float) (local56.aByte116 * (this.anInt5822 % local76)) / (float) local76, 0.0F);
				}
				local28 = local56.anInt9138;
				if (!this.aBoolean428) {
					local39 = local56.aByte117;
					local32 = local56.anInt9139;
					local30 = local56.aByte114;
				}
			}
			this.aClass321_1.method7430(arg1, local32, arg2, local30, local39);
			if (!this.aClass321_1.method7426(local26, local28)) {
				this.method4945(local26);
				this.method4994(local28);
			}
			this.aBoolean403 = this.aBoolean428;
			this.anInt5837 = arg0;
		}
		this.anInt5832 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!re;Z)Lclient!qda;")
	@Override
	public Class59 method6247(@OriginalArg(0) Class301 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt8501 * arg0.anInt8497];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray81 == null) {
			for (local21 = 0; local21 < arg0.anInt8497; local21++) {
				for (local25 = 0; local25 < arg0.anInt8501; local25++) {
					@Pc(87) int local87 = arg0.anIntArray462[arg0.aByteArray82[local14++] & 0xFF];
					local12[local16++] = local87 == 0 ? 0 : local87 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt8497; local21++) {
				for (local25 = 0; local25 < arg0.anInt8501; local25++) {
					local12[local16++] = arg0.aByteArray81[local14] << 24 | arg0.anIntArray462[arg0.aByteArray82[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(127) Class59 local127 = this.method6241(arg0.anInt8497, arg0.anInt8501, arg0.anInt8501, local12);
		local127.method8062(arg0.anInt8500, arg0.anInt8499, arg0.anInt8498, arg0.anInt8496);
		return local127;
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(III)V")
	public synchronized void method4957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub43 local8 = new Class5_Sub43(arg0);
		local8.aLong329 = (long) arg1;
		this.aClass124_55.method2574(local8);
	}

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "()V")
	@Override
	public void method6221() {
		if (!this.aBoolean429 || this.anInt5794 <= 0 || this.anInt5737 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt5851;
		@Pc(22) int local22 = this.anInt5842;
		@Pc(25) int local25 = this.anInt5864;
		@Pc(28) int local28 = this.anInt5862;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4992();
		this.method4976(false);
		this.method4993(false);
		this.method4997(false);
		this.method4931(false);
		this.method4945((Class44) null);
		this.method4978(-2);
		this.method4994(1);
		this.method4922(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt5794, this.anInt5737, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!kf;[Lclient!re;Z)Lclient!da;")
	@Override
	public Class72 method6194(@OriginalArg(0) Class198 arg0, @OriginalArg(1) Class301[] arg1) {
		return new Class72_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!kv", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int[] local8 = new int[arg2 * arg3];
		for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
			OpenGL.glReadPixelsi(arg0, this.anInt5737 - local10 - arg1, arg2, 1, 32993, this.anInt5857, local8, arg2 * local10);
		}
		return local8;
	}

	@OriginalMember(owner = "client!kv", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > this.anInt5794) {
			arg2 = this.anInt5794;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt5737) {
			arg3 = this.anInt5737;
		}
		this.anInt5864 = arg1;
		this.anInt5862 = arg3;
		this.anInt5842 = arg2;
		this.anInt5851 = arg0;
		OpenGL.glEnable(3089);
		this.method4928();
		this.method4942();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIII)Lclient!ag;")
	@Override
	public Class11 method6191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean416 ? new Class11_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "(I)V")
	@Override
	public void method6258() {
	}

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "(II)V")
	public synchronized void method4958(@OriginalArg(0) int arg0) {
		@Pc(13) Class5 local13 = new Class5();
		local13.aLong329 = (long) arg0;
		this.aClass124_56.method2574(local13);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!hm;IIII)Lclient!ka;")
	@Override
	public Class114 method6203(@OriginalArg(0) Class156 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class114_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 == arg2 && arg3 == arg1) {
			return;
		}
		@Pc(19) Class1_Sub3 local19 = (Class1_Sub3) arg5;
		@Pc(22) Class44_Sub1_Sub1 local22 = local19.aClass44_Sub1_Sub1_3;
		this.method4969();
		this.method4945(local19.aClass44_Sub1_Sub1_3);
		this.method4922(1);
		this.method4940(7681, 8448);
		this.method4947(768, 0, 34167);
		@Pc(52) float local52 = local22.aFloat11 / (float) local22.anInt850;
		@Pc(59) float local59 = local22.aFloat12 / (float) local22.anInt848;
		@Pc(65) float local65 = (float) arg2 - (float) arg0;
		@Pc(71) float local71 = (float) arg3 - (float) arg1;
		@Pc(84) float local84 = (float) (1.0D / Math.sqrt((double) (local71 * local71 + local65 * local65)));
		@Pc(88) float local88 = local71 * local84;
		@Pc(95) int local95 = arg10 % (arg9 + arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(114) float local114 = local65 * local84;
		@Pc(119) float local119 = (float) arg8 * local114;
		@Pc(124) float local124 = (float) arg8 * local88;
		@Pc(126) float local126 = 0.0F;
		@Pc(128) float local128 = 0.0F;
		@Pc(130) float local130 = local119;
		@Pc(132) float local132 = local124;
		if (arg8 < local95) {
			local126 = local114 * (float) (arg8 + arg9 - local95);
			local128 = local88 * (float) (arg9 + arg8 - local95);
		} else {
			local132 = local88 * (float) (arg8 - local95);
			local130 = local114 * (float) (arg8 - local95);
		}
		@Pc(183) float local183 = local126 + (float) arg0 + 0.35F;
		@Pc(190) float local190 = (float) arg1 + local128 + 0.35F;
		@Pc(195) float local195 = local114 * (float) arg9;
		@Pc(200) float local200 = (float) arg9 * local88;
		while (true) {
			if (arg0 >= arg2) {
				if (local183 < (float) arg2 + 0.35F) {
					break;
				}
				if (local130 + local183 < (float) arg2) {
					local130 = (float) arg2 - local183;
				}
			} else {
				if (local183 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local183 + local130) {
					local130 = (float) arg2 - local183;
				}
			}
			if (arg1 >= arg3) {
				if (local190 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local190 + local132) {
					local132 = (float) arg3 - local190;
				}
			} else {
				if (local190 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local190 + local132) {
					local132 = (float) arg3 - local190;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f((local183 - (float) arg6) * local52, ((float) -arg7 + local190) * local59);
			OpenGL.glVertex2f(local183, local190);
			OpenGL.glTexCoord2f(local52 * ((float) -arg6 + local183 + local130), (local190 + local132 - (float) arg7) * local59);
			OpenGL.glVertex2f(local183 + local130, local190 + local132);
			local183 += local130 + local195;
			local190 += local132 + local200;
			OpenGL.glEnd();
			local132 = local124;
			local130 = local119;
		}
		this.method4947(768, 0, 5890);
	}

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "()Lclient!eh;")
	@Override
	public Class56 method6232() {
		return new Class56_Sub3();
	}

	@OriginalMember(owner = "client!kv", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4931(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(Z)V")
	@Override
	public void method6197(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V")
	@Override
	public void method6218(@OriginalArg(0) int arg0) {
		this.method4974();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!vha;I)V")
	public void method4959(@OriginalArg(0) Class56_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method8409(), 0);
	}

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "(I)V")
	private void method4960() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass56_Sub3_4.method8409(), 0);
		if (this.aBoolean403) {
			this.aClass321_1.aClass19_Sub6_1.method4770();
		}
		this.method4924();
		this.method4967();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6238(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6196(arg2, arg3);
	}

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "()V")
	@Override
	protected void method6223() {
		for (@Pc(4) Class5 local4 = this.aClass124_50.method2572(); local4 != null; local4 = this.aClass124_50.method2569()) {
			((Class5_Sub26_Sub2) local4).method5440();
		}
		if (this.aClass131_1 != null) {
			this.aClass131_1.method2751();
		}
		if (this.anOpenGL1 != null) {
			this.method4949();
			@Pc(37) Enumeration local37 = this.aHashtable15.keys();
			while (local37.hasMoreElements()) {
				@Pc(42) Canvas local42 = (Canvas) local37.nextElement();
				@Pc(48) Long local48 = (Long) this.aHashtable15.get(local42);
				this.anOpenGL1.releaseSurface(local42, local48);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean399) {
			Static501.method7248(false, true);
			this.aBoolean399 = false;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZII)V")
	public void method4961(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "()Z")
	@Override
	public boolean method6208() {
		return this.aClass321_1.method7431();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(JB)V")
	public synchronized void method4962(@OriginalArg(0) long arg0) {
		@Pc(15) Class5 local15 = new Class5();
		local15.aLong329 = arg0;
		this.aClass124_57.method2574(local15);
	}

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "(I)V")
	public void method4963() {
		if (this.anInt5832 == 4) {
			return;
		}
		this.method4973();
		this.method4976(false);
		this.method4993(false);
		this.method4997(false);
		this.method4931(false);
		this.method4978(-2);
		this.method4922(1);
		this.anInt5832 = 4;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static440.method6582(this, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "()Z")
	@Override
	public boolean method6206() {
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(FFFI)V")
	private void method4964(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean417) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg0, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean417 = true;
	}

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "()Z")
	@Override
	public boolean method6207() {
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IFF)V")
	public void method4965(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat111 = arg0;
		this.aFloat95 = arg1;
		this.method4937();
	}

	@OriginalMember(owner = "client!kv", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4926();
		this.method4922(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!vl;B)V")
	public void method4966(@OriginalArg(0) Interface26 arg0) {
		if (this.aBoolean418) {
			this.method4991(arg0);
			this.method4968(arg0);
		} else if (this.anInt5824 >= 0 && arg0 == this.anInterface26Array3[this.anInt5824]) {
			this.anInterface26Array3[this.anInt5824--] = null;
			arg0.method7384();
			if (this.anInt5824 >= 0) {
				this.anInterface26_1 = this.anInterface26_2 = this.anInterface26Array3[this.anInt5824];
				this.anInterface26_1.method7380();
			} else {
				this.anInterface26_1 = this.anInterface26_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kv", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat105 != arg0) {
			this.aFloat105 = arg0;
			this.method4998();
		}
	}

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "(I)V")
	private void method4967() {
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.anInt5839; local5++) {
			@Pc(11) Class5_Sub3 local11 = this.aClass5_Sub3Array3[local5];
			@Pc(15) int local15 = local5 + 16386;
			Static392.aFloatArray45[0] = (float) local11.method8317();
			Static392.aFloatArray45[1] = (float) local11.method8313();
			Static392.aFloatArray45[2] = (float) local11.method8323();
			Static392.aFloatArray45[3] = 1.0F;
			OpenGL.glLightfv(local15, 4611, Static392.aFloatArray45, 0);
			@Pc(49) int local49 = local11.method8322();
			@Pc(55) float local55 = local11.method8314() / 255.0F;
			Static392.aFloatArray45[0] = (float) (local49 >> 16 & 0xFF) * local55;
			Static392.aFloatArray45[2] = (float) (local49 & 0xFF) * local55;
			Static392.aFloatArray45[1] = local55 * (float) (local49 >> 8 & 0xFF);
			OpenGL.glLightfv(local15, 4609, Static392.aFloatArray45, 0);
			OpenGL.glLightf(local15, 4617, 1.0F / (float) (local11.method8319() * local11.method8319()));
			OpenGL.glEnable(local15);
		}
		while (this.anInt5836 > local5) {
			OpenGL.glDisable(local5 + 16386);
			local5++;
		}
		this.anInt5836 = this.anInt5839;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!vl;I)V")
	public void method4968(@OriginalArg(0) Interface26 arg0) {
		if (this.anInt5826 < 0 || this.anInterface26Array2[this.anInt5826] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface26Array2[this.anInt5826--] = null;
		arg0.method7385();
		if (this.anInt5826 < 0) {
			this.anInterface26_2 = null;
		} else {
			this.anInterface26_2 = this.anInterface26Array2[this.anInt5826];
			this.anInterface26_2.method7383();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6254() {
		this.method4926();
		this.method4922(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kv", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean428 = true;
		this.anInt5859 = arg1;
		this.anInt5844 = arg3;
		this.anInt5856 = arg2;
		this.anInt5854 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(II)Lclient!vu;")
	@Override
	public Interface27 method6219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "(B)V")
	public void method4969() {
		if (this.anInt5832 == 2) {
			return;
		}
		this.method4973();
		this.method4976(false);
		this.method4993(false);
		this.method4997(false);
		this.method4931(false);
		this.method4978(-2);
		this.anInt5832 = 2;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!kb;ILclient!kb;Lclient!kb;Lclient!kb;)V")
	public void method4970(@OriginalArg(0) Class194 arg0, @OriginalArg(2) Class194 arg1, @OriginalArg(3) Class194 arg2, @OriginalArg(4) Class194 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method4983(arg0.anInterface8_2);
			OpenGL.glVertexPointer(arg0.aByte53, arg0.aShort62, this.anInterface8_5.method8687(), this.anInterface8_5.method8686() + (long) arg0.aByte54);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method4983(arg3.anInterface8_2);
			OpenGL.glNormalPointer(arg3.aShort62, this.anInterface8_5.method8687(), this.anInterface8_5.method8686() + (long) arg3.aByte54);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method4983(arg2.anInterface8_2);
			OpenGL.glColorPointer(arg2.aByte53, arg2.aShort62, this.anInterface8_5.method8687(), this.anInterface8_5.method8686() + (long) arg2.aByte54);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method4983(arg1.anInterface8_2);
			OpenGL.glTexCoordPointer(arg1.aByte53, arg1.aShort62, this.anInterface8_5.method8687(), this.anInterface8_5.method8686() + (long) arg1.aByte54);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "(II)I")
	public int method4971(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(ZII)V")
	public void method4972(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.method4956(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "(Z)V")
	private void method4973() {
		if (this.anInt5849 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt5794 > 0 && this.anInt5737 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt5794, (double) this.anInt5737, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt5849 = 1;
		this.anInt5832 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!kv", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt5862;
		arg0[1] = this.anInt5864;
		arg0[0] = this.anInt5851;
		arg0[2] = this.anInt5842;
	}

	@OriginalMember(owner = "client!kv", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method4926();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method4922(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean405) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean405) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!kv", name = "v", descriptor = "()I")
	@Override
	public int method6237() {
		return 4;
	}

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "(Z)V")
	private void method4974() {
		@Pc(9) int local9 = 0;
		while (!this.anOpenGL1.a()) {
			if (local9++ > 5) {
				throw new RuntimeException("");
			}
			Static127.method1985(1000L);
		}
	}

	@OriginalMember(owner = "client!kv", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean415 = arg0;
		this.method4980();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I[Lclient!jw;)V")
	@Override
	public void method6210(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub3[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass5_Sub3Array3[local7] = arg1[local7];
		}
		this.anInt5839 = arg0;
		if (this.anInt5849 != 1) {
			this.method4967();
		}
	}

	@OriginalMember(owner = "client!kv", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5833 = arg3;
		this.anInt5860 = arg0;
		this.anInt5866 = arg1;
		this.anInt5858 = arg2;
		this.method4935();
		this.method4928();
		if (this.anInt5849 == 3) {
			this.method5001();
		} else if (this.anInt5849 == 2) {
			this.method4995();
		}
	}

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "(Z)I")
	private int method4975() {
		this.aString56 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString55 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString56.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString56.indexOf("brian paul") != -1 || this.aString56.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static466.method6897(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(65) int local65 = Static171.method2534(local53[0]);
				@Pc(71) int local71 = Static171.method2534(local53[1]);
				this.anInt5840 = local65 * 10 + local71;
			} catch (@Pc(81) NumberFormatException local81) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt5840 < 12) {
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
		this.anInt5834 = local121[0];
		OpenGL.glGetIntegerv(34929, local121, 0);
		this.anInt5865 = local121[0];
		OpenGL.glGetIntegerv(34930, local121, 0);
		this.anInt5852 = local121[0];
		if (this.anInt5834 < 2 || this.anInt5865 < 2 || this.anInt5852 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean408 = Stream.a();
		this.aBoolean404 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean411 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean405 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean425 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean412 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean421 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean413 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean424 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean416 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean410 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean406 = false;
		this.aBoolean420 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean418 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean419 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean426 = this.aBoolean419 & this.aBoolean418;
		this.aBoolean422 = Class83.aString16.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static448.aFloatArray63, 0);
		this.aFloat113 = Static448.aFloatArray63[0];
		this.aFloat114 = Static448.aFloatArray63[1];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZ)V")
	public void method4976(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean407 != arg0) {
			this.aBoolean407 = arg0;
			this.method4939();
			this.anInt5832 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "(I)V")
	public void method4977() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!kv", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean428) {
			throw new RuntimeException("");
		}
		this.anInt5844 = arg3;
		this.anInt5856 = arg2;
		this.anInt5859 = arg1;
		this.anInt5854 = arg0;
		if (this.aBoolean403) {
			this.aClass321_1.aClass19_Sub6_1.method4770();
			this.aClass321_1.aClass19_Sub6_1.method4772();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6216(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!kv", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt5821 = 0;
		while (arg0 > 1) {
			this.anInt5821++;
			arg0 >>= 0x1;
		}
		this.anInt5823 = 0x1 << this.anInt5821;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(BI)V")
	public void method4978(@OriginalArg(1) int arg0) {
		this.method4972(true, arg0);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass131_1.method2748(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "()Z")
	@Override
	public boolean method6213() {
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "(I)V")
	private void method4979() {
		this.aFloatArray38[10] = this.aFloat115;
		this.aFloatArray38[14] = this.aFloat104;
		this.aFloat107 = (this.aFloatArray38[14] - (float) this.anInt5853) / this.aFloatArray38[10];
		this.aFloat103 = (float) this.anInt5853;
	}

	@OriginalMember(owner = "client!kv", name = "u", descriptor = "(I)V")
	private void method4980() {
		OpenGL.glDepthMask(this.aBoolean401 && this.aBoolean415);
	}

	@OriginalMember(owner = "client!kv", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt5850 != arg0;
		if (local15 || arg1 != this.aFloat97 || this.aFloat108 != arg2) {
			this.anInt5850 = arg0;
			this.aFloat97 = arg1;
			this.aFloat108 = arg2;
			if (local15) {
				this.aFloat96 = (float) (this.anInt5850 & 0xFF) / 255.0F;
				this.aFloat98 = (float) (this.anInt5850 & 0xFF00) / 65280.0F;
				this.aFloat100 = (float) (this.anInt5850 & 0xFF0000) / 1.671168E7F;
				this.method4998();
			}
			this.method4934();
		}
		if (this.aFloatArray41[0] == arg3 && this.aFloatArray41[1] == arg4 && this.aFloatArray41[2] == arg5) {
			return;
		}
		this.aFloatArray41[1] = arg4;
		this.aFloatArray41[0] = arg3;
		this.aFloatArray41[2] = arg5;
		this.aFloatArray42[0] = -arg3;
		this.aFloatArray42[2] = -arg5;
		this.aFloatArray42[1] = -arg4;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray40[1] = local142 * arg4;
		this.aFloatArray40[0] = local142 * arg3;
		this.aFloatArray40[2] = local142 * arg5;
		this.aFloatArray39[2] = -this.aFloatArray40[2];
		this.aFloatArray39[1] = -this.aFloatArray40[1];
		this.aFloatArray39[0] = -this.aFloatArray40[0];
		this.method4924();
		this.anInt5843 = (int) (arg5 * 256.0F / arg4);
		this.anInt5863 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BZ)V")
	public void method4981(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean423 != arg0) {
			this.aBoolean423 = arg0;
			this.method4985();
		}
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(BI)V")
	public void method4982(@OriginalArg(1) int arg0) {
		Static448.aFloatArray63[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static448.aFloatArray63[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static448.aFloatArray63[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static448.aFloatArray63[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static448.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!ic;I)V")
	public void method4983(@OriginalArg(0) Interface8 arg0) {
		if (this.anInterface8_5 != arg0) {
			if (this.aBoolean411) {
				OpenGL.glBindBufferARB(34962, arg0.method8685());
			}
			this.anInterface8_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(FFZFF)V")
	public void method4984(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static448.aFloatArray63[0] = arg0;
		Static448.aFloatArray63[2] = arg2;
		Static448.aFloatArray63[3] = arg3;
		Static448.aFloatArray63[1] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static448.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "(Z)V")
	private void method4985() {
		if (this.aBoolean409 && !this.aBoolean423) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
	@Override
	public void method6190(@OriginalArg(0) int arg0) {
		this.method4949();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!hea;)V")
	@Override
	public void method6215(@OriginalArg(0) Class149 arg0) {
		this.aClass200_1.method4091(this, arg0, -1);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "([I)V")
	@Override
	public void method6236(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5794;
		arg0[1] = this.anInt5737;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6266(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas8) {
			local5 = this.aLong164;
		} else if (this.aHashtable15.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable15.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas7 == arg0) {
			this.method4925();
		}
	}

	@OriginalMember(owner = "client!kv", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Class44_Sub1_Sub1 local9 = local6.aClass44_Sub1_Sub1_3;
		this.method4969();
		this.method4945(local6.aClass44_Sub1_Sub1_3);
		this.method4922(1);
		this.method4940(7681, 8448);
		this.method4947(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat11 / (float) local9.anInt850;
		@Pc(46) float local46 = local9.aFloat12 / (float) local9.anInt848;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5851 - arg2), (float) (this.anInt5864 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5851, this.anInt5864);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5851 - arg2), (float) (this.anInt5862 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5851, this.anInt5862);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5842 - arg2), (float) (this.anInt5862 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5842, this.anInt5862);
		OpenGL.glTexCoord2f((float) (this.anInt5842 - arg2) * local39, local46 * (float) (this.anInt5864 - arg3));
		OpenGL.glVertex2i(this.anInt5842, this.anInt5864);
		OpenGL.glEnd();
		this.method4947(768, 0, 5890);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I[BIIZ)Lclient!ic;")
	public Interface8 method4986(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		return (Interface8) (this.aBoolean411 && (!arg3 || this.aBoolean414) ? new Class30_Sub1(this, arg2, arg1, arg0, arg3) : new Class292_Sub2(this, arg2, arg1, arg0));
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "()V")
	@Override
	public void method6189() {
		if (this.aClass5_Sub17_Sub1_1 != null && this.aClass5_Sub17_Sub1_1.method1735()) {
			this.aClass131_1.method2749(this.aClass5_Sub17_Sub1_1);
			this.aClass341_1.method7845();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "()V")
	@Override
	public void method6185() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!kv", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method4922(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!kv", name = "w", descriptor = "()Z")
	@Override
	public boolean method6240() {
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!vl;Z)V")
	public void method4987(@OriginalArg(0) Interface26 arg0) {
		if (this.aBoolean418) {
			this.method4923(arg0);
			this.method4989(arg0);
		} else if (this.anInt5824 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt5824 >= 0) {
				this.anInterface26Array3[this.anInt5824].method7384();
			}
			this.anInterface26_1 = this.anInterface26_2 = this.anInterface26Array3[++this.anInt5824] = arg0;
			this.anInterface26_1.method7380();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!ag;Lclient!ag;FLclient!ag;)Lclient!ag;")
	@Override
	public Class11 method6267(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class11 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean416 && this.aBoolean420) {
			@Pc(15) Class11_Sub1_Sub1 local15 = null;
			@Pc(18) Class11_Sub1 local18 = (Class11_Sub1) arg0;
			@Pc(21) Class11_Sub1 local21 = (Class11_Sub1) arg1;
			@Pc(25) Class44_Sub3 local25 = local18.method3582();
			@Pc(29) Class44_Sub3 local29 = local21.method3582();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local29.anInt6605 >= local25.anInt6605 ? local29.anInt6605 : local25.anInt6605;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class11_Sub1_Sub1) {
					@Pc(60) Class11_Sub1_Sub1 local60 = (Class11_Sub1_Sub1) arg3;
					if (local48 == local60.method1997()) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class11_Sub1_Sub1(this, local48);
				}
				if (local15.method1998(arg2, local25, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "()Z")
	@Override
	public boolean method6231() {
		return this.aBoolean405 && (!this.method6224() || this.aBoolean426);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!hea;I)V")
	@Override
	public void method6233(@OriginalArg(0) Class149 arg0, @OriginalArg(1) int arg1) {
		this.aClass200_1.method4091(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!kv", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg5;
		@Pc(9) Class44_Sub1_Sub1 local9 = local6.aClass44_Sub1_Sub1_3;
		this.method4969();
		this.method4945(local6.aClass44_Sub1_Sub1_3);
		this.method4922(1);
		this.method4940(7681, 8448);
		this.method4947(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat11 / (float) local9.anInt850;
		@Pc(46) float local46 = local9.aFloat12 / (float) local9.anInt848;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(59) float local59 = (float) arg3 - (float) arg1;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local53 * local53)));
		@Pc(76) float local76 = local59 * local72;
		@Pc(80) float local80 = local53 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local80 + 0.35F, local76 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method4947(768, 0, 5890);
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(II)I")
	@Override
	public int method6226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(ILclient!vl;)V")
	public void method4989(@OriginalArg(1) Interface26 arg0) {
		if (this.anInt5826 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5826 >= 0) {
			this.anInterface26Array2[this.anInt5826].method7385();
		}
		this.anInterface26_2 = this.anInterface26Array2[++this.anInt5826] = arg0;
		this.anInterface26_2.method7383();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!nea;Lclient!vu;)Lclient!cp;")
	@Override
	public Interface2 method6228(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Interface27 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(Lclient!vl;Z)V")
	public void method4991(@OriginalArg(0) Interface26 arg0) {
		if (this.anInt5825 < 0 || this.anInterface26Array1[this.anInt5825] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface26Array1[this.anInt5825--] = null;
		arg0.method7382();
		if (this.anInt5825 >= 0) {
			this.anInterface26_1 = this.anInterface26Array1[this.anInt5825];
			this.anInterface26_1.method7381();
		} else {
			this.anInterface26_1 = null;
		}
	}

	@OriginalMember(owner = "client!kv", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = (float) arg0 * this.aClass56_Sub3_3.aFloat180 + (float) arg1 * this.aClass56_Sub3_3.aFloat182 + this.aClass56_Sub3_3.aFloat188 * (float) arg2 + this.aClass56_Sub3_3.aFloat183;
		if ((float) this.anInt5841 > local28 || (float) this.anInt5853 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((float) this.anInt5858 * (this.aClass56_Sub3_3.aFloat185 + (float) arg2 * this.aClass56_Sub3_3.aFloat187 + (float) arg1 * this.aClass56_Sub3_3.aFloat177 + this.aClass56_Sub3_3.aFloat181 * (float) arg0) / (float) arg3);
		@Pc(119) int local119 = (int) ((this.aClass56_Sub3_3.aFloat186 + this.aClass56_Sub3_3.aFloat179 * (float) arg2 + this.aClass56_Sub3_3.aFloat178 * (float) arg0 + (float) arg1 * this.aClass56_Sub3_3.aFloat184) * (float) this.anInt5833 / (float) arg3);
		if ((float) local86 >= this.aFloat109 && this.aFloat110 >= (float) local86 && (float) local119 >= this.aFloat102 && this.aFloat112 >= (float) local119) {
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local119 - this.aFloat102);
			arg4[0] = (int) ((float) local86 - this.aFloat109);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!kv", name = "w", descriptor = "(I)V")
	public void method4992() {
		if (this.anInt5849 != 0) {
			this.anInt5832 &= 0xFFFFFFE0;
			this.anInt5849 = 0;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZB)V")
	public void method4993(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean409 != arg0) {
			this.aBoolean409 = arg0;
			this.method4985();
			this.anInt5832 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "(II)Lclient!nea;")
	@Override
	public Interface17 method6262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6188(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static139.aFloat47 = arg1;
		Static226.aFloat54 = arg0;
		Static322.aFloat116 = arg2;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(ZI)V")
	public void method4994(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method4940(7681, 7681);
		} else if (arg0 == 0) {
			this.method4940(8448, 8448);
		} else if (arg0 == 2) {
			this.method4940(34165, 7681);
			return;
		} else if (arg0 == 3) {
			this.method4940(260, 8448);
			return;
		} else if (arg0 == 4) {
			this.method4940(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6217(@OriginalArg(0) Class5_Sub26 arg0) {
		this.aNativeHeap4 = ((Class5_Sub26_Sub2) arg0).aNativeHeap5;
		if (this.anInterface8_4 != null) {
			return;
		}
		@Pc(16) Class5_Sub15_Sub1 local16 = new Class5_Sub15_Sub1(80);
		if (this.aBoolean408) {
			local16.method1614(-1.0F);
			local16.method1614(-1.0F);
			local16.method1614(0.0F);
			local16.method1614(0.0F);
			local16.method1614(1.0F);
			local16.method1614(1.0F);
			local16.method1614(-1.0F);
			local16.method1614(0.0F);
			local16.method1614(1.0F);
			local16.method1614(1.0F);
			local16.method1614(1.0F);
			local16.method1614(1.0F);
			local16.method1614(0.0F);
			local16.method1614(1.0F);
			local16.method1614(0.0F);
			local16.method1614(-1.0F);
			local16.method1614(1.0F);
			local16.method1614(0.0F);
			local16.method1614(0.0F);
			local16.method1614(0.0F);
		} else {
			local16.method1612(-1.0F);
			local16.method1612(-1.0F);
			local16.method1612(0.0F);
			local16.method1612(0.0F);
			local16.method1612(1.0F);
			local16.method1612(1.0F);
			local16.method1612(-1.0F);
			local16.method1612(0.0F);
			local16.method1612(1.0F);
			local16.method1612(1.0F);
			local16.method1612(1.0F);
			local16.method1612(1.0F);
			local16.method1612(0.0F);
			local16.method1612(1.0F);
			local16.method1612(0.0F);
			local16.method1612(-1.0F);
			local16.method1612(1.0F);
			local16.method1612(0.0F);
			local16.method1612(0.0F);
			local16.method1612(0.0F);
		}
		this.anInterface8_4 = this.method4986(local16.anInt4144, local16.aByteArray45, 20, false);
		this.aClass194_7 = new Class194(this.anInterface8_4, 5126, 3, 0);
		this.aClass194_8 = new Class194(this.anInterface8_4, 5126, 2, 12);
		this.aClass200_1.method4096(this);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "([IIIIIZ)Lclient!qda;")
	@Override
	public Class59 method6246(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class59_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!kv", name = "x", descriptor = "(I)V")
	private void method4995() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray38, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIIIZ)Lclient!qda;")
	@Override
	public Class59 method6265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class59_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
	@Override
	public void method6186(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method6216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4926();
		this.method4922(arg5);
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

	@OriginalMember(owner = "client!kv", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt5860, this.anInt5866, this.anInt5858, this.anInt5833 };
	}

	@OriginalMember(owner = "client!kv", name = "y", descriptor = "(I)V")
	private void method4996() {
		if (this.anInt5849 != 3) {
			this.anInt5849 = 3;
			this.method5001();
			this.method4960();
			this.anInt5832 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6261(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas8) {
			throw new RuntimeException();
		} else if (!this.aHashtable15.containsKey(arg0)) {
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
			this.aHashtable15.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method4926();
		this.method4922(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean405) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean405) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(ZI)V")
	public void method4997(@OriginalArg(0) boolean arg0) {
		if (this.bf == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.bf = arg0;
		this.anInt5832 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!kv", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt5864 = 0;
		this.anInt5851 = 0;
		this.anInt5842 = this.anInt5794;
		this.anInt5862 = this.anInt5737;
		OpenGL.glDisable(3089);
		this.method4928();
	}

	@OriginalMember(owner = "client!kv", name = "z", descriptor = "(I)V")
	private void method4998() {
		Static448.aFloatArray63[0] = this.aFloat100 * this.aFloat105;
		Static448.aFloatArray63[2] = this.aFloat96 * this.aFloat105;
		Static448.aFloatArray63[3] = 1.0F;
		Static448.aFloatArray63[1] = this.aFloat98 * this.aFloat105;
		OpenGL.glLightModelfv(2899, Static448.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIZ)Lclient!qda;")
	@Override
	public Class59 method6263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class59_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kv", name = "A", descriptor = "(I)V")
	public void method4999() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!kv", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt5828 + this.anInt5829 + this.anInt5827;
	}

	@OriginalMember(owner = "client!kv", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < this.anInt5862) {
			this.anInt5862 = arg3;
		}
		if (this.anInt5864 < arg1) {
			this.anInt5864 = arg1;
		}
		if (this.anInt5842 > arg2) {
			this.anInt5842 = arg2;
		}
		if (this.anInt5851 < arg0) {
			this.anInt5851 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method4928();
		this.method4942();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(FB)V")
	public void method5000(@OriginalArg(0) float arg0) {
		if (this.aFloat106 == arg0) {
			return;
		}
		this.aFloat106 = arg0;
		if (this.anInt5849 == 3) {
			this.method5001();
			return;
		}
	}

	@OriginalMember(owner = "client!kv", name = "B", descriptor = "(I)V")
	private void method5001() {
		@Pc(15) float local15 = (float) -this.anInt5860 * this.aFloat106 / (float) this.anInt5858;
		@Pc(27) float local27 = this.aFloat106 * (float) -this.anInt5866 / (float) this.anInt5833;
		@Pc(42) float local42 = (float) (this.anInt5794 - this.anInt5860) * this.aFloat106 / (float) this.anInt5858;
		@Pc(57) float local57 = (float) (this.anInt5737 - this.anInt5866) * this.aFloat106 / (float) this.anInt5833;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local42 && local27 != local57) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) this.anInt5841, (double) this.anInt5853);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kv", name = "z", descriptor = "()Z")
	@Override
	public boolean method6260() {
		return this.aClass5_Sub17_Sub1_1 != null && (this.anInt5816 <= 1 || this.aBoolean426);
	}

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "(II)I")
	public int method5002(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!kv", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt5853;
	}

	@OriginalMember(owner = "client!kv", name = "C", descriptor = "(I)V")
	private void method5003() {
		this.aClass44Array1 = new Class44[this.anInt5834];
		this.aClass44_Sub1_6 = new Class44_Sub1(this, 3553, 6408, 1, 1);
		new Class44_Sub1(this, 3553, 6408, 1, 1);
		new Class44_Sub1(this, 3553, 6408, 1, 1);
		this.aClass114_Sub3_1 = new Class114_Sub3(this);
		this.aClass114_Sub3_7 = new Class114_Sub3(this);
		this.aClass114_Sub3_4 = new Class114_Sub3(this);
		this.aClass114_Sub3_10 = new Class114_Sub3(this);
		this.aClass114_Sub3_6 = new Class114_Sub3(this);
		this.aClass114_Sub3_9 = new Class114_Sub3(this);
		this.aClass114_Sub3_5 = new Class114_Sub3(this);
		this.aClass114_Sub3_2 = new Class114_Sub3(this);
		this.aClass114_Sub3_3 = new Class114_Sub3(this);
		this.aClass114_Sub3_8 = new Class114_Sub3(this);
		if (this.aBoolean420) {
			this.aClass318_7 = new Class318(this);
			new Class318(this);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!mda;IIII)V")
	public void method5004(@OriginalArg(0) Interface15 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg0.method8492();
		@Pc(14) int local14 = arg2 * this.method5002(local7);
		this.method4952(arg0);
		OpenGL.glDrawElements(4, arg1, local7, (long) local14 + arg0.method8494());
	}

	@OriginalMember(owner = "client!kv", name = "D", descriptor = "(I)V")
	public void method5005() {
		if (this.anInt5832 == 16) {
			return;
		}
		this.method4996();
		this.method4976(true);
		this.method4997(true);
		this.method4931(true);
		this.method4922(1);
		this.anInt5832 = 16;
	}

	@OriginalMember(owner = "client!kv", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt5846 && this.anInt5838 == arg1 && this.anInt5848 == arg2) {
			return;
		}
		this.anInt5848 = arg2;
		this.anInt5846 = arg0;
		this.anInt5838 = arg1;
		this.method4937();
		this.method4939();
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "()V")
	@Override
	public void method6198() {
		if (this.aBoolean420) {
			if (this.aClass318_6 != this.anInterface26_2) {
				throw new RuntimeException();
			}
			this.aClass318_6.method7388(0);
			this.aClass318_6.method7388(8);
			this.method4966(this.aClass318_6);
		} else if (this.aBoolean404) {
			this.aClass59_Sub2_1.method8054(0, 0, this.anInt5794, this.anInt5737, 0, 0);
			this.anOpenGL1.setSurface(this.aLong163);
		} else {
			throw new RuntimeException("");
		}
		this.anInt5737 = this.anInt5776;
		this.anInt5794 = this.anInt5739;
		this.aClass59_Sub2_1 = null;
		this.method4992();
		this.method4938();
		this.la();
	}

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass56_Sub3_3.aFloat183 + (float) arg2 * this.aClass56_Sub3_3.aFloat188 + (float) arg0 * this.aClass56_Sub3_3.aFloat180 + this.aClass56_Sub3_3.aFloat182 * (float) arg1;
		@Pc(55) float local55 = this.aClass56_Sub3_3.aFloat182 * (float) arg4 + (float) arg3 * this.aClass56_Sub3_3.aFloat180 + (float) arg5 * this.aClass56_Sub3_3.aFloat188 + this.aClass56_Sub3_3.aFloat183;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt5841 > local30 && local55 < (float) this.anInt5841) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt5853 && (float) this.anInt5853 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass56_Sub3_3.aFloat185 + this.aClass56_Sub3_3.aFloat177 * (float) arg1 + this.aClass56_Sub3_3.aFloat181 * (float) arg0 + this.aClass56_Sub3_3.aFloat187 * (float) arg2) * (float) this.anInt5858 / (float) arg6);
		@Pc(157) int local157 = (int) ((this.aClass56_Sub3_3.aFloat185 + (float) arg4 * this.aClass56_Sub3_3.aFloat177 + this.aClass56_Sub3_3.aFloat181 * (float) arg3 + this.aClass56_Sub3_3.aFloat187 * (float) arg5) * (float) this.anInt5858 / (float) arg6);
		if (this.aFloat109 > (float) local124 && this.aFloat109 > (float) local157) {
			local57 |= 0x1;
		} else if ((float) local124 > this.aFloat110 && (float) local157 > this.aFloat110) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt5833 * (this.aClass56_Sub3_3.aFloat179 * (float) arg2 + this.aClass56_Sub3_3.aFloat184 * (float) arg1 + (float) arg0 * this.aClass56_Sub3_3.aFloat178 + this.aClass56_Sub3_3.aFloat186) / (float) arg6);
		@Pc(257) int local257 = (int) ((this.aClass56_Sub3_3.aFloat186 + (float) arg5 * this.aClass56_Sub3_3.aFloat179 + (float) arg4 * this.aClass56_Sub3_3.aFloat184 + (float) arg3 * this.aClass56_Sub3_3.aFloat178) * (float) this.anInt5833 / (float) arg6);
		if (this.aFloat102 > (float) local224 && this.aFloat102 > (float) local257) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat112 && (float) local257 > this.aFloat112) {
			local57 |= 0x8;
		}
		return local57;
	}
}
