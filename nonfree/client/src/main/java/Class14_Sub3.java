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

@OriginalClass("client!jaa")
public final class Class14_Sub3 extends Class14 {

	@OriginalMember(owner = "client!jaa", name = "K", descriptor = "I")
	public int anInt4385;

	@OriginalMember(owner = "client!jaa", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!jaa", name = "Vb", descriptor = "I")
	public int anInt4445;

	@OriginalMember(owner = "client!jaa", name = "ad", descriptor = "I")
	private int anInt4500;

	@OriginalMember(owner = "client!jaa", name = "qe", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!jaa", name = "ue", descriptor = "I")
	public int anInt4557;

	@OriginalMember(owner = "client!jaa", name = "we", descriptor = "Lclient!ds;")
	private Class74 aClass74_3;

	@OriginalMember(owner = "client!jaa", name = "ye", descriptor = "Lclient!lr;")
	private Class58_Sub2 aClass58_Sub2_1;

	@OriginalMember(owner = "client!jaa", name = "ze", descriptor = "Lclient!qh;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!jaa", name = "Be", descriptor = "Lclient!qh;")
	private Interface20 anInterface20_2;

	@OriginalMember(owner = "client!jaa", name = "Ie", descriptor = "I")
	public int anInt4562;

	@OriginalMember(owner = "client!jaa", name = "Ke", descriptor = "I")
	public int anInt4563;

	@OriginalMember(owner = "client!jaa", name = "Le", descriptor = "I")
	private int anInt4564;

	@OriginalMember(owner = "client!jaa", name = "Me", descriptor = "I")
	private int anInt4565;

	@OriginalMember(owner = "client!jaa", name = "Ve", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!jaa", name = "We", descriptor = "Z")
	private boolean aBoolean293;

	@OriginalMember(owner = "client!jaa", name = "Ye", descriptor = "Lclient!ad;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!jaa", name = "Ze", descriptor = "Z")
	public boolean aBoolean294;

	@OriginalMember(owner = "client!jaa", name = "af", descriptor = "Z")
	private boolean aBoolean295;

	@OriginalMember(owner = "client!jaa", name = "bf", descriptor = "Z")
	public boolean bf;

	@OriginalMember(owner = "client!jaa", name = "cf", descriptor = "I")
	private int anInt4568;

	@OriginalMember(owner = "client!jaa", name = "df", descriptor = "Lclient!mo;")
	public Class20_Sub2 aClass20_Sub2_1;

	@OriginalMember(owner = "client!jaa", name = "ef", descriptor = "Lclient!mo;")
	public Class20_Sub2 aClass20_Sub2_2;

	@OriginalMember(owner = "client!jaa", name = "ff", descriptor = "I")
	private int anInt4569;

	@OriginalMember(owner = "client!jaa", name = "hf", descriptor = "Z")
	private boolean aBoolean296;

	@OriginalMember(owner = "client!jaa", name = "kf", descriptor = "I")
	private int anInt4571;

	@OriginalMember(owner = "client!jaa", name = "nf", descriptor = "Z")
	private boolean aBoolean297;

	@OriginalMember(owner = "client!jaa", name = "pf", descriptor = "Lclient!ds;")
	public Class74 aClass74_4;

	@OriginalMember(owner = "client!jaa", name = "qf", descriptor = "Lclient!mo;")
	public Class20_Sub2 aClass20_Sub2_3;

	@OriginalMember(owner = "client!jaa", name = "rf", descriptor = "Z")
	public boolean aBoolean298;

	@OriginalMember(owner = "client!jaa", name = "sf", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!jaa", name = "tf", descriptor = "F")
	private float aFloat91;

	@OriginalMember(owner = "client!jaa", name = "vf", descriptor = "J")
	private long aLong124;

	@OriginalMember(owner = "client!jaa", name = "wf", descriptor = "Lclient!co;")
	public Class51_Sub1 aClass51_Sub1_3;

	@OriginalMember(owner = "client!jaa", name = "xf", descriptor = "F")
	private float aFloat92;

	@OriginalMember(owner = "client!jaa", name = "Af", descriptor = "I")
	private int anInt4575;

	@OriginalMember(owner = "client!jaa", name = "Cf", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!jaa", name = "Df", descriptor = "Z")
	private boolean aBoolean300;

	@OriginalMember(owner = "client!jaa", name = "Ef", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!jaa", name = "Ff", descriptor = "I")
	private int anInt4576;

	@OriginalMember(owner = "client!jaa", name = "Hf", descriptor = "Ljava/lang/String;")
	private String aString32;

	@OriginalMember(owner = "client!jaa", name = "If", descriptor = "F")
	private float aFloat96;

	@OriginalMember(owner = "client!jaa", name = "Kf", descriptor = "I")
	private int anInt4579;

	@OriginalMember(owner = "client!jaa", name = "Nf", descriptor = "Z")
	private boolean aBoolean301;

	@OriginalMember(owner = "client!jaa", name = "Of", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!jaa", name = "Qf", descriptor = "I")
	private int anInt4582;

	@OriginalMember(owner = "client!jaa", name = "Sf", descriptor = "Lclient!kl;")
	public Class54_Sub2 aClass54_Sub2_3;

	@OriginalMember(owner = "client!jaa", name = "Uf", descriptor = "Lclient!mo;")
	public Class20_Sub2 aClass20_Sub2_4;

	@OriginalMember(owner = "client!jaa", name = "Vf", descriptor = "I")
	public int anInt4583;

	@OriginalMember(owner = "client!jaa", name = "Xf", descriptor = "Z")
	private boolean aBoolean304;

	@OriginalMember(owner = "client!jaa", name = "Yf", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!jaa", name = "bg", descriptor = "Z")
	private boolean aBoolean306;

	@OriginalMember(owner = "client!jaa", name = "gg", descriptor = "Lclient!mo;")
	public Class20_Sub2 aClass20_Sub2_5;

	@OriginalMember(owner = "client!jaa", name = "ig", descriptor = "Z")
	public boolean aBoolean307;

	@OriginalMember(owner = "client!jaa", name = "jg", descriptor = "I")
	public int anInt4587;

	@OriginalMember(owner = "client!jaa", name = "kg", descriptor = "Lclient!mo;")
	public Class20_Sub2 aClass20_Sub2_6;

	@OriginalMember(owner = "client!jaa", name = "lg", descriptor = "Lclient!ad;")
	private Interface1 anInterface1_3;

	@OriginalMember(owner = "client!jaa", name = "mg", descriptor = "Lclient!wb;")
	private Interface24 anInterface24_2;

	@OriginalMember(owner = "client!jaa", name = "ng", descriptor = "Lclient!mo;")
	public Class20_Sub2 aClass20_Sub2_7;

	@OriginalMember(owner = "client!jaa", name = "pg", descriptor = "Lclient!mo;")
	public Class20_Sub2 aClass20_Sub2_8;

	@OriginalMember(owner = "client!jaa", name = "qg", descriptor = "Lclient!kl;")
	public Class54_Sub2 aClass54_Sub2_4;

	@OriginalMember(owner = "client!jaa", name = "rg", descriptor = "Lclient!ce;")
	public Class45 aClass45_1;

	@OriginalMember(owner = "client!jaa", name = "vg", descriptor = "I")
	private int anInt4591;

	@OriginalMember(owner = "client!jaa", name = "yg", descriptor = "Z")
	public boolean aBoolean308;

	@OriginalMember(owner = "client!jaa", name = "zg", descriptor = "F")
	private float aFloat102;

	@OriginalMember(owner = "client!jaa", name = "Ag", descriptor = "[Lclient!tj;")
	private Class51[] aClass51Array1;

	@OriginalMember(owner = "client!jaa", name = "Cg", descriptor = "Lclient!hq;")
	private Class51_Sub1_Sub1 aClass51_Sub1_Sub1_1;

	@OriginalMember(owner = "client!jaa", name = "Fg", descriptor = "Z")
	public boolean aBoolean311;

	@OriginalMember(owner = "client!jaa", name = "Gg", descriptor = "I")
	public int anInt4594;

	@OriginalMember(owner = "client!jaa", name = "Ig", descriptor = "Z")
	private boolean aBoolean312;

	@OriginalMember(owner = "client!jaa", name = "Jg", descriptor = "Lclient!ce;")
	public Class45 aClass45_2;

	@OriginalMember(owner = "client!jaa", name = "Lg", descriptor = "I")
	private int anInt4595;

	@OriginalMember(owner = "client!jaa", name = "Mg", descriptor = "Z")
	private boolean aBoolean313;

	@OriginalMember(owner = "client!jaa", name = "Ng", descriptor = "I")
	public int anInt4596;

	@OriginalMember(owner = "client!jaa", name = "Qg", descriptor = "I")
	private int anInt4597;

	@OriginalMember(owner = "client!jaa", name = "Rg", descriptor = "Lclient!mo;")
	public Class20_Sub2 aClass20_Sub2_9;

	@OriginalMember(owner = "client!jaa", name = "Sg", descriptor = "Lclient!mo;")
	public Class20_Sub2 aClass20_Sub2_10;

	@OriginalMember(owner = "client!jaa", name = "Tg", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!jaa", name = "Ug", descriptor = "Z")
	public boolean aBoolean316;

	@OriginalMember(owner = "client!jaa", name = "Xg", descriptor = "Z")
	public boolean aBoolean317;

	@OriginalMember(owner = "client!jaa", name = "bh", descriptor = "Z")
	private boolean aBoolean319;

	@OriginalMember(owner = "client!jaa", name = "ch", descriptor = "Z")
	public boolean aBoolean320;

	@OriginalMember(owner = "client!jaa", name = "eh", descriptor = "I")
	private int anInt4600;

	@OriginalMember(owner = "client!jaa", name = "fh", descriptor = "Lclient!bd;")
	private Class26_Sub1 aClass26_Sub1_1;

	@OriginalMember(owner = "client!jaa", name = "mh", descriptor = "I")
	private int anInt4603;

	@OriginalMember(owner = "client!jaa", name = "nh", descriptor = "I")
	private int anInt4604;

	@OriginalMember(owner = "client!jaa", name = "wd", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "client!jaa", name = "Yd", descriptor = "I")
	public int anInt4543 = 128;

	@OriginalMember(owner = "client!jaa", name = "he", descriptor = "Lclient!pt;")
	private final Class258 aClass258_1 = new Class258();

	@OriginalMember(owner = "client!jaa", name = "le", descriptor = "Lclient!kl;")
	private final Class54_Sub2 aClass54_Sub2_1 = new Class54_Sub2();

	@OriginalMember(owner = "client!jaa", name = "me", descriptor = "Lclient!kl;")
	public final Class54_Sub2 aClass54_Sub2_2 = new Class54_Sub2();

	@OriginalMember(owner = "client!jaa", name = "oe", descriptor = "I")
	public int anInt4555 = 8;

	@OriginalMember(owner = "client!jaa", name = "te", descriptor = "Z")
	private boolean aBoolean292 = false;

	@OriginalMember(owner = "client!jaa", name = "re", descriptor = "I")
	public int anInt4556 = 3;

	@OriginalMember(owner = "client!jaa", name = "pe", descriptor = "Lclient!ws;")
	private final Class361 aClass361_28 = new Class361();

	@OriginalMember(owner = "client!jaa", name = "Ae", descriptor = "I")
	private int anInt4559 = -1;

	@OriginalMember(owner = "client!jaa", name = "xe", descriptor = "[Lclient!qh;")
	private final Interface20[] anInterface20Array1 = new Interface20[4];

	@OriginalMember(owner = "client!jaa", name = "Ce", descriptor = "I")
	private int anInt4560 = -1;

	@OriginalMember(owner = "client!jaa", name = "Ee", descriptor = "[Lclient!qh;")
	private final Interface20[] anInterface20Array3 = new Interface20[4];

	@OriginalMember(owner = "client!jaa", name = "De", descriptor = "[Lclient!qh;")
	private final Interface20[] anInterface20Array2 = new Interface20[4];

	@OriginalMember(owner = "client!jaa", name = "Fe", descriptor = "I")
	private int anInt4561 = -1;

	@OriginalMember(owner = "client!jaa", name = "Ge", descriptor = "Lclient!kp;")
	private final Class180 aClass180_4 = new Class180();

	@OriginalMember(owner = "client!jaa", name = "He", descriptor = "Lclient!hd;")
	private final Class128 aClass128_21 = new Class128(16);

	@OriginalMember(owner = "client!jaa", name = "Je", descriptor = "Lclient!ws;")
	private final Class361 aClass361_29 = new Class361();

	@OriginalMember(owner = "client!jaa", name = "Ne", descriptor = "Lclient!ws;")
	private final Class361 aClass361_30 = new Class361();

	@OriginalMember(owner = "client!jaa", name = "Oe", descriptor = "Lclient!ws;")
	private final Class361 aClass361_31 = new Class361();

	@OriginalMember(owner = "client!jaa", name = "Pe", descriptor = "Lclient!ws;")
	private final Class361 aClass361_32 = new Class361();

	@OriginalMember(owner = "client!jaa", name = "Qe", descriptor = "Lclient!ws;")
	private final Class361 aClass361_33 = new Class361();

	@OriginalMember(owner = "client!jaa", name = "Re", descriptor = "Lclient!ws;")
	private final Class361 aClass361_34 = new Class361();

	@OriginalMember(owner = "client!jaa", name = "Se", descriptor = "Lclient!ws;")
	private final Class361 aClass361_35 = new Class361();

	@OriginalMember(owner = "client!jaa", name = "Te", descriptor = "I")
	private int anInt4566 = 0;

	@OriginalMember(owner = "client!jaa", name = "Xe", descriptor = "[F")
	public final float[] aFloatArray40 = new float[4];

	@OriginalMember(owner = "client!jaa", name = "jf", descriptor = "F")
	private float aFloat88 = 1.0F;

	@OriginalMember(owner = "client!jaa", name = "Jf", descriptor = "I")
	private int anInt4578 = 0;

	@OriginalMember(owner = "client!jaa", name = "Rf", descriptor = "[Lclient!bj;")
	private final Class6_Sub7[] aClass6_Sub7Array3 = new Class6_Sub7[Static227.anInt4668];

	@OriginalMember(owner = "client!jaa", name = "Gf", descriptor = "I")
	public int anInt4577 = 0;

	@OriginalMember(owner = "client!jaa", name = "lf", descriptor = "I")
	public int anInt4572 = -1;

	@OriginalMember(owner = "client!jaa", name = "cg", descriptor = "[F")
	private final float[] aFloatArray41 = new float[4];

	@OriginalMember(owner = "client!jaa", name = "Ue", descriptor = "I")
	public int anInt4567 = 512;

	@OriginalMember(owner = "client!jaa", name = "fg", descriptor = "I")
	private int anInt4585 = 0;

	@OriginalMember(owner = "client!jaa", name = "of", descriptor = "F")
	private float aFloat89 = -1.0F;

	@OriginalMember(owner = "client!jaa", name = "uf", descriptor = "I")
	public int anInt4574 = 3584;

	@OriginalMember(owner = "client!jaa", name = "og", descriptor = "F")
	public float aFloat101 = 3584.0F;

	@OriginalMember(owner = "client!jaa", name = "Mf", descriptor = "I")
	public int anInt4581 = -1;

	@OriginalMember(owner = "client!jaa", name = "tg", descriptor = "I")
	public int anInt4589 = 0;

	@OriginalMember(owner = "client!jaa", name = "mf", descriptor = "I")
	public int anInt4573 = 0;

	@OriginalMember(owner = "client!jaa", name = "Kg", descriptor = "F")
	private float aFloat104 = -1.0F;

	@OriginalMember(owner = "client!jaa", name = "Hg", descriptor = "F")
	public float aFloat103 = 1.0F;

	@OriginalMember(owner = "client!jaa", name = "Tf", descriptor = "F")
	private float aFloat98 = 1.0F;

	@OriginalMember(owner = "client!jaa", name = "ug", descriptor = "I")
	private int anInt4590 = -1;

	@OriginalMember(owner = "client!jaa", name = "eg", descriptor = "F")
	public float aFloat100 = 3584.0F;

	@OriginalMember(owner = "client!jaa", name = "Vg", descriptor = "I")
	private int anInt4598 = 8448;

	@OriginalMember(owner = "client!jaa", name = "dg", descriptor = "[F")
	private final float[] aFloatArray42 = new float[16];

	@OriginalMember(owner = "client!jaa", name = "hg", descriptor = "I")
	private int anInt4586 = 0;

	@OriginalMember(owner = "client!jaa", name = "wg", descriptor = "I")
	private int anInt4592 = 0;

	@OriginalMember(owner = "client!jaa", name = "gf", descriptor = "I")
	public int anInt4570 = 512;

	@OriginalMember(owner = "client!jaa", name = "yf", descriptor = "F")
	public float aFloat93 = 1.0F;

	@OriginalMember(owner = "client!jaa", name = "xg", descriptor = "I")
	public int anInt4593 = -1;

	@OriginalMember(owner = "client!jaa", name = "Dg", descriptor = "Z")
	private boolean aBoolean310 = true;

	@OriginalMember(owner = "client!jaa", name = "sg", descriptor = "I")
	public int anInt4588 = 50;

	@OriginalMember(owner = "client!jaa", name = "Zg", descriptor = "F")
	public float aFloat107 = -1.0F;

	@OriginalMember(owner = "client!jaa", name = "Lf", descriptor = "I")
	private int anInt4580 = 0;

	@OriginalMember(owner = "client!jaa", name = "Bf", descriptor = "F")
	private float aFloat94 = 3000.0F;

	@OriginalMember(owner = "client!jaa", name = "Yg", descriptor = "F")
	public float aFloat106 = -1.0F;

	@OriginalMember(owner = "client!jaa", name = "dh", descriptor = "F")
	public float aFloat108 = 1.0F;

	@OriginalMember(owner = "client!jaa", name = "ag", descriptor = "I")
	private int anInt4584 = -1;

	@OriginalMember(owner = "client!jaa", name = "hh", descriptor = "F")
	private float aFloat109 = 0.0F;

	@OriginalMember(owner = "client!jaa", name = "gh", descriptor = "[F")
	private final float[] aFloatArray44 = new float[4];

	@OriginalMember(owner = "client!jaa", name = "kh", descriptor = "I")
	private int anInt4602 = 8448;

	@OriginalMember(owner = "client!jaa", name = "jh", descriptor = "I")
	public int anInt4601 = 0;

	@OriginalMember(owner = "client!jaa", name = "Eg", descriptor = "[F")
	private final float[] aFloatArray43 = new float[4];

	@OriginalMember(owner = "client!jaa", name = "ih", descriptor = "Lclient!gm;")
	public Class6_Sub21_Sub1 aClass6_Sub21_Sub1_1 = new Class6_Sub21_Sub1(8192);

	@OriginalMember(owner = "client!jaa", name = "lh", descriptor = "[I")
	public int[] anIntArray274 = new int[1];

	@OriginalMember(owner = "client!jaa", name = "qh", descriptor = "[I")
	public int[] anIntArray276 = new int[1];

	@OriginalMember(owner = "client!jaa", name = "ph", descriptor = "[I")
	public int[] anIntArray275 = new int[1];

	@OriginalMember(owner = "client!jaa", name = "oh", descriptor = "[B")
	public final byte[] aByteArray42 = new byte[16384];

	@OriginalMember(owner = "client!jaa", name = "gd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas10;

	@OriginalMember(owner = "client!jaa", name = "qc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!jaa", name = "Ld", descriptor = "I")
	public final int anInt4535;

	@OriginalMember(owner = "client!jaa", name = "xb", descriptor = "Lclient!jaggl/OpenGL;")
	public OpenGL anOpenGL2;

	@OriginalMember(owner = "client!jaa", name = "Rb", descriptor = "J")
	private final long aLong122;

	@OriginalMember(owner = "client!jaa", name = "sc", descriptor = "J")
	private long aLong123;

	@OriginalMember(owner = "client!jaa", name = "Wg", descriptor = "I")
	public final int anInt4599;

	@OriginalMember(owner = "client!jaa", name = "Bg", descriptor = "Z")
	private boolean aBoolean309;

	@OriginalMember(owner = "client!jaa", name = "ah", descriptor = "Z")
	public boolean aBoolean318;

	@OriginalMember(owner = "client!jaa", name = "Og", descriptor = "Z")
	public boolean aBoolean314;

	@OriginalMember(owner = "client!jaa", name = "zf", descriptor = "Z")
	public boolean aBoolean299;

	@OriginalMember(owner = "client!jaa", name = "Wf", descriptor = "Z")
	public boolean aBoolean303;

	@OriginalMember(owner = "client!jaa", name = "Zf", descriptor = "Z")
	private boolean aBoolean305;

	@OriginalMember(owner = "client!jaa", name = "Pf", descriptor = "Z")
	public boolean aBoolean302;

	@OriginalMember(owner = "client!jaa", name = "Pg", descriptor = "Z")
	private final boolean aBoolean315;

	@OriginalMember(owner = "client!jaa", name = "ie", descriptor = "Lclient!qc;")
	private final Class264 aClass264_1;

	@OriginalMember(owner = "client!jaa", name = "se", descriptor = "Lclient!oj;")
	public final Class238 aClass238_1;

	@OriginalMember(owner = "client!jaa", name = "Ud", descriptor = "Lclient!mw;")
	private final Class212 aClass212_1;

	@OriginalMember(owner = "client!jaa", name = "Nd", descriptor = "Lclient!eu;")
	private Class6_Sub6_Sub1 aClass6_Sub6_Sub1_1;

	@OriginalMember(owner = "client!jaa", name = "Td", descriptor = "Lclient!sca;")
	private final Class301 aClass301_1;

	static {
		new Class261("", 73);
	}

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;I)V")
	public Class14_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		this.aCanvas9 = this.aCanvas10 = arg0;
		this.anInt4535 = arg2;
		if (!Static511.method7084("jaclib")) {
			throw new RuntimeException("");
		} else if (Static511.method7084("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong123 = this.aLong122 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt4535);
				if (this.aLong122 == 0L) {
					throw new RuntimeException("");
				}
				this.method3915();
				@Pc(324) int local324 = this.method3932();
				if (local324 != 0) {
					throw new RuntimeException("");
				}
				this.anInt4599 = this.aBoolean298 ? 33639 : 5121;
				@Pc(348) int local348;
				if (this.aString32.indexOf("radeon") != -1) {
					local348 = 0;
					@Pc(350) boolean local350 = false;
					@Pc(352) boolean local352 = false;
					@Pc(361) String[] local361 = Static115.method2011(' ', this.aString32.replace('/', ' '));
					for (@Pc(363) int local363 = 0; local363 < local361.length; local363++) {
						@Pc(369) String local369 = local361[local363];
						try {
							if (local369.length() > 0) {
								if (local369.charAt(0) == 'x' && local369.length() >= 3 && Static198.method3584(local369.substring(1, 3))) {
									local352 = true;
									local369 = local369.substring(1);
								}
								if (local369.equals("hd")) {
									local350 = true;
								} else {
									if (local369.startsWith("hd")) {
										local369 = local369.substring(2);
										local350 = true;
									}
									if (local369.length() >= 4 && Static198.method3584(local369.substring(0, 4))) {
										local348 = Static444.method6313(local369.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(441) Exception local441) {
						}
					}
					if (!local352 && !local350) {
						if (local348 >= 7000 && local348 <= 7999) {
							this.aBoolean309 = false;
						}
						if (local348 >= 7000 && local348 <= 9250) {
							this.aBoolean318 = false;
						}
					}
					if (!local350 || local348 < 4000) {
						this.aBoolean314 = false;
					}
					this.aBoolean299 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean303 = true;
					this.aBoolean305 = this.aBoolean309;
				}
				if (this.aString31.indexOf("intel") != -1) {
					this.aBoolean302 = false;
				}
				this.aBoolean315 = !this.aString31.equals("s3 graphics");
				if (this.aBoolean309) {
					try {
						@Pc(524) int[] local524 = new int[1];
						OpenGL.glGenBuffersARB(1, local524, 0);
					} catch (@Pc(530) Throwable local530) {
						throw new RuntimeException("");
					}
				}
				Static210.method3727(true, false);
				this.aBoolean292 = true;
				this.aClass264_1 = new Class264(this, super.anInterface4_15);
				this.method3922();
				this.aClass238_1 = new Class238(this);
				this.aClass212_1 = new Class212(this);
				if (this.aClass212_1.method5125()) {
					this.aClass6_Sub6_Sub1_1 = new Class6_Sub6_Sub1(this);
					if (!this.aClass6_Sub6_Sub1_1.method2540()) {
						this.aClass6_Sub6_Sub1_1.method2538();
						this.aClass6_Sub6_Sub1_1 = null;
					}
				}
				this.aClass301_1 = new Class301(this);
				this.method3916();
				this.method3935();
				OpenGL.glClear(16640);
				local348 = 0;
				while (true) {
					try {
						this.anOpenGL2.swapBuffers();
						break;
					} catch (@Pc(609) Exception local609) {
						if (local348++ > 5) {
							throw new RuntimeException("");
						}
						Static318.method4952(100L);
					}
				}
				OpenGL.glClear(16384);
			} catch (@Pc(629) Throwable local629) {
				local629.printStackTrace();
				this.method6839();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!jaa", name = "ya", descriptor = "(IIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3972();
		this.method3937(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(II)V")
	public void method3902(@OriginalArg(1) int arg0) {
		Static153.aFloatArray29[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static153.aFloatArray29[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static153.aFloatArray29[3] = (float) (arg0 >>> 24) / 255.0F;
		Static153.aFloatArray29[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static153.aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(B)V")
	private void method3903() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt4575; local7++) {
			@Pc(14) Class6_Sub7 local14 = this.aClass6_Sub7Array3[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static292.aFloatArray47[0] = local14.method4292();
			Static292.aFloatArray47[1] = local14.method4291();
			Static292.aFloatArray47[2] = local14.method4286();
			Static292.aFloatArray47[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static292.aFloatArray47, 0);
			@Pc(54) int local54 = local14.method4288();
			@Pc(60) float local60 = local14.method4284() / 255.0F;
			Static292.aFloatArray47[1] = local60 * (float) (local54 >> 8 & 0xFF);
			Static292.aFloatArray47[0] = (float) (local54 >> 16 & 0xFF) * local60;
			Static292.aFloatArray47[2] = local60 * (float) (local54 & 0xFF);
			OpenGL.glLightfv(local18, 4609, Static292.aFloatArray47, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method4283() * local14.method4283()));
			OpenGL.glEnable(local18);
		}
		while (local7 < this.anInt4571) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt4571 = this.anInt4575;
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(I)V")
	private void method3904() {
		@Pc(15) int local15;
		if (this.aBoolean308) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt4584;
		} else {
			this.aFloat92 = (float) (this.anInt4574 - this.anInt4589) - this.aFloat109;
			this.aFloat105 = this.aFloat92 - this.aFloat98 * (float) this.anInt4593;
			if (this.aFloat105 < (float) this.anInt4588) {
				this.aFloat105 = this.anInt4588;
			}
			OpenGL.glFogf(2915, this.aFloat105);
			OpenGL.glFogf(2916, this.aFloat92);
			local15 = this.anInt4581;
		}
		Static153.aFloatArray29[2] = (float) (local15 & 0xFF) / 255.0F;
		Static153.aFloatArray29[1] = (float) (local15 & 0xFF00) / 65280.0F;
		Static153.aFloatArray29[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static153.aFloatArray29, 0);
		if (this.aBoolean308) {
			this.aClass301_1.aClass60_Sub9_1.method7482();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "y", descriptor = "()Z")
	@Override
	public boolean method6886() {
		return true;
	}

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "(B)V")
	private void method3905() {
		OpenGL.glDepthMask(this.aBoolean304 && this.aBoolean310);
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V")
	@Override
	public void method6850(@OriginalArg(0) int arg0) {
		this.method3938();
	}

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "(B)V")
	public void method3906() {
		if (this.anInt4579 == 2) {
			return;
		}
		this.method3984();
		this.method3945(false);
		this.method3921(false);
		this.method3959(false);
		this.method3965(false);
		this.method3962(-2);
		this.anInt4579 = 2;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!kl;)V")
	public void method3907(@OriginalArg(1) Class54_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method4407(), 0);
	}

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "()V")
	@Override
	protected void method6839() {
		for (@Pc(6) Class6 local6 = this.aClass361_28.method7838(); local6 != null; local6 = this.aClass361_28.method7845()) {
			((Class6_Sub15_Sub1) local6).method2005();
		}
		if (this.aClass212_1 != null) {
			this.aClass212_1.method5123();
		}
		if (this.anOpenGL2 != null) {
			this.method3938();
			@Pc(40) Enumeration local40 = this.aHashtable3.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable3.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean292) {
			Static397.method5811(true, false);
			this.aBoolean292 = false;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Z)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "(B)V")
	public void method3908() {
		if (this.anInt4579 == 16) {
			return;
		}
		this.method3933();
		this.method3945(true);
		this.method3959(true);
		this.method3965(true);
		this.method3937(1);
		this.anInt4579 = 16;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(JI)V")
	public synchronized void method3909(@OriginalArg(0) long arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong263 = arg0;
		this.aClass361_35.method7833(local7);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!qh;I)V")
	public void method3910(@OriginalArg(0) Interface20 arg0) {
		if (this.aBoolean307) {
			this.method3967(arg0);
			this.method3948(arg0);
		} else if (this.anInt4559 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt4559 >= 0) {
				this.anInterface20Array1[this.anInt4559].method1759();
			}
			this.anInterface20_1 = this.anInterface20_2 = this.anInterface20Array1[++this.anInt4559] = arg0;
			this.anInterface20_1.method1763();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IIII)V")
	public void method3911(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(Z)V")
	private void method3912() {
		if (this.anInt4600 != 2) {
			this.anInt4600 = 2;
			this.method3943();
			this.method3958();
			this.anInt4579 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return this.anInt4574;
	}

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "(I)V")
	public void method3913() {
		if (this.anInt4579 == 8) {
			return;
		}
		this.method3912();
		this.method3945(true);
		this.method3959(true);
		this.method3965(true);
		this.method3937(1);
		this.anInt4579 = 8;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!kl;I)V")
	public void method3914(@OriginalArg(0) Class54_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method4407(), 0);
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)V")
	@Override
	public void method6873(@OriginalArg(0) int arg0) {
		this.method3915();
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "()Z")
	@Override
	public boolean method6832() {
		return true;
	}

	@OriginalMember(owner = "client!jaa", name = "z", descriptor = "()Z")
	@Override
	public boolean method6887() {
		return this.aClass6_Sub6_Sub1_1 != null && this.aClass6_Sub6_Sub1_1.method2534();
	}

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "(I)V")
	private void method3915() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL2.a()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static318.method4952(1000L);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "j", descriptor = "(I)V")
	private void method3916() {
		this.method3962(-2);
		for (@Pc(16) int local16 = this.anInt4596 - 1; local16 >= 0; local16--) {
			this.method3917(local16);
			this.method3985(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method3976(8448, 8448);
		this.method3966(34168, 2, 770);
		this.method3924();
		this.anInt4591 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt4568 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean295 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean293 = true;
		this.method3945(true);
		this.method3921(true);
		this.method3959(true);
		this.method3965(true);
		this.method3983();
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
		@Pc(134) float[] local134 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(136) int local136 = 0; local136 < 8; local136++) {
			@Pc(142) int local142 = local136 + 16384;
			OpenGL.glLightfv(local142, 4608, local134, 0);
			OpenGL.glLightf(local142, 4615, 0.0F);
			OpenGL.glLightf(local142, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt4590 = this.anInt4581 = -1;
		this.F();
	}

	@OriginalMember(owner = "client!jaa", name = "n", descriptor = "()I")
	@Override
	public int method6847() {
		return 4;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!po;I)V")
	@Override
	public void method6885(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class98_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method7256(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!jaa", name = "ca", descriptor = "(IIII)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4385 < arg3) {
			arg3 = this.anInt4385;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt4445) {
			arg2 = this.anInt4445;
		}
		this.anInt4578 = arg0;
		this.anInt4580 = arg2;
		this.anInt4586 = arg3;
		this.anInt4566 = arg1;
		OpenGL.glEnable(3089);
		this.method3960();
		this.method3954();
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(II)V")
	public void method3917(@OriginalArg(0) int arg0) {
		if (this.anInt4582 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt4582 = arg0;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(IIII)V")
	public void method3918(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6831(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static425.aFloat159 = arg1;
		Static449.aFloat163 = arg0;
		Static268.aFloat164 = arg2;
	}

	@OriginalMember(owner = "client!jaa", name = "k", descriptor = "()V")
	@Override
	public void k() {
		this.aBoolean308 = false;
		this.aClass301_1.method6555(0, false, 0, 0, false);
		this.method3904();
		this.method3949();
	}

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "(Z)V")
	public void method3919() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray40, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!wb;IIII)V")
	public void method3920(@OriginalArg(0) Interface24 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0.method5684();
		@Pc(14) int local14 = arg1 * this.method3964(local7);
		this.method3926(arg0);
		OpenGL.glDrawElements(4, arg2, local7, arg0.method5681() + (long) local14);
	}

	@OriginalMember(owner = "client!jaa", name = "D", descriptor = "()Z")
	@Override
	public boolean method6896() {
		return true;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IZ)V")
	public void method3921(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean313 != arg0) {
			this.aBoolean313 = arg0;
			this.method3947();
			this.anInt4579 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "(B)V")
	private void method3922() {
		this.aClass54_Sub2_4 = new Class54_Sub2();
		this.aClass54_Sub2_3 = new Class54_Sub2();
		this.aClass51Array1 = new Class51[this.anInt4596];
		this.aClass51_Sub1_3 = new Class51_Sub1(this, 3553, 6408, 1, 1);
		new Class51_Sub1(this, 3553, 6408, 1, 1);
		new Class51_Sub1(this, 3553, 6408, 1, 1);
		this.aClass20_Sub2_10 = new Class20_Sub2(this);
		this.aClass20_Sub2_8 = new Class20_Sub2(this);
		this.aClass20_Sub2_6 = new Class20_Sub2(this);
		this.aClass20_Sub2_4 = new Class20_Sub2(this);
		this.aClass20_Sub2_1 = new Class20_Sub2(this);
		this.aClass20_Sub2_5 = new Class20_Sub2(this);
		this.aClass20_Sub2_9 = new Class20_Sub2(this);
		this.aClass20_Sub2_3 = new Class20_Sub2(this);
		this.aClass20_Sub2_2 = new Class20_Sub2(this);
		this.aClass20_Sub2_7 = new Class20_Sub2(this);
		if (this.aBoolean302) {
			this.aClass74_4 = new Class74(this);
			new Class74(this);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!qh;B)V")
	public void method3923(@OriginalArg(0) Interface20 arg0) {
		if (this.anInt4561 < 0 || this.anInterface20Array2[this.anInt4561] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface20Array2[this.anInt4561--] = null;
		arg0.method1762();
		if (this.anInt4561 >= 0) {
			this.anInterface20_2 = this.anInterface20Array2[this.anInt4561];
			this.anInterface20_2.method1758();
		} else {
			this.anInterface20_2 = null;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "(B)V")
	private void method3924() {
		if (this.aBoolean306) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean306 = false;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt4590;
		if (local11 || this.aFloat106 != arg1 || arg2 != this.aFloat107) {
			this.aFloat106 = arg1;
			this.anInt4590 = arg0;
			this.aFloat107 = arg2;
			if (local11) {
				this.aFloat93 = (float) (this.anInt4590 & 0xFF00) / 65280.0F;
				this.aFloat103 = (float) (this.anInt4590 & 0xFF0000) / 1.671168E7F;
				this.aFloat108 = (float) (this.anInt4590 & 0xFF) / 255.0F;
				this.method3942();
			}
			this.method3975();
		}
		if (arg3 == this.aFloatArray43[0] && arg4 == this.aFloatArray43[1] && this.aFloatArray43[2] == arg5) {
			return;
		}
		this.aFloatArray43[1] = arg4;
		this.aFloatArray43[0] = arg3;
		this.aFloatArray43[2] = arg5;
		this.aFloatArray41[2] = -arg5;
		this.aFloatArray41[1] = -arg4;
		this.aFloatArray41[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray40[1] = arg4 * local138;
		this.aFloatArray40[0] = local138 * arg3;
		this.aFloatArray40[2] = local138 * arg5;
		this.aFloatArray44[2] = -this.aFloatArray40[2];
		this.aFloatArray44[1] = -this.aFloatArray40[1];
		this.aFloatArray44[0] = -this.aFloatArray40[0];
		this.method3919();
		this.anInt4583 = (int) (arg3 * 256.0F / arg4);
		this.anInt4594 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "(I)Lclient!i;")
	@Override
	public Class6_Sub15 method6898(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub15_Sub1 local8 = new Class6_Sub15_Sub1(arg0);
		this.aClass361_28.method7833(local8);
		return local8;
	}

	@OriginalMember(owner = "client!jaa", name = "x", descriptor = "()Lclient!q;")
	@Override
	public Class54 method6882() {
		return new Class54_Sub2();
	}

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "(II)V")
	public void method3925(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method3976(7681, 7681);
		} else if (arg0 == 0) {
			this.method3976(8448, 8448);
		} else if (arg0 == 2) {
			this.method3976(34165, 7681);
		} else if (arg0 == 3) {
			this.method3976(260, 8448);
		} else if (arg0 == 4) {
			this.method3976(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!wb;I)V")
	public void method3926(@OriginalArg(0) Interface24 arg0) {
		if (this.anInterface24_2 != arg0) {
			if (this.aBoolean309) {
				OpenGL.glBindBufferARB(34963, arg0.method5682());
			}
			this.anInterface24_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!ig;)V")
	@Override
	public void method6888(@OriginalArg(0) Class144 arg0) {
		this.aClass258_1.method5948(this, arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I[BIIZ)Lclient!ad;")
	public Interface1 method3927(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		return (Interface1) (this.aBoolean309 && (!arg3 || this.aBoolean305) ? new Class50_Sub1(this, arg2, arg0, arg1, arg3) : new Class77_Sub2(this, arg2, arg0, arg1));
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class58 method6874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class58_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!iba;Z)Lclient!xa;")
	@Override
	public Class58 method6889(@OriginalArg(0) Class140 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt4129 * arg0.anInt4127];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray38 == null) {
			for (local21 = 0; local21 < arg0.anInt4129; local21++) {
				for (local25 = 0; local25 < arg0.anInt4127; local25++) {
					@Pc(79) int local79 = arg0.anIntArray259[arg0.aByteArray39[local14++] & 0xFF];
					local12[local16++] = local79 == 0 ? 0 : local79 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt4129; local21++) {
				for (local25 = 0; local25 < arg0.anInt4127; local25++) {
					local12[local16++] = arg0.aByteArray38[local14] << 24 | arg0.anIntArray259[arg0.aByteArray39[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(118) Class58 local118 = this.method6863(local12, arg0.anInt4127, arg0.anInt4127, arg0.anInt4129);
		local118.EA(arg0.anInt4125, arg0.anInt4126, arg0.anInt4124, arg0.anInt4128);
		return local118;
	}

	@OriginalMember(owner = "client!jaa", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.method3937(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6865(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6848();
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IIZ)V")
	public synchronized void method3928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class6_Sub35 local14 = new Class6_Sub35(arg1);
		local14.aLong263 = arg0;
		this.aClass361_31.method7833(local14);
	}

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "(I)V")
	@Override
	public void method6905(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6823(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas10) {
			local5 = this.aLong122;
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable3.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas9) {
			this.method3935();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class86_Sub3 local6 = (Class86_Sub3) arg1;
		@Pc(9) Class51_Sub1_Sub1 local9 = local6.aClass51_Sub1_Sub1_5;
		this.method3906();
		this.method3985(local6.aClass51_Sub1_Sub1_5);
		this.method3937(1);
		this.method3976(7681, 8448);
		this.method3966(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat80 / (float) local9.anInt4054;
		@Pc(46) float local46 = local9.aFloat79 / (float) local9.anInt4055;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt4578 - arg2) * local39, local46 * (float) (this.anInt4566 - arg3));
		OpenGL.glVertex2i(this.anInt4578, this.anInt4566);
		OpenGL.glTexCoord2f((float) (this.anInt4578 - arg2) * local39, local46 * (float) (this.anInt4586 - arg3));
		OpenGL.glVertex2i(this.anInt4578, this.anInt4586);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4580 - arg2), (float) (this.anInt4586 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4580, this.anInt4586);
		OpenGL.glTexCoord2f((float) (this.anInt4580 - arg2) * local39, (float) (this.anInt4566 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4580, this.anInt4566);
		OpenGL.glEnd();
		this.method3966(5890, 0, 768);
	}

	@OriginalMember(owner = "client!jaa", name = "s", descriptor = "()F")
	public float method3929() {
		return this.aFloat94;
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(III)V")
	public synchronized void method3930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class6_Sub35 local12 = new Class6_Sub35(arg1);
		local12.aLong263 = arg0;
		this.aClass361_33.method7833(local12);
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IZ)V")
	public void method3931(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean319) {
			this.aBoolean319 = arg0;
			this.method3947();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "q", descriptor = "()Lclient!q;")
	@Override
	public Class54 method6851() {
		return this.aClass54_Sub2_1;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6894(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6844(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable3.containsKey(arg0)) {
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
			this.aHashtable3.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!jaa", name = "k", descriptor = "(I)I")
	private int method3932() {
		this.aString31 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString32 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString31.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString31.indexOf("brian paul") != -1 || this.aString31.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(55) String[] local55 = Static115.method2011(' ', local45.replace('.', ' '));
		if (local55.length >= 2) {
			try {
				@Pc(65) int local65 = Static444.method6313(local55[0]);
				@Pc(71) int local71 = Static444.method6313(local55[1]);
				this.anInt4569 = local65 * 10 + local71;
			} catch (@Pc(81) NumberFormatException local81) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt4569 < 12) {
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
		this.anInt4596 = local120[0];
		OpenGL.glGetIntegerv(34929, local120, 0);
		this.anInt4597 = local120[0];
		OpenGL.glGetIntegerv(34930, local120, 0);
		this.anInt4576 = local120[0];
		if (this.anInt4596 < 2 || this.anInt4597 < 2 || this.anInt4576 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean298 = Stream.b();
		this.aBoolean296 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean309 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean300 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean294 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean316 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean320 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean318 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean299 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.bf = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean314 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean311 = false;
		this.aBoolean302 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean307 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean317 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean312 = this.aBoolean307 & this.aBoolean317;
		OpenGL.glGetFloatv(2834, Static153.aFloatArray29, 0);
		this.aFloat104 = Static153.aFloatArray29[0];
		this.aFloat89 = Static153.aFloatArray29[1];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!jaa", name = "j", descriptor = "(B)V")
	private void method3933() {
		if (this.anInt4600 != 3) {
			this.anInt4600 = 3;
			this.method3952();
			this.method3958();
			this.anInt4579 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "m", descriptor = "()Z")
	@Override
	public boolean method6846() {
		if (this.aClass6_Sub6_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass6_Sub6_Sub1_1.method2534()) {
			if (!this.aClass212_1.method5122(this.aClass6_Sub6_Sub1_1)) {
				return false;
			}
			this.aClass264_1.method5974();
		}
		return true;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Lclient!qh;I)V")
	public void method3934(@OriginalArg(0) Interface20 arg0) {
		if (this.anInt4560 < 0 || arg0 != this.anInterface20Array3[this.anInt4560]) {
			throw new RuntimeException();
		}
		this.anInterface20Array3[this.anInt4560--] = null;
		arg0.method1760();
		if (this.anInt4560 < 0) {
			this.anInterface20_1 = null;
		} else {
			this.anInterface20_1 = this.anInterface20Array3[this.anInt4560];
			this.anInterface20_1.method1761();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIIF)Lclient!bj;")
	@Override
	public Class6_Sub7 method6827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub7_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!jaa", name = "l", descriptor = "(I)V")
	private void method3935() {
		if (this.aCanvas9 == null) {
			this.lb = this.anInt4500 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas9.getSize();
			this.lb = local10.width;
			this.anInt4500 = local10.height;
		}
		if (this.anInterface20_2 == null) {
			this.anInt4445 = this.lb;
			this.anInt4385 = this.anInt4500;
			this.method3956();
		}
		this.method3983();
		this.F();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class86 method6840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static454.method6422(arg1, arg3, this, arg2, arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIZLclient!jaclib/memory/Buffer;)Lclient!ad;")
	public Interface1 method3936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Buffer arg2) {
		return (Interface1) (this.aBoolean309 ? new Class50_Sub1(this, arg0, arg2, arg1, false) : new Class77_Sub2(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class58 method6863(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class58_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "(II)V")
	public void method3937(@OriginalArg(1) int arg0) {
		if (this.anInt4591 == arg0) {
			return;
		}
		@Pc(20) boolean local20;
		@Pc(22) byte local22;
		if (arg0 == 1) {
			local20 = true;
			local22 = 1;
		} else if (arg0 == 2) {
			local20 = false;
			local22 = 2;
		} else if (arg0 == 128) {
			local20 = true;
			local22 = 3;
		} else {
			local20 = false;
			local22 = 0;
		}
		if (!this.aBoolean293) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean293 = true;
		}
		if (local20 != this.aBoolean295) {
			if (local20) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean295 = local20;
		}
		if (local22 != this.anInt4568) {
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
			this.anInt4568 = local22;
		}
		this.anInt4579 &= 0xFFFFFFE3;
		this.anInt4591 = arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "m", descriptor = "(I)V")
	private void method3938() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6900(@OriginalArg(0) Canvas arg0) {
		this.aLong123 = 0L;
		this.aCanvas9 = null;
		if (arg0 == null || arg0 == this.aCanvas10) {
			this.aLong123 = this.aLong122;
			this.aCanvas9 = this.aCanvas10;
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable3.get(arg0);
			this.aLong123 = local26;
			this.aCanvas9 = arg0;
		}
		if (this.aCanvas9 == null || this.aLong123 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong123);
		this.method3935();
	}

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "()Z")
	@Override
	public boolean method6837() {
		return true;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!nj;IIII)Lclient!ba;")
	@Override
	public Class20 method6833(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class20_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!jaa", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt4588;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZBIZ)V")
	public void method3939(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt4595) {
			if (arg1 < 0) {
				this.method3924();
				this.method3985(null);
				this.method3925(0);
				if (!this.aBoolean308) {
					this.aClass301_1.method6555(0, arg0, 0, 0, arg2);
				}
			} else {
				@Pc(38) Class51_Sub1 local38 = this.aClass264_1.method5976(arg1);
				@Pc(44) Class313 local44 = super.anInterface4_15.method4234(arg1);
				if (local44.aByte97 == 0 && local44.aByte102 == 0) {
					this.method3924();
				} else {
					@Pc(60) int local60 = local44.aBoolean595 ? 64 : 128;
					@Pc(64) int local64 = local60 * 50;
					this.method3973(0.0F, (float) (this.anInt4557 % local64 * local44.aByte97) / (float) local64, (float) (this.anInt4557 % local64 * local44.aByte102) / (float) local64);
				}
				if (this.aBoolean308) {
					this.method3985(local38);
					this.method3925(local44.anInt8310);
				} else {
					this.aClass301_1.method6555(local44.anInt8313, arg0, local44.aByte99, local44.aByte98, arg2);
					if (!this.aClass301_1.method6553(local44.anInt8310, local38)) {
						this.method3985(local38);
						this.method3925(local44.anInt8310);
					}
				}
			}
			this.anInt4595 = arg1;
		}
		this.anInt4579 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "(II)V")
	public synchronized void method3940(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub35 local14 = new Class6_Sub35(arg0);
		this.aClass361_32.method7833(local14);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([BIIBZ)Lclient!wb;")
	public Interface24 method3941(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) boolean arg2) {
		return (Interface24) (this.aBoolean309 && (!arg2 || this.aBoolean305) ? new Class50_Sub2(this, 5123, arg0, arg1, arg2) : new Class77_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!jaa", name = "n", descriptor = "(I)V")
	private void method3942() {
		Static153.aFloatArray29[3] = 1.0F;
		Static153.aFloatArray29[2] = this.aFloat108 * this.aFloat90;
		Static153.aFloatArray29[1] = this.aFloat93 * this.aFloat90;
		Static153.aFloatArray29[0] = this.aFloat90 * this.aFloat103;
		OpenGL.glLightModelfv(2899, Static153.aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6897(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class6_Sub35 local19;
		while (!this.aClass361_30.method7837()) {
			local19 = (Class6_Sub35) this.aClass361_30.method7835();
			Static223.anIntArray278[local11++] = (int) local19.aLong263;
			this.anInt4563 -= local19.anInt6119;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static223.anIntArray278, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static223.anIntArray278, 0);
			local11 = 0;
		}
		while (!this.aClass361_31.method7837()) {
			local19 = (Class6_Sub35) this.aClass361_31.method7835();
			Static223.anIntArray278[local11++] = (int) local19.aLong263;
			this.anInt4562 -= local19.anInt6119;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static223.anIntArray278, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static223.anIntArray278, 0);
			local11 = 0;
		}
		while (!this.aClass361_32.method7837()) {
			local19 = (Class6_Sub35) this.aClass361_32.method7835();
			Static223.anIntArray278[local11++] = local19.anInt6119;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static223.anIntArray278, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static223.anIntArray278, 0);
			local11 = 0;
		}
		while (!this.aClass361_33.method7837()) {
			local19 = (Class6_Sub35) this.aClass361_33.method7835();
			Static223.anIntArray278[local11++] = (int) local19.aLong263;
			this.anInt4564 -= local19.anInt6119;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static223.anIntArray278, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static223.anIntArray278, 0);
		}
		while (!this.aClass361_29.method7837()) {
			local19 = (Class6_Sub35) this.aClass361_29.method7835();
			OpenGL.glDeleteLists((int) local19.aLong263, local19.anInt6119);
		}
		@Pc(210) Class6 local210;
		while (!this.aClass361_34.method7837()) {
			local210 = this.aClass361_34.method7835();
			OpenGL.glDeleteProgramARB((int) local210.aLong263);
		}
		while (!this.aClass361_35.method7837()) {
			local210 = this.aClass361_35.method7835();
			OpenGL.glDeleteObjectARB(local210.aLong263);
		}
		while (!this.aClass361_29.method7837()) {
			local19 = (Class6_Sub35) this.aClass361_29.method7835();
			OpenGL.glDeleteLists((int) local19.aLong263, local19.anInt6119);
		}
		this.aClass264_1.method5973();
		if (this.v() > 100663296 && Static8.method201() > this.aLong124 + 60000L) {
			System.gc();
			this.aLong124 = Static8.method201();
		}
		this.anInt4557 = local9;
	}

	@OriginalMember(owner = "client!jaa", name = "o", descriptor = "(I)V")
	private void method3943() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray42, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jaa", name = "sa", descriptor = "(II)V")
	@Override
	public void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt4588 && this.anInt4574 == arg1) {
			return;
		}
		this.anInt4574 = arg1;
		this.anInt4588 = arg0;
		this.method3977();
		this.method3904();
		if (this.anInt4600 == 3) {
			this.method3952();
		} else if (this.anInt4600 == 2) {
			this.method3943();
			return;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "v", descriptor = "()I")
	@Override
	public int v() {
		return this.anInt4562 + this.anInt4563 + this.anInt4564;
	}

	@OriginalMember(owner = "client!jaa", name = "G", descriptor = "()F")
	public float method3944() {
		return this.aFloat102;
	}

	@OriginalMember(owner = "client!jaa", name = "X", descriptor = "(III)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4581 == arg0 && arg1 == this.anInt4593 && this.anInt4589 == arg2) {
			return;
		}
		this.anInt4593 = arg1;
		this.anInt4589 = arg2;
		this.anInt4581 = arg0;
		if (this.aBoolean308) {
			return;
		}
		this.method3904();
		this.method3949();
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(IZ)V")
	public void method3945(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean297 != arg0) {
			this.aBoolean297 = arg0;
			this.method3949();
			this.anInt4579 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "w", descriptor = "()V")
	@Override
	public void method6881() {
		if (this.aClass6_Sub6_Sub1_1 != null && this.aClass6_Sub6_Sub1_1.method2534()) {
			this.aClass212_1.method5118(this.aClass6_Sub6_Sub1_1);
			this.aClass264_1.method5974();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 > this.anInt4566) {
			this.anInt4566 = arg1;
		}
		if (arg0 > this.anInt4578) {
			this.anInt4578 = arg0;
		}
		if (this.anInt4580 > arg2) {
			this.anInt4580 = arg2;
		}
		if (this.anInt4586 > arg3) {
			this.anInt4586 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method3960();
		this.method3954();
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method6891(@OriginalArg(0) Class6_Sub15 arg0) {
		this.aNativeHeap4 = ((Class6_Sub15_Sub1) arg0).aNativeHeap1;
		if (this.anInterface1_3 != null) {
			return;
		}
		@Pc(16) Class6_Sub21_Sub1 local16 = new Class6_Sub21_Sub1(80);
		if (this.aBoolean298) {
			local16.method3128(-1.0F);
			local16.method3128(-1.0F);
			local16.method3128(0.0F);
			local16.method3128(0.0F);
			local16.method3128(1.0F);
			local16.method3128(1.0F);
			local16.method3128(-1.0F);
			local16.method3128(0.0F);
			local16.method3128(1.0F);
			local16.method3128(1.0F);
			local16.method3128(1.0F);
			local16.method3128(1.0F);
			local16.method3128(0.0F);
			local16.method3128(1.0F);
			local16.method3128(0.0F);
			local16.method3128(-1.0F);
			local16.method3128(1.0F);
			local16.method3128(0.0F);
			local16.method3128(0.0F);
			local16.method3128(0.0F);
		} else {
			local16.method3126(-1.0F);
			local16.method3126(-1.0F);
			local16.method3126(0.0F);
			local16.method3126(0.0F);
			local16.method3126(1.0F);
			local16.method3126(1.0F);
			local16.method3126(-1.0F);
			local16.method3126(0.0F);
			local16.method3126(1.0F);
			local16.method3126(1.0F);
			local16.method3126(1.0F);
			local16.method3126(1.0F);
			local16.method3126(0.0F);
			local16.method3126(1.0F);
			local16.method3126(0.0F);
			local16.method3126(-1.0F);
			local16.method3126(1.0F);
			local16.method3126(0.0F);
			local16.method3126(0.0F);
			local16.method3126(0.0F);
		}
		this.anInterface1_3 = this.method3927(local16.aByteArray93, local16.anInt7338, 20, false);
		this.aClass45_2 = new Class45(this.anInterface1_3, 5126, 3, 0);
		this.aClass45_1 = new Class45(this.anInterface1_3, 5126, 2, 12);
		this.aClass258_1.method5944(this);
	}

	@OriginalMember(owner = "client!jaa", name = "ha", descriptor = "(F)V")
	@Override
	public void ha(@OriginalArg(0) float arg0) {
		if (this.aFloat90 != arg0) {
			this.aFloat90 = arg0;
			this.method3942();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "C", descriptor = "(IIIIII)V")
	@Override
	public void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method3972();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method3937(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean300) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean300) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
	@Override
	public void method6822(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt4543 = arg0;
		this.aClass264_1.method5974();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!ip;Lclient!ip;FLclient!ip;)Lclient!ip;")
	@Override
	public Class26 method6870(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class26 arg3) {
		if (arg0 != null && arg1 != null && this.bf && this.aBoolean302) {
			@Pc(15) Class26_Sub1_Sub1 local15 = null;
			@Pc(18) Class26_Sub1 local18 = (Class26_Sub1) arg0;
			@Pc(21) Class26_Sub1 local21 = (Class26_Sub1) arg1;
			@Pc(25) Class51_Sub3 local25 = local18.method4021();
			@Pc(29) Class51_Sub3 local29 = local21.method4021();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt3337 > local29.anInt3337 ? local25.anInt3337 : local29.anInt3337;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class26_Sub1_Sub1) {
					@Pc(60) Class26_Sub1_Sub1 local60 = (Class26_Sub1_Sub1) arg3;
					if (local48 == local60.method1259()) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class26_Sub1_Sub1(this, local48);
				}
				if (local15.method1260(arg2, local29, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!jaa", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4577 = arg3;
		this.aBoolean308 = true;
		this.anInt4584 = arg1;
		this.anInt4587 = arg0;
		this.anInt4572 = arg2;
		this.aClass301_1.method6555(0, false, 0, 3, false);
		this.aClass301_1.aClass60_Sub9_1.method7480();
		this.method3904();
		this.method3949();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class59 method6857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class59_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(IZ)I")
	public int method3946(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "(Z)V")
	private void method3947() {
		if (this.aBoolean313 && !this.aBoolean319) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method6877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class86 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class86_Sub3 local6 = (Class86_Sub3) arg5;
		@Pc(9) Class51_Sub1_Sub1 local9 = local6.aClass51_Sub1_Sub1_5;
		this.method3906();
		this.method3985(local6.aClass51_Sub1_Sub1_5);
		this.method3937(1);
		this.method3976(7681, 8448);
		this.method3966(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat80 / (float) local9.anInt4054;
		@Pc(46) float local46 = local9.aFloat79 / (float) local9.anInt4055;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(60) float local60 = (float) -arg1 + (float) arg3;
		@Pc(73) float local73 = (float) (1.0D / Math.sqrt((double) (local60 * local60 + local53 * local53)));
		@Pc(77) float local77 = local53 * local73;
		@Pc(81) float local81 = local60 * local73;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local77 + 0.35F, (float) arg3 + local81 + 0.35F);
		OpenGL.glEnd();
		this.method3966(5890, 0, 768);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!qh;Z)V")
	public void method3948(@OriginalArg(0) Interface20 arg0) {
		if (this.anInt4561 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4561 >= 0) {
			this.anInterface20Array2[this.anInt4561].method1762();
		}
		this.anInterface20_2 = this.anInterface20Array2[++this.anInt4561] = arg0;
		this.anInterface20_2.method1758();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass212_1.method5124(arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "(IIIII)V")
	@Override
	protected void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt4578 > arg2 + arg0 || arg0 - arg2 > this.anInt4580 || this.anInt4566 > arg2 + arg1 || this.anInt4586 < arg1 - arg2) {
			return;
		}
		this.method3972();
		this.method3937(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(75) float local75 = (float) arg0 + 0.35F;
		@Pc(80) float local80 = (float) arg1 + 0.35F;
		@Pc(84) int local84 = arg2 << 1;
		if (this.aFloat104 > (float) local84) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local75 + 1.0F, local80 + 1.0F);
			OpenGL.glVertex2f(local75 + 1.0F, local80 - 1.0F);
			OpenGL.glVertex2f(local75 - 1.0F, -1.0F + local80);
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
			local139 = Static505.method6819(local139);
			OpenGL.glVertex2f(local75 + (float) arg2, local80);
			for (@Pc(167) int local167 = 16384 - local139; local167 > 0; local167 -= local139) {
				OpenGL.glVertex2f((float) arg2 * Class211.aFloatArray51[local167] + local75, local80 + Class211.aFloatArray50[local167] * (float) arg2);
			}
			OpenGL.glVertex2f(local75 + (float) arg2, local80);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "()V")
	@Override
	public void method6841() {
	}

	@OriginalMember(owner = "client!jaa", name = "k", descriptor = "(B)V")
	private void method3949() {
		if (this.aBoolean297 && this.aBoolean308 | this.anInt4593 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IF)V")
	public void method3950(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat88) {
			this.aFloat88 = arg0;
			if (this.anInt4600 == 3) {
				this.method3952();
			}
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)I")
	@Override
	public int method6879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(II)I")
	@Override
	public int method6884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method3972();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method3937(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean300) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean300) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "()V")
	@Override
	public void method6834() {
		this.aClass212_1.method5121();
	}

	@OriginalMember(owner = "client!jaa", name = "l", descriptor = "(B)V")
	public void method3951() {
		if (this.anInt4579 == 4) {
			return;
		}
		this.method3984();
		this.method3945(false);
		this.method3921(false);
		this.method3959(false);
		this.method3965(false);
		this.method3962(-2);
		this.method3937(1);
		this.anInt4579 = 4;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I[Lclient!bj;)V")
	@Override
	public void method6869(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub7[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass6_Sub7Array3[local3] = arg1[local3];
		}
		this.anInt4575 = arg0;
		if (this.anInt4600 != 1) {
			this.method3903();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "(Z)V")
	private void method3952() {
		@Pc(15) float local15 = this.aFloat88 * (float) -this.anInt4601 / (float) this.anInt4570;
		@Pc(27) float local27 = (float) -this.anInt4573 * this.aFloat88 / (float) this.anInt4567;
		@Pc(42) float local42 = this.aFloat88 * (float) (this.anInt4445 - this.anInt4601) / (float) this.anInt4570;
		@Pc(61) float local61 = this.aFloat88 * (float) (this.anInt4385 - this.anInt4573) / (float) this.anInt4567;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local42 && local61 != local27) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local61, (double) -local27, (double) ((float) this.anInt4588 - this.aFloat102), (double) ((float) this.anInt4574 - this.aFloat102));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IB)I")
	public int method3953(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!jaa", name = "l", descriptor = "()V")
	@Override
	public void method6843() {
		if (!this.aBoolean315 || this.anInt4445 <= 0 || this.anInt4385 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt4578;
		@Pc(25) int local25 = this.anInt4580;
		@Pc(28) int local28 = this.anInt4566;
		@Pc(31) int local31 = this.anInt4586;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3983();
		this.method3945(false);
		this.method3921(false);
		this.method3959(false);
		this.method3965(false);
		this.method3985(null);
		this.method3962(-2);
		this.method3925(1);
		this.method3937(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt4445, this.anInt4385, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!jaa", name = "A", descriptor = "([I)V")
	@Override
	public void A(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt4566;
		arg0[2] = this.anInt4580;
		arg0[3] = this.anInt4586;
		arg0[0] = this.anInt4578;
	}

	@OriginalMember(owner = "client!jaa", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		@Pc(6) int local6 = this.anInt4604;
		this.anInt4604 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!jaa", name = "p", descriptor = "()Z")
	@Override
	public boolean method6849() {
		return true;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6868() {
		this.method3972();
		this.method3937(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([Lclient!ba;Lclient!ig;Lclient!q;[Lclient!po;I)V")
	@Override
	public void method6872(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class98_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method6885(arg0, arg2, arg3, arg4);
		this.method6888(arg1);
	}

	@OriginalMember(owner = "client!jaa", name = "m", descriptor = "(B)V")
	private void method3954() {
		if (this.anInt4578 <= this.anInt4580 && this.anInt4566 <= this.anInt4586) {
			OpenGL.glScissor(this.anInt4585 + this.anInt4578, -this.anInt4586 + this.anInt4385 + this.anInt4592, this.anInt4580 - this.anInt4578, -this.anInt4566 + this.anInt4586);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!qh;)V")
	public void method3955(@OriginalArg(1) Interface20 arg0) {
		if (this.aBoolean307) {
			this.method3934(arg0);
			this.method3923(arg0);
		} else if (this.anInt4559 >= 0 && arg0 == this.anInterface20Array1[this.anInt4559]) {
			this.anInterface20Array1[this.anInt4559--] = null;
			arg0.method1759();
			if (this.anInt4559 < 0) {
				this.anInterface20_1 = this.anInterface20_2 = null;
			} else {
				this.anInterface20_1 = this.anInterface20_2 = this.anInterface20Array1[this.anInt4559];
				this.anInterface20_1.method1763();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "JA", descriptor = "(I)V")
	@Override
	public void JA(@OriginalArg(0) int arg0) {
		this.anInt4556 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt4556++;
		}
		this.anInt4555 = 0x1 << this.anInt4556;
	}

	@OriginalMember(owner = "client!jaa", name = "p", descriptor = "(I)V")
	private void method3956() {
		OpenGL.glViewport(this.anInt4585, this.anInt4592, this.anInt4445, this.anInt4385);
	}

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "()Z")
	@Override
	public boolean method6836() {
		return false;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IFF)V")
	public void method3957(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat98 = arg0;
		this.aFloat109 = arg1;
		if (!this.aBoolean308) {
			this.method3904();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "q", descriptor = "(I)V")
	private void method3958() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef((float) 180, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass54_Sub2_4.method4407(), 0);
		if (this.aBoolean308) {
			this.aClass301_1.aClass60_Sub9_1.method7480();
		}
		this.method3919();
		this.method3903();
	}

	@OriginalMember(owner = "client!jaa", name = "o", descriptor = "()V")
	@Override
	public void method6848() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "(IZ)V")
	public void method3959(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean301) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean301 = arg0;
		this.anInt4579 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3972();
		this.method3937(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(22) float local22 = (float) arg3 - (float) arg1;
		@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local22 * local22)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(54) float local54 = local22 * local35;
		@Pc(58) float local58 = local16 * local35;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local58 + (float) arg2 + 0.35F, local54 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!jaa", name = "j", descriptor = "()Z")
	@Override
	public boolean method6842() {
		return true;
	}

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "(Z)V")
	private void method3960() {
		this.aFloat87 = this.anInt4578 - this.anInt4601;
		this.aFloat97 = this.anInt4586 - this.anInt4573;
		this.aFloat95 = this.anInt4580 - this.anInt4601;
		this.aFloat99 = this.anInt4566 - this.anInt4573;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZZI)V")
	public void method3961(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		this.method3939(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "(II)V")
	public void method3962(@OriginalArg(1) int arg0) {
		this.method3961(true, arg0);
	}

	@OriginalMember(owner = "client!jaa", name = "E", descriptor = "()Z")
	@Override
	public boolean method6901() {
		return true;
	}

	@OriginalMember(owner = "client!jaa", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass54_Sub2_4.aFloat121 + (float) arg1 * this.aClass54_Sub2_4.aFloat122 + this.aClass54_Sub2_4.aFloat123 * (float) arg0 + this.aClass54_Sub2_4.aFloat127 * (float) arg2;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass54_Sub2_4.aFloat121 + (float) arg3 * this.aClass54_Sub2_4.aFloat123 + this.aClass54_Sub2_4.aFloat122 * (float) arg4 + (float) arg5 * this.aClass54_Sub2_4.aFloat127;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt4588 > local28 && (float) this.anInt4588 > local59 || !(!(local28 > (float) this.anInt4574) || !((float) this.anInt4574 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass54_Sub2_4.aFloat128 + (float) arg2 * this.aClass54_Sub2_4.aFloat119 + this.aClass54_Sub2_4.aFloat126 * (float) arg0 + this.aClass54_Sub2_4.aFloat120 * (float) arg1) * (float) this.anInt4570 / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt4570 * ((float) arg5 * this.aClass54_Sub2_4.aFloat119 + this.aClass54_Sub2_4.aFloat126 * (float) arg3 + (float) arg4 * this.aClass54_Sub2_4.aFloat120 + this.aClass54_Sub2_4.aFloat128) / local59);
		if ((float) local123 < this.aFloat87 && (float) local155 < this.aFloat87 || this.aFloat95 < (float) local123 && this.aFloat95 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt4567 * (this.aClass54_Sub2_4.aFloat118 + this.aClass54_Sub2_4.aFloat129 * (float) arg1 + (float) arg0 * this.aClass54_Sub2_4.aFloat125 + this.aClass54_Sub2_4.aFloat124 * (float) arg2) / local28);
			@Pc(245) int local245 = (int) ((this.aClass54_Sub2_4.aFloat118 + (float) arg3 * this.aClass54_Sub2_4.aFloat125 + (float) arg4 * this.aClass54_Sub2_4.aFloat129 + this.aClass54_Sub2_4.aFloat124 * (float) arg5) * (float) this.anInt4567 / local59);
			return (!(this.aFloat99 > (float) local213) || !(this.aFloat99 > (float) local245)) && (!(this.aFloat97 < (float) local213) || !((float) local245 > this.aFloat97));
		}
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6902(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable3.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable3.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "(IIIII)V")
	@Override
	public void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3972();
		this.method3937(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIZ)Lclient!xa;")
	@Override
	public Class58 method6862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class58_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!jaa", name = "n", descriptor = "(B)V")
	public void method3963() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "(II)I")
	public int method3964(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZI)V")
	public void method3965(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean304 != arg0) {
			this.aBoolean304 = arg0;
			this.method3905();
			this.anInt4579 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!ub;[Lclient!iba;Z)Lclient!ta;")
	@Override
	public Class92 method6854(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class140[] arg1) {
		return new Class92_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(IIII)V")
	public void method3966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!jaa", name = "F", descriptor = "()V")
	@Override
	public void F() {
		this.anInt4580 = this.anInt4445;
		this.anInt4566 = 0;
		this.anInt4578 = 0;
		this.anInt4586 = this.anInt4385;
		OpenGL.glDisable(3089);
		this.method3960();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "()Z")
	@Override
	public boolean method6826() {
		return this.aClass6_Sub6_Sub1_1 != null && (this.anInt4535 <= 1 || this.aBoolean312);
	}

	@OriginalMember(owner = "client!jaa", name = "B", descriptor = "()V")
	@Override
	public void method6892() {
		this.method3965(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!jaa", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(49) float local49;
		@Pc(45) float local45;
		if (this.aClass51_Sub1_Sub1_1 == null || arg2 > this.aClass51_Sub1_Sub1_1.anInt4042 || this.aClass51_Sub1_Sub1_1.anInt4043 < arg3) {
			this.aClass51_Sub1_Sub1_1 = Static88.method1672(arg6, arg2, arg3, this);
			this.aClass51_Sub1_Sub1_1.method3535(false, false);
			local45 = this.aClass51_Sub1_Sub1_1.aFloat80;
			local49 = this.aClass51_Sub1_Sub1_1.aFloat79;
		} else {
			this.aClass51_Sub1_Sub1_1.method3542(arg2, 6406, false, arg6, arg3);
			local45 = this.aClass51_Sub1_Sub1_1.aFloat80 * (float) arg2 / (float) this.aClass51_Sub1_Sub1_1.anInt4042;
			local49 = this.aClass51_Sub1_Sub1_1.aFloat79 * (float) arg3 / (float) this.aClass51_Sub1_Sub1_1.anInt4043;
		}
		this.method3906();
		this.method3985(this.aClass51_Sub1_Sub1_1);
		this.method3937(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3902(arg5);
		this.method3976(34165, 34165);
		this.method3966(34166, 0, 768);
		this.method3966(5890, 2, 770);
		this.method3918(0, 34166);
		this.method3918(2, 5890);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = local151 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(166) float local166 = (float) arg3 + local154;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local151, local166);
		OpenGL.glTexCoord2f(local49, local45);
		OpenGL.glVertex2f(local159, local166);
		OpenGL.glTexCoord2f(local49, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method3966(5890, 0, 768);
		this.method3966(34166, 2, 770);
		this.method3918(0, 5890);
		this.method3918(2, 34166);
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IIIIII)Lclient!ip;")
	@Override
	public Class26 method6883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.bf ? new Class26_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!jaa", name = "LA", descriptor = "(IIII)V")
	@Override
	public void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean308) {
			throw new RuntimeException("");
		}
		this.anInt4587 = arg0;
		this.anInt4577 = arg3;
		this.anInt4584 = arg1;
		this.anInt4572 = arg2;
		this.aClass301_1.aClass60_Sub9_1.method7480();
		this.method3904();
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(ILclient!qh;)V")
	public void method3967(@OriginalArg(1) Interface20 arg0) {
		if (this.anInt4560 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4560 >= 0) {
			this.anInterface20Array3[this.anInt4560].method1760();
		}
		this.anInterface20_1 = this.anInterface20Array3[++this.anInt4560] = arg0;
		this.anInterface20_1.method1761();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIB)V")
	public synchronized void method3968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class6_Sub35 local14 = new Class6_Sub35(arg1);
		local14.aLong263 = arg0;
		this.aClass361_30.method7833(local14);
	}

	@OriginalMember(owner = "client!jaa", name = "j", descriptor = "(II)V")
	public synchronized void method3969(@OriginalArg(1) int arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong263 = arg0;
		this.aClass361_34.method7833(local7);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!ad;)V")
	public void method3970(@OriginalArg(1) Interface1 arg0) {
		if (arg0 != this.anInterface1_2) {
			if (this.aBoolean309) {
				OpenGL.glBindBufferARB(34962, arg0.method5395());
			}
			this.anInterface1_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "r", descriptor = "(I)V")
	public void method3971() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!jaa", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt4385 - local12 - arg1, arg2, 1, 32993, this.anInt4599, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!jaa", name = "t", descriptor = "()Lclient!taa;")
	@Override
	public Class312 method6871() {
		@Pc(7) int local7 = -1;
		if (this.aString31.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString31.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString31.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class312(local7, "OpenGL", this.anInt4569, this.aString32, 0L);
	}

	@OriginalMember(owner = "client!jaa", name = "aa", descriptor = "()I")
	@Override
	public int aa() {
		@Pc(6) int local6 = this.anInt4603;
		this.anInt4603 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!jaa", name = "m", descriptor = "(IIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4573 = arg1;
		this.anInt4567 = arg3;
		this.anInt4570 = arg2;
		this.anInt4601 = arg0;
		this.method3977();
		this.method3960();
		if (this.anInt4600 == 3) {
			this.method3952();
		} else if (this.anInt4600 == 2) {
			this.method3943();
			return;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "()Z")
	@Override
	public boolean method6830() {
		return this.aBoolean300 && (!this.method6887() || this.aBoolean312);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!ip;)V")
	@Override
	public void method6835(@OriginalArg(0) Class26 arg0) {
		this.aClass26_Sub1_1 = (Class26_Sub1) arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "o", descriptor = "(B)V")
	private void method3972() {
		if (this.anInt4579 == 1) {
			return;
		}
		this.method3984();
		this.method3945(false);
		this.method3921(false);
		this.method3959(false);
		this.method3965(false);
		this.method3985(null);
		this.method3962(-2);
		this.method3925(1);
		this.anInt4579 = 1;
	}

	@OriginalMember(owner = "client!jaa", name = "C", descriptor = "()Z")
	@Override
	public boolean method6895() {
		return false;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V")
	@Override
	public void method6861(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jaa", name = "ka", descriptor = "(FF)V")
	@Override
	public void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat94 == arg0 && arg1 == this.aFloat102) {
			return;
		}
		this.aFloat94 = arg0;
		this.aFloat102 = arg1;
		this.method3974();
		if (this.anInt4600 == 3) {
			this.method3952();
			return;
		}
		if (this.anInt4600 != 2) {
			return;
		}
		this.method3943();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(FFFI)V")
	private void method3973(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean306) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg2, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean306 = true;
	}

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "()Z")
	@Override
	public boolean method6838() {
		return this.aClass301_1.method6554();
	}

	@OriginalMember(owner = "client!jaa", name = "na", descriptor = "(III[I)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg0 * this.aClass54_Sub2_4.aFloat123 + (float) arg1 * this.aClass54_Sub2_4.aFloat122 + this.aClass54_Sub2_4.aFloat127 * (float) arg2 + this.aClass54_Sub2_4.aFloat121;
		if (local28 < (float) this.anInt4588 || (float) this.anInt4574 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt4570 * ((float) arg1 * this.aClass54_Sub2_4.aFloat120 + this.aClass54_Sub2_4.aFloat126 * (float) arg0 + (float) arg2 * this.aClass54_Sub2_4.aFloat119 + this.aClass54_Sub2_4.aFloat128) / local28);
		@Pc(117) int local117 = (int) (((float) arg1 * this.aClass54_Sub2_4.aFloat129 + this.aClass54_Sub2_4.aFloat125 * (float) arg0 + (float) arg2 * this.aClass54_Sub2_4.aFloat124 + this.aClass54_Sub2_4.aFloat118) * (float) this.anInt4567 / local28);
		if (this.aFloat87 <= (float) local85 && this.aFloat95 >= (float) local85 && this.aFloat99 <= (float) local117 && (float) local117 <= this.aFloat97) {
			arg3[0] = (int) ((float) local85 - this.aFloat87);
			arg3[1] = (int) ((float) local117 - this.aFloat99);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "r", descriptor = "()V")
	@Override
	public void method6858() {
		if (this.aBoolean302) {
			if (this.aClass74_3 != this.anInterface20_2) {
				throw new RuntimeException();
			}
			this.aClass74_3.method1777(0);
			this.aClass74_3.method1777(8);
			this.method3955(this.aClass74_3);
		} else if (this.aBoolean296) {
			this.aClass58_Sub2_1.GA(0, 0, this.anInt4445, this.anInt4385, 0, 0);
			this.anOpenGL2.setSurface(this.aLong123);
		} else {
			throw new RuntimeException("");
		}
		this.aClass58_Sub2_1 = null;
		this.anInt4385 = this.anInt4500;
		this.anInt4445 = this.lb;
		this.method3983();
		this.method3956();
		this.F();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!ba;Lclient!ig;Lclient!q;Lclient!po;I)V")
	@Override
	public void method6856(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class98_Sub5 arg3, @OriginalArg(4) int arg4) {
		arg0.method7256(arg2, arg3, arg4);
		this.method6888(arg1);
	}

	@OriginalMember(owner = "client!jaa", name = "s", descriptor = "(I)V")
	private void method3974() {
		if ((float) 0 == this.aFloat102) {
			this.aFloatArray42[14] = this.aFloat91;
			this.aFloatArray42[10] = this.aFloat96;
		} else {
			@Pc(32) float local32 = this.aFloat94 / (this.aFloat94 + this.aFloat102);
			@Pc(36) float local36 = local32 * local32;
			@Pc(51) float local51 = -this.aFloat91 * (1.0F - local32) * (1.0F - local32) / this.aFloat102;
			this.aFloatArray42[14] = local36 * this.aFloat91;
			this.aFloatArray42[10] = this.aFloat96 + local51;
		}
		this.aFloat100 = (this.aFloatArray42[14] - (float) this.anInt4574) / this.aFloatArray42[10];
		this.aFloat101 = (float) this.anInt4574 - this.aFloat102;
	}

	@OriginalMember(owner = "client!jaa", name = "t", descriptor = "(I)V")
	private void method3975() {
		Static153.aFloatArray29[3] = 1.0F;
		Static153.aFloatArray29[2] = this.aFloat106 * this.aFloat108;
		Static153.aFloatArray29[0] = this.aFloat103 * this.aFloat106;
		Static153.aFloatArray29[1] = this.aFloat93 * this.aFloat106;
		OpenGL.glLightfv(16384, 4609, Static153.aFloatArray29, 0);
		Static153.aFloatArray29[1] = -this.aFloat107 * this.aFloat93;
		Static153.aFloatArray29[0] = -this.aFloat107 * this.aFloat103;
		Static153.aFloatArray29[2] = this.aFloat108 * -this.aFloat107;
		Static153.aFloatArray29[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static153.aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IIB)V")
	public void method3976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4582 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(18) boolean local18 = false;
		if (arg0 != this.anInt4598) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local18 = true;
			this.anInt4598 = arg0;
		}
		if (arg1 != this.anInt4602) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local18 = true;
			this.anInt4602 = arg1;
		}
		if (local18) {
			this.anInt4579 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method6821(@OriginalArg(0) Class58 arg0) {
		this.aClass58_Sub2_1 = (Class58_Sub2) arg0;
		@Pc(65) Class6_Sub2 local65;
		if (this.aBoolean302) {
			if (this.aClass74_3 == null) {
				this.aClass74_3 = new Class74(this);
			}
			if (this.anInterface20_2 == this.aClass74_3) {
				throw new RuntimeException();
			}
			this.method3910(this.aClass74_3);
			@Pc(164) Class6_Sub2_Sub8 local164 = (Class6_Sub2_Sub8) this.aClass128_21.method3263((long) (this.aClass58_Sub2_1.QA() << 16 | this.aClass58_Sub2_1.b()));
			if (local164 == null) {
				local164 = new Class6_Sub2_Sub8(this, 6402, this.aClass58_Sub2_1.QA(), this.aClass58_Sub2_1.b());
				@Pc(197) Class6_Sub2_Sub8 local197;
				for (this.anInt4565 += local164.anInt3722; this.anInt4565 > 2097152; this.anInt4565 -= local197.anInt3722) {
					local65 = this.aClass180_4.method4472();
					if (local65 == null) {
						break;
					}
					local197 = (Class6_Sub2_Sub8) local65;
					local197.method7405();
					local197.method7804();
					local197.method3252();
				}
				this.aClass128_21.method3267(local164, (long) (this.aClass58_Sub2_1.QA() << 16 | this.aClass58_Sub2_1.b()));
			}
			this.aClass180_4.method4470(local164);
			this.aClass74_3.method1764(8, local164);
			this.aClass74_3.method1769(0, this.aClass58_Sub2_1.aClass51_Sub1_Sub1_2);
		} else if (this.aBoolean296) {
			@Pc(36) Class6_Sub2_Sub13 local36 = (Class6_Sub2_Sub13) this.aClass128_21.method3263((long) (this.aClass58_Sub2_1.QA() << 16 | this.aClass58_Sub2_1.b()));
			if (local36 == null) {
				local36 = new Class6_Sub2_Sub13(this, this.aClass58_Sub2_1.QA(), this.aClass58_Sub2_1.b());
				@Pc(72) Class6_Sub2_Sub13 local72;
				for (this.anInt4565 += local36.anInt5683 * 4; this.anInt4565 > 2097152; this.anInt4565 -= local72.anInt5683) {
					local65 = this.aClass180_4.method4472();
					if (local65 == null) {
						break;
					}
					local72 = (Class6_Sub2_Sub13) local65;
					local72.method7405();
					local72.method7804();
					this.anOpenGL2.releasePbuffer(local72.method4887());
				}
				this.aClass128_21.method3267(local36, (long) (this.aClass58_Sub2_1.QA() << 16 | this.aClass58_Sub2_1.b()));
			}
			this.aClass180_4.method4470(local36);
			this.anOpenGL2.setPbuffer(local36.method4887());
		} else {
			throw new RuntimeException("");
		}
		this.anInt4445 = arg0.QA();
		this.anInt4385 = arg0.b();
		this.method3983();
		this.method3956();
		this.F();
	}

	@OriginalMember(owner = "client!jaa", name = "u", descriptor = "()Z")
	@Override
	public boolean method6876() {
		return true;
	}

	@OriginalMember(owner = "client!jaa", name = "u", descriptor = "(I)V")
	private void method3977() {
		@Pc(6) float[] local6 = this.aFloatArray42;
		@Pc(26) float local26 = (float) (-this.anInt4601 * this.anInt4588) / (float) this.anInt4570;
		@Pc(41) float local41 = (float) ((this.anInt4445 - this.anInt4601) * this.anInt4588) / (float) this.anInt4570;
		@Pc(52) float local52 = (float) (this.anInt4588 * this.anInt4573) / (float) this.anInt4567;
		@Pc(67) float local67 = (float) (this.anInt4588 * (this.anInt4573 - this.anInt4385)) / (float) this.anInt4567;
		if (local41 == local26 || local67 == local52) {
			local6[3] = 0.0F;
			local6[12] = 0.0F;
			local6[11] = 0.0F;
			local6[9] = 0.0F;
			local6[1] = 0.0F;
			local6[7] = 0.0F;
			local6[10] = 1.0F;
			local6[5] = 1.0F;
			local6[13] = 0.0F;
			local6[15] = 1.0F;
			local6[0] = 1.0F;
			local6[14] = 0.0F;
			local6[6] = 0.0F;
			local6[8] = 0.0F;
			local6[4] = 0.0F;
			local6[2] = 0.0F;
		} else {
			@Pc(81) float local81 = (float) this.anInt4588 * 2.0F;
			local6[8] = (local26 + local41) / (local41 - local26);
			local6[4] = 0.0F;
			local6[11] = -1.0F;
			local6[7] = 0.0F;
			local6[2] = 0.0F;
			local6[5] = local81 / (local52 - local67);
			local6[9] = (local67 + local52) / (-local67 + local52);
			local6[13] = 0.0F;
			local6[0] = local81 / (local41 - local26);
			local6[12] = 0.0F;
			local6[3] = 0.0F;
			local6[14] = this.aFloat91 = -((float) this.anInt4574 * local81) / (float) (this.anInt4574 - this.anInt4588);
			local6[10] = this.aFloat96 = (float) -(this.anInt4588 + this.anInt4574) / (float) (this.anInt4574 - this.anInt4588);
			local6[1] = 0.0F;
			local6[15] = 0.0F;
			local6[6] = 0.0F;
		}
		this.method3974();
	}

	@OriginalMember(owner = "client!jaa", name = "p", descriptor = "(B)Lclient!gda;")
	public Class51_Sub3 method3978() {
		return this.aClass26_Sub1_1 == null ? null : this.aClass26_Sub1_1.method4021();
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(III)V")
	public void method3979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4592 = arg1;
		this.anInt4585 = arg0;
		this.method3956();
		this.method3954();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6829(@OriginalArg(0) Class54 arg0) {
		this.aClass54_Sub2_4 = (Class54_Sub2) arg0;
		this.aClass54_Sub2_3.method4411(this.aClass54_Sub2_4);
		if (this.anInt4600 != 1) {
			this.method3958();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(Z)V")
	@Override
	public void method6880(@OriginalArg(0) boolean arg0) {
		this.aBoolean310 = arg0;
		this.method3905();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!ce;ILclient!ce;Lclient!ce;Lclient!ce;)V")
	public void method3981(@OriginalArg(0) Class45 arg0, @OriginalArg(2) Class45 arg1, @OriginalArg(3) Class45 arg2, @OriginalArg(4) Class45 arg3) {
		if (arg2 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method3970(arg2.anInterface1_1);
			OpenGL.glVertexPointer(arg2.aByte22, arg2.aShort18, this.anInterface1_2.method5394(), this.anInterface1_2.method5396() + (long) arg2.aByte23);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method3970(arg3.anInterface1_1);
			OpenGL.glNormalPointer(arg3.aShort18, this.anInterface1_2.method5394(), this.anInterface1_2.method5396() + (long) arg3.aByte23);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method3970(arg1.anInterface1_1);
			OpenGL.glColorPointer(arg1.aByte22, arg1.aShort18, this.anInterface1_2.method5394(), this.anInterface1_2.method5396() + (long) arg1.aByte23);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method3970(arg0.anInterface1_1);
			OpenGL.glTexCoordPointer(arg0.aByte22, arg0.aShort18, this.anInterface1_2.method5394(), this.anInterface1_2.method5396() + (long) arg0.aByte23);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(FFIFF)V")
	public void method3982(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static153.aFloatArray29[3] = arg0;
		Static153.aFloatArray29[2] = arg3;
		Static153.aFloatArray29[0] = arg1;
		Static153.aFloatArray29[1] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static153.aFloatArray29, 0);
	}

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "(Z)V")
	public void method3983() {
		if (this.anInt4600 != 0) {
			this.anInt4600 = 0;
			this.anInt4579 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "A", descriptor = "()V")
	@Override
	public void method6890() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!jaa", name = "w", descriptor = "(I)V")
	private void method3984() {
		if (this.anInt4600 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt4445 > 0 && this.anInt4385 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt4445, (double) this.anInt4385, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt4600 = 1;
		this.anInt4579 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLclient!tj;)V")
	public void method3985(@OriginalArg(1) Class51 arg0) {
		@Pc(11) Class51 local11 = this.aClass51Array1[this.anInt4582];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt9463);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt9463);
				} else if (arg0.anInt9463 != local11.anInt9463) {
					OpenGL.glDisable(local11.anInt9463);
					OpenGL.glEnable(arg0.anInt9463);
				}
				OpenGL.glBindTexture(arg0.anInt9463, arg0.method7732());
			}
			this.aClass51Array1[this.anInt4582] = arg0;
		}
		this.anInt4579 &= 0xFFFFFFFE;
	}
}
