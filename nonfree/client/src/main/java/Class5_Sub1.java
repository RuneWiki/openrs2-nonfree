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

@OriginalClass("client!ac")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!ac", name = "yb", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!ac", name = "oc", descriptor = "I")
	public int anInt250;

	@OriginalMember(owner = "client!ac", name = "pc", descriptor = "I")
	public int anInt251;

	@OriginalMember(owner = "client!ac", name = "Ge", descriptor = "I")
	public int anInt361;

	@OriginalMember(owner = "client!ac", name = "Ie", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!ac", name = "Ke", descriptor = "Lclient!hg;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "client!ac", name = "Ne", descriptor = "Lclient!hg;")
	private Interface14 anInterface14_2;

	@OriginalMember(owner = "client!ac", name = "Pe", descriptor = "Lclient!ol;")
	private Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!ac", name = "Se", descriptor = "Lclient!rr;")
	private Class297 aClass297_1;

	@OriginalMember(owner = "client!ac", name = "Ue", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!ac", name = "Ve", descriptor = "I")
	public int anInt366;

	@OriginalMember(owner = "client!ac", name = "We", descriptor = "I")
	public int anInt367;

	@OriginalMember(owner = "client!ac", name = "df", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!ac", name = "ef", descriptor = "Z")
	private boolean aBoolean11;

	@OriginalMember(owner = "client!ac", name = "ff", descriptor = "Z")
	private boolean aBoolean12;

	@OriginalMember(owner = "client!ac", name = "gf", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!ac", name = "jf", descriptor = "Z")
	private boolean aBoolean13;

	@OriginalMember(owner = "client!ac", name = "kf", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!ac", name = "lf", descriptor = "J")
	private long aLong3;

	@OriginalMember(owner = "client!ac", name = "mf", descriptor = "Z")
	private boolean aBoolean14;

	@OriginalMember(owner = "client!ac", name = "pf", descriptor = "Lclient!ln;")
	public Class92_Sub2 aClass92_Sub2_1;

	@OriginalMember(owner = "client!ac", name = "qf", descriptor = "F")
	public float aFloat1;

	@OriginalMember(owner = "client!ac", name = "rf", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!ac", name = "sf", descriptor = "Lclient!aaa;")
	public Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!ac", name = "tf", descriptor = "F")
	public float aFloat2;

	@OriginalMember(owner = "client!ac", name = "uf", descriptor = "Z")
	private boolean aBoolean15;

	@OriginalMember(owner = "client!ac", name = "vf", descriptor = "Lclient!ln;")
	public Class92_Sub2 aClass92_Sub2_2;

	@OriginalMember(owner = "client!ac", name = "wf", descriptor = "I")
	public int anInt372;

	@OriginalMember(owner = "client!ac", name = "xf", descriptor = "Lclient!rr;")
	public Class297 aClass297_2;

	@OriginalMember(owner = "client!ac", name = "yf", descriptor = "F")
	public float aFloat3;

	@OriginalMember(owner = "client!ac", name = "zf", descriptor = "Lclient!gk;")
	public Class121 aClass121_1;

	@OriginalMember(owner = "client!ac", name = "Af", descriptor = "Z")
	public boolean aBoolean16;

	@OriginalMember(owner = "client!ac", name = "Bf", descriptor = "Z")
	public boolean aBoolean17;

	@OriginalMember(owner = "client!ac", name = "Cf", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!ac", name = "Df", descriptor = "Lclient!ln;")
	public Class92_Sub2 aClass92_Sub2_3;

	@OriginalMember(owner = "client!ac", name = "Ff", descriptor = "F")
	private float aFloat4;

	@OriginalMember(owner = "client!ac", name = "Hf", descriptor = "Z")
	private boolean aBoolean18;

	@OriginalMember(owner = "client!ac", name = "If", descriptor = "Lclient!ob;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!ac", name = "Jf", descriptor = "Z")
	public boolean aBoolean19;

	@OriginalMember(owner = "client!ac", name = "Lf", descriptor = "I")
	public int anInt375;

	@OriginalMember(owner = "client!ac", name = "Of", descriptor = "F")
	private float aFloat7;

	@OriginalMember(owner = "client!ac", name = "Qf", descriptor = "Lclient!ln;")
	public Class92_Sub2 aClass92_Sub2_4;

	@OriginalMember(owner = "client!ac", name = "Sf", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!ac", name = "Tf", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!ac", name = "Uf", descriptor = "Lclient!ln;")
	public Class92_Sub2 aClass92_Sub2_5;

	@OriginalMember(owner = "client!ac", name = "Wf", descriptor = "Z")
	private boolean aBoolean22;

	@OriginalMember(owner = "client!ac", name = "Yf", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!ac", name = "Zf", descriptor = "Z")
	public boolean aBoolean23;

	@OriginalMember(owner = "client!ac", name = "bg", descriptor = "Lclient!ln;")
	public Class92_Sub2 aClass92_Sub2_6;

	@OriginalMember(owner = "client!ac", name = "eg", descriptor = "[Lclient!cu;")
	private Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ac", name = "fg", descriptor = "Z")
	public boolean aBoolean24;

	@OriginalMember(owner = "client!ac", name = "gg", descriptor = "I")
	public int anInt384;

	@OriginalMember(owner = "client!ac", name = "hg", descriptor = "Z")
	public boolean aBoolean25;

	@OriginalMember(owner = "client!ac", name = "lg", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!ac", name = "ng", descriptor = "Z")
	private boolean aBoolean26;

	@OriginalMember(owner = "client!ac", name = "sg", descriptor = "I")
	public int anInt388;

	@OriginalMember(owner = "client!ac", name = "tg", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!ac", name = "vg", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!ac", name = "yg", descriptor = "F")
	private float aFloat13;

	@OriginalMember(owner = "client!ac", name = "zg", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!ac", name = "Dg", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!ac", name = "Eg", descriptor = "Z")
	private boolean aBoolean28;

	@OriginalMember(owner = "client!ac", name = "Gg", descriptor = "Z")
	public boolean aBoolean29;

	@OriginalMember(owner = "client!ac", name = "Ig", descriptor = "Z")
	public boolean aBoolean30;

	@OriginalMember(owner = "client!ac", name = "Kg", descriptor = "Lclient!ln;")
	public Class92_Sub2 aClass92_Sub2_7;

	@OriginalMember(owner = "client!ac", name = "Mg", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!ac", name = "Ng", descriptor = "Z")
	public boolean aBoolean31;

	@OriginalMember(owner = "client!ac", name = "Sg", descriptor = "Lclient!gk;")
	public Class121 aClass121_2;

	@OriginalMember(owner = "client!ac", name = "Tg", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!ac", name = "Yg", descriptor = "Lclient!dw;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!ac", name = "Zg", descriptor = "Lclient!go;")
	private Class31_Sub1 aClass31_Sub1_1;

	@OriginalMember(owner = "client!ac", name = "ah", descriptor = "Lclient!iaa;")
	private Class2_Sub1_Sub1 aClass2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ac", name = "bh", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!ac", name = "dh", descriptor = "Z")
	public boolean aBoolean34;

	@OriginalMember(owner = "client!ac", name = "gh", descriptor = "Z")
	private boolean aBoolean37;

	@OriginalMember(owner = "client!ac", name = "mh", descriptor = "Lclient!ln;")
	public Class92_Sub2 aClass92_Sub2_8;

	@OriginalMember(owner = "client!ac", name = "nh", descriptor = "Z")
	private boolean aBoolean38;

	@OriginalMember(owner = "client!ac", name = "rh", descriptor = "Lclient!ln;")
	public Class92_Sub2 aClass92_Sub2_9;

	@OriginalMember(owner = "client!ac", name = "sh", descriptor = "Lclient!ln;")
	public Class92_Sub2 aClass92_Sub2_10;

	@OriginalMember(owner = "client!ac", name = "uh", descriptor = "Lclient!ob;")
	private Interface19 anInterface19_2;

	@OriginalMember(owner = "client!ac", name = "wh", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!ac", name = "xh", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!ac", name = "yc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!ac", name = "ue", descriptor = "I")
	public int anInt357 = 128;

	@OriginalMember(owner = "client!ac", name = "ye", descriptor = "Lclient!vq;")
	private final Class364 aClass364_1 = new Class364();

	@OriginalMember(owner = "client!ac", name = "Ae", descriptor = "Lclient!gca;")
	private final Class115_Sub1 aClass115_Sub1_1 = new Class115_Sub1();

	@OriginalMember(owner = "client!ac", name = "Be", descriptor = "Lclient!gca;")
	public final Class115_Sub1 aClass115_Sub1_2 = new Class115_Sub1();

	@OriginalMember(owner = "client!ac", name = "De", descriptor = "I")
	public int anInt359 = 8;

	@OriginalMember(owner = "client!ac", name = "Ce", descriptor = "Z")
	private boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ac", name = "Ee", descriptor = "I")
	public int anInt360 = 3;

	@OriginalMember(owner = "client!ac", name = "Fe", descriptor = "Lclient!kba;")
	private final Class163 aClass163_1 = new Class163();

	@OriginalMember(owner = "client!ac", name = "Le", descriptor = "[Lclient!hg;")
	private final Interface14[] anInterface14Array1 = new Interface14[4];

	@OriginalMember(owner = "client!ac", name = "Oe", descriptor = "[Lclient!hg;")
	private final Interface14[] anInterface14Array2 = new Interface14[4];

	@OriginalMember(owner = "client!ac", name = "Je", descriptor = "I")
	private int anInt362 = -1;

	@OriginalMember(owner = "client!ac", name = "Me", descriptor = "I")
	private int anInt363 = -1;

	@OriginalMember(owner = "client!ac", name = "Qe", descriptor = "I")
	private int anInt364 = -1;

	@OriginalMember(owner = "client!ac", name = "Re", descriptor = "[Lclient!hg;")
	private final Interface14[] anInterface14Array3 = new Interface14[4];

	@OriginalMember(owner = "client!ac", name = "Te", descriptor = "Lclient!kba;")
	private final Class163 aClass163_2;

	@OriginalMember(owner = "client!ac", name = "Xe", descriptor = "Lclient!kba;")
	private final Class163 aClass163_3;

	@OriginalMember(owner = "client!ac", name = "Ye", descriptor = "Lclient!kba;")
	private final Class163 aClass163_4;

	@OriginalMember(owner = "client!ac", name = "Ze", descriptor = "Lclient!kba;")
	private final Class163 aClass163_5;

	@OriginalMember(owner = "client!ac", name = "af", descriptor = "Lclient!kba;")
	private final Class163 aClass163_6;

	@OriginalMember(owner = "client!ac", name = "bf", descriptor = "Lclient!kba;")
	private final Class163 bf;

	@OriginalMember(owner = "client!ac", name = "cf", descriptor = "Lclient!kba;")
	private final Class163 aClass163_7;

	@OriginalMember(owner = "client!ac", name = "hf", descriptor = "Lclient!gca;")
	public final Class115_Sub1 aClass115_Sub1_3;

	@OriginalMember(owner = "client!ac", name = "nf", descriptor = "Lclient!gca;")
	public final Class115_Sub1 aClass115_Sub1_4;

	@OriginalMember(owner = "client!ac", name = "of", descriptor = "Lclient!gca;")
	public final Class115_Sub1 aClass115_Sub1_5;

	@OriginalMember(owner = "client!ac", name = "Kf", descriptor = "F")
	private float aFloat5;

	@OriginalMember(owner = "client!ac", name = "Ef", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!ac", name = "ag", descriptor = "F")
	private float aFloat8;

	@OriginalMember(owner = "client!ac", name = "dg", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!ac", name = "Vf", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!ac", name = "qg", descriptor = "[Lclient!cba;")
	private final Class6_Sub10[] aClass6_Sub10Array1;

	@OriginalMember(owner = "client!ac", name = "ig", descriptor = "F")
	private float aFloat9;

	@OriginalMember(owner = "client!ac", name = "Gf", descriptor = "[F")
	private final float[] aFloatArray1;

	@OriginalMember(owner = "client!ac", name = "Xf", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!ac", name = "wg", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!ac", name = "Ag", descriptor = "[F")
	private final float[] aFloatArray2;

	@OriginalMember(owner = "client!ac", name = "mg", descriptor = "I")
	public int anInt386;

	@OriginalMember(owner = "client!ac", name = "ug", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!ac", name = "kg", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!ac", name = "pg", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!ac", name = "Fg", descriptor = "I")
	public int anInt395;

	@OriginalMember(owner = "client!ac", name = "Jg", descriptor = "I")
	public int anInt397;

	@OriginalMember(owner = "client!ac", name = "Rg", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!ac", name = "Lg", descriptor = "F")
	private float aFloat16;

	@OriginalMember(owner = "client!ac", name = "Pf", descriptor = "I")
	public int anInt376;

	@OriginalMember(owner = "client!ac", name = "Cg", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!ac", name = "Wg", descriptor = "[F")
	private final float[] aFloatArray4;

	@OriginalMember(owner = "client!ac", name = "eh", descriptor = "Z")
	private boolean aBoolean35;

	@OriginalMember(owner = "client!ac", name = "Og", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!ac", name = "Nf", descriptor = "F")
	public float aFloat6;

	@OriginalMember(owner = "client!ac", name = "Ug", descriptor = "[F")
	public final float[] aFloatArray3;

	@OriginalMember(owner = "client!ac", name = "lh", descriptor = "I")
	public int anInt404;

	@OriginalMember(owner = "client!ac", name = "kh", descriptor = "I")
	public int anInt403;

	@OriginalMember(owner = "client!ac", name = "Xg", descriptor = "I")
	public int anInt399;

	@OriginalMember(owner = "client!ac", name = "cg", descriptor = "I")
	public int anInt382;

	@OriginalMember(owner = "client!ac", name = "xg", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!ac", name = "ih", descriptor = "F")
	private float aFloat20;

	@OriginalMember(owner = "client!ac", name = "oh", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!ac", name = "Bg", descriptor = "I")
	public int anInt394;

	@OriginalMember(owner = "client!ac", name = "jg", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!ac", name = "Pg", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!ac", name = "hh", descriptor = "I")
	public int anInt401;

	@OriginalMember(owner = "client!ac", name = "th", descriptor = "[F")
	private final float[] aFloatArray5;

	@OriginalMember(owner = "client!ac", name = "jh", descriptor = "I")
	public int anInt402;

	@OriginalMember(owner = "client!ac", name = "rg", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!ac", name = "vh", descriptor = "Z")
	private boolean aBoolean41;

	@OriginalMember(owner = "client!ac", name = "ch", descriptor = "Lclient!vda;")
	public Class6_Sub8_Sub2 aClass6_Sub8_Sub2_1;

	@OriginalMember(owner = "client!ac", name = "yh", descriptor = "[I")
	public int[] anIntArray7;

	@OriginalMember(owner = "client!ac", name = "zh", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!ac", name = "Ah", descriptor = "[I")
	public int[] anIntArray8;

	@OriginalMember(owner = "client!ac", name = "Bh", descriptor = "[I")
	public int[] anIntArray9;

	@OriginalMember(owner = "client!ac", name = "gc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas2;

	@OriginalMember(owner = "client!ac", name = "ob", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!ac", name = "ve", descriptor = "I")
	public final int anInt358;

	@OriginalMember(owner = "client!ac", name = "mb", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ac", name = "pe", descriptor = "J")
	private final long aLong2;

	@OriginalMember(owner = "client!ac", name = "Tb", descriptor = "J")
	private long aLong1;

	@OriginalMember(owner = "client!ac", name = "Hg", descriptor = "I")
	public final int anInt396;

	@OriginalMember(owner = "client!ac", name = "Qg", descriptor = "Z")
	public boolean aBoolean32;

	@OriginalMember(owner = "client!ac", name = "fh", descriptor = "Z")
	private boolean aBoolean36;

	@OriginalMember(owner = "client!ac", name = "Rf", descriptor = "Z")
	public boolean aBoolean21;

	@OriginalMember(owner = "client!ac", name = "Mf", descriptor = "Z")
	public boolean aBoolean20;

	@OriginalMember(owner = "client!ac", name = "ph", descriptor = "Z")
	private boolean aBoolean39;

	@OriginalMember(owner = "client!ac", name = "og", descriptor = "Z")
	public boolean aBoolean27;

	@OriginalMember(owner = "client!ac", name = "qh", descriptor = "Z")
	public boolean aBoolean40;

	@OriginalMember(owner = "client!ac", name = "Vg", descriptor = "Z")
	private final boolean aBoolean33;

	@OriginalMember(owner = "client!ac", name = "te", descriptor = "Lclient!vw;")
	private final Class368 aClass368_1;

	@OriginalMember(owner = "client!ac", name = "He", descriptor = "Lclient!hk;")
	public final Class135 aClass135_1;

	@OriginalMember(owner = "client!ac", name = "xe", descriptor = "Lclient!rm;")
	private final Class294 aClass294_1;

	@OriginalMember(owner = "client!ac", name = "we", descriptor = "Lclient!bw;")
	private Class6_Sub9_Sub1 aClass6_Sub9_Sub1_1;

	@OriginalMember(owner = "client!ac", name = "ze", descriptor = "Lclient!dq;")
	private final Class69 aClass69_1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class5_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class231();
		new Class380(16);
		this.aClass163_2 = new Class163();
		this.aClass163_3 = new Class163();
		this.aClass163_4 = new Class163();
		this.aClass163_5 = new Class163();
		this.aClass163_6 = new Class163();
		this.bf = new Class163();
		this.aClass163_7 = new Class163();
		this.aClass115_Sub1_3 = new Class115_Sub1();
		this.aClass115_Sub1_4 = new Class115_Sub1();
		this.aClass115_Sub1_5 = new Class115_Sub1();
		this.aFloat5 = 0.0F;
		this.anInt374 = 0;
		this.aFloat8 = 1.0F;
		this.anInt383 = 8448;
		this.anInt379 = 8448;
		this.aClass6_Sub10Array1 = new Class6_Sub10[Static163.anInt3675];
		this.aFloat9 = -1.0F;
		this.aFloatArray1 = new float[4];
		this.anInt380 = 3584;
		this.anInt391 = 0;
		this.aFloatArray2 = new float[4];
		this.anInt386 = 50;
		this.anInt390 = -1;
		this.anInt385 = 0;
		this.aFloat11 = -1.0F;
		this.anInt395 = -1;
		this.anInt397 = 0;
		this.aFloat18 = -1.0F;
		this.aFloat16 = -1.0F;
		this.anInt376 = 512;
		this.aFloat14 = 1.0F;
		this.aFloatArray4 = new float[16];
		this.aBoolean35 = false;
		this.anInt398 = 0;
		this.aFloat6 = 3584.0F;
		this.aFloatArray3 = new float[4];
		this.anInt404 = -1;
		this.anInt403 = -1;
		this.anInt399 = -1;
		this.anInt382 = 0;
		this.anInt392 = 0;
		this.aFloat20 = 1.0F;
		this.aFloat21 = 1.0F;
		this.anInt394 = 512;
		this.aFloat10 = 3584.0F;
		this.aFloat17 = 1.0F;
		this.anInt401 = 0;
		this.aFloatArray5 = new float[4];
		this.anInt402 = 0;
		this.anInt387 = 0;
		this.aBoolean41 = true;
		this.aClass6_Sub8_Sub2_1 = new Class6_Sub8_Sub2(8192);
		this.anIntArray7 = new int[1];
		this.aByteArray1 = new byte[16384];
		this.anIntArray8 = new int[1];
		this.anIntArray9 = new int[1];
		this.aCanvas1 = this.aCanvas2 = arg0;
		this.anInt358 = arg2;
		if (!Static362.method5843("jaclib")) {
			throw new RuntimeException("");
		} else if (Static362.method5843("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong1 = this.aLong2 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt358);
				if (this.aLong2 == 0L) {
					throw new RuntimeException("");
				}
				this.method343();
				@Pc(335) int local335 = this.method338();
				if (local335 != 0) {
					throw new RuntimeException("");
				}
				this.anInt396 = this.aBoolean24 ? 33639 : 5121;
				if (this.aString1.indexOf("radeon") != -1) {
					@Pc(362) int local362 = 0;
					@Pc(364) boolean local364 = false;
					@Pc(366) boolean local366 = false;
					@Pc(375) String[] local375 = Static206.method3730(this.aString1.replace('/', ' '), ' ');
					for (@Pc(377) int local377 = 0; local377 < local375.length; local377++) {
						@Pc(383) String local383 = local375[local377];
						try {
							if (local383.length() > 0) {
								if (local383.charAt(0) == 'x' && local383.length() >= 3 && Static394.method6226(local383.substring(1, 3))) {
									local366 = true;
									local383 = local383.substring(1);
								}
								if (local383.equals("hd")) {
									local364 = true;
								} else {
									if (local383.startsWith("hd")) {
										local364 = true;
										local383 = local383.substring(2);
									}
									if (local383.length() >= 4 && Static394.method6226(local383.substring(0, 4))) {
										local362 = Static533.method7565(local383.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(453) Exception local453) {
						}
					}
					if (!local366 && !local364) {
						if (local362 >= 7000 && local362 <= 9250) {
							this.aBoolean32 = false;
						}
						if (local362 >= 7000 && local362 <= 7999) {
							this.aBoolean36 = false;
						}
					}
					if (!local364 || local362 < 4000) {
						this.aBoolean21 = false;
					}
					this.aBoolean20 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean39 = this.aBoolean36;
					this.aBoolean27 = true;
				}
				if (this.aString2.indexOf("intel") != -1) {
					this.aBoolean40 = false;
				}
				this.aBoolean33 = !this.aString2.equals("s3 graphics");
				if (this.aBoolean36) {
					try {
						@Pc(538) int[] local538 = new int[1];
						OpenGL.glGenBuffersARB(1, local538, 0);
					} catch (@Pc(544) Throwable local544) {
						throw new RuntimeException("");
					}
				}
				Static181.method3397(false, true);
				this.aBoolean10 = true;
				this.aClass368_1 = new Class368(this, super.anInterface7_10);
				this.method392();
				this.aClass135_1 = new Class135(this);
				this.aClass294_1 = new Class294(this);
				if (this.aClass294_1.method7243()) {
					this.aClass6_Sub9_Sub1_1 = new Class6_Sub9_Sub1(this);
					if (!this.aClass6_Sub9_Sub1_1.method1711()) {
						this.aClass6_Sub9_Sub1_1.method1706();
						this.aClass6_Sub9_Sub1_1 = null;
					}
				}
				this.aClass69_1 = new Class69(this);
				this.method353();
				this.method339();
				this.method6180();
			} catch (@Pc(618) Throwable local618) {
				local618.printStackTrace();
				this.method6136();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	private void method315() {
		if (this.aBoolean38 && !this.aBoolean26) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "(I)Lclient!hw;")
	public Class2_Sub2 method316() {
		return this.aClass31_Sub1_1 == null ? null : this.aClass31_Sub1_1.method2212();
	}

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "()V")
	@Override
	public void method6180() {
		if (!this.aBoolean33 || this.anInt251 <= 0 || this.anInt250 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt374;
		@Pc(19) int local19 = this.anInt398;
		@Pc(22) int local22 = this.anInt385;
		@Pc(25) int local25 = this.anInt391;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method356();
		this.method345(false);
		this.method340(false);
		this.method370(false);
		this.method364(false);
		this.method352((Class2) null);
		this.method323(-2);
		this.method385(1);
		this.method359(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt251, this.anInt250, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	private void method317() {
		if (this.anInt374 <= this.anInt398 && this.anInt385 <= this.anInt391) {
			OpenGL.glScissor(this.anInt392 + this.anInt374, -this.anInt391 + this.anInt387 - -this.anInt250, this.anInt398 - this.anInt374, this.anInt391 - this.anInt385);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
	public void method318() {
		if (this.anInt370 == 2) {
			return;
		}
		this.method366();
		this.method345(false);
		this.method340(false);
		this.method370(false);
		this.method364(false);
		this.method323(-2);
		this.anInt370 = 2;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
	@Override
	public void method6124(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ac", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass115_Sub1_3.aFloat80 + (float) arg1 * this.aClass115_Sub1_3.aFloat79 + this.aClass115_Sub1_3.aFloat85 * (float) arg0 + (float) arg2 * this.aClass115_Sub1_3.aFloat76;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass115_Sub1_3.aFloat80 + (float) arg3 * this.aClass115_Sub1_3.aFloat85 + this.aClass115_Sub1_3.aFloat79 * (float) arg4 + (float) arg5 * this.aClass115_Sub1_3.aFloat76;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt386 > local32 && local63 < (float) this.anInt386) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt380 && (float) this.anInt380 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((float) this.anInt394 * (this.aClass115_Sub1_3.aFloat77 + this.aClass115_Sub1_3.aFloat82 * (float) arg1 + this.aClass115_Sub1_3.aFloat86 * (float) arg0 + this.aClass115_Sub1_3.aFloat83 * (float) arg2) / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt394 * ((float) arg5 * this.aClass115_Sub1_3.aFloat83 + (float) arg3 * this.aClass115_Sub1_3.aFloat86 + (float) arg4 * this.aClass115_Sub1_3.aFloat82 + this.aClass115_Sub1_3.aFloat77) / local63);
		if ((float) local135 < this.aFloat15 && this.aFloat15 > (float) local167) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat3 && this.aFloat3 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt376 * (this.aClass115_Sub1_3.aFloat84 + (float) arg2 * this.aClass115_Sub1_3.aFloat87 + this.aClass115_Sub1_3.aFloat81 * (float) arg0 + (float) arg1 * this.aClass115_Sub1_3.aFloat78) / local32);
		@Pc(265) int local265 = (int) ((this.aClass115_Sub1_3.aFloat84 + this.aClass115_Sub1_3.aFloat81 * (float) arg3 + this.aClass115_Sub1_3.aFloat78 * (float) arg4 + this.aClass115_Sub1_3.aFloat87 * (float) arg5) * (float) this.anInt376 / local63);
		if ((float) local233 < this.aFloat2 && (float) local265 < this.aFloat2) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat19 && this.aFloat19 < (float) local265) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Class2_Sub1_Sub1 local9 = local6.aClass2_Sub1_Sub1_3;
		this.method318();
		this.method352(local6.aClass2_Sub1_Sub1_3);
		this.method359(1);
		this.method388(8448, 7681);
		this.method329(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat118 / (float) local9.anInt5128;
		@Pc(46) float local46 = local9.aFloat119 / (float) local9.anInt5127;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt374 - arg2) * local39, (float) (this.anInt385 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt374, this.anInt385);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt374 - arg2), (float) (this.anInt391 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt374, this.anInt391);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt398 - arg2), (float) (this.anInt391 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt398, this.anInt391);
		OpenGL.glTexCoord2f((float) (this.anInt398 - arg2) * local39, (float) (this.anInt385 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt398, this.anInt385);
		OpenGL.glEnd();
		this.method329(0, 768, 5890);
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(IIIIII)Lclient!di;")
	@Override
	public Class31 method6166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean23 ? new Class31_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!dw;I)V")
	public void method319(@OriginalArg(0) Interface9 arg0) {
		if (this.anInterface9_1 != arg0) {
			if (this.aBoolean36) {
				OpenGL.glBindBufferARB(34963, arg0.method7035());
			}
			this.anInterface9_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "()Z")
	@Override
	public boolean method6173() {
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!pf;)V")
	@Override
	public void method6183(@OriginalArg(0) Class257 arg0) {
		this.aClass364_1.method8397(arg0, -1, this);
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "()Z")
	@Override
	public boolean method6134() {
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(II)I")
	@Override
	public int method6147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "(I)V")
	public void method320() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray3, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray5, 0);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!hg;I)V")
	public void method321(@OriginalArg(0) Interface14 arg0) {
		if (this.anInt362 < 0 || arg0 != this.anInterface14Array2[this.anInt362]) {
			throw new RuntimeException();
		}
		this.anInterface14Array2[this.anInt362--] = null;
		arg0.method7254();
		if (this.anInt362 >= 0) {
			this.anInterface14_1 = this.anInterface14Array2[this.anInt362];
			this.anInterface14_1.method7253();
		} else {
			this.anInterface14_1 = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "(I)V")
	private void method322() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass115_Sub1_4.method3377(), 0);
		if (this.aBoolean35) {
			this.aClass69_1.aClass16_Sub9_1.method8768();
		}
		this.method320();
		this.method331();
	}

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass115_Sub1_3.aFloat80 + this.aClass115_Sub1_3.aFloat76 * (float) arg2 + (float) arg1 * this.aClass115_Sub1_3.aFloat79 + this.aClass115_Sub1_3.aFloat85 * (float) arg0;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) (((float) arg0 * this.aClass115_Sub1_3.aFloat86 + (float) arg1 * this.aClass115_Sub1_3.aFloat82 + (float) arg2 * this.aClass115_Sub1_3.aFloat83 + this.aClass115_Sub1_3.aFloat77) * (float) this.anInt394 / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat15);
		@Pc(119) int local119 = (int) ((float) this.anInt376 * (this.aClass115_Sub1_3.aFloat84 + (float) arg2 * this.aClass115_Sub1_3.aFloat87 + (float) arg0 * this.aClass115_Sub1_3.aFloat81 + (float) arg1 * this.aClass115_Sub1_3.aFloat78) / local28);
		arg3[1] = (int) ((float) local119 - this.aFloat2);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "(I)V")
	@Override
	public void method6161() {
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(II)V")
	public void method323(@OriginalArg(1) int arg0) {
		this.method397(true, arg0);
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt386 && this.anInt380 == arg1) {
			return;
		}
		this.anInt380 = arg1;
		this.anInt386 = arg0;
		this.method336();
		this.method341();
		if (this.anInt378 == 3) {
			this.method373();
		} else if (this.anInt378 == 2) {
			this.method374();
			return;
		}
	}

	@OriginalMember(owner = "client!ac", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt398 = this.anInt251;
		this.anInt374 = 0;
		this.anInt385 = 0;
		this.anInt391 = this.anInt250;
		OpenGL.glDisable(3089);
		this.method395();
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lclient!hg;I)V")
	public void method324(@OriginalArg(0) Interface14 arg0) {
		if (this.anInt363 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt363 >= 0) {
			this.anInterface14Array1[this.anInt363].method7256();
		}
		this.anInterface14_2 = this.anInterface14Array1[++this.anInt363] = arg0;
		this.anInterface14_2.method7252();
	}

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt404 == arg0 && arg1 == this.anInt399 && this.anInt397 == arg2) {
			return;
		}
		this.anInt404 = arg0;
		this.anInt397 = arg2;
		this.anInt399 = arg1;
		this.method341();
		this.method382();
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "()Lclient!hba;")
	@Override
	public Class115 method6115() {
		return this.aClass115_Sub1_3;
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
	@Override
	public void method6141(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt357 = arg0;
		this.aClass368_1.method8476();
	}

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "(I)V")
	private void method325() {
		this.anOpenGL1.a();
	}

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "()V")
	@Override
	public void method6139() {
		if (this.aBoolean40) {
			if (this.anInterface14_2 != this.aClass297_1) {
				throw new RuntimeException();
			}
			this.aClass297_1.method7263(0);
			this.aClass297_1.method7263(8);
			this.method396(this.aClass297_1);
		} else if (this.aBoolean22) {
			this.aClass4_Sub2_1.method7699(0, 0, this.anInt251, this.anInt250, 0, 0);
			this.anOpenGL1.setSurface(this.aLong1);
		} else {
			throw new RuntimeException("");
		}
		this.aClass4_Sub2_1 = null;
		this.anInt250 = this.anInt161;
		this.anInt251 = this.anInt210;
		this.method356();
		this.method333();
		this.la();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)V")
	public synchronized void method326(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub37 local12 = new Class6_Sub37(arg0);
		this.aClass163_5.method4967(local12);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)Lclient!ufa;")
	@Override
	public Class4 method6102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class4_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ac", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt250 - local12 - arg1, arg2, 1, 32993, this.anInt396, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt374;
		arg0[3] = this.anInt391;
		arg0[2] = this.anInt398;
		arg0[1] = this.anInt385;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Lclient!ku;")
	@Override
	public Interface16 method6107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[BIZI)Lclient!dw;")
	public Interface9 method327(@OriginalArg(1) byte[] arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		return (Interface9) (this.aBoolean36 && (!arg1 || this.aBoolean39) ? new Class149_Sub2(this, 5123, arg0, arg2, arg1) : new Class170_Sub1(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "(II)I")
	public int method328(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V")
	@Override
	public void method6146(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIII)V")
	public void method329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6171(@OriginalArg(0) Class6_Sub16 arg0) {
		this.aNativeHeap1 = ((Class6_Sub16_Sub2) arg0).aNativeHeap6;
		if (this.anInterface19_2 != null) {
			return;
		}
		@Pc(16) Class6_Sub8_Sub2 local16 = new Class6_Sub8_Sub2(80);
		if (this.aBoolean24) {
			local16.method8270(-1.0F);
			local16.method8270(-1.0F);
			local16.method8270(0.0F);
			local16.method8270(0.0F);
			local16.method8270(1.0F);
			local16.method8270(1.0F);
			local16.method8270(-1.0F);
			local16.method8270(0.0F);
			local16.method8270(1.0F);
			local16.method8270(1.0F);
			local16.method8270(1.0F);
			local16.method8270(1.0F);
			local16.method8270(0.0F);
			local16.method8270(1.0F);
			local16.method8270(0.0F);
			local16.method8270(-1.0F);
			local16.method8270(1.0F);
			local16.method8270(0.0F);
			local16.method8270(0.0F);
			local16.method8270(0.0F);
		} else {
			local16.method8271(-1.0F);
			local16.method8271(-1.0F);
			local16.method8271(0.0F);
			local16.method8271(0.0F);
			local16.method8271(1.0F);
			local16.method8271(1.0F);
			local16.method8271(-1.0F);
			local16.method8271(0.0F);
			local16.method8271(1.0F);
			local16.method8271(1.0F);
			local16.method8271(1.0F);
			local16.method8271(1.0F);
			local16.method8271(0.0F);
			local16.method8271(1.0F);
			local16.method8271(0.0F);
			local16.method8271(-1.0F);
			local16.method8271(1.0F);
			local16.method8271(0.0F);
			local16.method8271(0.0F);
			local16.method8271(0.0F);
		}
		this.anInterface19_2 = this.method367(local16.anInt10061, false, 20, local16.aByteArray102);
		this.aClass121_1 = new Class121(this.anInterface19_2, 5126, 3, 0);
		this.aClass121_2 = new Class121(this.anInterface19_2, 5126, 2, 12);
		this.aClass364_1.method8403(this);
	}

	@OriginalMember(owner = "client!ac", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method348();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method359(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean15) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean15) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "(I)V")
	public void method330() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "(I)V")
	private void method331() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt377; local7++) {
			@Pc(14) Class6_Sub10 local14 = this.aClass6_Sub10Array1[local7];
			@Pc(19) int local19 = local7 + 16386;
			Static187.aFloatArray42[0] = (float) local14.method5312();
			Static187.aFloatArray42[1] = (float) local14.method5321();
			Static187.aFloatArray42[2] = (float) local14.method5320();
			Static187.aFloatArray42[3] = 1.0F;
			OpenGL.glLightfv(local19, 4611, Static187.aFloatArray42, 0);
			@Pc(53) int local53 = local14.method5319();
			@Pc(59) float local59 = local14.method5314() / 255.0F;
			Static187.aFloatArray42[1] = local59 * (float) (local53 >> 8 & 0xFF);
			Static187.aFloatArray42[2] = (float) (local53 & 0xFF) * local59;
			Static187.aFloatArray42[0] = local59 * (float) (local53 >> 16 & 0xFF);
			OpenGL.glLightfv(local19, 4609, Static187.aFloatArray42, 0);
			OpenGL.glLightf(local19, 4617, 1.0F / (float) (local14.method5316() * local14.method5316()));
			OpenGL.glEnable(local19);
		}
		while (local7 < this.anInt389) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt389 = this.anInt377;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLclient!jaclib/memory/Buffer;ZI)Lclient!ob;")
	public Interface19 method332(@OriginalArg(0) int arg0, @OriginalArg(2) Buffer arg1, @OriginalArg(4) int arg2) {
		return (Interface19) (this.aBoolean36 ? new Class149_Sub1(this, arg0, arg1, arg2, false) : new Class170_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
	private void method333() {
		OpenGL.glViewport(this.anInt392, this.anInt387, this.anInt251, this.anInt250);
	}

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "()Z")
	@Override
	public boolean method6187() {
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6168(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method6127(arg2, arg3);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6158(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ac", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt382 = arg1;
		this.anInt394 = arg2;
		this.anInt401 = arg0;
		this.anInt376 = arg3;
		this.method336();
		this.method395();
		if (this.anInt378 == 3) {
			this.method373();
		} else if (this.anInt378 == 2) {
			this.method374();
		}
	}

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "(II)V")
	public void method334(@OriginalArg(0) int arg0) {
		if (this.anInt393 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt393 = arg0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt405;
		this.anInt405 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	public synchronized void method335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub37 local8 = new Class6_Sub37(arg1);
		local8.aLong278 = (long) arg0;
		this.aClass163_6.method4967(local8);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ci;Lclient!ku;)Lclient!qp;")
	@Override
	public Interface20 method6178(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Interface16 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6149(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(Z)V")
	private void method336() {
		@Pc(6) float[] local6 = this.aFloatArray4;
		@Pc(25) float local25 = (float) (-this.anInt401 * this.anInt386) / (float) this.anInt394;
		@Pc(40) float local40 = (float) (this.anInt386 * (this.anInt251 - this.anInt401)) / (float) this.anInt394;
		@Pc(51) float local51 = (float) (this.anInt382 * this.anInt386) / (float) this.anInt376;
		@Pc(66) float local66 = (float) ((this.anInt382 - this.anInt250) * this.anInt386) / (float) this.anInt376;
		if (local25 == local40 || local66 == local51) {
			local6[6] = 0.0F;
			local6[4] = 0.0F;
			local6[14] = 0.0F;
			local6[15] = 1.0F;
			local6[0] = 1.0F;
			local6[9] = 0.0F;
			local6[2] = 0.0F;
			local6[8] = 0.0F;
			local6[10] = 1.0F;
			local6[12] = 0.0F;
			local6[7] = 0.0F;
			local6[11] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = 1.0F;
			local6[13] = 0.0F;
			local6[1] = 0.0F;
		} else {
			@Pc(146) float local146 = (float) this.anInt386 * 2.0F;
			local6[5] = local146 / (local51 - local66);
			local6[14] = this.aFloat13 = -(local146 * (float) this.anInt380) / (float) (this.anInt380 - this.anInt386);
			local6[11] = -1.0F;
			local6[1] = 0.0F;
			local6[9] = (local51 + local66) / (-local66 + local51);
			local6[0] = local146 / (local40 - local25);
			local6[8] = (local25 + local40) / (local40 - local25);
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[12] = 0.0F;
			local6[7] = 0.0F;
			local6[15] = 0.0F;
			local6[10] = this.aFloat4 = (float) -(this.anInt386 + this.anInt380) / (float) (this.anInt380 - this.anInt386);
			local6[2] = 0.0F;
			local6[6] = 0.0F;
			local6[13] = 0.0F;
		}
		this.method383();
	}

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass115_Sub1_3.aFloat76 * (float) arg2 + this.aClass115_Sub1_3.aFloat79 * (float) arg1 + this.aClass115_Sub1_3.aFloat85 * (float) arg0 + this.aClass115_Sub1_3.aFloat80;
		@Pc(55) float local55 = this.aClass115_Sub1_3.aFloat76 * (float) arg5 + this.aClass115_Sub1_3.aFloat79 * (float) arg4 + this.aClass115_Sub1_3.aFloat85 * (float) arg3 + this.aClass115_Sub1_3.aFloat80;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt386 && (float) this.anInt386 > local55) {
			local57 |= 0x10;
		} else if (local30 > (float) this.anInt380 && local55 > (float) this.anInt380) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt394 * (this.aClass115_Sub1_3.aFloat83 * (float) arg2 + this.aClass115_Sub1_3.aFloat82 * (float) arg1 + this.aClass115_Sub1_3.aFloat86 * (float) arg0 + this.aClass115_Sub1_3.aFloat77) / (float) arg6);
		@Pc(157) int local157 = (int) (((float) arg4 * this.aClass115_Sub1_3.aFloat82 + (float) arg3 * this.aClass115_Sub1_3.aFloat86 + this.aClass115_Sub1_3.aFloat83 * (float) arg5 + this.aClass115_Sub1_3.aFloat77) * (float) this.anInt394 / (float) arg6);
		if ((float) local124 < this.aFloat15 && this.aFloat15 > (float) local157) {
			local57 |= 0x1;
		} else if (this.aFloat3 < (float) local124 && (float) local157 > this.aFloat3) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass115_Sub1_3.aFloat78 * (float) arg1 + (float) arg0 * this.aClass115_Sub1_3.aFloat81 + (float) arg2 * this.aClass115_Sub1_3.aFloat87 + this.aClass115_Sub1_3.aFloat84) * (float) this.anInt376 / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt376 * (this.aClass115_Sub1_3.aFloat84 + (float) arg5 * this.aClass115_Sub1_3.aFloat87 + (float) arg4 * this.aClass115_Sub1_3.aFloat78 + this.aClass115_Sub1_3.aFloat81 * (float) arg3) / (float) arg6);
		if (this.aFloat2 > (float) local224 && (float) local257 < this.aFloat2) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat19 && this.aFloat19 < (float) local257) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(FZF)V")
	public void method337(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat8 = arg0;
		this.aFloat5 = arg1;
		this.method341();
	}

	@OriginalMember(owner = "client!ac", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass115_Sub1_3.aFloat80 + (float) arg1 * this.aClass115_Sub1_3.aFloat79 + this.aClass115_Sub1_3.aFloat85 * (float) arg0 + (float) arg2 * this.aClass115_Sub1_3.aFloat76;
		if ((float) this.anInt386 > local28 || local28 > (float) this.anInt380) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass115_Sub1_3.aFloat83 * (float) arg2 + this.aClass115_Sub1_3.aFloat82 * (float) arg1 + this.aClass115_Sub1_3.aFloat86 * (float) arg0 + this.aClass115_Sub1_3.aFloat77) * (float) this.anInt394 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt376 * (this.aClass115_Sub1_3.aFloat78 * (float) arg1 + (float) arg0 * this.aClass115_Sub1_3.aFloat81 + (float) arg2 * this.aClass115_Sub1_3.aFloat87 + this.aClass115_Sub1_3.aFloat84) / local28);
		if ((float) local85 >= this.aFloat15 && this.aFloat3 >= (float) local85 && this.aFloat2 <= (float) local117 && this.aFloat19 >= (float) local117) {
			arg3[0] = (int) ((float) local85 - this.aFloat15);
			arg3[1] = (int) ((float) local117 - this.aFloat2);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lv;IIII)Lclient!ka;")
	@Override
	public Class92 method6153(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class92_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([I)V")
	@Override
	public void method6164(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt251;
		arg0[1] = this.anInt250;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)I")
	private int method338() {
		@Pc(5) int local5 = 0;
		this.aString2 = OpenGL.glGetString(7936).toLowerCase();
		this.aString1 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString2.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString2.indexOf("brian paul") != -1 || this.aString2.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static206.method3730(local45.replace('.', ' '), ' ');
		if (local53.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(71) int local71 = Static533.method7565(local53[0]);
				@Pc(77) int local77 = Static533.method7565(local53[1]);
				this.anInt381 = local71 * 10 + local77;
			} catch (@Pc(86) NumberFormatException local86) {
				local5 |= 0x4;
			}
		}
		if (this.anInt381 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(120) int[] local120 = new int[1];
		OpenGL.glGetIntegerv(34018, local120, 0);
		this.anInt388 = local120[0];
		OpenGL.glGetIntegerv(34929, local120, 0);
		this.anInt373 = local120[0];
		OpenGL.glGetIntegerv(34930, local120, 0);
		this.anInt400 = local120[0];
		if (this.anInt388 < 2 || this.anInt373 < 2 || this.anInt400 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean24 = Stream.a();
		this.aBoolean22 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean36 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean15 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean31 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean25 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean34 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean32 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean20 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean23 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean21 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean30 = false;
		this.aBoolean40 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean19 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean29 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean37 = this.aBoolean19 & this.aBoolean29;
		this.aBoolean17 = Class28.aString7.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static213.aFloatArray44, 0);
		this.aFloat9 = Static213.aFloatArray44[1];
		this.aFloat16 = Static213.aFloatArray44[0];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(B)V")
	private void method339() {
		if (this.aCanvas1 == null) {
			this.anInt210 = this.anInt161 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas1.getSize();
			this.anInt161 = local10.height;
			this.anInt210 = local10.width;
		}
		if (this.anInterface14_2 == null) {
			this.anInt251 = this.anInt210;
			this.anInt250 = this.anInt161;
			this.method333();
		}
		this.method356();
		this.la();
	}

	@OriginalMember(owner = "client!ac", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt391 > arg3) {
			this.anInt391 = arg3;
		}
		if (arg0 > this.anInt374) {
			this.anInt374 = arg0;
		}
		if (this.anInt398 > arg2) {
			this.anInt398 = arg2;
		}
		if (arg1 > this.anInt385) {
			this.anInt385 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method395();
		this.method317();
	}

	@OriginalMember(owner = "client!ac", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method348();
		this.method359(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Lclient!za;")
	@Override
	public Class6_Sub16 method6125(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub16_Sub2 local8 = new Class6_Sub16_Sub2(arg0);
		this.aClass163_1.method4967(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZ)V")
	public void method340(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean38) {
			this.aBoolean38 = arg0;
			this.method315();
			this.anInt370 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(B)V")
	private void method341() {
		this.aFloat7 = (float) (this.anInt380 - this.anInt397) - this.aFloat5;
		this.aFloat1 = this.aFloat7 - this.aFloat8 * (float) this.anInt399;
		if (this.aFloat1 < (float) this.anInt386) {
			this.aFloat1 = (float) this.anInt386;
		}
		OpenGL.glFogf(2915, this.aFloat1);
		OpenGL.glFogf(2916, this.aFloat7);
		Static213.aFloatArray44[0] = (float) (this.anInt404 & 0xFF0000) / 1.671168E7F;
		Static213.aFloatArray44[2] = (float) (this.anInt404 & 0xFF) / 255.0F;
		Static213.aFloatArray44[1] = (float) (this.anInt404 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static213.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method6169(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class6_Sub37 local19;
		while (!this.aClass163_3.method4968()) {
			local19 = (Class6_Sub37) this.aClass163_3.method4969();
			Static448.anIntArray423[local7++] = (int) local19.aLong278;
			this.anInt366 -= local19.anInt7833;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static448.anIntArray423, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static448.anIntArray423, 0);
			local7 = 0;
		}
		while (!this.aClass163_4.method4968()) {
			local19 = (Class6_Sub37) this.aClass163_4.method4969();
			Static448.anIntArray423[local7++] = (int) local19.aLong278;
			this.anInt367 -= local19.anInt7833;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static448.anIntArray423, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static448.anIntArray423, 0);
			local7 = 0;
		}
		while (!this.aClass163_5.method4968()) {
			local19 = (Class6_Sub37) this.aClass163_5.method4969();
			Static448.anIntArray423[local7++] = local19.anInt7833;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static448.anIntArray423, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static448.anIntArray423, 0);
			local7 = 0;
		}
		while (!this.aClass163_6.method4968()) {
			local19 = (Class6_Sub37) this.aClass163_6.method4969();
			Static448.anIntArray423[local7++] = (int) local19.aLong278;
			this.anInt365 -= local19.anInt7833;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static448.anIntArray423, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static448.anIntArray423, 0);
		}
		while (!this.aClass163_2.method4968()) {
			local19 = (Class6_Sub37) this.aClass163_2.method4969();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt7833);
		}
		@Pc(216) Class6 local216;
		while (!this.bf.method4968()) {
			local216 = this.bf.method4969();
			OpenGL.glDeleteProgramARB((int) local216.aLong278);
		}
		while (!this.aClass163_7.method4968()) {
			local216 = this.aClass163_7.method4969();
			OpenGL.glDeleteObjectARB(local216.aLong278);
		}
		while (!this.aClass163_2.method4968()) {
			local19 = (Class6_Sub37) this.aClass163_2.method4969();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt7833);
		}
		this.aClass368_1.method8475();
		if (this.E() > 100663296 && this.aLong3 + 60000L < Static582.method8056()) {
			System.gc();
			this.aLong3 = Static582.method8056();
		}
		this.anInt361 = local11;
	}

	@OriginalMember(owner = "client!ac", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt251 < arg2) {
			arg2 = this.anInt251;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt250) {
			arg3 = this.anInt250;
		}
		this.anInt391 = arg3;
		this.anInt385 = arg1;
		this.anInt374 = arg0;
		this.anInt398 = arg2;
		OpenGL.glEnable(3089);
		this.method395();
		this.method317();
	}

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "(I)V")
	private void method343() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL1.b()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static344.method5698(1000L);
		}
	}

	@OriginalMember(owner = "client!ac", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt390;
		if (local15 || this.aFloat18 != arg1 || arg2 != this.aFloat11) {
			this.anInt390 = arg0;
			this.aFloat11 = arg2;
			this.aFloat18 = arg1;
			if (local15) {
				this.aFloat21 = (float) (this.anInt390 & 0xFF) / 255.0F;
				this.aFloat14 = (float) (this.anInt390 & 0xFF00) / 65280.0F;
				this.aFloat17 = (float) (this.anInt390 & 0xFF0000) / 1.671168E7F;
				this.method349();
			}
			this.method389();
		}
		if (this.aFloatArray1[0] == arg3 && this.aFloatArray1[1] == arg4 && arg5 == this.aFloatArray1[2]) {
			return;
		}
		this.aFloatArray1[0] = arg3;
		this.aFloatArray1[1] = arg4;
		this.aFloatArray1[2] = arg5;
		this.aFloatArray2[0] = -arg3;
		this.aFloatArray2[2] = -arg5;
		this.aFloatArray2[1] = -arg4;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray3[2] = arg5 * local142;
		this.aFloatArray3[0] = arg3 * local142;
		this.aFloatArray3[1] = local142 * arg4;
		this.aFloatArray5[1] = -this.aFloatArray3[1];
		this.aFloatArray5[2] = -this.aFloatArray3[2];
		this.aFloatArray5[0] = -this.aFloatArray3[0];
		this.method320();
		this.anInt375 = (int) (arg5 * 256.0F / arg4);
		this.anInt384 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ac", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt380;
	}

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "()Z")
	@Override
	public boolean method6182() {
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZJ)V")
	public synchronized void method344(@OriginalArg(1) long arg0) {
		@Pc(13) Class6 local13 = new Class6();
		local13.aLong278 = arg0;
		this.aClass163_7.method4967(local13);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)V")
	public void method345(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean18 != arg0) {
			this.aBoolean18 = arg0;
			this.method382();
			this.anInt370 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFBF)V")
	private void method346(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean28) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean28 = true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFFFI)V")
	public void method347(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static213.aFloatArray44[1] = arg0;
		Static213.aFloatArray44[3] = arg3;
		Static213.aFloatArray44[2] = arg1;
		Static213.aFloatArray44[0] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static213.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt386;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(19) Class1_Sub3 local19 = (Class1_Sub3) arg5;
		@Pc(22) Class2_Sub1_Sub1 local22 = local19.aClass2_Sub1_Sub1_3;
		this.method318();
		this.method352(local19.aClass2_Sub1_Sub1_3);
		this.method359(1);
		this.method388(8448, 7681);
		this.method329(0, 768, 34167);
		@Pc(52) float local52 = local22.aFloat118 / (float) local22.anInt5128;
		@Pc(59) float local59 = local22.aFloat119 / (float) local22.anInt5127;
		@Pc(66) float local66 = (float) -arg0 + (float) arg2;
		@Pc(72) float local72 = (float) arg3 - (float) arg1;
		@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local72 * local72 + local66 * local66)));
		@Pc(89) float local89 = local66 * local85;
		@Pc(93) float local93 = local72 * local85;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(115) int local115 = arg10 % (arg9 + arg8);
		@Pc(120) float local120 = local89 * (float) arg8;
		@Pc(125) float local125 = (float) arg8 * local93;
		@Pc(127) float local127 = 0.0F;
		@Pc(129) float local129 = 0.0F;
		@Pc(131) float local131 = local120;
		@Pc(133) float local133 = local125;
		if (arg8 >= local115) {
			local131 = (float) (arg8 - local115) * local89;
			local133 = local93 * (float) (arg8 - local115);
		} else {
			local127 = (float) (arg9 + arg8 - local115) * local89;
			local129 = local93 * (float) (arg9 + arg8 - local115);
		}
		@Pc(183) float local183 = (float) arg0 + local127 + 0.35F;
		@Pc(190) float local190 = (float) arg1 + local129 + 0.35F;
		@Pc(195) float local195 = local89 * (float) arg9;
		@Pc(200) float local200 = (float) arg9 * local93;
		while (true) {
			if (arg2 <= arg0) {
				if ((float) arg2 + 0.35F > local183) {
					break;
				}
				if ((float) arg2 > local131 + local183) {
					local131 = (float) arg2 - local183;
				}
			} else {
				if (local183 > (float) arg2 + 0.35F) {
					break;
				}
				if (local183 + local131 > (float) arg2) {
					local131 = (float) arg2 - local183;
				}
			}
			if (arg3 <= arg1) {
				if ((float) arg3 + 0.35F > local190) {
					break;
				}
				if (local133 + local190 < (float) arg3) {
					local133 = (float) arg3 - local190;
				}
			} else {
				if ((float) arg3 + 0.35F < local190) {
					break;
				}
				if ((float) arg3 < local133 + local190) {
					local133 = (float) arg3 - local190;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local52 * ((float) -arg6 + local183), local59 * ((float) -arg7 + local190));
			OpenGL.glVertex2f(local183, local190);
			OpenGL.glTexCoord2f(((float) -arg6 + local131 + local183) * local52, ((float) -arg7 + local133 + local190) * local59);
			OpenGL.glVertex2f(local183 + local131, local190 + local133);
			OpenGL.glEnd();
			local183 += local195 + local131;
			local190 += local133 + local200;
			local133 = local125;
			local131 = local120;
		}
		this.method329(0, 768, 5890);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!pf;I)V")
	@Override
	public void method6148(@OriginalArg(0) Class257 arg0, @OriginalArg(1) int arg1) {
		this.aClass364_1.method8397(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "(I)V")
	private void method348() {
		if (this.anInt370 == 1) {
			return;
		}
		this.method366();
		this.method345(false);
		this.method340(false);
		this.method370(false);
		this.method364(false);
		this.method352((Class2) null);
		this.method323(-2);
		this.method385(1);
		this.anInt370 = 1;
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(B)V")
	private void method349() {
		Static213.aFloatArray44[1] = this.aFloat14 * this.aFloat12;
		Static213.aFloatArray44[0] = this.aFloat12 * this.aFloat17;
		Static213.aFloatArray44[3] = 1.0F;
		Static213.aFloatArray44[2] = this.aFloat12 * this.aFloat21;
		OpenGL.glLightModelfv(2899, Static213.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "(I)V")
	public void method350() {
		if (this.anInt370 == 8) {
			return;
		}
		this.method393();
		this.method345(true);
		this.method370(true);
		this.method364(true);
		this.method359(1);
		this.anInt370 = 8;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!di;Lclient!di;FLclient!di;)Lclient!di;")
	@Override
	public Class31 method6132(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class31 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean23 && this.aBoolean40) {
			@Pc(15) Class31_Sub1_Sub2 local15 = null;
			@Pc(18) Class31_Sub1 local18 = (Class31_Sub1) arg0;
			@Pc(21) Class31_Sub1 local21 = (Class31_Sub1) arg1;
			@Pc(25) Class2_Sub2 local25 = local18.method2212();
			@Pc(29) Class2_Sub2 local29 = local21.method2212();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local25.anInt5072 <= local29.anInt5072 ? local29.anInt5072 : local25.anInt5072;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class31_Sub1_Sub2) {
					@Pc(56) Class31_Sub1_Sub2 local56 = (Class31_Sub1_Sub2) arg3;
					if (local44 == local56.method2217()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class31_Sub1_Sub2(this, local44);
				}
				if (local15.method2216(local25, arg2, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "()Z")
	@Override
	public boolean method6163() {
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method364(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!cu;)V")
	public void method352(@OriginalArg(1) Class2 arg0) {
		@Pc(15) Class2 local15 = this.aClass2Array1[this.anInt393];
		if (arg0 != local15) {
			if (arg0 == null) {
				OpenGL.glDisable(local15.anInt8317);
			} else {
				if (local15 == null) {
					OpenGL.glEnable(arg0.anInt8317);
				} else if (arg0.anInt8317 != local15.anInt8317) {
					OpenGL.glDisable(local15.anInt8317);
					OpenGL.glEnable(arg0.anInt8317);
				}
				OpenGL.glBindTexture(arg0.anInt8317, arg0.method6973());
			}
			this.aClass2Array1[this.anInt393] = arg0;
		}
		this.anInt370 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static485.method7133(arg1, arg2, this, arg0, arg3);
	}

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "(I)V")
	private void method353() {
		this.method323(-2);
		for (@Pc(14) int local14 = this.anInt388 - 1; local14 >= 0; local14--) {
			this.method334(local14);
			this.method352((Class2) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method388(8448, 8448);
		this.method329(2, 770, 34168);
		this.method380();
		this.anInt369 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt368 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean11 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean12 = true;
		this.method345(true);
		this.method340(true);
		this.method370(true);
		this.method364(true);
		this.method356();
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
		@Pc(133) float[] local133 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(135) int local135 = 0; local135 < 8; local135++) {
			@Pc(141) int local141 = local135 + 16384;
			OpenGL.glLightfv(local141, 4608, local133, 0);
			OpenGL.glLightf(local141, 4615, 0.0F);
			OpenGL.glLightf(local141, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt390 = this.anInt404 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
	@Override
	public void method6137(@OriginalArg(0) int arg0) {
		this.method325();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6104(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method348();
		this.method359(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 - (float) arg1;
		if (local17 == 0.0F && local23 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(44) float local44 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local23 * local23)));
			local23 *= local44;
			local17 *= local44;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local17 + (float) arg2 + 0.35F, local23 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "()Z")
	@Override
	public boolean method6165() {
		if (this.aClass6_Sub9_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass6_Sub9_Sub1_1.method1702()) {
			if (!this.aClass294_1.method7238(this.aClass6_Sub9_Sub1_1)) {
				return false;
			}
			this.aClass368_1.method8476();
		}
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!dw;ZI)V")
	public void method354(@OriginalArg(0) int arg0, @OriginalArg(2) Interface9 arg1, @OriginalArg(4) int arg2) {
		@Pc(14) int local14 = arg1.method7037();
		@Pc(21) int local21 = arg2 * this.method328(local14);
		this.method319(arg1);
		OpenGL.glDrawElements(4, arg0, local14, (long) local21 + arg1.method7038());
	}

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt367 + this.anInt366 + this.anInt365;
	}

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "(II)I")
	public int method355(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "(I)V")
	public void method356() {
		if (this.anInt378 != 0) {
			this.anInt378 = 0;
			this.anInt370 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!gk;Lclient!gk;Lclient!gk;Lclient!gk;I)V")
	public void method357(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class121 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method376(arg3.anInterface19_3);
			OpenGL.glVertexPointer(arg3.aByte35, arg3.aShort37, this.anInterface19_1.method7396(), this.anInterface19_1.method7393() + (long) arg3.aByte34);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method376(arg1.anInterface19_3);
			OpenGL.glNormalPointer(arg1.aShort37, this.anInterface19_1.method7396(), this.anInterface19_1.method7393() + (long) arg1.aByte34);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method376(arg0.anInterface19_3);
			OpenGL.glColorPointer(arg0.aByte35, arg0.aShort37, this.anInterface19_1.method7396(), this.anInterface19_1.method7393() + (long) arg0.aByte34);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method376(arg2.anInterface19_3);
			OpenGL.glTexCoordPointer(arg2.aByte35, arg2.aShort37, this.anInterface19_1.method7396(), this.anInterface19_1.method7393() + (long) arg2.aByte34);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!hg;)V")
	public void method358(@OriginalArg(1) Interface14 arg0) {
		if (this.anInt363 < 0 || arg0 != this.anInterface14Array1[this.anInt363]) {
			throw new RuntimeException();
		}
		this.anInterface14Array1[this.anInt363--] = null;
		arg0.method7256();
		if (this.anInt363 >= 0) {
			this.anInterface14_2 = this.anInterface14Array1[this.anInt363];
			this.anInterface14_2.method7252();
		} else {
			this.anInterface14_2 = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean16) {
			throw new RuntimeException("");
		}
		this.anInt402 = arg3;
		this.anInt372 = arg0;
		this.anInt395 = arg1;
		this.anInt403 = arg2;
		if (this.aBoolean35) {
			this.aClass69_1.aClass16_Sub9_1.method8768();
			this.aClass69_1.aClass16_Sub9_1.method8767();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIZ)Lclient!ufa;")
	@Override
	public Class4 method6160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class4_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(BI)V")
	public void method359(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt369) {
			return;
		}
		@Pc(22) boolean local22;
		@Pc(26) byte local26;
		if (arg0 == 1) {
			local22 = true;
			local26 = 1;
		} else if (arg0 == 2) {
			local22 = false;
			local26 = 2;
		} else if (arg0 == 128) {
			local22 = true;
			local26 = 3;
		} else {
			local26 = 0;
			local22 = false;
		}
		if (!this.aBoolean12) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean12 = true;
		}
		if (this.aBoolean11 != local22) {
			if (local22) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean11 = local22;
		}
		if (local26 != this.anInt368) {
			if (local26 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local26 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local26 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt368 = local26;
		}
		this.anInt369 = arg0;
		this.anInt370 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
	@Override
	public void method6127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "()Z")
	@Override
	public boolean method6129() {
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean16 = false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method348();
		this.method359(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean15) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean15) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "()Lclient!eca;")
	@Override
	public Class77 method6162() {
		@Pc(7) int local7 = -1;
		if (this.aString2.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString2.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString2.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class77(local7, "OpenGL", this.anInt381, this.aString1, 0L);
	}

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "(II)V")
	public synchronized void method361(@OriginalArg(0) int arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong278 = (long) arg0;
		this.bf.method4967(local7);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)V")
	public synchronized void method362(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub37 local8 = new Class6_Sub37(arg0);
		local8.aLong278 = (long) arg1;
		this.aClass163_4.method4967(local8);
	}

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "()Z")
	@Override
	public boolean method6186() {
		return this.aBoolean15 && (!this.method6131() || this.aBoolean37);
	}

	@OriginalMember(owner = "client!ac", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method359(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "(I)V")
	private void method363() {
		if (this.anInt378 != 3) {
			this.anInt378 = 3;
			this.method373();
			this.method322();
			this.anInt370 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!tw;Z)Lclient!ufa;")
	@Override
	public Class4 method6121(@OriginalArg(0) Class331 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt9648 * arg0.anInt9650];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray94 == null) {
			for (local21 = 0; local21 < arg0.anInt9648; local21++) {
				for (local25 = 0; local25 < arg0.anInt9650; local25++) {
					@Pc(83) int local83 = arg0.anIntArray507[arg0.aByteArray93[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt9648; local21++) {
				for (local25 = 0; local25 < arg0.anInt9650; local25++) {
					local12[local16++] = arg0.anIntArray507[arg0.aByteArray93[local14] & 0xFF] | arg0.aByteArray94[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(120) Class4 local120 = this.method6111(arg0.anInt9650, arg0.anInt9648, local12, arg0.anInt9650);
		local120.method7703(arg0.anInt9652, arg0.anInt9649, arg0.anInt9647, arg0.anInt9651);
		return local120;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[Lclient!cba;)V")
	@Override
	public void method6181(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub10[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass6_Sub10Array1[local7] = arg1[local7];
		}
		this.anInt377 = arg0;
		if (this.anInt378 != 1) {
			this.method331();
		}
	}

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt406;
		this.anInt406 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class245 method6108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class245_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!mv;[Lclient!tw;Z)Lclient!da;")
	@Override
	public Class34 method6167(@OriginalArg(0) Class213 arg0, @OriginalArg(1) Class331[] arg1) {
		return new Class34_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BZ)V")
	public void method364(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean13 != arg0) {
			this.aBoolean13 = arg0;
			this.method365();
			this.anInt370 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "()Z")
	@Override
	public boolean method6130() {
		return this.aClass6_Sub9_Sub1_1 != null && (this.anInt358 <= 1 || this.aBoolean37);
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "(B)V")
	private void method365() {
		OpenGL.glDepthMask(this.aBoolean13 && this.aBoolean41);
	}

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "()Lclient!hba;")
	@Override
	public Class115 method6184() {
		return new Class115_Sub1();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([IIIIIZ)Lclient!ufa;")
	@Override
	public Class4 method6133(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class4_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "(B)V")
	private void method366() {
		if (this.anInt378 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt251 > 0 && this.anInt250 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt251, (double) this.anInt250, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt378 = 1;
		this.anInt370 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZII[B)Lclient!ob;")
	public Interface19 method367(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface19) (this.aBoolean36 && (!arg1 || this.aBoolean39) ? new Class149_Sub1(this, arg2, arg3, arg0, arg1) : new Class170_Sub2(this, arg2, arg3, arg0));
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)V")
	public synchronized void method368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class6_Sub37 local16 = new Class6_Sub37(arg0);
		local16.aLong278 = (long) arg1;
		this.aClass163_3.method4967(local16);
	}

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "()V")
	@Override
	public void method6188() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "()V")
	@Override
	protected void method6136() {
		for (@Pc(10) Class6 local10 = this.aClass163_1.method4966(); local10 != null; local10 = this.aClass163_1.method4965()) {
			((Class6_Sub16_Sub2) local10).method4326();
		}
		if (this.aClass294_1 != null) {
			this.aClass294_1.method7240();
		}
		if (this.anOpenGL1 != null) {
			this.method325();
			@Pc(40) Enumeration local40 = this.aHashtable1.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable1.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean10) {
			Static40.method1346(true, false);
			this.aBoolean10 = false;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(ILclient!hg;)V")
	public void method369(@OriginalArg(1) Interface14 arg0) {
		if (this.anInt362 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt362 >= 0) {
			this.anInterface14Array2[this.anInt362].method7254();
		}
		this.anInterface14_1 = this.anInterface14Array2[++this.anInt362] = arg0;
		this.anInterface14_1.method7253();
	}

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method348();
		this.method359(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "()V")
	@Override
	public void method6175() {
	}

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "()Z")
	@Override
	public boolean method6143() {
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass294_1.method7239(arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(ZZ)V")
	public void method370(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean14) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean14 = arg0;
		this.anInt370 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "(II)V")
	public void method371(@OriginalArg(0) int arg0) {
		Static213.aFloatArray44[3] = (float) (arg0 >>> 24) / 255.0F;
		Static213.aFloatArray44[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static213.aFloatArray44[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static213.aFloatArray44[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static213.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!gca;B)V")
	public void method372(@OriginalArg(0) Class115_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method3377(), 0);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	@Override
	public void method6112(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(II)Lclient!ci;")
	@Override
	public Interface5 method6176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "(B)V")
	private void method373() {
		@Pc(21) float local21 = this.aFloat20 * (float) -this.anInt401 / (float) this.anInt394;
		@Pc(33) float local33 = this.aFloat20 * (float) -this.anInt382 / (float) this.anInt376;
		@Pc(48) float local48 = this.aFloat20 * (float) (this.anInt251 - this.anInt401) / (float) this.anInt394;
		@Pc(63) float local63 = (float) (this.anInt250 - this.anInt382) * this.aFloat20 / (float) this.anInt376;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local48 != local21 && local33 != local63) {
			OpenGL.glOrtho((double) local21, (double) local48, (double) -local63, (double) -local33, (double) this.anInt386, (double) this.anInt380);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "(B)V")
	private void method374() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray4, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ac", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt401, this.anInt382, this.anInt394, this.anInt376 };
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(IIII)V")
	public void method375(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!di;)V")
	@Override
	public void method6138(@OriginalArg(0) Class31 arg0) {
		this.aClass31_Sub1_1 = (Class31_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ob;I)V")
	public void method376(@OriginalArg(0) Interface19 arg0) {
		if (this.anInterface19_1 != arg0) {
			if (this.aBoolean36) {
				OpenGL.glBindBufferARB(34962, arg0.method7394());
			}
			this.anInterface19_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(III)V")
	public void method377(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt387 = arg0;
		this.anInt392 = arg1;
		this.method333();
		this.method317();
	}

	@OriginalMember(owner = "client!ac", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt374 || this.anInt398 < arg0 - arg2 || this.anInt385 > arg1 + arg2 || arg1 - arg2 > this.anInt391) {
			return;
		}
		this.method348();
		this.method359(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(67) float local67 = (float) arg0 + 0.35F;
		@Pc(72) float local72 = (float) arg1 + 0.35F;
		@Pc(76) int local76 = arg2 << 1;
		if ((float) local76 < this.aFloat16) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local67 + 1.0F, local72 + 1.0F);
			OpenGL.glVertex2f(local67 + 1.0F, -1.0F + local72);
			OpenGL.glVertex2f(local67 - 1.0F, local72 - 1.0F);
			OpenGL.glVertex2f(local67 - 1.0F, local72 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat9 >= (float) local76) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local76);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local67, local72);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local67, local72);
			@Pc(131) int local131 = 262144 / (arg2 * 6);
			if (local131 <= 64) {
				local131 = 64;
			} else if (local131 > 512) {
				local131 = 512;
			}
			local131 = Static48.method1561(local131);
			OpenGL.glVertex2f(local67 + (float) arg2, local72);
			for (@Pc(158) int local158 = 16384 - local131; local158 > 0; local158 -= local131) {
				OpenGL.glVertex2f(local67 + Class6_Sub1_Sub36.aFloatArray74[local158] * (float) arg2, Class6_Sub1_Sub36.aFloatArray75[local158] * (float) arg2 + local72);
			}
			OpenGL.glVertex2f((float) arg2 + local67, local72);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!qp;)V")
	@Override
	public void method6103(@OriginalArg(0) Interface20 arg0) {
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(Z)V")
	public void method378() {
		if (this.anInt370 == 4) {
			return;
		}
		this.method366();
		this.method345(false);
		this.method340(false);
		this.method370(false);
		this.method364(false);
		this.method323(-2);
		this.method359(1);
		this.anInt370 = 4;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(FZ)V")
	public void method379(@OriginalArg(0) float arg0) {
		if (this.aFloat20 != arg0) {
			this.aFloat20 = arg0;
			if (this.anInt378 == 3) {
				this.method373();
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()Z")
	@Override
	public boolean method6110() {
		return this.aClass69_1.method2483();
	}

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "(I)V")
	private void method380() {
		if (this.aBoolean28) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean28 = false;
		}
	}

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(53) float local53;
		@Pc(41) float local41;
		if (this.aClass2_Sub1_Sub1_1 == null || this.aClass2_Sub1_Sub1_1.anInt5125 < arg2 || arg3 > this.aClass2_Sub1_Sub1_1.anInt5120) {
			this.aClass2_Sub1_Sub1_1 = Static197.method5043(arg3, this, arg6, arg2);
			this.aClass2_Sub1_Sub1_1.method4205(false, false);
			local53 = this.aClass2_Sub1_Sub1_1.aFloat119;
			local41 = this.aClass2_Sub1_Sub1_1.aFloat118;
		} else {
			this.aClass2_Sub1_Sub1_1.method4200(arg2, 6406, false, arg6, arg3);
			local41 = this.aClass2_Sub1_Sub1_1.aFloat118 * (float) arg2 / (float) this.aClass2_Sub1_Sub1_1.anInt5125;
			local53 = (float) arg3 * this.aClass2_Sub1_Sub1_1.aFloat119 / (float) this.aClass2_Sub1_Sub1_1.anInt5120;
		}
		this.method318();
		this.method352(this.aClass2_Sub1_Sub1_1);
		this.method359(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method371(arg5);
		this.method388(34165, 34165);
		this.method329(0, 768, 34166);
		this.method329(2, 770, 5890);
		this.method375(0, 34166);
		this.method375(2, 5890);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = local143 + (float) arg2;
		@Pc(156) float local156 = (float) arg3 + local146;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local143, local156);
		OpenGL.glTexCoord2f(local53, local41);
		OpenGL.glVertex2f(local151, local156);
		OpenGL.glTexCoord2f(local53, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method329(0, 768, 5890);
		this.method329(2, 770, 34166);
		this.method375(0, 5890);
		this.method375(2, 34166);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "()V")
	@Override
	public void method6119() {
		if (this.aClass6_Sub9_Sub1_1 != null && this.aClass6_Sub9_Sub1_1.method1702()) {
			this.aClass294_1.method7235(this.aClass6_Sub9_Sub1_1);
			this.aClass368_1.method8476();
		}
	}

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "(II)I")
	public int method381(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "(I)V")
	private void method382() {
		if (this.aBoolean18 && this.anInt399 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6145(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas2 == arg0) {
			local5 = this.aLong2;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable1.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas1 == arg0) {
			this.method339();
		}
	}

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "(B)V")
	private void method383() {
		this.aFloatArray4[10] = this.aFloat4;
		this.aFloatArray4[14] = this.aFloat13;
		this.aFloat10 = ((float) -this.anInt380 + this.aFloatArray4[14]) / this.aFloatArray4[10];
		this.aFloat6 = (float) this.anInt380;
	}

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "()I")
	@Override
	public int method6185() {
		return 4;
	}

	@OriginalMember(owner = "client!ac", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt372 = arg0;
		this.anInt403 = arg2;
		this.aBoolean16 = true;
		this.anInt395 = arg1;
		this.anInt402 = arg3;
	}

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "(II)V")
	public void method385(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method388(7681, 7681);
		} else if (arg0 == 0) {
			this.method388(8448, 8448);
		} else if (arg0 == 2) {
			this.method388(7681, 34165);
		} else if (arg0 == 3) {
			this.method388(8448, 260);
		} else if (arg0 == 4) {
			this.method388(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6154(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static555.aFloat181 = arg0;
		Static543.aFloat180 = arg2;
		Static333.aFloat131 = arg1;
	}

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "()V")
	@Override
	public void method6177() {
		this.aClass294_1.method7236();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZZB)V")
	public void method386(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt371 || this.aBoolean35 != this.aBoolean16) {
			@Pc(24) Class2_Sub1 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean16 ? 3 : 0;
			if (arg0 < 0) {
				this.method380();
			} else {
				local24 = this.aClass368_1.method8473(arg0);
				@Pc(58) Class254 local58 = super.anInterface7_10.method6931(arg0);
				if (local58.aByte96 == 0 && local58.aByte100 == 0) {
					this.method380();
				} else {
					@Pc(74) int local74 = local58.aBoolean616 ? 64 : 128;
					@Pc(78) int local78 = local74 * 50;
					this.method346((float) (this.anInt361 % local78 * local58.aByte96) / (float) local78, 0.0F, (float) (local58.aByte100 * (this.anInt361 % local78)) / (float) local78);
				}
				local26 = local58.anInt7797;
				if (!this.aBoolean16) {
					local37 = local58.aByte95;
					local30 = local58.anInt7800;
					local28 = local58.aByte94;
				}
			}
			this.aClass69_1.method2484(arg2, arg1, local30, local28, local37);
			if (!this.aClass69_1.method2485(local24, local26)) {
				this.method352(local24);
				this.method385(local26);
			}
			this.anInt371 = arg0;
			this.aBoolean35 = this.aBoolean16;
		}
		this.anInt370 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLclient!hg;)V")
	public void method387(@OriginalArg(1) Interface14 arg0) {
		if (this.aBoolean19) {
			this.method369(arg0);
			this.method324(arg0);
		} else if (this.anInt364 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt364 >= 0) {
				this.anInterface14Array3[this.anInt364].method7251();
			}
			this.anInterface14_1 = this.anInterface14_2 = this.anInterface14Array3[++this.anInt364] = arg0;
			this.anInterface14_1.method7255();
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(III)V")
	public void method388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt393 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(8) boolean local8 = false;
		if (this.anInt383 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local8 = true;
			this.anInt383 = arg1;
		}
		if (arg0 != this.anInt379) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			this.anInt379 = arg0;
			local8 = true;
		}
		if (local8) {
			this.anInt370 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "(B)V")
	private void method389() {
		Static213.aFloatArray44[3] = 1.0F;
		Static213.aFloatArray44[0] = this.aFloat17 * this.aFloat18;
		Static213.aFloatArray44[1] = this.aFloat14 * this.aFloat18;
		Static213.aFloatArray44[2] = this.aFloat21 * this.aFloat18;
		OpenGL.glLightfv(16384, 4609, Static213.aFloatArray44, 0);
		Static213.aFloatArray44[2] = this.aFloat21 * -this.aFloat11;
		Static213.aFloatArray44[3] = 1.0F;
		Static213.aFloatArray44[0] = this.aFloat17 * -this.aFloat11;
		Static213.aFloatArray44[1] = -this.aFloat11 * this.aFloat14;
		OpenGL.glLightfv(16385, 4609, Static213.aFloatArray44, 0);
	}

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "(B)V")
	public void method390() {
		if (this.anInt370 == 16) {
			return;
		}
		this.method363();
		this.method345(true);
		this.method370(true);
		this.method364(true);
		this.method359(1);
		this.anInt370 = 16;
	}

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "(I)V")
	@Override
	public void method6170(@OriginalArg(0) int arg0) {
		this.method343();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == arg2 && arg3 == arg1) {
			return;
		}
		this.method348();
		this.method359(1);
		@Pc(34) float local34 = (float) -arg0 + (float) arg2;
		@Pc(41) float local41 = (float) -arg1 + (float) arg3;
		@Pc(54) float local54 = (float) (1.0D / Math.sqrt((double) (local41 * local41 + local34 * local34)));
		@Pc(58) float local58 = local41 * local54;
		@Pc(62) float local62 = local34 * local54;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(83) int local83 = arg7 % (arg6 + arg5);
		@Pc(88) float local88 = local62 * (float) arg5;
		@Pc(93) float local93 = local58 * (float) arg5;
		@Pc(95) float local95 = 0.0F;
		@Pc(97) float local97 = 0.0F;
		@Pc(99) float local99 = local88;
		@Pc(101) float local101 = local93;
		if (local83 <= arg5) {
			local101 = local58 * (float) (arg5 - local83);
			local99 = (float) (arg5 - local83) * local62;
		} else {
			local95 = local62 * (float) (arg6 + arg5 - local83);
			local97 = (float) (arg5 + arg6 - local83) * local58;
		}
		@Pc(149) float local149 = (float) arg0 + local95 + 0.35F;
		@Pc(156) float local156 = local97 + (float) arg1 + 0.35F;
		@Pc(161) float local161 = (float) arg6 * local62;
		@Pc(166) float local166 = (float) arg6 * local58;
		while (true) {
			if (arg2 > arg0) {
				if (local149 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local149 + local99) {
					local99 = (float) arg2 - local149;
				}
			} else {
				if ((float) arg2 + 0.35F > local149) {
					break;
				}
				if ((float) arg2 > local149 + local99) {
					local99 = (float) arg2 - local149;
				}
			}
			if (arg3 > arg1) {
				if ((float) arg3 + 0.35F < local156) {
					break;
				}
				if ((float) arg3 < local101 + local156) {
					local101 = (float) arg3 - local156;
				}
			} else {
				if ((float) arg3 + 0.35F > local156) {
					break;
				}
				if (local156 + local101 < (float) arg3) {
					local101 = (float) arg3 - local156;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local149, local156);
			OpenGL.glVertex2f(local99 + local149, local101 + local156);
			OpenGL.glEnd();
			local156 += local166 + local101;
			local149 += local99 + local161;
			local99 = local88;
			local101 = local93;
		}
	}

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "(B)V")
	public void method391() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "(I)V")
	private void method392() {
		this.aClass2Array1 = new Class2[this.anInt388];
		this.aClass2_Sub1_1 = new Class2_Sub1(this, 3553, 6408, 1, 1);
		new Class2_Sub1(this, 3553, 6408, 1, 1);
		new Class2_Sub1(this, 3553, 6408, 1, 1);
		this.aClass92_Sub2_7 = new Class92_Sub2(this);
		this.aClass92_Sub2_6 = new Class92_Sub2(this);
		this.aClass92_Sub2_10 = new Class92_Sub2(this);
		this.aClass92_Sub2_8 = new Class92_Sub2(this);
		this.aClass92_Sub2_5 = new Class92_Sub2(this);
		this.aClass92_Sub2_3 = new Class92_Sub2(this);
		this.aClass92_Sub2_9 = new Class92_Sub2(this);
		this.aClass92_Sub2_2 = new Class92_Sub2(this);
		this.aClass92_Sub2_1 = new Class92_Sub2(this);
		this.aClass92_Sub2_4 = new Class92_Sub2(this);
		if (this.aBoolean40) {
			this.aClass297_2 = new Class297(this);
			new Class297(this);
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)I")
	@Override
	public int method6140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "(I)V")
	private void method393() {
		if (this.anInt378 != 2) {
			this.anInt378 = 2;
			this.method374();
			this.method322();
			this.anInt370 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!hba;)V")
	@Override
	public void method6122(@OriginalArg(0) Class115 arg0) {
		this.aClass115_Sub1_3.method6282(arg0);
		this.aClass115_Sub1_4.method6282(this.aClass115_Sub1_3);
		this.aClass115_Sub1_4.method3375();
		this.aClass115_Sub1_5.method3376(this.aClass115_Sub1_4);
		if (this.anInt378 != 1) {
			this.method322();
		}
	}

	@OriginalMember(owner = "client!ac", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt360 = 0;
		while (arg0 > 1) {
			this.anInt360++;
			arg0 >>= 0x1;
		}
		this.anInt359 = 0x1 << this.anInt360;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIF)Lclient!cba;")
	@Override
	public Class6_Sub10 method6128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub10_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean41 = arg0;
		this.method365();
	}

	@OriginalMember(owner = "client!ac", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat12 != arg0) {
			this.aFloat12 = arg0;
			this.method349();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6113(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = null;
		this.aLong1 = 0L;
		if (arg0 == null || arg0 == this.aCanvas2) {
			this.aLong1 = this.aLong2;
			this.aCanvas1 = this.aCanvas2;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable1.get(arg0);
			this.aLong1 = local26;
			this.aCanvas1 = arg0;
		}
		if (this.aCanvas1 == null || this.aLong1 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong1);
		this.method339();
	}

	@OriginalMember(owner = "client!ac", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass115_Sub1_3.aFloat80 + this.aClass115_Sub1_3.aFloat76 * (float) arg2 + (float) arg0 * this.aClass115_Sub1_3.aFloat85 + this.aClass115_Sub1_3.aFloat79 * (float) arg1;
		if (local28 < (float) this.anInt386 || local28 > (float) this.anInt380) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((this.aClass115_Sub1_3.aFloat77 + (float) arg2 * this.aClass115_Sub1_3.aFloat83 + this.aClass115_Sub1_3.aFloat86 * (float) arg0 + (float) arg1 * this.aClass115_Sub1_3.aFloat82) * (float) this.anInt394 / (float) arg3);
		@Pc(119) int local119 = (int) ((this.aClass115_Sub1_3.aFloat84 + (float) arg1 * this.aClass115_Sub1_3.aFloat78 + (float) arg0 * this.aClass115_Sub1_3.aFloat81 + (float) arg2 * this.aClass115_Sub1_3.aFloat87) * (float) this.anInt376 / (float) arg3);
		if ((float) local86 >= this.aFloat15 && this.aFloat3 >= (float) local86 && (float) local119 >= this.aFloat2 && (float) local119 <= this.aFloat19) {
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local119 - this.aFloat2);
			arg4[0] = (int) ((float) local86 - this.aFloat15);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(ZI)V")
	public void method394(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean26) {
			this.aBoolean26 = arg0;
			this.method315();
		}
	}

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "()Z")
	@Override
	public boolean method6151() {
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "(I)V")
	private void method395() {
		this.aFloat2 = (float) (this.anInt385 - this.anInt382);
		this.aFloat15 = (float) (this.anInt374 - this.anInt401);
		this.aFloat19 = (float) (this.anInt391 - this.anInt382);
		this.aFloat3 = (float) (this.anInt398 - this.anInt401);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(Lclient!hg;I)V")
	public void method396(@OriginalArg(0) Interface14 arg0) {
		if (this.aBoolean19) {
			this.method321(arg0);
			this.method358(arg0);
		} else if (this.anInt364 >= 0 && arg0 == this.anInterface14Array3[this.anInt364]) {
			this.anInterface14Array3[this.anInt364--] = null;
			arg0.method7251();
			if (this.anInt364 < 0) {
				this.anInterface14_1 = this.anInterface14_2 = null;
			} else {
				this.anInterface14_1 = this.anInterface14_2 = this.anInterface14Array3[this.anInt364];
				this.anInterface14_1.method7255();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg5;
		@Pc(9) Class2_Sub1_Sub1 local9 = local6.aClass2_Sub1_Sub1_3;
		this.method318();
		this.method352(local6.aClass2_Sub1_Sub1_3);
		this.method359(1);
		this.method388(8448, 7681);
		this.method329(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat118 / (float) local9.anInt5128;
		@Pc(46) float local46 = local9.aFloat119 / (float) local9.anInt5127;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(58) float local58 = (float) arg3 - (float) arg1;
		@Pc(71) float local71 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local58 * local58)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(90) float local90 = local58 * local71;
		@Pc(94) float local94 = local52 * local71;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local94 + 0.35F, local90 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method329(0, 768, 5890);
	}

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "()Lclient!hba;")
	@Override
	public Class115 method6156() {
		return this.aClass115_Sub1_1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)V")
	public void method397(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method386(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "()Z")
	@Override
	public boolean method6131() {
		return this.aClass6_Sub9_Sub1_1 != null && this.aClass6_Sub9_Sub1_1.method1702();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!gca;)V")
	public void method398(@OriginalArg(1) Class115_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method3377(), 0);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6114() {
		this.method348();
		this.method359(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZI)V")
	public void method399(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}
}
