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

@OriginalClass("client!ag")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
	public int anInt297;

	@OriginalMember(owner = "client!ag", name = "Ec", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!ag", name = "jd", descriptor = "I")
	public int anInt414;

	@OriginalMember(owner = "client!ag", name = "xd", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!ag", name = "ne", descriptor = "I")
	public int anInt461;

	@OriginalMember(owner = "client!ag", name = "se", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!ag", name = "te", descriptor = "Lclient!na;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!ag", name = "xe", descriptor = "Lclient!af;")
	private Class10_Sub2 aClass10_Sub2_1;

	@OriginalMember(owner = "client!ag", name = "ye", descriptor = "Lclient!iu;")
	private Class161 aClass161_1;

	@OriginalMember(owner = "client!ag", name = "Be", descriptor = "Lclient!na;")
	private Interface17 anInterface17_2;

	@OriginalMember(owner = "client!ag", name = "Fe", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!ag", name = "He", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!ag", name = "Ie", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!ag", name = "Je", descriptor = "I")
	private int anInt470;

	@OriginalMember(owner = "client!ag", name = "Qe", descriptor = "Z")
	private boolean aBoolean12;

	@OriginalMember(owner = "client!ag", name = "Re", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!ag", name = "Se", descriptor = "I")
	private int anInt472;

	@OriginalMember(owner = "client!ag", name = "Te", descriptor = "I")
	private int anInt473;

	@OriginalMember(owner = "client!ag", name = "Ue", descriptor = "Z")
	private boolean aBoolean13;

	@OriginalMember(owner = "client!ag", name = "Ve", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!ag", name = "Xe", descriptor = "Z")
	private boolean aBoolean14;

	@OriginalMember(owner = "client!ag", name = "Ye", descriptor = "Z")
	private boolean aBoolean15;

	@OriginalMember(owner = "client!ag", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!ag", name = "cf", descriptor = "Lclient!vp;")
	public Class61_Sub3 aClass61_Sub3_1;

	@OriginalMember(owner = "client!ag", name = "gf", descriptor = "Z")
	private boolean aBoolean17;

	@OriginalMember(owner = "client!ag", name = "kf", descriptor = "Lclient!vp;")
	public Class61_Sub3 aClass61_Sub3_2;

	@OriginalMember(owner = "client!ag", name = "mf", descriptor = "Lclient!vp;")
	public Class61_Sub3 aClass61_Sub3_3;

	@OriginalMember(owner = "client!ag", name = "nf", descriptor = "F")
	public float aFloat2;

	@OriginalMember(owner = "client!ag", name = "of", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!ag", name = "pf", descriptor = "Z")
	public boolean aBoolean18;

	@OriginalMember(owner = "client!ag", name = "qf", descriptor = "I")
	private int anInt477;

	@OriginalMember(owner = "client!ag", name = "sf", descriptor = "Lclient!vp;")
	public Class61_Sub3 aClass61_Sub3_4;

	@OriginalMember(owner = "client!ag", name = "tf", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!ag", name = "vf", descriptor = "Lclient!ck;")
	private Class52_Sub1_Sub1 aClass52_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ag", name = "wf", descriptor = "I")
	private int anInt479;

	@OriginalMember(owner = "client!ag", name = "xf", descriptor = "Z")
	public boolean aBoolean19;

	@OriginalMember(owner = "client!ag", name = "Af", descriptor = "Z")
	public boolean aBoolean20;

	@OriginalMember(owner = "client!ag", name = "Bf", descriptor = "I")
	public int anInt481;

	@OriginalMember(owner = "client!ag", name = "Ef", descriptor = "Lclient!vh;")
	private Interface23 anInterface23_2;

	@OriginalMember(owner = "client!ag", name = "Ff", descriptor = "Z")
	public boolean aBoolean22;

	@OriginalMember(owner = "client!ag", name = "Gf", descriptor = "[Lclient!vfa;")
	private Class52[] aClass52Array1;

	@OriginalMember(owner = "client!ag", name = "If", descriptor = "I")
	private int anInt484;

	@OriginalMember(owner = "client!ag", name = "Jf", descriptor = "Z")
	public boolean aBoolean23;

	@OriginalMember(owner = "client!ag", name = "Kf", descriptor = "F")
	public float aFloat5;

	@OriginalMember(owner = "client!ag", name = "Mf", descriptor = "Lclient!fe;")
	public Class97 aClass97_1;

	@OriginalMember(owner = "client!ag", name = "Uf", descriptor = "Z")
	private boolean aBoolean27;

	@OriginalMember(owner = "client!ag", name = "Wf", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!ag", name = "Xf", descriptor = "Lclient!dga;")
	public Class52_Sub1 aClass52_Sub1_2;

	@OriginalMember(owner = "client!ag", name = "Zf", descriptor = "Z")
	public boolean aBoolean28;

	@OriginalMember(owner = "client!ag", name = "bg", descriptor = "Lclient!cw;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!ag", name = "cg", descriptor = "Lclient!vp;")
	public Class61_Sub3 aClass61_Sub3_5;

	@OriginalMember(owner = "client!ag", name = "dg", descriptor = "Z")
	private boolean aBoolean30;

	@OriginalMember(owner = "client!ag", name = "eg", descriptor = "Z")
	private boolean aBoolean31;

	@OriginalMember(owner = "client!ag", name = "hg", descriptor = "F")
	private float aFloat11;

	@OriginalMember(owner = "client!ag", name = "jg", descriptor = "Z")
	public boolean aBoolean32;

	@OriginalMember(owner = "client!ag", name = "og", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!ag", name = "qg", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!ag", name = "tg", descriptor = "F")
	private float aFloat17;

	@OriginalMember(owner = "client!ag", name = "ug", descriptor = "I")
	public int anInt492;

	@OriginalMember(owner = "client!ag", name = "wg", descriptor = "Lclient!vp;")
	public Class61_Sub3 aClass61_Sub3_6;

	@OriginalMember(owner = "client!ag", name = "xg", descriptor = "Z")
	public boolean aBoolean33;

	@OriginalMember(owner = "client!ag", name = "Cg", descriptor = "Lclient!vp;")
	public Class61_Sub3 aClass61_Sub3_7;

	@OriginalMember(owner = "client!ag", name = "Dg", descriptor = "I")
	private int anInt495;

	@OriginalMember(owner = "client!ag", name = "Eg", descriptor = "I")
	public int anInt496;

	@OriginalMember(owner = "client!ag", name = "Fg", descriptor = "Lclient!vl;")
	private Class36_Sub2 aClass36_Sub2_1;

	@OriginalMember(owner = "client!ag", name = "Ig", descriptor = "Lclient!cw;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!ag", name = "Lg", descriptor = "Lclient!vp;")
	public Class61_Sub3 aClass61_Sub3_8;

	@OriginalMember(owner = "client!ag", name = "Mg", descriptor = "Z")
	private boolean aBoolean35;

	@OriginalMember(owner = "client!ag", name = "Ng", descriptor = "I")
	private int anInt500;

	@OriginalMember(owner = "client!ag", name = "Qg", descriptor = "Ljava/lang/String;")
	private String aString10;

	@OriginalMember(owner = "client!ag", name = "Rg", descriptor = "I")
	public int anInt501;

	@OriginalMember(owner = "client!ag", name = "Tg", descriptor = "Lclient!vp;")
	public Class61_Sub3 aClass61_Sub3_9;

	@OriginalMember(owner = "client!ag", name = "Ug", descriptor = "Lclient!vp;")
	public Class61_Sub3 aClass61_Sub3_10;

	@OriginalMember(owner = "client!ag", name = "Vg", descriptor = "I")
	private int anInt503;

	@OriginalMember(owner = "client!ag", name = "Xg", descriptor = "Z")
	private boolean aBoolean37;

	@OriginalMember(owner = "client!ag", name = "Yg", descriptor = "Z")
	private boolean aBoolean38;

	@OriginalMember(owner = "client!ag", name = "Zg", descriptor = "Lclient!iu;")
	public Class161 aClass161_2;

	@OriginalMember(owner = "client!ag", name = "ah", descriptor = "Lclient!fe;")
	public Class97 aClass97_2;

	@OriginalMember(owner = "client!ag", name = "bh", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!ag", name = "eh", descriptor = "I")
	private int anInt505;

	@OriginalMember(owner = "client!ag", name = "fh", descriptor = "Z")
	public boolean aBoolean40;

	@OriginalMember(owner = "client!ag", name = "jh", descriptor = "I")
	private int anInt507;

	@OriginalMember(owner = "client!ag", name = "mh", descriptor = "I")
	private int anInt508;

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!ag", name = "Md", descriptor = "I")
	public int anInt441 = 128;

	@OriginalMember(owner = "client!ag", name = "je", descriptor = "Lclient!lq;")
	private final Class207 aClass207_1 = new Class207();

	@OriginalMember(owner = "client!ag", name = "ke", descriptor = "Lclient!ofa;")
	private final Class209_Sub3 aClass209_Sub3_1 = new Class209_Sub3();

	@OriginalMember(owner = "client!ag", name = "le", descriptor = "Lclient!ofa;")
	public final Class209_Sub3 aClass209_Sub3_2 = new Class209_Sub3();

	@OriginalMember(owner = "client!ag", name = "qe", descriptor = "I")
	public int anInt463 = 3;

	@OriginalMember(owner = "client!ag", name = "re", descriptor = "Z")
	private boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ag", name = "pe", descriptor = "I")
	public int anInt462 = 8;

	@OriginalMember(owner = "client!ag", name = "me", descriptor = "Lclient!wo;")
	private final Class361 aClass361_5 = new Class361();

	@OriginalMember(owner = "client!ag", name = "ue", descriptor = "I")
	private int anInt464 = -1;

	@OriginalMember(owner = "client!ag", name = "ve", descriptor = "[Lclient!na;")
	private final Interface17[] anInterface17Array1 = new Interface17[4];

	@OriginalMember(owner = "client!ag", name = "we", descriptor = "[Lclient!na;")
	private final Interface17[] anInterface17Array2 = new Interface17[4];

	@OriginalMember(owner = "client!ag", name = "Ae", descriptor = "I")
	private int anInt465 = -1;

	@OriginalMember(owner = "client!ag", name = "ze", descriptor = "[Lclient!na;")
	private final Interface17[] anInterface17Array3 = new Interface17[4];

	@OriginalMember(owner = "client!ag", name = "Ce", descriptor = "I")
	private int anInt466 = -1;

	@OriginalMember(owner = "client!ag", name = "De", descriptor = "Lclient!gfa;")
	private final Class117 aClass117_1 = new Class117();

	@OriginalMember(owner = "client!ag", name = "Ee", descriptor = "Lclient!wh;")
	private final Class356 aClass356_1 = new Class356(16);

	@OriginalMember(owner = "client!ag", name = "Ge", descriptor = "Lclient!wo;")
	private final Class361 aClass361_6 = new Class361();

	@OriginalMember(owner = "client!ag", name = "Ke", descriptor = "Lclient!wo;")
	private final Class361 aClass361_7 = new Class361();

	@OriginalMember(owner = "client!ag", name = "Le", descriptor = "Lclient!wo;")
	private final Class361 aClass361_8 = new Class361();

	@OriginalMember(owner = "client!ag", name = "Me", descriptor = "Lclient!wo;")
	private final Class361 aClass361_9 = new Class361();

	@OriginalMember(owner = "client!ag", name = "Ne", descriptor = "Lclient!wo;")
	private final Class361 aClass361_10 = new Class361();

	@OriginalMember(owner = "client!ag", name = "Oe", descriptor = "Lclient!wo;")
	private final Class361 aClass361_11 = new Class361();

	@OriginalMember(owner = "client!ag", name = "Pe", descriptor = "Lclient!wo;")
	private final Class361 aClass361_12 = new Class361();

	@OriginalMember(owner = "client!ag", name = "We", descriptor = "Lclient!ofa;")
	public final Class209_Sub3 aClass209_Sub3_3 = new Class209_Sub3();

	@OriginalMember(owner = "client!ag", name = "Ze", descriptor = "Lclient!ofa;")
	public final Class209_Sub3 aClass209_Sub3_4 = new Class209_Sub3();

	@OriginalMember(owner = "client!ag", name = "af", descriptor = "Lclient!ofa;")
	public final Class209_Sub3 aClass209_Sub3_5 = new Class209_Sub3();

	@OriginalMember(owner = "client!ag", name = "jf", descriptor = "I")
	public int anInt476 = 50;

	@OriginalMember(owner = "client!ag", name = "lf", descriptor = "[F")
	private final float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!ag", name = "hf", descriptor = "F")
	public float aFloat1 = 1.0F;

	@OriginalMember(owner = "client!ag", name = "Tf", descriptor = "F")
	public float aFloat8 = 3584.0F;

	@OriginalMember(owner = "client!ag", name = "ef", descriptor = "I")
	public int anInt474 = -1;

	@OriginalMember(owner = "client!ag", name = "Qf", descriptor = "F")
	private float aFloat7 = 1.0F;

	@OriginalMember(owner = "client!ag", name = "yf", descriptor = "F")
	private float aFloat4 = -1.0F;

	@OriginalMember(owner = "client!ag", name = "gg", descriptor = "I")
	private int anInt488 = 8448;

	@OriginalMember(owner = "client!ag", name = "fg", descriptor = "I")
	public int anInt487 = 0;

	@OriginalMember(owner = "client!ag", name = "Of", descriptor = "[F")
	private final float[] aFloatArray3 = new float[16];

	@OriginalMember(owner = "client!ag", name = "Vf", descriptor = "F")
	private float aFloat9 = -1.0F;

	@OriginalMember(owner = "client!ag", name = "Yf", descriptor = "I")
	private int anInt486 = 0;

	@OriginalMember(owner = "client!ag", name = "zf", descriptor = "I")
	private int anInt480 = 0;

	@OriginalMember(owner = "client!ag", name = "Hf", descriptor = "I")
	private int anInt483 = 0;

	@OriginalMember(owner = "client!ag", name = "kg", descriptor = "[Lclient!qea;")
	private final Class1_Sub5[] aClass1_Sub5Array1 = new Class1_Sub5[Static305.anInt5529];

	@OriginalMember(owner = "client!ag", name = "rf", descriptor = "[F")
	public final float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!ag", name = "rg", descriptor = "I")
	public int anInt491 = 512;

	@OriginalMember(owner = "client!ag", name = "ng", descriptor = "[F")
	private final float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!ag", name = "sg", descriptor = "F")
	public float aFloat16 = 3584.0F;

	@OriginalMember(owner = "client!ag", name = "ig", descriptor = "I")
	public int anInt489 = -1;

	@OriginalMember(owner = "client!ag", name = "pg", descriptor = "F")
	public float aFloat14 = 1.0F;

	@OriginalMember(owner = "client!ag", name = "ff", descriptor = "I")
	public int anInt475 = 0;

	@OriginalMember(owner = "client!ag", name = "Nf", descriptor = "Z")
	private boolean aBoolean24 = true;

	@OriginalMember(owner = "client!ag", name = "mg", descriptor = "I")
	public int anInt490 = 0;

	@OriginalMember(owner = "client!ag", name = "uf", descriptor = "I")
	public int anInt478 = 512;

	@OriginalMember(owner = "client!ag", name = "zg", descriptor = "I")
	public int anInt493 = 0;

	@OriginalMember(owner = "client!ag", name = "Lf", descriptor = "F")
	private float aFloat6 = 1.0F;

	@OriginalMember(owner = "client!ag", name = "Ag", descriptor = "I")
	public int anInt494 = -1;

	@OriginalMember(owner = "client!ag", name = "Kg", descriptor = "I")
	public int anInt499 = -1;

	@OriginalMember(owner = "client!ag", name = "Bg", descriptor = "F")
	public float aFloat19 = -1.0F;

	@OriginalMember(owner = "client!ag", name = "Rf", descriptor = "I")
	private int anInt485 = 3584;

	@OriginalMember(owner = "client!ag", name = "Gg", descriptor = "I")
	private int anInt497 = 0;

	@OriginalMember(owner = "client!ag", name = "Jg", descriptor = "[F")
	private final float[] aFloatArray5 = new float[4];

	@OriginalMember(owner = "client!ag", name = "ch", descriptor = "I")
	private int anInt504 = 8448;

	@OriginalMember(owner = "client!ag", name = "vg", descriptor = "F")
	public float aFloat18 = -1.0F;

	@OriginalMember(owner = "client!ag", name = "Hg", descriptor = "I")
	private int anInt498 = 0;

	@OriginalMember(owner = "client!ag", name = "lg", descriptor = "F")
	public float aFloat12 = 1.0F;

	@OriginalMember(owner = "client!ag", name = "gh", descriptor = "I")
	private int anInt506 = 0;

	@OriginalMember(owner = "client!ag", name = "Wg", descriptor = "F")
	private float aFloat20 = 0.0F;

	@OriginalMember(owner = "client!ag", name = "Sg", descriptor = "I")
	private int anInt502 = -1;

	@OriginalMember(owner = "client!ag", name = "hh", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!ag", name = "Og", descriptor = "Lclient!kv;")
	public Class1_Sub20_Sub2 aClass1_Sub20_Sub2_1 = new Class1_Sub20_Sub2(8192);

	@OriginalMember(owner = "client!ag", name = "ih", descriptor = "[I")
	public int[] anIntArray11 = new int[1];

	@OriginalMember(owner = "client!ag", name = "kh", descriptor = "[I")
	public int[] anIntArray12 = new int[1];

	@OriginalMember(owner = "client!ag", name = "lh", descriptor = "[B")
	public final byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!ag", name = "nh", descriptor = "[I")
	public int[] anIntArray13 = new int[1];

	@OriginalMember(owner = "client!ag", name = "ge", descriptor = "I")
	public final int anInt459;

	@OriginalMember(owner = "client!ag", name = "ab", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas1;

	@OriginalMember(owner = "client!ag", name = "Ob", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!ag", name = "Pc", descriptor = "Lclient!jaggl/OpenGL;")
	public OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ag", name = "qd", descriptor = "J")
	private final long aLong11;

	@OriginalMember(owner = "client!ag", name = "Bc", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!ag", name = "Df", descriptor = "I")
	public final int anInt482;

	@OriginalMember(owner = "client!ag", name = "ag", descriptor = "Z")
	public boolean aBoolean29;

	@OriginalMember(owner = "client!ag", name = "Pg", descriptor = "Z")
	public boolean aBoolean36;

	@OriginalMember(owner = "client!ag", name = "Sf", descriptor = "Z")
	private boolean aBoolean26;

	@OriginalMember(owner = "client!ag", name = "Cf", descriptor = "Z")
	public boolean aBoolean21;

	@OriginalMember(owner = "client!ag", name = "df", descriptor = "Z")
	public boolean aBoolean16;

	@OriginalMember(owner = "client!ag", name = "Pf", descriptor = "Z")
	private boolean aBoolean25;

	@OriginalMember(owner = "client!ag", name = "yg", descriptor = "Z")
	public boolean aBoolean34;

	@OriginalMember(owner = "client!ag", name = "dh", descriptor = "Z")
	private final boolean aBoolean39;

	@OriginalMember(owner = "client!ag", name = "he", descriptor = "Lclient!mfa;")
	private final Class213 aClass213_1;

	@OriginalMember(owner = "client!ag", name = "oe", descriptor = "Lclient!wm;")
	public final Class359 aClass359_1;

	@OriginalMember(owner = "client!ag", name = "Wd", descriptor = "Lclient!oh;")
	private final Class239 aClass239_1;

	@OriginalMember(owner = "client!ag", name = "ce", descriptor = "Lclient!sq;")
	private Class1_Sub24_Sub1 aClass1_Sub24_Sub1_1;

	@OriginalMember(owner = "client!ag", name = "Hd", descriptor = "Lclient!qk;")
	private final Class269 aClass269_1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;I)V")
	public Class12_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		this.anInt459 = arg2;
		this.aCanvas2 = this.aCanvas1 = arg0;
		if (!Static293.method4616("jaclib")) {
			throw new RuntimeException("");
		} else if (Static293.method4616("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong10 = this.aLong11 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt459);
				if (this.aLong11 == 0L) {
					throw new RuntimeException("");
				}
				this.method449();
				@Pc(341) int local341 = this.method418();
				if (local341 != 0) {
					throw new RuntimeException("");
				}
				this.anInt482 = this.aBoolean23 ? 33639 : 5121;
				if (this.aString10.indexOf("radeon") != -1) {
					@Pc(368) int local368 = 0;
					@Pc(370) boolean local370 = false;
					@Pc(372) boolean local372 = false;
					@Pc(381) String[] local381 = Static46.method1116(' ', this.aString10.replace('/', ' '));
					for (@Pc(383) int local383 = 0; local383 < local381.length; local383++) {
						@Pc(389) String local389 = local381[local383];
						try {
							if (local389.length() > 0) {
								if (local389.charAt(0) == 'x' && local389.length() >= 3 && Static88.method1743(local389.substring(1, 3))) {
									local389 = local389.substring(1);
									local372 = true;
								}
								if (local389.equals("hd")) {
									local370 = true;
								} else {
									if (local389.startsWith("hd")) {
										local370 = true;
										local389 = local389.substring(2);
									}
									if (local389.length() >= 4 && Static88.method1743(local389.substring(0, 4))) {
										local368 = Static480.method6741(local389.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(454) Exception local454) {
						}
					}
					if (!local370 || local368 < 4000) {
						this.aBoolean29 = false;
					}
					if (!local372 && !local370) {
						if (local368 >= 7000 && local368 <= 9250) {
							this.aBoolean36 = false;
						}
						if (local368 >= 7000 && local368 <= 7999) {
							this.aBoolean26 = false;
						}
					}
					this.aBoolean21 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean16 = true;
					this.aBoolean25 = this.aBoolean26;
				}
				if (this.aString9.indexOf("intel") != -1) {
					this.aBoolean34 = false;
				}
				this.aBoolean39 = !this.aString9.equals("s3 graphics");
				if (this.aBoolean26) {
					try {
						@Pc(536) int[] local536 = new int[1];
						OpenGL.glGenBuffersARB(1, local536, 0);
					} catch (@Pc(542) Throwable local542) {
						throw new RuntimeException("");
					}
				}
				Static113.method1979(true, false);
				this.aBoolean11 = true;
				this.aClass213_1 = new Class213(this, super.anInterface5_10);
				this.method447();
				this.aClass359_1 = new Class359(this);
				this.aClass239_1 = new Class239(this);
				if (this.aClass239_1.method5512()) {
					this.aClass1_Sub24_Sub1_1 = new Class1_Sub24_Sub1(this);
					if (!this.aClass1_Sub24_Sub1_1.method6893()) {
						this.aClass1_Sub24_Sub1_1.method6882();
						this.aClass1_Sub24_Sub1_1 = null;
					}
				}
				this.aClass269_1 = new Class269(this);
				this.method448();
				this.method400();
				this.method6440();
			} catch (@Pc(616) Throwable local616) {
				local616.printStackTrace();
				this.method6414();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLclient!na;)V")
	public void method372(@OriginalArg(1) Interface17 arg0) {
		if (this.aBoolean20) {
			this.method396(arg0);
			this.method446(arg0);
		} else if (this.anInt466 >= 0 && this.anInterface17Array1[this.anInt466] == arg0) {
			this.anInterface17Array1[this.anInt466--] = null;
			arg0.method3779();
			if (this.anInt466 < 0) {
				this.anInterface17_1 = this.anInterface17_2 = null;
			} else {
				this.anInterface17_1 = this.anInterface17_2 = this.anInterface17Array1[this.anInt466];
				this.anInterface17_1.method3778();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ag", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt474 == arg0 && arg1 == this.anInt494 && this.anInt475 == arg2) {
			return;
		}
		this.anInt475 = arg2;
		this.anInt494 = arg1;
		this.anInt474 = arg0;
		this.method452();
		this.method435();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BII)V")
	public synchronized void method373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub32 local8 = new Class1_Sub32(arg1);
		local8.aLong425 = arg0;
		this.aClass361_10.method7855(local8);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6396(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas1 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(BLclient!na;)V")
	public void method374(@OriginalArg(1) Interface17 arg0) {
		if (this.anInt464 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt464 >= 0) {
			this.anInterface17Array2[this.anInt464].method3777();
		}
		this.anInterface17_1 = this.anInterface17Array2[++this.anInt464] = arg0;
		this.anInterface17_1.method3781();
	}

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "()Z")
	@Override
	public boolean method6415() {
		return false;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)V")
	public void method375(@OriginalArg(1) int arg0) {
		Static97.aFloatArray43[3] = (float) (arg0 >>> 24) / 255.0F;
		Static97.aFloatArray43[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static97.aFloatArray43[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static97.aFloatArray43[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static97.aFloatArray43, 0);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class10 method6429(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class10_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)V")
	public void method376(@OriginalArg(1) int arg0) {
		if (this.anInt503 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt503 = arg0;
		}
	}

	@OriginalMember(owner = "client!ag", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt497;
		arg0[2] = this.anInt483;
		arg0[3] = this.anInt506;
		arg0[1] = this.anInt486;
	}

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "()Z")
	@Override
	public boolean method6439() {
		return this.aClass1_Sub24_Sub1_1 != null && (this.anInt459 <= 1 || this.aBoolean27);
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(IIIIII)Lclient!it;")
	@Override
	public Class36 method6444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean18 ? new Class36_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ag", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt481 = arg0;
		this.anInt489 = arg1;
		this.anInt499 = arg2;
		this.anInt487 = arg3;
		this.aBoolean28 = true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ec;)V")
	@Override
	public void method6460(@OriginalArg(0) Class82 arg0) {
		this.aClass207_1.method4724(this, arg0, -1);
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(II)I")
	public int method377(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!cca;IIII)Lclient!da;")
	@Override
	public Class61 method6407(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class61_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ag", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass209_Sub3_3.aFloat170 + this.aClass209_Sub3_3.aFloat172 * (float) arg2 + (float) arg1 * this.aClass209_Sub3_3.aFloat166 + (float) arg0 * this.aClass209_Sub3_3.aFloat169;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass209_Sub3_3.aFloat170 + this.aClass209_Sub3_3.aFloat166 * (float) arg4 + (float) arg3 * this.aClass209_Sub3_3.aFloat169 + (float) arg5 * this.aClass209_Sub3_3.aFloat172;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt476 && local59 < (float) this.anInt476 || !(!((float) this.anInt485 < local28) || !(local59 > (float) this.anInt485))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt478 * (this.aClass209_Sub3_3.aFloat162 + this.aClass209_Sub3_3.aFloat164 * (float) arg0 + (float) arg1 * this.aClass209_Sub3_3.aFloat163 + (float) arg2 * this.aClass209_Sub3_3.aFloat167) / local28);
		@Pc(155) int local155 = (int) ((this.aClass209_Sub3_3.aFloat162 + this.aClass209_Sub3_3.aFloat167 * (float) arg5 + this.aClass209_Sub3_3.aFloat164 * (float) arg3 + (float) arg4 * this.aClass209_Sub3_3.aFloat163) * (float) this.anInt478 / local59);
		if ((float) local123 < this.aFloat10 && this.aFloat10 > (float) local155 || (float) local123 > this.aFloat5 && (float) local155 > this.aFloat5) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt491 * (this.aClass209_Sub3_3.aFloat171 + this.aClass209_Sub3_3.aFloat168 * (float) arg2 + this.aClass209_Sub3_3.aFloat165 * (float) arg0 + (float) arg1 * this.aClass209_Sub3_3.aFloat161) / local28);
			@Pc(245) int local245 = (int) ((this.aClass209_Sub3_3.aFloat171 + (float) arg3 * this.aClass209_Sub3_3.aFloat165 + (float) arg4 * this.aClass209_Sub3_3.aFloat161 + (float) arg5 * this.aClass209_Sub3_3.aFloat168) * (float) this.anInt491 / local59);
			return (!((float) local213 < this.aFloat21) || !((float) local245 < this.aFloat21)) && (!(this.aFloat2 < (float) local213) || !((float) local245 > this.aFloat2));
		}
	}

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "()Z")
	@Override
	public boolean method6431() {
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!vfa;)V")
	public void method378(@OriginalArg(1) Class52 arg0) {
		@Pc(11) Class52 local11 = this.aClass52Array1[this.anInt503];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt6859);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt6859);
				} else if (arg0.anInt6859 != local11.anInt6859) {
					OpenGL.glDisable(local11.anInt6859);
					OpenGL.glEnable(arg0.anInt6859);
				}
				OpenGL.glBindTexture(arg0.anInt6859, arg0.method5636());
			}
			this.aClass52Array1[this.anInt503] = arg0;
		}
		this.anInt472 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	@Override
	public void method6399(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
	@Override
	public void method6428(@OriginalArg(0) int arg0) {
		this.method449();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FI)V")
	public void method379(@OriginalArg(0) float arg0) {
		if (this.aFloat7 != arg0) {
			this.aFloat7 = arg0;
			if (this.anInt495 == 3) {
				this.method439();
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public void method380() {
		if (this.anInt472 == 2) {
			return;
		}
		this.method393();
		this.method381(false);
		this.method454(false);
		this.method390(false);
		this.method404(false);
		this.method444(-2);
		this.anInt472 = 2;
	}

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "()V")
	@Override
	public void method6436() {
		if (this.aClass1_Sub24_Sub1_1 != null && this.aClass1_Sub24_Sub1_1.method6888()) {
			this.aClass239_1.method5514(this.aClass1_Sub24_Sub1_1);
			this.aClass213_1.method4885();
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6405(@OriginalArg(0) Canvas arg0) {
		this.aCanvas2 = null;
		this.aLong10 = 0L;
		if (arg0 == null || this.aCanvas1 == arg0) {
			this.aCanvas2 = this.aCanvas1;
			this.aLong10 = this.aLong11;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable2.get(arg0);
			this.aLong10 = local36;
			this.aCanvas2 = arg0;
		}
		if (this.aCanvas2 == null || this.aLong10 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong10);
		this.method400();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZB)V")
	public void method381(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean38 != arg0) {
			this.aBoolean38 = arg0;
			this.method435();
			this.anInt472 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method6424(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class1_Sub32 local19;
		while (!this.aClass361_7.method7847()) {
			local19 = (Class1_Sub32) this.aClass361_7.method7850();
			Static482.anIntArray533[local11++] = (int) local19.aLong425;
			this.anInt468 -= local19.anInt6144;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static482.anIntArray533, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static482.anIntArray533, 0);
			local11 = 0;
		}
		while (!this.aClass361_8.method7847()) {
			local19 = (Class1_Sub32) this.aClass361_8.method7850();
			Static482.anIntArray533[local11++] = (int) local19.aLong425;
			this.anInt469 -= local19.anInt6144;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static482.anIntArray533, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static482.anIntArray533, 0);
			local11 = 0;
		}
		while (!this.aClass361_9.method7847()) {
			local19 = (Class1_Sub32) this.aClass361_9.method7850();
			Static482.anIntArray533[local11++] = local19.anInt6144;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static482.anIntArray533, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static482.anIntArray533, 0);
			local11 = 0;
		}
		while (!this.aClass361_10.method7847()) {
			local19 = (Class1_Sub32) this.aClass361_10.method7850();
			Static482.anIntArray533[local11++] = (int) local19.aLong425;
			this.anInt467 -= local19.anInt6144;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static482.anIntArray533, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static482.anIntArray533, 0);
		}
		while (!this.aClass361_6.method7847()) {
			local19 = (Class1_Sub32) this.aClass361_6.method7850();
			OpenGL.glDeleteLists((int) local19.aLong425, local19.anInt6144);
		}
		@Pc(217) Class1 local217;
		while (!this.aClass361_11.method7847()) {
			local217 = this.aClass361_11.method7850();
			OpenGL.glDeleteProgramARB((int) local217.aLong425);
		}
		while (!this.aClass361_12.method7847()) {
			local217 = this.aClass361_12.method7850();
			OpenGL.glDeleteObjectARB(local217.aLong425);
		}
		while (!this.aClass361_6.method7847()) {
			local19 = (Class1_Sub32) this.aClass361_6.method7850();
			OpenGL.glDeleteLists((int) local19.aLong425, local19.anInt6144);
		}
		this.aClass213_1.method4886();
		if (this.b() > 100663296 && Static255.method4035() > this.aLong12 + 60000L) {
			System.gc();
			this.aLong12 = Static255.method4035();
		}
		this.anInt461 = local9;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	public synchronized void method382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub32 local12 = new Class1_Sub32(arg1);
		local12.aLong425 = arg0;
		this.aClass361_7.method7855(local12);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ofa;B)V")
	public void method383(@OriginalArg(0) Class209_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method5489(), 0);
	}

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "()Z")
	@Override
	public boolean method6459() {
		if (this.aClass1_Sub24_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass1_Sub24_Sub1_1.method6888()) {
			if (!this.aClass239_1.method5510(this.aClass1_Sub24_Sub1_1)) {
				return false;
			}
			this.aClass213_1.method4885();
		}
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6446(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static490.aFloat210 = arg0;
		Static54.aFloat31 = arg2;
		Static168.aFloat67 = arg1;
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(II)I")
	public int method384(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt490, this.anInt493, this.anInt478, this.anInt491 };
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
	public void method385() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray2, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V")
	private void method386() {
		OpenGL.glDepthMask(this.aBoolean13 && this.aBoolean24);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIII)V")
	public void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(IIII)V")
	public void method388(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V")
	private void method389() {
		if (this.aBoolean31 && !this.aBoolean17) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V")
	public void method390(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean14) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt472 &= 0xFFFFFFE0;
		this.aBoolean14 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6395(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas1) {
			local5 = this.aLong11;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas2 == arg0) {
			this.method400();
		}
	}

	@OriginalMember(owner = "client!ag", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt483 > arg2) {
			this.anInt483 = arg2;
		}
		if (arg3 < this.anInt506) {
			this.anInt506 = arg3;
		}
		if (this.anInt497 < arg0) {
			this.anInt497 = arg0;
		}
		if (this.anInt486 < arg1) {
			this.anInt486 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method451();
		this.method450();
	}

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "()V")
	@Override
	public void method6440() {
		if (!this.aBoolean39 || this.anInt297 <= 0 || this.anInt414 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt497;
		@Pc(19) int local19 = this.anInt483;
		@Pc(22) int local22 = this.anInt486;
		@Pc(25) int local25 = this.anInt506;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method429();
		this.method381(false);
		this.method454(false);
		this.method390(false);
		this.method404(false);
		this.method378(null);
		this.method444(-2);
		this.method401(1);
		this.method395(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt297, this.anInt414, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(JI)V")
	public synchronized void method391(@OriginalArg(0) long arg0) {
		@Pc(16) Class1 local16 = new Class1();
		local16.aLong425 = arg0;
		this.aClass361_12.method7855(local16);
	}

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "()Z")
	@Override
	public boolean method6455() {
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6471(@OriginalArg(0) Class209 arg0) {
		this.aClass209_Sub3_3.M(arg0);
		this.aClass209_Sub3_4.M(this.aClass209_Sub3_3);
		this.aClass209_Sub3_4.method5484();
		this.aClass209_Sub3_5.method5487(this.aClass209_Sub3_4);
		if (this.anInt495 != 1) {
			this.method440();
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V")
	@Override
	public void method6461(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "()Z")
	@Override
	public boolean method6408() {
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V")
	private void method393() {
		if (this.anInt495 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt297 > 0 && this.anInt414 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt297, (double) this.anInt414, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt495 = 1;
		this.anInt472 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ag", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt497 = 0;
		this.anInt506 = this.anInt414;
		this.anInt483 = this.anInt297;
		this.anInt486 = 0;
		OpenGL.glDisable(3089);
		this.method451();
	}

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "()V")
	@Override
	public void method6425() {
		this.aClass239_1.method5517();
	}

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "(I)V")
	private void method394() {
		this.anOpenGL1.b();
	}

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "()Z")
	@Override
	public boolean method6463() {
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)V")
	public void method395(@OriginalArg(0) int arg0) {
		if (this.anInt471 == arg0) {
			return;
		}
		@Pc(24) boolean local24;
		@Pc(26) byte local26;
		if (arg0 == 1) {
			local24 = true;
			local26 = 1;
		} else if (arg0 == 2) {
			local26 = 2;
			local24 = false;
		} else if (arg0 == 128) {
			local24 = true;
			local26 = 3;
		} else {
			local26 = 0;
			local24 = false;
		}
		if (!this.aBoolean15) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean15 = true;
		}
		if (this.aBoolean12 != local24) {
			if (local24) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean12 = local24;
		}
		if (this.anInt473 != local26) {
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
			this.anInt473 = local26;
		}
		this.anInt471 = arg0;
		this.anInt472 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!na;)V")
	public void method396(@OriginalArg(1) Interface17 arg0) {
		if (this.anInt464 < 0 || arg0 != this.anInterface17Array2[this.anInt464]) {
			throw new RuntimeException();
		}
		this.anInterface17Array2[this.anInt464--] = null;
		arg0.method3777();
		if (this.anInt464 < 0) {
			this.anInterface17_1 = null;
		} else {
			this.anInterface17_1 = this.anInterface17Array2[this.anInt464];
			this.anInterface17_1.method3781();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
	@Override
	public int method6445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIZ)V")
	public void method397(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method398(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIZ)V")
	public void method398(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt484 || this.aBoolean41 != this.aBoolean28) {
			@Pc(20) Class52_Sub1 local20 = null;
			@Pc(22) int local22 = 0;
			@Pc(24) byte local24 = 0;
			@Pc(26) int local26 = 0;
			@Pc(33) int local33 = this.aBoolean28 ? 3 : 0;
			if (arg0 < 0) {
				this.method412();
			} else {
				local20 = this.aClass213_1.method4887(arg0);
				@Pc(54) Class45 local54 = super.anInterface5_10.method4043(arg0);
				if (local54.aByte26 == 0 && local54.aByte24 == 0) {
					this.method412();
				} else {
					@Pc(75) int local75 = local54.aBoolean124 ? 64 : 128;
					@Pc(79) int local79 = local75 * 50;
					this.method415((float) (this.anInt461 % local79 * local54.aByte26) / (float) local79, (float) (local54.aByte24 * (this.anInt461 % local79)) / (float) local79, 0.0F);
				}
				if (!this.aBoolean28) {
					local26 = local54.anInt1536;
					local24 = local54.aByte23;
					local33 = local54.aByte25;
				}
				local22 = local54.anInt1535;
			}
			this.aClass269_1.method6305(arg2, local24, arg1, local26, local33);
			if (!this.aClass269_1.method6302(local20, local22)) {
				this.method378(local20);
				this.method401(local22);
			}
			this.anInt484 = arg0;
			this.aBoolean41 = this.aBoolean28;
		}
		this.anInt472 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(B)V")
	private void method399() {
		if (this.anInt495 != 3) {
			this.anInt495 = 3;
			this.method439();
			this.method440();
			this.anInt472 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "()V")
	@Override
	public void method6462() {
		if (this.aBoolean34) {
			if (this.aClass161_1 != this.anInterface17_2) {
				throw new RuntimeException();
			}
			this.aClass161_1.method3784(0);
			this.aClass161_1.method3784(8);
			this.method372(this.aClass161_1);
		} else if (this.aBoolean35) {
			this.aClass10_Sub2_1.da(0, 0, this.anInt297, this.anInt414, 0, 0);
			this.anOpenGL1.setSurface(this.aLong10);
		} else {
			throw new RuntimeException("");
		}
		this.anInt414 = this.anInt385;
		this.anInt297 = this.anInt427;
		this.aClass10_Sub2_1 = null;
		this.method429();
		this.method419();
		this.JA();
	}

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "(I)V")
	private void method400() {
		if (this.aCanvas2 == null) {
			this.anInt427 = this.anInt385 = 0;
		} else {
			@Pc(6) Dimension local6 = this.aCanvas2.getSize();
			this.anInt385 = local6.height;
			this.anInt427 = local6.width;
		}
		if (this.anInterface17_2 == null) {
			this.anInt414 = this.anInt385;
			this.anInt297 = this.anInt427;
			this.method419();
		}
		this.method429();
		this.JA();
	}

	@OriginalMember(owner = "client!ag", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.anInt463 = 0;
		while (arg0 > 1) {
			this.anInt463++;
			arg0 >>= 0x1;
		}
		this.anInt462 = 0x1 << this.anInt463;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(BI)V")
	public void method401(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method420(7681, 7681);
		} else if (arg0 == 0) {
			this.method420(8448, 8448);
		} else if (arg0 == 2) {
			this.method420(7681, 34165);
		} else if (arg0 == 3) {
			this.method420(8448, 260);
		} else if (arg0 == 4) {
			this.method420(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "(I)V")
	public void method402() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V")
	public synchronized void method403(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub32 local14 = new Class1_Sub32(arg0);
		local14.aLong425 = arg1;
		this.aClass361_8.method7855(local14);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(IZ)V")
	public void method404(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean13) {
			this.aBoolean13 = arg0;
			this.method386();
			this.anInt472 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V")
	@Override
	public void method6454(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt441 = arg0;
		this.aClass213_1.method4885();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIB[BI)Lclient!vh;")
	public Interface23 method405(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		return (Interface23) (this.aBoolean26 && (!arg0 || this.aBoolean25) ? new Class62_Sub2(this, 5123, arg2, arg1, arg0) : new Class14_Sub2(this, 5123, arg2, arg1));
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!it;Lclient!it;FLclient!it;)Lclient!it;")
	@Override
	public Class36 method6464(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class36 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean18 && this.aBoolean34) {
			@Pc(15) Class36_Sub2_Sub2 local15 = null;
			@Pc(18) Class36_Sub2 local18 = (Class36_Sub2) arg0;
			@Pc(21) Class36_Sub2 local21 = (Class36_Sub2) arg1;
			@Pc(25) Class52_Sub2 local25 = local18.method5045();
			@Pc(29) Class52_Sub2 local29 = local21.method5045();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt1904 < local25.anInt1904 ? local25.anInt1904 : local29.anInt1904;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class36_Sub2_Sub2) {
					@Pc(56) Class36_Sub2_Sub2 local56 = (Class36_Sub2_Sub2) arg3;
					if (local44 == local56.method5053()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class36_Sub2_Sub2(this, local44);
				}
				if (local15.method5049(arg2, local25, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIF)Lclient!qea;")
	@Override
	public Class1_Sub5 method6426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub5_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class200 method6449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static583.method7794(arg3, arg1, arg2, this, arg0);
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method6468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method413();
		this.method395(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		if (local16 == 0.0F && local23 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(44) float local44 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local23 * local23)));
			local16 *= local44;
			local23 *= local44;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, local23 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ag", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt485;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class10 method6420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class10_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6412(@OriginalArg(0) Class10 arg0) {
		this.aClass10_Sub2_1 = (Class10_Sub2) arg0;
		@Pc(81) Class1_Sub3 local81;
		if (this.aBoolean34) {
			if (this.aClass161_1 == null) {
				this.aClass161_1 = new Class161(this);
			}
			if (this.aClass161_1 == this.anInterface17_2) {
				throw new RuntimeException();
			}
			this.method424(this.aClass161_1);
			@Pc(53) Class1_Sub3_Sub12 local53 = (Class1_Sub3_Sub12) this.aClass356_1.method7796((long) (this.aClass10_Sub2_1.E() << 16 | this.aClass10_Sub2_1.u()));
			if (local53 == null) {
				local53 = new Class1_Sub3_Sub12(this, 6402, this.aClass10_Sub2_1.E(), this.aClass10_Sub2_1.u());
				@Pc(88) Class1_Sub3_Sub12 local88;
				for (this.anInt470 += local53.anInt5778; this.anInt470 > 2097152; this.anInt470 -= local88.anInt5778) {
					local81 = this.aClass117_1.method2547();
					if (local81 == null) {
						break;
					}
					local88 = (Class1_Sub3_Sub12) local81;
					local88.method7811();
					local88.method7878();
					local88.method4881();
				}
				this.aClass356_1.method7800((long) (this.aClass10_Sub2_1.E() << 16 | this.aClass10_Sub2_1.u()), local53);
			}
			this.aClass117_1.method2548(local53);
			this.aClass161_1.method3791(local53, 8);
			this.aClass161_1.method3790(this.aClass10_Sub2_1.aClass52_Sub1_Sub1_1, 0);
		} else if (this.aBoolean35) {
			@Pc(168) Class1_Sub3_Sub19 local168 = (Class1_Sub3_Sub19) this.aClass356_1.method7796((long) (this.aClass10_Sub2_1.E() << 16 | this.aClass10_Sub2_1.u()));
			if (local168 == null) {
				local168 = new Class1_Sub3_Sub19(this, this.aClass10_Sub2_1.E(), this.aClass10_Sub2_1.u());
				@Pc(204) Class1_Sub3_Sub19 local204;
				for (this.anInt470 += local168.anInt9449 * 4; this.anInt470 > 2097152; this.anInt470 -= local204.anInt9449) {
					local81 = this.aClass117_1.method2547();
					if (local81 == null) {
						break;
					}
					local204 = (Class1_Sub3_Sub19) local81;
					local204.method7811();
					local204.method7878();
					this.anOpenGL1.releasePbuffer(local204.method7815());
				}
				this.aClass356_1.method7800((long) (this.aClass10_Sub2_1.E() << 16 | this.aClass10_Sub2_1.u()), local168);
			}
			this.aClass117_1.method2548(local168);
			this.anOpenGL1.setPbuffer(local168.method7815());
		} else {
			throw new RuntimeException("");
		}
		this.anInt297 = arg0.E();
		this.anInt414 = arg0.u();
		this.method429();
		this.method419();
		this.JA();
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt469 + this.anInt468 + this.anInt467;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[Lclient!qea;)V")
	@Override
	public void method6402(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass1_Sub5Array1[local3] = arg1[local3];
		}
		this.anInt500 = arg0;
		if (this.anInt495 != 1) {
			this.method423();
		}
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "()Lclient!q;")
	@Override
	public Class209 method6410() {
		return new Class209_Sub3();
	}

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "()Z")
	@Override
	public boolean method6451() {
		return this.aClass1_Sub24_Sub1_1 != null && this.aClass1_Sub24_Sub1_1.method6888();
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(B)V")
	private void method406() {
		Static97.aFloatArray43[0] = this.aFloat19 * this.aFloat14;
		Static97.aFloatArray43[2] = this.aFloat1 * this.aFloat19;
		Static97.aFloatArray43[3] = 1.0F;
		Static97.aFloatArray43[1] = this.aFloat19 * this.aFloat12;
		OpenGL.glLightfv(16384, 4609, Static97.aFloatArray43, 0);
		Static97.aFloatArray43[2] = -this.aFloat18 * this.aFloat1;
		Static97.aFloatArray43[0] = -this.aFloat18 * this.aFloat14;
		Static97.aFloatArray43[1] = this.aFloat12 * -this.aFloat18;
		Static97.aFloatArray43[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static97.aFloatArray43, 0);
	}

	@OriginalMember(owner = "client!ag", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt476 && arg1 == this.anInt485) {
			return;
		}
		this.anInt485 = arg1;
		this.anInt476 = arg0;
		this.method433();
		this.method452();
		if (this.anInt495 == 3) {
			this.method439();
			return;
		}
		if (this.anInt495 != 2) {
			return;
		}
		this.method430();
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "()I")
	@Override
	public int method6406() {
		return 4;
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(II)V")
	public synchronized void method407(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub32 local14 = new Class1_Sub32(arg0);
		this.aClass361_9.method7855(local14);
	}

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "()Z")
	@Override
	public boolean method6442() {
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6422(@OriginalArg(0) Class1_Sub11 arg0) {
		this.aNativeHeap1 = ((Class1_Sub11_Sub1) arg0).aNativeHeap4;
		if (this.anInterface1_2 != null) {
			return;
		}
		@Pc(16) Class1_Sub20_Sub2 local16 = new Class1_Sub20_Sub2(80);
		if (this.aBoolean23) {
			local16.method4440(-1.0F);
			local16.method4440(-1.0F);
			local16.method4440(0.0F);
			local16.method4440(0.0F);
			local16.method4440(1.0F);
			local16.method4440(1.0F);
			local16.method4440(-1.0F);
			local16.method4440(0.0F);
			local16.method4440(1.0F);
			local16.method4440(1.0F);
			local16.method4440(1.0F);
			local16.method4440(1.0F);
			local16.method4440(0.0F);
			local16.method4440(1.0F);
			local16.method4440(0.0F);
			local16.method4440(-1.0F);
			local16.method4440(1.0F);
			local16.method4440(0.0F);
			local16.method4440(0.0F);
			local16.method4440(0.0F);
		} else {
			local16.method4438(-1.0F);
			local16.method4438(-1.0F);
			local16.method4438(0.0F);
			local16.method4438(0.0F);
			local16.method4438(1.0F);
			local16.method4438(1.0F);
			local16.method4438(-1.0F);
			local16.method4438(0.0F);
			local16.method4438(1.0F);
			local16.method4438(1.0F);
			local16.method4438(1.0F);
			local16.method4438(1.0F);
			local16.method4438(0.0F);
			local16.method4438(1.0F);
			local16.method4438(0.0F);
			local16.method4438(-1.0F);
			local16.method4438(1.0F);
			local16.method4438(0.0F);
			local16.method4438(0.0F);
			local16.method4438(0.0F);
		}
		this.anInterface1_2 = this.method409(local16.aByteArray52, local16.anInt5238, false, 20);
		this.aClass97_2 = new Class97(this.anInterface1_2, 5126, 3, 0);
		this.aClass97_1 = new Class97(this.anInterface1_2, 5126, 2, 12);
		this.aClass207_1.method4728(this);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLclient!cw;)V")
	public void method408(@OriginalArg(1) Interface1 arg0) {
		if (arg0 != this.anInterface1_1) {
			if (this.aBoolean26) {
				OpenGL.glBindBufferARB(34962, arg0.method1698());
			}
			this.anInterface1_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!ag", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean28) {
			throw new RuntimeException("");
		}
		this.anInt487 = arg3;
		this.anInt499 = arg2;
		this.anInt481 = arg0;
		this.anInt489 = arg1;
		if (this.aBoolean41) {
			this.aClass269_1.aClass7_Sub2_1.method1738();
			this.aClass269_1.aClass7_Sub2_1.method1745();
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	@Override
	public void method6401(@OriginalArg(0) int arg0) {
		this.method394();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ec;I)V")
	@Override
	public void method6404(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1) {
		this.aClass207_1.method4724(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([BBIZI)Lclient!cw;")
	public Interface1 method409(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		return (Interface1) (this.aBoolean26 && (!arg2 || this.aBoolean25) ? new Class62_Sub1(this, arg3, arg0, arg1, arg2) : new Class14_Sub1(this, arg3, arg0, arg1));
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!vh;)V")
	public void method410(@OriginalArg(1) Interface23 arg0) {
		if (arg0 != this.anInterface23_2) {
			if (this.aBoolean26) {
				OpenGL.glBindBufferARB(34963, arg0.method7765());
			}
			this.anInterface23_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class17 method6452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class17_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "(I)V")
	public void method411() {
		if (this.anInt472 == 16) {
			return;
		}
		this.method399();
		this.method381(true);
		this.method390(true);
		this.method404(true);
		this.method395(1);
		this.anInt472 = 16;
	}

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "(B)V")
	private void method412() {
		if (this.aBoolean30) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean30 = false;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass239_1.method5513(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "(B)V")
	private void method413() {
		if (this.anInt472 == 1) {
			return;
		}
		this.method393();
		this.method381(false);
		this.method454(false);
		this.method390(false);
		this.method404(false);
		this.method378(null);
		this.method444(-2);
		this.method401(1);
		this.anInt472 = 1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!it;)V")
	@Override
	public void method6421(@OriginalArg(0) Class36 arg0) {
		this.aClass36_Sub2_1 = (Class36_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ag", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt476;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!ofa;)V")
	public void method414(@OriginalArg(1) Class209_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method5489(), 0);
	}

	@OriginalMember(owner = "client!ag", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat13) {
			this.aFloat13 = arg0;
			this.method426();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FBFF)V")
	private void method415(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean30) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean30 = true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!tq;Z)Lclient!f;")
	@Override
	public Class10 method6434(@OriginalArg(0) Class318 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt8537 * arg0.anInt8535];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray93 == null) {
			for (local21 = 0; local21 < arg0.anInt8535; local21++) {
				for (local25 = 0; local25 < arg0.anInt8537; local25++) {
					@Pc(83) int local83 = arg0.anIntArray587[arg0.aByteArray94[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt8535; local21++) {
				for (local25 = 0; local25 < arg0.anInt8537; local25++) {
					local12[local16++] = arg0.aByteArray93[local14] << 24 | arg0.anIntArray587[arg0.aByteArray94[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(119) Class10 local119 = this.method6429(local12, arg0.anInt8537, arg0.anInt8537, arg0.anInt8535);
		local119.Q(arg0.anInt8533, arg0.anInt8534, arg0.anInt8536, arg0.anInt8538);
		return local119;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6468(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ag", name = "z", descriptor = "()V")
	@Override
	public void method6469() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "()V")
	@Override
	public void method6416() throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "(I)V")
	public void method416() {
		if (this.anInt472 == 8) {
			return;
		}
		this.method438();
		this.method381(true);
		this.method390(true);
		this.method404(true);
		this.method395(1);
		this.anInt472 = 8;
	}

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "(II)I")
	public int method417(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6400(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6416();
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method6435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method413();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method395(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean37) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean37) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "(I)I")
	private int method418() {
		this.aString9 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString10 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString9.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString9.indexOf("brian paul") != -1 || this.aString9.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(54) String[] local54 = Static46.method1116(' ', local46.replace('.', ' '));
		if (local54.length >= 2) {
			try {
				@Pc(64) int local64 = Static480.method6741(local54[0]);
				@Pc(70) int local70 = Static480.method6741(local54[1]);
				this.anInt505 = local70 + local64 * 10;
			} catch (@Pc(79) NumberFormatException local79) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt505 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(120) int[] local120 = new int[1];
		OpenGL.glGetIntegerv(34018, local120, 0);
		this.anInt492 = local120[0];
		OpenGL.glGetIntegerv(34929, local120, 0);
		this.bf = local120[0];
		OpenGL.glGetIntegerv(34930, local120, 0);
		this.anInt477 = local120[0];
		if (this.anInt492 < 2 || this.bf < 2 || this.anInt477 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean23 = Stream.c();
		this.aBoolean35 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean26 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean37 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean32 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean40 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean19 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean36 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean21 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean18 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean29 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean22 = false;
		this.aBoolean34 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean20 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean33 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean27 = this.aBoolean20 & this.aBoolean33;
		OpenGL.glGetFloatv(2834, Static97.aFloatArray43, 0);
		this.aFloat4 = Static97.aFloatArray43[1];
		this.aFloat9 = Static97.aFloatArray43[0];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "(I)V")
	private void method419() {
		OpenGL.glViewport(this.anInt480, this.anInt498, this.anInt297, this.anInt414);
	}

	@OriginalMember(owner = "client!ag", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method413();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method395(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean37) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean37) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(III)V")
	public void method420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt503 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(8) boolean local8 = false;
		if (arg1 != this.anInt504) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local8 = true;
			this.anInt504 = arg1;
		}
		if (this.anInt488 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local8 = true;
			this.anInt488 = arg0;
		}
		if (local8) {
			this.anInt472 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIILclient!jaclib/memory/Buffer;I)Lclient!cw;")
	public Interface1 method421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Buffer arg2) {
		return (Interface1) (this.aBoolean26 ? new Class62_Sub1(this, arg1, arg2, arg0, false) : new Class14_Sub1(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(III)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt480 = arg1;
		this.anInt498 = arg0;
		this.method419();
		this.method450();
	}

	@OriginalMember(owner = "client!ag", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass209_Sub3_3.aFloat170 + (float) arg0 * this.aClass209_Sub3_3.aFloat169 + (float) arg1 * this.aClass209_Sub3_3.aFloat166 + (float) arg2 * this.aClass209_Sub3_3.aFloat172;
		if (local28 < (float) this.anInt476 || local28 > (float) this.anInt485) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) (((float) arg1 * this.aClass209_Sub3_3.aFloat163 + this.aClass209_Sub3_3.aFloat164 * (float) arg0 + this.aClass209_Sub3_3.aFloat167 * (float) arg2 + this.aClass209_Sub3_3.aFloat162) * (float) this.anInt478 / local28);
		@Pc(117) int local117 = (int) ((this.aClass209_Sub3_3.aFloat171 + (float) arg2 * this.aClass209_Sub3_3.aFloat168 + (float) arg0 * this.aClass209_Sub3_3.aFloat165 + this.aClass209_Sub3_3.aFloat161 * (float) arg1) * (float) this.anInt491 / local28);
		arg3[0] = (int) ((float) local85 - this.aFloat10);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local117 - this.aFloat21);
	}

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "(B)V")
	private void method423() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt500; local7++) {
			@Pc(14) Class1_Sub5 local14 = this.aClass1_Sub5Array1[local7];
			Static537.aFloatArray69[0] = local14.method4159();
			@Pc(25) int local25 = local7 + 16386;
			Static537.aFloatArray69[1] = local14.method4163();
			Static537.aFloatArray69[2] = local14.method4158();
			Static537.aFloatArray69[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static537.aFloatArray69, 0);
			@Pc(54) int local54 = local14.method4165();
			@Pc(60) float local60 = local14.method4160() / 255.0F;
			Static537.aFloatArray69[1] = local60 * (float) (local54 >> 8 & 0xFF);
			Static537.aFloatArray69[2] = local60 * (float) (local54 & 0xFF);
			Static537.aFloatArray69[0] = (float) (local54 >> 16 & 0xFF) * local60;
			OpenGL.glLightfv(local25, 4609, Static537.aFloatArray69, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method4162() * local14.method4162()));
			OpenGL.glEnable(local25);
		}
		while (this.anInt479 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt479 = this.anInt500;
	}

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "()V")
	@Override
	protected void method6414() {
		for (@Pc(6) Class1 local6 = this.aClass361_5.method7854(); local6 != null; local6 = this.aClass361_5.method7853()) {
			((Class1_Sub11_Sub1) local6).method4180();
		}
		if (this.aClass239_1 != null) {
			this.aClass239_1.method5509();
		}
		if (this.anOpenGL1 != null) {
			this.method394();
			@Pc(40) Enumeration local40 = this.aHashtable2.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable2.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean11) {
			Static425.method5943(false, true);
			this.aBoolean11 = false;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!na;I)V")
	public void method424(@OriginalArg(0) Interface17 arg0) {
		if (this.aBoolean20) {
			this.method374(arg0);
			this.method427(arg0);
		} else if (this.anInt466 < 3) {
			if (this.anInt466 >= 0) {
				this.anInterface17Array1[this.anInt466].method3779();
			}
			this.anInterface17_1 = this.anInterface17_2 = this.anInterface17Array1[++this.anInt466] = arg0;
			this.anInterface17_1.method3778();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ag", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(41) float local41;
		if (this.aClass52_Sub1_Sub1_3 == null || this.aClass52_Sub1_Sub1_3.anInt1670 < arg2 || this.aClass52_Sub1_Sub1_3.anInt1667 < arg3) {
			this.aClass52_Sub1_Sub1_3 = Static463.method6577(arg6, arg2, arg3, this);
			this.aClass52_Sub1_Sub1_3.method1504(false, false);
			local41 = this.aClass52_Sub1_Sub1_3.aFloat36;
			local45 = this.aClass52_Sub1_Sub1_3.aFloat35;
		} else {
			this.aClass52_Sub1_Sub1_3.method1501(arg2, arg6, 6406, false, arg3);
			local41 = (float) arg2 * this.aClass52_Sub1_Sub1_3.aFloat36 / (float) this.aClass52_Sub1_Sub1_3.anInt1670;
			local45 = this.aClass52_Sub1_Sub1_3.aFloat35 * (float) arg3 / (float) this.aClass52_Sub1_Sub1_3.anInt1667;
		}
		this.method380();
		this.method378(this.aClass52_Sub1_Sub1_3);
		this.method395(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method375(arg5);
		this.method420(34165, 34165);
		this.method387(0, 768, 34166);
		this.method387(2, 770, 5890);
		this.method388(0, 34166);
		this.method388(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = local147 + (float) arg2;
		@Pc(160) float local160 = local150 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local147, local160);
		OpenGL.glTexCoord2f(local45, local41);
		OpenGL.glVertex2f(local155, local160);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method387(0, 768, 5890);
		this.method387(2, 770, 34166);
		this.method388(0, 5890);
		this.method388(2, 34166);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!vh;II)V")
	public void method425(@OriginalArg(0) int arg0, @OriginalArg(2) Interface23 arg1, @OriginalArg(4) int arg2) {
		@Pc(13) int local13 = arg1.method7763();
		@Pc(20) int local20 = arg0 * this.method417(local13);
		this.method410(arg1);
		OpenGL.glDrawElements(4, arg2, local13, arg1.method7766() + (long) local20);
	}

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "(I)V")
	private void method426() {
		Static97.aFloatArray43[1] = this.aFloat13 * this.aFloat12;
		Static97.aFloatArray43[3] = 1.0F;
		Static97.aFloatArray43[2] = this.aFloat1 * this.aFloat13;
		Static97.aFloatArray43[0] = this.aFloat14 * this.aFloat13;
		OpenGL.glLightModelfv(2899, Static97.aFloatArray43, 0);
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)Lclient!e;")
	@Override
	public Class1_Sub11 method6403(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub11_Sub1 local8 = new Class1_Sub11_Sub1(arg0);
		this.aClass361_5.method7855(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(Lclient!na;I)V")
	public void method427(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt465 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt465 >= 0) {
			this.anInterface17Array3[this.anInt465].method3780();
		}
		this.anInterface17_2 = this.anInterface17Array3[++this.anInt465] = arg0;
		this.anInterface17_2.method3782();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!fe;Lclient!fe;ILclient!fe;Lclient!fe;)V")
	public void method428(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(3) Class97 arg2, @OriginalArg(4) Class97 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method408(arg0.anInterface1_4);
			OpenGL.glVertexPointer(arg0.aByte39, arg0.aShort34, this.anInterface1_1.method1697(), this.anInterface1_1.method1696() + (long) arg0.aByte38);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method408(arg1.anInterface1_4);
			OpenGL.glNormalPointer(arg1.aShort34, this.anInterface1_1.method1697(), this.anInterface1_1.method1696() + (long) arg1.aByte38);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method408(arg2.anInterface1_4);
			OpenGL.glColorPointer(arg2.aByte39, arg2.aShort34, this.anInterface1_1.method1697(), this.anInterface1_1.method1696() + (long) arg2.aByte38);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method408(arg3.anInterface1_4);
			OpenGL.glTexCoordPointer(arg3.aByte39, arg3.aShort34, this.anInterface1_1.method1697(), this.anInterface1_1.method1696() + (long) arg3.aByte38);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "(B)V")
	public void method429() {
		if (this.anInt495 != 0) {
			this.anInt495 = 0;
			this.anInt472 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class200 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class200_Sub3 local6 = (Class200_Sub3) arg5;
		@Pc(9) Class52_Sub1_Sub1 local9 = local6.aClass52_Sub1_Sub1_5;
		this.method380();
		this.method378(local6.aClass52_Sub1_Sub1_5);
		this.method395(1);
		this.method420(8448, 7681);
		this.method387(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat36 / (float) local9.anInt1673;
		@Pc(46) float local46 = local9.aFloat35 / (float) local9.anInt1672;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(58) float local58 = (float) arg3 - (float) arg1;
		@Pc(71) float local71 = (float) (1.0D / Math.sqrt((double) (local58 * local58 + local52 * local52)));
		@Pc(75) float local75 = local52 * local71;
		@Pc(79) float local79 = local58 * local71;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f(local75 + (float) arg2 + 0.35F, local79 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method387(0, 768, 5890);
	}

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "(I)V")
	private void method430() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray3, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFFIF)V")
	public void method431(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static97.aFloatArray43[3] = arg0;
		Static97.aFloatArray43[2] = arg2;
		Static97.aFloatArray43[0] = arg3;
		Static97.aFloatArray43[1] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static97.aFloatArray43, 0);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6433() {
		this.method413();
		this.method395(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "()Lclient!aa;")
	@Override
	public Class2 method6419() {
		@Pc(7) int local7 = -1;
		if (this.aString9.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString9.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString9.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class2(local7, "OpenGL", this.anInt505, this.aString10, 0L);
	}

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "()Lclient!q;")
	@Override
	public Class209 method6417() {
		return this.aClass209_Sub3_3;
	}

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "(I)Lclient!d;")
	public Class52_Sub2 method432() {
		return this.aClass36_Sub2_1 == null ? null : this.aClass36_Sub2_1.method5045();
	}

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "(B)V")
	private void method433() {
		@Pc(6) float[] local6 = this.aFloatArray3;
		@Pc(18) float local18 = (float) (this.anInt476 * -this.anInt490) / (float) this.anInt478;
		@Pc(37) float local37 = (float) (this.anInt476 * (this.anInt297 - this.anInt490)) / (float) this.anInt478;
		@Pc(48) float local48 = (float) (this.anInt476 * this.anInt493) / (float) this.anInt491;
		@Pc(63) float local63 = (float) ((this.anInt493 - this.anInt414) * this.anInt476) / (float) this.anInt491;
		if (local37 == local18 || local48 == local63) {
			local6[9] = 0.0F;
			local6[6] = 0.0F;
			local6[14] = 0.0F;
			local6[7] = 0.0F;
			local6[10] = 1.0F;
			local6[11] = 0.0F;
			local6[8] = 0.0F;
			local6[15] = 1.0F;
			local6[12] = 0.0F;
			local6[3] = 0.0F;
			local6[2] = 0.0F;
			local6[5] = 1.0F;
			local6[0] = 1.0F;
			local6[4] = 0.0F;
			local6[13] = 0.0F;
			local6[1] = 0.0F;
		} else {
			@Pc(77) float local77 = (float) this.anInt476 * 2.0F;
			local6[2] = 0.0F;
			local6[12] = 0.0F;
			local6[0] = local77 / (local37 - local18);
			local6[13] = 0.0F;
			local6[5] = local77 / (local48 - local63);
			local6[11] = -1.0F;
			local6[1] = 0.0F;
			local6[9] = (local48 + local63) / (-local63 + local48);
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[15] = 0.0F;
			local6[7] = 0.0F;
			local6[8] = (local37 + local18) / (local37 - local18);
			local6[6] = 0.0F;
			local6[14] = this.aFloat3 = -(local77 * (float) this.anInt485) / (float) (this.anInt485 - this.anInt476);
			local6[10] = this.aFloat17 = (float) -(this.anInt485 + this.anInt476) / (float) (this.anInt485 - this.anInt476);
		}
		this.method445();
	}

	@OriginalMember(owner = "client!ag", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method404(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6437(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas1 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable2.containsKey(arg0)) {
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
			this.aHashtable2.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "()Z")
	@Override
	public boolean method6411() {
		return this.aBoolean37 && (!this.method6451() || this.aBoolean27);
	}

	@OriginalMember(owner = "client!ag", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.method395(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ag", name = "L", descriptor = "()V")
	@Override
	public void L() {
		this.aBoolean28 = false;
	}

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "(II)V")
	public synchronized void method434(@OriginalArg(0) int arg0) {
		@Pc(14) Class1 local14 = new Class1();
		local14.aLong425 = arg0;
		this.aClass361_11.method7855(local14);
	}

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "(I)V")
	private void method435() {
		if (this.aBoolean38 && this.anInt494 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ag", name = "B", descriptor = "()Z")
	@Override
	public boolean method6473() {
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!aga;[Lclient!tq;Z)Lclient!la;")
	@Override
	public Class35 method6457(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class318[] arg1) {
		return new Class35_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(IZ)V")
	public void method436(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean17) {
			this.aBoolean17 = arg0;
			this.method389();
		}
	}

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt414 - local12 - arg1, arg2, 1, 32993, this.anInt482, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "(B)V")
	private void method438() {
		if (this.anInt495 != 2) {
			this.anInt495 = 2;
			this.method430();
			this.method440();
			this.anInt472 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "()Lclient!q;")
	@Override
	public Class209 method6441() {
		return this.aClass209_Sub3_1;
	}

	@OriginalMember(owner = "client!ag", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 > this.anInt414) {
			arg3 = this.anInt414;
		}
		if (arg2 > this.anInt297) {
			arg2 = this.anInt297;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt483 = arg2;
		this.anInt486 = arg1;
		this.anInt506 = arg3;
		this.anInt497 = arg0;
		OpenGL.glEnable(3089);
		this.method451();
		this.method450();
	}

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "(B)V")
	private void method439() {
		@Pc(15) float local15 = this.aFloat7 * (float) -this.anInt490 / (float) this.anInt478;
		@Pc(33) float local33 = (float) -this.anInt493 * this.aFloat7 / (float) this.anInt491;
		@Pc(48) float local48 = this.aFloat7 * (float) (this.anInt297 - this.anInt490) / (float) this.anInt478;
		@Pc(63) float local63 = this.aFloat7 * (float) (this.anInt414 - this.anInt493) / (float) this.anInt491;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local48 && local63 != local33) {
			OpenGL.glOrtho((double) local15, (double) local48, (double) -local63, (double) -local33, (double) this.anInt476, (double) this.anInt485);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
	@Override
	public void method6398(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ag", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass209_Sub3_3.aFloat170 + (float) arg2 * this.aClass209_Sub3_3.aFloat172 + (float) arg1 * this.aClass209_Sub3_3.aFloat166 + (float) arg0 * this.aClass209_Sub3_3.aFloat169;
		if ((float) this.anInt476 > local28 || local28 > (float) this.anInt485) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass209_Sub3_3.aFloat164 * (float) arg0 + this.aClass209_Sub3_3.aFloat163 * (float) arg1 + (float) arg2 * this.aClass209_Sub3_3.aFloat167 + this.aClass209_Sub3_3.aFloat162) * (float) this.anInt478 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt491 * (this.aClass209_Sub3_3.aFloat171 + this.aClass209_Sub3_3.aFloat168 * (float) arg2 + this.aClass209_Sub3_3.aFloat165 * (float) arg0 + (float) arg1 * this.aClass209_Sub3_3.aFloat161) / local28);
		if ((float) local85 >= this.aFloat10 && this.aFloat5 >= (float) local85 && (float) local117 >= this.aFloat21 && this.aFloat2 >= (float) local117) {
			arg3[0] = (int) ((float) local85 - this.aFloat10);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat21);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "(I)V")
	private void method440() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass209_Sub3_4.method5489(), 0);
		if (this.aBoolean41) {
			this.aClass269_1.aClass7_Sub2_1.method1738();
		}
		this.method385();
		this.method423();
	}

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(6) int local6 = this.anInt508;
		this.anInt508 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFI)V")
	public void method441(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat6 = arg1;
		this.aFloat20 = arg0;
		this.method452();
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(IIII)V")
	public void method442(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)I")
	@Override
	public int method6467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "(I)V")
	public void method443() {
		if (this.anInt472 == 4) {
			return;
		}
		this.method393();
		this.method381(false);
		this.method454(false);
		this.method390(false);
		this.method404(false);
		this.method444(-2);
		this.method395(1);
		this.anInt472 = 4;
	}

	@OriginalMember(owner = "client!ag", name = "C", descriptor = "()Z")
	@Override
	public boolean method6474() {
		return false;
	}

	@OriginalMember(owner = "client!ag", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class200_Sub3 local6 = (Class200_Sub3) arg1;
		@Pc(9) Class52_Sub1_Sub1 local9 = local6.aClass52_Sub1_Sub1_5;
		this.method380();
		this.method378(local6.aClass52_Sub1_Sub1_5);
		this.method395(1);
		this.method420(8448, 7681);
		this.method387(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat36 / (float) local9.anInt1673;
		@Pc(46) float local46 = local9.aFloat35 / (float) local9.anInt1672;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt497 - arg2) * local39, (float) (this.anInt486 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt497, this.anInt486);
		OpenGL.glTexCoord2f((float) (this.anInt497 - arg2) * local39, (float) (this.anInt506 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt497, this.anInt506);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt483 - arg2), (float) (this.anInt506 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt483, this.anInt506);
		OpenGL.glTexCoord2f((float) (this.anInt483 - arg2) * local39, local46 * (float) (this.anInt486 - arg3));
		OpenGL.glVertex2i(this.anInt483, this.anInt486);
		OpenGL.glEnd();
		this.method387(0, 768, 5890);
	}

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "()V")
	@Override
	public void method6472() {
	}

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "(II)V")
	public void method444(@OriginalArg(0) int arg0) {
		this.method397(arg0, true);
	}

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "(B)V")
	private void method445() {
		this.aFloatArray3[14] = this.aFloat3;
		this.aFloatArray3[10] = this.aFloat17;
		this.aFloat16 = ((float) -this.anInt485 + this.aFloatArray3[14]) / this.aFloatArray3[10];
		this.aFloat8 = this.anInt485;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(Lclient!na;I)V")
	public void method446(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt465 < 0 || arg0 != this.anInterface17Array3[this.anInt465]) {
			throw new RuntimeException();
		}
		this.anInterface17Array3[this.anInt465--] = null;
		arg0.method3780();
		if (this.anInt465 >= 0) {
			this.anInterface17_2 = this.anInterface17Array3[this.anInt465];
			this.anInterface17_2.method3782();
		} else {
			this.anInterface17_2 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "(I)V")
	private void method447() {
		this.aClass52Array1 = new Class52[this.anInt492];
		this.aClass52_Sub1_2 = new Class52_Sub1(this, 3553, 6408, 1, 1);
		new Class52_Sub1(this, 3553, 6408, 1, 1);
		new Class52_Sub1(this, 3553, 6408, 1, 1);
		this.aClass61_Sub3_1 = new Class61_Sub3(this);
		this.aClass61_Sub3_3 = new Class61_Sub3(this);
		this.aClass61_Sub3_4 = new Class61_Sub3(this);
		this.aClass61_Sub3_10 = new Class61_Sub3(this);
		this.aClass61_Sub3_5 = new Class61_Sub3(this);
		this.aClass61_Sub3_9 = new Class61_Sub3(this);
		this.aClass61_Sub3_8 = new Class61_Sub3(this);
		this.aClass61_Sub3_7 = new Class61_Sub3(this);
		this.aClass61_Sub3_2 = new Class61_Sub3(this);
		this.aClass61_Sub3_6 = new Class61_Sub3(this);
		if (this.aBoolean34) {
			this.aClass161_2 = new Class161(this);
			new Class161(this);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([I)V")
	@Override
	public void method6430(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt414;
		arg0[0] = this.anInt297;
	}

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "()Z")
	@Override
	public boolean method6413() {
		return this.aClass269_1.method6303();
	}

	@OriginalMember(owner = "client!ag", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method413();
		this.method395(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "(B)V")
	private void method448() {
		this.method444(-2);
		for (@Pc(14) int local14 = this.anInt492 - 1; local14 >= 0; local14--) {
			this.method376(local14);
			this.method378(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method420(8448, 8448);
		this.method387(2, 770, 34168);
		this.method412();
		this.anInt471 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt473 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean12 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean15 = true;
		this.method381(true);
		this.method454(true);
		this.method390(true);
		this.method404(true);
		this.method429();
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
		@Pc(126) float[] local126 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(139) int local139 = 0; local139 < 8; local139++) {
			@Pc(145) int local145 = local139 + 16384;
			OpenGL.glLightfv(local145, 4608, local126, 0);
			OpenGL.glLightf(local145, 4615, 0.0F);
			OpenGL.glLightf(local145, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt502 = this.anInt474 = -1;
		this.JA();
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt497 || arg0 - arg2 > this.anInt483 || this.anInt486 > arg1 + arg2 || arg1 - arg2 > this.anInt506) {
			return;
		}
		this.method413();
		this.method395(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(69) float local69 = (float) arg0 + 0.35F;
		@Pc(74) float local74 = (float) arg1 + 0.35F;
		@Pc(78) int local78 = arg2 << 1;
		if (this.aFloat9 > (float) local78) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local69 + 1.0F, local74 + 1.0F);
			OpenGL.glVertex2f(local69 + 1.0F, -1.0F + local74);
			OpenGL.glVertex2f(local69 - 1.0F, local74 - 1.0F);
			OpenGL.glVertex2f(local69 - 1.0F, local74 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat4 >= (float) local78) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local78);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local69, local74);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local69, local74);
			@Pc(133) int local133 = 262144 / (arg2 * 6);
			if (local133 <= 64) {
				local133 = 64;
			} else if (local133 > 512) {
				local133 = 512;
			}
			local133 = Static549.method7478(local133);
			OpenGL.glVertex2f((float) arg2 + local69, local74);
			for (@Pc(162) int local162 = 16384 - local133; local162 > 0; local162 -= local133) {
				OpenGL.glVertex2f((float) arg2 * Class341.aFloatArray71[local162] + local69, local74 + Class341.aFloatArray70[local162] * (float) arg2);
			}
			OpenGL.glVertex2f((float) arg2 + local69, local74);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()Z")
	@Override
	public boolean method6397() {
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "(B)V")
	private void method449() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL1.a()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static423.method5918(1000L);
		}
	}

	@OriginalMember(owner = "client!ag", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt490 = arg0;
		this.anInt493 = arg1;
		this.anInt478 = arg2;
		this.anInt491 = arg3;
		this.method433();
		this.method451();
		if (this.anInt495 == 3) {
			this.method439();
		} else if (this.anInt495 == 2) {
			this.method430();
			return;
		}
	}

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method413();
		this.method395(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "(I)V")
	private void method450() {
		if (this.anInt497 <= this.anInt483 && this.anInt486 <= this.anInt506) {
			OpenGL.glScissor(this.anInt480 + this.anInt497, this.anInt414 + (this.anInt498 - this.anInt506), this.anInt483 - this.anInt497, this.anInt506 + -this.anInt486);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class10 method6470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class10_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ag", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt502 != arg0;
		if (local15 || arg1 != this.aFloat19 || this.aFloat18 != arg2) {
			this.anInt502 = arg0;
			this.aFloat19 = arg1;
			this.aFloat18 = arg2;
			if (local15) {
				this.aFloat12 = (float) (this.anInt502 & 0xFF00) / 65280.0F;
				this.aFloat14 = (float) (this.anInt502 & 0xFF0000) / 1.671168E7F;
				this.aFloat1 = (float) (this.anInt502 & 0xFF) / 255.0F;
				this.method426();
			}
			this.method406();
		}
		if (arg3 == this.aFloatArray5[0] && this.aFloatArray5[1] == arg4 && arg5 == this.aFloatArray5[2]) {
			return;
		}
		this.aFloatArray5[0] = arg3;
		this.aFloatArray5[2] = arg5;
		this.aFloatArray5[1] = arg4;
		this.aFloatArray1[1] = -arg4;
		this.aFloatArray1[0] = -arg3;
		this.aFloatArray1[2] = -arg5;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray2[0] = local142 * arg3;
		this.aFloatArray2[1] = arg4 * local142;
		this.aFloatArray2[2] = arg5 * local142;
		this.aFloatArray4[2] = -this.aFloatArray2[2];
		this.aFloatArray4[0] = -this.aFloatArray2[0];
		this.aFloatArray4[1] = -this.aFloatArray2[1];
		this.method385();
		this.anInt496 = (int) (arg5 * 256.0F / arg4);
		this.anInt501 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ag", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean24 = arg0;
		this.method386();
	}

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "(I)V")
	private void method451() {
		this.aFloat2 = this.anInt506 - this.anInt493;
		this.aFloat10 = this.anInt497 - this.anInt490;
		this.aFloat5 = this.anInt483 - this.anInt490;
		this.aFloat21 = this.anInt486 - this.anInt493;
	}

	@OriginalMember(owner = "client!ag", name = "z", descriptor = "(I)V")
	private void method452() {
		this.aFloat11 = (float) (this.anInt485 - this.anInt475) - this.aFloat20;
		this.aFloat15 = this.aFloat11 - (float) this.anInt494 * this.aFloat6;
		if ((float) this.anInt476 > this.aFloat15) {
			this.aFloat15 = this.anInt476;
		}
		OpenGL.glFogf(2915, this.aFloat15);
		OpenGL.glFogf(2916, this.aFloat11);
		Static97.aFloatArray43[1] = (float) (this.anInt474 & 0xFF00) / 65280.0F;
		Static97.aFloatArray43[0] = (float) (this.anInt474 & 0xFF0000) / 1.671168E7F;
		Static97.aFloatArray43[2] = (float) (this.anInt474 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static97.aFloatArray43, 0);
	}

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "(I)V")
	public void method453() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)V")
	public void method454(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean31 != arg0) {
			this.aBoolean31 = arg0;
			this.method389();
			this.anInt472 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ag", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(6) int local6 = this.anInt507;
		this.anInt507 = 0;
		return local6;
	}
}
