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

@OriginalClass("client!oea")
public final class Class87_Sub2 extends Class87 {

	@OriginalMember(owner = "client!oea", name = "pd", descriptor = "I")
	private int anInt7307;

	@OriginalMember(owner = "client!oea", name = "he", descriptor = "I")
	private int anInt7346;

	@OriginalMember(owner = "client!oea", name = "ne", descriptor = "I")
	public int anInt7352;

	@OriginalMember(owner = "client!oea", name = "te", descriptor = "I")
	public int anInt7358;

	@OriginalMember(owner = "client!oea", name = "Ke", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!oea", name = "Le", descriptor = "I")
	public int anInt7366;

	@OriginalMember(owner = "client!oea", name = "Se", descriptor = "Lclient!pw;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!oea", name = "Ue", descriptor = "Lclient!pw;")
	private Interface19 anInterface19_2;

	@OriginalMember(owner = "client!oea", name = "Ve", descriptor = "Lclient!kh;")
	private Class20_Sub3 aClass20_Sub3_1;

	@OriginalMember(owner = "client!oea", name = "We", descriptor = "Lclient!ij;")
	private Class161 aClass161_1;

	@OriginalMember(owner = "client!oea", name = "cf", descriptor = "I")
	public int anInt7372;

	@OriginalMember(owner = "client!oea", name = "df", descriptor = "I")
	private int anInt7373;

	@OriginalMember(owner = "client!oea", name = "ef", descriptor = "I")
	public int anInt7374;

	@OriginalMember(owner = "client!oea", name = "mf", descriptor = "I")
	private int anInt7375;

	@OriginalMember(owner = "client!oea", name = "nf", descriptor = "Z")
	private boolean aBoolean532;

	@OriginalMember(owner = "client!oea", name = "of", descriptor = "Z")
	private boolean aBoolean533;

	@OriginalMember(owner = "client!oea", name = "pf", descriptor = "Z")
	private boolean aBoolean534;

	@OriginalMember(owner = "client!oea", name = "qf", descriptor = "J")
	private long aLong208;

	@OriginalMember(owner = "client!oea", name = "rf", descriptor = "I")
	private int anInt7376;

	@OriginalMember(owner = "client!oea", name = "tf", descriptor = "Z")
	private boolean aBoolean535;

	@OriginalMember(owner = "client!oea", name = "uf", descriptor = "I")
	private int anInt7377;

	@OriginalMember(owner = "client!oea", name = "Af", descriptor = "Lclient!gea;")
	public Class25_Sub2 aClass25_Sub2_1;

	@OriginalMember(owner = "client!oea", name = "Bf", descriptor = "I")
	public int anInt7380;

	@OriginalMember(owner = "client!oea", name = "Ff", descriptor = "Lclient!tda;")
	private Interface23 anInterface23_5;

	@OriginalMember(owner = "client!oea", name = "Hf", descriptor = "I")
	public int anInt7381;

	@OriginalMember(owner = "client!oea", name = "Jf", descriptor = "I")
	private int anInt7382;

	@OriginalMember(owner = "client!oea", name = "Kf", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!oea", name = "Nf", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!oea", name = "Of", descriptor = "Lclient!dda;")
	public Class66 aClass66_11;

	@OriginalMember(owner = "client!oea", name = "Qf", descriptor = "Lclient!tda;")
	private Interface23 anInterface23_6;

	@OriginalMember(owner = "client!oea", name = "Sf", descriptor = "F")
	private float aFloat168;

	@OriginalMember(owner = "client!oea", name = "Tf", descriptor = "Lclient!me;")
	public Class88_Sub2 aClass88_Sub2_2;

	@OriginalMember(owner = "client!oea", name = "Wf", descriptor = "Z")
	public boolean aBoolean542;

	@OriginalMember(owner = "client!oea", name = "Xf", descriptor = "Z")
	private boolean aBoolean543;

	@OriginalMember(owner = "client!oea", name = "Yf", descriptor = "[Lclient!iia;")
	private Class88[] aClass88Array1;

	@OriginalMember(owner = "client!oea", name = "Zf", descriptor = "Lclient!gea;")
	public Class25_Sub2 aClass25_Sub2_2;

	@OriginalMember(owner = "client!oea", name = "cg", descriptor = "Ljava/lang/String;")
	private String aString70;

	@OriginalMember(owner = "client!oea", name = "dg", descriptor = "Z")
	public boolean aBoolean544;

	@OriginalMember(owner = "client!oea", name = "fg", descriptor = "Z")
	private boolean aBoolean545;

	@OriginalMember(owner = "client!oea", name = "gg", descriptor = "Lclient!dda;")
	public Class66 aClass66_12;

	@OriginalMember(owner = "client!oea", name = "hg", descriptor = "Lclient!gea;")
	public Class25_Sub2 aClass25_Sub2_3;

	@OriginalMember(owner = "client!oea", name = "ig", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!oea", name = "kg", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!oea", name = "mg", descriptor = "I")
	public int anInt7389;

	@OriginalMember(owner = "client!oea", name = "sg", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!oea", name = "ug", descriptor = "Z")
	private boolean aBoolean547;

	@OriginalMember(owner = "client!oea", name = "vg", descriptor = "Lclient!ff;")
	private Interface9 anInterface9_5;

	@OriginalMember(owner = "client!oea", name = "zg", descriptor = "I")
	public int anInt7392;

	@OriginalMember(owner = "client!oea", name = "Ag", descriptor = "Lclient!gea;")
	public Class25_Sub2 aClass25_Sub2_4;

	@OriginalMember(owner = "client!oea", name = "Ig", descriptor = "Z")
	public boolean aBoolean550;

	@OriginalMember(owner = "client!oea", name = "Jg", descriptor = "Z")
	public boolean aBoolean551;

	@OriginalMember(owner = "client!oea", name = "Lg", descriptor = "Z")
	private boolean aBoolean552;

	@OriginalMember(owner = "client!oea", name = "Mg", descriptor = "Z")
	private boolean aBoolean553;

	@OriginalMember(owner = "client!oea", name = "Ng", descriptor = "I")
	private int anInt7395;

	@OriginalMember(owner = "client!oea", name = "Qg", descriptor = "Z")
	public boolean aBoolean555;

	@OriginalMember(owner = "client!oea", name = "Tg", descriptor = "Lclient!gea;")
	public Class25_Sub2 aClass25_Sub2_5;

	@OriginalMember(owner = "client!oea", name = "Ug", descriptor = "Z")
	public boolean aBoolean556;

	@OriginalMember(owner = "client!oea", name = "Vg", descriptor = "I")
	private int anInt7399;

	@OriginalMember(owner = "client!oea", name = "Wg", descriptor = "Lclient!m;")
	private Class88_Sub2_Sub1 aClass88_Sub2_Sub1_4;

	@OriginalMember(owner = "client!oea", name = "Xg", descriptor = "I")
	private int anInt7400;

	@OriginalMember(owner = "client!oea", name = "Yg", descriptor = "Z")
	public boolean aBoolean557;

	@OriginalMember(owner = "client!oea", name = "ah", descriptor = "Lclient!gea;")
	public Class25_Sub2 aClass25_Sub2_6;

	@OriginalMember(owner = "client!oea", name = "ch", descriptor = "Lclient!gea;")
	public Class25_Sub2 aClass25_Sub2_7;

	@OriginalMember(owner = "client!oea", name = "eh", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!oea", name = "gh", descriptor = "I")
	private int anInt7403;

	@OriginalMember(owner = "client!oea", name = "hh", descriptor = "I")
	private int anInt7404;

	@OriginalMember(owner = "client!oea", name = "ih", descriptor = "Lclient!gea;")
	public Class25_Sub2 aClass25_Sub2_8;

	@OriginalMember(owner = "client!oea", name = "kh", descriptor = "Lclient!ij;")
	public Class161 aClass161_2;

	@OriginalMember(owner = "client!oea", name = "lh", descriptor = "Z")
	private boolean aBoolean558;

	@OriginalMember(owner = "client!oea", name = "nh", descriptor = "I")
	private int anInt7407;

	@OriginalMember(owner = "client!oea", name = "oh", descriptor = "F")
	private float aFloat183;

	@OriginalMember(owner = "client!oea", name = "ph", descriptor = "F")
	private float aFloat184;

	@OriginalMember(owner = "client!oea", name = "th", descriptor = "Ljava/lang/String;")
	private String aString71;

	@OriginalMember(owner = "client!oea", name = "uh", descriptor = "Z")
	public boolean aBoolean559;

	@OriginalMember(owner = "client!oea", name = "vh", descriptor = "I")
	private int anInt7411;

	@OriginalMember(owner = "client!oea", name = "wh", descriptor = "Z")
	public boolean aBoolean560;

	@OriginalMember(owner = "client!oea", name = "xh", descriptor = "Lclient!gea;")
	public Class25_Sub2 aClass25_Sub2_9;

	@OriginalMember(owner = "client!oea", name = "yh", descriptor = "Lclient!aq;")
	private Class22_Sub1 aClass22_Sub1_1;

	@OriginalMember(owner = "client!oea", name = "zh", descriptor = "Z")
	private boolean aBoolean561;

	@OriginalMember(owner = "client!oea", name = "Bh", descriptor = "Lclient!gea;")
	public Class25_Sub2 aClass25_Sub2_10;

	@OriginalMember(owner = "client!oea", name = "Gh", descriptor = "I")
	private int anInt7412;

	@OriginalMember(owner = "client!oea", name = "Ih", descriptor = "I")
	private int anInt7413;

	@OriginalMember(owner = "client!oea", name = "Cd", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!oea", name = "ve", descriptor = "I")
	public int anInt7359 = 128;

	@OriginalMember(owner = "client!oea", name = "Ge", descriptor = "Lclient!nv;")
	private final Class239 aClass239_1 = new Class239();

	@OriginalMember(owner = "client!oea", name = "Ie", descriptor = "Lclient!aca;")
	private final Class6_Sub1 aClass6_Sub1_1 = new Class6_Sub1();

	@OriginalMember(owner = "client!oea", name = "Je", descriptor = "Lclient!aca;")
	public final Class6_Sub1 aClass6_Sub1_2 = new Class6_Sub1();

	@OriginalMember(owner = "client!oea", name = "Me", descriptor = "I")
	public int anInt7367 = 3;

	@OriginalMember(owner = "client!oea", name = "Ne", descriptor = "I")
	public int anInt7368 = 8;

	@OriginalMember(owner = "client!oea", name = "Pe", descriptor = "Z")
	private boolean aBoolean531 = false;

	@OriginalMember(owner = "client!oea", name = "Oe", descriptor = "Lclient!nt;")
	private final Class238 aClass238_43 = new Class238();

	@OriginalMember(owner = "client!oea", name = "Re", descriptor = "I")
	private int anInt7369 = -1;

	@OriginalMember(owner = "client!oea", name = "Te", descriptor = "[Lclient!pw;")
	private final Interface19[] anInterface19Array1 = new Interface19[4];

	@OriginalMember(owner = "client!oea", name = "Ye", descriptor = "[Lclient!pw;")
	private final Interface19[] anInterface19Array2 = new Interface19[4];

	@OriginalMember(owner = "client!oea", name = "af", descriptor = "[Lclient!pw;")
	private final Interface19[] anInterface19Array3 = new Interface19[4];

	@OriginalMember(owner = "client!oea", name = "Ze", descriptor = "I")
	private int anInt7371 = -1;

	@OriginalMember(owner = "client!oea", name = "Xe", descriptor = "I")
	private int anInt7370 = -1;

	@OriginalMember(owner = "client!oea", name = "bf", descriptor = "Lclient!nt;")
	private final Class238 bf;

	@OriginalMember(owner = "client!oea", name = "ff", descriptor = "Lclient!nt;")
	private final Class238 aClass238_44;

	@OriginalMember(owner = "client!oea", name = "gf", descriptor = "Lclient!nt;")
	private final Class238 aClass238_45;

	@OriginalMember(owner = "client!oea", name = "hf", descriptor = "Lclient!nt;")
	private final Class238 aClass238_46;

	@OriginalMember(owner = "client!oea", name = "jf", descriptor = "Lclient!nt;")
	private final Class238 aClass238_47;

	@OriginalMember(owner = "client!oea", name = "kf", descriptor = "Lclient!nt;")
	private final Class238 aClass238_48;

	@OriginalMember(owner = "client!oea", name = "lf", descriptor = "Lclient!nt;")
	private final Class238 aClass238_49;

	@OriginalMember(owner = "client!oea", name = "sf", descriptor = "Lclient!aca;")
	public final Class6_Sub1 aClass6_Sub1_3;

	@OriginalMember(owner = "client!oea", name = "vf", descriptor = "Lclient!aca;")
	public final Class6_Sub1 aClass6_Sub1_4;

	@OriginalMember(owner = "client!oea", name = "wf", descriptor = "Lclient!aca;")
	public final Class6_Sub1 aClass6_Sub1_5;

	@OriginalMember(owner = "client!oea", name = "zf", descriptor = "I")
	public int anInt7379;

	@OriginalMember(owner = "client!oea", name = "Lf", descriptor = "[F")
	private final float[] aFloatArray61;

	@OriginalMember(owner = "client!oea", name = "ag", descriptor = "I")
	private int anInt7385;

	@OriginalMember(owner = "client!oea", name = "eg", descriptor = "I")
	private int anInt7386;

	@OriginalMember(owner = "client!oea", name = "xf", descriptor = "I")
	public int anInt7378;

	@OriginalMember(owner = "client!oea", name = "Vf", descriptor = "I")
	public int anInt7384;

	@OriginalMember(owner = "client!oea", name = "If", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!oea", name = "tg", descriptor = "I")
	public int anInt7390;

	@OriginalMember(owner = "client!oea", name = "Gf", descriptor = "F")
	private float aFloat164;

	@OriginalMember(owner = "client!oea", name = "jg", descriptor = "I")
	private int anInt7387;

	@OriginalMember(owner = "client!oea", name = "lg", descriptor = "I")
	public int anInt7388;

	@OriginalMember(owner = "client!oea", name = "Uf", descriptor = "[F")
	public final float[] aFloatArray62;

	@OriginalMember(owner = "client!oea", name = "Fg", descriptor = "F")
	public float aFloat177;

	@OriginalMember(owner = "client!oea", name = "Hg", descriptor = "F")
	public float aFloat179;

	@OriginalMember(owner = "client!oea", name = "Bg", descriptor = "F")
	public float aFloat176;

	@OriginalMember(owner = "client!oea", name = "wg", descriptor = "F")
	private float aFloat175;

	@OriginalMember(owner = "client!oea", name = "qg", descriptor = "[F")
	private final float[] aFloatArray63;

	@OriginalMember(owner = "client!oea", name = "Rg", descriptor = "I")
	public int anInt7397;

	@OriginalMember(owner = "client!oea", name = "Zg", descriptor = "I")
	private int anInt7401;

	@OriginalMember(owner = "client!oea", name = "Pf", descriptor = "I")
	private int anInt7383;

	@OriginalMember(owner = "client!oea", name = "Sg", descriptor = "I")
	private int anInt7398;

	@OriginalMember(owner = "client!oea", name = "Dg", descriptor = "[F")
	private final float[] aFloatArray65;

	@OriginalMember(owner = "client!oea", name = "bh", descriptor = "F")
	public float aFloat180;

	@OriginalMember(owner = "client!oea", name = "yg", descriptor = "I")
	private int anInt7391;

	@OriginalMember(owner = "client!oea", name = "Og", descriptor = "Z")
	private boolean aBoolean554;

	@OriginalMember(owner = "client!oea", name = "Cf", descriptor = "Z")
	private boolean aBoolean537;

	@OriginalMember(owner = "client!oea", name = "bg", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!oea", name = "ng", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!oea", name = "Gg", descriptor = "F")
	private float aFloat178;

	@OriginalMember(owner = "client!oea", name = "fh", descriptor = "F")
	private float aFloat182;

	@OriginalMember(owner = "client!oea", name = "rh", descriptor = "I")
	public int anInt7409;

	@OriginalMember(owner = "client!oea", name = "pg", descriptor = "F")
	private float aFloat173;

	@OriginalMember(owner = "client!oea", name = "mh", descriptor = "I")
	public int anInt7406;

	@OriginalMember(owner = "client!oea", name = "sh", descriptor = "I")
	private int anInt7410;

	@OriginalMember(owner = "client!oea", name = "jh", descriptor = "I")
	public int anInt7405;

	@OriginalMember(owner = "client!oea", name = "dh", descriptor = "I")
	public int anInt7402;

	@OriginalMember(owner = "client!oea", name = "rg", descriptor = "[F")
	private final float[] aFloatArray64;

	@OriginalMember(owner = "client!oea", name = "qh", descriptor = "I")
	public int anInt7408;

	@OriginalMember(owner = "client!oea", name = "Kg", descriptor = "I")
	private int anInt7394;

	@OriginalMember(owner = "client!oea", name = "Cg", descriptor = "I")
	private int anInt7393;

	@OriginalMember(owner = "client!oea", name = "Ch", descriptor = "[Lclient!bh;")
	private final Class2_Sub4[] aClass2_Sub4Array5;

	@OriginalMember(owner = "client!oea", name = "Ah", descriptor = "Lclient!mea;")
	public Class2_Sub34_Sub1 aClass2_Sub34_Sub1_3;

	@OriginalMember(owner = "client!oea", name = "Dh", descriptor = "[I")
	public int[] anIntArray497;

	@OriginalMember(owner = "client!oea", name = "Hh", descriptor = "[I")
	public int[] anIntArray499;

	@OriginalMember(owner = "client!oea", name = "Fh", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!oea", name = "Eh", descriptor = "[I")
	public int[] anIntArray498;

	@OriginalMember(owner = "client!oea", name = "Db", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas9;

	@OriginalMember(owner = "client!oea", name = "Td", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!oea", name = "Fe", descriptor = "I")
	public final int anInt7365;

	@OriginalMember(owner = "client!oea", name = "ob", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!oea", name = "Cb", descriptor = "J")
	private final long aLong206;

	@OriginalMember(owner = "client!oea", name = "ld", descriptor = "J")
	private long aLong207;

	@OriginalMember(owner = "client!oea", name = "Pg", descriptor = "I")
	public final int anInt7396;

	@OriginalMember(owner = "client!oea", name = "Mf", descriptor = "Z")
	public boolean aBoolean540;

	@OriginalMember(owner = "client!oea", name = "Rf", descriptor = "Z")
	public boolean aBoolean541;

	@OriginalMember(owner = "client!oea", name = "yf", descriptor = "Z")
	private boolean aBoolean536;

	@OriginalMember(owner = "client!oea", name = "Df", descriptor = "Z")
	public boolean aBoolean538;

	@OriginalMember(owner = "client!oea", name = "xg", descriptor = "Z")
	public boolean aBoolean548;

	@OriginalMember(owner = "client!oea", name = "Eg", descriptor = "Z")
	private boolean aBoolean549;

	@OriginalMember(owner = "client!oea", name = "og", descriptor = "Z")
	public boolean aBoolean546;

	@OriginalMember(owner = "client!oea", name = "Ef", descriptor = "Z")
	private final boolean aBoolean539;

	@OriginalMember(owner = "client!oea", name = "Ae", descriptor = "Lclient!vga;")
	private final Class357 aClass357_1;

	@OriginalMember(owner = "client!oea", name = "Qe", descriptor = "Lclient!tha;")
	public final Class323 aClass323_1;

	@OriginalMember(owner = "client!oea", name = "Be", descriptor = "Lclient!si;")
	private final Class305 aClass305_1;

	@OriginalMember(owner = "client!oea", name = "we", descriptor = "Lclient!uba;")
	private Class2_Sub48_Sub1 aClass2_Sub48_Sub1_1;

	@OriginalMember(owner = "client!oea", name = "xe", descriptor = "Lclient!uu;")
	private final Class348 aClass348_1;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class87_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class175();
		new Class222(16);
		this.bf = new Class238();
		this.aClass238_44 = new Class238();
		this.aClass238_45 = new Class238();
		this.aClass238_46 = new Class238();
		this.aClass238_47 = new Class238();
		this.aClass238_48 = new Class238();
		this.aClass238_49 = new Class238();
		this.aClass6_Sub1_3 = new Class6_Sub1();
		this.aClass6_Sub1_4 = new Class6_Sub1();
		this.aClass6_Sub1_5 = new Class6_Sub1();
		this.anInt7379 = 0;
		this.aFloatArray61 = new float[4];
		this.anInt7385 = 0;
		this.anInt7386 = 8448;
		this.anInt7378 = -1;
		this.anInt7384 = 512;
		this.aFloat165 = -1.0F;
		this.anInt7390 = 0;
		this.aFloat164 = 0.0F;
		this.anInt7387 = 0;
		this.anInt7388 = 0;
		this.aFloatArray62 = new float[4];
		this.aFloat177 = -1.0F;
		this.aFloat179 = 1.0F;
		this.aFloat176 = 1.0F;
		this.aFloat175 = 1.0F;
		this.aFloatArray63 = new float[4];
		this.anInt7397 = 50;
		this.anInt7401 = 3584;
		this.anInt7383 = -1;
		this.anInt7398 = 0;
		this.aFloatArray65 = new float[16];
		this.aFloat180 = 1.0F;
		this.anInt7391 = 8448;
		this.aBoolean554 = true;
		this.aBoolean537 = false;
		this.aFloat169 = 3584.0F;
		this.aFloat172 = 3584.0F;
		this.aFloat178 = -1.0F;
		this.aFloat182 = -1.0F;
		this.anInt7409 = 512;
		this.aFloat173 = 1.0F;
		this.anInt7406 = -1;
		this.anInt7410 = 0;
		this.anInt7405 = -1;
		this.anInt7402 = -1;
		this.aFloatArray64 = new float[4];
		this.anInt7408 = 0;
		this.anInt7394 = 0;
		this.anInt7393 = 0;
		this.aClass2_Sub4Array5 = new Class2_Sub4[Static511.anInt7701];
		this.aClass2_Sub34_Sub1_3 = new Class2_Sub34_Sub1(8192);
		this.anIntArray497 = new int[1];
		this.anIntArray499 = new int[1];
		this.aByteArray71 = new byte[16384];
		this.anIntArray498 = new int[1];
		this.aCanvas10 = this.aCanvas9 = arg0;
		this.anInt7365 = arg2;
		if (!Static472.method6791("jaclib")) {
			throw new RuntimeException("");
		} else if (Static472.method6791("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong207 = this.aLong206 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt7365);
				if (this.aLong206 == 0L) {
					throw new RuntimeException("");
				}
				this.method6216();
				@Pc(333) int local333 = this.method6190();
				if (local333 != 0) {
					throw new RuntimeException("");
				}
				this.anInt7396 = this.aBoolean559 ? 33639 : 5121;
				if (this.aString70.indexOf("radeon") != -1) {
					@Pc(356) int local356 = 0;
					@Pc(358) boolean local358 = false;
					@Pc(360) boolean local360 = false;
					@Pc(369) String[] local369 = Static218.method3754(' ', this.aString70.replace('/', ' '));
					for (@Pc(371) int local371 = 0; local371 < local369.length; local371++) {
						@Pc(376) String local376 = local369[local371];
						try {
							if (local376.length() > 0) {
								if (local376.charAt(0) == 'x' && local376.length() >= 3 && Static515.method7239(local376.substring(1, 3))) {
									local376 = local376.substring(1);
									local360 = true;
								}
								if (local376.equals("hd")) {
									local358 = true;
								} else {
									if (local376.startsWith("hd")) {
										local376 = local376.substring(2);
										local358 = true;
									}
									if (local376.length() >= 4 && Static515.method7239(local376.substring(0, 4))) {
										local356 = Static56.method1026(local376.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(447) Exception local447) {
						}
					}
					if (!local358 || local356 < 4000) {
						this.aBoolean540 = false;
					}
					if (!local360 && !local358) {
						if (local356 >= 7000 && local356 <= 9250) {
							this.aBoolean541 = false;
						}
						if (local356 >= 7000 && local356 <= 7999) {
							this.aBoolean536 = false;
						}
					}
					this.aBoolean538 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean548 = true;
					this.aBoolean549 = this.aBoolean536;
				}
				if (this.aString71.indexOf("intel") != -1) {
					this.aBoolean546 = false;
				}
				this.aBoolean539 = !this.aString71.equals("s3 graphics");
				if (this.aBoolean536) {
					try {
						@Pc(529) int[] local529 = new int[1];
						OpenGL.glGenBuffersARB(1, local529, 0);
					} catch (@Pc(535) Throwable local535) {
						throw new RuntimeException("");
					}
				}
				Static240.method3965(false, true);
				this.aBoolean531 = true;
				this.aClass357_1 = new Class357(this, super.anInterface6_11);
				this.method6211();
				this.aClass323_1 = new Class323(this);
				this.aClass305_1 = new Class305(this);
				if (this.aClass305_1.method7282()) {
					this.aClass2_Sub48_Sub1_1 = new Class2_Sub48_Sub1(this);
					if (!this.aClass2_Sub48_Sub1_1.method7784()) {
						this.aClass2_Sub48_Sub1_1.method7781();
						this.aClass2_Sub48_Sub1_1 = null;
					}
				}
				this.aClass348_1 = new Class348(this);
				this.method6198();
				this.method6226();
				this.method7919();
			} catch (@Pc(609) Throwable local609) {
				local609.printStackTrace();
				this.method7970();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "([IIIIIZ)Lclient!kr;")
	@Override
	public Class20 method7956(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class20_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!oea", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt7410;
		arg0[2] = this.anInt7387;
		arg0[1] = this.anInt7394;
		arg0[0] = this.anInt7385;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!tda;I)V")
	public void method6145(@OriginalArg(0) Interface23 arg0) {
		if (this.anInterface23_5 != arg0) {
			if (this.aBoolean536) {
				OpenGL.glBindBufferARB(34962, arg0.method5651());
			}
			this.anInterface23_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "([I)V")
	@Override
	public void method7887(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt7352;
		arg0[0] = this.anInt7358;
	}

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "(I)V")
	public void method6146() {
		if (this.anInt7376 == 8) {
			return;
		}
		this.method6214();
		this.method6156(true);
		this.method6217(true);
		this.method6225(true);
		this.method6196(1);
		this.anInt7376 = 8;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!pw;Z)V")
	public void method6147(@OriginalArg(0) Interface19 arg0) {
		if (this.anInt7371 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7371 >= 0) {
			this.anInterface19Array2[this.anInt7371].method3949();
		}
		this.anInterface19_2 = this.anInterface19Array2[++this.anInt7371] = arg0;
		this.anInterface19_2.method3948();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7891(@OriginalArg(0) Canvas arg0) {
		this.aLong207 = 0L;
		this.aCanvas10 = null;
		if (arg0 == null || arg0 == this.aCanvas9) {
			this.aCanvas10 = this.aCanvas9;
			this.aLong207 = this.aLong206;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable6.get(arg0);
			this.aLong207 = local26;
			this.aCanvas10 = arg0;
		}
		if (this.aCanvas10 == null || this.aLong207 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong207);
		this.method6226();
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(B)V")
	public void method6149() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIB)V")
	public synchronized void method6150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class2_Sub15 local12 = new Class2_Sub15(arg1);
		local12.aLong287 = arg0;
		this.aClass238_45.method5837(local12);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!dda;Lclient!dda;Lclient!dda;Lclient!dda;B)V")
	public void method6151(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) Class66 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6145(arg0.anInterface23_1);
			OpenGL.glVertexPointer(arg0.aByte44, arg0.aShort40, this.anInterface23_5.method5654(), this.anInterface23_5.method5653() + (long) arg0.aByte43);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6145(arg1.anInterface23_1);
			OpenGL.glNormalPointer(arg1.aShort40, this.anInterface23_5.method5654(), this.anInterface23_5.method5653() + (long) arg1.aByte43);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6145(arg2.anInterface23_1);
			OpenGL.glColorPointer(arg2.aByte44, arg2.aShort40, this.anInterface23_5.method5654(), this.anInterface23_5.method5653() + (long) arg2.aByte43);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6145(arg3.anInterface23_1);
			OpenGL.glTexCoordPointer(arg3.aByte44, arg3.aShort40, this.anInterface23_5.method5654(), this.anInterface23_5.method5653() + (long) arg3.aByte43);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BI)V")
	public synchronized void method6152(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub15 local8 = new Class2_Sub15(arg0);
		this.aClass238_46.method5837(local8);
	}

	@OriginalMember(owner = "client!oea", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt7408, this.anInt7379, this.anInt7409, this.anInt7384 };
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!aca;B)V")
	public void method6153(@OriginalArg(0) Class6_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method107(), 0);
	}

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7397 == arg0 && this.anInt7401 == arg1) {
			return;
		}
		this.anInt7401 = arg1;
		this.anInt7397 = arg0;
		this.method6191();
		this.method6222();
		if (this.anInt7400 == 3) {
			this.method6213();
		} else if (this.anInt7400 == 2) {
			this.method6179();
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIZ)Lclient!kr;")
	@Override
	public Class20 method7927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class20_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oea", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean554 = arg0;
		this.method6221();
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "()V")
	@Override
	public void method7893() {
		this.aClass305_1.method7286();
	}

	@OriginalMember(owner = "client!oea", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt7373 + this.anInt7374 + this.anInt7372;
	}

	@OriginalMember(owner = "client!oea", name = "A", descriptor = "()V")
	@Override
	protected void method7970() {
		for (@Pc(4) Class2 local4 = this.aClass238_43.method5833(); local4 != null; local4 = this.aClass238_43.method5838()) {
			((Class2_Sub11_Sub1) local4).method1132();
		}
		if (this.aClass305_1 != null) {
			this.aClass305_1.method7284();
		}
		if (this.anOpenGL2 != null) {
			this.method6194();
			@Pc(37) Enumeration local37 = this.aHashtable6.keys();
			while (local37.hasMoreElements()) {
				@Pc(42) Canvas local42 = (Canvas) local37.nextElement();
				@Pc(48) Long local48 = (Long) this.aHashtable6.get(local42);
				this.anOpenGL2.releaseSurface(local42, local48);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean531) {
			Static410.method6301(false, true);
			this.aBoolean531 = false;
		}
	}

	@OriginalMember(owner = "client!oea", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(53) float local53;
		if (this.aClass88_Sub2_Sub1_4 == null || arg2 > this.aClass88_Sub2_Sub1_4.anInt6216 || arg3 > this.aClass88_Sub2_Sub1_4.anInt6213) {
			this.aClass88_Sub2_Sub1_4 = Static608.method2888(arg6, arg2, arg3, this);
			this.aClass88_Sub2_Sub1_4.method5202(false, false);
			local53 = this.aClass88_Sub2_Sub1_4.aFloat153;
			local41 = this.aClass88_Sub2_Sub1_4.aFloat152;
		} else {
			this.aClass88_Sub2_Sub1_4.method5201(false, arg2, 6406, arg6, arg3);
			local41 = this.aClass88_Sub2_Sub1_4.aFloat152 * (float) arg3 / (float) this.aClass88_Sub2_Sub1_4.anInt6213;
			local53 = this.aClass88_Sub2_Sub1_4.aFloat153 * (float) arg2 / (float) this.aClass88_Sub2_Sub1_4.anInt6216;
		}
		this.method6197();
		this.method6167(this.aClass88_Sub2_Sub1_4);
		this.method6196(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method6203(arg5);
		this.method6227(34165, 34165);
		this.method6206(0, 768, 34166);
		this.method6206(2, 770, 5890);
		this.method6195(34166, 0);
		this.method6195(5890, 2);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = local143 + (float) arg2;
		@Pc(156) float local156 = (float) arg3 + local146;
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
		this.method6206(0, 768, 5890);
		this.method6206(2, 770, 34166);
		this.method6195(5890, 0);
		this.method6195(34166, 2);
	}

	@OriginalMember(owner = "client!oea", name = "g", descriptor = "(II)V")
	public void method6155(@OriginalArg(0) int arg0) {
		if (this.anInt7399 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt7399 = arg0;
		}
	}

	@OriginalMember(owner = "client!oea", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method6196(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZI)V")
	public void method6156(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean545) {
			this.aBoolean545 = arg0;
			this.method6189();
			this.anInt7376 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7894() {
		this.method6220();
		this.method6196(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!oo;)V")
	@Override
	public void method7939(@OriginalArg(0) Class247 arg0) {
		this.aClass239_1.method5850(this, -1, arg0);
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6220();
		this.method6196(arg5);
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
		OpenGL.glVertex2f((float) arg2 + local16 + 0.35F, local22 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!oea", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7380 = arg0;
		this.anInt7402 = arg2;
		this.aBoolean556 = true;
		this.anInt7390 = arg3;
		this.anInt7406 = arg1;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIZ[B)Lclient!ff;")
	public Interface9 method6157(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface9) (this.aBoolean536 && (!arg1 || this.aBoolean549) ? new Class3_Sub1(this, 5123, arg2, arg0, arg1) : new Class232_Sub2(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!oea", name = "z", descriptor = "()Z")
	@Override
	public boolean method7968() {
		return true;
	}

	@OriginalMember(owner = "client!oea", name = "g", descriptor = "(I)V")
	@Override
	public void method7922(@OriginalArg(0) int arg0) {
		this.method6194();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(III)V")
	public synchronized void method6158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub15 local16 = new Class2_Sub15(arg1);
		local16.aLong287 = arg0;
		this.aClass238_44.method5837(local16);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7929(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aNativeHeap5 = ((Class2_Sub11_Sub1) arg0).aNativeHeap1;
		if (this.anInterface23_6 != null) {
			return;
		}
		@Pc(16) Class2_Sub34_Sub1 local16 = new Class2_Sub34_Sub1(80);
		if (this.aBoolean559) {
			local16.method5393(-1.0F);
			local16.method5393(-1.0F);
			local16.method5393(0.0F);
			local16.method5393(0.0F);
			local16.method5393(1.0F);
			local16.method5393(1.0F);
			local16.method5393(-1.0F);
			local16.method5393(0.0F);
			local16.method5393(1.0F);
			local16.method5393(1.0F);
			local16.method5393(1.0F);
			local16.method5393(1.0F);
			local16.method5393(0.0F);
			local16.method5393(1.0F);
			local16.method5393(0.0F);
			local16.method5393(-1.0F);
			local16.method5393(1.0F);
			local16.method5393(0.0F);
			local16.method5393(0.0F);
			local16.method5393(0.0F);
		} else {
			local16.method5392(-1.0F);
			local16.method5392(-1.0F);
			local16.method5392(0.0F);
			local16.method5392(0.0F);
			local16.method5392(1.0F);
			local16.method5392(1.0F);
			local16.method5392(-1.0F);
			local16.method5392(0.0F);
			local16.method5392(1.0F);
			local16.method5392(1.0F);
			local16.method5392(1.0F);
			local16.method5392(1.0F);
			local16.method5392(0.0F);
			local16.method5392(1.0F);
			local16.method5392(0.0F);
			local16.method5392(-1.0F);
			local16.method5392(1.0F);
			local16.method5392(0.0F);
			local16.method5392(0.0F);
			local16.method5392(0.0F);
		}
		this.anInterface23_6 = this.method6160(false, local16.aByteArray77, 20, local16.anInt8188);
		this.aClass66_12 = new Class66(this.anInterface23_6, 5126, 3, 0);
		this.aClass66_11 = new Class66(this.anInterface23_6, 5126, 2, 12);
		this.aClass239_1.method5849(this);
	}

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "(II)V")
	public void method6159(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method6227(7681, 7681);
		} else if (arg0 == 0) {
			this.method6227(8448, 8448);
		} else if (arg0 == 2) {
			this.method6227(34165, 7681);
		} else if (arg0 == 3) {
			this.method6227(260, 8448);
		} else if (arg0 == 4) {
			this.method6227(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!oea", name = "r", descriptor = "()Z")
	@Override
	public boolean method7943() {
		return this.aBoolean552 && (!this.method7914() || this.aBoolean558);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z)V")
	@Override
	public void method7902(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oea", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat174) {
			this.aFloat174 = arg0;
			this.method6171();
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z[BIII)Lclient!tda;")
	public Interface23 method6160(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return (Interface23) (this.aBoolean536 && (!arg0 || this.aBoolean549) ? new Class3_Sub2(this, arg2, arg1, arg3, arg0) : new Class232_Sub1(this, arg2, arg1, arg3));
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILclient!pw;)V")
	public void method6161(@OriginalArg(1) Interface19 arg0) {
		if (this.anInt7370 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7370 >= 0) {
			this.anInterface19Array1[this.anInt7370].method3952();
		}
		this.anInterface19_1 = this.anInterface19Array1[++this.anInt7370] = arg0;
		this.anInterface19_1.method3951();
	}

	@OriginalMember(owner = "client!oea", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6225(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!oea", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7385 < arg0) {
			this.anInt7385 = arg0;
		}
		if (this.anInt7387 > arg2) {
			this.anInt7387 = arg2;
		}
		if (this.anInt7394 < arg1) {
			this.anInt7394 = arg1;
		}
		if (this.anInt7410 > arg3) {
			this.anInt7410 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method6176();
		this.method6180();
	}

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "()V")
	@Override
	public void method7917() {
	}

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "(II)I")
	@Override
	public int method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!oea", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Class88_Sub2_Sub1 local9 = local6.aClass88_Sub2_Sub1_3;
		this.method6197();
		this.method6167(local6.aClass88_Sub2_Sub1_3);
		this.method6196(1);
		this.method6227(7681, 8448);
		this.method6206(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat153 / (float) local9.anInt6219;
		@Pc(46) float local46 = local9.aFloat152 / (float) local9.anInt6223;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7385 - arg2), local46 * (float) (this.anInt7394 - arg3));
		OpenGL.glVertex2i(this.anInt7385, this.anInt7394);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7385 - arg2), (float) (this.anInt7410 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt7385, this.anInt7410);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7387 - arg2), (float) (this.anInt7410 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt7387, this.anInt7410);
		OpenGL.glTexCoord2f((float) (this.anInt7387 - arg2) * local39, local46 * (float) (this.anInt7394 - arg3));
		OpenGL.glVertex2i(this.anInt7387, this.anInt7394);
		OpenGL.glEnd();
		this.method6206(0, 768, 5890);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BILclient!ff;II)V")
	public void method6162(@OriginalArg(1) int arg0, @OriginalArg(2) Interface9 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1.method6316();
		@Pc(14) int local14 = arg2 * this.method6164(local7);
		this.method6165(arg1);
		OpenGL.glDrawElements(4, arg0, local7, (long) local14 + arg1.method6317());
	}

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub11 method7920(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub11_Sub1 local8 = new Class2_Sub11_Sub1(arg0);
		this.aClass238_43.method5837(local8);
		return local8;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I[Lclient!bh;)V")
	@Override
	public void method7926(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass2_Sub4Array5[local3] = arg1[local3];
		}
		this.anInt7382 = arg0;
		if (this.anInt7400 != 1) {
			this.method6177();
		}
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(B)V")
	private void method6163() {
		if (this.aBoolean543) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean543 = false;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static256.method4211(this, arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!oea", name = "i", descriptor = "(II)I")
	public int method6164(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!ff;Z)V")
	public void method6165(@OriginalArg(0) Interface9 arg0) {
		if (arg0 != this.anInterface9_5) {
			if (this.aBoolean536) {
				OpenGL.glBindBufferARB(34963, arg0.method6315());
			}
			this.anInterface9_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7945(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static181.aFloat108 = arg1;
		Static311.aFloat132 = arg2;
		Static638.aFloat195 = arg0;
	}

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method7954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method6220();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method6196(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean552) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean552) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(FI)V")
	public void method6166(@OriginalArg(0) float arg0) {
		if (this.aFloat173 != arg0) {
			this.aFloat173 = arg0;
			if (this.anInt7400 == 3) {
				this.method6213();
			}
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!iia;I)V")
	public void method6167(@OriginalArg(0) Class88 arg0) {
		@Pc(17) Class88 local17 = this.aClass88Array1[this.anInt7399];
		if (local17 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local17.anInt8317);
			} else {
				if (local17 == null) {
					OpenGL.glEnable(arg0.anInt8317);
				} else if (local17.anInt8317 != arg0.anInt8317) {
					OpenGL.glDisable(local17.anInt8317);
					OpenGL.glEnable(arg0.anInt8317);
				}
				OpenGL.glBindTexture(arg0.anInt8317, arg0.method6989());
			}
			this.aClass88Array1[this.anInt7399] = arg0;
		}
		this.anInt7376 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg5;
		@Pc(9) Class88_Sub2_Sub1 local9 = local6.aClass88_Sub2_Sub1_3;
		this.method6197();
		this.method6167(local6.aClass88_Sub2_Sub1_3);
		this.method6196(1);
		this.method6227(7681, 8448);
		this.method6206(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat153 / (float) local9.anInt6219;
		@Pc(46) float local46 = local9.aFloat152 / (float) local9.anInt6223;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local59 * local59)));
		@Pc(76) float local76 = local59 * local72;
		@Pc(80) float local80 = local52 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local80 + 0.35F, local76 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method6206(0, 768, 5890);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IB)V")
	public synchronized void method6168(@OriginalArg(0) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong287 = arg0;
		this.aClass238_48.method5837(local7);
	}

	@OriginalMember(owner = "client!oea", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass6_Sub1_3.aFloat3 * (float) arg0 + (float) arg1 * this.aClass6_Sub1_3.aFloat6 + this.aClass6_Sub1_3.aFloat2 * (float) arg2 + this.aClass6_Sub1_3.aFloat12;
		if ((float) this.anInt7397 > local28 || (float) this.anInt7401 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass6_Sub1_3.aFloat11 + this.aClass6_Sub1_3.aFloat4 * (float) arg0 + (float) arg1 * this.aClass6_Sub1_3.aFloat7 + this.aClass6_Sub1_3.aFloat8 * (float) arg2) * (float) this.anInt7409 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt7384 * (this.aClass6_Sub1_3.aFloat13 * (float) arg2 + (float) arg0 * this.aClass6_Sub1_3.aFloat10 + this.aClass6_Sub1_3.aFloat5 * (float) arg1 + this.aClass6_Sub1_3.aFloat9) / local28);
		if ((float) local85 >= this.aFloat181 && this.aFloat171 >= (float) local85 && this.aFloat167 <= (float) local117 && this.aFloat170 >= (float) local117) {
			arg3[0] = (int) ((float) local85 - this.aFloat181);
			arg3[1] = (int) ((float) local117 - this.aFloat167);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "(B)V")
	public void method6169() {
		if (this.anInt7376 == 16) {
			return;
		}
		this.method6215();
		this.method6156(true);
		this.method6217(true);
		this.method6225(true);
		this.method6196(1);
		this.anInt7376 = 16;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BFF)V")
	public void method6170(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat175 = arg1;
		this.aFloat164 = arg0;
		this.method6222();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!oo;I)V")
	@Override
	public void method7972(@OriginalArg(0) Class247 arg0, @OriginalArg(1) int arg1) {
		this.aClass239_1.method5850(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "(B)V")
	private void method6171() {
		Static399.aFloatArray60[3] = 1.0F;
		Static399.aFloatArray60[1] = this.aFloat180 * this.aFloat174;
		Static399.aFloatArray60[0] = this.aFloat176 * this.aFloat174;
		Static399.aFloatArray60[2] = this.aFloat179 * this.aFloat174;
		OpenGL.glLightModelfv(2899, Static399.aFloatArray60, 0);
	}

	@OriginalMember(owner = "client!oea", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt7378 && arg1 == this.anInt7405 && this.anInt7388 == arg2) {
			return;
		}
		this.anInt7388 = arg2;
		this.anInt7378 = arg0;
		this.anInt7405 = arg1;
		this.method6222();
		this.method6189();
	}

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "(B)V")
	public void method6172() {
		if (this.anInt7376 == 4) {
			return;
		}
		this.method6175();
		this.method6156(false);
		this.method6205(false);
		this.method6217(false);
		this.method6225(false);
		this.method6228(-2);
		this.method6196(1);
		this.anInt7376 = 4;
	}

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "()Z")
	@Override
	public boolean method7914() {
		return this.aClass2_Sub48_Sub1_1 != null && this.aClass2_Sub48_Sub1_1.method7778();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7906(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(JB)V")
	public synchronized void method6173(@OriginalArg(0) long arg0) {
		@Pc(15) Class2 local15 = new Class2();
		local15.aLong287 = arg0;
		this.aClass238_49.method5837(local15);
	}

	@OriginalMember(owner = "client!oea", name = "v", descriptor = "()Z")
	@Override
	public boolean method7955() {
		if (this.aClass2_Sub48_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub48_Sub1_1.method7778()) {
			if (!this.aClass305_1.method7285(this.aClass2_Sub48_Sub1_1)) {
				return false;
			}
			this.aClass357_1.method8216();
		}
		return true;
	}

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "(II)Lclient!c;")
	@Override
	public Interface2 method7973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIF)Lclient!bh;")
	@Override
	public Class2_Sub4 method7928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub4_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oea", name = "m", descriptor = "(I)Lclient!ni;")
	public Class88_Sub3 method6174() {
		return this.aClass22_Sub1_1 == null ? null : this.aClass22_Sub1_1.method8508();
	}

	@OriginalMember(owner = "client!oea", name = "x", descriptor = "()Z")
	@Override
	public boolean method7962() {
		return this.aClass348_1.method8060();
	}

	@OriginalMember(owner = "client!oea", name = "n", descriptor = "(I)V")
	private void method6175() {
		if (this.anInt7400 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt7358 > 0 && this.anInt7352 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt7358, (double) this.anInt7352, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt7376 &= 0xFFFFFFE7;
		this.anInt7400 = 1;
	}

	@OriginalMember(owner = "client!oea", name = "o", descriptor = "(I)V")
	private void method6176() {
		this.aFloat171 = this.anInt7387 - this.anInt7408;
		this.aFloat167 = this.anInt7394 - this.anInt7379;
		this.aFloat170 = this.anInt7410 - this.anInt7379;
		this.aFloat181 = this.anInt7385 - this.anInt7408;
	}

	@OriginalMember(owner = "client!oea", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt7397;
	}

	@OriginalMember(owner = "client!oea", name = "p", descriptor = "()V")
	@Override
	public void method7940() {
		if (this.aClass2_Sub48_Sub1_1 != null && this.aClass2_Sub48_Sub1_1.method7778()) {
			this.aClass305_1.method7281(this.aClass2_Sub48_Sub1_1);
			this.aClass357_1.method8216();
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIZ)Lclient!kr;")
	@Override
	public Class20 method7931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class20_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!oea", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!oea", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6220();
		this.method6196(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!oea", name = "g", descriptor = "(B)V")
	private void method6177() {
		@Pc(17) int local17;
		for (local17 = 0; local17 < this.anInt7382; local17++) {
			@Pc(23) Class2_Sub4 local23 = this.aClass2_Sub4Array5[local17];
			Static460.aFloatArray68[0] = local23.method8150();
			@Pc(34) int local34 = local17 + 16386;
			Static460.aFloatArray68[1] = local23.method8158();
			Static460.aFloatArray68[2] = local23.method8151();
			Static460.aFloatArray68[3] = 1.0F;
			OpenGL.glLightfv(local34, 4611, Static460.aFloatArray68, 0);
			@Pc(61) int local61 = local23.method8152();
			@Pc(67) float local67 = local23.method8156() / 255.0F;
			Static460.aFloatArray68[1] = (float) (local61 >> 8 & 0xFF) * local67;
			Static460.aFloatArray68[0] = local67 * (float) (local61 >> 16 & 0xFF);
			Static460.aFloatArray68[2] = (float) (local61 & 0xFF) * local67;
			OpenGL.glLightfv(local34, 4609, Static460.aFloatArray68, 0);
			OpenGL.glLightf(local34, 4617, 1.0F / (float) (local23.method8154() * local23.method8154()));
			OpenGL.glEnable(local34);
		}
		while (local17 < this.anInt7403) {
			OpenGL.glDisable(local17 + 16386);
			local17++;
		}
		this.anInt7403 = this.anInt7382;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 == arg2 && arg3 == arg1) {
			return;
		}
		@Pc(13) Class1_Sub3 local13 = (Class1_Sub3) arg5;
		@Pc(16) Class88_Sub2_Sub1 local16 = local13.aClass88_Sub2_Sub1_3;
		this.method6197();
		this.method6167(local13.aClass88_Sub2_Sub1_3);
		this.method6196(1);
		this.method6227(7681, 8448);
		this.method6206(0, 768, 34167);
		@Pc(46) float local46 = local16.aFloat153 / (float) local16.anInt6219;
		@Pc(53) float local53 = local16.aFloat152 / (float) local16.anInt6223;
		@Pc(59) float local59 = (float) arg2 - (float) arg0;
		@Pc(66) float local66 = (float) -arg1 + (float) arg3;
		@Pc(79) float local79 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local66 * local66)));
		@Pc(86) int local86 = arg10 % (arg9 + arg8);
		@Pc(90) float local90 = local59 * local79;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(109) float local109 = local66 * local79;
		@Pc(114) float local114 = (float) arg8 * local90;
		@Pc(119) float local119 = (float) arg8 * local109;
		@Pc(121) float local121 = 0.0F;
		@Pc(123) float local123 = 0.0F;
		@Pc(125) float local125 = local114;
		@Pc(127) float local127 = local119;
		if (arg8 < local86) {
			local123 = local109 * (float) (arg9 + arg8 - local86);
			local121 = (float) (arg9 + arg8 - local86) * local90;
		} else {
			local127 = (float) (arg8 - local86) * local109;
			local125 = (float) (arg8 - local86) * local90;
		}
		@Pc(177) float local177 = local121 + (float) arg0 + 0.35F;
		@Pc(184) float local184 = local123 + (float) arg1 + 0.35F;
		@Pc(189) float local189 = (float) arg9 * local90;
		@Pc(194) float local194 = local109 * (float) arg9;
		while (true) {
			if (arg0 >= arg2) {
				if ((float) arg2 + 0.35F > local177) {
					break;
				}
				if (local177 + local125 < (float) arg2) {
					local125 = (float) arg2 - local177;
				}
			} else {
				if (local177 > (float) arg2 + 0.35F) {
					break;
				}
				if (local177 + local125 > (float) arg2) {
					local125 = (float) arg2 - local177;
				}
			}
			if (arg3 <= arg1) {
				if (local184 < (float) arg3 + 0.35F) {
					break;
				}
				if (local127 + local184 < (float) arg3) {
					local127 = (float) arg3 - local184;
				}
			} else {
				if (local184 > (float) arg3 + 0.35F) {
					break;
				}
				if (local127 + local184 > (float) arg3) {
					local127 = (float) arg3 - local184;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local46 * ((float) -arg6 + local177), local53 * (local184 - (float) arg7));
			OpenGL.glVertex2f(local177, local184);
			OpenGL.glTexCoord2f(local46 * ((float) -arg6 + local177 + local125), (local127 + local184 - (float) arg7) * local53);
			OpenGL.glVertex2f(local177 + local125, local184 + local127);
			OpenGL.glEnd();
			local184 += local194 + local127;
			local177 += local125 + local189;
			local125 = local114;
			local127 = local119;
		}
		this.method6206(0, 768, 5890);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass305_1.method7278(arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "(B)V")
	private void method6178() {
		OpenGL.glViewport(this.anInt7398, this.anInt7393, this.anInt7358, this.anInt7352);
	}

	@OriginalMember(owner = "client!oea", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt7383 != arg0;
		if (local15 || this.aFloat177 != arg1 || arg2 != this.aFloat165) {
			this.anInt7383 = arg0;
			this.aFloat165 = arg2;
			this.aFloat177 = arg1;
			if (local15) {
				this.aFloat180 = (float) (this.anInt7383 & 0xFF00) / 65280.0F;
				this.aFloat176 = (float) (this.anInt7383 & 0xFF0000) / 1.671168E7F;
				this.aFloat179 = (float) (this.anInt7383 & 0xFF) / 255.0F;
				this.method6171();
			}
			this.method6204();
		}
		if (arg3 == this.aFloatArray61[0] && arg4 == this.aFloatArray61[1] && arg5 == this.aFloatArray61[2]) {
			return;
		}
		this.aFloatArray61[2] = arg5;
		this.aFloatArray61[1] = arg4;
		this.aFloatArray61[0] = arg3;
		this.aFloatArray63[0] = -arg3;
		this.aFloatArray63[1] = -arg4;
		this.aFloatArray63[2] = -arg5;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray62[0] = arg3 * local142;
		this.aFloatArray62[1] = arg4 * local142;
		this.aFloatArray62[2] = arg5 * local142;
		this.aFloatArray64[2] = -this.aFloatArray62[2];
		this.aFloatArray64[1] = -this.aFloatArray62[1];
		this.aFloatArray64[0] = -this.aFloatArray62[0];
		this.method6219();
		this.anInt7381 = (int) (arg5 * 256.0F / arg4);
		this.anInt7392 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(Z)V")
	private void method6179() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray65, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "(I)V")
	@Override
	public void method7947() {
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!sfa;Lclient!sfa;FLclient!sfa;)Lclient!sfa;")
	@Override
	public Class22 method7923(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class22 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean542 && this.aBoolean546) {
			@Pc(15) Class22_Sub1_Sub2 local15 = null;
			@Pc(18) Class22_Sub1 local18 = (Class22_Sub1) arg0;
			@Pc(21) Class22_Sub1 local21 = (Class22_Sub1) arg1;
			@Pc(25) Class88_Sub3 local25 = local18.method8508();
			@Pc(29) Class88_Sub3 local29 = local21.method8508();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt6803 > local29.anInt6803 ? local25.anInt6803 : local29.anInt6803;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class22_Sub1_Sub2) {
					@Pc(60) Class22_Sub1_Sub2 local60 = (Class22_Sub1_Sub2) arg3;
					if (local60.method8512() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class22_Sub1_Sub2(this, local48);
				}
				if (local15.method8513(arg2, local25, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!oea", name = "p", descriptor = "(I)V")
	private void method6180() {
		if (this.anInt7387 >= this.anInt7385 && this.anInt7394 <= this.anInt7410) {
			OpenGL.glScissor(this.anInt7398 + this.anInt7385, -this.anInt7410 + this.anInt7393 - -this.anInt7352, this.anInt7387 - this.anInt7385, this.anInt7410 - this.anInt7394);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!oea", name = "q", descriptor = "(I)V")
	public void method6181() {
		if (this.anInt7400 != 0) {
			this.anInt7400 = 0;
			this.anInt7376 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!pw;I)V")
	public void method6182(@OriginalArg(0) Interface19 arg0) {
		if (this.anInt7370 < 0 || arg0 != this.anInterface19Array1[this.anInt7370]) {
			throw new RuntimeException();
		}
		this.anInterface19Array1[this.anInt7370--] = null;
		arg0.method3952();
		if (this.anInt7370 >= 0) {
			this.anInterface19_1 = this.anInterface19Array1[this.anInt7370];
			this.anInterface19_1.method3951();
		} else {
			this.anInterface19_1 = null;
		}
	}

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "()Z")
	@Override
	public boolean method7915() {
		return true;
	}

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "(II)I")
	public int method6183(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!oea", name = "w", descriptor = "()Z")
	@Override
	public boolean method7958() {
		return false;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BLclient!pw;)V")
	public void method6184(@OriginalArg(1) Interface19 arg0) {
		if (this.aBoolean557) {
			this.method6182(arg0);
			this.method6223(arg0);
		} else if (this.anInt7369 >= 0 && this.anInterface19Array3[this.anInt7369] == arg0) {
			this.anInterface19Array3[this.anInt7369--] = null;
			arg0.method3953();
			if (this.anInt7369 < 0) {
				this.anInterface19_1 = this.anInterface19_2 = null;
			} else {
				this.anInterface19_1 = this.anInterface19_2 = this.anInterface19Array3[this.anInt7369];
				this.anInterface19_1.method3950();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(FFFFZ)V")
	public void method6185(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static399.aFloatArray60[1] = arg3;
		Static399.aFloatArray60[3] = arg2;
		Static399.aFloatArray60[0] = arg0;
		Static399.aFloatArray60[2] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static399.aFloatArray60, 0);
	}

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "()Lclient!kd;")
	@Override
	public Class6 method7910() {
		return new Class6_Sub1();
	}

	@OriginalMember(owner = "client!oea", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6220();
		this.method6196(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!oea", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass6_Sub1_3.aFloat12 + this.aClass6_Sub1_3.aFloat2 * (float) arg2 + (float) arg0 * this.aClass6_Sub1_3.aFloat3 + this.aClass6_Sub1_3.aFloat6 * (float) arg1;
		if (local28 < (float) this.anInt7397 || (float) this.anInt7401 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((float) this.anInt7409 * (this.aClass6_Sub1_3.aFloat11 + this.aClass6_Sub1_3.aFloat4 * (float) arg0 + (float) arg1 * this.aClass6_Sub1_3.aFloat7 + this.aClass6_Sub1_3.aFloat8 * (float) arg2) / (float) arg3);
		@Pc(119) int local119 = (int) ((this.aClass6_Sub1_3.aFloat5 * (float) arg1 + this.aClass6_Sub1_3.aFloat10 * (float) arg0 + (float) arg2 * this.aClass6_Sub1_3.aFloat13 + this.aClass6_Sub1_3.aFloat9) * (float) this.anInt7384 / (float) arg3);
		if (this.aFloat181 <= (float) local86 && this.aFloat171 >= (float) local86 && (float) local119 >= this.aFloat167 && this.aFloat170 >= (float) local119) {
			arg4[0] = (int) ((float) local86 - this.aFloat181);
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local119 - this.aFloat167);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "()Lclient!kd;")
	@Override
	public Class6 method7892() {
		return this.aClass6_Sub1_1;
	}

	@OriginalMember(owner = "client!oea", name = "r", descriptor = "(I)V")
	public void method6186() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!oea", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.aClass6_Sub1_3.aFloat2 + (float) arg1 * this.aClass6_Sub1_3.aFloat6 + (float) arg0 * this.aClass6_Sub1_3.aFloat3 + this.aClass6_Sub1_3.aFloat12;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((this.aClass6_Sub1_3.aFloat11 + (float) arg2 * this.aClass6_Sub1_3.aFloat8 + (float) arg1 * this.aClass6_Sub1_3.aFloat7 + this.aClass6_Sub1_3.aFloat4 * (float) arg0) * (float) this.anInt7409 / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat181);
		@Pc(118) int local118 = (int) ((float) this.anInt7384 * (this.aClass6_Sub1_3.aFloat9 + (float) arg2 * this.aClass6_Sub1_3.aFloat13 + (float) arg1 * this.aClass6_Sub1_3.aFloat5 + this.aClass6_Sub1_3.aFloat10 * (float) arg0) / local28);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local118 - this.aFloat167);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!aca;I)V")
	public void method6187(@OriginalArg(0) Class6_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method107(), 0);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!c;Lclient!vi;)Lclient!uaa;")
	@Override
	public Interface24 method7900(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Interface25 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!pw;B)V")
	public void method6188(@OriginalArg(0) Interface19 arg0) {
		if (this.aBoolean557) {
			this.method6161(arg0);
			this.method6147(arg0);
		} else if (this.anInt7369 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt7369 >= 0) {
				this.anInterface19Array3[this.anInt7369].method3953();
			}
			this.anInterface19_1 = this.anInterface19_2 = this.anInterface19Array3[++this.anInt7369] = arg0;
			this.anInterface19_1.method3950();
		}
	}

	@OriginalMember(owner = "client!oea", name = "s", descriptor = "(I)V")
	private void method6189() {
		if (this.aBoolean545 && this.anInt7405 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7946(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas9) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable6.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "(Z)I")
	private int method6190() {
		@Pc(5) int local5 = 0;
		this.aString71 = OpenGL.glGetString(7936).toLowerCase();
		this.aString70 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString71.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString71.indexOf("brian paul") != -1 || this.aString71.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static218.method3754(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(65) int local65 = Static56.method1026(local53[0]);
				@Pc(71) int local71 = Static56.method1026(local53[1]);
				this.anInt7404 = local65 * 10 + local71;
			} catch (@Pc(81) NumberFormatException local81) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt7404 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(119) int[] local119 = new int[1];
		OpenGL.glGetIntegerv(34018, local119, 0);
		this.anInt7389 = local119[0];
		OpenGL.glGetIntegerv(34929, local119, 0);
		this.anInt7395 = local119[0];
		OpenGL.glGetIntegerv(34930, local119, 0);
		this.anInt7407 = local119[0];
		if (this.anInt7389 < 2 || this.anInt7395 < 2 || this.anInt7407 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean559 = Stream.b();
		this.aBoolean547 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean536 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean552 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean555 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean544 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean560 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean541 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean538 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean542 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean540 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean550 = false;
		this.aBoolean546 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean557 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean551 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean558 = this.aBoolean551 & this.aBoolean557;
		OpenGL.glGetFloatv(2834, Static399.aFloatArray60, 0);
		this.aFloat178 = Static399.aFloatArray60[1];
		this.aFloat182 = Static399.aFloatArray60[0];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!oea", name = "t", descriptor = "(I)V")
	private void method6191() {
		@Pc(6) float[] local6 = this.aFloatArray65;
		@Pc(18) float local18 = (float) (this.anInt7397 * -this.anInt7408) / (float) this.anInt7409;
		@Pc(33) float local33 = (float) ((this.anInt7358 - this.anInt7408) * this.anInt7397) / (float) this.anInt7409;
		@Pc(54) float local54 = (float) (this.anInt7379 * this.anInt7397) / (float) this.anInt7384;
		@Pc(69) float local69 = (float) (this.anInt7397 * (this.anInt7379 - this.anInt7352)) / (float) this.anInt7384;
		if (local18 == local33 || local69 == local54) {
			local6[4] = 0.0F;
			local6[11] = 0.0F;
			local6[9] = 0.0F;
			local6[0] = 1.0F;
			local6[7] = 0.0F;
			local6[12] = 0.0F;
			local6[2] = 0.0F;
			local6[6] = 0.0F;
			local6[15] = 1.0F;
			local6[1] = 0.0F;
			local6[8] = 0.0F;
			local6[10] = 1.0F;
			local6[3] = 0.0F;
			local6[13] = 0.0F;
			local6[5] = 1.0F;
			local6[14] = 0.0F;
		} else {
			@Pc(149) float local149 = (float) this.anInt7397 * 2.0F;
			local6[9] = (local54 + local69) / (local54 - local69);
			local6[4] = 0.0F;
			local6[10] = this.aFloat184 = (float) -(this.anInt7401 + this.anInt7397) / (float) (this.anInt7401 - this.anInt7397);
			local6[0] = local149 / (local33 - local18);
			local6[6] = 0.0F;
			local6[13] = 0.0F;
			local6[7] = 0.0F;
			local6[14] = this.aFloat183 = -(local149 * (float) this.anInt7401) / (float) (this.anInt7401 - this.anInt7397);
			local6[3] = 0.0F;
			local6[5] = local149 / (local54 - local69);
			local6[12] = 0.0F;
			local6[2] = 0.0F;
			local6[15] = 0.0F;
			local6[11] = -1.0F;
			local6[8] = (local33 + local18) / (-local18 + local33);
			local6[1] = 0.0F;
		}
		this.method6218();
	}

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "(II)I")
	public int method6192(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IZI)V")
	public void method6193(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method6207(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!oea", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean556) {
			throw new RuntimeException("");
		}
		this.anInt7406 = arg1;
		this.anInt7402 = arg2;
		this.anInt7390 = arg3;
		this.anInt7380 = arg0;
		if (this.aBoolean537) {
			this.aClass348_1.aClass107_Sub7_1.method6691();
			this.aClass348_1.aClass107_Sub7_1.method6687();
		}
	}

	@OriginalMember(owner = "client!oea", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt7412;
		this.anInt7412 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!oea", name = "i", descriptor = "(B)V")
	private void method6194() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(IIII)V")
	public void method6195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!oea", name = "l", descriptor = "(II)V")
	public void method6196(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt7377) {
			return;
		}
		@Pc(22) boolean local22;
		@Pc(24) byte local24;
		if (arg0 == 1) {
			local22 = true;
			local24 = 1;
		} else if (arg0 == 2) {
			local24 = 2;
			local22 = false;
		} else if (arg0 == 128) {
			local22 = true;
			local24 = 3;
		} else {
			local22 = false;
			local24 = 0;
		}
		if (!this.aBoolean532) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean532 = true;
		}
		if (this.aBoolean535 != local22) {
			if (local22) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean535 = local22;
		}
		if (local24 != this.anInt7375) {
			if (local24 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local24 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local24 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt7375 = local24;
		}
		this.anInt7377 = arg0;
		this.anInt7376 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!oea", name = "u", descriptor = "(I)V")
	public void method6197() {
		if (this.anInt7376 == 2) {
			return;
		}
		this.method6175();
		this.method6156(false);
		this.method6205(false);
		this.method6217(false);
		this.method6225(false);
		this.method6228(-2);
		this.anInt7376 = 2;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(II)V")
	@Override
	public void method7907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!oea", name = "v", descriptor = "(I)V")
	private void method6198() {
		this.method6228(-2);
		for (@Pc(12) int local12 = this.anInt7389 - 1; local12 >= 0; local12--) {
			this.method6155(local12);
			this.method6167(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6227(8448, 8448);
		this.method6206(2, 770, 34168);
		this.method6163();
		this.anInt7377 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt7375 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean535 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean532 = true;
		this.method6156(true);
		this.method6205(true);
		this.method6217(true);
		this.method6225(true);
		this.method6181();
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
		this.anInt7383 = this.anInt7378 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "(B)V")
	private void method6199() {
		if (this.aBoolean561 && !this.aBoolean553) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7924(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas9 == arg0) {
			local5 = this.aLong206;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable6.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas10) {
			this.method6226();
		}
	}

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "(Z)V")
	private void method6200() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass6_Sub1_4.method107(), 0);
		if (this.aBoolean537) {
			this.aClass348_1.aClass107_Sub7_1.method6691();
		}
		this.method6219();
		this.method6177();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(FFFI)V")
	private void method6201(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean543) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean543 = true;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(III)V")
	public synchronized void method6202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub15 local8 = new Class2_Sub15(arg1);
		local8.aLong287 = arg0;
		this.aClass238_47.method5837(local8);
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(BI)V")
	public void method6203(@OriginalArg(1) int arg0) {
		Static399.aFloatArray60[3] = (float) (arg0 >>> 24) / 255.0F;
		Static399.aFloatArray60[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static399.aFloatArray60[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static399.aFloatArray60[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static399.aFloatArray60, 0);
	}

	@OriginalMember(owner = "client!oea", name = "n", descriptor = "()Z")
	@Override
	public boolean method7936() {
		return true;
	}

	@OriginalMember(owner = "client!oea", name = "w", descriptor = "(I)V")
	private void method6204() {
		Static399.aFloatArray60[0] = this.aFloat177 * this.aFloat176;
		Static399.aFloatArray60[2] = this.aFloat177 * this.aFloat179;
		Static399.aFloatArray60[3] = 1.0F;
		Static399.aFloatArray60[1] = this.aFloat177 * this.aFloat180;
		OpenGL.glLightfv(16384, 4609, Static399.aFloatArray60, 0);
		Static399.aFloatArray60[1] = this.aFloat180 * -this.aFloat165;
		Static399.aFloatArray60[2] = -this.aFloat165 * this.aFloat179;
		Static399.aFloatArray60[3] = 1.0F;
		Static399.aFloatArray60[0] = -this.aFloat165 * this.aFloat176;
		OpenGL.glLightfv(16385, 4609, Static399.aFloatArray60, 0);
	}

	@OriginalMember(owner = "client!oea", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt7387 = this.anInt7358;
		this.anInt7410 = this.anInt7352;
		this.anInt7394 = 0;
		this.anInt7385 = 0;
		OpenGL.glDisable(3089);
		this.method6176();
	}

	@OriginalMember(owner = "client!oea", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = (float) arg1 * this.aClass6_Sub1_3.aFloat6 + (float) arg0 * this.aClass6_Sub1_3.aFloat3 + this.aClass6_Sub1_3.aFloat2 * (float) arg2 + this.aClass6_Sub1_3.aFloat12;
		@Pc(55) float local55 = this.aClass6_Sub1_3.aFloat2 * (float) arg5 + this.aClass6_Sub1_3.aFloat3 * (float) arg3 + this.aClass6_Sub1_3.aFloat6 * (float) arg4 + this.aClass6_Sub1_3.aFloat12;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt7397 && local55 < (float) this.anInt7397) {
			local57 |= 0x10;
		} else if ((float) this.anInt7401 < local30 && (float) this.anInt7401 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass6_Sub1_3.aFloat11 + this.aClass6_Sub1_3.aFloat8 * (float) arg2 + (float) arg1 * this.aClass6_Sub1_3.aFloat7 + this.aClass6_Sub1_3.aFloat4 * (float) arg0) * (float) this.anInt7409 / (float) arg6);
		@Pc(157) int local157 = (int) (((float) arg4 * this.aClass6_Sub1_3.aFloat7 + (float) arg3 * this.aClass6_Sub1_3.aFloat4 + (float) arg5 * this.aClass6_Sub1_3.aFloat8 + this.aClass6_Sub1_3.aFloat11) * (float) this.anInt7409 / (float) arg6);
		if (this.aFloat181 > (float) local124 && this.aFloat181 > (float) local157) {
			local57 |= 0x1;
		} else if (this.aFloat171 < (float) local124 && this.aFloat171 < (float) local157) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((float) this.anInt7384 * ((float) arg0 * this.aClass6_Sub1_3.aFloat10 + this.aClass6_Sub1_3.aFloat5 * (float) arg1 + (float) arg2 * this.aClass6_Sub1_3.aFloat13 + this.aClass6_Sub1_3.aFloat9) / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt7384 * (this.aClass6_Sub1_3.aFloat9 + this.aClass6_Sub1_3.aFloat13 * (float) arg5 + (float) arg3 * this.aClass6_Sub1_3.aFloat10 + (float) arg4 * this.aClass6_Sub1_3.aFloat5) / (float) arg6);
		if ((float) local224 < this.aFloat167 && this.aFloat167 > (float) local257) {
			local57 |= 0x4;
		} else if (this.aFloat170 < (float) local224 && (float) local257 > this.aFloat170) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!oea", name = "u", descriptor = "()I")
	@Override
	public int method7953() {
		return 4;
	}

	@OriginalMember(owner = "client!oea", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt7352 - arg1 - local12, arg2, 1, 32993, this.anInt7396, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!oea", name = "q", descriptor = "()Lclient!sia;")
	@Override
	public Class306 method7942() {
		@Pc(7) int local7 = -1;
		if (this.aString71.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString71.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString71.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class306(local7, "OpenGL", this.anInt7404, this.aString70, 0L);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!fw;Z)Lclient!kr;")
	@Override
	public Class20 method7969(@OriginalArg(0) Class120 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt3710 * arg0.anInt3707];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray35 == null) {
			for (local21 = 0; local21 < arg0.anInt3707; local21++) {
				for (local25 = 0; local25 < arg0.anInt3710; local25++) {
					@Pc(38) int local38 = arg0.anIntArray261[arg0.aByteArray36[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt3707; local21++) {
				for (local25 = 0; local25 < arg0.anInt3710; local25++) {
					local12[local16++] = arg0.anIntArray261[arg0.aByteArray36[local14] & 0xFF] | arg0.aByteArray35[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(124) Class20 local124 = this.method7913(arg0.anInt3710, local12, arg0.anInt3710, arg0.anInt3707);
		local124.method4592(arg0.anInt3708, arg0.anInt3705, arg0.anInt3706, arg0.anInt3709);
		return local124;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZB)V")
	public void method6205(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean561 != arg0) {
			this.aBoolean561 = arg0;
			this.method6199();
			this.anInt7376 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIZI)V")
	public void method6206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(II)I")
	@Override
	public int method7950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!sfa;)V")
	@Override
	public void method7934(@OriginalArg(0) Class22 arg0) {
		this.aClass22_Sub1_1 = (Class22_Sub1) arg0;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IZZI)V")
	public void method6207(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 != this.anInt7411 || this.aBoolean556 != this.aBoolean537) {
			@Pc(18) Class88_Sub2 local18 = null;
			@Pc(20) int local20 = 0;
			@Pc(22) byte local22 = 0;
			@Pc(24) int local24 = 0;
			@Pc(31) int local31 = this.aBoolean556 ? 3 : 0;
			if (arg2 < 0) {
				this.method6163();
			} else {
				local18 = this.aClass357_1.method8220(arg2);
				@Pc(48) Class199 local48 = super.anInterface6_11.method6357(arg2);
				if (local48.aByte88 == 0 && local48.aByte87 == 0) {
					this.method6163();
				} else {
					@Pc(68) int local68 = local48.aBoolean428 ? 64 : 128;
					@Pc(72) int local72 = local68 * 50;
					this.method6201((float) (this.anInt7366 % local72 * local48.aByte87) / (float) local72, 0.0F, (float) (local48.aByte88 * (this.anInt7366 % local72)) / (float) local72);
				}
				if (!this.aBoolean556) {
					local31 = local48.aByte86;
					local22 = local48.aByte82;
					local24 = local48.anInt5688;
				}
				local20 = local48.anInt5687;
			}
			this.aClass348_1.method8059(arg0, local31, arg1, local24, local22);
			if (!this.aClass348_1.method8062(local18, local20)) {
				this.method6167(local18);
				this.method6159(local20);
			}
			this.aBoolean537 = this.aBoolean556;
			this.anInt7411 = arg2;
		}
		this.anInt7376 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(III)V")
	public void method6208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7398 = arg1;
		this.anInt7393 = arg0;
		this.method6178();
		this.method6180();
	}

	@OriginalMember(owner = "client!oea", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt7385 > arg0 + arg2 || this.anInt7387 < arg0 - arg2 || arg1 + arg2 < this.anInt7394 || this.anInt7410 < arg1 - arg2) {
			return;
		}
		this.method6220();
		this.method6196(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(67) float local67 = (float) arg0 + 0.35F;
		@Pc(72) float local72 = (float) arg1 + 0.35F;
		@Pc(76) int local76 = arg2 << 1;
		if ((float) local76 < this.aFloat182) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local67 + 1.0F, local72 + 1.0F);
			OpenGL.glVertex2f(local67 + 1.0F, local72 - 1.0F);
			OpenGL.glVertex2f(local67 - 1.0F, -1.0F + local72);
			OpenGL.glVertex2f(local67 - 1.0F, local72 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local76 <= this.aFloat178) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local76);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local67, local72);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local67, local72);
			@Pc(131) int local131 = 262144 / (arg2 * 6);
			if (local131 <= 64) {
				local131 = 64;
			} else if (local131 > 512) {
				local131 = 512;
			}
			local131 = Static291.method4549(local131);
			OpenGL.glVertex2f((float) arg2 + local67, local72);
			for (@Pc(159) int local159 = 16384 - local131; local159 > 0; local159 -= local131) {
				OpenGL.glVertex2f(local67 + (float) arg2 * Class155.aFloatArray39[local159], Class155.aFloatArray40[local159] * (float) arg2 + local72);
			}
			OpenGL.glVertex2f((float) arg2 + local67, local72);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!oea", name = "y", descriptor = "()Z")
	@Override
	public boolean method7967() {
		return this.aClass2_Sub48_Sub1_1 != null && (this.anInt7365 <= 1 || this.aBoolean558);
	}

	@OriginalMember(owner = "client!oea", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7379 = arg1;
		this.anInt7384 = arg3;
		this.anInt7408 = arg0;
		this.anInt7409 = arg2;
		this.method6191();
		this.method6176();
		if (this.anInt7400 == 3) {
			this.method6213();
		} else if (this.anInt7400 == 2) {
			this.method6179();
			return;
		}
	}

	@OriginalMember(owner = "client!oea", name = "t", descriptor = "()Lclient!kd;")
	@Override
	public Class6 method7951() {
		return this.aClass6_Sub1_3;
	}

	@OriginalMember(owner = "client!oea", name = "l", descriptor = "()V")
	@Override
	public void method7919() {
		if (!this.aBoolean539 || this.anInt7358 <= 0 || this.anInt7352 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt7385;
		@Pc(25) int local25 = this.anInt7387;
		@Pc(28) int local28 = this.anInt7394;
		@Pc(31) int local31 = this.anInt7410;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6181();
		this.method6156(false);
		this.method6205(false);
		this.method6217(false);
		this.method6225(false);
		this.method6167(null);
		this.method6228(-2);
		this.method6159(1);
		this.method6196(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt7358, this.anInt7352, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7918(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class2_Sub15 local19;
		while (!this.aClass238_44.method5839()) {
			local19 = (Class2_Sub15) this.aClass238_44.method5832();
			Static481.anIntArray561[local7++] = (int) local19.aLong287;
			this.anInt7374 -= local19.anInt1789;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static481.anIntArray561, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static481.anIntArray561, 0);
			local7 = 0;
		}
		while (!this.aClass238_45.method5839()) {
			local19 = (Class2_Sub15) this.aClass238_45.method5832();
			Static481.anIntArray561[local7++] = (int) local19.aLong287;
			this.anInt7372 -= local19.anInt1789;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static481.anIntArray561, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static481.anIntArray561, 0);
			local7 = 0;
		}
		while (!this.aClass238_46.method5839()) {
			local19 = (Class2_Sub15) this.aClass238_46.method5832();
			Static481.anIntArray561[local7++] = local19.anInt1789;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static481.anIntArray561, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static481.anIntArray561, 0);
			local7 = 0;
		}
		while (!this.aClass238_47.method5839()) {
			local19 = (Class2_Sub15) this.aClass238_47.method5832();
			Static481.anIntArray561[local7++] = (int) local19.aLong287;
			this.anInt7373 -= local19.anInt1789;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static481.anIntArray561, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static481.anIntArray561, 0);
		}
		while (!this.bf.method5839()) {
			local19 = (Class2_Sub15) this.bf.method5832();
			OpenGL.glDeleteLists((int) local19.aLong287, local19.anInt1789);
		}
		@Pc(212) Class2 local212;
		while (!this.aClass238_48.method5839()) {
			local212 = this.aClass238_48.method5832();
			OpenGL.glDeleteProgramARB((int) local212.aLong287);
		}
		while (!this.aClass238_49.method5839()) {
			local212 = this.aClass238_49.method5832();
			OpenGL.glDeleteObjectARB(local212.aLong287);
		}
		while (!this.bf.method5839()) {
			local19 = (Class2_Sub15) this.bf.method5832();
			OpenGL.glDeleteLists((int) local19.aLong287, local19.anInt1789);
		}
		this.aClass357_1.method8217();
		if (this.E() > 100663296 && this.aLong208 + 60000L < Static438.method6517()) {
			System.gc();
			this.aLong208 = Static438.method6517();
		}
		this.anInt7366 = local11;
	}

	@OriginalMember(owner = "client!oea", name = "y", descriptor = "(I)V")
	private void method6211() {
		this.aClass88Array1 = new Class88[this.anInt7389];
		this.aClass88_Sub2_2 = new Class88_Sub2(this, 3553, 6408, 1, 1);
		new Class88_Sub2(this, 3553, 6408, 1, 1);
		new Class88_Sub2(this, 3553, 6408, 1, 1);
		this.aClass25_Sub2_2 = new Class25_Sub2(this);
		this.aClass25_Sub2_9 = new Class25_Sub2(this);
		this.aClass25_Sub2_3 = new Class25_Sub2(this);
		this.aClass25_Sub2_5 = new Class25_Sub2(this);
		this.aClass25_Sub2_6 = new Class25_Sub2(this);
		this.aClass25_Sub2_10 = new Class25_Sub2(this);
		this.aClass25_Sub2_7 = new Class25_Sub2(this);
		this.aClass25_Sub2_1 = new Class25_Sub2(this);
		this.aClass25_Sub2_4 = new Class25_Sub2(this);
		this.aClass25_Sub2_8 = new Class25_Sub2(this);
		if (this.aBoolean546) {
			this.aClass161_2 = new Class161(this);
			new Class161(this);
		}
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(IIII)V")
	public void method6212(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "()Z")
	@Override
	public boolean method7904() {
		return true;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!ww;IIII)Lclient!ka;")
	@Override
	public Class25 method7975(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class25_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "()V")
	@Override
	public void method7895() {
		if (this.aBoolean546) {
			if (this.anInterface19_2 != this.aClass161_1) {
				throw new RuntimeException();
			}
			this.aClass161_1.method3958(0);
			this.aClass161_1.method3958(8);
			this.method6184(this.aClass161_1);
		} else if (this.aBoolean547) {
			this.aClass20_Sub3_1.method4597(0, 0, this.anInt7358, this.anInt7352, 0, 0);
			this.anOpenGL2.setSurface(this.aLong207);
		} else {
			throw new RuntimeException("");
		}
		this.aClass20_Sub3_1 = null;
		this.anInt7358 = this.anInt7307;
		this.anInt7352 = this.anInt7346;
		this.method6181();
		this.method6178();
		this.la();
	}

	@OriginalMember(owner = "client!oea", name = "z", descriptor = "(I)V")
	private void method6213() {
		@Pc(21) float local21 = this.aFloat173 * (float) -this.anInt7408 / (float) this.anInt7409;
		@Pc(33) float local33 = this.aFloat173 * (float) -this.anInt7379 / (float) this.anInt7384;
		@Pc(48) float local48 = (float) (this.anInt7358 - this.anInt7408) * this.aFloat173 / (float) this.anInt7409;
		@Pc(63) float local63 = this.aFloat173 * (float) (this.anInt7352 - this.anInt7379) / (float) this.anInt7384;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local21 != local48 && local63 != local33) {
			OpenGL.glOrtho((double) local21, (double) local48, (double) -local63, (double) -local33, (double) this.anInt7397, (double) this.anInt7401);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!oea", name = "l", descriptor = "(B)V")
	private void method6214() {
		if (this.anInt7400 != 2) {
			this.anInt7400 = 2;
			this.method6179();
			this.method6200();
			this.anInt7376 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!oea", name = "o", descriptor = "()V")
	@Override
	public void method7937() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!oea", name = "m", descriptor = "(B)V")
	private void method6215() {
		if (this.anInt7400 != 3) {
			this.anInt7400 = 3;
			this.method6213();
			this.method6200();
			this.anInt7376 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!uaa;)V")
	@Override
	public void method7949(@OriginalArg(0) Interface24 arg0) {
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7974(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!oea", name = "A", descriptor = "(I)V")
	private void method6216() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL2.a()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static57.method1062(1000L);
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZZ)V")
	public void method6217(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean533 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean533 = arg0;
		this.anInt7376 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!oea", name = "B", descriptor = "(I)V")
	private void method6218() {
		this.aFloatArray65[14] = this.aFloat183;
		this.aFloatArray65[10] = this.aFloat184;
		this.aFloat172 = this.anInt7401;
		this.aFloat169 = (this.aFloatArray65[14] - (float) this.anInt7401) / this.aFloatArray65[10];
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(Z)V")
	@Override
	public void method7916(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oea", name = "s", descriptor = "()Z")
	@Override
	public boolean method7944() {
		return true;
	}

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "(Z)V")
	public void method6219() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray62, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)Lclient!vi;")
	@Override
	public Interface25 method7905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "(IIIIII)Lclient!sfa;")
	@Override
	public Class22 method7948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean542 ? new Class22_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!oea", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean556 = false;
	}

	@OriginalMember(owner = "client!oea", name = "C", descriptor = "(I)V")
	private void method6220() {
		if (this.anInt7376 == 1) {
			return;
		}
		this.method6175();
		this.method6156(false);
		this.method6205(false);
		this.method6217(false);
		this.method6225(false);
		this.method6167(null);
		this.method6228(-2);
		this.method6159(1);
		this.anInt7376 = 1;
	}

	@OriginalMember(owner = "client!oea", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = 0;
		@Pc(30) float local30 = this.aClass6_Sub1_3.aFloat2 * (float) arg2 + this.aClass6_Sub1_3.aFloat3 * (float) arg0 + this.aClass6_Sub1_3.aFloat6 * (float) arg1 + this.aClass6_Sub1_3.aFloat12;
		if (local30 < 1.0F) {
			local30 = 1.0F;
		}
		@Pc(61) float local61 = this.aClass6_Sub1_3.aFloat12 + (float) arg5 * this.aClass6_Sub1_3.aFloat2 + this.aClass6_Sub1_3.aFloat3 * (float) arg3 + this.aClass6_Sub1_3.aFloat6 * (float) arg4;
		if (local61 < 1.0F) {
			local61 = 1.0F;
		}
		if (local30 < (float) this.anInt7397 && (float) this.anInt7397 > local61) {
			local5 |= 0x10;
		} else if ((float) this.anInt7401 < local30 && (float) this.anInt7401 < local61) {
			local5 |= 0x20;
		}
		@Pc(132) int local132 = (int) ((this.aClass6_Sub1_3.aFloat11 + (float) arg1 * this.aClass6_Sub1_3.aFloat7 + this.aClass6_Sub1_3.aFloat4 * (float) arg0 + (float) arg2 * this.aClass6_Sub1_3.aFloat8) * (float) this.anInt7409 / local30);
		@Pc(164) int local164 = (int) ((this.aClass6_Sub1_3.aFloat11 + (float) arg3 * this.aClass6_Sub1_3.aFloat4 + this.aClass6_Sub1_3.aFloat7 * (float) arg4 + this.aClass6_Sub1_3.aFloat8 * (float) arg5) * (float) this.anInt7409 / local61);
		if ((float) local132 < this.aFloat181 && (float) local164 < this.aFloat181) {
			local5 |= 0x1;
		} else if (this.aFloat171 < (float) local132 && this.aFloat171 < (float) local164) {
			local5 |= 0x2;
		}
		@Pc(229) int local229 = (int) ((this.aClass6_Sub1_3.aFloat9 + this.aClass6_Sub1_3.aFloat5 * (float) arg1 + (float) arg0 * this.aClass6_Sub1_3.aFloat10 + this.aClass6_Sub1_3.aFloat13 * (float) arg2) * (float) this.anInt7384 / local30);
		@Pc(261) int local261 = (int) (((float) arg5 * this.aClass6_Sub1_3.aFloat13 + (float) arg4 * this.aClass6_Sub1_3.aFloat5 + this.aClass6_Sub1_3.aFloat10 * (float) arg3 + this.aClass6_Sub1_3.aFloat9) * (float) this.anInt7384 / local61);
		if ((float) local229 < this.aFloat167 && this.aFloat167 > (float) local261) {
			local5 |= 0x4;
		} else if ((float) local229 > this.aFloat170 && this.aFloat170 < (float) local261) {
			local5 |= 0x8;
		}
		return local5;
	}

	@OriginalMember(owner = "client!oea", name = "n", descriptor = "(B)V")
	private void method6221() {
		OpenGL.glDepthMask(this.aBoolean534 && this.aBoolean554);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!kd;)V")
	@Override
	public void method7896(@OriginalArg(0) Class6 arg0) {
		this.aClass6_Sub1_3.method6695(arg0);
		this.aClass6_Sub1_4.method6695(this.aClass6_Sub1_3);
		this.aClass6_Sub1_4.method109();
		this.aClass6_Sub1_5.method105(this.aClass6_Sub1_4);
		if (this.anInt7400 != 1) {
			this.method6200();
		}
	}

	@OriginalMember(owner = "client!oea", name = "D", descriptor = "(I)V")
	private void method6222() {
		this.aFloat168 = (float) (this.anInt7401 - this.anInt7388) - this.aFloat164;
		this.aFloat166 = this.aFloat168 - this.aFloat175 * (float) this.anInt7405;
		if (this.aFloat166 < (float) this.anInt7397) {
			this.aFloat166 = this.anInt7397;
		}
		OpenGL.glFogf(2915, this.aFloat166);
		OpenGL.glFogf(2916, this.aFloat168);
		Static399.aFloatArray60[2] = (float) (this.anInt7378 & 0xFF) / 255.0F;
		Static399.aFloatArray60[1] = (float) (this.anInt7378 & 0xFF00) / 65280.0F;
		Static399.aFloatArray60[0] = (float) (this.anInt7378 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static399.aFloatArray60, 0);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class112 method7957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class112_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!fp;[Lclient!fw;Z)Lclient!da;")
	@Override
	public Class64 method7965(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class120[] arg1) {
		return new Class64_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(Lclient!pw;I)V")
	public void method6223(@OriginalArg(0) Interface19 arg0) {
		if (this.anInt7371 < 0 || arg0 != this.anInterface19Array2[this.anInt7371]) {
			throw new RuntimeException();
		}
		this.anInterface19Array2[this.anInt7371--] = null;
		arg0.method3949();
		if (this.anInt7371 >= 0) {
			this.anInterface19_2 = this.anInterface19Array2[this.anInt7371];
			this.anInterface19_2.method3948();
		} else {
			this.anInterface19_2 = null;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == arg2 && arg3 == arg1) {
			return;
		}
		this.method6220();
		this.method6196(1);
		@Pc(34) float local34 = (float) -arg0 + (float) arg2;
		@Pc(40) float local40 = (float) arg3 - (float) arg1;
		@Pc(53) float local53 = (float) (1.0D / Math.sqrt((double) (local34 * local34 + local40 * local40)));
		@Pc(57) float local57 = local40 * local53;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(76) float local76 = local34 * local53;
		@Pc(82) int local82 = arg7 % (arg6 + arg5);
		@Pc(87) float local87 = (float) arg5 * local76;
		@Pc(92) float local92 = (float) arg5 * local57;
		@Pc(94) float local94 = 0.0F;
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = local87;
		@Pc(100) float local100 = local92;
		if (local82 <= arg5) {
			local98 = (float) (arg5 - local82) * local76;
			local100 = (float) (arg5 - local82) * local57;
		} else {
			local94 = local76 * (float) (arg5 + arg6 - local82);
			local96 = (float) (arg6 + arg5 - local82) * local57;
		}
		@Pc(153) float local153 = local94 + (float) arg0 + 0.35F;
		@Pc(160) float local160 = local96 + (float) arg1 + 0.35F;
		@Pc(165) float local165 = (float) arg6 * local76;
		@Pc(170) float local170 = local57 * (float) arg6;
		while (true) {
			if (arg0 >= arg2) {
				if (local153 < (float) arg2 + 0.35F) {
					break;
				}
				if (local98 + local153 < (float) arg2) {
					local98 = (float) arg2 - local153;
				}
			} else {
				if (local153 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local153 + local98) {
					local98 = (float) arg2 - local153;
				}
			}
			if (arg1 < arg3) {
				if (local160 > (float) arg3 + 0.35F) {
					break;
				}
				if (local100 + local160 > (float) arg3) {
					local100 = (float) arg3 - local160;
				}
			} else {
				if (local160 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local100 + local160) {
					local100 = (float) arg3 - local160;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local153, local160);
			OpenGL.glVertex2f(local98 + local153, local160 + local100);
			local153 += local98 + local165;
			local160 += local100 + local170;
			OpenGL.glEnd();
			local100 = local92;
			local98 = local87;
		}
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(I)V")
	@Override
	public void method7911(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt7359 = arg0;
		this.aClass357_1.method8216();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;ZIIB)Lclient!tda;")
	public Interface23 method6224(@OriginalArg(0) Buffer arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return (Interface23) (this.aBoolean536 ? new Class3_Sub2(this, arg2, arg0, arg1, false) : new Class232_Sub1(this, arg2, arg0));
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IZ)V")
	public void method6225(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean534) {
			this.aBoolean534 = arg0;
			this.method6221();
			this.anInt7376 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!oea", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt7367 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt7367++;
		}
		this.anInt7368 = 0x1 << this.anInt7367;
	}

	@OriginalMember(owner = "client!oea", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method6220();
		this.method6196(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean552) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean552) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "()Z")
	@Override
	public boolean method7912() {
		return true;
	}

	@OriginalMember(owner = "client!oea", name = "o", descriptor = "(B)V")
	private void method6226() {
		if (this.aCanvas10 == null) {
			this.anInt7307 = this.anInt7346 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas10.getSize();
			this.anInt7346 = local10.height;
			this.anInt7307 = local10.width;
		}
		if (this.anInterface19_2 == null) {
			this.anInt7352 = this.anInt7346;
			this.anInt7358 = this.anInt7307;
			this.method6178();
		}
		this.method6181();
		this.la();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IBI)V")
	public void method6227(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7399 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (arg0 != this.anInt7391) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt7391 = arg0;
			local17 = true;
		}
		if (arg1 != this.anInt7386) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt7386 = arg1;
			local17 = true;
		}
		if (local17) {
			this.anInt7376 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!oea", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt7413;
		this.anInt7413 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
	@Override
	public void method7890(@OriginalArg(0) int arg0) {
		this.method6216();
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(BI)V")
	public void method6228(@OriginalArg(1) int arg0) {
		this.method6193(arg0, true);
	}

	@OriginalMember(owner = "client!oea", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt7401;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(ZZ)V")
	public void method6229(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean553) {
			this.aBoolean553 = arg0;
			this.method6199();
		}
	}

	@OriginalMember(owner = "client!oea", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7352 < arg3) {
			arg3 = this.anInt7352;
		}
		if (this.anInt7358 < arg2) {
			arg2 = this.anInt7358;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt7385 = arg0;
		this.anInt7394 = arg1;
		this.anInt7387 = arg2;
		this.anInt7410 = arg3;
		OpenGL.glEnable(3089);
		this.method6176();
		this.method6180();
	}

	@OriginalMember(owner = "client!oea", name = "i", descriptor = "(I)V")
	@Override
	public void method7938(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oea", name = "m", descriptor = "()Z")
	@Override
	public boolean method7930() {
		return false;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7963(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7907(arg2, arg3);
	}
}
