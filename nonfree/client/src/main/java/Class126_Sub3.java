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

@OriginalClass("client!rda")
public final class Class126_Sub3 extends Class126 {

	@OriginalMember(owner = "client!rda", name = "E", descriptor = "I")
	public int anInt8084;

	@OriginalMember(owner = "client!rda", name = "I", descriptor = "I")
	private int anInt8087;

	@OriginalMember(owner = "client!rda", name = "wc", descriptor = "I")
	private int anInt8175;

	@OriginalMember(owner = "client!rda", name = "zc", descriptor = "I")
	public int anInt8178;

	@OriginalMember(owner = "client!rda", name = "ye", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!rda", name = "ze", descriptor = "I")
	public int anInt8272;

	@OriginalMember(owner = "client!rda", name = "Fe", descriptor = "Lclient!ua;")
	private Interface26 anInterface26_1;

	@OriginalMember(owner = "client!rda", name = "Ge", descriptor = "Lclient!ua;")
	private Interface26 anInterface26_2;

	@OriginalMember(owner = "client!rda", name = "Ke", descriptor = "Lclient!ip;")
	private Class44_Sub2 aClass44_Sub2_1;

	@OriginalMember(owner = "client!rda", name = "Le", descriptor = "Lclient!nh;")
	private Class243 aClass243_1;

	@OriginalMember(owner = "client!rda", name = "Oe", descriptor = "I")
	public int anInt8277;

	@OriginalMember(owner = "client!rda", name = "Qe", descriptor = "I")
	private int anInt8278;

	@OriginalMember(owner = "client!rda", name = "Re", descriptor = "I")
	public int anInt8279;

	@OriginalMember(owner = "client!rda", name = "Ye", descriptor = "I")
	private int anInt8280;

	@OriginalMember(owner = "client!rda", name = "Ze", descriptor = "I")
	private int anInt8281;

	@OriginalMember(owner = "client!rda", name = "af", descriptor = "I")
	private int anInt8282;

	@OriginalMember(owner = "client!rda", name = "bf", descriptor = "Z")
	private boolean bf;

	@OriginalMember(owner = "client!rda", name = "cf", descriptor = "J")
	private long aLong220;

	@OriginalMember(owner = "client!rda", name = "df", descriptor = "Z")
	private boolean aBoolean663;

	@OriginalMember(owner = "client!rda", name = "ef", descriptor = "Z")
	private boolean aBoolean664;

	@OriginalMember(owner = "client!rda", name = "gf", descriptor = "Z")
	private boolean aBoolean665;

	@OriginalMember(owner = "client!rda", name = "sf", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!rda", name = "vf", descriptor = "I")
	private int anInt8284;

	@OriginalMember(owner = "client!rda", name = "wf", descriptor = "[Lclient!iga;")
	private Class24[] aClass24Array1;

	@OriginalMember(owner = "client!rda", name = "xf", descriptor = "Lclient!nk;")
	public Class180_Sub2 aClass180_Sub2_1;

	@OriginalMember(owner = "client!rda", name = "yf", descriptor = "I")
	private int anInt8285;

	@OriginalMember(owner = "client!rda", name = "Af", descriptor = "Z")
	public boolean aBoolean669;

	@OriginalMember(owner = "client!rda", name = "Bf", descriptor = "Z")
	private boolean aBoolean670;

	@OriginalMember(owner = "client!rda", name = "Df", descriptor = "F")
	private float aFloat160;

	@OriginalMember(owner = "client!rda", name = "Ff", descriptor = "Z")
	private boolean aBoolean671;

	@OriginalMember(owner = "client!rda", name = "If", descriptor = "I")
	private int anInt8290;

	@OriginalMember(owner = "client!rda", name = "Jf", descriptor = "Lclient!cs;")
	private Interface7 anInterface7_5;

	@OriginalMember(owner = "client!rda", name = "Kf", descriptor = "I")
	public int anInt8291;

	@OriginalMember(owner = "client!rda", name = "Nf", descriptor = "Lclient!nk;")
	public Class180_Sub2 aClass180_Sub2_2;

	@OriginalMember(owner = "client!rda", name = "Of", descriptor = "I")
	private int anInt8294;

	@OriginalMember(owner = "client!rda", name = "Qf", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!rda", name = "Rf", descriptor = "Z")
	public boolean aBoolean672;

	@OriginalMember(owner = "client!rda", name = "Tf", descriptor = "Z")
	public boolean aBoolean673;

	@OriginalMember(owner = "client!rda", name = "Uf", descriptor = "Z")
	public boolean aBoolean674;

	@OriginalMember(owner = "client!rda", name = "Wf", descriptor = "Lclient!nk;")
	public Class180_Sub2 aClass180_Sub2_3;

	@OriginalMember(owner = "client!rda", name = "Xf", descriptor = "Z")
	private boolean aBoolean676;

	@OriginalMember(owner = "client!rda", name = "Yf", descriptor = "Lclient!nk;")
	public Class180_Sub2 aClass180_Sub2_4;

	@OriginalMember(owner = "client!rda", name = "ag", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!rda", name = "dg", descriptor = "I")
	private int anInt8298;

	@OriginalMember(owner = "client!rda", name = "fg", descriptor = "Z")
	public boolean aBoolean678;

	@OriginalMember(owner = "client!rda", name = "hg", descriptor = "Lclient!nk;")
	public Class180_Sub2 aClass180_Sub2_5;

	@OriginalMember(owner = "client!rda", name = "ig", descriptor = "Lclient!qd;")
	private Class24_Sub4_Sub1 aClass24_Sub4_Sub1_5;

	@OriginalMember(owner = "client!rda", name = "jg", descriptor = "Lclient!as;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!rda", name = "kg", descriptor = "I")
	public int anInt8300;

	@OriginalMember(owner = "client!rda", name = "lg", descriptor = "Lclient!sia;")
	public Class24_Sub4 aClass24_Sub4_2;

	@OriginalMember(owner = "client!rda", name = "qg", descriptor = "Lclient!nk;")
	public Class180_Sub2 aClass180_Sub2_6;

	@OriginalMember(owner = "client!rda", name = "rg", descriptor = "Lclient!nh;")
	public Class243 aClass243_2;

	@OriginalMember(owner = "client!rda", name = "sg", descriptor = "Ljava/lang/String;")
	private String aString116;

	@OriginalMember(owner = "client!rda", name = "ug", descriptor = "Lclient!im;")
	public Class159 aClass159_13;

	@OriginalMember(owner = "client!rda", name = "wg", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!rda", name = "xg", descriptor = "F")
	private float aFloat168;

	@OriginalMember(owner = "client!rda", name = "zg", descriptor = "I")
	private int anInt8305;

	@OriginalMember(owner = "client!rda", name = "Ag", descriptor = "Lclient!nk;")
	public Class180_Sub2 aClass180_Sub2_7;

	@OriginalMember(owner = "client!rda", name = "Bg", descriptor = "Lclient!nk;")
	public Class180_Sub2 aClass180_Sub2_8;

	@OriginalMember(owner = "client!rda", name = "Eg", descriptor = "Lclient!nk;")
	public Class180_Sub2 aClass180_Sub2_9;

	@OriginalMember(owner = "client!rda", name = "Fg", descriptor = "F")
	private float aFloat170;

	@OriginalMember(owner = "client!rda", name = "Hg", descriptor = "Lclient!ega;")
	private Class91_Sub1 aClass91_Sub1_1;

	@OriginalMember(owner = "client!rda", name = "Ig", descriptor = "Ljava/lang/String;")
	private String aString117;

	@OriginalMember(owner = "client!rda", name = "Jg", descriptor = "Z")
	public boolean aBoolean681;

	@OriginalMember(owner = "client!rda", name = "Kg", descriptor = "Z")
	public boolean aBoolean682;

	@OriginalMember(owner = "client!rda", name = "Lg", descriptor = "Z")
	public boolean aBoolean683;

	@OriginalMember(owner = "client!rda", name = "Mg", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!rda", name = "Og", descriptor = "Lclient!im;")
	public Class159 aClass159_14;

	@OriginalMember(owner = "client!rda", name = "Sg", descriptor = "I")
	public int anInt8309;

	@OriginalMember(owner = "client!rda", name = "Vg", descriptor = "Z")
	private boolean aBoolean684;

	@OriginalMember(owner = "client!rda", name = "Wg", descriptor = "Lclient!cs;")
	private Interface7 anInterface7_6;

	@OriginalMember(owner = "client!rda", name = "Yg", descriptor = "I")
	private int anInt8311;

	@OriginalMember(owner = "client!rda", name = "Zg", descriptor = "Z")
	private boolean aBoolean686;

	@OriginalMember(owner = "client!rda", name = "ah", descriptor = "Z")
	public boolean aBoolean687;

	@OriginalMember(owner = "client!rda", name = "fh", descriptor = "I")
	public int anInt8315;

	@OriginalMember(owner = "client!rda", name = "gh", descriptor = "Z")
	public boolean aBoolean688;

	@OriginalMember(owner = "client!rda", name = "ih", descriptor = "Z")
	private boolean aBoolean689;

	@OriginalMember(owner = "client!rda", name = "jh", descriptor = "Z")
	private boolean aBoolean690;

	@OriginalMember(owner = "client!rda", name = "kh", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!rda", name = "lh", descriptor = "I")
	private int anInt8316;

	@OriginalMember(owner = "client!rda", name = "qh", descriptor = "Lclient!nk;")
	public Class180_Sub2 aClass180_Sub2_10;

	@OriginalMember(owner = "client!rda", name = "th", descriptor = "I")
	private int anInt8317;

	@OriginalMember(owner = "client!rda", name = "wh", descriptor = "I")
	private int anInt8318;

	@OriginalMember(owner = "client!rda", name = "Y", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!rda", name = "pe", descriptor = "I")
	public int anInt8267 = 128;

	@OriginalMember(owner = "client!rda", name = "ue", descriptor = "Lclient!fn;")
	private final Class114 aClass114_1 = new Class114();

	@OriginalMember(owner = "client!rda", name = "ve", descriptor = "Lclient!ria;")
	private final Class117_Sub3 aClass117_Sub3_1 = new Class117_Sub3();

	@OriginalMember(owner = "client!rda", name = "we", descriptor = "Lclient!ria;")
	public final Class117_Sub3 aClass117_Sub3_2 = new Class117_Sub3();

	@OriginalMember(owner = "client!rda", name = "xe", descriptor = "I")
	public int anInt8271 = 3;

	@OriginalMember(owner = "client!rda", name = "Be", descriptor = "Z")
	private boolean aBoolean662 = false;

	@OriginalMember(owner = "client!rda", name = "Ce", descriptor = "I")
	public int anInt8273 = 8;

	@OriginalMember(owner = "client!rda", name = "De", descriptor = "Lclient!ro;")
	private final Class306 aClass306_46 = new Class306();

	@OriginalMember(owner = "client!rda", name = "Ee", descriptor = "[Lclient!ua;")
	private final Interface26[] anInterface26Array1 = new Interface26[4];

	@OriginalMember(owner = "client!rda", name = "He", descriptor = "[Lclient!ua;")
	private final Interface26[] anInterface26Array2 = new Interface26[4];

	@OriginalMember(owner = "client!rda", name = "Ie", descriptor = "I")
	private int anInt8274 = -1;

	@OriginalMember(owner = "client!rda", name = "Me", descriptor = "I")
	private int anInt8275 = -1;

	@OriginalMember(owner = "client!rda", name = "Je", descriptor = "[Lclient!ua;")
	private final Interface26[] anInterface26Array3 = new Interface26[4];

	@OriginalMember(owner = "client!rda", name = "Ne", descriptor = "I")
	private int anInt8276 = -1;

	@OriginalMember(owner = "client!rda", name = "Pe", descriptor = "Lclient!ro;")
	private final Class306 aClass306_47;

	@OriginalMember(owner = "client!rda", name = "Se", descriptor = "Lclient!ro;")
	private final Class306 aClass306_48;

	@OriginalMember(owner = "client!rda", name = "Te", descriptor = "Lclient!ro;")
	private final Class306 aClass306_49;

	@OriginalMember(owner = "client!rda", name = "Ue", descriptor = "Lclient!ro;")
	private final Class306 aClass306_50;

	@OriginalMember(owner = "client!rda", name = "Ve", descriptor = "Lclient!ro;")
	private final Class306 aClass306_51;

	@OriginalMember(owner = "client!rda", name = "We", descriptor = "Lclient!ro;")
	private final Class306 aClass306_52;

	@OriginalMember(owner = "client!rda", name = "Xe", descriptor = "Lclient!ro;")
	private final Class306 aClass306_53;

	@OriginalMember(owner = "client!rda", name = "ff", descriptor = "Lclient!ria;")
	public final Class117_Sub3 aClass117_Sub3_3;

	@OriginalMember(owner = "client!rda", name = "hf", descriptor = "Lclient!ria;")
	public final Class117_Sub3 aClass117_Sub3_4;

	@OriginalMember(owner = "client!rda", name = "jf", descriptor = "Lclient!ria;")
	public final Class117_Sub3 aClass117_Sub3_5;

	@OriginalMember(owner = "client!rda", name = "mf", descriptor = "[F")
	public final float[] aFloatArray65;

	@OriginalMember(owner = "client!rda", name = "pf", descriptor = "I")
	private int anInt8283;

	@OriginalMember(owner = "client!rda", name = "zf", descriptor = "I")
	private int anInt8286;

	@OriginalMember(owner = "client!rda", name = "Cf", descriptor = "I")
	public int anInt8287;

	@OriginalMember(owner = "client!rda", name = "bg", descriptor = "I")
	public int anInt8296;

	@OriginalMember(owner = "client!rda", name = "Lf", descriptor = "I")
	public int anInt8292;

	@OriginalMember(owner = "client!rda", name = "Sf", descriptor = "I")
	private int anInt8295;

	@OriginalMember(owner = "client!rda", name = "Hf", descriptor = "[F")
	private final float[] aFloatArray67;

	@OriginalMember(owner = "client!rda", name = "uf", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!rda", name = "gg", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!rda", name = "Pf", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!rda", name = "cg", descriptor = "I")
	public int anInt8297;

	@OriginalMember(owner = "client!rda", name = "rf", descriptor = "F")
	private float aFloat157;

	@OriginalMember(owner = "client!rda", name = "eg", descriptor = "I")
	public int anInt8299;

	@OriginalMember(owner = "client!rda", name = "vg", descriptor = "F")
	private float aFloat166;

	@OriginalMember(owner = "client!rda", name = "og", descriptor = "I")
	private int anInt8303;

	@OriginalMember(owner = "client!rda", name = "Vf", descriptor = "Z")
	private boolean aBoolean675;

	@OriginalMember(owner = "client!rda", name = "mg", descriptor = "I")
	public int anInt8301;

	@OriginalMember(owner = "client!rda", name = "Mf", descriptor = "I")
	public int anInt8293;

	@OriginalMember(owner = "client!rda", name = "Gf", descriptor = "I")
	private int anInt8289;

	@OriginalMember(owner = "client!rda", name = "nf", descriptor = "[F")
	private final float[] aFloatArray66;

	@OriginalMember(owner = "client!rda", name = "tg", descriptor = "I")
	public int anInt8304;

	@OriginalMember(owner = "client!rda", name = "Ng", descriptor = "I")
	private int anInt8307;

	@OriginalMember(owner = "client!rda", name = "Qg", descriptor = "[Lclient!tn;")
	private final Class5_Sub27[] aClass5_Sub27Array5;

	@OriginalMember(owner = "client!rda", name = "of", descriptor = "F")
	public float aFloat156;

	@OriginalMember(owner = "client!rda", name = "Ug", descriptor = "F")
	private float aFloat173;

	@OriginalMember(owner = "client!rda", name = "Pg", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!rda", name = "Cg", descriptor = "I")
	private int anInt8306;

	@OriginalMember(owner = "client!rda", name = "Tg", descriptor = "I")
	private int anInt8310;

	@OriginalMember(owner = "client!rda", name = "Ef", descriptor = "I")
	public int anInt8288;

	@OriginalMember(owner = "client!rda", name = "ch", descriptor = "F")
	private float aFloat174;

	@OriginalMember(owner = "client!rda", name = "dh", descriptor = "I")
	public int anInt8313;

	@OriginalMember(owner = "client!rda", name = "ng", descriptor = "I")
	private int anInt8302;

	@OriginalMember(owner = "client!rda", name = "hh", descriptor = "[F")
	private final float[] aFloatArray68;

	@OriginalMember(owner = "client!rda", name = "pg", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!rda", name = "Xg", descriptor = "Z")
	private boolean aBoolean685;

	@OriginalMember(owner = "client!rda", name = "bh", descriptor = "I")
	private int anInt8312;

	@OriginalMember(owner = "client!rda", name = "Rg", descriptor = "I")
	public int anInt8308;

	@OriginalMember(owner = "client!rda", name = "oh", descriptor = "F")
	public float aFloat176;

	@OriginalMember(owner = "client!rda", name = "yg", descriptor = "F")
	private float aFloat169;

	@OriginalMember(owner = "client!rda", name = "ph", descriptor = "[F")
	private final float[] aFloatArray69;

	@OriginalMember(owner = "client!rda", name = "tf", descriptor = "Lclient!uf;")
	public Class5_Sub12_Sub1 aClass5_Sub12_Sub1_2;

	@OriginalMember(owner = "client!rda", name = "rh", descriptor = "[I")
	public int[] anIntArray649;

	@OriginalMember(owner = "client!rda", name = "uh", descriptor = "[I")
	public int[] anIntArray651;

	@OriginalMember(owner = "client!rda", name = "sh", descriptor = "[I")
	public int[] anIntArray650;

	@OriginalMember(owner = "client!rda", name = "vh", descriptor = "[B")
	public final byte[] aByteArray75;

	@OriginalMember(owner = "client!rda", name = "ce", descriptor = "I")
	public final int anInt8254;

	@OriginalMember(owner = "client!rda", name = "R", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas9;

	@OriginalMember(owner = "client!rda", name = "Cd", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!rda", name = "kd", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!rda", name = "G", descriptor = "J")
	private final long aLong218;

	@OriginalMember(owner = "client!rda", name = "Cb", descriptor = "J")
	private long aLong219;

	@OriginalMember(owner = "client!rda", name = "eh", descriptor = "I")
	public final int anInt8314;

	@OriginalMember(owner = "client!rda", name = "Dg", descriptor = "Z")
	public boolean aBoolean679;

	@OriginalMember(owner = "client!rda", name = "qf", descriptor = "Z")
	private boolean aBoolean668;

	@OriginalMember(owner = "client!rda", name = "Gg", descriptor = "Z")
	public boolean aBoolean680;

	@OriginalMember(owner = "client!rda", name = "lf", descriptor = "Z")
	public boolean aBoolean667;

	@OriginalMember(owner = "client!rda", name = "mh", descriptor = "Z")
	private boolean aBoolean691;

	@OriginalMember(owner = "client!rda", name = "Zf", descriptor = "Z")
	public boolean aBoolean677;

	@OriginalMember(owner = "client!rda", name = "kf", descriptor = "Z")
	public boolean aBoolean666;

	@OriginalMember(owner = "client!rda", name = "nh", descriptor = "Z")
	private final boolean aBoolean692;

	@OriginalMember(owner = "client!rda", name = "se", descriptor = "Lclient!vl;")
	private final Class362 aClass362_1;

	@OriginalMember(owner = "client!rda", name = "Ae", descriptor = "Lclient!wv;")
	public final Class385 aClass385_1;

	@OriginalMember(owner = "client!rda", name = "Ud", descriptor = "Lclient!vaa;")
	private final Class351 aClass351_1;

	@OriginalMember(owner = "client!rda", name = "be", descriptor = "Lclient!sd;")
	private Class5_Sub14_Sub1 aClass5_Sub14_Sub1_1;

	@OriginalMember(owner = "client!rda", name = "Yd", descriptor = "Lclient!wf;")
	private final Class374 aClass374_1;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class126_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class80();
		new Class81(16);
		this.aClass306_47 = new Class306();
		this.aClass306_48 = new Class306();
		this.aClass306_49 = new Class306();
		this.aClass306_50 = new Class306();
		this.aClass306_51 = new Class306();
		this.aClass306_52 = new Class306();
		this.aClass306_53 = new Class306();
		this.aClass117_Sub3_3 = new Class117_Sub3();
		this.aClass117_Sub3_4 = new Class117_Sub3();
		this.aClass117_Sub3_5 = new Class117_Sub3();
		this.aFloatArray65 = new float[4];
		this.anInt8283 = 0;
		this.anInt8286 = -1;
		this.anInt8287 = -1;
		this.anInt8296 = -1;
		this.anInt8292 = 512;
		this.anInt8295 = 0;
		this.aFloatArray67 = new float[4];
		this.aFloat159 = -1.0F;
		this.aFloat164 = 1.0F;
		this.aFloat161 = 1.0F;
		this.anInt8297 = 0;
		this.aFloat157 = 1.0F;
		this.anInt8299 = 0;
		this.aFloat166 = -1.0F;
		this.anInt8303 = 0;
		this.aBoolean675 = false;
		this.anInt8301 = 0;
		this.anInt8293 = 512;
		this.anInt8289 = 3584;
		this.aFloatArray66 = new float[4];
		this.anInt8304 = 50;
		this.anInt8307 = 0;
		this.aClass5_Sub27Array5 = new Class5_Sub27[Static521.anInt8715];
		this.aFloat156 = -1.0F;
		this.aFloat173 = -1.0F;
		this.aFloat172 = 3584.0F;
		this.anInt8306 = 0;
		this.anInt8310 = 8448;
		this.anInt8288 = -1;
		this.aFloat174 = 1.0F;
		this.anInt8313 = 0;
		this.anInt8302 = 8448;
		this.aFloatArray68 = new float[16];
		this.aFloat165 = 1.0F;
		this.aBoolean685 = true;
		this.anInt8312 = 0;
		this.anInt8308 = -1;
		this.aFloat176 = 3584.0F;
		this.aFloat169 = 0.0F;
		this.aFloatArray69 = new float[4];
		this.aClass5_Sub12_Sub1_2 = new Class5_Sub12_Sub1(8192);
		this.anIntArray649 = new int[1];
		this.anIntArray651 = new int[1];
		this.anIntArray650 = new int[1];
		this.aByteArray75 = new byte[16384];
		this.anInt8254 = arg2;
		this.aCanvas10 = this.aCanvas9 = arg0;
		if (!Static190.method673("jaclib")) {
			throw new RuntimeException("");
		} else if (Static190.method673("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong219 = this.aLong218 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt8254);
				if (this.aLong218 == 0L) {
					throw new RuntimeException("");
				}
				this.method7127();
				@Pc(333) int local333 = this.method7118();
				if (local333 != 0) {
					throw new RuntimeException("");
				}
				this.anInt8314 = this.aBoolean674 ? 33639 : 5121;
				if (this.aString117.indexOf("radeon") != -1) {
					@Pc(360) int local360 = 0;
					@Pc(362) boolean local362 = false;
					@Pc(364) boolean local364 = false;
					@Pc(373) String[] local373 = Static132.method1987(this.aString117.replace('/', ' '), ' ');
					for (@Pc(375) int local375 = 0; local375 < local373.length; local375++) {
						@Pc(381) String local381 = local373[local375];
						try {
							if (local381.length() > 0) {
								if (local381.charAt(0) == 'x' && local381.length() >= 3 && Static515.method7420(local381.substring(1, 3))) {
									local364 = true;
									local381 = local381.substring(1);
								}
								if (local381.equals("hd")) {
									local362 = true;
								} else {
									if (local381.startsWith("hd")) {
										local362 = true;
										local381 = local381.substring(2);
									}
									if (local381.length() >= 4 && Static515.method7420(local381.substring(0, 4))) {
										local360 = Static443.method6588(local381.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(451) Exception local451) {
						}
					}
					if (!local362 || local360 < 4000) {
						this.aBoolean679 = false;
					}
					if (!local364 && !local362) {
						if (local360 >= 7000 && local360 <= 7999) {
							this.aBoolean668 = false;
						}
						if (local360 >= 7000 && local360 <= 9250) {
							this.aBoolean680 = false;
						}
					}
					this.aBoolean667 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean691 = this.aBoolean668;
					this.aBoolean677 = true;
				}
				if (this.aString116.indexOf("intel") != -1) {
					this.aBoolean666 = false;
				}
				this.aBoolean692 = !this.aString116.equals("s3 graphics");
				if (this.aBoolean668) {
					try {
						@Pc(539) int[] local539 = new int[1];
						OpenGL.glGenBuffersARB(1, local539, 0);
					} catch (@Pc(545) Throwable local545) {
						throw new RuntimeException("");
					}
				}
				Static83.method7206(false, true);
				this.aBoolean662 = true;
				this.aClass362_1 = new Class362(this, super.anInterface8_10);
				this.method7077();
				this.aClass385_1 = new Class385(this);
				this.aClass351_1 = new Class351(this);
				if (this.aClass351_1.method8315()) {
					this.aClass5_Sub14_Sub1_1 = new Class5_Sub14_Sub1(this);
					if (!this.aClass5_Sub14_Sub1_1.method7413()) {
						this.aClass5_Sub14_Sub1_1.method7403();
						this.aClass5_Sub14_Sub1_1 = null;
					}
				}
				this.aClass374_1 = new Class374(this);
				this.method7110();
				this.method7086();
				this.method7004();
			} catch (@Pc(619) Throwable local619) {
				local619.printStackTrace();
				this.method7024();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7057(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas9) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable6.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!rda", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass117_Sub3_3.aFloat188 + (float) arg0 * this.aClass117_Sub3_3.aFloat180 + this.aClass117_Sub3_3.aFloat185 * (float) arg1 + (float) arg2 * this.aClass117_Sub3_3.aFloat186;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass117_Sub3_3.aFloat188 + this.aClass117_Sub3_3.aFloat185 * (float) arg4 + (float) arg3 * this.aClass117_Sub3_3.aFloat180 + this.aClass117_Sub3_3.aFloat186 * (float) arg5;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt8304 > local32 && local63 < (float) this.anInt8304) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt8289 && local63 > (float) this.anInt8289) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass117_Sub3_3.aFloat181 + this.aClass117_Sub3_3.aFloat183 * (float) arg2 + this.aClass117_Sub3_3.aFloat187 * (float) arg0 + this.aClass117_Sub3_3.aFloat182 * (float) arg1) * (float) this.anInt8293 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt8293 * ((float) arg3 * this.aClass117_Sub3_3.aFloat187 + this.aClass117_Sub3_3.aFloat182 * (float) arg4 + (float) arg5 * this.aClass117_Sub3_3.aFloat183 + this.aClass117_Sub3_3.aFloat181) / local63);
		if (this.aFloat171 > (float) local135 && this.aFloat171 > (float) local167) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat158 && (float) local167 > this.aFloat158) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt8292 * (this.aClass117_Sub3_3.aFloat178 + this.aClass117_Sub3_3.aFloat177 * (float) arg0 + this.aClass117_Sub3_3.aFloat179 * (float) arg1 + this.aClass117_Sub3_3.aFloat184 * (float) arg2) / local32);
		@Pc(265) int local265 = (int) ((this.aClass117_Sub3_3.aFloat178 + (float) arg5 * this.aClass117_Sub3_3.aFloat184 + (float) arg3 * this.aClass117_Sub3_3.aFloat177 + (float) arg4 * this.aClass117_Sub3_3.aFloat179) * (float) this.anInt8292 / local63);
		if ((float) local233 < this.aFloat175 && (float) local265 < this.aFloat175) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat167 && (float) local265 > this.aFloat167) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)V")
	private void method7063() {
		this.aFloat175 = (float) (this.anInt8307 - this.anInt8313);
		this.aFloat171 = (float) (this.anInt8283 - this.anInt8301);
		this.aFloat158 = (float) (this.anInt8306 - this.anInt8301);
		this.aFloat167 = (float) (this.anInt8312 - this.anInt8313);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "()Z")
	@Override
	public boolean method6976() {
		return this.aClass5_Sub14_Sub1_1 != null && (this.anInt8254 <= 1 || this.aBoolean684);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!tea;)V")
	@Override
	public void method7009(@OriginalArg(0) Class91 arg0) {
		this.aClass91_Sub1_1 = (Class91_Sub1) arg0;
	}

	@OriginalMember(owner = "client!rda", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rda", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean682 = true;
		this.anInt8297 = arg3;
		this.anInt8288 = arg1;
		this.anInt8287 = arg2;
		this.anInt8309 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(Z)V")
	public void method7064() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)V")
	public synchronized void method7065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub41 local8 = new Class5_Sub41(arg0);
		local8.aLong282 = (long) arg1;
		this.aClass306_51.method7303(local8);
	}

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "(I)V")
	@Override
	public synchronized void method7053(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class5_Sub41 local19;
		while (!this.aClass306_48.method7309()) {
			local19 = (Class5_Sub41) this.aClass306_48.method7302();
			Static639.anIntArray831[local7++] = (int) local19.aLong282;
			this.anInt8277 -= local19.anInt7411;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static639.anIntArray831, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static639.anIntArray831, 0);
			local7 = 0;
		}
		while (!this.aClass306_49.method7309()) {
			local19 = (Class5_Sub41) this.aClass306_49.method7302();
			Static639.anIntArray831[local7++] = (int) local19.aLong282;
			this.anInt8279 -= local19.anInt7411;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static639.anIntArray831, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static639.anIntArray831, 0);
			local7 = 0;
		}
		while (!this.aClass306_50.method7309()) {
			local19 = (Class5_Sub41) this.aClass306_50.method7302();
			Static639.anIntArray831[local7++] = local19.anInt7411;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static639.anIntArray831, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static639.anIntArray831, 0);
			local7 = 0;
		}
		while (!this.aClass306_51.method7309()) {
			local19 = (Class5_Sub41) this.aClass306_51.method7302();
			Static639.anIntArray831[local7++] = (int) local19.aLong282;
			this.anInt8278 -= local19.anInt7411;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static639.anIntArray831, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static639.anIntArray831, 0);
		}
		while (!this.aClass306_47.method7309()) {
			local19 = (Class5_Sub41) this.aClass306_47.method7302();
			OpenGL.glDeleteLists((int) local19.aLong282, local19.anInt7411);
		}
		@Pc(213) Class5 local213;
		while (!this.aClass306_52.method7309()) {
			local213 = this.aClass306_52.method7302();
			OpenGL.glDeleteProgramARB((int) local213.aLong282);
		}
		while (!this.aClass306_53.method7309()) {
			local213 = this.aClass306_53.method7302();
			OpenGL.glDeleteObjectARB(local213.aLong282);
		}
		while (!this.aClass306_47.method7309()) {
			local19 = (Class5_Sub41) this.aClass306_47.method7302();
			OpenGL.glDeleteLists((int) local19.aLong282, local19.anInt7411);
		}
		this.aClass362_1.method8475();
		if (this.E() > 100663296 && this.aLong220 + 60000L < Static205.method3179()) {
			System.gc();
			this.aLong220 = Static205.method3179();
		}
		this.anInt8272 = local11;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!cs;)V")
	public void method7066(@OriginalArg(1) Interface7 arg0) {
		if (arg0 != this.anInterface7_5) {
			if (this.aBoolean668) {
				OpenGL.glBindBufferARB(34962, arg0.method6379());
			}
			this.anInterface7_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(I)V")
	@Override
	public void method7010(@OriginalArg(0) int arg0) {
		this.method7139();
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method7096();
		this.method7109(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean690) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean690) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!rda", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass117_Sub3_3.aFloat186 * (float) arg2 + (float) arg0 * this.aClass117_Sub3_3.aFloat180 + this.aClass117_Sub3_3.aFloat185 * (float) arg1 + this.aClass117_Sub3_3.aFloat188;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt8293 * ((float) arg2 * this.aClass117_Sub3_3.aFloat183 + (float) arg1 * this.aClass117_Sub3_3.aFloat182 + (float) arg0 * this.aClass117_Sub3_3.aFloat187 + this.aClass117_Sub3_3.aFloat181) / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat171);
		@Pc(118) int local118 = (int) ((this.aClass117_Sub3_3.aFloat178 + this.aClass117_Sub3_3.aFloat184 * (float) arg2 + (float) arg0 * this.aClass117_Sub3_3.aFloat177 + (float) arg1 * this.aClass117_Sub3_3.aFloat179) * (float) this.anInt8292 / local28);
		arg3[1] = (int) ((float) local118 - this.aFloat175);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!uj;I)V")
	@Override
	public void method6986(@OriginalArg(0) Class345 arg0, @OriginalArg(1) int arg1) {
		this.aClass114_1.method2438(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!im;Lclient!im;Lclient!im;Lclient!im;)V")
	public void method7067(@OriginalArg(1) Class159 arg0, @OriginalArg(2) Class159 arg1, @OriginalArg(3) Class159 arg2, @OriginalArg(4) Class159 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method7066(arg1.anInterface7_2);
			OpenGL.glVertexPointer(arg1.aByte80, arg1.aShort64, this.anInterface7_5.method6380(), this.anInterface7_5.method6381() + (long) arg1.aByte79);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method7066(arg2.anInterface7_2);
			OpenGL.glNormalPointer(arg2.aShort64, this.anInterface7_5.method6380(), this.anInterface7_5.method6381() + (long) arg2.aByte79);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method7066(arg3.anInterface7_2);
			OpenGL.glColorPointer(arg3.aByte80, arg3.aShort64, this.anInterface7_5.method6380(), this.anInterface7_5.method6381() + (long) arg3.aByte79);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method7066(arg0.anInterface7_2);
			OpenGL.glTexCoordPointer(arg0.aByte80, arg0.aShort64, this.anInterface7_5.method6380(), this.anInterface7_5.method6381() + (long) arg0.aByte79);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "(I)V")
	public void method7068() {
		if (this.anInt8282 == 4) {
			return;
		}
		this.method7076();
		this.method7123(false);
		this.method7102(false);
		this.method7137(false);
		this.method7094(false);
		this.method7106(-2);
		this.method7109(1);
		this.anInt8282 = 4;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ria;I)V")
	public void method7069(@OriginalArg(0) Class117_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method7265(), 0);
	}

	@OriginalMember(owner = "client!rda", name = "q", descriptor = "()Z")
	@Override
	public boolean method7025() {
		return this.aClass5_Sub14_Sub1_1 != null && this.aClass5_Sub14_Sub1_1.method7401();
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(II)Lclient!mj;")
	@Override
	public Interface15 method6995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(JZ)V")
	public synchronized void method7070(@OriginalArg(0) long arg0) {
		@Pc(11) Class5 local11 = new Class5();
		local11.aLong282 = arg0;
		this.aClass306_53.method7303(local11);
	}

	@OriginalMember(owner = "client!rda", name = "s", descriptor = "()Z")
	@Override
	public boolean method7034() {
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(II)V")
	@Override
	public void method7031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)V")
	public synchronized void method7071(@OriginalArg(0) int arg0) {
		@Pc(7) Class5 local7 = new Class5();
		local7.aLong282 = (long) arg0;
		this.aClass306_52.method7303(local7);
	}

	@OriginalMember(owner = "client!rda", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method7096();
		this.method7109(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean690) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean690) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ria;B)V")
	public void method7072(@OriginalArg(0) Class117_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method7265(), 0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass351_1.method8310(arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIBI)V")
	public void method7073(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!rda", name = "n", descriptor = "()Z")
	@Override
	public boolean method7016() {
		return this.aClass374_1.method8714();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6991(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BII)V")
	public void method7074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8295 = arg0;
		this.anInt8303 = arg1;
		this.method7124();
		this.method7112();
	}

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt8304 == arg0 && arg1 == this.anInt8289) {
			return;
		}
		this.anInt8304 = arg0;
		this.anInt8289 = arg1;
		this.method7119();
		this.method7083();
		if (this.anInt8305 == 3) {
			this.method7103();
		} else if (this.anInt8305 == 2) {
			this.method7138();
			return;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(FIF)V")
	public void method7075(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat174 = arg0;
		this.aFloat169 = arg1;
		this.method7083();
	}

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "(I)V")
	private void method7076() {
		if (this.anInt8305 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt8178 > 0 && this.anInt8084 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt8178, (double) this.anInt8084, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt8305 = 1;
		this.anInt8282 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([I)V")
	@Override
	public void method7060(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8178;
		arg0[1] = this.anInt8084;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)V")
	private void method7077() {
		this.aClass24Array1 = new Class24[this.anInt8300];
		this.aClass24_Sub4_2 = new Class24_Sub4(this, 3553, 6408, 1, 1);
		new Class24_Sub4(this, 3553, 6408, 1, 1);
		new Class24_Sub4(this, 3553, 6408, 1, 1);
		this.aClass180_Sub2_4 = new Class180_Sub2(this);
		this.aClass180_Sub2_7 = new Class180_Sub2(this);
		this.aClass180_Sub2_6 = new Class180_Sub2(this);
		this.aClass180_Sub2_2 = new Class180_Sub2(this);
		this.aClass180_Sub2_8 = new Class180_Sub2(this);
		this.aClass180_Sub2_1 = new Class180_Sub2(this);
		this.aClass180_Sub2_5 = new Class180_Sub2(this);
		this.aClass180_Sub2_10 = new Class180_Sub2(this);
		this.aClass180_Sub2_9 = new Class180_Sub2(this);
		this.aClass180_Sub2_3 = new Class180_Sub2(this);
		if (this.aBoolean666) {
			this.aClass243_2 = new Class243(this);
			new Class243(this);
		}
	}

	@OriginalMember(owner = "client!rda", name = "m", descriptor = "(I)V")
	public void method7078() {
		if (this.anInt8282 == 16) {
			return;
		}
		this.method7114();
		this.method7123(true);
		this.method7137(true);
		this.method7094(true);
		this.method7109(1);
		this.anInt8282 = 16;
	}

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "()Z")
	@Override
	public boolean method7011() {
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "n", descriptor = "(I)V")
	public void method7079() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray65, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray69, 0);
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(Z)V")
	private void method7080() {
		if (this.aBoolean676) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean676 = false;
		}
	}

	@OriginalMember(owner = "client!rda", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(49) float local49;
		@Pc(61) float local61;
		if (this.aClass24_Sub4_Sub1_5 == null || this.aClass24_Sub4_Sub1_5.anInt7727 < arg2 || arg3 > this.aClass24_Sub4_Sub1_5.anInt7723) {
			this.aClass24_Sub4_Sub1_5 = Static163.method2450(arg6, this, arg3, arg2);
			this.aClass24_Sub4_Sub1_5.method6792(false, false);
			local61 = this.aClass24_Sub4_Sub1_5.aFloat154;
			local49 = this.aClass24_Sub4_Sub1_5.aFloat153;
		} else {
			this.aClass24_Sub4_Sub1_5.method6794(arg6, 6406, false, arg3, arg2);
			local49 = this.aClass24_Sub4_Sub1_5.aFloat153 * (float) arg3 / (float) this.aClass24_Sub4_Sub1_5.anInt7723;
			local61 = (float) arg2 * this.aClass24_Sub4_Sub1_5.aFloat154 / (float) this.aClass24_Sub4_Sub1_5.anInt7727;
		}
		this.method7088();
		this.method7113(this.aClass24_Sub4_Sub1_5);
		this.method7109(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method7125(arg5);
		this.method7082(34165, 34165);
		this.method7135(768, 34166, 0);
		this.method7135(770, 5890, 2);
		this.method7073(0, 34166);
		this.method7073(2, 5890);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = local151 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(166) float local166 = local154 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local61);
		OpenGL.glVertex2f(local151, local166);
		OpenGL.glTexCoord2f(local49, local61);
		OpenGL.glVertex2f(local159, local166);
		OpenGL.glTexCoord2f(local49, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method7135(768, 5890, 0);
		this.method7135(770, 34166, 2);
		this.method7073(0, 5890);
		this.method7073(2, 34166);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ur;IIII)Lclient!ka;")
	@Override
	public Class180 method6982(@OriginalArg(0) Class349 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class180_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(B)V")
	private void method7081() {
		if (this.aBoolean689 && this.anInt8308 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(III)V")
	public void method7082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt8316 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(19) boolean local19 = false;
		if (this.anInt8310 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local19 = true;
			this.anInt8310 = arg1;
		}
		if (this.anInt8302 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			this.anInt8302 = arg0;
			local19 = true;
		}
		if (local19) {
			this.anInt8282 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!rda", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt8084 - arg1 - local12, arg2, 1, 32993, this.anInt8314, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!rda", name = "o", descriptor = "(I)V")
	private void method7083() {
		this.aFloat168 = (float) (this.anInt8289 - this.anInt8299) - this.aFloat169;
		this.aFloat162 = this.aFloat168 - (float) this.anInt8308 * this.aFloat174;
		if (this.aFloat162 < (float) this.anInt8304) {
			this.aFloat162 = (float) this.anInt8304;
		}
		OpenGL.glFogf(2915, this.aFloat162);
		OpenGL.glFogf(2916, this.aFloat168);
		Static151.aFloatArray4[1] = (float) (this.anInt8296 & 0xFF00) / 65280.0F;
		Static151.aFloatArray4[0] = (float) (this.anInt8296 & 0xFF0000) / 1.671168E7F;
		Static151.aFloatArray4[2] = (float) (this.anInt8296 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static151.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIZ)Lclient!hu;")
	@Override
	public Class44 method6996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class44_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "(I)V")
	@Override
	public void method7046() {
	}

	@OriginalMember(owner = "client!rda", name = "w", descriptor = "()V")
	@Override
	public void method7052() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!rda", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt8283 = 0;
		this.anInt8312 = this.anInt8084;
		this.anInt8306 = this.anInt8178;
		this.anInt8307 = 0;
		OpenGL.glDisable(3089);
		this.method7063();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ua;I)V")
	public void method7084(@OriginalArg(0) Interface26 arg0) {
		if (this.anInt8275 < 0 || this.anInterface26Array1[this.anInt8275] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface26Array1[this.anInt8275--] = null;
		arg0.method5822();
		if (this.anInt8275 < 0) {
			this.anInterface26_1 = null;
		} else {
			this.anInterface26_1 = this.anInterface26Array1[this.anInt8275];
			this.anInterface26_1.method5824();
		}
	}

	@OriginalMember(owner = "client!rda", name = "p", descriptor = "(I)V")
	private void method7085() {
		OpenGL.glDepthMask(this.aBoolean665 && this.aBoolean685);
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)V")
	private void method7086() {
		if (this.aCanvas10 == null) {
			this.anInt8175 = this.anInt8087 = 0;
		} else {
			@Pc(27) Dimension local27 = this.aCanvas10.getSize();
			this.anInt8175 = local27.width;
			this.anInt8087 = local27.height;
		}
		if (this.anInterface26_2 == null) {
			this.anInt8084 = this.anInt8087;
			this.anInt8178 = this.anInt8175;
			this.method7124();
		}
		this.method7108();
		this.la();
	}

	@OriginalMember(owner = "client!rda", name = "q", descriptor = "(I)V")
	public void method7087() {
		if (this.anInt8282 == 8) {
			return;
		}
		this.method7095();
		this.method7123(true);
		this.method7137(true);
		this.method7094(true);
		this.method7109(1);
		this.anInt8282 = 8;
	}

	@OriginalMember(owner = "client!rda", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt8318;
		this.anInt8318 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!rda", name = "r", descriptor = "(I)V")
	public void method7088() {
		if (this.anInt8282 == 2) {
			return;
		}
		this.method7076();
		this.method7123(false);
		this.method7102(false);
		this.method7137(false);
		this.method7094(false);
		this.method7106(-2);
		this.anInt8282 = 2;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(Lclient!ua;I)V")
	public void method7089(@OriginalArg(0) Interface26 arg0) {
		if (this.anInt8276 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8276 >= 0) {
			this.anInterface26Array2[this.anInt8276].method5821();
		}
		this.anInterface26_2 = this.anInterface26Array2[++this.anInt8276] = arg0;
		this.anInterface26_2.method5823();
	}

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "(I)V")
	@Override
	public void method7049(@OriginalArg(0) int arg0) {
		this.method7127();
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(III)V")
	public synchronized void method7090(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class5_Sub41 local14 = new Class5_Sub41(arg1);
		local14.aLong282 = (long) arg0;
		this.aClass306_48.method7303(local14);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(FZ)V")
	public void method7091(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat157) {
			this.aFloat157 = arg0;
			if (this.anInt8305 == 3) {
				this.method7103();
			}
		}
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(Z)V")
	private void method7092() {
		Static151.aFloatArray4[3] = 1.0F;
		Static151.aFloatArray4[0] = this.aFloat164 * this.aFloat156;
		Static151.aFloatArray4[2] = this.aFloat156 * this.aFloat165;
		Static151.aFloatArray4[1] = this.aFloat156 * this.aFloat161;
		OpenGL.glLightfv(16384, 4609, Static151.aFloatArray4, 0);
		Static151.aFloatArray4[2] = -this.aFloat159 * this.aFloat165;
		Static151.aFloatArray4[1] = -this.aFloat159 * this.aFloat161;
		Static151.aFloatArray4[0] = this.aFloat164 * -this.aFloat159;
		Static151.aFloatArray4[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static151.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BIZI[B)Lclient!cs;")
	public Interface7 method7093(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface7) (this.aBoolean668 && (!arg1 || this.aBoolean691) ? new Class259_Sub2(this, arg2, arg3, arg0, arg1) : new Class215_Sub1(this, arg2, arg3, arg0));
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IZ)V")
	public void method7094(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean665 != arg0) {
			this.aBoolean665 = arg0;
			this.method7085();
			this.anInt8282 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rda", name = "s", descriptor = "(I)V")
	private void method7095() {
		if (this.anInt8305 != 2) {
			this.anInt8305 = 2;
			this.method7138();
			this.method7143();
			this.anInt8282 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7036(@OriginalArg(0) Canvas arg0) {
		this.aLong219 = 0L;
		this.aCanvas10 = null;
		if (arg0 == null || arg0 == this.aCanvas9) {
			this.aCanvas10 = this.aCanvas9;
			this.aLong219 = this.aLong218;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable6.get(arg0);
			this.aLong219 = local26;
			this.aCanvas10 = arg0;
		}
		if (this.aCanvas10 == null || this.aLong219 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong219);
		this.method7086();
	}

	@OriginalMember(owner = "client!rda", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt8289;
	}

	@OriginalMember(owner = "client!rda", name = "t", descriptor = "(I)V")
	private void method7096() {
		if (this.anInt8282 == 1) {
			return;
		}
		this.method7076();
		this.method7123(false);
		this.method7102(false);
		this.method7137(false);
		this.method7094(false);
		this.method7113((Class24) null);
		this.method7106(-2);
		this.method7105(1);
		this.anInt8282 = 1;
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(Lclient!ua;I)V")
	public void method7097(@OriginalArg(0) Interface26 arg0) {
		if (this.aBoolean669) {
			this.method7130(arg0);
			this.method7089(arg0);
		} else if (this.anInt8274 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt8274 >= 0) {
				this.anInterface26Array3[this.anInt8274].method5825();
			}
			this.anInterface26_1 = this.anInterface26_2 = this.anInterface26Array3[++this.anInt8274] = arg0;
			this.anInterface26_1.method5820();
		}
	}

	@OriginalMember(owner = "client!rda", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt8317;
		this.anInt8317 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "(II)V")
	public synchronized void method7098(@OriginalArg(0) int arg0) {
		@Pc(14) Class5_Sub41 local14 = new Class5_Sub41(arg0);
		this.aClass306_50.method7303(local14);
	}

	@OriginalMember(owner = "client!rda", name = "u", descriptor = "(I)Lclient!jc;")
	public Class24_Sub3 method7099() {
		return this.aClass91_Sub1_1 == null ? null : this.aClass91_Sub1_1.method8859();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6983(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static375.aFloat135 = arg1;
		Static442.aFloat151 = arg2;
		Static243.aFloat48 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		this.method7096();
		this.method7109(1);
		@Pc(29) float local29 = (float) arg2 - (float) arg0;
		@Pc(35) float local35 = (float) arg3 - (float) arg1;
		@Pc(48) float local48 = (float) (1.0D / Math.sqrt((double) (local35 * local35 + local29 * local29)));
		@Pc(52) float local52 = local29 * local48;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(73) int local73 = arg7 % (arg5 + arg6);
		@Pc(77) float local77 = local35 * local48;
		@Pc(82) float local82 = local52 * (float) arg5;
		@Pc(87) float local87 = (float) arg5 * local77;
		@Pc(89) float local89 = 0.0F;
		@Pc(91) float local91 = 0.0F;
		@Pc(93) float local93 = local82;
		@Pc(95) float local95 = local87;
		if (local73 > arg5) {
			local91 = (float) (arg5 + arg6 - local73) * local77;
			local89 = local52 * (float) (arg5 + arg6 - local73);
		} else {
			local93 = (float) (arg5 - local73) * local52;
			local95 = local77 * (float) (arg5 - local73);
		}
		@Pc(149) float local149 = local89 + (float) arg0 + 0.35F;
		@Pc(156) float local156 = local91 + (float) arg1 + 0.35F;
		@Pc(161) float local161 = (float) arg6 * local52;
		@Pc(166) float local166 = (float) arg6 * local77;
		while (true) {
			if (arg0 >= arg2) {
				if ((float) arg2 + 0.35F > local149) {
					break;
				}
				if ((float) arg2 > local149 + local93) {
					local93 = (float) arg2 - local149;
				}
			} else {
				if ((float) arg2 + 0.35F < local149) {
					break;
				}
				if (local93 + local149 > (float) arg2) {
					local93 = (float) arg2 - local149;
				}
			}
			if (arg3 > arg1) {
				if (local156 > (float) arg3 + 0.35F) {
					break;
				}
				if (local156 + local95 > (float) arg3) {
					local95 = (float) arg3 - local156;
				}
			} else {
				if (local156 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local95 + local156) {
					local95 = (float) arg3 - local156;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local149, local156);
			OpenGL.glVertex2f(local93 + local149, local95 + local156);
			OpenGL.glEnd();
			local156 += local166 + local95;
			local149 += local161 + local93;
			local93 = local82;
			local95 = local87;
		}
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(IIII)V")
	public void method7100(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIF)Lclient!tn;")
	@Override
	public Class5_Sub27 method6992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub27_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(Z)V")
	@Override
	public void method7048(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB[BIZ)Lclient!as;")
	public Interface2 method7101(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		return (Interface2) (this.aBoolean668 && (!arg2 || this.aBoolean691) ? new Class259_Sub1(this, 5123, arg0, arg1, arg2) : new Class215_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!rda", name = "v", descriptor = "()Z")
	@Override
	public boolean method7043() {
		return false;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZI)V")
	public void method7102(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean671) {
			this.aBoolean671 = arg0;
			this.method7136();
			this.anInt8282 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!rda", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8283;
		arg0[1] = this.anInt8307;
		arg0[3] = this.anInt8312;
		arg0[2] = this.anInt8306;
	}

	@OriginalMember(owner = "client!rda", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass117_Sub3_3.aFloat188 + this.aClass117_Sub3_3.aFloat186 * (float) arg2 + this.aClass117_Sub3_3.aFloat185 * (float) arg1 + (float) arg0 * this.aClass117_Sub3_3.aFloat180;
		if ((float) this.anInt8304 > local28 || local28 > (float) this.anInt8289) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass117_Sub3_3.aFloat181 + this.aClass117_Sub3_3.aFloat183 * (float) arg2 + this.aClass117_Sub3_3.aFloat182 * (float) arg1 + (float) arg0 * this.aClass117_Sub3_3.aFloat187) * (float) this.anInt8293 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt8292 * (this.aClass117_Sub3_3.aFloat178 + (float) arg2 * this.aClass117_Sub3_3.aFloat184 + (float) arg1 * this.aClass117_Sub3_3.aFloat179 + (float) arg0 * this.aClass117_Sub3_3.aFloat177) / local28);
		if (this.aFloat171 <= (float) local85 && this.aFloat158 >= (float) local85 && this.aFloat175 <= (float) local117 && (float) local117 <= this.aFloat167) {
			arg3[1] = (int) ((float) local117 - this.aFloat175);
			arg3[0] = (int) ((float) local85 - this.aFloat171);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!rda", name = "v", descriptor = "(I)V")
	private void method7103() {
		@Pc(15) float local15 = this.aFloat157 * (float) -this.anInt8301 / (float) this.anInt8293;
		@Pc(27) float local27 = this.aFloat157 * (float) -this.anInt8313 / (float) this.anInt8292;
		@Pc(42) float local42 = this.aFloat157 * (float) (this.anInt8178 - this.anInt8301) / (float) this.anInt8293;
		@Pc(56) float local56 = this.aFloat157 * (float) (this.anInt8084 - this.anInt8313) / (float) this.anInt8292;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local42 && local56 != local27) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local56, (double) -local27, (double) this.anInt8304, (double) this.anInt8289);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(ZI)V")
	public void method7104(@OriginalArg(1) int arg0) {
		if (this.anInt8316 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt8316 = arg0;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!mj;Lclient!bba;)Lclient!nc;")
	@Override
	public Interface16 method7029(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) Interface3 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rda", name = "x", descriptor = "()V")
	@Override
	public void method7054() {
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BI)V")
	public void method7105(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method7082(7681, 7681);
		} else if (arg0 == 0) {
			this.method7082(8448, 8448);
		} else if (arg0 == 2) {
			this.method7082(7681, 34165);
		} else if (arg0 == 3) {
			this.method7082(8448, 260);
		} else if (arg0 == 4) {
			this.method7082(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(IB)V")
	public void method7106(@OriginalArg(0) int arg0) {
		this.method7131(arg0, true);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!ua;)V")
	public void method7107(@OriginalArg(1) Interface26 arg0) {
		if (this.anInt8276 < 0 || arg0 != this.anInterface26Array2[this.anInt8276]) {
			throw new RuntimeException();
		}
		this.anInterface26Array2[this.anInt8276--] = null;
		arg0.method5821();
		if (this.anInt8276 < 0) {
			this.anInterface26_2 = null;
		} else {
			this.anInterface26_2 = this.anInterface26Array2[this.anInt8276];
			this.anInterface26_2.method5823();
		}
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V")
	@Override
	public void method7007(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rda", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean682 = false;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7096();
		this.method7109(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(22) float local22 = (float) arg3 - (float) arg1;
		if (local16 == 0.0F && local22 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(47) float local47 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local22 * local22)));
			local22 *= local47;
			local16 *= local47;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local16 + 0.35F, local22 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rda", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8296 == arg0 && arg1 == this.anInt8308 && this.anInt8299 == arg2) {
			return;
		}
		this.anInt8296 = arg0;
		this.anInt8299 = arg2;
		this.anInt8308 = arg1;
		this.method7083();
		this.method7081();
	}

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "()Z")
	@Override
	public boolean method7006() {
		return false;
	}

	@OriginalMember(owner = "client!rda", name = "A", descriptor = "()Z")
	@Override
	public boolean method7062() {
		return this.aBoolean690 && (!this.method7025() || this.aBoolean684);
	}

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "()V")
	@Override
	public void method7004() {
		if (!this.aBoolean692 || this.anInt8178 <= 0 || this.anInt8084 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt8283;
		@Pc(25) int local25 = this.anInt8306;
		@Pc(28) int local28 = this.anInt8307;
		@Pc(31) int local31 = this.anInt8312;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7108();
		this.method7123(false);
		this.method7102(false);
		this.method7137(false);
		this.method7094(false);
		this.method7113((Class24) null);
		this.method7106(-2);
		this.method7105(1);
		this.method7109(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt8178, this.anInt8084, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(B)V")
	public void method7108() {
		if (this.anInt8305 != 0) {
			this.anInt8305 = 0;
			this.anInt8282 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "(II)V")
	public void method7109(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt8280) {
			return;
		}
		@Pc(21) boolean local21;
		@Pc(25) byte local25;
		if (arg0 == 1) {
			local21 = true;
			local25 = 1;
		} else if (arg0 == 2) {
			local25 = 2;
			local21 = false;
		} else if (arg0 == 128) {
			local25 = 3;
			local21 = true;
		} else {
			local25 = 0;
			local21 = false;
		}
		if (!this.aBoolean663) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean663 = true;
		}
		if (local21 != this.bf) {
			if (local21) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.bf = local21;
		}
		if (local25 != this.anInt8281) {
			if (local25 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local25 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local25 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt8281 = local25;
		}
		this.anInt8282 &= 0xFFFFFFE3;
		this.anInt8280 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7023(@OriginalArg(0) Class5_Sub23 arg0) {
		this.aNativeHeap5 = ((Class5_Sub23_Sub2) arg0).aNativeHeap6;
		if (this.anInterface7_6 != null) {
			return;
		}
		@Pc(16) Class5_Sub12_Sub1 local16 = new Class5_Sub12_Sub1(80);
		if (this.aBoolean674) {
			local16.method8130(-1.0F);
			local16.method8130(-1.0F);
			local16.method8130(0.0F);
			local16.method8130(0.0F);
			local16.method8130(1.0F);
			local16.method8130(1.0F);
			local16.method8130(-1.0F);
			local16.method8130(0.0F);
			local16.method8130(1.0F);
			local16.method8130(1.0F);
			local16.method8130(1.0F);
			local16.method8130(1.0F);
			local16.method8130(0.0F);
			local16.method8130(1.0F);
			local16.method8130(0.0F);
			local16.method8130(-1.0F);
			local16.method8130(1.0F);
			local16.method8130(0.0F);
			local16.method8130(0.0F);
			local16.method8130(0.0F);
		} else {
			local16.method8129(-1.0F);
			local16.method8129(-1.0F);
			local16.method8129(0.0F);
			local16.method8129(0.0F);
			local16.method8129(1.0F);
			local16.method8129(1.0F);
			local16.method8129(-1.0F);
			local16.method8129(0.0F);
			local16.method8129(1.0F);
			local16.method8129(1.0F);
			local16.method8129(1.0F);
			local16.method8129(1.0F);
			local16.method8129(0.0F);
			local16.method8129(1.0F);
			local16.method8129(0.0F);
			local16.method8129(-1.0F);
			local16.method8129(1.0F);
			local16.method8129(0.0F);
			local16.method8129(0.0F);
			local16.method8129(0.0F);
		}
		this.anInterface7_6 = this.method7093(local16.anInt10154, false, 20, local16.aByteArray104);
		this.aClass159_13 = new Class159(this.anInterface7_6, 5126, 3, 0);
		this.aClass159_14 = new Class159(this.anInterface7_6, 5126, 2, 12);
		this.aClass114_1.method2435(this);
	}

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "(Z)V")
	private void method7110() {
		this.method7106(-2);
		for (@Pc(14) int local14 = this.anInt8300 - 1; local14 >= 0; local14--) {
			this.method7104(local14);
			this.method7113((Class24) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method7082(8448, 8448);
		this.method7135(770, 34168, 2);
		this.method7080();
		this.anInt8280 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt8281 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.bf = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean663 = true;
		this.method7123(true);
		this.method7102(true);
		this.method7137(true);
		this.method7094(true);
		this.method7108();
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
		@Pc(123) float[] local123 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(125) int local125 = 0; local125 < 8; local125++) {
			@Pc(131) int local131 = local125 + 16384;
			OpenGL.glLightfv(local131, 4608, local123, 0);
			OpenGL.glLightf(local131, 4615, 0.0F);
			OpenGL.glLightf(local131, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt8286 = this.anInt8296 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!rda", name = "t", descriptor = "()Lclient!ofa;")
	@Override
	public Class117 method7037() {
		return this.aClass117_Sub3_3;
	}

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "()Z")
	@Override
	public boolean method7001() {
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I[Lclient!tn;)V")
	@Override
	public void method7026(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub27[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass5_Sub27Array5[local7] = arg1[local7];
		}
		this.anInt8284 = arg0;
		if (this.anInt8305 != 1) {
			this.method7132();
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!uj;)V")
	@Override
	public void method7058(@OriginalArg(0) Class345 arg0) {
		this.aClass114_1.method2438(arg0, this, -1);
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(Lclient!ua;I)V")
	public void method7111(@OriginalArg(0) Interface26 arg0) {
		if (this.aBoolean669) {
			this.method7084(arg0);
			this.method7107(arg0);
		} else if (this.anInt8274 >= 0 && this.anInterface26Array3[this.anInt8274] == arg0) {
			this.anInterface26Array3[this.anInt8274--] = null;
			arg0.method5825();
			if (this.anInt8274 < 0) {
				this.anInterface26_1 = this.anInterface26_2 = null;
			} else {
				this.anInterface26_1 = this.anInterface26_2 = this.anInterface26Array3[this.anInt8274];
				this.anInterface26_1.method5820();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rda", name = "u", descriptor = "()V")
	@Override
	public void method7038() {
		if (this.aClass5_Sub14_Sub1_1 != null && this.aClass5_Sub14_Sub1_1.method7401()) {
			this.aClass351_1.method8317(this.aClass5_Sub14_Sub1_1);
			this.aClass362_1.method8471();
		}
	}

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "(B)V")
	private void method7112() {
		if (this.anInt8283 <= this.anInt8306 && this.anInt8312 >= this.anInt8307) {
			OpenGL.glScissor(this.anInt8283 + this.anInt8295, -this.anInt8312 + this.anInt8084 + this.anInt8303, this.anInt8306 - this.anInt8283, this.anInt8312 - this.anInt8307);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!rda", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt8304;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ofa;)V")
	@Override
	public void method7040(@OriginalArg(0) Class117 arg0) {
		this.aClass117_Sub3_3.method7253(arg0);
		this.aClass117_Sub3_4.method7253(this.aClass117_Sub3_3);
		this.aClass117_Sub3_4.method7263();
		this.aClass117_Sub3_5.method7262(this.aClass117_Sub3_4);
		if (this.anInt8305 != 1) {
			this.method7143();
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!jn;Z)Lclient!hu;")
	@Override
	public Class44 method6994(@OriginalArg(0) Class176 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt4438 * arg0.anInt4437];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray41 == null) {
			for (local21 = 0; local21 < arg0.anInt4438; local21++) {
				for (local25 = 0; local25 < arg0.anInt4437; local25++) {
					@Pc(38) int local38 = arg0.anIntArray360[arg0.aByteArray40[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt4438; local21++) {
				for (local25 = 0; local25 < arg0.anInt4437; local25++) {
					local12[local16++] = arg0.anIntArray360[arg0.aByteArray40[local14] & 0xFF] | arg0.aByteArray41[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(119) Class44 local119 = this.method7017(arg0.anInt4438, arg0.anInt4437, local12, arg0.anInt4437);
		local119.method5309(arg0.anInt4434, arg0.anInt4439, arg0.anInt4436, arg0.anInt4435);
		return local119;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6979(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas9 == arg0) {
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

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg5;
		@Pc(9) Class24_Sub4_Sub1 local9 = local6.aClass24_Sub4_Sub1_2;
		this.method7088();
		this.method7113(local6.aClass24_Sub4_Sub1_2);
		this.method7109(1);
		this.method7082(8448, 7681);
		this.method7135(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat154 / (float) local9.anInt7730;
		@Pc(46) float local46 = local9.aFloat153 / (float) local9.anInt7731;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(58) float local58 = (float) arg3 - (float) arg1;
		@Pc(71) float local71 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local58 * local58)));
		@Pc(75) float local75 = local52 * local71;
		@Pc(79) float local79 = local58 * local71;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local75 + 0.35F, local79 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method7135(768, 5890, 0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!iga;)V")
	public void method7113(@OriginalArg(1) Class24 arg0) {
		@Pc(11) Class24 local11 = this.aClass24Array1[this.anInt8316];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt7702);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt7702);
				} else if (local11.anInt7702 != arg0.anInt7702) {
					OpenGL.glDisable(local11.anInt7702);
					OpenGL.glEnable(arg0.anInt7702);
				}
				OpenGL.glBindTexture(arg0.anInt7702, arg0.method6778());
			}
			this.aClass24Array1[this.anInt8316] = arg0;
		}
		this.anInt8282 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!rda", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt8279 + this.anInt8277 + this.anInt8278;
	}

	@OriginalMember(owner = "client!rda", name = "w", descriptor = "(I)V")
	private void method7114() {
		if (this.anInt8305 != 3) {
			this.anInt8305 = 3;
			this.method7103();
			this.method7143();
			this.anInt8282 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(FFFB)V")
	private void method7115(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean676) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean676 = true;
	}

	@OriginalMember(owner = "client!rda", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt8283 || arg0 - arg2 > this.anInt8306 || this.anInt8307 > arg2 + arg1 || arg1 - arg2 > this.anInt8312) {
			return;
		}
		this.method7096();
		this.method7109(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(76) float local76 = (float) arg0 + 0.35F;
		@Pc(81) float local81 = (float) arg1 + 0.35F;
		@Pc(85) int local85 = arg2 << 1;
		if ((float) local85 < this.aFloat166) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local76 + 1.0F, local81 + 1.0F);
			OpenGL.glVertex2f(local76 + 1.0F, local81 - 1.0F);
			OpenGL.glVertex2f(local76 - 1.0F, local81 - 1.0F);
			OpenGL.glVertex2f(local76 - 1.0F, local81 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat173 >= (float) local85) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local85);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local76, local81);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local76, local81);
			@Pc(140) int local140 = 262144 / (arg2 * 6);
			if (local140 <= 64) {
				local140 = 64;
			} else if (local140 > 512) {
				local140 = 512;
			}
			local140 = Static473.method6912(local140);
			OpenGL.glVertex2f((float) arg2 + local76, local81);
			for (@Pc(169) int local169 = 16384 - local140; local169 > 0; local169 -= local140) {
				OpenGL.glVertex2f(local76 + Class269.aFloatArray62[local169] * (float) arg2, (float) arg2 * Class269.aFloatArray63[local169] + local81);
			}
			OpenGL.glVertex2f(local76 + (float) arg2, local81);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(ZI)I")
	public int method7116(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)V")
	@Override
	public void method7022(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZIIZ)V")
	public void method7117(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt8290 || this.aBoolean675 != this.aBoolean682) {
			@Pc(25) Class24_Sub4 local25 = null;
			@Pc(27) int local27 = 0;
			@Pc(29) byte local29 = 0;
			@Pc(31) int local31 = 0;
			@Pc(38) int local38 = this.aBoolean682 ? 3 : 0;
			if (arg1 < 0) {
				this.method7080();
			} else {
				local25 = this.aClass362_1.method8473(arg1);
				@Pc(60) Class321 local60 = super.anInterface8_10.method7813(arg1);
				if (local60.aByte119 == 0 && local60.aByte118 == 0) {
					this.method7080();
				} else {
					@Pc(78) int local78 = local60.aBoolean729 ? 64 : 128;
					@Pc(82) int local82 = local78 * 50;
					this.method7115((float) (local60.aByte119 * (this.anInt8272 % local82)) / (float) local82, (float) (this.anInt8272 % local82 * local60.aByte118) / (float) local82, 0.0F);
				}
				local27 = local60.anInt8902;
				if (!this.aBoolean682) {
					local29 = local60.aByte120;
					local38 = local60.aByte115;
					local31 = local60.anInt8904;
				}
			}
			this.aClass374_1.method8716(local29, local31, local38, arg2, arg0);
			if (!this.aClass374_1.method8717(local25, local27)) {
				this.method7113(local25);
				this.method7105(local27);
			}
			this.aBoolean675 = this.aBoolean682;
			this.anInt8290 = arg1;
		}
		this.anInt8282 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "(Z)I")
	private int method7118() {
		this.aString116 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString117 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString116.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString116.indexOf("brian paul") != -1 || this.aString116.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static132.method1987(local46.replace('.', ' '), ' ');
		if (local54.length >= 2) {
			try {
				@Pc(66) int local66 = Static443.method6588(local54[0]);
				@Pc(72) int local72 = Static443.method6588(local54[1]);
				this.anInt8294 = local66 * 10 + local72;
			} catch (@Pc(81) NumberFormatException local81) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt8294 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(120) int[] local120 = new int[1];
		OpenGL.glGetIntegerv(34018, local120, 0);
		this.anInt8300 = local120[0];
		OpenGL.glGetIntegerv(34929, local120, 0);
		this.anInt8285 = local120[0];
		OpenGL.glGetIntegerv(34930, local120, 0);
		this.anInt8298 = local120[0];
		if (this.anInt8300 < 2 || this.anInt8285 < 2 || this.anInt8298 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean674 = Stream.b();
		this.aBoolean670 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean668 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean690 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean673 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean688 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean687 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean680 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean667 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean678 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean679 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean681 = false;
		this.aBoolean666 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean669 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean683 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean684 = this.aBoolean669 & this.aBoolean683;
		this.aBoolean672 = Class80.aString23.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static151.aFloatArray4, 0);
		this.aFloat173 = Static151.aFloatArray4[1];
		this.aFloat166 = Static151.aFloatArray4[0];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)Lclient!za;")
	@Override
	public Class5_Sub23 method6987(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub23_Sub2 local8 = new Class5_Sub23_Sub2(arg0);
		this.aClass306_46.method7303(local8);
		return local8;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class40 method7019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class40_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "(Z)V")
	private void method7119() {
		@Pc(6) float[] local6 = this.aFloatArray68;
		@Pc(18) float local18 = (float) (this.anInt8304 * -this.anInt8301) / (float) this.anInt8293;
		@Pc(32) float local32 = (float) (this.anInt8304 * (this.anInt8178 - this.anInt8301)) / (float) this.anInt8293;
		@Pc(43) float local43 = (float) (this.anInt8304 * this.anInt8313) / (float) this.anInt8292;
		@Pc(58) float local58 = (float) ((this.anInt8313 - this.anInt8084) * this.anInt8304) / (float) this.anInt8292;
		if (local32 == local18 || local43 == local58) {
			local6[10] = 1.0F;
			local6[5] = 1.0F;
			local6[9] = 0.0F;
			local6[7] = 0.0F;
			local6[13] = 0.0F;
			local6[1] = 0.0F;
			local6[3] = 0.0F;
			local6[12] = 0.0F;
			local6[4] = 0.0F;
			local6[15] = 1.0F;
			local6[6] = 0.0F;
			local6[2] = 0.0F;
			local6[11] = 0.0F;
			local6[8] = 0.0F;
			local6[14] = 0.0F;
			local6[0] = 1.0F;
		} else {
			@Pc(78) float local78 = (float) this.anInt8304 * 2.0F;
			local6[0] = local78 / (local32 - local18);
			local6[12] = 0.0F;
			local6[14] = this.aFloat170 = -((float) this.anInt8289 * local78) / (float) (this.anInt8289 - this.anInt8304);
			local6[15] = 0.0F;
			local6[13] = 0.0F;
			local6[2] = 0.0F;
			local6[10] = this.aFloat160 = (float) -(this.anInt8304 + this.anInt8289) / (float) (this.anInt8289 - this.anInt8304);
			local6[8] = (local18 + local32) / (local32 - local18);
			local6[7] = 0.0F;
			local6[1] = 0.0F;
			local6[3] = 0.0F;
			local6[9] = (local58 + local43) / (-local58 + local43);
			local6[5] = local78 / (local43 - local58);
			local6[11] = -1.0F;
			local6[4] = 0.0F;
			local6[6] = 0.0F;
		}
		this.method7141();
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(II)I")
	@Override
	public int method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(19) Class1_Sub2 local19 = (Class1_Sub2) arg5;
		@Pc(22) Class24_Sub4_Sub1 local22 = local19.aClass24_Sub4_Sub1_2;
		this.method7088();
		this.method7113(local19.aClass24_Sub4_Sub1_2);
		this.method7109(1);
		this.method7082(8448, 7681);
		this.method7135(768, 34167, 0);
		@Pc(52) float local52 = local22.aFloat154 / (float) local22.anInt7730;
		@Pc(59) float local59 = local22.aFloat153 / (float) local22.anInt7731;
		@Pc(66) float local66 = (float) -arg0 + (float) arg2;
		@Pc(72) float local72 = (float) arg3 - (float) arg1;
		@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local72 * local72)));
		@Pc(89) float local89 = local66 * local85;
		@Pc(93) float local93 = local72 * local85;
		@Pc(99) int local99 = arg10 % (arg8 + arg9);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(119) float local119 = (float) arg8 * local89;
		@Pc(124) float local124 = local93 * (float) arg8;
		@Pc(126) float local126 = 0.0F;
		@Pc(128) float local128 = 0.0F;
		@Pc(130) float local130 = local119;
		@Pc(132) float local132 = local124;
		if (arg8 >= local99) {
			local130 = local89 * (float) (arg8 - local99);
			local132 = (float) (arg8 - local99) * local93;
		} else {
			local128 = local93 * (float) (arg9 + arg8 - local99);
			local126 = (float) (arg9 + arg8 - local99) * local89;
		}
		@Pc(182) float local182 = local126 + (float) arg0 + 0.35F;
		@Pc(189) float local189 = (float) arg1 + local128 + 0.35F;
		@Pc(194) float local194 = (float) arg9 * local89;
		@Pc(199) float local199 = local93 * (float) arg9;
		while (true) {
			if (arg2 > arg0) {
				if ((float) arg2 + 0.35F < local182) {
					break;
				}
				if (local182 + local130 > (float) arg2) {
					local130 = (float) arg2 - local182;
				}
			} else {
				if (local182 < (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 > local182 + local130) {
					local130 = (float) arg2 - local182;
				}
			}
			if (arg3 <= arg1) {
				if (local189 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local189 + local132) {
					local132 = (float) arg3 - local189;
				}
			} else {
				if ((float) arg3 + 0.35F < local189) {
					break;
				}
				if ((float) arg3 < local132 + local189) {
					local132 = (float) arg3 - local189;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local52 * (local182 - (float) arg6), local59 * ((float) -arg7 + local189));
			OpenGL.glVertex2f(local182, local189);
			OpenGL.glTexCoord2f(local52 * (local182 + local130 - (float) arg6), local59 * (local189 + local132 - (float) arg7));
			OpenGL.glVertex2f(local182 + local130, local132 + local189);
			OpenGL.glEnd();
			local189 += local199 + local132;
			local182 += local130 + local194;
			local132 = local124;
			local130 = local119;
		}
		this.method7135(768, 5890, 0);
	}

	@OriginalMember(owner = "client!rda", name = "p", descriptor = "()V")
	@Override
	protected void method7024() {
		for (@Pc(6) Class5 local6 = this.aClass306_46.method7313(); local6 != null; local6 = this.aClass306_46.method7301()) {
			((Class5_Sub23_Sub2) local6).method7901();
		}
		if (this.aClass351_1 != null) {
			this.aClass351_1.method8319();
		}
		if (this.anOpenGL2 != null) {
			this.method7139();
			@Pc(40) Enumeration local40 = this.aHashtable6.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable6.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean662) {
			Static83.method7217(false, true);
			this.aBoolean662 = false;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIZ)Lclient!hu;")
	@Override
	public Class44 method6988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class44_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rda", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass117_Sub3_3.aFloat188 + (float) arg0 * this.aClass117_Sub3_3.aFloat180 + this.aClass117_Sub3_3.aFloat185 * (float) arg1 + this.aClass117_Sub3_3.aFloat186 * (float) arg2;
		@Pc(55) float local55 = this.aClass117_Sub3_3.aFloat188 + (float) arg5 * this.aClass117_Sub3_3.aFloat186 + this.aClass117_Sub3_3.aFloat185 * (float) arg4 + this.aClass117_Sub3_3.aFloat180 * (float) arg3;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt8304 && (float) this.anInt8304 > local55) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt8289 && (float) this.anInt8289 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) (((float) arg0 * this.aClass117_Sub3_3.aFloat187 + this.aClass117_Sub3_3.aFloat182 * (float) arg1 + this.aClass117_Sub3_3.aFloat183 * (float) arg2 + this.aClass117_Sub3_3.aFloat181) * (float) this.anInt8293 / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt8293 * (this.aClass117_Sub3_3.aFloat182 * (float) arg4 + this.aClass117_Sub3_3.aFloat187 * (float) arg3 + this.aClass117_Sub3_3.aFloat183 * (float) arg5 + this.aClass117_Sub3_3.aFloat181) / (float) arg6);
		if (this.aFloat171 > (float) local124 && this.aFloat171 > (float) local157) {
			local57 |= 0x1;
		} else if ((float) local124 > this.aFloat158 && this.aFloat158 < (float) local157) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt8292 * (this.aClass117_Sub3_3.aFloat184 * (float) arg2 + this.aClass117_Sub3_3.aFloat177 * (float) arg0 + (float) arg1 * this.aClass117_Sub3_3.aFloat179 + this.aClass117_Sub3_3.aFloat178) / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt8292 * (this.aClass117_Sub3_3.aFloat179 * (float) arg4 + this.aClass117_Sub3_3.aFloat177 * (float) arg3 + (float) arg5 * this.aClass117_Sub3_3.aFloat184 + this.aClass117_Sub3_3.aFloat178) / (float) arg6);
		if (this.aFloat175 > (float) local224 && this.aFloat175 > (float) local257) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat167 && this.aFloat167 < (float) local257) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(III)V")
	public synchronized void method7120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub41 local8 = new Class5_Sub41(arg1);
		local8.aLong282 = (long) arg0;
		this.aClass306_49.method7303(local8);
	}

	@OriginalMember(owner = "client!rda", name = "r", descriptor = "()I")
	@Override
	public int method7032() {
		return 4;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!tea;Lclient!tea;FLclient!tea;)Lclient!tea;")
	@Override
	public Class91 method7003(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class91 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean678 && this.aBoolean666) {
			@Pc(15) Class91_Sub1_Sub1 local15 = null;
			@Pc(18) Class91_Sub1 local18 = (Class91_Sub1) arg0;
			@Pc(21) Class91_Sub1 local21 = (Class91_Sub1) arg1;
			@Pc(25) Class24_Sub3 local25 = local18.method8859();
			@Pc(29) Class24_Sub3 local29 = local21.method8859();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt4260 > local29.anInt4260 ? local25.anInt4260 : local29.anInt4260;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class91_Sub1_Sub1) {
					@Pc(60) Class91_Sub1_Sub1 local60 = (Class91_Sub1_Sub1) arg3;
					if (local60.method2190() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class91_Sub1_Sub1(this, local48);
				}
				if (local15.method2191(local29, local25, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)V")
	@Override
	public void method6997(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt8267 = arg0;
		this.aClass362_1.method8471();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!as;IBII)V")
	public void method7121(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(13) int local13 = arg0.method8503();
		@Pc(20) int local20 = arg1 * this.method7140(local13);
		this.method7128(arg0);
		OpenGL.glDrawElements(4, arg2, local13, arg0.method8501() + (long) local20);
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "()Z")
	@Override
	public boolean method6993() {
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean682) {
			throw new RuntimeException("");
		}
		this.anInt8297 = arg3;
		this.anInt8288 = arg1;
		this.anInt8287 = arg2;
		this.anInt8309 = arg0;
		if (this.aBoolean675) {
			this.aClass374_1.aClass34_Sub6_1.method5691();
			this.aClass374_1.aClass34_Sub6_1.method5689();
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)Lclient!bba;")
	@Override
	public Interface3 method6978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rda", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method7109(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!rda", name = "i", descriptor = "(II)I")
	public int method7122(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(IZ)V")
	public void method7123(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean689) {
			this.aBoolean689 = arg0;
			this.method7081();
			this.anInt8282 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "(B)V")
	private void method7124() {
		OpenGL.glViewport(this.anInt8295, this.anInt8303, this.anInt8178, this.anInt8084);
	}

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "(II)V")
	public void method7125(@OriginalArg(1) int arg0) {
		Static151.aFloatArray4[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static151.aFloatArray4[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static151.aFloatArray4[3] = (float) (arg0 >>> 24) / 255.0F;
		Static151.aFloatArray4[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static151.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!rda", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean685 = arg0;
		this.method7085();
	}

	@OriginalMember(owner = "client!rda", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8292 = arg3;
		this.anInt8313 = arg1;
		this.anInt8301 = arg0;
		this.anInt8293 = arg2;
		this.method7119();
		this.method7063();
		if (this.anInt8305 == 3) {
			this.method7103();
		} else if (this.anInt8305 == 2) {
			this.method7138();
			return;
		}
	}

	@OriginalMember(owner = "client!rda", name = "z", descriptor = "()V")
	@Override
	public void method7061() {
		if (this.aBoolean666) {
			if (this.anInterface26_2 != this.aClass243_1) {
				throw new RuntimeException();
			}
			this.aClass243_1.method5839(0);
			this.aClass243_1.method5839(8);
			this.method7111(this.aClass243_1);
		} else if (this.aBoolean670) {
			this.aClass44_Sub2_1.method5328(0, 0, this.anInt8178, this.anInt8084, 0, 0);
			this.anOpenGL2.setSurface(this.aLong219);
		} else {
			throw new RuntimeException("");
		}
		this.anInt8178 = this.anInt8175;
		this.aClass44_Sub2_1 = null;
		this.anInt8084 = this.anInt8087;
		this.method7108();
		this.method7124();
		this.la();
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "()Lclient!ofa;")
	@Override
	public Class117 method6998() {
		return new Class117_Sub3();
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(IZ)V")
	public void method7126(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean686) {
			this.aBoolean686 = arg0;
			this.method7136();
		}
	}

	@OriginalMember(owner = "client!rda", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8306 > arg2) {
			this.anInt8306 = arg2;
		}
		if (arg0 > this.anInt8283) {
			this.anInt8283 = arg0;
		}
		if (arg3 < this.anInt8312) {
			this.anInt8312 = arg3;
		}
		if (this.anInt8307 < arg1) {
			this.anInt8307 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method7063();
		this.method7112();
	}

	@OriginalMember(owner = "client!rda", name = "x", descriptor = "(I)V")
	private void method7127() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL2.b()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static452.method7478(1000L);
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BLclient!as;)V")
	public void method7128(@OriginalArg(1) Interface2 arg0) {
		if (this.anInterface2_2 != arg0) {
			if (this.aBoolean668) {
				OpenGL.glBindBufferARB(34963, arg0.method8504());
			}
			this.anInterface2_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!rda", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt8271 = 0;
		while (arg0 > 1) {
			this.anInt8271++;
			arg0 >>= 0x1;
		}
		this.anInt8273 = 0x1 << this.anInt8271;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZIILclient!jaclib/memory/Buffer;I)Lclient!cs;")
	public Interface7 method7129(@OriginalArg(1) int arg0, @OriginalArg(3) Buffer arg1, @OriginalArg(4) int arg2) {
		return (Interface7) (this.aBoolean668 ? new Class259_Sub2(this, arg0, arg1, arg2, false) : new Class215_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(Lclient!ua;I)V")
	public void method7130(@OriginalArg(0) Interface26 arg0) {
		if (this.anInt8275 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8275 >= 0) {
			this.anInterface26Array1[this.anInt8275].method5822();
		}
		this.anInterface26_1 = this.anInterface26Array1[++this.anInt8275] = arg0;
		this.anInterface26_1.method5824();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!rc;[Lclient!jn;Z)Lclient!da;")
	@Override
	public Class6 method7000(@OriginalArg(0) Class298 arg0, @OriginalArg(1) Class176[] arg1) {
		return new Class6_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!rda", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7094(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IZI)V")
	public void method7131(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method7117(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!rda", name = "y", descriptor = "()Z")
	@Override
	public boolean method7055() {
		if (this.aClass5_Sub14_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass5_Sub14_Sub1_1.method7401()) {
			if (!this.aClass351_1.method8318(this.aClass5_Sub14_Sub1_1)) {
				return false;
			}
			this.aClass362_1.method8471();
		}
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "(B)V")
	private void method7132() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt8284; local7++) {
			@Pc(14) Class5_Sub27 local14 = this.aClass5_Sub27Array5[local7];
			Static581.aFloatArray72[0] = (float) local14.method6330();
			@Pc(25) int local25 = local7 + 16386;
			Static581.aFloatArray72[1] = (float) local14.method6334();
			Static581.aFloatArray72[2] = (float) local14.method6335();
			Static581.aFloatArray72[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static581.aFloatArray72, 0);
			@Pc(54) int local54 = local14.method6336();
			@Pc(60) float local60 = local14.method6331() / 255.0F;
			Static581.aFloatArray72[0] = (float) (local54 >> 16 & 0xFF) * local60;
			Static581.aFloatArray72[1] = local60 * (float) (local54 >> 8 & 0xFF);
			Static581.aFloatArray72[2] = (float) (local54 & 0xFF) * local60;
			OpenGL.glLightfv(local25, 4609, Static581.aFloatArray72, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method6338() * local14.method6338()));
			OpenGL.glEnable(local25);
		}
		while (local7 < this.anInt8311) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt8311 = this.anInt8284;
	}

	@OriginalMember(owner = "client!rda", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Class24_Sub4_Sub1 local9 = local6.aClass24_Sub4_Sub1_2;
		this.method7088();
		this.method7113(local6.aClass24_Sub4_Sub1_2);
		this.method7109(1);
		this.method7082(8448, 7681);
		this.method7135(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat154 / (float) local9.anInt7730;
		@Pc(46) float local46 = local9.aFloat153 / (float) local9.anInt7731;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8283 - arg2), local46 * (float) (this.anInt8307 - arg3));
		OpenGL.glVertex2i(this.anInt8283, this.anInt8307);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8283 - arg2), (float) (this.anInt8312 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8283, this.anInt8312);
		OpenGL.glTexCoord2f((float) (this.anInt8306 - arg2) * local39, (float) (this.anInt8312 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8306, this.anInt8312);
		OpenGL.glTexCoord2f((float) (this.anInt8306 - arg2) * local39, (float) (this.anInt8307 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8306, this.anInt8307);
		OpenGL.glEnd();
		this.method7135(768, 5890, 0);
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7042(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas9 == arg0) {
			local5 = this.aLong218;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable6.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas10) {
			this.method7086();
		}
	}

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "()V")
	@Override
	public void method7008() {
		this.aClass351_1.method8312();
	}

	@OriginalMember(owner = "client!rda", name = "y", descriptor = "(I)V")
	private void method7133() {
		Static151.aFloatArray4[1] = this.aFloat163 * this.aFloat161;
		Static151.aFloatArray4[0] = this.aFloat163 * this.aFloat164;
		Static151.aFloatArray4[3] = 1.0F;
		Static151.aFloatArray4[2] = this.aFloat163 * this.aFloat165;
		OpenGL.glLightModelfv(2899, Static151.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7014(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7031(arg2, arg3);
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "()Lclient!kea;")
	@Override
	public Class185 method6980() {
		@Pc(7) int local7 = -1;
		if (this.aString116.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString116.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString116.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class185(local7, "OpenGL", this.anInt8294, this.aString117, 0L);
	}

	@OriginalMember(owner = "client!rda", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass117_Sub3_3.aFloat188 + this.aClass117_Sub3_3.aFloat186 * (float) arg2 + this.aClass117_Sub3_3.aFloat185 * (float) arg1 + (float) arg0 * this.aClass117_Sub3_3.aFloat180;
		if (local28 < (float) this.anInt8304 || local28 > (float) this.anInt8289) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((float) this.anInt8293 * ((float) arg2 * this.aClass117_Sub3_3.aFloat183 + (float) arg1 * this.aClass117_Sub3_3.aFloat182 + (float) arg0 * this.aClass117_Sub3_3.aFloat187 + this.aClass117_Sub3_3.aFloat181) / (float) arg3);
		@Pc(119) int local119 = (int) ((this.aClass117_Sub3_3.aFloat179 * (float) arg1 + (float) arg0 * this.aClass117_Sub3_3.aFloat177 + (float) arg2 * this.aClass117_Sub3_3.aFloat184 + this.aClass117_Sub3_3.aFloat178) * (float) this.anInt8292 / (float) arg3);
		if ((float) local86 >= this.aFloat171 && this.aFloat158 >= (float) local86 && (float) local119 >= this.aFloat175 && (float) local119 <= this.aFloat167) {
			arg4[1] = (int) ((float) local119 - this.aFloat175);
			arg4[2] = (int) local28;
			arg4[0] = (int) ((float) local86 - this.aFloat171);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!rda", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt8178 < arg2) {
			arg2 = this.anInt8178;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt8084) {
			arg3 = this.anInt8084;
		}
		this.anInt8283 = arg0;
		this.anInt8306 = arg2;
		this.anInt8307 = arg1;
		this.anInt8312 = arg3;
		OpenGL.glEnable(3089);
		this.method7063();
		this.method7112();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IFFFF)V")
	public void method7134(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static151.aFloatArray4[3] = arg3;
		Static151.aFloatArray4[0] = arg1;
		Static151.aFloatArray4[1] = arg2;
		Static151.aFloatArray4[2] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static151.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIB)V")
	public void method7135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
	}

	@OriginalMember(owner = "client!rda", name = "m", descriptor = "()Z")
	@Override
	public boolean method7012() {
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(II)I")
	@Override
	public int method6989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7028() {
		this.method7096();
		this.method7109(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rda", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt8301, this.anInt8313, this.anInt8293, this.anInt8292 };
	}

	@OriginalMember(owner = "client!rda", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7096();
		this.method7109(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rda", name = "o", descriptor = "()Lclient!ofa;")
	@Override
	public Class117 method7018() {
		return this.aClass117_Sub3_1;
	}

	@OriginalMember(owner = "client!rda", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt8286 != arg0;
		if (local15 || this.aFloat156 != arg1 || this.aFloat159 != arg2) {
			this.aFloat156 = arg1;
			this.anInt8286 = arg0;
			this.aFloat159 = arg2;
			if (local15) {
				this.aFloat161 = (float) (this.anInt8286 & 0xFF00) / 65280.0F;
				this.aFloat164 = (float) (this.anInt8286 & 0xFF0000) / 1.671168E7F;
				this.aFloat165 = (float) (this.anInt8286 & 0xFF) / 255.0F;
				this.method7133();
			}
			this.method7092();
		}
		if (this.aFloatArray67[0] == arg3 && this.aFloatArray67[1] == arg4 && arg5 == this.aFloatArray67[2]) {
			return;
		}
		this.aFloatArray67[1] = arg4;
		this.aFloatArray67[2] = arg5;
		this.aFloatArray67[0] = arg3;
		this.aFloatArray66[2] = -arg5;
		this.aFloatArray66[1] = -arg4;
		this.aFloatArray66[0] = -arg3;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray65[0] = arg3 * local142;
		this.aFloatArray65[1] = arg4 * local142;
		this.aFloatArray65[2] = local142 * arg5;
		this.aFloatArray69[2] = -this.aFloatArray65[2];
		this.aFloatArray69[0] = -this.aFloatArray65[0];
		this.aFloatArray69[1] = -this.aFloatArray65[1];
		this.method7079();
		this.anInt8291 = (int) (arg3 * 256.0F / arg4);
		this.anInt8315 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!rda", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7096();
		this.method7109(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rda", name = "i", descriptor = "(B)V")
	private void method7136() {
		if (this.aBoolean671 && !this.aBoolean686) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!rda", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat163 != arg0) {
			this.aFloat163 = arg0;
			this.method7133();
		}
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "()Z")
	@Override
	public boolean method6977() {
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(ZI)V")
	public void method7137(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean664 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt8282 &= 0xFFFFFFE0;
		this.aBoolean664 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static649.method8908(this, arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "(B)V")
	private void method7138() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray68, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!nc;)V")
	@Override
	public void method7013(@OriginalArg(0) Interface16 arg0) {
	}

	@OriginalMember(owner = "client!rda", name = "z", descriptor = "(I)V")
	private void method7139() {
		this.anOpenGL2.a();
	}

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "(II)I")
	public int method7140(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "(B)V")
	private void method7141() {
		this.aFloatArray68[14] = this.aFloat170;
		this.aFloatArray68[10] = this.aFloat160;
		this.aFloat176 = (float) this.anInt8289;
		this.aFloat172 = (this.aFloatArray68[14] - (float) this.anInt8289) / this.aFloatArray68[10];
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([IIIIIZ)Lclient!hu;")
	@Override
	public Class44 method7047(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class44_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!rda", name = "A", descriptor = "(I)V")
	public void method7142() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(IIIIII)Lclient!tea;")
	@Override
	public Class91 method7039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean678 ? new Class91_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!rda", name = "B", descriptor = "(I)V")
	private void method7143() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass117_Sub3_4.method7265(), 0);
		if (this.aBoolean675) {
			this.aClass374_1.aClass34_Sub6_1.method5691();
		}
		this.method7079();
		this.method7132();
	}
}
