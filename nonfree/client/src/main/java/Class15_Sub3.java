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

@OriginalClass("client!ji")
public final class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "[I")
	public static final int[] anIntArray314 = new int[120];

	@OriginalMember(owner = "client!ji", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!ji", name = "ac", descriptor = "I")
	private int anInt5218;

	@OriginalMember(owner = "client!ji", name = "dd", descriptor = "I")
	public int anInt5270;

	@OriginalMember(owner = "client!ji", name = "fd", descriptor = "I")
	private int anInt5272;

	@OriginalMember(owner = "client!ji", name = "oe", descriptor = "I")
	public int anInt5325;

	@OriginalMember(owner = "client!ji", name = "ue", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!ji", name = "xe", descriptor = "Lclient!qf;")
	private Class269 aClass269_3;

	@OriginalMember(owner = "client!ji", name = "ye", descriptor = "Lclient!mga;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!ji", name = "ze", descriptor = "Lclient!mga;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!ji", name = "Ae", descriptor = "Lclient!rq;")
	private Class37_Sub3 aClass37_Sub3_1;

	@OriginalMember(owner = "client!ji", name = "Ie", descriptor = "I")
	private int anInt5331;

	@OriginalMember(owner = "client!ji", name = "Je", descriptor = "I")
	public int anInt5332;

	@OriginalMember(owner = "client!ji", name = "Ke", descriptor = "I")
	public int anInt5333;

	@OriginalMember(owner = "client!ji", name = "Le", descriptor = "I")
	private int anInt5334;

	@OriginalMember(owner = "client!ji", name = "Se", descriptor = "I")
	public int anInt5335;

	@OriginalMember(owner = "client!ji", name = "Ue", descriptor = "I")
	private int anInt5337;

	@OriginalMember(owner = "client!ji", name = "Ve", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!ji", name = "We", descriptor = "I")
	public int anInt5338;

	@OriginalMember(owner = "client!ji", name = "Ye", descriptor = "I")
	private int anInt5340;

	@OriginalMember(owner = "client!ji", name = "Ze", descriptor = "Z")
	private boolean aBoolean435;

	@OriginalMember(owner = "client!ji", name = "af", descriptor = "Z")
	private boolean aBoolean436;

	@OriginalMember(owner = "client!ji", name = "bf", descriptor = "Lclient!mf;")
	public Class21_Sub3 bf;

	@OriginalMember(owner = "client!ji", name = "cf", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!ji", name = "df", descriptor = "I")
	private int anInt5341;

	@OriginalMember(owner = "client!ji", name = "ef", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!ji", name = "gf", descriptor = "F")
	private float aFloat91;

	@OriginalMember(owner = "client!ji", name = "jf", descriptor = "I")
	private int anInt5343;

	@OriginalMember(owner = "client!ji", name = "lf", descriptor = "Z")
	public boolean aBoolean437;

	@OriginalMember(owner = "client!ji", name = "mf", descriptor = "Z")
	public boolean aBoolean438;

	@OriginalMember(owner = "client!ji", name = "qf", descriptor = "[Lclient!gq;")
	private Class11[] aClass11Array1;

	@OriginalMember(owner = "client!ji", name = "rf", descriptor = "Lclient!mf;")
	public Class21_Sub3 aClass21_Sub3_1;

	@OriginalMember(owner = "client!ji", name = "sf", descriptor = "Lclient!vv;")
	public Class346 aClass346_7;

	@OriginalMember(owner = "client!ji", name = "tf", descriptor = "I")
	private int anInt5345;

	@OriginalMember(owner = "client!ji", name = "uf", descriptor = "Lclient!mf;")
	public Class21_Sub3 aClass21_Sub3_2;

	@OriginalMember(owner = "client!ji", name = "vf", descriptor = "Z")
	private boolean aBoolean439;

	@OriginalMember(owner = "client!ji", name = "wf", descriptor = "Z")
	public boolean aBoolean440;

	@OriginalMember(owner = "client!ji", name = "xf", descriptor = "I")
	private int anInt5346;

	@OriginalMember(owner = "client!ji", name = "yf", descriptor = "Lclient!mf;")
	public Class21_Sub3 aClass21_Sub3_3;

	@OriginalMember(owner = "client!ji", name = "zf", descriptor = "Lclient!mf;")
	public Class21_Sub3 aClass21_Sub3_4;

	@OriginalMember(owner = "client!ji", name = "Af", descriptor = "Lclient!ch;")
	private Class11_Sub2_Sub1 aClass11_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ji", name = "Bf", descriptor = "Z")
	public boolean aBoolean441;

	@OriginalMember(owner = "client!ji", name = "Cf", descriptor = "Z")
	public boolean aBoolean442;

	@OriginalMember(owner = "client!ji", name = "Ef", descriptor = "I")
	private int anInt5347;

	@OriginalMember(owner = "client!ji", name = "Gf", descriptor = "Lclient!pf;")
	public Class255_Sub1 aClass255_Sub1_3;

	@OriginalMember(owner = "client!ji", name = "Jf", descriptor = "Z")
	private boolean aBoolean443;

	@OriginalMember(owner = "client!ji", name = "Of", descriptor = "F")
	private float aFloat97;

	@OriginalMember(owner = "client!ji", name = "Pf", descriptor = "Z")
	private boolean aBoolean445;

	@OriginalMember(owner = "client!ji", name = "Tf", descriptor = "I")
	public int anInt5353;

	@OriginalMember(owner = "client!ji", name = "Wf", descriptor = "Lclient!mf;")
	public Class21_Sub3 aClass21_Sub3_5;

	@OriginalMember(owner = "client!ji", name = "Xf", descriptor = "Lclient!vga;")
	public Class11_Sub2 aClass11_Sub2_3;

	@OriginalMember(owner = "client!ji", name = "Yf", descriptor = "I")
	private int anInt5355;

	@OriginalMember(owner = "client!ji", name = "ag", descriptor = "Ljava/lang/String;")
	private String aString55;

	@OriginalMember(owner = "client!ji", name = "bg", descriptor = "I")
	private int anInt5356;

	@OriginalMember(owner = "client!ji", name = "cg", descriptor = "F")
	private float aFloat99;

	@OriginalMember(owner = "client!ji", name = "dg", descriptor = "Z")
	private boolean aBoolean447;

	@OriginalMember(owner = "client!ji", name = "fg", descriptor = "Lclient!qf;")
	public Class269 aClass269_4;

	@OriginalMember(owner = "client!ji", name = "lg", descriptor = "Lclient!mf;")
	public Class21_Sub3 aClass21_Sub3_6;

	@OriginalMember(owner = "client!ji", name = "ng", descriptor = "Z")
	private boolean aBoolean449;

	@OriginalMember(owner = "client!ji", name = "og", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!ji", name = "qg", descriptor = "Z")
	private boolean aBoolean450;

	@OriginalMember(owner = "client!ji", name = "rg", descriptor = "I")
	public int anInt5360;

	@OriginalMember(owner = "client!ji", name = "tg", descriptor = "Lclient!mf;")
	public Class21_Sub3 aClass21_Sub3_7;

	@OriginalMember(owner = "client!ji", name = "wg", descriptor = "Lclient!vv;")
	public Class346 aClass346_8;

	@OriginalMember(owner = "client!ji", name = "xg", descriptor = "Z")
	private boolean aBoolean452;

	@OriginalMember(owner = "client!ji", name = "Cg", descriptor = "F")
	private float aFloat104;

	@OriginalMember(owner = "client!ji", name = "Fg", descriptor = "Lclient!sj;")
	private Interface16 anInterface16_3;

	@OriginalMember(owner = "client!ji", name = "Gg", descriptor = "J")
	private long aLong149;

	@OriginalMember(owner = "client!ji", name = "Ig", descriptor = "Z")
	public boolean aBoolean454;

	@OriginalMember(owner = "client!ji", name = "Lg", descriptor = "Z")
	private boolean aBoolean456;

	@OriginalMember(owner = "client!ji", name = "Ng", descriptor = "Z")
	public boolean aBoolean457;

	@OriginalMember(owner = "client!ji", name = "Og", descriptor = "Lclient!mf;")
	public Class21_Sub3 aClass21_Sub3_8;

	@OriginalMember(owner = "client!ji", name = "Qg", descriptor = "Lclient!pf;")
	public Class255_Sub1 aClass255_Sub1_4;

	@OriginalMember(owner = "client!ji", name = "Sg", descriptor = "Ljava/lang/String;")
	private String aString56;

	@OriginalMember(owner = "client!ji", name = "Tg", descriptor = "Z")
	public boolean aBoolean459;

	@OriginalMember(owner = "client!ji", name = "Ug", descriptor = "I")
	private int anInt5368;

	@OriginalMember(owner = "client!ji", name = "Vg", descriptor = "I")
	private int anInt5369;

	@OriginalMember(owner = "client!ji", name = "Wg", descriptor = "Lclient!mf;")
	public Class21_Sub3 aClass21_Sub3_9;

	@OriginalMember(owner = "client!ji", name = "Zg", descriptor = "Lclient!ul;")
	private Interface21 anInterface21_2;

	@OriginalMember(owner = "client!ji", name = "ah", descriptor = "Z")
	public boolean aBoolean461;

	@OriginalMember(owner = "client!ji", name = "dh", descriptor = "Z")
	private boolean aBoolean463;

	@OriginalMember(owner = "client!ji", name = "eh", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!ji", name = "fh", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!ji", name = "gh", descriptor = "Lclient!vj;")
	private Class108_Sub1 aClass108_Sub1_1;

	@OriginalMember(owner = "client!ji", name = "ih", descriptor = "Lclient!sj;")
	private Interface16 anInterface16_4;

	@OriginalMember(owner = "client!ji", name = "oh", descriptor = "I")
	private int anInt5372;

	@OriginalMember(owner = "client!ji", name = "ph", descriptor = "I")
	private int anInt5373;

	@OriginalMember(owner = "client!ji", name = "Ec", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!ji", name = "de", descriptor = "I")
	public int anInt5317 = 128;

	@OriginalMember(owner = "client!ji", name = "ge", descriptor = "Lclient!ee;")
	private final Class79 aClass79_1 = new Class79();

	@OriginalMember(owner = "client!ji", name = "le", descriptor = "Lclient!pf;")
	private final Class255_Sub1 aClass255_Sub1_1 = new Class255_Sub1();

	@OriginalMember(owner = "client!ji", name = "ne", descriptor = "Lclient!pf;")
	public final Class255_Sub1 aClass255_Sub1_2 = new Class255_Sub1();

	@OriginalMember(owner = "client!ji", name = "re", descriptor = "Z")
	private boolean aBoolean434 = false;

	@OriginalMember(owner = "client!ji", name = "te", descriptor = "I")
	public int anInt5327 = 3;

	@OriginalMember(owner = "client!ji", name = "se", descriptor = "I")
	public int anInt5326 = 8;

	@OriginalMember(owner = "client!ji", name = "pe", descriptor = "Lclient!ki;")
	private final Class183 aClass183_29 = new Class183();

	@OriginalMember(owner = "client!ji", name = "ve", descriptor = "[Lclient!mga;")
	private final Interface9[] anInterface9Array1 = new Interface9[4];

	@OriginalMember(owner = "client!ji", name = "Be", descriptor = "I")
	private int anInt5329 = -1;

	@OriginalMember(owner = "client!ji", name = "Ce", descriptor = "[Lclient!mga;")
	private final Interface9[] anInterface9Array2 = new Interface9[4];

	@OriginalMember(owner = "client!ji", name = "De", descriptor = "[Lclient!mga;")
	private final Interface9[] anInterface9Array3 = new Interface9[4];

	@OriginalMember(owner = "client!ji", name = "we", descriptor = "I")
	private int anInt5328 = -1;

	@OriginalMember(owner = "client!ji", name = "Fe", descriptor = "I")
	private int anInt5330 = -1;

	@OriginalMember(owner = "client!ji", name = "Ee", descriptor = "Lclient!ca;")
	private final Class39 aClass39_2 = new Class39();

	@OriginalMember(owner = "client!ji", name = "Ge", descriptor = "Lclient!bc;")
	private final Class25 aClass25_21 = new Class25(16);

	@OriginalMember(owner = "client!ji", name = "He", descriptor = "Lclient!ki;")
	private final Class183 aClass183_30 = new Class183();

	@OriginalMember(owner = "client!ji", name = "Me", descriptor = "Lclient!ki;")
	private final Class183 aClass183_31 = new Class183();

	@OriginalMember(owner = "client!ji", name = "Ne", descriptor = "Lclient!ki;")
	private final Class183 aClass183_32 = new Class183();

	@OriginalMember(owner = "client!ji", name = "Oe", descriptor = "Lclient!ki;")
	private final Class183 aClass183_33 = new Class183();

	@OriginalMember(owner = "client!ji", name = "Pe", descriptor = "Lclient!ki;")
	private final Class183 aClass183_34 = new Class183();

	@OriginalMember(owner = "client!ji", name = "Qe", descriptor = "Lclient!ki;")
	private final Class183 aClass183_35 = new Class183();

	@OriginalMember(owner = "client!ji", name = "Re", descriptor = "Lclient!ki;")
	private final Class183 aClass183_36 = new Class183();

	@OriginalMember(owner = "client!ji", name = "ff", descriptor = "I")
	private int anInt5342 = 8448;

	@OriginalMember(owner = "client!ji", name = "of", descriptor = "[F")
	private final float[] aFloatArray39 = new float[16];

	@OriginalMember(owner = "client!ji", name = "Te", descriptor = "I")
	private int anInt5336 = 8448;

	@OriginalMember(owner = "client!ji", name = "Df", descriptor = "[F")
	private final float[] aFloatArray40 = new float[4];

	@OriginalMember(owner = "client!ji", name = "Xe", descriptor = "I")
	private int anInt5339 = 0;

	@OriginalMember(owner = "client!ji", name = "pf", descriptor = "F")
	private float aFloat94 = -1.0F;

	@OriginalMember(owner = "client!ji", name = "Hf", descriptor = "F")
	private float aFloat95 = 1.0F;

	@OriginalMember(owner = "client!ji", name = "Ff", descriptor = "I")
	public int anInt5348 = 0;

	@OriginalMember(owner = "client!ji", name = "gg", descriptor = "F")
	public float aFloat100 = 1.0F;

	@OriginalMember(owner = "client!ji", name = "Uf", descriptor = "I")
	public int anInt5354 = 0;

	@OriginalMember(owner = "client!ji", name = "pg", descriptor = "I")
	private int anInt5359 = 0;

	@OriginalMember(owner = "client!ji", name = "Nf", descriptor = "I")
	private int anInt5351 = 0;

	@OriginalMember(owner = "client!ji", name = "eg", descriptor = "I")
	private int anInt5357 = 0;

	@OriginalMember(owner = "client!ji", name = "ug", descriptor = "I")
	public int anInt5361 = 0;

	@OriginalMember(owner = "client!ji", name = "yg", descriptor = "[F")
	private final float[] aFloatArray43 = new float[4];

	@OriginalMember(owner = "client!ji", name = "Qf", descriptor = "[F")
	public final float[] aFloatArray41 = new float[4];

	@OriginalMember(owner = "client!ji", name = "kg", descriptor = "[Lclient!pn;")
	private final Class3_Sub28[] aClass3_Sub28Array4 = new Class3_Sub28[Static585.anInt10270];

	@OriginalMember(owner = "client!ji", name = "Dg", descriptor = "F")
	public float aFloat105 = -1.0F;

	@OriginalMember(owner = "client!ji", name = "Kf", descriptor = "I")
	public int anInt5350 = 0;

	@OriginalMember(owner = "client!ji", name = "Hg", descriptor = "I")
	public int anInt5365 = 3584;

	@OriginalMember(owner = "client!ji", name = "Pg", descriptor = "I")
	private int anInt5367 = -1;

	@OriginalMember(owner = "client!ji", name = "If", descriptor = "I")
	public int anInt5349 = 512;

	@OriginalMember(owner = "client!ji", name = "Bg", descriptor = "F")
	private float aFloat103 = 1.0F;

	@OriginalMember(owner = "client!ji", name = "jg", descriptor = "I")
	private int anInt5358 = -1;

	@OriginalMember(owner = "client!ji", name = "Kg", descriptor = "F")
	private float aFloat106 = 0.0F;

	@OriginalMember(owner = "client!ji", name = "nf", descriptor = "F")
	public float aFloat93 = 1.0F;

	@OriginalMember(owner = "client!ji", name = "zg", descriptor = "I")
	public int anInt5363 = 512;

	@OriginalMember(owner = "client!ji", name = "Sf", descriptor = "I")
	public int anInt5352 = -1;

	@OriginalMember(owner = "client!ji", name = "kf", descriptor = "I")
	public int anInt5344 = -1;

	@OriginalMember(owner = "client!ji", name = "Ag", descriptor = "I")
	private int anInt5364 = 0;

	@OriginalMember(owner = "client!ji", name = "Rf", descriptor = "F")
	public float aFloat98 = 1.0F;

	@OriginalMember(owner = "client!ji", name = "hf", descriptor = "F")
	private float aFloat92 = 3000.0F;

	@OriginalMember(owner = "client!ji", name = "Mf", descriptor = "F")
	public float aFloat96 = -1.0F;

	@OriginalMember(owner = "client!ji", name = "Mg", descriptor = "I")
	private int anInt5366 = 0;

	@OriginalMember(owner = "client!ji", name = "ch", descriptor = "I")
	public int anInt5370 = 50;

	@OriginalMember(owner = "client!ji", name = "bh", descriptor = "Z")
	private boolean aBoolean462 = true;

	@OriginalMember(owner = "client!ji", name = "ig", descriptor = "F")
	public float aFloat101 = 3584.0F;

	@OriginalMember(owner = "client!ji", name = "mg", descriptor = "[F")
	private final float[] aFloatArray42 = new float[4];

	@OriginalMember(owner = "client!ji", name = "Yg", descriptor = "F")
	public float aFloat107 = 3584.0F;

	@OriginalMember(owner = "client!ji", name = "jh", descriptor = "I")
	public int anInt5371 = -1;

	@OriginalMember(owner = "client!ji", name = "hh", descriptor = "F")
	private float aFloat110 = -1.0F;

	@OriginalMember(owner = "client!ji", name = "Zf", descriptor = "Lclient!ph;")
	public Class3_Sub7_Sub2 aClass3_Sub7_Sub2_3 = new Class3_Sub7_Sub2(8192);

	@OriginalMember(owner = "client!ji", name = "kh", descriptor = "[I")
	public int[] anIntArray315 = new int[1];

	@OriginalMember(owner = "client!ji", name = "lh", descriptor = "[I")
	public int[] anIntArray316 = new int[1];

	@OriginalMember(owner = "client!ji", name = "nh", descriptor = "[B")
	public final byte[] aByteArray61 = new byte[16384];

	@OriginalMember(owner = "client!ji", name = "mh", descriptor = "[I")
	public int[] anIntArray317 = new int[1];

	@OriginalMember(owner = "client!ji", name = "Ob", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas9;

	@OriginalMember(owner = "client!ji", name = "Tb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!ji", name = "je", descriptor = "I")
	public final int anInt5322;

	@OriginalMember(owner = "client!ji", name = "bd", descriptor = "Lclient!jaggl/OpenGL;")
	public OpenGL anOpenGL2;

	@OriginalMember(owner = "client!ji", name = "cc", descriptor = "J")
	private final long aLong147;

	@OriginalMember(owner = "client!ji", name = "Cd", descriptor = "J")
	private long aLong148;

	@OriginalMember(owner = "client!ji", name = "vg", descriptor = "I")
	public final int anInt5362;

	@OriginalMember(owner = "client!ji", name = "Rg", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!ji", name = "Xg", descriptor = "Z")
	private boolean aBoolean460;

	@OriginalMember(owner = "client!ji", name = "Eg", descriptor = "Z")
	public boolean aBoolean453;

	@OriginalMember(owner = "client!ji", name = "Vf", descriptor = "Z")
	public boolean aBoolean446;

	@OriginalMember(owner = "client!ji", name = "sg", descriptor = "Z")
	private boolean aBoolean451;

	@OriginalMember(owner = "client!ji", name = "hg", descriptor = "Z")
	public boolean aBoolean448;

	@OriginalMember(owner = "client!ji", name = "Lf", descriptor = "Z")
	public boolean aBoolean444;

	@OriginalMember(owner = "client!ji", name = "Jg", descriptor = "Z")
	private final boolean aBoolean455;

	@OriginalMember(owner = "client!ji", name = "Xd", descriptor = "Lclient!rp;")
	private final Class287 aClass287_1;

	@OriginalMember(owner = "client!ji", name = "qe", descriptor = "Lclient!gm;")
	public final Class124 aClass124_1;

	@OriginalMember(owner = "client!ji", name = "be", descriptor = "Lclient!ob;")
	private final Class235 aClass235_1;

	@OriginalMember(owner = "client!ji", name = "Yd", descriptor = "Lclient!cf;")
	private Class3_Sub8_Sub1 aClass3_Sub8_Sub1_1;

	@OriginalMember(owner = "client!ji", name = "Zd", descriptor = "Lclient!hv;")
	private final Class151 aClass151_1;

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 120; local10++) {
			@Pc(15) int local15 = local10 + 1;
			@Pc(28) int local28 = (int) (Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D + (double) local15);
			local8 += local28;
			anIntArray314[local10] = local8 / 4;
		}
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;I)V")
	public Class15_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		this.aCanvas10 = this.aCanvas9 = arg0;
		this.anInt5322 = arg2;
		if (!Static68.method1703("jaclib")) {
			throw new RuntimeException("");
		} else if (Static68.method1703("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong148 = this.aLong147 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt5322);
				if (this.aLong147 == 0L) {
					throw new RuntimeException("");
				}
				this.method4375();
				@Pc(322) int local322 = this.method4393();
				if (local322 != 0) {
					throw new RuntimeException("");
				}
				this.anInt5362 = this.aBoolean442 ? 33639 : 5121;
				@Pc(345) int local345;
				if (this.aString55.indexOf("radeon") != -1) {
					local345 = 0;
					@Pc(347) boolean local347 = false;
					@Pc(349) boolean local349 = false;
					@Pc(358) String[] local358 = Static335.method5785(' ', this.aString55.replace('/', ' '));
					for (@Pc(360) int local360 = 0; local360 < local358.length; local360++) {
						@Pc(365) String local365 = local358[local360];
						try {
							if (local365.length() > 0) {
								if (local365.charAt(0) == 'x' && local365.length() >= 3 && Static256.method4564(local365.substring(1, 3))) {
									local349 = true;
									local365 = local365.substring(1);
								}
								if (local365.equals("hd")) {
									local347 = true;
								} else {
									if (local365.startsWith("hd")) {
										local347 = true;
										local365 = local365.substring(2);
									}
									if (local365.length() >= 4 && Static256.method4564(local365.substring(0, 4))) {
										local345 = Static403.method6559(local365.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(429) Exception local429) {
						}
					}
					if (!local347 || local345 < 4000) {
						this.aBoolean458 = false;
					}
					if (!local349 && !local347) {
						if (local345 >= 7000 && local345 <= 7999) {
							this.aBoolean460 = false;
						}
						if (local345 >= 7000 && local345 <= 9250) {
							this.aBoolean453 = false;
						}
					}
					this.aBoolean446 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean451 = this.aBoolean460;
					this.aBoolean448 = true;
				}
				if (this.aString56.indexOf("intel") != -1) {
					this.aBoolean444 = false;
				}
				this.aBoolean455 = !this.aString56.equals("s3 graphics");
				if (this.aBoolean460) {
					try {
						@Pc(518) int[] local518 = new int[1];
						OpenGL.glGenBuffersARB(1, local518, 0);
					} catch (@Pc(524) Throwable local524) {
						throw new RuntimeException("");
					}
				}
				Static67.method8226(true, false);
				this.aBoolean434 = true;
				this.aClass287_1 = new Class287(this, super.anInterface4_11);
				this.method4381();
				this.aClass124_1 = new Class124(this);
				this.aClass235_1 = new Class235(this);
				if (this.aClass235_1.method6009()) {
					this.aClass3_Sub8_Sub1_1 = new Class3_Sub8_Sub1(this);
					if (!this.aClass3_Sub8_Sub1_1.method1556()) {
						this.aClass3_Sub8_Sub1_1.method1548();
						this.aClass3_Sub8_Sub1_1 = null;
					}
				}
				this.aClass151_1 = new Class151(this);
				this.method4400();
				this.method4389();
				OpenGL.glClear(16640);
				local345 = 0;
				while (true) {
					try {
						this.anOpenGL2.swapBuffers();
						break;
					} catch (@Pc(603) Exception local603) {
						if (local345++ > 5) {
							throw new RuntimeException("");
						}
						Static1.method125(100L);
					}
				}
				OpenGL.glClear(16384);
			} catch (@Pc(620) Throwable local620) {
				local620.printStackTrace();
				this.method5305();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.method4392(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZILclient!jaclib/memory/Buffer;II)Lclient!sj;")
	public Interface16 method4373(@OriginalArg(2) Buffer arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return (Interface16) (this.aBoolean460 ? new Class184_Sub2(this, arg1, arg0, arg2, false) : new Class94_Sub1(this, arg1, arg0));
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method5347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4420();
		this.method4392(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 - (float) arg1;
		@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local23 * local23 + local17 * local17)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(55) float local55 = local23 * local36;
		@Pc(59) float local59 = local17 * local36;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local59 + (float) arg2 + 0.35F, (float) arg3 + local55 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	@Override
	public void method5296(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt5317 = arg0;
		this.aClass287_1.method7073();
	}

	@OriginalMember(owner = "client!ji", name = "LA", descriptor = "(IIII)V")
	@Override
	public void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean441) {
			throw new RuntimeException("");
		}
		this.anInt5338 = arg0;
		this.anInt5344 = arg2;
		this.anInt5358 = arg1;
		this.anInt5348 = arg3;
		this.aClass151_1.aClass75_Sub1_1.method2236();
		this.method4394();
	}

	@OriginalMember(owner = "client!ji", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		@Pc(6) int local6 = this.anInt5373;
		this.anInt5373 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "()V")
	@Override
	public void method5285() {
		this.aClass235_1.method6008();
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
	private void method4374() {
		if (this.anInt5347 != 3) {
			this.anInt5347 = 3;
			this.method4424();
			this.method4439();
			this.anInt5369 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
	private void method4375() {
		@Pc(9) int local9 = 0;
		while (!this.anOpenGL2.a()) {
			if (local9++ > 5) {
				throw new RuntimeException("");
			}
			Static1.method125(1000L);
		}
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)V")
	private void method4376() {
		if (this.aBoolean439 && this.aBoolean441 | this.anInt5352 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!gq;Z)V")
	public void method4377(@OriginalArg(0) Class11 arg0) {
		@Pc(9) Class11 local9 = this.aClass11Array1[this.anInt5341];
		if (arg0 != local9) {
			if (arg0 == null) {
				OpenGL.glDisable(local9.anInt9053);
			} else {
				if (local9 == null) {
					OpenGL.glEnable(arg0.anInt9053);
				} else if (local9.anInt9053 != arg0.anInt9053) {
					OpenGL.glDisable(local9.anInt9053);
					OpenGL.glEnable(arg0.anInt9053);
				}
				OpenGL.glBindTexture(arg0.anInt9053, arg0.method7410());
			}
			this.aClass11Array1[this.anInt5341] = arg0;
		}
		this.anInt5369 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "()Z")
	@Override
	public boolean method5279() {
		return this.aClass3_Sub8_Sub1_1 != null && (this.anInt5322 <= 1 || this.aBoolean436);
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(IIIII)V")
	@Override
	protected void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt5359 || arg0 - arg2 > this.anInt5357 || this.anInt5351 > arg1 + arg2 || this.anInt5364 < arg1 - arg2) {
			return;
		}
		this.method4420();
		this.method4392(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(74) float local74 = (float) arg0 + 0.35F;
		@Pc(79) float local79 = (float) arg1 + 0.35F;
		@Pc(83) int local83 = arg2 << 1;
		if ((float) local83 < this.aFloat110) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local74 + 1.0F, local79 + 1.0F);
			OpenGL.glVertex2f(local74 + 1.0F, -1.0F + local79);
			OpenGL.glVertex2f(local74 - 1.0F, -1.0F + local79);
			OpenGL.glVertex2f(local74 - 1.0F, local79 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat94 >= (float) local83) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local83);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local74, local79);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local74, local79);
			@Pc(152) int local152 = 262144 / (arg2 * 6);
			if (local152 <= 64) {
				local152 = 64;
			} else if (local152 > 512) {
				local152 = 512;
			}
			local152 = Static332.method5752(local152);
			OpenGL.glVertex2f(local74 + (float) arg2, local79);
			for (@Pc(180) int local180 = 16384 - local152; local180 > 0; local180 -= local152) {
				OpenGL.glVertex2f((float) arg2 * Class208.aFloatArray59[local180] + local74, Class208.aFloatArray58[local180] * (float) arg2 + local79);
			}
			OpenGL.glVertex2f(local74 + (float) arg2, local79);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!kn;Lclient!kn;FLclient!kn;)Lclient!kn;")
	@Override
	public Class108 method5298(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Class108 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class108 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean438 && this.aBoolean444) {
			@Pc(15) Class108_Sub1_Sub1 local15 = null;
			@Pc(18) Class108_Sub1 local18 = (Class108_Sub1) arg0;
			@Pc(21) Class108_Sub1 local21 = (Class108_Sub1) arg1;
			@Pc(25) Class11_Sub3 local25 = local18.method7913();
			@Pc(29) Class11_Sub3 local29 = local21.method7913();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local29.anInt3455 < local25.anInt3455 ? local25.anInt3455 : local29.anInt3455;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class108_Sub1_Sub1) {
					@Pc(60) Class108_Sub1_Sub1 local60 = (Class108_Sub1_Sub1) arg3;
					if (local48 == local60.method2899()) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class108_Sub1_Sub1(this, local48);
				}
				if (local15.method2902(local29, arg2, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BIII)V")
	public void method4378(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!mga;)V")
	public void method4379(@OriginalArg(1) Interface9 arg0) {
		if (this.aBoolean461) {
			this.method4408(arg0);
			this.method4454(arg0);
		} else if (this.anInt5328 >= 0 && this.anInterface9Array1[this.anInt5328] == arg0) {
			this.anInterface9Array1[this.anInt5328--] = null;
			arg0.method6769();
			if (this.anInt5328 < 0) {
				this.anInterface9_1 = this.anInterface9_2 = null;
			} else {
				this.anInterface9_1 = this.anInterface9_2 = this.anInterface9Array1[this.anInt5328];
				this.anInterface9_1.method6771();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V")
	@Override
	public void method5336(@OriginalArg(0) boolean arg0) {
		this.aBoolean462 = arg0;
		this.method4429();
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(Z)V")
	public void method4380() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "(I)V")
	private void method4381() {
		this.aClass255_Sub1_4 = new Class255_Sub1();
		this.aClass255_Sub1_3 = new Class255_Sub1();
		this.aClass11Array1 = new Class11[this.anInt5360];
		this.aClass11_Sub2_3 = new Class11_Sub2(this, 3553, 6408, 1, 1);
		new Class11_Sub2(this, 3553, 6408, 1, 1);
		new Class11_Sub2(this, 3553, 6408, 1, 1);
		this.bf = new Class21_Sub3(this);
		this.aClass21_Sub3_2 = new Class21_Sub3(this);
		this.aClass21_Sub3_3 = new Class21_Sub3(this);
		this.aClass21_Sub3_8 = new Class21_Sub3(this);
		this.aClass21_Sub3_9 = new Class21_Sub3(this);
		this.aClass21_Sub3_6 = new Class21_Sub3(this);
		this.aClass21_Sub3_5 = new Class21_Sub3(this);
		this.aClass21_Sub3_7 = new Class21_Sub3(this);
		this.aClass21_Sub3_1 = new Class21_Sub3(this);
		this.aClass21_Sub3_4 = new Class21_Sub3(this);
		if (this.aBoolean444) {
			this.aClass269_4 = new Class269(this);
			new Class269(this);
		}
	}

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "()V")
	@Override
	public void method5350() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "()Z")
	@Override
	public boolean method5289() {
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method5302(@OriginalArg(0) Class37 arg0) {
		this.aClass37_Sub3_1 = (Class37_Sub3) arg0;
		@Pc(65) Class3_Sub4 local65;
		if (this.aBoolean444) {
			if (this.aClass269_3 == null) {
				this.aClass269_3 = new Class269(this);
			}
			if (this.aClass269_3 == this.anInterface9_2) {
				throw new RuntimeException();
			}
			this.method4384(this.aClass269_3);
			@Pc(166) Class3_Sub4_Sub19 local166 = (Class3_Sub4_Sub19) this.aClass25_21.method946((long) (this.aClass37_Sub3_1.QA() << 16 | this.aClass37_Sub3_1.b()));
			if (local166 == null) {
				local166 = new Class3_Sub4_Sub19(this, 6402, this.aClass37_Sub3_1.QA(), this.aClass37_Sub3_1.b());
				@Pc(201) Class3_Sub4_Sub19 local201;
				for (this.anInt5331 += local166.anInt10261; this.anInt5331 > 2097152; this.anInt5331 -= local201.anInt10261) {
					local65 = this.aClass39_2.method1277();
					if (local65 == null) {
						break;
					}
					local201 = (Class3_Sub4_Sub19) local65;
					local201.method8309();
					local201.method8412();
					local201.method8312();
				}
				this.aClass25_21.method945(local166, (long) (this.aClass37_Sub3_1.QA() << 16 | this.aClass37_Sub3_1.b()));
			}
			this.aClass39_2.method1272(local166);
			this.aClass269_3.method6779(8, local166);
			this.aClass269_3.method6781(this.aClass37_Sub3_1.aClass11_Sub2_Sub1_4, 0);
		} else if (this.aBoolean435) {
			@Pc(36) Class3_Sub4_Sub5 local36 = (Class3_Sub4_Sub5) this.aClass25_21.method946((long) (this.aClass37_Sub3_1.QA() << 16 | this.aClass37_Sub3_1.b()));
			if (local36 == null) {
				local36 = new Class3_Sub4_Sub5(this, this.aClass37_Sub3_1.QA(), this.aClass37_Sub3_1.b());
				@Pc(72) Class3_Sub4_Sub5 local72;
				for (this.anInt5331 += local36.anInt1531 * 4; this.anInt5331 > 2097152; this.anInt5331 -= local72.anInt1531) {
					local65 = this.aClass39_2.method1277();
					if (local65 == null) {
						break;
					}
					local72 = (Class3_Sub4_Sub5) local65;
					local72.method8309();
					local72.method8412();
					this.anOpenGL2.releasePbuffer(local72.method1514());
				}
				this.aClass25_21.method945(local36, (long) (this.aClass37_Sub3_1.QA() << 16 | this.aClass37_Sub3_1.b()));
			}
			this.aClass39_2.method1272(local36);
			this.anOpenGL2.setPbuffer(local36.method1514());
		} else {
			throw new RuntimeException("");
		}
		this.anInt5270 = arg0.QA();
		this.lb = arg0.b();
		this.method4396();
		this.method4405();
		this.F();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)V")
	public void method4382(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean439) {
			this.aBoolean439 = arg0;
			this.method4376();
			this.anInt5369 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "(I)V")
	private void method4383() {
		this.aFloat108 = this.anInt5359 - this.anInt5350;
		this.aFloat90 = this.anInt5351 - this.anInt5354;
		this.aFloat102 = this.anInt5357 - this.anInt5350;
		this.aFloat88 = this.anInt5364 - this.anInt5354;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(ILclient!mga;)V")
	public void method4384(@OriginalArg(1) Interface9 arg0) {
		if (this.aBoolean461) {
			this.method4431(arg0);
			this.method4391(arg0);
		} else if (this.anInt5328 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt5328 >= 0) {
				this.anInterface9Array1[this.anInt5328].method6769();
			}
			this.anInterface9_1 = this.anInterface9_2 = this.anInterface9Array1[++this.anInt5328] = arg0;
			this.anInterface9_1.method6771();
		}
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5348(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas9) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable4.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
	public synchronized void method4385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class3_Sub48 local14 = new Class3_Sub48(arg0);
		local14.aLong262 = arg1;
		this.aClass183_32.method4792(local14);
	}

	@OriginalMember(owner = "client!ji", name = "aa", descriptor = "()I")
	@Override
	public int aa() {
		@Pc(6) int local6 = this.anInt5372;
		this.anInt5372 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "(I)V")
	private void method4386() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "(I)V")
	private void method4387() {
		if (this.anInt5357 >= this.anInt5359 && this.anInt5351 <= this.anInt5364) {
			OpenGL.glScissor(this.anInt5339 + this.anInt5359, -this.anInt5364 + this.anInt5366 + this.lb, this.anInt5357 - this.anInt5359, this.anInt5364 + -this.anInt5351);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "()V")
	@Override
	public void k() {
		this.aBoolean441 = false;
		this.aClass151_1.method3394(0, false, false, 0, 0);
		this.method4394();
		this.method4376();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIZ)Lclient!xa;")
	@Override
	public Class37 method5308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class37_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)V")
	public void method4388() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray41, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray40, 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!kn;)V")
	@Override
	public void method5344(@OriginalArg(0) Class108 arg0) {
		this.aClass108_Sub1_1 = (Class108_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5338(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method5355();
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(Z)V")
	private void method4389() {
		if (this.aCanvas10 == null) {
			this.anInt5218 = this.anInt5272 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas10.getSize();
			this.anInt5218 = local10.width;
			this.anInt5272 = local10.height;
		}
		if (this.anInterface9_2 == null) {
			this.lb = this.anInt5272;
			this.anInt5270 = this.anInt5218;
			this.method4405();
		}
		this.method4396();
		this.F();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([Lclient!ba;Lclient!qu;Lclient!q;[Lclient!ht;I)V")
	@Override
	public void method5297(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Class55_Sub3[] arg3, @OriginalArg(4) int arg4) {
		this.method5310(arg0, arg2, arg3, arg4);
		this.method5277(arg1);
	}

	@OriginalMember(owner = "client!ji", name = "X", descriptor = "(III)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt5371 && this.anInt5352 == arg1 && this.anInt5361 == arg2) {
			return;
		}
		this.anInt5371 = arg0;
		this.anInt5352 = arg1;
		this.anInt5361 = arg2;
		if (this.aBoolean441) {
			return;
		}
		this.method4394();
		this.method4376();
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(II)I")
	public int method4390(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mga;B)V")
	public void method4391(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt5329 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5329 >= 0) {
			this.anInterface9Array2[this.anInt5329].method6772();
		}
		this.anInterface9_2 = this.anInterface9Array2[++this.anInt5329] = arg0;
		this.anInterface9_2.method6768();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5347(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method5351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class93 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class93_Sub1 local6 = (Class93_Sub1) arg5;
		@Pc(9) Class11_Sub2_Sub1 local9 = local6.aClass11_Sub2_Sub1_2;
		this.method4430();
		this.method4377(local6.aClass11_Sub2_Sub1_2);
		this.method4392(1);
		this.method4451(8448, 7681);
		this.method4442(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat19 / (float) local9.anInt1697;
		@Pc(46) float local46 = local9.aFloat18 / (float) local9.anInt1695;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(58) float local58 = (float) arg3 - (float) arg1;
		@Pc(71) float local71 = (float) (1.0D / Math.sqrt((double) (local58 * local58 + local52 * local52)));
		@Pc(75) float local75 = local58 * local71;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(94) float local94 = local52 * local71;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local94 + 0.35F, (float) arg3 + local75 + 0.35F);
		OpenGL.glEnd();
		this.method4442(768, 5890, 0);
	}

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "()V")
	@Override
	public void method5349() {
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(II)V")
	public void method4392(@OriginalArg(0) int arg0) {
		if (this.anInt5340 == arg0) {
			return;
		}
		@Pc(25) boolean local25;
		@Pc(27) byte local27;
		if (arg0 == 1) {
			local27 = 1;
			local25 = true;
		} else if (arg0 == 2) {
			local25 = false;
			local27 = 2;
		} else if (arg0 == 128) {
			local25 = true;
			local27 = 3;
		} else {
			local25 = false;
			local27 = 0;
		}
		if (!this.aBoolean452) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean452 = true;
		}
		if (local25 != this.aBoolean456) {
			if (local25) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean456 = local25;
		}
		if (local27 != this.anInt5356) {
			if (local27 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local27 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local27 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt5356 = local27;
		}
		this.anInt5340 = arg0;
		this.anInt5369 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!qu;)V")
	@Override
	public void method5277(@OriginalArg(0) Class274 arg0) {
		this.aClass79_1.method2297(arg0, this);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[Lclient!pn;)V")
	@Override
	public void method5353(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass3_Sub28Array4[local3] = arg1[local3];
		}
		this.anInt5337 = arg0;
		if (this.anInt5347 != 1) {
			this.method4440();
		}
	}

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "(I)I")
	private int method4393() {
		@Pc(5) int local5 = 0;
		this.aString56 = OpenGL.glGetString(7936).toLowerCase();
		this.aString55 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString56.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString56.indexOf("brian paul") != -1 || this.aString56.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static335.method5785(' ', local45.replace('.', ' '));
		if (local53.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(68) int local68 = Static403.method6559(local53[0]);
				@Pc(74) int local74 = Static403.method6559(local53[1]);
				this.anInt5346 = local74 + local68 * 10;
			} catch (@Pc(83) NumberFormatException local83) {
				local5 |= 0x4;
			}
		}
		if (this.anInt5346 < 12) {
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
		this.anInt5360 = local119[0];
		OpenGL.glGetIntegerv(34929, local119, 0);
		this.anInt5345 = local119[0];
		OpenGL.glGetIntegerv(34930, local119, 0);
		this.anInt5343 = local119[0];
		if (this.anInt5360 < 2 || this.anInt5345 < 2 || this.anInt5343 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean442 = Stream.b();
		this.aBoolean435 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean460 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean449 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean459 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean440 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean437 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean453 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean446 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean438 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean458 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean457 = false;
		this.aBoolean444 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean461 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean454 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean436 = this.aBoolean461 & this.aBoolean454;
		OpenGL.glGetFloatv(2834, Static250.aFloatArray44, 0);
		this.aFloat110 = Static250.aFloatArray44[0];
		this.aFloat94 = Static250.aFloatArray44[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "()Z")
	@Override
	public boolean method5292() {
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method5291(@OriginalArg(0) Class255 arg0) {
		this.aClass255_Sub1_4 = (Class255_Sub1) arg0;
		this.aClass255_Sub1_3.method6436(this.aClass255_Sub1_4);
		if (this.anInt5347 != 1) {
			this.method4439();
		}
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(Z)V")
	private void method4394() {
		@Pc(53) int local53;
		if (this.aBoolean441) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local53 = this.anInt5358;
		} else {
			this.aFloat91 = (float) (this.anInt5365 - this.anInt5361) - this.aFloat106;
			this.aFloat89 = this.aFloat91 - (float) this.anInt5352 * this.aFloat103;
			if (this.aFloat89 < (float) this.anInt5370) {
				this.aFloat89 = this.anInt5370;
			}
			OpenGL.glFogf(2915, this.aFloat89);
			OpenGL.glFogf(2916, this.aFloat91);
			local53 = this.anInt5371;
		}
		Static250.aFloatArray44[2] = (float) (local53 & 0xFF) / 255.0F;
		Static250.aFloatArray44[0] = (float) (local53 & 0xFF0000) / 1.671168E7F;
		Static250.aFloatArray44[1] = (float) (local53 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static250.aFloatArray44, 0);
		if (this.aBoolean441) {
			this.aClass151_1.aClass75_Sub1_1.method2234();
		}
	}

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "()F")
	public float method4395() {
		return this.aFloat97;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)V")
	public void method4396() {
		if (this.anInt5347 != 0) {
			this.anInt5369 &= 0xFFFFFFE0;
			this.anInt5347 = 0;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(FZFF)V")
	private void method4397(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean443) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean443 = true;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(II)I")
	public int method4398(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)V")
	public void method4399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5339 = arg0;
		this.anInt5366 = arg1;
		this.method4405();
		this.method4387();
	}

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "(I)V")
	private void method4400() {
		this.method4448(-2);
		for (@Pc(12) int local12 = this.anInt5360 - 1; local12 >= 0; local12--) {
			this.method4458(local12);
			this.method4377(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method4451(8448, 8448);
		this.method4442(770, 34168, 2);
		this.method4445();
		this.anInt5340 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt5356 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean456 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean452 = true;
		this.method4382(true);
		this.method4414(true);
		this.method4428(true);
		this.method4413(true);
		this.method4396();
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
		@Pc(131) float[] local131 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(133) int local133 = 0; local133 < 8; local133++) {
			@Pc(139) int local139 = local133 + 16384;
			OpenGL.glLightfv(local139, 4608, local131, 0);
			OpenGL.glLightf(local139, 4615, 0.0F);
			OpenGL.glLightf(local139, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt5367 = this.anInt5371 = -1;
		this.F();
	}

	@OriginalMember(owner = "client!ji", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5351 < arg1) {
			this.anInt5351 = arg1;
		}
		if (this.anInt5364 > arg3) {
			this.anInt5364 = arg3;
		}
		if (this.anInt5357 > arg2) {
			this.anInt5357 = arg2;
		}
		if (arg0 > this.anInt5359) {
			this.anInt5359 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method4383();
		this.method4387();
	}

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "()I")
	@Override
	public int method5329() {
		return 4;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(IIIIII)Lclient!kn;")
	@Override
	public Class108 method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean438 ? new Class108_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "()V")
	@Override
	public void F() {
		this.anInt5357 = this.anInt5270;
		this.anInt5359 = 0;
		this.anInt5364 = this.lb;
		this.anInt5351 = 0;
		OpenGL.glDisable(3089);
		this.method4383();
	}

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "()I")
	@Override
	public int v() {
		return this.anInt5333 + this.anInt5332 + this.anInt5334;
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
	@Override
	public void method5340(@OriginalArg(0) int arg0) {
		this.method4386();
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
	@Override
	public void method5317(@OriginalArg(0) int arg0) {
		this.method4375();
	}

	@OriginalMember(owner = "client!ji", name = "ca", descriptor = "(IIII)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt5270) {
			arg2 = this.anInt5270;
		}
		if (arg3 > this.lb) {
			arg3 = this.lb;
		}
		this.anInt5364 = arg3;
		this.anInt5351 = arg1;
		this.anInt5357 = arg2;
		this.anInt5359 = arg0;
		OpenGL.glEnable(3089);
		this.method4383();
		this.method4387();
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(IIIII)V")
	@Override
	public void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4420();
		this.method4392(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(II)I")
	public int method4401(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ji", name = "na", descriptor = "(III[I)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg0 * this.aClass255_Sub1_4.aFloat160 + (float) arg1 * this.aClass255_Sub1_4.aFloat168 + this.aClass255_Sub1_4.aFloat164 * (float) arg2 + this.aClass255_Sub1_4.aFloat161;
		if (local28 < (float) this.anInt5370 || (float) this.anInt5365 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt5349 * ((float) arg2 * this.aClass255_Sub1_4.aFloat162 + (float) arg0 * this.aClass255_Sub1_4.aFloat159 + (float) arg1 * this.aClass255_Sub1_4.aFloat158 + this.aClass255_Sub1_4.aFloat166) / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt5363 * (this.aClass255_Sub1_4.aFloat157 + this.aClass255_Sub1_4.aFloat167 * (float) arg1 + (float) arg0 * this.aClass255_Sub1_4.aFloat165 + this.aClass255_Sub1_4.aFloat163 * (float) arg2) / local28);
		if (this.aFloat108 <= (float) local85 && (float) local85 <= this.aFloat102 && (float) local117 >= this.aFloat90 && (float) local117 <= this.aFloat88) {
			arg3[0] = (int) ((float) local85 - this.aFloat108);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat90);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class93 method5307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static289.method5648(arg1, this, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BF)V")
	public void method4402(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat95) {
			this.aFloat95 = arg0;
			if (this.anInt5347 == 3) {
				this.method4424();
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBZ)V")
	public void method4403(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method4425(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "(I)V")
	private void method4404() {
		@Pc(6) float[] local6 = this.aFloatArray39;
		@Pc(18) float local18 = (float) (-this.anInt5350 * this.anInt5370) / (float) this.anInt5349;
		@Pc(33) float local33 = (float) (this.anInt5370 * (this.anInt5270 - this.anInt5350)) / (float) this.anInt5349;
		@Pc(44) float local44 = (float) (this.anInt5354 * this.anInt5370) / (float) this.anInt5363;
		@Pc(65) float local65 = (float) (this.anInt5370 * (this.anInt5354 - this.lb)) / (float) this.anInt5363;
		if (local33 == local18 || local65 == local44) {
			local6[0] = 1.0F;
			local6[4] = 0.0F;
			local6[13] = 0.0F;
			local6[10] = 1.0F;
			local6[2] = 0.0F;
			local6[14] = 0.0F;
			local6[7] = 0.0F;
			local6[15] = 1.0F;
			local6[11] = 0.0F;
			local6[12] = 0.0F;
			local6[6] = 0.0F;
			local6[9] = 0.0F;
			local6[1] = 0.0F;
			local6[8] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = 1.0F;
		} else {
			@Pc(79) float local79 = (float) this.anInt5370 * 2.0F;
			local6[13] = 0.0F;
			local6[14] = this.aFloat99 = -((float) this.anInt5365 * local79) / (float) (this.anInt5365 - this.anInt5370);
			local6[15] = 0.0F;
			local6[9] = (local65 + local44) / (local44 - local65);
			local6[6] = 0.0F;
			local6[2] = 0.0F;
			local6[7] = 0.0F;
			local6[12] = 0.0F;
			local6[11] = -1.0F;
			local6[5] = local79 / (local44 - local65);
			local6[3] = 0.0F;
			local6[8] = (local33 + local18) / (local33 - local18);
			local6[10] = this.aFloat104 = (float) -(this.anInt5370 + this.anInt5365) / (float) (this.anInt5365 - this.anInt5370);
			local6[1] = 0.0F;
			local6[0] = local79 / (local33 - local18);
			local6[4] = 0.0F;
		}
		this.method4449();
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(Z)V")
	private void method4405() {
		OpenGL.glViewport(this.anInt5339, this.anInt5366, this.anInt5270, this.lb);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(ZI)V")
	public synchronized void method4406(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub48 local14 = new Class3_Sub48(arg0);
		this.aClass183_33.method4792(local14);
	}

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "()V")
	@Override
	public void method5355() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!ji", name = "sa", descriptor = "(II)V")
	@Override
	public void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5370 == arg0 && arg1 == this.anInt5365) {
			return;
		}
		this.anInt5370 = arg0;
		this.anInt5365 = arg1;
		this.method4404();
		this.method4394();
		if (this.anInt5347 == 3) {
			this.method4424();
			return;
		}
		if (this.anInt5347 != 2) {
			return;
		}
		this.method4438();
	}

	@OriginalMember(owner = "client!ji", name = "ka", descriptor = "(FF)V")
	@Override
	public void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat92 == arg0 && this.aFloat97 == arg1) {
			return;
		}
		this.aFloat92 = arg0;
		this.aFloat97 = arg1;
		this.method4449();
		if (this.anInt5347 == 3) {
			this.method4424();
			return;
		}
		if (this.anInt5347 != 2) {
			return;
		}
		this.method4438();
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(ILclient!mga;)V")
	public void method4408(@OriginalArg(1) Interface9 arg0) {
		if (this.anInt5330 < 0 || this.anInterface9Array3[this.anInt5330] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface9Array3[this.anInt5330--] = null;
		arg0.method6770();
		if (this.anInt5330 < 0) {
			this.anInterface9_1 = null;
		} else {
			this.anInterface9_1 = this.anInterface9Array3[this.anInt5330];
			this.anInterface9_1.method6767();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!vv;Lclient!vv;ZLclient!vv;Lclient!vv;)V")
	public void method4409(@OriginalArg(0) Class346 arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(3) Class346 arg2, @OriginalArg(4) Class346 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method4452(arg3.anInterface16_6);
			OpenGL.glVertexPointer(arg3.aByte105, arg3.aShort127, this.anInterface16_3.method7025(), this.anInterface16_3.method7028() + (long) arg3.aByte106);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method4452(arg2.anInterface16_6);
			OpenGL.glNormalPointer(arg2.aShort127, this.anInterface16_3.method7025(), this.anInterface16_3.method7028() + (long) arg2.aByte106);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method4452(arg0.anInterface16_6);
			OpenGL.glColorPointer(arg0.aByte105, arg0.aShort127, this.anInterface16_3.method7025(), this.anInterface16_3.method7028() + (long) arg0.aByte106);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method4452(arg1.anInterface16_6);
			OpenGL.glTexCoordPointer(arg1.aByte105, arg1.aShort127, this.anInterface16_3.method7025(), this.anInterface16_3.method7028() + (long) arg1.aByte106);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
	public void method4410(@OriginalArg(1) int arg0) {
		Static250.aFloatArray44[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static250.aFloatArray44[3] = (float) (arg0 >>> 24) / 255.0F;
		Static250.aFloatArray44[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static250.aFloatArray44[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static250.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "()Z")
	@Override
	public boolean method5327() {
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(B)V")
	private void method4411() {
		if (this.anInt5347 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt5270 > 0 && this.lb > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt5270, (double) this.lb, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt5347 = 1;
		this.anInt5369 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(BI)V")
	public synchronized void method4412(@OriginalArg(1) int arg0) {
		@Pc(11) Class3 local11 = new Class3();
		local11.aLong262 = arg0;
		this.aClass183_35.method4792(local11);
	}

	@OriginalMember(owner = "client!ji", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt5367;
		if (local15 || this.aFloat96 != arg1 || arg2 != this.aFloat105) {
			this.anInt5367 = arg0;
			this.aFloat96 = arg1;
			this.aFloat105 = arg2;
			if (local15) {
				this.aFloat100 = (float) (this.anInt5367 & 0xFF) / 255.0F;
				this.aFloat93 = (float) (this.anInt5367 & 0xFF0000) / 1.671168E7F;
				this.aFloat98 = (float) (this.anInt5367 & 0xFF00) / 65280.0F;
				this.method4441();
			}
			this.method4427();
		}
		if (arg3 == this.aFloatArray43[0] && arg4 == this.aFloatArray43[1] && this.aFloatArray43[2] == arg5) {
			return;
		}
		this.aFloatArray43[1] = arg4;
		this.aFloatArray43[2] = arg5;
		this.aFloatArray43[0] = arg3;
		this.aFloatArray42[0] = -arg3;
		this.aFloatArray42[2] = -arg5;
		this.aFloatArray42[1] = -arg4;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray41[2] = arg5 * local142;
		this.aFloatArray41[0] = local142 * arg3;
		this.aFloatArray41[1] = local142 * arg4;
		this.aFloatArray40[2] = -this.aFloatArray41[2];
		this.aFloatArray40[1] = -this.aFloatArray41[1];
		this.aFloatArray40[0] = -this.aFloatArray41[0];
		this.method4388();
		this.anInt5353 = (int) (arg5 * 256.0F / arg4);
		this.anInt5335 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ht;I)V")
	@Override
	public void method5310(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class55_Sub3[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method7145(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(ZI)V")
	public void method4413(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean463 != arg0) {
			this.aBoolean463 = arg0;
			this.method4429();
			this.anInt5369 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ji", name = "ya", descriptor = "(IIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4420();
		this.method4392(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!ba;Lclient!qu;Lclient!q;Lclient!ht;I)V")
	@Override
	public void method5309(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Class55_Sub3 arg3, @OriginalArg(4) int arg4) {
		arg0.method7145(arg2, arg3, arg4);
		this.method5277(arg1);
	}

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "()Z")
	@Override
	public boolean method5335() {
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(ZI)V")
	public void method4414(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean447 != arg0) {
			this.aBoolean447 = arg0;
			this.method4444();
			this.anInt5369 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ji", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5358 = arg1;
		this.aBoolean441 = true;
		this.anInt5348 = arg3;
		this.anInt5338 = arg0;
		this.anInt5344 = arg2;
		this.aClass151_1.method3394(0, false, false, 0, 3);
		this.aClass151_1.aClass75_Sub1_1.method2236();
		this.method4394();
		this.method4376();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIF)Lclient!pn;")
	@Override
	public Class3_Sub28 method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub28_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!sga;[Lclient!aw;Z)Lclient!ta;")
	@Override
	public Class111 method5346(@OriginalArg(0) Class297 arg0, @OriginalArg(1) Class20[] arg1) {
		return new Class111_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "(I)V")
	private void method4416() {
		if (this.anInt5347 != 2) {
			this.anInt5347 = 2;
			this.method4438();
			this.method4439();
			this.anInt5369 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(FIFFF)V")
	public void method4417(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static250.aFloatArray44[1] = arg3;
		Static250.aFloatArray44[0] = arg1;
		Static250.aFloatArray44[2] = arg2;
		Static250.aFloatArray44[3] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static250.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)Lclient!i;")
	@Override
	public Class3_Sub19 method5313(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub19_Sub1 local8 = new Class3_Sub19_Sub1(arg0);
		this.aClass183_29.method4792(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5299() {
		this.method4420();
		this.method4392(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZI)V")
	public synchronized void method4418(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub48 local14 = new Class3_Sub48(arg1);
		local14.aLong262 = arg0;
		this.aClass183_34.method4792(local14);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!fca;IIII)Lclient!ba;")
	@Override
	public Class21 method5352(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class21_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class93_Sub1 local6 = (Class93_Sub1) arg1;
		@Pc(9) Class11_Sub2_Sub1 local9 = local6.aClass11_Sub2_Sub1_2;
		this.method4430();
		this.method4377(local6.aClass11_Sub2_Sub1_2);
		this.method4392(1);
		this.method4451(8448, 7681);
		this.method4442(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat19 / (float) local9.anInt1697;
		@Pc(46) float local46 = local9.aFloat18 / (float) local9.anInt1695;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5359 - arg2), (float) (this.anInt5351 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5359, this.anInt5351);
		OpenGL.glTexCoord2f((float) (this.anInt5359 - arg2) * local39, (float) (this.anInt5364 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5359, this.anInt5364);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5357 - arg2), (float) (this.anInt5364 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5357, this.anInt5364);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5357 - arg2), (float) (this.anInt5351 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5357, this.anInt5351);
		OpenGL.glEnd();
		this.method4442(768, 5890, 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!pf;I)V")
	public void method4419(@OriginalArg(0) Class255_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method6438(), 0);
	}

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "()Z")
	@Override
	public boolean method5333() {
		return this.aClass151_1.method3393();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass235_1.method6007(arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
	@Override
	public void method5282(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "(I)V")
	private void method4420() {
		if (this.anInt5369 == 1) {
			return;
		}
		this.method4411();
		this.method4382(false);
		this.method4414(false);
		this.method4428(false);
		this.method4413(false);
		this.method4377(null);
		this.method4448(-2);
		this.method4432(1);
		this.anInt5369 = 1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!pf;)V")
	public void method4421(@OriginalArg(1) Class255_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method6438(), 0);
	}

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "()V")
	@Override
	public void method5295() {
		if (this.aClass3_Sub8_Sub1_1 != null && this.aClass3_Sub8_Sub1_1.method1545()) {
			this.aClass235_1.method6005(this.aClass3_Sub8_Sub1_1);
			this.aClass287_1.method7073();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZZ[BI)Lclient!sj;")
	public Interface16 method4422(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		return (Interface16) (this.aBoolean460 && (!arg1 || this.aBoolean451) ? new Class184_Sub2(this, arg3, arg2, arg0, arg1) : new Class94_Sub1(this, arg3, arg2, arg0));
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5311(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas9) {
			local5 = this.aLong147;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable4.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas10) {
			this.method4389();
		}
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(B)V")
	public void method4423() {
		if (this.anInt5369 == 8) {
			return;
		}
		this.method4416();
		this.method4382(true);
		this.method4428(true);
		this.method4413(true);
		this.method4392(1);
		this.anInt5369 = 8;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class37 method5324(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class37_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class37 method5290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class37_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "()Z")
	@Override
	public boolean method5323() {
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(B)V")
	private void method4424() {
		@Pc(19) float local19 = (float) -this.anInt5350 * this.aFloat95 / (float) this.anInt5349;
		@Pc(31) float local31 = this.aFloat95 * (float) -this.anInt5354 / (float) this.anInt5363;
		@Pc(46) float local46 = (float) (this.anInt5270 - this.anInt5350) * this.aFloat95 / (float) this.anInt5349;
		@Pc(61) float local61 = (float) (this.lb - this.anInt5354) * this.aFloat95 / (float) this.anInt5363;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local46 != local19 && local61 != local31) {
			OpenGL.glOrtho((double) local19, (double) local46, (double) -local61, (double) -local31, (double) ((float) this.anInt5370 - this.aFloat97), (double) ((float) this.anInt5365 - this.aFloat97));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZZZ)V")
	public void method4425(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt5355) {
			if (arg0 < 0) {
				this.method4445();
				this.method4377(null);
				this.method4432(0);
				if (!this.aBoolean441) {
					this.aClass151_1.method3394(0, arg2, arg1, 0, 0);
				}
			} else {
				@Pc(15) Class11_Sub2 local15 = this.aClass287_1.method7074(arg0);
				@Pc(21) Class178 local21 = super.anInterface4_11.method3088(arg0);
				if (local21.aByte56 == 0 && local21.aByte55 == 0) {
					this.method4445();
				} else {
					@Pc(40) int local40 = local21.aBoolean486 ? 64 : 128;
					@Pc(44) int local44 = local40 * 50;
					this.method4397((float) (this.anInt5325 % local44 * local21.aByte56) / (float) local44, 0.0F, (float) (local21.aByte55 * (this.anInt5325 % local44)) / (float) local44);
				}
				if (this.aBoolean441) {
					this.method4377(local15);
					this.method4432(local21.anInt5666);
				} else {
					this.aClass151_1.method3394(local21.aByte58, arg2, arg1, local21.anInt5664, local21.aByte54);
					if (!this.aClass151_1.method3395(local15, local21.anInt5666)) {
						this.method4377(local15);
						this.method4432(local21.anInt5666);
					}
				}
			}
			this.anInt5355 = arg0;
		}
		this.anInt5369 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(FIF)V")
	public void method4426(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat106 = arg0;
		this.aFloat103 = arg1;
		if (!this.aBoolean441) {
			this.method4394();
		}
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(Z)V")
	private void method4427() {
		Static250.aFloatArray44[3] = 1.0F;
		Static250.aFloatArray44[0] = this.aFloat93 * this.aFloat96;
		Static250.aFloatArray44[2] = this.aFloat96 * this.aFloat100;
		Static250.aFloatArray44[1] = this.aFloat98 * this.aFloat96;
		OpenGL.glLightfv(16384, 4609, Static250.aFloatArray44, 0);
		Static250.aFloatArray44[2] = -this.aFloat105 * this.aFloat100;
		Static250.aFloatArray44[0] = this.aFloat93 * -this.aFloat105;
		Static250.aFloatArray44[1] = this.aFloat98 * -this.aFloat105;
		Static250.aFloatArray44[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static250.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZB)V")
	public void method4428(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean445 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean445 = arg0;
		this.anInt5369 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "()Z")
	@Override
	public boolean method5314() {
		if (this.aClass3_Sub8_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub8_Sub1_1.method1545()) {
			if (!this.aClass235_1.method6001(this.aClass3_Sub8_Sub1_1)) {
				return false;
			}
			this.aClass287_1.method7073();
		}
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "()V")
	@Override
	public void method5303() {
		if (this.aBoolean444) {
			if (this.aClass269_3 != this.anInterface9_2) {
				throw new RuntimeException();
			}
			this.aClass269_3.method6783(0);
			this.aClass269_3.method6783(8);
			this.method4379(this.aClass269_3);
		} else if (this.aBoolean435) {
			this.aClass37_Sub3_1.GA(0, 0, this.anInt5270, this.lb, 0, 0);
			this.anOpenGL2.setSurface(this.aLong148);
		} else {
			throw new RuntimeException("");
		}
		this.aClass37_Sub3_1 = null;
		this.anInt5270 = this.anInt5218;
		this.lb = this.anInt5272;
		this.method4396();
		this.method4405();
		this.F();
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(B)V")
	private void method4429() {
		OpenGL.glDepthMask(this.aBoolean463 && this.aBoolean462);
	}

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "(I)V")
	public void method4430() {
		if (this.anInt5369 == 2) {
			return;
		}
		this.method4411();
		this.method4382(false);
		this.method4414(false);
		this.method4428(false);
		this.method4413(false);
		this.method4448(-2);
		this.anInt5369 = 2;
	}

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "([I)V")
	@Override
	public void A(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt5351;
		arg0[3] = this.anInt5364;
		arg0[2] = this.anInt5357;
		arg0[0] = this.anInt5359;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!mga;I)V")
	public void method4431(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt5330 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5330 >= 0) {
			this.anInterface9Array3[this.anInt5330].method6770();
		}
		this.anInterface9_1 = this.anInterface9Array3[++this.anInt5330] = arg0;
		this.anInterface9_1.method6767();
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "()Z")
	@Override
	public boolean method5284() {
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return this.anInt5365;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)V")
	public void method4432(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4451(7681, 7681);
		} else if (arg0 == 0) {
			this.method4451(8448, 8448);
		} else if (arg0 == 2) {
			this.method4451(7681, 34165);
		} else if (arg0 == 3) {
			this.method4451(8448, 260);
		} else if (arg0 == 4) {
			this.method4451(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!ul;)V")
	public void method4433(@OriginalArg(1) Interface21 arg0) {
		if (this.anInterface21_2 != arg0) {
			if (this.aBoolean460) {
				OpenGL.glBindBufferARB(34963, arg0.method7917());
			}
			this.anInterface21_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)I")
	@Override
	public int method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "(B)V")
	public void method4435() {
		if (this.anInt5369 == 4) {
			return;
		}
		this.method4411();
		this.method4382(false);
		this.method4414(false);
		this.method4428(false);
		this.method4413(false);
		this.method4448(-2);
		this.method4392(1);
		this.anInt5369 = 4;
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "(B)Lclient!gfa;")
	public Class11_Sub3 method4436() {
		return this.aClass108_Sub1_1 == null ? null : this.aClass108_Sub1_1.method7913();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5326(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static598.aFloat205 = arg1;
		Static93.aFloat25 = arg2;
		Static66.aFloat20 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "(I)V")
	public void method4437() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "(I)V")
	private void method4438() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray39, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "(I)V")
	private void method4439() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass255_Sub1_4.method6438(), 0);
		if (this.aBoolean441) {
			this.aClass151_1.aClass75_Sub1_1.method2236();
		}
		this.method4388();
		this.method4440();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)I")
	@Override
	public int method5315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "(I)V")
	private void method4440() {
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.anInt5337; local5++) {
			@Pc(11) Class3_Sub28 local11 = this.aClass3_Sub28Array4[local5];
			@Pc(16) int local16 = local5 + 16386;
			Static387.aFloatArray65[0] = local11.method8156();
			Static387.aFloatArray65[1] = local11.method8155();
			Static387.aFloatArray65[2] = local11.method8158();
			Static387.aFloatArray65[3] = 1.0F;
			OpenGL.glLightfv(local16, 4611, Static387.aFloatArray65, 0);
			@Pc(50) int local50 = local11.method8153();
			@Pc(56) float local56 = local11.method8159() / 255.0F;
			Static387.aFloatArray65[2] = local56 * (float) (local50 & 0xFF);
			Static387.aFloatArray65[0] = (float) (local50 >> 16 & 0xFF) * local56;
			Static387.aFloatArray65[1] = (float) (local50 >> 8 & 0xFF) * local56;
			OpenGL.glLightfv(local16, 4609, Static387.aFloatArray65, 0);
			OpenGL.glLightf(local16, 4617, 1.0F / (float) (local11.method8154() * local11.method8154()));
			OpenGL.glEnable(local16);
		}
		while (this.anInt5368 > local5) {
			OpenGL.glDisable(local5 + 16386);
			local5++;
		}
		this.anInt5368 = this.anInt5337;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class4 method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class4_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method5293(@OriginalArg(0) Class3_Sub19 arg0) {
		this.aNativeHeap4 = ((Class3_Sub19_Sub1) arg0).aNativeHeap3;
		if (this.anInterface16_4 != null) {
			return;
		}
		@Pc(16) Class3_Sub7_Sub2 local16 = new Class3_Sub7_Sub2(80);
		if (this.aBoolean442) {
			local16.method6561(-1.0F);
			local16.method6561(-1.0F);
			local16.method6561(0.0F);
			local16.method6561(0.0F);
			local16.method6561(1.0F);
			local16.method6561(1.0F);
			local16.method6561(-1.0F);
			local16.method6561(0.0F);
			local16.method6561(1.0F);
			local16.method6561(1.0F);
			local16.method6561(1.0F);
			local16.method6561(1.0F);
			local16.method6561(0.0F);
			local16.method6561(1.0F);
			local16.method6561(0.0F);
			local16.method6561(-1.0F);
			local16.method6561(1.0F);
			local16.method6561(0.0F);
			local16.method6561(0.0F);
			local16.method6561(0.0F);
		} else {
			local16.method6560(-1.0F);
			local16.method6560(-1.0F);
			local16.method6560(0.0F);
			local16.method6560(0.0F);
			local16.method6560(1.0F);
			local16.method6560(1.0F);
			local16.method6560(-1.0F);
			local16.method6560(0.0F);
			local16.method6560(1.0F);
			local16.method6560(1.0F);
			local16.method6560(1.0F);
			local16.method6560(1.0F);
			local16.method6560(0.0F);
			local16.method6560(1.0F);
			local16.method6560(0.0F);
			local16.method6560(-1.0F);
			local16.method6560(1.0F);
			local16.method6560(0.0F);
			local16.method6560(0.0F);
			local16.method6560(0.0F);
		}
		this.anInterface16_4 = this.method4422(local16.anInt7869, false, local16.aByteArray86, 20);
		this.aClass346_8 = new Class346(this.anInterface16_4, 5126, 3, 0);
		this.aClass346_7 = new Class346(this.anInterface16_4, 5126, 2, 12);
		this.aClass79_1.method2298(this);
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method5318(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub48 local19;
		while (!this.aClass183_31.method4798()) {
			local19 = (Class3_Sub48) this.aClass183_31.method4797();
			Static187.anIntArray263[local11++] = (int) local19.aLong262;
			this.anInt5332 -= local19.anInt9989;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static187.anIntArray263, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static187.anIntArray263, 0);
			local11 = 0;
		}
		while (!this.aClass183_32.method4798()) {
			local19 = (Class3_Sub48) this.aClass183_32.method4797();
			Static187.anIntArray263[local11++] = (int) local19.aLong262;
			this.anInt5333 -= local19.anInt9989;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static187.anIntArray263, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static187.anIntArray263, 0);
			local11 = 0;
		}
		while (!this.aClass183_33.method4798()) {
			local19 = (Class3_Sub48) this.aClass183_33.method4797();
			Static187.anIntArray263[local11++] = local19.anInt9989;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static187.anIntArray263, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static187.anIntArray263, 0);
			local11 = 0;
		}
		while (!this.aClass183_34.method4798()) {
			local19 = (Class3_Sub48) this.aClass183_34.method4797();
			Static187.anIntArray263[local11++] = (int) local19.aLong262;
			this.anInt5334 -= local19.anInt9989;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static187.anIntArray263, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static187.anIntArray263, 0);
		}
		while (!this.aClass183_30.method4798()) {
			local19 = (Class3_Sub48) this.aClass183_30.method4797();
			OpenGL.glDeleteLists((int) local19.aLong262, local19.anInt9989);
		}
		@Pc(213) Class3 local213;
		while (!this.aClass183_35.method4798()) {
			local213 = this.aClass183_35.method4797();
			OpenGL.glDeleteProgramARB((int) local213.aLong262);
		}
		while (!this.aClass183_36.method4798()) {
			local213 = this.aClass183_36.method4797();
			OpenGL.glDeleteObjectARB(local213.aLong262);
		}
		while (!this.aClass183_30.method4798()) {
			local19 = (Class3_Sub48) this.aClass183_30.method4797();
			OpenGL.glDeleteLists((int) local19.aLong262, local19.anInt9989);
		}
		this.aClass287_1.method7071();
		if (this.v() > 100663296 && Static376.method6088() > this.aLong149 + 60000L) {
			System.gc();
			this.aLong149 = Static376.method6088();
		}
		this.anInt5325 = local9;
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "()Z")
	@Override
	public boolean method5288() {
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "()V")
	@Override
	public void method5342() {
		this.method4413(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "()Z")
	@Override
	public boolean method5332() {
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "(I)V")
	private void method4441() {
		Static250.aFloatArray44[1] = this.aFloat109 * this.aFloat98;
		Static250.aFloatArray44[3] = 1.0F;
		Static250.aFloatArray44[2] = this.aFloat100 * this.aFloat109;
		Static250.aFloatArray44[0] = this.aFloat93 * this.aFloat109;
		OpenGL.glLightModelfv(2899, Static250.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!ji", name = "ha", descriptor = "(F)V")
	@Override
	public void ha(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat109) {
			this.aFloat109 = arg0;
			this.method4441();
		}
	}

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "()Lclient!q;")
	@Override
	public Class255 method5343() {
		return this.aClass255_Sub1_1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZIII)V")
	public void method4442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "()Lclient!q;")
	@Override
	public Class255 method5294() {
		return new Class255_Sub1();
	}

	@OriginalMember(owner = "client!ji", name = "JA", descriptor = "(I)V")
	@Override
	public void JA(@OriginalArg(0) int arg0) {
		this.anInt5327 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt5327++;
		}
		this.anInt5326 = 0x1 << this.anInt5327;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "()Z")
	@Override
	public boolean method5280() {
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	@Override
	public void method5304(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "(IIIIII)V")
	@Override
	public void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method4420();
		this.method4392(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean449) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean449) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "(I)V")
	private void method4444() {
		if (this.aBoolean447 && !this.aBoolean450) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "()Lclient!og;")
	@Override
	public Class242 method5278() {
		@Pc(7) int local7 = -1;
		if (this.aString56.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString56.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString56.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class242(local7, "OpenGL", this.anInt5346, this.aString55, 0L);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!aw;Z)Lclient!xa;")
	@Override
	public Class37 method5275(@OriginalArg(0) Class20 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt707 * arg0.anInt706];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray6 == null) {
			for (local21 = 0; local21 < arg0.anInt706; local21++) {
				for (local25 = 0; local25 < arg0.anInt707; local25++) {
					@Pc(38) int local38 = arg0.anIntArray22[arg0.aByteArray5[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt706; local21++) {
				for (local25 = 0; local25 < arg0.anInt707; local25++) {
					local12[local16++] = arg0.aByteArray6[local14] << 24 | arg0.anIntArray22[arg0.aByteArray5[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(119) Class37 local119 = this.method5324(local12, arg0.anInt707, arg0.anInt707, arg0.anInt706);
		local119.EA(arg0.anInt705, arg0.anInt708, arg0.anInt704, arg0.anInt709);
		return local119;
	}

	@OriginalMember(owner = "client!ji", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass255_Sub1_4.aFloat161 + this.aClass255_Sub1_4.aFloat164 * (float) arg2 + this.aClass255_Sub1_4.aFloat168 * (float) arg1 + this.aClass255_Sub1_4.aFloat160 * (float) arg0;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass255_Sub1_4.aFloat168 * (float) arg4 + this.aClass255_Sub1_4.aFloat160 * (float) arg3 + this.aClass255_Sub1_4.aFloat164 * (float) arg5 + this.aClass255_Sub1_4.aFloat161;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt5370 > local28 && local59 < (float) this.anInt5370 || !(!((float) this.anInt5365 < local28) || !((float) this.anInt5365 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt5349 * (this.aClass255_Sub1_4.aFloat158 * (float) arg1 + (float) arg0 * this.aClass255_Sub1_4.aFloat159 + this.aClass255_Sub1_4.aFloat162 * (float) arg2 + this.aClass255_Sub1_4.aFloat166) / local28);
		@Pc(155) int local155 = (int) ((this.aClass255_Sub1_4.aFloat166 + this.aClass255_Sub1_4.aFloat159 * (float) arg3 + this.aClass255_Sub1_4.aFloat158 * (float) arg4 + this.aClass255_Sub1_4.aFloat162 * (float) arg5) * (float) this.anInt5349 / local59);
		if (this.aFloat108 > (float) local123 && this.aFloat108 > (float) local155 || this.aFloat102 < (float) local123 && this.aFloat102 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt5363 * ((float) arg2 * this.aClass255_Sub1_4.aFloat163 + (float) arg1 * this.aClass255_Sub1_4.aFloat167 + (float) arg0 * this.aClass255_Sub1_4.aFloat165 + this.aClass255_Sub1_4.aFloat157) / local28);
			@Pc(245) int local245 = (int) ((this.aClass255_Sub1_4.aFloat157 + this.aClass255_Sub1_4.aFloat165 * (float) arg3 + this.aClass255_Sub1_4.aFloat167 * (float) arg4 + this.aClass255_Sub1_4.aFloat163 * (float) arg5) * (float) this.anInt5363 / local59);
			return (!((float) local213 < this.aFloat90) || !((float) local245 < this.aFloat90)) && (!((float) local213 > this.aFloat88) || !((float) local245 > this.aFloat88));
		}
	}

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "(I)V")
	private void method4445() {
		if (this.aBoolean443) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean443 = false;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(JI)V")
	public synchronized void method4446(@OriginalArg(0) long arg0) {
		@Pc(11) Class3 local11 = new Class3();
		local11.aLong262 = arg0;
		this.aClass183_36.method4792(local11);
	}

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "(I)V")
	public void method4447() {
		if (this.anInt5369 == 16) {
			return;
		}
		this.method4374();
		this.method4382(true);
		this.method4428(true);
		this.method4413(true);
		this.method4392(1);
		this.anInt5369 = 16;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(BI)V")
	public void method4448(@OriginalArg(1) int arg0) {
		this.method4403(arg0, true);
	}

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "(I)V")
	private void method4449() {
		if (this.aFloat97 == 0.0F) {
			this.aFloatArray39[10] = this.aFloat104;
			this.aFloatArray39[14] = this.aFloat99;
		} else {
			@Pc(13) float local13 = this.aFloat92 / (this.aFloat97 + this.aFloat92);
			@Pc(17) float local17 = local13 * local13;
			@Pc(34) float local34 = (1.0F - local13) * (-local13 + 1.0F) * -this.aFloat99 / this.aFloat97;
			this.aFloatArray39[10] = this.aFloat104 + local34;
			this.aFloatArray39[14] = this.aFloat99 * local17;
		}
		this.aFloat107 = (this.aFloatArray39[14] - (float) this.anInt5365) / this.aFloatArray39[10];
		this.aFloat101 = (float) this.anInt5365 - this.aFloat97;
	}

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "()Z")
	@Override
	public boolean method5322() {
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "()Z")
	@Override
	public boolean method5301() {
		return this.aBoolean449 && (!this.method5325() || this.aBoolean436);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5286(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas9 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable4.containsKey(arg0)) {
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
			this.aHashtable4.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIBI)V")
	public void method4450(@OriginalArg(0) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ji", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(57) float local57;
		if (this.aClass11_Sub2_Sub1_1 == null || arg2 > this.aClass11_Sub2_Sub1_1.anInt1686 || arg3 > this.aClass11_Sub2_Sub1_1.anInt1687) {
			this.aClass11_Sub2_Sub1_1 = Static273.method4777(this, arg6, arg2, arg3);
			this.aClass11_Sub2_Sub1_1.method1633(false, false);
			local45 = this.aClass11_Sub2_Sub1_1.aFloat18;
			local57 = this.aClass11_Sub2_Sub1_1.aFloat19;
		} else {
			this.aClass11_Sub2_Sub1_1.method1641(arg6, false, arg2, 6406, arg3);
			local45 = this.aClass11_Sub2_Sub1_1.aFloat18 * (float) arg3 / (float) this.aClass11_Sub2_Sub1_1.anInt1687;
			local57 = this.aClass11_Sub2_Sub1_1.aFloat19 * (float) arg2 / (float) this.aClass11_Sub2_Sub1_1.anInt1686;
		}
		this.method4430();
		this.method4377(this.aClass11_Sub2_Sub1_1);
		this.method4392(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4410(arg5);
		this.method4451(34165, 34165);
		this.method4442(768, 34166, 0);
		this.method4442(770, 5890, 2);
		this.method4378(0, 34166);
		this.method4378(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
		@Pc(160) float local160 = (float) arg3 + local150;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local57);
		OpenGL.glVertex2f(local147, local160);
		OpenGL.glTexCoord2f(local45, local57);
		OpenGL.glVertex2f(local155, local160);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method4442(768, 5890, 0);
		this.method4442(770, 34166, 2);
		this.method4378(0, 5890);
		this.method4378(2, 34166);
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(III)V")
	public void method4451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5341 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(7) boolean local7 = false;
		if (this.anInt5342 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local7 = true;
			this.anInt5342 = arg1;
		}
		if (this.anInt5336 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local7 = true;
			this.anInt5336 = arg0;
		}
		if (local7) {
			this.anInt5369 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!sj;B)V")
	public void method4452(@OriginalArg(0) Interface16 arg0) {
		if (this.anInterface16_3 != arg0) {
			if (this.aBoolean460) {
				OpenGL.glBindBufferARB(34962, arg0.method7027());
			}
			this.anInterface16_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILclient!ul;II)V")
	public void method4453(@OriginalArg(0) int arg0, @OriginalArg(2) Interface21 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg1.method7916();
		@Pc(14) int local14 = arg2 * this.method4398(local7);
		this.method4433(arg1);
		OpenGL.glDrawElements(4, arg0, local7, arg1.method7919() + (long) local14);
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5319(@OriginalArg(0) Canvas arg0) {
		this.aLong148 = 0L;
		this.aCanvas10 = null;
		if (arg0 == null || this.aCanvas9 == arg0) {
			this.aCanvas10 = this.aCanvas9;
			this.aLong148 = this.aLong147;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable4.get(arg0);
			this.aLong148 = local36;
			this.aCanvas10 = arg0;
		}
		if (this.aCanvas10 == null || this.aLong148 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong148);
		this.method4389();
	}

	@OriginalMember(owner = "client!ji", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.lb - local12 - arg1, arg2, 1, 32993, this.anInt5362, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(Lclient!mga;B)V")
	public void method4454(@OriginalArg(0) Interface9 arg0) {
		if (this.anInt5329 < 0 || this.anInterface9Array2[this.anInt5329] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface9Array2[this.anInt5329--] = null;
		arg0.method6772();
		if (this.anInt5329 < 0) {
			this.anInterface9_2 = null;
		} else {
			this.anInterface9_2 = this.anInterface9Array2[this.anInt5329];
			this.anInterface9_2.method6768();
		}
	}

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "()Z")
	@Override
	public boolean method5325() {
		return this.aClass3_Sub8_Sub1_1 != null && this.aClass3_Sub8_Sub1_1.method1545();
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IZ)V")
	public void method4455(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean450 != arg0) {
			this.aBoolean450 = arg0;
			this.method4444();
		}
	}

	@OriginalMember(owner = "client!ji", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt5370;
	}

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "(IIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5363 = arg3;
		this.anInt5354 = arg1;
		this.anInt5349 = arg2;
		this.anInt5350 = arg0;
		this.method4404();
		this.method4383();
		if (this.anInt5347 == 3) {
			this.method4424();
		} else if (this.anInt5347 == 2) {
			this.method4438();
		}
	}

	@OriginalMember(owner = "client!ji", name = "G", descriptor = "()F")
	public float method4456() {
		return this.aFloat92;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(Z)V")
	@Override
	public void method5345(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIB)V")
	public synchronized void method4457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub48 local8 = new Class3_Sub48(arg0);
		local8.aLong262 = arg1;
		this.aClass183_31.method4792(local8);
	}

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "()V")
	@Override
	protected void method5305() {
		for (@Pc(8) Class3 local8 = this.aClass183_29.method4795(); local8 != null; local8 = this.aClass183_29.method4793()) {
			((Class3_Sub19_Sub1) local8).method3758();
		}
		if (this.aClass235_1 != null) {
			this.aClass235_1.method6003();
		}
		if (this.anOpenGL2 != null) {
			this.method4386();
			@Pc(37) Enumeration local37 = this.aHashtable4.keys();
			while (local37.hasMoreElements()) {
				@Pc(42) Canvas local42 = (Canvas) local37.nextElement();
				@Pc(48) Long local48 = (Long) this.aHashtable4.get(local42);
				this.anOpenGL2.releaseSurface(local42, local48);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean434) {
			Static455.method7048(false, true);
			this.aBoolean434 = false;
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(IZ)V")
	public void method4458(@OriginalArg(0) int arg0) {
		if (this.anInt5341 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt5341 = arg0;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
	@Override
	public void method5276() {
		if (!this.aBoolean455 || this.anInt5270 <= 0 || this.lb <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt5359;
		@Pc(22) int local22 = this.anInt5357;
		@Pc(25) int local25 = this.anInt5351;
		@Pc(28) int local28 = this.anInt5364;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4396();
		this.method4382(false);
		this.method4414(false);
		this.method4428(false);
		this.method4413(false);
		this.method4377(null);
		this.method4448(-2);
		this.method4432(1);
		this.method4392(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt5270, this.lb, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBZ[BI)Lclient!ul;")
	public Interface21 method4459(@OriginalArg(2) boolean arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2) {
		return (Interface21) (this.aBoolean460 && (!arg0 || this.aBoolean451) ? new Class184_Sub1(this, 5123, arg1, arg2, arg0) : new Class94_Sub2(this, 5123, arg1, arg2));
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method4420();
		this.method4392(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean449) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean449) {
			OpenGL.glEnable(32925);
		}
	}
}
