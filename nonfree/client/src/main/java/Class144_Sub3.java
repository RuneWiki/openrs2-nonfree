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

@OriginalClass("client!pi")
public final class Class144_Sub3 extends Class144 {

	@OriginalMember(owner = "client!pi", name = "Td", descriptor = "I")
	public int anInt7855;

	@OriginalMember(owner = "client!pi", name = "vh", descriptor = "I")
	private int anInt7863;

	@OriginalMember(owner = "client!pi", name = "Ud", descriptor = "I")
	public int anInt7942;

	@OriginalMember(owner = "client!pi", name = "ig", descriptor = "I")
	private int anInt8028;

	@OriginalMember(owner = "client!pi", name = "Se", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!pi", name = "wh", descriptor = "I")
	public int anInt8054;

	@OriginalMember(owner = "client!pi", name = "vd", descriptor = "Lclient!ar;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!pi", name = "Lb", descriptor = "Lclient!mt;")
	private Class45_Sub3 aClass45_Sub3_1;

	@OriginalMember(owner = "client!pi", name = "qh", descriptor = "Lclient!ar;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!pi", name = "Fb", descriptor = "Lclient!lda;")
	private Class217 aClass217_6;

	@OriginalMember(owner = "client!pi", name = "mf", descriptor = "I")
	private int anInt8058;

	@OriginalMember(owner = "client!pi", name = "Ce", descriptor = "I")
	public int anInt8059;

	@OriginalMember(owner = "client!pi", name = "ng", descriptor = "I")
	public int anInt8060;

	@OriginalMember(owner = "client!pi", name = "Qc", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "client!pi", name = "fd", descriptor = "Z")
	private boolean aBoolean550;

	@OriginalMember(owner = "client!pi", name = "eb", descriptor = "I")
	private int anInt8061;

	@OriginalMember(owner = "client!pi", name = "Pb", descriptor = "I")
	private int anInt8062;

	@OriginalMember(owner = "client!pi", name = "bb", descriptor = "Z")
	private boolean aBoolean551;

	@OriginalMember(owner = "client!pi", name = "Yg", descriptor = "Z")
	private boolean aBoolean552;

	@OriginalMember(owner = "client!pi", name = "Pg", descriptor = "Z")
	private boolean aBoolean553;

	@OriginalMember(owner = "client!pi", name = "sb", descriptor = "I")
	private int anInt8063;

	@OriginalMember(owner = "client!pi", name = "Pc", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!pi", name = "ad", descriptor = "Lclient!vm;")
	public Class380 aClass380_11;

	@OriginalMember(owner = "client!pi", name = "lg", descriptor = "Lclient!cu;")
	private Class47_Sub2 aClass47_Sub2_1;

	@OriginalMember(owner = "client!pi", name = "Db", descriptor = "I")
	public int anInt8067;

	@OriginalMember(owner = "client!pi", name = "wc", descriptor = "Lclient!gea;")
	public Class129_Sub1 aClass129_Sub1_1;

	@OriginalMember(owner = "client!pi", name = "ag", descriptor = "Z")
	public boolean aBoolean555;

	@OriginalMember(owner = "client!pi", name = "Vd", descriptor = "Lclient!lda;")
	public Class217 aClass217_7;

	@OriginalMember(owner = "client!pi", name = "eg", descriptor = "F")
	public float aFloat146;

	@OriginalMember(owner = "client!pi", name = "jc", descriptor = "I")
	private int anInt8069;

	@OriginalMember(owner = "client!pi", name = "be", descriptor = "Lclient!gea;")
	public Class129_Sub1 aClass129_Sub1_2;

	@OriginalMember(owner = "client!pi", name = "Q", descriptor = "Lclient!sb;")
	public Class161_Sub1 aClass161_Sub1_5;

	@OriginalMember(owner = "client!pi", name = "ib", descriptor = "F")
	private float aFloat147;

	@OriginalMember(owner = "client!pi", name = "jd", descriptor = "Lclient!gea;")
	public Class129_Sub1 aClass129_Sub1_3;

	@OriginalMember(owner = "client!pi", name = "Je", descriptor = "Z")
	public boolean aBoolean556;

	@OriginalMember(owner = "client!pi", name = "uh", descriptor = "Z")
	public boolean aBoolean557;

	@OriginalMember(owner = "client!pi", name = "kb", descriptor = "Lclient!gea;")
	public Class129_Sub1 aClass129_Sub1_4;

	@OriginalMember(owner = "client!pi", name = "Hf", descriptor = "I")
	private int anInt8070;

	@OriginalMember(owner = "client!pi", name = "Bb", descriptor = "Ljava/lang/String;")
	private String aString90;

	@OriginalMember(owner = "client!pi", name = "Qe", descriptor = "Z")
	public boolean aBoolean558;

	@OriginalMember(owner = "client!pi", name = "ke", descriptor = "Lclient!ku;")
	private Interface12 anInterface12_4;

	@OriginalMember(owner = "client!pi", name = "se", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!pi", name = "Cf", descriptor = "Z")
	public boolean aBoolean559;

	@OriginalMember(owner = "client!pi", name = "Vb", descriptor = "Ljava/lang/String;")
	private String aString91;

	@OriginalMember(owner = "client!pi", name = "Lg", descriptor = "I")
	private int anInt8074;

	@OriginalMember(owner = "client!pi", name = "hd", descriptor = "I")
	private int anInt8075;

	@OriginalMember(owner = "client!pi", name = "Hg", descriptor = "Lclient!gea;")
	public Class129_Sub1 aClass129_Sub1_5;

	@OriginalMember(owner = "client!pi", name = "lb", descriptor = "F")
	public float lb;

	@OriginalMember(owner = "client!pi", name = "jg", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
	public int anInt8080;

	@OriginalMember(owner = "client!pi", name = "Ve", descriptor = "Lclient!gea;")
	public Class129_Sub1 aClass129_Sub1_6;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "Z")
	public boolean aBoolean561;

	@OriginalMember(owner = "client!pi", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!pi", name = "Ug", descriptor = "Lclient!gea;")
	public Class129_Sub1 aClass129_Sub1_7;

	@OriginalMember(owner = "client!pi", name = "wb", descriptor = "Z")
	private boolean aBoolean562;

	@OriginalMember(owner = "client!pi", name = "df", descriptor = "I")
	public int anInt8086;

	@OriginalMember(owner = "client!pi", name = "Dd", descriptor = "Lclient!gea;")
	public Class129_Sub1 aClass129_Sub1_8;

	@OriginalMember(owner = "client!pi", name = "ld", descriptor = "Z")
	public boolean aBoolean565;

	@OriginalMember(owner = "client!pi", name = "Mf", descriptor = "I")
	private int anInt8087;

	@OriginalMember(owner = "client!pi", name = "Tf", descriptor = "Z")
	private boolean aBoolean568;

	@OriginalMember(owner = "client!pi", name = "Jc", descriptor = "F")
	private float aFloat157;

	@OriginalMember(owner = "client!pi", name = "pg", descriptor = "F")
	private float aFloat158;

	@OriginalMember(owner = "client!pi", name = "ge", descriptor = "Z")
	private boolean aBoolean569;

	@OriginalMember(owner = "client!pi", name = "Pe", descriptor = "Z")
	public boolean aBoolean570;

	@OriginalMember(owner = "client!pi", name = "U", descriptor = "Z")
	private boolean aBoolean571;

	@OriginalMember(owner = "client!pi", name = "ec", descriptor = "I")
	public int anInt8090;

	@OriginalMember(owner = "client!pi", name = "Ab", descriptor = "I")
	private int anInt8091;

	@OriginalMember(owner = "client!pi", name = "J", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!pi", name = "uf", descriptor = "Z")
	private boolean aBoolean572;

	@OriginalMember(owner = "client!pi", name = "Zc", descriptor = "Z")
	private boolean aBoolean573;

	@OriginalMember(owner = "client!pi", name = "jb", descriptor = "Lclient!fb;")
	private Interface6 anInterface6_4;

	@OriginalMember(owner = "client!pi", name = "lc", descriptor = "Z")
	public boolean aBoolean574;

	@OriginalMember(owner = "client!pi", name = "Jf", descriptor = "Lclient!vm;")
	public Class380 aClass380_12;

	@OriginalMember(owner = "client!pi", name = "vb", descriptor = "Lclient!gea;")
	public Class129_Sub1 aClass129_Sub1_9;

	@OriginalMember(owner = "client!pi", name = "ye", descriptor = "Lclient!hr;")
	private Class161_Sub1_Sub1 aClass161_Sub1_Sub1_4;

	@OriginalMember(owner = "client!pi", name = "rh", descriptor = "Z")
	public boolean aBoolean578;

	@OriginalMember(owner = "client!pi", name = "te", descriptor = "Lclient!ku;")
	private Interface12 anInterface12_5;

	@OriginalMember(owner = "client!pi", name = "Hd", descriptor = "I")
	private int anInt8094;

	@OriginalMember(owner = "client!pi", name = "fc", descriptor = "[Lclient!pu;")
	private Class161[] aClass161Array1;

	@OriginalMember(owner = "client!pi", name = "Wb", descriptor = "Lclient!gea;")
	public Class129_Sub1 aClass129_Sub1_10;

	@OriginalMember(owner = "client!pi", name = "vg", descriptor = "Z")
	private boolean aBoolean580;

	@OriginalMember(owner = "client!pi", name = "cd", descriptor = "I")
	private int anInt8097;

	@OriginalMember(owner = "client!pi", name = "oc", descriptor = "I")
	private int anInt8098;

	@OriginalMember(owner = "client!pi", name = "th", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!pi", name = "nh", descriptor = "I")
	public int anInt8050 = 128;

	@OriginalMember(owner = "client!pi", name = "Ng", descriptor = "Lclient!rga;")
	private final Class311 aClass311_1 = new Class311();

	@OriginalMember(owner = "client!pi", name = "Hc", descriptor = "Lclient!oba;")
	private final Class263_Sub1 aClass263_Sub1_1 = new Class263_Sub1();

	@OriginalMember(owner = "client!pi", name = "Dg", descriptor = "Lclient!oba;")
	public final Class263_Sub1 aClass263_Sub1_2 = new Class263_Sub1();

	@OriginalMember(owner = "client!pi", name = "Pd", descriptor = "I")
	public int anInt8052 = 8;

	@OriginalMember(owner = "client!pi", name = "Yf", descriptor = "I")
	public int anInt8053 = 3;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "Z")
	private boolean aBoolean549 = false;

	@OriginalMember(owner = "client!pi", name = "td", descriptor = "Lclient!bd;")
	private final Class32 aClass32_46 = new Class32();

	@OriginalMember(owner = "client!pi", name = "zh", descriptor = "I")
	private int anInt8055 = -1;

	@OriginalMember(owner = "client!pi", name = "fb", descriptor = "[Lclient!ar;")
	private final Interface1[] anInterface1Array1 = new Interface1[4];

	@OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
	private int anInt8056 = -1;

	@OriginalMember(owner = "client!pi", name = "qd", descriptor = "[Lclient!ar;")
	private final Interface1[] anInterface1Array3 = new Interface1[4];

	@OriginalMember(owner = "client!pi", name = "qf", descriptor = "I")
	private int anInt8057 = -1;

	@OriginalMember(owner = "client!pi", name = "Wf", descriptor = "[Lclient!ar;")
	private final Interface1[] anInterface1Array2 = new Interface1[4];

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "Lclient!bd;")
	private final Class32 aClass32_47;

	@OriginalMember(owner = "client!pi", name = "Xe", descriptor = "Lclient!bd;")
	private final Class32 aClass32_48;

	@OriginalMember(owner = "client!pi", name = "sc", descriptor = "Lclient!bd;")
	private final Class32 aClass32_49;

	@OriginalMember(owner = "client!pi", name = "re", descriptor = "Lclient!bd;")
	private final Class32 aClass32_50;

	@OriginalMember(owner = "client!pi", name = "xe", descriptor = "Lclient!bd;")
	private final Class32 aClass32_51;

	@OriginalMember(owner = "client!pi", name = "xf", descriptor = "Lclient!bd;")
	private final Class32 aClass32_52;

	@OriginalMember(owner = "client!pi", name = "Rg", descriptor = "Lclient!bd;")
	private final Class32 aClass32_53;

	@OriginalMember(owner = "client!pi", name = "S", descriptor = "Lclient!oba;")
	public final Class263_Sub1 aClass263_Sub1_3;

	@OriginalMember(owner = "client!pi", name = "Od", descriptor = "Lclient!oba;")
	public final Class263_Sub1 aClass263_Sub1_4;

	@OriginalMember(owner = "client!pi", name = "bc", descriptor = "Lclient!oba;")
	public final Class263_Sub1 aClass263_Sub1_5;

	@OriginalMember(owner = "client!pi", name = "qe", descriptor = "I")
	private int anInt8065;

	@OriginalMember(owner = "client!pi", name = "Vg", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!pi", name = "sg", descriptor = "F")
	private float aFloat150;

	@OriginalMember(owner = "client!pi", name = "lh", descriptor = "I")
	public int anInt8076;

	@OriginalMember(owner = "client!pi", name = "Vf", descriptor = "F")
	private float aFloat148;

	@OriginalMember(owner = "client!pi", name = "Rb", descriptor = "I")
	public int anInt8073;

	@OriginalMember(owner = "client!pi", name = "ff", descriptor = "[F")
	private final float[] aFloatArray61;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
	public int anInt8068;

	@OriginalMember(owner = "client!pi", name = "V", descriptor = "F")
	private float aFloat153;

	@OriginalMember(owner = "client!pi", name = "Nb", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!pi", name = "he", descriptor = "I")
	private int anInt8064;

	@OriginalMember(owner = "client!pi", name = "Zd", descriptor = "I")
	public int anInt8071;

	@OriginalMember(owner = "client!pi", name = "ie", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!pi", name = "ph", descriptor = "I")
	private int anInt8083;

	@OriginalMember(owner = "client!pi", name = "W", descriptor = "I")
	private int anInt8077;

	@OriginalMember(owner = "client!pi", name = "tb", descriptor = "I")
	private int anInt8072;

	@OriginalMember(owner = "client!pi", name = "vf", descriptor = "I")
	private int anInt8084;

	@OriginalMember(owner = "client!pi", name = "Zf", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!pi", name = "Gf", descriptor = "F")
	public float aFloat152;

	@OriginalMember(owner = "client!pi", name = "Mb", descriptor = "Z")
	private boolean aBoolean554;

	@OriginalMember(owner = "client!pi", name = "Be", descriptor = "I")
	public int anInt8081;

	@OriginalMember(owner = "client!pi", name = "Te", descriptor = "[F")
	private final float[] aFloatArray62;

	@OriginalMember(owner = "client!pi", name = "Ob", descriptor = "[Lclient!rfa;")
	private final Class14_Sub18[] aClass14_Sub18Array6;

	@OriginalMember(owner = "client!pi", name = "Qb", descriptor = "I")
	private int anInt8088;

	@OriginalMember(owner = "client!pi", name = "hc", descriptor = "I")
	public int anInt8085;

	@OriginalMember(owner = "client!pi", name = "eh", descriptor = "F")
	private float aFloat156;

	@OriginalMember(owner = "client!pi", name = "Oc", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!pi", name = "ue", descriptor = "I")
	public int anInt8078;

	@OriginalMember(owner = "client!pi", name = "Hb", descriptor = "I")
	private int anInt8093;

	@OriginalMember(owner = "client!pi", name = "Kf", descriptor = "I")
	private int anInt8079;

	@OriginalMember(owner = "client!pi", name = "Xd", descriptor = "I")
	public int anInt8095;

	@OriginalMember(owner = "client!pi", name = "K", descriptor = "[F")
	private final float[] aFloatArray63;

	@OriginalMember(owner = "client!pi", name = "fe", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!pi", name = "Cb", descriptor = "[F")
	private final float[] aFloatArray64;

	@OriginalMember(owner = "client!pi", name = "Xc", descriptor = "I")
	public int anInt8066;

	@OriginalMember(owner = "client!pi", name = "yf", descriptor = "[F")
	public final float[] aFloatArray65;

	@OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
	public int anInt8092;

	@OriginalMember(owner = "client!pi", name = "hh", descriptor = "F")
	private float aFloat159;

	@OriginalMember(owner = "client!pi", name = "we", descriptor = "I")
	public int anInt8082;

	@OriginalMember(owner = "client!pi", name = "Jd", descriptor = "Z")
	private boolean aBoolean577;

	@OriginalMember(owner = "client!pi", name = "He", descriptor = "I")
	private int anInt8096;

	@OriginalMember(owner = "client!pi", name = "zg", descriptor = "Lclient!pr;")
	public Class14_Sub21_Sub1 aClass14_Sub21_Sub1_2;

	@OriginalMember(owner = "client!pi", name = "zc", descriptor = "[I")
	public int[] anIntArray418;

	@OriginalMember(owner = "client!pi", name = "tc", descriptor = "[B")
	public final byte[] aByteArray85;

	@OriginalMember(owner = "client!pi", name = "Sg", descriptor = "[I")
	public int[] anIntArray419;

	@OriginalMember(owner = "client!pi", name = "dg", descriptor = "[I")
	public int[] anIntArray417;

	@OriginalMember(owner = "client!pi", name = "If", descriptor = "I")
	public final int anInt8051;

	@OriginalMember(owner = "client!pi", name = "Zg", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas10;

	@OriginalMember(owner = "client!pi", name = "rb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!pi", name = "Sc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!pi", name = "Ze", descriptor = "J")
	private final long aLong213;

	@OriginalMember(owner = "client!pi", name = "nb", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!pi", name = "sd", descriptor = "I")
	public final int anInt8089;

	@OriginalMember(owner = "client!pi", name = "pd", descriptor = "Z")
	private boolean aBoolean560;

	@OriginalMember(owner = "client!pi", name = "Gc", descriptor = "Z")
	public boolean aBoolean566;

	@OriginalMember(owner = "client!pi", name = "cc", descriptor = "Z")
	public boolean aBoolean563;

	@OriginalMember(owner = "client!pi", name = "Gb", descriptor = "Z")
	public boolean aBoolean575;

	@OriginalMember(owner = "client!pi", name = "kh", descriptor = "Z")
	private boolean aBoolean579;

	@OriginalMember(owner = "client!pi", name = "Wd", descriptor = "Z")
	public boolean aBoolean567;

	@OriginalMember(owner = "client!pi", name = "Md", descriptor = "Z")
	public boolean aBoolean576;

	@OriginalMember(owner = "client!pi", name = "Ef", descriptor = "Z")
	private final boolean aBoolean564;

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "Lclient!fca;")
	private final Class111 aClass111_1;

	@OriginalMember(owner = "client!pi", name = "fg", descriptor = "Lclient!rp;")
	public final Class320 aClass320_1;

	@OriginalMember(owner = "client!pi", name = "wd", descriptor = "Lclient!hl;")
	private final Class157 aClass157_1;

	@OriginalMember(owner = "client!pi", name = "gd", descriptor = "Lclient!m;")
	private Class14_Sub5_Sub1 aClass14_Sub5_Sub1_1;

	@OriginalMember(owner = "client!pi", name = "Fd", descriptor = "Lclient!ri;")
	private final Class313 aClass313_1;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class144_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class269();
		new Class125(16);
		this.aClass32_47 = new Class32();
		this.aClass32_48 = new Class32();
		this.aClass32_49 = new Class32();
		this.aClass32_50 = new Class32();
		this.aClass32_51 = new Class32();
		this.aClass32_52 = new Class32();
		this.aClass32_53 = new Class32();
		this.aClass263_Sub1_3 = new Class263_Sub1();
		this.aClass263_Sub1_4 = new Class263_Sub1();
		this.aClass263_Sub1_5 = new Class263_Sub1();
		this.anInt8065 = 8448;
		this.aFloat145 = 1.0F;
		this.aFloat150 = 1.0F;
		this.anInt8076 = -1;
		this.aFloat148 = -1.0F;
		this.anInt8073 = 512;
		this.aFloatArray61 = new float[4];
		this.anInt8068 = 50;
		this.aFloat153 = 0.0F;
		this.aFloat144 = 1.0F;
		this.anInt8064 = -1;
		this.anInt8071 = 0;
		this.aFloat149 = -1.0F;
		this.anInt8083 = 0;
		this.anInt8077 = 3584;
		this.anInt8072 = 0;
		this.anInt8084 = 0;
		this.aFloat154 = -1.0F;
		this.aFloat152 = 3584.0F;
		this.aBoolean554 = true;
		this.anInt8081 = -1;
		this.aFloatArray62 = new float[16];
		this.aClass14_Sub18Array6 = new Class14_Sub18[Static592.anInt9787];
		this.anInt8088 = 0;
		this.anInt8085 = -1;
		this.aFloat156 = 1.0F;
		this.aFloat161 = 1.0F;
		this.anInt8078 = 0;
		this.anInt8093 = 0;
		this.anInt8079 = 0;
		this.anInt8095 = -1;
		this.aFloatArray63 = new float[4];
		this.aFloat162 = 3584.0F;
		this.aFloatArray64 = new float[4];
		this.anInt8066 = 0;
		this.aFloatArray65 = new float[4];
		this.anInt8092 = 512;
		this.aFloat159 = -1.0F;
		this.anInt8082 = 0;
		this.aBoolean577 = false;
		this.anInt8096 = 8448;
		this.aClass14_Sub21_Sub1_2 = new Class14_Sub21_Sub1(8192);
		this.anIntArray418 = new int[1];
		this.aByteArray85 = new byte[16384];
		this.anIntArray419 = new int[1];
		this.anIntArray417 = new int[1];
		this.anInt8051 = arg2;
		this.aCanvas11 = this.aCanvas10 = arg0;
		if (!Static425.method6393("jaclib")) {
			throw new RuntimeException("");
		} else if (Static425.method6393("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong214 = this.aLong213 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt8051);
				if (this.aLong213 == 0L) {
					throw new RuntimeException("");
				}
				this.method7002();
				@Pc(339) int local339 = this.method7007();
				if (local339 != 0) {
					throw new RuntimeException("");
				}
				this.anInt8089 = this.aBoolean557 ? 33639 : 5121;
				if (this.aString90.indexOf("radeon") != -1) {
					@Pc(369) int local369 = 0;
					@Pc(371) boolean local371 = false;
					@Pc(373) boolean local373 = false;
					@Pc(382) String[] local382 = Static407.method2868(this.aString90.replace('/', ' '), ' ');
					for (@Pc(384) int local384 = 0; local384 < local382.length; local384++) {
						@Pc(389) String local389 = local382[local384];
						try {
							if (local389.length() > 0) {
								if (local389.charAt(0) == 'x' && local389.length() >= 3 && Static334.method5155(local389.substring(1, 3))) {
									local389 = local389.substring(1);
									local373 = true;
								}
								if (local389.equals("hd")) {
									local371 = true;
								} else {
									if (local389.startsWith("hd")) {
										local371 = true;
										local389 = local389.substring(2);
									}
									if (local389.length() >= 4 && Static334.method5155(local389.substring(0, 4))) {
										local369 = Static297.method4858(local389.substring(0, 4), -60);
										break;
									}
								}
							}
						} catch (@Pc(470) Exception local470) {
						}
					}
					if (!local373 && !local371) {
						if (local369 >= 7000 && local369 <= 7999) {
							this.aBoolean560 = false;
						}
						if (local369 >= 7000 && local369 <= 9250) {
							this.aBoolean566 = false;
						}
					}
					if (!local371 || local369 < 4000) {
						this.aBoolean563 = false;
					}
					this.aBoolean575 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean579 = this.aBoolean560;
					this.aBoolean567 = true;
				}
				if (this.aString91.indexOf("intel") != -1) {
					this.aBoolean576 = false;
				}
				this.aBoolean564 = !this.aString91.equals("s3 graphics");
				if (this.aBoolean560) {
					try {
						@Pc(582) int[] local582 = new int[1];
						OpenGL.glGenBuffersARB(1, local582, 0);
					} catch (@Pc(588) Throwable local588) {
						throw new RuntimeException("");
					}
				}
				Static302.method4913(true, false);
				this.aBoolean549 = true;
				this.aClass111_1 = new Class111(this, super.anInterface4_12);
				this.method7011();
				this.aClass320_1 = new Class320(this);
				this.aClass157_1 = new Class157(this);
				if (this.aClass157_1.method3849()) {
					this.aClass14_Sub5_Sub1_1 = new Class14_Sub5_Sub1(this);
					if (!this.aClass14_Sub5_Sub1_1.method5499()) {
						this.aClass14_Sub5_Sub1_1.method5491();
						this.aClass14_Sub5_Sub1_1 = null;
					}
				}
				this.aClass313_1 = new Class313(this);
				this.method6987();
				this.method6975();
				this.method6889();
			} catch (@Pc(666) Throwable local666) {
				local666.printStackTrace();
				this.method6905();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "()Z")
	@Override
	public boolean method6904() {
		return this.aClass14_Sub5_Sub1_1 != null && (this.anInt8051 <= 1 || this.aBoolean569);
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(IIII)V")
	public void method6974(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!pi", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method7054(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "(I)V")
	private void method6975() {
		if (this.aCanvas11 == null) {
			this.anInt8028 = this.anInt7863 = 0;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas11.getSize();
			this.anInt8028 = local18.width;
			this.anInt7863 = local18.height;
		}
		if (this.anInterface1_1 == null) {
			this.anInt7855 = this.anInt8028;
			this.anInt7942 = this.anInt7863;
			this.method7038();
		}
		this.method7020();
		this.la();
	}

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "(I)V")
	public void method6976() {
		if (this.anInt8063 == 8) {
			return;
		}
		this.method7045();
		this.method6977(true);
		this.method7050(true);
		this.method7040(true);
		this.method7054(1);
		this.anInt8063 = 8;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "()V")
	@Override
	protected void method6905() {
		for (@Pc(8) Class14 local8 = this.aClass32_46.method584(); local8 != null; local8 = this.aClass32_46.method577()) {
			((Class14_Sub16_Sub1) local8).method2008();
		}
		if (this.aClass157_1 != null) {
			this.aClass157_1.method3845();
		}
		if (this.anOpenGL2 != null) {
			this.method7017();
			@Pc(41) Enumeration local41 = this.aHashtable6.keys();
			while (local41.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local41.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable6.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean549) {
			Static545.method5452(-116, false, true);
			this.aBoolean549 = false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZZ)V")
	public void method6977(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean571 != arg0) {
			this.aBoolean571 = arg0;
			this.method7035();
			this.anInt8063 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6945(@OriginalArg(0) Class14_Sub16 arg0) {
		this.aNativeHeap6 = ((Class14_Sub16_Sub1) arg0).aNativeHeap1;
		if (this.anInterface12_4 != null) {
			return;
		}
		@Pc(16) Class14_Sub21_Sub1 local16 = new Class14_Sub21_Sub1(80);
		if (this.aBoolean557) {
			local16.method7246(-1.0F);
			local16.method7246(-1.0F);
			local16.method7246(0.0F);
			local16.method7246(0.0F);
			local16.method7246(1.0F);
			local16.method7246(1.0F);
			local16.method7246(-1.0F);
			local16.method7246(0.0F);
			local16.method7246(1.0F);
			local16.method7246(1.0F);
			local16.method7246(1.0F);
			local16.method7246(1.0F);
			local16.method7246(0.0F);
			local16.method7246(1.0F);
			local16.method7246(0.0F);
			local16.method7246(-1.0F);
			local16.method7246(1.0F);
			local16.method7246(0.0F);
			local16.method7246(0.0F);
			local16.method7246(0.0F);
		} else {
			local16.method7248(-1.0F);
			local16.method7248(-1.0F);
			local16.method7248(0.0F);
			local16.method7248(0.0F);
			local16.method7248(1.0F);
			local16.method7248(1.0F);
			local16.method7248(-1.0F);
			local16.method7248(0.0F);
			local16.method7248(1.0F);
			local16.method7248(1.0F);
			local16.method7248(1.0F);
			local16.method7248(1.0F);
			local16.method7248(0.0F);
			local16.method7248(1.0F);
			local16.method7248(0.0F);
			local16.method7248(-1.0F);
			local16.method7248(1.0F);
			local16.method7248(0.0F);
			local16.method7248(0.0F);
			local16.method7248(0.0F);
		}
		this.anInterface12_4 = this.method7037(false, 20, local16.aByteArray99, local16.anInt8936);
		this.aClass380_11 = new Class380(this.anInterface12_4, 5126, 3, 0);
		this.aClass380_12 = new Class380(this.anInterface12_4, 5126, 2, 12);
		this.aClass311_1.method7810(this);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!vm;Lclient!vm;Lclient!vm;ILclient!vm;)V")
	public void method6978(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class380 arg2, @OriginalArg(4) Class380 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6985(arg1.anInterface12_7);
			OpenGL.glVertexPointer(arg1.aByte142, arg1.aShort115, this.anInterface12_5.method5811(), this.anInterface12_5.method5810() + (long) arg1.aByte143);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6985(arg2.anInterface12_7);
			OpenGL.glNormalPointer(arg2.aShort115, this.anInterface12_5.method5811(), this.anInterface12_5.method5810() + (long) arg2.aByte143);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6985(arg3.anInterface12_7);
			OpenGL.glColorPointer(arg3.aByte142, arg3.aShort115, this.anInterface12_5.method5811(), this.anInterface12_5.method5810() + (long) arg3.aByte143);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6985(arg0.anInterface12_7);
			OpenGL.glTexCoordPointer(arg0.aByte142, arg0.aShort115, this.anInterface12_5.method5811(), this.anInterface12_5.method5810() + (long) arg0.aByte143);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBII)V")
	public void method6979(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZJ)V")
	public synchronized void method6980(@OriginalArg(1) long arg0) {
		@Pc(7) Class14 local7 = new Class14();
		local7.aLong324 = arg0;
		this.aClass32_53.method582(local7);
	}

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "()Z")
	@Override
	public boolean method6962() {
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(B)V")
	private void method6981() {
		Static42.aFloatArray41[3] = 1.0F;
		Static42.aFloatArray41[0] = this.aFloat144 * this.aFloat149;
		Static42.aFloatArray41[2] = this.aFloat149 * this.aFloat145;
		Static42.aFloatArray41[1] = this.aFloat149 * this.aFloat161;
		OpenGL.glLightfv(16384, 4609, Static42.aFloatArray41, 0);
		Static42.aFloatArray41[3] = 1.0F;
		Static42.aFloatArray41[0] = this.aFloat144 * -this.aFloat154;
		Static42.aFloatArray41[2] = this.aFloat145 * -this.aFloat154;
		Static42.aFloatArray41[1] = this.aFloat161 * -this.aFloat154;
		OpenGL.glLightfv(16385, 4609, Static42.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!pu;Z)V")
	public void method6982(@OriginalArg(0) Class161 arg0) {
		@Pc(9) Class161 local9 = this.aClass161Array1[this.bf];
		if (local9 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local9.anInt10743);
			} else {
				if (local9 == null) {
					OpenGL.glEnable(arg0.anInt10743);
				} else if (local9.anInt10743 != arg0.anInt10743) {
					OpenGL.glDisable(local9.anInt10743);
					OpenGL.glEnable(arg0.anInt10743);
				}
				OpenGL.glBindTexture(arg0.anInt10743, arg0.method9168());
			}
			this.aClass161Array1[this.bf] = arg0;
		}
		this.anInt8063 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "()Lclient!rd;")
	@Override
	public Class263 method6943() {
		return this.aClass263_Sub1_3;
	}

	@OriginalMember(owner = "client!pi", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean559) {
			throw new RuntimeException("");
		}
		this.anInt8067 = arg0;
		this.anInt8071 = arg3;
		this.anInt8076 = arg1;
		this.anInt8085 = arg2;
		if (this.aBoolean577) {
			this.aClass313_1.aClass38_Sub1_1.method712();
			this.aClass313_1.aClass38_Sub1_1.method713();
		}
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(B)V")
	private void method6983() {
		if (this.anInt8091 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt7855 > 0 && this.anInt7942 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt7855, (double) this.anInt7942, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt8063 &= 0xFFFFFFE7;
		this.anInt8091 = 1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!dea;IIII)Lclient!ka;")
	@Override
	public Class129 method6908(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class129_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "(I)V")
	public void method6984() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)V")
	@Override
	public void method6968(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "()V")
	@Override
	public void method6901() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(IIIIII)Lclient!lb;")
	@Override
	public Class47 method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean555 ? new Class47_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!ku;)V")
	public void method6985(@OriginalArg(1) Interface12 arg0) {
		if (arg0 != this.anInterface12_5) {
			if (this.aBoolean560) {
				OpenGL.glBindBufferARB(34962, arg0.method5813());
			}
			this.anInterface12_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(ILclient!ar;)V")
	public void method6986(@OriginalArg(1) Interface1 arg0) {
		if (this.anInt8055 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8055 >= 0) {
			this.anInterface1Array1[this.anInt8055].method5176();
		}
		this.anInterface1_1 = this.anInterface1Array1[++this.anInt8055] = arg0;
		this.anInterface1_1.method5174();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass157_1.method3841(arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6942(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6918(arg2, arg3);
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V")
	@Override
	public void method6900(@OriginalArg(0) int arg0) {
		this.method7002();
	}

	@OriginalMember(owner = "client!pi", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(12) boolean local12 = arg0 != this.anInt8064;
		if (local12 || arg1 != this.aFloat149 || arg2 != this.aFloat154) {
			this.aFloat149 = arg1;
			this.anInt8064 = arg0;
			this.aFloat154 = arg2;
			if (local12) {
				this.aFloat144 = (float) (this.anInt8064 & 0xFF0000) / 1.671168E7F;
				this.aFloat145 = (float) (this.anInt8064 & 0xFF) / 255.0F;
				this.aFloat161 = (float) (this.anInt8064 & 0xFF00) / 65280.0F;
				this.method7005();
			}
			this.method6981();
		}
		if (this.aFloatArray63[0] == arg3 && arg4 == this.aFloatArray63[1] && this.aFloatArray63[2] == arg5) {
			return;
		}
		this.aFloatArray63[1] = arg4;
		this.aFloatArray63[0] = arg3;
		this.aFloatArray63[2] = arg5;
		this.aFloatArray61[1] = -arg4;
		this.aFloatArray61[2] = -arg5;
		this.aFloatArray61[0] = -arg3;
		@Pc(151) float local151 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray65[1] = arg4 * local151;
		this.aFloatArray65[0] = arg3 * local151;
		this.aFloatArray65[2] = arg5 * local151;
		this.aFloatArray64[2] = -this.aFloatArray65[2];
		this.aFloatArray64[1] = -this.aFloatArray65[1];
		this.aFloatArray64[0] = -this.aFloatArray65[0];
		this.method7023();
		this.anInt8090 = (int) (arg5 * 256.0F / arg4);
		this.anInt8086 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIF)Lclient!rfa;")
	@Override
	public Class14_Sub18 method6915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class14_Sub18_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "()V")
	@Override
	public void method6953() {
		if (this.aBoolean576) {
			if (this.anInterface1_1 != this.aClass217_6) {
				throw new RuntimeException();
			}
			this.aClass217_6.method5187(0);
			this.aClass217_6.method5187(8);
			this.method7030(this.aClass217_6);
		} else if (this.aBoolean572) {
			this.aClass45_Sub3_1.method7506(0, 0, this.anInt7855, this.anInt7942, 0, 0);
			this.anOpenGL2.setSurface(this.aLong214);
		} else {
			throw new RuntimeException("");
		}
		this.anInt7942 = this.anInt7863;
		this.aClass45_Sub3_1 = null;
		this.anInt7855 = this.anInt8028;
		this.method7020();
		this.method7038();
		this.la();
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(Z)V")
	private void method6987() {
		this.method7053(-2);
		for (@Pc(12) int local12 = this.anInt8080 - 1; local12 >= 0; local12--) {
			this.method7028(local12);
			this.method6982((Class161) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method7025(8448, 8448);
		this.method6979(2, 770, 34168);
		this.method6994();
		this.anInt8062 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt8061 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean553 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean550 = true;
		this.method6977(true);
		this.method7015(true);
		this.method7050(true);
		this.method7040(true);
		this.method7020();
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
		@Pc(135) float[] local135 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(137) int local137 = 0; local137 < 8; local137++) {
			@Pc(143) int local143 = local137 + 16384;
			OpenGL.glLightfv(local143, 4608, local135, 0);
			OpenGL.glLightf(local143, 4615, 0.0F);
			OpenGL.glLightf(local143, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt8064 = this.anInt8095 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6971() {
		this.method7008();
		this.method7054(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pi", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8092 = arg3;
		this.anInt8073 = arg2;
		this.anInt8066 = arg0;
		this.anInt8078 = arg1;
		this.method7048();
		this.method6996();
		if (this.anInt8091 == 3) {
			this.method7032();
		} else if (this.anInt8091 == 2) {
			this.method7026();
			return;
		}
	}

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "()V")
	@Override
	public void method6936() {
		this.aClass157_1.method3847();
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(II)Lclient!wi;")
	@Override
	public Interface27 method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!rd;)V")
	@Override
	public void method6896(@OriginalArg(0) Class263 arg0) {
		this.aClass263_Sub1_3.method8437(arg0);
		this.aClass263_Sub1_4.method8437(this.aClass263_Sub1_3);
		this.aClass263_Sub1_4.method6422();
		this.aClass263_Sub1_5.method6424(this.aClass263_Sub1_4);
		if (this.anInt8091 != 1) {
			this.method7057();
		}
	}

	@OriginalMember(owner = "client!pi", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt8098;
		this.anInt8098 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!pi", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass263_Sub1_3.aFloat127 + (float) arg2 * this.aClass263_Sub1_3.aFloat124 + this.aClass263_Sub1_3.aFloat125 * (float) arg1 + this.aClass263_Sub1_3.aFloat123 * (float) arg0;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass263_Sub1_3.aFloat123 * (float) arg3 + (float) arg4 * this.aClass263_Sub1_3.aFloat125 + (float) arg5 * this.aClass263_Sub1_3.aFloat124 + this.aClass263_Sub1_3.aFloat127;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if (local32 < (float) this.anInt8068 && (float) this.anInt8068 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt8077 < local32 && (float) this.anInt8077 < local63) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) ((float) this.anInt8073 * (this.aClass263_Sub1_3.aFloat130 + (float) arg0 * this.aClass263_Sub1_3.aFloat126 + (float) arg1 * this.aClass263_Sub1_3.aFloat133 + this.aClass263_Sub1_3.aFloat131 * (float) arg2) / local32);
		@Pc(173) int local173 = (int) ((this.aClass263_Sub1_3.aFloat133 * (float) arg4 + this.aClass263_Sub1_3.aFloat126 * (float) arg3 + this.aClass263_Sub1_3.aFloat131 * (float) arg5 + this.aClass263_Sub1_3.aFloat130) * (float) this.anInt8073 / local63);
		if ((float) local141 < this.aFloat155 && this.aFloat155 > (float) local173) {
			local7 |= 0x1;
		} else if ((float) local141 > this.aFloat143 && this.aFloat143 < (float) local173) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) ((float) this.anInt8092 * (this.aClass263_Sub1_3.aFloat122 * (float) arg1 + this.aClass263_Sub1_3.aFloat129 * (float) arg0 + (float) arg2 * this.aClass263_Sub1_3.aFloat132 + this.aClass263_Sub1_3.aFloat128) / local32);
		@Pc(277) int local277 = (int) ((float) this.anInt8092 * (this.aClass263_Sub1_3.aFloat128 + (float) arg4 * this.aClass263_Sub1_3.aFloat122 + this.aClass263_Sub1_3.aFloat129 * (float) arg3 + (float) arg5 * this.aClass263_Sub1_3.aFloat132) / local63);
		if ((float) local245 < this.aFloat160 && (float) local277 < this.aFloat160) {
			local7 |= 0x4;
		} else if ((float) local245 > this.aFloat151 && (float) local277 > this.aFloat151) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)V")
	public void method6988(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method7025(7681, 7681);
		} else if (arg0 == 0) {
			this.method7025(8448, 8448);
			return;
		} else if (arg0 == 2) {
			this.method7025(34165, 7681);
			return;
		} else if (arg0 == 3) {
			this.method7025(260, 8448);
			return;
		} else if (arg0 == 4) {
			this.method7025(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "(I)V")
	public void method6989() {
		if (this.anInt8063 == 16) {
			return;
		}
		this.method7016();
		this.method6977(true);
		this.method7050(true);
		this.method7040(true);
		this.method7054(1);
		this.anInt8063 = 16;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!oba;I)V")
	public void method6990(@OriginalArg(0) Class263_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method6419(), 0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z[BIII)Lclient!fb;")
	public Interface6 method6991(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) int arg2) {
		return (Interface6) (this.aBoolean560 && (!arg0 || this.aBoolean579) ? new Class235_Sub2(this, 5123, arg1, arg2, arg0) : new Class86_Sub2(this, 5123, arg1, arg2));
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!lb;Lclient!lb;FLclient!lb;)Lclient!lb;")
	@Override
	public Class47 method6899(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class47 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean555 && this.aBoolean576) {
			@Pc(21) Class47_Sub2_Sub2 local21 = null;
			@Pc(24) Class47_Sub2 local24 = (Class47_Sub2) arg0;
			@Pc(27) Class47_Sub2 local27 = (Class47_Sub2) arg1;
			@Pc(31) Class161_Sub4 local31 = local24.method8702();
			@Pc(35) Class161_Sub4 local35 = local27.method8702();
			if (local31 != null && local35 != null) {
				@Pc(59) int local59 = local31.anInt10753 > local35.anInt10753 ? local31.anInt10753 : local35.anInt10753;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class47_Sub2_Sub2) {
					@Pc(75) Class47_Sub2_Sub2 local75 = (Class47_Sub2_Sub2) arg3;
					if (local75.method8703() == local59) {
						local21 = local75;
					}
				}
				if (local21 == null) {
					local21 = new Class47_Sub2_Sub2(this, local59);
				}
				if (local21.method8705(local35, arg2, local31)) {
					return local21;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static21.method322(arg1, arg2, arg3, arg0, this);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg5;
		@Pc(9) Class161_Sub1_Sub1 local9 = local6.aClass161_Sub1_Sub1_1;
		this.method7033();
		this.method6982(local6.aClass161_Sub1_Sub1_1);
		this.method7054(1);
		this.method7025(7681, 8448);
		this.method6979(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat71 / (float) local9.anInt4556;
		@Pc(46) float local46 = local9.aFloat72 / (float) local9.anInt4558;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(58) float local58 = (float) arg3 - (float) arg1;
		@Pc(71) float local71 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local58 * local58)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(90) float local90 = local58 * local71;
		@Pc(94) float local94 = local52 * local71;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local94 + 0.35F, (float) arg3 + local90 + 0.35F);
		OpenGL.glEnd();
		this.method6979(0, 768, 5890);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!lb;)V")
	@Override
	public void method6927(@OriginalArg(0) Class47 arg0) {
		this.aClass47_Sub2_1 = (Class47_Sub2) arg0;
	}

	@OriginalMember(owner = "client!pi", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8076 = arg1;
		this.anInt8071 = arg3;
		this.anInt8067 = arg0;
		this.aBoolean559 = true;
		this.anInt8085 = arg2;
	}

	@OriginalMember(owner = "client!pi", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method7008();
		this.method7054(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean573) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean573) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!fb;I)V")
	public void method6993(@OriginalArg(0) Interface6 arg0) {
		if (arg0 != this.anInterface6_4) {
			if (this.aBoolean560) {
				OpenGL.glBindBufferARB(34963, arg0.method8718());
			}
			this.anInterface6_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!pi", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7008();
		this.method7054(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "()Z")
	@Override
	public boolean method6895() {
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "(B)V")
	private void method6994() {
		if (this.aBoolean580) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean580 = false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6893(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas10) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(23) Long local23 = (Long) this.aHashtable6.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local23);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt8068 && arg1 == this.anInt8077) {
			return;
		}
		this.anInt8068 = arg0;
		this.anInt8077 = arg1;
		this.method7048();
		this.method7031();
		if (this.anInt8091 == 3) {
			this.method7032();
		} else if (this.anInt8091 == 2) {
			this.method7026();
			return;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZLclient!jaclib/memory/Buffer;II)Lclient!ku;")
	public Interface12 method6995(@OriginalArg(0) int arg0, @OriginalArg(2) Buffer arg1, @OriginalArg(4) int arg2) {
		return (Interface12) (this.aBoolean560 && (this.aBoolean579 || true) ? new Class235_Sub1(this, arg0, arg1, arg2, false) : new Class86_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "(I)V")
	private void method6996() {
		this.aFloat151 = (float) (this.anInt8079 - this.anInt8078);
		this.aFloat143 = (float) (this.anInt8072 - this.anInt8066);
		this.aFloat155 = (float) (this.anInt8084 - this.anInt8066);
		this.aFloat160 = (float) (this.anInt8083 - this.anInt8078);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!oba;B)V")
	public void method6997(@OriginalArg(0) Class263_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method6419(), 0);
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V")
	private void method6998() {
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.anInt8069; local5++) {
			@Pc(18) Class14_Sub18 local18 = this.aClass14_Sub18Array6[local5];
			@Pc(22) int local22 = local5 + 16386;
			Static119.aFloatArray7[0] = (float) local18.method8342();
			Static119.aFloatArray7[1] = (float) local18.method8344();
			Static119.aFloatArray7[2] = (float) local18.method8341();
			Static119.aFloatArray7[3] = 1.0F;
			OpenGL.glLightfv(local22, 4611, Static119.aFloatArray7, 0);
			@Pc(56) int local56 = local18.method8345();
			@Pc(62) float local62 = local18.method8339() / 255.0F;
			Static119.aFloatArray7[0] = (float) (local56 >> 16 & 0xFF) * local62;
			Static119.aFloatArray7[1] = (float) (local56 >> 8 & 0xFF) * local62;
			Static119.aFloatArray7[2] = (float) (local56 & 0xFF) * local62;
			OpenGL.glLightfv(local22, 4609, Static119.aFloatArray7, 0);
			OpenGL.glLightf(local22, 4617, 1.0F / (float) (local18.method8343() * local18.method8343()));
			OpenGL.glEnable(local22);
		}
		while (local5 < this.anInt8074) {
			OpenGL.glDisable(local5 + 16386);
			local5++;
		}
		this.anInt8074 = this.anInt8069;
	}

	@OriginalMember(owner = "client!pi", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.lb != arg0) {
			this.lb = arg0;
			this.method7005();
		}
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(BI)I")
	public int method6999(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "()V")
	@Override
	public void method6889() {
		if (!this.aBoolean564 || this.anInt7855 <= 0 || this.anInt7942 <= 0) {
			return;
		}
		@Pc(24) int local24 = this.anInt8084;
		@Pc(27) int local27 = this.anInt8072;
		@Pc(30) int local30 = this.anInt8083;
		@Pc(33) int local33 = this.anInt8079;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7020();
		this.method6977(false);
		this.method7015(false);
		this.method7050(false);
		this.method7040(false);
		this.method6982((Class161) null);
		this.method7053(-2);
		this.method6988(1);
		this.method7054(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt7855, this.anInt7942, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local24, local30, local27, local33);
	}

	@OriginalMember(owner = "client!pi", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass263_Sub1_3.aFloat127 + this.aClass263_Sub1_3.aFloat124 * (float) arg2 + (float) arg0 * this.aClass263_Sub1_3.aFloat123 + (float) arg1 * this.aClass263_Sub1_3.aFloat125;
		if (local28 < (float) this.anInt8068 || (float) this.anInt8077 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(88) int local88 = (int) (((float) arg2 * this.aClass263_Sub1_3.aFloat131 + this.aClass263_Sub1_3.aFloat133 * (float) arg1 + (float) arg0 * this.aClass263_Sub1_3.aFloat126 + this.aClass263_Sub1_3.aFloat130) * (float) this.anInt8073 / local28);
		@Pc(120) int local120 = (int) ((this.aClass263_Sub1_3.aFloat132 * (float) arg2 + this.aClass263_Sub1_3.aFloat129 * (float) arg0 + (float) arg1 * this.aClass263_Sub1_3.aFloat122 + this.aClass263_Sub1_3.aFloat128) * (float) this.anInt8092 / local28);
		if (this.aFloat155 <= (float) local88 && this.aFloat143 >= (float) local88 && (float) local120 >= this.aFloat160 && (float) local120 <= this.aFloat151) {
			arg3[1] = (int) ((float) local120 - this.aFloat160);
			arg3[0] = (int) ((float) local88 - this.aFloat155);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!pi", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7040(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "(I)V")
	public void method7000() {
		if (this.anInt8063 == 4) {
			return;
		}
		this.method6983();
		this.method6977(false);
		this.method7015(false);
		this.method7050(false);
		this.method7040(false);
		this.method7053(-2);
		this.method7054(1);
		this.anInt8063 = 4;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([I)V")
	@Override
	public void method6921(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7855;
		arg0[1] = this.anInt7942;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)V")
	public void method7001() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "(I)V")
	private void method7002() {
		@Pc(5) int local5 = 0;
		while (!this.anOpenGL2.a()) {
			if (local5++ > 5) {
				throw new RuntimeException("");
			}
			Static548.method7968(1000L);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(FB)V")
	public void method7003(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat150) {
			this.aFloat150 = arg0;
			if (this.anInt8091 == 3) {
				this.method7032();
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLclient!ar;)V")
	public void method7004(@OriginalArg(1) Interface1 arg0) {
		if (this.anInt8055 < 0 || arg0 != this.anInterface1Array1[this.anInt8055]) {
			throw new RuntimeException();
		}
		this.anInterface1Array1[this.anInt8055--] = null;
		arg0.method5176();
		if (this.anInt8055 < 0) {
			this.anInterface1_1 = null;
		} else {
			this.anInterface1_1 = this.anInterface1Array1[this.anInt8055];
			this.anInterface1_1.method5174();
		}
	}

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "()Z")
	@Override
	public boolean method6897() {
		return this.aClass313_1.method7844();
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)I")
	@Override
	public int method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!pi", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(61) float local61;
		@Pc(49) float local49;
		if (this.aClass161_Sub1_Sub1_4 == null || arg2 > this.aClass161_Sub1_Sub1_4.anInt4554 || this.aClass161_Sub1_Sub1_4.anInt4546 < arg3) {
			this.aClass161_Sub1_Sub1_4 = Static27.method384(this, arg6, arg2, arg3);
			this.aClass161_Sub1_Sub1_4.method3971(false, false);
			local61 = this.aClass161_Sub1_Sub1_4.aFloat72;
			local49 = this.aClass161_Sub1_Sub1_4.aFloat71;
		} else {
			this.aClass161_Sub1_Sub1_4.method3972(arg3, arg6, 6406, false, arg2);
			local49 = (float) arg2 * this.aClass161_Sub1_Sub1_4.aFloat71 / (float) this.aClass161_Sub1_Sub1_4.anInt4554;
			local61 = (float) arg3 * this.aClass161_Sub1_Sub1_4.aFloat72 / (float) this.aClass161_Sub1_Sub1_4.anInt4546;
		}
		this.method7033();
		this.method6982(this.aClass161_Sub1_Sub1_4);
		this.method7054(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method7043(arg5);
		this.method7025(34165, 34165);
		this.method6979(0, 768, 34166);
		this.method6979(2, 770, 5890);
		this.method7021(34166, 0);
		this.method7021(5890, 2);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = (float) arg2 + local151;
		@Pc(164) float local164 = local154 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local49);
		OpenGL.glVertex2f(local151, local164);
		OpenGL.glTexCoord2f(local61, local49);
		OpenGL.glVertex2f(local159, local164);
		OpenGL.glTexCoord2f(local61, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method6979(0, 768, 5890);
		this.method6979(2, 770, 34166);
		this.method7021(5890, 0);
		this.method7021(34166, 2);
	}

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "()Z")
	@Override
	public boolean method6922() {
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Class161_Sub1_Sub1 local9 = local6.aClass161_Sub1_Sub1_1;
		this.method7033();
		this.method6982(local6.aClass161_Sub1_Sub1_1);
		this.method7054(1);
		this.method7025(7681, 8448);
		this.method6979(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat71 / (float) local9.anInt4556;
		@Pc(46) float local46 = local9.aFloat72 / (float) local9.anInt4558;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt8084 - arg2) * local39, local46 * (float) (this.anInt8083 - arg3));
		OpenGL.glVertex2i(this.anInt8084, this.anInt8083);
		OpenGL.glTexCoord2f((float) (this.anInt8084 - arg2) * local39, (float) (this.anInt8079 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8084, this.anInt8079);
		OpenGL.glTexCoord2f((float) (this.anInt8072 - arg2) * local39, local46 * (float) (this.anInt8079 - arg3));
		OpenGL.glVertex2i(this.anInt8072, this.anInt8079);
		OpenGL.glTexCoord2f((float) (this.anInt8072 - arg2) * local39, local46 * (float) (this.anInt8083 - arg3));
		OpenGL.glVertex2i(this.anInt8072, this.anInt8083);
		OpenGL.glEnd();
		this.method6979(0, 768, 5890);
	}

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "(B)V")
	private void method7005() {
		Static42.aFloatArray41[2] = this.aFloat145 * this.lb;
		Static42.aFloatArray41[0] = this.lb * this.aFloat144;
		Static42.aFloatArray41[1] = this.lb * this.aFloat161;
		Static42.aFloatArray41[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static42.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6952(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static83.aFloat12 = arg1;
		Static539.aFloat181 = arg2;
		Static583.aFloat188 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!ar;)V")
	public void method7006(@OriginalArg(1) Interface1 arg0) {
		if (this.aBoolean558) {
			this.method7019(arg0);
			this.method6986(arg0);
		} else if (this.anInt8056 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt8056 >= 0) {
				this.anInterface1Array3[this.anInt8056].method5175();
			}
			this.anInterface1_2 = this.anInterface1_1 = this.anInterface1Array3[++this.anInt8056] = arg0;
			this.anInterface1_2.method5172();
		}
	}

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "(I)I")
	private int method7007() {
		this.aString91 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString90 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString91.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString91.indexOf("brian paul") != -1 || this.aString91.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(53) String local53 = OpenGL.glGetString(7938);
		@Pc(61) String[] local61 = Static407.method2868(local53.replace('.', ' '), ' ');
		if (local61.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(78) int local78 = Static297.method4858(local61[0], -64);
				@Pc(84) int local84 = Static297.method4858(local61[1], 84);
				this.anInt8087 = local84 + local78 * 10;
			} catch (@Pc(93) NumberFormatException local93) {
				local10 |= 0x4;
			}
		}
		if (this.anInt8087 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(139) int[] local139 = new int[1];
		OpenGL.glGetIntegerv(34018, local139, 0);
		this.anInt8080 = local139[0];
		OpenGL.glGetIntegerv(34929, local139, 0);
		this.anInt8070 = local139[0];
		OpenGL.glGetIntegerv(34930, local139, 0);
		this.anInt8094 = local139[0];
		if (this.anInt8080 < 2 || this.anInt8070 < 2 || this.anInt8094 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean557 = Stream.c();
		this.aBoolean572 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean560 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean573 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean565 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean574 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean578 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean566 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean575 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean555 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean563 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean556 = false;
		this.aBoolean576 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean558 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean561 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean569 = this.aBoolean558 & this.aBoolean561;
		this.aBoolean570 = Class275.aString86.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static42.aFloatArray41, 0);
		this.aFloat148 = Static42.aFloatArray41[0];
		this.aFloat159 = Static42.aFloatArray41[1];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "(I)V")
	private void method7008() {
		if (this.anInt8063 == 1) {
			return;
		}
		this.method6983();
		this.method6977(false);
		this.method7015(false);
		this.method7050(false);
		this.method7040(false);
		this.method6982((Class161) null);
		this.method7053(-2);
		this.method6988(1);
		this.anInt8063 = 1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZII)V")
	public void method7009(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method7042(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "()Lclient!rd;")
	@Override
	public Class263 method6907() {
		return this.aClass263_Sub1_1;
	}

	@OriginalMember(owner = "client!pi", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt8053 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt8053++;
		}
		this.anInt8052 = 0x1 << this.anInt8053;
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public Class14_Sub16 method6961(@OriginalArg(0) int arg0) {
		@Pc(8) Class14_Sub16_Sub1 local8 = new Class14_Sub16_Sub1(arg0);
		this.aClass32_46.method582(local8);
		return local8;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method6923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method7008();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method7054(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean573) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean573) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(ILclient!ar;)V")
	public void method7010(@OriginalArg(1) Interface1 arg0) {
		if (this.anInt8057 < 0 || arg0 != this.anInterface1Array2[this.anInt8057]) {
			throw new RuntimeException();
		}
		this.anInterface1Array2[this.anInt8057--] = null;
		arg0.method5173();
		if (this.anInt8057 < 0) {
			this.anInterface1_2 = null;
		} else {
			this.anInterface1_2 = this.anInterface1Array2[this.anInt8057];
			this.anInterface1_2.method5177();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!wi;Lclient!bj;)Lclient!tca;")
	@Override
	public Interface22 method6956(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) Interface3 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "(I)V")
	private void method7011() {
		this.aClass161Array1 = new Class161[this.anInt8080];
		this.aClass161_Sub1_5 = new Class161_Sub1(this, 3553, 6408, 1, 1);
		new Class161_Sub1(this, 3553, 6408, 1, 1);
		new Class161_Sub1(this, 3553, 6408, 1, 1);
		this.aClass129_Sub1_7 = new Class129_Sub1(this);
		this.aClass129_Sub1_9 = new Class129_Sub1(this);
		this.aClass129_Sub1_5 = new Class129_Sub1(this);
		this.aClass129_Sub1_3 = new Class129_Sub1(this);
		this.aClass129_Sub1_8 = new Class129_Sub1(this);
		this.aClass129_Sub1_1 = new Class129_Sub1(this);
		this.aClass129_Sub1_6 = new Class129_Sub1(this);
		this.aClass129_Sub1_4 = new Class129_Sub1(this);
		this.aClass129_Sub1_2 = new Class129_Sub1(this);
		this.aClass129_Sub1_10 = new Class129_Sub1(this);
		if (this.aBoolean576) {
			this.aClass217_7 = new Class217(this);
			new Class217(this);
		}
	}

	@OriginalMember(owner = "client!pi", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass263_Sub1_3.aFloat124 * (float) arg2 + this.aClass263_Sub1_3.aFloat125 * (float) arg1 + (float) arg0 * this.aClass263_Sub1_3.aFloat123 + this.aClass263_Sub1_3.aFloat127;
		if ((float) this.anInt8068 > local28 || local28 > (float) this.anInt8077) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(89) int local89 = (int) ((this.aClass263_Sub1_3.aFloat130 + (float) arg2 * this.aClass263_Sub1_3.aFloat131 + (float) arg0 * this.aClass263_Sub1_3.aFloat126 + (float) arg1 * this.aClass263_Sub1_3.aFloat133) * (float) this.anInt8073 / (float) arg3);
		@Pc(122) int local122 = (int) ((float) this.anInt8092 * ((float) arg0 * this.aClass263_Sub1_3.aFloat129 + this.aClass263_Sub1_3.aFloat122 * (float) arg1 + (float) arg2 * this.aClass263_Sub1_3.aFloat132 + this.aClass263_Sub1_3.aFloat128) / (float) arg3);
		if ((float) local89 >= this.aFloat155 && (float) local89 <= this.aFloat143 && (float) local122 >= this.aFloat160 && (float) local122 <= this.aFloat151) {
			arg4[2] = (int) local28;
			arg4[0] = (int) ((float) local89 - this.aFloat155);
			arg4[1] = (int) ((float) local122 - this.aFloat160);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)V")
	private void method7012() {
		this.aFloatArray62[14] = this.aFloat157;
		this.aFloatArray62[10] = this.aFloat158;
		this.aFloat152 = (float) this.anInt8077;
		this.aFloat162 = ((float) -this.anInt8077 + this.aFloatArray62[14]) / this.aFloatArray62[10];
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6909(@OriginalArg(0) Canvas arg0) {
		this.aLong214 = 0L;
		this.aCanvas11 = null;
		if (arg0 == null || arg0 == this.aCanvas10) {
			this.aLong214 = this.aLong213;
			this.aCanvas11 = this.aCanvas10;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(42) Long local42 = (Long) this.aHashtable6.get(arg0);
			this.aLong214 = local42;
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.aLong214 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong214);
		this.method6975();
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(ZI)V")
	public synchronized void method7013(@OriginalArg(1) int arg0) {
		@Pc(7) Class14 local7 = new Class14();
		local7.aLong324 = (long) arg0;
		this.aClass32_52.method582(local7);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(FIFF)V")
	private void method7014(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean580) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean580 = true;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(BZ)V")
	public void method7015(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean568) {
			this.aBoolean568 = arg0;
			this.method7044();
			this.anInt8063 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
	private void method7016() {
		if (this.anInt8091 != 3) {
			this.anInt8091 = 3;
			this.method7032();
			this.method7057();
			this.anInt8063 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(II)I")
	@Override
	public int method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!qv;I)V")
	@Override
	public void method6902(@OriginalArg(0) Class304 arg0, @OriginalArg(1) int arg1) {
		this.aClass311_1.method7808(arg1, arg0, this);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!oe;Z)Lclient!fia;")
	@Override
	public Class45 method6964(@OriginalArg(0) Class266 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt7303 * arg0.anInt7305];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray80 == null) {
			for (local21 = 0; local21 < arg0.anInt7305; local21++) {
				for (local25 = 0; local25 < arg0.anInt7303; local25++) {
					@Pc(38) int local38 = arg0.anIntArray386[arg0.aByteArray79[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt7305; local21++) {
				for (local25 = 0; local25 < arg0.anInt7303; local25++) {
					local12[local16++] = arg0.anIntArray386[arg0.aByteArray79[local14] & 0xFF] | arg0.aByteArray80[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(139) Class45 local139 = this.method6941(arg0.anInt7305, arg0.anInt7303, local12, arg0.anInt7303);
		local139.method7499(arg0.anInt7304, arg0.anInt7308, arg0.anInt7307, arg0.anInt7306);
		return local139;
	}

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "()V")
	@Override
	public void method6916() {
		if (this.aClass14_Sub5_Sub1_1 != null && this.aClass14_Sub5_Sub1_1.method5487()) {
			this.aClass157_1.method3842(this.aClass14_Sub5_Sub1_1);
			this.aClass111_1.method2233();
		}
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)V")
	private void method7017() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)V")
	public synchronized void method7018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class14_Sub30 local13 = new Class14_Sub30(arg0);
		local13.aLong324 = (long) arg1;
		this.aClass32_48.method582(local13);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(18) Class1_Sub3 local18 = (Class1_Sub3) arg5;
		@Pc(21) Class161_Sub1_Sub1 local21 = local18.aClass161_Sub1_Sub1_1;
		this.method7033();
		this.method6982(local18.aClass161_Sub1_Sub1_1);
		this.method7054(1);
		this.method7025(7681, 8448);
		this.method6979(0, 768, 34167);
		@Pc(51) float local51 = local21.aFloat71 / (float) local21.anInt4556;
		@Pc(58) float local58 = local21.aFloat72 / (float) local21.anInt4558;
		@Pc(65) float local65 = (float) -arg0 + (float) arg2;
		@Pc(71) float local71 = (float) arg3 - (float) arg1;
		@Pc(84) float local84 = (float) (1.0D / Math.sqrt((double) (local71 * local71 + local65 * local65)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(103) float local103 = local71 * local84;
		@Pc(107) float local107 = local65 * local84;
		@Pc(113) int local113 = arg10 % (arg8 + arg9);
		@Pc(118) float local118 = local107 * (float) arg8;
		@Pc(123) float local123 = local103 * (float) arg8;
		@Pc(125) float local125 = 0.0F;
		@Pc(127) float local127 = 0.0F;
		@Pc(129) float local129 = local118;
		@Pc(131) float local131 = local123;
		if (local113 <= arg8) {
			local129 = (float) (arg8 - local113) * local107;
			local131 = (float) (arg8 - local113) * local103;
		} else {
			local125 = local107 * (float) (arg9 + arg8 - local113);
			local127 = local103 * (float) (arg8 + arg9 - local113);
		}
		@Pc(180) float local180 = local125 + (float) arg0 + 0.35F;
		@Pc(187) float local187 = local127 + (float) arg1 + 0.35F;
		@Pc(192) float local192 = (float) arg9 * local107;
		@Pc(197) float local197 = (float) arg9 * local103;
		while (true) {
			if (arg0 >= arg2) {
				if ((float) arg2 + 0.35F > local180) {
					break;
				}
				if (local180 + local129 < (float) arg2) {
					local129 = (float) arg2 - local180;
				}
			} else {
				if (local180 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local129 + local180) {
					local129 = (float) arg2 - local180;
				}
			}
			if (arg3 <= arg1) {
				if ((float) arg3 + 0.35F > local187) {
					break;
				}
				if (local131 + local187 < (float) arg3) {
					local131 = (float) arg3 - local187;
				}
			} else {
				if ((float) arg3 + 0.35F < local187) {
					break;
				}
				if ((float) arg3 < local187 + local131) {
					local131 = (float) arg3 - local187;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f((local180 - (float) arg6) * local51, local58 * ((float) -arg7 + local187));
			OpenGL.glVertex2f(local180, local187);
			OpenGL.glTexCoord2f(local51 * (local129 + local180 - (float) arg6), local58 * ((float) -arg7 + local187 + local131));
			OpenGL.glVertex2f(local180 + local129, local131 + local187);
			local187 += local197 + local131;
			local180 += local192 + local129;
			OpenGL.glEnd();
			local129 = local118;
			local131 = local123;
		}
		this.method6979(0, 768, 5890);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		this.method7008();
		this.method7054(1);
		@Pc(33) float local33 = (float) -arg0 + (float) arg2;
		@Pc(40) float local40 = (float) -arg1 + (float) arg3;
		@Pc(53) float local53 = (float) (1.0D / Math.sqrt((double) (local40 * local40 + local33 * local33)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(72) float local72 = local40 * local53;
		@Pc(78) int local78 = arg7 % (arg5 + arg6);
		@Pc(82) float local82 = local33 * local53;
		@Pc(87) float local87 = local82 * (float) arg5;
		@Pc(92) float local92 = (float) arg5 * local72;
		@Pc(94) float local94 = 0.0F;
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = local87;
		@Pc(100) float local100 = local92;
		if (arg5 < local78) {
			local94 = (float) (arg5 + arg6 - local78) * local82;
			local96 = local72 * (float) (arg5 + arg6 - local78);
		} else {
			local98 = (float) (arg5 - local78) * local82;
			local100 = local72 * (float) (arg5 - local78);
		}
		@Pc(153) float local153 = (float) arg0 + local94 + 0.35F;
		@Pc(160) float local160 = (float) arg1 + local96 + 0.35F;
		@Pc(165) float local165 = (float) arg6 * local82;
		@Pc(170) float local170 = (float) arg6 * local72;
		while (true) {
			if (arg0 >= arg2) {
				if ((float) arg2 + 0.35F > local153) {
					break;
				}
				if ((float) arg2 > local153 + local98) {
					local98 = (float) arg2 - local153;
				}
			} else {
				if ((float) arg2 + 0.35F < local153) {
					break;
				}
				if ((float) arg2 < local153 + local98) {
					local98 = (float) arg2 - local153;
				}
			}
			if (arg3 > arg1) {
				if (local160 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local100 + local160) {
					local100 = (float) arg3 - local160;
				}
			} else {
				if ((float) arg3 + 0.35F > local160) {
					break;
				}
				if (local160 + local100 < (float) arg3) {
					local100 = (float) arg3 - local160;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local153, local160);
			OpenGL.glVertex2f(local98 + local153, local160 + local100);
			local160 += local170 + local100;
			local153 += local165 + local98;
			OpenGL.glEnd();
			local98 = local87;
			local100 = local92;
		}
	}

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "(I)V")
	@Override
	public void method6911(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt8050 = arg0;
		this.aClass111_1.method2233();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ar;I)V")
	public void method7019(@OriginalArg(0) Interface1 arg0) {
		if (this.anInt8057 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8057 >= 0) {
			this.anInterface1Array2[this.anInt8057].method5173();
		}
		this.anInterface1_2 = this.anInterface1Array2[++this.anInt8057] = arg0;
		this.anInterface1_2.method5177();
	}

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "(B)V")
	public void method7020() {
		if (this.anInt8091 != 0) {
			this.anInt8091 = 0;
			this.anInt8063 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(IIII)V")
	public void method7021(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
	@Override
	public void method6954(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6917(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas10) {
			throw new RuntimeException();
		} else if (!this.aHashtable6.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(32) Class local32 = Class.forName("java.awt.Canvas");
				@Pc(44) Method local44 = local32.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local44.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(56) Exception local56) {
			}
			@Pc(61) long local61 = this.anOpenGL2.prepareSurface(arg0);
			if (local61 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, Long.valueOf(local61));
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6969(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
	public synchronized void method7022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class14_Sub30 local8 = new Class14_Sub30(arg0);
		local8.aLong324 = (long) arg1;
		this.aClass32_51.method582(local8);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIZ)Lclient!fia;")
	@Override
	public Class45 method6938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class45_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "()Z")
	@Override
	public boolean method6892() {
		if (this.aClass14_Sub5_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass14_Sub5_Sub1_1.method5487()) {
			if (!this.aClass157_1.method3848(this.aClass14_Sub5_Sub1_1)) {
				return false;
			}
			this.aClass111_1.method2233();
		}
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "(B)V")
	public void method7023() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray65, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(IBI)V")
	public synchronized void method7024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class14_Sub30 local8 = new Class14_Sub30(arg0);
		local8.aLong324 = (long) arg1;
		this.aClass32_49.method582(local8);
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(ZII)V")
	public void method7025(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.bf != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(16) boolean local16 = false;
		if (this.anInt8065 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local16 = true;
			this.anInt8065 = arg0;
		}
		if (arg1 != this.anInt8096) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local16 = true;
			this.anInt8096 = arg1;
		}
		if (local16) {
			this.anInt8063 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "(I)V")
	private void method7026() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray62, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "(I)V")
	@Override
	public void method6913(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)Lclient!vr;")
	public Class161_Sub4 method7027() {
		return this.aClass47_Sub2_1 == null ? null : this.aClass47_Sub2_1.method8702();
	}

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "(II)V")
	public void method7028(@OriginalArg(0) int arg0) {
		if (this.bf != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.bf = arg0;
		}
	}

	@OriginalMember(owner = "client!pi", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt8058 + this.anInt8059 + this.anInt8060;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!fb;III)V")
	public void method7029(@OriginalArg(1) Interface6 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg0.method8716();
		@Pc(14) int local14 = arg2 * this.method6999(local7);
		this.method6993(arg0);
		OpenGL.glDrawElements(4, arg1, local7, arg0.method8719() + (long) local14);
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
	@Override
	public void method6940(@OriginalArg(0) int arg0) {
		this.method7017();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZ)Lclient!fia;")
	@Override
	public Class45 method6890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class45_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ar;B)V")
	public void method7030(@OriginalArg(0) Interface1 arg0) {
		if (this.aBoolean558) {
			this.method7010(arg0);
			this.method7004(arg0);
		} else if (this.anInt8056 >= 0 && arg0 == this.anInterface1Array3[this.anInt8056]) {
			this.anInterface1Array3[this.anInt8056--] = null;
			arg0.method5175();
			if (this.anInt8056 >= 0) {
				this.anInterface1_2 = this.anInterface1_1 = this.anInterface1Array3[this.anInt8056];
				this.anInterface1_2.method5172();
			} else {
				this.anInterface1_2 = this.anInterface1_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "(I)V")
	private void method7031() {
		this.aFloat147 = (float) (this.anInt8077 - this.anInt8082) - this.aFloat153;
		this.aFloat146 = this.aFloat147 - (float) this.anInt8081 * this.aFloat156;
		if (this.aFloat146 < (float) this.anInt8068) {
			this.aFloat146 = (float) this.anInt8068;
		}
		OpenGL.glFogf(2915, this.aFloat146);
		OpenGL.glFogf(2916, this.aFloat147);
		Static42.aFloatArray41[0] = (float) (this.anInt8095 & 0xFF0000) / 1.671168E7F;
		Static42.aFloatArray41[2] = (float) (this.anInt8095 & 0xFF) / 255.0F;
		Static42.aFloatArray41[1] = (float) (this.anInt8095 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static42.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(Z)V")
	private void method7032() {
		@Pc(23) float local23 = (float) -this.anInt8066 * this.aFloat150 / (float) this.anInt8073;
		@Pc(35) float local35 = this.aFloat150 * (float) -this.anInt8078 / (float) this.anInt8092;
		@Pc(49) float local49 = (float) (this.anInt7855 - this.anInt8066) * this.aFloat150 / (float) this.anInt8073;
		@Pc(64) float local64 = (float) (this.anInt7942 - this.anInt8078) * this.aFloat150 / (float) this.anInt8092;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local49 != local23 && local64 != local35) {
			OpenGL.glOrtho((double) local23, (double) local49, (double) -local64, (double) -local35, (double) this.anInt8068, (double) this.anInt8077);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pi", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt8084 || this.anInt8072 < arg0 - arg2 || arg2 + arg1 < this.anInt8083 || this.anInt8079 < arg1 - arg2) {
			return;
		}
		this.method7008();
		this.method7054(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(86) float local86 = (float) arg0 + 0.35F;
		@Pc(91) float local91 = (float) arg1 + 0.35F;
		@Pc(95) int local95 = arg2 << 1;
		if (this.aFloat148 > (float) local95) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local86 + 1.0F, local91 + 1.0F);
			OpenGL.glVertex2f(local86 + 1.0F, local91 - 1.0F);
			OpenGL.glVertex2f(local86 - 1.0F, local91 - 1.0F);
			OpenGL.glVertex2f(local86 - 1.0F, local91 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat159 >= (float) local95) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local95);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local86, local91);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local86, local91);
			@Pc(151) int local151 = 262144 / (arg2 * 6);
			if (local151 <= 64) {
				local151 = 64;
			} else if (local151 > 512) {
				local151 = 512;
			}
			local151 = Static64.method1041(local151);
			OpenGL.glVertex2f((float) arg2 + local86, local91);
			for (@Pc(181) int local181 = 16384 - local151; local181 > 0; local181 -= local151) {
				OpenGL.glVertex2f((float) arg2 * Class14_Sub16_Sub1.aFloatArray9[local181] + local86, Class14_Sub16_Sub1.aFloatArray8[local181] * (float) arg2 + local91);
			}
			OpenGL.glVertex2f((float) arg2 + local86, local91);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "()Z")
	@Override
	public boolean method6973() {
		return this.aBoolean573 && (!this.method6898() || this.aBoolean569);
	}

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "(B)V")
	public void method7033() {
		if (this.anInt8063 == 2) {
			return;
		}
		this.method6983();
		this.method6977(false);
		this.method7015(false);
		this.method7050(false);
		this.method7040(false);
		this.method7053(-2);
		this.anInt8063 = 2;
	}

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean554 = arg0;
		this.method7046();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)I")
	public int method7034(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass263_Sub1_3.aFloat127 + (float) arg1 * this.aClass263_Sub1_3.aFloat125 + this.aClass263_Sub1_3.aFloat123 * (float) arg0 + (float) arg2 * this.aClass263_Sub1_3.aFloat124;
		@Pc(55) float local55 = this.aClass263_Sub1_3.aFloat127 + this.aClass263_Sub1_3.aFloat124 * (float) arg5 + (float) arg4 * this.aClass263_Sub1_3.aFloat125 + this.aClass263_Sub1_3.aFloat123 * (float) arg3;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt8068 > local30 && local55 < (float) this.anInt8068) {
			local57 |= 0x10;
		} else if ((float) this.anInt8077 < local30 && (float) this.anInt8077 < local55) {
			local57 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((float) this.anInt8073 * (this.aClass263_Sub1_3.aFloat131 * (float) arg2 + (float) arg1 * this.aClass263_Sub1_3.aFloat133 + this.aClass263_Sub1_3.aFloat126 * (float) arg0 + this.aClass263_Sub1_3.aFloat130) / (float) arg6);
		@Pc(163) int local163 = (int) ((float) this.anInt8073 * ((float) arg4 * this.aClass263_Sub1_3.aFloat133 + this.aClass263_Sub1_3.aFloat126 * (float) arg3 + this.aClass263_Sub1_3.aFloat131 * (float) arg5 + this.aClass263_Sub1_3.aFloat130) / (float) arg6);
		if ((float) local130 < this.aFloat155 && (float) local163 < this.aFloat155) {
			local57 |= 0x1;
		} else if (this.aFloat143 < (float) local130 && (float) local163 > this.aFloat143) {
			local57 |= 0x2;
		}
		@Pc(236) int local236 = (int) (((float) arg1 * this.aClass263_Sub1_3.aFloat122 + this.aClass263_Sub1_3.aFloat129 * (float) arg0 + this.aClass263_Sub1_3.aFloat132 * (float) arg2 + this.aClass263_Sub1_3.aFloat128) * (float) this.anInt8092 / (float) arg6);
		@Pc(269) int local269 = (int) ((float) this.anInt8092 * ((float) arg5 * this.aClass263_Sub1_3.aFloat132 + this.aClass263_Sub1_3.aFloat122 * (float) arg4 + (float) arg3 * this.aClass263_Sub1_3.aFloat129 + this.aClass263_Sub1_3.aFloat128) / (float) arg6);
		if ((float) local236 < this.aFloat160 && this.aFloat160 > (float) local269) {
			local57 |= 0x4;
		} else if ((float) local236 > this.aFloat151 && (float) local269 > this.aFloat151) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "(Z)V")
	private void method7035() {
		if (this.aBoolean571 && this.anInt8081 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "()Z")
	@Override
	public boolean method6972() {
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I[Lclient!rfa;)V")
	@Override
	public void method6970(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub18[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass14_Sub18Array6[local7] = arg1[local7];
		}
		this.anInt8069 = arg0;
		if (this.anInt8091 != 1) {
			this.method6998();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6946(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class14_Sub30 local19;
		while (!this.aClass32_48.method591()) {
			local19 = (Class14_Sub30) this.aClass32_48.method579();
			Static174.anIntArray177[local7++] = (int) local19.aLong324;
			this.anInt8059 -= local19.anInt6793;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static174.anIntArray177, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static174.anIntArray177, 0);
			local7 = 0;
		}
		while (!this.aClass32_49.method591()) {
			local19 = (Class14_Sub30) this.aClass32_49.method579();
			Static174.anIntArray177[local7++] = (int) local19.aLong324;
			this.anInt8060 -= local19.anInt6793;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static174.anIntArray177, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static174.anIntArray177, 0);
			local7 = 0;
		}
		while (!this.aClass32_50.method591()) {
			local19 = (Class14_Sub30) this.aClass32_50.method579();
			Static174.anIntArray177[local7++] = local19.anInt6793;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static174.anIntArray177, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static174.anIntArray177, 0);
			local7 = 0;
		}
		while (!this.aClass32_51.method591()) {
			local19 = (Class14_Sub30) this.aClass32_51.method579();
			Static174.anIntArray177[local7++] = (int) local19.aLong324;
			this.anInt8058 -= local19.anInt6793;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static174.anIntArray177, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static174.anIntArray177, 0);
		}
		while (!this.aClass32_47.method591()) {
			local19 = (Class14_Sub30) this.aClass32_47.method579();
			OpenGL.glDeleteLists((int) local19.aLong324, local19.anInt6793);
		}
		@Pc(220) Class14 local220;
		while (!this.aClass32_52.method591()) {
			local220 = this.aClass32_52.method579();
			OpenGL.glDeleteProgramARB((int) local220.aLong324);
		}
		while (!this.aClass32_53.method591()) {
			local220 = this.aClass32_53.method579();
			OpenGL.glDeleteObjectARB(local220.aLong324);
		}
		while (!this.aClass32_47.method591()) {
			local19 = (Class14_Sub30) this.aClass32_47.method579();
			OpenGL.glDeleteLists((int) local19.aLong324, local19.anInt6793);
		}
		this.aClass111_1.method2234();
		if (this.E() > 100663296 && Static26.method382() > this.aLong215 + 60000L) {
			System.gc();
			this.aLong215 = Static26.method382();
		}
		this.anInt8054 = local11;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IFF)V")
	public void method7036(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat156 = arg1;
		this.aFloat153 = arg0;
		this.method7031();
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method6969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7008();
		this.method7054(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(24) float local24 = (float) -arg1 + (float) arg3;
		if (local17 == 0.0F && local24 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(51) float local51 = (float) (1.0D / Math.sqrt((double) (local24 * local24 + local17 * local17)));
			local24 *= local51;
			local17 *= local51;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local17 + (float) arg2 + 0.35F, local24 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pi", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt8097;
		this.anInt8097 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZII[BI)Lclient!ku;")
	public Interface12 method7037(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		return (Interface12) (this.aBoolean560 && (!arg0 || this.aBoolean579) ? new Class235_Sub1(this, arg1, arg2, arg3, arg0) : new Class86_Sub1(this, arg1, arg2, arg3));
	}

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.aClass263_Sub1_3.aFloat124 + this.aClass263_Sub1_3.aFloat125 * (float) arg1 + this.aClass263_Sub1_3.aFloat123 * (float) arg0 + this.aClass263_Sub1_3.aFloat127;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(78) int local78 = (int) (((float) arg0 * this.aClass263_Sub1_3.aFloat126 + this.aClass263_Sub1_3.aFloat133 * (float) arg1 + (float) arg2 * this.aClass263_Sub1_3.aFloat131 + this.aClass263_Sub1_3.aFloat130) * (float) this.anInt8073 / local28);
		@Pc(110) int local110 = (int) ((this.aClass263_Sub1_3.aFloat129 * (float) arg0 + this.aClass263_Sub1_3.aFloat122 * (float) arg1 + (float) arg2 * this.aClass263_Sub1_3.aFloat132 + this.aClass263_Sub1_3.aFloat128) * (float) this.anInt8092 / local28);
		arg3[0] = (int) ((float) local78 - this.aFloat155);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local110 - this.aFloat160);
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "(B)V")
	private void method7038() {
		OpenGL.glViewport(this.anInt8093, this.anInt8088, this.anInt7855, this.anInt7942);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(FFFBF)V")
	public void method7039(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static42.aFloatArray41[1] = arg2;
		Static42.aFloatArray41[2] = arg3;
		Static42.aFloatArray41[0] = arg1;
		Static42.aFloatArray41[3] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static42.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6888(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas10 == arg0) {
			local5 = this.aLong213;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(31) Long local31 = (Long) this.aHashtable6.get(arg0);
			local5 = local31;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas11 == arg0) {
			this.method6975();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZB)V")
	public void method7040(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean551) {
			this.aBoolean551 = arg0;
			this.method7046();
			this.anInt8063 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "()Lclient!rd;")
	@Override
	public Class263 method6914() {
		return new Class263_Sub1();
	}

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "()Lclient!bg;")
	@Override
	public Class35 method6960() {
		@Pc(7) int local7 = -1;
		if (this.aString91.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString91.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString91.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class35(local7, "OpenGL", this.anInt8087, this.aString90, 0L);
	}

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "()Z")
	@Override
	public boolean method6898() {
		return this.aClass14_Sub5_Sub1_1 != null && this.aClass14_Sub5_Sub1_1.method5487();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!tja;[Lclient!oe;Z)Lclient!da;")
	@Override
	public Class68 method6958(@OriginalArg(0) Class350 arg0, @OriginalArg(1) Class266[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class68_Sub4(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!tca;)V")
	@Override
	public void method6891(@OriginalArg(0) Interface22 arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "()I")
	@Override
	public int method6926() {
		return 4;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZZII)V")
	public void method7042(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8075 != arg2 || this.aBoolean577 != this.aBoolean559) {
			@Pc(16) Class161_Sub1 local16 = null;
			@Pc(18) int local18 = 0;
			@Pc(20) byte local20 = 0;
			@Pc(22) int local22 = 0;
			@Pc(30) int local30 = this.aBoolean559 ? 3 : 0;
			if (arg2 < 0) {
				this.method6994();
			} else {
				local16 = this.aClass111_1.method2236(arg2);
				@Pc(44) Class69 local44 = super.anInterface4_12.method8975(arg2);
				if (local44.aByte23 == 0 && local44.aByte24 == 0) {
					this.method6994();
				} else {
					@Pc(65) int local65 = local44.aBoolean113 ? 64 : 128;
					@Pc(69) int local69 = local65 * 50;
					this.method7014((float) (this.anInt8054 % local69 * local44.aByte24) / (float) local69, 0.0F, (float) (local44.aByte23 * (this.anInt8054 % local69)) / (float) local69);
				}
				if (!this.aBoolean559) {
					local20 = local44.aByte18;
					local22 = local44.anInt1677;
					local30 = local44.aByte19;
				}
				local18 = local44.anInt1680;
			}
			this.aClass313_1.method7842(local30, arg1, arg0, local20, local22);
			if (!this.aClass313_1.method7843(local18, local16)) {
				this.method6982(local16);
				this.method6988(local18);
			}
			this.anInt8075 = arg2;
			this.aBoolean577 = this.aBoolean559;
		}
		this.anInt8063 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!pi", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean559 = false;
	}

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "(II)V")
	public void method7043(@OriginalArg(0) int arg0) {
		Static42.aFloatArray41[3] = (float) (arg0 >>> 24) / 255.0F;
		Static42.aFloatArray41[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static42.aFloatArray41[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static42.aFloatArray41[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static42.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Lclient!bj;")
	@Override
	public Interface3 method6963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "(I)V")
	private void method7044() {
		if (this.aBoolean568 && !this.aBoolean562) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([IIIIIZ)Lclient!fia;")
	@Override
	public Class45 method6935(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class45_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "()Z")
	@Override
	public boolean method6944() {
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 > this.anInt7942) {
			arg3 = this.anInt7942;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt7855 < arg2) {
			arg2 = this.anInt7855;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt8079 = arg3;
		this.anInt8084 = arg0;
		this.anInt8083 = arg1;
		this.anInt8072 = arg2;
		OpenGL.glEnable(3089);
		this.method6996();
		this.method7055();
	}

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "()Z")
	@Override
	public boolean method6924() {
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!qv;)V")
	@Override
	public void method6903(@OriginalArg(0) Class304 arg0) {
		this.aClass311_1.method7808(-1, arg0, this);
	}

	@OriginalMember(owner = "client!pi", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt8066, this.anInt8078, this.anInt8073, this.anInt8092 };
	}

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "(I)V")
	private void method7045() {
		if (this.anInt8091 != 2) {
			this.anInt8091 = 2;
			this.method7026();
			this.method7057();
			this.anInt8063 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!pi", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt8079 = this.anInt7942;
		this.anInt8072 = this.anInt7855;
		this.anInt8084 = 0;
		this.anInt8083 = 0;
		OpenGL.glDisable(3089);
		this.method6996();
	}

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "(I)V")
	private void method7046() {
		OpenGL.glDepthMask(this.aBoolean551 && this.aBoolean554);
	}

	@OriginalMember(owner = "client!pi", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt8077;
	}

	@OriginalMember(owner = "client!pi", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt8095 && this.anInt8081 == arg1 && arg2 == this.anInt8082) {
			return;
		}
		this.anInt8082 = arg2;
		this.anInt8095 = arg0;
		this.anInt8081 = arg1;
		this.method7031();
		this.method7035();
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(ZB)V")
	public void method7047(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean562) {
			this.aBoolean562 = arg0;
			this.method7044();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class159 method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class159_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "(I)V")
	private void method7048() {
		@Pc(6) float[] local6 = this.aFloatArray62;
		@Pc(18) float local18 = (float) (-this.anInt8066 * this.anInt8068) / (float) this.anInt8073;
		@Pc(32) float local32 = (float) (this.anInt8068 * (this.anInt7855 - this.anInt8066)) / (float) this.anInt8073;
		@Pc(43) float local43 = (float) (this.anInt8068 * this.anInt8078) / (float) this.anInt8092;
		@Pc(57) float local57 = (float) ((this.anInt8078 - this.anInt7942) * this.anInt8068) / (float) this.anInt8092;
		if (local18 == local32 || local43 == local57) {
			local6[0] = 1.0F;
			local6[4] = 0.0F;
			local6[7] = 0.0F;
			local6[9] = 0.0F;
			local6[5] = 1.0F;
			local6[15] = 1.0F;
			local6[2] = 0.0F;
			local6[13] = 0.0F;
			local6[3] = 0.0F;
			local6[11] = 0.0F;
			local6[6] = 0.0F;
			local6[1] = 0.0F;
			local6[8] = 0.0F;
			local6[10] = 1.0F;
			local6[14] = 0.0F;
			local6[12] = 0.0F;
		} else {
			@Pc(146) float local146 = (float) this.anInt8068 * 2.0F;
			local6[0] = local146 / (local32 - local18);
			local6[7] = 0.0F;
			local6[12] = 0.0F;
			local6[10] = this.aFloat158 = (float) -(this.anInt8068 + this.anInt8077) / (float) (this.anInt8077 - this.anInt8068);
			local6[11] = -1.0F;
			local6[5] = local146 / (local43 - local57);
			local6[9] = (local57 + local43) / (-local57 + local43);
			local6[2] = 0.0F;
			local6[1] = 0.0F;
			local6[15] = 0.0F;
			local6[6] = 0.0F;
			local6[4] = 0.0F;
			local6[13] = 0.0F;
			local6[3] = 0.0F;
			local6[8] = (local18 + local32) / (local32 - local18);
			local6[14] = this.aFloat157 = -(local146 * (float) this.anInt8077) / (float) (this.anInt8077 - this.anInt8068);
		}
		this.method7012();
	}

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt8068;
	}

	@OriginalMember(owner = "client!pi", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7008();
		this.method7054(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "()V")
	@Override
	public void method6950() {
	}

	@OriginalMember(owner = "client!pi", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt8079;
		arg0[0] = this.anInt8084;
		arg0[2] = this.anInt8072;
		arg0[1] = this.anInt8083;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BZ)V")
	public void method7050(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean552 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean552 = arg0;
		this.anInt8063 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)I")
	public int method7051(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "()Z")
	@Override
	public boolean method6955() {
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBI)V")
	public void method7052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8093 = arg1;
		this.anInt8088 = arg0;
		this.method7038();
		this.method7055();
	}

	@OriginalMember(owner = "client!pi", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt7942 - local12 - arg1, arg2, 1, 32993, this.anInt8089, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "(II)V")
	public void method7053(@OriginalArg(1) int arg0) {
		this.method7009(true, arg0);
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(II)V")
	public void method7054(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt8062) {
			return;
		}
		@Pc(17) boolean local17;
		@Pc(19) byte local19;
		if (arg0 == 1) {
			local17 = true;
			local19 = 1;
		} else if (arg0 == 2) {
			local17 = false;
			local19 = 2;
		} else if (arg0 == 128) {
			local19 = 3;
			local17 = true;
		} else {
			local19 = 0;
			local17 = false;
		}
		if (!this.aBoolean550) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean550 = true;
		}
		if (local17 != this.aBoolean553) {
			if (local17) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean553 = local17;
		}
		if (local19 != this.anInt8061) {
			if (local19 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local19 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local19 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt8061 = local19;
		}
		this.anInt8063 &= 0xFFFFFFE3;
		this.anInt8062 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "(I)V")
	private void method7055() {
		if (this.anInt8084 <= this.anInt8072 && this.anInt8079 >= this.anInt8083) {
			OpenGL.glScissor(this.anInt8084 + this.anInt8093, this.anInt7942 + this.anInt8088 + -this.anInt8079, this.anInt8072 - this.anInt8084, -this.anInt8083 + this.anInt8079);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "(II)V")
	public synchronized void method7056(@OriginalArg(1) int arg0) {
		@Pc(8) Class14_Sub30 local8 = new Class14_Sub30(arg0);
		this.aClass32_50.method582(local8);
	}

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "()Z")
	@Override
	public boolean method6920() {
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(Z)V")
	private void method7057() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass263_Sub1_4.method6419(), 0);
		if (this.aBoolean577) {
			this.aClass313_1.aClass38_Sub1_1.method712();
		}
		this.method7023();
		this.method6998();
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(II)V")
	@Override
	public void method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < this.anInt8079) {
			this.anInt8079 = arg3;
		}
		if (this.anInt8083 < arg1) {
			this.anInt8083 = arg1;
		}
		if (arg0 > this.anInt8084) {
			this.anInt8084 = arg0;
		}
		if (this.anInt8072 > arg2) {
			this.anInt8072 = arg2;
		}
		OpenGL.glEnable(3089);
		this.method6996();
		this.method7055();
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)V")
	@Override
	public void method6931() {
	}

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "()Z")
	@Override
	public boolean method6966() {
		return true;
	}
}
