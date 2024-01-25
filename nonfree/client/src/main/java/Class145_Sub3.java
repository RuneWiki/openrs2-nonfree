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

@OriginalClass("client!uja")
public final class Class145_Sub3 extends Class145 {

	@OriginalMember(owner = "client!uja", name = "gf", descriptor = "I")
	public int anInt10030;

	@OriginalMember(owner = "client!uja", name = "Te", descriptor = "I")
	public int anInt10039;

	@OriginalMember(owner = "client!uja", name = "sb", descriptor = "I")
	private int anInt10092;

	@OriginalMember(owner = "client!uja", name = "Og", descriptor = "I")
	private int anInt10094;

	@OriginalMember(owner = "client!uja", name = "nb", descriptor = "I")
	public int anInt10142;

	@OriginalMember(owner = "client!uja", name = "Ac", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!uja", name = "qh", descriptor = "Lclient!sc;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!uja", name = "gh", descriptor = "Lclient!sc;")
	private Interface22 anInterface22_2;

	@OriginalMember(owner = "client!uja", name = "ic", descriptor = "Lclient!hi;")
	private Class155 aClass155_6;

	@OriginalMember(owner = "client!uja", name = "fe", descriptor = "Lclient!td;")
	private Class43_Sub3 aClass43_Sub3_1;

	@OriginalMember(owner = "client!uja", name = "ae", descriptor = "I")
	public int anInt10148;

	@OriginalMember(owner = "client!uja", name = "Jd", descriptor = "I")
	private int anInt10149;

	@OriginalMember(owner = "client!uja", name = "Yf", descriptor = "I")
	public int anInt10150;

	@OriginalMember(owner = "client!uja", name = "Re", descriptor = "I")
	private int anInt10151;

	@OriginalMember(owner = "client!uja", name = "Ie", descriptor = "Z")
	private boolean aBoolean848;

	@OriginalMember(owner = "client!uja", name = "bd", descriptor = "Z")
	private boolean aBoolean849;

	@OriginalMember(owner = "client!uja", name = "Fc", descriptor = "I")
	private int anInt10152;

	@OriginalMember(owner = "client!uja", name = "R", descriptor = "I")
	private int anInt10153;

	@OriginalMember(owner = "client!uja", name = "rd", descriptor = "Z")
	private boolean aBoolean850;

	@OriginalMember(owner = "client!uja", name = "Sb", descriptor = "Z")
	private boolean aBoolean851;

	@OriginalMember(owner = "client!uja", name = "hd", descriptor = "J")
	private long aLong314;

	@OriginalMember(owner = "client!uja", name = "of", descriptor = "Ljava/lang/String;")
	private String aString112;

	@OriginalMember(owner = "client!uja", name = "re", descriptor = "Lclient!ke;")
	private Class64_Sub4_Sub1 aClass64_Sub4_Sub1_5;

	@OriginalMember(owner = "client!uja", name = "C", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!uja", name = "Sd", descriptor = "Z")
	public boolean aBoolean853;

	@OriginalMember(owner = "client!uja", name = "Cf", descriptor = "I")
	private int anInt10156;

	@OriginalMember(owner = "client!uja", name = "X", descriptor = "Z")
	private boolean aBoolean854;

	@OriginalMember(owner = "client!uja", name = "vd", descriptor = "I")
	private int anInt10157;

	@OriginalMember(owner = "client!uja", name = "We", descriptor = "I")
	public int anInt10159;

	@OriginalMember(owner = "client!uja", name = "sc", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!uja", name = "mb", descriptor = "I")
	public int anInt10161;

	@OriginalMember(owner = "client!uja", name = "Be", descriptor = "Lclient!kw;")
	private Interface13 anInterface13_6;

	@OriginalMember(owner = "client!uja", name = "Mf", descriptor = "Z")
	private boolean aBoolean856;

	@OriginalMember(owner = "client!uja", name = "ug", descriptor = "F")
	private float aFloat156;

	@OriginalMember(owner = "client!uja", name = "Wc", descriptor = "Lclient!ng;")
	public Class64_Sub4 aClass64_Sub4_6;

	@OriginalMember(owner = "client!uja", name = "ub", descriptor = "Z")
	public boolean aBoolean857;

	@OriginalMember(owner = "client!uja", name = "lc", descriptor = "I")
	private int anInt10165;

	@OriginalMember(owner = "client!uja", name = "hb", descriptor = "I")
	private int anInt10166;

	@OriginalMember(owner = "client!uja", name = "zc", descriptor = "Z")
	public boolean aBoolean858;

	@OriginalMember(owner = "client!uja", name = "wd", descriptor = "Lclient!hi;")
	public Class155 aClass155_7;

	@OriginalMember(owner = "client!uja", name = "be", descriptor = "Lclient!u;")
	private Class74_Sub2 aClass74_Sub2_1;

	@OriginalMember(owner = "client!uja", name = "Q", descriptor = "Z")
	private boolean aBoolean859;

	@OriginalMember(owner = "client!uja", name = "me", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!uja", name = "Vf", descriptor = "I")
	private int anInt10168;

	@OriginalMember(owner = "client!uja", name = "cg", descriptor = "Z")
	public boolean aBoolean861;

	@OriginalMember(owner = "client!uja", name = "md", descriptor = "Z")
	public boolean aBoolean862;

	@OriginalMember(owner = "client!uja", name = "oe", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!uja", name = "cd", descriptor = "Lclient!ib;")
	public Class170 aClass170_15;

	@OriginalMember(owner = "client!uja", name = "kd", descriptor = "Z")
	public boolean aBoolean863;

	@OriginalMember(owner = "client!uja", name = "Ee", descriptor = "Z")
	private boolean aBoolean864;

	@OriginalMember(owner = "client!uja", name = "zf", descriptor = "Lclient!jv;")
	private Interface12 anInterface12_5;

	@OriginalMember(owner = "client!uja", name = "E", descriptor = "I")
	public int anInt10170;

	@OriginalMember(owner = "client!uja", name = "wf", descriptor = "I")
	public int anInt10171;

	@OriginalMember(owner = "client!uja", name = "qc", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!uja", name = "jd", descriptor = "F")
	private float aFloat163;

	@OriginalMember(owner = "client!uja", name = "Wb", descriptor = "Z")
	public boolean aBoolean866;

	@OriginalMember(owner = "client!uja", name = "ig", descriptor = "I")
	private int anInt10177;

	@OriginalMember(owner = "client!uja", name = "Pg", descriptor = "Z")
	private boolean aBoolean867;

	@OriginalMember(owner = "client!uja", name = "qg", descriptor = "Z")
	public boolean aBoolean868;

	@OriginalMember(owner = "client!uja", name = "Fd", descriptor = "I")
	private int anInt10180;

	@OriginalMember(owner = "client!uja", name = "Ff", descriptor = "Lclient!kw;")
	private Interface13 anInterface13_7;

	@OriginalMember(owner = "client!uja", name = "ld", descriptor = "F")
	private float aFloat169;

	@OriginalMember(owner = "client!uja", name = "Oe", descriptor = "Z")
	private boolean aBoolean869;

	@OriginalMember(owner = "client!uja", name = "t", descriptor = "Z")
	private boolean aBoolean870;

	@OriginalMember(owner = "client!uja", name = "Ke", descriptor = "Lclient!ib;")
	public Class170 aClass170_16;

	@OriginalMember(owner = "client!uja", name = "D", descriptor = "I")
	private int anInt10183;

	@OriginalMember(owner = "client!uja", name = "Jg", descriptor = "Ljava/lang/String;")
	private String aString113;

	@OriginalMember(owner = "client!uja", name = "Uf", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!uja", name = "oh", descriptor = "Z")
	public boolean aBoolean871;

	@OriginalMember(owner = "client!uja", name = "Ib", descriptor = "Z")
	public boolean aBoolean872;

	@OriginalMember(owner = "client!uja", name = "fd", descriptor = "[Lclient!jca;")
	private Class64[] aClass64Array1;

	@OriginalMember(owner = "client!uja", name = "vb", descriptor = "I")
	private int anInt10188;

	@OriginalMember(owner = "client!uja", name = "kb", descriptor = "I")
	private int anInt10189;

	@OriginalMember(owner = "client!uja", name = "bg", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!uja", name = "og", descriptor = "I")
	public int anInt10128 = 128;

	@OriginalMember(owner = "client!uja", name = "ec", descriptor = "Lclient!tp;")
	private final Class359 aClass359_1 = new Class359();

	@OriginalMember(owner = "client!uja", name = "ie", descriptor = "Lclient!dla;")
	private final Class86_Sub1 aClass86_Sub1_1 = new Class86_Sub1();

	@OriginalMember(owner = "client!uja", name = "Bd", descriptor = "Lclient!dla;")
	public final Class86_Sub1 aClass86_Sub1_2 = new Class86_Sub1();

	@OriginalMember(owner = "client!uja", name = "mh", descriptor = "I")
	public int anInt10143 = 8;

	@OriginalMember(owner = "client!uja", name = "Yd", descriptor = "I")
	public int anInt10144 = 3;

	@OriginalMember(owner = "client!uja", name = "He", descriptor = "Z")
	private boolean aBoolean847 = false;

	@OriginalMember(owner = "client!uja", name = "ee", descriptor = "Lclient!cga;")
	private final Class60 aClass60_205 = new Class60();

	@OriginalMember(owner = "client!uja", name = "nh", descriptor = "[Lclient!sc;")
	private final Interface22[] anInterface22Array2 = new Interface22[4];

	@OriginalMember(owner = "client!uja", name = "rg", descriptor = "I")
	private int anInt10146 = -1;

	@OriginalMember(owner = "client!uja", name = "Nc", descriptor = "[Lclient!sc;")
	private final Interface22[] anInterface22Array1 = new Interface22[4];

	@OriginalMember(owner = "client!uja", name = "Uc", descriptor = "I")
	private int anInt10145 = -1;

	@OriginalMember(owner = "client!uja", name = "gg", descriptor = "[Lclient!sc;")
	private final Interface22[] anInterface22Array3 = new Interface22[4];

	@OriginalMember(owner = "client!uja", name = "G", descriptor = "I")
	private int anInt10147 = -1;

	@OriginalMember(owner = "client!uja", name = "ac", descriptor = "Lclient!cga;")
	private final Class60 aClass60_206;

	@OriginalMember(owner = "client!uja", name = "Y", descriptor = "Lclient!cga;")
	private final Class60 aClass60_207;

	@OriginalMember(owner = "client!uja", name = "Yb", descriptor = "Lclient!cga;")
	private final Class60 aClass60_208;

	@OriginalMember(owner = "client!uja", name = "Xc", descriptor = "Lclient!cga;")
	private final Class60 aClass60_209;

	@OriginalMember(owner = "client!uja", name = "ud", descriptor = "Lclient!cga;")
	private final Class60 aClass60_210;

	@OriginalMember(owner = "client!uja", name = "P", descriptor = "Lclient!cga;")
	private final Class60 aClass60_211;

	@OriginalMember(owner = "client!uja", name = "Hc", descriptor = "Lclient!cga;")
	private final Class60 aClass60_212;

	@OriginalMember(owner = "client!uja", name = "Ze", descriptor = "Lclient!dla;")
	public final Class86_Sub1 aClass86_Sub1_3;

	@OriginalMember(owner = "client!uja", name = "zd", descriptor = "Lclient!dla;")
	public final Class86_Sub1 aClass86_Sub1_4;

	@OriginalMember(owner = "client!uja", name = "ah", descriptor = "Lclient!dla;")
	public final Class86_Sub1 aClass86_Sub1_5;

	@OriginalMember(owner = "client!uja", name = "Kg", descriptor = "F")
	private float aFloat153;

	@OriginalMember(owner = "client!uja", name = "dc", descriptor = "I")
	private int anInt10154;

	@OriginalMember(owner = "client!uja", name = "fc", descriptor = "I")
	public int anInt10158;

	@OriginalMember(owner = "client!uja", name = "df", descriptor = "[F")
	private final float[] aFloatArray63;

	@OriginalMember(owner = "client!uja", name = "hg", descriptor = "I")
	private int anInt10163;

	@OriginalMember(owner = "client!uja", name = "ih", descriptor = "I")
	public int anInt10164;

	@OriginalMember(owner = "client!uja", name = "fg", descriptor = "I")
	private int anInt10162;

	@OriginalMember(owner = "client!uja", name = "xg", descriptor = "I")
	private int anInt10160;

	@OriginalMember(owner = "client!uja", name = "pe", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!uja", name = "Eg", descriptor = "[F")
	public final float[] aFloatArray62;

	@OriginalMember(owner = "client!uja", name = "Xe", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!uja", name = "Lc", descriptor = "I")
	private int anInt10155;

	@OriginalMember(owner = "client!uja", name = "Qf", descriptor = "I")
	private int anInt10172;

	@OriginalMember(owner = "client!uja", name = "qd", descriptor = "[Lclient!bba;")
	private final Class2_Sub7[] aClass2_Sub7Array6;

	@OriginalMember(owner = "client!uja", name = "ne", descriptor = "I")
	public int anInt10169;

	@OriginalMember(owner = "client!uja", name = "Le", descriptor = "I")
	private int anInt10175;

	@OriginalMember(owner = "client!uja", name = "Pd", descriptor = "I")
	public int anInt10174;

	@OriginalMember(owner = "client!uja", name = "Bf", descriptor = "I")
	public int anInt10167;

	@OriginalMember(owner = "client!uja", name = "jc", descriptor = "F")
	public float aFloat157;

	@OriginalMember(owner = "client!uja", name = "Rd", descriptor = "F")
	private float aFloat167;

	@OriginalMember(owner = "client!uja", name = "pc", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!uja", name = "yb", descriptor = "Z")
	private boolean aBoolean865;

	@OriginalMember(owner = "client!uja", name = "mc", descriptor = "I")
	private int anInt10176;

	@OriginalMember(owner = "client!uja", name = "M", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!uja", name = "jg", descriptor = "F")
	private float aFloat166;

	@OriginalMember(owner = "client!uja", name = "Xg", descriptor = "I")
	public int anInt10173;

	@OriginalMember(owner = "client!uja", name = "bc", descriptor = "[Lclient!bm;")
	public final Class45_Sub1[] aClass45_Sub1Array2;

	@OriginalMember(owner = "client!uja", name = "id", descriptor = "I")
	public int anInt10179;

	@OriginalMember(owner = "client!uja", name = "nf", descriptor = "[Lclient!bm;")
	public final Class45_Sub1[] aClass45_Sub1Array1;

	@OriginalMember(owner = "client!uja", name = "ce", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!uja", name = "Dd", descriptor = "I")
	public int anInt10178;

	@OriginalMember(owner = "client!uja", name = "zg", descriptor = "I")
	private int anInt10182;

	@OriginalMember(owner = "client!uja", name = "Se", descriptor = "F")
	private float aFloat164;

	@OriginalMember(owner = "client!uja", name = "Gc", descriptor = "I")
	public int anInt10184;

	@OriginalMember(owner = "client!uja", name = "gd", descriptor = "F")
	private float aFloat171;

	@OriginalMember(owner = "client!uja", name = "qf", descriptor = "[F")
	private final float[] aFloatArray65;

	@OriginalMember(owner = "client!uja", name = "Gg", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!uja", name = "Md", descriptor = "Z")
	private boolean aBoolean873;

	@OriginalMember(owner = "client!uja", name = "Nb", descriptor = "I")
	private int anInt10185;

	@OriginalMember(owner = "client!uja", name = "B", descriptor = "I")
	public int anInt10186;

	@OriginalMember(owner = "client!uja", name = "db", descriptor = "[F")
	private final float[] aFloatArray64;

	@OriginalMember(owner = "client!uja", name = "Ab", descriptor = "[F")
	private final float[] aFloatArray66;

	@OriginalMember(owner = "client!uja", name = "fh", descriptor = "I")
	public int anInt10187;

	@OriginalMember(owner = "client!uja", name = "Vb", descriptor = "Lclient!hq;")
	public Class2_Sub20_Sub1 aClass2_Sub20_Sub1_3;

	@OriginalMember(owner = "client!uja", name = "O", descriptor = "[I")
	public int[] anIntArray715;

	@OriginalMember(owner = "client!uja", name = "kg", descriptor = "[I")
	public int[] anIntArray714;

	@OriginalMember(owner = "client!uja", name = "Wg", descriptor = "[B")
	public final byte[] aByteArray115;

	@OriginalMember(owner = "client!uja", name = "Id", descriptor = "[I")
	public int[] anIntArray716;

	@OriginalMember(owner = "client!uja", name = "Ub", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas11;

	@OriginalMember(owner = "client!uja", name = "y", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!uja", name = "Gf", descriptor = "I")
	public final int anInt10104;

	@OriginalMember(owner = "client!uja", name = "nd", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!uja", name = "Wf", descriptor = "J")
	private final long aLong313;

	@OriginalMember(owner = "client!uja", name = "xd", descriptor = "J")
	private long aLong312;

	@OriginalMember(owner = "client!uja", name = "u", descriptor = "I")
	public final int anInt10181;

	@OriginalMember(owner = "client!uja", name = "Od", descriptor = "Z")
	public boolean aBoolean852;

	@OriginalMember(owner = "client!uja", name = "Kb", descriptor = "Z")
	private boolean aBoolean877;

	@OriginalMember(owner = "client!uja", name = "ib", descriptor = "Z")
	public boolean aBoolean874;

	@OriginalMember(owner = "client!uja", name = "qe", descriptor = "Z")
	public boolean aBoolean860;

	@OriginalMember(owner = "client!uja", name = "Jf", descriptor = "Z")
	public boolean aBoolean855;

	@OriginalMember(owner = "client!uja", name = "cf", descriptor = "Z")
	private boolean aBoolean878;

	@OriginalMember(owner = "client!uja", name = "le", descriptor = "Z")
	public boolean aBoolean876;

	@OriginalMember(owner = "client!uja", name = "ng", descriptor = "Z")
	private final boolean aBoolean875;

	@OriginalMember(owner = "client!uja", name = "rb", descriptor = "Lclient!sja;")
	private final Class338 aClass338_1;

	@OriginalMember(owner = "client!uja", name = "td", descriptor = "Lclient!fj;")
	public final Class121 aClass121_1;

	@OriginalMember(owner = "client!uja", name = "bh", descriptor = "Lclient!iq;")
	private final Class186 aClass186_1;

	@OriginalMember(owner = "client!uja", name = "ef", descriptor = "Lclient!ig;")
	private Class2_Sub1_Sub1 aClass2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!uja", name = "Zb", descriptor = "Lclient!pl;")
	private final Class294 aClass294_1;

	@OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class145_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class388();
		new Class218(16);
		this.aClass60_206 = new Class60();
		this.aClass60_207 = new Class60();
		this.aClass60_208 = new Class60();
		this.aClass60_209 = new Class60();
		this.aClass60_210 = new Class60();
		this.aClass60_211 = new Class60();
		this.aClass60_212 = new Class60();
		this.aClass86_Sub1_3 = new Class86_Sub1();
		this.aClass86_Sub1_4 = new Class86_Sub1();
		this.aClass86_Sub1_5 = new Class86_Sub1();
		this.aFloat153 = 0.0F;
		this.anInt10154 = 8448;
		this.anInt10158 = 512;
		this.aFloatArray63 = new float[4];
		this.anInt10163 = -1;
		this.anInt10164 = 50;
		this.anInt10162 = 0;
		this.anInt10160 = 0;
		this.aFloat161 = 3584.0F;
		this.aFloatArray62 = new float[4];
		this.aFloat162 = 3584.0F;
		this.anInt10155 = 0;
		this.anInt10172 = 0;
		this.aClass2_Sub7Array6 = new Class2_Sub7[Static692.anInt10649];
		this.anInt10169 = 512;
		this.anInt10175 = 0;
		this.anInt10174 = 0;
		this.anInt10167 = -1;
		this.aFloat157 = 1.0F;
		this.aFloat167 = -1.0F;
		this.aFloat165 = -1.0F;
		this.aBoolean865 = false;
		this.anInt10176 = 3584;
		this.aFloat168 = 1.0F;
		this.aFloat166 = 1.0F;
		this.anInt10173 = 0;
		this.aClass45_Sub1Array2 = new Class45_Sub1[7];
		this.anInt10179 = 0;
		this.aClass45_Sub1Array1 = new Class45_Sub1[7];
		this.aFloat170 = -1.0F;
		this.anInt10178 = 0;
		this.anInt10182 = 8448;
		this.aFloat164 = -1.0F;
		this.anInt10184 = -1;
		this.aFloat171 = 1.0F;
		this.aFloatArray65 = new float[4];
		this.aFloat173 = 1.0F;
		this.aBoolean873 = true;
		this.anInt10185 = 0;
		this.anInt10186 = -1;
		this.aFloatArray64 = new float[4];
		this.aFloatArray66 = new float[16];
		this.anInt10187 = -1;
		this.aClass2_Sub20_Sub1_3 = new Class2_Sub20_Sub1(8192);
		this.anIntArray715 = new int[1];
		this.anIntArray714 = new int[1];
		this.aByteArray115 = new byte[16384];
		this.anIntArray716 = new int[1];
		this.aCanvas10 = this.aCanvas11 = arg0;
		this.anInt10104 = arg2;
		if (!Static548.method7659("jaclib")) {
			throw new RuntimeException("");
		} else if (Static548.method7659("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong312 = this.aLong313 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt10104);
				if (this.aLong313 == 0L) {
					throw new RuntimeException("");
				}
				this.method8893();
				@Pc(349) int local349 = this.method8892();
				if (local349 != 0) {
					throw new RuntimeException("");
				}
				this.anInt10181 = this.aBoolean872 ? 33639 : 5121;
				if (this.aString113.indexOf("radeon") != -1) {
					@Pc(380) int local380 = 0;
					@Pc(382) boolean local382 = false;
					@Pc(384) boolean local384 = false;
					@Pc(393) String[] local393 = Static100.method1530(this.aString113.replace('/', ' '), ' ');
					for (@Pc(395) int local395 = 0; local395 < local393.length; local395++) {
						@Pc(401) String local401 = local393[local395];
						try {
							if (local401.length() > 0) {
								if (local401.charAt(0) == 'x' && local401.length() >= 3 && Static716.method9519(local401.substring(1, 3))) {
									local401 = local401.substring(1);
									local384 = true;
								}
								if (local401.equals("hd")) {
									local382 = true;
								} else {
									if (local401.startsWith("hd")) {
										local382 = true;
										local401 = local401.substring(2);
									}
									if (local401.length() >= 4 && Static716.method9519(local401.substring(0, 4))) {
										local380 = Static171.method2545(local401.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(480) Exception local480) {
						}
					}
					if (!local384 && !local382) {
						if (local380 >= 7000 && local380 <= 9250) {
							this.aBoolean852 = false;
						}
						if (local380 >= 7000 && local380 <= 7999) {
							this.aBoolean877 = false;
						}
					}
					if (!local382 || local380 < 4000) {
						this.aBoolean874 = false;
					}
					this.aBoolean860 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean855 = true;
					this.aBoolean878 = this.aBoolean877;
				}
				if (this.aString112.indexOf("intel") != -1) {
					this.aBoolean876 = false;
				}
				this.aBoolean875 = !this.aString112.equals("s3 graphics");
				if (this.aBoolean877) {
					try {
						@Pc(587) int[] local587 = new int[1];
						OpenGL.glGenBuffersARB(1, local587, 0);
					} catch (@Pc(593) Throwable local593) {
						throw new RuntimeException("");
					}
				}
				Static669.method9116(false, true);
				this.aBoolean847 = true;
				this.aClass338_1 = new Class338(this, super.anInterface3_12);
				this.method8889();
				this.aClass121_1 = new Class121(this);
				this.aClass186_1 = new Class186(this);
				if (this.aClass186_1.method3948()) {
					this.aClass2_Sub1_Sub1_1 = new Class2_Sub1_Sub1(this);
					if (!this.aClass2_Sub1_Sub1_1.method3769()) {
						this.aClass2_Sub1_Sub1_1.method3765();
						this.aClass2_Sub1_Sub1_1 = null;
					}
				}
				this.aClass294_1 = new Class294(this);
				this.method8891();
				this.method8904();
				this.method9636();
			} catch (@Pc(671) Throwable local671) {
				local671.printStackTrace();
				this.method9642();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "()Z")
	@Override
	public boolean method9671() {
		return true;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(ZZ)V")
	public void method8844(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean849) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean849 = arg0;
		this.anInt10151 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!uja", name = "t", descriptor = "(I)V")
	private void method8845() {
		if (this.aBoolean864 && !this.aBoolean856) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!uja", name = "D", descriptor = "(I)V")
	public void method8846() {
		if (this.anInt10151 == 4) {
			return;
		}
		this.method8852();
		this.method8885(false);
		this.method8907(false);
		this.method8844(false);
		this.method8905(false);
		this.method8881(-2);
		this.method8847(1);
		this.anInt10151 = 4;
	}

	@OriginalMember(owner = "client!uja", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = (float) arg2 * this.aClass86_Sub1_3.aFloat19 + (float) arg1 * this.aClass86_Sub1_3.aFloat20 + (float) arg0 * this.aClass86_Sub1_3.aFloat12 + this.aClass86_Sub1_3.aFloat22;
		if ((float) this.anInt10164 > local28 || (float) this.anInt10176 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(89) int local89 = (int) ((float) this.anInt10169 * (this.aClass86_Sub1_3.aFloat14 * (float) arg2 + this.aClass86_Sub1_3.aFloat11 * (float) arg1 + this.aClass86_Sub1_3.aFloat17 * (float) arg0 + this.aClass86_Sub1_3.aFloat21) / (float) arg3);
		@Pc(122) int local122 = (int) ((float) this.anInt10158 * (this.aClass86_Sub1_3.aFloat18 * (float) arg2 + this.aClass86_Sub1_3.aFloat16 * (float) arg1 + (float) arg0 * this.aClass86_Sub1_3.aFloat15 + this.aClass86_Sub1_3.aFloat13) / (float) arg3);
		if ((float) local89 >= this.aFloat155 && (float) local89 <= this.aFloat154 && (float) local122 >= this.aFloat172 && this.aFloat159 >= (float) local122) {
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local122 - this.aFloat172);
			arg4[0] = (int) ((float) local89 - this.aFloat155);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!uja", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt10160 = 0;
		this.anInt10155 = this.anInt10030;
		this.anInt10172 = 0;
		this.anInt10185 = this.anInt10039;
		OpenGL.glDisable(3089);
		this.method8922();
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Z)V")
	@Override
	public void method9659(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uja", name = "l", descriptor = "(II)V")
	public void method8847(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt10153) {
			return;
		}
		@Pc(46) boolean local46;
		@Pc(50) byte local50;
		if (arg0 == 1) {
			local50 = 1;
			local46 = true;
		} else if (arg0 == 2) {
			local46 = false;
			local50 = 2;
		} else if (arg0 == 128) {
			local46 = true;
			local50 = 3;
		} else {
			local46 = false;
			local50 = 0;
		}
		if (!this.aBoolean848) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean848 = true;
		}
		if (this.aBoolean850 != local46) {
			if (local46) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean850 = local46;
		}
		if (local50 != this.anInt10152) {
			if (local50 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local50 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local50 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt10152 = local50;
		}
		this.anInt10153 = arg0;
		this.anInt10151 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!uja", name = "n", descriptor = "(I)V")
	public void method8848() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!uja", name = "f", descriptor = "(Z)V")
	private void method8849() {
		if (this.anInt10156 != 2) {
			this.anInt10156 = 2;
			this.method8867();
			this.method8919();
			this.anInt10151 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!uja", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt10176;
	}

	@OriginalMember(owner = "client!uja", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt10164 == arg0 && this.anInt10176 == arg1) {
			return;
		}
		this.anInt10176 = arg1;
		this.anInt10164 = arg0;
		this.method8886();
		this.method8890();
		if (this.anInt10156 == 3) {
			this.method8883();
		} else if (this.anInt10156 == 2) {
			this.method8867();
			return;
		}
	}

	@OriginalMember(owner = "client!uja", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8905(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!uja", name = "o", descriptor = "(I)V")
	private void method8850() {
		if (this.aBoolean854 && this.anInt10187 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!uja", name = "q", descriptor = "()Lclient!bo;")
	@Override
	public Class47 method9653() {
		@Pc(7) int local7 = -1;
		if (this.aString112.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString112.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString112.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class47(local7, "OpenGL", this.anInt10180, this.aString113, 0L);
	}

	@OriginalMember(owner = "client!uja", name = "v", descriptor = "(I)V")
	private void method8851() {
		if (this.anInt10151 == 1) {
			return;
		}
		this.method8852();
		this.method8885(false);
		this.method8907(false);
		this.method8844(false);
		this.method8905(false);
		this.method8872((Class64) null);
		this.method8881(-2);
		this.method8900(1);
		this.anInt10151 = 1;
	}

	@OriginalMember(owner = "client!uja", name = "w", descriptor = "(I)V")
	private void method8852() {
		if (this.anInt10156 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt10039 > 0 && this.anInt10030 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt10039, (double) this.anInt10030, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt10156 = 1;
		this.anInt10151 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!uja", name = "f", descriptor = "(B)V")
	public void method8853() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray62, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "(IIII)V")
	public void method8854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!uja", name = "l", descriptor = "(I)V")
	public void method8855() {
		if (this.anInt10156 != 0) {
			this.anInt10156 = 0;
			this.anInt10151 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class133 method9679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class133_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(FBFFF)V")
	public void method8856(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static441.aFloatArray51[1] = arg1;
		Static441.aFloatArray51[2] = arg2;
		Static441.aFloatArray51[0] = arg0;
		Static441.aFloatArray51[3] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static441.aFloatArray51, 0);
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(IIII)V")
	public void method8857(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!uja", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt10167 && this.anInt10187 == arg1 && this.anInt10179 == arg2) {
			return;
		}
		this.anInt10167 = arg0;
		this.anInt10179 = arg2;
		this.anInt10187 = arg1;
		this.method8890();
		this.method8850();
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!sc;I)V")
	public void method8858(@OriginalArg(0) Interface22 arg0) {
		if (this.anInt10146 < 0 || arg0 != this.anInterface22Array2[this.anInt10146]) {
			throw new RuntimeException();
		}
		this.anInterface22Array2[this.anInt10146--] = null;
		arg0.method3374();
		if (this.anInt10146 < 0) {
			this.anInterface22_2 = null;
		} else {
			this.anInterface22_2 = this.anInterface22Array2[this.anInt10146];
			this.anInterface22_2.method3377();
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method9662(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas11) {
			local5 = this.aLong313;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(31) Long local31 = (Long) this.aHashtable6.get(arg0);
			local5 = local31;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas10 == arg0) {
			this.method8904();
		}
	}

	@OriginalMember(owner = "client!uja", name = "j", descriptor = "(II)V")
	public void method8859(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt10177) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt10177 = arg0;
		}
	}

	@OriginalMember(owner = "client!uja", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10158 = arg3;
		this.anInt10173 = arg0;
		this.anInt10178 = arg1;
		this.anInt10169 = arg2;
		this.method8886();
		this.method8922();
		if (this.anInt10156 == 3) {
			this.method8883();
		} else if (this.anInt10156 == 2) {
			this.method8867();
			return;
		}
	}

	@OriginalMember(owner = "client!uja", name = "A", descriptor = "(I)Lclient!el;")
	public Class64_Sub2 method8860() {
		return this.aClass74_Sub2_1 == null ? null : this.aClass74_Sub2_1.method7519();
	}

	@OriginalMember(owner = "client!uja", name = "B", descriptor = "(I)V")
	private void method8861() {
		OpenGL.glDepthMask(this.aBoolean851 && this.aBoolean873);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(FB)V")
	public void method8862(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat166) {
			this.aFloat166 = arg0;
			if (this.anInt10156 == 3) {
				this.method8883();
			}
		}
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method9631(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas11) {
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

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!tia;Z)Lclient!ug;")
	@Override
	public Class43 method9683(@OriginalArg(0) Class355 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt9470 * arg0.anInt9469];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray106 == null) {
			for (local21 = 0; local21 < arg0.anInt9470; local21++) {
				for (local25 = 0; local25 < arg0.anInt9469; local25++) {
					@Pc(91) int local91 = arg0.anIntArray689[arg0.aByteArray107[local14++] & 0xFF];
					local12[local16++] = local91 == 0 ? 0 : local91 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt9470; local21++) {
				for (local25 = 0; local25 < arg0.anInt9469; local25++) {
					local12[local16++] = arg0.anIntArray689[arg0.aByteArray107[local14] & 0xFF] | arg0.aByteArray106[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(135) Class43 local135 = this.method9711(arg0.anInt9469, arg0.anInt9469, arg0.anInt9470, local12);
		local135.method9586(arg0.anInt9468, arg0.anInt9472, arg0.anInt9471, arg0.anInt9473);
		return local135;
	}

	@OriginalMember(owner = "client!uja", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Class64_Sub4_Sub1 local9 = local6.aClass64_Sub4_Sub1_1;
		this.method8894();
		this.method8872(local6.aClass64_Sub4_Sub1_1);
		this.method8847(1);
		this.method8897(8448, 7681);
		this.method8854(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat67 / (float) local9.anInt5009;
		@Pc(46) float local46 = local9.aFloat68 / (float) local9.anInt5010;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt10160 - arg2) * local39, local46 * (float) (this.anInt10172 - arg3));
		OpenGL.glVertex2i(this.anInt10160, this.anInt10172);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt10160 - arg2), (float) (this.anInt10155 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt10160, this.anInt10155);
		OpenGL.glTexCoord2f((float) (this.anInt10185 - arg2) * local39, (float) (this.anInt10155 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt10185, this.anInt10155);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt10185 - arg2), (float) (this.anInt10172 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt10185, this.anInt10172);
		OpenGL.glEnd();
		this.method8854(0, 5890, 768);
	}

	@OriginalMember(owner = "client!uja", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt10030 - arg1 - local12, arg2, 1, 32993, this.anInt10181, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(Lclient!sc;I)V")
	public void method8863(@OriginalArg(0) Interface22 arg0) {
		if (this.aBoolean866) {
			this.method8871(arg0);
			this.method8858(arg0);
		} else if (this.anInt10147 >= 0 && arg0 == this.anInterface22Array1[this.anInt10147]) {
			this.anInterface22Array1[this.anInt10147--] = null;
			arg0.method3378();
			if (this.anInt10147 < 0) {
				this.anInterface22_1 = this.anInterface22_2 = null;
			} else {
				this.anInterface22_1 = this.anInterface22_2 = this.anInterface22Array1[this.anInt10147];
				this.anInterface22_1.method3375();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uja", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8851();
		this.method8847(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!uja", name = "h", descriptor = "()V")
	@Override
	public void method9636() {
		if (!this.aBoolean875 || this.anInt10039 <= 0 || this.anInt10030 <= 0) {
			return;
		}
		@Pc(27) int local27 = this.anInt10160;
		@Pc(30) int local30 = this.anInt10185;
		@Pc(33) int local33 = this.anInt10172;
		@Pc(36) int local36 = this.anInt10155;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method8855();
		this.method8885(false);
		this.method8907(false);
		this.method8844(false);
		this.method8905(false);
		this.method8872((Class64) null);
		this.method8881(-2);
		this.method8900(1);
		this.method8847(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt10039, this.anInt10030, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local27, local33, local30, local36);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!mb;)V")
	@Override
	public void method9666(@OriginalArg(0) Class236 arg0) {
		this.aClass359_1.method8443(arg0, this, -1);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(II)I")
	@Override
	public int method9695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!uja", name = "u", descriptor = "()V")
	@Override
	public void method9706() {
		if (this.aBoolean876) {
			if (this.anInterface22_2 != this.aClass155_6) {
				throw new RuntimeException();
			}
			this.aClass155_6.method3380(0);
			this.aClass155_6.method3380(8);
			this.method8863(this.aClass155_6);
		} else if (this.aBoolean869) {
			this.aClass43_Sub3_1.method9597(0, 0, this.anInt10039, this.anInt10030, 0, 0);
			this.anOpenGL2.setSurface(this.aLong312);
		} else {
			throw new RuntimeException("");
		}
		this.aClass43_Sub3_1 = null;
		this.anInt10030 = this.anInt10092;
		this.anInt10039 = this.anInt10094;
		this.method8855();
		this.method8925();
		this.la();
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(ZLclient!kw;)V")
	public void method8864(@OriginalArg(1) Interface13 arg0) {
		if (arg0 != this.anInterface13_6) {
			if (this.aBoolean877) {
				OpenGL.glBindBufferARB(34962, arg0.method8069());
			}
			this.anInterface13_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!dla;B)V")
	public void method8865(@OriginalArg(0) Class86_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method1810(), 0);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(ILclient!jv;)V")
	public void method8866(@OriginalArg(1) Interface12 arg0) {
		if (this.anInterface12_5 != arg0) {
			if (this.aBoolean877) {
				OpenGL.glBindBufferARB(34963, arg0.method7102());
			}
			this.anInterface12_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!pga;[Lclient!tia;Z)Lclient!da;")
	@Override
	public Class68 method9707(@OriginalArg(0) Class289 arg0, @OriginalArg(1) Class355[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class68_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(B)V")
	private void method8867() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray66, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!uja", name = "e", descriptor = "(B)V")
	public void method8868() {
		if (this.anInt10151 == 16) {
			return;
		}
		this.method8923();
		this.method8885(true);
		this.method8844(true);
		this.method8905(true);
		this.method8847(1);
		this.anInt10151 = 16;
	}

	@OriginalMember(owner = "client!uja", name = "x", descriptor = "()Z")
	@Override
	public boolean method9675() {
		return this.aBoolean859 && (!this.method9632() || this.aBoolean870);
	}

	@OriginalMember(owner = "client!uja", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method9643(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class2_Sub2 local19;
		while (!this.aClass60_207.method1221()) {
			local19 = (Class2_Sub2) this.aClass60_207.method1225();
			Static216.anIntArray272[local11++] = (int) local19.aLong352;
			this.anInt10148 -= local19.anInt41;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static216.anIntArray272, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static216.anIntArray272, 0);
			local11 = 0;
		}
		while (!this.aClass60_208.method1221()) {
			local19 = (Class2_Sub2) this.aClass60_208.method1225();
			Static216.anIntArray272[local11++] = (int) local19.aLong352;
			this.anInt10150 -= local19.anInt41;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static216.anIntArray272, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static216.anIntArray272, 0);
			local11 = 0;
		}
		while (!this.aClass60_209.method1221()) {
			local19 = (Class2_Sub2) this.aClass60_209.method1225();
			Static216.anIntArray272[local11++] = local19.anInt41;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static216.anIntArray272, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static216.anIntArray272, 0);
			local11 = 0;
		}
		while (!this.aClass60_210.method1221()) {
			local19 = (Class2_Sub2) this.aClass60_210.method1225();
			Static216.anIntArray272[local11++] = (int) local19.aLong352;
			this.anInt10149 -= local19.anInt41;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static216.anIntArray272, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static216.anIntArray272, 0);
		}
		while (!this.aClass60_206.method1221()) {
			local19 = (Class2_Sub2) this.aClass60_206.method1225();
			OpenGL.glDeleteLists((int) local19.aLong352, local19.anInt41);
		}
		@Pc(222) Class2 local222;
		while (!this.aClass60_211.method1221()) {
			local222 = this.aClass60_211.method1225();
			OpenGL.glDeleteProgramARB((int) local222.aLong352);
		}
		while (!this.aClass60_212.method1221()) {
			local222 = this.aClass60_212.method1225();
			OpenGL.glDeleteObjectARB(local222.aLong352);
		}
		while (!this.aClass60_206.method1221()) {
			local19 = (Class2_Sub2) this.aClass60_206.method1225();
			OpenGL.glDeleteLists((int) local19.aLong352, local19.anInt41);
		}
		this.aClass338_1.method8125();
		if (this.E() > 100663296 && this.aLong314 + 60000L < Static567.method7863()) {
			System.gc();
			this.aLong314 = Static567.method7863();
		}
		this.anInt10142 = local9;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(FFFI)V")
	private void method8869(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean867) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean867 = true;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method9682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg5;
		@Pc(9) Class64_Sub4_Sub1 local9 = local6.aClass64_Sub4_Sub1_1;
		this.method8894();
		this.method8872(local6.aClass64_Sub4_Sub1_1);
		this.method8847(1);
		this.method8897(8448, 7681);
		this.method8854(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat67 / (float) local9.anInt5009;
		@Pc(46) float local46 = local9.aFloat68 / (float) local9.anInt5010;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local59 * local59)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(91) float local91 = local52 * local72;
		@Pc(95) float local95 = local59 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local91 + 0.35F, local95 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method8854(0, 5890, 768);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "([I)V")
	@Override
	public void method9668(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt10030;
		arg0[0] = this.anInt10039;
	}

	@OriginalMember(owner = "client!uja", name = "B", descriptor = "()V")
	@Override
	protected void method9642() {
		for (@Pc(10) Class2 local10 = this.aClass60_205.method1226(7); local10 != null; local10 = this.aClass60_205.method1228()) {
			((Class2_Sub28_Sub1) local10).method2849();
		}
		if (this.aClass186_1 != null) {
			this.aClass186_1.method3952();
		}
		if (this.anOpenGL2 != null) {
			this.method8896();
			@Pc(48) Enumeration local48 = this.aHashtable6.keys();
			while (local48.hasMoreElements()) {
				@Pc(56) Canvas local56 = (Canvas) local48.nextElement();
				@Pc(62) Long local62 = (Long) this.aHashtable6.get(local56);
				this.anOpenGL2.releaseSurface(local56, local62);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean847) {
			Static503.method2433(false, true);
			this.aBoolean847 = false;
		}
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(Lclient!sc;B)V")
	public void method8870(@OriginalArg(0) Interface22 arg0) {
		if (this.anInt10146 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt10146 >= 0) {
			this.anInterface22Array2[this.anInt10146].method3374();
		}
		this.anInterface22_2 = this.anInterface22Array2[++this.anInt10146] = arg0;
		this.anInterface22_2.method3377();
	}

	@OriginalMember(owner = "client!uja", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass86_Sub1_3.aFloat22 + (float) arg0 * this.aClass86_Sub1_3.aFloat12 + this.aClass86_Sub1_3.aFloat20 * (float) arg1 + (float) arg2 * this.aClass86_Sub1_3.aFloat19;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(78) int local78 = (int) ((this.aClass86_Sub1_3.aFloat17 * (float) arg0 + (float) arg1 * this.aClass86_Sub1_3.aFloat11 + this.aClass86_Sub1_3.aFloat14 * (float) arg2 + this.aClass86_Sub1_3.aFloat21) * (float) this.anInt10169 / local28);
		arg3[0] = (int) ((float) local78 - this.aFloat155);
		@Pc(119) int local119 = (int) ((this.aClass86_Sub1_3.aFloat13 + (float) arg2 * this.aClass86_Sub1_3.aFloat18 + (float) arg1 * this.aClass86_Sub1_3.aFloat16 + (float) arg0 * this.aClass86_Sub1_3.aFloat15) * (float) this.anInt10158 / local28);
		arg3[1] = (int) ((float) local119 - this.aFloat172);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "(Lclient!sc;B)V")
	public void method8871(@OriginalArg(0) Interface22 arg0) {
		if (this.anInt10145 < 0 || this.anInterface22Array3[this.anInt10145] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface22Array3[this.anInt10145--] = null;
		arg0.method3379();
		if (this.anInt10145 >= 0) {
			this.anInterface22_1 = this.anInterface22Array3[this.anInt10145];
			this.anInterface22_1.method3376();
		} else {
			this.anInterface22_1 = null;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method9670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method9714(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(I[Lclient!bba;)V")
	@Override
	public void method9655(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub7Array6[local7] = arg1[local7];
		}
		this.anInt10165 = arg0;
		if (this.anInt10156 != 1) {
			this.method8873();
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(BLclient!jca;)V")
	public void method8872(@OriginalArg(1) Class64 arg0) {
		@Pc(11) Class64 local11 = this.aClass64Array1[this.anInt10177];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt4996);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt4996);
				} else if (arg0.anInt4996 != local11.anInt4996) {
					OpenGL.glDisable(local11.anInt4996);
					OpenGL.glEnable(arg0.anInt4996);
				}
				OpenGL.glBindTexture(arg0.anInt4996, arg0.method4542());
			}
			this.aClass64Array1[this.anInt10177] = arg0;
		}
		this.anInt10151 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!uja", name = "l", descriptor = "()Z")
	@Override
	public boolean method9674() {
		return false;
	}

	@OriginalMember(owner = "client!uja", name = "u", descriptor = "(I)V")
	private void method8873() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt10165; local7++) {
			@Pc(14) Class2_Sub7 local14 = this.aClass2_Sub7Array6[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static299.aFloatArray25[0] = (float) local14.method8171();
			Static299.aFloatArray25[1] = (float) local14.method8174();
			Static299.aFloatArray25[2] = (float) local14.method8172();
			Static299.aFloatArray25[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static299.aFloatArray25, 0);
			@Pc(52) int local52 = local14.method8170();
			@Pc(58) float local58 = local14.method8169() / 255.0F;
			Static299.aFloatArray25[0] = (float) (local52 >> 16 & 0xFF) * local58;
			Static299.aFloatArray25[1] = local58 * (float) (local52 >> 8 & 0xFF);
			Static299.aFloatArray25[2] = local58 * (float) (local52 & 0xFF);
			OpenGL.glLightfv(local18, 4609, Static299.aFloatArray25, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method8173() * local14.method8173()));
			OpenGL.glEnable(local18);
		}
		while (local7 < this.anInt10183) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt10183 = this.anInt10165;
	}

	@OriginalMember(owner = "client!uja", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt10188;
		this.anInt10188 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIII)V")
	@Override
	public void method9702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass186_1.method3955(arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!ib;Lclient!ib;ZLclient!ib;Lclient!ib;)V")
	public void method8874(@OriginalArg(0) Class170 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(3) Class170 arg2, @OriginalArg(4) Class170 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method8864(arg1.anInterface13_4);
			OpenGL.glVertexPointer(arg1.aByte71, arg1.aShort56, this.anInterface13_6.method8067(), this.anInterface13_6.method8070() + (long) arg1.aByte70);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method8864(arg2.anInterface13_4);
			OpenGL.glNormalPointer(arg2.aShort56, this.anInterface13_6.method8067(), this.anInterface13_6.method8070() + (long) arg2.aByte70);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method8864(arg0.anInterface13_4);
			OpenGL.glColorPointer(arg0.aByte71, arg0.aShort56, this.anInterface13_6.method8067(), this.anInterface13_6.method8070() + (long) arg0.aByte70);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method8864(arg3.anInterface13_4);
			OpenGL.glTexCoordPointer(arg3.aByte71, arg3.aShort56, this.anInterface13_6.method8067(), this.anInterface13_6.method8070() + (long) arg3.aByte70);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IBI)V")
	public synchronized void method8875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2 local8 = new Class2_Sub2(arg1);
		local8.aLong352 = (long) arg0;
		this.aClass60_207.method1233(local8);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(FFB)V")
	public void method8876(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat153 = arg1;
		this.aFloat171 = arg0;
		this.method8890();
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "([IIIIIZ)Lclient!ug;")
	@Override
	public Class43 method9638(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class43_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!uja", name = "d", descriptor = "(BI)I")
	public int method8877(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(JI)V")
	public synchronized void method8878(@OriginalArg(0) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong352 = arg0;
		this.aClass60_212.method1233(local7);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub28 method9649(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub28_Sub1 local8 = new Class2_Sub28_Sub1(arg0);
		this.aClass60_205.method1233(local8);
		return local8;
	}

	@OriginalMember(owner = "client!uja", name = "G", descriptor = "(I)V")
	private void method8879() {
		Static441.aFloatArray51[1] = this.aFloat170 * this.aFloat168;
		Static441.aFloatArray51[3] = 1.0F;
		Static441.aFloatArray51[0] = this.aFloat170 * this.aFloat157;
		Static441.aFloatArray51[2] = this.aFloat170 * this.aFloat173;
		OpenGL.glLightfv(16384, 4609, Static441.aFloatArray51, 0);
		Static441.aFloatArray51[2] = this.aFloat173 * -this.aFloat165;
		Static441.aFloatArray51[0] = this.aFloat157 * -this.aFloat165;
		Static441.aFloatArray51[1] = -this.aFloat165 * this.aFloat168;
		Static441.aFloatArray51[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static441.aFloatArray51, 0);
	}

	@OriginalMember(owner = "client!uja", name = "z", descriptor = "(I)V")
	private void method8880() {
		if (this.aBoolean867) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean867 = false;
		}
	}

	@OriginalMember(owner = "client!uja", name = "k", descriptor = "(II)V")
	public void method8881(@OriginalArg(0) int arg0) {
		this.method8910(true, arg0);
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(III)V")
	public synchronized void method8882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub2 local16 = new Class2_Sub2(arg0);
		local16.aLong352 = (long) arg1;
		this.aClass60_208.method1233(local16);
	}

	@OriginalMember(owner = "client!uja", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean873 = arg0;
		this.method8861();
	}

	@OriginalMember(owner = "client!uja", name = "d", descriptor = "(B)V")
	private void method8883() {
		@Pc(15) float local15 = this.aFloat166 * (float) -this.anInt10173 / (float) this.anInt10169;
		@Pc(27) float local27 = (float) -this.anInt10178 * this.aFloat166 / (float) this.anInt10158;
		@Pc(42) float local42 = this.aFloat166 * (float) (this.anInt10039 - this.anInt10173) / (float) this.anInt10169;
		@Pc(57) float local57 = (float) (this.anInt10030 - this.anInt10178) * this.aFloat166 / (float) this.anInt10158;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local27 != local57) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) this.anInt10164, (double) this.anInt10176);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!uja", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat158 != arg0) {
			this.aFloat158 = arg0;
			this.method8903();
		}
	}

	@OriginalMember(owner = "client!uja", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8851();
		this.method8847(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!uja", name = "F", descriptor = "(I)V")
	public void method8884() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(ZI)V")
	public void method8885(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean854 != arg0) {
			this.aBoolean854 = arg0;
			this.method8850();
			this.anInt10151 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method9639(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method9644(arg2, arg3);
	}

	@OriginalMember(owner = "client!uja", name = "E", descriptor = "(I)V")
	private void method8886() {
		@Pc(6) float[] local6 = this.aFloatArray66;
		@Pc(18) float local18 = (float) (this.anInt10164 * -this.anInt10173) / (float) this.anInt10169;
		@Pc(41) float local41 = (float) (this.anInt10164 * (this.anInt10039 - this.anInt10173)) / (float) this.anInt10169;
		@Pc(52) float local52 = (float) (this.anInt10164 * this.anInt10178) / (float) this.anInt10158;
		@Pc(67) float local67 = (float) (this.anInt10164 * (this.anInt10178 - this.anInt10030)) / (float) this.anInt10158;
		if (local18 == local41 || local67 == local52) {
			local6[8] = 0.0F;
			local6[3] = 0.0F;
			local6[10] = 1.0F;
			local6[2] = 0.0F;
			local6[14] = 0.0F;
			local6[4] = 0.0F;
			local6[11] = 0.0F;
			local6[13] = 0.0F;
			local6[9] = 0.0F;
			local6[7] = 0.0F;
			local6[1] = 0.0F;
			local6[0] = 1.0F;
			local6[12] = 0.0F;
			local6[5] = 1.0F;
			local6[6] = 0.0F;
			local6[15] = 1.0F;
		} else {
			@Pc(151) float local151 = (float) this.anInt10164 * 2.0F;
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[0] = local151 / (local41 - local18);
			local6[15] = 0.0F;
			local6[10] = this.aFloat169 = (float) -(this.anInt10176 + this.anInt10164) / (float) (this.anInt10176 - this.anInt10164);
			local6[6] = 0.0F;
			local6[11] = -1.0F;
			local6[12] = 0.0F;
			local6[2] = 0.0F;
			local6[14] = this.aFloat163 = -(local151 * (float) this.anInt10176) / (float) (this.anInt10176 - this.anInt10164);
			local6[7] = 0.0F;
			local6[9] = (local52 + local67) / (-local67 + local52);
			local6[1] = 0.0F;
			local6[5] = local151 / (local52 - local67);
			local6[8] = (local41 + local18) / (-local18 + local41);
			local6[13] = 0.0F;
		}
		this.method8917();
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIZ)Lclient!ug;")
	@Override
	public Class43 method9687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class43_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!uja", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method8847(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!sc;B)V")
	public void method8887(@OriginalArg(0) Interface22 arg0) {
		if (this.anInt10145 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt10145 >= 0) {
			this.anInterface22Array3[this.anInt10145].method3379();
		}
		this.anInterface22_1 = this.anInterface22Array3[++this.anInt10145] = arg0;
		this.anInterface22_1.method3376();
	}

	@OriginalMember(owner = "client!uja", name = "t", descriptor = "()Z")
	@Override
	public boolean method9710() {
		return this.aClass294_1.method7050();
	}

	@OriginalMember(owner = "client!uja", name = "d", descriptor = "(I)V")
	public void method8888() {
		if (this.anInt10151 == 8) {
			return;
		}
		this.method8849();
		this.method8885(true);
		this.method8844(true);
		this.method8905(true);
		this.method8847(1);
		this.anInt10151 = 8;
	}

	@OriginalMember(owner = "client!uja", name = "x", descriptor = "(I)V")
	private void method8889() {
		this.aClass64Array1 = new Class64[this.anInt10161];
		this.aClass64_Sub4_6 = new Class64_Sub4(this, 3553, 6408, 1, 1);
		new Class64_Sub4(this, 3553, 6408, 1, 1);
		new Class64_Sub4(this, 3553, 6408, 1, 1);
		for (@Pc(43) int local43 = 0; local43 < 7; local43++) {
			this.aClass45_Sub1Array2[local43] = new Class45_Sub1(this);
			this.aClass45_Sub1Array1[local43] = new Class45_Sub1(this);
		}
		if (this.aBoolean876) {
			this.aClass155_7 = new Class155(this);
			new Class155(this);
		}
	}

	@OriginalMember(owner = "client!uja", name = "p", descriptor = "()V")
	@Override
	public void method9667() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!uja", name = "s", descriptor = "()I")
	@Override
	public int method9694() {
		return 4;
	}

	@OriginalMember(owner = "client!uja", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt10039) {
			arg2 = this.anInt10039;
		}
		if (this.anInt10030 < arg3) {
			arg3 = this.anInt10030;
		}
		this.anInt10155 = arg3;
		this.anInt10185 = arg2;
		this.anInt10172 = arg1;
		this.anInt10160 = arg0;
		OpenGL.glEnable(3089);
		this.method8922();
		this.method8898();
	}

	@OriginalMember(owner = "client!uja", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt10150 + this.anInt10148 + this.anInt10149;
	}

	@OriginalMember(owner = "client!uja", name = "k", descriptor = "(I)V")
	private void method8890() {
		this.aFloat156 = (float) (this.anInt10176 - this.anInt10179) - this.aFloat153;
		this.aFloat160 = this.aFloat156 - this.aFloat171 * (float) this.anInt10187;
		if ((float) this.anInt10164 > this.aFloat160) {
			this.aFloat160 = (float) this.anInt10164;
		}
		OpenGL.glFogf(2915, this.aFloat160);
		OpenGL.glFogf(2916, this.aFloat156);
		Static441.aFloatArray51[2] = (float) (this.anInt10167 & 0xFF) / 255.0F;
		Static441.aFloatArray51[1] = (float) (this.anInt10167 & 0xFF00) / 65280.0F;
		Static441.aFloatArray51[0] = (float) (this.anInt10167 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static441.aFloatArray51, 0);
	}

	@OriginalMember(owner = "client!uja", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass86_Sub1_3.aFloat22 + (float) arg2 * this.aClass86_Sub1_3.aFloat19 + (float) arg0 * this.aClass86_Sub1_3.aFloat12 + (float) arg1 * this.aClass86_Sub1_3.aFloat20;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass86_Sub1_3.aFloat22 + this.aClass86_Sub1_3.aFloat19 * (float) arg5 + this.aClass86_Sub1_3.aFloat12 * (float) arg3 + this.aClass86_Sub1_3.aFloat20 * (float) arg4;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt10164 > local32 && (float) this.anInt10164 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt10176 < local32 && (float) this.anInt10176 < local63) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) ((this.aClass86_Sub1_3.aFloat21 + this.aClass86_Sub1_3.aFloat17 * (float) arg0 + this.aClass86_Sub1_3.aFloat11 * (float) arg1 + this.aClass86_Sub1_3.aFloat14 * (float) arg2) * (float) this.anInt10169 / local32);
		@Pc(173) int local173 = (int) ((this.aClass86_Sub1_3.aFloat21 + (float) arg3 * this.aClass86_Sub1_3.aFloat17 + (float) arg4 * this.aClass86_Sub1_3.aFloat11 + this.aClass86_Sub1_3.aFloat14 * (float) arg5) * (float) this.anInt10169 / local63);
		if (this.aFloat155 > (float) local141 && (float) local173 < this.aFloat155) {
			local7 |= 0x1;
		} else if ((float) local141 > this.aFloat154 && this.aFloat154 < (float) local173) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) (((float) arg0 * this.aClass86_Sub1_3.aFloat15 + (float) arg1 * this.aClass86_Sub1_3.aFloat16 + (float) arg2 * this.aClass86_Sub1_3.aFloat18 + this.aClass86_Sub1_3.aFloat13) * (float) this.anInt10158 / local32);
		@Pc(277) int local277 = (int) (((float) arg4 * this.aClass86_Sub1_3.aFloat16 + this.aClass86_Sub1_3.aFloat15 * (float) arg3 + (float) arg5 * this.aClass86_Sub1_3.aFloat18 + this.aClass86_Sub1_3.aFloat13) * (float) this.anInt10158 / local63);
		if ((float) local245 < this.aFloat172 && this.aFloat172 > (float) local277) {
			local7 |= 0x4;
		} else if (this.aFloat159 < (float) local245 && this.aFloat159 < (float) local277) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!uja", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt10173, this.anInt10178, this.anInt10169, this.anInt10158 };
	}

	@OriginalMember(owner = "client!uja", name = "I", descriptor = "(I)V")
	private void method8891() {
		this.method8881(-2);
		for (@Pc(14) int local14 = this.anInt10161 - 1; local14 >= 0; local14--) {
			this.method8859(local14);
			this.method8872((Class64) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method8897(8448, 8448);
		this.method8854(2, 34168, 770);
		this.method8880();
		this.anInt10153 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt10152 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) 0);
		this.aBoolean850 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean848 = true;
		this.method8885(true);
		this.method8907(true);
		this.method8844(true);
		this.method8905(true);
		this.method8855();
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
		@Pc(128) float[] local128 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(130) int local130 = 0; local130 < 8; local130++) {
			@Pc(140) int local140 = local130 + 16384;
			OpenGL.glLightfv(local140, 4608, local128, 0);
			OpenGL.glLightf(local140, 4615, 0.0F);
			OpenGL.glLightf(local140, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt10163 = this.anInt10167 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!uja", name = "d", descriptor = "(Z)I")
	private int method8892() {
		@Pc(5) int local5 = 0;
		this.aString112 = OpenGL.glGetString(7936).toLowerCase();
		this.aString113 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString112.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString112.indexOf("brian paul") != -1 || this.aString112.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(53) String local53 = OpenGL.glGetString(7938);
		@Pc(61) String[] local61 = Static100.method1530(local53.replace('.', ' '), ' ');
		if (local61.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(77) int local77 = Static171.method2545(local61[0]);
				@Pc(83) int local83 = Static171.method2545(local61[1]);
				this.anInt10180 = local83 + local77 * 10;
			} catch (@Pc(92) NumberFormatException local92) {
				local5 |= 0x4;
			}
		}
		if (this.anInt10180 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(130) int[] local130 = new int[1];
		OpenGL.glGetIntegerv(34018, local130, 0);
		this.anInt10161 = local130[0];
		OpenGL.glGetIntegerv(34929, local130, 0);
		this.anInt10166 = local130[0];
		OpenGL.glGetIntegerv(34930, local130, 0);
		this.anInt10157 = local130[0];
		if (this.anInt10161 < 2 || this.anInt10166 < 2 || this.anInt10157 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean872 = Stream.b();
		this.aBoolean869 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean877 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean859 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean863 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean862 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean853 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean852 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean860 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean871 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean874 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean858 = false;
		this.aBoolean876 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean866 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean861 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean870 = this.aBoolean861 & this.aBoolean866;
		this.aBoolean857 = Class2_Sub10_Sub2.aString15.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static441.aFloatArray51, 0);
		this.aFloat167 = Static441.aFloatArray51[0];
		this.aFloat164 = Static441.aFloatArray51[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!uja", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt10164;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!cla;)V")
	@Override
	public void method9658(@OriginalArg(0) Interface1 arg0) {
	}

	@OriginalMember(owner = "client!uja", name = "f", descriptor = "(I)V")
	@Override
	public void method9633(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method8851();
		this.method8847(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(24) float local24 = (float) -arg1 + (float) arg3;
		if (local17 == 0.0F && local24 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(51) float local51 = (float) (1.0D / Math.sqrt((double) (local24 * local24 + local17 * local17)));
			local17 *= local51;
			local24 *= local51;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local17 + 0.35F, local24 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!uja", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt10160 || arg0 - arg2 > this.anInt10185 || arg2 + arg1 < this.anInt10172 || arg1 - arg2 > this.anInt10155) {
			return;
		}
		this.method8851();
		this.method8847(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(82) float local82 = (float) arg0 + 0.35F;
		@Pc(87) float local87 = (float) arg1 + 0.35F;
		@Pc(91) int local91 = arg2 << 1;
		if (this.aFloat167 > (float) local91) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local82 + 1.0F, local87 + 1.0F);
			OpenGL.glVertex2f(local82 + 1.0F, -1.0F + local87);
			OpenGL.glVertex2f(local82 - 1.0F, -1.0F + local87);
			OpenGL.glVertex2f(local82 - 1.0F, local87 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat164 >= (float) local91) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local91);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local82, local87);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local82, local87);
			@Pc(162) int local162 = 262144 / (arg2 * 6);
			if (local162 <= 64) {
				local162 = 64;
			} else if (local162 > 512) {
				local162 = 512;
			}
			local162 = Static457.method6640(local162);
			OpenGL.glVertex2f(local82 + (float) arg2, local87);
			for (@Pc(191) int local191 = 16384 - local162; local191 > 0; local191 -= local162) {
				OpenGL.glVertex2f((float) arg2 * Class24.aFloatArray3[local191] + local82, Class24.aFloatArray4[local191] * (float) arg2 + local87);
			}
			OpenGL.glVertex2f((float) arg2 + local82, local87);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!uja", name = "v", descriptor = "()V")
	@Override
	public void method9673() {
		if (this.aClass2_Sub1_Sub1_1 != null && this.aClass2_Sub1_Sub1_1.method3767()) {
			this.aClass186_1.method3947(this.aClass2_Sub1_Sub1_1);
			this.aClass338_1.method8122();
		}
	}

	@OriginalMember(owner = "client!uja", name = "C", descriptor = "(I)V")
	private void method8893() {
		@Pc(15) int local15 = 0;
		while (!this.anOpenGL2.a()) {
			if (local15++ > 5) {
				throw new RuntimeException("");
			}
			Static570.method7907(1000L);
		}
	}

	@OriginalMember(owner = "client!uja", name = "q", descriptor = "(I)V")
	public void method8894() {
		if (this.anInt10151 == 2) {
			return;
		}
		this.method8852();
		this.method8885(false);
		this.method8907(false);
		this.method8844(false);
		this.method8905(false);
		this.method8881(-2);
		this.anInt10151 = 2;
	}

	@OriginalMember(owner = "client!uja", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uja", name = "h", descriptor = "(I)V")
	@Override
	public void method9718() {
	}

	@OriginalMember(owner = "client!uja", name = "r", descriptor = "()Z")
	@Override
	public boolean method9703() {
		return true;
	}

	@OriginalMember(owner = "client!uja", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt10172 < arg1) {
			this.anInt10172 = arg1;
		}
		if (arg0 > this.anInt10160) {
			this.anInt10160 = arg0;
		}
		if (arg2 < this.anInt10185) {
			this.anInt10185 = arg2;
		}
		if (this.anInt10155 > arg3) {
			this.anInt10155 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method8922();
		this.method8898();
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IILclient!jaclib/memory/Buffer;ZI)Lclient!kw;")
	public Interface13 method8895(@OriginalArg(0) int arg0, @OriginalArg(2) Buffer arg1, @OriginalArg(4) int arg2) {
		return (Interface13) (this.aBoolean877 && (this.aBoolean878 || true) ? new Class27_Sub2(this, arg2, arg1, arg0, false) : new Class172_Sub2(this, arg2, arg1));
	}

	@OriginalMember(owner = "client!uja", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean868 = false;
	}

	@OriginalMember(owner = "client!uja", name = "o", descriptor = "()Z")
	@Override
	public boolean method9650() {
		if (this.aClass2_Sub1_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub1_Sub1_1.method3767()) {
			if (!this.aClass186_1.method3946(this.aClass2_Sub1_Sub1_1)) {
				return false;
			}
			this.aClass338_1.method8122();
		}
		return true;
	}

	@OriginalMember(owner = "client!uja", name = "d", descriptor = "(II)Lclient!mh;")
	@Override
	public Interface16 method9645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "(B)V")
	private void method8896() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!uja", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(49) float local49;
		@Pc(45) float local45;
		if (this.aClass64_Sub4_Sub1_5 == null || arg2 > this.aClass64_Sub4_Sub1_5.anInt5008 || arg3 > this.aClass64_Sub4_Sub1_5.anInt5007) {
			this.aClass64_Sub4_Sub1_5 = Static431.method6279(arg3, arg6, arg2, this);
			this.aClass64_Sub4_Sub1_5.method4548(false, false);
			local45 = this.aClass64_Sub4_Sub1_5.aFloat67;
			local49 = this.aClass64_Sub4_Sub1_5.aFloat68;
		} else {
			this.aClass64_Sub4_Sub1_5.method4547(arg3, arg2, false, arg6, 6406);
			local45 = this.aClass64_Sub4_Sub1_5.aFloat67 * (float) arg2 / (float) this.aClass64_Sub4_Sub1_5.anInt5008;
			local49 = this.aClass64_Sub4_Sub1_5.aFloat68 * (float) arg3 / (float) this.aClass64_Sub4_Sub1_5.anInt5007;
		}
		this.method8894();
		this.method8872(this.aClass64_Sub4_Sub1_5);
		this.method8847(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method8912(arg5);
		this.method8897(34165, 34165);
		this.method8854(0, 34166, 768);
		this.method8854(2, 5890, 770);
		this.method8857(34166, 0);
		this.method8857(5890, 2);
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
		this.method8854(0, 5890, 768);
		this.method8854(2, 34166, 770);
		this.method8857(5890, 0);
		this.method8857(34166, 2);
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method9713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method8851();
		this.method8847(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean859) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean859) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "(III)V")
	public void method8897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt10177 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt10182 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt10182 = arg1;
			local11 = true;
		}
		if (this.anInt10154 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			this.anInt10154 = arg0;
			local11 = true;
		}
		if (local11) {
			this.anInt10151 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!uja", name = "m", descriptor = "(I)V")
	private void method8898() {
		if (this.anInt10160 <= this.anInt10185 && this.anInt10155 >= this.anInt10172) {
			OpenGL.glScissor(this.anInt10162 + this.anInt10160, this.anInt10030 + this.anInt10175 + -this.anInt10155, this.anInt10185 - this.anInt10160, this.anInt10155 + -this.anInt10172);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(BI)V")
	public synchronized void method8899(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub2 local16 = new Class2_Sub2(arg0);
		this.aClass60_209.method1233(local16);
	}

	@OriginalMember(owner = "client!uja", name = "i", descriptor = "(II)V")
	public void method8900(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method8897(7681, 7681);
		} else if (arg0 == 0) {
			this.method8897(8448, 8448);
		} else if (arg0 == 2) {
			this.method8897(7681, 34165);
		} else if (arg0 == 3) {
			this.method8897(8448, 260);
		} else if (arg0 == 4) {
			this.method8897(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!uja", name = "j", descriptor = "(I)V")
	@Override
	public void method9709(@OriginalArg(0) int arg0) {
		this.method8896();
	}

	@OriginalMember(owner = "client!uja", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10186 = arg1;
		this.anInt10159 = arg0;
		this.anInt10174 = arg3;
		this.aBoolean868 = true;
		this.anInt10184 = arg2;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!dla;I)V")
	public void method8901(@OriginalArg(0) Class86_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method1810(), 0);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "()Lclient!gw;")
	@Override
	public Class86 method9699() {
		return this.aClass86_Sub1_1;
	}

	@OriginalMember(owner = "client!uja", name = "g", descriptor = "(II)V")
	public synchronized void method8902(@OriginalArg(0) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong352 = (long) arg0;
		this.aClass60_211.method1233(local7);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method9704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		@Pc(22) Class1_Sub1 local22 = (Class1_Sub1) arg5;
		@Pc(25) Class64_Sub4_Sub1 local25 = local22.aClass64_Sub4_Sub1_1;
		this.method8894();
		this.method8872(local22.aClass64_Sub4_Sub1_1);
		this.method8847(1);
		this.method8897(8448, 7681);
		this.method8854(0, 34167, 768);
		@Pc(55) float local55 = local25.aFloat67 / (float) local25.anInt5009;
		@Pc(62) float local62 = local25.aFloat68 / (float) local25.anInt5010;
		@Pc(68) float local68 = (float) arg2 - (float) arg0;
		@Pc(75) float local75 = (float) -arg1 + (float) arg3;
		@Pc(88) float local88 = (float) (1.0D / Math.sqrt((double) (local75 * local75 + local68 * local68)));
		@Pc(94) int local94 = arg10 % (arg8 + arg9);
		@Pc(98) float local98 = local68 * local88;
		@Pc(102) float local102 = local75 * local88;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(122) float local122 = local98 * (float) arg8;
		@Pc(127) float local127 = (float) arg8 * local102;
		@Pc(129) float local129 = 0.0F;
		@Pc(131) float local131 = 0.0F;
		@Pc(133) float local133 = local122;
		@Pc(135) float local135 = local127;
		if (local94 > arg8) {
			local129 = (float) (arg8 + arg9 - local94) * local98;
			local131 = (float) (arg8 + arg9 - local94) * local102;
		} else {
			local133 = (float) (arg8 - local94) * local98;
			local135 = local102 * (float) (arg8 - local94);
		}
		@Pc(185) float local185 = local129 + (float) arg0 + 0.35F;
		@Pc(192) float local192 = (float) arg1 + local131 + 0.35F;
		@Pc(197) float local197 = (float) arg9 * local98;
		@Pc(202) float local202 = (float) arg9 * local102;
		while (true) {
			if (arg0 >= arg2) {
				if ((float) arg2 + 0.35F > local185) {
					break;
				}
				if (local185 + local133 < (float) arg2) {
					local133 = (float) arg2 - local185;
				}
			} else {
				if ((float) arg2 + 0.35F < local185) {
					break;
				}
				if (local185 + local133 > (float) arg2) {
					local133 = (float) arg2 - local185;
				}
			}
			if (arg3 <= arg1) {
				if (local192 < (float) arg3 + 0.35F) {
					break;
				}
				if (local192 + local135 < (float) arg3) {
					local135 = (float) arg3 - local192;
				}
			} else {
				if (local192 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local135 + local192) {
					local135 = (float) arg3 - local192;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local55 * (local185 - (float) arg6), local62 * ((float) -arg7 + local192));
			OpenGL.glVertex2f(local185, local192);
			OpenGL.glTexCoord2f((local133 + local185 - (float) arg6) * local55, ((float) -arg7 + local135 + local192) * local62);
			OpenGL.glVertex2f(local185 + local133, local192 + local135);
			OpenGL.glEnd();
			local185 += local197 + local133;
			local192 += local135 + local202;
			local133 = local122;
			local135 = local127;
		}
		this.method8854(0, 5890, 768);
	}

	@OriginalMember(owner = "client!uja", name = "r", descriptor = "(I)V")
	private void method8903() {
		Static441.aFloatArray51[3] = 1.0F;
		Static441.aFloatArray51[0] = this.aFloat158 * this.aFloat157;
		Static441.aFloatArray51[1] = this.aFloat168 * this.aFloat158;
		Static441.aFloatArray51[2] = this.aFloat173 * this.aFloat158;
		OpenGL.glLightModelfv(2899, Static441.aFloatArray51, 0);
	}

	@OriginalMember(owner = "client!uja", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt10155;
		arg0[2] = this.anInt10185;
		arg0[1] = this.anInt10172;
		arg0[0] = this.anInt10160;
	}

	@OriginalMember(owner = "client!uja", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(16) boolean local16 = this.anInt10163 != arg0;
		if (local16 || arg1 != this.aFloat170 || this.aFloat165 != arg2) {
			this.aFloat170 = arg1;
			this.anInt10163 = arg0;
			this.aFloat165 = arg2;
			if (local16) {
				this.aFloat168 = (float) (this.anInt10163 & 0xFF00) / 65280.0F;
				this.aFloat173 = (float) (this.anInt10163 & 0xFF) / 255.0F;
				this.aFloat157 = (float) (this.anInt10163 & 0xFF0000) / 1.671168E7F;
				this.method8903();
			}
			this.method8879();
		}
		if (this.aFloatArray63[0] == arg3 && this.aFloatArray63[1] == arg4 && this.aFloatArray63[2] == arg5) {
			return;
		}
		this.aFloatArray63[1] = arg4;
		this.aFloatArray63[0] = arg3;
		this.aFloatArray63[2] = arg5;
		this.aFloatArray65[1] = -arg4;
		this.aFloatArray65[0] = -arg3;
		this.aFloatArray65[2] = -arg5;
		@Pc(155) float local155 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray62[2] = local155 * arg5;
		this.aFloatArray62[1] = local155 * arg4;
		this.aFloatArray62[0] = arg3 * local155;
		this.aFloatArray64[2] = -this.aFloatArray62[2];
		this.aFloatArray64[1] = -this.aFloatArray62[1];
		this.aFloatArray64[0] = -this.aFloatArray62[0];
		this.method8853();
		this.anInt10171 = (int) (arg3 * 256.0F / arg4);
		this.anInt10170 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!uja", name = "g", descriptor = "(Z)V")
	private void method8904() {
		if (this.aCanvas10 == null) {
			this.anInt10094 = this.anInt10092 = 0;
		} else {
			@Pc(16) Dimension local16 = this.aCanvas10.getSize();
			this.anInt10092 = local16.height;
			this.anInt10094 = local16.width;
		}
		if (this.anInterface22_2 == null) {
			this.anInt10039 = this.anInt10094;
			this.anInt10030 = this.anInt10092;
			this.method8925();
		}
		this.method8855();
		this.la();
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(II)Lclient!jt;")
	@Override
	public Interface11 method9657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!mb;I)V")
	@Override
	public void method9690(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1) {
		this.aClass359_1.method8443(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "(ZI)V")
	public void method8905(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean851 != arg0) {
			this.aBoolean851 = arg0;
			this.method8861();
			this.anInt10151 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!uja", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass86_Sub1_3.aFloat22 + (float) arg2 * this.aClass86_Sub1_3.aFloat19 + this.aClass86_Sub1_3.aFloat20 * (float) arg1 + (float) arg0 * this.aClass86_Sub1_3.aFloat12;
		if (local28 < (float) this.anInt10164 || local28 > (float) this.anInt10176) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(88) int local88 = (int) ((float) this.anInt10169 * (this.aClass86_Sub1_3.aFloat11 * (float) arg1 + this.aClass86_Sub1_3.aFloat17 * (float) arg0 + (float) arg2 * this.aClass86_Sub1_3.aFloat14 + this.aClass86_Sub1_3.aFloat21) / local28);
		@Pc(120) int local120 = (int) ((float) this.anInt10158 * (this.aClass86_Sub1_3.aFloat15 * (float) arg0 + (float) arg1 * this.aClass86_Sub1_3.aFloat16 + this.aClass86_Sub1_3.aFloat18 * (float) arg2 + this.aClass86_Sub1_3.aFloat13) / local28);
		if (this.aFloat155 <= (float) local88 && (float) local88 <= this.aFloat154 && this.aFloat172 <= (float) local120 && (float) local120 <= this.aFloat159) {
			arg3[1] = (int) ((float) local120 - this.aFloat172);
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local88 - this.aFloat155);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!gw;)V")
	@Override
	public void method9656(@OriginalArg(0) Class86 arg0) {
		this.aClass86_Sub1_3.method7032(arg0);
		this.aClass86_Sub1_4.method7032(this.aClass86_Sub1_3);
		this.aClass86_Sub1_4.method1811();
		this.aClass86_Sub1_5.method1808(this.aClass86_Sub1_4);
		if (this.anInt10156 != 1) {
			this.method8919();
		}
	}

	@OriginalMember(owner = "client!uja", name = "z", descriptor = "()Lclient!gw;")
	@Override
	public Class86 method9691() {
		return new Class86_Sub1();
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "(Lclient!sc;I)V")
	public void method8906(@OriginalArg(0) Interface22 arg0) {
		if (this.aBoolean866) {
			this.method8887(arg0);
			this.method8870(arg0);
		} else if (this.anInt10147 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt10147 >= 0) {
				this.anInterface22Array1[this.anInt10147].method3378();
			}
			this.anInterface22_1 = this.anInterface22_2 = this.anInterface22Array1[++this.anInt10147] = arg0;
			this.anInterface22_1.method3375();
		}
	}

	@OriginalMember(owner = "client!uja", name = "d", descriptor = "()Z")
	@Override
	public boolean method9698() {
		return true;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!db;)V")
	@Override
	public void method9701(@OriginalArg(0) Class74 arg0) {
		this.aClass74_Sub2_1 = (Class74_Sub2) arg0;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method9696() {
		this.method8851();
		this.method8847(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;")
	@Override
	public Class74 method9678(@OriginalArg(0) Class74 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class74 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean871 && this.aBoolean876) {
			@Pc(21) Class74_Sub2_Sub1 local21 = null;
			@Pc(24) Class74_Sub2 local24 = (Class74_Sub2) arg0;
			@Pc(27) Class74_Sub2 local27 = (Class74_Sub2) arg1;
			@Pc(31) Class64_Sub2 local31 = local24.method7519();
			@Pc(35) Class64_Sub2 local35 = local27.method7519();
			if (local31 != null && local35 != null) {
				@Pc(59) int local59 = local31.anInt2502 > local35.anInt2502 ? local31.anInt2502 : local35.anInt2502;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class74_Sub2_Sub1) {
					@Pc(75) Class74_Sub2_Sub1 local75 = (Class74_Sub2_Sub1) arg3;
					if (local59 == local75.method7159()) {
						local21 = local75;
					}
				}
				if (local21 == null) {
					local21 = new Class74_Sub2_Sub1(this, local59);
				}
				if (local21.method7158(arg2, local31, local35)) {
					return local21;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IZ)V")
	public void method8907(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean864 != arg0) {
			this.aBoolean864 = arg0;
			this.method8845();
			this.anInt10151 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method9708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == arg2 && arg3 == arg1) {
			return;
		}
		this.method8851();
		this.method8847(1);
		@Pc(32) float local32 = (float) arg2 - (float) arg0;
		@Pc(39) float local39 = (float) -arg1 + (float) arg3;
		@Pc(52) float local52 = (float) (1.0D / Math.sqrt((double) (local32 * local32 + local39 * local39)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(71) float local71 = local32 * local52;
		@Pc(75) float local75 = local39 * local52;
		@Pc(82) int local82 = arg7 % (arg6 + arg5);
		@Pc(87) float local87 = (float) arg5 * local71;
		@Pc(92) float local92 = (float) arg5 * local75;
		@Pc(94) float local94 = 0.0F;
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = local87;
		@Pc(100) float local100 = local92;
		if (local82 > arg5) {
			local96 = (float) (arg5 + arg6 - local82) * local75;
			local94 = (float) (arg6 + arg5 - local82) * local71;
		} else {
			local100 = (float) (arg5 - local82) * local75;
			local98 = (float) (arg5 - local82) * local71;
		}
		@Pc(147) float local147 = (float) arg0 + local94 + 0.35F;
		@Pc(154) float local154 = (float) arg1 + local96 + 0.35F;
		@Pc(159) float local159 = (float) arg6 * local71;
		@Pc(164) float local164 = (float) arg6 * local75;
		while (true) {
			if (arg0 < arg2) {
				if ((float) arg2 + 0.35F < local147) {
					break;
				}
				if ((float) arg2 < local147 + local98) {
					local98 = (float) arg2 - local147;
				}
			} else {
				if (local147 < (float) arg2 + 0.35F) {
					break;
				}
				if (local98 + local147 < (float) arg2) {
					local98 = (float) arg2 - local147;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 + 0.35F > local154) {
					break;
				}
				if (local154 + local100 < (float) arg3) {
					local100 = (float) arg3 - local154;
				}
			} else {
				if ((float) arg3 + 0.35F < local154) {
					break;
				}
				if ((float) arg3 < local154 + local100) {
					local100 = (float) arg3 - local154;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local147, local154);
			OpenGL.glVertex2f(local147 + local98, local100 + local154);
			local147 += local159 + local98;
			OpenGL.glEnd();
			local154 += local164 + local100;
			local100 = local92;
			local98 = local87;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIB)V")
	public void method8908(@OriginalArg(0) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIIZ)Lclient!ug;")
	@Override
	public Class43 method9654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class43_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!uja", name = "e", descriptor = "(IIIIII)Lclient!db;")
	@Override
	public Class74 method9692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean871 ? new Class74_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!ln;IIII)Lclient!ka;")
	@Override
	public Class45 method9700(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class45_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(ZII)V")
	public void method8910(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method8924(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!uja", name = "e", descriptor = "()Z")
	@Override
	public boolean method9648() {
		return false;
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "(I)V")
	@Override
	public void method9705(@OriginalArg(0) int arg0) {
		this.method8893();
	}

	@OriginalMember(owner = "client!uja", name = "i", descriptor = "(I)V")
	@Override
	public void method9672(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt10128 = arg0;
		this.aClass338_1.method8122();
	}

	@OriginalMember(owner = "client!uja", name = "j", descriptor = "()Z")
	@Override
	public boolean method9681() {
		return true;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(ZIII[B)Lclient!jv;")
	public Interface12 method8911(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface12) (this.aBoolean877 && (!arg0 || this.aBoolean878) ? new Class27_Sub1(this, 5123, arg2, arg1, arg0) : new Class172_Sub1(this, 5123, arg2, arg1));
	}

	@OriginalMember(owner = "client!uja", name = "y", descriptor = "()Z")
	@Override
	public boolean method9632() {
		return this.aClass2_Sub1_Sub1_1 != null && this.aClass2_Sub1_Sub1_1.method3767();
	}

	@OriginalMember(owner = "client!uja", name = "h", descriptor = "(II)V")
	public void method8912(@OriginalArg(1) int arg0) {
		Static441.aFloatArray51[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static441.aFloatArray51[3] = (float) (arg0 >>> 24) / 255.0F;
		Static441.aFloatArray51[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static441.aFloatArray51[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static441.aFloatArray51, 0);
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(BI)I")
	public int method8913(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!uja", name = "f", descriptor = "()Lclient!gw;")
	@Override
	public Class86 method9716() {
		return this.aClass86_Sub1_3;
	}

	@OriginalMember(owner = "client!uja", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt10144 = 0;
		while (arg0 > 1) {
			this.anInt10144++;
			arg0 >>= 0x1;
		}
		this.anInt10143 = 0x1 << this.anInt10144;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(ZI)V")
	public void method8914(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean856) {
			this.aBoolean856 = arg0;
			this.method8845();
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(III[BZ)Lclient!kw;")
	public Interface13 method8915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		return (Interface13) (this.aBoolean877 && (!arg3 || this.aBoolean878) ? new Class27_Sub2(this, arg1, arg2, arg0, arg3) : new Class172_Sub2(this, arg1, arg2, arg0));
	}

	@OriginalMember(owner = "client!uja", name = "w", descriptor = "()Z")
	@Override
	public boolean method9665() {
		return this.aClass2_Sub1_Sub1_1 != null && (this.anInt10104 <= 1 || this.aBoolean870);
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(Z)V")
	@Override
	public void method9669(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "(BI)I")
	public int method8916(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method9689(@OriginalArg(0) Canvas arg0) {
		this.aCanvas10 = null;
		this.aLong312 = 0L;
		if (arg0 == null || this.aCanvas11 == arg0) {
			this.aCanvas10 = this.aCanvas11;
			this.aLong312 = this.aLong313;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(42) Long local42 = (Long) this.aHashtable6.get(arg0);
			this.aLong312 = local42;
			this.aCanvas10 = arg0;
		}
		if (this.aCanvas10 == null || this.aLong312 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong312);
		this.method8904();
	}

	@OriginalMember(owner = "client!uja", name = "y", descriptor = "(I)V")
	private void method8917() {
		this.aFloatArray66[10] = this.aFloat169;
		this.aFloatArray66[14] = this.aFloat163;
		this.aFloat162 = (float) this.anInt10176;
		this.aFloat161 = (this.aFloatArray66[14] - (float) this.anInt10176) / this.aFloatArray66[10];
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIB)V")
	public synchronized void method8918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class2_Sub2 local16 = new Class2_Sub2(arg1);
		local16.aLong352 = (long) arg0;
		this.aClass60_210.method1233(local16);
	}

	@OriginalMember(owner = "client!uja", name = "s", descriptor = "(I)V")
	private void method8919() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass86_Sub1_4.method1810(), 0);
		if (this.aBoolean865) {
			this.aClass294_1.aClass112_Sub4_1.method4377();
		}
		this.method8853();
		this.method8873();
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(III)V")
	public void method8920(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt10175 = arg0;
		this.anInt10162 = arg1;
		this.method8925();
		this.method8898();
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method9640(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas11 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(23) Long local23 = (Long) this.aHashtable6.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local23);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!uja", name = "n", descriptor = "()V")
	@Override
	public void method9712() {
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIIIF)Lclient!bba;")
	@Override
	public Class2_Sub7 method9664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub7_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IILclient!jv;II)V")
	public void method8921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface12 arg2) {
		@Pc(15) int local15 = arg2.method7100();
		@Pc(22) int local22 = arg1 * this.method8916(local15);
		this.method8866(arg2);
		OpenGL.glDrawElements(4, arg0, local15, (long) local22 + arg2.method7101());
	}

	@OriginalMember(owner = "client!uja", name = "m", descriptor = "()Z")
	@Override
	public boolean method9693() {
		return true;
	}

	@OriginalMember(owner = "client!uja", name = "A", descriptor = "()Z")
	@Override
	public boolean method9715() {
		return true;
	}

	@OriginalMember(owner = "client!uja", name = "e", descriptor = "(Z)V")
	private void method8922() {
		this.aFloat172 = (float) (this.anInt10172 - this.anInt10178);
		this.aFloat155 = (float) (this.anInt10160 - this.anInt10173);
		this.aFloat159 = (float) (this.anInt10155 - this.anInt10178);
		this.aFloat154 = (float) (this.anInt10185 - this.anInt10173);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method9663(@OriginalArg(0) Class2_Sub28 arg0) {
		this.aNativeHeap5 = ((Class2_Sub28_Sub1) arg0).aNativeHeap1;
		if (this.anInterface13_7 != null) {
			return;
		}
		@Pc(16) Class2_Sub20_Sub1 local16 = new Class2_Sub20_Sub1(80);
		if (this.aBoolean872) {
			local16.method3563(-1.0F);
			local16.method3563(-1.0F);
			local16.method3563(0.0F);
			local16.method3563(0.0F);
			local16.method3563(1.0F);
			local16.method3563(1.0F);
			local16.method3563(-1.0F);
			local16.method3563(0.0F);
			local16.method3563(1.0F);
			local16.method3563(1.0F);
			local16.method3563(1.0F);
			local16.method3563(1.0F);
			local16.method3563(0.0F);
			local16.method3563(1.0F);
			local16.method3563(0.0F);
			local16.method3563(-1.0F);
			local16.method3563(1.0F);
			local16.method3563(0.0F);
			local16.method3563(0.0F);
			local16.method3563(0.0F);
		} else {
			local16.method3565(-1.0F);
			local16.method3565(-1.0F);
			local16.method3565(0.0F);
			local16.method3565(0.0F);
			local16.method3565(1.0F);
			local16.method3565(1.0F);
			local16.method3565(-1.0F);
			local16.method3565(0.0F);
			local16.method3565(1.0F);
			local16.method3565(1.0F);
			local16.method3565(1.0F);
			local16.method3565(1.0F);
			local16.method3565(0.0F);
			local16.method3565(1.0F);
			local16.method3565(0.0F);
			local16.method3565(-1.0F);
			local16.method3565(1.0F);
			local16.method3565(0.0F);
			local16.method3565(0.0F);
			local16.method3565(0.0F);
		}
		this.anInterface13_7 = this.method8915(local16.anInt9723, 20, local16.aByteArray111, false);
		this.aClass170_16 = new Class170(this.anInterface13_7, 5126, 3, 0);
		this.aClass170_15 = new Class170(this.anInterface13_7, 5126, 2, 12);
		this.aClass359_1.method8442(this);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!jt;Lclient!mh;)Lclient!cla;")
	@Override
	public Interface1 method9697(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface16 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!uja", name = "k", descriptor = "()V")
	@Override
	public void method9660() {
		this.aClass186_1.method3949();
	}

	@OriginalMember(owner = "client!uja", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean868) {
			throw new RuntimeException("");
		}
		this.anInt10159 = arg0;
		this.anInt10184 = arg2;
		this.anInt10174 = arg3;
		this.anInt10186 = arg1;
		if (this.aBoolean865) {
			this.aClass294_1.aClass112_Sub4_1.method4377();
			this.aClass294_1.aClass112_Sub4_1.method4378();
		}
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "(II)V")
	@Override
	public void method9644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!uja", name = "H", descriptor = "(I)V")
	private void method8923() {
		if (this.anInt10156 != 3) {
			this.anInt10156 = 3;
			this.method8883();
			this.method8919();
			this.anInt10151 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method9677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static397.method5860(arg0, arg3, arg2, this, arg1);
	}

	@OriginalMember(owner = "client!uja", name = "e", descriptor = "(II)I")
	@Override
	public int method9686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "()Z")
	@Override
	public boolean method9646() {
		return true;
	}

	@OriginalMember(owner = "client!uja", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method8851();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method8847(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean859) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean859) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IZBZ)V")
	public void method8924(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt10168 || this.aBoolean865 != this.aBoolean868) {
			@Pc(26) Class64_Sub4 local26 = null;
			@Pc(28) int local28 = 0;
			@Pc(30) byte local30 = 0;
			@Pc(32) int local32 = 0;
			@Pc(40) int local40 = this.aBoolean868 ? 3 : 0;
			if (arg0 < 0) {
				this.method8880();
			} else {
				local26 = this.aClass338_1.method8121(arg0);
				@Pc(57) Class8 local57 = super.anInterface3_12.method2857(arg0);
				if (local57.aByte16 == 0 && local57.aByte14 == 0) {
					this.method8880();
				} else {
					@Pc(78) int local78 = local57.aBoolean28 ? 64 : 128;
					@Pc(82) int local82 = local78 * 50;
					this.method8869((float) (this.anInt10142 % local82 * local57.aByte16) / (float) local82, (float) (local57.aByte14 * (this.anInt10142 % local82)) / (float) local82, 0.0F);
				}
				if (!this.aBoolean868) {
					local32 = local57.anInt189;
					local30 = local57.aByte11;
					local40 = local57.aByte15;
				}
				local28 = local57.anInt188;
			}
			this.aClass294_1.method7049(local30, arg1, local32, arg2, local40);
			if (!this.aClass294_1.method7048(local28, local26)) {
				this.method8872(local26);
				this.method8900(local28);
			}
			this.anInt10168 = arg0;
			this.aBoolean865 = this.aBoolean868;
		}
		this.anInt10151 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(FFF)V")
	@Override
	public void method9684(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static210.aFloat44 = arg0;
		Static469.aFloat126 = arg2;
		Static188.aFloat29 = arg1;
	}

	@OriginalMember(owner = "client!uja", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass86_Sub1_3.aFloat20 * (float) arg1 + (float) arg0 * this.aClass86_Sub1_3.aFloat12 + this.aClass86_Sub1_3.aFloat19 * (float) arg2 + this.aClass86_Sub1_3.aFloat22;
		@Pc(55) float local55 = (float) arg3 * this.aClass86_Sub1_3.aFloat12 + this.aClass86_Sub1_3.aFloat20 * (float) arg4 + this.aClass86_Sub1_3.aFloat19 * (float) arg5 + this.aClass86_Sub1_3.aFloat22;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt10164 > local30 && (float) this.anInt10164 > local55) {
			local57 |= 0x10;
		} else if ((float) this.anInt10176 < local30 && (float) this.anInt10176 < local55) {
			local57 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((this.aClass86_Sub1_3.aFloat14 * (float) arg2 + this.aClass86_Sub1_3.aFloat11 * (float) arg1 + (float) arg0 * this.aClass86_Sub1_3.aFloat17 + this.aClass86_Sub1_3.aFloat21) * (float) this.anInt10169 / (float) arg6);
		@Pc(163) int local163 = (int) ((this.aClass86_Sub1_3.aFloat21 + this.aClass86_Sub1_3.aFloat14 * (float) arg5 + this.aClass86_Sub1_3.aFloat11 * (float) arg4 + (float) arg3 * this.aClass86_Sub1_3.aFloat17) * (float) this.anInt10169 / (float) arg6);
		if (this.aFloat155 > (float) local130 && this.aFloat155 > (float) local163) {
			local57 |= 0x1;
		} else if (this.aFloat154 < (float) local130 && this.aFloat154 < (float) local163) {
			local57 |= 0x2;
		}
		@Pc(236) int local236 = (int) ((float) this.anInt10158 * (this.aClass86_Sub1_3.aFloat13 + (float) arg0 * this.aClass86_Sub1_3.aFloat15 + (float) arg1 * this.aClass86_Sub1_3.aFloat16 + this.aClass86_Sub1_3.aFloat18 * (float) arg2) / (float) arg6);
		@Pc(269) int local269 = (int) ((float) this.anInt10158 * (this.aClass86_Sub1_3.aFloat15 * (float) arg3 + this.aClass86_Sub1_3.aFloat16 * (float) arg4 + (float) arg5 * this.aClass86_Sub1_3.aFloat18 + this.aClass86_Sub1_3.aFloat13) / (float) arg6);
		if ((float) local236 < this.aFloat172 && this.aFloat172 > (float) local269) {
			local57 |= 0x4;
		} else if (this.aFloat159 < (float) local236 && (float) local269 > this.aFloat159) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!uja", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt10189;
		this.anInt10189 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!uja", name = "p", descriptor = "(I)V")
	private void method8925() {
		OpenGL.glViewport(this.anInt10162, this.anInt10175, this.anInt10039, this.anInt10030);
	}
}
