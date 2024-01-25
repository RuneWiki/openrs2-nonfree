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

@OriginalClass("client!ad")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ad", name = "lb", descriptor = "I")
	public static int lb = 64;

	@OriginalMember(owner = "client!ad", name = "nb", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!ad", name = "Eb", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!ad", name = "Pb", descriptor = "I")
	public int anInt256;

	@OriginalMember(owner = "client!ad", name = "Xb", descriptor = "I")
	public int anInt264;

	@OriginalMember(owner = "client!ad", name = "re", descriptor = "I")
	public int anInt377;

	@OriginalMember(owner = "client!ad", name = "te", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!ad", name = "ye", descriptor = "Lclient!im;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!ad", name = "Ce", descriptor = "Lclient!im;")
	private Interface11 anInterface11_2;

	@OriginalMember(owner = "client!ad", name = "De", descriptor = "I")
	public int anInt381;

	@OriginalMember(owner = "client!ad", name = "Fe", descriptor = "I")
	public int anInt382;

	@OriginalMember(owner = "client!ad", name = "Ge", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!ad", name = "Oe", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!ad", name = "Pe", descriptor = "Z")
	public boolean aBoolean16;

	@OriginalMember(owner = "client!ad", name = "Qe", descriptor = "Lclient!gca;")
	public Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!ad", name = "Se", descriptor = "Lclient!gr;")
	public Class112 aClass112_1;

	@OriginalMember(owner = "client!ad", name = "Ve", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!ad", name = "Xe", descriptor = "Z")
	public boolean aBoolean18;

	@OriginalMember(owner = "client!ad", name = "Ye", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!ad", name = "Ze", descriptor = "Z")
	public boolean aBoolean19;

	@OriginalMember(owner = "client!ad", name = "af", descriptor = "F")
	public float aFloat7;

	@OriginalMember(owner = "client!ad", name = "cf", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!ad", name = "ff", descriptor = "Z")
	public boolean aBoolean20;

	@OriginalMember(owner = "client!ad", name = "hf", descriptor = "Lclient!gca;")
	public Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!ad", name = "jf", descriptor = "Lclient!gca;")
	public Class2_Sub2 aClass2_Sub2_3;

	@OriginalMember(owner = "client!ad", name = "lf", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!ad", name = "nf", descriptor = "Lclient!jaa;")
	public Class141 aClass141_1;

	@OriginalMember(owner = "client!ad", name = "pf", descriptor = "Z")
	private boolean aBoolean22;

	@OriginalMember(owner = "client!ad", name = "qf", descriptor = "Lclient!ah;")
	private Class11_Sub1_Sub1 aClass11_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "rf", descriptor = "Z")
	private boolean aBoolean23;

	@OriginalMember(owner = "client!ad", name = "sf", descriptor = "Z")
	private boolean aBoolean24;

	@OriginalMember(owner = "client!ad", name = "tf", descriptor = "F")
	private float aFloat10;

	@OriginalMember(owner = "client!ad", name = "uf", descriptor = "Lclient!gca;")
	public Class2_Sub2 aClass2_Sub2_4;

	@OriginalMember(owner = "client!ad", name = "vf", descriptor = "Z")
	private boolean aBoolean25;

	@OriginalMember(owner = "client!ad", name = "wf", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!ad", name = "Af", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!ad", name = "Cf", descriptor = "[Lclient!pm;")
	private Class11[] aClass11Array1;

	@OriginalMember(owner = "client!ad", name = "Ef", descriptor = "Lclient!gca;")
	public Class2_Sub2 aClass2_Sub2_5;

	@OriginalMember(owner = "client!ad", name = "Ff", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!ad", name = "Gf", descriptor = "Z")
	private boolean aBoolean27;

	@OriginalMember(owner = "client!ad", name = "Hf", descriptor = "I")
	public int anInt396;

	@OriginalMember(owner = "client!ad", name = "If", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!ad", name = "Mf", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!ad", name = "Of", descriptor = "Z")
	public boolean aBoolean29;

	@OriginalMember(owner = "client!ad", name = "Rf", descriptor = "F")
	private float aFloat15;

	@OriginalMember(owner = "client!ad", name = "Sf", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!ad", name = "Tf", descriptor = "Lclient!ws;")
	public Class205_Sub3 aClass205_Sub3_3;

	@OriginalMember(owner = "client!ad", name = "Uf", descriptor = "Lclient!gca;")
	public Class2_Sub2 aClass2_Sub2_6;

	@OriginalMember(owner = "client!ad", name = "Vf", descriptor = "Z")
	private boolean aBoolean30;

	@OriginalMember(owner = "client!ad", name = "Wf", descriptor = "Z")
	public boolean aBoolean31;

	@OriginalMember(owner = "client!ad", name = "Xf", descriptor = "Lclient!gca;")
	public Class2_Sub2 aClass2_Sub2_7;

	@OriginalMember(owner = "client!ad", name = "Yf", descriptor = "Lclient!cs;")
	public Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "ag", descriptor = "F")
	private float aFloat16;

	@OriginalMember(owner = "client!ad", name = "dg", descriptor = "Lclient!gca;")
	public Class2_Sub2 aClass2_Sub2_8;

	@OriginalMember(owner = "client!ad", name = "gg", descriptor = "Z")
	private boolean aBoolean34;

	@OriginalMember(owner = "client!ad", name = "ig", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!ad", name = "jg", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!ad", name = "lg", descriptor = "Lclient!gr;")
	public Class112 aClass112_2;

	@OriginalMember(owner = "client!ad", name = "mg", descriptor = "I")
	public int anInt404;

	@OriginalMember(owner = "client!ad", name = "ng", descriptor = "Lclient!gca;")
	public Class2_Sub2 aClass2_Sub2_9;

	@OriginalMember(owner = "client!ad", name = "qg", descriptor = "Lclient!ws;")
	public Class205_Sub3 aClass205_Sub3_4;

	@OriginalMember(owner = "client!ad", name = "rg", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!ad", name = "wg", descriptor = "Z")
	public boolean aBoolean36;

	@OriginalMember(owner = "client!ad", name = "yg", descriptor = "Lclient!bo;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!ad", name = "zg", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!ad", name = "Ag", descriptor = "Z")
	private boolean aBoolean37;

	@OriginalMember(owner = "client!ad", name = "Bg", descriptor = "F")
	private float aFloat22;

	@OriginalMember(owner = "client!ad", name = "Eg", descriptor = "Z")
	public boolean aBoolean38;

	@OriginalMember(owner = "client!ad", name = "Fg", descriptor = "Z")
	public boolean aBoolean39;

	@OriginalMember(owner = "client!ad", name = "Ig", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!ad", name = "Ng", descriptor = "I")
	public int anInt415;

	@OriginalMember(owner = "client!ad", name = "Og", descriptor = "Z")
	private boolean aBoolean41;

	@OriginalMember(owner = "client!ad", name = "Qg", descriptor = "Z")
	private boolean aBoolean42;

	@OriginalMember(owner = "client!ad", name = "Tg", descriptor = "I")
	public int anInt417;

	@OriginalMember(owner = "client!ad", name = "Wg", descriptor = "Lclient!bo;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ad", name = "Xg", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!ad", name = "Zg", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!ad", name = "ah", descriptor = "Lclient!il;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!ad", name = "bh", descriptor = "Lclient!ec;")
	private Class66_Sub1 aClass66_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "ch", descriptor = "Lclient!gca;")
	public Class2_Sub2 aClass2_Sub2_10;

	@OriginalMember(owner = "client!ad", name = "dh", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!ad", name = "ih", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "client!ad", name = "jh", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!ad", name = "rc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!ad", name = "ae", descriptor = "I")
	public int anInt365 = 128;

	@OriginalMember(owner = "client!ad", name = "Nd", descriptor = "Lclient!hu;")
	private final Class128 aClass128_1 = new Class128();

	@OriginalMember(owner = "client!ad", name = "me", descriptor = "Lclient!ws;")
	private final Class205_Sub3 aClass205_Sub3_1 = new Class205_Sub3();

	@OriginalMember(owner = "client!ad", name = "ne", descriptor = "Lclient!ws;")
	public final Class205_Sub3 aClass205_Sub3_2 = new Class205_Sub3();

	@OriginalMember(owner = "client!ad", name = "oe", descriptor = "I")
	public int anInt375 = 3;

	@OriginalMember(owner = "client!ad", name = "pe", descriptor = "I")
	public int anInt376 = 8;

	@OriginalMember(owner = "client!ad", name = "ue", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!ad", name = "qe", descriptor = "Lclient!eea;")
	private final Class71 aClass71_1 = new Class71();

	@OriginalMember(owner = "client!ad", name = "xe", descriptor = "[Lclient!im;")
	private final Interface11[] anInterface11Array2 = new Interface11[4];

	@OriginalMember(owner = "client!ad", name = "ze", descriptor = "I")
	private int anInt379 = -1;

	@OriginalMember(owner = "client!ad", name = "Be", descriptor = "I")
	private int anInt380 = -1;

	@OriginalMember(owner = "client!ad", name = "Ae", descriptor = "[Lclient!im;")
	private final Interface11[] anInterface11Array3 = new Interface11[4];

	@OriginalMember(owner = "client!ad", name = "ve", descriptor = "I")
	private int anInt378 = -1;

	@OriginalMember(owner = "client!ad", name = "we", descriptor = "[Lclient!im;")
	private final Interface11[] anInterface11Array1 = new Interface11[4];

	@OriginalMember(owner = "client!ad", name = "Ee", descriptor = "Lclient!eea;")
	private final Class71 aClass71_2;

	@OriginalMember(owner = "client!ad", name = "He", descriptor = "Lclient!eea;")
	private final Class71 aClass71_3;

	@OriginalMember(owner = "client!ad", name = "Ie", descriptor = "Lclient!eea;")
	private final Class71 aClass71_4;

	@OriginalMember(owner = "client!ad", name = "Je", descriptor = "Lclient!eea;")
	private final Class71 aClass71_5;

	@OriginalMember(owner = "client!ad", name = "Ke", descriptor = "Lclient!eea;")
	private final Class71 aClass71_6;

	@OriginalMember(owner = "client!ad", name = "Le", descriptor = "Lclient!eea;")
	private final Class71 aClass71_7;

	@OriginalMember(owner = "client!ad", name = "Me", descriptor = "Lclient!eea;")
	private final Class71 aClass71_8;

	@OriginalMember(owner = "client!ad", name = "Re", descriptor = "I")
	public int anInt386;

	@OriginalMember(owner = "client!ad", name = "ef", descriptor = "F")
	private float aFloat8;

	@OriginalMember(owner = "client!ad", name = "Ne", descriptor = "I")
	public int anInt384;

	@OriginalMember(owner = "client!ad", name = "kf", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!ad", name = "Df", descriptor = "[F")
	private final float[] aFloatArray2;

	@OriginalMember(owner = "client!ad", name = "Lf", descriptor = "[F")
	private final float[] aFloatArray3;

	@OriginalMember(owner = "client!ad", name = "Bf", descriptor = "F")
	private float aFloat12;

	@OriginalMember(owner = "client!ad", name = "Qf", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!ad", name = "df", descriptor = "[F")
	private final float[] aFloatArray1;

	@OriginalMember(owner = "client!ad", name = "zf", descriptor = "F")
	private float aFloat11;

	@OriginalMember(owner = "client!ad", name = "xf", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!ad", name = "Te", descriptor = "I")
	public int anInt387;

	@OriginalMember(owner = "client!ad", name = "og", descriptor = "I")
	public int anInt405;

	@OriginalMember(owner = "client!ad", name = "kg", descriptor = "F")
	private float aFloat19;

	@OriginalMember(owner = "client!ad", name = "sg", descriptor = "I")
	public int anInt406;

	@OriginalMember(owner = "client!ad", name = "tg", descriptor = "I")
	public int anInt407;

	@OriginalMember(owner = "client!ad", name = "Pf", descriptor = "[F")
	private final float[] aFloatArray4;

	@OriginalMember(owner = "client!ad", name = "Zf", descriptor = "Z")
	private boolean aBoolean32;

	@OriginalMember(owner = "client!ad", name = "Dg", descriptor = "I")
	public int anInt410;

	@OriginalMember(owner = "client!ad", name = "of", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!ad", name = "bg", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!ad", name = "Jf", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!ad", name = "Jg", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!ad", name = "Hg", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!ad", name = "cg", descriptor = "I")
	private int anInt402;

	@OriginalMember(owner = "client!ad", name = "fg", descriptor = "F")
	private float aFloat17;

	@OriginalMember(owner = "client!ad", name = "Nf", descriptor = "I")
	public int anInt398;

	@OriginalMember(owner = "client!ad", name = "Ue", descriptor = "F")
	public float aFloat6;

	@OriginalMember(owner = "client!ad", name = "Pg", descriptor = "I")
	public int anInt416;

	@OriginalMember(owner = "client!ad", name = "Lg", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!ad", name = "Rg", descriptor = "F")
	private float aFloat26;

	@OriginalMember(owner = "client!ad", name = "ug", descriptor = "[Lclient!oj;")
	private final Class3_Sub30[] aClass3_Sub30Array1;

	@OriginalMember(owner = "client!ad", name = "hg", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!ad", name = "Mg", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!ad", name = "Cg", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!ad", name = "Yg", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!ad", name = "vg", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!ad", name = "xg", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!ad", name = "Gg", descriptor = "I")
	public int anInt411;

	@OriginalMember(owner = "client!ad", name = "bf", descriptor = "[F")
	public final float[] bf;

	@OriginalMember(owner = "client!ad", name = "Vg", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "client!ad", name = "gf", descriptor = "Lclient!vw;")
	public Class3_Sub27_Sub2 aClass3_Sub27_Sub2_1;

	@OriginalMember(owner = "client!ad", name = "eh", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!ad", name = "fh", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!ad", name = "gh", descriptor = "[B")
	public final byte[] aByteArray9;

	@OriginalMember(owner = "client!ad", name = "hh", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!ad", name = "fb", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas2;

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!ad", name = "Xd", descriptor = "I")
	public final int anInt362;

	@OriginalMember(owner = "client!ad", name = "zb", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ad", name = "Mb", descriptor = "J")
	private final long aLong9;

	@OriginalMember(owner = "client!ad", name = "hb", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ad", name = "Ug", descriptor = "I")
	public final int anInt418;

	@OriginalMember(owner = "client!ad", name = "pg", descriptor = "Z")
	public boolean aBoolean35;

	@OriginalMember(owner = "client!ad", name = "eg", descriptor = "Z")
	public boolean aBoolean33;

	@OriginalMember(owner = "client!ad", name = "mf", descriptor = "Z")
	private boolean aBoolean21;

	@OriginalMember(owner = "client!ad", name = "Kg", descriptor = "Z")
	public boolean aBoolean40;

	@OriginalMember(owner = "client!ad", name = "We", descriptor = "Z")
	private boolean aBoolean17;

	@OriginalMember(owner = "client!ad", name = "Kf", descriptor = "Z")
	public boolean aBoolean28;

	@OriginalMember(owner = "client!ad", name = "Sg", descriptor = "Z")
	public boolean aBoolean43;

	@OriginalMember(owner = "client!ad", name = "yf", descriptor = "Z")
	private final boolean aBoolean26;

	@OriginalMember(owner = "client!ad", name = "ce", descriptor = "Lclient!lb;")
	private final Class171 aClass171_1;

	@OriginalMember(owner = "client!ad", name = "se", descriptor = "Lclient!ug;")
	public final Class293 aClass293_1;

	@OriginalMember(owner = "client!ad", name = "fe", descriptor = "Lclient!hn;")
	private final Class124 aClass124_1;

	@OriginalMember(owner = "client!ad", name = "Id", descriptor = "Lclient!hr;")
	private Class3_Sub4_Sub1 aClass3_Sub4_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "Ud", descriptor = "Lclient!ow;")
	private final Class225 aClass225_1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;I)V")
	public Class5_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class279();
		new Class267(16);
		this.aClass71_2 = new Class71();
		this.aClass71_3 = new Class71();
		this.aClass71_4 = new Class71();
		this.aClass71_5 = new Class71();
		this.aClass71_6 = new Class71();
		this.aClass71_7 = new Class71();
		this.aClass71_8 = new Class71();
		this.anInt386 = 3584;
		this.aFloat8 = 0.0F;
		this.anInt384 = 512;
		this.anInt391 = 0;
		this.aFloatArray2 = new float[4];
		this.aFloatArray3 = new float[4];
		this.aFloat12 = -1.0F;
		this.anInt399 = 8448;
		this.aFloatArray1 = new float[4];
		this.aFloat11 = 1.0F;
		this.anInt393 = -1;
		this.anInt387 = 0;
		this.anInt405 = -1;
		this.aFloat19 = 3000.0F;
		this.anInt406 = 50;
		this.anInt407 = 0;
		this.aFloatArray4 = new float[16];
		this.aBoolean32 = true;
		this.anInt410 = -1;
		this.anInt392 = 0;
		this.anInt401 = 8448;
		this.aFloat14 = 1.0F;
		this.anInt413 = 0;
		this.anInt412 = -1;
		this.anInt402 = 0;
		this.aFloat17 = -1.0F;
		this.anInt398 = -1;
		this.aFloat6 = 1.0F;
		this.anInt416 = 512;
		this.anInt414 = 0;
		this.aFloat26 = 1.0F;
		this.aClass3_Sub30Array1 = new Class3_Sub30[Static488.anInt8711];
		this.aFloat18 = 1.0F;
		this.aFloat25 = 3584.0F;
		this.aFloat23 = -1.0F;
		this.aFloat27 = -1.0F;
		this.anInt408 = 0;
		this.aFloat21 = 3584.0F;
		this.anInt411 = 0;
		this.bf = new float[4];
		this.anInt419 = 0;
		this.aClass3_Sub27_Sub2_1 = new Class3_Sub27_Sub2(8192);
		this.anIntArray81 = new int[1];
		this.anIntArray82 = new int[1];
		this.aByteArray9 = new byte[16384];
		this.anIntArray83 = new int[1];
		this.aCanvas1 = this.aCanvas2 = arg0;
		this.anInt362 = arg2;
		if (!Static140.method2462("jaclib")) {
			throw new RuntimeException("");
		} else if (Static140.method2462("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong8 = this.aLong9 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt362);
				if (this.aLong9 == 0L) {
					throw new RuntimeException("");
				}
				this.method385();
				@Pc(318) int local318 = this.method440();
				if (local318 != 0) {
					throw new RuntimeException("");
				}
				this.anInt418 = this.aBoolean39 ? 33639 : 5121;
				@Pc(344) int local344;
				if (this.aString4.indexOf("radeon") != -1) {
					local344 = 0;
					@Pc(346) boolean local346 = false;
					@Pc(348) boolean local348 = false;
					@Pc(357) String[] local357 = Static439.method6626(' ', this.aString4.replace('/', ' '));
					for (@Pc(359) int local359 = 0; local359 < local357.length; local359++) {
						@Pc(365) String local365 = local357[local359];
						try {
							if (local365.length() > 0) {
								if (local365.charAt(0) == 'x' && local365.length() >= 3 && Static521.method7402(local365.substring(1, 3))) {
									local365 = local365.substring(1);
									local348 = true;
								}
								if (local365.equals("hd")) {
									local346 = true;
								} else {
									if (local365.startsWith("hd")) {
										local346 = true;
										local365 = local365.substring(2);
									}
									if (local365.length() >= 4 && Static521.method7402(local365.substring(0, 4))) {
										local344 = Static454.method6837(local365.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(432) Exception local432) {
						}
					}
					if (!local346 || local344 < 4000) {
						this.aBoolean35 = false;
					}
					if (!local348 && !local346) {
						if (local344 >= 7000 && local344 <= 9250) {
							this.aBoolean33 = false;
						}
						if (local344 >= 7000 && local344 <= 7999) {
							this.aBoolean21 = false;
						}
					}
					this.aBoolean40 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean17 = this.aBoolean21;
					this.aBoolean28 = true;
				}
				if (this.aString5.indexOf("intel") != -1) {
					this.aBoolean43 = false;
				}
				this.aBoolean26 = !this.aString5.equals("s3 graphics");
				if (this.aBoolean21) {
					try {
						@Pc(516) int[] local516 = new int[1];
						OpenGL.glGenBuffersARB(1, local516, 0);
					} catch (@Pc(522) Throwable local522) {
						throw new RuntimeException("");
					}
				}
				Static340.method5406(true, false);
				this.aBoolean15 = true;
				this.aClass171_1 = new Class171(this, super.anInterface4_14);
				this.method439();
				this.aClass293_1 = new Class293(this);
				this.aClass124_1 = new Class124(this);
				if (this.aClass124_1.method3489()) {
					this.aClass3_Sub4_Sub1_1 = new Class3_Sub4_Sub1(this);
					if (!this.aClass3_Sub4_Sub1_1.method3552()) {
						this.aClass3_Sub4_Sub1_1.method3537();
						this.aClass3_Sub4_Sub1_1 = null;
					}
				}
				this.aClass225_1 = new Class225(this);
				this.method378();
				this.method396();
				OpenGL.glClear(16640);
				local344 = 0;
				while (true) {
					try {
						this.anOpenGL1.swapBuffers();
						break;
					} catch (@Pc(601) Exception local601) {
						if (local344++ > 5) {
							throw new RuntimeException("");
						}
						Static327.method5231(100L);
					}
				}
				OpenGL.glClear(16384);
			} catch (@Pc(619) Throwable local619) {
				local619.printStackTrace();
				this.method7447();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ad", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(45) float local45;
		if (this.aClass11_Sub1_Sub1_1 == null || arg2 > this.aClass11_Sub1_Sub1_1.anInt569 || arg3 > this.aClass11_Sub1_Sub1_1.anInt564) {
			this.aClass11_Sub1_Sub1_1 = Static236.method1277(this, arg6, arg2, arg3);
			this.aClass11_Sub1_Sub1_1.method605(false, false);
			local41 = this.aClass11_Sub1_Sub1_1.aFloat30;
			local45 = this.aClass11_Sub1_Sub1_1.aFloat31;
		} else {
			this.aClass11_Sub1_Sub1_1.method610(arg3, arg2, arg6, false, 6406);
			local45 = this.aClass11_Sub1_Sub1_1.aFloat31 * (float) arg2 / (float) this.aClass11_Sub1_Sub1_1.anInt569;
			local41 = this.aClass11_Sub1_Sub1_1.aFloat30 * (float) arg3 / (float) this.aClass11_Sub1_Sub1_1.anInt564;
		}
		this.method451();
		this.method423(this.aClass11_Sub1_Sub1_1);
		this.method455(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method428(arg5);
		this.method448(34165, 34165);
		this.method419(34166, 0, 768);
		this.method419(5890, 2, 770);
		this.method461(34166, 0);
		this.method461(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = local147 + (float) arg2;
		@Pc(160) float local160 = (float) arg3 + local150;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local147, local160);
		OpenGL.glTexCoord2f(local41, local45);
		OpenGL.glVertex2f(local155, local160);
		OpenGL.glTexCoord2f(local41, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method419(5890, 0, 768);
		this.method419(34166, 2, 770);
		this.method461(5890, 0);
		this.method461(34166, 2);
	}

	@OriginalMember(owner = "client!ad", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt406;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	private void method378() {
		this.method414(-2);
		for (@Pc(14) int local14 = this.anInt396 - 1; local14 >= 0; local14--) {
			this.method397(local14);
			this.method423(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method448(8448, 8448);
		this.method419(34168, 2, 770);
		this.method446();
		this.anInt403 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt409 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean22 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean24 = true;
		this.method406(true);
		this.method454(true);
		this.method388(true);
		this.method413(true);
		this.method412();
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
		@Pc(129) float[] local129 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(131) int local131 = 0; local131 < 8; local131++) {
			@Pc(137) int local137 = local131 + 16384;
			OpenGL.glLightfv(local137, 4608, local129, 0);
			OpenGL.glLightf(local137, 4615, 0.0F);
			OpenGL.glLightf(local137, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt412 = this.anInt410 = -1;
		this.F();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIZ)V")
	public void method379(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		this.method380(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BZZI)V")
	public void method380(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt397 != arg2) {
			if (arg2 < 0) {
				this.method446();
				this.method423(null);
				this.method416(0);
				if (!this.aBoolean19) {
					this.aClass225_1.method5657(0, arg1, 0, arg0, 0);
				}
			} else {
				@Pc(13) Class11_Sub1 local13 = this.aClass171_1.method4642(arg2);
				@Pc(19) Class238 local19 = super.anInterface4_14.method6712(arg2);
				if (local19.aByte68 == 0 && local19.aByte69 == 0) {
					this.method446();
				} else {
					@Pc(35) int local35 = local19.aBoolean466 ? 64 : 128;
					@Pc(39) int local39 = local35 * 50;
					this.method382((float) (this.anInt377 % local39 * local19.aByte68) / (float) local39, (float) (this.anInt377 % local39 * local19.aByte69) / (float) local39, 0.0F);
				}
				if (this.aBoolean19) {
					this.method423(local13);
					this.method416(local19.anInt7127);
				} else {
					this.aClass225_1.method5657(local19.anInt7126, arg1, local19.aByte70, arg0, local19.aByte66);
					if (!this.aClass225_1.method5658(local19.anInt7127, local13)) {
						this.method423(local13);
						this.method416(local19.anInt7127);
					}
				}
			}
			this.anInt397 = arg2;
		}
		this.anInt400 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(Z)V")
	public void method381() {
		if (this.anInt400 == 8) {
			return;
		}
		this.method429();
		this.method406(true);
		this.method388(true);
		this.method413(true);
		this.method455(1);
		this.anInt400 = 8;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IFFF)V")
	private void method382(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean42) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean42 = true;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!gr;BLclient!gr;Lclient!gr;Lclient!gr;)V")
	public void method383(@OriginalArg(0) Class112 arg0, @OriginalArg(2) Class112 arg1, @OriginalArg(3) Class112 arg2, @OriginalArg(4) Class112 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method407(arg0.anInterface1_4);
			OpenGL.glVertexPointer(arg0.aByte36, arg0.aShort68, this.anInterface1_2.method7114(), this.anInterface1_2.method7112() + (long) arg0.aByte37);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method407(arg1.anInterface1_4);
			OpenGL.glNormalPointer(arg1.aShort68, this.anInterface1_2.method7114(), this.anInterface1_2.method7112() + (long) arg1.aByte37);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method407(arg2.anInterface1_4);
			OpenGL.glColorPointer(arg2.aByte36, arg2.aShort68, this.anInterface1_2.method7114(), this.anInterface1_2.method7112() + (long) arg2.aByte37);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method407(arg3.anInterface1_4);
			OpenGL.glTexCoordPointer(arg3.aByte36, arg3.aShort68, this.anInterface1_2.method7114(), this.anInterface1_2.method7112() + (long) arg3.aByte37);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "()F")
	public float method384() {
		return this.aFloat19;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	private void method385() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL1.b()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static327.method5231(1000L);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!il;B)V")
	public void method386(@OriginalArg(0) Interface10 arg0) {
		if (arg0 != this.anInterface10_1) {
			if (this.aBoolean21) {
				OpenGL.glBindBufferARB(34963, arg0.method5400());
			}
			this.anInterface10_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "(IIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt416 = arg3;
		this.anInt411 = arg0;
		this.anInt384 = arg2;
		this.anInt407 = arg1;
		this.method441();
		this.method401();
		if (this.anInt420 == 3) {
			this.method404();
		} else if (this.anInt420 == 2) {
			this.method430();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!sda;I)V")
	@Override
	public void method7468(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) Class4_Sub7[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method5774(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7442(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas2 == arg0) {
			local5 = this.aLong9;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas1 == arg0) {
			this.method396();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)V")
	public void method387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt419 = arg0;
		this.anInt402 = arg1;
		this.method421();
		this.method417();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)V")
	public void method388(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean41 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt400 &= 0xFFFFFFE0;
		this.aBoolean41 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "()V")
	@Override
	public void k() {
		this.aBoolean19 = false;
		this.aClass225_1.method5657(0, false, 0, false, 0);
		this.method410();
		this.method399();
	}

	@OriginalMember(owner = "client!ad", name = "JA", descriptor = "(I)V")
	@Override
	public void JA(@OriginalArg(0) int arg0) {
		this.anInt375 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt375++;
		}
		this.anInt376 = 0x1 << this.anInt375;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLclient!im;)V")
	public void method389(@OriginalArg(1) Interface11 arg0) {
		if (this.aBoolean29) {
			this.method460(arg0);
			this.method458(arg0);
		} else if (this.anInt379 >= 0 && arg0 == this.anInterface11Array1[this.anInt379]) {
			this.anInterface11Array1[this.anInt379--] = null;
			arg0.method3965();
			if (this.anInt379 < 0) {
				this.anInterface11_2 = this.anInterface11_1 = null;
			} else {
				this.anInterface11_2 = this.anInterface11_1 = this.anInterface11Array1[this.anInt379];
				this.anInterface11_2.method3966();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "(I)V")
	public void method390() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[Lclient!oj;)V")
	@Override
	public void method7460(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub30[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub30Array1[local7] = arg1[local7];
		}
		this.anInt385 = arg0;
		if (this.anInt420 != 1) {
			this.method392();
		}
	}

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "()V")
	@Override
	public void method7444() {
		this.method413(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIBLclient!il;)V")
	public void method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Interface10 arg2) {
		@Pc(15) int local15 = arg2.method5403();
		@Pc(22) int local22 = arg0 * this.method438(local15);
		this.method386(arg2);
		OpenGL.glDrawElements(4, arg1, local15, arg2.method5401() + (long) local22);
	}

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "(I)V")
	private void method392() {
		@Pc(19) int local19;
		for (local19 = 0; local19 < this.anInt385; local19++) {
			@Pc(26) Class3_Sub30 local26 = this.aClass3_Sub30Array1[local19];
			@Pc(30) int local30 = local19 + 16386;
			Static38.aFloatArray5[0] = local26.method5386();
			Static38.aFloatArray5[1] = local26.method5390();
			Static38.aFloatArray5[2] = local26.method5388();
			Static38.aFloatArray5[3] = 1.0F;
			OpenGL.glLightfv(local30, 4611, Static38.aFloatArray5, 0);
			@Pc(64) int local64 = local26.method5391();
			@Pc(70) float local70 = local26.method5382() / 255.0F;
			Static38.aFloatArray5[0] = (float) (local64 >> 16 & 0xFF) * local70;
			Static38.aFloatArray5[1] = (float) (local64 >> 8 & 0xFF) * local70;
			Static38.aFloatArray5[2] = local70 * (float) (local64 & 0xFF);
			OpenGL.glLightfv(local30, 4609, Static38.aFloatArray5, 0);
			OpenGL.glLightf(local30, 4617, 1.0F / (float) (local26.method5387() * local26.method5387()));
			OpenGL.glEnable(local30);
		}
		while (this.anInt388 > local19) {
			OpenGL.glDisable(local19 + 16386);
			local19++;
		}
		this.anInt388 = this.anInt385;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
	public void method393() {
		if (this.anInt400 == 16) {
			return;
		}
		this.method463();
		this.method406(true);
		this.method388(true);
		this.method413(true);
		this.method455(1);
		this.anInt400 = 16;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class10 method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static56.method1149(arg2, arg1, this, arg3, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method437();
		this.method455(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean34) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean34) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!im;Z)V")
	public void method394(@OriginalArg(0) Interface11 arg0) {
		if (this.aBoolean29) {
			this.method431(arg0);
			this.method459(arg0);
		} else if (this.anInt379 < 3) {
			if (this.anInt379 >= 0) {
				this.anInterface11Array1[this.anInt379].method3965();
			}
			this.anInterface11_2 = this.anInterface11_1 = this.anInterface11Array1[++this.anInt379] = arg0;
			this.anInterface11_2.method3966();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "()F")
	public float method395() {
		return this.aFloat10;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
	private void method396() {
		if (this.aCanvas1 == null) {
			this.anInt230 = this.anInt246 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas1.getSize();
			this.anInt246 = local10.height;
			this.anInt230 = local10.width;
		}
		if (this.anInterface11_1 == null) {
			this.anInt264 = this.anInt230;
			this.anInt256 = this.anInt246;
			this.method421();
		}
		this.method412();
		this.F();
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(IIIII)V")
	@Override
	public void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method437();
		this.method455(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "()V")
	@Override
	public void F() {
		this.anInt413 = 0;
		this.anInt392 = 0;
		this.anInt408 = this.anInt256;
		this.anInt414 = this.anInt264;
		OpenGL.glDisable(3089);
		this.method401();
	}

	@OriginalMember(owner = "client!ad", name = "ya", descriptor = "(IIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method437();
		this.method455(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
	public void method397(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt389) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt389 = arg0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class52 method7432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class52_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!be;)V")
	@Override
	public void method7429(@OriginalArg(0) Class26 arg0) {
		this.aClass128_1.method3583(arg0, this);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([BIIBZ)Lclient!il;")
	public Interface10 method398(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean arg2) {
		return (Interface10) (this.aBoolean21 && (!arg2 || this.aBoolean17) ? new Class51_Sub1(this, 5123, arg0, arg1, arg2) : new Class33_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ba;Lclient!be;Lclient!q;Lclient!sda;I)V")
	@Override
	public void method7464(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class4_Sub7 arg3, @OriginalArg(4) int arg4) {
		arg0.method5774(arg2, arg3, arg4);
		this.method7429(arg1);
	}

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "(I)V")
	private void method399() {
		if (this.aBoolean30 && this.anInt398 >= 0 | this.aBoolean19) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ad", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt412 != arg0;
		if (local11 || arg1 != this.aFloat27 || arg2 != this.aFloat23) {
			this.anInt412 = arg0;
			this.aFloat27 = arg1;
			this.aFloat23 = arg2;
			if (local11) {
				this.aFloat6 = (float) (this.anInt412 & 0xFF0000) / 1.671168E7F;
				this.aFloat14 = (float) (this.anInt412 & 0xFF00) / 65280.0F;
				this.aFloat18 = (float) (this.anInt412 & 0xFF) / 255.0F;
				this.method434();
			}
			this.method424();
		}
		if (arg3 == this.aFloatArray1[0] && arg4 == this.aFloatArray1[1] && arg5 == this.aFloatArray1[2]) {
			return;
		}
		this.aFloatArray1[2] = arg5;
		this.aFloatArray1[1] = arg4;
		this.aFloatArray1[0] = arg3;
		this.aFloatArray3[2] = -arg5;
		this.aFloatArray3[1] = -arg4;
		this.aFloatArray3[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.bf[1] = arg4 * local138;
		this.bf[0] = arg3 * local138;
		this.bf[2] = arg5 * local138;
		this.aFloatArray2[2] = -this.bf[2];
		this.aFloatArray2[0] = -this.bf[0];
		this.aFloatArray2[1] = -this.bf[1];
		this.method449();
		this.anInt404 = (int) (arg3 * 256.0F / arg4);
		this.anInt417 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)I")
	@Override
	public int method7435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "()V")
	@Override
	public void method7453() {
		this.aClass124_1.method3486();
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(Z)V")
	private void method400() {
		OpenGL.glDepthMask(this.aBoolean27 && this.aBoolean32);
	}

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "(I)V")
	private void method401() {
		this.aFloat13 = this.anInt392 - this.anInt411;
		this.aFloat20 = this.anInt408 - this.anInt407;
		this.aFloat28 = this.anInt413 - this.anInt407;
		this.aFloat9 = this.anInt414 - this.anInt411;
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "()Z")
	@Override
	public boolean method7423() {
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "(I)V")
	public void method403() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "()Lclient!nl;")
	@Override
	public Class207 method7430() {
		@Pc(7) int local7 = -1;
		if (this.aString5.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString5.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString5.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class207(local7, "OpenGL", this.anInt395, this.aString4, 0L);
	}

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "(I)V")
	private void method404() {
		@Pc(15) float local15 = (float) -this.anInt411 * this.aFloat26 / (float) this.anInt384;
		@Pc(27) float local27 = this.aFloat26 * (float) -this.anInt407 / (float) this.anInt416;
		@Pc(42) float local42 = this.aFloat26 * (float) (this.anInt264 - this.anInt411) / (float) this.anInt384;
		@Pc(57) float local57 = (float) (this.anInt256 - this.anInt407) * this.aFloat26 / (float) this.anInt416;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local57 != local27) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) ((float) this.anInt406 - this.aFloat10), (double) ((float) this.anInt386 - this.aFloat10));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ad", name = "aa", descriptor = "()I")
	@Override
	public int aa() {
		@Pc(6) int local6 = this.anInt421;
		this.anInt421 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7436() {
		this.method437();
		this.method455(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass124_1.method3483(arg1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)V")
	public void method406(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean30 != arg0) {
			this.aBoolean30 = arg0;
			this.method399();
			this.anInt400 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V")
	@Override
	public void method7446(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class10 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class10_Sub3 local6 = (Class10_Sub3) arg5;
		@Pc(9) Class11_Sub1_Sub1 local9 = local6.aClass11_Sub1_Sub1_5;
		this.method451();
		this.method423(local6.aClass11_Sub1_Sub1_5);
		this.method455(1);
		this.method448(8448, 7681);
		this.method419(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat31 / (float) local9.anInt580;
		@Pc(46) float local46 = local9.aFloat30 / (float) local9.anInt582;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(59) float local59 = (float) arg3 - (float) arg1;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local53 * local53)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(91) float local91 = local53 * local72;
		@Pc(95) float local95 = local59 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local91 + 0.35F, (float) arg3 + local95 + 0.35F);
		OpenGL.glEnd();
		this.method419(5890, 0, 768);
	}

	@OriginalMember(owner = "client!ad", name = "sa", descriptor = "(II)V")
	@Override
	public void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt406 && this.anInt386 == arg1) {
			return;
		}
		this.anInt406 = arg0;
		this.anInt386 = arg1;
		this.method441();
		this.method410();
		if (this.anInt420 == 3) {
			this.method404();
		} else if (this.anInt420 == 2) {
			this.method430();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!bo;I)V")
	public void method407(@OriginalArg(0) Interface1 arg0) {
		if (arg0 != this.anInterface1_2) {
			if (this.aBoolean21) {
				OpenGL.glBindBufferARB(34962, arg0.method7111());
			}
			this.anInterface1_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean19 = true;
		this.anInt405 = arg2;
		this.anInt415 = arg0;
		this.anInt393 = arg1;
		this.anInt387 = arg3;
		this.aClass225_1.method5657(0, false, 3, false, 0);
		this.aClass225_1.aClass56_Sub6_1.method5877();
		this.method410();
		this.method399();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(FFZ)V")
	public void method408(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat8 = arg1;
		this.aFloat11 = arg0;
		if (!this.aBoolean19) {
			this.method410();
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IIII)V")
	public void method409(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "(I)V")
	private void method410() {
		@Pc(15) int local15;
		if (this.aBoolean19) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt393;
		} else {
			this.aFloat22 = (float) (this.anInt386 - this.anInt391) - this.aFloat8;
			this.aFloat24 = this.aFloat22 - (float) this.anInt398 * this.aFloat11;
			if (this.aFloat24 < (float) this.anInt406) {
				this.aFloat24 = this.anInt406;
			}
			OpenGL.glFogf(2915, this.aFloat24);
			OpenGL.glFogf(2916, this.aFloat22);
			local15 = this.anInt410;
		}
		Static47.aFloatArray73[1] = (float) (local15 & 0xFF00) / 65280.0F;
		Static47.aFloatArray73[2] = (float) (local15 & 0xFF) / 255.0F;
		Static47.aFloatArray73[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static47.aFloatArray73, 0);
		if (this.aBoolean19) {
			this.aClass225_1.aClass56_Sub6_1.method5874();
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)I")
	public int method411(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
	@Override
	public void method7463(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt365 = arg0;
		this.aClass171_1.method4643();
	}

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "()V")
	@Override
	public void method7449() throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.method455(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!dw;)V")
	@Override
	public void method7485(@OriginalArg(0) Class66 arg0) {
		this.aClass66_Sub1_1 = (Class66_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "()V")
	@Override
	public void method7413() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V")
	public void method412() {
		if (this.anInt420 != 0) {
			this.anInt400 &= 0xFFFFFFE0;
			this.anInt420 = 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IZ)V")
	public void method413(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean27 != arg0) {
			this.aBoolean27 = arg0;
			this.method400();
			this.anInt400 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIII)Lclient!dw;")
	@Override
	public Class66 method7415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean20 ? new Class66_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)V")
	public void method414(@OriginalArg(0) int arg0) {
		this.method379(arg0, true);
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "(IIIII)V")
	@Override
	protected void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt392 || arg0 - arg2 > this.anInt414 || this.anInt413 > arg2 + arg1 || this.anInt408 < arg1 - arg2) {
			return;
		}
		this.method437();
		this.method455(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(76) float local76 = (float) arg0 + 0.35F;
		@Pc(81) float local81 = (float) arg1 + 0.35F;
		@Pc(85) int local85 = arg2 << 1;
		if (this.aFloat17 > (float) local85) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local76 + 1.0F, local81 + 1.0F);
			OpenGL.glVertex2f(local76 + 1.0F, -1.0F + local81);
			OpenGL.glVertex2f(local76 - 1.0F, -1.0F + local81);
			OpenGL.glVertex2f(local76 - 1.0F, local81 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local85 <= this.aFloat12) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local85);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local76, local81);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local76, local81);
			@Pc(140) int local140 = 262144 / (arg2 * 6);
			if (local140 <= 64) {
				local140 = 64;
			} else if (local140 > 512) {
				local140 = 512;
			}
			local140 = Static27.method797(local140);
			OpenGL.glVertex2f((float) arg2 + local76, local81);
			for (@Pc(166) int local166 = 16384 - local140; local166 > 0; local166 -= local140) {
				OpenGL.glVertex2f(local76 + Class6_Sub4_Sub2.aFloatArray38[local166] * (float) arg2, local81 + (float) arg2 * Class6_Sub4_Sub2.aFloatArray37[local166]);
			}
			OpenGL.glVertex2f(local76 + (float) arg2, local81);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "()Z")
	@Override
	public boolean method7480() {
		return false;
	}

	@OriginalMember(owner = "client!ad", name = "na", descriptor = "(III[I)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass205_Sub3_4.aFloat272 + (float) arg2 * this.aClass205_Sub3_4.aFloat276 + (float) arg1 * this.aClass205_Sub3_4.aFloat275 + (float) arg0 * this.aClass205_Sub3_4.aFloat278;
		if ((float) this.anInt406 > local28 || (float) this.anInt386 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass205_Sub3_4.aFloat279 + (float) arg2 * this.aClass205_Sub3_4.aFloat281 + (float) arg1 * this.aClass205_Sub3_4.aFloat274 + this.aClass205_Sub3_4.aFloat273 * (float) arg0) * (float) this.anInt384 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt416 * (this.aClass205_Sub3_4.aFloat271 + (float) arg1 * this.aClass205_Sub3_4.aFloat280 + this.aClass205_Sub3_4.aFloat270 * (float) arg0 + this.aClass205_Sub3_4.aFloat277 * (float) arg2) / local28);
		if (this.aFloat13 <= (float) local85 && (float) local85 <= this.aFloat9 && (float) local117 >= this.aFloat28 && this.aFloat20 >= (float) local117) {
			arg3[0] = (int) ((float) local85 - this.aFloat13);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat28);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "()Z")
	@Override
	public boolean method7472() {
		if (this.aClass3_Sub4_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub4_Sub1_1.method3542()) {
			if (!this.aClass124_1.method3488(this.aClass3_Sub4_Sub1_1)) {
				return false;
			}
			this.aClass171_1.method4643();
		}
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class10_Sub3 local6 = (Class10_Sub3) arg1;
		@Pc(9) Class11_Sub1_Sub1 local9 = local6.aClass11_Sub1_Sub1_5;
		this.method451();
		this.method423(local6.aClass11_Sub1_Sub1_5);
		this.method455(1);
		this.method448(8448, 7681);
		this.method419(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat31 / (float) local9.anInt580;
		@Pc(46) float local46 = local9.aFloat30 / (float) local9.anInt582;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt392 - arg2), (float) (this.anInt413 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt392, this.anInt413);
		OpenGL.glTexCoord2f((float) (this.anInt392 - arg2) * local39, local46 * (float) (this.anInt408 - arg3));
		OpenGL.glVertex2i(this.anInt392, this.anInt408);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt414 - arg2), local46 * (float) (this.anInt408 - arg3));
		OpenGL.glVertex2i(this.anInt414, this.anInt408);
		OpenGL.glTexCoord2f((float) (this.anInt414 - arg2) * local39, (float) (this.anInt413 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt414, this.anInt413);
		OpenGL.glEnd();
		this.method419(5890, 0, 768);
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)V")
	public void method416(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method448(7681, 7681);
		} else if (arg0 == 0) {
			this.method448(8448, 8448);
		} else if (arg0 == 2) {
			this.method448(7681, 34165);
		} else if (arg0 == 3) {
			this.method448(8448, 260);
		} else if (arg0 == 4) {
			this.method448(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "(IIIIII)V")
	@Override
	public void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method437();
		this.method455(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean34) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean34) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(B)V")
	private void method417() {
		if (this.anInt414 >= this.anInt392 && this.anInt408 >= this.anInt413) {
			OpenGL.glScissor(this.anInt392 + this.anInt402, -this.anInt408 + this.anInt419 - -this.anInt256, this.anInt414 - this.anInt392, -this.anInt413 + this.anInt408);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "()V")
	@Override
	public void method7471() {
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7424(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "(I)V")
	public void method418() {
		if (this.anInt400 == 4) {
			return;
		}
		this.method447();
		this.method406(false);
		this.method454(false);
		this.method388(false);
		this.method413(false);
		this.method414(-2);
		this.method455(1);
		this.anInt400 = 4;
	}

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt414 > arg2) {
			this.anInt414 = arg2;
		}
		if (this.anInt413 < arg1) {
			this.anInt413 = arg1;
		}
		if (this.anInt392 < arg0) {
			this.anInt392 = arg0;
		}
		if (this.anInt408 > arg3) {
			this.anInt408 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method401();
		this.method417();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIB)V")
	public void method419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "()Lclient!q;")
	@Override
	public Class205 method7448() {
		return this.aClass205_Sub3_1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7469(@OriginalArg(0) Class205 arg0) {
		this.aClass205_Sub3_4 = (Class205_Sub3) arg0;
		this.aClass205_Sub3_3.method7805(this.aClass205_Sub3_4);
		if (this.anInt420 != 1) {
			this.method433();
		}
	}

	@OriginalMember(owner = "client!ad", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return this.anInt386;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "()Z")
	@Override
	public boolean method7421() {
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!cq;[Lclient!af;Z)Lclient!ta;")
	@Override
	public Class59 method7414(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class9[] arg1) {
		return new Class59_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7422(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = null;
		this.aLong8 = 0L;
		if (arg0 == null || this.aCanvas2 == arg0) {
			this.aCanvas1 = this.aCanvas2;
			this.aLong8 = this.aLong9;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable1.get(arg0);
			this.aLong8 = local36;
			this.aCanvas1 = arg0;
		}
		if (this.aCanvas1 == null || this.aLong8 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong8);
		this.method396();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7410(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static174.aFloat137 = arg0;
		Static5.aFloat29 = arg2;
		Static62.aFloat251 = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BJ)V")
	public synchronized void method420(@OriginalArg(1) long arg0) {
		@Pc(7) Class3 local7 = new Class3();
		local7.aLong285 = arg0;
		this.aClass71_8.method2076(local7);
	}

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "(I)V")
	private void method421() {
		OpenGL.glViewport(this.anInt402, this.anInt419, this.anInt264, this.anInt256);
	}

	@OriginalMember(owner = "client!ad", name = "ca", descriptor = "(IIII)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt264) {
			arg2 = this.anInt264;
		}
		if (this.anInt256 < arg3) {
			arg3 = this.anInt256;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt413 = arg1;
		this.anInt414 = arg2;
		this.anInt408 = arg3;
		this.anInt392 = arg0;
		OpenGL.glEnable(3089);
		this.method401();
		this.method417();
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(Z)V")
	private void method422() {
		this.anOpenGL1.a();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!pm;)V")
	public void method423(@OriginalArg(1) Class11 arg0) {
		@Pc(18) Class11 local18 = this.aClass11Array1[this.anInt389];
		if (arg0 != local18) {
			if (arg0 == null) {
				OpenGL.glDisable(local18.anInt8884);
			} else {
				if (local18 == null) {
					OpenGL.glEnable(arg0.anInt8884);
				} else if (local18.anInt8884 != arg0.anInt8884) {
					OpenGL.glDisable(local18.anInt8884);
					OpenGL.glEnable(arg0.anInt8884);
				}
				OpenGL.glBindTexture(arg0.anInt8884, arg0.method7300());
			}
			this.aClass11Array1[this.anInt389] = arg0;
		}
		this.anInt400 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ad", name = "LA", descriptor = "(IIII)V")
	@Override
	public void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean19) {
			throw new RuntimeException("");
		}
		this.anInt415 = arg0;
		this.anInt405 = arg2;
		this.anInt387 = arg3;
		this.anInt393 = arg1;
		this.aClass225_1.aClass56_Sub6_1.method5877();
		this.method410();
	}

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "(I)V")
	private void method424() {
		Static47.aFloatArray73[0] = this.aFloat6 * this.aFloat27;
		Static47.aFloatArray73[3] = 1.0F;
		Static47.aFloatArray73[2] = this.aFloat18 * this.aFloat27;
		Static47.aFloatArray73[1] = this.aFloat27 * this.aFloat14;
		OpenGL.glLightfv(16384, 4609, Static47.aFloatArray73, 0);
		Static47.aFloatArray73[2] = -this.aFloat23 * this.aFloat18;
		Static47.aFloatArray73[3] = 1.0F;
		Static47.aFloatArray73[0] = -this.aFloat23 * this.aFloat6;
		Static47.aFloatArray73[1] = this.aFloat14 * -this.aFloat23;
		OpenGL.glLightfv(16385, 4609, Static47.aFloatArray73, 0);
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(B)V")
	private void method425() {
		if (this.aFloat10 == 0.0F) {
			this.aFloatArray4[10] = this.aFloat15;
			this.aFloatArray4[14] = this.aFloat16;
		} else {
			@Pc(27) float local27 = this.aFloat19 / (this.aFloat10 + this.aFloat19);
			@Pc(31) float local31 = local27 * local27;
			@Pc(46) float local46 = (1.0F - local27) * -this.aFloat16 * (1.0F - local27) / this.aFloat10;
			this.aFloatArray4[10] = this.aFloat15 + local46;
			this.aFloatArray4[14] = local31 * this.aFloat16;
		}
		this.aFloat21 = (float) this.anInt386 - this.aFloat10;
		this.aFloat25 = ((float) -this.anInt386 + this.aFloatArray4[14]) / this.aFloatArray4[10];
	}

	@OriginalMember(owner = "client!ad", name = "X", descriptor = "(III)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt410 && arg1 == this.anInt398 && arg2 == this.anInt391) {
			return;
		}
		this.anInt391 = arg2;
		this.anInt398 = arg1;
		this.anInt410 = arg0;
		if (this.aBoolean19) {
			return;
		}
		this.method410();
		this.method399();
	}

	@OriginalMember(owner = "client!ad", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt256 - arg1 - local12, arg2, 1, 32993, this.anInt418, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!af;Z)Lclient!xa;")
	@Override
	public Class119 method7425(@OriginalArg(0) Class9 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt481 * arg0.anInt478];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray12 == null) {
			for (local21 = 0; local21 < arg0.anInt481; local21++) {
				for (local25 = 0; local25 < arg0.anInt478; local25++) {
					@Pc(38) int local38 = arg0.anIntArray90[arg0.aByteArray13[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt481; local21++) {
				for (local25 = 0; local25 < arg0.anInt478; local25++) {
					local12[local16++] = arg0.aByteArray12[local14] << 24 | arg0.anIntArray90[arg0.aByteArray13[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(111) Class119 local111 = this.method7483(local12, arg0.anInt478, arg0.anInt478, arg0.anInt481);
		local111.EA(arg0.anInt476, arg0.anInt477, arg0.anInt480, arg0.anInt479);
		return local111;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	@Override
	public void method7438(@OriginalArg(0) int arg0) {
		this.method385();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class205 method7409() {
		return new Class205_Sub3();
	}

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "()V")
	@Override
	protected void method7447() {
		for (@Pc(6) Class3 local6 = this.aClass71_1.method2089(); local6 != null; local6 = this.aClass71_1.method2086()) {
			((Class3_Sub22_Sub2) local6).method6465();
		}
		if (this.aClass124_1 != null) {
			this.aClass124_1.method3479();
		}
		if (this.anOpenGL1 != null) {
			this.method422();
			@Pc(40) Enumeration local40 = this.aHashtable1.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable1.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean15) {
			Static390.method5973(true, false);
			this.aBoolean15 = false;
		}
	}

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "()Z")
	@Override
	public boolean method7439() {
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "()Z")
	@Override
	public boolean method7452() {
		return this.aClass3_Sub4_Sub1_1 != null && (this.anInt362 <= 1 || this.aBoolean37);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZILclient!jaclib/memory/Buffer;ZI)Lclient!bo;")
	public Interface1 method426(@OriginalArg(1) int arg0, @OriginalArg(2) Buffer arg1, @OriginalArg(4) int arg2) {
		return (Interface1) (this.aBoolean21 ? new Class51_Sub2(this, arg2, arg1, arg0, false) : new Class33_Sub1(this, arg2, arg1));
	}

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "(I)V")
	private void method427() {
		if (this.aBoolean23 && !this.aBoolean25) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class119 method7457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class119_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "()Z")
	@Override
	public boolean method7462() {
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class119 method7483(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class119_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	@Override
	public void method7412(@OriginalArg(0) boolean arg0) {
		this.aBoolean32 = arg0;
		this.method400();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([Lclient!ba;Lclient!be;Lclient!q;[Lclient!sda;I)V")
	@Override
	public void method7478(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class4_Sub7[] arg3, @OriginalArg(4) int arg4) {
		this.method7468(arg0, arg2, arg3, arg4);
		this.method7429(arg1);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7419(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7427(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub47 local19;
		while (!this.aClass71_3.method2085()) {
			local19 = (Class3_Sub47) this.aClass71_3.method2084();
			Static103.anIntArray242[local11++] = (int) local19.aLong285;
			this.anInt381 -= local19.anInt8701;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static103.anIntArray242, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static103.anIntArray242, 0);
			local11 = 0;
		}
		while (!this.aClass71_4.method2085()) {
			local19 = (Class3_Sub47) this.aClass71_4.method2084();
			Static103.anIntArray242[local11++] = (int) local19.aLong285;
			this.anInt382 -= local19.anInt8701;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static103.anIntArray242, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static103.anIntArray242, 0);
			local11 = 0;
		}
		while (!this.aClass71_5.method2085()) {
			local19 = (Class3_Sub47) this.aClass71_5.method2084();
			Static103.anIntArray242[local11++] = local19.anInt8701;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static103.anIntArray242, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static103.anIntArray242, 0);
			local11 = 0;
		}
		while (!this.aClass71_6.method2085()) {
			local19 = (Class3_Sub47) this.aClass71_6.method2084();
			Static103.anIntArray242[local11++] = (int) local19.aLong285;
			this.anInt383 -= local19.anInt8701;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static103.anIntArray242, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static103.anIntArray242, 0);
		}
		while (!this.aClass71_2.method2085()) {
			local19 = (Class3_Sub47) this.aClass71_2.method2084();
			OpenGL.glDeleteLists((int) local19.aLong285, local19.anInt8701);
		}
		@Pc(214) Class3 local214;
		while (!this.aClass71_7.method2085()) {
			local214 = this.aClass71_7.method2084();
			OpenGL.glDeleteProgramARB((int) local214.aLong285);
		}
		while (!this.aClass71_8.method2085()) {
			local214 = this.aClass71_8.method2084();
			OpenGL.glDeleteObjectARB(local214.aLong285);
		}
		while (!this.aClass71_2.method2085()) {
			local19 = (Class3_Sub47) this.aClass71_2.method2084();
			OpenGL.glDeleteLists((int) local19.aLong285, local19.anInt8701);
		}
		this.aClass171_1.method4638();
		if (this.v() > 100663296 && Static12.method647() > this.aLong10 + 60000L) {
			System.gc();
			this.aLong10 = Static12.method647();
		}
		this.anInt377 = local9;
	}

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "()I")
	@Override
	public int method7479() {
		return 4;
	}

	@OriginalMember(owner = "client!ad", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		@Pc(6) int local6 = this.anInt422;
		this.anInt422 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(BI)V")
	public void method428(@OriginalArg(1) int arg0) {
		Static47.aFloatArray73[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static47.aFloatArray73[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static47.aFloatArray73[3] = (float) (arg0 >>> 24) / 255.0F;
		Static47.aFloatArray73[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static47.aFloatArray73, 0);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method437();
		this.method455(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 - (float) arg1;
		@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local23 * local23)));
		@Pc(40) float local40 = local17 * local36;
		@Pc(44) float local44 = local23 * local36;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local40 + 0.35F, (float) arg3 + local44 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "(I)V")
	private void method429() {
		if (this.anInt420 != 2) {
			this.anInt420 = 2;
			this.method430();
			this.method433();
			this.anInt400 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "(B)V")
	private void method430() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray4, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(ZLclient!im;)V")
	public void method431(@OriginalArg(1) Interface11 arg0) {
		if (this.anInt378 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt378 >= 0) {
			this.anInterface11Array3[this.anInt378].method3967();
		}
		this.anInterface11_2 = this.anInterface11Array3[++this.anInt378] = arg0;
		this.anInterface11_2.method3968();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(FI)V")
	public void method432(@OriginalArg(0) float arg0) {
		if (this.aFloat26 == arg0) {
			return;
		}
		this.aFloat26 = arg0;
		if (this.anInt420 == 3) {
			this.method404();
			return;
		}
	}

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "(B)V")
	private void method433() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass205_Sub3_4.method7810(), 0);
		if (this.aBoolean19) {
			this.aClass225_1.aClass56_Sub6_1.method5877();
		}
		this.method449();
		this.method392();
	}

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "()Z")
	@Override
	public boolean method7431() {
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "(I)V")
	private void method434() {
		Static47.aFloatArray73[1] = this.aFloat7 * this.aFloat14;
		Static47.aFloatArray73[0] = this.aFloat7 * this.aFloat6;
		Static47.aFloatArray73[3] = 1.0F;
		Static47.aFloatArray73[2] = this.aFloat18 * this.aFloat7;
		OpenGL.glLightModelfv(2899, Static47.aFloatArray73, 0);
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(II)V")
	public synchronized void method435(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub47 local8 = new Class3_Sub47(arg0);
		this.aClass71_5.method2076(local8);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BZ)V")
	public void method436(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean25) {
			this.aBoolean25 = arg0;
			this.method427();
		}
	}

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "()Z")
	@Override
	public boolean method7445() {
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "(I)V")
	private void method437() {
		if (this.anInt400 == 1) {
			return;
		}
		this.method447();
		this.method406(false);
		this.method454(false);
		this.method388(false);
		this.method413(false);
		this.method423(null);
		this.method414(-2);
		this.method416(1);
		this.anInt400 = 1;
	}

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "()Z")
	@Override
	public boolean method7473() {
		return false;
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(II)I")
	public int method438(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!dw;Lclient!dw;FLclient!dw;)Lclient!dw;")
	@Override
	public Class66 method7450(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class66 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean20 && this.aBoolean43) {
			@Pc(15) Class66_Sub1_Sub2 local15 = null;
			@Pc(18) Class66_Sub1 local18 = (Class66_Sub1) arg0;
			@Pc(21) Class66_Sub1 local21 = (Class66_Sub1) arg1;
			@Pc(25) Class11_Sub4 local25 = local18.method4936();
			@Pc(29) Class11_Sub4 local29 = local21.method4936();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt8895 < local25.anInt8895 ? local25.anInt8895 : local29.anInt8895;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class66_Sub1_Sub2) {
					@Pc(56) Class66_Sub1_Sub2 local56 = (Class66_Sub1_Sub2) arg3;
					if (local44 == local56.method4946()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class66_Sub1_Sub2(this, local44);
				}
				if (local15.method4945(local29, arg2, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "(I)V")
	private void method439() {
		this.aClass205_Sub3_4 = new Class205_Sub3();
		this.aClass205_Sub3_3 = new Class205_Sub3();
		this.aClass11Array1 = new Class11[this.anInt396];
		this.aClass11_Sub1_1 = new Class11_Sub1(this, 3553, 6408, 1, 1);
		new Class11_Sub1(this, 3553, 6408, 1, 1);
		new Class11_Sub1(this, 3553, 6408, 1, 1);
		this.aClass2_Sub2_5 = new Class2_Sub2(this);
		this.aClass2_Sub2_4 = new Class2_Sub2(this);
		this.aClass2_Sub2_8 = new Class2_Sub2(this);
		this.aClass2_Sub2_10 = new Class2_Sub2(this);
		this.aClass2_Sub2_6 = new Class2_Sub2(this);
		this.aClass2_Sub2_9 = new Class2_Sub2(this);
		this.aClass2_Sub2_7 = new Class2_Sub2(this);
		this.aClass2_Sub2_2 = new Class2_Sub2(this);
		this.aClass2_Sub2_3 = new Class2_Sub2(this);
		this.aClass2_Sub2_1 = new Class2_Sub2(this);
		if (this.aBoolean43) {
			this.aClass141_1 = new Class141(this);
			new Class141(this);
		}
	}

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "(I)I")
	private int method440() {
		this.aString5 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString4 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString5.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString5.indexOf("brian paul") != -1 || this.aString5.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static439.method6626(' ', local45.replace('.', ' '));
		if (local53.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(69) int local69 = Static454.method6837(local53[0]);
				@Pc(75) int local75 = Static454.method6837(local53[1]);
				this.anInt395 = local75 + local69 * 10;
			} catch (@Pc(84) NumberFormatException local84) {
				local10 |= 0x4;
			}
		}
		if (this.anInt395 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(118) int[] local118 = new int[1];
		OpenGL.glGetIntegerv(34018, local118, 0);
		this.anInt396 = local118[0];
		OpenGL.glGetIntegerv(34929, local118, 0);
		this.anInt390 = local118[0];
		OpenGL.glGetIntegerv(34930, local118, 0);
		this.anInt394 = local118[0];
		if (this.anInt396 < 2 || this.anInt390 < 2 || this.anInt394 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean39 = Stream.c();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean21 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean34 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean38 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean18 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean36 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean33 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean40 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean20 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean35 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean31 = false;
		this.aBoolean43 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean29 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean16 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean37 = this.aBoolean16 & this.aBoolean29;
		OpenGL.glGetFloatv(2834, Static47.aFloatArray73, 0);
		this.aFloat12 = Static47.aFloatArray73[1];
		this.aFloat17 = Static47.aFloatArray73[0];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "(B)V")
	private void method441() {
		@Pc(6) float[] local6 = this.aFloatArray4;
		@Pc(26) float local26 = (float) (this.anInt406 * -this.anInt411) / (float) this.anInt384;
		@Pc(41) float local41 = (float) ((this.anInt264 - this.anInt411) * this.anInt406) / (float) this.anInt384;
		@Pc(52) float local52 = (float) (this.anInt407 * this.anInt406) / (float) this.anInt416;
		@Pc(66) float local66 = (float) ((this.anInt407 - this.anInt256) * this.anInt406) / (float) this.anInt416;
		if (local26 == local41 || local66 == local52) {
			local6[2] = 0.0F;
			local6[9] = 0.0F;
			local6[10] = 1.0F;
			local6[8] = 0.0F;
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[5] = 1.0F;
			local6[13] = 0.0F;
			local6[15] = 1.0F;
			local6[1] = 0.0F;
			local6[11] = 0.0F;
			local6[0] = 1.0F;
			local6[6] = 0.0F;
			local6[12] = 0.0F;
			local6[7] = 0.0F;
			local6[14] = 0.0F;
		} else {
			@Pc(80) float local80 = (float) this.anInt406 * 2.0F;
			local6[15] = 0.0F;
			local6[0] = local80 / (local41 - local26);
			local6[10] = this.aFloat15 = (float) -(this.anInt406 + this.anInt386) / (float) (this.anInt386 - this.anInt406);
			local6[7] = 0.0F;
			local6[9] = (local52 + local66) / (local52 - local66);
			local6[12] = 0.0F;
			local6[1] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = local80 / (local52 - local66);
			local6[6] = 0.0F;
			local6[2] = 0.0F;
			local6[4] = 0.0F;
			local6[11] = -1.0F;
			local6[14] = this.aFloat16 = -((float) this.anInt386 * local80) / (float) (this.anInt386 - this.anInt406);
			local6[8] = (local41 + local26) / (local41 - local26);
			local6[13] = 0.0F;
		}
		this.method425();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIB)V")
	public synchronized void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub47 local8 = new Class3_Sub47(arg0);
		local8.aLong285 = arg1;
		this.aClass71_3.method2076(local8);
	}

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "()Z")
	@Override
	public boolean method7465() {
		return this.aClass225_1.method5659();
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7451(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
	@Override
	public void method7454(@OriginalArg(0) int arg0) {
		this.method422();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)I")
	@Override
	public int method7418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(BI)I")
	public int method444(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZZI[B)Lclient!bo;")
	public Interface1 method445(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface1) (this.aBoolean21 && (!arg1 || this.aBoolean17) ? new Class51_Sub2(this, arg0, arg3, arg2, arg1) : new Class33_Sub1(this, arg0, arg3, arg2));
	}

	@OriginalMember(owner = "client!ad", name = "ha", descriptor = "(F)V")
	@Override
	public void ha(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat7) {
			this.aFloat7 = arg0;
			this.method434();
		}
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)V")
	@Override
	public void method7474(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(Z)V")
	private void method446() {
		if (this.aBoolean42) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean42 = false;
		}
	}

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "()Z")
	@Override
	public boolean method7466() {
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "ka", descriptor = "(FF)V")
	@Override
	public void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat19 && arg1 == this.aFloat10) {
			return;
		}
		this.aFloat19 = arg0;
		this.aFloat10 = arg1;
		this.method425();
		if (this.anInt420 == 3) {
			this.method404();
		} else if (this.anInt420 == 2) {
			this.method430();
			return;
		}
	}

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "()I")
	@Override
	public int v() {
		return this.anInt381 + this.anInt382 + this.anInt383;
	}

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "()Z")
	@Override
	public boolean method7441() {
		return this.aClass3_Sub4_Sub1_1 != null && this.aClass3_Sub4_Sub1_1.method3542();
	}

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "(I)V")
	private void method447() {
		if (this.anInt420 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt264 > 0 && this.anInt256 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt264, (double) this.anInt256, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt400 &= 0xFFFFFFE7;
		this.anInt420 = 1;
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "()V")
	@Override
	public void method7428() {
		if (!this.aBoolean26 || this.anInt264 <= 0 || this.anInt256 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt392;
		@Pc(19) int local19 = this.anInt414;
		@Pc(22) int local22 = this.anInt413;
		@Pc(25) int local25 = this.anInt408;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method412();
		this.method406(false);
		this.method454(false);
		this.method388(false);
		this.method413(false);
		this.method423(null);
		this.method414(-2);
		this.method416(1);
		this.method455(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt264, this.anInt256, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public void method448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt389 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(9) boolean local9 = false;
		if (arg1 != this.anInt399) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt399 = arg1;
			local9 = true;
		}
		if (this.anInt401 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			this.anInt401 = arg0;
			local9 = true;
		}
		if (local9) {
			this.anInt400 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method7456(@OriginalArg(0) Class3_Sub22 arg0) {
		this.aNativeHeap1 = ((Class3_Sub22_Sub2) arg0).aNativeHeap6;
		if (this.anInterface1_1 != null) {
			return;
		}
		@Pc(16) Class3_Sub27_Sub2 local16 = new Class3_Sub27_Sub2(80);
		if (this.aBoolean39) {
			local16.method7616(-1.0F);
			local16.method7616(-1.0F);
			local16.method7616(0.0F);
			local16.method7616(0.0F);
			local16.method7616(1.0F);
			local16.method7616(1.0F);
			local16.method7616(-1.0F);
			local16.method7616(0.0F);
			local16.method7616(1.0F);
			local16.method7616(1.0F);
			local16.method7616(1.0F);
			local16.method7616(1.0F);
			local16.method7616(0.0F);
			local16.method7616(1.0F);
			local16.method7616(0.0F);
			local16.method7616(-1.0F);
			local16.method7616(1.0F);
			local16.method7616(0.0F);
			local16.method7616(0.0F);
			local16.method7616(0.0F);
		} else {
			local16.method7615(-1.0F);
			local16.method7615(-1.0F);
			local16.method7615(0.0F);
			local16.method7615(0.0F);
			local16.method7615(1.0F);
			local16.method7615(1.0F);
			local16.method7615(-1.0F);
			local16.method7615(0.0F);
			local16.method7615(1.0F);
			local16.method7615(1.0F);
			local16.method7615(1.0F);
			local16.method7615(1.0F);
			local16.method7615(0.0F);
			local16.method7615(1.0F);
			local16.method7615(0.0F);
			local16.method7615(-1.0F);
			local16.method7615(1.0F);
			local16.method7615(0.0F);
			local16.method7615(0.0F);
			local16.method7615(0.0F);
		}
		this.anInterface1_1 = this.method445(20, false, local16.anInt9191, local16.aByteArray114);
		this.aClass112_1 = new Class112(this.anInterface1_1, 5126, 3, 0);
		this.aClass112_2 = new Class112(this.anInterface1_1, 5126, 2, 12);
		this.aClass128_1.method3584(this);
	}

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "(B)V")
	public void method449() {
		OpenGL.glLightfv(16384, 4611, this.bf, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray2, 0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BFFFF)V")
	public void method450(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static47.aFloatArray73[0] = arg0;
		Static47.aFloatArray73[1] = arg3;
		Static47.aFloatArray73[3] = arg2;
		Static47.aFloatArray73[2] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static47.aFloatArray73, 0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIF)Lclient!oj;")
	@Override
	public Class3_Sub30 method7475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub30_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)Lclient!i;")
	@Override
	public Class3_Sub22 method7470(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub22_Sub2 local8 = new Class3_Sub22_Sub2(arg0);
		this.aClass71_1.method2076(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "(Z)V")
	public void method451() {
		if (this.anInt400 == 2) {
			return;
		}
		this.method447();
		this.method406(false);
		this.method454(false);
		this.method388(false);
		this.method413(false);
		this.method414(-2);
		this.anInt400 = 2;
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(II)V")
	public synchronized void method452(@OriginalArg(1) int arg0) {
		@Pc(13) Class3 local13 = new Class3();
		local13.aLong285 = arg0;
		this.aClass71_7.method2076(local13);
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "()Z")
	@Override
	public boolean method7426() {
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(Z)V")
	@Override
	public void method7455(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)V")
	public synchronized void method453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub47 local12 = new Class3_Sub47(arg0);
		local12.aLong285 = arg1;
		this.aClass71_6.method2076(local12);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(IZ)V")
	public void method454(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean23) {
			this.aBoolean23 = arg0;
			this.method427();
			this.anInt400 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "()Z")
	@Override
	public boolean method7461() {
		return this.aBoolean34 && (!this.method7441() || this.aBoolean37);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)V")
	public void method455(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt403) {
			return;
		}
		@Pc(26) boolean local26;
		@Pc(24) byte local24;
		if (arg0 == 1) {
			local26 = true;
			local24 = 1;
		} else if (arg0 == 2) {
			local26 = false;
			local24 = 2;
		} else if (arg0 == 128) {
			local24 = 3;
			local26 = true;
		} else {
			local26 = false;
			local24 = 0;
		}
		if (!this.aBoolean24) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean24 = true;
		}
		if (local26 != this.aBoolean22) {
			if (local26) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean22 = local26;
		}
		if (local24 != this.anInt409) {
			if (local24 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local24 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local24 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt409 = local24;
		}
		this.anInt403 = arg0;
		this.anInt400 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "([I)V")
	@Override
	public void A(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt413;
		arg0[2] = this.anInt414;
		arg0[0] = this.anInt392;
		arg0[3] = this.anInt408;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "()V")
	@Override
	public void method7420() {
		if (this.aClass3_Sub4_Sub1_1 != null && this.aClass3_Sub4_Sub1_1.method3542()) {
			this.aClass124_1.method3480(this.aClass3_Sub4_Sub1_1);
			this.aClass171_1.method4643();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!ws;)V")
	public void method456(@OriginalArg(1) Class205_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method7810(), 0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ws;I)V")
	public void method457(@OriginalArg(0) Class205_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method7810(), 0);
	}

	@OriginalMember(owner = "client!ad", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass205_Sub3_4.aFloat272 + this.aClass205_Sub3_4.aFloat275 * (float) arg1 + (float) arg0 * this.aClass205_Sub3_4.aFloat278 + (float) arg2 * this.aClass205_Sub3_4.aFloat276;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = (float) arg3 * this.aClass205_Sub3_4.aFloat278 + (float) arg4 * this.aClass205_Sub3_4.aFloat275 + this.aClass205_Sub3_4.aFloat276 * (float) arg5 + this.aClass205_Sub3_4.aFloat272;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt406 > local28 && (float) this.anInt406 > local59 || !(!((float) this.anInt386 < local28) || !((float) this.anInt386 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt384 * ((float) arg0 * this.aClass205_Sub3_4.aFloat273 + (float) arg1 * this.aClass205_Sub3_4.aFloat274 + this.aClass205_Sub3_4.aFloat281 * (float) arg2 + this.aClass205_Sub3_4.aFloat279) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt384 * ((float) arg4 * this.aClass205_Sub3_4.aFloat274 + (float) arg3 * this.aClass205_Sub3_4.aFloat273 + (float) arg5 * this.aClass205_Sub3_4.aFloat281 + this.aClass205_Sub3_4.aFloat279) / local59);
		if (this.aFloat13 > (float) local123 && this.aFloat13 > (float) local155 || this.aFloat9 < (float) local123 && (float) local155 > this.aFloat9) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt416 * (this.aClass205_Sub3_4.aFloat271 + (float) arg1 * this.aClass205_Sub3_4.aFloat280 + this.aClass205_Sub3_4.aFloat270 * (float) arg0 + (float) arg2 * this.aClass205_Sub3_4.aFloat277) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt416 * (this.aClass205_Sub3_4.aFloat271 + (float) arg5 * this.aClass205_Sub3_4.aFloat277 + this.aClass205_Sub3_4.aFloat270 * (float) arg3 + (float) arg4 * this.aClass205_Sub3_4.aFloat280) / local59);
			return (!((float) local213 < this.aFloat28) || !(this.aFloat28 > (float) local245)) && (!((float) local213 > this.aFloat20) || !(this.aFloat20 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!im;)V")
	public void method458(@OriginalArg(1) Interface11 arg0) {
		if (this.anInt380 < 0 || arg0 != this.anInterface11Array2[this.anInt380]) {
			throw new RuntimeException();
		}
		this.anInterface11Array2[this.anInt380--] = null;
		arg0.method3963();
		if (this.anInt380 < 0) {
			this.anInterface11_1 = null;
		} else {
			this.anInterface11_1 = this.anInterface11Array2[this.anInt380];
			this.anInterface11_1.method3964();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!im;I)V")
	public void method459(@OriginalArg(0) Interface11 arg0) {
		if (this.anInt380 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt380 >= 0) {
			this.anInterface11Array2[this.anInt380].method3963();
		}
		this.anInterface11_1 = this.anInterface11Array2[++this.anInt380] = arg0;
		this.anInterface11_1.method3964();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7417(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7449();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!im;B)V")
	public void method460(@OriginalArg(0) Interface11 arg0) {
		if (this.anInt378 < 0 || arg0 != this.anInterface11Array3[this.anInt378]) {
			throw new RuntimeException();
		}
		this.anInterface11Array3[this.anInt378--] = null;
		arg0.method3967();
		if (this.anInt378 >= 0) {
			this.anInterface11_2 = this.anInterface11Array3[this.anInt378];
			this.anInterface11_2.method3968();
		} else {
			this.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IIIB)V")
	public void method461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(III)V")
	public synchronized void method462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub47 local8 = new Class3_Sub47(arg1);
		local8.aLong285 = arg0;
		this.aClass71_4.method2076(local8);
	}

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "(I)V")
	private void method463() {
		if (this.anInt420 != 3) {
			this.anInt420 = 3;
			this.method404();
			this.method433();
			this.anInt400 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!or;IIII)Lclient!ba;")
	@Override
	public Class2 method7443(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class2_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "(I)Lclient!vda;")
	public Class11_Sub4 method464() {
		return this.aClass66_Sub1_1 == null ? null : this.aClass66_Sub1_1.method4936();
	}
}
