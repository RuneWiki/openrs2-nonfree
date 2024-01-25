import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeHeap;
import jaggl.memory.NativeStream;
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

@OriginalClass("client!bo")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!bo", name = "Y", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!bo", name = "wb", descriptor = "I")
	public int anInt786;

	@OriginalMember(owner = "client!bo", name = "zb", descriptor = "I")
	private int anInt789;

	@OriginalMember(owner = "client!bo", name = "dc", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!bo", name = "se", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!bo", name = "ue", descriptor = "I")
	public int anInt925;

	@OriginalMember(owner = "client!bo", name = "we", descriptor = "Lclient!eg;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!bo", name = "De", descriptor = "Lclient!eg;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!bo", name = "Ee", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!bo", name = "Fe", descriptor = "I")
	public int anInt930;

	@OriginalMember(owner = "client!bo", name = "He", descriptor = "I")
	public int anInt931;

	@OriginalMember(owner = "client!bo", name = "Oe", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!bo", name = "Se", descriptor = "Lclient!ve;")
	public Class32_Sub2 aClass32_Sub2_1;

	@OriginalMember(owner = "client!bo", name = "Te", descriptor = "Z")
	public boolean aBoolean62;

	@OriginalMember(owner = "client!bo", name = "Ue", descriptor = "Lclient!ik;")
	public Class102_Sub2 aClass102_Sub2_3;

	@OriginalMember(owner = "client!bo", name = "Ye", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!bo", name = "Ze", descriptor = "I")
	public int anInt937;

	@OriginalMember(owner = "client!bo", name = "cf", descriptor = "Lclient!wr;")
	public Class65_Sub3 aClass65_Sub3_1;

	@OriginalMember(owner = "client!bo", name = "ef", descriptor = "Z")
	public boolean aBoolean64;

	@OriginalMember(owner = "client!bo", name = "hf", descriptor = "Z")
	private boolean aBoolean66;

	@OriginalMember(owner = "client!bo", name = "kf", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!bo", name = "lf", descriptor = "Z")
	public boolean aBoolean67;

	@OriginalMember(owner = "client!bo", name = "mf", descriptor = "Z")
	public boolean aBoolean68;

	@OriginalMember(owner = "client!bo", name = "of", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!bo", name = "pf", descriptor = "Lclient!ve;")
	public Class32_Sub2 aClass32_Sub2_2;

	@OriginalMember(owner = "client!bo", name = "qf", descriptor = "Z")
	public boolean aBoolean69;

	@OriginalMember(owner = "client!bo", name = "rf", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!bo", name = "sf", descriptor = "Z")
	private boolean aBoolean70;

	@OriginalMember(owner = "client!bo", name = "wf", descriptor = "Lclient!gb;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!bo", name = "Af", descriptor = "Lclient!ve;")
	public Class32_Sub2 aClass32_Sub2_3;

	@OriginalMember(owner = "client!bo", name = "Bf", descriptor = "Lclient!ve;")
	public Class32_Sub2 aClass32_Sub2_4;

	@OriginalMember(owner = "client!bo", name = "Ff", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!bo", name = "Gf", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!bo", name = "Hf", descriptor = "Z")
	private boolean aBoolean73;

	@OriginalMember(owner = "client!bo", name = "Jf", descriptor = "Lclient!ik;")
	public Class102_Sub2 aClass102_Sub2_4;

	@OriginalMember(owner = "client!bo", name = "Lf", descriptor = "Lclient!qh;")
	public Class200 aClass200_1;

	@OriginalMember(owner = "client!bo", name = "Mf", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!bo", name = "Of", descriptor = "Lclient!ve;")
	public Class32_Sub2 aClass32_Sub2_5;

	@OriginalMember(owner = "client!bo", name = "Pf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!bo", name = "Qf", descriptor = "Z")
	private boolean aBoolean74;

	@OriginalMember(owner = "client!bo", name = "Rf", descriptor = "Lclient!qh;")
	public Class200 aClass200_2;

	@OriginalMember(owner = "client!bo", name = "Sf", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!bo", name = "Tf", descriptor = "Lclient!ve;")
	public Class32_Sub2 aClass32_Sub2_6;

	@OriginalMember(owner = "client!bo", name = "Uf", descriptor = "Lclient!ve;")
	public Class32_Sub2 aClass32_Sub2_7;

	@OriginalMember(owner = "client!bo", name = "Vf", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!bo", name = "ag", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!bo", name = "bg", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!bo", name = "cg", descriptor = "Lclient!bf;")
	private Class21_Sub1 aClass21_Sub1_1;

	@OriginalMember(owner = "client!bo", name = "dg", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!bo", name = "eg", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!bo", name = "fg", descriptor = "[Lclient!nk;")
	private Class65[] aClass65Array1;

	@OriginalMember(owner = "client!bo", name = "gg", descriptor = "Z")
	public boolean aBoolean76;

	@OriginalMember(owner = "client!bo", name = "ig", descriptor = "F")
	private float aFloat28;

	@OriginalMember(owner = "client!bo", name = "lg", descriptor = "Lclient!rg;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!bo", name = "ng", descriptor = "Z")
	private boolean aBoolean77;

	@OriginalMember(owner = "client!bo", name = "og", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!bo", name = "rg", descriptor = "Lclient!wr;")
	public Class65_Sub3 aClass65_Sub3_2;

	@OriginalMember(owner = "client!bo", name = "sg", descriptor = "Z")
	public boolean aBoolean78;

	@OriginalMember(owner = "client!bo", name = "tg", descriptor = "Z")
	private boolean aBoolean79;

	@OriginalMember(owner = "client!bo", name = "ug", descriptor = "Lclient!ve;")
	public Class32_Sub2 aClass32_Sub2_8;

	@OriginalMember(owner = "client!bo", name = "vg", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!bo", name = "wg", descriptor = "Lclient!gk;")
	private Class65_Sub3_Sub1 aClass65_Sub3_Sub1_1;

	@OriginalMember(owner = "client!bo", name = "yg", descriptor = "Z")
	public boolean aBoolean81;

	@OriginalMember(owner = "client!bo", name = "zg", descriptor = "Lclient!gs;")
	public Class100 aClass100_3;

	@OriginalMember(owner = "client!bo", name = "Ag", descriptor = "Z")
	public boolean aBoolean82;

	@OriginalMember(owner = "client!bo", name = "Bg", descriptor = "Lclient!ve;")
	public Class32_Sub2 aClass32_Sub2_9;

	@OriginalMember(owner = "client!bo", name = "Cg", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!bo", name = "Eg", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!bo", name = "Jg", descriptor = "I")
	public int anInt964;

	@OriginalMember(owner = "client!bo", name = "Kg", descriptor = "Z")
	private boolean aBoolean84;

	@OriginalMember(owner = "client!bo", name = "Lg", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!bo", name = "Mg", descriptor = "Lclient!wr;")
	public Class65_Sub3 aClass65_Sub3_3;

	@OriginalMember(owner = "client!bo", name = "Og", descriptor = "F")
	private float aFloat34;

	@OriginalMember(owner = "client!bo", name = "Rg", descriptor = "Z")
	private boolean aBoolean86;

	@OriginalMember(owner = "client!bo", name = "Sg", descriptor = "F")
	private float aFloat35;

	@OriginalMember(owner = "client!bo", name = "Ug", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!bo", name = "Vg", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!bo", name = "Wg", descriptor = "Z")
	private boolean aBoolean87;

	@OriginalMember(owner = "client!bo", name = "Xg", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!bo", name = "Yg", descriptor = "I")
	public int anInt967;

	@OriginalMember(owner = "client!bo", name = "Zg", descriptor = "Lclient!ve;")
	public Class32_Sub2 aClass32_Sub2_10;

	@OriginalMember(owner = "client!bo", name = "ah", descriptor = "Lclient!gs;")
	public Class100 aClass100_4;

	@OriginalMember(owner = "client!bo", name = "bh", descriptor = "Z")
	private boolean aBoolean88;

	@OriginalMember(owner = "client!bo", name = "ch", descriptor = "Lclient!rg;")
	private Interface12 anInterface12_3;

	@OriginalMember(owner = "client!bo", name = "dh", descriptor = "I")
	public int anInt968;

	@OriginalMember(owner = "client!bo", name = "Id", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!bo", name = "fe", descriptor = "I")
	public int anInt920 = 128;

	@OriginalMember(owner = "client!bo", name = "he", descriptor = "Lclient!tg;")
	private final Class230 aClass230_1 = new Class230();

	@OriginalMember(owner = "client!bo", name = "ne", descriptor = "Lclient!ik;")
	private final Class102_Sub2 aClass102_Sub2_1 = new Class102_Sub2();

	@OriginalMember(owner = "client!bo", name = "oe", descriptor = "Lclient!ik;")
	public final Class102_Sub2 aClass102_Sub2_2 = new Class102_Sub2();

	@OriginalMember(owner = "client!bo", name = "re", descriptor = "I")
	public int anInt923 = 8;

	@OriginalMember(owner = "client!bo", name = "te", descriptor = "I")
	public int anInt924 = 3;

	@OriginalMember(owner = "client!bo", name = "ve", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!bo", name = "qe", descriptor = "Lclient!wl;")
	private final Class265 aClass265_3 = new Class265();

	@OriginalMember(owner = "client!bo", name = "xe", descriptor = "I")
	private int anInt926 = -1;

	@OriginalMember(owner = "client!bo", name = "ze", descriptor = "[Lclient!eg;")
	private final Interface2[] anInterface2Array2 = new Interface2[4];

	@OriginalMember(owner = "client!bo", name = "ye", descriptor = "[Lclient!eg;")
	private final Interface2[] anInterface2Array1 = new Interface2[4];

	@OriginalMember(owner = "client!bo", name = "Be", descriptor = "[Lclient!eg;")
	private final Interface2[] anInterface2Array3 = new Interface2[4];

	@OriginalMember(owner = "client!bo", name = "Ce", descriptor = "I")
	private int anInt928 = -1;

	@OriginalMember(owner = "client!bo", name = "Ae", descriptor = "I")
	private int anInt927 = -1;

	@OriginalMember(owner = "client!bo", name = "Ge", descriptor = "Lclient!wl;")
	private final Class265 aClass265_4;

	@OriginalMember(owner = "client!bo", name = "Ie", descriptor = "Lclient!wl;")
	private final Class265 aClass265_5;

	@OriginalMember(owner = "client!bo", name = "Je", descriptor = "Lclient!wl;")
	private final Class265 aClass265_6;

	@OriginalMember(owner = "client!bo", name = "Ke", descriptor = "Lclient!wl;")
	private final Class265 aClass265_7;

	@OriginalMember(owner = "client!bo", name = "Le", descriptor = "Lclient!wl;")
	private final Class265 aClass265_8;

	@OriginalMember(owner = "client!bo", name = "Me", descriptor = "Lclient!wl;")
	private final Class265 aClass265_9;

	@OriginalMember(owner = "client!bo", name = "Ne", descriptor = "Lclient!wl;")
	private final Class265 aClass265_10;

	@OriginalMember(owner = "client!bo", name = "We", descriptor = "I")
	public int anInt935;

	@OriginalMember(owner = "client!bo", name = "df", descriptor = "I")
	public int anInt938;

	@OriginalMember(owner = "client!bo", name = "ff", descriptor = "Z")
	private boolean aBoolean65;

	@OriginalMember(owner = "client!bo", name = "nf", descriptor = "I")
	public int anInt941;

	@OriginalMember(owner = "client!bo", name = "uf", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!bo", name = "Qe", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!bo", name = "jf", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!bo", name = "If", descriptor = "I")
	public int anInt946;

	@OriginalMember(owner = "client!bo", name = "Df", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!bo", name = "Xe", descriptor = "I")
	public int anInt936;

	@OriginalMember(owner = "client!bo", name = "Kf", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!bo", name = "Ef", descriptor = "F")
	private float aFloat25;

	@OriginalMember(owner = "client!bo", name = "Nf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!bo", name = "Zf", descriptor = "I")
	public int anInt953;

	@OriginalMember(owner = "client!bo", name = "Pe", descriptor = "[F")
	private final float[] aFloatArray1;

	@OriginalMember(owner = "client!bo", name = "qg", descriptor = "[F")
	private final float[] aFloatArray5;

	@OriginalMember(owner = "client!bo", name = "yf", descriptor = "F")
	private float aFloat23;

	@OriginalMember(owner = "client!bo", name = "pg", descriptor = "I")
	public int anInt958;

	@OriginalMember(owner = "client!bo", name = "Xf", descriptor = "I")
	public int anInt952;

	@OriginalMember(owner = "client!bo", name = "Cf", descriptor = "[F")
	public final float[] aFloatArray3;

	@OriginalMember(owner = "client!bo", name = "Re", descriptor = "[F")
	private final float[] aFloatArray2;

	@OriginalMember(owner = "client!bo", name = "xf", descriptor = "I")
	public int anInt944;

	@OriginalMember(owner = "client!bo", name = "bf", descriptor = "F")
	public float bf;

	@OriginalMember(owner = "client!bo", name = "tf", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!bo", name = "jg", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!bo", name = "Tg", descriptor = "F")
	private float aFloat36;

	@OriginalMember(owner = "client!bo", name = "hg", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!bo", name = "kg", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!bo", name = "Ng", descriptor = "I")
	public int anInt965;

	@OriginalMember(owner = "client!bo", name = "Dg", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!bo", name = "Yf", descriptor = "[F")
	private final float[] aFloatArray4;

	@OriginalMember(owner = "client!bo", name = "Ve", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!bo", name = "Fg", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!bo", name = "Qg", descriptor = "[Lclient!or;")
	private final Class2_Sub7[] aClass2_Sub7Array2;

	@OriginalMember(owner = "client!bo", name = "mg", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!bo", name = "Ig", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!bo", name = "Hg", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!bo", name = "eh", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!bo", name = "fh", descriptor = "I")
	public int anInt970;

	@OriginalMember(owner = "client!bo", name = "ge", descriptor = "I")
	public final int anInt921;

	@OriginalMember(owner = "client!bo", name = "Zc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas2;

	@OriginalMember(owner = "client!bo", name = "G", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!bo", name = "x", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!bo", name = "zd", descriptor = "J")
	private final long aLong26;

	@OriginalMember(owner = "client!bo", name = "Pc", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!bo", name = "gf", descriptor = "I")
	public final int anInt939;

	@OriginalMember(owner = "client!bo", name = "Pg", descriptor = "Z")
	public boolean aBoolean85;

	@OriginalMember(owner = "client!bo", name = "Gg", descriptor = "Z")
	public boolean aBoolean83;

	@OriginalMember(owner = "client!bo", name = "Wf", descriptor = "Z")
	private boolean aBoolean75;

	@OriginalMember(owner = "client!bo", name = "zf", descriptor = "Z")
	public boolean aBoolean72;

	@OriginalMember(owner = "client!bo", name = "af", descriptor = "Z")
	private boolean aBoolean63;

	@OriginalMember(owner = "client!bo", name = "xg", descriptor = "Z")
	public boolean aBoolean80;

	@OriginalMember(owner = "client!bo", name = "vf", descriptor = "Z")
	private final boolean aBoolean71;

	@OriginalMember(owner = "client!bo", name = "ie", descriptor = "Lclient!uj;")
	public final Class244 aClass244_1;

	@OriginalMember(owner = "client!bo", name = "pe", descriptor = "Lclient!al;")
	public final Class10 aClass10_1;

	@OriginalMember(owner = "client!bo", name = "me", descriptor = "Lclient!mq;")
	private final Class162 aClass162_1;

	@OriginalMember(owner = "client!bo", name = "le", descriptor = "Lclient!vr;")
	private Class2_Sub32_Sub1 aClass2_Sub32_Sub1_1;

	@OriginalMember(owner = "client!bo", name = "je", descriptor = "Lclient!ho;")
	private final Class109 aClass109_1;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;ILclient!js;)V")
	public Class26_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class131 arg4) {
		super(arg0, arg2);
		new Class145();
		new Class240(16);
		this.aClass265_4 = new Class265();
		this.aClass265_5 = new Class265();
		this.aClass265_6 = new Class265();
		this.aClass265_7 = new Class265();
		this.aClass265_8 = new Class265();
		this.aClass265_9 = new Class265();
		this.aClass265_10 = new Class265();
		this.anInt935 = 0;
		this.anInt938 = 0;
		this.aBoolean65 = true;
		this.anInt941 = 512;
		this.anInt943 = -1;
		this.anInt933 = 0;
		this.aFloat20 = 3584.0F;
		this.anInt946 = 0;
		this.aFloat24 = -1.0F;
		this.anInt936 = 3584;
		this.anInt947 = 0;
		this.aFloat25 = 0.0F;
		this.anInt949 = 0;
		this.anInt953 = 0;
		this.aFloatArray1 = new float[4];
		this.aFloatArray5 = new float[4];
		this.aFloat23 = 1.0F;
		this.anInt958 = 512;
		this.anInt952 = -1;
		this.aFloatArray3 = new float[4];
		this.aFloatArray2 = new float[16];
		this.anInt944 = -1;
		this.bf = 3584.0F;
		this.aFloat22 = -1.0F;
		this.aFloat29 = 1.0F;
		this.aFloat36 = 1.0F;
		this.aFloat27 = 3000.0F;
		this.anInt956 = 8448;
		this.anInt965 = -1;
		this.anInt960 = -1;
		this.aFloatArray4 = new float[4];
		this.anInt934 = 8448;
		this.aFloat32 = 1.0F;
		this.aClass2_Sub7Array2 = new Class2_Sub7[Static122.anInt2419];
		this.aFloat30 = 1.0F;
		this.anInt963 = 0;
		this.anInt962 = 0;
		this.anInt969 = 0;
		this.anInt970 = 50;
		this.anInt921 = arg3;
		this.aCanvas1 = this.aCanvas2 = arg1;
		try {
			if (Static395.aBoolean586 == null || !Static395.aBoolean586) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static395.aBoolean586 = Boolean.TRUE;
				} else {
					@Pc(246) String local246 = System.getProperty("os.name").toLowerCase();
					if (!local246.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local246.startsWith("linux") || local246.startsWith("sunos")) {
						System.load(arg4.method3065("libjaggl.so").toString());
					} else if (local246.startsWith("mac")) {
						System.load(arg4.method3065("libjaggl.jnilib").toString());
					} else if (local246.startsWith("win")) {
						System.load(arg4.method3065("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static395.aBoolean586 = Boolean.TRUE;
				}
			}
			if (Static395.aBoolean586 == null || !Static395.aBoolean586) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong25 = this.aLong26 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt921);
			if (this.aLong26 == 0L) {
				throw new RuntimeException("");
			}
			this.method632();
			@Pc(355) int local355 = this.method626();
			if (local355 != 0) {
				throw new RuntimeException("");
			}
			this.anInt939 = this.aBoolean76 ? 33639 : 5121;
			@Pc(381) int local381;
			if (this.aString4.indexOf("radeon") != -1) {
				local381 = 0;
				@Pc(383) boolean local383 = false;
				@Pc(385) boolean local385 = false;
				@Pc(394) String[] local394 = Static40.method745(this.aString4.replace('/', ' '), ' ');
				for (@Pc(396) int local396 = 0; local396 < local394.length; local396++) {
					@Pc(402) String local402 = local394[local396];
					try {
						if (local402.length() > 0) {
							if (local402.charAt(0) == 'x' && local402.length() >= 3 && Static413.method5615(local402.substring(1, 3))) {
								local385 = true;
								local402 = local402.substring(1);
							}
							if (local402.equals("hd")) {
								local383 = true;
							} else {
								if (local402.startsWith("hd")) {
									local383 = true;
									local402 = local402.substring(2);
								}
								if (local402.length() >= 4 && Static413.method5615(local402.substring(0, 4))) {
									local381 = Static175.method2762(local402.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(468) Exception local468) {
					}
				}
				if (!local383 || local381 < 4000) {
					this.aBoolean85 = false;
				}
				if (!local385 && !local383) {
					if (local381 >= 7000 && local381 <= 9250) {
						this.aBoolean83 = false;
					}
					if (local381 >= 7000 && local381 <= 7999) {
						this.aBoolean75 = false;
					}
				}
				this.aBoolean72 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean63 = this.aBoolean75;
			}
			if (this.aString3.indexOf("intel") != -1) {
				this.aBoolean80 = false;
			}
			this.aBoolean71 = !this.aString3.equals("s3 graphics");
			if (this.aBoolean75) {
				try {
					@Pc(548) int[] local548 = new int[1];
					OpenGL.glGenBuffersARB(1, local548, 0);
				} catch (@Pc(554) Throwable local554) {
					throw new RuntimeException("");
				}
			}
			Static36.method660(true);
			this.aBoolean61 = true;
			this.aClass244_1 = new Class244(this, super.anInterface8_5);
			this.method651();
			this.aClass10_1 = new Class10(this);
			this.aClass162_1 = new Class162(this);
			if (this.aClass162_1.method3824()) {
				this.aClass2_Sub32_Sub1_1 = new Class2_Sub32_Sub1(this);
				if (!this.aClass2_Sub32_Sub1_1.method5814()) {
					this.aClass2_Sub32_Sub1_1.method5806();
					this.aClass2_Sub32_Sub1_1 = null;
				}
			}
			this.aClass109_1 = new Class109(this);
			this.method686();
			this.method665();
			OpenGL.glClear(16640);
			local381 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(633) Exception local633) {
					if (local381++ > 5) {
						throw new RuntimeException("");
					}
					Static443.method5991(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(651) Throwable local651) {
			local651.printStackTrace();
			this.method2269();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(II)I")
	public int method625(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	@Override
	public void method2235(@OriginalArg(0) int arg0) {
		this.method672();
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2264(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas2) {
			local5 = this.aLong26;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable1.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas1 == arg0) {
			this.method665();
		}
	}

	@OriginalMember(owner = "client!bo", name = "da", descriptor = "(IIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method656();
		this.method671(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!wp;IIII)Lclient!c;")
	@Override
	public Class32 method2227(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class32_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)I")
	private int method626() {
		this.aString3 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString4 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString3.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString3.indexOf("brian paul") != -1 || this.aString3.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(47) String local47 = OpenGL.glGetString(7938);
		@Pc(55) String[] local55 = Static40.method745(local47.replace('.', ' '), ' ');
		if (local55.length >= 2) {
			try {
				@Pc(65) int local65 = Static175.method2762(local55[0]);
				@Pc(71) int local71 = Static175.method2762(local55[1]);
				this.anInt966 = local71 + local65 * 10;
			} catch (@Pc(80) NumberFormatException local80) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt966 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(121) int[] local121 = new int[1];
		OpenGL.glGetIntegerv(34018, local121, 0);
		this.anInt964 = local121[0];
		OpenGL.glGetIntegerv(34929, local121, 0);
		this.anInt957 = local121[0];
		OpenGL.glGetIntegerv(34930, local121, 0);
		this.anInt945 = local121[0];
		if (this.anInt964 < 2 || this.anInt957 < 2 || this.anInt945 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean76 = NativeStream.c();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean75 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean73 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean81 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean64 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean62 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean83 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean72 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean68 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean85 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean78 = false;
		this.aBoolean80 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean82 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean67 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean74 = this.aBoolean82 & this.aBoolean67;
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(II)V")
	public synchronized void method627(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub16 local8 = new Class2_Sub16(arg0);
		this.aClass265_7.method5999(local8);
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(II)V")
	public void method628(@OriginalArg(1) int arg0) {
		this.method678(true, arg0);
	}

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "(I)Lclient!ef;")
	public Class65_Sub1 method629() {
		return this.aClass21_Sub1_1 == null ? null : this.aClass21_Sub1_1.method5279();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class76 method2244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class76_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Lclient!l;")
	@Override
	public Class2_Sub3 method2242() {
		@Pc(8) Class2_Sub3_Sub1 local8 = new Class2_Sub3_Sub1(78643200);
		this.aClass265_3.method5999(local8);
		return local8;
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(Z)V")
	public void method630() {
		if (this.anInt954 == 2) {
			return;
		}
		this.method698();
		this.method638(false);
		this.method662(false);
		this.method675(false);
		this.method644(false);
		this.method628(-2);
		this.anInt954 = 2;
	}

	@OriginalMember(owner = "client!bo", name = "w", descriptor = "()F")
	@Override
	public float w() {
		return this.aFloat38;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!eg;I)V")
	public void method631(@OriginalArg(0) Interface2 arg0) {
		if (this.aBoolean82) {
			this.method703(arg0);
			this.method684(arg0);
		} else if (this.anInt927 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt927 >= 0) {
				this.anInterface2Array1[this.anInt927].method4531();
			}
			this.anInterface2_1 = this.anInterface2_2 = this.anInterface2Array1[++this.anInt927] = arg0;
			this.anInterface2_1.method4532();
		}
	}

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "(I)V")
	private void method632() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static443.method5991(1000L);
		}
	}

	@OriginalMember(owner = "client!bo", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		this.method671(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "(I)V")
	private void method633() {
		if (this.aBoolean77 && this.aBoolean69 | this.anInt965 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt970;
	}

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "()V")
	@Override
	public void method2271() {
	}

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "(I)V")
	private void method634() {
		Static206.aFloatArray23[3] = 1.0F;
		Static206.aFloatArray23[0] = this.aFloat33 * this.aFloat32;
		Static206.aFloatArray23[1] = this.aFloat30 * this.aFloat33;
		Static206.aFloatArray23[2] = this.aFloat29 * this.aFloat33;
		OpenGL.glLightModelfv(2899, Static206.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!bo", name = "Z", descriptor = "(IIII)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < this.anInt949) {
			this.anInt949 = arg3;
		}
		if (this.anInt969 < arg0) {
			this.anInt969 = arg0;
		}
		if (this.anInt933 < arg1) {
			this.anInt933 = arg1;
		}
		if (this.anInt963 > arg2) {
			this.anInt963 = arg2;
		}
		OpenGL.glEnable(3089);
		this.method685();
		this.method689();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!eg;)V")
	public void method635(@OriginalArg(1) Interface2 arg0) {
		if (this.aBoolean82) {
			this.method676(arg0);
			this.method681(arg0);
		} else if (this.anInt927 >= 0 && arg0 == this.anInterface2Array1[this.anInt927]) {
			this.anInterface2Array1[this.anInt927--] = null;
			arg0.method4531();
			if (this.anInt927 < 0) {
				this.anInterface2_1 = this.anInterface2_2 = null;
			} else {
				this.anInterface2_1 = this.anInterface2_2 = this.anInterface2Array1[this.anInt927];
				this.anInterface2_1.method4532();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(FFZ)V")
	public void method636(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat25 = arg0;
		this.aFloat36 = arg1;
		if (!this.aBoolean69) {
			this.method690();
		}
	}

	@OriginalMember(owner = "client!bo", name = "W", descriptor = "()I")
	@Override
	public int W() {
		return this.anInt936;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "()Lclient!ia;")
	@Override
	public Class102 method2223() {
		return this.aClass102_Sub2_1;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(BII)V")
	public synchronized void method637(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class2_Sub16 local17 = new Class2_Sub16(arg1);
		local17.aLong227 = arg0;
		this.aClass265_5.method5999(local17);
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2250(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class2_Sub16 local19;
		while (!this.aClass265_5.method5997()) {
			local19 = (Class2_Sub16) this.aClass265_5.method5995();
			Static37.anIntArray44[local11++] = (int) local19.aLong227;
			this.anInt931 -= local19.anInt2428;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static37.anIntArray44, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static37.anIntArray44, 0);
			local11 = 0;
		}
		while (!this.aClass265_6.method5997()) {
			local19 = (Class2_Sub16) this.aClass265_6.method5995();
			Static37.anIntArray44[local11++] = (int) local19.aLong227;
			this.anInt930 -= local19.anInt2428;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static37.anIntArray44, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static37.anIntArray44, 0);
			local11 = 0;
		}
		while (!this.aClass265_7.method5997()) {
			local19 = (Class2_Sub16) this.aClass265_7.method5995();
			Static37.anIntArray44[local11++] = local19.anInt2428;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static37.anIntArray44, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static37.anIntArray44, 0);
			local11 = 0;
		}
		while (!this.aClass265_8.method5997()) {
			local19 = (Class2_Sub16) this.aClass265_8.method5995();
			Static37.anIntArray44[local11++] = (int) local19.aLong227;
			this.anInt929 -= local19.anInt2428;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static37.anIntArray44, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static37.anIntArray44, 0);
		}
		while (!this.aClass265_4.method5997()) {
			local19 = (Class2_Sub16) this.aClass265_4.method5995();
			OpenGL.glDeleteLists((int) local19.aLong227, local19.anInt2428);
		}
		@Pc(212) Class2 local212;
		while (!this.aClass265_9.method5997()) {
			local212 = this.aClass265_9.method5995();
			OpenGL.glDeleteProgramARB((int) local212.aLong227);
		}
		while (!this.aClass265_10.method5997()) {
			local212 = this.aClass265_10.method5995();
			OpenGL.glDeleteObjectARB(local212.aLong227);
		}
		while (!this.aClass265_4.method5997()) {
			local19 = (Class2_Sub16) this.aClass265_4.method5995();
			OpenGL.glDeleteLists((int) local19.aLong227, local19.anInt2428);
		}
		this.aClass244_1.method5492();
		if (this.FA() > 100663296 && this.aLong27 + 60000L < Static208.method3182()) {
			System.gc();
			this.aLong27 = Static208.method3182();
		}
		this.anInt925 = local9;
	}

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "(FF)V")
	@Override
	public void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat27 && this.aFloat38 == arg1) {
			return;
		}
		this.aFloat27 = arg0;
		this.aFloat38 = arg1;
		this.method670();
		if (this.anInt940 == 3) {
			this.method687();
		} else if (this.anInt940 == 2) {
			this.method677();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZB)V")
	public void method638(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean77 != arg0) {
			this.aBoolean77 = arg0;
			this.method633();
			this.anInt954 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "()Z")
	@Override
	public boolean method2224() {
		return this.aClass109_1.method2346();
	}

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "(I)V")
	private void method639() {
		if (this.anInt940 != 2) {
			this.anInt940 = 2;
			this.method677();
			this.method691();
			this.anInt954 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(FIFF)V")
	private void method640(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean87) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean87 = true;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2221(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
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

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "(I)V")
	private void method641() {
		if (this.aBoolean88 && !this.aBoolean70) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!ik;)V")
	public void method642(@OriginalArg(1) Class102_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method2657(), 0);
	}

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "(Lclient!ia;)V")
	@Override
	public void m(@OriginalArg(0) Class102 arg0) {
		this.aClass102_Sub2_3 = (Class102_Sub2) arg0;
		this.aClass102_Sub2_4.method2655(this.aClass102_Sub2_3);
		if (this.anInt940 != 1) {
			this.method691();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BIII)V")
	public void method643(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V")
	public void method644(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean66) {
			this.aBoolean66 = arg0;
			this.method701();
			this.anInt954 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "(I)V")
	public void method645() {
		if (this.anInt954 == 16) {
			return;
		}
		this.method694();
		this.method638(true);
		this.method675(true);
		this.method644(true);
		this.method671(1);
		this.method669(0);
		this.anInt954 = 16;
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "()Z")
	@Override
	public boolean method2225() {
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBII)V")
	public void method646(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "(I)V")
	private void method647() {
		if (this.aBoolean87) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean87 = false;
		}
	}

	@OriginalMember(owner = "client!bo", name = "C", descriptor = "()V")
	@Override
	public void method2292() {
		if (this.aClass2_Sub32_Sub1_1 != null && this.aClass2_Sub32_Sub1_1.method5803()) {
			this.aClass162_1.method3823(this.aClass2_Sub32_Sub1_1);
			this.aClass244_1.method5494();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIZILclient!jaggl/memory/NativeBuffer;)Lclient!rg;")
	public Interface12 method648(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) NativeBuffer arg2) {
		return (Interface12) (this.aBoolean75 ? new Class103_Sub1(this, arg1, arg2, arg0, false) : new Class53_Sub2(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method2247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method656();
		this.method671(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean73) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean73) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!rg;B)V")
	public void method649(@OriginalArg(0) Interface12 arg0) {
		if (this.anInterface12_2 != arg0) {
			if (this.aBoolean75) {
				OpenGL.glBindBufferARB(34962, arg0.method3159());
			}
			this.anInterface12_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z[BIIZ)Lclient!gb;")
	public Interface4 method650(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) boolean arg2) {
		return (Interface4) (this.aBoolean75 && (!arg2 || this.aBoolean63) ? new Class103_Sub2(this, 5123, arg0, arg1, arg2) : new Class53_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "(I)V")
	private void method651() {
		this.aClass102_Sub2_3 = new Class102_Sub2();
		this.aClass102_Sub2_4 = new Class102_Sub2();
		this.aClass65Array1 = new Class65[this.anInt964];
		this.aClass65_Sub3_1 = new Class65_Sub3(this, 3553, 6408, 1, 1);
		this.aClass65_Sub3_2 = new Class65_Sub3(this, 3553, 6408, 1, 1);
		this.aClass65_Sub3_3 = new Class65_Sub3(this, 3553, 6408, 1, 1);
		this.aClass32_Sub2_5 = new Class32_Sub2(this);
		this.aClass32_Sub2_6 = new Class32_Sub2(this);
		this.aClass32_Sub2_2 = new Class32_Sub2(this);
		this.aClass32_Sub2_3 = new Class32_Sub2(this);
		this.aClass32_Sub2_8 = new Class32_Sub2(this);
		this.aClass32_Sub2_9 = new Class32_Sub2(this);
		this.aClass32_Sub2_1 = new Class32_Sub2(this);
		this.aClass32_Sub2_10 = new Class32_Sub2(this);
		this.aClass32_Sub2_7 = new Class32_Sub2(this);
		this.aClass32_Sub2_4 = new Class32_Sub2(this);
		if (this.aBoolean80) {
			this.aClass200_2 = new Class200(this);
			this.aClass200_1 = new Class200(this);
		}
	}

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "()V")
	@Override
	public void method2239() {
		if (!this.aBoolean71 || this.anInt763 <= 0 || this.anInt786 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt969;
		@Pc(25) int local25 = this.anInt963;
		@Pc(28) int local28 = this.anInt933;
		@Pc(31) int local31 = this.anInt949;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method688();
		this.method638(false);
		this.method662(false);
		this.method675(false);
		this.method644(false);
		this.method673(null);
		this.method628(-2);
		this.method669(1);
		this.method671(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt763, this.anInt786, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.pa(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZIZ)V")
	public void method652(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt932 != arg0) {
			if (arg0 < 0) {
				this.method647();
				this.method673(null);
				this.method669(0);
				if (!this.aBoolean69) {
					this.aClass109_1.method2349(arg1, arg2, 0);
				}
			} else {
				@Pc(13) Class65_Sub3 local13 = this.aClass244_1.method5493(arg0);
				@Pc(19) Class178 local19 = super.anInterface8_5.method3836(arg0);
				if (local19.aByte56 == 0 && local19.aByte55 == 0) {
					this.method647();
				} else {
					@Pc(40) int local40 = local19.aBoolean432 ? 64 : 128;
					@Pc(44) int local44 = local40 * 50;
					this.method640((float) (this.anInt925 % local44 * local19.aByte56) / (float) local44, 0.0F, (float) (local19.aByte55 * (this.anInt925 % local44)) / (float) local44);
				}
				if (this.aBoolean69) {
					this.aClass109_1.method2349(arg1, arg2, 3);
					this.method673(local13);
					this.method669(local19.anInt5078);
				} else {
					this.aClass109_1.method2349(arg1, arg2, local19.aByte59);
					this.aClass109_1.method2348(local19.aByte53, local19.anInt5077);
					if (!this.aClass109_1.method2347(local19.anInt5078, local13)) {
						this.method673(local13);
						this.method669(local19.anInt5078);
					}
				}
			}
			this.anInt932 = arg0;
		}
		this.anInt954 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	@Override
	public void method2234(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "(I)V")
	private void method653() {
		OpenGL.glViewport(this.anInt962, this.anInt947, this.anInt763, this.anInt786);
	}

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "()Z")
	@Override
	public boolean method2273() {
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "IA", descriptor = "(IIII)[I")
	@Override
	public int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt786 - local12 - arg1, arg2, 1, 32993, this.anInt939, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!bo", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt944 = arg2;
		this.aBoolean69 = true;
		this.anInt960 = arg1;
		this.anInt968 = arg0;
		this.anInt953 = arg3;
		this.aClass109_1.method2349(false, false, 3);
		this.aClass109_1.aClass36_Sub8_1.method5922();
		this.method690();
		this.method633();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I")
	@Override
	public int method2259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V")
	public void method654() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)I")
	@Override
	public int method2285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!c;Lclient!pm;Lclient!ia;Lclient!fo;I)V")
	@Override
	public void method2218(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) Class38_Sub4 arg3) {
		arg0.method5675(arg2, arg3, 0);
		this.method2252(arg1);
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)V")
	private void method656() {
		if (this.anInt954 == 1) {
			return;
		}
		this.method698();
		this.method638(false);
		this.method662(false);
		this.method675(false);
		this.method644(false);
		this.method673(null);
		this.method628(-2);
		this.method669(1);
		this.anInt954 = 1;
	}

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "()Z")
	@Override
	public boolean method2272() {
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "O", descriptor = "(IIIII)V")
	@Override
	protected void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)I")
	public int method657(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method2226(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aNativeHeap2 = ((Class2_Sub3_Sub1) arg0).aNativeHeap1;
		if (this.anInterface12_3 != null) {
			return;
		}
		@Pc(16) Class2_Sub20_Sub2 local16 = new Class2_Sub20_Sub2(80);
		if (this.aBoolean76) {
			local16.method3750(-1.0F);
			local16.method3750(-1.0F);
			local16.method3750(0.0F);
			local16.method3750(0.0F);
			local16.method3750(1.0F);
			local16.method3750(1.0F);
			local16.method3750(-1.0F);
			local16.method3750(0.0F);
			local16.method3750(1.0F);
			local16.method3750(1.0F);
			local16.method3750(1.0F);
			local16.method3750(1.0F);
			local16.method3750(0.0F);
			local16.method3750(1.0F);
			local16.method3750(0.0F);
			local16.method3750(-1.0F);
			local16.method3750(1.0F);
			local16.method3750(0.0F);
			local16.method3750(0.0F);
			local16.method3750(0.0F);
		} else {
			local16.method3753(-1.0F);
			local16.method3753(-1.0F);
			local16.method3753(0.0F);
			local16.method3753(0.0F);
			local16.method3753(1.0F);
			local16.method3753(1.0F);
			local16.method3753(-1.0F);
			local16.method3753(0.0F);
			local16.method3753(1.0F);
			local16.method3753(1.0F);
			local16.method3753(1.0F);
			local16.method3753(1.0F);
			local16.method3753(0.0F);
			local16.method3753(1.0F);
			local16.method3753(0.0F);
			local16.method3753(-1.0F);
			local16.method3753(1.0F);
			local16.method3753(0.0F);
			local16.method3753(0.0F);
			local16.method3753(0.0F);
		}
		this.anInterface12_3 = this.method692(20, false, local16.anInt4608, local16.aByteArray136);
		this.aClass100_4 = new Class100(this, this.anInterface12_3, 5126, 3, 0);
		this.aClass100_3 = new Class100(this, this.anInterface12_3, 5126, 2, 12);
		this.aClass230_1.method5268(this);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!fo;I)V")
	@Override
	public void method2291(@OriginalArg(0) Class32[] arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class38_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method5675(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!fq;Z)Lclient!f;")
	@Override
	public Class76 method2230(@OriginalArg(0) Class89 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt2412 * arg0.anInt2413];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray65 == null) {
			for (local21 = 0; local21 < arg0.anInt2412; local21++) {
				for (local25 = 0; local25 < arg0.anInt2413; local25++) {
					@Pc(83) int local83 = arg0.anIntArray139[arg0.aByteArray66[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt2412; local21++) {
				for (local25 = 0; local25 < arg0.anInt2413; local25++) {
					local12[local16++] = arg0.anIntArray139[arg0.aByteArray66[local14] & 0xFF] | arg0.aByteArray65[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(123) Class76 local123 = this.method2257(local12, arg0.anInt2413, arg0.anInt2413, arg0.anInt2412);
		local123.ka(arg0.anInt2409, arg0.anInt2410, arg0.anInt2411, arg0.anInt2408);
		return local123;
	}

	@OriginalMember(owner = "client!bo", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt946 = arg0;
		this.anInt935 = arg1;
		this.anInt958 = arg2;
		this.anInt941 = arg3;
		this.method667();
		this.method685();
		if (this.anInt940 == 3) {
			this.method687();
		} else if (this.anInt940 == 2) {
			this.method677();
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(III)V")
	public synchronized void method658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class2_Sub16 local14 = new Class2_Sub16(arg1);
		local14.aLong227 = arg0;
		this.aClass265_6.method5999(local14);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(FFFFI)V")
	public void method659(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static206.aFloatArray23[0] = arg3;
		Static206.aFloatArray23[3] = arg1;
		Static206.aFloatArray23[1] = arg2;
		Static206.aFloatArray23[2] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static206.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "([I)V")
	@Override
	public void u(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt963;
		arg0[0] = this.anInt969;
		arg0[1] = this.anInt933;
		arg0[3] = this.anInt949;
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(IIIIII)Lclient!to;")
	@Override
	public Class21 method2289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean68 ? new Class21_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(B)V")
	public void method661() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray3, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(ZI)V")
	public void method662(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean88) {
			this.aBoolean88 = arg0;
			this.method641();
			this.anInt954 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(JI)V")
	public synchronized void method663(@OriginalArg(0) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong227 = arg0;
		this.aClass265_10.method5999(local7);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IILclient!gb;II)V")
	public void method664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface4 arg2) {
		@Pc(11) int local11 = arg2.method3585();
		@Pc(18) int local18 = arg0 * this.method657(local11);
		this.method702(arg2);
		OpenGL.glDrawElements(4, arg1, local11, (long) local18 + arg2.method3584());
	}

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "(I)V")
	private void method665() {
		if (this.aCanvas1 == null) {
			this.anInt819 = this.anInt789 = 0;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas1.getSize();
			this.anInt819 = local18.width;
			this.anInt789 = local18.height;
		}
		if (this.anInterface2_2 == null) {
			this.anInt763 = this.anInt819;
			this.anInt786 = this.anInt789;
			this.method653();
		}
		this.method688();
		this.va();
	}

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "()V")
	@Override
	public void method2284() {
		this.method644(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(B)V")
	public void method666() {
		if (this.anInt954 == 8) {
			return;
		}
		this.method639();
		this.method638(true);
		this.method675(true);
		this.method644(true);
		this.method671(1);
		this.method669(0);
		this.anInt954 = 8;
	}

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "(B)V")
	private void method667() {
		@Pc(6) float[] local6 = this.aFloatArray2;
		@Pc(18) float local18 = (float) (-this.anInt946 * this.anInt970) / (float) this.anInt958;
		@Pc(33) float local33 = (float) ((this.anInt763 - this.anInt946) * this.anInt970) / (float) this.anInt958;
		@Pc(48) float local48 = (float) (this.anInt970 * this.anInt935) / (float) this.anInt941;
		@Pc(62) float local62 = (float) (this.anInt970 * (this.anInt935 - this.anInt786)) / (float) this.anInt941;
		if (local33 == local18 || local48 == local62) {
			local6[0] = 1.0F;
			local6[3] = 0.0F;
			local6[14] = 0.0F;
			local6[6] = 0.0F;
			local6[13] = 0.0F;
			local6[1] = 0.0F;
			local6[10] = 1.0F;
			local6[4] = 0.0F;
			local6[2] = 0.0F;
			local6[15] = 1.0F;
			local6[9] = 0.0F;
			local6[5] = 1.0F;
			local6[12] = 0.0F;
			local6[7] = 0.0F;
			local6[8] = 0.0F;
			local6[11] = 0.0F;
		} else {
			@Pc(76) float local76 = (float) this.anInt970 * 2.0F;
			local6[4] = 0.0F;
			local6[8] = (local33 + local18) / (local33 - local18);
			local6[10] = this.aFloat34 = (float) -(this.anInt936 + this.anInt970) / (float) (this.anInt936 - this.anInt970);
			local6[15] = 0.0F;
			local6[13] = 0.0F;
			local6[11] = -1.0F;
			local6[12] = 0.0F;
			local6[0] = local76 / (local33 - local18);
			local6[14] = this.aFloat28 = -(local76 * (float) this.anInt936) / (float) (this.anInt936 - this.anInt970);
			local6[2] = 0.0F;
			local6[7] = 0.0F;
			local6[6] = 0.0F;
			local6[5] = local76 / (local48 - local62);
			local6[9] = (local62 + local48) / (local48 - local62);
			local6[3] = 0.0F;
			local6[1] = 0.0F;
		}
		this.method670();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!gs;Lclient!gs;Lclient!gs;Lclient!gs;I)V")
	public void method668(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method649(arg1.anInterface12_4);
			OpenGL.glVertexPointer(arg1.aByte26, arg1.aShort27, this.anInterface12_2.method3158(), this.anInterface12_2.method3157() + (long) arg1.aByte25);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method649(arg2.anInterface12_4);
			OpenGL.glNormalPointer(arg2.aShort27, this.anInterface12_2.method3158(), this.anInterface12_2.method3157() + (long) arg2.aByte25);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method649(arg3.anInterface12_4);
			OpenGL.glColorPointer(arg3.aByte26, arg3.aShort27, this.anInterface12_2.method3158(), this.anInterface12_2.method3157() + (long) arg3.aByte25);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method649(arg0.anInterface12_4);
			OpenGL.glTexCoordPointer(arg0.aByte26, arg0.aShort27, this.anInterface12_2.method3158(), this.anInterface12_2.method3157() + (long) arg0.aByte25);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "()Z")
	@Override
	public boolean method2276() {
		return this.aClass2_Sub32_Sub1_1 != null && (this.anInt921 <= 1 || this.aBoolean74);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(BI)V")
	public void method669(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method695(7681, 7681);
		} else if (arg0 == 0) {
			this.method695(8448, 8448);
		} else if (arg0 == 2) {
			this.method695(34165, 7681);
		} else if (arg0 == 3) {
			this.method695(260, 8448);
		} else if (arg0 == 4) {
			this.method695(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "(B)V")
	private void method670() {
		if (this.aFloat38 == 0.0F) {
			this.aFloatArray2[10] = this.aFloat34;
			this.aFloatArray2[14] = this.aFloat28;
		} else {
			@Pc(35) float local35 = this.aFloat27 / (this.aFloat27 + this.aFloat38);
			@Pc(39) float local39 = local35 * local35;
			@Pc(54) float local54 = (1.0F - local35) * (1.0F - local35) * -this.aFloat28 / this.aFloat38;
			this.aFloatArray2[14] = this.aFloat28 * local39;
			this.aFloatArray2[10] = local54 + this.aFloat34;
		}
		this.bf = (float) this.anInt936 - this.aFloat38;
		this.aFloat20 = (this.aFloatArray2[14] - (float) this.anInt936) / this.aFloatArray2[10];
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2262() {
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(Z)V")
	@Override
	public void method2255(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)V")
	public void method671(@OriginalArg(0) int arg0) {
		if (this.anInt950 == arg0) {
			return;
		}
		@Pc(26) boolean local26;
		@Pc(22) byte local22;
		if (arg0 == 1) {
			local26 = true;
			local22 = 1;
		} else if (arg0 == 2) {
			local26 = false;
			local22 = 2;
		} else if (arg0 == 128) {
			local26 = true;
			local22 = 3;
		} else {
			local22 = 0;
			local26 = false;
		}
		if (!this.aBoolean84) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean84 = true;
		}
		if (this.aBoolean79 != local26) {
			if (local26) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean79 = local26;
		}
		if (this.anInt948 != local22) {
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
			this.anInt948 = local22;
		}
		this.anInt950 = arg0;
		this.anInt954 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "()Z")
	@Override
	public boolean method2246() {
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "(B)V")
	private void method672() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "()Z")
	@Override
	public boolean method2243() {
		return this.aBoolean73 && (!this.method2267() || this.aBoolean74);
	}

	@OriginalMember(owner = "client!bo", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		this.anInt924 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt924++;
		}
		this.anInt923 = 0x1 << this.anInt924;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!nk;I)V")
	public void method673(@OriginalArg(0) Class65 arg0) {
		@Pc(11) Class65 local11 = this.aClass65Array1[this.anInt961];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt5266);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt5266);
				} else if (local11.anInt5266 != arg0.anInt5266) {
					OpenGL.glDisable(local11.anInt5266);
					OpenGL.glEnable(arg0.anInt5266);
				}
				OpenGL.glBindTexture(arg0.anInt5266, arg0.method4261());
			}
			this.aClass65Array1[this.anInt961] = arg0;
		}
		this.anInt954 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "(II)I")
	public int method674(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!bo", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean69) {
			throw new RuntimeException("");
		}
		this.anInt953 = arg3;
		this.anInt944 = arg2;
		this.anInt960 = arg1;
		this.anInt968 = arg0;
		this.aClass109_1.aClass36_Sub8_1.method5922();
		this.method690();
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(ZI)V")
	public void method675(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean86) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean86 = arg0;
		this.anInt954 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!bo", name = "ia", descriptor = "(III[I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass102_Sub2_3.aFloat108 * (float) arg1 + (float) arg0 * this.aClass102_Sub2_3.aFloat113 + this.aClass102_Sub2_3.aFloat103 * (float) arg2 + this.aClass102_Sub2_3.aFloat111;
		if ((float) this.anInt970 > local28 || local28 > (float) this.anInt936) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass102_Sub2_3.aFloat104 + this.aClass102_Sub2_3.aFloat110 * (float) arg1 + (float) arg0 * this.aClass102_Sub2_3.aFloat109 + this.aClass102_Sub2_3.aFloat112 * (float) arg2) * (float) this.anInt958 / local28);
		@Pc(117) int local117 = (int) ((this.aClass102_Sub2_3.aFloat114 + (float) arg2 * this.aClass102_Sub2_3.aFloat105 + this.aClass102_Sub2_3.aFloat106 * (float) arg1 + this.aClass102_Sub2_3.aFloat107 * (float) arg0) * (float) this.anInt941 / local28);
		if (this.aFloat31 <= (float) local85 && (float) local85 <= this.aFloat19 && this.aFloat26 <= (float) local117 && (float) local117 <= this.aFloat37) {
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat26);
			arg3[0] = (int) ((float) local85 - this.aFloat31);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!eg;B)V")
	public void method676(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt928 < 0 || this.anInterface2Array3[this.anInt928] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface2Array3[this.anInt928--] = null;
		arg0.method4535();
		if (this.anInt928 >= 0) {
			this.anInterface2_1 = this.anInterface2Array3[this.anInt928];
			this.anInterface2_1.method4536();
		} else {
			this.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "()I")
	@Override
	public int g() {
		@Pc(6) int local6 = this.anInt955;
		this.anInt955 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "(B)V")
	private void method677() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray2, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "()Z")
	@Override
	public boolean method2238() {
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method656();
		this.method671(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!to;)V")
	@Override
	public void method2283(@OriginalArg(0) Class21 arg0) {
		this.aClass21_Sub1_1 = (Class21_Sub1) arg0;
	}

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "()V")
	@Override
	public void method2268() {
		this.aClass162_1.method3830();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZBI)V")
	public void method678(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method652(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "()V")
	@Override
	protected void method2269() {
		for (@Pc(10) Class2 local10 = this.aClass265_3.method6005(); local10 != null; local10 = this.aClass265_3.method6001()) {
			((Class2_Sub3_Sub1) local10).method211();
		}
		if (this.aClass162_1 != null) {
			this.aClass162_1.method3822();
		}
		if (this.anOpenGL1 != null) {
			this.method672();
			@Pc(40) Enumeration local40 = this.aHashtable1.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable1.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean61) {
			Static6.method149(true);
			this.aBoolean61 = false;
		}
	}

	@OriginalMember(owner = "client!bo", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		@Pc(6) int local6 = this.anInt942;
		this.anInt942 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(IB)V")
	public void method679(@OriginalArg(0) int arg0) {
		Static206.aFloatArray23[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static206.aFloatArray23[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static206.aFloatArray23[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static206.aFloatArray23[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static206.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(FB)V")
	public void method680(@OriginalArg(0) float arg0) {
		if (this.aFloat23 == arg0) {
			return;
		}
		this.aFloat23 = arg0;
		if (this.anInt940 == 3) {
			this.method687();
			return;
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(ILclient!eg;)V")
	public void method681(@OriginalArg(1) Interface2 arg0) {
		if (this.anInt926 < 0 || this.anInterface2Array2[this.anInt926] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface2Array2[this.anInt926--] = null;
		arg0.method4533();
		if (this.anInt926 >= 0) {
			this.anInterface2_2 = this.anInterface2Array2[this.anInt926];
			this.anInterface2_2.method4534();
		} else {
			this.anInterface2_2 = null;
		}
	}

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "(I)V")
	private void method682() {
		@Pc(11) int local11;
		for (local11 = 0; local11 < this.anInt959; local11++) {
			@Pc(18) Class2_Sub7 local18 = this.aClass2_Sub7Array2[local11];
			@Pc(22) int local22 = local11 + 16386;
			Static327.aFloatArray27[0] = local18.method2991();
			Static327.aFloatArray27[1] = local18.method2996();
			Static327.aFloatArray27[2] = local18.method2997();
			Static327.aFloatArray27[3] = 1.0F;
			OpenGL.glLightfv(local22, 4611, Static327.aFloatArray27, 0);
			@Pc(58) int local58 = local18.method2993();
			@Pc(64) float local64 = local18.method2994() / 255.0F;
			Static327.aFloatArray27[1] = (float) (local58 >> 8 & 0xFF) * local64;
			Static327.aFloatArray27[2] = (float) (local58 & 0xFF) * local64;
			Static327.aFloatArray27[0] = (float) (local58 >> 16 & 0xFF) * local64;
			OpenGL.glLightfv(local22, 4609, Static327.aFloatArray27, 0);
			OpenGL.glLightf(local22, 4617, 1.0F / (float) (local18.method2992() * local18.method2992()));
			OpenGL.glEnable(local22);
		}
		while (this.anInt951 > local11) {
			OpenGL.glDisable(local11 + 16386);
			local11++;
		}
		this.anInt951 = this.anInt959;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass162_1.method3831(arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2229(@OriginalArg(0) Canvas arg0) {
		this.aLong25 = 0L;
		this.aCanvas1 = null;
		if (arg0 == null || arg0 == this.aCanvas2) {
			this.aLong25 = this.aLong26;
			this.aCanvas1 = this.aCanvas2;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable1.get(arg0);
			this.aLong25 = local26;
			this.aCanvas1 = arg0;
		}
		if (this.aCanvas1 == null || this.aLong25 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong25);
		this.method665();
	}

	@OriginalMember(owner = "client!bo", name = "JA", descriptor = "(II)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt970 && arg1 == this.anInt936) {
			return;
		}
		this.anInt936 = arg1;
		this.anInt970 = arg0;
		this.method667();
		this.method690();
		if (this.anInt940 == 3) {
			this.method687();
		} else if (this.anInt940 == 2) {
			this.method677();
		}
	}

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "()Z")
	@Override
	public boolean method2267() {
		return this.aClass2_Sub32_Sub1_1 != null && this.aClass2_Sub32_Sub1_1.method5803();
	}

	@OriginalMember(owner = "client!bo", name = "x", descriptor = "()I")
	@Override
	public int method2281() {
		return 4;
	}

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "(I)V")
	public void method683() {
		if (this.anInt954 == 4) {
			return;
		}
		this.method698();
		this.method638(false);
		this.method662(false);
		this.method675(false);
		this.method644(false);
		this.method628(-2);
		this.method671(1);
		this.method669(0);
		this.anInt954 = 4;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class76 method2257(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class76_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "()Z")
	@Override
	public boolean method2261() {
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class14 method2232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static395.method5428(arg0, arg1, this, arg2, arg3);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!eg;Z)V")
	public void method684(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt926 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt926 >= 0) {
			this.anInterface2Array2[this.anInt926].method4533();
		}
		this.anInterface2_2 = this.anInterface2Array2[++this.anInt926] = arg0;
		this.anInterface2_2.method4534();
	}

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "(B)V")
	private void method685() {
		this.aFloat26 = this.anInt933 - this.anInt935;
		this.aFloat19 = this.anInt963 - this.anInt946;
		this.aFloat31 = this.anInt969 - this.anInt946;
		this.aFloat37 = this.anInt949 - this.anInt935;
	}

	@OriginalMember(owner = "client!bo", name = "pa", descriptor = "(IIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt763) {
			arg2 = this.anInt763;
		}
		if (arg3 > this.anInt786) {
			arg3 = this.anInt786;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt949 = arg3;
		this.anInt963 = arg2;
		this.anInt969 = arg0;
		this.anInt933 = arg1;
		OpenGL.glEnable(3089);
		this.method685();
		this.method689();
	}

	@OriginalMember(owner = "client!bo", name = "w", descriptor = "(I)V")
	private void method686() {
		this.method628(-2);
		for (@Pc(14) int local14 = this.anInt964 - 1; local14 >= 0; local14--) {
			this.method696(local14);
			this.method673(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method695(8448, 8448);
		this.method646(2, 770, 34168);
		this.method647();
		this.anInt950 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt948 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean79 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean84 = true;
		this.method638(true);
		this.method662(true);
		this.method675(true);
		this.method644(true);
		this.method688();
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
		@Pc(123) float[] local123 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(131) int local131 = 0; local131 < 8; local131++) {
			@Pc(137) int local137 = local131 + 16384;
			OpenGL.glLightfv(local137, 4608, local123, 0);
			OpenGL.glLightf(local137, 4615, 0.0F);
			OpenGL.glLightf(local137, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt943 = this.anInt952 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "([Lclient!c;Lclient!pm;Lclient!ia;[Lclient!fo;I)V")
	@Override
	public void method2241(@OriginalArg(0) Class32[] arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) Class38_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method2291(arg0, arg2, arg3, arg4);
		this.method2252(arg1);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2219(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static171.aFloat102 = arg2;
		Static358.aFloat192 = arg0;
		Static173.aFloat116 = arg1;
	}

	@OriginalMember(owner = "client!bo", name = "x", descriptor = "(I)V")
	private void method687() {
		@Pc(15) float local15 = this.aFloat23 * (float) -this.anInt946 / (float) this.anInt958;
		@Pc(27) float local27 = this.aFloat23 * (float) -this.anInt935 / (float) this.anInt941;
		@Pc(42) float local42 = (float) (this.anInt763 - this.anInt946) * this.aFloat23 / (float) this.anInt958;
		@Pc(57) float local57 = this.aFloat23 * (float) (this.anInt786 - this.anInt935) / (float) this.anInt941;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local42 && local57 != local27) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) ((float) this.anInt970 - this.aFloat38), (double) ((float) this.anInt936 - this.aFloat38));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "(B)V")
	public void method688() {
		if (this.anInt940 != 0) {
			this.anInt940 = 0;
			this.anInt954 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!bo", name = "aa", descriptor = "(IIIIII[BII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(41) float local41;
		if (this.aClass65_Sub3_Sub1_1 == null || this.aClass65_Sub3_Sub1_1.anInt2642 < arg2 || arg3 > this.aClass65_Sub3_Sub1_1.anInt2641) {
			this.aClass65_Sub3_Sub1_1 = Static329.method4700(arg6, this, arg2, arg3);
			this.aClass65_Sub3_Sub1_1.method1962(false, false);
			local41 = this.aClass65_Sub3_Sub1_1.aFloat84;
			local45 = this.aClass65_Sub3_Sub1_1.aFloat85;
		} else {
			this.aClass65_Sub3_Sub1_1.method1963(false, arg6, arg3, arg2, 6406);
			local41 = (float) arg2 * this.aClass65_Sub3_Sub1_1.aFloat84 / (float) this.aClass65_Sub3_Sub1_1.anInt2642;
			local45 = (float) arg3 * this.aClass65_Sub3_Sub1_1.aFloat85 / (float) this.aClass65_Sub3_Sub1_1.anInt2641;
		}
		this.method630();
		this.method673(this.aClass65_Sub3_Sub1_1);
		this.method671(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method679(arg5);
		this.method695(34165, 34165);
		this.method646(0, 768, 34166);
		this.method646(2, 770, 5890);
		this.method643(0, 34166);
		this.method643(2, 5890);
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
		this.method646(0, 768, 5890);
		this.method646(2, 770, 34166);
		this.method643(0, 5890);
		this.method643(2, 34166);
	}

	@OriginalMember(owner = "client!bo", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt952 && this.anInt965 == arg1 && arg2 == this.anInt938) {
			return;
		}
		this.anInt938 = arg2;
		this.anInt952 = arg0;
		this.anInt965 = arg1;
		if (this.aBoolean69) {
			return;
		}
		this.method690();
		this.method633();
	}

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "(I)V")
	private void method689() {
		if (this.anInt969 <= this.anInt963 && this.anInt933 <= this.anInt949) {
			OpenGL.glScissor(this.anInt969 + this.anInt962, -this.anInt949 + this.anInt947 + this.anInt786, this.anInt963 - this.anInt969, this.anInt949 - this.anInt933);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method2222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class14 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class14_Sub2 local6 = (Class14_Sub2) arg5;
		@Pc(9) Class65_Sub3_Sub1 local9 = local6.aClass65_Sub3_Sub1_2;
		this.method630();
		this.method673(local6.aClass65_Sub3_Sub1_2);
		this.method671(1);
		this.method695(7681, 8448);
		this.method646(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat84 / (float) local9.anInt2650;
		@Pc(46) float local46 = local9.aFloat85 / (float) local9.anInt2651;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method646(0, 768, 5890);
	}

	@OriginalMember(owner = "client!bo", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method656();
		this.method671(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "(B)V")
	private void method690() {
		@Pc(52) int local52;
		if (this.aBoolean69) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local52 = this.anInt960;
		} else {
			this.aFloat35 = (float) (this.anInt936 - this.anInt938) - this.aFloat25;
			this.aFloat21 = this.aFloat35 - this.aFloat36 * (float) this.anInt965;
			if (this.aFloat21 < (float) this.anInt970) {
				this.aFloat21 = this.anInt970;
			}
			OpenGL.glFogf(2915, this.aFloat21);
			OpenGL.glFogf(2916, this.aFloat35);
			local52 = this.anInt952;
		}
		Static206.aFloatArray23[2] = (float) (local52 & 0xFF) / 255.0F;
		Static206.aFloatArray23[1] = (float) (local52 & 0xFF00) / 65280.0F;
		Static206.aFloatArray23[0] = (float) (local52 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static206.aFloatArray23, 0);
		if (this.aBoolean69) {
			this.aClass109_1.aClass36_Sub8_1.method5920();
		}
	}

	@OriginalMember(owner = "client!bo", name = "ua", descriptor = "(F)V")
	@Override
	public void ua(@OriginalArg(0) float arg0) {
		if (this.aFloat33 != arg0) {
			this.aFloat33 = arg0;
			this.method634();
		}
	}

	@OriginalMember(owner = "client!bo", name = "NA", descriptor = "(IIIIII)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method656();
		this.method671(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean73) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean73) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2287(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V")
	@Override
	public void method2256(@OriginalArg(0) int arg0) {
		this.method632();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "()V")
	@Override
	public void method2220() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "()Z")
	@Override
	public boolean method2279() {
		return false;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(Z)V")
	@Override
	public void method2253(@OriginalArg(0) boolean arg0) {
		this.aBoolean65 = arg0;
		this.method701();
	}

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "()Z")
	@Override
	public boolean method2263() {
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "SA", descriptor = "(IIIIII)Z")
	@Override
	public boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass102_Sub2_3.aFloat113 * (float) arg0 + this.aClass102_Sub2_3.aFloat108 * (float) arg1 + (float) arg2 * this.aClass102_Sub2_3.aFloat103 + this.aClass102_Sub2_3.aFloat111;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass102_Sub2_3.aFloat111 + this.aClass102_Sub2_3.aFloat103 * (float) arg5 + this.aClass102_Sub2_3.aFloat113 * (float) arg3 + this.aClass102_Sub2_3.aFloat108 * (float) arg4;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt970 && (float) this.anInt970 > local59 || !(!(local28 > (float) this.anInt936) || !(local59 > (float) this.anInt936))) {
			return false;
		}
		@Pc(123) int local123 = (int) (((float) arg2 * this.aClass102_Sub2_3.aFloat112 + (float) arg1 * this.aClass102_Sub2_3.aFloat110 + this.aClass102_Sub2_3.aFloat109 * (float) arg0 + this.aClass102_Sub2_3.aFloat104) * (float) this.anInt958 / local28);
		@Pc(155) int local155 = (int) ((this.aClass102_Sub2_3.aFloat110 * (float) arg4 + (float) arg3 * this.aClass102_Sub2_3.aFloat109 + this.aClass102_Sub2_3.aFloat112 * (float) arg5 + this.aClass102_Sub2_3.aFloat104) * (float) this.anInt958 / local59);
		if ((float) local123 < this.aFloat31 && this.aFloat31 > (float) local155 || (float) local123 > this.aFloat19 && (float) local155 > this.aFloat19) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass102_Sub2_3.aFloat114 + (float) arg2 * this.aClass102_Sub2_3.aFloat105 + this.aClass102_Sub2_3.aFloat107 * (float) arg0 + this.aClass102_Sub2_3.aFloat106 * (float) arg1) * (float) this.anInt941 / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt941 * ((float) arg5 * this.aClass102_Sub2_3.aFloat105 + (float) arg4 * this.aClass102_Sub2_3.aFloat106 + (float) arg3 * this.aClass102_Sub2_3.aFloat107 + this.aClass102_Sub2_3.aFloat114) / local59);
			return (!(this.aFloat26 > (float) local213) || !((float) local245 < this.aFloat26)) && (!(this.aFloat37 < (float) local213) || !((float) local245 > this.aFloat37));
		}
	}

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "(I)V")
	private void method691() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass102_Sub2_3.method2657(), 0);
		if (this.aBoolean69) {
			this.aClass109_1.aClass36_Sub8_1.method5922();
		}
		this.method661();
		this.method682();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIZI[B)Lclient!rg;")
	public Interface12 method692(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface12) (this.aBoolean75 && (!arg1 || this.aBoolean63) ? new Class103_Sub1(this, arg0, arg3, arg2, arg1) : new Class53_Sub2(this, arg0, arg3, arg2));
	}

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "()Z")
	@Override
	public boolean method2228() {
		if (this.aClass2_Sub32_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub32_Sub1_1.method5803()) {
			if (!this.aClass162_1.method3828(this.aClass2_Sub32_Sub1_1)) {
				return false;
			}
			this.aClass244_1.method5494();
		}
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "()Z")
	@Override
	public boolean method2240() {
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I[Lclient!or;)V")
	@Override
	public void method2265(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub7Array2[local7] = arg1[local7];
		}
		this.anInt959 = arg0;
		if (this.anInt940 != 1) {
			this.method682();
		}
	}

	@OriginalMember(owner = "client!bo", name = "B", descriptor = "(I)V")
	private void method694() {
		if (this.anInt940 != 3) {
			this.anInt940 = 3;
			this.method687();
			this.method691();
			this.anInt954 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(BII)V")
	public void method695(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt961 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (arg0 != this.anInt956) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local17 = true;
			this.anInt956 = arg0;
		}
		if (this.anInt934 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt934 = arg1;
			local17 = true;
		}
		if (local17) {
			this.anInt954 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!bo", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt949 = this.anInt786;
		this.anInt933 = 0;
		this.anInt963 = this.anInt763;
		this.anInt969 = 0;
		OpenGL.glDisable(3089);
		this.method685();
	}

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "(II)V")
	public void method696(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt961) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt961 = arg0;
		}
	}

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "()Lclient!ia;")
	@Override
	public Class102 method2286() {
		return new Class102_Sub2();
	}

	@OriginalMember(owner = "client!bo", name = "la", descriptor = "()F")
	@Override
	public float la() {
		return this.aFloat27;
	}

	@OriginalMember(owner = "client!bo", name = "S", descriptor = "()V")
	@Override
	public void S() {
		this.aBoolean69 = false;
		this.aClass109_1.method2349(false, false, 0);
		this.method690();
		this.method633();
	}

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "(ILclient!ea;II)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class14_Sub2 local6 = (Class14_Sub2) arg1;
		@Pc(9) Class65_Sub3_Sub1 local9 = local6.aClass65_Sub3_Sub1_2;
		this.method630();
		this.method673(local6.aClass65_Sub3_Sub1_2);
		this.method671(1);
		this.method695(7681, 8448);
		this.method646(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat84 / (float) local9.anInt2650;
		@Pc(46) float local46 = local9.aFloat85 / (float) local9.anInt2651;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt969 - arg2) * local39, local46 * (float) (this.anInt933 - arg3));
		OpenGL.glVertex2i(this.anInt969, this.anInt933);
		OpenGL.glTexCoord2f((float) (this.anInt969 - arg2) * local39, (float) (this.anInt949 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt969, this.anInt949);
		OpenGL.glTexCoord2f((float) (this.anInt963 - arg2) * local39, local46 * (float) (this.anInt949 - arg3));
		OpenGL.glVertex2i(this.anInt963, this.anInt949);
		OpenGL.glTexCoord2f((float) (this.anInt963 - arg2) * local39, (float) (this.anInt933 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt963, this.anInt933);
		OpenGL.glEnd();
		this.method646(0, 768, 5890);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!ik;I)V")
	public void method697(@OriginalArg(0) Class102_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method2657(), 0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!pm;)V")
	@Override
	public void method2252(@OriginalArg(0) Class192 arg0) {
		this.aClass230_1.method5269(this, arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V")
	@Override
	public void method2248(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bo", name = "XA", descriptor = "(IFFFFF)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt943;
		if (local11 || arg1 != this.aFloat24 || this.aFloat22 != arg2) {
			this.aFloat24 = arg1;
			this.aFloat22 = arg2;
			this.anInt943 = arg0;
			if (local11) {
				this.aFloat30 = (float) (this.anInt943 & 0xFF00) / 65280.0F;
				this.aFloat32 = (float) (this.anInt943 & 0xFF0000) / 1.671168E7F;
				this.aFloat29 = (float) (this.anInt943 & 0xFF) / 255.0F;
				this.method634();
			}
			this.method706();
		}
		if (this.aFloatArray5[0] == arg3 && this.aFloatArray5[1] == arg4 && arg5 == this.aFloatArray5[2]) {
			return;
		}
		this.aFloatArray5[1] = arg4;
		this.aFloatArray5[2] = arg5;
		this.aFloatArray5[0] = arg3;
		this.aFloatArray1[2] = -arg5;
		this.aFloatArray1[1] = -arg4;
		this.aFloatArray1[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray3[0] = arg3 * local138;
		this.aFloatArray3[2] = arg5 * local138;
		this.aFloatArray3[1] = local138 * arg4;
		this.aFloatArray4[1] = -this.aFloatArray3[1];
		this.aFloatArray4[0] = -this.aFloatArray3[0];
		this.aFloatArray4[2] = -this.aFloatArray3[2];
		this.method661();
		this.anInt937 = (int) (arg3 * 256.0F / arg4);
		this.anInt967 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)V")
	@Override
	public void method2270(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt920 = arg0;
		this.aClass244_1.method5494();
	}

	@OriginalMember(owner = "client!bo", name = "C", descriptor = "(I)V")
	private void method698() {
		if (this.anInt940 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt763 > 0 && this.anInt786 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt763, (double) this.anInt786, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt954 &= 0xFFFFFFE7;
		this.anInt940 = 1;
	}

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "(I)V")
	public void method699() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIF)Lclient!or;")
	@Override
	public Class2_Sub7 method2275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub7_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "(II)V")
	public synchronized void method700(@OriginalArg(0) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong227 = arg0;
		this.aClass265_9.method5999(local7);
	}

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "(B)V")
	private void method701() {
		OpenGL.glDepthMask(this.aBoolean66 && this.aBoolean65);
	}

	@OriginalMember(owner = "client!bo", name = "FA", descriptor = "()I")
	@Override
	public int FA() {
		return this.anInt929 + this.anInt931 + this.anInt930;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!gb;)V")
	public void method702(@OriginalArg(1) Interface4 arg0) {
		if (arg0 != this.anInterface4_2) {
			if (this.aBoolean75) {
				OpenGL.glBindBufferARB(34963, arg0.method3582());
			}
			this.anInterface4_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class106 method2280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class106_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!eg;)V")
	public void method703(@OriginalArg(1) Interface2 arg0) {
		if (this.anInt928 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt928 >= 0) {
			this.anInterface2Array3[this.anInt928].method4535();
		}
		this.anInterface2_1 = this.anInterface2Array3[++this.anInt928] = arg0;
		this.anInterface2_1.method4536();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!to;Lclient!to;FLclient!to;)Lclient!to;")
	@Override
	public Class21 method2251(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class21 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean68 && this.aBoolean80 && this.aBoolean82) {
			@Pc(18) Class21_Sub1_Sub1 local18 = null;
			@Pc(21) Class21_Sub1 local21 = (Class21_Sub1) arg0;
			@Pc(24) Class21_Sub1 local24 = (Class21_Sub1) arg1;
			@Pc(28) Class65_Sub1 local28 = local21.method5279();
			@Pc(32) Class65_Sub1 local32 = local24.method5279();
			if (local28 != null && local32 != null) {
				@Pc(51) int local51 = local28.anInt2060 <= local32.anInt2060 ? local32.anInt2060 : local28.anInt2060;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class21_Sub1_Sub1) {
					@Pc(63) Class21_Sub1_Sub1 local63 = (Class21_Sub1_Sub1) arg3;
					if (local63.method4676() == local51) {
						local18 = local63;
					}
				}
				if (local18 == null) {
					local18 = new Class21_Sub1_Sub1(this, local51);
				}
				if (local18.method4673(local28, arg2, local32)) {
					return local18;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(III)V")
	public void method704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt947 = arg0;
		this.anInt962 = arg1;
		this.method653();
		this.method689();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!re;[Lclient!fq;Z)Lclient!oa;")
	@Override
	public Class56 method2231(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class89[] arg1) {
		return new Class56_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(III)V")
	public synchronized void method705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class2_Sub16 local14 = new Class2_Sub16(arg0);
		local14.aLong227 = arg1;
		this.aClass265_8.method5999(local14);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method2260(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "(I)V")
	private void method706() {
		Static206.aFloatArray23[2] = this.aFloat24 * this.aFloat29;
		Static206.aFloatArray23[3] = 1.0F;
		Static206.aFloatArray23[1] = this.aFloat30 * this.aFloat24;
		Static206.aFloatArray23[0] = this.aFloat32 * this.aFloat24;
		OpenGL.glLightfv(16384, 4609, Static206.aFloatArray23, 0);
		Static206.aFloatArray23[2] = -this.aFloat22 * this.aFloat29;
		Static206.aFloatArray23[3] = 1.0F;
		Static206.aFloatArray23[1] = -this.aFloat22 * this.aFloat30;
		Static206.aFloatArray23[0] = this.aFloat32 * -this.aFloat22;
		OpenGL.glLightfv(16385, 4609, Static206.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!bo", name = "B", descriptor = "()Z")
	@Override
	public boolean method2290() {
		return false;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(IIII)V")
	public void method707(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZ)V")
	public void method708(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean70 != arg0) {
			this.aBoolean70 = arg0;
			this.method641();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2233(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method2220();
	}
}
