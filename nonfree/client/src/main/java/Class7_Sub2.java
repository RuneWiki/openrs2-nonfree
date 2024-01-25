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

@OriginalClass("client!kfa")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!kfa", name = "v", descriptor = "I")
	public int anInt5412;

	@OriginalMember(owner = "client!kfa", name = "P", descriptor = "I")
	private int anInt5432;

	@OriginalMember(owner = "client!kfa", name = "fb", descriptor = "I")
	public int anInt5447;

	@OriginalMember(owner = "client!kfa", name = "xc", descriptor = "I")
	private int anInt5512;

	@OriginalMember(owner = "client!kfa", name = "pe", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!kfa", name = "qe", descriptor = "I")
	public int anInt5597;

	@OriginalMember(owner = "client!kfa", name = "ve", descriptor = "Lclient!ec;")
	private Class87 aClass87_1;

	@OriginalMember(owner = "client!kfa", name = "we", descriptor = "Lclient!gj;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!kfa", name = "ye", descriptor = "Lclient!rk;")
	private Class88_Sub3 aClass88_Sub3_1;

	@OriginalMember(owner = "client!kfa", name = "Ce", descriptor = "Lclient!gj;")
	private Interface8 anInterface8_2;

	@OriginalMember(owner = "client!kfa", name = "He", descriptor = "I")
	public int anInt5603;

	@OriginalMember(owner = "client!kfa", name = "Ie", descriptor = "I")
	private int anInt5604;

	@OriginalMember(owner = "client!kfa", name = "Je", descriptor = "I")
	private int anInt5605;

	@OriginalMember(owner = "client!kfa", name = "Le", descriptor = "I")
	public int anInt5606;

	@OriginalMember(owner = "client!kfa", name = "Se", descriptor = "Z")
	private boolean aBoolean373;

	@OriginalMember(owner = "client!kfa", name = "Te", descriptor = "I")
	private int anInt5607;

	@OriginalMember(owner = "client!kfa", name = "Ue", descriptor = "Z")
	private boolean aBoolean374;

	@OriginalMember(owner = "client!kfa", name = "Ve", descriptor = "I")
	private int anInt5608;

	@OriginalMember(owner = "client!kfa", name = "We", descriptor = "Z")
	private boolean aBoolean375;

	@OriginalMember(owner = "client!kfa", name = "Xe", descriptor = "Z")
	private boolean aBoolean376;

	@OriginalMember(owner = "client!kfa", name = "Ye", descriptor = "I")
	private int anInt5609;

	@OriginalMember(owner = "client!kfa", name = "af", descriptor = "J")
	private long aLong143;

	@OriginalMember(owner = "client!kfa", name = "df", descriptor = "[Lclient!jo;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!kfa", name = "ef", descriptor = "I")
	private int anInt5610;

	@OriginalMember(owner = "client!kfa", name = "ff", descriptor = "I")
	private int anInt5611;

	@OriginalMember(owner = "client!kfa", name = "gf", descriptor = "Lclient!qb;")
	public Class65_Sub2 aClass65_Sub2_1;

	@OriginalMember(owner = "client!kfa", name = "hf", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!kfa", name = "mf", descriptor = "Lclient!qb;")
	public Class65_Sub2 aClass65_Sub2_2;

	@OriginalMember(owner = "client!kfa", name = "of", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!kfa", name = "qf", descriptor = "Z")
	public boolean aBoolean377;

	@OriginalMember(owner = "client!kfa", name = "rf", descriptor = "Z")
	public boolean aBoolean378;

	@OriginalMember(owner = "client!kfa", name = "wf", descriptor = "I")
	private int anInt5618;

	@OriginalMember(owner = "client!kfa", name = "xf", descriptor = "F")
	private float aFloat131;

	@OriginalMember(owner = "client!kfa", name = "zf", descriptor = "Z")
	public boolean aBoolean379;

	@OriginalMember(owner = "client!kfa", name = "Af", descriptor = "I")
	private int anInt5619;

	@OriginalMember(owner = "client!kfa", name = "Bf", descriptor = "Lclient!qb;")
	public Class65_Sub2 aClass65_Sub2_3;

	@OriginalMember(owner = "client!kfa", name = "Cf", descriptor = "Lclient!bb;")
	private Class3_Sub2_Sub1 aClass3_Sub2_Sub1_3;

	@OriginalMember(owner = "client!kfa", name = "Ef", descriptor = "Lclient!qb;")
	public Class65_Sub2 aClass65_Sub2_4;

	@OriginalMember(owner = "client!kfa", name = "Gf", descriptor = "Lclient!il;")
	public Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!kfa", name = "If", descriptor = "Lclient!ec;")
	public Class87 aClass87_2;

	@OriginalMember(owner = "client!kfa", name = "Mf", descriptor = "Z")
	public boolean aBoolean382;

	@OriginalMember(owner = "client!kfa", name = "Nf", descriptor = "Lclient!qb;")
	public Class65_Sub2 aClass65_Sub2_5;

	@OriginalMember(owner = "client!kfa", name = "Pf", descriptor = "I")
	private int anInt5623;

	@OriginalMember(owner = "client!kfa", name = "Qf", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!kfa", name = "Sf", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!kfa", name = "Tf", descriptor = "Lclient!mba;")
	public Class209 aClass209_11;

	@OriginalMember(owner = "client!kfa", name = "Yf", descriptor = "Lclient!mn;")
	private Interface14 anInterface14_4;

	@OriginalMember(owner = "client!kfa", name = "Zf", descriptor = "Z")
	public boolean aBoolean385;

	@OriginalMember(owner = "client!kfa", name = "ag", descriptor = "Lclient!nu;")
	private Interface16 anInterface16_4;

	@OriginalMember(owner = "client!kfa", name = "bg", descriptor = "Lclient!mba;")
	public Class209 aClass209_12;

	@OriginalMember(owner = "client!kfa", name = "cg", descriptor = "I")
	public int anInt5625;

	@OriginalMember(owner = "client!kfa", name = "fg", descriptor = "Z")
	private boolean aBoolean386;

	@OriginalMember(owner = "client!kfa", name = "ig", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!kfa", name = "kg", descriptor = "Ljava/lang/String;")
	private String aString110;

	@OriginalMember(owner = "client!kfa", name = "lg", descriptor = "I")
	private int anInt5628;

	@OriginalMember(owner = "client!kfa", name = "ng", descriptor = "Lclient!uba;")
	private Class112_Sub2 aClass112_Sub2_1;

	@OriginalMember(owner = "client!kfa", name = "og", descriptor = "Z")
	private boolean aBoolean387;

	@OriginalMember(owner = "client!kfa", name = "pg", descriptor = "Z")
	public boolean aBoolean388;

	@OriginalMember(owner = "client!kfa", name = "rg", descriptor = "F")
	private float aFloat140;

	@OriginalMember(owner = "client!kfa", name = "sg", descriptor = "I")
	private int anInt5631;

	@OriginalMember(owner = "client!kfa", name = "wg", descriptor = "F")
	private float aFloat141;

	@OriginalMember(owner = "client!kfa", name = "yg", descriptor = "Lclient!qb;")
	public Class65_Sub2 aClass65_Sub2_6;

	@OriginalMember(owner = "client!kfa", name = "zg", descriptor = "Lclient!qb;")
	public Class65_Sub2 aClass65_Sub2_7;

	@OriginalMember(owner = "client!kfa", name = "Ag", descriptor = "I")
	public int anInt5634;

	@OriginalMember(owner = "client!kfa", name = "Dg", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!kfa", name = "Eg", descriptor = "Lclient!qb;")
	public Class65_Sub2 aClass65_Sub2_8;

	@OriginalMember(owner = "client!kfa", name = "Fg", descriptor = "Lclient!nu;")
	private Interface16 anInterface16_5;

	@OriginalMember(owner = "client!kfa", name = "Gg", descriptor = "Lclient!qb;")
	public Class65_Sub2 aClass65_Sub2_9;

	@OriginalMember(owner = "client!kfa", name = "Ig", descriptor = "Z")
	private boolean aBoolean391;

	@OriginalMember(owner = "client!kfa", name = "Jg", descriptor = "I")
	public int anInt5636;

	@OriginalMember(owner = "client!kfa", name = "Mg", descriptor = "Z")
	private boolean aBoolean393;

	@OriginalMember(owner = "client!kfa", name = "Sg", descriptor = "Ljava/lang/String;")
	private String aString111;

	@OriginalMember(owner = "client!kfa", name = "Vg", descriptor = "I")
	private int anInt5639;

	@OriginalMember(owner = "client!kfa", name = "Wg", descriptor = "Z")
	private boolean aBoolean397;

	@OriginalMember(owner = "client!kfa", name = "Xg", descriptor = "F")
	public float aFloat146;

	@OriginalMember(owner = "client!kfa", name = "Yg", descriptor = "Z")
	public boolean aBoolean398;

	@OriginalMember(owner = "client!kfa", name = "Zg", descriptor = "I")
	public int anInt5640;

	@OriginalMember(owner = "client!kfa", name = "ah", descriptor = "Z")
	public boolean aBoolean399;

	@OriginalMember(owner = "client!kfa", name = "ch", descriptor = "Lclient!qb;")
	public Class65_Sub2 aClass65_Sub2_10;

	@OriginalMember(owner = "client!kfa", name = "dh", descriptor = "Z")
	private boolean aBoolean400;

	@OriginalMember(owner = "client!kfa", name = "eh", descriptor = "Z")
	public boolean aBoolean401;

	@OriginalMember(owner = "client!kfa", name = "kh", descriptor = "I")
	private int anInt5644;

	@OriginalMember(owner = "client!kfa", name = "mh", descriptor = "I")
	private int anInt5645;

	@OriginalMember(owner = "client!kfa", name = "Hb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!kfa", name = "Xd", descriptor = "I")
	public int anInt5587 = 128;

	@OriginalMember(owner = "client!kfa", name = "ae", descriptor = "Lclient!cga;")
	private final Class53 aClass53_1 = new Class53();

	@OriginalMember(owner = "client!kfa", name = "le", descriptor = "Lclient!ho;")
	private final Class81_Sub2 aClass81_Sub2_1 = new Class81_Sub2();

	@OriginalMember(owner = "client!kfa", name = "ne", descriptor = "Lclient!ho;")
	public final Class81_Sub2 aClass81_Sub2_2 = new Class81_Sub2();

	@OriginalMember(owner = "client!kfa", name = "re", descriptor = "I")
	public int anInt5598 = 3;

	@OriginalMember(owner = "client!kfa", name = "ue", descriptor = "Z")
	private boolean aBoolean372 = false;

	@OriginalMember(owner = "client!kfa", name = "te", descriptor = "I")
	public int anInt5599 = 8;

	@OriginalMember(owner = "client!kfa", name = "oe", descriptor = "Lclient!au;")
	private final Class22 aClass22_31 = new Class22();

	@OriginalMember(owner = "client!kfa", name = "Ae", descriptor = "I")
	private int anInt5600 = -1;

	@OriginalMember(owner = "client!kfa", name = "xe", descriptor = "[Lclient!gj;")
	private final Interface8[] anInterface8Array1 = new Interface8[4];

	@OriginalMember(owner = "client!kfa", name = "ze", descriptor = "[Lclient!gj;")
	private final Interface8[] anInterface8Array2 = new Interface8[4];

	@OriginalMember(owner = "client!kfa", name = "De", descriptor = "[Lclient!gj;")
	private final Interface8[] anInterface8Array3 = new Interface8[4];

	@OriginalMember(owner = "client!kfa", name = "Be", descriptor = "I")
	private int anInt5601 = -1;

	@OriginalMember(owner = "client!kfa", name = "Fe", descriptor = "I")
	private int anInt5602 = -1;

	@OriginalMember(owner = "client!kfa", name = "Ee", descriptor = "Lclient!gd;")
	private final Class120 aClass120_7 = new Class120();

	@OriginalMember(owner = "client!kfa", name = "Ge", descriptor = "Lclient!mo;")
	private final Class221 aClass221_17 = new Class221(16);

	@OriginalMember(owner = "client!kfa", name = "Ke", descriptor = "Lclient!au;")
	private final Class22 aClass22_32 = new Class22();

	@OriginalMember(owner = "client!kfa", name = "Me", descriptor = "Lclient!au;")
	private final Class22 aClass22_33 = new Class22();

	@OriginalMember(owner = "client!kfa", name = "Ne", descriptor = "Lclient!au;")
	private final Class22 aClass22_34 = new Class22();

	@OriginalMember(owner = "client!kfa", name = "Oe", descriptor = "Lclient!au;")
	private final Class22 aClass22_35 = new Class22();

	@OriginalMember(owner = "client!kfa", name = "Pe", descriptor = "Lclient!au;")
	private final Class22 aClass22_36 = new Class22();

	@OriginalMember(owner = "client!kfa", name = "Qe", descriptor = "Lclient!au;")
	private final Class22 aClass22_37 = new Class22();

	@OriginalMember(owner = "client!kfa", name = "Re", descriptor = "Lclient!au;")
	private final Class22 aClass22_38 = new Class22();

	@OriginalMember(owner = "client!kfa", name = "Ze", descriptor = "Lclient!ho;")
	public final Class81_Sub2 aClass81_Sub2_3 = new Class81_Sub2();

	@OriginalMember(owner = "client!kfa", name = "bf", descriptor = "Lclient!ho;")
	public final Class81_Sub2 bf = new Class81_Sub2();

	@OriginalMember(owner = "client!kfa", name = "cf", descriptor = "Lclient!ho;")
	public final Class81_Sub2 aClass81_Sub2_4 = new Class81_Sub2();

	@OriginalMember(owner = "client!kfa", name = "uf", descriptor = "I")
	public int anInt5617 = 0;

	@OriginalMember(owner = "client!kfa", name = "Of", descriptor = "I")
	public int anInt5622 = 0;

	@OriginalMember(owner = "client!kfa", name = "yf", descriptor = "F")
	private float aFloat132 = 1.0F;

	@OriginalMember(owner = "client!kfa", name = "vf", descriptor = "[F")
	private final float[] aFloatArray39 = new float[4];

	@OriginalMember(owner = "client!kfa", name = "Xf", descriptor = "I")
	public int anInt5624 = 50;

	@OriginalMember(owner = "client!kfa", name = "Wf", descriptor = "[Lclient!am;")
	private final Class4_Sub3[] aClass4_Sub3Array3 = new Class4_Sub3[Static522.anInt9606];

	@OriginalMember(owner = "client!kfa", name = "gg", descriptor = "F")
	public float aFloat138 = 3584.0F;

	@OriginalMember(owner = "client!kfa", name = "jf", descriptor = "I")
	private int anInt5612 = 0;

	@OriginalMember(owner = "client!kfa", name = "nf", descriptor = "F")
	public float aFloat129 = 1.0F;

	@OriginalMember(owner = "client!kfa", name = "lf", descriptor = "I")
	private int anInt5613 = 0;

	@OriginalMember(owner = "client!kfa", name = "Vf", descriptor = "Z")
	private boolean aBoolean384 = true;

	@OriginalMember(owner = "client!kfa", name = "pf", descriptor = "I")
	private int anInt5614 = -1;

	@OriginalMember(owner = "client!kfa", name = "Jf", descriptor = "[F")
	private final float[] aFloatArray40 = new float[16];

	@OriginalMember(owner = "client!kfa", name = "eg", descriptor = "F")
	public float aFloat137 = 1.0F;

	@OriginalMember(owner = "client!kfa", name = "tg", descriptor = "I")
	public int anInt5632 = 0;

	@OriginalMember(owner = "client!kfa", name = "xg", descriptor = "F")
	public float aFloat142 = -1.0F;

	@OriginalMember(owner = "client!kfa", name = "Bg", descriptor = "I")
	private int anInt5635 = 8448;

	@OriginalMember(owner = "client!kfa", name = "kf", descriptor = "F")
	private float aFloat128 = 1.0F;

	@OriginalMember(owner = "client!kfa", name = "ug", descriptor = "I")
	private int anInt5633 = 0;

	@OriginalMember(owner = "client!kfa", name = "dg", descriptor = "F")
	private float aFloat136 = -1.0F;

	@OriginalMember(owner = "client!kfa", name = "Df", descriptor = "I")
	public int anInt5620 = -1;

	@OriginalMember(owner = "client!kfa", name = "jg", descriptor = "I")
	public int anInt5627 = 512;

	@OriginalMember(owner = "client!kfa", name = "Rf", descriptor = "F")
	public float aFloat135 = 3584.0F;

	@OriginalMember(owner = "client!kfa", name = "Ng", descriptor = "Z")
	private boolean aBoolean394 = false;

	@OriginalMember(owner = "client!kfa", name = "Ff", descriptor = "F")
	private float aFloat133 = -1.0F;

	@OriginalMember(owner = "client!kfa", name = "tf", descriptor = "I")
	public int anInt5616 = -1;

	@OriginalMember(owner = "client!kfa", name = "mg", descriptor = "I")
	public int anInt5629 = -1;

	@OriginalMember(owner = "client!kfa", name = "Og", descriptor = "I")
	public int anInt5637 = -1;

	@OriginalMember(owner = "client!kfa", name = "Lg", descriptor = "F")
	public float aFloat144 = -1.0F;

	@OriginalMember(owner = "client!kfa", name = "Qg", descriptor = "[F")
	private final float[] aFloatArray42 = new float[4];

	@OriginalMember(owner = "client!kfa", name = "Tg", descriptor = "F")
	public float aFloat145 = 1.0F;

	@OriginalMember(owner = "client!kfa", name = "hg", descriptor = "I")
	private int anInt5626 = 8448;

	@OriginalMember(owner = "client!kfa", name = "Hg", descriptor = "[F")
	private final float[] aFloatArray41 = new float[4];

	@OriginalMember(owner = "client!kfa", name = "bh", descriptor = "[F")
	public final float[] aFloatArray43 = new float[4];

	@OriginalMember(owner = "client!kfa", name = "Hf", descriptor = "I")
	private int anInt5621 = 0;

	@OriginalMember(owner = "client!kfa", name = "Ug", descriptor = "I")
	private int anInt5638 = 0;

	@OriginalMember(owner = "client!kfa", name = "ih", descriptor = "I")
	private int anInt5642 = 0;

	@OriginalMember(owner = "client!kfa", name = "fh", descriptor = "F")
	private float aFloat147 = 0.0F;

	@OriginalMember(owner = "client!kfa", name = "hh", descriptor = "I")
	private int anInt5641 = 3584;

	@OriginalMember(owner = "client!kfa", name = "qg", descriptor = "I")
	public int anInt5630 = 0;

	@OriginalMember(owner = "client!kfa", name = "jh", descriptor = "I")
	public int anInt5643 = 512;

	@OriginalMember(owner = "client!kfa", name = "Uf", descriptor = "Lclient!ij;")
	public Class4_Sub13_Sub1 aClass4_Sub13_Sub1_3 = new Class4_Sub13_Sub1(8192);

	@OriginalMember(owner = "client!kfa", name = "oh", descriptor = "[B")
	public final byte[] aByteArray45 = new byte[16384];

	@OriginalMember(owner = "client!kfa", name = "ph", descriptor = "[I")
	public int[] anIntArray295 = new int[1];

	@OriginalMember(owner = "client!kfa", name = "nh", descriptor = "[I")
	public int[] anIntArray294 = new int[1];

	@OriginalMember(owner = "client!kfa", name = "lh", descriptor = "[I")
	public int[] anIntArray293 = new int[1];

	@OriginalMember(owner = "client!kfa", name = "Yc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas9;

	@OriginalMember(owner = "client!kfa", name = "fc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!kfa", name = "ee", descriptor = "I")
	public final int anInt5592;

	@OriginalMember(owner = "client!kfa", name = "Nb", descriptor = "Lclient!jaggl/OpenGL;")
	public OpenGL anOpenGL2;

	@OriginalMember(owner = "client!kfa", name = "Vc", descriptor = "J")
	private final long aLong142;

	@OriginalMember(owner = "client!kfa", name = "eb", descriptor = "J")
	private long aLong140;

	@OriginalMember(owner = "client!kfa", name = "sf", descriptor = "I")
	public final int anInt5615;

	@OriginalMember(owner = "client!kfa", name = "Kf", descriptor = "Z")
	public boolean aBoolean380;

	@OriginalMember(owner = "client!kfa", name = "Pg", descriptor = "Z")
	public boolean aBoolean395;

	@OriginalMember(owner = "client!kfa", name = "gh", descriptor = "Z")
	private boolean aBoolean402;

	@OriginalMember(owner = "client!kfa", name = "Lf", descriptor = "Z")
	public boolean aBoolean381;

	@OriginalMember(owner = "client!kfa", name = "Rg", descriptor = "Z")
	public boolean aBoolean396;

	@OriginalMember(owner = "client!kfa", name = "Kg", descriptor = "Z")
	private boolean aBoolean392;

	@OriginalMember(owner = "client!kfa", name = "Cg", descriptor = "Z")
	public boolean aBoolean390;

	@OriginalMember(owner = "client!kfa", name = "vg", descriptor = "Z")
	private final boolean aBoolean389;

	@OriginalMember(owner = "client!kfa", name = "he", descriptor = "Lclient!tm;")
	private final Class317 aClass317_1;

	@OriginalMember(owner = "client!kfa", name = "se", descriptor = "Lclient!un;")
	public final Class332 aClass332_1;

	@OriginalMember(owner = "client!kfa", name = "ge", descriptor = "Lclient!ti;")
	private final Class315 aClass315_1;

	@OriginalMember(owner = "client!kfa", name = "je", descriptor = "Lclient!mj;")
	private Class4_Sub31_Sub1 aClass4_Sub31_Sub1_1;

	@OriginalMember(owner = "client!kfa", name = "de", descriptor = "Lclient!wq;")
	private final Class363 aClass363_1;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;I)V")
	public Class7_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		this.aCanvas8 = this.aCanvas9 = arg0;
		this.anInt5592 = arg2;
		if (!Static188.method3095("jaclib")) {
			throw new RuntimeException("");
		} else if (Static188.method3095("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong140 = this.aLong142 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt5592);
				if (this.aLong142 == 0L) {
					throw new RuntimeException("");
				}
				this.method4357();
				@Pc(339) int local339 = this.method4317();
				if (local339 != 0) {
					throw new RuntimeException("");
				}
				this.anInt5615 = this.aBoolean388 ? 33639 : 5121;
				if (this.aString111.indexOf("radeon") != -1) {
					@Pc(365) int local365 = 0;
					@Pc(367) boolean local367 = false;
					@Pc(369) boolean local369 = false;
					@Pc(378) String[] local378 = Static297.method4750(this.aString111.replace('/', ' '), ' ');
					for (@Pc(380) int local380 = 0; local380 < local378.length; local380++) {
						@Pc(386) String local386 = local378[local380];
						try {
							if (local386.length() > 0) {
								if (local386.charAt(0) == 'x' && local386.length() >= 3 && Static256.method4063(local386.substring(1, 3))) {
									local369 = true;
									local386 = local386.substring(1);
								}
								if (local386.equals("hd")) {
									local367 = true;
								} else {
									if (local386.startsWith("hd")) {
										local386 = local386.substring(2);
										local367 = true;
									}
									if (local386.length() >= 4 && Static256.method4063(local386.substring(0, 4))) {
										local365 = Static393.method6016(local386.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(453) Exception local453) {
						}
					}
					if (!local367 || local365 < 4000) {
						this.aBoolean380 = false;
					}
					if (!local369 && !local367) {
						if (local365 >= 7000 && local365 <= 9250) {
							this.aBoolean395 = false;
						}
						if (local365 >= 7000 && local365 <= 7999) {
							this.aBoolean402 = false;
						}
					}
					this.aBoolean381 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean396 = true;
					this.aBoolean392 = this.aBoolean402;
				}
				if (this.aString110.indexOf("intel") != -1) {
					this.aBoolean390 = false;
				}
				this.aBoolean389 = !this.aString110.equals("s3 graphics");
				if (this.aBoolean402) {
					try {
						@Pc(538) int[] local538 = new int[1];
						OpenGL.glGenBuffersARB(1, local538, 0);
					} catch (@Pc(544) Throwable local544) {
						throw new RuntimeException("");
					}
				}
				Static547.method7662(true, false);
				this.aBoolean372 = true;
				this.aClass317_1 = new Class317(this, super.anInterface7_12);
				this.method4305();
				this.aClass332_1 = new Class332(this);
				this.aClass315_1 = new Class315(this);
				if (this.aClass315_1.method7296()) {
					this.aClass4_Sub31_Sub1_1 = new Class4_Sub31_Sub1(this);
					if (!this.aClass4_Sub31_Sub1_1.method5064()) {
						this.aClass4_Sub31_Sub1_1.method5057();
						this.aClass4_Sub31_Sub1_1 = null;
					}
				}
				this.aClass363_1 = new Class363(this);
				this.method4311();
				this.method4310();
				this.method7830();
			} catch (@Pc(618) Throwable local618) {
				local618.printStackTrace();
				this.method7822();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class88 method7855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class88_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IIII)V")
	public void method4276(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!kfa", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean379) {
			throw new RuntimeException("");
		}
		this.anInt5634 = arg0;
		this.anInt5637 = arg2;
		this.anInt5629 = arg1;
		this.anInt5617 = arg3;
		if (this.aBoolean394) {
			this.aClass363_1.aClass105_Sub5_1.method5244();
			this.aClass363_1.aClass105_Sub5_1.method5242();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt5614;
		if (local11 || arg1 != this.aFloat144 || this.aFloat142 != arg2) {
			this.aFloat144 = arg1;
			this.anInt5614 = arg0;
			this.aFloat142 = arg2;
			if (local11) {
				this.aFloat137 = (float) (this.anInt5614 & 0xFF00) / 65280.0F;
				this.aFloat129 = (float) (this.anInt5614 & 0xFF) / 255.0F;
				this.aFloat145 = (float) (this.anInt5614 & 0xFF0000) / 1.671168E7F;
				this.method4331();
			}
			this.method4344();
		}
		if (this.aFloatArray42[0] == arg3 && arg4 == this.aFloatArray42[1] && arg5 == this.aFloatArray42[2]) {
			return;
		}
		this.aFloatArray42[0] = arg3;
		this.aFloatArray42[2] = arg5;
		this.aFloatArray42[1] = arg4;
		this.aFloatArray39[1] = -arg4;
		this.aFloatArray39[2] = -arg5;
		this.aFloatArray39[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray43[0] = local138 * arg3;
		this.aFloatArray43[2] = local138 * arg5;
		this.aFloatArray43[1] = arg4 * local138;
		this.aFloatArray41[0] = -this.aFloatArray43[0];
		this.aFloatArray41[2] = -this.aFloatArray43[2];
		this.aFloatArray41[1] = -this.aFloatArray43[1];
		this.method4330();
		this.anInt5636 = (int) (arg3 * 256.0F / arg4);
		this.anInt5640 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7817(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!kfa", name = "j", descriptor = "()V")
	@Override
	public void method7811() {
	}

	@OriginalMember(owner = "client!kfa", name = "q", descriptor = "()V")
	@Override
	public void method7827() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!kfa", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4337();
		this.method4343(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kfa", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt5622, this.anInt5632, this.anInt5627, this.anInt5643 };
	}

	@OriginalMember(owner = "client!kfa", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(53) float local53;
		if (this.aClass3_Sub2_Sub1_3 == null || this.aClass3_Sub2_Sub1_3.anInt1100 < arg2 || this.aClass3_Sub2_Sub1_3.anInt1104 < arg3) {
			this.aClass3_Sub2_Sub1_3 = Static283.method4492(arg2, this, arg3, arg6);
			this.aClass3_Sub2_Sub1_3.method953(false, false);
			local53 = this.aClass3_Sub2_Sub1_3.aFloat42;
			local41 = this.aClass3_Sub2_Sub1_3.aFloat43;
		} else {
			this.aClass3_Sub2_Sub1_3.method958(arg2, false, arg6, arg3, 6406);
			local41 = (float) arg3 * this.aClass3_Sub2_Sub1_3.aFloat43 / (float) this.aClass3_Sub2_Sub1_3.anInt1104;
			local53 = (float) arg2 * this.aClass3_Sub2_Sub1_3.aFloat42 / (float) this.aClass3_Sub2_Sub1_3.anInt1100;
		}
		this.method4355();
		this.method4313(this.aClass3_Sub2_Sub1_3);
		this.method4343(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4315(arg5);
		this.method4346(34165, 34165);
		this.method4280(34166, 0, 768);
		this.method4280(5890, 2, 770);
		this.method4276(34166, 0);
		this.method4276(5890, 2);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = local143 + (float) arg2;
		@Pc(156) float local156 = local146 + (float) arg3;
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
		this.method4280(5890, 0, 768);
		this.method4280(34166, 2, 770);
		this.method4276(5890, 0);
		this.method4276(34166, 2);
	}

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "(I)V")
	@Override
	public synchronized void method7853(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class4_Sub27 local19;
		while (!this.aClass22_33.method893()) {
			local19 = (Class4_Sub27) this.aClass22_33.method896();
			Static320.anIntArray350[local7++] = (int) local19.aLong295;
			this.anInt5603 -= local19.anInt4968;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static320.anIntArray350, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static320.anIntArray350, 0);
			local7 = 0;
		}
		while (!this.aClass22_34.method893()) {
			local19 = (Class4_Sub27) this.aClass22_34.method896();
			Static320.anIntArray350[local7++] = (int) local19.aLong295;
			this.anInt5606 -= local19.anInt4968;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static320.anIntArray350, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static320.anIntArray350, 0);
			local7 = 0;
		}
		while (!this.aClass22_35.method893()) {
			local19 = (Class4_Sub27) this.aClass22_35.method896();
			Static320.anIntArray350[local7++] = local19.anInt4968;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static320.anIntArray350, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static320.anIntArray350, 0);
			local7 = 0;
		}
		while (!this.aClass22_36.method893()) {
			local19 = (Class4_Sub27) this.aClass22_36.method896();
			Static320.anIntArray350[local7++] = (int) local19.aLong295;
			this.anInt5605 -= local19.anInt4968;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static320.anIntArray350, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static320.anIntArray350, 0);
		}
		while (!this.aClass22_32.method893()) {
			local19 = (Class4_Sub27) this.aClass22_32.method896();
			OpenGL.glDeleteLists((int) local19.aLong295, local19.anInt4968);
		}
		@Pc(214) Class4 local214;
		while (!this.aClass22_37.method893()) {
			local214 = this.aClass22_37.method896();
			OpenGL.glDeleteProgramARB((int) local214.aLong295);
		}
		while (!this.aClass22_38.method893()) {
			local214 = this.aClass22_38.method896();
			OpenGL.glDeleteObjectARB(local214.aLong295);
		}
		while (!this.aClass22_32.method893()) {
			local19 = (Class4_Sub27) this.aClass22_32.method896();
			OpenGL.glDeleteLists((int) local19.aLong295, local19.anInt4968);
		}
		this.aClass317_1.method7321();
		if (this.b() > 100663296 && this.aLong143 + 60000L < Static112.method2047()) {
			System.gc();
			this.aLong143 = Static112.method2047();
		}
		this.anInt5597 = local11;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IF)V")
	public void method4277(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat132) {
			this.aFloat132 = arg0;
			if (this.anInt5623 == 3) {
				this.method4309();
			}
		}
	}

	@OriginalMember(owner = "client!kfa", name = "y", descriptor = "()Z")
	@Override
	public boolean method7845() {
		return true;
	}

	@OriginalMember(owner = "client!kfa", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(6) int local6 = this.anInt5644;
		this.anInt5644 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V")
	private void method4278() {
		@Pc(6) float[] local6 = this.aFloatArray40;
		@Pc(18) float local18 = (float) (this.anInt5624 * -this.anInt5622) / (float) this.anInt5627;
		@Pc(33) float local33 = (float) ((this.anInt5412 - this.anInt5622) * this.anInt5624) / (float) this.anInt5627;
		@Pc(44) float local44 = (float) (this.anInt5624 * this.anInt5632) / (float) this.anInt5643;
		@Pc(64) float local64 = (float) (this.anInt5624 * (this.anInt5632 - this.anInt5447)) / (float) this.anInt5643;
		if (local33 == local18 || local44 == local64) {
			local6[10] = 1.0F;
			local6[1] = 0.0F;
			local6[7] = 0.0F;
			local6[14] = 0.0F;
			local6[13] = 0.0F;
			local6[2] = 0.0F;
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[6] = 0.0F;
			local6[0] = 1.0F;
			local6[9] = 0.0F;
			local6[11] = 0.0F;
			local6[15] = 1.0F;
			local6[8] = 0.0F;
			local6[12] = 0.0F;
			local6[5] = 1.0F;
		} else {
			@Pc(144) float local144 = (float) this.anInt5624 * 2.0F;
			local6[9] = (local64 + local44) / (local44 - local64);
			local6[10] = this.aFloat140 = (float) -(this.anInt5641 + this.anInt5624) / (float) (this.anInt5641 - this.anInt5624);
			local6[15] = 0.0F;
			local6[7] = 0.0F;
			local6[6] = 0.0F;
			local6[0] = local144 / (local33 - local18);
			local6[13] = 0.0F;
			local6[3] = 0.0F;
			local6[2] = 0.0F;
			local6[14] = this.aFloat141 = -((float) this.anInt5641 * local144) / (float) (this.anInt5641 - this.anInt5624);
			local6[8] = (local18 + local33) / (-local18 + local33);
			local6[4] = 0.0F;
			local6[11] = -1.0F;
			local6[5] = local144 / (local44 - local64);
			local6[12] = 0.0F;
			local6[1] = 0.0F;
		}
		this.method4323();
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)V")
	public void method4279() {
		if (this.anInt5608 == 4) {
			return;
		}
		this.method4336();
		this.method4321(false);
		this.method4290(false);
		this.method4300(false);
		this.method4293(false);
		this.method4339(-2);
		this.method4343(1);
		this.anInt5608 = 4;
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(IIII)V")
	public void method4280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZLclient!gj;)V")
	public void method4281(@OriginalArg(1) Interface8 arg0) {
		if (this.aBoolean398) {
			this.method4348(arg0);
			this.method4282(arg0);
		} else if (this.anInt5602 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt5602 >= 0) {
				this.anInterface8Array3[this.anInt5602].method2057();
			}
			this.anInterface8_2 = this.anInterface8_1 = this.anInterface8Array3[++this.anInt5602] = arg0;
			this.anInterface8_2.method2059();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt5624;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!gj;I)V")
	public void method4282(@OriginalArg(0) Interface8 arg0) {
		if (this.anInt5601 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5601 >= 0) {
			this.anInterface8Array2[this.anInt5601].method2060();
		}
		this.anInterface8_1 = this.anInterface8Array2[++this.anInt5601] = arg0;
		this.anInterface8_1.method2058();
	}

	@OriginalMember(owner = "client!kfa", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean379 = true;
		this.anInt5634 = arg0;
		this.anInt5617 = arg3;
		this.anInt5629 = arg1;
		this.anInt5637 = arg2;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method4337();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method4343(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean400) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean400) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4293(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "([I)V")
	@Override
	public void method7806(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt5447;
		arg0[0] = this.anInt5412;
	}

	@OriginalMember(owner = "client!kfa", name = "j", descriptor = "(I)V")
	private void method4284() {
		if (this.anInt5623 != 3) {
			this.anInt5623 = 3;
			this.method4309();
			this.method4285();
			this.anInt5608 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "m", descriptor = "()Lclient!sr;")
	@Override
	public Class308 method7815() {
		@Pc(7) int local7 = -1;
		if (this.aString110.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString110.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString110.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class308(local7, "OpenGL", this.anInt5611, this.aString111, 0L);
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)V")
	@Override
	public void method7810(@OriginalArg(0) int arg0) {
		this.method4345();
	}

	@OriginalMember(owner = "client!kfa", name = "w", descriptor = "()Lclient!q;")
	@Override
	public Class81 method7842() {
		return new Class81_Sub2();
	}

	@OriginalMember(owner = "client!kfa", name = "n", descriptor = "()Z")
	@Override
	public boolean method7820() {
		return true;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7796(@OriginalArg(0) Canvas arg0) {
		this.aLong140 = 0L;
		this.aCanvas8 = null;
		if (arg0 == null || arg0 == this.aCanvas9) {
			this.aLong140 = this.aLong142;
			this.aCanvas8 = this.aCanvas9;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable6.get(arg0);
			this.aLong140 = local36;
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.aLong140 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong140);
		this.method4310();
	}

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "()Z")
	@Override
	public boolean method7802() {
		return true;
	}

	@OriginalMember(owner = "client!kfa", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt5621 = 0;
		this.anInt5613 = this.anInt5412;
		this.anInt5612 = this.anInt5447;
		this.anInt5642 = 0;
		OpenGL.glDisable(3089);
		this.method4295();
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(B)V")
	private void method4285() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.bf.method3240(), 0);
		if (this.aBoolean394) {
			this.aClass363_1.aClass105_Sub5_1.method5244();
		}
		this.method4330();
		this.method4286();
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(B)V")
	private void method4286() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt5619; local7++) {
			@Pc(14) Class4_Sub3 local14 = this.aClass4_Sub3Array3[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static241.aFloatArray38[0] = local14.method4954();
			Static241.aFloatArray38[1] = local14.method4953();
			Static241.aFloatArray38[2] = local14.method4949();
			Static241.aFloatArray38[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static241.aFloatArray38, 0);
			@Pc(52) int local52 = local14.method4952();
			@Pc(58) float local58 = local14.method4955() / 255.0F;
			Static241.aFloatArray38[1] = (float) (local52 >> 8 & 0xFF) * local58;
			Static241.aFloatArray38[0] = (float) (local52 >> 16 & 0xFF) * local58;
			Static241.aFloatArray38[2] = (float) (local52 & 0xFF) * local58;
			OpenGL.glLightfv(local18, 4609, Static241.aFloatArray38, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method4950() * local14.method4950()));
			OpenGL.glEnable(local18);
		}
		while (this.anInt5631 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt5631 = this.anInt5619;
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7836(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas9) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable6.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "z", descriptor = "()Z")
	@Override
	public boolean method7847() {
		return true;
	}

	@OriginalMember(owner = "client!kfa", name = "k", descriptor = "(I)V")
	public void method4287() {
		if (this.anInt5608 == 16) {
			return;
		}
		this.method4284();
		this.method4321(true);
		this.method4300(true);
		this.method4293(true);
		this.method4343(1);
		this.anInt5608 = 16;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!qg;)V")
	@Override
	public void method7777(@OriginalArg(0) Class276 arg0) {
		this.aClass53_1.method1451(-1, this, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(II)I")
	@Override
	public int method7793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!kfa", name = "l", descriptor = "()Z")
	@Override
	public boolean method7813() {
		return true;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IB)V")
	public void method4288(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4346(7681, 7681);
		} else if (arg0 == 0) {
			this.method4346(8448, 8448);
		} else if (arg0 == 2) {
			this.method4346(34165, 7681);
		} else if (arg0 == 3) {
			this.method4346(260, 8448);
		} else if (arg0 == 4) {
			this.method4346(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method7814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class67 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class67_Sub1 local6 = (Class67_Sub1) arg5;
		@Pc(9) Class3_Sub2_Sub1 local9 = local6.aClass3_Sub2_Sub1_1;
		this.method4355();
		this.method4313(local6.aClass3_Sub2_Sub1_1);
		this.method4343(1);
		this.method4346(7681, 8448);
		this.method4280(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat42 / (float) local9.anInt1110;
		@Pc(46) float local46 = local9.aFloat43 / (float) local9.anInt1112;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local59 * local59)));
		@Pc(76) float local76 = local52 * local72;
		@Pc(80) float local80 = local59 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f(local76 + (float) arg2 + 0.35F, (float) arg3 + 0.35F + local80);
		OpenGL.glEnd();
		this.method4280(5890, 0, 768);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!gj;)V")
	public void method4289(@OriginalArg(1) Interface8 arg0) {
		if (this.anInt5600 < 0 || this.anInterface8Array1[this.anInt5600] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface8Array1[this.anInt5600--] = null;
		arg0.method2061();
		if (this.anInt5600 < 0) {
			this.anInterface8_2 = null;
		} else {
			this.anInterface8_2 = this.anInterface8Array1[this.anInt5600];
			this.anInterface8_2.method2062();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZB)V")
	public void method4290(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean393) {
			this.aBoolean393 = arg0;
			this.method4356();
			this.anInt5608 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!fda;Z)Lclient!f;")
	@Override
	public Class88 method7808(@OriginalArg(0) Class103 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt3039 * arg0.anInt3041];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray22 == null) {
			for (local21 = 0; local21 < arg0.anInt3041; local21++) {
				for (local25 = 0; local25 < arg0.anInt3039; local25++) {
					@Pc(38) int local38 = arg0.anIntArray142[arg0.aByteArray23[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt3041; local21++) {
				for (local25 = 0; local25 < arg0.anInt3039; local25++) {
					local12[local16++] = arg0.aByteArray22[local14] << 24 | arg0.anIntArray142[arg0.aByteArray23[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(123) Class88 local123 = this.method7838(local12, arg0.anInt3039, arg0.anInt3039, arg0.anInt3041);
		local123.Q(arg0.anInt3037, arg0.anInt3038, arg0.anInt3036, arg0.anInt3040);
		return local123;
	}

	@OriginalMember(owner = "client!kfa", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat127) {
			this.aFloat127 = arg0;
			this.method4331();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "(I)Lclient!e;")
	@Override
	public Class4_Sub8 method7818(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub8_Sub1 local8 = new Class4_Sub8_Sub1(arg0);
		this.aClass22_31.method894(local8);
		return local8;
	}

	@OriginalMember(owner = "client!kfa", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean384 = arg0;
		this.method4327();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7805(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kfa", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method4337();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method4343(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean400) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean400) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLclient!gj;)V")
	public void method4291(@OriginalArg(1) Interface8 arg0) {
		if (this.anInt5601 < 0 || arg0 != this.anInterface8Array2[this.anInt5601]) {
			throw new RuntimeException();
		}
		this.anInterface8Array2[this.anInt5601--] = null;
		arg0.method2060();
		if (this.anInt5601 < 0) {
			this.anInterface8_1 = null;
		} else {
			this.anInterface8_1 = this.anInterface8Array2[this.anInt5601];
			this.anInterface8_1.method2058();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)V")
	public synchronized void method4292(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub27 local8 = new Class4_Sub27(arg1);
		local8.aLong295 = arg0;
		this.aClass22_33.method894(local8);
	}

	@OriginalMember(owner = "client!kfa", name = "C", descriptor = "()V")
	@Override
	public void method7854() {
		if (this.aClass4_Sub31_Sub1_1 != null && this.aClass4_Sub31_Sub1_1.method5058()) {
			this.aClass315_1.method7299(this.aClass4_Sub31_Sub1_1);
			this.aClass317_1.method7319();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZI)V")
	public void method4293(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean376 != arg0) {
			this.aBoolean376 = arg0;
			this.method4327();
			this.anInt5608 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "o", descriptor = "()Z")
	@Override
	public boolean method7821() {
		return false;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!ho;)V")
	public void method4294(@OriginalArg(1) Class81_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method3240(), 0);
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(Z)V")
	private void method4295() {
		this.aFloat130 = this.anInt5613 - this.anInt5622;
		this.aFloat146 = this.anInt5621 - this.anInt5632;
		this.aFloat143 = this.anInt5612 - this.anInt5632;
		this.aFloat134 = this.anInt5642 - this.anInt5622;
	}

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt5642 || this.anInt5613 < arg0 - arg2 || this.anInt5621 > arg1 + arg2 || this.anInt5612 < arg1 - arg2) {
			return;
		}
		this.method4337();
		this.method4343(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(72) float local72 = (float) arg0 + 0.35F;
		@Pc(77) float local77 = (float) arg1 + 0.35F;
		@Pc(81) int local81 = arg2 << 1;
		if ((float) local81 < this.aFloat136) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local72 + 1.0F, local77 + 1.0F);
			OpenGL.glVertex2f(local72 + 1.0F, local77 - 1.0F);
			OpenGL.glVertex2f(local72 - 1.0F, -1.0F + local77);
			OpenGL.glVertex2f(local72 - 1.0F, local77 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat133 >= (float) local81) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local81);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local72, local77);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local72, local77);
			@Pc(136) int local136 = 262144 / (arg2 * 6);
			if (local136 <= 64) {
				local136 = 64;
			} else if (local136 > 512) {
				local136 = 512;
			}
			local136 = Static205.method3349(local136);
			OpenGL.glVertex2f(local72 + (float) arg2, local77);
			for (@Pc(162) int local162 = 16384 - local136; local162 > 0; local162 -= local136) {
				OpenGL.glVertex2f(Class4_Sub6_Sub16.aFloatArray61[local162] * (float) arg2 + local72, local77 + (float) arg2 * Class4_Sub6_Sub16.aFloatArray62[local162]);
			}
			OpenGL.glVertex2f(local72 + (float) arg2, local77);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(II)V")
	public synchronized void method4296(@OriginalArg(1) int arg0) {
		@Pc(7) Class4 local7 = new Class4();
		local7.aLong295 = arg0;
		this.aClass22_37.method894(local7);
	}

	@OriginalMember(owner = "client!kfa", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt5621;
		arg0[3] = this.anInt5612;
		arg0[2] = this.anInt5613;
		arg0[0] = this.anInt5642;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IIZ)V")
	public void method4297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5638 = arg1;
		this.anInt5633 = arg0;
		this.method4318();
		this.method4350();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZB)V")
	public void method4298(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4319(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!pa;)V")
	@Override
	public void method7784(@OriginalArg(0) Class112 arg0) {
		this.aClass112_Sub2_1 = (Class112_Sub2) arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "B", descriptor = "()Z")
	@Override
	public boolean method7850() {
		return this.aClass4_Sub31_Sub1_1 != null && this.aClass4_Sub31_Sub1_1.method5058();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZZ)V")
	public void method4300(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean374) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean374 = arg0;
		this.anInt5608 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!pa;Lclient!pa;FLclient!pa;)Lclient!pa;")
	@Override
	public Class112 method7816(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class112 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean385 && this.aBoolean390) {
			@Pc(15) Class112_Sub2_Sub2 local15 = null;
			@Pc(18) Class112_Sub2 local18 = (Class112_Sub2) arg0;
			@Pc(21) Class112_Sub2 local21 = (Class112_Sub2) arg1;
			@Pc(25) Class3_Sub4 local25 = local18.method7398();
			@Pc(29) Class3_Sub4 local29 = local21.method7398();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt3459 <= local29.anInt3459 ? local29.anInt3459 : local25.anInt3459;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class112_Sub2_Sub2) {
					@Pc(60) Class112_Sub2_Sub2 local60 = (Class112_Sub2_Sub2) arg3;
					if (local60.method7401() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class112_Sub2_Sub2(this, local48);
				}
				if (local15.method7403(local29, arg2, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!cr;IIII)Lclient!da;")
	@Override
	public Class65 method7828(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class65_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B[BIZI)Lclient!nu;")
	public Interface16 method4301(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		return (Interface16) (this.aBoolean402 && (!arg2 || this.aBoolean392) ? new Class66_Sub2(this, arg1, arg0, arg3, arg2) : new Class114_Sub1(this, arg1, arg0, arg3));
	}

	@OriginalMember(owner = "client!kfa", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt5641;
	}

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "(B)V")
	public void method4302() {
		if (this.anInt5623 != 0) {
			this.anInt5608 &= 0xFFFFFFE0;
			this.anInt5623 = 0;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5632 = arg1;
		this.anInt5627 = arg2;
		this.anInt5622 = arg0;
		this.anInt5643 = arg3;
		this.method4278();
		this.method4295();
		if (this.anInt5623 == 3) {
			this.method4309();
		} else if (this.anInt5623 == 2) {
			this.method4332();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "(B)V")
	public void method4303() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!kfa", name = "t", descriptor = "()Z")
	@Override
	public boolean method7834() {
		return this.aBoolean400 && (!this.method7850() || this.aBoolean383);
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(IIII)V")
	public void method4304(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass81_Sub2_3.aFloat93 + (float) arg0 * this.aClass81_Sub2_3.aFloat84 + this.aClass81_Sub2_3.aFloat85 * (float) arg1 + this.aClass81_Sub2_3.aFloat86 * (float) arg2;
		if (local28 < (float) this.anInt5624 || local28 > (float) this.anInt5641) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt5627 * (this.aClass81_Sub2_3.aFloat87 + this.aClass81_Sub2_3.aFloat94 * (float) arg0 + (float) arg1 * this.aClass81_Sub2_3.aFloat95 + this.aClass81_Sub2_3.aFloat91 * (float) arg2) / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt5643 * (this.aClass81_Sub2_3.aFloat92 * (float) arg1 + (float) arg0 * this.aClass81_Sub2_3.aFloat89 + (float) arg2 * this.aClass81_Sub2_3.aFloat90 + this.aClass81_Sub2_3.aFloat88) / local28);
		arg3[0] = (int) ((float) local85 - this.aFloat134);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local117 - this.aFloat146);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class67 method7787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static390.method6006(this, arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "(B)V")
	private void method4305() {
		this.aClass3Array1 = new Class3[this.anInt5625];
		this.aClass3_Sub2_2 = new Class3_Sub2(this, 3553, 6408, 1, 1);
		new Class3_Sub2(this, 3553, 6408, 1, 1);
		new Class3_Sub2(this, 3553, 6408, 1, 1);
		this.aClass65_Sub2_1 = new Class65_Sub2(this);
		this.aClass65_Sub2_9 = new Class65_Sub2(this);
		this.aClass65_Sub2_4 = new Class65_Sub2(this);
		this.aClass65_Sub2_6 = new Class65_Sub2(this);
		this.aClass65_Sub2_5 = new Class65_Sub2(this);
		this.aClass65_Sub2_2 = new Class65_Sub2(this);
		this.aClass65_Sub2_7 = new Class65_Sub2(this);
		this.aClass65_Sub2_10 = new Class65_Sub2(this);
		this.aClass65_Sub2_3 = new Class65_Sub2(this);
		this.aClass65_Sub2_8 = new Class65_Sub2(this);
		if (this.aBoolean390) {
			this.aClass87_2 = new Class87(this);
			new Class87(this);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BI)I")
	public int method4306(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
	@Override
	public void method7790(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kfa", name = "u", descriptor = "()I")
	@Override
	public int method7835() {
		return 4;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I[Lclient!am;)V")
	@Override
	public void method7852(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub3[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass4_Sub3Array3[local3] = arg1[local3];
		}
		this.anInt5619 = arg0;
		if (this.anInt5623 != 1) {
			this.method4286();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FBF)V")
	public void method4307(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat128 = arg1;
		this.aFloat147 = arg0;
		this.method4333();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FFIF)V")
	private void method4308(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean387) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg1, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean387 = true;
	}

	@OriginalMember(owner = "client!kfa", name = "i", descriptor = "(B)V")
	private void method4309() {
		@Pc(19) float local19 = this.aFloat132 * (float) -this.anInt5622 / (float) this.anInt5627;
		@Pc(31) float local31 = (float) -this.anInt5632 * this.aFloat132 / (float) this.anInt5643;
		@Pc(45) float local45 = (float) (this.anInt5412 - this.anInt5622) * this.aFloat132 / (float) this.anInt5627;
		@Pc(60) float local60 = this.aFloat132 * (float) (this.anInt5447 - this.anInt5632) / (float) this.anInt5643;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local19 != local45 && local60 != local31) {
			OpenGL.glOrtho((double) local19, (double) local45, (double) -local60, (double) -local31, (double) this.anInt5624, (double) this.anInt5641);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class115 method7804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class115_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!kfa", name = "j", descriptor = "(B)V")
	private void method4310() {
		if (this.aCanvas8 == null) {
			this.anInt5512 = this.anInt5432 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas8.getSize();
			this.anInt5512 = local10.width;
			this.anInt5432 = local10.height;
		}
		if (this.anInterface8_1 == null) {
			this.anInt5412 = this.anInt5512;
			this.anInt5447 = this.anInt5432;
			this.method4318();
		}
		this.method4302();
		this.JA();
	}

	@OriginalMember(owner = "client!kfa", name = "l", descriptor = "(I)V")
	private void method4311() {
		this.method4339(-2);
		for (@Pc(14) int local14 = this.anInt5625 - 1; local14 >= 0; local14--) {
			this.method4326(local14);
			this.method4313(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method4346(8448, 8448);
		this.method4280(34168, 2, 770);
		this.method4320();
		this.anInt5607 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt5609 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean375 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean373 = true;
		this.method4321(true);
		this.method4290(true);
		this.method4300(true);
		this.method4293(true);
		this.method4302();
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
		@Pc(138) float[] local138 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(140) int local140 = 0; local140 < 8; local140++) {
			@Pc(146) int local146 = local140 + 16384;
			OpenGL.glLightfv(local146, 4608, local138, 0);
			OpenGL.glLightf(local146, 4615, 0.0F);
			OpenGL.glLightf(local146, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt5614 = this.anInt5620 = -1;
		this.JA();
	}

	@OriginalMember(owner = "client!kfa", name = "A", descriptor = "()V")
	@Override
	public void method7849() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZLclient!jaclib/memory/Buffer;I)Lclient!nu;")
	public Interface16 method4312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Buffer arg2) {
		return (Interface16) (this.aBoolean402 ? new Class66_Sub2(this, arg0, arg2, arg1, false) : new Class114_Sub1(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!qg;I)V")
	@Override
	public void method7832(@OriginalArg(0) Class276 arg0, @OriginalArg(1) int arg1) {
		this.aClass53_1.method1451(arg1, this, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "()Z")
	@Override
	public boolean method7803() {
		return this.aClass363_1.method8214();
	}

	@OriginalMember(owner = "client!kfa", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5612 > arg3) {
			this.anInt5612 = arg3;
		}
		if (arg1 > this.anInt5621) {
			this.anInt5621 = arg1;
		}
		if (arg2 < this.anInt5613) {
			this.anInt5613 = arg2;
		}
		if (this.anInt5642 < arg0) {
			this.anInt5642 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method4295();
		this.method4350();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4337();
		this.method4343(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(22) float local22 = (float) arg3 - (float) arg1;
		if (local16 == 0.0F && local22 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(47) float local47 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local16 * local16)));
			local16 *= local47;
			local22 *= local47;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, local22 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLclient!jo;)V")
	public void method4313(@OriginalArg(1) Class3 arg0) {
		@Pc(11) Class3 local11 = this.aClass3Array1[this.anInt5639];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt3442);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt3442);
				} else if (local11.anInt3442 != arg0.anInt3442) {
					OpenGL.glDisable(local11.anInt3442);
					OpenGL.glEnable(arg0.anInt3442);
				}
				OpenGL.glBindTexture(arg0.anInt3442, arg0.method2745());
			}
			this.aClass3Array1[this.anInt5639] = arg0;
		}
		this.anInt5608 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZB[B)Lclient!mn;")
	public Interface14 method4314(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface14) (this.aBoolean402 && (!arg1 || this.aBoolean392) ? new Class66_Sub1(this, 5123, arg2, arg0, arg1) : new Class114_Sub2(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!kfa", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.anInt5598 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt5598++;
		}
		this.anInt5599 = 0x1 << this.anInt5598;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIIF)Lclient!am;")
	@Override
	public Class4_Sub3 method7819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub3_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "()Z")
	@Override
	public boolean method7795() {
		return false;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(BI)V")
	public void method4315(@OriginalArg(1) int arg0) {
		Static382.aFloatArray58[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static382.aFloatArray58[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static382.aFloatArray58[3] = (float) (arg0 >>> 24) / 255.0F;
		Static382.aFloatArray58[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static382.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IB)I")
	public int method4316(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "()Lclient!q;")
	@Override
	public Class81 method7781() {
		return this.aClass81_Sub2_3;
	}

	@OriginalMember(owner = "client!kfa", name = "m", descriptor = "(I)I")
	private int method4317() {
		this.aString110 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString111 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString110.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString110.indexOf("brian paul") != -1 || this.aString110.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(52) String[] local52 = Static297.method4750(local44.replace('.', ' '), ' ');
		if (local52.length >= 2) {
			try {
				@Pc(62) int local62 = Static393.method6016(local52[0]);
				@Pc(68) int local68 = Static393.method6016(local52[1]);
				this.anInt5611 = local68 + local62 * 10;
			} catch (@Pc(77) NumberFormatException local77) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt5611 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(118) int[] local118 = new int[1];
		OpenGL.glGetIntegerv(34018, local118, 0);
		this.anInt5625 = local118[0];
		OpenGL.glGetIntegerv(34929, local118, 0);
		this.anInt5628 = local118[0];
		OpenGL.glGetIntegerv(34930, local118, 0);
		this.anInt5618 = local118[0];
		if (this.anInt5625 < 2 || this.anInt5628 < 2 || this.anInt5618 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean388 = Stream.c();
		this.aBoolean386 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean402 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean400 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean378 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean382 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean401 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean395 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean381 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean385 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean380 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean377 = false;
		this.aBoolean390 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean398 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean399 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean383 = this.aBoolean398 & this.aBoolean399;
		OpenGL.glGetFloatv(2834, Static382.aFloatArray58, 0);
		this.aFloat136 = Static382.aFloatArray58[0];
		this.aFloat133 = Static382.aFloatArray58[1];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!kfa", name = "n", descriptor = "(I)V")
	private void method4318() {
		OpenGL.glViewport(this.anInt5638, this.anInt5633, this.anInt5412, this.anInt5447);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass315_1.method7291(arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZZI)V")
	public void method4319(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt5610 != arg2 || this.aBoolean379 != this.aBoolean394) {
			@Pc(14) Class3_Sub2 local14 = null;
			@Pc(16) int local16 = 0;
			@Pc(18) byte local18 = 0;
			@Pc(20) int local20 = 0;
			@Pc(27) int local27 = this.aBoolean379 ? 3 : 0;
			if (arg2 < 0) {
				this.method4320();
			} else {
				local14 = this.aClass317_1.method7320(arg2);
				@Pc(44) Class69 local44 = super.anInterface7_12.method4460(arg2);
				if (local44.aByte41 == 0 && local44.aByte42 == 0) {
					this.method4320();
				} else {
					@Pc(60) int local60 = local44.aBoolean179 ? 64 : 128;
					@Pc(64) int local64 = local60 * 50;
					this.method4308(0.0F, (float) (this.anInt5597 % local64 * local44.aByte42) / (float) local64, (float) (local44.aByte41 * (this.anInt5597 % local64)) / (float) local64);
				}
				if (!this.aBoolean379) {
					local27 = local44.aByte40;
					local18 = local44.aByte44;
					local20 = local44.anInt2292;
				}
				local16 = local44.anInt2293;
			}
			this.aClass363_1.method8215(arg1, local27, local20, local18, arg0);
			if (!this.aClass363_1.method8216(local16, local14)) {
				this.method4313(local14);
				this.method4288(local16);
			}
			this.anInt5610 = arg2;
			this.aBoolean394 = this.aBoolean379;
		}
		this.anInt5608 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kfa", name = "k", descriptor = "(B)V")
	private void method4320() {
		if (this.aBoolean387) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean387 = false;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(ZI)V")
	public void method4321(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean397 != arg0) {
			this.aBoolean397 = arg0;
			this.method4352();
			this.anInt5608 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLclient!ho;)V")
	public void method4322(@OriginalArg(1) Class81_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method3240(), 0);
	}

	@OriginalMember(owner = "client!kfa", name = "l", descriptor = "(B)V")
	private void method4323() {
		this.aFloatArray40[10] = this.aFloat140;
		this.aFloatArray40[14] = this.aFloat141;
		this.aFloat138 = this.anInt5641;
		this.aFloat135 = ((float) -this.anInt5641 + this.aFloatArray40[14]) / this.aFloatArray40[10];
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "()Z")
	@Override
	public boolean method7779() {
		return this.aClass4_Sub31_Sub1_1 != null && (this.anInt5592 <= 1 || this.aBoolean383);
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(III)V")
	public synchronized void method4324(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub27 local12 = new Class4_Sub27(arg0);
		local12.aLong295 = arg1;
		this.aClass22_34.method894(local12);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method7851(@OriginalArg(0) Class4_Sub8 arg0) {
		this.aNativeHeap4 = ((Class4_Sub8_Sub1) arg0).aNativeHeap3;
		if (this.anInterface16_5 != null) {
			return;
		}
		@Pc(16) Class4_Sub13_Sub1 local16 = new Class4_Sub13_Sub1(80);
		if (this.aBoolean388) {
			local16.method3608(-1.0F);
			local16.method3608(-1.0F);
			local16.method3608(0.0F);
			local16.method3608(0.0F);
			local16.method3608(1.0F);
			local16.method3608(1.0F);
			local16.method3608(-1.0F);
			local16.method3608(0.0F);
			local16.method3608(1.0F);
			local16.method3608(1.0F);
			local16.method3608(1.0F);
			local16.method3608(1.0F);
			local16.method3608(0.0F);
			local16.method3608(1.0F);
			local16.method3608(0.0F);
			local16.method3608(-1.0F);
			local16.method3608(1.0F);
			local16.method3608(0.0F);
			local16.method3608(0.0F);
			local16.method3608(0.0F);
		} else {
			local16.method3607(-1.0F);
			local16.method3607(-1.0F);
			local16.method3607(0.0F);
			local16.method3607(0.0F);
			local16.method3607(1.0F);
			local16.method3607(1.0F);
			local16.method3607(-1.0F);
			local16.method3607(0.0F);
			local16.method3607(1.0F);
			local16.method3607(1.0F);
			local16.method3607(1.0F);
			local16.method3607(1.0F);
			local16.method3607(0.0F);
			local16.method3607(1.0F);
			local16.method3607(0.0F);
			local16.method3607(-1.0F);
			local16.method3607(1.0F);
			local16.method3607(0.0F);
			local16.method3607(0.0F);
			local16.method3607(0.0F);
		}
		this.anInterface16_5 = this.method4301(local16.aByteArray88, 20, false, local16.anInt9170);
		this.aClass209_12 = new Class209(this.anInterface16_5, 5126, 3, 0);
		this.aClass209_11 = new Class209(this.anInterface16_5, 5126, 2, 12);
		this.aClass53_1.method1458(this);
	}

	@OriginalMember(owner = "client!kfa", name = "o", descriptor = "(I)V")
	public void method4325() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(II)V")
	public void method4326(@OriginalArg(0) int arg0) {
		if (this.anInt5639 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt5639 = arg0;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)I")
	@Override
	public int method7778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "(I)V")
	@Override
	public void method7839(@OriginalArg(0) int arg0) {
		this.method4357();
	}

	@OriginalMember(owner = "client!kfa", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5620 == arg0 && this.anInt5616 == arg1 && this.anInt5630 == arg2) {
			return;
		}
		this.anInt5616 = arg1;
		this.anInt5630 = arg2;
		this.anInt5620 = arg0;
		this.method4333();
		this.method4352();
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt5606 + this.anInt5603 + this.anInt5605;
	}

	@OriginalMember(owner = "client!kfa", name = "p", descriptor = "(I)V")
	private void method4327() {
		OpenGL.glDepthMask(this.aBoolean376 && this.aBoolean384);
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(IIIIII)Lclient!pa;")
	@Override
	public Class112 method7829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean385 ? new Class112_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7840(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas9) {
			local5 = this.aLong142;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable6.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas8 == arg0) {
			this.method4310();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7848(@OriginalArg(0) Class88 arg0) {
		this.aClass88_Sub3_1 = (Class88_Sub3) arg0;
		@Pc(65) Class4_Sub6 local65;
		if (this.aBoolean390) {
			if (this.aClass87_1 == null) {
				this.aClass87_1 = new Class87(this);
			}
			if (this.anInterface8_1 == this.aClass87_1) {
				throw new RuntimeException();
			}
			this.method4281(this.aClass87_1);
			@Pc(166) Class4_Sub6_Sub12 local166 = (Class4_Sub6_Sub12) this.aClass221_17.method5075((long) (this.aClass88_Sub3_1.E() << 16 | this.aClass88_Sub3_1.u()));
			if (local166 == null) {
				local166 = new Class4_Sub6_Sub12(this, 6402, this.aClass88_Sub3_1.E(), this.aClass88_Sub3_1.u());
				@Pc(199) Class4_Sub6_Sub12 local199;
				for (this.anInt5604 += local166.anInt5380; this.anInt5604 > 2097152; this.anInt5604 -= local199.anInt5380) {
					local65 = this.aClass120_7.method2672();
					if (local65 == null) {
						break;
					}
					local199 = (Class4_Sub6_Sub12) local65;
					local199.method7880();
					local199.method8193();
					local199.method4192();
				}
				this.aClass221_17.method5073(local166, (long) (this.aClass88_Sub3_1.E() << 16 | this.aClass88_Sub3_1.u()));
			}
			this.aClass120_7.method2670(local166);
			this.aClass87_1.method2063(local166, 8);
			this.aClass87_1.method2073(this.aClass88_Sub3_1.aClass3_Sub2_Sub1_5, 0);
		} else if (this.aBoolean386) {
			@Pc(36) Class4_Sub6_Sub11 local36 = (Class4_Sub6_Sub11) this.aClass221_17.method5075((long) (this.aClass88_Sub3_1.E() << 16 | this.aClass88_Sub3_1.u()));
			if (local36 == null) {
				local36 = new Class4_Sub6_Sub11(this, this.aClass88_Sub3_1.E(), this.aClass88_Sub3_1.u());
				@Pc(72) Class4_Sub6_Sub11 local72;
				for (this.anInt5604 += local36.anInt5355 * 4; this.anInt5604 > 2097152; this.anInt5604 -= local72.anInt5355) {
					local65 = this.aClass120_7.method2672();
					if (local65 == null) {
						break;
					}
					local72 = (Class4_Sub6_Sub11) local65;
					local72.method7880();
					local72.method8193();
					this.anOpenGL2.releasePbuffer(local72.method4179());
				}
				this.aClass221_17.method5073(local36, (long) (this.aClass88_Sub3_1.E() << 16 | this.aClass88_Sub3_1.u()));
			}
			this.aClass120_7.method2670(local36);
			this.anOpenGL2.setPbuffer(local36.method4179());
		} else {
			throw new RuntimeException("");
		}
		this.anInt5412 = arg0.E();
		this.anInt5447 = arg0.u();
		this.method4302();
		this.method4318();
		this.JA();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7794(@OriginalArg(0) Class81 arg0) {
		this.aClass81_Sub2_3.M(arg0);
		this.bf.M(this.aClass81_Sub2_3);
		this.bf.method3238();
		this.aClass81_Sub2_4.method3236(this.bf);
		if (this.anInt5623 != 1) {
			this.method4285();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "q", descriptor = "(I)V")
	private void method4328() {
		if (this.anInt5623 != 2) {
			this.anInt5623 = 2;
			this.method4332();
			this.method4285();
			this.anInt5608 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(Z)V")
	public void method4329() {
		if (this.anInt5608 == 8) {
			return;
		}
		this.method4328();
		this.method4321(true);
		this.method4300(true);
		this.method4293(true);
		this.method4343(1);
		this.anInt5608 = 8;
	}

	@OriginalMember(owner = "client!kfa", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt5447) {
			arg3 = this.anInt5447;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt5412 < arg2) {
			arg2 = this.anInt5412;
		}
		this.anInt5642 = arg0;
		this.anInt5621 = arg1;
		this.anInt5613 = arg2;
		this.anInt5612 = arg3;
		OpenGL.glEnable(3089);
		this.method4295();
		this.method4350();
	}

	@OriginalMember(owner = "client!kfa", name = "r", descriptor = "(I)V")
	public void method4330() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray43, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7833(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!kfa", name = "s", descriptor = "(I)V")
	private void method4331() {
		Static382.aFloatArray58[0] = this.aFloat145 * this.aFloat127;
		Static382.aFloatArray58[1] = this.aFloat127 * this.aFloat137;
		Static382.aFloatArray58[2] = this.aFloat129 * this.aFloat127;
		Static382.aFloatArray58[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static382.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!kfa", name = "t", descriptor = "(I)V")
	private void method4332() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray40, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kfa", name = "r", descriptor = "()V")
	@Override
	public void method7830() {
		if (!this.aBoolean389 || this.anInt5412 <= 0 || this.anInt5447 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt5642;
		@Pc(22) int local22 = this.anInt5613;
		@Pc(25) int local25 = this.anInt5621;
		@Pc(28) int local28 = this.anInt5612;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4302();
		this.method4321(false);
		this.method4290(false);
		this.method4300(false);
		this.method4293(false);
		this.method4313(null);
		this.method4339(-2);
		this.method4288(1);
		this.method4343(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt5412, this.anInt5447, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!kfa", name = "m", descriptor = "(B)V")
	private void method4333() {
		this.aFloat131 = (float) (this.anInt5641 - this.anInt5630) - this.aFloat147;
		this.aFloat139 = this.aFloat131 - (float) this.anInt5616 * this.aFloat128;
		if ((float) this.anInt5624 > this.aFloat139) {
			this.aFloat139 = this.anInt5624;
		}
		OpenGL.glFogf(2915, this.aFloat139);
		OpenGL.glFogf(2916, this.aFloat131);
		Static382.aFloatArray58[1] = (float) (this.anInt5620 & 0xFF00) / 65280.0F;
		Static382.aFloatArray58[2] = (float) (this.anInt5620 & 0xFF) / 255.0F;
		Static382.aFloatArray58[0] = (float) (this.anInt5620 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static382.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(ZB)V")
	public void method4334(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean391 != arg0) {
			this.aBoolean391 = arg0;
			this.method4356();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!ll;[Lclient!fda;Z)Lclient!la;")
	@Override
	public Class45 method7837(@OriginalArg(0) Class198 arg0, @OriginalArg(1) Class103[] arg1) {
		return new Class45_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(III)V")
	public synchronized void method4335(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub27 local8 = new Class4_Sub27(arg0);
		local8.aLong295 = arg1;
		this.aClass22_36.method894(local8);
	}

	@OriginalMember(owner = "client!kfa", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.method4343(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!kfa", name = "u", descriptor = "(I)V")
	private void method4336() {
		if (this.anInt5623 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt5412 > 0 && this.anInt5447 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt5412, (double) this.anInt5447, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt5623 = 1;
		this.anInt5608 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "(Z)V")
	private void method4337() {
		if (this.anInt5608 == 1) {
			return;
		}
		this.method4336();
		this.method4321(false);
		this.method4290(false);
		this.method4300(false);
		this.method4293(false);
		this.method4313(null);
		this.method4339(-2);
		this.method4288(1);
		this.anInt5608 = 1;
	}

	@OriginalMember(owner = "client!kfa", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt5624 && this.anInt5641 == arg1) {
			return;
		}
		this.anInt5641 = arg1;
		this.anInt5624 = arg0;
		this.method4278();
		this.method4333();
		if (this.anInt5623 == 3) {
			this.method4309();
		} else if (this.anInt5623 == 2) {
			this.method4332();
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZIILclient!mn;)V")
	public void method4338(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Interface14 arg2) {
		@Pc(7) int local7 = arg2.method4148();
		@Pc(14) int local14 = arg0 * this.method4316(local7);
		this.method4342(arg2);
		OpenGL.glDrawElements(4, arg1, local7, arg2.method4146() + (long) local14);
	}

	@OriginalMember(owner = "client!kfa", name = "L", descriptor = "()V")
	@Override
	public void L() {
		this.aBoolean379 = false;
	}

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "(II)V")
	public void method4339(@OriginalArg(1) int arg0) {
		this.method4298(arg0, true);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!nu;)V")
	public void method4340(@OriginalArg(1) Interface16 arg0) {
		if (arg0 != this.anInterface16_4) {
			if (this.aBoolean402) {
				OpenGL.glBindBufferARB(34962, arg0.method6366());
			}
			this.anInterface16_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4337();
		this.method4343(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kfa", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass81_Sub2_3.aFloat85 * (float) arg1 + (float) arg0 * this.aClass81_Sub2_3.aFloat84 + this.aClass81_Sub2_3.aFloat86 * (float) arg2 + this.aClass81_Sub2_3.aFloat93;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass81_Sub2_3.aFloat84 * (float) arg3 + this.aClass81_Sub2_3.aFloat85 * (float) arg4 + (float) arg5 * this.aClass81_Sub2_3.aFloat86 + this.aClass81_Sub2_3.aFloat93;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt5624 && (float) this.anInt5624 > local59 || !(!((float) this.anInt5641 < local28) || !((float) this.anInt5641 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt5627 * (this.aClass81_Sub2_3.aFloat87 + this.aClass81_Sub2_3.aFloat91 * (float) arg2 + (float) arg0 * this.aClass81_Sub2_3.aFloat94 + this.aClass81_Sub2_3.aFloat95 * (float) arg1) / local28);
		@Pc(155) int local155 = (int) ((this.aClass81_Sub2_3.aFloat94 * (float) arg3 + this.aClass81_Sub2_3.aFloat95 * (float) arg4 + this.aClass81_Sub2_3.aFloat91 * (float) arg5 + this.aClass81_Sub2_3.aFloat87) * (float) this.anInt5627 / local59);
		if ((float) local123 < this.aFloat134 && this.aFloat134 > (float) local155 || this.aFloat130 < (float) local123 && this.aFloat130 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt5643 * (this.aClass81_Sub2_3.aFloat88 + this.aClass81_Sub2_3.aFloat89 * (float) arg0 + (float) arg1 * this.aClass81_Sub2_3.aFloat92 + this.aClass81_Sub2_3.aFloat90 * (float) arg2) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt5643 * (this.aClass81_Sub2_3.aFloat88 + (float) arg3 * this.aClass81_Sub2_3.aFloat89 + (float) arg4 * this.aClass81_Sub2_3.aFloat92 + (float) arg5 * this.aClass81_Sub2_3.aFloat90) / local59);
			return (!((float) local213 < this.aFloat146) || !((float) local245 < this.aFloat146)) && (!((float) local213 > this.aFloat143) || !((float) local245 > this.aFloat143));
		}
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(BI)I")
	public int method4341(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "()Z")
	@Override
	public boolean method7782() {
		return true;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class88 method7788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class88_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kfa", name = "k", descriptor = "()Lclient!q;")
	@Override
	public Class81 method7812() {
		return this.aClass81_Sub2_1;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(Z)V")
	@Override
	public void method7826(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!mn;)V")
	public void method4342(@OriginalArg(1) Interface14 arg0) {
		if (this.anInterface14_4 != arg0) {
			if (this.aBoolean402) {
				OpenGL.glBindBufferARB(34963, arg0.method4149());
			}
			this.anInterface14_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7799(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7827();
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(IB)V")
	public void method4343(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt5607) {
			return;
		}
		@Pc(26) boolean local26;
		@Pc(30) byte local30;
		if (arg0 == 1) {
			local26 = true;
			local30 = 1;
		} else if (arg0 == 2) {
			local26 = false;
			local30 = 2;
		} else if (arg0 == 128) {
			local26 = true;
			local30 = 3;
		} else {
			local30 = 0;
			local26 = false;
		}
		if (!this.aBoolean373) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean373 = true;
		}
		if (this.aBoolean375 != local26) {
			if (local26) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean375 = local26;
		}
		if (this.anInt5609 != local30) {
			if (local30 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local30 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local30 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt5609 = local30;
		}
		this.anInt5607 = arg0;
		this.anInt5608 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt5447 - arg1 - local12, arg2, 1, 32993, this.anInt5615, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!kfa", name = "v", descriptor = "(I)V")
	private void method4344() {
		Static382.aFloatArray58[2] = this.aFloat129 * this.aFloat144;
		Static382.aFloatArray58[1] = this.aFloat137 * this.aFloat144;
		Static382.aFloatArray58[3] = 1.0F;
		Static382.aFloatArray58[0] = this.aFloat144 * this.aFloat145;
		OpenGL.glLightfv(16384, 4609, Static382.aFloatArray58, 0);
		Static382.aFloatArray58[2] = -this.aFloat142 * this.aFloat129;
		Static382.aFloatArray58[1] = this.aFloat137 * -this.aFloat142;
		Static382.aFloatArray58[0] = this.aFloat145 * -this.aFloat142;
		Static382.aFloatArray58[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static382.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7801(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static405.aFloat185 = arg1;
		Static16.aFloat153 = arg2;
		Static293.aFloat151 = arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "w", descriptor = "(I)V")
	private void method4345() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "()V")
	@Override
	public void method7780() {
		this.aClass315_1.method7297();
	}

	@OriginalMember(owner = "client!kfa", name = "s", descriptor = "()Z")
	@Override
	public boolean method7831() {
		return true;
	}

	@OriginalMember(owner = "client!kfa", name = "p", descriptor = "()V")
	@Override
	protected void method7822() {
		for (@Pc(10) Class4 local10 = this.aClass22_31.method895(); local10 != null; local10 = this.aClass22_31.method889()) {
			((Class4_Sub8_Sub1) local10).method1792();
		}
		if (this.aClass315_1 != null) {
			this.aClass315_1.method7294();
		}
		if (this.anOpenGL2 != null) {
			this.method4345();
			@Pc(40) Enumeration local40 = this.aHashtable6.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable6.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean372) {
			Static506.method7293(false, true);
			this.aBoolean372 = false;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(III)V")
	public void method4346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5639 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(28) boolean local28 = false;
		if (this.anInt5635 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local28 = true;
			this.anInt5635 = arg0;
		}
		if (this.anInt5626 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt5626 = arg1;
			local28 = true;
		}
		if (local28) {
			this.anInt5608 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IFFFF)V")
	public void method4347(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static382.aFloatArray58[3] = arg3;
		Static382.aFloatArray58[0] = arg2;
		Static382.aFloatArray58[2] = arg1;
		Static382.aFloatArray58[1] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static382.aFloatArray58, 0);
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V")
	@Override
	public void method7791(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt5587 = arg0;
		this.aClass317_1.method7319();
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(ILclient!gj;)V")
	public void method4348(@OriginalArg(1) Interface8 arg0) {
		if (this.anInt5600 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5600 >= 0) {
			this.anInterface8Array1[this.anInt5600].method2061();
		}
		this.anInterface8_2 = this.anInterface8Array1[++this.anInt5600] = arg0;
		this.anInterface8_2.method2062();
	}

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "(II)V")
	public synchronized void method4349(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub27 local12 = new Class4_Sub27(arg0);
		this.aClass22_35.method894(local12);
	}

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "(Z)V")
	private void method4350() {
		if (this.anInt5613 >= this.anInt5642 && this.anInt5612 >= this.anInt5621) {
			OpenGL.glScissor(this.anInt5642 + this.anInt5638, this.anInt5633 + this.anInt5447 - this.anInt5612, this.anInt5613 - this.anInt5642, this.anInt5612 - this.anInt5621);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(JI)V")
	public synchronized void method4351(@OriginalArg(0) long arg0) {
		@Pc(7) Class4 local7 = new Class4();
		local7.aLong295 = arg0;
		this.aClass22_38.method894(local7);
	}

	@OriginalMember(owner = "client!kfa", name = "n", descriptor = "(B)V")
	private void method4352() {
		if (this.aBoolean397 && this.anInt5616 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class88 method7838(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class88_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!kfa", name = "i", descriptor = "()Z")
	@Override
	public boolean method7807() {
		if (this.aClass4_Sub31_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass4_Sub31_Sub1_1.method5058()) {
			if (!this.aClass315_1.method7295(this.aClass4_Sub31_Sub1_1)) {
				return false;
			}
			this.aClass317_1.method7319();
		}
		return true;
	}

	@OriginalMember(owner = "client!kfa", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(6) int local6 = this.anInt5645;
		this.anInt5645 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!kfa", name = "x", descriptor = "(I)Lclient!gfa;")
	public Class3_Sub4 method4353() {
		return this.aClass112_Sub2_1 == null ? null : this.aClass112_Sub2_1.method7398();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7841() {
		this.method4337();
		this.method4343(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLclient!mba;Lclient!mba;Lclient!mba;Lclient!mba;)V")
	public void method4354(@OriginalArg(1) Class209 arg0, @OriginalArg(2) Class209 arg1, @OriginalArg(3) Class209 arg2, @OriginalArg(4) Class209 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method4340(arg1.anInterface16_6);
			OpenGL.glVertexPointer(arg1.aByte97, arg1.aShort81, this.anInterface16_4.method6367(), this.anInterface16_4.method6368() + (long) arg1.aByte96);
			OpenGL.glEnableClientState(32884);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method4340(arg0.anInterface16_6);
			OpenGL.glNormalPointer(arg0.aShort81, this.anInterface16_4.method6367(), this.anInterface16_4.method6368() + (long) arg0.aByte96);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method4340(arg2.anInterface16_6);
			OpenGL.glColorPointer(arg2.aByte97, arg2.aShort81, this.anInterface16_4.method6367(), this.anInterface16_4.method6368() + (long) arg2.aByte96);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method4340(arg3.anInterface16_6);
			OpenGL.glTexCoordPointer(arg3.aByte97, arg3.aShort81, this.anInterface16_4.method6367(), this.anInterface16_4.method6368() + (long) arg3.aByte96);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "y", descriptor = "(I)V")
	public void method4355() {
		if (this.anInt5608 == 2) {
			return;
		}
		this.method4336();
		this.method4321(false);
		this.method4290(false);
		this.method4300(false);
		this.method4293(false);
		this.method4339(-2);
		this.anInt5608 = 2;
	}

	@OriginalMember(owner = "client!kfa", name = "x", descriptor = "()V")
	@Override
	public void method7843() {
		if (this.aBoolean390) {
			if (this.anInterface8_1 != this.aClass87_1) {
				throw new RuntimeException();
			}
			this.aClass87_1.method2070(0);
			this.aClass87_1.method2070(8);
			this.method4358(this.aClass87_1);
		} else if (this.aBoolean386) {
			this.aClass88_Sub3_1.da(0, 0, this.anInt5412, this.anInt5447, 0, 0);
			this.anOpenGL2.setSurface(this.aLong140);
		} else {
			throw new RuntimeException("");
		}
		this.anInt5412 = this.anInt5512;
		this.anInt5447 = this.anInt5432;
		this.aClass88_Sub3_1 = null;
		this.method4302();
		this.method4318();
		this.JA();
	}

	@OriginalMember(owner = "client!kfa", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class67_Sub1 local6 = (Class67_Sub1) arg1;
		@Pc(9) Class3_Sub2_Sub1 local9 = local6.aClass3_Sub2_Sub1_1;
		this.method4355();
		this.method4313(local6.aClass3_Sub2_Sub1_1);
		this.method4343(1);
		this.method4346(7681, 8448);
		this.method4280(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat42 / (float) local9.anInt1110;
		@Pc(46) float local46 = local9.aFloat43 / (float) local9.anInt1112;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt5642 - arg2) * local39, local46 * (float) (this.anInt5621 - arg3));
		OpenGL.glVertex2i(this.anInt5642, this.anInt5621);
		OpenGL.glTexCoord2f((float) (this.anInt5642 - arg2) * local39, local46 * (float) (this.anInt5612 - arg3));
		OpenGL.glVertex2i(this.anInt5642, this.anInt5612);
		OpenGL.glTexCoord2f((float) (this.anInt5613 - arg2) * local39, (float) (this.anInt5612 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5613, this.anInt5612);
		OpenGL.glTexCoord2f((float) (this.anInt5613 - arg2) * local39, (float) (this.anInt5621 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5613, this.anInt5621);
		OpenGL.glEnd();
		this.method4280(5890, 0, 768);
	}

	@OriginalMember(owner = "client!kfa", name = "o", descriptor = "(B)V")
	private void method4356() {
		if (this.aBoolean393 && !this.aBoolean391) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass81_Sub2_3.aFloat93 + (float) arg2 * this.aClass81_Sub2_3.aFloat86 + this.aClass81_Sub2_3.aFloat85 * (float) arg1 + (float) arg0 * this.aClass81_Sub2_3.aFloat84;
		if (local28 < (float) this.anInt5624 || local28 > (float) this.anInt5641) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt5627 * (this.aClass81_Sub2_3.aFloat87 + this.aClass81_Sub2_3.aFloat91 * (float) arg2 + this.aClass81_Sub2_3.aFloat95 * (float) arg1 + (float) arg0 * this.aClass81_Sub2_3.aFloat94) / local28);
		@Pc(117) int local117 = (int) (((float) arg1 * this.aClass81_Sub2_3.aFloat92 + (float) arg0 * this.aClass81_Sub2_3.aFloat89 + (float) arg2 * this.aClass81_Sub2_3.aFloat90 + this.aClass81_Sub2_3.aFloat88) * (float) this.anInt5643 / local28);
		if (this.aFloat134 <= (float) local85 && this.aFloat130 >= (float) local85 && (float) local117 >= this.aFloat146 && (float) local117 <= this.aFloat143) {
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat134);
			arg3[1] = (int) ((float) local117 - this.aFloat146);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "z", descriptor = "(I)V")
	private void method4357() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL2.a()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static214.method3478(1000L);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(BLclient!gj;)V")
	public void method4358(@OriginalArg(1) Interface8 arg0) {
		if (this.aBoolean398) {
			this.method4289(arg0);
			this.method4291(arg0);
		} else if (this.anInt5602 >= 0 && this.anInterface8Array3[this.anInt5602] == arg0) {
			this.anInterface8Array3[this.anInt5602--] = null;
			arg0.method2057();
			if (this.anInt5602 >= 0) {
				this.anInterface8_2 = this.anInterface8_1 = this.anInterface8Array3[this.anInt5602];
				this.anInterface8_2.method2059();
			} else {
				this.anInterface8_2 = this.anInterface8_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}
}
