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

@OriginalClass("client!kga")
public final class Class44_Sub3 extends Class44 {

	@OriginalMember(owner = "client!kga", name = "t", descriptor = "I")
	public int anInt5285;

	@OriginalMember(owner = "client!kga", name = "X", descriptor = "I")
	public int anInt5313;

	@OriginalMember(owner = "client!kga", name = "Zb", descriptor = "I")
	private int anInt5364;

	@OriginalMember(owner = "client!kga", name = "Jc", descriptor = "I")
	private int anInt5398;

	@OriginalMember(owner = "client!kga", name = "oe", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!kga", name = "qe", descriptor = "I")
	public int anInt5471;

	@OriginalMember(owner = "client!kga", name = "we", descriptor = "Lclient!oi;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!kga", name = "ze", descriptor = "Lclient!ci;")
	private Class51 aClass51_4;

	@OriginalMember(owner = "client!kga", name = "Be", descriptor = "Lclient!mb;")
	private Class78_Sub3 aClass78_Sub3_1;

	@OriginalMember(owner = "client!kga", name = "Ce", descriptor = "Lclient!oi;")
	private Interface17 anInterface17_2;

	@OriginalMember(owner = "client!kga", name = "Ge", descriptor = "I")
	private int anInt5476;

	@OriginalMember(owner = "client!kga", name = "He", descriptor = "I")
	public int anInt5477;

	@OriginalMember(owner = "client!kga", name = "Je", descriptor = "I")
	private int anInt5478;

	@OriginalMember(owner = "client!kga", name = "Ke", descriptor = "I")
	public int anInt5479;

	@OriginalMember(owner = "client!kga", name = "Re", descriptor = "I")
	private int anInt5480;

	@OriginalMember(owner = "client!kga", name = "Se", descriptor = "J")
	private long aLong143;

	@OriginalMember(owner = "client!kga", name = "Te", descriptor = "Z")
	private boolean aBoolean387;

	@OriginalMember(owner = "client!kga", name = "Ue", descriptor = "Z")
	private boolean aBoolean388;

	@OriginalMember(owner = "client!kga", name = "Ve", descriptor = "Z")
	private boolean aBoolean389;

	@OriginalMember(owner = "client!kga", name = "We", descriptor = "Z")
	private boolean aBoolean390;

	@OriginalMember(owner = "client!kga", name = "Xe", descriptor = "I")
	private int anInt5481;

	@OriginalMember(owner = "client!kga", name = "Ze", descriptor = "I")
	private int anInt5482;

	@OriginalMember(owner = "client!kga", name = "cf", descriptor = "Lclient!ji;")
	public Class57_Sub2 aClass57_Sub2_1;

	@OriginalMember(owner = "client!kga", name = "df", descriptor = "Z")
	private boolean aBoolean391;

	@OriginalMember(owner = "client!kga", name = "ef", descriptor = "Lclient!ji;")
	public Class57_Sub2 aClass57_Sub2_2;

	@OriginalMember(owner = "client!kga", name = "ff", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!kga", name = "kf", descriptor = "Z")
	private boolean aBoolean392;

	@OriginalMember(owner = "client!kga", name = "mf", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!kga", name = "nf", descriptor = "Z")
	private boolean aBoolean393;

	@OriginalMember(owner = "client!kga", name = "of", descriptor = "I")
	private int anInt5485;

	@OriginalMember(owner = "client!kga", name = "pf", descriptor = "I")
	private int anInt5486;

	@OriginalMember(owner = "client!kga", name = "sf", descriptor = "Lclient!he;")
	private Class36_Sub2 aClass36_Sub2_1;

	@OriginalMember(owner = "client!kga", name = "tf", descriptor = "I")
	private int anInt5488;

	@OriginalMember(owner = "client!kga", name = "uf", descriptor = "I")
	public int anInt5489;

	@OriginalMember(owner = "client!kga", name = "vf", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!kga", name = "xf", descriptor = "Lclient!rba;")
	public Class284 aClass284_8;

	@OriginalMember(owner = "client!kga", name = "yf", descriptor = "Lclient!saa;")
	public Class77_Sub1 aClass77_Sub1_2;

	@OriginalMember(owner = "client!kga", name = "Cf", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!kga", name = "Df", descriptor = "Z")
	private boolean aBoolean395;

	@OriginalMember(owner = "client!kga", name = "Jf", descriptor = "Ljava/lang/String;")
	private String aString55;

	@OriginalMember(owner = "client!kga", name = "Nf", descriptor = "Lclient!ji;")
	public Class57_Sub2 aClass57_Sub2_3;

	@OriginalMember(owner = "client!kga", name = "Of", descriptor = "Z")
	public boolean aBoolean396;

	@OriginalMember(owner = "client!kga", name = "Qf", descriptor = "F")
	private float aFloat171;

	@OriginalMember(owner = "client!kga", name = "Rf", descriptor = "Lclient!ji;")
	public Class57_Sub2 aClass57_Sub2_4;

	@OriginalMember(owner = "client!kga", name = "Tf", descriptor = "Lclient!ew;")
	private Interface10 anInterface10_3;

	@OriginalMember(owner = "client!kga", name = "Vf", descriptor = "Lclient!ci;")
	public Class51 aClass51_5;

	@OriginalMember(owner = "client!kga", name = "Xf", descriptor = "F")
	private float aFloat172;

	@OriginalMember(owner = "client!kga", name = "cg", descriptor = "Z")
	public boolean aBoolean399;

	@OriginalMember(owner = "client!kga", name = "dg", descriptor = "Lclient!ji;")
	public Class57_Sub2 aClass57_Sub2_5;

	@OriginalMember(owner = "client!kga", name = "hg", descriptor = "Z")
	public boolean aBoolean401;

	@OriginalMember(owner = "client!kga", name = "ig", descriptor = "Lclient!ji;")
	public Class57_Sub2 aClass57_Sub2_6;

	@OriginalMember(owner = "client!kga", name = "jg", descriptor = "Z")
	public boolean aBoolean402;

	@OriginalMember(owner = "client!kga", name = "kg", descriptor = "Z")
	private boolean aBoolean403;

	@OriginalMember(owner = "client!kga", name = "lg", descriptor = "I")
	private int anInt5501;

	@OriginalMember(owner = "client!kga", name = "mg", descriptor = "Lclient!ji;")
	public Class57_Sub2 aClass57_Sub2_7;

	@OriginalMember(owner = "client!kga", name = "tg", descriptor = "Z")
	public boolean aBoolean407;

	@OriginalMember(owner = "client!kga", name = "ug", descriptor = "F")
	private float aFloat175;

	@OriginalMember(owner = "client!kga", name = "wg", descriptor = "Lclient!ji;")
	public Class57_Sub2 aClass57_Sub2_8;

	@OriginalMember(owner = "client!kga", name = "xg", descriptor = "I")
	private int anInt5504;

	@OriginalMember(owner = "client!kga", name = "yg", descriptor = "Lclient!ew;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!kga", name = "Ag", descriptor = "Z")
	public boolean aBoolean408;

	@OriginalMember(owner = "client!kga", name = "Bg", descriptor = "Ljava/lang/String;")
	private String aString56;

	@OriginalMember(owner = "client!kga", name = "Cg", descriptor = "Lclient!eb;")
	private Class77_Sub1_Sub1 aClass77_Sub1_Sub1_1;

	@OriginalMember(owner = "client!kga", name = "Eg", descriptor = "Lclient!uq;")
	private Interface22 anInterface22_2;

	@OriginalMember(owner = "client!kga", name = "Fg", descriptor = "I")
	private int anInt5506;

	@OriginalMember(owner = "client!kga", name = "Hg", descriptor = "I")
	private int anInt5507;

	@OriginalMember(owner = "client!kga", name = "Ig", descriptor = "F")
	public float aFloat177;

	@OriginalMember(owner = "client!kga", name = "Jg", descriptor = "Z")
	public boolean aBoolean409;

	@OriginalMember(owner = "client!kga", name = "Kg", descriptor = "Lclient!rba;")
	public Class284 aClass284_9;

	@OriginalMember(owner = "client!kga", name = "Lg", descriptor = "[Lclient!jf;")
	private Class77[] aClass77Array1;

	@OriginalMember(owner = "client!kga", name = "Ng", descriptor = "Z")
	public boolean aBoolean410;

	@OriginalMember(owner = "client!kga", name = "Pg", descriptor = "Z")
	private boolean aBoolean411;

	@OriginalMember(owner = "client!kga", name = "Qg", descriptor = "F")
	public float aFloat179;

	@OriginalMember(owner = "client!kga", name = "Wg", descriptor = "Lclient!ji;")
	public Class57_Sub2 aClass57_Sub2_9;

	@OriginalMember(owner = "client!kga", name = "Yg", descriptor = "I")
	private int anInt5511;

	@OriginalMember(owner = "client!kga", name = "Zg", descriptor = "I")
	public int anInt5512;

	@OriginalMember(owner = "client!kga", name = "ah", descriptor = "I")
	public int anInt5513;

	@OriginalMember(owner = "client!kga", name = "ch", descriptor = "Lclient!ji;")
	public Class57_Sub2 aClass57_Sub2_10;

	@OriginalMember(owner = "client!kga", name = "fh", descriptor = "I")
	public int anInt5515;

	@OriginalMember(owner = "client!kga", name = "gh", descriptor = "Z")
	private boolean aBoolean415;

	@OriginalMember(owner = "client!kga", name = "hh", descriptor = "Z")
	public boolean aBoolean416;

	@OriginalMember(owner = "client!kga", name = "kh", descriptor = "I")
	private int anInt5517;

	@OriginalMember(owner = "client!kga", name = "lh", descriptor = "I")
	private int anInt5518;

	@OriginalMember(owner = "client!kga", name = "S", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!kga", name = "ge", descriptor = "I")
	public int anInt5467 = 128;

	@OriginalMember(owner = "client!kga", name = "ce", descriptor = "Lclient!cm;")
	private final Class52 aClass52_1 = new Class52();

	@OriginalMember(owner = "client!kga", name = "le", descriptor = "Lclient!cba;")
	private final Class8_Sub2 aClass8_Sub2_1 = new Class8_Sub2();

	@OriginalMember(owner = "client!kga", name = "me", descriptor = "Lclient!cba;")
	public final Class8_Sub2 aClass8_Sub2_2 = new Class8_Sub2();

	@OriginalMember(owner = "client!kga", name = "ne", descriptor = "I")
	public int anInt5470 = 3;

	@OriginalMember(owner = "client!kga", name = "te", descriptor = "Z")
	private boolean aBoolean386 = false;

	@OriginalMember(owner = "client!kga", name = "se", descriptor = "I")
	public int anInt5472 = 8;

	@OriginalMember(owner = "client!kga", name = "re", descriptor = "Lclient!oe;")
	private final Class244 aClass244_40 = new Class244();

	@OriginalMember(owner = "client!kga", name = "ue", descriptor = "[Lclient!oi;")
	private final Interface17[] anInterface17Array1 = new Interface17[4];

	@OriginalMember(owner = "client!kga", name = "ve", descriptor = "I")
	private int anInt5473 = -1;

	@OriginalMember(owner = "client!kga", name = "xe", descriptor = "I")
	private int anInt5474 = -1;

	@OriginalMember(owner = "client!kga", name = "ye", descriptor = "I")
	private int anInt5475 = -1;

	@OriginalMember(owner = "client!kga", name = "Ae", descriptor = "[Lclient!oi;")
	private final Interface17[] anInterface17Array2 = new Interface17[4];

	@OriginalMember(owner = "client!kga", name = "De", descriptor = "[Lclient!oi;")
	private final Interface17[] anInterface17Array3 = new Interface17[4];

	@OriginalMember(owner = "client!kga", name = "Ee", descriptor = "Lclient!an;")
	private final Class18 aClass18_1 = new Class18();

	@OriginalMember(owner = "client!kga", name = "Fe", descriptor = "Lclient!waa;")
	private final Class350 aClass350_20 = new Class350(16);

	@OriginalMember(owner = "client!kga", name = "Ie", descriptor = "Lclient!oe;")
	private final Class244 aClass244_41 = new Class244();

	@OriginalMember(owner = "client!kga", name = "Le", descriptor = "Lclient!oe;")
	private final Class244 aClass244_42 = new Class244();

	@OriginalMember(owner = "client!kga", name = "Me", descriptor = "Lclient!oe;")
	private final Class244 aClass244_43 = new Class244();

	@OriginalMember(owner = "client!kga", name = "Ne", descriptor = "Lclient!oe;")
	private final Class244 aClass244_44 = new Class244();

	@OriginalMember(owner = "client!kga", name = "Oe", descriptor = "Lclient!oe;")
	private final Class244 aClass244_45 = new Class244();

	@OriginalMember(owner = "client!kga", name = "Pe", descriptor = "Lclient!oe;")
	private final Class244 aClass244_46 = new Class244();

	@OriginalMember(owner = "client!kga", name = "Qe", descriptor = "Lclient!oe;")
	private final Class244 aClass244_47 = new Class244();

	@OriginalMember(owner = "client!kga", name = "Ye", descriptor = "Lclient!cba;")
	public final Class8_Sub2 aClass8_Sub2_3 = new Class8_Sub2();

	@OriginalMember(owner = "client!kga", name = "af", descriptor = "Lclient!cba;")
	public final Class8_Sub2 aClass8_Sub2_4 = new Class8_Sub2();

	@OriginalMember(owner = "client!kga", name = "bf", descriptor = "Lclient!cba;")
	public final Class8_Sub2 bf = new Class8_Sub2();

	@OriginalMember(owner = "client!kga", name = "gf", descriptor = "[F")
	private final float[] aFloatArray40 = new float[4];

	@OriginalMember(owner = "client!kga", name = "hf", descriptor = "F")
	public float aFloat162 = 1.0F;

	@OriginalMember(owner = "client!kga", name = "Ef", descriptor = "I")
	public int anInt5490 = -1;

	@OriginalMember(owner = "client!kga", name = "rf", descriptor = "F")
	private float aFloat164 = -1.0F;

	@OriginalMember(owner = "client!kga", name = "Gf", descriptor = "I")
	private int anInt5491 = 8448;

	@OriginalMember(owner = "client!kga", name = "Bf", descriptor = "Z")
	private boolean aBoolean394 = false;

	@OriginalMember(owner = "client!kga", name = "Sf", descriptor = "I")
	private int anInt5495 = 3584;

	@OriginalMember(owner = "client!kga", name = "Ff", descriptor = "F")
	public float aFloat169 = 1.0F;

	@OriginalMember(owner = "client!kga", name = "Mf", descriptor = "I")
	public int anInt5494 = 0;

	@OriginalMember(owner = "client!kga", name = "If", descriptor = "F")
	private float aFloat170 = 1.0F;

	@OriginalMember(owner = "client!kga", name = "fg", descriptor = "I")
	public int anInt5499 = 0;

	@OriginalMember(owner = "client!kga", name = "Zf", descriptor = "F")
	private float aFloat173 = 0.0F;

	@OriginalMember(owner = "client!kga", name = "qf", descriptor = "I")
	public int anInt5487 = -1;

	@OriginalMember(owner = "client!kga", name = "Af", descriptor = "F")
	public float aFloat167 = 3584.0F;

	@OriginalMember(owner = "client!kga", name = "wf", descriptor = "F")
	public float aFloat166 = -1.0F;

	@OriginalMember(owner = "client!kga", name = "Wf", descriptor = "I")
	private int anInt5497 = 0;

	@OriginalMember(owner = "client!kga", name = "gg", descriptor = "I")
	public int anInt5500 = 512;

	@OriginalMember(owner = "client!kga", name = "qg", descriptor = "[Lclient!ul;")
	private final Class4_Sub24[] aClass4_Sub24Array5 = new Class4_Sub24[Static513.anInt9220];

	@OriginalMember(owner = "client!kga", name = "Lf", descriptor = "I")
	public int anInt5493 = 512;

	@OriginalMember(owner = "client!kga", name = "pg", descriptor = "I")
	private int anInt5502 = 0;

	@OriginalMember(owner = "client!kga", name = "zg", descriptor = "F")
	public float aFloat176 = 1.0F;

	@OriginalMember(owner = "client!kga", name = "sg", descriptor = "F")
	private float aFloat174 = -1.0F;

	@OriginalMember(owner = "client!kga", name = "ag", descriptor = "I")
	private int anInt5498 = 8448;

	@OriginalMember(owner = "client!kga", name = "Tg", descriptor = "I")
	public int anInt5509 = 0;

	@OriginalMember(owner = "client!kga", name = "Dg", descriptor = "I")
	public int anInt5505 = -1;

	@OriginalMember(owner = "client!kga", name = "Hf", descriptor = "I")
	public int anInt5492 = 50;

	@OriginalMember(owner = "client!kga", name = "Vg", descriptor = "I")
	private int anInt5510 = 0;

	@OriginalMember(owner = "client!kga", name = "jf", descriptor = "I")
	private int anInt5483 = 0;

	@OriginalMember(owner = "client!kga", name = "Gg", descriptor = "[F")
	private final float[] aFloatArray43 = new float[4];

	@OriginalMember(owner = "client!kga", name = "Uf", descriptor = "I")
	private int anInt5496 = 0;

	@OriginalMember(owner = "client!kga", name = "Xg", descriptor = "Z")
	private boolean aBoolean413 = true;

	@OriginalMember(owner = "client!kga", name = "Mg", descriptor = "F")
	public float aFloat178 = 3584.0F;

	@OriginalMember(owner = "client!kga", name = "Kf", descriptor = "[F")
	private final float[] aFloatArray42 = new float[4];

	@OriginalMember(owner = "client!kga", name = "vg", descriptor = "I")
	public int anInt5503 = -1;

	@OriginalMember(owner = "client!kga", name = "Sg", descriptor = "F")
	private float aFloat180 = 1.0F;

	@OriginalMember(owner = "client!kga", name = "zf", descriptor = "[F")
	public final float[] aFloatArray41 = new float[4];

	@OriginalMember(owner = "client!kga", name = "bh", descriptor = "F")
	public float aFloat181 = -1.0F;

	@OriginalMember(owner = "client!kga", name = "Og", descriptor = "I")
	public int anInt5508 = 0;

	@OriginalMember(owner = "client!kga", name = "Rg", descriptor = "[F")
	private final float[] aFloatArray44 = new float[16];

	@OriginalMember(owner = "client!kga", name = "ih", descriptor = "I")
	private int anInt5516 = 0;

	@OriginalMember(owner = "client!kga", name = "dh", descriptor = "I")
	private int anInt5514 = -1;

	@OriginalMember(owner = "client!kga", name = "bg", descriptor = "Lclient!kw;")
	public Class4_Sub11_Sub2 aClass4_Sub11_Sub2_2 = new Class4_Sub11_Sub2(8192);

	@OriginalMember(owner = "client!kga", name = "jh", descriptor = "[B")
	public final byte[] aByteArray59 = new byte[16384];

	@OriginalMember(owner = "client!kga", name = "mh", descriptor = "[I")
	public int[] anIntArray265 = new int[1];

	@OriginalMember(owner = "client!kga", name = "nh", descriptor = "[I")
	public int[] anIntArray266 = new int[1];

	@OriginalMember(owner = "client!kga", name = "oh", descriptor = "[I")
	public int[] anIntArray267 = new int[1];

	@OriginalMember(owner = "client!kga", name = "je", descriptor = "I")
	public final int anInt5468;

	@OriginalMember(owner = "client!kga", name = "H", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas9;

	@OriginalMember(owner = "client!kga", name = "uc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!kga", name = "eb", descriptor = "Lclient!jaggl/OpenGL;")
	public OpenGL anOpenGL2;

	@OriginalMember(owner = "client!kga", name = "Hd", descriptor = "J")
	private final long aLong142;

	@OriginalMember(owner = "client!kga", name = "Xb", descriptor = "J")
	private long aLong141;

	@OriginalMember(owner = "client!kga", name = "lf", descriptor = "I")
	public final int anInt5484;

	@OriginalMember(owner = "client!kga", name = "Pf", descriptor = "Z")
	private boolean aBoolean397;

	@OriginalMember(owner = "client!kga", name = "Yf", descriptor = "Z")
	public boolean aBoolean398;

	@OriginalMember(owner = "client!kga", name = "rg", descriptor = "Z")
	public boolean aBoolean406;

	@OriginalMember(owner = "client!kga", name = "eg", descriptor = "Z")
	public boolean aBoolean400;

	@OriginalMember(owner = "client!kga", name = "eh", descriptor = "Z")
	public boolean aBoolean414;

	@OriginalMember(owner = "client!kga", name = "ng", descriptor = "Z")
	private boolean aBoolean404;

	@OriginalMember(owner = "client!kga", name = "Ug", descriptor = "Z")
	public boolean aBoolean412;

	@OriginalMember(owner = "client!kga", name = "og", descriptor = "Z")
	private final boolean aBoolean405;

	@OriginalMember(owner = "client!kga", name = "ie", descriptor = "Lclient!id;")
	private final Class152 aClass152_1;

	@OriginalMember(owner = "client!kga", name = "pe", descriptor = "Lclient!or;")
	public final Class251 aClass251_1;

	@OriginalMember(owner = "client!kga", name = "be", descriptor = "Lclient!ei;")
	private final Class88 aClass88_1;

	@OriginalMember(owner = "client!kga", name = "fe", descriptor = "Lclient!ts;")
	private Class4_Sub46_Sub1 aClass4_Sub46_Sub1_1;

	@OriginalMember(owner = "client!kga", name = "he", descriptor = "Lclient!ls;")
	private final Class210 aClass210_1;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;I)V")
	public Class44_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		this.anInt5468 = arg2;
		this.aCanvas10 = this.aCanvas9 = arg0;
		if (!Static138.method2728("jaclib")) {
			throw new RuntimeException("");
		} else if (Static138.method2728("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong141 = this.aLong142 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt5468);
				if (this.aLong142 == 0L) {
					throw new RuntimeException("");
				}
				this.method4665();
				@Pc(341) int local341 = this.method4671();
				if (local341 != 0) {
					throw new RuntimeException("");
				}
				this.anInt5484 = this.aBoolean399 ? 33639 : 5121;
				if (this.aString56.indexOf("radeon") != -1) {
					@Pc(368) int local368 = 0;
					@Pc(370) boolean local370 = false;
					@Pc(372) boolean local372 = false;
					@Pc(381) String[] local381 = Static175.method3185(' ', this.aString56.replace('/', ' '));
					for (@Pc(383) int local383 = 0; local383 < local381.length; local383++) {
						@Pc(389) String local389 = local381[local383];
						try {
							if (local389.length() > 0) {
								if (local389.charAt(0) == 'x' && local389.length() >= 3 && Static220.method3590(local389.substring(1, 3))) {
									local372 = true;
									local389 = local389.substring(1);
								}
								if (local389.equals("hd")) {
									local370 = true;
								} else {
									if (local389.startsWith("hd")) {
										local370 = true;
										local389 = local389.substring(2);
									}
									if (local389.length() >= 4 && Static220.method3590(local389.substring(0, 4))) {
										local368 = Static82.method1379(local389.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(454) Exception local454) {
						}
					}
					if (!local372 && !local370) {
						if (local368 >= 7000 && local368 <= 7999) {
							this.aBoolean397 = false;
						}
						if (local368 >= 7000 && local368 <= 9250) {
							this.aBoolean398 = false;
						}
					}
					if (!local370 || local368 < 4000) {
						this.aBoolean406 = false;
					}
					this.aBoolean400 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean414 = true;
					this.aBoolean404 = this.aBoolean397;
				}
				if (this.aString55.indexOf("intel") != -1) {
					this.aBoolean412 = false;
				}
				this.aBoolean405 = !this.aString55.equals("s3 graphics");
				if (this.aBoolean397) {
					try {
						@Pc(538) int[] local538 = new int[1];
						OpenGL.glGenBuffersARB(1, local538, 0);
					} catch (@Pc(544) Throwable local544) {
						throw new RuntimeException("");
					}
				}
				Static512.method7483(false, true);
				this.aBoolean386 = true;
				this.aClass152_1 = new Class152(this, super.anInterface11_11);
				this.method4630();
				this.aClass251_1 = new Class251(this);
				this.aClass88_1 = new Class88(this);
				if (this.aClass88_1.method2471()) {
					this.aClass4_Sub46_Sub1_1 = new Class4_Sub46_Sub1(this);
					if (!this.aClass4_Sub46_Sub1_1.method7561()) {
						this.aClass4_Sub46_Sub1_1.method7560();
						this.aClass4_Sub46_Sub1_1 = null;
					}
				}
				this.aClass210_1 = new Class210(this);
				this.method4674();
				this.method4682();
				this.method4990();
			} catch (@Pc(618) Throwable local618) {
				local618.printStackTrace();
				this.method5029();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method4995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class6 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class6_Sub3 local6 = (Class6_Sub3) arg5;
		@Pc(9) Class77_Sub1_Sub1 local9 = local6.aClass77_Sub1_Sub1_4;
		this.method4606();
		this.method4605(local6.aClass77_Sub1_Sub1_4);
		this.method4669(1);
		this.method4621(7681, 8448);
		this.method4641(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat88 / (float) local9.anInt2401;
		@Pc(46) float local46 = local9.aFloat89 / (float) local9.anInt2403;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(60) float local60 = (float) -arg1 + (float) arg3;
		@Pc(73) float local73 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local60 * local60)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(92) float local92 = local60 * local73;
		@Pc(96) float local96 = local53 * local73;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local96 + 0.35F, local92 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method4641(768, 0, 5890);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class78 method4969(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class78_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!kga", name = "h", descriptor = "(I)Lclient!sa;")
	public Class77_Sub4 method4603() {
		return this.aClass36_Sub2_1 == null ? null : this.aClass36_Sub2_1.method6497();
	}

	@OriginalMember(owner = "client!kga", name = "B", descriptor = "()V")
	@Override
	public void method5039() {
		if (this.aBoolean412) {
			if (this.aClass51_4 != this.anInterface17_2) {
				throw new RuntimeException();
			}
			this.aClass51_4.method1100(0);
			this.aClass51_4.method1100(8);
			this.method4627(this.aClass51_4);
		} else if (this.aBoolean415) {
			this.aClass78_Sub3_1.da(0, 0, this.anInt5313, this.anInt5285, 0, 0);
			this.anOpenGL2.setSurface(this.aLong141);
		} else {
			throw new RuntimeException("");
		}
		this.anInt5285 = this.anInt5398;
		this.aClass78_Sub3_1 = null;
		this.anInt5313 = this.anInt5364;
		this.method4646();
		this.method4622();
		this.JA();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BZ)V")
	public void method4604(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean387 != arg0) {
			this.aBoolean387 = arg0;
			this.method4664();
			this.anInt5482 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZLclient!jf;)V")
	public void method4605(@OriginalArg(1) Class77 arg0) {
		@Pc(11) Class77 local11 = this.aClass77Array1[this.anInt5486];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt8662);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt8662);
				} else if (arg0.anInt8662 != local11.anInt8662) {
					OpenGL.glDisable(local11.anInt8662);
					OpenGL.glEnable(arg0.anInt8662);
				}
				OpenGL.glBindTexture(arg0.anInt8662, arg0.method7075());
			}
			this.aClass77Array1[this.anInt5486] = arg0;
		}
		this.anInt5482 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!kga", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt5496;
		arg0[1] = this.anInt5497;
		arg0[0] = this.anInt5502;
		arg0[2] = this.anInt5510;
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)V")
	public void method4606() {
		if (this.anInt5482 == 2) {
			return;
		}
		this.method4650();
		this.method4616(false);
		this.method4642(false);
		this.method4625(false);
		this.method4604(false);
		this.method4661(-2);
		this.anInt5482 = 2;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILclient!jaclib/memory/Buffer;ZZ)Lclient!ew;")
	public Interface10 method4607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		return (Interface10) (this.aBoolean397 ? new Class201_Sub2(this, arg1, arg2, arg0, false) : new Class21_Sub1(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!kga", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass8_Sub2_3.aFloat32 + (float) arg0 * this.aClass8_Sub2_3.aFloat21 + this.aClass8_Sub2_3.aFloat22 * (float) arg1 + (float) arg2 * this.aClass8_Sub2_3.aFloat27;
		if (local28 < (float) this.anInt5492 || local28 > (float) this.anInt5495) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass8_Sub2_3.aFloat26 + (float) arg2 * this.aClass8_Sub2_3.aFloat30 + this.aClass8_Sub2_3.aFloat25 * (float) arg1 + this.aClass8_Sub2_3.aFloat23 * (float) arg0) * (float) this.anInt5493 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt5500 * ((float) arg0 * this.aClass8_Sub2_3.aFloat31 + (float) arg1 * this.aClass8_Sub2_3.aFloat20 + (float) arg2 * this.aClass8_Sub2_3.aFloat29 + this.aClass8_Sub2_3.aFloat24) / local28);
		if ((float) local85 >= this.aFloat177 && (float) local85 <= this.aFloat165 && this.aFloat161 <= (float) local117 && this.aFloat179 >= (float) local117) {
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat177);
			arg3[1] = (int) ((float) local117 - this.aFloat161);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIII)Lclient!caa;")
	@Override
	public Class36 method4970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean416 ? new Class36_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "(I)V")
	private void method4608() {
		this.aFloat179 = this.anInt5496 - this.anInt5499;
		this.aFloat165 = this.anInt5510 - this.anInt5494;
		this.aFloat161 = this.anInt5497 - this.anInt5499;
		this.aFloat177 = this.anInt5502 - this.anInt5494;
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4675();
		this.method4669(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		if (local16 == 0.0F && local23 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(48) float local48 = (float) (1.0D / Math.sqrt((double) (local23 * local23 + local16 * local16)));
			local23 *= local48;
			local16 *= local48;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local16 + 0.35F, local23 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!caa;Lclient!caa;FLclient!caa;)Lclient!caa;")
	@Override
	public Class36 method5005(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class36 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean416 && this.aBoolean412) {
			@Pc(15) Class36_Sub2_Sub2 local15 = null;
			@Pc(18) Class36_Sub2 local18 = (Class36_Sub2) arg0;
			@Pc(21) Class36_Sub2 local21 = (Class36_Sub2) arg1;
			@Pc(25) Class77_Sub4 local25 = local18.method6497();
			@Pc(29) Class77_Sub4 local29 = local21.method6497();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt8684 <= local29.anInt8684 ? local29.anInt8684 : local25.anInt8684;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class36_Sub2_Sub2) {
					@Pc(60) Class36_Sub2_Sub2 local60 = (Class36_Sub2_Sub2) arg3;
					if (local60.method6500() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class36_Sub2_Sub2(this, local48);
				}
				if (local15.method6499(arg2, local25, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5012(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4998() {
		this.method4675();
		this.method4669(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt5476 + this.anInt5479 + this.anInt5477;
	}

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "()Z")
	@Override
	public boolean method4977() {
		return this.aClass4_Sub46_Sub1_1 != null && (this.anInt5468 <= 1 || this.aBoolean411);
	}

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "()Z")
	@Override
	public boolean method4975() {
		return true;
	}

	@OriginalMember(owner = "client!kga", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt5495;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZLclient!cba;)V")
	public void method4610(@OriginalArg(1) Class8_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method935(), 0);
	}

	@OriginalMember(owner = "client!kga", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5505 == arg0 && this.anInt5503 == arg1 && this.anInt5509 == arg2) {
			return;
		}
		this.anInt5505 = arg0;
		this.anInt5503 = arg1;
		this.anInt5509 = arg2;
		this.method4683();
		this.method4685();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIF)Lclient!ul;")
	@Override
	public Class4_Sub24 method4979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub24_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(IIII)V")
	public void method4611(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method4675();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method4669(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean393) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean393) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!kga", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4675();
		this.method4669(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kga", name = "s", descriptor = "()Lclient!q;")
	@Override
	public Class8 method5020() {
		return this.aClass8_Sub2_3;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)V")
	public synchronized void method4612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub38 local14 = new Class4_Sub38(arg1);
		local14.aLong268 = arg0;
		this.aClass244_43.method5960(local14);
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(B)V")
	public void method4613() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray41, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray43, 0);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!oi;I)V")
	public void method4614(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt5473 < 0 || arg0 != this.anInterface17Array3[this.anInt5473]) {
			throw new RuntimeException();
		}
		this.anInterface17Array3[this.anInt5473--] = null;
		arg0.method1090();
		if (this.anInt5473 < 0) {
			this.anInterface17_1 = null;
		} else {
			this.anInterface17_1 = this.anInterface17Array3[this.anInt5473];
			this.anInterface17_1.method1091();
		}
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "()I")
	@Override
	public int method4972() {
		return 4;
	}

	@OriginalMember(owner = "client!kga", name = "p", descriptor = "()V")
	@Override
	public void method5009() {
		if (this.aClass4_Sub46_Sub1_1 != null && this.aClass4_Sub46_Sub1_1.method7553()) {
			this.aClass88_1.method2476(this.aClass4_Sub46_Sub1_1);
			this.aClass152_1.method3508();
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method5024(@OriginalArg(0) Class78 arg0) {
		this.aClass78_Sub3_1 = (Class78_Sub3) arg0;
		@Pc(60) Class4_Sub5 local60;
		if (this.aBoolean412) {
			if (this.aClass51_4 == null) {
				this.aClass51_4 = new Class51(this);
			}
			if (this.aClass51_4 == this.anInterface17_2) {
				throw new RuntimeException();
			}
			this.method4626(this.aClass51_4);
			@Pc(163) Class4_Sub5_Sub13 local163 = (Class4_Sub5_Sub13) this.aClass350_20.method8207((long) (this.aClass78_Sub3_1.E() << 16 | this.aClass78_Sub3_1.u()));
			if (local163 == null) {
				local163 = new Class4_Sub5_Sub13(this, 6402, this.aClass78_Sub3_1.E(), this.aClass78_Sub3_1.u());
				@Pc(198) Class4_Sub5_Sub13 local198;
				for (this.anInt5478 += local163.anInt7065; this.anInt5478 > 2097152; this.anInt5478 -= local198.anInt7065) {
					local60 = this.aClass18_1.method223();
					if (local60 == null) {
						break;
					}
					local198 = (Class4_Sub5_Sub13) local60;
					local198.method8015();
					local198.method8379();
					local198.method5875();
				}
				this.aClass350_20.method8199((long) (this.aClass78_Sub3_1.E() << 16 | this.aClass78_Sub3_1.u()), local163);
			}
			this.aClass18_1.method222(local163);
			this.aClass51_4.method1096(local163, 8);
			this.aClass51_4.method1093(this.aClass78_Sub3_1.aClass77_Sub1_Sub1_2, 0);
		} else if (this.aBoolean415) {
			@Pc(31) Class4_Sub5_Sub14 local31 = (Class4_Sub5_Sub14) this.aClass350_20.method8207((long) (this.aClass78_Sub3_1.E() << 16 | this.aClass78_Sub3_1.u()));
			if (local31 == null) {
				local31 = new Class4_Sub5_Sub14(this, this.aClass78_Sub3_1.E(), this.aClass78_Sub3_1.u());
				@Pc(65) Class4_Sub5_Sub14 local65;
				for (this.anInt5478 += local31.anInt7603 * 4; this.anInt5478 > 2097152; this.anInt5478 -= local65.anInt7603) {
					local60 = this.aClass18_1.method223();
					if (local60 == null) {
						break;
					}
					local65 = (Class4_Sub5_Sub14) local60;
					local65.method8015();
					local65.method8379();
					this.anOpenGL2.releasePbuffer(local65.method6274());
				}
				this.aClass350_20.method8199((long) (this.aClass78_Sub3_1.E() << 16 | this.aClass78_Sub3_1.u()), local31);
			}
			this.aClass18_1.method222(local31);
			this.anOpenGL2.setPbuffer(local31.method6274());
		} else {
			throw new RuntimeException("");
		}
		this.anInt5313 = arg0.E();
		this.anInt5285 = arg0.u();
		this.method4646();
		this.method4622();
		this.JA();
	}

	@OriginalMember(owner = "client!kga", name = "j", descriptor = "(I)V")
	public void method4615() {
		if (this.anInt5482 == 8) {
			return;
		}
		this.method4639();
		this.method4616(true);
		this.method4625(true);
		this.method4604(true);
		this.method4669(1);
		this.anInt5482 = 8;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "()Z")
	@Override
	public boolean method4965() {
		return false;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZB)V")
	public void method4616(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean395) {
			this.aBoolean395 = arg0;
			this.method4685();
			this.anInt5482 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kga", name = "h", descriptor = "()Lclient!ik;")
	@Override
	public Class155 method4985() {
		@Pc(7) int local7 = -1;
		if (this.aString55.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString55.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString55.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class155(local7, "OpenGL", this.anInt5501, this.aString56, 0L);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZZ)V")
	public void method4617(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean403 != arg0) {
			this.aBoolean403 = arg0;
			this.method4623();
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZZ)V")
	public void method4618(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4681(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!kga", name = "k", descriptor = "(I)V")
	private void method4619() {
		Static190.aFloatArray22[2] = this.aFloat162 * this.aFloat163;
		Static190.aFloatArray22[3] = 1.0F;
		Static190.aFloatArray22[1] = this.aFloat163 * this.aFloat176;
		Static190.aFloatArray22[0] = this.aFloat169 * this.aFloat163;
		OpenGL.glLightModelfv(2899, Static190.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!kga", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt5514 != arg0;
		if (local11 || arg1 != this.aFloat181 || this.aFloat166 != arg2) {
			this.aFloat166 = arg2;
			this.aFloat181 = arg1;
			this.anInt5514 = arg0;
			if (local11) {
				this.aFloat176 = (float) (this.anInt5514 & 0xFF00) / 65280.0F;
				this.aFloat162 = (float) (this.anInt5514 & 0xFF) / 255.0F;
				this.aFloat169 = (float) (this.anInt5514 & 0xFF0000) / 1.671168E7F;
				this.method4619();
			}
			this.method4637();
		}
		if (arg3 == this.aFloatArray42[0] && this.aFloatArray42[1] == arg4 && this.aFloatArray42[2] == arg5) {
			return;
		}
		this.aFloatArray42[2] = arg5;
		this.aFloatArray42[1] = arg4;
		this.aFloatArray42[0] = arg3;
		this.aFloatArray40[2] = -arg5;
		this.aFloatArray40[0] = -arg3;
		this.aFloatArray40[1] = -arg4;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray41[1] = local138 * arg4;
		this.aFloatArray41[0] = local138 * arg3;
		this.aFloatArray41[2] = arg5 * local138;
		this.aFloatArray43[0] = -this.aFloatArray41[0];
		this.aFloatArray43[2] = -this.aFloatArray41[2];
		this.aFloatArray43[1] = -this.aFloatArray41[1];
		this.method4613();
		this.anInt5515 = (int) (arg3 * 256.0F / arg4);
		this.anInt5512 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BLclient!ew;)V")
	public void method4620(@OriginalArg(1) Interface10 arg0) {
		if (this.anInterface10_4 != arg0) {
			if (this.aBoolean397) {
				OpenGL.glBindBufferARB(34962, arg0.method6469());
			}
			this.anInterface10_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIB)V")
	public void method4621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5486 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(19) boolean local19 = false;
		if (arg0 != this.anInt5491) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local19 = true;
			this.anInt5491 = arg0;
		}
		if (this.anInt5498 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt5498 = arg1;
			local19 = true;
		}
		if (local19) {
			this.anInt5482 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "(B)V")
	private void method4622() {
		OpenGL.glViewport(this.anInt5483, this.anInt5516, this.anInt5313, this.anInt5285);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!kk;IIII)Lclient!da;")
	@Override
	public Class57 method5016(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class57_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "([I)V")
	@Override
	public void method5011(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt5285;
		arg0[0] = this.anInt5313;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5001(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)V")
	@Override
	public void method4991(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kga", name = "l", descriptor = "(I)V")
	private void method4623() {
		if (this.aBoolean392 && !this.aBoolean403) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(Z)V")
	private void method4624() {
		if (this.anInt5504 != 3) {
			this.anInt5504 = 3;
			this.method4645();
			this.method4640();
			this.anInt5482 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kga", name = "j", descriptor = "()V")
	@Override
	public void method4990() {
		if (!this.aBoolean405 || this.anInt5313 <= 0 || this.anInt5285 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt5502;
		@Pc(22) int local22 = this.anInt5510;
		@Pc(25) int local25 = this.anInt5497;
		@Pc(28) int local28 = this.anInt5496;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method4646();
		this.method4616(false);
		this.method4642(false);
		this.method4625(false);
		this.method4604(false);
		this.method4605(null);
		this.method4661(-2);
		this.method4658(1);
		this.method4669(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt5313, this.anInt5285, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(II)I")
	@Override
	public int method5023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!kga", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean413 = arg0;
		this.method4664();
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(ZB)V")
	public void method4625(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean390 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean390 = arg0;
		this.anInt5482 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILclient!oi;)V")
	public void method4626(@OriginalArg(1) Interface17 arg0) {
		if (this.aBoolean410) {
			this.method4631(arg0);
			this.method4659(arg0);
		} else if (this.anInt5474 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt5474 >= 0) {
				this.anInterface17Array1[this.anInt5474].method1089();
			}
			this.anInterface17_1 = this.anInterface17_2 = this.anInterface17Array1[++this.anInt5474] = arg0;
			this.anInterface17_1.method1086();
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!oi;Z)V")
	public void method4627(@OriginalArg(0) Interface17 arg0) {
		if (this.aBoolean410) {
			this.method4614(arg0);
			this.method4628(arg0);
		} else if (this.anInt5474 >= 0 && arg0 == this.anInterface17Array1[this.anInt5474]) {
			this.anInterface17Array1[this.anInt5474--] = null;
			arg0.method1089();
			if (this.anInt5474 < 0) {
				this.anInterface17_1 = this.anInterface17_2 = null;
			} else {
				this.anInterface17_1 = this.anInterface17_2 = this.anInterface17Array1[this.anInt5474];
				this.anInterface17_1.method1086();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(Lclient!oi;I)V")
	public void method4628(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt5475 < 0 || this.anInterface17Array2[this.anInt5475] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface17Array2[this.anInt5475--] = null;
		arg0.method1088();
		if (this.anInt5475 >= 0) {
			this.anInterface17_2 = this.anInterface17Array2[this.anInt5475];
			this.anInterface17_2.method1087();
		} else {
			this.anInterface17_2 = null;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(FB)V")
	public void method4629(@OriginalArg(0) float arg0) {
		if (this.aFloat180 != arg0) {
			this.aFloat180 = arg0;
			if (this.anInt5504 == 3) {
				this.method4645();
			}
		}
	}

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "(B)V")
	private void method4630() {
		this.aClass77Array1 = new Class77[this.anInt5489];
		this.aClass77_Sub1_2 = new Class77_Sub1(this, 3553, 6408, 1, 1);
		new Class77_Sub1(this, 3553, 6408, 1, 1);
		new Class77_Sub1(this, 3553, 6408, 1, 1);
		this.aClass57_Sub2_3 = new Class57_Sub2(this);
		this.aClass57_Sub2_7 = new Class57_Sub2(this);
		this.aClass57_Sub2_1 = new Class57_Sub2(this);
		this.aClass57_Sub2_8 = new Class57_Sub2(this);
		this.aClass57_Sub2_10 = new Class57_Sub2(this);
		this.aClass57_Sub2_5 = new Class57_Sub2(this);
		this.aClass57_Sub2_6 = new Class57_Sub2(this);
		this.aClass57_Sub2_2 = new Class57_Sub2(this);
		this.aClass57_Sub2_4 = new Class57_Sub2(this);
		this.aClass57_Sub2_9 = new Class57_Sub2(this);
		if (this.aBoolean412) {
			this.aClass51_5 = new Class51(this);
			new Class51(this);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass88_1.method2468(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!kga", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean408) {
			throw new RuntimeException("");
		}
		this.anInt5508 = arg3;
		this.anInt5490 = arg2;
		this.anInt5487 = arg1;
		this.anInt5513 = arg0;
		if (this.aBoolean394) {
			this.aClass210_1.aClass20_Sub8_1.method7115();
			this.aClass210_1.aClass20_Sub8_1.method7116();
		}
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(Lclient!oi;I)V")
	public void method4631(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt5473 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5473 >= 0) {
			this.anInterface17Array3[this.anInt5473].method1090();
		}
		this.anInterface17_1 = this.anInterface17Array3[++this.anInt5473] = arg0;
		this.anInterface17_1.method1091();
	}

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "(B)V")
	private void method4632() {
		if (this.anInt5510 >= this.anInt5502 && this.anInt5496 >= this.anInt5497) {
			OpenGL.glScissor(this.anInt5483 + this.anInt5502, -this.anInt5496 + (this.anInt5516 - -this.anInt5285), this.anInt5510 - this.anInt5502, this.anInt5496 - this.anInt5497);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!rba;Lclient!rba;ILclient!rba;Lclient!rba;)V")
	public void method4633(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(3) Class284 arg2, @OriginalArg(4) Class284 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method4620(arg1.anInterface10_6);
			OpenGL.glVertexPointer(arg1.aByte95, arg1.aShort91, this.anInterface10_4.method6466(), this.anInterface10_4.method6467() + (long) arg1.aByte96);
			OpenGL.glEnableClientState(32884);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method4620(arg0.anInterface10_6);
			OpenGL.glNormalPointer(arg0.aShort91, this.anInterface10_4.method6466(), this.anInterface10_4.method6467() + (long) arg0.aByte96);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method4620(arg3.anInterface10_6);
			OpenGL.glColorPointer(arg3.aByte95, arg3.aShort91, this.anInterface10_4.method6466(), this.anInterface10_4.method6467() + (long) arg3.aByte96);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method4620(arg2.anInterface10_6);
			OpenGL.glTexCoordPointer(arg2.aByte95, arg2.aShort91, this.anInterface10_4.method6466(), this.anInterface10_4.method6467() + (long) arg2.aByte96);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!kga", name = "m", descriptor = "(I)V")
	private void method4634() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BFFF)V")
	private void method4635(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean391) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg0, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean391 = true;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "([BZZII)Lclient!ew;")
	public Interface10 method4636(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return (Interface10) (this.aBoolean397 && (!arg1 || this.aBoolean404) ? new Class201_Sub2(this, arg2, arg0, arg3, arg1) : new Class21_Sub1(this, arg2, arg0, arg3));
	}

	@OriginalMember(owner = "client!kga", name = "n", descriptor = "(I)V")
	private void method4637() {
		Static190.aFloatArray22[2] = this.aFloat162 * this.aFloat181;
		Static190.aFloatArray22[3] = 1.0F;
		Static190.aFloatArray22[0] = this.aFloat169 * this.aFloat181;
		Static190.aFloatArray22[1] = this.aFloat176 * this.aFloat181;
		OpenGL.glLightfv(16384, 4609, Static190.aFloatArray22, 0);
		Static190.aFloatArray22[1] = this.aFloat176 * -this.aFloat166;
		Static190.aFloatArray22[3] = 1.0F;
		Static190.aFloatArray22[2] = -this.aFloat166 * this.aFloat162;
		Static190.aFloatArray22[0] = this.aFloat169 * -this.aFloat166;
		OpenGL.glLightfv(16385, 4609, Static190.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!kga", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < this.anInt5496) {
			this.anInt5496 = arg3;
		}
		if (this.anInt5502 < arg0) {
			this.anInt5502 = arg0;
		}
		if (arg2 < this.anInt5510) {
			this.anInt5510 = arg2;
		}
		if (arg1 > this.anInt5497) {
			this.anInt5497 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method4608();
		this.method4632();
	}

	@OriginalMember(owner = "client!kga", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method4675();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method4669(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean393) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean393) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!kga", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt5285 < arg3) {
			arg3 = this.anInt5285;
		}
		if (this.anInt5313 < arg2) {
			arg2 = this.anInt5313;
		}
		this.anInt5496 = arg3;
		this.anInt5510 = arg2;
		this.anInt5497 = arg1;
		this.anInt5502 = arg0;
		OpenGL.glEnable(3089);
		this.method4608();
		this.method4632();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method4988(@OriginalArg(0) Class4_Sub8 arg0) {
		this.aNativeHeap6 = ((Class4_Sub8_Sub1) arg0).aNativeHeap1;
		if (this.anInterface10_3 != null) {
			return;
		}
		@Pc(16) Class4_Sub11_Sub2 local16 = new Class4_Sub11_Sub2(80);
		if (this.aBoolean399) {
			local16.method4961(-1.0F);
			local16.method4961(-1.0F);
			local16.method4961(0.0F);
			local16.method4961(0.0F);
			local16.method4961(1.0F);
			local16.method4961(1.0F);
			local16.method4961(-1.0F);
			local16.method4961(0.0F);
			local16.method4961(1.0F);
			local16.method4961(1.0F);
			local16.method4961(1.0F);
			local16.method4961(1.0F);
			local16.method4961(0.0F);
			local16.method4961(1.0F);
			local16.method4961(0.0F);
			local16.method4961(-1.0F);
			local16.method4961(1.0F);
			local16.method4961(0.0F);
			local16.method4961(0.0F);
			local16.method4961(0.0F);
		} else {
			local16.method4960(-1.0F);
			local16.method4960(-1.0F);
			local16.method4960(0.0F);
			local16.method4960(0.0F);
			local16.method4960(1.0F);
			local16.method4960(1.0F);
			local16.method4960(-1.0F);
			local16.method4960(0.0F);
			local16.method4960(1.0F);
			local16.method4960(1.0F);
			local16.method4960(1.0F);
			local16.method4960(1.0F);
			local16.method4960(0.0F);
			local16.method4960(1.0F);
			local16.method4960(0.0F);
			local16.method4960(-1.0F);
			local16.method4960(1.0F);
			local16.method4960(0.0F);
			local16.method4960(0.0F);
			local16.method4960(0.0F);
		}
		this.anInterface10_3 = this.method4636(local16.aByteArray68, false, 20, local16.anInt5831);
		this.aClass284_8 = new Class284(this.anInterface10_3, 5126, 3, 0);
		this.aClass284_9 = new Class284(this.anInterface10_3, 5126, 2, 12);
		this.aClass52_1.method1184(this);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I[Lclient!ul;)V")
	@Override
	public void method5000(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub24[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass4_Sub24Array5[local7] = arg1[local7];
		}
		this.anInt5506 = arg0;
		if (this.anInt5504 != 1) {
			this.method4651();
		}
	}

	@OriginalMember(owner = "client!kga", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass8_Sub2_3.aFloat22 * (float) arg1 + this.aClass8_Sub2_3.aFloat21 * (float) arg0 + this.aClass8_Sub2_3.aFloat27 * (float) arg2 + this.aClass8_Sub2_3.aFloat32;
		if ((float) this.anInt5492 > local28 || local28 > (float) this.anInt5495) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass8_Sub2_3.aFloat26 + this.aClass8_Sub2_3.aFloat25 * (float) arg1 + (float) arg0 * this.aClass8_Sub2_3.aFloat23 + (float) arg2 * this.aClass8_Sub2_3.aFloat30) * (float) this.anInt5493 / local28);
		arg3[0] = (int) ((float) local85 - this.aFloat177);
		@Pc(127) int local127 = (int) ((this.aClass8_Sub2_3.aFloat29 * (float) arg2 + (float) arg1 * this.aClass8_Sub2_3.aFloat20 + (float) arg0 * this.aClass8_Sub2_3.aFloat31 + this.aClass8_Sub2_3.aFloat24) * (float) this.anInt5500 / local28);
		arg3[1] = (int) ((float) local127 - this.aFloat161);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!kga", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(6) int local6 = this.anInt5517;
		this.anInt5517 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BI)I")
	public int method4638(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!kga", name = "o", descriptor = "(I)V")
	private void method4639() {
		if (this.anInt5504 != 2) {
			this.anInt5504 = 2;
			this.method4652();
			this.method4640();
			this.anInt5482 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kga", name = "p", descriptor = "(I)V")
	private void method4640() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass8_Sub2_4.method935(), 0);
		if (this.aBoolean394) {
			this.aClass210_1.aClass20_Sub8_1.method7115();
		}
		this.method4613();
		this.method4651();
	}

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "()V")
	@Override
	public void method4984() {
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIBI)V")
	public void method4641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg0);
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)V")
	@Override
	public void method4980(@OriginalArg(0) int arg0) {
		this.method4634();
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(Z)V")
	@Override
	public void method5042(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kga", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class6_Sub3 local6 = (Class6_Sub3) arg1;
		@Pc(9) Class77_Sub1_Sub1 local9 = local6.aClass77_Sub1_Sub1_4;
		this.method4606();
		this.method4605(local6.aClass77_Sub1_Sub1_4);
		this.method4669(1);
		this.method4621(7681, 8448);
		this.method4641(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat88 / (float) local9.anInt2401;
		@Pc(46) float local46 = local9.aFloat89 / (float) local9.anInt2403;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5502 - arg2), local46 * (float) (this.anInt5497 - arg3));
		OpenGL.glVertex2i(this.anInt5502, this.anInt5497);
		OpenGL.glTexCoord2f((float) (this.anInt5502 - arg2) * local39, local46 * (float) (this.anInt5496 - arg3));
		OpenGL.glVertex2i(this.anInt5502, this.anInt5496);
		OpenGL.glTexCoord2f((float) (this.anInt5510 - arg2) * local39, (float) (this.anInt5496 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5510, this.anInt5496);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt5510 - arg2), (float) (this.anInt5497 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt5510, this.anInt5497);
		OpenGL.glEnd();
		this.method4641(768, 0, 5890);
	}

	@OriginalMember(owner = "client!kga", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt5496 = this.anInt5285;
		this.anInt5502 = 0;
		this.anInt5497 = 0;
		this.anInt5510 = this.anInt5313;
		OpenGL.glDisable(3089);
		this.method4608();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4986(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method5013();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4999(@OriginalArg(0) Class8 arg0) {
		this.aClass8_Sub2_3.M(arg0);
		this.aClass8_Sub2_4.M(this.aClass8_Sub2_3);
		this.aClass8_Sub2_4.method932();
		this.bf.method936(this.aClass8_Sub2_4);
		if (this.anInt5504 != 1) {
			this.method4640();
		}
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(ZB)V")
	public void method4642(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean392) {
			this.aBoolean392 = arg0;
			this.method4623();
			this.anInt5482 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILclient!uq;)V")
	public void method4643(@OriginalArg(1) Interface22 arg0) {
		if (this.anInterface22_2 != arg0) {
			if (this.aBoolean397) {
				OpenGL.glBindBufferARB(34963, arg0.method7401());
			}
			this.anInterface22_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "(B)V")
	public void method4644() {
		if (this.anInt5482 == 16) {
			return;
		}
		this.method4624();
		this.method4616(true);
		this.method4625(true);
		this.method4604(true);
		this.method4669(1);
		this.anInt5482 = 16;
	}

	@OriginalMember(owner = "client!kga", name = "h", descriptor = "(B)V")
	private void method4645() {
		@Pc(15) float local15 = (float) -this.anInt5494 * this.aFloat180 / (float) this.anInt5493;
		@Pc(27) float local27 = (float) -this.anInt5499 * this.aFloat180 / (float) this.anInt5500;
		@Pc(42) float local42 = this.aFloat180 * (float) (this.anInt5313 - this.anInt5494) / (float) this.anInt5493;
		@Pc(56) float local56 = this.aFloat180 * (float) (this.anInt5285 - this.anInt5499) / (float) this.anInt5500;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local27 != local56) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local56, (double) -local27, (double) this.anInt5492, (double) this.anInt5495);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kga", name = "q", descriptor = "(I)V")
	public void method4646() {
		if (this.anInt5504 != 0) {
			this.anInt5482 &= 0xFFFFFFE0;
			this.anInt5504 = 0;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!caa;)V")
	@Override
	public void method4982(@OriginalArg(0) Class36 arg0) {
		this.aClass36_Sub2_1 = (Class36_Sub2) arg0;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!so;)V")
	@Override
	public void method5017(@OriginalArg(0) Class305 arg0) {
		this.aClass52_1.method1187(this, -1, arg0);
	}

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "(B)V")
	private void method4647() {
		this.aFloatArray44[10] = this.aFloat172;
		this.aFloatArray44[14] = this.aFloat175;
		this.aFloat167 = (this.aFloatArray44[14] - (float) this.anInt5495) / this.aFloatArray44[10];
		this.aFloat178 = this.anInt5495;
	}

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "(II)V")
	public void method4648(@OriginalArg(0) int arg0) {
		if (this.anInt5486 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt5486 = arg0;
		}
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(IIZ)V")
	public synchronized void method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class4_Sub38 local14 = new Class4_Sub38(arg1);
		local14.aLong268 = arg0;
		this.aClass244_45.method5960(local14);
	}

	@OriginalMember(owner = "client!kga", name = "r", descriptor = "(I)V")
	private void method4650() {
		if (this.anInt5504 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt5313 > 0 && this.anInt5285 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt5313, (double) this.anInt5285, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt5482 &= 0xFFFFFFE7;
		this.anInt5504 = 1;
	}

	@OriginalMember(owner = "client!kga", name = "s", descriptor = "(I)V")
	private void method4651() {
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.anInt5506; local13++) {
			@Pc(20) Class4_Sub24 local20 = this.aClass4_Sub24Array5[local13];
			@Pc(24) int local24 = local13 + 16386;
			Static214.aFloatArray26[0] = local20.method7145();
			Static214.aFloatArray26[1] = local20.method7147();
			Static214.aFloatArray26[2] = local20.method7142();
			Static214.aFloatArray26[3] = 1.0F;
			OpenGL.glLightfv(local24, 4611, Static214.aFloatArray26, 0);
			@Pc(62) int local62 = local20.method7149();
			@Pc(68) float local68 = local20.method7144() / 255.0F;
			Static214.aFloatArray26[0] = local68 * (float) (local62 >> 16 & 0xFF);
			Static214.aFloatArray26[1] = (float) (local62 >> 8 & 0xFF) * local68;
			Static214.aFloatArray26[2] = local68 * (float) (local62 & 0xFF);
			OpenGL.glLightfv(local24, 4609, Static214.aFloatArray26, 0);
			OpenGL.glLightf(local24, 4617, 1.0F / (float) (local20.method7151() * local20.method7151()));
			OpenGL.glEnable(local24);
		}
		while (this.anInt5488 > local13) {
			OpenGL.glDisable(local13 + 16386);
			local13++;
		}
		this.anInt5488 = this.anInt5506;
	}

	@OriginalMember(owner = "client!kga", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass8_Sub2_3.aFloat32 + this.aClass8_Sub2_3.aFloat27 * (float) arg2 + this.aClass8_Sub2_3.aFloat22 * (float) arg1 + this.aClass8_Sub2_3.aFloat21 * (float) arg0;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass8_Sub2_3.aFloat32 + this.aClass8_Sub2_3.aFloat22 * (float) arg4 + (float) arg3 * this.aClass8_Sub2_3.aFloat21 + this.aClass8_Sub2_3.aFloat27 * (float) arg5;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt5492 && (float) this.anInt5492 > local59 || !(!((float) this.anInt5495 < local28) || !(local59 > (float) this.anInt5495))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt5493 * ((float) arg2 * this.aClass8_Sub2_3.aFloat30 + this.aClass8_Sub2_3.aFloat25 * (float) arg1 + this.aClass8_Sub2_3.aFloat23 * (float) arg0 + this.aClass8_Sub2_3.aFloat26) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt5493 * ((float) arg5 * this.aClass8_Sub2_3.aFloat30 + this.aClass8_Sub2_3.aFloat23 * (float) arg3 + this.aClass8_Sub2_3.aFloat25 * (float) arg4 + this.aClass8_Sub2_3.aFloat26) / local59);
		if ((float) local123 < this.aFloat177 && (float) local155 < this.aFloat177 || (float) local123 > this.aFloat165 && (float) local155 > this.aFloat165) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt5500 * (this.aClass8_Sub2_3.aFloat24 + this.aClass8_Sub2_3.aFloat29 * (float) arg2 + (float) arg0 * this.aClass8_Sub2_3.aFloat31 + this.aClass8_Sub2_3.aFloat20 * (float) arg1) / local28);
			@Pc(245) int local245 = (int) ((this.aClass8_Sub2_3.aFloat24 + (float) arg3 * this.aClass8_Sub2_3.aFloat31 + this.aClass8_Sub2_3.aFloat20 * (float) arg4 + (float) arg5 * this.aClass8_Sub2_3.aFloat29) * (float) this.anInt5500 / local59);
			return (!((float) local213 < this.aFloat161) || !((float) local245 < this.aFloat161)) && (!((float) local213 > this.aFloat179) || !(this.aFloat179 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!pga;Z)Lclient!f;")
	@Override
	public Class78 method5018(@OriginalArg(0) Class261 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt7660 * arg0.anInt7655];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray89 == null) {
			for (local21 = 0; local21 < arg0.anInt7660; local21++) {
				for (local25 = 0; local25 < arg0.anInt7655; local25++) {
					@Pc(38) int local38 = arg0.anIntArray389[arg0.aByteArray90[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt7660; local21++) {
				for (local25 = 0; local25 < arg0.anInt7655; local25++) {
					local12[local16++] = arg0.anIntArray389[arg0.aByteArray90[local14] & 0xFF] | arg0.aByteArray89[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(115) Class78 local115 = this.method4969(local12, arg0.anInt7655, arg0.anInt7655, arg0.anInt7660);
		local115.Q(arg0.anInt7657, arg0.anInt7656, arg0.anInt7658, arg0.anInt7659);
		return local115;
	}

	@OriginalMember(owner = "client!kga", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method4604(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!kga", name = "t", descriptor = "(I)V")
	private void method4652() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray44, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!gda;[Lclient!pga;Z)Lclient!la;")
	@Override
	public Class58 method4983(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class261[] arg1) {
		return new Class58_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(II[BZI)Lclient!uq;")
	public Interface22 method4653(@OriginalArg(2) byte[] arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		return (Interface22) (this.aBoolean397 && (!arg1 || this.aBoolean404) ? new Class201_Sub1(this, 5123, arg0, arg2, arg1) : new Class21_Sub2(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!kga", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5513 = arg0;
		this.anInt5487 = arg1;
		this.aBoolean408 = true;
		this.anInt5508 = arg3;
		this.anInt5490 = arg2;
	}

	@OriginalMember(owner = "client!kga", name = "u", descriptor = "(I)V")
	public void method4654() {
		if (this.anInt5482 == 4) {
			return;
		}
		this.method4650();
		this.method4616(false);
		this.method4642(false);
		this.method4625(false);
		this.method4604(false);
		this.method4661(-2);
		this.method4669(1);
		this.anInt5482 = 4;
	}

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "(II)I")
	public int method4655(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "()Z")
	@Override
	public boolean method4989() {
		if (this.aClass4_Sub46_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass4_Sub46_Sub1_1.method7553()) {
			if (!this.aClass88_1.method2474(this.aClass4_Sub46_Sub1_1)) {
				return false;
			}
			this.aClass152_1.method3508();
		}
		return true;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(FIFFF)V")
	public void method4656(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static190.aFloatArray22[0] = arg1;
		Static190.aFloatArray22[1] = arg0;
		Static190.aFloatArray22[3] = arg2;
		Static190.aFloatArray22[2] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static190.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!kga", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt5285 - local12 - arg1, arg2, 1, 32993, this.anInt5484, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!kga", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(37) float local37;
		if (this.aClass77_Sub1_Sub1_1 == null || arg2 > this.aClass77_Sub1_Sub1_1.anInt2390 || arg3 > this.aClass77_Sub1_Sub1_1.anInt2392) {
			this.aClass77_Sub1_Sub1_1 = Static108.method2381(arg2, arg3, this, arg6);
			this.aClass77_Sub1_Sub1_1.method2266(false, false);
			local37 = this.aClass77_Sub1_Sub1_1.aFloat88;
			local41 = this.aClass77_Sub1_Sub1_1.aFloat89;
		} else {
			this.aClass77_Sub1_Sub1_1.method2267(arg3, false, arg2, arg6, 6406);
			local37 = this.aClass77_Sub1_Sub1_1.aFloat88 * (float) arg2 / (float) this.aClass77_Sub1_Sub1_1.anInt2390;
			local41 = this.aClass77_Sub1_Sub1_1.aFloat89 * (float) arg3 / (float) this.aClass77_Sub1_Sub1_1.anInt2392;
		}
		this.method4606();
		this.method4605(this.aClass77_Sub1_Sub1_1);
		this.method4669(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4670(arg5);
		this.method4621(34165, 34165);
		this.method4641(768, 0, 34166);
		this.method4641(770, 2, 5890);
		this.method4611(34166, 0);
		this.method4611(5890, 2);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = local143 + (float) arg2;
		@Pc(156) float local156 = (float) arg3 + local146;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local37);
		OpenGL.glVertex2f(local143, local156);
		OpenGL.glTexCoord2f(local41, local37);
		OpenGL.glVertex2f(local151, local156);
		OpenGL.glTexCoord2f(local41, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method4641(768, 0, 5890);
		this.method4641(770, 2, 34166);
		this.method4611(5890, 0);
		this.method4611(34166, 2);
	}

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "(I)V")
	@Override
	public void method5038(@OriginalArg(0) int arg0) {
		this.method4665();
	}

	@OriginalMember(owner = "client!kga", name = "k", descriptor = "()Z")
	@Override
	public boolean method4993() {
		return true;
	}

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "(I)Lclient!e;")
	@Override
	public Class4_Sub8 method5027(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub8_Sub1 local8 = new Class4_Sub8_Sub1(arg0);
		this.aClass244_40.method5960(local8);
		return local8;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class6 method4997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static457.method6976(this, arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIILclient!uq;I)V")
	public void method4657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface22 arg2) {
		@Pc(7) int local7 = arg2.method7400();
		@Pc(14) int local14 = arg1 * this.method4655(local7);
		this.method4643(arg2);
		OpenGL.glDrawElements(4, arg0, local7, arg2.method7398() + (long) local14);
	}

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "(II)V")
	public void method4658(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method4621(7681, 7681);
		} else if (arg0 == 0) {
			this.method4621(8448, 8448);
		} else if (arg0 == 2) {
			this.method4621(34165, 7681);
		} else if (arg0 == 3) {
			this.method4621(260, 8448);
		} else if (arg0 == 4) {
			this.method4621(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!kga", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt5494, this.anInt5499, this.anInt5493, this.anInt5500 };
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BLclient!oi;)V")
	public void method4659(@OriginalArg(1) Interface17 arg0) {
		if (this.anInt5475 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5475 >= 0) {
			this.anInterface17Array2[this.anInt5475].method1088();
		}
		this.anInterface17_2 = this.anInterface17Array2[++this.anInt5475] = arg0;
		this.anInterface17_2.method1087();
	}

	@OriginalMember(owner = "client!kga", name = "z", descriptor = "()Z")
	@Override
	public boolean method5034() {
		return this.aBoolean393 && (!this.method5019() || this.aBoolean411);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class83 method4967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class83_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(ZLclient!cba;)V")
	public void method4660(@OriginalArg(1) Class8_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method935(), 0);
	}

	@OriginalMember(owner = "client!kga", name = "w", descriptor = "()Z")
	@Override
	public boolean method5028() {
		return true;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZI)V")
	public void method4661(@OriginalArg(1) int arg0) {
		this.method4618(arg0, true);
	}

	@OriginalMember(owner = "client!kga", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.anInt5470 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt5470++;
		}
		this.anInt5472 = 0x1 << this.anInt5470;
	}

	@OriginalMember(owner = "client!kga", name = "C", descriptor = "()Z")
	@Override
	public boolean method5041() {
		return true;
	}

	@OriginalMember(owner = "client!kga", name = "A", descriptor = "()Z")
	@Override
	public boolean method5037() {
		return true;
	}

	@OriginalMember(owner = "client!kga", name = "o", descriptor = "()Z")
	@Override
	public boolean method5008() {
		return this.aClass210_1.method5255();
	}

	@OriginalMember(owner = "client!kga", name = "y", descriptor = "()V")
	@Override
	public void method5032() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IB)V")
	public synchronized void method4662(@OriginalArg(0) int arg0) {
		@Pc(14) Class4_Sub38 local14 = new Class4_Sub38(arg0);
		this.aClass244_44.method5960(local14);
	}

	@OriginalMember(owner = "client!kga", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5499 = arg1;
		this.anInt5494 = arg0;
		this.anInt5500 = arg3;
		this.anInt5493 = arg2;
		this.method4672();
		this.method4608();
		if (this.anInt5504 == 3) {
			this.method4645();
		} else if (this.anInt5504 == 2) {
			this.method4652();
		}
	}

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "()Z")
	@Override
	public boolean method4976() {
		return false;
	}

	@OriginalMember(owner = "client!kga", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt5492 && arg1 == this.anInt5495) {
			return;
		}
		this.anInt5495 = arg1;
		this.anInt5492 = arg0;
		this.method4672();
		this.method4683();
		if (this.anInt5504 == 3) {
			this.method4645();
		} else if (this.anInt5504 == 2) {
			this.method4652();
			return;
		}
	}

	@OriginalMember(owner = "client!kga", name = "q", descriptor = "()V")
	@Override
	public void method5013() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "(II)V")
	public synchronized void method4663(@OriginalArg(1) int arg0) {
		@Pc(7) Class4 local7 = new Class4();
		local7.aLong268 = arg0;
		this.aClass244_46.method5960(local7);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!so;I)V")
	@Override
	public void method5026(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		this.aClass52_1.method1187(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!kga", name = "v", descriptor = "(I)V")
	private void method4664() {
		OpenGL.glDepthMask(this.aBoolean387 && this.aBoolean413);
	}

	@OriginalMember(owner = "client!kga", name = "w", descriptor = "(I)V")
	private void method4665() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL2.a()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static63.method1019(1000L);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)I")
	public int method4666(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4966(@OriginalArg(0) Canvas arg0) {
		this.aLong141 = 0L;
		this.aCanvas10 = null;
		if (arg0 == null || arg0 == this.aCanvas9) {
			this.aLong141 = this.aLong142;
			this.aCanvas10 = this.aCanvas9;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable6.get(arg0);
			this.aLong141 = local26;
			this.aCanvas10 = arg0;
		}
		if (this.aCanvas10 == null || this.aLong141 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong141);
		this.method4682();
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(IIZ)V")
	public synchronized void method4667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class4_Sub38 local14 = new Class4_Sub38(arg1);
		local14.aLong268 = arg0;
		this.aClass244_42.method5960(local14);
	}

	@OriginalMember(owner = "client!kga", name = "u", descriptor = "()Lclient!q;")
	@Override
	public Class8 method5025() {
		return new Class8_Sub2();
	}

	@OriginalMember(owner = "client!kga", name = "n", descriptor = "()Lclient!q;")
	@Override
	public Class8 method5007() {
		return this.aClass8_Sub2_1;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class78 method5035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class78_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(IZ)V")
	public void method4669(@OriginalArg(0) int arg0) {
		if (this.anInt5481 == arg0) {
			return;
		}
		@Pc(36) boolean local36;
		@Pc(34) byte local34;
		if (arg0 == 1) {
			local34 = 1;
			local36 = true;
		} else if (arg0 == 2) {
			local36 = false;
			local34 = 2;
		} else if (arg0 == 128) {
			local34 = 3;
			local36 = true;
		} else {
			local34 = 0;
			local36 = false;
		}
		if (!this.aBoolean388) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean388 = true;
		}
		if (this.aBoolean389 != local36) {
			if (local36) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean389 = local36;
		}
		if (local34 != this.anInt5480) {
			if (local34 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local34 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local34 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt5480 = local34;
		}
		this.anInt5481 = arg0;
		this.anInt5482 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt5502 > arg0 + arg2 || this.anInt5510 < arg0 - arg2 || this.anInt5497 > arg1 + arg2 || arg1 - arg2 > this.anInt5496) {
			return;
		}
		this.method4675();
		this.method4669(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(75) float local75 = (float) arg0 + 0.35F;
		@Pc(80) float local80 = (float) arg1 + 0.35F;
		@Pc(84) int local84 = arg2 << 1;
		if (this.aFloat164 > (float) local84) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local75 + 1.0F, local80 + 1.0F);
			OpenGL.glVertex2f(local75 + 1.0F, local80 - 1.0F);
			OpenGL.glVertex2f(local75 - 1.0F, -1.0F + local80);
			OpenGL.glVertex2f(local75 - 1.0F, local80 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local84 <= this.aFloat174) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local84);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local75, local80);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local75, local80);
			@Pc(153) int local153 = 262144 / (arg2 * 6);
			if (local153 <= 64) {
				local153 = 64;
			} else if (local153 > 512) {
				local153 = 512;
			}
			local153 = Static563.method8072(local153);
			OpenGL.glVertex2f((float) arg2 + local75, local80);
			for (@Pc(182) int local182 = 16384 - local153; local182 > 0; local182 -= local153) {
				OpenGL.glVertex2f(local75 + (float) arg2 * Class4_Sub7_Sub2.aFloatArray24[local182], local80 + (float) arg2 * Class4_Sub7_Sub2.aFloatArray23[local182]);
			}
			OpenGL.glVertex2f(local75 + (float) arg2, local80);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!kga", name = "h", descriptor = "(II)V")
	public void method4670(@OriginalArg(0) int arg0) {
		Static190.aFloatArray22[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static190.aFloatArray22[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static190.aFloatArray22[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static190.aFloatArray22[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static190.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!kga", name = "j", descriptor = "(B)I")
	private int method4671() {
		@Pc(5) int local5 = 0;
		this.aString55 = OpenGL.glGetString(7936).toLowerCase();
		this.aString56 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString55.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString55.indexOf("brian paul") != -1 || this.aString55.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(52) String local52 = OpenGL.glGetString(7938);
		@Pc(60) String[] local60 = Static175.method3185(' ', local52.replace('.', ' '));
		if (local60.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(76) int local76 = Static82.method1379(local60[0]);
				@Pc(82) int local82 = Static82.method1379(local60[1]);
				this.anInt5501 = local82 + local76 * 10;
			} catch (@Pc(91) NumberFormatException local91) {
				local5 |= 0x4;
			}
		}
		if (this.anInt5501 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(125) int[] local125 = new int[1];
		OpenGL.glGetIntegerv(34018, local125, 0);
		this.anInt5489 = local125[0];
		OpenGL.glGetIntegerv(34929, local125, 0);
		this.anInt5485 = local125[0];
		OpenGL.glGetIntegerv(34930, local125, 0);
		this.anInt5507 = local125[0];
		if (this.anInt5489 < 2 || this.anInt5485 < 2 || this.anInt5507 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean399 = Stream.b();
		this.aBoolean415 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean397 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean393 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean401 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean409 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean407 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean398 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean400 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean416 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean406 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean402 = false;
		this.aBoolean412 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean410 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean396 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean411 = this.aBoolean396 & this.aBoolean410;
		OpenGL.glGetFloatv(2834, Static190.aFloatArray22, 0);
		this.aFloat174 = Static190.aFloatArray22[1];
		this.aFloat164 = Static190.aFloatArray22[0];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!kga", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.method4669(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "(I)V")
	@Override
	public void method5031(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt5467 = arg0;
		this.aClass152_1.method3508();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V")
	@Override
	public void method5036(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4968(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas9) {
			local5 = this.aLong142;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable6.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas10 == arg0) {
			this.method4682();
		}
	}

	@OriginalMember(owner = "client!kga", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4675();
		this.method4669(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4973(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class4_Sub38 local19;
		while (!this.aClass244_42.method5961()) {
			local19 = (Class4_Sub38) this.aClass244_42.method5968();
			Static565.anIntArray531[local11++] = (int) local19.aLong268;
			this.anInt5479 -= local19.anInt8496;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static565.anIntArray531, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static565.anIntArray531, 0);
			local11 = 0;
		}
		while (!this.aClass244_43.method5961()) {
			local19 = (Class4_Sub38) this.aClass244_43.method5968();
			Static565.anIntArray531[local11++] = (int) local19.aLong268;
			this.anInt5477 -= local19.anInt8496;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static565.anIntArray531, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static565.anIntArray531, 0);
			local11 = 0;
		}
		while (!this.aClass244_44.method5961()) {
			local19 = (Class4_Sub38) this.aClass244_44.method5968();
			Static565.anIntArray531[local11++] = local19.anInt8496;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static565.anIntArray531, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static565.anIntArray531, 0);
			local11 = 0;
		}
		while (!this.aClass244_45.method5961()) {
			local19 = (Class4_Sub38) this.aClass244_45.method5968();
			Static565.anIntArray531[local11++] = (int) local19.aLong268;
			this.anInt5476 -= local19.anInt8496;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static565.anIntArray531, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static565.anIntArray531, 0);
		}
		while (!this.aClass244_41.method5961()) {
			local19 = (Class4_Sub38) this.aClass244_41.method5968();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt8496);
		}
		@Pc(210) Class4 local210;
		while (!this.aClass244_46.method5961()) {
			local210 = this.aClass244_46.method5968();
			OpenGL.glDeleteProgramARB((int) local210.aLong268);
		}
		while (!this.aClass244_47.method5961()) {
			local210 = this.aClass244_47.method5968();
			OpenGL.glDeleteObjectARB(local210.aLong268);
		}
		while (!this.aClass244_41.method5961()) {
			local19 = (Class4_Sub38) this.aClass244_41.method5968();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt8496);
		}
		this.aClass152_1.method3505();
		if (this.b() > 100663296 && this.aLong143 + 60000L < Static574.method8210()) {
			System.gc();
			this.aLong143 = Static574.method8210();
		}
		this.anInt5471 = local9;
	}

	@OriginalMember(owner = "client!kga", name = "x", descriptor = "(I)V")
	private void method4672() {
		@Pc(6) float[] local6 = this.aFloatArray44;
		@Pc(29) float local29 = (float) (this.anInt5492 * -this.anInt5494) / (float) this.anInt5493;
		@Pc(43) float local43 = (float) (this.anInt5492 * (this.anInt5313 - this.anInt5494)) / (float) this.anInt5493;
		@Pc(54) float local54 = (float) (this.anInt5499 * this.anInt5492) / (float) this.anInt5500;
		@Pc(69) float local69 = (float) ((this.anInt5499 - this.anInt5285) * this.anInt5492) / (float) this.anInt5500;
		if (local43 == local29 || local54 == local69) {
			local6[14] = 0.0F;
			local6[2] = 0.0F;
			local6[5] = 1.0F;
			local6[15] = 1.0F;
			local6[9] = 0.0F;
			local6[12] = 0.0F;
			local6[3] = 0.0F;
			local6[6] = 0.0F;
			local6[10] = 1.0F;
			local6[13] = 0.0F;
			local6[4] = 0.0F;
			local6[7] = 0.0F;
			local6[11] = 0.0F;
			local6[0] = 1.0F;
			local6[8] = 0.0F;
			local6[1] = 0.0F;
		} else {
			@Pc(83) float local83 = (float) this.anInt5492 * 2.0F;
			local6[12] = 0.0F;
			local6[13] = 0.0F;
			local6[1] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = local83 / (local54 - local69);
			local6[10] = this.aFloat172 = (float) -(this.anInt5495 + this.anInt5492) / (float) (this.anInt5495 - this.anInt5492);
			local6[0] = local83 / (local43 - local29);
			local6[14] = this.aFloat175 = -((float) this.anInt5495 * local83) / (float) (this.anInt5495 - this.anInt5492);
			local6[6] = 0.0F;
			local6[11] = -1.0F;
			local6[7] = 0.0F;
			local6[4] = 0.0F;
			local6[15] = 0.0F;
			local6[8] = (local43 + local29) / (-local29 + local43);
			local6[9] = (local69 + local54) / (-local69 + local54);
			local6[2] = 0.0F;
		}
		this.method4647();
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(IIII)V")
	public void method4673(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!kga", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(6) int local6 = this.anInt5518;
		this.anInt5518 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!kga", name = "k", descriptor = "(B)V")
	private void method4674() {
		this.method4661(-2);
		for (@Pc(14) int local14 = this.anInt5489 - 1; local14 >= 0; local14--) {
			this.method4648(local14);
			this.method4605(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method4621(8448, 8448);
		this.method4641(770, 2, 34168);
		this.method4684();
		this.anInt5481 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt5480 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean389 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean388 = true;
		this.method4616(true);
		this.method4642(true);
		this.method4625(true);
		this.method4604(true);
		this.method4646();
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
		@Pc(130) float[] local130 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(132) int local132 = 0; local132 < 8; local132++) {
			@Pc(138) int local138 = local132 + 16384;
			OpenGL.glLightfv(local138, 4608, local130, 0);
			OpenGL.glLightf(local138, 4615, 0.0F);
			OpenGL.glLightf(local138, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt5514 = this.anInt5505 = -1;
		this.JA();
	}

	@OriginalMember(owner = "client!kga", name = "m", descriptor = "()Z")
	@Override
	public boolean method5004() {
		return true;
	}

	@OriginalMember(owner = "client!kga", name = "L", descriptor = "()V")
	@Override
	public void L() {
		this.aBoolean408 = false;
	}

	@OriginalMember(owner = "client!kga", name = "x", descriptor = "()V")
	@Override
	protected void method5029() {
		for (@Pc(6) Class4 local6 = this.aClass244_40.method5963(); local6 != null; local6 = this.aClass244_40.method5965()) {
			((Class4_Sub8_Sub1) local6).method589();
		}
		if (this.aClass88_1 != null) {
			this.aClass88_1.method2472();
		}
		if (this.anOpenGL2 != null) {
			this.method4634();
			@Pc(40) Enumeration local40 = this.aHashtable6.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable6.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean386) {
			Static177.method7477(false, true);
			this.aBoolean386 = false;
		}
	}

	@OriginalMember(owner = "client!kga", name = "y", descriptor = "(I)V")
	private void method4675() {
		if (this.anInt5482 == 1) {
			return;
		}
		this.method4650();
		this.method4616(false);
		this.method4642(false);
		this.method4625(false);
		this.method4604(false);
		this.method4605(null);
		this.method4661(-2);
		this.method4658(1);
		this.anInt5482 = 1;
	}

	@OriginalMember(owner = "client!kga", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt5492;
	}

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "(IIZ)V")
	public void method4677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5516 = arg1;
		this.anInt5483 = arg0;
		this.method4622();
		this.method4632();
	}

	@OriginalMember(owner = "client!kga", name = "r", descriptor = "()Z")
	@Override
	public boolean method5019() {
		return this.aClass4_Sub46_Sub1_1 != null && this.aClass4_Sub46_Sub1_1.method7553();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IJ)V")
	public synchronized void method4678(@OriginalArg(1) long arg0) {
		@Pc(10) Class4 local10 = new Class4();
		local10.aLong268 = arg0;
		this.aClass244_47.method5960(local10);
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(II)I")
	@Override
	public int method5010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(FIF)V")
	public void method4679(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat170 = arg0;
		this.aFloat173 = arg1;
		this.method4683();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4992(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static389.aFloat204 = arg0;
		Static51.aFloat19 = arg1;
		Static150.aFloat110 = arg2;
	}

	@OriginalMember(owner = "client!kga", name = "z", descriptor = "(I)V")
	public void method4680() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!kga", name = "t", descriptor = "()Z")
	@Override
	public boolean method5022() {
		return true;
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4994(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas9) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable6.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZIZB)V")
	public void method4681(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 != this.anInt5511 || this.aBoolean394 != this.aBoolean408) {
			@Pc(16) Class77_Sub1 local16 = null;
			@Pc(18) int local18 = 0;
			@Pc(20) byte local20 = 0;
			@Pc(22) int local22 = 0;
			@Pc(29) int local29 = this.aBoolean408 ? 3 : 0;
			if (arg1 < 0) {
				this.method4684();
			} else {
				local16 = this.aClass152_1.method3507(arg1);
				@Pc(51) Class14 local51 = super.anInterface11_11.method7405(arg1);
				if (local51.aByte4 == 0 && local51.aByte6 == 0) {
					this.method4684();
				} else {
					@Pc(77) int local77 = local51.aBoolean12 ? 64 : 128;
					@Pc(81) int local81 = local77 * 50;
					this.method4635((float) (this.anInt5471 % local81 * local51.aByte6) / (float) local81, (float) (local51.aByte4 * (this.anInt5471 % local81)) / (float) local81, 0.0F);
				}
				if (!this.aBoolean408) {
					local20 = local51.aByte5;
					local22 = local51.anInt238;
					local29 = local51.aByte9;
				}
				local18 = local51.anInt239;
			}
			this.aClass210_1.method5253(local20, arg0, local22, local29, arg2);
			if (!this.aClass210_1.method5256(local16, local18)) {
				this.method4605(local16);
				this.method4658(local18);
			}
			this.aBoolean394 = this.aBoolean408;
			this.anInt5511 = arg1;
		}
		this.anInt5482 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kga", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat163) {
			this.aFloat163 = arg0;
			this.method4619();
		}
	}

	@OriginalMember(owner = "client!kga", name = "l", descriptor = "(B)V")
	private void method4682() {
		if (this.aCanvas10 == null) {
			this.anInt5364 = this.anInt5398 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas10.getSize();
			this.anInt5398 = local10.height;
			this.anInt5364 = local10.width;
		}
		if (this.anInterface17_2 == null) {
			this.anInt5313 = this.anInt5364;
			this.anInt5285 = this.anInt5398;
			this.method4622();
		}
		this.method4646();
		this.JA();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class78 method4964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class78_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kga", name = "A", descriptor = "(I)V")
	private void method4683() {
		this.aFloat171 = (float) (this.anInt5495 - this.anInt5509) - this.aFloat173;
		this.aFloat168 = this.aFloat171 - this.aFloat170 * (float) this.anInt5503;
		if (this.aFloat168 < (float) this.anInt5492) {
			this.aFloat168 = this.anInt5492;
		}
		OpenGL.glFogf(2915, this.aFloat168);
		OpenGL.glFogf(2916, this.aFloat171);
		Static190.aFloatArray22[2] = (float) (this.anInt5505 & 0xFF) / 255.0F;
		Static190.aFloatArray22[0] = (float) (this.anInt5505 & 0xFF0000) / 1.671168E7F;
		Static190.aFloatArray22[1] = (float) (this.anInt5505 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static190.aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!kga", name = "B", descriptor = "(I)V")
	private void method4684() {
		if (this.aBoolean391) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean391 = false;
		}
	}

	@OriginalMember(owner = "client!kga", name = "C", descriptor = "(I)V")
	private void method4685() {
		if (this.aBoolean395 && this.anInt5503 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!kga", name = "l", descriptor = "()V")
	@Override
	public void method5003() {
		this.aClass88_1.method2470();
	}

	@OriginalMember(owner = "client!kga", name = "D", descriptor = "(I)V")
	public void method4686() {
		OpenGL.glPopMatrix();
	}
}
