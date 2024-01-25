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

@OriginalClass("client!no")
public final class Class66_Sub3 extends Class66 {

	@OriginalMember(owner = "client!no", name = "R", descriptor = "I")
	private int anInt6273;

	@OriginalMember(owner = "client!no", name = "kb", descriptor = "I")
	private int anInt6291;

	@OriginalMember(owner = "client!no", name = "Qb", descriptor = "I")
	public int anInt6320;

	@OriginalMember(owner = "client!no", name = "kc", descriptor = "I")
	public int anInt6340;

	@OriginalMember(owner = "client!no", name = "ue", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!no", name = "ve", descriptor = "I")
	public int anInt6442;

	@OriginalMember(owner = "client!no", name = "Ae", descriptor = "Lclient!fb;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!no", name = "De", descriptor = "Lclient!vga;")
	private Class347 aClass347_3;

	@OriginalMember(owner = "client!no", name = "Ge", descriptor = "Lclient!fb;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!no", name = "Ie", descriptor = "Lclient!as;")
	private Class13_Sub2 aClass13_Sub2_1;

	@OriginalMember(owner = "client!no", name = "Le", descriptor = "I")
	public int anInt6447;

	@OriginalMember(owner = "client!no", name = "Me", descriptor = "I")
	public int anInt6448;

	@OriginalMember(owner = "client!no", name = "Ne", descriptor = "I")
	private int anInt6449;

	@OriginalMember(owner = "client!no", name = "Oe", descriptor = "I")
	private int anInt6450;

	@OriginalMember(owner = "client!no", name = "bf", descriptor = "F")
	private float bf;

	@OriginalMember(owner = "client!no", name = "cf", descriptor = "I")
	public int anInt6452;

	@OriginalMember(owner = "client!no", name = "ef", descriptor = "Lclient!mn;")
	private Class114_Sub1_Sub1 aClass114_Sub1_Sub1_4;

	@OriginalMember(owner = "client!no", name = "ff", descriptor = "Z")
	public boolean aBoolean465;

	@OriginalMember(owner = "client!no", name = "gf", descriptor = "I")
	private int anInt6454;

	@OriginalMember(owner = "client!no", name = "hf", descriptor = "Lclient!ev;")
	public Class9_Sub3 aClass9_Sub3_1;

	@OriginalMember(owner = "client!no", name = "kf", descriptor = "Lclient!hda;")
	public Class134_Sub2 aClass134_Sub2_3;

	@OriginalMember(owner = "client!no", name = "lf", descriptor = "Lclient!ev;")
	public Class9_Sub3 aClass9_Sub3_2;

	@OriginalMember(owner = "client!no", name = "pf", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!no", name = "qf", descriptor = "Lclient!ev;")
	public Class9_Sub3 aClass9_Sub3_3;

	@OriginalMember(owner = "client!no", name = "sf", descriptor = "Z")
	private boolean aBoolean468;

	@OriginalMember(owner = "client!no", name = "vf", descriptor = "I")
	public int anInt6458;

	@OriginalMember(owner = "client!no", name = "yf", descriptor = "Lclient!ev;")
	public Class9_Sub3 aClass9_Sub3_4;

	@OriginalMember(owner = "client!no", name = "zf", descriptor = "F")
	private float aFloat117;

	@OriginalMember(owner = "client!no", name = "Af", descriptor = "Z")
	public boolean aBoolean469;

	@OriginalMember(owner = "client!no", name = "Cf", descriptor = "F")
	public float aFloat118;

	@OriginalMember(owner = "client!no", name = "Ef", descriptor = "Z")
	private boolean aBoolean470;

	@OriginalMember(owner = "client!no", name = "Gf", descriptor = "Lclient!ev;")
	public Class9_Sub3 aClass9_Sub3_5;

	@OriginalMember(owner = "client!no", name = "If", descriptor = "I")
	private int anInt6460;

	@OriginalMember(owner = "client!no", name = "Jf", descriptor = "Z")
	public boolean aBoolean471;

	@OriginalMember(owner = "client!no", name = "Kf", descriptor = "F")
	private float aFloat121;

	@OriginalMember(owner = "client!no", name = "Lf", descriptor = "Lclient!ev;")
	public Class9_Sub3 aClass9_Sub3_6;

	@OriginalMember(owner = "client!no", name = "Mf", descriptor = "I")
	public int anInt6461;

	@OriginalMember(owner = "client!no", name = "Nf", descriptor = "Lclient!gda;")
	public Class117 aClass117_8;

	@OriginalMember(owner = "client!no", name = "Qf", descriptor = "Z")
	private boolean aBoolean472;

	@OriginalMember(owner = "client!no", name = "Tf", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!no", name = "Uf", descriptor = "Lclient!qn;")
	private Interface18 anInterface18_3;

	@OriginalMember(owner = "client!no", name = "Wf", descriptor = "Ljava/lang/String;")
	private String aString74;

	@OriginalMember(owner = "client!no", name = "Yf", descriptor = "Z")
	private boolean aBoolean474;

	@OriginalMember(owner = "client!no", name = "Zf", descriptor = "I")
	private int anInt6464;

	@OriginalMember(owner = "client!no", name = "ag", descriptor = "I")
	private int anInt6465;

	@OriginalMember(owner = "client!no", name = "cg", descriptor = "J")
	private long aLong185;

	@OriginalMember(owner = "client!no", name = "dg", descriptor = "Z")
	public boolean aBoolean475;

	@OriginalMember(owner = "client!no", name = "eg", descriptor = "Z")
	public boolean aBoolean476;

	@OriginalMember(owner = "client!no", name = "fg", descriptor = "Z")
	public boolean aBoolean477;

	@OriginalMember(owner = "client!no", name = "gg", descriptor = "Z")
	private boolean aBoolean478;

	@OriginalMember(owner = "client!no", name = "hg", descriptor = "I")
	private int anInt6467;

	@OriginalMember(owner = "client!no", name = "ig", descriptor = "Lclient!hda;")
	public Class134_Sub2 aClass134_Sub2_4;

	@OriginalMember(owner = "client!no", name = "jg", descriptor = "Lclient!gb;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!no", name = "mg", descriptor = "Lclient!vga;")
	public Class347 aClass347_4;

	@OriginalMember(owner = "client!no", name = "ng", descriptor = "Z")
	public boolean aBoolean479;

	@OriginalMember(owner = "client!no", name = "og", descriptor = "Z")
	private boolean aBoolean480;

	@OriginalMember(owner = "client!no", name = "pg", descriptor = "Z")
	private boolean aBoolean481;

	@OriginalMember(owner = "client!no", name = "rg", descriptor = "Lclient!gaa;")
	public Class114_Sub1 aClass114_Sub1_3;

	@OriginalMember(owner = "client!no", name = "sg", descriptor = "Z")
	private boolean aBoolean483;

	@OriginalMember(owner = "client!no", name = "tg", descriptor = "Ljava/lang/String;")
	private String aString75;

	@OriginalMember(owner = "client!no", name = "wg", descriptor = "Z")
	private boolean aBoolean485;

	@OriginalMember(owner = "client!no", name = "xg", descriptor = "F")
	private float aFloat127;

	@OriginalMember(owner = "client!no", name = "yg", descriptor = "Lclient!ev;")
	public Class9_Sub3 aClass9_Sub3_7;

	@OriginalMember(owner = "client!no", name = "zg", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!no", name = "Ag", descriptor = "I")
	private int anInt6468;

	@OriginalMember(owner = "client!no", name = "Dg", descriptor = "I")
	public int anInt6471;

	@OriginalMember(owner = "client!no", name = "Eg", descriptor = "I")
	private int anInt6472;

	@OriginalMember(owner = "client!no", name = "Fg", descriptor = "[Lclient!hf;")
	private Class114[] aClass114Array1;

	@OriginalMember(owner = "client!no", name = "Hg", descriptor = "Lclient!gb;")
	private Interface10 anInterface10_5;

	@OriginalMember(owner = "client!no", name = "Kg", descriptor = "I")
	private int anInt6475;

	@OriginalMember(owner = "client!no", name = "Lg", descriptor = "Lclient!ev;")
	public Class9_Sub3 aClass9_Sub3_8;

	@OriginalMember(owner = "client!no", name = "Og", descriptor = "Z")
	private boolean aBoolean488;

	@OriginalMember(owner = "client!no", name = "Pg", descriptor = "I")
	private int anInt6477;

	@OriginalMember(owner = "client!no", name = "Rg", descriptor = "Lclient!ev;")
	public Class9_Sub3 aClass9_Sub3_9;

	@OriginalMember(owner = "client!no", name = "Sg", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!no", name = "Tg", descriptor = "Z")
	public boolean aBoolean490;

	@OriginalMember(owner = "client!no", name = "Xg", descriptor = "Z")
	public boolean aBoolean492;

	@OriginalMember(owner = "client!no", name = "ah", descriptor = "Lclient!oo;")
	private Class75_Sub1 aClass75_Sub1_1;

	@OriginalMember(owner = "client!no", name = "bh", descriptor = "Lclient!ev;")
	public Class9_Sub3 aClass9_Sub3_10;

	@OriginalMember(owner = "client!no", name = "dh", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!no", name = "fh", descriptor = "Lclient!gda;")
	public Class117 aClass117_9;

	@OriginalMember(owner = "client!no", name = "hh", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!no", name = "ih", descriptor = "I")
	private int anInt6482;

	@OriginalMember(owner = "client!no", name = "lh", descriptor = "I")
	private int anInt6485;

	@OriginalMember(owner = "client!no", name = "ph", descriptor = "I")
	private int anInt6488;

	@OriginalMember(owner = "client!no", name = "sh", descriptor = "I")
	private int anInt6489;

	@OriginalMember(owner = "client!no", name = "vc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!no", name = "ee", descriptor = "I")
	public int anInt6432 = 128;

	@OriginalMember(owner = "client!no", name = "Vd", descriptor = "Lclient!pr;")
	private final Class273 aClass273_1 = new Class273();

	@OriginalMember(owner = "client!no", name = "qe", descriptor = "Lclient!hda;")
	private final Class134_Sub2 aClass134_Sub2_1 = new Class134_Sub2();

	@OriginalMember(owner = "client!no", name = "re", descriptor = "Lclient!hda;")
	public final Class134_Sub2 aClass134_Sub2_2 = new Class134_Sub2();

	@OriginalMember(owner = "client!no", name = "se", descriptor = "I")
	public int anInt6441 = 8;

	@OriginalMember(owner = "client!no", name = "we", descriptor = "I")
	public int anInt6443 = 3;

	@OriginalMember(owner = "client!no", name = "te", descriptor = "Z")
	private boolean aBoolean464 = false;

	@OriginalMember(owner = "client!no", name = "ye", descriptor = "Lclient!gj;")
	private final Class124 aClass124_33 = new Class124();

	@OriginalMember(owner = "client!no", name = "Be", descriptor = "I")
	private int anInt6445 = -1;

	@OriginalMember(owner = "client!no", name = "ze", descriptor = "I")
	private int anInt6444 = -1;

	@OriginalMember(owner = "client!no", name = "Ee", descriptor = "[Lclient!fb;")
	private final Interface5[] anInterface5Array1 = new Interface5[4];

	@OriginalMember(owner = "client!no", name = "Fe", descriptor = "I")
	private int anInt6446 = -1;

	@OriginalMember(owner = "client!no", name = "Je", descriptor = "[Lclient!fb;")
	private final Interface5[] anInterface5Array3 = new Interface5[4];

	@OriginalMember(owner = "client!no", name = "He", descriptor = "[Lclient!fb;")
	private final Interface5[] anInterface5Array2 = new Interface5[4];

	@OriginalMember(owner = "client!no", name = "Ce", descriptor = "Lclient!rda;")
	private final Class286 aClass286_12 = new Class286();

	@OriginalMember(owner = "client!no", name = "Ke", descriptor = "Lclient!jw;")
	private final Class183 aClass183_25 = new Class183(16);

	@OriginalMember(owner = "client!no", name = "Pe", descriptor = "Lclient!gj;")
	private final Class124 aClass124_34 = new Class124();

	@OriginalMember(owner = "client!no", name = "Qe", descriptor = "Lclient!gj;")
	private final Class124 aClass124_35 = new Class124();

	@OriginalMember(owner = "client!no", name = "Re", descriptor = "Lclient!gj;")
	private final Class124 aClass124_36 = new Class124();

	@OriginalMember(owner = "client!no", name = "Se", descriptor = "Lclient!gj;")
	private final Class124 aClass124_37 = new Class124();

	@OriginalMember(owner = "client!no", name = "Te", descriptor = "Lclient!gj;")
	private final Class124 aClass124_38 = new Class124();

	@OriginalMember(owner = "client!no", name = "Ue", descriptor = "Lclient!gj;")
	private final Class124 aClass124_39 = new Class124();

	@OriginalMember(owner = "client!no", name = "Ve", descriptor = "Lclient!gj;")
	private final Class124 aClass124_40 = new Class124();

	@OriginalMember(owner = "client!no", name = "Ye", descriptor = "I")
	public int anInt6451 = 0;

	@OriginalMember(owner = "client!no", name = "We", descriptor = "F")
	public float aFloat111 = -1.0F;

	@OriginalMember(owner = "client!no", name = "Xe", descriptor = "F")
	public float aFloat112 = 1.0F;

	@OriginalMember(owner = "client!no", name = "jf", descriptor = "I")
	private int anInt6455 = 0;

	@OriginalMember(owner = "client!no", name = "wf", descriptor = "[F")
	private final float[] aFloatArray43 = new float[4];

	@OriginalMember(owner = "client!no", name = "Ff", descriptor = "[F")
	private final float[] aFloatArray44 = new float[4];

	@OriginalMember(owner = "client!no", name = "af", descriptor = "[F")
	private final float[] aFloatArray42 = new float[16];

	@OriginalMember(owner = "client!no", name = "Df", descriptor = "F")
	public float aFloat119 = 3584.0F;

	@OriginalMember(owner = "client!no", name = "rf", descriptor = "I")
	public int anInt6457 = 0;

	@OriginalMember(owner = "client!no", name = "df", descriptor = "I")
	private int anInt6453 = -1;

	@OriginalMember(owner = "client!no", name = "Vf", descriptor = "Z")
	private boolean aBoolean473 = true;

	@OriginalMember(owner = "client!no", name = "Ze", descriptor = "[F")
	public final float[] aFloatArray41 = new float[4];

	@OriginalMember(owner = "client!no", name = "tf", descriptor = "F")
	public float aFloat114 = -1.0F;

	@OriginalMember(owner = "client!no", name = "Xf", descriptor = "F")
	public float aFloat125 = 3584.0F;

	@OriginalMember(owner = "client!no", name = "bg", descriptor = "I")
	private int anInt6466 = 0;

	@OriginalMember(owner = "client!no", name = "xf", descriptor = "F")
	public float aFloat116 = 1.0F;

	@OriginalMember(owner = "client!no", name = "Gg", descriptor = "I")
	public int anInt6473 = -1;

	@OriginalMember(owner = "client!no", name = "Rf", descriptor = "F")
	private float aFloat123 = 0.0F;

	@OriginalMember(owner = "client!no", name = "mf", descriptor = "F")
	private float aFloat113 = -1.0F;

	@OriginalMember(owner = "client!no", name = "Sf", descriptor = "I")
	private int anInt6463 = 0;

	@OriginalMember(owner = "client!no", name = "Mg", descriptor = "I")
	public int anInt6476 = 512;

	@OriginalMember(owner = "client!no", name = "Pf", descriptor = "F")
	private float aFloat122 = 1.0F;

	@OriginalMember(owner = "client!no", name = "Of", descriptor = "I")
	private int anInt6462 = 0;

	@OriginalMember(owner = "client!no", name = "Vg", descriptor = "I")
	public int anInt6478 = 0;

	@OriginalMember(owner = "client!no", name = "Cg", descriptor = "I")
	public int anInt6470 = -1;

	@OriginalMember(owner = "client!no", name = "uf", descriptor = "F")
	private float aFloat115 = 1.0F;

	@OriginalMember(owner = "client!no", name = "of", descriptor = "I")
	private int anInt6456 = 8448;

	@OriginalMember(owner = "client!no", name = "Hf", descriptor = "F")
	private float aFloat120 = -1.0F;

	@OriginalMember(owner = "client!no", name = "Wg", descriptor = "I")
	private int anInt6479 = 0;

	@OriginalMember(owner = "client!no", name = "lg", descriptor = "F")
	private float aFloat126 = 3000.0F;

	@OriginalMember(owner = "client!no", name = "Bg", descriptor = "I")
	public int anInt6469 = 512;

	@OriginalMember(owner = "client!no", name = "Zg", descriptor = "[Lclient!pv;")
	private final Class4_Sub32[] aClass4_Sub32Array4 = new Class4_Sub32[Static57.anInt962];

	@OriginalMember(owner = "client!no", name = "Yg", descriptor = "I")
	public int anInt6480 = 0;

	@OriginalMember(owner = "client!no", name = "ug", descriptor = "[F")
	private final float[] aFloatArray45 = new float[4];

	@OriginalMember(owner = "client!no", name = "eh", descriptor = "F")
	public float aFloat131 = 1.0F;

	@OriginalMember(owner = "client!no", name = "Jg", descriptor = "I")
	public int anInt6474 = 3584;

	@OriginalMember(owner = "client!no", name = "gh", descriptor = "I")
	public int anInt6481 = 50;

	@OriginalMember(owner = "client!no", name = "jh", descriptor = "I")
	private int anInt6483 = -1;

	@OriginalMember(owner = "client!no", name = "kh", descriptor = "I")
	private int anInt6484 = 0;

	@OriginalMember(owner = "client!no", name = "nh", descriptor = "I")
	private int anInt6487 = 8448;

	@OriginalMember(owner = "client!no", name = "mh", descriptor = "I")
	public int anInt6486 = -1;

	@OriginalMember(owner = "client!no", name = "kg", descriptor = "Lclient!ps;")
	public Class4_Sub9_Sub2 aClass4_Sub9_Sub2_2 = new Class4_Sub9_Sub2(8192);

	@OriginalMember(owner = "client!no", name = "rh", descriptor = "[I")
	public int[] anIntArray516 = new int[1];

	@OriginalMember(owner = "client!no", name = "oh", descriptor = "[I")
	public int[] anIntArray515 = new int[1];

	@OriginalMember(owner = "client!no", name = "qh", descriptor = "[B")
	public final byte[] aByteArray65 = new byte[16384];

	@OriginalMember(owner = "client!no", name = "th", descriptor = "[I")
	public int[] anIntArray517 = new int[1];

	@OriginalMember(owner = "client!no", name = "le", descriptor = "I")
	public final int anInt6437;

	@OriginalMember(owner = "client!no", name = "db", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas11;

	@OriginalMember(owner = "client!no", name = "rb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!no", name = "ud", descriptor = "Lclient!jaggl/OpenGL;")
	public OpenGL anOpenGL2;

	@OriginalMember(owner = "client!no", name = "nb", descriptor = "J")
	private final long aLong184;

	@OriginalMember(owner = "client!no", name = "x", descriptor = "J")
	private long aLong183;

	@OriginalMember(owner = "client!no", name = "Bf", descriptor = "I")
	public final int anInt6459;

	@OriginalMember(owner = "client!no", name = "Ig", descriptor = "Z")
	public boolean aBoolean486;

	@OriginalMember(owner = "client!no", name = "Ng", descriptor = "Z")
	public boolean aBoolean487;

	@OriginalMember(owner = "client!no", name = "ch", descriptor = "Z")
	private boolean aBoolean493;

	@OriginalMember(owner = "client!no", name = "Qg", descriptor = "Z")
	public boolean aBoolean489;

	@OriginalMember(owner = "client!no", name = "Ug", descriptor = "Z")
	public boolean aBoolean491;

	@OriginalMember(owner = "client!no", name = "nf", descriptor = "Z")
	private boolean aBoolean466;

	@OriginalMember(owner = "client!no", name = "qg", descriptor = "Z")
	public boolean aBoolean482;

	@OriginalMember(owner = "client!no", name = "vg", descriptor = "Z")
	private final boolean aBoolean484;

	@OriginalMember(owner = "client!no", name = "Zd", descriptor = "Lclient!mm;")
	private final Class228 aClass228_1;

	@OriginalMember(owner = "client!no", name = "xe", descriptor = "Lclient!laa;")
	public final Class203 aClass203_1;

	@OriginalMember(owner = "client!no", name = "fe", descriptor = "Lclient!uea;")
	private final Class330 aClass330_1;

	@OriginalMember(owner = "client!no", name = "ie", descriptor = "Lclient!mc;")
	private Class4_Sub29_Sub1 aClass4_Sub29_Sub1_1;

	@OriginalMember(owner = "client!no", name = "ne", descriptor = "Lclient!mh;")
	private final Class224 aClass224_1;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;I)V")
	public Class66_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		this.anInt6437 = arg2;
		this.aCanvas12 = this.aCanvas11 = arg0;
		if (!Static157.method5013("jaclib")) {
			throw new RuntimeException("");
		} else if (Static157.method5013("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong183 = this.aLong184 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt6437);
				if (this.aLong184 == 0L) {
					throw new RuntimeException("");
				}
				this.method5395();
				@Pc(326) int local326 = this.method5362();
				if (local326 != 0) {
					throw new RuntimeException("");
				}
				this.anInt6459 = this.aBoolean476 ? 33639 : 5121;
				@Pc(352) int local352;
				if (this.aString75.indexOf("radeon") != -1) {
					local352 = 0;
					@Pc(354) boolean local354 = false;
					@Pc(356) boolean local356 = false;
					@Pc(365) String[] local365 = Static246.method4172(this.aString75.replace('/', ' '), ' ');
					for (@Pc(367) int local367 = 0; local367 < local365.length; local367++) {
						@Pc(373) String local373 = local365[local367];
						try {
							if (local373.length() > 0) {
								if (local373.charAt(0) == 'x' && local373.length() >= 3 && Static241.method4087(local373.substring(1, 3))) {
									local373 = local373.substring(1);
									local356 = true;
								}
								if (local373.equals("hd")) {
									local354 = true;
								} else {
									if (local373.startsWith("hd")) {
										local354 = true;
										local373 = local373.substring(2);
									}
									if (local373.length() >= 4 && Static241.method4087(local373.substring(0, 4))) {
										local352 = Static272.method4392(local373.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(441) Exception local441) {
						}
					}
					if (!local354 || local352 < 4000) {
						this.aBoolean486 = false;
					}
					if (!local356 && !local354) {
						if (local352 >= 7000 && local352 <= 9250) {
							this.aBoolean487 = false;
						}
						if (local352 >= 7000 && local352 <= 7999) {
							this.aBoolean493 = false;
						}
					}
					this.aBoolean489 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean491 = true;
					this.aBoolean466 = this.aBoolean493;
				}
				if (this.aString74.indexOf("intel") != -1) {
					this.aBoolean482 = false;
				}
				this.aBoolean484 = !this.aString74.equals("s3 graphics");
				if (this.aBoolean493) {
					try {
						@Pc(522) int[] local522 = new int[1];
						OpenGL.glGenBuffersARB(1, local522, 0);
					} catch (@Pc(528) Throwable local528) {
						throw new RuntimeException("");
					}
				}
				Static452.method6402(false, true);
				this.aBoolean464 = true;
				this.aClass228_1 = new Class228(this, super.anInterface3_15);
				this.method5372();
				this.aClass203_1 = new Class203(this);
				this.aClass330_1 = new Class330(this);
				if (this.aClass330_1.method7397()) {
					this.aClass4_Sub29_Sub1_1 = new Class4_Sub29_Sub1(this);
					if (!this.aClass4_Sub29_Sub1_1.method4876()) {
						this.aClass4_Sub29_Sub1_1.method4875();
						this.aClass4_Sub29_Sub1_1 = null;
					}
				}
				this.aClass224_1 = new Class224(this);
				this.method5421();
				this.method5364();
				OpenGL.glClear(16640);
				local352 = 0;
				while (true) {
					try {
						this.anOpenGL2.swapBuffers();
						break;
					} catch (@Pc(607) Exception local607) {
						if (local352++ > 5) {
							throw new RuntimeException("");
						}
						Static55.method845(100L);
					}
				}
				OpenGL.glClear(16384);
			} catch (@Pc(625) Throwable local625) {
				local625.printStackTrace();
				this.method6805();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "()V")
	@Override
	public void method6780() {
		if (this.aBoolean482) {
			if (this.aClass347_3 != this.anInterface5_2) {
				throw new RuntimeException();
			}
			this.aClass347_3.method7686(0);
			this.aClass347_3.method7686(8);
			this.method5410(this.aClass347_3);
		} else if (this.aBoolean485) {
			this.aClass13_Sub2_1.GA(0, 0, this.anInt6340, this.anInt6320, 0, 0);
			this.anOpenGL2.setSurface(this.aLong183);
		} else {
			throw new RuntimeException("");
		}
		this.anInt6340 = this.anInt6273;
		this.anInt6320 = this.anInt6291;
		this.aClass13_Sub2_1 = null;
		this.method5365();
		this.method5426();
		this.F();
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V")
	private void method5353() {
		if (this.anInt6472 == 1) {
			return;
		}
		this.method5414();
		this.method5371(false);
		this.method5405(false);
		this.method5384(false);
		this.method5432(false);
		this.method5382(null);
		this.method5431(-2);
		this.method5355(1);
		this.anInt6472 = 1;
	}

	@OriginalMember(owner = "client!no", name = "g", descriptor = "(I)V")
	@Override
	public void method6835(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
	public synchronized void method5354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub33 local14 = new Class4_Sub33(arg0);
		local14.aLong307 = arg1;
		this.aClass124_35.method3275(local14);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)V")
	public void method5355(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method5396(7681, 7681);
		} else if (arg0 == 0) {
			this.method5396(8448, 8448);
		} else if (arg0 == 2) {
			this.method5396(7681, 34165);
		} else if (arg0 == 3) {
			this.method5396(8448, 260);
		} else if (arg0 == 4) {
			this.method5396(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!fb;I)V")
	public void method5356(@OriginalArg(0) Interface5 arg0) {
		if (this.anInt6446 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6446 >= 0) {
			this.anInterface5Array1[this.anInt6446].method7675();
		}
		this.anInterface5_1 = this.anInterface5Array1[++this.anInt6446] = arg0;
		this.anInterface5_1.method7677();
	}

	@OriginalMember(owner = "client!no", name = "ka", descriptor = "(FF)V")
	@Override
	public void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat126 && this.aFloat117 == arg1) {
			return;
		}
		this.aFloat126 = arg0;
		this.aFloat117 = arg1;
		this.method5427();
		if (this.anInt6475 == 3) {
			this.method5368();
		} else if (this.anInt6475 == 2) {
			this.method5402();
			return;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6812(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6847();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!qn;IIB)V")
	public void method5357(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13 = arg1.method6573();
		@Pc(20) int local20 = arg0 * this.method5379(local13);
		this.method5363(arg1);
		OpenGL.glDrawElements(4, arg2, local13, (long) local20 + arg1.method6572());
	}

	@OriginalMember(owner = "client!no", name = "j", descriptor = "(I)V")
	private void method5358() {
		if (this.aBoolean467) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean467 = false;
		}
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(Z)V")
	private void method5359() {
		@Pc(15) int local15;
		if (this.aBoolean490) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt6483;
		} else {
			this.aFloat127 = (float) (this.anInt6474 - this.anInt6451) - this.aFloat123;
			this.aFloat118 = this.aFloat127 - this.aFloat115 * (float) this.anInt6486;
			if (this.aFloat118 < (float) this.anInt6481) {
				this.aFloat118 = this.anInt6481;
			}
			OpenGL.glFogf(2915, this.aFloat118);
			OpenGL.glFogf(2916, this.aFloat127);
			local15 = this.anInt6470;
		}
		Static554.aFloatArray67[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static554.aFloatArray67[2] = (float) (local15 & 0xFF) / 255.0F;
		Static554.aFloatArray67[1] = (float) (local15 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static554.aFloatArray67, 0);
		if (this.aBoolean490) {
			this.aClass224_1.aClass44_Sub1_1.method826();
		}
	}

	@OriginalMember(owner = "client!no", name = "y", descriptor = "()Z")
	@Override
	public boolean method6837() {
		return true;
	}

	@OriginalMember(owner = "client!no", name = "B", descriptor = "()Z")
	@Override
	public boolean method6848() {
		return false;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I[Lclient!pv;)V")
	@Override
	public void method6785(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub32[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass4_Sub32Array4[local7] = arg1[local7];
		}
		this.anInt6485 = arg0;
		if (this.anInt6475 != 1) {
			this.method5387();
		}
	}

	@OriginalMember(owner = "client!no", name = "t", descriptor = "()V")
	@Override
	public void method6830() {
		if (this.aClass4_Sub29_Sub1_1 != null && this.aClass4_Sub29_Sub1_1.method4870()) {
			this.aClass330_1.method7387(this.aClass4_Sub29_Sub1_1);
			this.aClass228_1.method4993();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public Class13 method6802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class13_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6823(@OriginalArg(0) Class134 arg0) {
		this.aClass134_Sub2_4 = (Class134_Sub2) arg0;
		this.aClass134_Sub2_3.method3452(this.aClass134_Sub2_4);
		if (this.anInt6475 != 1) {
			this.method5397();
		}
	}

	@OriginalMember(owner = "client!no", name = "g", descriptor = "()Z")
	@Override
	public boolean method6789() {
		return true;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZIIILclient!jaclib/memory/Buffer;)Lclient!gb;")
	public Interface10 method5360(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Buffer arg2) {
		return (Interface10) (this.aBoolean493 ? new Class188_Sub1(this, arg1, arg2, arg0, false) : new Class20_Sub1(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BIII)V")
	public void method5361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	@Override
	public void method6787(@OriginalArg(0) int arg0) {
		this.method5420();
	}

	@OriginalMember(owner = "client!no", name = "ca", descriptor = "(IIII)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt6340 < arg2) {
			arg2 = this.anInt6340;
		}
		if (this.anInt6320 < arg3) {
			arg3 = this.anInt6320;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt6484 = arg1;
		this.anInt6462 = arg0;
		this.anInt6466 = arg2;
		this.anInt6479 = arg3;
		OpenGL.glEnable(3089);
		this.method5404();
		this.method5436();
	}

	@OriginalMember(owner = "client!no", name = "u", descriptor = "()I")
	@Override
	public int method6832() {
		return 4;
	}

	@OriginalMember(owner = "client!no", name = "q", descriptor = "()Z")
	@Override
	public boolean method6821() {
		return true;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "()Z")
	@Override
	public boolean method6778() {
		return this.aClass224_1.method4948();
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "()V")
	@Override
	public void method6783() {
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(Z)I")
	private int method5362() {
		@Pc(5) int local5 = 0;
		this.aString74 = OpenGL.glGetString(7936).toLowerCase();
		this.aString75 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString74.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString74.indexOf("brian paul") != -1 || this.aString74.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static246.method4172(local46.replace('.', ' '), ' ');
		if (local54.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(72) int local72 = Static272.method4392(local54[0]);
				@Pc(78) int local78 = Static272.method4392(local54[1]);
				this.anInt6468 = local78 + local72 * 10;
			} catch (@Pc(87) NumberFormatException local87) {
				local5 |= 0x4;
			}
		}
		if (this.anInt6468 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(121) int[] local121 = new int[1];
		OpenGL.glGetIntegerv(34018, local121, 0);
		this.anInt6458 = local121[0];
		OpenGL.glGetIntegerv(34929, local121, 0);
		this.anInt6464 = local121[0];
		OpenGL.glGetIntegerv(34930, local121, 0);
		this.anInt6467 = local121[0];
		if (this.anInt6458 < 2 || this.anInt6464 < 2 || this.anInt6467 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean476 = Stream.b();
		this.aBoolean485 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean493 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean483 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean471 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean479 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean469 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean487 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean489 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean465 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean486 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean477 = false;
		this.aBoolean482 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean475 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean492 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean472 = this.aBoolean475 & this.aBoolean492;
		OpenGL.glGetFloatv(2834, Static554.aFloatArray67, 0);
		this.aFloat113 = Static554.aFloatArray67[0];
		this.aFloat120 = Static554.aFloatArray67[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!qn;I)V")
	public void method5363(@OriginalArg(0) Interface18 arg0) {
		if (arg0 != this.anInterface18_3) {
			if (this.aBoolean493) {
				OpenGL.glBindBufferARB(34963, arg0.method6571());
			}
			this.anInterface18_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(IIIII)V")
	@Override
	public void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5353();
		this.method5398(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!pga;Z)Lclient!xa;")
	@Override
	public Class13 method6799(@OriginalArg(0) Class268 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt7060 * arg0.anInt7058];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray92 == null) {
			for (local21 = 0; local21 < arg0.anInt7060; local21++) {
				for (local25 = 0; local25 < arg0.anInt7058; local25++) {
					@Pc(38) int local38 = arg0.anIntArray590[arg0.aByteArray93[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt7060; local21++) {
				for (local25 = 0; local25 < arg0.anInt7058; local25++) {
					local12[local16++] = arg0.aByteArray92[local14] << 24 | arg0.anIntArray590[arg0.aByteArray93[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(127) Class13 local127 = this.method6843(local12, arg0.anInt7058, arg0.anInt7058, arg0.anInt7060);
		local127.EA(arg0.anInt7057, arg0.anInt7059, arg0.anInt7056, arg0.anInt7061);
		return local127;
	}

	@OriginalMember(owner = "client!no", name = "k", descriptor = "(I)V")
	private void method5364() {
		if (this.aCanvas12 == null) {
			this.anInt6273 = this.anInt6291 = 0;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas12.getSize();
			this.anInt6273 = local18.width;
			this.anInt6291 = local18.height;
		}
		if (this.anInterface5_2 == null) {
			this.anInt6340 = this.anInt6273;
			this.anInt6320 = this.anInt6291;
			this.method5426();
		}
		this.method5365();
		this.F();
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(B)V")
	public void method5365() {
		if (this.anInt6475 != 0) {
			this.anInt6475 = 0;
			this.anInt6472 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!no", name = "LA", descriptor = "(IIII)V")
	@Override
	public void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean490) {
			throw new RuntimeException("");
		}
		this.anInt6473 = arg2;
		this.anInt6471 = arg0;
		this.anInt6478 = arg3;
		this.anInt6483 = arg1;
		this.aClass224_1.aClass44_Sub1_1.method827();
		this.method5359();
	}

	@OriginalMember(owner = "client!no", name = "l", descriptor = "(I)V")
	public void method5366() {
		if (this.anInt6472 == 2) {
			return;
		}
		this.method5414();
		this.method5371(false);
		this.method5405(false);
		this.method5384(false);
		this.method5432(false);
		this.method5431(-2);
		this.anInt6472 = 2;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIZI)V")
	public void method5367(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!no", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass134_Sub2_4.aFloat83 + (float) arg2 * this.aClass134_Sub2_4.aFloat87 + this.aClass134_Sub2_4.aFloat78 * (float) arg0 + (float) arg1 * this.aClass134_Sub2_4.aFloat79;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = (float) arg4 * this.aClass134_Sub2_4.aFloat79 + this.aClass134_Sub2_4.aFloat78 * (float) arg3 + (float) arg5 * this.aClass134_Sub2_4.aFloat87 + this.aClass134_Sub2_4.aFloat83;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt6481 > local28 && (float) this.anInt6481 > local59 || !(!(local28 > (float) this.anInt6474) || !((float) this.anInt6474 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass134_Sub2_4.aFloat84 + (float) arg2 * this.aClass134_Sub2_4.aFloat80 + (float) arg1 * this.aClass134_Sub2_4.aFloat86 + this.aClass134_Sub2_4.aFloat85 * (float) arg0) * (float) this.anInt6469 / local28);
		@Pc(155) int local155 = (int) ((this.aClass134_Sub2_4.aFloat80 * (float) arg5 + (float) arg4 * this.aClass134_Sub2_4.aFloat86 + (float) arg3 * this.aClass134_Sub2_4.aFloat85 + this.aClass134_Sub2_4.aFloat84) * (float) this.anInt6469 / local59);
		if ((float) local123 < this.aFloat132 && (float) local155 < this.aFloat132 || (float) local123 > this.aFloat124 && (float) local155 > this.aFloat124) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt6476 * ((float) arg2 * this.aClass134_Sub2_4.aFloat81 + (float) arg1 * this.aClass134_Sub2_4.aFloat88 + (float) arg0 * this.aClass134_Sub2_4.aFloat89 + this.aClass134_Sub2_4.aFloat82) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt6476 * (this.aClass134_Sub2_4.aFloat82 + this.aClass134_Sub2_4.aFloat88 * (float) arg4 + (float) arg3 * this.aClass134_Sub2_4.aFloat89 + (float) arg5 * this.aClass134_Sub2_4.aFloat81) / local59);
			return (!((float) local213 < this.aFloat129) || !((float) local245 < this.aFloat129)) && (!((float) local213 > this.aFloat130) || !((float) local245 > this.aFloat130));
		}
	}

	@OriginalMember(owner = "client!no", name = "m", descriptor = "(I)V")
	private void method5368() {
		@Pc(19) float local19 = this.aFloat122 * (float) -this.anInt6457 / (float) this.anInt6469;
		@Pc(31) float local31 = this.aFloat122 * (float) -this.anInt6480 / (float) this.anInt6476;
		@Pc(45) float local45 = this.aFloat122 * (float) (this.anInt6340 - this.anInt6457) / (float) this.anInt6469;
		@Pc(60) float local60 = (float) (this.anInt6320 - this.anInt6480) * this.aFloat122 / (float) this.anInt6476;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local45 != local19 && local60 != local31) {
			OpenGL.glOrtho((double) local19, (double) local45, (double) -local60, (double) -local31, (double) ((float) this.anInt6481 - this.aFloat117), (double) ((float) this.anInt6474 - this.aFloat117));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!no", name = "X", descriptor = "(III)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6470 == arg0 && this.anInt6486 == arg1 && this.anInt6451 == arg2) {
			return;
		}
		this.anInt6451 = arg2;
		this.anInt6486 = arg1;
		this.anInt6470 = arg0;
		if (this.aBoolean490) {
			return;
		}
		this.method5359();
		this.method5388();
	}

	@OriginalMember(owner = "client!no", name = "h", descriptor = "(IIIII)V")
	@Override
	protected void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt6462 > arg0 + arg2 || arg0 - arg2 > this.anInt6466 || arg1 + arg2 < this.anInt6484 || this.anInt6479 < arg1 - arg2) {
			return;
		}
		this.method5353();
		this.method5398(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(71) float local71 = (float) arg0 + 0.35F;
		@Pc(76) float local76 = (float) arg1 + 0.35F;
		@Pc(80) int local80 = arg2 << 1;
		if ((float) local80 < this.aFloat113) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local71 + 1.0F, local76 + 1.0F);
			OpenGL.glVertex2f(local71 + 1.0F, local76 - 1.0F);
			OpenGL.glVertex2f(local71 - 1.0F, -1.0F + local76);
			OpenGL.glVertex2f(local71 - 1.0F, local76 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat120 >= (float) local80) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local80);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local71, local76);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local71, local76);
			@Pc(149) int local149 = 262144 / (arg2 * 6);
			if (local149 <= 64) {
				local149 = 64;
			} else if (local149 > 512) {
				local149 = 512;
			}
			local149 = Static337.method5028(local149);
			OpenGL.glVertex2f(local71 + (float) arg2, local76);
			for (@Pc(178) int local178 = 16384 - local149; local178 > 0; local178 -= local149) {
				OpenGL.glVertex2f((float) arg2 * Class310.aFloatArray61[local178] + local71, (float) arg2 * Class310.aFloatArray62[local178] + local76);
			}
			OpenGL.glVertex2f((float) arg2 + local71, local76);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	@Override
	public Class75 method6775(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class75 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean465 && this.aBoolean482) {
			@Pc(15) Class75_Sub1_Sub2 local15 = null;
			@Pc(18) Class75_Sub1 local18 = (Class75_Sub1) arg0;
			@Pc(21) Class75_Sub1 local21 = (Class75_Sub1) arg1;
			@Pc(25) Class114_Sub3 local25 = local18.method7904();
			@Pc(29) Class114_Sub3 local29 = local21.method7904();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt4933 > local29.anInt4933 ? local25.anInt4933 : local29.anInt4933;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class75_Sub1_Sub2) {
					@Pc(60) Class75_Sub1_Sub2 local60 = (Class75_Sub1_Sub2) arg3;
					if (local48 == local60.method7910()) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class75_Sub1_Sub2(this, local48);
				}
				if (local15.method7909(local29, arg2, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(Lclient!fb;I)V")
	public void method5369(@OriginalArg(0) Interface5 arg0) {
		if (this.anInt6445 < 0 || arg0 != this.anInterface5Array3[this.anInt6445]) {
			throw new RuntimeException();
		}
		this.anInterface5Array3[this.anInt6445--] = null;
		arg0.method7676();
		if (this.anInt6445 >= 0) {
			this.anInterface5_2 = this.anInterface5Array3[this.anInt6445];
			this.anInterface5_2.method7678();
		} else {
			this.anInterface5_2 = null;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!hda;)V")
	public void method5370(@OriginalArg(1) Class134_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method3449(), 0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public Class98 method6841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static320.method4880(arg2, arg0, arg1, this, arg3);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI)V")
	public void method5371(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean468 != arg0) {
			this.aBoolean468 = arg0;
			this.method5388();
			this.anInt6472 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!no", name = "JA", descriptor = "(I)V")
	@Override
	public void JA(@OriginalArg(0) int arg0) {
		this.anInt6443 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt6443++;
		}
		this.anInt6441 = 0x1 << this.anInt6443;
	}

	@OriginalMember(owner = "client!no", name = "n", descriptor = "(I)V")
	private void method5372() {
		this.aClass134_Sub2_4 = new Class134_Sub2();
		this.aClass134_Sub2_3 = new Class134_Sub2();
		this.aClass114Array1 = new Class114[this.anInt6458];
		this.aClass114_Sub1_3 = new Class114_Sub1(this, 3553, 6408, 1, 1);
		new Class114_Sub1(this, 3553, 6408, 1, 1);
		new Class114_Sub1(this, 3553, 6408, 1, 1);
		this.aClass9_Sub3_8 = new Class9_Sub3(this);
		this.aClass9_Sub3_3 = new Class9_Sub3(this);
		this.aClass9_Sub3_9 = new Class9_Sub3(this);
		this.aClass9_Sub3_10 = new Class9_Sub3(this);
		this.aClass9_Sub3_5 = new Class9_Sub3(this);
		this.aClass9_Sub3_7 = new Class9_Sub3(this);
		this.aClass9_Sub3_4 = new Class9_Sub3(this);
		this.aClass9_Sub3_2 = new Class9_Sub3(this);
		this.aClass9_Sub3_1 = new Class9_Sub3(this);
		this.aClass9_Sub3_6 = new Class9_Sub3(this);
		if (this.aBoolean482) {
			this.aClass347_4 = new Class347(this);
			new Class347(this);
		}
	}

	@OriginalMember(owner = "client!no", name = "o", descriptor = "(I)V")
	private void method5373() {
		if (this.aBoolean480 && !this.aBoolean481) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6853(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas11 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable5.containsKey(arg0)) {
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
			this.aHashtable5.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6826(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II)I")
	@Override
	public int method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZIIZ)V")
	public void method5374(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt6454 != arg1) {
			if (arg1 < 0) {
				this.method5358();
				this.method5382(null);
				this.method5355(0);
				if (!this.aBoolean490) {
					this.aClass224_1.method4944(0, arg2, arg0, 0, 0);
				}
			} else {
				@Pc(49) Class114_Sub1 local49 = this.aClass228_1.method4994(arg1);
				@Pc(55) Class271 local55 = super.anInterface3_15.method7249(arg1);
				if (local55.aByte79 == 0 && local55.aByte83 == 0) {
					this.method5358();
				} else {
					@Pc(68) int local68 = local55.aBoolean516 ? 64 : 128;
					@Pc(72) int local72 = local68 * 50;
					this.method5429(0.0F, (float) (local55.aByte83 * (this.anInt6442 % local72)) / (float) local72, (float) (this.anInt6442 % local72 * local55.aByte79) / (float) local72);
				}
				if (this.aBoolean490) {
					this.method5382(local49);
					this.method5355(local55.anInt7177);
				} else {
					this.aClass224_1.method4944(local55.aByte81, arg2, arg0, local55.anInt7171, local55.aByte84);
					if (!this.aClass224_1.method4947(local49, local55.anInt7177)) {
						this.method5382(local49);
						this.method5355(local55.anInt7177);
					}
				}
			}
			this.anInt6454 = arg1;
		}
		this.anInt6472 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!no", name = "r", descriptor = "()Z")
	@Override
	public boolean method6828() {
		return true;
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(Z)V")
	public void method5375() {
		if (this.anInt6472 == 4) {
			return;
		}
		this.method5414();
		this.method5371(false);
		this.method5405(false);
		this.method5384(false);
		this.method5432(false);
		this.method5431(-2);
		this.method5398(1);
		this.anInt6472 = 4;
	}

	@OriginalMember(owner = "client!no", name = "p", descriptor = "(I)V")
	private void method5376() {
		@Pc(13) float[] local13 = this.aFloatArray42;
		@Pc(25) float local25 = (float) (-this.anInt6457 * this.anInt6481) / (float) this.anInt6469;
		@Pc(40) float local40 = (float) ((this.anInt6340 - this.anInt6457) * this.anInt6481) / (float) this.anInt6469;
		@Pc(51) float local51 = (float) (this.anInt6480 * this.anInt6481) / (float) this.anInt6476;
		@Pc(65) float local65 = (float) ((this.anInt6480 - this.anInt6320) * this.anInt6481) / (float) this.anInt6476;
		if (local25 == local40 || local65 == local51) {
			local13[9] = 0.0F;
			local13[5] = 1.0F;
			local13[2] = 0.0F;
			local13[6] = 0.0F;
			local13[1] = 0.0F;
			local13[15] = 1.0F;
			local13[14] = 0.0F;
			local13[8] = 0.0F;
			local13[12] = 0.0F;
			local13[11] = 0.0F;
			local13[3] = 0.0F;
			local13[4] = 0.0F;
			local13[13] = 0.0F;
			local13[0] = 1.0F;
			local13[10] = 1.0F;
			local13[7] = 0.0F;
		} else {
			@Pc(145) float local145 = (float) this.anInt6481 * 2.0F;
			local13[3] = 0.0F;
			local13[12] = 0.0F;
			local13[6] = 0.0F;
			local13[13] = 0.0F;
			local13[5] = local145 / (local51 - local65);
			local13[4] = 0.0F;
			local13[7] = 0.0F;
			local13[8] = (local25 + local40) / (-local25 + local40);
			local13[2] = 0.0F;
			local13[10] = this.bf = (float) -(this.anInt6474 + this.anInt6481) / (float) (this.anInt6474 - this.anInt6481);
			local13[11] = -1.0F;
			local13[14] = this.aFloat121 = -((float) this.anInt6474 * local145) / (float) (this.anInt6474 - this.anInt6481);
			local13[1] = 0.0F;
			local13[9] = (local65 + local51) / (local51 - local65);
			local13[15] = 0.0F;
			local13[0] = local145 / (local40 - local25);
		}
		this.method5427();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z[BIII)Lclient!qn;")
	public Interface18 method5377(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		return (Interface18) (this.aBoolean493 && (!arg0 || this.aBoolean466) ? new Class188_Sub2(this, 5123, arg1, arg2, arg0) : new Class20_Sub2(this, 5123, arg1, arg2));
	}

	@OriginalMember(owner = "client!no", name = "ha", descriptor = "(F)V")
	@Override
	public void ha(@OriginalArg(0) float arg0) {
		if (this.aFloat128 != arg0) {
			this.aFloat128 = arg0;
			this.method5423();
		}
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "()Z")
	@Override
	public boolean method6781() {
		return this.aBoolean483 && (!this.method6852() || this.aBoolean472);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(II)V")
	public synchronized void method5378(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub33 local12 = new Class4_Sub33(arg0);
		this.aClass124_37.method3275(local12);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(ZI)I")
	public int method5379(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6854(@OriginalArg(0) Canvas arg0) {
		this.aLong183 = 0L;
		this.aCanvas12 = null;
		if (arg0 == null || this.aCanvas11 == arg0) {
			this.aCanvas12 = this.aCanvas11;
			this.aLong183 = this.aLong184;
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable5.get(arg0);
			this.aLong183 = local26;
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.aLong183 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong183);
		this.method5364();
	}

	@OriginalMember(owner = "client!no", name = "E", descriptor = "()Z")
	@Override
	public boolean method6852() {
		return this.aClass4_Sub29_Sub1_1 != null && this.aClass4_Sub29_Sub1_1.method4870();
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(II)V")
	public void method5380(@OriginalArg(1) int arg0) {
		Static554.aFloatArray67[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static554.aFloatArray67[3] = (float) (arg0 >>> 24) / 255.0F;
		Static554.aFloatArray67[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static554.aFloatArray67[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static554.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(BI)V")
	public void method5381(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt6477) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt6477 = arg0;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!hf;I)V")
	public void method5382(@OriginalArg(0) Class114 arg0) {
		@Pc(11) Class114 local11 = this.aClass114Array1[this.anInt6477];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt5902);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt5902);
				} else if (local11.anInt5902 != arg0.anInt5902) {
					OpenGL.glDisable(local11.anInt5902);
					OpenGL.glEnable(arg0.anInt5902);
				}
				OpenGL.glBindTexture(arg0.anInt5902, arg0.method5002());
			}
			this.aClass114Array1[this.anInt6477] = arg0;
		}
		this.anInt6472 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!fb;)V")
	public void method5383(@OriginalArg(1) Interface5 arg0) {
		if (this.anInt6445 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6445 >= 0) {
			this.anInterface5Array3[this.anInt6445].method7676();
		}
		this.anInterface5_2 = this.anInterface5Array3[++this.anInt6445] = arg0;
		this.anInterface5_2.method7678();
	}

	@OriginalMember(owner = "client!no", name = "A", descriptor = "()V")
	@Override
	public void method6847() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BZ)V")
	public void method5384(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean488 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean488 = arg0;
		this.anInt6472 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!no", name = "q", descriptor = "(I)Lclient!jk;")
	public Class114_Sub3 method5385() {
		return this.aClass75_Sub1_1 == null ? null : this.aClass75_Sub1_1.method7904();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!hda;B)V")
	public void method5386(@OriginalArg(0) Class134_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method3449(), 0);
	}

	@OriginalMember(owner = "client!no", name = "r", descriptor = "(I)V")
	private void method5387() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt6485; local7++) {
			@Pc(16) Class4_Sub32 local16 = this.aClass4_Sub32Array4[local7];
			@Pc(20) int local20 = local7 + 16386;
			Static298.aFloatArray38[0] = local16.method6614();
			Static298.aFloatArray38[1] = local16.method6615(-18736);
			Static298.aFloatArray38[2] = local16.method6617();
			Static298.aFloatArray38[3] = 1.0F;
			OpenGL.glLightfv(local20, 4611, Static298.aFloatArray38, 0);
			@Pc(56) int local56 = local16.method6613(79);
			@Pc(62) float local62 = local16.method6618() / 255.0F;
			Static298.aFloatArray38[2] = (float) (local56 & 0xFF) * local62;
			Static298.aFloatArray38[1] = local62 * (float) (local56 >> 8 & 0xFF);
			Static298.aFloatArray38[0] = local62 * (float) (local56 >> 16 & 0xFF);
			OpenGL.glLightfv(local20, 4609, Static298.aFloatArray38, 0);
			OpenGL.glLightf(local20, 4617, 1.0F / (float) (local16.method6621() * local16.method6621()));
			OpenGL.glEnable(local20);
		}
		while (local7 < this.anInt6482) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt6482 = this.anInt6485;
	}

	@OriginalMember(owner = "client!no", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt6481;
	}

	@OriginalMember(owner = "client!no", name = "g", descriptor = "(Z)V")
	private void method5388() {
		if (this.aBoolean468 && this.anInt6486 >= 0 | this.aBoolean490) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!no", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(57) float local57;
		@Pc(45) float local45;
		if (this.aClass114_Sub1_Sub1_4 == null || this.aClass114_Sub1_Sub1_4.anInt5921 < arg2 || this.aClass114_Sub1_Sub1_4.anInt5918 < arg3) {
			this.aClass114_Sub1_Sub1_4 = Static443.method6271(arg3, arg2, this, arg6);
			this.aClass114_Sub1_Sub1_4.method5008(false, false);
			local57 = this.aClass114_Sub1_Sub1_4.aFloat104;
			local45 = this.aClass114_Sub1_Sub1_4.aFloat103;
		} else {
			this.aClass114_Sub1_Sub1_4.method5014(6406, arg2, arg6, arg3, false);
			local45 = this.aClass114_Sub1_Sub1_4.aFloat103 * (float) arg2 / (float) this.aClass114_Sub1_Sub1_4.anInt5921;
			local57 = (float) arg3 * this.aClass114_Sub1_Sub1_4.aFloat104 / (float) this.aClass114_Sub1_Sub1_4.anInt5918;
		}
		this.method5366();
		this.method5382(this.aClass114_Sub1_Sub1_4);
		this.method5398(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5380(arg5);
		this.method5396(34165, 34165);
		this.method5361(768, 0, 34166);
		this.method5361(770, 2, 5890);
		this.method5424(0, 34166);
		this.method5424(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
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
		this.method5361(768, 0, 5890);
		this.method5361(770, 2, 34166);
		this.method5424(0, 5890);
		this.method5424(2, 34166);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(ZI)V")
	public void method5389(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean481) {
			this.aBoolean481 = arg0;
			this.method5373();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(FFB)V")
	public void method5390(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat115 = arg1;
		this.aFloat123 = arg0;
		if (!this.aBoolean490) {
			this.method5359();
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(ILclient!fb;)V")
	public void method5391(@OriginalArg(1) Interface5 arg0) {
		if (this.aBoolean475) {
			this.method5356(arg0);
			this.method5383(arg0);
		} else if (this.anInt6444 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt6444 >= 0) {
				this.anInterface5Array2[this.anInt6444].method7679();
			}
			this.anInterface5_1 = this.anInterface5_2 = this.anInterface5Array2[++this.anInt6444] = arg0;
			this.anInterface5_1.method7674();
		}
	}

	@OriginalMember(owner = "client!no", name = "C", descriptor = "()Z")
	@Override
	public boolean method6849() {
		return this.aClass4_Sub29_Sub1_1 != null && (this.anInt6437 <= 1 || this.aBoolean472);
	}

	@OriginalMember(owner = "client!no", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class98_Sub3 local6 = (Class98_Sub3) arg1;
		@Pc(9) Class114_Sub1_Sub1 local9 = local6.aClass114_Sub1_Sub1_5;
		this.method5366();
		this.method5382(local6.aClass114_Sub1_Sub1_5);
		this.method5398(1);
		this.method5396(8448, 7681);
		this.method5361(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat103 / (float) local9.anInt5922;
		@Pc(46) float local46 = local9.aFloat104 / (float) local9.anInt5924;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt6462 - arg2) * local39, (float) (this.anInt6484 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6462, this.anInt6484);
		OpenGL.glTexCoord2f((float) (this.anInt6462 - arg2) * local39, local46 * (float) (this.anInt6479 - arg3));
		OpenGL.glVertex2i(this.anInt6462, this.anInt6479);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6466 - arg2), local46 * (float) (this.anInt6479 - arg3));
		OpenGL.glVertex2i(this.anInt6466, this.anInt6479);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6466 - arg2), local46 * (float) (this.anInt6484 - arg3));
		OpenGL.glVertex2i(this.anInt6466, this.anInt6484);
		OpenGL.glEnd();
		this.method5361(768, 0, 5890);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(BI)V")
	public synchronized void method5392(@OriginalArg(1) int arg0) {
		@Pc(11) Class4 local11 = new Class4();
		local11.aLong307 = arg0;
		this.aClass124_39.method3275(local11);
	}

	@OriginalMember(owner = "client!no", name = "m", descriptor = "(IIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6457 = arg0;
		this.anInt6476 = arg3;
		this.anInt6480 = arg1;
		this.anInt6469 = arg2;
		this.method5376();
		this.method5404();
		if (this.anInt6475 == 3) {
			this.method5368();
		} else if (this.anInt6475 == 2) {
			this.method5402();
		}
	}

	@OriginalMember(owner = "client!no", name = "p", descriptor = "()Z")
	@Override
	public boolean method6820() {
		return true;
	}

	@OriginalMember(owner = "client!no", name = "D", descriptor = "()Z")
	@Override
	public boolean method6850() {
		return true;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I[BZII)Lclient!gb;")
	public Interface10 method5393(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		return (Interface10) (this.aBoolean493 && (!arg2 || this.aBoolean466) ? new Class188_Sub1(this, arg0, arg1, arg3, arg2) : new Class20_Sub1(this, arg0, arg1, arg3));
	}

	@OriginalMember(owner = "client!no", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.method5398(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "()Lclient!q;")
	@Override
	public Class134 method6788() {
		return new Class134_Sub2();
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(III)V")
	public synchronized void method5394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub33 local8 = new Class4_Sub33(arg1);
		local8.aLong307 = arg0;
		this.aClass124_36.method3275(local8);
	}

	@OriginalMember(owner = "client!no", name = "k", descriptor = "()V")
	@Override
	public void k() {
		this.aBoolean490 = false;
		this.aClass224_1.method4944(0, false, false, 0, 0);
		this.method5359();
		this.method5388();
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V")
	private void method5395() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL2.b()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static55.method845(1000L);
		}
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(III)V")
	public void method5396(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6477 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg1 != this.anInt6487) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local11 = true;
			this.anInt6487 = arg1;
		}
		if (this.anInt6456 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			this.anInt6456 = arg0;
			local11 = true;
		}
		if (local11) {
			this.anInt6472 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public Class13 method6843(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class13_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6792(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas11) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable5.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!no", name = "s", descriptor = "(I)V")
	private void method5397() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass134_Sub2_4.method3449(), 0);
		if (this.aBoolean490) {
			this.aClass224_1.aClass44_Sub1_1.method827();
		}
		this.method5403();
		this.method5387();
	}

	@OriginalMember(owner = "client!no", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt6453;
		if (local11 || arg1 != this.aFloat111 || this.aFloat114 != arg2) {
			this.aFloat114 = arg2;
			this.aFloat111 = arg1;
			this.anInt6453 = arg0;
			if (local11) {
				this.aFloat116 = (float) (this.anInt6453 & 0xFF0000) / 1.671168E7F;
				this.aFloat112 = (float) (this.anInt6453 & 0xFF00) / 65280.0F;
				this.aFloat131 = (float) (this.anInt6453 & 0xFF) / 255.0F;
				this.method5423();
			}
			this.method5401();
		}
		if (arg3 == this.aFloatArray43[0] && arg4 == this.aFloatArray43[1] && this.aFloatArray43[2] == arg5) {
			return;
		}
		this.aFloatArray43[2] = arg5;
		this.aFloatArray43[0] = arg3;
		this.aFloatArray43[1] = arg4;
		this.aFloatArray44[1] = -arg4;
		this.aFloatArray44[0] = -arg3;
		this.aFloatArray44[2] = -arg5;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray41[0] = arg3 * local138;
		this.aFloatArray41[2] = local138 * arg5;
		this.aFloatArray41[1] = arg4 * local138;
		this.aFloatArray45[0] = -this.aFloatArray41[0];
		this.aFloatArray45[2] = -this.aFloatArray41[2];
		this.aFloatArray45[1] = -this.aFloatArray41[1];
		this.method5403();
		this.anInt6461 = (int) (arg3 * 256.0F / arg4);
		this.anInt6452 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(II)V")
	public void method5398(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt6465) {
			return;
		}
		@Pc(18) boolean local18;
		@Pc(20) byte local20;
		if (arg0 == 1) {
			local18 = true;
			local20 = 1;
		} else if (arg0 == 2) {
			local20 = 2;
			local18 = false;
		} else if (arg0 == 128) {
			local18 = true;
			local20 = 3;
		} else {
			local20 = 0;
			local18 = false;
		}
		if (!this.aBoolean478) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean478 = true;
		}
		if (this.aBoolean474 != local18) {
			if (local18) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean474 = local18;
		}
		if (this.anInt6460 != local20) {
			if (local20 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local20 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local20 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt6460 = local20;
		}
		this.anInt6472 &= 0xFFFFFFE3;
		this.anInt6465 = arg0;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6806(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static564.aFloat189 = arg2;
		Static501.aFloat185 = arg0;
		Static459.aFloat156 = arg1;
	}

	@OriginalMember(owner = "client!no", name = "F", descriptor = "()V")
	@Override
	public void F() {
		this.anInt6462 = 0;
		this.anInt6479 = this.anInt6320;
		this.anInt6466 = this.anInt6340;
		this.anInt6484 = 0;
		OpenGL.glDisable(3089);
		this.method5404();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!c;)V")
	@Override
	public void method6846(@OriginalArg(0) Class42 arg0) {
		this.aClass273_1.method5954(this, arg0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIF)Lclient!pv;")
	@Override
	public Class4_Sub32 method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub32_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6815(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas11) {
			local5 = this.aLong184;
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable5.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas12 == arg0) {
			this.method5364();
		}
	}

	@OriginalMember(owner = "client!no", name = "v", descriptor = "()I")
	@Override
	public int v() {
		return this.anInt6449 + this.anInt6448 + this.anInt6447;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!pf;IIII)Lclient!ba;")
	@Override
	public Class9 method6779(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class9_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public void method6800(@OriginalArg(0) Class4_Sub6 arg0) {
		this.aNativeHeap4 = ((Class4_Sub6_Sub2) arg0).aNativeHeap6;
		if (this.anInterface10_4 != null) {
			return;
		}
		@Pc(16) Class4_Sub9_Sub2 local16 = new Class4_Sub9_Sub2(80);
		if (this.aBoolean476) {
			local16.method6031(-1.0F, 69);
			local16.method6031(-1.0F, 68);
			local16.method6031(0.0F, 111);
			local16.method6031(0.0F, 92);
			local16.method6031(1.0F, 82);
			local16.method6031(1.0F, 63);
			local16.method6031(-1.0F, 74);
			local16.method6031(0.0F, 33);
			local16.method6031(1.0F, 69);
			local16.method6031(1.0F, 36);
			local16.method6031(1.0F, 30);
			local16.method6031(1.0F, 84);
			local16.method6031(0.0F, 82);
			local16.method6031(1.0F, 68);
			local16.method6031(0.0F, 40);
			local16.method6031(-1.0F, 62);
			local16.method6031(1.0F, 58);
			local16.method6031(0.0F, 124);
			local16.method6031(0.0F, 124);
			local16.method6031(0.0F, 41);
		} else {
			local16.method6030(-1.0F);
			local16.method6030(-1.0F);
			local16.method6030(0.0F);
			local16.method6030(0.0F);
			local16.method6030(1.0F);
			local16.method6030(1.0F);
			local16.method6030(-1.0F);
			local16.method6030(0.0F);
			local16.method6030(1.0F);
			local16.method6030(1.0F);
			local16.method6030(1.0F);
			local16.method6030(1.0F);
			local16.method6030(0.0F);
			local16.method6030(1.0F);
			local16.method6030(0.0F);
			local16.method6030(-1.0F);
			local16.method6030(1.0F);
			local16.method6030(0.0F);
			local16.method6030(0.0F);
			local16.method6030(0.0F);
		}
		this.anInterface10_4 = this.method5393(20, local16.aByteArray97, false, local16.anInt7219);
		this.aClass117_8 = new Class117(this.anInterface10_4, 5126, 3, 0);
		this.aClass117_9 = new Class117(this.anInterface10_4, 5126, 2, 12);
		this.aClass273_1.method5952(this);
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6824(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class4_Sub33 local19;
		while (!this.aClass124_35.method3264()) {
			local19 = (Class4_Sub33) this.aClass124_35.method3272();
			Static293.anIntArray460[local7++] = (int) local19.aLong307;
			this.anInt6448 -= local19.anInt6079;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static293.anIntArray460, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static293.anIntArray460, 0);
			local7 = 0;
		}
		while (!this.aClass124_36.method3264()) {
			local19 = (Class4_Sub33) this.aClass124_36.method3272();
			Static293.anIntArray460[local7++] = (int) local19.aLong307;
			this.anInt6447 -= local19.anInt6079;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static293.anIntArray460, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static293.anIntArray460, 0);
			local7 = 0;
		}
		while (!this.aClass124_37.method3264()) {
			local19 = (Class4_Sub33) this.aClass124_37.method3272();
			Static293.anIntArray460[local7++] = local19.anInt6079;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static293.anIntArray460, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static293.anIntArray460, 0);
			local7 = 0;
		}
		while (!this.aClass124_38.method3264()) {
			local19 = (Class4_Sub33) this.aClass124_38.method3272();
			Static293.anIntArray460[local7++] = (int) local19.aLong307;
			this.anInt6449 -= local19.anInt6079;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static293.anIntArray460, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static293.anIntArray460, 0);
		}
		while (!this.aClass124_34.method3264()) {
			local19 = (Class4_Sub33) this.aClass124_34.method3272();
			OpenGL.glDeleteLists((int) local19.aLong307, local19.anInt6079);
		}
		@Pc(213) Class4 local213;
		while (!this.aClass124_39.method3264()) {
			local213 = this.aClass124_39.method3272();
			OpenGL.glDeleteProgramARB((int) local213.aLong307);
		}
		while (!this.aClass124_40.method3264()) {
			local213 = this.aClass124_40.method3272();
			OpenGL.glDeleteObjectARB(local213.aLong307);
		}
		while (!this.aClass124_34.method3264()) {
			local19 = (Class4_Sub33) this.aClass124_34.method3272();
			OpenGL.glDeleteLists((int) local19.aLong307, local19.anInt6079);
		}
		this.aClass228_1.method4990();
		if (this.v() > 100663296 && Static184.method3422() > this.aLong185 + 60000L) {
			System.gc();
			this.aLong185 = Static184.method3422();
		}
		this.anInt6442 = local11;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(JZ)V")
	public synchronized void method5399(@OriginalArg(0) long arg0) {
		@Pc(11) Class4 local11 = new Class4();
		local11.aLong307 = arg0;
		this.aClass124_40.method3275(local11);
	}

	@OriginalMember(owner = "client!no", name = "x", descriptor = "()Lclient!ffa;")
	@Override
	public Class105 method6836() {
		@Pc(7) int local7 = -1;
		if (this.aString74.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString74.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString74.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class105(local7, "OpenGL", this.anInt6468, this.aString75, 0L);
	}

	@OriginalMember(owner = "client!no", name = "ya", descriptor = "(IIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5353();
		this.method5398(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!fb;B)V")
	public void method5400(@OriginalArg(0) Interface5 arg0) {
		if (this.anInt6446 < 0 || this.anInterface5Array1[this.anInt6446] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface5Array1[this.anInt6446--] = null;
		arg0.method7675();
		if (this.anInt6446 < 0) {
			this.anInterface5_1 = null;
		} else {
			this.anInterface5_1 = this.anInterface5Array1[this.anInt6446];
			this.anInterface5_1.method7677();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ot;I)V")
	@Override
	public void method6845(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class26_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method4023(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(Z)V")
	@Override
	public void method6851(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!no", name = "h", descriptor = "()V")
	@Override
	public void method6790() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!no", name = "SA", descriptor = "()I")
	@Override
	public int SA() {
		@Pc(6) int local6 = this.anInt6488;
		this.anInt6488 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!no", name = "t", descriptor = "(I)V")
	private void method5401() {
		Static554.aFloatArray67[0] = this.aFloat116 * this.aFloat111;
		Static554.aFloatArray67[2] = this.aFloat131 * this.aFloat111;
		Static554.aFloatArray67[1] = this.aFloat111 * this.aFloat112;
		Static554.aFloatArray67[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static554.aFloatArray67, 0);
		Static554.aFloatArray67[3] = 1.0F;
		Static554.aFloatArray67[1] = -this.aFloat114 * this.aFloat112;
		Static554.aFloatArray67[2] = -this.aFloat114 * this.aFloat131;
		Static554.aFloatArray67[0] = -this.aFloat114 * this.aFloat116;
		OpenGL.glLightfv(16385, 4609, Static554.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!no", name = "z", descriptor = "()Lclient!q;")
	@Override
	public Class134 method6842() {
		return this.aClass134_Sub2_1;
	}

	@OriginalMember(owner = "client!no", name = "o", descriptor = "()Z")
	@Override
	public boolean method6814() {
		if (this.aClass4_Sub29_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass4_Sub29_Sub1_1.method4870()) {
			if (!this.aClass330_1.method7395(this.aClass4_Sub29_Sub1_1)) {
				return false;
			}
			this.aClass228_1.method4993();
		}
		return true;
	}

	@OriginalMember(owner = "client!no", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return this.anInt6474;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!ba;Lclient!c;Lclient!q;Lclient!ot;I)V")
	@Override
	public void method6807(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class26_Sub5 arg3, @OriginalArg(4) int arg4) {
		arg0.method4023(arg2, arg3, arg4);
		this.method6846(arg1);
	}

	@OriginalMember(owner = "client!no", name = "u", descriptor = "(I)V")
	private void method5402() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray42, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(B)V")
	public void method5403() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray41, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray45, 0);
	}

	@OriginalMember(owner = "client!no", name = "C", descriptor = "(IIIIII)V")
	@Override
	public void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method5353();
		this.method5398(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean483) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean483) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!no", name = "i", descriptor = "(I)V")
	@Override
	public void method6840(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt6432 = arg0;
		this.aClass228_1.method4993();
	}

	@OriginalMember(owner = "client!no", name = "v", descriptor = "(I)V")
	private void method5404() {
		this.aFloat132 = this.anInt6462 - this.anInt6457;
		this.aFloat130 = this.anInt6479 - this.anInt6480;
		this.aFloat129 = this.anInt6484 - this.anInt6480;
		this.aFloat124 = this.anInt6466 - this.anInt6457;
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(ZI)V")
	public void method5405(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean480 != arg0) {
			this.aBoolean480 = arg0;
			this.method5373();
			this.anInt6472 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!no", name = "w", descriptor = "(I)V")
	private void method5406() {
		if (this.anInt6475 != 3) {
			this.anInt6475 = 3;
			this.method5368();
			this.method5397();
			this.anInt6472 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method6811(@OriginalArg(0) Class13 arg0) {
		this.aClass13_Sub2_1 = (Class13_Sub2) arg0;
		@Pc(60) Class4_Sub7 local60;
		if (this.aBoolean482) {
			if (this.aClass347_3 == null) {
				this.aClass347_3 = new Class347(this);
			}
			if (this.aClass347_3 == this.anInterface5_2) {
				throw new RuntimeException();
			}
			this.method5391(this.aClass347_3);
			@Pc(166) Class4_Sub7_Sub2 local166 = (Class4_Sub7_Sub2) this.aClass183_25.method4289((long) (this.aClass13_Sub2_1.QA() << 16 | this.aClass13_Sub2_1.b()));
			if (local166 == null) {
				local166 = new Class4_Sub7_Sub2(this, 6402, this.aClass13_Sub2_1.QA(), this.aClass13_Sub2_1.b());
				@Pc(199) Class4_Sub7_Sub2 local199;
				for (this.anInt6450 += local166.anInt831; this.anInt6450 > 2097152; this.anInt6450 -= local199.anInt831) {
					local60 = this.aClass286_12.method6413();
					if (local60 == null) {
						break;
					}
					local199 = (Class4_Sub7_Sub2) local60;
					local199.method7963();
					local199.method8013();
					local199.method721();
				}
				this.aClass183_25.method4282((long) (this.aClass13_Sub2_1.QA() << 16 | this.aClass13_Sub2_1.b()), local166);
			}
			this.aClass286_12.method6404(local166);
			this.aClass347_3.method7680(local166, 8);
			this.aClass347_3.method7687(this.aClass13_Sub2_1.aClass114_Sub1_Sub1_1, 0);
		} else if (this.aBoolean485) {
			@Pc(31) Class4_Sub7_Sub15 local31 = (Class4_Sub7_Sub15) this.aClass183_25.method4289((long) (this.aClass13_Sub2_1.QA() << 16 | this.aClass13_Sub2_1.b()));
			if (local31 == null) {
				local31 = new Class4_Sub7_Sub15(this, this.aClass13_Sub2_1.QA(), this.aClass13_Sub2_1.b());
				@Pc(67) Class4_Sub7_Sub15 local67;
				for (this.anInt6450 += local31.anInt7936 * 4; this.anInt6450 > 2097152; this.anInt6450 -= local67.anInt7936) {
					local60 = this.aClass286_12.method6413();
					if (local60 == null) {
						break;
					}
					local67 = (Class4_Sub7_Sub15) local60;
					local67.method7963();
					local67.method8013();
					this.anOpenGL2.releasePbuffer(local67.method6560());
				}
				this.aClass183_25.method4282((long) (this.aClass13_Sub2_1.QA() << 16 | this.aClass13_Sub2_1.b()), local31);
			}
			this.aClass286_12.method6404(local31);
			this.anOpenGL2.setPbuffer(local31.method6560());
		} else {
			throw new RuntimeException("");
		}
		this.anInt6340 = arg0.QA();
		this.anInt6320 = arg0.b();
		this.method5365();
		this.method5426();
		this.F();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(FI)V")
	public void method5407(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat122) {
			this.aFloat122 = arg0;
			if (this.anInt6475 == 3) {
				this.method5368();
			}
		}
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "()V")
	@Override
	public void method6784() {
		if (!this.aBoolean484 || this.anInt6340 <= 0 || this.anInt6320 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt6462;
		@Pc(19) int local19 = this.anInt6466;
		@Pc(22) int local22 = this.anInt6484;
		@Pc(25) int local25 = this.anInt6479;
		this.F();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5365();
		this.method5371(false);
		this.method5405(false);
		this.method5384(false);
		this.method5432(false);
		this.method5382(null);
		this.method5431(-2);
		this.method5355(1);
		this.method5398(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt6340, this.anInt6320, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.ca(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IZI)V")
	public void method5408(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method5374(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!no", name = "l", descriptor = "()Z")
	@Override
	public boolean method6804() {
		return false;
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(II)I")
	public int method5409(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!no", name = "i", descriptor = "()Z")
	@Override
	public boolean method6793() {
		return true;
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(ILclient!fb;)V")
	public void method5410(@OriginalArg(1) Interface5 arg0) {
		if (this.aBoolean475) {
			this.method5400(arg0);
			this.method5369(arg0);
		} else if (this.anInt6444 >= 0 && this.anInterface5Array2[this.anInt6444] == arg0) {
			this.anInterface5Array2[this.anInt6444--] = null;
			arg0.method7679();
			if (this.anInt6444 >= 0) {
				this.anInterface5_1 = this.anInterface5_2 = this.anInterface5Array2[this.anInt6444];
				this.anInterface5_1.method7674();
			} else {
				this.anInterface5_1 = this.anInterface5_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(B)V")
	private void method5411() {
		if (this.anInt6475 != 2) {
			this.anInt6475 = 2;
			this.method5402();
			this.method5397();
			this.anInt6472 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6816() {
		this.method5353();
		this.method5398(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(I)Lclient!i;")
	@Override
	public Class4_Sub6 method6833(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub6_Sub2 local8 = new Class4_Sub6_Sub2(arg0);
		this.aClass124_33.method3275(local8);
		return local8;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public void method6844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class98 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class98_Sub3 local6 = (Class98_Sub3) arg5;
		@Pc(9) Class114_Sub1_Sub1 local9 = local6.aClass114_Sub1_Sub1_5;
		this.method5366();
		this.method5382(local6.aClass114_Sub1_Sub1_5);
		this.method5398(1);
		this.method5396(8448, 7681);
		this.method5361(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat103 / (float) local9.anInt5922;
		@Pc(46) float local46 = local9.aFloat104 / (float) local9.anInt5924;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local59 * local59)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(91) float local91 = local52 * local72;
		@Pc(95) float local95 = local59 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local91 + 0.35F, local95 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method5361(768, 0, 5890);
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(B)V")
	public void method5412() {
		if (this.anInt6472 == 8) {
			return;
		}
		this.method5411();
		this.method5371(true);
		this.method5384(true);
		this.method5432(true);
		this.method5398(1);
		this.anInt6472 = 8;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(IIIIII)Lclient!dn;")
	@Override
	public Class75 method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean465 ? new Class75_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!dn;)V")
	@Override
	public void method6803(@OriginalArg(0) Class75 arg0) {
		this.aClass75_Sub1_1 = (Class75_Sub1) arg0;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!gda;Lclient!gda;Lclient!gda;Lclient!gda;I)V")
	public void method5413(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) Class117 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5418(arg1.anInterface10_3);
			OpenGL.glVertexPointer(arg1.aByte44, arg1.aShort53, this.anInterface10_5.method5608(), this.anInterface10_5.method5607() + (long) arg1.aByte45);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5418(arg2.anInterface10_3);
			OpenGL.glNormalPointer(arg2.aShort53, this.anInterface10_5.method5608(), this.anInterface10_5.method5607() + (long) arg2.aByte45);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5418(arg0.anInterface10_3);
			OpenGL.glColorPointer(arg0.aByte44, arg0.aShort53, this.anInterface10_5.method5608(), this.anInterface10_5.method5607() + (long) arg0.aByte45);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5418(arg3.anInterface10_3);
			OpenGL.glTexCoordPointer(arg3.aByte44, arg3.aShort53, this.anInterface10_5.method5608(), this.anInterface10_5.method5607() + (long) arg3.aByte45);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V")
	@Override
	public void method6839(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!no", name = "x", descriptor = "(I)V")
	private void method5414() {
		if (this.anInt6475 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt6340 > 0 && this.anInt6320 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt6340, (double) this.anInt6320, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt6472 &= 0xFFFFFFE7;
		this.anInt6475 = 1;
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(III)V")
	public void method5415(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6463 = arg0;
		this.anInt6455 = arg1;
		this.method5426();
		this.method5436();
	}

	@OriginalMember(owner = "client!no", name = "sa", descriptor = "(II)V")
	@Override
	public void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6481 == arg0 && arg1 == this.anInt6474) {
			return;
		}
		this.anInt6474 = arg1;
		this.anInt6481 = arg0;
		this.method5376();
		this.method5359();
		if (this.anInt6475 == 3) {
			this.method5368();
		} else if (this.anInt6475 == 2) {
			this.method5402();
		}
	}

	@OriginalMember(owner = "client!no", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6473 = arg2;
		this.anInt6471 = arg0;
		this.anInt6483 = arg1;
		this.aBoolean490 = true;
		this.anInt6478 = arg3;
		this.aClass224_1.method4944(0, false, false, 0, 3);
		this.aClass224_1.aClass44_Sub1_1.method827();
		this.method5359();
		this.method5388();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!gb;)V")
	public void method5418(@OriginalArg(1) Interface10 arg0) {
		if (this.anInterface10_5 != arg0) {
			if (this.aBoolean493) {
				OpenGL.glBindBufferARB(34962, arg0.method5606());
			}
			this.anInterface10_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!no", name = "s", descriptor = "()F")
	public float method5419() {
		return this.aFloat117;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!kga;[Lclient!pga;Z)Lclient!ta;")
	@Override
	public Class91 method6829(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class268[] arg1) {
		return new Class91_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!no", name = "g", descriptor = "(B)V")
	private void method5420() {
		this.anOpenGL2.a();
	}

	@OriginalMember(owner = "client!no", name = "y", descriptor = "(I)V")
	private void method5421() {
		this.method5431(-2);
		for (@Pc(14) int local14 = this.anInt6458 - 1; local14 >= 0; local14--) {
			this.method5381(local14);
			this.method5382(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5396(8448, 8448);
		this.method5361(770, 2, 34168);
		this.method5358();
		this.anInt6465 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt6460 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean474 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean478 = true;
		this.method5371(true);
		this.method5405(true);
		this.method5384(true);
		this.method5432(true);
		this.method5365();
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
		this.anInt6453 = this.anInt6470 = -1;
		this.F();
	}

	@OriginalMember(owner = "client!no", name = "G", descriptor = "()F")
	public float method5422() {
		return this.aFloat126;
	}

	@OriginalMember(owner = "client!no", name = "h", descriptor = "(B)V")
	private void method5423() {
		Static554.aFloatArray67[3] = 1.0F;
		Static554.aFloatArray67[2] = this.aFloat131 * this.aFloat128;
		Static554.aFloatArray67[0] = this.aFloat116 * this.aFloat128;
		Static554.aFloatArray67[1] = this.aFloat112 * this.aFloat128;
		OpenGL.glLightModelfv(2899, Static554.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!no", name = "A", descriptor = "([I)V")
	@Override
	public void A(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6462;
		arg0[1] = this.anInt6484;
		arg0[2] = this.anInt6466;
		arg0[3] = this.anInt6479;
	}

	@OriginalMember(owner = "client!no", name = "w", descriptor = "()Z")
	@Override
	public boolean method6834() {
		return true;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(IIII)V")
	public void method5424(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!no", name = "z", descriptor = "(I)V")
	public void method5425() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!no", name = "A", descriptor = "(I)V")
	private void method5426() {
		OpenGL.glViewport(this.anInt6455, this.anInt6463, this.anInt6340, this.anInt6320);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass330_1.method7396(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIZ)Lclient!xa;")
	@Override
	public Class13 method6856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class13_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!no", name = "i", descriptor = "(B)V")
	private void method5427() {
		if (this.aFloat117 == 0.0F) {
			this.aFloatArray42[14] = this.aFloat121;
			this.aFloatArray42[10] = this.bf;
		} else {
			@Pc(13) float local13 = this.aFloat126 / (this.aFloat126 + this.aFloat117);
			@Pc(17) float local17 = local13 * local13;
			@Pc(33) float local33 = (1.0F - local13) * (1.0F - local13) * -this.aFloat121 / this.aFloat117;
			this.aFloatArray42[10] = this.bf + local33;
			this.aFloatArray42[14] = local17 * this.aFloat121;
		}
		this.aFloat119 = (this.aFloatArray42[14] - (float) this.anInt6474) / this.aFloatArray42[10];
		this.aFloat125 = (float) this.anInt6474 - this.aFloat117;
	}

	@OriginalMember(owner = "client!no", name = "B", descriptor = "(I)V")
	public void method5428() {
		if (this.anInt6472 == 16) {
			return;
		}
		this.method5406();
		this.method5371(true);
		this.method5384(true);
		this.method5432(true);
		this.method5398(1);
		this.anInt6472 = 16;
	}

	@OriginalMember(owner = "client!no", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6462 < arg0) {
			this.anInt6462 = arg0;
		}
		if (this.anInt6466 > arg2) {
			this.anInt6466 = arg2;
		}
		if (this.anInt6479 > arg3) {
			this.anInt6479 = arg3;
		}
		if (this.anInt6484 < arg1) {
			this.anInt6484 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method5404();
		this.method5436();
	}

	@OriginalMember(owner = "client!no", name = "m", descriptor = "()V")
	@Override
	protected void method6805() {
		for (@Pc(10) Class4 local10 = this.aClass124_33.method3267(); local10 != null; local10 = this.aClass124_33.method3273()) {
			((Class4_Sub6_Sub2) local10).method7923();
		}
		if (this.aClass330_1 != null) {
			this.aClass330_1.method7393();
		}
		if (this.anOpenGL2 != null) {
			this.method5420();
			@Pc(40) Enumeration local40 = this.aHashtable5.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable5.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean464) {
			Static333.method5017(false, true);
			this.aBoolean464 = false;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(FBFF)V")
	private void method5429(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean467) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg1, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean467 = true;
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
	@Override
	public void method6813(@OriginalArg(0) int arg0) {
		this.method5395();
	}

	@OriginalMember(owner = "client!no", name = "na", descriptor = "(III[I)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass134_Sub2_4.aFloat79 * (float) arg1 + this.aClass134_Sub2_4.aFloat78 * (float) arg0 + this.aClass134_Sub2_4.aFloat87 * (float) arg2 + this.aClass134_Sub2_4.aFloat83;
		if ((float) this.anInt6481 > local28 || local28 > (float) this.anInt6474) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt6469 * (this.aClass134_Sub2_4.aFloat84 + (float) arg0 * this.aClass134_Sub2_4.aFloat85 + (float) arg1 * this.aClass134_Sub2_4.aFloat86 + (float) arg2 * this.aClass134_Sub2_4.aFloat80) / local28);
		@Pc(117) int local117 = (int) ((this.aClass134_Sub2_4.aFloat81 * (float) arg2 + (float) arg0 * this.aClass134_Sub2_4.aFloat89 + this.aClass134_Sub2_4.aFloat88 * (float) arg1 + this.aClass134_Sub2_4.aFloat82) * (float) this.anInt6476 / local28);
		if (this.aFloat132 <= (float) local85 && this.aFloat124 >= (float) local85 && this.aFloat129 <= (float) local117 && (float) local117 <= this.aFloat130) {
			arg3[0] = (int) ((float) local85 - this.aFloat132);
			arg3[1] = (int) ((float) local117 - this.aFloat129);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!no", name = "C", descriptor = "(I)V")
	private void method5430() {
		OpenGL.glDepthMask(this.aBoolean470 && this.aBoolean473);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5353();
		this.method5398(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local23 * local23)));
		@Pc(40) float local40 = local16 * local36;
		@Pc(44) float local44 = local23 * local36;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local40 + (float) arg2 + 0.35F, local44 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!no", name = "aa", descriptor = "()I")
	@Override
	public int aa() {
		@Pc(6) int local6 = this.anInt6489;
		this.anInt6489 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!no", name = "g", descriptor = "(II)V")
	public void method5431(@OriginalArg(1) int arg0) {
		this.method5408(arg0, true);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(II)I")
	@Override
	public int method6831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)V")
	public void method5432(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean470) {
			this.aBoolean470 = arg0;
			this.method5430();
			this.anInt6472 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!no", name = "E", descriptor = "(I)V")
	public void method5433() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!no", name = "j", descriptor = "()V")
	@Override
	public void method6795() {
		this.method5432(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!no", name = "h", descriptor = "(II)I")
	public int method5434(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class16 method6797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class16_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!no", name = "KA", descriptor = "(IIII)[I")
	@Override
	public int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt6320 - arg1 - local12, arg2, 1, 32993, this.anInt6459, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([Lclient!ba;Lclient!c;Lclient!q;[Lclient!ot;I)V")
	@Override
	public void method6798(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class26_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method6845(arg0, arg2, arg3, arg4);
		this.method6846(arg1);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BII)V")
	public synchronized void method5435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub33 local14 = new Class4_Sub33(arg0);
		local14.aLong307 = arg1;
		this.aClass124_38.method3275(local14);
	}

	@OriginalMember(owner = "client!no", name = "n", descriptor = "()V")
	@Override
	public void method6808() {
		this.aClass330_1.method7389();
	}

	@OriginalMember(owner = "client!no", name = "F", descriptor = "(I)V")
	private void method5436() {
		if (this.anInt6462 <= this.anInt6466 && this.anInt6479 >= this.anInt6484) {
			OpenGL.glScissor(this.anInt6455 + this.anInt6462, -this.anInt6479 + this.anInt6320 + this.anInt6463, this.anInt6466 - this.anInt6462, this.anInt6479 + -this.anInt6484);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(FFIFF)V")
	public void method5437(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static554.aFloatArray67[3] = arg0;
		Static554.aFloatArray67[2] = arg1;
		Static554.aFloatArray67[0] = arg2;
		Static554.aFloatArray67[1] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static554.aFloatArray67, 0);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(Z)V")
	@Override
	public void method6857(@OriginalArg(0) boolean arg0) {
		this.aBoolean473 = arg0;
		this.method5430();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method5353();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method5398(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean483) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean483) {
			OpenGL.glEnable(32925);
		}
	}
}
