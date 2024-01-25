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

@OriginalClass("client!gia")
public final class Class67_Sub2 extends Class67 {

	@OriginalMember(owner = "client!gia", name = "Ge", descriptor = "I")
	private int anInt3680;

	@OriginalMember(owner = "client!gia", name = "Qc", descriptor = "I")
	public int anInt3783;

	@OriginalMember(owner = "client!gia", name = "Cc", descriptor = "I")
	public int anInt3828;

	@OriginalMember(owner = "client!gia", name = "Rb", descriptor = "I")
	private int anInt3842;

	@OriginalMember(owner = "client!gia", name = "Og", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!gia", name = "hg", descriptor = "I")
	public int anInt3876;

	@OriginalMember(owner = "client!gia", name = "Pe", descriptor = "Lclient!md;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!gia", name = "qc", descriptor = "Lclient!se;")
	private Class9_Sub2 aClass9_Sub2_1;

	@OriginalMember(owner = "client!gia", name = "K", descriptor = "Lclient!sj;")
	private Class339 aClass339_3;

	@OriginalMember(owner = "client!gia", name = "yd", descriptor = "Lclient!md;")
	private Interface17 anInterface17_2;

	@OriginalMember(owner = "client!gia", name = "pb", descriptor = "I")
	public int anInt3881;

	@OriginalMember(owner = "client!gia", name = "jc", descriptor = "I")
	private int anInt3882;

	@OriginalMember(owner = "client!gia", name = "cc", descriptor = "I")
	public int anInt3883;

	@OriginalMember(owner = "client!gia", name = "Z", descriptor = "I")
	private int anInt3884;

	@OriginalMember(owner = "client!gia", name = "ie", descriptor = "J")
	private long aLong133;

	@OriginalMember(owner = "client!gia", name = "Rc", descriptor = "I")
	private int anInt3885;

	@OriginalMember(owner = "client!gia", name = "U", descriptor = "Z")
	private boolean aBoolean299;

	@OriginalMember(owner = "client!gia", name = "cb", descriptor = "I")
	private int anInt3886;

	@OriginalMember(owner = "client!gia", name = "Ef", descriptor = "Z")
	private boolean aBoolean300;

	@OriginalMember(owner = "client!gia", name = "le", descriptor = "Z")
	private boolean aBoolean301;

	@OriginalMember(owner = "client!gia", name = "gc", descriptor = "Z")
	private boolean aBoolean302;

	@OriginalMember(owner = "client!gia", name = "Sc", descriptor = "I")
	public int anInt3887;

	@OriginalMember(owner = "client!gia", name = "sg", descriptor = "I")
	private int anInt3888;

	@OriginalMember(owner = "client!gia", name = "Y", descriptor = "I")
	public int anInt3889;

	@OriginalMember(owner = "client!gia", name = "Hd", descriptor = "Lclient!to;")
	private Class245_Sub2_Sub1 aClass245_Sub2_Sub1_2;

	@OriginalMember(owner = "client!gia", name = "ze", descriptor = "Z")
	public boolean aBoolean304;

	@OriginalMember(owner = "client!gia", name = "of", descriptor = "Z")
	private boolean aBoolean305;

	@OriginalMember(owner = "client!gia", name = "rd", descriptor = "I")
	private int anInt3891;

	@OriginalMember(owner = "client!gia", name = "w", descriptor = "F")
	private float aFloat63;

	@OriginalMember(owner = "client!gia", name = "Tg", descriptor = "Z")
	public boolean aBoolean307;

	@OriginalMember(owner = "client!gia", name = "v", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!gia", name = "rb", descriptor = "I")
	private int anInt3893;

	@OriginalMember(owner = "client!gia", name = "Ff", descriptor = "I")
	public int anInt3894;

	@OriginalMember(owner = "client!gia", name = "wc", descriptor = "I")
	private int anInt3895;

	@OriginalMember(owner = "client!gia", name = "If", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!gia", name = "xc", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!gia", name = "kh", descriptor = "Lclient!tfa;")
	private Class77_Sub1 aClass77_Sub1_1;

	@OriginalMember(owner = "client!gia", name = "jh", descriptor = "I")
	public int anInt3901;

	@OriginalMember(owner = "client!gia", name = "A", descriptor = "Lclient!sj;")
	public Class339 aClass339_4;

	@OriginalMember(owner = "client!gia", name = "yc", descriptor = "Z")
	public boolean aBoolean312;

	@OriginalMember(owner = "client!gia", name = "Ee", descriptor = "F")
	private float aFloat74;

	@OriginalMember(owner = "client!gia", name = "Ud", descriptor = "Z")
	public boolean aBoolean314;

	@OriginalMember(owner = "client!gia", name = "vc", descriptor = "Z")
	private boolean aBoolean315;

	@OriginalMember(owner = "client!gia", name = "N", descriptor = "Lclient!li;")
	public Class229 aClass229_6;

	@OriginalMember(owner = "client!gia", name = "uf", descriptor = "Z")
	private boolean aBoolean316;

	@OriginalMember(owner = "client!gia", name = "Ab", descriptor = "Ljava/lang/String;")
	private String aString65;

	@OriginalMember(owner = "client!gia", name = "Gg", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!gia", name = "M", descriptor = "Lclient!rt;")
	private Interface24 anInterface24_3;

	@OriginalMember(owner = "client!gia", name = "zg", descriptor = "Z")
	public boolean aBoolean317;

	@OriginalMember(owner = "client!gia", name = "se", descriptor = "Z")
	public boolean aBoolean318;

	@OriginalMember(owner = "client!gia", name = "tf", descriptor = "Z")
	private boolean aBoolean319;

	@OriginalMember(owner = "client!gia", name = "Oc", descriptor = "Lclient!nw;")
	public Class245_Sub2 aClass245_Sub2_4;

	@OriginalMember(owner = "client!gia", name = "Qf", descriptor = "I")
	private int anInt3909;

	@OriginalMember(owner = "client!gia", name = "y", descriptor = "I")
	private int anInt3910;

	@OriginalMember(owner = "client!gia", name = "I", descriptor = "I")
	private int anInt3913;

	@OriginalMember(owner = "client!gia", name = "me", descriptor = "Ljava/lang/String;")
	private String aString66;

	@OriginalMember(owner = "client!gia", name = "Jg", descriptor = "Z")
	public boolean aBoolean322;

	@OriginalMember(owner = "client!gia", name = "bg", descriptor = "Z")
	public boolean aBoolean323;

	@OriginalMember(owner = "client!gia", name = "R", descriptor = "Z")
	private boolean aBoolean324;

	@OriginalMember(owner = "client!gia", name = "ph", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!gia", name = "xg", descriptor = "Lclient!rt;")
	private Interface24 anInterface24_4;

	@OriginalMember(owner = "client!gia", name = "lc", descriptor = "Lclient!ika;")
	private Interface11 anInterface11_2;

	@OriginalMember(owner = "client!gia", name = "qe", descriptor = "Z")
	public boolean aBoolean325;

	@OriginalMember(owner = "client!gia", name = "wb", descriptor = "Z")
	private boolean aBoolean326;

	@OriginalMember(owner = "client!gia", name = "dg", descriptor = "I")
	private int anInt3918;

	@OriginalMember(owner = "client!gia", name = "eg", descriptor = "[Lclient!sga;")
	private Class245[] aClass245Array1;

	@OriginalMember(owner = "client!gia", name = "Kd", descriptor = "Z")
	public boolean aBoolean327;

	@OriginalMember(owner = "client!gia", name = "fb", descriptor = "F")
	private float aFloat79;

	@OriginalMember(owner = "client!gia", name = "pg", descriptor = "Z")
	private boolean aBoolean329;

	@OriginalMember(owner = "client!gia", name = "Yg", descriptor = "Lclient!li;")
	public Class229 aClass229_7;

	@OriginalMember(owner = "client!gia", name = "ah", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!gia", name = "Jb", descriptor = "I")
	private int anInt3921;

	@OriginalMember(owner = "client!gia", name = "Pd", descriptor = "I")
	private int anInt3922;

	@OriginalMember(owner = "client!gia", name = "Bc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "client!gia", name = "kg", descriptor = "I")
	public int anInt3870 = 128;

	@OriginalMember(owner = "client!gia", name = "Mb", descriptor = "Lclient!fla;")
	private final Class117 aClass117_1 = new Class117();

	@OriginalMember(owner = "client!gia", name = "ke", descriptor = "Lclient!nd;")
	private final Class181_Sub2 aClass181_Sub2_1 = new Class181_Sub2();

	@OriginalMember(owner = "client!gia", name = "Sd", descriptor = "Lclient!nd;")
	public final Class181_Sub2 aClass181_Sub2_2 = new Class181_Sub2();

	@OriginalMember(owner = "client!gia", name = "Qd", descriptor = "I")
	public int anInt3875 = 3;

	@OriginalMember(owner = "client!gia", name = "og", descriptor = "I")
	public int anInt3877 = 8;

	@OriginalMember(owner = "client!gia", name = "bd", descriptor = "Z")
	private boolean aBoolean298 = false;

	@OriginalMember(owner = "client!gia", name = "wf", descriptor = "Lclient!tj;")
	private final Class357 aClass357_11 = new Class357();

	@OriginalMember(owner = "client!gia", name = "Jc", descriptor = "[Lclient!md;")
	private final Interface17[] anInterface17Array1 = new Interface17[4];

	@OriginalMember(owner = "client!gia", name = "th", descriptor = "I")
	private int anInt3879 = -1;

	@OriginalMember(owner = "client!gia", name = "Yc", descriptor = "[Lclient!md;")
	private final Interface17[] anInterface17Array2 = new Interface17[4];

	@OriginalMember(owner = "client!gia", name = "fg", descriptor = "I")
	private int anInt3880 = -1;

	@OriginalMember(owner = "client!gia", name = "Jf", descriptor = "[Lclient!md;")
	private final Interface17[] anInterface17Array3 = new Interface17[4];

	@OriginalMember(owner = "client!gia", name = "Db", descriptor = "I")
	private int anInt3878 = -1;

	@OriginalMember(owner = "client!gia", name = "fe", descriptor = "Lclient!tj;")
	private final Class357 aClass357_12;

	@OriginalMember(owner = "client!gia", name = "ef", descriptor = "Lclient!tj;")
	private final Class357 aClass357_13;

	@OriginalMember(owner = "client!gia", name = "Ae", descriptor = "Lclient!tj;")
	private final Class357 aClass357_14;

	@OriginalMember(owner = "client!gia", name = "kf", descriptor = "Lclient!tj;")
	private final Class357 aClass357_15;

	@OriginalMember(owner = "client!gia", name = "td", descriptor = "Lclient!tj;")
	private final Class357 aClass357_16;

	@OriginalMember(owner = "client!gia", name = "Kg", descriptor = "Lclient!tj;")
	private final Class357 aClass357_17;

	@OriginalMember(owner = "client!gia", name = "ld", descriptor = "Lclient!tj;")
	private final Class357 aClass357_18;

	@OriginalMember(owner = "client!gia", name = "Re", descriptor = "Lclient!nd;")
	public final Class181_Sub2 aClass181_Sub2_3;

	@OriginalMember(owner = "client!gia", name = "Dc", descriptor = "Lclient!nd;")
	public final Class181_Sub2 aClass181_Sub2_4;

	@OriginalMember(owner = "client!gia", name = "Of", descriptor = "Lclient!nd;")
	public final Class181_Sub2 aClass181_Sub2_5;

	@OriginalMember(owner = "client!gia", name = "yb", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!gia", name = "ad", descriptor = "F")
	private float aFloat65;

	@OriginalMember(owner = "client!gia", name = "od", descriptor = "Z")
	private boolean aBoolean313;

	@OriginalMember(owner = "client!gia", name = "xe", descriptor = "F")
	private float aFloat72;

	@OriginalMember(owner = "client!gia", name = "Lg", descriptor = "[F")
	private final float[] aFloatArray39;

	@OriginalMember(owner = "client!gia", name = "ob", descriptor = "I")
	private int anInt3902;

	@OriginalMember(owner = "client!gia", name = "ff", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!gia", name = "Ye", descriptor = "I")
	private int anInt3890;

	@OriginalMember(owner = "client!gia", name = "ve", descriptor = "I")
	public int anInt3896;

	@OriginalMember(owner = "client!gia", name = "Ig", descriptor = "I")
	public int anInt3907;

	@OriginalMember(owner = "client!gia", name = "oc", descriptor = "I")
	public int anInt3905;

	@OriginalMember(owner = "client!gia", name = "Hf", descriptor = "[F")
	private final float[] aFloatArray41;

	@OriginalMember(owner = "client!gia", name = "dc", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!gia", name = "fd", descriptor = "I")
	public int anInt3906;

	@OriginalMember(owner = "client!gia", name = "Ld", descriptor = "Z")
	private boolean aBoolean311;

	@OriginalMember(owner = "client!gia", name = "Yb", descriptor = "I")
	private int anInt3898;

	@OriginalMember(owner = "client!gia", name = "Hc", descriptor = "[Lclient!lia;")
	public final Class157_Sub3[] aClass157_Sub3Array2;

	@OriginalMember(owner = "client!gia", name = "Me", descriptor = "I")
	private int anInt3908;

	@OriginalMember(owner = "client!gia", name = "Ag", descriptor = "F")
	private float aFloat73;

	@OriginalMember(owner = "client!gia", name = "nb", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!gia", name = "Kf", descriptor = "[F")
	private final float[] aFloatArray40;

	@OriginalMember(owner = "client!gia", name = "hb", descriptor = "I")
	public int anInt3911;

	@OriginalMember(owner = "client!gia", name = "mg", descriptor = "I")
	private int anInt3915;

	@OriginalMember(owner = "client!gia", name = "sd", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!gia", name = "L", descriptor = "I")
	private int anInt3904;

	@OriginalMember(owner = "client!gia", name = "x", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!gia", name = "Ed", descriptor = "I")
	private int anInt3914;

	@OriginalMember(owner = "client!gia", name = "eb", descriptor = "I")
	private int anInt3912;

	@OriginalMember(owner = "client!gia", name = "ic", descriptor = "[Lclient!lia;")
	public final Class157_Sub3[] aClass157_Sub3Array1;

	@OriginalMember(owner = "client!gia", name = "ag", descriptor = "[F")
	private final float[] aFloatArray42;

	@OriginalMember(owner = "client!gia", name = "nd", descriptor = "I")
	public int anInt3900;

	@OriginalMember(owner = "client!gia", name = "oh", descriptor = "[F")
	public final float[] aFloatArray38;

	@OriginalMember(owner = "client!gia", name = "ue", descriptor = "I")
	public int anInt3919;

	@OriginalMember(owner = "client!gia", name = "Lc", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!gia", name = "Nf", descriptor = "I")
	public int anInt3903;

	@OriginalMember(owner = "client!gia", name = "Ie", descriptor = "I")
	private int anInt3920;

	@OriginalMember(owner = "client!gia", name = "Xc", descriptor = "I")
	public int anInt3916;

	@OriginalMember(owner = "client!gia", name = "Oe", descriptor = "I")
	private int anInt3892;

	@OriginalMember(owner = "client!gia", name = "Uf", descriptor = "F")
	private float aFloat80;

	@OriginalMember(owner = "client!gia", name = "Be", descriptor = "F")
	private float aFloat82;

	@OriginalMember(owner = "client!gia", name = "ye", descriptor = "I")
	public int anInt3917;

	@OriginalMember(owner = "client!gia", name = "vb", descriptor = "I")
	public int anInt3897;

	@OriginalMember(owner = "client!gia", name = "Zg", descriptor = "[Lclient!vj;")
	private final Class3_Sub16[] aClass3_Sub16Array4;

	@OriginalMember(owner = "client!gia", name = "jd", descriptor = "Lclient!je;")
	public Class3_Sub28_Sub1 aClass3_Sub28_Sub1_3;

	@OriginalMember(owner = "client!gia", name = "H", descriptor = "[I")
	public int[] anIntArray195;

	@OriginalMember(owner = "client!gia", name = "nf", descriptor = "[B")
	public final byte[] aByteArray21;

	@OriginalMember(owner = "client!gia", name = "Fc", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!gia", name = "Qe", descriptor = "[I")
	public int[] anIntArray196;

	@OriginalMember(owner = "client!gia", name = "sh", descriptor = "I")
	public final int anInt3873;

	@OriginalMember(owner = "client!gia", name = "pc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas6;

	@OriginalMember(owner = "client!gia", name = "jf", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!gia", name = "Fe", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!gia", name = "Tb", descriptor = "J")
	private final long aLong131;

	@OriginalMember(owner = "client!gia", name = "Eg", descriptor = "J")
	private long aLong132;

	@OriginalMember(owner = "client!gia", name = "dh", descriptor = "I")
	public final int anInt3899;

	@OriginalMember(owner = "client!gia", name = "zd", descriptor = "Z")
	public boolean aBoolean328;

	@OriginalMember(owner = "client!gia", name = "Mf", descriptor = "Z")
	public boolean aBoolean320;

	@OriginalMember(owner = "client!gia", name = "kd", descriptor = "Z")
	private boolean aBoolean306;

	@OriginalMember(owner = "client!gia", name = "z", descriptor = "Z")
	public boolean aBoolean308;

	@OriginalMember(owner = "client!gia", name = "W", descriptor = "Z")
	public boolean aBoolean310;

	@OriginalMember(owner = "client!gia", name = "Ac", descriptor = "Z")
	private boolean aBoolean303;

	@OriginalMember(owner = "client!gia", name = "Sf", descriptor = "Z")
	public boolean aBoolean309;

	@OriginalMember(owner = "client!gia", name = "kb", descriptor = "Z")
	private final boolean aBoolean321;

	@OriginalMember(owner = "client!gia", name = "ig", descriptor = "Lclient!kl;")
	private final Class210 aClass210_1;

	@OriginalMember(owner = "client!gia", name = "pf", descriptor = "Lclient!tc;")
	public final Class350 aClass350_1;

	@OriginalMember(owner = "client!gia", name = "Te", descriptor = "Lclient!hia;")
	private final Class152 aClass152_1;

	@OriginalMember(owner = "client!gia", name = "id", descriptor = "Lclient!ft;")
	private Class3_Sub19_Sub1 aClass3_Sub19_Sub1_1;

	@OriginalMember(owner = "client!gia", name = "Td", descriptor = "Lclient!pfa;")
	private final Class285 aClass285_1;

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class67_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class283();
		new Class136(16);
		this.aClass357_12 = new Class357();
		this.aClass357_13 = new Class357();
		this.aClass357_14 = new Class357();
		this.aClass357_15 = new Class357();
		this.aClass357_16 = new Class357();
		this.aClass357_17 = new Class357();
		this.aClass357_18 = new Class357();
		this.aClass181_Sub2_3 = new Class181_Sub2();
		this.aClass181_Sub2_4 = new Class181_Sub2();
		this.aClass181_Sub2_5 = new Class181_Sub2();
		this.aFloat68 = 1.0F;
		this.aFloat65 = 0.0F;
		this.aBoolean313 = false;
		this.aFloat72 = 1.0F;
		this.aFloatArray39 = new float[4];
		this.anInt3902 = 0;
		this.aFloat66 = -1.0F;
		this.anInt3890 = 0;
		this.anInt3896 = -1;
		this.anInt3907 = -1;
		this.anInt3905 = -1;
		this.aFloatArray41 = new float[16];
		this.aFloat76 = 1.0F;
		this.anInt3906 = 0;
		this.aBoolean311 = true;
		this.anInt3898 = 0;
		this.aClass157_Sub3Array2 = new Class157_Sub3[7];
		this.anInt3908 = 3584;
		this.aFloat73 = -1.0F;
		this.aFloat71 = 3584.0F;
		this.aFloatArray40 = new float[4];
		this.anInt3911 = 512;
		this.anInt3915 = 0;
		this.aFloat77 = 1.0F;
		this.anInt3904 = 0;
		this.aFloat69 = 3584.0F;
		this.anInt3914 = 0;
		this.anInt3912 = -1;
		this.aClass157_Sub3Array1 = new Class157_Sub3[7];
		this.aFloatArray42 = new float[4];
		this.anInt3900 = -1;
		this.aFloatArray38 = new float[4];
		this.anInt3919 = 50;
		this.aFloat81 = -1.0F;
		this.anInt3903 = 0;
		this.anInt3920 = 8448;
		this.anInt3916 = 512;
		this.anInt3892 = 8448;
		this.aFloat80 = 1.0F;
		this.aFloat82 = -1.0F;
		this.anInt3917 = 0;
		this.anInt3897 = 0;
		this.aClass3_Sub16Array4 = new Class3_Sub16[Static706.anInt11039];
		this.aClass3_Sub28_Sub1_3 = new Class3_Sub28_Sub1(8192);
		this.anIntArray195 = new int[1];
		this.aByteArray21 = new byte[16384];
		this.anIntArray197 = new int[1];
		this.anIntArray196 = new int[1];
		this.anInt3873 = arg2;
		this.aCanvas7 = this.aCanvas6 = arg0;
		if (!Static376.method5425("jaclib")) {
			throw new RuntimeException("");
		} else if (Static376.method5425("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong132 = this.aLong131 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt3873);
				if (this.aLong131 == 0L) {
					throw new RuntimeException("");
				}
				this.method3265();
				@Pc(349) int local349 = this.method3262();
				if (local349 != 0) {
					throw new RuntimeException("");
				}
				this.anInt3899 = this.aBoolean322 ? 33639 : 5121;
				if (this.aString66.indexOf("radeon") != -1) {
					@Pc(379) int local379 = 0;
					@Pc(381) boolean local381 = false;
					@Pc(383) boolean local383 = false;
					@Pc(392) String[] local392 = Static349.method5051(' ', this.aString66.replace('/', ' '));
					for (@Pc(394) int local394 = 0; local394 < local392.length; local394++) {
						@Pc(400) String local400 = local392[local394];
						try {
							if (local400.length() > 0) {
								if (local400.charAt(0) == 'x' && local400.length() >= 3 && Static399.method5982(local400.substring(1, 3))) {
									local400 = local400.substring(1);
									local383 = true;
								}
								if (local400.equals("hd")) {
									local381 = true;
								} else {
									if (local400.startsWith("hd")) {
										local381 = true;
										local400 = local400.substring(2);
									}
									if (local400.length() >= 4 && Static399.method5982(local400.substring(0, 4))) {
										local379 = Static349.method5057(local400.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(484) Exception local484) {
						}
					}
					if (!local381 || local379 < 4000) {
						this.aBoolean328 = false;
					}
					if (!local383 && !local381) {
						if (local379 >= 7000 && local379 <= 9250) {
							this.aBoolean320 = false;
						}
						if (local379 >= 7000 && local379 <= 7999) {
							this.aBoolean306 = false;
						}
					}
					this.aBoolean308 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean310 = true;
					this.aBoolean303 = this.aBoolean306;
				}
				if (this.aString65.indexOf("intel") != -1) {
					this.aBoolean309 = false;
				}
				this.aBoolean321 = !this.aString65.equals("s3 graphics");
				if (this.aBoolean306) {
					try {
						@Pc(596) int[] local596 = new int[1];
						OpenGL.glGenBuffersARB(1, local596, 0);
					} catch (@Pc(602) Throwable local602) {
						throw new RuntimeException("");
					}
				}
				Static533.method7508(false, true);
				this.aBoolean298 = true;
				this.aClass210_1 = new Class210(this, super.anInterface2_11);
				this.method3235();
				this.aClass350_1 = new Class350(this);
				this.aClass152_1 = new Class152(this);
				if (this.aClass152_1.method3709()) {
					this.aClass3_Sub19_Sub1_1 = new Class3_Sub19_Sub1(this);
					if (!this.aClass3_Sub19_Sub1_1.method2926()) {
						this.aClass3_Sub19_Sub1_1.method2916();
						this.aClass3_Sub19_Sub1_1 = null;
					}
				}
				this.aClass285_1 = new Class285(this);
				this.method3261();
				this.method3259();
				this.method7663();
			} catch (@Pc(680) Throwable local680) {
				local680.printStackTrace();
				this.method7632();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!gia", name = "i", descriptor = "(I)V")
	@Override
	public void method7666() {
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7636(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(23) Long local23 = (Long) this.aHashtable3.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local23);
			this.aHashtable3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static618.method5119(arg1, arg2, this, arg0, arg3);
	}

	@OriginalMember(owner = "client!gia", name = "l", descriptor = "(II)I")
	public int method3219(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!gia", name = "f", descriptor = "(Z)V")
	public void method3220() {
		if (this.anInt3886 == 8) {
			return;
		}
		this.method3248();
		this.method3243(true);
		this.method3270(true);
		this.method3227(true);
		this.method3257(1);
		this.anInt3886 = 8;
	}

	@OriginalMember(owner = "client!gia", name = "m", descriptor = "(I)V")
	private void method3221() {
		this.aFloat78 = (float) (this.anInt3902 - this.anInt3897);
		this.aFloat75 = (float) (this.anInt3890 - this.anInt3903);
		this.aFloat67 = (float) (this.anInt3898 - this.anInt3903);
		this.aFloat83 = (float) (this.anInt3914 - this.anInt3897);
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(Z)V")
	@Override
	public void method7673(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "([I)V")
	@Override
	public void method7702(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt3828;
		arg0[0] = this.anInt3783;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IB)I")
	public int method3222(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(Lclient!md;I)V")
	public void method3223(@OriginalArg(0) Interface17 arg0) {
		if (this.aBoolean312) {
			this.method3246(arg0);
			this.method3284(arg0);
		} else if (this.anInt3878 >= 0 && this.anInterface17Array1[this.anInt3878] == arg0) {
			this.anInterface17Array1[this.anInt3878--] = null;
			arg0.method8066();
			if (this.anInt3878 < 0) {
				this.anInterface17_2 = this.anInterface17_1 = null;
			} else {
				this.anInterface17_2 = this.anInterface17_1 = this.anInterface17Array1[this.anInt3878];
				this.anInterface17_2.method8065();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gia", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt3828 - arg1 - local12, arg2, 1, 32993, this.anInt3899, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(III)V")
	public synchronized void method3224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub42 local15 = new Class3_Sub42(arg1);
		local15.aLong382 = (long) arg0;
		this.aClass357_16.method8401(local15);
	}

	@OriginalMember(owner = "client!gia", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method3257(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!gia", name = "d", descriptor = "(B)V")
	private void method3225() {
		Static104.aFloatArray7[1] = this.aFloat70 * this.aFloat76;
		Static104.aFloatArray7[3] = 1.0F;
		Static104.aFloatArray7[0] = this.aFloat77 * this.aFloat70;
		Static104.aFloatArray7[2] = this.aFloat68 * this.aFloat70;
		OpenGL.glLightModelfv(2899, Static104.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass152_1.method3705(arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(FFZF)V")
	private void method3226(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean319) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg1, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean319 = true;
	}

	@OriginalMember(owner = "client!gia", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean314 = false;
	}

	@OriginalMember(owner = "client!gia", name = "f", descriptor = "()V")
	@Override
	public void method7678() {
		if (this.aClass3_Sub19_Sub1_1 != null && this.aClass3_Sub19_Sub1_1.method2911()) {
			this.aClass152_1.method3703(this.aClass3_Sub19_Sub1_1);
			this.aClass210_1.method4992();
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZI)V")
	public void method3227(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean299) {
			this.aBoolean299 = arg0;
			this.method3294();
			this.anInt3886 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gia", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass181_Sub2_3.aFloat136 * (float) arg1 + (float) arg0 * this.aClass181_Sub2_3.aFloat132 + this.aClass181_Sub2_3.aFloat135 * (float) arg2 + this.aClass181_Sub2_3.aFloat133;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass181_Sub2_3.aFloat135 * (float) arg5 + this.aClass181_Sub2_3.aFloat132 * (float) arg3 + this.aClass181_Sub2_3.aFloat136 * (float) arg4 + this.aClass181_Sub2_3.aFloat133;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt3919 > local32 && (float) this.anInt3919 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt3908 < local32 && (float) this.anInt3908 < local63) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) ((this.aClass181_Sub2_3.aFloat129 + (float) arg1 * this.aClass181_Sub2_3.aFloat134 + this.aClass181_Sub2_3.aFloat138 * (float) arg0 + this.aClass181_Sub2_3.aFloat139 * (float) arg2) * (float) this.anInt3911 / local32);
		@Pc(173) int local173 = (int) ((this.aClass181_Sub2_3.aFloat139 * (float) arg5 + (float) arg4 * this.aClass181_Sub2_3.aFloat134 + (float) arg3 * this.aClass181_Sub2_3.aFloat138 + this.aClass181_Sub2_3.aFloat129) * (float) this.anInt3911 / local63);
		if ((float) local141 < this.aFloat67 && (float) local173 < this.aFloat67) {
			local7 |= 0x1;
		} else if ((float) local141 > this.aFloat75 && this.aFloat75 < (float) local173) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) ((this.aClass181_Sub2_3.aFloat137 + (float) arg2 * this.aClass181_Sub2_3.aFloat130 + this.aClass181_Sub2_3.aFloat140 * (float) arg0 + this.aClass181_Sub2_3.aFloat131 * (float) arg1) * (float) this.anInt3916 / local32);
		@Pc(277) int local277 = (int) ((float) this.anInt3916 * (this.aClass181_Sub2_3.aFloat137 + (float) arg5 * this.aClass181_Sub2_3.aFloat130 + this.aClass181_Sub2_3.aFloat140 * (float) arg3 + this.aClass181_Sub2_3.aFloat131 * (float) arg4) / local63);
		if ((float) local245 < this.aFloat83 && this.aFloat83 > (float) local277) {
			local7 |= 0x4;
		} else if ((float) local245 > this.aFloat78 && (float) local277 > this.aFloat78) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gia", name = "w", descriptor = "()Z")
	@Override
	public boolean method7697() {
		return this.aBoolean326 && (!this.method7643() || this.aBoolean305);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!hu;I)V")
	@Override
	public void method7692(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1) {
		this.aClass117_1.method2805(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!gia", name = "u", descriptor = "(I)V")
	private void method3228() {
		OpenGL.glViewport(this.anInt3904, this.anInt3915, this.anInt3783, this.anInt3828);
	}

	@OriginalMember(owner = "client!gia", name = "p", descriptor = "()I")
	@Override
	public int method7634() {
		return 4;
	}

	@OriginalMember(owner = "client!gia", name = "A", descriptor = "(I)V")
	private void method3229() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray41, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gia", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass181_Sub2_3.aFloat133 + this.aClass181_Sub2_3.aFloat135 * (float) arg2 + this.aClass181_Sub2_3.aFloat132 * (float) arg0 + (float) arg1 * this.aClass181_Sub2_3.aFloat136;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(78) int local78 = (int) ((float) this.anInt3911 * ((float) arg2 * this.aClass181_Sub2_3.aFloat139 + this.aClass181_Sub2_3.aFloat134 * (float) arg1 + this.aClass181_Sub2_3.aFloat138 * (float) arg0 + this.aClass181_Sub2_3.aFloat129) / local28);
		arg3[0] = (int) ((float) local78 - this.aFloat67);
		@Pc(120) int local120 = (int) ((float) this.anInt3916 * (this.aClass181_Sub2_3.aFloat137 + this.aClass181_Sub2_3.aFloat130 * (float) arg2 + this.aClass181_Sub2_3.aFloat131 * (float) arg1 + (float) arg0 * this.aClass181_Sub2_3.aFloat140) / local28);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local120 - this.aFloat83);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZLclient!nd;)V")
	public void method3230(@OriginalArg(1) Class181_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method6182(), 0);
	}

	@OriginalMember(owner = "client!gia", name = "y", descriptor = "()Z")
	@Override
	public boolean method7712() {
		return true;
	}

	@OriginalMember(owner = "client!gia", name = "n", descriptor = "()V")
	@Override
	public void method7663() {
		if (!this.aBoolean321 || this.anInt3783 <= 0 || this.anInt3828 <= 0) {
			return;
		}
		@Pc(21) int local21 = this.anInt3898;
		@Pc(24) int local24 = this.anInt3890;
		@Pc(27) int local27 = this.anInt3914;
		@Pc(30) int local30 = this.anInt3902;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3240();
		this.method3243(false);
		this.method3299(false);
		this.method3270(false);
		this.method3227(false);
		this.method3234((Class245) null);
		this.method3245(-2);
		this.method3255(1);
		this.method3257(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt3783, this.anInt3828, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local21, local27, local24, local30);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIIF)Lclient!vj;")
	@Override
	public Class3_Sub16 method7703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub16_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gia", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean314) {
			throw new RuntimeException("");
		}
		this.anInt3896 = arg1;
		this.anInt3889 = arg0;
		this.anInt3917 = arg3;
		this.anInt3905 = arg2;
		if (this.aBoolean313) {
			this.aClass285_1.aClass43_Sub1_1.method843();
			this.aClass285_1.aClass43_Sub1_1.method844();
		}
	}

	@OriginalMember(owner = "client!gia", name = "A", descriptor = "()V")
	@Override
	public void method7645() {
		if (this.aBoolean309) {
			if (this.anInterface17_1 != this.aClass339_3) {
				throw new RuntimeException();
			}
			this.aClass339_3.method8077(0);
			this.aClass339_3.method8077(8);
			this.method3223(this.aClass339_3);
		} else if (this.aBoolean329) {
			this.aClass9_Sub2_1.method8607(0, 0, this.anInt3783, this.anInt3828, 0, 0);
			this.anOpenGL1.setSurface(this.aLong132);
		} else {
			throw new RuntimeException("");
		}
		this.aClass9_Sub2_1 = null;
		this.anInt3783 = this.anInt3842;
		this.anInt3828 = this.anInt3680;
		this.method3240();
		this.method3228();
		this.la();
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!ika;IIII)V")
	public void method3232(@OriginalArg(0) Interface11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0.method2433();
		@Pc(22) int local22 = arg1 * this.method3222(local15);
		this.method3277(arg0);
		OpenGL.glDrawElements(4, arg2, local15, (long) local22 + arg0.method2435());
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(FBFFF)V")
	public void method3233(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static104.aFloatArray7[3] = arg1;
		Static104.aFloatArray7[1] = arg2;
		Static104.aFloatArray7[0] = arg0;
		Static104.aFloatArray7[2] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static104.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!gia", name = "B", descriptor = "()Z")
	@Override
	public boolean method7655() {
		if (this.aClass3_Sub19_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub19_Sub1_1.method2911()) {
			if (!this.aClass152_1.method3704(this.aClass3_Sub19_Sub1_1)) {
				return false;
			}
			this.aClass210_1.method4992();
		}
		return true;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!sga;B)V")
	public void method3234(@OriginalArg(0) Class245 arg0) {
		@Pc(11) Class245 local11 = this.aClass245Array1[this.anInt3895];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt10362);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt10362);
				} else if (arg0.anInt10362 != local11.anInt10362) {
					OpenGL.glDisable(local11.anInt10362);
					OpenGL.glEnable(arg0.anInt10362);
				}
				OpenGL.glBindTexture(arg0.anInt10362, arg0.method8678());
			}
			this.aClass245Array1[this.anInt3895] = arg0;
		}
		this.anInt3886 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!gia", name = "v", descriptor = "(I)V")
	private void method3235() {
		this.aClass245Array1 = new Class245[this.anInt3887];
		this.aClass245_Sub2_4 = new Class245_Sub2(this, 3553, 6408, 1, 1);
		new Class245_Sub2(this, 3553, 6408, 1, 1);
		new Class245_Sub2(this, 3553, 6408, 1, 1);
		for (@Pc(36) int local36 = 0; local36 < 7; local36++) {
			this.aClass157_Sub3Array2[local36] = new Class157_Sub3(this);
			this.aClass157_Sub3Array1[local36] = new Class157_Sub3(this);
		}
		if (this.aBoolean309) {
			this.aClass339_4 = new Class339(this);
			new Class339(this);
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7682(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static162.aFloat58 = arg1;
		Static173.aFloat59 = arg2;
		Static11.aFloat1 = arg0;
	}

	@OriginalMember(owner = "client!gia", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt3922;
		this.anInt3922 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!gia", name = "h", descriptor = "(Z)V")
	private void method3236() {
		if (this.anInt3886 == 1) {
			return;
		}
		this.method3292();
		this.method3243(false);
		this.method3299(false);
		this.method3270(false);
		this.method3227(false);
		this.method3234((Class245) null);
		this.method3245(-2);
		this.method3255(1);
		this.anInt3886 = 1;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(26) Class1_Sub3 local26 = (Class1_Sub3) arg5;
		@Pc(29) Class245_Sub2_Sub1 local29 = local26.aClass245_Sub2_Sub1_3;
		this.method3295();
		this.method3234(local26.aClass245_Sub2_Sub1_3);
		this.method3257(1);
		this.method3271(8448, 7681);
		this.method3279(34167, 768, 0);
		@Pc(59) float local59 = local29.aFloat189 / (float) local29.anInt10095;
		@Pc(66) float local66 = local29.aFloat190 / (float) local29.anInt10098;
		@Pc(72) float local72 = (float) arg2 - (float) arg0;
		@Pc(79) float local79 = (float) -arg1 + (float) arg3;
		@Pc(92) float local92 = (float) (1.0D / Math.sqrt((double) (local72 * local72 + local79 * local79)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(114) int local114 = arg10 % (arg9 + arg8);
		@Pc(118) float local118 = local79 * local92;
		@Pc(122) float local122 = local72 * local92;
		@Pc(127) float local127 = local122 * (float) arg8;
		@Pc(132) float local132 = (float) arg8 * local118;
		@Pc(134) float local134 = 0.0F;
		@Pc(136) float local136 = 0.0F;
		@Pc(138) float local138 = local127;
		@Pc(140) float local140 = local132;
		if (arg8 < local114) {
			local136 = local118 * (float) (arg8 + arg9 - local114);
			local134 = (float) (arg9 + arg8 - local114) * local122;
		} else {
			local140 = (float) (arg8 - local114) * local118;
			local138 = (float) (arg8 - local114) * local122;
		}
		@Pc(192) float local192 = (float) arg0 + local134 + 0.35F;
		@Pc(199) float local199 = (float) arg1 + local136 + 0.35F;
		@Pc(204) float local204 = (float) arg9 * local122;
		@Pc(209) float local209 = (float) arg9 * local118;
		while (true) {
			if (arg2 <= arg0) {
				if ((float) arg2 + 0.35F > local192) {
					break;
				}
				if ((float) arg2 > local192 + local138) {
					local138 = (float) arg2 - local192;
				}
			} else {
				if ((float) arg2 + 0.35F < local192) {
					break;
				}
				if ((float) arg2 < local192 + local138) {
					local138 = (float) arg2 - local192;
				}
			}
			if (arg1 < arg3) {
				if (local199 > (float) arg3 + 0.35F) {
					break;
				}
				if (local199 + local140 > (float) arg3) {
					local140 = (float) arg3 - local199;
				}
			} else {
				if (local199 < (float) arg3 + 0.35F) {
					break;
				}
				if (local140 + local199 < (float) arg3) {
					local140 = (float) arg3 - local199;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(((float) -arg6 + local192) * local59, local66 * ((float) -arg7 + local199));
			OpenGL.glVertex2f(local192, local199);
			OpenGL.glTexCoord2f(local59 * ((float) -arg6 + local138 + local192), local66 * (local199 + local140 - (float) arg7));
			OpenGL.glVertex2f(local192 + local138, local140 + local199);
			local192 += local138 + local204;
			OpenGL.glEnd();
			local199 += local209 + local140;
			local138 = local127;
			local140 = local132;
		}
		this.method3279(5890, 768, 0);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!iq;IIII)Lclient!ka;")
	@Override
	public Class157 method7653(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class157_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!gia", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(12) boolean local12 = this.anInt3912 != arg0;
		if (local12 || arg1 != this.aFloat66 || this.aFloat81 != arg2) {
			this.aFloat66 = arg1;
			this.aFloat81 = arg2;
			this.anInt3912 = arg0;
			if (local12) {
				this.aFloat77 = (float) (this.anInt3912 & 0xFF0000) / 1.671168E7F;
				this.aFloat76 = (float) (this.anInt3912 & 0xFF00) / 65280.0F;
				this.aFloat68 = (float) (this.anInt3912 & 0xFF) / 255.0F;
				this.method3225();
			}
			this.method3297();
		}
		if (arg3 == this.aFloatArray39[0] && arg4 == this.aFloatArray39[1] && arg5 == this.aFloatArray39[2]) {
			return;
		}
		this.aFloatArray39[2] = arg5;
		this.aFloatArray39[1] = arg4;
		this.aFloatArray39[0] = arg3;
		this.aFloatArray42[2] = -arg5;
		this.aFloatArray42[1] = -arg4;
		this.aFloatArray42[0] = -arg3;
		@Pc(151) float local151 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray38[1] = arg4 * local151;
		this.aFloatArray38[2] = arg5 * local151;
		this.aFloatArray38[0] = local151 * arg3;
		this.aFloatArray40[2] = -this.aFloatArray38[2];
		this.aFloatArray40[0] = -this.aFloatArray38[0];
		this.aFloatArray40[1] = -this.aFloatArray38[1];
		this.method3241();
		this.anInt3894 = (int) (arg5 * 256.0F / arg4);
		this.anInt3901 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(III)V")
	public synchronized void method3237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub42 local8 = new Class3_Sub42(arg1);
		local8.aLong382 = (long) arg0;
		this.aClass357_14.method8401(local8);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Z)V")
	@Override
	public void method7652(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gia", name = "v", descriptor = "()Z")
	@Override
	public boolean method7637() {
		return true;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	@Override
	public Class77 method7662(@OriginalArg(0) Class77 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class77 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean318 && this.aBoolean309) {
			@Pc(21) Class77_Sub1_Sub1 local21 = null;
			@Pc(24) Class77_Sub1 local24 = (Class77_Sub1) arg0;
			@Pc(27) Class77_Sub1 local27 = (Class77_Sub1) arg1;
			@Pc(31) Class245_Sub1 local31 = local24.method7555();
			@Pc(35) Class245_Sub1 local35 = local27.method7555();
			if (local31 != null && local35 != null) {
				@Pc(59) int local59 = local31.anInt7222 > local35.anInt7222 ? local31.anInt7222 : local35.anInt7222;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class77_Sub1_Sub1) {
					@Pc(75) Class77_Sub1_Sub1 local75 = (Class77_Sub1_Sub1) arg3;
					if (local75.method4028() == local59) {
						local21 = local75;
					}
				}
				if (local21 == null) {
					local21 = new Class77_Sub1_Sub1(this, local59);
				}
				if (local21.method4027(arg2, local31, local35)) {
					return local21;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!gia", name = "m", descriptor = "()Lclient!iu;")
	@Override
	public Class181 method7683() {
		return this.aClass181_Sub2_3;
	}

	@OriginalMember(owner = "client!gia", name = "d", descriptor = "(I)V")
	private void method3238() {
		this.aFloat74 = (float) (this.anInt3908 - this.anInt3906) - this.aFloat65;
		this.aFloat64 = this.aFloat74 - this.aFloat72 * (float) this.anInt3907;
		if ((float) this.anInt3919 > this.aFloat64) {
			this.aFloat64 = (float) this.anInt3919;
		}
		OpenGL.glFogf(2915, this.aFloat64);
		OpenGL.glFogf(2916, this.aFloat74);
		Static104.aFloatArray7[2] = (float) (this.anInt3900 & 0xFF) / 255.0F;
		Static104.aFloatArray7[0] = (float) (this.anInt3900 & 0xFF0000) / 1.671168E7F;
		Static104.aFloatArray7[1] = (float) (this.anInt3900 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static104.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!gia", name = "i", descriptor = "(II)V")
	public synchronized void method3239(@OriginalArg(0) int arg0) {
		@Pc(20) Class3_Sub42 local20 = new Class3_Sub42(arg0);
		this.aClass357_15.method8401(local20);
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "()Z")
	@Override
	public boolean method7661() {
		return false;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!jr;Z)Lclient!bka;")
	@Override
	public Class9 method7659(@OriginalArg(0) Class194 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt5595 * arg0.anInt5596];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray45 == null) {
			for (local21 = 0; local21 < arg0.anInt5595; local21++) {
				for (local25 = 0; local25 < arg0.anInt5596; local25++) {
					@Pc(38) int local38 = arg0.anIntArray319[arg0.aByteArray46[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt5595; local21++) {
				for (local25 = 0; local25 < arg0.anInt5596; local25++) {
					local12[local16++] = arg0.anIntArray319[arg0.aByteArray46[local14] & 0xFF] | arg0.aByteArray45[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(138) Class9 local138 = this.method7688(local12, arg0.anInt5596, arg0.anInt5596, arg0.anInt5595);
		local138.method8608(arg0.anInt5594, arg0.anInt5597, arg0.anInt5593, arg0.anInt5598);
		return local138;
	}

	@OriginalMember(owner = "client!gia", name = "s", descriptor = "(I)V")
	public void method3240() {
		if (this.anInt3909 != 0) {
			this.anInt3909 = 0;
			this.anInt3886 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gia", name = "f", descriptor = "(B)V")
	public void method3241() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray38, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray40, 0);
	}

	@OriginalMember(owner = "client!gia", name = "z", descriptor = "(I)V")
	private void method3242() {
		if (this.aBoolean319) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean319 = false;
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(II)Lclient!hba;")
	@Override
	public Interface8 method7689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!gia", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method3236();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method3257(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean326) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean326) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(IZ)V")
	public void method3243(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean315) {
			this.aBoolean315 = arg0;
			this.method3300();
			this.anInt3886 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IFF)V")
	public void method3244(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat72 = arg1;
		this.aFloat65 = arg0;
		this.method3238();
	}

	@OriginalMember(owner = "client!gia", name = "k", descriptor = "(II)V")
	public void method3245(@OriginalArg(0) int arg0) {
		this.method3278(arg0, true);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7650(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!gia", name = "r", descriptor = "()Z")
	@Override
	public boolean method7658() {
		return true;
	}

	@OriginalMember(owner = "client!gia", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3236();
		this.method3257(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V")
	@Override
	public void method7695(@OriginalArg(0) int arg0) {
		this.method3265();
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(BLclient!md;)V")
	public void method3246(@OriginalArg(1) Interface17 arg0) {
		if (this.anInt3880 < 0 || arg0 != this.anInterface17Array3[this.anInt3880]) {
			throw new RuntimeException();
		}
		this.anInterface17Array3[this.anInt3880--] = null;
		arg0.method8067();
		if (this.anInt3880 >= 0) {
			this.anInterface17_2 = this.anInterface17Array3[this.anInt3880];
			this.anInterface17_2.method8068();
		} else {
			this.anInterface17_2 = null;
		}
	}

	@OriginalMember(owner = "client!gia", name = "h", descriptor = "(II)V")
	public void method3247(@OriginalArg(1) int arg0) {
		Static104.aFloatArray7[3] = (float) (arg0 >>> 24) / 255.0F;
		Static104.aFloatArray7[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static104.aFloatArray7[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static104.aFloatArray7[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static104.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!gia", name = "w", descriptor = "(I)V")
	private void method3248() {
		if (this.anInt3909 != 2) {
			this.anInt3909 = 2;
			this.method3229();
			this.method3291();
			this.anInt3886 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!gia", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(49) float local49;
		@Pc(53) float local53;
		if (this.aClass245_Sub2_Sub1_2 == null || this.aClass245_Sub2_Sub1_2.anInt10091 < arg2 || this.aClass245_Sub2_Sub1_2.anInt10092 < arg3) {
			this.aClass245_Sub2_Sub1_2 = Static305.method4657(this, arg3, arg2, arg6);
			this.aClass245_Sub2_Sub1_2.method8473(false, false);
			local49 = this.aClass245_Sub2_Sub1_2.aFloat190;
			local53 = this.aClass245_Sub2_Sub1_2.aFloat189;
		} else {
			this.aClass245_Sub2_Sub1_2.method8468(false, 6406, arg3, arg6, arg2);
			local49 = (float) arg3 * this.aClass245_Sub2_Sub1_2.aFloat190 / (float) this.aClass245_Sub2_Sub1_2.anInt10092;
			local53 = (float) arg2 * this.aClass245_Sub2_Sub1_2.aFloat189 / (float) this.aClass245_Sub2_Sub1_2.anInt10091;
		}
		this.method3295();
		this.method3234(this.aClass245_Sub2_Sub1_2);
		this.method3257(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3247(arg5);
		this.method3271(34165, 34165);
		this.method3279(34166, 768, 0);
		this.method3279(5890, 770, 2);
		this.method3269(34166, 0);
		this.method3269(5890, 2);
		@Pc(155) float local155 = (float) arg0;
		@Pc(158) float local158 = (float) arg1;
		@Pc(163) float local163 = (float) arg2 + local155;
		OpenGL.glBegin(7);
		@Pc(170) float local170 = (float) arg3 + local158;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local155, local158);
		OpenGL.glTexCoord2f(0.0F, local53);
		OpenGL.glVertex2f(local155, local170);
		OpenGL.glTexCoord2f(local49, local53);
		OpenGL.glVertex2f(local163, local170);
		OpenGL.glTexCoord2f(local49, 0.0F);
		OpenGL.glVertex2f(local163, local158);
		OpenGL.glEnd();
		this.method3279(5890, 768, 0);
		this.method3279(34166, 770, 2);
		this.method3269(5890, 0);
		this.method3269(34166, 2);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!rt;I)V")
	public void method3250(@OriginalArg(0) Interface24 arg0) {
		if (arg0 != this.anInterface24_3) {
			if (this.aBoolean306) {
				OpenGL.glBindBufferARB(34962, arg0.method9136());
			}
			this.anInterface24_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(IIIIII)Lclient!dn;")
	@Override
	public Class77 method7685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean318 ? new Class77_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IBI)V")
	public void method3252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3915 = arg1;
		this.anInt3904 = arg0;
		this.method3228();
		this.method3281();
	}

	@OriginalMember(owner = "client!gia", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method3227(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(BLclient!md;)V")
	public void method3253(@OriginalArg(1) Interface17 arg0) {
		if (this.aBoolean312) {
			this.method3258(arg0);
			this.method3296(arg0);
		} else if (this.anInt3878 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt3878 >= 0) {
				this.anInterface17Array1[this.anInt3878].method8066();
			}
			this.anInterface17_2 = this.anInterface17_1 = this.anInterface17Array1[++this.anInt3878] = arg0;
			this.anInterface17_2.method8065();
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		this.method3236();
		this.method3257(1);
		@Pc(28) float local28 = (float) arg2 - (float) arg0;
		@Pc(34) float local34 = (float) arg3 - (float) arg1;
		@Pc(47) float local47 = (float) (1.0D / Math.sqrt((double) (local34 * local34 + local28 * local28)));
		@Pc(54) int local54 = arg7 % (arg6 + arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(73) float local73 = local34 * local47;
		@Pc(77) float local77 = local28 * local47;
		@Pc(82) float local82 = local77 * (float) arg5;
		@Pc(87) float local87 = local73 * (float) arg5;
		@Pc(89) float local89 = 0.0F;
		@Pc(91) float local91 = 0.0F;
		@Pc(93) float local93 = local82;
		@Pc(95) float local95 = local87;
		if (arg5 < local54) {
			local91 = (float) (arg5 + arg6 - local54) * local73;
			local89 = local77 * (float) (arg6 + arg5 - local54);
		} else {
			local95 = (float) (arg5 - local54) * local73;
			local93 = local77 * (float) (arg5 - local54);
		}
		@Pc(145) float local145 = (float) arg0 + local89 + 0.35F;
		@Pc(152) float local152 = (float) arg1 + local91 + 0.35F;
		@Pc(157) float local157 = (float) arg6 * local77;
		@Pc(162) float local162 = (float) arg6 * local73;
		while (true) {
			if (arg2 <= arg0) {
				if ((float) arg2 + 0.35F > local145) {
					break;
				}
				if ((float) arg2 > local93 + local145) {
					local93 = (float) arg2 - local145;
				}
			} else {
				if (local145 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local93 + local145) {
					local93 = (float) arg2 - local145;
				}
			}
			if (arg1 < arg3) {
				if ((float) arg3 + 0.35F < local152) {
					break;
				}
				if (local95 + local152 > (float) arg3) {
					local95 = (float) arg3 - local152;
				}
			} else {
				if ((float) arg3 + 0.35F > local152) {
					break;
				}
				if ((float) arg3 > local95 + local152) {
					local95 = (float) arg3 - local152;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local145, local152);
			OpenGL.glVertex2f(local93 + local145, local152 + local95);
			OpenGL.glEnd();
			local145 += local157 + local93;
			local152 += local95 + local162;
			local93 = local82;
			local95 = local87;
		}
	}

	@OriginalMember(owner = "client!gia", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.aClass181_Sub2_3.aFloat135 + (float) arg0 * this.aClass181_Sub2_3.aFloat132 + (float) arg1 * this.aClass181_Sub2_3.aFloat136 + this.aClass181_Sub2_3.aFloat133;
		if ((float) this.anInt3919 > local28 || local28 > (float) this.anInt3908) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(88) int local88 = (int) ((float) this.anInt3911 * ((float) arg2 * this.aClass181_Sub2_3.aFloat139 + (float) arg1 * this.aClass181_Sub2_3.aFloat134 + this.aClass181_Sub2_3.aFloat138 * (float) arg0 + this.aClass181_Sub2_3.aFloat129) / local28);
		@Pc(120) int local120 = (int) ((float) this.anInt3916 * (this.aClass181_Sub2_3.aFloat137 + (float) arg2 * this.aClass181_Sub2_3.aFloat130 + this.aClass181_Sub2_3.aFloat140 * (float) arg0 + (float) arg1 * this.aClass181_Sub2_3.aFloat131) / local28);
		if ((float) local88 >= this.aFloat67 && (float) local88 <= this.aFloat75 && this.aFloat83 <= (float) local120 && (float) local120 <= this.aFloat78) {
			arg3[1] = (int) ((float) local120 - this.aFloat83);
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local88 - this.aFloat67);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!gia", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt3883 + this.anInt3881 + this.anInt3882;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(BF)V")
	public void method3254(@OriginalArg(1) float arg0) {
		if (arg0 == this.aFloat80) {
			return;
		}
		this.aFloat80 = arg0;
		if (this.anInt3909 == 3) {
			this.method3280();
			return;
		}
	}

	@OriginalMember(owner = "client!gia", name = "j", descriptor = "(II)V")
	public void method3255(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method3271(7681, 7681);
		} else if (arg0 == 0) {
			this.method3271(8448, 8448);
		} else if (arg0 == 2) {
			this.method3271(7681, 34165);
		} else if (arg0 == 3) {
			this.method3271(8448, 260);
		} else if (arg0 == 4) {
			this.method3271(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(B)V")
	private void method3256() {
		this.anOpenGL1.b();
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(BI)V")
	public void method3257(@OriginalArg(1) int arg0) {
		if (this.anInt3884 == arg0) {
			return;
		}
		@Pc(18) boolean local18;
		@Pc(22) byte local22;
		if (arg0 == 1) {
			local18 = true;
			local22 = 1;
		} else if (arg0 == 2) {
			local18 = false;
			local22 = 2;
		} else if (arg0 == 128) {
			local18 = true;
			local22 = 3;
		} else {
			local18 = false;
			local22 = 0;
		}
		if (!this.aBoolean301) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean301 = true;
		}
		if (local18 != this.aBoolean300) {
			if (local18) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean300 = local18;
		}
		if (local22 != this.anInt3885) {
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
			this.anInt3885 = local22;
		}
		this.anInt3886 &= 0xFFFFFFE3;
		this.anInt3884 = arg0;
	}

	@OriginalMember(owner = "client!gia", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt3919;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "()Z")
	@Override
	public boolean method7654() {
		return this.aClass3_Sub19_Sub1_1 != null && (this.anInt3873 <= 1 || this.aBoolean305);
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(BLclient!md;)V")
	public void method3258(@OriginalArg(1) Interface17 arg0) {
		if (this.anInt3880 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3880 >= 0) {
			this.anInterface17Array3[this.anInt3880].method8067();
		}
		this.anInterface17_2 = this.anInterface17Array3[++this.anInt3880] = arg0;
		this.anInterface17_2.method8068();
	}

	@OriginalMember(owner = "client!gia", name = "g", descriptor = "(B)V")
	private void method3259() {
		if (this.aCanvas7 == null) {
			this.anInt3842 = this.anInt3680 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas7.getSize();
			this.anInt3842 = local10.width;
			this.anInt3680 = local10.height;
		}
		if (this.anInterface17_1 == null) {
			this.anInt3783 = this.anInt3842;
			this.anInt3828 = this.anInt3680;
			this.method3228();
		}
		this.method3240();
		this.la();
	}

	@OriginalMember(owner = "client!gia", name = "g", descriptor = "(II)V")
	public synchronized void method3260(@OriginalArg(0) int arg0) {
		@Pc(15) Class3 local15 = new Class3();
		local15.aLong382 = (long) arg0;
		this.aClass357_17.method8401(local15);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7631(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas6 == arg0) {
			local5 = this.aLong131;
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable3.get(arg0);
			local5 = local26;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas7 == arg0) {
			this.method3259();
		}
	}

	@OriginalMember(owner = "client!gia", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean311 = arg0;
		this.method3294();
	}

	@OriginalMember(owner = "client!gia", name = "g", descriptor = "(Z)V")
	private void method3261() {
		this.method3245(-2);
		for (@Pc(14) int local14 = this.anInt3887 - 1; local14 >= 0; local14--) {
			this.method3268(local14);
			this.method3234((Class245) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method3271(8448, 8448);
		this.method3279(34168, 770, 2);
		this.method3242();
		this.anInt3884 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt3885 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean300 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean301 = true;
		this.method3243(true);
		this.method3299(true);
		this.method3270(true);
		this.method3227(true);
		this.method3240();
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
			@Pc(138) int local138 = local127 + 16384;
			OpenGL.glLightfv(local138, 4608, local125, 0);
			OpenGL.glLightf(local138, 4615, 0.0F);
			OpenGL.glLightf(local138, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt3912 = this.anInt3900 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!gia", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt3903, this.anInt3897, this.anInt3911, this.anInt3916 };
	}

	@OriginalMember(owner = "client!gia", name = "q", descriptor = "()Lclient!iu;")
	@Override
	public Class181 method7646() {
		return new Class181_Sub2();
	}

	@OriginalMember(owner = "client!gia", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3916 = arg3;
		this.anInt3911 = arg2;
		this.anInt3897 = arg1;
		this.anInt3903 = arg0;
		this.method3288();
		this.method3221();
		if (this.anInt3909 == 3) {
			this.method3280();
		} else if (this.anInt3909 == 2) {
			this.method3229();
			return;
		}
	}

	@OriginalMember(owner = "client!gia", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > this.anInt3783) {
			arg2 = this.anInt3783;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt3828) {
			arg3 = this.anInt3828;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt3898 = arg0;
		this.anInt3914 = arg1;
		this.anInt3890 = arg2;
		this.anInt3902 = arg3;
		OpenGL.glEnable(3089);
		this.method3221();
		this.method3281();
	}

	@OriginalMember(owner = "client!gia", name = "F", descriptor = "(I)I")
	private int method3262() {
		@Pc(5) int local5 = 0;
		this.aString65 = OpenGL.glGetString(7936).toLowerCase();
		this.aString66 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString65.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString65.indexOf("brian paul") != -1 || this.aString65.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(55) String local55 = OpenGL.glGetString(7938);
		@Pc(63) String[] local63 = Static349.method5051(' ', local55.replace('.', ' '));
		if (local63.length >= 2) {
			try {
				@Pc(73) int local73 = Static349.method5057(local63[0]);
				@Pc(79) int local79 = Static349.method5057(local63[1]);
				this.anInt3910 = local73 * 10 + local79;
			} catch (@Pc(89) NumberFormatException local89) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt3910 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(132) int[] local132 = new int[1];
		OpenGL.glGetIntegerv(34018, local132, 0);
		this.anInt3887 = local132[0];
		OpenGL.glGetIntegerv(34929, local132, 0);
		this.anInt3893 = local132[0];
		OpenGL.glGetIntegerv(34930, local132, 0);
		this.anInt3891 = local132[0];
		if (this.anInt3887 < 2 || this.anInt3893 < 2 || this.anInt3891 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean322 = Stream.b();
		this.aBoolean329 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean306 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean326 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean304 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean317 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean307 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean320 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean308 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean318 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean328 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean327 = false;
		this.aBoolean309 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean312 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean323 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean305 = this.aBoolean323 & this.aBoolean312;
		this.aBoolean325 = Class13.aString3.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static104.aFloatArray7, 0);
		this.aFloat73 = Static104.aFloatArray7[0];
		this.aFloat82 = Static104.aFloatArray7[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!gia", name = "n", descriptor = "(I)V")
	public void method3263() {
		if (this.anInt3886 == 16) {
			return;
		}
		this.method3289();
		this.method3243(true);
		this.method3270(true);
		this.method3227(true);
		this.method3257(1);
		this.anInt3886 = 16;
	}

	@OriginalMember(owner = "client!gia", name = "z", descriptor = "()V")
	@Override
	public void method7707() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!gia", name = "H", descriptor = "(I)V")
	public void method3264() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!gia", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Class245_Sub2_Sub1 local9 = local6.aClass245_Sub2_Sub1_3;
		this.method3295();
		this.method3234(local6.aClass245_Sub2_Sub1_3);
		this.method3257(1);
		this.method3271(8448, 7681);
		this.method3279(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat189 / (float) local9.anInt10095;
		@Pc(46) float local46 = local9.aFloat190 / (float) local9.anInt10098;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3898 - arg2), (float) (this.anInt3914 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3898, this.anInt3914);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3898 - arg2), (float) (this.anInt3902 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3898, this.anInt3902);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3890 - arg2), (float) (this.anInt3902 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3890, this.anInt3902);
		OpenGL.glTexCoord2f((float) (this.anInt3890 - arg2) * local39, local46 * (float) (this.anInt3914 - arg3));
		OpenGL.glVertex2i(this.anInt3890, this.anInt3914);
		OpenGL.glEnd();
		this.method3279(5890, 768, 0);
	}

	@OriginalMember(owner = "client!gia", name = "x", descriptor = "(I)V")
	private void method3265() {
		@Pc(16) int local16 = 0;
		while (!this.anOpenGL1.a()) {
			if (local16++ > 5) {
				throw new RuntimeException("");
			}
			Static564.method7845(1000L);
		}
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "()Z")
	@Override
	public boolean method7643() {
		return this.aClass3_Sub19_Sub1_1 != null && this.aClass3_Sub19_Sub1_1.method2911();
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(III)V")
	public synchronized void method3266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub42 local8 = new Class3_Sub42(arg1);
		local8.aLong382 = (long) arg0;
		this.aClass357_13.method8401(local8);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!iu;)V")
	@Override
	public void method7642(@OriginalArg(0) Class181 arg0) {
		this.aClass181_Sub2_3.method6355(arg0);
		this.aClass181_Sub2_4.method6355(this.aClass181_Sub2_3);
		this.aClass181_Sub2_4.method6181();
		this.aClass181_Sub2_5.method6179(this.aClass181_Sub2_4);
		if (this.anInt3909 != 1) {
			this.method3291();
		}
	}

	@OriginalMember(owner = "client!gia", name = "d", descriptor = "(II)I")
	@Override
	public int method7671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!gia", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt3875 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt3875++;
		}
		this.anInt3877 = 0x1 << this.anInt3875;
	}

	@OriginalMember(owner = "client!gia", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method3236();
		this.method3257(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean326) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean326) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7669(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas6 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable3.containsKey(arg0)) {
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
			this.aHashtable3.put(arg0, Long.valueOf(local61));
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IJ)V")
	public synchronized void method3267(@OriginalArg(1) long arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong382 = arg0;
		this.aClass357_18.method8401(local7);
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(BI)V")
	public void method3268(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt3895) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt3895 = arg0;
		}
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(IIII)V")
	public void method3269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZZ)V")
	public void method3270(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean302 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt3886 &= 0xFFFFFFE0;
		this.aBoolean302 = arg0;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(BII)V")
	public void method3271(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3895 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(7) boolean local7 = false;
		if (this.anInt3920 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt3920 = arg1;
			local7 = true;
		}
		if (arg0 != this.anInt3892) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local7 = true;
			this.anInt3892 = arg0;
		}
		if (local7) {
			this.anInt3886 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!gia", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3889 = arg0;
		this.anInt3896 = arg1;
		this.anInt3917 = arg3;
		this.anInt3905 = arg2;
		this.aBoolean314 = true;
	}

	@OriginalMember(owner = "client!gia", name = "x", descriptor = "()V")
	@Override
	public void method7667() {
		this.aClass152_1.method3708();
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(BI)I")
	public int method3272(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7649(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7630(arg2, arg3);
	}

	@OriginalMember(owner = "client!gia", name = "u", descriptor = "()Z")
	@Override
	public boolean method7710() {
		return false;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIZ[BI)Lclient!rt;")
	public Interface24 method3273(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		return (Interface24) (this.aBoolean306 && (!arg1 || this.aBoolean303) ? new Class2_Sub2(this, arg3, arg2, arg0, arg1) : new Class49_Sub2(this, arg3, arg2, arg0));
	}

	@OriginalMember(owner = "client!gia", name = "h", descriptor = "(I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0) {
		this.method3256();
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "([BIIZI)Lclient!ika;")
	public Interface11 method3274(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface11) (this.aBoolean306 && (!arg2 || this.aBoolean303) ? new Class2_Sub1(this, 5123, arg0, arg1, arg2) : new Class49_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!dn;)V")
	@Override
	public void method7639(@OriginalArg(0) Class77 arg0) {
		this.aClass77_Sub1_1 = (Class77_Sub1) arg0;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(I[Lclient!vj;)V")
	@Override
	public void method7694(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub16[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub16Array4[local7] = arg1[local7];
		}
		this.anInt3918 = arg0;
		if (this.anInt3909 != 1) {
			this.method3275();
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "([IIIIIZ)Lclient!bka;")
	@Override
	public Class9 method7686(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class9_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!gia", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass181_Sub2_3.aFloat135 * (float) arg2 + (float) arg0 * this.aClass181_Sub2_3.aFloat132 + this.aClass181_Sub2_3.aFloat136 * (float) arg1 + this.aClass181_Sub2_3.aFloat133;
		if ((float) this.anInt3919 > local28 || (float) this.anInt3908 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(89) int local89 = (int) ((float) this.anInt3911 * (this.aClass181_Sub2_3.aFloat134 * (float) arg1 + (float) arg0 * this.aClass181_Sub2_3.aFloat138 + (float) arg2 * this.aClass181_Sub2_3.aFloat139 + this.aClass181_Sub2_3.aFloat129) / (float) arg3);
		@Pc(122) int local122 = (int) ((this.aClass181_Sub2_3.aFloat137 + this.aClass181_Sub2_3.aFloat131 * (float) arg1 + this.aClass181_Sub2_3.aFloat140 * (float) arg0 + (float) arg2 * this.aClass181_Sub2_3.aFloat130) * (float) this.anInt3916 / (float) arg3);
		if ((float) local89 >= this.aFloat67 && (float) local89 <= this.aFloat75 && (float) local122 >= this.aFloat83 && this.aFloat78 >= (float) local122) {
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local122 - this.aFloat83);
			arg4[0] = (int) ((float) local89 - this.aFloat67);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!gia", name = "d", descriptor = "(Z)V")
	private void method3275() {
		@Pc(15) int local15;
		for (local15 = 0; local15 < this.anInt3918; local15++) {
			@Pc(22) Class3_Sub16 local22 = this.aClass3_Sub16Array4[local15];
			@Pc(26) int local26 = local15 + 16386;
			Static247.aFloatArray44[0] = (float) local22.method6323();
			Static247.aFloatArray44[1] = (float) local22.method6322();
			Static247.aFloatArray44[2] = (float) local22.method6320();
			Static247.aFloatArray44[3] = 1.0F;
			OpenGL.glLightfv(local26, 4611, Static247.aFloatArray44, 0);
			@Pc(60) int local60 = local22.method6325();
			@Pc(66) float local66 = local22.method6326() / 255.0F;
			Static247.aFloatArray44[2] = (float) (local60 & 0xFF) * local66;
			Static247.aFloatArray44[1] = local66 * (float) (local60 >> 8 & 0xFF);
			Static247.aFloatArray44[0] = local66 * (float) (local60 >> 16 & 0xFF);
			OpenGL.glLightfv(local26, 4609, Static247.aFloatArray44, 0);
			OpenGL.glLightf(local26, 4617, 1.0F / (float) (local22.method6324() * local22.method6324()));
			OpenGL.glEnable(local26);
		}
		while (local15 < this.anInt3888) {
			OpenGL.glDisable(local15 + 16386);
			local15++;
		}
		this.anInt3888 = this.anInt3918;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IZIZ)V")
	public void method3276(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt3913 || this.aBoolean314 != this.aBoolean313) {
			@Pc(25) Class245_Sub2 local25 = null;
			@Pc(27) int local27 = 0;
			@Pc(29) byte local29 = 0;
			@Pc(31) int local31 = 0;
			@Pc(39) int local39 = this.aBoolean314 ? 3 : 0;
			if (arg1 < 0) {
				this.method3242();
			} else {
				local25 = this.aClass210_1.method4996(arg1);
				@Pc(56) Class32 local56 = super.anInterface2_11.method1027(arg1);
				if (local56.aByte22 == 0 && local56.aByte23 == 0) {
					this.method3242();
				} else {
					@Pc(80) int local80 = local56.aBoolean71 ? 64 : 128;
					@Pc(84) int local84 = local80 * 50;
					this.method3226(0.0F, (float) (this.anInt3876 % local84 * local56.aByte23) / (float) local84, (float) (this.anInt3876 % local84 * local56.aByte22) / (float) local84);
				}
				local27 = local56.anInt865;
				if (!this.aBoolean314) {
					local31 = local56.anInt862;
					local39 = local56.aByte25;
					local29 = local56.aByte19;
				}
			}
			this.aClass285_1.method7050(arg0, local29, local39, arg2, local31);
			if (!this.aClass285_1.method7046(local27, local25)) {
				this.method3234(local25);
				this.method3255(local27);
			}
			this.aBoolean313 = this.aBoolean314;
			this.anInt3913 = arg1;
		}
		this.anInt3886 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class313 method7679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class313_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!gia", name = "g", descriptor = "(I)V")
	@Override
	public void method7691(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt3870 = arg0;
		this.aClass210_1.method4992();
	}

	@OriginalMember(owner = "client!gia", name = "s", descriptor = "()Z")
	@Override
	public boolean method7684() {
		return true;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZLclient!ika;)V")
	public void method3277(@OriginalArg(1) Interface11 arg0) {
		if (arg0 != this.anInterface11_2) {
			if (this.aBoolean306) {
				OpenGL.glBindBufferARB(34963, arg0.method2436());
			}
			this.anInterface11_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!gia", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3236();
		this.method3257(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gia", name = "t", descriptor = "()V")
	@Override
	protected void method7632() {
		for (@Pc(6) Class3 local6 = this.aClass357_11.method8391(); local6 != null; local6 = this.aClass357_11.method8392()) {
			((Class3_Sub17_Sub1) local6).method2002();
		}
		if (this.aClass152_1 != null) {
			this.aClass152_1.method3702();
		}
		if (this.anOpenGL1 != null) {
			this.method3256();
			@Pc(48) Enumeration local48 = this.aHashtable3.keys();
			while (local48.hasMoreElements()) {
				@Pc(56) Canvas local56 = (Canvas) local48.nextElement();
				@Pc(62) Long local62 = (Long) this.aHashtable3.get(local56);
				this.anOpenGL1.releaseSurface(local56, local62);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean298) {
			Static246.method3750(false, true);
			this.aBoolean298 = false;
		}
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(IIZ)V")
	public void method3278(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		this.method3276(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(IIII)V")
	public void method3279(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!gia", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt3900 && arg1 == this.anInt3907 && this.anInt3906 == arg2) {
			return;
		}
		this.anInt3906 = arg2;
		this.anInt3900 = arg0;
		this.anInt3907 = arg1;
		this.method3238();
		this.method3300();
	}

	@OriginalMember(owner = "client!gia", name = "C", descriptor = "(I)V")
	private void method3280() {
		@Pc(15) float local15 = (float) -this.anInt3903 * this.aFloat80 / (float) this.anInt3911;
		@Pc(27) float local27 = this.aFloat80 * (float) -this.anInt3897 / (float) this.anInt3916;
		@Pc(42) float local42 = this.aFloat80 * (float) (this.anInt3783 - this.anInt3903) / (float) this.anInt3911;
		@Pc(57) float local57 = this.aFloat80 * (float) (this.anInt3828 - this.anInt3897) / (float) this.anInt3916;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local57 != local27) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) this.anInt3919, (double) this.anInt3908);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub17 method7665(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub17_Sub1 local8 = new Class3_Sub17_Sub1(arg0);
		this.aClass357_11.method8401(local8);
		return local8;
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(II)Lclient!tt;")
	@Override
	public Interface25 method7717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!gia", name = "D", descriptor = "(I)V")
	private void method3281() {
		if (this.anInt3898 <= this.anInt3890 && this.anInt3914 <= this.anInt3902) {
			OpenGL.glScissor(this.anInt3898 + this.anInt3904, -this.anInt3902 + this.anInt3915 + this.anInt3828, this.anInt3890 - this.anInt3898, -this.anInt3914 + this.anInt3902);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(II)V")
	@Override
	public void method7630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZB)V")
	public void method3282(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean316) {
			this.aBoolean316 = arg0;
			this.method3298();
		}
	}

	@OriginalMember(owner = "client!gia", name = "d", descriptor = "()Z")
	@Override
	public boolean method7699() {
		return true;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILclient!li;Lclient!li;Lclient!li;Lclient!li;)V")
	public void method3283(@OriginalArg(1) Class229 arg0, @OriginalArg(2) Class229 arg1, @OriginalArg(3) Class229 arg2, @OriginalArg(4) Class229 arg3) {
		if (arg2 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method3250(arg2.anInterface24_5);
			OpenGL.glVertexPointer(arg2.aByte91, arg2.aShort77, this.anInterface24_3.method9138(), this.anInterface24_3.method9137() + (long) arg2.aByte90);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method3250(arg3.anInterface24_5);
			OpenGL.glNormalPointer(arg3.aShort77, this.anInterface24_3.method9138(), this.anInterface24_3.method9137() + (long) arg3.aByte90);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method3250(arg1.anInterface24_5);
			OpenGL.glColorPointer(arg1.aByte91, arg1.aShort77, this.anInterface24_3.method9138(), this.anInterface24_3.method9137() + (long) arg1.aByte90);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method3250(arg0.anInterface24_5);
			OpenGL.glTexCoordPointer(arg0.aByte91, arg0.aShort77, this.anInterface24_3.method9138(), this.anInterface24_3.method9137() + (long) arg0.aByte90);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!gia", name = "e", descriptor = "()Z")
	@Override
	public boolean method7648() {
		return true;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!md;I)V")
	public void method3284(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt3879 < 0 || this.anInterface17Array2[this.anInt3879] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface17Array2[this.anInt3879--] = null;
		arg0.method8069();
		if (this.anInt3879 < 0) {
			this.anInterface17_1 = null;
		} else {
			this.anInterface17_1 = this.anInterface17Array2[this.anInt3879];
			this.anInterface17_1.method8064();
		}
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(Z)V")
	public void method3285() {
		if (this.anInt3886 == 4) {
			return;
		}
		this.method3292();
		this.method3243(false);
		this.method3299(false);
		this.method3270(false);
		this.method3227(false);
		this.method3245(-2);
		this.method3257(1);
		this.anInt3886 = 4;
	}

	@OriginalMember(owner = "client!gia", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt3890 = this.anInt3783;
		this.anInt3914 = 0;
		this.anInt3902 = this.anInt3828;
		this.anInt3898 = 0;
		OpenGL.glDisable(3089);
		this.method3221();
	}

	@OriginalMember(owner = "client!gia", name = "h", descriptor = "()Lclient!iu;")
	@Override
	public Class181 method7693() {
		return this.aClass181_Sub2_1;
	}

	@OriginalMember(owner = "client!gia", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3898;
		arg0[1] = this.anInt3914;
		arg0[2] = this.anInt3890;
		arg0[3] = this.anInt3902;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!nd;I)V")
	public void method3286(@OriginalArg(0) Class181_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method6182(), 0);
	}

	@OriginalMember(owner = "client!gia", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > this.anInt3898) {
			this.anInt3898 = arg0;
		}
		if (arg1 > this.anInt3914) {
			this.anInt3914 = arg1;
		}
		if (arg2 < this.anInt3890) {
			this.anInt3890 = arg2;
		}
		if (this.anInt3902 > arg3) {
			this.anInt3902 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method3221();
		this.method3281();
	}

	@OriginalMember(owner = "client!gia", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt3898 > arg2 + arg0 || this.anInt3890 < arg0 - arg2 || this.anInt3914 > arg1 + arg2 || arg1 - arg2 > this.anInt3902) {
			return;
		}
		this.method3236();
		this.method3257(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(84) float local84 = (float) arg0 + 0.35F;
		@Pc(89) float local89 = (float) arg1 + 0.35F;
		@Pc(93) int local93 = arg2 << 1;
		if ((float) local93 < this.aFloat73) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local84 + 1.0F, local89 + 1.0F);
			OpenGL.glVertex2f(local84 + 1.0F, -1.0F + local89);
			OpenGL.glVertex2f(local84 - 1.0F, local89 - 1.0F);
			OpenGL.glVertex2f(local84 - 1.0F, local89 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local93 <= this.aFloat82) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local93);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local84, local89);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local84, local89);
			@Pc(149) int local149 = 262144 / (arg2 * 6);
			if (local149 <= 64) {
				local149 = 64;
			} else if (local149 > 512) {
				local149 = 512;
			}
			local149 = Static487.method7093(local149);
			OpenGL.glVertex2f((float) arg2 + local84, local89);
			for (@Pc(180) int local180 = 16384 - local149; local180 > 0; local180 -= local149) {
				OpenGL.glVertex2f((float) arg2 * Class246.aFloatArray69[local180] + local84, Class246.aFloatArray70[local180] * (float) arg2 + local89);
			}
			OpenGL.glVertex2f(local84 + (float) arg2, local89);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIB)V")
	public void method3287(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIZ)Lclient!bka;")
	@Override
	public Class9 method7664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class9_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!gia", name = "B", descriptor = "(I)V")
	private void method3288() {
		@Pc(6) float[] local6 = this.aFloatArray41;
		@Pc(18) float local18 = (float) (-this.anInt3903 * this.anInt3919) / (float) this.anInt3911;
		@Pc(37) float local37 = (float) ((this.anInt3783 - this.anInt3903) * this.anInt3919) / (float) this.anInt3911;
		@Pc(48) float local48 = (float) (this.anInt3897 * this.anInt3919) / (float) this.anInt3916;
		@Pc(63) float local63 = (float) (this.anInt3919 * (this.anInt3897 - this.anInt3828)) / (float) this.anInt3916;
		if (local18 == local37 || local48 == local63) {
			local6[12] = 0.0F;
			local6[11] = 0.0F;
			local6[9] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = 1.0F;
			local6[15] = 1.0F;
			local6[13] = 0.0F;
			local6[6] = 0.0F;
			local6[8] = 0.0F;
			local6[1] = 0.0F;
			local6[14] = 0.0F;
			local6[4] = 0.0F;
			local6[7] = 0.0F;
			local6[10] = 1.0F;
			local6[2] = 0.0F;
			local6[0] = 1.0F;
		} else {
			@Pc(79) float local79 = (float) this.anInt3919 * 2.0F;
			local6[3] = 0.0F;
			local6[11] = -1.0F;
			local6[0] = local79 / (local37 - local18);
			local6[6] = 0.0F;
			local6[14] = this.aFloat79 = -(local79 * (float) this.anInt3908) / (float) (this.anInt3908 - this.anInt3919);
			local6[10] = this.aFloat63 = (float) -(this.anInt3919 + this.anInt3908) / (float) (this.anInt3908 - this.anInt3919);
			local6[4] = 0.0F;
			local6[2] = 0.0F;
			local6[12] = 0.0F;
			local6[1] = 0.0F;
			local6[13] = 0.0F;
			local6[7] = 0.0F;
			local6[5] = local79 / (local48 - local63);
			local6[8] = (local18 + local37) / (-local18 + local37);
			local6[15] = 0.0F;
			local6[9] = (local48 + local63) / (local48 - local63);
		}
		this.method3301();
	}

	@OriginalMember(owner = "client!gia", name = "l", descriptor = "(I)V")
	private void method3289() {
		if (this.anInt3909 != 3) {
			this.anInt3909 = 3;
			this.method3280();
			this.method3291();
			this.anInt3886 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!gia", name = "j", descriptor = "()V")
	@Override
	public void method7716() {
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZZIILclient!jaclib/memory/Buffer;)Lclient!rt;")
	public Interface24 method3290(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Buffer arg2) {
		return (Interface24) (this.aBoolean306 && (this.aBoolean303 || true) ? new Class2_Sub2(this, arg1, arg2, arg0, false) : new Class49_Sub2(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!gia", name = "l", descriptor = "()Lclient!ega;")
	@Override
	public Class90 method7687() {
		@Pc(7) int local7 = -1;
		if (this.aString65.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString65.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString65.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class90(local7, "OpenGL", this.anInt3910, this.aString66, 0L);
	}

	@OriginalMember(owner = "client!gia", name = "f", descriptor = "(I)V")
	@Override
	public void method7657(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gia", name = "k", descriptor = "()Z")
	@Override
	public boolean method7711() {
		return true;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7715(@OriginalArg(0) Class3_Sub17 arg0) {
		this.aNativeHeap4 = ((Class3_Sub17_Sub1) arg0).aNativeHeap3;
		if (this.anInterface24_4 != null) {
			return;
		}
		@Pc(16) Class3_Sub28_Sub1 local16 = new Class3_Sub28_Sub1(80);
		if (this.aBoolean322) {
			local16.method4573(-1.0F);
			local16.method4573(-1.0F);
			local16.method4573(0.0F);
			local16.method4573(0.0F);
			local16.method4573(1.0F);
			local16.method4573(1.0F);
			local16.method4573(-1.0F);
			local16.method4573(0.0F);
			local16.method4573(1.0F);
			local16.method4573(1.0F);
			local16.method4573(1.0F);
			local16.method4573(1.0F);
			local16.method4573(0.0F);
			local16.method4573(1.0F);
			local16.method4573(0.0F);
			local16.method4573(-1.0F);
			local16.method4573(1.0F);
			local16.method4573(0.0F);
			local16.method4573(0.0F);
			local16.method4573(0.0F);
		} else {
			local16.method4574(-1.0F);
			local16.method4574(-1.0F);
			local16.method4574(0.0F);
			local16.method4574(0.0F);
			local16.method4574(1.0F);
			local16.method4574(1.0F);
			local16.method4574(-1.0F);
			local16.method4574(0.0F);
			local16.method4574(1.0F);
			local16.method4574(1.0F);
			local16.method4574(1.0F);
			local16.method4574(1.0F);
			local16.method4574(0.0F);
			local16.method4574(1.0F);
			local16.method4574(0.0F);
			local16.method4574(-1.0F);
			local16.method4574(1.0F);
			local16.method4574(0.0F);
			local16.method4574(0.0F);
			local16.method4574(0.0F);
		}
		this.anInterface24_4 = this.method3273(local16.anInt6241, false, local16.aByteArray50, 20);
		this.aClass229_6 = new Class229(this.anInterface24_4, 5126, 3, 0);
		this.aClass229_7 = new Class229(this.anInterface24_4, 5126, 2, 12);
		this.aClass117_1.method2808(this);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(B)V")
	private void method3291() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass181_Sub2_4.method6182(), 0);
		if (this.aBoolean313) {
			this.aClass285_1.aClass43_Sub1_1.method843();
		}
		this.method3241();
		this.method3275();
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg5;
		@Pc(9) Class245_Sub2_Sub1 local9 = local6.aClass245_Sub2_Sub1_3;
		this.method3295();
		this.method3234(local6.aClass245_Sub2_Sub1_3);
		this.method3257(1);
		this.method3271(8448, 7681);
		this.method3279(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat189 / (float) local9.anInt10095;
		@Pc(46) float local46 = local9.aFloat190 / (float) local9.anInt10098;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local52 * local52)));
		@Pc(76) float local76 = local59 * local72;
		@Pc(80) float local80 = local52 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f(local80 + (float) arg2 + 0.35F, (float) arg3 + 0.35F + local76);
		OpenGL.glEnd();
		this.method3279(5890, 768, 0);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!pea;)V")
	@Override
	public void method7633(@OriginalArg(0) Interface20 arg0) {
	}

	@OriginalMember(owner = "client!gia", name = "e", descriptor = "(B)V")
	private void method3292() {
		if (this.anInt3909 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt3783 > 0 && this.anInt3828 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt3783, (double) this.anInt3828, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt3886 &= 0xFFFFFFE7;
		this.anInt3909 = 1;
	}

	@OriginalMember(owner = "client!gia", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass181_Sub2_3.aFloat136 * (float) arg1 + this.aClass181_Sub2_3.aFloat132 * (float) arg0 + (float) arg2 * this.aClass181_Sub2_3.aFloat135 + this.aClass181_Sub2_3.aFloat133;
		@Pc(55) float local55 = this.aClass181_Sub2_3.aFloat133 + this.aClass181_Sub2_3.aFloat136 * (float) arg4 + this.aClass181_Sub2_3.aFloat132 * (float) arg3 + this.aClass181_Sub2_3.aFloat135 * (float) arg5;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt3919 && (float) this.anInt3919 > local55) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt3908 && (float) this.anInt3908 < local55) {
			local57 |= 0x20;
		}
		@Pc(130) int local130 = (int) ((this.aClass181_Sub2_3.aFloat129 + (float) arg2 * this.aClass181_Sub2_3.aFloat139 + (float) arg0 * this.aClass181_Sub2_3.aFloat138 + this.aClass181_Sub2_3.aFloat134 * (float) arg1) * (float) this.anInt3911 / (float) arg6);
		@Pc(163) int local163 = (int) ((float) this.anInt3911 * (this.aClass181_Sub2_3.aFloat129 + (float) arg4 * this.aClass181_Sub2_3.aFloat134 + this.aClass181_Sub2_3.aFloat138 * (float) arg3 + this.aClass181_Sub2_3.aFloat139 * (float) arg5) / (float) arg6);
		if (this.aFloat67 > (float) local130 && this.aFloat67 > (float) local163) {
			local57 |= 0x1;
		} else if (this.aFloat75 < (float) local130 && this.aFloat75 < (float) local163) {
			local57 |= 0x2;
		}
		@Pc(236) int local236 = (int) ((float) this.anInt3916 * (this.aClass181_Sub2_3.aFloat137 + this.aClass181_Sub2_3.aFloat130 * (float) arg2 + this.aClass181_Sub2_3.aFloat140 * (float) arg0 + (float) arg1 * this.aClass181_Sub2_3.aFloat131) / (float) arg6);
		@Pc(269) int local269 = (int) ((float) this.anInt3916 * (this.aClass181_Sub2_3.aFloat137 + this.aClass181_Sub2_3.aFloat131 * (float) arg4 + (float) arg3 * this.aClass181_Sub2_3.aFloat140 + (float) arg5 * this.aClass181_Sub2_3.aFloat130) / (float) arg6);
		if ((float) local236 < this.aFloat83 && (float) local269 < this.aFloat83) {
			local57 |= 0x4;
		} else if ((float) local236 > this.aFloat78 && this.aFloat78 < (float) local269) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7668(@OriginalArg(0) Canvas arg0) {
		this.aLong132 = 0L;
		this.aCanvas7 = null;
		if (arg0 == null || arg0 == this.aCanvas6) {
			this.aCanvas7 = this.aCanvas6;
			this.aLong132 = this.aLong131;
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(30) Long local30 = (Long) this.aHashtable3.get(arg0);
			this.aLong132 = local30;
			this.aCanvas7 = arg0;
		}
		if (this.aCanvas7 == null || this.aLong132 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong132);
		this.method3259();
	}

	@OriginalMember(owner = "client!gia", name = "o", descriptor = "()Z")
	@Override
	public boolean method7651() {
		return this.aClass285_1.method7053();
	}

	@OriginalMember(owner = "client!gia", name = "E", descriptor = "(I)V")
	public void method3293() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!gia", name = "k", descriptor = "(I)V")
	@Override
	public synchronized void method7709(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub42 local19;
		while (!this.aClass357_13.method8404()) {
			local19 = (Class3_Sub42) this.aClass357_13.method8398();
			Static289.anIntArray306[local11++] = (int) local19.aLong382;
			this.anInt3881 -= local19.anInt8429;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static289.anIntArray306, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static289.anIntArray306, 0);
			local11 = 0;
		}
		while (!this.aClass357_14.method8404()) {
			local19 = (Class3_Sub42) this.aClass357_14.method8398();
			Static289.anIntArray306[local11++] = (int) local19.aLong382;
			this.anInt3883 -= local19.anInt8429;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static289.anIntArray306, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static289.anIntArray306, 0);
			local11 = 0;
		}
		while (!this.aClass357_15.method8404()) {
			local19 = (Class3_Sub42) this.aClass357_15.method8398();
			Static289.anIntArray306[local11++] = local19.anInt8429;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static289.anIntArray306, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static289.anIntArray306, 0);
			local11 = 0;
		}
		while (!this.aClass357_16.method8404()) {
			local19 = (Class3_Sub42) this.aClass357_16.method8398();
			Static289.anIntArray306[local11++] = (int) local19.aLong382;
			this.anInt3882 -= local19.anInt8429;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static289.anIntArray306, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static289.anIntArray306, 0);
		}
		while (!this.aClass357_12.method8404()) {
			local19 = (Class3_Sub42) this.aClass357_12.method8398();
			OpenGL.glDeleteLists((int) local19.aLong382, local19.anInt8429);
		}
		@Pc(219) Class3 local219;
		while (!this.aClass357_17.method8404()) {
			local219 = this.aClass357_17.method8398();
			OpenGL.glDeleteProgramARB((int) local219.aLong382);
		}
		while (!this.aClass357_18.method8404()) {
			local219 = this.aClass357_18.method8398();
			OpenGL.glDeleteObjectARB(local219.aLong382);
		}
		while (!this.aClass357_12.method8404()) {
			local19 = (Class3_Sub42) this.aClass357_12.method8398();
			OpenGL.glDeleteLists((int) local19.aLong382, local19.anInt8429);
		}
		this.aClass210_1.method4995();
		if (this.E() > 100663296 && Static626.method8479() > this.aLong133 + 60000L) {
			System.gc();
			this.aLong133 = Static626.method8479();
		}
		this.anInt3876 = local9;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!hu;)V")
	@Override
	public void method7656(@OriginalArg(0) Class162 arg0) {
		this.aClass117_1.method2805(this, arg0, -1);
	}

	@OriginalMember(owner = "client!gia", name = "e", descriptor = "(Z)V")
	private void method3294() {
		OpenGL.glDepthMask(this.aBoolean299 && this.aBoolean311);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!tt;Lclient!hba;)Lclient!pea;")
	@Override
	public Interface20 method7638(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) Interface8 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(B)V")
	public void method3295() {
		if (this.anInt3886 == 2) {
			return;
		}
		this.method3292();
		this.method3243(false);
		this.method3299(false);
		this.method3270(false);
		this.method3227(false);
		this.method3245(-2);
		this.anInt3886 = 2;
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(Lclient!md;I)V")
	public void method3296(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt3879 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3879 >= 0) {
			this.anInterface17Array2[this.anInt3879].method8069();
		}
		this.anInterface17_1 = this.anInterface17Array2[++this.anInt3879] = arg0;
		this.anInterface17_1.method8064();
	}

	@OriginalMember(owner = "client!gia", name = "q", descriptor = "(I)V")
	private void method3297() {
		Static104.aFloatArray7[3] = 1.0F;
		Static104.aFloatArray7[0] = this.aFloat66 * this.aFloat77;
		Static104.aFloatArray7[2] = this.aFloat68 * this.aFloat66;
		Static104.aFloatArray7[1] = this.aFloat76 * this.aFloat66;
		OpenGL.glLightfv(16384, 4609, Static104.aFloatArray7, 0);
		Static104.aFloatArray7[0] = -this.aFloat81 * this.aFloat77;
		Static104.aFloatArray7[1] = this.aFloat76 * -this.aFloat81;
		Static104.aFloatArray7[3] = 1.0F;
		Static104.aFloatArray7[2] = -this.aFloat81 * this.aFloat68;
		OpenGL.glLightfv(16385, 4609, Static104.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!gia", name = "e", descriptor = "(II)I")
	@Override
	public int method7660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!gia", name = "y", descriptor = "(I)V")
	private void method3298() {
		if (this.aBoolean324 && !this.aBoolean316) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!gia", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method7650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3236();
		this.method3257(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(24) float local24 = (float) -arg1 + (float) arg3;
		if (local17 == 0.0F && local24 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(51) float local51 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local24 * local24)));
			local24 *= local51;
			local17 *= local51;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local17 + (float) arg2 + 0.35F, (float) arg3 + local24 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7708() {
		this.method3236();
		this.method3257(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIZ)Lclient!bka;")
	@Override
	public Class9 method7670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class9_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!gia", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat70 != arg0) {
			this.aFloat70 = arg0;
			this.method3225();
		}
	}

	@OriginalMember(owner = "client!gia", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3919 == arg0 && arg1 == this.anInt3908) {
			return;
		}
		this.anInt3908 = arg1;
		this.anInt3919 = arg0;
		this.method3288();
		this.method3238();
		if (this.anInt3909 == 3) {
			this.method3280();
		} else if (this.anInt3909 == 2) {
			this.method3229();
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IZ)V")
	public void method3299(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean324) {
			this.aBoolean324 = arg0;
			this.method3298();
			this.anInt3886 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!gia", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt3908;
	}

	@OriginalMember(owner = "client!gia", name = "o", descriptor = "(I)V")
	private void method3300() {
		if (this.aBoolean315 && this.anInt3907 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!gia", name = "G", descriptor = "(I)V")
	private void method3301() {
		this.aFloatArray41[10] = this.aFloat63;
		this.aFloatArray41[14] = this.aFloat79;
		this.aFloat71 = (this.aFloatArray41[14] - (float) this.anInt3908) / this.aFloatArray41[10];
		this.aFloat69 = (float) this.anInt3908;
	}

	@OriginalMember(owner = "client!gia", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt3921;
		this.anInt3921 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!gia", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gia", name = "r", descriptor = "(I)Lclient!mr;")
	public Class245_Sub1 method3302() {
		return this.aClass77_Sub1_1 == null ? null : this.aClass77_Sub1_1.method7555();
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!saa;[Lclient!jr;Z)Lclient!da;")
	@Override
	public Class44 method7641(@OriginalArg(0) Class330 arg0, @OriginalArg(1) Class194[] arg1, @OriginalArg(2) boolean arg2) {
		return new Class44_Sub1(this, arg0, arg1, arg2);
	}
}
