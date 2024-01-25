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

@OriginalClass("client!aq")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!aq", name = "Bd", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!aq", name = "I", descriptor = "I")
	public int anInt833;

	@OriginalMember(owner = "client!aq", name = "pb", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!aq", name = "jb", descriptor = "I")
	public int anInt973;

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
	public int anInt995;

	@OriginalMember(owner = "client!aq", name = "cg", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!aq", name = "md", descriptor = "Lclient!cb;")
	private Class52 aClass52_1;

	@OriginalMember(owner = "client!aq", name = "Pb", descriptor = "Lclient!sba;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!aq", name = "tf", descriptor = "Lclient!jb;")
	private Class178_Sub2 aClass178_Sub2_1;

	@OriginalMember(owner = "client!aq", name = "Cb", descriptor = "Lclient!sba;")
	private Interface20 anInterface20_2;

	@OriginalMember(owner = "client!aq", name = "ae", descriptor = "I")
	public int anInt999;

	@OriginalMember(owner = "client!aq", name = "Cd", descriptor = "I")
	public int anInt1000;

	@OriginalMember(owner = "client!aq", name = "jh", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!aq", name = "fe", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!aq", name = "sd", descriptor = "Z")
	private boolean aBoolean52;

	@OriginalMember(owner = "client!aq", name = "Id", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!aq", name = "te", descriptor = "Z")
	private boolean aBoolean53;

	@OriginalMember(owner = "client!aq", name = "A", descriptor = "Z")
	private boolean aBoolean54;

	@OriginalMember(owner = "client!aq", name = "Mc", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!aq", name = "yc", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!aq", name = "ie", descriptor = "Z")
	private boolean aBoolean55;

	@OriginalMember(owner = "client!aq", name = "N", descriptor = "Z")
	public boolean aBoolean56;

	@OriginalMember(owner = "client!aq", name = "Z", descriptor = "I")
	public int anInt1007;

	@OriginalMember(owner = "client!aq", name = "lf", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!aq", name = "Ae", descriptor = "Z")
	private boolean aBoolean57;

	@OriginalMember(owner = "client!aq", name = "bb", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!aq", name = "ig", descriptor = "I")
	public int anInt1009;

	@OriginalMember(owner = "client!aq", name = "bh", descriptor = "F")
	private float aFloat10;

	@OriginalMember(owner = "client!aq", name = "nc", descriptor = "Z")
	public boolean aBoolean58;

	@OriginalMember(owner = "client!aq", name = "Wg", descriptor = "Z")
	public boolean aBoolean60;

	@OriginalMember(owner = "client!aq", name = "Sg", descriptor = "Lclient!vt;")
	private Class125_Sub1_Sub1 aClass125_Sub1_Sub1_1;

	@OriginalMember(owner = "client!aq", name = "yb", descriptor = "Z")
	private boolean aBoolean61;

	@OriginalMember(owner = "client!aq", name = "fd", descriptor = "Z")
	private boolean aBoolean62;

	@OriginalMember(owner = "client!aq", name = "Ce", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!aq", name = "z", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!aq", name = "Ie", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!aq", name = "Kf", descriptor = "Z")
	private boolean aBoolean63;

	@OriginalMember(owner = "client!aq", name = "pd", descriptor = "I")
	public int anInt1012;

	@OriginalMember(owner = "client!aq", name = "T", descriptor = "Lclient!cb;")
	public Class52 aClass52_2;

	@OriginalMember(owner = "client!aq", name = "ke", descriptor = "F")
	private float aFloat15;

	@OriginalMember(owner = "client!aq", name = "Zb", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!aq", name = "Tc", descriptor = "Lclient!fu;")
	public Class125_Sub1 aClass125_Sub1_1;

	@OriginalMember(owner = "client!aq", name = "Wc", descriptor = "Z")
	private boolean aBoolean65;

	@OriginalMember(owner = "client!aq", name = "Te", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!aq", name = "Pf", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!aq", name = "Nd", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!aq", name = "db", descriptor = "Z")
	public boolean aBoolean68;

	@OriginalMember(owner = "client!aq", name = "Vb", descriptor = "Lclient!lm;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "client!aq", name = "Dc", descriptor = "Lclient!pe;")
	public Class287 aClass287_1;

	@OriginalMember(owner = "client!aq", name = "wc", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!aq", name = "Ec", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!aq", name = "ef", descriptor = "I")
	public int anInt1021;

	@OriginalMember(owner = "client!aq", name = "Cc", descriptor = "Z")
	public boolean aBoolean71;

	@OriginalMember(owner = "client!aq", name = "Vc", descriptor = "Z")
	public boolean aBoolean72;

	@OriginalMember(owner = "client!aq", name = "Yf", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!aq", name = "ee", descriptor = "[Lclient!rha;")
	private Class125[] aClass125Array1;

	@OriginalMember(owner = "client!aq", name = "Ue", descriptor = "Z")
	public boolean aBoolean73;

	@OriginalMember(owner = "client!aq", name = "rb", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!aq", name = "Me", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!aq", name = "kb", descriptor = "Z")
	private boolean aBoolean74;

	@OriginalMember(owner = "client!aq", name = "O", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!aq", name = "jf", descriptor = "Lclient!wg;")
	private Class113_Sub2 aClass113_Sub2_1;

	@OriginalMember(owner = "client!aq", name = "Wd", descriptor = "Z")
	public boolean aBoolean76;

	@OriginalMember(owner = "client!aq", name = "ag", descriptor = "Lclient!lm;")
	private Interface13 anInterface13_2;

	@OriginalMember(owner = "client!aq", name = "ih", descriptor = "Lclient!pe;")
	public Class287 aClass287_2;

	@OriginalMember(owner = "client!aq", name = "ec", descriptor = "F")
	private float aFloat26;

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "Lclient!ww;")
	private Interface27 anInterface27_1;

	@OriginalMember(owner = "client!aq", name = "Fc", descriptor = "Z")
	private boolean aBoolean79;

	@OriginalMember(owner = "client!aq", name = "kd", descriptor = "Z")
	public boolean aBoolean80;

	@OriginalMember(owner = "client!aq", name = "dd", descriptor = "Z")
	public boolean aBoolean81;

	@OriginalMember(owner = "client!aq", name = "C", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!aq", name = "nd", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!aq", name = "Gf", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!aq", name = "Yc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!aq", name = "vb", descriptor = "I")
	public int anInt988 = 128;

	@OriginalMember(owner = "client!aq", name = "jd", descriptor = "Lclient!lfa;")
	private final Class225 aClass225_1 = new Class225();

	@OriginalMember(owner = "client!aq", name = "Tg", descriptor = "Lclient!wp;")
	private final Class58_Sub3 aClass58_Sub3_1 = new Class58_Sub3();

	@OriginalMember(owner = "client!aq", name = "Cg", descriptor = "Lclient!wp;")
	public final Class58_Sub3 aClass58_Sub3_2 = new Class58_Sub3();

	@OriginalMember(owner = "client!aq", name = "Ib", descriptor = "I")
	public int anInt993 = 8;

	@OriginalMember(owner = "client!aq", name = "vg", descriptor = "I")
	public int anInt994 = 3;

	@OriginalMember(owner = "client!aq", name = "Uf", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!aq", name = "Xg", descriptor = "Lclient!sja;")
	private final Class342 aClass342_4 = new Class342();

	@OriginalMember(owner = "client!aq", name = "hh", descriptor = "I")
	private int anInt996 = -1;

	@OriginalMember(owner = "client!aq", name = "bg", descriptor = "[Lclient!sba;")
	private final Interface20[] anInterface20Array2 = new Interface20[4];

	@OriginalMember(owner = "client!aq", name = "yf", descriptor = "I")
	private int anInt997 = -1;

	@OriginalMember(owner = "client!aq", name = "hb", descriptor = "I")
	private int anInt998 = -1;

	@OriginalMember(owner = "client!aq", name = "sf", descriptor = "[Lclient!sba;")
	private final Interface20[] anInterface20Array1 = new Interface20[4];

	@OriginalMember(owner = "client!aq", name = "jc", descriptor = "[Lclient!sba;")
	private final Interface20[] anInterface20Array3 = new Interface20[4];

	@OriginalMember(owner = "client!aq", name = "Og", descriptor = "Lclient!sja;")
	private final Class342 aClass342_5;

	@OriginalMember(owner = "client!aq", name = "pc", descriptor = "Lclient!sja;")
	private final Class342 aClass342_6;

	@OriginalMember(owner = "client!aq", name = "mg", descriptor = "Lclient!sja;")
	private final Class342 aClass342_7;

	@OriginalMember(owner = "client!aq", name = "hd", descriptor = "Lclient!sja;")
	private final Class342 aClass342_8;

	@OriginalMember(owner = "client!aq", name = "nh", descriptor = "Lclient!sja;")
	private final Class342 aClass342_9;

	@OriginalMember(owner = "client!aq", name = "ac", descriptor = "Lclient!sja;")
	private final Class342 aClass342_10;

	@OriginalMember(owner = "client!aq", name = "of", descriptor = "Lclient!sja;")
	private final Class342 aClass342_11;

	@OriginalMember(owner = "client!aq", name = "ph", descriptor = "Lclient!wp;")
	public final Class58_Sub3 aClass58_Sub3_3;

	@OriginalMember(owner = "client!aq", name = "Td", descriptor = "Lclient!wp;")
	public final Class58_Sub3 aClass58_Sub3_4;

	@OriginalMember(owner = "client!aq", name = "od", descriptor = "Lclient!wp;")
	public final Class58_Sub3 aClass58_Sub3_5;

	@OriginalMember(owner = "client!aq", name = "oe", descriptor = "F")
	private float aFloat8;

	@OriginalMember(owner = "client!aq", name = "Jg", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!aq", name = "Cf", descriptor = "I")
	public int anInt1006;

	@OriginalMember(owner = "client!aq", name = "fc", descriptor = "[F")
	private final float[] aFloatArray2;

	@OriginalMember(owner = "client!aq", name = "L", descriptor = "Z")
	private boolean aBoolean64;

	@OriginalMember(owner = "client!aq", name = "Rg", descriptor = "F")
	private float aFloat16;

	@OriginalMember(owner = "client!aq", name = "sc", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!aq", name = "zc", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!aq", name = "pe", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!aq", name = "mb", descriptor = "[F")
	public final float[] aFloatArray4;

	@OriginalMember(owner = "client!aq", name = "Kg", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!aq", name = "Zf", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!aq", name = "ed", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!aq", name = "Lg", descriptor = "I")
	public int anInt1018;

	@OriginalMember(owner = "client!aq", name = "ue", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!aq", name = "Xb", descriptor = "[F")
	private final float[] aFloatArray6;

	@OriginalMember(owner = "client!aq", name = "Qg", descriptor = "I")
	public int anInt1020;

	@OriginalMember(owner = "client!aq", name = "se", descriptor = "F")
	private float aFloat11;

	@OriginalMember(owner = "client!aq", name = "Jc", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!aq", name = "Ub", descriptor = "[Lclient!jw;")
	private final Class3_Sub5[] aClass3_Sub5Array1;

	@OriginalMember(owner = "client!aq", name = "fb", descriptor = "[Lclient!tt;")
	public final Class170_Sub3[] aClass170_Sub3Array2;

	@OriginalMember(owner = "client!aq", name = "zg", descriptor = "I")
	public int anInt1023;

	@OriginalMember(owner = "client!aq", name = "Re", descriptor = "[Lclient!tt;")
	public final Class170_Sub3[] aClass170_Sub3Array1;

	@OriginalMember(owner = "client!aq", name = "gd", descriptor = "Z")
	private boolean aBoolean69;

	@OriginalMember(owner = "client!aq", name = "Ug", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!aq", name = "af", descriptor = "I")
	public int anInt1031;

	@OriginalMember(owner = "client!aq", name = "Ob", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!aq", name = "Qe", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!aq", name = "Db", descriptor = "[F")
	private final float[] aFloatArray3;

	@OriginalMember(owner = "client!aq", name = "Qb", descriptor = "I")
	public int anInt1030;

	@OriginalMember(owner = "client!aq", name = "Rd", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!aq", name = "gc", descriptor = "[F")
	private final float[] aFloatArray5;

	@OriginalMember(owner = "client!aq", name = "H", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!aq", name = "x", descriptor = "I")
	public int anInt1027;

	@OriginalMember(owner = "client!aq", name = "ye", descriptor = "I")
	public int anInt1036;

	@OriginalMember(owner = "client!aq", name = "Rc", descriptor = "F")
	private float aFloat27;

	@OriginalMember(owner = "client!aq", name = "eh", descriptor = "I")
	public int anInt1026;

	@OriginalMember(owner = "client!aq", name = "Dg", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!aq", name = "ud", descriptor = "I")
	public int anInt1033;

	@OriginalMember(owner = "client!aq", name = "B", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!aq", name = "ug", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!aq", name = "Dd", descriptor = "F")
	private float aFloat20;

	@OriginalMember(owner = "client!aq", name = "Bc", descriptor = "I")
	public int anInt1035;

	@OriginalMember(owner = "client!aq", name = "Xc", descriptor = "Lclient!dda;")
	public Class3_Sub2_Sub2 aClass3_Sub2_Sub2_1;

	@OriginalMember(owner = "client!aq", name = "Rf", descriptor = "[I")
	public int[] anIntArray53;

	@OriginalMember(owner = "client!aq", name = "Ac", descriptor = "[I")
	public int[] anIntArray54;

	@OriginalMember(owner = "client!aq", name = "Zc", descriptor = "[B")
	public final byte[] aByteArray6;

	@OriginalMember(owner = "client!aq", name = "Ag", descriptor = "[I")
	public int[] anIntArray55;

	@OriginalMember(owner = "client!aq", name = "U", descriptor = "I")
	public final int anInt990;

	@OriginalMember(owner = "client!aq", name = "de", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas2;

	@OriginalMember(owner = "client!aq", name = "Yb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!aq", name = "ld", descriptor = "J")
	private final long aLong24;

	@OriginalMember(owner = "client!aq", name = "J", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!aq", name = "vc", descriptor = "I")
	public final int anInt1038;

	@OriginalMember(owner = "client!aq", name = "V", descriptor = "Z")
	public boolean aBoolean78;

	@OriginalMember(owner = "client!aq", name = "qc", descriptor = "Z")
	private boolean aBoolean67;

	@OriginalMember(owner = "client!aq", name = "Rb", descriptor = "Z")
	public boolean aBoolean77;

	@OriginalMember(owner = "client!aq", name = "Sf", descriptor = "Z")
	public boolean aBoolean70;

	@OriginalMember(owner = "client!aq", name = "pg", descriptor = "Z")
	public boolean aBoolean75;

	@OriginalMember(owner = "client!aq", name = "Ye", descriptor = "Z")
	private boolean aBoolean82;

	@OriginalMember(owner = "client!aq", name = "vd", descriptor = "Z")
	public boolean aBoolean66;

	@OriginalMember(owner = "client!aq", name = "M", descriptor = "Z")
	private final boolean aBoolean59;

	@OriginalMember(owner = "client!aq", name = "bd", descriptor = "Lclient!aw;")
	private final Class28 aClass28_1;

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "Lclient!kb;")
	public final Class204 aClass204_1;

	@OriginalMember(owner = "client!aq", name = "Sb", descriptor = "Lclient!mb;")
	private final Class242 aClass242_1;

	@OriginalMember(owner = "client!aq", name = "Lb", descriptor = "Lclient!gha;")
	private Class3_Sub13_Sub1 aClass3_Sub13_Sub1_1;

	@OriginalMember(owner = "client!aq", name = "rg", descriptor = "Lclient!sg;")
	private final Class339 aClass339_1;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class22_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class147();
		new Class313(16);
		this.aClass342_5 = new Class342();
		this.aClass342_6 = new Class342();
		this.aClass342_7 = new Class342();
		this.aClass342_8 = new Class342();
		this.aClass342_9 = new Class342();
		this.aClass342_10 = new Class342();
		this.aClass342_11 = new Class342();
		this.aClass58_Sub3_3 = new Class58_Sub3();
		this.aClass58_Sub3_4 = new Class58_Sub3();
		this.aClass58_Sub3_5 = new Class58_Sub3();
		this.aFloat8 = 1.0F;
		this.anInt1010 = 8448;
		this.anInt1006 = 50;
		this.aFloatArray2 = new float[16];
		this.aBoolean64 = true;
		this.aFloat16 = -1.0F;
		this.aFloat19 = 1.0F;
		this.aFloat18 = 3584.0F;
		this.anInt1024 = 0;
		this.aFloatArray4 = new float[4];
		this.anInt1022 = -1;
		this.aFloat13 = 3584.0F;
		this.anInt1016 = 0;
		this.anInt1018 = -1;
		this.anInt1025 = 0;
		this.aFloatArray6 = new float[4];
		this.anInt1020 = -1;
		this.aFloat11 = 0.0F;
		this.anInt1005 = 0;
		this.aClass3_Sub5Array1 = new Class3_Sub5[Static326.anInt5315];
		this.aClass170_Sub3Array2 = new Class170_Sub3[7];
		this.anInt1023 = 0;
		this.aClass170_Sub3Array1 = new Class170_Sub3[7];
		this.aBoolean69 = false;
		this.aFloat25 = 1.0F;
		this.anInt1031 = 512;
		this.anInt1034 = 8448;
		this.aFloat22 = -1.0F;
		this.aFloatArray3 = new float[4];
		this.anInt1030 = 512;
		this.aFloat24 = -1.0F;
		this.aFloatArray5 = new float[4];
		this.anInt1032 = 0;
		this.anInt1027 = 0;
		this.anInt1036 = -1;
		this.aFloat27 = -1.0F;
		this.anInt1026 = 0;
		this.anInt1029 = 0;
		this.anInt1033 = -1;
		this.anInt1019 = 3584;
		this.aFloat28 = 1.0F;
		this.aFloat20 = 1.0F;
		this.anInt1035 = 0;
		this.aClass3_Sub2_Sub2_1 = new Class3_Sub2_Sub2(8192);
		this.anIntArray53 = new int[1];
		this.anIntArray54 = new int[1];
		this.aByteArray6 = new byte[16384];
		this.anIntArray55 = new int[1];
		this.anInt990 = arg2;
		this.aCanvas1 = this.aCanvas2 = arg0;
		if (!Static67.method1514("jaclib")) {
			throw new RuntimeException("");
		} else if (Static67.method1514("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong22 = this.aLong24 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt990);
				if (this.aLong24 == 0L) {
					throw new RuntimeException("");
				}
				this.method897();
				@Pc(347) int local347 = this.method953();
				if (local347 != 0) {
					throw new RuntimeException("");
				}
				this.anInt1038 = this.aBoolean60 ? 33639 : 5121;
				if (this.aString8.indexOf("radeon") != -1) {
					@Pc(375) int local375 = 0;
					@Pc(377) boolean local377 = false;
					@Pc(379) boolean local379 = false;
					@Pc(388) String[] local388 = Static104.method2099(this.aString8.replace('/', ' '), ' ');
					for (@Pc(390) int local390 = 0; local390 < local388.length; local390++) {
						@Pc(396) String local396 = local388[local390];
						try {
							if (local396.length() > 0) {
								if (local396.charAt(0) == 'x' && local396.length() >= 3 && Static473.method6432(local396.substring(1, 3))) {
									local379 = true;
									local396 = local396.substring(1);
								}
								if (local396.equals("hd")) {
									local377 = true;
								} else {
									if (local396.startsWith("hd")) {
										local396 = local396.substring(2);
										local377 = true;
									}
									if (local396.length() >= 4 && Static473.method6432(local396.substring(0, 4))) {
										local375 = Static636.method8390(local396.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(475) Exception local475) {
						}
					}
					if (!local379 && !local377) {
						if (local375 >= 7000 && local375 <= 9250) {
							this.aBoolean78 = false;
						}
						if (local375 >= 7000 && local375 <= 7999) {
							this.aBoolean67 = false;
						}
					}
					if (!local377 || local375 < 4000) {
						this.aBoolean77 = false;
					}
					this.aBoolean70 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean75 = true;
					this.aBoolean82 = this.aBoolean67;
				}
				if (this.aString9.indexOf("intel") != -1) {
					this.aBoolean66 = false;
				}
				this.aBoolean59 = !this.aString9.equals("s3 graphics");
				if (this.aBoolean67) {
					try {
						@Pc(586) int[] local586 = new int[1];
						OpenGL.glGenBuffersARB(1, local586, 0);
					} catch (@Pc(592) Throwable local592) {
						throw new RuntimeException("");
					}
				}
				Static633.method8323(true, false);
				this.aBoolean51 = true;
				this.aClass28_1 = new Class28(this, super.anInterface4_14);
				this.method904();
				this.aClass204_1 = new Class204(this);
				this.aClass242_1 = new Class242(this);
				if (this.aClass242_1.method5351()) {
					this.aClass3_Sub13_Sub1_1 = new Class3_Sub13_Sub1(this);
					if (!this.aClass3_Sub13_Sub1_1.method3141()) {
						this.aClass3_Sub13_Sub1_1.method3128();
						this.aClass3_Sub13_Sub1_1 = null;
					}
				}
				this.aClass339_1 = new Class339(this);
				this.method938();
				this.method887();
				this.method9389();
			} catch (@Pc(670) Throwable local670) {
				local670.printStackTrace();
				this.method9339();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!aq", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1005 > arg3) {
			this.anInt1005 = arg3;
		}
		if (arg2 < this.anInt1024) {
			this.anInt1024 = arg2;
		}
		if (arg0 > this.anInt1032) {
			this.anInt1032 = arg0;
		}
		if (this.anInt1016 < arg1) {
			this.anInt1016 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method924();
		this.method916();
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(Z)V")
	private void method887() {
		if (this.aCanvas1 == null) {
			this.anInt818 = this.anInt868 = 0;
		} else {
			@Pc(20) Dimension local20 = this.aCanvas1.getSize();
			this.anInt818 = local20.width;
			this.anInt868 = local20.height;
		}
		if (this.anInterface20_2 == null) {
			this.anInt973 = this.anInt818;
			this.anInt833 = this.anInt868;
			this.method960();
		}
		this.method893();
		this.la();
	}

	@OriginalMember(owner = "client!aq", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass58_Sub3_3.aFloat205 + this.aClass58_Sub3_3.aFloat204 * (float) arg0 + (float) arg1 * this.aClass58_Sub3_3.aFloat207 + (float) arg2 * this.aClass58_Sub3_3.aFloat200;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass58_Sub3_3.aFloat205 + (float) arg5 * this.aClass58_Sub3_3.aFloat200 + this.aClass58_Sub3_3.aFloat207 * (float) arg4 + this.aClass58_Sub3_3.aFloat204 * (float) arg3;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt1006 > local32 && local63 < (float) this.anInt1006) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt1019 && (float) this.anInt1019 < local63) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) (((float) arg2 * this.aClass58_Sub3_3.aFloat201 + (float) arg0 * this.aClass58_Sub3_3.aFloat198 + (float) arg1 * this.aClass58_Sub3_3.aFloat199 + this.aClass58_Sub3_3.aFloat209) * (float) this.anInt1031 / local32);
		@Pc(173) int local173 = (int) ((float) this.anInt1031 * (this.aClass58_Sub3_3.aFloat209 + (float) arg4 * this.aClass58_Sub3_3.aFloat199 + this.aClass58_Sub3_3.aFloat198 * (float) arg3 + (float) arg5 * this.aClass58_Sub3_3.aFloat201) / local63);
		if (this.aFloat14 > (float) local141 && this.aFloat14 > (float) local173) {
			local7 |= 0x1;
		} else if ((float) local141 > this.aFloat9 && this.aFloat9 < (float) local173) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) ((this.aClass58_Sub3_3.aFloat203 * (float) arg2 + (float) arg1 * this.aClass58_Sub3_3.aFloat202 + (float) arg0 * this.aClass58_Sub3_3.aFloat206 + this.aClass58_Sub3_3.aFloat208) * (float) this.anInt1030 / local32);
		@Pc(277) int local277 = (int) ((this.aClass58_Sub3_3.aFloat208 + this.aClass58_Sub3_3.aFloat203 * (float) arg5 + (float) arg3 * this.aClass58_Sub3_3.aFloat206 + this.aClass58_Sub3_3.aFloat202 * (float) arg4) * (float) this.anInt1030 / local63);
		if ((float) local245 < this.aFloat12 && this.aFloat12 > (float) local277) {
			local7 |= 0x4;
		} else if ((float) local245 > this.aFloat17 && (float) local277 > this.aFloat17) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "()Z")
	@Override
	public boolean method9340() {
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(II)I")
	@Override
	public int method9375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(II)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!aq", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method964(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "()Z")
	@Override
	public boolean method9406() {
		return false;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([IIIIIZ)Lclient!kw;")
	@Override
	public Class178 method9322(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class178_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!lm;)V")
	public void method888(@OriginalArg(1) Interface13 arg0) {
		if (this.anInterface13_1 != arg0) {
			if (this.aBoolean67) {
				OpenGL.glBindBufferARB(34962, arg0.method4052());
			}
			this.anInterface13_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZZIZ)V")
	public void method889(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt1037 != arg1 || this.aBoolean69 != this.aBoolean81) {
			@Pc(25) Class125_Sub1 local25 = null;
			@Pc(27) int local27 = 0;
			@Pc(29) byte local29 = 0;
			@Pc(31) int local31 = 0;
			@Pc(39) int local39 = this.aBoolean81 ? 3 : 0;
			if (arg1 < 0) {
				this.method968();
			} else {
				local25 = this.aClass28_1.method1035(arg1);
				@Pc(53) Class406 local53 = super.anInterface4_14.method5761(arg1);
				if (local53.aByte145 == 0 && local53.aByte150 == 0) {
					this.method968();
				} else {
					@Pc(84) int local84 = local53.aBoolean762 ? 64 : 128;
					@Pc(88) int local88 = local84 * 50;
					this.method910((float) (this.anInt995 % local88 * local53.aByte145) / (float) local88, 0.0F, (float) (this.anInt995 % local88 * local53.aByte150) / (float) local88);
				}
				local27 = local53.anInt11144;
				if (!this.aBoolean81) {
					local39 = local53.aByte149;
					local31 = local53.anInt11146;
					local29 = local53.aByte147;
				}
			}
			this.aClass339_1.method7583(local39, arg0, arg2, local31, local29);
			if (!this.aClass339_1.method7581(local25, local27)) {
				this.method955(local25);
				this.method894(local27);
			}
			this.anInt1037 = arg1;
			this.aBoolean69 = this.aBoolean81;
		}
		this.anInt1002 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V")
	private void method890() {
		if (this.aBoolean65 && this.anInt1020 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(ILclient!sba;)V")
	public void method891(@OriginalArg(1) Interface20 arg0) {
		if (this.anInt996 < 0 || arg0 != this.anInterface20Array3[this.anInt996]) {
			throw new RuntimeException();
		}
		this.anInterface20Array3[this.anInt996--] = null;
		arg0.method1502();
		if (this.anInt996 < 0) {
			this.anInterface20_1 = null;
		} else {
			this.anInterface20_1 = this.anInterface20Array3[this.anInt996];
			this.anInterface20_1.method1505();
		}
	}

	@OriginalMember(owner = "client!aq", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat21 != arg0) {
			this.aFloat21 = arg0;
			this.method930();
		}
	}

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "(B)V")
	private void method892() {
		this.anOpenGL1.a();
	}

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "(I)V")
	public void method893() {
		if (this.anInt1015 != 0) {
			this.anInt1002 &= 0xFFFFFFE0;
			this.anInt1015 = 0;
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(BI)V")
	public void method894(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method900(7681, 7681);
		} else if (arg0 == 0) {
			this.method900(8448, 8448);
		} else if (arg0 == 2) {
			this.method900(7681, 34165);
		} else if (arg0 == 3) {
			this.method900(8448, 260);
		} else if (arg0 == 4) {
			this.method900(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(FFFBF)V")
	public void method895(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static605.aFloatArray56[0] = arg3;
		Static605.aFloatArray56[1] = arg2;
		Static605.aFloatArray56[3] = arg1;
		Static605.aFloatArray56[2] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static605.aFloatArray56, 0);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BZ[BII)Lclient!ww;")
	public Interface27 method896(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2) {
		return (Interface27) (this.aBoolean67 && (!arg0 || this.aBoolean82) ? new Class116_Sub2(this, 5123, arg1, arg2, arg0) : new Class188_Sub2(this, 5123, arg1, arg2));
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!si;Lclient!es;)Lclient!vv;")
	@Override
	public Interface25 method9359(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Interface8 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method9390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		@Pc(26) Class1_Sub2 local26 = (Class1_Sub2) arg5;
		@Pc(29) Class125_Sub1_Sub1 local29 = local26.aClass125_Sub1_Sub1_2;
		this.method926();
		this.method955(local26.aClass125_Sub1_Sub1_2);
		this.method964(1);
		this.method900(8448, 7681);
		this.method935(768, 0, 34167);
		@Pc(59) float local59 = local29.aFloat197 / (float) local29.anInt10870;
		@Pc(66) float local66 = local29.aFloat196 / (float) local29.anInt10869;
		@Pc(73) float local73 = (float) -arg0 + (float) arg2;
		@Pc(80) float local80 = (float) -arg1 + (float) arg3;
		@Pc(93) float local93 = (float) (1.0D / Math.sqrt((double) (local73 * local73 + local80 * local80)));
		@Pc(97) float local97 = local73 * local93;
		@Pc(103) int local103 = arg10 % (arg9 + arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(122) float local122 = local80 * local93;
		@Pc(127) float local127 = local97 * (float) arg8;
		@Pc(132) float local132 = (float) arg8 * local122;
		@Pc(134) float local134 = 0.0F;
		@Pc(136) float local136 = 0.0F;
		@Pc(138) float local138 = local127;
		@Pc(140) float local140 = local132;
		if (arg8 >= local103) {
			local138 = local97 * (float) (arg8 - local103);
			local140 = local122 * (float) (arg8 - local103);
		} else {
			local136 = local122 * (float) (arg8 + arg9 - local103);
			local134 = (float) (arg9 + arg8 - local103) * local97;
		}
		@Pc(191) float local191 = (float) arg0 + local134 + 0.35F;
		@Pc(198) float local198 = (float) arg1 + local136 + 0.35F;
		@Pc(203) float local203 = local97 * (float) arg9;
		@Pc(208) float local208 = (float) arg9 * local122;
		while (true) {
			if (arg0 >= arg2) {
				if (local191 < (float) arg2 + 0.35F) {
					break;
				}
				if (local138 + local191 < (float) arg2) {
					local138 = (float) arg2 - local191;
				}
			} else {
				if ((float) arg2 + 0.35F < local191) {
					break;
				}
				if (local191 + local138 > (float) arg2) {
					local138 = (float) arg2 - local191;
				}
			}
			if (arg1 < arg3) {
				if (local198 > (float) arg3 + 0.35F) {
					break;
				}
				if (local140 + local198 > (float) arg3) {
					local140 = (float) arg3 - local198;
				}
			} else {
				if (local198 < (float) arg3 + 0.35F) {
					break;
				}
				if (local140 + local198 < (float) arg3) {
					local140 = (float) arg3 - local198;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(((float) -arg6 + local191) * local59, ((float) -arg7 + local198) * local66);
			OpenGL.glVertex2f(local191, local198);
			OpenGL.glTexCoord2f(local59 * (local191 + local138 - (float) arg6), (local140 + local198 - (float) arg7) * local66);
			OpenGL.glVertex2f(local191 + local138, local198 + local140);
			local191 += local138 + local203;
			local198 += local208 + local140;
			OpenGL.glEnd();
			local138 = local127;
			local140 = local132;
		}
		this.method935(768, 0, 5890);
	}

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "(I)V")
	private void method897() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL1.b()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static550.method7219(1000L);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ih;Lclient!ih;FLclient!ih;)Lclient!ih;")
	@Override
	public Class113 method9334(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class113 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean72 && this.aBoolean66) {
			@Pc(21) Class113_Sub2_Sub1 local21 = null;
			@Pc(24) Class113_Sub2 local24 = (Class113_Sub2) arg0;
			@Pc(27) Class113_Sub2 local27 = (Class113_Sub2) arg1;
			@Pc(31) Class125_Sub2 local31 = local24.method4897();
			@Pc(35) Class125_Sub2 local35 = local27.method4897();
			if (local31 != null && local35 != null) {
				@Pc(59) int local59 = local35.anInt4082 >= local31.anInt4082 ? local35.anInt4082 : local31.anInt4082;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class113_Sub2_Sub1) {
					@Pc(75) Class113_Sub2_Sub1 local75 = (Class113_Sub2_Sub1) arg3;
					if (local75.method3248() == local59) {
						local21 = local75;
					}
				}
				if (local21 == null) {
					local21 = new Class113_Sub2_Sub1(this, local59);
				}
				if (local21.method3250(arg2, local31, local35)) {
					return local21;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLclient!sba;)V")
	public void method898(@OriginalArg(1) Interface20 arg0) {
		if (this.anInt996 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt996 >= 0) {
			this.anInterface20Array3[this.anInt996].method1502();
		}
		this.anInterface20_1 = this.anInterface20Array3[++this.anInt996] = arg0;
		this.anInterface20_1.method1505();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZIZ)V")
	public void method899(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		this.method889(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "(I)V")
	@Override
	public void method9338(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt988 = arg0;
		this.aClass28_1.method1032();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)Lclient!si;")
	@Override
	public Interface23 method9381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aq", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg0 * this.aClass58_Sub3_3.aFloat204 + this.aClass58_Sub3_3.aFloat207 * (float) arg1 + this.aClass58_Sub3_3.aFloat200 * (float) arg2 + this.aClass58_Sub3_3.aFloat205;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(78) int local78 = (int) ((float) this.anInt1031 * (this.aClass58_Sub3_3.aFloat209 + this.aClass58_Sub3_3.aFloat199 * (float) arg1 + this.aClass58_Sub3_3.aFloat198 * (float) arg0 + this.aClass58_Sub3_3.aFloat201 * (float) arg2) / local28);
		arg3[0] = (int) ((float) local78 - this.aFloat14);
		@Pc(119) int local119 = (int) ((this.aClass58_Sub3_3.aFloat203 * (float) arg2 + (float) arg1 * this.aClass58_Sub3_3.aFloat202 + (float) arg0 * this.aClass58_Sub3_3.aFloat206 + this.aClass58_Sub3_3.aFloat208) * (float) this.anInt1030 / local28);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local119 - this.aFloat12);
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(III)V")
	public void method900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1013 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(15) boolean local15 = false;
		if (arg1 != this.anInt1034) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt1034 = arg1;
			local15 = true;
		}
		if (arg0 != this.anInt1010) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			this.anInt1010 = arg0;
			local15 = true;
		}
		if (local15) {
			this.anInt1002 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ih;)V")
	@Override
	public void method9333(@OriginalArg(0) Class113 arg0) {
		this.aClass113_Sub2_1 = (Class113_Sub2) arg0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIZ)Lclient!kw;")
	@Override
	public Class178 method9361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class178_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aq", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1036 == arg0 && arg1 == this.anInt1020 && this.anInt1026 == arg2) {
			return;
		}
		this.anInt1026 = arg2;
		this.anInt1036 = arg0;
		this.anInt1020 = arg1;
		this.method911();
		this.method890();
	}

	@OriginalMember(owner = "client!aq", name = "A", descriptor = "()Lclient!cl;")
	@Override
	public Class58 method9376() {
		return new Class58_Sub3();
	}

	@OriginalMember(owner = "client!aq", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([BIBZI)Lclient!lm;")
	public Interface13 method901(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		return (Interface13) (this.aBoolean67 && (!arg2 || this.aBoolean82) ? new Class116_Sub1(this, arg3, arg0, arg1, arg2) : new Class188_Sub1(this, arg3, arg0, arg1));
	}

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "()Z")
	@Override
	public boolean method9386() {
		return false;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZB)V")
	public void method902(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean55 != arg0) {
			this.aBoolean55 = arg0;
			this.method906();
			this.anInt1002 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIB)V")
	public synchronized void method903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub44 local8 = new Class3_Sub44(arg0);
		local8.aLong345 = (long) arg1;
		this.aClass342_7.method7654(local8);
	}

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "(B)V")
	private void method904() {
		this.aClass125Array1 = new Class125[this.anInt1009];
		this.aClass125_Sub1_1 = new Class125_Sub1(this, 3553, 6408, 1, 1);
		new Class125_Sub1(this, 3553, 6408, 1, 1);
		new Class125_Sub1(this, 3553, 6408, 1, 1);
		for (@Pc(41) int local41 = 0; local41 < 7; local41++) {
			this.aClass170_Sub3Array1[local41] = new Class170_Sub3(this);
			this.aClass170_Sub3Array2[local41] = new Class170_Sub3(this);
		}
		if (this.aBoolean66) {
			this.aClass52_2 = new Class52(this);
			new Class52(this);
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(IIIIII)Lclient!ih;")
	@Override
	public Class113 method9366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean72 ? new Class113_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(II)I")
	@Override
	public int method9324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!aq", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt833 - local12 - arg1, arg2, 1, 32993, this.anInt1038, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!aq", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt1035, this.anInt1023, this.anInt1031, this.anInt1030 };
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!wp;)V")
	public void method905(@OriginalArg(1) Class58_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method9533(), 0);
	}

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "(I)V")
	private void method906() {
		OpenGL.glDepthMask(this.aBoolean55 && this.aBoolean64);
	}

	@OriginalMember(owner = "client!aq", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass58_Sub3_3.aFloat205 + this.aClass58_Sub3_3.aFloat204 * (float) arg0 + (float) arg1 * this.aClass58_Sub3_3.aFloat207 + this.aClass58_Sub3_3.aFloat200 * (float) arg2;
		if (local28 < (float) this.anInt1006 || (float) this.anInt1019 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(89) int local89 = (int) ((this.aClass58_Sub3_3.aFloat201 * (float) arg2 + (float) arg1 * this.aClass58_Sub3_3.aFloat199 + this.aClass58_Sub3_3.aFloat198 * (float) arg0 + this.aClass58_Sub3_3.aFloat209) * (float) this.anInt1031 / (float) arg3);
		@Pc(122) int local122 = (int) ((float) this.anInt1030 * (this.aClass58_Sub3_3.aFloat208 + this.aClass58_Sub3_3.aFloat203 * (float) arg2 + (float) arg1 * this.aClass58_Sub3_3.aFloat202 + this.aClass58_Sub3_3.aFloat206 * (float) arg0) / (float) arg3);
		if (this.aFloat14 <= (float) local89 && this.aFloat9 >= (float) local89 && (float) local122 >= this.aFloat12 && this.aFloat17 >= (float) local122) {
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local122 - this.aFloat12);
			arg4[0] = (int) ((float) local89 - this.aFloat14);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "(B)V")
	public void method907() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray4, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method9401(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas2) {
			local5 = this.aLong24;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(31) Long local31 = (Long) this.aHashtable1.get(arg0);
			local5 = local31;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas1 == arg0) {
			this.method887();
		}
	}

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "(I)V")
	private void method908() {
		this.aFloatArray2[10] = this.aFloat10;
		this.aFloatArray2[14] = this.aFloat15;
		this.aFloat13 = (float) this.anInt1019;
		this.aFloat18 = (this.aFloatArray2[14] - (float) this.anInt1019) / this.aFloatArray2[10];
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ww;B)V")
	public void method909(@OriginalArg(0) Interface27 arg0) {
		if (arg0 != this.anInterface27_1) {
			if (this.aBoolean67) {
				OpenGL.glBindBufferARB(34963, arg0.method9069());
			}
			this.anInterface27_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(FFFI)V")
	private void method910(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean62) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean62 = true;
	}

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "(B)V")
	private void method911() {
		this.aFloat26 = (float) (this.anInt1019 - this.anInt1026) - this.aFloat11;
		this.aFloat23 = this.aFloat26 - this.aFloat20 * (float) this.anInt1020;
		if (this.aFloat23 < (float) this.anInt1006) {
			this.aFloat23 = (float) this.anInt1006;
		}
		OpenGL.glFogf(2915, this.aFloat23);
		OpenGL.glFogf(2916, this.aFloat26);
		Static605.aFloatArray56[0] = (float) (this.anInt1036 & 0xFF0000) / 1.671168E7F;
		Static605.aFloatArray56[2] = (float) (this.anInt1036 & 0xFF) / 255.0F;
		Static605.aFloatArray56[1] = (float) (this.anInt1036 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static605.aFloatArray56, 0);
	}

	@OriginalMember(owner = "client!aq", name = "B", descriptor = "()V")
	@Override
	public void method9372() {
		if (this.aClass3_Sub13_Sub1_1 != null && this.aClass3_Sub13_Sub1_1.method3139()) {
			this.aClass242_1.method5356(this.aClass3_Sub13_Sub1_1);
			this.aClass28_1.method1032();
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(ZI)V")
	public void method912(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean52 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean52 = arg0;
		this.anInt1002 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "(Z)V")
	private void method913() {
		if (this.anInt1002 == 1) {
			return;
		}
		this.method921();
		this.method940(false);
		this.method949(false);
		this.method912(false);
		this.method902(false);
		this.method955((Class125) null);
		this.method939(-2);
		this.method894(1);
		this.anInt1002 = 1;
	}

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "(I)V")
	private void method914() {
		@Pc(14) float[] local14 = this.aFloatArray2;
		@Pc(26) float local26 = (float) (-this.anInt1035 * this.anInt1006) / (float) this.anInt1031;
		@Pc(41) float local41 = (float) ((this.anInt973 - this.anInt1035) * this.anInt1006) / (float) this.anInt1031;
		@Pc(52) float local52 = (float) (this.anInt1023 * this.anInt1006) / (float) this.anInt1030;
		@Pc(67) float local67 = (float) (this.anInt1006 * (this.anInt1023 - this.anInt833)) / (float) this.anInt1030;
		if (local41 == local26 || local67 == local52) {
			local14[11] = 0.0F;
			local14[1] = 0.0F;
			local14[4] = 0.0F;
			local14[10] = 1.0F;
			local14[12] = 0.0F;
			local14[3] = 0.0F;
			local14[5] = 1.0F;
			local14[6] = 0.0F;
			local14[0] = 1.0F;
			local14[2] = 0.0F;
			local14[7] = 0.0F;
			local14[9] = 0.0F;
			local14[13] = 0.0F;
			local14[14] = 0.0F;
			local14[8] = 0.0F;
			local14[15] = 1.0F;
		} else {
			@Pc(83) float local83 = (float) this.anInt1006 * 2.0F;
			local14[10] = this.aFloat10 = (float) -(this.anInt1019 + this.anInt1006) / (float) (this.anInt1019 - this.anInt1006);
			local14[14] = this.aFloat15 = -(local83 * (float) this.anInt1019) / (float) (this.anInt1019 - this.anInt1006);
			local14[11] = -1.0F;
			local14[4] = 0.0F;
			local14[5] = local83 / (local52 - local67);
			local14[3] = 0.0F;
			local14[6] = 0.0F;
			local14[9] = (local67 + local52) / (-local67 + local52);
			local14[8] = (local26 + local41) / (-local26 + local41);
			local14[1] = 0.0F;
			local14[7] = 0.0F;
			local14[0] = local83 / (local41 - local26);
			local14[2] = 0.0F;
			local14[13] = 0.0F;
			local14[12] = 0.0F;
			local14[15] = 0.0F;
		}
		this.method908();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIZ)Lclient!kw;")
	@Override
	public Class178 method9356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class178_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass58_Sub3_3.aFloat205 + this.aClass58_Sub3_3.aFloat207 * (float) arg1 + (float) arg0 * this.aClass58_Sub3_3.aFloat204 + this.aClass58_Sub3_3.aFloat200 * (float) arg2;
		@Pc(55) float local55 = this.aClass58_Sub3_3.aFloat207 * (float) arg4 + (float) arg3 * this.aClass58_Sub3_3.aFloat204 + this.aClass58_Sub3_3.aFloat200 * (float) arg5 + this.aClass58_Sub3_3.aFloat205;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt1006 && local55 < (float) this.anInt1006) {
			local57 |= 0x10;
		} else if ((float) this.anInt1019 < local30 && local55 > (float) this.anInt1019) {
			local57 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((float) this.anInt1031 * (this.aClass58_Sub3_3.aFloat209 + (float) arg0 * this.aClass58_Sub3_3.aFloat198 + (float) arg1 * this.aClass58_Sub3_3.aFloat199 + this.aClass58_Sub3_3.aFloat201 * (float) arg2) / (float) arg6);
		@Pc(163) int local163 = (int) ((float) this.anInt1031 * (this.aClass58_Sub3_3.aFloat209 + (float) arg5 * this.aClass58_Sub3_3.aFloat201 + this.aClass58_Sub3_3.aFloat198 * (float) arg3 + this.aClass58_Sub3_3.aFloat199 * (float) arg4) / (float) arg6);
		if ((float) local130 < this.aFloat14 && (float) local163 < this.aFloat14) {
			local57 |= 0x1;
		} else if ((float) local130 > this.aFloat9 && this.aFloat9 < (float) local163) {
			local57 |= 0x2;
		}
		@Pc(236) int local236 = (int) (((float) arg1 * this.aClass58_Sub3_3.aFloat202 + this.aClass58_Sub3_3.aFloat206 * (float) arg0 + this.aClass58_Sub3_3.aFloat203 * (float) arg2 + this.aClass58_Sub3_3.aFloat208) * (float) this.anInt1030 / (float) arg6);
		@Pc(269) int local269 = (int) ((this.aClass58_Sub3_3.aFloat203 * (float) arg5 + this.aClass58_Sub3_3.aFloat206 * (float) arg3 + this.aClass58_Sub3_3.aFloat202 * (float) arg4 + this.aClass58_Sub3_3.aFloat208) * (float) this.anInt1030 / (float) arg6);
		if (this.aFloat12 > (float) local236 && this.aFloat12 > (float) local269) {
			local57 |= 0x4;
		} else if ((float) local236 > this.aFloat17 && (float) local269 > this.aFloat17) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!so;I)V")
	@Override
	public void method9360(@OriginalArg(0) Class346 arg0, @OriginalArg(1) int arg1) {
		this.aClass225_1.method5081(arg1, arg0, this);
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method9394(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub44 local19;
		while (!this.aClass342_6.method7652()) {
			local19 = (Class3_Sub44) this.aClass342_6.method7653();
			Static267.anIntArray328[local11++] = (int) local19.aLong345;
			this.anInt1000 -= local19.anInt7298;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static267.anIntArray328, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static267.anIntArray328, 0);
			local11 = 0;
		}
		while (!this.aClass342_7.method7652()) {
			local19 = (Class3_Sub44) this.aClass342_7.method7653();
			Static267.anIntArray328[local11++] = (int) local19.aLong345;
			this.anInt999 -= local19.anInt7298;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static267.anIntArray328, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static267.anIntArray328, 0);
			local11 = 0;
		}
		while (!this.aClass342_8.method7652()) {
			local19 = (Class3_Sub44) this.aClass342_8.method7653();
			Static267.anIntArray328[local11++] = local19.anInt7298;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static267.anIntArray328, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static267.anIntArray328, 0);
			local11 = 0;
		}
		while (!this.aClass342_9.method7652()) {
			local19 = (Class3_Sub44) this.aClass342_9.method7653();
			Static267.anIntArray328[local11++] = (int) local19.aLong345;
			this.anInt1001 -= local19.anInt7298;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static267.anIntArray328, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static267.anIntArray328, 0);
		}
		while (!this.aClass342_5.method7652()) {
			local19 = (Class3_Sub44) this.aClass342_5.method7653();
			OpenGL.glDeleteLists((int) local19.aLong345, local19.anInt7298);
		}
		@Pc(226) Class3 local226;
		while (!this.aClass342_10.method7652()) {
			local226 = this.aClass342_10.method7653();
			OpenGL.glDeleteProgramARB((int) local226.aLong345);
		}
		while (!this.aClass342_11.method7652()) {
			local226 = this.aClass342_11.method7653();
			OpenGL.glDeleteObjectARB(local226.aLong345);
		}
		while (!this.aClass342_5.method7652()) {
			local19 = (Class3_Sub44) this.aClass342_5.method7653();
			OpenGL.glDeleteLists((int) local19.aLong345, local19.anInt7298);
		}
		this.aClass28_1.method1037();
		if (this.E() > 100663296 && Static517.method6965() > this.aLong25 + 60000L) {
			System.gc();
			this.aLong25 = Static517.method6965();
		}
		this.anInt995 = local9;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class259 method9407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class259_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(III)V")
	public void method915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1025 = arg0;
		this.anInt1029 = arg1;
		this.method960();
		this.method916();
	}

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "()Z")
	@Override
	public boolean method9342() {
		return this.aClass339_1.method7584();
	}

	@OriginalMember(owner = "client!aq", name = "x", descriptor = "()Lclient!cl;")
	@Override
	public Class58 method9369() {
		return this.aClass58_Sub3_3;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(Z)V")
	@Override
	public void method9374(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "(B)V")
	private void method916() {
		if (this.anInt1032 <= this.anInt1024 && this.anInt1016 <= this.anInt1005) {
			OpenGL.glScissor(this.anInt1032 + this.anInt1029, this.anInt833 + this.anInt1025 - this.anInt1005, this.anInt1024 - this.anInt1032, -this.anInt1016 + this.anInt1005);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!aq", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass58_Sub3_3.aFloat200 * (float) arg2 + this.aClass58_Sub3_3.aFloat204 * (float) arg0 + this.aClass58_Sub3_3.aFloat207 * (float) arg1 + this.aClass58_Sub3_3.aFloat205;
		if ((float) this.anInt1006 > local28 || (float) this.anInt1019 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(88) int local88 = (int) ((float) this.anInt1031 * (this.aClass58_Sub3_3.aFloat198 * (float) arg0 + this.aClass58_Sub3_3.aFloat199 * (float) arg1 + (float) arg2 * this.aClass58_Sub3_3.aFloat201 + this.aClass58_Sub3_3.aFloat209) / local28);
		@Pc(120) int local120 = (int) ((this.aClass58_Sub3_3.aFloat208 + this.aClass58_Sub3_3.aFloat203 * (float) arg2 + (float) arg0 * this.aClass58_Sub3_3.aFloat206 + this.aClass58_Sub3_3.aFloat202 * (float) arg1) * (float) this.anInt1030 / local28);
		if ((float) local88 >= this.aFloat14 && (float) local88 <= this.aFloat9 && this.aFloat12 <= (float) local120 && this.aFloat17 >= (float) local120) {
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local120 - this.aFloat12);
			arg3[0] = (int) ((float) local88 - this.aFloat14);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "()Z")
	@Override
	public boolean method9335() {
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt1039;
		this.anInt1039 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V")
	@Override
	public void method9393(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aq", name = "z", descriptor = "()V")
	@Override
	public void method9389() {
		if (!this.aBoolean59 || this.anInt973 <= 0 || this.anInt833 <= 0) {
			return;
		}
		@Pc(24) int local24 = this.anInt1032;
		@Pc(27) int local27 = this.anInt1024;
		@Pc(30) int local30 = this.anInt1016;
		@Pc(33) int local33 = this.anInt1005;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method893();
		this.method940(false);
		this.method949(false);
		this.method912(false);
		this.method902(false);
		this.method955((Class125) null);
		this.method939(-2);
		this.method894(1);
		this.method964(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt973, this.anInt833, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local24, local30, local27, local33);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method9395(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(23) Long local23 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local23);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!aq", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method913();
		this.method964(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "(I)V")
	private void method917() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass58_Sub3_4.method9533(), 0);
		if (this.aBoolean69) {
			this.aClass339_1.aClass63_Sub2_1.method2610();
		}
		this.method907();
		this.method932();
	}

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "(I)V")
	public void method918() {
		if (this.anInt1002 == 4) {
			return;
		}
		this.method921();
		this.method940(false);
		this.method949(false);
		this.method912(false);
		this.method902(false);
		this.method939(-2);
		this.method964(1);
		this.anInt1002 = 4;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!tm;Z)Lclient!kw;")
	@Override
	public Class178 method9363(@OriginalArg(0) Class361 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt9707 * arg0.anInt9706];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray91 == null) {
			for (local21 = 0; local21 < arg0.anInt9707; local21++) {
				for (local25 = 0; local25 < arg0.anInt9706; local25++) {
					@Pc(87) int local87 = arg0.anIntArray701[arg0.aByteArray90[local14++] & 0xFF];
					local12[local16++] = local87 == 0 ? 0 : local87 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt9707; local21++) {
				for (local25 = 0; local25 < arg0.anInt9706; local25++) {
					local12[local16++] = arg0.anIntArray701[arg0.aByteArray90[local14] & 0xFF] | arg0.aByteArray91[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(123) Class178 local123 = this.method9367(local12, arg0.anInt9706, arg0.anInt9707, arg0.anInt9706);
		local123.method7631(arg0.anInt9703, arg0.anInt9704, arg0.anInt9708, arg0.anInt9705);
		return local123;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method9347(@OriginalArg(0) Canvas arg0) {
		this.aLong22 = 0L;
		this.aCanvas1 = null;
		if (arg0 == null || this.aCanvas2 == arg0) {
			this.aCanvas1 = this.aCanvas2;
			this.aLong22 = this.aLong24;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(42) Long local42 = (Long) this.aHashtable1.get(arg0);
			this.aLong22 = local42;
			this.aCanvas1 = arg0;
		}
		if (this.aCanvas1 == null || this.aLong22 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong22);
		this.method887();
	}

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "()V")
	@Override
	protected void method9339() {
		for (@Pc(10) Class3 local10 = this.aClass342_4.method7644(); local10 != null; local10 = this.aClass342_4.method7650()) {
			((Class3_Sub16_Sub1) local10).method1780();
		}
		if (this.aClass242_1 != null) {
			this.aClass242_1.method5348();
		}
		if (this.anOpenGL1 != null) {
			this.method892();
			@Pc(48) Enumeration local48 = this.aHashtable1.keys();
			while (local48.hasMoreElements()) {
				@Pc(56) Canvas local56 = (Canvas) local48.nextElement();
				@Pc(62) Long local62 = (Long) this.aHashtable1.get(local56);
				this.anOpenGL1.releaseSurface(local56, local62);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean51) {
			Static134.method2374(false, true);
			this.aBoolean51 = false;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method9370(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas2) {
			throw new RuntimeException();
		} else if (!this.aHashtable1.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(32) Class local32 = Class.forName("java.awt.Canvas");
				@Pc(44) Method local44 = local32.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local44.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(56) Exception local56) {
			}
			@Pc(61) long local61 = this.anOpenGL1.prepareSurface(arg0);
			if (local61 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable1.put(arg0, Long.valueOf(local61));
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!pe;BLclient!pe;Lclient!pe;Lclient!pe;)V")
	public void method919(@OriginalArg(0) Class287 arg0, @OriginalArg(2) Class287 arg1, @OriginalArg(3) Class287 arg2, @OriginalArg(4) Class287 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method888(arg0.anInterface13_5);
			OpenGL.glVertexPointer(arg0.aByte111, arg0.aShort83, this.anInterface13_1.method4051(), this.anInterface13_1.method4054() + (long) arg0.aByte112);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method888(arg1.anInterface13_5);
			OpenGL.glNormalPointer(arg1.aShort83, this.anInterface13_1.method4051(), this.anInterface13_1.method4054() + (long) arg1.aByte112);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method888(arg3.anInterface13_5);
			OpenGL.glColorPointer(arg3.aByte111, arg3.aShort83, this.anInterface13_1.method4051(), this.anInterface13_1.method4054() + (long) arg3.aByte112);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method888(arg2.anInterface13_5);
			OpenGL.glTexCoordPointer(arg2.aByte111, arg2.aShort83, this.anInterface13_1.method4051(), this.anInterface13_1.method4054() + (long) arg2.aByte112);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!aq", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt1040;
		this.anInt1040 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(FFF)V")
	@Override
	public void method9344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static107.aFloat131 = arg1;
		Static234.aFloat61 = arg2;
		Static461.aFloat121 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "()Z")
	@Override
	public boolean method9365() {
		if (this.aClass3_Sub13_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub13_Sub1_1.method3139()) {
			if (!this.aClass242_1.method5350(this.aClass3_Sub13_Sub1_1)) {
				return false;
			}
			this.aClass28_1.method1032();
		}
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method9352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass242_1.method5352(arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!aq", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method902(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "(II)Lclient!es;")
	@Override
	public Interface8 method9383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aq", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt1016;
		arg0[3] = this.anInt1005;
		arg0[2] = this.anInt1024;
		arg0[0] = this.anInt1032;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!so;)V")
	@Override
	public void method9384(@OriginalArg(0) Class346 arg0) {
		this.aClass225_1.method5081(-1, arg0, this);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method9331(@OriginalArg(0) Class3_Sub16 arg0) {
		this.aNativeHeap1 = ((Class3_Sub16_Sub1) arg0).aNativeHeap2;
		if (this.anInterface13_2 != null) {
			return;
		}
		@Pc(16) Class3_Sub2_Sub2 local16 = new Class3_Sub2_Sub2(80);
		if (this.aBoolean60) {
			local16.method2080(-1.0F);
			local16.method2080(-1.0F);
			local16.method2080(0.0F);
			local16.method2080(0.0F);
			local16.method2080(1.0F);
			local16.method2080(1.0F);
			local16.method2080(-1.0F);
			local16.method2080(0.0F);
			local16.method2080(1.0F);
			local16.method2080(1.0F);
			local16.method2080(1.0F);
			local16.method2080(1.0F);
			local16.method2080(0.0F);
			local16.method2080(1.0F);
			local16.method2080(0.0F);
			local16.method2080(-1.0F);
			local16.method2080(1.0F);
			local16.method2080(0.0F);
			local16.method2080(0.0F);
			local16.method2080(0.0F);
		} else {
			local16.method2079(-1.0F);
			local16.method2079(-1.0F);
			local16.method2079(0.0F);
			local16.method2079(0.0F);
			local16.method2079(1.0F);
			local16.method2079(1.0F);
			local16.method2079(-1.0F);
			local16.method2079(0.0F);
			local16.method2079(1.0F);
			local16.method2079(1.0F);
			local16.method2079(1.0F);
			local16.method2079(1.0F);
			local16.method2079(0.0F);
			local16.method2079(1.0F);
			local16.method2079(0.0F);
			local16.method2079(-1.0F);
			local16.method2079(1.0F);
			local16.method2079(0.0F);
			local16.method2079(0.0F);
			local16.method2079(0.0F);
		}
		this.anInterface13_2 = this.method901(local16.aByteArray20, local16.anInt2178, false, 20);
		this.aClass287_2 = new Class287(this.anInterface13_2, 5126, 3, 0);
		this.aClass287_1 = new Class287(this.anInterface13_2, 5126, 2, 12);
		this.aClass225_1.method5082(this);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!hw;[Lclient!tm;Z)Lclient!da;")
	@Override
	public Class57 method9353(@OriginalArg(0) Class169 arg0, @OriginalArg(1) Class361[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class57_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method9341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg5;
		@Pc(9) Class125_Sub1_Sub1 local9 = local6.aClass125_Sub1_Sub1_2;
		this.method926();
		this.method955(local6.aClass125_Sub1_Sub1_2);
		this.method964(1);
		this.method900(8448, 7681);
		this.method935(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat197 / (float) local9.anInt10870;
		@Pc(46) float local46 = local9.aFloat196 / (float) local9.anInt10869;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(59) float local59 = (float) arg3 - (float) arg1;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local59 * local59)));
		@Pc(76) float local76 = local53 * local72;
		@Pc(80) float local80 = local59 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local76 + 0.35F, (float) arg3 + local80 + 0.35F);
		OpenGL.glEnd();
		this.method935(768, 0, 5890);
	}

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "(B)Lclient!ia;")
	public Class125_Sub2 method920() {
		return this.aClass113_Sub2_1 == null ? null : this.aClass113_Sub2_1.method4897();
	}

	@OriginalMember(owner = "client!aq", name = "A", descriptor = "(I)V")
	private void method921() {
		if (this.anInt1015 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt973 > 0 && this.anInt833 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt973, (double) this.anInt833, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt1002 &= 0xFFFFFFE7;
		this.anInt1015 = 1;
	}

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "()V")
	@Override
	public void method9351() {
		if (this.aBoolean66) {
			if (this.aClass52_1 != this.anInterface20_2) {
				throw new RuntimeException();
			}
			this.aClass52_1.method1512(0);
			this.aClass52_1.method1512(8);
			this.method923(this.aClass52_1);
		} else if (this.aBoolean61) {
			this.aClass178_Sub2_1.method7624(0, 0, this.anInt973, this.anInt833, 0, 0);
			this.anOpenGL1.setSurface(this.aLong22);
		} else {
			throw new RuntimeException("");
		}
		this.anInt833 = this.anInt868;
		this.aClass178_Sub2_1 = null;
		this.anInt973 = this.anInt818;
		this.method893();
		this.method960();
		this.la();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BI)V")
	public synchronized void method922(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub44 local16 = new Class3_Sub44(arg0);
		this.aClass342_8.method7654(local16);
	}

	@OriginalMember(owner = "client!aq", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(61) float local61;
		@Pc(49) float local49;
		if (this.aClass125_Sub1_Sub1_1 == null || this.aClass125_Sub1_Sub1_1.anInt10867 < arg2 || this.aClass125_Sub1_Sub1_1.anInt10858 < arg3) {
			this.aClass125_Sub1_Sub1_1 = Static445.method5891(arg2, arg6, this, arg3);
			this.aClass125_Sub1_Sub1_1.method9224(false, false);
			local49 = this.aClass125_Sub1_Sub1_1.aFloat197;
			local61 = this.aClass125_Sub1_Sub1_1.aFloat196;
		} else {
			this.aClass125_Sub1_Sub1_1.method9222(arg3, false, arg6, 6406, arg2);
			local49 = (float) arg2 * this.aClass125_Sub1_Sub1_1.aFloat197 / (float) this.aClass125_Sub1_Sub1_1.anInt10867;
			local61 = (float) arg3 * this.aClass125_Sub1_Sub1_1.aFloat196 / (float) this.aClass125_Sub1_Sub1_1.anInt10858;
		}
		this.method926();
		this.method955(this.aClass125_Sub1_Sub1_1);
		this.method964(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method934(arg5);
		this.method900(34165, 34165);
		this.method935(768, 0, 34166);
		this.method935(770, 2, 5890);
		this.method963(0, 34166);
		this.method963(2, 5890);
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
		this.method935(768, 0, 5890);
		this.method935(770, 2, 34166);
		this.method963(0, 5890);
		this.method963(2, 34166);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!sba;I)V")
	public void method923(@OriginalArg(0) Interface20 arg0) {
		if (this.aBoolean68) {
			this.method891(arg0);
			this.method965(arg0);
		} else if (this.anInt997 >= 0 && arg0 == this.anInterface20Array1[this.anInt997]) {
			this.anInterface20Array1[this.anInt997--] = null;
			arg0.method1506();
			if (this.anInt997 < 0) {
				this.anInterface20_1 = this.anInterface20_2 = null;
			} else {
				this.anInterface20_1 = this.anInterface20_2 = this.anInterface20Array1[this.anInt997];
				this.anInterface20_1.method1501();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method9385(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method9391(arg2, arg3);
	}

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "()Z")
	@Override
	public boolean method9332() {
		return this.aClass3_Sub13_Sub1_1 != null && this.aClass3_Sub13_Sub1_1.method3139();
	}

	@OriginalMember(owner = "client!aq", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt833) {
			arg3 = this.anInt833;
		}
		if (arg2 > this.anInt973) {
			arg2 = this.anInt973;
		}
		this.anInt1032 = arg0;
		this.anInt1005 = arg3;
		this.anInt1016 = arg1;
		this.anInt1024 = arg2;
		OpenGL.glEnable(3089);
		this.method924();
		this.method916();
	}

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "()Z")
	@Override
	public boolean method9380() {
		return this.aClass3_Sub13_Sub1_1 != null && (this.anInt990 <= 1 || this.aBoolean74);
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)V")
	private void method924() {
		this.aFloat9 = (float) (this.anInt1024 - this.anInt1035);
		this.aFloat12 = (float) (this.anInt1016 - this.anInt1023);
		this.aFloat14 = (float) (this.anInt1032 - this.anInt1035);
		this.aFloat17 = (float) (this.anInt1005 - this.anInt1023);
	}

	@OriginalMember(owner = "client!aq", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Class125_Sub1_Sub1 local9 = local6.aClass125_Sub1_Sub1_2;
		this.method926();
		this.method955(local6.aClass125_Sub1_Sub1_2);
		this.method964(1);
		this.method900(8448, 7681);
		this.method935(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat197 / (float) local9.anInt10870;
		@Pc(46) float local46 = local9.aFloat196 / (float) local9.anInt10869;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt1032 - arg2) * local39, (float) (this.anInt1016 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt1032, this.anInt1016);
		OpenGL.glTexCoord2f((float) (this.anInt1032 - arg2) * local39, local46 * (float) (this.anInt1005 - arg3));
		OpenGL.glVertex2i(this.anInt1032, this.anInt1005);
		OpenGL.glTexCoord2f((float) (this.anInt1024 - arg2) * local39, (float) (this.anInt1005 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt1024, this.anInt1005);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt1024 - arg2), (float) (this.anInt1016 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt1024, this.anInt1016);
		OpenGL.glEnd();
		this.method935(768, 0, 5890);
	}

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "(B)V")
	public void method925() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "(I)V")
	public void method926() {
		if (this.anInt1002 == 2) {
			return;
		}
		this.method921();
		this.method940(false);
		this.method949(false);
		this.method912(false);
		this.method902(false);
		this.method939(-2);
		this.anInt1002 = 2;
	}

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "(I)V")
	@Override
	public void method9387(@OriginalArg(0) int arg0) {
		this.method892();
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(IIII)V")
	public void method927(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(III)V")
	public synchronized void method928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub44 local8 = new Class3_Sub44(arg1);
		local8.aLong345 = (long) arg0;
		this.aClass342_6.method7654(local8);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!gt;IIII)Lclient!ka;")
	@Override
	public Class170 method9382(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class170_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method9377() {
		this.method913();
		this.method964(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "(I)V")
	private void method930() {
		Static605.aFloatArray56[2] = this.aFloat25 * this.aFloat21;
		Static605.aFloatArray56[3] = 1.0F;
		Static605.aFloatArray56[1] = this.aFloat28 * this.aFloat21;
		Static605.aFloatArray56[0] = this.aFloat19 * this.aFloat21;
		OpenGL.glLightModelfv(2899, Static605.aFloatArray56, 0);
	}

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)V")
	@Override
	public void method9357(@OriginalArg(0) int arg0) {
		this.method897();
	}

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "()Lclient!an;")
	@Override
	public Class19 method9364() {
		@Pc(7) int local7 = -1;
		if (this.aString9.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString9.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString9.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class19(local7, "OpenGL", this.anInt1017, this.aString8, 0L);
	}

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "(II)V")
	public void method931(@OriginalArg(0) int arg0) {
		if (this.anInt1013 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt1013 = arg0;
		}
	}

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "(B)V")
	private void method932() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt1028; local7++) {
			@Pc(14) Class3_Sub5 local14 = this.aClass3_Sub5Array1[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static682.aFloatArray80[0] = (float) local14.method7174();
			Static682.aFloatArray80[1] = (float) local14.method7175();
			Static682.aFloatArray80[2] = (float) local14.method7177();
			Static682.aFloatArray80[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static682.aFloatArray80, 0);
			@Pc(52) int local52 = local14.method7172();
			@Pc(60) float local60 = local14.method7176() / 255.0F;
			Static682.aFloatArray80[2] = (float) (local52 & 0xFF) * local60;
			Static682.aFloatArray80[0] = local60 * (float) (local52 >> 16 & 0xFF);
			Static682.aFloatArray80[1] = (float) (local52 >> 8 & 0xFF) * local60;
			OpenGL.glLightfv(local18, 4609, Static682.aFloatArray80, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method7173() * local14.method7173()));
			OpenGL.glEnable(local18);
		}
		while (this.anInt1014 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt1014 = this.anInt1028;
		if (48 != 48) {
			this.method9387(-108);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLclient!wp;)V")
	public void method933(@OriginalArg(1) Class58_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method9533(), 0);
	}

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "()Z")
	@Override
	public boolean method9392() {
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(IB)V")
	public void method934(@OriginalArg(0) int arg0) {
		Static605.aFloatArray56[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static605.aFloatArray56[3] = (float) (arg0 >>> 24) / 255.0F;
		Static605.aFloatArray56[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static605.aFloatArray56[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static605.aFloatArray56, 0);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method913();
		this.method964(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		if (local16 == 0.0F && local23 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(50) float local50 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local23 * local23)));
			local16 *= local50;
			local23 *= local50;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, (float) arg3 + local23 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(IIII)V")
	public void method935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg0);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZ)I")
	public int method936(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(I)V")
	private void method937() {
		Static605.aFloatArray56[3] = 1.0F;
		Static605.aFloatArray56[2] = this.aFloat24 * this.aFloat25;
		Static605.aFloatArray56[1] = this.aFloat28 * this.aFloat24;
		Static605.aFloatArray56[0] = this.aFloat24 * this.aFloat19;
		OpenGL.glLightfv(16384, 4609, Static605.aFloatArray56, 0);
		Static605.aFloatArray56[3] = 1.0F;
		Static605.aFloatArray56[2] = -this.aFloat22 * this.aFloat25;
		Static605.aFloatArray56[1] = -this.aFloat22 * this.aFloat28;
		Static605.aFloatArray56[0] = -this.aFloat22 * this.aFloat19;
		OpenGL.glLightfv(16385, 4609, Static605.aFloatArray56, 0);
	}

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "(B)V")
	private void method938() {
		this.method939(-2);
		for (@Pc(16) int local16 = this.anInt1009 - 1; local16 >= 0; local16--) {
			this.method931(local16);
			this.method955((Class125) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method900(8448, 8448);
		this.method935(770, 2, 34168);
		this.method968();
		this.anInt1003 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		if (76 != 76) {
			this.aBoolean64 = false;
		}
		this.anInt1004 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean54 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean53 = true;
		this.method940(true);
		this.method949(true);
		this.method912(true);
		this.method902(true);
		this.method893();
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
		@Pc(144) float[] local144 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(146) int local146 = 0; local146 < 8; local146++) {
			@Pc(155) int local155 = local146 + 16384;
			OpenGL.glLightfv(local155, 4608, local144, 0);
			OpenGL.glLightf(local155, 4615, 0.0F);
			OpenGL.glLightf(local155, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt1022 = this.anInt1036 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "(II)V")
	public void method939(@OriginalArg(0) int arg0) {
		this.method899(arg0, true);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!cl;)V")
	@Override
	public void method9405(@OriginalArg(0) Class58 arg0) {
		this.aClass58_Sub3_3.method9516(arg0);
		this.aClass58_Sub3_4.method9516(this.aClass58_Sub3_3);
		this.aClass58_Sub3_4.method9531();
		this.aClass58_Sub3_5.method9529(this.aClass58_Sub3_4);
		if (this.anInt1015 != 1) {
			this.method917();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method9355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static393.method5326(this, arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIF)Lclient!jw;")
	@Override
	public Class3_Sub5 method9337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub5_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI)V")
	public void method940(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean65) {
			this.aBoolean65 = arg0;
			this.method890();
			this.anInt1002 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "(I)V")
	public void method941() {
		if (this.anInt1002 == 16) {
			return;
		}
		this.method946();
		this.method940(true);
		this.method912(true);
		this.method902(true);
		this.method964(1);
		this.anInt1002 = 16;
	}

	@OriginalMember(owner = "client!aq", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt1024 = this.anInt973;
		this.anInt1005 = this.anInt833;
		this.anInt1016 = 0;
		this.anInt1032 = 0;
		OpenGL.glDisable(3089);
		this.method924();
	}

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "(I)V")
	private void method942() {
		if (this.aBoolean57 && !this.aBoolean63) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "()V")
	@Override
	public void method9396() {
		this.aClass242_1.method5349();
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(B)V")
	private void method943() {
		@Pc(23) float local23 = (float) -this.anInt1035 * this.aFloat8 / (float) this.anInt1031;
		@Pc(35) float local35 = (float) -this.anInt1023 * this.aFloat8 / (float) this.anInt1030;
		@Pc(50) float local50 = (float) (this.anInt973 - this.anInt1035) * this.aFloat8 / (float) this.anInt1031;
		@Pc(65) float local65 = this.aFloat8 * (float) (this.anInt833 - this.anInt1023) / (float) this.anInt1030;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local50 != local23 && local35 != local65) {
			OpenGL.glOrtho((double) local23, (double) local50, (double) -local65, (double) -local35, (double) this.anInt1006, (double) this.anInt1019);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!aq", name = "z", descriptor = "(I)V")
	private void method944() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray2, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I[Lclient!jw;)V")
	@Override
	public void method9350(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub5[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub5Array1[local7] = arg1[local7];
		}
		this.anInt1028 = arg0;
		if (this.anInt1015 != 1) {
			this.method932();
		}
	}

	@OriginalMember(owner = "client!aq", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(16) boolean local16 = arg0 != this.anInt1022;
		if (local16 || arg1 != this.aFloat24 || this.aFloat22 != arg2) {
			this.anInt1022 = arg0;
			this.aFloat22 = arg2;
			this.aFloat24 = arg1;
			if (local16) {
				this.aFloat19 = (float) (this.anInt1022 & 0xFF0000) / 1.671168E7F;
				this.aFloat28 = (float) (this.anInt1022 & 0xFF00) / 65280.0F;
				this.aFloat25 = (float) (this.anInt1022 & 0xFF) / 255.0F;
				this.method930();
			}
			this.method937();
		}
		if (arg3 == this.aFloatArray6[0] && this.aFloatArray6[1] == arg4 && this.aFloatArray6[2] == arg5) {
			return;
		}
		this.aFloatArray6[1] = arg4;
		this.aFloatArray6[2] = arg5;
		this.aFloatArray6[0] = arg3;
		this.aFloatArray5[2] = -arg5;
		this.aFloatArray5[0] = -arg3;
		this.aFloatArray5[1] = -arg4;
		@Pc(155) float local155 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray4[0] = local155 * arg3;
		this.aFloatArray4[2] = local155 * arg5;
		this.aFloatArray4[1] = arg4 * local155;
		this.aFloatArray3[0] = -this.aFloatArray4[0];
		this.aFloatArray3[1] = -this.aFloatArray4[1];
		this.aFloatArray3[2] = -this.aFloatArray4[2];
		this.method907();
		this.anInt1007 = (int) (arg3 * 256.0F / arg4);
		this.anInt1021 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(Z)V")
	private void method946() {
		if (this.anInt1015 != 3) {
			this.anInt1015 = 3;
			this.method943();
			this.method917();
			this.anInt1002 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IJ)V")
	public synchronized void method947(@OriginalArg(1) long arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong345 = arg0;
		this.aClass342_11.method7654(local7);
	}

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "()Z")
	@Override
	public boolean method9388() {
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "(II)V")
	public synchronized void method948(@OriginalArg(0) int arg0) {
		@Pc(12) Class3 local12 = new Class3();
		local12.aLong345 = (long) arg0;
		this.aClass342_10.method7654(local12);
	}

	@OriginalMember(owner = "client!aq", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean81) {
			throw new RuntimeException("");
		}
		this.anInt1018 = arg1;
		this.anInt1012 = arg0;
		this.anInt1033 = arg2;
		this.anInt1027 = arg3;
		if (this.aBoolean69) {
			this.aClass339_1.aClass63_Sub2_1.method2610();
			this.aClass339_1.aClass63_Sub2_1.method2611();
		}
	}

	@OriginalMember(owner = "client!aq", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean81 = false;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(ZI)V")
	public void method949(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean57 != arg0) {
			this.aBoolean57 = arg0;
			this.method942();
			this.anInt1002 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "()V")
	@Override
	public void method9328() {
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(FB)V")
	public void method950(@OriginalArg(0) float arg0) {
		if (this.aFloat8 != arg0) {
			this.aFloat8 = arg0;
			if (this.anInt1015 == 3) {
				this.method943();
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method9326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method913();
		this.method964(1);
		@Pc(33) float local33 = (float) -arg0 + (float) arg2;
		@Pc(39) float local39 = (float) arg3 - (float) arg1;
		@Pc(52) float local52 = (float) (1.0D / Math.sqrt((double) (local33 * local33 + local39 * local39)));
		@Pc(56) float local56 = local33 * local52;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(75) float local75 = local39 * local52;
		@Pc(82) int local82 = arg7 % (arg6 + arg5);
		@Pc(87) float local87 = local56 * (float) arg5;
		@Pc(92) float local92 = local75 * (float) arg5;
		@Pc(94) float local94 = 0.0F;
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = local87;
		@Pc(100) float local100 = local92;
		if (local82 <= arg5) {
			local100 = (float) (arg5 - local82) * local75;
			local98 = local56 * (float) (arg5 - local82);
		} else {
			local96 = (float) (arg5 + arg6 - local82) * local75;
			local94 = local56 * (float) (arg5 + arg6 - local82);
		}
		@Pc(149) float local149 = (float) arg0 + local94 + 0.35F;
		@Pc(156) float local156 = local96 + (float) arg1 + 0.35F;
		@Pc(161) float local161 = local56 * (float) arg6;
		@Pc(166) float local166 = (float) arg6 * local75;
		while (true) {
			if (arg0 >= arg2) {
				if (local149 < (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 > local98 + local149) {
					local98 = (float) arg2 - local149;
				}
			} else {
				if (local149 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local98 + local149) {
					local98 = (float) arg2 - local149;
				}
			}
			if (arg3 > arg1) {
				if ((float) arg3 + 0.35F < local156) {
					break;
				}
				if ((float) arg3 < local156 + local100) {
					local100 = (float) arg3 - local156;
				}
			} else {
				if (local156 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local100 + local156) {
					local100 = (float) arg3 - local156;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local149, local156);
			OpenGL.glVertex2f(local149 + local98, local156 + local100);
			OpenGL.glEnd();
			local156 += local100 + local166;
			local149 += local161 + local98;
			local98 = local87;
			local100 = local92;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB)I")
	public int method951(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!aq", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1033 = arg2;
		this.aBoolean81 = true;
		this.anInt1018 = arg1;
		this.anInt1012 = arg0;
		this.anInt1027 = arg3;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!vv;)V")
	@Override
	public void method9398(@OriginalArg(0) Interface25 arg0) {
	}

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "()Lclient!cl;")
	@Override
	public Class58 method9354() {
		return this.aClass58_Sub3_1;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method9403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method913();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method964(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean79) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean79) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method9349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method9404(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "(I)V")
	@Override
	public void method9343() {
	}

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "(B)V")
	public void method952() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "(B)I")
	private int method953() {
		@Pc(5) int local5 = 0;
		this.aString9 = OpenGL.glGetString(7936).toLowerCase();
		this.aString8 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString9.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString9.indexOf("brian paul") != -1 || this.aString9.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(53) String local53 = OpenGL.glGetString(7938);
		@Pc(61) String[] local61 = Static104.method2099(local53.replace('.', ' '), ' ');
		if (local61.length >= 2) {
			try {
				@Pc(71) int local71 = Static636.method8390(local61[0]);
				@Pc(77) int local77 = Static636.method8390(local61[1]);
				this.anInt1017 = local71 * 10 + local77;
			} catch (@Pc(87) NumberFormatException local87) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt1017 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(136) int[] local136 = new int[1];
		OpenGL.glGetIntegerv(34018, local136, 0);
		this.anInt1009 = local136[0];
		OpenGL.glGetIntegerv(34929, local136, 0);
		this.anInt1008 = local136[0];
		OpenGL.glGetIntegerv(34930, local136, 0);
		this.anInt1011 = local136[0];
		if (this.anInt1009 < 2 || this.anInt1008 < 2 || this.anInt1011 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean60 = Stream.c();
		this.aBoolean61 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean67 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean79 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean71 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean80 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean73 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean78 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean70 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean72 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean77 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean76 = false;
		this.aBoolean66 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean68 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean56 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean74 = this.aBoolean56 & this.aBoolean68;
		this.aBoolean58 = Class21_Sub24.aString112.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static605.aFloatArray56, 0);
		this.aFloat27 = Static605.aFloatArray56[0];
		this.aFloat16 = Static605.aFloatArray56[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)V")
	public synchronized void method954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub44 local15 = new Class3_Sub44(arg0);
		local15.aLong345 = (long) arg1;
		this.aClass342_9.method7654(local15);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!rha;)V")
	public void method955(@OriginalArg(1) Class125 arg0) {
		@Pc(11) Class125 local11 = this.aClass125Array1[this.anInt1013];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt10843);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt10843);
				} else if (arg0.anInt10843 != local11.anInt10843) {
					OpenGL.glDisable(local11.anInt10843);
					OpenGL.glEnable(arg0.anInt10843);
				}
				OpenGL.glBindTexture(arg0.anInt10843, arg0.method9211());
			}
			this.aClass125Array1[this.anInt1013] = arg0;
		}
		this.anInt1002 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "(I)V")
	public void method956() {
		if (this.anInt1002 == 8) {
			return;
		}
		this.method961();
		this.method940(true);
		this.method912(true);
		this.method902(true);
		this.method964(1);
		this.anInt1002 = 8;
	}

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "()V")
	@Override
	public void method9345() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!aq", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt994 = 0;
		while (arg0 > 1) {
			this.anInt994++;
			arg0 >>= 0x1;
		}
		this.anInt993 = 0x1 << this.anInt994;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "()Z")
	@Override
	public boolean method9323() {
		return this.aBoolean79 && (!this.method9332() || this.aBoolean74);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "()Z")
	@Override
	public boolean method9379() {
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method913();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method964(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean79) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean79) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!ww;III)V")
	public void method957(@OriginalArg(0) int arg0, @OriginalArg(1) Interface27 arg1, @OriginalArg(4) int arg2) {
		@Pc(15) int local15 = arg1.method9067();
		@Pc(22) int local22 = arg0 * this.method951(local15);
		this.method909(arg1);
		OpenGL.glDrawElements(4, arg2, local15, (long) local22 + arg1.method9068());
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IFF)V")
	public void method958(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat11 = arg1;
		this.aFloat20 = arg0;
		this.method911();
	}

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "()Z")
	@Override
	public boolean method9346() {
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt1032 > arg2 + arg0 || this.anInt1024 < arg0 - arg2 || arg2 + arg1 < this.anInt1016 || this.anInt1005 < arg1 - arg2) {
			return;
		}
		this.method913();
		this.method964(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(87) float local87 = (float) arg0 + 0.35F;
		@Pc(92) float local92 = (float) arg1 + 0.35F;
		@Pc(96) int local96 = arg2 << 1;
		if ((float) local96 < this.aFloat27) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local87 + 1.0F, local92 + 1.0F);
			OpenGL.glVertex2f(local87 + 1.0F, local92 - 1.0F);
			OpenGL.glVertex2f(local87 - 1.0F, -1.0F + local92);
			OpenGL.glVertex2f(local87 - 1.0F, local92 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local96 <= this.aFloat16) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local96);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local87, local92);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local87, local92);
			@Pc(167) int local167 = 262144 / (arg2 * 6);
			if (local167 <= 64) {
				local167 = 64;
			} else if (local167 > 512) {
				local167 = 512;
			}
			local167 = Static70.method3137(local167);
			OpenGL.glVertex2f((float) arg2 + local87, local92);
			for (@Pc(199) int local199 = 16384 - local167; local199 > 0; local199 -= local167) {
				OpenGL.glVertex2f(local87 + Class3_Sub7_Sub4.aFloatArray14[local199] * (float) arg2, Class3_Sub7_Sub4.aFloatArray13[local199] * (float) arg2 + local92);
			}
			OpenGL.glVertex2f(local87 + (float) arg2, local92);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!sba;)V")
	public void method959(@OriginalArg(1) Interface20 arg0) {
		if (this.aBoolean68) {
			this.method898(arg0);
			this.method970(arg0);
		} else if (this.anInt997 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt997 >= 0) {
				this.anInterface20Array1[this.anInt997].method1506();
			}
			this.anInterface20_1 = this.anInterface20_2 = this.anInterface20Array1[++this.anInt997] = arg0;
			this.anInterface20_1.method1501();
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
	@Override
	public void method9373(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub16 method9329(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub16_Sub1 local8 = new Class3_Sub16_Sub1(arg0);
		this.aClass342_4.method7654(local8);
		return local8;
	}

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "()Z")
	@Override
	public boolean method9408() {
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1035 = arg0;
		this.anInt1023 = arg1;
		this.anInt1030 = arg3;
		this.anInt1031 = arg2;
		this.method914();
		this.method924();
		if (this.anInt1015 == 3) {
			this.method943();
		} else if (this.anInt1015 == 2) {
			this.method944();
			return;
		}
	}

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "(B)V")
	private void method960() {
		OpenGL.glViewport(this.anInt1029, this.anInt1025, this.anInt973, this.anInt833);
	}

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "(I)V")
	private void method961() {
		if (this.anInt1015 != 2) {
			this.anInt1015 = 2;
			this.method944();
			this.method917();
			this.anInt1002 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(IIII)V")
	public void method963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "(II)V")
	public void method964(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt1003) {
			return;
		}
		@Pc(33) boolean local33;
		@Pc(29) byte local29;
		if (arg0 == 1) {
			local29 = 1;
			local33 = true;
		} else if (arg0 == 2) {
			local29 = 2;
			local33 = false;
		} else if (arg0 == 128) {
			local29 = 3;
			local33 = true;
		} else {
			local33 = false;
			local29 = 0;
		}
		if (!this.aBoolean53) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean53 = true;
		}
		if (local33 != this.aBoolean54) {
			if (local33) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean54 = local33;
		}
		if (this.anInt1004 != local29) {
			if (local29 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local29 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local29 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt1004 = local29;
		}
		this.anInt1002 &= 0xFFFFFFE3;
		this.anInt1003 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "()I")
	@Override
	public int method9362() {
		return 4;
	}

	@OriginalMember(owner = "client!aq", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt1019;
	}

	@OriginalMember(owner = "client!aq", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method913();
		this.method964(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!sba;B)V")
	public void method965(@OriginalArg(0) Interface20 arg0) {
		if (this.anInt998 < 0 || this.anInterface20Array2[this.anInt998] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface20Array2[this.anInt998--] = null;
		arg0.method1504();
		if (this.anInt998 < 0) {
			this.anInterface20_2 = null;
		} else {
			this.anInterface20_2 = this.anInterface20Array2[this.anInt998];
			this.anInterface20_2.method1503();
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(IZ)V")
	public void method966(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean63) {
			this.aBoolean63 = arg0;
			this.method942();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BIZILclient!jaclib/memory/Buffer;)Lclient!lm;")
	public Interface13 method967(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Buffer arg2) {
		return (Interface13) (this.aBoolean67 && (this.aBoolean82 || true) ? new Class116_Sub1(this, arg0, arg2, arg1, false) : new Class188_Sub1(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!aq", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt1001 + this.anInt999 + this.anInt1000;
	}

	@OriginalMember(owner = "client!aq", name = "x", descriptor = "(I)V")
	private void method968() {
		if (this.aBoolean62) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean62 = false;
		}
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(IB)I")
	public int method969(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1006 == arg0 && arg1 == this.anInt1019) {
			return;
		}
		this.anInt1006 = arg0;
		this.anInt1019 = arg1;
		this.method914();
		this.method911();
		if (this.anInt1015 == 3) {
			this.method943();
			return;
		}
		if (this.anInt1015 != 2) {
			return;
		}
		this.method944();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([I)V")
	@Override
	public void method9371(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt833;
		arg0[0] = this.anInt973;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(ILclient!sba;)V")
	public void method970(@OriginalArg(1) Interface20 arg0) {
		if (this.anInt998 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt998 >= 0) {
			this.anInterface20Array2[this.anInt998].method1504();
		}
		this.anInterface20_2 = this.anInterface20Array2[++this.anInt998] = arg0;
		this.anInterface20_2.method1503();
	}

	@OriginalMember(owner = "client!aq", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean64 = arg0;
		this.method906();
	}

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt1006;
	}
}
