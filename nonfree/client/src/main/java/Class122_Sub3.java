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

@OriginalClass("client!uq")
public final class Class122_Sub3 extends Class122 {

	@OriginalMember(owner = "client!uq", name = "B", descriptor = "I")
	public int anInt8238;

	@OriginalMember(owner = "client!uq", name = "Ub", descriptor = "I")
	private int anInt8305;

	@OriginalMember(owner = "client!uq", name = "dc", descriptor = "I")
	public int anInt8314;

	@OriginalMember(owner = "client!uq", name = "lc", descriptor = "I")
	private int anInt8321;

	@OriginalMember(owner = "client!uq", name = "oe", descriptor = "I")
	public int anInt8419;

	@OriginalMember(owner = "client!uq", name = "se", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!uq", name = "ze", descriptor = "Lclient!ve;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!uq", name = "Ce", descriptor = "Lclient!ve;")
	private Interface20 anInterface20_2;

	@OriginalMember(owner = "client!uq", name = "De", descriptor = "I")
	private int anInt8425;

	@OriginalMember(owner = "client!uq", name = "Ee", descriptor = "I")
	public int anInt8426;

	@OriginalMember(owner = "client!uq", name = "Ge", descriptor = "I")
	public int anInt8427;

	@OriginalMember(owner = "client!uq", name = "Ne", descriptor = "Lclient!lr;")
	public Class145_Sub2 aClass145_Sub2_1;

	@OriginalMember(owner = "client!uq", name = "Re", descriptor = "Z")
	public boolean aBoolean575;

	@OriginalMember(owner = "client!uq", name = "Te", descriptor = "Z")
	private boolean aBoolean576;

	@OriginalMember(owner = "client!uq", name = "We", descriptor = "F")
	private float aFloat163;

	@OriginalMember(owner = "client!uq", name = "Xe", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!uq", name = "bf", descriptor = "I")
	public int bf;

	@OriginalMember(owner = "client!uq", name = "cf", descriptor = "Z")
	private boolean aBoolean578;

	@OriginalMember(owner = "client!uq", name = "df", descriptor = "Lclient!lr;")
	public Class145_Sub2 aClass145_Sub2_2;

	@OriginalMember(owner = "client!uq", name = "ef", descriptor = "F")
	private float aFloat166;

	@OriginalMember(owner = "client!uq", name = "ff", descriptor = "J")
	private long aLong355;

	@OriginalMember(owner = "client!uq", name = "gf", descriptor = "I")
	private int anInt8433;

	@OriginalMember(owner = "client!uq", name = "kf", descriptor = "Z")
	public boolean aBoolean581;

	@OriginalMember(owner = "client!uq", name = "mf", descriptor = "Lclient!lr;")
	public Class145_Sub2 aClass145_Sub2_3;

	@OriginalMember(owner = "client!uq", name = "of", descriptor = "Lclient!lr;")
	public Class145_Sub2 aClass145_Sub2_4;

	@OriginalMember(owner = "client!uq", name = "pf", descriptor = "I")
	private int anInt8435;

	@OriginalMember(owner = "client!uq", name = "tf", descriptor = "Z")
	private boolean aBoolean583;

	@OriginalMember(owner = "client!uq", name = "wf", descriptor = "Lclient!cd;")
	public Class43 aClass43_15;

	@OriginalMember(owner = "client!uq", name = "xf", descriptor = "Z")
	private boolean aBoolean584;

	@OriginalMember(owner = "client!uq", name = "yf", descriptor = "I")
	public int anInt8439;

	@OriginalMember(owner = "client!uq", name = "zf", descriptor = "Z")
	private boolean aBoolean585;

	@OriginalMember(owner = "client!uq", name = "Bf", descriptor = "[Lclient!ea;")
	private Class73[] aClass73Array1;

	@OriginalMember(owner = "client!uq", name = "Cf", descriptor = "Z")
	private boolean aBoolean586;

	@OriginalMember(owner = "client!uq", name = "Df", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!uq", name = "Ff", descriptor = "Lclient!em;")
	private Class73_Sub1_Sub1 aClass73_Sub1_Sub1_4;

	@OriginalMember(owner = "client!uq", name = "Gf", descriptor = "I")
	private int anInt8440;

	@OriginalMember(owner = "client!uq", name = "If", descriptor = "Lclient!lr;")
	public Class145_Sub2 aClass145_Sub2_5;

	@OriginalMember(owner = "client!uq", name = "Kf", descriptor = "I")
	private int anInt8443;

	@OriginalMember(owner = "client!uq", name = "Lf", descriptor = "F")
	private float aFloat170;

	@OriginalMember(owner = "client!uq", name = "Nf", descriptor = "Z")
	public boolean aBoolean589;

	@OriginalMember(owner = "client!uq", name = "Pf", descriptor = "Lclient!lr;")
	public Class145_Sub2 aClass145_Sub2_6;

	@OriginalMember(owner = "client!uq", name = "Qf", descriptor = "Lclient!nu;")
	private Interface10 anInterface10_5;

	@OriginalMember(owner = "client!uq", name = "Sf", descriptor = "Z")
	private boolean aBoolean590;

	@OriginalMember(owner = "client!uq", name = "Uf", descriptor = "Z")
	public boolean aBoolean591;

	@OriginalMember(owner = "client!uq", name = "Vf", descriptor = "I")
	public int anInt8447;

	@OriginalMember(owner = "client!uq", name = "Zf", descriptor = "Z")
	private boolean aBoolean592;

	@OriginalMember(owner = "client!uq", name = "ag", descriptor = "Ljava/lang/String;")
	private String aString77;

	@OriginalMember(owner = "client!uq", name = "bg", descriptor = "Z")
	public boolean aBoolean593;

	@OriginalMember(owner = "client!uq", name = "cg", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!uq", name = "dg", descriptor = "Lclient!lr;")
	public Class145_Sub2 aClass145_Sub2_7;

	@OriginalMember(owner = "client!uq", name = "eg", descriptor = "Z")
	public boolean aBoolean594;

	@OriginalMember(owner = "client!uq", name = "fg", descriptor = "I")
	private int anInt8448;

	@OriginalMember(owner = "client!uq", name = "gg", descriptor = "I")
	private int anInt8449;

	@OriginalMember(owner = "client!uq", name = "jg", descriptor = "Lclient!ee;")
	private Interface2 anInterface2_6;

	@OriginalMember(owner = "client!uq", name = "mg", descriptor = "Z")
	public boolean aBoolean595;

	@OriginalMember(owner = "client!uq", name = "og", descriptor = "Z")
	private boolean aBoolean596;

	@OriginalMember(owner = "client!uq", name = "pg", descriptor = "I")
	private int anInt8453;

	@OriginalMember(owner = "client!uq", name = "rg", descriptor = "Lclient!lr;")
	public Class145_Sub2 aClass145_Sub2_8;

	@OriginalMember(owner = "client!uq", name = "tg", descriptor = "I")
	private int anInt8455;

	@OriginalMember(owner = "client!uq", name = "ug", descriptor = "Lclient!hba;")
	public Class118_Sub1 aClass118_Sub1_3;

	@OriginalMember(owner = "client!uq", name = "wg", descriptor = "Lclient!lr;")
	public Class145_Sub2 aClass145_Sub2_9;

	@OriginalMember(owner = "client!uq", name = "xg", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!uq", name = "yg", descriptor = "I")
	private int anInt8456;

	@OriginalMember(owner = "client!uq", name = "Bg", descriptor = "Lclient!wd;")
	public Class311 aClass311_6;

	@OriginalMember(owner = "client!uq", name = "Dg", descriptor = "I")
	private int anInt8458;

	@OriginalMember(owner = "client!uq", name = "Eg", descriptor = "F")
	private float aFloat176;

	@OriginalMember(owner = "client!uq", name = "Gg", descriptor = "Lclient!lr;")
	public Class145_Sub2 aClass145_Sub2_10;

	@OriginalMember(owner = "client!uq", name = "Hg", descriptor = "Ljava/lang/String;")
	private String aString78;

	@OriginalMember(owner = "client!uq", name = "Ig", descriptor = "I")
	public int anInt8460;

	@OriginalMember(owner = "client!uq", name = "Jg", descriptor = "Z")
	public boolean aBoolean598;

	@OriginalMember(owner = "client!uq", name = "Kg", descriptor = "Lclient!hba;")
	public Class118_Sub1 aClass118_Sub1_4;

	@OriginalMember(owner = "client!uq", name = "Lg", descriptor = "F")
	public float aFloat177;

	@OriginalMember(owner = "client!uq", name = "Mg", descriptor = "F")
	public float aFloat178;

	@OriginalMember(owner = "client!uq", name = "Pg", descriptor = "Lclient!ku;")
	public Class73_Sub1 aClass73_Sub1_5;

	@OriginalMember(owner = "client!uq", name = "Qg", descriptor = "Z")
	private boolean aBoolean600;

	@OriginalMember(owner = "client!uq", name = "Tg", descriptor = "Lclient!ee;")
	private Interface2 anInterface2_7;

	@OriginalMember(owner = "client!uq", name = "Ug", descriptor = "I")
	private int anInt8461;

	@OriginalMember(owner = "client!uq", name = "ah", descriptor = "Lclient!hj;")
	private Class45_Sub2 aClass45_Sub2_1;

	@OriginalMember(owner = "client!uq", name = "bh", descriptor = "Lclient!cd;")
	public Class43 aClass43_16;

	@OriginalMember(owner = "client!uq", name = "ch", descriptor = "Z")
	public boolean aBoolean602;

	@OriginalMember(owner = "client!uq", name = "fh", descriptor = "I")
	private int anInt8464;

	@OriginalMember(owner = "client!uq", name = "gh", descriptor = "I")
	private int anInt8465;

	@OriginalMember(owner = "client!uq", name = "Ed", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!uq", name = "Wd", descriptor = "I")
	public int anInt8407 = 128;

	@OriginalMember(owner = "client!uq", name = "ie", descriptor = "Lclient!ow;")
	private final Class227 aClass227_1 = new Class227();

	@OriginalMember(owner = "client!uq", name = "me", descriptor = "Lclient!hba;")
	private final Class118_Sub1 aClass118_Sub1_1 = new Class118_Sub1();

	@OriginalMember(owner = "client!uq", name = "ne", descriptor = "Lclient!hba;")
	public final Class118_Sub1 aClass118_Sub1_2 = new Class118_Sub1();

	@OriginalMember(owner = "client!uq", name = "qe", descriptor = "I")
	public int anInt8420 = 8;

	@OriginalMember(owner = "client!uq", name = "re", descriptor = "I")
	public int anInt8421 = 3;

	@OriginalMember(owner = "client!uq", name = "ue", descriptor = "Z")
	private boolean aBoolean574 = false;

	@OriginalMember(owner = "client!uq", name = "te", descriptor = "Lclient!bv;")
	private final Class37 aClass37_91 = new Class37();

	@OriginalMember(owner = "client!uq", name = "ye", descriptor = "I")
	private int anInt8424 = -1;

	@OriginalMember(owner = "client!uq", name = "ve", descriptor = "[Lclient!ve;")
	private final Interface20[] anInterface20Array1 = new Interface20[4];

	@OriginalMember(owner = "client!uq", name = "we", descriptor = "I")
	private int anInt8422 = -1;

	@OriginalMember(owner = "client!uq", name = "Be", descriptor = "[Lclient!ve;")
	private final Interface20[] anInterface20Array3 = new Interface20[4];

	@OriginalMember(owner = "client!uq", name = "xe", descriptor = "I")
	private int anInt8423 = -1;

	@OriginalMember(owner = "client!uq", name = "Ae", descriptor = "[Lclient!ve;")
	private final Interface20[] anInterface20Array2 = new Interface20[4];

	@OriginalMember(owner = "client!uq", name = "Fe", descriptor = "Lclient!bv;")
	private final Class37 aClass37_92;

	@OriginalMember(owner = "client!uq", name = "He", descriptor = "Lclient!bv;")
	private final Class37 aClass37_93;

	@OriginalMember(owner = "client!uq", name = "Ie", descriptor = "Lclient!bv;")
	private final Class37 aClass37_94;

	@OriginalMember(owner = "client!uq", name = "Je", descriptor = "Lclient!bv;")
	private final Class37 aClass37_95;

	@OriginalMember(owner = "client!uq", name = "Ke", descriptor = "Lclient!bv;")
	private final Class37 aClass37_96;

	@OriginalMember(owner = "client!uq", name = "Le", descriptor = "Lclient!bv;")
	private final Class37 aClass37_97;

	@OriginalMember(owner = "client!uq", name = "Me", descriptor = "Lclient!bv;")
	private final Class37 aClass37_98;

	@OriginalMember(owner = "client!uq", name = "Oe", descriptor = "I")
	private int anInt8428;

	@OriginalMember(owner = "client!uq", name = "Pe", descriptor = "I")
	public int anInt8429;

	@OriginalMember(owner = "client!uq", name = "Ue", descriptor = "F")
	private float aFloat162;

	@OriginalMember(owner = "client!uq", name = "Qe", descriptor = "I")
	public int anInt8430;

	@OriginalMember(owner = "client!uq", name = "nf", descriptor = "F")
	private float aFloat167;

	@OriginalMember(owner = "client!uq", name = "af", descriptor = "I")
	public int anInt8432;

	@OriginalMember(owner = "client!uq", name = "rf", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!uq", name = "Ze", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!uq", name = "qf", descriptor = "I")
	private int anInt8436;

	@OriginalMember(owner = "client!uq", name = "Rf", descriptor = "I")
	public int anInt8445;

	@OriginalMember(owner = "client!uq", name = "lf", descriptor = "I")
	public int anInt8434;

	@OriginalMember(owner = "client!uq", name = "uf", descriptor = "I")
	private int anInt8437;

	@OriginalMember(owner = "client!uq", name = "Hf", descriptor = "I")
	private int anInt8441;

	@OriginalMember(owner = "client!uq", name = "Se", descriptor = "[F")
	private final float[] aFloatArray63;

	@OriginalMember(owner = "client!uq", name = "Ef", descriptor = "Z")
	private boolean aBoolean587;

	@OriginalMember(owner = "client!uq", name = "vf", descriptor = "I")
	public int anInt8438;

	@OriginalMember(owner = "client!uq", name = "ng", descriptor = "I")
	private int anInt8452;

	@OriginalMember(owner = "client!uq", name = "kg", descriptor = "F")
	private float aFloat173;

	@OriginalMember(owner = "client!uq", name = "qg", descriptor = "I")
	private int anInt8454;

	@OriginalMember(owner = "client!uq", name = "Jf", descriptor = "I")
	private int anInt8442;

	@OriginalMember(owner = "client!uq", name = "Wf", descriptor = "F")
	private float aFloat171;

	@OriginalMember(owner = "client!uq", name = "lg", descriptor = "[F")
	private final float[] aFloatArray66;

	@OriginalMember(owner = "client!uq", name = "Af", descriptor = "[F")
	private final float[] aFloatArray64;

	@OriginalMember(owner = "client!uq", name = "Ag", descriptor = "[Lclient!ww;")
	private final Class1_Sub2[] aClass1_Sub2Array6;

	@OriginalMember(owner = "client!uq", name = "hg", descriptor = "I")
	public int anInt8450;

	@OriginalMember(owner = "client!uq", name = "ig", descriptor = "I")
	private int anInt8451;

	@OriginalMember(owner = "client!uq", name = "Cg", descriptor = "I")
	public int anInt8457;

	@OriginalMember(owner = "client!uq", name = "vg", descriptor = "[F")
	private final float[] aFloatArray67;

	@OriginalMember(owner = "client!uq", name = "Ng", descriptor = "F")
	public float aFloat179;

	@OriginalMember(owner = "client!uq", name = "zg", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!uq", name = "Of", descriptor = "I")
	public int anInt8444;

	@OriginalMember(owner = "client!uq", name = "Wg", descriptor = "I")
	public int anInt8462;

	@OriginalMember(owner = "client!uq", name = "Tf", descriptor = "I")
	private int anInt8446;

	@OriginalMember(owner = "client!uq", name = "Fg", descriptor = "I")
	public int anInt8459;

	@OriginalMember(owner = "client!uq", name = "Vg", descriptor = "F")
	private float aFloat182;

	@OriginalMember(owner = "client!uq", name = "Rg", descriptor = "F")
	public float aFloat180;

	@OriginalMember(owner = "client!uq", name = "Yg", descriptor = "F")
	public float aFloat183;

	@OriginalMember(owner = "client!uq", name = "Zg", descriptor = "I")
	private int anInt8463;

	@OriginalMember(owner = "client!uq", name = "Sg", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!uq", name = "Xf", descriptor = "[F")
	public final float[] aFloatArray65;

	@OriginalMember(owner = "client!uq", name = "dh", descriptor = "F")
	private float aFloat184;

	@OriginalMember(owner = "client!uq", name = "Yf", descriptor = "Lclient!aw;")
	public Class1_Sub6_Sub1 aClass1_Sub6_Sub1_3;

	@OriginalMember(owner = "client!uq", name = "eh", descriptor = "[I")
	public int[] anIntArray765;

	@OriginalMember(owner = "client!uq", name = "hh", descriptor = "[I")
	public int[] anIntArray766;

	@OriginalMember(owner = "client!uq", name = "ih", descriptor = "[I")
	public int[] anIntArray767;

	@OriginalMember(owner = "client!uq", name = "jh", descriptor = "[B")
	public final byte[] aByteArray117;

	@OriginalMember(owner = "client!uq", name = "ec", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas13;

	@OriginalMember(owner = "client!uq", name = "xd", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas14;

	@OriginalMember(owner = "client!uq", name = "ee", descriptor = "I")
	public final int anInt8414;

	@OriginalMember(owner = "client!uq", name = "Cb", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!uq", name = "z", descriptor = "J")
	private final long aLong353;

	@OriginalMember(owner = "client!uq", name = "ob", descriptor = "J")
	private long aLong354;

	@OriginalMember(owner = "client!uq", name = "Ye", descriptor = "I")
	public final int anInt8431;

	@OriginalMember(owner = "client!uq", name = "sg", descriptor = "Z")
	public boolean aBoolean597;

	@OriginalMember(owner = "client!uq", name = "Ve", descriptor = "Z")
	public boolean aBoolean577;

	@OriginalMember(owner = "client!uq", name = "jf", descriptor = "Z")
	private boolean aBoolean580;

	@OriginalMember(owner = "client!uq", name = "hf", descriptor = "Z")
	public boolean aBoolean579;

	@OriginalMember(owner = "client!uq", name = "Og", descriptor = "Z")
	private boolean aBoolean599;

	@OriginalMember(owner = "client!uq", name = "sf", descriptor = "Z")
	public boolean aBoolean582;

	@OriginalMember(owner = "client!uq", name = "Xg", descriptor = "Z")
	public boolean aBoolean601;

	@OriginalMember(owner = "client!uq", name = "Mf", descriptor = "Z")
	private final boolean aBoolean588;

	@OriginalMember(owner = "client!uq", name = "je", descriptor = "Lclient!cea;")
	private final Class46 aClass46_1;

	@OriginalMember(owner = "client!uq", name = "pe", descriptor = "Lclient!wo;")
	public final Class315 aClass315_1;

	@OriginalMember(owner = "client!uq", name = "de", descriptor = "Lclient!bh;")
	private final Class26 aClass26_1;

	@OriginalMember(owner = "client!uq", name = "Sd", descriptor = "Lclient!os;")
	private Class1_Sub11_Sub1 aClass1_Sub11_Sub1_1;

	@OriginalMember(owner = "client!uq", name = "ke", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_1;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;I)V")
	public Class122_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class104();
		new Class17(16);
		this.aClass37_92 = new Class37();
		this.aClass37_93 = new Class37();
		this.aClass37_94 = new Class37();
		this.aClass37_95 = new Class37();
		this.aClass37_96 = new Class37();
		this.aClass37_97 = new Class37();
		this.aClass37_98 = new Class37();
		this.anInt8428 = 0;
		this.anInt8429 = 0;
		this.aFloat162 = 0.0F;
		this.anInt8430 = -1;
		this.aFloat167 = -1.0F;
		this.anInt8432 = -1;
		this.aFloat168 = 1.0F;
		this.aFloat165 = 1.0F;
		this.anInt8436 = 8448;
		this.anInt8445 = -1;
		this.anInt8434 = 3584;
		this.anInt8437 = 0;
		this.anInt8441 = -1;
		this.aFloatArray63 = new float[4];
		this.aBoolean587 = true;
		this.anInt8438 = 0;
		this.anInt8452 = 0;
		this.aFloat173 = 1.0F;
		this.anInt8454 = 0;
		this.anInt8442 = 8448;
		this.aFloat171 = 3000.0F;
		this.aFloatArray66 = new float[16];
		this.aFloatArray64 = new float[4];
		this.aClass1_Sub2Array6 = new Class1_Sub2[Static359.anInt6312];
		this.anInt8450 = 50;
		this.anInt8451 = 0;
		this.anInt8457 = 0;
		this.aFloatArray67 = new float[4];
		this.aFloat179 = -1.0F;
		this.aFloat175 = 1.0F;
		this.anInt8444 = 0;
		this.anInt8462 = 512;
		this.anInt8446 = -1;
		this.anInt8459 = 512;
		this.aFloat182 = -1.0F;
		this.aFloat180 = 3584.0F;
		this.aFloat183 = -1.0F;
		this.anInt8463 = 0;
		this.aFloat181 = 3584.0F;
		this.aFloatArray65 = new float[4];
		this.aFloat184 = 1.0F;
		this.aClass1_Sub6_Sub1_3 = new Class1_Sub6_Sub1(8192);
		this.anIntArray765 = new int[1];
		this.anIntArray766 = new int[1];
		this.anIntArray767 = new int[1];
		this.aByteArray117 = new byte[16384];
		this.aCanvas14 = this.aCanvas13 = arg0;
		this.anInt8414 = arg2;
		if (!Static193.method6050("jaclib")) {
			throw new RuntimeException("");
		} else if (Static193.method6050("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong354 = this.aLong353 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt8414);
				if (this.aLong353 == 0L) {
					throw new RuntimeException("");
				}
				this.method6877();
				@Pc(320) int local320 = this.method6852();
				if (local320 != 0) {
					throw new RuntimeException("");
				}
				this.anInt8431 = this.aBoolean594 ? 33639 : 5121;
				@Pc(343) int local343;
				if (this.aString78.indexOf("radeon") != -1) {
					local343 = 0;
					@Pc(345) boolean local345 = false;
					@Pc(347) boolean local347 = false;
					@Pc(356) String[] local356 = Static254.method4297(' ', this.aString78.replace('/', ' '));
					for (@Pc(358) int local358 = 0; local358 < local356.length; local358++) {
						@Pc(364) String local364 = local356[local358];
						try {
							if (local364.length() > 0) {
								if (local364.charAt(0) == 'x' && local364.length() >= 3 && Static328.method5048(local364.substring(1, 3))) {
									local347 = true;
									local364 = local364.substring(1);
								}
								if (local364.equals("hd")) {
									local345 = true;
								} else {
									if (local364.startsWith("hd")) {
										local364 = local364.substring(2);
										local345 = true;
									}
									if (local364.length() >= 4 && Static328.method5048(local364.substring(0, 4))) {
										local343 = Static197.method7005(local364.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(430) Exception local430) {
						}
					}
					if (!local345 || local343 < 4000) {
						this.aBoolean597 = false;
					}
					if (!local347 && !local345) {
						if (local343 >= 7000 && local343 <= 9250) {
							this.aBoolean577 = false;
						}
						if (local343 >= 7000 && local343 <= 7999) {
							this.aBoolean580 = false;
						}
					}
					this.aBoolean579 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean599 = this.aBoolean580;
					this.aBoolean582 = true;
				}
				if (this.aString77.indexOf("intel") != -1) {
					this.aBoolean601 = false;
				}
				this.aBoolean588 = !this.aString77.equals("s3 graphics");
				if (this.aBoolean580) {
					try {
						@Pc(511) int[] local511 = new int[1];
						OpenGL.glGenBuffersARB(1, local511, 0);
					} catch (@Pc(517) Throwable local517) {
						throw new RuntimeException("");
					}
				}
				Static20.method500(true, false);
				this.aBoolean574 = true;
				this.aClass46_1 = new Class46(this, super.anInterface8_14);
				this.method6870();
				this.aClass315_1 = new Class315(this);
				this.aClass26_1 = new Class26(this);
				if (this.aClass26_1.method895()) {
					this.aClass1_Sub11_Sub1_1 = new Class1_Sub11_Sub1(this);
					if (!this.aClass1_Sub11_Sub1_1.method5304()) {
						this.aClass1_Sub11_Sub1_1.method5293();
						this.aClass1_Sub11_Sub1_1 = null;
					}
				}
				this.aClass288_1 = new Class288(this);
				this.method6898();
				this.method6855();
				OpenGL.glClear(16640);
				local343 = 0;
				while (true) {
					try {
						this.anOpenGL2.swapBuffers();
						break;
					} catch (@Pc(596) Exception local596) {
						if (local343++ > 5) {
							throw new RuntimeException("");
						}
						Static209.method3565(100L);
					}
				}
				OpenGL.glClear(16384);
			} catch (@Pc(614) Throwable local614) {
				local614.printStackTrace();
				this.method7245();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "()Z")
	@Override
	public boolean method7248() {
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "(I)V")
	public void method6849() {
		if (this.anInt8455 == 4) {
			return;
		}
		this.method6857();
		this.method6928(false);
		this.method6896(false);
		this.method6916(false);
		this.method6915(false);
		this.method6926(-2);
		this.method6871(1);
		this.anInt8455 = 4;
	}

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt8446;
		if (local11 || arg1 != this.aFloat183 || this.aFloat179 != arg2) {
			this.aFloat179 = arg2;
			this.aFloat183 = arg1;
			this.anInt8446 = arg0;
			if (local11) {
				this.aFloat168 = (float) (this.anInt8446 & 0xFF) / 255.0F;
				this.aFloat165 = (float) (this.anInt8446 & 0xFF00) / 65280.0F;
				this.aFloat175 = (float) (this.anInt8446 & 0xFF0000) / 1.671168E7F;
				this.method6922();
			}
			this.method6910();
		}
		if (arg3 == this.aFloatArray64[0] && arg4 == this.aFloatArray64[1] && this.aFloatArray64[2] == arg5) {
			return;
		}
		this.aFloatArray64[2] = arg5;
		this.aFloatArray64[1] = arg4;
		this.aFloatArray64[0] = arg3;
		this.aFloatArray67[2] = -arg5;
		this.aFloatArray67[0] = -arg3;
		this.aFloatArray67[1] = -arg4;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray65[2] = arg5 * local138;
		this.aFloatArray65[0] = local138 * arg3;
		this.aFloatArray65[1] = arg4 * local138;
		this.aFloatArray63[0] = -this.aFloatArray65[0];
		this.aFloatArray63[2] = -this.aFloatArray65[2];
		this.aFloatArray63[1] = -this.aFloatArray65[1];
		this.method6859();
		this.anInt8460 = (int) (arg5 * 256.0F / arg4);
		this.anInt8439 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!ea;I)V")
	public void method6850(@OriginalArg(0) Class73 arg0) {
		@Pc(11) Class73 local11 = this.aClass73Array1[this.anInt8458];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt7616);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt7616);
				} else if (arg0.anInt7616 != local11.anInt7616) {
					OpenGL.glDisable(local11.anInt7616);
					OpenGL.glEnable(arg0.anInt7616);
				}
				OpenGL.glBindTexture(arg0.anInt7616, arg0.method6357());
			}
			this.aClass73Array1[this.anInt8458] = arg0;
		}
		this.anInt8455 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(II)V")
	public void method6851(@OriginalArg(0) int arg0) {
		Static493.aFloatArray62[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static493.aFloatArray62[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static493.aFloatArray62[3] = (float) (arg0 >>> 24) / 255.0F;
		Static493.aFloatArray62[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static493.aFloatArray62, 0);
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6921();
		this.method6871(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(24) float local24 = (float) -arg1 + (float) arg3;
		@Pc(37) float local37 = (float) (1.0D / Math.sqrt((double) (local24 * local24 + local17 * local17)));
		@Pc(41) float local41 = local17 * local37;
		@Pc(45) float local45 = local24 * local37;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local41 + (float) arg2 + 0.35F, (float) arg3 + local45 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "(I)I")
	private int method6852() {
		@Pc(5) int local5 = 0;
		this.aString77 = OpenGL.glGetString(7936).toLowerCase();
		this.aString78 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString77.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString77.indexOf("brian paul") != -1 || this.aString77.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(52) String[] local52 = Static254.method4297(' ', local44.replace('.', ' '));
		if (local52.length >= 2) {
			try {
				@Pc(64) int local64 = Static197.method7005(local52[0]);
				@Pc(70) int local70 = Static197.method7005(local52[1]);
				this.anInt8440 = local64 * 10 + local70;
			} catch (@Pc(79) NumberFormatException local79) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt8440 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(118) int[] local118 = new int[1];
		OpenGL.glGetIntegerv(34018, local118, 0);
		this.bf = local118[0];
		OpenGL.glGetIntegerv(34929, local118, 0);
		this.anInt8435 = local118[0];
		OpenGL.glGetIntegerv(34930, local118, 0);
		this.anInt8433 = local118[0];
		if (this.bf < 2 || this.anInt8435 < 2 || this.anInt8433 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean594 = Stream.c();
		this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean580 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean585 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean591 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean595 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean589 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean577 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean579 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean581 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean597 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean575 = false;
		this.aBoolean601 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean602 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean593 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean583 = this.aBoolean602 & this.aBoolean593;
		OpenGL.glGetFloatv(2834, Static493.aFloatArray62, 0);
		this.aFloat182 = Static493.aFloatArray62[1];
		this.aFloat167 = Static493.aFloatArray62[0];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)V")
	public void method6853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt8458 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(19) boolean local19 = false;
		if (arg0 != this.anInt8442) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local19 = true;
			this.anInt8442 = arg0;
		}
		if (arg1 != this.anInt8436) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt8436 = arg1;
			local19 = true;
		}
		if (local19) {
			this.anInt8455 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "()Lclient!m;")
	@Override
	public Class118 method7256() {
		return this.aClass118_Sub1_1;
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(Z)V")
	private void method6855() {
		if (this.aCanvas14 == null) {
			this.anInt8321 = this.anInt8305 = 0;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas14.getSize();
			this.anInt8305 = local6.height;
			this.anInt8321 = local6.width;
		}
		if (this.anInterface20_2 == null) {
			this.anInt8314 = this.anInt8321;
			this.anInt8238 = this.anInt8305;
			this.method6872();
		}
		this.method6881();
		this.n();
	}

	@OriginalMember(owner = "client!uq", name = "CA", descriptor = "()I")
	@Override
	public int CA() {
		return this.anInt8434;
	}

	@OriginalMember(owner = "client!uq", name = "A", descriptor = "()Lclient!qf;")
	@Override
	public Class246 method7276() {
		@Pc(7) int local7 = -1;
		if (this.aString77.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString77.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString77.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class246(local7, "OpenGL", this.anInt8440, this.aString78, 0L);
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "(I)V")
	@Override
	public void method7239(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "(I)V")
	private void method6856() {
		this.anOpenGL2.a();
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(Z)V")
	private void method6857() {
		if (this.anInt8456 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt8314 > 0 && this.anInt8238 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt8314, (double) this.anInt8238, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt8455 &= 0xFFFFFFE7;
		this.anInt8456 = 1;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)V")
	private void method6858() {
		if (this.aFloat166 == 0.0F) {
			this.aFloatArray66[10] = this.aFloat176;
			this.aFloatArray66[14] = this.aFloat163;
		} else {
			@Pc(31) float local31 = this.aFloat171 / (this.aFloat171 + this.aFloat166);
			@Pc(35) float local35 = local31 * local31;
			@Pc(51) float local51 = -this.aFloat163 * (1.0F - local31) * (1.0F - local31) / this.aFloat166;
			this.aFloatArray66[10] = local51 + this.aFloat176;
			this.aFloatArray66[14] = local35 * this.aFloat163;
		}
		this.aFloat180 = ((float) -this.anInt8434 + this.aFloatArray66[14]) / this.aFloatArray66[10];
		this.aFloat181 = (float) this.anInt8434 - this.aFloat166;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
	@Override
	public void method7210(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt8407 = arg0;
		this.aClass46_1.method1118();
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "()Z")
	@Override
	public boolean method7221() {
		return this.aClass288_1.method6621();
	}

	@OriginalMember(owner = "client!uq", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		this.method6871(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "(I)V")
	public void method6859() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray65, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray63, 0);
	}

	@OriginalMember(owner = "client!uq", name = "la", descriptor = "(FF)V")
	@Override
	public void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat171 && this.aFloat166 == arg1) {
			return;
		}
		this.aFloat166 = arg1;
		this.aFloat171 = arg0;
		this.method6858();
		if (this.anInt8456 == 3) {
			this.method6867();
		} else if (this.anInt8456 == 2) {
			this.method6885();
			return;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class205 method7219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class205_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)V")
	private void method6860() {
		if (this.anInt8452 >= this.anInt8463 && this.anInt8437 <= this.anInt8454) {
			OpenGL.glScissor(this.anInt8428 + this.anInt8463, -this.anInt8454 + this.anInt8451 + this.anInt8238, this.anInt8452 - this.anInt8463, -this.anInt8437 + this.anInt8454);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(FIF)V")
	public void method6861(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat184 = arg0;
		this.aFloat162 = arg1;
		if (!this.aBoolean598) {
			this.method6917();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!hba;)V")
	public void method6862(@OriginalArg(1) Class118_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method2637(), 0);
	}

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "()F")
	public float method6863() {
		return this.aFloat166;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!rn;)V")
	@Override
	public void method7230(@OriginalArg(0) Class45 arg0) {
		this.aClass45_Sub2_1 = (Class45_Sub2) arg0;
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "(Z)V")
	public void method6864() {
		if (this.anInt8455 == 2) {
			return;
		}
		this.method6857();
		this.method6928(false);
		this.method6896(false);
		this.method6916(false);
		this.method6915(false);
		this.method6926(-2);
		this.anInt8455 = 2;
	}

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "()V")
	@Override
	public void method7238() {
		if (!this.aBoolean588 || this.anInt8314 <= 0 || this.anInt8238 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt8463;
		@Pc(25) int local25 = this.anInt8452;
		@Pc(28) int local28 = this.anInt8437;
		@Pc(31) int local31 = this.anInt8454;
		this.n();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6881();
		this.method6928(false);
		this.method6896(false);
		this.method6916(false);
		this.method6915(false);
		this.method6850(null);
		this.method6926(-2);
		this.method6875(1);
		this.method6871(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt8314, this.anInt8238, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.N(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method7250(@OriginalArg(0) Class118 arg0) {
		this.aClass118_Sub1_4 = (Class118_Sub1) arg0;
		this.aClass118_Sub1_3.method2638(this.aClass118_Sub1_4);
		if (this.anInt8456 != 1) {
			this.method6897();
		}
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(II)I")
	public int method6866(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!uq", name = "D", descriptor = "()V")
	@Override
	public void method7284() {
		this.method6915(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "(I)V")
	private void method6867() {
		@Pc(15) float local15 = (float) -this.anInt8438 * this.aFloat173 / (float) this.anInt8462;
		@Pc(35) float local35 = (float) -this.anInt8429 * this.aFloat173 / (float) this.anInt8459;
		@Pc(50) float local50 = (float) (this.anInt8314 - this.anInt8438) * this.aFloat173 / (float) this.anInt8462;
		@Pc(65) float local65 = (float) (this.anInt8238 - this.anInt8429) * this.aFloat173 / (float) this.anInt8459;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local50 != local15 && local35 != local65) {
			OpenGL.glOrtho((double) local15, (double) local50, (double) -local65, (double) -local35, (double) ((float) this.anInt8450 - this.aFloat166), (double) ((float) this.anInt8434 - this.aFloat166));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(B)V")
	private void method6868() {
		if (this.aBoolean592 && this.anInt8430 >= 0 | this.aBoolean598) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!uq", name = "A", descriptor = "(IIIII)V")
	@Override
	protected void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt8463 || arg0 - arg2 > this.anInt8452 || arg2 + arg1 < this.anInt8437 || this.anInt8454 < arg1 - arg2) {
			return;
		}
		this.method6921();
		this.method6871(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(76) float local76 = (float) arg0 + 0.35F;
		@Pc(81) float local81 = (float) arg1 + 0.35F;
		@Pc(85) int local85 = arg2 << 1;
		if ((float) local85 < this.aFloat167) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local76 + 1.0F, local81 + 1.0F);
			OpenGL.glVertex2f(local76 + 1.0F, -1.0F + local81);
			OpenGL.glVertex2f(local76 - 1.0F, -1.0F + local81);
			OpenGL.glVertex2f(local76 - 1.0F, local81 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local85 <= this.aFloat182) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local85);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local76, local81);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local76, local81);
			@Pc(154) int local154 = 262144 / (arg2 * 6);
			if (local154 <= 64) {
				local154 = 64;
			} else if (local154 > 512) {
				local154 = 512;
			}
			local154 = Static59.method1111(local154);
			OpenGL.glVertex2f(local76 + (float) arg2, local81);
			for (@Pc(183) int local183 = 16384 - local154; local183 > 0; local183 -= local154) {
				OpenGL.glVertex2f(local76 + (float) arg2 * Class1_Sub3_Sub37.aFloatArray59[local183], local81 + (float) arg2 * Class1_Sub3_Sub37.aFloatArray58[local183]);
			}
			OpenGL.glVertex2f((float) arg2 + local76, local81);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!ve;Z)V")
	public void method6869(@OriginalArg(0) Interface20 arg0) {
		if (this.anInt8423 < 0 || arg0 != this.anInterface20Array3[this.anInt8423]) {
			throw new RuntimeException();
		}
		this.anInterface20Array3[this.anInt8423--] = null;
		arg0.method7344();
		if (this.anInt8423 >= 0) {
			this.anInterface20_2 = this.anInterface20Array3[this.anInt8423];
			this.anInterface20_2.method7342();
		} else {
			this.anInterface20_2 = null;
		}
	}

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public Class1_Sub8 method7263(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub8_Sub1 local8 = new Class1_Sub8_Sub1(arg0);
		this.aClass37_91.method970(local8);
		return local8;
	}

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "(I)V")
	private void method6870() {
		this.aClass118_Sub1_4 = new Class118_Sub1();
		this.aClass118_Sub1_3 = new Class118_Sub1();
		this.aClass73Array1 = new Class73[this.bf];
		this.aClass73_Sub1_5 = new Class73_Sub1(this, 3553, 6408, 1, 1);
		new Class73_Sub1(this, 3553, 6408, 1, 1);
		new Class73_Sub1(this, 3553, 6408, 1, 1);
		this.aClass145_Sub2_3 = new Class145_Sub2(this);
		this.aClass145_Sub2_1 = new Class145_Sub2(this);
		this.aClass145_Sub2_10 = new Class145_Sub2(this);
		this.aClass145_Sub2_6 = new Class145_Sub2(this);
		this.aClass145_Sub2_4 = new Class145_Sub2(this);
		this.aClass145_Sub2_2 = new Class145_Sub2(this);
		this.aClass145_Sub2_5 = new Class145_Sub2(this);
		this.aClass145_Sub2_9 = new Class145_Sub2(this);
		this.aClass145_Sub2_8 = new Class145_Sub2(this);
		this.aClass145_Sub2_7 = new Class145_Sub2(this);
		if (this.aBoolean601) {
			this.aClass311_6 = new Class311(this);
			new Class311(this);
		}
	}

	@OriginalMember(owner = "client!uq", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		@Pc(6) int local6 = this.anInt8464;
		this.anInt8464 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "(II)V")
	public void method6871(@OriginalArg(1) int arg0) {
		if (this.anInt8453 == arg0) {
			return;
		}
		@Pc(26) boolean local26;
		@Pc(28) byte local28;
		if (arg0 == 1) {
			local28 = 1;
			local26 = true;
		} else if (arg0 == 2) {
			local28 = 2;
			local26 = false;
		} else if (arg0 == 128) {
			local26 = true;
			local28 = 3;
		} else {
			local28 = 0;
			local26 = false;
		}
		if (!this.aBoolean596) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean596 = true;
		}
		if (this.aBoolean576 != local26) {
			if (local26) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean576 = local26;
		}
		if (local28 != this.anInt8461) {
			if (local28 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local28 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local28 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt8461 = local28;
		}
		this.anInt8453 = arg0;
		this.anInt8455 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "()Z")
	@Override
	public boolean method7218() {
		if (this.aClass1_Sub11_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass1_Sub11_Sub1_1.method5296()) {
			if (!this.aClass26_1.method894(this.aClass1_Sub11_Sub1_1)) {
				return false;
			}
			this.aClass46_1.method1118();
		}
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "(I)V")
	private void method6872() {
		OpenGL.glViewport(this.anInt8428, this.anInt8451, this.anInt8314, this.anInt8238);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IF)V")
	public void method6873(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat173) {
			this.aFloat173 = arg0;
			if (this.anInt8456 == 3) {
				this.method6867();
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(FFIF)V")
	private void method6874(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean590) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean590 = true;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method7229(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aNativeHeap5 = ((Class1_Sub8_Sub1) arg0).aNativeHeap1;
		if (this.anInterface2_6 != null) {
			return;
		}
		@Pc(16) Class1_Sub6_Sub1 local16 = new Class1_Sub6_Sub1(80);
		if (this.aBoolean594) {
			local16.method726(-1.0F);
			local16.method726(-1.0F);
			local16.method726(0.0F);
			local16.method726(0.0F);
			local16.method726(1.0F);
			local16.method726(1.0F);
			local16.method726(-1.0F);
			local16.method726(0.0F);
			local16.method726(1.0F);
			local16.method726(1.0F);
			local16.method726(1.0F);
			local16.method726(1.0F);
			local16.method726(0.0F);
			local16.method726(1.0F);
			local16.method726(0.0F);
			local16.method726(-1.0F);
			local16.method726(1.0F);
			local16.method726(0.0F);
			local16.method726(0.0F);
			local16.method726(0.0F);
		} else {
			local16.method724(-1.0F);
			local16.method724(-1.0F);
			local16.method724(0.0F);
			local16.method724(0.0F);
			local16.method724(1.0F);
			local16.method724(1.0F);
			local16.method724(-1.0F);
			local16.method724(0.0F);
			local16.method724(1.0F);
			local16.method724(1.0F);
			local16.method724(1.0F);
			local16.method724(1.0F);
			local16.method724(0.0F);
			local16.method724(1.0F);
			local16.method724(0.0F);
			local16.method724(-1.0F);
			local16.method724(1.0F);
			local16.method724(0.0F);
			local16.method724(0.0F);
			local16.method724(0.0F);
		}
		this.anInterface2_6 = this.method6892(local16.aByteArray66, 20, false, local16.anInt4555);
		this.aClass43_15 = new Class43(this.anInterface2_6, 5126, 3, 0);
		this.aClass43_16 = new Class43(this.anInterface2_6, 5126, 2, 12);
		this.aClass227_1.method5335(this);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public Class2 method7261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class2_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!uq", name = "B", descriptor = "()Z")
	@Override
	public boolean method7279() {
		return this.aBoolean585 && (!this.method7215() || this.aBoolean583);
	}

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "(II)V")
	public void method6875(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method6853(7681, 7681);
		} else if (arg0 == 0) {
			this.method6853(8448, 8448);
		} else if (arg0 == 2) {
			this.method6853(34165, 7681);
		} else if (arg0 == 3) {
			this.method6853(260, 8448);
		} else if (arg0 == 4) {
			this.method6853(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "(I)V")
	private void method6876() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt8448; local7++) {
			@Pc(20) Class1_Sub2 local20 = this.aClass1_Sub2Array6[local7];
			Static330.aFloatArray41[0] = local20.method2426();
			@Pc(31) int local31 = local7 + 16386;
			Static330.aFloatArray41[1] = local20.method2428();
			Static330.aFloatArray41[2] = local20.method2427();
			Static330.aFloatArray41[3] = 1.0F;
			OpenGL.glLightfv(local31, 4611, Static330.aFloatArray41, 0);
			@Pc(58) int local58 = local20.method2432();
			@Pc(66) float local66 = local20.method2436() / 255.0F;
			Static330.aFloatArray41[2] = (float) (local58 & 0xFF) * local66;
			Static330.aFloatArray41[1] = local66 * (float) (local58 >> 8 & 0xFF);
			Static330.aFloatArray41[0] = (float) (local58 >> 16 & 0xFF) * local66;
			OpenGL.glLightfv(local31, 4609, Static330.aFloatArray41, 0);
			OpenGL.glLightf(local31, 4617, 1.0F / (float) (local20.method2434() * local20.method2434()));
			OpenGL.glEnable(local31);
		}
		while (this.anInt8443 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt8443 = this.anInt8448;
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(B)V")
	private void method6877() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL2.b()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static209.method3565(1000L);
		}
	}

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "()Z")
	@Override
	public boolean method7258() {
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIZ)V")
	public synchronized void method6878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class1_Sub9 local14 = new Class1_Sub9(arg0);
		local14.aLong392 = arg1;
		this.aClass37_94.method970(local14);
	}

	@OriginalMember(owner = "client!uq", name = "y", descriptor = "()V")
	@Override
	public void method7269() {
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7277(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static413.aFloat143 = arg0;
		Static295.aFloat112 = arg1;
		Static499.aFloat161 = arg2;
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method6921();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method6871(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean585) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean585) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBZ)V")
	public void method6879(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method6888(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "(Z)V")
	public void method6880() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7252() {
		this.method6921();
		this.method6871(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!uq", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class40_Sub2 local6 = (Class40_Sub2) arg1;
		@Pc(9) Class73_Sub1_Sub1 local9 = local6.aClass73_Sub1_Sub1_3;
		this.method6864();
		this.method6850(local6.aClass73_Sub1_Sub1_3);
		this.method6871(1);
		this.method6853(7681, 8448);
		this.method6899(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat21 / (float) local9.anInt2345;
		@Pc(46) float local46 = local9.aFloat20 / (float) local9.anInt2344;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt8463 - arg2) * local39, (float) (this.anInt8437 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8463, this.anInt8437);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8463 - arg2), (float) (this.anInt8454 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8463, this.anInt8454);
		OpenGL.glTexCoord2f((float) (this.anInt8452 - arg2) * local39, (float) (this.anInt8454 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8452, this.anInt8454);
		OpenGL.glTexCoord2f((float) (this.anInt8452 - arg2) * local39, (float) (this.anInt8437 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8452, this.anInt8437);
		OpenGL.glEnd();
		this.method6899(768, 0, 5890);
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(IIIII)V")
	@Override
	public void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6921();
		this.method6871(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass26_1.method888(arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "(I)V")
	public void method6881() {
		if (this.anInt8456 != 0) {
			this.anInt8456 = 0;
			this.anInt8455 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "(II)V")
	public synchronized void method6882(@OriginalArg(1) int arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong392 = arg0;
		this.aClass37_97.method970(local7);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLclient!ve;)V")
	public void method6883(@OriginalArg(1) Interface20 arg0) {
		if (this.aBoolean602) {
			this.method6934(arg0);
			this.method6869(arg0);
		} else if (this.anInt8422 >= 0 && arg0 == this.anInterface20Array1[this.anInt8422]) {
			this.anInterface20Array1[this.anInt8422--] = null;
			arg0.method7346();
			if (this.anInt8422 >= 0) {
				this.anInterface20_1 = this.anInterface20_2 = this.anInterface20Array1[this.anInt8422];
				this.anInterface20_1.method7345();
			} else {
				this.anInterface20_1 = this.anInterface20_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!ve;I)V")
	public void method6884(@OriginalArg(0) Interface20 arg0) {
		if (this.aBoolean602) {
			this.method6903(arg0);
			this.method6923(arg0);
		} else if (this.anInt8422 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt8422 >= 0) {
				this.anInterface20Array1[this.anInt8422].method7346();
			}
			this.anInterface20_1 = this.anInterface20_2 = this.anInterface20Array1[++this.anInt8422] = arg0;
			this.anInterface20_1.method7345();
		}
	}

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "(Z)V")
	private void method6885() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray66, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(IIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8462 = arg2;
		this.anInt8459 = arg3;
		this.anInt8429 = arg1;
		this.anInt8438 = arg0;
		this.method6925();
		this.method6919();
		if (this.anInt8456 == 3) {
			this.method6867();
		} else if (this.anInt8456 == 2) {
			this.method6885();
			return;
		}
	}

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "(II)I")
	public int method6886(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(FFFFI)V")
	public void method6887(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static493.aFloatArray62[2] = arg3;
		Static493.aFloatArray62[3] = arg2;
		Static493.aFloatArray62[0] = arg0;
		Static493.aFloatArray62[1] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static493.aFloatArray62, 0);
	}

	@OriginalMember(owner = "client!uq", name = "z", descriptor = "()Lclient!m;")
	@Override
	public Class118 method7275() {
		return new Class118_Sub1();
	}

	@OriginalMember(owner = "client!uq", name = "C", descriptor = "()V")
	@Override
	public void method7281() {
		if (this.aClass1_Sub11_Sub1_1 != null && this.aClass1_Sub11_Sub1_1.method5296()) {
			this.aClass26_1.method891(this.aClass1_Sub11_Sub1_1);
			this.aClass46_1.method1118();
		}
	}

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "()Z")
	@Override
	public boolean method7244() {
		return this.aClass1_Sub11_Sub1_1 != null && (this.anInt8414 <= 1 || this.aBoolean583);
	}

	@OriginalMember(owner = "client!uq", name = "E", descriptor = "(III)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt8432 && arg1 == this.anInt8430 && this.anInt8444 == arg2) {
			return;
		}
		this.anInt8432 = arg0;
		this.anInt8430 = arg1;
		this.anInt8444 = arg2;
		if (this.aBoolean598) {
			return;
		}
		this.method6917();
		this.method6868();
	}

	@OriginalMember(owner = "client!uq", name = "N", descriptor = "(IIII)V")
	@Override
	public void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt8314 < arg2) {
			arg2 = this.anInt8314;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt8238) {
			arg3 = this.anInt8238;
		}
		this.anInt8454 = arg3;
		this.anInt8452 = arg2;
		this.anInt8463 = arg0;
		this.anInt8437 = arg1;
		OpenGL.glEnable(3089);
		this.method6919();
		this.method6860();
	}

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "()Z")
	@Override
	public boolean method7254() {
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method7234(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class1_Sub9 local19;
		while (!this.aClass37_93.method968()) {
			local19 = (Class1_Sub9) this.aClass37_93.method973();
			Static485.anIntArray750[local11++] = (int) local19.aLong392;
			this.anInt8427 -= local19.anInt1173;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static485.anIntArray750, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static485.anIntArray750, 0);
			local11 = 0;
		}
		while (!this.aClass37_94.method968()) {
			local19 = (Class1_Sub9) this.aClass37_94.method973();
			Static485.anIntArray750[local11++] = (int) local19.aLong392;
			this.anInt8426 -= local19.anInt1173;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static485.anIntArray750, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static485.anIntArray750, 0);
			local11 = 0;
		}
		while (!this.aClass37_95.method968()) {
			local19 = (Class1_Sub9) this.aClass37_95.method973();
			Static485.anIntArray750[local11++] = local19.anInt1173;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static485.anIntArray750, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static485.anIntArray750, 0);
			local11 = 0;
		}
		while (!this.aClass37_96.method968()) {
			local19 = (Class1_Sub9) this.aClass37_96.method973();
			Static485.anIntArray750[local11++] = (int) local19.aLong392;
			this.anInt8425 -= local19.anInt1173;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static485.anIntArray750, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static485.anIntArray750, 0);
		}
		while (!this.aClass37_92.method968()) {
			local19 = (Class1_Sub9) this.aClass37_92.method973();
			OpenGL.glDeleteLists((int) local19.aLong392, local19.anInt1173);
		}
		@Pc(213) Class1 local213;
		while (!this.aClass37_97.method968()) {
			local213 = this.aClass37_97.method973();
			OpenGL.glDeleteProgramARB((int) local213.aLong392);
		}
		while (!this.aClass37_98.method968()) {
			local213 = this.aClass37_98.method973();
			OpenGL.glDeleteObjectARB(local213.aLong392);
		}
		while (!this.aClass37_92.method968()) {
			local19 = (Class1_Sub9) this.aClass37_92.method973();
			OpenGL.glDeleteLists((int) local19.aLong392, local19.anInt1173);
		}
		this.aClass46_1.method1116();
		if (this.U() > 100663296 && this.aLong355 + 60000L < Static60.method1119()) {
			System.gc();
			this.aLong355 = Static60.method1119();
		}
		this.anInt8419 = local9;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZIZ)V")
	public void method6888(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt8449) {
			if (arg0 < 0) {
				this.method6902();
				this.method6850(null);
				this.method6875(0);
				if (!this.aBoolean598) {
					this.aClass288_1.method6623(arg2, arg1, 0, 0, 0);
				}
			} else {
				@Pc(24) Class73_Sub1 local24 = this.aClass46_1.method1117(arg0);
				@Pc(30) Class220 local30 = super.anInterface8_14.method878(arg0);
				if (local30.aByte82 == 0 && local30.aByte85 == 0) {
					this.method6902();
				} else {
					@Pc(51) int local51 = local30.aBoolean451 ? 64 : 128;
					@Pc(55) int local55 = local51 * 50;
					this.method6874((float) (local30.aByte82 * (this.anInt8419 % local55)) / (float) local55, (float) (local30.aByte85 * (this.anInt8419 % local55)) / (float) local55, 0.0F);
				}
				if (this.aBoolean598) {
					this.method6850(local24);
					this.method6875(local30.anInt6250);
				} else {
					this.aClass288_1.method6623(arg2, arg1, local30.anInt6249, local30.aByte87, local30.aByte86);
					if (!this.aClass288_1.method6622(local30.anInt6250, local24)) {
						this.method6850(local24);
						this.method6875(local30.anInt6250);
					}
				}
			}
			this.anInt8449 = arg0;
		}
		this.anInt8455 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIILclient!nu;I)V")
	public void method6889(@OriginalArg(0) int arg0, @OriginalArg(3) Interface10 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg1.method6548();
		@Pc(14) int local14 = arg2 * this.method6894(local7);
		this.method6914(arg1);
		OpenGL.glDrawElements(4, arg0, local7, arg1.method6549() + (long) local14);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!cd;ILclient!cd;Lclient!cd;Lclient!cd;)V")
	public void method6890(@OriginalArg(0) Class43 arg0, @OriginalArg(2) Class43 arg1, @OriginalArg(3) Class43 arg2, @OriginalArg(4) Class43 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6893(arg1.anInterface2_1);
			OpenGL.glVertexPointer(arg1.aByte8, arg1.aShort1, this.anInterface2_7.method4389(), this.anInterface2_7.method4391() + (long) arg1.aByte7);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6893(arg2.anInterface2_1);
			OpenGL.glNormalPointer(arg2.aShort1, this.anInterface2_7.method4389(), this.anInterface2_7.method4391() + (long) arg2.aByte7);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6893(arg3.anInterface2_1);
			OpenGL.glColorPointer(arg3.aByte8, arg3.aShort1, this.anInterface2_7.method4389(), this.anInterface2_7.method4391() + (long) arg3.aByte7);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6893(arg0.anInterface2_1);
			OpenGL.glTexCoordPointer(arg0.aByte8, arg0.aShort1, this.anInterface2_7.method4389(), this.anInterface2_7.method4391() + (long) arg0.aByte7);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!uq", name = "ta", descriptor = "(II)V")
	@Override
	public void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt8450 && this.anInt8434 == arg1) {
			return;
		}
		this.anInt8434 = arg1;
		this.anInt8450 = arg0;
		this.method6925();
		this.method6917();
		if (this.anInt8456 == 3) {
			this.method6867();
		} else if (this.anInt8456 == 2) {
			this.method6885();
		}
	}

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "(Z)V")
	public void method6891() {
		if (this.anInt8455 == 8) {
			return;
		}
		this.method6905();
		this.method6928(true);
		this.method6916(true);
		this.method6915(true);
		this.method6871(1);
		this.anInt8455 = 8;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[BIZI)Lclient!ee;")
	public Interface2 method6892(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		return (Interface2) (this.aBoolean580 && (!arg2 || this.aBoolean599) ? new Class148_Sub1(this, arg1, arg0, arg3, arg2) : new Class33_Sub1(this, arg1, arg0, arg3));
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[Lclient!ww;)V")
	@Override
	public void method7264(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass1_Sub2Array6[local3] = arg1[local3];
		}
		this.anInt8448 = arg0;
		if (this.anInt8456 != 1) {
			this.method6876();
		}
	}

	@OriginalMember(owner = "client!uq", name = "UA", descriptor = "(IIIII)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6921();
		this.method6871(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLclient!ee;)V")
	public void method6893(@OriginalArg(1) Interface2 arg0) {
		if (this.anInterface2_7 != arg0) {
			if (this.aBoolean580) {
				OpenGL.glBindBufferARB(34962, arg0.method4392());
			}
			this.anInterface2_7 = arg0;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)I")
	public int method6894(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(Z)V")
	@Override
	public void method7272(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "([I)V")
	@Override
	public void d(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt8454;
		arg0[2] = this.anInt8452;
		arg0[0] = this.anInt8463;
		arg0[1] = this.anInt8437;
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "(B)Lclient!sk;")
	public Class73_Sub4 method6895() {
		return this.aClass45_Sub2_1 == null ? null : this.aClass45_Sub2_1.method6134();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
	@Override
	public void method7260(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BZ)V")
	public void method6896(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean584) {
			this.aBoolean584 = arg0;
			this.method6909();
			this.anInt8455 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "(B)V")
	private void method6897() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass118_Sub1_4.method2637(), 0);
		if (this.aBoolean598) {
			this.aClass288_1.aClass13_Sub9_1.method6734();
		}
		this.method6859();
		this.method6876();
	}

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "(B)V")
	private void method6898() {
		this.method6926(-2);
		for (@Pc(14) int local14 = this.bf - 1; local14 >= 0; local14--) {
			this.method6932(local14);
			this.method6850(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6853(8448, 8448);
		this.method6899(770, 2, 34168);
		this.method6902();
		this.anInt8453 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt8461 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean576 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean596 = true;
		this.method6928(true);
		this.method6896(true);
		this.method6916(true);
		this.method6915(true);
		this.method6881();
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
		this.anInt8446 = this.anInt8432 = -1;
		this.n();
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "()Z")
	@Override
	public boolean method7215() {
		return this.aClass1_Sub11_Sub1_1 != null && this.aClass1_Sub11_Sub1_1.method5296();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7222(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas13) {
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
			@Pc(53) long local53 = this.anOpenGL2.prepareSurface(arg0);
			if (local53 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(IIII)V")
	public void method6899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg0);
	}

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.anInt8463 = 0;
		this.anInt8454 = this.anInt8238;
		this.anInt8452 = this.anInt8314;
		this.anInt8437 = 0;
		OpenGL.glDisable(3089);
		this.method6919();
	}

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "(I)V")
	private void method6900() {
		OpenGL.glDepthMask(this.aBoolean600 && this.aBoolean587);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z[BIZI)Lclient!nu;")
	public Interface10 method6901(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface10) (this.aBoolean580 && (!arg2 || this.aBoolean599) ? new Class148_Sub2(this, 5123, arg0, arg1, arg2) : new Class33_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "(B)V")
	private void method6902() {
		if (this.aBoolean590) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean590 = false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)I")
	@Override
	public int method7225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(BLclient!ve;)V")
	public void method6903(@OriginalArg(1) Interface20 arg0) {
		if (this.anInt8424 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8424 >= 0) {
			this.anInterface20Array2[this.anInt8424].method7343();
		}
		this.anInterface20_1 = this.anInterface20Array2[++this.anInt8424] = arg0;
		this.anInterface20_1.method7341();
	}

	@OriginalMember(owner = "client!uq", name = "x", descriptor = "()Z")
	@Override
	public boolean method7267() {
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(III)V")
	public void method6904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8451 = arg0;
		this.anInt8428 = arg1;
		this.method6872();
		this.method6860();
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7226(@OriginalArg(0) Canvas arg0) {
		this.aCanvas14 = null;
		this.aLong354 = 0L;
		if (arg0 == null || this.aCanvas13 == arg0) {
			this.aCanvas14 = this.aCanvas13;
			this.aLong354 = this.aLong353;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable7.get(arg0);
			this.aLong354 = local26;
			this.aCanvas14 = arg0;
		}
		if (this.aCanvas14 == null || this.aLong354 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong354);
		this.method6855();
	}

	@OriginalMember(owner = "client!uq", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.aBoolean598 = false;
		this.aClass288_1.method6623(false, false, 0, 0, 0);
		this.method6917();
		this.method6868();
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
	@Override
	public void method7211(@OriginalArg(0) int arg0) {
		this.method6856();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!kw;)V")
	@Override
	public void method7251(@OriginalArg(0) Class175 arg0) {
		this.aClass227_1.method5336(arg0, this);
	}

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "()Z")
	@Override
	public boolean method7262() {
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "(IIII)V")
	@Override
	public void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8457 = arg3;
		this.aBoolean598 = true;
		this.anInt8445 = arg2;
		this.anInt8447 = arg0;
		this.anInt8441 = arg1;
		this.aClass288_1.method6623(false, false, 0, 3, 0);
		this.aClass288_1.aClass13_Sub9_1.method6734();
		this.method6917();
		this.method6868();
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "()I")
	@Override
	public int method7217() {
		return 4;
	}

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "()Z")
	@Override
	public boolean method7228() {
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "IA", descriptor = "(III[I)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass118_Sub1_4.aFloat44 + (float) arg0 * this.aClass118_Sub1_4.aFloat38 + this.aClass118_Sub1_4.aFloat41 * (float) arg1 + (float) arg2 * this.aClass118_Sub1_4.aFloat35;
		if (local28 < (float) this.anInt8450 || (float) this.anInt8434 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt8462 * ((float) arg2 * this.aClass118_Sub1_4.aFloat46 + (float) arg0 * this.aClass118_Sub1_4.aFloat42 + this.aClass118_Sub1_4.aFloat36 * (float) arg1 + this.aClass118_Sub1_4.aFloat37) / local28);
		@Pc(117) int local117 = (int) ((this.aClass118_Sub1_4.aFloat45 * (float) arg0 + this.aClass118_Sub1_4.aFloat39 * (float) arg1 + this.aClass118_Sub1_4.aFloat40 * (float) arg2 + this.aClass118_Sub1_4.aFloat43) * (float) this.anInt8459 / local28);
		if ((float) local85 >= this.aFloat178 && this.aFloat174 >= (float) local85 && this.aFloat164 <= (float) local117 && this.aFloat177 >= (float) local117) {
			arg3[1] = (int) ((float) local117 - this.aFloat164);
			arg3[0] = (int) ((float) local85 - this.aFloat178);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "(B)V")
	private void method6905() {
		if (this.anInt8456 != 2) {
			this.anInt8456 = 2;
			this.method6885();
			this.method6897();
			this.anInt8455 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!uq", name = "r", descriptor = "()Z")
	@Override
	public boolean method7255() {
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIB)V")
	public synchronized void method6906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub9 local8 = new Class1_Sub9(arg1);
		local8.aLong392 = arg0;
		this.aClass37_96.method970(local8);
	}

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "(II)V")
	public synchronized void method6907(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub9 local14 = new Class1_Sub9(arg0);
		this.aClass37_95.method970(local14);
	}

	@OriginalMember(owner = "client!uq", name = "r", descriptor = "(I)V")
	public void method6908() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "(Z)V")
	private void method6909() {
		if (this.aBoolean584 && !this.aBoolean586) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!uq", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt8425 + this.anInt8426 + this.anInt8427;
	}

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "(I)V")
	private void method6910() {
		Static493.aFloatArray62[3] = 1.0F;
		Static493.aFloatArray62[2] = this.aFloat168 * this.aFloat183;
		Static493.aFloatArray62[1] = this.aFloat183 * this.aFloat165;
		Static493.aFloatArray62[0] = this.aFloat183 * this.aFloat175;
		OpenGL.glLightfv(16384, 4609, Static493.aFloatArray62, 0);
		Static493.aFloatArray62[0] = this.aFloat175 * -this.aFloat179;
		Static493.aFloatArray62[2] = this.aFloat168 * -this.aFloat179;
		Static493.aFloatArray62[3] = 1.0F;
		Static493.aFloatArray62[1] = this.aFloat165 * -this.aFloat179;
		OpenGL.glLightfv(16385, 4609, Static493.aFloatArray62, 0);
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(III)V")
	public synchronized void method6911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class1_Sub9 local15 = new Class1_Sub9(arg1);
		local15.aLong392 = arg0;
		this.aClass37_93.method970(local15);
	}

	@OriginalMember(owner = "client!uq", name = "E", descriptor = "()F")
	public float method6912() {
		return this.aFloat171;
	}

	@OriginalMember(owner = "client!uq", name = "M", descriptor = "(F)V")
	@Override
	public void M(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat169) {
			this.aFloat169 = arg0;
			this.method6922();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!pe;[Lclient!ig;Z)Lclient!ra;")
	@Override
	public Class67 method7270(@OriginalArg(0) Class232 arg0, @OriginalArg(1) Class136[] arg1) {
		return new Class67_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(IIII)V")
	public void method6913(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!nu;Z)V")
	public void method6914(@OriginalArg(0) Interface10 arg0) {
		if (this.anInterface10_5 != arg0) {
			if (this.aBoolean580) {
				OpenGL.glBindBufferARB(34963, arg0.method6547());
			}
			this.anInterface10_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZB)V")
	public void method6915(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean600) {
			this.aBoolean600 = arg0;
			this.method6900();
			this.anInt8455 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!fp;IIII)Lclient!r;")
	@Override
	public Class145 method7280(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class145_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI)V")
	public void method6916(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean578 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt8455 &= 0xFFFFFFE0;
		this.aBoolean578 = arg0;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "()V")
	@Override
	public void method7214() {
		this.aClass26_1.method889();
	}

	@OriginalMember(owner = "client!uq", name = "L", descriptor = "(I)V")
	@Override
	public void L(@OriginalArg(0) int arg0) {
		this.anInt8421 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt8421++;
		}
		this.anInt8420 = 0x1 << this.anInt8421;
	}

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "(B)V")
	private void method6917() {
		@Pc(23) int local23;
		if (this.aBoolean598) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local23 = this.anInt8441;
		} else {
			this.aFloat170 = (float) (this.anInt8434 - this.anInt8444) - this.aFloat162;
			this.aFloat172 = this.aFloat170 - this.aFloat184 * (float) this.anInt8430;
			if (this.aFloat172 < (float) this.anInt8450) {
				this.aFloat172 = this.anInt8450;
			}
			OpenGL.glFogf(2915, this.aFloat172);
			OpenGL.glFogf(2916, this.aFloat170);
			local23 = this.anInt8432;
		}
		Static493.aFloatArray62[0] = (float) (local23 & 0xFF0000) / 1.671168E7F;
		Static493.aFloatArray62[1] = (float) (local23 & 0xFF00) / 65280.0F;
		Static493.aFloatArray62[2] = (float) (local23 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static493.aFloatArray62, 0);
		if (this.aBoolean598) {
			this.aClass288_1.aClass13_Sub9_1.method6735();
		}
	}

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "()V")
	@Override
	protected void method7245() {
		for (@Pc(10) Class1 local10 = this.aClass37_91.method977(); local10 != null; local10 = this.aClass37_91.method971()) {
			((Class1_Sub8_Sub1) local10).method936();
		}
		if (this.aClass26_1 != null) {
			this.aClass26_1.method886();
		}
		if (this.anOpenGL2 != null) {
			this.method6856();
			@Pc(40) Enumeration local40 = this.aHashtable7.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable7.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean574) {
			Static328.method5044(false, true);
			this.aBoolean574 = false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public Class40 method7273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static390.method4906(this, arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([Lclient!r;Lclient!kw;Lclient!m;[Lclient!eca;I)V")
	@Override
	public void method7283(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class72_Sub2[] arg3, @OriginalArg(4) int arg4) {
		this.method7257(arg0, arg2, arg3, arg4);
		this.method7251(arg1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!eca;I)V")
	@Override
	public void method7257(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) Class72_Sub2[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method6686(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "()V")
	@Override
	public void method7247() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public Class2 method7268(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class2_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "(B)V")
	public void method6918() {
		if (this.anInt8455 == 16) {
			return;
		}
		this.method6933();
		this.method6928(true);
		this.method6916(true);
		this.method6915(true);
		this.method6871(1);
		this.anInt8455 = 16;
	}

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "(I)V")
	private void method6919() {
		this.aFloat174 = this.anInt8452 - this.anInt8438;
		this.aFloat164 = this.anInt8437 - this.anInt8429;
		this.aFloat177 = this.anInt8454 - this.anInt8429;
		this.aFloat178 = this.anInt8463 - this.anInt8438;
	}

	@OriginalMember(owner = "client!uq", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(57) float local57;
		@Pc(45) float local45;
		if (this.aClass73_Sub1_Sub1_4 == null || arg2 > this.aClass73_Sub1_Sub1_4.anInt2337 || this.aClass73_Sub1_Sub1_4.anInt2339 < arg3) {
			this.aClass73_Sub1_Sub1_4 = Static14.method425(arg6, arg3, this, arg2);
			this.aClass73_Sub1_Sub1_4.method1954(false, false);
			local45 = this.aClass73_Sub1_Sub1_4.aFloat21;
			local57 = this.aClass73_Sub1_Sub1_4.aFloat20;
		} else {
			this.aClass73_Sub1_Sub1_4.method1960(false, arg3, arg6, 6406, arg2);
			local45 = this.aClass73_Sub1_Sub1_4.aFloat21 * (float) arg2 / (float) this.aClass73_Sub1_Sub1_4.anInt2337;
			local57 = (float) arg3 * this.aClass73_Sub1_Sub1_4.aFloat20 / (float) this.aClass73_Sub1_Sub1_4.anInt2339;
		}
		this.method6864();
		this.method6850(this.aClass73_Sub1_Sub1_4);
		this.method6871(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method6851(arg5);
		this.method6853(34165, 34165);
		this.method6899(768, 0, 34166);
		this.method6899(770, 2, 5890);
		this.method6913(34166, 0);
		this.method6913(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = local147 + (float) arg2;
		@Pc(160) float local160 = (float) arg3 + local150;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local147, local160);
		OpenGL.glTexCoord2f(local57, local45);
		OpenGL.glVertex2f(local155, local160);
		OpenGL.glTexCoord2f(local57, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method6899(768, 0, 5890);
		this.method6899(770, 2, 34166);
		this.method6913(5890, 0);
		this.method6913(34166, 2);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!r;Lclient!kw;Lclient!m;Lclient!eca;I)V")
	@Override
	public void method7246(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class72_Sub2 arg3) {
		arg0.method6686(arg2, arg3, 0);
		this.method7251(arg1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public void method7231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class40 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class40_Sub2 local6 = (Class40_Sub2) arg5;
		@Pc(9) Class73_Sub1_Sub1 local9 = local6.aClass73_Sub1_Sub1_3;
		this.method6864();
		this.method6850(local6.aClass73_Sub1_Sub1_3);
		this.method6871(1);
		this.method6853(7681, 8448);
		this.method6899(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat21 / (float) local9.anInt2345;
		@Pc(46) float local46 = local9.aFloat20 / (float) local9.anInt2344;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local59 * local59)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(91) float local91 = local52 * local72;
		@Pc(95) float local95 = local59 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local91 + 0.35F, (float) arg3 + local95 + 0.35F);
		OpenGL.glEnd();
		this.method6899(768, 0, 5890);
	}

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "(I)V")
	private void method6921() {
		if (this.anInt8455 == 1) {
			return;
		}
		this.method6857();
		this.method6928(false);
		this.method6896(false);
		this.method6916(false);
		this.method6915(false);
		this.method6850(null);
		this.method6926(-2);
		this.method6875(1);
		this.anInt8455 = 1;
	}

	@OriginalMember(owner = "client!uq", name = "JA", descriptor = "(IIII)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean598) {
			throw new RuntimeException("");
		}
		this.anInt8445 = arg2;
		this.anInt8447 = arg0;
		this.anInt8441 = arg1;
		this.anInt8457 = arg3;
		this.aClass288_1.aClass13_Sub9_1.method6734();
		this.method6917();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!ig;Z)Lclient!ha;")
	@Override
	public Class2 method7220(@OriginalArg(0) Class136 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt4054 * arg0.anInt4055];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray53 == null) {
			for (local21 = 0; local21 < arg0.anInt4054; local21++) {
				for (local25 = 0; local25 < arg0.anInt4055; local25++) {
					@Pc(38) int local38 = arg0.anIntArray344[arg0.aByteArray52[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt4054; local21++) {
				for (local25 = 0; local25 < arg0.anInt4055; local25++) {
					local12[local16++] = arg0.aByteArray53[local14] << 24 | arg0.anIntArray344[arg0.aByteArray52[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(126) Class2 local126 = this.method7268(local12, arg0.anInt4055, arg0.anInt4055, arg0.anInt4054);
		local126.KA(arg0.anInt4052, arg0.anInt4053, arg0.anInt4051, arg0.anInt4050);
		return local126;
	}

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "(B)V")
	private void method6922() {
		Static493.aFloatArray62[3] = 1.0F;
		Static493.aFloatArray62[0] = this.aFloat175 * this.aFloat169;
		Static493.aFloatArray62[1] = this.aFloat169 * this.aFloat165;
		Static493.aFloatArray62[2] = this.aFloat168 * this.aFloat169;
		OpenGL.glLightModelfv(2899, Static493.aFloatArray62, 0);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Lclient!ve;I)V")
	public void method6923(@OriginalArg(0) Interface20 arg0) {
		if (this.anInt8423 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8423 >= 0) {
			this.anInterface20Array3[this.anInt8423].method7344();
		}
		this.anInterface20_2 = this.anInterface20Array3[++this.anInt8423] = arg0;
		this.anInterface20_2.method7342();
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Z)V")
	@Override
	public void method7271(@OriginalArg(0) boolean arg0) {
		this.aBoolean587 = arg0;
		this.method6900();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZILclient!jaclib/memory/Buffer;B)Lclient!ee;")
	public Interface2 method6924(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Buffer arg2) {
		return (Interface2) (this.aBoolean580 ? new Class148_Sub1(this, arg1, arg2, arg0, false) : new Class33_Sub1(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!uq", name = "v", descriptor = "(I)V")
	private void method6925() {
		@Pc(6) float[] local6 = this.aFloatArray66;
		@Pc(18) float local18 = (float) (-this.anInt8438 * this.anInt8450) / (float) this.anInt8462;
		@Pc(32) float local32 = (float) (this.anInt8450 * (this.anInt8314 - this.anInt8438)) / (float) this.anInt8462;
		@Pc(43) float local43 = (float) (this.anInt8429 * this.anInt8450) / (float) this.anInt8459;
		@Pc(58) float local58 = (float) ((this.anInt8429 - this.anInt8238) * this.anInt8450) / (float) this.anInt8459;
		if (local18 == local32 || local58 == local43) {
			local6[15] = 1.0F;
			local6[4] = 0.0F;
			local6[11] = 0.0F;
			local6[2] = 0.0F;
			local6[8] = 0.0F;
			local6[10] = 1.0F;
			local6[9] = 0.0F;
			local6[12] = 0.0F;
			local6[0] = 1.0F;
			local6[1] = 0.0F;
			local6[14] = 0.0F;
			local6[13] = 0.0F;
			local6[6] = 0.0F;
			local6[7] = 0.0F;
			local6[5] = 1.0F;
			local6[3] = 0.0F;
		} else {
			@Pc(144) float local144 = (float) this.anInt8450 * 2.0F;
			local6[6] = 0.0F;
			local6[13] = 0.0F;
			local6[9] = (local43 + local58) / (-local58 + local43);
			local6[4] = 0.0F;
			local6[7] = 0.0F;
			local6[1] = 0.0F;
			local6[8] = (local18 + local32) / (local32 - local18);
			local6[11] = -1.0F;
			local6[0] = local144 / (local32 - local18);
			local6[14] = this.aFloat163 = -(local144 * (float) this.anInt8434) / (float) (this.anInt8434 - this.anInt8450);
			local6[2] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = local144 / (local43 - local58);
			local6[10] = this.aFloat176 = (float) -(this.anInt8434 + this.anInt8450) / (float) (this.anInt8434 - this.anInt8450);
			local6[12] = 0.0F;
			local6[15] = 0.0F;
		}
		this.method6858();
	}

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "(II)V")
	public void method6926(@OriginalArg(0) int arg0) {
		this.method6879(arg0, true);
	}

	@OriginalMember(owner = "client!uq", name = "v", descriptor = "()Z")
	@Override
	public boolean method7266() {
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!hba;I)V")
	public void method6927(@OriginalArg(0) Class118_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method2637(), 0);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7237(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZ)V")
	public void method6928(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean592) {
			this.aBoolean592 = arg0;
			this.method6868();
			this.anInt8455 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!uq", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt8238 - local12 - arg1, arg2, 1, 32993, this.anInt8431, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(JB)V")
	public synchronized void method6929(@OriginalArg(0) long arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong392 = arg0;
		this.aClass37_98.method970(local7);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7216(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7236();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIBI)V")
	public void method6930(@OriginalArg(0) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)I")
	@Override
	public int method7241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(ZI)V")
	public void method6931(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean586 != arg0) {
			this.aBoolean586 = arg0;
			this.method6909();
		}
	}

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "()Z")
	@Override
	public boolean method7240() {
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "(II)V")
	public void method6932(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt8458) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt8458 = arg0;
		}
	}

	@OriginalMember(owner = "client!uq", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		@Pc(6) int local6 = this.anInt8465;
		this.anInt8465 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)V")
	@Override
	public void method7232(@OriginalArg(0) int arg0) {
		this.method6877();
	}

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "()V")
	@Override
	public void method7236() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.anInt8450;
	}

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "()Z")
	@Override
	public boolean method7242() {
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7278(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas13 == arg0) {
			local5 = this.aLong353;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable7.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas14) {
			this.method6855();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIF)Lclient!ww;")
	@Override
	public Class1_Sub2 method7249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub2_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(IIIIII)Lclient!rn;")
	@Override
	public Class45 method7227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean581 ? new Class45_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "(I)V")
	private void method6933() {
		if (this.anInt8456 != 3) {
			this.anInt8456 = 3;
			this.method6867();
			this.method6897();
			this.anInt8455 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(BLclient!ve;)V")
	public void method6934(@OriginalArg(1) Interface20 arg0) {
		if (this.anInt8424 < 0 || arg0 != this.anInterface20Array2[this.anInt8424]) {
			throw new RuntimeException();
		}
		this.anInterface20Array2[this.anInt8424--] = null;
		arg0.method7343();
		if (this.anInt8424 < 0) {
			this.anInterface20_1 = null;
		} else {
			this.anInterface20_1 = this.anInterface20Array2[this.anInt8424];
			this.anInterface20_1.method7341();
		}
	}

	@OriginalMember(owner = "client!uq", name = "F", descriptor = "(IIII)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > this.anInt8463) {
			this.anInt8463 = arg0;
		}
		if (arg2 < this.anInt8452) {
			this.anInt8452 = arg2;
		}
		if (this.anInt8437 < arg1) {
			this.anInt8437 = arg1;
		}
		if (this.anInt8454 > arg3) {
			this.anInt8454 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method6919();
		this.method6860();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!rn;Lclient!rn;FLclient!rn;)Lclient!rn;")
	@Override
	public Class45 method7233(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class45 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean581 && this.aBoolean601) {
			@Pc(15) Class45_Sub2_Sub2 local15 = null;
			@Pc(18) Class45_Sub2 local18 = (Class45_Sub2) arg0;
			@Pc(21) Class45_Sub2 local21 = (Class45_Sub2) arg1;
			@Pc(25) Class73_Sub4 local25 = local18.method6134();
			@Pc(29) Class73_Sub4 local29 = local21.method6134();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local25.anInt7639 <= local29.anInt7639 ? local29.anInt7639 : local25.anInt7639;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class45_Sub2_Sub2) {
					@Pc(56) Class45_Sub2_Sub2 local56 = (Class45_Sub2_Sub2) arg3;
					if (local56.method6136() == local44) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class45_Sub2_Sub2(this, local44);
				}
				if (local15.method6137(arg2, local25, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7274(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas13) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable7.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!uq", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass118_Sub1_4.aFloat41 * (float) arg1 + (float) arg0 * this.aClass118_Sub1_4.aFloat38 + (float) arg2 * this.aClass118_Sub1_4.aFloat35 + this.aClass118_Sub1_4.aFloat44;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass118_Sub1_4.aFloat41 * (float) arg4 + (float) arg3 * this.aClass118_Sub1_4.aFloat38 + this.aClass118_Sub1_4.aFloat35 * (float) arg5 + this.aClass118_Sub1_4.aFloat44;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt8450 > local28 && (float) this.anInt8450 > local59 || !(!(local28 > (float) this.anInt8434) || !(local59 > (float) this.anInt8434))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt8462 * (this.aClass118_Sub1_4.aFloat37 + this.aClass118_Sub1_4.aFloat46 * (float) arg2 + (float) arg1 * this.aClass118_Sub1_4.aFloat36 + (float) arg0 * this.aClass118_Sub1_4.aFloat42) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt8462 * (this.aClass118_Sub1_4.aFloat37 + this.aClass118_Sub1_4.aFloat46 * (float) arg5 + (float) arg3 * this.aClass118_Sub1_4.aFloat42 + (float) arg4 * this.aClass118_Sub1_4.aFloat36) / local59);
		if (this.aFloat178 > (float) local123 && this.aFloat178 > (float) local155 || (float) local123 > this.aFloat174 && this.aFloat174 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt8459 * (this.aClass118_Sub1_4.aFloat43 + (float) arg0 * this.aClass118_Sub1_4.aFloat45 + (float) arg1 * this.aClass118_Sub1_4.aFloat39 + (float) arg2 * this.aClass118_Sub1_4.aFloat40) / local28);
			@Pc(245) int local245 = (int) ((this.aClass118_Sub1_4.aFloat43 + this.aClass118_Sub1_4.aFloat40 * (float) arg5 + this.aClass118_Sub1_4.aFloat39 * (float) arg4 + (float) arg3 * this.aClass118_Sub1_4.aFloat45) * (float) this.anInt8459 / local59);
			return (!((float) local213 < this.aFloat164) || !((float) local245 < this.aFloat164)) && (!(this.aFloat177 < (float) local213) || !(this.aFloat177 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method6921();
		this.method6871(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean585) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean585) {
			OpenGL.glEnable(32925);
		}
	}
}
